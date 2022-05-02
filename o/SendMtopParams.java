package o;

import o.b;

public final class SendMtopParams implements getAdapterPosition<requestAsync> {
    private final b.C0007b<getDataMap> defaultFeatureNonAMCSDataProvider;

    public SendMtopParams(b.C0007b<getDataMap> bVar) {
        this.defaultFeatureNonAMCSDataProvider = bVar;
    }

    public final requestAsync get() {
        return newInstance(this.defaultFeatureNonAMCSDataProvider.get());
    }

    public static SendMtopParams create(b.C0007b<getDataMap> bVar) {
        return new SendMtopParams(bVar);
    }

    public static requestAsync newInstance(getDataMap getdatamap) {
        return new requestAsync(getdatamap);
    }
}
