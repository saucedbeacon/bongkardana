package o;

import o.b;

public final class getPage implements getAdapterPosition<setPage> {
    private final b.C0007b<onAnimationRepeat> getMax;

    private getPage(b.C0007b<onAnimationRepeat> bVar) {
        this.getMax = bVar;
    }

    public static getPage setMin(b.C0007b<onAnimationRepeat> bVar) {
        return new getPage(bVar);
    }

    public final /* synthetic */ Object get() {
        return new setPage(this.getMax.get());
    }
}
