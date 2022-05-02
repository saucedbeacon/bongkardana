package o;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class setCheckMarkDrawable implements getAutoSizeMaxTextSize {
    private static final String setMax = setSupportBackgroundTintList.length("SystemJobScheduler");
    private final getSupportButtonTintMode getMax;
    private final setSupportCompoundDrawablesTintList getMin;
    private final Context length;
    private final JobScheduler setMin;

    public boolean getMax() {
        return true;
    }

    public setCheckMarkDrawable(@NonNull Context context, @NonNull setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist) {
        this(context, setsupportcompounddrawablestintlist, (JobScheduler) context.getSystemService("jobscheduler"), new getSupportButtonTintMode(context));
    }

    @VisibleForTesting
    public setCheckMarkDrawable(Context context, setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist, JobScheduler jobScheduler, getSupportButtonTintMode getsupportbuttontintmode) {
        this.length = context;
        this.getMin = setsupportcompounddrawablestintlist;
        this.setMin = jobScheduler;
        this.getMax = getsupportbuttontintmode;
    }

    public void getMin(@NonNull getInternalPopup... getinternalpopupArr) {
        List<Integer> max;
        int i;
        WorkDatabase workDatabase = this.getMin.setMax;
        consumeTextFutureAndSetBlocking consumetextfutureandsetblocking = new consumeTextFutureAndSetBlocking(workDatabase);
        int length2 = getinternalpopupArr.length;
        int i2 = 0;
        while (i2 < length2) {
            getInternalPopup getinternalpopup = getinternalpopupArr[i2];
            workDatabase.beginTransaction();
            try {
                getInternalPopup length3 = workDatabase.getMax().length(getinternalpopup.getMax);
                if (length3 == null) {
                    setSupportBackgroundTintList.getMax();
                    workDatabase.setTransactionSuccessful();
                } else if (length3.getMin != WorkInfo.State.ENQUEUED) {
                    setSupportBackgroundTintList.getMax();
                    workDatabase.setTransactionSuccessful();
                } else {
                    getDropDownVerticalOffset min = workDatabase.getMin().setMin(getinternalpopup.getMax);
                    int min2 = min != null ? min.getMax : consumetextfutureandsetblocking.getMin(this.getMin.getMax.equals, this.getMin.getMax.toFloatRange);
                    if (min == null) {
                        this.getMin.setMax.getMin().getMax(new getDropDownVerticalOffset(getinternalpopup.getMax, min2));
                    }
                    getMin(getinternalpopup, min2);
                    if (Build.VERSION.SDK_INT == 23 && (max = setMax(this.length, this.setMin, getinternalpopup.getMax)) != null) {
                        int indexOf = max.indexOf(Integer.valueOf(min2));
                        if (indexOf >= 0) {
                            max.remove(indexOf);
                        }
                        if (!max.isEmpty()) {
                            i = max.get(0).intValue();
                        } else {
                            i = consumetextfutureandsetblocking.getMin(this.getMin.getMax.equals, this.getMin.getMax.toFloatRange);
                        }
                        getMin(getinternalpopup, i);
                    }
                    workDatabase.setTransactionSuccessful();
                }
                i2++;
            } finally {
                workDatabase.endTransaction();
            }
        }
    }

    @VisibleForTesting
    public void getMin(getInternalPopup getinternalpopup, int i) {
        int i2;
        JobInfo min = this.getMax.setMin(getinternalpopup, i);
        setSupportBackgroundTintList.getMax();
        String str = getinternalpopup.getMax;
        Integer.valueOf(i);
        try {
            this.setMin.schedule(min);
        } catch (IllegalStateException e) {
            List<JobInfo> max = getMax(this.length, this.setMin);
            int size = max != null ? max.size() : 0;
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(size);
            objArr[1] = Integer.valueOf(this.getMin.setMax.getMax().getMax().size());
            onAttachedToWindow onattachedtowindow = this.getMin.getMax;
            if (Build.VERSION.SDK_INT == 23) {
                i2 = onattachedtowindow.FastBitmap$CoordinateSystem / 2;
            } else {
                i2 = onattachedtowindow.FastBitmap$CoordinateSystem;
            }
            objArr[2] = Integer.valueOf(i2);
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr);
            setSupportBackgroundTintList.getMax();
            throw new IllegalStateException(format, e);
        } catch (Throwable unused) {
            setSupportBackgroundTintList.getMax();
        }
    }

    public void setMax(@NonNull String str) {
        List<Integer> max = setMax(this.length, this.setMin, str);
        if (max != null && !max.isEmpty()) {
            for (Integer intValue : max) {
                setMin(this.setMin, intValue.intValue());
            }
            this.getMin.setMax.getMin().setMax(str);
        }
    }

    private static void setMin(@NonNull JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable unused) {
            setSupportBackgroundTintList.getMax();
            Locale.getDefault();
            Integer.valueOf(i);
        }
    }

    public static void setMax(@NonNull Context context) {
        List<JobInfo> max;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (max = getMax(context, jobScheduler)) != null && !max.isEmpty()) {
            for (JobInfo id2 : max) {
                setMin(jobScheduler, id2.getId());
            }
        }
    }

    public static boolean getMax(@NonNull Context context, @NonNull setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> max = getMax(context, jobScheduler);
        List<String> min = setsupportcompounddrawablestintlist.setMax.getMin().getMin();
        boolean z = false;
        HashSet hashSet = new HashSet(max != null ? max.size() : 0);
        if (max != null && !max.isEmpty()) {
            for (JobInfo next : max) {
                String min2 = getMin(next);
                if (!TextUtils.isEmpty(min2)) {
                    hashSet.add(min2);
                } else {
                    setMin(jobScheduler, next.getId());
                }
            }
        }
        Iterator<String> it = min.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    setSupportBackgroundTintList.getMax();
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            WorkDatabase workDatabase = setsupportcompounddrawablestintlist.setMax;
            workDatabase.beginTransaction();
            try {
                compatMeasureContentWidth max2 = workDatabase.getMax();
                for (String min3 : min) {
                    max2.getMin(min3, -1);
                }
                workDatabase.setTransactionSuccessful();
            } finally {
                workDatabase.endTransaction();
            }
        }
        return z;
    }

    @Nullable
    private static List<JobInfo> getMax(@NonNull Context context, @NonNull JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable unused) {
            setSupportBackgroundTintList.getMax();
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @Nullable
    private static List<Integer> setMax(@NonNull Context context, @NonNull JobScheduler jobScheduler, @NonNull String str) {
        List<JobInfo> max = getMax(context, jobScheduler);
        if (max == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo next : max) {
            if (str.equals(getMin(next))) {
                arrayList.add(Integer.valueOf(next.getId()));
            }
        }
        return arrayList;
    }

    @Nullable
    private static String getMin(@NonNull JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }
}
