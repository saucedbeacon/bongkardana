package o;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.alibaba.griver.image.framework.api.APImageFormat;
import id.dana.R;
import java.util.Arrays;

public final class Popup {
    private static final String[] length = {APImageFormat.SUFFIX_JPG, APImageFormat.SUFFIX_PNG, "bmp", APImageFormat.SUFFIX_GIF, APImageFormat.SUFFIX_WEBP, "tiff"};

    public interface getMax {
        void setMin(String str, ImageView imageView);
    }

    public static void setMin(final String str, final ImageView imageView, final getMax getmax) {
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                getMax.this.setMin(Popup.getMin(imageView.getContext(), str, imageView.getWidth()), imageView);
                imageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    public static String getMin(Context context, String str, int i) {
        if (i <= 0 || i > 4096 || !length(str)) {
            return str;
        }
        String format = String.format(context.getString(R.string.image_oss_width_param), new Object[]{String.valueOf(i)});
        return String.format(context.getString(R.string.image_oss_resize_url_format), new Object[]{str, format});
    }

    private static boolean length(String str) {
        if (str != null && setMin(str)) {
            String substring = str.substring(str.lastIndexOf(46) + 1);
            if (TextUtils.isEmpty(substring) || !getMin(substring)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private static boolean setMin(String str) {
        return (!str.contains(".") || str.indexOf(46) == 0 || str.lastIndexOf(46) == str.length() - 1) ? false : true;
    }

    private static boolean getMin(String str) {
        return Arrays.asList(length).contains(str);
    }
}
