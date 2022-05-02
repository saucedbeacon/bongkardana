package id.dana;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import id.dana.dialog.CommonDialog;
import id.dana.onboarding.IntroductionActivity;
import id.dana.tracker.TrackerKey;
import id.dana.tracker.constant.TrackerType;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.GriverAppVirtualHostProxy;
import o.convertDipToPx;
import o.convertSpToPx;
import o.deleteAppInfoById;
import o.drawableToBitmap;
import o.genTextSelector;
import o.getPerformanceTracker;
import o.getStartDelay;
import o.getTypefaceByCat;
import o.getUnmodifiedPayloads;
import o.isAttachedToTransitionOverlay;
import o.isInnerApp;
import o.isLocalPath;
import o.judgeRes;
import o.restorePresenterStates;
import o.setButtonStyle;

public class DanaLocalBroadcastReceiver extends BroadcastReceiver {
    private Activity IsOverlapping;
    private CommonDialog equals;
    private final isAttachedToTransitionOverlay getMax;
    private final isInnerApp getMin;
    private final getPerformanceTracker length;
    private final isLocalPath setMax;
    private AppLifeCycleObserver setMin;
    /* access modifiers changed from: private */
    public deleteAppInfoById toIntRange;

    @Inject
    public DanaLocalBroadcastReceiver(isLocalPath islocalpath, isInnerApp isinnerapp, isAttachedToTransitionOverlay isattachedtotransitionoverlay, getPerformanceTracker getperformancetracker, AppLifeCycleObserver appLifeCycleObserver) {
        this.setMax = islocalpath;
        this.getMin = isinnerapp;
        this.length = getperformancetracker;
        this.getMax = isattachedtotransitionoverlay;
        this.setMin = appLifeCycleObserver;
    }

    public static void registerLocalBroadCastRecevier(Context context, DanaLocalBroadcastReceiver danaLocalBroadcastReceiver) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("id.dana.splash");
        intentFilter.addAction("IAPAppContainer_cardChannelHasChange");
        restorePresenterStates.length(context).setMax(danaLocalBroadcastReceiver, intentFilter);
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            if ("IAPAppContainer_cardChannelHasChange".equals(intent.getAction())) {
                this.setMax.execute(new GriverAppVirtualHostProxy(), isLocalPath.length.forF2FPayUtdid(this.length.generateDeviceId(context)));
            }
            if ("id.dana.splash".equals(intent.getAction())) {
                String str = getStartDelay.IsOverlapping().getMin;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                String str3 = getStartDelay.IsOverlapping().length;
                if (str3 != null) {
                    str2 = str3;
                }
                if (!str.isEmpty() || !str2.isEmpty()) {
                    getStartDelay.IsOverlapping().getMax = Boolean.TRUE;
                    getStartDelay.IsOverlapping().toFloatRange = Boolean.FALSE;
                } else {
                    getStartDelay.IsOverlapping().setMax();
                }
                Activity activity = this.getMax.getMin;
                if (!setMin(activity)) {
                    showWarningDialog(context, activity);
                }
            }
        }
    }

    private boolean setMin(Activity activity) {
        if (!this.setMin.setMax() || length(activity) || setMin()) {
            return getMin(activity) || getMax();
        }
        return false;
    }

    private boolean getMin(Activity activity) {
        if (setMax(activity)) {
            return this.IsOverlapping.getLocalClassName().equals(activity.getLocalClassName());
        }
        return false;
    }

    private boolean setMax(Activity activity) {
        Activity activity2 = this.IsOverlapping;
        return (activity2 == null || activity2.getLocalClassName() == null || activity == null || activity.getLocalClassName() == null) ? false : true;
    }

    public void showWarningDialog(Context context, Activity activity) {
        String str;
        setActivity(activity);
        CommonDialog.getMax getmax = new CommonDialog.getMax(activity);
        if (activity != null) {
            str = activity.getString(R.string.session_expired_desc);
        } else {
            str = context.getString(R.string.session_expired_desc);
        }
        getmax.toFloatRange = str;
        getmax.FastBitmap$CoordinateSystem = R.drawable.ic_warning_14;
        getmax.length = true;
        getmax.setMin = new getUnmodifiedPayloads(this, context, activity);
        try {
            CommonDialog commonDialog = new CommonDialog(getmax.getMax, getmax.setMin, getmax.setMax, getmax, (byte) 0);
            this.equals = commonDialog;
            commonDialog.setMin();
        } catch (Exception unused) {
            setMax(context, activity);
        }
    }

    private static boolean length(Activity activity) {
        return activity instanceof IntroductionActivity;
    }

    private boolean setMin() {
        CommonDialog commonDialog = this.equals;
        return commonDialog != null && commonDialog.getMin();
    }

    private boolean getMax() {
        deleteAppInfoById deleteappinfobyid = this.toIntRange;
        return deleteappinfobyid != null && deleteappinfobyid.setMin();
    }

    /* access modifiers changed from: private */
    public void setMax(final Context context, Activity activity) {
        if (activity != null) {
            try {
                deleteAppInfoById deleteappinfobyid = new deleteAppInfoById(activity);
                this.toIntRange = deleteappinfobyid;
                if (!deleteappinfobyid.length.isShowing()) {
                    deleteappinfobyid.length.show();
                }
            } catch (Exception unused) {
            }
        }
        this.getMin.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                if (DanaLocalBroadcastReceiver.this.toIntRange != null) {
                    DanaLocalBroadcastReceiver.this.toIntRange.getMin();
                }
                DanaLocalBroadcastReceiver.access$100(DanaLocalBroadcastReceiver.this, context);
                judgeRes.setMin(new getTypefaceByCat(new getTypefaceByCat.setMin(), (byte) 0), TrackerType.MIXPANEL, DanaLocalBroadcastReceiver.this.length).setMin();
                Intent intent = new Intent(context, IntroductionActivity.class);
                intent.setFlags(268468224);
                context.startActivity(intent);
                setButtonStyle.setMax(context);
                drawableToBitmap.length(context);
            }
        });
    }

    public void setActivity(Activity activity) {
        this.IsOverlapping = activity;
    }

    static /* synthetic */ void access$100(DanaLocalBroadcastReceiver danaLocalBroadcastReceiver, Context context) {
        convertDipToPx.length length2 = new convertDipToPx.length(context);
        length2.getMax = TrackerKey.Event.LOGOUT;
        convertDipToPx.length max = length2.setMax(TrackerKey.Property.LOGOUT_TYPE, "Force");
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }
}
