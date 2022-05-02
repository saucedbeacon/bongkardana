package o;

import o.b;

public final class access$202 implements getAdapterPosition<onAnimationRepeat> {
    private final b.C0007b<pauseRender> getMin;

    private access$202(b.C0007b<pauseRender> bVar) {
        this.getMin = bVar;
    }

    public static access$202 getMin(b.C0007b<pauseRender> bVar) {
        return new access$202(bVar);
    }

    public final /* synthetic */ Object get() {
        return new onAnimationRepeat(this.getMin.get());
    }
}
