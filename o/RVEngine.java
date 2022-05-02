package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jt\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\bHÖ\u0001J\u0006\u00108\u001a\u000209J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013¨\u0006;"}, d2 = {"Lid/dana/data/nearbyme/model/MerchantReviewEntity;", "", "userId", "", "userName", "avatar", "review", "rating", "", "modifyDate", "", "createdDate", "images", "", "Lid/dana/data/nearbyme/model/MerchantImageEntity;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)V", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "getCreatedDate", "()Ljava/lang/Long;", "setCreatedDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getImages", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "getModifyDate", "setModifyDate", "getRating", "()Ljava/lang/Integer;", "setRating", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getReview", "setReview", "getUserId", "setUserId", "getUserName", "setUserName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)Lid/dana/data/nearbyme/model/MerchantReviewEntity;", "equals", "", "other", "hashCode", "toMerchantReview", "Lid/dana/domain/nearbyme/model/MerchantReview;", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RVEngine {
    @Nullable
    private String avatar;
    @Nullable
    private Long createdDate;
    @Nullable
    private List<sendPushWorkMessage> images;
    @Nullable
    private Long modifyDate;
    @Nullable
    private Integer rating;
    @Nullable
    private String review;
    @Nullable
    private String userId;
    @Nullable
    private String userName;

    public RVEngine() {
        this((String) null, (String) null, (String) null, (String) null, (Integer) null, (Long) null, (Long) null, (List) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RVEngine copy$default(RVEngine rVEngine, String str, String str2, String str3, String str4, Integer num, Long l, Long l2, List list, int i, Object obj) {
        RVEngine rVEngine2 = rVEngine;
        int i2 = i;
        return rVEngine.copy((i2 & 1) != 0 ? rVEngine2.userId : str, (i2 & 2) != 0 ? rVEngine2.userName : str2, (i2 & 4) != 0 ? rVEngine2.avatar : str3, (i2 & 8) != 0 ? rVEngine2.review : str4, (i2 & 16) != 0 ? rVEngine2.rating : num, (i2 & 32) != 0 ? rVEngine2.modifyDate : l, (i2 & 64) != 0 ? rVEngine2.createdDate : l2, (i2 & 128) != 0 ? rVEngine2.images : list);
    }

    @Nullable
    public final String component1() {
        return this.userId;
    }

    @Nullable
    public final String component2() {
        return this.userName;
    }

    @Nullable
    public final String component3() {
        return this.avatar;
    }

    @Nullable
    public final String component4() {
        return this.review;
    }

    @Nullable
    public final Integer component5() {
        return this.rating;
    }

    @Nullable
    public final Long component6() {
        return this.modifyDate;
    }

    @Nullable
    public final Long component7() {
        return this.createdDate;
    }

    @Nullable
    public final List<sendPushWorkMessage> component8() {
        return this.images;
    }

    @NotNull
    public final RVEngine copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable Long l, @Nullable Long l2, @Nullable List<sendPushWorkMessage> list) {
        return new RVEngine(str, str2, str3, str4, num, l, l2, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RVEngine)) {
            return false;
        }
        RVEngine rVEngine = (RVEngine) obj;
        return Intrinsics.areEqual((Object) this.userId, (Object) rVEngine.userId) && Intrinsics.areEqual((Object) this.userName, (Object) rVEngine.userName) && Intrinsics.areEqual((Object) this.avatar, (Object) rVEngine.avatar) && Intrinsics.areEqual((Object) this.review, (Object) rVEngine.review) && Intrinsics.areEqual((Object) this.rating, (Object) rVEngine.rating) && Intrinsics.areEqual((Object) this.modifyDate, (Object) rVEngine.modifyDate) && Intrinsics.areEqual((Object) this.createdDate, (Object) rVEngine.createdDate) && Intrinsics.areEqual((Object) this.images, (Object) rVEngine.images);
    }

    public final int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.userName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.avatar;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.review;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.rating;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Long l = this.modifyDate;
        int hashCode6 = (hashCode5 + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.createdDate;
        int hashCode7 = (hashCode6 + (l2 != null ? l2.hashCode() : 0)) * 31;
        List<sendPushWorkMessage> list = this.images;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode7 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantReviewEntity(userId=");
        sb.append(this.userId);
        sb.append(", userName=");
        sb.append(this.userName);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", review=");
        sb.append(this.review);
        sb.append(", rating=");
        sb.append(this.rating);
        sb.append(", modifyDate=");
        sb.append(this.modifyDate);
        sb.append(", createdDate=");
        sb.append(this.createdDate);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(")");
        return sb.toString();
    }

    public RVEngine(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable Long l, @Nullable Long l2, @Nullable List<sendPushWorkMessage> list) {
        this.userId = str;
        this.userName = str2;
        this.avatar = str3;
        this.review = str4;
        this.rating = num;
        this.modifyDate = l;
        this.createdDate = l2;
        this.images = list;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    public final void setUserName(@Nullable String str) {
        this.userName = str;
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    public final void setAvatar(@Nullable String str) {
        this.avatar = str;
    }

    @Nullable
    public final String getReview() {
        return this.review;
    }

    public final void setReview(@Nullable String str) {
        this.review = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RVEngine(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.Integer r15, java.lang.Long r16, java.lang.Long r17, java.util.List r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r11
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0012
        L_0x0011:
            r3 = r12
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x0019
        L_0x0018:
            r4 = r13
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r2 = r14
        L_0x001f:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0029
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x002a
        L_0x0029:
            r5 = r15
        L_0x002a:
            r6 = r0 & 32
            r7 = 0
            if (r6 == 0) goto L_0x0035
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            goto L_0x0037
        L_0x0035:
            r6 = r16
        L_0x0037:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0040
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            goto L_0x0042
        L_0x0040:
            r7 = r17
        L_0x0042:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x004b
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x004d
        L_0x004b:
            r0 = r18
        L_0x004d:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r2
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RVEngine.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Long, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final Integer getRating() {
        return this.rating;
    }

    public final void setRating(@Nullable Integer num) {
        this.rating = num;
    }

    @Nullable
    public final Long getModifyDate() {
        return this.modifyDate;
    }

    public final void setModifyDate(@Nullable Long l) {
        this.modifyDate = l;
    }

    @Nullable
    public final Long getCreatedDate() {
        return this.createdDate;
    }

    public final void setCreatedDate(@Nullable Long l) {
        this.createdDate = l;
    }

    @Nullable
    public final List<sendPushWorkMessage> getImages() {
        return this.images;
    }

    public final void setImages(@Nullable List<sendPushWorkMessage> list) {
        this.images = list;
    }

    @NotNull
    public final FileCache toMerchantReview() {
        String str = this.userId;
        String str2 = str == null ? "" : str;
        String str3 = this.userName;
        String str4 = str3 == null ? "" : str3;
        String str5 = this.avatar;
        String str6 = str5 == null ? "" : str5;
        String str7 = this.review;
        String str8 = str7 == null ? "" : str7;
        Integer num = this.rating;
        int intValue = num != null ? num.intValue() : 0;
        Long l = this.modifyDate;
        long longValue = l != null ? l.longValue() : 0;
        Long l2 = this.createdDate;
        long longValue2 = l2 != null ? l2.longValue() : 0;
        List<sendPushWorkMessage> list = this.images;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        Iterable<sendPushWorkMessage> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (sendPushWorkMessage merchantImage : iterable) {
            arrayList.add(merchantImage.toMerchantImage());
        }
        return new FileCache(str2, str4, str6, str8, intValue, longValue, longValue2, (List) arrayList);
    }
}
