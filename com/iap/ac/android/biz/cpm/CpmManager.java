package com.iap.ac.android.biz.cpm;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.alipay.iap.android.f2fpay.widgets.widget.F2FPayCompositePaymentCodeView;

public interface CpmManager {
    F2FPayCompositePaymentCodeView buildCompositePaymentCodeView(@NonNull Activity activity);

    void getPaymentCode();

    void startRefreshPaymentCode();

    void stopRefreshPaymentCode();

    void updateOption(CpmOption cpmOption);
}
