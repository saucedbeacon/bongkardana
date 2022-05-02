package o;

import id.dana.data.content.mapper.ContentMapper;
import o.b;

public final class getApp implements getAdapterPosition<ContentMapper> {
    private final b.C0007b<getContainerHeight> contentEntityMapperProvider;

    public getApp(b.C0007b<getContainerHeight> bVar) {
        this.contentEntityMapperProvider = bVar;
    }

    public final ContentMapper get() {
        ContentMapper newInstance = newInstance();
        getTabBarContainer.injectContentEntityMapper(newInstance, this.contentEntityMapperProvider.get());
        return newInstance;
    }

    public static getApp create(b.C0007b<getContainerHeight> bVar) {
        return new getApp(bVar);
    }

    public static ContentMapper newInstance() {
        return new ContentMapper();
    }
}
