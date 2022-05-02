package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 G2\u00020\u0001:\u0001GB¿\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0013J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\rHÆ\u0003JÃ\u0001\u0010@\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017¨\u0006H"}, d2 = {"Lid/dana/explore/model/ExploreProductModel;", "", "serviceKey", "", "", "prepaidKey", "postpaidKey", "backgroundColor", "title", "iconUrl", "buttonDescription", "serviceName", "bizId", "Lid/dana/domain/globalsearch/model/ProductBizId;", "amount", "goodsId", "key", "link", "appId", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/globalsearch/model/ProductBizId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "getAppId", "setAppId", "getBackgroundColor", "setBackgroundColor", "getBizId", "()Lid/dana/domain/globalsearch/model/ProductBizId;", "setBizId", "(Lid/dana/domain/globalsearch/model/ProductBizId;)V", "getButtonDescription", "setButtonDescription", "getGoodsId", "setGoodsId", "getIconUrl", "setIconUrl", "getKey", "setKey", "getLink", "setLink", "getPostpaidKey", "()Ljava/util/List;", "getPrepaidKey", "getServiceKey", "getServiceName", "setServiceName", "getTitle", "setTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class openBluetooth {
    @NotNull
    public static final getMax values = new getMax((byte) 0);
    @Nullable
    private String FastBitmap$CoordinateSystem;
    @Nullable
    public String IsOverlapping;
    @Nullable
    public String equals;
    @Nullable
    public final List<String> getMax;
    @Nullable
    public String getMin;
    @Nullable
    public String hashCode;
    @Nullable
    public String isInside;
    @Nullable
    public final List<String> length;
    @Nullable
    public String setMax;
    @Nullable
    public String setMin;
    @Nullable
    private final List<String> toDoubleRange;
    @Nullable
    public String toFloatRange;
    @Nullable
    public performRequest toIntRange;
    @Nullable
    public String toString;

    public openBluetooth() {
        this((List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (performRequest) null, (String) null, (String) null, (String) null, 16383);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof openBluetooth)) {
            return false;
        }
        openBluetooth openbluetooth = (openBluetooth) obj;
        return Intrinsics.areEqual((Object) this.toDoubleRange, (Object) openbluetooth.toDoubleRange) && Intrinsics.areEqual((Object) this.getMax, (Object) openbluetooth.getMax) && Intrinsics.areEqual((Object) this.length, (Object) openbluetooth.length) && Intrinsics.areEqual((Object) this.setMax, (Object) openbluetooth.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) openbluetooth.getMin) && Intrinsics.areEqual((Object) this.setMin, (Object) openbluetooth.setMin) && Intrinsics.areEqual((Object) this.isInside, (Object) openbluetooth.isInside) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) openbluetooth.toFloatRange) && Intrinsics.areEqual((Object) this.toIntRange, (Object) openbluetooth.toIntRange) && Intrinsics.areEqual((Object) this.equals, (Object) openbluetooth.equals) && Intrinsics.areEqual((Object) this.FastBitmap$CoordinateSystem, (Object) openbluetooth.FastBitmap$CoordinateSystem) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) openbluetooth.IsOverlapping) && Intrinsics.areEqual((Object) this.hashCode, (Object) openbluetooth.hashCode) && Intrinsics.areEqual((Object) this.toString, (Object) openbluetooth.toString);
    }

    public final int hashCode() {
        List<String> list = this.toDoubleRange;
        int i = 0;
        int hashCode2 = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.getMax;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.length;
        int hashCode4 = (hashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str = this.setMax;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.getMin;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.setMin;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.isInside;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.toFloatRange;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        performRequest performrequest = this.toIntRange;
        int hashCode10 = (hashCode9 + (performrequest != null ? performrequest.hashCode() : 0)) * 31;
        String str6 = this.equals;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.FastBitmap$CoordinateSystem;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.IsOverlapping;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.hashCode;
        int hashCode14 = (hashCode13 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.toString;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return hashCode14 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ExploreProductModel(serviceKey=");
        sb.append(this.toDoubleRange);
        sb.append(", prepaidKey=");
        sb.append(this.getMax);
        sb.append(", postpaidKey=");
        sb.append(this.length);
        sb.append(", backgroundColor=");
        sb.append(this.setMax);
        sb.append(", title=");
        sb.append(this.getMin);
        sb.append(", iconUrl=");
        sb.append(this.setMin);
        sb.append(", buttonDescription=");
        sb.append(this.isInside);
        sb.append(", serviceName=");
        sb.append(this.toFloatRange);
        sb.append(", bizId=");
        sb.append(this.toIntRange);
        sb.append(", amount=");
        sb.append(this.equals);
        sb.append(", goodsId=");
        sb.append(this.FastBitmap$CoordinateSystem);
        sb.append(", key=");
        sb.append(this.IsOverlapping);
        sb.append(", link=");
        sb.append(this.hashCode);
        sb.append(", appId=");
        sb.append(this.toString);
        sb.append(")");
        return sb.toString();
    }

    private openBluetooth(@Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable performRequest performrequest, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.toDoubleRange = list;
        this.getMax = list2;
        this.length = list3;
        this.setMax = str;
        this.getMin = str2;
        this.setMin = str3;
        this.isInside = str4;
        this.toFloatRange = str5;
        this.toIntRange = performrequest;
        this.equals = null;
        this.FastBitmap$CoordinateSystem = null;
        this.IsOverlapping = str6;
        this.hashCode = str7;
        this.toString = str8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ openBluetooth(java.util.List r14, java.util.List r15, java.util.List r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, o.performRequest r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26) {
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
            r11 = r0 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x0058
            r11 = r5
            goto L_0x005a
        L_0x0058:
            r11 = r23
        L_0x005a:
            r12 = r0 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto L_0x0060
            r12 = r5
            goto L_0x0062
        L_0x0060:
            r12 = r24
        L_0x0062:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
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
        throw new UnsupportedOperationException("Method not decompiled: o.openBluetooth.<init>(java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.performRequest, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/explore/model/ExploreProductModel$Companion;", "", "()V", "fromSkuAttribute", "Lid/dana/explore/model/ExploreProductModel;", "skuAttr", "Lid/dana/domain/homeinfo/SkuAttribute;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }
}
