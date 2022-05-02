package o;

import id.dana.di.PerActivity;
import javax.inject.Inject;
import o.setProgressBackgroundColorSchemeResource;

@PerActivity
public final class setDistanceToTriggerSync implements setProgressBackgroundColorSchemeResource.setMax {
    private final GVSplashView getMax;
    private final applyShow length;
    /* access modifiers changed from: private */
    public final setProgressBackgroundColorSchemeResource.setMin setMin;

    @Inject
    public setDistanceToTriggerSync(setProgressBackgroundColorSchemeResource.setMin setmin, applyShow applyshow, GVSplashView gVSplashView) {
        this.setMin = setmin;
        this.length = applyshow;
        this.getMax = gVSplashView;
    }

    public final void length() {
        this.length.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                setDistanceToTriggerSync.this.setMin.setMax(((Boolean) obj).booleanValue());
            }

            public final void onError(Throwable th) {
                setDistanceToTriggerSync.this.setMin.onError(th.getMessage());
            }
        });
    }

    public final void getMax() {
        this.getMax.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final void onError(Throwable th) {
                setDistanceToTriggerSync.this.setMin.onError(th.getMessage());
            }

            public final /* synthetic */ void onNext(Object obj) {
                setProgressBackgroundColorSchemeResource.setMin unused = setDistanceToTriggerSync.this.setMin;
            }
        });
    }

    public final void setMax() {
        this.length.dispose();
        this.getMax.dispose();
    }
}
