package com.alipay.alipaysecuritysdk.apdid.face;

import com.alipay.mobile.security.bio.workspace.Env;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

public class Configuration {
    public static final int ENV_MODE_DAILY = 1;
    public static final int ENV_MODE_DEV = 4;
    public static final int ENV_MODE_ONLINE = 0;
    public static final int ENV_MODE_PRE = 2;
    public static final int ENV_MODE_SIT = 3;
    public int envMode;
    public String gateway;
    public List<Header> headers;
    public Locale locale;
    public boolean needUmid;
    public String secret;

    public enum Locale {
        China("China"),
        America("America"),
        Singapore("Singapore"),
        Indonesia("Indonesia"),
        Malaysia("Malaysia"),
        XingHui("XingHui"),
        DefaultSeaIpay("DefaultSeaIpay"),
        VietnamIpay("VietnamIpay"),
        IndonesiaIpay("IndonesiaIpay"),
        MalaysiaIpay("MalaysiaIpay"),
        SingaporeIpay("SingaporeIpay"),
        ThailandIpay("ThailandIpay"),
        PhilippinesIpay("PhilippinesIpay"),
        Ebuckler("Ebuckler"),
        Custom(TrackerKey.KeywordType.CUSTOM);
        
        private String name;

        private Locale(String str) {
            this.name = str;
        }

        public final String getName() {
            return this.name;
        }

        public final void setName(String str) {
            this.name = str;
        }
    }

    public static Configuration getConfiguration(Locale locale2, int i) {
        if (Locale.China == locale2) {
            if (i == 0) {
                return createConfiguration(Locale.China, "https://mobilegw.alipay.com/mgw.htm", i, (Map<String, String>) null, false, "0");
            }
            if (i == 2) {
                return createConfiguration(Locale.China, "https://mobilegwpre.alipay.com/mgw.htm", i, (Map<String, String>) null, false, "0");
            }
            if (i == 1) {
                return createConfiguration(Locale.China, "http://mobilegw.stable.alipay.net/mgw.htm", i, (Map<String, String>) null, false, "0");
            }
            if (i == 3) {
                return createConfiguration(Locale.China, "http://mobilegw-1-64.test.alipay.net/mgw.htm", i, (Map<String, String>) null, false, "0");
            }
            if (i == 4) {
                return createConfiguration(Locale.China, "http://mobilegw.aaa.alipay.net/mgw.htm", i, (Map<String, String>) null, false, "0");
            }
        }
        if (Locale.America == locale2) {
            if (i == 0) {
                return createConfiguration(Locale.America, "https://iclientgw.alipay.com/igw.htm", i, (Map<String, String>) null, false, "1");
            }
            if (i == 2) {
                return createConfiguration(Locale.America, "https://iclientgwpre.alipay.com/imgw.htm", i, (Map<String, String>) null, false, "1");
            }
            if (i == 3) {
                return createConfiguration(Locale.America, "https://iclientgw.test.alipay.net/imgw.htm", i, (Map<String, String>) null, false, "1");
            }
            if (i == 1) {
                return createConfiguration(Locale.America, "https://iclientgw.stable.alipay.net/imgw.htm", i, (Map<String, String>) null, false, "1");
            }
            if (i == 4) {
                return createConfiguration(Locale.America, "http://iclientgw-d9767.alipay.net/imgw.htm", i, (Map<String, String>) null, false, "1");
            }
            throw new IllegalArgumentException("input env mode not supporting it, please invoke Configuration.createConfiguration()");
        } else if (Locale.Singapore == locale2) {
            if (i == 0) {
                return createConfiguration(Locale.Singapore, "https://iclientgw-sea.alipay.com/imgw.htm", i, (Map<String, String>) null, false, "1");
            }
            if (i == 2) {
                return createConfiguration(Locale.Singapore, "https://iclientgwpre.alipay.hk/imgw.htm", i, (Map<String, String>) null, false, "1");
            }
            if (i == 3) {
                return createConfiguration(Locale.America, "https://iclientgw.test.alipay.net/imgw.htm", i, (Map<String, String>) null, false, "1");
            }
            if (i == 1) {
                return createConfiguration(Locale.America, "https://iclientgw.stable.alipay.net/imgw.htm", i, (Map<String, String>) null, false, "1");
            }
            if (i == 4) {
                return createConfiguration(Locale.Singapore, "http://iclientgw-d9767.alipay.net/imgw.htm", i, (Map<String, String>) null, false, "1");
            }
            throw new IllegalArgumentException("input env mode not supporting it, please invoke Configuration.createConfiguration()");
        } else if (Locale.Indonesia == locale2) {
            HashMap hashMap = new HashMap();
            if (i == 0) {
                hashMap.put("workspaceid", "prod");
                hashMap.put("appid", "34CC82C280902");
                return createConfiguration(Locale.Indonesia, "https://mgs-gw.saas.dana.id/mgw.htm", i, hashMap, false, "1");
            } else if (i == 2) {
                hashMap.put("workspaceid", Env.NAME_PRE);
                hashMap.put("appid", "34CC82C280902");
                return createConfiguration(Locale.Indonesia, "https://mgs-gw.saas.dana.id/mgw.htm", i, hashMap, false, "1");
            } else if (i == 4) {
                hashMap.put("workspaceid", "dev");
                hashMap.put("appid", "34CC82C091732");
                return createConfiguration(Locale.Indonesia, "https://mgs-gw.saas.dana.id/mgw.htm", i, hashMap, false, "1");
            } else {
                throw new IllegalArgumentException("input env mode not supporting it, please invoke Configuration.createConfiguration()");
            }
        } else if (Locale.Malaysia == locale2) {
            HashMap hashMap2 = new HashMap();
            if (i == 0) {
                hashMap2.put("workspaceid", "PROD");
                hashMap2.put("appid", "34CC82C012158");
                return createConfiguration(Locale.Malaysia, "https://mpaasgw.tngdigital.com.my/mgw.htm", i, hashMap2, false, (String) null);
            } else if (i == 2) {
                hashMap2.put("workspaceid", "PRE");
                hashMap2.put("appid", "34CC82C012158");
                return createConfiguration(Locale.Malaysia, "https://mpaasgw.tngdigital.com.my/mgw.htm", i, hashMap2, false, (String) null);
            } else if (i == 4) {
                hashMap2.put("workspaceid", "malaysia");
                hashMap2.put("appid", "34CC82C091732");
                return createConfiguration(Locale.Malaysia, "http://11.162.236.241/mgw.htm", i, hashMap2, false, (String) null);
            } else {
                throw new IllegalArgumentException("input env mode not supporting it, please invoke Configuration.createConfiguration()");
            }
        } else if (Locale.XingHui == locale2) {
            HashMap hashMap3 = new HashMap();
            if (i == 0) {
                hashMap3.put("workspaceid", "prod");
                hashMap3.put("appid", "34CC82C211420");
                return createConfiguration(Locale.XingHui, "https://xhmpaasgw.mybank.cn/mgw.htm", i, hashMap3, false, "1");
            } else if (i == 2) {
                hashMap3.put("workspaceid", Env.NAME_PRE);
                hashMap3.put("appid", "34CC82C211420");
                return createConfiguration(Locale.XingHui, "http://110.76.58.49/mgw.htm", i, hashMap3, false, "1");
            } else if (i == 4) {
                hashMap3.put("workspaceid", "dev");
                hashMap3.put("appid", "34CC82C231735");
                return createConfiguration(Locale.XingHui, "http://mpaasgw.58cloud.alipay.net/mgw.htm", i, hashMap3, false, "1");
            } else {
                throw new IllegalArgumentException("input env mode not supporting it, please invoke Configuration.createConfiguration()");
            }
        } else if (Locale.Ebuckler == locale2) {
            HashMap hashMap4 = new HashMap();
            if (i == 0) {
                return createConfiguration(Locale.Ebuckler, "https://mobileapi.ebuckler.com/mgw.htm", i, hashMap4, false, "1");
            }
            throw new IllegalArgumentException("input env mode not supporting it, please invoke Configuration.createConfiguration()");
        } else if (Locale.DefaultSeaIpay == locale2) {
            if (i == 0) {
                return createConfiguration(Locale.DefaultSeaIpay, "https://irisk-sea.alipay.com/idevice/igw.htm", i, (Map<String, String>) null, true, (String) null);
            }
            throw new IllegalArgumentException("input env mode not supporting it, please invoke Configuration.createConfiguration()");
        } else if (Locale.VietnamIpay == locale2) {
            if (i == 0) {
                return createConfiguration(Locale.VietnamIpay, "https://irisk-vn-l.alipay.com/idevice/igw.htm", i, (Map<String, String>) null, true, (String) null);
            }
            throw new IllegalArgumentException("input env mode not supporting it, please invoke Configuration.createConfiguration()");
        } else if (Locale.IndonesiaIpay == locale2) {
            if (i == 0) {
                return createConfiguration(Locale.IndonesiaIpay, "https://irisk-id-l.alipay.com/idevice/igw.htm", i, (Map<String, String>) null, true, (String) null);
            }
            throw new IllegalArgumentException("input env mode not supporting it, please invoke Configuration.createConfiguration()");
        } else if (Locale.MalaysiaIpay == locale2) {
            if (i == 0) {
                return createConfiguration(Locale.MalaysiaIpay, "https://irisk-my-l.alipay.com/idevice/igw.htm", i, (Map<String, String>) null, true, (String) null);
            }
            throw new IllegalArgumentException("input env mode not supporting it, please invoke Configuration.createConfiguration()");
        } else if (Locale.SingaporeIpay == locale2) {
            if (i == 0) {
                return createConfiguration(Locale.SingaporeIpay, "https://irisk-sg-l.alipay.com/idevice/igw.htm", i, (Map<String, String>) null, true, (String) null);
            }
            throw new IllegalArgumentException("input env mode not supporting it, please invoke Configuration.createConfiguration()");
        } else if (Locale.ThailandIpay == locale2) {
            if (i == 0) {
                return createConfiguration(Locale.ThailandIpay, "https://irisk-th-l.alipay.com/idevice/igw.htm", i, (Map<String, String>) null, true, (String) null);
            }
            throw new IllegalArgumentException("input env mode not supporting it, please invoke Configuration.createConfiguration()");
        } else if (Locale.PhilippinesIpay != locale2) {
            throw new IllegalArgumentException("input locale not supporting it, please invoke Configuration.createConfiguration()");
        } else if (i == 0) {
            return createConfiguration(Locale.PhilippinesIpay, "https://irisk-ph-l.alipay.com/idevice/igw.htm", i, (Map<String, String>) null, true, (String) null);
        } else {
            throw new IllegalArgumentException("input env mode not supporting it, please invoke Configuration.createConfiguration()");
        }
    }

    public static Configuration createConfiguration(String str, int i, Map<String, String> map, boolean z, String str2) {
        return createConfiguration(Locale.Custom, str, i, map, z, str2);
    }

    private static Configuration createConfiguration(Locale locale2, String str, int i, Map<String, String> map, boolean z, String str2) {
        Configuration configuration = new Configuration();
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                arrayList.add(new BasicHeader((String) next.getKey(), (String) next.getValue()));
            }
        }
        configuration.locale = locale2;
        configuration.gateway = str;
        configuration.headers = arrayList;
        configuration.needUmid = z;
        configuration.secret = str2;
        configuration.envMode = i;
        return configuration;
    }
}
