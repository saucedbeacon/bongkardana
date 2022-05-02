package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0014J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J!\u0010\u000f\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J!\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00102\u0006\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0015H\u0016¨\u0006\""}, d2 = {"Lid/dana/data/social/repository/source/network/NetworkRelationshipEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/social/repository/source/network/NetworkRelationshipFacade;", "Lid/dana/data/social/repository/source/RemoteRelationshipEntityData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "securityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;)V", "getFacadeClass", "Ljava/lang/Class;", "getFollowerItemList", "Lio/reactivex/Observable;", "Lid/dana/data/social/repository/source/network/response/FollowerResponse;", "pageNum", "", "userId", "", "(Ljava/lang/Integer;Ljava/lang/String;)Lid/dana/data/social/repository/source/network/response/FollowerResponse;", "getFollowerItemListByModifiedTime", "modifiedTime", "", "getFollowingItemList", "Lid/dana/data/social/repository/source/network/response/FollowingResponse;", "(Ljava/lang/Integer;Ljava/lang/String;)Lid/dana/data/social/repository/source/network/response/FollowingResponse;", "getFollowingItemListByModifiedTime", "modifyRelationship", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "targetUserId", "operationType", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setCtuExtInfo extends setRepeatCount<JsApiInvokeRequestModel> implements getCurrentPageUrl {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/network/response/FollowerResponse;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/social/repository/source/network/NetworkRelationshipFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMax<F, S> implements addAnimatorUpdateListener.getMax<JsApiInvokeRequestModel, getIsvAgent> {
        final /* synthetic */ long getMax;
        final /* synthetic */ int getMin;
        final /* synthetic */ setCtuExtInfo setMin;

        getMax(setCtuExtInfo setctuextinfo, long j, int i) {
            this.setMin = setctuextinfo;
            this.getMax = j;
            this.getMin = i;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            getErrorMsg geterrormsg = new getErrorMsg((String) null, Long.valueOf(this.getMax), Integer.valueOf(this.getMin), (Integer) null, (String) null, (String) null, 57, (DefaultConstructorMarker) null);
            geterrormsg.envInfo = this.setMin.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((JsApiInvokeRequestModel) obj).getNextFollowers(geterrormsg);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/network/response/FollowerResponse;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/social/repository/source/network/NetworkRelationshipFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMin<F, S> implements addAnimatorUpdateListener.getMax<JsApiInvokeRequestModel, getIsvAgent> {
        final /* synthetic */ setCtuExtInfo getMax;
        final /* synthetic */ int getMin;

        getMin(setCtuExtInfo setctuextinfo, int i) {
            this.getMax = setctuextinfo;
            this.getMin = i;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            getErrorMsg geterrormsg = new getErrorMsg((String) null, (Long) null, Integer.valueOf(this.getMin), (Integer) null, (String) null, (String) null, 59, (DefaultConstructorMarker) null);
            geterrormsg.envInfo = this.getMax.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((JsApiInvokeRequestModel) obj).getNextFollowers(geterrormsg);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/network/response/FollowingResponse;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/social/repository/source/network/NetworkRelationshipFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class length<F, S> implements addAnimatorUpdateListener.getMax<JsApiInvokeRequestModel, getIsvAgentDesc> {
        final /* synthetic */ int getMax;
        final /* synthetic */ long getMin;
        final /* synthetic */ setCtuExtInfo setMin;

        length(setCtuExtInfo setctuextinfo, long j, int i) {
            this.setMin = setctuextinfo;
            this.getMin = j;
            this.getMax = i;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            getErrorMsg geterrormsg = new getErrorMsg((String) null, Long.valueOf(this.getMin), Integer.valueOf(this.getMax), (Integer) null, (String) null, (String) null, 57, (DefaultConstructorMarker) null);
            geterrormsg.envInfo = this.setMin.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((JsApiInvokeRequestModel) obj).getNextFollowing(geterrormsg);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/network/response/FollowingResponse;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/social/repository/source/network/NetworkRelationshipFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class setMax<F, S> implements addAnimatorUpdateListener.getMax<JsApiInvokeRequestModel, getIsvAgentDesc> {
        final /* synthetic */ setCtuExtInfo getMax;
        final /* synthetic */ Integer length;
        final /* synthetic */ String setMin;

        setMax(setCtuExtInfo setctuextinfo, Integer num, String str) {
            this.getMax = setctuextinfo;
            this.length = num;
            this.setMin = str;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            getErrorMsg geterrormsg = new getErrorMsg((String) null, (Long) null, this.length, (Integer) null, this.setMin, (String) null, 43, (DefaultConstructorMarker) null);
            geterrormsg.envInfo = this.getMax.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((JsApiInvokeRequestModel) obj).getNextFollowing(geterrormsg);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/network/response/FollowerResponse;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/social/repository/source/network/NetworkRelationshipFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class setMin<F, S> implements addAnimatorUpdateListener.getMax<JsApiInvokeRequestModel, getIsvAgent> {
        final /* synthetic */ Integer getMax;
        final /* synthetic */ setCtuExtInfo setMax;
        final /* synthetic */ String setMin;

        setMin(setCtuExtInfo setctuextinfo, Integer num, String str) {
            this.setMax = setctuextinfo;
            this.getMax = num;
            this.setMin = str;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            getErrorMsg geterrormsg = new getErrorMsg((String) null, (Long) null, this.getMax, (Integer) null, (String) null, this.setMin, 27, (DefaultConstructorMarker) null);
            geterrormsg.envInfo = this.setMax.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((JsApiInvokeRequestModel) obj).getNextFollowers(geterrormsg);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "kotlin.jvm.PlatformType", "facade", "Lid/dana/data/social/repository/source/network/NetworkRelationshipFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<F, S> implements addAnimatorUpdateListener.getMax<JsApiInvokeRequestModel, BaseRpcResult> {
        final /* synthetic */ String getMax;
        final /* synthetic */ setCtuExtInfo getMin;
        final /* synthetic */ String setMax;

        toFloatRange(setCtuExtInfo setctuextinfo, String str, String str2) {
            this.getMin = setctuextinfo;
            this.getMax = str;
            this.setMax = str2;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            setErrorMsg seterrormsg = new setErrorMsg(this.getMax, this.setMax);
            seterrormsg.envInfo = this.getMin.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((JsApiInvokeRequestModel) obj).modifyRelationship(seterrormsg);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setCtuExtInfo(@NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume, @NotNull Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "securityFacade");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final getIsvAgentDesc getFollowingItemList(@Nullable Integer num, @Nullable String str) {
        Object blockingFirst = wrapper(new setMax(this, num, str)).blockingFirst();
        Intrinsics.checkNotNullExpressionValue(blockingFirst, "wrapper { facade ->\n    … })\n    }.blockingFirst()");
        return (getIsvAgentDesc) blockingFirst;
    }

    @NotNull
    public final getIsvAgentDesc getFollowingItemListByModifiedTime(long j, int i) {
        Object blockingFirst = wrapper(new length(this, j, i)).blockingFirst();
        Intrinsics.checkNotNullExpressionValue(blockingFirst, "wrapper { facade ->\n    … })\n    }.blockingFirst()");
        return (getIsvAgentDesc) blockingFirst;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> modifyRelationship(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "targetUserId");
        Intrinsics.checkNotNullParameter(str2, "operationType");
        TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> wrapper = wrapper(new toFloatRange(this, str, str2));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { facade ->\n    …vInfo() }\n        )\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getIsvAgent> getFollowerItemListByModifiedTime(long j, int i) {
        TitleBarRightButtonView.AnonymousClass1<getIsvAgent> wrapper = wrapper(new getMax(this, j, i));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { facade ->\n    …fo()\n            })\n    }");
        return wrapper;
    }

    @NotNull
    public final Class<JsApiInvokeRequestModel> getFacadeClass() {
        return JsApiInvokeRequestModel.class;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getIsvAgent> getFollowerItemList(int i) {
        TitleBarRightButtonView.AnonymousClass1<getIsvAgent> wrapper = wrapper(new getMin(this, i));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { facade ->\n    …fo()\n            })\n    }");
        return wrapper;
    }

    @NotNull
    public final getIsvAgent getFollowerItemList(@Nullable Integer num, @Nullable String str) {
        Object blockingFirst = wrapper(new setMin(this, num, str)).blockingFirst();
        Intrinsics.checkNotNullExpressionValue(blockingFirst, "wrapper { facade ->\n    … })\n    }.blockingFirst()");
        return (getIsvAgent) blockingFirst;
    }
}
