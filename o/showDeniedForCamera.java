package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GriverBaseFragmentActivity;
import o.isQAndAbove;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/nearbyme/merchantdetail/MerchantDetailConfigPresenter;", "Lid/dana/nearbyme/merchantdetail/MerchantDetailConfigContract$Presenter;", "view", "Lid/dana/nearbyme/merchantdetail/MerchantDetailConfigContract$View;", "getMerchantDetailActionConfig", "Lid/dana/domain/nearbyme/interactor/GetMerchantDetailActionConfig;", "(Lid/dana/nearbyme/merchantdetail/MerchantDetailConfigContract$View;Lid/dana/domain/nearbyme/interactor/GetMerchantDetailActionConfig;)V", "getActionConfig", "", "fromNearbyRevamp", "", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class showDeniedForCamera implements GriverBaseFragmentActivity.getMax {
    /* access modifiers changed from: private */
    public final GriverBaseFragmentActivity.getMin getMax;
    private final isQAndAbove setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "merchantDetailConfig", "Lid/dana/domain/nearbyme/model/MerchantDetailConfig;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<getSerialNumberEncrypt, Unit> {
        final /* synthetic */ showDeniedForCamera this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(showDeniedForCamera showdeniedforcamera) {
            super(1);
            this.this$0 = showdeniedforcamera;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((getSerialNumberEncrypt) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull getSerialNumberEncrypt getserialnumberencrypt) {
            Intrinsics.checkNotNullParameter(getserialnumberencrypt, "merchantDetailConfig");
            this.this$0.getMax.onGetActionConfig(getserialnumberencrypt);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Exception, Unit> {
        final /* synthetic */ showDeniedForCamera this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(showDeniedForCamera showdeniedforcamera) {
            super(1);
            this.this$0 = showdeniedforcamera;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "e");
            this.this$0.getMax.onGetActionConfig(new getSerialNumberEncrypt(false, false, false, false, false, false, false, 127, (DefaultConstructorMarker) null));
            updateActionSheetContent.e(DanaLogConstants.TAG.NEARBY_ME_MERCHANT_DETAIL, this.this$0.getClass().getName(), exc);
        }
    }

    @Inject
    public showDeniedForCamera(@NotNull GriverBaseFragmentActivity.getMin getmin, @NotNull isQAndAbove isqandabove) {
        Intrinsics.checkNotNullParameter(getmin, "view");
        Intrinsics.checkNotNullParameter(isqandabove, "getMerchantDetailActionConfig");
        this.getMax = getmin;
        this.setMax = isqandabove;
    }

    public final void getMax(boolean z) {
        this.setMax.execute(new isQAndAbove.setMin(z), new getMin(this), new setMax(this));
    }

    public final void setMax() {
        this.setMax.dispose();
    }
}
