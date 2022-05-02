package com.alipay.mobile.verifyidentity.uitools.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.alipay.mobile.verifyidentity.uitools.R;

public class CommonDialog extends AlertDialog {
    public static final int DIALOG_TYPE_FINGER_SPECIAL = 1002;
    public static final int DIALOG_TYPE_NORMAL = 1001;
    private Context mContext;
    /* access modifiers changed from: private */
    public ModalInterface modalInterface;
    View root;
    private TextView tvCancel;
    private TextView tvMessage;
    private TextView tvOk;
    private TextView tvTitle;

    public CommonDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        init(context, z);
    }

    public void setModalInterface(ModalInterface modalInterface2) {
        this.modalInterface = modalInterface2;
    }

    public void setTitle(String str) {
        if (TextUtils.isEmpty(str)) {
            this.tvTitle.setVisibility(8);
            return;
        }
        this.tvTitle.setText(str);
        this.tvTitle.setVisibility(0);
    }

    public void setCancelText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.tvCancel.setText(str);
        }
    }

    public void setMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            this.tvMessage.setVisibility(8);
            return;
        }
        this.tvMessage.setText(str);
        this.tvMessage.setVisibility(0);
    }

    private void init(Context context, boolean z) {
        this.mContext = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.pin_dailog, (ViewGroup) null);
        this.root = inflate;
        this.tvTitle = (TextView) inflate.findViewById(R.id.tv_title);
        this.tvMessage = (TextView) this.root.findViewById(R.id.tv_msg);
        TextView textView = (TextView) this.root.findViewById(R.id.tv_ok);
        this.tvOk = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (CommonDialog.this.modalInterface != null) {
                    CommonDialog.this.modalInterface.onOk();
                }
                CommonDialog.this.dismiss();
            }
        });
        if (z) {
            TextView textView2 = (TextView) this.root.findViewById(R.id.tv_cancel);
            this.tvCancel = textView2;
            textView2.setVisibility(0);
            this.tvCancel.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (CommonDialog.this.modalInterface != null) {
                        CommonDialog.this.modalInterface.onCancel();
                    }
                    CommonDialog.this.dismiss();
                }
            });
        }
    }

    public void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(this.mContext.getResources().getDisplayMetrics().widthPixels - ((int) ((this.mContext.getResources().getDisplayMetrics().density * 48.0f) + 0.5f)), -2);
        }
        setContentView(this.root);
    }
}
