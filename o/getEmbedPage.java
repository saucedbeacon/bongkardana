package o;

import o.ActivityHelper;
import o.b;

public final class getEmbedPage implements getAdapterPosition<getEmbedType> {
    private final b.C0007b<ActivityHelper.AnonymousClass1> networkLinkApiEntityDataProvider;

    public getEmbedPage(b.C0007b<ActivityHelper.AnonymousClass1> bVar) {
        this.networkLinkApiEntityDataProvider = bVar;
    }

    public final getEmbedType get() {
        return newInstance(this.networkLinkApiEntityDataProvider.get());
    }

    public static getEmbedPage create(b.C0007b<ActivityHelper.AnonymousClass1> bVar) {
        return new getEmbedPage(bVar);
    }

    public static getEmbedType newInstance(ActivityHelper.AnonymousClass1 r1) {
        return new getEmbedType(r1);
    }
}
