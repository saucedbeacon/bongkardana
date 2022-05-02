package o;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public final class saveFocusInfo {

    public interface length {
        boolean getMin(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent);
    }

    public static class setMax implements isComputingLayout {
        private length setMin;

        public /* synthetic */ setMax(length length, byte b) {
            this(length);
        }

        private setMax(@NonNull length length) {
            this.setMin = length;
        }

        @NonNull
        public final List<shouldDeferAccessibilityEvent> setMin(@NonNull List<shouldDeferAccessibilityEvent> list) {
            ArrayList arrayList = new ArrayList();
            for (shouldDeferAccessibilityEvent next : list) {
                if (this.setMin.getMin(next)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    public static class setMin implements isComputingLayout {
        private isComputingLayout[] getMax;

        public /* synthetic */ setMin(isComputingLayout[] iscomputinglayoutArr, byte b) {
            this(iscomputinglayoutArr);
        }

        private setMin(@NonNull isComputingLayout... iscomputinglayoutArr) {
            this.getMax = iscomputinglayoutArr;
        }

        @NonNull
        public final List<shouldDeferAccessibilityEvent> setMin(@NonNull List<shouldDeferAccessibilityEvent> list) {
            for (isComputingLayout min : this.getMax) {
                list = min.setMin(list);
            }
            return list;
        }
    }

    public static class getMin implements isComputingLayout {
        private isComputingLayout[] getMin;

        public /* synthetic */ getMin(isComputingLayout[] iscomputinglayoutArr, byte b) {
            this(iscomputinglayoutArr);
        }

        private getMin(@NonNull isComputingLayout... iscomputinglayoutArr) {
            this.getMin = iscomputinglayoutArr;
        }

        @NonNull
        public final List<shouldDeferAccessibilityEvent> setMin(@NonNull List<shouldDeferAccessibilityEvent> list) {
            List<shouldDeferAccessibilityEvent> list2 = null;
            for (isComputingLayout min : this.getMin) {
                list2 = min.setMin(list);
                if (!list2.isEmpty()) {
                    break;
                }
            }
            return list2 == null ? new ArrayList() : list2;
        }
    }
}
