package o;

import android.content.Context;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import java.util.List;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import o.b;

public final class RVProxy implements getAdapterPosition<isKeyJsApi> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public interface LazyGetter {
        TitleBarRightButtonView.AnonymousClass1<pickNext> consult();

        TitleBarRightButtonView.AnonymousClass1<List<createChannelWithBuffer>> getDialogCaches();

        TitleBarRightButtonView.AnonymousClass1<Boolean> saveReferralEngagementDialogCache(List<createChannelWithBuffer> list);

        TitleBarRightButtonView.AnonymousClass1<setChannelId> statusConsult();

        TitleBarRightButtonView.AnonymousClass1<setViewId> verify(String str, String str2);
    }

    public interface EmptyPrinter {
        @OperationType("alipayplus.mobilewallet.referral.consult")
        @SignCheck
        doInitialize myReferralConsultEntityData(RefAware refAware);
    }

    final class Initializer implements addAnimatorUpdateListener.getMax {
        private final RefAware setMin;

        public Initializer(RefAware refAware) {
            this.setMin = refAware;
        }

        public final Object processFacade(Object obj) {
            return ((EmptyPrinter) obj).myReferralConsultEntityData(this.setMin);
        }
    }

    public class Printer {
        private String activityId;
        private boolean campaignEnabled;
        private stopBleScan prizeAmount;
        private String prizeName;

        public boolean isCampaignEnabled() {
            return this.campaignEnabled;
        }

        public void setCampaignEnabled(boolean z) {
            this.campaignEnabled = z;
        }

        public stopBleScan getPrizeAmount() {
            return this.prizeAmount;
        }

        public void setPrizeAmount(stopBleScan stopblescan) {
            this.prizeAmount = stopblescan;
        }

        public String getPrizeName() {
            return this.prizeName;
        }

        public void setPrizeName(String str) {
            this.prizeName = str;
        }

        public String getActivityId() {
            return this.activityId;
        }

        public void setActivityId(String str) {
            this.activityId = str;
        }
    }

    public RVProxy(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final isKeyJsApi get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static RVProxy create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new RVProxy(bVar, bVar2);
    }

    public static isKeyJsApi newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new isKeyJsApi(context, pluginInstallCallback);
    }
}
