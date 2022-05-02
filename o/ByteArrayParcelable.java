package o;

import o.ByteArrayPool;
import o.b;

public final class ByteArrayParcelable implements getAdapterPosition<containsAll> {
    private final b.C0007b<ByteArrayPool.AnonymousClass1> referralWidgetEntityDataFactoryProvider;
    private final b.C0007b<lastIndexOf> referralWidgetMapperProvider;

    public ByteArrayParcelable(b.C0007b<ByteArrayPool.AnonymousClass1> bVar, b.C0007b<lastIndexOf> bVar2) {
        this.referralWidgetEntityDataFactoryProvider = bVar;
        this.referralWidgetMapperProvider = bVar2;
    }

    public final containsAll get() {
        return newInstance(this.referralWidgetEntityDataFactoryProvider.get(), this.referralWidgetMapperProvider.get());
    }

    public static ByteArrayParcelable create(b.C0007b<ByteArrayPool.AnonymousClass1> bVar, b.C0007b<lastIndexOf> bVar2) {
        return new ByteArrayParcelable(bVar, bVar2);
    }

    public static containsAll newInstance(ByteArrayPool.AnonymousClass1 r1, lastIndexOf lastindexof) {
        return new containsAll(r1, lastindexof);
    }
}
