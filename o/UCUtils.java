package o;

import java.util.List;
import o.ToastUtils;

public class UCUtils {
    private List<addExtraDataParser> addPayMethods;
    private List<getAbsoluteUrlV2> payCardOptionViews;
    private List<ToastUtils.TYPE> payChannelOptionViews;
    private String payMethod;

    public List<getAbsoluteUrlV2> getPayCardOptionViews() {
        return this.payCardOptionViews;
    }

    public void setPayCardOptionViews(List<getAbsoluteUrlV2> list) {
        this.payCardOptionViews = list;
    }

    public List<ToastUtils.TYPE> getPayChannelOptionViews() {
        return this.payChannelOptionViews;
    }

    public void setPayChannelOptionViews(List<ToastUtils.TYPE> list) {
        this.payChannelOptionViews = list;
    }

    public List<addExtraDataParser> getAddPayMethods() {
        return this.addPayMethods;
    }

    public void setAddPayMethods(List<addExtraDataParser> list) {
        this.addPayMethods = list;
    }

    public String getPayMethod() {
        return this.payMethod;
    }

    public void setPayMethod(String str) {
        this.payMethod = str;
    }

    public int hashCode() {
        List<getAbsoluteUrlV2> list = this.payCardOptionViews;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<ToastUtils.TYPE> list2 = this.payChannelOptionViews;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<addExtraDataParser> list3 = this.addPayMethods;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str = this.payMethod;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UCUtils)) {
            return false;
        }
        UCUtils uCUtils = (UCUtils) obj;
        List<getAbsoluteUrlV2> list = this.payCardOptionViews;
        if (list == null ? uCUtils.payCardOptionViews != null : !list.equals(uCUtils.payCardOptionViews)) {
            return false;
        }
        List<ToastUtils.TYPE> list2 = this.payChannelOptionViews;
        if (list2 == null ? uCUtils.payChannelOptionViews != null : !list2.equals(uCUtils.payChannelOptionViews)) {
            return false;
        }
        List<addExtraDataParser> list3 = this.addPayMethods;
        if (list3 == null ? uCUtils.addPayMethods != null : !list3.equals(uCUtils.addPayMethods)) {
            return false;
        }
        String str = this.payMethod;
        String str2 = uCUtils.payMethod;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }
}
