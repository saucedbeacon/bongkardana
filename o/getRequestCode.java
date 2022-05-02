package o;

final class getRequestCode implements RedDotManager {
    private final SendMtopResponse length;

    public getRequestCode(SendMtopResponse sendMtopResponse) {
        this.length = sendMtopResponse;
    }

    public final void accept(Object obj) {
        this.length.lambda$getGlobalFeeds$0((onEmbedViewDestory) obj);
    }
}
