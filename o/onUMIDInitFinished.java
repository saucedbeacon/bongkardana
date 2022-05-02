package o;

import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import kotlin.text.Typography;

public final class onUMIDInitFinished {
    public static final int BCRYPT_SALT_LEN = 16;
    private static final int BLOWFISH_NUM_ROUNDS = 16;
    private static final int GENSALT_DEFAULT_LOG2_ROUNDS = 10;
    private static final int[] P_orig = {608135816, -2052912941, 320440878, 57701188, -1542899678, 698298832, 137296536, -330404727, 1160258022, 953160567, -1101764913, 887688300, -1062458953, -914599715, 1065670069, -1253635817, -1843997223, -1988494565};
    private static final int[] S_orig;
    private static final char[] base64_code = {'.', '/', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private static final int[] bf_crypt_ciphertext = {1332899944, 1700884034, 1701343084, 1684370003, 1668446532, 1869963892};
    private static boolean getMax = false;
    private static boolean getMin = false;
    private static final byte[] index_64 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -1, -1, -1, -1, -1, -1, -1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, 13, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, 22, Ascii.ETB, Ascii.CAN, Ascii.EM, Ascii.SUB, Ascii.ESC, -1, -1, -1, -1, -1, -1, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, Framer.ENTER_FRAME_PREFIX, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, Framer.STDIN_FRAME_PREFIX, 46, 47, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, -1, -1, -1, -1, -1};
    private static int length = 0;
    private static int setMax = 0;
    private static char[] setMin = null;
    private static int toFloatRange = 1;
    private int[] P;
    private int[] S;

    static void setMin() {
        setMax = 141;
        getMin = true;
        getMax = true;
        setMin = new char[]{226, 225, 211, 186, 197};
    }

    static {
        setMin();
        int[] iArr = new int[1024];
        ByteBuffer.wrap("Ñ1\u000b¦ßµ¬/ýrÛÐ\u001aß·¸á¯íj&~º|Eñ,$¡G³l÷\b\u0001òâü\u0016ci ØqWNi¤Xþ£ô=~\rtr¶XqÍX\u0015Jî{T¤\u001dÂZYµ0Õ9*ò`\u0013ÅÑ°#(`ðÊAy\u0018¸Û8ïyÜ°`:\u0018\u000el\u000e°\u001e>×\u0015wÁ½1K'x¯/ÚU`\\`æU%óªU«WHbcè\u0014@UÊ9j*«\u0010¶´Ì\\4\u0011AèÎ¡T¯|ré³î\u0014\u0011co¼*+©Å]t\u00181öÎ\\>\u0016\u001e¯Öº3l$Ï\\z2S(w;HkK¹¯Ä¿è\u001bf(!aØ\tÌû!©H|¬`]ì2ï]]éu±Ü&#\u0002ëe\u001b#>Ó¬Å\u000fmoóôB9.\u000bD¤ \u0004iÈðJ\u001f^!ÆhBöélg\fa«ÓðjQ ÒØT/h\u000f§(«Q3£nï\u000bl\u0013z;äº;ðP~û*¡ñe\u001d9¯\u0001vfÊY>C\u000eî\u0019Eo´}¥Ã;^¾àouØÁ s@\u001aDVÁj¦NÓªb6?w\u0006\u001bþßrB\u0002=7Ð×$Ð\n\u0012HÛ\u000fêÓIñÀ\u0007SrÉ\u001b{%ÔyØöèÞ÷ãþP\u001a¶yL;là½\u0004À\u0006ºÁ©O¶@`Ä^\\Â\u0019j$chûo¯>lSµ\u00139²ë;RìomüQ\u001f0,ÌED¯^½\t¾ãÐ\u0004Þ3Jýf\u000f(\u0007\u0019.K³ÀË¨WEÈt\u000fÒ\u000b_9¹ÓûÛUyÀ½\u001a`2\nÖ¡\u0000Æ@,ryg%þû\u001f£Ì¥éøÛ2\"ø<u\u0016ßýak\u0015/P\u001eÈ­\u0005R«2=µúý#`S1{H>\u0000ß\\W»Êo \u001aV.ß\u0017iÛÕB¨ö(~ÿÃ¬g2ÆOUsi['°»ÊXÈáÿ£]¸ð\u0011 \u0010ú=ý!¸Jüµl-ÑÓ[Säy¶øEeÒI¼KûáÝòÚ¤Ë~3bû\u0013AÎäÆèï ÊÚ6wL\u0001Ð~þ+ñ\u001f´ÛÚM®ê­qkÕ ÐÑÐ¯Ç%à<[/u·öâûò\u0012+d¸\u0012\rð\u001cO­^ hÃ\u001cÑÏñ³¨Á­//\"\u0018¾\u000e\u0017wêu-þ\u0002\u001f¡å Ì\u000fµotè\u0018¬óÖÎâ´¨Oàý\u0013à·|Ä;Ò­¨Ù\u0016_¢fw\u0005Ìs\u0014!\u001a\u0014wæ­ ewµúÇTBõû5ÏëÍ¯\f{> ÖA\u001bÓ®\u001e~I\u0000%\u000e- q³^\"h\u0000»W¸à¯$d6ð\t¹\u001eUc\u001dYß¦ªxÁCÙZS }[¢\u0002å¹Å&\u0003vbÏ©\u0011È\u0019hNsJA³G-Ê{\u0014©J\u001bQ\u0000RS)\u0015Ö\u000fW?¼Æä+`¤væt\u0000\bºoµW\u001bé\u001fòìk*\rÙ\u0015¶ce!ç¹ù¶ÿ4\u0005.ÅVdS°-]©¡\bºGn\u0007jKzpéµ³)DÛu\t.Ä\u0019&#­n¦°I§ß}î`¸í²fìªqi\u0017ÿVdRlÂ±á\u00196\u0002¥u\tL) Y\u0013@ä\u0018:>?T[BekäÖ÷?Ö¡Ò\u0007ïè0õM-8æð%]ÁLÝ pë&céÆ\u0002\u001eÌ^\thk?>ºïÉ<\u0018\u0014kjp¡h5R â·S\u0005ªP\u00077>\u0007\u001cÞ®\\}DìW\u0016ò¸°:Ú7ðP\f\rð\u001c\u001f\u0004\u0002\u0000³ÿ®\fõ\u001a<µt²%zXÜ\t!½Ñ\u0013ù|©/ö2Gs\"õG\u0001:åå7ÂÚÜÈµv4óÝ§©DaF\u000fÐ\u0003\u000eìÈÇ>¤u\u001eAâ8Í;ê\u000e/2»¡\u0018>³1NT8Om¹\boB\r\u0003ö\n\u0004¿,¸\u0012$|yVy°r¼¯¯Þw\u001fÙ\b\u0010³®\u0012ÜÏ?.U\u0012r\u001f.kq$P\u001aÝæÍzXG\u0018t\bÚ\u0017¼¼éK}ìzì:Û\u001dúc\tCfÄdÃÒï\u001c\u0018G2\u0015Ù\bÝC;7$Âº\u0016\u0012¡MC*eÄQP\u0000\u0002\u0013:äÝqßø\u00101NU¬wÖ_\u0011\u0019\u00045Vñ×£Çk<\u0011\u0018;Y$¥\tòæíñûúº¿,\u001e\u0015<nãEpêéo±\u000e^\nZ>*³w\u001fç\u001cN=\u0006ú)eÜ¹ç\u001d\u000f>ÖRfÈ%.LÉx\u0010³jÆ\u0015\u000eºâêx¥ü<S\u001e\n-ôò÷N§6\u001d+=\u00199&\u000f\u0019Ây`R#§\b÷\u0013\u0012¶ë­þnêÃ\u001ffã¼E¦{È±7Ñ\u0001ÿ(Ã2Ýï¾lZ¥eX!h«\u0002îÎ¥\u000fÛ/;*ï}­[n/\u0015!¶()\u0007apìÝGua\u0015\u0010\u0013Ì¨0ëa½\u00034þ\u001eª\u0003cÏµs\\Lp¢9Õ\u000bËªÞ\u0014îÌ¼`b,§«\\«²ónd\u001e¯\u0019½ðÊ #i¹eZ»P@hZ2<*´³1éÕÀ!¸÷T\u000b\u0019_ ÷~b=}¨ø7ã-w\u0011í_\u0016h\u0012\u000e5)Çæ\u001fÖÞß¡xXºWõ¥\u001b\"rcÃÿ\u001aÂFÍ³\nëS.0TÙHäm¼1(Xëòï4Æÿêþ(íaî|<s]J\u0014Ùèd·ãB\u0010]\u0014 >\u0013àEîâ¶£ª«êÛlO\u0015úËOÐÇBôBïj»µeO;\u001dAÍ!\u0005Ø\u001eyMÇäKGj=bPÏb¡ò[&Fü ÁÇ¶£\u0015$ÃiËtG\u000bV²\t[¿\u0000­\u0019H\u0014b±t#\u000e\u0000XB*\fUõê\u001d­ô>#?pa3rð~AÖ_ìñl\";Û|Þ7YËît`@ò§Îw2n¦\u0007\u0019øPèïØUaÙ5©i§ªÅ\f\u0006ÂZ\u0004«ü\u000bÊÜDz.ÃE4ýÕg\u0005\u000e\u001eÉÛsÛÓ\u0010UÍg_ÚyãgC@ÅÄ4eq>8Ø=(øñmÿ \u0015>!ç°=Jæã+Û­÷é=Zh@÷öL&\u001ci)4A\u0015 ÷v\u0002Ô÷¼ôk.Ô¢\u0000hÔ\b$q3 ôjC·Ô·P\u0000a¯\u001e9ö.$EF\u0014!Ot¿@Mü\u001dµ¯pôÝÓf /E¿¼\tì\u0003½¬mÐ1Ë\u0004ë'³Uý9AÚ%Gæ«Ê\n(Px%S\u0004)ô\n,Úé¶mûhÜ\u0014b×Hi\u0000h\u000eÀ¤'¡îO?þ¢è­µà\u0006zôÖ¶ªÎ\u001e|Ó7_ìÎx£@k*B þ5Ùó¹î9×«;\u0012N\u001dÉú÷Km\u0018V&£f1êã²:nútÝ[C2hAç÷Êx ûû\nõNØþ³E@V¬ºH'US:: þk©·ÐKU¨g¼¡\u0015XÌ©)cáÛ3¦*JV?1%ù^ô~\u001c)1|ýøè\u0002\u0004'/p»\u0015\\\u0005(,ãÁ\u0015HäÆm\"HÁ\u0013?Ç\u000fÜ\u0007ùÉîA\u0004\u001f\u000f@Gy¤]n\u00172_QëÕÀÑò¼ÁA\u00115d%{x4`*`ßøè£\u001fcl\u001b\u000e\u0012´Â\u0002á2¯fOÑÊÑ\u0015k#à3>á;$\u000bbî¾¹\"²¢\u000eæº\rÞr\f-¢÷(Ð\u0012xE·ýd}\bbçÌõðTI£o}HúÃý'ó>\u001e\nGcA.ÿt:on«ôøý7¨\u0012Ü`¡ëÝø\u001báLÛnk\rÆ{U\u0010mg,7'eÔ;ÜÐè\u0004ñ)\rÇÌ\u0000ÿ£µ9\u000fi\u000fí\u000bf{ûÎÛ} Ï\u000bÙ\u0015^£»\u0013/Q[­${y¿v;Öë79.³Ì\u0011Yy&âô.1-hB­§Æj+;\u0012uLÌx.ñ\u001cj\u0012B7·Qç\u0006¡»æKûcP\u001ak\u0010\u0018\u0011Êíú=%½ØâáÃÉDB\u0016Y\n\u0012\u0013Ù\fìnÕ«ê*d¯gNÚ¨_¾¿édäÃþ¼Wð÷À`x{ø`\u0003`MÑýFö8\u001f°wE®\u0004×6üÌBk3ð\u001e«q°A<\u0000^_w W¾½è®$UFB¿X.aNXôòÝý¢ôtï8½ÂSfùÃÈ³t´uòUFüÙ¹zë&a\u001dßj\u000ey_âFnY ´WpÕUÉ\u0002ÞL¹\u000b¬á»\u0005Ð\u0011¨bHut©·\u0019¶à©Ü\tf-\t¡Ä2F3èZ\u001f\u0002\tð¾J %\u001dnþ\u0010\u001a¹=\u001d\u000b¥¤ß¡ò\u000f(hñiÜ·ÚW9\u0006þ¡âÎOÍRP\u0011^\u0001§\u0006ú \u0002µÄ\ræÐ'ø'w?AÃ`L\u0006a¨\u0006µð\u0017z(Àõà\u0000`Xª0Ü}b\u0011æ×#8êcSÂÝÂÂ\u00164»ËîV¼¶Þëü}¡ÎY\u001dvo\u0005ä\tK|\u00019r\n=||$ãr_rM¹\u001aÁ[´Ó¸üíTUx\bü¥µØ=|ÓM­\u000fÄ\u001ePï^±aæø¢\u0014ÙlQ\u0013<oÕÇçVáNÄ6*¿ÎÝÆÈ7×24c\u0012g\u000eú@`\u0000à:9Î7ÓúõÏ«Âw7ZÅ-\u001b\\°gO£7BÓ'@¼¾Õ\u0011¿\u000fs\u0015Ö-\u001c~Ç\u0000Ä{·\u001bk!¡E²n±¾j6n´WH«/¼nyÆ£vÒeIÂÈS\u000føîFÞ}Õs\n\u001dLÐMÆ)9»Û©ºFP¬&è¾^ã\u0004¡úÕðj-Qcïâî\"ÀÂ¸C$.ö¥\u001e\u0003ªòÐ¤ÀaºéjMå\u0015Pºd[Ö(&¢ù§::áK©ïUbéÇ/ïÓ÷R÷Ú?\u0004oiwú\nYä©\u0015°\u0001\tæ­;>åéýZ4×,ð·Ù\u0002+QÕ¬:\u0001}¦}ÑÏ>Ö|}-(\u001f%Ï­ò¸ZÖ´rZõLà)¬qà\u0019¥æG°¬ýíúèÓÄ(;WÌøÕf)y\u0013.(x_\u0001íu`U÷\u000eDãÓ^\u0015\u0005mÔômº\u0003¡a%\u0005dð½Ãë\u0015<W¢'\u001aì©:\u0007*\u001b?m\u001ec!õõfû&Üó\u0019u3Ù(±Uýõ\u0003V4º<»(Qw\u0011Â\nÙø«ÌQgÌ­_Mè\u0017Q80Ü7Xb ùêzÂû>{ÎQ!ÎdwO¾2¨¶ã~Ã)=FHÞSid\u0013æ¢®\b\u0010Ým²$i-ý\t\u0007!f³F\ndEÀÝXlÞÏ\u001c È®[¾÷Ý\u001bX@ÌÒ\u0001k´ã»Ý¢j~:YÿE>5\nD¼´ÍÕrêÎ¨úd»f\u0012®¿<oGÒäcT/]®Âw\u001böNcpt\u000e\rç[\u0013Wør\u0016q¯S}]@@Ë\bN´âÌ4ÒFj\u0001\u0015¯á°\u0004(:\u001d\u0006¸´În Ho?;5 «\u0001\u001a\u001dK'r'øa\u0015`±ç?Ü»:y+4E%½ 9áQÎyK/2É· \u001fºÉà\u001cÈ~¼ÇÑöÏ\u0001\u0011Ã¡èªÇ\u001aIÔO½ÐÚÞËÕ\nÚ8\u00039Ã*Æ6gù1|à±+O÷Y·Cõ»:òÕ\u0019ÿ'ÙE¿\",\u0015æü*\u000füq\u0015%úåaÎ¶ëÂ¨dY\u0012º¨Ñ¶Á\u0007^ã\u0005j\f\u0010ÒPeË\u0003¤Bàìn\u000e\u0016Û;L ¾2xéd\u001f2àÓßÓ 4+qò\u001e\u001b\ntAK£4Å¾q Ãv2Øß5/.æ\u000boG\u000fãñ\u001dåLÚT\u001eÚØÎbyÏÍ>~o\u0016\u0018±fý,\u001d\u0005ÒÅöû\"õ#óW¦2v#¨51VÌÍ\u0002¬ðbZuëµn\u00166ÒsÌÞb¹IÐLP\u001bqÆV\u0014æÆÇ½2z\u0014\nEáÐ\u0006Ãò{ÉªSýb¨\u000f\u0000»%¿â5½Òöq\u0012i\u0005²\u0004\u0002\"¶ËÏ|Ív+S\u0011>À\u0016@ãÓ8«½`%G­ðº8 ÷FÎvw¯¡Å u``ËþNèØzªù°Lùª~\u0019HÂ\\\u0002û\u0001ÃjäÖëáùÔøi¦\\Þ ?\t%-Â\bæ·Na2Îwâ[Wßã:Ãræ".getBytes("ISO-8859-1")).asIntBuffer().get(iArr, 0, 1024);
        S_orig = iArr;
        int i = toFloatRange + 53;
        length = i % 128;
        int i2 = i % 2;
    }

    private static String encode_base64(byte[] bArr, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        if ((i <= 0) || i > bArr.length) {
            log("Invalid len when encoding base64");
            return null;
        }
        while (true) {
            if ((i2 < i ? 23 : 'L') == 'L') {
                break;
            }
            int i3 = i2 + 1;
            byte b = bArr[i2] & 255;
            stringBuffer.append(base64_code[(b >> 2) & 63]);
            int i4 = (b & 3) << 4;
            if ((i3 >= i ? 'U' : 'Q') != 'U') {
                int i5 = i3 + 1;
                byte b2 = bArr[i3] & 255;
                stringBuffer.append(base64_code[(i4 | ((b2 >> 4) & 15)) & 63]);
                int i6 = (b2 & Ascii.SI) << 2;
                if (i5 >= i) {
                    stringBuffer.append(base64_code[i6 & 63]);
                    break;
                }
                int i7 = i5 + 1;
                byte b3 = bArr[i5] & 255;
                stringBuffer.append(base64_code[(i6 | ((b3 >> 6) & 3)) & 63]);
                stringBuffer.append(base64_code[b3 & 63]);
                try {
                    int i8 = length + 11;
                    toFloatRange = i8 % 128;
                    int i9 = i8 % 2;
                    i2 = i7;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                try {
                    int i10 = toFloatRange + 37;
                    length = i10 % 128;
                    int i11 = i10 % 2;
                    stringBuffer.append(base64_code[i4 & 63]);
                    break;
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
        return stringBuffer.toString();
    }

    private static byte char64(char c) {
        int i = toFloatRange + 31;
        length = i % 128;
        int i2 = i % 2;
        if ((c >= 0 ? (char) 7 : 27) != 27) {
            int i3 = length + 107;
            toFloatRange = i3 % 128;
            int i4 = i3 % 2;
            if ((c > index_64.length ? 'Q' : Typography.quote) == '\"') {
                return index_64[c];
            }
        }
        int i5 = toFloatRange + 63;
        length = i5 % 128;
        int i6 = i5 % 2;
        return -1;
    }

    private static byte[] decode_base64(String str, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            int length2 = str.length();
            int i2 = 0;
            if (!(i > 0)) {
                log("Invalid maxolen while decoding base 64");
                return null;
            }
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if ((i3 < length2 + -1 ? 'I' : 'G') != 'G') {
                    if ((i4 < i ? (char) 8 : 10) == 10) {
                        break;
                    }
                    int i5 = i3 + 1;
                    byte char64 = char64(str.charAt(i3));
                    int i6 = i5 + 1;
                    byte char642 = char64(str.charAt(i5));
                    if (char64 == -1) {
                        break;
                    }
                    int i7 = toFloatRange + 109;
                    length = i7 % 128;
                    int i8 = i7 % 2;
                    if (char642 == -1) {
                        break;
                    }
                    int i9 = toFloatRange + 11;
                    length = i9 % 128;
                    int i10 = i9 % 2;
                    stringBuffer.append((char) ((byte) (((byte) (char64 << 2)) | ((char642 & 48) >> 4))));
                    i4++;
                    if (i4 >= i || i6 >= length2) {
                        break;
                    }
                    try {
                        int i11 = length + 69;
                        toFloatRange = i11 % 128;
                        int i12 = i11 % 2;
                        int i13 = i6 + 1;
                        byte char643 = char64(str.charAt(i6));
                        if (char643 == -1) {
                            break;
                        }
                        int i14 = length + 9;
                        toFloatRange = i14 % 128;
                        int i15 = i14 % 2;
                        stringBuffer.append((char) ((byte) (((byte) ((char642 & Ascii.SI) << 4)) | ((char643 & 60) >> 2))));
                        i4++;
                        if (i4 >= i) {
                            break;
                        }
                        int i16 = toFloatRange + 69;
                        length = i16 % 128;
                        int i17 = i16 % 2;
                        if (i13 >= length2) {
                            break;
                        }
                        stringBuffer.append((char) ((byte) (char64(str.charAt(i13)) | ((byte) ((char643 & 3) << 6)))));
                        i4++;
                        i3 = i13 + 1;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    break;
                }
            }
            byte[] bArr = new byte[i4];
            while (true) {
                if ((i2 < i4 ? '8' : '.') == '.') {
                    return bArr;
                }
                int i18 = length + 69;
                toFloatRange = i18 % 128;
                int i19 = i18 % 2;
                bArr[i2] = (byte) stringBuffer.charAt(i2);
                i2++;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private final void encipher(int[] iArr, int i) {
        int i2;
        int i3;
        try {
            int i4 = toFloatRange + 79;
            length = i4 % 128;
            int i5 = 0;
            if (i4 % 2 != 0) {
                int i6 = iArr[i];
                i2 = iArr[i % 0];
                i3 = i6 | this.P[0];
                i5 = 1;
            } else {
                int i7 = iArr[i];
                i2 = iArr[i + 1];
                i3 = i7 ^ this.P[0];
            }
            int i8 = toFloatRange + 17;
            length = i8 % 128;
            int i9 = i8 % 2;
            while (true) {
                if ((i5 <= 14 ? '^' : '\\') != '^') {
                    iArr[i] = this.P[17] ^ i2;
                    iArr[i + 1] = i3;
                    return;
                }
                int i10 = length + 71;
                toFloatRange = i10 % 128;
                int i11 = i10 % 2;
                int[] iArr2 = this.S;
                int i12 = ((iArr2[(i3 >> 24) & 255] + iArr2[((i3 >> 16) & 255) | 256]) ^ iArr2[((i3 >> 8) & 255) | 512]) + iArr2[(i3 & 255) | 768];
                int[] iArr3 = this.P;
                int i13 = i5 + 1;
                i2 ^= i12 ^ iArr3[i13];
                i5 = i13 + 1;
                i3 ^= iArr3[i5] ^ (((iArr2[(i2 >> 24) & 255] + iArr2[((i2 >> 16) & 255) | 256]) ^ iArr2[((i2 >> 8) & 255) | 512]) + iArr2[(i2 & 255) | 768]);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private static int streamtoword(byte[] bArr, int[] iArr) {
        int i = iArr[0];
        int i2 = length + 95;
        toFloatRange = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        byte b = 0;
        while (true) {
            if ((i4 < 4 ? (char) 16 : 18) != 16) {
                iArr[0] = i;
                return b;
            }
            try {
                int i5 = length + 33;
                toFloatRange = i5 % 128;
                if ((i5 % 2 == 0 ? (char) 10 : 5) != 10) {
                    b = (b << 8) | (bArr[i] & 255);
                    i = (i + 1) % bArr.length;
                    i4++;
                } else {
                    b = (b / Framer.STDOUT_FRAME_PREFIX) | (bArr[i] & 13306);
                    i = (i >> 0) >> bArr.length;
                    i4 += 3;
                }
            } catch (Exception e) {
                throw e;
            }
        }
    }

    private void init_key() {
        int i = length + 5;
        toFloatRange = i % 128;
        if (i % 2 != 0) {
            this.P = (int[]) P_orig.clone();
            this.S = (int[]) S_orig.clone();
            return;
        }
        this.P = (int[]) P_orig.clone();
        this.S = (int[]) S_orig.clone();
        Object[] objArr = null;
        int length2 = objArr.length;
    }

    private void key(byte[] bArr) {
        int i = length + 85;
        toFloatRange = i % 128;
        int i2 = i % 2;
        int[] iArr = {0};
        int[] iArr2 = {0, 0};
        int length2 = this.P.length;
        int length3 = this.S.length;
        int i3 = 0;
        while (true) {
            if ((i3 < length2 ? 'Y' : ';') == ';') {
                break;
            }
            int[] iArr3 = this.P;
            iArr3[i3] = iArr3[i3] ^ streamtoword(bArr, iArr);
            i3++;
        }
        int i4 = 0;
        while (true) {
            if ((i4 < length2 ? (char) 11 : 18) == 18) {
                break;
            }
            int i5 = toFloatRange + 101;
            length = i5 % 128;
            if (i5 % 2 != 0) {
                encipher(iArr2, 1);
                int[] iArr4 = this.P;
                iArr4[i4] = iArr2[0];
                iArr4[i4 >>> 0] = iArr2[1];
                i4 += 19;
            } else {
                encipher(iArr2, 0);
                int[] iArr5 = this.P;
                iArr5[i4] = iArr2[0];
                iArr5[i4 + 1] = iArr2[1];
                i4 += 2;
            }
        }
        int i6 = 0;
        while (i6 < length3) {
            encipher(iArr2, 0);
            int[] iArr6 = this.S;
            iArr6[i6] = iArr2[0];
            iArr6[i6 + 1] = iArr2[1];
            i6 += 2;
            int i7 = length + 81;
            toFloatRange = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private void ekskey(byte[] bArr, byte[] bArr2) {
        int i = length + 89;
        toFloatRange = i % 128;
        int i2 = i % 2;
        int[] iArr = {0};
        int[] iArr2 = {0};
        int[] iArr3 = {0, 0};
        int length2 = this.P.length;
        int length3 = this.S.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                break;
            }
            int[] iArr4 = this.P;
            iArr4[i3] = iArr4[i3] ^ streamtoword(bArr2, iArr);
            i3++;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= length2) {
                break;
            }
            int i5 = toFloatRange + 45;
            length = i5 % 128;
            int i6 = i5 % 2;
            iArr3[0] = iArr3[0] ^ streamtoword(bArr, iArr2);
            iArr3[1] = iArr3[1] ^ streamtoword(bArr, iArr2);
            encipher(iArr3, 0);
            int[] iArr5 = this.P;
            iArr5[i4] = iArr3[0];
            iArr5[i4 + 1] = iArr3[1];
            i4 += 2;
        }
        for (int i7 = 0; i7 < length3; i7 += 2) {
            iArr3[0] = iArr3[0] ^ streamtoword(bArr, iArr2);
            iArr3[1] = iArr3[1] ^ streamtoword(bArr, iArr2);
            encipher(iArr3, 0);
            int[] iArr6 = this.S;
            iArr6[i7] = iArr3[0];
            iArr6[i7 + 1] = iArr3[1];
        }
    }

    public final byte[] crypt_raw(byte[] bArr, byte[] bArr2, int i, int[] iArr) {
        int length2 = iArr.length;
        if (i < 4 || i > 31) {
            try {
                log("Bad number of rounds");
                return null;
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i2 = 1 << i;
            if (bArr2.length != 16) {
                log("Bad salt length");
                return null;
            }
            init_key();
            ekskey(bArr2, bArr);
            int i3 = length + 85;
            toFloatRange = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (true) {
                if (!(i5 < i2)) {
                    break;
                }
                int i6 = length + 95;
                toFloatRange = i6 % 128;
                int i7 = i6 % 2;
                key(bArr);
                key(bArr2);
                i5++;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= 64) {
                    break;
                }
                int i9 = toFloatRange + 29;
                length = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 0;
                while (i11 < (length2 >> 1)) {
                    encipher(iArr, i11 << 1);
                    i11++;
                    int i12 = toFloatRange + 23;
                    length = i12 % 128;
                    int i13 = i12 % 2;
                }
                i8++;
            }
            byte[] bArr3 = new byte[(length2 * 4)];
            int i14 = 0;
            for (int i15 = 0; i15 < length2; i15++) {
                int i16 = i14 + 1;
                bArr3[i14] = (byte) ((iArr[i15] >> 24) & 255);
                int i17 = i16 + 1;
                bArr3[i16] = (byte) ((iArr[i15] >> 16) & 255);
                int i18 = i17 + 1;
                bArr3[i17] = (byte) ((iArr[i15] >> 8) & 255);
                i14 = i18 + 1;
                bArr3[i18] = (byte) (iArr[i15] & 255);
            }
            return bArr3;
        }
    }

    public static String hashpw(String str, String str2) {
        int i;
        char c;
        String str3;
        StringBuffer stringBuffer = new StringBuffer();
        if (str2.charAt(0) == '$' && str2.charAt(1) == '2') {
            if (str2.charAt(2) != '$') {
                c = str2.charAt(2);
                if (c == 'a') {
                    int i2 = toFloatRange + 49;
                    length = i2 % 128;
                    int i3 = i2 % 2;
                    if (str2.charAt(3) == '$') {
                        i = 4;
                    }
                }
                log("Invalid salt revision");
                return null;
            }
            int i4 = toFloatRange + 51;
            length = i4 % 128;
            if ((i4 % 2 != 0 ? (char) 9 : 6) != 6) {
                c = 0;
                i = 2;
            } else {
                c = 0;
                i = 3;
            }
            int i5 = i + 2;
            if (str2.charAt(i5) > '$') {
                log("Missing salt rounds");
                return null;
            }
            int parseInt = Integer.parseInt(str2.substring(i, i5));
            String substring = str2.substring(i + 3, i + 25);
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (c >= 'a') {
                    str3 = "\u0000";
                } else {
                    str3 = "";
                    int i6 = toFloatRange + 55;
                    length = i6 % 128;
                    int i7 = i6 % 2;
                }
                sb.append(str3);
                byte[] bytes = sb.toString().getBytes(getMax(new byte[]{-123, -124, -125, -126, -127}, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (int[]) null, (char[]) null).intern());
                byte[] decode_base64 = decode_base64(substring, 16);
                byte[] crypt_raw = new onUMIDInitFinished().crypt_raw(bytes, decode_base64, parseInt, (int[]) bf_crypt_ciphertext.clone());
                if (crypt_raw == null) {
                    return null;
                }
                stringBuffer.append("$2");
                if (c >= 'a') {
                    int i8 = length + 113;
                    toFloatRange = i8 % 128;
                    int i9 = i8 % 2;
                    stringBuffer.append(c);
                    int i10 = length + 63;
                    toFloatRange = i10 % 128;
                    int i11 = i10 % 2;
                }
                stringBuffer.append("$");
                if ((parseInt < 10 ? 'M' : 23) != 23) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toString(parseInt));
                stringBuffer.append("$");
                String encode_base64 = encode_base64(decode_base64, decode_base64.length);
                if (encode_base64 == null) {
                    return null;
                }
                stringBuffer.append(encode_base64);
                String encode_base642 = encode_base64(crypt_raw, (bf_crypt_ciphertext.length * 4) - 1);
                if (encode_base642 == null) {
                    return null;
                }
                stringBuffer.append(encode_base642);
                return stringBuffer.toString();
            } catch (UnsupportedEncodingException unused) {
                log("UTF-8 is not supported");
                return null;
            }
        } else {
            log("Invalid salt version");
            return null;
        }
    }

    public static String gensalt(int i, SecureRandom secureRandom) {
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bArr = new byte[16];
        secureRandom.nextBytes(bArr);
        stringBuffer.append("$2a$");
        if (i < 10) {
            int i2 = toFloatRange + 73;
            length = i2 % 128;
            int i3 = i2 % 2;
            stringBuffer.append("0");
            int i4 = length + 113;
            toFloatRange = i4 % 128;
            int i5 = i4 % 2;
        }
        stringBuffer.append(Integer.toString(i));
        stringBuffer.append("$");
        stringBuffer.append(encode_base64(bArr, 16));
        return stringBuffer.toString();
    }

    public static String gensalt(int i) {
        try {
            String gensalt = gensalt(i, new SecureRandom());
            int i2 = length + 89;
            toFloatRange = i2 % 128;
            int i3 = i2 % 2;
            return gensalt;
        } catch (Exception e) {
            throw e;
        }
    }

    public static String gensalt() {
        int i = length + 95;
        toFloatRange = i % 128;
        int i2 = i % 2;
        String gensalt = gensalt(10);
        try {
            int i3 = length + 57;
            try {
                toFloatRange = i3 % 128;
                int i4 = i3 % 2;
                return gensalt;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static void log(String str) {
        int i = length + 77;
        toFloatRange = i % 128;
        int i2 = i % 2;
        createLoadingDialog.e("BCrypt ".concat(String.valueOf(str)));
        int i3 = length + 31;
        toFloatRange = i3 % 128;
        int i4 = i3 % 2;
    }

    private static String getMax(byte[] bArr, int i, int[] iArr, char[] cArr) {
        char[] cArr2 = setMin;
        int i2 = setMax;
        int i3 = 0;
        if (!getMax) {
            try {
                if ((getMin ? '=' : 'N') != '=') {
                    int length2 = iArr.length;
                    char[] cArr3 = new char[length2];
                    while (i3 < length2) {
                        try {
                            int i4 = length + 111;
                            toFloatRange = i4 % 128;
                            if ((i4 % 2 == 0 ? 22 : 'X') != 22) {
                                cArr3[i3] = (char) (cArr2[iArr[(length2 - 1) - i3] - i] - i2);
                                i3++;
                            } else {
                                cArr3[i3] = (char) (cArr2[iArr[(length2 >> 1) - i3] << i] << i2);
                                i3 += 56;
                            }
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    String str = new String(cArr3);
                    int i5 = length + 97;
                    toFloatRange = i5 % 128;
                    if ((i5 % 2 == 0 ? '*' : 'P') == 'P') {
                        return str;
                    }
                    Object obj = null;
                    super.hashCode();
                    return str;
                }
                int length3 = cArr.length;
                char[] cArr4 = new char[length3];
                while (i3 < length3) {
                    int i6 = toFloatRange + 53;
                    length = i6 % 128;
                    int i7 = i6 % 2;
                    cArr4[i3] = (char) (cArr2[cArr[(length3 - 1) - i3] - i] - i2);
                    i3++;
                }
                return new String(cArr4);
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            int length4 = bArr.length;
            char[] cArr5 = new char[length4];
            while (i3 < length4) {
                cArr5[i3] = (char) (cArr2[bArr[(length4 - 1) - i3] + i] - i2);
                i3++;
            }
            return new String(cArr5);
        }
    }
}
