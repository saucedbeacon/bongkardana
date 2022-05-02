package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.data.content.mapper.ContentMapper;
import o.b;

public final class getTabBarContainer implements getBindingAdapter<ContentMapper> {
    private final b.C0007b<getContainerHeight> contentEntityMapperProvider;

    public getTabBarContainer(b.C0007b<getContainerHeight> bVar) {
        this.contentEntityMapperProvider = bVar;
    }

    public static getBindingAdapter<ContentMapper> create(b.C0007b<getContainerHeight> bVar) {
        return new getTabBarContainer(bVar);
    }

    public final void injectMembers(ContentMapper contentMapper) {
        injectContentEntityMapper(contentMapper, this.contentEntityMapperProvider.get());
    }

    @InjectedFieldSignature("id.dana.data.content.mapper.ContentMapper.contentEntityMapper")
    public static void injectContentEntityMapper(ContentMapper contentMapper, getContainerHeight getcontainerheight) {
        contentMapper.contentEntityMapper = getcontainerheight;
    }
}
