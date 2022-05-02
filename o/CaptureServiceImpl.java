package o;

import id.dana.pay.PayCardInfo;
import id.dana.richview.boundcard.model.BoundCard;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.ToastUtils;

public class CaptureServiceImpl {

    public class CaptureSession implements Serializable {
        private Boolean enableStatus;
        private String instId;
        private String instName;
        private Boolean interBank;
        private String payOption;

        public Boolean getEnableStatus() {
            return this.enableStatus;
        }

        public void setEnableStatus(Boolean bool) {
            this.enableStatus = bool;
        }

        public String getInstId() {
            return this.instId;
        }

        public void setInstId(String str) {
            this.instId = str;
        }

        public String getInstName() {
            return this.instName;
        }

        public void setInstName(String str) {
            this.instName = str;
        }

        public Boolean getInterBank() {
            return this.interBank;
        }

        public void setInterBank(Boolean bool) {
            this.interBank = bool;
        }

        public String getPayOption() {
            return this.payOption;
        }

        public void setPayOption(String str) {
            this.payOption = str;
        }
    }

    @Inject
    CaptureServiceImpl() {
    }

    public static BoundCard setMax(getPowerCorrection getpowercorrection) {
        BoundCard boundCard = new BoundCard();
        boundCard.length = getpowercorrection.getAmount();
        boundCard.getMin = getpowercorrection.getCurrency();
        boundCard.toDoubleRange = getpowercorrection.getPayeeMaskedPhoneNumber();
        boundCard.toString = getpowercorrection.getKyc().getLevel();
        boundCard.FastBitmap$CoordinateSystem = "BALANCE";
        return boundCard;
    }

    public static List<CaptureSession> setMax(List<ToastUtils.TYPE> list) {
        ArrayList arrayList = new ArrayList();
        for (ToastUtils.TYPE next : list) {
            CaptureSession captureSession = null;
            if (next != null) {
                captureSession = new CaptureSession();
                captureSession.setEnableStatus(Boolean.valueOf(next.isEnableStatus()));
                captureSession.setInstId(next.getInstId());
                captureSession.setInstName(next.getInstName());
                captureSession.setPayOption(next.getPayOption());
            }
            arrayList.add(captureSession);
        }
        return arrayList;
    }

    public static List<BoundCard> setMax(List<PayCardInfo> list, getPagePerfKey getpageperfkey) {
        BoundCard boundCard;
        ArrayList arrayList = new ArrayList();
        BoundCard boundCard2 = new BoundCard();
        boundCard2.FastBitmap$CoordinateSystem = "BALANCE";
        if (getpageperfkey != null) {
            boundCard2.length = getpageperfkey.getMax.getMax;
            boundCard2.getMin = getpageperfkey.getMax.length;
            boundCard2.toString = getpageperfkey.setMax.getMax;
        }
        arrayList.add(boundCard2);
        for (PayCardInfo next : list) {
            if (next != null) {
                boundCard = new BoundCard();
                boundCard.toDoubleRange = next.isInside;
                boundCard.setMin = next.getMin;
                boundCard.equals = next.length;
                boundCard.toFloatRange = next.toIntRange;
                boundCard.IsOverlapping = next.IsOverlapping;
                boundCard.getMax = next.setMin;
                boundCard.isInside = next.toFloatRange;
                boundCard.FastBitmap$CoordinateSystem = next.FastBitmap$CoordinateSystem;
                boundCard.hashCode = next.getMax();
                boundCard.setMax = next.getMax;
            } else {
                boundCard = null;
            }
            arrayList.add(boundCard);
        }
        return arrayList;
    }
}
