package o;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.RVResourceUtils;

@Singleton
public class getWidthSpec {
    private final String GLOBAL_NETWORK_PREFERENCE;
    private final onSingleFailed preferenceFacade;

    @Inject
    public getWidthSpec(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("production");
        this.GLOBAL_NETWORK_PREFERENCE = sb.toString();
        this.preferenceFacade = new RVResourceUtils(new RVResourceUtils.getMax(context).setPreferenceGroup(this.GLOBAL_NETWORK_PREFERENCE)).createData("local");
    }

    public boolean isGlobalNetworkEnabled() {
        return this.preferenceFacade.getBoolean("gn_feature_switch").booleanValue();
    }

    public String getSelectedCountryCode() {
        String string = this.preferenceFacade.getString("gn_selected_country_code");
        return string == null ? "" : string;
    }

    public List<String> getGnCountriesWhitelist() {
        return (List) this.preferenceFacade.getObject("gn_countries", List.class);
    }

    public String getCountryCode() {
        String string = this.preferenceFacade.getString("gn_country_code");
        return string == null ? "" : string;
    }

    public boolean saveCountryCode(String str) {
        this.preferenceFacade.saveData("gn_country_code", str);
        return true;
    }

    public String getOriginCountryCode() {
        String string = this.preferenceFacade.getString("gn_origin_country_code");
        return string == null ? "" : string;
    }

    public boolean saveOriginCountryCode(String str) {
        this.preferenceFacade.saveData("gn_origin_country_code", str);
        return true;
    }

    public String getCurrentCountryCode() {
        String string = this.preferenceFacade.getString("gn_current_country_code");
        return string == null ? "" : string;
    }

    public boolean saveCurrentCountryCode(String str) {
        this.preferenceFacade.saveData("gn_current_country_code", str);
        return true;
    }

    public initUC7zSo getForexCache(String str) {
        return (initUC7zSo) this.preferenceFacade.getObject("gn_forex_".concat(String.valueOf(str)), initUC7zSo.class);
    }

    public boolean saveForex(initUC7zSo inituc7zso) {
        StringBuilder sb = new StringBuilder("gn_forex_");
        sb.append(inituc7zso.getCurrency());
        this.preferenceFacade.saveData(sb.toString(), inituc7zso);
        return true;
    }

    public boolean getGnWelcomeFirstTime() {
        return this.preferenceFacade.getBoolean("gn_first", true).booleanValue();
    }

    public boolean saveGnWelcomeFirstTime(boolean z) {
        this.preferenceFacade.saveData("gn_first", Boolean.valueOf(z));
        return true;
    }

    public boolean getAlipayConnectServiceFirstTime() {
        return this.preferenceFacade.getBoolean("alipay_service_first", true).booleanValue();
    }

    public boolean saveAlipayConnectServiceFirstTime(boolean z) {
        this.preferenceFacade.saveData("alipay_service_first", Boolean.valueOf(z));
        return true;
    }

    public boolean getGnPayQrTooltipFirstTime() {
        return this.preferenceFacade.getBoolean("gn_pay_qr_tooltip_first", true).booleanValue();
    }

    public boolean saveGnPayQrTooltipFirstTime(boolean z) {
        this.preferenceFacade.saveData("gn_pay_qr_tooltip_first", Boolean.valueOf(z));
        return true;
    }

    public List<addRenderView> getPaymentCodes() {
        return new ArrayList(getPaymentCodeSet());
    }

    public boolean savePaymentCode(String str) {
        Set<addRenderView> paymentCodeSet = getPaymentCodeSet();
        addRenderView addrenderview = new addRenderView(str, new Date(), false);
        paymentCodeSet.remove(addrenderview);
        paymentCodeSet.add(addrenderview);
        savePaymentCodes(paymentCodeSet);
        return true;
    }

    public boolean savePaymentCodes(Set<addRenderView> set) {
        this.preferenceFacade.saveData("gn_payment_results", set);
        return true;
    }

    public Set<addRenderView> getPaymentCodeSet() {
        Set<JSONObject> set = (Set) this.preferenceFacade.getObject("gn_payment_results", HashSet.class);
        if (set == null) {
            set = new HashSet<>();
        }
        HashSet hashSet = new HashSet();
        for (JSONObject jSONObject : set) {
            addRenderView addrenderview = new addRenderView(jSONObject.get("code").toString(), getDateFromStrTimestamp(jSONObject.get("generateDate").toString()), ((Boolean) jSONObject.get("expired")).booleanValue());
            if (!TinyAppInnerProxy.isPaymentExpired(addrenderview)) {
                hashSet.add(addrenderview);
            }
        }
        savePaymentCodes(hashSet);
        return hashSet;
    }

    private Date getDateFromStrTimestamp(String str) {
        return new Date(new Timestamp(Long.parseLong(str)).getTime());
    }

    public void clearAll() {
        this.preferenceFacade.clearAllData();
    }
}
