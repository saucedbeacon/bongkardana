package com.alibaba.griver.ui.jsapi.picker.nebula.wheelview.picker;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.alibaba.griver.base.common.utils.DensityUtil;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.dialog.APAlertDialog;
import com.alibaba.griver.ui.jsapi.picker.nebula.wheelview.widget.WheelView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoWheelOptionPickerDialog extends APAlertDialog {

    /* renamed from: a  reason: collision with root package name */
    private Activity f9111a;
    /* access modifiers changed from: private */
    public OnOptionPickListener b;
    /* access modifiers changed from: private */
    public String c;
    /* access modifiers changed from: private */
    public int d;
    /* access modifiers changed from: private */
    public String e;
    /* access modifiers changed from: private */
    public int f;
    private WheelView g;
    private WheelView h;
    protected List<String> mLeftOptions;
    protected List<String> mRightOptions;

    public interface OnOptionPickListener {
        void onOptionPicked(String str, int i, String str2, int i2);
    }

    public TwoWheelOptionPickerDialog(Activity activity, String str, String str2, String str3, String[] strArr, String[] strArr2) {
        this(activity, str, str2, str3, Arrays.asList(strArr), Arrays.asList(strArr2));
    }

    public TwoWheelOptionPickerDialog(Activity activity, String str, String str2, String str3, List list, List list2) {
        super(activity, str, str2, str3);
        this.mRightOptions = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.mLeftOptions = arrayList;
        this.c = "";
        this.d = -1;
        this.e = "";
        this.f = -1;
        this.f9111a = activity;
        arrayList.addAll(list);
        this.mRightOptions.addAll(list2);
        setPositiveListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TwoWheelOptionPickerDialog.this.b != null) {
                    TwoWheelOptionPickerDialog.this.b.onOptionPicked(TwoWheelOptionPickerDialog.this.c, TwoWheelOptionPickerDialog.this.d, TwoWheelOptionPickerDialog.this.e, TwoWheelOptionPickerDialog.this.f);
                }
            }
        });
        a();
    }

    private void a() {
        TextView titleView = getTitleView();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) titleView.getLayoutParams();
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        }
        int dip2px = DensityUtil.dip2px(getContext(), 14.0f);
        marginLayoutParams.setMargins(dip2px, dip2px, dip2px, dip2px);
        titleView.setLayoutParams(marginLayoutParams);
        initContentView();
    }

    public void setRightSelected(String str) {
        this.e = str;
        this.g.setSelectedItem(str);
        this.f = this.g.getSelectedIndex();
    }

    public void setLeftSelected(String str) {
        this.c = str;
        this.h.setSelectedItem(str);
        this.d = this.g.getSelectedIndex();
    }

    public void setOnOptionPickListener(OnOptionPickListener onOptionPickListener) {
        this.b = onOptionPickListener;
    }

    public void show() {
        super.show();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        attributes.width = (displayMetrics.widthPixels > displayMetrics.heightPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels) - DensityUtil.dip2px(getContext(), 30.0f);
        getWindow().setAttributes(attributes);
    }

    public View getContentView() {
        List<String> list = this.mRightOptions;
        if (list == null || list.size() == 0) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(48);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        b(linearLayout);
        a(linearLayout);
        return linearLayout;
    }

    private void a(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(48);
        this.h = a(this.mLeftOptions, (WheelView.OnWheelViewListener) new WheelView.OnWheelViewListener() {
            public void onSelected(boolean z, int i, String str) {
                String unused = TwoWheelOptionPickerDialog.this.c = str;
                int unused2 = TwoWheelOptionPickerDialog.this.d = i;
            }
        });
        this.g = a(this.mRightOptions, (WheelView.OnWheelViewListener) new WheelView.OnWheelViewListener() {
            public void onSelected(boolean z, int i, String str) {
                String unused = TwoWheelOptionPickerDialog.this.e = str;
                int unused2 = TwoWheelOptionPickerDialog.this.f = i;
            }
        });
        a(linearLayout2, this.h);
        a(linearLayout2, this.g);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 500);
        layoutParams.setMargins(DensityUtil.dip2px(getContext(), 15.0f), 0, DensityUtil.dip2px(getContext(), 15.0f), 0);
        linearLayout.addView(linearLayout2, layoutParams);
    }

    private void a(LinearLayout linearLayout, WheelView wheelView) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) wheelView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(0, -2);
        }
        layoutParams.weight = 1.0f;
        linearLayout.addView(wheelView, layoutParams);
    }

    @NonNull
    private WheelView a(List<String> list, WheelView.OnWheelViewListener onWheelViewListener) {
        WheelView wheelView = new WheelView(this.f9111a);
        wheelView.setTextSize(16);
        wheelView.setTextColor(getResources().getColor(R.color.griver_wheelview_textcolor_normal), getResources().getColor(R.color.griver_wheelview_textcolor_focus));
        wheelView.setLineVisible(true);
        wheelView.setLineColor(getResources().getColor(R.color.griver_wheelview_linecolor));
        wheelView.setOffset(1);
        wheelView.setItems(list);
        wheelView.setOnWheelViewListener(onWheelViewListener);
        return wheelView;
    }

    private void b(LinearLayout linearLayout) {
        View view = new View(this.f9111a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(DensityUtil.dip2px(getContext(), 10.0f), 0, DensityUtil.dip2px(getContext(), 10.0f), DensityUtil.dip2px(getContext(), 20.0f));
        view.setBackgroundResource(R.color.griver_linecolor);
        linearLayout.addView(view, layoutParams);
    }

    public Resources getResources() {
        return getContext().getResources();
    }

    public String getRightSelectedOption() {
        return this.e;
    }

    public int getRightSelectedIndex() {
        return this.f;
    }

    public void setRightSelectedIndex(int i) {
        if (this.g != null) {
            this.f = i;
            String str = this.mRightOptions.get(i);
            this.e = str;
            this.g.setSelectedItem(str);
        }
    }

    public int getLeftSelectedIndex() {
        return this.d;
    }

    public void setLeftSelectedIndex(int i) {
        if (this.h != null) {
            this.d = i;
            String str = this.mLeftOptions.get(i);
            this.c = str;
            this.h.setSelectedItem(str);
        }
    }

    public String getLeftSelectedOption() {
        return this.c;
    }
}
