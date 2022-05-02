package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.dana.R;
import id.dana.social.model.RelationshipItemModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\tH\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\tH\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lid/dana/social/view/FriendshipItemViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/RelationshipItemModel;", "parent", "Landroid/view/ViewGroup;", "interaction", "Lid/dana/social/adapter/FriendshipListInteraction;", "(Landroid/view/ViewGroup;Lid/dana/social/adapter/FriendshipListInteraction;)V", "activeButtonText", "", "getActiveButtonText", "()Ljava/lang/String;", "activeButtonText$delegate", "Lkotlin/Lazy;", "inactiveButtonText", "getInactiveButtonText", "inactiveButtonText$delegate", "backgroundOf", "", "status", "bindData", "", "data", "loadImage", "imageUrl", "setPhoneNumber", "phoneNumber", "setTextForName", "name", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class addListButtonView extends Ignore<RelationshipItemModel> {
    private final Lazy getMax;
    private final Lazy setMax;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void setMax(java.lang.Object r8) {
        /*
            r7 = this;
            id.dana.social.model.RelationshipItemModel r8 = (id.dana.social.model.RelationshipItemModel) r8
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = r8.getMin
            android.view.View r1 = r7.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            int r3 = o.resetInternal.setMax.getTextOn
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x001f
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
        L_0x001f:
            java.lang.String r0 = r8.setMin
            android.view.View r1 = r7.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            int r3 = o.resetInternal.setMax.measureChildCollapseMargins
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0035
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
        L_0x0035:
            java.lang.String r0 = r8.setMax
            r1 = 2131231744(0x7f080400, float:1.8079578E38)
            if (r0 == 0) goto L_0x006f
            android.content.Context r3 = r7.length
            o.setHorizontalGap r3 = com.bumptech.glide.Glide.getMax((android.content.Context) r3)
            o.updateCornerMarking r3 = (o.updateCornerMarking) r3
            java.lang.String r0 = o.isShowMenu.setMin(r0)
            o.updateMessageMenuItem r0 = r3.setMax((java.lang.String) r0)
            o.dispatchApplyWindowInsetsToBehaviors r3 = o.isLineVisible.getMax()
            o.getTopSortedChildren r3 = (o.getTopSortedChildren) r3
            o.updateMessageMenuItem r0 = r0.setMax((o.getTopSortedChildren<?>) r3)
            o.updateMessageMenuItem r0 = r0.setMax((int) r1)
            o.updateMessageMenuItem r0 = r0.setMin((int) r1)
            android.view.View r1 = r7.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            int r3 = o.resetInternal.setMax.themifyContext
            android.view.View r1 = r1.findViewById(r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.length((android.widget.ImageView) r1)
            goto L_0x0081
        L_0x006f:
            android.view.View r0 = r7.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r3 = o.resetInternal.setMax.themifyContext
            android.view.View r0 = r0.findViewById(r3)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x0081
            r0.setImageResource(r1)
        L_0x0081:
            android.view.View r0 = r7.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r1 = o.resetInternal.setMax.INotificationSideChannel
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            if (r0 == 0) goto L_0x0111
            kotlin.Lazy r1 = r7.setMax
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r8.getMax
            java.lang.String r3 = "ACTIVE"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x00bc
            kotlin.Lazy r2 = r7.getMax
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00b6
            r2 = 1
            goto L_0x00b7
        L_0x00b6:
            r2 = 0
        L_0x00b7:
            if (r2 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r2 = 0
            goto L_0x00bd
        L_0x00bc:
            r2 = 1
        L_0x00bd:
            r6 = 0
            if (r2 == 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r1 = r6
        L_0x00c2:
            if (r1 == 0) goto L_0x00c7
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L_0x00d1
        L_0x00c7:
            kotlin.Lazy r1 = r7.getMax
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L_0x00d1:
            r0.setText(r1)
            android.content.Context r1 = r0.getContext()
            java.lang.String r8 = r8.getMax
            r2 = 2131231326(0x7f08025e, float:1.807873E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r3)
            if (r8 == 0) goto L_0x00fd
            kotlin.Lazy r8 = r7.getMax
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            int r8 = r8.length()
            if (r8 <= 0) goto L_0x00f9
            r8 = 1
            goto L_0x00fa
        L_0x00f9:
            r8 = 0
        L_0x00fa:
            if (r8 == 0) goto L_0x00fd
            r4 = 1
        L_0x00fd:
            if (r4 == 0) goto L_0x0100
            r6 = r2
        L_0x0100:
            if (r6 == 0) goto L_0x0107
            int r8 = r6.intValue()
            goto L_0x010a
        L_0x0107:
            r8 = 2131231325(0x7f08025d, float:1.8078728E38)
        L_0x010a:
            android.graphics.drawable.Drawable r8 = o.IntRange.length((android.content.Context) r1, (int) r8)
            r0.setBackground(r8)
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addListButtonView.setMax(java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public addListButtonView(@NotNull ViewGroup viewGroup, @NotNull getAuthCodeForSecurityGuard getauthcodeforsecurityguard) {
        super(viewGroup.getContext(), R.layout.item_friendship_list, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(getauthcodeforsecurityguard, "interaction");
        this.setMax = LazyKt.lazy(new length(getauthcodeforsecurityguard));
        this.getMax = LazyKt.lazy(new setMin(getauthcodeforsecurityguard));
        View view = this.itemView;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(resetInternal.setMax.ColorLong);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new setMax(this, getauthcodeforsecurityguard));
        }
        Button button = (Button) view.findViewById(resetInternal.setMax.INotificationSideChannel);
        if (button != null) {
            button.setOnClickListener(new getMin(this, getauthcodeforsecurityguard));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<String> {
        final /* synthetic */ getAuthCodeForSecurityGuard $interaction;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(getAuthCodeForSecurityGuard getauthcodeforsecurityguard) {
            super(0);
            this.$interaction = getauthcodeforsecurityguard;
        }

        @NotNull
        public final String invoke() {
            return this.$interaction.length();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<String> {
        final /* synthetic */ getAuthCodeForSecurityGuard $interaction;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(getAuthCodeForSecurityGuard getauthcodeforsecurityguard) {
            super(0);
            this.$interaction = getauthcodeforsecurityguard;
        }

        @NotNull
        public final String invoke() {
            return this.$interaction.getMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/social/view/FriendshipItemViewHolder$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ getAuthCodeForSecurityGuard setMax;
        final /* synthetic */ addListButtonView setMin;

        setMax(addListButtonView addlistbuttonview, getAuthCodeForSecurityGuard getauthcodeforsecurityguard) {
            this.setMin = addlistbuttonview;
            this.setMax = getauthcodeforsecurityguard;
        }

        public final void onClick(View view) {
            this.setMax.getMax(this.setMin.getAdapterPosition());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/social/view/FriendshipItemViewHolder$1$2"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ addListButtonView getMin;
        final /* synthetic */ getAuthCodeForSecurityGuard setMin;

        getMin(addListButtonView addlistbuttonview, getAuthCodeForSecurityGuard getauthcodeforsecurityguard) {
            this.getMin = addlistbuttonview;
            this.setMin = getauthcodeforsecurityguard;
        }

        public final void onClick(View view) {
            this.setMin.getMin(this.getMin.getAdapterPosition());
        }
    }
}
