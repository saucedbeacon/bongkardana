package o;

import android.view.ViewGroup;
import android.widget.ImageView;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.RewriteQueriesToDropUnusedColumns;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"Lid/dana/oauth/PoweredByAlipayViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/oauth/model/ScopeModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "item", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setScreenBrightness extends Ignore<saveImageToGallery> {
    @NotNull
    public static final getMax setMin = new getMax((byte) 0);

    public final /* synthetic */ void setMax(Object obj) {
        String str;
        saveImageToGallery saveimagetogallery = (saveImageToGallery) obj;
        super.setMax(saveimagetogallery);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.f50212131363576);
        RewriteQueriesToDropUnusedColumns.getMax getmax = new RewriteQueriesToDropUnusedColumns.getMax(this.length, (byte) 0);
        if (saveimagetogallery != null) {
            str = saveimagetogallery.getMin;
        } else {
            str = null;
        }
        getmax.getMin = str;
        getmax.setMin = imageView;
        new RewriteQueriesToDropUnusedColumns(getmax, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setScreenBrightness(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_powered_by_alipay, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/oauth/PoweredByAlipayViewHolder$Companion;", "", "()V", "ITEM_POWERED_BY_ALIPAY", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }
}
