package o;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\rJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0001\u0010\"\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006*"}, d2 = {"Lid/dana/data/homeinfo/model/SkuAttributeEntity;", "Ljava/io/Serializable;", "serviceKey", "", "", "prepaidKey", "postpaidKey", "backgroundColor", "title", "icon", "buttonDescription", "serviceName", "link", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getButtonDescription", "getIcon", "getLink", "getPostpaidKey", "()Ljava/util/List;", "getPrepaidKey", "getServiceKey", "getServiceName", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class inflateFromResource implements Serializable {
    @Nullable
    String backgroundColor;
    @Nullable
    String buttonDescription;
    @Nullable
    String icon;
    @Nullable
    String link;
    @Nullable
    List<String> postpaidKey;
    @Nullable
    List<String> prepaidKey;
    @Nullable
    List<String> serviceKey;
    @Nullable
    String serviceName;
    @Nullable
    String title;

    public inflateFromResource() {
        this((List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ inflateFromResource copy$default(inflateFromResource inflatefromresource, List list, List list2, List list3, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        inflateFromResource inflatefromresource2 = inflatefromresource;
        int i2 = i;
        return inflatefromresource.copy((i2 & 1) != 0 ? inflatefromresource2.serviceKey : list, (i2 & 2) != 0 ? inflatefromresource2.prepaidKey : list2, (i2 & 4) != 0 ? inflatefromresource2.postpaidKey : list3, (i2 & 8) != 0 ? inflatefromresource2.backgroundColor : str, (i2 & 16) != 0 ? inflatefromresource2.title : str2, (i2 & 32) != 0 ? inflatefromresource2.icon : str3, (i2 & 64) != 0 ? inflatefromresource2.buttonDescription : str4, (i2 & 128) != 0 ? inflatefromresource2.serviceName : str5, (i2 & 256) != 0 ? inflatefromresource2.link : str6);
    }

    @Nullable
    public final List<String> component1() {
        return this.serviceKey;
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
    public final String component9() {
        return this.link;
    }

    @NotNull
    public final inflateFromResource copy(@Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new inflateFromResource(list, list2, list3, str, str2, str3, str4, str5, str6);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inflateFromResource)) {
            return false;
        }
        inflateFromResource inflatefromresource = (inflateFromResource) obj;
        return Intrinsics.areEqual((Object) this.serviceKey, (Object) inflatefromresource.serviceKey) && Intrinsics.areEqual((Object) this.prepaidKey, (Object) inflatefromresource.prepaidKey) && Intrinsics.areEqual((Object) this.postpaidKey, (Object) inflatefromresource.postpaidKey) && Intrinsics.areEqual((Object) this.backgroundColor, (Object) inflatefromresource.backgroundColor) && Intrinsics.areEqual((Object) this.title, (Object) inflatefromresource.title) && Intrinsics.areEqual((Object) this.icon, (Object) inflatefromresource.icon) && Intrinsics.areEqual((Object) this.buttonDescription, (Object) inflatefromresource.buttonDescription) && Intrinsics.areEqual((Object) this.serviceName, (Object) inflatefromresource.serviceName) && Intrinsics.areEqual((Object) this.link, (Object) inflatefromresource.link);
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
        String str6 = this.link;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode8 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SkuAttributeEntity(serviceKey=");
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
        sb.append(", link=");
        sb.append(this.link);
        sb.append(")");
        return sb.toString();
    }

    public inflateFromResource(@Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.serviceKey = list;
        this.prepaidKey = list2;
        this.postpaidKey = list3;
        this.backgroundColor = str;
        this.title = str2;
        this.icon = str3;
        this.buttonDescription = str4;
        this.serviceName = str5;
        this.link = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ inflateFromResource(java.util.List r11, java.util.List r12, java.util.List r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000b
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x000c
        L_0x000b:
            r1 = r11
        L_0x000c:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0015
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0016
        L_0x0015:
            r2 = r12
        L_0x0016:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x001f
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0020
        L_0x001f:
            r3 = r13
        L_0x0020:
            r4 = r0 & 8
            r5 = 0
            if (r4 == 0) goto L_0x0027
            r4 = r5
            goto L_0x0028
        L_0x0027:
            r4 = r14
        L_0x0028:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002e
            r6 = r5
            goto L_0x002f
        L_0x002e:
            r6 = r15
        L_0x002f:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0035
            r7 = r5
            goto L_0x0037
        L_0x0035:
            r7 = r16
        L_0x0037:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003d
            r8 = r5
            goto L_0x003f
        L_0x003d:
            r8 = r17
        L_0x003f:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0045
            r9 = r5
            goto L_0x0047
        L_0x0045:
            r9 = r18
        L_0x0047:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r5 = r19
        L_0x004e:
            r11 = r10
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.inflateFromResource.<init>(java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
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
    public final String getLink() {
        return this.link;
    }
}
