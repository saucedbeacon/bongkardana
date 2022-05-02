package com.alibaba.ariver.kernel.api.monitor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public interface ErrId {
    public static final String RV_TYPE_APP_PREPARE_ERROR = "RV_APP_PREPARE_ERROR";
    public static final String RV_TYPE_JSAPI_RESULT_ERROR = "RV_JSAPI_RESULT_ERROR";
    public static final String RV_TYPE_JS_ERROR = "RV_JS_ERROR";
    public static final String RV_TYPE_MTOP_ERROR = "RV_MTOP_ERROR";
    public static final String RV_TYPE_NETWORK_ERROR = "RV_NETWORK_ERROR";
    public static final String RV_TYPE_PAGE_ABNORMAL = "RV_PAGE_ABNORMAL";
    public static final String RV_TYPE_RESOURCE_ERROR = "RV_RESOURCE_ERROR";
    public static final String RV_TYPE_WEBVIEW_ERROR = "RV_WEBVIEW_ERROR";

    @Target({ElementType.PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrValue {
    }

    public static class EmbedWebViewType {
        public static final String FULL_SCREEN = "fullscreen";
        public static final String MINI = "mini";
        public static final String NONE = "none";
    }

    public static class ErrCodeAppPrepare {
        public static final String CrashDegradeLegacy = "CrashDegradeLegacy";
        public static final String EngineInitFail = "EngineInitFail";
        public static final String LoadingError = "LoadingError";
        public static final String SceneParamReadException = "SceneParamReadException";
        public static final String WebEngineError = "WebEngineError";
    }

    public static class ErrCodeJS {
        public static final String H5_CUSTOM_ERROR_TINY_11 = "11";
        public static final String H5_CUSTOM_ERROR_TINY_12 = "12";
        public static final String H5_CUSTOM_ERROR_TINY_13 = "13";
        public static final String H5_CUSTOM_ERROR_TINY_14 = "14";
    }

    public static class ErrCodeJSAPI {
        public static final String NOT_FOUND = "1";
        public static final String PARAMETER = "2";
        public static final String UNAUTHORITED = "4";
        public static final String UNKNOWN = "3";
        public static final String USER_CANCEL = "11";
    }

    public static class ErrCodeNetwork {
    }

    public static class ErrCodePageAbnormal {
        public static final String CONTAINER = "-600001";
        public static final String RENDER_NODE = "-600002";
    }

    public static class ErrCodePermissionForbidden {
        public static final String EMBED_WEBVIEW_JSAPI_FORBIDDEN = "embedwebviewjsapi_forbidden";
        public static final String JSAPI_FORBIDDEN = "jsapi_forbidden";
        public static final String PLUGIN_FORBIDDEN = "plugin_forbidden";
        public static final String SCHEMA_FORBIDDEN = "schema_forbidden";
        public static final String SP_JSAPI_FORBIDDEN = "jsapi_sp_forbidden";
        public static final String START_APP_FORBIDDEN = "start_app_forbidden";
    }

    public static class ErrCodeResource {
        public static final String ResDownloadFail = "ResDownloadFail";
        public static final String ResFallBackFail = "ResFallBackFail";
        public static final String ResPrepareFail = "ResPrepareFail";
        public static final String ResSQLFail = "ResSQLFail";
        public static final String ResUnzipFail = "ResUnzipFail";
        public static final String ResVerifyFail = "ResVerifyFail";
    }

    public static class ErrCodeWebview {
        public static final String H5_UC_FAIL_DIALOG = "H5UCFailDialog";
        public static final String H5_UC_FAIL_USE_SYS_WEBVIEW = "H5UCFailUseSysWebview";
    }

    public static class ErrCodeWhiteScreen {
        public static final String APPXNG_ERROR = "N21612";
        public static final String APPX_REGISTER_WORKER_NOT_RECEIVED = "N21613";
        public static final String APPX_RENDER_VERSION_LOST = "N21611";
        public static final String APPX_VERSION_INCOMPATIBLE = "N21609";
        public static final String APPX_WEB_VIEW_RENDER_FAIL = "N21610";
        public static final String DSL_ERROR = "N21604";
        public static final String EMBEDVIEW_MAIN_DOC_NOT_FINISHED = "N21617";
        public static final String EMBEDVIEW_RENDER_MSG_NOT_RECEVIED = "N21618";
        public static final String ERROR_PAGE_DEPANDS_ON_UC_WEBVIEW = "N21615";
        public static final String H5_CUSTOM_WHITE_SCREEN = "N21614";
        public static final String INTERCEPT_REQUEST_NOT_CALL = "N21605";
        public static final String MAIN_DOC_SIZE_EMPTY = "N21603";
        public static final String REGISTER_WORKER_FAILED = "N21626";
        public static final String TINY_APP_RENDER_LOADING = "N21670";
        public static final String UC_FIRST_VISUALLY_RENDER_NOT_CALL = "N21608";
        public static final String UC_INIT_SLOW = "N21602";
        public static final String UC_LONG_RENDER = "N21606";
        public static final String UC_LONG_RENDER_BG = "N21607";
        public static final String UC_LONG_RENDER_WITH_SHOW_LOADING = "N21616";
        public static final String USE_SYSTEM_WEBVIEW = "N21601";
    }

    public interface WhiteScreenSource {
        public static final String DSL_CHECK = "DSLCheck";
        public static final String KEY_WHITE_SCREEN_SOURCE = "whiteScreenSrc";
        public static final String UC_CHECK = "UCCheck";
    }
}
