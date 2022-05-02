package o;

import android.view.ViewGroup;
import dagger.internal.InjectedFieldSignature;
import id.dana.R;
import id.dana.domain.social.ModifyRelationOperationType;
import id.dana.social.view.SocialWidgetView;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import o.addSubTitleView;
import org.jetbrains.annotations.NotNull;

public final class AUBasicDialog implements getBindingAdapter<SocialWidgetView> {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* renamed from: o.AUBasicDialog$1  reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] length;

        static {
            int[] iArr = new int[ModifyRelationOperationType.values().length];
            length = iArr;
            iArr[ModifyRelationOperationType.BLOCK.ordinal()] = 1;
            length[ModifyRelationOperationType.UNBLOCK.ordinal()] = 2;
            length[ModifyRelationOperationType.MUTE.ordinal()] = 3;
            length[ModifyRelationOperationType.UNMUTE.ordinal()] = 4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lid/dana/social/view/activity/detail/EmptyViewHolder;", "T", "", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/state/ViewHolderState;", "parent", "Landroid/view/ViewGroup;", "layout", "", "(Landroid/view/ViewGroup;I)V", "getParent", "()Landroid/view/ViewGroup;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class Priority<T> extends Ignore<AUHorizontalListView.RecyclerListener<? extends T>> {
        @NotNull
        private final ViewGroup getMin;

        public /* synthetic */ Priority(ViewGroup viewGroup) {
            this(viewGroup, (byte) 0);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private Priority(@NotNull ViewGroup viewGroup, byte b) {
            super(viewGroup.getContext(), R.layout.viewholder_empty_state, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            this.getMin = viewGroup;
        }
    }

    @InjectedFieldSignature("id.dana.social.view.SocialWidgetView.presenter")
    @Named("oldSocialWidgetPresenter")
    public static void setMin(SocialWidgetView socialWidgetView, addSubTitleView.getMin getmin) {
        socialWidgetView.presenter = getmin;
    }
}
