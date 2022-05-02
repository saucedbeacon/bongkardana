package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class addCheckedState extends uncheckItems<TabBarUtils> {
    private final addNormalState networkLazadaRegistrationUrlEntityData;

    @Inject
    public addCheckedState(addNormalState addnormalstate) {
        this.networkLazadaRegistrationUrlEntityData = addnormalstate;
    }

    public TabBarUtils createData(String str) {
        return this.networkLazadaRegistrationUrlEntityData;
    }
}
