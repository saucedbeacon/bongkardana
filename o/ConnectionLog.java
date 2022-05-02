package o;

import o.TitleBarRightButtonView;
import o.b;

public final class ConnectionLog implements getAdapterPosition<setParentId> {
    private final b.C0007b<setHeaderString> networkRegistrationEntityDataProvider;

    /* renamed from: o.ConnectionLog$1  reason: invalid class name */
    public interface AnonymousClass1 {
        TitleBarRightButtonView.AnonymousClass1<EventLog> checkRegistrationAndSendOtp(String str, String str2, String str3, String str4, Boolean bool);

        TitleBarRightButtonView.AnonymousClass1<setEventName> register(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);
    }

    public final class Builder implements getAdapterPosition<setStatusCode> {
        private final b.C0007b<setGroupId> loginAuthenticationMapperProvider;

        public Builder(b.C0007b<setGroupId> bVar) {
            this.loginAuthenticationMapperProvider = bVar;
        }

        public final setStatusCode get() {
            return newInstance(this.loginAuthenticationMapperProvider.get());
        }

        public static Builder create(b.C0007b<setGroupId> bVar) {
            return new Builder(bVar);
        }

        public static setStatusCode newInstance(setGroupId setgroupid) {
            return new setStatusCode(setgroupid);
        }
    }

    public ConnectionLog(b.C0007b<setHeaderString> bVar) {
        this.networkRegistrationEntityDataProvider = bVar;
    }

    public final setParentId get() {
        return newInstance(this.networkRegistrationEntityDataProvider.get());
    }

    public static ConnectionLog create(b.C0007b<setHeaderString> bVar) {
        return new ConnectionLog(bVar);
    }

    public static setParentId newInstance(setHeaderString setheaderstring) {
        return new setParentId(setheaderstring);
    }
}
