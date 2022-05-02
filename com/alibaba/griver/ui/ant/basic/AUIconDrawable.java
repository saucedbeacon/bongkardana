package com.alibaba.griver.ui.ant.basic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.utils.DensityUtil;
import com.alibaba.griver.ui.ant.model.IconPaintBuilder;
import com.alibaba.griver.ui.ant.utils.IconfontConstants;
import com.alibaba.griver.ui.ant.utils.ResourceUtils;
import com.alibaba.griver.ui.ant.utils.TypefaceCache;
import java.io.File;

public class AUIconDrawable extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private final String f10545a = "iconfont://";
    private final String b = "AUIconDrawable";
    private final TextPaint c = new TextPaint(1);
    private int d = 0;
    private String e = "";

    private String b() {
        return IconfontConstants.DEFAULT_ICONFONT_BUNDLE;
    }

    public int getOpacity() {
        return -3;
    }

    public AUIconDrawable(Context context, String str) {
        if (str.startsWith("iconfont://")) {
            try {
                Uri parse = Uri.parse(str);
                String queryParameter = parse.getQueryParameter("id");
                String queryParameter2 = parse.getQueryParameter(GriverMonitorConstants.KEY_SIZE);
                String queryParameter3 = parse.getQueryParameter("color");
                a(context, new IconPaintBuilder(Color.parseColor(queryParameter3), DensityUtil.dip2px(context, Float.valueOf(queryParameter2).floatValue()), queryParameter));
            } catch (Throwable th) {
                RVLogger.e("AUIconDrawable", th.toString());
            }
        }
    }

    public AUIconDrawable(Context context, IconPaintBuilder iconPaintBuilder) {
        a(context, iconPaintBuilder);
    }

    private void a(Context context, IconPaintBuilder iconPaintBuilder) {
        if (iconPaintBuilder != null) {
            if (iconPaintBuilder.resId == 0 && !TextUtils.isEmpty(iconPaintBuilder.resString)) {
                iconPaintBuilder.resId = ResourceUtils.getResourceId(context, iconPaintBuilder.resString, "string");
            }
            this.d = iconPaintBuilder.size;
            this.e = context.getResources().getString(iconPaintBuilder.resId);
            this.c.setColor(iconPaintBuilder.color);
            this.c.setAntiAlias(true);
            this.c.setFakeBoldText(iconPaintBuilder.isBold);
            this.c.setTypeface(TypefaceCache.getTypeface(context, b(), a()));
            this.c.setTextAlign(Paint.Align.CENTER);
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.d;
        if (i < 0) {
            i = bounds.width();
        }
        int i2 = this.d;
        if (i2 < 0) {
            i2 = bounds.height();
        }
        this.c.setTextSize((float) i);
        canvas.drawText(this.e, (float) (i / 2), ((float) (i2 / 2)) - ((this.c.descent() + this.c.ascent()) / 2.0f), this.c);
    }

    public void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }

    public int getIntrinsicWidth() {
        return this.d;
    }

    public int getIntrinsicHeight() {
        return this.d;
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(b());
        sb.append(File.separator);
        sb.append("default.ttf");
        return sb.toString();
    }
}
