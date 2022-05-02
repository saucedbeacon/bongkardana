package o;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class setSplitBackground implements SupportSQLiteQuery, isTitleOptional {
    @VisibleForTesting
    static final TreeMap<Integer, setSplitBackground> IsOverlapping = new TreeMap<>();
    @VisibleForTesting
    int equals;
    @VisibleForTesting
    final long[] getMax;
    @VisibleForTesting
    final String[] getMin;
    private volatile String isInside;
    @VisibleForTesting
    final double[] length;
    @VisibleForTesting
    final byte[][] setMax;
    @VisibleForTesting
    final int setMin;
    private final int[] toFloatRange;

    public final void close() {
    }

    public static setSplitBackground setMax(String str, int i) {
        synchronized (IsOverlapping) {
            Map.Entry<Integer, setSplitBackground> ceilingEntry = IsOverlapping.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                IsOverlapping.remove(ceilingEntry.getKey());
                setSplitBackground value = ceilingEntry.getValue();
                value.isInside = str;
                value.equals = i;
                return value;
            }
            setSplitBackground setsplitbackground = new setSplitBackground(i);
            setsplitbackground.isInside = str;
            setsplitbackground.equals = i;
            return setsplitbackground;
        }
    }

    private setSplitBackground(int i) {
        this.setMin = i;
        int i2 = i + 1;
        this.toFloatRange = new int[i2];
        this.getMax = new long[i2];
        this.length = new double[i2];
        this.getMin = new String[i2];
        this.setMax = new byte[i2][];
    }

    public final void getMin() {
        synchronized (IsOverlapping) {
            IsOverlapping.put(Integer.valueOf(this.setMin), this);
            if (IsOverlapping.size() > 15) {
                int size = IsOverlapping.size() - 10;
                Iterator<Integer> it = IsOverlapping.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    public final String setMin() {
        return this.isInside;
    }

    public final int setMax() {
        return this.equals;
    }

    public final void setMin(isTitleOptional istitleoptional) {
        for (int i = 1; i <= this.equals; i++) {
            int i2 = this.toFloatRange[i];
            if (i2 == 1) {
                istitleoptional.bindNull(i);
            } else if (i2 == 2) {
                istitleoptional.bindLong(i, this.getMax[i]);
            } else if (i2 == 3) {
                istitleoptional.bindDouble(i, this.length[i]);
            } else if (i2 == 4) {
                istitleoptional.bindString(i, this.getMin[i]);
            } else if (i2 == 5) {
                istitleoptional.bindBlob(i, this.setMax[i]);
            }
        }
    }

    public final void bindNull(int i) {
        this.toFloatRange[i] = 1;
    }

    public final void bindLong(int i, long j) {
        this.toFloatRange[i] = 2;
        this.getMax[i] = j;
    }

    public final void bindDouble(int i, double d) {
        this.toFloatRange[i] = 3;
        this.length[i] = d;
    }

    public final void bindString(int i, String str) {
        this.toFloatRange[i] = 4;
        this.getMin[i] = str;
    }

    public final void bindBlob(int i, byte[] bArr) {
        this.toFloatRange[i] = 5;
        this.setMax[i] = bArr;
    }
}
