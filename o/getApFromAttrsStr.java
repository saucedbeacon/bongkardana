package o;

import o.b;
import o.replaceLayoutParam;

public final class getApFromAttrsStr implements getAdapterPosition<adptApPadding> {
    private final b.C0007b<replaceLayoutParam.length> getMax;
    private final b.C0007b<GriverShareSchemeExtension> getMin;
    private final b.C0007b<GriverCreateDialogParam> setMax;
    private final b.C0007b<Embedded> setMin;

    private getApFromAttrsStr(b.C0007b<replaceLayoutParam.length> bVar, b.C0007b<GriverShareSchemeExtension> bVar2, b.C0007b<GriverCreateDialogParam> bVar3, b.C0007b<Embedded> bVar4) {
        this.getMax = bVar;
        this.getMin = bVar2;
        this.setMax = bVar3;
        this.setMin = bVar4;
    }

    public static getApFromAttrsStr setMin(b.C0007b<replaceLayoutParam.length> bVar, b.C0007b<GriverShareSchemeExtension> bVar2, b.C0007b<GriverCreateDialogParam> bVar3, b.C0007b<Embedded> bVar4) {
        return new getApFromAttrsStr(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new adptApPadding(this.getMax.get(), this.getMin.get(), this.setMax.get(), this.setMin.get());
    }
}
