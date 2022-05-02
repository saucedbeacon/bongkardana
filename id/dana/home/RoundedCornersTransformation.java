package id.dana.home;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import o.rebuildScene;
import o.setType;

public final class RoundedCornersTransformation extends setType {
    private int getMax;
    private int getMin;
    private int length;
    private CornerType setMax;

    public enum CornerType {
        ALL,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        OTHER_TOP_LEFT,
        OTHER_TOP_RIGHT,
        OTHER_BOTTOM_LEFT,
        OTHER_BOTTOM_RIGHT,
        DIAGONAL_FROM_TOP_LEFT,
        DIAGONAL_FROM_TOP_RIGHT
    }

    public final Bitmap setMax(@NonNull rebuildScene rebuildscene, @NonNull Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap min = rebuildscene.setMin(width, height, Bitmap.Config.ARGB_8888);
        min.setHasAlpha(true);
        Canvas canvas = new Canvas(min);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        float f = (float) width;
        float f2 = (float) height;
        int i3 = this.getMax;
        float f3 = f - ((float) i3);
        float f4 = f2 - ((float) i3);
        switch (AnonymousClass5.setMax[this.setMax.ordinal()]) {
            case 1:
                int i4 = this.getMax;
                RectF rectF = new RectF((float) i4, (float) i4, f3, f4);
                int i5 = this.getMin;
                canvas.drawRoundRect(rectF, (float) i5, (float) i5, paint);
                break;
            case 2:
                int i6 = this.getMax;
                int i7 = this.length;
                RectF rectF2 = new RectF((float) i6, (float) i6, (float) (i6 + i7), (float) (i6 + i7));
                int i8 = this.getMin;
                canvas.drawRoundRect(rectF2, (float) i8, (float) i8, paint);
                int i9 = this.getMax;
                int i10 = this.getMin;
                canvas.drawRect(new RectF((float) i9, (float) (i9 + i10), (float) (i9 + i10), f4), paint);
                int i11 = this.getMax;
                canvas.drawRect(new RectF((float) (this.getMin + i11), (float) i11, f3, f4), paint);
                break;
            case 3:
                int i12 = this.length;
                int i13 = this.getMax;
                RectF rectF3 = new RectF(f3 - ((float) i12), (float) i13, f3, (float) (i13 + i12));
                int i14 = this.getMin;
                canvas.drawRoundRect(rectF3, (float) i14, (float) i14, paint);
                int i15 = this.getMax;
                canvas.drawRect(new RectF((float) i15, (float) i15, f3 - ((float) this.getMin), f4), paint);
                int i16 = this.getMin;
                canvas.drawRect(new RectF(f3 - ((float) i16), (float) (this.getMax + i16), f3, f4), paint);
                break;
            case 4:
                int i17 = this.getMax;
                int i18 = this.length;
                RectF rectF4 = new RectF((float) i17, f4 - ((float) i18), (float) (i17 + i18), f4);
                int i19 = this.getMin;
                canvas.drawRoundRect(rectF4, (float) i19, (float) i19, paint);
                int i20 = this.getMax;
                canvas.drawRect(new RectF((float) i20, (float) i20, (float) (i20 + this.length), f4 - ((float) this.getMin)), paint);
                int i21 = this.getMax;
                canvas.drawRect(new RectF((float) (this.getMin + i21), (float) i21, f3, f4), paint);
                break;
            case 5:
                int i22 = this.length;
                RectF rectF5 = new RectF(f3 - ((float) i22), f4 - ((float) i22), f3, f4);
                int i23 = this.getMin;
                canvas.drawRoundRect(rectF5, (float) i23, (float) i23, paint);
                int i24 = this.getMax;
                canvas.drawRect(new RectF((float) i24, (float) i24, f3 - ((float) this.getMin), f4), paint);
                int i25 = this.getMin;
                canvas.drawRect(new RectF(f3 - ((float) i25), (float) this.getMax, f3, f4 - ((float) i25)), paint);
                break;
            case 6:
                int i26 = this.getMax;
                RectF rectF6 = new RectF((float) i26, (float) i26, f3, (float) (i26 + this.length));
                int i27 = this.getMin;
                canvas.drawRoundRect(rectF6, (float) i27, (float) i27, paint);
                int i28 = this.getMax;
                canvas.drawRect(new RectF((float) i28, (float) (i28 + this.getMin), f3, f4), paint);
                break;
            case 7:
                RectF rectF7 = new RectF((float) this.getMax, f4 - ((float) this.length), f3, f4);
                int i29 = this.getMin;
                canvas.drawRoundRect(rectF7, (float) i29, (float) i29, paint);
                int i30 = this.getMax;
                canvas.drawRect(new RectF((float) i30, (float) i30, f3, f4 - ((float) this.getMin)), paint);
                break;
            case 8:
                int i31 = this.getMax;
                RectF rectF8 = new RectF((float) i31, (float) i31, (float) (i31 + this.length), f4);
                int i32 = this.getMin;
                canvas.drawRoundRect(rectF8, (float) i32, (float) i32, paint);
                int i33 = this.getMax;
                canvas.drawRect(new RectF((float) (this.getMin + i33), (float) i33, f3, f4), paint);
                break;
            case 9:
                RectF rectF9 = new RectF(f3 - ((float) this.length), (float) this.getMax, f3, f4);
                int i34 = this.getMin;
                canvas.drawRoundRect(rectF9, (float) i34, (float) i34, paint);
                int i35 = this.getMax;
                canvas.drawRect(new RectF((float) i35, (float) i35, f3 - ((float) this.getMin), f4), paint);
                break;
            case 10:
                RectF rectF10 = new RectF((float) this.getMax, f4 - ((float) this.length), f3, f4);
                int i36 = this.getMin;
                canvas.drawRoundRect(rectF10, (float) i36, (float) i36, paint);
                RectF rectF11 = new RectF(f3 - ((float) this.length), (float) this.getMax, f3, f4);
                int i37 = this.getMin;
                canvas.drawRoundRect(rectF11, (float) i37, (float) i37, paint);
                int i38 = this.getMax;
                int i39 = this.getMin;
                canvas.drawRect(new RectF((float) i38, (float) i38, f3 - ((float) i39), f4 - ((float) i39)), paint);
                break;
            case 11:
                int i40 = this.getMax;
                RectF rectF12 = new RectF((float) i40, (float) i40, (float) (i40 + this.length), f4);
                int i41 = this.getMin;
                canvas.drawRoundRect(rectF12, (float) i41, (float) i41, paint);
                RectF rectF13 = new RectF((float) this.getMax, f4 - ((float) this.length), f3, f4);
                int i42 = this.getMin;
                canvas.drawRoundRect(rectF13, (float) i42, (float) i42, paint);
                int i43 = this.getMax;
                int i44 = this.getMin;
                canvas.drawRect(new RectF((float) (i43 + i44), (float) i43, f3, f4 - ((float) i44)), paint);
                break;
            case 12:
                int i45 = this.getMax;
                RectF rectF14 = new RectF((float) i45, (float) i45, f3, (float) (i45 + this.length));
                int i46 = this.getMin;
                canvas.drawRoundRect(rectF14, (float) i46, (float) i46, paint);
                RectF rectF15 = new RectF(f3 - ((float) this.length), (float) this.getMax, f3, f4);
                int i47 = this.getMin;
                canvas.drawRoundRect(rectF15, (float) i47, (float) i47, paint);
                int i48 = this.getMax;
                int i49 = this.getMin;
                canvas.drawRect(new RectF((float) i48, (float) (i48 + i49), f3 - ((float) i49), f4), paint);
                break;
            case 13:
                int i50 = this.getMax;
                RectF rectF16 = new RectF((float) i50, (float) i50, f3, (float) (i50 + this.length));
                int i51 = this.getMin;
                canvas.drawRoundRect(rectF16, (float) i51, (float) i51, paint);
                int i52 = this.getMax;
                RectF rectF17 = new RectF((float) i52, (float) i52, (float) (i52 + this.length), f4);
                int i53 = this.getMin;
                canvas.drawRoundRect(rectF17, (float) i53, (float) i53, paint);
                int i54 = this.getMax;
                int i55 = this.getMin;
                canvas.drawRect(new RectF((float) (i54 + i55), (float) (i54 + i55), f3, f4), paint);
                break;
            case 14:
                int i56 = this.getMax;
                int i57 = this.length;
                RectF rectF18 = new RectF((float) i56, (float) i56, (float) (i56 + i57), (float) (i56 + i57));
                int i58 = this.getMin;
                canvas.drawRoundRect(rectF18, (float) i58, (float) i58, paint);
                int i59 = this.length;
                RectF rectF19 = new RectF(f3 - ((float) i59), f4 - ((float) i59), f3, f4);
                int i60 = this.getMin;
                canvas.drawRoundRect(rectF19, (float) i60, (float) i60, paint);
                int i61 = this.getMax;
                canvas.drawRect(new RectF((float) i61, (float) (i61 + this.getMin), f3 - ((float) this.length), f4), paint);
                int i62 = this.getMax;
                canvas.drawRect(new RectF((float) (this.length + i62), (float) i62, f3, f4 - ((float) this.getMin)), paint);
                break;
            case 15:
                int i63 = this.length;
                int i64 = this.getMax;
                RectF rectF20 = new RectF(f3 - ((float) i63), (float) i64, f3, (float) (i64 + i63));
                int i65 = this.getMin;
                canvas.drawRoundRect(rectF20, (float) i65, (float) i65, paint);
                int i66 = this.getMax;
                int i67 = this.length;
                RectF rectF21 = new RectF((float) i66, f4 - ((float) i67), (float) (i66 + i67), f4);
                int i68 = this.getMin;
                canvas.drawRoundRect(rectF21, (float) i68, (float) i68, paint);
                int i69 = this.getMax;
                int i70 = this.getMin;
                canvas.drawRect(new RectF((float) i69, (float) i69, f3 - ((float) i70), f4 - ((float) i70)), paint);
                int i71 = this.getMax;
                int i72 = this.getMin;
                canvas.drawRect(new RectF((float) (i71 + i72), (float) (i71 + i72), f3, f4), paint);
                break;
            default:
                int i73 = this.getMax;
                RectF rectF22 = new RectF((float) i73, (float) i73, f3, f4);
                int i74 = this.getMin;
                canvas.drawRoundRect(rectF22, (float) i74, (float) i74, paint);
                break;
        }
        return min;
    }

    public RoundedCornersTransformation(int i, int i2) {
        this(i, i2, CornerType.ALL);
    }

    public RoundedCornersTransformation(int i, int i2, CornerType cornerType) {
        this.getMin = i;
        this.length = i * 2;
        this.getMax = i2;
        this.setMax = cornerType;
    }

    /* renamed from: id.dana.home.RoundedCornersTransformation$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] setMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                id.dana.home.RoundedCornersTransformation$CornerType[] r0 = id.dana.home.RoundedCornersTransformation.CornerType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMax = r0
                id.dana.home.RoundedCornersTransformation$CornerType r1 = id.dana.home.RoundedCornersTransformation.CornerType.ALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x001d }
                id.dana.home.RoundedCornersTransformation$CornerType r1 = id.dana.home.RoundedCornersTransformation.CornerType.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                id.dana.home.RoundedCornersTransformation$CornerType r1 = id.dana.home.RoundedCornersTransformation.CornerType.TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0033 }
                id.dana.home.RoundedCornersTransformation$CornerType r1 = id.dana.home.RoundedCornersTransformation.CornerType.BOTTOM_LEFT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x003e }
                id.dana.home.RoundedCornersTransformation$CornerType r1 = id.dana.home.RoundedCornersTransformation.CornerType.BOTTOM_RIGHT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0049 }
                id.dana.home.RoundedCornersTransformation$CornerType r1 = id.dana.home.RoundedCornersTransformation.CornerType.TOP     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0054 }
                id.dana.home.RoundedCornersTransformation$CornerType r1 = id.dana.home.RoundedCornersTransformation.CornerType.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0060 }
                id.dana.home.RoundedCornersTransformation$CornerType r1 = id.dana.home.RoundedCornersTransformation.CornerType.LEFT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x006c }
                id.dana.home.RoundedCornersTransformation$CornerType r1 = id.dana.home.RoundedCornersTransformation.CornerType.RIGHT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0078 }
                id.dana.home.RoundedCornersTransformation$CornerType r1 = id.dana.home.RoundedCornersTransformation.CornerType.OTHER_TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0084 }
                id.dana.home.RoundedCornersTransformation$CornerType r1 = id.dana.home.RoundedCornersTransformation.CornerType.OTHER_TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0090 }
                id.dana.home.RoundedCornersTransformation$CornerType r1 = id.dana.home.RoundedCornersTransformation.CornerType.OTHER_BOTTOM_LEFT     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x009c }
                id.dana.home.RoundedCornersTransformation$CornerType r1 = id.dana.home.RoundedCornersTransformation.CornerType.OTHER_BOTTOM_RIGHT     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x00a8 }
                id.dana.home.RoundedCornersTransformation$CornerType r1 = id.dana.home.RoundedCornersTransformation.CornerType.DIAGONAL_FROM_TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x00b4 }
                id.dana.home.RoundedCornersTransformation$CornerType r1 = id.dana.home.RoundedCornersTransformation.CornerType.DIAGONAL_FROM_TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.home.RoundedCornersTransformation.AnonymousClass5.<clinit>():void");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedTransformation(radius=");
        sb.append(this.getMin);
        sb.append(", margin=");
        sb.append(this.getMax);
        sb.append(", diameter=");
        sb.append(this.length);
        sb.append(", cornerType=");
        sb.append(this.setMax.name());
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RoundedCornersTransformation)) {
            return false;
        }
        RoundedCornersTransformation roundedCornersTransformation = (RoundedCornersTransformation) obj;
        return roundedCornersTransformation.getMin == this.getMin && roundedCornersTransformation.length == this.length && roundedCornersTransformation.getMax == this.getMax && roundedCornersTransformation.setMax == this.setMax;
    }

    public final int hashCode() {
        return "jp.wasabeef.glide.transformations.RoundedCornersTransformation.1".hashCode() + (this.getMin * 10000) + (this.length * 1000) + (this.getMax * 100) + (this.setMax.ordinal() * 10);
    }

    public final void setMax(@NonNull MessageDigest messageDigest) {
        StringBuilder sb = new StringBuilder("jp.wasabeef.glide.transformations.RoundedCornersTransformation.1");
        sb.append(this.getMin);
        sb.append(this.length);
        sb.append(this.getMax);
        sb.append(this.setMax);
        messageDigest.update(sb.toString().getBytes(setMin));
    }
}
