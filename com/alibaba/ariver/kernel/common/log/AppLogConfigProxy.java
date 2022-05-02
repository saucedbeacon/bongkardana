package com.alibaba.ariver.kernel.common.log;

import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;
import java.util.Set;

@DefaultImpl("com.alibaba.ariver.kernel.common.log.DefaultAppLogConfigProxyImpl")
public interface AppLogConfigProxy extends Proxiable {
    Set<String> getIgnoreAPIList();

    Set<String> getIgnoreEventList();

    Set<String> getIgnoreInputAPIList();

    Set<String> getIgnoreOutputAPIList();
}
