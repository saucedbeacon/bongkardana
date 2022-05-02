package o;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import id.dana.R;
import id.dana.domain.profilemenu.model.SettingModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0014\u0010\f\u001a\u00020\u0007*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¨\u0006\u0015"}, d2 = {"Lid/dana/myprofile/viewholder/ProfileMenuShareFeedViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/domain/profilemenu/model/SettingModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "setOnItemClickListener", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "changeSwitchColorAccordingtoState", "Landroid/view/View;", "isChecked", "", "getColorState", "Landroid/content/res/ColorStateList;", "Landroidx/appcompat/widget/SwitchCompat;", "colorRes", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getServiceEmail extends Ignore<SettingModel> {
    public final /* synthetic */ void setMax(Object obj) {
        SettingModel settingModel = (SettingModel) obj;
        if (settingModel != null) {
            View view = this.itemView;
            TextView textView = (TextView) view.findViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
            Intrinsics.checkNotNullExpressionValue(textView, "tv_title");
            textView.setText(settingModel.getTitle());
            SwitchCompat switchCompat = (SwitchCompat) view.findViewById(resetInternal.setMax.AppCompatSeekBar);
            Intrinsics.checkNotNullExpressionValue(switchCompat, "sb_share_feed");
            switchCompat.setChecked(settingModel.isShareFeed());
            getMin(view, settingModel.isShareFeed());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getServiceEmail(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_menu_share_feed_view, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    public final void setMin(@Nullable Ignore.setMin setmin) {
        View view = this.itemView;
        ((SwitchCompat) view.findViewById(resetInternal.setMax.AppCompatSeekBar)).setOnClickListener(new setMax(this, setmin));
        ((SwitchCompat) view.findViewById(resetInternal.setMax.AppCompatSeekBar)).setOnCheckedChangeListener(new getMin(view, this, setmin));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/myprofile/viewholder/ProfileMenuShareFeedViewHolder$setOnItemClickListener$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ getServiceEmail length;
        final /* synthetic */ Ignore.setMin setMax;

        setMax(getServiceEmail getserviceemail, Ignore.setMin setmin) {
            this.length = getserviceemail;
            this.setMax = setmin;
        }

        public final void onClick(View view) {
            Ignore.setMin setmin = this.setMax;
            if (setmin != null) {
                setmin.length(this.length.getAdapterPosition());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged", "id/dana/myprofile/viewholder/ProfileMenuShareFeedViewHolder$setOnItemClickListener$1$2"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ View getMax;
        final /* synthetic */ getServiceEmail getMin;
        final /* synthetic */ Ignore.setMin length;

        getMin(View view, getServiceEmail getserviceemail, Ignore.setMin setmin) {
            this.getMax = view;
            this.getMin = getserviceemail;
            this.length = setmin;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            getServiceEmail.getMin(this.getMax, z);
        }
    }

    /* access modifiers changed from: private */
    public static void getMin(View view, boolean z) {
        ColorStateList colorStateList;
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(resetInternal.setMax.AppCompatSeekBar);
        switchCompat.setThumbTintList(IntRange.getMin(switchCompat.getContext(), (int) R.color.f19052131099800));
        if (z) {
            colorStateList = IntRange.getMin(switchCompat.getContext(), (int) R.color.f18392131099713);
        } else {
            colorStateList = IntRange.getMin(switchCompat.getContext(), (int) R.color.f24612131100411);
        }
        switchCompat.setTrackTintList(colorStateList);
    }
}
