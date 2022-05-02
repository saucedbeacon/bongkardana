package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import id.dana.R;
import id.dana.domain.profilemenu.model.SettingModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lid/dana/myprofile/viewholder/ProfileMenuSettingMoreViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/domain/profilemenu/model/SettingModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "setOnItemClickListener", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getAppDesc extends Ignore<SettingModel> {
    public final /* synthetic */ void setMax(Object obj) {
        SettingModel settingModel = (SettingModel) obj;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        view.setVisibility(0);
        if (settingModel != null) {
            View view2 = this.itemView;
            view2.setVisibility(0);
            view2.setContentDescription(view2.getContext().getString(R.string.lbl_profile_settings));
            TextView textView = (TextView) view2.findViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
            if (textView != null) {
                String title = settingModel.getTitle();
                if (title == null) {
                    title = "";
                }
                textView.setText(title);
            }
            CharSequence subtitle = settingModel.getSubtitle();
            if (!(subtitle == null || subtitle.length() == 0)) {
                TextView textView2 = (TextView) view2.findViewById(resetInternal.setMax.loadBitmap);
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                TextView textView3 = (TextView) view2.findViewById(resetInternal.setMax.loadBitmap);
                if (textView3 != null) {
                    textView3.setText(settingModel.getSubtitle());
                    return;
                }
                return;
            }
            TextView textView4 = (TextView) view2.findViewById(resetInternal.setMax.loadBitmap);
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getAppDesc(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.view_profile_setting_more, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ getAppDesc setMax;
        final /* synthetic */ Ignore.setMin setMin;

        setMax(getAppDesc getappdesc, Ignore.setMin setmin) {
            this.setMax = getappdesc;
            this.setMin = setmin;
        }

        public final void onClick(View view) {
            this.setMin.length(this.setMax.getAdapterPosition());
        }
    }

    public final void setMin(@NotNull Ignore.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "onItemClickListener");
        this.itemView.setOnClickListener(new setMax(this, setmin));
    }
}
