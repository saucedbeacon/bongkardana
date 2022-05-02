package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class BeaconService implements getAdapterPosition<setDEFAULT_ARMA_SPEED> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public BeaconService(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final setDEFAULT_ARMA_SPEED get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB3\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0002J\u001a\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u0014H\u0002J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J,\u0010\u0019\u001a&\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00150\u0015 \u001a*\u0012\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00150\u0015\u0018\u00010\u00100\u0010H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lid/dana/domain/social/interactor/GetFriendsFeedWithInitFeedAndFeatureCheck;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/social/model/SocialFeed;", "", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "socialWidgetRepository", "Lid/dana/domain/social/SocialWidgetRepository;", "socialMediaRepository", "Lid/dana/domain/social/SocialMediaRepository;", "socialSyncRepository", "Lid/dana/domain/social/SocialSyncRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/social/SocialWidgetRepository;Lid/dana/domain/social/SocialMediaRepository;Lid/dana/domain/social/SocialSyncRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "(Lkotlin/Unit;)Lio/reactivex/Observable;", "checkInitFeedStatus", "Lkotlin/Function1;", "", "Lid/dana/domain/social/model/InitFeed;", "getFriendsFeed", "isInitFeedFinished", "isSocialFeedFeatureEnable", "kotlin.jvm.PlatformType", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public final class BeaconBinder extends parseFailed<getScanCallbackIntent, Unit> {
        @NotNull
        public static final length Companion = new length((DefaultConstructorMarker) null);
        public static final int ITEM_LIMIT_PER_PAGE = 3;
        /* access modifiers changed from: private */
        public final DistanceConfigFetcher socialMediaRepository;
        /* access modifiers changed from: private */
        public final getRequestedModel socialSyncRepository;
        private final getException socialWidgetRepository;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/InitFeed;", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMax extends Lambda implements Function1<Boolean, setBeaconParsers> {
            final /* synthetic */ BeaconBinder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMax(BeaconBinder beaconBinder) {
                super(1);
                this.this$0 = beaconBinder;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return invoke(((Boolean) obj).booleanValue());
            }

            @NotNull
            public final setBeaconParsers invoke(boolean z) {
                return (setBeaconParsers) xp2.setMax(EmptyCoroutineContext.INSTANCE, new Function2<initToken, Continuation<? super setBeaconParsers>, Object>(this, (Continuation) null) {
                    int label;
                    final /* synthetic */ getMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        Intrinsics.checkNotNullParameter(continuation, "completion");
                        return 

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "test", "(Ljava/lang/Boolean;)Z"}, k = 3, mv = {1, 4, 2})
                        static final class getMin<T> implements getChildren<Boolean> {
                            public static final getMin getMax = new getMin();

                            getMin() {
                            }

                            public final /* synthetic */ boolean test(Object obj) {
                                return length((Boolean) obj);
                            }

                            private static boolean length(@NotNull Boolean bool) {
                                Intrinsics.checkNotNullParameter(bool, "it");
                                return bool.booleanValue();
                            }
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "initFeed", "Lid/dana/domain/social/model/InitFeed;", "invoke"}, k = 3, mv = {1, 4, 2})
                        static final class setMin extends Lambda implements Function1<setBeaconParsers, Boolean> {
                            public static final setMin INSTANCE = new setMin();

                            setMin() {
                                super(1);
                            }

                            public final /* synthetic */ Object invoke(Object obj) {
                                return Boolean.valueOf(invoke((setBeaconParsers) obj));
                            }

                            public final boolean invoke(@NotNull setBeaconParsers setbeaconparsers) {
                                Intrinsics.checkNotNullParameter(setbeaconparsers, "initFeed");
                                return setbeaconparsers.isFinished();
                            }
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        @Inject
                        public BeaconBinder(@Nullable appxLoadFailed appxloadfailed, @Nullable getScheme getscheme, @NotNull getException getexception, @NotNull DistanceConfigFetcher distanceConfigFetcher, @NotNull getRequestedModel getrequestedmodel) {
                            super(appxloadfailed, getscheme);
                            Intrinsics.checkNotNullParameter(getexception, "socialWidgetRepository");
                            Intrinsics.checkNotNullParameter(distanceConfigFetcher, "socialMediaRepository");
                            Intrinsics.checkNotNullParameter(getrequestedmodel, "socialSyncRepository");
                            this.socialWidgetRepository = getexception;
                            this.socialMediaRepository = distanceConfigFetcher;
                            this.socialSyncRepository = getrequestedmodel;
                        }

                        /* JADX WARNING: type inference failed for: r1v0, types: [o.getService] */
                        /* JADX WARNING: type inference failed for: r1v1, types: [o.setScanPeriods] */
                        /* JADX WARNING: type inference failed for: r1v2, types: [o.getService] */
                        /* access modifiers changed from: protected */
                        /* JADX WARNING: Multi-variable type inference failed */
                        @org.jetbrains.annotations.NotNull
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final o.TitleBarRightButtonView.AnonymousClass1<o.getScanCallbackIntent> buildUseCaseObservable(@org.jetbrains.annotations.Nullable kotlin.Unit r3) {
                            /*
                                r2 = this;
                                o.TitleBarRightButtonView$1 r3 = r2.isSocialFeedFeatureEnable()
                                kotlin.jvm.functions.Function1 r0 = r2.checkInitFeedStatus()
                                if (r0 == 0) goto L_0x0010
                                o.getService r1 = new o.getService
                                r1.<init>(r0)
                                r0 = r1
                            L_0x0010:
                                o.RedDotDrawable r0 = (o.RedDotDrawable) r0
                                o.TitleBarRightButtonView$1 r3 = r3.map(r0)
                                kotlin.jvm.functions.Function1 r0 = r2.isInitFeedFinished()
                                if (r0 == 0) goto L_0x0022
                                o.setScanPeriods r1 = new o.setScanPeriods
                                r1.<init>(r0)
                                r0 = r1
                            L_0x0022:
                                o.getChildren r0 = (o.getChildren) r0
                                o.TitleBarRightButtonView$1 r3 = r3.filter(r0)
                                kotlin.jvm.functions.Function1 r0 = r2.getFriendsFeed()
                                if (r0 == 0) goto L_0x0034
                                o.getService r1 = new o.getService
                                r1.<init>(r0)
                                r0 = r1
                            L_0x0034:
                                o.RedDotDrawable r0 = (o.RedDotDrawable) r0
                                o.TitleBarRightButtonView$1 r3 = r3.flatMap(r0)
                                java.lang.String r0 = "isSocialFeedFeatureEnabl…flatMap(getFriendsFeed())"
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
                                return r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: o.BeaconService.BeaconBinder.buildUseCaseObservable(kotlin.Unit):o.TitleBarRightButtonView$1");
                        }

                        private final Function1<setBeaconParsers, Boolean> isInitFeedFinished() {
                            return setMin.INSTANCE;
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lid/dana/domain/social/model/SocialFeed;", "it", "Lid/dana/domain/social/model/InitFeed;", "invoke"}, k = 3, mv = {1, 4, 2})
                        static final class setMax extends Lambda implements Function1<setBeaconParsers, TitleBarRightButtonView.AnonymousClass1<getScanCallbackIntent>> {
                            final /* synthetic */ BeaconBinder this$0;

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            setMax(BeaconBinder beaconBinder) {
                                super(1);
                                this.this$0 = beaconBinder;
                            }

                            @NotNull
                            public final TitleBarRightButtonView.AnonymousClass1<getScanCallbackIntent> invoke(@NotNull setBeaconParsers setbeaconparsers) {
                                Intrinsics.checkNotNullParameter(setbeaconparsers, "it");
                                return this.this$0.socialMediaRepository.getFeeds((String) null, 3, (String) null, (String) null, "timelineFeed", 2, CollectionsKt.emptyList());
                            }
                        }

                        private final Function1<setBeaconParsers, TitleBarRightButtonView.AnonymousClass1<getScanCallbackIntent>> getFriendsFeed() {
                            return new setMax(this);
                        }

                        private final Function1<Boolean, setBeaconParsers> checkInitFeedStatus() {
                            return new getMax(this);
                        }

                        private final TitleBarRightButtonView.AnonymousClass1<Boolean> isSocialFeedFeatureEnable() {
                            return this.socialWidgetRepository.isSocialFeatureEnable().filter(getMin.getMax);
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/domain/social/interactor/GetFriendsFeedWithInitFeedAndFeatureCheck$Companion;", "", "()V", "ITEM_LIMIT_PER_PAGE", "", "domain_release"}, k = 1, mv = {1, 4, 2})
                        public static final class length {
                            private length() {
                            }

                            public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
                                this();
                            }
                        }
                    }

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/social/interactor/GetGlobalNotification;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/social/model/SocialFeed;", "Lid/dana/domain/social/interactor/GetGlobalNotification$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "socialMediaRepository", "Lid/dana/domain/social/SocialMediaRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/social/SocialMediaRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
                    public final class IncomingHandler extends parseFailed<getScanCallbackIntent, getMax> {
                        private final DistanceConfigFetcher socialMediaRepository;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        @Inject
                        public IncomingHandler(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull DistanceConfigFetcher distanceConfigFetcher) {
                            super(appxloadfailed, getscheme);
                            Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
                            Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
                            Intrinsics.checkNotNullParameter(distanceConfigFetcher, "socialMediaRepository");
                            this.socialMediaRepository = distanceConfigFetcher;
                        }

                        /* access modifiers changed from: protected */
                        @NotNull
                        public final TitleBarRightButtonView.AnonymousClass1<getScanCallbackIntent> buildUseCaseObservable(@NotNull getMax getmax) {
                            Intrinsics.checkNotNullParameter(getmax, "params");
                            return this.socialMediaRepository.getGlobalNotification(getmax.getPageSize(), getmax.getMaxId(), getmax.getMinId());
                        }

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lid/dana/domain/social/interactor/GetGlobalNotification$Params;", "", "pageSize", "", "maxId", "", "minId", "(ILjava/lang/String;Ljava/lang/String;)V", "getMaxId", "()Ljava/lang/String;", "getMinId", "getPageSize", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
                        public static final class getMax {
                            @NotNull
                            private final String maxId;
                            @NotNull
                            private final String minId;
                            private final int pageSize;

                            public static /* synthetic */ getMax copy$default(getMax getmax, int i, String str, String str2, int i2, Object obj) {
                                if ((i2 & 1) != 0) {
                                    i = getmax.pageSize;
                                }
                                if ((i2 & 2) != 0) {
                                    str = getmax.maxId;
                                }
                                if ((i2 & 4) != 0) {
                                    str2 = getmax.minId;
                                }
                                return getmax.copy(i, str, str2);
                            }

                            public final int component1() {
                                return this.pageSize;
                            }

                            @NotNull
                            public final String component2() {
                                return this.maxId;
                            }

                            @NotNull
                            public final String component3() {
                                return this.minId;
                            }

                            @NotNull
                            public final getMax copy(int i, @NotNull String str, @NotNull String str2) {
                                Intrinsics.checkNotNullParameter(str, "maxId");
                                Intrinsics.checkNotNullParameter(str2, "minId");
                                return new getMax(i, str, str2);
                            }

                            public final boolean equals(@Nullable Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof getMax)) {
                                    return false;
                                }
                                getMax getmax = (getMax) obj;
                                return this.pageSize == getmax.pageSize && Intrinsics.areEqual((Object) this.maxId, (Object) getmax.maxId) && Intrinsics.areEqual((Object) this.minId, (Object) getmax.minId);
                            }

                            @NotNull
                            public final String toString() {
                                StringBuilder sb = new StringBuilder("Params(pageSize=");
                                sb.append(this.pageSize);
                                sb.append(", maxId=");
                                sb.append(this.maxId);
                                sb.append(", minId=");
                                sb.append(this.minId);
                                sb.append(")");
                                return sb.toString();
                            }

                            public getMax(int i, @NotNull String str, @NotNull String str2) {
                                Intrinsics.checkNotNullParameter(str, "maxId");
                                Intrinsics.checkNotNullParameter(str2, "minId");
                                this.pageSize = i;
                                this.maxId = str;
                                this.minId = str2;
                            }

                            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                            public /* synthetic */ getMax(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                                this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
                            }

                            @NotNull
                            public final String getMaxId() {
                                return this.maxId;
                            }

                            @NotNull
                            public final String getMinId() {
                                return this.minId;
                            }

                            public final int getPageSize() {
                                return this.pageSize;
                            }

                            public final int hashCode() {
                                int hashCode = Integer.valueOf(this.pageSize).hashCode() * 31;
                                String str = this.maxId;
                                int i = 0;
                                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                                String str2 = this.minId;
                                if (str2 != null) {
                                    i = str2.hashCode();
                                }
                                return hashCode2 + i;
                            }
                        }
                    }

                    public static BeaconService create(b.C0007b<setDefaultFontSize> bVar) {
                        return new BeaconService(bVar);
                    }

                    public static setDEFAULT_ARMA_SPEED newInstance(setDefaultFontSize setdefaultfontsize) {
                        return new setDEFAULT_ARMA_SPEED(setdefaultfontsize);
                    }
                }
