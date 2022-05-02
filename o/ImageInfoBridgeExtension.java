package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney.feed.ShareToFeedsView;
import java.util.List;
import kotlin.Metadata;
import o.handleScrollChange;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

public final class ImageInfoBridgeExtension implements getBindingAdapter<ShareToFeedsView> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/sendmoney/external/outlet/AddOutletReceiverContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.ImageInfoBridgeExtension$1  reason: invalid class name */
    public interface AnonymousClass1 {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/sendmoney/external/outlet/AddOutletReceiverContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onGetOutletLogos", "", "cdpContents", "", "Lid/dana/domain/promotion/CdpContent;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.ImageInfoBridgeExtension$1$getMin */
        public interface getMin extends parentColumns.getMax {
            void getMax(@NotNull List<? extends getDefaultProxy> list);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/sendmoney/external/outlet/AddOutletReceiverContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "getOutletLogos", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.ImageInfoBridgeExtension$1$setMin */
        public interface setMin extends parentColumns.setMin {
            void getMin();
        }
    }

    @InjectedFieldSignature("id.dana.sendmoney.feed.ShareToFeedsView.presenter")
    public static void getMin(ShareToFeedsView shareToFeedsView, handleScrollChange.getMin getmin) {
        shareToFeedsView.presenter = getmin;
    }
}
