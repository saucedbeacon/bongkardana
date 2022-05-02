package o;

import android.text.TextUtils;
import id.dana.data.sendmoney.repository.source.network.result.WithdrawMethodOptionResult;
import id.dana.sendmoney.model.BankModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import o.BeaconParser;
import o.PhotoPagerListener;

public final class SaveImageToAlbumBridgeExtension extends setSpeed<getDataFieldCount, List<BankModel>> {

    public final class ImageSaveRunner extends setSpeed<PhotoPagerListener.V4, getLayout> {
        public final /* synthetic */ Object map(Object obj) {
            return getMin((PhotoPagerListener.V4) obj);
        }

        @Inject
        ImageSaveRunner() {
        }

        public static getLayout getMin(PhotoPagerListener.V4 v4) {
            getLayout getlayout = new getLayout();
            if (v4 != null) {
                getlayout.setAmount(v4.setMax);
                getlayout.setCardIndexNo(v4.toString);
                getlayout.setFundType(v4.toDoubleRange);
                getlayout.setPayMethod(v4.getMax);
                getlayout.setRemarks(v4.getMin);
                getlayout.setOriginInstId(v4.length);
                getlayout.setTransferScenario(v4.values);
                getlayout.setPayeeInfo(length(v4));
                getlayout.setCouponId(v4.FastBitmap$CoordinateSystem);
                getlayout.setSplitBillId(v4.hashCode);
                getlayout.setShareActivity(v4.getMax());
            }
            return getlayout;
        }

        private static BeaconParser.BeaconLayoutException length(PhotoPagerListener.V4 v4) {
            BeaconParser.BeaconLayoutException beaconLayoutException = new BeaconParser.BeaconLayoutException();
            beaconLayoutException.setUserId(v4.equals);
            beaconLayoutException.setLoginId(v4.isInside);
            beaconLayoutException.setContactName(v4.toIntRange);
            if (!TextUtils.isEmpty(v4.equals)) {
                beaconLayoutException.setNickname(v4.toFloatRange);
            }
            return beaconLayoutException;
        }
    }

    public final /* synthetic */ Object map(Object obj) {
        List<parseUuidFrom> list;
        getDataFieldCount getdatafieldcount = (getDataFieldCount) obj;
        if (getdatafieldcount != null) {
            List<BluetoothUuid> transferMethod = getdatafieldcount.getTransferMethod();
            if (transferMethod == null || transferMethod.isEmpty()) {
                list = Collections.emptyList();
            } else {
                list = new ArrayList<>();
                for (BluetoothUuid max : transferMethod) {
                    getMax(max, (List<parseUuidFrom>) list);
                }
            }
            for (parseUuidFrom withdrawChannelOptions : list) {
                List<BleResult> withdrawChannelOptions2 = withdrawChannelOptions.getWithdrawChannelOptions();
                if (withdrawChannelOptions2 != null && !withdrawChannelOptions2.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (BleResult next : withdrawChannelOptions2) {
                        BankModel.setMin setmin = new BankModel.setMin();
                        setmin.setMin = next.isEnableStatus();
                        String instId = next.getInstId();
                        BankModel.setMin setmin2 = setmin;
                        String str = "";
                        if (instId == null) {
                            instId = str;
                        }
                        setmin2.setMax = instId;
                        String instLocalName = next.getInstLocalName();
                        BankModel.setMin setmin3 = setmin2;
                        if (instLocalName == null) {
                            instLocalName = str;
                        }
                        setmin3.getMin = instLocalName;
                        String instName = next.getInstName();
                        BankModel.setMin setmin4 = setmin3;
                        if (instName == null) {
                            instName = str;
                        }
                        setmin4.equals = instName;
                        String payMethod = next.getPayMethod();
                        BankModel.setMin setmin5 = setmin4;
                        if (payMethod == null) {
                            payMethod = str;
                        }
                        setmin5.toFloatRange = payMethod;
                        String payOption = next.getPayOption();
                        BankModel.setMin setmin6 = setmin5;
                        if (payOption != null) {
                            str = payOption;
                        }
                        setmin6.toIntRange = str;
                        arrayList.add(setmin6.length());
                    }
                    return arrayList;
                }
            }
        }
        return Collections.emptyList();
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0010 A[LOOP:0: B:5:0x0010->B:8:0x0020, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void getMax(o.BluetoothUuid r1, java.util.List<o.parseUuidFrom> r2) {
        /*
            java.util.List r1 = r1.getWithdrawMethodOptions()
            if (r1 == 0) goto L_0x0022
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0022
            java.util.Iterator r1 = r1.iterator()
        L_0x0010:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r1.next()
            o.parseUuidFrom r0 = (o.parseUuidFrom) r0
            boolean r0 = getMax((o.parseUuidFrom) r0, (java.util.List<o.parseUuidFrom>) r2)
            if (r0 != 0) goto L_0x0010
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SaveImageToAlbumBridgeExtension.getMax(o.BluetoothUuid, java.util.List):void");
    }

    private static boolean getMax(parseUuidFrom parseuuidfrom, List<parseUuidFrom> list) {
        if (!WithdrawMethodOptionResult.WithdrawMethod.WITHDRAW_BANKCARD.equals(parseuuidfrom.getWithdrawMethod())) {
            return false;
        }
        return list.add(parseuuidfrom);
    }
}
