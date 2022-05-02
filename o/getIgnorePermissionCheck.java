package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.PermissionModel;

@Singleton
public class getIgnorePermissionCheck extends uncheckItems<setValidSubResMimeList> {
    private final PermissionModel.AnonymousClass1 userEducationPreference;

    @Inject
    public getIgnorePermissionCheck(PermissionModel.AnonymousClass1 r1) {
        this.userEducationPreference = r1;
    }

    public setValidSubResMimeList createData(String str) {
        return new setForceUseSsl(this.userEducationPreference);
    }
}
