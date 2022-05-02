package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.richview.profile.switchautoroute.SwitchAutoRouteView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\tJ\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lid/dana/myprofile/viewholder/ProfileMenuAutoSwitchViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/domain/profilemenu/model/SettingModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "switchAutoRouteView", "Lid/dana/richview/profile/switchautoroute/SwitchAutoRouteView;", "bindData", "", "data", "proceedSwitchOn", "revertChecked", "saveSwitchState", "isChecked", "", "setOnItemClickListener", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "setViewVisibility", "isVisible", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setAppIntro extends Ignore<SettingModel> {
    public final SwitchAutoRouteView setMin;

    public final /* synthetic */ void setMax(Object obj) {
        this.setMin.onBind((SettingModel) obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setAppIntro(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_menu_switch_autoroute, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        SwitchAutoRouteView switchAutoRouteView = (SwitchAutoRouteView) view.findViewById(resetInternal.setMax.setPaddingTop);
        Intrinsics.checkNotNullExpressionValue(switchAutoRouteView, "itemView.view_autoroute_switch");
        this.setMin = switchAutoRouteView;
        switchAutoRouteView.setViewVisibility(false);
    }

    public final void setMin(@Nullable Ignore.setMin setmin) {
        this.setMin.setSwitchButtonOnClickListener(new getMax(this, setmin));
        this.setMin.setSwitchButtonOnCheckedChangeListener(new setMax(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ setAppIntro getMin;
        final /* synthetic */ Ignore.setMin length;

        getMax(setAppIntro setappintro, Ignore.setMin setmin) {
            this.getMin = setappintro;
            this.length = setmin;
        }

        public final void onClick(View view) {
            Ignore.setMin setmin;
            if (this.getMin.getBindingAdapterPosition() >= 0 && (setmin = this.length) != null) {
                setmin.length(this.getMin.getBindingAdapterPosition());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ setAppIntro setMax;

        setMax(setAppIntro setappintro) {
            this.setMax = setappintro;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SwitchAutoRouteView min = this.setMax.setMin;
            Intrinsics.checkNotNullExpressionValue(compoundButton, "buttonView");
            min.onCheckedChange(compoundButton, z);
            setAppIntro.getMin(this.setMax, z);
        }
    }

    public static final /* synthetic */ void getMin(setAppIntro setappintro, boolean z) {
        RecyclerView.Adapter<? extends RecyclerView.valueOf> bindingAdapter = setappintro.getBindingAdapter();
        if (bindingAdapter != null) {
            getImageResId getimageresid = (getImageResId) bindingAdapter;
            if (setappintro.getBindingAdapterPosition() >= 0) {
                Object obj = getimageresid.getMax().get(setappintro.getBindingAdapterPosition());
                Intrinsics.checkNotNullExpressionValue(obj, "myProfileAdapter.items[bindingAdapterPosition]");
                ((SettingModel) obj).setAutoRouteSwitch(z);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.myprofile.adapter.MyProfileAdapter");
    }
}
