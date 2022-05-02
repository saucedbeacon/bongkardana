package com.alibaba.griver.ui.jsapi.picker.nebula.wheelview.picker;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.griver.base.common.utils.DensityUtil;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.dialog.APAlertDialog;
import com.alibaba.griver.ui.jsapi.picker.nebula.wheelview.widget.WheelView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptionPickerDialog extends APAlertDialog {

    /* renamed from: a  reason: collision with root package name */
    private Activity f9110a;
    /* access modifiers changed from: private */
    public OnOptionPickListener b;
    /* access modifiers changed from: private */
    public String c;
    /* access modifiers changed from: private */
    public int d;
    private WheelView e;
    protected ArrayList<String> options;

    public interface OnOptionPickListener {
        void onOptionPicked(String str, int i);
    }

    public OptionPickerDialog(Activity activity, String str, String str2, String str3, String[] strArr) {
        this(activity, str, str2, str3, Arrays.asList(strArr));
    }

    public OptionPickerDialog(Activity activity, String str, String str2, String str3, List list) {
        super(activity, str, str2, str3);
        ArrayList<String> arrayList = new ArrayList<>();
        this.options = arrayList;
        this.c = "";
        this.d = -1;
        this.f9110a = activity;
        arrayList.addAll(list);
        setPositiveListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (OptionPickerDialog.this.b != null) {
                    OptionPickerDialog.this.b.onOptionPicked(OptionPickerDialog.this.c, OptionPickerDialog.this.d);
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

    public void setOnOptionPickListener(OnOptionPickListener onOptionPickListener) {
        this.b = onOptionPickListener;
    }

    public View getContentView() {
        ArrayList<String> arrayList = this.options;
        if (arrayList == null || arrayList.size() == 0) {
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
        WheelView wheelView = new WheelView(this.f9110a);
        this.e = wheelView;
        wheelView.setTextSize(16);
        this.e.setTextColor(getResources().getColor(R.color.griver_wheelview_textcolor_normal), getResources().getColor(R.color.griver_wheelview_textcolor_focus));
        this.e.setLineVisible(true);
        this.e.setLineColor(getResources().getColor(R.color.griver_wheelview_linecolor));
        this.e.setOffset(1);
        linearLayout.addView(this.e, new LinearLayout.LayoutParams(-1, -2));
        this.e.setItems(this.options);
        this.e.setOnWheelViewListener(new WheelView.OnWheelViewListener() {
            public void onSelected(boolean z, int i, String str) {
                String unused = OptionPickerDialog.this.c = str;
                int unused2 = OptionPickerDialog.this.d = i;
            }
        });
    }

    private void b(LinearLayout linearLayout) {
        View view = new View(this.f9110a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(DensityUtil.dip2px(getContext(), 10.0f), 0, DensityUtil.dip2px(getContext(), 10.0f), DensityUtil.dip2px(getContext(), 20.0f));
        view.setBackgroundResource(R.color.griver_linecolor);
        linearLayout.addView(view, layoutParams);
    }

    public Resources getResources() {
        return getContext().getResources();
    }

    public String getSelectedOption() {
        return this.c;
    }

    public int getSelectedIndex() {
        return this.d;
    }

    public void setSelectedIndex(int i) {
        this.d = i;
        int i2 = 0;
        while (true) {
            if (i2 >= this.options.size()) {
                break;
            } else if (i == i2) {
                this.c = this.options.get(i);
                break;
            } else {
                i2++;
            }
        }
        this.e.setSelectedItem(this.c);
    }
}
