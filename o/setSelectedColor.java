package o;

import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lid/dana/data/here/source/network/HereTokenApi;", "", "getToken", "Lio/reactivex/Observable;", "Lid/dana/data/here/model/HereTokenResponse;", "contentType", "", "authorization", "grantType", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface setSelectedColor {
    @NotNull
    public static final String CONTENT_TYPE = "Content-Type";
    @NotNull
    public static final length Companion = length.$$INSTANCE;
    @NotNull
    public static final String GRANT_TYPE_PARAM = "grant_type";
    @NotNull
    public static final String HERE_TOKEN_ENDPOINT = "/oauth2/token";

    @FormUrlEncoded
    @NotNull
    @POST("/oauth2/token")
    TitleBarRightButtonView.AnonymousClass1<setBadgeText> getToken(@NotNull @Header("Content-Type") String str, @NotNull @Header("Authorization") String str2, @NotNull @Field("grant_type") String str3);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/data/here/source/network/HereTokenApi$Companion;", "", "()V", "CONTENT_TYPE", "", "GRANT_TYPE_PARAM", "HERE_TOKEN_ENDPOINT", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        static final /* synthetic */ length $$INSTANCE = new length();
        @NotNull
        public static final String CONTENT_TYPE = "Content-Type";
        @NotNull
        public static final String GRANT_TYPE_PARAM = "grant_type";
        @NotNull
        public static final String HERE_TOKEN_ENDPOINT = "/oauth2/token";

        private length() {
        }
    }
}
