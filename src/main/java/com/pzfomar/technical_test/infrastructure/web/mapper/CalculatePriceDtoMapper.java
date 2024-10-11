package com.pzfomar.technical_test.infrastructure.web.mapper;

import com.pzfomar.technical_test.domain.model.Price;
import com.pzfomar.technical_test.infrastructure.web.dto.CalculatePriceDto;

/**
 * The Class CalculatePriceDtoMapper.
 */
public class CalculatePriceDtoMapper {

	/**
	 * To dto.
	 *
	 * @param price the price
	 * @return the calculate price dto
	 */
	public static CalculatePriceDto toDto(Price price) {
		return CalculatePriceDto.builder()
				.productId(price.getProductId())
				.brandId(price.getBrandId())
				.rateApply(price.getPrice())
				.applicationDate(price.getStartDate())
				.finalPriceApply(price.getPrice())
				.build();
	}
}
