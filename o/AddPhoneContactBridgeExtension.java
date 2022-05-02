package o;

import android.view.ViewGroup;
import dagger.internal.InjectedFieldSignature;
import id.dana.R;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyrevamp.search.searchresult.MerchantSearchResultFragment;
import id.dana.nearbyrevamp.search.searchresult.NearbySearchResultErrorView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.BLEBridgeExtension;
import o.setTrimPathOffset;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lid/dana/nearbyrevamp/search/viewholder/NearbyMerchantLoadingViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/model/ShopModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AddPhoneContactBridgeExtension extends Ignore<ShopModel> {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* renamed from: o.AddPhoneContactBridgeExtension$2  reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] getMin;

        static {
            int[] iArr = new int[NearbySearchResultErrorView.ErrorType.values().length];
            getMin = iArr;
            iArr[NearbySearchResultErrorView.ErrorType.NETWORK_ERROR.ordinal()] = 1;
            getMin[NearbySearchResultErrorView.ErrorType.NO_RESULT_ERROR.ordinal()] = 2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/news/LatestNewsContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.AddPhoneContactBridgeExtension$3  reason: invalid class name */
    public interface AnonymousClass3 {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/news/LatestNewsContract$View;", "Lid/dana/contract/feeds/GlobalFeedsContract$View;", "onScrollLoadMoreFeedSucccess", "", "feedsModel", "Lid/dana/feeds/model/FeedsModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.AddPhoneContactBridgeExtension$3$length */
        public interface length extends setTrimPathOffset.setMin {
            void getMax(@NotNull BLEBridgeExtension.AnonymousClass10 r1);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/news/LatestNewsContract$Presenter;", "Lid/dana/contract/feeds/GlobalFeedsContract$Presenter;", "loadMoreFeedOnScroll", "", "pageSize", "", "maxId", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.AddPhoneContactBridgeExtension$3$setMin */
        public interface setMin extends setTrimPathOffset.setMax {
            void getMin(@NotNull String str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPhoneContactBridgeExtension(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_nearby_search_result_loading, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    /* renamed from: o.AddPhoneContactBridgeExtension$1  reason: invalid class name */
    public final class AnonymousClass1 implements getBindingAdapter<MerchantSearchResultFragment> {
        @InjectedFieldSignature("id.dana.nearbyrevamp.search.searchresult.MerchantSearchResultFragment.nearbyAnalyticTracker")
        public static void setMax(MerchantSearchResultFragment merchantSearchResultFragment, t tVar) {
            merchantSearchResultFragment.nearbyAnalyticTracker = tVar;
        }
    }
}
