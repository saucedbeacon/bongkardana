package com.google.firebase.crashlytics.internal.persistence;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.parser.JSONLexer;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.Typography;
import o.FragmentContainerView;
import o.endViewTransition;
import o.removeViewInLayout;
import o.setDrawDisappearingViewsLast;
import o.startViewTransition;

public class CrashlyticsReportPersistence {
    private static final String EVENT_COUNTER_FORMAT = "%010d";
    private static final int EVENT_COUNTER_WIDTH = 10;
    private static final FilenameFilter EVENT_FILE_FILTER = endViewTransition.setMax;
    private static final String EVENT_FILE_NAME_PREFIX = "event";
    private static final int EVENT_NAME_LENGTH = 15;
    private static int IsOverlapping = 1;
    private static final Comparator<? super File> LATEST_SESSION_ID_FIRST_COMPARATOR = setDrawDisappearingViewsLast.getMin;
    private static final int MAX_OPEN_SESSIONS = 8;
    private static final String NATIVE_REPORTS_DIRECTORY = "native-reports";
    private static final String NORMAL_EVENT_SUFFIX = "";
    private static final String OPEN_SESSIONS_DIRECTORY_NAME = "sessions";
    private static final String PRIORITY_EVENT_SUFFIX = "_";
    private static final String PRIORITY_REPORTS_DIRECTORY = "priority-reports";
    private static final String REPORTS_DIRECTORY = "reports";
    private static final String REPORT_FILE_NAME = "report";
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private static final String USER_FILE_NAME = "user";
    private static final Charset UTF_8 = Charset.forName(setMax(KeyEvent.normalizeMetaState(0) - 83, (byte) (20 - TextUtils.getOffsetBefore("", 0)), -1398529898 - ((Process.getThreadPriority(0) + 20) >> 6), -1552883180 - TextUtils.indexOf("", '0'), (short) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 38)).intern());
    private static final String WORKING_DIRECTORY_NAME = "report-persistence";
    private static short[] getMax;
    private static int getMin;
    private static int length;
    private static byte[] setMax;
    private static int setMin;
    private static int toFloatRange;
    @NonNull
    private final AtomicInteger eventCounter = new AtomicInteger(0);
    @NonNull
    private final File nativeReportsDirectory;
    @NonNull
    private final File openSessionsDirectory;
    @NonNull
    private final File priorityReportsDirectory;
    @NonNull
    private final File reportsDirectory;
    @NonNull
    private final SettingsDataProvider settingsDataProvider;

    public static /* synthetic */ boolean getMax(String str, File file, String str2) {
        int i = toFloatRange + 65;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        boolean lambda$deleteFinalizedReport$2 = lambda$deleteFinalizedReport$2(str, file, str2);
        try {
            int i3 = IsOverlapping + 41;
            toFloatRange = i3 % 128;
            if ((i3 % 2 != 0 ? 'U' : Typography.amp) != 'U') {
                return lambda$deleteFinalizedReport$2;
            }
            int i4 = 6 / 0;
            return lambda$deleteFinalizedReport$2;
        } catch (Exception e) {
            throw e;
        }
    }

    public static /* synthetic */ boolean getMin(File file, String str) {
        boolean z;
        int i = toFloatRange + 27;
        IsOverlapping = i % 128;
        if (!(i % 2 != 0)) {
            try {
                z = lambda$static$1(file, str);
                Object obj = null;
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } else {
            try {
                z = lambda$static$1(file, str);
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i2 = IsOverlapping + 67;
        toFloatRange = i2 % 128;
        int i3 = i2 % 2;
        return z;
    }

    public static /* synthetic */ boolean getMin(String str, File file) {
        int i = toFloatRange + 103;
        IsOverlapping = i % 128;
        if (!(i % 2 == 0)) {
            return lambda$capAndGetOpenSessions$3(str, file);
        }
        try {
            boolean lambda$capAndGetOpenSessions$3 = lambda$capAndGetOpenSessions$3(str, file);
            int i2 = 27 / 0;
            return lambda$capAndGetOpenSessions$3;
        } catch (Exception e) {
            throw e;
        }
    }

    public static /* synthetic */ int length(File file, File file2) {
        int i = IsOverlapping + 97;
        toFloatRange = i % 128;
        boolean z = false;
        boolean z2 = i % 2 != 0;
        int oldestEventFileFirst = oldestEventFileFirst(file, file2);
        if (z2) {
            int i2 = 78 / 0;
        }
        try {
            int i3 = toFloatRange + 61;
            IsOverlapping = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
            if (z) {
                return oldestEventFileFirst;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return oldestEventFileFirst;
        } catch (Exception e) {
            throw e;
        }
    }

    public static /* synthetic */ boolean length(File file, String str) {
        int i = toFloatRange + 83;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        boolean isNormalPriorityEventFile = isNormalPriorityEventFile(file, str);
        int i3 = toFloatRange + 1;
        IsOverlapping = i3 % 128;
        if ((i3 % 2 == 0 ? ';' : 'W') == 'W') {
            return isNormalPriorityEventFile;
        }
        Object obj = null;
        super.hashCode();
        return isNormalPriorityEventFile;
    }

    static void setMax() {
        length = 1552883264;
        setMin = 1398529898;
        setMax = new byte[]{-77, -7, -51, -64, -59};
        getMin = 82;
    }

    public static /* synthetic */ int setMin(File file, File file2) {
        int i;
        try {
            int i2 = toFloatRange + 53;
            IsOverlapping = i2 % 128;
            if ((i2 % 2 == 0 ? 2 : 'M') != 2) {
                try {
                    i = lambda$static$0(file, file2);
                } catch (Exception e) {
                    throw e;
                }
            } else {
                i = lambda$static$0(file, file2);
                Object[] objArr = null;
                int length2 = objArr.length;
            }
            int i3 = toFloatRange + 91;
            IsOverlapping = i3 % 128;
            int i4 = i3 % 2;
            return i;
        } catch (Exception e2) {
            throw e2;
        }
    }

    static {
        setMax();
        try {
            int i = toFloatRange + 99;
            try {
                IsOverlapping = i % 128;
                int i2 = i % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static /* synthetic */ int lambda$static$0(File file, File file2) {
        try {
            int i = toFloatRange + 37;
            IsOverlapping = i % 128;
            boolean z = true;
            char c = i % 2 == 0 ? '\\' : 1;
            Object[] objArr = null;
            int compareTo = file2.getName().compareTo(file.getName());
            if (c == '\\') {
                int length2 = objArr.length;
            }
            int i2 = toFloatRange + 15;
            IsOverlapping = i2 % 128;
            if (i2 % 2 != 0) {
                z = false;
            }
            if (!z) {
                return compareTo;
            }
            super.hashCode();
            return compareTo;
        } catch (Exception e) {
            throw e;
        }
    }

    private static /* synthetic */ boolean lambda$static$1(File file, String str) {
        int i = IsOverlapping + 91;
        toFloatRange = i % 128;
        int i2 = i % 2;
        boolean startsWith = str.startsWith("event");
        int i3 = IsOverlapping + 119;
        toFloatRange = i3 % 128;
        int i4 = i3 % 2;
        return startsWith;
    }

    public CrashlyticsReportPersistence(@NonNull File file, @NonNull SettingsDataProvider settingsDataProvider2) {
        File file2 = new File(file, WORKING_DIRECTORY_NAME);
        this.openSessionsDirectory = new File(file2, OPEN_SESSIONS_DIRECTORY_NAME);
        this.priorityReportsDirectory = new File(file2, PRIORITY_REPORTS_DIRECTORY);
        this.reportsDirectory = new File(file2, REPORTS_DIRECTORY);
        this.nativeReportsDirectory = new File(file2, NATIVE_REPORTS_DIRECTORY);
        this.settingsDataProvider = settingsDataProvider2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if ((r0 == null) != true) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        if ((r0 != null) != true) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0049, code lost:
        r0 = r0.getIdentifier();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        writeTextFile(new java.io.File(prepareDirectory(getSessionDirectoryById(r0)), REPORT_FILE_NAME), TRANSFORM.reportToJson(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0065, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0066, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Could not persist report for session ".concat(java.lang.String.valueOf(r0)), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void persistReport(@androidx.annotation.NonNull com.google.firebase.crashlytics.internal.model.CrashlyticsReport r5) {
        /*
            r4 = this;
            int r0 = toFloatRange     // Catch:{ Exception -> 0x007b }
            int r0 = r0 + 27
            int r1 = r0 % 128
            IsOverlapping = r1     // Catch:{ Exception -> 0x007b }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001e
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r0 = r5.getSession()
            r3 = 0
            int r3 = r3.length     // Catch:{ all -> 0x001c }
            if (r0 != 0) goto L_0x0018
            r3 = 1
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            if (r3 == r2) goto L_0x0029
            goto L_0x0049
        L_0x001c:
            r5 = move-exception
            throw r5
        L_0x001e:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r0 = r5.getSession()     // Catch:{ Exception -> 0x0079 }
            if (r0 != 0) goto L_0x0026
            r3 = 0
            goto L_0x0027
        L_0x0026:
            r3 = 1
        L_0x0027:
            if (r3 == r2) goto L_0x0049
        L_0x0029:
            com.google.firebase.crashlytics.internal.Logger r5 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r0 = "Could not get session for report"
            r5.d(r0)
            int r5 = IsOverlapping
            int r5 = r5 + 105
            int r0 = r5 % 128
            toFloatRange = r0
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            if (r2 == 0) goto L_0x0048
            r5 = 44
            int r5 = r5 / r1
            return
        L_0x0046:
            r5 = move-exception
            throw r5
        L_0x0048:
            return
        L_0x0049:
            java.lang.String r0 = r0.getIdentifier()
            java.io.File r1 = r4.getSessionDirectoryById(r0)     // Catch:{ IOException -> 0x0066 }
            java.io.File r1 = prepareDirectory(r1)     // Catch:{ IOException -> 0x0066 }
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform r2 = TRANSFORM     // Catch:{ IOException -> 0x0066 }
            java.lang.String r5 = r2.reportToJson(r5)     // Catch:{ IOException -> 0x0066 }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0066 }
            java.lang.String r3 = "report"
            r2.<init>(r1, r3)     // Catch:{ IOException -> 0x0066 }
            writeTextFile(r2, r5)     // Catch:{ IOException -> 0x0066 }
            return
        L_0x0066:
            r5 = move-exception
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Could not persist report for session "
            java.lang.String r0 = r2.concat(r0)
            r1.d(r0, r5)
            return
        L_0x0079:
            r5 = move-exception
            throw r5
        L_0x007b:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.persistReport(com.google.firebase.crashlytics.internal.model.CrashlyticsReport):void");
    }

    public void persistEvent(@NonNull CrashlyticsReport.Session.Event event, @NonNull String str) {
        int i = toFloatRange + 119;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        try {
            persistEvent(event, str, false);
            int i3 = toFloatRange + 125;
            IsOverlapping = i3 % 128;
            if ((i3 % 2 == 0 ? 'c' : '6') == 'c') {
                Object obj = null;
                super.hashCode();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void persistEvent(@NonNull CrashlyticsReport.Session.Event event, @NonNull String str, boolean z) {
        int i = this.settingsDataProvider.getSettings().getSessionData().maxCustomExceptionEvents;
        File sessionDirectoryById = getSessionDirectoryById(str);
        try {
            writeTextFile(new File(sessionDirectoryById, generateEventFilename(this.eventCounter.getAndIncrement(), z)), TRANSFORM.eventToJson(event));
            int i2 = IsOverlapping + 83;
            toFloatRange = i2 % 128;
            int i3 = i2 % 2;
        } catch (IOException e) {
            Logger.getLogger().w("Could not persist event for session ".concat(String.valueOf(str)), e);
        }
        try {
            trimEvents(sessionDirectoryById, i);
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void persistUserIdForSession(@NonNull String str, @NonNull String str2) {
        try {
            writeTextFile(new File(getSessionDirectoryById(str2), "user"), str);
            int i = toFloatRange + 113;
            IsOverlapping = i % 128;
            int i2 = i % 2;
        } catch (IOException e) {
            Logger.getLogger().w("Could not persist user ID for session ".concat(String.valueOf(str2)), e);
        }
    }

    @NonNull
    public List<String> listSortedOpenSessionIds() {
        List<File> allFilesInDirectory = getAllFilesInDirectory(this.openSessionsDirectory);
        Collections.sort(allFilesInDirectory, LATEST_SESSION_ID_FIRST_COMPARATOR);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = allFilesInDirectory.iterator();
        while (true) {
            if (!(!it.hasNext())) {
                int i = toFloatRange + 39;
                IsOverlapping = i % 128;
                int i2 = i % 2;
                try {
                    arrayList.add(it.next().getName());
                } catch (Exception e) {
                    throw e;
                }
            } else {
                int i3 = toFloatRange + 61;
                IsOverlapping = i3 % 128;
                int i4 = i3 % 2;
                return arrayList;
            }
        }
    }

    public boolean hasFinalizedReports() {
        if (!(!getAllFinalizedReportFiles().isEmpty())) {
            int i = IsOverlapping + 25;
            toFloatRange = i % 128;
            int i2 = i % 2;
            return false;
        }
        int i3 = IsOverlapping + 75;
        toFloatRange = i3 % 128;
        return !(i3 % 2 != 0);
    }

    public void deleteAllReports() {
        int i = toFloatRange + 23;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        Iterator<File> it = getAllFinalizedReportFiles().iterator();
        int i3 = IsOverlapping + 121;
        toFloatRange = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            if (!(!it.hasNext())) {
                try {
                    it.next().delete();
                } catch (Exception e) {
                    throw e;
                }
            } else {
                return;
            }
        }
    }

    private static /* synthetic */ boolean lambda$deleteFinalizedReport$2(String str, File file, String str2) {
        int i = toFloatRange + 35;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        try {
            boolean startsWith = str2.startsWith(str);
            int i3 = toFloatRange + 81;
            IsOverlapping = i3 % 128;
            if (i3 % 2 != 0) {
                return startsWith;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return startsWith;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        if ((r7 != null ? 'H' : ',') != 'H') goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        r0 = r7.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r7 != null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void deleteFinalizedReport(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = toFloatRange
            int r0 = r0 + 9
            int r1 = r0 % 128
            IsOverlapping = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 96
            if (r0 != 0) goto L_0x0011
            r0 = 93
            goto L_0x0013
        L_0x0011:
            r0 = 96
        L_0x0013:
            r3 = 0
            if (r0 == r2) goto L_0x001d
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x001b }
            if (r7 == 0) goto L_0x0028
            goto L_0x002a
        L_0x001b:
            r7 = move-exception
            throw r7
        L_0x001d:
            r0 = 72
            if (r7 == 0) goto L_0x0024
            r2 = 72
            goto L_0x0026
        L_0x0024:
            r2 = 44
        L_0x0026:
            if (r2 == r0) goto L_0x002a
        L_0x0028:
            r0 = 0
            goto L_0x002e
        L_0x002a:
            int r0 = r7.length()
        L_0x002e:
            int r2 = o.dispatchOnCancelled.setMax(r0)
            r4 = 1
            if (r0 == r2) goto L_0x0046
            o.onCanceled r5 = new o.onCanceled
            r5.<init>(r0, r2, r4)
            r0 = -564625681(0xffffffffde587eef, float:-3.90004224E18)
            o.onCancelLoad.setMax(r0, r5)     // Catch:{ Exception -> 0x0044 }
            o.onCancelLoad.getMin(r0, r5)     // Catch:{ Exception -> 0x0044 }
            goto L_0x0046
        L_0x0044:
            r7 = move-exception
            throw r7
        L_0x0046:
            o.dispatchApplyWindowInsets r0 = new o.dispatchApplyWindowInsets
            r0.<init>(r7)
            r7 = 3
            java.util.List[] r7 = new java.util.List[r7]
            java.io.File r2 = r6.priorityReportsDirectory
            java.util.List r2 = getFilesInDirectory((java.io.File) r2, (java.io.FilenameFilter) r0)
            r7[r3] = r2
            java.io.File r2 = r6.nativeReportsDirectory
            java.util.List r2 = getFilesInDirectory((java.io.File) r2, (java.io.FilenameFilter) r0)
            r7[r4] = r2
            java.io.File r2 = r6.reportsDirectory
            java.util.List r0 = getFilesInDirectory((java.io.File) r2, (java.io.FilenameFilter) r0)
            r7[r1] = r0
            java.util.List r7 = combineReportFiles(r7)
            java.util.Iterator r7 = r7.iterator()
        L_0x006e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0090
            int r0 = IsOverlapping
            int r0 = r0 + 17
            int r2 = r0 % 128
            toFloatRange = r2
            int r0 = r0 % r1
            java.lang.Object r0 = r7.next()
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            int r0 = toFloatRange
            int r0 = r0 + 87
            int r2 = r0 % 128
            IsOverlapping = r2
            int r0 = r0 % r1
            goto L_0x006e
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.deleteFinalizedReport(java.lang.String):void");
    }

    public void finalizeReports(@Nullable String str, long j) {
        Iterator<File> it;
        int i = toFloatRange + 7;
        IsOverlapping = i % 128;
        if ((i % 2 == 0 ? '@' : '!') != '!') {
            it = capAndGetOpenSessions(str).iterator();
            Object[] objArr = null;
            int length2 = objArr.length;
        } else {
            it = capAndGetOpenSessions(str).iterator();
        }
        while (it.hasNext()) {
            File next = it.next();
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Finalizing report for session ");
            sb.append(next.getName());
            logger.v(sb.toString());
            synthesizeReport(next, j);
            recursiveDelete(next);
        }
        capFinalizedReports();
        int i2 = IsOverlapping + 121;
        toFloatRange = i2 % 128;
        int i3 = i2 % 2;
    }

    public void finalizeSessionWithNativeEvent(@NonNull String str, @NonNull CrashlyticsReport.FilesPayload filesPayload) {
        synthesizeNativeReportFile(new File(getSessionDirectoryById(str), REPORT_FILE_NAME), this.nativeReportsDirectory, filesPayload, str);
        try {
            int i = IsOverlapping + 37;
            toFloatRange = i % 128;
            if (!(i % 2 == 0)) {
                Object[] objArr = null;
                int length2 = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @NonNull
    public List<CrashlyticsReportWithSessionId> loadFinalizedReports() {
        List<File> allFinalizedReportFiles = getAllFinalizedReportFiles();
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.ensureCapacity(allFinalizedReportFiles.size());
            Iterator<File> it = getAllFinalizedReportFiles().iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        return arrayList;
                    }
                    int i = IsOverlapping + 77;
                    toFloatRange = i % 128;
                    int i2 = i % 2;
                    File next = it.next();
                    try {
                        arrayList.add(CrashlyticsReportWithSessionId.create(TRANSFORM.reportFromJson(readTextFile(next)), next.getName()));
                        int i3 = toFloatRange + 57;
                        IsOverlapping = i3 % 128;
                        int i4 = i3 % 2;
                    } catch (IOException e) {
                        Logger logger = Logger.getLogger();
                        StringBuilder sb = new StringBuilder("Could not load report file ");
                        sb.append(next);
                        sb.append("; deleting");
                        logger.w(sb.toString(), e);
                        next.delete();
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    @NonNull
    private List<File> capAndGetOpenSessions(@Nullable String str) {
        try {
            List<File> filesInDirectory = getFilesInDirectory(this.openSessionsDirectory, (FileFilter) new startViewTransition(str));
            Collections.sort(filesInDirectory, LATEST_SESSION_ID_FIRST_COMPARATOR);
            if ((filesInDirectory.size() <= 8 ? '%' : 22) != '%') {
                Iterator<File> it = filesInDirectory.subList(8, filesInDirectory.size()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        return filesInDirectory.subList(0, 8);
                    }
                    int i = toFloatRange + 35;
                    IsOverlapping = i % 128;
                    if (i % 2 == 0) {
                        recursiveDelete(it.next());
                        Object obj = null;
                        super.hashCode();
                    } else {
                        recursiveDelete(it.next());
                    }
                }
            } else {
                int i2 = toFloatRange + 53;
                IsOverlapping = i2 % 128;
                int i3 = i2 % 2;
                return filesInDirectory;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if ((!r3) != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if ((!r4.getName().equals(r3) ? (char) 28 : 18) != 28) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ boolean lambda$capAndGetOpenSessions$3(java.lang.String r3, java.io.File r4) {
        /*
            boolean r0 = r4.isDirectory()
            r1 = 25
            if (r0 == 0) goto L_0x000b
            r0 = 25
            goto L_0x000d
        L_0x000b:
            r0 = 96
        L_0x000d:
            r2 = 0
            if (r0 == r1) goto L_0x0011
            goto L_0x0049
        L_0x0011:
            int r0 = toFloatRange
            int r0 = r0 + 91
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 != 0) goto L_0x0036
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x0034 }
            boolean r3 = r4.equals(r3)     // Catch:{ Exception -> 0x0034 }
            r4 = 0
            super.hashCode()     // Catch:{ all -> 0x0032 }
            if (r3 != 0) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            if (r3 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0032:
            r3 = move-exception
            throw r3
        L_0x0034:
            r3 = move-exception
            throw r3
        L_0x0036:
            java.lang.String r4 = r4.getName()
            boolean r3 = r4.equals(r3)
            r4 = 28
            if (r3 != 0) goto L_0x0045
            r3 = 28
            goto L_0x0047
        L_0x0045:
            r3 = 18
        L_0x0047:
            if (r3 == r4) goto L_0x004a
        L_0x0049:
            return r2
        L_0x004a:
            int r3 = IsOverlapping
            int r3 = r3 + 111
            int r4 = r3 % 128
            toFloatRange = r4
            int r3 = r3 % 2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.lambda$capAndGetOpenSessions$3(java.lang.String, java.io.File):boolean");
    }

    private void capFinalizedReports() {
        int i = this.settingsDataProvider.getSettings().getSessionData().maxCompleteSessionsCount;
        List<File> allFinalizedReportFiles = getAllFinalizedReportFiles();
        int size = allFinalizedReportFiles.size();
        if (size > i) {
            Iterator<File> it = allFinalizedReportFiles.subList(i, size).iterator();
            while (true) {
                if ((it.hasNext() ? '4' : '8') != '4') {
                    int i2 = IsOverlapping + 125;
                    toFloatRange = i2 % 128;
                    int i3 = i2 % 2;
                    return;
                }
                int i4 = IsOverlapping + 39;
                toFloatRange = i4 % 128;
                if ((i4 % 2 != 0 ? 13 : '7') != '7') {
                    try {
                        it.next().delete();
                        Object[] objArr = null;
                        int length2 = objArr.length;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    it.next().delete();
                }
            }
        }
    }

    @NonNull
    private List<File> getAllFinalizedReportFiles() {
        List<File> list;
        int i = toFloatRange + 93;
        IsOverlapping = i % 128;
        if ((i % 2 == 0 ? '5' : 15) != '5') {
            list = sortAndCombineReportFiles(combineReportFiles(getAllFilesInDirectory(this.priorityReportsDirectory), getAllFilesInDirectory(this.nativeReportsDirectory)), getAllFilesInDirectory(this.reportsDirectory));
        } else {
            try {
                List[] listArr = new List[4];
                List[] listArr2 = new List[5];
                listArr2[1] = getAllFilesInDirectory(this.priorityReportsDirectory);
                listArr2[0] = getAllFilesInDirectory(this.nativeReportsDirectory);
                listArr[1] = combineReportFiles(listArr2);
                listArr[1] = getAllFilesInDirectory(this.reportsDirectory);
                list = sortAndCombineReportFiles(listArr);
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = toFloatRange + 41;
        IsOverlapping = i2 % 128;
        int i3 = i2 % 2;
        return list;
    }

    @NonNull
    private File getSessionDirectoryById(@NonNull String str) {
        try {
            File file = new File(this.openSessionsDirectory, str);
            int i = toFloatRange + 67;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            return file;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0077, code lost:
        if (r5 == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008f, code lost:
        if (r5 == false) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void synthesizeReport(@androidx.annotation.NonNull java.io.File r10, long r11) {
        /*
            r9 = this;
            int r0 = toFloatRange
            int r0 = r0 + 87
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            java.io.FilenameFilter r0 = EVENT_FILE_FILTER
            java.util.List r0 = getFilesInDirectory((java.io.File) r10, (java.io.FilenameFilter) r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0035
            com.google.firebase.crashlytics.internal.Logger r11 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Session "
            r12.<init>(r0)
            java.lang.String r10 = r10.getName()
            r12.append(r10)
            java.lang.String r10 = " has no events."
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.v(r10)
            return
        L_0x0035:
            java.util.Collections.sort(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
            int r1 = IsOverlapping
            int r1 = r1 + 3
            int r3 = r1 % 128
            toFloatRange = r3
            int r1 = r1 % 2
            r1 = 0
        L_0x004c:
            r5 = 0
        L_0x004d:
            boolean r3 = r0.hasNext()
            r4 = 1
            r6 = 0
            if (r3 == 0) goto L_0x00bf
            int r3 = toFloatRange
            int r3 = r3 + 49
            int r7 = r3 % 128
            IsOverlapping = r7
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x007c
            java.lang.Object r3 = r0.next()
            java.io.File r3 = (java.io.File) r3
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform r7 = TRANSFORM     // Catch:{ IOException -> 0x00ac }
            java.lang.String r8 = readTextFile(r3)     // Catch:{ IOException -> 0x00ac }
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r7 = r7.eventFromJson(r8)     // Catch:{ IOException -> 0x00ac }
            r2.add(r7)     // Catch:{ IOException -> 0x00ac }
            super.hashCode()     // Catch:{ all -> 0x007a }
            if (r5 != 0) goto L_0x00a0
            goto L_0x0091
        L_0x007a:
            r10 = move-exception
            throw r10
        L_0x007c:
            java.lang.Object r3 = r0.next()
            java.io.File r3 = (java.io.File) r3
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform r6 = TRANSFORM     // Catch:{ IOException -> 0x00ac }
            java.lang.String r7 = readTextFile(r3)     // Catch:{ IOException -> 0x00ac }
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r6 = r6.eventFromJson(r7)     // Catch:{ IOException -> 0x00ac }
            r2.add(r6)     // Catch:{ IOException -> 0x00ac }
            if (r5 != 0) goto L_0x00a0
        L_0x0091:
            java.lang.String r6 = r3.getName()     // Catch:{ IOException -> 0x00ac }
            boolean r3 = isHighPriorityEventFile(r6)     // Catch:{ IOException -> 0x00ac }
            if (r3 == 0) goto L_0x009d
            r3 = 1
            goto L_0x009e
        L_0x009d:
            r3 = 0
        L_0x009e:
            if (r3 == 0) goto L_0x004c
        L_0x00a0:
            int r3 = toFloatRange
            int r3 = r3 + 19
            int r5 = r3 % 128
            IsOverlapping = r5
            int r3 = r3 % 2
            r5 = 1
            goto L_0x004d
        L_0x00ac:
            r4 = move-exception
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r7 = "Could not add event to report for "
            java.lang.String r3 = r7.concat(r3)
            r6.w(r3, r4)
            goto L_0x004d
        L_0x00bf:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00f8
            com.google.firebase.crashlytics.internal.Logger r11 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch:{ Exception -> 0x00f6 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not parse event files for session "
            r12.<init>(r0)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r10 = r10.getName()     // Catch:{ Exception -> 0x00f4 }
            r12.append(r10)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r10 = r12.toString()     // Catch:{ Exception -> 0x00f4 }
            r11.w(r10)     // Catch:{ Exception -> 0x00f4 }
            int r10 = IsOverlapping
            int r10 = r10 + 39
            int r11 = r10 % 128
            toFloatRange = r11
            int r10 = r10 % 2
            if (r10 == 0) goto L_0x00eb
            r1 = 1
        L_0x00eb:
            if (r1 == 0) goto L_0x00f3
            super.hashCode()     // Catch:{ all -> 0x00f1 }
            return
        L_0x00f1:
            r10 = move-exception
            throw r10
        L_0x00f3:
            return
        L_0x00f4:
            r10 = move-exception
            throw r10
        L_0x00f6:
            r10 = move-exception
            throw r10
        L_0x00f8:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "user"
            r0.<init>(r10, r1)
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L_0x0130
            int r1 = toFloatRange
            int r1 = r1 + 57
            int r3 = r1 % 128
            IsOverlapping = r3
            int r1 = r1 % 2
            java.lang.String r0 = readTextFile(r0)     // Catch:{ IOException -> 0x0116 }
            r6 = r0
            goto L_0x0130
        L_0x0116:
            r0 = move-exception
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Could not read user ID file in "
            r3.<init>(r4)
            java.lang.String r4 = r10.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.w(r3, r0)
        L_0x0130:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "report"
            r0.<init>(r10, r1)
            if (r5 == 0) goto L_0x0146
            java.io.File r10 = r9.priorityReportsDirectory
            int r1 = IsOverlapping
            int r1 = r1 + 51
            int r3 = r1 % 128
            toFloatRange = r3
            int r1 = r1 % 2
            goto L_0x0148
        L_0x0146:
            java.io.File r10 = r9.reportsDirectory
        L_0x0148:
            r1 = r10
            r3 = r11
            synthesizeReportFile(r0, r1, r2, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.synthesizeReport(java.io.File, long):void");
    }

    private static void synthesizeNativeReportFile(@NonNull File file, @NonNull File file2, @NonNull CrashlyticsReport.FilesPayload filesPayload, @NonNull String str) {
        try {
            writeTextFile(new File(prepareDirectory(file2), str), TRANSFORM.reportToJson(TRANSFORM.reportFromJson(readTextFile(file)).withNdkPayload(filesPayload)));
            try {
                int i = toFloatRange + 125;
                IsOverlapping = i % 128;
                if (!(i % 2 != 0)) {
                    Object obj = null;
                    super.hashCode();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (IOException e2) {
            Logger.getLogger().w("Could not synthesize final native report file for ".concat(String.valueOf(file)), e2);
        }
    }

    private static void synthesizeReportFile(@NonNull File file, @NonNull File file2, @NonNull List<CrashlyticsReport.Session.Event> list, long j, boolean z, @Nullable String str) {
        int i = IsOverlapping + 1;
        toFloatRange = i % 128;
        int i2 = i % 2;
        try {
            CrashlyticsReport withEvents = TRANSFORM.reportFromJson(readTextFile(file)).withSessionEndFields(j, z, str).withEvents(ImmutableList.from(list));
            CrashlyticsReport.Session session = withEvents.getSession();
            if (session == null) {
                int i3 = IsOverlapping + 69;
                toFloatRange = i3 % 128;
                if ((i3 % 2 != 0 ? 'L' : 23) != 23) {
                    Object[] objArr = null;
                    int length2 = objArr.length;
                    return;
                }
                return;
            }
            writeTextFile(new File(prepareDirectory(file2), session.getIdentifier()), TRANSFORM.reportToJson(withEvents));
        } catch (IOException e) {
            Logger.getLogger().w("Could not synthesize final report file for ".concat(String.valueOf(file)), e);
        }
    }

    @NonNull
    private static List<File> sortAndCombineReportFiles(@NonNull List<File>... listArr) {
        int length2 = listArr.length;
        int i = IsOverlapping + 77;
        toFloatRange = i % 128;
        int i2 = i % 2;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                return combineReportFiles(listArr);
            }
            try {
                try {
                    Collections.sort(listArr[i3], LATEST_SESSION_ID_FIRST_COMPARATOR);
                    i3++;
                    int i4 = toFloatRange + 69;
                    IsOverlapping = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    @NonNull
    private static List<File> combineReportFiles(@NonNull List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int length2 = listArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            int i4 = toFloatRange + 77;
            IsOverlapping = i4 % 128;
            if ((i4 % 2 == 0 ? Typography.dollar : 'P') != '$') {
                i3 += listArr[i2].size();
                i2++;
            } else {
                i3 /= listArr[i2].size();
                i2 += 5;
            }
        }
        arrayList.ensureCapacity(i3);
        int length3 = listArr.length;
        while (true) {
            if ((i < length3 ? 14 : '1') == '1') {
                return arrayList;
            }
            int i5 = IsOverlapping + 75;
            toFloatRange = i5 % 128;
            int i6 = i5 % 2;
            arrayList.addAll(listArr[i]);
            i++;
            int i7 = toFloatRange + 29;
            IsOverlapping = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private static boolean isHighPriorityEventFile(@NonNull String str) {
        try {
            int i = IsOverlapping + 61;
            toFloatRange = i % 128;
            int i2 = i % 2;
            if (!(!str.startsWith("event"))) {
                if ((str.endsWith("_") ? '\\' : 9) != 9) {
                    int i3 = IsOverlapping + 81;
                    toFloatRange = i3 % 128;
                    int i4 = i3 % 2;
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if ((r5.startsWith("event")) != true) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        if ((!r4) != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isNormalPriorityEventFile(@androidx.annotation.NonNull java.io.File r4, @androidx.annotation.NonNull java.lang.String r5) {
        /*
            int r4 = IsOverlapping
            int r4 = r4 + 75
            int r0 = r4 % 128
            toFloatRange = r0
            int r4 = r4 % 2
            r0 = 99
            if (r4 == 0) goto L_0x0011
            r4 = 99
            goto L_0x0013
        L_0x0011:
            r4 = 50
        L_0x0013:
            java.lang.String r1 = "event"
            r2 = 0
            r3 = 1
            if (r4 == r0) goto L_0x0027
            boolean r4 = r5.startsWith(r1)     // Catch:{ Exception -> 0x0025 }
            if (r4 == 0) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            if (r4 == r3) goto L_0x0035
            goto L_0x003e
        L_0x0025:
            r4 = move-exception
            throw r4
        L_0x0027:
            boolean r4 = r5.startsWith(r1)
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x0049 }
            if (r4 == 0) goto L_0x0031
            r4 = 0
            goto L_0x0032
        L_0x0031:
            r4 = 1
        L_0x0032:
            if (r4 == 0) goto L_0x0035
            goto L_0x003e
        L_0x0035:
            java.lang.String r4 = "_"
            boolean r4 = r5.endsWith(r4)
            if (r4 != 0) goto L_0x003e
            return r3
        L_0x003e:
            int r4 = IsOverlapping
            int r4 = r4 + 39
            int r5 = r4 % 128
            toFloatRange = r5
            int r4 = r4 % 2
            return r2
        L_0x0049:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.isNormalPriorityEventFile(java.io.File, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        r5 = IsOverlapping + 29;
        toFloatRange = r5 % 128;
        r5 = r5 % 2;
        r5 = "_";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r5 != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if ((r5 ? '1' : '3') != '1') goto L_0x003a;
     */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String generateEventFilename(int r4, boolean r5) {
        /*
            int r0 = IsOverlapping
            int r0 = r0 + 27
            int r1 = r0 % 128
            toFloatRange = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            java.lang.String r3 = "%010d"
            if (r0 == 0) goto L_0x0021
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r1] = r4
            java.lang.String r4 = java.lang.String.format(r0, r3, r2)
            if (r5 == 0) goto L_0x003a
            goto L_0x003d
        L_0x0021:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r1] = r4
            java.lang.String r4 = java.lang.String.format(r0, r3, r2)
            r0 = 49
            if (r5 == 0) goto L_0x0036
            r5 = 49
            goto L_0x0038
        L_0x0036:
            r5 = 51
        L_0x0038:
            if (r5 == r0) goto L_0x003d
        L_0x003a:
            java.lang.String r5 = ""
            goto L_0x0049
        L_0x003d:
            int r5 = IsOverlapping
            int r5 = r5 + 29
            int r0 = r5 % 128
            toFloatRange = r0
            int r5 = r5 % 2
            java.lang.String r5 = "_"
        L_0x0049:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "event"
            r0.<init>(r1)
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.generateEventFilename(int, boolean):java.lang.String");
    }

    private static int trimEvents(@NonNull File file, int i) {
        int i2 = toFloatRange + 37;
        IsOverlapping = i2 % 128;
        if ((i2 % 2 == 0 ? '\\' : 'F') != '\\') {
            List<File> filesInDirectory = getFilesInDirectory(file, (FilenameFilter) FragmentContainerView.getMin);
            Collections.sort(filesInDirectory, removeViewInLayout.setMin);
            return capFilesCount(filesInDirectory, i);
        }
        List<File> filesInDirectory2 = getFilesInDirectory(file, (FilenameFilter) FragmentContainerView.getMin);
        Collections.sort(filesInDirectory2, removeViewInLayout.setMin);
        int capFilesCount = capFilesCount(filesInDirectory2, i);
        int i3 = 32 / 0;
        return capFilesCount;
    }

    @NonNull
    private static String getEventNameWithoutPriority(@NonNull String str) {
        String str2;
        int i = IsOverlapping + 19;
        toFloatRange = i % 128;
        if (i % 2 == 0) {
            try {
                str2 = str.substring(0, EVENT_NAME_LENGTH);
            } catch (Exception e) {
                throw e;
            }
        } else {
            str2 = str.substring(1, EVENT_NAME_LENGTH);
        }
        try {
            int i2 = toFloatRange + 91;
            IsOverlapping = i2 % 128;
            if ((i2 % 2 == 0 ? (char) 29 : 2) == 2) {
                return str2;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return str2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static int oldestEventFileFirst(@NonNull File file, @NonNull File file2) {
        int i = IsOverlapping + 103;
        toFloatRange = i % 128;
        int i2 = i % 2;
        int compareTo = getEventNameWithoutPriority(file.getName()).compareTo(getEventNameWithoutPriority(file2.getName()));
        int i3 = IsOverlapping + 31;
        toFloatRange = i3 % 128;
        int i4 = i3 % 2;
        return compareTo;
    }

    @NonNull
    private static List<File> getAllFilesInDirectory(@NonNull File file) {
        int i = IsOverlapping + 99;
        toFloatRange = i % 128;
        int i2 = i % 2;
        FileFilter fileFilter = null;
        List<File> filesInDirectory = getFilesInDirectory(file, fileFilter);
        try {
            int i3 = IsOverlapping + 49;
            toFloatRange = i3 % 128;
            if (i3 % 2 == 0) {
                return filesInDirectory;
            }
            super.hashCode();
            return filesInDirectory;
        } catch (Exception e) {
            throw e;
        }
    }

    @NonNull
    private static List<File> getFilesInDirectory(@NonNull File file, @Nullable FilenameFilter filenameFilter) {
        File[] fileArr;
        if (!file.isDirectory()) {
            List<File> emptyList = Collections.emptyList();
            int i = toFloatRange + 95;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            return emptyList;
        }
        if (!(filenameFilter != null)) {
            int i3 = IsOverlapping + 101;
            toFloatRange = i3 % 128;
            int i4 = i3 % 2;
            fileArr = file.listFiles();
        } else {
            fileArr = file.listFiles(filenameFilter);
        }
        if ((fileArr != null ? '3' : 'U') != '3') {
            return Collections.emptyList();
        }
        int i5 = IsOverlapping + 33;
        toFloatRange = i5 % 128;
        int i6 = i5 % 2;
        try {
            return Arrays.asList(fileArr);
        } catch (Exception e) {
            throw e;
        }
    }

    @NonNull
    private static List<File> getFilesInDirectory(@NonNull File file, @Nullable FileFilter fileFilter) {
        File[] fileArr;
        try {
            int i = toFloatRange + 7;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            if ((!file.isDirectory() ? ':' : 'Q') == ':') {
                return Collections.emptyList();
            }
            if (!(fileFilter != null)) {
                fileArr = file.listFiles();
            } else {
                try {
                    fileArr = file.listFiles(fileFilter);
                } catch (Exception e) {
                    throw e;
                }
            }
            if ((fileArr != null ? 'X' : 24) != 'X') {
                return Collections.emptyList();
            }
            int i3 = IsOverlapping + 121;
            toFloatRange = i3 % 128;
            int i4 = i3 % 2;
            return Arrays.asList(fileArr);
        } catch (Exception e2) {
            throw e2;
        }
    }

    @NonNull
    private static File prepareDirectory(@NonNull File file) throws IOException {
        try {
            int i = toFloatRange + 79;
            try {
                IsOverlapping = i % 128;
                int i2 = i % 2;
                if (makeDirectory(file)) {
                    int i3 = toFloatRange + 83;
                    IsOverlapping = i3 % 128;
                    int i4 = i3 % 2;
                    return file;
                }
                throw new IOException("Could not create directory ".concat(String.valueOf(file)));
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        if ((!r5.exists() ? ',' : 'b') != 'b') goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if ((!r0) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean makeDirectory(@androidx.annotation.NonNull java.io.File r5) {
        /*
            int r0 = IsOverlapping
            int r0 = r0 + 37
            int r1 = r0 % 128
            toFloatRange = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0020
            boolean r0 = r5.exists()     // Catch:{ Exception -> 0x0053 }
            super.hashCode()     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x0037
            goto L_0x002f
        L_0x001e:
            r5 = move-exception
            throw r5
        L_0x0020:
            boolean r0 = r5.exists()     // Catch:{ Exception -> 0x0053 }
            r4 = 98
            if (r0 != 0) goto L_0x002b
            r0 = 44
            goto L_0x002d
        L_0x002b:
            r0 = 98
        L_0x002d:
            if (r0 == r4) goto L_0x0037
        L_0x002f:
            boolean r5 = r5.mkdirs()
            if (r5 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            return r2
        L_0x0037:
            int r5 = IsOverlapping     // Catch:{ Exception -> 0x0051 }
            int r5 = r5 + 39
            int r0 = r5 % 128
            toFloatRange = r0     // Catch:{ Exception -> 0x0051 }
            int r5 = r5 % 2
            r0 = 86
            if (r5 == 0) goto L_0x0048
            r5 = 40
            goto L_0x004a
        L_0x0048:
            r5 = 86
        L_0x004a:
            if (r5 == r0) goto L_0x0050
            int r5 = r3.length     // Catch:{ all -> 0x004e }
            return r1
        L_0x004e:
            r5 = move-exception
            throw r5
        L_0x0050:
            return r1
        L_0x0051:
            r5 = move-exception
            throw r5
        L_0x0053:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.makeDirectory(java.io.File):boolean");
    }

    private static void writeTextFile(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), UTF_8);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            int i = toFloatRange + 117;
            IsOverlapping = i % 128;
            if (i % 2 == 0) {
                int i2 = 94 / 0;
                return;
            }
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @NonNull
    private static String readTextFile(@NonNull File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if ((read > 0 ? ']' : 'Q') != 'Q') {
                    int i = toFloatRange + 53;
                    IsOverlapping = i % 128;
                    int i2 = i % 2;
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), UTF_8);
                    fileInputStream.close();
                    try {
                        int i3 = toFloatRange + 51;
                        IsOverlapping = i3 % 128;
                        int i4 = i3 % 2;
                        return str;
                    } catch (Exception e) {
                        throw e;
                    }
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    private static int capFilesCount(List<File> list, int i) {
        int i2 = IsOverlapping + 53;
        toFloatRange = i2 % 128;
        int i3 = i2 % 2;
        int size = list.size();
        Iterator<File> it = list.iterator();
        while (true) {
            if ((it.hasNext() ? 'A' : 'C') != 'A') {
                return size;
            }
            try {
                File next = it.next();
                if ((size <= i ? JSONLexer.EOI : 16) != 26) {
                    recursiveDelete(next);
                    size--;
                } else {
                    int i4 = IsOverlapping + 113;
                    toFloatRange = i4 % 128;
                    int i5 = i4 % 2;
                    return size;
                }
            } catch (Exception e) {
                throw e;
            }
        }
    }

    private static void recursiveDelete(@Nullable File file) {
        int i = toFloatRange + 121;
        IsOverlapping = i % 128;
        if ((i % 2 == 0 ? Typography.amp : '9') != '9') {
            Object obj = null;
            super.hashCode();
            if (file == null) {
                return;
            }
        } else if (file == null) {
            return;
        }
        if (file.isDirectory()) {
            int i2 = toFloatRange + 109;
            IsOverlapping = i2 % 128;
            int i3 = i2 % 2;
            try {
                File[] listFiles = file.listFiles();
                int length2 = listFiles.length;
                int i4 = 0;
                while (true) {
                    if (!(i4 < length2)) {
                        break;
                    }
                    recursiveDelete(listFiles[i4]);
                    i4++;
                    int i5 = toFloatRange + 83;
                    IsOverlapping = i5 % 128;
                    int i6 = i5 % 2;
                }
            } catch (Exception e) {
                throw e;
            }
        }
        file.delete();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008a, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009a, code lost:
        if ((setMax != null ? 'R' : ' ') != 'R') goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a5, code lost:
        r2 = r8 - 1;
        r8 = (byte) (setMax[r8] + r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(int r6, byte r7, int r8, int r9, short r10) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = getMin     // Catch:{ Exception -> 0x00be }
            int r6 = r6 + r1
            r1 = 0
            r2 = -1
            r3 = 1
            if (r6 != r2) goto L_0x000f
            r2 = 1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            if (r2 == r3) goto L_0x0014
            r2 = 0
            goto L_0x0015
        L_0x0014:
            r2 = 1
        L_0x0015:
            if (r2 == 0) goto L_0x004e
            byte[] r6 = setMax     // Catch:{ Exception -> 0x004b }
            if (r6 == 0) goto L_0x003f
            int r6 = toFloatRange
            int r6 = r6 + 125
            int r4 = r6 % 128
            IsOverlapping = r4
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x0034
            byte[] r6 = setMax
            int r4 = setMin
            int r4 = r8 % r4
            byte r6 = r6[r4]
            int r4 = getMin
            int r6 = r6 % r4
        L_0x0032:
            byte r6 = (byte) r6
            goto L_0x004e
        L_0x0034:
            byte[] r6 = setMax     // Catch:{ Exception -> 0x00be }
            int r4 = setMin     // Catch:{ Exception -> 0x00be }
            int r4 = r4 + r8
            byte r6 = r6[r4]     // Catch:{ Exception -> 0x00be }
            int r4 = getMin     // Catch:{ Exception -> 0x00be }
            int r6 = r6 + r4
            goto L_0x0032
        L_0x003f:
            short[] r6 = getMax
            int r4 = setMin
            int r4 = r4 + r8
            short r6 = r6[r4]
            int r4 = getMin
            int r6 = r6 + r4
            short r6 = (short) r6
            goto L_0x004e
        L_0x004b:
            r6 = move-exception
            goto L_0x00bd
        L_0x004e:
            r4 = 15
            if (r6 <= 0) goto L_0x0055
            r5 = 15
            goto L_0x0057
        L_0x0055:
            r5 = 69
        L_0x0057:
            if (r5 == r4) goto L_0x005a
            goto L_0x00b8
        L_0x005a:
            int r8 = r8 + r6
            int r8 = r8 + -2
            int r4 = setMin     // Catch:{ Exception -> 0x004b }
            int r8 = r8 + r4
            if (r2 == 0) goto L_0x0064
            r1 = 1
            goto L_0x006e
        L_0x0064:
            int r2 = IsOverlapping
            int r2 = r2 + 17
            int r4 = r2 % 128
            toFloatRange = r4
            int r2 = r2 % 2
        L_0x006e:
            int r8 = r8 + r1
            int r1 = length
            int r9 = r9 + r1
            char r9 = (char) r9
            r0.append(r9)
        L_0x0076:
            if (r3 >= r6) goto L_0x00b8
            int r1 = toFloatRange
            int r1 = r1 + 33
            int r2 = r1 % 128
            IsOverlapping = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x008f
            byte[] r1 = setMax
            r2 = 0
            super.hashCode()     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x009c
            goto L_0x00a5
        L_0x008d:
            r6 = move-exception
            throw r6
        L_0x008f:
            byte[] r1 = setMax
            r2 = 82
            if (r1 == 0) goto L_0x0098
            r1 = 82
            goto L_0x009a
        L_0x0098:
            r1 = 32
        L_0x009a:
            if (r1 == r2) goto L_0x00a5
        L_0x009c:
            short[] r1 = getMax     // Catch:{ Exception -> 0x004b }
            int r2 = r8 + -1
            short r8 = r1[r8]
            int r8 = r8 + r10
            short r8 = (short) r8
            goto L_0x00ad
        L_0x00a5:
            byte[] r1 = setMax
            int r2 = r8 + -1
            byte r8 = r1[r8]
            int r8 = r8 + r10
            byte r8 = (byte) r8
        L_0x00ad:
            r8 = r8 ^ r7
            int r9 = r9 + r8
            char r8 = (char) r9
            r9 = r8
            r8 = r2
            r0.append(r9)
            int r3 = r3 + 1
            goto L_0x0076
        L_0x00b8:
            java.lang.String r6 = r0.toString()
            return r6
        L_0x00bd:
            throw r6
        L_0x00be:
            r6 = move-exception
            goto L_0x00c1
        L_0x00c0:
            throw r6
        L_0x00c1:
            goto L_0x00c0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.setMax(int, byte, int, int, short):java.lang.String");
    }
}
