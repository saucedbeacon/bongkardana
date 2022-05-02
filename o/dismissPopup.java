package o;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

final class dismissPopup {
    private static final ViewGroup.MarginLayoutParams length;
    private LinearLayoutManager setMin;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        length = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    dismissPopup(@NonNull LinearLayoutManager linearLayoutManager) {
        this.setMin = linearLayoutManager;
    }

    /* access modifiers changed from: package-private */
    public final boolean setMin() {
        if ((!length() || this.setMin.getChildCount() <= 1) && setMax()) {
            return true;
        }
        return false;
    }

    private boolean length() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        int childCount = this.setMin.getChildCount();
        if (childCount == 0) {
            return true;
        }
        boolean z = this.setMin.getOrientation() == 0;
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = childCount;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = this.setMin.getChildAt(i5);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = length;
                }
                int[] iArr3 = iArr2[i5];
                if (z) {
                    i2 = childAt.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    i2 = childAt.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr3[0] = i2 - i;
                int[] iArr4 = iArr2[i5];
                if (z) {
                    i4 = childAt.getRight();
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i4 = childAt.getBottom();
                    i3 = marginLayoutParams.bottomMargin;
                }
                iArr4[1] = i4 + i3;
                i5++;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr2, new Comparator<int[]>() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            }
        });
        for (int i6 = 1; i6 < childCount; i6++) {
            if (iArr2[i6 - 1][1] != iArr2[i6][0]) {
                return false;
            }
        }
        int i7 = iArr2[0][1] - iArr2[0][0];
        if (iArr2[0][0] > 0 || iArr2[childCount - 1][1] < i7) {
            return false;
        }
        return true;
    }

    private boolean setMax() {
        int childCount = this.setMin.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getMin(this.setMin.getChildAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean getMin(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getMin(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
