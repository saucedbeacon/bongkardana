package o;

import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import dagger.internal.InjectedFieldSignature;
import id.dana.danah5.globalnetwork.GetForexBalanceResultFactory;
import id.dana.danah5.globalnetwork.GlobalNetworkBridge;
import id.dana.danah5.globalnetwork.InquiryResultFactory;
import id.dana.danah5.globalnetwork.model.request.InquiryForexRateEntity;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import o.H5UCProvider;
import o.b;
import o.cornerRadius;
import o.debugMode;
import org.jetbrains.annotations.NotNull;

public class maxWidth {
    private final IRedDotManager compositeDisposable = new IRedDotManager();
    private final isKeepCallback getForex;
    private final H5UCProvider getRealTimeForex;
    private final cannotInitUC getSelectedCountryCode;

    /* renamed from: o.maxWidth$default  reason: invalid class name */
    public final class Cdefault implements getBindingAdapter<GlobalNetworkBridge> {
        private final b.C0007b<maxWidth> globalNetworkPluginManagerProvider;

        public Cdefault(b.C0007b<maxWidth> bVar) {
            this.globalNetworkPluginManagerProvider = bVar;
        }

        public static getBindingAdapter<GlobalNetworkBridge> create(b.C0007b<maxWidth> bVar) {
            return new Cdefault(bVar);
        }

        public final void injectMembers(GlobalNetworkBridge globalNetworkBridge) {
            injectGlobalNetworkPluginManager(globalNetworkBridge, this.globalNetworkPluginManagerProvider.get());
        }

        @InjectedFieldSignature("id.dana.danah5.globalnetwork.GlobalNetworkBridge.globalNetworkPluginManager")
        public static void injectGlobalNetworkPluginManager(GlobalNetworkBridge globalNetworkBridge, maxWidth maxwidth) {
            globalNetworkBridge.globalNetworkPluginManager = maxwidth;
        }
    }

    @Inject
    public maxWidth(cannotInitUC cannotinituc, isKeepCallback iskeepcallback, H5UCProvider h5UCProvider) {
        this.getSelectedCountryCode = cannotinituc;
        this.getForex = iskeepcallback;
        this.getRealTimeForex = h5UCProvider;
    }

    public boolean inquiryForexRate(BridgeCallback bridgeCallback, InquiryForexRateEntity inquiryForexRateEntity) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InquiryForexRateEntity.getMax next : inquiryForexRateEntity.getQueries()) {
            arrayList.add(next.getFrom());
            arrayList2.add(next.getTo());
        }
        getRealTimeForex(bridgeCallback, arrayList, arrayList2);
        return true;
    }

    private void getRealTimeForex(final BridgeCallback bridgeCallback, List<String> list, List<String> list2) {
        this.getRealTimeForex.execute(new GriverAppVirtualHostProxy<List<initUC7zSo>>() {
            public final void onNext(List<initUC7zSo> list) {
                List access$000 = maxWidth.this.getRateList(list);
                cancelOnTouchOutside cancelontouchoutside = new cancelOnTouchOutside();
                cancelontouchoutside.setLastUpdated(String.valueOf(Calendar.getInstance().getTimeInMillis()));
                maxWidth.this.sendResultInquirySuccess(bridgeCallback, true, access$000, cancelontouchoutside.getLastUpdated());
            }

            public final void onError(Throwable th) {
                updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, th.getMessage());
            }
        }, H5UCProvider.length.getRealtimeForex(list, list2));
    }

    /* access modifiers changed from: private */
    @NotNull
    public List<debugMode.Cdefault> getRateList(List<initUC7zSo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (initUC7zSo next : list) {
            debugMode.Cdefault defaultR = new debugMode.Cdefault();
            defaultR.setFrom("IDR");
            defaultR.setTo(next.getCurrency());
            defaultR.setRate(String.valueOf(next.getRate()));
            String symbol = Currency.getInstance(next.getCurrency()).getSymbol();
            if (symbol.equals("IDR")) {
                symbol = "Rp";
            }
            defaultR.setSymbol(symbol);
            arrayList.add(defaultR);
        }
        return arrayList;
    }

    public boolean getForexBalance(BridgeCallback bridgeCallback) {
        this.compositeDisposable.getMin(this.getSelectedCountryCode.execute(null).subscribe(new clearNeutralListeners(this, bridgeCallback)));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: getForexBalance */
    public void lambda$getForexBalance$0(BridgeCallback bridgeCallback, String str) {
        this.compositeDisposable.getMin(this.getForex.execute(null).subscribe(new debugMode(this, bridgeCallback, str)));
    }

    /* access modifiers changed from: private */
    /* renamed from: sendResultForexBalance */
    public void lambda$getForexBalance$1(BridgeCallback bridgeCallback, String str, initUC7zSo inituc7zso) {
        cornerRadius.Cdefault defaultR = new cornerRadius.Cdefault();
        String symbol = Currency.getInstance(new Locale(Locale.ENGLISH.getLanguage(), TextUtils.isEmpty(str) ? "ID" : str)).getSymbol();
        if (symbol.equals("IDR")) {
            symbol = "Rp";
        }
        defaultR.setSymbol(symbol);
        defaultR.setCountry(str);
        defaultR.setAmount(inituc7zso.getForexAmount());
        cancelable cancelable = new cancelable();
        cancelable.setData(defaultR);
        sendResultForexBalanceSuccess(bridgeCallback, true, cancelable);
    }

    /* access modifiers changed from: private */
    public void sendResultInquirySuccess(BridgeCallback bridgeCallback, boolean z, List<debugMode.Cdefault> list, String str) {
        bridgeCallback.sendJSONResponse(InquiryResultFactory.getResult(z ? "SUCCESS" : "UNKNOWN_ERROR", list, str));
    }

    private void sendResultForexBalanceSuccess(BridgeCallback bridgeCallback, boolean z, cancelable cancelable) {
        bridgeCallback.sendJSONResponse(GetForexBalanceResultFactory.getResult(z ? "SUCCESS" : "UNKNOWN_ERROR", cancelable));
    }
}
