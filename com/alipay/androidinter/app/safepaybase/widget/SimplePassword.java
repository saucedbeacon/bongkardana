package com.alipay.androidinter.app.safepaybase.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.androidinter.app.safepaybase.EncryptRandomType;
import com.alipay.androidinter.app.safepaybase.OnConfirmListener;
import com.alipay.androidinter.app.safepaybase.alikeyboard.SecureAccessbilityDelegate;
import com.alipay.androidinter.app.safepaybase.log.LogTracer;
import com.alipay.androidinter.app.safepaybase.util.EditTextManager;
import com.alipay.androidinter.app.safepaybase.util.EditTextUtil;
import com.alipay.mobile.verifyidentity.uitools.R;
import java.util.ArrayList;
import java.util.List;

public class SimplePassword extends LinearLayout {
    /* access modifiers changed from: private */
    public int inputCharCount = 6;
    /* access modifiers changed from: private */
    public int mBizId = 0;
    private List<ImageView> mBlackPointList;
    private List<View> mBlackPointRlList;
    /* access modifiers changed from: private */
    public EditText mEditText;
    /* access modifiers changed from: private */
    public String mEncryptRandomString = "";
    private LinearLayout mLayout;
    /* access modifiers changed from: private */
    public View.OnFocusChangeListener mOnFocusChangeListener;
    /* access modifiers changed from: private */
    public String mRsaPublicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDENksAVqDoz5SMCZq0bsZwE+I3NjrANyTTwUVSf1+ec1PfPB4tiocEpYJFCYju9MIbawR8ivECbUWjpffZq5QllJg+19CB7V5rYGcEnb/M7CS3lFF2sNcRFJUtXUUAqyR3/l7PmpxTwObZ4DLG258dhE2vFlVGXjnuLs+FI2hg4QIDAQAB";
    /* access modifiers changed from: private */
    public String mSimplePassword;
    /* access modifiers changed from: private */
    public OnConfirmListener mSubmitInterface;
    /* access modifiers changed from: private */
    public EncryptRandomType mType = EncryptRandomType.randombefore;
    /* access modifiers changed from: private */
    public EditTextUtil util = EditTextManager.getEditTextUtils();

    public SimplePassword(Context context) {
        super(context);
    }

    public SimplePassword(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.safe_input_simple_password, this, true);
        initView();
    }

    @TargetApi(14)
    private void initView() {
        this.mLayout = (LinearLayout) findViewById(R.id.mini_linSimplePwdComponent);
        this.mBlackPointRlList = new ArrayList();
        View findViewById = findViewById(R.id.mini_spwd_rl_1);
        View findViewById2 = findViewById(R.id.mini_spwd_rl_2);
        View findViewById3 = findViewById(R.id.mini_spwd_rl_3);
        View findViewById4 = findViewById(R.id.mini_spwd_rl_4);
        View findViewById5 = findViewById(R.id.mini_spwd_rl_5);
        View findViewById6 = findViewById(R.id.mini_spwd_rl_6);
        this.mBlackPointRlList.add(findViewById);
        this.mBlackPointRlList.add(findViewById2);
        this.mBlackPointRlList.add(findViewById3);
        this.mBlackPointRlList.add(findViewById4);
        this.mBlackPointRlList.add(findViewById5);
        this.mBlackPointRlList.add(findViewById6);
        ArrayList arrayList = new ArrayList();
        this.mBlackPointList = arrayList;
        arrayList.add((ImageView) findViewById(R.id.mini_spwd_iv_1));
        this.mBlackPointList.add((ImageView) findViewById(R.id.mini_spwd_iv_2));
        this.mBlackPointList.add((ImageView) findViewById(R.id.mini_spwd_iv_3));
        this.mBlackPointList.add((ImageView) findViewById(R.id.mini_spwd_iv_4));
        this.mBlackPointList.add((ImageView) findViewById(R.id.mini_spwd_iv_5));
        this.mBlackPointList.add((ImageView) findViewById(R.id.mini_spwd_iv_6));
        EditText editText = (EditText) findViewById(R.id.mini_spwd_input);
        this.mEditText = editText;
        editText.setFocusable(true);
        this.mEditText.addTextChangedListener(new TextWatcherImpl());
        this.mEditText.setInputType(2);
        this.mEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.mEditText.setTypeface(Typeface.MONOSPACE);
        this.mEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z) {
                if (SimplePassword.this.mOnFocusChangeListener != null) {
                    SimplePassword.this.mOnFocusChangeListener.onFocusChange(view, z);
                }
            }
        });
        this.mEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return i == 6;
            }
        });
        this.mEditText.setAccessibilityDelegate(new SecureAccessbilityDelegate());
    }

    public void setBizId(int i) {
        this.mBizId = i;
    }

    public class TextWatcherImpl implements TextWatcher {
        private boolean isSendSubmit = false;
        private boolean skipTextChanged = false;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public TextWatcherImpl() {
        }

        public void afterTextChanged(Editable editable) {
            try {
                int length = editable.length();
                for (int i = 0; i < length; i++) {
                    if (editable.charAt(i) != '0') {
                        this.skipTextChanged = true;
                        editable.replace(i, i + 1, "0");
                    }
                }
                String unused = SimplePassword.this.mSimplePassword = SimplePassword.this.mEditText.getText().toString();
                SimplePassword.this.setPointView(SimplePassword.this.mSimplePassword.length());
                if (SimplePassword.this.mSimplePassword.length() == SimplePassword.this.inputCharCount) {
                    if (SimplePassword.this.mSubmitInterface != null && !this.isSendSubmit) {
                        SimplePassword.this.mSubmitInterface.onUserConfirm(SimplePassword.this.util.getText(SimplePassword.this.mBizId, SimplePassword.this.mRsaPublicKey, SimplePassword.this.mEncryptRandomString, SimplePassword.this.mType));
                    }
                    if (!this.isSendSubmit) {
                        this.isSendSubmit = true;
                        return;
                    }
                    return;
                }
                this.isSendSubmit = false;
            } catch (Exception e) {
                LogTracer.getInstance().printExceptionStackTrace(e);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!this.skipTextChanged) {
                try {
                    SimplePassword.this.util.OnTextChanged(SimplePassword.this.mBizId, charSequence.toString(), i, i2, i3);
                } catch (Throwable th) {
                    LogTracer.getInstance().printExceptionStackTrace(th);
                }
            }
            this.skipTextChanged = false;
        }
    }

    public EditText getEditText() {
        return this.mEditText;
    }

    public void setmSubmitInterface(OnConfirmListener onConfirmListener) {
        this.mSubmitInterface = onConfirmListener;
    }

    /* access modifiers changed from: private */
    public void setPointView(int i) {
        for (int i2 = 0; i2 < this.mBlackPointList.size(); i2++) {
            if (i2 < i) {
                if (Build.VERSION.SDK_INT < 16) {
                    this.mBlackPointList.get(i2).setBackgroundDrawable(getResources().getDrawable(R.drawable.password_point_selected));
                } else {
                    this.mBlackPointList.get(i2).setBackground(getResources().getDrawable(R.drawable.password_point_selected));
                }
            } else if (Build.VERSION.SDK_INT < 16) {
                this.mBlackPointList.get(i2).setBackgroundDrawable(getResources().getDrawable(R.drawable.password_point));
            } else {
                this.mBlackPointList.get(i2).setBackground(getResources().getDrawable(R.drawable.password_point));
            }
        }
    }

    public void setInputCharCount(int i) {
        if (i != 0) {
            this.inputCharCount = i;
            this.mEditText.setMaxLines(i);
            for (int i2 = 0; i2 < this.mBlackPointRlList.size(); i2++) {
                if (i2 < i) {
                    this.mBlackPointRlList.get(i2).setVisibility(0);
                    if (i2 == i - 1) {
                        if (Build.VERSION.SDK_INT < 16) {
                            this.mBlackPointRlList.get(i2).setBackgroundDrawable(getResources().getDrawable(R.drawable.mini_simple_pwd_right));
                        } else {
                            this.mBlackPointRlList.get(i2).setBackground(getResources().getDrawable(R.drawable.mini_simple_pwd_right));
                        }
                    }
                } else {
                    this.mBlackPointRlList.get(i2).setVisibility(8);
                }
            }
        }
    }

    public void clearText() {
        EditText editText = this.mEditText;
        if (editText != null) {
            editText.setText("");
            this.util.clear(this.mBizId);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mLayout.setOnClickListener(onClickListener);
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.mOnFocusChangeListener = onFocusChangeListener;
    }

    public void setRsaPublicKey(String str) {
        this.mRsaPublicKey = str;
    }

    public void setEncryptRandomStringAndType(String str, EncryptRandomType encryptRandomType) {
        this.mEncryptRandomString = str;
        this.mType = encryptRandomType;
    }
}
