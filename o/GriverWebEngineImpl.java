package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.nearbyme.OtherStoreListActivity;
import id.dana.nearbyme.di.module.MerchantReviewFormModule;
import id.dana.nearbyme.di.module.NearbyTrackerModule;
import id.dana.nearbyme.di.module.OtherStoreListModule;
import id.dana.nearbyme.di.module.PhotoGalleryModule;
import id.dana.nearbyme.homeshopping.tutorial.HomeShoppingTutorialFragment;
import id.dana.nearbyme.merchantdetail.mediaviewer.MerchantPhotoGalleryActivity;
import id.dana.nearbyme.merchantreview.MerchantReviewDialogFragment;
import id.dana.nearbyrevamp.search.searchresult.MerchantSearchResultFragment;
import kotlin.Metadata;
import o.PrepareException;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/di/component/PhotoGalleryComponent;", "", "inject", "", "merchantPhotoGalleryActivity", "Lid/dana/nearbyme/merchantdetail/mediaviewer/MerchantPhotoGalleryActivity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {PhotoGalleryModule.class})
public interface GriverWebEngineImpl {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/di/component/NearbyTrackerComponent;", "", "inject", "", "homeShoppingTutorialFragment", "Lid/dana/nearbyme/homeshopping/tutorial/HomeShoppingTutorialFragment;", "nearbySearchFragment", "Lid/dana/nearbyrevamp/search/searchresult/MerchantSearchResultFragment;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {NearbyTrackerModule.class})
    /* renamed from: o.GriverWebEngineImpl$1  reason: invalid class name */
    public interface AnonymousClass1 {
        void getMax(@NotNull MerchantSearchResultFragment merchantSearchResultFragment);

        void length(@NotNull HomeShoppingTutorialFragment homeShoppingTutorialFragment);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/di/component/OtherStoreListComponent;", "", "inject", "", "activity", "Lid/dana/nearbyme/OtherStoreListActivity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {OtherStoreListModule.class})
    /* renamed from: o.GriverWebEngineImpl$2  reason: invalid class name */
    public interface AnonymousClass2 {
        void length(@NotNull OtherStoreListActivity otherStoreListActivity);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/di/component/MerchantReviewFormComponent;", "", "inject", "", "merchantReviewDialogFragment", "Lid/dana/nearbyme/merchantreview/MerchantReviewDialogFragment;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {MerchantReviewFormModule.class})
    /* renamed from: o.GriverWebEngineImpl$3  reason: invalid class name */
    public interface AnonymousClass3 {
        void getMin(@NotNull MerchantReviewDialogFragment merchantReviewDialogFragment);
    }

    void length(@NotNull MerchantPhotoGalleryActivity merchantPhotoGalleryActivity);
}
