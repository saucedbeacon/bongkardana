package id.dana.scanner;

import id.dana.R;
import id.dana.base.BaseActivity;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class ScannerActivity extends BaseActivity {
    public static final String CLOSE_AFTER_SCAN = "CLOSE_AFTER_SCAN";
    public static final String FROM_VIEW_TYPE = "from_view_type";
    public static final String SCENE = "scene";
    ScannerFragment scannerFragment;

    public void configToolbar() {
    }

    public int getLayout() {
        int max = dispatchOnCancelled.getMax(0);
        if (max == 0) {
            return R.layout.activity_scanner;
        }
        onCanceled oncanceled = new onCanceled(0, max, 16);
        onCancelLoad.setMax(1933690096, oncanceled);
        onCancelLoad.getMin(1933690096, oncanceled);
        return R.layout.activity_scanner;
    }

    public void init() {
        this.scannerFragment = (ScannerFragment) getSupportFragmentManager().findFragmentById(R.id.f44602131362990);
        this.scannerFragment.getMin = getIntent().getStringExtra("scene");
    }
}
