package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lid/dana/data/qriscrossborder/source/local/LocalQrisCrossBorderEntityData;", "Lid/dana/data/qriscrossborder/source/QrisCrossBorderEntityData;", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "qrisCrossBorderPreference", "Lid/dana/data/qriscrossborder/source/local/QrisCrossBorderPreference;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;Lid/dana/data/qriscrossborder/source/local/QrisCrossBorderPreference;)V", "getContext", "()Landroid/content/Context;", "getSerializer", "()Lid/dana/data/storage/Serializer;", "getCurrentCountry", "Lio/reactivex/Observable;", "", "getOriginCountry", "saveCurrentCountry", "", "countryCode", "saveOriginCountry", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BridgeExtensionRegistry implements BridgePermission {
    private final BridgeDSLRegistry getMin;
    @NotNull
    private final PluginInstallCallback length;
    @NotNull
    private final Context setMax;

    @Inject
    public BridgeExtensionRegistry(@NotNull Context context, @NotNull PluginInstallCallback pluginInstallCallback, @NotNull BridgeDSLRegistry bridgeDSLRegistry) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        Intrinsics.checkNotNullParameter(bridgeDSLRegistry, "qrisCrossBorderPreference");
        this.setMax = context;
        this.length = pluginInstallCallback;
        this.getMin = bridgeDSLRegistry;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        BridgeDSLRegistry bridgeDSLRegistry = this.getMin;
        Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        bridgeDSLRegistry.length.saveData("QRIS_ORIGIN_COUNTRY", str);
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(true)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> setMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        BridgeDSLRegistry bridgeDSLRegistry = this.getMin;
        Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        bridgeDSLRegistry.length.saveData("QRIS_CURRENT_COUNTRY", str);
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(true)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> setMin() {
        String string = this.getMin.length.getString("QRIS_CURRENT_COUNTRY");
        if (string == null) {
            string = "";
        }
        TitleBarRightButtonView.AnonymousClass1<String> just = TitleBarRightButtonView.AnonymousClass1.just(string);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(countryCode ?: \"\")");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> length() {
        String string = this.getMin.length.getString("QRIS_ORIGIN_COUNTRY");
        if (string == null) {
            string = "";
        }
        TitleBarRightButtonView.AnonymousClass1<String> just = TitleBarRightButtonView.AnonymousClass1.just(string);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(countryCode ?: \"\")");
        return just;
    }
}
