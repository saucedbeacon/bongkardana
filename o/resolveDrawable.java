package o;

import com.google.firebase.perf.util.Constants;
import id.dana.data.Source;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppMsgReceiver;
import o.TitleBarRightButtonView;
import o.b;
import o.font;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00152\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020!H\u0002J\b\u0010%\u001a\u00020&H\u0002J4\u0010'\u001a&\u0012\f\u0012\n )*\u0004\u0018\u00010(0( )*\u0012\u0012\f\u0012\n )*\u0004\u0018\u00010(0(\u0018\u00010\u00150\u00152\u0006\u0010\u001f\u001a\u00020\u0016H\u0002J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010+\u001a\u00020\u0016H\u0016J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010-\u001a\u00020\u0016H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lid/dana/data/auth/face/repository/source/entity/FaceAuthPopUpConsultationEntityRepository;", "Lid/dana/data/base/AuthenticatedEntityRepository;", "Lid/dana/domain/auth/face/repository/FaceAuthPopUpConsultationRepository;", "configEntityDataFactory", "Lid/dana/data/config/source/ConfigEntityDataFactory;", "userInfoEntityDataFactory", "Lid/dana/data/user/source/UserInfoEntityDataFactory;", "faceAuthSuggestionDataFactory", "Lid/dana/data/auth/face/repository/source/FaceAuthSuggestionDataFactory;", "userInfoMapper", "Lid/dana/data/user/UserInfoMapper;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "loginEntityDataFactory", "Lid/dana/data/login/source/LoginEntityDataFactory;", "securityGuardFacade", "Lid/dana/data/foundation/facade/SecurityGuardFacade;", "errorConfigFactory", "Lid/dana/data/errorconfig/ErrorConfigFactory;", "(Lid/dana/data/config/source/ConfigEntityDataFactory;Lid/dana/data/user/source/UserInfoEntityDataFactory;Lid/dana/data/auth/face/repository/source/FaceAuthSuggestionDataFactory;Lid/dana/data/user/UserInfoMapper;Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/login/source/LoginEntityDataFactory;Lid/dana/data/foundation/facade/SecurityGuardFacade;Lid/dana/data/errorconfig/ErrorConfigFactory;)V", "shouldNeverShowFaceAuthSuggestion", "Lio/reactivex/Observable;", "", "getShouldNeverShowFaceAuthSuggestion", "()Lio/reactivex/Observable;", "shouldSuggestFaceAuth", "getShouldSuggestFaceAuth", "clearFaceAuthSuggestionState", "consultFaceAuthPopUpToBackend", "Lid/dana/domain/auth/face/result/FaceAuthPopUpConsultationResult;", "parallelMode", "withKycStatus", "createAmcsConfigEntity", "Lid/dana/data/config/source/ConfigEntityData;", "createFaceAuthInfoEntity", "Lid/dana/data/user/source/UserEntityData;", "createSplitConfigEntity", "createSuggestionData", "Lid/dana/data/auth/face/repository/source/FaceAuthSuggestionRepository;", "getUserInfo", "Lid/dana/data/user/source/network/result/UserInfoRpcResult;", "kotlin.jvm.PlatformType", "saveFaceAuthSuggestionState", "hasShown", "saveNeverShowFaceAuthSuggestionState", "shouldNeverShow", "shouldSuggestFaceAuthScreen", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class resolveDrawable extends setMinProgress implements success {
    @NotNull
    public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
    private static final int TWO_WEEKS = 14;
    private final onCallBack configEntityDataFactory;
    private final font.Cdefault faceAuthSuggestionDataFactory;
    private final getAlias userInfoEntityDataFactory;
    /* access modifiers changed from: private */
    public final PackageQueryPoint userInfoMapper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\bH&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0014\u001a\u00020\bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lid/dana/data/auth/face/repository/source/FaceAuthSuggestionRepository;", "", "faceAuthSuggestionStateSavingTime", "", "getFaceAuthSuggestionStateSavingTime", "()J", "shouldNeverShowFaceAuthSuggestion", "Lio/reactivex/Observable;", "", "getShouldNeverShowFaceAuthSuggestion", "()Lio/reactivex/Observable;", "shouldSuggestFaceAuth", "getShouldSuggestFaceAuth", "clearFaceAuthSuggestionState", "saveFaceAuthSuggestionState", "hasShown", "saveFaceAuthSuggestionStateSavingTime", "", "currentDateTimeStamp", "saveNeverShowFaceAuthSuggestionState", "shouldNeverShow", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.resolveDrawable$default  reason: invalid class name */
    public interface Cdefault {
        @NotNull
        TitleBarRightButtonView.AnonymousClass1<Boolean> clearFaceAuthSuggestionState();

        long getFaceAuthSuggestionStateSavingTime();

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<Boolean> getShouldNeverShowFaceAuthSuggestion();

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<Boolean> getShouldSuggestFaceAuth();

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<Boolean> saveFaceAuthSuggestionState(boolean z);

        void saveFaceAuthSuggestionStateSavingTime(long j);

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<Boolean> saveNeverShowFaceAuthSuggestionState(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "apply", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class equals<T, R> implements RedDotDrawable<Boolean, Boolean> {
        final /* synthetic */ resolveDrawable setMax;

        equals(resolveDrawable resolvedrawable) {
            this.setMax = resolvedrawable;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            Intrinsics.checkNotNullParameter(bool, "it");
            long faceAuthSuggestionStateSavingTime = this.setMax.createSuggestionData().getFaceAuthSuggestionStateSavingTime();
            Calendar instance = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
            return Math.round((((float) (instance.getTimeInMillis() - new Date(faceAuthSuggestionStateSavingTime).getTime())) * 1.0f) / ((float) TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS))) == 14 ? Boolean.TRUE : bool;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/user/UserInfoResponse;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/user/source/network/result/UserInfoRpcResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<setTemplateConfig, disconnect> {
        final /* synthetic */ resolveDrawable setMin;

        getMax(resolveDrawable resolvedrawable) {
            this.setMin = resolvedrawable;
        }

        public final /* synthetic */ Object apply(Object obj) {
            setTemplateConfig settemplateconfig = (setTemplateConfig) obj;
            Intrinsics.checkNotNullParameter(settemplateconfig, "it");
            disconnect transform = this.setMin.userInfoMapper.transform(settemplateconfig);
            Intrinsics.checkNotNull(transform);
            return transform;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00050\u00050\u00040\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lid/dana/domain/auth/face/result/FaceAuthPopUpConsultationResult;", "kotlin.jvm.PlatformType", "it", "", "", "apply", "([Ljava/lang/Object;)Lid/dana/domain/auth/face/result/FaceAuthPopUpConsultationResult;"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<Object[], updateLoadingInfo> {
        public static final getMin setMax = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            Intrinsics.checkNotNullParameter(objArr, "it");
            Object obj2 = objArr[1];
            if (obj2 != null) {
                updateLoadingInfo faceAuthPopUpConsultationResult = populateIcon.toFaceAuthPopUpConsultationResult((disconnect) obj2, Intrinsics.areEqual(ArraysKt.firstOrNull((T[]) objArr), (Object) Boolean.TRUE));
                Intrinsics.checkNotNull(faceAuthPopUpConsultationResult);
                return faceAuthPopUpConsultationResult;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.domain.user.UserInfoResponse");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/auth/face/result/FaceAuthPopUpConsultationResult;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<updateLoadingInfo, TitleBarRightButtonView.AnonymousClass4<? extends updateLoadingInfo>> {
        final /* synthetic */ resolveDrawable length;
        final /* synthetic */ boolean setMin;

        length(resolveDrawable resolvedrawable, boolean z) {
            this.length = resolvedrawable;
            this.setMin = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final updateLoadingInfo updateloadinginfo = (updateLoadingInfo) obj;
            Intrinsics.checkNotNullParameter(updateloadinginfo, "it");
            return this.length.getUserInfo(this.setMin).map(new RedDotDrawable<setTemplateConfig, updateLoadingInfo>(this) {
                final /* synthetic */ length getMax;

                {
                    this.getMax = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    setTemplateConfig settemplateconfig = (setTemplateConfig) obj;
                    Intrinsics.checkNotNullParameter(settemplateconfig, "result");
                    updateLoadingInfo faceAuthPopUpConsultationResult = populateIcon.toFaceAuthPopUpConsultationResult(this.getMax.length.userInfoMapper.transform(settemplateconfig), updateloadinginfo.isFaceLoginFeatureEnabled());
                    Intrinsics.checkNotNull(faceAuthPopUpConsultationResult);
                    return faceAuthPopUpConsultationResult;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/auth/face/result/FaceAuthPopUpConsultationResult;", "kotlin.jvm.PlatformType", "isEnabled", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<Boolean, TitleBarRightButtonView.AnonymousClass4<? extends updateLoadingInfo>> {
        public static final setMax setMax = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r9;
            Boolean bool = (Boolean) obj;
            Intrinsics.checkNotNullParameter(bool, Constants.ENABLE_DISABLE);
            if (bool.booleanValue()) {
                r9 = TitleBarRightButtonView.AnonymousClass1.just(new updateLoadingInfo(true, false, false, false, false, 30, (DefaultConstructorMarker) null));
            } else {
                r9 = TitleBarRightButtonView.AnonymousClass1.error((Throwable) new Exception("Face login feature is disabled on AMCS."));
            }
            return r9;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public resolveDrawable(@NotNull onCallBack oncallback, @NotNull getAlias getalias, @NotNull font.Cdefault defaultR, @NotNull PackageQueryPoint packageQueryPoint, @NotNull DialogLayout dialogLayout, @NotNull b.AnonymousClass3 r7, @NotNull BackKeyDownPoint backKeyDownPoint, @NotNull getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r7, backKeyDownPoint, getapplaunchparams);
        Intrinsics.checkNotNullParameter(oncallback, "configEntityDataFactory");
        Intrinsics.checkNotNullParameter(getalias, "userInfoEntityDataFactory");
        Intrinsics.checkNotNullParameter(defaultR, "faceAuthSuggestionDataFactory");
        Intrinsics.checkNotNullParameter(packageQueryPoint, "userInfoMapper");
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(r7, "loginEntityDataFactory");
        Intrinsics.checkNotNullParameter(backKeyDownPoint, "securityGuardFacade");
        Intrinsics.checkNotNullParameter(getapplaunchparams, "errorConfigFactory");
        this.configEntityDataFactory = oncallback;
        this.userInfoEntityDataFactory = getalias;
        this.faceAuthSuggestionDataFactory = defaultR;
        this.userInfoMapper = packageQueryPoint;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<updateLoadingInfo> consultFaceAuthPopUpToBackend(boolean z, boolean z2) {
        if (z) {
            TitleBarRightButtonView.AnonymousClass1<updateLoadingInfo> authenticatedRequest = authenticatedRequest(TitleBarRightButtonView.AnonymousClass1.zip(CollectionsKt.listOf(createSplitConfigEntity().isFaceLoginEnabled().onErrorResumeNext(createAmcsConfigEntity().isFaceLoginEnabled()), getUserInfo(z2).map(new getMax(this))), getMin.setMax));
            Intrinsics.checkNotNullExpressionValue(authenticatedRequest, "authenticatedRequest(Obs…== true)!!\n            })");
            return authenticatedRequest;
        }
        TitleBarRightButtonView.AnonymousClass1<updateLoadingInfo> authenticatedRequest2 = authenticatedRequest(createSplitConfigEntity().isFaceLoginEnabled().timeout(3, TimeUnit.SECONDS).onErrorResumeNext(createAmcsConfigEntity().isFaceLoginEnabled()).concatMap(setMax.setMax).concatMap(new length(this, z2)));
        Intrinsics.checkNotNullExpressionValue(authenticatedRequest2, "authenticatedRequest(cre…          }\n            )");
        return authenticatedRequest2;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getShouldSuggestFaceAuth() {
        return shouldSuggestFaceAuthScreen();
    }

    private final TitleBarRightButtonView.AnonymousClass1<Boolean> shouldSuggestFaceAuthScreen() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createSuggestionData().getShouldSuggestFaceAuth().map(new equals(this));
        Intrinsics.checkNotNullExpressionValue(map, "createSuggestionData().s…\n            it\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getShouldNeverShowFaceAuthSuggestion() {
        return createSuggestionData().getShouldNeverShowFaceAuthSuggestion();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveFaceAuthSuggestionState(boolean z) {
        Cdefault createSuggestionData = createSuggestionData();
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
        createSuggestionData.saveFaceAuthSuggestionStateSavingTime(instance.getTimeInMillis());
        return createSuggestionData().saveFaceAuthSuggestionState(z);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveNeverShowFaceAuthSuggestionState(boolean z) {
        return createSuggestionData().saveNeverShowFaceAuthSuggestionState(z);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> clearFaceAuthSuggestionState() {
        return createSuggestionData().clearFaceAuthSuggestionState();
    }

    /* access modifiers changed from: private */
    public final TitleBarRightButtonView.AnonymousClass1<setTemplateConfig> getUserInfo(boolean z) {
        ResourceProviderPoint createFaceAuthInfoEntity = createFaceAuthInfoEntity();
        if (z) {
            return createFaceAuthInfoEntity.getUserInfo();
        }
        return createFaceAuthInfoEntity.getFaceAuthInfo();
    }

    private final AppMsgReceiver.AnonymousClass2 createAmcsConfigEntity() {
        AppMsgReceiver.AnonymousClass2 createData = this.configEntityDataFactory.createData("amcs");
        Intrinsics.checkNotNullExpressionValue(createData, "configEntityDataFactory.createData(Source.AMCS)");
        return createData;
    }

    private final AppMsgReceiver.AnonymousClass2 createSplitConfigEntity() {
        AppMsgReceiver.AnonymousClass2 createData = this.configEntityDataFactory.createData(Source.SPLIT);
        Intrinsics.checkNotNullExpressionValue(createData, "configEntityDataFactory.createData(Source.SPLIT)");
        return createData;
    }

    private final ResourceProviderPoint createFaceAuthInfoEntity() {
        ResourceProviderPoint createData = this.userInfoEntityDataFactory.createData("network");
        Intrinsics.checkNotNullExpressionValue(createData, "userInfoEntityDataFactor…reateData(Source.NETWORK)");
        return createData;
    }

    /* access modifiers changed from: private */
    public final Cdefault createSuggestionData() {
        return this.faceAuthSuggestionDataFactory.createData("local");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/auth/face/repository/source/entity/FaceAuthPopUpConsultationEntityRepository$Companion;", "", "()V", "TWO_WEEKS", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
