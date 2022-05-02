package com.google.firebase.crashlytics.internal.model;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application_Organization;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Device;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Device;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Log;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_User;
import com.google.firebase.encoders.annotations.Encodable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;
import kotlin.text.Typography;

@AutoValue
@Encodable
public abstract class CrashlyticsReport {
    public static final String DEVELOPMENT_PLATFORM_UNITY = "Unity";
    private static final Charset UTF_8 = Charset.forName(setMin(View.resolveSizeAndState(0, 0, 0), (char) (30861 - View.MeasureSpec.getMode(0)), View.resolveSize(0, 0) + 5).intern());
    private static char[] getMax = null;
    private static int getMin = 0;
    private static long length = 0;
    private static int setMin = 1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Architecture {
        public static final int ARM64 = 9;
        public static final int ARMV6 = 5;
        public static final int ARMV7 = 6;
        public static final int UNKNOWN = 7;
        public static final int X86_32 = 0;
        public static final int X86_64 = 1;
    }

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract CrashlyticsReport build();

        @NonNull
        public abstract Builder setBuildVersion(@NonNull String str);

        @NonNull
        public abstract Builder setDisplayVersion(@NonNull String str);

        @NonNull
        public abstract Builder setGmpAppId(@NonNull String str);

        @NonNull
        public abstract Builder setInstallationUuid(@NonNull String str);

        @NonNull
        public abstract Builder setNdkPayload(FilesPayload filesPayload);

        @NonNull
        public abstract Builder setPlatform(int i);

        @NonNull
        public abstract Builder setSdkVersion(@NonNull String str);

        @NonNull
        public abstract Builder setSession(@NonNull Session session);
    }

    public enum Type {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    static void setMax() {
        getMax = new char[]{30936, 37316, 43761, 50167, 56513};
        length = 7161426787653380381L;
    }

    @NonNull
    public abstract String getBuildVersion();

    @NonNull
    public abstract String getDisplayVersion();

    @NonNull
    public abstract String getGmpAppId();

    @NonNull
    public abstract String getInstallationUuid();

    @Nullable
    public abstract FilesPayload getNdkPayload();

    public abstract int getPlatform();

    @NonNull
    public abstract String getSdkVersion();

    @Nullable
    public abstract Session getSession();

    /* access modifiers changed from: protected */
    @NonNull
    public abstract Builder toBuilder();

    static /* synthetic */ Charset access$000() {
        try {
            int i = getMin + 119;
            setMin = i % 128;
            int i2 = i % 2;
            Charset charset = UTF_8;
            int i3 = setMin + 69;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            return charset;
        } catch (Exception e) {
            throw e;
        }
    }

    static {
        setMax();
        int i = setMin + 19;
        getMin = i % 128;
        int i2 = i % 2;
    }

    @NonNull
    public static Builder builder() {
        AutoValue_CrashlyticsReport.Builder builder = new AutoValue_CrashlyticsReport.Builder();
        try {
            int i = setMin + 11;
            getMin = i % 128;
            if (i % 2 == 0) {
                return builder;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return builder;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if ((getSession() != null ? '%' : '.') != '%') goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0060, code lost:
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Type.JAVA;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 != null) goto L_0x005e;
     */
    @com.google.firebase.encoders.annotations.Encodable.Ignore
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Type getType() {
        /*
            r3 = this;
            int r0 = getMin
            int r0 = r0 + 73
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0019
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r0 = r3.getSession()
            r1 = 0
            super.hashCode()     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0028
            goto L_0x005e
        L_0x0017:
            r0 = move-exception
            throw r0
        L_0x0019:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r0 = r3.getSession()
            r1 = 37
            if (r0 == 0) goto L_0x0024
            r0 = 37
            goto L_0x0026
        L_0x0024:
            r0 = 46
        L_0x0026:
            if (r0 == r1) goto L_0x005e
        L_0x0028:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r0 = r3.getNdkPayload()
            if (r0 == 0) goto L_0x005b
            int r0 = setMin     // Catch:{ Exception -> 0x0059 }
            int r0 = r0 + 35
            int r1 = r0 % 128
            getMin = r1     // Catch:{ Exception -> 0x0057 }
            int r0 = r0 % 2
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Type r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Type.NATIVE
            int r1 = setMin
            int r1 = r1 + 77
            int r2 = r1 % 128
            getMin = r2
            int r1 = r1 % 2
            r2 = 44
            if (r1 == 0) goto L_0x004b
            r1 = 76
            goto L_0x004d
        L_0x004b:
            r1 = 44
        L_0x004d:
            if (r1 == r2) goto L_0x0056
            r1 = 75
            int r1 = r1 / 0
            return r0
        L_0x0054:
            r0 = move-exception
            throw r0
        L_0x0056:
            return r0
        L_0x0057:
            r0 = move-exception
            throw r0
        L_0x0059:
            r0 = move-exception
            throw r0
        L_0x005b:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Type r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Type.INCOMPLETE
            return r0
        L_0x005e:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Type r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Type.JAVA
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.CrashlyticsReport.getType():com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Type");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005d, code lost:
        throw new java.lang.IllegalStateException("Reports without sessions cannot have events added to them.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (getSession() != null) goto L_0x0022;
     */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport withEvents(@androidx.annotation.NonNull com.google.firebase.crashlytics.internal.model.ImmutableList<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> r4) {
        /*
            r3 = this;
            int r0 = getMin
            int r0 = r0 + 97
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x000e
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            r1 = 0
            if (r0 == 0) goto L_0x0019
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r0 = r3.getSession()
            if (r0 == 0) goto L_0x0056
            goto L_0x0022
        L_0x0019:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r0 = r3.getSession()
            super.hashCode()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0056
        L_0x0022:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r3.toBuilder()     // Catch:{ Exception -> 0x0054 }
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r2 = r3.getSession()     // Catch:{ Exception -> 0x0052 }
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r4 = r2.withEvents(r4)     // Catch:{ Exception -> 0x0052 }
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r4 = r0.setSession(r4)     // Catch:{ Exception -> 0x0052 }
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r4 = r4.build()     // Catch:{ Exception -> 0x0052 }
            int r0 = setMin
            int r0 = r0 + 39
            int r2 = r0 % 128
            getMin = r2
            int r0 = r0 % 2
            r2 = 8
            if (r0 == 0) goto L_0x0047
            r0 = 64
            goto L_0x0049
        L_0x0047:
            r0 = 8
        L_0x0049:
            if (r0 == r2) goto L_0x0051
            super.hashCode()     // Catch:{ all -> 0x004f }
            return r4
        L_0x004f:
            r4 = move-exception
            throw r4
        L_0x0051:
            return r4
        L_0x0052:
            r4 = move-exception
            throw r4
        L_0x0054:
            r4 = move-exception
            throw r4
        L_0x0056:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Reports without sessions cannot have events added to them."
            r4.<init>(r0)
            throw r4
        L_0x005e:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.CrashlyticsReport.withEvents(com.google.firebase.crashlytics.internal.model.ImmutableList):com.google.firebase.crashlytics.internal.model.CrashlyticsReport");
    }

    @NonNull
    public CrashlyticsReport withOrganizationId(@NonNull String str) {
        int i = setMin + 33;
        getMin = i % 128;
        int i2 = i % 2;
        Builder builder = toBuilder();
        FilesPayload ndkPayload = getNdkPayload();
        if (ndkPayload != null) {
            try {
                builder.setNdkPayload(ndkPayload.toBuilder().setOrgId(str).build());
                int i3 = getMin + 67;
                setMin = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
        Session session = getSession();
        if ((session != null ? '+' : Typography.amp) == '+') {
            int i5 = setMin + 113;
            getMin = i5 % 128;
            if (i5 % 2 == 0) {
                builder.setSession(session.withOrganizationId(str));
            } else {
                builder.setSession(session.withOrganizationId(str));
                Object obj = null;
                super.hashCode();
            }
        }
        return builder.build();
    }

    @NonNull
    public CrashlyticsReport withNdkPayload(@NonNull FilesPayload filesPayload) {
        int i = getMin + 101;
        setMin = i % 128;
        int i2 = i % 2;
        CrashlyticsReport build = toBuilder().setSession((Session) null).setNdkPayload(filesPayload).build();
        int i3 = getMin + 37;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        return build;
    }

    @NonNull
    public CrashlyticsReport withSessionEndFields(long j, boolean z, @Nullable String str) {
        Builder builder = toBuilder();
        if ((getSession() != null ? 'C' : '0') == 'C') {
            try {
                int i = setMin + 43;
                getMin = i % 128;
                int i2 = i % 2;
                try {
                    builder.setSession(getSession().withSessionEndFields(j, z, str));
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        CrashlyticsReport build = builder.build();
        int i3 = getMin + 119;
        setMin = i3 % 128;
        if (i3 % 2 != 0) {
            return build;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return build;
    }

    @AutoValue
    public static abstract class FilesPayload {

        @AutoValue.Builder
        public static abstract class Builder {
            public abstract FilesPayload build();

            public abstract Builder setFiles(ImmutableList<File> immutableList);

            public abstract Builder setOrgId(String str);
        }

        @NonNull
        public abstract ImmutableList<File> getFiles();

        @Nullable
        public abstract String getOrgId();

        /* access modifiers changed from: package-private */
        public abstract Builder toBuilder();

        @NonNull
        public static Builder builder() {
            return new AutoValue_CrashlyticsReport_FilesPayload.Builder();
        }

        @AutoValue
        public static abstract class File {

            @AutoValue.Builder
            public static abstract class Builder {
                public abstract File build();

                public abstract Builder setContents(byte[] bArr);

                public abstract Builder setFilename(String str);
            }

            @NonNull
            public abstract byte[] getContents();

            @NonNull
            public abstract String getFilename();

            @NonNull
            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_FilesPayload_File.Builder();
            }
        }
    }

    @AutoValue
    public static abstract class CustomAttribute {

        @AutoValue.Builder
        public static abstract class Builder {
            @NonNull
            public abstract CustomAttribute build();

            @NonNull
            public abstract Builder setKey(@NonNull String str);

            @NonNull
            public abstract Builder setValue(@NonNull String str);
        }

        @NonNull
        public abstract String getKey();

        @NonNull
        public abstract String getValue();

        @NonNull
        public static Builder builder() {
            return new AutoValue_CrashlyticsReport_CustomAttribute.Builder();
        }
    }

    @AutoValue
    public static abstract class Session {
        @NonNull
        public abstract Application getApp();

        @Nullable
        public abstract Device getDevice();

        @Nullable
        public abstract Long getEndedAt();

        @Nullable
        public abstract ImmutableList<Event> getEvents();

        @NonNull
        public abstract String getGenerator();

        public abstract int getGeneratorType();

        @NonNull
        @Encodable.Ignore
        public abstract String getIdentifier();

        @Nullable
        public abstract OperatingSystem getOs();

        public abstract long getStartedAt();

        @Nullable
        public abstract User getUser();

        public abstract boolean isCrashed();

        @NonNull
        public abstract Builder toBuilder();

        @NonNull
        public static Builder builder() {
            return new AutoValue_CrashlyticsReport_Session.Builder().setCrashed(false);
        }

        @NonNull
        @Encodable.Field(name = "identifier")
        public byte[] getIdentifierUtf8Bytes() {
            return getIdentifier().getBytes(CrashlyticsReport.access$000());
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public Session withEvents(@NonNull ImmutableList<Event> immutableList) {
            return toBuilder().setEvents(immutableList).build();
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public Session withOrganizationId(@NonNull String str) {
            return toBuilder().setApp(getApp().withOrganizationId(str)).build();
        }

        /* access modifiers changed from: package-private */
        @NonNull
        public Session withSessionEndFields(long j, boolean z, @Nullable String str) {
            Builder builder = toBuilder();
            builder.setEndedAt(Long.valueOf(j));
            builder.setCrashed(z);
            if (str != null) {
                builder.setUser(User.builder().setIdentifier(str).build()).build();
            }
            return builder.build();
        }

        @AutoValue.Builder
        public static abstract class Builder {
            @NonNull
            public abstract Session build();

            @NonNull
            public abstract Builder setApp(@NonNull Application application);

            @NonNull
            public abstract Builder setCrashed(boolean z);

            @NonNull
            public abstract Builder setDevice(@NonNull Device device);

            @NonNull
            public abstract Builder setEndedAt(@NonNull Long l);

            @NonNull
            public abstract Builder setEvents(@NonNull ImmutableList<Event> immutableList);

            @NonNull
            public abstract Builder setGenerator(@NonNull String str);

            @NonNull
            public abstract Builder setGeneratorType(int i);

            @NonNull
            public abstract Builder setIdentifier(@NonNull String str);

            @NonNull
            public abstract Builder setOs(@NonNull OperatingSystem operatingSystem);

            @NonNull
            public abstract Builder setStartedAt(long j);

            @NonNull
            public abstract Builder setUser(@NonNull User user);

            @NonNull
            public Builder setIdentifierFromUtf8Bytes(@NonNull byte[] bArr) {
                return setIdentifier(new String(bArr, CrashlyticsReport.access$000()));
            }
        }

        @AutoValue
        public static abstract class User {

            @AutoValue.Builder
            public static abstract class Builder {
                @NonNull
                public abstract User build();

                @NonNull
                public abstract Builder setIdentifier(@NonNull String str);
            }

            @NonNull
            public abstract String getIdentifier();

            @NonNull
            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_Session_User.Builder();
            }
        }

        @AutoValue
        public static abstract class Application {

            @AutoValue.Builder
            public static abstract class Builder {
                @NonNull
                public abstract Application build();

                @NonNull
                public abstract Builder setDevelopmentPlatform(@Nullable String str);

                @NonNull
                public abstract Builder setDevelopmentPlatformVersion(@Nullable String str);

                @NonNull
                public abstract Builder setDisplayVersion(@NonNull String str);

                @NonNull
                public abstract Builder setIdentifier(@NonNull String str);

                @NonNull
                public abstract Builder setInstallationUuid(@NonNull String str);

                @NonNull
                public abstract Builder setOrganization(@NonNull Organization organization);

                @NonNull
                public abstract Builder setVersion(@NonNull String str);
            }

            @Nullable
            public abstract String getDevelopmentPlatform();

            @Nullable
            public abstract String getDevelopmentPlatformVersion();

            @Nullable
            public abstract String getDisplayVersion();

            @NonNull
            public abstract String getIdentifier();

            @Nullable
            public abstract String getInstallationUuid();

            @Nullable
            public abstract Organization getOrganization();

            @NonNull
            public abstract String getVersion();

            /* access modifiers changed from: protected */
            @NonNull
            public abstract Builder toBuilder();

            @NonNull
            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_Session_Application.Builder();
            }

            /* access modifiers changed from: package-private */
            @NonNull
            public Application withOrganizationId(@NonNull String str) {
                Organization organization = getOrganization();
                return toBuilder().setOrganization((organization != null ? organization.toBuilder() : Organization.builder()).setClsId(str).build()).build();
            }

            @AutoValue
            public static abstract class Organization {

                @AutoValue.Builder
                public static abstract class Builder {
                    @NonNull
                    public abstract Organization build();

                    @NonNull
                    public abstract Builder setClsId(@NonNull String str);
                }

                @NonNull
                public abstract String getClsId();

                /* access modifiers changed from: protected */
                @NonNull
                public abstract Builder toBuilder();

                @NonNull
                public static Builder builder() {
                    return new AutoValue_CrashlyticsReport_Session_Application_Organization.Builder();
                }
            }
        }

        @AutoValue
        public static abstract class OperatingSystem {

            @AutoValue.Builder
            public static abstract class Builder {
                @NonNull
                public abstract OperatingSystem build();

                @NonNull
                public abstract Builder setBuildVersion(@NonNull String str);

                @NonNull
                public abstract Builder setJailbroken(boolean z);

                @NonNull
                public abstract Builder setPlatform(int i);

                @NonNull
                public abstract Builder setVersion(@NonNull String str);
            }

            @NonNull
            public abstract String getBuildVersion();

            public abstract int getPlatform();

            @NonNull
            public abstract String getVersion();

            public abstract boolean isJailbroken();

            @NonNull
            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder();
            }
        }

        @AutoValue
        public static abstract class Device {

            @AutoValue.Builder
            public static abstract class Builder {
                @NonNull
                public abstract Device build();

                @NonNull
                public abstract Builder setArch(int i);

                @NonNull
                public abstract Builder setCores(int i);

                @NonNull
                public abstract Builder setDiskSpace(long j);

                @NonNull
                public abstract Builder setManufacturer(@NonNull String str);

                @NonNull
                public abstract Builder setModel(@NonNull String str);

                @NonNull
                public abstract Builder setModelClass(@NonNull String str);

                @NonNull
                public abstract Builder setRam(long j);

                @NonNull
                public abstract Builder setSimulator(boolean z);

                @NonNull
                public abstract Builder setState(int i);
            }

            @NonNull
            public abstract int getArch();

            public abstract int getCores();

            public abstract long getDiskSpace();

            @NonNull
            public abstract String getManufacturer();

            @NonNull
            public abstract String getModel();

            @NonNull
            public abstract String getModelClass();

            public abstract long getRam();

            public abstract int getState();

            public abstract boolean isSimulator();

            @NonNull
            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_Session_Device.Builder();
            }
        }

        @AutoValue
        public static abstract class Event {

            @AutoValue.Builder
            public static abstract class Builder {
                @NonNull
                public abstract Event build();

                @NonNull
                public abstract Builder setApp(@NonNull Application application);

                @NonNull
                public abstract Builder setDevice(@NonNull Device device);

                @NonNull
                public abstract Builder setLog(@NonNull Log log);

                @NonNull
                public abstract Builder setTimestamp(long j);

                @NonNull
                public abstract Builder setType(@NonNull String str);
            }

            @NonNull
            public abstract Application getApp();

            @NonNull
            public abstract Device getDevice();

            @Nullable
            public abstract Log getLog();

            public abstract long getTimestamp();

            @NonNull
            public abstract String getType();

            @NonNull
            public abstract Builder toBuilder();

            @NonNull
            public static Builder builder() {
                return new AutoValue_CrashlyticsReport_Session_Event.Builder();
            }

            @AutoValue
            public static abstract class Application {

                @AutoValue.Builder
                public static abstract class Builder {
                    @NonNull
                    public abstract Application build();

                    @NonNull
                    public abstract Builder setBackground(@Nullable Boolean bool);

                    @NonNull
                    public abstract Builder setCustomAttributes(@NonNull ImmutableList<CustomAttribute> immutableList);

                    @NonNull
                    public abstract Builder setExecution(@NonNull Execution execution);

                    @NonNull
                    public abstract Builder setUiOrientation(int i);
                }

                @Nullable
                public abstract Boolean getBackground();

                @Nullable
                public abstract ImmutableList<CustomAttribute> getCustomAttributes();

                @NonNull
                public abstract Execution getExecution();

                public abstract int getUiOrientation();

                @NonNull
                public abstract Builder toBuilder();

                @NonNull
                public static Builder builder() {
                    return new AutoValue_CrashlyticsReport_Session_Event_Application.Builder();
                }

                @AutoValue
                public static abstract class Execution {

                    @AutoValue.Builder
                    public static abstract class Builder {
                        @NonNull
                        public abstract Execution build();

                        @NonNull
                        public abstract Builder setBinaries(@NonNull ImmutableList<BinaryImage> immutableList);

                        @NonNull
                        public abstract Builder setException(@NonNull Exception exception);

                        @NonNull
                        public abstract Builder setSignal(@NonNull Signal signal);

                        @NonNull
                        public abstract Builder setThreads(@NonNull ImmutableList<Thread> immutableList);
                    }

                    @NonNull
                    public abstract ImmutableList<BinaryImage> getBinaries();

                    @NonNull
                    public abstract Exception getException();

                    @NonNull
                    public abstract Signal getSignal();

                    @NonNull
                    public abstract ImmutableList<Thread> getThreads();

                    @NonNull
                    public static Builder builder() {
                        return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder();
                    }

                    @AutoValue
                    public static abstract class Thread {

                        @AutoValue.Builder
                        public static abstract class Builder {
                            @NonNull
                            public abstract Thread build();

                            @NonNull
                            public abstract Builder setFrames(@NonNull ImmutableList<Frame> immutableList);

                            @NonNull
                            public abstract Builder setImportance(int i);

                            @NonNull
                            public abstract Builder setName(@NonNull String str);
                        }

                        @NonNull
                        public abstract ImmutableList<Frame> getFrames();

                        public abstract int getImportance();

                        @NonNull
                        public abstract String getName();

                        @NonNull
                        public static Builder builder() {
                            return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.Builder();
                        }

                        @AutoValue
                        public static abstract class Frame {

                            @AutoValue.Builder
                            public static abstract class Builder {
                                @NonNull
                                public abstract Frame build();

                                @NonNull
                                public abstract Builder setFile(@NonNull String str);

                                @NonNull
                                public abstract Builder setImportance(int i);

                                @NonNull
                                public abstract Builder setOffset(long j);

                                @NonNull
                                public abstract Builder setPc(long j);

                                @NonNull
                                public abstract Builder setSymbol(@NonNull String str);
                            }

                            @Nullable
                            public abstract String getFile();

                            public abstract int getImportance();

                            public abstract long getOffset();

                            public abstract long getPc();

                            @NonNull
                            public abstract String getSymbol();

                            @NonNull
                            public static Builder builder() {
                                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.Builder();
                            }
                        }
                    }

                    @AutoValue
                    public static abstract class Exception {

                        @AutoValue.Builder
                        public static abstract class Builder {
                            @NonNull
                            public abstract Exception build();

                            @NonNull
                            public abstract Builder setCausedBy(@NonNull Exception exception);

                            @NonNull
                            public abstract Builder setFrames(@NonNull ImmutableList<Thread.Frame> immutableList);

                            @NonNull
                            public abstract Builder setOverflowCount(int i);

                            @NonNull
                            public abstract Builder setReason(@NonNull String str);

                            @NonNull
                            public abstract Builder setType(@NonNull String str);
                        }

                        @Nullable
                        public abstract Exception getCausedBy();

                        @NonNull
                        public abstract ImmutableList<Thread.Frame> getFrames();

                        public abstract int getOverflowCount();

                        @Nullable
                        public abstract String getReason();

                        @NonNull
                        public abstract String getType();

                        @NonNull
                        public static Builder builder() {
                            return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.Builder();
                        }
                    }

                    @AutoValue
                    public static abstract class Signal {

                        @AutoValue.Builder
                        public static abstract class Builder {
                            @NonNull
                            public abstract Signal build();

                            @NonNull
                            public abstract Builder setAddress(long j);

                            @NonNull
                            public abstract Builder setCode(@NonNull String str);

                            @NonNull
                            public abstract Builder setName(@NonNull String str);
                        }

                        @NonNull
                        public abstract long getAddress();

                        @NonNull
                        public abstract String getCode();

                        @NonNull
                        public abstract String getName();

                        @NonNull
                        public static Builder builder() {
                            return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.Builder();
                        }
                    }

                    @AutoValue
                    public static abstract class BinaryImage {
                        @NonNull
                        public abstract long getBaseAddress();

                        @NonNull
                        public abstract String getName();

                        public abstract long getSize();

                        @Encodable.Ignore
                        @Nullable
                        public abstract String getUuid();

                        @NonNull
                        public static Builder builder() {
                            return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.Builder();
                        }

                        @Nullable
                        @Encodable.Field(name = "uuid")
                        public byte[] getUuidUtf8Bytes() {
                            String uuid = getUuid();
                            if (uuid != null) {
                                return uuid.getBytes(CrashlyticsReport.access$000());
                            }
                            return null;
                        }

                        @AutoValue.Builder
                        public static abstract class Builder {
                            @NonNull
                            public abstract BinaryImage build();

                            @NonNull
                            public abstract Builder setBaseAddress(long j);

                            @NonNull
                            public abstract Builder setName(@NonNull String str);

                            @NonNull
                            public abstract Builder setSize(long j);

                            @NonNull
                            public abstract Builder setUuid(@Nullable String str);

                            @NonNull
                            public Builder setUuidFromUtf8Bytes(@NonNull byte[] bArr) {
                                return setUuid(new String(bArr, CrashlyticsReport.access$000()));
                            }
                        }
                    }
                }
            }

            @AutoValue
            public static abstract class Device {

                @AutoValue.Builder
                public static abstract class Builder {
                    @NonNull
                    public abstract Device build();

                    @NonNull
                    public abstract Builder setBatteryLevel(Double d);

                    @NonNull
                    public abstract Builder setBatteryVelocity(int i);

                    @NonNull
                    public abstract Builder setDiskUsed(long j);

                    @NonNull
                    public abstract Builder setOrientation(int i);

                    @NonNull
                    public abstract Builder setProximityOn(boolean z);

                    @NonNull
                    public abstract Builder setRamUsed(long j);
                }

                @Nullable
                public abstract Double getBatteryLevel();

                public abstract int getBatteryVelocity();

                public abstract long getDiskUsed();

                public abstract int getOrientation();

                public abstract long getRamUsed();

                public abstract boolean isProximityOn();

                @NonNull
                public static Builder builder() {
                    return new AutoValue_CrashlyticsReport_Session_Event_Device.Builder();
                }
            }

            @AutoValue
            public static abstract class Log {

                @AutoValue.Builder
                public static abstract class Builder {
                    @NonNull
                    public abstract Log build();

                    @NonNull
                    public abstract Builder setContent(@NonNull String str);
                }

                @NonNull
                public abstract String getContent();

                @NonNull
                public static Builder builder() {
                    return new AutoValue_CrashlyticsReport_Session_Event_Log.Builder();
                }
            }
        }
    }

    private static String setMin(int i, char c, int i2) {
        int i3 = setMin + 95;
        getMin = i3 % 128;
        int i4 = 0;
        if (i3 % 2 != 0) {
        }
        char[] cArr = new char[i2];
        while (i4 < i2) {
            int i5 = getMin + 19;
            setMin = i5 % 128;
            if ((i5 % 2 == 0 ? '/' : '\\') != '/') {
                try {
                    cArr[i4] = (char) ((int) ((((long) getMax[i + i4]) ^ (((long) i4) * length)) ^ ((long) c)));
                    i4++;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                try {
                    cArr[i4] = (char) ((int) ((((long) getMax[i / i4]) & (((long) i4) | length)) | ((long) c)));
                    i4 += 122;
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
        return new String(cArr);
    }
}
