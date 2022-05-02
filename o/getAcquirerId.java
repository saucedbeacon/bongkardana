package o;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import o.b;

public final class getAcquirerId extends setAutoSizeTextTypeUniformWithConfiguration {
    private final Map<Class<? extends ListenableWorker>, b.C0007b<setMerchantId>> getMax;

    @Inject
    public getAcquirerId(Map<Class<? extends ListenableWorker>, b.C0007b<setMerchantId>> map) {
        this.getMax = map;
    }

    @Nullable
    public final ListenableWorker getMax(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
        b.C0007b bVar;
        Iterator<Map.Entry<Class<? extends ListenableWorker>, b.C0007b<setMerchantId>>> it = this.getMax.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            Map.Entry next = it.next();
            if (TextUtils.equals(str, ((Class) next.getKey()).getName())) {
                bVar = (b.C0007b) next.getValue();
                break;
            }
        }
        if (bVar == null || bVar.get() == null) {
            return null;
        }
        return ((setMerchantId) bVar.get()).getMax(context, workerParameters);
    }
}
