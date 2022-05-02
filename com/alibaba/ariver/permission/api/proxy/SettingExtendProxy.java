package com.alibaba.ariver.permission.api.proxy;

import android.content.Context;
import com.alibaba.ariver.kernel.common.Proxiable;

public interface SettingExtendProxy extends Proxiable {
    String getExtendAction();

    String getExtendDescription();

    String getExtendDescriptionInSetting();

    String getExtendScope();

    boolean onUserAuthClick(Context context);
}
