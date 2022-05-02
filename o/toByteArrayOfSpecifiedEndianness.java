package o;

import o.b;

public final class toByteArrayOfSpecifiedEndianness implements getAdapterPosition<Identifier> {
    private final b.C0007b<getByteCount> sendMoneyConfigRepositoryProvider;

    public toByteArrayOfSpecifiedEndianness(b.C0007b<getByteCount> bVar) {
        this.sendMoneyConfigRepositoryProvider = bVar;
    }

    public final Identifier get() {
        return newInstance(this.sendMoneyConfigRepositoryProvider.get());
    }

    public static toByteArrayOfSpecifiedEndianness create(b.C0007b<getByteCount> bVar) {
        return new toByteArrayOfSpecifiedEndianness(bVar);
    }

    public static Identifier newInstance(getByteCount getbytecount) {
        return new Identifier(getbytecount);
    }
}
