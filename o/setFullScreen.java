package o;

import java.util.List;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverBottomPopupDialog;
import o.OpenAPIBridgeExtension;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J4\u0010\u0010\u001a&\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00020\u0002 \u0011*\u0012\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u000e0\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J&\u0010\u0014\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00172\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J \u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0013H\u0002JD\u0010 \u001a&\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00020\u0002 \u0011*\u0012\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u000e0\u000e2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lid/dana/domain/referral/interactor/GetReferralEngagementDialog;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/referral/model/ReferralEngagementDialog;", "Lid/dana/domain/referral/interactor/GetReferralEngagementDialog$Param;", "referralRepository", "Lid/dana/domain/referral/ReferralRepository;", "configRepository", "Lid/dana/domain/featureconfig/FeatureConfigRepository;", "myReferralConsultRepository", "Lid/dana/domain/referral/MyReferralConsultRepository;", "(Lid/dana/domain/referral/ReferralRepository;Lid/dana/domain/featureconfig/FeatureConfigRepository;Lid/dana/domain/referral/MyReferralConsultRepository;)V", "needTimer", "", "buildUseCase", "Lio/reactivex/Observable;", "params", "checkDialogAvailability", "kotlin.jvm.PlatformType", "currentUnixEpochTime", "", "checkDialogCaches", "dialogCaches", "", "Lid/dana/domain/referral/model/ReferralEngagementDialogCache;", "dialogConfig", "Lid/dana/domain/referral/model/ReferralEngagementDialogConfig;", "getEligibleDialogCache", "getRemainTime", "popupTimerSeed", "timerDuration", "isTimerPassed", "deltaPopupTimer", "onCheckReferralAvailability", "referralConsultEnabled", "enable", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setFullScreen extends APWebChromeClient<getComponentAuth, length> {
    private final setDefaultFontSize configRepository;
    private final GriverBottomPopupDialog.AnonymousClass1 myReferralConsultRepository;
    private boolean needTimer;
    /* access modifiers changed from: private */
    public final GriverSwtich referralRepository;

    private final boolean isTimerPassed(long j, long j2) {
        return j >= j2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lid/dana/domain/referral/model/ReferralEngagementDialog;", "myReferralConsult", "Lid/dana/domain/referral/model/MyReferralConsultRpcResponse;", "enable", "", "apply", "(Lid/dana/domain/referral/model/MyReferralConsultRpcResponse;Ljava/lang/Boolean;)Lid/dana/domain/referral/model/ReferralEngagementDialog;"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T1, T2, R> implements removeNode<appxrpc, Boolean, getComponentAuth> {
        final /* synthetic */ length getMin;
        final /* synthetic */ setFullScreen setMax;

        getMax(setFullScreen setfullscreen, length length) {
            this.setMax = setfullscreen;
            this.getMin = length;
        }

        public final /* synthetic */ Object setMax(Object obj, Object obj2) {
            appxrpc appxrpc = (appxrpc) obj;
            Boolean bool = (Boolean) obj2;
            Intrinsics.checkNotNullParameter(appxrpc, "myReferralConsult");
            Intrinsics.checkNotNullParameter(bool, "enable");
            return (getComponentAuth) this.setMax.onCheckReferralAvailability(appxrpc.isCampaignEnable(), bool.booleanValue(), this.getMin.getCurrentUnixEpochTime$domain_release()).blockingFirst();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/referral/model/ReferralEngagementDialog;", "kotlin.jvm.PlatformType", "dialogConfig", "Lid/dana/domain/referral/model/ReferralEngagementDialogConfig;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<OpenAPIBridgeExtension.AnonymousClass1, TitleBarRightButtonView.AnonymousClass4<? extends getComponentAuth>> {
        final /* synthetic */ setFullScreen getMin;
        final /* synthetic */ long length;

        setMax(setFullScreen setfullscreen, long j) {
            this.getMin = setfullscreen;
            this.length = j;
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1<R> r13;
            final OpenAPIBridgeExtension.AnonymousClass1 r132 = (OpenAPIBridgeExtension.AnonymousClass1) obj;
            Intrinsics.checkNotNullParameter(r132, "dialogConfig");
            if (!r132.getEnable()) {
                r13 = TitleBarRightButtonView.AnonymousClass1.just(new getComponentAuth(false, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 127, (DefaultConstructorMarker) null));
            } else {
                r13 = this.getMin.referralRepository.getDialogCaches().map(new RedDotDrawable<List<OpenAPIBridgeExtension.AnonymousClass3>, getComponentAuth>(this) {
                    final /* synthetic */ setMax setMax;

                    {
                        this.setMax = r1;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        List list = (List) obj;
                        Intrinsics.checkNotNullParameter(list, "it");
                        setFullScreen setfullscreen = this.setMax.getMin;
                        OpenAPIBridgeExtension.AnonymousClass1 r1 = r132;
                        Intrinsics.checkNotNullExpressionValue(r1, "dialogConfig");
                        return setfullscreen.checkDialogCaches(list, r1, this.setMax.length);
                    }
                });
            }
            return r13;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setFullScreen(@NotNull GriverSwtich griverSwtich, @NotNull setDefaultFontSize setdefaultfontsize, @NotNull GriverBottomPopupDialog.AnonymousClass1 r5) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(griverSwtich, "referralRepository");
        Intrinsics.checkNotNullParameter(setdefaultfontsize, "configRepository");
        Intrinsics.checkNotNullParameter(r5, "myReferralConsultRepository");
        this.referralRepository = griverSwtich;
        this.configRepository = setdefaultfontsize;
        this.myReferralConsultRepository = r5;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getComponentAuth> buildUseCase(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "params");
        TitleBarRightButtonView.AnonymousClass1<getComponentAuth> zip = TitleBarRightButtonView.AnonymousClass1.zip(this.myReferralConsultRepository.getReferralConsult(), this.configRepository.isShowReferralCode(), new getMax(this, length2));
        Intrinsics.checkNotNullExpressionValue(zip, "Observable.zip(\n        …ingFirst()\n            })");
        return zip;
    }

    /* access modifiers changed from: private */
    public final TitleBarRightButtonView.AnonymousClass1<getComponentAuth> onCheckReferralAvailability(boolean z, boolean z2, long j) {
        if (!z || !z2) {
            return TitleBarRightButtonView.AnonymousClass1.just(new getComponentAuth(false, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 127, (DefaultConstructorMarker) null));
        }
        return checkDialogAvailability(j);
    }

    private final TitleBarRightButtonView.AnonymousClass1<getComponentAuth> checkDialogAvailability(long j) {
        return this.referralRepository.getReferralEngagementDialogConfig().flatMap(new setMax(this, j));
    }

    /* access modifiers changed from: private */
    public final getComponentAuth checkDialogCaches(List<OpenAPIBridgeExtension.AnonymousClass3> list, OpenAPIBridgeExtension.AnonymousClass1 r23, long j) {
        OpenAPIBridgeExtension.AnonymousClass3 eligibleDialogCache = getEligibleDialogCache(list);
        if (eligibleDialogCache == null) {
            return new getComponentAuth(false, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 127, (DefaultConstructorMarker) null);
        }
        return new getComponentAuth(true, r23.getDialogTitleId(), r23.getDialogTitleEn(), r23.getDialogDescriptionId(), r23.getDialogDescriptionEn(), getRemainTime(eligibleDialogCache.getShowPopUpTimerSeed(), r23.getTimerDuration(), j), eligibleDialogCache.getScenario());
    }

    private final long getRemainTime(long j, long j2, long j3) {
        long j4 = j3 - j;
        boolean isTimerPassed = isTimerPassed(j4, j2);
        if (isTimerPassed && !this.needTimer) {
            this.needTimer = true;
            return 0;
        } else if (!isTimerPassed) {
            return j2 - j4;
        } else {
            this.needTimer = false;
            return j2;
        }
    }

    private final OpenAPIBridgeExtension.AnonymousClass3 getEligibleDialogCache(List<OpenAPIBridgeExtension.AnonymousClass3> list) {
        try {
            for (Object next : list) {
                if (((OpenAPIBridgeExtension.AnonymousClass3) next).getShowHomeReferralPopup()) {
                    return (OpenAPIBridgeExtension.AnonymousClass3) next;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Exception unused) {
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/domain/referral/interactor/GetReferralEngagementDialog$Param;", "", "currentUnixEpochTime", "", "(J)V", "getCurrentUnixEpochTime$domain_release", "()J", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private final long currentUnixEpochTime;

        public length(long j) {
            this.currentUnixEpochTime = j;
        }

        public final long getCurrentUnixEpochTime$domain_release() {
            return this.currentUnixEpochTime;
        }
    }
}
