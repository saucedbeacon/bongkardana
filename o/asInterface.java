package o;

import com.alipay.mobile.security.bio.api.BioError;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J#\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0010H&J\u0019\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0017H@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u0011\u0010\u001f\u001a\u00020\u0017H@ø\u0001\u0000¢\u0006\u0002\u0010 J#\u0010!\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u00122\u0006\u0010#\u001a\u00020\u0017H@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0017H\u0002J\u001c\u0010%\u001a\u00020&2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010(\u001a\u0004\u0018\u00010\u0012H\u0002J\u0019\u0010)\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H¦@ø\u0001\u0000¢\u0006\u0002\u0010*J#\u0010+\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0019\u0010,\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0017H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u0019\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u0017H@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ!\u0010/\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017H@ø\u0001\u0000¢\u0006\u0002\u00100R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lid/dana/lib/electronicmoney/mandiri/base/AbstractEmoneyRepository;", "", "emoneyCallback", "Lid/dana/lib/electronicmoney/mandiri/EmoneyCallback;", "apduCommandProvider", "Lid/dana/lib/electronicmoney/mandiri/apducommand/ApduCommandProvider;", "emoneyCardAttribute", "Lid/dana/lib/electronicmoney/mandiri/model/EmoneyCardAttribute;", "(Lid/dana/lib/electronicmoney/mandiri/EmoneyCallback;Lid/dana/lib/electronicmoney/mandiri/apducommand/ApduCommandProvider;Lid/dana/lib/electronicmoney/mandiri/model/EmoneyCardAttribute;)V", "getApduCommandProvider", "()Lid/dana/lib/electronicmoney/mandiri/apducommand/ApduCommandProvider;", "getEmoneyCallback", "()Lid/dana/lib/electronicmoney/mandiri/EmoneyCallback;", "getEmoneyCardAttribute", "()Lid/dana/lib/electronicmoney/mandiri/model/EmoneyCardAttribute;", "confirm", "", "cardType", "", "session", "doAfterInquiry", "Lid/dana/lib/electronicmoney/entity/BalanceResult;", "inquiry", "Lid/dana/lib/electronicmoney/mandiri/model/EmoneyApiResult;", "count", "", "(Lid/dana/lib/electronicmoney/mandiri/model/EmoneyApiResult;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doAfterReversal", "doGetTopupCommand", "inquiryResult", "(Lid/dana/lib/electronicmoney/mandiri/model/EmoneyApiResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCardDataForInquiry", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopupCommand", "state", "data", "(Ljava/lang/String;Lid/dana/lib/electronicmoney/mandiri/model/EmoneyApiResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPendingTopupNotExist", "", "result", "indicator", "reversal", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBalance", "writeMessageToCard", "writeToCardFail", "write", "writeToCardSuccess", "(Lid/dana/lib/electronicmoney/mandiri/model/EmoneyApiResult;Lid/dana/lib/electronicmoney/mandiri/model/EmoneyApiResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
public abstract class asInterface {
    @NotNull
    public final setBarBottomLineColor getMin;
    @NotNull
    public final hideBackButton length;
    @NotNull
    public final asBinder setMax;

    @DebugMetadata(c = "id.dana.lib.electronicmoney.mandiri.base.AbstractEmoneyRepository", f = "AbstractEmoneyRepository.kt", i = {0, 0, 1, 1, 1}, l = {126, 136}, m = "writeToCardFail", n = {"this", "write", "this", "write", "reversal"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class equals extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f10809a;
        public int b;
        public final /* synthetic */ asInterface c;
        public Object d;
        public Object e;
        public Object f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public equals(asInterface asinterface, Continuation continuation) {
            super(continuation);
            this.c = asinterface;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10809a = obj;
            this.b |= Integer.MIN_VALUE;
            return this.c.setMin((hideTitleLoading) null, (Continuation<? super ICustomTabsCallback>) this);
        }
    }

    public static final class getMax implements Function1<hideTitleLoading, Unit> {
        public final /* synthetic */ Continuation setMin;

        public getMax(Continuation continuation) {
            this.setMin = continuation;
        }

        public final Object invoke(Object obj) {
            hideTitleLoading hidetitleloading = (hideTitleLoading) obj;
            Intrinsics.checkNotNullParameter(hidetitleloading, "result");
            Continuation continuation = this.setMin;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m1constructorimpl(hidetitleloading));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "id.dana.lib.electronicmoney.mandiri.base.AbstractEmoneyRepository", f = "AbstractEmoneyRepository.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4}, l = {95, 99, 116, 118, 119}, m = "doGetTopupCommand", n = {"this", "inquiryResult", "this", "inquiryResult", "command", "this", "inquiryResult", "command", "this", "inquiryResult", "command", "write", "this", "inquiryResult", "command", "write"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class getMin extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f10810a;
        public int b;
        public final /* synthetic */ asInterface c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMin(asInterface asinterface, Continuation continuation) {
            super(continuation);
            this.c = asinterface;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10810a = obj;
            this.b |= Integer.MIN_VALUE;
            return this.c.setMax((hideTitleLoading) null, (Continuation<? super ICustomTabsCallback>) this);
        }
    }

    public static final class length implements Function1<hideTitleLoading, Unit> {
        public final /* synthetic */ Continuation length;

        public length(Continuation continuation) {
            this.length = continuation;
        }

        public final Object invoke(Object obj) {
            hideTitleLoading hidetitleloading = (hideTitleLoading) obj;
            Intrinsics.checkNotNullParameter(hidetitleloading, "result");
            Continuation continuation = this.length;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m1constructorimpl(hidetitleloading));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "id.dana.lib.electronicmoney.mandiri.base.AbstractEmoneyRepository", f = "AbstractEmoneyRepository.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {30, 31, 31}, m = "updateBalance", n = {"this", "inquiry", "count", "this", "inquiry", "count", "this", "inquiry", "count"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
    public static final class setMax extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f10811a;
        public int b;
        public final /* synthetic */ asInterface c;
        public Object d;
        public Object e;
        public Object f;
        public int g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(asInterface asinterface, Continuation continuation) {
            super(continuation);
            this.c = asinterface;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10811a = obj;
            this.b |= Integer.MIN_VALUE;
            return this.c.getMax((hideTitleLoading) null, 0, this);
        }
    }

    @DebugMetadata(c = "id.dana.lib.electronicmoney.mandiri.base.AbstractEmoneyRepository", f = "AbstractEmoneyRepository.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {59, 69, 82}, m = "doAfterInquiry", n = {"this", "inquiry", "count", "this", "inquiry", "count", "reversal", "this", "inquiry", "count"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$2", "L$0", "L$1", "I$0"})
    public static final class setMin extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f10812a;
        public int b;
        public final /* synthetic */ asInterface c;
        public Object d;
        public Object e;
        public Object f;
        public int g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMin(asInterface asinterface, Continuation continuation) {
            super(continuation);
            this.c = asinterface;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10812a = obj;
            this.b |= Integer.MIN_VALUE;
            return this.c.getMin((hideTitleLoading) null, 0, (Continuation<? super ICustomTabsCallback>) this);
        }
    }

    @DebugMetadata(c = "id.dana.lib.electronicmoney.mandiri.base.AbstractEmoneyRepository", f = "AbstractEmoneyRepository.kt", i = {0, 0, 0}, l = {153}, m = "writeToCardSuccess", n = {"this", "write", "inquiryResult"}, s = {"L$0", "L$1", "L$2"})
    public static final class toIntRange extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f10813a;
        public int b;
        public final /* synthetic */ asInterface c;
        public Object d;
        public Object e;
        public Object f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public toIntRange(asInterface asinterface, Continuation continuation) {
            super(continuation);
            this.c = asinterface;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10813a = obj;
            this.b |= Integer.MIN_VALUE;
            return this.c.setMin((hideTitleLoading) null, (hideTitleLoading) null, this);
        }
    }

    public asInterface(@NotNull setBarBottomLineColor setbarbottomlinecolor, @NotNull asBinder asbinder, @NotNull hideBackButton hidebackbutton) {
        Intrinsics.checkNotNullParameter(setbarbottomlinecolor, "emoneyCallback");
        Intrinsics.checkNotNullParameter(asbinder, "apduCommandProvider");
        Intrinsics.checkNotNullParameter(hidebackbutton, "emoneyCardAttribute");
        this.getMin = setbarbottomlinecolor;
        this.setMax = asbinder;
        this.length = hidebackbutton;
    }

    private void length(String str, String str2) {
        String str3;
        String str4;
        String str5 = str;
        hideBackButton min = setMin();
        Intrinsics.checkNotNullParameter(min, "emoneyCardAttribute");
        Intrinsics.checkNotNullParameter(str5, "cardType");
        String str6 = !Intrinsics.areEqual((Object) str5, (Object) "NEW") ? "" : str2;
        String str7 = min.isInside;
        if (str7 != null) {
            str3 = str7.substring(0, 16);
            Intrinsics.checkNotNullExpressionValue(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        getMin().callConfirm(new hideBackButton("CONFIRM", str6, str, (String) null, (String) null, str4, (String) null, (String) null, (String) null, (String) null, (Map) null, BioError.RESULT_PAY_FAIL));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if ((r4 == null || kotlin.text.StringsKt.isBlank(r4)) == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean setMax(java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "NEW"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001f
            if (r4 == 0) goto L_0x0012
            int r0 = java.lang.Integer.parseInt(r4)
            if (r0 == 0) goto L_0x002f
        L_0x0012:
            if (r4 == 0) goto L_0x001c
            boolean r0 = kotlin.text.StringsKt.isBlank(r4)
            if (r0 != 0) goto L_0x001c
            r0 = 0
            goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            if (r0 != 0) goto L_0x002f
        L_0x001f:
            java.lang.String r0 = "OLD"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
            if (r3 == 0) goto L_0x0030
            java.lang.String r3 = "AE11012068051003"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x0030
        L_0x002f:
            return r1
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.asInterface.setMax(java.lang.String, java.lang.String):boolean");
    }

    @Nullable
    public abstract Object getMax(@NotNull hideTitleLoading hidetitleloading, @NotNull Continuation<? super hideTitleLoading> continuation);

    @Nullable
    public final Object getMin(@Nullable String str, @NotNull hideTitleLoading hidetitleloading, @NotNull Continuation<? super hideTitleLoading> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        onRelationshipValidationResult onrelationshipvalidationresult = onRelationshipValidationResult.setMax;
        getMin().callGetTopupCommand(onRelationshipValidationResult.setMin(setMin(), length(), str, hidetitleloading), new getMax(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @NotNull
    public setBarBottomLineColor getMin() {
        return this.getMin;
    }

    @NotNull
    public asBinder length() {
        return this.setMax;
    }

    @Nullable
    public abstract Object setMin(@NotNull String str, @NotNull Continuation<? super hideTitleLoading> continuation);

    @NotNull
    public hideBackButton setMin() {
        return this.length;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getMax(@org.jetbrains.annotations.NotNull o.hideTitleLoading r20, int r21, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.ICustomTabsCallback> r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            boolean r4 = r3 instanceof o.asInterface.setMax
            if (r4 == 0) goto L_0x001b
            r4 = r3
            o.asInterface$setMax r4 = (o.asInterface.setMax) r4
            int r5 = r4.b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.b = r5
            goto L_0x0020
        L_0x001b:
            o.asInterface$setMax r4 = new o.asInterface$setMax
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.f10811a
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r4.b
            r7 = 3
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x0061
            if (r6 == r9) goto L_0x005c
            if (r6 == r8) goto L_0x0044
            if (r6 != r7) goto L_0x003c
            java.lang.Object r1 = r4.d
            o.asInterface r1 = (o.asInterface) r1
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00bf
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0044:
            java.lang.Object r1 = r4.f
            o.asInterface r1 = (o.asInterface) r1
            int r2 = r4.g
            java.lang.Object r6 = r4.e
            o.hideTitleLoading r6 = (o.hideTitleLoading) r6
            java.lang.Object r8 = r4.d
            o.asInterface r8 = (o.asInterface) r8
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ Exception -> 0x00c4 }
            r18 = r3
            r3 = r1
            r1 = r6
            r6 = r18
            goto L_0x00ad
        L_0x005c:
            java.lang.Object r1 = r4.d
            o.asInterface r1 = (o.asInterface) r1
            goto L_0x0037
        L_0x0061:
            kotlin.ResultKt.throwOnFailure(r3)
            if (r2 > 0) goto L_0x0077
            r4.d = r0     // Catch:{ Exception -> 0x00c2 }
            r4.e = r1     // Catch:{ Exception -> 0x00c2 }
            r4.g = r2     // Catch:{ Exception -> 0x00c2 }
            r4.b = r9     // Catch:{ Exception -> 0x00c2 }
            java.lang.Object r3 = r0.getMin((o.hideTitleLoading) r1, (int) r2, (kotlin.coroutines.Continuation<? super o.ICustomTabsCallback>) r4)     // Catch:{ Exception -> 0x00c2 }
            if (r3 != r5) goto L_0x0075
            return r5
        L_0x0075:
            r1 = r0
            goto L_0x00bf
        L_0x0077:
            r4.d = r0     // Catch:{ Exception -> 0x00c2 }
            r4.e = r1     // Catch:{ Exception -> 0x00c2 }
            r4.g = r2     // Catch:{ Exception -> 0x00c2 }
            r4.f = r0     // Catch:{ Exception -> 0x00c2 }
            r4.b = r8     // Catch:{ Exception -> 0x00c2 }
            kotlin.coroutines.SafeContinuation r3 = new kotlin.coroutines.SafeContinuation     // Catch:{ Exception -> 0x00c2 }
            kotlin.coroutines.Continuation r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r4)     // Catch:{ Exception -> 0x00c2 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x00c2 }
            o.hideBackButton r6 = r19.setMin()     // Catch:{ Exception -> 0x00c2 }
            o.asInterface$length r8 = new o.asInterface$length     // Catch:{ Exception -> 0x00c2 }
            r8.<init>(r3)     // Catch:{ Exception -> 0x00c2 }
            o.setBarBottomLineColor r9 = r19.getMin()     // Catch:{ Exception -> 0x00c2 }
            r9.callInquiryBalance(r6, r8)     // Catch:{ Exception -> 0x00c2 }
            java.lang.Object r3 = r3.getOrThrow()     // Catch:{ Exception -> 0x00c2 }
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch:{ Exception -> 0x00c2 }
            if (r3 != r6) goto L_0x00a7
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r4)     // Catch:{ Exception -> 0x00c2 }
        L_0x00a7:
            if (r3 != r5) goto L_0x00aa
            return r5
        L_0x00aa:
            r8 = r0
            r6 = r3
            r3 = r8
        L_0x00ad:
            o.hideTitleLoading r6 = (o.hideTitleLoading) r6     // Catch:{ Exception -> 0x00c4 }
            r4.d = r8     // Catch:{ Exception -> 0x00c4 }
            r4.e = r1     // Catch:{ Exception -> 0x00c4 }
            r4.g = r2     // Catch:{ Exception -> 0x00c4 }
            r4.b = r7     // Catch:{ Exception -> 0x00c4 }
            java.lang.Object r3 = r3.getMin((o.hideTitleLoading) r6, (int) r2, (kotlin.coroutines.Continuation<? super o.ICustomTabsCallback>) r4)     // Catch:{ Exception -> 0x00c4 }
            if (r3 != r5) goto L_0x00be
            return r5
        L_0x00be:
            r1 = r8
        L_0x00bf:
            o.ICustomTabsCallback r3 = (o.ICustomTabsCallback) r3     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00e1
        L_0x00c2:
            r1 = r0
        L_0x00c3:
            r8 = r1
        L_0x00c4:
            o.ICustomTabsCallback r3 = new o.ICustomTabsCallback
            o.hideBackButton r1 = r8.setMin()
            java.lang.String r12 = r1.IsOverlapping
            o.hideBackButton r1 = r8.setMin()
            java.lang.String r13 = r1.equals
            r10 = 0
            r16 = 0
            r17 = 192(0xc0, float:2.69E-43)
            java.lang.String r11 = "emoney"
            java.lang.String r14 = ""
            java.lang.String r15 = "009"
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x00e1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.asInterface.getMax(o.hideTitleLoading, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object getMin(@org.jetbrains.annotations.NotNull o.hideTitleLoading r21, int r22, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.ICustomTabsCallback> r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            boolean r4 = r3 instanceof o.asInterface.setMin
            if (r4 == 0) goto L_0x001b
            r4 = r3
            o.asInterface$setMin r4 = (o.asInterface.setMin) r4
            int r5 = r4.b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.b = r5
            goto L_0x0020
        L_0x001b:
            o.asInterface$setMin r4 = new o.asInterface$setMin
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.f10812a
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r4.b
            r7 = 2
            r8 = 1
            r9 = 3
            if (r6 == 0) goto L_0x0058
            if (r6 == r8) goto L_0x0045
            if (r6 == r7) goto L_0x0040
            if (r6 != r9) goto L_0x0038
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x0107
        L_0x0038:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x00ec
        L_0x0045:
            int r1 = r4.g
            java.lang.Object r2 = r4.e
            o.hideTitleLoading r2 = (o.hideTitleLoading) r2
            java.lang.Object r6 = r4.d
            o.asInterface r6 = (o.asInterface) r6
            kotlin.ResultKt.throwOnFailure(r3)
            r19 = r2
            r2 = r1
            r1 = r19
            goto L_0x00b4
        L_0x0058:
            kotlin.ResultKt.throwOnFailure(r3)
            boolean r3 = getMin(r21)
            if (r3 == 0) goto L_0x007e
            o.ICustomTabsCallback r1 = new o.ICustomTabsCallback
            o.hideBackButton r2 = r20.setMin()
            java.lang.String r14 = r2.equals
            o.hideBackButton r2 = r20.setMin()
            java.lang.String r13 = r2.IsOverlapping
            r11 = 1
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 240(0xf0, float:3.36E-43)
            java.lang.String r12 = "emoney"
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return r1
        L_0x007e:
            java.lang.String r3 = r1.length
            java.lang.String r6 = "REVERSAL_NEEDED"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r6)
            if (r3 != 0) goto L_0x009c
            java.lang.String r3 = r1.length
            java.lang.String r6 = "REVERSAL_IN_PROGRESS"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r6)
            if (r3 != 0) goto L_0x009c
            java.lang.String r3 = r1.length
            java.lang.String r6 = "REVERSAL_LIMIT_EXCEEDED"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r6)
            if (r3 == 0) goto L_0x00f0
        L_0x009c:
            if (r2 > r9) goto L_0x00f0
            java.lang.String r3 = r1.IsOverlapping
            if (r3 != 0) goto L_0x00a4
            java.lang.String r3 = ""
        L_0x00a4:
            r4.d = r0
            r4.e = r1
            r4.g = r2
            r4.b = r8
            java.lang.Object r3 = r0.setMin((java.lang.String) r3, (kotlin.coroutines.Continuation<? super o.hideTitleLoading>) r4)
            if (r3 != r5) goto L_0x00b3
            return r5
        L_0x00b3:
            r6 = r0
        L_0x00b4:
            o.hideTitleLoading r3 = (o.hideTitleLoading) r3
            boolean r8 = r3.setMin()
            if (r8 != 0) goto L_0x00d9
            o.ICustomTabsCallback r1 = new o.ICustomTabsCallback
            java.lang.String r15 = r3.length
            o.hideBackButton r2 = r6.setMin()
            java.lang.String r13 = r2.equals
            o.hideBackButton r2 = r6.setMin()
            java.lang.String r12 = r2.IsOverlapping
            r10 = 0
            r14 = 0
            r16 = 0
            r17 = 208(0xd0, float:2.91E-43)
            java.lang.String r11 = "emoney"
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00ef
        L_0x00d9:
            int r8 = r2 + 1
            r4.d = r6
            r4.e = r1
            r4.g = r2
            r4.f = r3
            r4.b = r7
            java.lang.Object r3 = r6.getMax(r1, r8, r4)
            if (r3 != r5) goto L_0x00ec
            return r5
        L_0x00ec:
            r1 = r3
            o.ICustomTabsCallback r1 = (o.ICustomTabsCallback) r1
        L_0x00ef:
            return r1
        L_0x00f0:
            if (r2 > r9) goto L_0x010a
            boolean r3 = r21.setMin()
            if (r3 == 0) goto L_0x010a
            r4.d = r0
            r4.e = r1
            r4.g = r2
            r4.b = r9
            java.lang.Object r3 = r0.setMax((o.hideTitleLoading) r1, (kotlin.coroutines.Continuation<? super o.ICustomTabsCallback>) r4)
            if (r3 != r5) goto L_0x0107
            return r5
        L_0x0107:
            o.ICustomTabsCallback r3 = (o.ICustomTabsCallback) r3
            return r3
        L_0x010a:
            o.ICustomTabsCallback r1 = new o.ICustomTabsCallback
            o.hideBackButton r2 = r20.setMin()
            java.lang.String r8 = r2.equals
            o.hideBackButton r2 = r20.setMin()
            java.lang.String r7 = r2.IsOverlapping
            r5 = 0
            r9 = 0
            r11 = 0
            r12 = 208(0xd0, float:2.91E-43)
            java.lang.String r6 = "emoney"
            java.lang.String r10 = ""
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.asInterface.getMin(o.hideTitleLoading, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object setMax(@org.jetbrains.annotations.NotNull o.hideTitleLoading r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.ICustomTabsCallback> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof o.asInterface.getMin
            if (r0 == 0) goto L_0x0013
            r0 = r15
            o.asInterface$getMin r0 = (o.asInterface.getMin) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0018
        L_0x0013:
            o.asInterface$getMin r0 = new o.asInterface$getMin
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f10810a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0060
            if (r2 == r7) goto L_0x0054
            if (r2 == r6) goto L_0x0050
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            goto L_0x003a
        L_0x0032:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x010f
        L_0x003f:
            java.lang.Object r14 = r0.f
            o.hideTitleLoading r14 = (o.hideTitleLoading) r14
            java.lang.Object r2 = r0.e
            o.hideTitleLoading r2 = (o.hideTitleLoading) r2
            java.lang.Object r5 = r0.d
            o.asInterface r5 = (o.asInterface) r5
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00ed
        L_0x0050:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x009f
        L_0x0054:
            java.lang.Object r14 = r0.e
            o.hideTitleLoading r14 = (o.hideTitleLoading) r14
            java.lang.Object r2 = r0.d
            o.asInterface r2 = (o.asInterface) r2
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0083
        L_0x0060:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.String r15 = r14.IsOverlapping
            java.lang.String r2 = "NEW"
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r2)
            if (r15 == 0) goto L_0x0074
            java.util.Map<java.lang.String, java.lang.String> r15 = r14.toIntRange
            java.lang.String r2 = "dataToSam"
            r15.get(r2)
        L_0x0074:
            r0.d = r13
            r0.e = r14
            r0.b = r7
            r15 = 0
            java.lang.Object r15 = r13.getMin((java.lang.String) r15, (o.hideTitleLoading) r14, (kotlin.coroutines.Continuation<? super o.hideTitleLoading>) r0)
            if (r15 != r1) goto L_0x0082
            return r1
        L_0x0082:
            r2 = r13
        L_0x0083:
            o.hideTitleLoading r15 = (o.hideTitleLoading) r15
            java.lang.String r7 = r15.length
            java.lang.String r8 = "TIMEOUT"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x00a0
            r0.d = r2
            r0.e = r14
            r0.f = r15
            r0.b = r6
            r15 = 0
            java.lang.Object r15 = r2.getMax(r14, r15, r0)
            if (r15 != r1) goto L_0x009f
            return r1
        L_0x009f:
            return r15
        L_0x00a0:
            boolean r6 = getMin(r15)
            if (r6 == 0) goto L_0x00d9
            java.lang.String r15 = r14.IsOverlapping
            java.lang.String r0 = ""
            if (r15 != 0) goto L_0x00ad
            r15 = r0
        L_0x00ad:
            java.util.Map<java.lang.String, java.lang.String> r14 = r14.toIntRange
            java.lang.String r1 = "session"
            java.lang.Object r14 = r14.get(r1)
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r0 = r14
        L_0x00bb:
            r2.length(r15, r0)
            o.ICustomTabsCallback r14 = new o.ICustomTabsCallback
            o.hideBackButton r15 = r2.setMin()
            java.lang.String r7 = r15.equals
            o.hideBackButton r15 = r2.setMin()
            java.lang.String r6 = r15.IsOverlapping
            r4 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 240(0xf0, float:3.36E-43)
            java.lang.String r5 = "emoney"
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r14
        L_0x00d9:
            r0.d = r2
            r0.e = r14
            r0.f = r15
            r0.b = r5
            java.lang.Object r5 = r2.getMax(r15, r0)
            if (r5 != r1) goto L_0x00e8
            return r1
        L_0x00e8:
            r12 = r2
            r2 = r14
            r14 = r15
            r15 = r5
            r5 = r12
        L_0x00ed:
            o.hideTitleLoading r15 = (o.hideTitleLoading) r15
            boolean r6 = r15.setMin()
            r0.d = r5
            r0.e = r2
            r0.f = r14
            r0.g = r15
            if (r6 != 0) goto L_0x0106
            r0.b = r4
            java.lang.Object r15 = r5.setMin((o.hideTitleLoading) r15, (kotlin.coroutines.Continuation<? super o.ICustomTabsCallback>) r0)
            if (r15 != r1) goto L_0x010f
            return r1
        L_0x0106:
            r0.b = r3
            java.lang.Object r15 = r5.setMin(r15, r2, r0)
            if (r15 != r1) goto L_0x010f
            return r1
        L_0x010f:
            o.ICustomTabsCallback r15 = (o.ICustomTabsCallback) r15
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.asInterface.setMax(o.hideTitleLoading, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object setMin(@org.jetbrains.annotations.NotNull o.hideTitleLoading r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.ICustomTabsCallback> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof o.asInterface.equals
            if (r3 == 0) goto L_0x0019
            r3 = r2
            o.asInterface$equals r3 = (o.asInterface.equals) r3
            int r4 = r3.b
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.b = r4
            goto L_0x001e
        L_0x0019:
            o.asInterface$equals r3 = new o.asInterface$equals
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f10809a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x0046
            if (r5 == r7) goto L_0x003a
            if (r5 != r6) goto L_0x0032
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x009c
        L_0x0032:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003a:
            java.lang.Object r1 = r3.e
            o.hideTitleLoading r1 = (o.hideTitleLoading) r1
            java.lang.Object r5 = r3.d
            o.asInterface r5 = (o.asInterface) r5
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0069
        L_0x0046:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.String r2 = r1.length
            java.lang.String r5 = "REVERSAL_NEEDED"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r5)
            java.lang.String r5 = ""
            if (r2 == 0) goto L_0x00a0
            java.lang.String r2 = r1.IsOverlapping
            if (r2 != 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r5 = r2
        L_0x005b:
            r3.d = r0
            r3.e = r1
            r3.b = r7
            java.lang.Object r2 = r0.setMin((java.lang.String) r5, (kotlin.coroutines.Continuation<? super o.hideTitleLoading>) r3)
            if (r2 != r4) goto L_0x0068
            return r4
        L_0x0068:
            r5 = r0
        L_0x0069:
            o.hideTitleLoading r2 = (o.hideTitleLoading) r2
            boolean r7 = r2.setMin()
            if (r7 != 0) goto L_0x008d
            o.ICustomTabsCallback r1 = new o.ICustomTabsCallback
            java.lang.String r14 = r2.length
            o.hideBackButton r2 = r5.setMin()
            java.lang.String r12 = r2.equals
            o.hideBackButton r2 = r5.setMin()
            java.lang.String r11 = r2.IsOverlapping
            r9 = 0
            r13 = 0
            r15 = 0
            r16 = 208(0xd0, float:2.91E-43)
            java.lang.String r10 = "emoney"
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x009f
        L_0x008d:
            r3.d = r5
            r3.e = r1
            r3.f = r2
            r3.b = r6
            java.lang.Object r2 = r5.setMax((o.hideTitleLoading) r2, (kotlin.coroutines.Continuation<? super o.ICustomTabsCallback>) r3)
            if (r2 != r4) goto L_0x009c
            return r4
        L_0x009c:
            r1 = r2
            o.ICustomTabsCallback r1 = (o.ICustomTabsCallback) r1
        L_0x009f:
            return r1
        L_0x00a0:
            o.ICustomTabsCallback r11 = new o.ICustomTabsCallback
            java.lang.String r1 = r1.length
            if (r1 != 0) goto L_0x00a8
            r8 = r5
            goto L_0x00a9
        L_0x00a8:
            r8 = r1
        L_0x00a9:
            r3 = 0
            o.hideBackButton r1 = r17.setMin()
            java.lang.String r6 = r1.equals
            o.hideBackButton r1 = r17.setMin()
            java.lang.String r5 = r1.IsOverlapping
            r7 = 0
            r9 = 0
            r10 = 208(0xd0, float:2.91E-43)
            java.lang.String r4 = "emoney"
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.asInterface.setMin(o.hideTitleLoading, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: o.hideTitleLoading} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object setMin(@org.jetbrains.annotations.NotNull o.hideTitleLoading r10, @org.jetbrains.annotations.NotNull o.hideTitleLoading r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.ICustomTabsCallback> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof o.asInterface.toIntRange
            if (r0 == 0) goto L_0x0013
            r0 = r12
            o.asInterface$toIntRange r0 = (o.asInterface.toIntRange) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0018
        L_0x0013:
            o.asInterface$toIntRange r0 = new o.asInterface$toIntRange
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f10813a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r10 = r0.f
            r11 = r10
            o.hideTitleLoading r11 = (o.hideTitleLoading) r11
            java.lang.Object r10 = r0.d
            o.asInterface r10 = (o.asInterface) r10
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0058
        L_0x0032:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.String r12 = r10.IsOverlapping
            java.lang.String r2 = "OLD"
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r2)
            if (r12 == 0) goto L_0x0057
            r0.d = r9
            r0.e = r10
            r0.f = r11
            r0.b = r3
            r12 = 0
            java.lang.Object r10 = r9.getMin((java.lang.String) r12, (o.hideTitleLoading) r10, (kotlin.coroutines.Continuation<? super o.hideTitleLoading>) r0)
            if (r10 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r10 = r9
        L_0x0058:
            java.lang.String r12 = r11.IsOverlapping
            java.lang.String r0 = ""
            if (r12 != 0) goto L_0x005f
            r12 = r0
        L_0x005f:
            java.util.Map<java.lang.String, java.lang.String> r11 = r11.toIntRange
            java.lang.String r1 = "session"
            java.lang.Object r11 = r11.get(r1)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r0 = r11
        L_0x006d:
            r10.length(r12, r0)
            o.hideBackButton r11 = r10.setMin()
            java.lang.String r4 = r11.equals
            o.asBinder r11 = r10.length()     // Catch:{ Exception -> 0x007f }
            java.lang.String r10 = r11.getMin()     // Catch:{ Exception -> 0x007f }
            goto L_0x0085
        L_0x007f:
            o.hideBackButton r10 = r10.setMin()
            java.lang.String r10 = r10.IsOverlapping
        L_0x0085:
            r3 = r10
            o.ICustomTabsCallback r10 = new o.ICustomTabsCallback
            r1 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 240(0xf0, float:3.36E-43)
            java.lang.String r2 = "emoney"
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.asInterface.setMin(o.hideTitleLoading, o.hideTitleLoading, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static boolean getMin(hideTitleLoading hidetitleloading) {
        String str = hidetitleloading.IsOverlapping;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = hidetitleloading.toIntRange.get("amount");
        if (str3 == null) {
            str3 = hidetitleloading.toIntRange.get("pendingTopup");
        }
        if (str3 == null) {
            String str4 = hidetitleloading.length;
            if (str4 != null) {
                str2 = str4;
            }
        } else {
            str2 = str3;
        }
        return setMax(str, str2);
    }
}
