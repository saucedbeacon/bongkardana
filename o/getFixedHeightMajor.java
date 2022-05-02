package o;

import android.view.View;

public final class getFixedHeightMajor extends FitWindowsFrameLayout<getFixedHeightMajor> {
    public static getFixedHeightMajor setMax(View view) {
        return new getFixedHeightMajor(view);
    }

    private getFixedHeightMajor(View view) {
        getMin(view);
    }

    public getFixedHeightMajor() {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ setSelector getMin() {
        return new getFixedHeightMajor();
    }
}
