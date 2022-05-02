package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import o.IMediaControllerCallback;
import o.ITrustedWebActivityCallback;
import o.addQueueItem;
import o.getLaunchPendingIntent;
import o.getPackageName;
import o.getShuffleMode;
import o.isTransportControlEnabled;
import o.onCreateSupportNavigateUpTaskStack;
import o.onPostCreate;
import o.onStart;
import o.performMenuItemShortcut;
import o.sendCommand;
import o.setSupportProgressBarIndeterminate;

public class AppCompatEditText extends EditText implements onStart, onPostCreate {
    private final IMediaControllerCallback.Stub.Proxy mBackgroundTintHelper;
    private final performMenuItemShortcut mDefaultOnReceiveContentListener;
    private final getLaunchPendingIntent mTextClassifierHelper;
    private final getPackageName mTextHelper;

    public AppCompatEditText(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatEditText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ITrustedWebActivityCallback.Stub.getMin.extraCallback);
    }

    public AppCompatEditText(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(addQueueItem.getMax(context), attributeSet, i);
        getShuffleMode.getMax(getContext());
        IMediaControllerCallback.Stub.Proxy proxy = new IMediaControllerCallback.Stub.Proxy(this);
        this.mBackgroundTintHelper = proxy;
        proxy.setMin(attributeSet, i);
        getPackageName getpackagename = new getPackageName(this);
        this.mTextHelper = getpackagename;
        getpackagename.getMax(attributeSet, i);
        this.mTextHelper.setMax();
        this.mTextClassifierHelper = new getLaunchPendingIntent(this);
        this.mDefaultOnReceiveContentListener = new performMenuItemShortcut();
    }

    @Nullable
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            proxy.setMax(i);
        }
    }

    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            proxy.getMax(drawable);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            proxy.setMax(colorStateList);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            return proxy.getMax();
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            proxy.setMin(mode);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            return proxy.length();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        IMediaControllerCallback.Stub.Proxy proxy = this.mBackgroundTintHelper;
        if (proxy != null) {
            proxy.setMax();
        }
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.setMax();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        getPackageName getpackagename = this.mTextHelper;
        if (getpackagename != null) {
            getpackagename.setMax(context, i);
        }
    }

    @Nullable
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getMax(this, onCreateInputConnection, editorInfo);
        InputConnection min = isTransportControlEnabled.setMin(onCreateInputConnection, editorInfo, this);
        String[] onPostMessage = ViewCompat.onPostMessage(this);
        if (min == null || onPostMessage == null) {
            return min;
        }
        setSupportProgressBarIndeterminate.length(editorInfo, onPostMessage);
        return onCreateSupportNavigateUpTaskStack.getMax(min, editorInfo, sendCommand.length(this));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.length((TextView) this, callback));
    }

    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        getLaunchPendingIntent getlaunchpendingintent;
        if (Build.VERSION.SDK_INT >= 28 || (getlaunchpendingintent = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            getlaunchpendingintent.length(textClassifier);
        }
    }

    @RequiresApi(api = 26)
    @NonNull
    public TextClassifier getTextClassifier() {
        getLaunchPendingIntent getlaunchpendingintent;
        if (Build.VERSION.SDK_INT >= 28 || (getlaunchpendingintent = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        return getlaunchpendingintent.setMin();
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (sendCommand.getMin(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        if (sendCommand.setMin(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Nullable
    public ContentInfoCompat onReceiveContent(@NonNull ContentInfoCompat contentInfoCompat) {
        return this.mDefaultOnReceiveContentListener.setMin(this, contentInfoCompat);
    }
}
