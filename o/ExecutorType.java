package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.RVInitializer;
import o.getPowerCorrection;

@Singleton
public class ExecutorType {
    private List<addExtraDataParser> addPayMethods;
    private final defaultPlatform currencyAmountResultMapper;
    private final getServiceBeans payAssetMapper;
    private final getAppLayoutDirection payMethodRiskResultMapper;

    @Inject
    public ExecutorType(defaultPlatform defaultplatform, getServiceBeans getservicebeans, getAppLayoutDirection getapplayoutdirection) {
        this.currencyAmountResultMapper = defaultplatform;
        this.payAssetMapper = getservicebeans;
        this.payMethodRiskResultMapper = getapplayoutdirection;
    }

    public getServiceUuidEndOffset transform(ShadowNodePool shadowNodePool) {
        if (shadowNodePool == null) {
            return null;
        }
        getServiceUuidEndOffset getserviceuuidendoffset = new getServiceUuidEndOffset();
        getserviceuuidendoffset.setFundAmount(shadowNodePool.fundAmount);
        getserviceuuidendoffset.setFundOrderId(shadowNodePool.fundOrderId);
        getserviceuuidendoffset.setCashierOrderId(shadowNodePool.cashierOrderId);
        getserviceuuidendoffset.setPubkey(shadowNodePool.pubKey);
        getserviceuuidendoffset.setRiskPhoneNumber(shadowNodePool.riskPhoneNumber);
        getserviceuuidendoffset.setAttributes(transform(shadowNodePool.attributes));
        getserviceuuidendoffset.setPayMethodRiskResult((onResultSuccess) this.payMethodRiskResultMapper.apply(shadowNodePool.payMethodRiskResult));
        return getserviceuuidendoffset;
    }

    private OnRpcResultListener transform(registerRender registerrender) {
        if (registerrender == null) {
            return null;
        }
        OnRpcResultListener onRpcResultListener = new OnRpcResultListener();
        onRpcResultListener.setLoginStatus(registerrender.loginStatus);
        onRpcResultListener.setMaskedLoginId(registerrender.maskedLoginId);
        onRpcResultListener.setPayMethodRiskResponse((onResultSuccess) this.payMethodRiskResultMapper.apply(registerrender.payMethodRiskResult));
        return onRpcResultListener;
    }

    public getPowerCorrection transform(IpcMessageConstants ipcMessageConstants, List<addExtraDataParser> list) {
        this.addPayMethods = list;
        return transform(ipcMessageConstants);
    }

    public getPowerCorrection transform(IpcMessageConstants ipcMessageConstants) {
        if (ipcMessageConstants != null) {
            return new getPowerCorrection.setMax().setPayeeMaskedNickname(ipcMessageConstants.payeeMaskedNickname).setPayeeMaskedPhoneNumber(ipcMessageConstants.payeeMaskedPhoneNumber).setPayeeUserId(ipcMessageConstants.payeeUserId).setPayerAccountBalance(ipcMessageConstants.payerAccountBalance).setPayerMaxAmount(ipcMessageConstants.payerMaxAmount).setPayerMinAmount(ipcMessageConstants.payerMinAmount).setPayOptions(transform(ipcMessageConstants.payOptions)).setAvatarUrl(ipcMessageConstants.avatarUrl).setKyc(transform(ipcMessageConstants.kyc)).build();
        }
        return null;
    }

    private List<getIdentifierByteCount> transform(List<cleanPath> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (cleanPath transform : list) {
            getIdentifierByteCount transform2 = transform(transform);
            List<addExtraDataParser> list2 = this.addPayMethods;
            if (list2 != null && list2.size() > 0) {
                transform2.getPayMethodView().setAddPayMethods(this.addPayMethods);
            }
            arrayList.add(transform2);
        }
        return arrayList;
    }

    private onConfigChanged transform(mkdirs mkdirs) {
        if (mkdirs == null) {
            return null;
        }
        onConfigChanged onconfigchanged = new onConfigChanged();
        onconfigchanged.setLevel(mkdirs.getLevel());
        onconfigchanged.setOrderStatus(mkdirs.getOrderStatus());
        return onconfigchanged;
    }

    private getIdentifierByteCount transform(cleanPath cleanpath) {
        if (cleanpath == null) {
            return null;
        }
        getIdentifierByteCount getidentifierbytecount = new getIdentifierByteCount();
        getidentifierbytecount.setPayMethodView(this.payAssetMapper.transform(cleanpath.getPayMethodView()));
        getidentifierbytecount.setPayMethod(cleanpath.getPayMethod());
        getidentifierbytecount.setPayerMinAmount((stopBleScan) this.currencyAmountResultMapper.apply(cleanpath.getPayerMinAmount()));
        getidentifierbytecount.setPayerMaxAmount((stopBleScan) this.currencyAmountResultMapper.apply(cleanpath.getPayerMaxAmount()));
        getidentifierbytecount.setPayMethodFlag(getPayMethodFlag(cleanpath.getPayMethodView()));
        return getidentifierbytecount;
    }

    private boolean getPayMethodFlag(setupOptimize setupoptimize) {
        List<RVInitializer.AnonymousClass1> list = setupoptimize.payChannelOptionViewDTOS;
        if (list != null && list.size() > 0) {
            for (RVInitializer.AnonymousClass1 next : list) {
                if (next.enableStatus) {
                    return next.enableStatus;
                }
            }
        }
        return false;
    }

    public BleNotAvailableException transform(RVRemoteCallerProxy rVRemoteCallerProxy) {
        if (rVRemoteCallerProxy == null) {
            return null;
        }
        BleNotAvailableException bleNotAvailableException = new BleNotAvailableException();
        bleNotAvailableException.setCardCacheToken(rVRemoteCallerProxy.getCardCacheToken());
        bleNotAvailableException.setFormattedHolderName(rVRemoteCallerProxy.getFormattedHolderName());
        bleNotAvailableException.setFormattedMaskedCardNo(rVRemoteCallerProxy.getFormattedMaskedCardNo());
        bleNotAvailableException.setFundOrderId(rVRemoteCallerProxy.getFundOrderId());
        bleNotAvailableException.setMaskedPhoneNumber(rVRemoteCallerProxy.getMaskedPhoneNumber());
        bleNotAvailableException.setPayMethodRiskResult((onResultSuccess) this.payMethodRiskResultMapper.apply(rVRemoteCallerProxy.getPayMethodRiskResult()));
        bleNotAvailableException.setPublicKey(rVRemoteCallerProxy.getPublicKey());
        bleNotAvailableException.setTotalAmount((stopBleScan) this.currencyAmountResultMapper.apply(rVRemoteCallerProxy.getTotalAmount()));
        return bleNotAvailableException;
    }
}
