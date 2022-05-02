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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\tH\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lid/dana/social/view/RestrictedContactItemViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/RelationshipItemModel;", "parent", "Landroid/view/ViewGroup;", "interaction", "Lid/dana/social/adapter/FriendshipListInteraction;", "(Landroid/view/ViewGroup;Lid/dana/social/adapter/FriendshipListInteraction;)V", "activeButtonText", "", "getActiveButtonText", "()Ljava/lang/String;", "activeButtonText$delegate", "Lkotlin/Lazy;", "inactiveButtonText", "getInactiveButtonText", "inactiveButtonText$delegate", "backgroundOf", "", "status", "bindData", "", "data", "loadImage", "imageUrl", "setTextForName", "name", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setWindowMaxWidth extends Ignore<RelationshipItemModel> {
    private final Lazy getMin;
    private final Lazy setMax;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f1  */
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
            java.lang.String r0 = r8.setMax
            r1 = 2131231744(0x7f080400, float:1.8079578E38)
            if (r0 == 0) goto L_0x0059
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
            goto L_0x006b
        L_0x0059:
            android.view.View r0 = r7.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r3 = o.resetInternal.setMax.themifyContext
            android.view.View r0 = r0.findViewById(r3)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x006b
            r0.setImageResource(r1)
        L_0x006b:
            android.view.View r0 = r7.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r1 = o.resetInternal.setMax.INotificationSideChannel
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            if (r0 == 0) goto L_0x00fb
            kotlin.Lazy r1 = r7.setMax
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r8.getMax
            java.lang.String r3 = "ACTIVE"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x00a6
            kotlin.Lazy r2 = r7.getMin
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00a0
            r2 = 1
            goto L_0x00a1
        L_0x00a0:
            r2 = 0
        L_0x00a1:
            if (r2 == 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r2 = 0
            goto L_0x00a7
        L_0x00a6:
            r2 = 1
        L_0x00a7:
            r6 = 0
            if (r2 == 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r1 = r6
        L_0x00ac:
            if (r1 == 0) goto L_0x00b1
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L_0x00bb
        L_0x00b1:
            kotlin.Lazy r1 = r7.getMin
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L_0x00bb:
            r0.setText(r1)
            android.content.Context r1 = r0.getContext()
            java.lang.String r8 = r8.getMax
            r2 = 2131231326(0x7f08025e, float:1.807873E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r3)
            if (r8 == 0) goto L_0x00e7
            kotlin.Lazy r8 = r7.getMin
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            int r8 = r8.length()
            if (r8 <= 0) goto L_0x00e3
            r8 = 1
            goto L_0x00e4
        L_0x00e3:
            r8 = 0
        L_0x00e4:
            if (r8 == 0) goto L_0x00e7
            r4 = 1
        L_0x00e7:
            if (r4 == 0) goto L_0x00ea
            r6 = r2
        L_0x00ea:
            if (r6 == 0) goto L_0x00f1
            int r8 = r6.intValue()
            goto L_0x00f4
        L_0x00f1:
            r8 = 2131231325(0x7f08025d, float:1.8078728E38)
        L_0x00f4:
            android.graphics.drawable.Drawable r8 = o.IntRange.length((android.content.Context) r1, (int) r8)
            r0.setBackground(r8)
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setWindowMaxWidth.setMax(java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setWindowMaxWidth(@NotNull ViewGroup viewGroup, @NotNull getAuthCodeForSecurityGuard getauthcodeforsecurityguard) {
        super(viewGroup.getContext(), R.layout.item_restricted_contact_list, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(getauthcodeforsecurityguard, "interaction");
        this.setMax = LazyKt.lazy(new getMin(getauthcodeforsecurityguard));
        this.getMin = LazyKt.lazy(new length(getauthcodeforsecurityguard));
        View view = this.itemView;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(resetInternal.setMax.ColorLong);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new setMin(this, getauthcodeforsecurityguard));
        }
        Button button = (Button) view.findViewById(resetInternal.setMax.INotificationSideChannel);
        if (button != null) {
            button.setOnClickListener(new getMax(this, getauthcodeforsecurityguard));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<String> {
        final /* synthetic */ getAuthCodeForSecurityGuard $interaction;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(getAuthCodeForSecurityGuard getauthcodeforsecurityguard) {
            super(0);
            this.$interaction = getauthcodeforsecurityguard;
        }

        @NotNull
        public final String invoke() {
            return this.$interaction.length();
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
            return this.$interaction.getMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/social/view/RestrictedContactItemViewHolder$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ getAuthCodeForSecurityGuard getMax;
        final /* synthetic */ setWindowMaxWidth length;

        setMin(setWindowMaxWidth setwindowmaxwidth, getAuthCodeForSecurityGuard getauthcodeforsecurityguard) {
            this.length = setwindowmaxwidth;
            this.getMax = getauthcodeforsecurityguard;
        }

        public final void onClick(View view) {
            this.getMax.getMax(this.length.getAdapterPosition());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/social/view/RestrictedContactItemViewHolder$1$2"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ getAuthCodeForSecurityGuard setMax;
        final /* synthetic */ setWindowMaxWidth setMin;

        getMax(setWindowMaxWidth setwindowmaxwidth, getAuthCodeForSecurityGuard getauthcodeforsecurityguard) {
            this.setMin = setwindowmaxwidth;
            this.setMax = getauthcodeforsecurityguard;
        }

        public final void onClick(View view) {
            this.setMax.getMin(this.setMin.getAdapterPosition());
        }
    }
}
