package o;

import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/domain/electronicmoney/interactor/GetElectronicMoneyConfig;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "", "Lid/dana/domain/electronicmoney/model/response/ElectronicMoneyConfig;", "Lid/dana/domain/core/usecase/NoParams;", "electronicmoneyRepository", "Lid/dana/domain/electronicmoney/ElectronicmoneyRepository;", "(Lid/dana/domain/electronicmoney/ElectronicmoneyRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setLoadWithOverviewMode extends APWebChromeClient<Map<String, ? extends setSupportMultipleWindows>, onReceivedIcon> {
    private final setAllowFileAccess electronicmoneyRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setLoadWithOverviewMode(@NotNull setAllowFileAccess setallowfileaccess) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(setallowfileaccess, "electronicmoneyRepository");
        this.electronicmoneyRepository = setallowfileaccess;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Map<String, setSupportMultipleWindows>> buildUseCase(@NotNull onReceivedIcon onreceivedicon) {
        Intrinsics.checkNotNullParameter(onreceivedicon, "params");
        return this.electronicmoneyRepository.getElectronicMoneyConfig();
    }
}
