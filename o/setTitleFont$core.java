package o;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.lang.Thread;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rH\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014H\u0002J\u001a\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\rH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/crash/AppExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "systemHandler", "application", "Landroid/app/Application;", "(Ljava/lang/Thread$UncaughtExceptionHandler;Landroid/app/Application;)V", "lastStartedActivity", "Landroid/app/Activity;", "startCount", "", "isSameException", "", "originalException", "", "lastException", "isWhitelistedException", "exception", "killThisProcess", "", "action", "Lkotlin/Function0;", "uncaughtException", "t", "Ljava/lang/Thread;", "e", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setTitleFont$core implements Thread.UncaughtExceptionHandler {
    @NotNull
    public static final setMax getMax = new setMax((byte) 0);
    /* access modifiers changed from: private */
    public Activity getMin;
    /* access modifiers changed from: private */
    public int length;
    /* access modifiers changed from: private */
    public final Thread.UncaughtExceptionHandler setMin;

    public setTitleFont$core(@NotNull Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @Nullable Application application) {
        Intrinsics.checkNotNullParameter(uncaughtExceptionHandler, "systemHandler");
        this.setMin = uncaughtExceptionHandler;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks(this) {
                final /* synthetic */ setTitleFont$core getMin;

                public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
                    Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
                }

                public final void onActivityDestroyed(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
                }

                public final void onActivityPaused(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
                }

                public final void onActivityResumed(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
                }

                public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
                    Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
                    Intrinsics.checkNotNullParameter(bundle, "outState");
                }

                {
                    this.getMin = r1;
                }

                public final void onActivityStarted(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
                    setTitleFont$core settitlefont_core = this.getMin;
                    settitlefont_core.length = settitlefont_core.length + 1;
                    this.getMin.getMin = activity;
                }

                public final void onActivityStopped(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
                    setTitleFont$core settitlefont_core = this.getMin;
                    settitlefont_core.length = settitlefont_core.length - 1;
                    if (this.getMin.length <= 0) {
                        this.getMin.getMin = null;
                    }
                }
            });
        }
    }

    public final void uncaughtException(@Nullable Thread thread, @NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "e");
        Activity activity = this.getMin;
        if (activity != null) {
            boolean booleanExtra = activity.getIntent().getBooleanExtra("appExceptionHandler_restarted", false);
            Throwable th2 = (Throwable) activity.getIntent().getSerializableExtra("appExceptionHandler_lastException");
            if (booleanExtra && length(th, th2)) {
                new setMin(this, th, thread).invoke();
                Process.killProcess(Process.myPid());
                System.exit(10);
            } else if (setMax(th)) {
                new length(activity, this, th, thread).invoke();
                Process.killProcess(Process.myPid());
                System.exit(10);
            } else {
                new getMin(this, th, thread).invoke();
                Process.killProcess(Process.myPid());
                System.exit(10);
            }
        } else {
            new getMax(this, thread, th).invoke();
            Process.killProcess(Process.myPid());
            System.exit(10);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/crash/AppExceptionHandler$uncaughtException$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<Unit> {
        final /* synthetic */ Throwable $e$inlined;
        final /* synthetic */ Thread $t$inlined;
        final /* synthetic */ setTitleFont$core this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(setTitleFont$core settitlefont_core, Throwable th, Thread thread) {
            super(0);
            this.this$0 = settitlefont_core;
            this.$e$inlined = th;
            this.$t$inlined = thread;
        }

        public final void invoke() {
            this.this$0.setMin.uncaughtException(this.$t$inlined, this.$e$inlined);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/crash/AppExceptionHandler$uncaughtException$1$2"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<Unit> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Throwable $e$inlined;
        final /* synthetic */ Thread $t$inlined;
        final /* synthetic */ setTitleFont$core this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(Activity activity, setTitleFont$core settitlefont_core, Throwable th, Thread thread) {
            super(0);
            this.$activity = activity;
            this.this$0 = settitlefont_core;
            this.$e$inlined = th;
            this.$t$inlined = thread;
        }

        public final void invoke() {
            FirebaseCrashlytics.getInstance().recordException(this.$e$inlined);
            Intent addFlags = this.$activity.getIntent().putExtra("appExceptionHandler_restarted", true).putExtra("appExceptionHandler_lastException", this.$e$inlined).addFlags(268468224);
            Intrinsics.checkNotNullExpressionValue(addFlags, "activity.intent\n        …FLAG_ACTIVITY_CLEAR_TASK)");
            Activity activity = this.$activity;
            activity.finish();
            activity.startActivity(addFlags);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/crash/AppExceptionHandler$uncaughtException$1$3"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<Unit> {
        final /* synthetic */ Throwable $e$inlined;
        final /* synthetic */ Thread $t$inlined;
        final /* synthetic */ setTitleFont$core this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(setTitleFont$core settitlefont_core, Throwable th, Thread thread) {
            super(0);
            this.this$0 = settitlefont_core;
            this.$e$inlined = th;
            this.$t$inlined = thread;
        }

        public final void invoke() {
            this.this$0.setMin.uncaughtException(this.$t$inlined, this.$e$inlined);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<Unit> {
        final /* synthetic */ Throwable $e;
        final /* synthetic */ Thread $t;
        final /* synthetic */ setTitleFont$core this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(setTitleFont$core settitlefont_core, Thread thread, Throwable th) {
            super(0);
            this.this$0 = settitlefont_core;
            this.$t = thread;
            this.$e = th;
        }

        public final void invoke() {
            this.this$0.setMin.uncaughtException(this.$t, this.$e);
        }
    }

    private static boolean length(Throwable th, Throwable th2) {
        return th2 != null && Intrinsics.areEqual((Object) th.getClass(), (Object) th2.getClass()) && Intrinsics.areEqual((Object) th.getStackTrace()[0], (Object) th2.getStackTrace()[0]) && Intrinsics.areEqual((Object) th.getMessage(), (Object) th2.getMessage());
    }

    private static boolean setMax(Throwable th) {
        if (!(th instanceof RuntimeException)) {
            return false;
        }
        if (!(th.getCause() instanceof SecurityException)) {
            String simpleName = Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "";
            }
            if (StringsKt.contains((CharSequence) simpleName, (CharSequence) "CursorWindowAllocationException", true)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/crash/AppExceptionHandler$Companion;", "", "()V", "CursorWindowAllocationException", "", "LAST_EXCEPTION", "RESTARTED", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }
}
