package com.iap.ac.android.acs.plugin.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.R;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.common.log.ACLog;

@SuppressLint({"AppCompatCustomView"})
public class ACPluginSearchBar extends EditText {
    private Drawable mClearBtnDrawable;
    /* access modifiers changed from: private */
    public OnSearchListener mOnSearchListener;

    public interface OnSearchListener {
        void onSearch(CharSequence charSequence);
    }

    public ACPluginSearchBar(@NonNull Context context) {
        super(context);
        initView();
    }

    public ACPluginSearchBar(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }

    public ACPluginSearchBar(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if ((getCompoundDrawables()[2] != null) && motionEvent.getAction() == 1) {
            if (motionEvent.getX() <= ((float) ((getWidth() - getPaddingRight()) - this.mClearBtnDrawable.getIntrinsicWidth()))) {
                z = false;
            }
            if (z) {
                ACLog.d(Constants.TAG, "ACPluginSearchBar#onTouchEvent, click X button");
                setText("");
                setClearBtnVisible(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        boolean z2 = false;
        if (!z) {
            setCursorVisible(false);
        } else {
            setCursorVisible(true);
            if (!TextUtils.isEmpty(getText().toString())) {
                z2 = true;
            }
        }
        setClearBtnVisible(z2);
    }

    public void setOnSearchListener(@NonNull OnSearchListener onSearchListener) {
        this.mOnSearchListener = onSearchListener;
    }

    private void initView() {
        int dp2px = UIUtils.dp2px(getContext(), 20);
        Drawable drawable = getResources().getDrawable(R.drawable.acplugin_clear_icon);
        this.mClearBtnDrawable = drawable;
        drawable.setBounds(0, 0, dp2px, dp2px);
        setClearBtnVisible(false);
        addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                ACPluginSearchBar.this.setClearBtnVisible(!TextUtils.isEmpty(charSequence));
                if (ACPluginSearchBar.this.mOnSearchListener != null) {
                    ACPluginSearchBar.this.mOnSearchListener.onSearch(charSequence);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void setClearBtnVisible(boolean z) {
        setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], z ? this.mClearBtnDrawable : null, getCompoundDrawables()[3]);
    }
}
