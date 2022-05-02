package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AddPhoneContactBridgeExtension;
import o.BLEBridgeExtension;
import o.shouldOverrideKeyEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/news/presenter/LatestNewsPresenter;", "Lid/dana/news/LatestNewsContract$Presenter;", "Lid/dana/contract/feeds/GlobalFeedsPresenter;", "view", "Lid/dana/news/LatestNewsContract$View;", "getGlobalFeeds", "Lid/dana/domain/feeds/interactor/GetGlobalFeeds;", "feedsModelMapper", "Lid/dana/feeds/mapper/FeedsModelMapper;", "getDefaultFeedFromConfig", "Lid/dana/domain/feeds/model/GetDefaultFeedFromConfig;", "(Lid/dana/news/LatestNewsContract$View;Lid/dana/domain/feeds/interactor/GetGlobalFeeds;Lid/dana/feeds/mapper/FeedsModelMapper;Lid/dana/domain/feeds/model/GetDefaultFeedFromConfig;)V", "loadMoreFeedOnScroll", "", "pageSize", "", "maxId", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class getHCEState extends getLocalMatrix implements AddPhoneContactBridgeExtension.AnonymousClass3.setMin {
    private final onEmbedViewAttachedToWebView getMin;
    private final onUnhandledKeyEvent length;
    /* access modifiers changed from: private */
    public final notifyBLECharacteristicValueChange setMax;
    /* access modifiers changed from: private */
    public final AddPhoneContactBridgeExtension.AnonymousClass3.length setMin;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getHCEState(@NotNull AddPhoneContactBridgeExtension.AnonymousClass3.length length2, @NotNull onUnhandledKeyEvent onunhandledkeyevent, @NotNull notifyBLECharacteristicValueChange notifyblecharacteristicvaluechange, @NotNull onEmbedViewAttachedToWebView onembedviewattachedtowebview) {
        super(length2, onunhandledkeyevent, notifyblecharacteristicvaluechange, onembedviewattachedtowebview);
        Intrinsics.checkNotNullParameter(length2, "view");
        Intrinsics.checkNotNullParameter(onunhandledkeyevent, "getGlobalFeeds");
        Intrinsics.checkNotNullParameter(notifyblecharacteristicvaluechange, "feedsModelMapper");
        Intrinsics.checkNotNullParameter(onembedviewattachedtowebview, "getDefaultFeedFromConfig");
        this.setMin = length2;
        this.length = onunhandledkeyevent;
        this.setMax = notifyblecharacteristicvaluechange;
        this.getMin = onembedviewattachedtowebview;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/news/presenter/LatestNewsPresenter$loadMoreFeedOnScroll$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/feeds/model/Feeds;", "onError", "", "e", "", "onNext", "feeds", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<onEmbedViewDestory> {
        final /* synthetic */ getHCEState setMin;

        setMax(getHCEState gethcestate) {
            this.setMin = gethcestate;
        }

        public final /* synthetic */ void onNext(Object obj) {
            onEmbedViewDestory onembedviewdestory = (onEmbedViewDestory) obj;
            Intrinsics.checkNotNullParameter(onembedviewdestory, DanaLogConstants.BizType.FEEDS);
            this.setMin.setMin.dismissProgress();
            AddPhoneContactBridgeExtension.AnonymousClass3.length min = this.setMin.setMin;
            notifyBLECharacteristicValueChange unused = this.setMin.setMax;
            BLEBridgeExtension.AnonymousClass10 max = notifyBLECharacteristicValueChange.getMax(onembedviewdestory);
            Intrinsics.checkNotNullExpressionValue(max, "feedsModelMapper.apply(feeds)");
            min.getMax(max);
        }

        public final void onError(@NotNull Throwable th) {
            String str;
            Intrinsics.checkNotNullParameter(th, "e");
            if (th.getMessage() == null) {
                str = "";
            } else {
                str = th.getMessage();
                Intrinsics.checkNotNull(str);
            }
            this.setMin.setMin.dismissProgress();
            this.setMin.setMin.onError(str);
        }
    }

    public final void getMin(@NotNull String str) {
        int max = dispatchOnCancelled.setMax(15);
        if (15 != max) {
            onCanceled oncanceled = new onCanceled(15, max, 1);
            onCancelLoad.setMax(-1264338580, oncanceled);
            onCancelLoad.getMin(-1264338580, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "maxId");
        this.setMin.showProgress();
        this.length.execute(new setMax(this), shouldOverrideKeyEvent.setMax.forGetFeeds(15, str));
    }
}
