package o;

import java.util.Comparator;

public final class F2fPayInitFacade {
    private static void length(Object[] objArr, int i, int i2, Comparator<Object> comparator) {
        for (int i3 = i; i3 <= i2; i3++) {
            Object obj = objArr[i3];
            int i4 = i3 - 1;
            while (i4 >= i && comparator.compare(objArr[i4], obj) > 0) {
                objArr[i4 + 1] = objArr[i4];
                i4--;
            }
            objArr[i4 + 1] = obj;
        }
    }

    static void getMax(Object[] objArr, int i, int i2, Comparator<Object> comparator, int i3) {
        while (i < i2) {
            if (i3 == 0 || i2 - i <= 16) {
                length(objArr, i, i2, comparator);
                return;
            }
            int min = setMin(objArr, i, i2, comparator);
            i3--;
            getMax(objArr, i, min, comparator, i3);
            i = min + 1;
        }
    }

    private static int setMin(Object[] objArr, int i, int i2, Comparator<Object> comparator) {
        int max = getMax(objArr, i, i2, comparator);
        Object obj = objArr[max];
        objArr[max] = objArr[i];
        objArr[i] = obj;
        int i3 = i2 + 1;
        int i4 = i;
        while (true) {
            i4++;
            if (comparator.compare(objArr[i4], obj) >= 0 || i4 == i2) {
                do {
                    i3--;
                    if (comparator.compare(objArr[i3], obj) < 0) {
                        break;
                    }
                } while (i3 != i);
                if (i4 < i3) {
                    Object obj2 = objArr[i4];
                    objArr[i4] = objArr[i3];
                    objArr[i3] = obj2;
                } else {
                    Object obj3 = objArr[i];
                    objArr[i] = objArr[i3];
                    objArr[i3] = obj3;
                    return i3;
                }
            }
        }
    }

    private static int getMax(Object[] objArr, int i, int i2, Comparator<Object> comparator) {
        int i3 = ((i2 - i) / 2) + i;
        int i4 = comparator.compare(objArr[i], objArr[i3]) > 0 ? i3 : i;
        if (comparator.compare(objArr[i4], objArr[i2]) > 0) {
            i4 = i2;
        }
        return i4 == i ? comparator.compare(objArr[i3], objArr[i2]) < 0 ? i3 : i2 : i4 == i3 ? comparator.compare(objArr[i], objArr[i2]) < 0 ? i : i2 : comparator.compare(objArr[i], objArr[i3]) < 0 ? i : i3;
    }
}
