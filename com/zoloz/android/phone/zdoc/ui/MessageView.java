package com.zoloz.android.phone.zdoc.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.zoloz.android.phone.zdoc.R;
import zoloz.ap.com.toolkit.ui.CustomTextView;

public class MessageView extends IMessageView {
    public static final int SHOW_POWER_BY_ZOLOZ = 1;
    protected View mBottomLayout;
    private CustomTextView mBrandTextView;
    protected CustomTextView mCaptureTips;
    private View mConfirmPhoto;
    protected CustomTextView mConfirmTextView;
    private CustomTextView mMainTextView;
    private ImageView mPressImageView;
    private View mRetakePhoto;
    private int mShowByZoloz;
    private boolean mShowPress;
    protected CustomTextView mTipsTextView;

    public MessageView(Context context) {
        super(context);
    }

    public MessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void init(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(getLayoutId(), this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MessageView);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.MessageView_z_message_view_custom, false);
        this.mShowPress = obtainStyledAttributes.getBoolean(R.styleable.MessageView_z_showPress, false);
        obtainStyledAttributes.recycle();
        this.mPressImageView = (ImageView) findViewById(R.id.btn_press);
        this.mRetakePhoto = findViewById(R.id.btn_X);
        this.mConfirmPhoto = findViewById(R.id.btn_ok);
        this.mBrandTextView = (CustomTextView) findViewById(R.id.tv_branding);
        this.mMainTextView = (CustomTextView) findViewById(R.id.tv_main_message);
        this.mConfirmTextView = (CustomTextView) findViewById(R.id.tv_confirm_msg);
        this.mCaptureTips = (CustomTextView) findViewById(R.id.zdoc_capture);
        this.mTipsTextView = (CustomTextView) findViewById(R.id.remind_text);
        this.mBottomLayout = findViewById(R.id.message_opt_layout);
        if (z) {
            this.mMainTextView.setTextFont();
            this.mBrandTextView.setTextFont();
        }
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return R.layout.layout_message;
    }

    public void updateUI(UIState uIState, int i, int i2) {
        this.mShowByZoloz = i;
        if (i == 1) {
            this.mBrandTextView.setVisibility(0);
        } else {
            this.mBrandTextView.setVisibility(8);
        }
        int i3 = AnonymousClass1.$SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState[uIState.ordinal()];
        if (i3 == 1) {
            if (this.mShowPress) {
                this.mPressImageView.setVisibility(0);
            }
            this.mMainTextView.setVisibility(8);
            this.mRetakePhoto.setVisibility(8);
            this.mConfirmPhoto.setVisibility(8);
            this.mConfirmTextView.setVisibility(8);
            this.mTipsTextView.setVisibility(0);
            this.mCaptureTips.setVisibility(0);
        } else if (i3 == 2) {
            this.mMainTextView.setVisibility(8);
            this.mPressImageView.setVisibility(8);
            this.mRetakePhoto.setVisibility(0);
            this.mConfirmPhoto.setVisibility(0);
            this.mConfirmTextView.setVisibility(0);
            this.mTipsTextView.setVisibility(8);
            this.mCaptureTips.setVisibility(8);
        } else if (i3 == 3) {
            this.mMainTextView.setText(UIFacade.getUploadingString(getContext()));
            this.mMainTextView.setVisibility(0);
            this.mRetakePhoto.setVisibility(8);
            this.mConfirmPhoto.setVisibility(8);
            this.mPressImageView.setVisibility(8);
            this.mConfirmTextView.setVisibility(8);
            this.mTipsTextView.setVisibility(8);
            this.mCaptureTips.setVisibility(8);
        } else if (i3 == 4) {
            this.mMainTextView.setVisibility(0);
            this.mMainTextView.setText(UIFacade.getUploadEndString(getContext()));
            this.mConfirmTextView.setVisibility(8);
            this.mTipsTextView.setVisibility(8);
            this.mCaptureTips.setVisibility(8);
        } else if (i3 == 5) {
            this.mMainTextView.setVisibility(8);
            this.mConfirmTextView.setVisibility(8);
            this.mTipsTextView.setVisibility(8);
            this.mCaptureTips.setVisibility(8);
        }
    }

    /* renamed from: com.zoloz.android.phone.zdoc.ui.MessageView$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.zoloz.android.phone.zdoc.ui.UIState[] r0 = com.zoloz.android.phone.zdoc.ui.UIState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState = r0
                com.zoloz.android.phone.zdoc.ui.UIState r1 = com.zoloz.android.phone.zdoc.ui.UIState.CAPTURE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.zoloz.android.phone.zdoc.ui.UIState r1 = com.zoloz.android.phone.zdoc.ui.UIState.USER_CONFIRM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.zoloz.android.phone.zdoc.ui.UIState r1 = com.zoloz.android.phone.zdoc.ui.UIState.UPLOADING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.zoloz.android.phone.zdoc.ui.UIState r1 = com.zoloz.android.phone.zdoc.ui.UIState.UPLOAD_END_SUCCESS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState     // Catch:{ NoSuchFieldError -> 0x003e }
                com.zoloz.android.phone.zdoc.ui.UIState r1 = com.zoloz.android.phone.zdoc.ui.UIState.UPLOAD_END_FAIL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zoloz.android.phone.zdoc.ui.MessageView.AnonymousClass1.<clinit>():void");
        }
    }

    public void setOnConfirmListener(View.OnClickListener onClickListener) {
        this.mConfirmPhoto.setOnClickListener(onClickListener);
    }

    public void setUiLocation(int i, String str, int i2, int i3, int i4, int i5) {
        updateFooterLayout(i, i3, i4, i5);
        updateTipsView(i, str, i2, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    public void updateFooterLayout(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mBottomLayout.getLayoutParams();
        layoutParams.height = i4;
        this.mBottomLayout.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void updateTipsView(int i, String str, int i2, int i3, int i4, int i5) {
        ((RelativeLayout.LayoutParams) this.mTipsTextView.getLayoutParams()).bottomMargin = i4;
        this.mTipsTextView.setText(UIFacade.getMainMessage(getContext(), i, str, i2));
        CustomTextView customTextView = this.mCaptureTips;
        if (customTextView != null) {
            customTextView.setText(UIFacade.getControllMessage(getContext(), 0, str, i2));
        }
        CustomTextView customTextView2 = this.mConfirmTextView;
        if (customTextView2 != null) {
            customTextView2.setText(UIFacade.getControllMessage(getContext(), 1, str, i2));
        }
    }

    public void setOnTakePhotoListener(View.OnClickListener onClickListener) {
        this.mPressImageView.setOnClickListener(onClickListener);
    }

    public void setOnReTakePhotoListener(View.OnClickListener onClickListener) {
        this.mRetakePhoto.setOnClickListener(onClickListener);
    }

    public void updateMessage(int i) {
        updateUI(UIState.CAPTURE, this.mShowByZoloz, i);
    }

    public void clearClickListener() {
        this.mPressImageView.setOnClickListener((View.OnClickListener) null);
        this.mConfirmPhoto.setOnClickListener((View.OnClickListener) null);
        this.mRetakePhoto.setOnClickListener((View.OnClickListener) null);
    }
}
