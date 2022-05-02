package o;

import id.dana.di.PerActivity;
import javax.inject.Inject;
import o.BindView;
import o.DataProviderException;

@PerActivity
public final class OnFocusChange implements BindView.setMin {
    private final DataProviderException getMax;
    /* access modifiers changed from: private */
    public final BindView.setMax length;

    @Inject
    public OnFocusChange(BindView.setMax setmax, DataProviderException dataProviderException) {
        this.length = setmax;
        this.getMax = dataProviderException;
    }

    public final void setMin(String str) {
        this.length.showProgress();
        this.getMax.execute(new GriverAppVirtualHostProxy<String>() {
            public final /* synthetic */ void onNext(Object obj) {
                OnFocusChange.this.length.dismissProgress();
                OnFocusChange.this.length.getMin((String) obj);
            }

            public final void onError(Throwable th) {
                super.onError(th);
                OnFocusChange.this.length.dismissProgress();
                OnFocusChange.this.length.onError(th.getMessage());
            }
        }, DataProviderException.getMax.forRestoreUrl(str));
    }

    public final void setMax() {
        this.getMax.dispose();
    }
}
