package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.gson.annotations.SerializedName;
import id.dana.data.userconfig.BiztypeNotFoundException;
import id.dana.domain.social.ModifyRelationOperationType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.RVOpenAuthHelper;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0002\u0001Bo\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"H\u0002J\b\u0010'\u001a\u00020(H\u0002J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u001f2\u0006\u0010+\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0-2\u0006\u0010&\u001a\u00020\"2\u0006\u0010/\u001a\u00020\"H\u0002J\u000e\u00100\u001a\b\u0012\u0004\u0012\u0002010\u001fH\u0016J\u000e\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001fH\u0016J\u000e\u00104\u001a\b\u0012\u0004\u0012\u0002010\u001fH\u0016J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020706H\u0002J\b\u00108\u001a\u00020.H\u0016J\b\u00109\u001a\u00020:H\u0016J\u0012\u0010;\u001a\u00020<2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\b\u0010=\u001a\u00020:H\u0016J\b\u0010>\u001a\u00020?H\u0016J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020706H\u0002J\b\u0010A\u001a\u00020.H\u0016J\b\u0010B\u001a\u00020:H\u0016J\u0012\u0010C\u001a\u00020D2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\b\u0010E\u001a\u00020:H\u0016J\b\u0010F\u001a\u00020?H\u0016J\u000e\u0010G\u001a\b\u0012\u0004\u0012\u00020H06H\u0002J\u0016\u0010I\u001a\u00020J2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020M0LH\u0002J\u000e\u0010N\u001a\b\u0012\u0004\u0012\u0002030\u001fH\u0016J\u000e\u0010O\u001a\b\u0012\u0004\u0012\u00020H06H\u0002J\u0010\u0010P\u001a\u0002012\u0006\u0010Q\u001a\u00020:H\u0016J\u0010\u0010R\u001a\u0002012\u0006\u0010Q\u001a\u00020:H\u0016J\u0010\u0010S\u001a\u0002032\u0006\u0010Q\u001a\u00020:H\u0016J\u0010\u0010T\u001a\u0002032\u0006\u0010Q\u001a\u00020:H\u0016J\u0014\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0V0\u001fH\u0016J\u000e\u0010W\u001a\b\u0012\u0004\u0012\u0002030\u001fH\u0016J\u0016\u0010X\u001a\b\u0012\u0004\u0012\u00020<0\u001f2\u0006\u0010Y\u001a\u00020<H\u0002J&\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020[0-2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\\\u001a\u00020.H\u0002J\u001e\u0010]\u001a\b\u0012\u0004\u0012\u00020[0\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\\\u001a\u00020.H\u0016J&\u0010^\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020[0-2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\\\u001a\u00020.H\u0002J\u001e\u0010_\u001a\b\u0012\u0004\u0012\u00020[0\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\\\u001a\u00020.H\u0016J\b\u0010`\u001a\u00020.H\u0016J\u001e\u0010a\u001a\b\u0012\u0004\u0012\u00020.0\u001f2\u0006\u0010/\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"H\u0016J\u001e\u0010b\u001a\b\u0012\u0004\u0012\u00020.0\u001f2\u0006\u0010/\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"H\u0016J\u001e\u0010c\u001a\b\u0012\u0004\u0012\u00020.0\u001f2\u0006\u0010/\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"H\u0016J\u001e\u0010d\u001a\b\u0012\u0004\u0012\u00020.0\u001f2\u0006\u0010/\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"H\u0016JV\u0010e\u001a\b\u0012\u0004\u0012\u00020.0\u001f2\u0006\u0010/\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"26\u0010f\u001a2\u0012\u0013\u0012\u00110\"¢\u0006\f\bh\u0012\b\bi\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110\"¢\u0006\f\bh\u0012\b\bi\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020J0gH\u0002J\u000e\u0010j\u001a\b\u0012\u0004\u0012\u0002010\u001fH\u0016J\u000e\u0010k\u001a\b\u0012\u0004\u0012\u0002030\u001fH\u0016J\b\u0010l\u001a\u00020JH\u0002J\b\u0010m\u001a\u00020JH\u0002J\b\u0010n\u001a\u00020JH\u0002J\b\u0010o\u001a\u00020JH\u0002J\u0016\u0010p\u001a\b\u0012\u0004\u0012\u0002070\u001f2\u0006\u0010q\u001a\u000207H\u0002J\u0016\u0010r\u001a\b\u0012\u0004\u0012\u00020<0\u001f2\u0006\u0010Y\u001a\u00020<H\u0002J\b\u0010s\u001a\u00020JH\u0016J\u0018\u0010t\u001a\u00020J2\u0006\u0010/\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"H\u0002J\b\u0010u\u001a\u00020JH\u0016J\b\u0010v\u001a\u00020JH\u0016J\u0018\u0010w\u001a\u00020J2\u0006\u0010/\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"H\u0002J\b\u0010x\u001a\u00020JH\u0016J\u0010\u0010y\u001a\u00020J2\u0006\u0010z\u001a\u00020.H\u0016J\u001a\u0010{\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020}0|\u0012\u0004\u0012\u00020<0-H\u0002J\u001a\u0010~\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020}0|\u0012\u0004\u0012\u00020D0-H\u0002J\u0013\u0010\u001a\u00020J*\t\u0012\u0005\u0012\u00030\u00010VH\u0002J\u001e\u0010\u0001\u001a\u00020J*\t\u0012\u0005\u0012\u00030\u00010V2\b\b\u0002\u0010\\\u001a\u00020.H\u0002R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lid/dana/data/social/repository/SocialGeneralEntityRepository;", "Lid/dana/data/base/AuthenticatedEntityRepository;", "Lid/dana/domain/social/SocialGeneralRepository;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "loginEntityDataFactory", "Lid/dana/data/login/source/LoginEntityDataFactory;", "guardFacade", "Lid/dana/data/foundation/facade/SecurityGuardFacade;", "errorConfigFactory", "Lid/dana/data/errorconfig/ErrorConfigFactory;", "persistenceRelationshipEntityData", "Lid/dana/data/social/repository/source/persistence/PersistenceRelationshipEntityData;", "networkRelationshipEntityData", "Lid/dana/data/social/repository/source/network/NetworkRelationshipEntityData;", "socialPreferences", "Lid/dana/data/social/repository/source/local/SocialPreferences;", "userConfigRepository", "Lid/dana/data/userconfig/repository/UserConfigEntityRepository;", "amcsConfig", "Lid/dana/data/config/source/amcs/AmcsConfigEntityData;", "contactDeviceNameMapper", "Lid/dana/data/social/extension/ContactDeviceNameMapper;", "socialMediaDataFactory", "Lid/dana/data/social/repository/SocialMediaDataFactory;", "serializer", "Lid/dana/data/storage/Serializer;", "context", "Landroid/content/Context;", "(Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/login/source/LoginEntityDataFactory;Lid/dana/data/foundation/facade/SecurityGuardFacade;Lid/dana/data/errorconfig/ErrorConfigFactory;Lid/dana/data/social/repository/source/persistence/PersistenceRelationshipEntityData;Lid/dana/data/social/repository/source/network/NetworkRelationshipEntityData;Lid/dana/data/social/repository/source/local/SocialPreferences;Lid/dana/data/userconfig/repository/UserConfigEntityRepository;Lid/dana/data/config/source/amcs/AmcsConfigEntityData;Lid/dana/data/social/extension/ContactDeviceNameMapper;Lid/dana/data/social/repository/SocialMediaDataFactory;Lid/dana/data/storage/Serializer;Landroid/content/Context;)V", "addActivityReaction", "Lio/reactivex/Observable;", "Lid/dana/domain/social/model/ReactionResult;", "userId", "", "activityId", "kind", "checkShouldSaveActiveOrInactive", "operationType", "createSocialMediaData", "Lid/dana/data/social/repository/SocialMediaData;", "deleteActivityReaction", "Lid/dana/domain/social/model/DeleteReactionResult;", "reactionId", "doSecondaryOperationAfterFirstOperation", "Lkotlin/Function1;", "", "targetUserId", "getActiveFollower", "Lid/dana/domain/social/model/Follower;", "getActiveFollowing", "Lid/dana/domain/social/model/Following;", "getBlockedFollower", "getBlockedFollowerData", "Lio/reactivex/subjects/BehaviorSubject;", "Lid/dana/data/social/repository/source/persistence/entity/FollowerEntity;", "getFollowerFullSyncFinished", "getFollowerFullSyncLastPage", "", "getFollowerItemEntity", "Lid/dana/data/social/repository/source/persistence/entity/FollowerItemEntity;", "getFollowerPartialSyncLastPage", "getFollowerPartialSyncModifiedTime", "", "getFollowerPublishSubject", "getFollowingFullSyncFinished", "getFollowingFullSyncLastPage", "getFollowingItemEntity", "Lid/dana/data/social/repository/source/persistence/entity/FollowingItemEntity;", "getFollowingPartialSyncLastPage", "getFollowingPartialSyncModifiedTime", "getFollowingPublishSubject", "Lid/dana/data/social/repository/source/persistence/entity/FollowingEntity;", "getLocalReactionList", "", "sortedEmoji", "", "Lid/dana/domain/social/model/Reaction;", "getMutedFollowing", "getMutedFollowingData", "getNextFollowerFullSync", "page", "getNextFollowerPartialSync", "getNextFollowingFullSync", "getNextFollowingPartialSync", "getReactions", "", "getReciprocalFriend", "getReplaceMaskedFollowerNicknameObservable", "follower", "getSelectedFollowerIfStatusEmpty", "Lid/dana/domain/social/model/RelationshipItem;", "maskUntilUsername", "getSelectedFollowerItem", "getSelectedFollowingIfStatusEmpty", "getSelectedFollowingItem", "getShareFeedConsent", "modifyFollowerRelationship", "modifyFollowerRelationshipWithPublishResult", "modifyFollowingRelationship", "modifyFollowingRelationshipWithPublishResult", "modifyRelationship", "saveModifiedRelationshipToLocalMethod", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "observeFollowerFullSyncStatus", "observeFollowingFullSyncStatus", "publishBlockedFollowersList", "publishFollowersList", "publishFollowingList", "publishMutedFollowingList", "replaceMaskedFollowerEntityNicknameIfReciprocal", "followerEntity", "replaceMaskedFollowerItemEntityNicknameIfReciprocalFor", "saveFollowerFullSyncFinished", "saveFollowerModifiedRelationship", "saveFollowerPartialSyncModifiedTime", "saveFollowingFullSyncFinished", "saveFollowingModifiedRelationship", "saveFollowingPartialSyncModifiedTime", "saveShareFeedConsent", "enable", "takeFollowerItemFromSecondSource", "", "", "takeFollowingItemFromSecondSource", "mapDeviceContactWithoutMasking", "Lid/dana/data/social/repository/source/persistence/entity/PhoneNumberToContactNameMappable;", "mapRelationshipEntityNickNameToLocalContact", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getApiLevelList extends setMinProgress implements getResponseCode {
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    @NotNull
    public static final String JSON_PATH_EMOJI_LIST = "json/amcs-emoji-list.json";
    @NotNull
    public static final String JSON_PATH_EMOJI_ORDER = "json/amcs-emoji-order.json";
    private final handleMessage amcsConfig;
    private final getPermissions contactDeviceNameMapper;
    private final Context context;
    private final setCtuExtInfo networkRelationshipEntityData;
    private final getSuccessScopes persistenceRelationshipEntityData;
    private final PluginInstallCallback serializer;
    private final setApiLevelStr socialMediaDataFactory;
    private final getCurrentLongitudeAndLatitude socialPreferences;
    private final getOrigin userConfigRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/Follower;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/social/repository/source/persistence/entity/FollowerEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<T, R> implements RedDotDrawable<setErrorScopes, getCycledScanner> {
        final /* synthetic */ getApiLevelList length;

        IsOverlapping(getApiLevelList getapilevellist) {
            this.length = getapilevellist;
        }

        public final /* synthetic */ Object apply(Object obj) {
            setErrorScopes seterrorscopes = (setErrorScopes) obj;
            Intrinsics.checkNotNullParameter(seterrorscopes, "it");
            getApiLevelList.mapRelationshipEntityNickNameToLocalContact$default(this.length, seterrorscopes.getFollowerList(), false, 1, (Object) null);
            getCycledScanner follower = checkSPJSApi.toFollower(seterrorscopes);
            Collection arrayList = new ArrayList();
            for (Object next : follower.getFollowerItemList()) {
                if (Intrinsics.areEqual((Object) ((processScanResult) next).getStatus(), (Object) "ACTIVE")) {
                    arrayList.add(next);
                }
            }
            follower.setFollowerItemList((List) arrayList);
            return follower;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/persistence/entity/FollowerEntity;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/social/repository/source/persistence/entity/FollowerItemEntity;", "apply", "id/dana/data/social/repository/SocialGeneralEntityRepository$replaceMaskedFollowerEntityNicknameIfReciprocal$1$1"}, k = 3, mv = {1, 4, 2})
    static final class asInterface<T, R> implements RedDotDrawable<AuthSkipResultModel, setErrorScopes> {
        final /* synthetic */ getApiLevelList getMin;
        final /* synthetic */ List length;
        final /* synthetic */ setErrorScopes setMax;

        asInterface(getApiLevelList getapilevellist, List list, setErrorScopes seterrorscopes) {
            this.getMin = getapilevellist;
            this.length = list;
            this.setMax = seterrorscopes;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((AuthSkipResultModel) obj, "it");
            return this.setMax;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "p1", "", "p2", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class b extends FunctionReferenceImpl implements Function2<String, String, Unit> {
        b(getApiLevelList getapilevellist) {
            super(2, getapilevellist, getApiLevelList.class, "saveFollowingModifiedRelationship", "saveFollowingModifiedRelationship(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, (String) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "p1");
            Intrinsics.checkNotNullParameter(str2, "p2");
            ((getApiLevelList) this.receiver).saveFollowingModifiedRelationship(str, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/Following;", "kotlin.jvm.PlatformType", "following", "Lid/dana/data/social/repository/source/persistence/entity/FollowingEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class equals<T, R> implements RedDotDrawable<setAuthExecuteResult, ScanHelper> {
        public static final equals length = new equals();

        equals() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            setAuthExecuteResult setauthexecuteresult = (setAuthExecuteResult) obj;
            Intrinsics.checkNotNullParameter(setauthexecuteresult, "following");
            ScanHelper following = interceptUrlForTiny.toFollowing(setauthexecuteresult);
            Collection arrayList = new ArrayList();
            for (Object next : following.getFollowingItemList()) {
                if (Intrinsics.areEqual((Object) ((processScanResult) next).getStatus(), (Object) "MUTE")) {
                    arrayList.add(next);
                }
            }
            following.setFollowingItemList((List) arrayList);
            return following;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/Follower;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/social/repository/source/persistence/entity/FollowerEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class extraCallbackWithResult<T, R> implements RedDotDrawable<setErrorScopes, getCycledScanner> {
        public static final extraCallbackWithResult setMin = new extraCallbackWithResult();

        extraCallbackWithResult() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            setErrorScopes seterrorscopes = (setErrorScopes) obj;
            Intrinsics.checkNotNullParameter(seterrorscopes, "it");
            return checkSPJSApi.toFollower(seterrorscopes);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/DeleteReactionResult;", "kotlin.jvm.PlatformType", "it", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<BaseRpcResult, RunningAverageRssiFilter> {
        public static final getMin length = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            BaseRpcResult baseRpcResult = (BaseRpcResult) obj;
            Intrinsics.checkNotNullParameter(baseRpcResult, "it");
            String str = baseRpcResult.errorMessage;
            Intrinsics.checkNotNullExpressionValue(str, "it.errorMessage");
            return new RunningAverageRssiFilter(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/social/repository/source/persistence/entity/FollowerItemEntity;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class hashCode<T, R> implements RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<? extends AuthSkipResultModel>> {
        final /* synthetic */ AuthSkipResultModel length;

        hashCode(AuthSkipResultModel authSkipResultModel) {
            this.length = authSkipResultModel;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "<anonymous parameter 0>");
            return TitleBarRightButtonView.AnonymousClass1.just(this.length);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/Follower;", "kotlin.jvm.PlatformType", "follower", "Lid/dana/data/social/repository/source/persistence/entity/FollowerEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class isInside<T, R> implements RedDotDrawable<setErrorScopes, getCycledScanner> {
        public static final isInside setMax = new isInside();

        isInside() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            setErrorScopes seterrorscopes = (setErrorScopes) obj;
            Intrinsics.checkNotNullParameter(seterrorscopes, "follower");
            getCycledScanner follower = checkSPJSApi.toFollower(seterrorscopes);
            Collection arrayList = new ArrayList();
            for (Object next : follower.getFollowerItemList()) {
                if (Intrinsics.areEqual((Object) ((processScanResult) next).getStatus(), (Object) "BLOCKING")) {
                    arrayList.add(next);
                }
            }
            follower.setFollowerItemList((List) arrayList);
            return follower;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "modifyRelationshipResult", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "apply", "(Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class onMessageChannelReady<T, R> implements RedDotDrawable<BaseRpcResult, Boolean> {
        final /* synthetic */ getApiLevelList getMax;
        final /* synthetic */ String getMin;
        final /* synthetic */ String length;
        final /* synthetic */ Function2 setMin;

        onMessageChannelReady(getApiLevelList getapilevellist, Function2 function2, String str, String str2) {
            this.getMax = getapilevellist;
            this.setMin = function2;
            this.length = str;
            this.getMin = str2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            BaseRpcResult baseRpcResult = (BaseRpcResult) obj;
            Intrinsics.checkNotNullParameter(baseRpcResult, "modifyRelationshipResult");
            if (baseRpcResult.success) {
                this.setMin.invoke(this.length, this.getMax.checkShouldSaveActiveOrInactive(this.getMin));
            }
            return Boolean.valueOf(baseRpcResult.success);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/Following;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/social/repository/source/persistence/entity/FollowingEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class onRelationshipValidationResult<T, R> implements RedDotDrawable<setAuthExecuteResult, ScanHelper> {
        public static final onRelationshipValidationResult getMin = new onRelationshipValidationResult();

        onRelationshipValidationResult() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            setAuthExecuteResult setauthexecuteresult = (setAuthExecuteResult) obj;
            Intrinsics.checkNotNullParameter(setauthexecuteresult, "it");
            return interceptUrlForTiny.toFollowing(setauthexecuteresult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/ReactionResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/social/repository/source/network/response/AddActivityReactionResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<setAppLogoLink, createCycledLeScanner> {
        public static final setMax getMax = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            setAppLogoLink setapplogolink = (setAppLogoLink) obj;
            Intrinsics.checkNotNullParameter(setapplogolink, "it");
            return new createCycledLeScanner(setapplogolink.getUserId(), setapplogolink.getActivityId(), setapplogolink.getKind());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "success", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Boolean, Boolean> {
        final /* synthetic */ String $operationType;
        final /* synthetic */ String $targetUserId;
        final /* synthetic */ getApiLevelList this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(getApiLevelList getapilevellist, String str, String str2) {
            super(1);
            this.this$0 = getapilevellist;
            this.$operationType = str;
            this.$targetUserId = str2;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke(((Boolean) obj).booleanValue()));
        }

        public final boolean invoke(boolean z) {
            if (z) {
                if (this.$operationType.length() > 0) {
                    getApiLevelList getapilevellist = this.this$0;
                    getapilevellist.saveFollowingModifiedRelationship(this.$targetUserId, getapilevellist.checkShouldSaveActiveOrInactive(this.$operationType));
                    this.this$0.publishFollowingList();
                }
            }
            return z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/persistence/entity/FollowerItemEntity;", "kotlin.jvm.PlatformType", "following", "Lid/dana/data/social/repository/source/persistence/entity/FollowingItemEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange<T, R> implements RedDotDrawable<setShowType, AuthSkipResultModel> {
        final /* synthetic */ AuthSkipResultModel setMin;

        toDoubleRange(AuthSkipResultModel authSkipResultModel) {
            this.setMin = authSkipResultModel;
        }

        public final /* synthetic */ Object apply(Object obj) {
            setShowType setshowtype = (setShowType) obj;
            Intrinsics.checkNotNullParameter(setshowtype, "following");
            this.setMin.setNickName(setshowtype.getNickName());
            return this.setMin;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/Following;", "kotlin.jvm.PlatformType", "following", "Lid/dana/data/social/repository/source/persistence/entity/FollowingEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<T, R> implements RedDotDrawable<setAuthExecuteResult, ScanHelper> {
        public static final toFloatRange setMin = new toFloatRange();

        toFloatRange() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            setAuthExecuteResult setauthexecuteresult = (setAuthExecuteResult) obj;
            Intrinsics.checkNotNullParameter(setauthexecuteresult, "following");
            ScanHelper following = interceptUrlForTiny.toFollowing(setauthexecuteresult);
            Collection arrayList = new ArrayList();
            for (Object next : following.getFollowingItemList()) {
                if (Intrinsics.areEqual((Object) ((processScanResult) next).getStatus(), (Object) "ACTIVE")) {
                    arrayList.add(next);
                }
            }
            following.setFollowingItemList((List) arrayList);
            return following;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lid/dana/domain/social/model/Reaction;", "kotlin.jvm.PlatformType", "it", "Lorg/json/JSONObject;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<T, R> implements RedDotDrawable<JSONObject, List<? extends startAndroidOBackgroundScan>> {
        final /* synthetic */ getApiLevelList setMax;

        toIntRange(getApiLevelList getapilevellist) {
            this.setMax = getapilevellist;
        }

        public final /* synthetic */ Object apply(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            JSONObject jSONObject2 = jSONObject.getJSONObject("friendship_emoji_list");
            JSONArray jSONArray = jSONObject.getJSONArray("friendship_emoji_order");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "it.getJSONArray(\n       …E_FRIENDSHIP_EMOJI_ORDER)");
            List arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj2 = jSONArray.get(i);
                String obj3 = obj2.toString();
                String string = jSONObject2.getString(obj2.toString());
                if (string == null) {
                    string = "";
                }
                arrayList.add(new startAndroidOBackgroundScan(obj3, string));
            }
            if (arrayList.isEmpty()) {
                this.setMax.getLocalReactionList(arrayList);
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/Following;", "kotlin.jvm.PlatformType", "following", "Lid/dana/data/social/repository/source/persistence/entity/FollowingEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toString<T, R> implements RedDotDrawable<setAuthExecuteResult, ScanHelper> {
        public static final toString getMin = new toString();

        toString() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            setAuthExecuteResult setauthexecuteresult = (setAuthExecuteResult) obj;
            Intrinsics.checkNotNullParameter(setauthexecuteresult, "following");
            ScanHelper following = interceptUrlForTiny.toFollowing(setauthexecuteresult);
            Collection arrayList = new ArrayList();
            for (Object next : following.getFollowingItemList()) {
                processScanResult processscanresult = (processScanResult) next;
                if (Intrinsics.areEqual((Object) processscanresult.getStatus(), (Object) "ACTIVE") || Intrinsics.areEqual((Object) processscanresult.getStatus(), (Object) "MUTE")) {
                    arrayList.add(next);
                }
            }
            following.setFollowingItemList((List) arrayList);
            return following;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "p1", "", "p2", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class valueOf extends FunctionReferenceImpl implements Function2<String, String, Unit> {
        valueOf(getApiLevelList getapilevellist) {
            super(2, getapilevellist, getApiLevelList.class, "saveFollowerModifiedRelationship", "saveFollowerModifiedRelationship(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, (String) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "p1");
            Intrinsics.checkNotNullParameter(str2, "p2");
            ((getApiLevelList) this.receiver).saveFollowerModifiedRelationship(str, str2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getApiLevelList(@NotNull DialogLayout dialogLayout, @NotNull b.AnonymousClass3 r3, @NotNull BackKeyDownPoint backKeyDownPoint, @NotNull getAppLaunchParams getapplaunchparams, @NotNull getSuccessScopes getsuccessscopes, @NotNull setCtuExtInfo setctuextinfo, @NotNull getCurrentLongitudeAndLatitude getcurrentlongitudeandlatitude, @NotNull getOrigin getorigin, @NotNull handleMessage handlemessage, @NotNull getPermissions getpermissions, @NotNull setApiLevelStr setapilevelstr, @NotNull PluginInstallCallback pluginInstallCallback, @NotNull Context context2) {
        super(dialogLayout, r3, backKeyDownPoint, getapplaunchparams);
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(r3, "loginEntityDataFactory");
        Intrinsics.checkNotNullParameter(backKeyDownPoint, "guardFacade");
        Intrinsics.checkNotNullParameter(getapplaunchparams, "errorConfigFactory");
        Intrinsics.checkNotNullParameter(getsuccessscopes, "persistenceRelationshipEntityData");
        Intrinsics.checkNotNullParameter(setctuextinfo, "networkRelationshipEntityData");
        Intrinsics.checkNotNullParameter(getcurrentlongitudeandlatitude, "socialPreferences");
        Intrinsics.checkNotNullParameter(getorigin, "userConfigRepository");
        Intrinsics.checkNotNullParameter(handlemessage, "amcsConfig");
        Intrinsics.checkNotNullParameter(getpermissions, "contactDeviceNameMapper");
        Intrinsics.checkNotNullParameter(setapilevelstr, "socialMediaDataFactory");
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        this.persistenceRelationshipEntityData = getsuccessscopes;
        this.networkRelationshipEntityData = setctuextinfo;
        this.socialPreferences = getcurrentlongitudeandlatitude;
        this.userConfigRepository = getorigin;
        this.amcsConfig = handlemessage;
        this.contactDeviceNameMapper = getpermissions;
        this.socialMediaDataFactory = setapilevelstr;
        this.serializer = pluginInstallCallback;
        this.context = context2;
    }

    public final boolean getFollowingFullSyncFinished() {
        return this.socialPreferences.getFollowingFullSyncFinished();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<ScanHelper> getMutedFollowing() {
        if (getFollowingFullSyncFinished()) {
            publishFollowingList();
        }
        publishMutedFollowingList();
        TitleBarRightButtonView.AnonymousClass1<R> map = getMutedFollowingData().map(equals.length);
        Intrinsics.checkNotNullExpressionValue(map, "getMutedFollowingData().…}\n            }\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<ScanHelper> getActiveFollowing() {
        if (getFollowingFullSyncFinished()) {
            publishFollowingList();
        }
        TitleBarRightButtonView.AnonymousClass1<R> map = getFollowingPublishSubject().map(toFloatRange.setMin);
        Intrinsics.checkNotNullExpressionValue(map, "getFollowingPublishSubje…}\n            }\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<ScanHelper> getReciprocalFriend() {
        if (getFollowingFullSyncFinished()) {
            publishFollowingList();
        }
        TitleBarRightButtonView.AnonymousClass1<R> map = getFollowingPublishSubject().map(toString.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "getFollowingPublishSubje…}\n            }\n        }");
        return map;
    }

    private final void publishMutedFollowingList() {
        removeString<setAuthExecuteResult> mutedFollowingData = getMutedFollowingData();
        setAuthExecuteResult blockingSingle = this.persistenceRelationshipEntityData.getFollowingItemList(0).blockingSingle();
        mapDeviceContactWithoutMasking(blockingSingle.getFollowingList());
        Unit unit = Unit.INSTANCE;
        mutedFollowingData.onNext(blockingSingle);
    }

    private final removeString<setAuthExecuteResult> getMutedFollowingData() {
        return this.persistenceRelationshipEntityData.getMutedFollowingPublishSubject();
    }

    @NotNull
    public final ScanHelper getNextFollowingFullSync(int i) {
        getIsvAgentDesc followingItemList$default = getAppExtInfo.getFollowingItemList$default(this.networkRelationshipEntityData, Integer.valueOf(i), (String) null, 2, (Object) null);
        this.persistenceRelationshipEntityData.saveFollowingItemList(isAlipayDomains.toFollowingItemEntityList(followingItemList$default.getFollowingList()));
        this.socialPreferences.setFollowingFullSyncLastPage(followingItemList$default.getPaginator().getPage());
        return isRpcDomains.toFollowing(followingItemList$default);
    }

    @NotNull
    public final ScanHelper getNextFollowingPartialSync(int i) {
        getIsvAgentDesc followingItemListByModifiedTime = this.networkRelationshipEntityData.getFollowingItemListByModifiedTime(this.socialPreferences.getFollowingPartialSyncModifiedTime(), i);
        this.persistenceRelationshipEntityData.saveFollowingItemList(isAlipayDomains.toFollowingItemEntityList(followingItemListByModifiedTime.getFollowingList()));
        this.socialPreferences.setFollowingPartialSyncLastPage(followingItemListByModifiedTime.getPaginator().getPage());
        return isRpcDomains.toFollowing(followingItemListByModifiedTime);
    }

    public final void saveFollowingPartialSyncModifiedTime() {
        this.socialPreferences.setFollowingPartialSyncModifiedTime(System.currentTimeMillis());
    }

    public final long getFollowingPartialSyncModifiedTime() {
        return this.socialPreferences.getFollowingPartialSyncModifiedTime();
    }

    public final void saveFollowingFullSyncFinished() {
        getCurrentLongitudeAndLatitude getcurrentlongitudeandlatitude = this.socialPreferences;
        getcurrentlongitudeandlatitude.setFollowingFullSyncFinished(true);
        getcurrentlongitudeandlatitude.setFollowingPartialSyncModifiedTime(System.currentTimeMillis());
        publishFollowingList();
    }

    public final int getFollowingFullSyncLastPage() {
        return this.socialPreferences.getFollowingFullSyncLastPage();
    }

    public final int getFollowingPartialSyncLastPage() {
        return this.socialPreferences.getFollowingPartialSyncLastPage();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<ScanHelper> observeFollowingFullSyncStatus() {
        if (getFollowingFullSyncFinished()) {
            publishFollowingList();
        }
        TitleBarRightButtonView.AnonymousClass1<R> map = getFollowingPublishSubject().map(onRelationshipValidationResult.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "getFollowingPublishSubje…t.toFollowing()\n        }");
        return map;
    }

    /* access modifiers changed from: private */
    public final void publishFollowingList() {
        removeString<setAuthExecuteResult> followingPublishSubject = getFollowingPublishSubject();
        setAuthExecuteResult blockingSingle = this.persistenceRelationshipEntityData.getFollowingItemList(0).blockingSingle();
        mapDeviceContactWithoutMasking(blockingSingle.getFollowingList());
        Unit unit = Unit.INSTANCE;
        followingPublishSubject.onNext(blockingSingle);
    }

    private final removeString<setAuthExecuteResult> getFollowingPublishSubject() {
        return this.persistenceRelationshipEntityData.getFollowingPublishSubject();
    }

    public final int getFollowerPartialSyncLastPage() {
        return this.socialPreferences.getFollowerPartialSyncLastPage();
    }

    public final int getFollowerFullSyncLastPage() {
        return this.socialPreferences.getFollowerFullSyncLastPage();
    }

    @NotNull
    public final getCycledScanner getNextFollowerFullSync(int i) {
        getIsvAgent blockingSingle = this.networkRelationshipEntityData.getFollowerItemList(i).blockingSingle();
        this.persistenceRelationshipEntityData.saveFollowerItemList(checkShowPermissionDialog.toFollowerItemEntityList(blockingSingle.getFollowerList()));
        this.socialPreferences.setFollowerFullSyncLastPage(blockingSingle.getPaginator().getPage());
        return onPositive.toFollower(blockingSingle);
    }

    public final void saveFollowerFullSyncFinished() {
        getCurrentLongitudeAndLatitude getcurrentlongitudeandlatitude = this.socialPreferences;
        getcurrentlongitudeandlatitude.setFollowerFullSyncFinished(true);
        getcurrentlongitudeandlatitude.setFollowerPartialSyncModifiedTime(System.currentTimeMillis());
        publishFollowersList();
    }

    public final long getFollowerPartialSyncModifiedTime() {
        return this.socialPreferences.getFollowerPartialSyncModifiedTime();
    }

    public final void saveFollowerPartialSyncModifiedTime() {
        this.socialPreferences.setFollowerPartialSyncModifiedTime(System.currentTimeMillis());
    }

    @NotNull
    public final getCycledScanner getNextFollowerPartialSync(int i) {
        getIsvAgent blockingSingle = this.networkRelationshipEntityData.getFollowerItemListByModifiedTime(this.socialPreferences.getFollowerPartialSyncModifiedTime(), i).blockingSingle();
        this.persistenceRelationshipEntityData.saveFollowerItemList(checkShowPermissionDialog.toFollowerItemEntityList(blockingSingle.getFollowerList()));
        this.socialPreferences.setFollowerPartialSyncLastPage(blockingSingle.getPaginator().getPage());
        return onPositive.toFollower(blockingSingle);
    }

    public final boolean getFollowerFullSyncFinished() {
        return this.socialPreferences.getFollowerFullSyncFinished();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getCycledScanner> getBlockedFollower() {
        if (getFollowerFullSyncFinished()) {
            publishFollowersList();
        }
        publishBlockedFollowersList();
        TitleBarRightButtonView.AnonymousClass1<R> map = getBlockedFollowerData().map(isInside.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "getBlockedFollowerData()…}\n            }\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getCycledScanner> getActiveFollower() {
        if (getFollowerFullSyncFinished()) {
            publishFollowersList();
        }
        TitleBarRightButtonView.AnonymousClass1<R> map = getFollowerPublishSubject().flatMap(new setApiLevelList(new length(this))).map(new IsOverlapping(this));
        Intrinsics.checkNotNullExpressionValue(map, "getFollowerPublishSubjec…          }\n            }");
        return map;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lid/dana/data/social/repository/source/persistence/entity/FollowerEntity;", "p1", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class length extends FunctionReferenceImpl implements Function1<setErrorScopes, TitleBarRightButtonView.AnonymousClass1<setErrorScopes>> {
        length(getApiLevelList getapilevellist) {
            super(1, getapilevellist, getApiLevelList.class, "replaceMaskedFollowerEntityNicknameIfReciprocal", "replaceMaskedFollowerEntityNicknameIfReciprocal(Lid/dana/data/social/repository/source/persistence/entity/FollowerEntity;)Lio/reactivex/Observable;", 0);
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<setErrorScopes> invoke(@NotNull setErrorScopes seterrorscopes) {
            Intrinsics.checkNotNullParameter(seterrorscopes, "p1");
            return ((getApiLevelList) this.receiver).replaceMaskedFollowerEntityNicknameIfReciprocal(seterrorscopes);
        }
    }

    private final void publishBlockedFollowersList() {
        removeString<setErrorScopes> blockedFollowerData = getBlockedFollowerData();
        R blockingFirst = this.persistenceRelationshipEntityData.getFollowerItemList(0).flatMap(new setApiLevelList(new extraCallback(this))).blockingFirst();
        mapRelationshipEntityNickNameToLocalContact$default(this, ((setErrorScopes) blockingFirst).getFollowerList(), false, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        blockedFollowerData.onNext(blockingFirst);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lid/dana/data/social/repository/source/persistence/entity/FollowerEntity;", "p1", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class extraCallback extends FunctionReferenceImpl implements Function1<setErrorScopes, TitleBarRightButtonView.AnonymousClass1<setErrorScopes>> {
        extraCallback(getApiLevelList getapilevellist) {
            super(1, getapilevellist, getApiLevelList.class, "replaceMaskedFollowerEntityNicknameIfReciprocal", "replaceMaskedFollowerEntityNicknameIfReciprocal(Lid/dana/data/social/repository/source/persistence/entity/FollowerEntity;)Lio/reactivex/Observable;", 0);
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<setErrorScopes> invoke(@NotNull setErrorScopes seterrorscopes) {
            Intrinsics.checkNotNullParameter(seterrorscopes, "p1");
            return ((getApiLevelList) this.receiver).replaceMaskedFollowerEntityNicknameIfReciprocal(seterrorscopes);
        }
    }

    /* access modifiers changed from: private */
    public final TitleBarRightButtonView.AnonymousClass1<setErrorScopes> replaceMaskedFollowerEntityNicknameIfReciprocal(setErrorScopes seterrorscopes) {
        List arrayList = new ArrayList();
        for (AuthSkipResultModel replaceMaskedFollowerNicknameObservable : seterrorscopes.getFollowerList()) {
            TitleBarRightButtonView.AnonymousClass1<R> map = getReplaceMaskedFollowerNicknameObservable(replaceMaskedFollowerNicknameObservable).map(new asInterface(this, arrayList, seterrorscopes));
            Intrinsics.checkNotNullExpressionValue(map, "getReplaceMaskedFollower…rEntity\n                }");
            arrayList.add(map);
        }
        if (arrayList.isEmpty()) {
            TitleBarRightButtonView.AnonymousClass1<setErrorScopes> just = TitleBarRightButtonView.AnonymousClass1.just(seterrorscopes);
            Intrinsics.checkNotNullExpressionValue(just, "Observable.just(followerEntity)");
            return just;
        }
        Iterable iterable = arrayList;
        Intrinsics.checkParameterIsNotNull(iterable, "$this$merge");
        Intrinsics.checkParameterIsNotNull(iterable, "$this$toObservable");
        TitleBarRightButtonView.AnonymousClass1 fromIterable = TitleBarRightButtonView.AnonymousClass1.fromIterable(iterable);
        Intrinsics.checkExpressionValueIsNotNull(fromIterable, "Observable.fromIterable(this)");
        TitleBarRightButtonView.AnonymousClass1<setErrorScopes> merge = TitleBarRightButtonView.AnonymousClass1.merge(fromIterable);
        Intrinsics.checkExpressionValueIsNotNull(merge, "Observable.merge(this.toObservable())");
        return merge;
    }

    /* access modifiers changed from: private */
    public final TitleBarRightButtonView.AnonymousClass1<AuthSkipResultModel> replaceMaskedFollowerItemEntityNicknameIfReciprocalFor(AuthSkipResultModel authSkipResultModel) {
        return getReplaceMaskedFollowerNicknameObservable(authSkipResultModel);
    }

    private final TitleBarRightButtonView.AnonymousClass1<AuthSkipResultModel> getReplaceMaskedFollowerNicknameObservable(AuthSkipResultModel authSkipResultModel) {
        TitleBarRightButtonView.AnonymousClass1<R> onErrorResumeNext = this.persistenceRelationshipEntityData.getSelectedFollowingItem(authSkipResultModel.getUserId()).map(new toDoubleRange(authSkipResultModel)).onErrorResumeNext(new hashCode(authSkipResultModel));
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "persistenceRelationshipE…servable.just(follower) }");
        return onErrorResumeNext;
    }

    private final removeString<setErrorScopes> getBlockedFollowerData() {
        return this.persistenceRelationshipEntityData.getBlockedFollowerPublishSubject();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getCycledScanner> observeFollowerFullSyncStatus() {
        if (getFollowerFullSyncFinished()) {
            publishFollowersList();
        }
        TitleBarRightButtonView.AnonymousClass1<R> map = getFollowerPublishSubject().flatMap(new setApiLevelList(new onPostMessage(this))).map(extraCallbackWithResult.setMin);
        Intrinsics.checkNotNullExpressionValue(map, "getFollowerPublishSubjec…it.toFollower()\n        }");
        return map;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lid/dana/data/social/repository/source/persistence/entity/FollowerEntity;", "p1", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class onPostMessage extends FunctionReferenceImpl implements Function1<setErrorScopes, TitleBarRightButtonView.AnonymousClass1<setErrorScopes>> {
        onPostMessage(getApiLevelList getapilevellist) {
            super(1, getapilevellist, getApiLevelList.class, "replaceMaskedFollowerEntityNicknameIfReciprocal", "replaceMaskedFollowerEntityNicknameIfReciprocal(Lid/dana/data/social/repository/source/persistence/entity/FollowerEntity;)Lio/reactivex/Observable;", 0);
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<setErrorScopes> invoke(@NotNull setErrorScopes seterrorscopes) {
            Intrinsics.checkNotNullParameter(seterrorscopes, "p1");
            return ((getApiLevelList) this.receiver).replaceMaskedFollowerEntityNicknameIfReciprocal(seterrorscopes);
        }
    }

    /* access modifiers changed from: private */
    public final void publishFollowersList() {
        try {
            removeString<setErrorScopes> followerPublishSubject = getFollowerPublishSubject();
            setErrorScopes blockingFirst = this.persistenceRelationshipEntityData.getFollowerItemList(0).blockingFirst();
            mapRelationshipEntityNickNameToLocalContact$default(this, blockingFirst.getFollowerList(), false, 1, (Object) null);
            Unit unit = Unit.INSTANCE;
            followerPublishSubject.onNext(blockingFirst);
        } catch (Exception unused) {
        }
    }

    private final removeString<setErrorScopes> getFollowerPublishSubject() {
        return this.persistenceRelationshipEntityData.getFollowerPublishSubject();
    }

    public final boolean getShareFeedConsent() {
        try {
            return ((RVOpenAuthHelper.AnonymousClass2) this.userConfigRepository.getUserSpecificConfig(new getAuthContentOrAutoAuth()).blockingSingle()).getShareFeed();
        } catch (Exception e) {
            if (!(e.getCause() instanceof BiztypeNotFoundException)) {
                return false;
            }
            throw new BiztypeNotFoundException();
        }
    }

    public final void saveShareFeedConsent(boolean z) {
        this.userConfigRepository.saveUserSpecificConfigBackendFirst(new RVOpenAuthHelper.a(new Object(z) {
            @SerializedName("share_setting")
            private final boolean shareFeed;

            public static /* synthetic */ AnonymousClass2 copy$default(AnonymousClass2 r0, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = r0.shareFeed;
                }
                return r0.copy(z);
            }

            public final boolean component1() {
                return this.shareFeed;
            }

            @NotNull
            public final AnonymousClass2 copy(boolean z) {
                return 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0012: INVOKE  
                      (wrap: o.TitleBarRightButtonView$1<java.lang.Boolean> : 0x000e: INVOKE  (r4v1 o.TitleBarRightButtonView$1<java.lang.Boolean>) = 
                      (wrap: o.getOrigin : 0x0000: IGET  (r0v0 o.getOrigin) = (r3v0 'this' o.getApiLevelList A[THIS]) o.getApiLevelList.userConfigRepository o.getOrigin)
                      (wrap: o.RVOpenAuthHelper$a : 0x0009: CONSTRUCTOR  (r1v0 o.RVOpenAuthHelper$a) = 
                      (wrap: o.RVOpenAuthHelper$2 : 0x0006: CONSTRUCTOR  (r2v0 o.RVOpenAuthHelper$2) = (r4v0 'z' boolean) call: o.RVOpenAuthHelper.2.<init>(boolean):void type: CONSTRUCTOR)
                     call: o.RVOpenAuthHelper.a.<init>(o.RVOpenAuthHelper$2):void type: CONSTRUCTOR)
                     o.getOrigin.saveUserSpecificConfigBackendFirst(o.onConnectedSuccessful):o.TitleBarRightButtonView$1 type: VIRTUAL)
                     o.TitleBarRightButtonView.1.blockingSingle():java.lang.Object type: VIRTUAL in method: o.getApiLevelList.saveShareFeedConsent(boolean):void, dex: classes.dex
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
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000e: INVOKE  (r4v1 o.TitleBarRightButtonView$1<java.lang.Boolean>) = 
                      (wrap: o.getOrigin : 0x0000: IGET  (r0v0 o.getOrigin) = (r3v0 'this' o.getApiLevelList A[THIS]) o.getApiLevelList.userConfigRepository o.getOrigin)
                      (wrap: o.RVOpenAuthHelper$a : 0x0009: CONSTRUCTOR  (r1v0 o.RVOpenAuthHelper$a) = 
                      (wrap: o.RVOpenAuthHelper$2 : 0x0006: CONSTRUCTOR  (r2v0 o.RVOpenAuthHelper$2) = (r4v0 'z' boolean) call: o.RVOpenAuthHelper.2.<init>(boolean):void type: CONSTRUCTOR)
                     call: o.RVOpenAuthHelper.a.<init>(o.RVOpenAuthHelper$2):void type: CONSTRUCTOR)
                     o.getOrigin.saveUserSpecificConfigBackendFirst(o.onConnectedSuccessful):o.TitleBarRightButtonView$1 type: VIRTUAL in method: o.getApiLevelList.saveShareFeedConsent(boolean):void, dex: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 29 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: CONSTRUCTOR  (r1v0 o.RVOpenAuthHelper$a) = 
                      (wrap: o.RVOpenAuthHelper$2 : 0x0006: CONSTRUCTOR  (r2v0 o.RVOpenAuthHelper$2) = (r4v0 'z' boolean) call: o.RVOpenAuthHelper.2.<init>(boolean):void type: CONSTRUCTOR)
                     call: o.RVOpenAuthHelper.a.<init>(o.RVOpenAuthHelper$2):void type: CONSTRUCTOR in method: o.getApiLevelList.saveShareFeedConsent(boolean):void, dex: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	... 35 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r2v0 o.RVOpenAuthHelper$2) = (r4v0 'z' boolean) call: o.RVOpenAuthHelper.2.<init>(boolean):void type: CONSTRUCTOR in method: o.getApiLevelList.saveShareFeedConsent(boolean):void, dex: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	... 41 more
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
                    	... 47 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0005: RETURN  
                      (wrap: o.RVOpenAuthHelper$2 : 0x0002: CONSTRUCTOR  (r0v0 o.RVOpenAuthHelper$2) = (r2v0 'z' boolean) call: o.RVOpenAuthHelper.2.<init>(boolean):void type: CONSTRUCTOR)
                     in method: o.RVOpenAuthHelper.2.copy(boolean):o.RVOpenAuthHelper$2, dex: classes3.dex
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
                    	... 64 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 o.RVOpenAuthHelper$2) = (r2v0 'z' boolean) call: o.RVOpenAuthHelper.2.<init>(boolean):void type: CONSTRUCTOR in method: o.RVOpenAuthHelper.2.copy(boolean):o.RVOpenAuthHelper$2, dex: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 73 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: o.RVOpenAuthHelper.2
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:649)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	... 77 more
                    */
                /*
                    this = this;
                    o.getOrigin r0 = r3.userConfigRepository
                    o.RVOpenAuthHelper$a r1 = new o.RVOpenAuthHelper$a
                    o.RVOpenAuthHelper$2 r2 = new o.RVOpenAuthHelper$2
                    r2.<init>(r4)
                    r1.<init>(r2)
                    o.onConnectedSuccessful r1 = (o.onConnectedSuccessful) r1
                    o.TitleBarRightButtonView$1 r4 = r0.saveUserSpecificConfigBackendFirst(r1)
                    r4.blockingSingle()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getApiLevelList.saveShareFeedConsent(boolean):void");
            }

            /* JADX WARNING: type inference failed for: r4v2, types: [o.setApiLevelList] */
            /* JADX WARNING: Multi-variable type inference failed */
            @org.jetbrains.annotations.NotNull
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final o.TitleBarRightButtonView.AnonymousClass1<java.lang.Boolean> modifyFollowerRelationship(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
                /*
                    r2 = this;
                    java.lang.String r0 = "targetUserId"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    java.lang.String r0 = "operationType"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    o.getApiLevelList$valueOf r0 = new o.getApiLevelList$valueOf
                    r1 = r2
                    o.getApiLevelList r1 = (o.getApiLevelList) r1
                    r0.<init>(r1)
                    kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
                    o.TitleBarRightButtonView$1 r0 = r2.modifyRelationship(r3, r4, r0)
                    o.getApiLevelList$onNavigationEvent r1 = new o.getApiLevelList$onNavigationEvent
                    r1.<init>(r2)
                    o.RedDotManager r1 = (o.RedDotManager) r1
                    o.TitleBarRightButtonView$1 r0 = r0.doOnError(r1)
                    kotlin.jvm.functions.Function1 r3 = r2.doSecondaryOperationAfterFirstOperation(r4, r3)
                    if (r3 == 0) goto L_0x002f
                    o.setApiLevelList r4 = new o.setApiLevelList
                    r4.<init>(r3)
                    r3 = r4
                L_0x002f:
                    o.RedDotDrawable r3 = (o.RedDotDrawable) r3
                    o.TitleBarRightButtonView$1 r3 = r0.map(r3)
                    java.lang.String r4 = "modifyRelationship(targe…ationType, targetUserId))"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getApiLevelList.modifyFollowerRelationship(java.lang.String, java.lang.String):o.TitleBarRightButtonView$1");
            }

            private final Function1<Boolean, Boolean> doSecondaryOperationAfterFirstOperation(String str, String str2) {
                return new setMin(this, str, str2);
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<Boolean> modifyFollowerRelationshipWithPublishResult(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "targetUserId");
                Intrinsics.checkNotNullParameter(str2, "operationType");
                TitleBarRightButtonView.AnonymousClass1<Boolean> doOnNext = modifyFollowerRelationship(str, str2).doOnNext(new ICustomTabsCallback(this));
                Intrinsics.checkNotNullExpressionValue(doOnNext, "modifyFollowerRelationsh…FollowersList()\n        }");
                return doOnNext;
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<Boolean> modifyFollowingRelationship(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "targetUserId");
                Intrinsics.checkNotNullParameter(str2, "operationType");
                TitleBarRightButtonView.AnonymousClass1<Boolean> doOnError = modifyRelationship(str, str2, new b(this)).doOnError(new create(this));
                Intrinsics.checkNotNullExpressionValue(doOnError, "modifyRelationship(targe…FollowingList()\n        }");
                return doOnError;
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<Boolean> modifyFollowingRelationshipWithPublishResult(@NotNull String str, @NotNull String str2) {
                int length2 = str != null ? str.length() : 0;
                int max = dispatchOnCancelled.setMax(length2);
                if (length2 != max) {
                    onCanceled oncanceled = new onCanceled(length2, max, 1);
                    onCancelLoad.setMax(1247224355, oncanceled);
                    onCancelLoad.getMin(1247224355, oncanceled);
                }
                Intrinsics.checkNotNullParameter(str, "targetUserId");
                Intrinsics.checkNotNullParameter(str2, "operationType");
                TitleBarRightButtonView.AnonymousClass1<Boolean> doOnNext = modifyFollowingRelationship(str, str2).doOnNext(new getCause(this));
                Intrinsics.checkNotNullExpressionValue(doOnNext, "modifyFollowingRelations…FollowingList()\n        }");
                return doOnNext;
            }

            /* JADX WARNING: type inference failed for: r7v2, types: [o.setApiLevelList] */
            /* JADX WARNING: type inference failed for: r3v3, types: [o.setApiLevelList] */
            /* JADX WARNING: Multi-variable type inference failed */
            @org.jetbrains.annotations.NotNull
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final o.TitleBarRightButtonView.AnonymousClass1<o.processScanResult> getSelectedFollowingItem(@org.jetbrains.annotations.NotNull java.lang.String r6, boolean r7) {
                /*
                    r5 = this;
                    java.lang.String r0 = "userId"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                    o.getApiLevelList$invokeSuspend r0 = new o.getApiLevelList$invokeSuspend
                    r0.<init>(r5, r6)
                    java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
                    o.TitleBarRightButtonView$1 r0 = o.TitleBarRightButtonView.AnonymousClass1.fromCallable(r0)
                    o.getSuccessScopes r1 = r5.persistenceRelationshipEntityData
                    r2 = 2
                    o.TitleBarRightButtonView$1[] r2 = new o.TitleBarRightButtonView.AnonymousClass1[r2]
                    o.removeString r3 = r1.getFollowingPublishSubject()
                    o.TitleBarRightButtonView$1 r3 = (o.TitleBarRightButtonView.AnonymousClass1) r3
                    r4 = 0
                    r2[r4] = r3
                    o.TitleBarRightButtonView$1 r1 = r1.getSelectedFollowingItem(r6)
                    r3 = 1
                    r2[r3] = r1
                    java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r2)
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    kotlin.jvm.functions.Function1 r2 = r5.takeFollowingItemFromSecondSource()
                    if (r2 == 0) goto L_0x0038
                    o.setApiLevelList r3 = new o.setApiLevelList
                    r3.<init>(r2)
                    r2 = r3
                L_0x0038:
                    o.RedDotDrawable r2 = (o.RedDotDrawable) r2
                    o.TitleBarRightButtonView$1 r1 = o.TitleBarRightButtonView.AnonymousClass1.combineLatest(r1, r2)
                    o.TitleBarRightButtonView$4 r1 = (o.TitleBarRightButtonView.AnonymousClass4) r1
                    o.TitleBarRightButtonView$1 r0 = r0.onErrorResumeNext(r1)
                    o.getApiLevelList$Mean$Arithmetic r1 = new o.getApiLevelList$Mean$Arithmetic
                    r1.<init>(r5, r6)
                    o.RedDotDrawable r1 = (o.RedDotDrawable) r1
                    o.TitleBarRightButtonView$1 r0 = r0.onErrorReturn(r1)
                    kotlin.jvm.functions.Function1 r6 = r5.getSelectedFollowingIfStatusEmpty(r6, r7)
                    if (r6 == 0) goto L_0x005b
                    o.setApiLevelList r7 = new o.setApiLevelList
                    r7.<init>(r6)
                    r6 = r7
                L_0x005b:
                    o.RedDotDrawable r6 = (o.RedDotDrawable) r6
                    o.TitleBarRightButtonView$1 r6 = r0.map(r6)
                    java.lang.String r7 = "Observable.fromCallable …erId, maskUntilUsername))"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getApiLevelList.getSelectedFollowingItem(java.lang.String, boolean):o.TitleBarRightButtonView$1");
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/persistence/entity/FollowingItemEntity;", "it", "", "", "invoke", "([Ljava/lang/Object;)Lid/dana/data/social/repository/source/persistence/entity/FollowingItemEntity;"}, k = 3, mv = {1, 4, 2})
            static final class onTransact extends Lambda implements Function1<Object[], setShowType> {
                public static final onTransact INSTANCE = new onTransact();

                onTransact() {
                    super(1);
                }

                @NotNull
                public final setShowType invoke(@NotNull Object[] objArr) {
                    Intrinsics.checkNotNullParameter(objArr, "it");
                    setShowType setshowtype = objArr[1];
                    if (setshowtype != null) {
                        return setshowtype;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type id.dana.data.social.repository.source.persistence.entity.FollowingItemEntity");
                }
            }

            private final Function1<Object[], setShowType> takeFollowingItemFromSecondSource() {
                return onTransact.INSTANCE;
            }

            /* JADX WARNING: type inference failed for: r7v2, types: [o.setApiLevelList] */
            /* JADX WARNING: type inference failed for: r3v3, types: [o.setApiLevelList] */
            /* JADX WARNING: Multi-variable type inference failed */
            @org.jetbrains.annotations.NotNull
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final o.TitleBarRightButtonView.AnonymousClass1<o.processScanResult> getSelectedFollowerItem(@org.jetbrains.annotations.NotNull java.lang.String r6, boolean r7) {
                /*
                    r5 = this;
                    java.lang.String r0 = "userId"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                    o.getApiLevelList$values r0 = new o.getApiLevelList$values
                    r0.<init>(r5, r6)
                    java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
                    o.TitleBarRightButtonView$1 r0 = o.TitleBarRightButtonView.AnonymousClass1.fromCallable(r0)
                    o.getSuccessScopes r1 = r5.persistenceRelationshipEntityData
                    r2 = 2
                    o.TitleBarRightButtonView$1[] r2 = new o.TitleBarRightButtonView.AnonymousClass1[r2]
                    o.removeString r3 = r1.getFollowerPublishSubject()
                    o.TitleBarRightButtonView$1 r3 = (o.TitleBarRightButtonView.AnonymousClass1) r3
                    r4 = 0
                    r2[r4] = r3
                    o.TitleBarRightButtonView$1 r1 = r1.getSelectedFollowerItem(r6)
                    r3 = 1
                    r2[r3] = r1
                    java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r2)
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    kotlin.jvm.functions.Function1 r2 = r5.takeFollowerItemFromSecondSource()
                    if (r2 == 0) goto L_0x0038
                    o.setApiLevelList r3 = new o.setApiLevelList
                    r3.<init>(r2)
                    r2 = r3
                L_0x0038:
                    o.RedDotDrawable r2 = (o.RedDotDrawable) r2
                    o.TitleBarRightButtonView$1 r1 = o.TitleBarRightButtonView.AnonymousClass1.combineLatest(r1, r2)
                    o.TitleBarRightButtonView$4 r1 = (o.TitleBarRightButtonView.AnonymousClass4) r1
                    o.TitleBarRightButtonView$1 r0 = r0.onErrorResumeNext(r1)
                    o.getApiLevelList$invoke r1 = new o.getApiLevelList$invoke
                    r2 = r5
                    o.getApiLevelList r2 = (o.getApiLevelList) r2
                    r1.<init>(r2)
                    kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                    o.setApiLevelList r2 = new o.setApiLevelList
                    r2.<init>(r1)
                    o.RedDotDrawable r2 = (o.RedDotDrawable) r2
                    o.TitleBarRightButtonView$1 r0 = r0.flatMap(r2)
                    kotlin.jvm.functions.Function1 r6 = r5.getSelectedFollowerIfStatusEmpty(r6, r7)
                    if (r6 == 0) goto L_0x0065
                    o.setApiLevelList r7 = new o.setApiLevelList
                    r7.<init>(r6)
                    r6 = r7
                L_0x0065:
                    o.RedDotDrawable r6 = (o.RedDotDrawable) r6
                    o.TitleBarRightButtonView$1 r6 = r0.map(r6)
                    java.lang.String r7 = "Observable.fromCallable …erId, maskUntilUsername))"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getApiLevelList.getSelectedFollowerItem(java.lang.String, boolean):o.TitleBarRightButtonView$1");
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lid/dana/data/social/repository/source/persistence/entity/FollowerItemEntity;", "p1", "invoke"}, k = 3, mv = {1, 4, 2})
            static final /* synthetic */ class invoke extends FunctionReferenceImpl implements Function1<AuthSkipResultModel, TitleBarRightButtonView.AnonymousClass1<AuthSkipResultModel>> {
                invoke(getApiLevelList getapilevellist) {
                    super(1, getapilevellist, getApiLevelList.class, "replaceMaskedFollowerItemEntityNicknameIfReciprocalFor", "replaceMaskedFollowerItemEntityNicknameIfReciprocalFor(Lid/dana/data/social/repository/source/persistence/entity/FollowerItemEntity;)Lio/reactivex/Observable;", 0);
                }

                @NotNull
                public final TitleBarRightButtonView.AnonymousClass1<AuthSkipResultModel> invoke(@NotNull AuthSkipResultModel authSkipResultModel) {
                    Intrinsics.checkNotNullParameter(authSkipResultModel, "p1");
                    return ((getApiLevelList) this.receiver).replaceMaskedFollowerItemEntityNicknameIfReciprocalFor(authSkipResultModel);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 2})
            static final class ICustomTabsCallback<T> implements RedDotManager<Boolean> {
                final /* synthetic */ getApiLevelList length;

                ICustomTabsCallback(getApiLevelList getapilevellist) {
                    this.length = getapilevellist;
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/persistence/entity/FollowerItemEntity;", "it", "", "", "invoke", "([Ljava/lang/Object;)Lid/dana/data/social/repository/source/persistence/entity/FollowerItemEntity;"}, k = 3, mv = {1, 4, 2})
                static final class Default extends Lambda implements Function1<Object[], AuthSkipResultModel> {
                    public static final Default INSTANCE = new Default();

                    Default() {
                        super(1);
                    }

                    @NotNull
                    public final AuthSkipResultModel invoke(@NotNull Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "it");
                        AuthSkipResultModel authSkipResultModel = objArr[1];
                        if (authSkipResultModel != null) {
                            return authSkipResultModel;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type id.dana.data.social.repository.source.persistence.entity.FollowerItemEntity");
                    }
                }

                public final /* synthetic */ void accept(Object obj) {
                    this.length.publishFollowersList();
                }
            }

            private final Function1<Object[], AuthSkipResultModel> takeFollowerItemFromSecondSource() {
                return ICustomTabsCallback.Default.INSTANCE;
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<List<startAndroidOBackgroundScan>> getReactions() {
                TitleBarRightButtonView.AnonymousClass1<R> map = this.amcsConfig.getFriendshipEmojiList().map(new toIntRange(this));
                Intrinsics.checkNotNullExpressionValue(map, "amcsConfig.friendshipEmo…    sortedEmoji\n        }");
                return map;
            }

            /* access modifiers changed from: private */
            public final void getLocalReactionList(List<startAndroidOBackgroundScan> list) {
                String loadJSONFromAsset = getPositiveString.loadJSONFromAsset(this.context, JSON_PATH_EMOJI_LIST);
                String loadJSONFromAsset2 = getPositiveString.loadJSONFromAsset(this.context, JSON_PATH_EMOJI_ORDER);
                Map<String, String> deserializeMap = this.serializer.deserializeMap(loadJSONFromAsset);
                List<String> deserializeList = this.serializer.deserializeList(loadJSONFromAsset2);
                Intrinsics.checkNotNullExpressionValue(deserializeList, "emojiOrderMap");
                for (String str : deserializeList) {
                    String obj = str.toString();
                    String str2 = deserializeMap.get(str.toString());
                    if (str2 == null) {
                        str2 = "";
                    }
                    list.add(new startAndroidOBackgroundScan(obj, str2));
                }
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<createCycledLeScanner> addActivityReaction(@Nullable String str, @NotNull String str2, @NotNull String str3) {
                Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
                Intrinsics.checkNotNullParameter(str3, "kind");
                TitleBarRightButtonView.AnonymousClass1<R> map = createSocialMediaData().addActivityReaction(str, str2, str3).map(setMax.getMax);
                Intrinsics.checkNotNullExpressionValue(map, "createSocialMediaData().…it.activityId, it.kind) }");
                return map;
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<RunningAverageRssiFilter> deleteActivityReaction(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_REACTION_ID);
                Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
                TitleBarRightButtonView.AnonymousClass1<R> map = createSocialMediaData().deleteActivityReaction(str, str2).map(getMin.length);
                Intrinsics.checkNotNullExpressionValue(map, "createSocialMediaData().…Result(it.errorMessage) }");
                return map;
            }

            private final Function1<setShowType, processScanResult> getSelectedFollowingIfStatusEmpty(String str, boolean z) {
                return new getApiLevelList$Grayscale$Algorithm(this, str, z);
            }

            static /* synthetic */ Function1 getSelectedFollowingIfStatusEmpty$default(getApiLevelList getapilevellist, String str, boolean z, int i, Object obj) {
                if ((i & 2) != 0) {
                    z = true;
                }
                return getapilevellist.getSelectedFollowingIfStatusEmpty(str, z);
            }

            /* access modifiers changed from: private */
            public final setShowType getFollowingItemEntity(String str) {
                List<setShowType> followingItemEntityList = isAlipayDomains.toFollowingItemEntityList(this.networkRelationshipEntityData.getFollowingItemList(1, str).getFollowingList());
                this.persistenceRelationshipEntityData.saveFollowingItemList(followingItemEntityList);
                return followingItemEntityList.get(0);
            }

            /* access modifiers changed from: private */
            public final AuthSkipResultModel getFollowerItemEntity(String str) {
                List<AuthSkipResultModel> followerItemEntityList = checkShowPermissionDialog.toFollowerItemEntityList(this.networkRelationshipEntityData.getFollowerItemList(1, str).getFollowerList());
                this.persistenceRelationshipEntityData.saveFollowerItemList(followerItemEntityList);
                return followerItemEntityList.get(0);
            }

            private final Function1<AuthSkipResultModel, processScanResult> getSelectedFollowerIfStatusEmpty(String str, boolean z) {
                return new getApiLevelList$FastBitmap$CoordinateSystem(this, str, z);
            }

            static /* synthetic */ Function1 getSelectedFollowerIfStatusEmpty$default(getApiLevelList getapilevellist, String str, boolean z, int i, Object obj) {
                if ((i & 2) != 0) {
                    z = true;
                }
                return getapilevellist.getSelectedFollowerIfStatusEmpty(str, z);
            }

            private final TitleBarRightButtonView.AnonymousClass1<Boolean> modifyRelationship(String str, String str2, Function2<? super String, ? super String, Unit> function2) {
                int length2 = str != null ? str.length() : 0;
                int max = dispatchOnCancelled.setMax(length2);
                if (length2 != max) {
                    onCanceled oncanceled = new onCanceled(length2, max, 1);
                    onCancelLoad.setMax(185554081, oncanceled);
                    onCancelLoad.getMin(185554081, oncanceled);
                }
                TitleBarRightButtonView.AnonymousClass1<R> map = this.networkRelationshipEntityData.modifyRelationship(str, str2).map(new onMessageChannelReady(this, function2, str, str2));
                Intrinsics.checkNotNullExpressionValue(map, "networkRelationshipEntit…pResult.success\n        }");
                return map;
            }

            /* access modifiers changed from: private */
            public final void saveFollowerModifiedRelationship(String str, String str2) {
                this.persistenceRelationshipEntityData.saveFollowerModifiedRelationship(str, str2);
            }

            /* access modifiers changed from: private */
            public final void saveFollowingModifiedRelationship(String str, String str2) {
                this.persistenceRelationshipEntityData.saveFollowingModifiedRelationship(str, str2);
            }

            static /* synthetic */ void mapRelationshipEntityNickNameToLocalContact$default(getApiLevelList getapilevellist, List list, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = true;
                }
                getapilevellist.mapRelationshipEntityNickNameToLocalContact(list, z);
            }

            /* access modifiers changed from: private */
            public final void mapRelationshipEntityNickNameToLocalContact(List<? extends getShowType> list, boolean z) {
                if (z) {
                    this.contactDeviceNameMapper.mapPhoneNumberToDeviceContactNameForRelationshipItem(list);
                } else {
                    this.contactDeviceNameMapper.mapPhoneNumberToDeviceContactNameNotUsername(list);
                }
            }

            private final void mapDeviceContactWithoutMasking(List<? extends getShowType> list) {
                getPermissions.mapDeviceContactName$default(this.contactDeviceNameMapper, list, (Function0) null, (Function1) null, 6, (Object) null);
            }

            private final AuthProtocol createSocialMediaData() {
                return this.socialMediaDataFactory.createData("network");
            }

            /* access modifiers changed from: private */
            public final String checkShouldSaveActiveOrInactive(String str) {
                int length2 = str != null ? str.length() : 0;
                int max = dispatchOnCancelled.setMax(length2);
                if (length2 != max) {
                    onCanceled oncanceled = new onCanceled(length2, max, 1);
                    onCancelLoad.setMax(1819255767, oncanceled);
                    onCancelLoad.getMin(1819255767, oncanceled);
                }
                if (Intrinsics.areEqual((Object) str, (Object) ModifyRelationOperationType.BLOCK.getOperationType())) {
                    return "BLOCKING";
                }
                return Intrinsics.areEqual((Object) str, (Object) ModifyRelationOperationType.MUTE.getOperationType()) ? "MUTE" : "ACTIVE";
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/social/repository/SocialGeneralEntityRepository$Companion;", "", "()V", "JSON_PATH_EMOJI_LIST", "", "JSON_PATH_EMOJI_ORDER", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
            public static final class getMax {
                private getMax() {
                }

                public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
            static final class onNavigationEvent<T> implements RedDotManager<Throwable> {
                final /* synthetic */ getApiLevelList getMin;

                onNavigationEvent(getApiLevelList getapilevellist) {
                    this.getMin = getapilevellist;
                }

                public final /* synthetic */ void accept(Object obj) {
                    this.getMin.publishFollowersList();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
            static final class create<T> implements RedDotManager<Throwable> {
                final /* synthetic */ getApiLevelList setMin;

                create(getApiLevelList getapilevellist) {
                    this.setMin = getapilevellist;
                }

                public final /* synthetic */ void accept(Object obj) {
                    this.setMin.publishFollowingList();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 2})
            static final class getCause<T> implements RedDotManager<Boolean> {
                final /* synthetic */ getApiLevelList setMin;

                getCause(getApiLevelList getapilevellist) {
                    this.setMin = getapilevellist;
                }

                public final /* synthetic */ void accept(Object obj) {
                    this.setMin.publishFollowingList();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/persistence/entity/FollowingItemEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
            static final class invokeSuspend<V> implements Callable<setShowType> {
                final /* synthetic */ String getMax;
                final /* synthetic */ getApiLevelList setMin;

                invokeSuspend(getApiLevelList getapilevellist, String str) {
                    this.setMin = getapilevellist;
                    this.getMax = str;
                }

                public final /* synthetic */ Object call() {
                    return this.setMin.getFollowingItemEntity(this.getMax);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/persistence/entity/FollowerItemEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
            static final class values<V> implements Callable<AuthSkipResultModel> {
                final /* synthetic */ getApiLevelList getMin;
                final /* synthetic */ String setMax;

                values(getApiLevelList getapilevellist, String str) {
                    this.getMin = getapilevellist;
                    this.setMax = str;
                }

                public final /* synthetic */ Object call() {
                    return this.getMin.getFollowerItemEntity(this.setMax);
                }
            }
        }
