package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DialogRecyclerView;
import o.SplashEntryInfo;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lid/dana/data/merchantmanagement/repository/source/mock/MockMerchantManagementEntityData;", "Lid/dana/data/merchantmanagement/MerchantManagementEntityData;", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;)V", "getContext", "()Landroid/content/Context;", "getSerializer", "()Lid/dana/data/storage/Serializer;", "getLinkedMerchants", "Lio/reactivex/Observable;", "Lid/dana/data/merchantmanagement/repository/source/network/result/BoundMerchantResult;", "pageNumber", "", "unbindConsult", "Lid/dana/data/merchantmanagement/repository/source/network/result/UnbindConsultResult;", "clientId", "", "merchantId", "divisionId", "unbindMerchant", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "unbindMerchantRequest", "Lid/dana/data/merchantmanagement/repository/source/network/request/UnbindMerchantRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class permit implements preloadConsole {
    @NotNull
    private final Context context;
    @NotNull
    private final PluginInstallCallback serializer;

    @Inject
    public permit(@NotNull Context context2, @NotNull PluginInstallCallback pluginInstallCallback) {
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        this.context = context2;
        this.serializer = pluginInstallCallback;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final PluginInstallCallback getSerializer() {
        return this.serializer;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setNativeBridge> getLinkedMerchants(int i) {
        TitleBarRightButtonView.AnonymousClass1<setNativeBridge> just = TitleBarRightButtonView.AnonymousClass1.just(this.serializer.deserialize(getAppInfoQuery.jsonRawToString(this.context, DialogRecyclerView.length.getMin), setNativeBridge.class));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(serializ…chantResult::class.java))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getApplication> unbindConsult(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "clientId");
        Intrinsics.checkNotNullParameter(str2, "merchantId");
        getApplication getapplication = new getApplication((SplashEntryInfo.AnonymousClass1) null, (String) null, 3, (DefaultConstructorMarker) null);
        getapplication.success = false;
        TitleBarRightButtonView.AnonymousClass1<getApplication> just = TitleBarRightButtonView.AnonymousClass1.just(getapplication);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(result)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> unbindMerchant(@NotNull BaseEngineImpl baseEngineImpl) {
        Intrinsics.checkNotNullParameter(baseEngineImpl, "unbindMerchantRequest");
        throw new UnsupportedOperationException("Not implemented");
    }
}
