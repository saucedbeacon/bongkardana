package com.alibaba.ariver.app.api.ui.loading;

import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.EntryInfo;
import java.util.Map;

public interface SplashView {

    public interface ExitListener {
        void onExit();
    }

    public enum Status {
        WAITING,
        LOADING,
        ERROR,
        EXIT
    }

    boolean backPressed();

    void exit(ExitListener exitListener);

    Status getStatus();

    void showError(String str, String str2, @Nullable Map<String, String> map);

    void showLoading(EntryInfo entryInfo);

    void update(EntryInfo entryInfo);
}
