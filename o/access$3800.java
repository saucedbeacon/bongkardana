package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.Calendar;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J2\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\b2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\u0014H\u0002J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lid/dana/social/model/mapper/FeedModelMapper;", "", "context", "Landroid/content/Context;", "reactionCountModelMapper", "Lid/dana/social/model/mapper/ReactionCountModelMapper;", "(Landroid/content/Context;Lid/dana/social/model/mapper/ReactionCountModelMapper;)V", "dateNow", "Ljava/util/Date;", "checkIfFeedsIsPastYear", "", "date", "getContentDate", "", "diffDay", "", "dateTime", "", "getSectionText", "composeDifferentYear", "Lkotlin/Function2;", "map", "Lid/dana/social/model/FeedModel;", "oldItem", "Lid/dana/domain/social/model/ActivityResponse;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class access$3800 {
    private Date getMin;
    private final access$3900 setMax;
    private final Context setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "<anonymous parameter 1>", "Ljava/util/Date;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function2<String, Date, String> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(2);
        }

        @NotNull
        public final String invoke(@NotNull String str, @NotNull Date date) {
            Intrinsics.checkNotNullParameter(str, "it");
            Intrinsics.checkNotNullParameter(date, "<anonymous parameter 1>");
            return str;
        }
    }

    @Inject
    public access$3800(@NotNull Context context, @NotNull access$3900 access_3900) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(access_3900, "reactionCountModelMapper");
        this.setMin = context;
        this.setMax = access_3900;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final id.dana.social.model.FeedModel setMax(@org.jetbrains.annotations.NotNull java.util.Date r23, @org.jetbrains.annotations.NotNull o.RssiFilter r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            java.lang.String r2 = "dateNow"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "oldItem"
            r3 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            r0.getMin = r1
            java.lang.String r2 = r24.getId()
            java.lang.String r4 = ""
            if (r2 != 0) goto L_0x001c
            r6 = r4
            goto L_0x001d
        L_0x001c:
            r6 = r2
        L_0x001d:
            java.lang.String r8 = r24.getContent()
            long r9 = r24.getCreatedTime()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.util.Date r2 = new java.util.Date
            long r10 = r24.getCreatedTime()
            r2.<init>(r10)
            long r1 = o.ConfirmPopup.AnonymousClass1.setMin(r1, r2)
            int r2 = (int) r1
            long r10 = r24.getCreatedTime()
            java.util.Date r1 = new java.util.Date
            r1.<init>(r10)
            o.access$3800$setMin r5 = o.access$3800.setMin.INSTANCE
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            if (r2 == 0) goto L_0x006c
            r7 = 1
            if (r2 == r7) goto L_0x0062
            java.util.Locale r2 = java.util.Locale.getDefault()
            long r12 = r1.getTime()
            java.util.Date r7 = new java.util.Date
            r7.<init>(r12)
            java.text.SimpleDateFormat r12 = new java.text.SimpleDateFormat
            java.lang.String r13 = "dd MMMM"
            r12.<init>(r13, r2)
            java.lang.String r2 = r12.format(r7)
            goto L_0x0075
        L_0x0062:
            android.content.Context r2 = r0.setMin
            r7 = 2131887078(0x7f1203e6, float:1.9408753E38)
            java.lang.String r2 = r2.getString(r7)
            goto L_0x0075
        L_0x006c:
            android.content.Context r2 = r0.setMin
            r7 = 2131887077(0x7f1203e5, float:1.940875E38)
            java.lang.String r2 = r2.getString(r7)
        L_0x0075:
            boolean r7 = r0.getMax(r1)
            if (r7 == 0) goto L_0x0087
            java.lang.String r7 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            java.lang.Object r1 = r5.invoke(r2, r1)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
        L_0x0087:
            if (r2 != 0) goto L_0x008a
            r2 = r4
        L_0x008a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            java.util.Date r2 = new java.util.Date
            r2.<init>(r10)
            java.util.Locale r5 = o.WheelView.OnWheelViewListener.getMax
            if (r5 != 0) goto L_0x00ab
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r7 = "in"
            java.lang.String r10 = "ID"
            r5.<init>(r7, r10)
            o.WheelView.OnWheelViewListener.getMax = r5
        L_0x00ab:
            java.util.Locale r5 = o.WheelView.OnWheelViewListener.getMax
            long r10 = r2.getTime()
            java.util.Date r2 = new java.util.Date
            r2.<init>(r10)
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat
            java.lang.String r10 = "HH:mm"
            r7.<init>(r10, r5)
            java.lang.String r2 = r7.format(r2)
            r1.append(r2)
            java.lang.String r10 = r1.toString()
            java.lang.String r11 = r24.getIconUrl()
            boolean r12 = r24.getRead()
            java.util.HashMap r13 = r24.getExtendInfo()
            java.lang.String r14 = r24.getContentType()
            java.lang.String r15 = r24.getActivityId()
            boolean r16 = r24.getOwnActivity()
            int r17 = r24.getCommentCounts()
            java.util.List r1 = r24.getReactionCounts()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r7 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r5)
            r2.<init>(r7)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x00fb:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0115
            java.lang.Object r7 = r1.next()
            o.stopAndroidOBackgroundScan r7 = (o.stopAndroidOBackgroundScan) r7
            java.util.List r5 = r24.getOwnReactions()
            id.dana.social.model.ReactionCountModel r5 = o.access$3900.getMin(r7, r5)
            r2.add(r5)
            r5 = 10
            goto L_0x00fb
        L_0x0115:
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.List r18 = kotlin.collections.CollectionsKt.toMutableList(r2)
            java.util.List r1 = r24.getOwnReactions()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r5)
            r2.<init>(r5)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x0134:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0153
            java.lang.Object r5 = r1.next()
            o.getRangedRegionState r5 = (o.getRangedRegionState) r5
            id.dana.social.model.OwnReactionModel r7 = new id.dana.social.model.OwnReactionModel
            java.lang.String r0 = r5.getId()
            java.lang.String r5 = r5.getKind()
            r7.<init>(r0, r5)
            r2.add(r7)
            r0 = r22
            goto L_0x0134
        L_0x0153:
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.List r19 = kotlin.collections.CollectionsKt.toMutableList(r2)
            java.lang.String r0 = r24.getRedirectType()
            if (r0 != 0) goto L_0x0164
            r20 = r4
            goto L_0x0166
        L_0x0164:
            r20 = r0
        L_0x0166:
            java.lang.String r0 = r24.getRedirectValue()
            if (r0 != 0) goto L_0x016f
            r21 = r4
            goto L_0x0171
        L_0x016f:
            r21 = r0
        L_0x0171:
            id.dana.social.model.FeedModel r0 = new id.dana.social.model.FeedModel
            r5 = r0
            r7 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.access$3800.setMax(java.util.Date, o.RssiFilter):id.dana.social.model.FeedModel");
    }

    private final boolean getMax(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        int i = instance.get(1);
        Date date2 = this.getMin;
        if (date2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dateNow");
        }
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(date2);
        if (i < instance2.get(1)) {
            return true;
        }
        return false;
    }
}
