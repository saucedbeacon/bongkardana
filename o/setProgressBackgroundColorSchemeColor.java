package o;

import android.os.Handler;
import androidx.lifecycle.LiveData;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"debounce", "Landroidx/lifecycle/MediatorLiveData;", "T", "Landroidx/lifecycle/LiveData;", "duration", "", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class setProgressBackgroundColorSchemeColor {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "run"}, k = 3, mv = {1, 4, 2})
    public static final class getMin implements Runnable {
        final /* synthetic */ onRestoreInstanceState setMax;
        final /* synthetic */ LiveData setMin;

        public getMin(onRestoreInstanceState onrestoreinstancestate, LiveData liveData) {
            this.setMax = onrestoreinstancestate;
            this.setMin = liveData;
        }

        public final void run() {
            onRestoreInstanceState onrestoreinstancestate = this.setMax;
            Object obj = this.setMin.setMin;
            if (obj == LiveData.setMax) {
                obj = null;
            }
            onrestoreinstancestate.getMax(obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Object;)V", "id/dana/connectivity/ConnectivityMonitorKt$debounce$1$1"}, k = 3, mv = {1, 4, 2})
    public static final class setMin<T> implements onMeasure<T> {
        final /* synthetic */ long getMax = 1000;
        final /* synthetic */ LiveData getMin;
        final /* synthetic */ Runnable length;
        final /* synthetic */ Handler setMin;

        public setMin(Handler handler, Runnable runnable, LiveData liveData) {
            this.setMin = handler;
            this.length = runnable;
            this.getMin = liveData;
        }

        public final void onChanged(T t) {
            this.setMin.removeCallbacks(this.length);
            this.setMin.postDelayed(this.length, this.getMax);
        }
    }
}
