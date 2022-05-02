package com.alibaba.griver.ui.ant.theme;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.ui.ant.api.AUViewInterface;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.alibaba.griver.ui.ant.utils.AUScreenUtils;
import java.util.HashMap;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class AUAbsTheme {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f10568a = new HashMap();

    /* access modifiers changed from: protected */
    public abstract void initTheme();

    public AUAbsTheme() {
        initTheme();
    }

    public boolean containsKey(String str) {
        return this.f10568a.containsKey(str);
    }

    public void put(String str, Object obj) {
        this.f10568a.put(str, obj);
    }

    public Map<String, Object> getTheme() {
        return this.f10568a;
    }

    public Integer getResId(String str) {
        return getResId(str, (Integer) null);
    }

    public Integer getResId(String str, Integer num) {
        Object obj = this.f10568a.get(str);
        return obj instanceof Integer ? (Integer) obj : num;
    }

    public Integer getColor(Context context, String str) {
        return getColor(context, str, (Integer) null);
    }

    public Integer getColor(Context context, String str, Integer num) {
        Object obj = this.f10568a.get(str);
        try {
            if (obj instanceof Integer) {
                return Integer.valueOf(context.getResources().getColor(((Integer) obj).intValue()));
            }
            if (obj instanceof String) {
                return Integer.valueOf(Color.parseColor((String) obj));
            }
            return num;
        } catch (Throwable th) {
            GriverLogger.e("AUAbsTheme", AUAbsTheme.class.getSimpleName(), th);
        }
    }

    public Float getDimension(Context context, String str) {
        return getDimension(context, str, (Float) null);
    }

    public Float getDimension(Context context, String str, Float f) {
        Object obj = this.f10568a.get(str);
        try {
            if (obj instanceof Float) {
                return (Float) obj;
            }
            if (obj instanceof Integer) {
                if (AUScreenUtils.checkApFlag(context, (AttributeSet) null, (AUViewInterface) null)) {
                    return Float.valueOf(Float.parseFloat(String.valueOf(AUScreenAdaptTool.getApFromDimen(context, ((Integer) obj).intValue()))));
                }
                return Float.valueOf(context.getResources().getDimension(((Integer) obj).intValue()));
            }
            return f;
        } catch (Exception e) {
            GriverLogger.debug("AUAbsTheme", "ap adapt, exception e= ".concat(String.valueOf(e)));
            return Float.valueOf(context.getResources().getDimension(((Integer) obj).intValue()));
        } catch (Throwable unused) {
        }
    }

    public Integer getDimensionPixelOffset(Context context, String str) {
        return getDimensionPixelOffset(context, str, (Integer) null);
    }

    public Integer getDimensionPixelOffset(Context context, String str, Integer num) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-2071892788, oncanceled);
                onCancelLoad.getMin(-2071892788, oncanceled);
            }
        }
        Object obj = this.f10568a.get(str);
        try {
            if (obj instanceof String) {
                return Integer.valueOf((String) obj);
            }
            if (obj instanceof Integer) {
                return Integer.valueOf(context.getResources().getDimensionPixelOffset(((Integer) obj).intValue()));
            }
            return num;
        } catch (Throwable th) {
            GriverLogger.e("AUAbsTheme", AUAbsTheme.class.getSimpleName(), th);
        }
    }

    public Drawable getDrawable(Context context, String str) {
        return getDrawable(context, str, (Drawable) null);
    }

    public Drawable getDrawable(Context context, String str, Drawable drawable) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-1302361039, oncanceled);
                onCancelLoad.getMin(-1302361039, oncanceled);
            }
        }
        Object obj = this.f10568a.get(str);
        try {
            if (obj instanceof Drawable) {
                return (Drawable) obj;
            }
            if (obj instanceof Integer) {
                if (context == null) {
                    return null;
                }
                return context.getResources().getDrawable(((Integer) obj).intValue());
            }
            return drawable;
        } catch (Throwable unused) {
        }
    }

    public ColorStateList getColorStateList(Context context, String str) {
        return getColorStateList(context, str, (ColorStateList) null);
    }

    public ColorStateList getColorStateList(Context context, String str, ColorStateList colorStateList) {
        Object obj = this.f10568a.get(str);
        try {
            if (obj instanceof ColorStateList) {
                return (ColorStateList) obj;
            }
            if (obj instanceof Integer) {
                if (context == null) {
                    return null;
                }
                return context.getResources().getColorStateList(((Integer) obj).intValue());
            }
            return colorStateList;
        } catch (Throwable unused) {
        }
    }
}
