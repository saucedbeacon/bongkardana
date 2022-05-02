package com.iap.ac.android.acs.plugin.ui.view;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.R;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.common.log.ACLog;

public class ACPluginDialog extends Dialog implements View.OnClickListener {
    private Activity mActivity;
    private OnCancelListener mOnCancelListener;
    private OnConfirmListener mOnConfirmListener;

    public interface OnCancelListener {
        void onCancel();
    }

    public interface OnConfirmListener {
        void onConfirm();
    }

    public ACPluginDialog(@NonNull Activity activity, @NonNull String str, @NonNull String str2, @NonNull String str3) {
        super(activity, R.style.ACPlugin_Style_Dialog);
        this.mActivity = activity;
        setContentView(R.layout.acplugin_layout_dialog);
        ((TextView) findViewById(R.id.desc_text)).setText(str);
        TextView textView = (TextView) findViewById(R.id.cancel_text);
        textView.setText(str2);
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) findViewById(R.id.confirm_text);
        textView2.setText(str3);
        textView2.setOnClickListener(this);
    }

    public void show() {
        if (!UIUtils.isActivityDisabled(this.mActivity)) {
            super.show();
        }
    }

    public void dismiss() {
        if (!UIUtils.isActivityDisabled(this.mActivity)) {
            super.dismiss();
        }
    }

    public void onClick(View view) {
        if (UIUtils.isActivityDisabled(this.mActivity)) {
            ACLog.d(Constants.TAG, "ACPluginDialog#onClick, activity is disabled");
        } else if (view.getId() == R.id.cancel_text) {
            ACLog.d(Constants.TAG, "ACPluginDialog#onClick, click cancel button");
            OnCancelListener onCancelListener = this.mOnCancelListener;
            if (onCancelListener != null) {
                onCancelListener.onCancel();
            }
            dismiss();
        } else if (view.getId() == R.id.confirm_text) {
            ACLog.d(Constants.TAG, "ACPluginDialog#onClick, click confirm button");
            OnConfirmListener onConfirmListener = this.mOnConfirmListener;
            if (onConfirmListener != null) {
                onConfirmListener.onConfirm();
            }
            dismiss();
        }
    }

    public void setConfirmListener(@NonNull OnConfirmListener onConfirmListener) {
        this.mOnConfirmListener = onConfirmListener;
    }

    public void setCancelListener(@NonNull OnCancelListener onCancelListener) {
        this.mOnCancelListener = onCancelListener;
    }
}
