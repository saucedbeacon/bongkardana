package com.zoloz.android.phone.zdoc.render;

import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.zoloz.android.phone.zdoc.R;
import com.zoloz.android.phone.zdoc.R2;
import com.zoloz.android.phone.zdoc.utils.HotReloadDrawable;
import zoloz.ap.com.toolkit.R2;

public class MessageViewRender extends BaseRender {
    public MessageViewRender(View view) {
        super(view);
    }

    public void renderBg() {
        this.view.findViewById(R.id.message_opt_layout).setBackgroundColor(R2.color.zdoc_message_view_bg_color());
        ImageView imageView = (ImageView) this.view.findViewById(R.id.btn_press);
        if (Build.VERSION.SDK_INT >= 16) {
            imageView.setBackground(HotReloadDrawable.zdoc_press_bg(this.view.getContext()));
        } else {
            imageView.setBackgroundDrawable(HotReloadDrawable.zdoc_press_bg(this.view.getContext()));
        }
        View findViewById = this.view.findViewById(R.id.btn_X);
        if (Build.VERSION.SDK_INT >= 16) {
            findViewById.setBackground(HotReloadDrawable.zdoc_x_bg(this.view.getContext()));
        } else {
            findViewById.setBackgroundDrawable(HotReloadDrawable.zdoc_x_bg(this.view.getContext()));
        }
        View findViewById2 = this.view.findViewById(R.id.btn_ok);
        if (Build.VERSION.SDK_INT >= 16) {
            findViewById2.setBackground(HotReloadDrawable.zdoc_confirm_bg(this.view.getContext()));
        } else {
            findViewById2.setBackgroundDrawable(HotReloadDrawable.zdoc_confirm_bg(this.view.getContext()));
        }
    }

    public void renderLabel() {
        TextView textView = (TextView) this.view.findViewById(R.id.zdoc_capture);
        if (textView != null) {
            textView.setText(R2.string.zdoc_capture());
            textView.setTextColor(R2.color.zdoc_message_tips_color());
        }
        TextView textView2 = (TextView) this.view.findViewById(R.id.tv_confirm_msg);
        if (textView2 != null) {
            textView2.setText(R2.string.zdoc_confirm());
            textView2.setTextColor(R2.color.zdoc_message_tips_color());
        }
        Button button = (Button) this.view.findViewById(R.id.zdoc_submit_text);
        Button button2 = (Button) this.view.findViewById(R.id.btn_X_label);
        if (button != null) {
            button.setText(R2.string.zdoc_submit());
            button.setTextColor(R2.color.zdoc_submit_text_color());
        }
        if (button2 != null) {
            button2.setText(R2.string.zdoc_retry());
            button2.setTextColor(R2.color.zdoc_retake_text_color());
        }
        TextView textView3 = (TextView) this.view.findViewById(R.id.tv_branding);
        textView3.setText(R2.string.zoloz_brand());
        textView3.setTextColor(R2.color.brand_text_color());
    }

    public void renderColor() {
        ((TextView) this.view.findViewById(R.id.remind_text)).setTextColor(R2.color.zdoc_frame_tips_color());
        ((TextView) this.view.findViewById(R.id.tv_main_message)).setTextColor(R2.color.zdoc_message_tips_color());
    }
}
