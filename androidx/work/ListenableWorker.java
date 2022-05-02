package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import o.ActivityChooserView;
import o.AppCompatButton;
import o.getMinWidthMinor;
import o.setAutoSizeTextTypeUniformWithConfiguration;
import o.updateAppearance;

public abstract class ListenableWorker {
    @NonNull
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    @NonNull
    private WorkerParameters mWorkerParams;

    public void onStopped() {
    }

    @MainThread
    @NonNull
    public abstract ListenableFuture<setMax> startWork();

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.mAppContext = context;
            this.mWorkerParams = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.setMin;
    }

    @NonNull
    public final updateAppearance getInputData() {
        return this.mWorkerParams.setMax;
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.getMin;
    }

    @RequiresApi(24)
    @NonNull
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.getMax.setMax;
    }

    @RequiresApi(24)
    @NonNull
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.getMax.setMin;
    }

    @RequiresApi(28)
    @Nullable
    public final Network getNetwork() {
        return this.mWorkerParams.getMax.getMin;
    }

    @IntRange(from = 0)
    public final int getRunAttemptCount() {
        return this.mWorkerParams.length;
    }

    @NonNull
    public final ListenableFuture<Void> setProgressAsync(@NonNull updateAppearance updateappearance) {
        AppCompatButton appCompatButton = this.mWorkerParams.toFloatRange;
        getApplicationContext();
        return appCompatButton.getMax(getId(), updateappearance);
    }

    @NonNull
    public final ListenableFuture<Void> setForegroundAsync(@NonNull ActivityChooserView.InnerLayout innerLayout) {
        this.mRunInForeground = true;
        return this.mWorkerParams.IsOverlapping.length(getApplicationContext(), getId(), innerLayout);
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isUsed() {
        return this.mUsed;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setUsed() {
        this.mUsed = true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.equals;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public getMinWidthMinor getTaskExecutor() {
        return this.mWorkerParams.toIntRange;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public setAutoSizeTextTypeUniformWithConfiguration getWorkerFactory() {
        return this.mWorkerParams.isInside;
    }

    public static abstract class setMax {
        @NonNull
        public static setMax getMin() {
            return new C0000setMax();
        }

        @NonNull
        public static setMax setMin(@NonNull updateAppearance updateappearance) {
            return new C0000setMax(updateappearance);
        }

        @NonNull
        public static setMax setMin() {
            return new setMin();
        }

        @NonNull
        public static setMax setMax() {
            return new getMin();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        setMax() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: androidx.work.ListenableWorker$setMax$setMax  reason: collision with other inner class name */
        public static final class C0000setMax extends setMax {
            public final updateAppearance length;

            public C0000setMax() {
                this(updateAppearance.length);
            }

            public C0000setMax(@NonNull updateAppearance updateappearance) {
                this.length = updateappearance;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return this.length.equals(((C0000setMax) obj).length);
            }

            public final int hashCode() {
                return (C0000setMax.class.getName().hashCode() * 31) + this.length.hashCode();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success {mOutputData=");
                sb.append(this.length);
                sb.append('}');
                return sb.toString();
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class getMin extends setMax {
            public final updateAppearance getMin;

            public getMin() {
                this(updateAppearance.length);
            }

            private getMin(@NonNull updateAppearance updateappearance) {
                this.getMin = updateappearance;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return this.getMin.equals(((getMin) obj).getMin);
            }

            public final int hashCode() {
                return (getMin.class.getName().hashCode() * 31) + this.getMin.hashCode();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Failure {mOutputData=");
                sb.append(this.getMin);
                sb.append('}');
                return sb.toString();
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class setMin extends setMax {
            public final String toString() {
                return "Retry";
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass();
            }

            public final int hashCode() {
                return setMin.class.getName().hashCode();
            }
        }
    }
}
