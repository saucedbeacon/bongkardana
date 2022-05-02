package o;

import id.dana.data.ProductFlavor;
import id.dana.data.constant.BranchLinkConstant;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000 42\u00020\u0001:\u00014B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J_\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020/J\u000e\u00100\u001a\u00020\u00032\u0006\u0010.\u001a\u00020/J\t\u00101\u001a\u00020\fHÖ\u0001J\b\u00102\u001a\u00020+H\u0002J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR'\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00065"}, d2 = {"Lid/dana/merchantmanagement/model/LinkedMerchantModel;", "", "merchantName", "", "merchantLogo", "merchantPCLogo", "merchantBoundDate", "", "merchantId", "divisionId", "clientId", "type", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getClientId", "()Ljava/lang/String;", "getDivisionId", "lazadaMerchantIdMap", "", "getLazadaMerchantIdMap", "()Ljava/util/Map;", "lazadaMerchantIdMap$delegate", "Lkotlin/Lazy;", "getMerchantBoundDate", "()J", "getMerchantId", "getMerchantLogo", "getMerchantName", "getMerchantPCLogo", "getType", "()I", "setType", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "getUnbindMessage", "context", "Landroid/content/Context;", "getUnbindTitle", "hashCode", "isLazadaMerchant", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class alert {
    @NotNull
    public static final length isInside = new length((byte) 0);
    @NotNull
    public final String IsOverlapping;
    public int equals;
    @Nullable
    public final String getMax;
    public final long getMin;
    @NotNull
    public final String length;
    @NotNull
    public final String setMax;
    @Nullable
    public final String setMin;
    @Nullable
    private final String toFloatRange;
    private final Lazy toIntRange;

    public alert() {
        this((String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, 255);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alert)) {
            return false;
        }
        alert alert = (alert) obj;
        return Intrinsics.areEqual((Object) this.length, (Object) alert.length) && Intrinsics.areEqual((Object) this.getMax, (Object) alert.getMax) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) alert.toFloatRange) && this.getMin == alert.getMin && Intrinsics.areEqual((Object) this.setMax, (Object) alert.setMax) && Intrinsics.areEqual((Object) this.setMin, (Object) alert.setMin) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) alert.IsOverlapping) && this.equals == alert.equals;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkedMerchantModel(merchantName=");
        sb.append(this.length);
        sb.append(", merchantLogo=");
        sb.append(this.getMax);
        sb.append(", merchantPCLogo=");
        sb.append(this.toFloatRange);
        sb.append(", merchantBoundDate=");
        sb.append(this.getMin);
        sb.append(", merchantId=");
        sb.append(this.setMax);
        sb.append(", divisionId=");
        sb.append(this.setMin);
        sb.append(", clientId=");
        sb.append(this.IsOverlapping);
        sb.append(", type=");
        sb.append(this.equals);
        sb.append(")");
        return sb.toString();
    }

    private alert(@NotNull String str, @Nullable String str2, @Nullable String str3, long j, @NotNull String str4, @Nullable String str5, @NotNull String str6, int i) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str4, "merchantId");
        Intrinsics.checkNotNullParameter(str6, "clientId");
        this.length = str;
        this.getMax = str2;
        this.toFloatRange = str3;
        this.getMin = j;
        this.setMax = str4;
        this.setMin = str5;
        this.IsOverlapping = str6;
        this.equals = i;
        this.toIntRange = LazyKt.lazy(setMax.INSTANCE);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ alert(java.lang.String r11, java.lang.String r12, java.lang.String r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, int r20) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r11
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0012
        L_0x0011:
            r3 = r12
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x0019
        L_0x0018:
            r4 = r13
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0021
        L_0x0020:
            r5 = r14
        L_0x0021:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0027
            r7 = r2
            goto L_0x0029
        L_0x0027:
            r7 = r16
        L_0x0029:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x002f
            r8 = r2
            goto L_0x0031
        L_0x002f:
            r8 = r17
        L_0x0031:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r2 = r18
        L_0x0038:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003e
            r0 = 1
            goto L_0x0040
        L_0x003e:
            r0 = r19
        L_0x0040:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r17 = r7
            r18 = r8
            r19 = r2
            r20 = r0
            r11.<init>(r12, r13, r14, r15, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.alert.<init>(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, int, int):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/merchantmanagement/model/LinkedMerchantModel$Companion;", "", "()V", "DEFAULT_LAZADA_MERCHANT_ID", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<Map<String, ? extends String>> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(0);
        }

        @NotNull
        public final Map<String, String> invoke() {
            return MapsKt.mapOf(TuplesKt.to("production", "216620000012453461191"), TuplesKt.to(ProductFlavor.PREPROD, "216620000012453461191"));
        }
    }

    public final boolean getMin() {
        if (((Map) this.toIntRange.getValue()).containsKey("production")) {
            return Intrinsics.areEqual((Object) this.setMax, (Object) (String) ((Map) this.toIntRange.getValue()).get("production"));
        }
        return Intrinsics.areEqual((Object) this.setMax, (Object) "216620000002993622833");
    }

    public final int hashCode() {
        String str = this.length;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMax;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.toFloatRange;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.valueOf(this.getMin).hashCode()) * 31;
        String str4 = this.setMax;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.setMin;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.IsOverlapping;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return ((hashCode5 + i) * 31) + Integer.valueOf(this.equals).hashCode();
    }
}
