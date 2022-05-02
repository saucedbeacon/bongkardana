package o;

import id.dana.domain.nearbyme.IoDispatcher;
import id.dana.domain.social.InitStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o.APExpansion;
import o.ScanDataProcessor;
import o.ScanHelper;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010>\u001a\u00020\u00142\u0006\u0010?\u001a\u00020@H\u0002J.\u0010A\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0C\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D0B2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0CH\u0002J%\u0010G\u001a\b\u0012\u0004\u0012\u00020E0C2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0CH@ø\u0001\u0000¢\u0006\u0002\u0010HJ'\u0010I\u001a\b\u0012\u0004\u0012\u00020E0C2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020KH@ø\u0001\u0000¢\u0006\u0002\u0010MJ\u0011\u0010N\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0002\u0010OJ\u0016\u0010P\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010@0@0QH\u0002J\b\u0010R\u001a\u00020KH\u0002J\n\u0010S\u001a\u0004\u0018\u00010!H\u0016J\u000e\u0010T\u001a\b\u0012\u0004\u0012\u00020@0QH\u0016J\u0010\u0010U\u001a\u00020@2\u0006\u0010?\u001a\u00020@H\u0002J\u0010\u0010V\u001a\n (*\u0004\u0018\u00010W0WH\u0002J\u0011\u0010X\u001a\u00020\u001bH@ø\u0001\u0000¢\u0006\u0002\u0010OJ\u0019\u0010Y\u001a\n (*\u0004\u0018\u00010K0KH@ø\u0001\u0000¢\u0006\u0002\u0010OJ/\u0010Z\u001a\b\u0012\u0004\u0012\u00020E0C2\u0006\u0010[\u001a\u00020K2\u0006\u0010\\\u001a\u00020K2\u0006\u0010]\u001a\u00020\u001bH@ø\u0001\u0000¢\u0006\u0002\u0010^J\u0019\u0010_\u001a\u00020K2\u0006\u0010`\u001a\u00020\u001bH@ø\u0001\u0000¢\u0006\u0002\u0010aJ\u0011\u0010b\u001a\u00020KH@ø\u0001\u0000¢\u0006\u0002\u0010OJ\u0010\u0010c\u001a\n (*\u0004\u0018\u00010\u001b0\u001bH\u0002J\u000e\u0010d\u001a\b\u0012\u0004\u0012\u00020W0eH\u0016J\b\u0010f\u001a\u00020\u0014H\u0016J\u001b\u0010?\u001a\u00020@2\b\b\u0002\u0010g\u001a\u00020KH@ø\u0001\u0000¢\u0006\u0002\u0010hJ\u0011\u0010i\u001a\u00020@H@ø\u0001\u0000¢\u0006\u0002\u0010OJ\u0011\u0010j\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0002\u0010OJ\u0011\u0010k\u001a\u00020@H@ø\u0001\u0000¢\u0006\u0002\u0010OJ\u0011\u0010l\u001a\u00020@H@ø\u0001\u0000¢\u0006\u0002\u0010OJ\u0011\u0010m\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0002\u0010OJ\u0011\u0010n\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0002\u0010OJ\b\u0010o\u001a\u00020\u0014H\u0002J\u0019\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0002\u0010sJ\u0019\u0010t\u001a\u00020q2\u0006\u0010u\u001a\u00020\u001bH@ø\u0001\u0000¢\u0006\u0002\u0010aJ!\u0010v\u001a\u00020q2\u0006\u0010w\u001a\u00020K2\u0006\u0010`\u001a\u00020\u001bH@ø\u0001\u0000¢\u0006\u0002\u0010xJ\u0019\u0010y\u001a\u00020q2\u0006\u0010w\u001a\u00020KH@ø\u0001\u0000¢\u0006\u0002\u0010hJ\u001f\u0010z\u001a\u00020K2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0CH@ø\u0001\u0000¢\u0006\u0002\u0010HR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148V@VX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bXD¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001bXD¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020\u001bXD¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0014\u0010$\u001a\u00020\u001bXD¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR#\u0010&\u001a\n (*\u0004\u0018\u00010'0'8BX\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u001b\u0010-\u001a\u00020.8BX\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b/\u00100R\u001b\u00102\u001a\u0002038BX\u0002¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b4\u00105R\u001b\u00107\u001a\u0002088BX\u0002¢\u0006\f\n\u0004\b;\u0010,\u001a\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020\u001bXD¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u001dR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006{"}, d2 = {"Lid/dana/data/social/repository/SocialSyncContactRepository;", "Lid/dana/domain/social/SocialSyncRepository;", "contactProvider", "Lid/dana/data/social/sync/SocialContactProvider;", "amcsConfig", "Lid/dana/data/config/source/amcs/AmcsConfigEntityData;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "socialSyncFactory", "Lid/dana/data/social/repository/SocialSyncEntityDataFactory;", "socialSyncProcessFactory", "Lid/dana/data/social/repository/SocialSyncProcessEntityDataFactory;", "socialPreferences", "Lid/dana/data/social/repository/source/local/SocialPreferences;", "socialPreferencesDataFactory", "Lid/dana/data/social/repository/SocialPreferencesDataFactory;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lid/dana/data/social/sync/SocialContactProvider;Lid/dana/data/config/source/amcs/AmcsConfigEntityData;Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/social/repository/SocialSyncEntityDataFactory;Lid/dana/data/social/repository/SocialSyncProcessEntityDataFactory;Lid/dana/data/social/repository/source/local/SocialPreferences;Lid/dana/data/social/repository/SocialPreferencesDataFactory;Lkotlinx/coroutines/CoroutineDispatcher;)V", "value", "", "deviceFeedFeatureSwitch", "getDeviceFeedFeatureSwitch", "()Z", "setDeviceFeedFeatureSwitch", "(Z)V", "firstTimeInitFeedKey", "", "getFirstTimeInitFeedKey", "()Ljava/lang/String;", "fullSyncFinishedKey", "getFullSyncFinishedKey", "initFeedJob", "Lkotlinx/coroutines/Job;", "lastOffsetSyncContactKey", "getLastOffsetSyncContactKey", "lastSyncContactTimeKey", "getLastSyncContactTimeKey", "localAccountEntityData", "Lid/dana/data/account/repository/source/AccountEntityData;", "kotlin.jvm.PlatformType", "getLocalAccountEntityData", "()Lid/dana/data/account/repository/source/AccountEntityData;", "localAccountEntityData$delegate", "Lkotlin/Lazy;", "localSocialPreference", "Lid/dana/data/social/repository/SocialPreferencesData;", "getLocalSocialPreference", "()Lid/dana/data/social/repository/SocialPreferencesData;", "localSocialPreference$delegate", "localSocialSyncEntityData", "Lid/dana/data/social/repository/SocialSyncEntityData;", "getLocalSocialSyncEntityData", "()Lid/dana/data/social/repository/SocialSyncEntityData;", "localSocialSyncEntityData$delegate", "networkSocialSyncProcessEntityData", "Lid/dana/data/social/repository/SocialSyncProcessEntityData;", "getNetworkSocialSyncProcessEntityData", "()Lid/dana/data/social/repository/SocialSyncProcessEntityData;", "networkSocialSyncProcessEntityData$delegate", "offsetAtSpecificSyncTimeKey", "getOffsetAtSpecificSyncTimeKey", "canInitFeedPeriodically", "initFeed", "Lid/dana/domain/social/model/InitFeed;", "filterContactToDanaUserOnly", "Lkotlin/Function1;", "", "", "Lid/dana/domain/social/model/SocialContact;", "contactForSync", "filterDanaUser", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllContact", "maxContactPerbatch", "", "syncContactOffset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFullSyncFinishedFlag", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInitFeedEntity", "Lio/reactivex/subjects/BehaviorSubject;", "getInitFeedInterval", "getInitFeedJob", "getInitFeedObservable", "getInitStatusIfNotActive", "getLastInitFeedStatus", "Lid/dana/domain/social/model/FeedInit;", "getLastSynchedTime", "getMaxContactPerbatch", "getModifiedContactSinceSpecificTime", "maxContactPerBatch", "lastSyncContactOffset", "lastSyncTime", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOffsetAtSpecificSyncTime", "specificTime", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOffsetLastSynchedContact", "getPhoneNumber", "getSocialFeedInitStatus", "Lio/reactivex/Observable;", "hasContactPermission", "contactCount", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initFeedFirstTime", "initFeedPeriodically", "initFeedWithPublishErrorFallback", "initFeedWithoutContact", "isContactSyncEnabled", "isFirstTimeInitFeedFinished", "isInitFeedObserverExist", "saveFullSyncFinishedFlag", "", "isFinished", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveLastSynchedTime", "lastSyncTimeToSave", "saveOffsetAtSpecificSyncTime", "offsetToSave", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveOffsetLastSynchedContact", "syncContacts", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public class RVGroupInit implements getRequestedModel {
    /* access modifiers changed from: private */
    public final DialogLayout accountEntityDataFactory;
    private final handleMessage amcsConfig;
    private final getAuthContentResult contactProvider;
    @NotNull
    private final String firstTimeInitFeedKey = "first_time_init_feed";
    @NotNull
    private final String fullSyncFinishedKey = "fullsync_finished";
    private DictionaryKeys initFeedJob;
    private final APExpansion.AnonymousClass1 ioDispatcher;
    @NotNull
    private final String lastOffsetSyncContactKey = "last_offset_sync_contact";
    @NotNull
    private final String lastSyncContactTimeKey = "last_sync_contact_time";
    private final Lazy localAccountEntityData$delegate = LazyKt.lazy(new equals(this));
    private final Lazy localSocialPreference$delegate = LazyKt.lazy(new toFloatRange(this));
    private final Lazy localSocialSyncEntityData$delegate = LazyKt.lazy(new isInside(this));
    private final Lazy networkSocialSyncProcessEntityData$delegate = LazyKt.lazy(new values(this));
    @NotNull
    private final String offsetAtSpecificSyncTimeKey = "offset_at_specific_sync_time";
    private final getCurrentLongitudeAndLatitude socialPreferences;
    /* access modifiers changed from: private */
    public final getLink socialPreferencesDataFactory;
    /* access modifiers changed from: private */
    public final setAuthRequestContext socialSyncFactory;
    /* access modifiers changed from: private */
    public final getExtInfo socialSyncProcessFactory;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"initFeedWithPublishErrorFallback", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/model/InitFeed;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.social.repository.SocialSyncContactRepository", f = "SocialSyncContactRepository.kt", i = {0}, l = {240}, m = "initFeedWithPublishErrorFallback", n = {"this"}, s = {"L$0"})
    static final class IsOverlapping extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RVGroupInit this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(RVGroupInit rVGroupInit, Continuation continuation) {
            super(continuation);
            this.this$0 = rVGroupInit;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.initFeedWithPublishErrorFallback(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006H@"}, d2 = {"filterDanaUser", "", "contactForSync", "", "Lid/dana/domain/social/model/SocialContact;", "continuation", "Lkotlin/coroutines/Continuation;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.social.repository.SocialSyncContactRepository", f = "SocialSyncContactRepository.kt", i = {0, 0}, l = {309}, m = "filterDanaUser$suspendImpl", n = {"this", "contactForSync"}, s = {"L$0", "L$1"})
    static final class getMax extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RVGroupInit this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(RVGroupInit rVGroupInit, Continuation continuation) {
            super(continuation);
            this.this$0 = rVGroupInit;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RVGroupInit.filterDanaUser$suspendImpl(this.this$0, (List) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@"}, d2 = {"syncContacts", "", "contactForSync", "", "Lid/dana/domain/social/model/SocialContact;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.social.repository.SocialSyncContactRepository", f = "SocialSyncContactRepository.kt", i = {0}, l = {130}, m = "syncContacts$suspendImpl", n = {"contactForSync"}, s = {"L$0"})
    static final class hashCode extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RVGroupInit this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        hashCode(RVGroupInit rVGroupInit, Continuation continuation) {
            super(continuation);
            this.this$0 = rVGroupInit;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RVGroupInit.syncContacts$suspendImpl(this.this$0, (List) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"initFeed", "", "contactCount", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/model/InitFeed;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.social.repository.SocialSyncContactRepository", f = "SocialSyncContactRepository.kt", i = {0}, l = {287}, m = "initFeed", n = {"this"}, s = {"L$0"})
    static final class length extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RVGroupInit this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(RVGroupInit rVGroupInit, Continuation continuation) {
            super(continuation);
            this.this$0 = rVGroupInit;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.initFeed(0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"initFeedPeriodically", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.social.repository.SocialSyncContactRepository", f = "SocialSyncContactRepository.kt", i = {0, 0}, l = {218}, m = "initFeedPeriodically$suspendImpl", n = {"this", "initFeed"}, s = {"L$0", "L$1"})
    static final class setMin extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RVGroupInit this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(RVGroupInit rVGroupInit, Continuation continuation) {
            super(continuation);
            this.this$0 = rVGroupInit;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RVGroupInit.initFeedPeriodically$suspendImpl(this.this$0, this);
        }
    }

    private final setDrawDivider getLocalAccountEntityData() {
        return (setDrawDivider) this.localAccountEntityData$delegate.getValue();
    }

    private final getFromSystem getLocalSocialPreference() {
        return (getFromSystem) this.localSocialPreference$delegate.getValue();
    }

    private final getAuthRequestContext getLocalSocialSyncEntityData() {
        return (getAuthRequestContext) this.localSocialSyncEntityData$delegate.getValue();
    }

    private final setScopeNicks getNetworkSocialSyncProcessEntityData() {
        return (setScopeNicks) this.networkSocialSyncProcessEntityData$delegate.getValue();
    }

    @Nullable
    public Object filterDanaUser(@NotNull List<ScanHelper.ScanData> list, @NotNull Continuation<? super List<ScanHelper.ScanData>> continuation) {
        return filterDanaUser$suspendImpl(this, list, continuation);
    }

    @Nullable
    public Object getAllContact(int i, int i2, @NotNull Continuation<? super List<ScanHelper.ScanData>> continuation) {
        return getExtendAction.toSocialContacts(this.contactProvider.getAllContact(i, i2));
    }

    @Nullable
    public Object getFullSyncFinishedFlag(@NotNull Continuation<? super Boolean> continuation) {
        return getFullSyncFinishedFlag$suspendImpl(this, continuation);
    }

    @Nullable
    public Object getLastSynchedTime(@NotNull Continuation<? super String> continuation) {
        return getLastSynchedTime$suspendImpl(this, continuation);
    }

    @Nullable
    public Object getMaxContactPerbatch(@NotNull Continuation<? super Integer> continuation) {
        return this.amcsConfig.getMaxContactPerBatch().blockingSingle();
    }

    @Nullable
    public Object getModifiedContactSinceSpecificTime(int i, int i2, @NotNull String str, @NotNull Continuation<? super List<ScanHelper.ScanData>> continuation) {
        return getExtendAction.toSocialContacts(this.contactProvider.getModifiedContactSinceSpecificTime(i, i2, str));
    }

    @Nullable
    public Object getOffsetAtSpecificSyncTime(@NotNull String str, @NotNull Continuation<? super Integer> continuation) {
        return getOffsetAtSpecificSyncTime$suspendImpl(this, str, continuation);
    }

    @Nullable
    public Object getOffsetLastSynchedContact(@NotNull Continuation<? super Integer> continuation) {
        return getOffsetLastSynchedContact$suspendImpl(this, continuation);
    }

    @Nullable
    public Object initFeedFirstTime(@NotNull Continuation<? super setBeaconParsers> continuation) {
        return initFeed(this.contactProvider.getContactCount(), continuation);
    }

    @Nullable
    public Object initFeedPeriodically(@NotNull Continuation<? super Boolean> continuation) {
        return initFeedPeriodically$suspendImpl(this, continuation);
    }

    @Nullable
    public Object initFeedWithoutContact(@NotNull Continuation<? super setBeaconParsers> continuation) {
        return initFeed$default(this, 0, continuation, 1, (Object) null);
    }

    @Nullable
    public Object isContactSyncEnabled(@NotNull Continuation<? super Boolean> continuation) {
        return isContactSyncEnabled$suspendImpl(this, continuation);
    }

    @Nullable
    public Object isFirstTimeInitFeedFinished(@NotNull Continuation<? super Boolean> continuation) {
        return isFirstTimeInitFeedFinished$suspendImpl(this, continuation);
    }

    @Nullable
    public Object saveFullSyncFinishedFlag(boolean z, @NotNull Continuation<? super Unit> continuation) {
        return saveFullSyncFinishedFlag$suspendImpl(this, z, continuation);
    }

    @Nullable
    public Object saveLastSynchedTime(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        return saveLastSynchedTime$suspendImpl(this, str, continuation);
    }

    @Nullable
    public Object saveOffsetAtSpecificSyncTime(int i, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        return saveOffsetAtSpecificSyncTime$suspendImpl(this, i, str, continuation);
    }

    @Nullable
    public Object saveOffsetLastSynchedContact(int i, @NotNull Continuation<? super Unit> continuation) {
        return saveOffsetLastSynchedContact$suspendImpl(this, i, continuation);
    }

    @Nullable
    public Object syncContacts(@NotNull List<ScanHelper.ScanData> list, @NotNull Continuation<? super Integer> continuation) {
        return syncContacts$suspendImpl(this, list, continuation);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/account/AccountEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<attach, String> {
        public static final getMin length = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            attach attach = (attach) obj;
            Intrinsics.checkNotNullParameter(attach, "it");
            return attach.getPhoneNumber();
        }
    }

    @Inject
    public RVGroupInit(@NotNull getAuthContentResult getauthcontentresult, @NotNull handleMessage handlemessage, @NotNull DialogLayout dialogLayout, @NotNull setAuthRequestContext setauthrequestcontext, @NotNull getExtInfo getextinfo, @NotNull getCurrentLongitudeAndLatitude getcurrentlongitudeandlatitude, @NotNull getLink getlink, @NotNull @IoDispatcher APExpansion.AnonymousClass1 r9) {
        Intrinsics.checkNotNullParameter(getauthcontentresult, "contactProvider");
        Intrinsics.checkNotNullParameter(handlemessage, "amcsConfig");
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(setauthrequestcontext, "socialSyncFactory");
        Intrinsics.checkNotNullParameter(getextinfo, "socialSyncProcessFactory");
        Intrinsics.checkNotNullParameter(getcurrentlongitudeandlatitude, "socialPreferences");
        Intrinsics.checkNotNullParameter(getlink, "socialPreferencesDataFactory");
        Intrinsics.checkNotNullParameter(r9, "ioDispatcher");
        this.contactProvider = getauthcontentresult;
        this.amcsConfig = handlemessage;
        this.accountEntityDataFactory = dialogLayout;
        this.socialSyncFactory = setauthrequestcontext;
        this.socialSyncProcessFactory = getextinfo;
        this.socialPreferences = getcurrentlongitudeandlatitude;
        this.socialPreferencesDataFactory = getlink;
        this.ioDispatcher = r9;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public String getFirstTimeInitFeedKey() {
        return this.firstTimeInitFeedKey;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public String getOffsetAtSpecificSyncTimeKey() {
        return this.offsetAtSpecificSyncTimeKey;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public String getLastSyncContactTimeKey() {
        return this.lastSyncContactTimeKey;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public String getLastOffsetSyncContactKey() {
        return this.lastOffsetSyncContactKey;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public String getFullSyncFinishedKey() {
        return this.fullSyncFinishedKey;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/SocialSyncEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function0<getAuthRequestContext> {
        final /* synthetic */ RVGroupInit this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(RVGroupInit rVGroupInit) {
            super(0);
            this.this$0 = rVGroupInit;
        }

        @NotNull
        public final getAuthRequestContext invoke() {
            return this.this$0.socialSyncFactory.createData("local");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/SocialPreferencesData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function0<getFromSystem> {
        final /* synthetic */ RVGroupInit this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(RVGroupInit rVGroupInit) {
            super(0);
            this.this$0 = rVGroupInit;
        }

        @NotNull
        public final getFromSystem invoke() {
            return this.this$0.socialPreferencesDataFactory.createData("local");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/SocialSyncProcessEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class values extends Lambda implements Function0<setScopeNicks> {
        final /* synthetic */ RVGroupInit this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        values(RVGroupInit rVGroupInit) {
            super(0);
            this.this$0 = rVGroupInit;
        }

        @NotNull
        public final setScopeNicks invoke() {
            return this.this$0.socialSyncProcessFactory.createData("network");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/account/repository/source/AccountEntityData;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function0<setDrawDivider> {
        final /* synthetic */ RVGroupInit this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(RVGroupInit rVGroupInit) {
            super(0);
            this.this$0 = rVGroupInit;
        }

        public final setDrawDivider invoke() {
            return this.this$0.accountEntityDataFactory.createData("local");
        }
    }

    public boolean getDeviceFeedFeatureSwitch() {
        return this.socialPreferences.getDeviceFeedFeatureSwitch();
    }

    public void setDeviceFeedFeatureSwitch(boolean z) {
        this.socialPreferences.setDeviceFeedFeatureSwitch(z);
        getInitFeedEntity().onNext(new setBeaconParsers(InitStatus.NOT_ACTIVATED, 0, (Exception) null, false, 14, (DefaultConstructorMarker) null));
    }

    static /* synthetic */ Object saveLastSynchedTime$suspendImpl(RVGroupInit rVGroupInit, String str, Continuation continuation) {
        getAuthRequestContext localSocialSyncEntityData = rVGroupInit.getLocalSocialSyncEntityData();
        String phoneNumber = rVGroupInit.getPhoneNumber();
        Intrinsics.checkNotNullExpressionValue(phoneNumber, "getPhoneNumber()");
        Object saveLastSynchedTime = localSocialSyncEntityData.saveLastSynchedTime(str, phoneNumber, rVGroupInit.getLastSyncContactTimeKey(), continuation);
        if (saveLastSynchedTime == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return saveLastSynchedTime;
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object getLastSynchedTime$suspendImpl(RVGroupInit rVGroupInit, Continuation continuation) {
        getAuthRequestContext localSocialSyncEntityData = rVGroupInit.getLocalSocialSyncEntityData();
        String phoneNumber = rVGroupInit.getPhoneNumber();
        Intrinsics.checkNotNullExpressionValue(phoneNumber, "getPhoneNumber()");
        return localSocialSyncEntityData.getLastSynchedTime(phoneNumber, rVGroupInit.getLastSyncContactTimeKey(), continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object filterDanaUser$suspendImpl(o.RVGroupInit r6, java.util.List r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof o.RVGroupInit.getMax
            if (r0 == 0) goto L_0x0014
            r0 = r8
            o.RVGroupInit$getMax r0 = (o.RVGroupInit.getMax) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L_0x0019
        L_0x0014:
            o.RVGroupInit$getMax r0 = new o.RVGroupInit$getMax
            r0.<init>(r6, r8)
        L_0x0019:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r6 = r0.L$1
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r0.L$0
            o.RVGroupInit r6 = (o.RVGroupInit) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0079
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r8)
            o.setScopeNicks r8 = r6.getNetworkSocialSyncProcessEntityData()
            r2 = r7
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r2 = r2.iterator()
        L_0x0056:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x006a
            java.lang.Object r5 = r2.next()
            o.ScanHelper$ScanData r5 = (o.ScanHelper.ScanData) r5
            java.lang.String r5 = r5.getPhoneNumber()
            r4.add(r5)
            goto L_0x0056
        L_0x006a:
            java.util.List r4 = (java.util.List) r4
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = r8.filterDanaUser(r4, r0)
            if (r8 != r1) goto L_0x0079
            return r1
        L_0x0079:
            kotlin.jvm.functions.Function1 r6 = r6.filterContactToDanaUserOnly(r7)
            java.lang.Object r6 = r6.invoke(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RVGroupInit.filterDanaUser$suspendImpl(o.RVGroupInit, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lid/dana/domain/social/model/SocialContact;", "danaUsers", "", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<List<? extends String>, List<ScanHelper.ScanData>> {
        final /* synthetic */ List $contactForSync;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(List list) {
            super(1);
            this.$contactForSync = list;
        }

        @NotNull
        public final List<ScanHelper.ScanData> invoke(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "danaUsers");
            Map linkedHashMap = new LinkedHashMap();
            for (ScanHelper.ScanData scanData : this.$contactForSync) {
                linkedHashMap.put(scanData.getPhoneNumber(), scanData);
            }
            List<ScanHelper.ScanData> arrayList = new ArrayList<>();
            Iterable<String> iterable = list;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (String str : iterable) {
                ScanHelper.ScanData scanData2 = (ScanHelper.ScanData) linkedHashMap.get(str);
                if (scanData2 != null) {
                    arrayList.add(scanData2);
                } else {
                    scanData2 = null;
                }
                arrayList2.add(scanData2);
            }
            return arrayList;
        }
    }

    private final Function1<List<String>, List<ScanHelper.ScanData>> filterContactToDanaUserOnly(List<ScanHelper.ScanData> list) {
        return new setMax(list);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object syncContacts$suspendImpl(o.RVGroupInit r4, java.util.List r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof o.RVGroupInit.hashCode
            if (r0 == 0) goto L_0x0014
            r0 = r6
            o.RVGroupInit$hashCode r0 = (o.RVGroupInit.hashCode) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            o.RVGroupInit$hashCode r0 = new o.RVGroupInit$hashCode
            r0.<init>(r4, r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r4 = r0.L$0
            r5 = r4
            java.util.List r5 = (java.util.List) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0061
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r6)
            o.setDrawDivider r6 = r4.getLocalAccountEntityData()
            o.TitleBarRightButtonView$1 r6 = r6.hasAccount()
            java.lang.Object r6 = r6.blockingSingle()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x007a
            o.setScopeNicks r4 = r4.getNetworkSocialSyncProcessEntityData()
            java.util.List r6 = o.getExtendAction.toSocialUser(r5)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r4.syncContact(r6, r0)
            if (r6 != r1) goto L_0x0061
            return r1
        L_0x0061:
            o.getErrorScopes r6 = (o.getErrorScopes) r6
            boolean r4 = r6.success
            if (r4 == 0) goto L_0x0070
            int r4 = r5.size()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            return r4
        L_0x0070:
            id.dana.data.base.NetworkException r4 = new id.dana.data.base.NetworkException
            com.alipayplus.mobile.component.domain.model.result.BaseRpcResult r6 = (com.alipayplus.mobile.component.domain.model.result.BaseRpcResult) r6
            r4.<init>((com.alipayplus.mobile.component.domain.model.result.BaseRpcResult) r6)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            throw r4
        L_0x007a:
            id.dana.data.social.UserAccountNotFoundException r4 = new id.dana.data.social.UserAccountNotFoundException
            r4.<init>()
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RVGroupInit.syncContacts$suspendImpl(o.RVGroupInit, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object saveOffsetLastSynchedContact$suspendImpl(RVGroupInit rVGroupInit, int i, Continuation continuation) {
        getAuthRequestContext localSocialSyncEntityData = rVGroupInit.getLocalSocialSyncEntityData();
        String phoneNumber = rVGroupInit.getPhoneNumber();
        Intrinsics.checkNotNullExpressionValue(phoneNumber, "getPhoneNumber()");
        Object saveOffsetLastSynchedContact = localSocialSyncEntityData.saveOffsetLastSynchedContact(i, phoneNumber, rVGroupInit.getLastOffsetSyncContactKey(), continuation);
        if (saveOffsetLastSynchedContact == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return saveOffsetLastSynchedContact;
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object getOffsetLastSynchedContact$suspendImpl(RVGroupInit rVGroupInit, Continuation continuation) {
        getAuthRequestContext localSocialSyncEntityData = rVGroupInit.getLocalSocialSyncEntityData();
        String phoneNumber = rVGroupInit.getPhoneNumber();
        Intrinsics.checkNotNullExpressionValue(phoneNumber, "getPhoneNumber()");
        return localSocialSyncEntityData.getOffsetLastSynchedContact(phoneNumber, rVGroupInit.getLastOffsetSyncContactKey(), continuation);
    }

    static /* synthetic */ Object getOffsetAtSpecificSyncTime$suspendImpl(RVGroupInit rVGroupInit, String str, Continuation continuation) {
        getAuthRequestContext localSocialSyncEntityData = rVGroupInit.getLocalSocialSyncEntityData();
        String phoneNumber = rVGroupInit.getPhoneNumber();
        Intrinsics.checkNotNullExpressionValue(phoneNumber, "getPhoneNumber()");
        return localSocialSyncEntityData.getOffsetAtSpecificSyncTime(str, phoneNumber, rVGroupInit.getOffsetAtSpecificSyncTimeKey(), continuation);
    }

    static /* synthetic */ Object saveOffsetAtSpecificSyncTime$suspendImpl(RVGroupInit rVGroupInit, int i, String str, Continuation continuation) {
        getAuthRequestContext localSocialSyncEntityData = rVGroupInit.getLocalSocialSyncEntityData();
        String phoneNumber = rVGroupInit.getPhoneNumber();
        Intrinsics.checkNotNullExpressionValue(phoneNumber, "getPhoneNumber()");
        Object saveOffsetAtSpecificSyncTime = localSocialSyncEntityData.saveOffsetAtSpecificSyncTime(i, str, phoneNumber, rVGroupInit.getOffsetAtSpecificSyncTimeKey(), continuation);
        if (saveOffsetAtSpecificSyncTime == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return saveOffsetAtSpecificSyncTime;
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object isContactSyncEnabled$suspendImpl(RVGroupInit rVGroupInit, Continuation continuation) {
        Boolean blockingSingle = rVGroupInit.amcsConfig.isSocialContactSyncEnabled().blockingSingle();
        return Boxing.boxBoolean(blockingSingle != null ? blockingSingle.booleanValue() : false);
    }

    public boolean hasContactPermission() {
        return this.contactProvider.hasContactPermission();
    }

    static /* synthetic */ Object getFullSyncFinishedFlag$suspendImpl(RVGroupInit rVGroupInit, Continuation continuation) {
        getAuthRequestContext localSocialSyncEntityData = rVGroupInit.getLocalSocialSyncEntityData();
        String phoneNumber = rVGroupInit.getPhoneNumber();
        Intrinsics.checkNotNullExpressionValue(phoneNumber, "getPhoneNumber()");
        return localSocialSyncEntityData.getFullSyncFinishedFlag(phoneNumber, rVGroupInit.getFullSyncFinishedKey(), continuation);
    }

    static /* synthetic */ Object saveFullSyncFinishedFlag$suspendImpl(RVGroupInit rVGroupInit, boolean z, Continuation continuation) {
        getAuthRequestContext localSocialSyncEntityData = rVGroupInit.getLocalSocialSyncEntityData();
        String phoneNumber = rVGroupInit.getPhoneNumber();
        Intrinsics.checkNotNullExpressionValue(phoneNumber, "getPhoneNumber()");
        Object saveFullSyncFinishedFlag = localSocialSyncEntityData.saveFullSyncFinishedFlag(z, phoneNumber, rVGroupInit.getFullSyncFinishedKey(), continuation);
        if (saveFullSyncFinishedFlag == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return saveFullSyncFinishedFlag;
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object isFirstTimeInitFeedFinished$suspendImpl(RVGroupInit rVGroupInit, Continuation continuation) {
        getAuthRequestContext localSocialSyncEntityData = rVGroupInit.getLocalSocialSyncEntityData();
        String phoneNumber = rVGroupInit.getPhoneNumber();
        Intrinsics.checkNotNullExpressionValue(phoneNumber, "getPhoneNumber()");
        return Boxing.boxBoolean(localSocialSyncEntityData.isFirstTimeInitFeedFinished(phoneNumber, rVGroupInit.getFirstTimeInitFeedKey()));
    }

    @Nullable
    public DictionaryKeys getInitFeedJob() {
        return this.initFeedJob;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object initFeedPeriodically$suspendImpl(o.RVGroupInit r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof o.RVGroupInit.setMin
            if (r0 == 0) goto L_0x0014
            r0 = r6
            o.RVGroupInit$setMin r0 = (o.RVGroupInit.setMin) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            o.RVGroupInit$setMin r0 = new o.RVGroupInit$setMin
            r0.<init>(r5, r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r5 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r1 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r0 = r0.L$0
            o.RVGroupInit r0 = (o.RVGroupInit) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0072
        L_0x0036:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            o.ScanDataProcessor$ScanData r2 = r5.getLastInitFeedStatus()
            o.setBeaconParsers r2 = r2.toInitFeed()
            o.setBeaconParsers r2 = r5.getInitStatusIfNotActive(r2)
            r6.element = r2
            o.removeString r2 = r5.getInitFeedEntity()
            T r4 = r6.element
            o.setBeaconParsers r4 = (o.setBeaconParsers) r4
            r2.onNext(r4)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r0 = r5.initFeedWithPublishErrorFallback(r0)
            if (r0 != r1) goto L_0x006e
            return r1
        L_0x006e:
            r1 = r6
            r6 = r0
            r0 = r5
            r5 = r1
        L_0x0072:
            o.setBeaconParsers r6 = (o.setBeaconParsers) r6
            r5.element = r6
            o.APExpansion$1 r5 = r0.ioDispatcher
            kotlin.coroutines.CoroutineContext r5 = (kotlin.coroutines.CoroutineContext) r5
            o.initToken r5 = o.setConfiguration.length(r5)
            o.RVGroupInit$toIntRange r6 = new o.RVGroupInit$toIntRange
            r2 = 0
            r6.<init>(r0, r1, r2)
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r1 = 3
            o.DictionaryKeys r5 = o.xp4.getMin(r5, r2, r2, r6, r1)
            r0.initFeedJob = r5
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RVGroupInit.initFeedPeriodically$suspendImpl(o.RVGroupInit, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.social.repository.SocialSyncContactRepository$initFeedPeriodically$2", f = "SocialSyncContactRepository.kt", i = {0, 1}, l = {230, 231}, m = "invokeSuspend", n = {"intervalInMillis", "intervalInMillis"}, s = {"J$0", "J$0"})
    static final class toIntRange extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef $initFeed;
        long J$0;
        Object L$0;
        int label;
        final /* synthetic */ RVGroupInit this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(RVGroupInit rVGroupInit, Ref.ObjectRef objectRef, Continuation continuation) {
            super(2, continuation);
            this.this$0 = rVGroupInit;
            this.$initFeed = objectRef;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            return new toIntRange(this.this$0, this.$initFeed, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((toIntRange) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull T r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002a
                if (r1 == r3) goto L_0x001c
                if (r1 != r2) goto L_0x0014
                long r4 = r9.J$0
                kotlin.ResultKt.throwOnFailure(r10)
                goto L_0x0040
            L_0x0014:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x001c:
                long r4 = r9.J$0
                java.lang.Object r1 = r9.L$0
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                kotlin.ResultKt.throwOnFailure(r10)
                r5 = r4
                r4 = r1
                r1 = r0
                r0 = r9
                goto L_0x0066
            L_0x002a:
                kotlin.ResultKt.throwOnFailure(r10)
                o.RVGroupInit r10 = r9.this$0
                boolean r10 = r10.isInitFeedObserverExist()
                if (r10 == 0) goto L_0x007c
                o.RVGroupInit r10 = r9.this$0
                int r10 = r10.getInitFeedInterval()
                long r4 = (long) r10
                r6 = 1000(0x3e8, double:4.94E-321)
                long r4 = r4 * r6
            L_0x0040:
                r10 = r9
            L_0x0041:
                o.RVGroupInit r1 = r10.this$0
                kotlin.jvm.internal.Ref$ObjectRef r6 = r10.$initFeed
                T r6 = r6.element
                o.setBeaconParsers r6 = (o.setBeaconParsers) r6
                boolean r1 = r1.canInitFeedPeriodically(r6)
                if (r1 == 0) goto L_0x007c
                kotlin.jvm.internal.Ref$ObjectRef r1 = r10.$initFeed
                o.RVGroupInit r6 = r10.this$0
                r10.L$0 = r1
                r10.J$0 = r4
                r10.label = r3
                java.lang.Object r6 = r6.initFeedWithPublishErrorFallback(r10)
                if (r6 != r0) goto L_0x0060
                return r0
            L_0x0060:
                r8 = r0
                r0 = r10
                r10 = r6
                r5 = r4
                r4 = r1
                r1 = r8
            L_0x0066:
                o.setBeaconParsers r10 = (o.setBeaconParsers) r10
                r4.element = r10
                r10 = 0
                r0.L$0 = r10
                r0.J$0 = r5
                r0.label = r2
                java.lang.Object r10 = o.getConfiguration.length(r5, r0)
                if (r10 != r1) goto L_0x0078
                return r1
            L_0x0078:
                r10 = r0
                r0 = r1
                r4 = r5
                goto L_0x0041
            L_0x007c:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o.RVGroupInit.toIntRange.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object initFeedWithPublishErrorFallback(kotlin.coroutines.Continuation<? super o.setBeaconParsers> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof o.RVGroupInit.IsOverlapping
            if (r0 == 0) goto L_0x0014
            r0 = r9
            o.RVGroupInit$IsOverlapping r0 = (o.RVGroupInit.IsOverlapping) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L_0x0019
        L_0x0014:
            o.RVGroupInit$IsOverlapping r0 = new o.RVGroupInit$IsOverlapping
            r0.<init>(r8, r9)
        L_0x0019:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r0 = r0.L$0
            o.RVGroupInit r0 = (o.RVGroupInit) r0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ Exception -> 0x002e }
            goto L_0x0049
        L_0x002e:
            r9 = move-exception
            r3 = r9
            r9 = r0
            goto L_0x0059
        L_0x0032:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r9)
            r0.L$0 = r8     // Catch:{ Exception -> 0x0056 }
            r0.label = r3     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r9 = r8.initFeedFirstTime(r0)     // Catch:{ Exception -> 0x0056 }
            if (r9 != r1) goto L_0x0048
            return r1
        L_0x0048:
            r0 = r8
        L_0x0049:
            r1 = r9
            o.setBeaconParsers r1 = (o.setBeaconParsers) r1     // Catch:{ Exception -> 0x002e }
            o.removeString r2 = r0.getInitFeedEntity()     // Catch:{ Exception -> 0x002e }
            r2.onNext(r1)     // Catch:{ Exception -> 0x002e }
            o.setBeaconParsers r9 = (o.setBeaconParsers) r9     // Catch:{ Exception -> 0x002e }
            goto L_0x006e
        L_0x0056:
            r9 = move-exception
            r3 = r9
            r9 = r8
        L_0x0059:
            o.setBeaconParsers r7 = new o.setBeaconParsers
            id.dana.domain.social.InitStatus r1 = id.dana.domain.social.InitStatus.ERROR
            r2 = 0
            r4 = 0
            r5 = 10
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            o.removeString r9 = r9.getInitFeedEntity()
            r9.onNext(r7)
            r9 = r7
        L_0x006e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RVGroupInit.initFeedWithPublishErrorFallback(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final setBeaconParsers getInitStatusIfNotActive(setBeaconParsers setbeaconparsers) {
        if (setbeaconparsers.getStatus() != InitStatus.NOT_ACTIVATED) {
            return setbeaconparsers;
        }
        ScanDataProcessor.ScanData scanData = new ScanDataProcessor.ScanData(0, InitStatus.INIT);
        getFromSystem localSocialPreference = getLocalSocialPreference();
        String phoneNumber = getPhoneNumber();
        Intrinsics.checkNotNullExpressionValue(phoneNumber, "getPhoneNumber()");
        localSocialPreference.saveSocialFeedStatus(phoneNumber, scanData);
        return scanData.toInitFeed();
    }

    @NotNull
    public removeString<setBeaconParsers> getInitFeedObservable() {
        return getInitFeedEntity();
    }

    private final ScanDataProcessor.ScanData getLastInitFeedStatus() {
        getFromSystem localSocialPreference = getLocalSocialPreference();
        String phoneNumber = getPhoneNumber();
        Intrinsics.checkNotNullExpressionValue(phoneNumber, "getPhoneNumber()");
        return localSocialPreference.getSocialFeedStatus(phoneNumber).blockingSingle(new ScanDataProcessor.ScanData(0, InitStatus.NOT_ACTIVATED));
    }

    /* access modifiers changed from: private */
    public final boolean canInitFeedPeriodically(setBeaconParsers setbeaconparsers) {
        return !setbeaconparsers.isFinished() && !setbeaconparsers.isError() && getInitFeedEntity().length();
    }

    /* access modifiers changed from: private */
    public final boolean isInitFeedObserverExist() {
        return getInitFeedEntity().length();
    }

    /* access modifiers changed from: private */
    public final int getInitFeedInterval() {
        Integer blockingSingle = this.amcsConfig.getFriendshipSyncProgressInterval().blockingSingle();
        if (blockingSingle != null) {
            return blockingSingle.intValue();
        }
        return 60;
    }

    private final removeString<setBeaconParsers> getInitFeedEntity() {
        return this.socialPreferences.getInitFeedEntity();
    }

    /* access modifiers changed from: package-private */
    public static /* synthetic */ Object initFeed$default(RVGroupInit rVGroupInit, int i, Continuation continuation, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return rVGroupInit.initFeed(i, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initFeed");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object initFeed(int r6, kotlin.coroutines.Continuation<? super o.setBeaconParsers> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o.RVGroupInit.length
            if (r0 == 0) goto L_0x0014
            r0 = r7
            o.RVGroupInit$length r0 = (o.RVGroupInit.length) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L_0x0019
        L_0x0014:
            o.RVGroupInit$length r0 = new o.RVGroupInit$length
            r0.<init>(r5, r7)
        L_0x0019:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r6 = r0.L$0
            o.RVGroupInit r6 = (o.RVGroupInit) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0049
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r7)
            o.setScopeNicks r7 = r5.getNetworkSocialSyncProcessEntityData()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = r7.initFeed(r6, r0)
            if (r7 != r1) goto L_0x0048
            return r1
        L_0x0048:
            r6 = r5
        L_0x0049:
            o.setAuthCode r7 = (o.setAuthCode) r7
            boolean r0 = r7.success
            if (r0 == 0) goto L_0x007a
            o.getFromSystem r0 = r6.getLocalSocialPreference()
            java.lang.String r1 = r6.getPhoneNumber()
            java.lang.String r2 = "getPhoneNumber()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            o.ScanDataProcessor$ScanData r4 = o.clearPermissionModel.toFeedInit(r7)
            r0.saveSocialFeedStatus(r1, r4)
            o.getAuthRequestContext r0 = r6.getLocalSocialSyncEntityData()
            java.lang.String r1 = r6.getPhoneNumber()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r6 = r6.getFirstTimeInitFeedKey()
            r0.setFirstTimeInitFeedFinished(r3, r1, r6)
            o.setBeaconParsers r6 = o.H5OpenAuthProxy.toInitFeed(r7)
            return r6
        L_0x007a:
            id.dana.data.base.NetworkException r6 = new id.dana.data.base.NetworkException
            com.alipayplus.mobile.component.domain.model.result.BaseRpcResult r7 = (com.alipayplus.mobile.component.domain.model.result.BaseRpcResult) r7
            r6.<init>((com.alipayplus.mobile.component.domain.model.result.BaseRpcResult) r7)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RVGroupInit.initFeed(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final String getPhoneNumber() {
        setDrawDivider localAccountEntityData = getLocalAccountEntityData();
        Intrinsics.checkNotNullExpressionValue(localAccountEntityData, "localAccountEntityData");
        return (String) localAccountEntityData.getAccount().map(getMin.length).blockingFirst();
    }

    @NotNull
    public TitleBarRightButtonView.AnonymousClass1<ScanDataProcessor.ScanData> getSocialFeedInitStatus() {
        getFromSystem localSocialPreference = getLocalSocialPreference();
        String phoneNumber = getPhoneNumber();
        Intrinsics.checkNotNullExpressionValue(phoneNumber, "getPhoneNumber()");
        return localSocialPreference.getSocialFeedStatus(phoneNumber);
    }
}
