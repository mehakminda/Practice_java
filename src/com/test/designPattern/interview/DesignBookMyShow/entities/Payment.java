package com.test.designPattern.interview.DesignBookMyShow.entities;

import com.test.designPattern.interview.DesignBookMyShow.enums.PaymentStatus;

import java.util.UUID;

public class Payment {
    private final UUID paymentId;
    private final PaymentStatus status;

    public Payment( PaymentStatus paymentStatus) {
        this.paymentId = UUID.randomUUID();
        this.status = paymentStatus;
    }

    public UUID getPaymentId() {
        return paymentId;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
