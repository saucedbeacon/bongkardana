package com.alibaba.ariver.kernel.api.track;

public enum EventAttr {
    Key_abnormalCode("abnormalCode"),
    Key_abnormalMsg("abnormalMsg"),
    Key_cubeExceptionMsg("cubeExceptionMsg"),
    key_launchWithProcessNotReady("processNotReady"),
    Key_resourceSyncCount("resSyncCount"),
    Key_resourceVersion("resVersion"),
    Key_resourceAppId("resAppId"),
    Key_resourceAppType("appType"),
    Key_resourceDBFailMsg("resDBFailMsg"),
    Key_resourceParseFailCode("resParseFailCode"),
    Key_resourceParseFailMsg("resParseFailMsg"),
    Key_loadTime("perfEventLoadTime"),
    Key_engineHasInited("engineHasInited"),
    Key_fatalReason("fatalReason"),
    Key_fatalType("fatalType"),
    Key_ck_sdk_init_cost("ck_sdk_init_cost"),
    Key_ck_jsfm_init_cost("ck_jsfm_init_cost"),
    Key_ck_app_crt_cost("ck_app_crt_cost"),
    Key_ck_jsnode_crt_cost("ck_jsnode_crt_cost"),
    Key_ck_fst_scr_cost("ck_fst_scr_cost"),
    Key_ck_fst_elem_cost("ck_fst_elem_cost"),
    Key_ck_br_ready_cost("ck_br_ready_cost"),
    Key_ck_lib_init_cost("ck_lib_init_cost"),
    Key_ck_lib_idle_preload_cost("ck_idle_preload_cost"),
    Key_ck_lib_c_plus_cost("ck_lib_c_plus_cost"),
    Key_ck_lib_native_bitmap_cost("ck_lib_native_bitmap_cost"),
    Key_ck_lib_native_core_cost("ck_lib_native_core_cost"),
    Key_ck_lib_native_bridge_cost("ck_lib_native_bridge_cost"),
    Key_ck_lib_native_platform_cost("ck_lib_native_platform_cost"),
    Key_ck_core_block_cost("ck_core_block_cost"),
    Key_ck_platform_block_cost("ck_platform_block_cost"),
    Key_ck_bridge_block_cost("ck_bridge_block_cost"),
    Key_ck_app_create_block_cost("ck_app_create_block_cost"),
    Key_ck_page_create_block_cost("ck_page_create_block_cost"),
    Key_message("ck_event_msg"),
    Key_ck_fs_render_cost("ck_fs_render_cost");
    
    private String key;

    private EventAttr(String str) {
        this.key = str;
    }

    public final String value() {
        return this.key;
    }
}
