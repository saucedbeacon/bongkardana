package o;

final class RemoteDebugCommand implements RedDotDrawable {
    private final RDConstant getMax;
    private final String setMax;

    public RemoteDebugCommand(RDConstant rDConstant, String str) {
        this.getMax = rDConstant;
        this.setMax = str;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$updateSplitBillDetail$6(this.setMax, (Boolean) obj);
    }
}
