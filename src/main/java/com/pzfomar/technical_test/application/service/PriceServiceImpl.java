package com.pzfomar.technical_test.application.service;

import java.util.Comparator;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pzfomar.technical_test.domain.model.Price;
import com.pzfomar.technical_test.domain.repository.PriceRepository;
import com.pzfomar.technical_test.infrastructure.web.dto.CalculatePriceDto;
import com.pzfomar.technical_test.infrastructure.web.mapper.CalculatePriceDtoMapper;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class PriceService.
 */
@Service
@Slf4j
public class PriceServiceImpl implements PriceService {
	
	/** The price repository. */
	@Autowired
	private PriceRepository priceRepository;


	/**
	 * Calculate.
	 *
	 * @param applicationDate the application date
	 * @param productId the product id
	 * @param brandId the brand id
	 * @return the calculate all price dto
	 */
	@Override
	public CalculatePriceDto calculate(Date applicationDate, Integer productId, Integer brandId) {
		log.info("I enter the class:: {} ::in the method:: {}", "PriceService", "calculateAll");
		return CalculatePriceDtoMapper.toDto(this.priceRepository
				.findAllByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(productId, brandId, applicationDate, applicationDate)
				.parallelStream()
				.sorted(Comparator.comparing(Price::getPriority))
				.peek(price -> log.debug(price.toString()))
				.findFirst()
				.orElseThrow());
	}
}
