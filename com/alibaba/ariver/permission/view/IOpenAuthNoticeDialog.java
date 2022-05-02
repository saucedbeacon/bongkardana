package com.alibaba.ariver.permission.view;

import android.view.View;

public interface IOpenAuthNoticeDialog {
    void cancel();

    void setNegativeListener(View.OnClickListener onClickListener);

    void setPositiveListener(View.OnClickListener onClickListener);

    void show();
}
