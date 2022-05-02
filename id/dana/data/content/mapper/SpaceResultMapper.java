package id.dana.data.content.mapper;

import java.util.List;
import javax.inject.Inject;
import o.GriverAMCSLiteAppUpdater;
import o.getContainerHeight;
import o.setNodeId;
import o.setSpeed;

public class SpaceResultMapper extends setSpeed<setNodeId, GriverAMCSLiteAppUpdater> {
    @Inject
    public getContainerHeight contentEntityMapper;

    /* access modifiers changed from: protected */
    public GriverAMCSLiteAppUpdater map(setNodeId setnodeid) {
        return transform(setnodeid);
    }

    private GriverAMCSLiteAppUpdater transform(setNodeId setnodeid) {
        if (setnodeid == null) {
            return null;
        }
        GriverAMCSLiteAppUpdater griverAMCSLiteAppUpdater = new GriverAMCSLiteAppUpdater();
        griverAMCSLiteAppUpdater.setSpaceCode(setnodeid.getSpaceCode());
        griverAMCSLiteAppUpdater.setSpaceName(setnodeid.getSpaceName());
        griverAMCSLiteAppUpdater.setStatus(setnodeid.getStatus());
        griverAMCSLiteAppUpdater.setGmtModified(setnodeid.getGmtModified());
        griverAMCSLiteAppUpdater.setGmtCreate(setnodeid.getGmtCreate());
        griverAMCSLiteAppUpdater.setPlatform(setnodeid.getPlatform());
        griverAMCSLiteAppUpdater.setSpaceType(setnodeid.getSpaceType());
        griverAMCSLiteAppUpdater.setAllowedContent(setnodeid.getAllowedContent());
        griverAMCSLiteAppUpdater.setDisplayStrategy(setnodeid.getDisplayStrategy());
        griverAMCSLiteAppUpdater.setMarqueeTime(setnodeid.getMarqueeTime());
        griverAMCSLiteAppUpdater.setContentNumLimit(setnodeid.getContentNumLimit());
        griverAMCSLiteAppUpdater.setContentTextLimit(setnodeid.getContentTextLimit());
        griverAMCSLiteAppUpdater.setSpm(setnodeid.getSpm());
        griverAMCSLiteAppUpdater.setWhiteList(setnodeid.getWhiteList());
        griverAMCSLiteAppUpdater.setDefaultLang(setnodeid.getDefaultLang());
        griverAMCSLiteAppUpdater.setCdpContents((List) this.contentEntityMapper.apply(setnodeid.getCdpContents()));
        return griverAMCSLiteAppUpdater;
    }
}
