package o;

final class Permission implements RedDotDrawable {
    private final addExtraData getMin;

    public Permission(addExtraData addextradata) {
        this.getMin = addextradata;
    }

    public final Object apply(Object obj) {
        return this.getMin.toRecentRecipientEntity((isRemoteExtension[]) obj);
    }
}
