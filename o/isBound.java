package o;

import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import id.co.bri.sdk.BrizziHelper;
import id.co.bri.sdk.BrizziHistoryObject;
import id.co.bri.sdk.exception.BrizziException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.isInvalid;
import org.json.JSONException;

public class isBound extends BrizziHelper {
    public static InputStream setMin;
    public unScrap IsOverlapping;
    public String equals;
    public String getMax;
    public String getMin;
    public String isInside;
    public String length;
    public byte[] setMax = new byte[0];
    public needsUpdate toFloatRange;
    public Context toIntRange;

    static {
        System.loadLibrary("brizzi");
    }

    public isBound(String str, String str2) {
        this.getMax = str;
        this.getMin = str2;
    }

    public static IsoDep getMin(Intent intent) {
        String action = intent.getAction();
        if (!"android.nfc.action.TECH_DISCOVERED".equals(action) && !"android.nfc.action.TAG_DISCOVERED".equals(action)) {
            return null;
        }
        Tag tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, tag.getTechList());
        if (!arrayList.contains(IsoDep.class.getName())) {
            return null;
        }
        IsoDep isoDep = IsoDep.get(tag);
        try {
            if (isoDep.isConnected()) {
                isoDep.close();
                isoDep.connect();
                if (isoDep.isConnected()) {
                    return isoDep;
                }
                return null;
            }
            isoDep.close();
            isoDep.connect();
            if (isoDep.isConnected()) {
                return isoDep;
            }
            return null;
        } catch (IOException | NullPointerException unused) {
            isRemoved.setMin();
            throw setScrapContainer.getMax("03");
        }
    }

    private static void setMax(IsoDep isoDep, int i, int i2) {
        if (i == i2) {
            isRemoved.getMax(isoDep);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r2.equals("arm64-v8a") != false) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.InputStream setMin() {
        /*
            java.lang.Class<o.isBound> r0 = o.isBound.class
            java.lang.String r1 = "brizzi"
            java.lang.String r1 = java.lang.System.mapLibraryName(r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r4 = 21
            if (r2 >= r4) goto L_0x0012
            java.lang.String r2 = android.os.Build.CPU_ABI
            goto L_0x0016
        L_0x0012:
            java.lang.String[] r2 = android.os.Build.SUPPORTED_ABIS
            r2 = r2[r3]
        L_0x0016:
            r4 = -1
            int r5 = r2.hashCode()
            r6 = -738963905(0xffffffffd3f44e3f, float:-2.09856954E12)
            r7 = 1
            r8 = 2
            if (r5 == r6) goto L_0x003f
            r6 = 145444210(0x8ab4d72, float:1.0309895E-33)
            if (r5 == r6) goto L_0x0035
            r6 = 1431565292(0x5553f3ec, float:1.45652869E13)
            if (r5 != r6) goto L_0x0049
            java.lang.String r5 = "arm64-v8a"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0035:
            java.lang.String r3 = "armeabi-v7a"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0049
            r3 = 1
            goto L_0x004a
        L_0x003f:
            java.lang.String r3 = "armeabi"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0049
            r3 = 2
            goto L_0x004a
        L_0x0049:
            r3 = -1
        L_0x004a:
            if (r3 == 0) goto L_0x0059
            java.lang.String r2 = "/lib/armeabi-v7a/"
            if (r3 == r7) goto L_0x0054
            if (r3 == r8) goto L_0x0054
            r0 = 0
            goto L_0x0067
        L_0x0054:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x005f
        L_0x0059:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "/lib/arm64-v8a/"
        L_0x005f:
            java.lang.String r1 = r2.concat(r1)
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
        L_0x0067:
            setMin = r0
            java.io.InputStream r0 = setMin
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isBound.setMin():java.io.InputStream");
    }

    public final byte[] length() {
        return this.setMax;
    }

    public final clearReturnedFromScrapFlag length(IsoDep isoDep, byte[] bArr, String str, String str2, String str3) {
        clearReturnedFromScrapFlag clearreturnedfromscrapflag;
        byte[] bArr2;
        IsoDep isoDep2 = isoDep;
        byte[] bArr3 = new byte[0];
        byte[] bArr4 = {1};
        ijhkbj9u90u(bArr, str, str2, str3, this.equals, this.isInside);
        if (this.toIntRange != null) {
            int i = 0;
            while (bArr4[0] == 1) {
                try {
                    setMax(isoDep, i, 5);
                    bArr4 = di98708kjjj(i, bArr3);
                    if (bArr4.length != 0) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr4, 1, bArr4.length);
                        byte[] bArr5 = {bArr4[0]};
                        byte b = bArr5[0];
                        if (b != 0) {
                            if (b == 1) {
                                if (i == 5) {
                                    isRemoved.setMin();
                                }
                                bArr2 = isoDep.transceive(copyOfRange);
                            } else if (b == 2) {
                                byte[] min = isInvalid.getMin((HashMap) new isInvalid.getMin().execute(new HashMap[]{isInvalid.length(gep99jfe9fj(), gheads8888j9())}).get(5, TimeUnit.SECONDS));
                                bArr2 = Arrays.copyOfRange(min, 0, min.length);
                                bArr4[0] = 1;
                            } else if (i == 1) {
                                isRemoved.setMin();
                                throw setScrapContainer.getMax("21");
                            } else {
                                isRemoved.setMin();
                                throw setScrapContainer.getMax(setScrapContainer.setMax(bArr5));
                            }
                            bArr3 = bArr2;
                        }
                        i++;
                    } else {
                        isRemoved.setMin();
                        throw setScrapContainer.getMax("03");
                    }
                } catch (BrizziException e) {
                    isRemoved.setMin();
                    throw e;
                } catch (IOException | InterruptedException | NullPointerException | ExecutionException | JSONException unused) {
                    isRemoved.setMin();
                    throw setScrapContainer.getMax("03");
                } catch (TimeoutException unused2) {
                    isRemoved.setMin();
                    throw setScrapContainer.getMax("90");
                }
            }
            if (bArr4.length == 0 || bArr4[0] != 0) {
                clearreturnedfromscrapflag = null;
            } else {
                clearreturnedfromscrapflag = new clearReturnedFromScrapFlag();
                clearreturnedfromscrapflag.setMax = dir9jnjfe89()[0];
                clearreturnedfromscrapflag.getMax = dir9jnjfe89()[1];
                clearreturnedfromscrapflag.length = dir9jnjfe89()[2];
                clearreturnedfromscrapflag.getMin = dir9jnjfe89()[3];
                clearreturnedfromscrapflag.toFloatRange = dir9jnjfe89()[4];
                clearreturnedfromscrapflag.isInside = dir9jnjfe89()[5];
                clearreturnedfromscrapflag.setMin = dir9jnjfe89()[6];
                clearreturnedfromscrapflag.IsOverlapping = dir9jnjfe89()[7];
                clearreturnedfromscrapflag.toIntRange = "0";
                clearreturnedfromscrapflag.equals = "";
            }
            if (clearreturnedfromscrapflag != null) {
                isRemoved.setMin();
                this.IsOverlapping.getMin(clearreturnedfromscrapflag);
                return clearreturnedfromscrapflag;
            }
            throw setScrapContainer.getMax("03");
        }
        throw setScrapContainer.getMax("71");
    }

    public final clearReturnedFromScrapFlag getMax(IsoDep isoDep, byte[] bArr, String str, String str2, String str3) {
        clearReturnedFromScrapFlag clearreturnedfromscrapflag;
        byte[] bArr2;
        IsoDep isoDep2 = isoDep;
        isInvalid.getMin getmin = new isInvalid.getMin();
        byte[] bArr3 = new byte[0];
        byte[] bArr4 = {1};
        ArrayList<BrizziHistoryObject> arrayList = new ArrayList<>();
        ijhkbj9u90u(bArr, str, str2, str3, this.equals, this.isInside);
        int i = 0;
        while (bArr4[0] == 1) {
            try {
                setMax(isoDep2, i, 5);
                bArr4 = dhlkjhljk899(i, bArr3);
                if (bArr4.length != 0) {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr4, 1, bArr4.length);
                    byte[] bArr5 = {bArr4[0]};
                    byte b = bArr5[0];
                    if (b != 0) {
                        if (b == 1) {
                            if (i == 5) {
                                isRemoved.setMin();
                            }
                            bArr2 = isoDep2.transceive(copyOfRange);
                        } else if (b == 2) {
                            byte[] min = isInvalid.getMin((HashMap) getmin.execute(new HashMap[]{isInvalid.length(gep99jfe9fj(), gheads8888j9())}).get(5, TimeUnit.SECONDS));
                            bArr2 = Arrays.copyOfRange(min, 0, min.length);
                            bArr4[0] = 1;
                        } else if (i == 1) {
                            isRemoved.setMin();
                            throw setScrapContainer.getMax("21");
                        } else {
                            isRemoved.setMin();
                            throw setScrapContainer.getMax(setScrapContainer.setMax(bArr5));
                        }
                        bArr3 = bArr2;
                    }
                    if (i != 10) {
                        i++;
                    }
                } else {
                    isRemoved.setMin();
                    throw setScrapContainer.getMax("03");
                }
            } catch (BrizziException e) {
                isRemoved.setMin();
                throw e;
            } catch (IOException | InterruptedException | NullPointerException | ExecutionException | JSONException unused) {
                isRemoved.setMin();
                throw setScrapContainer.getMax("03");
            } catch (TimeoutException unused2) {
                isRemoved.setMin();
                throw setScrapContainer.getMax("90");
            }
        }
        if (bArr4.length == 0 || bArr4[0] != 0) {
            clearreturnedfromscrapflag = null;
        } else {
            clearreturnedfromscrapflag = new clearReturnedFromScrapFlag();
            clearreturnedfromscrapflag.setMax = gh99jfe9()[0];
            clearreturnedfromscrapflag.getMax = gh99jfe9()[1];
            clearreturnedfromscrapflag.length = gh99jfe9()[2];
            char c = 3;
            clearreturnedfromscrapflag.getMin = gh99jfe9()[3];
            clearreturnedfromscrapflag.toFloatRange = gh99jfe9()[4];
            clearreturnedfromscrapflag.isInside = gh99jfe9()[5];
            clearreturnedfromscrapflag.setMin = gh99jfe9()[6];
            clearreturnedfromscrapflag.IsOverlapping = gh99jfe9()[7];
            int i2 = 8;
            String[] split = gh99jfe9()[8].split("#");
            int length2 = split.length;
            int i3 = 0;
            while (i3 < length2) {
                String[] split2 = split[i3].split("\\|");
                if (split2.length == i2) {
                    BrizziHistoryObject brizziHistoryObject = new BrizziHistoryObject();
                    brizziHistoryObject.setMax = split2[0];
                    brizziHistoryObject.getMin = split2[1];
                    brizziHistoryObject.length = split2[2];
                    brizziHistoryObject.getMax = split2[c];
                    brizziHistoryObject.setMin = split2[4];
                    brizziHistoryObject.toIntRange = split2[5];
                    brizziHistoryObject.equals = split2[6];
                    brizziHistoryObject.toFloatRange = split2[7];
                    arrayList.add(brizziHistoryObject);
                    clearreturnedfromscrapflag.hashCode = arrayList;
                }
                i3++;
                c = 3;
                i2 = 8;
            }
        }
        if (clearreturnedfromscrapflag != null) {
            isRemoved.setMin();
            this.IsOverlapping.getMin(clearreturnedfromscrapflag);
            return clearreturnedfromscrapflag;
        }
        throw setScrapContainer.getMax("03");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01dd, code lost:
        o.isRemoved.setMin();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e4, code lost:
        throw o.setScrapContainer.getMax("03");
     */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[ExcHandler: IOException | InterruptedException | NullPointerException | ExecutionException | JSONException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x0020] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.clearReturnedFromScrapFlag getMin(android.nfc.tech.IsoDep r17, byte[] r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            java.lang.String r9 = "03"
            r10 = 0
            byte[] r11 = new byte[r10]
            r12 = 1
            byte[] r13 = new byte[r12]
            r13[r10] = r12
            java.lang.String r6 = r8.equals
            java.lang.String r7 = r8.isInside
            r1 = r16
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r1.ijhkbj9u90u(r2, r3, r4, r5, r6, r7)
            r1 = 0
        L_0x0020:
            byte r2 = r13[r10]     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r3 = 2
            r4 = 9
            r5 = 5
            if (r2 != r12) goto L_0x016c
            setMax(r0, r1, r5)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            setMax(r0, r1, r4)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r2 = r22
            byte[] r13 = r8.dubkkjkje8(r1, r11, r2)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            int r4 = r13.length     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            if (r4 == 0) goto L_0x0164
            int r4 = r13.length     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            byte[] r4 = java.util.Arrays.copyOfRange(r13, r12, r4)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            byte[] r6 = new byte[r12]     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            byte r7 = r13[r10]     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r6[r10] = r7     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            byte r7 = r6[r10]     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            if (r7 == 0) goto L_0x0161
            if (r7 == r12) goto L_0x0157
            r11 = 16
            r14 = 5
            if (r7 == r3) goto L_0x0101
            java.lang.String r3 = "10"
            if (r7 == r11) goto L_0x00f9
            r5 = 17
            if (r7 == r5) goto L_0x00bd
            r5 = 24
            if (r7 == r5) goto L_0x00b3
            r5 = 25
            if (r7 == r5) goto L_0x0076
            if (r1 != r12) goto L_0x006a
            o.isRemoved.setMin()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String r0 = "21"
            id.co.bri.sdk.exception.BrizziException r0 = o.setScrapContainer.getMax((java.lang.String) r0)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            throw r0     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
        L_0x006a:
            o.isRemoved.setMin()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String r0 = o.setScrapContainer.setMax(r6)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            id.co.bri.sdk.exception.BrizziException r0 = o.setScrapContainer.getMax((java.lang.String) r0)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            throw r0     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
        L_0x0076:
            o.isRemoved.setMin()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r0.transceive(r4)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            o.isInvalid$getMin r1 = new o.isInvalid$getMin     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r1.<init>()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String r4 = r16.gep99jfe9fj()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r8.length = r4     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.util.HashMap[] r5 = new java.util.HashMap[r12]     // Catch:{ TimeoutException -> 0x00ab, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String[] r6 = r16.gheads8888j9()     // Catch:{ TimeoutException -> 0x00ab, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.util.HashMap r4 = o.isInvalid.length(r4, r6)     // Catch:{ TimeoutException -> 0x00ab, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r5[r10] = r4     // Catch:{ TimeoutException -> 0x00ab, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            android.os.AsyncTask r1 = r1.execute(r5)     // Catch:{ TimeoutException -> 0x00ab, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ TimeoutException -> 0x00ab, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.Object r1 = r1.get(r14, r4)     // Catch:{ TimeoutException -> 0x00ab, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ TimeoutException -> 0x00ab, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            byte[] r1 = o.isInvalid.getMin(r1)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            int r3 = r1.length     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r10, r3)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r13[r10] = r12     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            goto L_0x00eb
        L_0x00ab:
            o.isRemoved.setMin()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            id.co.bri.sdk.exception.BrizziException r0 = o.setScrapContainer.getMax((java.lang.String) r3)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            throw r0     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
        L_0x00b3:
            o.isRemoved.setMin()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String r0 = "18"
            id.co.bri.sdk.exception.BrizziException r0 = o.setScrapContainer.getMax((java.lang.String) r0)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            throw r0     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
        L_0x00bd:
            o.isInvalid$getMin r1 = new o.isInvalid$getMin     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r1.<init>()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String r4 = r16.gep99jfe9fj()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r8.length = r4     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.util.HashMap[] r5 = new java.util.HashMap[r12]     // Catch:{ TimeoutException -> 0x00f1, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String[] r6 = r16.gheads8888j9()     // Catch:{ TimeoutException -> 0x00f1, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.util.HashMap r4 = o.isInvalid.length(r4, r6)     // Catch:{ TimeoutException -> 0x00f1, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r5[r10] = r4     // Catch:{ TimeoutException -> 0x00f1, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            android.os.AsyncTask r1 = r1.execute(r5)     // Catch:{ TimeoutException -> 0x00f1, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ TimeoutException -> 0x00f1, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.Object r1 = r1.get(r14, r4)     // Catch:{ TimeoutException -> 0x00f1, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ TimeoutException -> 0x00f1, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            byte[] r1 = o.isInvalid.getMin(r1)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            int r3 = r1.length     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r10, r3)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r13[r10] = r12     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
        L_0x00eb:
            r3 = 98
            r11 = r1
            r1 = 98
            goto L_0x0161
        L_0x00f1:
            o.isRemoved.setMin()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            id.co.bri.sdk.exception.BrizziException r0 = o.setScrapContainer.getMax((java.lang.String) r3)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            throw r0     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
        L_0x00f9:
            o.isRemoved.setMin()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            id.co.bri.sdk.exception.BrizziException r0 = o.setScrapContainer.getMax((java.lang.String) r3)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            throw r0     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
        L_0x0101:
            o.isInvalid$getMin r3 = new o.isInvalid$getMin     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r3.<init>()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.util.HashMap[] r4 = new java.util.HashMap[r12]     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x012e, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String r6 = r16.gep99jfe9fj()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x012e, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String[] r7 = r16.gheads8888j9()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x012e, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.util.HashMap r6 = o.isInvalid.length(r6, r7)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x012e, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r4[r10] = r6     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x012e, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            android.os.AsyncTask r4 = r3.execute(r4)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x012e, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x012e, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.Object r4 = r4.get(r14, r6)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x012e, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x012e, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            byte[] r4 = o.isInvalid.getMin(r4)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            int r5 = r4.length     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r10, r5)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r13[r10] = r12     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            goto L_0x0148
        L_0x012e:
            if (r1 == r5) goto L_0x014d
            java.lang.String r4 = "other"
            byte[] r4 = r4.getBytes()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r11)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String r5 = "408"
            byte[] r4 = o.isInvalid.setMin(r4, r5)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            int r5 = r4.length     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r10, r5)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r13[r10] = r12     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
        L_0x0148:
            r3.cancel(r12)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r11 = r4
            goto L_0x0161
        L_0x014d:
            o.isRemoved.setMin()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String r0 = "90"
            id.co.bri.sdk.exception.BrizziException r0 = o.setScrapContainer.getMax((java.lang.String) r0)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            throw r0     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
        L_0x0157:
            if (r1 != r5) goto L_0x015c
            o.isRemoved.setMin()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
        L_0x015c:
            byte[] r3 = r0.transceive(r4)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r11 = r3
        L_0x0161:
            int r1 = r1 + r12
            goto L_0x0020
        L_0x0164:
            o.isRemoved.setMin()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            id.co.bri.sdk.exception.BrizziException r0 = o.setScrapContainer.getMax((java.lang.String) r9)     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            throw r0     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
        L_0x016c:
            byte r0 = r13[r10]     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            if (r0 != 0) goto L_0x01cc
            o.clearReturnedFromScrapFlag r0 = new o.clearReturnedFromScrapFlag     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r0.<init>()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String[] r1 = r16.dir9jnjfe89()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r1 = r1[r10]     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r0.setMax = r1     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String[] r1 = r16.dir9jnjfe89()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r1 = r1[r12]     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r0.getMax = r1     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String[] r1 = r16.dir9jnjfe89()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r1 = r1[r3]     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r0.length = r1     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String[] r1 = r16.dir9jnjfe89()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r2 = 3
            r1 = r1[r2]     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r0.getMin = r1     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String[] r1 = r16.dir9jnjfe89()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r2 = 4
            r1 = r1[r2]     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r0.toFloatRange = r1     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String[] r1 = r16.dir9jnjfe89()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r1 = r1[r5]     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r0.isInside = r1     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String[] r1 = r16.dir9jnjfe89()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r2 = 6
            r1 = r1[r2]     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r0.setMin = r1     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String[] r1 = r16.dir9jnjfe89()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r2 = 7
            r1 = r1[r2]     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r0.IsOverlapping = r1     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String[] r1 = r16.dir9jnjfe89()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r2 = 8
            r1 = r1[r2]     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r0.toIntRange = r1     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            java.lang.String[] r1 = r16.dir9jnjfe89()     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r1 = r1[r4]     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            r0.equals = r1     // Catch:{ BrizziException -> 0x01e5, IOException | InterruptedException | NullPointerException | ExecutionException | JSONException -> 0x01dd }
            goto L_0x01cd
        L_0x01cc:
            r0 = 0
        L_0x01cd:
            if (r0 == 0) goto L_0x01d8
            o.isRemoved.setMin()
            o.unScrap r1 = r8.IsOverlapping
            r1.getMin(r0)
            return r0
        L_0x01d8:
            id.co.bri.sdk.exception.BrizziException r0 = o.setScrapContainer.getMax((java.lang.String) r9)
            throw r0
        L_0x01dd:
            o.isRemoved.setMin()
            id.co.bri.sdk.exception.BrizziException r0 = o.setScrapContainer.getMax((java.lang.String) r9)
            throw r0
        L_0x01e5:
            r0 = move-exception
            o.isRemoved.setMin()
            goto L_0x01eb
        L_0x01ea:
            throw r0
        L_0x01eb:
            goto L_0x01ea
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isBound.getMin(android.nfc.tech.IsoDep, byte[], java.lang.String, java.lang.String, java.lang.String, java.lang.String):o.clearReturnedFromScrapFlag");
    }
}
