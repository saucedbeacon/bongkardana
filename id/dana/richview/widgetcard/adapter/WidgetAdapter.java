package id.dana.richview.widgetcard.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import id.dana.R;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.IntRange;
import o.getBluetoothAdapterState;
import o.releaseCamera;
import o.resetInternal;
import o.updateCornerMarking;
import o.updateMessageMenuItem;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0002\u000b\fB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Lid/dana/richview/widgetcard/adapter/WidgetAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/richview/widgetcard/WidgetItem;", "()V", "getCardSizeBasedOnCount", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CardSize", "WidgetViewHolder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class WidgetAdapter extends IMultiInstanceInvalidationCallback.Stub<Ignore<releaseCamera>, releaseCamera> {
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        int i2 = 1;
        if (getItemCount() > 1) {
            i2 = 0;
        }
        return new setMax(viewGroup, i2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/richview/widgetcard/adapter/WidgetAdapter$CardSize;", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @Retention(AnnotationRetention.SOURCE)
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface CardSize {
        @NotNull
        public static final getMin Companion = getMin.getMax;
        public static final int LARGE = 1;
        public static final int SMALL = 0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/richview/widgetcard/adapter/WidgetAdapter$CardSize$Companion;", "", "()V", "LARGE", "", "SMALL", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMin {
            static final /* synthetic */ getMin getMax = new getMin();

            private getMin() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J!\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0017H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006@FX\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lid/dana/richview/widgetcard/adapter/WidgetAdapter$WidgetViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/richview/widgetcard/WidgetItem;", "parent", "Landroid/view/ViewGroup;", "cardSize", "", "(Landroid/view/ViewGroup;I)V", "getCardSize", "()I", "getParent", "()Landroid/view/ViewGroup;", "size", "getSize$annotations", "()V", "getSize", "setSize", "(I)V", "bindData", "", "data", "setOwner", "owner", "", "verifiedOwner", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "setTitle", "title", "showImage", "url", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends Ignore<releaseCamera> {
        private final int getMax;
        private int getMin = 1;
        @NotNull
        private final ViewGroup setMax;

        public final /* synthetic */ void setMax(Object obj) {
            releaseCamera releasecamera = (releaseCamera) obj;
            if (releasecamera != null) {
                int i = this.getMax;
                this.getMin = i;
                if (i == 0) {
                    View view = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                    CardView cardView = (CardView) view.findViewById(resetInternal.setMax.DimenRes);
                    Intrinsics.checkNotNullExpressionValue(cardView, "itemView.cv_widget_item");
                    View view2 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                    getBluetoothAdapterState.setMax(cardView, Integer.valueOf(view2.getResources().getDimensionPixelSize(R.dimen.f32462131166006)), (Integer) null);
                }
                String str = releasecamera.setMax;
                Context context = this.length;
                if (context != null) {
                    updateMessageMenuItem<Bitmap> min = ((updateCornerMarking) Glide.getMax(context)).equals().length(str).setMin((int) R.drawable.bg_donation_placeholder);
                    View view3 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                    min.length((ImageView) view3.findViewById(resetInternal.setMax.ListMenuItemView));
                }
                String str2 = releasecamera.setMin;
                if (str2 != null) {
                    View view4 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                    TextView textView = (TextView) view4.findViewById(resetInternal.setMax.ShareTarget$RequestMethod);
                    Intrinsics.checkNotNullExpressionValue(textView, "itemView.tv_widget_title");
                    textView.setText(str2);
                    View view5 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                    TextView textView2 = (TextView) view5.findViewById(resetInternal.setMax.ShareTarget$RequestMethod);
                    Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tv_widget_title");
                    textView2.setVisibility(0);
                }
                String str3 = releasecamera.length;
                Boolean bool = releasecamera.getMin;
                if (str3 != null) {
                    View view6 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view6, "itemView");
                    TextView textView3 = (TextView) view6.findViewById(resetInternal.setMax.getUseCompatPadding);
                    Intrinsics.checkNotNullExpressionValue(textView3, "itemView.tv_widget_owner");
                    textView3.setText(str3);
                    if (bool != null ? bool.equals(Boolean.TRUE) : false) {
                        Drawable length = IntRange.length(this.length, (int) R.drawable.ic_verify_blue);
                        View view7 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                        ((TextView) view7.findViewById(resetInternal.setMax.getUseCompatPadding)).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, length, (Drawable) null);
                    }
                    View view8 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view8, "itemView");
                    TextView textView4 = (TextView) view8.findViewById(resetInternal.setMax.getUseCompatPadding);
                    Intrinsics.checkNotNullExpressionValue(textView4, "itemView.tv_widget_owner");
                    textView4.setVisibility(0);
                }
                View view9 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view9, "itemView");
                CardView cardView2 = (CardView) view9.findViewById(resetInternal.setMax.DimenRes);
                Intrinsics.checkNotNullExpressionValue(cardView2, "itemView.cv_widget_item");
                cardView2.setVisibility(0);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(@NotNull ViewGroup viewGroup, int i) {
            super(viewGroup.getContext(), R.layout.view_item_widget, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            this.setMax = viewGroup;
            this.getMax = i;
        }
    }
}
