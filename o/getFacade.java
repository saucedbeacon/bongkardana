package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import o.BaseGriverNetwork;
import o.BaseGriverRpcRequest;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003H&J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H&J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lid/dana/domain/miniprogram/MiniProgramRepository;", "", "getMiniProgramScenario", "Lio/reactivex/Observable;", "Lid/dana/domain/miniprogram/model/DeeplinkServiceEntity;", "getMiniPrograms", "", "Lid/dana/domain/miniprogram/model/MiniProgram;", "setFavoriteMiniPrograms", "", "appId", "", "isFavorite", "", "allMiniProgramAppIds", "setRecentMiniProgram", "lastOpen", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface getFacade {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<BaseGriverNetwork.FacadeProcessor> getMiniProgramScenario();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<List<BaseGriverRpcRequest.DeviceInfo>> getMiniPrograms();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Unit> setFavoriteMiniPrograms(@NotNull String str, boolean z, @NotNull List<String> list);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Unit> setRecentMiniProgram(@NotNull String str, long j);
}
