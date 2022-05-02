package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.CreateParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0011\u0010\u001a\u001a\u00020\u001bH@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0014J1\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H@ø\u0001\u0000¢\u0006\u0002\u0010'J!\u0010(\u001a\u00020)2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H@ø\u0001\u0000¢\u0006\u0002\u0010*J1\u0010+\u001a\u00020,2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H@ø\u0001\u0000¢\u0006\u0002\u0010'J?\u0010-\u001a\u00020.2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\"00H@ø\u0001\u0000¢\u0006\u0002\u00101J!\u00102\u001a\u0002032\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H@ø\u0001\u0000¢\u0006\u0002\u0010*J\u0019\u00104\u001a\u0002052\u0006\u0010\u0017\u001a\u000206H@ø\u0001\u0000¢\u0006\u0002\u00107J\u0019\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u001bH@ø\u0001\u0000¢\u0006\u0002\u0010;\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/NetworkMerchantInfoEntityData;", "Lid/dana/data/social/core/SecureBaseNetwork;", "Lid/dana/data/nearbyme/repository/source/network/MerchantInfoFacade;", "Lid/dana/data/nearbyme/MerchantInfoEntityData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "apSecurityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;)V", "consultMerchantReview", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantConsultResult;", "merchantConsultRequest", "Lid/dana/data/nearbyme/repository/source/network/request/merchantdetail/BaseMerchantInfoRequest;", "(Lid/dana/data/nearbyme/repository/source/network/request/merchantdetail/BaseMerchantInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createProductOrder", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/ProductOrderResult;", "productOrderRequest", "Lid/dana/data/nearbyme/repository/source/network/request/ProductOrderRequest;", "(Lid/dana/data/nearbyme/repository/source/network/request/ProductOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createReview", "Lid/dana/data/nearbyme/repository/source/network/result/merchantreview/MerchantCreateReviewResult;", "request", "Lid/dana/data/nearbyme/repository/source/network/request/merchantreview/MerchantCreateReviewRequest;", "(Lid/dana/data/nearbyme/repository/source/network/request/merchantreview/MerchantCreateReviewRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoachmarkVisibility", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFacadeClass", "Ljava/lang/Class;", "getMerchantImage", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantImageResult;", "merchantId", "", "shopId", "pageNum", "", "pageSize", "(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantInfo", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantDetailInfoResult;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantPromoDanaDeal", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantPromoDanaDealResult;", "getMerchantReview", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantQueryReviewResult;", "filterCriteria", "", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantReviewSummary", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantReviewSummaryResult;", "queryAdditionalInfo", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantAdditionalInfoResult;", "Lid/dana/data/nearbyme/repository/source/network/request/merchantdetail/MerchantAdditionalInfoRequest;", "(Lid/dana/data/nearbyme/repository/source/network/request/merchantdetail/MerchantAdditionalInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCoachmarkVisibility", "", "enabled", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isSticky extends getLocalPermissionDialog<BindingId> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public isSticky(@NotNull setIsUrgentResource setisurgentresource, @NotNull onAppResume onappresume, @NotNull Context context) {
        super(onappresume, context, setisurgentresource);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(onappresume, "apSecurityFacade");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final Class<BindingId> getFacadeClass() {
        return BindingId.class;
    }

    @Nullable
    public final Object getMerchantInfo(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super NativeCallContext> continuation) {
        if (str.length() == 0) {
            str = null;
        }
        sendEvent sendevent = new sendEvent(str, str2, 0, 0, 12, (DefaultConstructorMarker) null);
        sendevent.envInfo = generateMobileEnvInfo();
        return wrapper(new setMin(sendevent), continuation);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantDetailInfoResult;", "it", "Lid/dana/data/nearbyme/repository/source/network/MerchantInfoFacade;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<BindingId, NativeCallContext> {
        final /* synthetic */ sendEvent $merchantDetailInfoRequest;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(sendEvent sendevent) {
            super(1);
            this.$merchantDetailInfoRequest = sendevent;
        }

        @NotNull
        public final NativeCallContext invoke(@NotNull BindingId bindingId) {
            Intrinsics.checkNotNullParameter(bindingId, "it");
            return bindingId.queryInfo(this.$merchantDetailInfoRequest);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantReviewSummaryResult;", "it", "Lid/dana/data/nearbyme/repository/source/network/MerchantInfoFacade;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<BindingId, newBuilder> {
        final /* synthetic */ String $merchantId;
        final /* synthetic */ String $shopId;
        final /* synthetic */ isSticky this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(isSticky issticky, String str, String str2) {
            super(1);
            this.this$0 = issticky;
            this.$merchantId = str;
            this.$shopId = str2;
        }

        @NotNull
        public final newBuilder invoke(@NotNull BindingId bindingId) {
            Intrinsics.checkNotNullParameter(bindingId, "it");
            CreateParams createParams = new CreateParams(this.$merchantId, this.$shopId, 0, 0, (List) null, 28, (DefaultConstructorMarker) null);
            createParams.envInfo = this.this$0.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return bindingId.queryReviewSummary(createParams);
        }
    }

    @Nullable
    public final Object getMerchantReviewSummary(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super newBuilder> continuation) {
        return wrapper(new IsOverlapping(this, str, str2), continuation);
    }

    @Nullable
    public final Object getMerchantReview(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull List<String> list, @NotNull Continuation<? super getParams> continuation) {
        return wrapper(new toIntRange(this, str, str2, i, i2, list), continuation);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantQueryReviewResult;", "it", "Lid/dana/data/nearbyme/repository/source/network/MerchantInfoFacade;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<BindingId, getParams> {
        final /* synthetic */ List $filterCriteria;
        final /* synthetic */ String $merchantId;
        final /* synthetic */ int $pageNum;
        final /* synthetic */ int $pageSize;
        final /* synthetic */ String $shopId;
        final /* synthetic */ isSticky this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(isSticky issticky, String str, String str2, int i, int i2, List list) {
            super(1);
            this.this$0 = issticky;
            this.$merchantId = str;
            this.$shopId = str2;
            this.$pageNum = i;
            this.$pageSize = i2;
            this.$filterCriteria = list;
        }

        @NotNull
        public final getParams invoke(@NotNull BindingId bindingId) {
            Intrinsics.checkNotNullParameter(bindingId, "it");
            CreateParams createParams = new CreateParams(this.$merchantId, this.$shopId, this.$pageNum, this.$pageSize, this.$filterCriteria);
            createParams.envInfo = this.this$0.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return bindingId.queryReview(createParams);
        }
    }

    @Nullable
    public final Object getMerchantImage(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull Continuation<? super InitParams> continuation) {
        return wrapper(new length(this, str, str2, i, i2), continuation);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantImageResult;", "it", "Lid/dana/data/nearbyme/repository/source/network/MerchantInfoFacade;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<BindingId, InitParams> {
        final /* synthetic */ String $merchantId;
        final /* synthetic */ int $pageNum;
        final /* synthetic */ int $pageSize;
        final /* synthetic */ String $shopId;
        final /* synthetic */ isSticky this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(isSticky issticky, String str, String str2, int i, int i2) {
            super(1);
            this.this$0 = issticky;
            this.$merchantId = str;
            this.$shopId = str2;
            this.$pageNum = i;
            this.$pageSize = i2;
        }

        @NotNull
        public final InitParams invoke(@NotNull BindingId bindingId) {
            Intrinsics.checkNotNullParameter(bindingId, "it");
            getInternalView getinternalview = new getInternalView(this.$merchantId, this.$shopId, this.$pageNum, this.$pageSize);
            getinternalview.envInfo = this.this$0.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return bindingId.queryImage(getinternalview);
        }
    }

    @Nullable
    public final Object getMerchantPromoDanaDeal(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull Continuation<? super setPluginId> continuation) {
        return wrapper(new equals(this, str, str2, i, i2), continuation);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantPromoDanaDealResult;", "it", "Lid/dana/data/nearbyme/repository/source/network/MerchantInfoFacade;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<BindingId, setPluginId> {
        final /* synthetic */ String $merchantId;
        final /* synthetic */ int $pageNum;
        final /* synthetic */ int $pageSize;
        final /* synthetic */ String $shopId;
        final /* synthetic */ isSticky this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(isSticky issticky, String str, String str2, int i, int i2) {
            super(1);
            this.this$0 = issticky;
            this.$merchantId = str;
            this.$shopId = str2;
            this.$pageNum = i;
            this.$pageSize = i2;
        }

        @NotNull
        public final setPluginId invoke(@NotNull BindingId bindingId) {
            Intrinsics.checkNotNullParameter(bindingId, "it");
            CreateParams.AnonymousClass1 r0 = new BaseRpcRequest(this.$merchantId, this.$shopId, this.$pageNum, this.$pageSize) {
                @NotNull
                private final String merchantId;
                private final int pageNum;
                private final int pageSize;
                @Nullable
                private final String shopId;

                public static /* synthetic */ AnonymousClass1 copy$default(AnonymousClass1 r0, String str, String str2, int i, int i2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        str = r0.merchantId;
                    }
                    if ((i3 & 2) != 0) {
                        str2 = r0.shopId;
                    }
                    if ((i3 & 4) != 0) {
                        i = r0.pageNum;
                    }
                    if ((i3 & 8) != 0) {
                        i2 = r0.pageSize;
                    }
                    return r0.copy(str, str2, i, i2);
                }

                @NotNull
                public final String component1() {
                    return this.merchantId;
                }

                @Nullable
                public final String component2() {
                    return this.shopId;
                }

                public final int component3() {
                    return this.pageNum;
                }

                public final int component4() {
                    return this.pageSize;
                }

                @NotNull
                public final AnonymousClass1 copy(@NotNull String str, @Nullable String str2, int i, int i2) {
                    Intrinsics.checkNotNullParameter(str, "merchantId");
                    return 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: CONSTRUCTOR  (r0v1 'r0' o.CreateParams$1) = 
                          (wrap: java.lang.String : 0x0007: IGET  (r1v0 java.lang.String) = (r5v0 'this' o.isSticky$equals A[THIS]) o.isSticky.equals.$merchantId java.lang.String)
                          (wrap: java.lang.String : 0x0009: IGET  (r2v0 java.lang.String) = (r5v0 'this' o.isSticky$equals A[THIS]) o.isSticky.equals.$shopId java.lang.String)
                          (wrap: int : 0x000b: IGET  (r3v0 int) = (r5v0 'this' o.isSticky$equals A[THIS]) o.isSticky.equals.$pageNum int)
                          (wrap: int : 0x000d: IGET  (r4v0 int) = (r5v0 'this' o.isSticky$equals A[THIS]) o.isSticky.equals.$pageSize int)
                         call: o.CreateParams.1.<init>(java.lang.String, java.lang.String, int, int):void type: CONSTRUCTOR in method: o.isSticky.equals.invoke(o.BindingId):o.setPluginId, dex: classes3.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method generation error
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:274)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 44 more
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000a: RETURN  
                          (wrap: o.CreateParams$1 : 0x0007: CONSTRUCTOR  (r0v1 o.CreateParams$1) = 
                          (r2v0 'str' java.lang.String)
                          (r3v0 'str2' java.lang.String)
                          (r4v0 'i' int)
                          (r5v0 'i2' int)
                         call: o.CreateParams.1.<init>(java.lang.String, java.lang.String, int, int):void type: CONSTRUCTOR)
                         in method: o.CreateParams.1.copy(java.lang.String, java.lang.String, int, int):o.CreateParams$1, dex: classes3.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	... 61 more
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0007: CONSTRUCTOR  (r0v1 o.CreateParams$1) = 
                          (r2v0 'str' java.lang.String)
                          (r3v0 'str2' java.lang.String)
                          (r4v0 'i' int)
                          (r5v0 'i2' int)
                         call: o.CreateParams.1.<init>(java.lang.String, java.lang.String, int, int):void type: CONSTRUCTOR in method: o.CreateParams.1.copy(java.lang.String, java.lang.String, int, int):o.CreateParams$1, dex: classes3.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 70 more
                        Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: o.CreateParams.1
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:649)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	... 74 more
                        */
                    /*
                        this = this;
                        java.lang.String r0 = "it"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                        o.CreateParams$1 r0 = new o.CreateParams$1
                        java.lang.String r1 = r5.$merchantId
                        java.lang.String r2 = r5.$shopId
                        int r3 = r5.$pageNum
                        int r4 = r5.$pageSize
                        r0.<init>(r1, r2, r3, r4)
                        o.isSticky r1 = r5.this$0
                        com.alipayplus.mobile.component.common.facade.base.MobileEnvInfo r1 = r1.generateMobileEnvInfo()
                        r0.envInfo = r1
                        kotlin.Unit r1 = kotlin.Unit.INSTANCE
                        o.setPluginId r6 = r6.queryPromoDanaDeal(r0)
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.isSticky.equals.invoke(o.BindingId):o.setPluginId");
                }
            }

            @Nullable
            public final Object createProductOrder(@NotNull getPluginId getpluginid, @NotNull Continuation<? super setParams> continuation) {
                return wrapper(new getMin(this, getpluginid), continuation);
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/ProductOrderResult;", "it", "Lid/dana/data/nearbyme/repository/source/network/MerchantInfoFacade;", "invoke"}, k = 3, mv = {1, 4, 2})
            static final class getMin extends Lambda implements Function1<BindingId, setParams> {
                final /* synthetic */ getPluginId $productOrderRequest;
                final /* synthetic */ isSticky this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                getMin(isSticky issticky, getPluginId getpluginid) {
                    super(1);
                    this.this$0 = issticky;
                    this.$productOrderRequest = getpluginid;
                }

                @NotNull
                public final setParams invoke(@NotNull BindingId bindingId) {
                    Intrinsics.checkNotNullParameter(bindingId, "it");
                    getPluginId getpluginid = this.$productOrderRequest;
                    getpluginid.envInfo = this.this$0.generateMobileEnvInfo();
                    Unit unit = Unit.INSTANCE;
                    return bindingId.createProductOrder(getpluginid);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantConsultResult;", "it", "Lid/dana/data/nearbyme/repository/source/network/MerchantInfoFacade;", "invoke"}, k = 3, mv = {1, 4, 2})
            static final class getMax extends Lambda implements Function1<BindingId, GoBackCallback> {
                final /* synthetic */ callBridgeApi $merchantConsultRequest;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                getMax(callBridgeApi callbridgeapi) {
                    super(1);
                    this.$merchantConsultRequest = callbridgeapi;
                }

                @NotNull
                public final GoBackCallback invoke(@NotNull BindingId bindingId) {
                    Intrinsics.checkNotNullParameter(bindingId, "it");
                    return bindingId.consultReview(this.$merchantConsultRequest);
                }
            }

            @Nullable
            public final Object consultMerchantReview(@NotNull callBridgeApi callbridgeapi, @NotNull Continuation<? super GoBackCallback> continuation) {
                return wrapper(new getMax(callbridgeapi), continuation);
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/data/nearbyme/repository/source/network/result/merchantreview/MerchantCreateReviewResult;", "it", "Lid/dana/data/nearbyme/repository/source/network/MerchantInfoFacade;", "invoke"}, k = 3, mv = {1, 4, 2})
            static final class setMax extends Lambda implements Function1<BindingId, setAppxDomain> {
                final /* synthetic */ ExitCallback $request;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                setMax(ExitCallback exitCallback) {
                    super(1);
                    this.$request = exitCallback;
                }

                @NotNull
                public final setAppxDomain invoke(@NotNull BindingId bindingId) {
                    Intrinsics.checkNotNullParameter(bindingId, "it");
                    return bindingId.createReview(this.$request);
                }
            }

            @Nullable
            public final Object createReview(@NotNull ExitCallback exitCallback, @NotNull Continuation<? super setAppxDomain> continuation) {
                return wrapper(new setMax(exitCallback), continuation);
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantAdditionalInfoResult;", "it", "Lid/dana/data/nearbyme/repository/source/network/MerchantInfoFacade;", "invoke"}, k = 3, mv = {1, 4, 2})
            static final class toFloatRange extends Lambda implements Function1<BindingId, LoadParams> {
                final /* synthetic */ getSourceProcess $request;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                toFloatRange(getSourceProcess getsourceprocess) {
                    super(1);
                    this.$request = getsourceprocess;
                }

                @NotNull
                public final LoadParams invoke(@NotNull BindingId bindingId) {
                    Intrinsics.checkNotNullParameter(bindingId, "it");
                    return bindingId.queryAdditionalInfo(this.$request);
                }
            }

            @Nullable
            public final Object queryAdditionalInfo(@NotNull getSourceProcess getsourceprocess, @NotNull Continuation<? super LoadParams> continuation) {
                return wrapper(new toFloatRange(getsourceprocess), continuation);
            }

            @Nullable
            public final Object getCoachmarkVisibility(@NotNull Continuation<? super Boolean> continuation) {
                throw new UnsupportedOperationException();
            }

            @Nullable
            public final Object setCoachmarkVisibility(boolean z, @NotNull Continuation<? super Unit> continuation) {
                throw new UnsupportedOperationException();
            }

            @Nullable
            public final Object saveMerchantImage(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull InitParams initParams, @NotNull Continuation<? super Unit> continuation) {
                return Unit.INSTANCE;
            }
        }
