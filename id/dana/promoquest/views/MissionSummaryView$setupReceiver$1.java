package id.dana.promoquest.views;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.promoquest.model.MissionModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"id/dana/promoquest/views/MissionSummaryView$setupReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MissionSummaryView$setupReceiver$1 extends BroadcastReceiver {
    final /* synthetic */ MissionSummaryView this$0;

    MissionSummaryView$setupReceiver$1(MissionSummaryView missionSummaryView) {
        this.this$0 = missionSummaryView;
    }

    public final void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
        MissionModel missionModel = (MissionModel) intent.getParcelableExtra("PromoQuest.mission");
        if (missionModel != null) {
            Intrinsics.checkNotNullExpressionValue(missionModel, "intent.getParcelableExtr…              ) ?: return");
            MissionSummaryView.access$updateMission(this.this$0, missionModel);
        }
    }
}
