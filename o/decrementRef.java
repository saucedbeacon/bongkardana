package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RVResourceUtils;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/data/referral/source/local/ReferralEngagementPreference;", "", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;)V", "preferenceFacade", "Lid/dana/data/storage/PreferenceFacade;", "getDialogCaches", "", "Lid/dana/data/referral/source/local/model/ReferralEngagementDialogCacheEntity;", "saveDialogCache", "", "referralEngagementDialogCacheEntities", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class decrementRef {
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    private static final String DIALOG_CACHE_KEY = "dialog_cache";
    private static final String REFERRAL_ENGAGEMENT_PREFERENCE;
    private final onSingleFailed preferenceFacade;
    private final PluginInstallCallback serializer;

    @Inject
    public decrementRef(@NotNull Context context, @NotNull PluginInstallCallback pluginInstallCallback) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        this.serializer = pluginInstallCallback;
        onSingleFailed createData = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(REFERRAL_ENGAGEMENT_PREFERENCE).setSerializerFacade(this.serializer)).createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "LocalStorageFactory(buil….createData(Source.LOCAL)");
        this.preferenceFacade = createData;
    }

    public final void saveDialogCache(@NotNull List<createChannelWithBuffer> list) {
        Intrinsics.checkNotNullParameter(list, "referralEngagementDialogCacheEntities");
        this.preferenceFacade.saveData(DIALOG_CACHE_KEY, this.serializer.serialize(list));
    }

    @NotNull
    public final List<createChannelWithBuffer> getDialogCaches() {
        List<createChannelWithBuffer> deserializeList = this.serializer.deserializeList(this.preferenceFacade.getString(DIALOG_CACHE_KEY), createChannelWithBuffer.class);
        Intrinsics.checkNotNullExpressionValue(deserializeList, "serializer.deserializeLi…gCacheEntity::class.java)");
        return deserializeList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/referral/source/local/ReferralEngagementPreference$Companion;", "", "()V", "DIALOG_CACHE_KEY", "", "REFERRAL_ENGAGEMENT_PREFERENCE", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(decrementRef.class.getSimpleName());
        sb.append("production");
        REFERRAL_ENGAGEMENT_PREFERENCE = sb.toString();
    }
}
