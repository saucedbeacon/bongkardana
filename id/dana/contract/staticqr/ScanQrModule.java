package id.dana.contract.staticqr;

import android.app.Activity;
import androidx.annotation.Nullable;
import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.R;
import o.method;
import o.setCancelOnTouchOutside$core;

@Module
public class ScanQrModule {
    private setMin setMin;

    @PerActivity
    @Provides
    public R.id.getMax length(R.styleable styleable) {
        return styleable;
    }

    public /* synthetic */ ScanQrModule(setMin setmin, byte b) {
        this(setmin);
    }

    private ScanQrModule(setMin setmin) {
        this.setMin = setmin;
    }

    public static setMin getMax() {
        return new setMin((byte) 0);
    }

    @PerActivity
    @Nullable
    @Provides
    public Activity getMin() {
        return this.setMin.setMin;
    }

    @PerActivity
    @Provides
    public R.id.length setMax(method method) {
        if (this.setMin.getMax != null) {
            return this.setMin.getMax;
        }
        method.setMax = this.setMin.length;
        method.length = this.setMin.setMax;
        method.getMax = this.setMin.getMin;
        return method;
    }

    public static class setMin {
        R.id.length getMax;
        public R.id.length getMin;
        public String length;
        public setCancelOnTouchOutside$core setMax;
        public Activity setMin;

        /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
        }
    }
}
