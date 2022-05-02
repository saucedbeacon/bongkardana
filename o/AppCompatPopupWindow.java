package o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AppCompatPopupWindow {
    private static AppCompatPopupWindow getMax;
    public AppCompatRadioButton getMin;
    public getSupportImageTintMode length;
    public AppCompatImageView setMax;
    public setImageURI setMin;

    @NonNull
    public static synchronized AppCompatPopupWindow setMax(Context context, getMinWidthMinor getminwidthminor) {
        AppCompatPopupWindow appCompatPopupWindow;
        synchronized (AppCompatPopupWindow.class) {
            if (getMax == null) {
                getMax = new AppCompatPopupWindow(context, getminwidthminor);
            }
            appCompatPopupWindow = getMax;
        }
        return appCompatPopupWindow;
    }

    private AppCompatPopupWindow(@NonNull Context context, @NonNull getMinWidthMinor getminwidthminor) {
        Context applicationContext = context.getApplicationContext();
        this.length = new getSupportImageTintMode(applicationContext, getminwidthminor);
        this.setMin = new setImageURI(applicationContext, getminwidthminor);
        this.getMin = new AppCompatRadioButton(applicationContext, getminwidthminor);
        this.setMax = new AppCompatImageView(applicationContext, getminwidthminor);
    }
}
