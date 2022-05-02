package com.alibaba.ariver.permission.view;

import com.alibaba.ariver.app.api.Page;
import java.util.List;

public interface LocalPermissionDialog {
    void setDialogContent(List<String> list, String str, String str2, String str3);

    void setPermissionPermitListener(PermissionPermitListener permissionPermitListener);

    void show(Page page);
}
