package org.mozilla.javascript.tools.shell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import o.LogUtils;
import o.doCheck;
import org.mozilla.javascript.ScriptableObject;

class FlexibleCompletor implements InvocationHandler {
    private LogUtils setMax;
    private Method setMin;

    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object[] objArr2;
        int length;
        if (method.equals(this.setMin)) {
            String str = objArr[0];
            int intValue = objArr[1].intValue();
            List list = objArr[2];
            int i = intValue - 1;
            while (i >= 0) {
                char charAt = str.charAt(i);
                if (!Character.isJavaIdentifierPart(charAt) && charAt != '.') {
                    break;
                }
                i--;
            }
            String[] split = str.substring(i + 1, intValue).split("\\.", -1);
            LogUtils logUtils = this.setMax;
            int i2 = 0;
            while (true) {
                if (i2 < split.length - 1) {
                    Object obj2 = logUtils.get(split[i2], this.setMax);
                    if (!(obj2 instanceof LogUtils)) {
                        length = str.length();
                        break;
                    }
                    logUtils = (LogUtils) obj2;
                    i2++;
                } else {
                    if (logUtils instanceof ScriptableObject) {
                        objArr2 = ((ScriptableObject) logUtils).getAllIds();
                    } else {
                        objArr2 = logUtils.getIds();
                    }
                    String str2 = split[split.length - 1];
                    for (int i3 = 0; i3 < objArr2.length; i3++) {
                        if (objArr2[i3] instanceof String) {
                            String str3 = (String) objArr2[i3];
                            if (str3.startsWith(str2)) {
                                if (logUtils.get(str3, logUtils) instanceof doCheck) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str3);
                                    sb.append("(");
                                    str3 = sb.toString();
                                }
                                list.add(str3);
                            }
                        }
                    }
                    length = str.length() - str2.length();
                }
            }
            return Integer.valueOf(length);
        }
        throw new NoSuchMethodError(method.toString());
    }
}
