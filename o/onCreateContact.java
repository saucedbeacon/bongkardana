package o;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.FrameLayout;
import id.dana.R;
import id.dana.nearbyme.model.PromoInfoModel;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0002R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lid/dana/nearbyrevamp/view/PromoDetailDialogFragment;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "()V", "promoInfoModel", "Lid/dana/nearbyme/model/PromoInfoModel;", "getPromoInfoModel", "()Lid/dana/nearbyme/model/PromoInfoModel;", "promoInfoModel$delegate", "Lkotlin/Lazy;", "getBottomSheet", "", "getDimAmount", "", "getLayout", "", "isFullDialogHeightRequired", "", "onShow", "", "onStart", "setupData", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onCreateContact extends order {
    @NotNull
    public static final getMax getMin = new getMax((byte) 0);
    private HashMap equals;
    private final Lazy getMax = LazyKt.lazy(new length(this));

    public final /* bridge */ /* synthetic */ FrameLayout getMax() {
        return null;
    }

    public final int getMin() {
        return R.layout.view_bottom_sheet_promo_detail;
    }

    public final float length() {
        return 0.5f;
    }

    public final boolean t_() {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/nearbyme/model/PromoInfoModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<PromoInfoModel> {
        final /* synthetic */ onCreateContact this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(onCreateContact oncreatecontact) {
            super(0);
            this.this$0 = oncreatecontact;
        }

        @Nullable
        public final PromoInfoModel invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return (PromoInfoModel) arguments.getParcelable("promo_info_model");
            }
            return null;
        }
    }

    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        getMax(dialog);
        length(dialog);
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnDismissListener(new setMin(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements DialogInterface.OnDismissListener {
        final /* synthetic */ onCreateContact setMin;

        setMin(onCreateContact oncreatecontact) {
            this.setMin = oncreatecontact;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.setMin.dismiss();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin() {
        /*
            r4 = this;
            super.setMin()
            kotlin.Lazy r0 = r4.getMax
            java.lang.Object r0 = r0.getValue()
            id.dana.nearbyme.model.PromoInfoModel r0 = (id.dana.nearbyme.model.PromoInfoModel) r0
            if (r0 == 0) goto L_0x004a
            int r1 = o.resetInternal.setMax.getViewModelStore
            java.util.HashMap r2 = r4.equals
            if (r2 != 0) goto L_0x001a
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r4.equals = r2
        L_0x001a:
            java.util.HashMap r2 = r4.equals
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r2.get(r3)
            android.view.View r2 = (android.view.View) r2
            if (r2 != 0) goto L_0x003d
            android.view.View r2 = r4.getView()
            if (r2 != 0) goto L_0x0030
            r1 = 0
            goto L_0x003e
        L_0x0030:
            android.view.View r2 = r2.findViewById(r1)
            java.util.HashMap r3 = r4.equals
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.put(r1, r2)
        L_0x003d:
            r1 = r2
        L_0x003e:
            id.dana.nearbyrevamp.view.NearbyPromoDetailView r1 = (id.dana.nearbyrevamp.view.NearbyPromoDetailView) r1
            if (r1 == 0) goto L_0x004a
            java.lang.String r2 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r1.setPromoInfoModel(r0)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onCreateContact.setMin():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/nearbyrevamp/view/PromoDetailDialogFragment$Companion;", "", "()V", "PROMO_INFO_MODEL", "", "TAG", "newInstance", "Lid/dana/nearbyrevamp/view/PromoDetailDialogFragment;", "promoInfoModel", "Lid/dana/nearbyme/model/PromoInfoModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.equals;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
