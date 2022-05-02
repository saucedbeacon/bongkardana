package o;

import androidx.annotation.NonNull;

public final class ConstraintLayout implements fireTrigger<byte[]> {
    private final byte[] setMax;

    public interface LayoutParams extends setGuidelinePercent {

        public interface length {
            void getMax(boolean z);
        }
    }

    public final void length() {
    }

    public ConstraintLayout(byte[] bArr) {
        if (bArr != null) {
            this.setMax = bArr;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @NonNull
    public final Class<byte[]> getMin() {
        return byte[].class;
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: getMax */
    public byte[] setMin() {
        return this.setMax;
    }

    public final int setMax() {
        return this.setMax.length;
    }
}
