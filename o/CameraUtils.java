package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import dagger.internal.InjectedFieldSignature;
import id.dana.model.ThirdPartyService;
import id.dana.richview.profile.switchautoroute.SwitchAutoRouteView;
import id.dana.richview.servicescard.ServiceCategoryView;
import id.dana.richview.servicescard.adapter.viewholder.NewPromotedServiceViewHolder;
import id.dana.richview.servicescard.adapter.viewholder.NewServiceViewHolder;
import o.BindDimen;
import o.IMultiInstanceInvalidationCallback;

public final class CameraUtils implements getBindingAdapter<SwitchAutoRouteView> {

    public class CameraSizeComparator extends IMultiInstanceInvalidationCallback.Stub<Ignore<ThirdPartyService>, ThirdPartyService> {
        private boolean length;
        private final View.OnClickListener setMax;

        static /* synthetic */ void setMax() {
        }

        public CameraSizeComparator() {
            this.setMax = isTablet.setMax;
        }

        public CameraSizeComparator(View.OnClickListener onClickListener) {
            this.length = true;
            this.setMax = onClickListener;
        }

        public int getItemViewType(int i) {
            return (!this.length || i != 0) ? 1 : 0;
        }

        @NonNull
        public /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View.OnClickListener onClickListener = this.setMax;
            Context context = viewGroup.getContext();
            if (i == 0) {
                return new NewPromotedServiceViewHolder(context, viewGroup, onClickListener);
            }
            return new NewServiceViewHolder(context, viewGroup);
        }
    }

    public final class CameraHelperListener implements getBindingAdapter<ServiceCategoryView> {
        @InjectedFieldSignature("id.dana.richview.servicescard.ServiceCategoryView.serviceCategoryPresenter")
        public static void setMin(ServiceCategoryView serviceCategoryView, BindDimen.setMax setmax) {
            serviceCategoryView.serviceCategoryPresenter = setmax;
        }
    }

    @InjectedFieldSignature("id.dana.richview.profile.switchautoroute.SwitchAutoRouteView.switchAutoRoutePresenter")
    public static void setMax(SwitchAutoRouteView switchAutoRouteView, CaptureParam captureParam) {
        switchAutoRouteView.switchAutoRoutePresenter = captureParam;
    }

    @InjectedFieldSignature("id.dana.richview.profile.switchautoroute.SwitchAutoRouteView.switchAutoRouteAnalyticsTracker")
    public static void setMax(SwitchAutoRouteView switchAutoRouteView, getPictureSize getpicturesize) {
        switchAutoRouteView.switchAutoRouteAnalyticsTracker = getpicturesize;
    }
}
