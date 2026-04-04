package com.test.designPattern.behaviour.template;

// Abstract class
public abstract class PaymentFlow {
    // Abstract methods - these methods are implemented by the subclasses.
    public abstract void validateRequest();

    public abstract void debitAmount();

    public abstract void calculateFees();

    public abstract void creditAmount();

    // Template method: which defines the order of steps to execute the task.
    public final void sendMoney(){
        validateRequest(); //step1
        debitAmount(); //step2
        calculateFees(); //step3
        creditAmount(); //step4
    }

    // Hook method: which can be overridden by the subclasses.
    protected boolean requiresOTPAuthentication() {
        return false; // Default: authentication not required
    }

    // Common method: All subclasses share this common functionality.
    public void logTransaction() {
        System.out.println("Transaction Completed!");
    }


}
