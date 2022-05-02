package com.iap.ac.android.common.container.model;

import androidx.annotation.NonNull;

public class CloseAppParams {
    public boolean animated;
    @NonNull
    public String appId;
    public String closeActionType;

    public String toString() {
        StringBuilder sb = new StringBuilder("CloseAppParams{appId='");
        sb.append(this.appId);
        sb.append('\'');
        sb.append(", closeActionType='");
        sb.append(this.closeActionType);
        sb.append('\'');
        sb.append(", animated=");
        sb.append(this.animated);
        sb.append('}');
        return sb.toString();
    }
}
