package com.alipay.mobile.verifyidentity.uitools.toast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.alipay.mobile.verifyidentity.uitools.R;

public class CenterToast extends Toast {
    private final float WIDTH = 240.0f;
    private Context mContext;
    private TextView msgView;
    private View root;

    public CenterToast(Context context) {
        super(context);
        this.mContext = context;
        init();
    }

    private void init() {
        setDuration(0);
        setGravity(17, 0, 0);
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.gray_toast, (ViewGroup) null);
        this.root = inflate;
        this.msgView = (TextView) inflate.findViewById(R.id.tv_message);
        setView(this.root);
    }

    public void setMessage(String str) {
        this.msgView.setText(str);
    }
}
