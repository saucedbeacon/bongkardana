package o;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import id.dana.model.CurrencyAmountModel;
import id.dana.splitbill.model.PayerModel;
import id.dana.splitbill.model.SplitBillModel;
import java.util.ArrayList;
import java.util.List;

public final class setSingleItemHeight extends setSpeed<fillPageCommonInfo, SplitBillModel> {
    private PluginInstallCallback setMax = new PluginInstallCallback();

    public final /* synthetic */ Object map(Object obj) {
        fillPageCommonInfo fillpagecommoninfo = (fillPageCommonInfo) obj;
        if (fillpagecommoninfo == null || fillpagecommoninfo.getBizInfo() == null) {
            return null;
        }
        postWebViewMessage bizInfo = fillpagecommoninfo.getBizInfo();
        SplitBillModel splitBillModel = new SplitBillModel();
        splitBillModel.isInside = bizInfo.onNavigationEvent;
        splitBillModel.IsOverlapping = bizInfo.create;
        splitBillModel.setMax = bizInfo.values;
        splitBillModel.getMin = new CurrencyAmountModel(bizInfo.FastBitmap$CoordinateSystem);
        JSONArray jSONArray = new JSONArray((List<Object>) JSON.parseArray(bizInfo.Mean$Arithmetic));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            MessagePopItem messagePopItem = (MessagePopItem) this.setMax.deserialize(jSONArray.getString(i), MessagePopItem.class);
            arrayList.add(new PayerModel(messagePopItem.getAvatarUrl(), new CurrencyAmountModel(messagePopItem.getFundAmount()), messagePopItem.getLoginId(), messagePopItem.getName(), messagePopItem.getUserId(), messagePopItem.getStatus()));
        }
        splitBillModel.setMin = arrayList;
        List<PayerModel> list = splitBillModel.setMin;
        if (TextUtils.isEmpty(bizInfo.b)) {
            splitBillModel.equals = getMin(fillpagecommoninfo);
        } else {
            int parseInt = Integer.parseInt(bizInfo.b);
            if (list.size() > parseInt) {
                splitBillModel.getMax = parseInt;
                list.get(parseInt).toFloatRange = true;
                splitBillModel.equals = list.get(parseInt);
            }
        }
        if (TextUtils.isEmpty(bizInfo.ICustomTabsCallback)) {
            splitBillModel.toIntRange = getMin(fillpagecommoninfo);
        } else {
            int parseInt2 = Integer.parseInt(bizInfo.ICustomTabsCallback);
            if (list.size() > parseInt2) {
                splitBillModel.length = parseInt2;
                list.get(parseInt2).isInside = true;
                splitBillModel.toIntRange = list.get(parseInt2);
            }
        }
        return splitBillModel;
    }

    private static PayerModel getMin(fillPageCommonInfo fillpagecommoninfo) {
        return new PayerModel(fillpagecommoninfo.getAvatarUrl(), new CurrencyAmountModel("0"), fillpagecommoninfo.getMobileNumber(), fillpagecommoninfo.getNickname(), fillpagecommoninfo.getReceiverId());
    }
}
