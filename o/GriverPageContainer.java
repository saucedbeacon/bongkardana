package o;

import android.content.Context;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.tracker.TrackerKey;
import id.dana.twilio.onboarding.TwilioIntroductionActivity;
import id.dana.twilio.onboarding.TwilioIntroductionModule;
import java.util.Comparator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.PrepareException;
import o.TitleBarExtension;
import o.b;
import o.convertDipToPx;
import o.handleCloseEvent;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/tutorial/TutorialPresenter;", "Lid/dana/tutorial/TutorialContract$Presenter;", "view", "Lid/dana/tutorial/TutorialContract$View;", "getTutorials", "Lid/dana/domain/danainfo/interactor/GetTutorials;", "mapper", "Lid/dana/tutorial/mapper/TutorialModelMapper;", "(Lid/dana/tutorial/TutorialContract$View;Lid/dana/domain/danainfo/interactor/GetTutorials;Lid/dana/tutorial/mapper/TutorialModelMapper;)V", "getTutorial", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverPageContainer implements handleCloseEvent.setMax {
    /* access modifiers changed from: private */
    public final handleCloseEvent.length getMax;
    private final onRequestFocus length;
    /* access modifiers changed from: private */
    public final onRefresh setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/twilio/identityverification/TwilioIdentityVerificationContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface H5CloseHandler {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J \u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lid/dana/twilio/identityverification/TwilioIdentityVerificationContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "getChallengeDetails", "", "challengeSid", "", "factorSid", "isChallengeExpired", "", "loginTime", "Ljava/util/Date;", "timeout", "", "updateChallenge", "newStatus", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public interface getMin extends parentColumns.setMin {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lid/dana/twilio/identityverification/TwilioIdentityVerificationContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onGetChallengeDetails", "", "challengeDetails", "", "", "onUpdateChallenge", "isSuccess", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public interface setMin extends parentColumns.getMax {
            void getMax(boolean z);

            void length(@NotNull Map<String, String> map);
        }
    }

    @JvmDefault
    public final void setMax() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ GriverPageContainer this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(GriverPageContainer griverPageContainer) {
            super(1);
            this.this$0 = griverPageContainer;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            handleCloseEvent.length unused = this.this$0.getMax;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lid/dana/domain/promotion/Space;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<GriverAMCSLiteAppUpdater, Unit> {
        final /* synthetic */ GriverPageContainer this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(GriverPageContainer griverPageContainer) {
            super(1);
            this.this$0 = griverPageContainer;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GriverAMCSLiteAppUpdater) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0055  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke(@org.jetbrains.annotations.NotNull o.GriverAMCSLiteAppUpdater r4) {
            /*
                r3 = this;
                java.lang.String r0 = "result"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.util.List r4 = r4.getCdpContents()
                if (r4 == 0) goto L_0x0052
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4, r1)
                r0.<init>(r1)
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.Iterator r4 = r4.iterator()
            L_0x001e:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x003a
                java.lang.Object r1 = r4.next()
                o.getDefaultProxy r1 = (o.getDefaultProxy) r1
                o.GriverPageContainer r2 = r3.this$0
                o.onRefresh r2 = r2.setMin
                java.lang.Object r1 = r2.apply(r1)
                o.onReachPullRefreshDistance r1 = (o.onReachPullRefreshDistance) r1
                r0.add(r1)
                goto L_0x001e
            L_0x003a:
                java.util.List r0 = (java.util.List) r0
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                o.GriverPageContainer$length$getMax r4 = new o.GriverPageContainer$length$getMax
                r4.<init>()
                java.util.Comparator r4 = (java.util.Comparator) r4
                java.util.List r4 = kotlin.collections.CollectionsKt.sortedWith(r0, r4)
                if (r4 == 0) goto L_0x0052
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.List r4 = kotlin.collections.CollectionsKt.filterNotNull(r4)
                goto L_0x0053
            L_0x0052:
                r4 = 0
            L_0x0053:
                if (r4 != 0) goto L_0x0059
                java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            L_0x0059:
                o.GriverPageContainer r0 = r3.this$0
                o.handleCloseEvent$length r0 = r0.getMax
                r0.getMax(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.GriverPageContainer.length.invoke(o.GriverAMCSLiteAppUpdater):void");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 4, 2})
        public static final class getMax<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                Integer num;
                onReachPullRefreshDistance onreachpullrefreshdistance = (onReachPullRefreshDistance) t;
                Integer num2 = null;
                if (onreachpullrefreshdistance != null) {
                    num = Integer.valueOf(onreachpullrefreshdistance.setMin);
                } else {
                    num = null;
                }
                Comparable comparable = num;
                onReachPullRefreshDistance onreachpullrefreshdistance2 = (onReachPullRefreshDistance) t2;
                if (onreachpullrefreshdistance2 != null) {
                    num2 = Integer.valueOf(onreachpullrefreshdistance2.setMin);
                }
                return ComparisonsKt.compareValues(comparable, num2);
            }
        }
    }

    @Inject
    public GriverPageContainer(@NotNull handleCloseEvent.length length2, @NotNull onRequestFocus onrequestfocus, @NotNull onRefresh onrefresh) {
        Intrinsics.checkNotNullParameter(length2, "view");
        Intrinsics.checkNotNullParameter(onrequestfocus, "getTutorials");
        Intrinsics.checkNotNullParameter(onrefresh, "mapper");
        this.getMax = length2;
        this.length = onrequestfocus;
        this.setMin = onrefresh;
    }

    public final class PullFreshCallback implements GriverRootView {
        private final PrepareException.AnonymousClass1 length;
        private b.C0007b<TitleBarExtension.AnonymousClass1.length> setMax;

        public /* synthetic */ PullFreshCallback(TwilioIntroductionModule twilioIntroductionModule, PrepareException.AnonymousClass1 r2, byte b) {
            this(twilioIntroductionModule, r2);
        }

        private PullFreshCallback(TwilioIntroductionModule twilioIntroductionModule, PrepareException.AnonymousClass1 r2) {
            this.length = r2;
            this.setMax = isScrap.getMin(TitleBarExtension.SegControlCheckCallback.setMin(twilioIntroductionModule));
        }

        public static final class length {
            public PrepareException.AnonymousClass1 getMin;
            public TwilioIntroductionModule setMin;

            public /* synthetic */ length(byte b) {
                this();
            }

            private length() {
            }
        }

        public final void getMin(TwilioIntroductionActivity twilioIntroductionActivity) {
            TwilioIntroductionActivity twilioIntroductionActivity2 = twilioIntroductionActivity;
            AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.length.IPostMessageService$Stub$Proxy();
            if (IPostMessageService$Stub$Proxy != null) {
                matchInfo.setMin(twilioIntroductionActivity2, IPostMessageService$Stub$Proxy);
                applyChanges ICustomTabsCallback$Stub = this.length.ICustomTabsCallback$Stub();
                if (ICustomTabsCallback$Stub != null) {
                    applyChanges applychanges = ICustomTabsCallback$Stub;
                    appxLoadFailed length2 = this.length.length();
                    if (length2 != null) {
                        appxLoadFailed appxloadfailed = length2;
                        getScheme min = this.length.getMin();
                        if (min != null) {
                            getScheme getscheme = min;
                            setDefaultFontSize updateVisuals = this.length.updateVisuals();
                            if (updateVisuals != null) {
                                matchInfo.length(twilioIntroductionActivity2, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                                Context max = this.length.getMax();
                                if (max != null) {
                                    Context context = max;
                                    TitleBarExtension.AnonymousClass1.length length3 = this.setMax.get();
                                    onBatchScanResults validateRelationship = this.length.validateRelationship();
                                    if (validateRelationship != null) {
                                        getDetectedCrashCount getdetectedcrashcount = new getDetectedCrashCount(validateRelationship);
                                        appxLoadFailed length4 = this.length.length();
                                        if (length4 != null) {
                                            appxLoadFailed appxloadfailed2 = length4;
                                            getScheme min2 = this.length.getMin();
                                            if (min2 != null) {
                                                getScheme getscheme2 = min2;
                                                isPacketDistinct mayLaunchUrl = this.length.mayLaunchUrl();
                                                if (mayLaunchUrl != null) {
                                                    onNonBeaconLeScan onnonbeaconlescan = new onNonBeaconLeScan(appxloadfailed2, getscheme2, mayLaunchUrl);
                                                    onBatchScanResults validateRelationship2 = this.length.validateRelationship();
                                                    if (validateRelationship2 != null) {
                                                        isLastRecoverySucceeded islastrecoverysucceeded = new isLastRecoverySucceeded(validateRelationship2);
                                                        appxLoadFailed length5 = this.length.length();
                                                        if (length5 != null) {
                                                            appxLoadFailed appxloadfailed3 = length5;
                                                            getScheme min3 = this.length.getMin();
                                                            if (min3 != null) {
                                                                getScheme getscheme3 = min3;
                                                                isPacketDistinct mayLaunchUrl2 = this.length.mayLaunchUrl();
                                                                if (mayLaunchUrl2 != null) {
                                                                    ScanFilterUtils scanFilterUtils = new ScanFilterUtils(appxloadfailed3, getscheme3, mayLaunchUrl2);
                                                                    appxLoadFailed length6 = this.length.length();
                                                                    if (length6 != null) {
                                                                        appxLoadFailed appxloadfailed4 = length6;
                                                                        getScheme min4 = this.length.getMin();
                                                                        if (min4 != null) {
                                                                            getScheme getscheme4 = min4;
                                                                            isPacketDistinct mayLaunchUrl3 = this.length.mayLaunchUrl();
                                                                            if (mayLaunchUrl3 != null) {
                                                                                getStartIndex getstartindex = new getStartIndex(appxloadfailed4, getscheme4, mayLaunchUrl3);
                                                                                appxLoadFailed length7 = this.length.length();
                                                                                if (length7 != null) {
                                                                                    appxLoadFailed appxloadfailed5 = length7;
                                                                                    getScheme min5 = this.length.getMin();
                                                                                    if (min5 != null) {
                                                                                        getScheme getscheme5 = min5;
                                                                                        isPacketDistinct mayLaunchUrl4 = this.length.mayLaunchUrl();
                                                                                        if (mayLaunchUrl4 != null) {
                                                                                            BootstrapNotifier bootstrapNotifier = new BootstrapNotifier(appxloadfailed5, getscheme5, mayLaunchUrl4);
                                                                                            appxLoadFailed length8 = this.length.length();
                                                                                            if (length8 != null) {
                                                                                                appxLoadFailed appxloadfailed6 = length8;
                                                                                                getScheme min6 = this.length.getMin();
                                                                                                if (min6 != null) {
                                                                                                    getScheme getscheme6 = min6;
                                                                                                    onBatchScanResults validateRelationship3 = this.length.validateRelationship();
                                                                                                    if (validateRelationship3 != null) {
                                                                                                        onProgressEnd.setMin(twilioIntroductionActivity2, new showBackHome(context, length3, getdetectedcrashcount, onnonbeaconlescan, islastrecoverysucceeded, scanFilterUtils, getstartindex, bootstrapNotifier, new getPdus(appxloadfailed6, getscheme6, validateRelationship3)));
                                                                                                        return;
                                                                                                    }
                                                                                                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                                                                }
                                                                                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                                                            }
                                                                                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                                                        }
                                                                                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                                                    }
                                                                                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                                                }
                                                                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                                            }
                                                                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                                        }
                                                                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                                    }
                                                                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                                }
                                                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                            }
                                                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                        }
                                                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                    }
                                                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                }
                                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                            }
                                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                        }
                                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                    }
                                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                }
                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMax() {
        this.length.execute(Unit.INSTANCE, new length(this), new getMin(this));
    }

    /* renamed from: o.GriverPageContainer$1  reason: invalid class name */
    public final class AnonymousClass1 {
        public static void setMax(Context context, String str, String str2) {
            convertDipToPx.length length = new convertDipToPx.length(context);
            length.getMax = TrackerKey.Event.SERVICE_OPEN;
            convertDipToPx.length max = length.setMax(TrackerKey.ServiceProperty.SERVICE_NAME, str).setMax(TrackerKey.ServiceProperty.SERVICE_CATEGORY, str2);
            max.setMin();
            genTextSelector.getMax(new convertDipToPx(max, (byte) 0));
        }
    }
}
