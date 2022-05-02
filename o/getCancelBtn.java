package o;

import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.OptionMenuRecyclerAdapter;
import o.UniformOptionMenuPanelExtensionImpl;
import o.f;
import o.getDownloadFile;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewPresenter;", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewContract$Presenter;", "view", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewContract$View;", "getMerchantReview", "Lid/dana/domain/nearbyme/interactor/GetMerchantReviews;", "(Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDetailReviewContract$View;Lid/dana/domain/nearbyme/interactor/GetMerchantReviews;)V", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "pageNumber", "", "getPageNumber", "()I", "setPageNumber", "(I)V", "disposeGetReview", "", "getReview", "merchantId", "", "shopId", "onDestroy", "showSuccessGetReview", "merchantReviewResultModel", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewResultModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getCancelBtn implements UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin {
    boolean getMax;
    int getMin = 1;
    /* access modifiers changed from: private */
    public final UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.length setMax;
    private final getDownloadFile setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/nearbyme/model/MerchantReviews;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<getSubDir, Unit> {
        final /* synthetic */ getCancelBtn this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(getCancelBtn getcancelbtn) {
            super(1);
            this.this$0 = getcancelbtn;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((getSubDir) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull getSubDir getsubdir) {
            Intrinsics.checkNotNullParameter(getsubdir, "it");
            this.this$0.getMax = getsubdir.getHasMore();
            getCancelBtn getcancelbtn = this.this$0;
            Intrinsics.checkNotNullParameter(getsubdir, "$this$toMerchantReviewResultModel");
            getCancelBtn.setMax(getcancelbtn, new OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass2(getsubdir.getHasMore(), f.AnonymousClass5.getMin(getsubdir.getReviews())));
            this.this$0.getMin++;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Exception, Unit> {
        final /* synthetic */ getCancelBtn this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(getCancelBtn getcancelbtn) {
            super(1);
            this.this$0 = getcancelbtn;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            updateActionSheetContent.e(DanaLogConstants.ExceptionType.NEARBY_EXCEPTION, exc.getMessage(), exc);
            this.this$0.setMax.onError(exc.getMessage());
        }
    }

    @Inject
    public getCancelBtn(@NotNull UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.length length2, @NotNull getDownloadFile getdownloadfile) {
        Intrinsics.checkNotNullParameter(length2, "view");
        Intrinsics.checkNotNullParameter(getdownloadfile, "getMerchantReview");
        this.setMax = length2;
        this.setMin = getdownloadfile;
    }

    public final int getMin() {
        return this.getMin;
    }

    public final boolean getMax() {
        return this.getMax;
    }

    public final void length(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "merchantId");
        Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
        this.setMin.execute(new getDownloadFile.setMax(str, str2, this.getMin, 10, (List) null, 16, (DefaultConstructorMarker) null), new length(this), new setMin(this));
    }

    public final void setMin() {
        this.setMin.dispose();
        this.getMax = false;
        this.getMin = 1;
    }

    public final void setMax() {
        this.setMin.dispose();
    }

    public static final /* synthetic */ void setMax(getCancelBtn getcancelbtn, OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass2 r3) {
        if (getcancelbtn.getMin > 1) {
            getcancelbtn.setMax.onSuccessLoadMoreReview(r3);
        } else {
            getcancelbtn.setMax.onSuccessGetReviewList(r3);
        }
    }
}
