package com.code.test.handler;

import com.code.test.domain.Payment;
import com.code.test.repository.PaymentRepository;

import java.math.BigDecimal;

public class PaymentHandler implements InputHandler {

    private final PaymentRepository paymentRepository;

    public PaymentHandler(final PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void process(String input) {
        final String[] values = input.split(" ");
        final String ccy = values[0];
        final BigDecimal amount = new BigDecimal(values[1]);
        final Payment payment = new Payment(ccy, amount, BigDecimal.valueOf(0.0));
        paymentRepository.save(payment);
    }

}
