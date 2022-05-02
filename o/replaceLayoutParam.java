package o;

import kotlin.Metadata;
import o.onDelete;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/switchfaceauth/SwitchFaceAuthContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface replaceLayoutParam {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/switchfaceauth/SwitchFaceAuthContract$Presenter;", "Lid/dana/base/AbstractContract$AbstractPresenter;", "switchFaceAuthentication", "", "faceAuthNew", "", "securityId", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin extends onDelete.getMin {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0017\u0010\f\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lid/dana/switchfaceauth/SwitchFaceAuthContract$View;", "Lid/dana/base/AbstractContract$AbstractView;", "onFaceSwitchRiskChallenge", "", "securityId", "", "pubKey", "faceAuthNew", "", "onFailFaceEnroll", "onFailFaceQuery", "onFailToggle", "onSuccessFaceSwitch", "(Ljava/lang/Boolean;)V", "toKYC", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length extends onDelete.length {
        void onFaceSwitchRiskChallenge(@Nullable String str, @Nullable String str2, boolean z);

        void onFailFaceEnroll();

        void onFailFaceQuery();

        void onFailToggle();

        void onSuccessFaceSwitch(@Nullable Boolean bool);

        void toKYC();
    }
}
