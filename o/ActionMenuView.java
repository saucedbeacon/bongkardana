package o;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import id.dana.R;

@RequiresApi(19)
class ActionMenuView extends getPopupTheme {
    private static boolean length = true;

    public final class LayoutParams {

        public static final class getMin {
            public static final int[] IsOverlapping = {16842948};
            public static final int equals = 0;
            public static final int[] getMax = {R.attr.f7282130969181, R.attr.f7292130969182, R.attr.f7302130969183, R.attr.f7312130969184, R.attr.f7322130969185, R.attr.f7332130969186, R.attr.f7342130969187};
            public static final int[] getMin = {16843165, 16843166, 16843169, 16843170, 16843171, 16843172, 16843265, 16843275, 16844048, 16844049, 16844050, 16844051};
            public static final int[] isInside = {16842948, 16842987, 16842993, R.attr.f6682130969121, R.attr.f6692130969122, R.attr.f6702130969123, R.attr.f6712130969124, R.attr.f6722130969125, R.attr.f9192130969372, R.attr.f13462130969799, R.attr.f14382130969891, R.attr.f14522130969905};
            public static final int[] length = {16844082, 16844083, 16844095, 16844143, 16844144, R.attr.f7262130969179, R.attr.f7352130969188, R.attr.f7362130969189, R.attr.f7372130969190, R.attr.f16472130970100};
            public static final int[] setMax = {16843173, 16844052};
            public static final int[] setMin = {16843173, 16843551, R.attr.f1782130968631};
        }
    }

    public void length(@NonNull View view) {
    }

    public void setMin(@NonNull View view) {
    }

    ActionMenuView() {
    }

    @SuppressLint({"NewApi"})
    public void length(@NonNull View view, float f) {
        if (length) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                length = false;
            }
        }
        view.setAlpha(f);
    }

    @SuppressLint({"NewApi"})
    public float getMax(@NonNull View view) {
        if (length) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                length = false;
            }
        }
        return view.getAlpha();
    }
}
