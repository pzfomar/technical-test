package com.pzfomar.technical_test.domain.model;

import java.io.Serializable;
import java.util.Date;

import com.pzfomar.technical_test.domain.enums.CurrencyEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class Price.
 */
@Setter
@Getter

/**
 * The Class PriceBuilder.
 */

/**
 * The Class PriceBuilder.
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Price implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2185967937356571312L;

	/** The brand id. */
	private Integer brandId;

	/** The start date. */
	private Date startDate;

	/** The end date. */
	private Date endDate;

	/** The price list. */
	private Integer priceList;

	/** The product id. */
	private Integer productId;

	/** The priority. */
	private Integer priority;

	/** The price. */
	private Double price;

	/** The currency. */
	private CurrencyEnum currency;

	/** The last update. */
	private Date lastUpdate;

	/** The last update by. */
	private String lastUpdateBy;
}
