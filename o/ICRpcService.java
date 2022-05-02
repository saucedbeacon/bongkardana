package o;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o.InitParams;
import org.yaml.snakeyaml.constructor.ConstructorException;
import org.yaml.snakeyaml.constructor.DuplicateKeyException;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.nodes.NodeId;

public final class ICRpcService extends initVerifyTaskOuter {
    public ICRpcService() {
        this((Class<? extends Object>) Object.class);
    }

    private ICRpcService(Class<? extends Object> cls) {
        this(new setFmt(cls));
    }

    private ICRpcService(setFmt setfmt) {
        this(setfmt, new getEvVer());
    }

    private ICRpcService(setFmt setfmt, getEvVer getevver) {
        super(getevver);
        if (setfmt != null) {
            this.getMax.put((Object) null, new length());
            if (!Object.class.equals(setfmt.setMin)) {
                this.equals = new getLastPage(setfmt.setMin);
            }
            this.setMin.put(NodeId.scalar, new getMax());
            this.setMin.put(NodeId.mapping, new setMin());
            this.setMin.put(NodeId.sequence, new setMax());
            length(setfmt);
            return;
        }
        throw new NullPointerException("Root type must be provided.");
    }

    public class setMin implements DeviceIdProvider {
        public setMin() {
        }

        public final Object setMax(getLanguage getlanguage) {
            getLayoutType getlayouttype = (getLayoutType) getlanguage;
            if (Map.class.isAssignableFrom(getlanguage.toFloatRange)) {
                if (getlanguage.setMax()) {
                    return ICRpcService.this.length(getlayouttype);
                }
                return ICRpcService.this.getMin(getlayouttype);
            } else if (!Collection.class.isAssignableFrom(getlanguage.toFloatRange)) {
                Object max = ICRpcService.this.getMax((getLanguage) getlayouttype);
                if (getlanguage.setMax()) {
                    return max;
                }
                return setMax(getlayouttype, max);
            } else if (getlanguage.setMax()) {
                return ICRpcService.this.setMax((putBizExternParams<?>) getlayouttype);
            } else {
                return ICRpcService.this.setMax(getlayouttype);
            }
        }

        public final void setMax(getLanguage getlanguage, Object obj) {
            if (Map.class.isAssignableFrom(getlanguage.toFloatRange)) {
                ICRpcService.this.setMin((getLayoutType) getlanguage, (Map) obj);
            } else if (Set.class.isAssignableFrom(getlanguage.toFloatRange)) {
                ICRpcService.this.getMax((getLayoutType) getlanguage, (Set) obj);
            } else {
                setMax((getLayoutType) getlanguage, obj);
            }
        }

        private Object setMax(getLayoutType getlayouttype, Object obj) {
            setLogHost setloghost;
            Class[] min;
            ICRpcService.this.setMin(getlayouttype);
            Class<? extends Object> cls = getlayouttype.toFloatRange;
            for (addSPMPage next : getlayouttype.getMin) {
                if (next.getMax instanceof addPage) {
                    addPage addpage = (addPage) next.getMax;
                    getLanguage getlanguage = next.length;
                    Class<String> cls2 = String.class;
                    if (!cls2.isAssignableFrom(addpage.toFloatRange)) {
                        addpage.toFloatRange = cls2;
                    }
                    String str = (String) ICRpcService.this.length((getLanguage) addpage);
                    try {
                        setFmt setfmt = (setFmt) ICRpcService.this.toFloatRange.get(cls);
                        if (setfmt == null) {
                            ICRpcService iCRpcService = ICRpcService.this;
                            if (iCRpcService.toIntRange == null) {
                                iCRpcService.toIntRange = new refreshSessionID();
                            }
                            refreshSessionID refreshsessionid = iCRpcService.toIntRange;
                            setloghost = refreshsessionid.setMax(cls, str, refreshsessionid.getMin);
                        } else {
                            setloghost = setfmt.length(str);
                        }
                        if (setloghost.setMax()) {
                            Class<?> max = setloghost.getMax();
                            if (!max.isAssignableFrom(getlanguage.toFloatRange)) {
                                getlanguage.toFloatRange = max;
                            }
                            if (!(getlanguage.length() == NodeId.scalar || (min = setloghost.setMin()) == null || min.length <= 0)) {
                                if (getlanguage.length() == NodeId.sequence) {
                                    ((setLayoutType) getlanguage).setMax(min[0]);
                                } else if (Set.class.isAssignableFrom(getlanguage.toFloatRange)) {
                                    getLayoutType getlayouttype2 = (getLayoutType) getlanguage;
                                    getlayouttype2.getMax(min[0]);
                                    getlayouttype2.getMax(Boolean.TRUE);
                                } else if (Map.class.isAssignableFrom(getlanguage.toFloatRange)) {
                                    getLayoutType getlayouttype3 = (getLayoutType) getlanguage;
                                    getlayouttype3.setMin(min[0], min[1]);
                                    getlayouttype3.getMax(Boolean.TRUE);
                                }
                            }
                            String length = setfmt != null ? ICRpcService.this.length(getlanguage) : ICRpcService.this.length(getlanguage);
                            if ((setloghost.getMax() == Float.TYPE || setloghost.getMax() == Float.class) && (length instanceof Double)) {
                                length = Float.valueOf(((Double) length).floatValue());
                            }
                            if (setloghost.getMax() == String.class && getLastPage.isInside.equals(getlanguage.setMax) && (length instanceof byte[])) {
                                length = new String((byte[]) length);
                            }
                            setloghost.length(obj, length);
                        } else {
                            StringBuilder sb = new StringBuilder("No writable property '");
                            sb.append(str);
                            sb.append("' on class: ");
                            sb.append(cls.getName());
                            throw new YAMLException(sb.toString());
                        }
                    } catch (DuplicateKeyException e) {
                        throw e;
                    } catch (Exception e2) {
                        Exception exc = e2;
                        StringBuilder sb2 = new StringBuilder("Cannot create property=");
                        sb2.append(str);
                        sb2.append(" for JavaBean=");
                        sb2.append(obj);
                        throw new ConstructorException(sb2.toString(), getlayouttype.length, exc.getMessage(), getlanguage.length, exc);
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder("Keys must be scalars but found: ");
                    sb3.append(next.getMax);
                    throw new YAMLException(sb3.toString());
                }
            }
            return obj;
        }
    }

    protected class length implements DeviceIdProvider {
        protected length() {
        }

        private DeviceIdProvider setMin(getLanguage getlanguage) {
            Class<?> min = ICRpcService.this.setMin(getlanguage);
            if (!min.isAssignableFrom(getlanguage.toFloatRange)) {
                getlanguage.toFloatRange = min;
            }
            return (DeviceIdProvider) ICRpcService.this.setMin.get(getlanguage.length());
        }

        public final Object setMax(getLanguage getlanguage) {
            try {
                return setMin(getlanguage).setMax(getlanguage);
            } catch (ConstructorException e) {
                throw e;
            } catch (Exception e2) {
                Exception exc = e2;
                StringBuilder sb = new StringBuilder("Can't construct a java object for ");
                sb.append(getlanguage.setMax);
                sb.append("; exception=");
                sb.append(exc.getMessage());
                throw new ConstructorException((String) null, (InitParams.AnonymousClass1) null, sb.toString(), getlanguage.length, exc);
            }
        }

        public final void setMax(getLanguage getlanguage, Object obj) {
            try {
                setMin(getlanguage).setMax(getlanguage, obj);
            } catch (Exception e) {
                Exception exc = e;
                StringBuilder sb = new StringBuilder("Can't construct a second step for a java object for ");
                sb.append(getlanguage.setMax);
                sb.append("; exception=");
                sb.append(exc.getMessage());
                throw new ConstructorException((String) null, (InitParams.AnonymousClass1) null, sb.toString(), getlanguage.length, exc);
            }
        }
    }

    protected class getMax extends getHwVer {
        protected getMax() {
        }

        public final Object setMax(getLanguage getlanguage) {
            Object obj;
            addPage addpage = (addPage) getlanguage;
            Class<? extends Object> cls = addpage.toFloatRange;
            try {
                return ICRpcService.this.length(cls, addpage, false);
            } catch (InstantiationException unused) {
                if (cls.isPrimitive() || cls == String.class || Number.class.isAssignableFrom(cls) || cls == Boolean.class || Date.class.isAssignableFrom(cls) || cls == Character.class || cls == BigInteger.class || cls == BigDecimal.class || Enum.class.isAssignableFrom(cls) || getLastPage.isInside.equals(addpage.setMax) || Calendar.class.isAssignableFrom(cls) || cls == UUID.class) {
                    return getMin(cls, addpage);
                }
                Constructor<? extends Object> constructor = null;
                int i = 0;
                for (Constructor<? extends Object> constructor2 : cls.getDeclaredConstructors()) {
                    if (constructor2.getParameterTypes().length == 1) {
                        i++;
                        constructor = constructor2;
                    }
                }
                if (constructor == null) {
                    try {
                        return ICRpcService.this.length(cls, addpage, false);
                    } catch (InstantiationException e) {
                        StringBuilder sb = new StringBuilder("No single argument constructor found for ");
                        sb.append(cls);
                        sb.append(" : ");
                        sb.append(e.getMessage());
                        throw new YAMLException(sb.toString());
                    }
                } else {
                    if (i == 1) {
                        obj = getMin(constructor.getParameterTypes()[0], addpage);
                    } else {
                        try {
                            Class[] clsArr = {String.class};
                            String str = addpage.getMin;
                            constructor = cls.getDeclaredConstructor(clsArr);
                            obj = str;
                        } catch (Exception e2) {
                            StringBuilder sb2 = new StringBuilder("Can't construct a java object for scalar ");
                            sb2.append(addpage.setMax);
                            sb2.append("; No String constructor found. Exception=");
                            sb2.append(e2.getMessage());
                            throw new YAMLException(sb2.toString(), e2);
                        }
                    }
                    try {
                        constructor.setAccessible(true);
                        return constructor.newInstance(new Object[]{obj});
                    } catch (Exception e3) {
                        Exception exc = e3;
                        StringBuilder sb3 = new StringBuilder("Can't construct a java object for scalar ");
                        sb3.append(addpage.setMax);
                        sb3.append("; exception=");
                        sb3.append(exc.getMessage());
                        throw new ConstructorException((String) null, (InitParams.AnonymousClass1) null, sb3.toString(), addpage.length, exc);
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:103:0x0201, code lost:
            if (r6 == java.lang.Float.TYPE) goto L_0x0203;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Object getMin(java.lang.Class r6, o.addPage r7) {
            /*
                r5 = this;
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                if (r6 != r0) goto L_0x0016
                o.ICRpcService r6 = o.ICRpcService.this
                java.util.Map r6 = r6.getMax
                o.getLastPage r0 = o.getLastPage.values
                java.lang.Object r6 = r6.get(r0)
                o.DeviceIdProvider r6 = (o.DeviceIdProvider) r6
                java.lang.Object r6 = r6.setMax(r7)
                goto L_0x0267
            L_0x0016:
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
                if (r6 == r0) goto L_0x0257
                java.lang.Class r0 = java.lang.Boolean.TYPE
                if (r6 != r0) goto L_0x0020
                goto L_0x0257
            L_0x0020:
                java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
                r1 = 0
                r2 = 1
                if (r6 == r0) goto L_0x020e
                java.lang.Class r0 = java.lang.Character.TYPE
                if (r6 != r0) goto L_0x002c
                goto L_0x020e
            L_0x002c:
                java.lang.Class<java.util.Date> r0 = java.util.Date.class
                boolean r0 = r0.isAssignableFrom(r6)
                if (r0 == 0) goto L_0x0084
                o.ICRpcService r0 = o.ICRpcService.this
                java.util.Map r0 = r0.getMax
                o.getLastPage r3 = o.getLastPage.IsOverlapping
                java.lang.Object r0 = r0.get(r3)
                o.DeviceIdProvider r0 = (o.DeviceIdProvider) r0
                java.lang.Object r7 = r0.setMax(r7)
                java.util.Date r7 = (java.util.Date) r7
                java.lang.Class<java.util.Date> r0 = java.util.Date.class
                if (r6 == r0) goto L_0x0081
                java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ RuntimeException -> 0x007f, Exception -> 0x0066 }
                java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ RuntimeException -> 0x007f, Exception -> 0x0066 }
                r0[r1] = r3     // Catch:{ RuntimeException -> 0x007f, Exception -> 0x0066 }
                java.lang.reflect.Constructor r0 = r6.getConstructor(r0)     // Catch:{ RuntimeException -> 0x007f, Exception -> 0x0066 }
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RuntimeException -> 0x007f, Exception -> 0x0066 }
                long r3 = r7.getTime()     // Catch:{ RuntimeException -> 0x007f, Exception -> 0x0066 }
                java.lang.Long r7 = java.lang.Long.valueOf(r3)     // Catch:{ RuntimeException -> 0x007f, Exception -> 0x0066 }
                r2[r1] = r7     // Catch:{ RuntimeException -> 0x007f, Exception -> 0x0066 }
                java.lang.Object r6 = r0.newInstance(r2)     // Catch:{ RuntimeException -> 0x007f, Exception -> 0x0066 }
                goto L_0x0267
            L_0x0066:
                org.yaml.snakeyaml.error.YAMLException r7 = new org.yaml.snakeyaml.error.YAMLException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Cannot construct: '"
                r0.<init>(r1)
                r0.append(r6)
                java.lang.String r6 = "'"
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r7.<init>((java.lang.String) r6)
                throw r7
            L_0x007f:
                r6 = move-exception
                throw r6
            L_0x0081:
                r6 = r7
                goto L_0x0267
            L_0x0084:
                java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
                if (r6 == r0) goto L_0x01de
                java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
                if (r6 == r0) goto L_0x01de
                java.lang.Class r0 = java.lang.Float.TYPE
                if (r6 == r0) goto L_0x01de
                java.lang.Class r0 = java.lang.Double.TYPE
                if (r6 == r0) goto L_0x01de
                java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
                if (r6 != r0) goto L_0x009a
                goto L_0x01de
            L_0x009a:
                java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
                if (r6 == r0) goto L_0x0163
                java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
                if (r6 == r0) goto L_0x0163
                java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
                if (r6 == r0) goto L_0x0163
                java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
                if (r6 == r0) goto L_0x0163
                java.lang.Class<java.math.BigInteger> r0 = java.math.BigInteger.class
                if (r6 == r0) goto L_0x0163
                java.lang.Class r0 = java.lang.Byte.TYPE
                if (r6 == r0) goto L_0x0163
                java.lang.Class r0 = java.lang.Short.TYPE
                if (r6 == r0) goto L_0x0163
                java.lang.Class r0 = java.lang.Integer.TYPE
                if (r6 == r0) goto L_0x0163
                java.lang.Class r0 = java.lang.Long.TYPE
                if (r6 != r0) goto L_0x00c0
                goto L_0x0163
            L_0x00c0:
                java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
                boolean r0 = r0.isAssignableFrom(r6)
                if (r0 == 0) goto L_0x0100
                java.lang.String r7 = r7.getMin
                o.ICRpcService r0 = o.ICRpcService.this     // Catch:{ Exception -> 0x00e0 }
                o.getEvVer r0 = r0.FastBitmap$CoordinateSystem     // Catch:{ Exception -> 0x00e0 }
                boolean r0 = r0.getMin()     // Catch:{ Exception -> 0x00e0 }
                if (r0 == 0) goto L_0x00da
                java.lang.Enum r6 = java.lang.Enum.valueOf(r6, r7)     // Catch:{ Exception -> 0x00e0 }
                goto L_0x0267
            L_0x00da:
                java.lang.Enum r6 = o.ContextInfo.getMin(r6, r7)     // Catch:{ Exception -> 0x00e0 }
                goto L_0x0267
            L_0x00e0:
                org.yaml.snakeyaml.error.YAMLException r0 = new org.yaml.snakeyaml.error.YAMLException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Unable to find enum value '"
                r1.<init>(r2)
                r1.append(r7)
                java.lang.String r7 = "' for enum class: "
                r1.append(r7)
                java.lang.String r6 = r6.getName()
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.<init>((java.lang.String) r6)
                throw r0
            L_0x0100:
                java.lang.Class<java.util.Calendar> r0 = java.util.Calendar.class
                boolean r0 = r0.isAssignableFrom(r6)
                if (r0 == 0) goto L_0x0114
                o.initVerifyTaskOuter$hashCode r6 = new o.initVerifyTaskOuter$hashCode
                r6.<init>()
                r6.setMax(r7)
                java.util.Calendar r6 = r6.getMax
                goto L_0x0267
            L_0x0114:
                java.lang.Class<java.lang.Number> r0 = java.lang.Number.class
                boolean r0 = r0.isAssignableFrom(r6)
                if (r0 == 0) goto L_0x0129
                o.initVerifyTaskOuter$getMin r6 = new o.initVerifyTaskOuter$getMin
                o.ICRpcService r0 = o.ICRpcService.this
                r6.<init>()
                java.lang.Object r6 = r6.setMax(r7)
                goto L_0x0267
            L_0x0129:
                java.lang.Class<java.util.UUID> r0 = java.util.UUID.class
                if (r0 != r6) goto L_0x0135
                java.lang.String r6 = r7.getMin
                java.util.UUID r6 = java.util.UUID.fromString(r6)
                goto L_0x0267
            L_0x0135:
                o.ICRpcService r0 = o.ICRpcService.this
                java.util.Map r0 = r0.getMax
                o.getLastPage r1 = r7.setMax
                boolean r0 = r0.containsKey(r1)
                if (r0 == 0) goto L_0x0153
                o.ICRpcService r6 = o.ICRpcService.this
                java.util.Map r6 = r6.getMax
                o.getLastPage r0 = r7.setMax
                java.lang.Object r6 = r6.get(r0)
                o.DeviceIdProvider r6 = (o.DeviceIdProvider) r6
                java.lang.Object r6 = r6.setMax(r7)
                goto L_0x0267
            L_0x0153:
                org.yaml.snakeyaml.error.YAMLException r7 = new org.yaml.snakeyaml.error.YAMLException
                java.lang.String r6 = java.lang.String.valueOf(r6)
                java.lang.String r0 = "Unsupported class: "
                java.lang.String r6 = r0.concat(r6)
                r7.<init>((java.lang.String) r6)
                throw r7
            L_0x0163:
                o.ICRpcService r0 = o.ICRpcService.this
                java.util.Map r0 = r0.getMax
                o.getLastPage r1 = o.getLastPage.toIntRange
                java.lang.Object r0 = r0.get(r1)
                o.DeviceIdProvider r0 = (o.DeviceIdProvider) r0
                java.lang.Object r7 = r0.setMax(r7)
                java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
                if (r6 == r0) goto L_0x01cc
                java.lang.Class r0 = java.lang.Byte.TYPE
                if (r6 != r0) goto L_0x017c
                goto L_0x01cc
            L_0x017c:
                java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
                if (r6 == r0) goto L_0x01ba
                java.lang.Class r0 = java.lang.Short.TYPE
                if (r6 != r0) goto L_0x0185
                goto L_0x01ba
            L_0x0185:
                java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
                if (r6 == r0) goto L_0x01ac
                java.lang.Class r0 = java.lang.Integer.TYPE
                if (r6 != r0) goto L_0x018e
                goto L_0x01ac
            L_0x018e:
                java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
                if (r6 == r0) goto L_0x01a2
                java.lang.Class r0 = java.lang.Long.TYPE
                if (r6 != r0) goto L_0x0197
                goto L_0x01a2
            L_0x0197:
                java.math.BigInteger r6 = new java.math.BigInteger
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                goto L_0x0267
            L_0x01a2:
                java.lang.String r6 = r7.toString()
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                goto L_0x0267
            L_0x01ac:
                java.lang.String r6 = r7.toString()
                int r6 = java.lang.Integer.parseInt(r6)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                goto L_0x0267
            L_0x01ba:
                java.lang.String r6 = r7.toString()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                short r6 = r6.shortValue()
                java.lang.Short r6 = java.lang.Short.valueOf(r6)
                goto L_0x0267
            L_0x01cc:
                java.lang.String r6 = r7.toString()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                byte r6 = r6.byteValue()
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                goto L_0x0267
            L_0x01de:
                java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
                if (r6 != r0) goto L_0x01eb
                java.math.BigDecimal r6 = new java.math.BigDecimal
                java.lang.String r7 = r7.getMin
                r6.<init>(r7)
                goto L_0x0267
            L_0x01eb:
                o.ICRpcService r0 = o.ICRpcService.this
                java.util.Map r0 = r0.getMax
                o.getLastPage r1 = o.getLastPage.equals
                java.lang.Object r0 = r0.get(r1)
                o.DeviceIdProvider r0 = (o.DeviceIdProvider) r0
                java.lang.Object r7 = r0.setMax(r7)
                java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
                if (r6 == r0) goto L_0x0203
                java.lang.Class r0 = java.lang.Float.TYPE
                if (r6 != r0) goto L_0x0081
            L_0x0203:
                java.lang.Double r7 = (java.lang.Double) r7
                float r6 = r7.floatValue()
                java.lang.Float r6 = java.lang.Float.valueOf(r6)
                goto L_0x0267
            L_0x020e:
                o.ICRpcService r6 = o.ICRpcService.this
                java.util.Map r6 = r6.getMax
                o.getLastPage r0 = o.getLastPage.values
                java.lang.Object r6 = r6.get(r0)
                o.DeviceIdProvider r6 = (o.DeviceIdProvider) r6
                java.lang.Object r6 = r6.setMax(r7)
                java.lang.String r6 = (java.lang.String) r6
                int r7 = r6.length()
                if (r7 != 0) goto L_0x0228
                r6 = 0
                goto L_0x0267
            L_0x0228:
                int r7 = r6.length()
                if (r7 != r2) goto L_0x0237
                char r6 = r6.charAt(r1)
                java.lang.Character r6 = java.lang.Character.valueOf(r6)
                goto L_0x0267
            L_0x0237:
                org.yaml.snakeyaml.error.YAMLException r7 = new org.yaml.snakeyaml.error.YAMLException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Invalid node Character: '"
                r0.<init>(r1)
                r0.append(r6)
                java.lang.String r1 = "'; length: "
                r0.append(r1)
                int r6 = r6.length()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r7.<init>((java.lang.String) r6)
                throw r7
            L_0x0257:
                o.ICRpcService r6 = o.ICRpcService.this
                java.util.Map r6 = r6.getMax
                o.getLastPage r0 = o.getLastPage.toFloatRange
                java.lang.Object r6 = r6.get(r0)
                o.DeviceIdProvider r6 = (o.DeviceIdProvider) r6
                java.lang.Object r6 = r6.setMax(r7)
            L_0x0267:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ICRpcService.getMax.getMin(java.lang.Class, o.addPage):java.lang.Object");
        }
    }

    protected class setMax implements DeviceIdProvider {
        protected setMax() {
        }

        public final Object setMax(getLanguage getlanguage) {
            boolean z;
            setLayoutType setlayouttype = (setLayoutType) getlanguage;
            if (Set.class.isAssignableFrom(getlanguage.toFloatRange)) {
                if (!getlanguage.setMax()) {
                    return ICRpcService.this.setMin(setlayouttype);
                }
                throw new YAMLException("Set cannot be recursive.");
            } else if (Collection.class.isAssignableFrom(getlanguage.toFloatRange)) {
                if (getlanguage.setMax()) {
                    return ICRpcService.this.setMax(setlayouttype);
                }
                return ICRpcService.this.getMax(setlayouttype);
            } else if (!getlanguage.toFloatRange.isArray()) {
                ArrayList<Constructor> arrayList = new ArrayList<>(setlayouttype.setMin.size());
                int i = 0;
                for (Constructor constructor : getlanguage.toFloatRange.getDeclaredConstructors()) {
                    if (setlayouttype.setMin.size() == constructor.getParameterTypes().length) {
                        arrayList.add(constructor);
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (arrayList.size() == 1) {
                        Object[] objArr = new Object[setlayouttype.setMin.size()];
                        Constructor constructor2 = (Constructor) arrayList.get(0);
                        for (getLanguage next : setlayouttype.setMin) {
                            Class<? extends Object> cls = constructor2.getParameterTypes()[i];
                            if (!cls.isAssignableFrom(next.toFloatRange)) {
                                next.toFloatRange = cls;
                            }
                            objArr[i] = ICRpcService.this.length(next);
                            i++;
                        }
                        try {
                            constructor2.setAccessible(true);
                            return constructor2.newInstance(objArr);
                        } catch (Exception e) {
                            throw new YAMLException((Throwable) e);
                        }
                    } else {
                        List<? extends Object> max = ICRpcService.this.getMax(setlayouttype);
                        Class[] clsArr = new Class[max.size()];
                        int i2 = 0;
                        for (Object obj : max) {
                            clsArr[i2] = obj.getClass();
                            i2++;
                        }
                        for (Constructor constructor3 : arrayList) {
                            Class[] parameterTypes = constructor3.getParameterTypes();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= parameterTypes.length) {
                                    z = true;
                                    continue;
                                    break;
                                }
                                Class cls2 = parameterTypes[i3];
                                if (cls2.isPrimitive()) {
                                    if (cls2 == Integer.TYPE) {
                                        cls2 = Integer.class;
                                    } else if (cls2 == Float.TYPE) {
                                        cls2 = Float.class;
                                    } else if (cls2 == Double.TYPE) {
                                        cls2 = Double.class;
                                    } else if (cls2 == Boolean.TYPE) {
                                        cls2 = Boolean.class;
                                    } else if (cls2 == Long.TYPE) {
                                        cls2 = Long.class;
                                    } else if (cls2 == Character.TYPE) {
                                        cls2 = Character.class;
                                    } else if (cls2 == Short.TYPE) {
                                        cls2 = Short.class;
                                    } else if (cls2 == Byte.TYPE) {
                                        cls2 = Byte.class;
                                    } else {
                                        throw new YAMLException("Unexpected primitive ".concat(String.valueOf(cls2)));
                                    }
                                }
                                if (!cls2.isAssignableFrom(clsArr[i3])) {
                                    z = false;
                                    continue;
                                    break;
                                }
                                i3++;
                            }
                            if (z) {
                                try {
                                    constructor3.setAccessible(true);
                                    return constructor3.newInstance(max.toArray());
                                } catch (Exception e2) {
                                    throw new YAMLException((Throwable) e2);
                                }
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("No suitable constructor with ");
                sb.append(String.valueOf(setlayouttype.setMin.size()));
                sb.append(" arguments found for ");
                sb.append(getlanguage.toFloatRange);
                throw new YAMLException(sb.toString());
            } else if (!getlanguage.setMax()) {
                return ICRpcService.this.getMin(setlayouttype);
            } else {
                return Array.newInstance(getlanguage.toFloatRange.getComponentType(), setlayouttype.setMin.size());
            }
        }

        public final void setMax(getLanguage getlanguage, Object obj) {
            setLayoutType setlayouttype = (setLayoutType) getlanguage;
            if (List.class.isAssignableFrom(getlanguage.toFloatRange)) {
                ICRpcService.this.setMax(setlayouttype, (Collection<Object>) (List) obj);
            } else if (getlanguage.toFloatRange.isArray()) {
                ICRpcService.this.setMax(setlayouttype, obj);
            } else {
                throw new YAMLException("Immutable objects cannot be recursive.");
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Class<?> setMin(getLanguage getlanguage) {
        Class<?> cls = (Class) this.hashCode.get(getlanguage.setMax);
        if (cls != null) {
            return cls;
        }
        getLastPage getlastpage = getlanguage.setMax;
        if (getlastpage.Mean$Arithmetic.startsWith("tag:yaml.org,2002:")) {
            String max = shouldLogCrash.getMax(getlastpage.Mean$Arithmetic.substring(18));
            try {
                Class<?> max2 = setMax(max);
                this.hashCode.put(getlanguage.setMax, max2);
                return max2;
            } catch (ClassNotFoundException unused) {
                throw new YAMLException("Class not found: ".concat(String.valueOf(max)));
            }
        } else {
            StringBuilder sb = new StringBuilder("Invalid tag: ");
            sb.append(getlastpage.Mean$Arithmetic);
            throw new YAMLException(sb.toString());
        }
    }

    private static Class<?> setMax(String str) throws ClassNotFoundException {
        try {
            return Class.forName(str, true, Thread.currentThread().getContextClassLoader());
        } catch (ClassNotFoundException unused) {
            return Class.forName(str);
        }
    }
}
