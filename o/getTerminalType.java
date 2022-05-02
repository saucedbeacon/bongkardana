package o;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.RVOpenAuthHelper;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0014¨\u0006\u0016"}, d2 = {"Lid/dana/data/social/repository/source/network/NetworkActivityReactionsEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/social/repository/source/network/ActivityReactionsFacade;", "Lid/dana/data/social/repository/ActivityReactionsData;", "appContext", "Landroid/content/Context;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "apSecurityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "(Landroid/content/Context;Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;)V", "getActivityReactions", "Lio/reactivex/Observable;", "Lid/dana/data/social/model/ActivityReactionsResult;", "activityId", "", "kind", "idLT", "getFacadeClass", "Ljava/lang/Class;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getTerminalType extends setRepeatCount<getCtuExtInfo> implements RVOpenAuthHelper.a.AnonymousClass1 {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/social/model/ActivityReactionsResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/social/repository/source/network/ActivityReactionsFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMax<F, S> implements addAnimatorUpdateListener.getMax<getCtuExtInfo, executeAuth> {
        final /* synthetic */ getAuthSkipResult getMin;

        getMax(getAuthSkipResult getauthskipresult) {
            this.getMin = getauthskipresult;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((getCtuExtInfo) obj).getActivityReactions(this.getMin);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getTerminalType(@NotNull Context context, @NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(context, "appContext");
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "apSecurityFacade");
    }

    @NotNull
    public final Class<getCtuExtInfo> getFacadeClass() {
        return getCtuExtInfo.class;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<executeAuth> getActivityReactions(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        Intrinsics.checkNotNullParameter(str2, "kind");
        Intrinsics.checkNotNullParameter(str3, "idLT");
        getAuthSkipResult getauthskipresult = new getAuthSkipResult(str, str2, str3);
        getauthskipresult.envInfo = generateMobileEnvInfo();
        TitleBarRightButtonView.AnonymousClass1<executeAuth> wrapper = wrapper(new getMax(getauthskipresult));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n            it…ctions(request)\n        }");
        return wrapper;
    }
}
