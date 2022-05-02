package com.alibaba.griver.image.framework.utils;

import android.widget.AbsListView;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.utils.ReflectUtils;
import com.alibaba.griver.image.GriverImageService;
import com.squareup.picasso.Picasso;

public class PauseOnScrollListener implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f10487a;
    private final boolean b;
    private final boolean c = ReflectUtils.classExist("com.squareup.picasso.Picasso");
    private final AbsListView.OnScrollListener d;

    public PauseOnScrollListener(boolean z, boolean z2, AbsListView.OnScrollListener onScrollListener) {
        this.f10487a = z;
        this.b = z2;
        this.d = onScrollListener;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2 && this.b && this.c) {
                    Picasso.with(GriverEnv.getApplicationContext()).cancelTag(GriverImageService.IMAGE_TAG);
                }
            } else if (this.f10487a && this.c) {
                Picasso.with(GriverEnv.getApplicationContext()).cancelTag(GriverImageService.IMAGE_TAG);
            }
        } else if (this.c) {
            Picasso.with(GriverEnv.getApplicationContext()).resumeTag(GriverImageService.IMAGE_TAG);
        }
        AbsListView.OnScrollListener onScrollListener = this.d;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i);
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AbsListView.OnScrollListener onScrollListener = this.d;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i, i2, i3);
        }
    }
}
