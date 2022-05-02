package o;

import javax.inject.Inject;
import o.AUNoticeDialog;

public final class setTitleTextSize implements AUNoticeDialog.OnClickNegativeListener.setMin {
    private AppStatus getMax;
    /* access modifiers changed from: private */
    public AUNoticeDialog.OnClickNegativeListener.setMax setMax;

    @Inject
    public setTitleTextSize(AUNoticeDialog.OnClickNegativeListener.setMax setmax, AppStatus appStatus) {
        this.setMax = setmax;
        this.getMax = appStatus;
    }

    public final void getMin() {
        this.getMax.execute(new GriverAppVirtualHostProxy<GriverCommonResourceProxy>() {
            public final /* synthetic */ void onNext(Object obj) {
                setTitleTextSize.this.setMax.setMin((GriverCommonResourceProxy) obj);
            }
        });
    }

    public final void setMax() {
        this.getMax.dispose();
    }
}
