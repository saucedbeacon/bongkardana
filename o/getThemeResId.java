package o;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Comparator;

final class getThemeResId {

    public interface getMax<T> {
        void getMin(T t, Rect rect);
    }

    public interface length<T, V> {
        int getMax(T t);

        V getMax(T t, int i);
    }

    static class setMin<T> implements Comparator<T> {
        private final getMax<T> getMax;
        private final Rect getMin = new Rect();
        private final Rect length = new Rect();
        private final boolean setMax;

        setMin(boolean z, getMax<T> getmax) {
            this.setMax = z;
            this.getMax = getmax;
        }

        public final int compare(T t, T t2) {
            Rect rect = this.getMin;
            Rect rect2 = this.length;
            this.getMax.getMin(t, rect);
            this.getMax.getMin(t2, rect2);
            if (rect.top < rect2.top) {
                return -1;
            }
            if (rect.top > rect2.top) {
                return 1;
            }
            if (rect.left < rect2.left) {
                if (this.setMax) {
                    return 1;
                }
                return -1;
            } else if (rect.left > rect2.left) {
                if (this.setMax) {
                    return -1;
                }
                return 1;
            } else if (rect.bottom < rect2.bottom) {
                return -1;
            } else {
                if (rect.bottom > rect2.bottom) {
                    return 1;
                }
                if (rect.right < rect2.right) {
                    if (this.setMax) {
                        return 1;
                    }
                    return -1;
                } else if (rect.right <= rect2.right) {
                    return 0;
                } else {
                    if (this.setMax) {
                        return -1;
                    }
                    return 1;
                }
            }
        }
    }

    public static <L, T> T setMax(@NonNull L l, @NonNull length<L, T> length2, @NonNull getMax<T> getmax, @Nullable T t, @NonNull Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t2 = null;
        int max = length2.getMax(l);
        Rect rect3 = new Rect();
        for (int i2 = 0; i2 < max; i2++) {
            T max2 = length2.getMax(l, i2);
            if (max2 != t) {
                getmax.getMin(max2, rect3);
                if (setMin(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = max2;
                }
            }
        }
        return t2;
    }

    private static boolean setMin(int i, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        if (!getMax(rect, rect2, i)) {
            return false;
        }
        if (!getMax(rect, rect3, i) || length(i, rect, rect2, rect3)) {
            return true;
        }
        if (length(i, rect, rect3, rect2)) {
            return false;
        }
        int max = Math.max(0, getMin(i, rect, rect2));
        int min = setMin(i, rect, rect2);
        int i2 = (max * 13 * max) + (min * min);
        int max2 = Math.max(0, getMin(i, rect, rect3));
        int min2 = setMin(i, rect, rect3);
        if (i2 < (max2 * 13 * max2) + (min2 * min2)) {
            return true;
        }
        return false;
    }

    private static boolean length(int i, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        int i2;
        int i3;
        boolean length2 = length(i, rect, rect2);
        if (length(i, rect, rect3) || !length2) {
            return false;
        }
        if (!setMax(i, rect, rect3) || i == 17 || i == 66) {
            return true;
        }
        int max = Math.max(0, getMin(i, rect, rect2));
        if (i == 17) {
            i3 = rect.left;
            i2 = rect3.left;
        } else if (i == 33) {
            i3 = rect.top;
            i2 = rect3.top;
        } else if (i == 66) {
            i3 = rect3.right;
            i2 = rect.right;
        } else if (i == 130) {
            i3 = rect3.bottom;
            i2 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (max < Math.max(1, i3 - i2)) {
            return true;
        }
        return false;
    }

    private static boolean getMax(@NonNull Rect rect, @NonNull Rect rect2, int i) {
        if (i == 17) {
            return (rect.right > rect2.right || rect.left >= rect2.right) && rect.left > rect2.left;
        }
        if (i == 33) {
            return (rect.bottom > rect2.bottom || rect.top >= rect2.bottom) && rect.top > rect2.top;
        }
        if (i == 66) {
            return (rect.left < rect2.left || rect.right <= rect2.left) && rect.right < rect2.right;
        }
        if (i == 130) {
            return (rect.top < rect2.top || rect.bottom <= rect2.top) && rect.bottom < rect2.bottom;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static boolean length(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    private static boolean setMax(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        }
        if (i == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i == 66) {
            return rect.right <= rect2.left;
        }
        if (i == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int getMin(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    private static int setMin(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
