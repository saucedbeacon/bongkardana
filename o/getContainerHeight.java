package o;

import java.util.ArrayList;
import java.util.List;

public class getContainerHeight extends setSpeed<List<generateNodeId>, List<getDefaultProxy>> {
    /* access modifiers changed from: protected */
    public List<getDefaultProxy> map(List<generateNodeId> list) {
        return transform(list);
    }

    private List<getDefaultProxy> transform(List<generateNodeId> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (generateNodeId transform : list) {
            arrayList.add(transform(transform));
        }
        return arrayList;
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
        getdefaultproxy.setContentName(generatenodeid.getContentName());
        getdefaultproxy.setLanguage(generatenodeid.getLanguage());
        getdefaultproxy.setGmtModified(generatenodeid.getGmtModified());
        getdefaultproxy.setGmtCreate(generatenodeid.getGmtCreate());
        getdefaultproxy.setPriority(generatenodeid.getPriority());
        getdefaultproxy.setEffectiveDate(generatenodeid.getEffectiveDate());
        getdefaultproxy.setExpireDate(generatenodeid.getExpireDate());
        getdefaultproxy.setSelectRule(generatenodeid.getSelectRule());
        getdefaultproxy.setBizType(generatenodeid.getBizType());
        getdefaultproxy.setExtendInfo(generatenodeid.getExtendInfo());
        return getdefaultproxy;
    }
}
