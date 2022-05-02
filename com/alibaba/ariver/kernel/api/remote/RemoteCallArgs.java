package com.alibaba.ariver.kernel.api.remote;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class RemoteCallArgs implements Parcelable {
    public static final Parcelable.Creator<RemoteCallArgs> CREATOR = new Parcelable.Creator<RemoteCallArgs>() {
        public final RemoteCallArgs createFromParcel(Parcel parcel) {
            return new RemoteCallArgs(parcel);
        }

        public final RemoteCallArgs[] newArray(int i) {
            return new RemoteCallArgs[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f9127a = new AtomicInteger(0);
    private int b;
    private String c;
    private Node d;
    private long e;
    private String f;
    private Object[] g;
    private String h;
    private String i;
    private String[] j;
    private Parcelable k;
    private Map<String, Object> l;
    private int m;

    public int describeContents() {
        return 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RemoteCallArgs(Node node, Extension extension, Method method, Object[] objArr, Parcelable parcelable) {
        this(node != null ? node.getNodeId() : 0, extension.getClass().getName(), method, objArr);
        this.d = node;
        this.k = parcelable;
    }

    private RemoteCallArgs(long j2, String str, Method method, Object[] objArr) {
        this.m = f9127a.incrementAndGet();
        this.c = ProcessUtils.getProcessName();
        this.b = Process.myPid();
        this.e = j2;
        this.f = str;
        this.i = method.getName();
        ActionFilter actionFilter = (ActionFilter) method.getAnnotation(ActionFilter.class);
        if (actionFilter != null) {
            String value = actionFilter.value();
            this.h = value;
            if (value.length() <= 0) {
                this.h = method.getName();
            }
        }
        this.g = objArr;
        Class[] parameterTypes = method.getParameterTypes();
        if (parameterTypes != null && parameterTypes.length > 0) {
            this.j = new String[parameterTypes.length];
            for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                this.j[i2] = parameterTypes[i2].getName();
            }
        }
    }

    protected RemoteCallArgs(Parcel parcel) {
        Class<RemoteCallArgs> cls = RemoteCallArgs.class;
        try {
            this.b = parcel.readInt();
            this.c = parcel.readString();
            this.e = parcel.readLong();
            this.d = (Node) parcel.readParcelable(Node.class.getClassLoader());
            this.f = parcel.readString();
            this.i = parcel.readString();
            this.h = parcel.readString();
            this.m = parcel.readInt();
            int readInt = parcel.readInt();
            boolean z = false;
            if (readInt > 0) {
                String[] strArr = new String[readInt];
                this.j = strArr;
                parcel.readStringArray(strArr);
                this.g = parcel.readArray(getClass().getClassLoader());
                for (int i2 = 0; i2 < this.j.length; i2++) {
                    if (this.j[i2].equals(JSONObject.class.getName()) && (this.g[i2] instanceof Map)) {
                        this.g[i2] = new JSONObject((Map<String, Object>) (Map) this.g[i2]);
                    }
                }
            }
            this.k = parcel.readParcelable(cls.getClassLoader());
            if (parcel.readByte() == 1 ? true : z) {
                HashMap hashMap = new HashMap();
                this.l = hashMap;
                parcel.readMap(hashMap, cls.getClassLoader());
            }
        } catch (Throwable th) {
            RVLogger.e("AriverKernel", "Deserialize RemoteCallArgs error!", th);
            throw th;
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.e);
        parcel.writeParcelable(this.d, 0);
        parcel.writeString(this.f);
        parcel.writeString(this.i);
        parcel.writeString(this.h);
        parcel.writeInt(this.m);
        Object[] objArr = this.g;
        int length = objArr == null ? 0 : objArr.length;
        parcel.writeInt(length);
        if (length > 0) {
            parcel.writeStringArray(this.j);
            parcel.writeArray(this.g);
        }
        parcel.writeParcelable(this.k, 0);
        if (this.l != null) {
            parcel.writeByte((byte) 1);
            parcel.writeMap(this.l);
            return;
        }
        parcel.writeByte((byte) 0);
    }

    public String getSourceProcessName() {
        return this.c;
    }

    public int getPid() {
        return this.b;
    }

    public long getNodeId() {
        return this.e;
    }

    public void addExtraData(String str, Object obj) {
        if (this.l == null) {
            this.l = new HashMap();
        }
        this.l.put(str, obj);
    }

    public Object getExtraData(String str) {
        Map<String, Object> map = this.l;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public String getAction() {
        return this.h;
    }

    public Node getNode() {
        return this.d;
    }

    public String getClassName() {
        return this.f;
    }

    public Object[] getArgs() {
        return this.g;
    }

    public String getMethodName() {
        return this.i;
    }

    public String[] getArgTypes() {
        return this.j;
    }

    public Parcelable getData() {
        return this.k;
    }

    public int getRemoteSignature() {
        return this.m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RemoteCallArgs{pid=");
        sb.append(this.b);
        sb.append(", node=");
        sb.append(this.d);
        sb.append(", sourceProcessName=");
        sb.append(this.c);
        sb.append(", className=");
        sb.append(this.f);
        sb.append(", method=");
        sb.append(this.i);
        sb.append(", arg=");
        sb.append(this.g);
        sb.append(", argTypes=");
        sb.append(Arrays.toString(this.j));
        sb.append('}');
        return sb.toString();
    }
}
