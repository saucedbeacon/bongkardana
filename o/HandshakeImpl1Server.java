package o;

import javax.annotation.Nullable;

public final class HandshakeImpl1Server extends NotSendableException {
    private final long getMax;
    private final schedule getMin;
    @Nullable
    private final String setMin;

    public HandshakeImpl1Server(@Nullable String str, long j, schedule schedule) {
        this.setMin = str;
        this.getMax = j;
        this.getMin = schedule;
    }

    public final translateRegularFrame getMin() {
        String str = this.setMin;
        if (str != null) {
            return translateRegularFrame.length(str);
        }
        return null;
    }

    public final long setMax() {
        return this.getMax;
    }

    public final schedule getMax() {
        return this.getMin;
    }
}
