package o;

import com.google.gson.JsonElement;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lid/dana/data/exploredana/repository/source/network/ExploreDanaApi;", "", "getProductCode", "Lio/reactivex/Observable;", "Lcom/google/gson/JsonElement;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface addEvent2Performance {
    @NotNull
    @GET("skywalker/product-mapping-dictionary.json")
    TitleBarRightButtonView.AnonymousClass1<JsonElement> getProductCode();
}
