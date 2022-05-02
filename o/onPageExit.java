package o;

import o.AppNode;

final class onPageExit implements RedDotDrawable {
    private final onAppFinish getMin;

    public onPageExit(onAppFinish onappfinish) {
        this.getMin = onappfinish;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$getTncSummaryConfig$0((AppNode.AnonymousClass7) obj);
    }
}
