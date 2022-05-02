package o;

import o.RVProxy;

public class EventTrackStore {
    public appxrpc transformMyReferral(doInitialize doinitialize) {
        if (doinitialize == null) {
            return null;
        }
        appxrpc appxrpc = new appxrpc();
        uncheckAllItems.transform(appxrpc, doinitialize);
        appxrpc.setHowToUrl(doinitialize.getHowToUrl());
        appxrpc.setReferralCode(doinitialize.getReferralCode());
        appxrpc.setReferrerCampaignInfo(transFormCampaign(doinitialize.getReferrerCampaignInfo()));
        appxrpc.setReferredCampaignInfo(transFormCampaign(doinitialize.getReferredCampaignInfo()));
        appxrpc.setCampaignUpdated(doinitialize.isCampaignUpdated());
        return appxrpc;
    }

    private getUserInfo transFormCampaign(RVProxy.Printer printer) {
        if (printer == null) {
            return null;
        }
        getUserInfo getuserinfo = new getUserInfo();
        getuserinfo.setPrizeName(printer.getPrizeName());
        getuserinfo.setCampaignId(printer.getActivityId());
        getuserinfo.setCampaignEnabled(printer.isCampaignEnabled());
        getuserinfo.setPrizeAmount(printer.getPrizeAmount());
        return getuserinfo;
    }
}
