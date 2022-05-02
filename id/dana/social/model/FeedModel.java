package id.dana.social.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.richview.CurrencyTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import o.AUHorizontalListView;
import o.AUMaskImage;
import o.dispatchOnCancelled;
import o.initContent;
import o.onCancelLoad;
import o.onCanceled;
import o.setBuildNumber;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 m2\u00020\u0001:\u0001mBã\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012,\b\u0002\u0010\f\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\rj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u000bHÆ\u0003J\t\u0010K\u001a\u00020\u0013HÆ\u0003J\u000f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003J\u000f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u000bHÆ\u0003J-\u0010V\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\rj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u000eHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jì\u0001\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2,\b\u0002\u0010\f\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\rj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010YJ\t\u0010Z\u001a\u00020\u0013HÖ\u0001J\u0013\u0010[\u001a\u00020\u000b2\b\u0010\\\u001a\u0004\u0018\u00010]HÖ\u0003J\u0006\u0010^\u001a\u00020\u0003J\u0006\u0010_\u001a\u00020\u0003J\u0006\u0010`\u001a\u00020\u0003J\u0006\u0010a\u001a\u00020\u0003J\u0006\u0010b\u001a\u00020\u0003J\t\u0010c\u001a\u00020\u0013HÖ\u0001J\u0015\u0010d\u001a\u0004\u0018\u00010e2\u0006\u0010f\u001a\u00020\u0003¢\u0006\u0002\u0010gJ\t\u0010h\u001a\u00020\u0003HÖ\u0001J\u0019\u0010i\u001a\u00020e2\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020\u0013HÖ\u0001R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR>\u0010\f\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\rj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010;\"\u0004\b?\u0010=R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00107\"\u0004\bA\u00109R\u001a\u0010\u0019\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001d\"\u0004\bC\u0010\u001fR\u001a\u0010\u001a\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001d\"\u0004\bE\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001d\"\u0004\bG\u0010\u001f¨\u0006n"}, d2 = {"Lid/dana/social/model/FeedModel;", "Landroid/os/Parcelable;", "id", "", "title", "desc", "dateTimestamp", "", "dateCreated", "imageUrl", "read", "", "extendInfo", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "contentType", "activityId", "ownActivity", "commentCounts", "", "reactionCounts", "", "Lid/dana/social/model/ReactionCountModel;", "ownReactions", "Lid/dana/social/model/OwnReactionModel;", "redirectType", "redirectValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLjava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ZILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "setActivityId", "(Ljava/lang/String;)V", "getCommentCounts", "()I", "setCommentCounts", "(I)V", "getContentType", "setContentType", "getDateCreated", "setDateCreated", "getDateTimestamp", "()Ljava/lang/Long;", "setDateTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDesc", "setDesc", "getExtendInfo", "()Ljava/util/HashMap;", "setExtendInfo", "(Ljava/util/HashMap;)V", "getId", "getImageUrl", "setImageUrl", "getOwnActivity", "()Z", "setOwnActivity", "(Z)V", "getOwnReactions", "()Ljava/util/List;", "setOwnReactions", "(Ljava/util/List;)V", "getReactionCounts", "setReactionCounts", "getRead", "setRead", "getRedirectType", "setRedirectType", "getRedirectValue", "setRedirectValue", "getTitle", "setTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLjava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ZILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lid/dana/social/model/FeedModel;", "describeContents", "equals", "other", "", "getDisplayedUsername", "getFeedDisplayName", "getHeaderName", "getNickname", "getUsername", "hashCode", "setUsername", "", "username", "(Ljava/lang/String;)Lkotlin/Unit;", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class FeedModel implements Parcelable {
    public static final Parcelable.Creator<FeedModel> CREATOR = new setMin();
    @NotNull
    public static final setMax Grayscale$Algorithm = new setMax((byte) 0);
    @NotNull
    public List<ReactionCountModel> FastBitmap$CoordinateSystem;
    @Nullable
    public HashMap<String, String> IsOverlapping;
    @Nullable
    public String equals;
    @Nullable
    public String getMax;
    @Nullable
    public String getMin;
    @NotNull
    public String hashCode;
    public boolean isInside;
    @Nullable
    public String length;
    @Nullable
    public Long setMax;
    @NotNull
    public final String setMin;
    public int toDoubleRange;
    @Nullable
    public String toFloatRange;
    @Nullable
    public String toIntRange;
    @NotNull
    public List<OwnReactionModel> toString;
    private boolean valueOf;
    @NotNull
    public String values;

    public FeedModel() {
        this((String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, false, (HashMap) null, (String) null, (String) null, false, 0, (List) null, (List) null, (String) null, (String) null, 65535);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedModel)) {
            return false;
        }
        FeedModel feedModel = (FeedModel) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) feedModel.setMin) && Intrinsics.areEqual((Object) this.getMax, (Object) feedModel.getMax) && Intrinsics.areEqual((Object) this.length, (Object) feedModel.length) && Intrinsics.areEqual((Object) this.setMax, (Object) feedModel.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) feedModel.getMin) && Intrinsics.areEqual((Object) this.equals, (Object) feedModel.equals) && this.isInside == feedModel.isInside && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) feedModel.IsOverlapping) && Intrinsics.areEqual((Object) this.toIntRange, (Object) feedModel.toIntRange) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) feedModel.toFloatRange) && this.valueOf == feedModel.valueOf && this.toDoubleRange == feedModel.toDoubleRange && Intrinsics.areEqual((Object) this.FastBitmap$CoordinateSystem, (Object) feedModel.FastBitmap$CoordinateSystem) && Intrinsics.areEqual((Object) this.toString, (Object) feedModel.toString) && Intrinsics.areEqual((Object) this.values, (Object) feedModel.values) && Intrinsics.areEqual((Object) this.hashCode, (Object) feedModel.hashCode);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedModel(id=");
        sb.append(this.setMin);
        sb.append(", title=");
        sb.append(this.getMax);
        sb.append(", desc=");
        sb.append(this.length);
        sb.append(", dateTimestamp=");
        sb.append(this.setMax);
        sb.append(", dateCreated=");
        sb.append(this.getMin);
        sb.append(", imageUrl=");
        sb.append(this.equals);
        sb.append(", read=");
        sb.append(this.isInside);
        sb.append(", extendInfo=");
        sb.append(this.IsOverlapping);
        sb.append(", contentType=");
        sb.append(this.toIntRange);
        sb.append(", activityId=");
        sb.append(this.toFloatRange);
        sb.append(", ownActivity=");
        sb.append(this.valueOf);
        sb.append(", commentCounts=");
        sb.append(this.toDoubleRange);
        sb.append(", reactionCounts=");
        sb.append(this.FastBitmap$CoordinateSystem);
        sb.append(", ownReactions=");
        sb.append(this.toString);
        sb.append(", redirectType=");
        sb.append(this.values);
        sb.append(", redirectValue=");
        sb.append(this.hashCode);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMax);
        parcel.writeString(this.length);
        Long l = this.setMax;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.getMin);
        parcel.writeString(this.equals);
        parcel.writeInt(this.isInside ? 1 : 0);
        HashMap<String, String> hashMap = this.IsOverlapping;
        if (hashMap != null) {
            parcel.writeInt(1);
            parcel.writeInt(hashMap.size());
            for (Map.Entry<String, String> next : hashMap.entrySet()) {
                parcel.writeString(next.getKey());
                parcel.writeString(next.getValue());
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.toFloatRange);
        parcel.writeInt(this.valueOf ? 1 : 0);
        parcel.writeInt(this.toDoubleRange);
        List<ReactionCountModel> list = this.FastBitmap$CoordinateSystem;
        parcel.writeInt(list.size());
        for (ReactionCountModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        List<OwnReactionModel> list2 = this.toString;
        parcel.writeInt(list2.size());
        for (OwnReactionModel writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, 0);
        }
        parcel.writeString(this.values);
        parcel.writeString(this.hashCode);
    }

    public FeedModel(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Long l, @Nullable String str4, @Nullable String str5, boolean z, @Nullable HashMap<String, String> hashMap, @Nullable String str6, @Nullable String str7, boolean z2, int i, @NotNull List<ReactionCountModel> list, @NotNull List<OwnReactionModel> list2, @NotNull String str8, @NotNull String str9) {
        List<ReactionCountModel> list3 = list;
        List<OwnReactionModel> list4 = list2;
        String str10 = str8;
        String str11 = str9;
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(list3, "reactionCounts");
        Intrinsics.checkNotNullParameter(list4, "ownReactions");
        Intrinsics.checkNotNullParameter(str10, "redirectType");
        Intrinsics.checkNotNullParameter(str11, "redirectValue");
        this.setMin = str;
        this.getMax = str2;
        this.length = str3;
        this.setMax = l;
        this.getMin = str4;
        this.equals = str5;
        this.isInside = z;
        this.IsOverlapping = hashMap;
        this.toIntRange = str6;
        this.toFloatRange = str7;
        this.valueOf = z2;
        this.toDoubleRange = i;
        this.FastBitmap$CoordinateSystem = list3;
        this.toString = list4;
        this.values = str10;
        this.hashCode = str11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FeedModel(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.Long r22, java.lang.String r23, java.lang.String r24, boolean r25, java.util.HashMap r26, java.lang.String r27, java.lang.String r28, boolean r29, int r30, java.util.List r31, java.util.List r32, java.lang.String r33, java.lang.String r34, int r35) {
        /*
            r18 = this;
            r0 = r35
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r19
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r20
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r21
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0027
            r5 = 0
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto L_0x0029
        L_0x0027:
            r5 = r22
        L_0x0029:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002f
            r6 = r2
            goto L_0x0031
        L_0x002f:
            r6 = r23
        L_0x0031:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0037
            r7 = r2
            goto L_0x0039
        L_0x0037:
            r7 = r24
        L_0x0039:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003f
            r8 = 1
            goto L_0x0041
        L_0x003f:
            r8 = r25
        L_0x0041:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x004b
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            goto L_0x004d
        L_0x004b:
            r9 = r26
        L_0x004d:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0053
            r10 = r2
            goto L_0x0055
        L_0x0053:
            r10 = r27
        L_0x0055:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x005b
            r11 = r2
            goto L_0x005d
        L_0x005b:
            r11 = r28
        L_0x005d:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            r13 = 0
            if (r12 == 0) goto L_0x0064
            r12 = 0
            goto L_0x0066
        L_0x0064:
            r12 = r29
        L_0x0066:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r13 = r30
        L_0x006d:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0079
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.List r14 = (java.util.List) r14
            goto L_0x007b
        L_0x0079:
            r14 = r31
        L_0x007b:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0087
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.List r15 = (java.util.List) r15
            goto L_0x0089
        L_0x0087:
            r15 = r32
        L_0x0089:
            r16 = r2
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0092
            r2 = r16
            goto L_0x0094
        L_0x0092:
            r2 = r33
        L_0x0094:
            r17 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r17
            if (r0 == 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            r16 = r34
        L_0x009e:
            r19 = r18
            r20 = r1
            r21 = r3
            r22 = r4
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r2
            r35 = r16
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.social.model.FeedModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, boolean, java.util.HashMap, java.lang.String, java.lang.String, boolean, int, java.util.List, java.util.List, java.lang.String, java.lang.String, int):void");
    }

    public final boolean length() {
        return this.isInside;
    }

    public final boolean getMax() {
        return this.valueOf;
    }

    @NotNull
    public final String setMin() {
        String max = setMax();
        String str = null;
        if (!(max.length() > 0)) {
            max = null;
        }
        if (max != null) {
            str = AUScreenAdaptTool.PREFIX_ID.concat(String.valueOf(max));
        }
        return str == null ? "" : str;
    }

    @NotNull
    public final String setMax() {
        String username;
        HashMap<String, String> hashMap = this.IsOverlapping;
        String str = null;
        if (!(hashMap == null || (username = setBuildNumber.getUsername(hashMap)) == null)) {
            if (!(username.length() > 0)) {
                username = null;
            }
            if (username != null) {
                return username;
            }
        }
        HashMap<String, String> hashMap2 = this.IsOverlapping;
        if (hashMap2 != null) {
            str = hashMap2.get(setBuildNumber.USERNAME_KEY);
        }
        return str == null ? "" : str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ4\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0014\u0010\u0015\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u0010\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u0004J\u0006\u0010\u001b\u001a\u00020\nJ\u0006\u0010\u001c\u001a\u00020\nJ\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020'R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lid/dana/social/model/FeedModel$Companion;", "", "()V", "FETCHING_PROFILE_NAME", "", "HIDE", "KYC_LEVEL_KEY", "SHARE", "SHARE_PRIVACY_KEY", "createDefaultFeedMeHeader", "Lid/dana/social/model/FeedViewHolderModel;", "createFeedHeaderMe", "Lid/dana/social/model/FeedModel;", "userId", "nickname", "imageUrl", "kycLevel", "sharePrivacy", "", "createFeedSectionDate", "sectionText", "createFriendsFeedsHeader", "topFriendModels", "", "Lid/dana/social/model/FriendModel;", "createFromDeeplinkBundle", "id", "createLoadMore", "createShimmer", "createTopProfileHeader", "profileData", "Lid/dana/social/model/RelationshipItemModel;", "getSharePrivacy", "toFeedRegexData", "Lid/dana/social/utils/FeedRegexData;", "context", "Landroid/content/Context;", "data", "socialFeedClickListener", "Lid/dana/social/adapter/SocialFeedClickListener;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lid/dana/social/utils/Content;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final /* synthetic */ class getMin extends FunctionReferenceImpl implements Function1<AUHorizontalListView.SavedState.AnonymousClass1, Unit> {
            getMin(initContent initcontent) {
                super(1, initcontent, initContent.class, "onSocialFeedSpanClicked", "onSocialFeedSpanClicked(Lid/dana/social/utils/Content;)V", 0);
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AUHorizontalListView.SavedState.AnonymousClass1) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull AUHorizontalListView.SavedState.AnonymousClass1 r2) {
                Intrinsics.checkNotNullParameter(r2, "p1");
                ((initContent) this.receiver).setMax(r2);
            }
        }

        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }

        @NotNull
        public static FeedModel getMax(@Nullable String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(839169058, oncanceled);
                onCancelLoad.getMin(839169058, oncanceled);
            }
            return new FeedModel((String) null, str, (String) null, (Long) null, (String) null, (String) null, false, (HashMap) null, (String) null, (String) null, false, 0, (List) null, (List) null, (String) null, (String) null, 65533);
        }

        @NotNull
        public static AUMaskImage setMin(@NotNull Context context, @NotNull FeedModel feedModel, @NotNull initContent initcontent) {
            String str;
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(feedModel, "data");
            Intrinsics.checkNotNullParameter(initcontent, "socialFeedClickListener");
            String str2 = feedModel.setMin;
            String str3 = feedModel.length;
            String str4 = str3 == null ? "" : str3;
            HashMap<String, String> hashMap = feedModel.IsOverlapping;
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            HashMap<String, String> hashMap2 = hashMap;
            Function1 getmin = new getMin(initcontent);
            String str5 = feedModel.toIntRange;
            if (str5 == null) {
                str = "";
            } else {
                str = str5;
            }
            return new AUMaskImage(str2, str4, hashMap2, getmin, context, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class setMin implements Parcelable.Creator<FeedModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FeedModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            HashMap hashMap = null;
            Long valueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                hashMap = new HashMap(readInt);
                while (readInt != 0) {
                    hashMap.put(parcel.readString(), parcel.readString());
                    readInt--;
                }
            }
            HashMap hashMap2 = hashMap;
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            while (readInt3 != 0) {
                arrayList.add(ReactionCountModel.CREATOR.createFromParcel(parcel2));
                readInt3--;
            }
            int readInt4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt4);
            while (readInt4 != 0) {
                arrayList2.add(OwnReactionModel.CREATOR.createFromParcel(parcel2));
                readInt4--;
            }
            return new FeedModel(readString, readString2, readString3, valueOf, readString4, readString5, z, hashMap2, readString6, readString7, z2, readInt2, arrayList, arrayList2, parcel.readString(), parcel.readString());
        }
    }

    public final int hashCode() {
        String str = this.setMin;
        int i = 0;
        int hashCode2 = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMax;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.length;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Long l = this.setMax;
        int hashCode5 = (hashCode4 + (l != null ? l.hashCode() : 0)) * 31;
        String str4 = this.getMin;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.equals;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.isInside;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode7 + (z ? 1 : 0)) * 31;
        HashMap<String, String> hashMap = this.IsOverlapping;
        int hashCode8 = (i2 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        String str6 = this.toIntRange;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.toFloatRange;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        boolean z3 = this.valueOf;
        if (!z3) {
            z2 = z3;
        }
        int hashCode11 = (((hashCode10 + (z2 ? 1 : 0)) * 31) + Integer.valueOf(this.toDoubleRange).hashCode()) * 31;
        List<ReactionCountModel> list = this.FastBitmap$CoordinateSystem;
        int hashCode12 = (hashCode11 + (list != null ? list.hashCode() : 0)) * 31;
        List<OwnReactionModel> list2 = this.toString;
        int hashCode13 = (hashCode12 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str8 = this.values;
        int hashCode14 = (hashCode13 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.hashCode;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode14 + i;
    }
}
