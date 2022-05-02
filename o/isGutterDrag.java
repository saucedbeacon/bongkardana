package o;

import android.content.Context;
import o.GriverOpenAuthExtension;
import o.b;
import o.completeScroll;

public final class isGutterDrag implements getAdapterPosition<resetTouch> {
    private final b.C0007b<completeScroll.setMax> getMax;
    private final b.C0007b<GriverOpenAuthExtension.RevokeCallback> getMin;
    private final b.C0007b<getSecurityExtraData> length;
    private final b.C0007b<Context> setMax;

    private isGutterDrag(b.C0007b<Context> bVar, b.C0007b<completeScroll.setMax> bVar2, b.C0007b<getSecurityExtraData> bVar3, b.C0007b<GriverOpenAuthExtension.RevokeCallback> bVar4) {
        this.setMax = bVar;
        this.getMax = bVar2;
        this.length = bVar3;
        this.getMin = bVar4;
    }

    public static isGutterDrag setMin(b.C0007b<Context> bVar, b.C0007b<completeScroll.setMax> bVar2, b.C0007b<getSecurityExtraData> bVar3, b.C0007b<GriverOpenAuthExtension.RevokeCallback> bVar4) {
        return new isGutterDrag(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new resetTouch(this.setMax.get(), this.getMax.get(), this.length.get(), this.getMin.get());
    }
}
