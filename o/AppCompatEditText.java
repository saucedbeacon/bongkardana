package o;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.ButtonBarLayout;
import o.setSupportButtonTintMode;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AppCompatEditText implements onDragEvent, getAutoSizeTextAvailableSizes, ButtonBarLayout.setMin {
    private static final String toFloatRange = setSupportBackgroundTintList.length("DelayMetCommandHandler");
    @Nullable
    PowerManager.WakeLock IsOverlapping;
    private int equals = 0;
    final setSupportButtonTintMode getMax;
    final String getMin;
    private final Object isInside = new Object();
    final Context length;
    final int setMax;
    final getTextClassifier setMin;
    boolean toIntRange = false;

    AppCompatEditText(@NonNull Context context, int i, @NonNull String str, @NonNull setSupportButtonTintMode setsupportbuttontintmode) {
        this.length = context;
        this.setMax = i;
        this.getMax = setsupportbuttontintmode;
        this.getMin = str;
        this.setMin = new getTextClassifier(this.length, setsupportbuttontintmode.getMax, this);
    }

    public final void getMin(@NonNull List<String> list) {
        if (list.contains(this.getMin)) {
            synchronized (this.isInside) {
                if (this.equals == 0) {
                    this.equals = 1;
                    setSupportBackgroundTintList.getMax();
                    if (this.getMax.setMin.getMax(this.getMin)) {
                        ButtonBarLayout buttonBarLayout = this.getMax.length;
                        String str = this.getMin;
                        synchronized (buttonBarLayout.setMax) {
                            setSupportBackgroundTintList.getMax();
                            buttonBarLayout.setMax(str);
                            ButtonBarLayout.getMax getmax = new ButtonBarLayout.getMax(buttonBarLayout, str);
                            buttonBarLayout.getMin.put(str, getmax);
                            buttonBarLayout.length.put(str, this);
                            buttonBarLayout.getMax.schedule(getmax, 600000, TimeUnit.MILLISECONDS);
                        }
                    } else {
                        getMin();
                    }
                } else {
                    setSupportBackgroundTintList.getMax();
                }
            }
        }
    }

    public final void onExecuted(@NonNull String str, boolean z) {
        setSupportBackgroundTintList.getMax();
        Boolean.valueOf(z);
        getMin();
        if (z) {
            Intent max = setSupportButtonTintList.getMax(this.length, this.getMin);
            setSupportButtonTintMode setsupportbuttontintmode = this.getMax;
            setsupportbuttontintmode.equals.post(new setSupportButtonTintMode.getMin(setsupportbuttontintmode, max, this.setMax));
        }
        if (this.toIntRange) {
            Intent max2 = setSupportButtonTintList.getMax(this.length);
            setSupportButtonTintMode setsupportbuttontintmode2 = this.getMax;
            setsupportbuttontintmode2.equals.post(new setSupportButtonTintMode.getMin(setsupportbuttontintmode2, max2, this.setMax));
        }
    }

    public final void getMax(@NonNull String str) {
        setSupportBackgroundTintList.getMax();
        setMax();
    }

    public final void getMax(@NonNull List<String> list) {
        setMax();
    }

    /* access modifiers changed from: package-private */
    public final void setMax() {
        synchronized (this.isInside) {
            if (this.equals < 2) {
                this.equals = 2;
                setSupportBackgroundTintList.getMax();
                Intent length2 = setSupportButtonTintList.length(this.length, this.getMin);
                setSupportButtonTintMode setsupportbuttontintmode = this.getMax;
                setsupportbuttontintmode.equals.post(new setSupportButtonTintMode.getMin(this.getMax, length2, this.setMax));
                if (this.getMax.setMin.isInside(this.getMin)) {
                    setSupportBackgroundTintList.getMax();
                    Intent max = setSupportButtonTintList.getMax(this.length, this.getMin);
                    setSupportButtonTintMode setsupportbuttontintmode2 = this.getMax;
                    setsupportbuttontintmode2.equals.post(new setSupportButtonTintMode.getMin(this.getMax, max, this.setMax));
                } else {
                    setSupportBackgroundTintList.getMax();
                }
            } else {
                setSupportBackgroundTintList.getMax();
            }
        }
    }

    private void getMin() {
        synchronized (this.isInside) {
            this.setMin.length();
            this.getMax.length.setMax(this.getMin);
            if (this.IsOverlapping != null && this.IsOverlapping.isHeld()) {
                setSupportBackgroundTintList.getMax();
                this.IsOverlapping.release();
            }
        }
    }
}
