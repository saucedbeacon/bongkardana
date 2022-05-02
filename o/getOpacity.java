package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.io.PrintWriter;

public abstract class getOpacity<E> extends jumpToCurrentState {
    public final FragmentManager getMax;
    private final int getMin;
    @Nullable
    public final Activity length;
    @NonNull
    public final Context setMax;
    @NonNull
    public final Handler setMin;

    @Nullable
    public View getMin(int i) {
        return null;
    }

    @Nullable
    public abstract E getMin();

    public void length() {
    }

    public boolean setMax() {
        return true;
    }

    public boolean setMax(@NonNull String str) {
        return false;
    }

    public void setMin(@NonNull String str, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }

    public boolean setMin() {
        return true;
    }

    public getOpacity(@NonNull FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler());
    }

    private getOpacity(@Nullable Activity activity, @NonNull Context context, @NonNull Handler handler) {
        this.getMax = new getTransparentRegion();
        this.length = activity;
        if (context != null) {
            this.setMax = context;
            this.setMin = handler;
            this.getMin = 0;
            return;
        }
        throw new NullPointerException("context == null");
    }

    @NonNull
    public LayoutInflater getMax() {
        return LayoutInflater.from(this.setMax);
    }

    public final void setMin(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @Nullable Bundle bundle) {
        IntRange.setMin(this.setMax, intent, bundle);
    }

    @Nullable
    public final Activity equals() {
        return this.length;
    }

    @NonNull
    public final Context IsOverlapping() {
        return this.setMax;
    }

    @NonNull
    public final Handler isInside() {
        return this.setMin;
    }
}
