package o;

import o.PhotoContext;
import o.b;

public final class FetchAppsByIdsRequest implements getAdapterPosition<setUserId> {
    private final b.C0007b<PhotoContext.AnonymousClass2> setMin;

    private FetchAppsByIdsRequest(b.C0007b<PhotoContext.AnonymousClass2> bVar) {
        this.setMin = bVar;
    }

    public static FetchAppsByIdsRequest length(b.C0007b<PhotoContext.AnonymousClass2> bVar) {
        return new FetchAppsByIdsRequest(bVar);
    }

    public final /* synthetic */ Object get() {
        return new setUserId(this.setMin.get());
    }
}
