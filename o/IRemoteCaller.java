package o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.PerfId;
import o.b;

public class IRemoteCaller extends setSpeed<getMonitorToken, RemoteNormalExtensionInvoker> {
    private final addExtraData recentRecipientEntityMapper;

    public final class Stub implements getAdapterPosition<PerfId.PerfValue> {
        private final b.C0007b<toMap> networkBankCardConversionEntityDataProvider;

        public final class Proxy implements getAdapterPosition<IRemoteCaller> {
            private final b.C0007b<addExtraData> recentRecipientEntityMapperProvider;

            public Proxy(b.C0007b<addExtraData> bVar) {
                this.recentRecipientEntityMapperProvider = bVar;
            }

            public final IRemoteCaller get() {
                return newInstance(this.recentRecipientEntityMapperProvider.get());
            }

            public static Proxy create(b.C0007b<addExtraData> bVar) {
                return new Proxy(bVar);
            }

            public static IRemoteCaller newInstance(addExtraData addextradata) {
                return new IRemoteCaller(addextradata);
            }
        }

        public Stub(b.C0007b<toMap> bVar) {
            this.networkBankCardConversionEntityDataProvider = bVar;
        }

        public final PerfId.PerfValue get() {
            return newInstance(this.networkBankCardConversionEntityDataProvider.get());
        }

        public static Stub create(b.C0007b<toMap> bVar) {
            return new Stub(bVar);
        }

        public static PerfId.PerfValue newInstance(toMap tomap) {
            return new PerfId.PerfValue(tomap);
        }
    }

    @Inject
    public IRemoteCaller(addExtraData addextradata) {
        this.recentRecipientEntityMapper = addextradata;
    }

    public RemoteNormalExtensionInvoker apply(isRemoteExtension isremoteextension) {
        return map((getMonitorToken) this.recentRecipientEntityMapper.apply(isremoteextension));
    }

    public List<RemoteNormalExtensionInvoker> apply(List<getMonitorToken> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (getMonitorToken next : list) {
            if (next.getType() == 1) {
                arrayList.add(map(next));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public RemoteNormalExtensionInvoker map(getMonitorToken getmonitortoken) {
        if (getmonitortoken == null || TextUtils.isEmpty(getmonitortoken.getCardIndexNo())) {
            return null;
        }
        RemoteNormalExtensionInvoker remoteNormalExtensionInvoker = new RemoteNormalExtensionInvoker(getmonitortoken.getCardIndexNo());
        remoteNormalExtensionInvoker.setRecipientName(getmonitortoken.getRecipientName());
        remoteNormalExtensionInvoker.setAlias(getmonitortoken.getAlias());
        remoteNormalExtensionInvoker.setInstId(getmonitortoken.getId());
        remoteNormalExtensionInvoker.setBankLogo(getmonitortoken.getImageUrl());
        remoteNormalExtensionInvoker.setInstLocalName(getmonitortoken.getInstLocalName());
        remoteNormalExtensionInvoker.setLastUpdated(getmonitortoken.getLastUpdated());
        remoteNormalExtensionInvoker.setBankName(getmonitortoken.getName());
        remoteNormalExtensionInvoker.setBankNumber(getmonitortoken.getNumber());
        remoteNormalExtensionInvoker.setPayMethod(getmonitortoken.getPayMethod());
        remoteNormalExtensionInvoker.setPayOption(getmonitortoken.getPayOption());
        remoteNormalExtensionInvoker.setSenderName(getmonitortoken.getSenderName());
        remoteNormalExtensionInvoker.setPrefix(getmonitortoken.getPrefix());
        remoteNormalExtensionInvoker.setTransactionCount(getmonitortoken.getTransactionCount());
        remoteNormalExtensionInvoker.setVisibleInQuickSend(getmonitortoken.isVisibleInQuickSend());
        return remoteNormalExtensionInvoker;
    }

    public GriverFullLinkStageMonitor getMaskingData(GriverFullLinkStageMonitor griverFullLinkStageMonitor) {
        griverFullLinkStageMonitor.setNumber(griverFullLinkStageMonitor.getFormattedMaskNumber());
        return griverFullLinkStageMonitor;
    }
}
