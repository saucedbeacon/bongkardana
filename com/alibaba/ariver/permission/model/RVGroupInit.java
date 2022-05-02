package com.alibaba.ariver.permission.model;

import com.alibaba.ariver.kernel.api.extension.bridge.BridgePermission;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.permission.api.RVGroup;
import com.alibaba.ariver.remotedebug.RDConstant;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.fastjson.JSONArray;
import com.iap.ac.android.container.js.plugin.ACContainerJSPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RVGroupInit {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f10131a = false;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static synchronized void init(java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.alibaba.ariver.kernel.api.security.Permission>> r2) {
        /*
            java.lang.Class<com.alibaba.ariver.permission.model.RVGroupInit> r0 = com.alibaba.ariver.permission.model.RVGroupInit.class
            monitor-enter(r0)
            boolean r1 = f10131a     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            r1 = 1
            f10131a = r1     // Catch:{ all -> 0x0019 }
            monitor-enter(r0)     // Catch:{ all -> 0x0019 }
            a(r2)     // Catch:{ all -> 0x0016 }
            a()     // Catch:{ all -> 0x0016 }
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            monitor-exit(r0)
            return
        L_0x0016:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r2     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.permission.model.RVGroupInit.init(java.util.Map):void");
    }

    private static void a(Map<String, Map<String, Permission>> map) {
        if (map != null) {
            RVGroup[] rVGroupArr = {RVGroup.LEVEL_HIGH, RVGroup.LEVEL_ABOVE_MEDIUM, RVGroup.LEVEL_MEDIUM, RVGroup.LEVEL_LOW, RVGroup.LEVEL_NONE};
            for (int i = 0; i < 5; i++) {
                rVGroupArr[i].clearPermissions();
            }
            for (int i2 = 0; i2 < 5; i2++) {
                RVGroup rVGroup = rVGroupArr[i2];
                Map map2 = map.get(rVGroup.groupName());
                if (map2 != null) {
                    for (int i3 = 0; i3 < 5; i3++) {
                        RVGroup rVGroup2 = rVGroupArr[i3];
                        if (rVGroup2.ordinal() <= rVGroup.ordinal()) {
                            rVGroup2.assignPermissions(map2);
                        }
                    }
                }
            }
        }
    }

    private static void a() {
        RVGroup.LEVEL_APP_DEFAULT.clearPermissions();
        ArrayList<Permission> arrayList = new ArrayList<>();
        arrayList.add(new BridgePermission(ACContainerJSPlugin.SHOW_NETWORK_CHECK_ACTIVITY, ACContainerJSPlugin.SHOW_NETWORK_CHECK_ACTIVITY));
        arrayList.add(new BridgePermission("showUCFailDialog", "showUCFailDialog"));
        arrayList.add(new BridgePermission("setKeyboardType", "setKeyboardType"));
        arrayList.add(new BridgePermission("monitorH5Performance", "monitorH5Performance"));
        arrayList.add(new BridgePermission("getStartupParams", "getStartupParams"));
        arrayList.add(new BridgePermission("inputBlurEvent", "inputBlurEvent"));
        arrayList.add(new BridgePermission("hideCustomKeyBoard", "hideCustomKeyBoard"));
        arrayList.add(new BridgePermission("hideCustomInputMethod4NativeInput", "hideCustomInputMethod4NativeInput"));
        arrayList.add(new BridgePermission("updateNativeKeyBoardInput", "updateNativeKeyBoardInput"));
        arrayList.add(new BridgePermission("setInputTextChanged", "setInputTextChanged"));
        arrayList.add(new BridgePermission(TinyAppLogUtil.TINY_APP_STANDARD_LOG, TinyAppLogUtil.TINY_APP_STANDARD_LOG));
        arrayList.add(new BridgePermission(RDConstant.TINY_DEBUG_CONSOLE, RDConstant.TINY_DEBUG_CONSOLE));
        arrayList.add(new BridgePermission("internalAPI", "internalAPI"));
        arrayList.add(new BridgePermission("setShowShareMenu", "setShowShareMenu"));
        JSONArray configJSONArray = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONArray("h5_white_jsapiList");
        if (configJSONArray != null && !configJSONArray.isEmpty()) {
            Iterator<Object> it = configJSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof String) {
                    String str = (String) next;
                    if (str.length() > 0) {
                        arrayList.add(new BridgePermission(str, str));
                    }
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (Permission permission : arrayList) {
            hashMap.put(permission.authority(), permission);
        }
        RVGroup.LEVEL_APP_DEFAULT.assignPermissions(hashMap);
    }
}
