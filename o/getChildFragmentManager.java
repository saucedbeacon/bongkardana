package o;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

public final class getChildFragmentManager implements Runnable {
    private final JobInfoSchedulerService setMax;
    private final JobParameters setMin;

    public getChildFragmentManager(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.setMax = jobInfoSchedulerService;
        this.setMin = jobParameters;
    }

    public final void run() {
        this.setMax.lambda$onStartJob$0(this.setMin);
    }
}
