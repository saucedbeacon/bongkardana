package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.annotation.Nullable;

public final class setContentViewAfter {
    private static final String getMin = setContentViewAfter.class.getSimpleName();

    private setContentViewAfter() {
    }

    @Nullable
    public static Bitmap length(String str) {
        if (TextUtils.isEmpty(str) || !new File(str).isFile()) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap setMin(Bitmap bitmap, long j) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int width2 = bitmap.getWidth() * bitmap.getHeight();
        if (j > 0) {
            long j2 = j / 2;
            if (((long) width2) <= j2) {
                return bitmap;
            }
            double d = (double) j2;
            double d2 = (double) width2;
            Double.isNaN(d);
            Double.isNaN(d2);
            double sqrt = Math.sqrt(d / d2);
            double d3 = (double) width;
            Double.isNaN(d3);
            width = (int) Math.floor(d3 * sqrt);
            double d4 = (double) height;
            Double.isNaN(d4);
            height = (int) Math.floor(d4 * sqrt);
        }
        return Bitmap.createScaledBitmap(bitmap, width, height, true);
    }

    public static Bitmap length(Uri uri, Context context) {
        try {
            return MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
        } catch (IOException unused) {
            return null;
        }
    }

    public static int setMax(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray().length;
    }

    public static String getMax(String str) {
        Bitmap bitmap = null;
        if (!TextUtils.isEmpty(str) && new File(str).isFile()) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inJustDecodeBounds = false;
            bitmap = BitmapFactory.decodeFile(str, options);
        }
        if (bitmap == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
            updateActionSheetContent.e(getMin, e.getMessage());
        }
        return Base64.encodeToString(byteArray, 2);
    }
}
