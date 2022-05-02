package o;

import id.dana.data.content.mapper.ContentsMapper;
import o.b;

public final class createFragmentManager implements getAdapterPosition<ContentsMapper> {
    private final b.C0007b<getContainerHeight> contentEntityMapperProvider;

    public createFragmentManager(b.C0007b<getContainerHeight> bVar) {
        this.contentEntityMapperProvider = bVar;
    }

    public final ContentsMapper get() {
        ContentsMapper newInstance = newInstance();
        getViewSpecProvider.injectContentEntityMapper(newInstance, this.contentEntityMapperProvider.get());
        return newInstance;
    }

    public static createFragmentManager create(b.C0007b<getContainerHeight> bVar) {
        return new createFragmentManager(bVar);
    }

    public static ContentsMapper newInstance() {
        return new ContentsMapper();
    }
}
