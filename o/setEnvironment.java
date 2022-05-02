package o;

import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u0006H&J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lid/dana/domain/ipg/IpgRepository;", "", "getIpgRegistrationUrl", "Lio/reactivex/Observable;", "Lid/dana/domain/ipg/IpgRegistrationUrl;", "deviceId", "", "bizType", "isClickedAgree", "", "userConsentConfigKey", "saveClickedAgree", "userConsentSyncKey", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface setEnvironment {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<setWorkSpaceId> getIpgRegistrationUrl(@NotNull String str, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> isClickedAgree(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> saveClickedAgree(@NotNull String str, @NotNull String str2);
}
