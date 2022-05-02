package id.dana.service;

import id.dana.richview.servicescard.ServiceCategoryView;
import id.dana.service.favorites.FavoriteServicesView;
import kotlin.Metadata;
import o.resetInternal;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"id/dana/service/ServicesActivity$onEditModeChanged$1", "Lid/dana/service/favorites/FavoriteServicesView$FavoriteServiceActionListener;", "onItemChanged", "", "position", "", "onSave", "success", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ServicesActivity$FastBitmap$CoordinateSystem implements FavoriteServicesView.setMin {
    final /* synthetic */ ServicesActivity getMax;

    ServicesActivity$FastBitmap$CoordinateSystem(ServicesActivity servicesActivity) {
        this.getMax = servicesActivity;
    }

    public final void getMax() {
        this.getMax.setEditMode(false);
        ((ServiceCategoryView) this.getMax._$_findCachedViewById(resetInternal.setMax.getPopupBackground)).hideFavoriteCategory(false);
    }

    public final void setMax() {
        ServicesActivity.access$getServiceAdapter$p(this.getMax).notifyDataSetChanged();
    }
}
