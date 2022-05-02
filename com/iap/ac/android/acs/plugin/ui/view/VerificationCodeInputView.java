package com.iap.ac.android.acs.plugin.ui.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.R;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.acs.plugin.ui.view.VerificationCodeEditText;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.common.log.ACLog;

public class VerificationCodeInputView extends LinearLayout implements TextWatcher, View.OnKeyListener, View.OnFocusChangeListener, VerificationCodeEditText.OnTextMenuListener {
    private static final int SIZE = 4;
    private EditText[] mCodeEditTexts;
    private OnCompleteListener mOnCompleteListener;

    public interface OnCompleteListener {
        void onComplete(String str);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public VerificationCodeInputView(@NonNull Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.acplugin_layout_verification_code_input_view, this, true);
        initView();
    }

    public VerificationCodeInputView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.acplugin_layout_verification_code_input_view, this, true);
        initView();
    }

    public VerificationCodeInputView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.acplugin_layout_verification_code_input_view, this, true);
        initView();
    }

    public void afterTextChanged(Editable editable) {
        if (!(editable == null || editable.length() == 0)) {
            focus();
        }
        Editable text = this.mCodeEditTexts[3].getText();
        if (text != null && text.length() > 0) {
            OnCompleteListener onCompleteListener = this.mOnCompleteListener;
            if (onCompleteListener != null) {
                onCompleteListener.onComplete(getCode());
            }
            UIUtils.hideSoftInput(getContext(), this);
        }
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            focus();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i == 67 && keyEvent.getAction() == 0) {
            int i2 = 3;
            while (i2 >= 0) {
                EditText editText = this.mCodeEditTexts[i2];
                Editable text = editText.getText();
                if (text == null || text.length() != 1) {
                    i2--;
                } else {
                    ACLog.d(Constants.TAG, "VerificationCodeInputView#onKey, delete code in position: ".concat(String.valueOf(i2)));
                    editText.setText("");
                    editText.requestFocus();
                    return false;
                }
            }
            this.mCodeEditTexts[0].requestFocus();
        }
        return false;
    }

    public void onPaste(String str) {
        if (!UIUtils.isNumeric(str)) {
            ACLog.e(Constants.TAG, "VerificationCodeInputView#onPaste, content is not numeric");
            return;
        }
        ACLog.d(Constants.TAG, "VerificationCodeInputView#onPaste, content: ".concat(String.valueOf(str)));
        int i = 0;
        while (i < str.length() && i < 4) {
            this.mCodeEditTexts[i].setText(String.valueOf(str.charAt(i)));
            i++;
        }
    }

    public void setOnCompleteListener(@NonNull OnCompleteListener onCompleteListener) {
        this.mOnCompleteListener = onCompleteListener;
    }

    public void showSoftInput() {
        for (int i = 0; i < 4; i++) {
            EditText editText = this.mCodeEditTexts[i];
            if (editText.isFocused()) {
                UIUtils.showSoftInput(getContext(), editText);
                return;
            }
        }
    }

    public void clear() {
        for (int i = 3; i >= 0; i--) {
            this.mCodeEditTexts[i].setText("");
        }
        this.mCodeEditTexts[0].requestFocus();
    }

    private void initView() {
        VerificationCodeEditText verificationCodeEditText = (VerificationCodeEditText) findViewById(R.id.code_edit_text_1);
        verificationCodeEditText.setOnTextMenuListener(this);
        this.mCodeEditTexts = new EditText[]{verificationCodeEditText, (EditText) findViewById(R.id.code_edit_text_2), (EditText) findViewById(R.id.code_edit_text_3), (EditText) findViewById(R.id.code_edit_text_4)};
        for (int i = 0; i < 4; i++) {
            EditText editText = this.mCodeEditTexts[i];
            editText.addTextChangedListener(this);
            editText.setOnKeyListener(this);
            editText.setOnFocusChangeListener(this);
        }
    }

    private void focus() {
        int i = 0;
        while (i < 4) {
            EditText editText = this.mCodeEditTexts[i];
            Editable text = editText.getText();
            if (text == null || text.length() > 0) {
                i++;
            } else {
                editText.requestFocus();
                return;
            }
        }
        this.mCodeEditTexts[3].requestFocus();
        this.mCodeEditTexts[3].setSelection(1);
    }

    private String getCode() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(this.mCodeEditTexts[i].getText());
        }
        return sb.toString();
    }
}
