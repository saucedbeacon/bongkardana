package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event_Application extends CrashlyticsReport.Session.Event.Application {
    private final Boolean background;
    private final ImmutableList<CrashlyticsReport.CustomAttribute> customAttributes;
    private final CrashlyticsReport.Session.Event.Application.Execution execution;
    private final int uiOrientation;

    private AutoValue_CrashlyticsReport_Session_Event_Application(CrashlyticsReport.Session.Event.Application.Execution execution2, @Nullable ImmutableList<CrashlyticsReport.CustomAttribute> immutableList, @Nullable Boolean bool, int i) {
        this.execution = execution2;
        this.customAttributes = immutableList;
        this.background = bool;
        this.uiOrientation = i;
    }

    @NonNull
    public final CrashlyticsReport.Session.Event.Application.Execution getExecution() {
        return this.execution;
    }

    @Nullable
    public final ImmutableList<CrashlyticsReport.CustomAttribute> getCustomAttributes() {
        return this.customAttributes;
    }

    @Nullable
    public final Boolean getBackground() {
        return this.background;
    }

    public final int getUiOrientation() {
        return this.uiOrientation;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.execution);
        sb.append(", customAttributes=");
        sb.append(this.customAttributes);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", uiOrientation=");
        sb.append(this.uiOrientation);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.background;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.customAttributes;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
            r2 = 0
            if (r1 == 0) goto L_0x004a
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application) r5
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r1 = r4.execution
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r3 = r5.getExecution()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
            com.google.firebase.crashlytics.internal.model.ImmutableList<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute> r1 = r4.customAttributes
            if (r1 != 0) goto L_0x0022
            com.google.firebase.crashlytics.internal.model.ImmutableList r1 = r5.getCustomAttributes()
            if (r1 != 0) goto L_0x004a
            goto L_0x002c
        L_0x0022:
            com.google.firebase.crashlytics.internal.model.ImmutableList r3 = r5.getCustomAttributes()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
        L_0x002c:
            java.lang.Boolean r1 = r4.background
            if (r1 != 0) goto L_0x0037
            java.lang.Boolean r1 = r5.getBackground()
            if (r1 != 0) goto L_0x004a
            goto L_0x0041
        L_0x0037:
            java.lang.Boolean r3 = r5.getBackground()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
        L_0x0041:
            int r1 = r4.uiOrientation
            int r5 = r5.getUiOrientation()
            if (r1 != r5) goto L_0x004a
            return r0
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.execution.hashCode() ^ 1000003) * 1000003;
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList = this.customAttributes;
        int i = 0;
        int hashCode2 = (hashCode ^ (immutableList == null ? 0 : immutableList.hashCode())) * 1000003;
        Boolean bool = this.background;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.uiOrientation;
    }

    public final CrashlyticsReport.Session.Event.Application.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends CrashlyticsReport.Session.Event.Application.Builder {
        private Boolean background;
        private ImmutableList<CrashlyticsReport.CustomAttribute> customAttributes;
        private CrashlyticsReport.Session.Event.Application.Execution execution;
        private Integer uiOrientation;

        Builder() {
        }

        private Builder(CrashlyticsReport.Session.Event.Application application) {
            this.execution = application.getExecution();
            this.customAttributes = application.getCustomAttributes();
            this.background = application.getBackground();
            this.uiOrientation = Integer.valueOf(application.getUiOrientation());
        }

        public final CrashlyticsReport.Session.Event.Application.Builder setExecution(CrashlyticsReport.Session.Event.Application.Execution execution2) {
            if (execution2 != null) {
                this.execution = execution2;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        public final CrashlyticsReport.Session.Event.Application.Builder setCustomAttributes(ImmutableList<CrashlyticsReport.CustomAttribute> immutableList) {
            this.customAttributes = immutableList;
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Builder setBackground(@Nullable Boolean bool) {
            this.background = bool;
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Builder setUiOrientation(int i) {
            this.uiOrientation = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application build() {
            String str = "";
            if (this.execution == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" execution");
                str = sb.toString();
            }
            if (this.uiOrientation == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" uiOrientation");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application(this.execution, this.customAttributes, this.background, this.uiOrientation.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
