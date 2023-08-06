package com.udacity.pricing.domain.price;

import java.math.BigDecimal;

import javax.persistence.*;

import lombok.*;

/**
 * Represents the price of a given vehicle, including currency.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Price {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	private String currency;

	private BigDecimal price;

	private Long vehicleId;

	public Price(String currency, BigDecimal price, Long vehicleId) {
		this.currency = currency;
		this.price = price;
		this.vehicleId = vehicleId;
	}
}
