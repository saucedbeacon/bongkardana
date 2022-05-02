package androidx.paging;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

public final class PageResult<T> {
    private static final PageResult equals = new PageResult(Collections.emptyList());
    private static final PageResult setMax = new PageResult(Collections.emptyList());
    public final int getMax;
    public final int getMin;
    public final int length;
    @NonNull
    public final List<T> setMin;

    @Retention(RetentionPolicy.SOURCE)
    @interface ResultType {
    }

    public static abstract class setMin<T> {
        @MainThread
        public abstract void setMin(int i, @NonNull PageResult<T> pageResult);
    }

    public static <T> PageResult<T> getMin() {
        return setMax;
    }

    public static <T> PageResult<T> getMax() {
        return equals;
    }

    public PageResult(@NonNull List<T> list, int i) {
        this.setMin = list;
        this.getMax = 0;
        this.length = 0;
        this.getMin = i;
    }

    public PageResult(@NonNull List<T> list) {
        this.setMin = list;
        this.getMax = 0;
        this.length = 0;
        this.getMin = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result ");
        sb.append(this.getMax);
        sb.append(", ");
        sb.append(this.setMin);
        sb.append(", ");
        sb.append(this.length);
        sb.append(", offset ");
        sb.append(this.getMin);
        return sb.toString();
    }

    public final boolean setMin() {
        return this == equals;
    }
}
