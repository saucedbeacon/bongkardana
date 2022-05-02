package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J_\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\bHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006*"}, d2 = {"Lid/dana/domain/nearbyme/model/MerchantReview;", "", "userId", "", "userName", "avatar", "review", "rating", "", "modifyDate", "", "createdDate", "images", "", "Lid/dana/domain/nearbyme/model/MerchantImage;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJLjava/util/List;)V", "getAvatar", "()Ljava/lang/String;", "getCreatedDate", "()J", "getImages", "()Ljava/util/List;", "getModifyDate", "getRating", "()I", "getReview", "getUserId", "getUserName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class FileCache {
    @NotNull
    private final String avatar;
    private final long createdDate;
    @NotNull
    private final List<getUtdid> images;
    private final long modifyDate;
    private final int rating;
    @NotNull
    private final String review;
    @NotNull
    private final String userId;
    @NotNull
    private final String userName;

    public static /* synthetic */ FileCache copy$default(FileCache fileCache, String str, String str2, String str3, String str4, int i, long j, long j2, List list, int i2, Object obj) {
        FileCache fileCache2 = fileCache;
        int i3 = i2;
        return fileCache.copy((i3 & 1) != 0 ? fileCache2.userId : str, (i3 & 2) != 0 ? fileCache2.userName : str2, (i3 & 4) != 0 ? fileCache2.avatar : str3, (i3 & 8) != 0 ? fileCache2.review : str4, (i3 & 16) != 0 ? fileCache2.rating : i, (i3 & 32) != 0 ? fileCache2.modifyDate : j, (i3 & 64) != 0 ? fileCache2.createdDate : j2, (i3 & 128) != 0 ? fileCache2.images : list);
    }

    @NotNull
    public final String component1() {
        return this.userId;
    }

    @NotNull
    public final String component2() {
        return this.userName;
    }

    @NotNull
    public final String component3() {
        return this.avatar;
    }

    @NotNull
    public final String component4() {
        return this.review;
    }

    public final int component5() {
        return this.rating;
    }

    public final long component6() {
        return this.modifyDate;
    }

    public final long component7() {
        return this.createdDate;
    }

    @NotNull
    public final List<getUtdid> component8() {
        return this.images;
    }

    @NotNull
    public final FileCache copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, long j, long j2, @NotNull List<getUtdid> list) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, "userName");
        Intrinsics.checkNotNullParameter(str3, "avatar");
        String str5 = str4;
        Intrinsics.checkNotNullParameter(str5, "review");
        List<getUtdid> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "images");
        return new FileCache(str, str2, str3, str5, i, j, j2, list2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileCache)) {
            return false;
        }
        FileCache fileCache = (FileCache) obj;
        return Intrinsics.areEqual((Object) this.userId, (Object) fileCache.userId) && Intrinsics.areEqual((Object) this.userName, (Object) fileCache.userName) && Intrinsics.areEqual((Object) this.avatar, (Object) fileCache.avatar) && Intrinsics.areEqual((Object) this.review, (Object) fileCache.review) && this.rating == fileCache.rating && this.modifyDate == fileCache.modifyDate && this.createdDate == fileCache.createdDate && Intrinsics.areEqual((Object) this.images, (Object) fileCache.images);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantReview(userId=");
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t¢\u0006\u0002\u0010\u0012J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010:\u001a\u00020\rHÆ\u0003J\t\u0010;\u001a\u00020\rHÆ\u0003J\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\tHÆ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0016¨\u0006C"}, d2 = {"Lid/dana/domain/nearbyme/model/PromoInfo;", "", "activityId", "", "prizeType", "promoDescription", "promoValue", "promoType", "paymentMethods", "", "minTransactionAmount", "Lid/dana/domain/user/CurrencyAmount;", "endDate", "", "beginDate", "maxAmount", "limitRule", "Lid/dana/domain/nearbyme/model/PromoLimitInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lid/dana/domain/user/CurrencyAmount;JJLid/dana/domain/user/CurrencyAmount;Ljava/util/List;)V", "getActivityId", "()Ljava/lang/String;", "setActivityId", "(Ljava/lang/String;)V", "getBeginDate", "()J", "setBeginDate", "(J)V", "getEndDate", "setEndDate", "getLimitRule", "()Ljava/util/List;", "setLimitRule", "(Ljava/util/List;)V", "getMaxAmount", "()Lid/dana/domain/user/CurrencyAmount;", "setMaxAmount", "(Lid/dana/domain/user/CurrencyAmount;)V", "getMinTransactionAmount", "setMinTransactionAmount", "getPaymentMethods", "setPaymentMethods", "getPrizeType", "setPrizeType", "getPromoDescription", "setPromoDescription", "getPromoType", "setPromoType", "getPromoValue", "setPromoValue", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.FileCache$1  reason: invalid class name */
    public final class AnonymousClass1 {
        @Nullable
        private String activityId;
        private long beginDate;
        private long endDate;
        @Nullable
        private List<GriverBundleUtils> limitRule;
        @Nullable
        private stopBleScan maxAmount;
        @Nullable
        private stopBleScan minTransactionAmount;
        @Nullable
        private List<String> paymentMethods;
        @Nullable
        private String prizeType;
        @Nullable
        private String promoDescription;
        @Nullable
        private String promoType;
        @Nullable
        private String promoValue;

        public AnonymousClass1() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (stopBleScan) null, 0, 0, (stopBleScan) null, (List) null, 2047, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ AnonymousClass1 copy$default(AnonymousClass1 r14, String str, String str2, String str3, String str4, String str5, List list, stopBleScan stopblescan, long j, long j2, stopBleScan stopblescan2, List list2, int i, Object obj) {
            AnonymousClass1 r0 = r14;
            int i2 = i;
            return r14.copy((i2 & 1) != 0 ? r0.activityId : str, (i2 & 2) != 0 ? r0.prizeType : str2, (i2 & 4) != 0 ? r0.promoDescription : str3, (i2 & 8) != 0 ? r0.promoValue : str4, (i2 & 16) != 0 ? r0.promoType : str5, (i2 & 32) != 0 ? r0.paymentMethods : list, (i2 & 64) != 0 ? r0.minTransactionAmount : stopblescan, (i2 & 128) != 0 ? r0.endDate : j, (i2 & 256) != 0 ? r0.beginDate : j2, (i2 & 512) != 0 ? r0.maxAmount : stopblescan2, (i2 & 1024) != 0 ? r0.limitRule : list2);
        }

        @Nullable
        public final String component1() {
            return this.activityId;
        }

        @Nullable
        public final stopBleScan component10() {
            return this.maxAmount;
        }

        @Nullable
        public final List<GriverBundleUtils> component11() {
            return this.limitRule;
        }

        @Nullable
        public final String component2() {
            return this.prizeType;
        }

        @Nullable
        public final String component3() {
            return this.promoDescription;
        }

        @Nullable
        public final String component4() {
            return this.promoValue;
        }

        @Nullable
        public final String component5() {
            return this.promoType;
        }

        @Nullable
        public final List<String> component6() {
            return this.paymentMethods;
        }

        @Nullable
        public final stopBleScan component7() {
            return this.minTransactionAmount;
        }

        public final long component8() {
            return this.endDate;
        }

        public final long component9() {
            return this.beginDate;
        }

        @NotNull
        public final AnonymousClass1 copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable List<String> list, @Nullable stopBleScan stopblescan, long j, long j2, @Nullable stopBleScan stopblescan2, @Nullable List<GriverBundleUtils> list2) {
            return new AnonymousClass1(str, str2, str3, str4, str5, list, stopblescan, j, j2, stopblescan2, list2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass1)) {
                return false;
            }
            AnonymousClass1 r6 = (AnonymousClass1) obj;
            return Intrinsics.areEqual((Object) this.activityId, (Object) r6.activityId) && Intrinsics.areEqual((Object) this.prizeType, (Object) r6.prizeType) && Intrinsics.areEqual((Object) this.promoDescription, (Object) r6.promoDescription) && Intrinsics.areEqual((Object) this.promoValue, (Object) r6.promoValue) && Intrinsics.areEqual((Object) this.promoType, (Object) r6.promoType) && Intrinsics.areEqual((Object) this.paymentMethods, (Object) r6.paymentMethods) && Intrinsics.areEqual((Object) this.minTransactionAmount, (Object) r6.minTransactionAmount) && this.endDate == r6.endDate && this.beginDate == r6.beginDate && Intrinsics.areEqual((Object) this.maxAmount, (Object) r6.maxAmount) && Intrinsics.areEqual((Object) this.limitRule, (Object) r6.limitRule);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("PromoInfo(activityId=");
            sb.append(this.activityId);
            sb.append(", prizeType=");
            sb.append(this.prizeType);
            sb.append(", promoDescription=");
            sb.append(this.promoDescription);
            sb.append(", promoValue=");
            sb.append(this.promoValue);
            sb.append(", promoType=");
            sb.append(this.promoType);
            sb.append(", paymentMethods=");
            sb.append(this.paymentMethods);
            sb.append(", minTransactionAmount=");
            sb.append(this.minTransactionAmount);
            sb.append(", endDate=");
            sb.append(this.endDate);
            sb.append(", beginDate=");
            sb.append(this.beginDate);
            sb.append(", maxAmount=");
            sb.append(this.maxAmount);
            sb.append(", limitRule=");
            sb.append(this.limitRule);
            sb.append(")");
            return sb.toString();
        }

        public AnonymousClass1(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable List<String> list, @Nullable stopBleScan stopblescan, long j, long j2, @Nullable stopBleScan stopblescan2, @Nullable List<GriverBundleUtils> list2) {
            this.activityId = str;
            this.prizeType = str2;
            this.promoDescription = str3;
            this.promoValue = str4;
            this.promoType = str5;
            this.paymentMethods = list;
            this.minTransactionAmount = stopblescan;
            this.endDate = j;
            this.beginDate = j2;
            this.maxAmount = stopblescan2;
            this.limitRule = list2;
        }

        @Nullable
        public final String getActivityId() {
            return this.activityId;
        }

        public final void setActivityId(@Nullable String str) {
            this.activityId = str;
        }

        @Nullable
        public final String getPrizeType() {
            return this.prizeType;
        }

        public final void setPrizeType(@Nullable String str) {
            this.prizeType = str;
        }

        @Nullable
        public final String getPromoDescription() {
            return this.promoDescription;
        }

        public final void setPromoDescription(@Nullable String str) {
            this.promoDescription = str;
        }

        @Nullable
        public final String getPromoValue() {
            return this.promoValue;
        }

        public final void setPromoValue(@Nullable String str) {
            this.promoValue = str;
        }

        @Nullable
        public final String getPromoType() {
            return this.promoType;
        }

        public final void setPromoType(@Nullable String str) {
            this.promoType = str;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ AnonymousClass1(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.List r19, o.stopBleScan r20, long r21, long r23, o.stopBleScan r25, java.util.List r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
            /*
                r13 = this;
                r0 = r27
                r1 = r0 & 1
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x000a
                r1 = r2
                goto L_0x000b
            L_0x000a:
                r1 = r14
            L_0x000b:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0011
                r3 = r2
                goto L_0x0012
            L_0x0011:
                r3 = r15
            L_0x0012:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x0018
                r4 = r2
                goto L_0x001a
            L_0x0018:
                r4 = r16
            L_0x001a:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x0020
                r5 = r2
                goto L_0x0022
            L_0x0020:
                r5 = r17
            L_0x0022:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r2 = r18
            L_0x0029:
                r6 = r0 & 32
                if (r6 == 0) goto L_0x0032
                java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
                goto L_0x0034
            L_0x0032:
                r6 = r19
            L_0x0034:
                r7 = r0 & 64
                if (r7 == 0) goto L_0x003e
                o.stopBleScan r7 = new o.stopBleScan
                r7.<init>()
                goto L_0x0040
            L_0x003e:
                r7 = r20
            L_0x0040:
                r8 = r0 & 128(0x80, float:1.794E-43)
                r9 = 0
                if (r8 == 0) goto L_0x0048
                r11 = r9
                goto L_0x004a
            L_0x0048:
                r11 = r21
            L_0x004a:
                r8 = r0 & 256(0x100, float:3.59E-43)
                if (r8 == 0) goto L_0x004f
                goto L_0x0051
            L_0x004f:
                r9 = r23
            L_0x0051:
                r8 = r0 & 512(0x200, float:7.175E-43)
                if (r8 == 0) goto L_0x005b
                o.stopBleScan r8 = new o.stopBleScan
                r8.<init>()
                goto L_0x005d
            L_0x005b:
                r8 = r25
            L_0x005d:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x0066
                java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
                goto L_0x0068
            L_0x0066:
                r0 = r26
            L_0x0068:
                r14 = r13
                r15 = r1
                r16 = r3
                r17 = r4
                r18 = r5
                r19 = r2
                r20 = r6
                r21 = r7
                r22 = r11
                r24 = r9
                r26 = r8
                r27 = r0
                r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r24, r26, r27)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.FileCache.AnonymousClass1.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, o.stopBleScan, long, long, o.stopBleScan, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Nullable
        public final List<String> getPaymentMethods() {
            return this.paymentMethods;
        }

        public final void setPaymentMethods(@Nullable List<String> list) {
            this.paymentMethods = list;
        }

        @Nullable
        public final stopBleScan getMinTransactionAmount() {
            return this.minTransactionAmount;
        }

        public final void setMinTransactionAmount(@Nullable stopBleScan stopblescan) {
            this.minTransactionAmount = stopblescan;
        }

        public final long getEndDate() {
            return this.endDate;
        }

        public final void setEndDate(long j) {
            this.endDate = j;
        }

        public final long getBeginDate() {
            return this.beginDate;
        }

        public final void setBeginDate(long j) {
            this.beginDate = j;
        }

        @Nullable
        public final stopBleScan getMaxAmount() {
            return this.maxAmount;
        }

        public final void setMaxAmount(@Nullable stopBleScan stopblescan) {
            this.maxAmount = stopblescan;
        }

        @Nullable
        public final List<GriverBundleUtils> getLimitRule() {
            return this.limitRule;
        }

        public final void setLimitRule(@Nullable List<GriverBundleUtils> list) {
            this.limitRule = list;
        }

        public final int hashCode() {
            String str = this.activityId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.prizeType;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.promoDescription;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.promoValue;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.promoType;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            List<String> list = this.paymentMethods;
            int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
            stopBleScan stopblescan = this.minTransactionAmount;
            int hashCode7 = (((((hashCode6 + (stopblescan != null ? stopblescan.hashCode() : 0)) * 31) + Long.valueOf(this.endDate).hashCode()) * 31) + Long.valueOf(this.beginDate).hashCode()) * 31;
            stopBleScan stopblescan2 = this.maxAmount;
            int hashCode8 = (hashCode7 + (stopblescan2 != null ? stopblescan2.hashCode() : 0)) * 31;
            List<GriverBundleUtils> list2 = this.limitRule;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode8 + i;
        }
    }

    public FileCache(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, long j, long j2, @NotNull List<getUtdid> list) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, "userName");
        Intrinsics.checkNotNullParameter(str3, "avatar");
        Intrinsics.checkNotNullParameter(str4, "review");
        Intrinsics.checkNotNullParameter(list, "images");
        this.userId = str;
        this.userName = str2;
        this.avatar = str3;
        this.review = str4;
        this.rating = i;
        this.modifyDate = j;
        this.createdDate = j2;
        this.images = list;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    public final String getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final String getReview() {
        return this.review;
    }

    public final int getRating() {
        return this.rating;
    }

    public final long getModifyDate() {
        return this.modifyDate;
    }

    public final long getCreatedDate() {
        return this.createdDate;
    }

    @NotNull
    public final List<getUtdid> getImages() {
        return this.images;
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
        int hashCode4 = (((((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.valueOf(this.rating).hashCode()) * 31) + Long.valueOf(this.modifyDate).hashCode()) * 31) + Long.valueOf(this.createdDate).hashCode()) * 31;
        List<getUtdid> list = this.images;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }
}
