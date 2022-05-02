package o;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import dagger.internal.InjectedFieldSignature;
import id.dana.feeds.views.UserFeedsActivity;
import id.dana.geofence.GeoFenceTransitionsJobIntentService;
import id.dana.usereducation.constant.BottomSheetType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.getScaleY;
import o.onDelete;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0006\u001a&\u0010\t\u001a\u00020\u0001*\u00020\u00042\u0014\b\u0004\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000bH\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\f"}, d2 = {"attachViewPager", "", "Lcom/google/android/material/tabs/TabLayout;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "onConfigureTab", "Lkotlin/Function2;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "", "doOnPageSelected", "action", "Lkotlin/Function1;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class BLEBridgeExtension {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/geofence/GeofenceContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface TaskHandler {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lid/dana/geofence/GeofenceContract$View;", "Lid/dana/base/AbstractContract$AbstractView;", "onNotifyPoi", "", "success", "", "updatePoiList", "poiList", "", "Lid/dana/geofence/model/PoiModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public interface setMax extends onDelete.length {
            void getMax(@NotNull List<IBLETraceMonitor> list);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH&J\b\u0010\n\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lid/dana/geofence/GeofenceContract$Presenter;", "Lid/dana/base/AbstractContract$AbstractPresenter;", "getGeoFencingConfig", "", "getPoiList", "location", "", "notifyPoi", "poiIds", "", "setRetryInterval", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public interface setMin extends onDelete.getMin {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/google/android/material/tabs/TabLayout$Tab;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class length extends Lambda implements Function2<TabLayout.Tab, Integer, Unit> {
        public static final length INSTANCE = new length();

        length() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((TabLayout.Tab) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull TabLayout.Tab tab, int i) {
            Intrinsics.checkNotNullParameter(tab, "<anonymous parameter 0>");
        }
    }

    public static final void setMax(@NotNull TabLayout tabLayout, @NotNull ViewPager2 viewPager2, @NotNull Function2<? super TabLayout.Tab, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(tabLayout, "$this$attachViewPager");
        Intrinsics.checkNotNullParameter(viewPager2, BottomSheetType.VIEW_PAGER);
        Intrinsics.checkNotNullParameter(function2, "onConfigureTab");
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            public final /* synthetic */ void onConfigureTab(@NonNull TabLayout.Tab tab, int i) {
                Intrinsics.checkNotNullParameter(tab, "p0");
                Intrinsics.checkNotNullExpressionValue(Function2.this.invoke(tab, Integer.valueOf(i)), "invoke(...)");
            }
        }).attach();
    }

    /* renamed from: o.BLEBridgeExtension$8  reason: invalid class name */
    public final class AnonymousClass8 implements getBindingAdapter<GeoFenceTransitionsJobIntentService> {
        @InjectedFieldSignature("id.dana.geofence.GeoFenceTransitionsJobIntentService.geoFencePresenter")
        public static void length(GeoFenceTransitionsJobIntentService geoFenceTransitionsJobIntentService, AnonymousClass6 r1) {
            geoFenceTransitionsJobIntentService.geoFencePresenter = r1;
        }

        @InjectedFieldSignature("id.dana.geofence.GeoFenceTransitionsJobIntentService.geofenceManager")
        public static void getMin(GeoFenceTransitionsJobIntentService geoFenceTransitionsJobIntentService, AnonymousClass9 r1) {
            geoFenceTransitionsJobIntentService.geofenceManager = r1;
        }
    }

    /* renamed from: o.BLEBridgeExtension$7  reason: invalid class name */
    public final class AnonymousClass7 implements getBindingAdapter<UserFeedsActivity> {
        @InjectedFieldSignature("id.dana.feeds.views.UserFeedsActivity.presenter")
        public static void length(UserFeedsActivity userFeedsActivity, getScaleY.length length) {
            userFeedsActivity.presenter = length;
        }
    }
}
