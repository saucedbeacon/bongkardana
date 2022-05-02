package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.getLogEventType;

abstract class setLogEventType implements getLogEventType {
    int getMax = -1;
    final Map<String, String> length;
    final String setMax;
    final int setMin;

    /* access modifiers changed from: package-private */
    public abstract void getMax(int i);

    protected setLogEventType(@NonNull String str, int i, @NonNull Map<String, String> map) {
        this.setMax = str;
        this.setMin = i;
        this.length = map;
    }

    @NonNull
    public final String getMin() {
        return this.setMax;
    }

    public final int setMin() {
        return this.setMin;
    }

    public final int setMax() {
        return this.getMax;
    }

    public final boolean toFloatRange() {
        return this.setMin == this.getMax;
    }

    @NonNull
    public Map<String, String> getMax() {
        return this.length;
    }

    public final boolean length() {
        return this.getMax >= 0;
    }

    static class setMax extends setLogEventType implements getLogEventType.setMin {
        public final boolean IsOverlapping() {
            return false;
        }

        setMax(@NonNull String str, int i, @NonNull Map<String, String> map) {
            super(str, i, map);
        }

        /* access modifiers changed from: package-private */
        public final void getMax(int i) {
            if (!length()) {
                this.getMax = i;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InlineImpl{name='");
            sb.append(this.setMax);
            sb.append('\'');
            sb.append(", start=");
            sb.append(this.setMin);
            sb.append(", end=");
            sb.append(this.getMax);
            sb.append(", attributes=");
            sb.append(this.length);
            sb.append('}');
            return sb.toString();
        }

        @NonNull
        public final getLogEventType.setMax equals() {
            throw new ClassCastException("Cannot cast Inline instance to Block");
        }
    }

    static class getMin extends setLogEventType implements getLogEventType.setMax {
        List<getMin> equals;
        final getMin getMin;

        public final boolean IsOverlapping() {
            return true;
        }

        @NonNull
        public final getLogEventType.setMax equals() {
            return this;
        }

        getMin(@NonNull String str, int i, @NonNull Map<String, String> map, @Nullable getMin getmin) {
            super(str, i, map);
            this.getMin = getmin;
        }

        /* access modifiers changed from: package-private */
        public final void getMax(int i) {
            if (!length()) {
                this.getMax = i;
                List<getMin> list = this.equals;
                if (list != null) {
                    for (getMin max : list) {
                        max.getMax(i);
                    }
                }
            }
        }

        @Nullable
        public final getLogEventType.setMax toIntRange() {
            return this.getMin;
        }

        @NonNull
        public final List<getLogEventType.setMax> isInside() {
            List<getMin> list = this.equals;
            if (list == null) {
                return Collections.emptyList();
            }
            return Collections.unmodifiableList(list);
        }

        @NonNull
        public final Map<String, String> getMax() {
            return this.length;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BlockImpl{name='");
            sb.append(this.setMax);
            sb.append('\'');
            sb.append(", start=");
            sb.append(this.setMin);
            sb.append(", end=");
            sb.append(this.getMax);
            sb.append(", attributes=");
            sb.append(this.length);
            sb.append(", parent=");
            getMin getmin = this.getMin;
            sb.append(getmin != null ? getmin.setMax : null);
            sb.append(", children=");
            sb.append(this.equals);
            sb.append('}');
            return sb.toString();
        }
    }
}
