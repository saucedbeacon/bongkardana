package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BaseTabBar;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0014J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¨\u0006\u0015"}, d2 = {"Lid/dana/data/ipg/repository/source/network/NetworkIpgRegistrationUrlEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/ipg/repository/source/network/IpgRegistrationUrlApi;", "Lid/dana/data/ipg/repository/source/IpgRegistrationUrlEntityData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "securityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;)V", "getFacadeClass", "Ljava/lang/Class;", "getIpgRegistrationUrl", "Lio/reactivex/Observable;", "Lid/dana/data/ipg/repository/source/network/response/IpgRegistrationUrlResult;", "deviceId", "", "bizType", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class handleSwitchTab extends setRepeatCount<getPageAt> implements isAlphaBackground {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/ipg/repository/source/network/response/IpgRegistrationUrlResult;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/ipg/repository/source/network/IpgRegistrationUrlApi;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class length<F, S> implements addAnimatorUpdateListener.getMax<getPageAt, BaseTabBar.TabBarManageExtension> {
        final /* synthetic */ BaseTabBar.AnonymousClass1.AnonymousClass1 getMax;

        length(BaseTabBar.AnonymousClass1.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((getPageAt) obj).getRegistrationUrl(this.getMax);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public handleSwitchTab(@NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume, @NotNull Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "securityFacade");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final Class<getPageAt> getFacadeClass() {
        return getPageAt.class;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BaseTabBar.TabBarManageExtension> getIpgRegistrationUrl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(str2, "bizType");
        BaseTabBar.AnonymousClass1.AnonymousClass1 r0 = new BaseTabBar.AnonymousClass1.AnonymousClass1((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        r0.setBizType(str2);
        r0.setDeviceId(str);
        r0.envInfo = generateMobileEnvInfo();
        TitleBarRightButtonView.AnonymousClass1<BaseTabBar.TabBarManageExtension> wrapper = wrapper(new length(r0));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { facade ->\n    …tionUrlRequest)\n        }");
        return wrapper;
    }
}
