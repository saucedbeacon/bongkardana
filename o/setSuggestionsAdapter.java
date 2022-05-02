package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.Nullable;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public final class setSuggestionsAdapter {
    private static int equals = 0;
    private static int isInside = 1;
    private static final Object setMax = new Object();
    private final String getMax;
    public final Map<String, setGravity> getMin;
    @Nullable
    public getNextLocationOffset length;
    private final Context setMin;

    public setSuggestionsAdapter(Drawable.Callback callback, String str, getNextLocationOffset getnextlocationoffset, Map<String, setGravity> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.getMax = str;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('/');
            this.getMax = sb.toString();
        }
        if (!(callback instanceof View)) {
            setTitleMargin.setMax("LottieDrawable must be inside of a view for images to work.");
            this.getMin = new HashMap();
            this.setMin = null;
            return;
        }
        this.setMin = ((View) callback).getContext();
        this.getMin = map;
        this.length = getnextlocationoffset;
    }

    @Nullable
    public final Bitmap getMin(String str) {
        Throwable cause;
        setGravity setgravity = this.getMin.get(str);
        if (setgravity == null) {
            return null;
        }
        try {
            Bitmap bitmap = setgravity.setMin;
            if ((bitmap != null ? 'Q' : 18) != 18) {
                return bitmap;
            }
            try {
                if (this.length != null) {
                    Bitmap min = this.length.setMin();
                    if (min != null) {
                        getMax(str, min);
                    }
                    return min;
                }
                String str2 = setgravity.length;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = BlobStatic.MONITOR_IMAGE_WIDTH;
                try {
                    if (((Boolean) String.class.getMethod("startsWith", new Class[]{String.class}).invoke(str2, new Object[]{"data:"})).booleanValue()) {
                        int i = equals + 21;
                        isInside = i % 128;
                        int i2 = i % 2;
                        try {
                            if (!(((Integer) String.class.getMethod("indexOf", new Class[]{String.class}).invoke(str2, new Object[]{"base64,"})).intValue() <= 0)) {
                                try {
                                    byte[] decode = Base64.decode((String) String.class.getMethod("substring", new Class[]{Integer.TYPE}).invoke(str2, new Object[]{Integer.valueOf(((Integer) String.class.getMethod("indexOf", new Class[]{Integer.TYPE}).invoke(str2, new Object[]{44})).intValue() + 1)}), 0);
                                    int i3 = equals + 47;
                                    isInside = i3 % 128;
                                    int i4 = i3 % 2;
                                    return getMax(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                                } catch (IllegalArgumentException unused) {
                                    setTitleMargin.setMin("data URL did not have correct base64 format.");
                                    return null;
                                } catch (Throwable th) {
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            }
                        } finally {
                            cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                        }
                    }
                    try {
                        if (!TextUtils.isEmpty(this.getMax)) {
                            AssetManager assets = this.setMin.getAssets();
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.getMax);
                            sb.append(str2);
                            String obj = sb.toString();
                            Object[] objArr = new Object[2];
                            objArr[1] = obj;
                            objArr[0] = assets;
                            try {
                                return getMax(str, setTitleMarginStart.getMax(BitmapFactory.decodeStream((InputStream) ((Class) upFrom.setMax((Process.myPid() >> 22) + 19, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (56348 - View.resolveSize(0, 0)))).getMethod("getMin", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr), (Rect) null, options), setgravity.getMax, setgravity.setMax));
                            } catch (IllegalArgumentException unused2) {
                                setTitleMargin.setMin("Unable to decode image.");
                                return null;
                            }
                        } else {
                            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                        }
                    } catch (IOException unused3) {
                        setTitleMargin.setMin("Unable to open asset.");
                        return null;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                } finally {
                    Throwable cause3 = th.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final boolean setMax(Context context) {
        return (context == null && this.setMin == null) || this.setMin.equals(context);
    }

    public final Bitmap getMax(String str, @Nullable Bitmap bitmap) {
        synchronized (setMax) {
            this.getMin.get(str).setMin = bitmap;
        }
        return bitmap;
    }
}
