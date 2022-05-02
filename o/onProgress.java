package o;

final class onProgress implements RedDotDrawable {
    private final String getMin;

    public onProgress(String str) {
        this.getMin = str;
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(((marshall) obj).getFreeBankTransferCount(this.getMin));
    }
}
