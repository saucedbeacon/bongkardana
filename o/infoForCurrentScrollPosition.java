package o;

import id.dana.di.PerActivity;
import javax.inject.Inject;
import o.enableLayers;

@PerActivity
public final class infoForCurrentScrollPosition implements enableLayers.setMin {
    private final getJavaScriptEnabled getMax;
    /* access modifiers changed from: private */
    public final enableLayers.getMin setMax;

    @Inject
    public infoForCurrentScrollPosition(enableLayers.getMin getmin, getJavaScriptEnabled getjavascriptenabled) {
        this.setMax = getmin;
        this.getMax = getjavascriptenabled;
    }

    public final void getMax() {
        this.getMax.execute(new GriverAppVirtualHostProxy<setAPWebViewListener>() {
            public final /* synthetic */ void onNext(Object obj) {
                infoForCurrentScrollPosition.this.setMax.getMax(Boolean.valueOf(((setAPWebViewListener) obj).isEnableInQR()));
            }
        });
    }

    public final void setMax() {
        this.getMax.dispose();
    }
}
