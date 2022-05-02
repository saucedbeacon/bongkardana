package o;

import android.content.Context;
import android.view.ViewGroup;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.model.ThirdPartyService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.PhotoView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H\u0004R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lid/dana/service/viewholder/EditableServiceItemViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/model/ThirdPartyService;", "context", "Landroid/content/Context;", "resource", "", "parent", "Landroid/view/ViewGroup;", "editItemBadgeLookup", "Lid/dana/service/adapter/ServiceAdapter$EditItemBadgeLookup;", "(Landroid/content/Context;ILandroid/view/ViewGroup;Lid/dana/service/adapter/ServiceAdapter$EditItemBadgeLookup;)V", "onEdit", "", "getOnEdit", "()Z", "setOnEdit", "(Z)V", "getEditState", "service", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class applyCrop extends Ignore<ThirdPartyService> {
    private final PhotoView.setMin getMax;
    public boolean setMax;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public applyCrop(@NotNull Context context, @NotNull ViewGroup viewGroup, @Nullable PhotoView.setMin setmin) {
        super(context, R.layout.layout_custom_gridview, viewGroup);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        this.getMax = setmin;
    }

    public final boolean length() {
        return this.setMax;
    }

    /* access modifiers changed from: protected */
    public final int getMin(@NotNull ThirdPartyService thirdPartyService) {
        Intrinsics.checkNotNullParameter(thirdPartyService, FeatureParams.OPEN_SERVICE);
        PhotoView.setMin setmin = this.getMax;
        if (setmin != null) {
            return setmin.setMin(thirdPartyService);
        }
        return 0;
    }
}
