package com.iap.ac.android.acs.plugin.ui.view;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.common.log.ACLog;

@SuppressLint({"AppCompatCustomView"})
public class VerificationCodeEditText extends EditText {
    private OnTextMenuListener mOnTextMenuListener;

    public interface OnTextMenuListener {
        void onPaste(String str);
    }

    public VerificationCodeEditText(@NonNull Context context) {
        super(context);
    }

    public VerificationCodeEditText(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VerificationCodeEditText(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean onTextContextMenuItem(int i) {
        ClipboardManager clipboardManager;
        ClipData.Item itemAt;
        if (i == 16908322 && (clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard")) != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClipDescription() != null && clipboardManager.getPrimaryClipDescription().hasMimeType("text/plain") && (itemAt = clipboardManager.getPrimaryClip().getItemAt(0)) != null && !TextUtils.isEmpty(itemAt.getText())) {
            String charSequence = itemAt.getText().toString();
            ACLog.d(Constants.TAG, "VerificationCodeEditText#onTextContextMenuItem, paste: ".concat(String.valueOf(charSequence)));
            OnTextMenuListener onTextMenuListener = this.mOnTextMenuListener;
            if (onTextMenuListener != null) {
                onTextMenuListener.onPaste(charSequence);
            }
        }
        return super.onTextContextMenuItem(i);
    }

    public void setOnTextMenuListener(@NonNull OnTextMenuListener onTextMenuListener) {
        this.mOnTextMenuListener = onTextMenuListener;
    }
}
