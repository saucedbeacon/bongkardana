package o;

import java.util.ArrayList;
import java.util.List;

final class measureChildView implements isTitleOptional {
    List<Object> setMin = new ArrayList();

    public final void close() {
    }

    measureChildView() {
    }

    public final void bindNull(int i) {
        getMax(i, (Object) null);
    }

    public final void bindLong(int i, long j) {
        getMax(i, Long.valueOf(j));
    }

    public final void bindDouble(int i, double d) {
        getMax(i, Double.valueOf(d));
    }

    public final void bindString(int i, String str) {
        getMax(i, str);
    }

    public final void bindBlob(int i, byte[] bArr) {
        getMax(i, bArr);
    }

    private void getMax(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.setMin.size()) {
            for (int size = this.setMin.size(); size <= i2; size++) {
                this.setMin.add((Object) null);
            }
        }
        this.setMin.set(i2, obj);
    }
}
