package com.alibaba.ariver.resource.api.prepare;

public enum UpdateMode {
    SYNC_FORCE(2),
    SYNC_TRY(1),
    ASYNC(0);
    
    public int value;

    private UpdateMode(int i) {
        this.value = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.alibaba.ariver.resource.api.prepare.UpdateMode fromString(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = -1742480064(0xffffffff9823dd40, float:-2.1178959E-24)
            r2 = 1
            if (r0 == r1) goto L_0x001b
            r1 = 500881712(0x1ddad930, float:5.7928686E-21)
            if (r0 == r1) goto L_0x0010
            goto L_0x0026
        L_0x0010:
            java.lang.String r0 = "syncforce"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0026
            r3 = 1
            goto L_0x0027
        L_0x001b:
            java.lang.String r0 = "synctry"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0026
            r3 = 0
            goto L_0x0027
        L_0x0026:
            r3 = -1
        L_0x0027:
            if (r3 == 0) goto L_0x0031
            if (r3 == r2) goto L_0x002e
            com.alibaba.ariver.resource.api.prepare.UpdateMode r3 = ASYNC
            return r3
        L_0x002e:
            com.alibaba.ariver.resource.api.prepare.UpdateMode r3 = SYNC_FORCE
            return r3
        L_0x0031:
            com.alibaba.ariver.resource.api.prepare.UpdateMode r3 = SYNC_TRY
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.api.prepare.UpdateMode.fromString(java.lang.String):com.alibaba.ariver.resource.api.prepare.UpdateMode");
    }

    /* renamed from: com.alibaba.ariver.resource.api.prepare.UpdateMode$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$ariver$resource$api$prepare$UpdateMode = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.alibaba.ariver.resource.api.prepare.UpdateMode[] r0 = com.alibaba.ariver.resource.api.prepare.UpdateMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$alibaba$ariver$resource$api$prepare$UpdateMode = r0
                com.alibaba.ariver.resource.api.prepare.UpdateMode r1 = com.alibaba.ariver.resource.api.prepare.UpdateMode.SYNC_FORCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$alibaba$ariver$resource$api$prepare$UpdateMode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alibaba.ariver.resource.api.prepare.UpdateMode r1 = com.alibaba.ariver.resource.api.prepare.UpdateMode.SYNC_TRY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$alibaba$ariver$resource$api$prepare$UpdateMode     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alibaba.ariver.resource.api.prepare.UpdateMode r1 = com.alibaba.ariver.resource.api.prepare.UpdateMode.ASYNC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.api.prepare.UpdateMode.AnonymousClass1.<clinit>():void");
        }
    }

    public final String toReqMode() {
        int i = AnonymousClass1.$SwitchMap$com$alibaba$ariver$resource$api$prepare$UpdateMode[ordinal()];
        if (i != 1) {
            return i != 2 ? "async" : "synctry";
        }
        return "syncforce";
    }

    public final boolean isSync() {
        return this.value > 0;
    }
}
