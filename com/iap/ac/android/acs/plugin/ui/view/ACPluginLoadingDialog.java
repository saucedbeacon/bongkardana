package com.iap.ac.android.acs.plugin.ui.view;

import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.R;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.common.log.ACLog;

public class ACPluginLoadingDialog extends Dialog {
    private Activity mActivity;
    private TextView mDescText = ((TextView) findViewById(R.id.desc_text));
    private ACPluginLoadingView mLoadingView = ((ACPluginLoadingView) findViewById(R.id.loading_view));

    public ACPluginLoadingDialog(@NonNull Activity activity) {
        super(activity, R.style.ACPlugin_Style_LoadingDialog);
        this.mActivity = activity;
        setContentView(R.layout.acplugin_layout_loading_dialog);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
    }

    public void show() {
        if (!UIUtils.isActivityDisabled(this.mActivity)) {
            super.show();
        }
    }

    public void dismiss() {
        if (this.mLoadingView != null) {
            ACLog.d(Constants.TAG, "ACPluginLoadingDialog#dismiss, stop loading animation");
            this.mLoadingView.stop();
        }
        if (!UIUtils.isActivityDisabled(this.mActivity)) {
            super.dismiss();
        }
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.mDescText.setText(charSequence);
            this.mDescText.setVisibility(0);
            return;
        }
        this.mDescText.setVisibility(8);
    }
}
