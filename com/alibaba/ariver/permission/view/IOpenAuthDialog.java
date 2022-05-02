package com.alibaba.ariver.permission.view;

import android.view.View;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.permission.model.AuthProtocol;
import java.util.List;
import java.util.Map;

public interface IOpenAuthDialog {
    void cancel();

    void setContent(String str, String str2, App app, List<String> list, List<String> list2, List<AuthProtocol> list3, String str3, Map<String, String> map);

    void setOnCloseClickListener(View.OnClickListener onClickListener);

    void setOnConfirmClickListener(View.OnClickListener onClickListener);

    void show();
}
