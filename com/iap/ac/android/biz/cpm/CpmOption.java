package com.iap.ac.android.biz.cpm;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.biz.common.callback.IPaymentCodeListener;
import java.util.Map;

public class CpmOption {
    @Nullable
    public Map<String, String> extendInfo;
    public String institutionId;
    @NonNull
    public IPaymentCodeListener listener;
    @Nullable
    public String region;
}
