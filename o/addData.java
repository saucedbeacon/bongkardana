package o;

import o.b;

public final class addData implements getAdapterPosition<requestInnerSync> {
    private final b.C0007b<requestAsync> featureNonAMCSEntityDataFactoryProvider;

    public addData(b.C0007b<requestAsync> bVar) {
        this.featureNonAMCSEntityDataFactoryProvider = bVar;
    }

    public final requestInnerSync get() {
        return newInstance(this.featureNonAMCSEntityDataFactoryProvider.get());
    }

    public static addData create(b.C0007b<requestAsync> bVar) {
        return new addData(bVar);
    }

    public static requestInnerSync newInstance(requestAsync requestasync) {
        return new requestInnerSync(requestasync);
    }
}
