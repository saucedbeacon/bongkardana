package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;
import o.PlaybackStateCompat;
import o.setPositiveButtonIcon;

public class clearHeader {
    @VisibleForTesting
    public final PlaybackStateCompat.RepeatMode<RecyclerView.valueOf, getMax> length = new PlaybackStateCompat.RepeatMode<>();
    @VisibleForTesting
    public final PlaybackStateCompat.ShuffleMode<RecyclerView.valueOf> setMin = new PlaybackStateCompat.ShuffleMode<>();

    public interface length {
        void getMax(RecyclerView.valueOf valueof, @Nullable RecyclerView.ItemAnimator.setMax setmax, RecyclerView.ItemAnimator.setMax setmax2);

        void length(RecyclerView.valueOf valueof, @NonNull RecyclerView.ItemAnimator.setMax setmax, @Nullable RecyclerView.ItemAnimator.setMax setmax2);

        void setMax(RecyclerView.valueOf valueof);

        void setMin(RecyclerView.valueOf valueof, @NonNull RecyclerView.ItemAnimator.setMax setmax, @NonNull RecyclerView.ItemAnimator.setMax setmax2);
    }

    public final void getMax(RecyclerView.valueOf valueof, RecyclerView.ItemAnimator.setMax setmax) {
        getMax getmax = this.length.get(valueof);
        if (getmax == null) {
            getmax = getMax.length();
            this.length.put(valueof, getmax);
        }
        getmax.getMax = setmax;
        getmax.getMin |= 4;
    }

    public final boolean length(RecyclerView.valueOf valueof) {
        getMax getmax = this.length.get(valueof);
        return (getmax == null || (getmax.getMin & 1) == 0) ? false : true;
    }

    public final RecyclerView.ItemAnimator.setMax getMin(RecyclerView.valueOf valueof, int i) {
        int i2;
        getMax getmax;
        RecyclerView.ItemAnimator.setMax setmax;
        PlaybackStateCompat.RepeatMode<RecyclerView.valueOf, getMax> repeatMode = this.length;
        if (valueof == null) {
            i2 = repeatMode.setMax();
        } else {
            i2 = repeatMode.setMin(valueof, valueof.hashCode());
        }
        if (i2 < 0 || (getmax = (getMax) this.length.isInside[(i2 << 1) + 1]) == null || (getmax.getMin & i) == 0) {
            return null;
        }
        getmax.getMin &= i ^ -1;
        if (i == 4) {
            setmax = getmax.getMax;
        } else if (i == 8) {
            setmax = getmax.setMin;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((getmax.getMin & 12) == 0) {
            this.length.setMin(i2);
            getMax.length(getmax);
        }
        return setmax;
    }

    public final boolean setMax(RecyclerView.valueOf valueof) {
        getMax getmax = this.length.get(valueof);
        return (getmax == null || (getmax.getMin & 4) == 0) ? false : true;
    }

    public final void setMin(RecyclerView.valueOf valueof, RecyclerView.ItemAnimator.setMax setmax) {
        getMax getmax = this.length.get(valueof);
        if (getmax == null) {
            getmax = getMax.length();
            this.length.put(valueof, getmax);
        }
        getmax.setMin = setmax;
        getmax.getMin |= 8;
    }

    public final void setMin(RecyclerView.valueOf valueof) {
        getMax getmax = this.length.get(valueof);
        if (getmax == null) {
            getmax = getMax.length();
            this.length.put(valueof, getmax);
        }
        getmax.getMin |= 1;
    }

    public final void getMax(RecyclerView.valueOf valueof) {
        PlaybackStateCompat.ShuffleMode<RecyclerView.valueOf> shuffleMode = this.setMin;
        if (shuffleMode.getMin) {
            shuffleMode.getMin();
        }
        int i = shuffleMode.length - 1;
        while (true) {
            if (i < 0) {
                break;
            }
            PlaybackStateCompat.ShuffleMode<RecyclerView.valueOf> shuffleMode2 = this.setMin;
            if (shuffleMode2.getMin) {
                shuffleMode2.getMin();
            }
            if (valueof == shuffleMode2.setMin[i]) {
                PlaybackStateCompat.ShuffleMode<RecyclerView.valueOf> shuffleMode3 = this.setMin;
                if (shuffleMode3.setMin[i] != PlaybackStateCompat.ShuffleMode.getMax) {
                    shuffleMode3.setMin[i] = PlaybackStateCompat.ShuffleMode.getMax;
                    shuffleMode3.getMin = true;
                }
            } else {
                i--;
            }
        }
        getMax remove = this.length.remove(valueof);
        if (remove != null) {
            getMax.length(remove);
        }
    }

    public static void getMax() {
        getMax.getMax();
    }

    public static class getMax {
        static setPositiveButtonIcon.length<getMax> length = new setPositiveButtonIcon.getMin(20);
        @Nullable
        public RecyclerView.ItemAnimator.setMax getMax;
        public int getMin;
        @Nullable
        public RecyclerView.ItemAnimator.setMax setMin;

        private getMax() {
        }

        public static getMax length() {
            getMax max = length.getMax();
            return max == null ? new getMax() : max;
        }

        public static void length(getMax getmax) {
            getmax.getMin = 0;
            getmax.getMax = null;
            getmax.setMin = null;
            length.getMin(getmax);
        }

        static void getMax() {
            do {
            } while (length.getMax() != null);
        }
    }
}
