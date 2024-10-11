package com.pzfomar.technical_test.infrastructure.web.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.pzfomar.technical_test.application.service.PriceServiceImpl;
import com.pzfomar.technical_test.infrastructure.web.dto.CalculatePriceDto;

/**
 * The Class PriceControllerTests.
 */
@ExtendWith(MockitoExtension.class)
class PriceControllerTests {

	/** The price service. */
	@Mock
	private PriceServiceImpl priceService;

	/** The price controller. */
	@InjectMocks
	private PriceController priceController;
	
	/**
	 * Calculate test.
	 */
	@Test
	void calculateTest() {
		Date date = new Date();
		Mockito.when(priceService.calculate(date, 1, 1))
			.thenReturn(CalculatePriceDto.builder()
					.applicationDate(date)
					.brandId(1)
					.productId(1)
					.finalPriceApply(1D)
					.rateApply(1D)
					.build());
		assertNotNull(priceController.calculate(date, 1, 1));
	}

}
