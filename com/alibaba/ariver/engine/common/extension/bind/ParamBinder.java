package com.alibaba.ariver.engine.common.extension.bind;

import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;

public class ParamBinder<T> implements Binder<BindingParam, T> {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f8986a;

    public ParamBinder(@Nullable JSONObject jSONObject) {
        this.f8986a = jSONObject;
    }

    public T bind(Class<T> cls, BindingParam bindingParam) {
        String[] value = bindingParam.value();
        if (value == null || value.length <= 0) {
            value = bindingParam.name();
        }
        if (value == null || value.length <= 0) {
            throw new BindException("bind key is null");
        }
        String str = null;
        try {
            int length = value.length;
            T t = null;
            String str2 = null;
            int i = 0;
            while (i < length) {
                try {
                    str2 = value[i];
                    t = this.f8986a == null ? null : this.f8986a.getObject(str2, cls);
                    if (t != null) {
                        break;
                    }
                    i++;
                } catch (JSONException e) {
                    e = e;
                    str = str2;
                    StringBuilder sb = new StringBuilder("Binding targetType: ");
                    sb.append(cls);
                    sb.append(" with: ");
                    sb.append(this.f8986a);
                    sb.append(" key: ");
                    sb.append(str);
                    sb.append(" exception!");
                    RVLogger.e("AriverKernel", sb.toString(), e);
                    throw new BindException(e.getMessage());
                }
            }
            str = str2;
            if (t == null) {
                if (bindingParam.required()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(value[0]);
                    sb2.append(" param is missing!");
                    throw new RequiredParamNotFoundException(sb2.toString());
                } else if (cls.isPrimitive()) {
                    if (cls == Boolean.TYPE) {
                        return TypeUtils.castToJavaBean(Boolean.valueOf(bindingParam.booleanDefault()), cls);
                    }
                    if (cls == Integer.TYPE) {
                        return TypeUtils.castToJavaBean(Integer.valueOf(bindingParam.intDefault()), cls);
                    }
                    if (cls == Float.TYPE) {
                        return TypeUtils.castToJavaBean(Float.valueOf(bindingParam.floatDefault()), cls);
                    }
                    if (cls == Double.TYPE) {
                        return TypeUtils.castToJavaBean(Double.valueOf(bindingParam.doubleDefault()), cls);
                    }
                    if (cls == Long.TYPE) {
                        return TypeUtils.castToJavaBean(Long.valueOf(bindingParam.longDefault()), cls);
                    }
                } else if (cls == String.class) {
                    t = TypeUtils.castToJavaBean(bindingParam.stringDefault(), cls);
                }
            }
            return t;
        } catch (JSONException e2) {
            e = e2;
            StringBuilder sb3 = new StringBuilder("Binding targetType: ");
            sb3.append(cls);
            sb3.append(" with: ");
            sb3.append(this.f8986a);
            sb3.append(" key: ");
            sb3.append(str);
            sb3.append(" exception!");
            RVLogger.e("AriverKernel", sb3.toString(), e);
            throw new BindException(e.getMessage());
        }
    }
}
