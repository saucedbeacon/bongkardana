package o;

import id.dana.di.PerActivity;
import javax.inject.Inject;
import o.ShareRecyclerAdapter;
import o.setAutoDismissEnabled$core;

@PerActivity
public final class setBodyFont$core implements setAutoDismissEnabled$core.setMin {
    private GriverAppVirtualHostProxy<disconnect> getMax;
    /* access modifiers changed from: private */
    public final setAutoDismissEnabled$core.getMax getMin;
    /* access modifiers changed from: private */
    public final ShareRecyclerAdapter.ShareViewHolder length;
    private final sendData setMin;

    @Inject
    public setBodyFont$core(setAutoDismissEnabled$core.getMax getmax, sendData senddata, ShareRecyclerAdapter.ShareViewHolder shareViewHolder) {
        this.getMin = getmax;
        this.setMin = senddata;
        this.length = shareViewHolder;
    }

    public final void setMin() {
        GriverAppVirtualHostProxy<disconnect> griverAppVirtualHostProxy = this.getMax;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
            this.getMax = null;
        }
    }

    public final void setMax() {
        this.setMin.dispose();
    }

    public final void getMax() {
        GriverAppVirtualHostProxy<disconnect> griverAppVirtualHostProxy = this.getMax;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
            this.getMax = null;
        }
        this.getMin.showProgress();
        sendData senddata = this.setMin;
        if (this.getMax == null) {
            this.getMax = new GriverAppVirtualHostProxy<disconnect>() {
                public final /* synthetic */ void onNext(Object obj) {
                    setBodyFont$core.this.getMin.dismissProgress();
                    setBodyFont$core.this.getMin.length(setBodyFont$core.this.length.setMin((disconnect) obj));
                }

                public final void onError(Throwable th) {
                    setBodyFont$core.this.getMin.dismissProgress();
                    setBodyFont$core.this.getMin.onError(th.getMessage());
                }
            };
        }
        senddata.execute(this.getMax);
    }
}
