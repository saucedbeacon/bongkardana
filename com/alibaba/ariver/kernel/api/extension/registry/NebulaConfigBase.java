package com.alibaba.ariver.kernel.api.extension.registry;

import com.alibaba.ariver.kernel.api.bytedata.ByteOrderDataUtil;
import com.alibaba.ariver.kernel.api.extension.registry.NebulaConfigBase;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public abstract class NebulaConfigBase<T extends NebulaConfigBase<T>> {
    protected byte mFormatVersion = 0;

    public NebulaConfigBase(byte b) {
        this.mFormatVersion = b;
    }

    public T serialize(BufferedOutputStream bufferedOutputStream) {
        ByteOrderDataUtil.writeByte(bufferedOutputStream, this.mFormatVersion);
        return this;
    }

    public T deserialize(BufferedInputStream bufferedInputStream) {
        this.mFormatVersion = ByteOrderDataUtil.readByte(bufferedInputStream);
        return this;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        return (obj instanceof NebulaConfigBase) && obj.hashCode() == hashCode();
    }
}
