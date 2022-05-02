package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class onMenuOpened {
    @Nullable
    public static ColorStateList setMin(@NonNull ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof closeOptionsMenu) {
            return ((closeOptionsMenu) imageView).getSupportImageTintList();
        }
        return null;
    }

    public static void getMin(@NonNull ImageView imageView, @Nullable ColorStateList colorStateList) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof closeOptionsMenu) {
            ((closeOptionsMenu) imageView).setSupportImageTintList(colorStateList);
        }
    }

    @Nullable
    public static PorterDuff.Mode length(@NonNull ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof closeOptionsMenu) {
            return ((closeOptionsMenu) imageView).getSupportImageTintMode();
        }
        return null;
    }

    public static void getMax(@NonNull ImageView imageView, @Nullable PorterDuff.Mode mode) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintMode(mode);
            if (Build.VERSION.SDK_INT == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof closeOptionsMenu) {
            ((closeOptionsMenu) imageView).setSupportImageTintMode(mode);
        }
    }
}
