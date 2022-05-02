package o;

import com.alibaba.wireless.security.SecExceptionCode;

public class ZimInitGwRequestPB {
    static final /* synthetic */ boolean length = (!ZimInitGwRequestPB.class.desiredAssertionStatus());
    static final length[] setMax = {new length(-1865951482774665761L, -1087, -308), new length(-6093090917745768758L, -1060, -300), new length(-38366372719436721L, -1034, -292), new length(-4731433901725329908L, -1007, -284), new length(-8228041688891786180L, -980, -276), new length(-3219690930897053053L, -954, -268), new length(-7101705404292871755L, -927, -260), new length(-1541319077368263733L, -901, -252), new length(-5851220927660403859L, -874, -244), new length(-9062348037703676329L, -847, -236), new length(-4462904269766699465L, -821, -228), new length(-8027971522334779313L, -794, -220), new length(-2921563150702462265L, -768, -212), new length(-6879582898840692748L, -741, -204), new length(-1210330751515841307L, -715, -196), new length(-5604615407819967858L, -688, -188), new length(-8878612607581929669L, -661, -180), new length(-4189117143640191558L, -635, -172), new length(-7823984217374209642L, -608, -164), new length(-2617598379430861436L, -582, -156), new length(-6653111496142234890L, -555, -148), new length(-872862063775190746L, -529, -140), new length(-5353181642124984136L, -502, -132), new length(-8691279853972075893L, -475, -124), new length(-3909969587797413805L, -449, -116), new length(-7616003081050118571L, -422, -108), new length(-2307682335666372931L, -396, -100), new length(-6422206049907525489L, -369, -92), new length(-528786136287117932L, -343, -84), new length(-5096825099203863601L, -316, -76), new length(-8500279345513818773L, -289, -68), new length(-3625356651333078602L, -263, -60), new length(-7403949918844649556L, -236, -52), new length(-1991698500497491194L, -210, -44), new length(-6186779746782440749L, -183, -36), new length(-177973607073265138L, -157, -28), new length(-4835449396872013077L, -130, -20), new length(-8305539271883716404L, -103, -12), new length(-3335171328526686932L, -77, -4), new length(-7187745005283311616L, -50, 4), new length(-1669528073709551616L, -24, 12), new length(-5946744073709551616L, 3, 20), new length(-9133518327554766460L, 30, 28), new length(-4568956265895094861L, 56, 36), new length(-8106986416796705680L, 83, 44), new length(-3039304518611664792L, 109, 52), new length(-6967307053960650171L, 136, 60), new length(-1341049929119499481L, 162, 68), new length(-5702008784649933400L, 189, 76), new length(-8951176327949752869L, 216, 84), new length(-4297245513042813542L, 242, 92), new length(-7904546130479028392L, 269, 100), new length(-2737644984756826646L, 295, 108), new length(-6742553186979055798L, 322, 116), new length(-1006140569036166267L, 348, 124), new length(-5452481866653427593L, 375, 132), new length(-8765264286586255934L, 402, 140), new length(-4020214983419339459L, 428, 148), new length(-7698142301602209613L, 455, 156), new length(-2430079312244744221L, 481, 164), new length(-6513398903789220827L, 508, 172), new length(-664674077828931748L, 534, 180), new length(-5198069505264599346L, 561, 188), new length(-8575712306248138270L, 588, 196), new length(-3737760522056206171L, 614, 204), new length(-7487697328667536417L, 641, 212), new length(-2116491865831296966L, 667, 220), new length(-6279758049420528746L, 694, 228), new length(-316522074587315140L, 720, 236), new length(-4938676049251384304L, 747, 244), new length(-8382449121214030822L, 774, 252), new length(-3449775934753242068L, 800, 260), new length(-7273132090830278359L, 827, 268), new length(-1796764746270372707L, 853, 276), new length(-6041542782089432023L, 880, 284), new length(-9204148869281624187L, 907, 292), new length(-4674203974643163859L, 933, 300), new length(-8185402070463610993L, 960, 308), new length(-3156152948152813503L, 986, 316), new length(-7054365918152680535L, 1013, 324), new length(-1470777745987373095L, 1039, 332), new length(-5798663540173640085L, 1066, 340)};

    static class length {
        long getMin;
        short length;
        short setMin;

        length(long j, short s, short s2) {
            this.getMin = j;
            this.setMin = s;
            this.length = s2;
        }
    }

    static int getMin(int i, validateStandard validatestandard) {
        double d = (double) (((-60 - i) + 64) - 1);
        Double.isNaN(d);
        length length2 = setMax[(((((int) Math.ceil(d * 0.30102999566398114d)) + SecExceptionCode.SEC_ERROR_STA_NO_MEMORY) - 1) / 8) + 1];
        validatestandard.setMax = length2.getMin;
        validatestandard.getMin = length2.setMin;
        if (length || (-60 <= validatestandard.getMin + i && validatestandard.getMin + i <= -32)) {
            return length2.length;
        }
        throw new AssertionError();
    }
}
