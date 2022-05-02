package o;

import com.google.common.base.Preconditions;
import io.split.android.client.storage.mysegments.MySegmentsStorage;

public final class setTransparentForImageViewInFragment {
    private MySegmentsStorage getMin;

    public setTransparentForImageViewInFragment(MySegmentsStorage mySegmentsStorage) {
        this.getMin = (MySegmentsStorage) Preconditions.checkNotNull(mySegmentsStorage);
    }

    /* renamed from: o.setTransparentForImageViewInFragment$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.split.android.client.dtos.MatcherType[] r0 = io.split.android.client.dtos.MatcherType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMax = r0
                io.split.android.client.dtos.MatcherType r1 = io.split.android.client.dtos.MatcherType.ALL_KEYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x001d }
                io.split.android.client.dtos.MatcherType r1 = io.split.android.client.dtos.MatcherType.IN_SEGMENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.split.android.client.dtos.MatcherType r1 = io.split.android.client.dtos.MatcherType.WHITELIST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.split.android.client.dtos.MatcherType r1 = io.split.android.client.dtos.MatcherType.EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x003e }
                io.split.android.client.dtos.MatcherType r1 = io.split.android.client.dtos.MatcherType.GREATER_THAN_OR_EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0049 }
                io.split.android.client.dtos.MatcherType r1 = io.split.android.client.dtos.MatcherType.LESS_THAN_OR_EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0054 }
                io.split.android.client.dtos.MatcherType r1 = io.split.android.client.dtos.MatcherType.BETWEEN     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0060 }
                io.split.android.client.dtos.MatcherType r1 = io.split.android.client.dtos.MatcherType.EQUAL_TO_SET     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x006c }
                io.split.android.client.dtos.MatcherType r1 = io.split.android.client.dtos.MatcherType.PART_OF_SET     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0078 }
                io.split.android.client.dtos.MatcherType r1 = io.split.android.client.dtos.MatcherType.CONTAINS_ALL_OF_SET     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0084 }
                io.split.android.client.dtos.MatcherType r1 = io.split.android.client.dtos.MatcherType.CONTAINS_ANY_OF_SET     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0090 }
                io.split.android.client.dtos.MatcherType r1 = io.split.android.client.dtos.MatcherType.STARTS_WITH     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x009c }
                io.split.android.client.dtos.MatcherType r1 = io.split.android.client.dtos.MatcherType.ENDS_WITH     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x00a8 }
                io.split.android.client.dtos.MatcherType r1 = io.split.android.client.dtos.MatcherType.CONTAINS_STRING     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x00b4 }
                io.split.android.client.dtos.MatcherType r1 = io.split.android.client.dtos.MatcherType.MATCHES_STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x00c0 }
                io.split.android.client.dtos.MatcherType r1 = io.split.android.client.dtos.MatcherType.IN_SPLIT_TREATMENT     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x00cc }
                io.split.android.client.dtos.MatcherType r1 = io.split.android.client.dtos.MatcherType.EQUAL_TO_BOOLEAN     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setTransparentForImageViewInFragment.AnonymousClass1.<clinit>():void");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: o.b$2$2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: o.clearPreviousSetting} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: o.addTranslucentView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: o.setTransparentForWindow} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: o.createRedirectHandler} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: o.createHttpProcessor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: o.createStatusBarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: o.createHttpContext} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: o.b$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: o.createConnectionKeepAliveStrategy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: o.getConnectionManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: o.isRedirectRequested} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: o.setMeizuStatusBarDarkIcon} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: o.setDarkMode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: o.setTranslucentForImageViewInFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: o.createTranslucentStatusBarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: o.hideFakeStatusBarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: o.hideFakeStatusBarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v37, resolved type: o.hideFakeStatusBarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v38, resolved type: o.hideFakeStatusBarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v45, resolved type: o.hideFakeStatusBarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v39, resolved type: o.hideFakeStatusBarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v40, resolved type: o.hideFakeStatusBarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v41, resolved type: o.hideFakeStatusBarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v42, resolved type: o.hideFakeStatusBarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v43, resolved type: o.hideFakeStatusBarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v44, resolved type: o.hideFakeStatusBarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v45, resolved type: o.hideFakeStatusBarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v47, resolved type: o.hideFakeStatusBarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v48, resolved type: o.hideFakeStatusBarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v49, resolved type: o.hideFakeStatusBarView} */
    /* JADX WARNING: type inference failed for: r11v26 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.setLightMode setMax(@androidx.annotation.Nullable io.split.android.client.dtos.Split r21) {
        /*
            r20 = this;
            r1 = r21
            r2 = 0
            if (r1 != 0) goto L_0x0006
            return r2
        L_0x0006:
            r3 = 0
            r4 = 1
            io.split.android.client.dtos.Status r0 = r1.status     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.Status r5 = io.split.android.client.dtos.Status.ACTIVE     // Catch:{ all -> 0x0256 }
            if (r0 == r5) goto L_0x000f
            return r2
        L_0x000f:
            java.util.List<io.split.android.client.dtos.Condition> r0 = r1.conditions     // Catch:{ all -> 0x0256 }
            int r0 = r0.size()     // Catch:{ all -> 0x0256 }
            r5 = 50
            if (r0 <= r5) goto L_0x0032
            java.lang.String r0 = "Dropping Split name=%s due to large number of conditions(%d)"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0256 }
            java.lang.String r6 = r1.name     // Catch:{ all -> 0x0256 }
            r5[r3] = r6     // Catch:{ all -> 0x0256 }
            java.util.List<io.split.android.client.dtos.Condition> r6 = r1.conditions     // Catch:{ all -> 0x0256 }
            int r6 = r6.size()     // Catch:{ all -> 0x0256 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0256 }
            r5[r4] = r6     // Catch:{ all -> 0x0256 }
            o.createLoadingDialog.w((java.lang.String) r0, (java.lang.Object[]) r5)     // Catch:{ all -> 0x0256 }
            return r2
        L_0x0032:
            java.util.ArrayList r12 = com.google.common.collect.Lists.newArrayList()     // Catch:{ all -> 0x0256 }
            java.util.List<io.split.android.client.dtos.Condition> r0 = r1.conditions     // Catch:{ all -> 0x0256 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0256 }
        L_0x003c:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x0256 }
            if (r5 == 0) goto L_0x022b
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.Condition r5 = (io.split.android.client.dtos.Condition) r5     // Catch:{ all -> 0x0256 }
            java.util.List<io.split.android.client.dtos.Partition> r6 = r5.partitions     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.MatcherGroup r7 = r5.matcherGroup     // Catch:{ all -> 0x0256 }
            java.util.List<io.split.android.client.dtos.Matcher> r8 = r7.matchers     // Catch:{ all -> 0x0256 }
            boolean r9 = r8.isEmpty()     // Catch:{ all -> 0x0256 }
            if (r9 != 0) goto L_0x0056
            r9 = 1
            goto L_0x0057
        L_0x0056:
            r9 = 0
        L_0x0057:
            com.google.common.base.Preconditions.checkArgument(r9)     // Catch:{ all -> 0x0256 }
            java.util.ArrayList r9 = com.google.common.collect.Lists.newArrayList()     // Catch:{ all -> 0x0256 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0256 }
        L_0x0062:
            boolean r10 = r8.hasNext()     // Catch:{ all -> 0x0256 }
            if (r10 == 0) goto L_0x0212
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.Matcher r10 = (io.split.android.client.dtos.Matcher) r10     // Catch:{ all -> 0x0256 }
            int[] r11 = o.setTransparentForImageViewInFragment.AnonymousClass1.getMax     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.MatcherType r13 = r10.matcherType     // Catch:{ all -> 0x0256 }
            int r13 = r13.ordinal()     // Catch:{ all -> 0x0256 }
            r11 = r11[r13]     // Catch:{ all -> 0x0256 }
            java.lang.String r13 = "MatcherType is "
            switch(r11) {
                case 1: goto L_0x01c6;
                case 2: goto L_0x01af;
                case 3: goto L_0x019f;
                case 4: goto L_0x018b;
                case 5: goto L_0x0177;
                case 6: goto L_0x0163;
                case 7: goto L_0x0146;
                case 8: goto L_0x0137;
                case 9: goto L_0x0128;
                case 10: goto L_0x0119;
                case 11: goto L_0x010a;
                case 12: goto L_0x00fb;
                case 13: goto L_0x00ec;
                case 14: goto L_0x00dd;
                case 15: goto L_0x00cd;
                case 16: goto L_0x00a7;
                case 17: goto L_0x0083;
                default: goto L_0x007d;
            }
        L_0x007d:
            r2 = r20
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0254 }
            goto L_0x01fe
        L_0x0083:
            java.lang.Boolean r11 = r10.booleanMatcherData     // Catch:{ all -> 0x0256 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0256 }
            r14.<init>(r13)     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.MatcherType r13 = r10.matcherType     // Catch:{ all -> 0x0256 }
            r14.append(r13)     // Catch:{ all -> 0x0256 }
            java.lang.String r13 = ". matcher.booleanMatcherData() MUST NOT BE null"
            r14.append(r13)     // Catch:{ all -> 0x0256 }
            java.lang.String r13 = r14.toString()     // Catch:{ all -> 0x0256 }
            com.google.common.base.Preconditions.checkNotNull(r11, r13)     // Catch:{ all -> 0x0256 }
            o.setDarkMode r11 = new o.setDarkMode     // Catch:{ all -> 0x0256 }
            java.lang.Boolean r13 = r10.booleanMatcherData     // Catch:{ all -> 0x0256 }
            boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x0256 }
            r11.<init>(r13)     // Catch:{ all -> 0x0256 }
            goto L_0x00d9
        L_0x00a7:
            io.split.android.client.dtos.DependencyMatcherData r11 = r10.dependencyMatcherData     // Catch:{ all -> 0x0256 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0256 }
            r14.<init>(r13)     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.MatcherType r13 = r10.matcherType     // Catch:{ all -> 0x0256 }
            r14.append(r13)     // Catch:{ all -> 0x0256 }
            java.lang.String r13 = ". matcher.dependencyMatcherData() MUST NOT BE null"
            r14.append(r13)     // Catch:{ all -> 0x0256 }
            java.lang.String r13 = r14.toString()     // Catch:{ all -> 0x0256 }
            com.google.common.base.Preconditions.checkNotNull(r11, r13)     // Catch:{ all -> 0x0256 }
            o.setMeizuStatusBarDarkIcon r11 = new o.setMeizuStatusBarDarkIcon     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.DependencyMatcherData r13 = r10.dependencyMatcherData     // Catch:{ all -> 0x0256 }
            java.lang.String r13 = r13.split     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.DependencyMatcherData r14 = r10.dependencyMatcherData     // Catch:{ all -> 0x0256 }
            java.util.List<java.lang.String> r14 = r14.treatments     // Catch:{ all -> 0x0256 }
            r11.<init>(r13, r14)     // Catch:{ all -> 0x0256 }
            goto L_0x00d9
        L_0x00cd:
            java.lang.String r11 = r10.stringMatcherData     // Catch:{ all -> 0x0256 }
            com.google.common.base.Preconditions.checkNotNull(r11)     // Catch:{ all -> 0x0256 }
            o.isRedirectRequested r11 = new o.isRedirectRequested     // Catch:{ all -> 0x0256 }
            java.lang.String r13 = r10.stringMatcherData     // Catch:{ all -> 0x0256 }
            r11.<init>(r13)     // Catch:{ all -> 0x0256 }
        L_0x00d9:
            r2 = r20
            goto L_0x01cd
        L_0x00dd:
            io.split.android.client.dtos.WhitelistMatcherData r11 = r10.whitelistMatcherData     // Catch:{ all -> 0x0256 }
            com.google.common.base.Preconditions.checkNotNull(r11)     // Catch:{ all -> 0x0256 }
            o.getConnectionManager r11 = new o.getConnectionManager     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.WhitelistMatcherData r13 = r10.whitelistMatcherData     // Catch:{ all -> 0x0256 }
            java.util.List<java.lang.String> r13 = r13.whitelist     // Catch:{ all -> 0x0256 }
            r11.<init>(r13)     // Catch:{ all -> 0x0256 }
            goto L_0x00d9
        L_0x00ec:
            io.split.android.client.dtos.WhitelistMatcherData r11 = r10.whitelistMatcherData     // Catch:{ all -> 0x0256 }
            com.google.common.base.Preconditions.checkNotNull(r11)     // Catch:{ all -> 0x0256 }
            o.createConnectionKeepAliveStrategy r11 = new o.createConnectionKeepAliveStrategy     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.WhitelistMatcherData r13 = r10.whitelistMatcherData     // Catch:{ all -> 0x0256 }
            java.util.List<java.lang.String> r13 = r13.whitelist     // Catch:{ all -> 0x0256 }
            r11.<init>(r13)     // Catch:{ all -> 0x0256 }
            goto L_0x00d9
        L_0x00fb:
            io.split.android.client.dtos.WhitelistMatcherData r11 = r10.whitelistMatcherData     // Catch:{ all -> 0x0256 }
            com.google.common.base.Preconditions.checkNotNull(r11)     // Catch:{ all -> 0x0256 }
            o.b$2$1 r11 = new o.b$2$1     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.WhitelistMatcherData r13 = r10.whitelistMatcherData     // Catch:{ all -> 0x0256 }
            java.util.List<java.lang.String> r13 = r13.whitelist     // Catch:{ all -> 0x0256 }
            r11.<init>(r13)     // Catch:{ all -> 0x0256 }
            goto L_0x00d9
        L_0x010a:
            io.split.android.client.dtos.WhitelistMatcherData r11 = r10.whitelistMatcherData     // Catch:{ all -> 0x0256 }
            com.google.common.base.Preconditions.checkNotNull(r11)     // Catch:{ all -> 0x0256 }
            o.createHttpContext r11 = new o.createHttpContext     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.WhitelistMatcherData r13 = r10.whitelistMatcherData     // Catch:{ all -> 0x0256 }
            java.util.List<java.lang.String> r13 = r13.whitelist     // Catch:{ all -> 0x0256 }
            r11.<init>(r13)     // Catch:{ all -> 0x0256 }
            goto L_0x00d9
        L_0x0119:
            io.split.android.client.dtos.WhitelistMatcherData r11 = r10.whitelistMatcherData     // Catch:{ all -> 0x0256 }
            com.google.common.base.Preconditions.checkNotNull(r11)     // Catch:{ all -> 0x0256 }
            o.createStatusBarView r11 = new o.createStatusBarView     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.WhitelistMatcherData r13 = r10.whitelistMatcherData     // Catch:{ all -> 0x0256 }
            java.util.List<java.lang.String> r13 = r13.whitelist     // Catch:{ all -> 0x0256 }
            r11.<init>(r13)     // Catch:{ all -> 0x0256 }
            goto L_0x00d9
        L_0x0128:
            io.split.android.client.dtos.WhitelistMatcherData r11 = r10.whitelistMatcherData     // Catch:{ all -> 0x0256 }
            com.google.common.base.Preconditions.checkNotNull(r11)     // Catch:{ all -> 0x0256 }
            o.createHttpProcessor r11 = new o.createHttpProcessor     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.WhitelistMatcherData r13 = r10.whitelistMatcherData     // Catch:{ all -> 0x0256 }
            java.util.List<java.lang.String> r13 = r13.whitelist     // Catch:{ all -> 0x0256 }
            r11.<init>(r13)     // Catch:{ all -> 0x0256 }
            goto L_0x00d9
        L_0x0137:
            io.split.android.client.dtos.WhitelistMatcherData r11 = r10.whitelistMatcherData     // Catch:{ all -> 0x0256 }
            com.google.common.base.Preconditions.checkNotNull(r11)     // Catch:{ all -> 0x0256 }
            o.createRedirectHandler r11 = new o.createRedirectHandler     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.WhitelistMatcherData r13 = r10.whitelistMatcherData     // Catch:{ all -> 0x0256 }
            java.util.List<java.lang.String> r13 = r13.whitelist     // Catch:{ all -> 0x0256 }
            r11.<init>(r13)     // Catch:{ all -> 0x0256 }
            goto L_0x00d9
        L_0x0146:
            io.split.android.client.dtos.BetweenMatcherData r11 = r10.betweenMatcherData     // Catch:{ all -> 0x0256 }
            com.google.common.base.Preconditions.checkNotNull(r11)     // Catch:{ all -> 0x0256 }
            o.hideFakeStatusBarView r11 = new o.hideFakeStatusBarView     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.BetweenMatcherData r13 = r10.betweenMatcherData     // Catch:{ all -> 0x0256 }
            long r14 = r13.start     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.BetweenMatcherData r13 = r10.betweenMatcherData     // Catch:{ all -> 0x0256 }
            long r2 = r13.end     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.BetweenMatcherData r13 = r10.betweenMatcherData     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.DataType r13 = r13.dataType     // Catch:{ all -> 0x0256 }
            r18 = r13
            r13 = r11
            r16 = r2
            r13.<init>(r14, r16, r18)     // Catch:{ all -> 0x0256 }
            goto L_0x00d9
        L_0x0163:
            io.split.android.client.dtos.UnaryNumericMatcherData r2 = r10.unaryNumericMatcherData     // Catch:{ all -> 0x0256 }
            com.google.common.base.Preconditions.checkNotNull(r2)     // Catch:{ all -> 0x0256 }
            o.setTransparentForWindow r11 = new o.setTransparentForWindow     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.UnaryNumericMatcherData r2 = r10.unaryNumericMatcherData     // Catch:{ all -> 0x0256 }
            long r2 = r2.value     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.UnaryNumericMatcherData r13 = r10.unaryNumericMatcherData     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.DataType r13 = r13.dataType     // Catch:{ all -> 0x0256 }
            r11.<init>(r2, r13)     // Catch:{ all -> 0x0256 }
            goto L_0x00d9
        L_0x0177:
            io.split.android.client.dtos.UnaryNumericMatcherData r2 = r10.unaryNumericMatcherData     // Catch:{ all -> 0x0256 }
            com.google.common.base.Preconditions.checkNotNull(r2)     // Catch:{ all -> 0x0256 }
            o.addTranslucentView r11 = new o.addTranslucentView     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.UnaryNumericMatcherData r2 = r10.unaryNumericMatcherData     // Catch:{ all -> 0x0256 }
            long r2 = r2.value     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.UnaryNumericMatcherData r13 = r10.unaryNumericMatcherData     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.DataType r13 = r13.dataType     // Catch:{ all -> 0x0256 }
            r11.<init>(r2, r13)     // Catch:{ all -> 0x0256 }
            goto L_0x00d9
        L_0x018b:
            io.split.android.client.dtos.UnaryNumericMatcherData r2 = r10.unaryNumericMatcherData     // Catch:{ all -> 0x0256 }
            com.google.common.base.Preconditions.checkNotNull(r2)     // Catch:{ all -> 0x0256 }
            o.clearPreviousSetting r11 = new o.clearPreviousSetting     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.UnaryNumericMatcherData r2 = r10.unaryNumericMatcherData     // Catch:{ all -> 0x0256 }
            long r2 = r2.value     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.UnaryNumericMatcherData r13 = r10.unaryNumericMatcherData     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.DataType r13 = r13.dataType     // Catch:{ all -> 0x0256 }
            r11.<init>(r2, r13)     // Catch:{ all -> 0x0256 }
            goto L_0x00d9
        L_0x019f:
            io.split.android.client.dtos.WhitelistMatcherData r2 = r10.whitelistMatcherData     // Catch:{ all -> 0x0256 }
            com.google.common.base.Preconditions.checkNotNull(r2)     // Catch:{ all -> 0x0256 }
            o.b$2$2 r11 = new o.b$2$2     // Catch:{ all -> 0x0256 }
            io.split.android.client.dtos.WhitelistMatcherData r2 = r10.whitelistMatcherData     // Catch:{ all -> 0x0256 }
            java.util.List<java.lang.String> r2 = r2.whitelist     // Catch:{ all -> 0x0256 }
            r11.<init>(r2)     // Catch:{ all -> 0x0256 }
            goto L_0x00d9
        L_0x01af:
            io.split.android.client.dtos.UserDefinedSegmentMatcherData r2 = r10.userDefinedSegmentMatcherData     // Catch:{ all -> 0x0256 }
            com.google.common.base.Preconditions.checkNotNull(r2)     // Catch:{ all -> 0x0256 }
            o.createTranslucentStatusBarView r11 = new o.createTranslucentStatusBarView     // Catch:{ all -> 0x0256 }
            r2 = r20
            io.split.android.client.storage.mysegments.MySegmentsStorage r3 = r2.getMin     // Catch:{ all -> 0x0254 }
            java.util.Set r3 = r3.getAll()     // Catch:{ all -> 0x0254 }
            io.split.android.client.dtos.UserDefinedSegmentMatcherData r13 = r10.userDefinedSegmentMatcherData     // Catch:{ all -> 0x0254 }
            java.lang.String r13 = r13.segmentName     // Catch:{ all -> 0x0254 }
            r11.<init>(r3, r13)     // Catch:{ all -> 0x0254 }
            goto L_0x01cd
        L_0x01c6:
            r2 = r20
            o.setTranslucentForImageViewInFragment r11 = new o.setTranslucentForImageViewInFragment     // Catch:{ all -> 0x0254 }
            r11.<init>()     // Catch:{ all -> 0x0254 }
        L_0x01cd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0254 }
            java.lang.String r13 = "We were not able to create a matcher for: "
            r3.<init>(r13)     // Catch:{ all -> 0x0254 }
            io.split.android.client.dtos.MatcherType r13 = r10.matcherType     // Catch:{ all -> 0x0254 }
            r3.append(r13)     // Catch:{ all -> 0x0254 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0254 }
            com.google.common.base.Preconditions.checkNotNull(r11, r3)     // Catch:{ all -> 0x0254 }
            io.split.android.client.dtos.KeySelector r3 = r10.keySelector     // Catch:{ all -> 0x0254 }
            if (r3 == 0) goto L_0x01ef
            io.split.android.client.dtos.KeySelector r3 = r10.keySelector     // Catch:{ all -> 0x0254 }
            java.lang.String r3 = r3.attribute     // Catch:{ all -> 0x0254 }
            if (r3 == 0) goto L_0x01ef
            io.split.android.client.dtos.KeySelector r3 = r10.keySelector     // Catch:{ all -> 0x0254 }
            java.lang.String r3 = r3.attribute     // Catch:{ all -> 0x0254 }
            goto L_0x01f0
        L_0x01ef:
            r3 = 0
        L_0x01f0:
            boolean r10 = r10.negate     // Catch:{ all -> 0x0254 }
            o.setTranslucentForImageView r13 = new o.setTranslucentForImageView     // Catch:{ all -> 0x0254 }
            r13.<init>(r3, r11, r10)     // Catch:{ all -> 0x0254 }
            r9.add(r13)     // Catch:{ all -> 0x0254 }
            r2 = 0
            r3 = 0
            goto L_0x0062
        L_0x01fe:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0254 }
            java.lang.String r5 = "Unknown matcher type: "
            r3.<init>(r5)     // Catch:{ all -> 0x0254 }
            io.split.android.client.dtos.MatcherType r5 = r10.matcherType     // Catch:{ all -> 0x0254 }
            r3.append(r5)     // Catch:{ all -> 0x0254 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0254 }
            r0.<init>(r3)     // Catch:{ all -> 0x0254 }
            throw r0     // Catch:{ all -> 0x0254 }
        L_0x0212:
            r2 = r20
            o.setMIUIStatusBarDarkIcon r3 = new o.setMIUIStatusBarDarkIcon     // Catch:{ all -> 0x0254 }
            io.split.android.client.dtos.MatcherCombiner r7 = r7.combiner     // Catch:{ all -> 0x0254 }
            r3.<init>(r7, r9)     // Catch:{ all -> 0x0254 }
            o.setTransparent r7 = new o.setTransparent     // Catch:{ all -> 0x0254 }
            io.split.android.client.dtos.ConditionType r8 = r5.conditionType     // Catch:{ all -> 0x0254 }
            java.lang.String r5 = r5.label     // Catch:{ all -> 0x0254 }
            r7.<init>(r8, r3, r6, r5)     // Catch:{ all -> 0x0254 }
            r12.add(r7)     // Catch:{ all -> 0x0254 }
            r2 = 0
            r3 = 0
            goto L_0x003c
        L_0x022b:
            r2 = r20
            o.setLightMode r0 = new o.setLightMode     // Catch:{ all -> 0x0254 }
            java.lang.String r8 = r1.name     // Catch:{ all -> 0x0254 }
            int r9 = r1.seed     // Catch:{ all -> 0x0254 }
            boolean r10 = r1.killed     // Catch:{ all -> 0x0254 }
            java.lang.String r11 = r1.defaultTreatment     // Catch:{ all -> 0x0254 }
            java.lang.String r13 = r1.trafficTypeName     // Catch:{ all -> 0x0254 }
            long r14 = r1.changeNumber     // Catch:{ all -> 0x0254 }
            java.lang.Integer r3 = r1.trafficAllocation     // Catch:{ all -> 0x0254 }
            int r16 = r3.intValue()     // Catch:{ all -> 0x0254 }
            java.lang.Integer r3 = r1.trafficAllocationSeed     // Catch:{ all -> 0x0254 }
            int r17 = r3.intValue()     // Catch:{ all -> 0x0254 }
            int r3 = r1.algo     // Catch:{ all -> 0x0254 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r1.configurations     // Catch:{ all -> 0x0254 }
            r7 = r0
            r18 = r3
            r19 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19)     // Catch:{ all -> 0x0254 }
            return r0
        L_0x0254:
            r0 = move-exception
            goto L_0x0259
        L_0x0256:
            r0 = move-exception
            r2 = r20
        L_0x0259:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "Could not parse split: %s"
            o.createLoadingDialog.e(r0, r1, r3)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTransparentForImageViewInFragment.setMax(io.split.android.client.dtos.Split):o.setLightMode");
    }
}
