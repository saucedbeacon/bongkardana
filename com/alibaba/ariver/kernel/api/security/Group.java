package com.alibaba.ariver.kernel.api.security;

import java.util.Map;

public interface Group {
    void assignPermissions(Map<String, ? extends Permission> map);

    String description();

    String groupName();

    Map<String, ? extends Permission> permissions();
}
