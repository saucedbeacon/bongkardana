package o;

public final class setAnimationInterval extends getRightEyeBlinkRatio {
    public setAnimationInterval() {
        this.getMin = 104;
    }

    public setAnimationInterval(int i) {
        super(i);
        this.getMin = 104;
    }

    public final void invoke() {
        this.getMin = 152;
    }

    public final boolean getCause() {
        return this.getMin == 152;
    }

    public final void onRelationshipValidationResult() {
        this.getMin = 153;
    }

    public final boolean onMessageChannelReady() {
        return this.getMin == 153;
    }

    public final void onPostMessage() {
        this.getMin = 164;
    }

    public final boolean extraCallback() {
        return this.getMin == 164;
    }

    public final boolean extraCallbackWithResult() {
        return getCause() || onMessageChannelReady() || extraCallback();
    }
}
