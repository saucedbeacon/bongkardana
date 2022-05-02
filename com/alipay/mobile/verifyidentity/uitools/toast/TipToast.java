package com.alipay.mobile.verifyidentity.uitools.toast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.alipay.mobile.verifyidentity.uitools.R;

public class TipToast extends Toast {
    public static final int FAIL = 1;
    public static final int LOADING = 3;
    public static final int SUCCESS = 0;
    public static final int WARN = 2;
    private final float HEIGHT = 80.0f;
    private final float WIDTH = 80.0f;
    private View flRoot;
    private FrameLayout fl_fill;
    private ImageView iv_fill;
    private Context mContext;
    private TextView msgView;
    private View root;

    public TipToast(Context context) {
        super(context);
        this.mContext = context;
        init();
    }

    public void setStatus(int i) {
        if (i == 0) {
            this.fl_fill.setVisibility(0);
            this.iv_fill.setImageResource(R.drawable.tip_right);
            this.msgView.setText(R.string.operate_success);
        } else if (i == 1) {
            this.fl_fill.setVisibility(0);
            this.iv_fill.setImageResource(R.drawable.tip_fail);
            this.msgView.setText(R.string.operate_fail);
        } else if (i == 2) {
            this.fl_fill.setVisibility(0);
            this.iv_fill.setImageResource(R.drawable.tip_warn);
            this.msgView.setText(R.string.operate_warn);
        }
    }

    private void init() {
        setDuration(0);
        setGravity(17, 0, 0);
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.tip_toast, (ViewGroup) null);
        this.root = inflate;
        this.flRoot = inflate.findViewById(R.id.fl_root);
        this.msgView = (TextView) this.root.findViewById(R.id.tv_message);
        this.fl_fill = (FrameLayout) this.root.findViewById(R.id.fl_fill);
        this.iv_fill = (ImageView) this.root.findViewById(R.id.iv_fill);
        setView(this.root);
    }

    public void setMessage(String str) {
        this.msgView.setText(str);
    }
}
