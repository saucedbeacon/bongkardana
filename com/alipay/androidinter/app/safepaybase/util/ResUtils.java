package com.alipay.androidinter.app.safepaybase.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alipay.androidinter.app.safepaybase.log.LogTracer;
import java.lang.reflect.Field;

public class ResUtils {
    private static boolean LOLLIPOP = (Build.VERSION.SDK_INT >= 21);
    private static Context mContext;
    private static String mPackageName = "com.alipay.android.phone.safepaybase";

    public static void setUiContext(Context context) {
        mContext = context.getApplicationContext();
        LogTracer.getInstance().initialize(context);
    }

    public static Context getContext() {
        return mContext;
    }

    public static int getId(String str) {
        return getResourceId(str, "id");
    }

    public static int getAnimId(String str) {
        return getResourceId(str, "anim");
    }

    public static int getColorId(String str) {
        return getResourceId(str, "color");
    }

    public static int getDimenId(String str) {
        return getResourceId(str, "dimen");
    }

    public static int getDrawableId(String str) {
        return getResourceId(str, "drawable");
    }

    public static int getLayoutId(String str) {
        return getResourceId(str, TtmlNode.TAG_LAYOUT);
    }

    public static int getStringId(String str) {
        return getResourceId(str, "string");
    }

    public static int getStyleId(String str) {
        return getResourceId(str, TtmlNode.TAG_STYLE);
    }

    public static int getStyleableId(String str) {
        return getResourceId(str, "styleable");
    }

    public static int getXmlId(String str) {
        return getResourceId(str, "xml");
    }

    public static int getRawId(String str) {
        return getResourceId(str, "raw");
    }

    public static int[] getStyleableIds(String str) {
        return getResourceDeclareStyleableIntArray(mContext, str);
    }

    public static final int[] getResourceDeclareStyleableIntArray(Context context, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(getPackageName(context));
            sb.append(".R$styleable");
            for (Field field : Class.forName(sb.toString()).getFields()) {
                if (field.getName().equals(str)) {
                    return (int[]) field.get((Object) null);
                }
            }
        } catch (Throwable th) {
            LogTracer.getInstance().printExceptionStackTrace(th);
        }
        return null;
    }

    public static int getResourceId(String str, String str2) {
        Context context = mContext;
        if (!LOLLIPOP) {
            return getResourceId(context, str, str2);
        }
        String packageName = getPackageName(context);
        try {
            int resourceId = getResourceId(context, str, str2);
            if (resourceId > 0) {
                return resourceId;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(packageName);
            sb.append(".R$");
            sb.append(str2);
            return ((Integer) Class.forName(sb.toString()).getField(str).get((Object) null)).intValue();
        } catch (Exception unused) {
            return context.getResources().getIdentifier(str, str2, context.getPackageName());
        }
    }

    public static int getResourceId(Context context, String str, String str2) {
        try {
            return context.getResources().getIdentifier(str, str2, getPackageName(context));
        } catch (Exception e) {
            LogTracer.getInstance().printExceptionStackTrace(e);
            return -1;
        }
    }

    public static int getResourceId(Context context, String str, String str2, String str3) {
        try {
            return mContext.getResources().getIdentifier(str, str2, str3);
        } catch (Exception e) {
            LogTracer.getInstance().printExceptionStackTrace(e);
            return -1;
        }
    }

    public static String getPackageName(Context context) {
        return mPackageName;
    }

    public static void setPackageName(String str) {
        mPackageName = str;
    }

    public static Drawable getPaddingDrawable(int i, int i2, Context context) {
        if (context != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            Resources resources = context.getResources();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDensity = 320;
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, i2, options);
            Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth() + ((int) (displayMetrics.density * 6.0f)), decodeResource.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Rect rect = new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight());
            canvas.drawBitmap(decodeResource, rect, rect, (Paint) null);
            return new BitmapDrawable(resources, createBitmap);
        }
        throw new IllegalArgumentException("Invalid context");
    }
}
