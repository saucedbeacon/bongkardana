package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 4, 1})
final class CoroutineContext$plus$1 extends Lambda implements Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext> {
    public static final CoroutineContext$plus$1 INSTANCE = new CoroutineContext$plus$1();

    CoroutineContext$plus$1() {
        super(2);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [kotlin.coroutines.CombinedContext] */
    /* JADX WARNING: type inference failed for: r4v3, types: [kotlin.coroutines.CombinedContext] */
    /* JADX WARNING: type inference failed for: r0v10, types: [kotlin.coroutines.CombinedContext] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.coroutines.CoroutineContext invoke(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Element r5) {
        /*
            r3 = this;
            java.lang.String r0 = "acc"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "element"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.coroutines.CoroutineContext$Key r0 = r5.getKey()
            kotlin.coroutines.CoroutineContext r4 = r4.minusKey(r0)
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r4 != r0) goto L_0x0017
            goto L_0x0050
        L_0x0017:
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r4.get(r0)
            kotlin.coroutines.ContinuationInterceptor r0 = (kotlin.coroutines.ContinuationInterceptor) r0
            if (r0 != 0) goto L_0x002a
            kotlin.coroutines.CombinedContext r0 = new kotlin.coroutines.CombinedContext
            r0.<init>(r4, r5)
            r5 = r0
            goto L_0x0050
        L_0x002a:
            kotlin.coroutines.ContinuationInterceptor$Key r1 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Key r1 = (kotlin.coroutines.CoroutineContext.Key) r1
            kotlin.coroutines.CoroutineContext r4 = r4.minusKey(r1)
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r4 != r1) goto L_0x0041
            kotlin.coroutines.CombinedContext r4 = new kotlin.coroutines.CombinedContext
            kotlin.coroutines.CoroutineContext r5 = (kotlin.coroutines.CoroutineContext) r5
            kotlin.coroutines.CoroutineContext$Element r0 = (kotlin.coroutines.CoroutineContext.Element) r0
            r4.<init>(r5, r0)
            r5 = r4
            goto L_0x0050
        L_0x0041:
            kotlin.coroutines.CombinedContext r1 = new kotlin.coroutines.CombinedContext
            kotlin.coroutines.CombinedContext r2 = new kotlin.coroutines.CombinedContext
            r2.<init>(r4, r5)
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            kotlin.coroutines.CoroutineContext$Element r0 = (kotlin.coroutines.CoroutineContext.Element) r0
            r1.<init>(r2, r0)
            r5 = r1
        L_0x0050:
            kotlin.coroutines.CoroutineContext r5 = (kotlin.coroutines.CoroutineContext) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.CoroutineContext$plus$1.invoke(kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext$Element):kotlin.coroutines.CoroutineContext");
    }
}
