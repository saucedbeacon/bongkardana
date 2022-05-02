package com.alibaba.ariver.kernel.api.extension.registry;

import com.alibaba.ariver.kernel.api.bytedata.ByteOrderDataUtil;
import com.alibaba.ariver.kernel.api.extension.ExtensionType;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.StringUtils;
import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExtensionMetaInfo extends NebulaConfigBase {
    public String bundleName;
    public String extensionClass;
    public List<String> filter;
    public String filterStrs;
    public boolean isLazy;
    public Class<? extends Scope> scope;
    public String scopeClassName;
    public ExtensionType type;
    public String typeString;

    public ExtensionMetaInfo(String str, String str2, String str3, Class<? extends Scope> cls) {
        this(str, str2, str3, cls, true);
    }

    public ExtensionMetaInfo(String str, String str2, String str3, boolean z) {
        this(str, str2, (List<String>) Collections.singletonList(str3), z);
    }

    public ExtensionMetaInfo(String str, String str2, String str3, Class<? extends Scope> cls, boolean z) {
        this(str, str2, (List<String>) Collections.singletonList(str3), cls, z);
    }

    public ExtensionMetaInfo(String str, String str2, List<String> list) {
        this(str, str2, list, true);
    }

    public ExtensionMetaInfo(String str, String str2, List<String> list, Class<? extends Scope> cls) {
        this(str, str2, list, cls, true);
    }

    public ExtensionMetaInfo(String str, String str2, List<String> list, boolean z) {
        this(str, str2, list, (Class<? extends Scope>) null, z);
    }

    public ExtensionMetaInfo(String str, String str2, List<String> list, Class<? extends Scope> cls, boolean z) {
        this(str, str2, list, cls, ExtensionType.NORMAL, z);
    }

    public ExtensionMetaInfo(String str, String str2, List<String> list, Class<? extends Scope> cls, ExtensionType extensionType, boolean z) {
        super(Ascii.VT);
        this.scope = null;
        this.bundleName = str;
        this.extensionClass = str2;
        this.isLazy = z;
        this.filter = list;
        this.scope = cls;
        this.type = extensionType;
    }

    public ExtensionMetaInfo(String str, String str2, String str3, String str4, String str5, boolean z) {
        super(Ascii.VT);
        this.scope = null;
        this.bundleName = str;
        this.extensionClass = str2;
        this.isLazy = z;
        this.filterStrs = str3;
        this.scopeClassName = str4;
        this.typeString = str5;
        this.filter = b(str3);
        this.scope = a(str4);
        this.type = "normal".equals(this.typeString) ? ExtensionType.NORMAL : ExtensionType.BRIDGE;
    }

    private Class<? extends Scope> a(String str) {
        String str2;
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            if ("App".equalsIgnoreCase(str)) {
                str2 = "com.alibaba.ariver.app.api.App";
            } else if (!"Page".equalsIgnoreCase(str)) {
                return null;
            } else {
                str2 = "com.alibaba.ariver.app.api.Page";
            }
            Class<?> cls = Class.forName(str2);
            if (Scope.class.isAssignableFrom(cls)) {
                return cls;
            }
            return null;
        } catch (Throwable th) {
            RVLogger.e("ExtensionMetaInfo", th);
        }
    }

    private List<String> b(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String replace = str.replace(" ", "");
        if (StringUtils.isEmpty(replace)) {
            return null;
        }
        RVLogger.d("ExtensionMetaInfo", "add event configs ".concat(String.valueOf(replace)));
        return Arrays.asList(replace.split("\\|"));
    }

    public ExtensionMetaInfo serialize(BufferedOutputStream bufferedOutputStream) {
        ByteOrderDataUtil.writeByte(bufferedOutputStream, this.mFormatVersion);
        ByteOrderDataUtil.writeString(bufferedOutputStream, this.bundleName);
        ByteOrderDataUtil.writeString(bufferedOutputStream, this.filterStrs);
        ByteOrderDataUtil.writeString(bufferedOutputStream, this.extensionClass);
        ByteOrderDataUtil.writeBoolean(bufferedOutputStream, this.isLazy);
        ByteOrderDataUtil.writeString(bufferedOutputStream, this.scopeClassName);
        ByteOrderDataUtil.writeString(bufferedOutputStream, this.typeString);
        return this;
    }

    public ExtensionMetaInfo deserialize(BufferedInputStream bufferedInputStream) {
        this.mFormatVersion = ByteOrderDataUtil.readByte(bufferedInputStream);
        this.bundleName = ByteOrderDataUtil.readString(bufferedInputStream);
        this.filterStrs = ByteOrderDataUtil.readString(bufferedInputStream);
        this.extensionClass = ByteOrderDataUtil.readString(bufferedInputStream);
        this.isLazy = ByteOrderDataUtil.readBoolean(bufferedInputStream);
        this.scopeClassName = ByteOrderDataUtil.readString(bufferedInputStream);
        this.typeString = ByteOrderDataUtil.readString(bufferedInputStream);
        this.filter = b(this.filterStrs);
        this.scope = a(this.scopeClassName);
        this.type = "normal".equals(this.typeString) ? ExtensionType.NORMAL : ExtensionType.BRIDGE;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ExtensionMetaInfo{extensionClass=");
        sb.append(this.extensionClass);
        sb.append('}');
        return sb.toString();
    }
}
