package o;

import io.reactivex.internal.util.NotificationLite;

public class pluginName<T> {
    Object[] getMax;
    int getMin;
    public final Object[] setMax;
    final int setMin = 4;

    public interface getMax<T> extends getChildren<T> {
        boolean test(T t);
    }

    public pluginName() {
        Object[] objArr = new Object[5];
        this.setMax = objArr;
        this.getMax = objArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMin(T r4) {
        /*
            r3 = this;
            int r0 = r3.setMin
            int r1 = r3.getMin
            if (r1 != r0) goto L_0x0011
            int r1 = r0 + 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object[] r2 = r3.getMax
            r2[r0] = r1
            r3.getMax = r1
            r1 = 0
        L_0x0011:
            java.lang.Object[] r0 = r3.getMax
            r0[r1] = r4
            int r1 = r1 + 1
            r3.getMin = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.pluginName.getMin(java.lang.Object):void");
    }

    public final void getMin(getMax<? super T> getmax) {
        int i = this.setMin;
        for (Object[] objArr = this.setMax; objArr != null; objArr = objArr[i]) {
            int i2 = 0;
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (!getmax.test(objArr2)) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final <U> boolean setMin(getbEva<? super U> getbeva) {
        Object[] objArr = this.setMax;
        int i = this.setMin;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (NotificationLite.acceptFull((Object) objArr2, getbeva)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }

    public final <U> boolean getMax(GriverProgressBar<? super U> griverProgressBar) {
        Object[] objArr = this.setMax;
        int i = this.setMin;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (NotificationLite.acceptFull((Object) objArr2, griverProgressBar)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }
}
