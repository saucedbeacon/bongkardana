package com.alipay.mobile.security.bio.runtime;

import android.content.Context;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.mobile.security.bio.service.BioMetaInfo;
import com.alipay.mobile.security.bio.service.BioServiceDescription;
import com.alipay.mobile.security.bio.service.local.NotImplementedException;
import com.alipay.mobile.security.bio.utils.StringUtil;
import java.util.List;

public class ModuleDesc {
    @JSONField(name = "local_services")
    public List<LocalServiceDesc> localServiceDescs;
    public List<BioMetaInfo> mBioMetaInfoList;
    public List<BioServiceDescription> mBioServiceDescription;
    public String mBundleName;
    @JSONField(name = "meta_info")
    public List<String> metaInfoList;

    public String toString() {
        StringBuilder sb = new StringBuilder("ModuleDesc{metaInfoList=");
        sb.append(StringUtil.collection2String(this.metaInfoList));
        sb.append(", localServiceDescs=");
        sb.append(StringUtil.collection2String(this.localServiceDescs));
        sb.append('}');
        return sb.toString();
    }

    public static class LocalServiceDesc {
        @JSONField(name = "class")
        public String className;
        @JSONField(name = "interface")
        public String interfaceName;
        @JSONField(name = "essential")
        public boolean isEssential = true;
        @JSONField(name = "lazy")
        public boolean isLazy = true;

        public String toString() {
            StringBuilder sb = new StringBuilder("LocalServiceDesc{interfaceName='");
            sb.append(this.interfaceName);
            sb.append('\'');
            sb.append(", isEssential=");
            sb.append(this.isEssential);
            sb.append(", className='");
            sb.append(this.className);
            sb.append('\'');
            sb.append(", isLazy=");
            sb.append(this.isLazy);
            sb.append('}');
            return sb.toString();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.alipay.mobile.security.bio.runtime.ModuleDesc} */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0 = com.alipay.mobile.security.bio.utils.FileUtil.getAssetsData((r0 = com.alipay.mobile.security.bio.runtime.Runtime.getResourcesByBundleName(r6.bundleName)), r6.configFileName);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.alipay.mobile.security.bio.runtime.ModuleDesc create(android.content.Context r4, boolean r5, com.alipay.mobile.security.bio.runtime.FrameworkDesc.ConfigDesc r6) {
        /*
            java.lang.String r0 = r6.bundleName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0028
            boolean r0 = r6.dynamic
            if (r0 == 0) goto L_0x0028
            if (r5 == 0) goto L_0x0028
            java.lang.String r0 = r6.bundleName
            android.content.res.Resources r0 = com.alipay.mobile.security.bio.runtime.Runtime.getResourcesByBundleName(r0)
            if (r0 == 0) goto L_0x0028
            java.lang.String r2 = r6.configFileName
            byte[] r0 = com.alipay.mobile.security.bio.utils.FileUtil.getAssetsData((android.content.res.Resources) r0, (java.lang.String) r2)
            if (r0 == 0) goto L_0x0028
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0028
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            goto L_0x0029
        L_0x0028:
            r2 = r1
        L_0x0029:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0043
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r3 = r6.configFileName
            byte[] r0 = com.alipay.mobile.security.bio.utils.FileUtil.getAssetsData((android.content.res.Resources) r0, (java.lang.String) r3)
            if (r0 == 0) goto L_0x0043
            int r3 = r0.length
            if (r3 <= 0) goto L_0x0043
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
        L_0x0043:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00ed
            java.lang.Class<com.alipay.mobile.security.bio.runtime.ModuleDesc> r0 = com.alipay.mobile.security.bio.runtime.ModuleDesc.class
            java.lang.Object r0 = com.alibaba.fastjson.JSON.parseObject((java.lang.String) r2, r0)
            r1 = r0
            com.alipay.mobile.security.bio.runtime.ModuleDesc r1 = (com.alipay.mobile.security.bio.runtime.ModuleDesc) r1
            java.lang.String r0 = r6.bundleName
            r1.mBundleName = r0
            java.util.List<java.lang.String> r0 = r1.metaInfoList
            if (r0 == 0) goto L_0x008d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x008d
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<java.lang.String> r2 = r1.metaInfoList
            int r2 = r2.size()
            r0.<init>(r2)
            r1.mBioMetaInfoList = r0
            java.util.List<java.lang.String> r0 = r1.metaInfoList
            java.util.Iterator r0 = r0.iterator()
        L_0x0073:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x008d
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = r6.bundleName
            com.alipay.mobile.security.bio.service.BioMetaInfo r2 = createMetaInfo(r4, r5, r2, r3)
            if (r2 == 0) goto L_0x0073
            java.util.List<com.alipay.mobile.security.bio.service.BioMetaInfo> r3 = r1.mBioMetaInfoList
            r3.add(r2)
            goto L_0x0073
        L_0x008d:
            java.util.List<com.alipay.mobile.security.bio.runtime.ModuleDesc$LocalServiceDesc> r0 = r1.localServiceDescs
            if (r0 == 0) goto L_0x00ed
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ed
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<com.alipay.mobile.security.bio.runtime.ModuleDesc$LocalServiceDesc> r2 = r1.localServiceDescs
            int r2 = r2.size()
            r0.<init>(r2)
            r1.mBioServiceDescription = r0
            java.util.List<com.alipay.mobile.security.bio.runtime.ModuleDesc$LocalServiceDesc> r0 = r1.localServiceDescs
            java.util.Iterator r0 = r0.iterator()
        L_0x00aa:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00ed
            java.lang.Object r2 = r0.next()
            com.alipay.mobile.security.bio.runtime.ModuleDesc$LocalServiceDesc r2 = (com.alipay.mobile.security.bio.runtime.ModuleDesc.LocalServiceDesc) r2
            boolean r3 = r2.isEssential
            if (r3 == 0) goto L_0x00bf
            java.lang.String r3 = r2.className
            android.text.TextUtils.isEmpty(r3)
        L_0x00bf:
            java.lang.String r3 = r2.className
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00dd
            java.lang.String r3 = r2.interfaceName
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00dd
            java.lang.String r3 = r6.bundleName
            com.alipay.mobile.security.bio.service.BioServiceDescription r2 = createBioServiceDescription(r4, r5, r2, r3)
            if (r2 == 0) goto L_0x00aa
            java.util.List<com.alipay.mobile.security.bio.service.BioServiceDescription> r3 = r1.mBioServiceDescription
            r3.add(r2)
            goto L_0x00aa
        L_0x00dd:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = java.lang.String.valueOf(r2)
            java.lang.String r6 = "Invalid LocalServiceDesc: "
            java.lang.String r5 = r6.concat(r5)
            r4.<init>(r5)
            throw r4
        L_0x00ed:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.runtime.ModuleDesc.create(android.content.Context, boolean, com.alipay.mobile.security.bio.runtime.FrameworkDesc$ConfigDesc):com.alipay.mobile.security.bio.runtime.ModuleDesc");
    }

    private static BioMetaInfo createMetaInfo(Context context, boolean z, String str, String str2) {
        try {
            return (BioMetaInfo) Runtime.loadClass(context, z, str, str2).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    private static BioServiceDescription createBioServiceDescription(Context context, boolean z, LocalServiceDesc localServiceDesc, String str) {
        try {
            Class<?> loadClass = Runtime.loadClass(context, z, localServiceDesc.className, str);
            if (loadClass != null) {
                BioServiceDescription bioServiceDescription = new BioServiceDescription();
                try {
                    bioServiceDescription.setClazz(loadClass);
                    bioServiceDescription.setInterfaceName(localServiceDesc.interfaceName);
                    bioServiceDescription.setLazy(localServiceDesc.isLazy);
                    return bioServiceDescription;
                } catch (Throwable unused) {
                    return bioServiceDescription;
                }
            } else {
                throw new NotImplementedException();
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
