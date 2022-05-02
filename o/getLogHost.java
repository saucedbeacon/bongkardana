package o;

import java.beans.PropertyDescriptor;
import org.yaml.snakeyaml.error.YAMLException;

public final class getLogHost extends setLogConfigHost {
    private final PropertyDescriptor getMax;
    private final boolean length;
    private final boolean setMax;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public getLogHost(java.beans.PropertyDescriptor r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getName()
            java.lang.Class r1 = r6.getPropertyType()
            java.lang.reflect.Method r2 = r6.getReadMethod()
            r3 = 0
            if (r2 == 0) goto L_0x0014
            java.lang.reflect.Type r2 = r2.getGenericReturnType()
            goto L_0x0025
        L_0x0014:
            java.lang.reflect.Method r2 = r6.getWriteMethod()
            if (r2 == 0) goto L_0x0024
            java.lang.reflect.Type[] r2 = r2.getGenericParameterTypes()
            int r4 = r2.length
            if (r4 <= 0) goto L_0x0024
            r2 = r2[r3]
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            r5.<init>(r0, r1, r2)
            r5.getMax = r6
            java.lang.reflect.Method r0 = r6.getReadMethod()
            r1 = 1
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r5.length = r0
            java.lang.reflect.Method r6 = r6.getWriteMethod()
            if (r6 == 0) goto L_0x003d
            r3 = 1
        L_0x003d:
            r5.setMax = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getLogHost.<init>(java.beans.PropertyDescriptor):void");
    }

    public final void length(Object obj, Object obj2) throws Exception {
        if (this.setMax) {
            this.getMax.getWriteMethod().invoke(obj, new Object[]{obj2});
            return;
        }
        StringBuilder sb = new StringBuilder("No writable property '");
        sb.append(length());
        sb.append("' on class: ");
        sb.append(obj.getClass().getName());
        throw new YAMLException(sb.toString());
    }

    public final boolean setMax() {
        return this.setMax;
    }
}
