package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.TextViewCompat;
import o.addQueueItem;
import o.cancelAll;
import o.getPackageName;
import o.getShuffleMode;
import o.isTransportControlEnabled;
import o.prepareFromUri;

public class AppCompatCheckedTextView extends CheckedTextView {
    private static final int[] setMax = {16843016};
    private final getPackageName setMin;

    public AppCompatCheckedTextView(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatCheckedTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public AppCompatCheckedTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(addQueueItem.getMax(context), attributeSet, i);
        getShuffleMode.getMax(getContext());
        getPackageName getpackagename = new getPackageName(this);
        this.setMin = getpackagename;
        getpackagename.getMax(attributeSet, i);
        this.setMin.setMax();
        prepareFromUri min = prepareFromUri.getMin(getContext(), attributeSet, setMax, i, 0);
        setCheckMarkDrawable(min.setMax(0));
        min.setMin.recycle();
    }

    public void setCheckMarkDrawable(@DrawableRes int i) {
        setCheckMarkDrawable(cancelAll.getMin(getContext(), i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        getPackageName getpackagename = this.setMin;
        if (getpackagename != null) {
            getpackagename.setMax(context, i);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getPackageName getpackagename = this.setMin;
        if (getpackagename != null) {
            getpackagename.setMax();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return isTransportControlEnabled.setMin(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.length((TextView) this, callback));
    }
}
