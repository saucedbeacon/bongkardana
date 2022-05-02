package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import o.setSupportBackgroundTintList;
import o.setSupportButtonTintMode;
import o.setTypeface;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemAlarmService extends LifecycleService implements setSupportButtonTintMode.setMax {
    private static final String setMax = setSupportBackgroundTintList.length("SystemAlarmService");
    private boolean getMax;
    private setSupportButtonTintMode setMin;

    public void onCreate() {
        super.onCreate();
        setSupportButtonTintMode setsupportbuttontintmode = new setSupportButtonTintMode(this);
        this.setMin = setsupportbuttontintmode;
        if (setsupportbuttontintmode.FastBitmap$CoordinateSystem != null) {
            setSupportBackgroundTintList.getMax();
        } else {
            setsupportbuttontintmode.FastBitmap$CoordinateSystem = this;
        }
        this.getMax = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.getMax = true;
        this.setMin.setMin();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.getMax) {
            setSupportBackgroundTintList.getMax();
            this.setMin.setMin();
            setSupportButtonTintMode setsupportbuttontintmode = new setSupportButtonTintMode(this);
            this.setMin = setsupportbuttontintmode;
            if (setsupportbuttontintmode.FastBitmap$CoordinateSystem != null) {
                setSupportBackgroundTintList.getMax();
            } else {
                setsupportbuttontintmode.FastBitmap$CoordinateSystem = this;
            }
            this.getMax = false;
        }
        if (intent == null) {
            return 3;
        }
        this.setMin.getMax(intent, i2);
        return 3;
    }

    @MainThread
    public void onAllCommandsCompleted() {
        this.getMax = true;
        setSupportBackgroundTintList.getMax();
        setTypeface.getMax();
        stopSelf();
    }
}
