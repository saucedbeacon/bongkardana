package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.data.content.mapper.ContentsMapper;
import o.b;

public final class getViewSpecProvider implements getBindingAdapter<ContentsMapper> {
    private final b.C0007b<getContainerHeight> contentEntityMapperProvider;

    public getViewSpecProvider(b.C0007b<getContainerHeight> bVar) {
        this.contentEntityMapperProvider = bVar;
    }

    public static getBindingAdapter<ContentsMapper> create(b.C0007b<getContainerHeight> bVar) {
        return new getViewSpecProvider(bVar);
    }

    public final void injectMembers(ContentsMapper contentsMapper) {
        injectContentEntityMapper(contentsMapper, this.contentEntityMapperProvider.get());
    }

    @InjectedFieldSignature("id.dana.data.content.mapper.ContentsMapper.contentEntityMapper")
    public static void injectContentEntityMapper(ContentsMapper contentsMapper, getContainerHeight getcontainerheight) {
        contentsMapper.contentEntityMapper = getcontainerheight;
    }
}
