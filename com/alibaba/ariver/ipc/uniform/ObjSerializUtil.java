package com.alibaba.ariver.ipc.uniform;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.uniform.UniformIpcUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjSerializUtil {
    public static final byte[] serializ(Serializable serializable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        try {
            objectOutputStream.writeObject(serializable);
            objectOutputStream.flush();
            byteArrayOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } finally {
            try {
                byteArrayOutputStream.close();
                objectOutputStream.close();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("ObjSerializUtil serializ exception: ");
                sb.append(e.toString());
                RVLogger.w(UniformIpcUtils.TAG, sb.toString());
            }
        }
    }

    public static final Serializable deserializ(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        try {
            return (Serializable) objectInputStream.readObject();
        } finally {
            try {
                byteArrayInputStream.close();
                objectInputStream.close();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("ObjSerializUtil deserializ exception: ");
                sb.append(e.toString());
                RVLogger.w(UniformIpcUtils.TAG, sb.toString());
            }
        }
    }

    public static final Serializable deserializ(byte[] bArr, ClassLoader classLoader) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        CustomCLObjectInputStream customCLObjectInputStream = new CustomCLObjectInputStream(byteArrayInputStream, classLoader);
        try {
            return (Serializable) customCLObjectInputStream.readObject();
        } finally {
            try {
                byteArrayInputStream.close();
                customCLObjectInputStream.close();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("ObjSerializUtil deserializ2 exception: ");
                sb.append(e.toString());
                RVLogger.w(UniformIpcUtils.TAG, sb.toString());
            }
        }
    }
}
