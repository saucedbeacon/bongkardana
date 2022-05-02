package o;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.domain.profilemenu.model.SettingModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lid/dana/myprofile/viewholder/ProfileMenuAvatarViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/domain/profilemenu/model/SettingModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "setOnItemClickListener", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class IpcMsgServerService extends Ignore<SettingModel> {
    public final /* synthetic */ void setMax(Object obj) {
        SettingModel settingModel = (SettingModel) obj;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        ImageView imageView = (ImageView) view.findViewById(resetInternal.setMax.setColorFilter);
        if (imageView != null) {
            View view2 = imageView;
            CharSequence avatarUrl = settingModel != null ? settingModel.getAvatarUrl() : null;
            int i = 0;
            boolean z = avatarUrl == null || avatarUrl.length() == 0;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            if (!z) {
                i = 8;
            }
            view2.setVisibility(i);
        }
        if (settingModel != null) {
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView = (TextView) view3.findViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
            if (textView != null) {
                textView.setText(settingModel.getTitle());
            }
            updateMessageMenuItem<Bitmap> min = ((updateCornerMarking) Glide.getMax(this.length)).equals().length(settingModel.getAvatarUrl()).setMin((int) R.drawable.avatar_placeholder);
            View view4 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            min.length((ImageView) (CircleImageView) view4.findViewById(resetInternal.setMax.setOverlayMode));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IpcMsgServerService(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_menu_avatar, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ Ignore.setMin getMax;
        final /* synthetic */ IpcMsgServerService setMin;

        setMax(IpcMsgServerService ipcMsgServerService, Ignore.setMin setmin) {
            this.setMin = ipcMsgServerService;
            this.getMax = setmin;
        }

        public final void onClick(View view) {
            this.getMax.length(this.setMin.getAdapterPosition());
        }
    }

    public final void setMin(@NotNull Ignore.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "onItemClickListener");
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(resetInternal.setMax.MediaSessionCompat$MediaSessionImplBase$MediaSessionStub);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new setMax(this, setmin));
        }
    }
}
