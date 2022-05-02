package o;

import javax.annotation.Nullable;

public final class getAppenderManager<T> {
    public final InvalidHandshakeException getMin;
    @Nullable
    private final NotSendableException setMax;
    @Nullable
    public final T setMin;

    public static <T> getAppenderManager<T> getMax(@Nullable T t, InvalidHandshakeException invalidHandshakeException) {
        ProcessInfoImpl.getMin(invalidHandshakeException, "rawResponse == null");
        if (invalidHandshakeException.setMax()) {
            return new getAppenderManager<>(invalidHandshakeException, t, (NotSendableException) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public static <T> getAppenderManager<T> setMin(NotSendableException notSendableException, InvalidHandshakeException invalidHandshakeException) {
        ProcessInfoImpl.getMin(notSendableException, "body == null");
        ProcessInfoImpl.getMin(invalidHandshakeException, "rawResponse == null");
        if (!invalidHandshakeException.setMax()) {
            return new getAppenderManager<>(invalidHandshakeException, (Object) null, notSendableException);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    private getAppenderManager(InvalidHandshakeException invalidHandshakeException, @Nullable T t, @Nullable NotSendableException notSendableException) {
        this.getMin = invalidHandshakeException;
        this.setMin = t;
        this.setMax = notSendableException;
    }

    public final boolean getMin() {
        return this.getMin.setMax();
    }

    public final String toString() {
        return this.getMin.toString();
    }
}
