package id.dana.domain.homeinfo;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverInnerAmcsLiteConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\bV\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001vB£\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010X\u001a\u00020\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010b\u001a\u00020\bHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010e\u001a\u00020\bHÆ\u0003J\u0011\u0010f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001bHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010k\u001a\u00020\bHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J§\u0002\u0010p\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\b2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010q\u001a\u00020\b2\b\u0010r\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010s\u001a\u00020tH\u0016J\t\u0010u\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0016\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010.\"\u0004\b1\u00100R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010!\"\u0004\b3\u0010#R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010!\"\u0004\b5\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010!\"\u0004\b7\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010!\"\u0004\b9\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010!\"\u0004\b;\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010!\"\u0004\b=\u0010#R\u001a\u0010\u0019\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010.\"\u0004\b?\u00100R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010!\"\u0004\bA\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010!\"\u0004\bC\u0010#R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010!\"\u0004\bE\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010!\"\u0004\bG\u0010#R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010!\"\u0004\bM\u0010#R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010!\"\u0004\bW\u0010#¨\u0006w"}, d2 = {"Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "", "key", "", "action", "clientId", "appId", "isEnable", "", "icon", "link", "name", "nameInd", "nameTag", "operationType", "redirectUrl", "scopes", "userAction", "description", "buttonTitle", "keyword", "ribbonText", "isHasRedDot", "spmId", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse$SpmId;", "needConsult", "spaceCodes", "", "skuAttr", "Lid/dana/domain/homeinfo/SkuAttribute;", "skuConfigId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLid/dana/domain/homeinfo/ThirdPartyServiceResponse$SpmId;ZLjava/util/List;Lid/dana/domain/homeinfo/SkuAttribute;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getAppId", "setAppId", "getButtonTitle", "setButtonTitle", "getClientId", "setClientId", "getDescription", "setDescription", "getIcon", "setIcon", "()Z", "setEnable", "(Z)V", "setHasRedDot", "getKey", "setKey", "getKeyword", "setKeyword", "getLink", "setLink", "getName", "setName", "getNameInd", "setNameInd", "getNameTag", "setNameTag", "getNeedConsult", "setNeedConsult", "getOperationType", "setOperationType", "getRedirectUrl", "setRedirectUrl", "getRibbonText", "setRibbonText", "getScopes", "setScopes", "getSkuAttr", "()Lid/dana/domain/homeinfo/SkuAttribute;", "setSkuAttr", "(Lid/dana/domain/homeinfo/SkuAttribute;)V", "getSkuConfigId", "setSkuConfigId", "getSpaceCodes", "()Ljava/util/List;", "setSpaceCodes", "(Ljava/util/List;)V", "getSpmId", "()Lid/dana/domain/homeinfo/ThirdPartyServiceResponse$SpmId;", "setSpmId", "(Lid/dana/domain/homeinfo/ThirdPartyServiceResponse$SpmId;)V", "getUserAction", "setUserAction", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "SpmId", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class ThirdPartyServiceResponse {
    @Nullable
    private String action;
    @Nullable
    private String appId;
    @Nullable
    private String buttonTitle;
    @Nullable
    private String clientId;
    @Nullable
    private String description;
    @Nullable
    private String icon;
    private boolean isEnable;
    private boolean isHasRedDot;
    @NotNull
    private String key;
    @Nullable
    private String keyword;
    @Nullable
    private String link;
    @Nullable
    private String name;
    @Nullable
    private String nameInd;
    @Nullable
    private String nameTag;
    private boolean needConsult;
    @Nullable
    private String operationType;
    @Nullable
    private String redirectUrl;
    @Nullable
    private String ribbonText;
    @Nullable
    private String scopes;
    @Nullable
    private GriverInnerAmcsLiteConfig skuAttr;
    @Nullable
    private String skuConfigId;
    @Nullable
    private List<String> spaceCodes;
    @Nullable
    private SpmId spmId;
    @Nullable
    private String userAction;

    public ThirdPartyServiceResponse() {
        this((String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (SpmId) null, false, (List) null, (GriverInnerAmcsLiteConfig) null, (String) null, FlexItem.MAX_SIZE, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ThirdPartyServiceResponse copy$default(ThirdPartyServiceResponse thirdPartyServiceResponse, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z2, SpmId spmId2, boolean z3, List list, GriverInnerAmcsLiteConfig griverInnerAmcsLiteConfig, String str18, int i, Object obj) {
        ThirdPartyServiceResponse thirdPartyServiceResponse2 = thirdPartyServiceResponse;
        int i2 = i;
        return thirdPartyServiceResponse.copy((i2 & 1) != 0 ? thirdPartyServiceResponse2.key : str, (i2 & 2) != 0 ? thirdPartyServiceResponse2.action : str2, (i2 & 4) != 0 ? thirdPartyServiceResponse2.clientId : str3, (i2 & 8) != 0 ? thirdPartyServiceResponse2.appId : str4, (i2 & 16) != 0 ? thirdPartyServiceResponse2.isEnable : z, (i2 & 32) != 0 ? thirdPartyServiceResponse2.icon : str5, (i2 & 64) != 0 ? thirdPartyServiceResponse2.link : str6, (i2 & 128) != 0 ? thirdPartyServiceResponse2.name : str7, (i2 & 256) != 0 ? thirdPartyServiceResponse2.nameInd : str8, (i2 & 512) != 0 ? thirdPartyServiceResponse2.nameTag : str9, (i2 & 1024) != 0 ? thirdPartyServiceResponse2.operationType : str10, (i2 & 2048) != 0 ? thirdPartyServiceResponse2.redirectUrl : str11, (i2 & 4096) != 0 ? thirdPartyServiceResponse2.scopes : str12, (i2 & 8192) != 0 ? thirdPartyServiceResponse2.userAction : str13, (i2 & 16384) != 0 ? thirdPartyServiceResponse2.description : str14, (i2 & 32768) != 0 ? thirdPartyServiceResponse2.buttonTitle : str15, (i2 & 65536) != 0 ? thirdPartyServiceResponse2.keyword : str16, (i2 & 131072) != 0 ? thirdPartyServiceResponse2.ribbonText : str17, (i2 & 262144) != 0 ? thirdPartyServiceResponse2.isHasRedDot : z2, (i2 & 524288) != 0 ? thirdPartyServiceResponse2.spmId : spmId2, (i2 & 1048576) != 0 ? thirdPartyServiceResponse2.needConsult : z3, (i2 & 2097152) != 0 ? thirdPartyServiceResponse2.spaceCodes : list, (i2 & 4194304) != 0 ? thirdPartyServiceResponse2.skuAttr : griverInnerAmcsLiteConfig, (i2 & 8388608) != 0 ? thirdPartyServiceResponse2.skuConfigId : str18);
    }

    @NotNull
    public final String component1() {
        return this.key;
    }

    @Nullable
    public final String component10() {
        return this.nameTag;
    }

    @Nullable
    public final String component11() {
        return this.operationType;
    }

    @Nullable
    public final String component12() {
        return this.redirectUrl;
    }

    @Nullable
    public final String component13() {
        return this.scopes;
    }

    @Nullable
    public final String component14() {
        return this.userAction;
    }

    @Nullable
    public final String component15() {
        return this.description;
    }

    @Nullable
    public final String component16() {
        return this.buttonTitle;
    }

    @Nullable
    public final String component17() {
        return this.keyword;
    }

    @Nullable
    public final String component18() {
        return this.ribbonText;
    }

    public final boolean component19() {
        return this.isHasRedDot;
    }

    @Nullable
    public final String component2() {
        return this.action;
    }

    @Nullable
    public final SpmId component20() {
        return this.spmId;
    }

    public final boolean component21() {
        return this.needConsult;
    }

    @Nullable
    public final List<String> component22() {
        return this.spaceCodes;
    }

    @Nullable
    public final GriverInnerAmcsLiteConfig component23() {
        return this.skuAttr;
    }

    @Nullable
    public final String component24() {
        return this.skuConfigId;
    }

    @Nullable
    public final String component3() {
        return this.clientId;
    }

    @Nullable
    public final String component4() {
        return this.appId;
    }

    public final boolean component5() {
        return this.isEnable;
    }

    @Nullable
    public final String component6() {
        return this.icon;
    }

    @Nullable
    public final String component7() {
        return this.link;
    }

    @Nullable
    public final String component8() {
        return this.name;
    }

    @Nullable
    public final String component9() {
        return this.nameInd;
    }

    @NotNull
    public final ThirdPartyServiceResponse copy(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, boolean z2, @Nullable SpmId spmId2, boolean z3, @Nullable List<String> list, @Nullable GriverInnerAmcsLiteConfig griverInnerAmcsLiteConfig, @Nullable String str18) {
        String str19 = str;
        String str20 = str19;
        Intrinsics.checkNotNullParameter(str19, "key");
        return new ThirdPartyServiceResponse(str19, str2, str3, str4, z, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, z2, spmId2, z3, list, griverInnerAmcsLiteConfig, str18);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ThirdPartyServiceResponse(key=");
        sb.append(this.key);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", clientId=");
        sb.append(this.clientId);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", isEnable=");
        sb.append(this.isEnable);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", nameInd=");
        sb.append(this.nameInd);
        sb.append(", nameTag=");
        sb.append(this.nameTag);
        sb.append(", operationType=");
        sb.append(this.operationType);
        sb.append(", redirectUrl=");
        sb.append(this.redirectUrl);
        sb.append(", scopes=");
        sb.append(this.scopes);
        sb.append(", userAction=");
        sb.append(this.userAction);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", buttonTitle=");
        sb.append(this.buttonTitle);
        sb.append(", keyword=");
        sb.append(this.keyword);
        sb.append(", ribbonText=");
        sb.append(this.ribbonText);
        sb.append(", isHasRedDot=");
        sb.append(this.isHasRedDot);
        sb.append(", spmId=");
        sb.append(this.spmId);
        sb.append(", needConsult=");
        sb.append(this.needConsult);
        sb.append(", spaceCodes=");
        sb.append(this.spaceCodes);
        sb.append(", skuAttr=");
        sb.append(this.skuAttr);
        sb.append(", skuConfigId=");
        sb.append(this.skuConfigId);
        sb.append(")");
        return sb.toString();
    }

    public ThirdPartyServiceResponse(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, boolean z2, @Nullable SpmId spmId2, boolean z3, @Nullable List<String> list, @Nullable GriverInnerAmcsLiteConfig griverInnerAmcsLiteConfig, @Nullable String str18) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.key = str;
        this.action = str2;
        this.clientId = str3;
        this.appId = str4;
        this.isEnable = z;
        this.icon = str5;
        this.link = str6;
        this.name = str7;
        this.nameInd = str8;
        this.nameTag = str9;
        this.operationType = str10;
        this.redirectUrl = str11;
        this.scopes = str12;
        this.userAction = str13;
        this.description = str14;
        this.buttonTitle = str15;
        this.keyword = str16;
        this.ribbonText = str17;
        this.isHasRedDot = z2;
        this.spmId = spmId2;
        this.needConsult = z3;
        this.spaceCodes = list;
        this.skuAttr = griverInnerAmcsLiteConfig;
        this.skuConfigId = str18;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final void setKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.key = str;
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    public final void setAction(@Nullable String str) {
        this.action = str;
    }

    @Nullable
    public final String getClientId() {
        return this.clientId;
    }

    public final void setClientId(@Nullable String str) {
        this.clientId = str;
    }

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    public final void setAppId(@Nullable String str) {
        this.appId = str;
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    public final void setEnable(boolean z) {
        this.isEnable = z;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    @Nullable
    public final String getNameInd() {
        return this.nameInd;
    }

    public final void setNameInd(@Nullable String str) {
        this.nameInd = str;
    }

    @Nullable
    public final String getNameTag() {
        return this.nameTag;
    }

    public final void setNameTag(@Nullable String str) {
        this.nameTag = str;
    }

    @Nullable
    public final String getOperationType() {
        return this.operationType;
    }

    public final void setOperationType(@Nullable String str) {
        this.operationType = str;
    }

    @Nullable
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final void setRedirectUrl(@Nullable String str) {
        this.redirectUrl = str;
    }

    @Nullable
    public final String getScopes() {
        return this.scopes;
    }

    public final void setScopes(@Nullable String str) {
        this.scopes = str;
    }

    @Nullable
    public final String getUserAction() {
        return this.userAction;
    }

    public final void setUserAction(@Nullable String str) {
        this.userAction = str;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    @Nullable
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final void setButtonTitle(@Nullable String str) {
        this.buttonTitle = str;
    }

    @Nullable
    public final String getKeyword() {
        return this.keyword;
    }

    public final void setKeyword(@Nullable String str) {
        this.keyword = str;
    }

    @Nullable
    public final String getRibbonText() {
        return this.ribbonText;
    }

    public final void setRibbonText(@Nullable String str) {
        this.ribbonText = str;
    }

    public final boolean isHasRedDot() {
        return this.isHasRedDot;
    }

    public final void setHasRedDot(boolean z) {
        this.isHasRedDot = z;
    }

    @Nullable
    public final SpmId getSpmId() {
        return this.spmId;
    }

    public final void setSpmId(@Nullable SpmId spmId2) {
        this.spmId = spmId2;
    }

    public final boolean getNeedConsult() {
        return this.needConsult;
    }

    public final void setNeedConsult(boolean z) {
        this.needConsult = z;
    }

    @Nullable
    public final List<String> getSpaceCodes() {
        return this.spaceCodes;
    }

    public final void setSpaceCodes(@Nullable List<String> list) {
        this.spaceCodes = list;
    }

    @Nullable
    public final GriverInnerAmcsLiteConfig getSkuAttr() {
        return this.skuAttr;
    }

    public final void setSkuAttr(@Nullable GriverInnerAmcsLiteConfig griverInnerAmcsLiteConfig) {
        this.skuAttr = griverInnerAmcsLiteConfig;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ThirdPartyServiceResponse(java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, boolean r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, boolean r44, id.dana.domain.homeinfo.ThirdPartyServiceResponse.SpmId r45, boolean r46, java.util.List r47, o.GriverInnerAmcsLiteConfig r48, java.lang.String r49, int r50, kotlin.jvm.internal.DefaultConstructorMarker r51) {
        /*
            r25 = this;
            r0 = r50
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = ""
            goto L_0x000b
        L_0x0009:
            r1 = r26
        L_0x000b:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0011
            r2 = 0
            goto L_0x0013
        L_0x0011:
            r2 = r27
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = 0
            goto L_0x001b
        L_0x0019:
            r4 = r28
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = 0
            goto L_0x0023
        L_0x0021:
            r5 = r29
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = 0
            goto L_0x002b
        L_0x0029:
            r6 = r30
        L_0x002b:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0031
            r8 = 0
            goto L_0x0033
        L_0x0031:
            r8 = r31
        L_0x0033:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0039
            r9 = 0
            goto L_0x003b
        L_0x0039:
            r9 = r32
        L_0x003b:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0041
            r10 = 0
            goto L_0x0043
        L_0x0041:
            r10 = r33
        L_0x0043:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0049
            r11 = 0
            goto L_0x004b
        L_0x0049:
            r11 = r34
        L_0x004b:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0051
            r12 = 0
            goto L_0x0053
        L_0x0051:
            r12 = r35
        L_0x0053:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0059
            r13 = 0
            goto L_0x005b
        L_0x0059:
            r13 = r36
        L_0x005b:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0061
            r14 = 0
            goto L_0x0063
        L_0x0061:
            r14 = r37
        L_0x0063:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0069
            r15 = 0
            goto L_0x006b
        L_0x0069:
            r15 = r38
        L_0x006b:
            r3 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0071
            r3 = 0
            goto L_0x0073
        L_0x0071:
            r3 = r39
        L_0x0073:
            r7 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r7 == 0) goto L_0x0079
            r7 = 0
            goto L_0x007b
        L_0x0079:
            r7 = r40
        L_0x007b:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0085
            r16 = 0
            goto L_0x0087
        L_0x0085:
            r16 = r41
        L_0x0087:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0090
            r17 = 0
            goto L_0x0092
        L_0x0090:
            r17 = r42
        L_0x0092:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009b
            r18 = 0
            goto L_0x009d
        L_0x009b:
            r18 = r43
        L_0x009d:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a6
            r19 = 0
            goto L_0x00a8
        L_0x00a6:
            r19 = r44
        L_0x00a8:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b1
            r20 = 0
            goto L_0x00b3
        L_0x00b1:
            r20 = r45
        L_0x00b3:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bc
            r21 = 0
            goto L_0x00be
        L_0x00bc:
            r21 = r46
        L_0x00be:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c7
            r22 = 0
            goto L_0x00c9
        L_0x00c7:
            r22 = r47
        L_0x00c9:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d2
            r23 = 0
            goto L_0x00d4
        L_0x00d2:
            r23 = r48
        L_0x00d4:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r24
            if (r0 == 0) goto L_0x00dc
            r0 = 0
            goto L_0x00de
        L_0x00dc:
            r0 = r49
        L_0x00de:
            r26 = r25
            r27 = r1
            r28 = r2
            r29 = r4
            r30 = r5
            r31 = r6
            r32 = r8
            r33 = r9
            r34 = r10
            r35 = r11
            r36 = r12
            r37 = r13
            r38 = r14
            r39 = r15
            r40 = r3
            r41 = r7
            r42 = r16
            r43 = r17
            r44 = r18
            r45 = r19
            r46 = r20
            r47 = r21
            r48 = r22
            r49 = r23
            r50 = r0
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.domain.homeinfo.ThirdPartyServiceResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, id.dana.domain.homeinfo.ThirdPartyServiceResponse$SpmId, boolean, java.util.List, o.GriverInnerAmcsLiteConfig, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final String getSkuConfigId() {
        return this.skuConfigId;
    }

    public final void setSkuConfigId(@Nullable String str) {
        this.skuConfigId = str;
    }

    public final int hashCode() {
        return this.key.hashCode();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof ThirdPartyServiceResponse) && Intrinsics.areEqual((Object) this.key, (Object) ((ThirdPartyServiceResponse) obj).key);
        }
        return true;
    }

    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lid/dana/domain/homeinfo/ThirdPartyServiceResponse$SpmId;", "", "home", "", "all", "(Ljava/lang/String;Ljava/lang/String;)V", "getAll", "()Ljava/lang/String;", "setAll", "(Ljava/lang/String;)V", "getHome", "setHome", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class SpmId {
        @Nullable
        private String all;
        @Nullable
        private String home;

        public SpmId() {
            this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ SpmId copy$default(SpmId spmId, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = spmId.home;
            }
            if ((i & 2) != 0) {
                str2 = spmId.all;
            }
            return spmId.copy(str, str2);
        }

        @Nullable
        public final String component1() {
            return this.home;
        }

        @Nullable
        public final String component2() {
            return this.all;
        }

        @NotNull
        public final SpmId copy(@Nullable String str, @Nullable String str2) {
            return new SpmId(str, str2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpmId)) {
                return false;
            }
            SpmId spmId = (SpmId) obj;
            return Intrinsics.areEqual((Object) this.home, (Object) spmId.home) && Intrinsics.areEqual((Object) this.all, (Object) spmId.all);
        }

        public final int hashCode() {
            String str = this.home;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.all;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("SpmId(home=");
            sb.append(this.home);
            sb.append(", all=");
            sb.append(this.all);
            sb.append(")");
            return sb.toString();
        }

        public SpmId(@Nullable String str, @Nullable String str2) {
            this.home = str;
            this.all = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SpmId(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        @Nullable
        public final String getAll() {
            return this.all;
        }

        @Nullable
        public final String getHome() {
            return this.home;
        }

        public final void setAll(@Nullable String str) {
            this.all = str;
        }

        public final void setHome(@Nullable String str) {
            this.home = str;
        }
    }
}
