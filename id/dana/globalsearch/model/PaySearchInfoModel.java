package id.dana.globalsearch.model;

import androidx.annotation.Keep;
import com.iap.ac.android.mpm.base.model.hook.HookConstants;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.domain.globalsearch.model.LatLng;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.setBridgeManifests;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b>\b\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u000fHÆ\u0003J\t\u0010=\u001a\u00020\u0011HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u0015\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0017HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u001bHÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u0015\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003Jß\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001bHÆ\u0001J\u0013\u0010N\u001a\u00020\u001b2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010P\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010Q\u001a\u0004\u0018\u00010\u0003J\b\u0010R\u001a\u0004\u0018\u00010\u0003J\b\u0010S\u001a\u0004\u0018\u00010\u0003J\b\u0010T\u001a\u0004\u0018\u00010\u0003J\u0006\u0010U\u001a\u00020\u0003J\b\u0010V\u001a\u0004\u0018\u00010\u0003J\t\u0010W\u001a\u00020\u000fHÖ\u0001J\t\u0010X\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010&\"\u0004\b'\u0010(R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001a\u0010\u0019\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u00100R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001eR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010$\"\u0004\b9\u0010:¨\u0006Y"}, d2 = {"Lid/dana/globalsearch/model/PaySearchInfoModel;", "", "id", "", "name", "mcc", "", "category", "subCategory", "urlMap", "", "logo", "tag", "description", "score", "", "rating", "", "address", "location", "Lid/dana/domain/globalsearch/model/LatLng;", "infoType", "info", "", "distance", "mccName", "isEnable", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Lid/dana/domain/globalsearch/model/LatLng;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Z)V", "getAddress", "()Ljava/lang/String;", "getCategory", "getDescription", "getDistance", "getId", "getInfo", "()Ljava/util/Map;", "getInfoType", "()Z", "setEnable", "(Z)V", "getLocation", "()Lid/dana/domain/globalsearch/model/LatLng;", "getLogo", "getMcc", "()Ljava/util/List;", "getMccName", "setMccName", "(Ljava/lang/String;)V", "getName", "getRating", "()D", "getScore", "()I", "getSubCategory", "getTag", "getUrlMap", "setUrlMap", "(Ljava/util/Map;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "getDFShop", "getDishesName", "getDisplayedShopLogo", "getMerchantCategory", "getMerchantName", "getPayType", "getShopName", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class PaySearchInfoModel {
    @NotNull
    private final String address;
    @NotNull
    private final String category;
    @NotNull
    private final String description;
    @Nullable
    private final String distance;
    @NotNull

    /* renamed from: id  reason: collision with root package name */
    private final String f9902id;
    @NotNull
    private final Map<String, Object> info;
    @NotNull
    private final String infoType;
    private boolean isEnable;
    @Nullable
    private final LatLng location;
    @NotNull
    private final String logo;
    @NotNull
    private final List<String> mcc;
    @NotNull
    private String mccName;
    @NotNull
    private final String name;
    private final double rating;
    private final int score;
    @NotNull
    private final String subCategory;
    @NotNull
    private final String tag;
    @NotNull
    private Map<String, String> urlMap;

    public PaySearchInfoModel() {
        this((String) null, (String) null, (List) null, (String) null, (String) null, (Map) null, (String) null, (String) null, (String) null, 0, 0.0d, (String) null, (LatLng) null, (String) null, (Map) null, (String) null, (String) null, false, 262143, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PaySearchInfoModel copy$default(PaySearchInfoModel paySearchInfoModel, String str, String str2, List list, String str3, String str4, Map map, String str5, String str6, String str7, int i, double d, String str8, LatLng latLng, String str9, Map map2, String str10, String str11, boolean z, int i2, Object obj) {
        PaySearchInfoModel paySearchInfoModel2 = paySearchInfoModel;
        int i3 = i2;
        return paySearchInfoModel.copy((i3 & 1) != 0 ? paySearchInfoModel2.f9902id : str, (i3 & 2) != 0 ? paySearchInfoModel2.name : str2, (i3 & 4) != 0 ? paySearchInfoModel2.mcc : list, (i3 & 8) != 0 ? paySearchInfoModel2.category : str3, (i3 & 16) != 0 ? paySearchInfoModel2.subCategory : str4, (i3 & 32) != 0 ? paySearchInfoModel2.urlMap : map, (i3 & 64) != 0 ? paySearchInfoModel2.logo : str5, (i3 & 128) != 0 ? paySearchInfoModel2.tag : str6, (i3 & 256) != 0 ? paySearchInfoModel2.description : str7, (i3 & 512) != 0 ? paySearchInfoModel2.score : i, (i3 & 1024) != 0 ? paySearchInfoModel2.rating : d, (i3 & 2048) != 0 ? paySearchInfoModel2.address : str8, (i3 & 4096) != 0 ? paySearchInfoModel2.location : latLng, (i3 & 8192) != 0 ? paySearchInfoModel2.infoType : str9, (i3 & 16384) != 0 ? paySearchInfoModel2.info : map2, (i3 & 32768) != 0 ? paySearchInfoModel2.distance : str10, (i3 & 65536) != 0 ? paySearchInfoModel2.mccName : str11, (i3 & 131072) != 0 ? paySearchInfoModel2.isEnable : z);
    }

    @NotNull
    public final String component1() {
        return this.f9902id;
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

    @Nullable
    public final LatLng component13() {
        return this.location;
    }

    @NotNull
    public final String component14() {
        return this.infoType;
    }

    @NotNull
    public final Map<String, Object> component15() {
        return this.info;
    }

    @Nullable
    public final String component16() {
        return this.distance;
    }

    @NotNull
    public final String component17() {
        return this.mccName;
    }

    public final boolean component18() {
        return this.isEnable;
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
    public final PaySearchInfoModel copy(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull String str3, @NotNull String str4, @NotNull Map<String, String> map, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, double d, @NotNull String str8, @Nullable LatLng latLng, @NotNull String str9, @NotNull Map<String, ? extends Object> map2, @Nullable String str10, @NotNull String str11, boolean z) {
        String str12 = str;
        Intrinsics.checkNotNullParameter(str12, "id");
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
        Intrinsics.checkNotNullParameter(map2, "info");
        Intrinsics.checkNotNullParameter(str11, "mccName");
        return new PaySearchInfoModel(str12, str2, list, str3, str4, map, str5, str6, str7, i, d, str8, latLng, str9, map2, str10, str11, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaySearchInfoModel)) {
            return false;
        }
        PaySearchInfoModel paySearchInfoModel = (PaySearchInfoModel) obj;
        return Intrinsics.areEqual((Object) this.f9902id, (Object) paySearchInfoModel.f9902id) && Intrinsics.areEqual((Object) this.name, (Object) paySearchInfoModel.name) && Intrinsics.areEqual((Object) this.mcc, (Object) paySearchInfoModel.mcc) && Intrinsics.areEqual((Object) this.category, (Object) paySearchInfoModel.category) && Intrinsics.areEqual((Object) this.subCategory, (Object) paySearchInfoModel.subCategory) && Intrinsics.areEqual((Object) this.urlMap, (Object) paySearchInfoModel.urlMap) && Intrinsics.areEqual((Object) this.logo, (Object) paySearchInfoModel.logo) && Intrinsics.areEqual((Object) this.tag, (Object) paySearchInfoModel.tag) && Intrinsics.areEqual((Object) this.description, (Object) paySearchInfoModel.description) && this.score == paySearchInfoModel.score && Double.compare(this.rating, paySearchInfoModel.rating) == 0 && Intrinsics.areEqual((Object) this.address, (Object) paySearchInfoModel.address) && Intrinsics.areEqual((Object) this.location, (Object) paySearchInfoModel.location) && Intrinsics.areEqual((Object) this.infoType, (Object) paySearchInfoModel.infoType) && Intrinsics.areEqual((Object) this.info, (Object) paySearchInfoModel.info) && Intrinsics.areEqual((Object) this.distance, (Object) paySearchInfoModel.distance) && Intrinsics.areEqual((Object) this.mccName, (Object) paySearchInfoModel.mccName) && this.isEnable == paySearchInfoModel.isEnable;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PaySearchInfoModel(id=");
        sb.append(this.f9902id);
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
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", infoType=");
        sb.append(this.infoType);
        sb.append(", info=");
        sb.append(this.info);
        sb.append(", distance=");
        sb.append(this.distance);
        sb.append(", mccName=");
        sb.append(this.mccName);
        sb.append(", isEnable=");
        sb.append(this.isEnable);
        sb.append(")");
        return sb.toString();
    }

    public PaySearchInfoModel(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull String str3, @NotNull String str4, @NotNull Map<String, String> map, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, double d, @NotNull String str8, @Nullable LatLng latLng, @NotNull String str9, @NotNull Map<String, ? extends Object> map2, @Nullable String str10, @NotNull String str11, boolean z) {
        String str12 = str;
        String str13 = str2;
        List<String> list2 = list;
        String str14 = str3;
        String str15 = str4;
        Map<String, String> map3 = map;
        String str16 = str5;
        String str17 = str6;
        String str18 = str7;
        String str19 = str8;
        String str20 = str9;
        Map<String, ? extends Object> map4 = map2;
        String str21 = str11;
        Intrinsics.checkNotNullParameter(str12, "id");
        Intrinsics.checkNotNullParameter(str13, "name");
        Intrinsics.checkNotNullParameter(list2, BranchLinkConstant.OauthParams.MCC);
        Intrinsics.checkNotNullParameter(str14, "category");
        Intrinsics.checkNotNullParameter(str15, "subCategory");
        Intrinsics.checkNotNullParameter(map3, "urlMap");
        Intrinsics.checkNotNullParameter(str16, "logo");
        Intrinsics.checkNotNullParameter(str17, "tag");
        Intrinsics.checkNotNullParameter(str18, "description");
        Intrinsics.checkNotNullParameter(str19, "address");
        Intrinsics.checkNotNullParameter(str20, "infoType");
        Intrinsics.checkNotNullParameter(map4, "info");
        Intrinsics.checkNotNullParameter(str21, "mccName");
        this.f9902id = str12;
        this.name = str13;
        this.mcc = list2;
        this.category = str14;
        this.subCategory = str15;
        this.urlMap = map3;
        this.logo = str16;
        this.tag = str17;
        this.description = str18;
        this.score = i;
        this.rating = d;
        this.address = str19;
        this.location = latLng;
        this.infoType = str20;
        this.info = map4;
        this.distance = str10;
        this.mccName = str21;
        this.isEnable = z;
    }

    @NotNull
    public final String getId() {
        return this.f9902id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PaySearchInfoModel(java.lang.String r21, java.lang.String r22, java.util.List r23, java.lang.String r24, java.lang.String r25, java.util.Map r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, double r31, java.lang.String r33, id.dana.domain.globalsearch.model.LatLng r34, java.lang.String r35, java.util.Map r36, java.lang.String r37, java.lang.String r38, boolean r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r20 = this;
            r0 = r40
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r21
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r22
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0020
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            goto L_0x0022
        L_0x0020:
            r4 = r23
        L_0x0022:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0028
            r5 = r2
            goto L_0x002a
        L_0x0028:
            r5 = r24
        L_0x002a:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0030
            r6 = r2
            goto L_0x0032
        L_0x0030:
            r6 = r25
        L_0x0032:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x003e
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Map r7 = (java.util.Map) r7
            goto L_0x0040
        L_0x003e:
            r7 = r26
        L_0x0040:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0046
            r8 = r2
            goto L_0x0048
        L_0x0046:
            r8 = r27
        L_0x0048:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x004e
            r9 = r2
            goto L_0x0050
        L_0x004e:
            r9 = r28
        L_0x0050:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0056
            r10 = r2
            goto L_0x0058
        L_0x0056:
            r10 = r29
        L_0x0058:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x005e
            r11 = 0
            goto L_0x0060
        L_0x005e:
            r11 = r30
        L_0x0060:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0067
            r12 = 0
            goto L_0x0069
        L_0x0067:
            r12 = r31
        L_0x0069:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x006f
            r14 = r2
            goto L_0x0071
        L_0x006f:
            r14 = r33
        L_0x0071:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            r16 = 0
            if (r15 == 0) goto L_0x007a
            r15 = r16
            goto L_0x007c
        L_0x007a:
            r15 = r34
        L_0x007c:
            r41 = r2
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0085
            r2 = r41
            goto L_0x0087
        L_0x0085:
            r2 = r35
        L_0x0087:
            r17 = r2
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0095
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Map r2 = (java.util.Map) r2
            goto L_0x0097
        L_0x0095:
            r2 = r36
        L_0x0097:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r16 = r37
        L_0x00a1:
            r18 = 65536(0x10000, float:9.18355E-41)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00aa
            r18 = r41
            goto L_0x00ac
        L_0x00aa:
            r18 = r38
        L_0x00ac:
            r19 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r19
            if (r0 == 0) goto L_0x00b4
            r0 = 1
            goto L_0x00b6
        L_0x00b4:
            r0 = r39
        L_0x00b6:
            r21 = r20
            r22 = r1
            r23 = r3
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r8
            r29 = r9
            r30 = r10
            r31 = r11
            r32 = r12
            r34 = r14
            r35 = r15
            r36 = r17
            r37 = r2
            r38 = r16
            r39 = r18
            r40 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r35, r36, r37, r38, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.globalsearch.model.PaySearchInfoModel.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.String, int, double, java.lang.String, id.dana.domain.globalsearch.model.LatLng, java.lang.String, java.util.Map, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final List<String> getMcc() {
        return this.mcc;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getSubCategory() {
        return this.subCategory;
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

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getScore() {
        return this.score;
    }

    public final double getRating() {
        return this.rating;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final LatLng getLocation() {
        return this.location;
    }

    @NotNull
    public final String getInfoType() {
        return this.infoType;
    }

    @NotNull
    public final Map<String, Object> getInfo() {
        return this.info;
    }

    @Nullable
    public final String getDistance() {
        return this.distance;
    }

    @NotNull
    public final String getMccName() {
        return this.mccName;
    }

    public final void setMccName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mccName = str;
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    public final void setEnable(boolean z) {
        this.isEnable = z;
    }

    @Nullable
    public final String getShopName() {
        String str = this.category;
        int hashCode = str.hashCode();
        if (hashCode != 2178) {
            if (hashCode != 1016896708) {
                if (hashCode == 2014341056 && str.equals("DF_SKU")) {
                    return getDFShop();
                }
                return null;
            } else if (!str.equals("OFFLINE_MERCHANT")) {
                return null;
            }
        } else if (!str.equals("DF")) {
            return null;
        }
        return this.name;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        return r2.name;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        return o.setBridgeManifests.setMax(r2.info).getMerchantName();
     */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getMerchantName() {
        /*
            r2 = this;
            java.lang.String r0 = r2.category
            int r1 = r0.hashCode()
            switch(r1) {
                case -1592831339: goto L_0x0038;
                case -667013580: goto L_0x002f;
                case 2178: goto L_0x001c;
                case 1016896708: goto L_0x0013;
                case 2014341056: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0043
        L_0x000a:
            java.lang.String r1 = "DF_SKU"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            goto L_0x0024
        L_0x0013:
            java.lang.String r1 = "OFFLINE_MERCHANT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            goto L_0x0040
        L_0x001c:
            java.lang.String r1 = "DF"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
        L_0x0024:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.info
            id.dana.globalsearch.dfrestaurant.model.RestaurantInfoModel r0 = o.setBridgeManifests.setMax(r0)
            java.lang.String r0 = r0.getMerchantName()
            return r0
        L_0x002f:
            java.lang.String r1 = "ONLINE_MERCHANT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            goto L_0x0040
        L_0x0038:
            java.lang.String r1 = "SERVICE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
        L_0x0040:
            java.lang.String r0 = r2.name
            return r0
        L_0x0043:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.globalsearch.model.PaySearchInfoModel.getMerchantName():java.lang.String");
    }

    @Nullable
    public final String getMerchantCategory() {
        String str = this.category;
        int hashCode = str.hashCode();
        if (hashCode != 2178) {
            if (hashCode != 1016896708 || !str.equals("OFFLINE_MERCHANT")) {
                return null;
            }
        } else if (!str.equals("DF")) {
            return null;
        }
        return CollectionsKt.joinToString$default(this.mcc, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    @Nullable
    public final String getDishesName() {
        if (Intrinsics.areEqual((Object) this.category, (Object) "DF_SKU")) {
            return this.name;
        }
        return null;
    }

    @NotNull
    public final String getPayType() {
        Object obj = this.info.get("qris");
        if (obj == null) {
            obj = this.urlMap.get(HookConstants.HookAction.HOOK_ACTION_PAY);
        }
        return String.valueOf(obj);
    }

    @Nullable
    public final String getDisplayedShopLogo() {
        if (Intrinsics.areEqual((Object) this.category, (Object) "OFFLINE_MERCHANT")) {
            return this.urlMap.get("gSearchMerchantLogoUrl");
        }
        return this.logo;
    }

    private final String getDFShop() {
        String shopName = setBridgeManifests.setMax(this.info).getShopName();
        return shopName == null ? setBridgeManifests.setMax(this.info).getMerchantName() : shopName;
    }

    public final int hashCode() {
        String str = this.f9902id;
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
        LatLng latLng = this.location;
        int hashCode11 = (hashCode10 + (latLng != null ? latLng.hashCode() : 0)) * 31;
        String str9 = this.infoType;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Map<String, Object> map2 = this.info;
        int hashCode13 = (hashCode12 + (map2 != null ? map2.hashCode() : 0)) * 31;
        String str10 = this.distance;
        int hashCode14 = (hashCode13 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.mccName;
        if (str11 != null) {
            i = str11.hashCode();
        }
        int i2 = (hashCode14 + i) * 31;
        boolean z = this.isEnable;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }
}
