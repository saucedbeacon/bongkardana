package o;

import id.dana.domain.globalsearch.model.SearchResultResponse;
import id.dana.globalsearch.model.SearchResult;
import id.dana.globalsearch.model.SearchResultModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.getAlpha;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "response", "", "Lid/dana/domain/globalsearch/model/SearchResultResponse;", "invoke"}, k = 3, mv = {1, 4, 2})
final class ParcelImpl$FastBitmap$CoordinateSystem extends Lambda implements Function1<List<? extends SearchResultResponse>, Unit> {
    final /* synthetic */ String $keyword;
    final /* synthetic */ ParcelImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ParcelImpl$FastBitmap$CoordinateSystem(ParcelImpl parcelImpl, String str) {
        super(1);
        this.this$0 = parcelImpl;
        this.$keyword = str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lid/dana/globalsearch/model/SearchResultModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class getMax extends FunctionReferenceImpl implements Function1<SearchResultModel, Unit> {
        getMax(getAlpha.setMax setmax) {
            super(1, setmax, getAlpha.setMax.class, "onGetOfflineMerchantCategory", "onGetOfflineMerchantCategory(Lid/dana/globalsearch/model/SearchResultModel;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchResultModel) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull SearchResultModel searchResultModel) {
            Intrinsics.checkNotNullParameter(searchResultModel, "p1");
            ((getAlpha.setMax) this.receiver).getMax(searchResultModel);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<SearchResultResponse>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull List<SearchResultResponse> list) {
        Intrinsics.checkNotNullParameter(list, "response");
        this.this$0.onNavigationEvent.dismissProgress();
        this.this$0.onNavigationEvent.getMax();
        this.this$0.onNavigationEvent.setMin(this.$keyword);
        for (SearchResultResponse searchResultResponse : list) {
            Intrinsics.checkNotNullParameter(searchResultResponse, "$this$toSearchResult");
            SearchResult searchResult = new SearchResult(searchResultResponse.getSearchResultList(), searchResultResponse.getPaginator(), searchResultResponse.getRequiresLocationPermission());
            String min = getExtensionMap.setMin(searchResult);
            switch (min.hashCode()) {
                case -1592831339:
                    if (!min.equals("SERVICE")) {
                        break;
                    } else {
                        ParcelImpl parcelImpl = this.this$0;
                        ParcelImpl.setMin(parcelImpl, getExtensionMap.setMax(searchResult, parcelImpl.toFloatRange, true, 3, false));
                        break;
                    }
                case -667013580:
                    if (!min.equals("ONLINE_MERCHANT")) {
                        break;
                    } else {
                        this.this$0.onNavigationEvent.setMin(getExtensionMap.setMax(searchResult, this.this$0.toFloatRange, true, 3, false));
                        break;
                    }
                case 2178:
                    if (!min.equals("DF")) {
                        break;
                    } else {
                        this.this$0.onNavigationEvent.setMax(getExtensionMap.setMax(searchResult, this.this$0.toFloatRange, true, 3, false));
                        break;
                    }
                case 1016896708:
                    if (!min.equals("OFFLINE_MERCHANT")) {
                        break;
                    } else {
                        ParcelImpl parcelImpl2 = this.this$0;
                        ParcelImpl.setMin(parcelImpl2, getExtensionMap.setMax(searchResult, parcelImpl2.toFloatRange, true, 3, false), new getMax(this.this$0.onNavigationEvent));
                        break;
                    }
                case 2014341056:
                    if (!min.equals("DF_SKU")) {
                        break;
                    } else {
                        this.this$0.onNavigationEvent.getMin(getExtensionMap.setMax(searchResult, this.this$0.toFloatRange, false, 7, false));
                        break;
                    }
            }
        }
        ParcelImpl.setMin(this.this$0, (List) list);
        this.this$0.length = false;
    }
}
