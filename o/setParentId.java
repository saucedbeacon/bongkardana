package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.ConnectionLog;

@Singleton
public class setParentId extends uncheckItems<ConnectionLog.AnonymousClass1> {
    private final setHeaderString networkRegistrationEntityData;

    @Inject
    public setParentId(setHeaderString setheaderstring) {
        this.networkRegistrationEntityData = setheaderstring;
    }

    public ConnectionLog.AnonymousClass1 createData(String str) {
        return this.networkRegistrationEntityData;
    }
}
