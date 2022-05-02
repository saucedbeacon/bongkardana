package o;

import id.dana.model.CdpContentModel;
import java.util.ArrayList;
import java.util.List;

public final class getSharedPreferenceForApp extends setSpeed<GriverAMCSLiteAppUpdater, LoadingBridgeExtension> {
    public final /* synthetic */ Object map(Object obj) {
        return length((GriverAMCSLiteAppUpdater) obj);
    }

    static LoadingBridgeExtension length(GriverAMCSLiteAppUpdater griverAMCSLiteAppUpdater) {
        if (griverAMCSLiteAppUpdater == null) {
            return null;
        }
        LoadingBridgeExtension loadingBridgeExtension = new LoadingBridgeExtension();
        loadingBridgeExtension.hashCode = griverAMCSLiteAppUpdater.getSpaceCode();
        loadingBridgeExtension.values = griverAMCSLiteAppUpdater.getSpaceName();
        loadingBridgeExtension.toString = griverAMCSLiteAppUpdater.getStatus();
        loadingBridgeExtension.toIntRange = griverAMCSLiteAppUpdater.getGmtModified();
        loadingBridgeExtension.IsOverlapping = griverAMCSLiteAppUpdater.getGmtCreate();
        loadingBridgeExtension.equals = griverAMCSLiteAppUpdater.getPlatform();
        loadingBridgeExtension.FastBitmap$CoordinateSystem = griverAMCSLiteAppUpdater.getSpaceType();
        loadingBridgeExtension.length = griverAMCSLiteAppUpdater.getAllowedContent();
        loadingBridgeExtension.toFloatRange = griverAMCSLiteAppUpdater.getDisplayStrategy();
        loadingBridgeExtension.isInside = griverAMCSLiteAppUpdater.getMarqueeTime();
        loadingBridgeExtension.setMax = griverAMCSLiteAppUpdater.getContentNumLimit();
        loadingBridgeExtension.getMin = griverAMCSLiteAppUpdater.getContentTextLimit();
        loadingBridgeExtension.toDoubleRange = griverAMCSLiteAppUpdater.getSpm();
        loadingBridgeExtension.Mean$Arithmetic = griverAMCSLiteAppUpdater.getWhiteList();
        loadingBridgeExtension.getMax = griverAMCSLiteAppUpdater.getDefaultLang();
        loadingBridgeExtension.setMin = setMax(griverAMCSLiteAppUpdater.getCdpContents());
        return loadingBridgeExtension;
    }

    private static List<CdpContentModel> setMax(List<getDefaultProxy> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (getDefaultProxy max : list) {
            arrayList.add(getMax(max));
        }
        return arrayList;
    }

    private static CdpContentModel getMax(getDefaultProxy getdefaultproxy) {
        if (getdefaultproxy == null) {
            return null;
        }
        CdpContentModel cdpContentModel = new CdpContentModel();
        cdpContentModel.getMin = getdefaultproxy.getContentId();
        cdpContentModel.getMax = getdefaultproxy.getContentName();
        cdpContentModel.setMin = getdefaultproxy.getContentType();
        cdpContentModel.setMax = getdefaultproxy.getContentValue();
        cdpContentModel.toDoubleRange = getdefaultproxy.getRedirectUrl();
        cdpContentModel.hashCode = getdefaultproxy.getSpaceCode();
        cdpContentModel.equals = getdefaultproxy.getEnvType();
        cdpContentModel.invokeSuspend = getdefaultproxy.getStatus();
        cdpContentModel.invoke = getdefaultproxy.getTenantId();
        cdpContentModel.getMax = getdefaultproxy.getContentName();
        cdpContentModel.values = getdefaultproxy.getLanguage();
        cdpContentModel.toFloatRange = getdefaultproxy.getGmtModified();
        cdpContentModel.toIntRange = getdefaultproxy.getGmtCreate();
        cdpContentModel.toString = getdefaultproxy.getPriority();
        cdpContentModel.IsOverlapping = getdefaultproxy.getEffectiveDate();
        cdpContentModel.isInside = getdefaultproxy.getExpireDate();
        cdpContentModel.FastBitmap$CoordinateSystem = getdefaultproxy.getSelectRule();
        cdpContentModel.length = getdefaultproxy.getBizType();
        cdpContentModel.onMessageChannelReady = getdefaultproxy.getExtendInfo();
        return cdpContentModel;
    }
}
