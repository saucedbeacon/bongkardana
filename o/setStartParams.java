package o;

import id.dana.domain.profilemenu.model.SettingModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Singleton;

@Singleton
public class setStartParams {
    public LinkedHashMap<String, LinkedHashMap<String, SettingModel>> transform(LinkedHashMap<String, LinkedHashMap<String, getActivityClz>> linkedHashMap) {
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return null;
        }
        LinkedHashMap<String, LinkedHashMap<String, SettingModel>> linkedHashMap2 = new LinkedHashMap<>();
        for (Map.Entry next : linkedHashMap.entrySet()) {
            linkedHashMap2.put((String) next.getKey(), transforms((LinkedHashMap) next.getValue()));
        }
        return linkedHashMap2;
    }

    public LinkedHashMap<String, SettingModel> transforms(LinkedHashMap<String, getActivityClz> linkedHashMap) {
        if (linkedHashMap == null) {
            return null;
        }
        LinkedHashMap<String, SettingModel> linkedHashMap2 = new LinkedHashMap<>();
        for (Map.Entry next : linkedHashMap.entrySet()) {
            String str = (String) next.getKey();
            linkedHashMap2.put(str, transform(str, (getActivityClz) next.getValue()));
        }
        return linkedHashMap2;
    }

    public SettingModel transform(String str, getActivityClz getactivityclz) {
        if (getactivityclz == null) {
            return null;
        }
        SettingModel settingModel = new SettingModel();
        settingModel.setName(str);
        settingModel.setTitle(getactivityclz.getTitle());
        settingModel.setSubtitle(getactivityclz.getSubtitle());
        settingModel.setSubtitleIsBelow(getactivityclz.getSubtitleIsBelow());
        settingModel.setSubtitleType(getactivityclz.getSubtitleType());
        settingModel.setSubtitleColor(getactivityclz.getSubtitleColor());
        settingModel.setIconUrl(getactivityclz.getIconUrl());
        settingModel.setEnable(getactivityclz.isEnable());
        settingModel.setAction(getactivityclz.getAction());
        settingModel.setRedirectUrl(getactivityclz.getRedirectUrl());
        settingModel.setCollection(getactivityclz.getCollection());
        return settingModel;
    }

    public getSharedPreference transform(createScheduleExtensionInvoker createscheduleextensioninvoker) {
        if (createscheduleextensioninvoker == null) {
            return null;
        }
        getSharedPreference getsharedpreference = new getSharedPreference();
        getsharedpreference.setAuthenticationFeatureStatus(createscheduleextensioninvoker.authenticationFeatureStatus);
        getsharedpreference.setAuthenticationStatus(createscheduleextensioninvoker.authenticationStatus);
        ArrayList arrayList = new ArrayList();
        for (rebind transform : createscheduleextensioninvoker.authenticationSettingOptions) {
            arrayList.add(transform(transform));
        }
        getsharedpreference.setAuthenticationTypeOption(arrayList);
        return getsharedpreference;
    }

    public getUid transform(IpcCallClientHelper ipcCallClientHelper) {
        if (ipcCallClientHelper == null) {
            return null;
        }
        getUid getuid = new getUid();
        getuid.setRisk(transform(ipcCallClientHelper.riskResult));
        getuid.setSecurityContext(transform(ipcCallClientHelper.securityContext));
        return getuid;
    }

    public containNebulaAddcors transform(rebind rebind) {
        if (rebind == null) {
            return null;
        }
        containNebulaAddcors containnebulaaddcors = new containNebulaAddcors();
        containnebulaaddcors.setAuthenticationType(rebind.authenticationType);
        return containnebulaaddcors;
    }

    public getWebViewType transform(waitBindedIfNeed waitbindedifneed) {
        if (waitbindedifneed == null) {
            return null;
        }
        getWebViewType getwebviewtype = new getWebViewType();
        getwebviewtype.setSecurityId(waitbindedifneed.securityId);
        getwebviewtype.setResult(waitbindedifneed.result);
        getwebviewtype.setVerificationMethod(waitbindedifneed.verificationMethod);
        return getwebviewtype;
    }

    public H5WebViewChoose transform(RemoteCallClient remoteCallClient) {
        if (remoteCallClient == null) {
            return null;
        }
        H5WebViewChoose h5WebViewChoose = new H5WebViewChoose();
        h5WebViewChoose.setPubKey(remoteCallClient.pubKey);
        return h5WebViewChoose;
    }
}
