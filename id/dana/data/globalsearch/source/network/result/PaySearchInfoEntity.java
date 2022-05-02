package id.dana.data.globalsearch.source.network.result;

import androidx.annotation.Keep;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018¢\u0006\u0002\u0010\u001aJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018HÆ\u0003J\u0017\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0002\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00182\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\u000fHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u001f\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u001f\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001cR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#¨\u0006M"}, d2 = {"Lid/dana/data/globalsearch/source/network/result/PaySearchInfoEntity;", "", "id", "", "name", "mcc", "", "category", "subCategory", "url", "", "logo", "tag", "description", "score", "", "rating", "", "address", "infoType", "searchId", "gmtCreate", "gmtModified", "info", "", "location", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "getAddress", "()Ljava/lang/String;", "getCategory", "getDescription", "getGmtCreate", "getGmtModified", "getId", "getInfo", "()Ljava/util/Map;", "getInfoType", "getLocation", "getLogo", "getMcc", "()Ljava/util/List;", "getName", "getRating", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSearchId", "getSubCategory", "getTag", "getUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lid/dana/data/globalsearch/source/network/result/PaySearchInfoEntity;", "equals", "", "other", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class PaySearchInfoEntity {
    @Nullable
    private final String address;
    @Nullable
    private final String category;
    @Nullable
    private final String description;
    @Nullable
    private final String gmtCreate;
    @Nullable
    private final String gmtModified;
    @Nullable

    /* renamed from: id  reason: collision with root package name */
    private final String f9897id;
    @Nullable
    private final Map<String, String> info;
    @Nullable
    private final String infoType;
    @Nullable
    private final Map<String, String> location;
    @Nullable
    private final String logo;
    @Nullable
    private final List<String> mcc;
    @Nullable
    private final String name;
    @Nullable
    private final Double rating;
    @Nullable
    private final Integer score;
    @Nullable
    private final String searchId;
    @Nullable
    private final String subCategory;
    @Nullable
    private final String tag;
    @NotNull
    private final Map<String, String> url;

    public PaySearchInfoEntity() {
        this((String) null, (String) null, (List) null, (String) null, (String) null, (Map) null, (String) null, (String) null, (String) null, (Integer) null, (Double) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, (Map) null, 262143, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PaySearchInfoEntity copy$default(PaySearchInfoEntity paySearchInfoEntity, String str, String str2, List list, String str3, String str4, Map map, String str5, String str6, String str7, Integer num, Double d, String str8, String str9, String str10, String str11, String str12, Map map2, Map map3, int i, Object obj) {
        PaySearchInfoEntity paySearchInfoEntity2 = paySearchInfoEntity;
        int i2 = i;
        return paySearchInfoEntity.copy((i2 & 1) != 0 ? paySearchInfoEntity2.f9897id : str, (i2 & 2) != 0 ? paySearchInfoEntity2.name : str2, (i2 & 4) != 0 ? paySearchInfoEntity2.mcc : list, (i2 & 8) != 0 ? paySearchInfoEntity2.category : str3, (i2 & 16) != 0 ? paySearchInfoEntity2.subCategory : str4, (i2 & 32) != 0 ? paySearchInfoEntity2.url : map, (i2 & 64) != 0 ? paySearchInfoEntity2.logo : str5, (i2 & 128) != 0 ? paySearchInfoEntity2.tag : str6, (i2 & 256) != 0 ? paySearchInfoEntity2.description : str7, (i2 & 512) != 0 ? paySearchInfoEntity2.score : num, (i2 & 1024) != 0 ? paySearchInfoEntity2.rating : d, (i2 & 2048) != 0 ? paySearchInfoEntity2.address : str8, (i2 & 4096) != 0 ? paySearchInfoEntity2.infoType : str9, (i2 & 8192) != 0 ? paySearchInfoEntity2.searchId : str10, (i2 & 16384) != 0 ? paySearchInfoEntity2.gmtCreate : str11, (i2 & 32768) != 0 ? paySearchInfoEntity2.gmtModified : str12, (i2 & 65536) != 0 ? paySearchInfoEntity2.info : map2, (i2 & 131072) != 0 ? paySearchInfoEntity2.location : map3);
    }

    @Nullable
    public final String component1() {
        return this.f9897id;
    }

    @Nullable
    public final Integer component10() {
        return this.score;
    }

    @Nullable
    public final Double component11() {
        return this.rating;
    }

    @Nullable
    public final String component12() {
        return this.address;
    }

    @Nullable
    public final String component13() {
        return this.infoType;
    }

    @Nullable
    public final String component14() {
        return this.searchId;
    }

    @Nullable
    public final String component15() {
        return this.gmtCreate;
    }

    @Nullable
    public final String component16() {
        return this.gmtModified;
    }

    @Nullable
    public final Map<String, String> component17() {
        return this.info;
    }

    @Nullable
    public final Map<String, String> component18() {
        return this.location;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final List<String> component3() {
        return this.mcc;
    }

    @Nullable
    public final String component4() {
        return this.category;
    }

    @Nullable
    public final String component5() {
        return this.subCategory;
    }

    @NotNull
    public final Map<String, String> component6() {
        return this.url;
    }

    @Nullable
    public final String component7() {
        return this.logo;
    }

    @Nullable
    public final String component8() {
        return this.tag;
    }

    @Nullable
    public final String component9() {
        return this.description;
    }

    @NotNull
    public final PaySearchInfoEntity copy(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @Nullable String str4, @NotNull Map<String, String> map, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num, @Nullable Double d, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3) {
        String str13 = str;
        Intrinsics.checkNotNullParameter(map, "url");
        return new PaySearchInfoEntity(str, str2, list, str3, str4, map, str5, str6, str7, num, d, str8, str9, str10, str11, str12, map2, map3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaySearchInfoEntity)) {
            return false;
        }
        PaySearchInfoEntity paySearchInfoEntity = (PaySearchInfoEntity) obj;
        return Intrinsics.areEqual((Object) this.f9897id, (Object) paySearchInfoEntity.f9897id) && Intrinsics.areEqual((Object) this.name, (Object) paySearchInfoEntity.name) && Intrinsics.areEqual((Object) this.mcc, (Object) paySearchInfoEntity.mcc) && Intrinsics.areEqual((Object) this.category, (Object) paySearchInfoEntity.category) && Intrinsics.areEqual((Object) this.subCategory, (Object) paySearchInfoEntity.subCategory) && Intrinsics.areEqual((Object) this.url, (Object) paySearchInfoEntity.url) && Intrinsics.areEqual((Object) this.logo, (Object) paySearchInfoEntity.logo) && Intrinsics.areEqual((Object) this.tag, (Object) paySearchInfoEntity.tag) && Intrinsics.areEqual((Object) this.description, (Object) paySearchInfoEntity.description) && Intrinsics.areEqual((Object) this.score, (Object) paySearchInfoEntity.score) && Intrinsics.areEqual((Object) this.rating, (Object) paySearchInfoEntity.rating) && Intrinsics.areEqual((Object) this.address, (Object) paySearchInfoEntity.address) && Intrinsics.areEqual((Object) this.infoType, (Object) paySearchInfoEntity.infoType) && Intrinsics.areEqual((Object) this.searchId, (Object) paySearchInfoEntity.searchId) && Intrinsics.areEqual((Object) this.gmtCreate, (Object) paySearchInfoEntity.gmtCreate) && Intrinsics.areEqual((Object) this.gmtModified, (Object) paySearchInfoEntity.gmtModified) && Intrinsics.areEqual((Object) this.info, (Object) paySearchInfoEntity.info) && Intrinsics.areEqual((Object) this.location, (Object) paySearchInfoEntity.location);
    }

    public final int hashCode() {
        String str = this.f9897id;
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
        Map<String, String> map = this.url;
        int hashCode6 = (hashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        String str5 = this.logo;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.tag;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.description;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Integer num = this.score;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Double d = this.rating;
        int hashCode11 = (hashCode10 + (d != null ? d.hashCode() : 0)) * 31;
        String str8 = this.address;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.infoType;
        int hashCode13 = (hashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.searchId;
        int hashCode14 = (hashCode13 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.gmtCreate;
        int hashCode15 = (hashCode14 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.gmtModified;
        int hashCode16 = (hashCode15 + (str12 != null ? str12.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.info;
        int hashCode17 = (hashCode16 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, String> map3 = this.location;
        if (map3 != null) {
            i = map3.hashCode();
        }
        return hashCode17 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PaySearchInfoEntity(id=");
        sb.append(this.f9897id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", mcc=");
        sb.append(this.mcc);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", subCategory=");
        sb.append(this.subCategory);
        sb.append(", url=");
        sb.append(this.url);
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
        sb.append(", searchId=");
        sb.append(this.searchId);
        sb.append(", gmtCreate=");
        sb.append(this.gmtCreate);
        sb.append(", gmtModified=");
        sb.append(this.gmtModified);
        sb.append(", info=");
        sb.append(this.info);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(")");
        return sb.toString();
    }

    public PaySearchInfoEntity(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @Nullable String str4, @NotNull Map<String, String> map, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num, @Nullable Double d, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3) {
        Intrinsics.checkNotNullParameter(map, "url");
        this.f9897id = str;
        this.name = str2;
        this.mcc = list;
        this.category = str3;
        this.subCategory = str4;
        this.url = map;
        this.logo = str5;
        this.tag = str6;
        this.description = str7;
        this.score = num;
        this.rating = d;
        this.address = str8;
        this.infoType = str9;
        this.searchId = str10;
        this.gmtCreate = str11;
        this.gmtModified = str12;
        this.info = map2;
        this.location = map3;
    }

    @Nullable
    public final String getId() {
        return this.f9897id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<String> getMcc() {
        return this.mcc;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getSubCategory() {
        return this.subCategory;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PaySearchInfoEntity(java.lang.String r20, java.lang.String r21, java.util.List r22, java.lang.String r23, java.lang.String r24, java.util.Map r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.Integer r29, java.lang.Double r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.util.Map r36, java.util.Map r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            r19 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r20
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r21
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r22
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r23
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r24
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0036
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Map r7 = (java.util.Map) r7
            goto L_0x0038
        L_0x0036:
            r7 = r25
        L_0x0038:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003e
            r8 = 0
            goto L_0x0040
        L_0x003e:
            r8 = r26
        L_0x0040:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0046
            r9 = 0
            goto L_0x0048
        L_0x0046:
            r9 = r27
        L_0x0048:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004e
            r10 = 0
            goto L_0x0050
        L_0x004e:
            r10 = r28
        L_0x0050:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x005a
            r11 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x005c
        L_0x005a:
            r11 = r29
        L_0x005c:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0067
            r12 = 0
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            goto L_0x0069
        L_0x0067:
            r12 = r30
        L_0x0069:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x006f
            r13 = 0
            goto L_0x0071
        L_0x006f:
            r13 = r31
        L_0x0071:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0077
            r14 = 0
            goto L_0x0079
        L_0x0077:
            r14 = r32
        L_0x0079:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x007f
            r15 = 0
            goto L_0x0081
        L_0x007f:
            r15 = r33
        L_0x0081:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0087
            r2 = 0
            goto L_0x0089
        L_0x0087:
            r2 = r34
        L_0x0089:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0093
            r16 = 0
            goto L_0x0095
        L_0x0093:
            r16 = r35
        L_0x0095:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x009e
            r17 = 0
            goto L_0x00a0
        L_0x009e:
            r17 = r36
        L_0x00a0:
            r18 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r18
            if (r0 == 0) goto L_0x00a8
            r0 = 0
            goto L_0x00aa
        L_0x00a8:
            r0 = r37
        L_0x00aa:
            r20 = r19
            r21 = r1
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r6
            r26 = r7
            r27 = r8
            r28 = r9
            r29 = r10
            r30 = r11
            r31 = r12
            r32 = r13
            r33 = r14
            r34 = r15
            r35 = r2
            r36 = r16
            r37 = r17
            r38 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.data.globalsearch.source.network.result.PaySearchInfoEntity.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final Map<String, String> getUrl() {
        return this.url;
    }

    @Nullable
    public final String getLogo() {
        return this.logo;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Integer getScore() {
        return this.score;
    }

    @Nullable
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getInfoType() {
        return this.infoType;
    }

    @Nullable
    public final String getSearchId() {
        return this.searchId;
    }

    @Nullable
    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    @Nullable
    public final String getGmtModified() {
        return this.gmtModified;
    }

    @Nullable
    public final Map<String, String> getInfo() {
        return this.info;
    }

    @Nullable
    public final Map<String, String> getLocation() {
        return this.location;
    }
}
