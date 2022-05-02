package o;

import androidx.annotation.NonNull;
import o.PlaybackStateCompat;

interface flagActionItems {

    public interface getMin {
        long getMax(long j);
    }

    @NonNull
    getMin setMax();

    public static class length implements flagActionItems {
        private final getMin getMax = new getMin() {
            public final long getMax(long j) {
                return -1;
            }
        };

        @NonNull
        public final getMin setMax() {
            return this.getMax;
        }
    }

    public static class setMin implements flagActionItems {
        private final getMin length = new getMin() {
            public final long getMax(long j) {
                return j;
            }
        };

        @NonNull
        public final getMin setMax() {
            return this.length;
        }
    }

    public static class getMax implements flagActionItems {
        long getMin = 0;

        @NonNull
        public final getMin setMax() {
            return new C0008getMax();
        }

        /* renamed from: o.flagActionItems$getMax$getMax  reason: collision with other inner class name */
        class C0008getMax implements getMin {
            private final PlaybackStateCompat.ShuffleMode<Long> getMin = new PlaybackStateCompat.ShuffleMode<>();

            C0008getMax() {
            }

            public final long getMax(long j) {
                Long max = this.getMin.getMax(j, null);
                if (max == null) {
                    getMax getmax = getMax.this;
                    long j2 = getmax.getMin;
                    getmax.getMin = 1 + j2;
                    max = Long.valueOf(j2);
                    this.getMin.setMax(j, max);
                }
                return max.longValue();
            }
        }
    }
}
