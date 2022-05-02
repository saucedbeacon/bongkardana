package o;

import android.app.Activity;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.referral.model.MyReferralConsult;
import kotlin.Unit;
import o.onJsBeforeUnload;

public final class resume {
    onJsBeforeUnload getMax;
    Activity getMin;
    String length;
    MyReferralConsult setMax;
    setPageCacheCapacity setMin;

    public resume(Activity activity, MovableFrameLayout movableFrameLayout, setPageCacheCapacity setpagecachecapacity, final setBackButton setbackbutton, onJsBeforeUnload onjsbeforeunload) {
        this.getMin = activity;
        this.setMin = setpagecachecapacity;
        this.getMax = onjsbeforeunload;
        movableFrameLayout.execute(new GriverAppVirtualHostProxy<appxrpc>() {
            public final /* synthetic */ void onNext(Object obj) {
                resume resume = resume.this;
                MyReferralConsult min = setbackbutton.setMin((appxrpc) obj);
                resume.setMax = min;
                if (min.setMin == null || !min.setMin.setMax()) {
                    ((BaseActivity) resume.getMin).showWarningDialog(resume.getMin.getString(R.string.referral_campaign_off));
                } else {
                    resume.getMax.execute(new GriverAppVirtualHostProxy<APWebSettings>() {
                        public final /* synthetic */ void onNext(Object obj) {
                            resume.this.length = ((APWebSettings) obj).getLink();
                            resume resume = resume.this;
                            resume.setMin.execute(Unit.INSTANCE, new forceToEnd(resume), end.setMin);
                        }
                    }, onJsBeforeUnload.getMin.forParams(min.length));
                }
            }
        });
    }
}
