package com.alipay.mobile.rome.longlinkservice;

public interface ISyncUpCallback {
    void onSyncUpResult(String str, String str2, SyncUpState syncUpState);

    public enum SyncUpState {
        ;

        private SyncUpState(String str) {
        }
    }
}
