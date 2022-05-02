package o;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import o.setInitialPrefetchItemCount;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
final class getChildClosestToEnd implements Application.ActivityLifecycleCallbacks {
    static Double setMax;
    /* access modifiers changed from: private */
    public boolean IsOverlapping = false;
    /* access modifiers changed from: private */
    public boolean equals = true;
    private Handler getMax = new Handler(Looper.getMainLooper());
    final shouldMeasureTwice getMin;
    WeakReference<Activity> length;
    final convertFocusDirectionToLayoutDirection setMin;
    private Runnable toIntRange;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public getChildClosestToEnd(convertFocusDirectionToLayoutDirection convertfocusdirectiontolayoutdirection, shouldMeasureTwice shouldmeasuretwice) {
        this.setMin = convertfocusdirectiontolayoutdirection;
        this.getMin = shouldmeasuretwice;
        if (setMax == null) {
            setMax = Double.valueOf((double) System.currentTimeMillis());
        }
    }

    public final void onActivityStarted(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null && intent.hasExtra("mp_campaign_id") && intent.hasExtra("mp_message_id")) {
            convertFocusDirectionToLayoutDirection.setMax(this.setMin.setMin, intent, "$app_open");
        }
        if (Build.VERSION.SDK_INT >= 16 && this.getMin.isInside()) {
            this.setMin.setMax.getMin(activity);
        }
        new calculateTimeForDeceleration(this.setMin, activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.equals = true;
        Runnable runnable = this.toIntRange;
        if (runnable != null) {
            this.getMax.removeCallbacks(runnable);
        }
        this.length = null;
        Handler handler = this.getMax;
        AnonymousClass4 r0 = new Runnable() {
            public final void run() {
                if (getChildClosestToEnd.this.IsOverlapping && getChildClosestToEnd.this.equals) {
                    boolean unused = getChildClosestToEnd.this.IsOverlapping = false;
                    try {
                        double currentTimeMillis = (double) System.currentTimeMillis();
                        double doubleValue = getChildClosestToEnd.setMax.doubleValue();
                        Double.isNaN(currentTimeMillis);
                        double d = currentTimeMillis - doubleValue;
                        if (d >= ((double) getChildClosestToEnd.this.getMin.hashCode) && d < ((double) getChildClosestToEnd.this.getMin.invoke)) {
                            double round = (double) Math.round((d / 1000.0d) * 10.0d);
                            Double.isNaN(round);
                            double d2 = round / 10.0d;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("$ae_session_length", d2);
                            getChildClosestToEnd.this.setMin.setMax.getMax("$ae_total_app_sessions", 1.0d);
                            getChildClosestToEnd.this.setMin.setMax.getMax("$ae_total_app_session_length", d2);
                            getChildClosestToEnd.this.setMin.getMax("$ae_session", jSONObject, true);
                        }
                    } catch (JSONException unused2) {
                    }
                    convertFocusDirectionToLayoutDirection convertfocusdirectiontolayoutdirection = getChildClosestToEnd.this.setMin;
                    if (convertfocusdirectiontolayoutdirection.length.length() && !convertfocusdirectiontolayoutdirection.getMax()) {
                        convertfocusdirectiontolayoutdirection.getMax.length(new setInitialPrefetchItemCount.getMin(convertfocusdirectiontolayoutdirection.getMin));
                    }
                    convertfocusdirectiontolayoutdirection.IsOverlapping.getMin();
                }
            }
        };
        this.toIntRange = r0;
        handler.postDelayed(r0, 500);
    }

    public final void onActivityResumed(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16 && this.getMin.isInside()) {
            this.setMin.setMax.length();
        }
        this.length = new WeakReference<>(activity);
        this.equals = false;
        boolean z = !this.IsOverlapping;
        this.IsOverlapping = true;
        Runnable runnable = this.toIntRange;
        if (runnable != null) {
            this.getMax.removeCallbacks(runnable);
        }
        if (z) {
            setMax = Double.valueOf((double) System.currentTimeMillis());
            this.setMin.toIntRange();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean length() {
        return this.IsOverlapping;
    }
}
