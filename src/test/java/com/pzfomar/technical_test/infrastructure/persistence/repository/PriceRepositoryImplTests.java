package com.pzfomar.technical_test.infrastructure.persistence.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.pzfomar.technical_test.infrastructure.persistence.entity.PriceEntity;

/**
 * The Class PriceRepositoryImplTests.
 */
@ExtendWith(MockitoExtension.class)
public class PriceRepositoryImplTests {

	/** The price crud repository. */
	@Mock
	private PriceJpaRepository priceCrudRepository;

	/** The price repository. */
	@InjectMocks
	private PriceRepositoryImpl priceRepository;
	
	/**
	 * Find all by product id and brand id and start date less than equal and end date greater than equal test.
	 */
	@Test
	public void findAllByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualTest() {
		Date date = new Date();
		Mockito.when(this.priceCrudRepository.findAllByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(1, 1, date, date))
			.thenReturn(List.of(PriceEntity.builder()
					.brandId(1)
					.startDate(new Date())
					.endDate(new Date())
					.priceList(1)
					.productId(1)
					.priority(0)
					.price(1D)
					.currency("EUR")
					.lastUpdate(new Date())
					.lastUpdateBy("1")
					.build()));
		assertNotNull(this.priceRepository.findAllByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(1, 1, date, date));
	}
}
