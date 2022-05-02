package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 1})
@DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super List<? extends T>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Iterator $iterator;
    final /* synthetic */ boolean $partialWindows;
    final /* synthetic */ boolean $reuseBuffer;
    final /* synthetic */ int $size;
    final /* synthetic */ int $step;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SlidingWindowKt$windowedIterator$1(int i, int i2, Iterator it, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.$size = i;
        this.$step = i2;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, continuation);
        slidingWindowKt$windowedIterator$1.L$0 = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((SlidingWindowKt$windowedIterator$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x012d A[SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L_0x0058
            if (r1 == r6) goto L_0x0045
            if (r1 == r5) goto L_0x0018
            if (r1 == r4) goto L_0x0033
            if (r1 == r3) goto L_0x0025
            if (r1 != r2) goto L_0x001d
        L_0x0018:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x017b
        L_0x001d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0025:
            java.lang.Object r1 = r12.L$1
            kotlin.collections.RingBuffer r1 = (kotlin.collections.RingBuffer) r1
            java.lang.Object r4 = r12.L$0
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r12
            goto L_0x015c
        L_0x0033:
            java.lang.Object r1 = r12.L$2
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r5 = r12.L$1
            kotlin.collections.RingBuffer r5 = (kotlin.collections.RingBuffer) r5
            java.lang.Object r8 = r12.L$0
            kotlin.sequences.SequenceScope r8 = (kotlin.sequences.SequenceScope) r8
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r12
            goto L_0x0127
        L_0x0045:
            int r1 = r12.I$0
            java.lang.Object r2 = r12.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r3 = r12.L$1
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r4 = r12.L$0
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r12
            goto L_0x00a7
        L_0x0058:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.L$0
            kotlin.sequences.SequenceScope r13 = (kotlin.sequences.SequenceScope) r13
            int r1 = r12.$size
            r8 = 1024(0x400, float:1.435E-42)
            int r1 = kotlin.ranges.RangesKt.coerceAtMost((int) r1, (int) r8)
            int r8 = r12.$step
            int r9 = r12.$size
            int r8 = r8 - r9
            if (r8 < 0) goto L_0x00dd
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r1 = 0
            java.util.Iterator r3 = r12.$iterator
            r4 = r13
            r13 = r12
            r11 = r3
            r3 = r2
            r2 = r11
        L_0x007b:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x00b8
            java.lang.Object r9 = r2.next()
            if (r1 <= 0) goto L_0x008a
            int r1 = r1 + -1
            goto L_0x007b
        L_0x008a:
            r3.add(r9)
            int r9 = r3.size()
            int r10 = r13.$size
            if (r9 != r10) goto L_0x007b
            r13.L$0 = r4
            r13.L$1 = r3
            r13.L$2 = r2
            r13.I$0 = r8
            r13.label = r6
            java.lang.Object r1 = r4.yield(r3, r13)
            if (r1 != r0) goto L_0x00a6
            return r0
        L_0x00a6:
            r1 = r8
        L_0x00a7:
            boolean r8 = r13.$reuseBuffer
            if (r8 == 0) goto L_0x00af
            r3.clear()
            goto L_0x00b6
        L_0x00af:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r8 = r13.$size
            r3.<init>(r8)
        L_0x00b6:
            r8 = r1
            goto L_0x007b
        L_0x00b8:
            r1 = r3
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x017b
            boolean r1 = r13.$partialWindows
            if (r1 != 0) goto L_0x00ce
            int r1 = r3.size()
            int r2 = r13.$size
            if (r1 != r2) goto L_0x017b
        L_0x00ce:
            r13.L$0 = r7
            r13.L$1 = r7
            r13.L$2 = r7
            r13.label = r5
            java.lang.Object r13 = r4.yield(r3, r13)
            if (r13 != r0) goto L_0x017b
            return r0
        L_0x00dd:
            kotlin.collections.RingBuffer r5 = new kotlin.collections.RingBuffer
            r5.<init>(r1)
            java.util.Iterator r1 = r12.$iterator
            r8 = r13
            r13 = r12
        L_0x00e6:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x012d
            java.lang.Object r9 = r1.next()
            r5.add(r9)
            boolean r9 = r5.isFull()
            if (r9 == 0) goto L_0x00e6
            int r9 = r5.size()
            int r10 = r13.$size
            if (r9 >= r10) goto L_0x0106
            kotlin.collections.RingBuffer r5 = r5.expanded(r10)
            goto L_0x00e6
        L_0x0106:
            boolean r9 = r13.$reuseBuffer
            if (r9 == 0) goto L_0x010e
            r9 = r5
            java.util.List r9 = (java.util.List) r9
            goto L_0x0118
        L_0x010e:
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = r5
            java.util.Collection r10 = (java.util.Collection) r10
            r9.<init>(r10)
            java.util.List r9 = (java.util.List) r9
        L_0x0118:
            r13.L$0 = r8
            r13.L$1 = r5
            r13.L$2 = r1
            r13.label = r4
            java.lang.Object r9 = r8.yield(r9, r13)
            if (r9 != r0) goto L_0x0127
            return r0
        L_0x0127:
            int r9 = r13.$step
            r5.removeFirst(r9)
            goto L_0x00e6
        L_0x012d:
            boolean r1 = r13.$partialWindows
            if (r1 == 0) goto L_0x017b
            r1 = r5
            r4 = r8
        L_0x0133:
            int r5 = r1.size()
            int r8 = r13.$step
            if (r5 <= r8) goto L_0x0162
            boolean r5 = r13.$reuseBuffer
            if (r5 == 0) goto L_0x0143
            r5 = r1
            java.util.List r5 = (java.util.List) r5
            goto L_0x014d
        L_0x0143:
            java.util.ArrayList r5 = new java.util.ArrayList
            r8 = r1
            java.util.Collection r8 = (java.util.Collection) r8
            r5.<init>(r8)
            java.util.List r5 = (java.util.List) r5
        L_0x014d:
            r13.L$0 = r4
            r13.L$1 = r1
            r13.L$2 = r7
            r13.label = r3
            java.lang.Object r5 = r4.yield(r5, r13)
            if (r5 != r0) goto L_0x015c
            return r0
        L_0x015c:
            int r5 = r13.$step
            r1.removeFirst(r5)
            goto L_0x0133
        L_0x0162:
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x017b
            r13.L$0 = r7
            r13.L$1 = r7
            r13.L$2 = r7
            r13.label = r2
            java.lang.Object r13 = r4.yield(r1, r13)
            if (r13 != r0) goto L_0x017b
            return r0
        L_0x017b:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt$windowedIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
