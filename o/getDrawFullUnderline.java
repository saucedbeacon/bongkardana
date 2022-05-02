package o;

import android.text.TextUtils;
import id.dana.di.PerActivity;
import javax.inject.Inject;
import o.setTabIndicatorColor;

@PerActivity
public final class getDrawFullUnderline implements setTabIndicatorColor.getMax {
    /* access modifiers changed from: private */
    public final setTabIndicatorColor.setMin setMax;
    private final apiName setMin;

    @Inject
    public getDrawFullUnderline(setTabIndicatorColor.setMin setmin, apiName apiname) {
        this.setMax = setmin;
        this.setMin = apiname;
    }

    public final void getMax() {
        this.setMin.execute(new GriverAppVirtualHostProxy<installPath>() {
            public final /* synthetic */ void onNext(Object obj) {
                installPath installpath = (installPath) obj;
                if (!installpath.isVisible() || TextUtils.isEmpty(installpath.getText())) {
                    getDrawFullUnderline.this.setMax.hideMaintenanceBroadcast();
                } else {
                    getDrawFullUnderline.this.setMax.showMaintenanceBroadcast(installpath.getText());
                }
            }
        });
    }

    public final void setMax() {
        this.setMin.dispose();
    }
}
