package org.example.javatests.payments;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount) {

        PaymentResponse response = paymentGateway.requestPayment(new PaymenRquest(amount));

        if (response.getStatus() == PaymentResponse.PaymentStatus.OK) {
            return true;
        } else {
            return false;
        }
    }

}
