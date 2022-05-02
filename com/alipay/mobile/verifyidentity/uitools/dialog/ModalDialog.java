package com.alipay.mobile.verifyidentity.uitools.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alipay.mobile.verifyidentity.uitools.R;

public class ModalDialog extends AlertDialog {
    private Context mContext;
    /* access modifiers changed from: private */
    public ModalInterface modalInterface;
    private TextView tvMessage;
    private TextView tvOk;

    public ModalDialog(Context context, ModalInterface modalInterface2) {
        super(context);
        this.modalInterface = modalInterface2;
        init(context);
    }

    private void init(Context context) {
        this.mContext = context;
        setCancelable(false);
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.modal_dailog, (ViewGroup) null);
        this.tvMessage = (TextView) inflate.findViewById(R.id.tv_msg);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_ok);
        this.tvOk = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ModalDialog.this.modalInterface != null) {
                    ModalDialog.this.modalInterface.onOk();
                }
            }
        });
        setView(inflate);
    }

    public void setMessage(String str) {
        this.tvMessage.setText(str);
    }
}
