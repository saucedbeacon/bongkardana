package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import com.google.gson.annotations.SerializedName;
import id.dana.domain.merchant.MerchantCategoryType;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class DebugConsoleExtension implements Callable {
    private final MerchantCategoryType getMax;
    private final com_alibaba_ariver_resource_api_ExtOpt$22$1 getMin;

    public DebugConsoleExtension(com_alibaba_ariver_resource_api_ExtOpt$22$1 com_alibaba_ariver_resource_api_extopt_22_1, MerchantCategoryType merchantCategoryType) {
        this.getMin = com_alibaba_ariver_resource_api_extopt_22_1;
        this.getMax = merchantCategoryType;
    }

    public final Object call() {
        return this.getMin.lambda$getNewMerchantCategoryOrder$13(this.getMax);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 &2\u00020\u0001:\u0001&BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, d2 = {"Lid/dana/data/merchant/repository/source/network/request/CreateProductOrderRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "requestId", "", "aggregatorGoodsId", "amount", "Lid/dana/data/merchant/repository/source/network/response/MultiCurrencyMoney;", "goodsId", "param", "productCode", "extendInfo", "Lid/dana/data/merchant/repository/source/network/request/CreateProductOrderExtendInfo;", "(Ljava/lang/String;Ljava/lang/String;Lid/dana/data/merchant/repository/source/network/response/MultiCurrencyMoney;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/data/merchant/repository/source/network/request/CreateProductOrderExtendInfo;)V", "getAggregatorGoodsId", "()Ljava/lang/String;", "getAmount", "()Lid/dana/data/merchant/repository/source/network/response/MultiCurrencyMoney;", "getExtendInfo", "()Lid/dana/data/merchant/repository/source/network/request/CreateProductOrderExtendInfo;", "getGoodsId", "getParam", "getProductCode", "getRequestId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.DebugConsoleExtension$1  reason: invalid class name */
    public final class AnonymousClass1 extends BaseRpcRequest {
        @NotNull
        public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
        @SerializedName("aggregatorGoodsId")
        @Nullable
        private final String aggregatorGoodsId;
        @SerializedName("amount")
        @Nullable
        private final toggleConsole amount;
        @SerializedName("extendInfo")
        @Nullable
        private final IDebugConsoleController extendInfo;
        @SerializedName("goodsId")
        @NotNull
        private final String goodsId;
        @SerializedName("param")
        @NotNull
        private final String param;
        @SerializedName("productCode")
        @NotNull
        private final String productCode;
        @SerializedName("requestId")
        @NotNull
        private final String requestId;

        public static /* synthetic */ AnonymousClass1 copy$default(AnonymousClass1 r5, String str, String str2, toggleConsole toggleconsole, String str3, String str4, String str5, IDebugConsoleController iDebugConsoleController, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r5.requestId;
            }
            if ((i & 2) != 0) {
                str2 = r5.aggregatorGoodsId;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                toggleconsole = r5.amount;
            }
            toggleConsole toggleconsole2 = toggleconsole;
            if ((i & 8) != 0) {
                str3 = r5.goodsId;
            }
            String str7 = str3;
            if ((i & 16) != 0) {
                str4 = r5.param;
            }
            String str8 = str4;
            if ((i & 32) != 0) {
                str5 = r5.productCode;
            }
            String str9 = str5;
            if ((i & 64) != 0) {
                iDebugConsoleController = r5.extendInfo;
            }
            return r5.copy(str, str6, toggleconsole2, str7, str8, str9, iDebugConsoleController);
        }

        @NotNull
        public final String component1() {
            return this.requestId;
        }

        @Nullable
        public final String component2() {
            return this.aggregatorGoodsId;
        }

        @Nullable
        public final toggleConsole component3() {
            return this.amount;
        }

        @NotNull
        public final String component4() {
            return this.goodsId;
        }

        @NotNull
        public final String component5() {
            return this.param;
        }

        @NotNull
        public final String component6() {
            return this.productCode;
        }

        @Nullable
        public final IDebugConsoleController component7() {
            return this.extendInfo;
        }

        @NotNull
        public final AnonymousClass1 copy(@NotNull String str, @Nullable String str2, @Nullable toggleConsole toggleconsole, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable IDebugConsoleController iDebugConsoleController) {
            Intrinsics.checkNotNullParameter(str, "requestId");
            Intrinsics.checkNotNullParameter(str3, "goodsId");
            Intrinsics.checkNotNullParameter(str4, "param");
            Intrinsics.checkNotNullParameter(str5, "productCode");
            return new AnonymousClass1(str, str2, toggleconsole, str3, str4, str5, iDebugConsoleController);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass1)) {
                return false;
            }
            AnonymousClass1 r3 = (AnonymousClass1) obj;
            return Intrinsics.areEqual((Object) this.requestId, (Object) r3.requestId) && Intrinsics.areEqual((Object) this.aggregatorGoodsId, (Object) r3.aggregatorGoodsId) && Intrinsics.areEqual((Object) this.amount, (Object) r3.amount) && Intrinsics.areEqual((Object) this.goodsId, (Object) r3.goodsId) && Intrinsics.areEqual((Object) this.param, (Object) r3.param) && Intrinsics.areEqual((Object) this.productCode, (Object) r3.productCode) && Intrinsics.areEqual((Object) this.extendInfo, (Object) r3.extendInfo);
        }

        public final int hashCode() {
            String str = this.requestId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.aggregatorGoodsId;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            toggleConsole toggleconsole = this.amount;
            int hashCode3 = (hashCode2 + (toggleconsole != null ? toggleconsole.hashCode() : 0)) * 31;
            String str3 = this.goodsId;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.param;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.productCode;
            int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
            IDebugConsoleController iDebugConsoleController = this.extendInfo;
            if (iDebugConsoleController != null) {
                i = iDebugConsoleController.hashCode();
            }
            return hashCode6 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("CreateProductOrderRequest(requestId=");
            sb.append(this.requestId);
            sb.append(", aggregatorGoodsId=");
            sb.append(this.aggregatorGoodsId);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", goodsId=");
            sb.append(this.goodsId);
            sb.append(", param=");
            sb.append(this.param);
            sb.append(", productCode=");
            sb.append(this.productCode);
            sb.append(", extendInfo=");
            sb.append(this.extendInfo);
            sb.append(")");
            return sb.toString();
        }

        @NotNull
        public final String getRequestId() {
            return this.requestId;
        }

        @Nullable
        public final String getAggregatorGoodsId() {
            return this.aggregatorGoodsId;
        }

        @Nullable
        public final toggleConsole getAmount() {
            return this.amount;
        }

        @NotNull
        public final String getGoodsId() {
            return this.goodsId;
        }

        @NotNull
        public final String getParam() {
            return this.param;
        }

        @NotNull
        public final String getProductCode() {
            return this.productCode;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(String str, String str2, toggleConsole toggleconsole, String str3, String str4, String str5, IDebugConsoleController iDebugConsoleController, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : toggleconsole, str3, str4, str5, (i & 64) != 0 ? null : iDebugConsoleController);
        }

        @Nullable
        public final IDebugConsoleController getExtendInfo() {
            return this.extendInfo;
        }

        public AnonymousClass1(@NotNull String str, @Nullable String str2, @Nullable toggleConsole toggleconsole, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable IDebugConsoleController iDebugConsoleController) {
            Intrinsics.checkNotNullParameter(str, "requestId");
            Intrinsics.checkNotNullParameter(str3, "goodsId");
            Intrinsics.checkNotNullParameter(str4, "param");
            Intrinsics.checkNotNullParameter(str5, "productCode");
            this.requestId = str;
            this.aggregatorGoodsId = str2;
            this.amount = toggleconsole;
            this.goodsId = str3;
            this.param = str4;
            this.productCode = str5;
            this.extendInfo = iDebugConsoleController;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b¨\u0006\n"}, d2 = {"Lid/dana/data/merchant/repository/source/network/request/CreateProductOrderRequest$Companion;", "", "()V", "forElectricity", "Lid/dana/data/merchant/repository/source/network/request/CreateProductOrderRequest;", "result", "Lid/dana/data/merchant/repository/source/network/response/BizDestinationInquiryResult;", "transRes", "Lid/dana/data/merchant/repository/source/network/response/QueryLastSuccessfulTransactionResponse;", "fromLastSuccesfulTransaction", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.DebugConsoleExtension$1$getMax */
        public static final class getMax {
            private getMax() {
            }

            public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
                r0 = (o.toggleConsoleView) kotlin.collections.CollectionsKt.firstOrNull(r0);
             */
            @org.jetbrains.annotations.NotNull
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final o.DebugConsoleExtension.AnonymousClass1 fromLastSuccesfulTransaction(@org.jetbrains.annotations.NotNull o.setToggleButtonVisible r14) {
                /*
                    r13 = this;
                    java.lang.String r0 = "result"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                    java.util.List r0 = r14.getBizIds()
                    r1 = 0
                    if (r0 == 0) goto L_0x0019
                    java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
                    o.toggleConsoleView r0 = (o.toggleConsoleView) r0
                    if (r0 == 0) goto L_0x0019
                    java.lang.String r0 = r0.getGoodsId()
                    goto L_0x001a
                L_0x0019:
                    r0 = r1
                L_0x001a:
                    java.lang.String r2 = ""
                    if (r0 != 0) goto L_0x0020
                    r7 = r2
                    goto L_0x0021
                L_0x0020:
                    r7 = r0
                L_0x0021:
                    java.util.List r14 = r14.getBizIds()
                    if (r14 == 0) goto L_0x0033
                    java.lang.Object r14 = kotlin.collections.CollectionsKt.firstOrNull(r14)
                    o.toggleConsoleView r14 = (o.toggleConsoleView) r14
                    if (r14 == 0) goto L_0x0033
                    java.lang.String r1 = r14.getBizId()
                L_0x0033:
                    if (r1 != 0) goto L_0x0037
                    r8 = r2
                    goto L_0x0038
                L_0x0037:
                    r8 = r1
                L_0x0038:
                    o.DebugConsoleExtension$1 r14 = new o.DebugConsoleExtension$1
                    java.util.UUID r0 = java.util.UUID.randomUUID()
                    java.lang.String r4 = r0.toString()
                    java.lang.String r0 = "UUID.randomUUID().toString()"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
                    r5 = 0
                    r6 = 0
                    r10 = 0
                    r11 = 70
                    r12 = 0
                    java.lang.String r9 = "PULSA_PREPAID"
                    r3 = r14
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: o.DebugConsoleExtension.AnonymousClass1.getMax.fromLastSuccesfulTransaction(o.setToggleButtonVisible):o.DebugConsoleExtension$1");
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
                r0 = (o.toggleConsoleView) kotlin.collections.CollectionsKt.firstOrNull(r0);
             */
            @org.jetbrains.annotations.NotNull
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final o.DebugConsoleExtension.AnonymousClass1 forElectricity(@org.jetbrains.annotations.NotNull o.RVDebugConsoleProxy r30, @org.jetbrains.annotations.NotNull o.setToggleButtonVisible r31) {
                /*
                    r29 = this;
                    java.lang.String r0 = "result"
                    r1 = r30
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                    java.lang.String r0 = "transRes"
                    r2 = r31
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    java.util.List r0 = r31.getBizIds()
                    r3 = 0
                    if (r0 == 0) goto L_0x0023
                    java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
                    o.toggleConsoleView r0 = (o.toggleConsoleView) r0
                    if (r0 == 0) goto L_0x0023
                    java.lang.String r0 = r0.getGoodsId()
                    goto L_0x0024
                L_0x0023:
                    r0 = r3
                L_0x0024:
                    java.lang.String r4 = ""
                    if (r0 != 0) goto L_0x002a
                    r9 = r4
                    goto L_0x002b
                L_0x002a:
                    r9 = r0
                L_0x002b:
                    java.util.List r0 = r31.getBizIds()
                    if (r0 == 0) goto L_0x003e
                    java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
                    o.toggleConsoleView r0 = (o.toggleConsoleView) r0
                    if (r0 == 0) goto L_0x003e
                    java.lang.String r0 = r0.getBizId()
                    goto L_0x003f
                L_0x003e:
                    r0 = r3
                L_0x003f:
                    if (r0 != 0) goto L_0x0043
                    r10 = r4
                    goto L_0x0044
                L_0x0043:
                    r10 = r0
                L_0x0044:
                    java.util.List r0 = r31.getBizIds()
                    if (r0 == 0) goto L_0x0057
                    java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
                    o.toggleConsoleView r0 = (o.toggleConsoleView) r0
                    if (r0 == 0) goto L_0x0057
                    java.lang.String r0 = r0.getGoodsType()
                    goto L_0x0058
                L_0x0057:
                    r0 = r3
                L_0x0058:
                    if (r0 != 0) goto L_0x005c
                    r11 = r4
                    goto L_0x005d
                L_0x005c:
                    r11 = r0
                L_0x005d:
                    java.util.List r0 = r30.getDigitalDestinationInquiryInfos()
                    if (r0 == 0) goto L_0x0071
                    java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
                    o.getNodeType r0 = (o.getNodeType) r0
                    if (r0 == 0) goto L_0x0071
                    o.toggleConsole r0 = r0.getTotalAmount()
                    if (r0 != 0) goto L_0x0088
                L_0x0071:
                    o.toggleConsole r0 = new o.toggleConsole
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r16 = 0
                    r17 = 0
                    r18 = 0
                    r19 = 0
                    r20 = 0
                    r21 = 255(0xff, float:3.57E-43)
                    r22 = 0
                    r12 = r0
                    r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                L_0x0088:
                    r8 = r0
                    java.util.List r0 = r30.getDigitalDestinationInquiryInfos()
                    if (r0 == 0) goto L_0x009d
                    java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
                    o.getNodeType r0 = (o.getNodeType) r0
                    if (r0 == 0) goto L_0x009d
                    o.toggleConsole r0 = r0.getAdminFee()
                    if (r0 != 0) goto L_0x00b4
                L_0x009d:
                    o.toggleConsole r0 = new o.toggleConsole
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r16 = 0
                    r17 = 0
                    r18 = 0
                    r19 = 0
                    r20 = 0
                    r21 = 255(0xff, float:3.57E-43)
                    r22 = 0
                    r12 = r0
                    r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                L_0x00b4:
                    java.util.List r2 = r30.getDigitalDestinationInquiryInfos()
                    if (r2 == 0) goto L_0x00c7
                    java.lang.Object r2 = kotlin.collections.CollectionsKt.firstOrNull(r2)
                    o.getNodeType r2 = (o.getNodeType) r2
                    if (r2 == 0) goto L_0x00c7
                    java.lang.String r2 = r2.getCustomerName()
                    goto L_0x00c8
                L_0x00c7:
                    r2 = r3
                L_0x00c8:
                    if (r2 != 0) goto L_0x00cc
                    r14 = r4
                    goto L_0x00cd
                L_0x00cc:
                    r14 = r2
                L_0x00cd:
                    java.util.List r2 = r30.getDigitalDestinationInquiryInfos()
                    if (r2 == 0) goto L_0x00e0
                    java.lang.Object r2 = kotlin.collections.CollectionsKt.firstOrNull(r2)
                    o.getNodeType r2 = (o.getNodeType) r2
                    if (r2 == 0) goto L_0x00e0
                    java.lang.String r2 = r2.getInquiryId()
                    goto L_0x00e1
                L_0x00e0:
                    r2 = r3
                L_0x00e1:
                    if (r2 != 0) goto L_0x00e6
                    r16 = r4
                    goto L_0x00e8
                L_0x00e6:
                    r16 = r2
                L_0x00e8:
                    java.util.List r2 = r30.getDigitalDestinationInquiryInfos()
                    if (r2 == 0) goto L_0x00fb
                    java.lang.Object r2 = kotlin.collections.CollectionsKt.firstOrNull(r2)
                    o.getNodeType r2 = (o.getNodeType) r2
                    if (r2 == 0) goto L_0x00fb
                    java.lang.String r2 = r2.getFare()
                    goto L_0x00fc
                L_0x00fb:
                    r2 = r3
                L_0x00fc:
                    if (r2 != 0) goto L_0x0100
                    r15 = r4
                    goto L_0x0101
                L_0x0100:
                    r15 = r2
                L_0x0101:
                    java.util.List r2 = r30.getDigitalDestinationInquiryInfos()
                    if (r2 == 0) goto L_0x0114
                    java.lang.Object r2 = kotlin.collections.CollectionsKt.firstOrNull(r2)
                    o.getNodeType r2 = (o.getNodeType) r2
                    if (r2 == 0) goto L_0x0114
                    java.lang.String r2 = r2.getTotalEnergy()
                    goto L_0x0115
                L_0x0114:
                    r2 = r3
                L_0x0115:
                    if (r2 != 0) goto L_0x011a
                    r17 = r4
                    goto L_0x011c
                L_0x011a:
                    r17 = r2
                L_0x011c:
                    java.lang.String r1 = r30.getAggregatorGoodsId()
                    if (r1 != 0) goto L_0x0124
                    r7 = r4
                    goto L_0x0125
                L_0x0124:
                    r7 = r1
                L_0x0125:
                    o.DebugConsoleExtension$1 r1 = new o.DebugConsoleExtension$1
                    java.util.UUID r2 = java.util.UUID.randomUUID()
                    java.lang.String r6 = r2.toString()
                    java.lang.String r2 = "UUID.randomUUID().toString()"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
                    o.IDebugConsoleController r2 = new o.IDebugConsoleController
                    o.toggleConsole r13 = new o.toggleConsole
                    r19 = 0
                    r20 = 0
                    r21 = 0
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r22 = r0.getAmount()
                    if (r22 == 0) goto L_0x0157
                    r25 = 0
                    r26 = 4
                    r27 = 0
                    java.lang.String r23 = "."
                    java.lang.String r24 = ""
                    java.lang.String r3 = kotlin.text.StringsKt.replace$default((java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24, (boolean) r25, (int) r26, (java.lang.Object) r27)
                L_0x0157:
                    r4.append(r3)
                    java.lang.String r0 = "00"
                    r4.append(r0)
                    java.lang.String r26 = r4.toString()
                    r23 = 0
                    r24 = 0
                    r25 = 0
                    r27 = 119(0x77, float:1.67E-43)
                    r28 = 0
                    java.lang.String r22 = "IDR"
                    r18 = r13
                    r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                    r12 = r2
                    r12.<init>(r13, r14, r15, r16, r17)
                    r5 = r1
                    r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: o.DebugConsoleExtension.AnonymousClass1.getMax.forElectricity(o.RVDebugConsoleProxy, o.setToggleButtonVisible):o.DebugConsoleExtension$1");
            }
        }
    }
}
