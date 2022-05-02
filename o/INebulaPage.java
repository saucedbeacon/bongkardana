package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class INebulaPage implements getAdapterPosition<ifContainsEmbedView> {
    private final b.C0007b<onWebViewDestory> globalNetworkRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B#\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u00100\fH\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0002J \u0010\u0013\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lid/dana/domain/globalnetwork/interactor/IsGnWelcomeFirstTime;", "Lid/dana/domain/common/ObservableUseCase;", "", "", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "globalNetworkRepository", "Lid/dana/domain/globalnetwork/GlobalNetworkRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/globalnetwork/GlobalNetworkRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "(Lkotlin/Unit;)Lio/reactivex/Observable;", "getCurrentCountryCodeWithGnCountryWhitelist", "Lkotlin/Pair;", "", "getFirstWelcomeAgreement", "isGNCountry", "currentCountryCode", "gnWhitelistCountries", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public final class H5PageHandler extends getItemAtIndex<Boolean, Unit> {
        /* access modifiers changed from: private */
        public final onWebViewDestory globalNetworkRepository;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00032(\u0010\u0005\u001a$\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u0003 \u0007*\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u00030\b0\u0006H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "currentCountryCode", "gnWhitelistCountries", "", "kotlin.jvm.PlatformType", "", "apply"}, k = 3, mv = {1, 4, 2})
        static final class getMax<T1, T2, R> implements removeNode<String, List<String>, Pair<? extends Boolean, ? extends String>> {
            final /* synthetic */ H5PageHandler length;

            getMax(H5PageHandler h5PageHandler) {
                this.length = h5PageHandler;
            }

            public final /* synthetic */ Object setMax(Object obj, Object obj2) {
                String str = (String) obj;
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(str, "currentCountryCode");
                Intrinsics.checkNotNullParameter(list, "gnWhitelistCountries");
                boolean z = true;
                if (!this.length.isGNCountry(str, list) || !(!Intrinsics.areEqual((Object) str, (Object) "ID"))) {
                    z = false;
                }
                return new Pair(Boolean.valueOf(z), str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "data", "Lkotlin/Pair;", "", "apply"}, k = 3, mv = {1, 4, 2})
        static final class setMin<T, R> implements RedDotDrawable<Pair<? extends Boolean, ? extends String>, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
            final /* synthetic */ H5PageHandler length;

            setMin(H5PageHandler h5PageHandler) {
                this.length = h5PageHandler;
            }

            public final /* synthetic */ Object apply(Object obj) {
                TitleBarRightButtonView.AnonymousClass1<Boolean> r2;
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "data");
                if (((Boolean) pair.getFirst()).booleanValue()) {
                    onWebViewDestory access$getGlobalNetworkRepository$p = this.length.globalNetworkRepository;
                    access$getGlobalNetworkRepository$p.saveSelectedCountryCode((String) pair.getSecond());
                    r2 = access$getGlobalNetworkRepository$p.getGnFirstWelcoming();
                } else {
                    r2 = TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
                }
                return r2;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @Inject
        public H5PageHandler(@Nullable appxLoadFailed appxloadfailed, @Nullable getScheme getscheme, @NotNull onWebViewDestory onwebviewdestory) {
            super(appxloadfailed, getscheme);
            Intrinsics.checkNotNullParameter(onwebviewdestory, "globalNetworkRepository");
            this.globalNetworkRepository = onwebviewdestory;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(@Nullable Unit unit) {
            return getFirstWelcomeAgreement();
        }

        private final TitleBarRightButtonView.AnonymousClass1<Boolean> getFirstWelcomeAgreement() {
            TitleBarRightButtonView.AnonymousClass1<R> flatMap = getCurrentCountryCodeWithGnCountryWhitelist().flatMap(new setMin(this));
            Intrinsics.checkNotNullExpressionValue(flatMap, "getCurrentCountryCodeWit…)\n            }\n        }");
            return flatMap;
        }

        private final TitleBarRightButtonView.AnonymousClass1<Pair<Boolean, String>> getCurrentCountryCodeWithGnCountryWhitelist() {
            TitleBarRightButtonView.AnonymousClass1<R> zipWith = this.globalNetworkRepository.getCurrentCountryCode().zipWith(this.globalNetworkRepository.getGnCountriesWhitelist(), new getMax(this));
            Intrinsics.checkNotNullExpressionValue(zipWith, "globalNetworkRepository.…untryCode)\n            })");
            return zipWith;
        }

        /* access modifiers changed from: private */
        public final boolean isGNCountry(String str, List<String> list) {
            return CollectionsKt.contains(list, str);
        }
    }

    public INebulaPage(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.globalNetworkRepositoryProvider = bVar3;
    }

    public final ifContainsEmbedView get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.globalNetworkRepositoryProvider.get());
    }

    public static INebulaPage create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3) {
        return new INebulaPage(bVar, bVar2, bVar3);
    }

    public static ifContainsEmbedView newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory) {
        return new ifContainsEmbedView(appxloadfailed, getscheme, onwebviewdestory);
    }
}
