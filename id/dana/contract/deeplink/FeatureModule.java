package id.dana.contract.deeplink;

import android.app.Activity;
import dagger.Module;
import dagger.Provides;
import id.dana.base.BaseActivity;
import id.dana.di.PerActivity;
import o.getMode;
import o.getRunningAnimators;
import o.getTargets;
import o.runAnimators;

@Module
public class FeatureModule {
    private length setMax;

    @PerActivity
    @Provides
    public getRunningAnimators.setMax getMax(getTargets gettargets) {
        return gettargets;
    }

    public /* synthetic */ FeatureModule(length length2, byte b) {
        this(length2);
    }

    private FeatureModule(length length2) {
        this.setMax = length2;
    }

    public static length length() {
        return new length((byte) 0);
    }

    @PerActivity
    @Provides
    public getRunningAnimators.getMin length(getMode getmode) {
        if (this.setMax.setMin != null) {
            return this.setMax.setMin;
        }
        Activity activity = this.setMax.setMax;
        getmode.setMin = activity;
        if (activity instanceof BaseActivity) {
            getmode.setMax = (BaseActivity) activity;
        }
        getmode.getMax = this.setMax.getMax;
        getmode.length = this.setMax.length;
        return getmode;
    }

    public static class length {
        public runAnimators getMax;
        String length;
        public Activity setMax;
        getRunningAnimators.getMin setMin;

        /* synthetic */ length(byte b) {
            this();
        }

        private length() {
        }
    }
}
