package o;

import java.util.Locale;

public final class getContext {
    public static final setCustomTitle IsOverlapping = equals.setMin;
    public static final setCustomTitle getMax = new length(setMax.setMin, true);
    public static final setCustomTitle getMin = new length((getMin) null, true);
    public static final setCustomTitle length = new length(setMin.length, false);
    public static final setCustomTitle setMax = new length(setMax.setMin, false);
    public static final setCustomTitle setMin = new length((getMin) null, false);

    interface getMin {
        int getMax(CharSequence charSequence, int i, int i2);
    }

    static int length(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }

    static int setMax(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    static abstract class getMax implements setCustomTitle {
        private final getMin getMax;

        /* access modifiers changed from: protected */
        public abstract boolean getMax();

        getMax(getMin getmin) {
            this.getMax = getmin;
        }

        public boolean setMin(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.getMax == null) {
                return getMax();
            } else {
                return getMax(charSequence, i, i2);
            }
        }

        private boolean getMax(CharSequence charSequence, int i, int i2) {
            int max = this.getMax.getMax(charSequence, i, i2);
            if (max == 0) {
                return true;
            }
            if (max != 1) {
                return getMax();
            }
            return false;
        }
    }

    static class length extends getMax {
        private final boolean length;

        length(getMin getmin, boolean z) {
            super(getmin);
            this.length = z;
        }

        /* access modifiers changed from: protected */
        public boolean getMax() {
            return this.length;
        }
    }

    static class setMax implements getMin {
        static final setMax setMin = new setMax();

        public int getMax(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = getContext.length(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }

        private setMax() {
        }
    }

    static class setMin implements getMin {
        static final setMin length = new setMin(true);
        private final boolean getMax;

        public int getMax(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int max = getContext.setMax(Character.getDirectionality(charSequence.charAt(i)));
                if (max != 0) {
                    if (max != 1) {
                        continue;
                        i++;
                    } else if (!this.getMax) {
                        return 1;
                    }
                } else if (this.getMax) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.getMax ? 1 : 0;
            }
            return 2;
        }

        private setMin(boolean z) {
            this.getMax = z;
        }
    }

    static class equals extends getMax {
        static final equals setMin = new equals();

        equals() {
            super((getMin) null);
        }

        /* access modifiers changed from: protected */
        public boolean getMax() {
            return setTitle.setMax(Locale.getDefault()) == 1;
        }
    }
}
