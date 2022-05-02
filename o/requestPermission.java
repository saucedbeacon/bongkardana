package o;

import androidx.annotation.NonNull;
import o.TitleBarRightButtonView;

public interface requestPermission {
    TitleBarRightButtonView.AnonymousClass1<String> receiveOtp();

    TitleBarRightButtonView.AnonymousClass1<positivePermissionsResult> sendOtp(String str, String str2);

    TitleBarRightButtonView.AnonymousClass1<canSendRequest> verifyOtp(@NonNull String str);
}
