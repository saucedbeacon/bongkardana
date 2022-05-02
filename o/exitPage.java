package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.data.content.mapper.SpaceResultMapper;
import o.b;

public final class exitPage implements getBindingAdapter<SpaceResultMapper> {
    private final b.C0007b<getContainerHeight> contentEntityMapperProvider;

    public exitPage(b.C0007b<getContainerHeight> bVar) {
        this.contentEntityMapperProvider = bVar;
    }

    public static getBindingAdapter<SpaceResultMapper> create(b.C0007b<getContainerHeight> bVar) {
        return new exitPage(bVar);
    }

    public final void injectMembers(SpaceResultMapper spaceResultMapper) {
        injectContentEntityMapper(spaceResultMapper, this.contentEntityMapperProvider.get());
    }

    @InjectedFieldSignature("id.dana.data.content.mapper.SpaceResultMapper.contentEntityMapper")
    public static void injectContentEntityMapper(SpaceResultMapper spaceResultMapper, getContainerHeight getcontainerheight) {
        spaceResultMapper.contentEntityMapper = getcontainerheight;
    }
}
