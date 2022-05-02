package id.dana.data.promotion;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00060\u0001j\u0002`\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lid/dana/data/promotion/NoHomeBannerSplitException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NoHomeBannerSplitException extends Exception {
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    @NotNull
    public static final NoHomeBannerSplitException NEW_INSTANCE = new NoHomeBannerSplitException();
    private static final String NO_HOME_BANNER_EXCEPTION = "Home Banner Split is empty";

    public NoHomeBannerSplitException() {
        super(NO_HOME_BANNER_EXCEPTION);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/data/promotion/NoHomeBannerSplitException$Companion;", "", "()V", "NEW_INSTANCE", "Lid/dana/data/promotion/NoHomeBannerSplitException;", "getNEW_INSTANCE", "()Lid/dana/data/promotion/NoHomeBannerSplitException;", "NO_HOME_BANNER_EXCEPTION", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NoHomeBannerSplitException getNEW_INSTANCE() {
            return NoHomeBannerSplitException.NEW_INSTANCE;
        }
    }
}
