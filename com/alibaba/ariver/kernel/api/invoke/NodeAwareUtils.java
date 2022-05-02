package com.alibaba.ariver.kernel.api.invoke;

public class NodeAwareUtils {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = (com.alibaba.ariver.kernel.api.node.NodeAware) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void handleSetNode(com.alibaba.ariver.kernel.api.node.Node r5, com.alibaba.ariver.kernel.api.extension.Extension r6) {
        /*
            boolean r0 = r6 instanceof com.alibaba.ariver.kernel.api.node.NodeAware
            if (r0 == 0) goto L_0x004f
            r0 = r6
            com.alibaba.ariver.kernel.api.node.NodeAware r0 = (com.alibaba.ariver.kernel.api.node.NodeAware) r0
            java.lang.Class r1 = r0.getNodeType()
            if (r1 == 0) goto L_0x004f
            r2 = 0
            r3 = r5
        L_0x000f:
            if (r3 == 0) goto L_0x002a
            java.lang.Class r4 = r3.getClass()
            boolean r4 = r1.isAssignableFrom(r4)
            if (r4 == 0) goto L_0x0025
            r2 = 1
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r3)
            r0.setNode(r4)
            goto L_0x002a
        L_0x0025:
            com.alibaba.ariver.kernel.api.node.Node r3 = r3.getParentNode()
            goto L_0x000f
        L_0x002a:
            if (r2 != 0) goto L_0x004f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "cannot find Wanted node type: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = " with target node: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " in extension "
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = "AriverKernel:ExtensionInvoker:Aware"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r6, r5)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.api.invoke.NodeAwareUtils.handleSetNode(com.alibaba.ariver.kernel.api.node.Node, com.alibaba.ariver.kernel.api.extension.Extension):void");
    }
}
