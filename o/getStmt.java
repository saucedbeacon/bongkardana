package o;

import android.content.Context;
import o.b;
import o.isMainThread;

public final class getStmt implements getAdapterPosition<SkipQueryVerification> {
    private final b.C0007b<getIconDrawable> getMin;
    private final b.C0007b<Context> setMax;
    private final b.C0007b<isMainThread.getMin> setMin;

    private getStmt(b.C0007b<Context> bVar, b.C0007b<getIconDrawable> bVar2, b.C0007b<isMainThread.getMin> bVar3) {
        this.setMax = bVar;
        this.getMin = bVar2;
        this.setMin = bVar3;
    }

    public static getStmt length(b.C0007b<Context> bVar, b.C0007b<getIconDrawable> bVar2, b.C0007b<isMainThread.getMin> bVar3) {
        return new getStmt(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new SkipQueryVerification(this.setMax.get(), this.getMin.get(), this.setMin.get());
    }
}
