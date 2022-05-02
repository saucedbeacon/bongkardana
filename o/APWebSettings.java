package o;

import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class APWebSettings {
    private final String link;

    public final class PluginState implements getAdapterPosition<setPageCacheCapacity> {
        private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

        public PluginState(b.C0007b<setDefaultFontSize> bVar) {
            this.featureConfigRepositoryProvider = bVar;
        }

        public final setPageCacheCapacity get() {
            return newInstance(this.featureConfigRepositoryProvider.get());
        }

        public static PluginState create(b.C0007b<setDefaultFontSize> bVar) {
            return new PluginState(bVar);
        }

        public static setPageCacheCapacity newInstance(setDefaultFontSize setdefaultfontsize) {
            return new setPageCacheCapacity(setdefaultfontsize);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/domain/featureconfig/interactor/CheckWhitelistedValidDomain;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "", "featureConfigRepository", "Lid/dana/domain/featureconfig/FeatureConfigRepository;", "(Lid/dana/domain/featureconfig/FeatureConfigRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
    public final class LayoutAlgorithm extends APWebChromeClient<Boolean, String> {
        private final setDefaultFontSize featureConfigRepository;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012(\u0010\u0003\u001a$\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u00050\u00060\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "listDomains", "", "", "", "apply", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
        static final class setMax<T, R> implements RedDotDrawable<List<String>, Boolean> {
            final /* synthetic */ String getMax;

            setMax(String str) {
                this.getMax = str;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List<String> list = (List) obj;
                Intrinsics.checkNotNullParameter(list, "listDomains");
                for (String str : list) {
                    Intrinsics.checkNotNullExpressionValue(str, "whitelistedDomain");
                    if (StringsKt.contains$default((CharSequence) this.getMax, (CharSequence) str, false, 2, (Object) null)) {
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @Inject
        public LayoutAlgorithm(@NotNull setDefaultFontSize setdefaultfontsize) {
            super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(setdefaultfontsize, "featureConfigRepository");
            this.featureConfigRepository = setdefaultfontsize;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "params");
            TitleBarRightButtonView.AnonymousClass1<R> map = this.featureConfigRepository.getValidDomainWhitelisted().map(new setMax(str));
            Intrinsics.checkNotNullExpressionValue(map, "featureConfigRepository.…      false\n            }");
            return map;
        }
    }

    public APWebSettings(String str) {
        this.link = str;
    }

    public final class TextSize implements getAdapterPosition<RenderPriority> {
        private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;
        private final b.C0007b<getScheme> postExecutionThreadProvider;
        private final b.C0007b<appxLoadFailed> threadExecutorProvider;

        public TextSize(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDefaultFontSize> bVar3) {
            this.threadExecutorProvider = bVar;
            this.postExecutionThreadProvider = bVar2;
            this.featureConfigRepositoryProvider = bVar3;
        }

        public final RenderPriority get() {
            return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.featureConfigRepositoryProvider.get());
        }

        public static TextSize create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDefaultFontSize> bVar3) {
            return new TextSize(bVar, bVar2, bVar3);
        }

        public static RenderPriority newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setDefaultFontSize setdefaultfontsize) {
            return new RenderPriority(appxloadfailed, getscheme, setdefaultfontsize);
        }
    }

    public String getLink() {
        return this.link;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0002\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/featureconfig/interactor/GetDonationCampaignConfig;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/featureconfig/model/DonationCampaignConfig;", "", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "featureConfigRepository", "Lid/dana/domain/featureconfig/FeatureConfigRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/featureconfig/FeatureConfigRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "unit", "(Lkotlin/Unit;)Lio/reactivex/Observable;", "domain_release"}, k = 1, mv = {1, 4, 2})
    public final class ZoomDensity extends parseFailed<setWebViewClient, Unit> {
        private final setDefaultFontSize featureConfigRepository;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @Inject
        public ZoomDensity(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull setDefaultFontSize setdefaultfontsize) {
            super(appxloadfailed, getscheme);
            Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
            Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
            Intrinsics.checkNotNullParameter(setdefaultfontsize, "featureConfigRepository");
            this.featureConfigRepository = setdefaultfontsize;
        }

        /* access modifiers changed from: protected */
        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<setWebViewClient> buildUseCaseObservable(@Nullable Unit unit) {
            TitleBarRightButtonView.AnonymousClass1<setWebViewClient> donationCampaignConfig = this.featureConfigRepository.getDonationCampaignConfig();
            Intrinsics.checkNotNullExpressionValue(donationCampaignConfig, "featureConfigRepository.donationCampaignConfig");
            return donationCampaignConfig;
        }
    }

    public class RenderPriority extends parseFailed<Boolean, Void> {
        private final setDefaultFontSize featureConfigRepository;

        @Inject
        public RenderPriority(appxLoadFailed appxloadfailed, getScheme getscheme, setDefaultFontSize setdefaultfontsize) {
            super(appxloadfailed, getscheme);
            this.featureConfigRepository = setdefaultfontsize;
        }

        /* access modifiers changed from: protected */
        public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
            return this.featureConfigRepository.isSendToLinkEnable();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.link, ((APWebSettings) obj).link);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.link});
    }
}
