package o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.DefaultAuthenticationProxyImpl;
import o.b;

public final class LocalAuthPermissionManager implements getAdapterPosition<DefaultAuthenticationProxyImpl.AnonymousClass2> {

    static final class getMin {
        /* access modifiers changed from: private */
        public static final LocalAuthPermissionManager getMin = new LocalAuthPermissionManager();
    }

    public final DefaultAuthenticationProxyImpl.AnonymousClass2 get() {
        return newInstance();
    }

    public final class b implements getAdapterPosition<setOnConfirmClickListener> {
        private final b.C0007b<PluginInstallCallback> serializerProvider;

        public b(b.C0007b<PluginInstallCallback> bVar) {
            this.serializerProvider = bVar;
        }

        public final setOnConfirmClickListener get() {
            return newInstance(this.serializerProvider.get());
        }

        public static b create(b.C0007b<PluginInstallCallback> bVar) {
            return new b(bVar);
        }

        public static setOnConfirmClickListener newInstance(PluginInstallCallback pluginInstallCallback) {
            return new setOnConfirmClickListener(pluginInstallCallback);
        }
    }

    public static LocalAuthPermissionManager create() {
        return getMin.getMin;
    }

    public static DefaultAuthenticationProxyImpl.AnonymousClass2 newInstance() {
        return new setSpeed<String, save>() {
            private String splitBillId;

            public void setSplitBillId(String str) {
                this.splitBillId = str;
            }

            /* access modifiers changed from: protected */
            public save map(String str) {
                if (!TextUtils.isEmpty(str)) {
                    return new save(str, this.splitBillId);
                }
                return null;
            }
        };
    }

    public class a extends setSpeed<sendNetworkResponse, onSocketClose> {
        private final PluginInstallCallback serializer;

        @Inject
        public a(PluginInstallCallback pluginInstallCallback) {
            this.serializer = pluginInstallCallback;
        }

        /* access modifiers changed from: protected */
        public onSocketClose map(sendNetworkResponse sendnetworkresponse) {
            if (sendnetworkresponse == null) {
                return null;
            }
            onSocketClose onsocketclose = new onSocketClose();
            onsocketclose.success = true;
            onsocketclose.setSplitBillOrder(transform(sendnetworkresponse));
            return onsocketclose;
        }

        private setDialogContent transform(sendNetworkResponse sendnetworkresponse) {
            setDialogContent setdialogcontent = new setDialogContent();
            setdialogcontent.setSplitBillId(sendnetworkresponse.getSplitBillId());
            setdialogcontent.setStatus(sendnetworkresponse.getStatus());
            setdialogcontent.setComment(sendnetworkresponse.getComment());
            setdialogcontent.setPayeeIndex(String.valueOf(sendnetworkresponse.getPayeeIndex()));
            setdialogcontent.setPayerIndex(String.valueOf(sendnetworkresponse.getPayerIndex()));
            setdialogcontent.setPayersResult(this.serializer.deserializeList(sendnetworkresponse.getPayers(), DefaultRemoteDebugProxyImpl.class));
            setdialogcontent.setPayerAmount(getPayerAmount(setdialogcontent));
            setdialogcontent.setDeeplinkUrl(sendnetworkresponse.getDeepLinkUrl());
            return setdialogcontent;
        }

        private String getPayerAmount(setDialogContent setdialogcontent) {
            if (TextUtils.isEmpty(setdialogcontent.getPayerIndex())) {
                return "";
            }
            return setdialogcontent.getPayersResult().get(Integer.valueOf(setdialogcontent.getPayeeIndex()).intValue()).getFundAmount();
        }
    }

    public class SCOPE extends setSpeed<List<sendNetworkResponse>, tyroRequest> {
        private static final String CURRENCY = "Rp";
        private PluginInstallCallback serializer;

        @Inject
        public SCOPE(PluginInstallCallback pluginInstallCallback) {
            this.serializer = pluginInstallCallback;
        }

        /* access modifiers changed from: protected */
        public tyroRequest map(List<sendNetworkResponse> list) {
            if (list == null) {
                return null;
            }
            tyroRequest tyrorequest = new tyroRequest();
            tyrorequest.success = true;
            tyrorequest.setSplitBillHistoryList(transform(list));
            return tyrorequest;
        }

        private List<supportRemoteDebug> transform(List<sendNetworkResponse> list) {
            ArrayList arrayList = new ArrayList();
            for (sendNetworkResponse next : list) {
                if (next != null) {
                    arrayList.add(map(next));
                }
            }
            return arrayList;
        }

        private supportRemoteDebug map(sendNetworkResponse sendnetworkresponse) {
            supportRemoteDebug supportremotedebug = new supportRemoteDebug();
            List<setExtraBeaconDataTracker> deserializeList = this.serializer.deserializeList(sendnetworkresponse.getPayers(), setExtraBeaconDataTracker.class);
            supportremotedebug.setAvatarPayersList(getAvatarPayers(deserializeList));
            supportremotedebug.setComment(sendnetworkresponse.getComment());
            if (!isSplitBillHasCreatedDate(sendnetworkresponse)) {
                supportremotedebug.setSplitBillDate(sendnetworkresponse.getLastUpdated() * 1000);
            } else {
                supportremotedebug.setSplitBillDate(sendnetworkresponse.getCreatedDate());
            }
            if (!isHasTotalAmount(sendnetworkresponse)) {
                supportremotedebug.setTotalAmount(calculate(deserializeList));
            } else {
                registerWorker registerworker = new registerWorker();
                registerworker.setAmount(sendnetworkresponse.getTotalAmount());
                supportremotedebug.setTotalAmount(registerworker);
            }
            supportremotedebug.setStatus(sendnetworkresponse.getStatus());
            supportremotedebug.setSplitBillId(sendnetworkresponse.getSplitBillId());
            return supportremotedebug;
        }

        private registerWorker calculate(List<setExtraBeaconDataTracker> list) {
            long j = 0;
            for (setExtraBeaconDataTracker fundAmount : list) {
                j += Long.valueOf(fundAmount.getFundAmount()).longValue();
            }
            registerWorker registerworker = new registerWorker();
            registerworker.setCurrency("Rp");
            registerworker.setAmount(String.valueOf(j));
            return registerworker;
        }

        private List<String> getAvatarPayers(List<setExtraBeaconDataTracker> list) {
            ArrayList arrayList = new ArrayList();
            for (setExtraBeaconDataTracker next : list) {
                if (next != null) {
                    arrayList.add(next.getImageUrl());
                }
            }
            return arrayList;
        }

        private boolean isSplitBillHasCreatedDate(sendNetworkResponse sendnetworkresponse) {
            return sendnetworkresponse.getCreatedDate() != 0;
        }

        private boolean isHasTotalAmount(sendNetworkResponse sendnetworkresponse) {
            return !TextUtils.isEmpty(sendnetworkresponse.getTotalAmount()) && Long.valueOf(isOriginHasAppInfo.getCleanDot(sendnetworkresponse.getTotalAmount())).longValue() != 0;
        }
    }
}
