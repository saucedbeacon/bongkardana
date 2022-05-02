package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0011J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003J«\u0001\u00102\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0013¨\u00069"}, d2 = {"Lid/dana/domain/homeinfo/SkuAttribute;", "", "serviceKey", "", "", "prepaidKey", "postpaidKey", "backgroundColor", "title", "icon", "buttonDescription", "serviceName", "productBizId", "Lid/dana/domain/globalsearch/model/ProductBizId;", "key", "link", "appId", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/globalsearch/model/ProductBizId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "getBackgroundColor", "getButtonDescription", "getIcon", "getKey", "setKey", "getLink", "getPostpaidKey", "()Ljava/util/List;", "getPrepaidKey", "getProductBizId", "()Lid/dana/domain/globalsearch/model/ProductBizId;", "setProductBizId", "(Lid/dana/domain/globalsearch/model/ProductBizId;)V", "getServiceKey", "getServiceName", "getTitle", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverInnerAmcsLiteConfig {
    @Nullable
    private String appId;
    @Nullable
    private final String backgroundColor;
    @Nullable
    private final String buttonDescription;
    @Nullable
    private final String icon;
    @Nullable
    private String key;
    @Nullable
    private final String link;
    @Nullable
    private final List<String> postpaidKey;
    @Nullable
    private final List<String> prepaidKey;
    @Nullable
    private performRequest productBizId;
    @Nullable
    private final List<String> serviceKey;
    @Nullable
    private final String serviceName;
    @Nullable
    private final String title;

    public GriverInnerAmcsLiteConfig() {
        this((List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (performRequest) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GriverInnerAmcsLiteConfig copy$default(GriverInnerAmcsLiteConfig griverInnerAmcsLiteConfig, List list, List list2, List list3, String str, String str2, String str3, String str4, String str5, performRequest performrequest, String str6, String str7, String str8, int i, Object obj) {
        GriverInnerAmcsLiteConfig griverInnerAmcsLiteConfig2 = griverInnerAmcsLiteConfig;
        int i2 = i;
        return griverInnerAmcsLiteConfig.copy((i2 & 1) != 0 ? griverInnerAmcsLiteConfig2.serviceKey : list, (i2 & 2) != 0 ? griverInnerAmcsLiteConfig2.prepaidKey : list2, (i2 & 4) != 0 ? griverInnerAmcsLiteConfig2.postpaidKey : list3, (i2 & 8) != 0 ? griverInnerAmcsLiteConfig2.backgroundColor : str, (i2 & 16) != 0 ? griverInnerAmcsLiteConfig2.title : str2, (i2 & 32) != 0 ? griverInnerAmcsLiteConfig2.icon : str3, (i2 & 64) != 0 ? griverInnerAmcsLiteConfig2.buttonDescription : str4, (i2 & 128) != 0 ? griverInnerAmcsLiteConfig2.serviceName : str5, (i2 & 256) != 0 ? griverInnerAmcsLiteConfig2.productBizId : performrequest, (i2 & 512) != 0 ? griverInnerAmcsLiteConfig2.key : str6, (i2 & 1024) != 0 ? griverInnerAmcsLiteConfig2.link : str7, (i2 & 2048) != 0 ? griverInnerAmcsLiteConfig2.appId : str8);
    }

    @Nullable
    public final List<String> component1() {
        return this.serviceKey;
    }

    @Nullable
    public final String component10() {
        return this.key;
    }

    @Nullable
    public final String component11() {
        return this.link;
    }

    @Nullable
    public final String component12() {
        return this.appId;
    }

    @Nullable
    public final List<String> component2() {
        return this.prepaidKey;
    }

    @Nullable
    public final List<String> component3() {
        return this.postpaidKey;
    }

    @Nullable
    public final String component4() {
        return this.backgroundColor;
    }

    @Nullable
    public final String component5() {
        return this.title;
    }

    @Nullable
    public final String component6() {
        return this.icon;
    }

    @Nullable
    public final String component7() {
        return this.buttonDescription;
    }

    @Nullable
    public final String component8() {
        return this.serviceName;
    }

    @Nullable
    public final performRequest component9() {
        return this.productBizId;
    }

    @NotNull
    public final GriverInnerAmcsLiteConfig copy(@Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable performRequest performrequest, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        return new GriverInnerAmcsLiteConfig(list, list2, list3, str, str2, str3, str4, str5, performrequest, str6, str7, str8);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverInnerAmcsLiteConfig)) {
            return false;
        }
        GriverInnerAmcsLiteConfig griverInnerAmcsLiteConfig = (GriverInnerAmcsLiteConfig) obj;
        return Intrinsics.areEqual((Object) this.serviceKey, (Object) griverInnerAmcsLiteConfig.serviceKey) && Intrinsics.areEqual((Object) this.prepaidKey, (Object) griverInnerAmcsLiteConfig.prepaidKey) && Intrinsics.areEqual((Object) this.postpaidKey, (Object) griverInnerAmcsLiteConfig.postpaidKey) && Intrinsics.areEqual((Object) this.backgroundColor, (Object) griverInnerAmcsLiteConfig.backgroundColor) && Intrinsics.areEqual((Object) this.title, (Object) griverInnerAmcsLiteConfig.title) && Intrinsics.areEqual((Object) this.icon, (Object) griverInnerAmcsLiteConfig.icon) && Intrinsics.areEqual((Object) this.buttonDescription, (Object) griverInnerAmcsLiteConfig.buttonDescription) && Intrinsics.areEqual((Object) this.serviceName, (Object) griverInnerAmcsLiteConfig.serviceName) && Intrinsics.areEqual((Object) this.productBizId, (Object) griverInnerAmcsLiteConfig.productBizId) && Intrinsics.areEqual((Object) this.key, (Object) griverInnerAmcsLiteConfig.key) && Intrinsics.areEqual((Object) this.link, (Object) griverInnerAmcsLiteConfig.link) && Intrinsics.areEqual((Object) this.appId, (Object) griverInnerAmcsLiteConfig.appId);
    }

    public final int hashCode() {
        List<String> list = this.serviceKey;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.prepaidKey;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.postpaidKey;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.title;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.icon;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.buttonDescription;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.serviceName;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        performRequest performrequest = this.productBizId;
        int hashCode9 = (hashCode8 + (performrequest != null ? performrequest.hashCode() : 0)) * 31;
        String str6 = this.key;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.link;
        int hashCode11 = (hashCode10 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.appId;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode11 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SkuAttribute(serviceKey=");
        sb.append(this.serviceKey);
        sb.append(", prepaidKey=");
        sb.append(this.prepaidKey);
        sb.append(", postpaidKey=");
        sb.append(this.postpaidKey);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", buttonDescription=");
        sb.append(this.buttonDescription);
        sb.append(", serviceName=");
        sb.append(this.serviceName);
        sb.append(", productBizId=");
        sb.append(this.productBizId);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(")");
        return sb.toString();
    }

    public GriverInnerAmcsLiteConfig(@Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable performRequest performrequest, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.serviceKey = list;
        this.prepaidKey = list2;
        this.postpaidKey = list3;
        this.backgroundColor = str;
        this.title = str2;
        this.icon = str3;
        this.buttonDescription = str4;
        this.serviceName = str5;
        this.productBizId = performrequest;
        this.key = str6;
        this.link = str7;
        this.appId = str8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GriverInnerAmcsLiteConfig(java.util.List r14, java.util.List r15, java.util.List r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, o.performRequest r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000b
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x000c
        L_0x000b:
            r1 = r14
        L_0x000c:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0015
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0016
        L_0x0015:
            r2 = r15
        L_0x0016:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x001f
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0021
        L_0x001f:
            r3 = r16
        L_0x0021:
            r4 = r0 & 8
            r5 = 0
            if (r4 == 0) goto L_0x0028
            r4 = r5
            goto L_0x002a
        L_0x0028:
            r4 = r17
        L_0x002a:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0030
            r6 = r5
            goto L_0x0032
        L_0x0030:
            r6 = r18
        L_0x0032:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0038
            r7 = r5
            goto L_0x003a
        L_0x0038:
            r7 = r19
        L_0x003a:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0040
            r8 = r5
            goto L_0x0042
        L_0x0040:
            r8 = r20
        L_0x0042:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0048
            r9 = r5
            goto L_0x004a
        L_0x0048:
            r9 = r21
        L_0x004a:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0050
            r10 = r5
            goto L_0x0052
        L_0x0050:
            r10 = r22
        L_0x0052:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0058
            r11 = r5
            goto L_0x005a
        L_0x0058:
            r11 = r23
        L_0x005a:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0060
            r12 = r5
            goto L_0x0062
        L_0x0060:
            r12 = r24
        L_0x0062:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r5 = r25
        L_0x0069:
            r14 = r13
            r15 = r1
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GriverInnerAmcsLiteConfig.<init>(java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.performRequest, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final List<String> getServiceKey() {
        return this.serviceKey;
    }

    @Nullable
    public final List<String> getPrepaidKey() {
        return this.prepaidKey;
    }

    @Nullable
    public final List<String> getPostpaidKey() {
        return this.postpaidKey;
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getButtonDescription() {
        return this.buttonDescription;
    }

    @Nullable
    public final String getServiceName() {
        return this.serviceName;
    }

    @Nullable
    public final performRequest getProductBizId() {
        return this.productBizId;
    }

    public final void setProductBizId(@Nullable performRequest performrequest) {
        this.productBizId = performrequest;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    public final void setKey(@Nullable String str) {
        this.key = str;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    public final void setAppId(@Nullable String str) {
        this.appId = str;
    }
}
