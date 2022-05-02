package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import id.dana.R;
import id.dana.model.ThirdPartyService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.PhotoView;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lid/dana/service/viewholder/EditServiceItemViewHolder;", "Lid/dana/service/viewholder/ServiceItemViewHolder;", "parent", "Landroid/view/ViewGroup;", "editItemBadgeLookup", "Lid/dana/service/adapter/ServiceAdapter$EditItemBadgeLookup;", "(Landroid/view/ViewGroup;Lid/dana/service/adapter/ServiceAdapter$EditItemBadgeLookup;)V", "bindData", "", "data", "Lid/dana/model/ThirdPartyService;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isPhotoScaled extends setEnableCrop {
    public final /* bridge */ /* synthetic */ void setMax(Object obj) {
        setMax((ThirdPartyService) obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public isPhotoScaled(@NotNull ViewGroup viewGroup, @NotNull PhotoView.setMin setmin) {
        super(viewGroup, setmin);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(setmin, "editItemBadgeLookup");
    }

    public final void setMax(@NotNull ThirdPartyService thirdPartyService) {
        Intrinsics.checkNotNullParameter(thirdPartyService, "data");
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextView textView = (TextView) view.findViewById(resetInternal.setMax.BinderThread);
        if (textView != null) {
            textView.setText(length() ? R.string.services_save : R.string.services_edit);
        }
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        ImageView imageView = (ImageView) view2.findViewById(resetInternal.setMax.IntentSenderRequest);
        if (imageView != null) {
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.ic_service_selector_edit_save);
            imageView.setSelected(length());
        }
    }
}
