package com.pzfomar.technical_test.infrastructure.web.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.pzfomar.technical_test.domain.model.Price;

/**
 * The Class CalculatePriceDtoMapperTests.
 */
class CalculatePriceDtoMapperTests {

	/**
	 * To dto test.
	 */
	@Test
	void toDtoTest() {
		assertDoesNotThrow(() -> CalculatePriceDtoMapper.toDto(Price.builder().build()));
	}
}
