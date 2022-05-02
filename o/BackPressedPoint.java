package o;

import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lid/dana/data/geocode/repository/source/network/GeocoderApi;", "", "reverseGeocode", "Lio/reactivex/Observable;", "Lid/dana/data/geocode/model/GeocoderResult;", "lat", "", "key", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface BackPressedPoint {
    @NotNull
    public static final setMax Companion = setMax.$$INSTANCE;
    @NotNull
    public static final String PARAM_KEY = "key";
    @NotNull
    public static final String PARAM_LATLNG = "latlng";

    @NotNull
    @GET("maps/api/geocode/json")
    TitleBarRightButtonView.AnonymousClass1<createDialog> reverseGeocode(@NotNull @Query("latlng") String str, @NotNull @Query("key") String str2);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/geocode/repository/source/network/GeocoderApi$Companion;", "", "()V", "PARAM_KEY", "", "PARAM_LATLNG", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        static final /* synthetic */ setMax $$INSTANCE = new setMax();
        @NotNull
        public static final String PARAM_KEY = "key";
        @NotNull
        public static final String PARAM_LATLNG = "latlng";

        private setMax() {
        }
    }
}
