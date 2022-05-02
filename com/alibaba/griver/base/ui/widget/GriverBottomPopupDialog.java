package com.alibaba.griver.base.ui.widget;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.alibaba.griver.base.R;

public class GriverBottomPopupDialog extends Dialog {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public boolean f10242a = true;

    public GriverBottomPopupDialog(@NonNull Context context, View view) {
        super(context, R.style.GriverDialog);
        View inflate = LayoutInflater.from(context).inflate(R.layout.griver_bottom_popup_window, (ViewGroup) null);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.layout_pop_up_content);
        inflate.findViewById(R.id.tv_empty_text).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (GriverBottomPopupDialog.this.f10242a) {
                    GriverBottomPopupDialog.this.cancel();
                }
            }
        });
        frameLayout.removeAllViews();
        frameLayout.addView(view);
        setContentView(inflate);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        this.f10242a = false;
    }
}
