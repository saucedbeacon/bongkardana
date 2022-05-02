package o;

import o.b;

public final class originalData implements getAdapterPosition<callMode> {
    private final b.C0007b<EngineInitSuccessPoint> geocodeEntityDataFactoryProvider;
    private final b.C0007b<dispatcherOnWorkerThread> nearbyPlaceEntityDataFactoryProvider;

    public originalData(b.C0007b<dispatcherOnWorkerThread> bVar, b.C0007b<EngineInitSuccessPoint> bVar2) {
        this.nearbyPlaceEntityDataFactoryProvider = bVar;
        this.geocodeEntityDataFactoryProvider = bVar2;
    }

    public final callMode get() {
        return newInstance(this.nearbyPlaceEntityDataFactoryProvider.get(), this.geocodeEntityDataFactoryProvider.get());
    }

    public static originalData create(b.C0007b<dispatcherOnWorkerThread> bVar, b.C0007b<EngineInitSuccessPoint> bVar2) {
        return new originalData(bVar, bVar2);
    }

    public static callMode newInstance(dispatcherOnWorkerThread dispatcheronworkerthread, EngineInitSuccessPoint engineInitSuccessPoint) {
        return new callMode(dispatcheronworkerthread, engineInitSuccessPoint);
    }
}
