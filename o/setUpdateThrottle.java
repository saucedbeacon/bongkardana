package o;

import com.alibaba.wireless.security.SecExceptionCode;
import com.alibaba.wireless.security.open.nocaptcha.INoCaptchaComponent;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.alipay.iap.android.aplog.util.zip.LZMA_Base;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.api.FieldBehaviorProto;
import com.google.common.primitives.SignedBytes;
import com.google.gson.stream.JsonReader;
import id.dana.savings.activity.SavingsActivity;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import o.SavedStateHandleController;

public final class setUpdateThrottle implements SavedStateHandleController.AnonymousClass1 {
    private static final Map<String, Integer> getMin;
    public static final int setMax = 197;
    public static final byte[] setMin;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(short r7, int r8, short r9) {
        /*
            int r9 = 126 - r9
            byte[] r0 = setMin
            int r7 = r7 + 1
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L_0x0014
            r9 = r8
            r3 = r1
            r4 = 0
            r8 = r7
            r1 = r0
            r0 = r9
            goto L_0x002a
        L_0x0014:
            r3 = 0
        L_0x0015:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L_0x0022
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L_0x0022:
            byte r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L_0x002a:
            int r7 = -r7
            int r9 = r9 + r7
            int r9 = r9 + -2
            int r7 = r0 + 1
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setUpdateThrottle.setMax(short, int, short):java.lang.String");
    }

    static {
        byte[] bArr = new byte[1993];
        System.arraycopy("\b¿¬N\u0007ïû\u0006û\u0005 Ù\u0006õ\u001fëò\u0006ó\u0001÷\ræø\u001aòÿþ\u0007\u0000í\u0005ì\u001fëÿ\u001eÓùñþ\u0001ûñ\u001aò\týä\t\tú\u0006ôøÿû\fýñ'ãü\u000býûïÿ\u000e\u0019ãü\u0001\u0000ü)Ýð\u000eûõ\u0007ýûó\u0013ñ\u0001ôýëÿþ\u0003ÿ(Ýð\u000eï\u0007÷ú\tøÿñþ\u0001ûñ\u001aò\týä\u001cïþï\n\fñú\u000b\u0004üä\u0018ñþ\u0001ûøó\u000bþÿ\u0013ß\u0007ïû\u0006û\u0005\u0016îüõ\u000bí\u0007ø\u0000ì\tý\u0002ñ!Û\fýñ'ãýý\u0003ê\u0007öó\u0016\u0000õ\u0007ñ\u000fë\rä\u0017ÿ\u0002ëý\u0001\u000bñþ\u0001ûñ\u001aò\týä\u001cêÿ\nç\r\tõ\bùù\u0005æ\u001cøó\u000bþö\u0006õø\rë\nõ\u000býô\u0005\të\rðý\u0013í\rë\u000fù\u0007ç\u000fñý\bøÿ\të\rðý\u0013ç\u0013ó\u0001\u0003\u0003ç\u000fñý\bøÿüí\tøÿý\u0011ë\r\u0006ñ\rù\u0005ñø&Û\u0006ö\u0018á\u0004\u0003ýõø\t\u0001û\u0002ññþ\u0001û,Ýð\u000e\ræ&Ú\u000eñ÷%ëð\u0001ÿÿù\fô\u0012ï\u0007þÿ\u0003üêÿ\nùùý\u0011ñ\tü÷ûþýý\u0003ê\u0007öó\r\ríý\fññ\u0017ÿ\u0002ëý\u0001\u000bñ\u0003ú\në\tøÿ&Ûû\u0005\rí\u000fòøùþýý\u0003ê\u0007ö&Û\n\u0000ó\u0005ëÿþ\u0003ÿ#äòÿ\u0017á\u0004,Êÿ\n#Ò\tý\u001dØûö!Ù\u0007\t\nç$ëï\u0000÷ü\u0001\nüðþ\bù\u0005\u0012Ý\u0011ëý\u0000ýý\u0003ê\u0007ö\u001eéú\u0006\téÿ\u0007ü\u0011ì\tó\u0006\u0005\u0006ñ\rù\u0005ñø\u001eà\u000fñù(ãùø\rñú\u0013ó\n\u000býÿñþ\u0007ù\u0005\u0006ñ\u0001ù\u0001ý\tñ\u000fë\tøÿ\u0018Ù\u0007\t\u0006ô2Ëþ\u0000\ræ$èó\r\u001aãü\u0001\u0000ü,Üí\tñ\u000f\b\u0000÷\u000bëý\u0001\u000b\u0001\rüü Ò\týð\u0004òÿ\të\rðýó\u0010\nõùûñ\u0007\u000fñý\bøÿô+ßþÿ\u001fÒ\u0000þ\u0006õø-Õ\u000býô\u0005ÿ\të\rðý\u0013ð\nõùû\u0011ç\u000fñý\bøÿü\u0011ì\tó\u0006\u0005\u000fÙ\u0007\têÿ\n\u0013Ü\u0010þüðþ\u001eîòý\tð\u0007þÿ\u001fÒÿùü\u0007ö\u0000\u000fñù\u001eîüõ\u000bí\u0007øü\u000bó\rö\u0003\u0017äê\u0013ó\u0001\u0003\u0003ð\u0002ùýû\u0011ç\u000fñý\bøÿ\fñú\u000b\u0004ü\u0018äê\nï\u0007þÿ\u0015Ü\u000b÷û\u0005\u000fã\u0002\u0004õý\u0011ñ\b\u0001í\f\u0004êøó\u000bþÿùùý&Û\n\u0000ó\u001cëò\u0006\të\rðý\u0013ð\u0002ùýû\u0011ç\u000fñý\bøÿô+ßþÿ\u000bì\u0003û\u0000ï-Õ\u000býô\u0005ÿÿþÿ\fïñý\bøÿ\u0007ïû\u0006û\u0005 Ù\u0006õ\u001aÜ\u0011í\u000eüõ\u0007ÿüö\u0002ó\u0001ø\u0005\b\u001fÒ\u0001ûû\u0001\u0001\"ãõ\u0001\u0002õø)ã\u0013ó\u0001\u0003ã\u0010\u0002ùýûñ\u0007\u000fñý\bøÿ\të\rðýó\u0010\u0002ùýûñ\u0007\u000fñý\bøÿ\u000bðü\u0007ö-Ñþ\u0001ûô\u0012ê\u0006\u0000÷\u0000\fñ'ã\u0001\u0004ñþ\u0001û#Ø\nùùý)ãô+ßþÿ\u001dÕ\u000býô\u0005ÿüð\u001cèó\r\u001aãü\u0011ì\tó\u0006\u0005 Ò\u0001ûûýýþ\u0003ê\u0007öó\u0019\u0001ë\rä\u0017õû\u0003\në\fôóþ\u0005ï$ëò\u0006ñþ\u0001ûñ\u001aò\týä\b\u0005\u0001ûýö\u0007í\u0018ñþ\u0001û\u000fñý\bøÿüí\tñ\u000bó\t\u0002ð!éñ\u001eëòú\u000eðýû\n\u0000óë\u0010\u0002ù\u0003è\rü\u0001\u0006ó\u000fòñ\bð\u0001\u0004\u0003\u0003è\u0001\u0004ëþ\u0000\u0007\u0005ëÿ\rð\u0005ì,Ñþ\u0001û\u0011ø\u000eòý\tðùô\u0001\u0002\tæ*æñ\rù\u0005ñø#Û\fýñ\u0013\u001aË\u0006\u0005õ\u000bÿ\u000eéú\u0006ùø\rñú\u0013ó!Ù$×ø\u0001ý\u0001ë\rñþ\u0001ûñ\u001aò\týä\b\u0000\fññ\u001a\u0000ñ\tü÷\u000bÿùõ\u000b\u0000í\u001dá\u0004ï\u0005\u0014Ü\u0010þüðþüþÒ\tý\róóõ\u000e\të\rðýó\r\rë\u000fùç\u0007\u000fñý\bøÿ\u0013ó\u0001\u0003ã\u0010\nõùûñ\u0007\u000fñý\bøÿñþ\u0001û-Ò\týùþ\u0007ñ\u0011è\u0001\u0004\u0002ø\u0001\rü\bþ÷ûþ\u0005ñ\"ëò\u0006ýý\u0003ê\u0007öó\tù\u0007\tä\u0012\u0004ê\u0006ñ\rù\u0005ñø$ëò\u0006\u0007ïû\u0006û\u0005 Ù\u0006õ\u001aîüõ\u0007\u0006ñ\rù\u0005ñø ëïý\u0001\u0002\u0017á\u0004\u0000üù\u0001ÿ\u0019Ùø\rñú\u0013ó\u0013ó\u0001\u0003\u0003í\rë\u000fù\u0007ç\u000fñý\bøÿü\u0011\féó\u0006\u0005\u0006ñ\rù\u0005ñø)ã\ræ*æï\n÷\tïþ%ã\u0007\u0005þñÿ\u0018íë\u0002\u0004òÿ\u0017á\u0004\u0004ê\u0000\u0006û\f\u0000\fñ/Üí\tøÿêÿ\n\u0013Ý\u0011ë\r\ræ6Üþòø\u0005ø$Ýò\u0001þ\u0005\u0000í\tøÿ\u0001ôýõ\tò\tùù\u0005ë\u0002\rõ\b\u0019Ù\u0006õ\u000bò\u0006\u000fñø\rñ\u0003\u0002ù\u000bó\u0016Ù\u0007\têÿ\n!Ñþ\u0001û\u001dîòý\tðÿúý\u0002\rö\u0003\u0017äêô\u001fë\u0002óö\tú\u0006\u001dßþÿ\u001dÕ\u000býô\u0005ÿ\u0006÷ÿ\u0007\u0015×\u0006\tûñ\u0000\u000fñù\u001dÙ\u0007\tü\u0010þüðþë\u0002\rõ\býÿ\u0019Ù\u0006õ\u000bò\u0006ýðý\tù\u000bë\tøÿ\u001cíë\n\u0013ó\u0001\u0003\u0003ð\nõùû\u0011ç\u000fñý\bøÿ\u0013ó\u0001\u0003ã\r\rë\u000fùç\u0007\u000fñý\bøÿô\u001fë\u0000ø÷ü\u0001\n\u0000ó$ßþÿ\u001dÕ\u000býô\u0005ÿ\fñú\u000b\u0004ü\u0004ò\u0004êêÿ\nç\u001aò\týä\u0011\u0001\u0001ÿï\tú\u0006\u0007ï1Êÿ\n\u001dãüþòø\u0005ø$ëò\u0006ëÿþ\u0003ÿ\u0018éó\u0006\u0005\u0001ù\u0001ýð\u000eï\u0007÷ú\tøÿÿñ\u0001\u001bëò\u0006\tó\u0006\u0005\t÷ø\u0007\u0006\u001fàóþ#Öþ\u0006ù\u0005\u001càô\nò\tý\"ï\u0005êÿ\n\u0014ëÿùõ\u000b\u0000í\u001dá\u0004\tú\u0006ôøÿÒ\u0000û\rñ\u0003øÿ\u000bð\u0001ÿÿù\f\u000fÙ\u0007\t\u0003ù\u0011óú\nø\u0000\u000eá\u0004\u0002ù\u0003úö\u0006\fë\u000fûùò\u0000\u0012ôù\rð\u0006ï\rñýû\fýñ\u001céó\u0006\u0005êÿ\n#Ò\týï\u0007þ\u000bè\u0001\u0004ùôý\u0011ñ\tü\u001aÙ\u001fæï\rñýòø\u0005ø\rñû\u0006üù\u0019Ý\u0011ëý\u0000\fñú\u000b\u0004ü\u0015ëò\u0006\u000bò\u0006\u0004ô\u0003\u000bò\u0006\u001aÙ\bü\u0001\u0000ü\u0019éó\u0006\u0005\u000bð\fï\u001eéú\u0006\u001aÙ(áæ\u0004ï\u001aéú\u0006\u001aÙ\u001fâù÷ÿ\rò\tý Ù\u0005óþ\u0005õ\u0005\u0000\fêÿ\n\u0014ëÿùõ\u000b\u0000í\u001dá\u0004\nöù\røöûúù\u0018êý\u0011ë\r\u0000óþ\bÿüöü\u0011ì\tó\u0006\u0005\u001aÔ/Û÷ûö\tú\u0006ô+ßþÿ\u0014Ýù\t\u0001û\u0004\u0000ë\tøÿ'Õ\u000býô\u0005ÿ÷\u0007þ\u001bëö\u0003\u0000í÷ù\b\u001eáñ\u000b\u000bÙ\u0007\t".getBytes("ISO-8859-1"), 0, bArr, 0, 1993);
        setMin = bArr;
        HashMap hashMap = new HashMap();
        byte[] bArr2 = setMin;
        hashMap.put(setMax((byte) bArr2[68], (short) bArr2[29], (byte) bArr2[564]), 175);
        byte[] bArr3 = setMin;
        hashMap.put(setMax((byte) bArr3[21], (short) bArr3[68], 61), 151);
        byte[] bArr4 = setMin;
        hashMap.put(setMax((byte) bArr4[0], (short) bArr4[1665], (byte) bArr4[146]), 92);
        byte[] bArr5 = setMin;
        hashMap.put(setMax((byte) bArr5[274], (short) bArr5[401], 57), 32);
        byte[] bArr6 = setMin;
        hashMap.put(setMax((byte) bArr6[7], 52, (byte) bArr6[179]), 5);
        byte[] bArr7 = setMin;
        hashMap.put(setMax((byte) bArr7[9], 58, (byte) bArr7[68]), 24);
        byte[] bArr8 = setMin;
        byte b = (byte) bArr8[125];
        hashMap.put(setMax(b, (short) (b | 59), (byte) bArr8[46]), 90);
        byte[] bArr9 = setMin;
        hashMap.put(setMax((byte) bArr9[0], 67, (byte) bArr9[68]), 30);
        byte[] bArr10 = setMin;
        byte b2 = (byte) bArr10[63];
        hashMap.put(setMax(b2, (short) (b2 | SignedBytes.MAX_POWER_OF_TWO), (byte) bArr10[116]), 87);
        byte[] bArr11 = setMin;
        byte b3 = (byte) bArr11[564];
        hashMap.put(setMax(b3, (short) (b3 | 70), (byte) bArr11[116]), 136);
        hashMap.put(setMax((byte) setMin[1665], 102, 57), 34);
        byte[] bArr12 = setMin;
        hashMap.put(setMax((byte) bArr12[4], (short) (setMax & 931), (byte) bArr12[416]), 6);
        byte[] bArr13 = setMin;
        hashMap.put(setMax((byte) bArr13[68], 136, (byte) bArr13[564]), 105);
        byte[] bArr14 = setMin;
        hashMap.put(setMax((byte) bArr14[21], 150, (byte) bArr14[1665]), 153);
        hashMap.put(setMax((byte) setMin[183], 163, 58), 108);
        byte b4 = (byte) setMin[10];
        hashMap.put(setMax(b4, (short) (b4 | 154), 57), 76);
        byte[] bArr15 = setMin;
        hashMap.put(setMax((byte) bArr15[93], 218, (byte) bArr15[68]), 95);
        byte[] bArr16 = setMin;
        byte b5 = (byte) bArr16[9];
        hashMap.put(setMax(b5, (short) (b5 | 216), (byte) bArr16[69]), 184);
        byte[] bArr17 = setMin;
        hashMap.put(setMax((byte) bArr17[85], 226, (byte) bArr17[324]), 155);
        byte[] bArr18 = setMin;
        hashMap.put(setMax((byte) bArr18[85], (short) (setMax | 48), (byte) bArr18[324]), 61);
        byte[] bArr19 = setMin;
        hashMap.put(setMax((byte) bArr19[9], 264, (byte) bArr19[416]), 79);
        byte[] bArr20 = setMin;
        byte b6 = (byte) bArr20[125];
        hashMap.put(setMax(b6, (short) (b6 | 265), (byte) bArr20[63]), 12);
        byte[] bArr21 = setMin;
        hashMap.put(setMax((byte) bArr21[68], LZMA_Base.kMatchMaxLen, (byte) bArr21[274]), 31);
        byte[] bArr22 = setMin;
        byte b7 = (byte) bArr22[46];
        hashMap.put(setMax(b7, (short) (b7 | 278), (byte) bArr22[705]), 33);
        byte[] bArr23 = setMin;
        byte b8 = (byte) bArr23[0];
        hashMap.put(setMax(b8, (short) (b8 | 288), (byte) bArr23[69]), 63);
        byte[] bArr24 = setMin;
        hashMap.put(setMax((byte) bArr24[179], SecExceptionCode.SEC_ERROR_STA_INCORRECT_DATA_FILE, (byte) bArr24[68]), 91);
        byte[] bArr25 = setMin;
        byte b9 = (byte) bArr25[63];
        hashMap.put(setMax(b9, (short) (b9 | 308), (byte) bArr25[705]), 114);
        byte[] bArr26 = setMin;
        hashMap.put(setMax((byte) bArr26[4], 330, (byte) (-bArr26[517])), 142);
        byte[] bArr27 = setMin;
        hashMap.put(setMax((byte) bArr27[93], 337, (byte) bArr27[116]), 161);
        hashMap.put(setMax((byte) setMin[705], 340, 58), 18);
        byte[] bArr28 = setMin;
        hashMap.put(setMax((byte) bArr28[57], 361, (byte) bArr28[416]), 172);
        byte[] bArr29 = setMin;
        byte b10 = (byte) bArr29[9];
        hashMap.put(setMax(b10, (short) (b10 | 368), (byte) bArr29[68]), 20);
        byte[] bArr30 = setMin;
        byte b11 = (byte) bArr30[158];
        hashMap.put(setMax(b11, (short) (b11 | Framer.EXIT_FRAME_PREFIX), (byte) bArr30[179]), 181);
        byte[] bArr31 = setMin;
        byte b12 = (byte) bArr31[57];
        hashMap.put(setMax(b12, (short) (b12 | 368), (byte) bArr31[24]), 98);
        byte[] bArr32 = setMin;
        hashMap.put(setMax((byte) bArr32[57], 392, (byte) bArr32[116]), 180);
        byte[] bArr33 = setMin;
        byte b13 = (byte) bArr33[564];
        hashMap.put(setMax(b13, (short) (b13 | 388), (byte) bArr33[179]), 29);
        byte[] bArr34 = setMin;
        hashMap.put(setMax((byte) bArr34[4], 420, (byte) bArr34[274]), 82);
        byte[] bArr35 = setMin;
        hashMap.put(setMax((byte) bArr35[179], 427, (byte) bArr35[68]), 69);
        byte[] bArr36 = setMin;
        hashMap.put(setMax((byte) bArr36[68], 442, (byte) bArr36[24]), 71);
        byte[] bArr37 = setMin;
        hashMap.put(setMax((byte) bArr37[4], 456, (byte) bArr37[63]), 163);
        byte[] bArr38 = setMin;
        byte b14 = (byte) bArr38[68];
        hashMap.put(setMax(b14, (short) (b14 | 449), (byte) bArr38[274]), 84);
        byte[] bArr39 = setMin;
        hashMap.put(setMax((byte) bArr39[4], (short) (setMax | 280), (byte) bArr39[705]), 102);
        byte[] bArr40 = setMin;
        hashMap.put(setMax((byte) bArr40[68], 484, (byte) bArr40[29]), 152);
        byte[] bArr41 = setMin;
        hashMap.put(setMax((byte) bArr41[57], 498, (byte) bArr41[179]), 67);
        byte[] bArr42 = setMin;
        byte b15 = (byte) bArr42[7];
        hashMap.put(setMax(b15, (short) (b15 | 504), (byte) bArr42[63]), 4);
        byte[] bArr43 = setMin;
        hashMap.put(setMax((byte) bArr43[0], 516, (byte) bArr43[68]), 70);
        byte[] bArr44 = setMin;
        hashMap.put(setMax((byte) bArr44[120], 524, (byte) bArr44[68]), 2);
        byte[] bArr45 = setMin;
        hashMap.put(setMax((byte) bArr45[0], 534, (byte) bArr45[63]), 109);
        byte[] bArr46 = setMin;
        hashMap.put(setMax((byte) bArr46[46], 542, (byte) bArr46[63]), 107);
        byte[] bArr47 = setMin;
        byte b16 = (byte) bArr47[93];
        hashMap.put(setMax(b16, (short) (b16 | 548), (byte) bArr47[705]), 19);
        byte[] bArr48 = setMin;
        hashMap.put(setMax((byte) bArr48[85], 554, (byte) bArr48[516]), 182);
        byte[] bArr49 = setMin;
        hashMap.put(setMax((byte) bArr49[85], 573, (byte) bArr49[705]), 118);
        byte[] bArr50 = setMin;
        hashMap.put(setMax((byte) bArr50[85], 592, (byte) bArr50[324]), 55);
        byte[] bArr51 = setMin;
        hashMap.put(setMax((byte) bArr51[63], 611, (byte) bArr51[63]), 11);
        byte[] bArr52 = setMin;
        hashMap.put(setMax((byte) bArr52[564], 622, (byte) bArr52[416]), 66);
        byte[] bArr53 = setMin;
        byte b17 = (byte) bArr53[120];
        hashMap.put(setMax(b17, (short) (b17 | 628), (byte) bArr53[564]), 46);
        byte[] bArr54 = setMin;
        hashMap.put(setMax((byte) bArr54[57], 648, (byte) bArr54[120]), 120);
        byte[] bArr55 = setMin;
        hashMap.put(setMax((byte) bArr55[46], 660, (byte) bArr55[68]), 164);
        byte[] bArr56 = setMin;
        hashMap.put(setMax((byte) bArr56[324], 669, (byte) bArr56[0]), 0);
        byte[] bArr57 = setMin;
        byte b18 = (byte) bArr57[46];
        hashMap.put(setMax(b18, (short) (b18 | 678), (byte) bArr57[63]), 100);
        byte[] bArr58 = setMin;
        hashMap.put(setMax((byte) bArr58[158], 696, (byte) bArr58[274]), Integer.valueOf(TsExtractor.TS_STREAM_TYPE_E_AC3));
        byte[] bArr59 = setMin;
        hashMap.put(setMax((byte) bArr59[68], SecExceptionCode.SEC_ERROR_SIGNATURE_NONSUPPORTED_SIGN_TYPE, (byte) bArr59[564]), 158);
        byte[] bArr60 = setMin;
        hashMap.put(setMax((byte) bArr60[4], 712, (byte) bArr60[578]), 139);
        byte[] bArr61 = setMin;
        byte b19 = (byte) bArr61[158];
        hashMap.put(setMax(b19, (short) (b19 | 717), (byte) bArr61[85]), 150);
        byte[] bArr62 = setMin;
        hashMap.put(setMax((byte) bArr62[9], 721, (byte) bArr62[416]), 27);
        byte[] bArr63 = setMin;
        hashMap.put(setMax((byte) bArr63[57], 726, (byte) bArr63[705]), 121);
        byte[] bArr64 = setMin;
        hashMap.put(setMax((byte) bArr64[85], 738, (byte) bArr64[324]), 1);
        byte[] bArr65 = setMin;
        byte b20 = (byte) bArr65[29];
        hashMap.put(setMax(b20, (short) (b20 | 757), (byte) bArr65[416]), 21);
        byte[] bArr66 = setMin;
        hashMap.put(setMax((byte) bArr66[324], (short) (setMax | 560), (byte) bArr66[705]), 38);
        byte[] bArr67 = setMin;
        hashMap.put(setMax((byte) bArr67[120], 775, (byte) bArr67[128]), 7);
        byte[] bArr68 = setMin;
        byte b21 = (byte) bArr68[29];
        hashMap.put(setMax(b21, (short) (b21 | 785), (byte) bArr68[116]), 47);
        byte[] bArr69 = setMin;
        hashMap.put(setMax((byte) bArr69[324], 785, (byte) bArr69[564]), 119);
        byte[] bArr70 = setMin;
        hashMap.put(setMax((byte) bArr70[68], SecExceptionCode.SEC_ERROR_PKG_VALID_NO_MEMORY, (byte) bArr70[116]), 75);
        byte[] bArr71 = setMin;
        hashMap.put(setMax((byte) bArr71[125], 817, (byte) bArr71[63]), Integer.valueOf(TsExtractor.TS_STREAM_TYPE_HDMV_DTS));
        byte[] bArr72 = setMin;
        byte b22 = (byte) bArr72[29];
        hashMap.put(setMax(b22, (short) (b22 | 821), (byte) bArr72[1665]), 174);
        byte[] bArr73 = setMin;
        hashMap.put(setMax((byte) bArr73[4], 821, (byte) bArr73[1665]), 14);
        byte[] bArr74 = setMin;
        hashMap.put(setMax((byte) bArr74[324], 828, (byte) bArr74[95]), 122);
        byte[] bArr75 = setMin;
        hashMap.put(setMax((byte) bArr75[85], 846, (byte) bArr75[516]), 127);
        byte[] bArr76 = setMin;
        byte b23 = (byte) bArr76[29];
        hashMap.put(setMax(b23, (short) (b23 | 865), (byte) bArr76[69]), 110);
        byte[] bArr77 = setMin;
        hashMap.put(setMax((byte) bArr77[120], 865, (byte) bArr77[57]), 168);
        byte[] bArr78 = setMin;
        hashMap.put(setMax((byte) bArr78[7], 875, (byte) bArr78[705]), 141);
        byte[] bArr79 = setMin;
        hashMap.put(setMax((byte) bArr79[9], 881, (byte) bArr79[46]), Integer.valueOf(TsExtractor.TS_STREAM_TYPE_DTS));
        byte[] bArr80 = setMin;
        byte b24 = (byte) bArr80[158];
        hashMap.put(setMax(b24, (short) (b24 | 884), (byte) bArr80[46]), 148);
        byte[] bArr81 = setMin;
        hashMap.put(setMax((byte) bArr81[4], 888, (byte) bArr81[69]), 113);
        byte[] bArr82 = setMin;
        byte b25 = (byte) bArr82[29];
        hashMap.put(setMax(b25, (short) (b25 | 895), (byte) bArr82[68]), 147);
        byte[] bArr83 = setMin;
        byte b26 = (byte) bArr83[9];
        hashMap.put(setMax(b26, (short) (b26 | 890), (byte) bArr83[705]), 128);
        byte[] bArr84 = setMin;
        byte b27 = (byte) bArr84[29];
        hashMap.put(setMax(b27, (short) (b27 | 900), (byte) bArr84[57]), 43);
        byte[] bArr85 = setMin;
        hashMap.put(setMax((byte) bArr85[57], SecExceptionCode.SEC_ERROR_UMID_VALID, (byte) bArr85[705]), 115);
        byte[] bArr86 = setMin;
        hashMap.put(setMax((byte) bArr86[0], 912, (byte) bArr86[416]), 177);
        byte[] bArr87 = setMin;
        hashMap.put(setMax((byte) bArr87[57], 920, (byte) bArr87[63]), 51);
        hashMap.put(setMax((byte) setMin[85], 932, 58), 111);
        byte[] bArr88 = setMin;
        hashMap.put(setMax((byte) bArr88[120], 951, (byte) bArr88[69]), 15);
        hashMap.put(setMax((byte) setMin[183], 961, 57), 96);
        byte[] bArr89 = setMin;
        hashMap.put(setMax((byte) bArr89[7], 984, (byte) bArr89[95]), 56);
        byte[] bArr90 = setMin;
        hashMap.put(setMax((byte) bArr90[85], 990, (byte) bArr90[416]), 116);
        byte[] bArr91 = setMin;
        byte b28 = (byte) bArr91[274];
        hashMap.put(setMax(b28, (short) (b28 | 992), (byte) bArr91[516]), 54);
        byte[] bArr92 = setMin;
        hashMap.put(setMax((byte) bArr92[120], 1026, (byte) bArr92[416]), 146);
        byte[] bArr93 = setMin;
        hashMap.put(setMax((byte) bArr93[46], 1036, (byte) bArr93[416]), 170);
        byte[] bArr94 = setMin;
        hashMap.put(setMax((byte) bArr94[4], 1045, (byte) bArr94[146]), Integer.valueOf(BlobStatic.MONITOR_IMAGE_WIDTH));
        byte[] bArr95 = setMin;
        hashMap.put(setMax((byte) bArr95[158], FieldBehaviorProto.FIELD_BEHAVIOR_FIELD_NUMBER, (byte) bArr95[1069]), 57);
        byte[] bArr96 = setMin;
        hashMap.put(setMax((byte) bArr96[9], 1054, (byte) bArr96[63]), 126);
        byte[] bArr97 = setMin;
        hashMap.put(setMax((byte) bArr97[85], 1059, (byte) bArr97[24]), 157);
        byte[] bArr98 = setMin;
        hashMap.put(setMax((byte) bArr98[57], 1078, (byte) bArr98[0]), 167);
        byte[] bArr99 = setMin;
        hashMap.put(setMax((byte) bArr99[68], 1090, (byte) bArr99[705]), 156);
        byte[] bArr100 = setMin;
        hashMap.put(setMax((byte) bArr100[93], SecExceptionCode.SEC_ERROE_OPENSDK_UNSUPPORTED_VERSION, (byte) bArr100[24]), 22);
        hashMap.put(setMax((byte) setMin[705], SecExceptionCode.SEC_ERROE_OPENSDK_INVALID_BIZTYPE, 57), 103);
        byte[] bArr101 = setMin;
        hashMap.put(setMax((byte) bArr101[120], 1128, (byte) bArr101[57]), 36);
        byte[] bArr102 = setMin;
        hashMap.put(setMax((byte) bArr102[46], 1138, (byte) bArr102[416]), 65);
        byte b29 = (byte) setMin[120];
        hashMap.put(setMax(b29, (short) (b29 | 1137), 61), 58);
        byte[] bArr103 = setMin;
        hashMap.put(setMax((byte) bArr103[85], 1157, (byte) bArr103[516]), 169);
        byte[] bArr104 = setMin;
        hashMap.put(setMax((byte) bArr104[324], 1176, (byte) bArr104[95]), 40);
        byte[] bArr105 = setMin;
        byte b30 = (byte) bArr105[0];
        hashMap.put(setMax(b30, (short) (b30 | 1186), (byte) bArr105[69]), 124);
        byte[] bArr106 = setMin;
        hashMap.put(setMax((byte) bArr106[0], 1202, (byte) bArr106[705]), 104);
        byte[] bArr107 = setMin;
        hashMap.put(setMax((byte) bArr107[9], INoCaptchaComponent.SG_NC_VERI_GET_TRACE_FAIL, (byte) bArr107[63]), 176);
        byte[] bArr108 = setMin;
        byte b31 = (byte) bArr108[158];
        hashMap.put(setMax(b31, (short) (b31 | 1213), (byte) bArr108[274]), 78);
        byte[] bArr109 = setMin;
        hashMap.put(setMax((byte) bArr109[46], INoCaptchaComponent.SG_NC_VERI_WUA_KEY_NOT_EXIST, (byte) bArr109[116]), 101);
        hashMap.put(setMax((byte) setMin[179], 1226, 58), 74);
        byte[] bArr110 = setMin;
        hashMap.put(setMax((byte) bArr110[63], 1241, (byte) bArr110[274]), 60);
        byte[] bArr111 = setMin;
        hashMap.put(setMax((byte) bArr111[179], 1252, (byte) bArr111[564]), 132);
        byte[] bArr112 = setMin;
        byte b32 = (byte) bArr112[564];
        hashMap.put(setMax(b32, (short) (b32 | 1251), (byte) bArr112[274]), 44);
        byte[] bArr113 = setMin;
        hashMap.put(setMax((byte) bArr113[21], 1283, (byte) bArr113[1665]), 97);
        byte[] bArr114 = setMin;
        hashMap.put(setMax((byte) bArr114[324], 1296, (byte) bArr114[0]), 183);
        byte[] bArr115 = setMin;
        hashMap.put(setMax((byte) bArr115[4], 1314, (byte) bArr115[63]), 186);
        byte[] bArr116 = setMin;
        byte b33 = (byte) bArr116[46];
        hashMap.put(setMax(b33, (short) (b33 | 1312), (byte) bArr116[274]), 9);
        byte[] bArr117 = setMin;
        hashMap.put(setMax((byte) bArr117[0], 1330, (byte) bArr117[68]), 50);
        byte[] bArr118 = setMin;
        hashMap.put(setMax((byte) bArr118[125], 1338, (byte) bArr118[416]), 133);
        byte[] bArr119 = setMin;
        hashMap.put(setMax((byte) bArr119[46], 1342, (byte) bArr119[57]), 37);
        byte[] bArr120 = setMin;
        byte b34 = (byte) bArr120[7];
        hashMap.put(setMax(b34, (short) (b34 | 1345), (byte) bArr120[705]), 73);
        byte[] bArr121 = setMin;
        hashMap.put(setMax((byte) bArr121[7], 1357, (byte) bArr121[85]), 39);
        byte[] bArr122 = setMin;
        hashMap.put(setMax((byte) bArr122[46], 1363, (byte) bArr122[46]), 13);
        byte[] bArr123 = setMin;
        byte b35 = (byte) bArr123[0];
        hashMap.put(setMax(b35, (short) (b35 | 1364), (byte) bArr123[416]), 94);
        byte[] bArr124 = setMin;
        hashMap.put(setMax((byte) bArr124[63], 1380, (byte) bArr124[68]), Integer.valueOf(TsExtractor.TS_STREAM_TYPE_SPLICE_INFO));
        byte[] bArr125 = setMin;
        byte b36 = (byte) bArr125[46];
        hashMap.put(setMax(b36, (short) (b36 | 1382), (byte) bArr125[1665]), 125);
        byte[] bArr126 = setMin;
        hashMap.put(setMax((byte) bArr126[93], SecExceptionCode.SEC_ERROR_SECURITYBODY, (byte) bArr126[324]), 41);
        byte[] bArr127 = setMin;
        hashMap.put(setMax((byte) bArr127[4], SecExceptionCode.SEC_ERROR_SECURITYBODY_NET_ERROR, (byte) bArr127[69]), 117);
        byte[] bArr128 = setMin;
        hashMap.put(setMax((byte) bArr128[46], SecExceptionCode.SEC_ERROR_SECURITYBODY_NOT_INITED, (byte) bArr128[69]), 59);
        byte[] bArr129 = setMin;
        hashMap.put(setMax((byte) bArr129[7], 1419, (byte) bArr129[564]), 131);
        byte[] bArr130 = setMin;
        hashMap.put(setMax((byte) bArr130[63], 1425, (byte) bArr130[120]), 187);
        byte[] bArr131 = setMin;
        hashMap.put(setMax((byte) bArr131[68], 1436, (byte) bArr131[416]), 83);
        byte[] bArr132 = setMin;
        byte b37 = (byte) bArr132[120];
        hashMap.put(setMax(b37, (short) (b37 | 1440), (byte) bArr132[68]), 86);
        byte[] bArr133 = setMin;
        byte b38 = (byte) bArr133[1144];
        hashMap.put(setMax(b38, (short) (b38 | 1440), (byte) bArr133[705]), Integer.valueOf(TsExtractor.TS_STREAM_TYPE_AC3));
        byte[] bArr134 = setMin;
        hashMap.put(setMax((byte) bArr134[120], 1480, (byte) bArr134[68]), 28);
        byte[] bArr135 = setMin;
        hashMap.put(setMax((byte) bArr135[0], 1490, (byte) bArr135[120]), Integer.valueOf(SavingsActivity.RV_BENEFIT_WIDTH));
        byte[] bArr136 = setMin;
        hashMap.put(setMax((byte) bArr136[7], SecExceptionCode.SEC_ERROR_SECURITYBODY_UNSUPPORTED, (byte) bArr136[63]), 143);
        byte[] bArr137 = setMin;
        hashMap.put(setMax((byte) bArr137[63], 1504, (byte) bArr137[69]), 159);
        byte[] bArr138 = setMin;
        byte b39 = (byte) bArr138[93];
        hashMap.put(setMax(b39, (short) (b39 | 1512), (byte) bArr138[564]), 8);
        byte[] bArr139 = setMin;
        byte b40 = (byte) bArr139[68];
        hashMap.put(setMax(b40, (short) (b40 | 1504), (byte) bArr139[24]), 166);
        byte[] bArr140 = setMin;
        hashMap.put(setMax((byte) bArr140[324], 1532, (byte) bArr140[0]), 93);
        byte[] bArr141 = setMin;
        hashMap.put(setMax((byte) bArr141[324], 1550, (byte) bArr141[95]), 77);
        byte[] bArr142 = setMin;
        hashMap.put(setMax((byte) bArr142[146], 1568, (byte) bArr142[705]), 137);
        byte[] bArr143 = setMin;
        hashMap.put(setMax((byte) bArr143[120], 1590, (byte) bArr143[63]), 81);
        hashMap.put(setMax((byte) setMin[274], SecExceptionCode.SEC_ERROR_SAFETOKEN, 61), 165);
        byte[] bArr144 = setMin;
        hashMap.put(setMax((byte) bArr144[0], 1617, (byte) bArr144[564]), 106);
        byte[] bArr145 = setMin;
        hashMap.put(setMax((byte) bArr145[120], 1625, (byte) bArr145[416]), 173);
        byte[] bArr146 = setMin;
        hashMap.put(setMax((byte) bArr146[120], 1635, (byte) bArr146[116]), 144);
        byte[] bArr147 = setMin;
        hashMap.put(setMax((byte) bArr147[93], 1645, (byte) bArr147[324]), 154);
        byte[] bArr148 = setMin;
        hashMap.put(setMax((byte) bArr148[120], 1648, (byte) bArr148[24]), 149);
        byte[] bArr149 = setMin;
        hashMap.put(setMax((byte) bArr149[4], 1658, (byte) bArr149[116]), 64);
        byte[] bArr150 = setMin;
        hashMap.put(setMax((byte) bArr150[125], 1665, (byte) bArr150[120]), 45);
        byte[] bArr151 = setMin;
        hashMap.put(setMax((byte) bArr151[69], 1669, (byte) bArr151[63]), 48);
        byte[] bArr152 = setMin;
        byte b41 = (byte) bArr152[68];
        hashMap.put(setMax(b41, (short) (b41 | 1680), (byte) bArr152[416]), 26);
        byte[] bArr153 = setMin;
        hashMap.put(setMax((byte) bArr153[7], 1708, (byte) bArr153[120]), 171);
        hashMap.put(setMax((byte) setMin[0], 1714, 59), 42);
        byte[] bArr154 = setMin;
        hashMap.put(setMax((byte) bArr154[63], 1722, (byte) bArr154[57]), 10);
        byte[] bArr155 = setMin;
        byte b42 = (byte) bArr155[125];
        hashMap.put(setMax(b42, (short) (b42 | 1729), (byte) bArr155[120]), 35);
        byte[] bArr156 = setMin;
        hashMap.put(setMax((byte) bArr156[4], 1737, (byte) bArr156[705]), 25);
        byte[] bArr157 = setMin;
        hashMap.put(setMax((byte) bArr157[183], 1744, (byte) bArr157[274]), 68);
        byte[] bArr158 = setMin;
        hashMap.put(setMax((byte) bArr158[46], (short) (setMax | 1570), (byte) bArr158[179]), 88);
        byte[] bArr159 = setMin;
        hashMap.put(setMax((byte) bArr159[4], 1776, (byte) bArr159[416]), 72);
        byte[] bArr160 = setMin;
        byte b43 = (byte) bArr160[4];
        hashMap.put(setMax(b43, (short) (b43 | 1776), (byte) bArr160[128]), 178);
        byte[] bArr161 = setMin;
        hashMap.put(setMax((byte) bArr161[179], 1790, (byte) bArr161[24]), 49);
        byte[] bArr162 = setMin;
        hashMap.put(setMax((byte) bArr162[7], 1805, (byte) bArr162[1665]), 80);
        byte[] bArr163 = setMin;
        hashMap.put(setMax((byte) bArr163[120], 1811, (byte) bArr163[324]), 162);
        byte[] bArr164 = setMin;
        hashMap.put(setMax((byte) bArr164[120], 1821, (byte) bArr164[63]), 3);
        byte[] bArr165 = setMin;
        byte b44 = (byte) bArr165[7];
        hashMap.put(setMax(b44, (short) (b44 | Framer.ENTER_FRAME_PREFIX), (byte) bArr165[564]), 85);
        byte[] bArr166 = setMin;
        hashMap.put(setMax((byte) bArr166[7], 1837, (byte) bArr166[564]), 23);
        byte[] bArr167 = setMin;
        hashMap.put(setMax((byte) bArr167[46], 1843, (byte) bArr167[68]), 17);
        byte[] bArr168 = setMin;
        hashMap.put(setMax((byte) bArr168[21], 1852, (byte) bArr168[57]), 112);
        byte[] bArr169 = setMin;
        hashMap.put(setMax((byte) bArr169[68], 1865, (byte) bArr169[183]), 89);
        byte[] bArr170 = setMin;
        hashMap.put(setMax((byte) bArr170[57], 1879, (byte) bArr170[1665]), Integer.valueOf(WSContextConstant.HANDSHAKE_RECEIVE_SIZE));
        byte[] bArr171 = setMin;
        hashMap.put(setMax((byte) bArr171[179], 1891, (byte) bArr171[179]), 99);
        byte[] bArr172 = setMin;
        hashMap.put(setMax((byte) bArr172[179], SecExceptionCode.SEC_ERROR_GENERIC_AVMP_NO_BYTE_CODE, (byte) bArr172[274]), 123);
        byte[] bArr173 = setMin;
        hashMap.put(setMax((byte) bArr173[4], 1921, (byte) bArr173[1665]), 62);
        byte[] bArr174 = setMin;
        hashMap.put(setMax((byte) bArr174[68], 1928, (byte) bArr174[63]), 179);
        byte[] bArr175 = setMin;
        hashMap.put(setMax((byte) bArr175[93], 1942, (byte) bArr175[120]), 145);
        byte[] bArr176 = setMin;
        byte b45 = (byte) bArr176[128];
        hashMap.put(setMax(b45, (short) (b45 | 1921), (byte) bArr176[705]), 53);
        byte[] bArr177 = setMin;
        hashMap.put(setMax((byte) bArr177[46], 1969, (byte) bArr177[564]), 16);
        byte[] bArr178 = setMin;
        hashMap.put(setMax((byte) bArr178[63], 1978, (byte) bArr178[116]), 52);
        getMin = hashMap;
    }

    public final int getMin(JsonReader jsonReader) throws IOException {
        Integer num = getMin.get(jsonReader.nextName());
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int getMax(JsonReader jsonReader) throws IOException {
        Integer num = getMin.get(jsonReader.nextString());
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }
}
