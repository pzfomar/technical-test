package com.pzfomar.technical_test.infrastructure.persistence.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.pzfomar.technical_test.domain.enums.CurrencyEnum;
import com.pzfomar.technical_test.domain.model.Price;
import com.pzfomar.technical_test.infrastructure.persistence.entity.PriceEntity;

/**
 * The Class PriceEntityMapper.
 */
public class PriceEntityMapper {

	/**
	 * To domain.
	 *
	 * @param priceEntity the price entity
	 * @return the price
	 */
	public static Price toDomain(PriceEntity priceEntity) {
		return Price.builder()
				.brandId(priceEntity.getBrandId())
				.startDate(priceEntity.getStartDate())
				.endDate(priceEntity.getEndDate())
				.priceList(priceEntity.getPriceList())
				.productId(priceEntity.getProductId())
				.priority(priceEntity.getPriority())
				.price(priceEntity.getPrice())
				.currency(CurrencyEnum.valueOf(priceEntity.getCurrency()))
				.lastUpdate(priceEntity.getLastUpdate())
				.lastUpdateBy(priceEntity.getLastUpdateBy())
				.build();
	}

	/**
	 * To domain.
	 *
	 * @param pricesEntity the prices entity
	 * @return the list
	 */
	public static List<Price> toDomain(List<PriceEntity> pricesEntity) {
		return pricesEntity
				.stream()
				.map(priceEntity -> toDomain(priceEntity))
				.collect(Collectors.toList());
	}

	/**
	 * To dbo.
	 *
	 * @param price the price
	 * @return the price entity
	 */
	public static PriceEntity toDbo(Price price) {
		return PriceEntity.builder()
				.brandId(price.getBrandId())
				.startDate(price.getStartDate())
				.endDate(price.getEndDate())
				.priceList(price.getPriceList())
				.productId(price.getProductId())
				.priority(price.getPriority())
				.price(price.getPrice())
				.currency(price.getCurrency().name())
				.lastUpdate(price.getLastUpdate())
				.lastUpdateBy(price.getLastUpdateBy())
				.build();
	}
}
