package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"id/dana/contract/sendmoney/v2/BillerX2BPresenter$updateRecentBank$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class IWorkManagerImplCallback$Default$FastBitmap$CoordinateSystem extends GriverAppVirtualHostProxy<Boolean> {
    IWorkManagerImplCallback$Default$FastBitmap$CoordinateSystem() {
    }

    public final void onError(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "e");
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(", on Error: ");
        sb.append(th);
        updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TO_BILLER_TAG, sb.toString());
    }
}
