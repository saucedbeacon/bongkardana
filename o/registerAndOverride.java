package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RVResourceUtils;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\nJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/data/promocenter/repository/source/local/PromoAdsPreferences;", "", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;)V", "preferenceFacade", "Lid/dana/data/storage/PreferenceFacade;", "getCurrentAdsPageNumber", "", "phoneNumber", "", "getUserLastCoordinate", "Lid/dana/data/promocenter/repository/source/local/model/UserCoordinateEntityData;", "saveCurrentAdsPageNumber", "", "pageNumber", "saveUserLastCoordinate", "", "userCoordinateEntityData", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class registerAndOverride {
    @NotNull
    public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
    private static final String PROMO_ADS_PREFERENCES;
    private final onSingleFailed preferenceFacade;
    private final PluginInstallCallback serializer;

    @Inject
    public registerAndOverride(@NotNull Context context, @NotNull PluginInstallCallback pluginInstallCallback) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        this.serializer = pluginInstallCallback;
        onSingleFailed createData = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(PROMO_ADS_PREFERENCES).setSerializerFacade(this.serializer)).createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "LocalStorageFactory(buil….createData(Source.LOCAL)");
        this.preferenceFacade = createData;
    }

    @NotNull
    public final RVParams getUserLastCoordinate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Object object = this.preferenceFacade.getObject(Companion.getUsersCoordinatePreferenceKey(str), RVParams.class);
        Intrinsics.checkNotNullExpressionValue(object, "preferenceFacade.getObje…teEntityData::class.java)");
        return (RVParams) object;
    }

    public final boolean saveUserLastCoordinate(@NotNull String str, @NotNull RVParams rVParams) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Intrinsics.checkNotNullParameter(rVParams, "userCoordinateEntityData");
        this.preferenceFacade.saveData(Companion.getUsersCoordinatePreferenceKey(str), this.serializer.serialize(rVParams));
        Unit unit = Unit.INSTANCE;
        return true;
    }

    public final void saveCurrentAdsPageNumber(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        this.preferenceFacade.saveData(Companion.getAdsCurrentPagePreferenceKey(str), Integer.valueOf(i));
    }

    public final int getCurrentAdsPageNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Integer integer = this.preferenceFacade.getInteger(Companion.getAdsCurrentPagePreferenceKey(str));
        Intrinsics.checkNotNullExpressionValue(integer, "preferenceFacade.getInte…eferenceKey(phoneNumber))");
        return integer.intValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/data/promocenter/repository/source/local/PromoAdsPreferences$Companion;", "", "()V", "PROMO_ADS_PREFERENCES", "", "getAdsCurrentPagePreferenceKey", "phoneNumber", "getUsersCoordinatePreferenceKey", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String getUsersCoordinatePreferenceKey(String str) {
            StringBuilder sb = new StringBuilder("user_[");
            sb.append(str);
            sb.append("]_promo_ads_coordinate_lat_long");
            return sb.toString();
        }

        /* access modifiers changed from: private */
        public final String getAdsCurrentPagePreferenceKey(String str) {
            StringBuilder sb = new StringBuilder("user_[");
            sb.append(str);
            sb.append("]_promo_ads_current_page");
            return sb.toString();
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(registerAndOverride.class.getSimpleName());
        sb.append("production");
        PROMO_ADS_PREFERENCES = sb.toString();
    }
}
