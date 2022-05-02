package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/nearbyme/adapter/NearbyLocationResultAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/nearbyme/adapter/NearbyLocationResultAdapter$NearbyLocationResultViewHolder;", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "onClickListener", "Lid/dana/nearbyme/adapter/NearbyLocationResultAdapter$OnClickListener;", "(Lid/dana/nearbyme/adapter/NearbyLocationResultAdapter$OnClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "NearbyLocationResultViewHolder", "OnClickListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getHandlerClassName extends IMultiInstanceInvalidationCallback.Stub<getMin, getCreateTime> {
    private final setMin getMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/adapter/NearbyLocationResultAdapter$OnClickListener;", "", "onLocationClicked", "", "placeId", "", "name", "address", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin {
        void onLocationClicked(@NotNull String str, @NotNull String str2, @NotNull String str3);
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new getMin(viewGroup);
    }

    public getHandlerClassName(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "onClickListener");
        this.getMin = setmin;
    }

    /* access modifiers changed from: private */
    /* renamed from: getMax */
    public void onBindViewHolder(@NotNull getMin getmin, int i) {
        Intrinsics.checkNotNullParameter(getmin, "holder");
        super.onBindViewHolder(getmin, i);
        getmin.setMax((getCreateTime) getMax().get(i));
        setMin setmin = this.getMin;
        Intrinsics.checkNotNullParameter(setmin, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        getmin.setMin = setmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/nearbyme/adapter/NearbyLocationResultAdapter$NearbyLocationResultViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "onClickListener", "Lid/dana/nearbyme/adapter/NearbyLocationResultAdapter$OnClickListener;", "bindData", "", "data", "setClickListener", "listener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends Ignore<getCreateTime> {
        /* access modifiers changed from: package-private */
        public setMin setMin;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMin(@NotNull ViewGroup viewGroup) {
            super(viewGroup.getContext(), R.layout.item_location_result, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
        }

        /* renamed from: length */
        public final void setMax(@Nullable getCreateTime getcreatetime) {
            if (getcreatetime != null) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                TextView textView = (TextView) view.findViewById(resetInternal.setMax.setSubtitleTextColor);
                Intrinsics.checkNotNullExpressionValue(textView, "itemView.tv_location_name");
                textView.setText(getcreatetime.getName());
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                TextView textView2 = (TextView) view2.findViewById(resetInternal.setMax.setTitleTextAppearance);
                Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tv_location_address");
                textView2.setText(getcreatetime.getDescription());
                this.itemView.setOnClickListener(new setMin(this, getcreatetime));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/nearbyme/adapter/NearbyLocationResultAdapter$NearbyLocationResultViewHolder$bindData$1$1"}, k = 3, mv = {1, 4, 2})
        static final class setMin implements View.OnClickListener {
            final /* synthetic */ getMin getMax;
            final /* synthetic */ getCreateTime setMax;

            setMin(getMin getmin, getCreateTime getcreatetime) {
                this.getMax = getmin;
                this.setMax = getcreatetime;
            }

            public final void onClick(View view) {
                setMin min = this.getMax.setMin;
                if (min != null) {
                    min.onLocationClicked(this.setMax.getPlaceId(), this.setMax.getName(), this.setMax.getDescription());
                }
            }
        }
    }
}
