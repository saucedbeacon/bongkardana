package zoloz.ap.com.toolkit.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;
import java.lang.ref.WeakReference;

public class CustomImgSpan extends DynamicDrawableSpan {
    private final Context mContext;
    private Drawable mDrawable;
    private WeakReference<Drawable> mDrawableRef;
    private int mHeight;
    private int mResourceId = -1;
    private String mResourcePath = null;
    private final int mSize;
    private final int mTextSize;
    private int mTop;
    private int mWidth;
    private final int maxHeight = 300;
    private final int maxWidth = 300;

    public CustomImgSpan(Context context, int i, int i2, int i3) {
        super(1);
        this.mContext = context;
        this.mResourceId = i;
        this.mSize = i2;
        this.mHeight = i2;
        this.mWidth = i2;
        this.mTextSize = i3;
    }

    public CustomImgSpan(Context context, String str, int i, int i2) {
        super(1);
        this.mContext = context;
        this.mResourcePath = str;
        this.mSize = i;
        this.mTextSize = i2;
    }

    public Drawable getDrawable() {
        int i;
        int i2;
        if (this.mDrawable == null) {
            try {
                if (this.mResourceId <= 0) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    int i3 = 1;
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.mResourcePath, options);
                    int min = Math.min(Math.round((((float) options.outWidth) * 1.0f) / 300.0f), Math.round((((float) options.outHeight) * 1.0f) / 300.0f));
                    if (min > 0) {
                        i3 = min;
                    }
                    options.inSampleSize = i3;
                    options.inJustDecodeBounds = false;
                    Bitmap decodeFile = BitmapFactory.decodeFile(this.mResourcePath, options);
                    i2 = decodeFile.getWidth();
                    i = decodeFile.getHeight();
                    this.mDrawable = new BitmapDrawable(decodeFile);
                } else {
                    Drawable drawable = this.mContext.getResources().getDrawable(this.mResourceId);
                    this.mDrawable = drawable;
                    i2 = drawable.getIntrinsicWidth();
                    i = this.mDrawable.getIntrinsicHeight();
                }
                if (i2 < i) {
                    int i4 = this.mSize;
                    this.mHeight = i4;
                    this.mWidth = (i4 * i2) / i;
                } else {
                    int i5 = this.mSize;
                    this.mWidth = i5;
                    this.mHeight = (i5 * i) / i2;
                }
                int i6 = (this.mTextSize - this.mHeight) / 2;
                this.mTop = i6;
                this.mDrawable.setBounds(0, i6, this.mWidth, this.mHeight + i6);
            } catch (Exception unused) {
            }
        }
        return this.mDrawable;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable cachedDrawable = getCachedDrawable();
        canvas.save();
        int i6 = i5 - cachedDrawable.getBounds().bottom;
        if (this.mVerticalAlignment == 1) {
            i6 = ((i3 + ((i5 - i3) / 2)) - ((cachedDrawable.getBounds().bottom - cachedDrawable.getBounds().top) / 2)) - this.mTop;
        }
        canvas.translate(f, (float) i6);
        cachedDrawable.draw(canvas);
        canvas.restore();
    }

    private Drawable getCachedDrawable() {
        WeakReference<Drawable> weakReference = this.mDrawableRef;
        if (weakReference == null || weakReference.get() == null) {
            this.mDrawableRef = new WeakReference<>(getDrawable());
        }
        return this.mDrawableRef.get();
    }
}
