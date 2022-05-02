package o;

import android.content.Context;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;

public final class ServerMsgReceiver implements getAdapterPosition<onRegister> {
    private final b.C0007b<onAppResume> getMax;
    private final b.C0007b<Context> getMin;
    private final b.C0007b<setIsUrgentResource> setMax;
    private final b.C0007b<appxLoadFailed> setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/data/investment/repository/source/InvestmentEntityData;", "", "getUserInvestmentAccount", "Lio/reactivex/Observable;", "Lid/dana/data/investment/repository/source/network/response/AccountInvestmentResult;", "userId", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.ServerMsgReceiver$1  reason: invalid class name */
    public interface AnonymousClass1 {
        @NotNull
        TitleBarRightButtonView.AnonymousClass1<createPage> setMax(@NotNull String str);
    }

    private ServerMsgReceiver(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        this.setMax = bVar;
        this.setMin = bVar2;
        this.getMax = bVar3;
        this.getMin = bVar4;
    }

    public static ServerMsgReceiver setMin(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        return new ServerMsgReceiver(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new onRegister(this.setMax.get(), this.setMin.get(), this.getMax.get(), this.getMin.get());
    }
}
