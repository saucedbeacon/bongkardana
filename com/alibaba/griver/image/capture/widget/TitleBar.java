package com.alibaba.griver.image.capture.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.griver.image.R;
import com.alibaba.griver.ui.ant.text.AUIconView;

public class TitleBar extends FrameLayout {
    public AUIconView ivBack;
    public ImageView ivCamera;
    public ImageView ivFlash;
    public LinearLayout llOptions;
    public TextView tvTitle;

    public TitleBar(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public TitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(R.layout.griver_image_view_title_bar, this, true);
        this.ivBack = (AUIconView) findViewById(R.id.ivBack);
        this.tvTitle = (TextView) findViewById(R.id.tvTitle);
        this.llOptions = (LinearLayout) findViewById(R.id.llOptions);
        this.ivFlash = (ImageView) findViewById(R.id.ivFlash);
        this.ivCamera = (ImageView) findViewById(R.id.ivChangeCamera);
    }

    public void setTitleText(String str) {
        this.tvTitle.setText(str);
    }
}
