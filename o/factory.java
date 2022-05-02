package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.destroyItem;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0006\u001a\u00020\tH\u0016J\b\u0010\u0004\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/contract/homeinfo/HomeRevampPresenter;", "Lid/dana/contract/homeinfo/HomeRevampContract$Presenter;", "view", "Lid/dana/contract/homeinfo/HomeRevampContract$View;", "getMurotalConfig", "Lid/dana/domain/homeinfo/interactor/GetMurotalConfig;", "getGlobalSearchConfig", "Lid/dana/domain/globalsearch/interactor/GetGlobalSearchConfig;", "(Lid/dana/contract/homeinfo/HomeRevampContract$View;Lid/dana/domain/homeinfo/interactor/GetMurotalConfig;Lid/dana/domain/globalsearch/interactor/GetGlobalSearchConfig;)V", "", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class factory implements destroyItem.getMin {
    private final GriverInnerConfig length;
    private final ShouldLoadUrlPoint setMax;
    /* access modifiers changed from: private */
    public final destroyItem.setMin setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Throwable, Unit> {
        public static final getMax INSTANCE = new getMax();

        getMax() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.GET_CATEGORY_EXPLORE_DANA_CONFIG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/featureconfig/model/GlobalSearchConfig;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<APWebViewClient, Unit> {
        final /* synthetic */ factory this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(factory factory) {
            super(1);
            this.this$0 = factory;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((APWebViewClient) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull APWebViewClient aPWebViewClient) {
            Intrinsics.checkNotNullParameter(aPWebViewClient, "it");
            this.this$0.setMin.getMin(aPWebViewClient.getExploreDanaBottomNav());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ factory this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(factory factory) {
            super(1);
            this.this$0 = factory;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.setMin.length(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Throwable, Unit> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.GET_MUROTAL_CONFIG, th.getMessage(), th);
        }
    }

    @Inject
    public factory(@NotNull destroyItem.setMin setmin, @NotNull GriverInnerConfig griverInnerConfig, @NotNull ShouldLoadUrlPoint shouldLoadUrlPoint) {
        Intrinsics.checkNotNullParameter(setmin, "view");
        Intrinsics.checkNotNullParameter(griverInnerConfig, "getMurotalConfig");
        Intrinsics.checkNotNullParameter(shouldLoadUrlPoint, "getGlobalSearchConfig");
        this.setMin = setmin;
        this.length = griverInnerConfig;
        this.setMax = shouldLoadUrlPoint;
    }

    public final void length() {
        this.length.execute(onReceivedIcon.INSTANCE, new setMax(this), setMin.INSTANCE);
    }

    public final void getMin() {
        this.setMax.execute(onReceivedIcon.INSTANCE, new getMin(this), getMax.INSTANCE);
    }

    public final void setMax() {
        this.length.dispose();
        this.setMax.dispose();
    }
}
