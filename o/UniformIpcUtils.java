package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RVResourceUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bJ\u001e\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/data/services/repository/source/local/FavoriteServicesPreference;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "preferenceFacade", "Lid/dana/data/storage/PreferenceFacade;", "clearAll", "", "getFavoriteServices", "", "", "phoneNumber", "saveFavoriteServices", "", "services", "Companion", "Key", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class UniformIpcUtils {
    @NotNull
    public static final length Companion = new length((DefaultConstructorMarker) null);
    private static final String USER_EDUCATION_PREFERENCE = "UserEducationPreferenceproduction";
    private final onSingleFailed preferenceFacade;

    @Inject
    public UniformIpcUtils(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        onSingleFailed createData = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup("UserEducationPreferenceproduction").setUseDrutherPreference(true)).createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "LocalStorageFactory(buil….createData(Source.LOCAL)");
        this.preferenceFacade = createData;
    }

    @NotNull
    public final List<String> getFavoriteServices(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        List<String> list = (List) this.preferenceFacade.getObject("favorite_services".concat(String.valueOf(str)), List.class);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final boolean saveFavoriteServices(@Nullable List<String> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        this.preferenceFacade.saveData("favorite_services".concat(String.valueOf(str)), list);
        return true;
    }

    public final void clearAll() {
        this.preferenceFacade.clearAllData();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/services/repository/source/local/FavoriteServicesPreference$Companion;", "", "()V", "USER_EDUCATION_PREFERENCE", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
