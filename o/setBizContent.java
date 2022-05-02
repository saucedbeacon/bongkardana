package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import com.zoloz.android.phone.zdoc.service.ZdocRecordService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00019B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u0010\u001b\u001a\u00020\u0011H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000eH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0014J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0016JR\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u00112\b\u0010(\u001a\u0004\u0018\u00010\u00112\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020&2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110,H\u0016J&\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u000e2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0011H\u0016J:\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u000e2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u00112\b\u0010(\u001a\u0004\u0018\u00010\u00112\u0006\u00100\u001a\u00020&2\u0006\u00101\u001a\u000202H\u0002J*\u00103\u001a\b\u0012\u0004\u0012\u00020.0\u000e2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u00112\b\u0010(\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00110,H\u0016J\u001e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u0011H\u0016¨\u0006:"}, d2 = {"Lid/dana/data/social/repository/source/network/NetworkSocialMediaData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/social/repository/source/network/SocialMediaFacade;", "Lid/dana/data/social/repository/SocialMediaData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "apSecurityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "appContext", "Landroid/content/Context;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;)V", "addActivityComment", "Lio/reactivex/Observable;", "Lid/dana/data/social/repository/source/network/response/AddActivityCommentResponse;", "userId", "", "activityId", "content", "addActivityReaction", "Lid/dana/data/social/repository/source/network/response/AddActivityReactionResult;", "kind", "deleteActivityReaction", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "reactionId", "deleteComment", "id", "fetchFeedNotificationCount", "Lid/dana/data/social/repository/source/network/response/FetchFeedNotificationCountResponse;", "getFacadeClass", "Ljava/lang/Class;", "getFeedComment", "Lid/dana/data/social/repository/source/network/response/FetchActivityCommentsResponse;", "idLastComment", "getFeeds", "Lid/dana/data/social/model/FeedResult;", "pageSize", "", "maxId", "minId", "feedType", "feedVersion", "activityIds", "", "getGlobalNotification", "Lid/dana/data/social/model/MyFeedResult;", "getInbox", "inboxVersion", "globalNotification", "", "getMyFeeds", "markAsReadNotification", "ids", "submitFeedCommentReport", "commentId", "reason", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setBizContent extends setRepeatCount<AuthSkipRequestModel> implements AuthProtocol {
    @NotNull
    public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
    public static final int INBOX_VERSION = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/social/model/MyFeedResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/social/repository/source/network/SocialMediaFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<F, S> implements addAnimatorUpdateListener.getMax<AuthSkipRequestModel, RVOpenAuthHelper> {
        final /* synthetic */ getExtendDescription length;

        IsOverlapping(getExtendDescription getextenddescription) {
            this.length = getextenddescription;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((AuthSkipRequestModel) obj).getMyFeeds(this.length);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "kotlin.jvm.PlatformType", "socialMediaFacade", "Lid/dana/data/social/repository/source/network/SocialMediaFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class equals<F, S> implements addAnimatorUpdateListener.getMax<AuthSkipRequestModel, BaseRpcResult> {
        final /* synthetic */ List getMax;
        final /* synthetic */ setBizContent setMax;

        equals(setBizContent setbizcontent, List list) {
            this.setMax = setbizcontent;
            this.getMax = list;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            setErrorCode seterrorcode = new setErrorCode(this.getMax);
            seterrorcode.envInfo = this.setMax.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((AuthSkipRequestModel) obj).markNotificationAsRead(seterrorcode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/network/response/AddActivityCommentResponse;", "kotlin.jvm.PlatformType", "socialMediaFacade", "Lid/dana/data/social/repository/source/network/SocialMediaFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMax<F, S> implements addAnimatorUpdateListener.getMax<AuthSkipRequestModel, setAppName> {
        final /* synthetic */ String getMax;
        final /* synthetic */ setBizContent length;
        final /* synthetic */ String setMax;
        final /* synthetic */ String setMin;

        getMax(setBizContent setbizcontent, String str, String str2, String str3) {
            this.length = setbizcontent;
            this.setMin = str;
            this.setMax = str2;
            this.getMax = str3;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            AuthContentResultModel authContentResultModel = new AuthContentResultModel(this.setMin, this.setMax, this.getMax);
            authContentResultModel.envInfo = this.length.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((AuthSkipRequestModel) obj).addActivityComment(authContentResultModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/network/response/FetchActivityCommentsResponse;", "kotlin.jvm.PlatformType", "socialMediaFacade", "Lid/dana/data/social/repository/source/network/SocialMediaFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class isInside<F, S> implements addAnimatorUpdateListener.getMax<AuthSkipRequestModel, setAgreements> {
        final /* synthetic */ String getMax;
        final /* synthetic */ setBizContent getMin;
        final /* synthetic */ String setMax;

        isInside(setBizContent setbizcontent, String str, String str2) {
            this.getMin = setbizcontent;
            this.getMax = str;
            this.setMax = str2;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            AuthSkipRequestModel authSkipRequestModel = (AuthSkipRequestModel) obj;
            String str = this.getMax;
            String str2 = this.setMax;
            if (!(str2.length() > 0)) {
                str2 = null;
            }
            getSuccess getsuccess = new getSuccess(str, str2);
            getsuccess.envInfo = this.getMin.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return authSkipRequestModel.fetchFeedComments(getsuccess);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "kotlin.jvm.PlatformType", "socialMediaFacade", "Lid/dana/data/social/repository/source/network/SocialMediaFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class length<F, S> implements addAnimatorUpdateListener.getMax<AuthSkipRequestModel, BaseRpcResult> {
        final /* synthetic */ String getMin;
        final /* synthetic */ String length;
        final /* synthetic */ setBizContent setMin;

        length(setBizContent setbizcontent, String str, String str2) {
            this.setMin = setbizcontent;
            this.length = str;
            this.getMin = str2;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            setSuccess setsuccess = new setSuccess(this.length, this.getMin);
            setsuccess.envInfo = this.setMin.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((AuthSkipRequestModel) obj).deleteActivityReaction(setsuccess);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/network/response/AddActivityReactionResult;", "kotlin.jvm.PlatformType", "socialMediaFacade", "Lid/dana/data/social/repository/source/network/SocialMediaFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class setMax<F, S> implements addAnimatorUpdateListener.getMax<AuthSkipRequestModel, setAppLogoLink> {
        final /* synthetic */ String getMin;
        final /* synthetic */ String length;
        final /* synthetic */ setBizContent setMax;
        final /* synthetic */ String setMin;

        setMax(setBizContent setbizcontent, String str, String str2, String str3) {
            this.setMax = setbizcontent;
            this.setMin = str;
            this.getMin = str2;
            this.length = str3;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            AuthSkipRequestModel authSkipRequestModel = (AuthSkipRequestModel) obj;
            String str = this.setMin;
            if (str == null) {
                str = "";
            }
            AuthAgreementModel authAgreementModel = new AuthAgreementModel(str, this.getMin, this.length);
            authAgreementModel.envInfo = this.setMax.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return authSkipRequestModel.addActivityReaction(authAgreementModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "kotlin.jvm.PlatformType", "socialMediaFacade", "Lid/dana/data/social/repository/source/network/SocialMediaFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class setMin<F, S> implements addAnimatorUpdateListener.getMax<AuthSkipRequestModel, BaseRpcResult> {
        final /* synthetic */ String getMax;
        final /* synthetic */ setBizContent setMax;

        setMin(setBizContent setbizcontent, String str) {
            this.setMax = setbizcontent;
            this.getMax = str;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            setContent setcontent = new setContent(this.getMax);
            setcontent.envInfo = this.setMax.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((AuthSkipRequestModel) obj).deleteComment(setcontent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/network/response/FetchFeedNotificationCountResponse;", "kotlin.jvm.PlatformType", "socialMediaFacade", "Lid/dana/data/social/repository/source/network/SocialMediaFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<F, S> implements addAnimatorUpdateListener.getMax<AuthSkipRequestModel, setIsvAgent> {
        final /* synthetic */ setBizContent getMin;

        toFloatRange(setBizContent setbizcontent) {
            this.getMin = setbizcontent;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            BaseRpcRequest baseRpcRequest = new BaseRpcRequest();
            baseRpcRequest.envInfo = this.getMin.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((AuthSkipRequestModel) obj).fetchFeedNotificationCount(baseRpcRequest);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/social/model/FeedResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/social/repository/source/network/SocialMediaFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<F, S> implements addAnimatorUpdateListener.getMax<AuthSkipRequestModel, getExtendScope> {
        final /* synthetic */ List IsOverlapping;
        final /* synthetic */ String equals;
        final /* synthetic */ int getMax;
        final /* synthetic */ String getMin;
        final /* synthetic */ setBizContent length;
        final /* synthetic */ String setMax;
        final /* synthetic */ String setMin;
        final /* synthetic */ int toIntRange;

        toIntRange(setBizContent setbizcontent, String str, int i, String str2, String str3, String str4, int i2, List list) {
            this.length = setbizcontent;
            this.setMax = str;
            this.getMax = i;
            this.setMin = str2;
            this.getMin = str3;
            this.equals = str4;
            this.toIntRange = i2;
            this.IsOverlapping = list;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            AppPermissionInitExtension appPermissionInitExtension = new AppPermissionInitExtension(this.setMax, this.getMax, this.setMin, this.getMin, this.equals, this.toIntRange, this.IsOverlapping);
            appPermissionInitExtension.envInfo = this.length.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((AuthSkipRequestModel) obj).fetchFeed(appPermissionInitExtension);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setBizContent(@NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume, @NotNull Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "apSecurityFacade");
        Intrinsics.checkNotNullParameter(context, "appContext");
    }

    @NotNull
    public final Class<AuthSkipRequestModel> getFacadeClass() {
        return AuthSkipRequestModel.class;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<RVOpenAuthHelper> getMyFeeds(int i, @Nullable String str, @Nullable String str2) {
        return getInbox(i, str, str2, 2, false);
    }

    private final TitleBarRightButtonView.AnonymousClass1<RVOpenAuthHelper> getInbox(int i, String str, String str2, int i2, boolean z) {
        getExtendDescription getextenddescription = new getExtendDescription(i, str, str2, i2, z);
        getextenddescription.envInfo = generateMobileEnvInfo();
        TitleBarRightButtonView.AnonymousClass1<RVOpenAuthHelper> wrapper = wrapper(new IsOverlapping(getextenddescription));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n            it…yFeeds(request)\n        }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<RVOpenAuthHelper> getGlobalNotification(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "maxId");
        Intrinsics.checkNotNullParameter(str2, "minId");
        return getInbox(i, Intrinsics.areEqual((Object) str, (Object) "") ? null : str, Intrinsics.areEqual((Object) str2, (Object) "") ? null : str2, 2, true);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getExtendScope> getFeeds(@Nullable String str, int i, @Nullable String str2, @Nullable String str3, @NotNull String str4, int i2, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str4, "feedType");
        List<String> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "activityIds");
        TitleBarRightButtonView.AnonymousClass1<getExtendScope> wrapper = wrapper(new toIntRange(this, str, i, str3, str2, str4, i2, list2));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n        it.fet…nvInfo()\n        })\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setAppLogoLink> addActivityReaction(@Nullable String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        Intrinsics.checkNotNullParameter(str3, "kind");
        TitleBarRightButtonView.AnonymousClass1<setAppLogoLink> wrapper = wrapper(new setMax(this, str, str2, str3));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { socialMediaFac…        }\n        )\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> deleteActivityReaction(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_REACTION_ID);
        Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> wrapper = wrapper(new length(this, str, str2));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { socialMediaFac…        }\n        )\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setAppName> addActivityComment(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        Intrinsics.checkNotNullParameter(str3, "content");
        TitleBarRightButtonView.AnonymousClass1<setAppName> wrapper = wrapper(new getMax(this, str, str2, str3));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { socialMediaFac…        }\n        )\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> deleteComment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> wrapper = wrapper(new setMin(this, str));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { socialMediaFac…        }\n        )\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setAgreements> getFeedComment(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        Intrinsics.checkNotNullParameter(str2, "idLastComment");
        TitleBarRightButtonView.AnonymousClass1<setAgreements> wrapper = wrapper(new isInside(this, str, str2));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { socialMediaFac…        }\n        )\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> submitFeedCommentReport(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "commentId");
        Intrinsics.checkNotNullParameter(str2, ZdocRecordService.REASON);
        TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> wrapper = wrapper(new setBizContent$FastBitmap$CoordinateSystem(this, str, str2));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { socialMediaFac…\n            })\n        }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setIsvAgent> fetchFeedNotificationCount() {
        TitleBarRightButtonView.AnonymousClass1<setIsvAgent> wrapper = wrapper(new toFloatRange(this));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { socialMediaFac…\n            })\n        }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> markAsReadNotification(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "ids");
        TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> wrapper = wrapper(new equals(this, list));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { socialMediaFac…        }\n        )\n    }");
        return wrapper;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/social/repository/source/network/NetworkSocialMediaData$Companion;", "", "()V", "INBOX_VERSION", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
