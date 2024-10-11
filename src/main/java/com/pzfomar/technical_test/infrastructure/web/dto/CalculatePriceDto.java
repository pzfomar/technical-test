package com.pzfomar.technical_test.infrastructure.web.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class CalculatePriceDto.
 */
@Setter
@Getter

/**
 * The Class CalculatePriceDtoBuilder.
 */
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CalculatePriceDto {

	/** The product id. */
	@JsonProperty("product_id")
	private Integer productId;
    
	/** The brand id. */
	@JsonProperty("brand_id")
    private Integer brandId;
	
	/** The rate apply. */
	@JsonProperty("rate_apply")
	private Double rateApply;

	/** The application date. */
	@JsonProperty("application_date")
    @JsonFormat(pattern="yyyy-MM-dd-HH:mm:ss")
	private Date applicationDate;
	
	/** The final price apply. */
	@JsonProperty("final_price_apply")
	private Double finalPriceApply;	
}
