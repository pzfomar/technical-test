package com.pzfomar.technical_test.infrastructure.web.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

import com.pzfomar.technical_test.infrastructure.web.dto.CalculatePriceDto;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class PriceRestTests.
 */
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
@Slf4j
class PriceRestTests {

	/** The server. */
	private final String SERVER = "http://localhost:";

	/** The path. */
	private final String PATH = "/api/v1/price/calculate.json";

	/** The port. */
	@LocalServerPort
	private int PORT;

	/** The rest template. */
	@Autowired
	private TestRestTemplate restTemplate;

	/**
	 * Test 1.
	 */
	@Test
	void test1() {
		log.info("\n\nTest 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		String urlTemplate = UriComponentsBuilder
				.fromHttpUrl(this.SERVER + this.PORT + this.PATH)
		        .queryParam("application_date", "2020-06-14-10:00:00")
		        .queryParam("product_id", 35455)
		        .queryParam("brand_id", 1)
		        .encode()
		        .toUriString();
		log.info("urlTemplate:{}", urlTemplate);
		ResponseEntity<CalculatePriceDto> response = this.restTemplate.exchange(urlTemplate, 
				HttpMethod.GET, 
				new HttpEntity<>(headers), 
				CalculatePriceDto.class);
		assertNotNull(response.getBody());
		log.info(response.toString());
		assertEquals(response.getStatusCode(), HttpStatus.OK);
	}

	/**
	 * Test 2.
	 */
	@Test
	void test2() {
		log.info("\n\nTest 2: petición a las 16:00 del día 14 del producto 35455 para la brand 1");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		String urlTemplate = UriComponentsBuilder
				.fromHttpUrl(this.SERVER + this.PORT + this.PATH)
		        .queryParam("application_date", "2020-06-14-16:00:00")
		        .queryParam("product_id", 35455)
		        .queryParam("brand_id", 1)
		        .encode()
		        .toUriString();
		log.info("urlTemplate:{}", urlTemplate);
		ResponseEntity<CalculatePriceDto> response = this.restTemplate.exchange(urlTemplate, 
				HttpMethod.GET, 
				new HttpEntity<>(headers), 
				CalculatePriceDto.class);
		assertNotNull(response.getBody());
		log.info(response.toString());
		assertEquals(response.getStatusCode(), HttpStatus.OK);
	}

	/**
	 * Test 3.
	 */
	@Test
	void test3() {
		log.info("\n\nTest 3: petición a las 21:00 del día 14 del producto 35455 para la brand 1");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		String urlTemplate = UriComponentsBuilder
				.fromHttpUrl(this.SERVER + this.PORT + this.PATH)
		        .queryParam("application_date", "2020-06-14-21:00:00")
		        .queryParam("product_id", 35455)
		        .queryParam("brand_id", 1)
		        .encode()
		        .toUriString();
		log.info("urlTemplate:{}", urlTemplate);
		ResponseEntity<CalculatePriceDto> response = this.restTemplate.exchange(urlTemplate, 
				HttpMethod.GET, 
				new HttpEntity<>(headers), 
				CalculatePriceDto.class);
		assertNotNull(response.getBody());
		log.info(response.toString());
		assertEquals(response.getStatusCode(), HttpStatus.OK);
	}

	/**
	 * Test 4.
	 */
	@Test
	void test4() {
		log.info("\n\nTest 4: petición a las 10:00 del día 15 del producto 35455 para la brand 1");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		String urlTemplate = UriComponentsBuilder
				.fromHttpUrl(this.SERVER + this.PORT + this.PATH)
		        .queryParam("application_date", "2020-06-15-10:00:00")
		        .queryParam("product_id", 35455)
		        .queryParam("brand_id", 1)
		        .encode()
		        .toUriString();
		log.info("urlTemplate:{}", urlTemplate);
		ResponseEntity<CalculatePriceDto> response = this.restTemplate.exchange(urlTemplate, 
				HttpMethod.GET, 
				new HttpEntity<>(headers), 
				CalculatePriceDto.class);
		assertNotNull(response.getBody());
		log.info(response.toString());
		assertEquals(response.getStatusCode(), HttpStatus.OK);
	}

	/**
	 * Test 5.
	 */
	@Test
	void test5() {
		log.info("\n\nTest 5: petición a las 21:00 del día 16 del producto 35455 para la brand 1");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		String urlTemplate = UriComponentsBuilder
				.fromHttpUrl(this.SERVER + this.PORT + this.PATH)
		        .queryParam("application_date", "2020-06-16-21:00:00")
		        .queryParam("product_id", 35455)
		        .queryParam("brand_id", 1)
		        .encode()
		        .toUriString();
		log.info("urlTemplate:{}", urlTemplate);
		ResponseEntity<CalculatePriceDto> response = this.restTemplate.exchange(urlTemplate, 
				HttpMethod.GET, 
				new HttpEntity<>(headers), 
				CalculatePriceDto.class);
		assertNotNull(response.getBody());
		log.info(response.toString());
		assertEquals(response.getStatusCode(), HttpStatus.OK);
	}
	
	@Test
	void testError() {
		log.info("\n\nTest Error");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		String urlTemplate = UriComponentsBuilder
				.fromHttpUrl(this.SERVER + this.PORT + this.PATH)
		        .queryParam("application_date", "2020-06-16 21:00:00")
		        .queryParam("brand_id", 1)
		        .encode()
		        .toUriString();
		log.info("urlTemplate:{}", urlTemplate);
		ResponseEntity<CalculatePriceDto> response = this.restTemplate.exchange(urlTemplate, 
				HttpMethod.GET, 
				new HttpEntity<>(headers), 
				CalculatePriceDto.class);
		log.info(response.toString());
		assertEquals(response.getStatusCode(), HttpStatus.BAD_REQUEST);
	}
}
