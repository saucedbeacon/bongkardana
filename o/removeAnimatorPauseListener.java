package o;

import o.b;

public final class removeAnimatorPauseListener implements getAdapterPosition<getRepeatCount> {
    private final b.C0007b<onCallBack> getMax;

    private removeAnimatorPauseListener(b.C0007b<onCallBack> bVar) {
        this.getMax = bVar;
    }

    public static removeAnimatorPauseListener setMax(b.C0007b<onCallBack> bVar) {
        return new removeAnimatorPauseListener(bVar);
    }

    public final /* synthetic */ Object get() {
        return new getRepeatCount(this.getMax.get());
    }
}
