package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tJ\u0012\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0002H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lid/dana/social/adapter/friendsheader/FriendsFeedsHeaderViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/FriendModel;", "parent", "Landroid/view/ViewGroup;", "onClick", "Lkotlin/Function1;", "", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "getParent", "()Landroid/view/ViewGroup;", "bindData", "data", "setProfileAvatar", "profileAvatar", "", "getNoMoreThan10CharNickname", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getBottomLine extends Ignore<performItemClick> {
    @NotNull
    private final ViewGroup setMin;

    public final /* synthetic */ void setMax(Object obj) {
        performItemClick performitemclick = (performItemClick) obj;
        if (performitemclick != null) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(resetInternal.setMax.getThumbScrollRange);
            if (appCompatTextView != null) {
                String str = performitemclick.getMax;
                if (str.length() > 10) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(StringsKt.substring(str, new IntRange(0, 9)));
                    sb.append("...");
                    str = sb.toString();
                }
                appCompatTextView.setText(str);
            }
            String str2 = performitemclick.setMax;
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            CircleImageView circleImageView = (CircleImageView) view2.findViewById(resetInternal.setMax.createViewByPrefix);
            if (circleImageView != null) {
                ((updateCornerMarking) Glide.getMax(circleImageView.getContext())).equals().length(str2).setMax((int) R.drawable.avatar_placeholder).setMin((int) R.drawable.avatar_placeholder).length((ImageView) circleImageView);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getBottomLine(@NotNull ViewGroup viewGroup, @NotNull final Function1<? super Integer, Unit> function1) {
        super(viewGroup.getContext(), R.layout.viewholder_friends_header, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(function1, "onClick");
        this.setMin = viewGroup;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(resetInternal.setMax.setPreventCornerOverlap);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener(this) {
                final /* synthetic */ getBottomLine getMin;

                {
                    this.getMin = r1;
                }

                public final void onClick(View view) {
                    function1.invoke(Integer.valueOf(this.getMin.getBindingAdapterPosition() - 1));
                }
            });
        }
    }
}
