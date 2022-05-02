package o;

import o.b;

public final class getNick implements getAdapterPosition<getUserAvatar> {
    private final b.C0007b<GlobalInfoRecorder> getMax;
    private final b.C0007b<RVConfigService> setMin;

    private getNick(b.C0007b<GlobalInfoRecorder> bVar, b.C0007b<RVConfigService> bVar2) {
        this.getMax = bVar;
        this.setMin = bVar2;
    }

    public static getNick length(b.C0007b<GlobalInfoRecorder> bVar, b.C0007b<RVConfigService> bVar2) {
        return new getNick(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new getUserAvatar(this.getMax.get(), this.setMin.get());
    }
}
