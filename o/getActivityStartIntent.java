package o;

import id.dana.data.content.mapper.SpaceResultMapper;
import o.b;

public final class getActivityStartIntent implements getAdapterPosition<SpaceResultMapper> {
    private final b.C0007b<getContainerHeight> contentEntityMapperProvider;

    public getActivityStartIntent(b.C0007b<getContainerHeight> bVar) {
        this.contentEntityMapperProvider = bVar;
    }

    public final SpaceResultMapper get() {
        SpaceResultMapper newInstance = newInstance();
        exitPage.injectContentEntityMapper(newInstance, this.contentEntityMapperProvider.get());
        return newInstance;
    }

    public static getActivityStartIntent create(b.C0007b<getContainerHeight> bVar) {
        return new getActivityStartIntent(bVar);
    }

    public static SpaceResultMapper newInstance() {
        return new SpaceResultMapper();
    }
}
