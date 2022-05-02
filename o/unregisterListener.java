package o;

import android.content.Context;
import android.os.Build;
import com.google.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.Typography;

final class unregisterListener {
    private static Map<Member, Object> IsOverlapping = null;
    private static Method equals = null;
    private static List<setMin> getMax = new ArrayList();
    private static Class getMin = null;
    private static Class isInside = null;
    private static Class length = null;
    private static setMax setMax = null;
    public static final int setMin = 0;
    private static int toDoubleRange = 1;
    private static byte[] toFloatRange;
    private static Field toIntRange;
    private static int values;

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r8v1 ?, r8v4 ?, r8v3 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    private static java.lang.String getMin(short r7, byte r8, byte r9) {
        /*
            int r9 = 120 - r9
            byte[] r0 = toFloatRange
            int r8 = 82 - r8
            int r7 = 627 - r7
            byte[] r1 = new byte[r8]
            r2 = 77
            if (r0 == 0) goto L_0x0011
            r3 = 37
            goto L_0x0013
        L_0x0011:
            r3 = 77
        L_0x0013:
            r4 = 0
            if (r3 == r2) goto L_0x001c
            r2 = r1
            r3 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L_0x002e
        L_0x001c:
            r2 = r1
            r3 = 0
            r1 = r0
            r0 = r9
            r9 = r8
        L_0x0021:
            int r0 = r0 - r8
            int r0 = r0 + -11
            int r8 = toDoubleRange
            int r8 = r8 + 3
            int r5 = r8 % 128
            values = r5
            int r8 = r8 % 2
        L_0x002e:
            byte r8 = (byte) r0
            r2[r3] = r8
            int r7 = r7 + 1
            int r3 = r3 + 1
            if (r3 != r9) goto L_0x003d
            java.lang.String r7 = new java.lang.String
            r7.<init>(r2, r4)
            return r7
        L_0x003d:
            byte r8 = r1[r7]
            int r5 = values
            int r5 = r5 + 111
            int r6 = r5 % 128
            toDoubleRange = r6
            int r5 = r5 % 2
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: o.unregisterListener.getMin(short, byte, byte):java.lang.String");
    }

    private static void setMax() {
        byte[] bArr = new byte[663];
        System.arraycopy("\u0002÷T{èÿçøûú+Àéöï\u0004ìï;àÉöï\u0004âùüûîõù\u0013Ýæ\u0001î\u0000÷è\u0011âùò°ÔðI¢\u0007ðö:¡úD°â\b÷ãö\u0004:¥öñõÿüëèN§ôð<½â\u0004ëô\u0000ðü<³îð\u0002äþùçH¦öC¡\u0001ôëH±ôä\u0002ûó.\u0001¢ý÷îõüðü<¡\u0004çô;¸Òòü:°â\u0004ëôöH´èÿ9§ôðI£\u0002ùòøôëü \u000f÷æùóøôEô,±ø\u0002á=Âèÿçøûú+«ýöñ\u0003ö+Ë\nÙ\u0007Ýæ\u0001î\u0000\u0011ÎõùÒÐø÷í÷ðü<¬ø;¬êöH£\u0002ùòøôëü,ûïûòóõóçõ\"Ï\u0000ïéäó\u001cÝæ\u0001î\u0000\u0000÷æþà\n(·\u0000èü.±\u0002ôïü÷ä;âÔäô÷\u0006óä\u001cÝæ\u0001î\u0000ðë\u0007ôëü\u0012Îõùíýöñ\u0003ö Îõùûö\fÝæ\u0001î\u0000\u0016×êõÿöóííë\"Òòü¸Òòü:°â\u0004ëôö.\u000f\u0010ö\u0003\u000eêðø÷í\u001d×êõøðü\rÒ\u0014ãîû\u000bàèúùëõÿïöâ\u0004ê_ô,±ø\u0002á=Âèÿçøûú+«ýöñ\u0003ö+ËÝöñ\u0003ö\u0017Åþúò÷èÿçøûú+´ñ:³óøô\u0000èó\u0000ùçèÿçøûú+´ñ:ÐÏûô\u0004í\u0012Óøô\u0000èó\u0000ùçÝí\u0000òèG¨í÷ôI³ò:¨ýæ\u0001î\u00009¦òG²éöðô÷ò\u0007äúòG¦\u0002íú÷ä;÷æ\u0019Óøô\u0000èóð3\u0010¯úíòüö9¡úD¯òðÿ9²ì\u0000ãõHîþà\n(­þ4­\u0006èôÿïöâ\u0004ëôöþà\n(·\u0000èü.±\u0002ôïü÷ä;âÄó\u001cÝæ\u0001î\u0000Úíòüö9¡úD²æ\u0002ùâ\u0004:´6¥óø\u0001óçõ:â\b÷ë$Ðì\u0002÷äúòîðíüùû\u000bÒþ÷óð\u0002ê\u0014Ýæ\u0001î\u0000Üþâý\u0000÷ä\u0004ö9°â\nóêñ\u0000ïöC¬ðC°â\b÷\u0015É÷õ\u0001èÿ+".getBytes("ISO-8859-1"), 0, bArr, 0, 663);
        toFloatRange = bArr;
        setMin = 115;
    }

    unregisterListener() {
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb  */
    static {
        /*
            setMax()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            getMax = r0
            byte[] r0 = toFloatRange
            r1 = 96
            byte r1 = r0[r1]
            byte r1 = (byte) r1
            r2 = 335(0x14f, float:4.7E-43)
            byte r0 = r0[r2]
            byte r0 = (byte) r0
            r3 = 103(0x67, float:1.44E-43)
            java.lang.String r0 = getMin((short) r3, (byte) r1, (byte) r0)
            java.lang.String r0 = java.lang.System.getProperty(r0)
            o.unregisterListener$setMax r1 = o.unregisterListener.setMax.length
            setMax = r1
            r1 = 70
            r3 = 50
            if (r0 == 0) goto L_0x002d
            r4 = 70
            goto L_0x002f
        L_0x002d:
            r4 = 50
        L_0x002f:
            r5 = 0
            r6 = 75
            r7 = 0
            r8 = 2
            r9 = 1
            if (r4 == r3) goto L_0x0079
            java.lang.String r0 = r0.substring(r7, r9)     // Catch:{ NumberFormatException -> 0x0091 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0091 }
            if (r0 >= r8) goto L_0x0043
            r0 = 0
            goto L_0x0044
        L_0x0043:
            r0 = 1
        L_0x0044:
            if (r0 == r9) goto L_0x0049
            o.unregisterListener$setMax r0 = o.unregisterListener.setMax.getMax     // Catch:{ NumberFormatException -> 0x0091 }
            goto L_0x008f
        L_0x0049:
            int r0 = toDoubleRange
            r3 = r0 | 109(0x6d, float:1.53E-43)
            int r3 = r3 << r9
            r0 = r0 ^ 109(0x6d, float:1.53E-43)
            int r3 = r3 - r0
            int r0 = r3 % 128
            values = r0
            int r3 = r3 % r8
            r0 = 11
            if (r3 != 0) goto L_0x005d
            r3 = 11
            goto L_0x005f
        L_0x005d:
            r3 = 92
        L_0x005f:
            if (r3 == r0) goto L_0x0069
            o.unregisterListener$setMax r0 = o.unregisterListener.setMax.setMin     // Catch:{ NumberFormatException -> 0x0091 }
            super.hashCode()     // Catch:{ all -> 0x0067 }
            goto L_0x006b
        L_0x0067:
            r0 = move-exception
            throw r0
        L_0x0069:
            o.unregisterListener$setMax r0 = o.unregisterListener.setMax.setMin     // Catch:{ NumberFormatException -> 0x0091 }
        L_0x006b:
            int r3 = values
            r4 = r3 | 49
            int r4 = r4 << r9
            r3 = r3 ^ 49
            int r4 = r4 - r3
        L_0x0073:
            int r3 = r4 % 128
            toDoubleRange = r3
            int r4 = r4 % r8
            goto L_0x008f
        L_0x0079:
            int r0 = values
            r3 = r0 | 27
            int r3 = r3 << r9
            r0 = r0 ^ 27
            int r3 = r3 - r0
            int r0 = r3 % 128
            toDoubleRange = r0
            int r3 = r3 % r8
            o.unregisterListener$setMax r0 = o.unregisterListener.setMax.length     // Catch:{ NumberFormatException -> 0x0091 }
            int r3 = values
            r4 = r3 & 75
            r3 = r3 | r6
            int r4 = r4 + r3
            goto L_0x0073
        L_0x008f:
            setMax = r0     // Catch:{ NumberFormatException -> 0x0091 }
        L_0x0091:
            r0 = 260(0x104, float:3.64E-43)
            byte[] r3 = toFloatRange     // Catch:{ ClassNotFoundException -> 0x017a }
            r4 = 108(0x6c, float:1.51E-43)
            byte r3 = r3[r4]     // Catch:{ ClassNotFoundException -> 0x017a }
            r10 = r3 ^ 1
            r3 = r3 & r9
            int r3 = r3 << r9
            int r10 = r10 + r3
            byte r3 = (byte) r10     // Catch:{ ClassNotFoundException -> 0x017a }
            byte[] r10 = toFloatRange     // Catch:{ ClassNotFoundException -> 0x017a }
            r11 = 350(0x15e, float:4.9E-43)
            byte r10 = r10[r11]     // Catch:{ ClassNotFoundException -> 0x017a }
            byte r10 = (byte) r10     // Catch:{ ClassNotFoundException -> 0x017a }
            java.lang.String r0 = getMin((short) r0, (byte) r3, (byte) r10)     // Catch:{ ClassNotFoundException -> 0x017a }
            java.lang.ClassLoader r3 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ ClassNotFoundException -> 0x017a }
            java.lang.Class r0 = java.lang.Class.forName(r0, r9, r3)     // Catch:{ ClassNotFoundException -> 0x017a }
            length = r0     // Catch:{ ClassNotFoundException -> 0x017a }
            if (r0 != 0) goto L_0x00b8
            r0 = 0
            goto L_0x00b9
        L_0x00b8:
            r0 = 1
        L_0x00b9:
            if (r0 == 0) goto L_0x01a9
            int r0 = values
            int r0 = r0 + 7
            int r3 = r0 % 128
            toDoubleRange = r3
            int r0 = r0 % r8
            java.util.List<o.unregisterListener$setMin> r0 = getMax     // Catch:{ ClassNotFoundException -> 0x017a }
            o.unregisterListener$setMin r3 = o.unregisterListener.setMin.length     // Catch:{ ClassNotFoundException -> 0x017a }
            r0.add(r3)     // Catch:{ ClassNotFoundException -> 0x017a }
            java.lang.Class r0 = length     // Catch:{  }
            byte[] r3 = toFloatRange     // Catch:{  }
            byte r3 = r3[r6]     // Catch:{  }
            byte r3 = (byte) r3     // Catch:{  }
            byte[] r6 = toFloatRange     // Catch:{  }
            r10 = 8
            byte r6 = r6[r10]     // Catch:{  }
            int r6 = -r6
            byte r6 = (byte) r6     // Catch:{  }
            java.lang.String r2 = getMin((short) r2, (byte) r3, (byte) r6)     // Catch:{  }
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{  }
            r0.setAccessible(r9)     // Catch:{  }
            java.lang.Class r2 = length     // Catch:{  }
            java.lang.Object r0 = r0.get(r2)     // Catch:{  }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{  }
            IsOverlapping = r0     // Catch:{  }
            java.lang.Class r0 = length     // Catch:{  }
            r2 = 351(0x15f, float:4.92E-43)
            byte[] r3 = toFloatRange     // Catch:{  }
            byte r3 = r3[r11]     // Catch:{  }
            byte r3 = (byte) r3     // Catch:{  }
            java.lang.String r1 = getMin((short) r2, (byte) r1, (byte) r3)     // Catch:{  }
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{  }
            toIntRange = r0     // Catch:{  }
            r0.setAccessible(r9)     // Catch:{  }
            java.lang.Class r0 = length     // Catch:{  }
            byte[] r1 = toFloatRange     // Catch:{  }
            r2 = 31
            byte r1 = r1[r2]     // Catch:{  }
            short r1 = (short) r1     // Catch:{  }
            byte[] r2 = toFloatRange     // Catch:{  }
            r3 = 168(0xa8, float:2.35E-43)
            byte r2 = r2[r3]     // Catch:{  }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{  }
            byte[] r3 = toFloatRange     // Catch:{  }
            r6 = 153(0x99, float:2.14E-43)
            byte r3 = r3[r6]     // Catch:{  }
            byte r3 = (byte) r3     // Catch:{  }
            java.lang.String r1 = getMin((short) r1, (byte) r2, (byte) r3)     // Catch:{  }
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{  }
            java.lang.Class<java.lang.reflect.Member> r3 = java.lang.reflect.Member.class
            r2[r7] = r3     // Catch:{  }
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r2[r9] = r3     // Catch:{  }
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r2[r8] = r3     // Catch:{  }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{  }
            equals = r0     // Catch:{  }
            r0 = 467(0x1d3, float:6.54E-43)
            byte[] r1 = toFloatRange     // Catch:{ Exception -> 0x01a9 }
            byte r1 = r1[r4]     // Catch:{ Exception -> 0x01a9 }
            byte r1 = (byte) r1     // Catch:{ Exception -> 0x01a9 }
            byte[] r2 = toFloatRange     // Catch:{ Exception -> 0x01a9 }
            byte r2 = r2[r11]     // Catch:{ Exception -> 0x01a9 }
            byte r2 = (byte) r2     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r0 = getMin((short) r0, (byte) r1, (byte) r2)     // Catch:{ Exception -> 0x01a9 }
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x01a9 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r9, r1)     // Catch:{ Exception -> 0x01a9 }
            isInside = r0     // Catch:{ Exception -> 0x01a9 }
            java.lang.Class r0 = length     // Catch:{ Exception -> 0x01a9 }
            r1 = 602(0x25a, float:8.44E-43)
            byte[] r2 = toFloatRange     // Catch:{ Exception -> 0x01a9 }
            r3 = 453(0x1c5, float:6.35E-43)
            byte r2 = r2[r3]     // Catch:{ Exception -> 0x01a9 }
            r3 = r2 | -1
            int r3 = r3 << r9
            r2 = r2 ^ -1
            int r3 = r3 - r2
            byte r2 = (byte) r3     // Catch:{ Exception -> 0x01a9 }
            byte[] r3 = toFloatRange     // Catch:{ Exception -> 0x01a9 }
            r4 = 180(0xb4, float:2.52E-43)
            byte r3 = r3[r4]     // Catch:{ Exception -> 0x01a9 }
            byte r3 = (byte) r3     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r1 = getMin((short) r1, (byte) r2, (byte) r3)     // Catch:{ Exception -> 0x01a9 }
            java.lang.Class[] r2 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x01a9 }
            java.lang.Class<java.lang.reflect.Member> r3 = java.lang.reflect.Member.class
            r2[r7] = r3     // Catch:{ Exception -> 0x01a9 }
            java.lang.Class r3 = isInside     // Catch:{ Exception -> 0x01a9 }
            r2[r9] = r3     // Catch:{ Exception -> 0x01a9 }
            r0.getDeclaredMethod(r1, r2)     // Catch:{ Exception -> 0x01a9 }
            goto L_0x01a9
        L_0x017a:
            java.lang.String r0 = o.registerListener.length((o.unregisterListener.length) r5)
            r1 = 340(0x154, float:4.76E-43)
            byte[] r2 = toFloatRange
            r3 = 136(0x88, float:1.9E-43)
            byte r3 = r2[r3]
            int r3 = -r3
            byte r3 = (byte) r3
            r4 = 36
            byte r2 = r2[r4]
            byte r2 = (byte) r2
            java.lang.String r1 = getMin((short) r1, (byte) r3, (byte) r2)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x01a9
            java.util.List<o.unregisterListener$setMin> r0 = getMax
            o.unregisterListener$setMin r1 = o.unregisterListener.setMin.length
            r0.add(r1)
            int r0 = values
            int r0 = r0 + 78
            int r0 = r0 - r9
            int r1 = r0 % 128
            toDoubleRange = r1
            int r0 = r0 % r8
        L_0x01a9:
            o.unregisterListener$setMax r0 = setMax
            o.unregisterListener$setMax r1 = o.unregisterListener.setMax.getMax
            r0.equals(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.unregisterListener.<clinit>():void");
    }

    enum setMax {
        setMin,
        getMax,
        length;
        
        private static int equals = 0;
        public static final int setMax = 0;
        private static byte[] toIntRange = null;
        private static int values = 1;

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
            if (r0 != null) goto L_0x003f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
            if (r0 == null) goto L_0x0032;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String getMin(byte r8, short r9, int r10) {
            /*
                int r0 = values
                int r0 = r0 + 25
                int r1 = r0 % 128
                equals = r1
                int r0 = r0 % 2
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x0010
                r0 = 1
                goto L_0x0011
            L_0x0010:
                r0 = 0
            L_0x0011:
                r3 = -1
                if (r0 == r2) goto L_0x0025
                int r9 = r9 * 57
                byte[] r0 = toIntRange
                r4 = 44
                int r10 = r4 >>> r10
                int r8 = r8 + 50
                byte[] r4 = new byte[r8]
                int r8 = r8 + 63
                if (r0 == 0) goto L_0x0032
                goto L_0x003f
            L_0x0025:
                int r9 = 11 - r9
                byte[] r0 = toIntRange
                int r10 = 85 - r10
                int r8 = r8 + 3
                byte[] r4 = new byte[r8]
                int r8 = r8 + r3
                if (r0 != 0) goto L_0x003f
            L_0x0032:
                int r5 = values
                int r5 = r5 + r2
                int r6 = r5 % 128
                equals = r6
                int r5 = r5 % 2
                r5 = r10
                r10 = r9
                r9 = r8
                goto L_0x0051
            L_0x003f:
                int r3 = r3 + r2
                byte r5 = (byte) r10
                r4[r3] = r5
                if (r3 != r8) goto L_0x004b
                java.lang.String r8 = new java.lang.String
                r8.<init>(r4, r1)
                return r8
            L_0x004b:
                byte r5 = r0[r9]
                r7 = r9
                r9 = r8
                r8 = r10
                r10 = r7
            L_0x0051:
                int r10 = r10 + r2
                int r8 = r8 + r5
                int r8 = r8 + 2
                int r5 = values
                int r5 = r5 + 7
                int r6 = r5 % 128
                equals = r6
                int r5 = r5 % 2
                r7 = r10
                r10 = r8
                r8 = r9
                r9 = r7
                goto L_0x003f
            */
            throw new UnsupportedOperationException("Method not decompiled: o.unregisterListener.setMax.getMin(byte, short, int):java.lang.String");
        }

        private static void setMax() {
            toIntRange = new byte[]{Ascii.CAN, 76, 65, -1, Ascii.SI, 0, -5, 9, 8, -15, 0, -9, -5, 1, -1, 6, -11};
            setMax = 113;
        }

        static {
            int i = equals + 65;
            values = i % 128;
            int i2 = i % 2;
        }
    }

    enum setMin {
        length,
        setMin,
        getMin,
        getMax;
        
        private static int isInside = 1;
        public static final int setMax = 0;
        private static int toIntRange;
        private static byte[] values;

        private static void getMin() {
            values = new byte[]{6, Ascii.SUB, -32, 46, 8, 1, -4, Ascii.SO, 1, -3, 2, -7, 7, 3, -3, -1, -8, 9, -22, Ascii.NAK, -5, 8};
            setMax = 65;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
            if ((r0 != null) != false) goto L_0x0041;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
            if ((r0 != null ? '^' : 'A') != 'A') goto L_0x0041;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
            r3 = isInside + 55;
            toIntRange = r3 % 128;
            r3 = r3 % 2;
            r3 = r0;
            r5 = 0;
            r0 = r8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x006b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String setMax(short r6, short r7, byte r8) {
            /*
                int r0 = toIntRange
                int r0 = r0 + 119
                int r1 = r0 % 128
                isInside = r1
                int r0 = r0 % 2
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0010
                r0 = 1
                goto L_0x0011
            L_0x0010:
                r0 = 0
            L_0x0011:
                r3 = 65
                if (r0 == r1) goto L_0x002c
                r0 = 126(0x7e, float:1.77E-43)
                int r7 = r0 >> r7
                int r6 = r6 + 103
                r0 = 33
                int r8 = r0 >>> r8
                byte[] r0 = values
                byte[] r4 = new byte[r6]
                int r6 = r6 + r3
                if (r0 == 0) goto L_0x0028
                r3 = 1
                goto L_0x0029
            L_0x0028:
                r3 = 0
            L_0x0029:
                if (r3 == 0) goto L_0x0046
                goto L_0x0041
            L_0x002c:
                int r7 = 88 - r7
                int r6 = r6 + 4
                int r8 = 17 - r8
                byte[] r0 = values
                byte[] r4 = new byte[r6]
                int r6 = r6 + -1
                if (r0 == 0) goto L_0x003d
                r5 = 94
                goto L_0x003f
            L_0x003d:
                r5 = 65
            L_0x003f:
                if (r5 == r3) goto L_0x0046
            L_0x0041:
                r3 = r0
                r5 = 0
                r0 = r8
            L_0x0044:
                r8 = r7
                goto L_0x0056
            L_0x0046:
                int r3 = isInside
                int r3 = r3 + 55
                int r5 = r3 % 128
                toIntRange = r5
                int r3 = r3 % 2
                r3 = r0
                r5 = 0
                r0 = r8
            L_0x0053:
                int r7 = r8 - r7
                goto L_0x0044
            L_0x0056:
                byte r7 = (byte) r8
                r4[r5] = r7
                int r0 = r0 + r1
                if (r5 != r6) goto L_0x006b
                java.lang.String r6 = new java.lang.String
                r6.<init>(r4, r2)
                int r7 = isInside
                int r7 = r7 + r1
                int r8 = r7 % 128
                toIntRange = r8
                int r7 = r7 % 2
                return r6
            L_0x006b:
                int r5 = r5 + 1
                byte r7 = r3[r0]
                goto L_0x0053
            */
            throw new UnsupportedOperationException("Method not decompiled: o.unregisterListener.setMin.setMax(short, short, byte):java.lang.String");
        }

        static {
            int i = toIntRange + 9;
            isInside = i % 128;
            int i2 = i % 2;
        }
    }

    enum getMin {
        setMin,
        getMin,
        setMax;
        
        public static final int length = 0;
        private static byte[] toFloatRange = null;
        private static int valueOf = 1;
        private static int values;

        /* JADX WARNING: Removed duplicated region for block: B:12:0x005e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String length(byte r7, short r8, short r9) {
            /*
                int r0 = values
                int r0 = r0 + 39
                int r1 = r0 % 128
                valueOf = r1
                int r0 = r0 % 2
                int r9 = r9 * 4
                int r9 = 15 - r9
                int r8 = r8 + 65
                int r7 = r7 * 2
                int r7 = 27 - r7
                byte[] r0 = toFloatRange
                byte[] r1 = new byte[r9]
                int r9 = r9 + -1
                r2 = 1
                r3 = 0
                if (r0 == 0) goto L_0x0020
                r4 = 1
                goto L_0x0021
            L_0x0020:
                r4 = 0
            L_0x0021:
                if (r4 == 0) goto L_0x0029
                r4 = r1
                r5 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                goto L_0x0051
            L_0x0029:
                int r4 = values
                int r4 = r4 + 25
                int r5 = r4 % 128
                valueOf = r5
                int r4 = r4 % 2
                int r4 = valueOf
                int r4 = r4 + 51
                int r5 = r4 % 128
                values = r5
                int r4 = r4 % 2
                r4 = r1
                r5 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r7
            L_0x0043:
                int r9 = r9 - r7
                int r9 = r9 + -4
                int r7 = valueOf
                int r7 = r7 + 91
                int r6 = r7 % 128
                values = r6
                int r7 = r7 % 2
                r7 = r8
            L_0x0051:
                int r8 = r7 + 1
                byte r7 = (byte) r9
                r4[r5] = r7
                if (r5 != r0) goto L_0x005e
                java.lang.String r7 = new java.lang.String
                r7.<init>(r4, r3)
                return r7
            L_0x005e:
                int r5 = r5 + 1
                byte r7 = r1[r8]
                goto L_0x0043
            */
            throw new UnsupportedOperationException("Method not decompiled: o.unregisterListener.getMin.length(byte, short, short):java.lang.String");
        }

        private static void setMin() {
            toFloatRange = new byte[]{Framer.STDERR_FRAME_PREFIX, Framer.EXIT_FRAME_PREFIX, -94, 37, -9, 1, -15, 7, 4, -15, -1, -21, 17, -3, -5, -9, -15, Ascii.SUB, -15, -4, -23, Ascii.SUB, -25, 13, -17, -6, Ascii.VT, -3, -15, -4, -23, Ascii.SUB, -25, 13, -17, -6, Ascii.VT, -3};
            length = 86;
        }

        static {
            int i = values;
            int i2 = ((i | 79) << 1) - (i ^ 79);
            valueOf = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    static class length {
        private static int getMin = 1;
        private static int length;
        private Set<setMin> setMax = EnumSet.noneOf(setMin.class);
        private getMin setMin = getMin.setMin;

        static /* synthetic */ Set length(length length2) {
            int i = getMin + 81;
            length = i % 128;
            if (i % 2 == 0) {
            }
            Set<setMin> set = length2.setMax;
            int i2 = getMin + 39;
            length = i2 % 128;
            int i3 = i2 % 2;
            return set;
        }

        public final void setMax(boolean z) {
            getMin getmin;
            int i;
            int i2;
            int i3 = (getMin + 110) - 1;
            length = i3 % 128;
            if (!(i3 % 2 != 0) ? (i = AnonymousClass5.setMax[this.setMin.ordinal()]) == 1 || i == 2 : (i2 = AnonymousClass5.setMax[this.setMin.ordinal()]) == 1 || i2 == 2) {
                if ((!z ? 'b' : '8') != 'b') {
                    int i4 = length;
                    int i5 = ((i4 | 95) << 1) - (i4 ^ 95);
                    getMin = i5 % 128;
                    int i6 = i5 % 2;
                    getmin = getMin.getMin;
                } else {
                    getmin = getMin.setMax;
                    int i7 = (length + 102) - 1;
                    getMin = i7 % 128;
                    int i8 = i7 % 2;
                }
                this.setMin = getmin;
            }
            int i9 = length + 115;
            getMin = i9 % 128;
            int i10 = i9 % 2;
        }

        public final boolean length() {
            int i = length;
            int i2 = (i ^ 55) + ((i & 55) << 1);
            getMin = i2 % 128;
            int i3 = i2 % 2;
            boolean z = false;
            if ((this.setMin != getMin.getMin ? 'Y' : 24) != 24) {
                return false;
            }
            int i4 = length + 93;
            getMin = i4 % 128;
            boolean z2 = !(i4 % 2 == 0);
            int i5 = (length + 40) - 1;
            getMin = i5 % 128;
            if (i5 % 2 == 0) {
                z = true;
            }
            if (!z) {
                return z2;
            }
            Object obj = null;
            super.hashCode();
            return z2;
        }

        public final void getMax(length length2) {
            int i = getMin;
            int i2 = (i & 87) + (i | 87);
            length = i2 % 128;
            int i3 = i2 % 2;
            if (!(!length2.setMin())) {
                int i4 = getMin;
                int i5 = (i4 ^ 25) + ((i4 & 25) << 1);
                length = i5 % 128;
                if (i5 % 2 == 0) {
                }
                this.setMax.addAll(length2.setMax);
                setMax(length2.length());
                int i6 = length;
                int i7 = (i6 ^ 49) + ((i6 & 49) << 1);
                getMin = i7 % 128;
                int i8 = i7 % 2;
            }
            int i9 = length + 93;
            getMin = i9 % 128;
            int i10 = i9 % 2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
            if ((r5.setMax.isEmpty() ? '\'' : 'Y') != '\'') goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
            if ((r1) != true) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
            r1 = getMin + 111;
            length = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
            return false;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean setMin() {
            /*
                r5 = this;
                int r0 = length
                r1 = r0 | 115(0x73, float:1.61E-43)
                r2 = 1
                int r1 = r1 << r2
                r0 = r0 ^ 115(0x73, float:1.61E-43)
                int r1 = r1 - r0
                int r0 = r1 % 128
                getMin = r0
                int r1 = r1 % 2
                r0 = 0
                if (r1 == 0) goto L_0x0014
                r1 = 0
                goto L_0x0015
            L_0x0014:
                r1 = 1
            L_0x0015:
                r3 = 0
                if (r1 == r2) goto L_0x002a
                java.util.Set<o.unregisterListener$setMin> r1 = r5.setMax
                boolean r1 = r1.isEmpty()
                r4 = 39
                if (r1 == 0) goto L_0x0025
                r1 = 39
                goto L_0x0027
            L_0x0025:
                r1 = 89
            L_0x0027:
                if (r1 == r4) goto L_0x0054
                goto L_0x003a
            L_0x002a:
                java.util.Set<o.unregisterListener$setMin> r1 = r5.setMax
                boolean r1 = r1.isEmpty()
                super.hashCode()     // Catch:{ all -> 0x005f }
                if (r1 == 0) goto L_0x0037
                r1 = 1
                goto L_0x0038
            L_0x0037:
                r1 = 0
            L_0x0038:
                if (r1 == r2) goto L_0x0054
            L_0x003a:
                int r1 = getMin
                r4 = r1 | 17
                int r4 = r4 << r2
                r1 = r1 ^ 17
                int r4 = r4 - r1
                int r1 = r4 % 128
                length = r1
                int r4 = r4 % 2
                if (r4 != 0) goto L_0x004b
                r0 = 1
            L_0x004b:
                if (r0 == 0) goto L_0x004e
                return r2
            L_0x004e:
                super.hashCode()     // Catch:{ all -> 0x0052 }
                return r2
            L_0x0052:
                r0 = move-exception
                throw r0
            L_0x0054:
                int r1 = getMin
                int r1 = r1 + 111
                int r2 = r1 % 128
                length = r2
                int r1 = r1 % 2
                return r0
            L_0x005f:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.unregisterListener.length.setMin():boolean");
        }

        public final int getMin(int i) {
            int i2 = (getMin + 70) - 1;
            length = i2 % 128;
            int i3 = i2 % 2;
            if ((!this.setMax.isEmpty() ? 11 : 'c') != 'c') {
                i = (i & Integer.MIN_VALUE) | (i ^ Integer.MIN_VALUE);
            } else {
                int i4 = getMin + 35;
                length = i4 % 128;
                if (i4 % 2 != 0) {
                    Object obj = null;
                    super.hashCode();
                }
            }
            int i5 = 1073741824;
            if (length()) {
                int i6 = length;
                int i7 = ((i6 | 27) << 1) - (i6 ^ 27);
                getMin = i7 % 128;
                if (i7 % 2 != 0) {
                }
            } else {
                int i8 = length + 93;
                getMin = i8 % 128;
                int i9 = i8 % 2;
                i5 = 0;
            }
            int i10 = (i & i5) | (i ^ i5);
            Iterator<setMin> it = this.setMax.iterator();
            while (it.hasNext()) {
                int i11 = length;
                int i12 = ((i11 | 37) << 1) - (i11 ^ 37);
                getMin = i12 % 128;
                if (!(i12 % 2 == 0)) {
                    int i13 = -it.next().ordinal();
                    int i14 = 1 << ((i13 ^ 29) + ((i13 & 29) << 1));
                    i10 = (i10 & i14) | (i10 ^ i14);
                } else {
                    int ordinal = 0 << (66 / it.next().ordinal());
                    i10 = (i10 | ordinal) & ((i10 & ordinal) ^ -1);
                }
                int i15 = getMin;
                int i16 = (i15 ^ 49) + ((i15 & 49) << 1);
                length = i16 % 128;
                int i17 = i16 % 2;
            }
            int i18 = length;
            int i19 = (i18 ^ 37) + ((i18 & 37) << 1);
            getMin = i19 % 128;
            int i20 = i19 % 2;
            return i10;
        }
    }

    public static Object getMin(Class cls, Class[] clsArr, Object[] objArr, length length2) throws IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        int i = values;
        int i2 = (i ^ 59) + ((i & 59) << 1);
        toDoubleRange = i2 % 128;
        if (i2 % 2 != 0) {
        }
        return getMin((Member) cls.getConstructor(clsArr), (Object) cls, objArr, length2);
    }

    public static Object setMax(String str, Object obj, length length2) throws IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        int i = values;
        int i2 = ((i | 59) << 1) - (i ^ 59);
        toDoubleRange = i2 % 128;
        if (i2 % 2 != 0) {
        }
        Object min = getMin(str, obj, (Class[]) null, (Object[]) null, length2);
        int i3 = values;
        int i4 = (i3 ^ 49) + ((i3 & 49) << 1);
        toDoubleRange = i4 % 128;
        int i5 = i4 % 2;
        return min;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if ((!(r6 instanceof java.lang.Class) ? 10 : 'P') != 'P') goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        r1 = toDoubleRange;
        r3 = (r1 & 93) + (r1 | 93);
        values = r3 % 128;
        r3 = r3 % 2;
        r1 = (java.lang.Class) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if ((!(r6 instanceof java.lang.Class)) != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object getMin(java.lang.String r5, java.lang.Object r6, java.lang.Class[] r7, java.lang.Object[] r8, o.unregisterListener.length r9) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        /*
            int r0 = toDoubleRange
            r1 = r0 ^ 125(0x7d, float:1.75E-43)
            r0 = r0 & 125(0x7d, float:1.75E-43)
            r2 = 1
            int r0 = r0 << r2
            int r1 = r1 + r0
            int r0 = r1 % 128
            values = r0
            int r1 = r1 % 2
            r0 = 0
            if (r1 != 0) goto L_0x0014
            r1 = 1
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            if (r1 == 0) goto L_0x0021
            boolean r1 = r6 instanceof java.lang.Class
            if (r1 != 0) goto L_0x001d
            r1 = 1
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            if (r1 == 0) goto L_0x0033
            goto L_0x002e
        L_0x0021:
            boolean r1 = r6 instanceof java.lang.Class
            r3 = 80
            if (r1 != 0) goto L_0x002a
            r1 = 10
            goto L_0x002c
        L_0x002a:
            r1 = 80
        L_0x002c:
            if (r1 == r3) goto L_0x0033
        L_0x002e:
            java.lang.Class r1 = r6.getClass()
            goto L_0x0043
        L_0x0033:
            int r1 = toDoubleRange
            r3 = r1 & 93
            r1 = r1 | 93
            int r3 = r3 + r1
            int r1 = r3 % 128
            values = r1
            int r3 = r3 % 2
            r1 = r6
            java.lang.Class r1 = (java.lang.Class) r1
        L_0x0043:
            r3 = 87
            if (r7 == 0) goto L_0x004a
            r4 = 76
            goto L_0x004c
        L_0x004a:
            r4 = 87
        L_0x004c:
            if (r4 == r3) goto L_0x004f
            goto L_0x006b
        L_0x004f:
            int r7 = values
            r4 = r7 ^ 45
            r7 = r7 & 45
            int r7 = r7 << r2
            int r4 = r4 + r7
            int r7 = r4 % 128
            toDoubleRange = r7
            int r4 = r4 % 2
            java.lang.Class[] r7 = new java.lang.Class[r0]
            int r0 = toDoubleRange
            r2 = r0 & 87
            r0 = r0 | r3
            int r2 = r2 + r0
            int r0 = r2 % 128
            values = r0
            int r2 = r2 % 2
        L_0x006b:
            java.lang.reflect.Method r5 = r1.getMethod(r5, r7)
            java.lang.Object r5 = getMin((java.lang.reflect.Member) r5, (java.lang.Object) r6, (java.lang.Object[]) r8, (o.unregisterListener.length) r9)     // Catch:{ InstantiationException -> 0x0074 }
            return r5
        L_0x0074:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>()
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.unregisterListener.getMin(java.lang.String, java.lang.Object, java.lang.Class[], java.lang.Object[], o.unregisterListener$length):java.lang.Object");
    }

    private static Object getMin(Member member, Object obj, Object[] objArr, length length2) throws IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        List<setMin> min = getMin(member);
        boolean z = true;
        if (length2 != null) {
            int i = values;
            int i2 = (i ^ 5) + ((i & 5) << 1);
            toDoubleRange = i2 % 128;
            int i3 = i2 % 2;
            length.length(length2).addAll(min);
            int i4 = values + 111;
            toDoubleRange = i4 % 128;
            int i5 = i4 % 2;
        }
        if ((min.isEmpty() ? '!' : Typography.greater) == '>') {
            if ((min.size() == 1) && AnonymousClass5.setMin[min.get(0).ordinal()] == 1) {
                char c = 9;
                if (length2 != null) {
                    int i6 = values;
                    int i7 = (i6 & 121) + (i6 | 121);
                    toDoubleRange = i7 % 128;
                    if ((i7 % 2 != 0 ? 'F' : 9) != 9) {
                        length2.setMax(true);
                    } else {
                        length2.setMax(false);
                    }
                }
                if (!(member instanceof Method)) {
                    c = 8;
                }
                if (c != 8) {
                    if (Build.VERSION.SDK_INT != 21) {
                        int i8 = toDoubleRange;
                        int i9 = (i8 ^ 51) + ((i8 & 51) << 1);
                        values = i9 % 128;
                        int i10 = i9 % 2;
                        if (Build.VERSION.SDK_INT != 22) {
                            Object invoke = equals.invoke(length, new Object[]{member, obj, objArr});
                            int i11 = toDoubleRange;
                            int i12 = (i11 & 45) + (i11 | 45);
                            values = i12 % 128;
                            int i13 = i12 % 2;
                            return invoke;
                        }
                    }
                    toIntRange.setBoolean(length, true);
                    Object invoke2 = equals.invoke(length, new Object[]{member, obj, objArr});
                    toIntRange.setBoolean(length, false);
                    int i14 = (toDoubleRange + 66) - 1;
                    values = i14 % 128;
                    if (i14 % 2 != 0) {
                        z = false;
                    }
                    if (z) {
                        return invoke2;
                    }
                    Object obj2 = null;
                    super.hashCode();
                    return invoke2;
                }
                toIntRange.setBoolean(length, true);
                Object newInstance = ((Constructor) member).newInstance(objArr);
                toIntRange.setBoolean(length, false);
                int i15 = toDoubleRange;
                int i16 = (i15 & 65) + (i15 | 65);
                values = i16 % 128;
                int i17 = i16 % 2;
                return newInstance;
            }
        }
        if (!(length2 == null)) {
            int i18 = values + 67;
            toDoubleRange = i18 % 128;
            if (i18 % 2 == 0) {
            }
            length2.setMax(false);
        }
        if (!(member instanceof Constructor)) {
            return ((Method) member).invoke(obj, objArr);
        }
        Object newInstance2 = ((Constructor) member).newInstance(objArr);
        int i19 = values + 123;
        toDoubleRange = i19 % 128;
        int i20 = i19 % 2;
        return newInstance2;
    }

    /* renamed from: o.unregisterListener$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        private static int getMax = 0;
        private static int getMin = 1;
        static final /* synthetic */ int[] setMax;
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003c */
        static {
            /*
                o.unregisterListener$setMin[] r0 = o.unregisterListener.setMin.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMin = r0
                r1 = 1
                o.unregisterListener$setMin r2 = o.unregisterListener.setMin.length     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                o.unregisterListener$getMin[] r0 = o.unregisterListener.getMin.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMax = r0
                o.unregisterListener$getMin r2 = o.unregisterListener.getMin.setMin     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                r0 = 2
                int[] r2 = setMax     // Catch:{ NoSuchFieldError -> 0x003c }
                o.unregisterListener$getMin r3 = o.unregisterListener.getMin.getMin     // Catch:{ NoSuchFieldError -> 0x003c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x003c }
                int r2 = getMin
                r3 = r2 ^ 11
                r2 = r2 & 11
                int r1 = r2 << 1
                int r3 = r3 + r1
                int r1 = r3 % 128
                getMax = r1
                int r3 = r3 % r0
            L_0x003c:
                int[] r1 = setMax     // Catch:{ NoSuchFieldError -> 0x0053 }
                o.unregisterListener$getMin r2 = o.unregisterListener.getMin.setMax     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r3 = 3
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r1 = getMin
                r2 = r1 & 83
                r1 = r1 | 83
                int r2 = r2 + r1
                int r1 = r2 % 128
                getMax = r1
                int r2 = r2 % r0
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.unregisterListener.AnonymousClass5.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (((r3 & 256) != 0 ? '[' : '%') != '[') goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (((r3 ^ 11241) != 0 ? 23 : 'X') != 23) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b1, code lost:
        if ((r3) != true) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c5, code lost:
        if ((!IsOverlapping.keySet().contains(r8)) != true) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0109, code lost:
        if (getMax.contains(o.unregisterListener.setMin.getMax) != false) goto L_0x010b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<o.unregisterListener.setMin> getMin(java.lang.reflect.Member r8) {
        /*
            boolean r0 = r8 instanceof java.lang.reflect.Method
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 == r2) goto L_0x0029
            boolean r0 = r8 instanceof java.lang.reflect.Constructor
            if (r0 == 0) goto L_0x0010
            goto L_0x0029
        L_0x0010:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r0 = 180(0xb4, float:2.52E-43)
            byte[] r1 = toFloatRange
            r2 = 570(0x23a, float:7.99E-43)
            byte r2 = r1[r2]
            int r2 = -r2
            byte r2 = (byte) r2
            r3 = 10
            byte r1 = r1[r3]
            byte r1 = (byte) r1
            java.lang.String r0 = getMin((short) r0, (byte) r2, (byte) r1)
            r8.<init>(r0)
            throw r8
        L_0x0029:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.List<o.unregisterListener$setMin> r3 = getMax
            o.unregisterListener$setMin r4 = o.unregisterListener.setMin.length
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x003a
            r3 = 1
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            r4 = 0
            if (r3 == 0) goto L_0x0040
            goto L_0x00ea
        L_0x0040:
            int r3 = toDoubleRange
            r5 = 69
            int r3 = r3 + r5
            int r6 = r3 % 128
            values = r6
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x004f
            r3 = 0
            goto L_0x0050
        L_0x004f:
            r3 = 1
        L_0x0050:
            if (r3 == r2) goto L_0x0064
            int r3 = setMax(r8)
            r6 = r3 & 256(0x100, float:3.59E-43)
            r7 = 91
            if (r6 == 0) goto L_0x005f
            r6 = 91
            goto L_0x0061
        L_0x005f:
            r6 = 37
        L_0x0061:
            if (r6 == r7) goto L_0x00d8
            goto L_0x0075
        L_0x0064:
            int r3 = setMax(r8)
            r6 = r3 ^ 11241(0x2be9, float:1.5752E-41)
            r7 = 23
            if (r6 == 0) goto L_0x0071
            r6 = 23
            goto L_0x0073
        L_0x0071:
            r6 = 88
        L_0x0073:
            if (r6 == r7) goto L_0x00d8
        L_0x0075:
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 & r6
            if (r3 != 0) goto L_0x007d
            r3 = 69
            goto L_0x007f
        L_0x007d:
            r3 = 75
        L_0x007f:
            if (r3 == r5) goto L_0x0082
            goto L_0x00d8
        L_0x0082:
            java.util.Map<java.lang.reflect.Member, java.lang.Object> r3 = IsOverlapping
            r5 = 67
            if (r3 != 0) goto L_0x008b
            r3 = 67
            goto L_0x008c
        L_0x008b:
            r3 = 0
        L_0x008c:
            if (r3 == 0) goto L_0x008f
            goto L_0x00ea
        L_0x008f:
            int r3 = values
            int r3 = r3 + r5
            int r5 = r3 % 128
            toDoubleRange = r5
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x009c
            r3 = 0
            goto L_0x009d
        L_0x009c:
            r3 = 1
        L_0x009d:
            if (r3 == 0) goto L_0x00b6
            java.util.Map<java.lang.reflect.Member, java.lang.Object> r3 = IsOverlapping
            java.util.Set r3 = r3.keySet()
            boolean r3 = r3.contains(r8)
            super.hashCode()     // Catch:{ all -> 0x00b4 }
            if (r3 != 0) goto L_0x00b0
            r3 = 0
            goto L_0x00b1
        L_0x00b0:
            r3 = 1
        L_0x00b1:
            if (r3 == r2) goto L_0x00c7
            goto L_0x00ea
        L_0x00b4:
            r8 = move-exception
            throw r8
        L_0x00b6:
            java.util.Map<java.lang.reflect.Member, java.lang.Object> r3 = IsOverlapping
            java.util.Set r3 = r3.keySet()
            boolean r3 = r3.contains(r8)
            if (r3 != 0) goto L_0x00c4
            r3 = 1
            goto L_0x00c5
        L_0x00c4:
            r3 = 0
        L_0x00c5:
            if (r3 == r2) goto L_0x00ea
        L_0x00c7:
            int r3 = toDoubleRange
            int r3 = r3 + 104
            int r3 = r3 - r2
            int r5 = r3 % 128
            values = r5
            int r3 = r3 % 2
            o.unregisterListener$setMin r3 = o.unregisterListener.setMin.length
            r0.add(r3)
            goto L_0x00ea
        L_0x00d8:
            o.unregisterListener$setMin r3 = o.unregisterListener.setMin.length
            r0.add(r3)
            int r3 = toDoubleRange
            r5 = r3 & 97
            r3 = r3 | 97
            int r5 = r5 + r3
            int r3 = r5 % 128
            values = r3
            int r5 = r5 % 2
        L_0x00ea:
            java.util.List<o.unregisterListener$setMin> r3 = getMax
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00f3
            goto L_0x010b
        L_0x00f3:
            int r3 = values
            r5 = r3 | 3
            int r5 = r5 << r2
            r3 = r3 ^ 3
            int r5 = r5 - r3
            int r3 = r5 % 128
            toDoubleRange = r3
            int r5 = r5 % 2
            java.util.List<o.unregisterListener$setMin> r3 = getMax
            o.unregisterListener$setMin r5 = o.unregisterListener.setMin.getMax
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L_0x0134
        L_0x010b:
            int r8 = r8.getModifiers()
            r8 = r8 & 256(0x100, float:3.59E-43)
            if (r8 != 0) goto L_0x0114
            r1 = 1
        L_0x0114:
            if (r1 == r2) goto L_0x0134
            int r8 = values
            int r8 = r8 + 52
            int r8 = r8 - r2
            int r1 = r8 % 128
            toDoubleRange = r1
            int r8 = r8 % 2
            if (r8 == 0) goto L_0x0129
            o.unregisterListener$setMin r8 = o.unregisterListener.setMin.getMax
            r0.add(r8)
            goto L_0x0134
        L_0x0129:
            o.unregisterListener$setMin r8 = o.unregisterListener.setMin.getMax
            r0.add(r8)
            super.hashCode()     // Catch:{ all -> 0x0132 }
            goto L_0x0134
        L_0x0132:
            r8 = move-exception
            throw r8
        L_0x0134:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.unregisterListener.getMin(java.lang.reflect.Member):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        if (r1 != 22) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r3 != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r3 != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int setMax(java.lang.reflect.Member r8) {
        /*
            int r0 = values
            r1 = r0 ^ 85
            r0 = r0 & 85
            r2 = 1
            int r0 = r0 << r2
            int r1 = r1 + r0
            int r0 = r1 % 128
            toDoubleRange = r0
            r0 = 2
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L_0x001a
            boolean r1 = r8 instanceof java.lang.reflect.Method
            if (r1 == 0) goto L_0x0017
            r3 = 1
        L_0x0017:
            if (r3 == 0) goto L_0x0022
            goto L_0x0026
        L_0x001a:
            boolean r1 = r8 instanceof java.lang.reflect.Method
            if (r1 == 0) goto L_0x001f
            r3 = 1
        L_0x001f:
            if (r3 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            boolean r1 = r8 instanceof java.lang.reflect.Constructor
            if (r1 == 0) goto L_0x00f2
        L_0x0026:
            o.unregisterListener$setMax r1 = setMax     // Catch:{ all -> 0x00e4 }
            o.unregisterListener$setMax r3 = o.unregisterListener.setMax.setMin     // Catch:{ all -> 0x00e4 }
            r4 = 27
            if (r1 == r3) goto L_0x0031
            r1 = 64
            goto L_0x0033
        L_0x0031:
            r1 = 27
        L_0x0033:
            if (r1 == r4) goto L_0x0036
            goto L_0x005b
        L_0x0036:
            int r1 = values
            int r1 = r1 + 25
            int r3 = r1 % 128
            toDoubleRange = r3
            int r1 = r1 % r0
            r3 = 24
            if (r1 == 0) goto L_0x0046
            r1 = 80
            goto L_0x0048
        L_0x0046:
            r1 = 24
        L_0x0048:
            r4 = 22
            r5 = 21
            if (r1 == r3) goto L_0x0055
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00e4 }
            if (r1 == r5) goto L_0x006a
            if (r1 == r4) goto L_0x006a
            goto L_0x005b
        L_0x0055:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00e4 }
            if (r1 == r5) goto L_0x006a
            if (r1 == r4) goto L_0x006a
        L_0x005b:
            int r1 = values
            r3 = r1 | 45
            int r2 = r3 << 1
            r1 = r1 ^ 45
            int r2 = r2 - r1
            int r1 = r2 % 128
            toDoubleRange = r1
            int r2 = r2 % r0
            goto L_0x00e4
        L_0x006a:
            r1 = 382(0x17e, float:5.35E-43)
            byte[] r3 = toFloatRange     // Catch:{ all -> 0x00e4 }
            r4 = 193(0xc1, float:2.7E-43)
            byte r3 = r3[r4]     // Catch:{ all -> 0x00e4 }
            int r3 = -r3
            byte r3 = (byte) r3     // Catch:{ all -> 0x00e4 }
            byte[] r4 = toFloatRange     // Catch:{ all -> 0x00e4 }
            r5 = 335(0x14f, float:4.7E-43)
            byte r4 = r4[r5]     // Catch:{ all -> 0x00e4 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = getMin((short) r1, (byte) r3, (byte) r4)     // Catch:{ all -> 0x00e4 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x00e4 }
            r3 = 393(0x189, float:5.51E-43)
            byte[] r4 = toFloatRange     // Catch:{ all -> 0x00e4 }
            r6 = 46
            byte r4 = r4[r6]     // Catch:{ all -> 0x00e4 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x00e4 }
            byte[] r6 = toFloatRange     // Catch:{ all -> 0x00e4 }
            r7 = 396(0x18c, float:5.55E-43)
            byte r6 = r6[r7]     // Catch:{ all -> 0x00e4 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x00e4 }
            java.lang.String r3 = getMin((short) r3, (byte) r4, (byte) r6)     // Catch:{ all -> 0x00e4 }
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ all -> 0x00e4 }
            r1.setAccessible(r2)     // Catch:{ all -> 0x00e4 }
            byte[] r3 = toFloatRange     // Catch:{ all -> 0x00e4 }
            byte r3 = r3[r0]     // Catch:{ all -> 0x00e4 }
            short r3 = (short) r3     // Catch:{ all -> 0x00e4 }
            byte[] r4 = toFloatRange     // Catch:{ all -> 0x00e4 }
            r6 = 20
            byte r4 = r4[r6]     // Catch:{ all -> 0x00e4 }
            int r4 = -r4
            byte r4 = (byte) r4     // Catch:{ all -> 0x00e4 }
            byte[] r6 = toFloatRange     // Catch:{ all -> 0x00e4 }
            byte r5 = r6[r5]     // Catch:{ all -> 0x00e4 }
            byte r5 = (byte) r5     // Catch:{ all -> 0x00e4 }
            java.lang.String r3 = getMin((short) r3, (byte) r4, (byte) r5)     // Catch:{ all -> 0x00e4 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x00e4 }
            r4 = 403(0x193, float:5.65E-43)
            byte[] r5 = toFloatRange     // Catch:{ all -> 0x00e4 }
            r6 = 453(0x1c5, float:6.35E-43)
            byte r5 = r5[r6]     // Catch:{ all -> 0x00e4 }
            byte r5 = (byte) r5     // Catch:{ all -> 0x00e4 }
            byte[] r6 = toFloatRange     // Catch:{ all -> 0x00e4 }
            byte r6 = r6[r7]     // Catch:{ all -> 0x00e4 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = getMin((short) r4, (byte) r5, (byte) r6)     // Catch:{ all -> 0x00e4 }
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ all -> 0x00e4 }
            r3.setAccessible(r2)     // Catch:{ all -> 0x00e4 }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ all -> 0x00e4 }
            int r8 = r3.getInt(r1)     // Catch:{ all -> 0x00e4 }
            int r1 = toDoubleRange
            int r1 = r1 + 66
            int r1 = r1 - r2
            int r2 = r1 % 128
            values = r2
            int r1 = r1 % r0
            return r8
        L_0x00e4:
            int r8 = r8.getModifiers()
            int r1 = values
            int r1 = r1 + 95
            int r2 = r1 % 128
            toDoubleRange = r2
            int r1 = r1 % r0
            return r8
        L_0x00f2:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r0 = 180(0xb4, float:2.52E-43)
            byte[] r1 = toFloatRange
            r2 = 570(0x23a, float:7.99E-43)
            byte r2 = r1[r2]
            int r2 = -r2
            byte r2 = (byte) r2
            r3 = 10
            byte r1 = r1[r3]
            byte r1 = (byte) r1
            java.lang.String r0 = getMin((short) r0, (byte) r2, (byte) r1)
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.unregisterListener.setMax(java.lang.reflect.Member):int");
    }

    private static boolean getMin() {
        int i = values;
        int i2 = (i ^ 77) + ((i & 77) << 1);
        toDoubleRange = i2 % 128;
        int i3 = i2 % 2;
        if ((Build.VERSION.SDK_INT < 19 ? 'Y' : 24) != 24) {
            return false;
        }
        int i4 = toDoubleRange;
        int i5 = ((i4 | 113) << 1) - (i4 ^ 113);
        values = i5 % 128;
        int i6 = i5 % 2;
        String str = Build.VERSION.RELEASE;
        byte[] bArr = toFloatRange;
        if ((!str.startsWith(getMin(407, (byte) (-bArr[85]), (byte) bArr[54])) ? 21 : 'J') == 'J') {
            return false;
        }
        int i7 = (toDoubleRange + 6) - 1;
        values = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public static String getMax(String str, boolean z, length length2) throws IOException {
        int i = (toDoubleRange + 74) - 1;
        values = i % 128;
        int i2 = i % 2;
        String max = setMax(new String[]{str}, z, length2);
        int i3 = values;
        int i4 = ((i3 | 17) << 1) - (i3 ^ 17);
        toDoubleRange = i4 % 128;
        int i5 = i4 % 2;
        return max;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(1:2)(1:3)|(3:5|(1:7)(1:8)|(3:10|(1:12)(1:13)|(1:76))(3:15|(1:17)(1:18)|(1:75)))|20|21|22|(2:25|23)|74|26|27|28|29|30|31|32|33|34|35|36|37|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0177, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r4.destroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x017c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x017d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x017e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x017f, code lost:
        r0 = (java.lang.Exception) r0.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x018d, code lost:
        r4 = values;
        r5 = ((r4 | 83) << 1) - (r4 ^ 83);
        toDoubleRange = r5 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x019c, code lost:
        if ((r5 % 2) != 0) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x019e, code lost:
        r5 = 'F';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01a1, code lost:
        r5 = 'M';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01a3, code lost:
        if (r5 != 'M') goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a7, code lost:
        if ((r0 instanceof java.lang.SecurityException) == false) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ae, code lost:
        if ((r0 instanceof java.lang.SecurityException) == false) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01b0, code lost:
        r4 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01b3, code lost:
        r4 = 'a';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b5, code lost:
        if (r4 == 13) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b9, code lost:
        if ((r0 instanceof java.io.IOException) != false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01bc, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01bd, code lost:
        if (r3 == true) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bf, code lost:
        r3 = values + 1;
        toDoubleRange = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c9, code lost:
        throw ((java.io.IOException) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ca, code lost:
        r1 = toFloatRange;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e6, code lost:
        throw new java.io.IOException(getMin((short) r1[51], (byte) (-r1[20]), (byte) (-r1[193(0xc1, float:2.7E-43)])));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ea, code lost:
        throw ((java.lang.RuntimeException) r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0149 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x015f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x017b */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x017e A[ExcHandler: InvocationTargetException (r0v6 'e' java.lang.reflect.InvocationTargetException A[CUSTOM_DECLARE]), Splitter:B:21:0x0052] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x017b=Splitter:B:42:0x017b, B:36:0x015f=Splitter:B:36:0x015f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(java.lang.String[] r16, boolean r17, o.unregisterListener.length r18) throws java.io.IOException {
        /*
            int r0 = values
            int r0 = r0 + 112
            r1 = 1
            int r0 = r0 - r1
            int r2 = r0 % 128
            toDoubleRange = r2
            r2 = 2
            int r0 = r0 % r2
            r0 = 53
            if (r17 != 0) goto L_0x0013
            r3 = 53
            goto L_0x0014
        L_0x0013:
            r3 = 4
        L_0x0014:
            if (r3 == r0) goto L_0x0051
            int r0 = values
            r3 = r0 ^ 121(0x79, float:1.7E-43)
            r0 = r0 & 121(0x79, float:1.7E-43)
            int r0 = r0 << r1
            int r3 = r3 + r0
            int r0 = r3 % 128
            toDoubleRange = r0
            int r3 = r3 % r2
            r0 = 56
            if (r3 == 0) goto L_0x002a
            r3 = 76
            goto L_0x002c
        L_0x002a:
            r3 = 56
        L_0x002c:
            if (r3 == r0) goto L_0x003e
            boolean r0 = getMin()
            r3 = 98
            if (r0 == 0) goto L_0x0039
            r0 = 98
            goto L_0x003b
        L_0x0039:
            r0 = 42
        L_0x003b:
            if (r0 == r3) goto L_0x0051
            goto L_0x004e
        L_0x003e:
            boolean r0 = getMin()
            r3 = 79
            if (r0 == 0) goto L_0x0049
            r0 = 62
            goto L_0x004b
        L_0x0049:
            r0 = 79
        L_0x004b:
            if (r0 == r3) goto L_0x004e
            goto L_0x0051
        L_0x004e:
            java.lang.String r0 = ""
            return r0
        L_0x0051:
            r3 = 0
            byte[] r0 = toFloatRange     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r4 = 152(0x98, float:2.13E-43)
            byte r0 = r0[r4]     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            short r0 = (short) r0     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte[] r4 = toFloatRange     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r5 = 71
            byte r4 = r4[r5]     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte r4 = (byte) r4     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte[] r5 = toFloatRange     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r6 = 31
            byte r5 = r5[r6]     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte r5 = (byte) r5     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.lang.String r0 = getMin((short) r0, (byte) r4, (byte) r5)     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r5 = 3
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.lang.Class<java.lang.String[]> r8 = java.lang.String[].class
            r7[r3] = r8     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.lang.Class<java.lang.String[]> r8 = java.lang.String[].class
            r7[r1] = r8     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.lang.Class<java.io.File> r8 = java.io.File.class
            r7[r2] = r8     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.lang.String[] r8 = new java.lang.String[r1]     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r9 = 385(0x181, float:5.4E-43)
            byte[] r10 = toFloatRange     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r11 = 43
            byte r10 = r10[r11]     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte[] r11 = toFloatRange     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r12 = 8
            byte r11 = r11[r12]     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.lang.String r9 = getMin((short) r9, (byte) r10, (byte) r11)     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r8[r3] = r9     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r5[r3] = r8     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r8 = 0
            r5[r1] = r8     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r5[r2] = r8     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r8 = r18
            java.lang.Object r0 = getMin(r0, r4, r7, r5, r8)     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r4 = r0
            java.lang.Process r4 = (java.lang.Process) r4     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            o.deliverResult r0 = new o.deliverResult     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.io.InputStream r5 = r4.getInputStream()     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r0.<init>(r5)     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            o.deliverResult r5 = new o.deliverResult     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.io.InputStream r7 = r4.getErrorStream()     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r5.<init>(r7)     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.io.DataOutputStream r7 = new java.io.DataOutputStream     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.io.OutputStream r8 = r4.getOutputStream()     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r7.<init>(r8)     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r0.start()     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r5.start()     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r8 = 0
        L_0x00cc:
            r9 = 32
            r10 = 295(0x127, float:4.13E-43)
            r11 = 85
            if (r8 > 0) goto L_0x0118
            r8 = r16[r3]     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r12.<init>()     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r12.append(r8)     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r8 = 432(0x1b0, float:6.05E-43)
            byte[] r13 = toFloatRange     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r14 = 503(0x1f7, float:7.05E-43)
            byte r13 = r13[r14]     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            int r14 = setMin     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r15 = r14 ^ -5
            r14 = r14 & -5
            int r14 = r14 << r1
            int r15 = r15 + r14
            byte r14 = (byte) r15     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.lang.String r8 = getMin((short) r8, (byte) r13, (byte) r14)     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r12.append(r8)     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.lang.String r8 = r12.toString()     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte[] r12 = toFloatRange     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte r11 = r12[r11]     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte[] r12 = toFloatRange     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte r9 = r12[r9]     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.lang.String r9 = getMin((short) r10, (byte) r11, (byte) r9)     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte[] r8 = r8.getBytes(r9)     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r7.write(r8)     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r7.flush()     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r8 = 1
            goto L_0x00cc
        L_0x0118:
            r8 = 264(0x108, float:3.7E-43)
            byte[] r12 = toFloatRange     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte r12 = r12[r11]     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte[] r13 = toFloatRange     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte r6 = r13[r6]     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte r6 = (byte) r6     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.lang.String r6 = getMin((short) r8, (byte) r12, (byte) r6)     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte[] r8 = toFloatRange     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte r8 = r8[r11]     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte[] r11 = toFloatRange     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte r9 = r11[r9]     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.lang.String r8 = getMin((short) r10, (byte) r8, (byte) r9)     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            byte[] r6 = r6.getBytes(r8)     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r7.write(r6)     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r7.flush()     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r4.waitFor()     // Catch:{ InterruptedException -> 0x017c, all -> 0x0177 }
            r7.close()     // Catch:{ IOException -> 0x0149 }
        L_0x0149:
            r0.join()     // Catch:{ InterruptedException -> 0x017c, all -> 0x0177 }
            r5.join()     // Catch:{ InterruptedException -> 0x017c, all -> 0x0177 }
            r4.destroy()     // Catch:{ Exception -> 0x015f, InvocationTargetException -> 0x017e }
            int r4 = values
            r6 = r4 | 73
            int r6 = r6 << r1
            r4 = r4 ^ 73
            int r6 = r6 - r4
            int r4 = r6 % 128
            toDoubleRange = r4
            int r6 = r6 % r2
        L_0x015f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r4.<init>()     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.lang.String r0 = r0.getMin()     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r4.append(r0)     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.lang.String r0 = r5.getMin()     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            r4.append(r0)     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            java.lang.String r0 = r4.toString()     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
            return r0
        L_0x0177:
            r0 = move-exception
            r4.destroy()     // Catch:{ Exception -> 0x017b, InvocationTargetException -> 0x017e }
        L_0x017b:
            throw r0     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
        L_0x017c:
            r0 = move-exception
            throw r0     // Catch:{ InvocationTargetException -> 0x017e, Exception -> 0x01ca }
        L_0x017e:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Exception r0 = (java.lang.Exception) r0
            boolean r4 = r0 instanceof java.lang.NullPointerException
            if (r4 != 0) goto L_0x01e7
            boolean r4 = r0 instanceof java.lang.IllegalArgumentException
            if (r4 != 0) goto L_0x01e7
            int r4 = values
            r5 = r4 | 83
            int r5 = r5 << r1
            r4 = r4 ^ 83
            int r5 = r5 - r4
            int r4 = r5 % 128
            toDoubleRange = r4
            int r5 = r5 % r2
            r4 = 77
            if (r5 == 0) goto L_0x01a1
            r5 = 70
            goto L_0x01a3
        L_0x01a1:
            r5 = 77
        L_0x01a3:
            if (r5 == r4) goto L_0x01aa
            boolean r4 = r0 instanceof java.lang.SecurityException
            if (r4 != 0) goto L_0x01e7
            goto L_0x01b7
        L_0x01aa:
            boolean r4 = r0 instanceof java.lang.SecurityException
            r5 = 13
            if (r4 != 0) goto L_0x01b3
            r4 = 13
            goto L_0x01b5
        L_0x01b3:
            r4 = 97
        L_0x01b5:
            if (r4 != r5) goto L_0x01e7
        L_0x01b7:
            boolean r4 = r0 instanceof java.io.IOException
            if (r4 != 0) goto L_0x01bc
            goto L_0x01bd
        L_0x01bc:
            r3 = 1
        L_0x01bd:
            if (r3 != r1) goto L_0x01ca
            int r3 = values
            int r3 = r3 + r1
            int r1 = r3 % 128
            toDoubleRange = r1
            int r3 = r3 % r2
            java.io.IOException r0 = (java.io.IOException) r0
            throw r0
        L_0x01ca:
            java.io.IOException r0 = new java.io.IOException
            byte[] r1 = toFloatRange
            r2 = 51
            byte r2 = r1[r2]
            short r2 = (short) r2
            r3 = 20
            byte r3 = r1[r3]
            int r3 = -r3
            byte r3 = (byte) r3
            r4 = 193(0xc1, float:2.7E-43)
            byte r1 = r1[r4]
            int r1 = -r1
            byte r1 = (byte) r1
            java.lang.String r1 = getMin((short) r2, (byte) r3, (byte) r1)
            r0.<init>(r1)
            throw r0
        L_0x01e7:
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            goto L_0x01eb
        L_0x01ea:
            throw r0
        L_0x01eb:
            goto L_0x01ea
        */
        throw new UnsupportedOperationException("Method not decompiled: o.unregisterListener.setMax(java.lang.String[], boolean, o.unregisterListener$length):java.lang.String");
    }

    public static boolean length(String str, length length2) {
        int i = values;
        int i2 = (i & 101) + (i | 101);
        toDoubleRange = i2 % 128;
        int i3 = i2 % 2;
        boolean max = getMax(setMin(str, length2), length2);
        int i4 = (toDoubleRange + 54) - 1;
        values = i4 % 128;
        int i5 = i4 % 2;
        return max;
    }

    public static File setMin(String str, length length2) {
        int i = toDoubleRange;
        int i2 = ((i | 13) << 1) - (i ^ 13);
        values = i2 % 128;
        int i3 = i2 % 2;
        Class<File> cls = File.class;
        try {
            Object[] objArr = {str};
            File file = (File) getMin((Member) cls.getConstructor(new Class[]{String.class}), (Object) cls, objArr, length2);
            int i4 = values + 93;
            toDoubleRange = i4 % 128;
            int i5 = i4 % 2;
            return file;
        } catch (Exception unused) {
            return new File(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a7, code lost:
        if ((((java.lang.Boolean) getMin(getMin((short) toFloatRange[11677(0x2d9d, float:1.6363E-41)], (byte) toFloatRange[32492(0x7eec, float:4.5531E-41)], (byte) toFloatRange[30612(0x7794, float:4.2897E-41)]), r9, r1, r1, r10)).booleanValue()) != true) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getMax(java.io.File r9, o.unregisterListener.length r10) {
        /*
            int r0 = values
            r1 = r0 | 101(0x65, float:1.42E-43)
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 ^ 101(0x65, float:1.42E-43)
            int r1 = r1 - r0
            int r0 = r1 % 128
            toDoubleRange = r0
            int r1 = r1 % 2
            byte[] r0 = toFloatRange     // Catch:{ Exception -> 0x0104 }
            r1 = 72
            byte r0 = r0[r1]     // Catch:{ Exception -> 0x0104 }
            int r0 = -r0
            short r0 = (short) r0     // Catch:{ Exception -> 0x0104 }
            byte[] r1 = toFloatRange     // Catch:{ Exception -> 0x0104 }
            r3 = 136(0x88, float:1.9E-43)
            byte r1 = r1[r3]     // Catch:{ Exception -> 0x0104 }
            int r1 = -r1
            byte r1 = (byte) r1     // Catch:{ Exception -> 0x0104 }
            byte[] r4 = toFloatRange     // Catch:{ Exception -> 0x0104 }
            r5 = 31
            byte r4 = r4[r5]     // Catch:{ Exception -> 0x0104 }
            byte r4 = (byte) r4     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = getMin((short) r0, (byte) r1, (byte) r4)     // Catch:{ Exception -> 0x0104 }
            r1 = 0
            java.lang.Object r0 = getMin(r0, r9, r1, r1, r10)     // Catch:{ Exception -> 0x0104 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0104 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0104 }
            r4 = 0
            if (r0 == 0) goto L_0x003a
            r0 = 1
            goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            if (r0 == 0) goto L_0x003f
            goto L_0x00ed
        L_0x003f:
            int r0 = toDoubleRange
            r5 = r0 | 55
            int r5 = r5 << r2
            r0 = r0 ^ 55
            int r5 = r5 - r0
            int r0 = r5 % 128
            values = r0
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x0051
            r0 = 0
            goto L_0x0052
        L_0x0051:
            r0 = 1
        L_0x0052:
            r5 = 153(0x99, float:2.14E-43)
            if (r0 == r2) goto L_0x007f
            byte[] r0 = toFloatRange     // Catch:{ Exception -> 0x0104 }
            r6 = 341(0x155, float:4.78E-43)
            byte r0 = r0[r6]     // Catch:{ Exception -> 0x0104 }
            short r0 = (short) r0     // Catch:{ Exception -> 0x0104 }
            byte[] r6 = toFloatRange     // Catch:{ Exception -> 0x0104 }
            r7 = 453(0x1c5, float:6.35E-43)
            byte r6 = r6[r7]     // Catch:{ Exception -> 0x0104 }
            byte r6 = (byte) r6     // Catch:{ Exception -> 0x0104 }
            byte[] r7 = toFloatRange     // Catch:{ Exception -> 0x0104 }
            byte r7 = r7[r5]     // Catch:{ Exception -> 0x0104 }
            byte r7 = (byte) r7     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = getMin((short) r0, (byte) r6, (byte) r7)     // Catch:{ Exception -> 0x0104 }
            java.lang.Object r0 = getMin(r0, r9, r1, r1, r10)     // Catch:{ Exception -> 0x0104 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0104 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0104 }
            if (r0 == 0) goto L_0x007b
            r0 = 0
            goto L_0x007c
        L_0x007b:
            r0 = 1
        L_0x007c:
            if (r0 == 0) goto L_0x00ed
            goto L_0x00a9
        L_0x007f:
            byte[] r0 = toFloatRange     // Catch:{ Exception -> 0x0104 }
            r6 = 11677(0x2d9d, float:1.6363E-41)
            byte r0 = r0[r6]     // Catch:{ Exception -> 0x0104 }
            short r0 = (short) r0     // Catch:{ Exception -> 0x0104 }
            byte[] r6 = toFloatRange     // Catch:{ Exception -> 0x0104 }
            r7 = 32492(0x7eec, float:4.5531E-41)
            byte r6 = r6[r7]     // Catch:{ Exception -> 0x0104 }
            byte r6 = (byte) r6     // Catch:{ Exception -> 0x0104 }
            byte[] r7 = toFloatRange     // Catch:{ Exception -> 0x0104 }
            r8 = 30612(0x7794, float:4.2897E-41)
            byte r7 = r7[r8]     // Catch:{ Exception -> 0x0104 }
            byte r7 = (byte) r7     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = getMin((short) r0, (byte) r6, (byte) r7)     // Catch:{ Exception -> 0x0104 }
            java.lang.Object r0 = getMin(r0, r9, r1, r1, r10)     // Catch:{ Exception -> 0x0104 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0104 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0104 }
            if (r0 == 0) goto L_0x00a6
            r0 = 1
            goto L_0x00a7
        L_0x00a6:
            r0 = 0
        L_0x00a7:
            if (r0 == r2) goto L_0x00ed
        L_0x00a9:
            int r0 = values
            r6 = r0 ^ 89
            r0 = r0 & 89
            int r0 = r0 << r2
            int r6 = r6 + r0
            int r0 = r6 % 128
            toDoubleRange = r0
            int r6 = r6 % 2
            r0 = 314(0x13a, float:4.4E-43)
            byte[] r6 = toFloatRange     // Catch:{ Exception -> 0x0104 }
            byte r3 = r6[r3]     // Catch:{ Exception -> 0x0104 }
            int r3 = -r3
            byte r3 = (byte) r3     // Catch:{ Exception -> 0x0104 }
            byte[] r6 = toFloatRange     // Catch:{ Exception -> 0x0104 }
            byte r5 = r6[r5]     // Catch:{ Exception -> 0x0104 }
            byte r5 = (byte) r5     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = getMin((short) r0, (byte) r3, (byte) r5)     // Catch:{ Exception -> 0x0104 }
            java.lang.Object r10 = getMin(r0, r9, r1, r1, r10)     // Catch:{ Exception -> 0x0104 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ Exception -> 0x0104 }
            boolean r9 = r10.booleanValue()     // Catch:{ Exception -> 0x0104 }
            r10 = 36
            if (r9 != 0) goto L_0x00d9
            r9 = 36
            goto L_0x00db
        L_0x00d9:
            r9 = 75
        L_0x00db:
            if (r9 == r10) goto L_0x00de
            goto L_0x00ed
        L_0x00de:
            int r9 = values
            r10 = r9 ^ 119(0x77, float:1.67E-43)
            r9 = r9 & 119(0x77, float:1.67E-43)
            int r9 = r9 << r2
            int r10 = r10 + r9
            int r9 = r10 % 128
            toDoubleRange = r9
            int r10 = r10 % 2
            return r4
        L_0x00ed:
            int r9 = values
            int r9 = r9 + 26
            int r9 = r9 - r2
            int r10 = r9 % 128
            toDoubleRange = r10
            int r9 = r9 % 2
            if (r9 == 0) goto L_0x00fb
            r4 = 1
        L_0x00fb:
            if (r4 == r2) goto L_0x0103
            super.hashCode()     // Catch:{ all -> 0x0101 }
            return r2
        L_0x0101:
            r9 = move-exception
            throw r9
        L_0x0103:
            return r2
        L_0x0104:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>()
            boolean r9 = r9.exists()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.unregisterListener.getMax(java.io.File, o.unregisterListener$length):boolean");
    }

    public static String setMax(String str, length length2) {
        byte b;
        byte b2;
        short s;
        int i = values + 31;
        toDoubleRange = i % 128;
        if ((i % 2 != 0 ? ';' : 11) != 11) {
            s = 296;
            byte[] bArr = toFloatRange;
            b = (byte) (-bArr[43]);
            b2 = bArr[237];
        } else {
            s = 20179;
            byte[] bArr2 = toFloatRange;
            b = (byte) (-bArr2[69]);
            b2 = bArr2[3864];
        }
        String min = getMin(str, getMin(s, b, (byte) b2), length2);
        int i2 = toDoubleRange + 19;
        values = i2 % 128;
        int i3 = i2 % 2;
        return min;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if ((r6 == null ? 'F' : 0) != 0) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if ((r6 == null ? '9' : '%') != '%') goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getMin(java.lang.String r6, java.lang.String r7, o.unregisterListener.length r8) {
        /*
            int r0 = toDoubleRange
            r1 = r0 & 69
            r0 = r0 | 69
            int r1 = r1 + r0
            int r0 = r1 % 128
            values = r0
            int r1 = r1 % 2
            r0 = 0
            r2 = 1
            if (r1 != 0) goto L_0x0013
            r1 = 1
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            r3 = 0
            java.lang.String r4 = ""
            if (r1 == r2) goto L_0x0027
            java.io.File r6 = setMin(r6, r8)
            if (r6 != 0) goto L_0x0022
            r1 = 70
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            if (r1 == 0) goto L_0x0038
            goto L_0x00b9
        L_0x0027:
            java.io.File r6 = setMin(r6, r8)
            r1 = 37
            if (r6 != 0) goto L_0x0032
            r5 = 57
            goto L_0x0034
        L_0x0032:
            r5 = 37
        L_0x0034:
            if (r5 == r1) goto L_0x0038
            goto L_0x00b9
        L_0x0038:
            boolean r8 = getMax((java.io.File) r6, (o.unregisterListener.length) r8)
            if (r8 != 0) goto L_0x003f
            r0 = 1
        L_0x003f:
            if (r0 == r2) goto L_0x00b9
            int r8 = toDoubleRange
            int r8 = r8 + 119
            int r0 = r8 % 128
            values = r0
            int r8 = r8 % 2
            boolean r8 = r6.isFile()
            if (r8 == 0) goto L_0x00b9
            java.util.Scanner r8 = new java.util.Scanner     // Catch:{ IOException -> 0x00b9 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00b9 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x00b9 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x00b9 }
            java.util.Scanner r6 = r8.useDelimiter(r7)     // Catch:{ IOException -> 0x00b9 }
            boolean r7 = r6.hasNext()     // Catch:{ IOException -> 0x00b9 }
            if (r7 != 0) goto L_0x0074
            int r7 = toDoubleRange
            r8 = r7 & 101(0x65, float:1.42E-43)
            r7 = r7 | 101(0x65, float:1.42E-43)
            int r8 = r8 + r7
            int r7 = r8 % 128
            values = r7
            int r8 = r8 % 2
            r7 = r4
            goto L_0x00a5
        L_0x0074:
            int r7 = values
            r8 = r7 ^ 63
            r7 = r7 & 63
            int r7 = r7 << r2
            int r8 = r8 + r7
            int r7 = r8 % 128
            toDoubleRange = r7
            int r8 = r8 % 2
            r7 = 32
            if (r8 == 0) goto L_0x0088
            r8 = 5
            goto L_0x008a
        L_0x0088:
            r8 = 32
        L_0x008a:
            if (r8 == r7) goto L_0x0091
            java.lang.String r7 = r6.next()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x0098
        L_0x0091:
            java.lang.String r7 = r6.next()     // Catch:{ IOException -> 0x00b9 }
            super.hashCode()     // Catch:{ all -> 0x00b7 }
        L_0x0098:
            int r8 = toDoubleRange
            r0 = r8 & 101(0x65, float:1.42E-43)
            r8 = r8 | 101(0x65, float:1.42E-43)
            int r0 = r0 + r8
            int r8 = r0 % 128
            values = r8
            int r0 = r0 % 2
        L_0x00a5:
            r6.close()     // Catch:{ IOException -> 0x00b9 }
            int r6 = values
            r8 = r6 | 63
            int r8 = r8 << r2
            r6 = r6 ^ 63
            int r8 = r8 - r6
            int r6 = r8 % 128
            toDoubleRange = r6
            int r8 = r8 % 2
            return r7
        L_0x00b7:
            r6 = move-exception
            throw r6
        L_0x00b9:
            int r6 = toDoubleRange
            r7 = r6 | 31
            int r7 = r7 << r2
            r6 = r6 ^ 31
            int r7 = r7 - r6
            int r6 = r7 % 128
            values = r6
            int r7 = r7 % 2
            if (r7 != 0) goto L_0x00ca
            return r4
        L_0x00ca:
            super.hashCode()     // Catch:{ all -> 0x00ce }
            return r4
        L_0x00ce:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.unregisterListener.getMin(java.lang.String, java.lang.String, o.unregisterListener$length):java.lang.String");
    }

    public static int length(String[] strArr, length length2) {
        int i = toDoubleRange + 121;
        values = i % 128;
        boolean z = true;
        if (i % 2 == 0) {
        }
        int i2 = 0;
        while (true) {
            if ((i2 >= strArr.length ? 5 : '3') != '3') {
                return -1;
            }
            int i3 = toDoubleRange;
            int i4 = (i3 & 53) + (i3 | 53);
            values = i4 % 128;
            int i5 = i4 % 2;
            if (!(!length(strArr[i2], length2))) {
                int i6 = values;
                int i7 = (i6 & 101) + (i6 | 101);
                toDoubleRange = i7 % 128;
                if (i7 % 2 != 0) {
                    z = false;
                }
                if (!z) {
                    return i2;
                }
                Object obj = null;
                super.hashCode();
                return i2;
            }
            i2++;
        }
    }

    public static int getMax(String[] strArr, length length2) {
        int i = values;
        int i2 = (i ^ 59) + ((i & 59) << 1);
        toDoubleRange = i2 % 128;
        int i3 = i2 % 2;
        int i4 = values;
        int i5 = (i4 ^ 37) + ((i4 & 37) << 1);
        toDoubleRange = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (true) {
            if (!(i7 < strArr.length)) {
                return -1;
            }
            int i8 = values;
            int i9 = (i8 ^ 91) + ((i8 & 91) << 1);
            toDoubleRange = i9 % 128;
            int i10 = i9 % 2;
            File min = setMin(strArr[i7], length2);
            if (getMax(min, length2)) {
                int i11 = (toDoubleRange + 84) - 1;
                values = i11 % 128;
                if (!(i11 % 2 != 0)) {
                    try {
                        if ((!((Boolean) getMin(getMin(314, (byte) (-toFloatRange[136]), (byte) toFloatRange[153]), min, (Class[]) null, (Object[]) null, length2)).booleanValue() ? '7' : 'J') != 'J') {
                        }
                    } catch (Exception unused) {
                        new RuntimeException();
                        if (!min.isFile()) {
                            continue;
                        } else {
                            if ((min.canRead() ? '0' : '@') == '@') {
                                int i12 = (toDoubleRange + 54) - 1;
                                values = i12 % 128;
                                int i13 = i12 % 2;
                                return i7;
                            }
                        }
                    }
                } else {
                    if (!(((Boolean) getMin(getMin(5582, (byte) (-toFloatRange[10497]), (byte) toFloatRange[9278]), min, (Class[]) null, (Object[]) null, length2)).booleanValue())) {
                        continue;
                    }
                }
                int i14 = toDoubleRange;
                int i15 = (i14 ^ 99) + ((i14 & 99) << 1);
                values = i15 % 128;
                int i16 = i15 % 2;
                if ((((Boolean) getMin(getMin(591, (byte) 75, (byte) toFloatRange[655]), min, (Class[]) null, (Object[]) null, length2)).booleanValue() ? 23 : '3') != 23) {
                    int i17 = values;
                    int i18 = (i17 & 11) + (i17 | 11);
                    toDoubleRange = i18 % 128;
                    int i19 = i18 % 2;
                    return i7;
                }
            }
            i7++;
            int i20 = (values + 78) - 1;
            toDoubleRange = i20 % 128;
            int i21 = i20 % 2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r1 != null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (getMin == null) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getMax(android.content.Context r9, java.lang.String r10, o.unregisterListener.length r11) {
        /*
            int r0 = toDoubleRange
            r1 = r0 | 91
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 ^ 91
            int r1 = r1 - r0
            int r0 = r1 % 128
            values = r0
            r0 = 2
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L_0x0014
            r1 = 0
            goto L_0x0015
        L_0x0014:
            r1 = 1
        L_0x0015:
            r4 = 0
            if (r1 == r2) goto L_0x001d
            java.lang.Class r1 = getMin
            if (r1 != 0) goto L_0x0074
            goto L_0x0025
        L_0x001d:
            java.lang.Class r1 = getMin
            super.hashCode()     // Catch:{ all -> 0x0176 }
            if (r1 == 0) goto L_0x0025
            goto L_0x0074
        L_0x0025:
            java.lang.ClassLoader r9 = r9.getClassLoader()
            java.lang.String[] r1 = new java.lang.String[r0]
            r5 = 206(0xce, float:2.89E-43)
            byte[] r6 = toFloatRange
            r7 = 20
            byte r7 = r6[r7]
            int r7 = -r7
            byte r7 = (byte) r7
            r8 = 396(0x18c, float:5.55E-43)
            byte r6 = r6[r8]
            byte r6 = (byte) r6
            java.lang.String r5 = getMin((short) r5, (byte) r7, (byte) r6)
            r1[r3] = r5
            r5 = 226(0xe2, float:3.17E-43)
            byte[] r6 = toFloatRange
            r7 = 167(0xa7, float:2.34E-43)
            byte r7 = r6[r7]
            byte r7 = (byte) r7
            byte r6 = r6[r8]
            byte r6 = (byte) r6
            java.lang.String r5 = getMin((short) r5, (byte) r7, (byte) r6)
            r1[r2] = r5
            int r5 = values
            r6 = r5 ^ 59
            r5 = r5 & 59
            int r5 = r5 << r2
            int r6 = r6 + r5
            int r5 = r6 % 128
            toDoubleRange = r5
            int r6 = r6 % r0
            r5 = 0
        L_0x0060:
            r6 = 66
            if (r5 < r0) goto L_0x0067
            r7 = 98
            goto L_0x0069
        L_0x0067:
            r7 = 66
        L_0x0069:
            if (r7 == r6) goto L_0x006c
            goto L_0x0074
        L_0x006c:
            r6 = r1[r5]
            java.lang.Class r6 = r9.loadClass(r6)     // Catch:{ ClassNotFoundException -> 0x0171 }
            getMin = r6     // Catch:{ ClassNotFoundException -> 0x0171 }
        L_0x0074:
            java.lang.Class r9 = getMin
            if (r9 != 0) goto L_0x007a
            r9 = 1
            goto L_0x007b
        L_0x007a:
            r9 = 0
        L_0x007b:
            r1 = 39
            if (r9 == r2) goto L_0x00b2
            int r9 = values
            r5 = r9 | 69
            int r5 = r5 << r2
            r9 = r9 ^ 69
            int r5 = r5 - r9
            int r9 = r5 % 128
            toDoubleRange = r9
            int r5 = r5 % r0
            r9 = 384(0x180, float:5.38E-43)
            byte[] r5 = toFloatRange     // Catch:{ Exception -> 0x00b2 }
            r6 = 102(0x66, float:1.43E-43)
            byte r5 = r5[r6]     // Catch:{ Exception -> 0x00b2 }
            int r5 = -r5
            byte r5 = (byte) r5     // Catch:{ Exception -> 0x00b2 }
            byte[] r6 = toFloatRange     // Catch:{ Exception -> 0x00b2 }
            byte r6 = r6[r1]     // Catch:{ Exception -> 0x00b2 }
            byte r6 = (byte) r6     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r9 = getMin((short) r9, (byte) r5, (byte) r6)     // Catch:{ Exception -> 0x00b2 }
            java.lang.Class r5 = getMin     // Catch:{ Exception -> 0x00b2 }
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00b2 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r3] = r7     // Catch:{ Exception -> 0x00b2 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00b2 }
            r7[r3] = r10     // Catch:{ Exception -> 0x00b2 }
            java.lang.Object r9 = getMin(r9, r5, r6, r7, r11)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00b2 }
            goto L_0x00b3
        L_0x00b2:
            r9 = r4
        L_0x00b3:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00e5 }
            r5.<init>()     // Catch:{ IOException -> 0x00e5 }
            r6 = 474(0x1da, float:6.64E-43)
            r7 = 74
            byte[] r8 = toFloatRange     // Catch:{ IOException -> 0x00e5 }
            byte r1 = r8[r1]     // Catch:{ IOException -> 0x00e5 }
            byte r1 = (byte) r1     // Catch:{ IOException -> 0x00e5 }
            java.lang.String r1 = getMin((short) r6, (byte) r7, (byte) r1)     // Catch:{ IOException -> 0x00e5 }
            r5.append(r1)     // Catch:{ IOException -> 0x00e5 }
            r5.append(r10)     // Catch:{ IOException -> 0x00e5 }
            java.lang.String r10 = r5.toString()     // Catch:{ IOException -> 0x00e5 }
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ IOException -> 0x00e5 }
            r1[r3] = r10     // Catch:{ IOException -> 0x00e5 }
            java.lang.String r10 = setMax((java.lang.String[]) r1, (boolean) r3, (o.unregisterListener.length) r11)     // Catch:{ IOException -> 0x00e5 }
            java.lang.String r10 = r10.trim()     // Catch:{ IOException -> 0x00e5 }
            int r1 = toDoubleRange
            int r1 = r1 + 103
            int r5 = r1 % 128
            values = r5
            int r1 = r1 % r0
            goto L_0x00e6
        L_0x00e5:
            r10 = r4
        L_0x00e6:
            if (r9 != 0) goto L_0x00e9
            goto L_0x012c
        L_0x00e9:
            int r1 = toDoubleRange
            r5 = r1 | 97
            int r5 = r5 << r2
            r1 = r1 ^ 97
            int r5 = r5 - r1
            int r1 = r5 % 128
            values = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L_0x00fb
            if (r10 != 0) goto L_0x00fd
            goto L_0x012c
        L_0x00fb:
            if (r10 == 0) goto L_0x012c
        L_0x00fd:
            boolean r1 = r9.equals(r10)
            if (r1 != 0) goto L_0x0105
            r1 = 0
            goto L_0x0106
        L_0x0105:
            r1 = 1
        L_0x0106:
            if (r1 == r2) goto L_0x012b
            if (r11 != 0) goto L_0x010b
            goto L_0x012c
        L_0x010b:
            int r1 = values
            int r1 = r1 + 116
            int r1 = r1 - r2
            int r5 = r1 % 128
            toDoubleRange = r5
            int r1 = r1 % r0
            java.util.Set r1 = o.unregisterListener.length.length(r11)
            o.unregisterListener$setMin r5 = o.unregisterListener.setMin.getMax
            r1.add(r5)
            r11.setMax(r3)
            int r11 = values
            int r11 = r11 + 29
            int r1 = r11 % 128
            toDoubleRange = r1
            int r11 = r11 % r0
            goto L_0x012c
        L_0x012b:
            return r9
        L_0x012c:
            if (r9 != 0) goto L_0x012f
            goto L_0x0130
        L_0x012f:
            r3 = 1
        L_0x0130:
            if (r3 == 0) goto L_0x014e
            int r10 = toDoubleRange
            int r10 = r10 + 12
            int r10 = r10 - r2
            int r11 = r10 % 128
            values = r11
            int r10 = r10 % r0
            r11 = 30
            if (r10 != 0) goto L_0x0143
            r10 = 30
            goto L_0x0145
        L_0x0143:
            r10 = 79
        L_0x0145:
            if (r10 == r11) goto L_0x014d
            super.hashCode()     // Catch:{ all -> 0x014b }
            return r9
        L_0x014b:
            r9 = move-exception
            throw r9
        L_0x014d:
            return r9
        L_0x014e:
            if (r10 != 0) goto L_0x0152
            r9 = 2
            goto L_0x0154
        L_0x0152:
            r9 = 56
        L_0x0154:
            if (r9 == r0) goto L_0x0161
            int r9 = toDoubleRange
            int r9 = r9 + 78
            int r9 = r9 - r2
            int r11 = r9 % 128
            values = r11
            int r9 = r9 % r0
            return r10
        L_0x0161:
            java.lang.String r9 = ""
            int r10 = toDoubleRange
            r11 = r10 ^ 97
            r10 = r10 & 97
            int r10 = r10 << r2
            int r11 = r11 + r10
            int r10 = r11 % 128
            values = r10
            int r11 = r11 % r0
            return r9
        L_0x0171:
            int r5 = r5 + 2
            int r5 = r5 - r2
            goto L_0x0060
        L_0x0176:
            r9 = move-exception
            goto L_0x0179
        L_0x0178:
            throw r9
        L_0x0179:
            goto L_0x0178
        */
        throw new UnsupportedOperationException("Method not decompiled: o.unregisterListener.getMax(android.content.Context, java.lang.String, o.unregisterListener$length):java.lang.String");
    }

    public static boolean getMin(Context context, String str, length length2) {
        int i = values;
        int i2 = (i & 89) + (i | 89);
        toDoubleRange = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (!(((Integer) getMin(getMin(291, (byte) toFloatRange[587], (byte) toFloatRange[655]), context, new Class[]{String.class}, new Object[]{str}, length2)).intValue() != 0)) {
                int i4 = toDoubleRange;
                int i5 = (i4 & 73) + (i4 | 73);
                values = i5 % 128;
                return (i5 % 2 == 0 ? '[' : 'P') != 'P';
            }
            int i6 = toDoubleRange;
            int i7 = (i6 & 75) + (i6 | 75);
            values = i7 % 128;
            int i8 = i7 % 2;
            return false;
        } catch (Exception unused) {
            new RuntimeException();
            if (!(((Integer) Class.forName(getMin(624, (byte) toFloatRange[18], (byte) toFloatRange[396])).getMethod(getMin(291, (byte) toFloatRange[587], (byte) toFloatRange[655]), new Class[]{String.class}).invoke(context, new Object[]{str})).intValue() == 0)) {
                return false;
            }
            int i9 = (values + 16) - 1;
            toDoubleRange = i9 % 128;
            int i10 = i9 % 2;
            return true;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
