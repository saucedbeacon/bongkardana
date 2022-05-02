package id.dana.data.content.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.generateNodeId;
import o.getContainerHeight;
import o.getDefaultProxy;
import o.setNodeId;
import o.setSpeed;

public class ContentsMapper extends setSpeed<setNodeId, List<getDefaultProxy>> {
    @Inject
    public getContainerHeight contentEntityMapper;

    /* access modifiers changed from: protected */
    public List<getDefaultProxy> map(setNodeId setnodeid) {
        return transform(setnodeid.getCdpContents());
    }

    private List<getDefaultProxy> transform(List<generateNodeId> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (generateNodeId next : list) {
                getDefaultProxy getdefaultproxy = new getDefaultProxy();
                getdefaultproxy.setContentId(next.getContentId());
                getdefaultproxy.setContentName(next.getContentName());
                getdefaultproxy.setContentType(next.getContentType());
                getdefaultproxy.setContentValue(next.getContentValue());
                getdefaultproxy.setRedirectUrl(next.getRedirectUrl());
                getdefaultproxy.setSpaceCode(next.getSpaceCode());
                getdefaultproxy.setEnvType(next.getEnvType());
                getdefaultproxy.setStatus(next.getStatus());
                getdefaultproxy.setTenantId(next.getTenantId());
                getdefaultproxy.setLanguage(next.getLanguage());
                getdefaultproxy.setGmtModified(next.getGmtModified());
                getdefaultproxy.setGmtCreate(next.getGmtCreate());
                getdefaultproxy.setPriority(next.getPriority());
                getdefaultproxy.setEffectiveDate(next.getEffectiveDate());
                getdefaultproxy.setExpireDate(next.getExpireDate());
                getdefaultproxy.setSelectRule(next.getSelectRule());
                getdefaultproxy.setBizType(next.getBizType());
                arrayList.add(getdefaultproxy);
            }
        }
        return arrayList;
    }
}
