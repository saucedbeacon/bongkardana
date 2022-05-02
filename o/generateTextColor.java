package o;

import o.b;

public final class generateTextColor implements getAdapterPosition<addCheckedState> {
    private final b.C0007b<addNormalState> networkLazadaRegistrationUrlEntityDataProvider;

    public generateTextColor(b.C0007b<addNormalState> bVar) {
        this.networkLazadaRegistrationUrlEntityDataProvider = bVar;
    }

    public final addCheckedState get() {
        return newInstance(this.networkLazadaRegistrationUrlEntityDataProvider.get());
    }

    public static generateTextColor create(b.C0007b<addNormalState> bVar) {
        return new generateTextColor(bVar);
    }

    public static addCheckedState newInstance(addNormalState addnormalstate) {
        return new addCheckedState(addnormalstate);
    }
}
