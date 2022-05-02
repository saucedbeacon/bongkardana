package o;

import id.dana.scanner.ScannerFragment;
import o.IPostMessageService;

public final class handle implements IPostMessageService.Default {
    private final ScannerFragment length;

    public handle(ScannerFragment scannerFragment) {
        this.length = scannerFragment;
    }

    public final void onActivityResult(Object obj) {
        ScannerFragment.Mean$Arithmetic(this.length);
    }
}
