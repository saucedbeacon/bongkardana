package o;

import id.dana.di.PerActivity;
import javax.inject.Inject;
import o.restoreState;

@PerActivity
public final class setPrimaryItem implements restoreState.length {
    private final H5ResourceHandlerUtil getMin;
    /* access modifiers changed from: private */
    public final restoreState.getMax setMax;

    @Inject
    public setPrimaryItem(restoreState.getMax getmax, H5ResourceHandlerUtil h5ResourceHandlerUtil) {
        this.setMax = getmax;
        this.getMin = h5ResourceHandlerUtil;
    }

    public final void length() {
        this.setMax.showProgress();
        this.getMin.execute(new GriverAppVirtualHostProxy<encodeHex>() {
            public final /* synthetic */ void onNext(Object obj) {
                setPrimaryItem.this.setMax.dismissProgress();
                setPrimaryItem.this.setMax.setMax(((encodeHex) obj).isHasNew());
            }

            public final void onError(Throwable th) {
                super.onError(th);
                setPrimaryItem.this.setMax.dismissProgress();
                setPrimaryItem.this.setMax.onError(th.getMessage());
            }
        });
    }

    public final void setMax() {
        this.getMin.dispose();
    }
}
