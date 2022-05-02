package com.iap.ac.android.common.container;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Map;

public interface IContainerPresenter {
    void closeWebview();

    @NonNull
    Activity getActivity();

    @NonNull
    Context getContext();

    void loadUrl(String str);

    void postUrl(String str, byte[] bArr);

    void reloadPage();

    void setTitle(String str);

    void showNetWorkCheckActivity(Map<String, String> map);
}
