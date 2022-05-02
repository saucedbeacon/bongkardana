package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.Glide;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.social.model.FeedModel;
import id.dana.social.model.RelationshipItemModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/social/adapter/SocialProfileHeaderViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/FeedViewHolderModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "getParent", "()Landroid/view/ViewGroup;", "bindData", "", "data", "bindFriendData", "bindMyData", "loadImage", "imageUrl", "", "renderUsername", "username", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setCurrentProgress extends Ignore<setEmptyView> {
    @NotNull
    private final ViewGroup getMax;

    public final /* synthetic */ void setMax(Object obj) {
        FeedModel feedModel;
        RelationshipItemModel relationshipItemModel;
        setEmptyView setemptyview = (setEmptyView) obj;
        if (setemptyview == null) {
            return;
        }
        if (setemptyview.getMax()) {
            if (setemptyview != null && (relationshipItemModel = setemptyview.setMin) != null) {
                setMax(relationshipItemModel.setMax);
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(resetInternal.setMax.setOnSearchClickListener);
                if (appCompatTextView != null) {
                    appCompatTextView.setText(relationshipItemModel.getMin);
                }
                getMin(relationshipItemModel.isInside);
            }
        } else if (setemptyview != null && (feedModel = setemptyview.setMax) != null) {
            setMax(feedModel.equals);
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) view2.findViewById(resetInternal.setMax.setOnSearchClickListener);
            if (appCompatTextView2 != null) {
                appCompatTextView2.setText(feedModel.getMax);
            }
            getMin(feedModel.setMin());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setCurrentProgress(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.viewholder_social_profile_header, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        this.getMax = viewGroup;
    }

    private final void getMin(String str) {
        CharSequence charSequence = str;
        if (!(charSequence.length() > 0)) {
            str = null;
        }
        if (str != null) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(resetInternal.setMax.onGetSmallIconId);
            if (appCompatTextView != null) {
                appCompatTextView.setText(charSequence);
            }
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) view2.findViewById(resetInternal.setMax.onGetSmallIconId);
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(0);
                return;
            }
            return;
        }
        View view3 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "itemView");
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) view3.findViewById(resetInternal.setMax.onGetSmallIconId);
        if (appCompatTextView3 != null) {
            appCompatTextView3.setVisibility(8);
        }
    }

    private final void setMax(String str) {
        if (str != null) {
            updateMessageMenuItem<Drawable> min = ((updateCornerMarking) Glide.getMax(this.length)).setMax(str).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMax((int) R.drawable.ic_avatar_grey_default).setMin((int) R.drawable.ic_avatar_grey_default);
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            Intrinsics.checkNotNullExpressionValue(min.length((ImageView) (CircleImageView) view.findViewById(resetInternal.setMax.getLaunchPendingIntent)), "GlideApp\n               …temView.civSocialProfile)");
            return;
        }
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        ((CircleImageView) view2.findViewById(resetInternal.setMax.getLaunchPendingIntent)).setImageResource(R.drawable.ic_avatar_grey_default);
    }
}
