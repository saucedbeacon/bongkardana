package o;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alipay.iap.android.wallet.acl.base.APIContext;
import com.alipay.iap.android.wallet.acl.base.BaseResult;
import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.base.ResultError;
import com.alipay.iap.android.wallet.foundation.deeplink.DeeplinkService;
import com.iap.ac.android.acs.plugin.downgrade.constant.ApiDowngradeConstant;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.DatePickerBridgeExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J<\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\"\u0010\u0014\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002J4\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0002J\u0014\u0010\u0018\u001a\u00020\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lid/dana/data/miniprogram/provider/DeeplinkServiceProvider;", "Lcom/alipay/iap/android/wallet/foundation/deeplink/DeeplinkService;", "()V", "miniProgramPublishSubject", "Lio/reactivex/subjects/PublishSubject;", "Lid/dana/data/miniprogram/provider/model/DeeplinkServiceModel;", "open", "", "uri", "Landroid/net/Uri;", "apiContext", "Lcom/alipay/iap/android/wallet/acl/base/APIContext;", "", "sceneCode", "", "params", "", "callback", "Lcom/alipay/iap/android/wallet/acl/base/Callback;", "Lcom/alipay/iap/android/wallet/acl/base/BaseResult;", "openScheme", "openWebPage", "url", "source", "setMpPublishSubject", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getEngineRouter implements DeeplinkService {
    public IComponent<getBackPerform> setMin;

    public final boolean open(@NotNull Uri uri, @Nullable APIContext aPIContext) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String str = null;
        if (!Intrinsics.areEqual((Object) uri.getHost(), (Object) "link.dana.id")) {
            return setMin(uri.toString(), (Callback<BaseResult>) null);
        }
        IComponent<getBackPerform> iComponent = this.setMin;
        if (iComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("miniProgramPublishSubject");
        }
        String obj = uri.toString();
        if (aPIContext != null) {
            str = aPIContext.getSource();
        }
        iComponent.onNext(new getBackPerform(DeeplinkService.Scene.WEB_PAGE, obj, str));
        return true;
    }

    public final void open(@NotNull String str, @NotNull Map<String, String> map, @Nullable APIContext aPIContext, @NotNull Callback<BaseResult> callback) {
        Intrinsics.checkNotNullParameter(str, ApiDowngradeConstant.JsonKeys.SCENE_CODE);
        Intrinsics.checkNotNullParameter(map, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String str2 = null;
        switch (str.hashCode()) {
            case -1854658139:
                if (str.equals(DeeplinkService.Scene.SCHEME)) {
                    setMin(map.get("scheme"), callback);
                    return;
                }
                break;
            case -1814683163:
                if (str.equals(DeeplinkService.Scene.TOP_UP)) {
                    getMax(str, "https://m.dana.id/m/portal/topup", callback, (String) null);
                    return;
                }
                break;
            case 93594810:
                if (str.equals(DeeplinkService.Scene.WEB_PAGE)) {
                    String str3 = map.get("url");
                    if (aPIContext != null) {
                        str2 = aPIContext.getSource();
                    }
                    getMax(str, str3, callback, str2);
                    return;
                }
                break;
            case 1885613522:
                if (str.equals(DeeplinkService.Scene.BIND_CARD)) {
                    getMax(str, "https://m.dana.id/m/portal/bankcardadd?isClosable=true", callback, (String) null);
                    return;
                }
                break;
        }
        IComponent<getBackPerform> iComponent = this.setMin;
        if (iComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("miniProgramPublishSubject");
        }
        iComponent.onNext(new getBackPerform(str));
        callback.result(new BaseResult());
    }

    private static boolean setMin(String str, Callback<BaseResult> callback) {
        Application applicationContext = GriverEnv.getApplicationContext();
        Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse(str == null ? "" : str)).addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(addFlags, "Intent(Intent.ACTION_VIE…t.FLAG_ACTIVITY_NEW_TASK)");
        if (str != null) {
            Intrinsics.checkNotNullExpressionValue(applicationContext, "this");
            if (DatePickerBridgeExtension.AnonymousClass8.length(addFlags, applicationContext)) {
                applicationContext.startActivity(addFlags);
                if (callback == null) {
                    return true;
                }
                callback.result(new BaseResult());
                return true;
            }
        }
        if (callback == null) {
            return false;
        }
        BaseResult baseResult = new BaseResult();
        baseResult.setResultError(new ResultError(1000, "Missing Intent handler"));
        Unit unit = Unit.INSTANCE;
        callback.result(baseResult);
        return false;
    }

    private final void getMax(String str, String str2, Callback<BaseResult> callback, String str3) {
        if (str2 != null) {
            IComponent<getBackPerform> iComponent = this.setMin;
            if (iComponent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("miniProgramPublishSubject");
            }
            iComponent.onNext(new getBackPerform(str, str2, str3));
            callback.result(new BaseResult());
            return;
        }
        BaseResult baseResult = new BaseResult();
        baseResult.setResultError(new ResultError(1000, "Missing URL"));
        Unit unit = Unit.INSTANCE;
        callback.result(baseResult);
    }
}
