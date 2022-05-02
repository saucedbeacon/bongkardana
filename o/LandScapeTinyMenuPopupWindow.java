package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import o.setOnMenuWindowDismissListener;

public final class LandScapeTinyMenuPopupWindow extends setOnMenuWindowDismissListener {
    private final int getMin;

    /* renamed from: o.LandScapeTinyMenuPopupWindow$1  reason: invalid class name */
    public final class AnonymousClass1 extends doDismissWithAnimation {
        private final int setMin = 0;

        public AnonymousClass1() {
        }

        public AnonymousClass1(byte b) {
        }

        /* access modifiers changed from: protected */
        public final setTinyAppDesc setMax(String str, setOnMenuWindowDismissListener.length length) {
            if (RewriteQueriesToDropUnusedColumns.setMax(str)) {
                return new createTinyMenuBackground(str);
            }
            return new getLayoutId(str, this.setMin, length);
        }
    }

    LandScapeTinyMenuPopupWindow(int i, setOnMenuWindowDismissListener.length length) {
        super(length);
        this.getMin = i;
    }

    public final void length(Context context, ImageView imageView) {
        if (setTopBackgroundColor.getMin(context)) {
            updateMessageMenuItem<Drawable> min = ((updateCornerMarking) Glide.getMax(context)).length(Integer.valueOf(this.getMin)).setMax(evaluate.setMin).setMax(setMax()).setMin(setMax());
            if (getMin() != null) {
                min.getMin((getTopSortedChildren<?>) getMin());
            }
            min.length(imageView);
        }
    }
}
