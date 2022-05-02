package com.iap.ac.android.biz.common.model.multilanguage.resources;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Metadata {
    public Version lastest_versions = new Version();
    public Map<String, List<String>> locales = new HashMap();
    public String static_url;

    public static class Version {
        @Deprecated
        public Map<String, String> data = new HashMap();
        public Map<String, String> i18n = new HashMap();
    }
}
