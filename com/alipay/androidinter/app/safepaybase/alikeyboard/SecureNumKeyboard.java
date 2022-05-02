package com.alipay.androidinter.app.safepaybase.alikeyboard;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.androidinter.app.safepaybase.alikeyboard.SecureFrameLayout;
import com.alipay.androidinter.app.safepaybase.alikeyboard.SecureTextView;
import com.alipay.mobile.verifyidentity.uitools.R;
import java.util.HashMap;
import java.util.Locale;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class SecureNumKeyboard extends AbstractKeyboard implements View.OnTouchListener, TextToSpeech.OnInitListener, View.OnClickListener, SecureTextView.SendAccessiBilityEventListener, SecureFrameLayout.SendAccessiBilityEventListener {
    public static final int FLAG_IDCARD = 2;
    public static final int FLAG_PHONE = 1;
    private View fake_view;
    /* access modifiers changed from: private */
    public Context mContext;
    public int mFlag;
    /* access modifiers changed from: private */
    public AccessibilityManager mManager;
    /* access modifiers changed from: private */
    public boolean mTextToSpeechInitialized;
    /* access modifiers changed from: private */
    public TextToSpeech mTts;

    private boolean onTouchUp(View view) {
        return false;
    }

    public SecureNumKeyboard(Context context, OnKeyboardListener onKeyboardListener) {
        this(context, onKeyboardListener, 0);
    }

    public SecureNumKeyboard(Context context, OnKeyboardListener onKeyboardListener, int i) {
        this.mFlag = 0;
        this.mContext = null;
        this.mTts = null;
        this.mManager = null;
        this.mTextToSpeechInitialized = false;
        this.mFlag = i;
        this.keyboardView = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.keyboard_secure_num, (ViewGroup) null, false);
        this.onKeyboardListener = onKeyboardListener;
        this.mContext = context;
        initTtsIfTalkBack();
        initialize(context);
    }

    private void setEventListener(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setOnClickListener(this);
        } else {
            view.setOnTouchListener(this);
        }
    }

    public void onClick(View view) {
        onTouchDown(view);
    }

    private void initialize(Context context) {
        int childCount = this.keyboardView.getChildCount();
        int rowHeight = getRowHeight(context);
        for (int i = 0; i < childCount; i++) {
            LinearLayout linearLayout = (LinearLayout) this.keyboardView.getChildAt(i);
            if (linearLayout != null) {
                ((LinearLayout.LayoutParams) linearLayout.getLayoutParams()).height = rowHeight;
                int childCount2 = linearLayout.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt = linearLayout.getChildAt(i2);
                    setEventListener(childAt);
                    setDynamicTextView(childAt);
                    if (childAt instanceof SecureTextView) {
                        ((SecureTextView) childAt).setSendAccessiBilityEventListener(this);
                    }
                    if (childAt instanceof SecureFrameLayout) {
                        SecureFrameLayout secureFrameLayout = (SecureFrameLayout) childAt;
                        secureFrameLayout.setSendAccessiBilityEventListener(this);
                        this.fake_view = secureFrameLayout.getChildAt(0);
                    }
                }
            }
        }
    }

    private void setDynamicTextView(View view) {
        if (view.getId() == R.id.key_num_dymic) {
            int i = this.mFlag;
            if (i == 2 || i == 1) {
                TextView textView = (TextView) view;
                if (this.mFlag == 2) {
                    textView.setText("X");
                } else {
                    textView.setText("-");
                }
                textView.setBackgroundResource(R.drawable.keyboard_key_num_bg);
            }
        }
    }

    private int getRowHeight(Context context) {
        double d = (double) context.getResources().getDisplayMetrics().density;
        int i = context.getResources().getDisplayMetrics().heightPixels;
        int i2 = context.getResources().getDisplayMetrics().widthPixels;
        if (i2 <= i) {
            i = i2;
        }
        Double.isNaN(d);
        double d2 = (double) ((i - (((int) (d * 4.0d)) * 4)) / 3);
        Double.isNaN(d2);
        return (int) (d2 * 0.466d);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            return onTouchDown(view);
        }
        if (motionEvent.getAction() == 1) {
            return onTouchUp(view);
        }
        return false;
    }

    private boolean onTouchDown(View view) {
        if (view.getId() == R.id.key_num_del1) {
            onDel();
            return false;
        } else if (!(view instanceof TextView)) {
            return false;
        } else {
            onInput(((TextView) view).getText().toString());
            return false;
        }
    }

    @TargetApi(14)
    private void initTtsIfTalkBack() {
        this.mManager = (AccessibilityManager) this.mContext.getSystemService("accessibility");
        this.keyboardView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(View view) {
                if (SecureNumKeyboard.this.mManager.isTouchExplorationEnabled()) {
                    try {
                        TextToSpeech unused = SecureNumKeyboard.this.mTts = new TextToSpeech(SecureNumKeyboard.this.mContext, SecureNumKeyboard.this);
                    } catch (SecurityException unused2) {
                        boolean unused3 = SecureNumKeyboard.this.mTextToSpeechInitialized = false;
                    }
                }
            }

            public void onViewDetachedFromWindow(View view) {
                if (SecureNumKeyboard.this.mTextToSpeechInitialized) {
                    SecureNumKeyboard.this.mTts.shutdown();
                    boolean unused = SecureNumKeyboard.this.mTextToSpeechInitialized = false;
                }
            }
        });
    }

    public void onInit(int i) {
        if (i == 0) {
            if (isZhLanguage()) {
                int language = this.mTts.setLanguage(Locale.CHINA);
                if (language == -1 || language == -2) {
                    this.mTts.setLanguage(Locale.ENGLISH);
                }
            } else {
                this.mTts.setLanguage(Locale.ENGLISH);
            }
            this.mTextToSpeechInitialized = true;
        }
    }

    @TargetApi(16)
    private boolean proccessAccessiBilityEvent(SecureTextView secureTextView, int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1175245219, oncanceled);
            onCancelLoad.getMin(-1175245219, oncanceled);
        }
        if (i == 128) {
            if (this.mTextToSpeechInitialized) {
                this.fake_view.sendAccessibilityEvent(32768);
                secureTextView.performAccessibilityAction(64, (Bundle) null);
                announceTextOut((TextView) secureTextView);
            }
            return true;
        } else if (i == 1) {
            if (this.mTextToSpeechInitialized) {
                announceTextOut((TextView) secureTextView);
            }
            return true;
        } else {
            if (i == 32768 && this.mTextToSpeechInitialized) {
                announceTextOut((TextView) secureTextView);
            }
            return true;
        }
    }

    @TargetApi(16)
    private boolean proccessAccessiBilityEvent(SecureFrameLayout secureFrameLayout, int i) {
        if (i == 128) {
            if (this.mTextToSpeechInitialized) {
                this.fake_view.sendAccessibilityEvent(32768);
                secureFrameLayout.performAccessibilityAction(64, (Bundle) null);
                announceTextOut(R.string.msp_secure_keyboard_del);
            }
            return true;
        } else if (i == 1) {
            if (this.mTextToSpeechInitialized) {
                announceTextOut(R.string.msp_secure_keyboard_already_del);
            }
            return true;
        } else {
            if (i == 32768 && this.mTextToSpeechInitialized) {
                announceTextOut(R.string.msp_secure_keyboard_del);
            }
            return true;
        }
    }

    @TargetApi(14)
    private void announceTextOut(String str) {
        if (this.mManager.isTouchExplorationEnabled()) {
            this.mTts.speak(str, 0, (HashMap) null);
        }
    }

    private void announceTextOut(TextView textView) {
        announceTextOut(textView.getText().toString());
    }

    private void announceTextOut(int i) {
        announceTextOut(this.mContext.getString(i));
    }

    public boolean handleAccessiBilityEvent(SecureTextView secureTextView, int i) {
        return proccessAccessiBilityEvent(secureTextView, i);
    }

    public boolean handleAccessiBilityEvent(SecureFrameLayout secureFrameLayout, int i) {
        return proccessAccessiBilityEvent(secureFrameLayout, i);
    }

    private boolean isZhLanguage() {
        return "zh".equals(Locale.getDefault().getLanguage());
    }

    public View getView() {
        return super.getView();
    }
}
