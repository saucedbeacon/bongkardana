package o;

import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import android.widget.ImageView;
import java.util.ArrayList;
import o.ITinyMenuPopupWindow;
import o.RewriteQueriesToDropUnusedColumns;

public final class createTinyMenuBackground extends ITinyMenuPopupWindow.OnMenuWindowDismissListener<PictureDrawable> {
    public createTinyMenuBackground(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    public final void getMin(Context context, ImageView imageView) {
        RewriteQueriesToDropUnusedColumns.getMax getmax = new RewriteQueriesToDropUnusedColumns.getMax(context, (byte) 0);
        getmax.getMin = getMax();
        getmax.setMax = setMax();
        parseBehavior min = setMin();
        if (getmax.equals == null) {
            getmax.equals = new ArrayList();
        }
        getmax.equals.add(min);
        getmax.setMin = imageView;
        new RewriteQueriesToDropUnusedColumns(getmax, (byte) 0);
    }
}
