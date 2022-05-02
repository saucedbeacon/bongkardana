package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.home.RoundedCornersTransformation;
import id.dana.nearbyme.model.PromoInfoModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B*\u0012#\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R+\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantPromoAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/model/PromoInfoModel;", "onPromoClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "promoInfoModel", "", "(Lkotlin/jvm/functions/Function1;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "MerchantPromoViewHolder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class bindData extends IMultiInstanceInvalidationCallback.Stub<Ignore<PromoInfoModel>, PromoInfoModel> {
    private final Function1<PromoInfoModel, Unit> getMax;

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new setMin(viewGroup, this.getMax);
    }

    public bindData(@Nullable Function1<? super PromoInfoModel, Unit> function1) {
        this.getMax = function1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B4\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016R+\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantPromoAdapter$MerchantPromoViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/model/PromoInfoModel;", "parent", "Landroid/view/ViewGroup;", "onPromoClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "promoInfoModel", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "bindData", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends Ignore<PromoInfoModel> {
        /* access modifiers changed from: private */
        public final Function1<PromoInfoModel, Unit> getMax;

        public final /* synthetic */ void setMax(Object obj) {
            PromoInfoModel promoInfoModel = (PromoInfoModel) obj;
            if (promoInfoModel != null) {
                setFirstVerticalBias<Drawable> min = Glide.getMax(this.length).setMin(Integer.valueOf(R.drawable.ic_promo_deals_background));
                Context context = this.length;
                Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                setFirstVerticalBias setfirstverticalbias = (setFirstVerticalBias) min.setMax((updatePostLayout<Bitmap>) new RoundedCornersTransformation(context.getResources().getDimensionPixelSize(R.dimen.f26712131165342), 0, RoundedCornersTransformation.CornerType.LEFT));
                setfirstverticalbias.length(new getMin(this), (parseBehavior) null, setfirstverticalbias, clamp.setMax());
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(resetInternal.setMax.setSupportProgressBarVisibility);
                if (appCompatImageView != null) {
                    appCompatImageView.setImageResource(R.drawable.ic_promo_tag);
                }
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                TextView textView = (TextView) view2.findViewById(resetInternal.setMax.launchQuerySearch);
                String str = "";
                if (textView != null) {
                    String str2 = promoInfoModel.getMax;
                    textView.setText(str2 != null ? str2 : str);
                }
                View view3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                TextView textView2 = (TextView) view3.findViewById(resetInternal.setMax.forceUniformHeight);
                if (textView2 != null) {
                    Context context2 = this.length;
                    Object[] objArr = new Object[2];
                    objArr[0] = (promoInfoModel.toIntRange == null || promoInfoModel.setMin()) ? str : promoInfoModel.toIntRange.setMax();
                    if (promoInfoModel.isInside != null && !promoInfoModel.getMax()) {
                        str = promoInfoModel.isInside.setMax();
                    }
                    objArr[1] = str;
                    textView2.setText(context2.getString(R.string.promo_description, objArr));
                }
                this.itemView.setOnClickListener(new length(this, promoInfoModel));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMin(@NotNull ViewGroup viewGroup, @Nullable Function1<? super PromoInfoModel, Unit> function1) {
            super(viewGroup.getContext(), R.layout.item_promo_deals, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            this.getMax = function1;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0010\u0010\b\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"id/dana/nearbyrevamp/merchantdetail/adapter/MerchantPromoAdapter$MerchantPromoViewHolder$bindData$1", "Lcom/bumptech/glide/request/target/CustomTarget;", "Landroid/graphics/drawable/Drawable;", "onLoadCleared", "", "placeholder", "onResourceReady", "resource", "transition", "Lcom/bumptech/glide/request/transition/Transition;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMin extends onLayoutChild<Drawable> {
            final /* synthetic */ setMin getMin;

            public final void getMax(@Nullable Drawable drawable) {
            }

            getMin(setMin setmin) {
                this.getMin = setmin;
            }

            public final /* synthetic */ void getMin(Object obj) {
                Drawable drawable = (Drawable) obj;
                Intrinsics.checkNotNullParameter(drawable, "resource");
                View view = this.getMin.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(resetInternal.setMax.setSupportProgressBarVisibility);
                if (appCompatImageView != null) {
                    appCompatImageView.setBackground(drawable);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
        static final class length implements View.OnClickListener {
            final /* synthetic */ setMin length;
            final /* synthetic */ PromoInfoModel setMin;

            length(setMin setmin, PromoInfoModel promoInfoModel) {
                this.length = setmin;
                this.setMin = promoInfoModel;
            }

            public final void onClick(View view) {
                Function1 max = this.length.getMax;
                if (max != null) {
                    max.invoke(this.setMin);
                }
            }
        }
    }
}
