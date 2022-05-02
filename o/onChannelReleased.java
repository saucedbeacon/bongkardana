package o;

final class onChannelReleased implements RedDotDrawable {
    private final onChannelCreated getMax;
    private final int getMin;
    private final int setMax;

    public onChannelReleased(onChannelCreated onchannelcreated, int i, int i2) {
        this.getMax = onchannelcreated;
        this.getMin = i;
        this.setMax = i2;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$getReferralTracker$0(this.getMin, this.setMax, (Boolean) obj);
    }
}
