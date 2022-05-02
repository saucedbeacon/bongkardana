package com.alipay.mobile.verifyidentity.uitools.count;

import android.content.Context;
import android.os.CountDownTimer;
import android.widget.TextView;
import com.alipay.mobile.verifyidentity.uitools.R;

public class CountTime extends CountDownTimer {
    private String baseText;
    private int colorActive;
    private int colorDisable;
    private Context context;
    private long lastTime;
    private TextView resend;

    public CountTime(Context context2, long j, long j2, TextView textView, String str) {
        super(j, j2);
        this.resend = textView;
        this.lastTime = j2;
        this.context = context2;
        this.baseText = str;
        this.colorActive = context2.getResources().getColor(R.color.high_light);
        this.colorDisable = context2.getResources().getColor(R.color.gravy_light);
    }

    public void setColorActive(int i) {
        this.colorActive = i;
    }

    public void setColorDisable(int i) {
        this.colorDisable = i;
    }

    public void onTick(long j) {
        this.lastTime = j;
        this.resend.setTextColor(this.colorDisable);
        TextView textView = this.resend;
        StringBuilder sb = new StringBuilder();
        sb.append(this.baseText);
        sb.append(" (");
        sb.append(j / 1000);
        sb.append("s)");
        textView.setText(sb.toString());
        this.resend.setClickable(false);
    }

    public void onFinish() {
        this.lastTime = 0;
        this.resend.setTextColor(this.colorActive);
        this.resend.setClickable(true);
        this.resend.setText(this.baseText);
    }

    public long getLastTime() {
        return this.lastTime;
    }
}
