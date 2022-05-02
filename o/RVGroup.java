package o;

import com.alibaba.fastjson.JSONObject;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import com.zoloz.android.phone.zdoc.service.ZdocRecordService;
import id.dana.data.Source;
import id.dana.data.userconfig.UserConfigBizTypeConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AppMsgReceiver;
import o.RunningAverageRssiFilter;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B_\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0016J&\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f2\u0006\u0010&\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"H\u0002J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020-H\u0002J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f2\u0006\u0010/\u001a\u00020\"H\u0016JR\u00100\u001a\b\u0012\u0004\u0012\u0002010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\"2\b\u00105\u001a\u0004\u0018\u00010\"2\u0006\u00106\u001a\u00020\"2\u0006\u00107\u001a\u0002032\f\u00108\u001a\b\u0012\u0004\u0012\u00020\"09H\u0002J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u0002030\u001fH\u0016J\"\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0<2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\"0@H\u0002JZ\u0010A\u001a\b\u0012\u0004\u0012\u0002010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\"2\b\u00105\u001a\u0004\u0018\u00010\"2\u0006\u00107\u001a\u0002032\f\u00108\u001a\b\u0012\u0004\u0012\u00020\"092\u0006\u00106\u001a\u00020\"2\u0006\u0010B\u001a\u00020\u001cH\u0016J\u001e\u0010C\u001a\b\u0012\u0004\u0012\u00020>0\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010D\u001a\u00020\"H\u0016J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u0002030\u001fH\u0016JR\u0010F\u001a\b\u0012\u0004\u0012\u0002010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\"2\b\u00105\u001a\u0004\u0018\u00010\"2\u0006\u00106\u001a\u00020\"2\u0006\u00107\u001a\u0002032\f\u00108\u001a\b\u0012\u0004\u0012\u00020\"09H\u0016J&\u0010G\u001a\b\u0012\u0004\u0012\u0002010\u001f2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\"2\u0006\u00105\u001a\u00020\"H\u0016J\u001e\u0010H\u001a\b\u0012\u0004\u0012\u00020\"0@2\u0006\u0010&\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J*\u0010I\u001a\b\u0012\u0004\u0012\u0002010\u001f2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\"2\b\u00105\u001a\u0004\u0018\u00010\"H\u0016J@\u0010J\u001a\b\u0012\u0004\u0012\u0002010\u001f2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\"2\b\u00105\u001a\u0004\u0018\u00010\"2\u0006\u00107\u001a\u0002032\f\u00108\u001a\b\u0012\u0004\u0012\u00020\"09H\u0016J\u0014\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0L0\u001fH\u0016J\u000e\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001fH\u0016J\u0014\u0010O\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=0<H\u0002J\u0014\u0010P\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002010<H\u0002J\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\"09H\u0016J\u0016\u0010S\u001a\u00020T2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020V09H\u0002J&\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f2\u0006\u0010'\u001a\u00020\"2\u0006\u0010X\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c0\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lid/dana/data/social/SocialMediaEntityRepository;", "Lid/dana/data/base/AuthenticatedEntityRepository;", "Lid/dana/domain/social/SocialMediaRepository;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "loginEntityDataFactory", "Lid/dana/data/login/source/LoginEntityDataFactory;", "securityGuardFacade", "Lid/dana/data/foundation/facade/SecurityGuardFacade;", "errorConfigFactory", "Lid/dana/data/errorconfig/ErrorConfigFactory;", "userConfigEntityRepository", "Lid/dana/data/userconfig/repository/UserConfigEntityRepository;", "socialMediaDataFactory", "Lid/dana/data/social/repository/SocialMediaDataFactory;", "contactDeviceNameMapper", "Lid/dana/data/social/extension/ContactDeviceNameMapper;", "socialPreferencesDataFactory", "Lid/dana/data/social/repository/SocialPreferencesDataFactory;", "amcsConfigEntityData", "Lid/dana/data/config/source/amcs/AmcsConfigEntityData;", "configEntityDataFactory", "Lid/dana/data/config/source/ConfigEntityDataFactory;", "reportReasonsConfigMapper", "Lid/dana/data/social/mapper/ReportReasonsConfigMapper;", "(Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/login/source/LoginEntityDataFactory;Lid/dana/data/foundation/facade/SecurityGuardFacade;Lid/dana/data/errorconfig/ErrorConfigFactory;Lid/dana/data/userconfig/repository/UserConfigEntityRepository;Lid/dana/data/social/repository/SocialMediaDataFactory;Lid/dana/data/social/extension/ContactDeviceNameMapper;Lid/dana/data/social/repository/SocialPreferencesDataFactory;Lid/dana/data/config/source/amcs/AmcsConfigEntityData;Lid/dana/data/config/source/ConfigEntityDataFactory;Lid/dana/data/social/mapper/ReportReasonsConfigMapper;)V", "shareFeedQueryConfig", "Lid/dana/domain/userconfig/model/QueryConfig;", "", "kotlin.jvm.PlatformType", "addActivityComment", "Lio/reactivex/Observable;", "Lid/dana/domain/social/model/AddActivityCommentInfo;", "userId", "", "activityId", "content", "cacheReportedCommentId", "phoneNumber", "commentId", "createConfigSplitEntityData", "Lid/dana/data/config/source/ConfigEntityData;", "createLocalSocialPreferencesData", "Lid/dana/data/social/repository/SocialPreferencesData;", "createSocialMediaData", "Lid/dana/data/social/repository/SocialMediaData;", "deleteComment", "id", "doGetFeeds", "Lid/dana/domain/social/model/SocialFeed;", "pageSize", "", "maxId", "minId", "feedType", "feedVersion", "activityIds", "", "fetchFeedNotificationCount", "filterReportedComment", "Lkotlin/Function1;", "Lid/dana/data/social/repository/source/network/response/FetchActivityCommentsResponse;", "Lid/dana/domain/social/model/FeedCommentResult;", "reportedComments", "", "getCachedFeeds", "fetchCache", "getFeedComments", "idLastComment", "getFeedVersion", "getFeeds", "getGlobalNotification", "getListOfReportedCommentId", "getMyFeeds", "getMyProfileFeed", "getReportReasonsConfig", "", "Lid/dana/domain/social/model/ReportReasons;", "getShareFeedsConfig", "mapDeviceName", "mapPhoneNumberInActivitiesToDeviceContactName", "markAsReadNotification", "ids", "maskNicknameDisplayName", "", "phoneNumberToContact", "Lid/dana/data/social/repository/source/persistence/entity/PhoneNumberToContactNameMappable;", "submitFeedCommentReport", "reason", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RVGroup extends setMinProgress implements DistanceConfigFetcher {
    private final DialogLayout accountEntityDataFactory;
    private final handleMessage amcsConfigEntityData;
    private final onCallBack configEntityDataFactory;
    /* access modifiers changed from: private */
    public final getPermissions contactDeviceNameMapper;
    private final getAppLaunchParams errorConfigFactory;
    private final b.AnonymousClass3 loginEntityDataFactory;
    /* access modifiers changed from: private */
    public final startH5OpenAuth reportReasonsConfigMapper;
    private final BackKeyDownPoint securityGuardFacade;
    private final onFirstScanTime<Boolean> shareFeedQueryConfig = new onFirstScanTime<>(UserConfigBizTypeConstant.SHARE_FEED, Boolean.TYPE);
    private final setApiLevelStr socialMediaDataFactory;
    private final getLink socialPreferencesDataFactory;
    private final getOrigin userConfigEntityRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/social/model/SocialFeed;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<T> implements RedDotManager<getScanCallbackIntent> {
        final /* synthetic */ RVGroup getMax;

        IsOverlapping(RVGroup rVGroup) {
            this.getMax = rVGroup;
        }

        public final /* synthetic */ void accept(Object obj) {
            getScanCallbackIntent getscancallbackintent = (getScanCallbackIntent) obj;
            if (getscancallbackintent.hasActivities()) {
                getFromSystem access$createLocalSocialPreferencesData = this.getMax.createLocalSocialPreferencesData();
                Intrinsics.checkNotNullExpressionValue(getscancallbackintent, "it");
                access$createLocalSocialPreferencesData.cacheTimeline(getscancallbackintent);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/config/source/amcs/result/FeedHomeConfigResult;", "apply", "(Lid/dana/data/config/source/amcs/result/FeedHomeConfigResult;)Ljava/lang/Integer;"}, k = 3, mv = {1, 4, 2})
    static final class equals<T, R> implements RedDotDrawable<access$002, Integer> {
        public static final equals setMin = new equals();

        equals() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            access$002 access_002 = (access$002) obj;
            Intrinsics.checkNotNullParameter(access_002, "it");
            return Integer.valueOf(access_002.toFeedHomeConfig().getFeedVersion());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/SocialFeed;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/social/model/FeedResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<getExtendScope, getScanCallbackIntent> {
        public static final getMin getMin = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getExtendScope getextendscope = (getExtendScope) obj;
            Intrinsics.checkNotNullParameter(getextendscope, "it");
            return addOpenAuthHelper.toSocialFeed(getextendscope);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012(\u0010\u0004\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u0005 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u00050\u00060\u0001H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lid/dana/domain/social/model/ReportReasons;", "kotlin.jvm.PlatformType", "sourceItem", "Lcom/alibaba/fastjson/JSONObject;", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class hashCode<T, R> implements RedDotDrawable<List<JSONObject>, List<setSimulatedScanData>> {
        final /* synthetic */ RVGroup getMax;

        hashCode(RVGroup rVGroup) {
            this.getMax = rVGroup;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "sourceItem");
            return (List) this.getMax.reportReasonsConfigMapper.apply(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/social/repository/source/network/response/FetchFeedNotificationCountResponse;", "apply", "(Lid/dana/data/social/repository/source/network/response/FetchFeedNotificationCountResponse;)Ljava/lang/Integer;"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<setIsvAgent, Integer> {
        public static final length setMax = new length();

        length() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            setIsvAgent setisvagent = (setIsvAgent) obj;
            Intrinsics.checkNotNullParameter(setisvagent, "it");
            return Integer.valueOf(setisvagent.getNotificationCount());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/AddActivityCommentInfo;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/social/repository/source/network/response/AddActivityCommentResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<setAppName, RunningAverageRssiFilter.AnonymousClass1> {
        public static final setMax getMin = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            String str2;
            setAppName setappname = (setAppName) obj;
            Intrinsics.checkNotNullParameter(setappname, "it");
            String id2 = setappname.getId();
            String str3 = id2 == null ? "" : id2;
            String userId = setappname.getUserId();
            String str4 = userId == null ? "" : userId;
            String activityId = setappname.getActivityId();
            if (activityId == null) {
                str = "";
            } else {
                str = activityId;
            }
            String content = setappname.getContent();
            if (content == null) {
                str2 = "";
            } else {
                str2 = content;
            }
            String createdTime = setappname.getCreatedTime();
            if (createdTime == null) {
                createdTime = "";
            }
            return new Object(str3, str4, str, str2, createdTime) {
                @NotNull
                private final String activityId;
                @NotNull
                private final String content;
                @NotNull
                private final String createdTime;
                @NotNull

                /* renamed from: id  reason: collision with root package name */
                private final String f9917id;
                @NotNull
                private final String userId;

                public static /* synthetic */ AnonymousClass1 copy$default(AnonymousClass1 r3, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = r3.f9917id;
                    }
                    if ((i & 2) != 0) {
                        str2 = r3.userId;
                    }
                    String str6 = str2;
                    if ((i & 4) != 0) {
                        str3 = r3.activityId;
                    }
                    String str7 = str3;
                    if ((i & 8) != 0) {
                        str4 = r3.content;
                    }
                    String str8 = str4;
                    if ((i & 16) != 0) {
                        str5 = r3.createdTime;
                    }
                    return r3.copy(str, str6, str7, str8, str5);
                }

                @NotNull
                public final String component1() {
                    return this.f9917id;
                }

                @NotNull
                public final String component2() {
                    return this.userId;
                }

                @NotNull
                public final String component3() {
                    return this.activityId;
                }

                @NotNull
                public final String component4() {
                    return this.content;
                }

                @NotNull
                public final String component5() {
                    return this.createdTime;
                }

                @NotNull
                public final AnonymousClass1 copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
                    Intrinsics.checkNotNullParameter(str, "id");
                    Intrinsics.checkNotNullParameter(str2, "userId");
                    Intrinsics.checkNotNullParameter(str3, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
                    Intrinsics.checkNotNullParameter(str4, "content");
                    Intrinsics.checkNotNullParameter(str5, "createdTime");
                    return 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: RETURN  
                          (wrap: o.RunningAverageRssiFilter$1 : 0x003c: CONSTRUCTOR  (r1v4 o.RunningAverageRssiFilter$1) = 
                          (r3v0 'str3' java.lang.String)
                          (r4v0 'str4' java.lang.String)
                          (r5v0 'str' java.lang.String)
                          (r6v0 'str2' java.lang.String)
                          (r8v3 'createdTime' java.lang.String)
                         call: o.RunningAverageRssiFilter.1.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: CONSTRUCTOR)
                         in method: o.RVGroup.setMax.apply(java.lang.Object):java.lang.Object, dex: classes3.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003c: CONSTRUCTOR  (r1v4 o.RunningAverageRssiFilter$1) = 
                          (r3v0 'str3' java.lang.String)
                          (r4v0 'str4' java.lang.String)
                          (r5v0 'str' java.lang.String)
                          (r6v0 'str2' java.lang.String)
                          (r8v3 'createdTime' java.lang.String)
                         call: o.RunningAverageRssiFilter.1.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: CONSTRUCTOR in method: o.RVGroup.setMax.apply(java.lang.Object):java.lang.Object, dex: classes3.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 44 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method generation error
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:274)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	... 48 more
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: RETURN  
                          (wrap: o.RunningAverageRssiFilter$1 : 0x0021: CONSTRUCTOR  (r1v0 o.RunningAverageRssiFilter$1) = 
                          (r8v0 'str' java.lang.String)
                          (r9v0 'str2' java.lang.String)
                          (r10v0 'str3' java.lang.String)
                          (r11v0 'str4' java.lang.String)
                          (r12v0 'str5' java.lang.String)
                         call: o.RunningAverageRssiFilter.1.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: CONSTRUCTOR)
                         in method: o.RunningAverageRssiFilter.1.copy(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):o.RunningAverageRssiFilter$1, dex: classes3.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	... 65 more
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0021: CONSTRUCTOR  (r1v0 o.RunningAverageRssiFilter$1) = 
                          (r8v0 'str' java.lang.String)
                          (r9v0 'str2' java.lang.String)
                          (r10v0 'str3' java.lang.String)
                          (r11v0 'str4' java.lang.String)
                          (r12v0 'str5' java.lang.String)
                         call: o.RunningAverageRssiFilter.1.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: CONSTRUCTOR in method: o.RunningAverageRssiFilter.1.copy(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):o.RunningAverageRssiFilter$1, dex: classes3.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 74 more
                        Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: o.RunningAverageRssiFilter.1
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:649)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	... 78 more
                        */
                    /*
                        this = this;
                        o.setAppName r8 = (o.setAppName) r8
                        java.lang.String r0 = "it"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                        o.RunningAverageRssiFilter$1 r0 = new o.RunningAverageRssiFilter$1
                        java.lang.String r1 = r8.getId()
                        java.lang.String r2 = ""
                        if (r1 != 0) goto L_0x0013
                        r3 = r2
                        goto L_0x0014
                    L_0x0013:
                        r3 = r1
                    L_0x0014:
                        java.lang.String r1 = r8.getUserId()
                        if (r1 != 0) goto L_0x001c
                        r4 = r2
                        goto L_0x001d
                    L_0x001c:
                        r4 = r1
                    L_0x001d:
                        java.lang.String r1 = r8.getActivityId()
                        if (r1 != 0) goto L_0x0025
                        r5 = r2
                        goto L_0x0026
                    L_0x0025:
                        r5 = r1
                    L_0x0026:
                        java.lang.String r1 = r8.getContent()
                        if (r1 != 0) goto L_0x002e
                        r6 = r2
                        goto L_0x002f
                    L_0x002e:
                        r6 = r1
                    L_0x002f:
                        java.lang.String r8 = r8.getCreatedTime()
                        if (r8 != 0) goto L_0x0036
                        r8 = r2
                    L_0x0036:
                        r1 = r0
                        r2 = r3
                        r3 = r4
                        r4 = r5
                        r5 = r6
                        r6 = r8
                        r1.<init>(r2, r3, r4, r5, r6)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.RVGroup.setMax.apply(java.lang.Object):java.lang.Object");
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "apply", "(Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
            static final class setMin<T, R> implements RedDotDrawable<BaseRpcResult, Boolean> {
                public static final setMin setMax = new setMin();

                setMin() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    BaseRpcResult baseRpcResult = (BaseRpcResult) obj;
                    Intrinsics.checkNotNullParameter(baseRpcResult, "it");
                    return Boolean.valueOf(baseRpcResult.success);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/SocialFeed;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/social/model/MyFeedResult;", "apply"}, k = 3, mv = {1, 4, 2})
            static final class toFloatRange<T, R> implements RedDotDrawable<RVOpenAuthHelper, getScanCallbackIntent> {
                public static final toFloatRange length = new toFloatRange();

                toFloatRange() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    RVOpenAuthHelper rVOpenAuthHelper = (RVOpenAuthHelper) obj;
                    Intrinsics.checkNotNullParameter(rVOpenAuthHelper, "it");
                    return addOpenAuthHelper.toMyFeed(rVOpenAuthHelper);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/SocialFeed;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/social/model/MyFeedResult;", "apply"}, k = 3, mv = {1, 4, 2})
            static final class toIntRange<T, R> implements RedDotDrawable<RVOpenAuthHelper, getScanCallbackIntent> {
                public static final toIntRange length = new toIntRange();

                toIntRange() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    RVOpenAuthHelper rVOpenAuthHelper = (RVOpenAuthHelper) obj;
                    Intrinsics.checkNotNullParameter(rVOpenAuthHelper, "it");
                    return addOpenAuthHelper.toMyFeed(rVOpenAuthHelper);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "apply", "(Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
            static final class toString<T, R> implements RedDotDrawable<BaseRpcResult, Boolean> {
                public static final toString setMin = new toString();

                toString() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    BaseRpcResult baseRpcResult = (BaseRpcResult) obj;
                    Intrinsics.checkNotNullParameter(baseRpcResult, "it");
                    return Boolean.valueOf(baseRpcResult.success);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/SocialFeed;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/social/model/FeedResult;", "apply"}, k = 3, mv = {1, 4, 2})
            static final class toDoubleRange<T, R> implements RedDotDrawable<getExtendScope, getScanCallbackIntent> {
                public static final toDoubleRange getMax = new toDoubleRange();

                toDoubleRange() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    getExtendScope getextendscope = (getExtendScope) obj;
                    Intrinsics.checkNotNullParameter(getextendscope, "it");
                    return addOpenAuthHelper.toSocialFeed(getextendscope);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            @Inject
            public RVGroup(@NotNull DialogLayout dialogLayout, @NotNull b.AnonymousClass3 r3, @NotNull BackKeyDownPoint backKeyDownPoint, @NotNull getAppLaunchParams getapplaunchparams, @NotNull getOrigin getorigin, @NotNull setApiLevelStr setapilevelstr, @NotNull getPermissions getpermissions, @NotNull getLink getlink, @NotNull handleMessage handlemessage, @NotNull onCallBack oncallback, @NotNull startH5OpenAuth starth5openauth) {
                super(dialogLayout, r3, backKeyDownPoint, getapplaunchparams);
                Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
                Intrinsics.checkNotNullParameter(r3, "loginEntityDataFactory");
                Intrinsics.checkNotNullParameter(backKeyDownPoint, "securityGuardFacade");
                Intrinsics.checkNotNullParameter(getapplaunchparams, "errorConfigFactory");
                Intrinsics.checkNotNullParameter(getorigin, "userConfigEntityRepository");
                Intrinsics.checkNotNullParameter(setapilevelstr, "socialMediaDataFactory");
                Intrinsics.checkNotNullParameter(getpermissions, "contactDeviceNameMapper");
                Intrinsics.checkNotNullParameter(getlink, "socialPreferencesDataFactory");
                Intrinsics.checkNotNullParameter(handlemessage, "amcsConfigEntityData");
                Intrinsics.checkNotNullParameter(oncallback, "configEntityDataFactory");
                Intrinsics.checkNotNullParameter(starth5openauth, "reportReasonsConfigMapper");
                this.accountEntityDataFactory = dialogLayout;
                this.loginEntityDataFactory = r3;
                this.securityGuardFacade = backKeyDownPoint;
                this.errorConfigFactory = getapplaunchparams;
                this.userConfigEntityRepository = getorigin;
                this.socialMediaDataFactory = setapilevelstr;
                this.contactDeviceNameMapper = getpermissions;
                this.socialPreferencesDataFactory = getlink;
                this.amcsConfigEntityData = handlemessage;
                this.configEntityDataFactory = oncallback;
                this.reportReasonsConfigMapper = starth5openauth;
            }

            /* JADX WARNING: type inference failed for: r4v1, types: [o.setOpenAuthGrantFlag] */
            /* JADX WARNING: Multi-variable type inference failed */
            @org.jetbrains.annotations.NotNull
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final o.TitleBarRightButtonView.AnonymousClass1<o.getScanCallbackIntent> getFeeds(@org.jetbrains.annotations.Nullable java.lang.String r2, int r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.Nullable java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6, int r7, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r8) {
                /*
                    r1 = this;
                    java.lang.String r0 = "feedType"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                    java.lang.String r0 = "activityIds"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                    o.TitleBarRightButtonView$1 r2 = r1.doGetFeeds(r2, r3, r4, r5, r6, r7, r8)
                    kotlin.jvm.functions.Function1 r3 = r1.mapPhoneNumberInActivitiesToDeviceContactName()
                    if (r3 == 0) goto L_0x001a
                    o.setOpenAuthGrantFlag r4 = new o.setOpenAuthGrantFlag
                    r4.<init>(r3)
                    r3 = r4
                L_0x001a:
                    o.RedDotDrawable r3 = (o.RedDotDrawable) r3
                    o.TitleBarRightButtonView$1 r2 = r2.map(r3)
                    java.lang.String r3 = "doGetFeeds(userId, pageS…iesToDeviceContactName())"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: o.RVGroup.getFeeds(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, java.util.List):o.TitleBarRightButtonView$1");
            }

            /* JADX WARNING: type inference failed for: r2v1, types: [o.setOpenAuthGrantFlag] */
            /* JADX WARNING: Multi-variable type inference failed */
            @org.jetbrains.annotations.NotNull
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final o.TitleBarRightButtonView.AnonymousClass1<o.getScanCallbackIntent> getCachedFeeds(@org.jetbrains.annotations.Nullable java.lang.String r10, int r11, @org.jetbrains.annotations.Nullable java.lang.String r12, @org.jetbrains.annotations.Nullable java.lang.String r13, int r14, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r15, @org.jetbrains.annotations.NotNull java.lang.String r16, boolean r17) {
                /*
                    r9 = this;
                    r8 = r9
                    java.lang.String r0 = "activityIds"
                    r7 = r15
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                    java.lang.String r0 = "feedType"
                    r5 = r16
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    r0 = r9
                    r1 = r10
                    r2 = r11
                    r3 = r12
                    r4 = r13
                    r6 = r14
                    o.TitleBarRightButtonView$1 r0 = r0.doGetFeeds(r1, r2, r3, r4, r5, r6, r7)
                    o.RVGroup$IsOverlapping r1 = new o.RVGroup$IsOverlapping
                    r1.<init>(r9)
                    o.RedDotManager r1 = (o.RedDotManager) r1
                    o.TitleBarRightButtonView$1 r0 = r0.doOnNext(r1)
                    if (r17 == 0) goto L_0x0036
                    o.RVGroup$isInside r1 = new o.RVGroup$isInside
                    r1.<init>(r9)
                    java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
                    o.TitleBarRightButtonView$1 r1 = o.TitleBarRightButtonView.AnonymousClass1.fromCallable(r1)
                    o.TitleBarRightButtonView$4 r1 = (o.TitleBarRightButtonView.AnonymousClass4) r1
                    o.TitleBarRightButtonView$1 r0 = r0.startWith(r1)
                L_0x0036:
                    kotlin.jvm.functions.Function1 r1 = r9.mapPhoneNumberInActivitiesToDeviceContactName()
                    if (r1 == 0) goto L_0x0042
                    o.setOpenAuthGrantFlag r2 = new o.setOpenAuthGrantFlag
                    r2.<init>(r1)
                    r1 = r2
                L_0x0042:
                    o.RedDotDrawable r1 = (o.RedDotDrawable) r1
                    o.TitleBarRightButtonView$1 r0 = r0.map(r1)
                    java.lang.String r1 = "observable.map(mapPhoneN…iesToDeviceContactName())"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.RVGroup.getCachedFeeds(java.lang.String, int, java.lang.String, java.lang.String, int, java.util.List, java.lang.String, boolean):o.TitleBarRightButtonView$1");
            }

            private final TitleBarRightButtonView.AnonymousClass1<getScanCallbackIntent> doGetFeeds(String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
                TitleBarRightButtonView.AnonymousClass1<R> map = createSocialMediaData().getFeeds(str, i, str2, str3, str4, i2, list).map(getMin.getMin);
                Intrinsics.checkNotNullExpressionValue(map, "createSocialMediaData().….toSocialFeed()\n        }");
                return map;
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<Integer> getFeedVersion() {
                TitleBarRightButtonView.AnonymousClass1<R> map = createConfigSplitEntityData().getFeedConfig().map(equals.setMin);
                Intrinsics.checkNotNullExpressionValue(map, "createConfigSplitEntityD…omeConfig().feedVersion }");
                return map;
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<RunningAverageRssiFilter.AnonymousClass1> addActivityComment(@NotNull String str, @NotNull String str2, @NotNull String str3) {
                Intrinsics.checkNotNullParameter(str, "userId");
                Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
                Intrinsics.checkNotNullParameter(str3, "content");
                TitleBarRightButtonView.AnonymousClass1<R> map = createSocialMediaData().addActivityComment(str, str2, str3).map(setMax.getMin);
                Intrinsics.checkNotNullExpressionValue(map, "createSocialMediaData().…Time.orEmpty())\n        }");
                return map;
            }

            /* JADX WARNING: type inference failed for: r0v8, types: [o.setOpenAuthGrantFlag] */
            /* JADX WARNING: type inference failed for: r1v5, types: [o.setOpenAuthGrantFlag] */
            /* JADX WARNING: Multi-variable type inference failed */
            @org.jetbrains.annotations.NotNull
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final o.TitleBarRightButtonView.AnonymousClass1<o.RunningAverageRssiFilter.Measurement> getFeedComments(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
                /*
                    r3 = this;
                    java.lang.String r0 = "activityId"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    java.lang.String r0 = "idLastComment"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    o.DialogLayout r0 = r3.accountEntityDataFactory
                    java.lang.String r1 = "local"
                    o.setDrawDivider r0 = r0.createData((java.lang.String) r1)
                    java.lang.String r1 = "accountEntityDataFactory…            Source.LOCAL)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                    o.TitleBarRightButtonView$1 r0 = r0.getPhoneNumber()
                    java.lang.Object r0 = r0.blockingFirst()
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.String r1 = "phoneNumber"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                    java.util.Set r0 = r3.getListOfReportedCommentId(r0, r4)
                    o.setApiLevelStr r1 = r3.socialMediaDataFactory
                    java.lang.String r2 = "network"
                    o.AuthProtocol r1 = r1.createData((java.lang.String) r2)
                    o.TitleBarRightButtonView$1 r4 = r1.getFeedComment(r4, r5)
                    kotlin.jvm.functions.Function1 r5 = r3.mapDeviceName()
                    if (r5 == 0) goto L_0x0042
                    o.setOpenAuthGrantFlag r1 = new o.setOpenAuthGrantFlag
                    r1.<init>(r5)
                    r5 = r1
                L_0x0042:
                    o.RedDotDrawable r5 = (o.RedDotDrawable) r5
                    o.TitleBarRightButtonView$1 r4 = r4.map(r5)
                    kotlin.jvm.functions.Function1 r5 = r3.filterReportedComment(r0)
                    if (r5 == 0) goto L_0x0054
                    o.setOpenAuthGrantFlag r0 = new o.setOpenAuthGrantFlag
                    r0.<init>(r5)
                    r5 = r0
                L_0x0054:
                    o.RedDotDrawable r5 = (o.RedDotDrawable) r5
                    o.TitleBarRightButtonView$1 r4 = r4.map(r5)
                    java.lang.String r5 = "socialMediaDataFactory.c…omment(reportedComments))"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: o.RVGroup.getFeedComments(java.lang.String, java.lang.String):o.TitleBarRightButtonView$1");
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/FeedCommentResult;", "it", "Lid/dana/data/social/repository/source/network/response/FetchActivityCommentsResponse;", "invoke"}, k = 3, mv = {1, 4, 2})
            static final class getMax extends Lambda implements Function1<setAgreements, RunningAverageRssiFilter.Measurement> {
                final /* synthetic */ Set $reportedComments;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                getMax(Set set) {
                    super(1);
                    this.$reportedComments = set;
                }

                @NotNull
                public final RunningAverageRssiFilter.Measurement invoke(@NotNull setAgreements setagreements) {
                    Intrinsics.checkNotNullParameter(setagreements, "it");
                    RunningAverageRssiFilter.Measurement feedCommentResult = setagreements.toFeedCommentResult();
                    Collection arrayList = new ArrayList();
                    for (Object next : feedCommentResult.getComments()) {
                        if (!this.$reportedComments.contains(((ScanDataProcessor) next).getId())) {
                            arrayList.add(next);
                        }
                    }
                    Collection arrayList2 = new ArrayList();
                    for (Object next2 : (List) arrayList) {
                        if (!((ScanDataProcessor) next2).getHasReport()) {
                            arrayList2.add(next2);
                        }
                    }
                    feedCommentResult.setComments((List) arrayList2);
                    return feedCommentResult;
                }
            }

            private final Function1<setAgreements, RunningAverageRssiFilter.Measurement> filterReportedComment(Set<String> set) {
                return new getMax(set);
            }

            private final Function1<setAgreements, setAgreements> mapDeviceName() {
                return new values(this);
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/network/response/FetchActivityCommentsResponse;", "response", "invoke"}, k = 3, mv = {1, 4, 2})
            static final class values extends Lambda implements Function1<setAgreements, setAgreements> {
                final /* synthetic */ RVGroup this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                values(RVGroup rVGroup) {
                    super(1);
                    this.this$0 = rVGroup;
                }

                @NotNull
                public final setAgreements invoke(@NotNull setAgreements setagreements) {
                    Intrinsics.checkNotNullParameter(setagreements, "response");
                    List<getAppLogoLink> comments = setagreements.getComments();
                    if (comments != null) {
                        Iterable<getAppLogoLink> iterable = comments;
                        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                        for (getAppLogoLink user : iterable) {
                            arrayList.add(user.getUser());
                        }
                        List list = (List) arrayList;
                        getPermissions.mapDeviceContactName$default(this.this$0.contactDeviceNameMapper, list, new setMin(list, this), (Function1) null, 4, (Object) null);
                    }
                    return setagreements;
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/data/social/SocialMediaEntityRepository$mapDeviceName$1$2$1"}, k = 3, mv = {1, 4, 2})
                static final class setMin extends Lambda implements Function0<Unit> {
                    final /* synthetic */ List $it;
                    final /* synthetic */ values this$0;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    setMin(List list, values values) {
                        super(0);
                        this.$it = list;
                        this.this$0 = values;
                    }

                    public final void invoke() {
                        this.this$0.this$0.maskNicknameDisplayName(this.$it);
                    }
                }
            }

            /* access modifiers changed from: private */
            public final void maskNicknameDisplayName(List<? extends getShowType> list) {
                Iterable<getShowType> iterable = list;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (getShowType getshowtype : iterable) {
                    getshowtype.updateNickName(startBluetoothDevicesDiscovery.maskName(getshowtype.getNickname()));
                    arrayList.add(Unit.INSTANCE);
                }
            }

            private final Set<String> getListOfReportedCommentId(String str, String str2) {
                return createLocalSocialPreferencesData().getReportedCommentIdCache(str, str2);
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<List<setSimulatedScanData>> getReportReasonsConfig() {
                TitleBarRightButtonView.AnonymousClass1<R> map = createConfigSplitEntityData().getReportReasonsConfig().map(new hashCode(this));
                Intrinsics.checkNotNullExpressionValue(map, "createConfigSplitEntityD…ply(sourceItem)\n        }");
                return map;
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<Boolean> submitFeedCommentReport(@NotNull String str, @NotNull String str2, @NotNull String str3) {
                Intrinsics.checkNotNullParameter(str, "commentId");
                Intrinsics.checkNotNullParameter(str2, ZdocRecordService.REASON);
                Intrinsics.checkNotNullParameter(str3, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
                setDrawDivider createData = this.accountEntityDataFactory.createData("local");
                Intrinsics.checkNotNullExpressionValue(createData, "accountEntityDataFactory…            Source.LOCAL)");
                TitleBarRightButtonView.AnonymousClass1<R> map = createSocialMediaData().submitFeedCommentReport(str, str2).onErrorResumeNext(RVGroup$Grayscale$Algorithm.setMax).doOnNext(new invokeSuspend(this, createData.getPhoneNumber().blockingFirst(), str3, str)).map(RVGroup$Mean$Arithmetic.setMax);
                Intrinsics.checkNotNullExpressionValue(map, "createSocialMediaData().…     }.map { it.success }");
                return map;
            }

            /* access modifiers changed from: private */
            public final TitleBarRightButtonView.AnonymousClass1<Boolean> cacheReportedCommentId(String str, String str2, String str3) {
                Set mutableSet = CollectionsKt.toMutableSet(createLocalSocialPreferencesData().getReportedCommentIdCache(str, str2));
                mutableSet.add(str3);
                TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(createLocalSocialPreferencesData().saveReportedCommentId(str, str2, mutableSet)));
                Intrinsics.checkNotNullExpressionValue(just, "Observable.just(createLo…portedComments)\n        )");
                return just;
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<Boolean> deleteComment(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "id");
                TitleBarRightButtonView.AnonymousClass1<R> map = createSocialMediaData().deleteComment(str).map(setMin.setMax);
                Intrinsics.checkNotNullExpressionValue(map, "createSocialMediaData().…     it.success\n        }");
                return map;
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<Integer> fetchFeedNotificationCount() {
                TitleBarRightButtonView.AnonymousClass1<R> map = createSocialMediaData().fetchFeedNotificationCount().map(length.setMax);
                Intrinsics.checkNotNullExpressionValue(map, "createSocialMediaData().…tificationCount\n        }");
                return map;
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<Boolean> markAsReadNotification(@NotNull List<String> list) {
                Intrinsics.checkNotNullParameter(list, "ids");
                TitleBarRightButtonView.AnonymousClass1<R> map = createSocialMediaData().markAsReadNotification(list).map(toString.setMin);
                Intrinsics.checkNotNullExpressionValue(map, "createSocialMediaData().…     it.success\n        }");
                return map;
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<getScanCallbackIntent> getMyFeeds(int i, @Nullable String str, @Nullable String str2) {
                TitleBarRightButtonView.AnonymousClass1<R> map = createSocialMediaData().getMyFeeds(i, str, str2).map(toIntRange.length);
                Intrinsics.checkNotNullExpressionValue(map, "createSocialMediaData().…  it.toMyFeed()\n        }");
                return map;
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<getScanCallbackIntent> getGlobalNotification(int i, @NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "maxId");
                Intrinsics.checkNotNullParameter(str2, "minId");
                TitleBarRightButtonView.AnonymousClass1<R> map = createSocialMediaData().getGlobalNotification(i, str, str2).map(toFloatRange.length);
                Intrinsics.checkNotNullExpressionValue(map, "createSocialMediaData().…  it.toMyFeed()\n        }");
                return map;
            }

            /* JADX WARNING: type inference failed for: r12v1, types: [o.setOpenAuthGrantFlag] */
            /* JADX WARNING: Multi-variable type inference failed */
            @org.jetbrains.annotations.NotNull
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final o.TitleBarRightButtonView.AnonymousClass1<o.getScanCallbackIntent> getMyProfileFeed(int r10, @org.jetbrains.annotations.Nullable java.lang.String r11, @org.jetbrains.annotations.Nullable java.lang.String r12, int r13, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r14) {
                /*
                    r9 = this;
                    java.lang.String r0 = "activityIds"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                    o.DialogLayout r0 = r9.accountEntityDataFactory
                    java.lang.String r1 = "local"
                    o.setDrawDivider r0 = r0.createData((java.lang.String) r1)
                    java.lang.String r1 = "accountEntityDataFactory.createData(Source.LOCAL)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                    o.TitleBarRightButtonView$1 r0 = r0.getUserId()
                    java.lang.Object r0 = r0.blockingFirst()
                    r2 = r0
                    java.lang.String r2 = (java.lang.String) r2
                    o.AuthProtocol r1 = r9.createSocialMediaData()
                    java.lang.String r6 = "userFeed"
                    r3 = r10
                    r4 = r11
                    r5 = r12
                    r7 = r13
                    r8 = r14
                    o.TitleBarRightButtonView$1 r10 = r1.getFeeds(r2, r3, r4, r5, r6, r7, r8)
                    o.RVGroup$toDoubleRange r11 = o.RVGroup.toDoubleRange.getMax
                    o.RedDotDrawable r11 = (o.RedDotDrawable) r11
                    o.TitleBarRightButtonView$1 r10 = r10.map(r11)
                    kotlin.jvm.functions.Function1 r11 = r9.mapPhoneNumberInActivitiesToDeviceContactName()
                    if (r11 == 0) goto L_0x0041
                    o.setOpenAuthGrantFlag r12 = new o.setOpenAuthGrantFlag
                    r12.<init>(r11)
                    r11 = r12
                L_0x0041:
                    o.RedDotDrawable r11 = (o.RedDotDrawable) r11
                    o.TitleBarRightButtonView$1 r10 = r10.map(r11)
                    java.lang.String r11 = "createSocialMediaData().…iesToDeviceContactName())"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: o.RVGroup.getMyProfileFeed(int, java.lang.String, java.lang.String, int, java.util.List):o.TitleBarRightButtonView$1");
            }

            private final Function1<getScanCallbackIntent, getScanCallbackIntent> mapPhoneNumberInActivitiesToDeviceContactName() {
                return new RVGroup$FastBitmap$CoordinateSystem(this);
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<Boolean> getShareFeedsConfig() {
                TitleBarRightButtonView.AnonymousClass1<Boolean> userSpecificConfig = this.userConfigEntityRepository.getUserSpecificConfig(this.shareFeedQueryConfig);
                Intrinsics.checkNotNullExpressionValue(userSpecificConfig, "userConfigEntityReposito…    shareFeedQueryConfig)");
                return userSpecificConfig;
            }

            private final AppMsgReceiver.AnonymousClass2 createConfigSplitEntityData() {
                AppMsgReceiver.AnonymousClass2 createData = this.configEntityDataFactory.createData(Source.SPLIT);
                Intrinsics.checkNotNullExpressionValue(createData, "configEntityDataFactory.…ta(\n        Source.SPLIT)");
                return createData;
            }

            private final AuthProtocol createSocialMediaData() {
                return this.socialMediaDataFactory.createData("network");
            }

            /* access modifiers changed from: private */
            public final getFromSystem createLocalSocialPreferencesData() {
                return this.socialPreferencesDataFactory.createData("local");
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/SocialFeed;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
            static final class isInside<V> implements Callable<getScanCallbackIntent> {
                final /* synthetic */ RVGroup setMax;

                isInside(RVGroup rVGroup) {
                    this.setMax = rVGroup;
                }

                public final /* synthetic */ Object call() {
                    return this.setMax.createLocalSocialPreferencesData().getCachedTimeline();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
            static final class invokeSuspend<T> implements RedDotManager<BaseRpcResult> {
                final /* synthetic */ String getMax;
                final /* synthetic */ RVGroup getMin;
                final /* synthetic */ String setMax;
                final /* synthetic */ String setMin;

                invokeSuspend(RVGroup rVGroup, String str, String str2, String str3) {
                    this.getMin = rVGroup;
                    this.getMax = str;
                    this.setMin = str2;
                    this.setMax = str3;
                }

                public final /* synthetic */ void accept(Object obj) {
                    RVGroup rVGroup = this.getMin;
                    String str = this.getMax;
                    Intrinsics.checkNotNullExpressionValue(str, "phoneNumber");
                    TitleBarRightButtonView.AnonymousClass1 unused = rVGroup.cacheReportedCommentId(str, this.setMin, this.setMax);
                }
            }
        }
