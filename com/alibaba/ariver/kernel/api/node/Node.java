package com.alibaba.ariver.kernel.api.node;

import android.os.Parcelable;
import com.alibaba.ariver.kernel.api.security.Accessor;

public interface Node extends Parcelable, Accessor {
    public static final String KEY_IS_FINALIZED = "IS_FINALIZED";

    <T extends Node> T bubbleFindNode(Class<T> cls);

    Node getChild(long j);

    Node getChildAt(int i);

    int getChildCount();

    int getIndexOfChild(Node node);

    long getNodeId();

    Node getParentNode();

    boolean isChildless();

    void onFinalized();

    void onInitialized();

    Node peekChild();

    Node popChild();

    void pushChild(Node node);

    boolean removeChild(Node node);

    void setParentNode(Node node);
}
