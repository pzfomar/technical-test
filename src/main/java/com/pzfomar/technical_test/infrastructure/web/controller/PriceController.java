package com.pzfomar.technical_test.infrastructure.web.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pzfomar.technical_test.application.service.PriceService;
import com.pzfomar.technical_test.infrastructure.web.dto.CalculatePriceDto;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class PriceController.
 */
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/v1/price")
@Slf4j
public class PriceController {
	
	/** The price service. */
	@Autowired
	private PriceService priceService;

	/**
	 * Calculate.
	 *
	 * @param applicationDate the application date
	 * @param productId the product id
	 * @param brandId the brand id
	 * @return the response entity
	 */
	@GetMapping("/calculate.json")
	public ResponseEntity<CalculatePriceDto> calculate(
			@RequestParam(required = true, name = "application_date") @DateTimeFormat(pattern="yyyy-MM-dd-HH:mm:ss") Date applicationDate,
			@RequestParam(required = true, name = "product_id") Integer productId,
			@RequestParam(required = true, name = "brand_id") Integer brandId) {
		log.info("The service is running:: /api/price/calculate");
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(this.priceService.calculate(applicationDate, productId, brandId));
	}
}
