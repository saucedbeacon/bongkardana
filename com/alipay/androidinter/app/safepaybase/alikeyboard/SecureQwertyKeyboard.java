package com.alipay.androidinter.app.safepaybase.alikeyboard;

import android.annotation.SuppressLint;
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.alipay.androidinter.app.safepaybase.alikeyboard.SecureFrameLayout;
import com.alipay.androidinter.app.safepaybase.alikeyboard.SecureTextView;
import com.alipay.androidinter.app.safepaybase.util.ResUtils;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.alipay.mobile.verifyidentity.uitools.R;
import com.j256.ormlite.stmt.query.SimpleComparison;
import id.dana.data.constant.BranchLinkConstant;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class SecureQwertyKeyboard extends AbstractKeyboard implements View.OnClickListener, View.OnTouchListener, TextToSpeech.OnInitListener {
    private static final Map<String, String> signMap = new HashMap<String, String>() {
        {
            put("~", "msp_secure_key_tilde");
            put("!", "msp_secure_key_exclamation_point");
            put(AUScreenAdaptTool.PREFIX_ID, "msp_secure_key_at");
            put("#", "msp_secure_key_sharp");
            put("%", "msp_secure_key_percent");
            put("'", "msp_secure_key_quotesingle");
            put("&", "msp_secure_key_and");
            put("*", "msp_secure_key_star");
            put("?", "msp_secure_key_ask");
            put("(", "msp_secure_key_left_bracket");
            put(")", "msp_secure_key_right_bracket");
            put("-", "msp_secure_key_minus");
            put("_", "msp_secure_key_underscore");
            put(":", "msp_secure_key_colon");
            put(";", "msp_secure_key_semiconlon");
            put("/", "msp_secure_key_slash");
            put(SimpleComparison.LESS_THAN_OPERATION, "msp_secure_key_less");
            put(SimpleComparison.GREATER_THAN_OPERATION, "msp_secure_key_more");
            put("+", "msp_secure_key_plus");
            put(SimpleComparison.EQUAL_TO_OPERATION, "msp_secure_key_equal");
            put("÷", "msp_secure_key_divide");
            put("^", "msp_secure_key_hat");
            put("`", "msp_secure_key_apostrophe");
            put("[", "msp_secure_key_left_square");
            put("]", "msp_secure_key_right_square");
            put("\\", "msp_secure_key_backslash");
            put("|", "msp_secure_key_vertical");
            put("\"", "msp_secure_key_quotedouble");
            put("$", "msp_secure_key_dollar");
            put("￥", "msp_secure_key_money");
            put("{", "msp_secure_key_left_brace");
            put("}", "msp_secure_key_right_brace");
            put(",", "msp_secure_key_comma");
            put(".", "msp_secure_key_dot");
        }
    };
    private final String[] QWERT_123_SHIFT_DOWN_ROW_0 = {"1", "2", "3", "4", "5", "6", "7", PrepareException.ERROR_AUTH_FAIL, "9", "0"};
    private final String[] QWERT_123_SHIFT_DOWN_ROW_1 = {SimpleComparison.LESS_THAN_OPERATION, SimpleComparison.GREATER_THAN_OPERATION, "+", SimpleComparison.EQUAL_TO_OPERATION, "÷", "^", "`", "[", "]"};
    private final String[] QWERT_123_SHIFT_DOWN_ROW_2 = {"\\", "|", "\"", "$", "￥", "{", "}"};
    private final String[] QWERT_123_SHIFT_UP_ROW_0 = {"1", "2", "3", "4", "5", "6", "7", PrepareException.ERROR_AUTH_FAIL, "9", "0"};
    private final String[] QWERT_123_SHIFT_UP_ROW_1 = {"~", "!", AUScreenAdaptTool.PREFIX_ID, "#", "%", "'", "&", "*", "?"};
    private final String[] QWERT_123_SHIFT_UP_ROW_2 = {"(", ")", "-", "_", ":", ";", "/"};
    private final String[] QWERT_ABC_SHIFT_DOWN_ROW_0 = {"Q", "W", "E", "R", DiskFormatter.TB, "Y", "U", "I", "O", "P"};
    private final String[] QWERT_ABC_SHIFT_DOWN_ROW_1 = {"A", "S", "D", "F", DiskFormatter.GB, "H", "J", DiskFormatter.KB, "L"};
    private final String[] QWERT_ABC_SHIFT_DOWN_ROW_2 = {"Z", "X", "C", "V", DiskFormatter.B, "N", DiskFormatter.MB};
    private final String[] QWERT_ABC_SHIFT_UP_ROW_0 = {"q", "w", "e", BranchLinkConstant.PayloadKey.REFERRAL, SecurityConstants.KEY_TEXT, "y", "u", "i", "o", "p"};
    private final String[] QWERT_ABC_SHIFT_UP_ROW_1 = {"a", "s", "d", "f", "g", "h", "j", "k", "l"};
    private final String[] QWERT_ABC_SHIFT_UP_ROW_2 = {"z", "x", "c", SecurityConstants.KEY_VALUE, "b", "n", "m"};
    private FrameLayout cashierContainer;
    /* access modifiers changed from: private */
    public View fake_view;
    private FrameLayout ib_shift;
    /* access modifiers changed from: private */
    public Context mContext = null;
    /* access modifiers changed from: private */
    public AccessibilityManager mManager = null;
    /* access modifiers changed from: private */
    public boolean mTextToSpeechInitialized = false;
    /* access modifiers changed from: private */
    public TextToSpeech mTts = null;
    private QwertType qwertType = QwertType.abc;
    private double screen_density = 0.0d;
    SecureFrameLayout.SendAccessiBilityEventListener sflAccessListenr = new SecureFrameLayout.SendAccessiBilityEventListener() {
        @TargetApi(16)
        public boolean handleAccessiBilityEvent(SecureFrameLayout secureFrameLayout, int i) {
            if (i == 128) {
                if (SecureQwertyKeyboard.this.mTextToSpeechInitialized) {
                    SecureQwertyKeyboard.this.fake_view.sendAccessibilityEvent(32768);
                    secureFrameLayout.performAccessibilityAction(64, (Bundle) null);
                    SecureQwertyKeyboard.this.announceTextOut(SecureQwertyKeyboard.this.getAnnounceString(secureFrameLayout, i));
                }
                return true;
            } else if (i == 1) {
                if (!(!SecureQwertyKeyboard.this.mTextToSpeechInitialized || secureFrameLayout.getId() == R.id.key_ABC || secureFrameLayout.getId() == R.id.key_123)) {
                    SecureQwertyKeyboard.this.announceTextOut(SecureQwertyKeyboard.this.getAnnounceString(secureFrameLayout, i));
                }
                return true;
            } else {
                if (i == 32768 && SecureQwertyKeyboard.this.mTextToSpeechInitialized) {
                    SecureQwertyKeyboard.this.announceTextOut(SecureQwertyKeyboard.this.getAnnounceString(secureFrameLayout, i));
                }
                return true;
            }
        }
    };
    private ShiftType shiftType = ShiftType.up;
    SecureTextView.SendAccessiBilityEventListener stvAccessListener = new SecureTextView.SendAccessiBilityEventListener() {
        @TargetApi(16)
        public boolean handleAccessiBilityEvent(SecureTextView secureTextView, int i) {
            if (secureTextView.getParent() == null || !(secureTextView.getParent() instanceof SecureFrameLayout)) {
                return true;
            }
            ((SecureFrameLayout) secureTextView.getParent()).sendAccessibilityEvent(i);
            return true;
        }
    };
    private float textSize = 0.0f;
    private TextView[] tv_row1 = new TextView[10];
    private TextView[] tv_row2 = new TextView[9];
    private TextView[] tv_row3 = new TextView[7];
    private TextView tv_type;
    private int width = 0;

    public enum QwertType {
        abc,
        num
    }

    public enum ShiftType {
        up,
        down
    }

    public void onClick(View view) {
        if (view.getId() == R.id.key_enter) {
            onOK();
        } else {
            onTouchDown(view);
        }
    }

    public SecureQwertyKeyboard(Context context, FrameLayout frameLayout, OnKeyboardListener onKeyboardListener) {
        this.onKeyboardListener = onKeyboardListener;
        this.keyboardView = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.keyboard_secure_qwerty, (ViewGroup) null, false);
        this.cashierContainer = frameLayout;
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

    /* JADX WARNING: Removed duplicated region for block: B:45:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01c5  */
    @android.annotation.TargetApi(14)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void initialize(android.content.Context r18) {
        /*
            r17 = this;
            r0 = r17
            android.view.ViewGroup r1 = r0.keyboardView
            int r1 = r1.getChildCount()
            android.content.res.Resources r2 = r18.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            double r2 = (double) r2
            r0.screen_density = r2
            android.content.res.Resources r2 = r18.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.heightPixels
            android.content.res.Resources r3 = r18.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.widthPixels
            if (r3 <= r2) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r2 = r3
        L_0x002d:
            double r3 = (double) r2
            double r5 = r0.screen_density
            r7 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r9 = r5 * r7
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r9 = r9 * r11
            java.lang.Double.isNaN(r3)
            double r3 = r3 - r9
            int r3 = (int) r3
            int r3 = r3 / 10
            r0.width = r3
            double r9 = (double) r3
            r13 = 4616752568008179712(0x4012000000000000, double:4.5)
            double r15 = r5 * r13
            double r15 = r15 * r11
            java.lang.Double.isNaN(r9)
            double r9 = r9 - r15
            r15 = 4609209038632334131(0x3ff7333333333333, double:1.45)
            double r9 = r9 * r15
            r15 = 4619567317775286272(0x401c000000000000, double:7.0)
            double r15 = r15 * r5
            double r15 = r15 * r11
            double r9 = r9 + r15
            int r4 = (int) r9
            int r9 = r3 * 7
            int r2 = r2 - r9
            double r9 = (double) r2
            double r7 = r7 * r5
            double r7 = r7 * r11
            java.lang.Double.isNaN(r9)
            double r9 = r9 - r7
            double r5 = r5 * r13
            r7 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r5 = r5 * r7
            double r9 = r9 - r5
            int r2 = (int) r9
            r5 = 2
            int r2 = r2 / r5
            int r6 = r3 * 4
            int r7 = r3 + r2
            double r8 = (double) r3
            r10 = 4604029899060858061(0x3fe4cccccccccccd, double:0.65)
            java.lang.Double.isNaN(r8)
            double r8 = r8 * r10
            float r3 = (float) r8
            r0.textSize = r3
            r3 = 0
            r8 = 0
        L_0x0085:
            if (r8 >= r1) goto L_0x01d1
            android.view.ViewGroup r9 = r0.keyboardView
            android.view.View r9 = r9.getChildAt(r8)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            if (r9 == 0) goto L_0x01c9
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r10 = (android.widget.LinearLayout.LayoutParams) r10
            r10.height = r4
            int r10 = r9.getChildCount()
            if (r8 != 0) goto L_0x00cb
            android.widget.TextView[] r11 = new android.widget.TextView[r10]
            r0.tv_row1 = r11
            r11 = 0
        L_0x00a4:
            if (r11 >= r10) goto L_0x01c9
            android.view.View r12 = r9.getChildAt(r11)
            com.alipay.androidinter.app.safepaybase.alikeyboard.SecureFrameLayout r12 = (com.alipay.androidinter.app.safepaybase.alikeyboard.SecureFrameLayout) r12
            android.view.View r13 = r12.getChildAt(r3)
            com.alipay.androidinter.app.safepaybase.alikeyboard.SecureTextView r13 = (com.alipay.androidinter.app.safepaybase.alikeyboard.SecureTextView) r13
            float r14 = r0.textSize
            r13.setTextSize(r3, r14)
            r0.setEventListener(r12)
            android.widget.TextView[] r14 = r0.tv_row1
            r14[r11] = r13
            com.alipay.androidinter.app.safepaybase.alikeyboard.SecureTextView$SendAccessiBilityEventListener r14 = r0.stvAccessListener
            r13.setSendAccessiBilityEventListener(r14)
            com.alipay.androidinter.app.safepaybase.alikeyboard.SecureFrameLayout$SendAccessiBilityEventListener r13 = r0.sflAccessListenr
            r12.setSendAccessiBilityEventListener(r13)
            int r11 = r11 + 1
            goto L_0x00a4
        L_0x00cb:
            r11 = 0
            r12 = 1
            if (r8 != r12) goto L_0x0108
            android.widget.TextView[] r12 = new android.widget.TextView[r10]
            r0.tv_row2 = r12
            r12 = 0
        L_0x00d4:
            if (r12 >= r10) goto L_0x01c9
            android.view.View r13 = r9.getChildAt(r12)
            com.alipay.androidinter.app.safepaybase.alikeyboard.SecureFrameLayout r13 = (com.alipay.androidinter.app.safepaybase.alikeyboard.SecureFrameLayout) r13
            android.view.View r14 = r13.getChildAt(r3)
            com.alipay.androidinter.app.safepaybase.alikeyboard.SecureTextView r14 = (com.alipay.androidinter.app.safepaybase.alikeyboard.SecureTextView) r14
            float r15 = r0.textSize
            r14.setTextSize(r3, r15)
            r0.setEventListener(r13)
            android.view.ViewGroup$LayoutParams r15 = r13.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r15 = (android.widget.LinearLayout.LayoutParams) r15
            int r3 = r0.width
            r15.width = r3
            r15.weight = r11
            android.widget.TextView[] r3 = r0.tv_row2
            r3[r12] = r14
            com.alipay.androidinter.app.safepaybase.alikeyboard.SecureTextView$SendAccessiBilityEventListener r3 = r0.stvAccessListener
            r14.setSendAccessiBilityEventListener(r3)
            com.alipay.androidinter.app.safepaybase.alikeyboard.SecureFrameLayout$SendAccessiBilityEventListener r3 = r0.sflAccessListenr
            r13.setSendAccessiBilityEventListener(r3)
            int r12 = r12 + 1
            r3 = 0
            goto L_0x00d4
        L_0x0108:
            if (r8 != r5) goto L_0x0167
            int r3 = r10 + -2
            android.widget.TextView[] r3 = new android.widget.TextView[r3]
            r0.tv_row3 = r3
            r3 = 0
        L_0x0111:
            if (r3 >= r10) goto L_0x01c9
            android.view.View r12 = r9.getChildAt(r3)
            com.alipay.androidinter.app.safepaybase.alikeyboard.SecureFrameLayout r12 = (com.alipay.androidinter.app.safepaybase.alikeyboard.SecureFrameLayout) r12
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r13 = (android.widget.LinearLayout.LayoutParams) r13
            if (r3 != 0) goto L_0x0126
            r13.width = r2
            r0.ib_shift = r12
            goto L_0x0159
        L_0x0126:
            int r14 = r10 + -1
            if (r3 != r14) goto L_0x0134
            r13.width = r2
            r14 = 0
            android.view.View r15 = r12.getChildAt(r14)
            r0.fake_view = r15
            goto L_0x0159
        L_0x0134:
            r14 = 0
            int r15 = r0.width
            r13.width = r15
            r13.weight = r11
            android.view.View r15 = r12.getChildAt(r14)
            com.alipay.androidinter.app.safepaybase.alikeyboard.SecureTextView r15 = (com.alipay.androidinter.app.safepaybase.alikeyboard.SecureTextView) r15
            float r5 = r0.textSize
            r15.setTextSize(r14, r5)
            com.alipay.androidinter.app.safepaybase.alikeyboard.SecureAccessbilityDelegate r5 = new com.alipay.androidinter.app.safepaybase.alikeyboard.SecureAccessbilityDelegate
            r5.<init>()
            r15.setAccessibilityDelegate(r5)
            android.widget.TextView[] r5 = r0.tv_row3
            int r14 = r3 + -1
            r5[r14] = r15
            com.alipay.androidinter.app.safepaybase.alikeyboard.SecureTextView$SendAccessiBilityEventListener r5 = r0.stvAccessListener
            r15.setSendAccessiBilityEventListener(r5)
        L_0x0159:
            r13.weight = r11
            r0.setEventListener(r12)
            com.alipay.androidinter.app.safepaybase.alikeyboard.SecureFrameLayout$SendAccessiBilityEventListener r5 = r0.sflAccessListenr
            r12.setSendAccessiBilityEventListener(r5)
            int r3 = r3 + 1
            r5 = 2
            goto L_0x0111
        L_0x0167:
            r14 = 0
        L_0x0168:
            if (r14 >= r10) goto L_0x01c9
            android.view.View r3 = r9.getChildAt(r14)
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            if (r14 != 0) goto L_0x0186
            r5.width = r2
            r13 = r3
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            r15 = 0
            android.view.View r13 = r13.getChildAt(r15)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0.tv_type = r13
        L_0x0184:
            r13 = 2
            goto L_0x019d
        L_0x0186:
            if (r14 != r12) goto L_0x018d
            int r13 = r0.width
            r5.width = r13
            goto L_0x0184
        L_0x018d:
            r13 = 2
            if (r14 != r13) goto L_0x0193
            r5.width = r6
            goto L_0x019d
        L_0x0193:
            r15 = 3
            if (r14 != r15) goto L_0x019b
            int r15 = r0.width
            r5.width = r15
            goto L_0x019d
        L_0x019b:
            r5.width = r7
        L_0x019d:
            r5.weight = r11
            r0.setEventListener(r3)
            boolean r5 = r3 instanceof com.alipay.androidinter.app.safepaybase.alikeyboard.SecureFrameLayout
            if (r5 == 0) goto L_0x01c5
            com.alipay.androidinter.app.safepaybase.alikeyboard.SecureFrameLayout r3 = (com.alipay.androidinter.app.safepaybase.alikeyboard.SecureFrameLayout) r3
            com.alipay.androidinter.app.safepaybase.alikeyboard.SecureFrameLayout$SendAccessiBilityEventListener r5 = r0.sflAccessListenr
            r3.setSendAccessiBilityEventListener(r5)
            r5 = 0
            android.view.View r3 = r3.getChildAt(r5)
            android.widget.TextView r3 = (android.widget.TextView) r3
            float r15 = r0.textSize
            r3.setTextSize(r5, r15)
            boolean r15 = r3 instanceof com.alipay.androidinter.app.safepaybase.alikeyboard.SecureTextView
            if (r15 == 0) goto L_0x01c6
            com.alipay.androidinter.app.safepaybase.alikeyboard.SecureTextView r3 = (com.alipay.androidinter.app.safepaybase.alikeyboard.SecureTextView) r3
            com.alipay.androidinter.app.safepaybase.alikeyboard.SecureTextView$SendAccessiBilityEventListener r15 = r0.stvAccessListener
            r3.setSendAccessiBilityEventListener(r15)
            goto L_0x01c6
        L_0x01c5:
            r5 = 0
        L_0x01c6:
            int r14 = r14 + 1
            goto L_0x0168
        L_0x01c9:
            r5 = 0
            r13 = 2
            int r8 = r8 + 1
            r3 = 0
            r5 = 2
            goto L_0x0085
        L_0x01d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.androidinter.app.safepaybase.alikeyboard.SecureQwertyKeyboard.initialize(android.content.Context):void");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            return onTouchDown(view);
        }
        if (motionEvent.getAction() == 1) {
            return onTouchUp(view);
        }
        return false;
    }

    private boolean onTouchUp(View view) {
        if (view.getId() != R.id.key_enter) {
            return false;
        }
        onOK();
        return false;
    }

    private boolean onTouchDown(View view) {
        int id2 = view.getId();
        if (id2 == R.id.key_del1) {
            onDel();
        } else if (id2 != R.id.key_enter) {
            if (id2 == R.id.key_space) {
                onInput(" ");
            } else if (id2 == R.id.key_ABC) {
                ShiftType shiftType2 = this.shiftType == ShiftType.up ? ShiftType.down : ShiftType.up;
                this.shiftType = shiftType2;
                switchKeyboard(this.qwertType, shiftType2);
            } else if (id2 == R.id.key_123) {
                this.qwertType = this.qwertType == QwertType.abc ? QwertType.num : QwertType.abc;
                ShiftType shiftType3 = ShiftType.up;
                this.shiftType = shiftType3;
                switchKeyboard(this.qwertType, shiftType3);
            } else {
                onInput(((TextView) ((FrameLayout) view).getChildAt(0)).getText().toString());
            }
        }
        return false;
    }

    private void switchKeyboard(QwertType qwertType2, ShiftType shiftType2) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        int i = 0;
        if (qwertType2 == QwertType.abc) {
            this.ib_shift.getChildAt(0).setVisibility(0);
            this.ib_shift.getChildAt(1).setVisibility(8);
            this.tv_type.setText("123");
            if (shiftType2 == ShiftType.up) {
                ((ImageView) this.ib_shift.getChildAt(0)).setImageResource(R.drawable.keyboard_key_shift_up);
                strArr3 = this.QWERT_ABC_SHIFT_UP_ROW_0;
                strArr2 = this.QWERT_ABC_SHIFT_UP_ROW_1;
                strArr = this.QWERT_ABC_SHIFT_UP_ROW_2;
            } else {
                ((ImageView) this.ib_shift.getChildAt(0)).setImageResource(R.drawable.keyboard_key_shift_down);
                strArr3 = this.QWERT_ABC_SHIFT_DOWN_ROW_0;
                strArr2 = this.QWERT_ABC_SHIFT_DOWN_ROW_1;
                strArr = this.QWERT_ABC_SHIFT_DOWN_ROW_2;
            }
        } else {
            this.ib_shift.getChildAt(0).setVisibility(8);
            this.ib_shift.getChildAt(1).setVisibility(0);
            if (this.ib_shift.getChildAt(1) instanceof TextView) {
                ((TextView) this.ib_shift.getChildAt(1)).setTextSize(0, this.textSize);
            }
            this.tv_type.setText("abc");
            if (shiftType2 == ShiftType.up) {
                ((TextView) this.ib_shift.getChildAt(1)).setText("123");
                strArr3 = this.QWERT_123_SHIFT_UP_ROW_0;
                strArr2 = this.QWERT_123_SHIFT_UP_ROW_1;
                strArr = this.QWERT_123_SHIFT_UP_ROW_2;
            } else {
                ((TextView) this.ib_shift.getChildAt(1)).setText("#+=");
                strArr3 = this.QWERT_123_SHIFT_DOWN_ROW_0;
                strArr2 = this.QWERT_123_SHIFT_DOWN_ROW_1;
                strArr = this.QWERT_123_SHIFT_DOWN_ROW_2;
            }
        }
        int i2 = 0;
        while (true) {
            TextView[] textViewArr = this.tv_row1;
            if (i2 >= textViewArr.length) {
                break;
            }
            textViewArr[i2].setText(strArr3[i2]);
            i2++;
        }
        int i3 = 0;
        while (true) {
            TextView[] textViewArr2 = this.tv_row2;
            if (i3 >= textViewArr2.length) {
                break;
            }
            textViewArr2[i3].setText(strArr2[i3]);
            i3++;
        }
        while (true) {
            TextView[] textViewArr3 = this.tv_row3;
            if (i < textViewArr3.length) {
                textViewArr3[i].setText(strArr[i]);
                i++;
            } else {
                announceSwitchKeyboard(qwertType2, shiftType2);
                return;
            }
        }
    }

    @TargetApi(14)
    private void announceSwitchKeyboard(QwertType qwertType2, ShiftType shiftType2) {
        String str;
        if (this.mTextToSpeechInitialized) {
            if (qwertType2 == QwertType.abc) {
                if (shiftType2 == ShiftType.up) {
                    str = this.mContext.getString(R.string.msp_secure_keyboard_type_lowercase_letter);
                } else {
                    str = this.mContext.getString(R.string.msp_secure_keyboard_type_uppercase_letter);
                }
            } else if (shiftType2 == ShiftType.up) {
                str = this.mContext.getString(R.string.msp_secure_keyboard_type_digital_sign);
            } else {
                str = this.mContext.getString(R.string.msp_secure_keyboard_type_special_sign);
            }
            if (this.mManager.isTouchExplorationEnabled()) {
                this.mTts.speak(str, 0, (HashMap) null);
            }
        }
    }

    @TargetApi(14)
    private void initTtsIfTalkBack() {
        this.mManager = (AccessibilityManager) this.mContext.getSystemService("accessibility");
        this.keyboardView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(View view) {
                if (SecureQwertyKeyboard.this.mManager.isTouchExplorationEnabled()) {
                    try {
                        TextToSpeech unused = SecureQwertyKeyboard.this.mTts = new TextToSpeech(SecureQwertyKeyboard.this.mContext, SecureQwertyKeyboard.this);
                    } catch (SecurityException unused2) {
                        boolean unused3 = SecureQwertyKeyboard.this.mTextToSpeechInitialized = false;
                    }
                }
            }

            public void onViewDetachedFromWindow(View view) {
                if (SecureQwertyKeyboard.this.mTextToSpeechInitialized) {
                    SecureQwertyKeyboard.this.mTts.shutdown();
                    boolean unused = SecureQwertyKeyboard.this.mTextToSpeechInitialized = false;
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

    private boolean isZhLanguage() {
        return "zh".equals(Locale.getDefault().getLanguage());
    }

    /* access modifiers changed from: private */
    @TargetApi(14)
    public void announceTextOut(String str) {
        if (this.mManager.isTouchExplorationEnabled()) {
            this.mTts.speak(str, 0, (HashMap) null);
        }
    }

    /* access modifiers changed from: private */
    public String getAnnounceString(SecureFrameLayout secureFrameLayout, int i) {
        int id2 = secureFrameLayout.getId();
        if (id2 == R.id.key_del1) {
            String string = this.mContext.getString(R.string.msp_secure_keyboard_del);
            if (i == 1) {
                return this.mContext.getString(R.string.msp_secure_keyboard_already_del);
            }
            return string;
        } else if (id2 == R.id.key_space) {
            return this.mContext.getString(R.string.msp_secure_keyboard_space);
        } else {
            if (id2 == R.id.key_ABC) {
                if (this.ib_shift.getChildAt(0).getVisibility() == 0) {
                    return this.mContext.getString(R.string.msp_secure_keyboard_shift);
                }
                return ((TextView) secureFrameLayout.getChildAt(1)).getText().toString();
            } else if (id2 == R.id.key_enter) {
                return this.mContext.getString(R.string.msp_secure_keyboard_compelete);
            } else {
                return convertIfSpecial(((TextView) secureFrameLayout.getChildAt(0)).getText().toString());
            }
        }
    }

    private String convertIfSpecial(String str) {
        String str2 = signMap.get(str);
        return str2 != null ? this.mContext.getString(ResUtils.getStringId(str2)) : str;
    }

    public View getView() {
        return super.getView();
    }
}
