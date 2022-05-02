package o;

import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0007\u001a\u00028\u0001H&¢\u0006\u0002\u0010\bJ\u0013\u0010\t\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lid/dana/domain/core/usecase/BlockingUseCase;", "T", "Params", "", "()V", "buildUseCase", "Lio/reactivex/Single;", "params", "(Ljava/lang/Object;)Lio/reactivex/Single;", "execute", "(Ljava/lang/Object;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 4, 2})
public abstract class onReceivedTitle<T, Params> {
    @NotNull
    public abstract TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<T> buildUseCase(Params params);

    public final T execute(Params params) {
        return buildUseCase(params).setMin();
    }
}
