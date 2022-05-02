package o;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@"}, d2 = {"queryAdditionalInfo", "", "merchantId", "", "bizInfo", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/nearbyme/model/MerchantAdditionalInfo;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "id.dana.data.nearbyme.repository.MerchantInfoEntityRepository", f = "MerchantInfoEntityRepository.kt", i = {}, l = {172}, m = "queryAdditionalInfo", n = {}, s = {})
final class tryToInjectStartupParamsAndPushWorker$FastBitmap$CoordinateSystem extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ tryToInjectStartupParamsAndPushWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    tryToInjectStartupParamsAndPushWorker$FastBitmap$CoordinateSystem(tryToInjectStartupParamsAndPushWorker trytoinjectstartupparamsandpushworker, Continuation continuation) {
        super(continuation);
        this.this$0 = trytoinjectstartupparamsandpushworker;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.queryAdditionalInfo((String) null, (String) null, this);
    }
}
