package com.alibaba.ariver.engine.api.bridge.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSONObject;
import java.util.concurrent.atomic.AtomicLong;

public class NativeCallContext<T extends Node> implements Parcelable {
    public static final String CALL_MODE_ASYNC = "async";
    public static final String CALL_MODE_SYNC = "sync";
    public static final String CALL_MODE_UNKNOWN = "unknown";
    public static final Parcelable.Creator<NativeCallContext> CREATOR = new Parcelable.Creator<NativeCallContext>() {
        public final NativeCallContext createFromParcel(Parcel parcel) {
            return new NativeCallContext(parcel);
        }

        public final NativeCallContext[] newArray(int i) {
            return new NativeCallContext[i];
        }
    };
    public static final String FROM_WORKER = "fromWorker";

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicLong f8971a = new AtomicLong((long) Process.myPid());
    private final StatData b;
    private Render c;
    private String d;
    private JSONObject e;
    private T f;
    private String g;
    private String h;
    @Nullable
    private String i;
    @Nullable
    private String j;
    @Nullable
    private String k;
    private String l;

    public int describeContents() {
        return 0;
    }

    public static long generateUniqueId() {
        return System.currentTimeMillis() + f8971a.addAndGet(1);
    }

    public static class StatData implements Parcelable {
        public static final Parcelable.Creator<StatData> CREATOR = new Parcelable.Creator<StatData>() {
            public final StatData createFromParcel(Parcel parcel) {
                return new StatData(parcel);
            }

            public final StatData[] newArray(int i) {
                return new StatData[i];
            }
        };
        public long callbackTimeStamp;
        public long executeTimeStamp;
        public long triggerTimeStamp;

        public int describeContents() {
            return 0;
        }

        public StatData() {
        }

        protected StatData(Parcel parcel) {
            this.triggerTimeStamp = parcel.readLong();
            this.executeTimeStamp = parcel.readLong();
            this.callbackTimeStamp = parcel.readLong();
        }

        public void copyData(StatData statData) {
            if (statData != null) {
                this.triggerTimeStamp = statData.triggerTimeStamp;
                this.executeTimeStamp = statData.executeTimeStamp;
                this.callbackTimeStamp = statData.callbackTimeStamp;
            }
        }

        public String print() {
            StringBuilder sb = new StringBuilder("total(");
            sb.append(this.callbackTimeStamp - this.triggerTimeStamp);
            sb.append(")|dispatch(");
            sb.append(this.executeTimeStamp - this.triggerTimeStamp);
            sb.append(")");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.triggerTimeStamp);
            parcel.writeLong(this.executeTimeStamp);
            parcel.writeLong(this.callbackTimeStamp);
        }
    }

    public static Builder newBuilder(String str) {
        return new Builder().name(str);
    }

    public NativeCallContext() {
        this.b = new StatData();
    }

    private NativeCallContext(Builder builder) {
        this.b = new StatData();
        this.c = builder.render;
        this.d = builder.name;
        this.e = builder.params;
        this.f = builder.node;
        this.g = builder.f8972id;
        this.h = builder.source;
        this.k = builder.originalData;
        String string = JSONUtils.getString(this.e, "__appxDomain");
        if (!TextUtils.isEmpty(string)) {
            if (!"app".equalsIgnoreCase(string) && !"appx".equalsIgnoreCase(string)) {
                this.i = string;
            }
            this.j = string;
        }
        this.b.copyData(builder.statData);
        this.l = builder.callMode;
    }

    protected NativeCallContext(Parcel parcel) {
        this.b = new StatData();
        this.d = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            this.e = JSONUtils.unmarshallJSONObject(bArr);
        }
        this.f = (Node) parcel.readParcelable(NativeCallContext.class.getClassLoader());
        this.i = parcel.readString();
        this.l = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3;
        parcel.writeString(this.d);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        byte[] marshallJSONObject = JSONUtils.marshallJSONObject(this.e);
        if (marshallJSONObject == null) {
            i3 = 0;
        } else {
            i3 = marshallJSONObject.length;
        }
        parcel.writeInt(i3);
        if (i3 > 0) {
            parcel.writeByteArray(marshallJSONObject, 0, i3);
        }
        parcel.writeParcelable(this.f, 0);
        parcel.writeString(this.i);
        parcel.writeString(this.l);
    }

    public Render getRender() {
        return this.c;
    }

    public void setRender(Render render) {
        this.c = render;
    }

    public String getName() {
        return this.d;
    }

    public void setName(String str) {
        this.d = str;
    }

    public JSONObject getParams() {
        return this.e;
    }

    public void setParams(JSONObject jSONObject) {
        this.e = jSONObject;
    }

    public T getNode() {
        return this.f;
    }

    public void setNode(T t) {
        this.f = t;
    }

    public void setPluginId(@Nullable String str) {
        this.i = str;
    }

    @Nullable
    public String getPluginId() {
        return this.i;
    }

    public void setAppxDomain(@Nullable String str) {
        this.j = str;
    }

    @Nullable
    public String getAppxDomain() {
        return this.j;
    }

    public String getId() {
        return this.g;
    }

    public void setId(String str) {
        this.g = str;
    }

    public String getSource() {
        return this.h;
    }

    public void setSource(String str) {
        this.h = str;
    }

    public StatData getStatData() {
        return this.b;
    }

    @Nullable
    public String getOriginalData() {
        return this.k;
    }

    public void setOriginalData(@Nullable String str) {
        this.k = str;
    }

    public String getCallMode() {
        return this.l;
    }

    public void setCallMode(String str) {
        this.l = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeCallContext{name=");
        sb.append(this.d);
        sb.append(", params=");
        sb.append(this.e);
        sb.append(", id=");
        sb.append(this.g);
        if (this.i != null) {
            sb.append(", pluginId=");
            sb.append(this.i);
        }
        sb.append(", callMode=");
        sb.append(this.l);
        sb.append("}");
        return sb.toString();
    }

    public static class Builder {
        public String callMode = "unknown";
        public boolean dispatcherOnWorkerThread;

        /* renamed from: id  reason: collision with root package name */
        public String f8972id;
        public String name;
        public Node node;
        public String originalData;
        public JSONObject params;
        public Render render;
        public String source;
        public StatData statData;

        public Builder() {
            StringBuilder sb = new StringBuilder("native_");
            sb.append(System.currentTimeMillis());
            this.f8972id = sb.toString();
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder params(JSONObject jSONObject) {
            this.params = jSONObject;
            return this;
        }

        public Builder node(Node node2) {
            this.node = node2;
            return this;
        }

        public Builder render(Render render2) {
            this.render = render2;
            return this;
        }

        public Builder id(String str) {
            this.f8972id = str;
            return this;
        }

        public Builder source(String str) {
            this.source = str;
            return this;
        }

        public Builder originalData(String str) {
            this.originalData = str;
            return this;
        }

        public Builder dispatcherOnWorkerThread(boolean z) {
            this.dispatcherOnWorkerThread = z;
            return this;
        }

        public Builder generateLegacyNativeId() {
            StringBuilder sb = new StringBuilder("native_");
            sb.append(System.currentTimeMillis());
            this.f8972id = sb.toString();
            return this;
        }

        public Builder callMode(String str) {
            this.callMode = str;
            return this;
        }

        public NativeCallContext build() {
            return new NativeCallContext(this);
        }
    }
}
