package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import id.dana.globalsearch.dfrestaurant.model.RestaurantInfoModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a3\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006¢\u0006\u0002\u0010\u0007\u001a\u0016\u0010\b\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003\u001a\u0016\u0010\n\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\f"}, d2 = {"toPojoModel", "T", "", "", "", "clazz", "Ljava/lang/Class;", "(Ljava/util/Map;Ljava/lang/Class;)Ljava/lang/Object;", "toRestaurantInfo", "Lid/dana/globalsearch/dfrestaurant/model/RestaurantInfoModel;", "toServiceInfo", "Lid/dana/globalsearch/service/model/ServiceInfoModel;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class setBridgeManifests {
    @NotNull
    public static final RestaurantInfoModel setMax(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "$this$toRestaurantInfo");
        Gson gson = new Gson();
        JsonElement jsonTree = gson.toJsonTree(map);
        Intrinsics.checkNotNullExpressionValue(jsonTree, "gson.toJsonTree(this)");
        Object fromJson = gson.fromJson(jsonTree, RestaurantInfoModel.class);
        Intrinsics.checkNotNullExpressionValue(fromJson, "gson.fromJson(jsonElemen…antInfoModel::class.java)");
        return (RestaurantInfoModel) fromJson;
    }

    @NotNull
    public static final <T> T length(@NotNull Map<String, ? extends Object> map, @NotNull Class<T> cls) {
        Intrinsics.checkNotNullParameter(map, "$this$toPojoModel");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        Gson gson = new Gson();
        JsonElement jsonTree = gson.toJsonTree(map);
        Intrinsics.checkNotNullExpressionValue(jsonTree, "gson.toJsonTree(this)");
        T fromJson = gson.fromJson(jsonTree, cls);
        Intrinsics.checkNotNullExpressionValue(fromJson, "gson.fromJson(jsonElement, clazz)");
        return fromJson;
    }
}
