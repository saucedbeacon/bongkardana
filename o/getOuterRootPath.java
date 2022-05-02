package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RenderLoadingStatusChangePoint;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/globalsearch/interactor/SaveRecentSearch;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/globalsearch/interactor/SaveRecentSearch$Params;", "globalSearchRepository", "Lid/dana/domain/globalsearch/GlobalSearchRepository;", "(Lid/dana/domain/globalsearch/GlobalSearchRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getOuterRootPath extends APWebChromeClient<Unit, getMax> {
    private final RenderLoadingStatusChangePoint.LoadingStatusChangeListener globalSearchRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getOuterRootPath(@NotNull RenderLoadingStatusChangePoint.LoadingStatusChangeListener loadingStatusChangeListener) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(loadingStatusChangeListener, "globalSearchRepository");
        this.globalSearchRepository = loadingStatusChangeListener;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Unit> buildUseCase(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        return this.globalSearchRepository.saveRecentSearch(getmax.getKeywordSearch$domain_release(), getmax.getTimeSearch$domain_release());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lid/dana/domain/globalsearch/interactor/SaveRecentSearch$Params;", "", "keywordSearch", "", "timeSearch", "", "(Ljava/lang/String;J)V", "getKeywordSearch$domain_release", "()Ljava/lang/String;", "getTimeSearch$domain_release", "()J", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
        @NotNull
        private final String keywordSearch;
        private final long timeSearch;

        @JvmStatic
        @NotNull
        public static final getMax create(@NotNull String str, long j) {
            return Companion.create(str, j);
        }

        private getMax(String str, long j) {
            this.keywordSearch = str;
            this.timeSearch = j;
        }

        public /* synthetic */ getMax(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j);
        }

        @NotNull
        public final String getKeywordSearch$domain_release() {
            return this.keywordSearch;
        }

        public final long getTimeSearch$domain_release() {
            return this.timeSearch;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lid/dana/domain/globalsearch/interactor/SaveRecentSearch$Params$Companion;", "", "()V", "create", "Lid/dana/domain/globalsearch/interactor/SaveRecentSearch$Params;", "keywordSearch", "", "timeSearch", "", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class getMin {
            private getMin() {
            }

            public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final getMax create(@NotNull String str, long j) {
                Intrinsics.checkNotNullParameter(str, "keywordSearch");
                return new getMax(str, j, (DefaultConstructorMarker) null);
            }
        }
    }
}
