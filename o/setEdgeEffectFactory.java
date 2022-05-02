package o;

import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class setEdgeEffectFactory {
    @VisibleForTesting
    final List<focusSearch> setMin;

    private setEdgeEffectFactory(@NonNull List<focusSearch> list) {
        this.setMin = list;
    }

    @NonNull
    public final setEdgeEffectFactory setMin(@NonNull assertInLayoutOrScroll assertinlayoutorscroll) {
        ArrayList arrayList = new ArrayList();
        for (focusSearch length : this.setMin) {
            arrayList.add(length.length(assertinlayoutorscroll));
        }
        return new setEdgeEffectFactory(arrayList);
    }

    @NonNull
    public final <T> List<T> getMin(int i, @NonNull assertInLayoutOrScroll<T> assertinlayoutorscroll) {
        ArrayList arrayList = new ArrayList();
        Collections.sort(this.setMin);
        for (focusSearch next : this.setMin) {
            arrayList.add(assertinlayoutorscroll.setMin(next.getMax, next.length));
        }
        return arrayList.subList(0, Math.min(i, arrayList.size()));
    }

    @NonNull
    public static setEdgeEffectFactory setMin(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent, @NonNull RectF rectF, boolean z) {
        ArrayList<focusSearch> arrayList = new ArrayList<>();
        PointF pointF = new PointF(rectF.centerX(), rectF.centerY());
        float width = rectF.width();
        float height = rectF.height();
        arrayList.add(new focusSearch(rectF, 1000));
        if (z) {
            arrayList.add(new focusSearch(setMax(pointF, width * 1.5f, height * 1.5f), Math.round(100.0f)));
        }
        ArrayList arrayList2 = new ArrayList();
        for (focusSearch min : arrayList) {
            arrayList2.add(min.setMin(shoulddeferaccessibilityevent));
        }
        return new setEdgeEffectFactory(arrayList2);
    }

    @NonNull
    public static RectF setMax(@NonNull PointF pointF, float f, float f2) {
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        return new RectF(pointF.x - f3, pointF.y - f4, pointF.x + f3, pointF.y + f4);
    }
}
