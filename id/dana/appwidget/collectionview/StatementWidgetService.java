package id.dana.appwidget.collectionview;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViewsService;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.exportSchema;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lid/dana/appwidget/collectionview/StatementWidgetService;", "Landroid/widget/RemoteViewsService;", "()V", "onGetViewFactory", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "intent", "Landroid/content/Intent;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class StatementWidgetService extends RemoteViewsService {
    @NotNull
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        return new exportSchema(applicationContext, intent);
    }
}
