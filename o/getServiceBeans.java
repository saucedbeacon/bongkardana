package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.RVInitializer;
import o.ToastUtils;

@Singleton
public class getServiceBeans {
    private final defaultPlatform currencyAmountResultMapper;

    @Inject
    public getServiceBeans(defaultPlatform defaultplatform) {
        this.currencyAmountResultMapper = defaultplatform;
    }

    public TinyUtils transform(setProjectManifest setprojectmanifest) {
        if (setprojectmanifest == null) {
            return null;
        }
        TinyUtils tinyUtils = new TinyUtils();
        uncheckAllItems.transform(tinyUtils, setprojectmanifest);
        return tinyUtils;
    }

    public ToastUtils transform(RVMain rVMain) {
        if (rVMain == null) {
            return null;
        }
        ToastUtils toastUtils = new ToastUtils();
        uncheckAllItems.transform(toastUtils, rVMain);
        toastUtils.setDefaultOption(rVMain.defaultOption);
        toastUtils.setPayMethodViews(transformPayMethods(rVMain.payMethodViewDTOS));
        toastUtils.setStandardCardOptionViews(transformCardOptions(rVMain.standardCardOptionViews));
        toastUtils.setScannerEnable(rVMain.scannerEnable);
        toastUtils.setFocusFirstCard(rVMain.focusFirstCard);
        toastUtils.setCountryCode(rVMain.countryCode);
        return toastUtils;
    }

    public List<UCUtils> transformPayMethods(List<setupOptimize> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (setupOptimize transform : list) {
            UCUtils transform2 = transform(transform);
            if (transform2 != null) {
                arrayList.add(transform2);
            }
        }
        return arrayList;
    }

    public UCUtils transform(setupOptimize setupoptimize) {
        if (setupoptimize == null) {
            return null;
        }
        UCUtils uCUtils = new UCUtils();
        uCUtils.setPayMethod(setupoptimize.payMethod);
        uCUtils.setPayCardOptionViews(transformCardOptions(setupoptimize.payCardOptionViewDTOs));
        uCUtils.setPayChannelOptionViews(transformChannelOptions(setupoptimize.payChannelOptionViewDTOS));
        return uCUtils;
    }

    public List<getAbsoluteUrlV2> transformCardOptions(List<initClassNameFromPkgName> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (initClassNameFromPkgName transform : list) {
            getAbsoluteUrlV2 transform2 = transform(transform);
            if (transform2 != null) {
                arrayList.add(transform2);
            }
        }
        return arrayList;
    }

    public getAbsoluteUrlV2 transform(initClassNameFromPkgName initclassnamefrompkgname) {
        if (initclassnamefrompkgname == null) {
            return null;
        }
        getAbsoluteUrlV2 getabsoluteurlv2 = new getAbsoluteUrlV2();
        getabsoluteurlv2.setAssetType(initclassnamefrompkgname.assetType);
        getabsoluteurlv2.setBindingId(initclassnamefrompkgname.bindingId);
        getabsoluteurlv2.setCardBin(initclassnamefrompkgname.cardBin);
        getabsoluteurlv2.setCardIndexNo(initclassnamefrompkgname.cardIndexNo);
        getabsoluteurlv2.setCardNoLength(initclassnamefrompkgname.cardNoLength);
        getabsoluteurlv2.setCardScheme(initclassnamefrompkgname.cardScheme);
        getabsoluteurlv2.setDefaultCard(initclassnamefrompkgname.defaultCard);
        getabsoluteurlv2.setEnableStatus(initclassnamefrompkgname.enableStatus);
        getabsoluteurlv2.setExpiryMonth(initclassnamefrompkgname.expiryMonth);
        getabsoluteurlv2.setExpiryYear(initclassnamefrompkgname.expiryYear);
        getabsoluteurlv2.setExtendInfo(initclassnamefrompkgname.extendInfo);
        getabsoluteurlv2.setHolderName(initclassnamefrompkgname.holderName);
        getabsoluteurlv2.setInstId(initclassnamefrompkgname.instId);
        getabsoluteurlv2.setInstName(initclassnamefrompkgname.instName);
        getabsoluteurlv2.setMaskedCardNo(initclassnamefrompkgname.maskedCardNo);
        getabsoluteurlv2.setPayMethod(initclassnamefrompkgname.payMethod);
        getabsoluteurlv2.setPayOption(initclassnamefrompkgname.payOption);
        getabsoluteurlv2.setPayWithoutCVV(initclassnamefrompkgname.payWithoutCVV);
        getabsoluteurlv2.setPayVerifyElements(initclassnamefrompkgname.payVerifyElements);
        getabsoluteurlv2.setOfflinePayIndex(initclassnamefrompkgname.offlinePayIndex);
        return getabsoluteurlv2;
    }

    public List<ToastUtils.TYPE> transformChannelOptions(List<RVInitializer.AnonymousClass1> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (RVInitializer.AnonymousClass1 transform : list) {
            ToastUtils.TYPE transform2 = transform(transform);
            if (transform2 != null) {
                arrayList.add(transform2);
            }
        }
        return arrayList;
    }

    public ToastUtils.TYPE transform(RVInitializer.AnonymousClass1 r3) {
        if (r3 == null) {
            return null;
        }
        ToastUtils.TYPE type = new ToastUtils.TYPE();
        type.setAmountRange(transform(r3.amountRange));
        type.setBankCode(r3.bankCode);
        type.setDisableReason(r3.disableReason);
        type.setEnableStatus(r3.enableStatus);
        type.setExtendInfo(r3.extendInfo);
        type.setInstId(r3.instId);
        type.setInstName(r3.instName);
        type.setInstLocalName(r3.instLocalName);
        type.setInterBank(r3.interBank);
        type.setPayAccountNo(r3.payAccountNo);
        type.setPayMethod(r3.payMethod);
        type.setPayOption(r3.payOption);
        type.setOfflinePayIndex(r3.offlinePayIndex);
        return type;
    }

    public isMain transform(RVInitializer rVInitializer) {
        if (rVInitializer == null) {
            return null;
        }
        isMain ismain = new isMain();
        ismain.setMaxAmount((stopBleScan) this.currencyAmountResultMapper.apply(rVInitializer.maxAmount));
        ismain.setMinAmount((stopBleScan) this.currencyAmountResultMapper.apply(rVInitializer.minAmount));
        return ismain;
    }
}
