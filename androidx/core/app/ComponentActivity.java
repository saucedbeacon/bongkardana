package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import o.PlaybackStateCompat;
import o.hasText;
import o.invokeItem;
import o.setChecked;
import o.setOnKeyListener;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ComponentActivity extends Activity implements setChecked, setOnKeyListener.length {
    private PlaybackStateCompat.RepeatMode<Class<? extends setMin>, setMin> mExtraDataMap = new PlaybackStateCompat.RepeatMode<>();
    private hasText mLifecycleRegistry = new hasText(this);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static class setMin {
    }

    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void putExtraData(setMin setmin) {
        this.mExtraDataMap.put(setmin.getClass(), setmin);
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        invokeItem.setMin(this);
    }

    @CallSuper
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        hasText hastext = this.mLifecycleRegistry;
        Lifecycle.State state = Lifecycle.State.CREATED;
        hastext.getMin("markState");
        hastext.getMin("setCurrentState");
        hastext.getMax(state);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public <T extends setMin> T getExtraData(Class<T> cls) {
        return (setMin) this.mExtraDataMap.get(cls);
    }

    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !setOnKeyListener.getMin(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !setOnKeyListener.getMin(decorView, keyEvent)) {
            return setOnKeyListener.setMin(this, decorView, this, keyEvent);
        }
        return true;
    }
}
