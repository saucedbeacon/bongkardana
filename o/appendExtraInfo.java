package o;

import java.util.List;
import o.TitleBarRightButtonView;

public interface appendExtraInfo {
    TitleBarRightButtonView.AnonymousClass1<Boolean> addAndPersistRemoteCertificates(int i, List<String> list);

    TitleBarRightButtonView.AnonymousClass1<Boolean> closeSslPinning();

    Boolean isSslPinningSuccess();
}
