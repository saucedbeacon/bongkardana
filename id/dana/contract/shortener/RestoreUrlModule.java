package id.dana.contract.shortener;

import android.app.Activity;
import dagger.Module;
import dagger.Provides;
import id.dana.base.BaseActivity;
import id.dana.di.PerActivity;
import o.BindView;
import o.OnFocusChange;
import o.OnItemLongClick;
import o.setCancelOnTouchOutside$core;

@Module
public class RestoreUrlModule {
    private setMin setMin;

    @PerActivity
    @Provides
    public BindView.setMin setMin(OnFocusChange onFocusChange) {
        return onFocusChange;
    }

    public /* synthetic */ RestoreUrlModule(setMin setmin, byte b) {
        this(setmin);
    }

    private RestoreUrlModule(setMin setmin) {
        this.setMin = setmin;
    }

    public static setMin setMin() {
        return new setMin((byte) 0);
    }

    @PerActivity
    @Provides
    public BindView.setMax setMin(OnItemLongClick onItemLongClick) {
        if (this.setMin.setMin != null) {
            return this.setMin.setMin;
        }
        onItemLongClick.length = this.setMin.length;
        Activity activity = this.setMin.getMax;
        onItemLongClick.setMin = activity;
        if (activity instanceof BaseActivity) {
            onItemLongClick.getMax = (BaseActivity) activity;
        }
        return onItemLongClick;
    }

    public static class setMin {
        public Activity getMax;
        public setCancelOnTouchOutside$core length;
        BindView.setMax setMin;

        /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
        }
    }
}
