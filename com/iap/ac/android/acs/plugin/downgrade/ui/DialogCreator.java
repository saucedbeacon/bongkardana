package com.iap.ac.android.acs.plugin.downgrade.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.iap.ac.android.acs.plugin.R;

public class DialogCreator {
    public static Dialog createDialog(Context context, String str, boolean z, String str2, String str3, final View.OnClickListener onClickListener, final View.OnClickListener onClickListener2) {
        final Dialog dialog = new Dialog(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.acplugin_layout_confirm_view, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.btn_confirm);
        TextView textView2 = (TextView) inflate.findViewById(R.id.btn_cancel);
        ((TextView) inflate.findViewById(R.id.tv_message)).setText(str);
        textView.setText(str2);
        textView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                View.OnClickListener onClickListener = onClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                dialog.dismiss();
            }
        });
        if (z) {
            textView2.setText(str3);
            textView2.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    View.OnClickListener onClickListener = onClickListener2;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    dialog.dismiss();
                }
            });
        } else {
            textView2.setVisibility(8);
        }
        dialog.setContentView(inflate);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        return dialog;
    }
}
