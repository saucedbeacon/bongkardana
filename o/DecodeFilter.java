package o;

import id.dana.scanner.ScannerFragment;

public final class DecodeFilter implements removeStateDidChangeHandler {
    private final DecodeResult getMin;
    private final ScannerFragment setMax;

    public DecodeFilter(ScannerFragment scannerFragment, DecodeResult decodeResult) {
        this.setMax = scannerFragment;
        this.getMin = decodeResult;
    }

    public final void getMax() {
        ScannerFragment.length(this.setMax, this.getMin);
    }
}
