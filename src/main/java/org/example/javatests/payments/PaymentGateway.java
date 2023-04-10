package org.example.javatests.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymenRquest request);

}
