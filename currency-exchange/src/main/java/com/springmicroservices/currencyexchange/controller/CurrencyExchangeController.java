package com.springmicroservices.currencyexchange.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springmicroservices.currencyexchange.bean.CurrencyExchange;

@RestController
public class CurrencyExchangeController {

	@GetMapping("/currency-exchange/from/{currencyFrom}/to/{currencyTo}")
	public CurrencyExchange retrieveExchangeValue(
			@PathVariable("currencyFrom") String currencyFrom,
			@PathVariable("currencyTo") String currencyTo) {
		
		return new CurrencyExchange(1000l, currencyFrom, currencyTo, BigDecimal.valueOf(50));
	}
}
