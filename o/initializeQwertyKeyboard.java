package o;

public final class initializeQwertyKeyboard {
    public final Object causingEvent;
    public final Object causingSubscriber;
    public final onInput eventBus;
    public final Throwable throwable;

    public initializeQwertyKeyboard(onInput oninput, Throwable th, Object obj, Object obj2) {
        this.eventBus = oninput;
        this.throwable = th;
        this.causingEvent = obj;
        this.causingSubscriber = obj2;
    }
}
