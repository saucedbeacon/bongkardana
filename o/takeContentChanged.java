package o;

final class takeContentChanged {
    final String getMax;
    final boolean length;
    final String setMin;

    private takeContentChanged(String str, String str2, boolean z) {
        this.getMax = str;
        this.setMin = str2;
        this.length = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e A[Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8 A[Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00bc A[Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c6 A[Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static o.takeContentChanged setMin(java.lang.String r11) {
        /*
            java.lang.String r0 = "https://"
            r1 = 0
            r2 = 0
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ce }
            byte[] r11 = android.util.Base64.decode(r11, r2)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ce }
            r3.<init>(r11)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ce }
            android.util.JsonReader r11 = new android.util.JsonReader     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ce }
            java.io.StringReader r4 = new java.io.StringReader     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ce }
            r4.<init>(r3)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ce }
            r11.<init>(r4)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ce }
            r11.beginObject()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00ce }
            r3 = r1
            r4 = 0
        L_0x001c:
            boolean r5 = r11.hasNext()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            if (r5 == 0) goto L_0x00d0
            java.lang.String r5 = r11.nextName()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            int r6 = r5.hashCode()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            r7 = 106079(0x19e5f, float:1.48648E-40)
            r8 = 2
            r9 = 1
            r10 = -1
            if (r6 == r7) goto L_0x0051
            r7 = 97513095(0x5cfee87, float:1.9553808E-35)
            if (r6 == r7) goto L_0x0047
            r7 = 1741102485(0x67c71d95, float:1.8805932E24)
            if (r6 == r7) goto L_0x003d
            goto L_0x005b
        L_0x003d:
            java.lang.String r6 = "endpoint"
            boolean r5 = r5.equals(r6)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            if (r5 == 0) goto L_0x005b
            r5 = 2
            goto L_0x005c
        L_0x0047:
            java.lang.String r6 = "flags"
            boolean r5 = r5.equals(r6)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            if (r5 == 0) goto L_0x005b
            r5 = 1
            goto L_0x005c
        L_0x0051:
            java.lang.String r6 = "key"
            boolean r5 = r5.equals(r6)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            if (r5 == 0) goto L_0x005b
            r5 = 0
            goto L_0x005c
        L_0x005b:
            r5 = -1
        L_0x005c:
            if (r5 == 0) goto L_0x00c6
            if (r5 == r9) goto L_0x0094
            if (r5 == r8) goto L_0x0066
            r11.skipValue()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            goto L_0x001c
        L_0x0066:
            java.lang.String r3 = r11.nextString()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            if (r3 == 0) goto L_0x001c
            java.lang.String r5 = "http://"
            boolean r5 = r3.startsWith(r5)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            if (r5 != 0) goto L_0x0082
            boolean r5 = r3.startsWith(r0)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            if (r5 != 0) goto L_0x0082
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            java.lang.String r3 = r0.concat(r5)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
        L_0x0082:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            r5.<init>()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            r5.append(r3)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            java.lang.String r6 = "/api/ingest/v0/events"
            r5.append(r6)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            java.lang.String r3 = r5.toString()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            goto L_0x001c
        L_0x0094:
            r11.beginObject()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
        L_0x0097:
            boolean r5 = r11.hasNext()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            if (r5 == 0) goto L_0x00c1
            java.lang.String r5 = r11.nextName()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            int r6 = r5.hashCode()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            r7 = 1932832503(0x7334aef7, float:1.4315218E31)
            if (r6 == r7) goto L_0x00ab
            goto L_0x00b5
        L_0x00ab:
            java.lang.String r6 = "heartbeats"
            boolean r5 = r5.equals(r6)     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            if (r5 == 0) goto L_0x00b5
            r5 = 0
            goto L_0x00b6
        L_0x00b5:
            r5 = -1
        L_0x00b6:
            if (r5 == 0) goto L_0x00bc
            r11.skipValue()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            goto L_0x0097
        L_0x00bc:
            boolean r4 = r11.nextBoolean()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            goto L_0x0097
        L_0x00c1:
            r11.endObject()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            goto L_0x001c
        L_0x00c6:
            java.lang.String r1 = r11.nextString()     // Catch:{ IOException | IllegalArgumentException | IllegalStateException -> 0x00cc }
            goto L_0x001c
        L_0x00cc:
            r2 = r4
            goto L_0x00cf
        L_0x00ce:
            r3 = r1
        L_0x00cf:
            r4 = r2
        L_0x00d0:
            o.takeContentChanged r11 = new o.takeContentChanged
            r11.<init>(r1, r3, r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.takeContentChanged.setMin(java.lang.String):o.takeContentChanged");
    }
}
