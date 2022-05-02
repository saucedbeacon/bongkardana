package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.android.exoplayer2.C;
import com.iap.ac.android.acs.plugin.ui.activity.ThirdPartyAuthActivity;
import id.dana.home.view.QrRefreshNotification;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import o.OptIn;
import o.RequiresPermission;

public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode toFloatRange = PorterDuff.Mode.SRC_IN;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String FastBitmap$CoordinateSystem;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String IsOverlapping = null;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ColorStateList equals = null;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable getMax = null;
    Object getMin;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int isInside = 0;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public byte[] length = null;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int setMax = -1;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int setMin = 0;
    PorterDuff.Mode toIntRange = toFloatRange;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface IconType {
    }

    private static String getMin(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return QrRefreshNotification.DATA;
            case 4:
                return ThirdPartyAuthActivity.KEY_URI;
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public static IconCompat getMax(Context context, @DrawableRes int i) {
        if (context != null) {
            return getMin(context.getResources(), context.getPackageName(), i);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat getMin(Resources resources, String str, @DrawableRes int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.setMin = i;
            if (resources != null) {
                try {
                    iconCompat.getMin = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.getMin = str;
            }
            iconCompat.FastBitmap$CoordinateSystem = str;
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    public static IconCompat length(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.getMin = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public static IconCompat getMax(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(5);
            iconCompat.getMin = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public IconCompat() {
    }

    private IconCompat(int i) {
        this.setMax = i;
    }

    public int length() {
        if (this.setMax != -1 || Build.VERSION.SDK_INT < 23) {
            return this.setMax;
        }
        return getMin((Icon) this.getMin);
    }

    @NonNull
    public String setMax() {
        if (this.setMax == -1 && Build.VERSION.SDK_INT >= 23) {
            return setMax((Icon) this.getMin);
        }
        if (this.setMax != 2) {
            throw new IllegalStateException("called getResPackage() on ".concat(String.valueOf(this)));
        } else if (TextUtils.isEmpty(this.FastBitmap$CoordinateSystem)) {
            return ((String) this.getMin).split(":", -1)[0];
        } else {
            return this.FastBitmap$CoordinateSystem;
        }
    }

    @IdRes
    public int getMax() {
        if (this.setMax == -1 && Build.VERSION.SDK_INT >= 23) {
            return length((Icon) this.getMin);
        }
        if (this.setMax == 2) {
            return this.setMin;
        }
        throw new IllegalStateException("called getResId() on ".concat(String.valueOf(this)));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Bitmap setMin() {
        if (this.setMax != -1 || Build.VERSION.SDK_INT < 23) {
            int i = this.setMax;
            if (i == 1) {
                return (Bitmap) this.getMin;
            }
            if (i == 5) {
                return setMin((Bitmap) this.getMin, true);
            }
            throw new IllegalStateException("called getBitmap() on ".concat(String.valueOf(this)));
        }
        Object obj = this.getMin;
        if (obj instanceof Bitmap) {
            return (Bitmap) obj;
        }
        return null;
    }

    @NonNull
    public Uri getMin() {
        if (this.setMax == -1 && Build.VERSION.SDK_INT >= 23) {
            return getMax((Icon) this.getMin);
        }
        int i = this.setMax;
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.getMin);
        }
        throw new IllegalStateException("called getUri() on ".concat(String.valueOf(this)));
    }

    @RequiresApi(23)
    @NonNull
    @Deprecated
    public Icon isInside() {
        return getMax((Context) null);
    }

    @RequiresApi(23)
    @NonNull
    public Icon getMax(@Nullable Context context) {
        Icon icon;
        switch (this.setMax) {
            case -1:
                return (Icon) this.getMin;
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.getMin);
                break;
            case 2:
                icon = Icon.createWithResource(setMax(), this.setMin);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.getMin, this.setMin, this.isInside);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.getMin);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    icon = Icon.createWithBitmap(setMin((Bitmap) this.getMin, false));
                    break;
                } else {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap) this.getMin);
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    icon = Icon.createWithAdaptiveBitmapContentUri(getMin());
                    break;
                } else if (context != null) {
                    InputStream min = getMin(context);
                    if (min != null) {
                        if (Build.VERSION.SDK_INT < 26) {
                            icon = Icon.createWithBitmap(setMin(BitmapFactory.decodeStream(min), false));
                            break;
                        } else {
                            icon = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(min));
                            break;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("Cannot load adaptive icon from uri: ");
                        sb.append(getMin());
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Context is required to resolve the file uri of the icon: ");
                    sb2.append(getMin());
                    throw new IllegalArgumentException(sb2.toString());
                }
            default:
                throw new IllegalArgumentException("Unknown type");
        }
        ColorStateList colorStateList = this.equals;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.toIntRange;
        if (mode != toFloatRange) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void length(@NonNull Context context) {
        Object obj;
        int identifier;
        if (this.setMax == 2 && (obj = this.getMin) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if (!"0_resource_name_obfuscated".equals(str4) && this.setMin != (identifier = length(context, setMax()).getIdentifier(str4, str3, str5))) {
                    this.setMin = identifier;
                }
            }
        }
    }

    @Nullable
    public Drawable setMin(@NonNull Context context) {
        length(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return getMax(context).loadDrawable(context);
        }
        Drawable max = setMax(context);
        if (!(max == null || (this.equals == null && this.toIntRange == toFloatRange))) {
            max.mutate();
            RequiresPermission.Read.setMin(max, this.equals);
            RequiresPermission.Read.setMin(max, this.toIntRange);
        }
        return max;
    }

    private Drawable setMax(Context context) {
        switch (this.setMax) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.getMin);
            case 2:
                String max = setMax();
                if (TextUtils.isEmpty(max)) {
                    max = context.getPackageName();
                }
                try {
                    return OptIn.getMax(length(context, max), this.setMin, context.getTheme());
                } catch (RuntimeException unused) {
                    Integer.valueOf(this.setMin);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.getMin, this.setMin, this.isInside));
            case 4:
                InputStream min = getMin(context);
                if (min != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(min));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), setMin((Bitmap) this.getMin, false));
            case 6:
                InputStream min2 = getMin(context);
                if (min2 != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        return new AdaptiveIconDrawable((Drawable) null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(min2)));
                    }
                    return new BitmapDrawable(context.getResources(), setMin(BitmapFactory.decodeStream(min2), false));
                }
                break;
        }
        return null;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.InputStream getMin(@androidx.annotation.NonNull android.content.Context r4) {
        /*
            r3 = this;
            android.net.Uri r0 = r3.getMin()
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0028
            java.lang.String r2 = "file"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0019
            goto L_0x0028
        L_0x0019:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0031 }
            java.io.File r0 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0031 }
            java.lang.Object r1 = r3.getMin     // Catch:{ FileNotFoundException -> 0x0031 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ FileNotFoundException -> 0x0031 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0031 }
            r4.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0031 }
            return r4
        L_0x0028:
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{  }
            java.io.InputStream r4 = r4.openInputStream(r0)     // Catch:{  }
            return r4
        L_0x0031:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.getMin(android.content.Context):java.io.InputStream");
    }

    private static Resources length(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    @NonNull
    public String toString() {
        if (this.setMax == -1) {
            return String.valueOf(this.getMin);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(getMin(this.setMax));
        switch (this.setMax) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.getMin).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.getMin).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.FastBitmap$CoordinateSystem);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(getMax())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.setMin);
                if (this.isInside != 0) {
                    sb.append(" off=");
                    sb.append(this.isInside);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.getMin);
                break;
        }
        if (this.equals != null) {
            sb.append(" tint=");
            sb.append(this.equals);
        }
        if (this.toIntRange != toFloatRange) {
            sb.append(" mode=");
            sb.append(this.toIntRange);
        }
        sb.append(")");
        return sb.toString();
    }

    public void setMax(boolean z) {
        this.IsOverlapping = this.toIntRange.name();
        switch (this.setMax) {
            case -1:
                if (!z) {
                    this.getMax = (Parcelable) this.getMin;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.getMin).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.length = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.getMax = (Parcelable) this.getMin;
                return;
            case 2:
                this.length = ((String) this.getMin).getBytes(Charset.forName(C.UTF16_NAME));
                return;
            case 3:
                this.length = (byte[]) this.getMin;
                return;
            case 4:
            case 6:
                this.length = this.getMin.toString().getBytes(Charset.forName(C.UTF16_NAME));
                return;
            default:
                return;
        }
    }

    public void IsOverlapping() {
        this.toIntRange = PorterDuff.Mode.valueOf(this.IsOverlapping);
        switch (this.setMax) {
            case -1:
                Parcelable parcelable = this.getMax;
                if (parcelable != null) {
                    this.getMin = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = this.getMax;
                if (parcelable2 != null) {
                    this.getMin = parcelable2;
                    return;
                }
                byte[] bArr = this.length;
                this.getMin = bArr;
                this.setMax = 3;
                this.setMin = 0;
                this.isInside = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.length, Charset.forName(C.UTF16_NAME));
                this.getMin = str;
                if (this.setMax == 2 && this.FastBitmap$CoordinateSystem == null) {
                    this.FastBitmap$CoordinateSystem = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.getMin = this.length;
                return;
            default:
                return;
        }
    }

    @RequiresApi(23)
    private static int getMin(@NonNull Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return -1;
        }
    }

    @RequiresApi(23)
    @Nullable
    private static String setMax(@NonNull Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @RequiresApi(23)
    @IdRes
    @DrawableRes
    private static int length(@NonNull Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    @RequiresApi(23)
    @Nullable
    private static Uri getMax(@NonNull Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @VisibleForTesting
    static Bitmap setMin(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }
}
