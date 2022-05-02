package id.dana.domain.foundation.logger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface PerformanceConstant {
    public static final String COLD_START_BEGIN = "coldStartBegin";
    public static final String COLD_START_PREFIX = "cold";
    public static final String HOME_PAGE_RENDER_END = "homePageRenderEnd";
    public static final String HOT_START_BEGIN = "hotStartBegin";
    public static final String HOT_START_PREFIX = "hot";
    public static final String ICON = "icon";
    public static final String INTRODUCE_RENDER_END = "introduceRenderEnd";
    public static final String PAGE_CHALLENGE = "challenge";
    public static final String PAGE_HOME = "home";
    public static final String PAGE_INTRODUCE = "introduce";
    public static final String PERFORMANCE_FLAG = "performance";
    public static final String PERFORMANCE_FROM = "from";
    public static final String PERFORMANCE_PHASE = "phase";
    public static final String PERFORMANCE_PHASE_1 = "phase1";
    public static final String PERFORMANCE_PHASE_2 = "phase2";
    public static final String PERFORMANCE_REQUEST_TYPE_APHOME = "aphome";
    public static final String PERFORMANCE_SUBTYPE_COLD = "coldstarttime";
    public static final String PERFORMANCE_SUBTYPE_HOT_3 = "hotstarttime3";
    public static final String PERFORMANCE_SUBTYPE_NETWORK = "network";
    public static final String PERFORMANCE_SYSTEM_COST = "systemCost";
    public static final String PERFORMANCE_TIME_COST = "costTime";
    public static final String PERFORMANCE_TO = "to";
    public static final String RISK_CHALLENGE_START = "riskChallengStart";
    public static final String SPLASH_RENDER_END = "startUpEnd";
    public static final String SPLASH_TO_CHALLENGE_START_TIME = "splashtochallengestarttime";
    public static final String SPLASH_TO_HOME_TIME = "splashtohometime";
    public static final String SPLASH_TO_INTRODUCE_TIME = "splashtointroducetime";
}
