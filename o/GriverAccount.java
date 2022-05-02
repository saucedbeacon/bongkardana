package o;

import android.location.Location;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.domain.globalsearch.model.SearchResultResponse;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RenderLoadingStatusChangePoint;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/domain/globalsearch/interactor/GetSearchByKeyword;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/globalsearch/model/SearchResultResponse;", "Lid/dana/domain/globalsearch/interactor/GetSearchByKeyword$Params;", "globalSearchRepository", "Lid/dana/domain/globalsearch/GlobalSearchRepository;", "(Lid/dana/domain/globalsearch/GlobalSearchRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverAccount extends APWebChromeClient<List<? extends SearchResultResponse>, setMin> {
    private final RenderLoadingStatusChangePoint.LoadingStatusChangeListener globalSearchRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public GriverAccount(@NotNull RenderLoadingStatusChangePoint.LoadingStatusChangeListener loadingStatusChangeListener) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(loadingStatusChangeListener, "globalSearchRepository");
        this.globalSearchRepository = loadingStatusChangeListener;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<SearchResultResponse>> buildUseCase(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "params");
        return this.globalSearchRepository.getSearchResult(setmin.getKeyword$domain_release(), setmin.getPage$domain_release(), setmin.getSize$domain_release(), setmin.getCategories$domain_release(), setmin.getLocation$domain_release());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B7\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Lid/dana/domain/globalsearch/interactor/GetSearchByKeyword$Params;", "", "keyword", "", "page", "", "size", "categories", "", "location", "Landroid/location/Location;", "(Ljava/lang/String;IILjava/util/List;Landroid/location/Location;)V", "getCategories$domain_release", "()Ljava/util/List;", "getKeyword$domain_release", "()Ljava/lang/String;", "getLocation$domain_release", "()Landroid/location/Location;", "getPage$domain_release", "()I", "getSize$domain_release", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
        @NotNull
        private final List<String> categories;
        @NotNull
        private final String keyword;
        @Nullable
        private final Location location;
        private final int page;
        private final int size;

        @JvmStatic
        @NotNull
        public static final setMin create(@NotNull String str, int i, int i2, @NotNull List<String> list, @Nullable Location location2) {
            return Companion.create(str, i, i2, list, location2);
        }

        private setMin(String str, int i, int i2, List<String> list, Location location2) {
            this.keyword = str;
            this.page = i;
            this.size = i2;
            this.categories = list;
            this.location = location2;
        }

        public /* synthetic */ setMin(String str, int i, int i2, List list, Location location2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, list, location2);
        }

        @NotNull
        public final String getKeyword$domain_release() {
            return this.keyword;
        }

        public final int getPage$domain_release() {
            return this.page;
        }

        public final int getSize$domain_release() {
            return this.size;
        }

        @NotNull
        public final List<String> getCategories$domain_release() {
            return this.categories;
        }

        @Nullable
        public final Location getLocation$domain_release() {
            return this.location;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¨\u0006\u000e"}, d2 = {"Lid/dana/domain/globalsearch/interactor/GetSearchByKeyword$Params$Companion;", "", "()V", "create", "Lid/dana/domain/globalsearch/interactor/GetSearchByKeyword$Params;", "keyword", "", "page", "", "size", "categories", "", "location", "Landroid/location/Location;", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class getMin {
            private getMin() {
            }

            public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final setMin create(@NotNull String str, int i, int i2, @NotNull List<String> list, @Nullable Location location) {
                Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
                Intrinsics.checkNotNullParameter(list, "categories");
                return new setMin(str, i, i2, list, location, (DefaultConstructorMarker) null);
            }
        }
    }
}
