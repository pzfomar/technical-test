package com.pzfomar.technical_test.application.service;

import java.util.Date;

import com.pzfomar.technical_test.infrastructure.web.dto.CalculatePriceDto;

/**
 * The Interface IPriceService.
 */
public interface PriceService {

	/**
	 * Calculate.
	 *
	 * @param applicationDate the application date
	 * @param productId the product id
	 * @param brandId the brand id
	 * @return the calculate all price dto
	 */
	CalculatePriceDto calculate(Date applicationDate, Integer productId, Integer brandId);
}
