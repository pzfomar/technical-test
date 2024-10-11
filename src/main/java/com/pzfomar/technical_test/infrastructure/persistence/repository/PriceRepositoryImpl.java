package com.pzfomar.technical_test.infrastructure.persistence.repository;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pzfomar.technical_test.domain.model.Price;
import com.pzfomar.technical_test.domain.repository.PriceRepository;
import com.pzfomar.technical_test.infrastructure.persistence.mapper.PriceEntityMapper;

/**
 * The Class PriceRepositoryImpl.
 */
@Service
public class PriceRepositoryImpl implements PriceRepository {
	
	/** The price crud repository. */
	@Autowired
	private PriceJpaRepository priceCrudRepository;

	/**
	 * Find all by product id and brand id and start date less than equal and end date greater than equal.
	 *
	 * @param productId the product id
	 * @param brandId the brand id
	 * @param startDate the start date
	 * @param endDate the end date
	 * @return the list
	 */
	@Override
	public List<Price> findAllByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(Integer productId, Integer brandId, Date startDate, Date endDate) {
		return PriceEntityMapper.toDomain(this.priceCrudRepository.findAllByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(productId, brandId, startDate, endDate));
	}
}
