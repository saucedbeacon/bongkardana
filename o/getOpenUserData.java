package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.richview.EllipseTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.ProgramSettingExtension;
import o.getSetting;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lid/dana/nearbyrevamp/search/adapter/NearbyTrendingItemAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/search/model/NearbySearchItemModel;", "()V", "listener", "Lid/dana/nearbyrevamp/search/adapter/NearbySearchSectionAdapter$NearbySectionListener;", "getListener", "()Lid/dana/nearbyrevamp/search/adapter/NearbySearchSectionAdapter$NearbySectionListener;", "setListener", "(Lid/dana/nearbyrevamp/search/adapter/NearbySearchSectionAdapter$NearbySectionListener;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "NearbyTrendingViewHolder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getOpenUserData extends IMultiInstanceInvalidationCallback.Stub<Ignore<ProgramSettingExtension.AnonymousClass2>, ProgramSettingExtension.AnonymousClass2> {
    @Nullable
    public getSetting.setMax setMax;

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new setMax(viewGroup, this.setMax);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lid/dana/nearbyrevamp/search/adapter/NearbyTrendingItemAdapter$NearbyTrendingViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/search/model/NearbySearchItemModel;", "parent", "Landroid/view/ViewGroup;", "listener", "Lid/dana/nearbyrevamp/search/adapter/NearbySearchSectionAdapter$NearbySectionListener;", "(Landroid/view/ViewGroup;Lid/dana/nearbyrevamp/search/adapter/NearbySearchSectionAdapter$NearbySectionListener;)V", "getListener", "()Lid/dana/nearbyrevamp/search/adapter/NearbySearchSectionAdapter$NearbySectionListener;", "getParent", "()Landroid/view/ViewGroup;", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends Ignore<ProgramSettingExtension.AnonymousClass2> {
        @NotNull
        private final ViewGroup setMax;
        @Nullable
        final getSetting.setMax setMin;

        public final /* synthetic */ void setMax(Object obj) {
            ProgramSettingExtension.AnonymousClass2 r4 = (ProgramSettingExtension.AnonymousClass2) obj;
            if (r4 != null) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                EllipseTextView ellipseTextView = (EllipseTextView) view.findViewById(resetInternal.setMax.MainThread);
                if (ellipseTextView != null) {
                    ellipseTextView.setText(r4.getMin);
                    ellipseTextView.setStrokeColor(IntRange.setMax(ellipseTextView.getContext(), R.color.f24642131100414));
                    Context context = ellipseTextView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                    ellipseTextView.setCornerRadius(context.getResources().getDimension(R.dimen.f26272131165275));
                    ellipseTextView.setOnClickListener(new C0059setMax(this, r4));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(@NotNull ViewGroup viewGroup, @Nullable getSetting.setMax setmax) {
            super(viewGroup.getContext(), R.layout.item_nearby_trending_keyword, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            this.setMax = viewGroup;
            this.setMin = setmax;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/nearbyrevamp/search/adapter/NearbyTrendingItemAdapter$NearbyTrendingViewHolder$bindData$1$1"}, k = 3, mv = {1, 4, 2})
        /* renamed from: o.getOpenUserData$setMax$setMax  reason: collision with other inner class name */
        static final class C0059setMax implements View.OnClickListener {
            final /* synthetic */ setMax getMax;
            final /* synthetic */ ProgramSettingExtension.AnonymousClass2 setMax;

            C0059setMax(setMax setmax, ProgramSettingExtension.AnonymousClass2 r2) {
                this.getMax = setmax;
                this.setMax = r2;
            }

            public final void onClick(View view) {
                getSetting.setMax setmax = this.getMax.setMin;
                if (setmax != null) {
                    setmax.getMin(this.setMax.getMin, this.setMax.setMin);
                }
            }
        }
    }
}
