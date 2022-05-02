package o;

import id.dana.model.CdpContentModel;
import java.util.List;

public final class StorageBridgeExtension extends setSpeed<GriverAMCSLiteAppUpdater, internalAPI> {
    public final /* synthetic */ Object map(Object obj) {
        getDefaultProxy getdefaultproxy;
        GriverAMCSLiteAppUpdater griverAMCSLiteAppUpdater = (GriverAMCSLiteAppUpdater) obj;
        CdpContentModel cdpContentModel = null;
        if (griverAMCSLiteAppUpdater == null) {
            return null;
        }
        internalAPI internalapi = new internalAPI();
        internalapi.values = griverAMCSLiteAppUpdater.getSpaceCode();
        internalapi.hashCode = griverAMCSLiteAppUpdater.getSpaceName();
        internalapi.FastBitmap$CoordinateSystem = griverAMCSLiteAppUpdater.getStatus();
        internalapi.equals = griverAMCSLiteAppUpdater.getGmtModified();
        internalapi.isInside = griverAMCSLiteAppUpdater.getGmtCreate();
        internalapi.IsOverlapping = griverAMCSLiteAppUpdater.getPlatform();
        internalapi.toString = griverAMCSLiteAppUpdater.getSpaceType();
        internalapi.length = griverAMCSLiteAppUpdater.getAllowedContent();
        internalapi.toIntRange = griverAMCSLiteAppUpdater.getDisplayStrategy();
        internalapi.toFloatRange = griverAMCSLiteAppUpdater.getMarqueeTime();
        internalapi.setMax = griverAMCSLiteAppUpdater.getContentNumLimit();
        internalapi.getMax = griverAMCSLiteAppUpdater.getContentTextLimit();
        internalapi.toDoubleRange = griverAMCSLiteAppUpdater.getSpm();
        internalapi.invoke = griverAMCSLiteAppUpdater.getWhiteList();
        internalapi.getMin = griverAMCSLiteAppUpdater.getDefaultLang();
        List<getDefaultProxy> cdpContents = griverAMCSLiteAppUpdater.getCdpContents();
        if (!(cdpContents == null || cdpContents.isEmpty() || (getdefaultproxy = cdpContents.get(0)) == null)) {
            cdpContentModel = new CdpContentModel();
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
        }
        internalapi.setMin = cdpContentModel;
        return internalapi;
    }
}
