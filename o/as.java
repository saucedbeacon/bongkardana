package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.iap.ac.config.lite.ConfigCenter;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.ExtensionOpt;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016¨\u0006\u000b"}, d2 = {"Lid/dana/data/qrbarcode/repository/source/network/AmcsQrScanWhitelistConfig;", "Lid/dana/data/qrbarcode/repository/source/QrScanWhitelistEntityData;", "context", "Landroid/content/Context;", "amcsManager", "Lid/dana/data/foundation/amcs/AMCSManager;", "(Landroid/content/Context;Lid/dana/data/foundation/amcs/AMCSManager;)V", "getWhitelistedQrH5Container", "Lio/reactivex/Observable;", "", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class as implements ExtensionOpt.ExceptionHandler {
    @Inject
    public as(@NotNull Context context, @NotNull AppPausePoint appPausePoint) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(appPausePoint, "amcsManager");
        appPausePoint.startAmcsService(context, "prod");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getWhitelistedQrH5Container() {
        TitleBarRightButtonView.AnonymousClass1<List<String>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(setMin.length);
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable ….toStringList()\n        }");
        return fromCallable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class setMin<V> implements Callable<List<? extends String>> {
        public static final setMin length = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object call() {
            JSONArray jSONArrayConfig = ConfigCenter.getInstance().getJSONArrayConfig("merchant_qr_domain_whitelist");
            if (jSONArrayConfig != null) {
                return setFantasyFontFamily.toStringList(jSONArrayConfig);
            }
            return null;
        }
    }
}
