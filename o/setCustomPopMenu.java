package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.griver.image.framework.api.APImageFormat;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\"\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\"\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J \u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u0004J \u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lid/dana/utils/ScreenShotUtil;", "", "()V", "FILE_FORMAT", "", "MINIMUM_STORAGE_AVAILABLE", "", "createBitmapOnVisible", "Landroid/graphics/Bitmap;", "screenView", "Landroid/view/View;", "createBitmapScrollView", "view", "width", "height", "notifyGallery", "", "context", "Landroid/content/Context;", "imagePath", "saveBitmap", "bitmap", "filename", "takeOnVisibleScreenShot", "tag", "takeScreenShot", "takeScrollViewScreenShot", "Landroid/widget/ScrollView;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setCustomPopMenu {
    @NotNull
    public static final setCustomPopMenu getMax = new setCustomPopMenu();

    private setCustomPopMenu() {
    }

    public static Bitmap length(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        if (createBitmap != null) {
            view.draw(new Canvas(createBitmap));
        }
        return createBitmap;
    }

    public static Bitmap getMax(View view, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        if (createBitmap != null) {
            view.draw(new Canvas(createBitmap));
        }
        return createBitmap;
    }

    public static String setMax(Context context, Bitmap bitmap, String str) {
        if (!TextUtils.equals(Environment.getExternalStorageState(), "mounted")) {
            return "002";
        }
        if (bitmap == null) {
            return "003";
        }
        try {
            if (getRightSelectedIndex.length(context, str, APImageFormat.SUFFIX_PNG, bitmap, DanaLogConstants.TAG.STATEMENT)) {
                return "001";
            }
            return "003";
        } catch (Exception e) {
            updateActionSheetContent.e(DanaLogConstants.ExceptionType.STATEMENT_SCREENSHOT_EXCEPTION, e.getMessage());
            return "002";
        }
    }
}
