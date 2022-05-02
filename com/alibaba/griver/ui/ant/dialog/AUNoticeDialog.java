package com.alibaba.griver.ui.ant.dialog;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.api.OnItemClickListener;
import com.alibaba.griver.ui.ant.layout.AULinearLayout;
import com.alibaba.griver.ui.ant.text.AUTextView;
import java.util.ArrayList;
import java.util.List;

public class AUNoticeDialog extends AUBaseDialog {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f10550a;
    /* access modifiers changed from: private */
    public AUTextView b;
    /* access modifiers changed from: private */
    public AUTextView c;
    /* access modifiers changed from: private */
    public ScrollView d;
    private CharSequence e;
    private CharSequence f;
    /* access modifiers changed from: private */
    public OnClickPositiveListener g;
    /* access modifiers changed from: private */
    public OnClickNegativeListener h;
    private String i;
    private String j;
    private boolean k;
    private List<View> l;
    private MovementMethod m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private String f10551o;

    public interface OnClickNegativeListener {
        void onClick();
    }

    public interface OnClickPositiveListener {
        void onClick();
    }

    public AUNoticeDialog(Context context, CharSequence charSequence, CharSequence charSequence2, String str, String str2) {
        this(context, charSequence, charSequence2, str, str2, false);
    }

    public AUNoticeDialog(Context context, CharSequence charSequence, CharSequence charSequence2, String str, String str2, boolean z) {
        super(context, R.style.griver_noTitleTransBgDialogStyle);
        this.k = false;
        this.l = new ArrayList();
        a(context, charSequence, charSequence2, str, str2, z);
    }

    public AUNoticeDialog(Context context, CharSequence charSequence, CharSequence charSequence2, String str, String str2, boolean z, View view) {
        super(context, R.style.griver_noTitleTransBgDialogStyle);
        this.k = false;
        this.l = new ArrayList();
        a(context, charSequence, charSequence2, str, str2, z);
        this.l.clear();
        this.l.add(view);
    }

    @Deprecated
    public AUNoticeDialog(Context context, CharSequence charSequence, CharSequence charSequence2, String str, String str2, boolean z, List<View> list) {
        super(context, R.style.griver_noTitleTransBgDialogStyle);
        this.k = false;
        this.l = new ArrayList();
        a(context, charSequence, charSequence2, str, str2, z);
        this.l.clear();
        this.l.addAll(list);
    }

    private void a(Context context, CharSequence charSequence, CharSequence charSequence2, String str, String str2, boolean z) {
        this.f10550a = context;
        this.e = charSequence;
        this.f = charSequence2;
        this.i = str;
        this.j = str2;
        this.k = z;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.rootView.setMinimumHeight(this.f10550a.getResources().getDimensionPixelSize(R.dimen.griver_dialog_min_height));
        addDescriptionView();
        setCanceledOnTouchOutside(this.k);
        setButtonStyle(this.i, this.j, new OnItemClickListener() {
            public void onClick(View view, int i) {
                if (i == 0) {
                    AUNoticeDialog.this.dismiss();
                    if (AUNoticeDialog.this.g != null) {
                        AUNoticeDialog.this.g.onClick();
                    }
                } else if (i == 1) {
                    AUNoticeDialog.this.cancel();
                    if (AUNoticeDialog.this.h != null) {
                        AUNoticeDialog.this.h.onClick();
                    }
                }
            }
        });
        if (!TextUtils.isEmpty(this.n) && this.mEnsureBtn != null) {
            try {
                this.mEnsureBtn.setTextColor(Color.parseColor(this.n));
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("set positiveTextColor failed: ");
                sb.append(this.n);
                sb.append(", ");
                sb.append(e2.getLocalizedMessage());
                GriverLogger.e("AUNoticeDialog", sb.toString());
            }
        }
        if (!TextUtils.isEmpty(this.f10551o) && this.mCancelBtn != null) {
            try {
                this.mCancelBtn.setTextColor(Color.parseColor(this.f10551o));
            } catch (Exception e3) {
                StringBuilder sb2 = new StringBuilder("set negativeTextColor failed: ");
                sb2.append(this.f10551o);
                sb2.append(", ");
                sb2.append(e3.getLocalizedMessage());
                GriverLogger.e("AUNoticeDialog", sb2.toString());
            }
        }
    }

    private void a(AUTextView aUTextView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            aUTextView.setVisibility(8);
            return;
        }
        aUTextView.setVisibility(0);
        if (charSequence instanceof String) {
            aUTextView.setAutoSplitText((String) charSequence);
        } else {
            aUTextView.setText(charSequence);
        }
    }

    public int initHorizonMaskSpace() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.griver_notice_size);
    }

    public void initCustomView(AULinearLayout aULinearLayout) {
        aULinearLayout.setOrientation(1);
        int dimensionPixelSize = this.f10550a.getResources().getDimensionPixelSize(R.dimen.griver_AU_SPACE6);
        int dimensionPixelSize2 = this.f10550a.getResources().getDimensionPixelSize(R.dimen.griver_dialog_padding_top);
        aULinearLayout.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        setCustomLayout(getContext(), R.layout.griver_ui_notice_dialog, aULinearLayout);
    }

    public void addDescriptionView() {
        int size = this.l.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.rootView.addView(this.l.get(i2));
            }
        }
    }

    public void setCustomLayout(Context context, int i2, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(i2, viewGroup);
        this.b = (AUTextView) inflate.findViewById(R.id.title);
        this.c = (AUTextView) inflate.findViewById(R.id.message);
        this.d = (ScrollView) inflate.findViewById(R.id.message_content);
        MovementMethod movementMethod = this.m;
        if (movementMethod != null) {
            this.c.setMovementMethod(movementMethod);
        }
        this.b.setOnVisibilityChangeListener(new AUTextView.OnVisibilityChangeListener() {
            public void onChange(int i) {
                if (i == 8) {
                    AUNoticeDialog.this.c.setGravity(19);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) AUNoticeDialog.this.d.getLayoutParams();
                    layoutParams.topMargin = 0;
                    AUNoticeDialog.this.d.setLayoutParams(layoutParams);
                    return;
                }
                AUNoticeDialog.this.c.setGravity(51);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) AUNoticeDialog.this.d.getLayoutParams();
                layoutParams2.topMargin = AUNoticeDialog.this.f10550a.getResources().getDimensionPixelSize(R.dimen.griver_AU_SPACE4);
                AUNoticeDialog.this.d.setLayoutParams(layoutParams2);
            }
        });
        this.c.setOnVisibilityChangeListener(new AUTextView.OnVisibilityChangeListener() {
            public void onChange(int i) {
                if (i == 8) {
                    AUNoticeDialog.this.b.setGravity(19);
                } else {
                    AUNoticeDialog.this.b.setGravity(51);
                }
            }
        });
        a(this.b, this.e);
        a(this.c, this.f);
    }

    public TextView getTitle() {
        return this.b;
    }

    public TextView getMsg() {
        return this.c;
    }

    public void setPositiveListener(OnClickPositiveListener onClickPositiveListener) {
        this.g = onClickPositiveListener;
    }

    public void setNegativeListener(OnClickNegativeListener onClickNegativeListener) {
        this.h = onClickNegativeListener;
    }

    public CharSequence getTitleText() {
        AUTextView aUTextView = this.b;
        if (aUTextView != null) {
            return aUTextView.getText();
        }
        return this.e;
    }

    public CharSequence getMsgText() {
        AUTextView aUTextView = this.c;
        if (aUTextView != null) {
            return aUTextView.getText();
        }
        return this.f;
    }
}
