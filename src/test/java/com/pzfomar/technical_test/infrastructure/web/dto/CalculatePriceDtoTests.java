package com.pzfomar.technical_test.infrastructure.web.dto;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

/**
 * The Class CalculatePriceDtoTests.
 */
class CalculatePriceDtoTests {

	/**
	 * Builder test.
	 */
	@Test
	void builderTest() {
		assertDoesNotThrow(() -> CalculatePriceDto.builder()
				.productId(1)
				.brandId(1)
				.rateApply(1D)
				.applicationDate(new Date())
				.finalPriceApply(1D)
				.build());
	}

	/**
	 * No args constructor test.
	 */
	@Test
	void noArgsConstructorTest() {
		assertDoesNotThrow(() -> {
			CalculatePriceDto calculatePriceDto = new CalculatePriceDto();
			calculatePriceDto.setApplicationDate(new Date());
			calculatePriceDto.getApplicationDate();
			calculatePriceDto.setBrandId(1);
			calculatePriceDto.getBrandId();
			calculatePriceDto.setFinalPriceApply(1D);
			calculatePriceDto.getFinalPriceApply();
			calculatePriceDto.setProductId(1);
			calculatePriceDto.getProductId();
			calculatePriceDto.setRateApply(1D);
			calculatePriceDto.getRateApply();
		});
	}

	/**
	 * All args constructor test.
	 */
	@Test
	void allArgsConstructorTest() {
		assertDoesNotThrow(() -> new CalculatePriceDto(1, 1, 1D, new Date(), 1D));
	}
}
