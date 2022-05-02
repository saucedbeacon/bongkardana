package o;

import o.b;

public final class putConfigCache implements getAdapterPosition<GlobalInfoRecorder> {
    private final b.C0007b<addInfo> setMin;

    private putConfigCache(b.C0007b<addInfo> bVar) {
        this.setMin = bVar;
    }

    public static putConfigCache length(b.C0007b<addInfo> bVar) {
        return new putConfigCache(bVar);
    }

    public final /* synthetic */ Object get() {
        return new GlobalInfoRecorder(this.setMin.get());
    }
}
