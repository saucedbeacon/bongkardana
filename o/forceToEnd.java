package o;

import android.app.Activity;
import android.content.Intent;
import id.dana.referral.MyReferralDetailActivity;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.convertDipToPx;

final class forceToEnd implements Function1 {
    private final resume length;

    public forceToEnd(resume resume) {
        this.length = resume;
    }

    public final Object invoke(Object obj) {
        resume resume = this.length;
        Activity activity = resume.getMin;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        convertDipToPx.length length2 = new convertDipToPx.length(activity.getApplicationContext());
        length2.getMax = TrackerKey.Event.REFERRER_PAGE_OPEN;
        convertDipToPx.length max = length2.setMax("Source", TrackerKey.SourceType.REFERRAL_DEEPLINK);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        Intent intent = new Intent(activity, MyReferralDetailActivity.class);
        intent.putExtra(MyReferralDetailActivity.BundleKey.BUNDLE_REFERRAL_CONSULT, resume.setMax);
        intent.putExtra(MyReferralDetailActivity.BundleKey.BUNDLE_REFERRAL_DEEPLINK, resume.length);
        intent.putExtra(MyReferralDetailActivity.BundleKey.BUNDLE_SHOW_REFERRAL, booleanValue);
        activity.startActivity(intent);
        return Unit.INSTANCE;
    }
}
