package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.emoji.widget.EmojiAppCompatTextView;
import id.dana.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.MyBeaconServiceImpl;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B0\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016R)\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lid/dana/social/adapter/ReactionListViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/ReactionModel;", "parent", "Landroid/view/ViewGroup;", "onReactionClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "reactionModel", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "getParent", "()Landroid/view/ViewGroup;", "bindData", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AUImageView extends Ignore<access$2402> {
    @NotNull
    private final ViewGroup getMin;
    /* access modifiers changed from: private */
    public final Function1<access$2402, Unit> setMin;

    public final /* synthetic */ void setMax(Object obj) {
        access$2402 access_2402 = (access$2402) obj;
        if (access_2402 != null) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            EmojiAppCompatTextView emojiAppCompatTextView = (EmojiAppCompatTextView) view.findViewById(resetInternal.setMax.getTextOff);
            if (emojiAppCompatTextView != null) {
                MyBeaconServiceImpl.AnonymousClass1.C00531.getMin(emojiAppCompatTextView, access_2402.setMin);
            }
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            EmojiAppCompatTextView emojiAppCompatTextView2 = (EmojiAppCompatTextView) view2.findViewById(resetInternal.setMax.getTextOff);
            if (emojiAppCompatTextView2 != null) {
                emojiAppCompatTextView2.setOnClickListener(new setMax(access_2402, this));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AUImageView(@NotNull ViewGroup viewGroup, @NotNull Function1<? super access$2402, Unit> function1) {
        super(viewGroup.getContext(), R.layout.viewholder_reaction_emoji, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(function1, "onReactionClick");
        this.getMin = viewGroup;
        this.setMin = function1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/social/adapter/ReactionListViewHolder$bindData$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ access$2402 length;
        final /* synthetic */ AUImageView setMax;

        setMax(access$2402 access_2402, AUImageView aUImageView) {
            this.length = access_2402;
            this.setMax = aUImageView;
        }

        public final void onClick(View view) {
            this.setMax.setMin.invoke(this.length);
        }
    }
}
