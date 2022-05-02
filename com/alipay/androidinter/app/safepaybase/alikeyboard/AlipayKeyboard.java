package com.alipay.androidinter.app.safepaybase.alikeyboard;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alipay.androidinter.app.safepaybase.util.ResUtils;
import com.alipay.mobile.verifyidentity.uitools.R;
import java.util.HashMap;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class AlipayKeyboard extends LinearLayout implements OnKeyboardListener {
    private static final Object LOCK_SHOW_KEYBOARD = new Object();
    /* access modifiers changed from: private */
    public AliKeyboardAction cachedKeyboardAction = AliKeyboardAction.None;
    private AliKeyboardType currentKeyboard = AliKeyboardType.none;
    private EditText editText;
    private boolean isShowKeyboard = false;
    private boolean isSwitchedSystemKeyboard = false;
    private final HashMap<AliKeyboardType, AbstractKeyboard> keyboardMap = new HashMap<>();
    private AlipayKeyboardActionListener mActionListener = null;
    private StatisticInterface mStatisticImpl = null;

    enum AliKeyboardAction {
        None,
        Show,
        Hide
    }

    public boolean isShowKeyboard() {
        return this.isShowKeyboard;
    }

    public AlipayKeyboard(Context context) {
        super(context);
        ResUtils.setUiContext(context);
    }

    public AlipayKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: com.alipay.androidinter.app.safepaybase.alikeyboard.AlipayKeyboard$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$alipay$androidinter$app$safepaybase$alikeyboard$AliKeyboardType;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.alipay.androidinter.app.safepaybase.alikeyboard.AliKeyboardType[] r0 = com.alipay.androidinter.app.safepaybase.alikeyboard.AliKeyboardType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$alipay$androidinter$app$safepaybase$alikeyboard$AliKeyboardType = r0
                com.alipay.androidinter.app.safepaybase.alikeyboard.AliKeyboardType r1 = com.alipay.androidinter.app.safepaybase.alikeyboard.AliKeyboardType.none     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$alipay$androidinter$app$safepaybase$alikeyboard$AliKeyboardType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alipay.androidinter.app.safepaybase.alikeyboard.AliKeyboardType r1 = com.alipay.androidinter.app.safepaybase.alikeyboard.AliKeyboardType.abc     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$alipay$androidinter$app$safepaybase$alikeyboard$AliKeyboardType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alipay.androidinter.app.safepaybase.alikeyboard.AliKeyboardType r1 = com.alipay.androidinter.app.safepaybase.alikeyboard.AliKeyboardType.money     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$alipay$androidinter$app$safepaybase$alikeyboard$AliKeyboardType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.alipay.androidinter.app.safepaybase.alikeyboard.AliKeyboardType r1 = com.alipay.androidinter.app.safepaybase.alikeyboard.AliKeyboardType.num     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$alipay$androidinter$app$safepaybase$alikeyboard$AliKeyboardType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.alipay.androidinter.app.safepaybase.alikeyboard.AliKeyboardType r1 = com.alipay.androidinter.app.safepaybase.alikeyboard.AliKeyboardType.idcard     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$alipay$androidinter$app$safepaybase$alikeyboard$AliKeyboardType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.alipay.androidinter.app.safepaybase.alikeyboard.AliKeyboardType r1 = com.alipay.androidinter.app.safepaybase.alikeyboard.AliKeyboardType.phone     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.androidinter.app.safepaybase.alikeyboard.AlipayKeyboard.AnonymousClass2.<clinit>():void");
        }
    }

    private void switchKeyboard() {
        switch (AnonymousClass2.$SwitchMap$com$alipay$androidinter$app$safepaybase$alikeyboard$AliKeyboardType[this.currentKeyboard.ordinal()]) {
            case 1:
                initializeNoneKeyboard();
                return;
            case 2:
                initializeQwertyKeyboard();
                return;
            case 3:
                initializeMoneyKeyboard();
                return;
            case 4:
                initializeNumKeyboard();
                return;
            case 5:
                initializeIdcardKeyboard();
                return;
            case 6:
                initializePhoneKeyboard();
                return;
            default:
                initializeQwertyKeyboard();
                return;
        }
    }

    public void initializeKeyboard(FrameLayout frameLayout) {
        if (Build.VERSION.SDK_INT >= 16 && ((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            this.keyboardMap.put(AliKeyboardType.num, new SecureNumKeyboard(getContext(), this));
            this.keyboardMap.put(AliKeyboardType.money, new SecureMoneyKeyboard(getContext(), this));
            this.keyboardMap.put(AliKeyboardType.abc, new SecureQwertyKeyboard(getContext(), frameLayout, this));
            this.keyboardMap.put(AliKeyboardType.idcard, new SecureNumKeyboard(getContext(), this, 2));
            this.keyboardMap.put(AliKeyboardType.phone, new SecureNumKeyboard(getContext(), this, 1));
        } else {
            this.keyboardMap.put(AliKeyboardType.num, new NumKeyboard(getContext(), this));
            this.keyboardMap.put(AliKeyboardType.money, new MoneyKeyboard(getContext(), this));
            this.keyboardMap.put(AliKeyboardType.abc, new QwertyKeyboard(getContext(), frameLayout, this));
            this.keyboardMap.put(AliKeyboardType.idcard, new NumKeyboard(getContext(), this, 2));
            this.keyboardMap.put(AliKeyboardType.phone, new NumKeyboard(getContext(), this, 1));
        }
        setOrientation(1);
        setBackgroundResource(R.drawable.keyboard_shape);
        removeAllViews();
    }

    private void initializeNoneKeyboard() {
        hideKeyboard();
    }

    private void initializeNumKeyboard() {
        removeAllViews();
        addView(this.keyboardMap.get(AliKeyboardType.num).getView());
    }

    private void initializeMoneyKeyboard() {
        EditText editText2 = this.editText;
        if (editText2 != null) {
            editText2.setKeyListener(new MoneyKeyListener());
        }
        removeAllViews();
        addView(this.keyboardMap.get(AliKeyboardType.money).getView());
    }

    private void initializeQwertyKeyboard() {
        removeAllViews();
        addView(this.keyboardMap.get(AliKeyboardType.abc).getView());
    }

    private void initializeIdcardKeyboard() {
        removeAllViews();
        addView(this.keyboardMap.get(AliKeyboardType.idcard).getView());
    }

    private void initializePhoneKeyboard() {
        removeAllViews();
        addView(this.keyboardMap.get(AliKeyboardType.phone).getView());
    }

    /* access modifiers changed from: private */
    @TargetApi(14)
    public void showKeyboard(AliKeyboardType aliKeyboardType, EditText editText2) {
        synchronized (LOCK_SHOW_KEYBOARD) {
            this.cachedKeyboardAction = AliKeyboardAction.None;
            this.isShowKeyboard = true;
            this.editText = editText2;
            if (!(editText2 == null || (editText2 instanceof SecureEditText) || aliKeyboardType == AliKeyboardType.money)) {
                this.editText.setAccessibilityDelegate(new SecureAccessbilityDelegate());
            }
            if (this.currentKeyboard != aliKeyboardType) {
                this.currentKeyboard = aliKeyboardType;
                switchKeyboard();
            }
            setVisibility(0);
        }
    }

    public void showKeyboard(final AliKeyboardType aliKeyboardType, final EditText editText2, long j) {
        if (this.isSwitchedSystemKeyboard) {
            this.isSwitchedSystemKeyboard = false;
            j = 200;
        }
        if (j <= 0) {
            showKeyboard(aliKeyboardType, editText2);
            return;
        }
        this.isShowKeyboard = true;
        this.cachedKeyboardAction = AliKeyboardAction.Show;
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public void run() {
                if (AlipayKeyboard.this.cachedKeyboardAction == AliKeyboardAction.Show) {
                    AlipayKeyboard.this.showKeyboard(aliKeyboardType, editText2);
                } else if (AlipayKeyboard.this.cachedKeyboardAction == AliKeyboardAction.Hide) {
                    AlipayKeyboard.this.hideKeyboard();
                }
            }
        }, j);
    }

    public void hideKeyboard() {
        synchronized (LOCK_SHOW_KEYBOARD) {
            this.cachedKeyboardAction = AliKeyboardAction.None;
            this.isShowKeyboard = false;
            this.editText = null;
            this.currentKeyboard = AliKeyboardType.none;
            setVisibility(8);
        }
    }

    public void onDel() {
        AlipayKeyboardActionListener alipayKeyboardActionListener = this.mActionListener;
        if (alipayKeyboardActionListener != null) {
            alipayKeyboardActionListener.onDel();
        }
        EditText editText2 = this.editText;
        if (editText2 != null && editText2.getText() != null) {
            int selectionStart = this.editText.getSelectionStart();
            int selectionEnd = this.editText.getSelectionEnd();
            if (selectionStart > 0) {
                if (selectionStart == selectionEnd) {
                    this.editText.getText().delete(selectionStart - 1, selectionStart);
                } else {
                    this.editText.getText().delete(selectionStart, selectionEnd);
                }
            }
        }
    }

    public void onOK() {
        AlipayKeyboardActionListener alipayKeyboardActionListener = this.mActionListener;
        if (alipayKeyboardActionListener != null) {
            alipayKeyboardActionListener.onOk();
        }
        hideKeyboard();
    }

    public void onInput(String str) {
        AlipayKeyboardActionListener alipayKeyboardActionListener = this.mActionListener;
        if (alipayKeyboardActionListener != null) {
            alipayKeyboardActionListener.onInput(str);
        }
        EditText editText2 = this.editText;
        if (editText2 != null) {
            int selectionStart = editText2.getSelectionStart();
            this.editText.getText().insert(selectionStart, str);
            setSelection(this.editText, selectionStart + str.length());
        }
    }

    public void onStatisticEvent(String str) {
        StatisticInterface statisticInterface = this.mStatisticImpl;
        if (statisticInterface != null) {
            statisticInterface.onStatistic(str);
        }
    }

    private void setSelection(EditText editText2, int i) {
        Editable editableText;
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1682018341, oncanceled);
            onCancelLoad.getMin(-1682018341, oncanceled);
        }
        if (editText2 != null && (editableText = editText2.getEditableText()) != null) {
            int length = editableText.length();
            if (i < 0 || i > length) {
                Selection.setSelection(editableText, length);
            } else {
                Selection.setSelection(editableText, i);
            }
        }
    }

    public void setKeyboardActionListener(AlipayKeyboardActionListener alipayKeyboardActionListener) {
        this.mActionListener = alipayKeyboardActionListener;
    }

    public void setStatisticInterface(StatisticInterface statisticInterface) {
        this.mStatisticImpl = statisticInterface;
    }
}
