package o;

import id.dana.contract.deeplink.path.FeatureParams;
import java.util.Calendar;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.UniformLocalAuthDialogExtensionImpl;
import o.getTranslateY;
import o.isValid;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/contract/globalsearch/GlobalSearchBottomSheetPresenter;", "Lid/dana/contract/globalsearch/GlobalSearchBottomSheetContract$Presenter;", "view", "Lid/dana/contract/globalsearch/GlobalSearchBottomSheetContract$View;", "getMerchantInfo", "Lid/dana/domain/nearbyme/interactor/GetMerchantInfo;", "mapper", "Lid/dana/nearbyme/merchantdetail/mapper/MerchantInfoMapper;", "(Lid/dana/contract/globalsearch/GlobalSearchBottomSheetContract$View;Lid/dana/domain/nearbyme/interactor/GetMerchantInfo;Lid/dana/nearbyme/merchantdetail/mapper/MerchantInfoMapper;)V", "getMerchantDetail", "", "shopId", "", "merchantId", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getRootAlpha implements getTranslateY.setMax {
    private final isValid getMin;
    /* access modifiers changed from: private */
    public final getTranslateY.getMax length;
    /* access modifiers changed from: private */
    public final UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog.AnonymousClass3 setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/nearbyme/model/Shop;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<GriverConfigUtils, Unit> {
        final /* synthetic */ getRootAlpha this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(getRootAlpha getrootalpha) {
            super(1);
            this.this$0 = getrootalpha;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GriverConfigUtils) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull GriverConfigUtils griverConfigUtils) {
            Intrinsics.checkNotNullParameter(griverConfigUtils, "it");
            this.this$0.length.dismissProgress();
            getTranslateY.getMax max = this.this$0.length;
            UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog.AnonymousClass3 unused = this.this$0.setMin;
            String displayName = Calendar.getInstance().getDisplayName(7, 2, Locale.US);
            Intrinsics.checkNotNullExpressionValue(displayName, "Calendar.getInstance()\n …Calendar.LONG, Locale.US)");
            max.length(UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog.AnonymousClass3.length(griverConfigUtils, displayName));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Exception, Unit> {
        final /* synthetic */ getRootAlpha this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(getRootAlpha getrootalpha) {
            super(1);
            this.this$0 = getrootalpha;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            this.this$0.length.dismissProgress();
            updateActionSheetContent.e("onError", exc.toString());
            this.this$0.length.onError(String.valueOf(exc.getMessage()));
        }
    }

    @Inject
    public getRootAlpha(@NotNull getTranslateY.getMax getmax, @NotNull isValid isvalid, @NotNull UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog.AnonymousClass3 r4) {
        Intrinsics.checkNotNullParameter(getmax, "view");
        Intrinsics.checkNotNullParameter(isvalid, "getMerchantInfo");
        Intrinsics.checkNotNullParameter(r4, "mapper");
        this.length = getmax;
        this.getMin = isvalid;
        this.setMin = r4;
    }

    public final void getMin(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.SHOP_ID);
        Intrinsics.checkNotNullParameter(str2, "merchantId");
        this.length.showProgress();
        this.getMin.execute(new isValid.getMin(str, str2, false, 4, (DefaultConstructorMarker) null), new getMin(this), new setMin(this));
    }

    public final void setMax() {
        this.getMin.dispose();
    }
}
