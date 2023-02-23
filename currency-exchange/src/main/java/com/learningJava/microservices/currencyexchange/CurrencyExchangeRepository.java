package com.learningJava.microservices.currencyexchange;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface CurrencyExchangeRepository
        extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(
            String from,
            String to
    );
}
