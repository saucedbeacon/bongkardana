package id.dana.danah5.customnotificationsound;

import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Lid/dana/danah5/customnotificationsound/CustomNotificationSoundBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "customNotificationSound", "", "eventName", "", "page", "Lcom/alibaba/ariver/app/api/Page;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class CustomNotificationSoundBridge extends SimpleBridgeExtension {
    @NotNull
    public static final String CUSTOM_NOTIFICATION_SOUND_EVENT = "playCustomNotificationSound";
    @NotNull
    public static final getMin Companion = new getMin((DefaultConstructorMarker) null);

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        r2 = r2.getActivity();
     */
    @com.alibaba.ariver.kernel.api.annotation.ThreadType(com.alibaba.ariver.kernel.common.service.executor.ExecutorType.NORMAL)
    @com.alibaba.ariver.kernel.api.annotation.ActionFilter(canOverride = false)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void customNotificationSound(@org.jetbrains.annotations.NotNull @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"event"}) java.lang.String r2, @org.jetbrains.annotations.NotNull @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode(com.alibaba.ariver.app.api.Page.class) com.alibaba.ariver.app.api.Page r3) {
        /*
            r1 = this;
            java.lang.String r0 = "eventName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "page"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "playCustomNotificationSound"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)
            if (r2 == 0) goto L_0x0033
            java.lang.String r2 = "$this$context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            com.alibaba.ariver.app.api.PageContext r2 = r3.getPageContext()
            if (r2 == 0) goto L_0x0028
            android.app.Activity r2 = r2.getActivity()
            if (r2 == 0) goto L_0x0028
            android.content.Context r2 = r2.getApplicationContext()
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            r3 = 2131820570(0x7f11001a, float:1.9273859E38)
            android.media.MediaPlayer r2 = android.media.MediaPlayer.create(r2, r3)
            r2.start()
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.danah5.customnotificationsound.CustomNotificationSoundBridge.customNotificationSound(java.lang.String, com.alibaba.ariver.app.api.Page):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/danah5/customnotificationsound/CustomNotificationSoundBridge$Companion;", "", "()V", "CUSTOM_NOTIFICATION_SOUND_EVENT", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
