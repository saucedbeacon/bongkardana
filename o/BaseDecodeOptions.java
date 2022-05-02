package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.CaptureBtn;
import o.CornerMarkingDataProvider;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\u0012\u001a\u00020\u0010*\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0014\u0010\u0012\u001a\u00020\u0010*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0002R\u001a\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lid/dana/savings/viewholder/SavingBenefitViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/savings/model/SavingBenefitModel;", "context", "Landroid/content/Context;", "resource", "", "parent", "Landroid/view/ViewGroup;", "(Landroid/content/Context;ILandroid/view/ViewGroup;)V", "height", "getHeight", "()I", "setHeight", "(I)V", "bindData", "", "data", "setIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "icon", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BaseDecodeOptions extends Ignore<CaptureBtn.AnonymousClass1> {
    @NotNull
    public static final setMax getMin = new setMax((byte) 0);
    public int setMin;

    public final /* synthetic */ void setMax(Object obj) {
        ViewGroup.LayoutParams layoutParams;
        CaptureBtn.AnonymousClass1 r7 = (CaptureBtn.AnonymousClass1) obj;
        if (r7 != null) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            LinearLayout linearLayout = (LinearLayout) view.findViewById(resetInternal.setMax.findInsertIndex);
            if (!(linearLayout == null || (layoutParams = linearLayout.getLayoutParams()) == null)) {
                layoutParams.height = this.setMin + ((int) (Resources.getSystem().getDisplayMetrics().density * 50.0f));
            }
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView = (TextView) view2.findViewById(resetInternal.setMax.setTrackResource);
            if (textView != null) {
                Context context = this.length;
                Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                textView.setText(CornerMarkingDataProvider.AnonymousClass3.setMin(context, r7.setMax, r7.setMax));
            }
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView2 = (TextView) view3.findViewById(resetInternal.setMax.setTrackTintList);
            if (textView2 != null) {
                Context context2 = this.length;
                Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
                textView2.setText(CornerMarkingDataProvider.AnonymousClass3.setMin(context2, r7.getMin, r7.getMin));
            }
            Context context3 = this.length;
            Intrinsics.checkNotNullExpressionValue(context3, HummerConstants.CONTEXT);
            int length = CornerMarkingDataProvider.AnonymousClass3.length(context3, r7.length);
            if (length > 0) {
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                AppCompatImageView appCompatImageView = (AppCompatImageView) view4.findViewById(resetInternal.setMax.AppCompatDelegate$NightMode);
                if (appCompatImageView != null) {
                    ((updateCornerMarking) Glide.getMax(appCompatImageView.getContext())).length(Integer.valueOf(length)).setMax((int) R.drawable.dana_logo_blue).setMin((updatePostLayout<Bitmap>) new setDpMargin()).setMin((int) R.drawable.dana_logo_blue).length((ImageView) appCompatImageView);
                    return;
                }
                return;
            }
            View view5 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view5, "itemView");
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view5.findViewById(resetInternal.setMax.AppCompatDelegate$NightMode);
            if (appCompatImageView2 != null) {
                ((updateCornerMarking) Glide.getMax(appCompatImageView2.getContext())).setMax(r7.length).setMax((int) R.drawable.dana_logo_blue).setMin((updatePostLayout<Bitmap>) new setDpMargin()).setMin((int) R.drawable.dana_logo_blue).length((ImageView) appCompatImageView2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseDecodeOptions(@NotNull Context context, @NotNull ViewGroup viewGroup) {
        super(context, R.layout.item_benefit, viewGroup);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/savings/viewholder/SavingBenefitViewHolder$Companion;", "", "()V", "DEFAULT_HEIGHT", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }
}
