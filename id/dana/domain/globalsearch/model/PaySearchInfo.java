package id.dana.domain.globalsearch.model;

import androidx.annotation.Keep;
import id.dana.data.constant.BranchLinkConstant;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b?\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\u0002\u0010\u0019J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u000fHÆ\u0003J\t\u0010H\u001a\u00020\u0011HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010L\u001a\u00020\u0015HÆ\u0003J\u0015\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0018HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\u0015\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003JÉ\u0001\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0018HÆ\u0001J\u0013\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020\u000fHÖ\u0001J\t\u0010[\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0012\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0013\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001b\"\u0004\b?\u0010\u001dR\u001a\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001b\"\u0004\bA\u0010\u001dR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010%\"\u0004\bC\u0010'R\u001a\u0010\u0016\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010+\"\u0004\bE\u0010-¨\u0006\\"}, d2 = {"Lid/dana/domain/globalsearch/model/PaySearchInfo;", "", "id", "", "name", "mcc", "", "category", "subCategory", "urlMap", "", "logo", "tag", "description", "score", "", "rating", "", "address", "infoType", "location", "Lid/dana/domain/globalsearch/model/LatLng;", "userLocation", "info", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;Lid/dana/domain/globalsearch/model/LatLng;Lid/dana/domain/globalsearch/model/LatLng;Ljava/util/Map;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getCategory", "setCategory", "getDescription", "setDescription", "getId", "setId", "getInfo", "()Ljava/util/Map;", "setInfo", "(Ljava/util/Map;)V", "getInfoType", "setInfoType", "getLocation", "()Lid/dana/domain/globalsearch/model/LatLng;", "setLocation", "(Lid/dana/domain/globalsearch/model/LatLng;)V", "getLogo", "setLogo", "getMcc", "()Ljava/util/List;", "setMcc", "(Ljava/util/List;)V", "getName", "setName", "getRating", "()D", "setRating", "(D)V", "getScore", "()I", "setScore", "(I)V", "getSubCategory", "setSubCategory", "getTag", "setTag", "getUrlMap", "setUrlMap", "getUserLocation", "setUserLocation", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
@Keep
public final class PaySearchInfo {
    @NotNull
    private String address;
    @NotNull
    private String category;
    @NotNull
    private String description;
    @NotNull

    /* renamed from: id  reason: collision with root package name */
    private String f9901id;
    @NotNull
    private Map<String, String> info;
    @NotNull
    private String infoType;
    @Nullable
    private LatLng location;
    @NotNull
    private String logo;
    @NotNull
    private List<String> mcc;
    @NotNull
    private String name;
    private double rating;
    private int score;
    @NotNull
    private String subCategory;
    @NotNull
    private String tag;
    @NotNull
    private Map<String, String> urlMap;
    @NotNull
    private LatLng userLocation;

    public PaySearchInfo() {
        this((String) null, (String) null, (List) null, (String) null, (String) null, (Map) null, (String) null, (String) null, (String) null, 0, 0.0d, (String) null, (String) null, (LatLng) null, (LatLng) null, (Map) null, 65535, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PaySearchInfo copy$default(PaySearchInfo paySearchInfo, String str, String str2, List list, String str3, String str4, Map map, String str5, String str6, String str7, int i, double d, String str8, String str9, LatLng latLng, LatLng latLng2, Map map2, int i2, Object obj) {
        PaySearchInfo paySearchInfo2 = paySearchInfo;
        int i3 = i2;
        return paySearchInfo.copy((i3 & 1) != 0 ? paySearchInfo2.f9901id : str, (i3 & 2) != 0 ? paySearchInfo2.name : str2, (i3 & 4) != 0 ? paySearchInfo2.mcc : list, (i3 & 8) != 0 ? paySearchInfo2.category : str3, (i3 & 16) != 0 ? paySearchInfo2.subCategory : str4, (i3 & 32) != 0 ? paySearchInfo2.urlMap : map, (i3 & 64) != 0 ? paySearchInfo2.logo : str5, (i3 & 128) != 0 ? paySearchInfo2.tag : str6, (i3 & 256) != 0 ? paySearchInfo2.description : str7, (i3 & 512) != 0 ? paySearchInfo2.score : i, (i3 & 1024) != 0 ? paySearchInfo2.rating : d, (i3 & 2048) != 0 ? paySearchInfo2.address : str8, (i3 & 4096) != 0 ? paySearchInfo2.infoType : str9, (i3 & 8192) != 0 ? paySearchInfo2.location : latLng, (i3 & 16384) != 0 ? paySearchInfo2.userLocation : latLng2, (i3 & 32768) != 0 ? paySearchInfo2.info : map2);
    }

    @NotNull
    public final String component1() {
        return this.f9901id;
    }

    public final int component10() {
        return this.score;
    }

    public final double component11() {
        return this.rating;
    }

    @NotNull
    public final String component12() {
        return this.address;
    }

    @NotNull
    public final String component13() {
        return this.infoType;
    }

    @Nullable
    public final LatLng component14() {
        return this.location;
    }

    @NotNull
    public final LatLng component15() {
        return this.userLocation;
    }

    @NotNull
    public final Map<String, String> component16() {
        return this.info;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final List<String> component3() {
        return this.mcc;
    }

    @NotNull
    public final String component4() {
        return this.category;
    }

    @NotNull
    public final String component5() {
        return this.subCategory;
    }

    @NotNull
    public final Map<String, String> component6() {
        return this.urlMap;
    }

    @NotNull
    public final String component7() {
        return this.logo;
    }

    @NotNull
    public final String component8() {
        return this.tag;
    }

    @NotNull
    public final String component9() {
        return this.description;
    }

    @NotNull
    public final PaySearchInfo copy(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull String str3, @NotNull String str4, @NotNull Map<String, String> map, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, double d, @NotNull String str8, @NotNull String str9, @Nullable LatLng latLng, @NotNull LatLng latLng2, @NotNull Map<String, String> map2) {
        String str10 = str;
        Intrinsics.checkNotNullParameter(str10, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(list, BranchLinkConstant.OauthParams.MCC);
        Intrinsics.checkNotNullParameter(str3, "category");
        Intrinsics.checkNotNullParameter(str4, "subCategory");
        Intrinsics.checkNotNullParameter(map, "urlMap");
        Intrinsics.checkNotNullParameter(str5, "logo");
        Intrinsics.checkNotNullParameter(str6, "tag");
        Intrinsics.checkNotNullParameter(str7, "description");
        Intrinsics.checkNotNullParameter(str8, "address");
        Intrinsics.checkNotNullParameter(str9, "infoType");
        Intrinsics.checkNotNullParameter(latLng2, "userLocation");
        Intrinsics.checkNotNullParameter(map2, "info");
        return new PaySearchInfo(str10, str2, list, str3, str4, map, str5, str6, str7, i, d, str8, str9, latLng, latLng2, map2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaySearchInfo)) {
            return false;
        }
        PaySearchInfo paySearchInfo = (PaySearchInfo) obj;
        return Intrinsics.areEqual((Object) this.f9901id, (Object) paySearchInfo.f9901id) && Intrinsics.areEqual((Object) this.name, (Object) paySearchInfo.name) && Intrinsics.areEqual((Object) this.mcc, (Object) paySearchInfo.mcc) && Intrinsics.areEqual((Object) this.category, (Object) paySearchInfo.category) && Intrinsics.areEqual((Object) this.subCategory, (Object) paySearchInfo.subCategory) && Intrinsics.areEqual((Object) this.urlMap, (Object) paySearchInfo.urlMap) && Intrinsics.areEqual((Object) this.logo, (Object) paySearchInfo.logo) && Intrinsics.areEqual((Object) this.tag, (Object) paySearchInfo.tag) && Intrinsics.areEqual((Object) this.description, (Object) paySearchInfo.description) && this.score == paySearchInfo.score && Double.compare(this.rating, paySearchInfo.rating) == 0 && Intrinsics.areEqual((Object) this.address, (Object) paySearchInfo.address) && Intrinsics.areEqual((Object) this.infoType, (Object) paySearchInfo.infoType) && Intrinsics.areEqual((Object) this.location, (Object) paySearchInfo.location) && Intrinsics.areEqual((Object) this.userLocation, (Object) paySearchInfo.userLocation) && Intrinsics.areEqual((Object) this.info, (Object) paySearchInfo.info);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PaySearchInfo(id=");
        sb.append(this.f9901id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", mcc=");
        sb.append(this.mcc);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", subCategory=");
        sb.append(this.subCategory);
        sb.append(", urlMap=");
        sb.append(this.urlMap);
        sb.append(", logo=");
        sb.append(this.logo);
        sb.append(", tag=");
        sb.append(this.tag);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", score=");
        sb.append(this.score);
        sb.append(", rating=");
        sb.append(this.rating);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", infoType=");
        sb.append(this.infoType);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", userLocation=");
        sb.append(this.userLocation);
        sb.append(", info=");
        sb.append(this.info);
        sb.append(")");
        return sb.toString();
    }

    public PaySearchInfo(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull String str3, @NotNull String str4, @NotNull Map<String, String> map, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, double d, @NotNull String str8, @NotNull String str9, @Nullable LatLng latLng, @NotNull LatLng latLng2, @NotNull Map<String, String> map2) {
        String str10 = str;
        String str11 = str2;
        List<String> list2 = list;
        String str12 = str3;
        String str13 = str4;
        Map<String, String> map3 = map;
        String str14 = str5;
        String str15 = str6;
        String str16 = str7;
        String str17 = str8;
        String str18 = str9;
        LatLng latLng3 = latLng2;
        Map<String, String> map4 = map2;
        Intrinsics.checkNotNullParameter(str10, "id");
        Intrinsics.checkNotNullParameter(str11, "name");
        Intrinsics.checkNotNullParameter(list2, BranchLinkConstant.OauthParams.MCC);
        Intrinsics.checkNotNullParameter(str12, "category");
        Intrinsics.checkNotNullParameter(str13, "subCategory");
        Intrinsics.checkNotNullParameter(map3, "urlMap");
        Intrinsics.checkNotNullParameter(str14, "logo");
        Intrinsics.checkNotNullParameter(str15, "tag");
        Intrinsics.checkNotNullParameter(str16, "description");
        Intrinsics.checkNotNullParameter(str17, "address");
        Intrinsics.checkNotNullParameter(str18, "infoType");
        Intrinsics.checkNotNullParameter(latLng3, "userLocation");
        Intrinsics.checkNotNullParameter(map4, "info");
        this.f9901id = str10;
        this.name = str11;
        this.mcc = list2;
        this.category = str12;
        this.subCategory = str13;
        this.urlMap = map3;
        this.logo = str14;
        this.tag = str15;
        this.description = str16;
        this.score = i;
        this.rating = d;
        this.address = str17;
        this.infoType = str18;
        this.location = latLng;
        this.userLocation = latLng3;
        this.info = map4;
    }

    @NotNull
    public final String getId() {
        return this.f9901id;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f9901id = str;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PaySearchInfo(java.lang.String r23, java.lang.String r24, java.util.List r25, java.lang.String r26, java.lang.String r27, java.util.Map r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32, double r33, java.lang.String r35, java.lang.String r36, id.dana.domain.globalsearch.model.LatLng r37, id.dana.domain.globalsearch.model.LatLng r38, java.util.Map r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r22 = this;
            r0 = r40
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r23
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r24
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0020
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            goto L_0x0022
        L_0x0020:
            r4 = r25
        L_0x0022:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0028
            r5 = r2
            goto L_0x002a
        L_0x0028:
            r5 = r26
        L_0x002a:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0030
            r6 = r2
            goto L_0x0032
        L_0x0030:
            r6 = r27
        L_0x0032:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x003e
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Map r7 = (java.util.Map) r7
            goto L_0x0040
        L_0x003e:
            r7 = r28
        L_0x0040:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0046
            r8 = r2
            goto L_0x0048
        L_0x0046:
            r8 = r29
        L_0x0048:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x004e
            r9 = r2
            goto L_0x0050
        L_0x004e:
            r9 = r30
        L_0x0050:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0056
            r10 = r2
            goto L_0x0058
        L_0x0056:
            r10 = r31
        L_0x0058:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x005e
            r11 = 0
            goto L_0x0060
        L_0x005e:
            r11 = r32
        L_0x0060:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0067
            r12 = 0
            goto L_0x0069
        L_0x0067:
            r12 = r33
        L_0x0069:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x006f
            r14 = r2
            goto L_0x0071
        L_0x006f:
            r14 = r35
        L_0x0071:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r2 = r36
        L_0x0078:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x007e
            r15 = 0
            goto L_0x0080
        L_0x007e:
            r15 = r37
        L_0x0080:
            r41 = r15
            r15 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x009e
            id.dana.domain.globalsearch.model.LatLng r15 = new id.dana.domain.globalsearch.model.LatLng
            r16 = 0
            r18 = 0
            r20 = 3
            r21 = 0
            r23 = r15
            r24 = r16
            r26 = r18
            r28 = r20
            r29 = r21
            r23.<init>(r24, r26, r28, r29)
            goto L_0x00a0
        L_0x009e:
            r15 = r38
        L_0x00a0:
            r16 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r16
            if (r0 == 0) goto L_0x00af
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            goto L_0x00b1
        L_0x00af:
            r0 = r39
        L_0x00b1:
            r23 = r22
            r24 = r1
            r25 = r3
            r26 = r4
            r27 = r5
            r28 = r6
            r29 = r7
            r30 = r8
            r31 = r9
            r32 = r10
            r33 = r11
            r34 = r12
            r36 = r14
            r37 = r2
            r38 = r41
            r39 = r15
            r40 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r37, r38, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.domain.globalsearch.model.PaySearchInfo.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.String, int, double, java.lang.String, java.lang.String, id.dana.domain.globalsearch.model.LatLng, id.dana.domain.globalsearch.model.LatLng, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final List<String> getMcc() {
        return this.mcc;
    }

    public final void setMcc(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mcc = list;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    public final void setCategory(@NotNull String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1491831744, oncanceled);
            onCancelLoad.getMin(-1491831744, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.category = str;
    }

    @NotNull
    public final String getSubCategory() {
        return this.subCategory;
    }

    public final void setSubCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subCategory = str;
    }

    @NotNull
    public final Map<String, String> getUrlMap() {
        return this.urlMap;
    }

    public final void setUrlMap(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.urlMap = map;
    }

    @NotNull
    public final String getLogo() {
        return this.logo;
    }

    public final void setLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.logo = str;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final void setTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tag = str;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    public final int getScore() {
        return this.score;
    }

    public final void setScore(int i) {
        this.score = i;
    }

    public final double getRating() {
        return this.rating;
    }

    public final void setRating(double d) {
        this.rating = d;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    @NotNull
    public final String getInfoType() {
        return this.infoType;
    }

    public final void setInfoType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.infoType = str;
    }

    @Nullable
    public final LatLng getLocation() {
        return this.location;
    }

    public final void setLocation(@Nullable LatLng latLng) {
        this.location = latLng;
    }

    @NotNull
    public final LatLng getUserLocation() {
        return this.userLocation;
    }

    public final void setUserLocation(@NotNull LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "<set-?>");
        this.userLocation = latLng;
    }

    @NotNull
    public final Map<String, String> getInfo() {
        return this.info;
    }

    public final void setInfo(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.info = map;
    }

    public final int hashCode() {
        String str = this.f9901id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.mcc;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.category;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.subCategory;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Map<String, String> map = this.urlMap;
        int hashCode6 = (hashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        String str5 = this.logo;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.tag;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.description;
        int hashCode9 = (((((hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31) + Integer.valueOf(this.score).hashCode()) * 31) + Double.valueOf(this.rating).hashCode()) * 31;
        String str8 = this.address;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.infoType;
        int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31;
        LatLng latLng = this.location;
        int hashCode12 = (hashCode11 + (latLng != null ? latLng.hashCode() : 0)) * 31;
        LatLng latLng2 = this.userLocation;
        int hashCode13 = (hashCode12 + (latLng2 != null ? latLng2.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.info;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return hashCode13 + i;
    }
}
