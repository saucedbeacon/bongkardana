package o;

import o.b;

public final class getRequestBeginTime implements getAdapterPosition<getBeginTime> {
    private final b.C0007b<setRequestBeginTime> networkVerifyTokenEntityDataProvider;

    public getRequestBeginTime(b.C0007b<setRequestBeginTime> bVar) {
        this.networkVerifyTokenEntityDataProvider = bVar;
    }

    public final getBeginTime get() {
        return newInstance(this.networkVerifyTokenEntityDataProvider.get());
    }

    public static getRequestBeginTime create(b.C0007b<setRequestBeginTime> bVar) {
        return new getRequestBeginTime(bVar);
    }

    public static getBeginTime newInstance(setRequestBeginTime setrequestbegintime) {
        return new getBeginTime(setrequestbegintime);
    }
}
