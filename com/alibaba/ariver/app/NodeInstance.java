package com.alibaba.ariver.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Process;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.node.DataNode;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.node.ValueStore;
import com.alibaba.ariver.kernel.api.security.Accessor;
import com.alibaba.ariver.kernel.api.security.DefaultGroup;
import com.alibaba.ariver.kernel.api.security.Group;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.utils.RVKernelUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

@SuppressLint({"ParcelCreator"})
public class NodeInstance implements DataNode, ValueStore {
    private static final String TAG = "AriverNodeInstance";
    protected static ExtensionManager sExtensionManager;
    private static int sNodeIdBase = (Process.myPid() * 10000);
    private static int sNodeIdCounter = 1;
    private boolean mAlreadyFinalized;
    private final Stack<Node> mChildNodes;
    private final Map<Class, Object> mDataStore;
    private CountDownLatch mFinalizedLatch;
    private long mNodeId;
    private Node mParentNode;
    private final Map<String, Object> mValueStoreMap;

    public int describeContents() {
        return 0;
    }

    public void inquiry(List<? extends Permission> list, Accessor.InquiryCallback inquiryCallback) {
    }

    public List<Permission> usePermissions() {
        return null;
    }

    public NodeInstance() {
        this.mChildNodes = new Stack<>();
        this.mDataStore = new ConcurrentHashMap();
        this.mValueStoreMap = new ConcurrentHashMap();
        this.mAlreadyFinalized = false;
        this.mFinalizedLatch = new CountDownLatch(1);
        this.mNodeId = generateNodeId();
    }

    public static long generateNodeId() {
        int i = sNodeIdBase;
        int i2 = sNodeIdCounter;
        sNodeIdCounter = i2 + 1;
        return (long) (i + i2);
    }

    public void setNodeId(long j) {
        this.mNodeId = j;
    }

    public NodeInstance(Node node) {
        this();
        this.mParentNode = node;
        onInitialized();
    }

    public static void bindExtensionManager(ExtensionManager extensionManager) {
        sExtensionManager = extensionManager;
    }

    public static ExtensionManager getBindedExtensionManager() {
        return sExtensionManager;
    }

    @CallSuper
    public synchronized void onInitialized() {
        if (sExtensionManager != null) {
            sExtensionManager.enterNode(this);
        }
    }

    @CallSuper
    public synchronized void onFinalized() {
        if (sExtensionManager != null) {
            sExtensionManager.exitNode(this);
        }
        this.mParentNode = null;
        this.mValueStoreMap.clear();
        this.mValueStoreMap.put(Node.KEY_IS_FINALIZED, Boolean.TRUE);
        this.mAlreadyFinalized = true;
        this.mFinalizedLatch.countDown();
    }

    public boolean waitOnFinalized() {
        try {
            this.mFinalizedLatch.await();
            return this.mAlreadyFinalized;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    public Node getParentNode() {
        return this.mParentNode;
    }

    public void setParentNode(Node node) {
        this.mParentNode = node;
    }

    public int getIndexOfChild(Node node) {
        if (node == null) {
            return -1;
        }
        synchronized (this.mChildNodes) {
            int size = this.mChildNodes.size();
            for (int i = 0; i < size; i++) {
                if (node == this.mChildNodes.get(i)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public void pushChild(Node node) {
        if (node != null) {
            synchronized (this.mChildNodes) {
                node.setParentNode(this);
                this.mChildNodes.push(node);
            }
        }
    }

    public Node popChild() {
        Node pop;
        synchronized (this.mChildNodes) {
            pop = this.mChildNodes.pop();
        }
        return pop;
    }

    public Node peekChild() {
        synchronized (this.mChildNodes) {
            if (this.mChildNodes.empty()) {
                return null;
            }
            Node peek = this.mChildNodes.peek();
            return peek;
        }
    }

    public Node getChildAt(int i) {
        if (i < 0 || this.mChildNodes.size() == 0 || i >= this.mChildNodes.size()) {
            return null;
        }
        return this.mChildNodes.get(i);
    }

    public int getChildCount() {
        return this.mChildNodes.size();
    }

    public Node getChild(long j) {
        synchronized (this.mChildNodes) {
            Iterator it = this.mChildNodes.iterator();
            while (it.hasNext()) {
                Node node = (Node) it.next();
                if (j == node.getNodeId()) {
                    return node;
                }
            }
            return null;
        }
    }

    public boolean removeChild(Node node) {
        boolean remove;
        synchronized (this.mChildNodes) {
            remove = this.mChildNodes.remove(node);
        }
        return remove;
    }

    public boolean isChildless() {
        boolean empty;
        synchronized (this.mChildNodes) {
            empty = this.mChildNodes.empty();
        }
        return empty;
    }

    public long getNodeId() {
        return this.mNodeId;
    }

    public <T extends Node> T bubbleFindNode(Class<T> cls) {
        for (Node node = this; node != null; node = node.getParentNode()) {
            if (cls.isAssignableFrom(node.getClass())) {
                return node;
            }
        }
        return null;
    }

    public Group getGroup() {
        return DefaultGroup.INTERNAL;
    }

    public <T> T getData(Class<T> cls, boolean z) {
        T t = this.mDataStore.get(cls);
        if (t != null || !z) {
            return t;
        }
        try {
            t = cls.newInstance();
            this.mDataStore.put(cls, t);
            return t;
        } catch (Throwable th) {
            RVLogger.w(TAG, "getData Exception", th);
            return t;
        }
    }

    @Nullable
    public <T> T getData(Class<T> cls) {
        return getData(cls, false);
    }

    public <T> void setData(Class<T> cls, T t) {
        if (t == null) {
            this.mDataStore.remove(cls);
            return;
        }
        if (RVKernelUtils.isDebug()) {
            StringBuilder sb = new StringBuilder("setData [");
            sb.append(cls);
            sb.append("] value: ");
            sb.append(t);
            RVLogger.d(TAG, sb.toString());
        }
        this.mDataStore.put(cls, t);
    }

    public NodeInstance(Parcel parcel) {
        this.mChildNodes = new Stack<>();
        this.mDataStore = new ConcurrentHashMap();
        this.mValueStoreMap = new ConcurrentHashMap();
        this.mAlreadyFinalized = false;
        this.mFinalizedLatch = new CountDownLatch(1);
        this.mNodeId = parcel.readLong();
        this.mParentNode = (Node) parcel.readParcelable(NodeInstance.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mNodeId);
        parcel.writeParcelable(this.mParentNode, 0);
    }

    public boolean containsKey(String str) {
        return this.mValueStoreMap.containsKey(str);
    }

    public String getStringValue(String str) {
        Object obj = this.mValueStoreMap.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (Throwable th) {
            RVLogger.e(TAG, "getStringValue error!", th);
            return null;
        }
    }

    public void putStringValue(String str, String str2) {
        if (str2 == null) {
            this.mValueStoreMap.remove(str);
        } else {
            this.mValueStoreMap.put(str, str2);
        }
    }

    public boolean getBooleanValue(String str) {
        Object obj = this.mValueStoreMap.get(str);
        if (obj == null) {
            return false;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (Throwable th) {
            RVLogger.e(TAG, "getStringValue error!", th);
            return false;
        }
    }

    public void putBooleanValue(String str, boolean z) {
        this.mValueStoreMap.put(str, Boolean.valueOf(z));
    }

    public int getIntValue(String str) {
        Object obj = this.mValueStoreMap.get(str);
        if (obj == null) {
            return 0;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (Throwable th) {
            RVLogger.e(TAG, "getStringValue error!", th);
            return 0;
        }
    }

    public void putIntValue(String str, int i) {
        this.mValueStoreMap.put(str, Integer.valueOf(i));
    }

    public long getLongValue(String str) {
        Object obj = this.mValueStoreMap.get(str);
        if (obj == null) {
            return 0;
        }
        try {
            return ((Long) obj).longValue();
        } catch (Throwable th) {
            RVLogger.e(TAG, "getStringValue error!", th);
            return 0;
        }
    }

    public void putLongValue(String str, long j) {
        this.mValueStoreMap.put(str, Long.valueOf(j));
    }

    public JSONObject getJsonValue(String str) {
        Object obj = this.mValueStoreMap.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (JSONObject) obj;
        } catch (Throwable th) {
            RVLogger.e(TAG, "getStringValue error!", th);
            return null;
        }
    }

    public void putJsonValue(String str, JSONObject jSONObject) {
        this.mValueStoreMap.put(str, jSONObject);
    }

    public JSONArray getJsonArrayValue(String str) {
        Object obj = this.mValueStoreMap.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (JSONArray) obj;
        } catch (Throwable th) {
            RVLogger.e(TAG, "getStringValue error!", th);
            return null;
        }
    }

    public void putJsonArrayValue(String str, JSONArray jSONArray) {
        this.mValueStoreMap.put(str, jSONArray);
    }
}
