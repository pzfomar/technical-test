package com.pzfomar.technical_test.infrastructure.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class PriceEntity.
 */
@Entity
@Table(name = "PRICES")

/**
 * The Class PriceEntityBuilder.
 */
@Setter
@Getter

/**
 * The Class PriceEntityBuilder.
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PriceEntity implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7056696190624350141L;

	/** The brand id. */
	@Column(nullable = false, name = "BRAND_ID")
	private Integer brandId;

	/** The start date. */
	@Column(nullable = false, name = "START_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;

	/** The end date. */
	@Column(nullable = false, name = "END_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

	/** The price list. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, name = "PRICE_LIST")
	private Integer priceList;

	/** The product id. */
	@Column(nullable = false, name = "PRODUCT_ID")
	private Integer productId;

	/** The priority. */
	@Column(nullable = false, name = "PRIORITY")
	private Integer priority;

	/** The price. */
	@Column(nullable = false, name = "PRICE")
	private Double price;

	/** The currency. */
	@Column(nullable = false, name = "CURR")
	private String currency;

	/** The last update. */
	@Column(name = "LAST_UPDATE", nullable = false)
	@LastModifiedDate
	private Date lastUpdate;

	/** The last update by. */
	@Column(name = "LAST_UPDATE_BY", nullable = false)
	@LastModifiedBy
	private String lastUpdateBy;
}