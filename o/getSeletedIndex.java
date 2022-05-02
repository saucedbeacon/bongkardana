package o;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.widget.ImageView;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.ConfirmPopup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J6\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0007J(\u0010\u0019\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0007J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lid/dana/utils/ImageUtil;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "computeSampleSize", "", "width", "height", "maxWidth", "maxHeight", "createFile", "Ljava/io/File;", "imageOrigin", "Landroid/graphics/Bitmap;", "privateFilePath", "maxBytes", "", "decodeBitmapFromByteArray", "source", "", "options", "Landroid/graphics/BitmapFactory$Options;", "orientation", "flipWidthAndHeight", "localImageNamingByDate", "scaledDownImageResult", "setGrayScale", "", "imageView", "Landroid/widget/ImageView;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getSeletedIndex {
    private static final String getMax = getSeletedIndex.class.getName();
    @NotNull
    public static final getSeletedIndex getMin = new getSeletedIndex();

    private getSeletedIndex() {
    }

    /* access modifiers changed from: private */
    @JvmStatic
    @Nullable
    public static Bitmap getMin(@NotNull byte[] bArr, @NotNull BitmapFactory.Options options, int i) {
        Intrinsics.checkNotNullParameter(bArr, "source");
        Intrinsics.checkNotNullParameter(options, SecurityConstants.KEY_OPTIONS);
        try {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            if (i == 0 || decodeByteArray == null) {
                return decodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.setRotate((float) i);
            Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
            decodeByteArray.recycle();
            return createBitmap;
        } catch (OutOfMemoryError e) {
            updateActionSheetContent.e(getMax, e.toString());
            return null;
        }
    }

    @NotNull
    @SuppressLint({"DefaultLocale"})
    public static File getMax(@NotNull Bitmap bitmap, @NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(bitmap, "imageOrigin");
        Intrinsics.checkNotNullParameter(str, "privateFilePath");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        StringBuilder sb2 = new StringBuilder("IMG_");
        sb2.append(ConfirmPopup.AnonymousClass1.setMax("yyyy_MM_dd_HH_mm_ss_SSS"));
        sb2.append('_');
        sb.append(sb2.toString());
        sb.append(".");
        String name = Bitmap.CompressFormat.PNG.name();
        if (name != null) {
            String lowerCase = name.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            sb.append(lowerCase);
            String obj = sb.toString();
            Bitmap min = setContentViewAfter.setMin(bitmap, j);
            if (!Intrinsics.areEqual((Object) min, (Object) bitmap)) {
                bitmap.recycle();
            }
            Intrinsics.checkNotNullExpressionValue(min, "scaledBitmap");
            File max = ConfirmPopup.AnonymousClass2.getMax(obj, min);
            Intrinsics.checkNotNullExpressionValue(max, "FileUtil.saveFile(\n     …t(imageOrigin, maxBytes))");
            return max;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public static void length(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        imageView.setImageAlpha(200);
    }
}
