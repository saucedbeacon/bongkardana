package o;

final class initializeNoneKeyboard {
    volatile boolean active = true;
    final Object subscriber;
    final initializeNumKeyboard subscriberMethod;

    initializeNoneKeyboard(Object obj, initializeNumKeyboard initializenumkeyboard) {
        this.subscriber = obj;
        this.subscriberMethod = initializenumkeyboard;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof initializeNoneKeyboard) {
            initializeNoneKeyboard initializenonekeyboard = (initializeNoneKeyboard) obj;
            if (this.subscriber != initializenonekeyboard.subscriber || !this.subscriberMethod.equals(initializenonekeyboard.subscriberMethod)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.subscriber.hashCode() + this.subscriberMethod.methodString.hashCode();
    }
}
