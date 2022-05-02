package com.alibaba.ariver.kernel.api.extension.bridge;

import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.api.annotation.UsePermission;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ActionMeta {
    public Method actionMethod;
    public String actionName;
    public boolean autoCallback = false;
    public Class<? extends BridgeExtension> bridgeExtensionClazz;
    @Nullable
    public String[] nativePermissions;
    public Annotation[][] paramAnnotationArray;
    public boolean paramRequired = false;
    public Class[] paramTypes;
    public UsePermission usePermission;

    public String toString() {
        StringBuilder sb = new StringBuilder("ActionMeta{actionName='");
        sb.append(this.actionName);
        sb.append('\'');
        sb.append(", bridgeExtensionClazz=");
        sb.append(this.bridgeExtensionClazz);
        sb.append(", paramRequired=");
        sb.append(this.paramRequired);
        sb.append(", autoCallback=");
        sb.append(this.autoCallback);
        sb.append('}');
        return sb.toString();
    }
}
