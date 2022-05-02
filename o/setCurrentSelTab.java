package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.domain.social.ModifyRelationOperationType;
import id.dana.social.model.RelationshipItemModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.getQueueTitle;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u001a\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\tH\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lid/dana/social/adapter/viewholder/ReciprocalFriendListViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/RelationshipItemModel;", "parent", "Landroid/view/ViewGroup;", "interaction", "Lid/dana/social/adapter/FriendshipListInteraction;", "getItemAtPosition", "Lkotlin/Function1;", "", "(Landroid/view/ViewGroup;Lid/dana/social/adapter/FriendshipListInteraction;Lkotlin/jvm/functions/Function1;)V", "bindData", "", "data", "loadImage", "imageUrl", "", "setTextForName", "name", "showMenu", "v", "Landroid/view/View;", "menuRes", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setCurrentSelTab extends Ignore<RelationshipItemModel> {
    /* access modifiers changed from: private */
    public final getAuthCodeForSecurityGuard setMax;
    /* access modifiers changed from: private */
    public final Function1<Integer, RelationshipItemModel> setMin;

    public final /* synthetic */ void setMax(Object obj) {
        int i;
        RelationshipItemModel relationshipItemModel = (RelationshipItemModel) obj;
        Intrinsics.checkNotNullParameter(relationshipItemModel, "data");
        super.setMax(relationshipItemModel);
        String str = relationshipItemModel.getMin;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(944507231, oncanceled);
            onCancelLoad.getMin(944507231, oncanceled);
        }
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextView textView = (TextView) view.findViewById(resetInternal.setMax.onCreateDrawableState);
        if (textView != null) {
            textView.setText(str);
        }
        String str2 = relationshipItemModel.setMax;
        if (str2 != null) {
            updateMessageMenuItem<Drawable> min = ((updateCornerMarking) Glide.getMax(this.length)).setMax(isShowMenu.setMin(str2)).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMax((int) R.drawable.ic_avatar_grey_default).setMin((int) R.drawable.ic_avatar_grey_default);
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            min.length((ImageView) view2.findViewById(resetInternal.setMax.checkOnClickListener));
            return;
        }
        View view3 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "itemView");
        ImageView imageView = (ImageView) view3.findViewById(resetInternal.setMax.checkOnClickListener);
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ic_avatar_grey_default);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setCurrentSelTab(@NotNull ViewGroup viewGroup, @NotNull getAuthCodeForSecurityGuard getauthcodeforsecurityguard, @NotNull Function1<? super Integer, RelationshipItemModel> function1) {
        super(viewGroup.getContext(), R.layout.item_all_friend_list, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(getauthcodeforsecurityguard, "interaction");
        Intrinsics.checkNotNullParameter(function1, "getItemAtPosition");
        this.setMax = getauthcodeforsecurityguard;
        this.setMin = function1;
        View view = this.itemView;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(resetInternal.setMax.ColorLong);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new getMax(this));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(resetInternal.setMax.setTint);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new setMax(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/social/adapter/viewholder/ReciprocalFriendListViewHolder$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ setCurrentSelTab setMax;

        getMax(setCurrentSelTab setcurrentseltab) {
            this.setMax = setcurrentseltab;
        }

        public final void onClick(View view) {
            this.setMax.setMax.getMax(this.setMax.getAbsoluteAdapterPosition());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/social/adapter/viewholder/ReciprocalFriendListViewHolder$1$2"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ setCurrentSelTab getMin;

        setMax(setCurrentSelTab setcurrentseltab) {
            this.getMin = setcurrentseltab;
        }

        public final void onClick(View view) {
            String str = ((RelationshipItemModel) this.getMin.setMin.invoke(Integer.valueOf(this.getMin.getAbsoluteAdapterPosition()))).getMax;
            if (str.hashCode() == 2378265 && str.equals("MUTE")) {
                setCurrentSelTab setcurrentseltab = this.getMin;
                Intrinsics.checkNotNullExpressionValue(view, "it");
                setCurrentSelTab.length(setcurrentseltab, view, R.menu.f75152131623940);
                return;
            }
            setCurrentSelTab setcurrentseltab2 = this.getMin;
            Intrinsics.checkNotNullExpressionValue(view, "it");
            setCurrentSelTab.length(setcurrentseltab2, view, R.menu.f75122131623937);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "menuItem", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "onMenuItemClick", "id/dana/social/adapter/viewholder/ReciprocalFriendListViewHolder$showMenu$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements getQueueTitle.length {
        final /* synthetic */ setCurrentSelTab getMin;
        final /* synthetic */ int length;
        final /* synthetic */ View setMax;

        setMin(setCurrentSelTab setcurrentseltab, View view, int i) {
            this.getMin = setcurrentseltab;
            this.setMax = view;
            this.length = i;
        }

        public final boolean length(MenuItem menuItem) {
            ModifyRelationOperationType modifyRelationOperationType;
            Integer valueOf = Integer.valueOf(this.getMin.getAbsoluteAdapterPosition());
            if (!(valueOf.intValue() != -1)) {
                valueOf = null;
            }
            if (valueOf == null) {
                return false;
            }
            int intValue = valueOf.intValue();
            getAuthCodeForSecurityGuard max = this.getMin.setMax;
            Intrinsics.checkNotNullExpressionValue(menuItem, "menuItem");
            int itemId = menuItem.getItemId();
            if (itemId == R.id.f56252131364194) {
                modifyRelationOperationType = ModifyRelationOperationType.MUTE;
            } else if (itemId != R.id.f56272131364196) {
                modifyRelationOperationType = ModifyRelationOperationType.BLOCK;
            } else {
                modifyRelationOperationType = ModifyRelationOperationType.UNMUTE;
            }
            max.getMin(intValue, modifyRelationOperationType);
            return true;
        }
    }

    public static final /* synthetic */ void length(setCurrentSelTab setcurrentseltab, View view, int i) {
        Context context = setcurrentseltab.length;
        if (context != null) {
            getQueueTitle getqueuetitle = new getQueueTitle(context, view);
            new MediaDescriptionCompat(getqueuetitle.setMin).inflate(i, getqueuetitle.getMin);
            getqueuetitle.getMax = new setMin(setcurrentseltab, view, i);
            if (!getqueuetitle.length.setMax()) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }
    }
}
