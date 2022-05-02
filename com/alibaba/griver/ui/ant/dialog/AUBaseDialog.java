package com.alibaba.griver.ui.ant.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.api.OnItemClickListener;
import com.alibaba.griver.ui.ant.helper.TextButtonListAdapter;
import com.alibaba.griver.ui.ant.layout.AULinearLayout;
import com.alibaba.griver.ui.ant.listview.AUMaxItemCornerListView;
import java.util.List;

public abstract class AUBaseDialog extends AUDialog {

    /* renamed from: a  reason: collision with root package name */
    private int f10547a;
    private AULinearLayout b;
    private AUMaxItemCornerListView c;
    private TextButtonListAdapter d;
    private AULinearLayout e;
    protected LayoutInflater inflater;
    protected Button mCancelBtn;
    protected Button mEnsureBtn;
    public AULinearLayout rootView;

    public abstract void initCustomView(AULinearLayout aULinearLayout);

    public abstract int initHorizonMaskSpace();

    public AUBaseDialog(Context context, int i) {
        super(context, i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater from = LayoutInflater.from(getContext());
        this.inflater = from;
        AULinearLayout aULinearLayout = (AULinearLayout) from.inflate(R.layout.griver_ui_base_dailog, (ViewGroup) null);
        this.rootView = aULinearLayout;
        setContentView(aULinearLayout);
        AULinearLayout aULinearLayout2 = (AULinearLayout) this.rootView.findViewById(R.id.dialog_custom_view);
        this.e = aULinearLayout2;
        initCustomView(aULinearLayout2);
        setContentView(this.rootView);
        this.f10547a = initHorizonMaskSpace();
    }

    public void show() {
        super.show();
        if (isShowing()) {
            setWindowMaxWidth(this.f10547a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0070, code lost:
        if (r4.measureText(r5.toString()) > ((float) ((com.alibaba.griver.ui.ant.utils.ToolUtils.getScreenWidth_Height(getContext())[0] - (r8.f10547a * 2)) - getContext().getResources().getDimensionPixelSize(com.alibaba.griver.ui.R.dimen.griver_notice_max_button_width)))) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setButtonStyle(java.lang.String r9, java.lang.String r10, com.alibaba.griver.ui.ant.api.OnItemClickListener r11) {
        /*
            r8 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = 0
            goto L_0x000d
        L_0x0009:
            int r0 = r9.length()
        L_0x000d:
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 == 0) goto L_0x0015
            r2 = 0
            goto L_0x0019
        L_0x0015:
            int r2 = r10.length()
        L_0x0019:
            if (r0 != 0) goto L_0x001e
            if (r2 != 0) goto L_0x001e
            return
        L_0x001e:
            r3 = 1
            int r4 = r0 + r2
            r5 = 8
            if (r4 <= r5) goto L_0x0073
            android.text.TextPaint r4 = new android.text.TextPaint
            r4.<init>()
            android.content.Context r5 = r8.getContext()
            android.content.res.Resources r5 = r5.getResources()
            int r6 = com.alibaba.griver.ui.R.dimen.griver_AU_TEXTSIZE4
            int r5 = r5.getDimensionPixelSize(r6)
            float r5 = (float) r5
            r4.setTextSize(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r9)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            float r4 = r4.measureText(r5)
            android.content.Context r5 = r8.getContext()
            int[] r5 = com.alibaba.griver.ui.ant.utils.ToolUtils.getScreenWidth_Height(r5)
            r5 = r5[r1]
            int r6 = r8.f10547a
            int r6 = r6 * 2
            int r5 = r5 - r6
            android.content.Context r6 = r8.getContext()
            android.content.res.Resources r6 = r6.getResources()
            int r7 = com.alibaba.griver.ui.R.dimen.griver_notice_max_button_width
            int r6 = r6.getDimensionPixelSize(r7)
            int r5 = r5 - r6
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r1 = 1
        L_0x0074:
            if (r1 == 0) goto L_0x007a
            r8.addHorizonButtonView(r9, r10, r11)
            return
        L_0x007a:
            r8.addDividerView()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 == 0) goto L_0x0087
            r1.add(r9)
        L_0x0087:
            if (r2 == 0) goto L_0x008c
            r1.add(r10)
        L_0x008c:
            r8.addListButtonView(r1, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.ant.dialog.AUBaseDialog.setButtonStyle(java.lang.String, java.lang.String, com.alibaba.griver.ui.ant.api.OnItemClickListener):void");
    }

    public void setButtonStyle(List<String> list, OnItemClickListener onItemClickListener) {
        addListButtonView(list, onItemClickListener);
    }

    public void setButtonStyle(BaseAdapter baseAdapter) {
        if (this.c == null) {
            AUMaxItemCornerListView aUMaxItemCornerListView = new AUMaxItemCornerListView(getContext());
            this.c = aUMaxItemCornerListView;
            aUMaxItemCornerListView.setBackgroundColor(0);
            this.c.setDivider(new ColorDrawable(getContext().getResources().getColor(R.color.griver_AU_COLOR_DIALOG_DIVIDER_COLOR)));
            this.c.setDividerHeight(1);
            this.rootView.addView(this.c);
        }
        this.c.setAdapter(baseAdapter);
    }

    public void addHorizonButtonView(String str, String str2, final OnItemClickListener onItemClickListener) {
        if (this.b == null) {
            AULinearLayout aULinearLayout = (AULinearLayout) this.inflater.inflate(R.layout.griver_ui_base_dialog_button, (ViewGroup) null);
            this.b = aULinearLayout;
            this.mEnsureBtn = (Button) aULinearLayout.findViewById(R.id.ensure);
            this.mCancelBtn = (Button) this.b.findViewById(R.id.cancel);
            this.rootView.addView(this.b);
        }
        if (TextUtils.isEmpty(str2)) {
            this.mCancelBtn.setVisibility(8);
        } else {
            this.mCancelBtn.setVisibility(0);
            this.mCancelBtn.setText(str2);
        }
        this.mCancelBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                OnItemClickListener onItemClickListener = onItemClickListener;
                if (onItemClickListener != null) {
                    onItemClickListener.onClick(AUBaseDialog.this.mCancelBtn, 1);
                }
            }
        });
        if (TextUtils.isEmpty(str)) {
            this.mEnsureBtn.setVisibility(8);
        } else {
            this.mEnsureBtn.setText(str);
            this.mEnsureBtn.setVisibility(0);
        }
        this.mEnsureBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                OnItemClickListener onItemClickListener = onItemClickListener;
                if (onItemClickListener != null) {
                    onItemClickListener.onClick(AUBaseDialog.this.mEnsureBtn, 0);
                }
            }
        });
    }

    public void addListButtonView(List<String> list, OnItemClickListener onItemClickListener) {
        if (this.c == null) {
            AUMaxItemCornerListView aUMaxItemCornerListView = new AUMaxItemCornerListView(getContext());
            this.c = aUMaxItemCornerListView;
            aUMaxItemCornerListView.setBackgroundColor(0);
            this.c.setDivider(new ColorDrawable(getContext().getResources().getColor(R.color.griver_AU_COLOR_DIALOG_DIVIDER_COLOR)));
            this.c.setDividerHeight(1);
            TextButtonListAdapter textButtonListAdapter = new TextButtonListAdapter(17, getContext().getResources().getColor(R.color.griver_AU_COLOR_LINK));
            this.d = textButtonListAdapter;
            this.c.setAdapter(textButtonListAdapter);
            this.rootView.addView(this.c);
        }
        this.d.setData(getContext(), list, onItemClickListener);
    }

    public TextView getButtonItem(int i) {
        if (this.b != null) {
            return i == 0 ? this.mEnsureBtn : this.mCancelBtn;
        }
        AUMaxItemCornerListView aUMaxItemCornerListView = this.c;
        if (aUMaxItemCornerListView != null) {
            return (TextView) aUMaxItemCornerListView.getChildAt(i);
        }
        return null;
    }

    public void addDividerView() {
        View view = new View(getContext());
        view.setBackgroundColor(getContext().getResources().getColor(R.color.griver_AU_COLOR_DIALOG_DIVIDER_COLOR));
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
        this.rootView.addView(view);
    }
}
