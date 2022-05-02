package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jy\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\fHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00060"}, d2 = {"Lid/dana/data/promocenter/repository/source/network/model/DisplayPromoResponse;", "", "promoContentId", "", "promoName", "promoEndDate", "", "promoCallToActions", "", "Lid/dana/data/promocenter/repository/source/network/model/CallToActionDTO;", "promoBannerImageUrl", "promoPriority", "", "promoIndexId", "promoBannerVerticalImageUrl", "merchantType", "promoTncId", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMerchantType", "()Ljava/lang/String;", "getPromoBannerImageUrl", "getPromoBannerVerticalImageUrl", "getPromoCallToActions", "()Ljava/util/List;", "getPromoContentId", "getPromoEndDate", "()J", "getPromoIndexId", "getPromoName", "getPromoPriority", "()I", "getPromoTncId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DefaultImpl {
    @Nullable
    private final String merchantType;
    @NotNull
    private final String promoBannerImageUrl;
    @Nullable
    private final String promoBannerVerticalImageUrl;
    @Nullable
    private final List<AutoExtension> promoCallToActions;
    @NotNull
    private final String promoContentId;
    private final long promoEndDate;
    private final long promoIndexId;
    @NotNull
    private final String promoName;
    private final int promoPriority;
    @NotNull
    private final String promoTncId;

    public DefaultImpl() {
        this((String) null, (String) null, 0, (List) null, (String) null, 0, 0, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DefaultImpl copy$default(DefaultImpl defaultImpl, String str, String str2, long j, List list, String str3, int i, long j2, String str4, String str5, String str6, int i2, Object obj) {
        DefaultImpl defaultImpl2 = defaultImpl;
        int i3 = i2;
        return defaultImpl.copy((i3 & 1) != 0 ? defaultImpl2.promoContentId : str, (i3 & 2) != 0 ? defaultImpl2.promoName : str2, (i3 & 4) != 0 ? defaultImpl2.promoEndDate : j, (i3 & 8) != 0 ? defaultImpl2.promoCallToActions : list, (i3 & 16) != 0 ? defaultImpl2.promoBannerImageUrl : str3, (i3 & 32) != 0 ? defaultImpl2.promoPriority : i, (i3 & 64) != 0 ? defaultImpl2.promoIndexId : j2, (i3 & 128) != 0 ? defaultImpl2.promoBannerVerticalImageUrl : str4, (i3 & 256) != 0 ? defaultImpl2.merchantType : str5, (i3 & 512) != 0 ? defaultImpl2.promoTncId : str6);
    }

    @NotNull
    public final String component1() {
        return this.promoContentId;
    }

    @NotNull
    public final String component10() {
        return this.promoTncId;
    }

    @NotNull
    public final String component2() {
        return this.promoName;
    }

    public final long component3() {
        return this.promoEndDate;
    }

    @Nullable
    public final List<AutoExtension> component4() {
        return this.promoCallToActions;
    }

    @NotNull
    public final String component5() {
        return this.promoBannerImageUrl;
    }

    public final int component6() {
        return this.promoPriority;
    }

    public final long component7() {
        return this.promoIndexId;
    }

    @Nullable
    public final String component8() {
        return this.promoBannerVerticalImageUrl;
    }

    @Nullable
    public final String component9() {
        return this.merchantType;
    }

    @NotNull
    public final DefaultImpl copy(@NotNull String str, @NotNull String str2, long j, @Nullable List<? extends AutoExtension> list, @NotNull String str3, int i, long j2, @Nullable String str4, @Nullable String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "promoContentId");
        String str7 = str2;
        Intrinsics.checkNotNullParameter(str7, "promoName");
        String str8 = str3;
        Intrinsics.checkNotNullParameter(str8, "promoBannerImageUrl");
        String str9 = str6;
        Intrinsics.checkNotNullParameter(str9, "promoTncId");
        return new DefaultImpl(str, str7, j, list, str8, i, j2, str4, str5, str9);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultImpl)) {
            return false;
        }
        DefaultImpl defaultImpl = (DefaultImpl) obj;
        return Intrinsics.areEqual((Object) this.promoContentId, (Object) defaultImpl.promoContentId) && Intrinsics.areEqual((Object) this.promoName, (Object) defaultImpl.promoName) && this.promoEndDate == defaultImpl.promoEndDate && Intrinsics.areEqual((Object) this.promoCallToActions, (Object) defaultImpl.promoCallToActions) && Intrinsics.areEqual((Object) this.promoBannerImageUrl, (Object) defaultImpl.promoBannerImageUrl) && this.promoPriority == defaultImpl.promoPriority && this.promoIndexId == defaultImpl.promoIndexId && Intrinsics.areEqual((Object) this.promoBannerVerticalImageUrl, (Object) defaultImpl.promoBannerVerticalImageUrl) && Intrinsics.areEqual((Object) this.merchantType, (Object) defaultImpl.merchantType) && Intrinsics.areEqual((Object) this.promoTncId, (Object) defaultImpl.promoTncId);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayPromoResponse(promoContentId=");
        sb.append(this.promoContentId);
        sb.append(", promoName=");
        sb.append(this.promoName);
        sb.append(", promoEndDate=");
        sb.append(this.promoEndDate);
        sb.append(", promoCallToActions=");
        sb.append(this.promoCallToActions);
        sb.append(", promoBannerImageUrl=");
        sb.append(this.promoBannerImageUrl);
        sb.append(", promoPriority=");
        sb.append(this.promoPriority);
        sb.append(", promoIndexId=");
        sb.append(this.promoIndexId);
        sb.append(", promoBannerVerticalImageUrl=");
        sb.append(this.promoBannerVerticalImageUrl);
        sb.append(", merchantType=");
        sb.append(this.merchantType);
        sb.append(", promoTncId=");
        sb.append(this.promoTncId);
        sb.append(")");
        return sb.toString();
    }

    public DefaultImpl(@NotNull String str, @NotNull String str2, long j, @Nullable List<? extends AutoExtension> list, @NotNull String str3, int i, long j2, @Nullable String str4, @Nullable String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "promoContentId");
        Intrinsics.checkNotNullParameter(str2, "promoName");
        Intrinsics.checkNotNullParameter(str3, "promoBannerImageUrl");
        Intrinsics.checkNotNullParameter(str6, "promoTncId");
        this.promoContentId = str;
        this.promoName = str2;
        this.promoEndDate = j;
        this.promoCallToActions = list;
        this.promoBannerImageUrl = str3;
        this.promoPriority = i;
        this.promoIndexId = j2;
        this.promoBannerVerticalImageUrl = str4;
        this.merchantType = str5;
        this.promoTncId = str6;
    }

    @NotNull
    public final String getPromoContentId() {
        return this.promoContentId;
    }

    @NotNull
    public final String getPromoName() {
        return this.promoName;
    }

    public final long getPromoEndDate() {
        return this.promoEndDate;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DefaultImpl(java.lang.String r14, java.lang.String r15, long r16, java.util.List r18, java.lang.String r19, int r20, long r21, java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r13 = this;
            r0 = r26
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
            r5 = 0
            if (r4 == 0) goto L_0x001a
            r7 = r5
            goto L_0x001c
        L_0x001a:
            r7 = r16
        L_0x001c:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0025
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0027
        L_0x0025:
            r4 = r18
        L_0x0027:
            r9 = r0 & 16
            if (r9 == 0) goto L_0x002d
            r9 = r2
            goto L_0x002f
        L_0x002d:
            r9 = r19
        L_0x002f:
            r10 = r0 & 32
            if (r10 == 0) goto L_0x0035
            r10 = 0
            goto L_0x0037
        L_0x0035:
            r10 = r20
        L_0x0037:
            r11 = r0 & 64
            if (r11 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r5 = r21
        L_0x003e:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0044
            r11 = r2
            goto L_0x0046
        L_0x0044:
            r11 = r23
        L_0x0046:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x004c
            r12 = r2
            goto L_0x004e
        L_0x004c:
            r12 = r24
        L_0x004e:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r2 = r25
        L_0x0055:
            r14 = r13
            r15 = r1
            r16 = r3
            r17 = r7
            r19 = r4
            r20 = r9
            r21 = r10
            r22 = r5
            r24 = r11
            r25 = r12
            r26 = r2
            r14.<init>(r15, r16, r17, r19, r20, r21, r22, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultImpl.<init>(java.lang.String, java.lang.String, long, java.util.List, java.lang.String, int, long, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final List<AutoExtension> getPromoCallToActions() {
        return this.promoCallToActions;
    }

    @NotNull
    public final String getPromoBannerImageUrl() {
        return this.promoBannerImageUrl;
    }

    public final int getPromoPriority() {
        return this.promoPriority;
    }

    public final long getPromoIndexId() {
        return this.promoIndexId;
    }

    @Nullable
    public final String getPromoBannerVerticalImageUrl() {
        return this.promoBannerVerticalImageUrl;
    }

    @Nullable
    public final String getMerchantType() {
        return this.merchantType;
    }

    @NotNull
    public final String getPromoTncId() {
        return this.promoTncId;
    }

    public final int hashCode() {
        String str = this.promoContentId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.promoName;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.valueOf(this.promoEndDate).hashCode()) * 31;
        List<AutoExtension> list = this.promoCallToActions;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.promoBannerImageUrl;
        int hashCode4 = (((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.valueOf(this.promoPriority).hashCode()) * 31) + Long.valueOf(this.promoIndexId).hashCode()) * 31;
        String str4 = this.promoBannerVerticalImageUrl;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.merchantType;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.promoTncId;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 + i;
    }
}
