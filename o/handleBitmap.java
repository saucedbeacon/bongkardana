package o;

import androidx.activity.result.ActivityResult;
import id.dana.scanner.ScannerFragment;
import o.IPostMessageService;

public final class handleBitmap implements IPostMessageService.Default {
    private final ScannerFragment setMax;

    public handleBitmap(ScannerFragment scannerFragment) {
        this.setMax = scannerFragment;
    }

    public final void onActivityResult(Object obj) {
        ScannerFragment.getMin(this.setMax, (ActivityResult) obj);
    }
}
