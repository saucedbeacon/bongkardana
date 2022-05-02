package com.alipay.iap.android.f2fpay.client.callback;

public interface IF2FPayOpenCallback {

    public static class Adapter implements IF2FPayOpenCallback {
        public void onSwitchOffFailed(String str) {
        }

        public void onSwitchOnCanceled() {
        }

        public void onSwitchOnFailed(String str) {
        }

        public void onSwitchStatusChanged(boolean z, StatusChangeCausedBy statusChangeCausedBy) {
        }
    }

    public enum StatusChangeCausedBy {
        CheckOpen,
        SwitchOn,
        SwitchOff
    }

    void onSwitchOffFailed(String str);

    void onSwitchOnCanceled();

    void onSwitchOnFailed(String str);

    void onSwitchStatusChanged(boolean z, StatusChangeCausedBy statusChangeCausedBy);
}
