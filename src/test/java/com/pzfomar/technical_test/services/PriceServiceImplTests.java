package com.pzfomar.technical_test.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.pzfomar.technical_test.application.service.PriceServiceImpl;
import com.pzfomar.technical_test.domain.enums.CurrencyEnum;
import com.pzfomar.technical_test.domain.model.Price;
import com.pzfomar.technical_test.domain.repository.PriceRepository;

/**
 * The Class PriceServiceTests.
 */
@ExtendWith(MockitoExtension.class)
public class PriceServiceImplTests {

	/** The price repository. */
	@Mock
	private PriceRepository priceRepository;

	/** The price service. */
	@InjectMocks
	private PriceServiceImpl priceService;

	/**
	 * Calculate all.
	 */
	@Test
	public void calculateNotNull() {
		Date date = new Date();
		Mockito.when(priceRepository.findAllByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(1, 1, date, date))
			.thenReturn(List.of(Price.builder()
					.brandId(1)
					.startDate(new Date())
					.endDate(new Date())
					.priceList(1)
					.productId(1)
					.priority(0)
					.price(1D)
					.currency(CurrencyEnum.EUR)
					.lastUpdate(new Date())
					.lastUpdateBy("1")
					.build()));
		assertNotNull(priceService.calculate(date, 1, 1));
	}
}
