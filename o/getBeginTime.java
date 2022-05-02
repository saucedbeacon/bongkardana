package o;

import javax.inject.Inject;

public class getBeginTime extends uncheckItems<setBeginTime> {
    private final setRequestBeginTime networkVerifyTokenEntityData;

    @Inject
    public getBeginTime(setRequestBeginTime setrequestbegintime) {
        this.networkVerifyTokenEntityData = setrequestbegintime;
    }

    public setBeginTime createData(String str) {
        return this.networkVerifyTokenEntityData;
    }
}
