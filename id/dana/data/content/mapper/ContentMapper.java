package id.dana.data.content.mapper;

import javax.inject.Inject;
import o.generateNodeId;
import o.getContainerHeight;
import o.getDefaultProxy;
import o.setNodeId;
import o.setSpeed;

public class ContentMapper extends setSpeed<setNodeId, getDefaultProxy> {
    @Inject
    public getContainerHeight contentEntityMapper;

    /* access modifiers changed from: protected */
    public getDefaultProxy map(setNodeId setnodeid) {
        return transform(setnodeid.getCdpContents().get(0));
    }

    private getDefaultProxy transform(generateNodeId generatenodeid) {
        if (generatenodeid == null) {
            return null;
        }
        getDefaultProxy getdefaultproxy = new getDefaultProxy();
        getdefaultproxy.setContentId(generatenodeid.getContentId());
        getdefaultproxy.setContentName(generatenodeid.getContentName());
        getdefaultproxy.setContentType(generatenodeid.getContentType());
        getdefaultproxy.setContentValue(generatenodeid.getContentValue());
        getdefaultproxy.setRedirectUrl(generatenodeid.getRedirectUrl());
        getdefaultproxy.setSpaceCode(generatenodeid.getSpaceCode());
        getdefaultproxy.setEnvType(generatenodeid.getEnvType());
        getdefaultproxy.setStatus(generatenodeid.getStatus());
        getdefaultproxy.setTenantId(generatenodeid.getTenantId());
        getdefaultproxy.setLanguage(generatenodeid.getLanguage());
        getdefaultproxy.setGmtModified(generatenodeid.getGmtModified());
        getdefaultproxy.setGmtCreate(generatenodeid.getGmtCreate());
        getdefaultproxy.setPriority(generatenodeid.getPriority());
        getdefaultproxy.setEffectiveDate(generatenodeid.getEffectiveDate());
        getdefaultproxy.setExpireDate(generatenodeid.getExpireDate());
        getdefaultproxy.setSelectRule(generatenodeid.getSelectRule());
        getdefaultproxy.setBizType(generatenodeid.getBizType());
        return getdefaultproxy;
    }
}
