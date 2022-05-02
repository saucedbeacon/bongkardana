package o;

import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lid/dana/data/here/source/network/HereLookupByIdApi;", "", "lookupById", "Lio/reactivex/Observable;", "Lid/dana/data/here/model/Item;", "lang", "", "id", "authorization", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface setBadgeColor {
    @NotNull
    @GET("/v1/lookup")
    TitleBarRightButtonView.AnonymousClass1<TabBarColorModel> lookupById(@NotNull @Query("lang") String str, @NotNull @Query("id") String str2, @NotNull @Header("Authorization") String str3);
}
