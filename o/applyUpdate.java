package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.TabBarBridgeExtension;

public class applyUpdate {
    private Canvas canvas;
    private Paint paint = new Paint();
    private TabBarBridgeExtension.AnonymousClass1 typeFace;

    public applyUpdate(Context context, Canvas canvas2) {
        this.canvas = canvas2;
        this.typeFace = new TabBarBridgeExtension.AnonymousClass1(context, 2);
    }

    public void stroke(@NonNull Paint paint2, String str, float f, @Nullable CornerPathEffect cornerPathEffect) {
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(Color.parseColor(str));
        paint2.setStrokeWidth(f);
        paint2.setPathEffect(cornerPathEffect);
        paint2.setAntiAlias(true);
    }

    public void strokeDash(@NonNull Paint paint2, String str, float f) {
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(Color.parseColor(str));
        paint2.setStrokeWidth(f);
        paint2.setPathEffect(new DashPathEffect(new float[]{6.0f, 4.0f, 6.0f, 4.0f}, 0.0f));
        paint2.setAntiAlias(true);
    }

    public void stroke(@NonNull Paint paint2, String str, float f) {
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(Color.parseColor(str));
        paint2.setStrokeWidth(f);
        paint2.setAntiAlias(true);
    }

    public void fill(@NonNull Paint paint2, String str, @Nullable CornerPathEffect cornerPathEffect) {
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(Color.parseColor(str));
        paint2.setPathEffect(cornerPathEffect);
        paint2.setAntiAlias(true);
    }

    public void fill(@NonNull Paint paint2, String str) {
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(Color.parseColor(str));
        paint2.setAntiAlias(true);
    }

    public void text(@NonNull String str, float f, float f2, String str2, Paint.Align align) {
        this.paint.set(this.typeFace.getTypeface(str2));
        this.paint.setTextAlign(align);
        this.paint.setAntiAlias(true);
        this.canvas.drawText(str, f, f2, this.paint);
    }

    public int multilineText(@NonNull String str, int i, int i2, int i3, String str2, Paint.Align align) {
        TextPaint textPaint = new TextPaint();
        textPaint.set(this.typeFace.getTypeface(str2));
        textPaint.setTextAlign(align);
        textPaint.setAntiAlias(true);
        String str3 = "\t";
        if (!str.contains(str3)) {
            str3 = " ";
        }
        float measureText = textPaint.measureText(str3);
        int i4 = i;
        for (String str4 : str.split(str3)) {
            if (!str4.equals("")) {
                float measureText2 = textPaint.measureText(str4);
                if (((float) ((750 - i4) - i3)) >= measureText2) {
                    float f = (float) i4;
                    this.canvas.drawText(str4, f, (float) i2, textPaint);
                    i4 = (int) (f + measureText2 + measureText);
                } else {
                    i2 = (int) (((float) i2) + (textPaint.descent() - textPaint.ascent()));
                    float f2 = (float) i;
                    this.canvas.drawText(str4, f2, (float) i2, textPaint);
                    i4 = (int) (f2 + measureText2 + measureText);
                }
            }
        }
        return i2;
    }

    public void multilineTextChar(@NonNull String str, int i, int i2, int i3, String str2, Paint.Align align) {
        int length = str.length();
        TextPaint textPaint = new TextPaint();
        textPaint.set(this.typeFace.getTypeface(str2));
        textPaint.setTextAlign(align);
        textPaint.setAntiAlias(true);
        int i4 = 0;
        while (length > i3) {
            str = str.substring(i4, length > i3 ? i3 : length);
            this.canvas.drawText(str, (float) i, (float) i2, textPaint);
            i4 += i3;
            length -= i3;
            if (length <= i3) {
                str = str.substring(i4, length);
            }
        }
        this.canvas.drawText(str, (float) i, (float) i2, textPaint);
    }

    public void text(@NonNull String str, float f, float f2, String str2) {
        this.paint.set(this.typeFace.getTypeface(str2));
        this.paint.setAntiAlias(true);
        this.canvas.drawText(str, f, f2, this.paint);
    }

    public float textLenght(@NonNull String str, String str2) {
        this.paint.set(this.typeFace.getTypeface(str2));
        return this.paint.measureText(str);
    }

    public void text(@NonNull String str, float f, float f2, int i, String str2, String str3) {
        this.paint.set(this.typeFace.getCustomTypeface(i, str2, str3));
        this.paint.setAntiAlias(true);
        this.canvas.drawText(str, f, f2, this.paint);
    }

    public void text(@NonNull String str, float f, float f2, int i, String str2, String str3, Paint.Align align) {
        this.paint.set(this.typeFace.getCustomTypeface(i, str2, str3));
        this.paint.setTextAlign(align);
        this.paint.setAntiAlias(true);
        this.canvas.drawText(str, f, f2, this.paint);
    }

    public void text(@NonNull String str, float f, float f2) {
        this.paint.setAntiAlias(true);
        this.canvas.drawText(str, f, f2, this.paint);
    }

    public void text(@NonNull String str, float f, float f2, int i, String str2, Paint.Align align) {
        TextPaint textPaint = new TextPaint();
        textPaint.set(this.typeFace.getTypeface(str2));
        textPaint.setTextAlign(align);
        textPaint.setAntiAlias(true);
        CharSequence ellipsize = TextUtils.ellipsize(str, textPaint, (float) i, TextUtils.TruncateAt.END);
        this.canvas.drawText(ellipsize, 0, ellipsize.length(), f, f2, textPaint);
    }
}
