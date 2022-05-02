package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaTypeEnhancementState {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    @JvmField
    public static final JavaTypeEnhancementState DEFAULT = new JavaTypeEnhancementState(ReportLevel.WARN, (ReportLevel) null, MapsKt.emptyMap(), false, (ReportLevel) null, 24, (DefaultConstructorMarker) null);
    @NotNull
    @JvmField
    public static final ReportLevel DEFAULT_REPORT_LEVEL_FOR_JSPECIFY = ReportLevel.WARN;
    @NotNull
    @JvmField
    public static final JavaTypeEnhancementState DISABLED_JSR_305;
    @NotNull
    @JvmField
    public static final JavaTypeEnhancementState STRICT;
    @NotNull
    private final Lazy description$delegate;
    private final boolean disabledDefaultAnnotations;
    private final boolean disabledJsr305;
    private final boolean enableCompatqualCheckerFrameworkAnnotations;
    @NotNull
    private final ReportLevel globalJsr305Level;
    @NotNull
    private final ReportLevel jspecifyReportLevel;
    @Nullable
    private final ReportLevel migrationLevelForJsr305;
    @NotNull
    private final Map<String, ReportLevel> userDefinedLevelForSpecificJsr305Annotation;

    public JavaTypeEnhancementState(@NotNull ReportLevel reportLevel, @Nullable ReportLevel reportLevel2, @NotNull Map<String, ? extends ReportLevel> map, boolean z, @NotNull ReportLevel reportLevel3) {
        Intrinsics.checkNotNullParameter(reportLevel, "globalJsr305Level");
        Intrinsics.checkNotNullParameter(map, "userDefinedLevelForSpecificJsr305Annotation");
        Intrinsics.checkNotNullParameter(reportLevel3, "jspecifyReportLevel");
        this.globalJsr305Level = reportLevel;
        this.migrationLevelForJsr305 = reportLevel2;
        this.userDefinedLevelForSpecificJsr305Annotation = map;
        this.enableCompatqualCheckerFrameworkAnnotations = z;
        this.jspecifyReportLevel = reportLevel3;
        this.description$delegate = LazyKt.lazy(new JavaTypeEnhancementState$description$2(this));
        boolean z2 = true;
        boolean z3 = this.globalJsr305Level == ReportLevel.IGNORE && this.migrationLevelForJsr305 == ReportLevel.IGNORE && this.userDefinedLevelForSpecificJsr305Annotation.isEmpty();
        this.disabledJsr305 = z3;
        if (!z3 && this.jspecifyReportLevel != ReportLevel.IGNORE) {
            z2 = false;
        }
        this.disabledDefaultAnnotations = z2;
    }

    @NotNull
    public final ReportLevel getGlobalJsr305Level() {
        return this.globalJsr305Level;
    }

    @Nullable
    public final ReportLevel getMigrationLevelForJsr305() {
        return this.migrationLevelForJsr305;
    }

    @NotNull
    public final Map<String, ReportLevel> getUserDefinedLevelForSpecificJsr305Annotation() {
        return this.userDefinedLevelForSpecificJsr305Annotation;
    }

    public final boolean getEnableCompatqualCheckerFrameworkAnnotations() {
        return this.enableCompatqualCheckerFrameworkAnnotations;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JavaTypeEnhancementState(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, boolean z, ReportLevel reportLevel3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, reportLevel2, map, (i & 8) != 0 ? true : z, (i & 16) != 0 ? DEFAULT_REPORT_LEVEL_FOR_JSPECIFY : reportLevel3);
    }

    @NotNull
    public final ReportLevel getJspecifyReportLevel() {
        return this.jspecifyReportLevel;
    }

    public final boolean getDisabledJsr305() {
        return this.disabledJsr305;
    }

    public final boolean getDisabledDefaultAnnotations() {
        return this.disabledDefaultAnnotations;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        ReportLevel reportLevel = ReportLevel.IGNORE;
        DISABLED_JSR_305 = new JavaTypeEnhancementState(reportLevel, reportLevel, MapsKt.emptyMap(), false, (ReportLevel) null, 24, (DefaultConstructorMarker) null);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        STRICT = new JavaTypeEnhancementState(reportLevel2, reportLevel2, MapsKt.emptyMap(), false, (ReportLevel) null, 24, (DefaultConstructorMarker) null);
    }
}
