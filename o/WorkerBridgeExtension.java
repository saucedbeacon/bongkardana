package o;

import android.content.Context;
import id.dana.R;
import id.dana.domain.profilemenu.model.SettingModel;
import javax.inject.Inject;
import o.AppearanceBridgeExtension;
import o.InternalApiBridgeExtension;
import o.IpcMsgClientService;
import o.ShareRecyclerAdapter;
import o.TitleBarRightButtonView;

public final class WorkerBridgeExtension implements sendUcReceiver {
    private final ShareRecyclerAdapter.ShareViewHolder getMax;
    private final Context length;
    private final onDescriptorWrite setMin;

    final class PluginFuture implements RedDotDrawable {
        private final AnonymousClass1 setMin;

        public PluginFuture(AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final Object apply(Object obj) {
            return this.setMin.getMax.generateReferralDeepLink(this.setMin.setMax.getReferralCode()).onErrorResumeNext(TitleBarRightButtonView.AnonymousClass1.just(new APWebSettings(""))).doOnNext(new RedDotManager(this.setMin) {
                private final AnonymousClass1 setMin;

                {
                    this.setMin = r1;
                }

                public final void accept(Object obj) {
                    this.setMin.setMin = ((APWebSettings) obj).getLink();
                }
            }).map(new IpcMsgClientService.Lite1((appxrpc) obj));
        }
    }

    public final String getSettingName() {
        return "setting_kyb";
    }

    @Inject
    public WorkerBridgeExtension(onDescriptorWrite ondescriptorwrite, Context context, ShareRecyclerAdapter.ShareViewHolder shareViewHolder) {
        this.setMin = ondescriptorwrite;
        this.length = context;
        this.getMax = shareViewHolder;
    }

    public final TitleBarRightButtonView.AnonymousClass1<SettingModel> performConfiguration(SettingModel settingModel) {
        return this.setMin.getUserInfo().onErrorResumeNext(AppearanceBridgeExtension.AnonymousClass1.getMin).map(new hideOptionMenuItem(this, settingModel));
    }

    private static boolean getMax(getPagePerfKey getpageperfkey) {
        return getpageperfkey == null || getpageperfkey.setMax == null || getpageperfkey.toIntRange == null;
    }

    public final void length(SettingModel settingModel, getPagePerfKey getpageperfkey) {
        activityGetScreenOrientation activitygetscreenorientation = getpageperfkey.setMax;
        InternalApiBridgeExtension.AnonymousClass1 r4 = getpageperfkey.toIntRange;
        String str = activitygetscreenorientation.getMax;
        settingModel.setKycRevoked(r4.length(str));
        settingModel.setKybRevoked(r4.getMin());
        settingModel.setTitle(r4.length(this.length, str));
        settingModel.setSubtitle(r4.getMax(this.length, str));
    }

    static /* synthetic */ SettingModel setMin(WorkerBridgeExtension workerBridgeExtension, SettingModel settingModel, disconnect disconnect) {
        getPagePerfKey min = workerBridgeExtension.getMax.setMin(disconnect);
        if (getMax(min)) {
            settingModel.setKycRevoked(true);
            settingModel.setKybRevoked(true);
            settingModel.setTitle(workerBridgeExtension.length.getString(R.string.kyb_apply_header));
            settingModel.setSubtitle(workerBridgeExtension.length.getString(R.string.kyb_apply_body));
        } else {
            workerBridgeExtension.length(settingModel, min);
        }
        return settingModel;
    }
}
