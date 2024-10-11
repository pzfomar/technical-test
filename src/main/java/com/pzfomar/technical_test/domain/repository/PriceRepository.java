package com.pzfomar.technical_test.domain.repository;

import java.util.Date;
import java.util.List;

import com.pzfomar.technical_test.domain.model.Price;

/**
 * The Interface PriceRepository.
 */
public interface PriceRepository {
	
	/**
	 * Find all by product id and brand id and start date less than equal and end date greater than equal.
	 *
	 * @param productId the product id
	 * @param brandId the brand id
	 * @param startDate the start date
	 * @param endDate the end date
	 * @return the list
	 */
	List<Price> findAllByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(Integer productId, Integer brandId, Date startDate, Date endDate);
}
