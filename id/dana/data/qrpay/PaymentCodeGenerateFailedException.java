package id.dana.data.qrpay;

public class PaymentCodeGenerateFailedException extends Exception {
    public PaymentCodeGenerateFailedException() {
        super("PaymentCode fail to generate");
    }
}
