package com.alibaba.ariver.kernel.ipc;

import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o.PlaybackStateCompat;

public class ShadowNodePool {

    /* renamed from: a  reason: collision with root package name */
    private static ShadowNodePool f9151a;
    private final PlaybackStateCompat.ShuffleMode<Set<Long>> b = new PlaybackStateCompat.ShuffleMode<>();
    private final Map<Long, Node> c = new ConcurrentHashMap();

    public static ShadowNodePool getInstance() {
        if (f9151a == null) {
            synchronized (ShadowNodePool.class) {
                if (f9151a == null) {
                    f9151a = new ShadowNodePool();
                }
            }
        }
        return f9151a;
    }

    public Node createOrGetNode(Node node, long j) {
        Node node2 = this.c.get(Long.valueOf(j));
        if (node2 != null) {
            return node2;
        }
        if (node == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("generateNodeId ");
        sb.append(j);
        sb.append(" for localNode: ");
        sb.append(node);
        RVLogger.d("AriverKernel:ShadowNodePool", sb.toString());
        boolean configBoolean = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigBoolean("ariver_enableShadowNodeOpt", true);
        Node node3 = node;
        while (node3.getParentNode() != null) {
            Node parentNode = node3.getParentNode();
            if (configBoolean) {
                Node node4 = this.c.get(Long.valueOf(parentNode.getNodeId()));
                if (node4 == null) {
                    parentNode.onInitialized();
                    StringBuilder sb2 = new StringBuilder("generateNodeId ");
                    sb2.append(parentNode.getNodeId());
                    sb2.append(" for parentNode: ");
                    sb2.append(parentNode);
                    RVLogger.d("AriverKernel:ShadowNodePool", sb2.toString());
                    this.c.put(Long.valueOf(parentNode.getNodeId()), parentNode);
                } else {
                    StringBuilder sb3 = new StringBuilder("replace parentNode ");
                    sb3.append(parentNode.getNodeId());
                    sb3.append(" and instance ");
                    sb3.append(parentNode);
                    sb3.append(" to existed: ");
                    sb3.append(node4);
                    RVLogger.d("AriverKernel:ShadowNodePool", sb3.toString());
                    node3.setParentNode(node4);
                }
            } else {
                parentNode.onInitialized();
            }
            node3 = parentNode;
        }
        node.onInitialized();
        this.c.put(Long.valueOf(j), node);
        return node;
    }

    public void bindStartToken(long j, long j2) {
        Set max = this.b.getMax(j, null);
        if (max == null) {
            max = new HashSet();
            this.b.setMax(j, max);
        }
        max.add(Long.valueOf(j2));
    }

    public void unBindStartToken(long j) {
        RVLogger.d("AriverKernel:ShadowNodePool", "unBindStartToken ".concat(String.valueOf(j)));
        Set<Long> max = this.b.getMax(j, null);
        if (max != null) {
            for (Long longValue : max) {
                onNodeExit(longValue.longValue());
            }
        }
        this.b.getMin(j);
    }

    public void onNodeExit(long j) {
        Node remove = this.c.remove(Long.valueOf(j));
        StringBuilder sb = new StringBuilder("onNodeExit ");
        sb.append(j);
        sb.append(" node: ");
        sb.append(remove);
        RVLogger.d("AriverKernel:ShadowNodePool", sb.toString());
        if (remove != null) {
            remove.onFinalized();
        }
    }
}
