package o;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.ActivityChooserView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class onDraw implements onDragEvent, getAutoSizeTextAvailableSizes {
    static final String setMax = setSupportBackgroundTintList.length("SystemFgDispatcher");
    private Context FastBitmap$CoordinateSystem;
    final Map<String, getInternalPopup> IsOverlapping;
    final getTextClassifier equals;
    public final getMinWidthMinor getMax;
    public setSupportCompoundDrawablesTintList getMin;
    @Nullable
    public setMin isInside;
    final Object length = new Object();
    String setMin;
    final Map<String, ActivityChooserView.InnerLayout> toFloatRange;
    final Set<getInternalPopup> toIntRange;

    public interface setMin {
        void cancelNotification(int i);

        void notify(int i, @NonNull Notification notification);

        void startForeground(int i, int i2, @NonNull Notification notification);

        void stop();
    }

    public final void getMin(@NonNull List<String> list) {
    }

    public onDraw(@NonNull Context context) {
        this.FastBitmap$CoordinateSystem = context;
        setSupportCompoundDrawablesTintList length2 = setSupportCompoundDrawablesTintList.length(this.FastBitmap$CoordinateSystem);
        this.getMin = length2;
        this.getMax = length2.length;
        this.setMin = null;
        this.toFloatRange = new LinkedHashMap();
        this.toIntRange = new HashSet();
        this.IsOverlapping = new HashMap();
        this.equals = new getTextClassifier(this.FastBitmap$CoordinateSystem, this.getMax, this);
        getAutoSizeStepGranularity getautosizestepgranularity = this.getMin.toIntRange;
        synchronized (getautosizestepgranularity.getMin) {
            getautosizestepgranularity.length.add(this);
        }
    }

    @MainThread
    public void onExecuted(@NonNull String str, boolean z) {
        Map.Entry entry;
        synchronized (this.length) {
            getInternalPopup remove = this.IsOverlapping.remove(str);
            if (remove != null ? this.toIntRange.remove(remove) : false) {
                this.equals.getMax(this.toIntRange);
            }
        }
        ActivityChooserView.InnerLayout remove2 = this.toFloatRange.remove(str);
        if (str.equals(this.setMin) && this.toFloatRange.size() > 0) {
            Iterator it = this.toFloatRange.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.setMin = (String) entry.getKey();
            if (this.isInside != null) {
                ActivityChooserView.InnerLayout innerLayout = (ActivityChooserView.InnerLayout) entry.getValue();
                this.isInside.startForeground(innerLayout.setMax, innerLayout.getMin, innerLayout.length);
                this.isInside.cancelNotification(innerLayout.setMax);
            }
        }
        setMin setmin = this.isInside;
        if (remove2 != null && setmin != null) {
            setSupportBackgroundTintList.getMax();
            Integer.valueOf(remove2.setMax);
            Integer.valueOf(remove2.getMin);
            setmin.cancelNotification(remove2.setMax);
        }
    }

    @MainThread
    public final void setMax() {
        this.isInside = null;
        synchronized (this.length) {
            this.equals.length();
        }
        getAutoSizeStepGranularity getautosizestepgranularity = this.getMin.toIntRange;
        synchronized (getautosizestepgranularity.getMin) {
            getautosizestepgranularity.length.remove(this);
        }
    }

    @MainThread
    public final void getMax(@NonNull Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        setSupportBackgroundTintList.getMax();
        Integer.valueOf(intExtra);
        Integer.valueOf(intExtra2);
        if (notification != null && this.isInside != null) {
            this.toFloatRange.put(stringExtra, new ActivityChooserView.InnerLayout(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty(this.setMin)) {
                this.setMin = stringExtra;
                this.isInside.startForeground(intExtra, intExtra2, notification);
                return;
            }
            this.isInside.notify(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry<String, ActivityChooserView.InnerLayout> value : this.toFloatRange.entrySet()) {
                    i |= ((ActivityChooserView.InnerLayout) value.getValue()).getMin;
                }
                ActivityChooserView.InnerLayout innerLayout = this.toFloatRange.get(this.setMin);
                if (innerLayout != null) {
                    this.isInside.startForeground(innerLayout.setMax, i, innerLayout.length);
                }
            }
        }
    }

    public final void getMax(@NonNull List<String> list) {
        if (!list.isEmpty()) {
            for (String settextfuture : list) {
                setSupportBackgroundTintList.getMax();
                setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = this.getMin;
                setsupportcompounddrawablestintlist.length.length(new setTextFuture(setsupportcompounddrawablestintlist, settextfuture, true));
            }
        }
    }

    @NonNull
    public static Intent setMin(@NonNull Context context, @NonNull String str, @NonNull ActivityChooserView.InnerLayout innerLayout) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", innerLayout.setMax);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", innerLayout.getMin);
        intent.putExtra("KEY_NOTIFICATION", innerLayout.length);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @NonNull
    public static Intent getMin(@NonNull Context context, @NonNull String str, @NonNull ActivityChooserView.InnerLayout innerLayout) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", innerLayout.setMax);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", innerLayout.getMin);
        intent.putExtra("KEY_NOTIFICATION", innerLayout.length);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @NonNull
    public static Intent setMax(@NonNull Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }
}
