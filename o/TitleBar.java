package o;

import com.alibaba.fastjson.annotation.JSONCreator;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\bQ\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0002\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dJ\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0011HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0011HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010b\u001a\u00020\u0011HÆ\u0003J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0002\u0010k\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00112\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cHÆ\u0001J\u0013\u0010l\u001a\u00020\u00112\b\u0010m\u001a\u0004\u0018\u00010nHÖ\u0003J\t\u0010o\u001a\u00020pHÖ\u0001J\t\u0010q\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u0016\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001f\"\u0004\b;\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001f\"\u0004\b=\u0010!R\u001a\u0010\u001a\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010+\"\u0004\b?\u0010-R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001f\"\u0004\bA\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001f\"\u0004\bC\u0010!R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001f\"\u0004\bG\u0010!R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u001f\"\u0004\bQ\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u001f\"\u0004\bS\u0010!¨\u0006r"}, d2 = {"Lid/dana/data/homeinfo/model/ThirdPartyEntity;", "Ljava/io/Serializable;", "key", "", "action", "clientId", "appId", "icon", "link", "name", "nameInd", "nameTag", "operationType", "redirectUrl", "scopes", "userAction", "enable", "", "description", "buttonTitle", "keyword", "ribbonText", "hasRedDot", "spmId", "skuAttr", "Lid/dana/data/homeinfo/model/SkuAttributeEntity;", "needConsult", "spaceCodes", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lid/dana/data/homeinfo/model/SkuAttributeEntity;ZLjava/util/List;)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getAppId", "setAppId", "getButtonTitle", "setButtonTitle", "getClientId", "setClientId", "getDescription", "setDescription", "getEnable", "()Z", "setEnable", "(Z)V", "getHasRedDot", "setHasRedDot", "getIcon", "setIcon", "getKey", "setKey", "getKeyword", "setKeyword", "getLink", "setLink", "getName", "setName", "getNameInd", "setNameInd", "getNameTag", "setNameTag", "getNeedConsult", "setNeedConsult", "getOperationType", "setOperationType", "getRedirectUrl", "setRedirectUrl", "getRibbonText", "setRibbonText", "getScopes", "setScopes", "getSkuAttr", "()Lid/dana/data/homeinfo/model/SkuAttributeEntity;", "setSkuAttr", "(Lid/dana/data/homeinfo/model/SkuAttributeEntity;)V", "getSpaceCodes", "()Ljava/util/List;", "setSpaceCodes", "(Ljava/util/List;)V", "getSpmId", "setSpmId", "getUserAction", "setUserAction", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TitleBar implements Serializable {
    @Nullable
    String action;
    @Nullable
    String appId;
    @Nullable
    String buttonTitle;
    @Nullable
    String clientId;
    @Nullable
    String description;
    boolean enable;
    boolean hasRedDot;
    @Nullable
    String icon;
    @Nullable
    String key;
    @Nullable
    String keyword;
    @Nullable
    String link;
    @Nullable
    String name;
    @Nullable
    String nameInd;
    @Nullable
    String nameTag;
    boolean needConsult;
    @Nullable
    String operationType;
    @Nullable
    String redirectUrl;
    @Nullable
    String ribbonText;
    @Nullable
    String scopes;
    @Nullable
    inflateFromResource skuAttr;
    @Nullable
    List<String> spaceCodes;
    @Nullable
    String spmId;
    @Nullable
    String userAction;

    @JSONCreator
    public TitleBar() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, false, (String) null, (inflateFromResource) null, false, (List) null, 8388607, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TitleBar copy$default(TitleBar titleBar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, String str14, String str15, String str16, String str17, boolean z2, String str18, inflateFromResource inflatefromresource, boolean z3, List list, int i, Object obj) {
        TitleBar titleBar2 = titleBar;
        int i2 = i;
        return titleBar.copy((i2 & 1) != 0 ? titleBar2.key : str, (i2 & 2) != 0 ? titleBar2.action : str2, (i2 & 4) != 0 ? titleBar2.clientId : str3, (i2 & 8) != 0 ? titleBar2.appId : str4, (i2 & 16) != 0 ? titleBar2.icon : str5, (i2 & 32) != 0 ? titleBar2.link : str6, (i2 & 64) != 0 ? titleBar2.name : str7, (i2 & 128) != 0 ? titleBar2.nameInd : str8, (i2 & 256) != 0 ? titleBar2.nameTag : str9, (i2 & 512) != 0 ? titleBar2.operationType : str10, (i2 & 1024) != 0 ? titleBar2.redirectUrl : str11, (i2 & 2048) != 0 ? titleBar2.scopes : str12, (i2 & 4096) != 0 ? titleBar2.userAction : str13, (i2 & 8192) != 0 ? titleBar2.enable : z, (i2 & 16384) != 0 ? titleBar2.description : str14, (i2 & 32768) != 0 ? titleBar2.buttonTitle : str15, (i2 & 65536) != 0 ? titleBar2.keyword : str16, (i2 & 131072) != 0 ? titleBar2.ribbonText : str17, (i2 & 262144) != 0 ? titleBar2.hasRedDot : z2, (i2 & 524288) != 0 ? titleBar2.spmId : str18, (i2 & 1048576) != 0 ? titleBar2.skuAttr : inflatefromresource, (i2 & 2097152) != 0 ? titleBar2.needConsult : z3, (i2 & 4194304) != 0 ? titleBar2.spaceCodes : list);
    }

    @Nullable
    public final String component1() {
        return this.key;
    }

    @Nullable
    public final String component10() {
        return this.operationType;
    }

    @Nullable
    public final String component11() {
        return this.redirectUrl;
    }

    @Nullable
    public final String component12() {
        return this.scopes;
    }

    @Nullable
    public final String component13() {
        return this.userAction;
    }

    public final boolean component14() {
        return this.enable;
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
        return this.hasRedDot;
    }

    @Nullable
    public final String component2() {
        return this.action;
    }

    @Nullable
    public final String component20() {
        return this.spmId;
    }

    @Nullable
    public final inflateFromResource component21() {
        return this.skuAttr;
    }

    public final boolean component22() {
        return this.needConsult;
    }

    @Nullable
    public final List<String> component23() {
        return this.spaceCodes;
    }

    @Nullable
    public final String component3() {
        return this.clientId;
    }

    @Nullable
    public final String component4() {
        return this.appId;
    }

    @Nullable
    public final String component5() {
        return this.icon;
    }

    @Nullable
    public final String component6() {
        return this.link;
    }

    @Nullable
    public final String component7() {
        return this.name;
    }

    @Nullable
    public final String component8() {
        return this.nameInd;
    }

    @Nullable
    public final String component9() {
        return this.nameTag;
    }

    @NotNull
    public final TitleBar copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, boolean z, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, boolean z2, @Nullable String str18, @Nullable inflateFromResource inflatefromresource, boolean z3, @Nullable List<String> list) {
        return new TitleBar(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, z, str14, str15, str16, str17, z2, str18, inflatefromresource, z3, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleBar)) {
            return false;
        }
        TitleBar titleBar = (TitleBar) obj;
        return Intrinsics.areEqual((Object) this.key, (Object) titleBar.key) && Intrinsics.areEqual((Object) this.action, (Object) titleBar.action) && Intrinsics.areEqual((Object) this.clientId, (Object) titleBar.clientId) && Intrinsics.areEqual((Object) this.appId, (Object) titleBar.appId) && Intrinsics.areEqual((Object) this.icon, (Object) titleBar.icon) && Intrinsics.areEqual((Object) this.link, (Object) titleBar.link) && Intrinsics.areEqual((Object) this.name, (Object) titleBar.name) && Intrinsics.areEqual((Object) this.nameInd, (Object) titleBar.nameInd) && Intrinsics.areEqual((Object) this.nameTag, (Object) titleBar.nameTag) && Intrinsics.areEqual((Object) this.operationType, (Object) titleBar.operationType) && Intrinsics.areEqual((Object) this.redirectUrl, (Object) titleBar.redirectUrl) && Intrinsics.areEqual((Object) this.scopes, (Object) titleBar.scopes) && Intrinsics.areEqual((Object) this.userAction, (Object) titleBar.userAction) && this.enable == titleBar.enable && Intrinsics.areEqual((Object) this.description, (Object) titleBar.description) && Intrinsics.areEqual((Object) this.buttonTitle, (Object) titleBar.buttonTitle) && Intrinsics.areEqual((Object) this.keyword, (Object) titleBar.keyword) && Intrinsics.areEqual((Object) this.ribbonText, (Object) titleBar.ribbonText) && this.hasRedDot == titleBar.hasRedDot && Intrinsics.areEqual((Object) this.spmId, (Object) titleBar.spmId) && Intrinsics.areEqual((Object) this.skuAttr, (Object) titleBar.skuAttr) && this.needConsult == titleBar.needConsult && Intrinsics.areEqual((Object) this.spaceCodes, (Object) titleBar.spaceCodes);
    }

    public final int hashCode() {
        String str = this.key;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.action;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.clientId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.appId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.icon;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.link;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.name;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.nameInd;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.nameTag;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.operationType;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.redirectUrl;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.scopes;
        int hashCode12 = (hashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.userAction;
        int hashCode13 = (hashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31;
        boolean z = this.enable;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode13 + (z ? 1 : 0)) * 31;
        String str14 = this.description;
        int hashCode14 = (i2 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.buttonTitle;
        int hashCode15 = (hashCode14 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.keyword;
        int hashCode16 = (hashCode15 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.ribbonText;
        int hashCode17 = (hashCode16 + (str17 != null ? str17.hashCode() : 0)) * 31;
        boolean z3 = this.hasRedDot;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode17 + (z3 ? 1 : 0)) * 31;
        String str18 = this.spmId;
        int hashCode18 = (i3 + (str18 != null ? str18.hashCode() : 0)) * 31;
        inflateFromResource inflatefromresource = this.skuAttr;
        int hashCode19 = (hashCode18 + (inflatefromresource != null ? inflatefromresource.hashCode() : 0)) * 31;
        boolean z4 = this.needConsult;
        if (!z4) {
            z2 = z4;
        }
        int i4 = (hashCode19 + (z2 ? 1 : 0)) * 31;
        List<String> list = this.spaceCodes;
        if (list != null) {
            i = list.hashCode();
        }
        return i4 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ThirdPartyEntity(key=");
        sb.append(this.key);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", clientId=");
        sb.append(this.clientId);
        sb.append(", appId=");
        sb.append(this.appId);
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
        sb.append(", enable=");
        sb.append(this.enable);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", buttonTitle=");
        sb.append(this.buttonTitle);
        sb.append(", keyword=");
        sb.append(this.keyword);
        sb.append(", ribbonText=");
        sb.append(this.ribbonText);
        sb.append(", hasRedDot=");
        sb.append(this.hasRedDot);
        sb.append(", spmId=");
        sb.append(this.spmId);
        sb.append(", skuAttr=");
        sb.append(this.skuAttr);
        sb.append(", needConsult=");
        sb.append(this.needConsult);
        sb.append(", spaceCodes=");
        sb.append(this.spaceCodes);
        sb.append(")");
        return sb.toString();
    }

    @JSONCreator
    public TitleBar(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, boolean z, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, boolean z2, @Nullable String str18, @Nullable inflateFromResource inflatefromresource, boolean z3, @Nullable List<String> list) {
        this.key = str;
        this.action = str2;
        this.clientId = str3;
        this.appId = str4;
        this.icon = str5;
        this.link = str6;
        this.name = str7;
        this.nameInd = str8;
        this.nameTag = str9;
        this.operationType = str10;
        this.redirectUrl = str11;
        this.scopes = str12;
        this.userAction = str13;
        this.enable = z;
        this.description = str14;
        this.buttonTitle = str15;
        this.keyword = str16;
        this.ribbonText = str17;
        this.hasRedDot = z2;
        this.spmId = str18;
        this.skuAttr = inflatefromresource;
        this.needConsult = z3;
        this.spaceCodes = list;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    public final void setKey(@Nullable String str) {
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

    public final boolean getEnable() {
        return this.enable;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
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

    public final boolean getHasRedDot() {
        return this.hasRedDot;
    }

    public final void setHasRedDot(boolean z) {
        this.hasRedDot = z;
    }

    @Nullable
    public final String getSpmId() {
        return this.spmId;
    }

    public final void setSpmId(@Nullable String str) {
        this.spmId = str;
    }

    @Nullable
    public final inflateFromResource getSkuAttr() {
        return this.skuAttr;
    }

    public final void setSkuAttr(@Nullable inflateFromResource inflatefromresource) {
        this.skuAttr = inflatefromresource;
    }

    public final boolean getNeedConsult() {
        return this.needConsult;
    }

    public final void setNeedConsult(boolean z) {
        this.needConsult = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TitleBar(java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, boolean r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, boolean r43, java.lang.String r44, o.inflateFromResource r45, boolean r46, java.util.List r47, int r48, kotlin.jvm.internal.DefaultConstructorMarker r49) {
        /*
            r24 = this;
            r0 = r48
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r25
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r26
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r27
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r28
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r29
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r30
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r31
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r32
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r33
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r34
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r35
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r36
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r37
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            r16 = 0
            if (r15 == 0) goto L_0x0072
            r15 = 0
            goto L_0x0074
        L_0x0072:
            r15 = r38
        L_0x0074:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x007a
            r2 = 0
            goto L_0x007c
        L_0x007a:
            r2 = r39
        L_0x007c:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0086
            r17 = 0
            goto L_0x0088
        L_0x0086:
            r17 = r40
        L_0x0088:
            r18 = 65536(0x10000, float:9.18355E-41)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x0091
            r18 = 0
            goto L_0x0093
        L_0x0091:
            r18 = r41
        L_0x0093:
            r19 = 131072(0x20000, float:1.83671E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x009c
            r19 = 0
            goto L_0x009e
        L_0x009c:
            r19 = r42
        L_0x009e:
            r20 = 262144(0x40000, float:3.67342E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00a7
            r20 = 0
            goto L_0x00a9
        L_0x00a7:
            r20 = r43
        L_0x00a9:
            r21 = 524288(0x80000, float:7.34684E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00b2
            r21 = 0
            goto L_0x00b4
        L_0x00b2:
            r21 = r44
        L_0x00b4:
            r22 = 1048576(0x100000, float:1.469368E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00bd
            r22 = 0
            goto L_0x00bf
        L_0x00bd:
            r22 = r45
        L_0x00bf:
            r23 = 2097152(0x200000, float:2.938736E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r16 = r46
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r23
            if (r0 == 0) goto L_0x00d0
            r0 = 0
            goto L_0x00d2
        L_0x00d0:
            r0 = r47
        L_0x00d2:
            r25 = r24
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r5
            r30 = r6
            r31 = r7
            r32 = r8
            r33 = r9
            r34 = r10
            r35 = r11
            r36 = r12
            r37 = r13
            r38 = r14
            r39 = r15
            r40 = r2
            r41 = r17
            r42 = r18
            r43 = r19
            r44 = r20
            r45 = r21
            r46 = r22
            r47 = r16
            r48 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TitleBar.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, o.inflateFromResource, boolean, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final List<String> getSpaceCodes() {
        return this.spaceCodes;
    }

    public final void setSpaceCodes(@Nullable List<String> list) {
        this.spaceCodes = list;
    }
}
