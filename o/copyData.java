package o;

import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011JJ\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H'J6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lid/dana/data/nearbyplaces/repository/source/network/NearbyPlacesApi;", "", "findPlaces", "Lio/reactivex/Observable;", "Lid/dana/data/nearbyplaces/repository/source/network/result/PlaceSearchListResult;", "keyword", "", "location", "origin", "radius", "", "sessionToken", "key", "getPlaceDetail", "Lid/dana/data/nearbyplaces/repository/source/network/result/PlaceDetailResult;", "placeId", "fields", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface copyData {
    @NotNull
    public static final setMin Companion = setMin.$$INSTANCE;
    @NotNull
    public static final String FIELDS = "fields";
    @NotNull
    public static final String INPUT = "input";
    @NotNull
    public static final String KEY = "key";
    @NotNull
    public static final String LOCATION = "location";
    @NotNull
    public static final String ORIGIN = "origin";
    @NotNull
    public static final String PLACE_ID = "place_id";
    @NotNull
    public static final String RADIUS = "radius";
    @NotNull
    public static final String SESSION_TOKEN = "sessiontoken";

    @NotNull
    @GET("place/autocomplete/json?strictbounds")
    TitleBarRightButtonView.AnonymousClass1<Object> findPlaces(@NotNull @Query("input") String str, @NotNull @Query("location") String str2, @NotNull @Query("origin") String str3, @Query("radius") int i, @NotNull @Query("sessiontoken") String str4, @NotNull @Query("key") String str5);

    @NotNull
    @GET("place/details/json")
    TitleBarRightButtonView.AnonymousClass1<Object> getPlaceDetail(@NotNull @Query("place_id") String str, @NotNull @Query("fields") String str2, @NotNull @Query("sessiontoken") String str3, @NotNull @Query("key") String str4);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/data/nearbyplaces/repository/source/network/NearbyPlacesApi$Companion;", "", "()V", "FIELDS", "", "INPUT", "KEY", "LOCATION", "ORIGIN", "PLACE_ID", "RADIUS", "SESSION_TOKEN", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        static final /* synthetic */ setMin $$INSTANCE = new setMin();
        @NotNull
        public static final String FIELDS = "fields";
        @NotNull
        public static final String INPUT = "input";
        @NotNull
        public static final String KEY = "key";
        @NotNull
        public static final String LOCATION = "location";
        @NotNull
        public static final String ORIGIN = "origin";
        @NotNull
        public static final String PLACE_ID = "place_id";
        @NotNull
        public static final String RADIUS = "radius";
        @NotNull
        public static final String SESSION_TOKEN = "sessiontoken";

        private setMin() {
        }
    }
}
