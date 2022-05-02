package o;

import o.AppNode;

final class LifecycleCallback implements RedDotDrawable {
    private final onAppFinish getMax;

    public LifecycleCallback(onAppFinish onappfinish) {
        this.getMax = onappfinish;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$saveDialogTncConfig$1((AppNode.AnonymousClass7) obj);
    }
}
