package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import id.dana.base.BaseActivity;
import id.dana.di.PerActivity;
import id.dana.onboarding.IntroductionActivity;
import id.dana.tracker.TrackerKey;
import id.dana.tracker.constant.TrackerType;
import javax.inject.Inject;
import o.convertDipToPx;
import o.getTypefaceByCat;

@PerActivity
public class CustomPopMenuExtension {
    private final getPerformanceTracker getMax;
    private FtsOptions$Order getMin;
    private final Context isInside;
    public deleteAppInfoById length;
    public BaseActivity setMax;
    private final isInnerApp setMin;

    @Inject
    public CustomPopMenuExtension(isInnerApp isinnerapp, getPerformanceTracker getperformancetracker, Context context) {
        this.setMin = isinnerapp;
        this.getMax = getperformancetracker;
        this.isInside = context;
    }

    static /* synthetic */ void setMin(CustomPopMenuExtension customPopMenuExtension) {
        FtsOptions$Order ftsOptions$Order = customPopMenuExtension.getMin;
        convertDipToPx.length length2 = new convertDipToPx.length(ftsOptions$Order != null ? ftsOptions$Order.getContext() : customPopMenuExtension.setMax);
        length2.getMax = TrackerKey.Event.LOGOUT;
        convertDipToPx.length max = length2.setMax(TrackerKey.Property.LOGOUT_TYPE, TrackerKey.LogoutType.SESSION_EXPIRE);
        max.setMin();
        genTextSelector.getMax(new convertDipToPx(max, (byte) 0));
    }

    static /* synthetic */ void setMax(CustomPopMenuExtension customPopMenuExtension) {
        Intent intent = new Intent(customPopMenuExtension.setMax, IntroductionActivity.class);
        intent.setFlags(268468224);
        updateFavoriteMenuItem.getMin((Activity) null);
        BaseActivity baseActivity = customPopMenuExtension.setMax;
        if (baseActivity != null) {
            baseActivity.startActivity(intent);
            customPopMenuExtension.setMax.finish();
            return;
        }
        FtsOptions$Order ftsOptions$Order = customPopMenuExtension.getMin;
        if (ftsOptions$Order != null) {
            ftsOptions$Order.startActivity(intent);
            customPopMenuExtension.getMin.getMax.finish();
        }
    }

    static /* synthetic */ void getMax(CustomPopMenuExtension customPopMenuExtension) {
        deleteAppInfoById deleteappinfobyid = customPopMenuExtension.length;
        if (!deleteappinfobyid.length.isShowing()) {
            try {
                deleteappinfobyid.length.show();
            } catch (Exception unused) {
            }
        }
        customPopMenuExtension.setMin.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                CustomPopMenuExtension.this.length.getMin();
                CustomPopMenuExtension.setMin(CustomPopMenuExtension.this);
                judgeRes.setMin(new getTypefaceByCat(new getTypefaceByCat.setMin(), (byte) 0), TrackerType.MIXPANEL, CustomPopMenuExtension.this.getMax).setMin();
                CustomPopMenuExtension.setMax(CustomPopMenuExtension.this);
            }
        });
    }
}
