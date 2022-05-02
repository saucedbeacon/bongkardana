package o;

import o.b;

public final class setRequestMode implements getAdapterPosition<setEndTime> {
    private final b.C0007b<setOfflineMode> networkZendeskEntityDataProvider;

    public setRequestMode(b.C0007b<setOfflineMode> bVar) {
        this.networkZendeskEntityDataProvider = bVar;
    }

    public final setEndTime get() {
        return newInstance(this.networkZendeskEntityDataProvider.get());
    }

    public static setRequestMode create(b.C0007b<setOfflineMode> bVar) {
        return new setRequestMode(bVar);
    }

    public static setEndTime newInstance(setOfflineMode setofflinemode) {
        return new setEndTime(setofflinemode);
    }
}
