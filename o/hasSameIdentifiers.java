package o;

import id.dana.domain.services.Category;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.NullBeaconDataFactory;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\rB\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/domain/services/interactor/GetServicesWithCategory;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/services/model/ThirdPartyCategoryService;", "Lid/dana/domain/services/interactor/GetServicesWithCategory$Params;", "servicesRepository", "Lid/dana/domain/services/ServicesRepository;", "globalNetworkRepository", "Lid/dana/domain/globalnetwork/GlobalNetworkRepository;", "(Lid/dana/domain/services/ServicesRepository;Lid/dana/domain/globalnetwork/GlobalNetworkRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class hasSameIdentifiers extends APWebChromeClient<List<? extends NullBeaconDataFactory.AnonymousClass1>, getMax> {
    private final onWebViewDestory globalNetworkRepository;
    /* access modifiers changed from: private */
    public final toUuidString servicesRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "Lid/dana/domain/services/model/ThirdPartyCategoryService;", "kotlin.jvm.PlatformType", "gnMode", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;", "id/dana/domain/services/interactor/GetServicesWithCategory$buildUseCase$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<Boolean, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends NullBeaconDataFactory.AnonymousClass1>>> {
        final /* synthetic */ hasSameIdentifiers getMin;

        getMin(hasSameIdentifiers hassameidentifiers) {
            this.getMin = hassameidentifiers;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            Intrinsics.checkNotNullParameter(bool, "gnMode");
            return this.getMin.servicesRepository.getServicesByCategoryKey(CollectionsKt.listOf(bool.booleanValue() ? Category.GLOBAL_NETWORK_FEATURED : Category.FEATURED));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public hasSameIdentifiers(@NotNull toUuidString touuidstring, @NotNull onWebViewDestory onwebviewdestory) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(touuidstring, "servicesRepository");
        Intrinsics.checkNotNullParameter(onwebviewdestory, "globalNetworkRepository");
        this.servicesRepository = touuidstring;
        this.globalNetworkRepository = onwebviewdestory;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<NullBeaconDataFactory.AnonymousClass1>> buildUseCase(@NotNull getMax getmax) {
        TitleBarRightButtonView.AnonymousClass1<List<NullBeaconDataFactory.AnonymousClass1>> r3;
        Intrinsics.checkNotNullParameter(getmax, "params");
        CharSequence categoryKey$domain_release = getmax.getCategoryKey$domain_release();
        if (categoryKey$domain_release == null || categoryKey$domain_release.length() == 0) {
            r3 = this.servicesRepository.getAllServices();
        } else if (Intrinsics.areEqual((Object) getmax.getCategoryKey$domain_release(), (Object) Category.FEATURED)) {
            r3 = this.globalNetworkRepository.isGlobalNetworkMode().flatMap(new getMin(this));
        } else {
            r3 = this.servicesRepository.getServicesByCategoryKey(getmax.getCategories$domain_release());
        }
        Intrinsics.checkNotNullExpressionValue(r3, "params.run {\n           …)\n            }\n        }");
        return r3;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lid/dana/domain/services/interactor/GetServicesWithCategory$Params;", "", "categories", "", "", "(Ljava/util/List;)V", "getCategories$domain_release", "()Ljava/util/List;", "categoryKey", "getCategoryKey$domain_release", "()Ljava/lang/String;", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
        @NotNull
        private final List<String> categories;
        @Nullable
        private final String categoryKey;

        private getMax(List<String> list) {
            this.categories = list;
            this.categoryKey = (String) CollectionsKt.firstOrNull(list);
        }

        public /* synthetic */ getMax(List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(list);
        }

        @NotNull
        public final List<String> getCategories$domain_release() {
            return this.categories;
        }

        @Nullable
        public final String getCategoryKey$domain_release() {
            return this.categoryKey;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¨\u0006\t"}, d2 = {"Lid/dana/domain/services/interactor/GetServicesWithCategory$Params$Companion;", "", "()V", "forFilterCategory", "Lid/dana/domain/services/interactor/GetServicesWithCategory$Params;", "categoryKey", "", "categories", "", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class setMax {
            private setMax() {
            }

            public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final getMax forFilterCategory(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "categoryKey");
                return forFilterCategory((List<String>) CollectionsKt.listOf(str));
            }

            @NotNull
            public final getMax forFilterCategory(@NotNull List<String> list) {
                Intrinsics.checkNotNullParameter(list, "categories");
                return new getMax(list, (DefaultConstructorMarker) null);
            }
        }
    }
}
