package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.hexStringToBytes;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/explore/popularplaces/PopularPlacesPresenter;", "Lid/dana/explore/popularplaces/PopularPlacesContract$Presenter;", "view", "Lid/dana/explore/popularplaces/PopularPlacesContract$View;", "getGlobalSearchConfig", "Lid/dana/domain/globalsearch/interactor/GetGlobalSearchConfig;", "(Lid/dana/explore/popularplaces/PopularPlacesContract$View;Lid/dana/domain/globalsearch/interactor/GetGlobalSearchConfig;)V", "getExplorePopularPlaces", "", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class hexStringToBytesInReverse implements hexStringToBytes.setMax {
    private final ShouldLoadUrlPoint setMax;
    /* access modifiers changed from: private */
    public final hexStringToBytes.getMax setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/featureconfig/model/GlobalSearchConfig;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<APWebViewClient, Unit> {
        final /* synthetic */ hexStringToBytesInReverse this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(hexStringToBytesInReverse hexstringtobytesinreverse) {
            super(1);
            this.this$0 = hexstringtobytesinreverse;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((APWebViewClient) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull APWebViewClient aPWebViewClient) {
            Intrinsics.checkNotNullParameter(aPWebViewClient, "it");
            if (!aPWebViewClient.getExploreShowPopularPlacesWidget() || !(!aPWebViewClient.getExplorePopularPlaces().isEmpty())) {
                this.this$0.setMin.getMin();
                return;
            }
            hexStringToBytes.getMax max = this.this$0.setMin;
            List<capturePicture> explorePopularPlaces = aPWebViewClient.getExplorePopularPlaces();
            Intrinsics.checkNotNullParameter(explorePopularPlaces, "$this$toListExplorePopularPlacesConfigModel");
            Iterable<capturePicture> iterable = explorePopularPlaces;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (capturePicture capturepicture : iterable) {
                Intrinsics.checkNotNullParameter(capturepicture, "$this$toExplorePopularPlacesConfigModel");
                arrayList.add(new safeParseInt(capturepicture.getMerchantId(), capturepicture.getMerchantName(), capturepicture.getLogoUrl()));
            }
            max.length((List) arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ hexStringToBytesInReverse this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(hexStringToBytesInReverse hexstringtobytesinreverse) {
            super(1);
            this.this$0 = hexstringtobytesinreverse;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMin.getMin();
            updateActionSheetContent.e(DanaLogConstants.TAG.GET_EXPLORE_POPULAR_PLACES_CONFIG, th.getMessage(), th);
        }
    }

    @Inject
    public hexStringToBytesInReverse(@NotNull hexStringToBytes.getMax getmax, @NotNull ShouldLoadUrlPoint shouldLoadUrlPoint) {
        Intrinsics.checkNotNullParameter(getmax, "view");
        Intrinsics.checkNotNullParameter(shouldLoadUrlPoint, "getGlobalSearchConfig");
        this.setMin = getmax;
        this.setMax = shouldLoadUrlPoint;
    }

    public final void setMin() {
        this.setMin.setMin();
        this.setMax.execute(onReceivedIcon.INSTANCE, new getMax(this), new getMin(this));
    }

    public final void setMax() {
        this.setMax.dispose();
    }
}
