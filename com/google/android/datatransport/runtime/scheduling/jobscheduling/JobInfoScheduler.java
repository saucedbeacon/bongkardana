package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Color;
import android.os.PersistableBundle;
import android.util.Base64;
import android.view.ViewConfiguration;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;
import o.OnLifecycleEvent;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@RequiresApi(api = 21)
public class JobInfoScheduler implements WorkScheduler {
    static final String ATTEMPT_NUMBER = "attemptNumber";
    static final String BACKEND_NAME = "backendName";
    static final String EVENT_PRIORITY = "priority";
    static final String EXTRAS = "extras";
    private static final String LOG_TAG = "JobInfoScheduler";
    private static int getMax = 0;
    private static long getMin = 0;
    private static char length = 'ᯝ';
    private static int setMax = 0;
    private static int setMin = 1;
    private final SchedulerConfig config;
    private final Context context;
    private final EventStore eventStore;

    public JobInfoScheduler(Context context2, EventStore eventStore2, SchedulerConfig schedulerConfig) {
        this.context = context2;
        this.eventStore = eventStore2;
        this.config = schedulerConfig;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public int getJobId(TransportContext transportContext) {
        Adler32 adler32 = new Adler32();
        char c = 0;
        adler32.update(this.context.getPackageName().getBytes(Charset.forName(length(new char[]{12447, 47279, 14287, 20049}, (ViewConfiguration.getJumpTapTimeout() >> 16) - 809980112, new char[]{54953, 60054, 64948, 10714, 59338}, new char[]{0, 0, 0, 0}, (char) (20791 - Color.argb(0, 0, 0, 0))).intern())));
        adler32.update(transportContext.getBackendName().getBytes(Charset.forName(length(new char[]{12447, 47279, 14287, 20049}, (ViewConfiguration.getJumpTapTimeout() >> 16) - 809980112, new char[]{54953, 60054, 64948, 10714, 59338}, new char[]{0, 0, 0, 0}, (char) (-16756425 - Color.rgb(0, 0, 0))).intern())));
        adler32.update(ByteBuffer.allocate(4).putInt(PriorityMapping.toInt(transportContext.getPriority())).array());
        if ((transportContext.getExtras() != null ? 'Q' : 'P') == 'Q') {
            int i = setMin + 3;
            setMax = i % 128;
            if (i % 2 != 0) {
                c = 'U';
            }
            if (c != 'U') {
                adler32.update(transportContext.getExtras());
            } else {
                adler32.update(transportContext.getExtras());
                Object obj = null;
                super.hashCode();
            }
        }
        int value = (int) adler32.getValue();
        int i2 = setMax + 5;
        setMin = i2 % 128;
        int i3 = i2 % 2;
        return value;
    }

    private boolean isJobServiceOn(JobScheduler jobScheduler, int i, int i2) {
        JobInfo next;
        int i3;
        try {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                try {
                    onCancelLoad.setMax(-175467070, oncanceled);
                    onCancelLoad.getMin(-175467070, oncanceled);
                } catch (Exception e) {
                    throw e;
                }
            }
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            do {
                if (!it.hasNext()) {
                    return false;
                }
                next = it.next();
                i3 = next.getExtras().getInt(ATTEMPT_NUMBER);
            } while (next.getId() != i);
            int i4 = setMin + 21;
            setMax = i4 % 128;
            int i5 = i4 % 2;
            if (i3 < i2) {
                return false;
            }
            int i6 = setMax + 7;
            setMin = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void schedule(TransportContext transportContext, int i) {
        int i2 = setMin + 9;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        try {
            schedule(transportContext, i, false);
            int i4 = setMax + 89;
            setMin = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public void schedule(TransportContext transportContext, int i, boolean z) {
        TransportContext transportContext2 = transportContext;
        int i2 = i;
        ComponentName componentName = new ComponentName(this.context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.context.getSystemService("jobscheduler");
        int jobId = getJobId(transportContext);
        if ((!z ? '/' : ']') != ']') {
            int i3 = setMin + 103;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            if (isJobServiceOn(jobScheduler, jobId, i2)) {
                int i5 = setMax + 21;
                setMin = i5 % 128;
                int i6 = i5 % 2;
                Logging.d(LOG_TAG, "Upload for context %s is already scheduled. Returning...", (Object) transportContext2);
                return;
            }
        }
        long nextCallTime = this.eventStore.getNextCallTime(transportContext2);
        long j = nextCallTime;
        JobInfo.Builder configureJob = this.config.configureJob(new JobInfo.Builder(jobId, componentName), transportContext.getPriority(), nextCallTime, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt(ATTEMPT_NUMBER, i2);
        persistableBundle.putString(BACKEND_NAME, transportContext.getBackendName());
        persistableBundle.putInt(EVENT_PRIORITY, PriorityMapping.toInt(transportContext.getPriority()));
        if (transportContext.getExtras() != null) {
            int i7 = setMin + 69;
            setMax = i7 % 128;
            persistableBundle.putString(EXTRAS, (i7 % 2 != 0 ? 'a' : 'A') != 'a' ? Base64.encodeToString(transportContext.getExtras(), 0) : Base64.encodeToString(transportContext.getExtras(), 1));
        }
        configureJob.setExtras(persistableBundle);
        long j2 = j;
        Logging.d(LOG_TAG, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", transportContext2, Integer.valueOf(jobId), Long.valueOf(this.config.getScheduleDelay(transportContext.getPriority(), j2, i2)), Long.valueOf(j2), Integer.valueOf(i));
        jobScheduler.schedule(configureJob.build());
        try {
            int i8 = setMax + 101;
            try {
                setMin = i8 % 128;
                if (i8 % 2 == 0) {
                    Object[] objArr = null;
                    try {
                        int length2 = objArr.length;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String length(char[] cArr, int i, char[] cArr2, char[] cArr3, char c) {
        try {
            int i2 = setMax + 81;
            setMin = i2 % 128;
            int i3 = i2 % 2;
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr3.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length2 = cArr2.length;
            char[] cArr6 = new char[length2];
            int i4 = 0;
            while (true) {
                if (!(i4 < length2)) {
                    return new String(cArr6);
                }
                OnLifecycleEvent.length(cArr4, cArr5, i4);
                cArr6[i4] = (char) ((int) (((((long) (cArr2[i4] ^ cArr4[(i4 + 3) % 4])) ^ getMin) ^ ((long) getMax)) ^ ((long) length)));
                i4++;
                try {
                    int i5 = setMax + 61;
                    setMin = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Exception e) {
                    throw e;
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
