package com.pzfomar.technical_test.infrastructure.persistence.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pzfomar.technical_test.infrastructure.persistence.entity.PriceEntity;

/**
 * The Interface PriceJpaRepository.
 */
@Repository
public interface PriceJpaRepository extends JpaRepository<PriceEntity, Integer> {
	
	/**
	 * Find all by product id and brand id and start date less than equal and end date greater than equal.
	 *
	 * @param productId the product id
	 * @param brandId the brand id
	 * @param startDate the start date
	 * @param endDate the end date
	 * @return the list
	 */
	List<PriceEntity> findAllByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(Integer productId, Integer brandId, Date startDate, Date endDate);
}
