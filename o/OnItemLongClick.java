package o;

import android.app.Activity;
import android.text.TextUtils;
import id.dana.danah5.DanaH5;
import id.dana.di.PerActivity;
import o.BindView;

@PerActivity
public final class OnItemLongClick implements BindView.setMax {
    public autoGenerate getMax;
    public setCancelOnTouchOutside$core length;
    private setPublishStatus setMax;
    public Activity setMin;

    public final void getMin(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("http")) {
                str = "https://m.dana.id".concat(String.valueOf(str));
            }
            DanaH5.startContainerFullUrl(str, this.length);
        }
        autoGenerate autogenerate = this.getMax;
        if (autogenerate != null) {
            autogenerate.enableClick();
        }
    }

    public final void showProgress() {
        if (this.setMin != null) {
            setPublishStatus setpublishstatus = new setPublishStatus(this.setMin);
            this.setMax = setpublishstatus;
            if (!setpublishstatus.length.isShowing()) {
                setpublishstatus.length.show();
                setpublishstatus.getMax.startRefresh();
            }
        }
    }

    public final void dismissProgress() {
        setPublishStatus setpublishstatus = this.setMax;
        if (setpublishstatus != null) {
            setpublishstatus.getMax();
        }
    }

    public final void onError(String str) {
        autoGenerate autogenerate = this.getMax;
        if (autogenerate != null) {
            autogenerate.enableClick();
        }
    }
}
