package com.appsflyer.internal;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.griver.bluetooth.ble.ErrorConstants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import java.util.HashMap;
import o.TabBarItemColorModel;

class c$5 extends HashMap<String, String> {

    /* renamed from: ˏ$5b41b771  reason: contains not printable characters */
    private /* synthetic */ Object f8892$5b41b771;

    public c$5(Object obj) {
        this.f8892$5b41b771 = obj;
        put("0", "ro.arch");
        put("1", "ro.chipname");
        put("2", "ro.dalvik.vm.native.bridge");
        put("3", "persist.sys.nativebridge");
        put("4", "ro.enable.native.bridge.exec");
        put("5", "dalvik.vm.isa.x86.features");
        put("6", "dalvik.vm.isa.x86.variant");
        put("7", "ro.zygote");
        put(PrepareException.ERROR_AUTH_FAIL, "ro.allow.mock.location");
        put("9", "ro.dalvik.vm.isa.arm");
        put(MonitorUtil.ERROR_CODE_EMPTY, "dalvik.vm.isa.arm.features");
        put("11", "dalvik.vm.isa.arm.variant");
        put("12", "dalvik.vm.isa.arm64.features");
        put("13", "dalvik.vm.isa.arm64.variant");
        put("14", "vzw.os.rooted");
        put(ErrorConstants.ERROR_CODE_15, "ro.build.user");
        put("16", "ro.kernel.qemu");
        put("17", "ro.hardware");
        put("18", "ro.product.cpu.abi");
        put("19", "ro.product.cpu.abilist");
        put(TabBarItemColorModel.LIMIT, "ro.product.cpu.abilist32");
        put("21", "ro.product.cpu.abilist64");
    }
}
