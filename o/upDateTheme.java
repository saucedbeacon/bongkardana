package o;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u000bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/social/adapter/SocialFeedViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/SocialFeedModel;", "parent", "Landroid/view/ViewGroup;", "feedSize", "", "listener", "Lid/dana/social/adapter/SocialFeedClickListener;", "(Landroid/view/ViewGroup;ILid/dana/social/adapter/SocialFeedClickListener;)V", "bindData", "", "data", "getProfileUrl", "", "loadImage", "imageUrl", "setDate", "date", "setDesc", "Lid/dana/social/utils/FeedRegexData;", "setOnClickListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class upDateTheme extends Ignore<access$2502> {
    private final int getMax;
    /* access modifiers changed from: private */
    public final initContent setMin;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r0 == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r0 = (java.util.HashMap) new com.google.gson.Gson().fromJson((r0 = r0.get(o.setBuildNumber.ACTOR_KEY)), r9.length.getClass());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void setMax(java.lang.Object r9) {
        /*
            r8 = this;
            o.access$2502 r9 = (o.access$2502) r9
            if (r9 == 0) goto L_0x0145
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r9.length
            r1 = 0
            if (r0 == 0) goto L_0x002f
            java.lang.String r2 = "actor"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x002f
            com.google.gson.Gson r2 = new com.google.gson.Gson
            r2.<init>()
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r9.length
            java.lang.Class r3 = r3.getClass()
            java.lang.Object r0 = r2.fromJson((java.lang.String) r0, r3)
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 == 0) goto L_0x002f
            java.lang.String r2 = "profilePictureUrl"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            r2 = 2131231744(0x7f080400, float:1.8079578E38)
            java.lang.String r3 = "itemView"
            if (r0 == 0) goto L_0x004f
            android.view.View r4 = r8.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            int r5 = o.resetInternal.setMax.createAutoCompleteTextView
            android.view.View r4 = r4.findViewById(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L_0x004c
            o.setOverScrollMode.getMax(r4, r0, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x004d
        L_0x004c:
            r0 = r1
        L_0x004d:
            if (r0 != 0) goto L_0x0063
        L_0x004f:
            android.view.View r0 = r8.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            int r4 = o.resetInternal.setMax.createAutoCompleteTextView
            android.view.View r0 = r0.findViewById(r4)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x0063
            r0.setImageResource(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0063:
            android.content.Context r0 = r8.length
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            o.initContent r4 = r8.setMin
            o.AUMaskImage r0 = r9.setMin(r0, r4)
            android.view.View r4 = r8.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            int r5 = o.resetInternal.setMax.getCompoundPaddingRight
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x00ab
            java.util.HashMap<java.lang.String, java.lang.String> r5 = r0.getMin
            java.util.Map r5 = (java.util.Map) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x009c
            o.initContentView$setMin r5 = o.initContentView.getMin
            r5 = 2131296264(0x7f090008, float:1.821044E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            android.text.Spannable r0 = o.initContentView.setMin.getMax(r0, r5, r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x00a8
        L_0x009c:
            android.text.SpannableString r5 = new android.text.SpannableString
            java.lang.String r0 = r0.setMax
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.<init>(r0)
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
        L_0x00a8:
            r4.setText(r0)
        L_0x00ab:
            android.view.View r0 = r8.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            int r4 = o.resetInternal.setMax.getCompoundPaddingRight
            android.view.View r0 = r0.findViewById(r4)
            android.widget.TextView r0 = (android.widget.TextView) r0
            o.upDateTheme$setMin r4 = new o.upDateTheme$setMin
            r4.<init>(r8)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r0.setOnClickListener(r4)
            android.content.Context r0 = r8.length
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.Long r9 = r9.setMin
            if (r9 == 0) goto L_0x00d3
            long r4 = r9.longValue()
            goto L_0x00d5
        L_0x00d3:
            r4 = 0
        L_0x00d5:
            java.util.Date r9 = new java.util.Date
            r9.<init>()
            java.util.Date r2 = new java.util.Date
            r2.<init>(r4)
            long r6 = o.ConfirmPopup.AnonymousClass1.setMin(r9, r2)
            int r9 = (int) r6
            java.util.Date r2 = new java.util.Date
            r2.<init>(r4)
            java.lang.String r9 = o.access$2502.getMin(r9, r2, r0)
            if (r9 == 0) goto L_0x012d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r9 = ", "
            r0.append(r9)
            java.util.Date r9 = new java.util.Date
            r9.<init>(r4)
            java.util.Locale r1 = o.WheelView.OnWheelViewListener.getMax
            if (r1 != 0) goto L_0x0110
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "in"
            java.lang.String r4 = "ID"
            r1.<init>(r2, r4)
            o.WheelView.OnWheelViewListener.getMax = r1
        L_0x0110:
            java.util.Locale r1 = o.WheelView.OnWheelViewListener.getMax
            long r4 = r9.getTime()
            java.util.Date r9 = new java.util.Date
            r9.<init>(r4)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r4 = "HH:mm"
            r2.<init>(r4, r1)
            java.lang.String r9 = r2.format(r9)
            r0.append(r9)
            java.lang.String r1 = r0.toString()
        L_0x012d:
            if (r1 != 0) goto L_0x0131
            java.lang.String r1 = ""
        L_0x0131:
            android.view.View r9 = r8.itemView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r3)
            int r0 = o.resetInternal.setMax.getThumbTintList
            android.view.View r9 = r9.findViewById(r0)
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x0145
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r9.setText(r1)
        L_0x0145:
            android.view.View r9 = r8.itemView
            o.upDateTheme$length r0 = new o.upDateTheme$length
            r0.<init>(r8)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r9.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.upDateTheme.setMax(java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public upDateTheme(@NotNull ViewGroup viewGroup, int i, @NotNull initContent initcontent) {
        super(viewGroup.getContext(), R.layout.item_social_feed_list, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(initcontent, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.getMax = i;
        this.setMin = initcontent;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ upDateTheme setMin;

        length(upDateTheme updatetheme) {
            this.setMin = updatetheme;
        }

        public final void onClick(View view) {
            initContent max = this.setMin.setMin;
            this.setMin.getBindingAdapterPosition();
            max.getMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ upDateTheme getMax;

        setMin(upDateTheme updatetheme) {
            this.getMax = updatetheme;
        }

        public final void onClick(View view) {
            this.getMax.setMin.setMax(this.getMax.getBindingAdapterPosition());
        }
    }
}
