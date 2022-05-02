package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class isBackgroundRunning extends setSpeed<List<runOnMainAtFrontOfQueue>, List<setBeaconLayout>> {
    private final getTopActivity couponDiscountInfoResultMapper;
    private final convertPlatform couponPayMethodInfoResultMapper;
    private final defaultPlatform currencyAmountResultMapper;

    @Inject
    public isBackgroundRunning(defaultPlatform defaultplatform, getTopActivity gettopactivity, convertPlatform convertplatform) {
        this.currencyAmountResultMapper = defaultplatform;
        this.couponDiscountInfoResultMapper = gettopactivity;
        this.couponPayMethodInfoResultMapper = convertplatform;
    }

    /* access modifiers changed from: protected */
    public List<setBeaconLayout> map(List<runOnMainAtFrontOfQueue> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (runOnMainAtFrontOfQueue mapSingle : list) {
            arrayList.add(mapSingle(mapSingle));
        }
        return arrayList;
    }

    private setBeaconLayout mapSingle(runOnMainAtFrontOfQueue runonmainatfrontofqueue) {
        if (runonmainatfrontofqueue == null) {
            return null;
        }
        setBeaconLayout setbeaconlayout = new setBeaconLayout();
        setbeaconlayout.setCouponId(runonmainatfrontofqueue.getCouponId());
        setbeaconlayout.setCouponName(runonmainatfrontofqueue.getCouponName());
        setbeaconlayout.setAvailableAmount(this.currencyAmountResultMapper.map(runonmainatfrontofqueue.getAvailableAmount()));
        setbeaconlayout.setTotalAmount(this.currencyAmountResultMapper.map(runonmainatfrontofqueue.getTotalAmount()));
        setbeaconlayout.setActiveTime(runonmainatfrontofqueue.getActiveTime());
        setbeaconlayout.setExpiryTime(runonmainatfrontofqueue.getExpiryTime());
        setbeaconlayout.setExtendTime(runonmainatfrontofqueue.getExtendTime());
        setbeaconlayout.setCreatedTime(runonmainatfrontofqueue.getCreatedTime());
        setbeaconlayout.setModifiedTime(runonmainatfrontofqueue.getModifiedTime());
        setbeaconlayout.setCouponDiscountInfo(this.couponDiscountInfoResultMapper.map(runonmainatfrontofqueue.getCouponDiscountInfo()));
        setbeaconlayout.setCouponPayMethodInfos(this.couponPayMethodInfoResultMapper.map(runonmainatfrontofqueue.getCouponPayMethodInfos()));
        setbeaconlayout.setDescription(runonmainatfrontofqueue.getDescription());
        setbeaconlayout.setIconUrl(runonmainatfrontofqueue.getIconUrl());
        setbeaconlayout.setTnc(runonmainatfrontofqueue.getTnc());
        return setbeaconlayout;
    }
}
