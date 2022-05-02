package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import kotlin.text.Typography;

@ShowFirstParty
@KeepForSdk
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaf = {'u', 'l', 'l'};
    private static final char[] zag = {'r', 'u', 'e'};
    private static final char[] zah = {'r', 'u', 'e', Typography.quote};
    private static final char[] zai = {'a', 'l', 's', 'e'};
    private static final char[] zaj = {'a', 'l', 's', 'e', Typography.quote};
    private static final char[] zak = {10};
    private static final zaa<Integer> zam = new zaa();
    private static final zaa<Long> zan = new zac();
    private static final zaa<Float> zao = new zab();
    private static final zaa<Double> zap = new zae();
    private static final zaa<Boolean> zaq = new zad();
    private static final zaa<String> zar = new zag();
    private static final zaa<BigInteger> zas = new zaf();
    private static final zaa<BigDecimal> zat = new zah();
    private final char[] zaa = new char[1];
    private final char[] zab = new char[32];
    private final char[] zac = new char[1024];
    private final StringBuilder zad = new StringBuilder(32);
    private final StringBuilder zae = new StringBuilder(1024);
    private final Stack<Integer> zal = new Stack<>();

    interface zaa<O> {
        @Nullable
        O zaa(FastParser fastParser, BufferedReader bufferedReader) throws ParseException, IOException;
    }

    @ShowFirstParty
    @KeepForSdk
    public static class ParseException extends Exception {
        public ParseException(String str) {
            super(str);
        }

        public ParseException(String str, Throwable th) {
            super(str, th);
        }

        public ParseException(Throwable th) {
            super(th);
        }
    }

    @KeepForSdk
    public void parse(InputStream inputStream, T t) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            this.zal.push(0);
            char zaj2 = zaj(bufferedReader);
            if (zaj2 != 0) {
                if (zaj2 == '[') {
                    this.zal.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t.getFieldMappings();
                    if (fieldMappings.size() == 1) {
                        FastJsonResponse.Field field = (FastJsonResponse.Field) fieldMappings.entrySet().iterator().next().getValue();
                        t.addConcreteTypeArrayInternal(field, field.zae, zaa(bufferedReader, (FastJsonResponse.Field<?, ?>) field));
                    } else {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                } else if (zaj2 == '{') {
                    this.zal.push(1);
                    zaa(bufferedReader, (FastJsonResponse) t);
                } else {
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("Unexpected token: ");
                    sb.append(zaj2);
                    throw new ParseException(sb.toString());
                }
                zaa(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
            } else {
                throw new ParseException("No data to parse");
            }
        } catch (IOException e) {
            throw new ParseException((Throwable) e);
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x026f, code lost:
        r5 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0270, code lost:
        zaa(r5);
        zaa(2);
        r5 = zaj(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x027b, code lost:
        if (r5 == ',') goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x027d, code lost:
        if (r5 != '}') goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x027f, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0282, code lost:
        r3 = new java.lang.StringBuilder(55);
        r3.append("Expected end of object or field separator, but found: ");
        r3.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x029a, code lost:
        throw new com.google.android.gms.common.server.response.FastParser.ParseException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x029b, code lost:
        r5 = zaa(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b8, code lost:
        r5 = 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zaa(java.io.BufferedReader r17, com.google.android.gms.common.server.response.FastJsonResponse r18) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            java.lang.String r3 = "Error instantiating inner object"
            java.util.Map r4 = r18.getFieldMappings()
            java.lang.String r5 = r16.zaa((java.io.BufferedReader) r17)
            r6 = 0
            r7 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            if (r5 != 0) goto L_0x001c
            r1.zaa((int) r7)
            return r6
        L_0x001c:
            r9 = 0
        L_0x001d:
            if (r5 == 0) goto L_0x02a1
            java.lang.Object r5 = r4.get(r5)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r5 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r5
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = r16.zab(r17)
            goto L_0x001d
        L_0x002c:
            java.util.Stack<java.lang.Integer> r10 = r1.zal
            r11 = 4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r10.push(r12)
            int r10 = r5.zaa
            r12 = 123(0x7b, float:1.72E-43)
            r13 = 44
            r14 = 125(0x7d, float:1.75E-43)
            r15 = 110(0x6e, float:1.54E-43)
            switch(r10) {
                case 0: goto L_0x025a;
                case 1: goto L_0x0244;
                case 2: goto L_0x022e;
                case 3: goto L_0x0218;
                case 4: goto L_0x0202;
                case 5: goto L_0x01ea;
                case 6: goto L_0x01d2;
                case 7: goto L_0x01bc;
                case 8: goto L_0x01a7;
                case 9: goto L_0x0195;
                case 10: goto L_0x00d2;
                case 11: goto L_0x005e;
                default: goto L_0x0043;
            }
        L_0x0043:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            int r2 = r5.zaa
            r3 = 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Invalid field type "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x005e:
            boolean r10 = r5.zab
            if (r10 == 0) goto L_0x0095
            char r10 = r16.zaj(r17)
            if (r10 != r15) goto L_0x0074
            char[] r10 = zaf
            r1.zab((java.io.BufferedReader) r0, (char[]) r10)
            java.lang.String r10 = r5.zae
            r2.addConcreteTypeArrayInternal(r5, r10, r9)
            goto L_0x026f
        L_0x0074:
            java.util.Stack<java.lang.Integer> r12 = r1.zal
            r15 = 5
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r12.push(r15)
            r12 = 91
            if (r10 != r12) goto L_0x008d
            java.lang.String r10 = r5.zae
            java.util.ArrayList r12 = r1.zaa((java.io.BufferedReader) r0, (com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>) r5)
            r2.addConcreteTypeArrayInternal(r5, r10, r12)
            goto L_0x026f
        L_0x008d:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected array start"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0095:
            char r10 = r16.zaj(r17)
            if (r10 != r15) goto L_0x00a7
            char[] r10 = zaf
            r1.zab((java.io.BufferedReader) r0, (char[]) r10)
            java.lang.String r10 = r5.zae
            r2.addConcreteTypeInternal(r5, r10, r9)
            goto L_0x026f
        L_0x00a7:
            java.util.Stack<java.lang.Integer> r15 = r1.zal
            r15.push(r8)
            if (r10 != r12) goto L_0x00ca
            com.google.android.gms.common.server.response.FastJsonResponse r10 = r5.zac()     // Catch:{ InstantiationException -> 0x00c3, IllegalAccessException -> 0x00bc }
            r1.zaa((java.io.BufferedReader) r0, (com.google.android.gms.common.server.response.FastJsonResponse) r10)     // Catch:{ InstantiationException -> 0x00c3, IllegalAccessException -> 0x00bc }
            java.lang.String r12 = r5.zae     // Catch:{ InstantiationException -> 0x00c3, IllegalAccessException -> 0x00bc }
            r2.addConcreteTypeInternal(r5, r12, r10)     // Catch:{ InstantiationException -> 0x00c3, IllegalAccessException -> 0x00bc }
            goto L_0x026f
        L_0x00bc:
            r0 = move-exception
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2.<init>(r3, r0)
            throw r2
        L_0x00c3:
            r0 = move-exception
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2.<init>(r3, r0)
            throw r2
        L_0x00ca:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected start of object"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x00d2:
            char r10 = r16.zaj(r17)
            if (r10 != r15) goto L_0x00e0
            char[] r10 = zaf
            r1.zab((java.io.BufferedReader) r0, (char[]) r10)
            r10 = r9
            goto L_0x0164
        L_0x00e0:
            if (r10 != r12) goto L_0x018d
            java.util.Stack<java.lang.Integer> r10 = r1.zal
            r10.push(r8)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
        L_0x00ec:
            char r12 = r16.zaj(r17)
            if (r12 == 0) goto L_0x0185
            r15 = 34
            if (r12 == r15) goto L_0x00fe
            if (r12 == r14) goto L_0x00fa
            goto L_0x0181
        L_0x00fa:
            r1.zaa((int) r7)
            goto L_0x0164
        L_0x00fe:
            char[] r12 = r1.zab
            java.lang.StringBuilder r11 = r1.zad
            java.lang.String r11 = zab(r0, r12, r11, r9)
            char r12 = r16.zaj(r17)
            r6 = 58
            if (r12 == r6) goto L_0x012b
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "No map value found for key "
            java.lang.String r3 = java.lang.String.valueOf(r11)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x0121
            java.lang.String r2 = r2.concat(r3)
            goto L_0x0127
        L_0x0121:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            r2 = r3
        L_0x0127:
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x012b:
            char r6 = r16.zaj(r17)
            if (r6 == r15) goto L_0x014e
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected String value for key "
            java.lang.String r3 = java.lang.String.valueOf(r11)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x0144
            java.lang.String r2 = r2.concat(r3)
            goto L_0x014a
        L_0x0144:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            r2 = r3
        L_0x014a:
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x014e:
            char[] r6 = r1.zab
            java.lang.StringBuilder r12 = r1.zad
            java.lang.String r6 = zab(r0, r6, r12, r9)
            r10.put(r11, r6)
            char r6 = r16.zaj(r17)
            if (r6 == r13) goto L_0x0181
            if (r6 != r14) goto L_0x0168
            r1.zaa((int) r7)
        L_0x0164:
            r2.zaa(r5, (java.util.Map<java.lang.String, java.lang.String>) r10)
            goto L_0x01b8
        L_0x0168:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2 = 48
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected character while parsing string map: "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0181:
            r6 = 0
            r11 = 4
            goto L_0x00ec
        L_0x0185:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Unexpected EOF"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x018d:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected start of a map object"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0195:
            char[] r6 = r1.zac
            java.lang.StringBuilder r10 = r1.zae
            char[] r11 = zak
            java.lang.String r6 = r1.zaa(r0, r6, r10, r11)
            byte[] r6 = com.google.android.gms.common.util.Base64Utils.decodeUrlSafe(r6)
            r2.zaa(r5, (byte[]) r6)
            goto L_0x01b8
        L_0x01a7:
            char[] r6 = r1.zac
            java.lang.StringBuilder r10 = r1.zae
            char[] r11 = zak
            java.lang.String r6 = r1.zaa(r0, r6, r10, r11)
            byte[] r6 = com.google.android.gms.common.util.Base64Utils.decode(r6)
            r2.zaa(r5, (byte[]) r6)
        L_0x01b8:
            r5 = 4
            r6 = 0
            goto L_0x0270
        L_0x01bc:
            boolean r6 = r5.zab
            if (r6 == 0) goto L_0x01ca
            com.google.android.gms.common.server.response.FastParser$zaa<java.lang.String> r6 = zar
            java.util.ArrayList r6 = r1.zaa((java.io.BufferedReader) r0, r6)
            r2.zah(r5, r6)
            goto L_0x01b8
        L_0x01ca:
            java.lang.String r6 = r16.zac(r17)
            r2.zaa(r5, (java.lang.String) r6)
            goto L_0x01b8
        L_0x01d2:
            boolean r6 = r5.zab
            if (r6 == 0) goto L_0x01e0
            com.google.android.gms.common.server.response.FastParser$zaa<java.lang.Boolean> r6 = zaq
            java.util.ArrayList r6 = r1.zaa((java.io.BufferedReader) r0, r6)
            r2.zag(r5, r6)
            goto L_0x01b8
        L_0x01e0:
            r6 = 0
            boolean r10 = r1.zaa((java.io.BufferedReader) r0, (boolean) r6)
            r2.zaa(r5, (boolean) r10)
            goto L_0x026f
        L_0x01ea:
            boolean r10 = r5.zab
            if (r10 == 0) goto L_0x01f9
            com.google.android.gms.common.server.response.FastParser$zaa<java.math.BigDecimal> r10 = zat
            java.util.ArrayList r10 = r1.zaa((java.io.BufferedReader) r0, r10)
            r2.zaf(r5, r10)
            goto L_0x026f
        L_0x01f9:
            java.math.BigDecimal r10 = r16.zai(r17)
            r2.zaa(r5, (java.math.BigDecimal) r10)
            goto L_0x026f
        L_0x0202:
            boolean r10 = r5.zab
            if (r10 == 0) goto L_0x0210
            com.google.android.gms.common.server.response.FastParser$zaa<java.lang.Double> r10 = zap
            java.util.ArrayList r10 = r1.zaa((java.io.BufferedReader) r0, r10)
            r2.zae(r5, r10)
            goto L_0x026f
        L_0x0210:
            double r10 = r16.zah(r17)
            r2.zaa(r5, (double) r10)
            goto L_0x026f
        L_0x0218:
            boolean r10 = r5.zab
            if (r10 == 0) goto L_0x0226
            com.google.android.gms.common.server.response.FastParser$zaa<java.lang.Float> r10 = zao
            java.util.ArrayList r10 = r1.zaa((java.io.BufferedReader) r0, r10)
            r2.zad(r5, r10)
            goto L_0x026f
        L_0x0226:
            float r10 = r16.zag(r17)
            r2.zaa(r5, (float) r10)
            goto L_0x026f
        L_0x022e:
            boolean r10 = r5.zab
            if (r10 == 0) goto L_0x023c
            com.google.android.gms.common.server.response.FastParser$zaa<java.lang.Long> r10 = zan
            java.util.ArrayList r10 = r1.zaa((java.io.BufferedReader) r0, r10)
            r2.zac(r5, r10)
            goto L_0x026f
        L_0x023c:
            long r10 = r16.zae(r17)
            r2.zaa(r5, (long) r10)
            goto L_0x026f
        L_0x0244:
            boolean r10 = r5.zab
            if (r10 == 0) goto L_0x0252
            com.google.android.gms.common.server.response.FastParser$zaa<java.math.BigInteger> r10 = zas
            java.util.ArrayList r10 = r1.zaa((java.io.BufferedReader) r0, r10)
            r2.zab(r5, (java.util.ArrayList<java.math.BigInteger>) r10)
            goto L_0x026f
        L_0x0252:
            java.math.BigInteger r10 = r16.zaf(r17)
            r2.zaa(r5, (java.math.BigInteger) r10)
            goto L_0x026f
        L_0x025a:
            boolean r10 = r5.zab
            if (r10 == 0) goto L_0x0268
            com.google.android.gms.common.server.response.FastParser$zaa<java.lang.Integer> r10 = zam
            java.util.ArrayList r10 = r1.zaa((java.io.BufferedReader) r0, r10)
            r2.zaa(r5, (java.util.ArrayList<java.lang.Integer>) r10)
            goto L_0x026f
        L_0x0268:
            int r10 = r16.zad(r17)
            r2.zaa(r5, (int) r10)
        L_0x026f:
            r5 = 4
        L_0x0270:
            r1.zaa((int) r5)
            r5 = 2
            r1.zaa((int) r5)
            char r5 = r16.zaj(r17)
            if (r5 == r13) goto L_0x029b
            if (r5 != r14) goto L_0x0282
            r5 = r9
            goto L_0x001d
        L_0x0282:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2 = 55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Expected end of object or field separator, but found: "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x029b:
            java.lang.String r5 = r16.zaa((java.io.BufferedReader) r17)
            goto L_0x001d
        L_0x02a1:
            r1.zaa((int) r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaa(java.io.BufferedReader, com.google.android.gms.common.server.response.FastJsonResponse):boolean");
    }

    @Nullable
    private final String zaa(BufferedReader bufferedReader) throws ParseException, IOException {
        this.zal.push(2);
        char zaj2 = zaj(bufferedReader);
        if (zaj2 == '\"') {
            this.zal.push(3);
            String zab2 = zab(bufferedReader, this.zab, this.zad, (char[]) null);
            zaa(3);
            if (zaj(bufferedReader) == ':') {
                return zab2;
            }
            throw new ParseException("Expected key/value separator");
        } else if (zaj2 == ']') {
            zaa(2);
            zaa(1);
            zaa(5);
            return null;
        } else if (zaj2 == '}') {
            zaa(2);
            return null;
        } else {
            StringBuilder sb = new StringBuilder(19);
            sb.append("Unexpected token: ");
            sb.append(zaj2);
            throw new ParseException(sb.toString());
        }
    }

    @Nullable
    private final String zab(BufferedReader bufferedReader) throws ParseException, IOException {
        BufferedReader bufferedReader2 = bufferedReader;
        bufferedReader2.mark(1024);
        char zaj2 = zaj(bufferedReader);
        if (zaj2 != '\"') {
            if (zaj2 != ',') {
                int i = 1;
                if (zaj2 == '[') {
                    this.zal.push(5);
                    bufferedReader2.mark(32);
                    if (zaj(bufferedReader) == ']') {
                        zaa(5);
                    } else {
                        bufferedReader.reset();
                        boolean z = false;
                        boolean z2 = false;
                        while (i > 0) {
                            char zaj3 = zaj(bufferedReader);
                            if (zaj3 == 0) {
                                throw new ParseException("Unexpected EOF while parsing array");
                            } else if (!Character.isISOControl(zaj3)) {
                                if (zaj3 == '\"' && !z) {
                                    z2 = !z2;
                                }
                                if (zaj3 == '[' && !z2) {
                                    i++;
                                }
                                if (zaj3 == ']' && !z2) {
                                    i--;
                                }
                                z = (zaj3 != '\\' || !z2) ? false : !z;
                            } else {
                                throw new ParseException("Unexpected control character while reading array");
                            }
                        }
                        zaa(5);
                    }
                } else if (zaj2 != '{') {
                    bufferedReader.reset();
                    zaa(bufferedReader2, this.zac);
                } else {
                    this.zal.push(1);
                    bufferedReader2.mark(32);
                    char zaj4 = zaj(bufferedReader);
                    if (zaj4 == '}') {
                        zaa(1);
                    } else if (zaj4 == '\"') {
                        bufferedReader.reset();
                        zaa(bufferedReader);
                        do {
                        } while (zab(bufferedReader) != null);
                        zaa(1);
                    } else {
                        StringBuilder sb = new StringBuilder(18);
                        sb.append("Unexpected token ");
                        sb.append(zaj4);
                        throw new ParseException(sb.toString());
                    }
                }
            } else {
                throw new ParseException("Missing value");
            }
        } else if (bufferedReader2.read(this.zaa) != -1) {
            char c = this.zaa[0];
            boolean z3 = false;
            do {
                if (c != '\"' || z3) {
                    z3 = c == '\\' ? !z3 : false;
                    if (bufferedReader2.read(this.zaa) != -1) {
                        c = this.zaa[0];
                    } else {
                        throw new ParseException("Unexpected EOF while parsing string");
                    }
                }
            } while (!Character.isISOControl(c));
            throw new ParseException("Unexpected control character while reading string");
        } else {
            throw new ParseException("Unexpected EOF while parsing string");
        }
        char zaj5 = zaj(bufferedReader);
        if (zaj5 == ',') {
            zaa(2);
            return zaa(bufferedReader);
        } else if (zaj5 == '}') {
            zaa(2);
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder(18);
            sb2.append("Unexpected token ");
            sb2.append(zaj5);
            throw new ParseException(sb2.toString());
        }
    }

    /* access modifiers changed from: private */
    @Nullable
    public final String zac(BufferedReader bufferedReader) throws ParseException, IOException {
        return zaa(bufferedReader, this.zab, this.zad, (char[]) null);
    }

    @Nullable
    private final <O> ArrayList<O> zaa(BufferedReader bufferedReader, zaa<O> zaa2) throws ParseException, IOException {
        char zaj2 = zaj(bufferedReader);
        if (zaj2 == 'n') {
            zab(bufferedReader, zaf);
            return null;
        } else if (zaj2 == '[') {
            this.zal.push(5);
            ArrayList<O> arrayList = new ArrayList<>();
            while (true) {
                bufferedReader.mark(1024);
                char zaj3 = zaj(bufferedReader);
                if (zaj3 == 0) {
                    throw new ParseException("Unexpected EOF");
                } else if (zaj3 != ',') {
                    if (zaj3 != ']') {
                        bufferedReader.reset();
                        arrayList.add(zaa2.zaa(this, bufferedReader));
                    } else {
                        zaa(5);
                        return arrayList;
                    }
                }
            }
        } else {
            throw new ParseException("Expected start of array");
        }
    }

    @Nullable
    private final String zaa(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @Nullable char[] cArr2) throws ParseException, IOException {
        char zaj2 = zaj(bufferedReader);
        if (zaj2 == '\"') {
            return zab(bufferedReader, cArr, sb, cArr2);
        }
        if (zaj2 == 'n') {
            zab(bufferedReader, zaf);
            return null;
        }
        throw new ParseException("Expected string");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0030 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String zab(java.io.BufferedReader r9, char[] r10, java.lang.StringBuilder r11, @androidx.annotation.Nullable char[] r12) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            r0 = 0
            r11.setLength(r0)
            int r1 = r10.length
            r9.mark(r1)
            r1 = 0
            r2 = 0
        L_0x000a:
            int r3 = r9.read(r10)
            r4 = -1
            if (r3 == r4) goto L_0x006d
            r4 = 0
        L_0x0012:
            if (r4 >= r3) goto L_0x0065
            char r5 = r10[r4]
            boolean r6 = java.lang.Character.isISOControl(r5)
            r7 = 1
            if (r6 == 0) goto L_0x0038
            if (r12 == 0) goto L_0x002c
            r6 = 0
        L_0x0020:
            int r8 = r12.length
            if (r6 >= r8) goto L_0x002c
            char r8 = r12[r6]
            if (r8 != r5) goto L_0x0029
            r6 = 1
            goto L_0x002d
        L_0x0029:
            int r6 = r6 + 1
            goto L_0x0020
        L_0x002c:
            r6 = 0
        L_0x002d:
            if (r6 == 0) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            com.google.android.gms.common.server.response.FastParser$ParseException r9 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r10 = "Unexpected control character while reading string"
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x0038:
            r6 = 34
            if (r5 != r6) goto L_0x0059
            if (r1 != 0) goto L_0x0059
            r11.append(r10, r0, r4)
            r9.reset()
            int r4 = r4 + r7
            long r0 = (long) r4
            r9.skip(r0)
            if (r2 == 0) goto L_0x0054
            java.lang.String r9 = r11.toString()
            java.lang.String r9 = com.google.android.gms.common.util.JsonUtils.unescapeString(r9)
            return r9
        L_0x0054:
            java.lang.String r9 = r11.toString()
            return r9
        L_0x0059:
            r6 = 92
            if (r5 != r6) goto L_0x0061
            r1 = r1 ^ 1
            r2 = 1
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0065:
            r11.append(r10, r0, r3)
            int r3 = r10.length
            r9.mark(r3)
            goto L_0x000a
        L_0x006d:
            com.google.android.gms.common.server.response.FastParser$ParseException r9 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r10 = "Unexpected EOF while parsing string"
            r9.<init>((java.lang.String) r10)
            goto L_0x0076
        L_0x0075:
            throw r9
        L_0x0076:
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zab(java.io.BufferedReader, char[], java.lang.StringBuilder, char[]):java.lang.String");
    }

    /* access modifiers changed from: private */
    public final int zad(BufferedReader bufferedReader) throws ParseException, IOException {
        boolean z;
        int i;
        int i2;
        int zaa2 = zaa(bufferedReader, this.zac);
        int i3 = 0;
        if (zaa2 == 0) {
            return 0;
        }
        char[] cArr = this.zac;
        if (zaa2 > 0) {
            if (cArr[0] == '-') {
                i2 = Integer.MIN_VALUE;
                i = 1;
                z = true;
            } else {
                i2 = -2147483647;
                i = 0;
                z = false;
            }
            if (i < zaa2) {
                int i4 = i + 1;
                int digit = Character.digit(cArr[i], 10);
                if (digit >= 0) {
                    int i5 = -digit;
                    i = i4;
                    i3 = i5;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            while (i < zaa2) {
                int i6 = i + 1;
                int digit2 = Character.digit(cArr[i], 10);
                if (digit2 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                } else if (i3 >= -214748364) {
                    int i7 = i3 * 10;
                    if (i7 >= i2 + digit2) {
                        i3 = i7 - digit2;
                        i = i6;
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Number too large");
                }
            }
            if (!z) {
                return -i3;
            }
            if (i > 1) {
                return i3;
            }
            throw new ParseException("No digits to parse");
        }
        throw new ParseException("No number to parse");
    }

    /* access modifiers changed from: private */
    public final long zae(BufferedReader bufferedReader) throws ParseException, IOException {
        long j;
        boolean z;
        int zaa2 = zaa(bufferedReader, this.zac);
        long j2 = 0;
        if (zaa2 == 0) {
            return 0;
        }
        char[] cArr = this.zac;
        if (zaa2 > 0) {
            int i = 0;
            if (cArr[0] == '-') {
                j = Long.MIN_VALUE;
                i = 1;
                z = true;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            if (i < zaa2) {
                int i2 = i + 1;
                int digit = Character.digit(cArr[i], 10);
                if (digit >= 0) {
                    i = i2;
                    j2 = (long) (-digit);
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            while (i < zaa2) {
                int i3 = i + 1;
                int digit2 = Character.digit(cArr[i], 10);
                if (digit2 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                } else if (j2 >= -922337203685477580L) {
                    long j3 = j2 * 10;
                    long j4 = (long) digit2;
                    if (j3 >= j + j4) {
                        j2 = j3 - j4;
                        i = i3;
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Number too large");
                }
            }
            if (!z) {
                return -j2;
            }
            if (i > 1) {
                return j2;
            }
            throw new ParseException("No digits to parse");
        }
        throw new ParseException("No number to parse");
    }

    /* access modifiers changed from: private */
    @Nullable
    public final BigInteger zaf(BufferedReader bufferedReader) throws ParseException, IOException {
        int zaa2 = zaa(bufferedReader, this.zac);
        if (zaa2 == 0) {
            return null;
        }
        return new BigInteger(new String(this.zac, 0, zaa2));
    }

    /* access modifiers changed from: private */
    public final boolean zaa(BufferedReader bufferedReader, boolean z) throws ParseException, IOException {
        while (true) {
            char zaj2 = zaj(bufferedReader);
            if (zaj2 != '\"') {
                if (zaj2 == 'f') {
                    zab(bufferedReader, z ? zaj : zai);
                    return false;
                } else if (zaj2 == 'n') {
                    zab(bufferedReader, zaf);
                    return false;
                } else if (zaj2 == 't') {
                    zab(bufferedReader, z ? zah : zag);
                    return true;
                } else {
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("Unexpected token: ");
                    sb.append(zaj2);
                    throw new ParseException(sb.toString());
                }
            } else if (!z) {
                z = true;
            } else {
                throw new ParseException("No boolean value found in string");
            }
        }
    }

    /* access modifiers changed from: private */
    public final float zag(BufferedReader bufferedReader) throws ParseException, IOException {
        int zaa2 = zaa(bufferedReader, this.zac);
        if (zaa2 == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.zac, 0, zaa2));
    }

    /* access modifiers changed from: private */
    public final double zah(BufferedReader bufferedReader) throws ParseException, IOException {
        int zaa2 = zaa(bufferedReader, this.zac);
        if (zaa2 == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.zac, 0, zaa2));
    }

    /* access modifiers changed from: private */
    @Nullable
    public final BigDecimal zai(BufferedReader bufferedReader) throws ParseException, IOException {
        int zaa2 = zaa(bufferedReader, this.zac);
        if (zaa2 == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zac, 0, zaa2));
    }

    @Nullable
    private final <T extends FastJsonResponse> ArrayList<T> zaa(BufferedReader bufferedReader, FastJsonResponse.Field<?, ?> field) throws ParseException, IOException {
        ArrayList<T> arrayList = new ArrayList<>();
        char zaj2 = zaj(bufferedReader);
        if (zaj2 == ']') {
            zaa(5);
            return arrayList;
        } else if (zaj2 == 'n') {
            zab(bufferedReader, zaf);
            zaa(5);
            return null;
        } else if (zaj2 == '{') {
            this.zal.push(1);
            while (true) {
                try {
                    FastJsonResponse zac2 = field.zac();
                    if (!zaa(bufferedReader, zac2)) {
                        return arrayList;
                    }
                    arrayList.add(zac2);
                    char zaj3 = zaj(bufferedReader);
                    if (zaj3 != ',') {
                        if (zaj3 == ']') {
                            zaa(5);
                            return arrayList;
                        }
                        StringBuilder sb = new StringBuilder(19);
                        sb.append("Unexpected token: ");
                        sb.append(zaj3);
                        throw new ParseException(sb.toString());
                    } else if (zaj(bufferedReader) == '{') {
                        this.zal.push(1);
                    } else {
                        throw new ParseException("Expected start of next object in array");
                    }
                } catch (InstantiationException e) {
                    throw new ParseException("Error instantiating inner object", e);
                } catch (IllegalAccessException e2) {
                    throw new ParseException("Error instantiating inner object", e2);
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append("Unexpected token: ");
            sb2.append(zaj2);
            throw new ParseException(sb2.toString());
        }
    }

    private final char zaj(BufferedReader bufferedReader) throws ParseException, IOException {
        if (bufferedReader.read(this.zaa) == -1) {
            return 0;
        }
        while (Character.isWhitespace(this.zaa[0])) {
            if (bufferedReader.read(this.zaa) == -1) {
                return 0;
            }
        }
        return this.zaa[0];
    }

    private final int zaa(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i;
        char zaj2 = zaj(bufferedReader);
        if (zaj2 == 0) {
            throw new ParseException("Unexpected EOF");
        } else if (zaj2 == ',') {
            throw new ParseException("Missing value");
        } else if (zaj2 == 'n') {
            zab(bufferedReader, zaf);
            return 0;
        } else {
            bufferedReader.mark(1024);
            if (zaj2 == '\"') {
                i = 0;
                boolean z = false;
                while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                    char c = cArr[i];
                    if (Character.isISOControl(c)) {
                        throw new ParseException("Unexpected control character while reading string");
                    } else if (c != '\"' || z) {
                        z = c == '\\' ? !z : false;
                        i++;
                    } else {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i + 1));
                        return i;
                    }
                }
            } else {
                cArr[0] = zaj2;
                int i2 = 1;
                while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                    if (cArr[i] == '}' || cArr[i] == ',' || Character.isWhitespace(cArr[i]) || cArr[i] == ']') {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i - 1));
                        cArr[i] = 0;
                        return i;
                    }
                    i2 = i + 1;
                }
            }
            if (i == cArr.length) {
                throw new ParseException("Absurdly long value");
            }
            throw new ParseException("Unexpected EOF");
        }
    }

    private final void zab(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i = 0;
        while (i < cArr.length) {
            int read = bufferedReader.read(this.zab, 0, cArr.length - i);
            if (read != -1) {
                int i2 = 0;
                while (i2 < read) {
                    if (cArr[i2 + i] == this.zab[i2]) {
                        i2++;
                    } else {
                        throw new ParseException("Unexpected character");
                    }
                }
                i += read;
            } else {
                throw new ParseException("Unexpected EOF");
            }
        }
    }

    private final void zaa(int i) throws ParseException {
        if (!this.zal.isEmpty()) {
            int intValue = this.zal.pop().intValue();
            if (intValue != i) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Expected state ");
                sb.append(i);
                sb.append(" but had ");
                sb.append(intValue);
                throw new ParseException(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Expected state ");
        sb2.append(i);
        sb2.append(" but had empty stack");
        throw new ParseException(sb2.toString());
    }
}
