package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegate;
import o.ITrustedWebActivityCallback;
import o.IconCompatParcelizer;
import o.setOnKeyListener;

public class notifyNotificationWithChannel extends Dialog implements getSmallIconBitmap {
    private AppCompatDelegate mDelegate;
    private final setOnKeyListener.length mKeyDispatcher;

    public void onSupportActionModeFinished(IconCompatParcelizer iconCompatParcelizer) {
    }

    public void onSupportActionModeStarted(IconCompatParcelizer iconCompatParcelizer) {
    }

    @Nullable
    public IconCompatParcelizer onWindowStartingSupportActionMode(IconCompatParcelizer.getMin getmin) {
        return null;
    }

    public notifyNotificationWithChannel(Context context) {
        this(context, 0);
    }

    public notifyNotificationWithChannel(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new setOnKeyListener.length() {
            public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return notifyNotificationWithChannel.this.superDispatchKeyEvent(keyEvent);
            }
        };
        AppCompatDelegate delegate = getDelegate();
        delegate.setMin(getThemeResId(context, i));
        delegate.getMin((Bundle) null);
    }

    public notifyNotificationWithChannel(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.mKeyDispatcher = new setOnKeyListener.length() {
            public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return notifyNotificationWithChannel.this.superDispatchKeyEvent(keyEvent);
            }
        };
    }

    public void onCreate(Bundle bundle) {
        getDelegate().toIntRange();
        super.onCreate(bundle);
        getDelegate().getMin(bundle);
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().setMax();
    }

    public void setContentView(@LayoutRes int i) {
        getDelegate().length(i);
    }

    public void setContentView(View view) {
        getDelegate().setMax(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().setMin(view, layoutParams);
    }

    @Nullable
    public <T extends View> T findViewById(@IdRes int i) {
        return getDelegate().setMax(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().setMin(charSequence);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().setMin((CharSequence) getContext().getString(i));
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().getMin(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        getDelegate().setMin();
    }

    public void dismiss() {
        super.dismiss();
        getDelegate().isInside();
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().getMin(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        getDelegate().equals();
    }

    public AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AppCompatDelegate.getMin((Dialog) this, (getSmallIconBitmap) this);
        }
        return this.mDelegate;
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(ITrustedWebActivityCallback.Stub.getMin.onRelationshipValidationResult, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: package-private */
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return setOnKeyListener.setMin(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }
}
