package id.dana.lib.drawbitmap.invoice;

public interface CreateInvoiceResultHandler {
    void onError(Throwable th);

    void onResult(String str);
}
