package com.code.test.domain;

import java.math.BigDecimal;

public class Payment {

    private final String ccy;
    private final BigDecimal amount;
    private final BigDecimal amountUSD; //TODO

    public Payment(String ccy, BigDecimal amount, BigDecimal amountUSD) {
        this.ccy = ccy;
        this.amount = amount;
        this.amountUSD = amountUSD;
    }

    public String getCcy() {
        return ccy;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "ccy='" + ccy + '\'' +
                ", amount=" + amount +
                '}';
    }
}
