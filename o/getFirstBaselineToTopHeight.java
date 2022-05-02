package o;

import androidx.room.TypeConverter;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;

public final class getFirstBaselineToTopHeight {
    @TypeConverter
    public static int setMin(WorkInfo.State state) {
        switch (AnonymousClass2.length[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                StringBuilder sb = new StringBuilder("Could not convert ");
                sb.append(state);
                sb.append(" to int");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    @TypeConverter
    public static WorkInfo.State getMax(int i) {
        if (i == 0) {
            return WorkInfo.State.ENQUEUED;
        }
        if (i == 1) {
            return WorkInfo.State.RUNNING;
        }
        if (i == 2) {
            return WorkInfo.State.SUCCEEDED;
        }
        if (i == 3) {
            return WorkInfo.State.FAILED;
        }
        if (i == 4) {
            return WorkInfo.State.BLOCKED;
        }
        if (i == 5) {
            return WorkInfo.State.CANCELLED;
        }
        StringBuilder sb = new StringBuilder("Could not convert ");
        sb.append(i);
        sb.append(" to State");
        throw new IllegalArgumentException(sb.toString());
    }

    @TypeConverter
    public static BackoffPolicy setMin(int i) {
        if (i == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (i == 1) {
            return BackoffPolicy.LINEAR;
        }
        StringBuilder sb = new StringBuilder("Could not convert ");
        sb.append(i);
        sb.append(" to BackoffPolicy");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: o.getFirstBaselineToTopHeight$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getMin;
        static final /* synthetic */ int[] length;
        static final /* synthetic */ int[] setMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0074 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0092 */
        static {
            /*
                androidx.work.NetworkType[] r0 = androidx.work.NetworkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMax = r0
                r1 = 1
                androidx.work.NetworkType r2 = androidx.work.NetworkType.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = setMax     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.NetworkType r3 = androidx.work.NetworkType.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = setMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.work.NetworkType r4 = androidx.work.NetworkType.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = setMax     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.work.NetworkType r5 = androidx.work.NetworkType.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = setMax     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.work.NetworkType r6 = androidx.work.NetworkType.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                androidx.work.BackoffPolicy[] r5 = androidx.work.BackoffPolicy.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                getMin = r5
                androidx.work.BackoffPolicy r6 = androidx.work.BackoffPolicy.EXPONENTIAL     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r5 = getMin     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.work.BackoffPolicy r6 = androidx.work.BackoffPolicy.LINEAR     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                androidx.work.WorkInfo$State[] r5 = androidx.work.WorkInfo.State.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                length = r5
                androidx.work.WorkInfo$State r6 = androidx.work.WorkInfo.State.ENQUEUED     // Catch:{ NoSuchFieldError -> 0x006a }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = length     // Catch:{ NoSuchFieldError -> 0x0074 }
                androidx.work.WorkInfo$State r5 = androidx.work.WorkInfo.State.RUNNING     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x007e }
                androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.SUCCEEDED     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0088 }
                androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.FAILED     // Catch:{ NoSuchFieldError -> 0x0088 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0088 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0088 }
            L_0x0088:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0092 }
                androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.BLOCKED     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x009d }
                androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.CANCELLED     // Catch:{ NoSuchFieldError -> 0x009d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getFirstBaselineToTopHeight.AnonymousClass2.<clinit>():void");
        }
    }

    @TypeConverter
    public static NetworkType setMax(int i) {
        if (i == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (i == 1) {
            return NetworkType.CONNECTED;
        }
        if (i == 2) {
            return NetworkType.UNMETERED;
        }
        if (i == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (i == 4) {
            return NetworkType.METERED;
        }
        StringBuilder sb = new StringBuilder("Could not convert ");
        sb.append(i);
        sb.append(" to NetworkType");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|(0)|23|24|25) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042 A[SYNTHETIC, Splitter:B:21:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004c A[SYNTHETIC, Splitter:B:29:0x004c] */
    @androidx.room.TypeConverter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.AlertDialogLayout getMax(byte[] r6) {
        /*
            o.AlertDialogLayout r0 = new o.AlertDialogLayout
            r0.<init>()
            if (r6 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0049, all -> 0x003d }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0049, all -> 0x003d }
            int r6 = r2.readInt()     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
        L_0x0017:
            if (r6 <= 0) goto L_0x0032
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
            boolean r4 = r2.readBoolean()     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
            o.AlertDialogLayout$getMax r5 = new o.AlertDialogLayout$getMax     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
            r5.<init>(r3, r4)     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
            java.util.Set<o.AlertDialogLayout$getMax> r3 = r0.setMin     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
            r3.add(r5)     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
            int r6 = r6 + -1
            goto L_0x0017
        L_0x0032:
            r2.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            r1.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x0050
        L_0x0039:
            r6 = move-exception
            goto L_0x0040
        L_0x003b:
            r6 = r2
            goto L_0x004a
        L_0x003d:
            r0 = move-exception
            r2 = r6
            r6 = r0
        L_0x0040:
            if (r2 == 0) goto L_0x0045
            r2.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            r1.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            throw r6
        L_0x0049:
        L_0x004a:
            if (r6 == 0) goto L_0x0035
            r6.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0035
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getFirstBaselineToTopHeight.getMax(byte[]):o.AlertDialogLayout");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(0)|23|24|25) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0043 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0052 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f A[SYNTHETIC, Splitter:B:21:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059 A[SYNTHETIC, Splitter:B:29:0x0059] */
    @androidx.room.TypeConverter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] getMax(o.AlertDialogLayout r4) {
        /*
            java.util.Set<o.AlertDialogLayout$getMax> r0 = r4.setMin
            int r0 = r0.size()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0056, all -> 0x004c }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0056, all -> 0x004c }
            java.util.Set<o.AlertDialogLayout$getMax> r1 = r4.setMin     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            int r1 = r1.size()     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r2.writeInt(r1)     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            java.util.Set<o.AlertDialogLayout$getMax> r4 = r4.setMin     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
        L_0x0023:
            boolean r1 = r4.hasNext()     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            if (r1 == 0) goto L_0x0040
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            o.AlertDialogLayout$getMax r1 = (o.AlertDialogLayout.getMax) r1     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            android.net.Uri r3 = r1.setMax     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r2.writeUTF(r3)     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            boolean r1 = r1.getMax()     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r2.writeBoolean(r1)     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            goto L_0x0023
        L_0x0040:
            r2.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            r0.close()     // Catch:{ IOException -> 0x005d }
            goto L_0x005d
        L_0x0047:
            r4 = move-exception
            r1 = r2
            goto L_0x004d
        L_0x004a:
            r1 = r2
            goto L_0x0057
        L_0x004c:
            r4 = move-exception
        L_0x004d:
            if (r1 == 0) goto L_0x0052
            r1.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            r0.close()     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            throw r4
        L_0x0056:
        L_0x0057:
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0043
        L_0x005d:
            byte[] r4 = r0.toByteArray()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getFirstBaselineToTopHeight.getMax(o.AlertDialogLayout):byte[]");
    }
}
