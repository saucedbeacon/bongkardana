package o;

import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.domain.globalsearch.model.AutoCompleteResult;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RenderLoadingStatusChangePoint;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/globalsearch/interactor/GetAutoCompleteByKeyword;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/globalsearch/model/AutoCompleteResult;", "Lid/dana/domain/globalsearch/interactor/GetAutoCompleteByKeyword$Params;", "globalSearchRepository", "Lid/dana/domain/globalsearch/GlobalSearchRepository;", "(Lid/dana/domain/globalsearch/GlobalSearchRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class unRegisterStatusListener extends APWebChromeClient<AutoCompleteResult, getMin> {
    private final RenderLoadingStatusChangePoint.LoadingStatusChangeListener globalSearchRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public unRegisterStatusListener(@NotNull RenderLoadingStatusChangePoint.LoadingStatusChangeListener loadingStatusChangeListener) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(loadingStatusChangeListener, "globalSearchRepository");
        this.globalSearchRepository = loadingStatusChangeListener;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<AutoCompleteResult> buildUseCase(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        return this.globalSearchRepository.getAutoComplete(getmin.getKeyword$domain_release(), getmin.getPage$domain_release(), getmin.getSize$domain_release());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u000e"}, d2 = {"Lid/dana/domain/globalsearch/interactor/GetAutoCompleteByKeyword$Params;", "", "keyword", "", "page", "", "size", "(Ljava/lang/String;II)V", "getKeyword$domain_release", "()Ljava/lang/String;", "getPage$domain_release", "()I", "getSize$domain_release", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @NotNull
        public static final length Companion = new length((DefaultConstructorMarker) null);
        @NotNull
        private final String keyword;
        private final int page;
        private final int size;

        @JvmStatic
        @NotNull
        public static final getMin create(@NotNull String str, int i, int i2) {
            return Companion.create(str, i, i2);
        }

        private getMin(String str, int i, int i2) {
            this.keyword = str;
            this.page = i;
            this.size = i2;
        }

        public /* synthetic */ getMin(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2);
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Lid/dana/domain/globalsearch/interactor/GetAutoCompleteByKeyword$Params$Companion;", "", "()V", "create", "Lid/dana/domain/globalsearch/interactor/GetAutoCompleteByKeyword$Params;", "keyword", "", "page", "", "size", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class length {
            private length() {
            }

            public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final getMin create(@NotNull String str, int i, int i2) {
                Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
                return new getMin(str, i, i2, (DefaultConstructorMarker) null);
            }
        }
    }
}
