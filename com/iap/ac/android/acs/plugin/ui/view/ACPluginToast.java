package com.iap.ac.android.acs.plugin.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.R;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import id.dana.savings.activity.SavingsActivity;

@SuppressLint({"ShowToast"})
public class ACPluginToast {
    public static final int TYPE_FAIL = 2;
    public static final int TYPE_SUCCESS = 1;

    public interface OnToastDismissListener {
        void onDismiss();
    }

    @SuppressLint({"InflateParams"})
    public static Toast makeToast(@NonNull Context context, int i, @Nullable CharSequence charSequence, int i2) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.acplugin_layout_toast, (ViewGroup) null);
        int dp2px = UIUtils.dp2px(context, SavingsActivity.RV_BENEFIT_WIDTH);
        ((LinearLayout) inflate.findViewById(R.id.inner_layout)).setLayoutParams(new FrameLayout.LayoutParams(dp2px, dp2px));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.tip_image);
        if (i == 1) {
            imageView.setVisibility(0);
            imageView.setBackgroundResource(R.drawable.acplugin_success);
        } else if (i == 2) {
            imageView.setVisibility(0);
            imageView.setBackgroundResource(R.drawable.acplugin_failed);
        } else {
            imageView.setVisibility(8);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.tip_text);
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(0);
            textView.setText(charSequence);
        } else {
            textView.setVisibility(8);
        }
        Toast makeText = Toast.makeText(context, charSequence, i2);
        makeText.setView(inflate);
        makeText.setGravity(17, 0, 0);
        return makeText;
    }

    public static Toast makeToast(@NonNull Context context, int i, @Nullable CharSequence charSequence, int i2, @NonNull final OnToastDismissListener onToastDismissListener) {
        Toast makeToast = makeToast(context, i, charSequence, i2);
        View view = makeToast.getView();
        if (view != null) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                public final void onViewAttachedToWindow(View view) {
                }

                public final void onViewDetachedFromWindow(View view) {
                    onToastDismissListener.onDismiss();
                }
            });
        }
        return makeToast;
    }
}
