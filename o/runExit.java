package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.iap.ac.config.lite.ConfigCenter;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/data/miniprogram/source/amcs/AmcsConfigStoreStateEntityData;", "Lid/dana/data/miniprogram/source/ConfigStoreStateData;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "amcsManager", "Lid/dana/data/foundation/amcs/AMCSManager;", "getContext", "()Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "getConfig", "Lio/reactivex/Observable;", "Lid/dana/data/miniprogram/model/StoreStateConfigData;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class runExit {
    private final AppPausePoint getMax;
    @NotNull
    private final Context length;
    final PluginInstallCallback setMax = new PluginInstallCallback();

    @Inject
    public runExit(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.length = context;
        this.getMax = new AppPausePoint(context);
        if (!this.getMax.isInitialized()) {
            this.getMax.startAmcsService(this.length, "prod");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/miniprogram/model/StoreStateConfigData;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    public static final class setMax<V> implements Callable<getTopRender> {
        final /* synthetic */ runExit getMax;

        public setMax(runExit runexit) {
            this.getMax = runexit;
        }

        public final /* synthetic */ Object call() {
            JSONObject sectionConfig = ConfigCenter.getInstance().getSectionConfig(DanaLogConstants.TAG.MINI_PROGRAM);
            if (sectionConfig == null || sectionConfig.length() == 0) {
                return null;
            }
            return (getTopRender) this.getMax.setMax.deserialize(String.valueOf(getPositiveString.getJSONObjectSafe(sectionConfig, "store_state")), getTopRender.class);
        }
    }
}
