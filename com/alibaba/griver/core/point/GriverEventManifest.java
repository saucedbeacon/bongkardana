package com.alibaba.griver.core.point;

import com.alibaba.ariver.kernel.api.node.Scope;
import java.util.List;

public class GriverEventManifest {
    private List<String> eventClassNames;
    private String handlerClassName;
    private Class<? extends Scope> scope;

    public GriverEventManifest(String str, List<String> list, Class<? extends Scope> cls) {
        this.handlerClassName = str;
        this.eventClassNames = list;
        this.scope = cls;
    }

    public String getHandlerClassName() {
        return this.handlerClassName;
    }

    public void setHandlerClassName(String str) {
        this.handlerClassName = str;
    }

    public List<String> getEventClassNames() {
        return this.eventClassNames;
    }

    public void setEventClassNames(List<String> list) {
        this.eventClassNames = list;
    }

    public Class<? extends Scope> getScope() {
        return this.scope;
    }

    public void setScope(Class<? extends Scope> cls) {
        this.scope = cls;
    }
}
