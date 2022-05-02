package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.b;

@Singleton
public class DefaultExtensionRegistry extends setMinProgress implements setFireMoment {
    private static final int QR_REFRESH_TIME = 60;
    private static int getMin = 0;
    private static int length = 1;
    public static final byte[] setMax;
    public static final int setMin = 128;
    private final RVJsStatTrackService paymentModelMapper;
    private final getBundleName qrPayEntityDataFactory;
    private final access$2300 securityEntityDataFactory;

    static {
        byte[] bArr = new byte[5949];
        System.arraycopy("s05\u0000÷ý\u0001öý\u0002õ\u0002þù÷\bð\tïý\u0003ô\u0001þõý\u0004óý\u0005òý\u0006ñ\u0001ÿôý\u0007ð\u0003ùøý\bï\u0002þúöý\u0000ûøý\u0000ü÷\u0001\u0001ò\u0001\u0001ò\u0001\u0002ñý\u0000ýöý\u0000þõý\u0000ÿô\u0002þûõ\u0004\u0001ï\u0001\u0003÷õ\u0003\u0001ð\u0003\u0002ï\u0002û\u0004ï\u0002\u0003ï\u0005ýò\u0003\u0001ð\u0003\u0002ï\b÷õ\u0002ûþõ\u0001\u0004úñ\u0005úõ\u0002þô\u0002ÿóý\u0000\u0000ó\u0001þõý\u0000\u0001òý\u0000\u0002ñý\u0001öý\u0000þõý\u0006ó\u0011çÉ:ñ\tõÃ\u0017\u001füõþö\u0007ã\u001dé\u000fíÜ/çþ\u0007\u0000ñ\u0002û\u0000÷\u0003ùøý\u0001öý\u0002õý\u0003ôý\u0004ó\u0007ö÷ý\u0005ò\u0001ÿô\u0003ú÷ý\u0006ñ\u0002\u0002ðý\u0007ð\u0001\u0001ò\u0007÷öý\bï\u0007øõý\u0005òý\u0000ûøý\u0000ûø\u0001ÿôý\u0007ðý\u0000ü÷ý\u0000ýö\u0007ùô\u0003õ\u0003õ\u0003\u0001ð\u0003\u0002ï\u0007úó\u0007ûò\u0003ÿò\u0002\u0002ð\u0007üñ\u0003õ\u0007ýð\u0002\u0002ð\u0007þï\bôø\bð\bõ÷\u0002ÿóý\u0000þõ\u0001\u0001ò\u0002ÿóý\u0000ÿôý\u0000\u0000óý\u0000\u0001òý\u0000\u0002ñ\böö\u0003\u0002ï\b÷õ\bøô\bùó\u0005ó\u0002\u0002ð\u0004\u0001ï\u0004ô\u0002\u0003ï\búò\u0002þô\u0002ÿóý\u0000\u0003ð\u0001þõý\u0000\u0004ïý\u0001úøý\u0001û÷ý\u0000ûøý\u0000\u0001ó\u0011çÉ:ñ\tõÃ\u0017!òý\u000fÓ\"û×\u0013Ø)\u0002õò\u000bÎ/çþ\u0007\u0000ñ\u0002û\u0000÷\u0002\u0003ïý\u0001öý\u0002õý\u0003ôý\u0004ó\u0003üõý\u0001ö\u0001ÿô\u0002ýûöý\u0005òý\u0006ñý\u0006ñ\u0001ÿôý\u0005ò\u0003ùøý\u0007ð\u0002üþôý\bï\u0002úøý\u0000ûøý\u0000ü÷\u0001\u0001ò\u0001\u0001ò\u0001\u0002ñý\u0000ýöý\u0006ñý\u0000þõý\u0000ÿô\u0002ýüõ\u0002ýýô\túñ\u0004ô\tûð\u0001ÿþò\u0002\u0002ð\u0003õ\u0005ÿð\u0001û\u0002ò\u0001û\u0003ñ\u0001ÿ\u0001ï\u0001û\u0000ô\u0005ó\u0001ýû÷\bôø\bð\u0005úõ\u0005ûôý\u0000\u0000ó\u0001\u0001ò\u0002ÿóý\u0000\u0001òý\u0000\u0002ñý\u0000\u0003ðý\u0000\u0004ï\u0001\u0000ÿð\u0003õ\tûð\u0002\u0003ï\u0001üü÷\u0002\u0002ð\u0001ÿûõ\u0003\u0002ï\u0001\u0004öõ\u0005\u0000ï\u0006öø\u0002ýþó\u0004ô\u0004ù÷\u0004úö\u0002ÿóý\u0001úø\u0001þõý\u0001û÷ý\u0001üöý\u0000þ\u0000÷ý\u0001öý\u0002õý\u0002õ\u0001ÿôý\u0003ôý\u0002õ\u0005üóý\u0004óý\u0005ò\u0004ûõ\u0005ýò\u0005þñ\u0005ÿð\u0005ó\u0005\u0000ï\u0006öø\u0006÷÷\u0006øö\u0006ùõ\u0004\u0001ï\u0004ô\u0002\u0003ï\u0006úô\u0003õ\u0004\u0001ï\u0006ûó\u0006üò\u0006ýñ\tïý\u0006ñ\u0001þõý\u0007ðý\bïý\u0000ûø\u0001\u0001ò\u0001þõ\u0002\u0002ðý\u0000ü÷\u0006ÿïý\u0004ó\u0001ÿô\u0003ú÷ý\u0000ýö\u0002\u0002ðý\u0003ô\u0007õø\u0002úøý\u0000þõý\u0000ÿ\u0000÷ý\u0001öý\u0002õ\tùò\u0006øö\u0003õ\u0003\u0002ï\túñ\u0004ô\tûð\u0002\u0003ï\u0005ùö\u0005ó\tüï\u0003õ\u0004\u0001ï\u0004ô\u0005ó\u0002\u0002ð\u0004\u0001ï\u0001ûüø\u0002þô\u0002ÿóý\u0003ô\u0001\u0001ò\u0002ÿóý\u0004óý\u0005òý\u0006ñý\u0006ñý\u0007ðý\bïý\u0000ûøý\u0000ü÷ý\u0000ýö\u0003ùø\u0001ûý÷\u0002úøý\u0000þõý\u0000ÿôý\u0000\u0000ó\u0001ûþö\u0001ûÿõ\u0001û\u0000ô\túñ\u0004ô\tûð\u0002\u0003ï\u0005ùö\u0005ó\u0001û\u0001ó\u0005ÿð\u0001û\u0002ò\u0001û\u0003ñ\u0001û\u0004ð\u0005úõ\u0002þô\u0002ÿóý\u0000\u0001ò\u0001\u0001ò\u0002ÿóý\u0000\u0002ñý\u0000\u0003ðý\u0000\u0004ï\u0003ùø\tô÷ý\u0001úøý\u0001û÷ý\u0001üöý\u0001ýõý\u0000\u0004ïý\u0002õ\u0001û\u0005ï\u0001üûø\u0002\u0003ï\u0001üü÷\u0001üýö\u0001üþõ\u0001üÿô\u0004ô\u0006øö\u0004ô\u0005ó\u0001ü\u0000ó\bð\bõ÷\u0002ÿóý\u0003ô\u0001þõý\u0001þôý\u0001ÿóý\u0000ûøý\u0001ö\u0001ÿôý\u0001\u0000ò\u0001\u0001ò\u0007÷öý\u0001\u0001\u0000÷ý\u0001ö\u0001\u0000ùö\u0001\u0001úô\u0001þ\u0000ñ\u0005ó\u0001ýû÷\tûð\u0001ÿþò\u0002\u0002ð\u0004\u0001ï\u0003õ\u0003\u0001ð\u0003\u0002ï\u0004ô\túñ\u0001\u0002÷ö\u0001ÿýó\u0003õ\u0001\u0002øõ\u0005ùö\u0005ó\u0001þüõ\u0001\u0002õø\u0005ûôý\u0002õ\u0001\u0001ò\u0002ÿóý\u0003ôý\u0004óý\u0005òý\u0005òý\u0006ñý\u0007ð\u0003ùø\u0001\u0002ùô\u0001\u0002úóý\bïý\u0000ûøý\u0001ö\u0001\u0002ûò\u0004\u0001ï\u0005úõ\u0001\u0002üñ\u0001ýÿó\u0004\u0001ï\u0005úõ\u0001û\u0003ñ\u0001ýÿó\u0001\u0002ýð\tóø\u0002\u0003ï\u0004\u0001ï\u0001\u0002þï\u0005ùö\u0001\u0003ôø\tøó\u0002þô\u0002ÿóý\u0002õ\u0001\u0001ò\u0002ÿóý\u0000ü÷ý\u0000ýöý\u0000þõý\u0000ÿôý\u0000\u0000ó\u0001ÿôý\u0000\u0001ò\u0004üô\u0002ÿó\u0002\u0002ðý\u0000\u0002ñý\u0000þõý\u0000\u0003ð\u0001\u0003õ÷\u0001þ\u0001ð\u0005ûôý\u0000\u0004ï\u0001\u0001ò\u0002ÿóý\u0001úøý\u0001û÷ý\u0001üöý\u0001üöý\u0006ñ\u0003ùø\tô÷ý\u0001ýõý\u0001þôý\u0001ÿóý\u0001\u0000òý\u0001\u0001\u0000÷ý\u0001ö\u0001ü\u0001òý\u0002õý\u0003ôý\u0004ó\u0003ùø\tô÷ý\u0005òý\u0006ñý\u0007ðý\bïý\u0000ûøý\u0000ü÷\u0001ü\u0002ñ\u0002\u0002ðý\u0000ýö\u0001ÿôý\u0000þõý\u0000ÿôý\u0000\u0000óý\u0000\u0001ò\u0001ü\u0003ð\u0001ü\u0004ï\u0001ýúø\u0001ýû÷\u0001ýüö\u0003õ\u0003\u0002ï\u0005ó\u0002\u0002ð\u0004ô\u0001ýýõ\tïý\u0000\u0002ñ\u0001\u0001ò\u0002ÿóý\u0000\u0003ðý\u0000\u0004ïý\u0000ü÷ý\u0000\u0000óý\u0001úø\u0001ýþô\u0005úõ\u0003\u0001ð\u0003\u0002ï\u0001ýÿó\tóø\u0002\u0003ï\u0001ý\u0000ò\u0002ÿóý\u0001û÷\u0001\u0001ò\u0002ÿóý\u0001üöý\u0001ýõý\u0000ÿ\u0000÷\u0001ÿô\u0001þ\u0002ï\u0007øõ\u0001þþóý\u0001ö\u0001ÿøøý\u0002õý\u0003ôý\u0004ó\u0001ÿôý\u0001öý\u0005òý\u0006ñ\u0001ÿù÷\u0001þþóý\u0007ðý\bï\u0001ÿúö\u0001û\u0000ô\túñ\u0004ô\tûð\u0002\u0003ï\u0005ùö\u0005ó\u0001þüõ\u0001ÿûõ\u0006öø\u0005ó\u0001ÿüô\u0003\u0001ð\u0001ÿýó\u0003õ\u0004\u0001ï\tûð\u0001ÿþò\tüï\u0001ý\u0000ò\u0002ÿóý\u0000ûø\u0001þõý\u0000ü÷ý\u0000ýöý\u0000þõý\u0000ÿô\u0003ùøý\u0000\u0000óý\u0000\u0001ò\u0003ùøý\u0000\u0002ñý\u0000\u0003ð\u0003üõý\u0000\u0004ïý\u0001úø\u0001ÿÿñ\u0005þñ\u0003\u0001ð\u0001ÿ\u0000ð\u0001ÿüô\u0003\u0001ð\u0003\u0002ï\u0001ÿ\u0001ï\u0001\u0000÷ø\u0007þï\túñ\u0001\u0000ø÷\bð\u0002\u0003ï\tøó\u0005ûôý\u0001û÷\u0001þõý\u0001üöý\u0001ýõý\u0000ÿô\u0001\u0001ò\u0001þõ\u0002\u0002ðý\u0001þôý\bï\u0001\u0000ùö\u0003õ\u0001\u0000úõ\u0001û\u0003ñ\u0005ó\u0001üÿô\u0004ô\u0001\u0000ûô\u0003\u0001ð\u0001ýúø\u0002\u0002ð\u0004ô\u0002\u0003ï\u0001\u0000üó\u0006øö\u0006ùõ\u0004\u0001ï\u0004ô\bôø\u0004úö\u0002ÿóý\u0000ûø\u0001\u0001ò\u0002ÿóý\u0001ÿóý\u0001\u0000òý\u0001\u0001ñý\u0003ôý\u0003ôý\u0006ñý\u0007ð\tô÷ý\u0001\u0002ð\u0001\u0000ýò\u0002úøý\u0001\u0003ïý\u0002ùøý\u0003ô\u0002\u0003ïý\u0000\u0004ï\u0001\u0000þñý\u0002ó\u0011çÉ:ñ\tõÃ\u0017!\u0002íþú\tó\u0011çÉ:ñ\tõÃ\u0011%ñ\u000eüÌ\u001a\u000eýÍ/çþ\u0007\u0000ñ\u0002ûó\u0011çÉ:ñ\tõÃ\u001c#óüà\u001bö\u0001\u0002í\tÏ/çþ\u0007\u0000ñ\u0002û\u0000÷ý\u0001ö\u0002üþôý\u0002õý\u0003ô\u0001ÿôý\u0004óý\u0005ò\u0002üÿó\u0001û\u0003ñ\b÷õ\u0002ûþõ\u0002\u0003ï\tóø\u0005úõ\u0002þô\u0002ÿóý\u0006ñ\u0001þõý\u0007ðý\bïý\u0000ûøý\u0000ü÷\u0003ùø\tô÷ý\u0000ýöý\u0000þõý\u0000ÿô\u0003ùøý\u0000\u0000óý\u0000ûø\u0002ü\u0000ò\u0002úøý\u0000\u0001òý\u0000\u0002ñý\u0000\u0003ðý\u0000ü÷ý\u0000\u0004ï\u0002ü\u0001ñý\u0001úøý\u0001û÷\u0001ÿô\u0002ü\u0002ð\u0002\u0002ðý\u0004óý\u0005ò\u0002ü\u0003ï\u0005úõ\u0005ûôý\u0006ñ\u0001\u0001ò\u0002ÿóý\u0001üöý\u0001ýõý\u0001þô\u0001ü\u0002ñ\u0002\u0002ðý\u0001ÿóý\u0005ò\u0001\u0001øö\u0003õ\u0003õ\u0006ùõ\u0004ô\tûð\bôø\túñ\u0001\u0001öø\u0005÷ø\u0002\u0002ð\u0004ô\bôø\bð\u0005úõ\u0005ûôý\u0006ñ\u0001þõý\u0001\u0000òý\u0001\u0001ñý\u0001\u0002ð\u0002\u0003ïý\u0001\u0003ï\u0002ýùøý\u0002ùøý\u0000ü÷\u0002üþôý\u0002ú÷ý\u0002ûöý\u0002üõý\u0002ýô\u0001ÿôý\u0004ó\u0002ýú÷ý\u0002ùø\u0003üõý\u0001\u0003ï\u0002üþôý\u0002ú÷\u0003ú÷ý\u0002þó\u0002\u0002ðý\u0002ÿòý\u0002\u0000ñý\u0002\u0001ðý\u0000ü÷\u0003üõý\u0002\u0002ï\u0002ú\u0003ñý\u0001úøý\u0003øø\u0002\u0003ïý\u0002\u0002\u0000÷ý\u0001öý\u0002õ\u0001\u0003ýï\u0002\u0002ðý\u0003ô\u0004üô\u0002ÿó\u0002\u0002ðý\u0004ó\u0001ÿôý\u0005òý\u0006ñý\u0002õý\u0003ô\u0002ý\u0001ðý\u0007ðý\bïý\u0000ûø\u0001\u0001üò\bð\u0005úõ\u0002þô\u0002ÿóý\u0000ü÷\u0001\u0001ò\u0002ÿóý\u0000ýöý\u0000þõý\bïý\u0001öý\u0001ö\u0002ý\u0002ïý\u0007ðý\u0000ÿô\u0002þøø\u0003\u0002ï\u0005ó\u0002\u0002ð\u0004øø\bð\tïý\u0000\u0000ó\u0001\u0001ò\u0002ÿóý\u0000\u0001òý\u0000\u0002ñý\u0000\u0003\u0000÷ý\u0001ö\u0001ý\u0001ñ\bõ÷\u0002ÿóý\u0002õ\u0001\u0001ò\u0002ÿóý\u0003ôý\u0004óý\u0005ò\u0004üô\u0001\u0002ñý\u0006ñý\u0007ðý\bïý\bï\u0003ùøý\u0000ûøý\u0000ü÷ý\u0000ýöý\u0005òý\u0001ö\u0001ý\u0002ð\u0005ýò\u0004\u0001ï\u0001ý\u0003ï\u0003\u0001ð\u0003\u0002ï\u0004ô\u0001û\u0002ò\u0003\u0001ð\u0003\u0002ï\u0004ô\u0006÷÷\u0003õ\u0001þùø\u0005ó\u0002\u0002ð\u0001þú÷\u0005ùö\u0001þûö\u0004\u0001ï\tûð\u0002\u0003ï\u0001üü÷\u0001þüõ\u0003\u0002ï\tóø\bõ÷\u0002ÿóý\u0002õ\u0001\u0001ò\u0002ÿóý\u0000þõý\u0000ÿôý\u0007ð\u0001ÿôý\u0000\u0000\u0000÷\u0004üô\u0001\u0002ñý\u0001ö\u0003ùøý\u0002õý\u0003ô\u0003ùøý\u0004óý\u0005òý\u0006ñ\u0003üõý\u0007ðý\bï\u0001\u0000ÿð\u0003õ\u0001þ\u0000ñ\u0005ó\u0002\u0002ð\u0001\u0000\u0000ï\u0005ùö\u0005ó\u0002\u0002ð\u0001\u0001öø\tûð\u0001ÿþò\u0001\u0001÷÷\tóø\u0005úõ\u0002þô\u0002ÿóý\u0000ûø\u0001\u0001ò\u0002ÿóý\u0000ü÷ý\u0000ýöý\u0000þõ\u0002\u0003ïý\u0007ðý\u0000ÿô\u0003ú÷\u0003ûö\u0002\u0002ðý\u0000\u0000óý\u0000\u0001ò\u0001\u0001øö\u0003õ\u0003õ\u0003\u0001ð\u0001\u0001ùõ\u0004ô\u0004ù÷\u0001\u0001úô\tûð\u0002\u0003ï\u0005ùö\u0005ó\u0001þüõ\u0001\u0001ûó\u0005úõ\u0002þô\u0002ÿóý\u0000\u0002ñ\u0001\u0001ò\u0002ÿóý\u0000\u0003ðý\u0000\u0004ïý\u0001úøý\u0006ñý\u0000þõý\u0000ÿôý\u0000\u0000óý\u0006ñý\u0001û÷\u0001ÿôý\u0001üöý\u0000\u0001ò\u0001\u0001üò\u0003õ\u0003õ\u0004ô\u0003\u0001ð\u0003\u0002ï\u0005ó\u0001\u0001ýñ\u0005ó\u0002\u0002ð\u0001ÿûõ\u0003\u0002ï\u0001\u0001þð\u0002\u0003ï\u0001\u0001ÿï\u0001\u0000ø÷\bôø\u0005ó\u0001þüõ\u0001\u0002õø\u0002þô\u0002ÿóý\u0000\u0002ñ\u0001\u0001ò\u0002ÿóý\u0001ýõý\u0001þôý\u0001ÿó\tô÷ý\u0001\u0000ò\u0001\u0002ö÷ý\u0001\u0001ñý\u0001\u0002ðý\u0001ú\u0000÷ý\u0001ö\u0001ÿôý\u0002õý\u0003ôý\u0004óý\u0005ò\u0001\u0004ûð\u0003õ\u0001ûÿõ\u0001\u0004üï\u0003\u0002ï\túñ\tûð\u0001\u0004öõ\u0002\u0002ð\u0007þï\bôø\u0003õ\u0001\u0004öõ\u0002\u0002ð\u0001ýýõ\tïý\u0006ñ\u0001þõý\u0007ðý\bïý\u0000ûøý\u0001ö\u0001\u0001ò\u0001þõ\u0002\u0002ðý\u0000ü÷ý\u0001ö\u0003üõý\u0000ýöý\u0003ô\u0002úüø\u0001þþóý\u0004ó\u0002\u0003ïý\u0000ýöý\u0000þùøù\u0007\u0000÷ý\u0001öý\u0002õý\u0003ô\u0002û\u0000ó\u0004\u0001ï\u0002ûýö\u0002\u0002ð\u0002û\u0001ò\u0005úõ\u0005ûôý\u0004ó\u0001\u0001ò\u0002ÿóý\u0005òý\u0006ñý\u0007ðý\u0007ð\u0003ùøý\bï\u0002úø\u0002ú\u0003ñý\u0000ûøý\u0000ü÷ý\u0002õ\u0001ÿôý\u0000ýöý\u0000þõý\u0003ô\u0002û\u0002ñ\u0003õ\u0007ûò\u0002û\u0003ð\u0003\u0002ï\u0002û\u0004ï\u0002\u0003ï\u0001ý\u0000ò\u0002ÿóý\u0004ó\u0001\u0001ò\u0002ÿóý\u0000ÿôý\u0000\u0000óý\u0000þõý\u0000\u0001òý\u0000\u0002ñý\u0000\u0003ð\u0001\u0001ò\u0001þõ\u0002\u0002ðý\u0000\u0004ïý\u0001úø\u0002üúø\u0004\u0001ï\u0003õ\u0001ûÿõ\u0002üû÷\u0002üüö\u0002\u0002ð\u0002üýõ\u0007ûò\tûð\u0001þ\u0001ð\u0002þô\u0002ÿóý\u0001û÷\u0001\u0001ò\u0002ÿóý\u0001üöý\u0001ýõý\u0001\u0000÷ý\u0001öý\u0001ö\u0003ùøý\u0002õý\u0003ôý\u0004óý\u0005ò\u0004ûõý\u0006ñý\u0007ð\u0004üô\u0001\u0002ñý\bï\u0001ÿôý\u0000ûøý\u0001ö\u0004ýóý\u0006ñ\u0003ùøý\u0002õý\u0003ôý\u0004ó\u0004þò\u0004ÿñ\u0002\u0002ðý\u0005òý\u0000ü÷\u0004\u0000ð\u0004\u0001ï\u0003õ\u0004\u0001ï\u0005÷ø\u0005ø÷\u0002\u0003ï\u0005ùö\bð\u0005úõ\u0005ûôý\u0000ýö\u0001þõý\u0000þõý\u0000ÿôý\u0000\u0000\u0000÷ý\u0001ö\u0002ö\u0003õ\u0004ô\u0005ó\u0006ò\u0005ó\u0007ñ\bð\tïý\u0002õ\u0001þõý\u0003ôý\u0004óý\u0005ò\u0001ÿôý\u0006ñ\u0001\u0001ò\u0001\u0001ò\u0001\u0002ñý\u0007ðý\bïý\bï\u0002úøý\u0000ûøý\u0000ü÷ý\u0000ýöý\u0000þõý\u0000ÿô\u0002û÷ý\u0000\u0000óý\u0000\u0001òý\u0000\u0002ñ\u0002üöý\u0000\u0003ðý\u0000\u0004ïý\u0005òý\u0001ö\u0002ýõ\u0002þô\u0002ÿóý\u0002õ\u0001þõý\u0001úøý\u0001û÷ý\u0000\u0004õ\u000eñ×(ñý\u0000÷\u0001ÿôý\u0001öý\u0002õý\u0003ô\u0002úý÷\býï\u0003\u0002ï\u0001ýÿó\u0002úþö\túñ\u0001ýýõ\u0002\u0003ï\tóø\u0005úõ\u0002þô\u0002ÿóý\u0004ó\u0001\u0001ò\u0002ÿóý\u0005òý\u0006ñý\u0007ð\u0002úÿõý\bï\u0003ùøý\u0000ûø\u0002úø\u0002ú\u0000ôý\u0000ü÷ý\u0000ýö\u0001ü\u0002ñ\u0002\u0002ðý\u0000þõý\u0002õ\u0002ú\u0001óý\bïý\u0000ÿô\u0003ùøý\u0000ûø\u0002ú\u0002òý\u0000ü÷ý\u0000ýï\b\u0000ð\u0005ïå\u001dûÜ#óü\u0000÷ý\u0001ö\u0003ùøý\u0002õý\u0003ôý\u0004óý\u0005ò\u0003üõý\u0006ñ\u0001ÿôý\u0007ð\u0002\u0003ïý\u0006ñ\u0007øõý\bïý\u0000ûøý\u0000ûøý\u0000ü÷\u0001\u0003öö\u0004\u0001ï\u0001\u0003÷õ\u0001\u0003øô\u0001üþõ\u0001\u0001ýñ\u0001\u0000÷ø\u0001\u0000ø÷\u0002\u0003ï\u0005ùö\túñ\u0004\u0001ï\u0003\u0002ï\u0001\u0002ýð\u0001ûÿõ\u0003\u0002ï\u0005ó\u0001ýû÷\bôø\bð\u0005úõ\u0005ûôý\u0000ýö\u0001\u0001ò\u0002ÿóý\u0000þõý\u0000ÿôý\u0000\u0000óý\u0000ûøý\u0000\u0001òý\u0000\u0002ñý\u0000\u0003ðý\u0000\u0004ï\u0001\u0003õ÷\u0001\u0003ùó\u0003\u0001ð\u0001\u0000úõ\u0003\u0001ð\u0005÷ø\u0002\u0002ð\u0001\u0003úò\u0001ýÿó\tóø\u0001\u0003ûñ\u0003õ\u0004ô\u0005ó\u0001üÿô\bð\u0005úõ\u0002þô\u0002ÿóý\u0001úø\u0001þõý\u0001û÷ý\u0001üöý\u0001ýõ\u0001\u0003üðý\bïý\u0000\u0001ò\u0001\u0003ýï\u0002\u0002ðý\u0000\u0002ñý\u0000\u0000ó\u0001ÿô\u0001\u0003ýï\u0002\u0002ðý\u0007ðý\u0000ü÷\u0001\u0004óø\u0005ýò\u0004\u0001ï\u0003\u0001ð\u0001\u0004ô÷\u0001û\u0000ô\u0005ó\u0001\u0004õö\u0006úô\u0004\u0001ï\u0003õ\u0001\u0004öõ\u0001üÿô\u0001þ\u0001ð\u0005ûôý\u0000ýö\u0001\u0001ò\u0002ÿóý\u0001þôý\u0001ÿóý\u0001\u0000ò\u0001\u0001ò\u0001\u0001ò\u0001\u0002ñý\u0001\u0001ñý\u0000ûó\u0011çÉ:ñ\tõÃ\u0010)üùõø\tó\u0011çÉ:ñ\tõÃ!\u001dúó\u0001õ\u0000÷\u0003ùøý\u0001öý\u0002õ\u0001þýô\u0001þþóý\u0003ôý\u0004óý\u0005ò\u0001þÿò\u0004\u0001ï\u0001þ\u0000ñ\u0005ó\u0007ñ\u0002\u0003ï\u0005ùö\u0005ó\u0002\u0002ð\u0001ûÿõ\u0004ô\u0003\u0001ð\u0006ùõ\tûð\u0004ô\u0003õ\u0004\u0001ï\u0004ô\u0005ó\u0001ü\u0000ó\u0004úö\u0002ÿóý\u0006ñ\u0001þõý\u0007ðý\bïý\u0000ûøý\u0000ü÷\u0001ÿôý\u0000ýö\u0003ùøý\u0001öý\u0002õý\u0003ô\u0001\u0001ò\u0001þõ\u0002\u0002ðý\u0000þõý\u0000ÿôý\u0000\u0000ó\u0001û\u0005ï\u0001þ\u0001ð\u0005ûôý\u0000\u0001ò\u0001þõý\u0000\u0002ñý\u0000\u0003ðý\u0000ÿôý\u0004ó\u0003üõý\u0000\u0004ï\u0002\u0003ïý\u0000\u0004ïý\u0004\u0000÷\u0003ùøý\u0001öý\u0002õ\u0002üúø\u0001\u0001úô\u0007ûò\u0004\u0001ï\tûð\bð\bõ÷\u0002ÿóý\u0003ô\u0001þõý\u0004óý\u0005òý\u0006ñ\u0001ÿôý\u0007ðý\bïý\u0000ûø\u0001ü\u0002ñ\u0002\u0002ðý\u0000ü÷ý\u0002õ\u0002ýÿò\u0002ý\u0000ñ\u0007úó\u0004ô\u0005ó\u0006ò\túñ\u0004ô\u0001ûüø\u0002þô\u0002ÿóý\u0003ô\u0001þõý\u0000ýöý\u0000þõý\u0000ûøý\u0006ñý\b\u0000÷ý\u0001ö\u0001ÿôý\u0002õ\u0001\u0001ò\u0001\u0001ò\u0001\u0002ñý\u0003ô\u0003ùøý\u0004ó\u0002úø\u0002ú\u0003ñý\u0005òý\u0006ñý\u0007ðý\bï\u0001\u0003õ÷\u0004\u0001ï\u0003õ\u0001ü\u0004ï\u0003\u0002ï\u0004ô\túñ\u0002ûûø\u0002ûü÷\u0001þüõ\u0004ô\u0002\u0003ï\u0005ùö\u0005úõ\u0002ûýö\u0002ûþõ\u0002\u0003ï\tóø\tïý\u0000ûø\u0001\u0001ò\u0002ÿóý\u0000ü÷ý\u0000ýöý\u0007ðý\u0001öý\bï\u0002ûÿô\u0005ûôý\u0000ûø\u0001\u0001ò\u0002ÿóý\u0000þõý\u0000ÿôý\u0000\u0000óý\u0000\u0000ó\u0011çÉ:ñ\tõÃ#\u0015\u0001þ÷üûÿþíûç\u001dñ\të\u000fñ\u0002ûÓ/çþ\u0007\u0000ñ\u0002ûç\u0007\u0005ìæ\u0013\u0001\u0002Þ\u0007\u0007\u0005ì\u0000÷ý\u0001öý\u0002õ\u0001\u0004÷ô\u0003õ\u0003\u0001ð\u0001ÿ\u0000ð\u0002\u0002ð\b÷õ\u0005ÿð\u0001\u0004øó\u0001\u0004ùò\u0003\u0002ï\u0003\u0002ï\u0001ýû÷\u0002\u0003ï\u0005ùö\u0005ýò\u0004\u0001ï\u0001û\u0003ñ\b÷õ\u0002\u0002ð\tóø\u0001\u0004úñ\u0005úõ\u0005ûôý\u0003ô\u0001þõý\u0004óý\u0005òý\u0006ñ\u0002\u0003ïý\u0007ð\u0003ùøý\bïý\u0000ûø\u0003ú÷ý\u0000ü÷\u0002\u0002ðý\u0000ýö\u0003ùøý\bïý\u0000ûøý\u0000ýö\u0001ÿôý\u0000þõ\u0001\u0001ò\u0001\u0001ò\u0002ÿó\u0002\u0002ðý\u0000ÿôý\u0001ö\u0003üõý\u0007ðý\u0000\u0000óý\u0001úÿìó\u0011çÉ:ñ\tõÃ\u001c#ôñÿ\tÐ%ÿ÷ð\u000fÍ/çþ\u0007\u0000ñ\u0002ûó\u0011çÉ:ñ\tõÃ \u001fõ\u0002ñ\u0000ôÜ/çþ\u0007\u0000ñ\u0002ûó\u0011çÉ:ñ\tõÃ\u0017\u001füõþö\u0007Ñ-ñ\nôô\u0005\u0002Í/çþ\u0007\u0000ñ\u0002û\u0000÷\u0003üõý\u0001ö\u0004üô\u0002ÿó\u0002\u0002ðý\u0002õý\u0003ô\u0003ùø\bûñý\u0004óý\u0005òý\u0006ñý\u0007ðý\bï\büð\býï\u0003\u0002ï\b÷õ\u0002\u0002ð\tóø\u0002\u0003ï\tóø\tïý\u0000ûø\u0001\u0001ò\u0002ÿóý\u0000ü÷ý\u0000ýöý\u0000þõ\u0002\u0003ïý\u0001öý\u0000ÿô\u0001ÿô\u0003ú÷ý\u0000\u0000ó\u0002\u0002ðý\u0000\u0001òý\u0007ð\u0003ùø\tô÷ý\u0000\u0002ñý\u0000\u0003ðý\u0000\u0004ïý\u0001úøý\u0001û÷ý\u0007ðý\u0000þõý\u0001üö\tõö\u0004\u0001ï\u0003õ\u0003\u0002ï\töõ\t÷ô\u0005ó\u0002\u0002ð\u0004\u0001ï\u0003\u0002ï\tøó\u0002þô\u0002ÿóý\u0001ýõ\u0001þõý\u0001þôý\u0001ÿóý\u0001\u0000ò\u0001ÿôý\u0000\u0001ó\u0011çÉ:ñ\tõÃ\u0013/çþ\u0007\u0000ñ\u0002û\u0000÷ý\u0001ö\u0002úø\u0002\u0001ñý\u0002õý\u0003ôý\u0004ó\u0001\u0001ò\u0001þõ\u0002\u0002ðý\u0005ò\u0001ÿôý\u0006ñý\u0001öý\u0001ö\u0002\u0003ïý\u0007ð\u0002úø\u0003ùø\u0002úøý\u0002õý\u0003ô\u0003ú÷\u0003ûö\u0002\u0002ðý\u0004ó\u0003üõý\u0007ðý\bïý\u0000ûø\u0003þó\u0003ÿò\u0003\u0000ñ\u0003\u0001ð\u0003\u0002ï\u0003\u0002ï\u0002\u0002ð\u0004øø\u0003õ\u0004ô\u0004ù÷\u0004úö\u0002ÿóý\u0000ü÷\u0001\u0001ò\u0002ÿóý\u0000ýöý\u0000þõý\u0000ÿó\u0011çÉCûñÿ¾\u001d\u000f\u0004÷ú\rûó\u0011çÉ:ñ\tõÃ\u001d\u000f\u0004÷ú\ró\u0011çÉ:ñ\tõÃ\u000f-üë\u0014Ö\u001d÷ÿïÜ/çþ\u0007\u0000ñ\u0002û\u0000÷\u0003ùøý\u0001ö\u0002úø\u0002ú\u0003ñý\u0002õý\u0003ôý\u0004ó\u0001ü\u0002ñ\u0002\u0002ðý\u0005ò\u0003üõý\u0006ñý\u0007ð\u0002ú\u0004ð\u0004\u0001ï\u0003õ\u0004\u0001ï\u0001þ\u0000ñ\u0005ó\u0001ýû÷\t÷ô\u0005ó\u0001û\u0001ó\u0004ô\u0003\u0001ð\u0003\u0002ï\túñ\tûð\u0004ô\u0004\u0001ï\u0001\u0000úõ\u0004ù÷\bð\u0005úõ\u0005ûôý\bï\u0001þõý\u0000ûøý\u0000ü÷ý\u0000ýö\u0001ÿôý\u0000þõý\u0000ÿôý\u0007ð\u0001\u0003õ÷\u0004\u0001ï\u0003õ\u0001\u0000ø÷\u0002\u0003ï\u0001üü÷\u0002\u0002ð\u0004\u0001ï\u0003\u0002ï\tøó\u0005ûôý\bï\u0001\u0001ò\u0002ÿóý\u0000\u0000óý\u0000\u0001òý\u0004óý\u0000ÿôý\u0000\u0002ñý\u0000ÿô\u0001ÿô\u0002ú\u0005ï\u0002\u0002ðý\u0000þõ\u0002\u0003ïý\u0006".getBytes("ISO-8859-1"), 0, bArr, 0, 5949);
        setMax = bArr;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x027b, code lost:
        if (r12 <= 27) goto L_0x01ef;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private o.getExtensionMetaInfos createQrPayData() {
        /*
            r18 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r18
            r1.<init>(r2)
            r0 = 2121(0x849, float:2.972E-42)
            short r0 = (short) r0
            r3 = 275(0x113, float:3.85E-43)
            short r4 = (short) r3
            r5 = 73
            byte r5 = (byte) r5
            java.lang.String r0 = setMin(r0, r4, r5)
            int r4 = setMin
            r4 = r4 | 351(0x15f, float:4.92E-43)
            short r4 = (short) r4
            r5 = r4 & 1977(0x7b9, float:2.77E-42)
            short r5 = (short) r5
            r6 = 74
            byte r6 = (byte) r6
            java.lang.String r4 = setMin(r4, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x02f7 }
            r7 = 0
            r6[r7] = r4     // Catch:{ all -> 0x02f7 }
            r4 = 1282(0x502, float:1.796E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x02f7 }
            int r8 = setMin     // Catch:{ all -> 0x02f7 }
            r8 = r8 | 266(0x10a, float:3.73E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x02f7 }
            byte[] r9 = setMax     // Catch:{ all -> 0x02f7 }
            r10 = 22
            byte r9 = r9[r10]     // Catch:{ all -> 0x02f7 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x02f7 }
            java.lang.String r8 = setMin(r4, r8, r9)     // Catch:{ all -> 0x02f7 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x02f7 }
            r9 = 2363(0x93b, float:3.311E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x02f7 }
            int r11 = setMin     // Catch:{ all -> 0x02f7 }
            r11 = r11 | 277(0x115, float:3.88E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x02f7 }
            byte[] r12 = setMax     // Catch:{ all -> 0x02f7 }
            r13 = 21
            byte r12 = r12[r13]     // Catch:{ all -> 0x02f7 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x02f7 }
            java.lang.String r9 = setMin(r9, r11, r12)     // Catch:{ all -> 0x02f7 }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x02f7 }
            int r12 = setMin     // Catch:{ all -> 0x02f7 }
            r12 = r12 | 266(0x10a, float:3.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x02f7 }
            byte[] r14 = setMax     // Catch:{ all -> 0x02f7 }
            byte r14 = r14[r10]     // Catch:{ all -> 0x02f7 }
            int r14 = -r14
            byte r14 = (byte) r14     // Catch:{ all -> 0x02f7 }
            java.lang.String r12 = setMin(r4, r12, r14)     // Catch:{ all -> 0x02f7 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x02f7 }
            r11[r7] = r12     // Catch:{ all -> 0x02f7 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r11)     // Catch:{ all -> 0x02f7 }
            java.lang.Object r0 = r8.invoke(r0, r6)     // Catch:{ all -> 0x02f7 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x02f7 }
            int r6 = r0.length
            int[] r6 = new int[r6]
            r8 = 0
        L_0x0079:
            int r9 = r0.length
            r11 = 4
            if (r8 >= r9) goto L_0x011d
            r9 = r0[r8]
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x0114 }
            r12[r7] = r9     // Catch:{ all -> 0x0114 }
            r9 = 3658(0xe4a, float:5.126E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0114 }
            int r14 = setMin     // Catch:{ all -> 0x0114 }
            r14 = r14 | 265(0x109, float:3.71E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0114 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0114 }
            byte r15 = r15[r10]     // Catch:{ all -> 0x0114 }
            int r15 = -r15
            byte r15 = (byte) r15     // Catch:{ all -> 0x0114 }
            java.lang.String r14 = setMin(r9, r14, r15)     // Catch:{ all -> 0x0114 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0114 }
            int r15 = setMin     // Catch:{ all -> 0x0114 }
            r15 = r15 | 602(0x25a, float:8.44E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0114 }
            int r13 = setMin     // Catch:{ all -> 0x0114 }
            r13 = r13 | r3
            short r13 = (short) r13     // Catch:{ all -> 0x0114 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0114 }
            byte r11 = r16[r11]     // Catch:{ all -> 0x0114 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0114 }
            java.lang.String r11 = setMin(r15, r13, r11)     // Catch:{ all -> 0x0114 }
            java.lang.Class[] r13 = new java.lang.Class[r5]     // Catch:{ all -> 0x0114 }
            int r15 = setMin     // Catch:{ all -> 0x0114 }
            r15 = r15 | 266(0x10a, float:3.73E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0114 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0114 }
            byte r3 = r16[r10]     // Catch:{ all -> 0x0114 }
            int r3 = -r3
            byte r3 = (byte) r3     // Catch:{ all -> 0x0114 }
            java.lang.String r3 = setMin(r4, r15, r3)     // Catch:{ all -> 0x0114 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0114 }
            r13[r7] = r3     // Catch:{ all -> 0x0114 }
            java.lang.reflect.Method r3 = r14.getMethod(r11, r13)     // Catch:{ all -> 0x0114 }
            r11 = 0
            java.lang.Object r3 = r3.invoke(r11, r12)     // Catch:{ all -> 0x0114 }
            int r12 = setMin     // Catch:{ all -> 0x010b }
            r12 = r12 | 265(0x109, float:3.71E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x010b }
            byte[] r13 = setMax     // Catch:{ all -> 0x010b }
            byte r13 = r13[r10]     // Catch:{ all -> 0x010b }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x010b }
            java.lang.String r9 = setMin(r9, r12, r13)     // Catch:{ all -> 0x010b }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x010b }
            int r12 = setMin     // Catch:{ all -> 0x010b }
            r12 = r12 | 596(0x254, float:8.35E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x010b }
            int r13 = setMin     // Catch:{ all -> 0x010b }
            r13 = r13 | 274(0x112, float:3.84E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x010b }
            byte[] r14 = setMax     // Catch:{ all -> 0x010b }
            r15 = 5678(0x162e, float:7.957E-42)
            byte r14 = r14[r15]     // Catch:{ all -> 0x010b }
            byte r14 = (byte) r14     // Catch:{ all -> 0x010b }
            java.lang.String r12 = setMin(r12, r13, r14)     // Catch:{ all -> 0x010b }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r11)     // Catch:{ all -> 0x010b }
            java.lang.Object r3 = r9.invoke(r3, r11)     // Catch:{ all -> 0x010b }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x010b }
            int r3 = r3.intValue()     // Catch:{ all -> 0x010b }
            r6[r8] = r3
            int r8 = r8 + 1
            r3 = 275(0x113, float:3.85E-43)
            r13 = 21
            goto L_0x0079
        L_0x010b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0113
            throw r1
        L_0x0113:
            throw r0
        L_0x0114:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011c
            throw r1
        L_0x011c:
            throw r0
        L_0x011d:
            r3 = 11
            r4 = 8
            r8 = 10
            r9 = 27
        L_0x0125:
            int r12 = r7 + 1
            r0 = r6[r7]     // Catch:{ all -> 0x01cb }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x01cb }
            r7 = 15
            r13 = 18
            r14 = 19
            switch(r0) {
                case -15: goto L_0x01c4;
                case -14: goto L_0x01c0;
                case -13: goto L_0x01b1;
                case -12: goto L_0x01a4;
                case -11: goto L_0x019c;
                case -10: goto L_0x0194;
                case -9: goto L_0x0191;
                case -8: goto L_0x017e;
                case -7: goto L_0x017b;
                case -6: goto L_0x0178;
                case -5: goto L_0x015d;
                case -4: goto L_0x0158;
                case -3: goto L_0x0143;
                case -2: goto L_0x013b;
                case -1: goto L_0x0138;
                default: goto L_0x0136;
            }     // Catch:{ all -> 0x01cb }
        L_0x0136:
            goto L_0x01c8
        L_0x0138:
            r7 = 11
            goto L_0x0125
        L_0x013b:
            r1.getMax(r7)     // Catch:{ all -> 0x01cb }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01cb }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01cb }
            throw r0     // Catch:{ all -> 0x01cb }
        L_0x0143:
            r1.getMax = r5     // Catch:{ all -> 0x01cb }
            r1.getMax(r8)     // Catch:{ all -> 0x01cb }
            r1.getMax(r13)     // Catch:{ all -> 0x01cb }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01cb }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x01cb }
            o.getBundleName r0 = r0.qrPayEntityDataFactory     // Catch:{ all -> 0x01cb }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x01cb }
        L_0x0153:
            r1.getMax(r14)     // Catch:{ all -> 0x01cb }
            goto L_0x01c8
        L_0x0158:
            java.lang.String r0 = "network"
            r1.IsOverlapping = r0     // Catch:{ all -> 0x01cb }
            goto L_0x0153
        L_0x015d:
            r0 = 2
            r1.getMax = r0     // Catch:{ all -> 0x01cb }
            r1.getMax(r8)     // Catch:{ all -> 0x01cb }
            r1.getMax(r13)     // Catch:{ all -> 0x01cb }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01cb }
            o.getBundleName r0 = (o.getBundleName) r0     // Catch:{ all -> 0x01cb }
            r1.getMax(r13)     // Catch:{ all -> 0x01cb }
            java.lang.Object r7 = r1.toIntRange     // Catch:{ all -> 0x01cb }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01cb }
            o.getExtensionMetaInfos r0 = r0.createData((java.lang.String) r7)     // Catch:{ all -> 0x01cb }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x01cb }
            goto L_0x0153
        L_0x0178:
            r7 = 14
            goto L_0x0125
        L_0x017b:
            r7 = 10
            goto L_0x0125
        L_0x017e:
            r0 = 34
            r1.getMax(r0)     // Catch:{ all -> 0x01cb }
            int r0 = r1.length     // Catch:{ all -> 0x01cb }
            r7 = 41
            if (r0 == r7) goto L_0x018e
            r7 = 46
            r7 = 19
            goto L_0x0125
        L_0x018e:
            r0 = 3
            r7 = 3
            goto L_0x0125
        L_0x0191:
            r7 = 27
            goto L_0x0125
        L_0x0194:
            r1.getMax(r7)     // Catch:{ all -> 0x01cb }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01cb }
            o.getExtensionMetaInfos r0 = (o.getExtensionMetaInfos) r0     // Catch:{ all -> 0x01cb }
            return r0
        L_0x019c:
            int r0 = getMin     // Catch:{ all -> 0x01cb }
            r1.getMax = r0     // Catch:{ all -> 0x01cb }
            r1.getMax(r5)     // Catch:{ all -> 0x01cb }
            goto L_0x01c8
        L_0x01a4:
            r1.getMax = r5     // Catch:{ all -> 0x01cb }
            r1.getMax(r8)     // Catch:{ all -> 0x01cb }
            r1.getMax(r3)     // Catch:{ all -> 0x01cb }
            int r0 = r1.length     // Catch:{ all -> 0x01cb }
            length = r0     // Catch:{ all -> 0x01cb }
            goto L_0x01c8
        L_0x01b1:
            r0 = 12
            r1.getMax(r0)     // Catch:{ all -> 0x01cb }
            int r0 = r1.length     // Catch:{ all -> 0x01cb }
            if (r0 != 0) goto L_0x01c8
            r0 = 43
            r7 = 43
            goto L_0x0125
        L_0x01c0:
            r7 = 17
            goto L_0x0125
        L_0x01c4:
            r7 = 8
            goto L_0x0125
        L_0x01c8:
            r7 = r12
            goto L_0x0125
        L_0x01cb:
            r0 = move-exception
            r7 = 768(0x300, float:1.076E-42)
            short r7 = (short) r7
            r13 = 371(0x173, float:5.2E-43)
            short r13 = (short) r13
            byte[] r14 = setMax
            byte r14 = r14[r10]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r14 = setMin(r7, r13, r14)
            java.lang.Class r14 = java.lang.Class.forName(r14)
            boolean r14 = r14.isInstance(r0)
            r15 = 5
            r16 = 16
            if (r14 == 0) goto L_0x01f3
            if (r12 < r11) goto L_0x01f3
            if (r12 > r15) goto L_0x01f3
        L_0x01ed:
            r5 = 21
        L_0x01ef:
            r7 = 16
            goto L_0x02ea
        L_0x01f3:
            r14 = 3615(0xe1f, float:5.066E-42)
            short r14 = (short) r14
            r3 = 380(0x17c, float:5.32E-43)
            short r3 = (short) r3
            byte[] r17 = setMax
            byte r5 = r17[r10]
            int r5 = -r5
            byte r5 = (byte) r5
            java.lang.String r3 = setMin(r14, r3, r5)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0212
            if (r12 < r15) goto L_0x0212
            if (r12 > r4) goto L_0x0212
            goto L_0x01ed
        L_0x0212:
            int r3 = setMin
            r5 = r3 | 97
            short r5 = (short) r5
            r3 = r3 | 263(0x107, float:3.69E-43)
            short r3 = (short) r3
            byte[] r14 = setMax
            byte r14 = r14[r10]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r3 = setMin(r5, r3, r14)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0235
            r3 = 6
            if (r12 < r3) goto L_0x0235
            r3 = 7
            if (r12 > r3) goto L_0x0235
            goto L_0x01ed
        L_0x0235:
            r3 = 23
            if (r12 < r3) goto L_0x0240
            if (r12 > r9) goto L_0x0240
            r5 = 21
            r7 = 1
            goto L_0x02ea
        L_0x0240:
            byte[] r5 = setMax
            byte r5 = r5[r10]
            int r5 = -r5
            byte r5 = (byte) r5
            java.lang.String r5 = setMin(r7, r13, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x025b
            r5 = 20
            if (r12 < r5) goto L_0x025b
            if (r12 > r9) goto L_0x025b
            goto L_0x01ed
        L_0x025b:
            int r5 = setMin
            r7 = r5 | 97
            short r7 = (short) r7
            r5 = r5 | 263(0x107, float:3.69E-43)
            short r5 = (short) r5
            byte[] r13 = setMax
            byte r13 = r13[r10]
            int r13 = -r13
            byte r13 = (byte) r13
            java.lang.String r5 = setMin(r7, r5, r13)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x027f
            r5 = 21
            if (r12 < r5) goto L_0x0281
            if (r12 > r9) goto L_0x0281
        L_0x027d:
            goto L_0x01ef
        L_0x027f:
            r5 = 21
        L_0x0281:
            int r7 = setMin
            r13 = r7 | 97
            short r13 = (short) r13
            r7 = r7 | 263(0x107, float:3.69E-43)
            short r7 = (short) r7
            byte[] r14 = setMax
            byte r14 = r14[r10]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r7 = setMin(r13, r7, r14)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x02a2
            if (r12 < r10) goto L_0x02a2
            if (r12 > r3) goto L_0x02a2
            goto L_0x027d
        L_0x02a2:
            int r3 = setMin
            r3 = r3 | 351(0x15f, float:4.92E-43)
            short r3 = (short) r3
            r7 = 376(0x178, float:5.27E-43)
            short r7 = (short) r7
            byte[] r13 = setMax
            byte r13 = r13[r10]
            int r13 = -r13
            byte r13 = (byte) r13
            java.lang.String r3 = setMin(r3, r7, r13)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x02c5
            if (r12 < r9) goto L_0x02c5
            r3 = 28
            if (r12 > r3) goto L_0x02c5
            goto L_0x027d
        L_0x02c5:
            byte[] r3 = setMax
            r7 = 2117(0x845, float:2.967E-42)
            byte r7 = r3[r7]
            short r7 = (short) r7
            r13 = r7 | 353(0x161, float:4.95E-43)
            short r13 = (short) r13
            byte r3 = r3[r10]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r3 = setMin(r7, r13, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x02f6
            r3 = 39
            if (r12 < r3) goto L_0x02f6
            r3 = 44
            if (r12 > r3) goto L_0x02f6
            goto L_0x027d
        L_0x02ea:
            r1.IsOverlapping = r0
            r0 = 26
            r1.getMax(r0)
            r3 = 11
            r5 = 1
            goto L_0x0125
        L_0x02f6:
            throw r0
        L_0x02f7:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02ff
            throw r1
        L_0x02ff:
            goto L_0x0301
        L_0x0300:
            throw r0
        L_0x0301:
            goto L_0x0300
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.createQrPayData():o.getExtensionMetaInfos");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02bb, code lost:
        if (r13 <= 5) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02f3, code lost:
        if (r13 <= 48) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0342, code lost:
        if (r13 <= 67) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0152, code lost:
        r1.getMax(19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r1.getMax(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private o.access$2400 createSecurityData() {
        /*
            r22 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r22
            r1.<init>(r2)
            int r0 = setMin
            r3 = r0 | 5408(0x1520, float:7.578E-42)
            short r3 = (short) r3
            r4 = 67
            r0 = r0 | r4
            short r0 = (short) r0
            r5 = 73
            byte r5 = (byte) r5
            java.lang.String r0 = setMin(r3, r0, r5)
            int r3 = setMin
            r3 = r3 | 351(0x15f, float:4.92E-43)
            short r3 = (short) r3
            r5 = r3 & 1977(0x7b9, float:2.77E-42)
            short r5 = (short) r5
            r6 = 74
            byte r6 = (byte) r6
            java.lang.String r3 = setMin(r3, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x037b }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x037b }
            r3 = 1282(0x502, float:1.796E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x037b }
            int r8 = setMin     // Catch:{ all -> 0x037b }
            r8 = r8 | 266(0x10a, float:3.73E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x037b }
            byte[] r9 = setMax     // Catch:{ all -> 0x037b }
            r10 = 22
            byte r9 = r9[r10]     // Catch:{ all -> 0x037b }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x037b }
            java.lang.String r8 = setMin(r3, r8, r9)     // Catch:{ all -> 0x037b }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x037b }
            r9 = 2363(0x93b, float:3.311E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x037b }
            int r11 = setMin     // Catch:{ all -> 0x037b }
            r11 = r11 | 277(0x115, float:3.88E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x037b }
            byte[] r12 = setMax     // Catch:{ all -> 0x037b }
            r13 = 21
            byte r12 = r12[r13]     // Catch:{ all -> 0x037b }
            byte r12 = (byte) r12     // Catch:{ all -> 0x037b }
            java.lang.String r9 = setMin(r9, r11, r12)     // Catch:{ all -> 0x037b }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x037b }
            int r12 = setMin     // Catch:{ all -> 0x037b }
            r12 = r12 | 266(0x10a, float:3.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x037b }
            byte[] r13 = setMax     // Catch:{ all -> 0x037b }
            byte r13 = r13[r10]     // Catch:{ all -> 0x037b }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x037b }
            java.lang.String r12 = setMin(r3, r12, r13)     // Catch:{ all -> 0x037b }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x037b }
            r11[r7] = r12     // Catch:{ all -> 0x037b }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r11)     // Catch:{ all -> 0x037b }
            java.lang.Object r0 = r8.invoke(r0, r6)     // Catch:{ all -> 0x037b }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x037b }
            int r6 = r0.length
            int[] r6 = new int[r6]
            r8 = 0
        L_0x007c:
            int r9 = r0.length
            r11 = 4
            r12 = 0
            if (r8 >= r9) goto L_0x0120
            r9 = r0[r8]
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x0117 }
            r13[r7] = r9     // Catch:{ all -> 0x0117 }
            r9 = 3658(0xe4a, float:5.126E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0117 }
            int r14 = setMin     // Catch:{ all -> 0x0117 }
            r14 = r14 | 265(0x109, float:3.71E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0117 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0117 }
            byte r15 = r15[r10]     // Catch:{ all -> 0x0117 }
            int r15 = -r15
            byte r15 = (byte) r15     // Catch:{ all -> 0x0117 }
            java.lang.String r14 = setMin(r9, r14, r15)     // Catch:{ all -> 0x0117 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0117 }
            int r15 = setMin     // Catch:{ all -> 0x0117 }
            r15 = r15 | 602(0x25a, float:8.44E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0117 }
            int r4 = setMin     // Catch:{ all -> 0x0117 }
            r4 = r4 | 275(0x113, float:3.85E-43)
            short r4 = (short) r4     // Catch:{ all -> 0x0117 }
            byte[] r17 = setMax     // Catch:{ all -> 0x0117 }
            byte r11 = r17[r11]     // Catch:{ all -> 0x0117 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0117 }
            java.lang.String r4 = setMin(r15, r4, r11)     // Catch:{ all -> 0x0117 }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x0117 }
            int r15 = setMin     // Catch:{ all -> 0x0117 }
            r15 = r15 | 266(0x10a, float:3.73E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0117 }
            byte[] r17 = setMax     // Catch:{ all -> 0x0117 }
            byte r5 = r17[r10]     // Catch:{ all -> 0x0117 }
            int r5 = -r5
            byte r5 = (byte) r5     // Catch:{ all -> 0x0117 }
            java.lang.String r5 = setMin(r3, r15, r5)     // Catch:{ all -> 0x0117 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0117 }
            r11[r7] = r5     // Catch:{ all -> 0x0117 }
            java.lang.reflect.Method r4 = r14.getMethod(r4, r11)     // Catch:{ all -> 0x0117 }
            java.lang.Object r4 = r4.invoke(r12, r13)     // Catch:{ all -> 0x0117 }
            int r5 = setMin     // Catch:{ all -> 0x010e }
            r5 = r5 | 265(0x109, float:3.71E-43)
            short r5 = (short) r5     // Catch:{ all -> 0x010e }
            byte[] r11 = setMax     // Catch:{ all -> 0x010e }
            byte r11 = r11[r10]     // Catch:{ all -> 0x010e }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x010e }
            java.lang.String r5 = setMin(r9, r5, r11)     // Catch:{ all -> 0x010e }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x010e }
            int r9 = setMin     // Catch:{ all -> 0x010e }
            r9 = r9 | 596(0x254, float:8.35E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x010e }
            int r11 = setMin     // Catch:{ all -> 0x010e }
            r11 = r11 | 274(0x112, float:3.84E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010e }
            byte[] r13 = setMax     // Catch:{ all -> 0x010e }
            r14 = 5678(0x162e, float:7.957E-42)
            byte r13 = r13[r14]     // Catch:{ all -> 0x010e }
            byte r13 = (byte) r13     // Catch:{ all -> 0x010e }
            java.lang.String r9 = setMin(r9, r11, r13)     // Catch:{ all -> 0x010e }
            java.lang.reflect.Method r5 = r5.getMethod(r9, r12)     // Catch:{ all -> 0x010e }
            java.lang.Object r4 = r5.invoke(r4, r12)     // Catch:{ all -> 0x010e }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x010e }
            int r4 = r4.intValue()     // Catch:{ all -> 0x010e }
            r6[r8] = r4
            int r8 = r8 + 1
            r4 = 67
            r5 = 1
            goto L_0x007c
        L_0x010e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0116
            throw r1
        L_0x0116:
            throw r0
        L_0x0117:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011f
            throw r1
        L_0x011f:
            throw r0
        L_0x0120:
            r5 = 68
            r9 = 6
        L_0x0123:
            int r13 = r7 + 1
            r14 = 3
            r15 = 2
            r8 = 18
            r4 = 19
            r0 = r6[r7]     // Catch:{ all -> 0x024f }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x024f }
            r7 = 11
            r3 = 15
            r11 = 10
            switch(r0) {
                case -21: goto L_0x0247;
                case -20: goto L_0x0245;
                case -19: goto L_0x0234;
                case -18: goto L_0x0226;
                case -17: goto L_0x0220;
                case -16: goto L_0x021e;
                case -15: goto L_0x021b;
                case -14: goto L_0x020f;
                case -13: goto L_0x0200;
                case -12: goto L_0x01f7;
                case -11: goto L_0x01e4;
                case -10: goto L_0x01dc;
                case -9: goto L_0x01d8;
                case -8: goto L_0x01d0;
                case -7: goto L_0x017d;
                case -6: goto L_0x0179;
                case -5: goto L_0x0175;
                case -4: goto L_0x015b;
                case -3: goto L_0x0156;
                case -2: goto L_0x0141;
                case -1: goto L_0x013d;
                default: goto L_0x013a;
            }
        L_0x013a:
            r3 = 1
            goto L_0x024b
        L_0x013d:
            r7 = 13
            goto L_0x024c
        L_0x0141:
            r3 = 1
            r1.getMax = r3     // Catch:{ all -> 0x0243 }
            r1.getMax(r11)     // Catch:{ all -> 0x024f }
            r1.getMax(r8)     // Catch:{ all -> 0x024f }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x024f }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x024f }
            o.access$2300 r0 = r0.securityEntityDataFactory     // Catch:{ all -> 0x024f }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x024f }
        L_0x0152:
            r1.getMax(r4)     // Catch:{ all -> 0x024f }
            goto L_0x013a
        L_0x0156:
            java.lang.String r0 = "network"
            r1.IsOverlapping = r0     // Catch:{ all -> 0x024f }
            goto L_0x0152
        L_0x015b:
            r1.getMax = r15     // Catch:{ all -> 0x024f }
            r1.getMax(r11)     // Catch:{ all -> 0x024f }
            r1.getMax(r8)     // Catch:{ all -> 0x024f }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x024f }
            o.access$2300 r0 = (o.access$2300) r0     // Catch:{ all -> 0x024f }
            r1.getMax(r8)     // Catch:{ all -> 0x024f }
            java.lang.Object r3 = r1.toIntRange     // Catch:{ all -> 0x024f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x024f }
            o.access$2400 r0 = r0.createData((java.lang.String) r3)     // Catch:{ all -> 0x024f }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x024f }
            goto L_0x0152
        L_0x0175:
            r7 = 48
            goto L_0x024c
        L_0x0179:
            r7 = 22
            goto L_0x024c
        L_0x017d:
            r3 = 1
            r1.getMax = r3     // Catch:{ all -> 0x0243 }
            r1.getMax(r11)     // Catch:{ all -> 0x024f }
            r1.getMax(r8)     // Catch:{ all -> 0x024f }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x024f }
            r3 = 43
            short r3 = (short) r3
            int r7 = setMin     // Catch:{ all -> 0x01c7 }
            r7 = r7 | 266(0x10a, float:3.73E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x01c7 }
            byte[] r11 = setMax     // Catch:{ all -> 0x01c7 }
            byte r11 = r11[r10]     // Catch:{ all -> 0x01c7 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x01c7 }
            java.lang.String r3 = setMin(r3, r7, r11)     // Catch:{ all -> 0x01c7 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x01c7 }
            r7 = 1844(0x734, float:2.584E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x01c7 }
            int r11 = setMin     // Catch:{ all -> 0x01c7 }
            r11 = r11 | 274(0x112, float:3.84E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x01c7 }
            byte[] r19 = setMax     // Catch:{ all -> 0x01c7 }
            r20 = 2093(0x82d, float:2.933E-42)
            byte r4 = r19[r20]     // Catch:{ all -> 0x01c7 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x01c7 }
            java.lang.String r4 = setMin(r7, r11, r4)     // Catch:{ all -> 0x01c7 }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r12)     // Catch:{ all -> 0x01c7 }
            java.lang.Object r0 = r3.invoke(r0, r12)     // Catch:{ all -> 0x01c7 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01c7 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x01c7 }
            r1.getMax = r0     // Catch:{ all -> 0x024f }
            r3 = 1
            r1.getMax(r3)     // Catch:{ all -> 0x0243 }
            goto L_0x013a
        L_0x01c7:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch:{ all -> 0x024f }
            if (r3 == 0) goto L_0x01cf
            throw r3     // Catch:{ all -> 0x024f }
        L_0x01cf:
            throw r0     // Catch:{ all -> 0x024f }
        L_0x01d0:
            r1.getMax(r3)     // Catch:{ all -> 0x024f }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x024f }
            o.access$2400 r0 = (o.access$2400) r0     // Catch:{ all -> 0x024f }
            return r0
        L_0x01d8:
            r7 = 23
            goto L_0x024c
        L_0x01dc:
            r1.getMax(r3)     // Catch:{ all -> 0x024f }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x024f }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x024f }
            throw r0     // Catch:{ all -> 0x024f }
        L_0x01e4:
            r0 = 34
            r1.getMax(r0)     // Catch:{ all -> 0x024f }
            int r0 = r1.length     // Catch:{ all -> 0x024f }
            if (r0 == 0) goto L_0x01f2
            r0 = 8
            r7 = 8
            goto L_0x024c
        L_0x01f2:
            r0 = 20
            r7 = 20
            goto L_0x024c
        L_0x01f7:
            int r0 = length     // Catch:{ all -> 0x024f }
            r1.getMax = r0     // Catch:{ all -> 0x024f }
            r3 = 1
        L_0x01fc:
            r1.getMax(r3)     // Catch:{ all -> 0x0243 }
            goto L_0x024b
        L_0x0200:
            r3 = 1
            r1.getMax = r3     // Catch:{ all -> 0x0243 }
            r1.getMax(r11)     // Catch:{ all -> 0x024f }
            r1.getMax(r7)     // Catch:{ all -> 0x024f }
            int r0 = r1.length     // Catch:{ all -> 0x024f }
            getMin = r0     // Catch:{ all -> 0x024f }
            goto L_0x013a
        L_0x020f:
            r1.getMax(r5)     // Catch:{ all -> 0x024f }
            int r0 = r1.length     // Catch:{ all -> 0x024f }
            if (r0 != 0) goto L_0x024b
            r0 = 47
            r7 = 47
            goto L_0x024c
        L_0x021b:
            r7 = 68
            goto L_0x024c
        L_0x021e:
            r7 = 1
            goto L_0x024c
        L_0x0220:
            int r0 = getMin     // Catch:{ all -> 0x024f }
            r1.getMax = r0     // Catch:{ all -> 0x024f }
            r3 = 1
            goto L_0x01fc
        L_0x0226:
            r3 = 1
            r1.getMax = r3     // Catch:{ all -> 0x0243 }
            r1.getMax(r11)     // Catch:{ all -> 0x0243 }
            r1.getMax(r7)     // Catch:{ all -> 0x0243 }
            int r0 = r1.length     // Catch:{ all -> 0x0243 }
            length = r0     // Catch:{ all -> 0x0243 }
            goto L_0x024b
        L_0x0234:
            r3 = 1
            r0 = 12
            r1.getMax(r0)     // Catch:{ all -> 0x0243 }
            int r0 = r1.length     // Catch:{ all -> 0x0243 }
            if (r0 != 0) goto L_0x024b
            r0 = 66
            r7 = 66
            goto L_0x024c
        L_0x0243:
            r0 = move-exception
            goto L_0x0251
        L_0x0245:
            r7 = 6
            goto L_0x024c
        L_0x0247:
            r3 = 1
            r7 = 16
            goto L_0x024c
        L_0x024b:
            r7 = r13
        L_0x024c:
            r11 = 4
            goto L_0x0123
        L_0x024f:
            r0 = move-exception
            r3 = 1
        L_0x0251:
            r4 = 768(0x300, float:1.076E-42)
            short r4 = (short) r4
            r7 = 371(0x173, float:5.2E-43)
            short r7 = (short) r7
            byte[] r11 = setMax
            byte r11 = r11[r10]
            int r11 = -r11
            byte r11 = (byte) r11
            java.lang.String r4 = setMin(r4, r7, r11)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x027a
            if (r13 < r15) goto L_0x027a
            if (r13 > r9) goto L_0x027a
        L_0x026f:
            r4 = 4
        L_0x0270:
            r7 = 13
            r11 = 23
        L_0x0274:
            r14 = 67
        L_0x0276:
            r21 = 19
            goto L_0x036f
        L_0x027a:
            int r4 = setMin
            r7 = r4 | 97
            short r7 = (short) r7
            r4 = r4 | 263(0x107, float:3.69E-43)
            short r4 = (short) r4
            byte[] r11 = setMax
            byte r11 = r11[r10]
            int r11 = -r11
            byte r11 = (byte) r11
            java.lang.String r4 = setMin(r7, r4, r11)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x029b
            if (r13 < r14) goto L_0x029b
            if (r13 > r9) goto L_0x029b
            goto L_0x026f
        L_0x029b:
            int r4 = setMin
            r7 = r4 | 97
            short r7 = (short) r7
            r4 = r4 | 263(0x107, float:3.69E-43)
            short r4 = (short) r4
            byte[] r11 = setMax
            byte r11 = r11[r10]
            int r11 = -r11
            byte r11 = (byte) r11
            java.lang.String r4 = setMin(r7, r4, r11)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02be
            r4 = 4
            if (r13 < r4) goto L_0x02bf
            r7 = 5
            if (r13 > r7) goto L_0x02bf
            goto L_0x0270
        L_0x02be:
            r4 = 4
        L_0x02bf:
            r7 = 9
            if (r13 < r7) goto L_0x02cf
            r7 = 13
            if (r13 > r7) goto L_0x02d1
            r11 = 23
            r14 = 67
            r21 = 67
            goto L_0x036f
        L_0x02cf:
            r7 = 13
        L_0x02d1:
            byte[] r11 = setMax
            r14 = 2117(0x845, float:2.967E-42)
            byte r14 = r11[r14]
            short r14 = (short) r14
            r15 = r14 | 353(0x161, float:4.95E-43)
            short r15 = (short) r15
            byte r11 = r11[r10]
            int r11 = -r11
            byte r11 = (byte) r11
            java.lang.String r11 = setMin(r14, r15, r11)
            java.lang.Class r11 = java.lang.Class.forName(r11)
            boolean r11 = r11.isInstance(r0)
            if (r11 == 0) goto L_0x02f7
            r11 = 23
            if (r13 < r11) goto L_0x02f9
            r14 = 48
            if (r13 > r14) goto L_0x02f9
            goto L_0x0274
        L_0x02f7:
            r11 = 23
        L_0x02f9:
            r14 = 3642(0xe3a, float:5.104E-42)
            short r14 = (short) r14
            r15 = 382(0x17e, float:5.35E-43)
            short r15 = (short) r15
            byte[] r18 = setMax
            byte r3 = r18[r10]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r3 = setMin(r14, r15, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0320
            r3 = 42
            if (r13 < r3) goto L_0x0320
            r3 = 43
            if (r13 > r3) goto L_0x0320
            r14 = 67
        L_0x031d:
            r21 = 18
            goto L_0x036f
        L_0x0320:
            int r3 = setMin
            r3 = r3 | 376(0x178, float:5.27E-43)
            short r3 = (short) r3
            r14 = r3 & 1920(0x780, float:2.69E-42)
            short r14 = (short) r14
            byte[] r15 = setMax
            byte r15 = r15[r10]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r3 = setMin(r3, r14, r15)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0345
            r3 = 48
            r14 = 67
            if (r13 < r3) goto L_0x0349
            if (r13 > r14) goto L_0x0349
            goto L_0x031d
        L_0x0345:
            r3 = 48
            r14 = 67
        L_0x0349:
            int r8 = setMin
            r15 = r8 | 97
            short r15 = (short) r15
            r8 = r8 | 263(0x107, float:3.69E-43)
            short r8 = (short) r8
            byte[] r16 = setMax
            byte r3 = r16[r10]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r3 = setMin(r15, r8, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x037a
            r3 = 62
            if (r13 < r3) goto L_0x037a
            r3 = 63
            if (r13 > r3) goto L_0x037a
            goto L_0x0276
        L_0x036f:
            r1.IsOverlapping = r0
            r0 = 26
            r1.getMax(r0)
            r7 = r21
            goto L_0x024c
        L_0x037a:
            throw r0
        L_0x037b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0383
            throw r1
        L_0x0383:
            goto L_0x0385
        L_0x0384:
            throw r0
        L_0x0385:
            goto L_0x0384
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.createSecurityData():o.access$2400");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r1.getMax(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01d6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r13 = r0.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01dc, code lost:
        if (r13 != null) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01de, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01df, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0201, code lost:
        r0 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0254  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> o.RedDotDrawable<java.lang.Throwable, ? extends o.TitleBarRightButtonView.AnonymousClass1<? extends T>> getKey(o.TitleBarRightButtonView.AnonymousClass1<T> r18) {
        /*
            r17 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r17
            r0 = r18
            r1.<init>(r2, r0)
            int r0 = setMin
            r0 = r0 | 4911(0x132f, float:6.882E-42)
            short r0 = (short) r0
            r3 = r0 & 1364(0x554, float:1.911E-42)
            short r3 = (short) r3
            r4 = 73
            byte r4 = (byte) r4
            java.lang.String r0 = setMin(r0, r3, r4)
            int r3 = setMin
            r3 = r3 | 351(0x15f, float:4.92E-43)
            short r3 = (short) r3
            r4 = r3 & 1977(0x7b9, float:2.77E-42)
            short r4 = (short) r4
            r5 = 74
            byte r5 = (byte) r5
            java.lang.String r3 = setMin(r3, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0264 }
            r6 = 0
            r5[r6] = r3     // Catch:{ all -> 0x0264 }
            r3 = 1282(0x502, float:1.796E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x0264 }
            int r7 = setMin     // Catch:{ all -> 0x0264 }
            r7 = r7 | 266(0x10a, float:3.73E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x0264 }
            byte[] r8 = setMax     // Catch:{ all -> 0x0264 }
            r9 = 22
            byte r8 = r8[r9]     // Catch:{ all -> 0x0264 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x0264 }
            java.lang.String r7 = setMin(r3, r7, r8)     // Catch:{ all -> 0x0264 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0264 }
            r8 = 2363(0x93b, float:3.311E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0264 }
            int r10 = setMin     // Catch:{ all -> 0x0264 }
            r10 = r10 | 277(0x115, float:3.88E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0264 }
            byte[] r11 = setMax     // Catch:{ all -> 0x0264 }
            r12 = 21
            byte r11 = r11[r12]     // Catch:{ all -> 0x0264 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0264 }
            java.lang.String r8 = setMin(r8, r10, r11)     // Catch:{ all -> 0x0264 }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x0264 }
            int r11 = setMin     // Catch:{ all -> 0x0264 }
            r11 = r11 | 266(0x10a, float:3.73E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0264 }
            byte[] r12 = setMax     // Catch:{ all -> 0x0264 }
            byte r12 = r12[r9]     // Catch:{ all -> 0x0264 }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x0264 }
            java.lang.String r11 = setMin(r3, r11, r12)     // Catch:{ all -> 0x0264 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0264 }
            r10[r6] = r11     // Catch:{ all -> 0x0264 }
            java.lang.reflect.Method r7 = r7.getMethod(r8, r10)     // Catch:{ all -> 0x0264 }
            java.lang.Object r0 = r7.invoke(r0, r5)     // Catch:{ all -> 0x0264 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0264 }
            int r5 = r0.length
            int[] r5 = new int[r5]
            r7 = 0
        L_0x007d:
            int r8 = r0.length
            r10 = 4
            r11 = 0
            if (r7 >= r8) goto L_0x011f
            r8 = r0[r7]
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ all -> 0x0116 }
            r12[r6] = r8     // Catch:{ all -> 0x0116 }
            r8 = 3658(0xe4a, float:5.126E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0116 }
            int r13 = setMin     // Catch:{ all -> 0x0116 }
            r13 = r13 | 265(0x109, float:3.71E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0116 }
            byte[] r14 = setMax     // Catch:{ all -> 0x0116 }
            byte r14 = r14[r9]     // Catch:{ all -> 0x0116 }
            int r14 = -r14
            byte r14 = (byte) r14     // Catch:{ all -> 0x0116 }
            java.lang.String r13 = setMin(r8, r13, r14)     // Catch:{ all -> 0x0116 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0116 }
            int r14 = setMin     // Catch:{ all -> 0x0116 }
            r14 = r14 | 602(0x25a, float:8.44E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0116 }
            int r15 = setMin     // Catch:{ all -> 0x0116 }
            r15 = r15 | 275(0x113, float:3.85E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0116 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0116 }
            byte r10 = r16[r10]     // Catch:{ all -> 0x0116 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0116 }
            java.lang.String r10 = setMin(r14, r15, r10)     // Catch:{ all -> 0x0116 }
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x0116 }
            int r15 = setMin     // Catch:{ all -> 0x0116 }
            r15 = r15 | 266(0x10a, float:3.73E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0116 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0116 }
            byte r4 = r16[r9]     // Catch:{ all -> 0x0116 }
            int r4 = -r4
            byte r4 = (byte) r4     // Catch:{ all -> 0x0116 }
            java.lang.String r4 = setMin(r3, r15, r4)     // Catch:{ all -> 0x0116 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0116 }
            r14[r6] = r4     // Catch:{ all -> 0x0116 }
            java.lang.reflect.Method r4 = r13.getMethod(r10, r14)     // Catch:{ all -> 0x0116 }
            java.lang.Object r4 = r4.invoke(r11, r12)     // Catch:{ all -> 0x0116 }
            int r10 = setMin     // Catch:{ all -> 0x010d }
            r10 = r10 | 265(0x109, float:3.71E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x010d }
            byte[] r12 = setMax     // Catch:{ all -> 0x010d }
            byte r12 = r12[r9]     // Catch:{ all -> 0x010d }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x010d }
            java.lang.String r8 = setMin(r8, r10, r12)     // Catch:{ all -> 0x010d }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x010d }
            int r10 = setMin     // Catch:{ all -> 0x010d }
            r10 = r10 | 596(0x254, float:8.35E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x010d }
            int r12 = setMin     // Catch:{ all -> 0x010d }
            r12 = r12 | 274(0x112, float:3.84E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x010d }
            byte[] r13 = setMax     // Catch:{ all -> 0x010d }
            r14 = 5678(0x162e, float:7.957E-42)
            byte r13 = r13[r14]     // Catch:{ all -> 0x010d }
            byte r13 = (byte) r13     // Catch:{ all -> 0x010d }
            java.lang.String r10 = setMin(r10, r12, r13)     // Catch:{ all -> 0x010d }
            java.lang.reflect.Method r8 = r8.getMethod(r10, r11)     // Catch:{ all -> 0x010d }
            java.lang.Object r4 = r8.invoke(r4, r11)     // Catch:{ all -> 0x010d }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x010d }
            int r4 = r4.intValue()     // Catch:{ all -> 0x010d }
            r5[r7] = r4
            int r7 = r7 + 1
            r4 = 1
            goto L_0x007d
        L_0x010d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0115
            throw r1
        L_0x0115:
            throw r0
        L_0x0116:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011e
            throw r1
        L_0x011e:
            throw r0
        L_0x011f:
            r3 = 46
            r4 = 9
        L_0x0123:
            int r7 = r6 + 1
            r8 = 2
            r12 = 10
            r0 = r5[r6]     // Catch:{ all -> 0x020a }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x020a }
            r6 = 34
            r13 = 15
            r14 = 18
            switch(r0) {
                case -14: goto L_0x0203;
                case -13: goto L_0x01e0;
                case -12: goto L_0x0190;
                case -11: goto L_0x018d;
                case -10: goto L_0x018b;
                case -9: goto L_0x0188;
                case -8: goto L_0x017e;
                case -7: goto L_0x016e;
                case -6: goto L_0x0164;
                case -5: goto L_0x0162;
                case -4: goto L_0x015a;
                case -3: goto L_0x0152;
                case -2: goto L_0x013d;
                case -1: goto L_0x013a;
                default: goto L_0x0137;
            }     // Catch:{ all -> 0x020a }
        L_0x0137:
            r6 = 1
            goto L_0x0207
        L_0x013a:
            r6 = 35
            goto L_0x0123
        L_0x013d:
            r1.getMax(r6)     // Catch:{ all -> 0x020a }
            int r0 = r1.length     // Catch:{ all -> 0x020a }
            r6 = 50
            if (r0 == r6) goto L_0x0150
            r6 = 85
            if (r0 == r6) goto L_0x014b
            goto L_0x0150
        L_0x014b:
            r0 = 41
            r6 = 41
            goto L_0x0123
        L_0x0150:
            r6 = 4
            goto L_0x0123
        L_0x0152:
            r1.getMax(r13)     // Catch:{ all -> 0x020a }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x020a }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x020a }
            throw r0     // Catch:{ all -> 0x020a }
        L_0x015a:
            r1.getMax(r13)     // Catch:{ all -> 0x020a }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x020a }
            o.RedDotDrawable r0 = (o.RedDotDrawable) r0     // Catch:{ all -> 0x020a }
            return r0
        L_0x0162:
            r6 = 1
            goto L_0x0123
        L_0x0164:
            int r0 = length     // Catch:{ all -> 0x020a }
            r1.getMax = r0     // Catch:{ all -> 0x020a }
            r6 = 1
        L_0x0169:
            r1.getMax(r6)     // Catch:{ all -> 0x0201 }
            goto L_0x0207
        L_0x016e:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x0201 }
            r1.getMax(r12)     // Catch:{ all -> 0x020a }
            r0 = 11
            r1.getMax(r0)     // Catch:{ all -> 0x020a }
            int r0 = r1.length     // Catch:{ all -> 0x020a }
            getMin = r0     // Catch:{ all -> 0x020a }
            goto L_0x0137
        L_0x017e:
            r0 = 68
            r1.getMax(r0)     // Catch:{ all -> 0x020a }
            int r0 = r1.length     // Catch:{ all -> 0x020a }
            if (r0 != 0) goto L_0x0207
            goto L_0x0123
        L_0x0188:
            r6 = 39
            goto L_0x0123
        L_0x018b:
            r6 = 7
            goto L_0x0123
        L_0x018d:
            r6 = 46
            goto L_0x0123
        L_0x0190:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x0201 }
            r1.getMax(r12)     // Catch:{ all -> 0x020a }
            r1.getMax(r14)     // Catch:{ all -> 0x020a }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x020a }
            r6 = 43
            short r6 = (short) r6
            int r13 = setMin     // Catch:{ all -> 0x01d6 }
            r13 = r13 | 266(0x10a, float:3.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x01d6 }
            byte[] r14 = setMax     // Catch:{ all -> 0x01d6 }
            byte r14 = r14[r9]     // Catch:{ all -> 0x01d6 }
            int r14 = -r14
            byte r14 = (byte) r14     // Catch:{ all -> 0x01d6 }
            java.lang.String r6 = setMin(r6, r13, r14)     // Catch:{ all -> 0x01d6 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x01d6 }
            r13 = 1844(0x734, float:2.584E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x01d6 }
            int r14 = setMin     // Catch:{ all -> 0x01d6 }
            r14 = r14 | 274(0x112, float:3.84E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x01d6 }
            byte[] r15 = setMax     // Catch:{ all -> 0x01d6 }
            r16 = 2093(0x82d, float:2.933E-42)
            byte r15 = r15[r16]     // Catch:{ all -> 0x01d6 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x01d6 }
            java.lang.String r13 = setMin(r13, r14, r15)     // Catch:{ all -> 0x01d6 }
            java.lang.reflect.Method r6 = r6.getMethod(r13, r11)     // Catch:{ all -> 0x01d6 }
            java.lang.Object r0 = r6.invoke(r0, r11)     // Catch:{ all -> 0x01d6 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01d6 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x01d6 }
            r1.getMax = r0     // Catch:{ all -> 0x020a }
            r6 = 1
            goto L_0x0169
        L_0x01d6:
            r0 = move-exception
            r6 = 1
            java.lang.Throwable r13 = r0.getCause()     // Catch:{ all -> 0x0201 }
            if (r13 == 0) goto L_0x01df
            throw r13     // Catch:{ all -> 0x0201 }
        L_0x01df:
            throw r0     // Catch:{ all -> 0x0201 }
        L_0x01e0:
            r6 = 1
            o.findExtensions r0 = new o.findExtensions     // Catch:{ all -> 0x0201 }
            r1.getMax = r8     // Catch:{ all -> 0x0201 }
            r1.getMax(r12)     // Catch:{ all -> 0x0201 }
            r1.getMax(r14)     // Catch:{ all -> 0x0201 }
            java.lang.Object r13 = r1.toIntRange     // Catch:{ all -> 0x0201 }
            o.DefaultExtensionRegistry r13 = (o.DefaultExtensionRegistry) r13     // Catch:{ all -> 0x0201 }
            r1.getMax(r14)     // Catch:{ all -> 0x0201 }
            java.lang.Object r14 = r1.toIntRange     // Catch:{ all -> 0x0201 }
            o.TitleBarRightButtonView$1 r14 = (o.TitleBarRightButtonView.AnonymousClass1) r14     // Catch:{ all -> 0x0201 }
            r0.<init>(r13, r14)     // Catch:{ all -> 0x0201 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x0201 }
            r0 = 19
            r1.getMax(r0)     // Catch:{ all -> 0x0201 }
            goto L_0x0207
        L_0x0201:
            r0 = move-exception
            goto L_0x020c
        L_0x0203:
            r6 = 9
            goto L_0x0123
        L_0x0207:
            r6 = r7
            goto L_0x0123
        L_0x020a:
            r0 = move-exception
            r6 = 1
        L_0x020c:
            int r13 = setMin
            r13 = r13 | 351(0x15f, float:4.92E-43)
            short r13 = (short) r13
            r14 = 376(0x178, float:5.27E-43)
            short r14 = (short) r14
            byte[] r15 = setMax
            byte r15 = r15[r9]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r13 = setMin(r13, r14, r15)
            java.lang.Class r13 = java.lang.Class.forName(r13)
            boolean r13 = r13.isInstance(r0)
            if (r13 == 0) goto L_0x022e
            if (r7 < r4) goto L_0x022e
            if (r7 > r12) goto L_0x022e
            r7 = 3
            goto L_0x025b
        L_0x022e:
            int r12 = setMin
            r12 = r12 | 5438(0x153e, float:7.62E-42)
            short r12 = (short) r12
            r13 = 379(0x17b, float:5.31E-43)
            short r13 = (short) r13
            byte[] r14 = setMax
            byte r14 = r14[r9]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r12 = setMin(r12, r13, r14)
            java.lang.Class r12 = java.lang.Class.forName(r12)
            boolean r12 = r12.isInstance(r0)
            if (r12 == 0) goto L_0x0254
            r12 = 30
            if (r7 < r12) goto L_0x0254
            r12 = 31
            if (r7 > r12) goto L_0x0254
            r7 = 6
            goto L_0x025b
        L_0x0254:
            r12 = 42
            if (r7 < r12) goto L_0x0263
            if (r7 > r3) goto L_0x0263
            r7 = 2
        L_0x025b:
            r1.IsOverlapping = r0
            r0 = 26
            r1.getMax(r0)
            goto L_0x0207
        L_0x0263:
            throw r0
        L_0x0264:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x026c
            throw r1
        L_0x026c:
            goto L_0x026e
        L_0x026d:
            throw r0
        L_0x026e:
            goto L_0x026d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.getKey(o.TitleBarRightButtonView$1):o.RedDotDrawable");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0220, code lost:
        if (r11 <= 26) goto L_0x026a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> o.TitleBarRightButtonView.AnonymousClass1<T> keyedRequest(o.TitleBarRightButtonView.AnonymousClass1<T> r18) {
        /*
            r17 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r17
            r0 = r18
            r1.<init>(r2, r0)
            int r0 = setMin
            r0 = r0 | 79
            short r0 = (short) r0
            r3 = 261(0x105, float:3.66E-43)
            short r3 = (short) r3
            r4 = 73
            byte r4 = (byte) r4
            java.lang.String r0 = setMin(r0, r3, r4)
            int r3 = setMin
            r3 = r3 | 351(0x15f, float:4.92E-43)
            short r3 = (short) r3
            r4 = r3 & 1977(0x7b9, float:2.77E-42)
            short r4 = (short) r4
            r5 = 74
            byte r5 = (byte) r5
            java.lang.String r3 = setMin(r3, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0273 }
            r6 = 0
            r5[r6] = r3     // Catch:{ all -> 0x0273 }
            r3 = 1282(0x502, float:1.796E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x0273 }
            int r7 = setMin     // Catch:{ all -> 0x0273 }
            r7 = r7 | 266(0x10a, float:3.73E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x0273 }
            byte[] r8 = setMax     // Catch:{ all -> 0x0273 }
            r9 = 22
            byte r8 = r8[r9]     // Catch:{ all -> 0x0273 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x0273 }
            java.lang.String r7 = setMin(r3, r7, r8)     // Catch:{ all -> 0x0273 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0273 }
            r8 = 2363(0x93b, float:3.311E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0273 }
            int r10 = setMin     // Catch:{ all -> 0x0273 }
            r10 = r10 | 277(0x115, float:3.88E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0273 }
            byte[] r11 = setMax     // Catch:{ all -> 0x0273 }
            r12 = 21
            byte r11 = r11[r12]     // Catch:{ all -> 0x0273 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0273 }
            java.lang.String r8 = setMin(r8, r10, r11)     // Catch:{ all -> 0x0273 }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x0273 }
            int r11 = setMin     // Catch:{ all -> 0x0273 }
            r11 = r11 | 266(0x10a, float:3.73E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0273 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0273 }
            byte r13 = r13[r9]     // Catch:{ all -> 0x0273 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0273 }
            java.lang.String r11 = setMin(r3, r11, r13)     // Catch:{ all -> 0x0273 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0273 }
            r10[r6] = r11     // Catch:{ all -> 0x0273 }
            java.lang.reflect.Method r7 = r7.getMethod(r8, r10)     // Catch:{ all -> 0x0273 }
            java.lang.Object r0 = r7.invoke(r0, r5)     // Catch:{ all -> 0x0273 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0273 }
            int r5 = r0.length
            int[] r5 = new int[r5]
            r7 = 0
        L_0x007d:
            int r8 = r0.length
            if (r7 >= r8) goto L_0x0121
            r8 = r0[r7]
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0118 }
            r10[r6] = r8     // Catch:{ all -> 0x0118 }
            r8 = 3658(0xe4a, float:5.126E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0118 }
            int r11 = setMin     // Catch:{ all -> 0x0118 }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0118 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0118 }
            byte r13 = r13[r9]     // Catch:{ all -> 0x0118 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0118 }
            java.lang.String r11 = setMin(r8, r11, r13)     // Catch:{ all -> 0x0118 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0118 }
            int r13 = setMin     // Catch:{ all -> 0x0118 }
            r13 = r13 | 602(0x25a, float:8.44E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0118 }
            int r14 = setMin     // Catch:{ all -> 0x0118 }
            r14 = r14 | 275(0x113, float:3.85E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0118 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0118 }
            r16 = 4
            byte r15 = r15[r16]     // Catch:{ all -> 0x0118 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0118 }
            java.lang.String r13 = setMin(r13, r14, r15)     // Catch:{ all -> 0x0118 }
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x0118 }
            int r15 = setMin     // Catch:{ all -> 0x0118 }
            r15 = r15 | 266(0x10a, float:3.73E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0118 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0118 }
            byte r12 = r16[r9]     // Catch:{ all -> 0x0118 }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x0118 }
            java.lang.String r12 = setMin(r3, r15, r12)     // Catch:{ all -> 0x0118 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0118 }
            r14[r6] = r12     // Catch:{ all -> 0x0118 }
            java.lang.reflect.Method r11 = r11.getMethod(r13, r14)     // Catch:{ all -> 0x0118 }
            r12 = 0
            java.lang.Object r10 = r11.invoke(r12, r10)     // Catch:{ all -> 0x0118 }
            int r11 = setMin     // Catch:{ all -> 0x010f }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010f }
            byte[] r13 = setMax     // Catch:{ all -> 0x010f }
            byte r13 = r13[r9]     // Catch:{ all -> 0x010f }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x010f }
            java.lang.String r8 = setMin(r8, r11, r13)     // Catch:{ all -> 0x010f }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x010f }
            int r11 = setMin     // Catch:{ all -> 0x010f }
            r11 = r11 | 596(0x254, float:8.35E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010f }
            int r13 = setMin     // Catch:{ all -> 0x010f }
            r13 = r13 | 274(0x112, float:3.84E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x010f }
            byte[] r14 = setMax     // Catch:{ all -> 0x010f }
            r15 = 5678(0x162e, float:7.957E-42)
            byte r14 = r14[r15]     // Catch:{ all -> 0x010f }
            byte r14 = (byte) r14     // Catch:{ all -> 0x010f }
            java.lang.String r11 = setMin(r11, r13, r14)     // Catch:{ all -> 0x010f }
            java.lang.reflect.Method r8 = r8.getMethod(r11, r12)     // Catch:{ all -> 0x010f }
            java.lang.Object r8 = r8.invoke(r10, r12)     // Catch:{ all -> 0x010f }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x010f }
            int r8 = r8.intValue()     // Catch:{ all -> 0x010f }
            r5[r7] = r8
            int r7 = r7 + 1
            r12 = 21
            goto L_0x007d
        L_0x010f:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0117
            throw r1
        L_0x0117:
            throw r0
        L_0x0118:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0120
            throw r1
        L_0x0120:
            throw r0
        L_0x0121:
            r3 = 11
            r7 = 29
            r8 = 15
            r10 = 26
        L_0x0129:
            int r11 = r6 + 1
            r0 = r5[r6]     // Catch:{ all -> 0x01cf }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x01cf }
            r6 = 19
            r12 = 10
            r13 = 2
            r14 = 18
            switch(r0) {
                case -14: goto L_0x01c8;
                case -13: goto L_0x01c4;
                case -12: goto L_0x01b5;
                case -11: goto L_0x01a8;
                case -10: goto L_0x01a0;
                case -9: goto L_0x0190;
                case -8: goto L_0x018d;
                case -7: goto L_0x0185;
                case -6: goto L_0x0182;
                case -5: goto L_0x017f;
                case -4: goto L_0x0165;
                case -3: goto L_0x0147;
                case -2: goto L_0x013f;
                case -1: goto L_0x013d;
                default: goto L_0x013b;
            }     // Catch:{ all -> 0x01cf }
        L_0x013b:
            goto L_0x01cc
        L_0x013d:
            r6 = 7
            goto L_0x0129
        L_0x013f:
            r1.getMax(r8)     // Catch:{ all -> 0x01cf }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01cf }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01cf }
            throw r0     // Catch:{ all -> 0x01cf }
        L_0x0147:
            r1.getMax = r13     // Catch:{ all -> 0x01cf }
            r1.getMax(r12)     // Catch:{ all -> 0x01cf }
            r1.getMax(r14)     // Catch:{ all -> 0x01cf }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01cf }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x01cf }
            r1.getMax(r14)     // Catch:{ all -> 0x01cf }
            java.lang.Object r12 = r1.toIntRange     // Catch:{ all -> 0x01cf }
            o.TitleBarRightButtonView$1 r12 = (o.TitleBarRightButtonView.AnonymousClass1) r12     // Catch:{ all -> 0x01cf }
            o.RedDotDrawable r0 = r0.getKey(r12)     // Catch:{ all -> 0x01cf }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x01cf }
        L_0x0160:
            r1.getMax(r6)     // Catch:{ all -> 0x01cf }
            goto L_0x01cc
        L_0x0165:
            r1.getMax = r13     // Catch:{ all -> 0x01cf }
            r1.getMax(r12)     // Catch:{ all -> 0x01cf }
            r1.getMax(r14)     // Catch:{ all -> 0x01cf }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01cf }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x01cf }
            r1.getMax(r14)     // Catch:{ all -> 0x01cf }
            java.lang.Object r12 = r1.toIntRange     // Catch:{ all -> 0x01cf }
            o.RedDotDrawable r12 = (o.RedDotDrawable) r12     // Catch:{ all -> 0x01cf }
            o.TitleBarRightButtonView$1 r0 = r0.onErrorResumeNext(r12)     // Catch:{ all -> 0x01cf }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x01cf }
            goto L_0x0160
        L_0x017f:
            r6 = 11
            goto L_0x0129
        L_0x0182:
            r6 = 29
            goto L_0x0129
        L_0x0185:
            r1.getMax(r8)     // Catch:{ all -> 0x01cf }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01cf }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x01cf }
            return r0
        L_0x018d:
            r6 = 28
            goto L_0x0129
        L_0x0190:
            r0 = 34
            r1.getMax(r0)     // Catch:{ all -> 0x01cf }
            int r0 = r1.length     // Catch:{ all -> 0x01cf }
            r6 = 17
            if (r0 == 0) goto L_0x0129
            if (r0 == r4) goto L_0x019e
            goto L_0x0129
        L_0x019e:
            r6 = 2
            goto L_0x0129
        L_0x01a0:
            int r0 = getMin     // Catch:{ all -> 0x01cf }
            r1.getMax = r0     // Catch:{ all -> 0x01cf }
            r1.getMax(r4)     // Catch:{ all -> 0x01cf }
            goto L_0x01cc
        L_0x01a8:
            r1.getMax = r4     // Catch:{ all -> 0x01cf }
            r1.getMax(r12)     // Catch:{ all -> 0x01cf }
            r1.getMax(r3)     // Catch:{ all -> 0x01cf }
            int r0 = r1.length     // Catch:{ all -> 0x01cf }
            length = r0     // Catch:{ all -> 0x01cf }
            goto L_0x01cc
        L_0x01b5:
            r0 = 12
            r1.getMax(r0)     // Catch:{ all -> 0x01cf }
            int r0 = r1.length     // Catch:{ all -> 0x01cf }
            if (r0 != 0) goto L_0x01cc
            r0 = 48
            r6 = 48
            goto L_0x0129
        L_0x01c4:
            r6 = 26
            goto L_0x0129
        L_0x01c8:
            r6 = 15
            goto L_0x0129
        L_0x01cc:
            r6 = r11
            goto L_0x0129
        L_0x01cf:
            r0 = move-exception
            r6 = 3642(0xe3a, float:5.104E-42)
            short r6 = (short) r6
            r12 = 382(0x17e, float:5.35E-43)
            short r12 = (short) r12
            byte[] r13 = setMax
            byte r13 = r13[r9]
            int r13 = -r13
            byte r13 = (byte) r13
            java.lang.String r6 = setMin(r6, r12, r13)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            r12 = 13
            if (r6 == 0) goto L_0x01fa
            r6 = 5
            if (r11 < r6) goto L_0x01fa
            r6 = 6
            if (r11 > r6) goto L_0x01fa
            r6 = 14
            r6 = 21
            r12 = 14
            goto L_0x026a
        L_0x01fa:
            if (r11 < r9) goto L_0x0202
            if (r11 > r10) goto L_0x0202
            r6 = 21
            r12 = 1
            goto L_0x026a
        L_0x0202:
            r6 = 768(0x300, float:1.076E-42)
            short r6 = (short) r6
            r13 = 371(0x173, float:5.2E-43)
            short r13 = (short) r13
            byte[] r14 = setMax
            byte r14 = r14[r9]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r6 = setMin(r6, r13, r14)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0223
            r6 = 21
            if (r11 < r6) goto L_0x0225
            if (r11 > r10) goto L_0x0225
            goto L_0x026a
        L_0x0223:
            r6 = 21
        L_0x0225:
            int r13 = setMin
            r13 = r13 | 351(0x15f, float:4.92E-43)
            short r13 = (short) r13
            r14 = 376(0x178, float:5.27E-43)
            short r14 = (short) r14
            byte[] r15 = setMax
            byte r15 = r15[r9]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r13 = setMin(r13, r14, r15)
            java.lang.Class r13 = java.lang.Class.forName(r13)
            boolean r13 = r13.isInstance(r0)
            if (r13 == 0) goto L_0x0248
            if (r11 < r7) goto L_0x0248
            r13 = 49
            if (r11 > r13) goto L_0x0248
            goto L_0x026a
        L_0x0248:
            r13 = 3615(0xe1f, float:5.066E-42)
            short r13 = (short) r13
            r14 = 380(0x17c, float:5.32E-43)
            short r14 = (short) r14
            byte[] r15 = setMax
            byte r15 = r15[r9]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r13 = setMin(r13, r14, r15)
            java.lang.Class r13 = java.lang.Class.forName(r13)
            boolean r13 = r13.isInstance(r0)
            if (r13 == 0) goto L_0x0272
            r13 = 43
            if (r11 < r13) goto L_0x0272
            r13 = 44
            if (r11 > r13) goto L_0x0272
        L_0x026a:
            r1.IsOverlapping = r0
            r1.getMax(r10)
            r6 = r12
            goto L_0x0129
        L_0x0272:
            throw r0
        L_0x0273:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x027b
            throw r1
        L_0x027b:
            goto L_0x027d
        L_0x027c:
            throw r0
        L_0x027d:
            goto L_0x027c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.keyedRequest(o.TitleBarRightButtonView$1):o.TitleBarRightButtonView$1");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ o.TitleBarRightButtonView.AnonymousClass4 lambda$getKey$2(o.TitleBarRightButtonView.AnonymousClass1 r17, java.lang.String r18) throws java.lang.Exception {
        /*
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r0 = r17
            r2 = r18
            r1.<init>(r0, r2)
            r0 = 1068(0x42c, float:1.497E-42)
            short r0 = (short) r0
            r2 = 276(0x114, float:3.87E-43)
            short r2 = (short) r2
            r3 = 73
            byte r3 = (byte) r3
            java.lang.String r0 = setMin(r0, r2, r3)
            int r2 = setMin
            r2 = r2 | 351(0x15f, float:4.92E-43)
            short r2 = (short) r2
            r3 = r2 & 1977(0x7b9, float:2.77E-42)
            short r3 = (short) r3
            r4 = 74
            byte r4 = (byte) r4
            java.lang.String r2 = setMin(r2, r3, r4)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x021f }
            r5 = 0
            r4[r5] = r2     // Catch:{ all -> 0x021f }
            r2 = 1282(0x502, float:1.796E-42)
            short r2 = (short) r2     // Catch:{ all -> 0x021f }
            int r6 = setMin     // Catch:{ all -> 0x021f }
            r6 = r6 | 266(0x10a, float:3.73E-43)
            short r6 = (short) r6     // Catch:{ all -> 0x021f }
            byte[] r7 = setMax     // Catch:{ all -> 0x021f }
            r8 = 22
            byte r7 = r7[r8]     // Catch:{ all -> 0x021f }
            int r7 = -r7
            byte r7 = (byte) r7     // Catch:{ all -> 0x021f }
            java.lang.String r6 = setMin(r2, r6, r7)     // Catch:{ all -> 0x021f }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x021f }
            r7 = 2363(0x93b, float:3.311E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x021f }
            int r9 = setMin     // Catch:{ all -> 0x021f }
            r9 = r9 | 277(0x115, float:3.88E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x021f }
            byte[] r10 = setMax     // Catch:{ all -> 0x021f }
            r11 = 21
            byte r10 = r10[r11]     // Catch:{ all -> 0x021f }
            byte r10 = (byte) r10     // Catch:{ all -> 0x021f }
            java.lang.String r7 = setMin(r7, r9, r10)     // Catch:{ all -> 0x021f }
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x021f }
            int r10 = setMin     // Catch:{ all -> 0x021f }
            r10 = r10 | 266(0x10a, float:3.73E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x021f }
            byte[] r12 = setMax     // Catch:{ all -> 0x021f }
            byte r12 = r12[r8]     // Catch:{ all -> 0x021f }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x021f }
            java.lang.String r10 = setMin(r2, r10, r12)     // Catch:{ all -> 0x021f }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x021f }
            r9[r5] = r10     // Catch:{ all -> 0x021f }
            java.lang.reflect.Method r6 = r6.getMethod(r7, r9)     // Catch:{ all -> 0x021f }
            java.lang.Object r0 = r6.invoke(r0, r4)     // Catch:{ all -> 0x021f }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x021f }
            int r4 = r0.length
            int[] r4 = new int[r4]
            r6 = 0
        L_0x007b:
            int r7 = r0.length
            r9 = 4
            if (r6 >= r7) goto L_0x011c
            r7 = r0[r6]
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ all -> 0x0113 }
            r10[r5] = r7     // Catch:{ all -> 0x0113 }
            r7 = 3658(0xe4a, float:5.126E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0113 }
            int r12 = setMin     // Catch:{ all -> 0x0113 }
            r12 = r12 | 265(0x109, float:3.71E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0113 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0113 }
            byte r13 = r13[r8]     // Catch:{ all -> 0x0113 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0113 }
            java.lang.String r12 = setMin(r7, r12, r13)     // Catch:{ all -> 0x0113 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0113 }
            int r13 = setMin     // Catch:{ all -> 0x0113 }
            r13 = r13 | 602(0x25a, float:8.44E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0113 }
            int r14 = setMin     // Catch:{ all -> 0x0113 }
            r14 = r14 | 275(0x113, float:3.85E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0113 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0113 }
            byte r9 = r15[r9]     // Catch:{ all -> 0x0113 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0113 }
            java.lang.String r9 = setMin(r13, r14, r9)     // Catch:{ all -> 0x0113 }
            java.lang.Class[] r13 = new java.lang.Class[r3]     // Catch:{ all -> 0x0113 }
            int r14 = setMin     // Catch:{ all -> 0x0113 }
            r14 = r14 | 266(0x10a, float:3.73E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0113 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0113 }
            byte r15 = r15[r8]     // Catch:{ all -> 0x0113 }
            int r15 = -r15
            byte r15 = (byte) r15     // Catch:{ all -> 0x0113 }
            java.lang.String r14 = setMin(r2, r14, r15)     // Catch:{ all -> 0x0113 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0113 }
            r13[r5] = r14     // Catch:{ all -> 0x0113 }
            java.lang.reflect.Method r9 = r12.getMethod(r9, r13)     // Catch:{ all -> 0x0113 }
            r12 = 0
            java.lang.Object r9 = r9.invoke(r12, r10)     // Catch:{ all -> 0x0113 }
            int r10 = setMin     // Catch:{ all -> 0x010a }
            r10 = r10 | 265(0x109, float:3.71E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x010a }
            byte[] r13 = setMax     // Catch:{ all -> 0x010a }
            byte r13 = r13[r8]     // Catch:{ all -> 0x010a }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x010a }
            java.lang.String r7 = setMin(r7, r10, r13)     // Catch:{ all -> 0x010a }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x010a }
            int r10 = setMin     // Catch:{ all -> 0x010a }
            r10 = r10 | 596(0x254, float:8.35E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x010a }
            int r13 = setMin     // Catch:{ all -> 0x010a }
            r13 = r13 | 274(0x112, float:3.84E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x010a }
            byte[] r14 = setMax     // Catch:{ all -> 0x010a }
            r15 = 5678(0x162e, float:7.957E-42)
            byte r14 = r14[r15]     // Catch:{ all -> 0x010a }
            byte r14 = (byte) r14     // Catch:{ all -> 0x010a }
            java.lang.String r10 = setMin(r10, r13, r14)     // Catch:{ all -> 0x010a }
            java.lang.reflect.Method r7 = r7.getMethod(r10, r12)     // Catch:{ all -> 0x010a }
            java.lang.Object r7 = r7.invoke(r9, r12)     // Catch:{ all -> 0x010a }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x010a }
            int r7 = r7.intValue()     // Catch:{ all -> 0x010a }
            r4[r6] = r7
            int r6 = r6 + 1
            goto L_0x007b
        L_0x010a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0112
            throw r1
        L_0x0112:
            throw r0
        L_0x0113:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011b
            throw r1
        L_0x011b:
            throw r0
        L_0x011c:
            r2 = 24
            r6 = 3
            r7 = 41
        L_0x0121:
            int r10 = r5 + 1
            r12 = 12
            r0 = r4[r5]     // Catch:{ all -> 0x0187 }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x0187 }
            r5 = 15
            switch(r0) {
                case -13: goto L_0x0182;
                case -12: goto L_0x0176;
                case -11: goto L_0x0173;
                case -10: goto L_0x0171;
                case -9: goto L_0x0169;
                case -8: goto L_0x0161;
                case -7: goto L_0x015e;
                case -6: goto L_0x015b;
                case -5: goto L_0x014f;
                case -4: goto L_0x013e;
                case -3: goto L_0x0136;
                case -2: goto L_0x0134;
                case -1: goto L_0x0131;
                default: goto L_0x0130;
            }     // Catch:{ all -> 0x0187 }
        L_0x0130:
            goto L_0x0185
        L_0x0131:
            r5 = 21
            goto L_0x0121
        L_0x0134:
            r5 = 3
            goto L_0x0121
        L_0x0136:
            int r0 = getMin     // Catch:{ all -> 0x0187 }
            r1.getMax = r0     // Catch:{ all -> 0x0187 }
            r1.getMax(r3)     // Catch:{ all -> 0x0187 }
            goto L_0x0185
        L_0x013e:
            r1.getMax = r3     // Catch:{ all -> 0x0187 }
            r0 = 10
            r1.getMax(r0)     // Catch:{ all -> 0x0187 }
            r0 = 11
            r1.getMax(r0)     // Catch:{ all -> 0x0187 }
            int r0 = r1.length     // Catch:{ all -> 0x0187 }
            length = r0     // Catch:{ all -> 0x0187 }
            goto L_0x0185
        L_0x014f:
            r1.getMax(r12)     // Catch:{ all -> 0x0187 }
            int r0 = r1.length     // Catch:{ all -> 0x0187 }
            if (r0 != 0) goto L_0x0185
            r0 = 16
            r5 = 16
            goto L_0x0121
        L_0x015b:
            r5 = 41
            goto L_0x0121
        L_0x015e:
            r5 = 17
            goto L_0x0121
        L_0x0161:
            r1.getMax(r5)     // Catch:{ all -> 0x0187 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0187 }
            o.TitleBarRightButtonView$4 r0 = (o.TitleBarRightButtonView.AnonymousClass4) r0     // Catch:{ all -> 0x0187 }
            return r0
        L_0x0169:
            r1.getMax(r5)     // Catch:{ all -> 0x0187 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0187 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0187 }
            throw r0     // Catch:{ all -> 0x0187 }
        L_0x0171:
            r5 = 1
            goto L_0x0121
        L_0x0173:
            r5 = 24
            goto L_0x0121
        L_0x0176:
            r1.getMax(r12)     // Catch:{ all -> 0x0187 }
            int r0 = r1.length     // Catch:{ all -> 0x0187 }
            if (r0 != 0) goto L_0x0185
            r0 = 40
            r5 = 40
            goto L_0x0121
        L_0x0182:
            r5 = 20
            goto L_0x0121
        L_0x0185:
            r5 = r10
            goto L_0x0121
        L_0x0187:
            r0 = move-exception
            int r5 = setMin
            r5 = r5 | 5194(0x144a, float:7.278E-42)
            short r5 = (short) r5
            r13 = 375(0x177, float:5.25E-43)
            short r13 = (short) r13
            byte[] r14 = setMax
            byte r14 = r14[r8]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r5 = setMin(r5, r13, r14)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            r14 = 42
            r15 = 19
            if (r5 == 0) goto L_0x01af
            if (r10 < r6) goto L_0x01af
            if (r10 > r9) goto L_0x01af
        L_0x01ac:
            r5 = 19
            goto L_0x0213
        L_0x01af:
            r5 = 3615(0xe1f, float:5.066E-42)
            short r5 = (short) r5
            r3 = 380(0x17c, float:5.32E-43)
            short r3 = (short) r3
            byte[] r16 = setMax
            byte r6 = r16[r8]
            int r6 = -r6
            byte r6 = (byte) r6
            java.lang.String r3 = setMin(r5, r3, r6)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x01d0
            if (r10 < r12) goto L_0x01d0
            r3 = 13
            if (r10 > r3) goto L_0x01d0
            goto L_0x01ac
        L_0x01d0:
            int r3 = setMin
            r3 = r3 | 5194(0x144a, float:7.278E-42)
            short r3 = (short) r3
            byte[] r5 = setMax
            byte r5 = r5[r8]
            int r5 = -r5
            byte r5 = (byte) r5
            java.lang.String r3 = setMin(r3, r13, r5)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x01f0
            if (r10 < r2) goto L_0x01f0
            if (r10 > r7) goto L_0x01f0
        L_0x01ed:
            r5 = 42
            goto L_0x0213
        L_0x01f0:
            byte[] r3 = setMax
            r5 = 2117(0x845, float:2.967E-42)
            byte r5 = r3[r5]
            short r5 = (short) r5
            r6 = r5 | 353(0x161, float:4.95E-43)
            short r6 = (short) r6
            byte r3 = r3[r8]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r3 = setMin(r5, r6, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x021e
            r3 = 36
            if (r10 < r3) goto L_0x021e
            if (r10 > r7) goto L_0x021e
            goto L_0x01ed
        L_0x0213:
            r1.IsOverlapping = r0
            r0 = 26
            r1.getMax(r0)
            r3 = 1
            r6 = 3
            goto L_0x0121
        L_0x021e:
            throw r0
        L_0x021f:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0227
            throw r1
        L_0x0227:
            goto L_0x0229
        L_0x0228:
            throw r0
        L_0x0229:
            goto L_0x0228
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.lambda$getKey$2(o.TitleBarRightButtonView$1, java.lang.String):o.TitleBarRightButtonView$4");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x030f, code lost:
        if (r12 <= 76) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0159, code lost:
        r1.getMax(19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01d4, code lost:
        r1.getMax(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02c4, code lost:
        if (r12 <= 29) goto L_0x027f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ o.TitleBarRightButtonView.AnonymousClass4 lambda$getKey$3(o.TitleBarRightButtonView.AnonymousClass1 r18, java.lang.String r19) throws java.lang.Exception {
        /*
            r17 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r17
            r0 = r18
            r3 = r19
            r1.<init>(r2, r0, r3)
            int r0 = setMin
            r0 = r0 | 5160(0x1428, float:7.23E-42)
            short r0 = (short) r0
            r3 = r0 & 1008(0x3f0, float:1.413E-42)
            short r3 = (short) r3
            r4 = 73
            byte r4 = (byte) r4
            java.lang.String r0 = setMin(r0, r3, r4)
            int r3 = setMin
            r3 = r3 | 351(0x15f, float:4.92E-43)
            short r3 = (short) r3
            r4 = r3 & 1977(0x7b9, float:2.77E-42)
            short r4 = (short) r4
            r5 = 74
            byte r5 = (byte) r5
            java.lang.String r3 = setMin(r3, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x033f }
            r6 = 0
            r5[r6] = r3     // Catch:{ all -> 0x033f }
            r3 = 1282(0x502, float:1.796E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x033f }
            int r7 = setMin     // Catch:{ all -> 0x033f }
            r7 = r7 | 266(0x10a, float:3.73E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x033f }
            byte[] r8 = setMax     // Catch:{ all -> 0x033f }
            r9 = 22
            byte r8 = r8[r9]     // Catch:{ all -> 0x033f }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x033f }
            java.lang.String r7 = setMin(r3, r7, r8)     // Catch:{ all -> 0x033f }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x033f }
            r8 = 2363(0x93b, float:3.311E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x033f }
            int r10 = setMin     // Catch:{ all -> 0x033f }
            r10 = r10 | 277(0x115, float:3.88E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x033f }
            byte[] r11 = setMax     // Catch:{ all -> 0x033f }
            r12 = 21
            byte r11 = r11[r12]     // Catch:{ all -> 0x033f }
            byte r11 = (byte) r11     // Catch:{ all -> 0x033f }
            java.lang.String r8 = setMin(r8, r10, r11)     // Catch:{ all -> 0x033f }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x033f }
            int r11 = setMin     // Catch:{ all -> 0x033f }
            r11 = r11 | 266(0x10a, float:3.73E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x033f }
            byte[] r12 = setMax     // Catch:{ all -> 0x033f }
            byte r12 = r12[r9]     // Catch:{ all -> 0x033f }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x033f }
            java.lang.String r11 = setMin(r3, r11, r12)     // Catch:{ all -> 0x033f }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x033f }
            r10[r6] = r11     // Catch:{ all -> 0x033f }
            java.lang.reflect.Method r7 = r7.getMethod(r8, r10)     // Catch:{ all -> 0x033f }
            java.lang.Object r0 = r7.invoke(r0, r5)     // Catch:{ all -> 0x033f }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x033f }
            int r5 = r0.length
            int[] r5 = new int[r5]
            r7 = 0
        L_0x007f:
            int r8 = r0.length
            r10 = 4
            if (r7 >= r8) goto L_0x0120
            r8 = r0[r7]
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x0117 }
            r11[r6] = r8     // Catch:{ all -> 0x0117 }
            r8 = 3658(0xe4a, float:5.126E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0117 }
            int r12 = setMin     // Catch:{ all -> 0x0117 }
            r12 = r12 | 265(0x109, float:3.71E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0117 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0117 }
            byte r13 = r13[r9]     // Catch:{ all -> 0x0117 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0117 }
            java.lang.String r12 = setMin(r8, r12, r13)     // Catch:{ all -> 0x0117 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0117 }
            int r13 = setMin     // Catch:{ all -> 0x0117 }
            r13 = r13 | 602(0x25a, float:8.44E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0117 }
            int r14 = setMin     // Catch:{ all -> 0x0117 }
            r14 = r14 | 275(0x113, float:3.85E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0117 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0117 }
            byte r10 = r15[r10]     // Catch:{ all -> 0x0117 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0117 }
            java.lang.String r10 = setMin(r13, r14, r10)     // Catch:{ all -> 0x0117 }
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch:{ all -> 0x0117 }
            int r14 = setMin     // Catch:{ all -> 0x0117 }
            r14 = r14 | 266(0x10a, float:3.73E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0117 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0117 }
            byte r15 = r15[r9]     // Catch:{ all -> 0x0117 }
            int r15 = -r15
            byte r15 = (byte) r15     // Catch:{ all -> 0x0117 }
            java.lang.String r14 = setMin(r3, r14, r15)     // Catch:{ all -> 0x0117 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0117 }
            r13[r6] = r14     // Catch:{ all -> 0x0117 }
            java.lang.reflect.Method r10 = r12.getMethod(r10, r13)     // Catch:{ all -> 0x0117 }
            r12 = 0
            java.lang.Object r10 = r10.invoke(r12, r11)     // Catch:{ all -> 0x0117 }
            int r11 = setMin     // Catch:{ all -> 0x010e }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010e }
            byte[] r13 = setMax     // Catch:{ all -> 0x010e }
            byte r13 = r13[r9]     // Catch:{ all -> 0x010e }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x010e }
            java.lang.String r8 = setMin(r8, r11, r13)     // Catch:{ all -> 0x010e }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x010e }
            int r11 = setMin     // Catch:{ all -> 0x010e }
            r11 = r11 | 596(0x254, float:8.35E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010e }
            int r13 = setMin     // Catch:{ all -> 0x010e }
            r13 = r13 | 274(0x112, float:3.84E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x010e }
            byte[] r14 = setMax     // Catch:{ all -> 0x010e }
            r15 = 5678(0x162e, float:7.957E-42)
            byte r14 = r14[r15]     // Catch:{ all -> 0x010e }
            byte r14 = (byte) r14     // Catch:{ all -> 0x010e }
            java.lang.String r11 = setMin(r11, r13, r14)     // Catch:{ all -> 0x010e }
            java.lang.reflect.Method r8 = r8.getMethod(r11, r12)     // Catch:{ all -> 0x010e }
            java.lang.Object r8 = r8.invoke(r10, r12)     // Catch:{ all -> 0x010e }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x010e }
            int r8 = r8.intValue()     // Catch:{ all -> 0x010e }
            r5[r7] = r8
            int r7 = r7 + 1
            goto L_0x007f
        L_0x010e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0116
            throw r1
        L_0x0116:
            throw r0
        L_0x0117:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011f
            throw r1
        L_0x011f:
            throw r0
        L_0x0120:
            r8 = 3
            r11 = 15
        L_0x0123:
            int r12 = r6 + 1
            r13 = 12
            r14 = 11
            r15 = 19
            r7 = 18
            r0 = r5[r6]     // Catch:{ all -> 0x0220 }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x0220 }
            r6 = 2
            r3 = 10
            switch(r0) {
                case -22: goto L_0x0219;
                case -21: goto L_0x020c;
                case -20: goto L_0x01ff;
                case -19: goto L_0x01fa;
                case -18: goto L_0x01f7;
                case -17: goto L_0x01f4;
                case -16: goto L_0x01e5;
                case -15: goto L_0x01d8;
                case -14: goto L_0x01d0;
                case -13: goto L_0x01cd;
                case -12: goto L_0x01c9;
                case -11: goto L_0x01c5;
                case -10: goto L_0x01b1;
                case -9: goto L_0x0197;
                case -8: goto L_0x0184;
                case -7: goto L_0x017c;
                case -6: goto L_0x0174;
                case -5: goto L_0x0161;
                case -4: goto L_0x015e;
                case -3: goto L_0x0140;
                case -2: goto L_0x013e;
                case -1: goto L_0x013b;
                default: goto L_0x0139;
            }     // Catch:{ all -> 0x0220 }
        L_0x0139:
            goto L_0x021d
        L_0x013b:
            r6 = 22
            goto L_0x0123
        L_0x013e:
            r6 = 5
            goto L_0x0123
        L_0x0140:
            r1.getMax = r6     // Catch:{ all -> 0x0220 }
            r1.getMax(r3)     // Catch:{ all -> 0x0220 }
            r1.getMax(r7)     // Catch:{ all -> 0x0220 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0220 }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x0220 }
            r1.getMax(r7)     // Catch:{ all -> 0x0220 }
            java.lang.Object r3 = r1.toIntRange     // Catch:{ all -> 0x0220 }
            o.RedDotDrawable r3 = (o.RedDotDrawable) r3     // Catch:{ all -> 0x0220 }
            o.TitleBarRightButtonView$1 r0 = r0.concatMap(r3)     // Catch:{ all -> 0x0220 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x0220 }
        L_0x0159:
            r1.getMax(r15)     // Catch:{ all -> 0x0220 }
            goto L_0x021d
        L_0x015e:
            r6 = 28
            goto L_0x0123
        L_0x0161:
            r0 = 34
            r1.getMax(r0)     // Catch:{ all -> 0x0220 }
            int r0 = r1.length     // Catch:{ all -> 0x0220 }
            r3 = 13
            if (r0 == 0) goto L_0x016f
            r6 = 13
            goto L_0x0123
        L_0x016f:
            r0 = 8
            r6 = 8
            goto L_0x0123
        L_0x0174:
            r1.getMax(r11)     // Catch:{ all -> 0x0220 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0220 }
            o.TitleBarRightButtonView$4 r0 = (o.TitleBarRightButtonView.AnonymousClass4) r0     // Catch:{ all -> 0x0220 }
            return r0
        L_0x017c:
            r1.getMax(r11)     // Catch:{ all -> 0x0220 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0220 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0220 }
            throw r0     // Catch:{ all -> 0x0220 }
        L_0x0184:
            r1.getMax = r4     // Catch:{ all -> 0x0220 }
            r1.getMax(r3)     // Catch:{ all -> 0x0220 }
            r1.getMax(r7)     // Catch:{ all -> 0x0220 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0220 }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x0220 }
            o.setDrawDivider r0 = r0.createAccountData()     // Catch:{ all -> 0x0220 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x0220 }
            goto L_0x0159
        L_0x0197:
            r1.getMax = r6     // Catch:{ all -> 0x0220 }
            r1.getMax(r3)     // Catch:{ all -> 0x0220 }
            r1.getMax(r7)     // Catch:{ all -> 0x0220 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0220 }
            o.setDrawDivider r0 = (o.setDrawDivider) r0     // Catch:{ all -> 0x0220 }
            r1.getMax(r7)     // Catch:{ all -> 0x0220 }
            java.lang.Object r3 = r1.toIntRange     // Catch:{ all -> 0x0220 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0220 }
            o.TitleBarRightButtonView$1 r0 = r0.setOfflinePublicKey(r3)     // Catch:{ all -> 0x0220 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x0220 }
            goto L_0x0159
        L_0x01b1:
            o.getActionCount r0 = new o.getActionCount     // Catch:{ all -> 0x0220 }
            r1.getMax = r4     // Catch:{ all -> 0x0220 }
            r1.getMax(r3)     // Catch:{ all -> 0x0220 }
            r1.getMax(r7)     // Catch:{ all -> 0x0220 }
            java.lang.Object r3 = r1.toIntRange     // Catch:{ all -> 0x0220 }
            o.TitleBarRightButtonView$1 r3 = (o.TitleBarRightButtonView.AnonymousClass1) r3     // Catch:{ all -> 0x0220 }
            r0.<init>(r3)     // Catch:{ all -> 0x0220 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x0220 }
            goto L_0x0159
        L_0x01c5:
            r6 = 54
            goto L_0x0123
        L_0x01c9:
            r6 = 15
            goto L_0x0123
        L_0x01cd:
            r6 = 3
            goto L_0x0123
        L_0x01d0:
            int r0 = length     // Catch:{ all -> 0x0220 }
            r1.getMax = r0     // Catch:{ all -> 0x0220 }
        L_0x01d4:
            r1.getMax(r4)     // Catch:{ all -> 0x0220 }
            goto L_0x021d
        L_0x01d8:
            r1.getMax = r4     // Catch:{ all -> 0x0220 }
            r1.getMax(r3)     // Catch:{ all -> 0x0220 }
            r1.getMax(r14)     // Catch:{ all -> 0x0220 }
            int r0 = r1.length     // Catch:{ all -> 0x0220 }
            getMin = r0     // Catch:{ all -> 0x0220 }
            goto L_0x021d
        L_0x01e5:
            r0 = 68
            r1.getMax(r0)     // Catch:{ all -> 0x0220 }
            int r0 = r1.length     // Catch:{ all -> 0x0220 }
            if (r0 != 0) goto L_0x021d
            r0 = 53
            r6 = 53
            goto L_0x0123
        L_0x01f4:
            r6 = 6
            goto L_0x0123
        L_0x01f7:
            r6 = 1
            goto L_0x0123
        L_0x01fa:
            int r0 = getMin     // Catch:{ all -> 0x0220 }
            r1.getMax = r0     // Catch:{ all -> 0x0220 }
            goto L_0x01d4
        L_0x01ff:
            r1.getMax = r4     // Catch:{ all -> 0x0220 }
            r1.getMax(r3)     // Catch:{ all -> 0x0220 }
            r1.getMax(r14)     // Catch:{ all -> 0x0220 }
            int r0 = r1.length     // Catch:{ all -> 0x0220 }
            length = r0     // Catch:{ all -> 0x0220 }
            goto L_0x021d
        L_0x020c:
            r1.getMax(r13)     // Catch:{ all -> 0x0220 }
            int r0 = r1.length     // Catch:{ all -> 0x0220 }
            if (r0 != 0) goto L_0x021d
            r0 = 75
            r6 = 75
            goto L_0x0123
        L_0x0219:
            r6 = 27
            goto L_0x0123
        L_0x021d:
            r6 = r12
            goto L_0x0123
        L_0x0220:
            r0 = move-exception
            byte[] r3 = setMax
            r6 = 2117(0x845, float:2.967E-42)
            byte r4 = r3[r6]
            short r4 = (short) r4
            r11 = r4 | 353(0x161, float:4.95E-43)
            short r11 = (short) r11
            byte r3 = r3[r9]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r3 = setMin(r4, r11, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            r4 = 26
            if (r3 == 0) goto L_0x024b
            if (r12 < r8) goto L_0x024b
            if (r12 > r10) goto L_0x024b
        L_0x0243:
            r3 = 28
        L_0x0245:
            r6 = 54
        L_0x0247:
            r13 = 26
            goto L_0x0335
        L_0x024b:
            r3 = 9
            if (r12 < r3) goto L_0x0259
            if (r12 > r14) goto L_0x0259
            r3 = 28
            r6 = 54
            r13 = 11
            goto L_0x0335
        L_0x0259:
            int r3 = setMin
            r3 = r3 | 5438(0x153e, float:7.62E-42)
            short r3 = (short) r3
            r11 = 379(0x17b, float:5.31E-43)
            short r11 = (short) r11
            byte[] r14 = setMax
            byte r14 = r14[r9]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r3 = setMin(r3, r11, r14)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0283
            r3 = 16
            if (r12 < r3) goto L_0x0283
            r3 = 17
            if (r12 > r3) goto L_0x0283
            r3 = 28
        L_0x027f:
            r6 = 54
            goto L_0x0335
        L_0x0283:
            int r3 = setMin
            r3 = r3 | 376(0x178, float:5.27E-43)
            short r3 = (short) r3
            r14 = r3 & 1920(0x780, float:2.69E-42)
            short r14 = (short) r14
            byte[] r16 = setMax
            byte r8 = r16[r9]
            int r8 = -r8
            byte r8 = (byte) r8
            java.lang.String r3 = setMin(r3, r14, r8)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x02a4
            if (r12 < r7) goto L_0x02a4
            if (r12 > r15) goto L_0x02a4
            goto L_0x0243
        L_0x02a4:
            r3 = 768(0x300, float:1.076E-42)
            short r3 = (short) r3
            r7 = 371(0x173, float:5.2E-43)
            short r7 = (short) r7
            byte[] r8 = setMax
            byte r8 = r8[r9]
            int r8 = -r8
            byte r8 = (byte) r8
            java.lang.String r3 = setMin(r3, r7, r8)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x02c7
            r3 = 28
            if (r12 < r3) goto L_0x02c9
            r7 = 29
            if (r12 > r7) goto L_0x02c9
            goto L_0x027f
        L_0x02c7:
            r3 = 28
        L_0x02c9:
            int r7 = setMin
            r7 = r7 | 5194(0x144a, float:7.278E-42)
            short r7 = (short) r7
            r8 = 375(0x177, float:5.25E-43)
            short r8 = (short) r8
            byte[] r13 = setMax
            byte r13 = r13[r9]
            int r13 = -r13
            byte r13 = (byte) r13
            java.lang.String r7 = setMin(r7, r8, r13)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x02ef
            r7 = 48
            if (r12 < r7) goto L_0x02ef
            r7 = 49
            if (r12 > r7) goto L_0x02ef
            goto L_0x0245
        L_0x02ef:
            byte[] r7 = setMax
            byte r6 = r7[r6]
            short r6 = (short) r6
            r8 = r6 | 353(0x161, float:4.95E-43)
            short r8 = (short) r8
            byte r7 = r7[r9]
            int r7 = -r7
            byte r7 = (byte) r7
            java.lang.String r6 = setMin(r6, r8, r7)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0313
            r6 = 54
            if (r12 < r6) goto L_0x0315
            r7 = 76
            if (r12 > r7) goto L_0x0315
        L_0x0311:
            goto L_0x0247
        L_0x0313:
            r6 = 54
        L_0x0315:
            r7 = 534(0x216, float:7.48E-43)
            short r7 = (short) r7
            byte[] r8 = setMax
            byte r8 = r8[r9]
            int r8 = -r8
            byte r8 = (byte) r8
            java.lang.String r7 = setMin(r7, r11, r8)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x033e
            r7 = 71
            if (r12 < r7) goto L_0x033e
            r7 = 72
            if (r12 > r7) goto L_0x033e
            goto L_0x0311
        L_0x0335:
            r1.IsOverlapping = r0
            r1.getMax(r4)
            r6 = r13
            r4 = 1
            goto L_0x0120
        L_0x033e:
            throw r0
        L_0x033f:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0347
            throw r1
        L_0x0347:
            goto L_0x0349
        L_0x0348:
            throw r0
        L_0x0349:
            goto L_0x0348
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.lambda$getKey$3(o.TitleBarRightButtonView$1, java.lang.String):o.TitleBarRightButtonView$4");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r1.getMax(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0152, code lost:
        if (r0 == 80) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0155, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0157, code lost:
        r6 = 23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x016d, code lost:
        r1.getMax(19);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ o.TitleBarRightButtonView.AnonymousClass1 lambda$getKey$4(o.TitleBarRightButtonView.AnonymousClass1 r19, java.lang.Throwable r20) throws java.lang.Exception {
        /*
            r18 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r18
            r0 = r19
            r3 = r20
            r1.<init>(r2, r0, r3)
            r0 = 3586(0xe02, float:5.025E-42)
            short r0 = (short) r0
            byte[] r3 = setMax
            r4 = 166(0xa6, float:2.33E-43)
            byte r3 = r3[r4]
            r4 = 1
            int r3 = r3 + r4
            short r3 = (short) r3
            r5 = 73
            byte r5 = (byte) r5
            java.lang.String r0 = setMin(r0, r3, r5)
            int r3 = setMin
            r3 = r3 | 351(0x15f, float:4.92E-43)
            short r3 = (short) r3
            r5 = r3 & 1977(0x7b9, float:2.77E-42)
            short r5 = (short) r5
            r6 = 74
            byte r6 = (byte) r6
            java.lang.String r3 = setMin(r3, r5, r6)
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x04d2 }
            r6 = 0
            r5[r6] = r3     // Catch:{ all -> 0x04d2 }
            r3 = 1282(0x502, float:1.796E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x04d2 }
            int r7 = setMin     // Catch:{ all -> 0x04d2 }
            r7 = r7 | 266(0x10a, float:3.73E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x04d2 }
            byte[] r8 = setMax     // Catch:{ all -> 0x04d2 }
            r9 = 22
            byte r8 = r8[r9]     // Catch:{ all -> 0x04d2 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x04d2 }
            java.lang.String r7 = setMin(r3, r7, r8)     // Catch:{ all -> 0x04d2 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x04d2 }
            r8 = 2363(0x93b, float:3.311E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x04d2 }
            int r10 = setMin     // Catch:{ all -> 0x04d2 }
            r10 = r10 | 277(0x115, float:3.88E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x04d2 }
            byte[] r11 = setMax     // Catch:{ all -> 0x04d2 }
            r12 = 21
            byte r11 = r11[r12]     // Catch:{ all -> 0x04d2 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x04d2 }
            java.lang.String r8 = setMin(r8, r10, r11)     // Catch:{ all -> 0x04d2 }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x04d2 }
            int r11 = setMin     // Catch:{ all -> 0x04d2 }
            r11 = r11 | 266(0x10a, float:3.73E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x04d2 }
            byte[] r13 = setMax     // Catch:{ all -> 0x04d2 }
            byte r13 = r13[r9]     // Catch:{ all -> 0x04d2 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x04d2 }
            java.lang.String r11 = setMin(r3, r11, r13)     // Catch:{ all -> 0x04d2 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x04d2 }
            r10[r6] = r11     // Catch:{ all -> 0x04d2 }
            java.lang.reflect.Method r7 = r7.getMethod(r8, r10)     // Catch:{ all -> 0x04d2 }
            java.lang.Object r0 = r7.invoke(r0, r5)     // Catch:{ all -> 0x04d2 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x04d2 }
            int r5 = r0.length
            int[] r5 = new int[r5]
            r7 = 0
        L_0x0082:
            int r8 = r0.length
            r10 = 0
            if (r7 >= r8) goto L_0x0127
            r8 = r0[r7]
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x011e }
            r11[r6] = r8     // Catch:{ all -> 0x011e }
            r8 = 3658(0xe4a, float:5.126E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x011e }
            int r13 = setMin     // Catch:{ all -> 0x011e }
            r13 = r13 | 265(0x109, float:3.71E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x011e }
            byte[] r14 = setMax     // Catch:{ all -> 0x011e }
            byte r14 = r14[r9]     // Catch:{ all -> 0x011e }
            int r14 = -r14
            byte r14 = (byte) r14     // Catch:{ all -> 0x011e }
            java.lang.String r13 = setMin(r8, r13, r14)     // Catch:{ all -> 0x011e }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x011e }
            int r14 = setMin     // Catch:{ all -> 0x011e }
            r14 = r14 | 602(0x25a, float:8.44E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x011e }
            int r15 = setMin     // Catch:{ all -> 0x011e }
            r15 = r15 | 275(0x113, float:3.85E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x011e }
            byte[] r16 = setMax     // Catch:{ all -> 0x011e }
            r17 = 4
            byte r12 = r16[r17]     // Catch:{ all -> 0x011e }
            byte r12 = (byte) r12     // Catch:{ all -> 0x011e }
            java.lang.String r12 = setMin(r14, r15, r12)     // Catch:{ all -> 0x011e }
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x011e }
            int r15 = setMin     // Catch:{ all -> 0x011e }
            r15 = r15 | 266(0x10a, float:3.73E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x011e }
            byte[] r16 = setMax     // Catch:{ all -> 0x011e }
            byte r4 = r16[r9]     // Catch:{ all -> 0x011e }
            int r4 = -r4
            byte r4 = (byte) r4     // Catch:{ all -> 0x011e }
            java.lang.String r4 = setMin(r3, r15, r4)     // Catch:{ all -> 0x011e }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x011e }
            r14[r6] = r4     // Catch:{ all -> 0x011e }
            java.lang.reflect.Method r4 = r13.getMethod(r12, r14)     // Catch:{ all -> 0x011e }
            java.lang.Object r4 = r4.invoke(r10, r11)     // Catch:{ all -> 0x011e }
            int r11 = setMin     // Catch:{ all -> 0x0115 }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0115 }
            byte[] r12 = setMax     // Catch:{ all -> 0x0115 }
            byte r12 = r12[r9]     // Catch:{ all -> 0x0115 }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x0115 }
            java.lang.String r8 = setMin(r8, r11, r12)     // Catch:{ all -> 0x0115 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0115 }
            int r11 = setMin     // Catch:{ all -> 0x0115 }
            r11 = r11 | 596(0x254, float:8.35E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0115 }
            int r12 = setMin     // Catch:{ all -> 0x0115 }
            r12 = r12 | 274(0x112, float:3.84E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0115 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0115 }
            r14 = 5678(0x162e, float:7.957E-42)
            byte r13 = r13[r14]     // Catch:{ all -> 0x0115 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0115 }
            java.lang.String r11 = setMin(r11, r12, r13)     // Catch:{ all -> 0x0115 }
            java.lang.reflect.Method r8 = r8.getMethod(r11, r10)     // Catch:{ all -> 0x0115 }
            java.lang.Object r4 = r8.invoke(r4, r10)     // Catch:{ all -> 0x0115 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0115 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0115 }
            r5[r7] = r4
            int r7 = r7 + 1
            r4 = 1
            r12 = 21
            goto L_0x0082
        L_0x0115:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011d
            throw r1
        L_0x011d:
            throw r0
        L_0x011e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0126
            throw r1
        L_0x0126:
            throw r0
        L_0x0127:
            r3 = 58
            r4 = 80
        L_0x012b:
            int r7 = r6 + 1
            r11 = 34
            r12 = 18
            r0 = r5[r6]     // Catch:{ all -> 0x034c }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x034c }
            r6 = 68
            r14 = 12
            r15 = 19
            r13 = 2
            r8 = 10
            switch(r0) {
                case -40: goto L_0x0339;
                case -39: goto L_0x0335;
                case -38: goto L_0x0331;
                case -37: goto L_0x032d;
                case -36: goto L_0x0320;
                case -35: goto L_0x02cf;
                case -34: goto L_0x02cb;
                case -33: goto L_0x02c7;
                case -32: goto L_0x02ba;
                case -31: goto L_0x028f;
                case -30: goto L_0x028c;
                case -29: goto L_0x0288;
                case -28: goto L_0x0284;
                case -27: goto L_0x0280;
                case -26: goto L_0x0273;
                case -25: goto L_0x026f;
                case -24: goto L_0x026b;
                case -23: goto L_0x0267;
                case -22: goto L_0x025a;
                case -21: goto L_0x0242;
                case -20: goto L_0x023e;
                case -19: goto L_0x0232;
                case -18: goto L_0x022f;
                case -17: goto L_0x0214;
                case -16: goto L_0x01f8;
                case -15: goto L_0x01f4;
                case -14: goto L_0x01d9;
                case -13: goto L_0x01c5;
                case -12: goto L_0x01b1;
                case -11: goto L_0x01a7;
                case -10: goto L_0x01a5;
                case -9: goto L_0x01a2;
                case -8: goto L_0x0198;
                case -7: goto L_0x0188;
                case -6: goto L_0x017e;
                case -5: goto L_0x0174;
                case -4: goto L_0x0171;
                case -3: goto L_0x015a;
                case -2: goto L_0x0149;
                case -1: goto L_0x0146;
                default: goto L_0x0143;
            }     // Catch:{ all -> 0x034c }
        L_0x0143:
            r6 = 1
            goto L_0x0349
        L_0x0146:
            r6 = 55
            goto L_0x012b
        L_0x0149:
            r1.getMax(r11)     // Catch:{ all -> 0x034c }
            int r0 = r1.length     // Catch:{ all -> 0x034c }
            r6 = 59
            if (r0 == r6) goto L_0x0157
            if (r0 == r4) goto L_0x0155
            goto L_0x0157
        L_0x0155:
            r6 = 2
            goto L_0x012b
        L_0x0157:
            r6 = 23
            goto L_0x012b
        L_0x015a:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x031e }
            r1.getMax(r8)     // Catch:{ all -> 0x034c }
            r1.getMax(r12)     // Catch:{ all -> 0x034c }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x034c }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x034c }
            o.TitleBarRightButtonView$1 r0 = o.TitleBarRightButtonView.AnonymousClass1.error((java.lang.Throwable) r0)     // Catch:{ all -> 0x034c }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x034c }
        L_0x016d:
            r1.getMax(r15)     // Catch:{ all -> 0x034c }
            goto L_0x0143
        L_0x0171:
            r6 = 45
            goto L_0x012b
        L_0x0174:
            r0 = 15
            r1.getMax(r0)     // Catch:{ all -> 0x034c }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x034c }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x034c }
            return r0
        L_0x017e:
            int r0 = getMin     // Catch:{ all -> 0x034c }
            r1.getMax = r0     // Catch:{ all -> 0x034c }
            r6 = 1
            r1.getMax(r6)     // Catch:{ all -> 0x031e }
            goto L_0x0349
        L_0x0188:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x031e }
            r1.getMax(r8)     // Catch:{ all -> 0x034c }
            r0 = 11
            r1.getMax(r0)     // Catch:{ all -> 0x034c }
            int r0 = r1.length     // Catch:{ all -> 0x034c }
            length = r0     // Catch:{ all -> 0x034c }
            goto L_0x0143
        L_0x0198:
            r1.getMax(r14)     // Catch:{ all -> 0x034c }
            int r0 = r1.length     // Catch:{ all -> 0x034c }
            if (r0 != 0) goto L_0x0349
            r6 = 21
            goto L_0x012b
        L_0x01a2:
            r6 = 30
            goto L_0x012b
        L_0x01a5:
            r6 = 5
            goto L_0x012b
        L_0x01a7:
            r0 = 15
            r1.getMax(r0)     // Catch:{ all -> 0x034c }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x034c }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x034c }
            throw r0     // Catch:{ all -> 0x034c }
        L_0x01b1:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x031e }
            r1.getMax(r8)     // Catch:{ all -> 0x034c }
            r1.getMax(r12)     // Catch:{ all -> 0x034c }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x034c }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x034c }
            o.access$2400 r0 = r0.createSecurityData()     // Catch:{ all -> 0x034c }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x034c }
            goto L_0x016d
        L_0x01c5:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x031e }
            r1.getMax(r8)     // Catch:{ all -> 0x034c }
            r1.getMax(r12)     // Catch:{ all -> 0x034c }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x034c }
            o.access$2400 r0 = (o.access$2400) r0     // Catch:{ all -> 0x034c }
            o.TitleBarRightButtonView$1 r0 = r0.offlinePayKey()     // Catch:{ all -> 0x034c }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x034c }
            goto L_0x016d
        L_0x01d9:
            r1.getMax = r13     // Catch:{ all -> 0x034c }
            r1.getMax(r8)     // Catch:{ all -> 0x034c }
            r1.getMax(r12)     // Catch:{ all -> 0x034c }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x034c }
            o.setMinProgress r0 = (o.setMinProgress) r0     // Catch:{ all -> 0x034c }
            r1.getMax(r12)     // Catch:{ all -> 0x034c }
            java.lang.Object r6 = r1.toIntRange     // Catch:{ all -> 0x034c }
            o.TitleBarRightButtonView$1 r6 = (o.TitleBarRightButtonView.AnonymousClass1) r6     // Catch:{ all -> 0x034c }
            o.TitleBarRightButtonView$1 r0 = r0.authenticatedRequest(r6)     // Catch:{ all -> 0x034c }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x034c }
            goto L_0x016d
        L_0x01f4:
            r6 = 31
            goto L_0x012b
        L_0x01f8:
            o.ClassLoaderUtils r0 = new o.ClassLoaderUtils     // Catch:{ all -> 0x034c }
            r1.getMax = r13     // Catch:{ all -> 0x034c }
            r1.getMax(r8)     // Catch:{ all -> 0x034c }
            r1.getMax(r12)     // Catch:{ all -> 0x034c }
            java.lang.Object r6 = r1.toIntRange     // Catch:{ all -> 0x034c }
            o.DefaultExtensionRegistry r6 = (o.DefaultExtensionRegistry) r6     // Catch:{ all -> 0x034c }
            r1.getMax(r12)     // Catch:{ all -> 0x034c }
            java.lang.Object r8 = r1.toIntRange     // Catch:{ all -> 0x034c }
            o.TitleBarRightButtonView$1 r8 = (o.TitleBarRightButtonView.AnonymousClass1) r8     // Catch:{ all -> 0x034c }
            r0.<init>(r6, r8)     // Catch:{ all -> 0x034c }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x034c }
            goto L_0x016d
        L_0x0214:
            r1.getMax = r13     // Catch:{ all -> 0x034c }
            r1.getMax(r8)     // Catch:{ all -> 0x034c }
            r1.getMax(r12)     // Catch:{ all -> 0x034c }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x034c }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x034c }
            r1.getMax(r12)     // Catch:{ all -> 0x034c }
            java.lang.Object r6 = r1.toIntRange     // Catch:{ all -> 0x034c }
            o.RedDotDrawable r6 = (o.RedDotDrawable) r6     // Catch:{ all -> 0x034c }
            o.TitleBarRightButtonView$1 r0 = r0.flatMap(r6)     // Catch:{ all -> 0x034c }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x034c }
            goto L_0x016d
        L_0x022f:
            r6 = 7
            goto L_0x012b
        L_0x0232:
            r1.getMax(r11)     // Catch:{ all -> 0x034c }
            int r0 = r1.length     // Catch:{ all -> 0x034c }
            if (r0 == 0) goto L_0x0155
            r6 = 1
            if (r0 == r6) goto L_0x0157
            goto L_0x0155
        L_0x023e:
            r6 = 40
            goto L_0x012b
        L_0x0242:
            r1.getMax(r11)     // Catch:{ all -> 0x034c }
            int r0 = r1.length     // Catch:{ all -> 0x034c }
            r6 = 44
            if (r0 == r6) goto L_0x0256
            r6 = 60
            if (r0 == r6) goto L_0x0250
            goto L_0x0256
        L_0x0250:
            r0 = 41
            r6 = 41
            goto L_0x012b
        L_0x0256:
            r6 = 90
            goto L_0x012b
        L_0x025a:
            r1.getMax(r14)     // Catch:{ all -> 0x034c }
            int r0 = r1.length     // Catch:{ all -> 0x034c }
            if (r0 != 0) goto L_0x0349
            r0 = 54
            r6 = 54
            goto L_0x012b
        L_0x0267:
            r6 = 107(0x6b, float:1.5E-43)
            goto L_0x012b
        L_0x026b:
            r6 = 38
            goto L_0x012b
        L_0x026f:
            r6 = 58
            goto L_0x012b
        L_0x0273:
            r1.getMax(r14)     // Catch:{ all -> 0x034c }
            int r0 = r1.length     // Catch:{ all -> 0x034c }
            if (r0 != 0) goto L_0x0349
            r0 = 79
            r6 = 79
            goto L_0x012b
        L_0x0280:
            r6 = 105(0x69, float:1.47E-43)
            goto L_0x012b
        L_0x0284:
            r6 = 110(0x6e, float:1.54E-43)
            goto L_0x012b
        L_0x0288:
            r6 = 37
            goto L_0x012b
        L_0x028c:
            r6 = 1
            goto L_0x012b
        L_0x028f:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x031e }
            r1.getMax(r8)     // Catch:{ all -> 0x034c }
            r1.getMax(r12)     // Catch:{ all -> 0x034c }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x034c }
            r6 = 3615(0xe1f, float:5.066E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x034c }
            r8 = 380(0x17c, float:5.32E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x034c }
            byte[] r13 = setMax     // Catch:{ all -> 0x034c }
            byte r13 = r13[r9]     // Catch:{ all -> 0x034c }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x034c }
            java.lang.String r6 = setMin(r6, r8, r13)     // Catch:{ all -> 0x034c }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x034c }
            boolean r0 = r6.isInstance(r0)     // Catch:{ all -> 0x034c }
            r1.getMax = r0     // Catch:{ all -> 0x034c }
            r6 = 1
        L_0x02b5:
            r1.getMax(r6)     // Catch:{ all -> 0x031e }
            goto L_0x0143
        L_0x02ba:
            r1.getMax(r6)     // Catch:{ all -> 0x034c }
            int r0 = r1.length     // Catch:{ all -> 0x034c }
            if (r0 != 0) goto L_0x0349
            r0 = 89
            r6 = 89
            goto L_0x012b
        L_0x02c7:
            r6 = 80
            goto L_0x012b
        L_0x02cb:
            r6 = 94
            goto L_0x012b
        L_0x02cf:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x031e }
            r1.getMax(r8)     // Catch:{ all -> 0x034c }
            r1.getMax(r12)     // Catch:{ all -> 0x034c }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x034c }
            r6 = 43
            short r6 = (short) r6
            int r8 = setMin     // Catch:{ all -> 0x0315 }
            r8 = r8 | 266(0x10a, float:3.73E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x0315 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0315 }
            byte r13 = r13[r9]     // Catch:{ all -> 0x0315 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0315 }
            java.lang.String r6 = setMin(r6, r8, r13)     // Catch:{ all -> 0x0315 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x0315 }
            r8 = 1844(0x734, float:2.584E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0315 }
            int r13 = setMin     // Catch:{ all -> 0x0315 }
            r13 = r13 | 274(0x112, float:3.84E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0315 }
            byte[] r14 = setMax     // Catch:{ all -> 0x0315 }
            r15 = 2093(0x82d, float:2.933E-42)
            byte r14 = r14[r15]     // Catch:{ all -> 0x0315 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0315 }
            java.lang.String r8 = setMin(r8, r13, r14)     // Catch:{ all -> 0x0315 }
            java.lang.reflect.Method r6 = r6.getMethod(r8, r10)     // Catch:{ all -> 0x0315 }
            java.lang.Object r0 = r6.invoke(r0, r10)     // Catch:{ all -> 0x0315 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0315 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0315 }
            r1.getMax = r0     // Catch:{ all -> 0x034c }
            r6 = 1
            goto L_0x02b5
        L_0x0315:
            r0 = move-exception
            java.lang.Throwable r6 = r0.getCause()     // Catch:{ all -> 0x034c }
            if (r6 == 0) goto L_0x031d
            throw r6     // Catch:{ all -> 0x034c }
        L_0x031d:
            throw r0     // Catch:{ all -> 0x034c }
        L_0x031e:
            r0 = move-exception
            goto L_0x034e
        L_0x0320:
            r1.getMax(r6)     // Catch:{ all -> 0x034c }
            int r0 = r1.length     // Catch:{ all -> 0x034c }
            if (r0 != 0) goto L_0x0349
            r0 = 103(0x67, float:1.44E-43)
            r6 = 103(0x67, float:1.44E-43)
            goto L_0x012b
        L_0x032d:
            r6 = 92
            goto L_0x012b
        L_0x0331:
            r6 = 82
            goto L_0x012b
        L_0x0335:
            r6 = 109(0x6d, float:1.53E-43)
            goto L_0x012b
        L_0x0339:
            r1.getMax(r11)     // Catch:{ all -> 0x034c }
            int r0 = r1.length     // Catch:{ all -> 0x034c }
            r6 = 1
            if (r0 == 0) goto L_0x0344
            r0 = 85
            goto L_0x0346
        L_0x0344:
            r0 = 96
        L_0x0346:
            r6 = r0
            goto L_0x012b
        L_0x0349:
            r6 = r7
            goto L_0x012b
        L_0x034c:
            r0 = move-exception
            r6 = 1
        L_0x034e:
            int r8 = setMin
            r8 = r8 | 5438(0x153e, float:7.62E-42)
            short r8 = (short) r8
            r13 = 379(0x17b, float:5.31E-43)
            short r13 = (short) r13
            byte[] r14 = setMax
            byte r14 = r14[r9]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r8 = setMin(r8, r13, r14)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            r14 = 104(0x68, float:1.46E-43)
            r15 = 36
            if (r8 == 0) goto L_0x0378
            r8 = 3
            if (r7 < r8) goto L_0x0378
            r8 = 4
            if (r7 > r8) goto L_0x0378
        L_0x0374:
            r6 = 36
            goto L_0x04c7
        L_0x0378:
            byte[] r8 = setMax
            r16 = 2117(0x845, float:2.967E-42)
            byte r6 = r8[r16]
            short r6 = (short) r6
            r10 = r6 | 353(0x161, float:4.95E-43)
            short r10 = (short) r10
            byte r8 = r8[r9]
            int r8 = -r8
            byte r8 = (byte) r8
            java.lang.String r6 = setMin(r6, r10, r8)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x039f
            r6 = 7
            if (r7 < r6) goto L_0x039f
            r6 = 8
            if (r7 > r6) goto L_0x039f
        L_0x039b:
            r6 = 22
            goto L_0x04c7
        L_0x039f:
            int r6 = setMin
            r6 = r6 | 351(0x15f, float:4.92E-43)
            short r6 = (short) r6
            r8 = 376(0x178, float:5.27E-43)
            short r8 = (short) r8
            byte[] r10 = setMax
            byte r10 = r10[r9]
            int r10 = -r10
            byte r10 = (byte) r10
            java.lang.String r6 = setMin(r6, r8, r10)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x03c2
            r6 = 17
            if (r7 < r6) goto L_0x03c2
            if (r7 > r12) goto L_0x03c2
            goto L_0x039b
        L_0x03c2:
            r6 = 3615(0xe1f, float:5.066E-42)
            short r6 = (short) r6
            r10 = 380(0x17c, float:5.32E-43)
            short r10 = (short) r10
            byte[] r12 = setMax
            byte r12 = r12[r9]
            int r12 = -r12
            byte r12 = (byte) r12
            java.lang.String r6 = setMin(r6, r10, r12)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x03e5
            r6 = 26
            if (r7 < r6) goto L_0x03e5
            r6 = 30
            if (r7 > r6) goto L_0x03e5
            goto L_0x0374
        L_0x03e5:
            int r6 = setMin
            r6 = r6 | 5438(0x153e, float:7.62E-42)
            short r6 = (short) r6
            byte[] r10 = setMax
            byte r10 = r10[r9]
            int r10 = -r10
            byte r10 = (byte) r10
            java.lang.String r6 = setMin(r6, r13, r10)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0408
            r6 = 27
            if (r7 < r6) goto L_0x0408
            r6 = 28
            if (r7 > r6) goto L_0x0408
            goto L_0x0374
        L_0x0408:
            int r6 = setMin
            r6 = r6 | 351(0x15f, float:4.92E-43)
            short r6 = (short) r6
            byte[] r10 = setMax
            byte r10 = r10[r9]
            int r10 = -r10
            byte r10 = (byte) r10
            java.lang.String r6 = setMin(r6, r8, r10)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0429
            if (r7 < r11) goto L_0x0429
            r6 = 35
            if (r7 > r6) goto L_0x0429
            goto L_0x039b
        L_0x0429:
            r6 = 42
            if (r7 < r6) goto L_0x0435
            r6 = 45
            if (r7 > r6) goto L_0x0435
            r6 = 84
            goto L_0x04c7
        L_0x0435:
            r6 = 534(0x216, float:7.48E-43)
            short r6 = (short) r6
            byte[] r8 = setMax
            byte r8 = r8[r9]
            int r8 = -r8
            byte r8 = (byte) r8
            java.lang.String r6 = setMin(r6, r13, r8)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0452
            if (r7 < r3) goto L_0x0452
            if (r7 > r4) goto L_0x0452
            goto L_0x0374
        L_0x0452:
            int r6 = setMin
            r8 = r6 | 97
            short r8 = (short) r8
            r6 = r6 | 263(0x107, float:3.69E-43)
            short r6 = (short) r6
            byte[] r10 = setMax
            byte r10 = r10[r9]
            int r10 = -r10
            byte r10 = (byte) r10
            java.lang.String r6 = setMin(r8, r6, r10)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0476
            r6 = 75
            if (r7 < r6) goto L_0x0476
            if (r7 > r4) goto L_0x0476
            goto L_0x039b
        L_0x0476:
            int r6 = setMin
            r8 = r6 | 97
            short r8 = (short) r8
            r6 = r6 | 263(0x107, float:3.69E-43)
            short r6 = (short) r6
            byte[] r10 = setMax
            byte r10 = r10[r9]
            int r10 = -r10
            byte r10 = (byte) r10
            java.lang.String r6 = setMin(r8, r6, r10)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x049c
            r6 = 86
            if (r7 < r6) goto L_0x049c
            r6 = 90
            if (r7 > r6) goto L_0x049c
            goto L_0x039b
        L_0x049c:
            r6 = 98
            if (r7 < r6) goto L_0x04a5
            if (r7 > r14) goto L_0x04a5
            r6 = 104(0x68, float:1.46E-43)
            goto L_0x04c7
        L_0x04a5:
            r6 = 3642(0xe3a, float:5.104E-42)
            short r6 = (short) r6
            r8 = 382(0x17e, float:5.35E-43)
            short r8 = (short) r8
            byte[] r10 = setMax
            byte r10 = r10[r9]
            int r10 = -r10
            byte r10 = (byte) r10
            java.lang.String r6 = setMin(r6, r8, r10)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x04d1
            r6 = 97
            if (r7 < r6) goto L_0x04d1
            if (r7 > r14) goto L_0x04d1
            goto L_0x039b
        L_0x04c7:
            r1.IsOverlapping = r0
            r0 = 26
            r1.getMax(r0)
            r10 = 0
            goto L_0x012b
        L_0x04d1:
            throw r0
        L_0x04d2:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x04da
            throw r1
        L_0x04da:
            goto L_0x04dc
        L_0x04db:
            throw r0
        L_0x04dc:
            goto L_0x04db
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.lambda$getKey$4(o.TitleBarRightButtonView$1, java.lang.Throwable):o.TitleBarRightButtonView$1");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Boolean lambda$getOtpInitResult$9(com.alipay.iap.android.f2fpay.otp.OtpInitResult r15) throws java.lang.Exception {
        /*
            o.PointToExtensionRegistry r0 = new o.PointToExtensionRegistry
            r0.<init>(r15)
            int r15 = setMin
            r15 = r15 | 2372(0x944, float:3.324E-42)
            short r15 = (short) r15
            r1 = 272(0x110, float:3.81E-43)
            short r1 = (short) r1
            r2 = 73
            byte r2 = (byte) r2
            java.lang.String r15 = setMin(r15, r1, r2)
            int r1 = setMin
            r1 = r1 | 351(0x15f, float:4.92E-43)
            short r1 = (short) r1
            r2 = r1 & 1977(0x7b9, float:2.77E-42)
            short r2 = (short) r2
            r3 = 74
            byte r3 = (byte) r3
            java.lang.String r1 = setMin(r1, r2, r3)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0263 }
            r4 = 0
            r3[r4] = r1     // Catch:{ all -> 0x0263 }
            r1 = 1282(0x502, float:1.796E-42)
            short r1 = (short) r1     // Catch:{ all -> 0x0263 }
            int r5 = setMin     // Catch:{ all -> 0x0263 }
            r5 = r5 | 266(0x10a, float:3.73E-43)
            short r5 = (short) r5     // Catch:{ all -> 0x0263 }
            byte[] r6 = setMax     // Catch:{ all -> 0x0263 }
            r7 = 22
            byte r6 = r6[r7]     // Catch:{ all -> 0x0263 }
            int r6 = -r6
            byte r6 = (byte) r6     // Catch:{ all -> 0x0263 }
            java.lang.String r5 = setMin(r1, r5, r6)     // Catch:{ all -> 0x0263 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0263 }
            r6 = 2363(0x93b, float:3.311E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x0263 }
            int r8 = setMin     // Catch:{ all -> 0x0263 }
            r8 = r8 | 277(0x115, float:3.88E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x0263 }
            byte[] r9 = setMax     // Catch:{ all -> 0x0263 }
            r10 = 21
            byte r9 = r9[r10]     // Catch:{ all -> 0x0263 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0263 }
            java.lang.String r6 = setMin(r6, r8, r9)     // Catch:{ all -> 0x0263 }
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ all -> 0x0263 }
            int r9 = setMin     // Catch:{ all -> 0x0263 }
            r9 = r9 | 266(0x10a, float:3.73E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x0263 }
            byte[] r10 = setMax     // Catch:{ all -> 0x0263 }
            byte r10 = r10[r7]     // Catch:{ all -> 0x0263 }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x0263 }
            java.lang.String r9 = setMin(r1, r9, r10)     // Catch:{ all -> 0x0263 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0263 }
            r8[r4] = r9     // Catch:{ all -> 0x0263 }
            java.lang.reflect.Method r5 = r5.getMethod(r6, r8)     // Catch:{ all -> 0x0263 }
            java.lang.Object r15 = r5.invoke(r15, r3)     // Catch:{ all -> 0x0263 }
            java.lang.Object[] r15 = (java.lang.Object[]) r15     // Catch:{ all -> 0x0263 }
            int r3 = r15.length
            int[] r3 = new int[r3]
            r5 = 0
        L_0x0079:
            int r6 = r15.length
            r8 = 4
            r9 = 0
            if (r5 >= r6) goto L_0x011a
            r6 = r15[r5]
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x0111 }
            r10[r4] = r6     // Catch:{ all -> 0x0111 }
            r6 = 3658(0xe4a, float:5.126E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x0111 }
            int r11 = setMin     // Catch:{ all -> 0x0111 }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0111 }
            byte[] r12 = setMax     // Catch:{ all -> 0x0111 }
            byte r12 = r12[r7]     // Catch:{ all -> 0x0111 }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x0111 }
            java.lang.String r11 = setMin(r6, r11, r12)     // Catch:{ all -> 0x0111 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0111 }
            int r12 = setMin     // Catch:{ all -> 0x0111 }
            r12 = r12 | 602(0x25a, float:8.44E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0111 }
            int r13 = setMin     // Catch:{ all -> 0x0111 }
            r13 = r13 | 275(0x113, float:3.85E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0111 }
            byte[] r14 = setMax     // Catch:{ all -> 0x0111 }
            byte r8 = r14[r8]     // Catch:{ all -> 0x0111 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x0111 }
            java.lang.String r8 = setMin(r12, r13, r8)     // Catch:{ all -> 0x0111 }
            java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch:{ all -> 0x0111 }
            int r13 = setMin     // Catch:{ all -> 0x0111 }
            r13 = r13 | 266(0x10a, float:3.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0111 }
            byte[] r14 = setMax     // Catch:{ all -> 0x0111 }
            byte r14 = r14[r7]     // Catch:{ all -> 0x0111 }
            int r14 = -r14
            byte r14 = (byte) r14     // Catch:{ all -> 0x0111 }
            java.lang.String r13 = setMin(r1, r13, r14)     // Catch:{ all -> 0x0111 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0111 }
            r12[r4] = r13     // Catch:{ all -> 0x0111 }
            java.lang.reflect.Method r8 = r11.getMethod(r8, r12)     // Catch:{ all -> 0x0111 }
            java.lang.Object r8 = r8.invoke(r9, r10)     // Catch:{ all -> 0x0111 }
            int r10 = setMin     // Catch:{ all -> 0x0108 }
            r10 = r10 | 265(0x109, float:3.71E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0108 }
            byte[] r11 = setMax     // Catch:{ all -> 0x0108 }
            byte r11 = r11[r7]     // Catch:{ all -> 0x0108 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0108 }
            java.lang.String r6 = setMin(r6, r10, r11)     // Catch:{ all -> 0x0108 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x0108 }
            int r10 = setMin     // Catch:{ all -> 0x0108 }
            r10 = r10 | 596(0x254, float:8.35E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0108 }
            int r11 = setMin     // Catch:{ all -> 0x0108 }
            r11 = r11 | 274(0x112, float:3.84E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0108 }
            byte[] r12 = setMax     // Catch:{ all -> 0x0108 }
            r13 = 5678(0x162e, float:7.957E-42)
            byte r12 = r12[r13]     // Catch:{ all -> 0x0108 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0108 }
            java.lang.String r10 = setMin(r10, r11, r12)     // Catch:{ all -> 0x0108 }
            java.lang.reflect.Method r6 = r6.getMethod(r10, r9)     // Catch:{ all -> 0x0108 }
            java.lang.Object r6 = r6.invoke(r8, r9)     // Catch:{ all -> 0x0108 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0108 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0108 }
            r3[r5] = r6
            int r5 = r5 + 1
            goto L_0x0079
        L_0x0108:
            r15 = move-exception
            java.lang.Throwable r0 = r15.getCause()
            if (r0 == 0) goto L_0x0110
            throw r0
        L_0x0110:
            throw r15
        L_0x0111:
            r15 = move-exception
            java.lang.Throwable r0 = r15.getCause()
            if (r0 == 0) goto L_0x0119
            throw r0
        L_0x0119:
            throw r15
        L_0x011a:
            r15 = 6
            r1 = 34
            r5 = 40
        L_0x011f:
            int r6 = r4 + 1
            r10 = 36
            r4 = r3[r4]     // Catch:{ all -> 0x01c4 }
            int r4 = r0.getMax(r4)     // Catch:{ all -> 0x01c4 }
            r11 = 15
            switch(r4) {
                case -13: goto L_0x01b3;
                case -12: goto L_0x01af;
                case -11: goto L_0x01ac;
                case -10: goto L_0x01a8;
                case -9: goto L_0x01a4;
                case -8: goto L_0x0197;
                case -7: goto L_0x0186;
                case -6: goto L_0x017e;
                case -5: goto L_0x017c;
                case -4: goto L_0x0143;
                case -3: goto L_0x013b;
                case -2: goto L_0x0133;
                case -1: goto L_0x0130;
                default: goto L_0x012e;
            }     // Catch:{ all -> 0x01c4 }
        L_0x012e:
            goto L_0x01c1
        L_0x0130:
            r4 = 29
            goto L_0x011f
        L_0x0133:
            r0.getMax(r11)     // Catch:{ all -> 0x01c4 }
            java.lang.Object r4 = r0.toIntRange     // Catch:{ all -> 0x01c4 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x01c4 }
            throw r4     // Catch:{ all -> 0x01c4 }
        L_0x013b:
            r0.getMax(r11)     // Catch:{ all -> 0x01c4 }
            java.lang.Object r4 = r0.toIntRange     // Catch:{ all -> 0x01c4 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01c4 }
            return r4
        L_0x0143:
            r4 = 1298(0x512, float:1.819E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x01c4 }
            int r11 = setMin     // Catch:{ all -> 0x01c4 }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x01c4 }
            byte[] r12 = setMax     // Catch:{ all -> 0x01c4 }
            byte r12 = r12[r7]     // Catch:{ all -> 0x01c4 }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x01c4 }
            java.lang.String r4 = setMin(r4, r11, r12)     // Catch:{ all -> 0x01c4 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x01c4 }
            r11 = 537(0x219, float:7.52E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x01c4 }
            int r12 = setMin     // Catch:{ all -> 0x01c4 }
            r12 = r12 | 278(0x116, float:3.9E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x01c4 }
            byte[] r13 = setMax     // Catch:{ all -> 0x01c4 }
            r14 = 416(0x1a0, float:5.83E-43)
            byte r13 = r13[r14]     // Catch:{ all -> 0x01c4 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x01c4 }
            java.lang.String r11 = setMin(r11, r12, r13)     // Catch:{ all -> 0x01c4 }
            java.lang.reflect.Field r4 = r4.getField(r11)     // Catch:{ all -> 0x01c4 }
            java.lang.Object r4 = r4.get(r9)     // Catch:{ all -> 0x01c4 }
            r0.IsOverlapping = r4     // Catch:{ all -> 0x01c4 }
            r4 = 19
            r0.getMax(r4)     // Catch:{ all -> 0x01c4 }
            goto L_0x01c1
        L_0x017c:
            r4 = 2
            goto L_0x011f
        L_0x017e:
            int r4 = length     // Catch:{ all -> 0x01c4 }
            r0.getMax = r4     // Catch:{ all -> 0x01c4 }
            r0.getMax(r2)     // Catch:{ all -> 0x01c4 }
            goto L_0x01c1
        L_0x0186:
            r0.getMax = r2     // Catch:{ all -> 0x01c4 }
            r4 = 10
            r0.getMax(r4)     // Catch:{ all -> 0x01c4 }
            r4 = 11
            r0.getMax(r4)     // Catch:{ all -> 0x01c4 }
            int r4 = r0.length     // Catch:{ all -> 0x01c4 }
            getMin = r4     // Catch:{ all -> 0x01c4 }
            goto L_0x01c1
        L_0x0197:
            r4 = 68
            r0.getMax(r4)     // Catch:{ all -> 0x01c4 }
            int r4 = r0.length     // Catch:{ all -> 0x01c4 }
            if (r4 != 0) goto L_0x01c1
            r4 = 27
            goto L_0x011f
        L_0x01a4:
            r4 = 40
            goto L_0x011f
        L_0x01a8:
            r4 = 34
            goto L_0x011f
        L_0x01ac:
            r4 = 6
            goto L_0x011f
        L_0x01af:
            r4 = 42
            goto L_0x011f
        L_0x01b3:
            r0.getMax(r1)     // Catch:{ all -> 0x01c4 }
            int r4 = r0.length     // Catch:{ all -> 0x01c4 }
            if (r4 == 0) goto L_0x01be
            r4 = 36
            goto L_0x011f
        L_0x01be:
            r4 = 4
            goto L_0x011f
        L_0x01c1:
            r4 = r6
            goto L_0x011f
        L_0x01c4:
            r4 = move-exception
            r11 = 3642(0xe3a, float:5.104E-42)
            short r11 = (short) r11
            r12 = 382(0x17e, float:5.35E-43)
            short r12 = (short) r12
            byte[] r13 = setMax
            byte r13 = r13[r7]
            int r13 = -r13
            byte r13 = (byte) r13
            java.lang.String r11 = setMin(r11, r12, r13)
            java.lang.Class r11 = java.lang.Class.forName(r11)
            boolean r11 = r11.isInstance(r4)
            r12 = 28
            if (r11 == 0) goto L_0x01e8
            if (r6 < r8) goto L_0x01e8
            r11 = 5
            if (r6 > r11) goto L_0x01e8
            goto L_0x0258
        L_0x01e8:
            int r11 = setMin
            r11 = r11 | 5194(0x144a, float:7.278E-42)
            short r11 = (short) r11
            r13 = 375(0x177, float:5.25E-43)
            short r13 = (short) r13
            byte[] r14 = setMax
            byte r14 = r14[r7]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r11 = setMin(r11, r13, r14)
            java.lang.Class r11 = java.lang.Class.forName(r11)
            boolean r11 = r11.isInstance(r4)
            if (r11 == 0) goto L_0x0209
            if (r6 < r15) goto L_0x0209
            if (r6 > r12) goto L_0x0209
            goto L_0x0258
        L_0x0209:
            r11 = 768(0x300, float:1.076E-42)
            short r11 = (short) r11
            r13 = 371(0x173, float:5.2E-43)
            short r13 = (short) r13
            byte[] r14 = setMax
            byte r14 = r14[r7]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r11 = setMin(r11, r13, r14)
            java.lang.Class r11 = java.lang.Class.forName(r11)
            boolean r11 = r11.isInstance(r4)
            if (r11 == 0) goto L_0x022c
            r11 = 23
            if (r6 < r11) goto L_0x022c
            r11 = 24
            if (r6 > r11) goto L_0x022c
            goto L_0x0258
        L_0x022c:
            r11 = 37
            if (r6 < r11) goto L_0x0234
            if (r6 > r5) goto L_0x0234
            r12 = 1
            goto L_0x0258
        L_0x0234:
            byte[] r11 = setMax
            r12 = 2117(0x845, float:2.967E-42)
            byte r12 = r11[r12]
            short r12 = (short) r12
            r13 = r12 | 353(0x161, float:4.95E-43)
            short r13 = (short) r13
            byte r11 = r11[r7]
            int r11 = -r11
            byte r11 = (byte) r11
            java.lang.String r11 = setMin(r12, r13, r11)
            java.lang.Class r11 = java.lang.Class.forName(r11)
            boolean r11 = r11.isInstance(r4)
            if (r11 == 0) goto L_0x0262
            if (r6 < r10) goto L_0x0262
            if (r6 > r5) goto L_0x0262
            r6 = 33
            r12 = 33
        L_0x0258:
            r0.IsOverlapping = r4
            r4 = 26
            r0.getMax(r4)
            r4 = r12
            goto L_0x011f
        L_0x0262:
            throw r4
        L_0x0263:
            r15 = move-exception
            java.lang.Throwable r0 = r15.getCause()
            if (r0 == 0) goto L_0x026b
            throw r0
        L_0x026b:
            goto L_0x026d
        L_0x026c:
            throw r15
        L_0x026d:
            goto L_0x026c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.lambda$getOtpInitResult$9(com.alipay.iap.android.f2fpay.otp.OtpInitResult):java.lang.Boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void lambda$init$0(java.lang.String r15) throws java.lang.Exception {
        /*
            r14 = this;
            o.PointToExtensionRegistry r0 = new o.PointToExtensionRegistry
            r0.<init>(r14, r15)
            r15 = 5719(0x1657, float:8.014E-42)
            short r15 = (short) r15
            int r1 = setMin
            r2 = 1
            int r1 = r1 << r2
            short r1 = (short) r1
            r3 = 73
            byte r3 = (byte) r3
            java.lang.String r15 = setMin(r15, r1, r3)
            int r1 = setMin
            r1 = r1 | 351(0x15f, float:4.92E-43)
            short r1 = (short) r1
            r3 = r1 & 1977(0x7b9, float:2.77E-42)
            short r3 = (short) r3
            r4 = 74
            byte r4 = (byte) r4
            java.lang.String r1 = setMin(r1, r3, r4)
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x027f }
            r4 = 0
            r3[r4] = r1     // Catch:{ all -> 0x027f }
            r1 = 1282(0x502, float:1.796E-42)
            short r1 = (short) r1     // Catch:{ all -> 0x027f }
            int r5 = setMin     // Catch:{ all -> 0x027f }
            r5 = r5 | 266(0x10a, float:3.73E-43)
            short r5 = (short) r5     // Catch:{ all -> 0x027f }
            byte[] r6 = setMax     // Catch:{ all -> 0x027f }
            r7 = 22
            byte r6 = r6[r7]     // Catch:{ all -> 0x027f }
            int r6 = -r6
            byte r6 = (byte) r6     // Catch:{ all -> 0x027f }
            java.lang.String r5 = setMin(r1, r5, r6)     // Catch:{ all -> 0x027f }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x027f }
            r6 = 2363(0x93b, float:3.311E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x027f }
            int r8 = setMin     // Catch:{ all -> 0x027f }
            r8 = r8 | 277(0x115, float:3.88E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x027f }
            byte[] r9 = setMax     // Catch:{ all -> 0x027f }
            r10 = 21
            byte r9 = r9[r10]     // Catch:{ all -> 0x027f }
            byte r9 = (byte) r9     // Catch:{ all -> 0x027f }
            java.lang.String r6 = setMin(r6, r8, r9)     // Catch:{ all -> 0x027f }
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ all -> 0x027f }
            int r9 = setMin     // Catch:{ all -> 0x027f }
            r9 = r9 | 266(0x10a, float:3.73E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x027f }
            byte[] r10 = setMax     // Catch:{ all -> 0x027f }
            byte r10 = r10[r7]     // Catch:{ all -> 0x027f }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x027f }
            java.lang.String r9 = setMin(r1, r9, r10)     // Catch:{ all -> 0x027f }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x027f }
            r8[r4] = r9     // Catch:{ all -> 0x027f }
            java.lang.reflect.Method r5 = r5.getMethod(r6, r8)     // Catch:{ all -> 0x027f }
            java.lang.Object r15 = r5.invoke(r15, r3)     // Catch:{ all -> 0x027f }
            java.lang.Object[] r15 = (java.lang.Object[]) r15     // Catch:{ all -> 0x027f }
            int r3 = r15.length
            int[] r3 = new int[r3]
            r5 = 0
        L_0x0078:
            int r6 = r15.length
            if (r5 >= r6) goto L_0x0119
            r6 = r15[r5]
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x0110 }
            r8[r4] = r6     // Catch:{ all -> 0x0110 }
            r6 = 3658(0xe4a, float:5.126E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x0110 }
            int r9 = setMin     // Catch:{ all -> 0x0110 }
            r9 = r9 | 265(0x109, float:3.71E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x0110 }
            byte[] r10 = setMax     // Catch:{ all -> 0x0110 }
            byte r10 = r10[r7]     // Catch:{ all -> 0x0110 }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x0110 }
            java.lang.String r9 = setMin(r6, r9, r10)     // Catch:{ all -> 0x0110 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0110 }
            int r10 = setMin     // Catch:{ all -> 0x0110 }
            r10 = r10 | 602(0x25a, float:8.44E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0110 }
            int r11 = setMin     // Catch:{ all -> 0x0110 }
            r11 = r11 | 275(0x113, float:3.85E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0110 }
            byte[] r12 = setMax     // Catch:{ all -> 0x0110 }
            r13 = 4
            byte r12 = r12[r13]     // Catch:{ all -> 0x0110 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0110 }
            java.lang.String r10 = setMin(r10, r11, r12)     // Catch:{ all -> 0x0110 }
            java.lang.Class[] r11 = new java.lang.Class[r2]     // Catch:{ all -> 0x0110 }
            int r12 = setMin     // Catch:{ all -> 0x0110 }
            r12 = r12 | 266(0x10a, float:3.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0110 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0110 }
            byte r13 = r13[r7]     // Catch:{ all -> 0x0110 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0110 }
            java.lang.String r12 = setMin(r1, r12, r13)     // Catch:{ all -> 0x0110 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0110 }
            r11[r4] = r12     // Catch:{ all -> 0x0110 }
            java.lang.reflect.Method r9 = r9.getMethod(r10, r11)     // Catch:{ all -> 0x0110 }
            r10 = 0
            java.lang.Object r8 = r9.invoke(r10, r8)     // Catch:{ all -> 0x0110 }
            int r9 = setMin     // Catch:{ all -> 0x0107 }
            r9 = r9 | 265(0x109, float:3.71E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x0107 }
            byte[] r11 = setMax     // Catch:{ all -> 0x0107 }
            byte r11 = r11[r7]     // Catch:{ all -> 0x0107 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = setMin(r6, r9, r11)     // Catch:{ all -> 0x0107 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x0107 }
            int r9 = setMin     // Catch:{ all -> 0x0107 }
            r9 = r9 | 596(0x254, float:8.35E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x0107 }
            int r11 = setMin     // Catch:{ all -> 0x0107 }
            r11 = r11 | 274(0x112, float:3.84E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0107 }
            byte[] r12 = setMax     // Catch:{ all -> 0x0107 }
            r13 = 5678(0x162e, float:7.957E-42)
            byte r12 = r12[r13]     // Catch:{ all -> 0x0107 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0107 }
            java.lang.String r9 = setMin(r9, r11, r12)     // Catch:{ all -> 0x0107 }
            java.lang.reflect.Method r6 = r6.getMethod(r9, r10)     // Catch:{ all -> 0x0107 }
            java.lang.Object r6 = r6.invoke(r8, r10)     // Catch:{ all -> 0x0107 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0107 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0107 }
            r3[r5] = r6
            int r5 = r5 + 1
            goto L_0x0078
        L_0x0107:
            r15 = move-exception
            java.lang.Throwable r0 = r15.getCause()
            if (r0 == 0) goto L_0x010f
            throw r0
        L_0x010f:
            throw r15
        L_0x0110:
            r15 = move-exception
            java.lang.Throwable r0 = r15.getCause()
            if (r0 == 0) goto L_0x0118
            throw r0
        L_0x0118:
            throw r15
        L_0x0119:
            r15 = 23
            r1 = 2
            r5 = 18
            r6 = 11
        L_0x0120:
            int r8 = r4 + 1
            r4 = r3[r4]     // Catch:{ all -> 0x01c8 }
            int r4 = r0.getMax(r4)     // Catch:{ all -> 0x01c8 }
            r9 = 10
            switch(r4) {
                case -17: goto L_0x01c2;
                case -16: goto L_0x01b5;
                case -15: goto L_0x01a8;
                case -14: goto L_0x01a3;
                case -13: goto L_0x0199;
                case -12: goto L_0x0196;
                case -11: goto L_0x0194;
                case -10: goto L_0x0177;
                case -9: goto L_0x015f;
                case -8: goto L_0x015e;
                case -7: goto L_0x015b;
                case -6: goto L_0x0158;
                case -5: goto L_0x014c;
                case -4: goto L_0x013e;
                case -3: goto L_0x0135;
                case -2: goto L_0x0132;
                case -1: goto L_0x012f;
                default: goto L_0x012d;
            }     // Catch:{ all -> 0x01c8 }
        L_0x012d:
            goto L_0x01c5
        L_0x012f:
            r4 = 18
            goto L_0x0120
        L_0x0132:
            r4 = 13
            goto L_0x0120
        L_0x0135:
            int r4 = getMin     // Catch:{ all -> 0x01c8 }
            r0.getMax = r4     // Catch:{ all -> 0x01c8 }
        L_0x0139:
            r0.getMax(r2)     // Catch:{ all -> 0x01c8 }
            goto L_0x01c5
        L_0x013e:
            r0.getMax = r2     // Catch:{ all -> 0x01c8 }
            r0.getMax(r9)     // Catch:{ all -> 0x01c8 }
            r0.getMax(r6)     // Catch:{ all -> 0x01c8 }
            int r4 = r0.length     // Catch:{ all -> 0x01c8 }
            length = r4     // Catch:{ all -> 0x01c8 }
            goto L_0x01c5
        L_0x014c:
            r4 = 12
            r0.getMax(r4)     // Catch:{ all -> 0x01c8 }
            int r4 = r0.length     // Catch:{ all -> 0x01c8 }
            if (r4 != 0) goto L_0x01c5
            r4 = 10
            goto L_0x0120
        L_0x0158:
            r4 = 46
            goto L_0x0120
        L_0x015b:
            r4 = 11
            goto L_0x0120
        L_0x015e:
            return
        L_0x015f:
            r0.getMax = r2     // Catch:{ all -> 0x01c8 }
            r0.getMax(r9)     // Catch:{ all -> 0x01c8 }
            r0.getMax(r5)     // Catch:{ all -> 0x01c8 }
            java.lang.Object r4 = r0.toIntRange     // Catch:{ all -> 0x01c8 }
            o.DefaultExtensionRegistry r4 = (o.DefaultExtensionRegistry) r4     // Catch:{ all -> 0x01c8 }
            o.getExtensionMetaInfos r4 = r4.createQrPayData()     // Catch:{ all -> 0x01c8 }
            r0.IsOverlapping = r4     // Catch:{ all -> 0x01c8 }
            r4 = 19
            r0.getMax(r4)     // Catch:{ all -> 0x01c8 }
            goto L_0x01c5
        L_0x0177:
            r4 = 3
            r0.getMax = r4     // Catch:{ all -> 0x01c8 }
            r0.getMax(r9)     // Catch:{ all -> 0x01c8 }
            r0.getMax(r5)     // Catch:{ all -> 0x01c8 }
            java.lang.Object r4 = r0.toIntRange     // Catch:{ all -> 0x01c8 }
            o.getExtensionMetaInfos r4 = (o.getExtensionMetaInfos) r4     // Catch:{ all -> 0x01c8 }
            r0.getMax(r5)     // Catch:{ all -> 0x01c8 }
            java.lang.Object r9 = r0.toIntRange     // Catch:{ all -> 0x01c8 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01c8 }
            r0.getMax(r6)     // Catch:{ all -> 0x01c8 }
            int r10 = r0.length     // Catch:{ all -> 0x01c8 }
            r4.init(r9, r10)     // Catch:{ all -> 0x01c8 }
            goto L_0x01c5
        L_0x0194:
            r4 = 2
            goto L_0x0120
        L_0x0196:
            r4 = 23
            goto L_0x0120
        L_0x0199:
            r4 = 15
            r0.getMax(r4)     // Catch:{ all -> 0x01c8 }
            java.lang.Object r4 = r0.toIntRange     // Catch:{ all -> 0x01c8 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x01c8 }
            throw r4     // Catch:{ all -> 0x01c8 }
        L_0x01a3:
            int r4 = length     // Catch:{ all -> 0x01c8 }
            r0.getMax = r4     // Catch:{ all -> 0x01c8 }
            goto L_0x0139
        L_0x01a8:
            r0.getMax = r2     // Catch:{ all -> 0x01c8 }
            r0.getMax(r9)     // Catch:{ all -> 0x01c8 }
            r0.getMax(r6)     // Catch:{ all -> 0x01c8 }
            int r4 = r0.length     // Catch:{ all -> 0x01c8 }
            getMin = r4     // Catch:{ all -> 0x01c8 }
            goto L_0x01c5
        L_0x01b5:
            r4 = 68
            r0.getMax(r4)     // Catch:{ all -> 0x01c8 }
            int r4 = r0.length     // Catch:{ all -> 0x01c8 }
            if (r4 != 0) goto L_0x01c5
            r4 = 44
            goto L_0x0120
        L_0x01c2:
            r4 = 1
            goto L_0x0120
        L_0x01c5:
            r4 = r8
            goto L_0x0120
        L_0x01c8:
            r4 = move-exception
            r9 = 768(0x300, float:1.076E-42)
            short r9 = (short) r9
            r10 = 371(0x173, float:5.2E-43)
            short r10 = (short) r10
            byte[] r11 = setMax
            byte r11 = r11[r7]
            int r11 = -r11
            byte r11 = (byte) r11
            java.lang.String r9 = setMin(r9, r10, r11)
            java.lang.Class r9 = java.lang.Class.forName(r9)
            boolean r9 = r9.isInstance(r4)
            r10 = 45
            if (r9 == 0) goto L_0x01eb
            if (r8 < r1) goto L_0x01eb
            if (r8 > r6) goto L_0x01eb
            goto L_0x0274
        L_0x01eb:
            int r9 = setMin
            r9 = r9 | 5194(0x144a, float:7.278E-42)
            short r9 = (short) r9
            r11 = 375(0x177, float:5.25E-43)
            short r11 = (short) r11
            byte[] r12 = setMax
            byte r12 = r12[r7]
            int r12 = -r12
            byte r12 = (byte) r12
            java.lang.String r9 = setMin(r9, r11, r12)
            java.lang.Class r9 = java.lang.Class.forName(r9)
            boolean r9 = r9.isInstance(r4)
            if (r9 == 0) goto L_0x0210
            r9 = 6
            if (r8 < r9) goto L_0x0210
            r9 = 7
            if (r8 > r9) goto L_0x0210
        L_0x020d:
            r10 = 22
            goto L_0x0274
        L_0x0210:
            r9 = 3642(0xe3a, float:5.104E-42)
            short r9 = (short) r9
            r12 = 382(0x17e, float:5.35E-43)
            short r12 = (short) r12
            byte[] r13 = setMax
            byte r13 = r13[r7]
            int r13 = -r13
            byte r13 = (byte) r13
            java.lang.String r9 = setMin(r9, r12, r13)
            java.lang.Class r9 = java.lang.Class.forName(r9)
            boolean r9 = r9.isInstance(r4)
            if (r9 == 0) goto L_0x0231
            r9 = 16
            if (r8 < r9) goto L_0x0231
            if (r8 > r5) goto L_0x0231
            goto L_0x020d
        L_0x0231:
            int r9 = setMin
            r9 = r9 | 5194(0x144a, float:7.278E-42)
            short r9 = (short) r9
            byte[] r12 = setMax
            byte r12 = r12[r7]
            int r12 = -r12
            byte r12 = (byte) r12
            java.lang.String r9 = setMin(r9, r11, r12)
            java.lang.Class r9 = java.lang.Class.forName(r9)
            boolean r9 = r9.isInstance(r4)
            if (r9 == 0) goto L_0x0251
            if (r8 < r15) goto L_0x0251
            r9 = 24
            if (r8 > r9) goto L_0x0251
            goto L_0x0274
        L_0x0251:
            int r9 = setMin
            r11 = r9 | 97
            short r11 = (short) r11
            r9 = r9 | 263(0x107, float:3.69E-43)
            short r9 = (short) r9
            byte[] r12 = setMax
            byte r12 = r12[r7]
            int r12 = -r12
            byte r12 = (byte) r12
            java.lang.String r9 = setMin(r11, r9, r12)
            java.lang.Class r9 = java.lang.Class.forName(r9)
            boolean r9 = r9.isInstance(r4)
            if (r9 == 0) goto L_0x027e
            r9 = 40
            if (r8 < r9) goto L_0x027e
            if (r8 > r10) goto L_0x027e
            goto L_0x020d
        L_0x0274:
            r0.IsOverlapping = r4
            r4 = 26
            r0.getMax(r4)
            r4 = r10
            goto L_0x0120
        L_0x027e:
            throw r4
        L_0x027f:
            r15 = move-exception
            java.lang.Throwable r0 = r15.getCause()
            if (r0 == 0) goto L_0x0287
            throw r0
        L_0x0287:
            goto L_0x0289
        L_0x0288:
            throw r15
        L_0x0289:
            goto L_0x0288
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.lambda$init$0(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0262, code lost:
        if (r13 <= 19) goto L_0x0264;
     */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x028c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Boolean lambda$init$1(java.lang.String r19) throws java.lang.Exception {
        /*
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r0 = r19
            r1.<init>(r0)
            int r0 = setMin
            r0 = r0 | 3073(0xc01, float:4.306E-42)
            short r0 = (short) r0
            r2 = 257(0x101, float:3.6E-43)
            short r2 = (short) r2
            r3 = 73
            byte r3 = (byte) r3
            java.lang.String r0 = setMin(r0, r2, r3)
            int r2 = setMin
            r2 = r2 | 351(0x15f, float:4.92E-43)
            short r2 = (short) r2
            r3 = r2 & 1977(0x7b9, float:2.77E-42)
            short r3 = (short) r3
            r4 = 74
            byte r4 = (byte) r4
            java.lang.String r2 = setMin(r2, r3, r4)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x02d9 }
            r5 = 0
            r4[r5] = r2     // Catch:{ all -> 0x02d9 }
            r2 = 1282(0x502, float:1.796E-42)
            short r2 = (short) r2     // Catch:{ all -> 0x02d9 }
            int r6 = setMin     // Catch:{ all -> 0x02d9 }
            r6 = r6 | 266(0x10a, float:3.73E-43)
            short r6 = (short) r6     // Catch:{ all -> 0x02d9 }
            byte[] r7 = setMax     // Catch:{ all -> 0x02d9 }
            r8 = 22
            byte r7 = r7[r8]     // Catch:{ all -> 0x02d9 }
            int r7 = -r7
            byte r7 = (byte) r7     // Catch:{ all -> 0x02d9 }
            java.lang.String r6 = setMin(r2, r6, r7)     // Catch:{ all -> 0x02d9 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x02d9 }
            r7 = 2363(0x93b, float:3.311E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x02d9 }
            int r9 = setMin     // Catch:{ all -> 0x02d9 }
            r9 = r9 | 277(0x115, float:3.88E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x02d9 }
            byte[] r10 = setMax     // Catch:{ all -> 0x02d9 }
            r11 = 21
            byte r10 = r10[r11]     // Catch:{ all -> 0x02d9 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x02d9 }
            java.lang.String r7 = setMin(r7, r9, r10)     // Catch:{ all -> 0x02d9 }
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x02d9 }
            int r10 = setMin     // Catch:{ all -> 0x02d9 }
            r10 = r10 | 266(0x10a, float:3.73E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x02d9 }
            byte[] r11 = setMax     // Catch:{ all -> 0x02d9 }
            byte r11 = r11[r8]     // Catch:{ all -> 0x02d9 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x02d9 }
            java.lang.String r10 = setMin(r2, r10, r11)     // Catch:{ all -> 0x02d9 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x02d9 }
            r9[r5] = r10     // Catch:{ all -> 0x02d9 }
            java.lang.reflect.Method r6 = r6.getMethod(r7, r9)     // Catch:{ all -> 0x02d9 }
            java.lang.Object r0 = r6.invoke(r0, r4)     // Catch:{ all -> 0x02d9 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x02d9 }
            int r4 = r0.length
            int[] r4 = new int[r4]
            r6 = 0
        L_0x007b:
            int r7 = r0.length
            r9 = 0
            if (r6 >= r7) goto L_0x011c
            r7 = r0[r6]
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ all -> 0x0113 }
            r10[r5] = r7     // Catch:{ all -> 0x0113 }
            r7 = 3658(0xe4a, float:5.126E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0113 }
            int r11 = setMin     // Catch:{ all -> 0x0113 }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0113 }
            byte[] r12 = setMax     // Catch:{ all -> 0x0113 }
            byte r12 = r12[r8]     // Catch:{ all -> 0x0113 }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x0113 }
            java.lang.String r11 = setMin(r7, r11, r12)     // Catch:{ all -> 0x0113 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0113 }
            int r12 = setMin     // Catch:{ all -> 0x0113 }
            r12 = r12 | 602(0x25a, float:8.44E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0113 }
            int r13 = setMin     // Catch:{ all -> 0x0113 }
            r13 = r13 | 275(0x113, float:3.85E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0113 }
            byte[] r14 = setMax     // Catch:{ all -> 0x0113 }
            r15 = 4
            byte r14 = r14[r15]     // Catch:{ all -> 0x0113 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0113 }
            java.lang.String r12 = setMin(r12, r13, r14)     // Catch:{ all -> 0x0113 }
            java.lang.Class[] r13 = new java.lang.Class[r3]     // Catch:{ all -> 0x0113 }
            int r14 = setMin     // Catch:{ all -> 0x0113 }
            r14 = r14 | 266(0x10a, float:3.73E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0113 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0113 }
            byte r15 = r15[r8]     // Catch:{ all -> 0x0113 }
            int r15 = -r15
            byte r15 = (byte) r15     // Catch:{ all -> 0x0113 }
            java.lang.String r14 = setMin(r2, r14, r15)     // Catch:{ all -> 0x0113 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0113 }
            r13[r5] = r14     // Catch:{ all -> 0x0113 }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r13)     // Catch:{ all -> 0x0113 }
            java.lang.Object r10 = r11.invoke(r9, r10)     // Catch:{ all -> 0x0113 }
            int r11 = setMin     // Catch:{ all -> 0x010a }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010a }
            byte[] r12 = setMax     // Catch:{ all -> 0x010a }
            byte r12 = r12[r8]     // Catch:{ all -> 0x010a }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x010a }
            java.lang.String r7 = setMin(r7, r11, r12)     // Catch:{ all -> 0x010a }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x010a }
            int r11 = setMin     // Catch:{ all -> 0x010a }
            r11 = r11 | 596(0x254, float:8.35E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010a }
            int r12 = setMin     // Catch:{ all -> 0x010a }
            r12 = r12 | 274(0x112, float:3.84E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x010a }
            byte[] r13 = setMax     // Catch:{ all -> 0x010a }
            r14 = 5678(0x162e, float:7.957E-42)
            byte r13 = r13[r14]     // Catch:{ all -> 0x010a }
            byte r13 = (byte) r13     // Catch:{ all -> 0x010a }
            java.lang.String r11 = setMin(r11, r12, r13)     // Catch:{ all -> 0x010a }
            java.lang.reflect.Method r7 = r7.getMethod(r11, r9)     // Catch:{ all -> 0x010a }
            java.lang.Object r7 = r7.invoke(r10, r9)     // Catch:{ all -> 0x010a }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x010a }
            int r7 = r7.intValue()     // Catch:{ all -> 0x010a }
            r4[r6] = r7
            int r6 = r6 + 1
            goto L_0x007b
        L_0x010a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0112
            throw r1
        L_0x0112:
            throw r0
        L_0x0113:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011b
            throw r1
        L_0x011b:
            throw r0
        L_0x011c:
            r6 = 12
            r7 = 34
            r10 = 10
            r11 = 15
            r12 = 6
        L_0x0125:
            int r13 = r5 + 1
            r14 = 19
            r0 = r4[r5]     // Catch:{ all -> 0x01ee }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x01ee }
            r5 = 11
            switch(r0) {
                case -18: goto L_0x01e7;
                case -17: goto L_0x01e3;
                case -16: goto L_0x01d4;
                case -15: goto L_0x01c7;
                case -14: goto L_0x01c2;
                case -13: goto L_0x01be;
                case -12: goto L_0x01b1;
                case -11: goto L_0x01a4;
                case -10: goto L_0x019c;
                case -9: goto L_0x0199;
                case -8: goto L_0x0196;
                case -7: goto L_0x0186;
                case -6: goto L_0x017e;
                case -5: goto L_0x017b;
                case -4: goto L_0x0178;
                case -3: goto L_0x0140;
                case -2: goto L_0x0138;
                case -1: goto L_0x0136;
                default: goto L_0x0134;
            }     // Catch:{ all -> 0x01ee }
        L_0x0134:
            goto L_0x01eb
        L_0x0136:
            r5 = 6
            goto L_0x0125
        L_0x0138:
            r1.getMax(r11)     // Catch:{ all -> 0x01ee }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01ee }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01ee }
            throw r0     // Catch:{ all -> 0x01ee }
        L_0x0140:
            r0 = 1298(0x512, float:1.819E-42)
            short r0 = (short) r0     // Catch:{ all -> 0x01ee }
            int r5 = setMin     // Catch:{ all -> 0x01ee }
            r5 = r5 | 265(0x109, float:3.71E-43)
            short r5 = (short) r5     // Catch:{ all -> 0x01ee }
            byte[] r16 = setMax     // Catch:{ all -> 0x01ee }
            byte r15 = r16[r8]     // Catch:{ all -> 0x01ee }
            int r15 = -r15
            byte r15 = (byte) r15     // Catch:{ all -> 0x01ee }
            java.lang.String r0 = setMin(r0, r5, r15)     // Catch:{ all -> 0x01ee }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x01ee }
            r5 = 537(0x219, float:7.52E-43)
            short r5 = (short) r5     // Catch:{ all -> 0x01ee }
            int r15 = setMin     // Catch:{ all -> 0x01ee }
            r15 = r15 | 278(0x116, float:3.9E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x01ee }
            byte[] r16 = setMax     // Catch:{ all -> 0x01ee }
            r18 = 416(0x1a0, float:5.83E-43)
            byte r2 = r16[r18]     // Catch:{ all -> 0x01ee }
            byte r2 = (byte) r2     // Catch:{ all -> 0x01ee }
            java.lang.String r2 = setMin(r5, r15, r2)     // Catch:{ all -> 0x01ee }
            java.lang.reflect.Field r0 = r0.getField(r2)     // Catch:{ all -> 0x01ee }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x01ee }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x01ee }
            r1.getMax(r14)     // Catch:{ all -> 0x01ee }
            goto L_0x01eb
        L_0x0178:
            r5 = 18
            goto L_0x0125
        L_0x017b:
            r5 = 34
            goto L_0x0125
        L_0x017e:
            r1.getMax(r11)     // Catch:{ all -> 0x01ee }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01ee }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01ee }
            return r0
        L_0x0186:
            r1.getMax(r7)     // Catch:{ all -> 0x01ee }
            int r0 = r1.length     // Catch:{ all -> 0x01ee }
            r2 = 36
            if (r0 == r2) goto L_0x0193
            r2 = 63
            r5 = 2
            goto L_0x0125
        L_0x0193:
            r5 = 13
            goto L_0x0125
        L_0x0196:
            r5 = 12
            goto L_0x0125
        L_0x0199:
            r5 = 10
            goto L_0x0125
        L_0x019c:
            int r0 = getMin     // Catch:{ all -> 0x01ee }
            r1.getMax = r0     // Catch:{ all -> 0x01ee }
        L_0x01a0:
            r1.getMax(r3)     // Catch:{ all -> 0x01ee }
            goto L_0x01eb
        L_0x01a4:
            r1.getMax = r3     // Catch:{ all -> 0x01ee }
            r1.getMax(r10)     // Catch:{ all -> 0x01ee }
            r1.getMax(r5)     // Catch:{ all -> 0x01ee }
            int r0 = r1.length     // Catch:{ all -> 0x01ee }
            length = r0     // Catch:{ all -> 0x01ee }
            goto L_0x01eb
        L_0x01b1:
            r1.getMax(r6)     // Catch:{ all -> 0x01ee }
            int r0 = r1.length     // Catch:{ all -> 0x01ee }
            if (r0 != 0) goto L_0x01eb
            r0 = 29
            r5 = 29
            goto L_0x0125
        L_0x01be:
            r5 = 17
            goto L_0x0125
        L_0x01c2:
            int r0 = length     // Catch:{ all -> 0x01ee }
            r1.getMax = r0     // Catch:{ all -> 0x01ee }
            goto L_0x01a0
        L_0x01c7:
            r1.getMax = r3     // Catch:{ all -> 0x01ee }
            r1.getMax(r10)     // Catch:{ all -> 0x01ee }
            r1.getMax(r5)     // Catch:{ all -> 0x01ee }
            int r0 = r1.length     // Catch:{ all -> 0x01ee }
            getMin = r0     // Catch:{ all -> 0x01ee }
            goto L_0x01eb
        L_0x01d4:
            r0 = 68
            r1.getMax(r0)     // Catch:{ all -> 0x01ee }
            int r0 = r1.length     // Catch:{ all -> 0x01ee }
            if (r0 != 0) goto L_0x01eb
            r0 = 47
            r5 = 47
            goto L_0x0125
        L_0x01e3:
            r5 = 32
            goto L_0x0125
        L_0x01e7:
            r5 = 15
            goto L_0x0125
        L_0x01eb:
            r5 = r13
            goto L_0x0125
        L_0x01ee:
            r0 = move-exception
            r2 = 3
            if (r13 < r2) goto L_0x01fc
            if (r13 > r12) goto L_0x01fc
            r2 = 31
            r5 = 31
        L_0x01f8:
            r15 = 18
            goto L_0x02cc
        L_0x01fc:
            int r2 = setMin
            r15 = 376(0x178, float:5.27E-43)
            r2 = r2 | r15
            short r2 = (short) r2
            r3 = r2 & 1920(0x780, float:2.69E-42)
            short r3 = (short) r3
            byte[] r18 = setMax
            byte r5 = r18[r8]
            int r5 = -r5
            byte r5 = (byte) r5
            java.lang.String r2 = setMin(r2, r3, r5)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x0221
            r2 = 2
            if (r13 < r2) goto L_0x0221
            if (r13 > r12) goto L_0x0221
        L_0x021e:
            r5 = 30
            goto L_0x01f8
        L_0x0221:
            int r2 = setMin
            r2 = r2 | 351(0x15f, float:4.92E-43)
            short r2 = (short) r2
            short r3 = (short) r15
            byte[] r5 = setMax
            byte r5 = r5[r8]
            int r5 = -r5
            byte r5 = (byte) r5
            java.lang.String r2 = setMin(r2, r3, r5)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x0244
            r2 = 13
            if (r13 < r2) goto L_0x0244
            r2 = 14
            if (r13 > r2) goto L_0x0244
            goto L_0x021e
        L_0x0244:
            r2 = 768(0x300, float:1.076E-42)
            short r2 = (short) r2
            r5 = 371(0x173, float:5.2E-43)
            short r5 = (short) r5
            byte[] r15 = setMax
            byte r15 = r15[r8]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r15 = setMin(r2, r5, r15)
            java.lang.Class r15 = java.lang.Class.forName(r15)
            boolean r15 = r15.isInstance(r0)
            if (r15 == 0) goto L_0x0267
            r15 = 18
            if (r13 < r15) goto L_0x0269
            if (r13 > r14) goto L_0x0269
        L_0x0264:
            r5 = 30
            goto L_0x02cc
        L_0x0267:
            r15 = 18
        L_0x0269:
            int r14 = setMin
            r14 = r14 | 351(0x15f, float:4.92E-43)
            short r14 = (short) r14
            byte[] r17 = setMax
            byte r6 = r17[r8]
            int r6 = -r6
            byte r6 = (byte) r6
            java.lang.String r3 = setMin(r14, r3, r6)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x028c
            r3 = 24
            if (r13 < r3) goto L_0x028c
            r3 = 25
            if (r13 > r3) goto L_0x028c
            r5 = 1
            goto L_0x02cc
        L_0x028c:
            byte[] r3 = setMax
            r6 = 2117(0x845, float:2.967E-42)
            byte r6 = r3[r6]
            short r6 = (short) r6
            r14 = r6 | 353(0x161, float:4.95E-43)
            short r14 = (short) r14
            byte r3 = r3[r8]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r3 = setMin(r6, r14, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x02af
            if (r13 < r7) goto L_0x02af
            r3 = 48
            if (r13 > r3) goto L_0x02af
        L_0x02ae:
            goto L_0x0264
        L_0x02af:
            byte[] r3 = setMax
            byte r3 = r3[r8]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r2 = setMin(r2, r5, r3)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x02d8
            r2 = 42
            if (r13 < r2) goto L_0x02d8
            r2 = 43
            if (r13 > r2) goto L_0x02d8
            goto L_0x02ae
        L_0x02cc:
            r1.IsOverlapping = r0
            r0 = 26
            r1.getMax(r0)
            r3 = 1
            r6 = 12
            goto L_0x0125
        L_0x02d8:
            throw r0
        L_0x02d9:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02e1
            throw r1
        L_0x02e1:
            goto L_0x02e3
        L_0x02e2:
            throw r0
        L_0x02e3:
            goto L_0x02e2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.lambda$init$1(java.lang.String):java.lang.Boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r1.getMax(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x018d, code lost:
        r1.getMax(19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0240, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0245, code lost:
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x026e, code lost:
        r7 = 24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02b4, code lost:
        r7 = 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ o.TitleBarRightButtonView.AnonymousClass4 lambda$initOfflinePay$5(java.lang.String r20) throws java.lang.Exception {
        /*
            r19 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r19
            r0 = r20
            r1.<init>(r2, r0)
            r0 = 2359(0x937, float:3.306E-42)
            short r0 = (short) r0
            int r3 = setMin
            r4 = 43
            r3 = r3 | r4
            short r3 = (short) r3
            r5 = 73
            byte r5 = (byte) r5
            java.lang.String r0 = setMin(r0, r3, r5)
            int r3 = setMin
            r3 = r3 | 351(0x15f, float:4.92E-43)
            short r3 = (short) r3
            r5 = r3 & 1977(0x7b9, float:2.77E-42)
            short r5 = (short) r5
            r6 = 74
            byte r6 = (byte) r6
            java.lang.String r3 = setMin(r3, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x038f }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x038f }
            r3 = 1282(0x502, float:1.796E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x038f }
            int r8 = setMin     // Catch:{ all -> 0x038f }
            r8 = r8 | 266(0x10a, float:3.73E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x038f }
            byte[] r9 = setMax     // Catch:{ all -> 0x038f }
            r10 = 22
            byte r9 = r9[r10]     // Catch:{ all -> 0x038f }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x038f }
            java.lang.String r8 = setMin(r3, r8, r9)     // Catch:{ all -> 0x038f }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x038f }
            r9 = 2363(0x93b, float:3.311E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x038f }
            int r11 = setMin     // Catch:{ all -> 0x038f }
            r11 = r11 | 277(0x115, float:3.88E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x038f }
            byte[] r12 = setMax     // Catch:{ all -> 0x038f }
            r13 = 21
            byte r12 = r12[r13]     // Catch:{ all -> 0x038f }
            byte r12 = (byte) r12     // Catch:{ all -> 0x038f }
            java.lang.String r9 = setMin(r9, r11, r12)     // Catch:{ all -> 0x038f }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x038f }
            int r12 = setMin     // Catch:{ all -> 0x038f }
            r12 = r12 | 266(0x10a, float:3.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x038f }
            byte[] r13 = setMax     // Catch:{ all -> 0x038f }
            byte r13 = r13[r10]     // Catch:{ all -> 0x038f }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x038f }
            java.lang.String r12 = setMin(r3, r12, r13)     // Catch:{ all -> 0x038f }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x038f }
            r11[r7] = r12     // Catch:{ all -> 0x038f }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r11)     // Catch:{ all -> 0x038f }
            java.lang.Object r0 = r8.invoke(r0, r6)     // Catch:{ all -> 0x038f }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x038f }
            int r6 = r0.length
            int[] r6 = new int[r6]
            r8 = 0
        L_0x007e:
            int r9 = r0.length
            r11 = 0
            if (r8 >= r9) goto L_0x0123
            r9 = r0[r8]
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x011a }
            r12[r7] = r9     // Catch:{ all -> 0x011a }
            r9 = 3658(0xe4a, float:5.126E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x011a }
            int r13 = setMin     // Catch:{ all -> 0x011a }
            r13 = r13 | 265(0x109, float:3.71E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x011a }
            byte[] r14 = setMax     // Catch:{ all -> 0x011a }
            byte r14 = r14[r10]     // Catch:{ all -> 0x011a }
            int r14 = -r14
            byte r14 = (byte) r14     // Catch:{ all -> 0x011a }
            java.lang.String r13 = setMin(r9, r13, r14)     // Catch:{ all -> 0x011a }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x011a }
            int r14 = setMin     // Catch:{ all -> 0x011a }
            r14 = r14 | 602(0x25a, float:8.44E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x011a }
            int r15 = setMin     // Catch:{ all -> 0x011a }
            r15 = r15 | 275(0x113, float:3.85E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x011a }
            byte[] r16 = setMax     // Catch:{ all -> 0x011a }
            r17 = 4
            byte r4 = r16[r17]     // Catch:{ all -> 0x011a }
            byte r4 = (byte) r4     // Catch:{ all -> 0x011a }
            java.lang.String r4 = setMin(r14, r15, r4)     // Catch:{ all -> 0x011a }
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x011a }
            int r15 = setMin     // Catch:{ all -> 0x011a }
            r15 = r15 | 266(0x10a, float:3.73E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x011a }
            byte[] r16 = setMax     // Catch:{ all -> 0x011a }
            byte r5 = r16[r10]     // Catch:{ all -> 0x011a }
            int r5 = -r5
            byte r5 = (byte) r5     // Catch:{ all -> 0x011a }
            java.lang.String r5 = setMin(r3, r15, r5)     // Catch:{ all -> 0x011a }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x011a }
            r14[r7] = r5     // Catch:{ all -> 0x011a }
            java.lang.reflect.Method r4 = r13.getMethod(r4, r14)     // Catch:{ all -> 0x011a }
            java.lang.Object r4 = r4.invoke(r11, r12)     // Catch:{ all -> 0x011a }
            int r5 = setMin     // Catch:{ all -> 0x0111 }
            r5 = r5 | 265(0x109, float:3.71E-43)
            short r5 = (short) r5     // Catch:{ all -> 0x0111 }
            byte[] r12 = setMax     // Catch:{ all -> 0x0111 }
            byte r12 = r12[r10]     // Catch:{ all -> 0x0111 }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x0111 }
            java.lang.String r5 = setMin(r9, r5, r12)     // Catch:{ all -> 0x0111 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0111 }
            int r9 = setMin     // Catch:{ all -> 0x0111 }
            r9 = r9 | 596(0x254, float:8.35E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x0111 }
            int r12 = setMin     // Catch:{ all -> 0x0111 }
            r12 = r12 | 274(0x112, float:3.84E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0111 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0111 }
            r14 = 5678(0x162e, float:7.957E-42)
            byte r13 = r13[r14]     // Catch:{ all -> 0x0111 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0111 }
            java.lang.String r9 = setMin(r9, r12, r13)     // Catch:{ all -> 0x0111 }
            java.lang.reflect.Method r5 = r5.getMethod(r9, r11)     // Catch:{ all -> 0x0111 }
            java.lang.Object r4 = r5.invoke(r4, r11)     // Catch:{ all -> 0x0111 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0111 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0111 }
            r6[r8] = r4
            int r8 = r8 + 1
            r4 = 43
            r5 = 1
            goto L_0x007e
        L_0x0111:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0119
            throw r1
        L_0x0119:
            throw r0
        L_0x011a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0122
            throw r1
        L_0x0122:
            throw r0
        L_0x0123:
            r3 = 28
            r4 = 44
        L_0x0127:
            r5 = 3
            r8 = 18
        L_0x012a:
            int r9 = r7 + 1
            r12 = 11
            r0 = r6[r7]     // Catch:{ all -> 0x0248 }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x0248 }
            r7 = 15
            r13 = 12
            r14 = 19
            r15 = 10
            switch(r0) {
                case -23: goto L_0x0242;
                case -22: goto L_0x022f;
                case -21: goto L_0x0221;
                case -20: goto L_0x021a;
                case -19: goto L_0x0217;
                case -18: goto L_0x0213;
                case -17: goto L_0x0200;
                case -16: goto L_0x01cc;
                case -15: goto L_0x01c8;
                case -14: goto L_0x01bd;
                case -13: goto L_0x01b9;
                case -12: goto L_0x01b1;
                case -11: goto L_0x01ad;
                case -10: goto L_0x0191;
                case -9: goto L_0x017a;
                case -8: goto L_0x0177;
                case -7: goto L_0x0174;
                case -6: goto L_0x0168;
                case -5: goto L_0x015a;
                case -4: goto L_0x0150;
                case -3: goto L_0x0148;
                case -2: goto L_0x0145;
                case -1: goto L_0x0142;
                default: goto L_0x013f;
            }     // Catch:{ all -> 0x0248 }
        L_0x013f:
            r7 = 1
            goto L_0x0245
        L_0x0142:
            r7 = 47
            goto L_0x012a
        L_0x0145:
            r7 = 44
            goto L_0x012a
        L_0x0148:
            r1.getMax(r7)     // Catch:{ all -> 0x0248 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0248 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0248 }
            throw r0     // Catch:{ all -> 0x0248 }
        L_0x0150:
            int r0 = getMin     // Catch:{ all -> 0x0248 }
            r1.getMax = r0     // Catch:{ all -> 0x0248 }
            r7 = 1
        L_0x0155:
            r1.getMax(r7)     // Catch:{ all -> 0x0240 }
            goto L_0x0245
        L_0x015a:
            r7 = 1
            r1.getMax = r7     // Catch:{ all -> 0x0240 }
            r1.getMax(r15)     // Catch:{ all -> 0x0248 }
            r1.getMax(r12)     // Catch:{ all -> 0x0248 }
            int r0 = r1.length     // Catch:{ all -> 0x0248 }
            length = r0     // Catch:{ all -> 0x0248 }
            goto L_0x013f
        L_0x0168:
            r1.getMax(r13)     // Catch:{ all -> 0x0248 }
            int r0 = r1.length     // Catch:{ all -> 0x0248 }
            if (r0 != 0) goto L_0x0245
            r0 = 16
            r7 = 16
            goto L_0x012a
        L_0x0174:
            r7 = 17
            goto L_0x012a
        L_0x0177:
            r7 = 18
            goto L_0x012a
        L_0x017a:
            r7 = 1
            r1.getMax = r7     // Catch:{ all -> 0x0240 }
            r1.getMax(r15)     // Catch:{ all -> 0x0248 }
            r1.getMax(r8)     // Catch:{ all -> 0x0248 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0248 }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x0248 }
            o.getExtensionMetaInfos r0 = r0.createQrPayData()     // Catch:{ all -> 0x0248 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x0248 }
        L_0x018d:
            r1.getMax(r14)     // Catch:{ all -> 0x0248 }
            goto L_0x013f
        L_0x0191:
            r1.getMax = r5     // Catch:{ all -> 0x0248 }
            r1.getMax(r15)     // Catch:{ all -> 0x0248 }
            r1.getMax(r8)     // Catch:{ all -> 0x0248 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0248 }
            o.getExtensionMetaInfos r0 = (o.getExtensionMetaInfos) r0     // Catch:{ all -> 0x0248 }
            r1.getMax(r8)     // Catch:{ all -> 0x0248 }
            java.lang.Object r7 = r1.toIntRange     // Catch:{ all -> 0x0248 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0248 }
            r1.getMax(r12)     // Catch:{ all -> 0x0248 }
            int r13 = r1.length     // Catch:{ all -> 0x0248 }
            r0.init(r7, r13)     // Catch:{ all -> 0x0248 }
            goto L_0x013f
        L_0x01ad:
            r7 = 51
            goto L_0x012a
        L_0x01b1:
            r1.getMax(r7)     // Catch:{ all -> 0x0248 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0248 }
            o.TitleBarRightButtonView$4 r0 = (o.TitleBarRightButtonView.AnonymousClass4) r0     // Catch:{ all -> 0x0248 }
            return r0
        L_0x01b9:
            r7 = 25
            goto L_0x012a
        L_0x01bd:
            r1.getMax(r13)     // Catch:{ all -> 0x0248 }
            int r0 = r1.length     // Catch:{ all -> 0x0248 }
            if (r0 != 0) goto L_0x0245
            r7 = 43
            goto L_0x012a
        L_0x01c8:
            r7 = 27
            goto L_0x012a
        L_0x01cc:
            r0 = 1298(0x512, float:1.819E-42)
            short r0 = (short) r0     // Catch:{ all -> 0x0248 }
            int r7 = setMin     // Catch:{ all -> 0x0248 }
            r7 = r7 | 265(0x109, float:3.71E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x0248 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0248 }
            byte r13 = r13[r10]     // Catch:{ all -> 0x0248 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0248 }
            java.lang.String r0 = setMin(r0, r7, r13)     // Catch:{ all -> 0x0248 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0248 }
            r7 = 537(0x219, float:7.52E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x0248 }
            int r13 = setMin     // Catch:{ all -> 0x0248 }
            r13 = r13 | 278(0x116, float:3.9E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0248 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0248 }
            r16 = 416(0x1a0, float:5.83E-43)
            byte r15 = r15[r16]     // Catch:{ all -> 0x0248 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0248 }
            java.lang.String r7 = setMin(r7, r13, r15)     // Catch:{ all -> 0x0248 }
            java.lang.reflect.Field r0 = r0.getField(r7)     // Catch:{ all -> 0x0248 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x0248 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x0248 }
            goto L_0x018d
        L_0x0200:
            r7 = 1
            r1.getMax = r7     // Catch:{ all -> 0x0240 }
            r1.getMax(r15)     // Catch:{ all -> 0x0248 }
            r1.getMax(r8)     // Catch:{ all -> 0x0248 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0248 }
            o.TitleBarRightButtonView$1 r0 = o.TitleBarRightButtonView.AnonymousClass1.just(r0)     // Catch:{ all -> 0x0248 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x0248 }
            goto L_0x018d
        L_0x0213:
            r7 = 28
            goto L_0x012a
        L_0x0217:
            r7 = 3
            goto L_0x012a
        L_0x021a:
            int r0 = length     // Catch:{ all -> 0x0248 }
            r1.getMax = r0     // Catch:{ all -> 0x0248 }
            r7 = 1
            goto L_0x0155
        L_0x0221:
            r7 = 1
            r1.getMax = r7     // Catch:{ all -> 0x0240 }
            r1.getMax(r15)     // Catch:{ all -> 0x0240 }
            r1.getMax(r12)     // Catch:{ all -> 0x0240 }
            int r0 = r1.length     // Catch:{ all -> 0x0240 }
            getMin = r0     // Catch:{ all -> 0x0240 }
            goto L_0x0245
        L_0x022f:
            r7 = 1
            r0 = 68
            r1.getMax(r0)     // Catch:{ all -> 0x0240 }
            int r0 = r1.length     // Catch:{ all -> 0x0240 }
            if (r0 != 0) goto L_0x023c
            r0 = 70
            goto L_0x023d
        L_0x023c:
            r0 = r9
        L_0x023d:
            r7 = r0
            goto L_0x012a
        L_0x0240:
            r0 = move-exception
            goto L_0x024a
        L_0x0242:
            r7 = 1
            goto L_0x012a
        L_0x0245:
            r7 = r9
            goto L_0x012a
        L_0x0248:
            r0 = move-exception
            r7 = 1
        L_0x024a:
            int r13 = setMin
            r13 = r13 | 5194(0x144a, float:7.278E-42)
            short r13 = (short) r13
            r14 = 375(0x177, float:5.25E-43)
            short r14 = (short) r14
            byte[] r15 = setMax
            byte r15 = r15[r10]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r13 = setMin(r13, r14, r15)
            java.lang.Class r13 = java.lang.Class.forName(r13)
            boolean r13 = r13.isInstance(r0)
            r14 = 2
            r15 = 24
            if (r13 == 0) goto L_0x0272
            if (r9 < r5) goto L_0x0272
            r13 = 4
            if (r9 > r13) goto L_0x0272
        L_0x026e:
            r7 = 24
            goto L_0x0385
        L_0x0272:
            int r13 = setMin
            r5 = 376(0x178, float:5.27E-43)
            r13 = r13 | r5
            short r13 = (short) r13
            r7 = r13 & 1920(0x780, float:2.69E-42)
            short r7 = (short) r7
            byte[] r18 = setMax
            byte r8 = r18[r10]
            int r8 = -r8
            byte r8 = (byte) r8
            java.lang.String r7 = setMin(r13, r7, r8)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x0296
            if (r9 < r12) goto L_0x0296
            r7 = 17
            if (r9 > r7) goto L_0x0296
            goto L_0x026e
        L_0x0296:
            r7 = 3615(0xe1f, float:5.066E-42)
            short r7 = (short) r7
            r8 = 380(0x17c, float:5.32E-43)
            short r8 = (short) r8
            byte[] r12 = setMax
            byte r12 = r12[r10]
            int r12 = -r12
            byte r12 = (byte) r12
            java.lang.String r12 = setMin(r7, r8, r12)
            java.lang.Class r12 = java.lang.Class.forName(r12)
            boolean r12 = r12.isInstance(r0)
            if (r12 == 0) goto L_0x02b7
            if (r9 < r10) goto L_0x02b7
            if (r9 > r15) goto L_0x02b7
        L_0x02b4:
            r7 = 2
            goto L_0x0385
        L_0x02b7:
            int r12 = setMin
            r12 = r12 | 351(0x15f, float:4.92E-43)
            short r12 = (short) r12
            short r5 = (short) r5
            byte[] r13 = setMax
            byte r13 = r13[r10]
            int r13 = -r13
            byte r13 = (byte) r13
            java.lang.String r5 = setMin(r12, r5, r13)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x02d8
            if (r9 < r3) goto L_0x02d8
            r5 = 29
            if (r9 > r5) goto L_0x02d8
            goto L_0x026e
        L_0x02d8:
            byte[] r5 = setMax
            byte r5 = r5[r10]
            int r5 = -r5
            byte r5 = (byte) r5
            java.lang.String r5 = setMin(r7, r8, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x02f3
            r5 = 38
            if (r9 < r5) goto L_0x02f3
            if (r9 > r4) goto L_0x02f3
            goto L_0x02b4
        L_0x02f3:
            int r5 = setMin
            r7 = r5 | 97
            short r7 = (short) r7
            r5 = r5 | 263(0x107, float:3.69E-43)
            short r5 = (short) r5
            byte[] r8 = setMax
            byte r8 = r8[r10]
            int r8 = -r8
            byte r8 = (byte) r8
            java.lang.String r5 = setMin(r7, r5, r8)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0316
            if (r9 < r4) goto L_0x0316
            r5 = 45
            if (r9 > r5) goto L_0x0316
        L_0x0315:
            goto L_0x02b4
        L_0x0316:
            int r5 = setMin
            r7 = r5 | 97
            short r7 = (short) r7
            r5 = r5 | 263(0x107, float:3.69E-43)
            short r5 = (short) r5
            byte[] r8 = setMax
            byte r8 = r8[r10]
            int r8 = -r8
            byte r8 = (byte) r8
            java.lang.String r5 = setMin(r7, r5, r8)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x033b
            r5 = 45
            if (r9 < r5) goto L_0x033b
            r5 = 46
            if (r9 > r5) goto L_0x033b
            goto L_0x0315
        L_0x033b:
            r5 = 768(0x300, float:1.076E-42)
            short r5 = (short) r5
            r7 = 371(0x173, float:5.2E-43)
            short r7 = (short) r7
            byte[] r8 = setMax
            byte r8 = r8[r10]
            int r8 = -r8
            byte r8 = (byte) r8
            java.lang.String r5 = setMin(r5, r7, r8)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x035f
            r5 = 51
            if (r9 < r5) goto L_0x035f
            r5 = 52
            if (r9 > r5) goto L_0x035f
            goto L_0x02b4
        L_0x035f:
            int r5 = setMin
            r7 = r5 | 97
            short r7 = (short) r7
            r5 = r5 | 263(0x107, float:3.69E-43)
            short r5 = (short) r5
            byte[] r8 = setMax
            byte r8 = r8[r10]
            int r8 = -r8
            byte r8 = (byte) r8
            java.lang.String r5 = setMin(r7, r5, r8)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x038e
            r5 = 65
            if (r9 < r5) goto L_0x038e
            r5 = 71
            if (r9 > r5) goto L_0x038e
            goto L_0x026e
        L_0x0385:
            r1.IsOverlapping = r0
            r0 = 26
            r1.getMax(r0)
            goto L_0x0127
        L_0x038e:
            throw r0
        L_0x038f:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0397
            throw r1
        L_0x0397:
            goto L_0x0399
        L_0x0398:
            throw r0
        L_0x0399:
            goto L_0x0398
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.lambda$initOfflinePay$5(java.lang.String):o.TitleBarRightButtonView$4");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0277, code lost:
        if (r12 <= 45) goto L_0x0254;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ o.TitleBarRightButtonView.AnonymousClass4 lambda$restart$7(java.lang.String r18) throws java.lang.Exception {
        /*
            r17 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r17
            r0 = r18
            r1.<init>(r2, r0)
            byte[] r0 = setMax
            r3 = 4
            byte r0 = r0[r3]
            short r0 = (short) r0
            r4 = r0 | 183(0xb7, float:2.56E-43)
            short r4 = (short) r4
            r5 = 73
            byte r5 = (byte) r5
            java.lang.String r0 = setMin(r0, r4, r5)
            int r4 = setMin
            r4 = r4 | 351(0x15f, float:4.92E-43)
            short r4 = (short) r4
            r5 = r4 & 1977(0x7b9, float:2.77E-42)
            short r5 = (short) r5
            r6 = 74
            byte r6 = (byte) r6
            java.lang.String r4 = setMin(r4, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x02b4 }
            r7 = 0
            r6[r7] = r4     // Catch:{ all -> 0x02b4 }
            r4 = 1282(0x502, float:1.796E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x02b4 }
            int r8 = setMin     // Catch:{ all -> 0x02b4 }
            r8 = r8 | 266(0x10a, float:3.73E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x02b4 }
            byte[] r9 = setMax     // Catch:{ all -> 0x02b4 }
            r10 = 22
            byte r9 = r9[r10]     // Catch:{ all -> 0x02b4 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x02b4 }
            java.lang.String r8 = setMin(r4, r8, r9)     // Catch:{ all -> 0x02b4 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x02b4 }
            r9 = 2363(0x93b, float:3.311E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x02b4 }
            int r11 = setMin     // Catch:{ all -> 0x02b4 }
            r11 = r11 | 277(0x115, float:3.88E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x02b4 }
            byte[] r12 = setMax     // Catch:{ all -> 0x02b4 }
            r13 = 21
            byte r12 = r12[r13]     // Catch:{ all -> 0x02b4 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x02b4 }
            java.lang.String r9 = setMin(r9, r11, r12)     // Catch:{ all -> 0x02b4 }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x02b4 }
            int r12 = setMin     // Catch:{ all -> 0x02b4 }
            r12 = r12 | 266(0x10a, float:3.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x02b4 }
            byte[] r13 = setMax     // Catch:{ all -> 0x02b4 }
            byte r13 = r13[r10]     // Catch:{ all -> 0x02b4 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x02b4 }
            java.lang.String r12 = setMin(r4, r12, r13)     // Catch:{ all -> 0x02b4 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x02b4 }
            r11[r7] = r12     // Catch:{ all -> 0x02b4 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r11)     // Catch:{ all -> 0x02b4 }
            java.lang.Object r0 = r8.invoke(r0, r6)     // Catch:{ all -> 0x02b4 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x02b4 }
            int r6 = r0.length
            int[] r6 = new int[r6]
            r8 = 0
        L_0x007e:
            int r9 = r0.length
            if (r8 >= r9) goto L_0x011f
            r9 = r0[r8]
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0116 }
            r11[r7] = r9     // Catch:{ all -> 0x0116 }
            r9 = 3658(0xe4a, float:5.126E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0116 }
            int r12 = setMin     // Catch:{ all -> 0x0116 }
            r12 = r12 | 265(0x109, float:3.71E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0116 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0116 }
            byte r13 = r13[r10]     // Catch:{ all -> 0x0116 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0116 }
            java.lang.String r12 = setMin(r9, r12, r13)     // Catch:{ all -> 0x0116 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0116 }
            int r13 = setMin     // Catch:{ all -> 0x0116 }
            r13 = r13 | 602(0x25a, float:8.44E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0116 }
            int r14 = setMin     // Catch:{ all -> 0x0116 }
            r14 = r14 | 275(0x113, float:3.85E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0116 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0116 }
            byte r15 = r15[r3]     // Catch:{ all -> 0x0116 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0116 }
            java.lang.String r13 = setMin(r13, r14, r15)     // Catch:{ all -> 0x0116 }
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x0116 }
            int r15 = setMin     // Catch:{ all -> 0x0116 }
            r15 = r15 | 266(0x10a, float:3.73E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0116 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0116 }
            byte r3 = r16[r10]     // Catch:{ all -> 0x0116 }
            int r3 = -r3
            byte r3 = (byte) r3     // Catch:{ all -> 0x0116 }
            java.lang.String r3 = setMin(r4, r15, r3)     // Catch:{ all -> 0x0116 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0116 }
            r14[r7] = r3     // Catch:{ all -> 0x0116 }
            java.lang.reflect.Method r3 = r12.getMethod(r13, r14)     // Catch:{ all -> 0x0116 }
            r12 = 0
            java.lang.Object r3 = r3.invoke(r12, r11)     // Catch:{ all -> 0x0116 }
            int r11 = setMin     // Catch:{ all -> 0x010d }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010d }
            byte[] r13 = setMax     // Catch:{ all -> 0x010d }
            byte r13 = r13[r10]     // Catch:{ all -> 0x010d }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x010d }
            java.lang.String r9 = setMin(r9, r11, r13)     // Catch:{ all -> 0x010d }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x010d }
            int r11 = setMin     // Catch:{ all -> 0x010d }
            r11 = r11 | 596(0x254, float:8.35E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010d }
            int r13 = setMin     // Catch:{ all -> 0x010d }
            r13 = r13 | 274(0x112, float:3.84E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x010d }
            byte[] r14 = setMax     // Catch:{ all -> 0x010d }
            r15 = 5678(0x162e, float:7.957E-42)
            byte r14 = r14[r15]     // Catch:{ all -> 0x010d }
            byte r14 = (byte) r14     // Catch:{ all -> 0x010d }
            java.lang.String r11 = setMin(r11, r13, r14)     // Catch:{ all -> 0x010d }
            java.lang.reflect.Method r9 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x010d }
            java.lang.Object r3 = r9.invoke(r3, r12)     // Catch:{ all -> 0x010d }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x010d }
            int r3 = r3.intValue()     // Catch:{ all -> 0x010d }
            r6[r8] = r3
            int r8 = r8 + 1
            r3 = 4
            goto L_0x007e
        L_0x010d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0115
            throw r1
        L_0x0115:
            throw r0
        L_0x0116:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011e
            throw r1
        L_0x011e:
            throw r0
        L_0x011f:
            r3 = 13
            r9 = 7
            r11 = 11
        L_0x0124:
            int r12 = r7 + 1
            r13 = 41
            r0 = r6[r7]     // Catch:{ all -> 0x01e1 }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x01e1 }
            r7 = 19
            r14 = 15
            r15 = 12
            r8 = 18
            r4 = 10
            switch(r0) {
                case -17: goto L_0x01cb;
                case -16: goto L_0x01c8;
                case -15: goto L_0x01bb;
                case -14: goto L_0x01b3;
                case -13: goto L_0x01ab;
                case -12: goto L_0x01a7;
                case -11: goto L_0x01a3;
                case -10: goto L_0x0197;
                case -9: goto L_0x018a;
                case -8: goto L_0x0182;
                case -7: goto L_0x017f;
                case -6: goto L_0x017c;
                case -5: goto L_0x017a;
                case -4: goto L_0x0177;
                case -3: goto L_0x0157;
                case -2: goto L_0x0140;
                case -1: goto L_0x013d;
                default: goto L_0x013b;
            }     // Catch:{ all -> 0x01e1 }
        L_0x013b:
            goto L_0x01de
        L_0x013d:
            r7 = 8
            goto L_0x0124
        L_0x0140:
            r1.getMax = r5     // Catch:{ all -> 0x01e1 }
            r1.getMax(r4)     // Catch:{ all -> 0x01e1 }
            r1.getMax(r8)     // Catch:{ all -> 0x01e1 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01e1 }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x01e1 }
            o.getExtensionMetaInfos r0 = r0.createQrPayData()     // Catch:{ all -> 0x01e1 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x01e1 }
        L_0x0152:
            r1.getMax(r7)     // Catch:{ all -> 0x01e1 }
            goto L_0x01de
        L_0x0157:
            r0 = 3
            r1.getMax = r0     // Catch:{ all -> 0x01e1 }
            r1.getMax(r4)     // Catch:{ all -> 0x01e1 }
            r1.getMax(r8)     // Catch:{ all -> 0x01e1 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01e1 }
            o.getExtensionMetaInfos r0 = (o.getExtensionMetaInfos) r0     // Catch:{ all -> 0x01e1 }
            r1.getMax(r8)     // Catch:{ all -> 0x01e1 }
            java.lang.Object r4 = r1.toIntRange     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x01e1 }
            r1.getMax(r11)     // Catch:{ all -> 0x01e1 }
            int r8 = r1.length     // Catch:{ all -> 0x01e1 }
            o.TitleBarRightButtonView$1 r0 = r0.reStart(r4, r8)     // Catch:{ all -> 0x01e1 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x01e1 }
            goto L_0x0152
        L_0x0177:
            r7 = 13
            goto L_0x0124
        L_0x017a:
            r7 = 1
            goto L_0x0124
        L_0x017c:
            r7 = 44
            goto L_0x0124
        L_0x017f:
            r7 = 63
            goto L_0x0124
        L_0x0182:
            int r0 = getMin     // Catch:{ all -> 0x01e1 }
            r1.getMax = r0     // Catch:{ all -> 0x01e1 }
            r1.getMax(r5)     // Catch:{ all -> 0x01e1 }
            goto L_0x01de
        L_0x018a:
            r1.getMax = r5     // Catch:{ all -> 0x01e1 }
            r1.getMax(r4)     // Catch:{ all -> 0x01e1 }
            r1.getMax(r11)     // Catch:{ all -> 0x01e1 }
            int r0 = r1.length     // Catch:{ all -> 0x01e1 }
            length = r0     // Catch:{ all -> 0x01e1 }
            goto L_0x01de
        L_0x0197:
            r1.getMax(r15)     // Catch:{ all -> 0x01e1 }
            int r0 = r1.length     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x01de
            r0 = 40
            r7 = 40
            goto L_0x0124
        L_0x01a3:
            r7 = 69
            goto L_0x0124
        L_0x01a7:
            r7 = 11
            goto L_0x0124
        L_0x01ab:
            r1.getMax(r14)     // Catch:{ all -> 0x01e1 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01e1 }
            o.TitleBarRightButtonView$4 r0 = (o.TitleBarRightButtonView.AnonymousClass4) r0     // Catch:{ all -> 0x01e1 }
            return r0
        L_0x01b3:
            r1.getMax(r14)     // Catch:{ all -> 0x01e1 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01e1 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01e1 }
            throw r0     // Catch:{ all -> 0x01e1 }
        L_0x01bb:
            r1.getMax(r15)     // Catch:{ all -> 0x01e1 }
            int r0 = r1.length     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x01de
            r0 = 61
            r7 = 61
            goto L_0x0124
        L_0x01c8:
            r7 = 7
            goto L_0x0124
        L_0x01cb:
            r0 = 34
            r1.getMax(r0)     // Catch:{ all -> 0x01e1 }
            int r0 = r1.length     // Catch:{ all -> 0x01e1 }
            r4 = 65
            if (r0 == 0) goto L_0x01da
            r7 = 65
            goto L_0x0124
        L_0x01da:
            r7 = 41
            goto L_0x0124
        L_0x01de:
            r7 = r12
            goto L_0x0124
        L_0x01e1:
            r0 = move-exception
            int r4 = setMin
            r4 = r4 | 5194(0x144a, float:7.278E-42)
            short r4 = (short) r4
            r7 = 375(0x177, float:5.25E-43)
            short r7 = (short) r7
            byte[] r8 = setMax
            byte r8 = r8[r10]
            int r8 = -r8
            byte r8 = (byte) r8
            java.lang.String r4 = setMin(r4, r7, r8)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            r7 = 62
            r8 = 43
            if (r4 == 0) goto L_0x020f
            r4 = 5
            if (r12 < r4) goto L_0x020f
            if (r12 > r9) goto L_0x020f
        L_0x0207:
            r4 = 44
            r7 = 69
            r8 = 62
            goto L_0x02a9
        L_0x020f:
            int r4 = setMin
            r14 = r4 | 97
            short r14 = (short) r14
            r4 = r4 | 263(0x107, float:3.69E-43)
            short r4 = (short) r4
            byte[] r15 = setMax
            byte r15 = r15[r10]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r4 = setMin(r14, r4, r15)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0232
            if (r12 < r3) goto L_0x0232
            r4 = 14
            if (r12 > r4) goto L_0x0232
            goto L_0x0207
        L_0x0232:
            r4 = 768(0x300, float:1.076E-42)
            short r4 = (short) r4
            r7 = 371(0x173, float:5.2E-43)
            short r7 = (short) r7
            byte[] r14 = setMax
            byte r14 = r14[r10]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r4 = setMin(r4, r7, r14)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0257
            r4 = 36
            if (r12 < r4) goto L_0x0257
            if (r12 > r13) goto L_0x0257
            r4 = 44
        L_0x0254:
            r7 = 69
            goto L_0x02a9
        L_0x0257:
            r4 = 3615(0xe1f, float:5.066E-42)
            short r4 = (short) r4
            r7 = 380(0x17c, float:5.32E-43)
            short r7 = (short) r7
            byte[] r13 = setMax
            byte r13 = r13[r10]
            int r13 = -r13
            byte r13 = (byte) r13
            java.lang.String r4 = setMin(r4, r7, r13)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x027a
            r4 = 44
            if (r12 < r4) goto L_0x027c
            r7 = 45
            if (r12 > r7) goto L_0x027c
        L_0x0279:
            goto L_0x0254
        L_0x027a:
            r4 = 44
        L_0x027c:
            r7 = 3642(0xe3a, float:5.104E-42)
            short r7 = (short) r7
            r13 = 382(0x17e, float:5.35E-43)
            short r13 = (short) r13
            byte[] r14 = setMax
            byte r14 = r14[r10]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r7 = setMin(r7, r13, r14)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x029f
            r7 = 56
            if (r12 < r7) goto L_0x029f
            r7 = 57
            if (r12 > r7) goto L_0x029f
            goto L_0x0279
        L_0x029f:
            r7 = 66
            if (r12 < r7) goto L_0x02b3
            r7 = 69
            if (r12 > r7) goto L_0x02b3
            r8 = 64
        L_0x02a9:
            r1.IsOverlapping = r0
            r0 = 26
            r1.getMax(r0)
            r7 = r8
            goto L_0x0124
        L_0x02b3:
            throw r0
        L_0x02b4:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02bc
            throw r1
        L_0x02bc:
            goto L_0x02be
        L_0x02bd:
            throw r0
        L_0x02be:
            goto L_0x02bd
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.lambda$restart$7(java.lang.String):o.TitleBarRightButtonView$4");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ o.TitleBarRightButtonView.AnonymousClass4 lambda$setSeedExtra$8(java.lang.String r14, java.lang.String r15) throws java.lang.Exception {
        /*
            r13 = this;
            o.PointToExtensionRegistry r0 = new o.PointToExtensionRegistry
            r0.<init>(r13, r14, r15)
            r14 = 1837(0x72d, float:2.574E-42)
            short r14 = (short) r14
            r15 = r14 & 475(0x1db, float:6.66E-43)
            short r15 = (short) r15
            r1 = 73
            byte r1 = (byte) r1
            java.lang.String r14 = setMin(r14, r15, r1)
            int r15 = setMin
            r15 = r15 | 351(0x15f, float:4.92E-43)
            short r15 = (short) r15
            r1 = r15 & 1977(0x7b9, float:2.77E-42)
            short r1 = (short) r1
            r2 = 74
            byte r2 = (byte) r2
            java.lang.String r15 = setMin(r15, r1, r2)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0261 }
            r3 = 0
            r2[r3] = r15     // Catch:{ all -> 0x0261 }
            r15 = 1282(0x502, float:1.796E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x0261 }
            int r4 = setMin     // Catch:{ all -> 0x0261 }
            r4 = r4 | 266(0x10a, float:3.73E-43)
            short r4 = (short) r4     // Catch:{ all -> 0x0261 }
            byte[] r5 = setMax     // Catch:{ all -> 0x0261 }
            r6 = 22
            byte r5 = r5[r6]     // Catch:{ all -> 0x0261 }
            int r5 = -r5
            byte r5 = (byte) r5     // Catch:{ all -> 0x0261 }
            java.lang.String r4 = setMin(r15, r4, r5)     // Catch:{ all -> 0x0261 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0261 }
            r5 = 2363(0x93b, float:3.311E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x0261 }
            int r7 = setMin     // Catch:{ all -> 0x0261 }
            r7 = r7 | 277(0x115, float:3.88E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x0261 }
            byte[] r8 = setMax     // Catch:{ all -> 0x0261 }
            r9 = 21
            byte r8 = r8[r9]     // Catch:{ all -> 0x0261 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x0261 }
            java.lang.String r5 = setMin(r5, r7, r8)     // Catch:{ all -> 0x0261 }
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ all -> 0x0261 }
            int r8 = setMin     // Catch:{ all -> 0x0261 }
            r8 = r8 | 266(0x10a, float:3.73E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x0261 }
            byte[] r9 = setMax     // Catch:{ all -> 0x0261 }
            byte r9 = r9[r6]     // Catch:{ all -> 0x0261 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x0261 }
            java.lang.String r8 = setMin(r15, r8, r9)     // Catch:{ all -> 0x0261 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0261 }
            r7[r3] = r8     // Catch:{ all -> 0x0261 }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r7)     // Catch:{ all -> 0x0261 }
            java.lang.Object r14 = r4.invoke(r14, r2)     // Catch:{ all -> 0x0261 }
            java.lang.Object[] r14 = (java.lang.Object[]) r14     // Catch:{ all -> 0x0261 }
            int r2 = r14.length
            int[] r2 = new int[r2]
            r4 = 0
        L_0x0077:
            int r5 = r14.length
            r7 = 4
            if (r4 >= r5) goto L_0x0118
            r5 = r14[r4]
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch:{ all -> 0x010f }
            r8[r3] = r5     // Catch:{ all -> 0x010f }
            r5 = 3658(0xe4a, float:5.126E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x010f }
            int r9 = setMin     // Catch:{ all -> 0x010f }
            r9 = r9 | 265(0x109, float:3.71E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x010f }
            byte[] r10 = setMax     // Catch:{ all -> 0x010f }
            byte r10 = r10[r6]     // Catch:{ all -> 0x010f }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x010f }
            java.lang.String r9 = setMin(r5, r9, r10)     // Catch:{ all -> 0x010f }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x010f }
            int r10 = setMin     // Catch:{ all -> 0x010f }
            r10 = r10 | 602(0x25a, float:8.44E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x010f }
            int r11 = setMin     // Catch:{ all -> 0x010f }
            r11 = r11 | 275(0x113, float:3.85E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010f }
            byte[] r12 = setMax     // Catch:{ all -> 0x010f }
            byte r7 = r12[r7]     // Catch:{ all -> 0x010f }
            byte r7 = (byte) r7     // Catch:{ all -> 0x010f }
            java.lang.String r7 = setMin(r10, r11, r7)     // Catch:{ all -> 0x010f }
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch:{ all -> 0x010f }
            int r11 = setMin     // Catch:{ all -> 0x010f }
            r11 = r11 | 266(0x10a, float:3.73E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010f }
            byte[] r12 = setMax     // Catch:{ all -> 0x010f }
            byte r12 = r12[r6]     // Catch:{ all -> 0x010f }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x010f }
            java.lang.String r11 = setMin(r15, r11, r12)     // Catch:{ all -> 0x010f }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x010f }
            r10[r3] = r11     // Catch:{ all -> 0x010f }
            java.lang.reflect.Method r7 = r9.getMethod(r7, r10)     // Catch:{ all -> 0x010f }
            r9 = 0
            java.lang.Object r7 = r7.invoke(r9, r8)     // Catch:{ all -> 0x010f }
            int r8 = setMin     // Catch:{ all -> 0x0106 }
            r8 = r8 | 265(0x109, float:3.71E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x0106 }
            byte[] r10 = setMax     // Catch:{ all -> 0x0106 }
            byte r10 = r10[r6]     // Catch:{ all -> 0x0106 }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x0106 }
            java.lang.String r5 = setMin(r5, r8, r10)     // Catch:{ all -> 0x0106 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0106 }
            int r8 = setMin     // Catch:{ all -> 0x0106 }
            r8 = r8 | 596(0x254, float:8.35E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x0106 }
            int r10 = setMin     // Catch:{ all -> 0x0106 }
            r10 = r10 | 274(0x112, float:3.84E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0106 }
            byte[] r11 = setMax     // Catch:{ all -> 0x0106 }
            r12 = 5678(0x162e, float:7.957E-42)
            byte r11 = r11[r12]     // Catch:{ all -> 0x0106 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0106 }
            java.lang.String r8 = setMin(r8, r10, r11)     // Catch:{ all -> 0x0106 }
            java.lang.reflect.Method r5 = r5.getMethod(r8, r9)     // Catch:{ all -> 0x0106 }
            java.lang.Object r5 = r5.invoke(r7, r9)     // Catch:{ all -> 0x0106 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0106 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0106 }
            r2[r4] = r5
            int r4 = r4 + 1
            goto L_0x0077
        L_0x0106:
            r14 = move-exception
            java.lang.Throwable r15 = r14.getCause()
            if (r15 == 0) goto L_0x010e
            throw r15
        L_0x010e:
            throw r14
        L_0x010f:
            r14 = move-exception
            java.lang.Throwable r15 = r14.getCause()
            if (r15 == 0) goto L_0x0117
            throw r15
        L_0x0117:
            throw r14
        L_0x0118:
            int r14 = r3 + 1
            r15 = 34
            r4 = 18
            r3 = r2[r3]     // Catch:{ all -> 0x01c7 }
            int r3 = r0.getMax(r3)     // Catch:{ all -> 0x01c7 }
            r5 = 19
            r8 = 11
            r9 = 15
            r10 = 68
            r11 = 10
            switch(r3) {
                case -14: goto L_0x01b1;
                case -13: goto L_0x01ae;
                case -12: goto L_0x01ab;
                case -11: goto L_0x0185;
                case -10: goto L_0x016f;
                case -9: goto L_0x016c;
                case -8: goto L_0x0169;
                case -7: goto L_0x0166;
                case -6: goto L_0x015c;
                case -5: goto L_0x014f;
                case -4: goto L_0x0146;
                case -3: goto L_0x013e;
                case -2: goto L_0x0136;
                case -1: goto L_0x0133;
                default: goto L_0x0131;
            }     // Catch:{ all -> 0x01c7 }
        L_0x0131:
            goto L_0x01c4
        L_0x0133:
            r3 = 31
            goto L_0x0118
        L_0x0136:
            r0.getMax(r9)     // Catch:{ all -> 0x01c7 }
            java.lang.Object r3 = r0.toIntRange     // Catch:{ all -> 0x01c7 }
            o.TitleBarRightButtonView$4 r3 = (o.TitleBarRightButtonView.AnonymousClass4) r3     // Catch:{ all -> 0x01c7 }
            return r3
        L_0x013e:
            r0.getMax(r9)     // Catch:{ all -> 0x01c7 }
            java.lang.Object r3 = r0.toIntRange     // Catch:{ all -> 0x01c7 }
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch:{ all -> 0x01c7 }
            throw r3     // Catch:{ all -> 0x01c7 }
        L_0x0146:
            int r3 = length     // Catch:{ all -> 0x01c7 }
            r0.getMax = r3     // Catch:{ all -> 0x01c7 }
            r0.getMax(r1)     // Catch:{ all -> 0x01c7 }
            goto L_0x01c4
        L_0x014f:
            r0.getMax = r1     // Catch:{ all -> 0x01c7 }
            r0.getMax(r11)     // Catch:{ all -> 0x01c7 }
            r0.getMax(r8)     // Catch:{ all -> 0x01c7 }
            int r3 = r0.length     // Catch:{ all -> 0x01c7 }
            getMin = r3     // Catch:{ all -> 0x01c7 }
            goto L_0x01c4
        L_0x015c:
            r0.getMax(r10)     // Catch:{ all -> 0x01c7 }
            int r15 = r0.length     // Catch:{ all -> 0x01c7 }
            if (r15 != 0) goto L_0x01c4
            r3 = 22
            goto L_0x0118
        L_0x0166:
            r3 = 23
            goto L_0x0118
        L_0x0169:
            r3 = 35
            goto L_0x0118
        L_0x016c:
            r3 = 37
            goto L_0x0118
        L_0x016f:
            r0.getMax = r1     // Catch:{ all -> 0x01c7 }
            r0.getMax(r11)     // Catch:{ all -> 0x01c7 }
            r0.getMax(r4)     // Catch:{ all -> 0x01c7 }
            java.lang.Object r3 = r0.toIntRange     // Catch:{ all -> 0x01c7 }
            o.DefaultExtensionRegistry r3 = (o.DefaultExtensionRegistry) r3     // Catch:{ all -> 0x01c7 }
            o.getExtensionMetaInfos r3 = r3.createQrPayData()     // Catch:{ all -> 0x01c7 }
            r0.IsOverlapping = r3     // Catch:{ all -> 0x01c7 }
        L_0x0181:
            r0.getMax(r5)     // Catch:{ all -> 0x01c7 }
            goto L_0x01c4
        L_0x0185:
            r0.getMax = r7     // Catch:{ all -> 0x01c7 }
            r0.getMax(r11)     // Catch:{ all -> 0x01c7 }
            r0.getMax(r4)     // Catch:{ all -> 0x01c7 }
            java.lang.Object r3 = r0.toIntRange     // Catch:{ all -> 0x01c7 }
            o.getExtensionMetaInfos r3 = (o.getExtensionMetaInfos) r3     // Catch:{ all -> 0x01c7 }
            r0.getMax(r4)     // Catch:{ all -> 0x01c7 }
            java.lang.Object r9 = r0.toIntRange     // Catch:{ all -> 0x01c7 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01c7 }
            r0.getMax(r4)     // Catch:{ all -> 0x01c7 }
            java.lang.Object r10 = r0.toIntRange     // Catch:{ all -> 0x01c7 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x01c7 }
            r0.getMax(r8)     // Catch:{ all -> 0x01c7 }
            int r8 = r0.length     // Catch:{ all -> 0x01c7 }
            o.TitleBarRightButtonView$1 r3 = r3.setSeedExtra(r9, r10, r8)     // Catch:{ all -> 0x01c7 }
            r0.IsOverlapping = r3     // Catch:{ all -> 0x01c7 }
            goto L_0x0181
        L_0x01ab:
            r3 = 1
            goto L_0x0118
        L_0x01ae:
            r3 = 4
            goto L_0x0118
        L_0x01b1:
            r0.getMax(r15)     // Catch:{ all -> 0x01c7 }
            int r14 = r0.length     // Catch:{ all -> 0x01c7 }
            r15 = 28
            r3 = 38
            if (r14 == r15) goto L_0x01be
            goto L_0x0118
        L_0x01be:
            r14 = 25
            r3 = 25
            goto L_0x0118
        L_0x01c4:
            r3 = r14
            goto L_0x0118
        L_0x01c7:
            r3 = move-exception
            r5 = 3615(0xe1f, float:5.066E-42)
            short r5 = (short) r5
            r8 = 380(0x17c, float:5.32E-43)
            short r8 = (short) r8
            byte[] r9 = setMax
            byte r9 = r9[r6]
            int r9 = -r9
            byte r9 = (byte) r9
            java.lang.String r5 = setMin(r5, r8, r9)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r3)
            if (r5 == 0) goto L_0x01e8
            if (r14 < r7) goto L_0x01e8
            r5 = 5
            if (r14 > r5) goto L_0x01e8
            goto L_0x0256
        L_0x01e8:
            int r5 = setMin
            r5 = r5 | 5438(0x153e, float:7.62E-42)
            short r5 = (short) r5
            r8 = 379(0x17b, float:5.31E-43)
            short r8 = (short) r8
            byte[] r9 = setMax
            byte r9 = r9[r6]
            int r9 = -r9
            byte r9 = (byte) r9
            java.lang.String r5 = setMin(r5, r8, r9)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r3)
            if (r5 == 0) goto L_0x020b
            r5 = 17
            if (r14 < r5) goto L_0x020b
            if (r14 > r4) goto L_0x020b
            goto L_0x0256
        L_0x020b:
            byte[] r4 = setMax
            r5 = 2117(0x845, float:2.967E-42)
            byte r5 = r4[r5]
            short r5 = (short) r5
            r8 = r5 | 353(0x161, float:4.95E-43)
            short r8 = (short) r8
            byte r4 = r4[r6]
            int r4 = -r4
            byte r4 = (byte) r4
            java.lang.String r4 = setMin(r5, r8, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r3)
            if (r4 == 0) goto L_0x0232
            r4 = 29
            if (r14 < r4) goto L_0x0232
            r4 = 30
            if (r14 > r4) goto L_0x0232
            r14 = 3
            r15 = 3
            goto L_0x0256
        L_0x0232:
            int r4 = setMin
            r4 = r4 | 5194(0x144a, float:7.278E-42)
            short r4 = (short) r4
            r5 = 375(0x177, float:5.25E-43)
            short r5 = (short) r5
            byte[] r8 = setMax
            byte r8 = r8[r6]
            int r8 = -r8
            byte r8 = (byte) r8
            java.lang.String r4 = setMin(r4, r5, r8)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r3)
            if (r4 == 0) goto L_0x0260
            r4 = 41
            if (r14 < r4) goto L_0x0260
            r4 = 42
            if (r14 > r4) goto L_0x0260
        L_0x0256:
            r0.IsOverlapping = r3
            r14 = 26
            r0.getMax(r14)
            r3 = r15
            goto L_0x0118
        L_0x0260:
            throw r3
        L_0x0261:
            r14 = move-exception
            java.lang.Throwable r15 = r14.getCause()
            if (r15 == 0) goto L_0x0269
            throw r15
        L_0x0269:
            goto L_0x026b
        L_0x026a:
            throw r14
        L_0x026b:
            goto L_0x026a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.lambda$setSeedExtra$8(java.lang.String, java.lang.String):o.TitleBarRightButtonView$4");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ o.TitleBarRightButtonView.AnonymousClass4 lambda$start$6(java.lang.String r15) throws java.lang.Exception {
        /*
            r14 = this;
            o.PointToExtensionRegistry r0 = new o.PointToExtensionRegistry
            r0.<init>(r14, r15)
            int r15 = setMin
            r1 = r15 | 807(0x327, float:1.131E-42)
            short r1 = (short) r1
            r15 = r15 | 114(0x72, float:1.6E-43)
            short r15 = (short) r15
            r2 = 73
            byte r2 = (byte) r2
            java.lang.String r15 = setMin(r1, r15, r2)
            int r1 = setMin
            r1 = r1 | 351(0x15f, float:4.92E-43)
            short r1 = (short) r1
            r2 = r1 & 1977(0x7b9, float:2.77E-42)
            short r2 = (short) r2
            r3 = 74
            byte r3 = (byte) r3
            java.lang.String r1 = setMin(r1, r2, r3)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0279 }
            r4 = 0
            r3[r4] = r1     // Catch:{ all -> 0x0279 }
            r1 = 1282(0x502, float:1.796E-42)
            short r1 = (short) r1     // Catch:{ all -> 0x0279 }
            int r5 = setMin     // Catch:{ all -> 0x0279 }
            r5 = r5 | 266(0x10a, float:3.73E-43)
            short r5 = (short) r5     // Catch:{ all -> 0x0279 }
            byte[] r6 = setMax     // Catch:{ all -> 0x0279 }
            r7 = 22
            byte r6 = r6[r7]     // Catch:{ all -> 0x0279 }
            int r6 = -r6
            byte r6 = (byte) r6     // Catch:{ all -> 0x0279 }
            java.lang.String r5 = setMin(r1, r5, r6)     // Catch:{ all -> 0x0279 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0279 }
            r6 = 2363(0x93b, float:3.311E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x0279 }
            int r8 = setMin     // Catch:{ all -> 0x0279 }
            r8 = r8 | 277(0x115, float:3.88E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x0279 }
            byte[] r9 = setMax     // Catch:{ all -> 0x0279 }
            r10 = 21
            byte r9 = r9[r10]     // Catch:{ all -> 0x0279 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0279 }
            java.lang.String r6 = setMin(r6, r8, r9)     // Catch:{ all -> 0x0279 }
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ all -> 0x0279 }
            int r9 = setMin     // Catch:{ all -> 0x0279 }
            r9 = r9 | 266(0x10a, float:3.73E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x0279 }
            byte[] r10 = setMax     // Catch:{ all -> 0x0279 }
            byte r10 = r10[r7]     // Catch:{ all -> 0x0279 }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x0279 }
            java.lang.String r9 = setMin(r1, r9, r10)     // Catch:{ all -> 0x0279 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0279 }
            r8[r4] = r9     // Catch:{ all -> 0x0279 }
            java.lang.reflect.Method r5 = r5.getMethod(r6, r8)     // Catch:{ all -> 0x0279 }
            java.lang.Object r15 = r5.invoke(r15, r3)     // Catch:{ all -> 0x0279 }
            java.lang.Object[] r15 = (java.lang.Object[]) r15     // Catch:{ all -> 0x0279 }
            int r3 = r15.length
            int[] r3 = new int[r3]
            r5 = 0
        L_0x0079:
            int r6 = r15.length
            r8 = 4
            if (r5 >= r6) goto L_0x011a
            r6 = r15[r5]
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ all -> 0x0111 }
            r9[r4] = r6     // Catch:{ all -> 0x0111 }
            r6 = 3658(0xe4a, float:5.126E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x0111 }
            int r10 = setMin     // Catch:{ all -> 0x0111 }
            r10 = r10 | 265(0x109, float:3.71E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0111 }
            byte[] r11 = setMax     // Catch:{ all -> 0x0111 }
            byte r11 = r11[r7]     // Catch:{ all -> 0x0111 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0111 }
            java.lang.String r10 = setMin(r6, r10, r11)     // Catch:{ all -> 0x0111 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0111 }
            int r11 = setMin     // Catch:{ all -> 0x0111 }
            r11 = r11 | 602(0x25a, float:8.44E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0111 }
            int r12 = setMin     // Catch:{ all -> 0x0111 }
            r12 = r12 | 275(0x113, float:3.85E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0111 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0111 }
            byte r8 = r13[r8]     // Catch:{ all -> 0x0111 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x0111 }
            java.lang.String r8 = setMin(r11, r12, r8)     // Catch:{ all -> 0x0111 }
            java.lang.Class[] r11 = new java.lang.Class[r2]     // Catch:{ all -> 0x0111 }
            int r12 = setMin     // Catch:{ all -> 0x0111 }
            r12 = r12 | 266(0x10a, float:3.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0111 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0111 }
            byte r13 = r13[r7]     // Catch:{ all -> 0x0111 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0111 }
            java.lang.String r12 = setMin(r1, r12, r13)     // Catch:{ all -> 0x0111 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0111 }
            r11[r4] = r12     // Catch:{ all -> 0x0111 }
            java.lang.reflect.Method r8 = r10.getMethod(r8, r11)     // Catch:{ all -> 0x0111 }
            r10 = 0
            java.lang.Object r8 = r8.invoke(r10, r9)     // Catch:{ all -> 0x0111 }
            int r9 = setMin     // Catch:{ all -> 0x0108 }
            r9 = r9 | 265(0x109, float:3.71E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x0108 }
            byte[] r11 = setMax     // Catch:{ all -> 0x0108 }
            byte r11 = r11[r7]     // Catch:{ all -> 0x0108 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0108 }
            java.lang.String r6 = setMin(r6, r9, r11)     // Catch:{ all -> 0x0108 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x0108 }
            int r9 = setMin     // Catch:{ all -> 0x0108 }
            r9 = r9 | 596(0x254, float:8.35E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x0108 }
            int r11 = setMin     // Catch:{ all -> 0x0108 }
            r11 = r11 | 274(0x112, float:3.84E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0108 }
            byte[] r12 = setMax     // Catch:{ all -> 0x0108 }
            r13 = 5678(0x162e, float:7.957E-42)
            byte r12 = r12[r13]     // Catch:{ all -> 0x0108 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0108 }
            java.lang.String r9 = setMin(r9, r11, r12)     // Catch:{ all -> 0x0108 }
            java.lang.reflect.Method r6 = r6.getMethod(r9, r10)     // Catch:{ all -> 0x0108 }
            java.lang.Object r6 = r6.invoke(r8, r10)     // Catch:{ all -> 0x0108 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0108 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0108 }
            r3[r5] = r6
            int r5 = r5 + 1
            goto L_0x0079
        L_0x0108:
            r15 = move-exception
            java.lang.Throwable r0 = r15.getCause()
            if (r0 == 0) goto L_0x0110
            throw r0
        L_0x0110:
            throw r15
        L_0x0111:
            r15 = move-exception
            java.lang.Throwable r0 = r15.getCause()
            if (r0 == 0) goto L_0x0119
            throw r0
        L_0x0119:
            throw r15
        L_0x011a:
            r15 = 42
            r1 = 51
            r5 = 15
        L_0x0120:
            int r6 = r4 + 1
            r9 = 12
            r4 = r3[r4]     // Catch:{ all -> 0x01c1 }
            int r4 = r0.getMax(r4)     // Catch:{ all -> 0x01c1 }
            r10 = 19
            r11 = 11
            r12 = 18
            r13 = 10
            switch(r4) {
                case -15: goto L_0x01bb;
                case -14: goto L_0x01b7;
                case -13: goto L_0x01ac;
                case -12: goto L_0x01a8;
                case -11: goto L_0x019d;
                case -10: goto L_0x0190;
                case -9: goto L_0x0188;
                case -8: goto L_0x0185;
                case -7: goto L_0x0182;
                case -6: goto L_0x0162;
                case -5: goto L_0x014c;
                case -4: goto L_0x0149;
                case -3: goto L_0x0141;
                case -2: goto L_0x0139;
                case -1: goto L_0x0137;
                default: goto L_0x0135;
            }     // Catch:{ all -> 0x01c1 }
        L_0x0135:
            goto L_0x01be
        L_0x0137:
            r4 = 4
            goto L_0x0120
        L_0x0139:
            r0.getMax(r5)     // Catch:{ all -> 0x01c1 }
            java.lang.Object r4 = r0.toIntRange     // Catch:{ all -> 0x01c1 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x01c1 }
            throw r4     // Catch:{ all -> 0x01c1 }
        L_0x0141:
            r0.getMax(r5)     // Catch:{ all -> 0x01c1 }
            java.lang.Object r4 = r0.toIntRange     // Catch:{ all -> 0x01c1 }
            o.TitleBarRightButtonView$4 r4 = (o.TitleBarRightButtonView.AnonymousClass4) r4     // Catch:{ all -> 0x01c1 }
            return r4
        L_0x0149:
            r4 = 15
            goto L_0x0120
        L_0x014c:
            r0.getMax = r2     // Catch:{ all -> 0x01c1 }
            r0.getMax(r13)     // Catch:{ all -> 0x01c1 }
            r0.getMax(r12)     // Catch:{ all -> 0x01c1 }
            java.lang.Object r4 = r0.toIntRange     // Catch:{ all -> 0x01c1 }
            o.DefaultExtensionRegistry r4 = (o.DefaultExtensionRegistry) r4     // Catch:{ all -> 0x01c1 }
            o.getExtensionMetaInfos r4 = r4.createQrPayData()     // Catch:{ all -> 0x01c1 }
            r0.IsOverlapping = r4     // Catch:{ all -> 0x01c1 }
        L_0x015e:
            r0.getMax(r10)     // Catch:{ all -> 0x01c1 }
            goto L_0x01be
        L_0x0162:
            r4 = 3
            r0.getMax = r4     // Catch:{ all -> 0x01c1 }
            r0.getMax(r13)     // Catch:{ all -> 0x01c1 }
            r0.getMax(r12)     // Catch:{ all -> 0x01c1 }
            java.lang.Object r4 = r0.toIntRange     // Catch:{ all -> 0x01c1 }
            o.getExtensionMetaInfos r4 = (o.getExtensionMetaInfos) r4     // Catch:{ all -> 0x01c1 }
            r0.getMax(r12)     // Catch:{ all -> 0x01c1 }
            java.lang.Object r12 = r0.toIntRange     // Catch:{ all -> 0x01c1 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x01c1 }
            r0.getMax(r11)     // Catch:{ all -> 0x01c1 }
            int r11 = r0.length     // Catch:{ all -> 0x01c1 }
            o.TitleBarRightButtonView$1 r4 = r4.start(r12, r11)     // Catch:{ all -> 0x01c1 }
            r0.IsOverlapping = r4     // Catch:{ all -> 0x01c1 }
            goto L_0x015e
        L_0x0182:
            r4 = 42
            goto L_0x0120
        L_0x0185:
            r4 = 8
            goto L_0x0120
        L_0x0188:
            int r4 = getMin     // Catch:{ all -> 0x01c1 }
            r0.getMax = r4     // Catch:{ all -> 0x01c1 }
            r0.getMax(r2)     // Catch:{ all -> 0x01c1 }
            goto L_0x01be
        L_0x0190:
            r0.getMax = r2     // Catch:{ all -> 0x01c1 }
            r0.getMax(r13)     // Catch:{ all -> 0x01c1 }
            r0.getMax(r11)     // Catch:{ all -> 0x01c1 }
            int r4 = r0.length     // Catch:{ all -> 0x01c1 }
            length = r4     // Catch:{ all -> 0x01c1 }
            goto L_0x01be
        L_0x019d:
            r0.getMax(r9)     // Catch:{ all -> 0x01c1 }
            int r4 = r0.length     // Catch:{ all -> 0x01c1 }
            if (r4 != 0) goto L_0x01be
            r4 = 40
            goto L_0x0120
        L_0x01a8:
            r4 = 14
            goto L_0x0120
        L_0x01ac:
            r0.getMax(r9)     // Catch:{ all -> 0x01c1 }
            int r4 = r0.length     // Catch:{ all -> 0x01c1 }
            if (r4 != 0) goto L_0x01be
            r4 = 50
            goto L_0x0120
        L_0x01b7:
            r4 = 51
            goto L_0x0120
        L_0x01bb:
            r4 = 2
            goto L_0x0120
        L_0x01be:
            r4 = r6
            goto L_0x0120
        L_0x01c1:
            r4 = move-exception
            r10 = 534(0x216, float:7.48E-43)
            short r10 = (short) r10
            r11 = 379(0x17b, float:5.31E-43)
            short r11 = (short) r11
            byte[] r12 = setMax
            byte r12 = r12[r7]
            int r12 = -r12
            byte r12 = (byte) r12
            java.lang.String r10 = setMin(r10, r11, r12)
            java.lang.Class r10 = java.lang.Class.forName(r10)
            boolean r10 = r10.isInstance(r4)
            r12 = 41
            if (r10 == 0) goto L_0x01e6
            if (r6 < r9) goto L_0x01e6
            r9 = 13
            if (r6 > r9) goto L_0x01e6
            goto L_0x026e
        L_0x01e6:
            int r9 = setMin
            r9 = r9 | 5438(0x153e, float:7.62E-42)
            short r9 = (short) r9
            byte[] r10 = setMax
            byte r10 = r10[r7]
            int r10 = -r10
            byte r10 = (byte) r10
            java.lang.String r9 = setMin(r9, r11, r10)
            java.lang.Class r9 = java.lang.Class.forName(r9)
            boolean r9 = r9.isInstance(r4)
            if (r9 == 0) goto L_0x0205
            if (r6 < r5) goto L_0x0205
            if (r6 > r12) goto L_0x0205
        L_0x0203:
            r12 = 1
            goto L_0x026e
        L_0x0205:
            r9 = 3642(0xe3a, float:5.104E-42)
            short r9 = (short) r9
            r10 = 382(0x17e, float:5.35E-43)
            short r10 = (short) r10
            byte[] r11 = setMax
            byte r11 = r11[r7]
            int r11 = -r11
            byte r11 = (byte) r11
            java.lang.String r9 = setMin(r9, r10, r11)
            java.lang.Class r9 = java.lang.Class.forName(r9)
            boolean r9 = r9.isInstance(r4)
            if (r9 == 0) goto L_0x0228
            r9 = 35
            if (r6 < r9) goto L_0x0228
            r9 = 36
            if (r6 > r9) goto L_0x0228
            goto L_0x0203
        L_0x0228:
            byte[] r9 = setMax
            r10 = 2117(0x845, float:2.967E-42)
            byte r10 = r9[r10]
            short r10 = (short) r10
            r11 = r10 | 353(0x161, float:4.95E-43)
            short r11 = (short) r11
            byte r9 = r9[r7]
            int r9 = -r9
            byte r9 = (byte) r9
            java.lang.String r9 = setMin(r10, r11, r9)
            java.lang.Class r9 = java.lang.Class.forName(r9)
            boolean r9 = r9.isInstance(r4)
            if (r9 == 0) goto L_0x024b
            if (r6 < r15) goto L_0x024b
            r9 = 43
            if (r6 > r9) goto L_0x024b
            goto L_0x0203
        L_0x024b:
            int r9 = setMin
            r9 = r9 | 5194(0x144a, float:7.278E-42)
            short r9 = (short) r9
            r10 = 375(0x177, float:5.25E-43)
            short r10 = (short) r10
            byte[] r11 = setMax
            byte r11 = r11[r7]
            int r11 = -r11
            byte r11 = (byte) r11
            java.lang.String r9 = setMin(r9, r10, r11)
            java.lang.Class r9 = java.lang.Class.forName(r9)
            boolean r9 = r9.isInstance(r4)
            if (r9 == 0) goto L_0x0278
            r9 = 45
            if (r6 < r9) goto L_0x0278
            if (r6 > r1) goto L_0x0278
            goto L_0x0203
        L_0x026e:
            r0.IsOverlapping = r4
            r4 = 26
            r0.getMax(r4)
            r4 = r12
            goto L_0x0120
        L_0x0278:
            throw r4
        L_0x0279:
            r15 = move-exception
            java.lang.Throwable r0 = r15.getCause()
            if (r0 == 0) goto L_0x0281
            throw r0
        L_0x0281:
            goto L_0x0283
        L_0x0282:
            throw r15
        L_0x0283:
            goto L_0x0282
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.lambda$start$6(java.lang.String):o.TitleBarRightButtonView$4");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(int r7, short r8, byte r9) {
        /*
            int r9 = 118 - r9
            int r8 = 410 - r8
            byte[] r0 = setMax
            int r7 = 5723 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L_0x0011
            r4 = 0
            r3 = r7
            r9 = r8
            goto L_0x0024
        L_0x0011:
            r3 = 0
        L_0x0012:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L_0x001f
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L_0x001f:
            byte r3 = r0[r7]
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x0024:
            int r7 = r7 + 1
            int r8 = r8 + r3
            int r8 = r8 + 4
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.setMin(int, short, byte):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0167, code lost:
        r1.getMax(19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01a0, code lost:
        r1.getMax(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.TitleBarRightButtonView.AnonymousClass1<java.lang.Boolean> getOtpInitResult() {
        /*
            r19 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r19
            r1.<init>(r2)
            int r0 = setMin
            r0 = r0 | 1552(0x610, float:2.175E-42)
            short r0 = (short) r0
            byte[] r3 = setMax
            r4 = 2122(0x84a, float:2.974E-42)
            byte r3 = r3[r4]
            short r3 = (short) r3
            r4 = 73
            byte r4 = (byte) r4
            java.lang.String r0 = setMin(r0, r3, r4)
            int r3 = setMin
            r3 = r3 | 351(0x15f, float:4.92E-43)
            short r3 = (short) r3
            r4 = r3 & 1977(0x7b9, float:2.77E-42)
            short r4 = (short) r4
            r5 = 74
            byte r6 = (byte) r5
            java.lang.String r3 = setMin(r3, r4, r6)
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x03cd }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x03cd }
            r3 = 1282(0x502, float:1.796E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x03cd }
            int r8 = setMin     // Catch:{ all -> 0x03cd }
            r8 = r8 | 266(0x10a, float:3.73E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x03cd }
            byte[] r9 = setMax     // Catch:{ all -> 0x03cd }
            r10 = 22
            byte r9 = r9[r10]     // Catch:{ all -> 0x03cd }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x03cd }
            java.lang.String r8 = setMin(r3, r8, r9)     // Catch:{ all -> 0x03cd }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x03cd }
            r9 = 2363(0x93b, float:3.311E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x03cd }
            int r11 = setMin     // Catch:{ all -> 0x03cd }
            r11 = r11 | 277(0x115, float:3.88E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x03cd }
            byte[] r12 = setMax     // Catch:{ all -> 0x03cd }
            r13 = 21
            byte r12 = r12[r13]     // Catch:{ all -> 0x03cd }
            byte r12 = (byte) r12     // Catch:{ all -> 0x03cd }
            java.lang.String r9 = setMin(r9, r11, r12)     // Catch:{ all -> 0x03cd }
            java.lang.Class[] r11 = new java.lang.Class[r4]     // Catch:{ all -> 0x03cd }
            int r12 = setMin     // Catch:{ all -> 0x03cd }
            r12 = r12 | 266(0x10a, float:3.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x03cd }
            byte[] r13 = setMax     // Catch:{ all -> 0x03cd }
            byte r13 = r13[r10]     // Catch:{ all -> 0x03cd }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x03cd }
            java.lang.String r12 = setMin(r3, r12, r13)     // Catch:{ all -> 0x03cd }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x03cd }
            r11[r7] = r12     // Catch:{ all -> 0x03cd }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r11)     // Catch:{ all -> 0x03cd }
            java.lang.Object r0 = r8.invoke(r0, r6)     // Catch:{ all -> 0x03cd }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x03cd }
            int r6 = r0.length
            int[] r6 = new int[r6]
            r8 = 0
        L_0x007f:
            int r9 = r0.length
            r11 = 4
            if (r8 >= r9) goto L_0x0122
            r9 = r0[r8]
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ all -> 0x0119 }
            r12[r7] = r9     // Catch:{ all -> 0x0119 }
            r9 = 3658(0xe4a, float:5.126E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0119 }
            int r13 = setMin     // Catch:{ all -> 0x0119 }
            r13 = r13 | 265(0x109, float:3.71E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0119 }
            byte[] r14 = setMax     // Catch:{ all -> 0x0119 }
            byte r14 = r14[r10]     // Catch:{ all -> 0x0119 }
            int r14 = -r14
            byte r14 = (byte) r14     // Catch:{ all -> 0x0119 }
            java.lang.String r13 = setMin(r9, r13, r14)     // Catch:{ all -> 0x0119 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0119 }
            int r14 = setMin     // Catch:{ all -> 0x0119 }
            r14 = r14 | 602(0x25a, float:8.44E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0119 }
            int r15 = setMin     // Catch:{ all -> 0x0119 }
            r15 = r15 | 275(0x113, float:3.85E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0119 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0119 }
            byte r11 = r16[r11]     // Catch:{ all -> 0x0119 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0119 }
            java.lang.String r11 = setMin(r14, r15, r11)     // Catch:{ all -> 0x0119 }
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x0119 }
            int r15 = setMin     // Catch:{ all -> 0x0119 }
            r15 = r15 | 266(0x10a, float:3.73E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0119 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0119 }
            byte r5 = r16[r10]     // Catch:{ all -> 0x0119 }
            int r5 = -r5
            byte r5 = (byte) r5     // Catch:{ all -> 0x0119 }
            java.lang.String r5 = setMin(r3, r15, r5)     // Catch:{ all -> 0x0119 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0119 }
            r14[r7] = r5     // Catch:{ all -> 0x0119 }
            java.lang.reflect.Method r5 = r13.getMethod(r11, r14)     // Catch:{ all -> 0x0119 }
            r11 = 0
            java.lang.Object r5 = r5.invoke(r11, r12)     // Catch:{ all -> 0x0119 }
            int r12 = setMin     // Catch:{ all -> 0x0110 }
            r12 = r12 | 265(0x109, float:3.71E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0110 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0110 }
            byte r13 = r13[r10]     // Catch:{ all -> 0x0110 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0110 }
            java.lang.String r9 = setMin(r9, r12, r13)     // Catch:{ all -> 0x0110 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0110 }
            int r12 = setMin     // Catch:{ all -> 0x0110 }
            r12 = r12 | 596(0x254, float:8.35E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0110 }
            int r13 = setMin     // Catch:{ all -> 0x0110 }
            r13 = r13 | 274(0x112, float:3.84E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0110 }
            byte[] r14 = setMax     // Catch:{ all -> 0x0110 }
            r15 = 5678(0x162e, float:7.957E-42)
            byte r14 = r14[r15]     // Catch:{ all -> 0x0110 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0110 }
            java.lang.String r12 = setMin(r12, r13, r14)     // Catch:{ all -> 0x0110 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r11)     // Catch:{ all -> 0x0110 }
            java.lang.Object r5 = r9.invoke(r5, r11)     // Catch:{ all -> 0x0110 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0110 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0110 }
            r6[r8] = r5
            int r8 = r8 + 1
            r5 = 74
            goto L_0x007f
        L_0x0110:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0118
            throw r1
        L_0x0118:
            throw r0
        L_0x0119:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0121
            throw r1
        L_0x0121:
            throw r0
        L_0x0122:
            r3 = 17
            r8 = 86
            r9 = 11
        L_0x0128:
            int r12 = r7 + 1
            r13 = 15
            r14 = 77
            r0 = r6[r7]     // Catch:{ all -> 0x023f }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x023f }
            r7 = 19
            r15 = 18
            r5 = 10
            switch(r0) {
                case -27: goto L_0x0238;
                case -26: goto L_0x0235;
                case -25: goto L_0x0231;
                case -24: goto L_0x0222;
                case -23: goto L_0x021e;
                case -22: goto L_0x021a;
                case -21: goto L_0x020d;
                case -20: goto L_0x0200;
                case -19: goto L_0x01fb;
                case -18: goto L_0x01e8;
                case -17: goto L_0x01e4;
                case -16: goto L_0x01c9;
                case -15: goto L_0x01c6;
                case -14: goto L_0x01c2;
                case -13: goto L_0x01b3;
                case -12: goto L_0x01a5;
                case -11: goto L_0x019c;
                case -10: goto L_0x0194;
                case -9: goto L_0x0192;
                case -8: goto L_0x018a;
                case -7: goto L_0x0187;
                case -6: goto L_0x0184;
                case -5: goto L_0x017f;
                case -4: goto L_0x016c;
                case -3: goto L_0x0155;
                case -2: goto L_0x0142;
                case -1: goto L_0x013f;
                default: goto L_0x013d;
            }     // Catch:{ all -> 0x023f }
        L_0x013d:
            goto L_0x023c
        L_0x013f:
            r7 = 108(0x6c, float:1.51E-43)
            goto L_0x0128
        L_0x0142:
            r0 = 34
            r1.getMax(r0)     // Catch:{ all -> 0x023f }
            int r0 = r1.length     // Catch:{ all -> 0x023f }
            if (r0 == 0) goto L_0x0150
            r0 = 9
            r7 = 9
            goto L_0x0128
        L_0x0150:
            r0 = 82
            r7 = 82
            goto L_0x0128
        L_0x0155:
            r1.getMax = r4     // Catch:{ all -> 0x023f }
            r1.getMax(r5)     // Catch:{ all -> 0x023f }
            r1.getMax(r15)     // Catch:{ all -> 0x023f }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x023f }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x023f }
            o.getExtensionMetaInfos r0 = r0.createQrPayData()     // Catch:{ all -> 0x023f }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x023f }
        L_0x0167:
            r1.getMax(r7)     // Catch:{ all -> 0x023f }
            goto L_0x023c
        L_0x016c:
            r1.getMax = r4     // Catch:{ all -> 0x023f }
            r1.getMax(r5)     // Catch:{ all -> 0x023f }
            r1.getMax(r15)     // Catch:{ all -> 0x023f }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x023f }
            o.getExtensionMetaInfos r0 = (o.getExtensionMetaInfos) r0     // Catch:{ all -> 0x023f }
            o.TitleBarRightButtonView$1 r0 = r0.getOtpInitResult()     // Catch:{ all -> 0x023f }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x023f }
            goto L_0x0167
        L_0x017f:
            o.ExtensionRegistry r0 = o.ExtensionRegistry.setMin     // Catch:{ all -> 0x023f }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x023f }
            goto L_0x0167
        L_0x0184:
            r7 = 86
            goto L_0x0128
        L_0x0187:
            r7 = 49
            goto L_0x0128
        L_0x018a:
            r1.getMax(r13)     // Catch:{ all -> 0x023f }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x023f }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x023f }
            return r0
        L_0x0192:
            r7 = 1
            goto L_0x0128
        L_0x0194:
            r1.getMax(r13)     // Catch:{ all -> 0x023f }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x023f }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x023f }
            throw r0     // Catch:{ all -> 0x023f }
        L_0x019c:
            int r0 = length     // Catch:{ all -> 0x023f }
            r1.getMax = r0     // Catch:{ all -> 0x023f }
        L_0x01a0:
            r1.getMax(r4)     // Catch:{ all -> 0x023f }
            goto L_0x023c
        L_0x01a5:
            r1.getMax = r4     // Catch:{ all -> 0x023f }
            r1.getMax(r5)     // Catch:{ all -> 0x023f }
            r1.getMax(r9)     // Catch:{ all -> 0x023f }
            int r0 = r1.length     // Catch:{ all -> 0x023f }
            getMin = r0     // Catch:{ all -> 0x023f }
            goto L_0x023c
        L_0x01b3:
            r0 = 68
            r1.getMax(r0)     // Catch:{ all -> 0x023f }
            int r0 = r1.length     // Catch:{ all -> 0x023f }
            if (r0 != 0) goto L_0x023c
            r0 = 45
            r7 = 45
            goto L_0x0128
        L_0x01c2:
            r7 = 81
            goto L_0x0128
        L_0x01c6:
            r7 = 2
            goto L_0x0128
        L_0x01c9:
            r0 = 2
            r1.getMax = r0     // Catch:{ all -> 0x023f }
            r1.getMax(r5)     // Catch:{ all -> 0x023f }
            r1.getMax(r15)     // Catch:{ all -> 0x023f }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x023f }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x023f }
            r1.getMax(r15)     // Catch:{ all -> 0x023f }
            java.lang.Object r5 = r1.toIntRange     // Catch:{ all -> 0x023f }
            o.RedDotDrawable r5 = (o.RedDotDrawable) r5     // Catch:{ all -> 0x023f }
            o.TitleBarRightButtonView$1 r0 = r0.map(r5)     // Catch:{ all -> 0x023f }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x023f }
            goto L_0x0167
        L_0x01e4:
            r7 = 50
            goto L_0x0128
        L_0x01e8:
            r0 = 34
            r1.getMax(r0)     // Catch:{ all -> 0x023f }
            int r0 = r1.length     // Catch:{ all -> 0x023f }
            if (r0 == 0) goto L_0x01f5
            r7 = 77
            goto L_0x0128
        L_0x01f5:
            r0 = 47
            r7 = 47
            goto L_0x0128
        L_0x01fb:
            int r0 = getMin     // Catch:{ all -> 0x023f }
            r1.getMax = r0     // Catch:{ all -> 0x023f }
            goto L_0x01a0
        L_0x0200:
            r1.getMax = r4     // Catch:{ all -> 0x023f }
            r1.getMax(r5)     // Catch:{ all -> 0x023f }
            r1.getMax(r9)     // Catch:{ all -> 0x023f }
            int r0 = r1.length     // Catch:{ all -> 0x023f }
            length = r0     // Catch:{ all -> 0x023f }
            goto L_0x023c
        L_0x020d:
            r0 = 12
            r1.getMax(r0)     // Catch:{ all -> 0x023f }
            int r0 = r1.length     // Catch:{ all -> 0x023f }
            if (r0 != 0) goto L_0x023c
            r7 = 74
            goto L_0x0128
        L_0x021a:
            r7 = 13
            goto L_0x0128
        L_0x021e:
            r7 = 75
            goto L_0x0128
        L_0x0222:
            r0 = 68
            r1.getMax(r0)     // Catch:{ all -> 0x023f }
            int r0 = r1.length     // Catch:{ all -> 0x023f }
            if (r0 != 0) goto L_0x023c
            r0 = 107(0x6b, float:1.5E-43)
            r7 = 107(0x6b, float:1.5E-43)
            goto L_0x0128
        L_0x0231:
            r7 = 11
            goto L_0x0128
        L_0x0235:
            r7 = 7
            goto L_0x0128
        L_0x0238:
            r7 = 17
            goto L_0x0128
        L_0x023c:
            r7 = r12
            goto L_0x0128
        L_0x023f:
            r0 = move-exception
            r5 = 534(0x216, float:7.48E-43)
            short r5 = (short) r5
            r7 = 379(0x17b, float:5.31E-43)
            short r7 = (short) r7
            byte[] r15 = setMax
            byte r15 = r15[r10]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r15 = setMin(r5, r7, r15)
            java.lang.Class r15 = java.lang.Class.forName(r15)
            boolean r15 = r15.isInstance(r0)
            r4 = 46
            r17 = 16
            if (r15 == 0) goto L_0x0269
            if (r12 < r11) goto L_0x0269
            r15 = 7
            if (r12 > r15) goto L_0x0269
        L_0x0263:
            r4 = 108(0x6c, float:1.51E-43)
        L_0x0265:
            r7 = 16
            goto L_0x03bf
        L_0x0269:
            int r15 = setMin
            r9 = r15 | 97
            short r9 = (short) r9
            r15 = r15 | 263(0x107, float:3.69E-43)
            short r15 = (short) r15
            byte[] r18 = setMax
            byte r11 = r18[r10]
            int r11 = -r11
            byte r11 = (byte) r11
            java.lang.String r9 = setMin(r9, r15, r11)
            java.lang.Class r9 = java.lang.Class.forName(r9)
            boolean r9 = r9.isInstance(r0)
            if (r9 == 0) goto L_0x028c
            r9 = 5
            if (r12 < r9) goto L_0x028c
            r9 = 6
            if (r12 > r9) goto L_0x028c
            goto L_0x0263
        L_0x028c:
            int r9 = setMin
            r9 = r9 | 5194(0x144a, float:7.278E-42)
            short r9 = (short) r9
            r11 = 375(0x177, float:5.25E-43)
            short r11 = (short) r11
            byte[] r15 = setMax
            byte r15 = r15[r10]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r9 = setMin(r9, r11, r15)
            java.lang.Class r9 = java.lang.Class.forName(r9)
            boolean r9 = r9.isInstance(r0)
            if (r9 == 0) goto L_0x02ad
            if (r12 < r3) goto L_0x02ad
            if (r12 > r4) goto L_0x02ad
            goto L_0x0263
        L_0x02ad:
            byte[] r9 = setMax
            byte r9 = r9[r10]
            int r9 = -r9
            byte r9 = (byte) r9
            java.lang.String r5 = setMin(r5, r7, r9)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x02c8
            r5 = 40
            if (r12 < r5) goto L_0x02c8
            if (r12 > r4) goto L_0x02c8
            goto L_0x0263
        L_0x02c8:
            int r5 = setMin
            r5 = r5 | 5438(0x153e, float:7.62E-42)
            short r5 = (short) r5
            byte[] r9 = setMax
            byte r9 = r9[r10]
            int r9 = -r9
            byte r9 = (byte) r9
            java.lang.String r5 = setMin(r5, r7, r9)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x02eb
            r5 = 47
            if (r12 < r5) goto L_0x02eb
            r5 = 49
            if (r12 > r5) goto L_0x02eb
            goto L_0x0263
        L_0x02eb:
            byte[] r5 = setMax
            r7 = 2117(0x845, float:2.967E-42)
            byte r9 = r5[r7]
            short r9 = (short) r9
            r11 = r9 | 353(0x161, float:4.95E-43)
            short r11 = (short) r11
            byte r5 = r5[r10]
            int r5 = -r5
            byte r5 = (byte) r5
            java.lang.String r5 = setMin(r9, r11, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0315
            r5 = 50
            if (r12 < r5) goto L_0x0315
            r5 = 51
            if (r12 > r5) goto L_0x0315
            r4 = 108(0x6c, float:1.51E-43)
            r7 = 15
            goto L_0x03bf
        L_0x0315:
            byte[] r5 = setMax
            byte r9 = r5[r7]
            short r9 = (short) r9
            r11 = r9 | 353(0x161, float:4.95E-43)
            short r11 = (short) r11
            byte r5 = r5[r10]
            int r5 = -r5
            byte r5 = (byte) r5
            java.lang.String r5 = setMin(r9, r11, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0339
            r5 = 70
            if (r12 < r5) goto L_0x0339
            r5 = 71
            if (r12 > r5) goto L_0x0339
            goto L_0x0263
        L_0x0339:
            r5 = 78
            if (r12 < r5) goto L_0x0347
            r5 = 81
            if (r12 > r5) goto L_0x0347
            r4 = 108(0x6c, float:1.51E-43)
            r7 = 46
            goto L_0x03bf
        L_0x0347:
            byte[] r4 = setMax
            byte r5 = r4[r7]
            short r5 = (short) r5
            r7 = r5 | 353(0x161, float:4.95E-43)
            short r7 = (short) r7
            byte r4 = r4[r10]
            int r4 = -r4
            byte r4 = (byte) r4
            java.lang.String r4 = setMin(r5, r7, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0369
            if (r12 < r14) goto L_0x0369
            r4 = 78
            if (r12 > r4) goto L_0x0369
            goto L_0x0263
        L_0x0369:
            r4 = 83
            if (r12 < r4) goto L_0x0376
            if (r12 > r8) goto L_0x0376
            r4 = 112(0x70, float:1.57E-43)
            r4 = 108(0x6c, float:1.51E-43)
            r7 = 112(0x70, float:1.57E-43)
            goto L_0x03bf
        L_0x0376:
            int r4 = setMin
            r5 = r4 | 97
            short r5 = (short) r5
            r4 = r4 | 263(0x107, float:3.69E-43)
            short r4 = (short) r4
            byte[] r7 = setMax
            byte r7 = r7[r10]
            int r7 = -r7
            byte r7 = (byte) r7
            java.lang.String r4 = setMin(r5, r4, r7)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x039a
            if (r12 < r8) goto L_0x039a
            r4 = 108(0x6c, float:1.51E-43)
            if (r12 > r4) goto L_0x039a
        L_0x0398:
            goto L_0x0265
        L_0x039a:
            int r4 = setMin
            r4 = r4 | 376(0x178, float:5.27E-43)
            short r4 = (short) r4
            r5 = r4 & 1920(0x780, float:2.69E-42)
            short r5 = (short) r5
            byte[] r7 = setMax
            byte r7 = r7[r10]
            int r7 = -r7
            byte r7 = (byte) r7
            java.lang.String r4 = setMin(r4, r5, r7)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x03cc
            r4 = 102(0x66, float:1.43E-43)
            if (r12 < r4) goto L_0x03cc
            r4 = 108(0x6c, float:1.51E-43)
            if (r12 > r4) goto L_0x03cc
            goto L_0x0398
        L_0x03bf:
            r1.IsOverlapping = r0
            r0 = 26
            r1.getMax(r0)
            r4 = 1
            r9 = 11
            r11 = 4
            goto L_0x0128
        L_0x03cc:
            throw r0
        L_0x03cd:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x03d5
            throw r1
        L_0x03d5:
            goto L_0x03d7
        L_0x03d6:
            throw r0
        L_0x03d7:
            goto L_0x03d6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.getOtpInitResult():o.TitleBarRightButtonView$1");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x033b, code lost:
        if (r12 <= 45) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0389, code lost:
        if (r12 <= 52) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03d4, code lost:
        if (r12 <= 55) goto L_0x046b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x018f, code lost:
        r1.getMax(19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x019a, code lost:
        r1.getMax(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01b8, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02a5, code lost:
        r1.getMax(19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02d0, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02b3 A[Catch:{ all -> 0x02a9, all -> 0x02ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02b4 A[Catch:{ all -> 0x02a9, all -> 0x02ca }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.TitleBarRightButtonView.AnonymousClass1<o.GriverRpcExtension> getPaymentCode() {
        /*
            r20 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r20
            r1.<init>(r2)
            int r0 = setMin
            r0 = r0 | 3939(0xf63, float:5.52E-42)
            short r0 = (short) r0
            byte[] r3 = setMax
            r4 = 4
            byte r3 = r3[r4]
            short r3 = (short) r3
            r5 = r3 | 73
            byte r5 = (byte) r5
            java.lang.String r0 = setMin(r0, r3, r5)
            int r3 = setMin
            r3 = r3 | 351(0x15f, float:4.92E-43)
            short r3 = (short) r3
            r5 = r3 & 1977(0x7b9, float:2.77E-42)
            short r5 = (short) r5
            r6 = 74
            byte r6 = (byte) r6
            java.lang.String r3 = setMin(r3, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0476 }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x0476 }
            r3 = 1282(0x502, float:1.796E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x0476 }
            int r8 = setMin     // Catch:{ all -> 0x0476 }
            r8 = r8 | 266(0x10a, float:3.73E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x0476 }
            byte[] r9 = setMax     // Catch:{ all -> 0x0476 }
            r10 = 22
            byte r9 = r9[r10]     // Catch:{ all -> 0x0476 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x0476 }
            java.lang.String r8 = setMin(r3, r8, r9)     // Catch:{ all -> 0x0476 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0476 }
            r9 = 2363(0x93b, float:3.311E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0476 }
            int r11 = setMin     // Catch:{ all -> 0x0476 }
            r11 = r11 | 277(0x115, float:3.88E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0476 }
            byte[] r12 = setMax     // Catch:{ all -> 0x0476 }
            r13 = 21
            byte r12 = r12[r13]     // Catch:{ all -> 0x0476 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0476 }
            java.lang.String r9 = setMin(r9, r11, r12)     // Catch:{ all -> 0x0476 }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x0476 }
            int r12 = setMin     // Catch:{ all -> 0x0476 }
            r12 = r12 | 266(0x10a, float:3.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0476 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0476 }
            byte r13 = r13[r10]     // Catch:{ all -> 0x0476 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0476 }
            java.lang.String r12 = setMin(r3, r12, r13)     // Catch:{ all -> 0x0476 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0476 }
            r11[r7] = r12     // Catch:{ all -> 0x0476 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r11)     // Catch:{ all -> 0x0476 }
            java.lang.Object r0 = r8.invoke(r0, r6)     // Catch:{ all -> 0x0476 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0476 }
            int r6 = r0.length
            int[] r6 = new int[r6]
            r8 = 0
        L_0x007e:
            int r9 = r0.length
            if (r8 >= r9) goto L_0x0120
            r9 = r0[r8]
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x0117 }
            r12[r7] = r9     // Catch:{ all -> 0x0117 }
            r9 = 3658(0xe4a, float:5.126E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0117 }
            int r13 = setMin     // Catch:{ all -> 0x0117 }
            r13 = r13 | 265(0x109, float:3.71E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0117 }
            byte[] r14 = setMax     // Catch:{ all -> 0x0117 }
            byte r14 = r14[r10]     // Catch:{ all -> 0x0117 }
            int r14 = -r14
            byte r14 = (byte) r14     // Catch:{ all -> 0x0117 }
            java.lang.String r13 = setMin(r9, r13, r14)     // Catch:{ all -> 0x0117 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0117 }
            int r14 = setMin     // Catch:{ all -> 0x0117 }
            r14 = r14 | 602(0x25a, float:8.44E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0117 }
            int r15 = setMin     // Catch:{ all -> 0x0117 }
            r15 = r15 | 275(0x113, float:3.85E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0117 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0117 }
            byte r11 = r16[r4]     // Catch:{ all -> 0x0117 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0117 }
            java.lang.String r11 = setMin(r14, r15, r11)     // Catch:{ all -> 0x0117 }
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x0117 }
            int r15 = setMin     // Catch:{ all -> 0x0117 }
            r15 = r15 | 266(0x10a, float:3.73E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0117 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0117 }
            byte r4 = r16[r10]     // Catch:{ all -> 0x0117 }
            int r4 = -r4
            byte r4 = (byte) r4     // Catch:{ all -> 0x0117 }
            java.lang.String r4 = setMin(r3, r15, r4)     // Catch:{ all -> 0x0117 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0117 }
            r14[r7] = r4     // Catch:{ all -> 0x0117 }
            java.lang.reflect.Method r4 = r13.getMethod(r11, r14)     // Catch:{ all -> 0x0117 }
            r11 = 0
            java.lang.Object r4 = r4.invoke(r11, r12)     // Catch:{ all -> 0x0117 }
            int r11 = setMin     // Catch:{ all -> 0x010e }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010e }
            byte[] r12 = setMax     // Catch:{ all -> 0x010e }
            byte r12 = r12[r10]     // Catch:{ all -> 0x010e }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x010e }
            java.lang.String r9 = setMin(r9, r11, r12)     // Catch:{ all -> 0x010e }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x010e }
            int r11 = setMin     // Catch:{ all -> 0x010e }
            r11 = r11 | 596(0x254, float:8.35E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010e }
            int r12 = setMin     // Catch:{ all -> 0x010e }
            r12 = r12 | 274(0x112, float:3.84E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x010e }
            byte[] r13 = setMax     // Catch:{ all -> 0x010e }
            r14 = 5678(0x162e, float:7.957E-42)
            byte r13 = r13[r14]     // Catch:{ all -> 0x010e }
            byte r13 = (byte) r13     // Catch:{ all -> 0x010e }
            java.lang.String r11 = setMin(r11, r12, r13)     // Catch:{ all -> 0x010e }
            r12 = 0
            java.lang.reflect.Method r9 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x010e }
            java.lang.Object r4 = r9.invoke(r4, r12)     // Catch:{ all -> 0x010e }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x010e }
            int r4 = r4.intValue()     // Catch:{ all -> 0x010e }
            r6[r8] = r4
            int r8 = r8 + 1
            r4 = 4
            goto L_0x007e
        L_0x010e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0116
            throw r1
        L_0x0116:
            throw r0
        L_0x0117:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011f
            throw r1
        L_0x011f:
            throw r0
        L_0x0120:
            r9 = 12
            r0 = 0
        L_0x0123:
            int r12 = r0 + 1
            r13 = 2
            r0 = r6[r0]     // Catch:{ all -> 0x02d5 }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x02d5 }
            r15 = 19
            r14 = 18
            r3 = 10
            switch(r0) {
                case -30: goto L_0x02cc;
                case -29: goto L_0x02b5;
                case -28: goto L_0x0242;
                case -27: goto L_0x023e;
                case -26: goto L_0x023a;
                case -25: goto L_0x022f;
                case -24: goto L_0x022b;
                case -23: goto L_0x0227;
                case -22: goto L_0x021a;
                case -21: goto L_0x020a;
                case -20: goto L_0x0205;
                case -19: goto L_0x0201;
                case -18: goto L_0x01fd;
                case -17: goto L_0x01ec;
                case -16: goto L_0x01d9;
                case -15: goto L_0x01c6;
                case -14: goto L_0x01c2;
                case -13: goto L_0x01be;
                case -12: goto L_0x01bb;
                case -11: goto L_0x01ad;
                case -10: goto L_0x019e;
                case -9: goto L_0x0196;
                case -8: goto L_0x0193;
                case -7: goto L_0x0176;
                case -6: goto L_0x0160;
                case -5: goto L_0x0152;
                case -4: goto L_0x0148;
                case -3: goto L_0x0145;
                case -2: goto L_0x013b;
                case -1: goto L_0x0138;
                default: goto L_0x0135;
            }     // Catch:{ all -> 0x02d5 }
        L_0x0135:
            r4 = 0
            goto L_0x02d0
        L_0x0138:
            r0 = 76
            goto L_0x0123
        L_0x013b:
            r0 = 15
            r1.getMax(r0)     // Catch:{ all -> 0x02d5 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02d5 }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x02d5 }
            return r0
        L_0x0145:
            r0 = 12
            goto L_0x0123
        L_0x0148:
            r0 = 15
            r1.getMax(r0)     // Catch:{ all -> 0x02d5 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02d5 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x02d5 }
            throw r0     // Catch:{ all -> 0x02d5 }
        L_0x0152:
            r0 = 34
            r1.getMax(r0)     // Catch:{ all -> 0x02d5 }
            int r0 = r1.length     // Catch:{ all -> 0x02d5 }
            if (r0 == 0) goto L_0x015e
            r0 = 10
            goto L_0x0123
        L_0x015e:
            r0 = 1
            goto L_0x0123
        L_0x0160:
            r0 = 34
            r1.getMax(r0)     // Catch:{ all -> 0x02d5 }
            int r0 = r1.length     // Catch:{ all -> 0x02d5 }
            r3 = 38
            if (r0 == r3) goto L_0x0173
            r3 = 43
            if (r0 == r3) goto L_0x0170
            goto L_0x0173
        L_0x0170:
            r0 = 13
            goto L_0x0123
        L_0x0173:
            r0 = 110(0x6e, float:1.54E-43)
            goto L_0x0123
        L_0x0176:
            r1.getMax = r13     // Catch:{ all -> 0x02d5 }
            r1.getMax(r3)     // Catch:{ all -> 0x02d5 }
            r1.getMax(r14)     // Catch:{ all -> 0x02d5 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02d5 }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x02d5 }
            r1.getMax(r14)     // Catch:{ all -> 0x02d5 }
            java.lang.Object r3 = r1.toIntRange     // Catch:{ all -> 0x02d5 }
            o.RedDotDrawable r3 = (o.RedDotDrawable) r3     // Catch:{ all -> 0x02d5 }
            o.TitleBarRightButtonView$1 r0 = r0.map(r3)     // Catch:{ all -> 0x02d5 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02d5 }
        L_0x018f:
            r1.getMax(r15)     // Catch:{ all -> 0x02d5 }
            goto L_0x0135
        L_0x0193:
            r0 = 80
            goto L_0x0123
        L_0x0196:
            int r0 = getMin     // Catch:{ all -> 0x02d5 }
            r1.getMax = r0     // Catch:{ all -> 0x02d5 }
        L_0x019a:
            r1.getMax(r5)     // Catch:{ all -> 0x02d5 }
            goto L_0x0135
        L_0x019e:
            r1.getMax = r5     // Catch:{ all -> 0x02d5 }
            r1.getMax(r3)     // Catch:{ all -> 0x02d5 }
            r0 = 11
            r1.getMax(r0)     // Catch:{ all -> 0x02d5 }
            int r0 = r1.length     // Catch:{ all -> 0x02d5 }
            length = r0     // Catch:{ all -> 0x02d5 }
            goto L_0x0135
        L_0x01ad:
            r1.getMax(r9)     // Catch:{ all -> 0x02d5 }
            int r0 = r1.length     // Catch:{ all -> 0x02d5 }
            if (r0 != 0) goto L_0x01b8
            r0 = 44
            goto L_0x0123
        L_0x01b8:
            r0 = r12
            goto L_0x0123
        L_0x01bb:
            r0 = 6
            goto L_0x0123
        L_0x01be:
            r0 = 121(0x79, float:1.7E-43)
            goto L_0x0123
        L_0x01c2:
            r0 = 46
            goto L_0x0123
        L_0x01c6:
            r1.getMax = r5     // Catch:{ all -> 0x02d5 }
            r1.getMax(r3)     // Catch:{ all -> 0x02d5 }
            r1.getMax(r14)     // Catch:{ all -> 0x02d5 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02d5 }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x02d5 }
            o.getExtensionMetaInfos r0 = r0.createQrPayData()     // Catch:{ all -> 0x02d5 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02d5 }
            goto L_0x018f
        L_0x01d9:
            r1.getMax = r5     // Catch:{ all -> 0x02d5 }
            r1.getMax(r3)     // Catch:{ all -> 0x02d5 }
            r1.getMax(r14)     // Catch:{ all -> 0x02d5 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02d5 }
            o.getExtensionMetaInfos r0 = (o.getExtensionMetaInfos) r0     // Catch:{ all -> 0x02d5 }
            o.TitleBarRightButtonView$1 r0 = r0.getPaymentCode()     // Catch:{ all -> 0x02d5 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02d5 }
            goto L_0x018f
        L_0x01ec:
            r1.getMax = r5     // Catch:{ all -> 0x02d5 }
            r1.getMax(r3)     // Catch:{ all -> 0x02d5 }
            r1.getMax(r14)     // Catch:{ all -> 0x02d5 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02d5 }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x02d5 }
            o.RVJsStatTrackService r0 = r0.paymentModelMapper     // Catch:{ all -> 0x02d5 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02d5 }
            goto L_0x018f
        L_0x01fd:
            r0 = 112(0x70, float:1.57E-43)
            goto L_0x0123
        L_0x0201:
            r0 = 9
            goto L_0x0123
        L_0x0205:
            int r0 = length     // Catch:{ all -> 0x02d5 }
            r1.getMax = r0     // Catch:{ all -> 0x02d5 }
            goto L_0x019a
        L_0x020a:
            r1.getMax = r5     // Catch:{ all -> 0x02d5 }
            r1.getMax(r3)     // Catch:{ all -> 0x02d5 }
            r0 = 11
            r1.getMax(r0)     // Catch:{ all -> 0x02d5 }
            int r0 = r1.length     // Catch:{ all -> 0x02d5 }
            getMin = r0     // Catch:{ all -> 0x02d5 }
            goto L_0x0135
        L_0x021a:
            r0 = 68
            r1.getMax(r0)     // Catch:{ all -> 0x02d5 }
            int r0 = r1.length     // Catch:{ all -> 0x02d5 }
            if (r0 != 0) goto L_0x01b8
            r0 = 75
            goto L_0x0123
        L_0x0227:
            r0 = 45
            goto L_0x0123
        L_0x022b:
            r0 = 54
            goto L_0x0123
        L_0x022f:
            r1.getMax(r9)     // Catch:{ all -> 0x02d5 }
            int r0 = r1.length     // Catch:{ all -> 0x02d5 }
            if (r0 != 0) goto L_0x01b8
            r0 = 107(0x6b, float:1.5E-43)
            goto L_0x0123
        L_0x023a:
            r0 = 52
            goto L_0x0123
        L_0x023e:
            r0 = 119(0x77, float:1.67E-43)
            goto L_0x0123
        L_0x0242:
            r1.getMax = r5     // Catch:{ all -> 0x02d5 }
            r1.getMax(r3)     // Catch:{ all -> 0x02d5 }
            r1.getMax(r14)     // Catch:{ all -> 0x02d5 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02d5 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x02ab }
            r3[r7] = r0     // Catch:{ all -> 0x02ab }
            byte[] r0 = setMax     // Catch:{ all -> 0x02ab }
            r14 = 161(0xa1, float:2.26E-43)
            byte r0 = r0[r14]     // Catch:{ all -> 0x02ab }
            int r0 = r0 + r5
            short r0 = (short) r0     // Catch:{ all -> 0x02ab }
            int r14 = setMin     // Catch:{ all -> 0x02ab }
            r14 = r14 | 265(0x109, float:3.71E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x02ab }
            byte[] r18 = setMax     // Catch:{ all -> 0x02ab }
            byte r9 = r18[r10]     // Catch:{ all -> 0x02ab }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x02ab }
            java.lang.String r0 = setMin(r0, r14, r9)     // Catch:{ all -> 0x02ab }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x02ab }
            int r9 = setMin     // Catch:{ all -> 0x02ab }
            r9 = r9 | 1565(0x61d, float:2.193E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x02ab }
            int r14 = setMin     // Catch:{ all -> 0x02ab }
            r14 = r14 | 268(0x10c, float:3.76E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x02ab }
            byte[] r18 = setMax     // Catch:{ all -> 0x02ab }
            r19 = 27
            byte r4 = r18[r19]     // Catch:{ all -> 0x02ab }
            byte r4 = (byte) r4     // Catch:{ all -> 0x02ab }
            java.lang.String r4 = setMin(r9, r14, r4)     // Catch:{ all -> 0x02ab }
            java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch:{ all -> 0x02ab }
            r14 = 43
            short r14 = (short) r14     // Catch:{ all -> 0x02ab }
            int r11 = setMin     // Catch:{ all -> 0x02ab }
            r11 = r11 | 266(0x10a, float:3.73E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x02ab }
            byte[] r19 = setMax     // Catch:{ all -> 0x02ab }
            byte r8 = r19[r10]     // Catch:{ all -> 0x02ab }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x02ab }
            java.lang.String r8 = setMin(r14, r11, r8)     // Catch:{ all -> 0x02ab }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x02ab }
            r9[r7] = r8     // Catch:{ all -> 0x02ab }
            java.lang.reflect.Method r0 = r0.getMethod(r4, r9)     // Catch:{ all -> 0x02ab }
            r4 = 0
            java.lang.Object r0 = r0.invoke(r4, r3)     // Catch:{ all -> 0x02a9 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02ca }
        L_0x02a5:
            r1.getMax(r15)     // Catch:{ all -> 0x02ca }
            goto L_0x02d0
        L_0x02a9:
            r0 = move-exception
            goto L_0x02ad
        L_0x02ab:
            r0 = move-exception
            r4 = 0
        L_0x02ad:
            java.lang.Throwable r3 = r0.getCause()     // Catch:{ all -> 0x02ca }
            if (r3 == 0) goto L_0x02b4
            throw r3     // Catch:{ all -> 0x02ca }
        L_0x02b4:
            throw r0     // Catch:{ all -> 0x02ca }
        L_0x02b5:
            r4 = 0
            o.deserialize r0 = new o.deserialize     // Catch:{ all -> 0x02ca }
            r1.getMax = r5     // Catch:{ all -> 0x02ca }
            r1.getMax(r3)     // Catch:{ all -> 0x02ca }
            r1.getMax(r14)     // Catch:{ all -> 0x02ca }
            java.lang.Object r3 = r1.toIntRange     // Catch:{ all -> 0x02ca }
            o.RVJsStatTrackService r3 = (o.RVJsStatTrackService) r3     // Catch:{ all -> 0x02ca }
            r0.<init>(r3)     // Catch:{ all -> 0x02ca }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02ca }
            goto L_0x02a5
        L_0x02ca:
            r0 = move-exception
            goto L_0x02d7
        L_0x02cc:
            r0 = 17
            goto L_0x0123
        L_0x02d0:
            r0 = r12
        L_0x02d1:
            r9 = 12
            goto L_0x0123
        L_0x02d5:
            r0 = move-exception
            r4 = 0
        L_0x02d7:
            r8 = 118(0x76, float:1.65E-43)
            r9 = 6
            if (r12 < r13) goto L_0x02e6
            if (r12 > r9) goto L_0x02e6
            r3 = 108(0x6c, float:1.51E-43)
            r8 = 108(0x6c, float:1.51E-43)
        L_0x02e2:
            r11 = 17
            goto L_0x046b
        L_0x02e6:
            r11 = 14
            if (r12 < r11) goto L_0x02f3
            r11 = 17
            if (r12 > r11) goto L_0x02f3
            r3 = 8
            r8 = 8
            goto L_0x02e2
        L_0x02f3:
            int r11 = setMin
            r11 = r11 | 5438(0x153e, float:7.62E-42)
            short r11 = (short) r11
            r13 = 379(0x17b, float:5.31E-43)
            short r13 = (short) r13
            byte[] r14 = setMax
            byte r14 = r14[r10]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r11 = setMin(r11, r13, r14)
            java.lang.Class r11 = java.lang.Class.forName(r11)
            boolean r11 = r11.isInstance(r0)
            if (r11 == 0) goto L_0x0319
            r11 = 13
            if (r12 < r11) goto L_0x0319
            r11 = 17
            if (r12 > r11) goto L_0x0319
            goto L_0x046b
        L_0x0319:
            int r11 = setMin
            r11 = r11 | 5194(0x144a, float:7.278E-42)
            short r11 = (short) r11
            r14 = 375(0x177, float:5.25E-43)
            short r14 = (short) r14
            byte[] r15 = setMax
            byte r15 = r15[r10]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r11 = setMin(r11, r14, r15)
            java.lang.Class r11 = java.lang.Class.forName(r11)
            boolean r11 = r11.isInstance(r0)
            if (r11 == 0) goto L_0x0341
            r11 = 17
            if (r12 < r11) goto L_0x0343
            r14 = 45
            if (r12 > r14) goto L_0x0343
        L_0x033d:
            r8 = 109(0x6d, float:1.53E-43)
            goto L_0x046b
        L_0x0341:
            r11 = 17
        L_0x0343:
            int r14 = setMin
            r14 = r14 | 351(0x15f, float:4.92E-43)
            short r14 = (short) r14
            r15 = 376(0x178, float:5.27E-43)
            short r15 = (short) r15
            byte[] r17 = setMax
            byte r3 = r17[r10]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r3 = setMin(r14, r15, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0369
            r3 = 40
            if (r12 < r3) goto L_0x0369
            r3 = 41
            if (r12 > r3) goto L_0x0369
            goto L_0x046b
        L_0x0369:
            r3 = 768(0x300, float:1.076E-42)
            short r3 = (short) r3
            r14 = 371(0x173, float:5.2E-43)
            short r14 = (short) r14
            byte[] r15 = setMax
            byte r15 = r15[r10]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r3 = setMin(r3, r14, r15)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x038c
            r3 = 48
            if (r12 < r3) goto L_0x038c
            r3 = 52
            if (r12 > r3) goto L_0x038e
            goto L_0x033d
        L_0x038c:
            r3 = 52
        L_0x038e:
            r14 = 3642(0xe3a, float:5.104E-42)
            short r14 = (short) r14
            r15 = 382(0x17e, float:5.35E-43)
            short r15 = (short) r15
            byte[] r17 = setMax
            byte r3 = r17[r10]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r3 = setMin(r14, r15, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x03b2
            r3 = 50
            if (r12 < r3) goto L_0x03b2
            r3 = 51
            if (r12 > r3) goto L_0x03b2
            goto L_0x046b
        L_0x03b2:
            int r3 = setMin
            r14 = r3 | 97
            short r14 = (short) r14
            r3 = r3 | 263(0x107, float:3.69E-43)
            short r3 = (short) r3
            byte[] r15 = setMax
            byte r15 = r15[r10]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r3 = setMin(r14, r3, r15)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x03d8
            r3 = 54
            if (r12 < r3) goto L_0x03da
            r14 = 55
            if (r12 > r14) goto L_0x03da
            goto L_0x046b
        L_0x03d8:
            r3 = 54
        L_0x03da:
            int r14 = setMin
            r15 = r14 | 97
            short r15 = (short) r15
            r14 = r14 | 263(0x107, float:3.69E-43)
            short r14 = (short) r14
            byte[] r17 = setMax
            byte r3 = r17[r10]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r3 = setMin(r15, r14, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0400
            r3 = 80
            if (r12 < r3) goto L_0x0400
            r3 = 81
            if (r12 > r3) goto L_0x0400
            goto L_0x033d
        L_0x0400:
            int r3 = setMin
            r14 = r3 | 97
            short r14 = (short) r14
            r3 = r3 | 263(0x107, float:3.69E-43)
            short r3 = (short) r3
            byte[] r15 = setMax
            byte r15 = r15[r10]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r3 = setMin(r14, r3, r15)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0426
            r3 = 102(0x66, float:1.43E-43)
            if (r12 < r3) goto L_0x0426
            r3 = 103(0x67, float:1.44E-43)
            if (r12 > r3) goto L_0x0426
            goto L_0x033d
        L_0x0426:
            byte[] r3 = setMax
            r14 = 2117(0x845, float:2.967E-42)
            byte r14 = r3[r14]
            short r14 = (short) r14
            r15 = r14 | 353(0x161, float:4.95E-43)
            short r15 = (short) r15
            byte r3 = r3[r10]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r3 = setMin(r14, r15, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x044c
            r3 = 110(0x6e, float:1.54E-43)
            if (r12 < r3) goto L_0x044c
            r3 = 112(0x70, float:1.57E-43)
            if (r12 > r3) goto L_0x044c
            goto L_0x033d
        L_0x044c:
            r3 = 534(0x216, float:7.48E-43)
            short r3 = (short) r3
            byte[] r14 = setMax
            byte r14 = r14[r10]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r3 = setMin(r3, r13, r14)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0475
            r3 = 113(0x71, float:1.58E-43)
            if (r12 < r3) goto L_0x0475
            r3 = 114(0x72, float:1.6E-43)
            if (r12 > r3) goto L_0x0475
        L_0x046b:
            r1.IsOverlapping = r0
            r0 = 26
            r1.getMax(r0)
            r0 = r8
            goto L_0x02d1
        L_0x0475:
            throw r0
        L_0x0476:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x047e
            throw r1
        L_0x047e:
            goto L_0x0480
        L_0x047f:
            throw r0
        L_0x0480:
            goto L_0x047f
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.getPaymentCode():o.TitleBarRightButtonView$1");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0337, code lost:
        if (r10 <= 37) goto L_0x02e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x038f, code lost:
        if (r10 <= 68) goto L_0x02e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x042a, code lost:
        if (r10 <= 105) goto L_0x0452;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0153, code lost:
        r1.getMax(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01ac, code lost:
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02ba, code lost:
        r0 = r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.TitleBarRightButtonView.AnonymousClass1<o.BaseGriverRpcResult> getPaymentResult() {
        /*
            r20 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r20
            r1.<init>(r2)
            r0 = 2863(0xb2f, float:4.012E-42)
            short r0 = (short) r0
            r3 = r0 & 254(0xfe, float:3.56E-43)
            short r3 = (short) r3
            r4 = 73
            byte r5 = (byte) r4
            java.lang.String r0 = setMin(r0, r3, r5)
            int r3 = setMin
            r3 = r3 | 351(0x15f, float:4.92E-43)
            short r3 = (short) r3
            r5 = r3 & 1977(0x7b9, float:2.77E-42)
            short r5 = (short) r5
            r6 = 74
            byte r7 = (byte) r6
            java.lang.String r3 = setMin(r3, r5, r7)
            r5 = 1
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x045d }
            r8 = 0
            r7[r8] = r3     // Catch:{ all -> 0x045d }
            r3 = 1282(0x502, float:1.796E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x045d }
            int r9 = setMin     // Catch:{ all -> 0x045d }
            r9 = r9 | 266(0x10a, float:3.73E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x045d }
            byte[] r10 = setMax     // Catch:{ all -> 0x045d }
            r11 = 22
            byte r10 = r10[r11]     // Catch:{ all -> 0x045d }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x045d }
            java.lang.String r9 = setMin(r3, r9, r10)     // Catch:{ all -> 0x045d }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x045d }
            r10 = 2363(0x93b, float:3.311E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x045d }
            int r12 = setMin     // Catch:{ all -> 0x045d }
            r12 = r12 | 277(0x115, float:3.88E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x045d }
            byte[] r13 = setMax     // Catch:{ all -> 0x045d }
            r14 = 21
            byte r13 = r13[r14]     // Catch:{ all -> 0x045d }
            byte r13 = (byte) r13     // Catch:{ all -> 0x045d }
            java.lang.String r10 = setMin(r10, r12, r13)     // Catch:{ all -> 0x045d }
            java.lang.Class[] r12 = new java.lang.Class[r5]     // Catch:{ all -> 0x045d }
            int r13 = setMin     // Catch:{ all -> 0x045d }
            r13 = r13 | 266(0x10a, float:3.73E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x045d }
            byte[] r14 = setMax     // Catch:{ all -> 0x045d }
            byte r14 = r14[r11]     // Catch:{ all -> 0x045d }
            int r14 = -r14
            byte r14 = (byte) r14     // Catch:{ all -> 0x045d }
            java.lang.String r13 = setMin(r3, r13, r14)     // Catch:{ all -> 0x045d }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x045d }
            r12[r8] = r13     // Catch:{ all -> 0x045d }
            java.lang.reflect.Method r9 = r9.getMethod(r10, r12)     // Catch:{ all -> 0x045d }
            java.lang.Object r0 = r9.invoke(r0, r7)     // Catch:{ all -> 0x045d }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x045d }
            int r7 = r0.length
            int[] r7 = new int[r7]
            r9 = 0
        L_0x0079:
            int r10 = r0.length
            r12 = 0
            if (r9 >= r10) goto L_0x0120
            r10 = r0[r9]
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x0117 }
            r13[r8] = r10     // Catch:{ all -> 0x0117 }
            r10 = 3658(0xe4a, float:5.126E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0117 }
            int r14 = setMin     // Catch:{ all -> 0x0117 }
            r14 = r14 | 265(0x109, float:3.71E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0117 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0117 }
            byte r15 = r15[r11]     // Catch:{ all -> 0x0117 }
            int r15 = -r15
            byte r15 = (byte) r15     // Catch:{ all -> 0x0117 }
            java.lang.String r14 = setMin(r10, r14, r15)     // Catch:{ all -> 0x0117 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0117 }
            int r15 = setMin     // Catch:{ all -> 0x0117 }
            r15 = r15 | 602(0x25a, float:8.44E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0117 }
            int r4 = setMin     // Catch:{ all -> 0x0117 }
            r4 = r4 | 275(0x113, float:3.85E-43)
            short r4 = (short) r4     // Catch:{ all -> 0x0117 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0117 }
            r17 = 4
            byte r6 = r16[r17]     // Catch:{ all -> 0x0117 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x0117 }
            java.lang.String r4 = setMin(r15, r4, r6)     // Catch:{ all -> 0x0117 }
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x0117 }
            int r15 = setMin     // Catch:{ all -> 0x0117 }
            r15 = r15 | 266(0x10a, float:3.73E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0117 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0117 }
            byte r5 = r16[r11]     // Catch:{ all -> 0x0117 }
            int r5 = -r5
            byte r5 = (byte) r5     // Catch:{ all -> 0x0117 }
            java.lang.String r5 = setMin(r3, r15, r5)     // Catch:{ all -> 0x0117 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0117 }
            r6[r8] = r5     // Catch:{ all -> 0x0117 }
            java.lang.reflect.Method r4 = r14.getMethod(r4, r6)     // Catch:{ all -> 0x0117 }
            java.lang.Object r4 = r4.invoke(r12, r13)     // Catch:{ all -> 0x0117 }
            int r5 = setMin     // Catch:{ all -> 0x010e }
            r5 = r5 | 265(0x109, float:3.71E-43)
            short r5 = (short) r5     // Catch:{ all -> 0x010e }
            byte[] r6 = setMax     // Catch:{ all -> 0x010e }
            byte r6 = r6[r11]     // Catch:{ all -> 0x010e }
            int r6 = -r6
            byte r6 = (byte) r6     // Catch:{ all -> 0x010e }
            java.lang.String r5 = setMin(r10, r5, r6)     // Catch:{ all -> 0x010e }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x010e }
            int r6 = setMin     // Catch:{ all -> 0x010e }
            r6 = r6 | 596(0x254, float:8.35E-43)
            short r6 = (short) r6     // Catch:{ all -> 0x010e }
            int r10 = setMin     // Catch:{ all -> 0x010e }
            r10 = r10 | 274(0x112, float:3.84E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x010e }
            byte[] r13 = setMax     // Catch:{ all -> 0x010e }
            r14 = 5678(0x162e, float:7.957E-42)
            byte r13 = r13[r14]     // Catch:{ all -> 0x010e }
            byte r13 = (byte) r13     // Catch:{ all -> 0x010e }
            java.lang.String r6 = setMin(r6, r10, r13)     // Catch:{ all -> 0x010e }
            java.lang.reflect.Method r5 = r5.getMethod(r6, r12)     // Catch:{ all -> 0x010e }
            java.lang.Object r4 = r5.invoke(r4, r12)     // Catch:{ all -> 0x010e }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x010e }
            int r4 = r4.intValue()     // Catch:{ all -> 0x010e }
            r7[r9] = r4
            int r9 = r9 + 1
            r4 = 73
            r5 = 1
            r6 = 74
            goto L_0x0079
        L_0x010e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0116
            throw r1
        L_0x0116:
            throw r0
        L_0x0117:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011f
            throw r1
        L_0x011f:
            throw r0
        L_0x0120:
            r9 = 11
            r0 = 0
        L_0x0123:
            int r10 = r0 + 1
            r14 = 68
            r15 = 10
            r0 = r7[r0]     // Catch:{ all -> 0x02bf }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x02bf }
            r6 = 12
            r4 = 19
            r13 = 18
            switch(r0) {
                case -28: goto L_0x02b6;
                case -27: goto L_0x029c;
                case -26: goto L_0x022d;
                case -25: goto L_0x0229;
                case -24: goto L_0x0225;
                case -23: goto L_0x021a;
                case -22: goto L_0x0210;
                case -21: goto L_0x01fe;
                case -20: goto L_0x01fb;
                case -19: goto L_0x01f7;
                case -18: goto L_0x01ec;
                case -17: goto L_0x01dd;
                case -16: goto L_0x01d6;
                case -15: goto L_0x01d2;
                case -14: goto L_0x01b7;
                case -13: goto L_0x01b3;
                case -12: goto L_0x01af;
                case -11: goto L_0x01a1;
                case -10: goto L_0x0193;
                case -9: goto L_0x018d;
                case -8: goto L_0x018a;
                case -7: goto L_0x0180;
                case -6: goto L_0x017d;
                case -5: goto L_0x016b;
                case -4: goto L_0x0157;
                case -3: goto L_0x0140;
                case -2: goto L_0x013d;
                case -1: goto L_0x013b;
                default: goto L_0x0138;
            }     // Catch:{ all -> 0x02bf }
        L_0x0138:
            r3 = 1
            goto L_0x02ba
        L_0x013b:
            r0 = 1
            goto L_0x0123
        L_0x013d:
            r0 = 44
            goto L_0x0123
        L_0x0140:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x02bf }
            r1.getMax(r15)     // Catch:{ all -> 0x02bf }
            r1.getMax(r13)     // Catch:{ all -> 0x02bf }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02bf }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x02bf }
            o.getExtensionMetaInfos r0 = r0.createQrPayData()     // Catch:{ all -> 0x02bf }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02bf }
        L_0x0153:
            r1.getMax(r4)     // Catch:{ all -> 0x02bf }
            goto L_0x0138
        L_0x0157:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x02bf }
            r1.getMax(r15)     // Catch:{ all -> 0x02bf }
            r1.getMax(r13)     // Catch:{ all -> 0x02bf }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02bf }
            o.getExtensionMetaInfos r0 = (o.getExtensionMetaInfos) r0     // Catch:{ all -> 0x02bf }
            o.TitleBarRightButtonView$1 r0 = r0.getPaymentResult()     // Catch:{ all -> 0x02bf }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02bf }
            goto L_0x0153
        L_0x016b:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x02bf }
            r1.getMax(r15)     // Catch:{ all -> 0x02bf }
            r1.getMax(r13)     // Catch:{ all -> 0x02bf }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02bf }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x02bf }
            o.RVJsStatTrackService r0 = r0.paymentModelMapper     // Catch:{ all -> 0x02bf }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02bf }
            goto L_0x0153
        L_0x017d:
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x0123
        L_0x0180:
            r0 = 15
            r1.getMax(r0)     // Catch:{ all -> 0x02bf }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02bf }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x02bf }
            throw r0     // Catch:{ all -> 0x02bf }
        L_0x018a:
            r0 = 73
            goto L_0x0123
        L_0x018d:
            int r0 = length     // Catch:{ all -> 0x02bf }
            r1.getMax = r0     // Catch:{ all -> 0x02bf }
            r4 = 1
            goto L_0x0153
        L_0x0193:
            r4 = 1
            r1.getMax = r4     // Catch:{ all -> 0x02bf }
            r1.getMax(r15)     // Catch:{ all -> 0x02bf }
            r1.getMax(r9)     // Catch:{ all -> 0x02bf }
            int r0 = r1.length     // Catch:{ all -> 0x02bf }
            getMin = r0     // Catch:{ all -> 0x02bf }
            goto L_0x0138
        L_0x01a1:
            r1.getMax(r14)     // Catch:{ all -> 0x02bf }
            int r0 = r1.length     // Catch:{ all -> 0x02bf }
            if (r0 != 0) goto L_0x01ac
            r0 = 36
            goto L_0x0123
        L_0x01ac:
            r0 = r10
            goto L_0x0123
        L_0x01af:
            r0 = 69
            goto L_0x0123
        L_0x01b3:
            r0 = 74
            goto L_0x0123
        L_0x01b7:
            r0 = 2
            r1.getMax = r0     // Catch:{ all -> 0x02bf }
            r1.getMax(r15)     // Catch:{ all -> 0x02bf }
            r1.getMax(r13)     // Catch:{ all -> 0x02bf }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02bf }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x02bf }
            r1.getMax(r13)     // Catch:{ all -> 0x02bf }
            java.lang.Object r6 = r1.toIntRange     // Catch:{ all -> 0x02bf }
            o.RedDotDrawable r6 = (o.RedDotDrawable) r6     // Catch:{ all -> 0x02bf }
            o.TitleBarRightButtonView$1 r0 = r0.map(r6)     // Catch:{ all -> 0x02bf }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02bf }
            goto L_0x0153
        L_0x01d2:
            r0 = 13
            goto L_0x0123
        L_0x01d6:
            int r0 = getMin     // Catch:{ all -> 0x02bf }
            r1.getMax = r0     // Catch:{ all -> 0x02bf }
            r4 = 1
            goto L_0x0153
        L_0x01dd:
            r4 = 1
            r1.getMax = r4     // Catch:{ all -> 0x02bf }
            r1.getMax(r15)     // Catch:{ all -> 0x02bf }
            r1.getMax(r9)     // Catch:{ all -> 0x02bf }
            int r0 = r1.length     // Catch:{ all -> 0x02bf }
            length = r0     // Catch:{ all -> 0x02bf }
            goto L_0x0138
        L_0x01ec:
            r1.getMax(r6)     // Catch:{ all -> 0x02bf }
            int r0 = r1.length     // Catch:{ all -> 0x02bf }
            if (r0 != 0) goto L_0x01ac
            r0 = 67
            goto L_0x0123
        L_0x01f7:
            r0 = 110(0x6e, float:1.54E-43)
            goto L_0x0123
        L_0x01fb:
            r0 = 4
            goto L_0x0123
        L_0x01fe:
            r0 = 34
            r1.getMax(r0)     // Catch:{ all -> 0x02bf }
            int r0 = r1.length     // Catch:{ all -> 0x02bf }
            if (r0 == 0) goto L_0x020c
            r4 = 1
            r0 = 39
            goto L_0x0123
        L_0x020c:
            r0 = 70
            goto L_0x0123
        L_0x0210:
            r0 = 15
            r1.getMax(r0)     // Catch:{ all -> 0x02bf }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02bf }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x02bf }
            return r0
        L_0x021a:
            r1.getMax(r6)     // Catch:{ all -> 0x02bf }
            int r0 = r1.length     // Catch:{ all -> 0x02bf }
            if (r0 != 0) goto L_0x01ac
            r0 = 104(0x68, float:1.46E-43)
            goto L_0x0123
        L_0x0225:
            r0 = 37
            goto L_0x0123
        L_0x0229:
            r0 = 11
            goto L_0x0123
        L_0x022d:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x02bf }
            r1.getMax(r15)     // Catch:{ all -> 0x02bf }
            r1.getMax(r13)     // Catch:{ all -> 0x02bf }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02bf }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x0293 }
            r13[r8] = r0     // Catch:{ all -> 0x0293 }
            byte[] r0 = setMax     // Catch:{ all -> 0x0293 }
            r17 = 161(0xa1, float:2.26E-43)
            byte r0 = r0[r17]     // Catch:{ all -> 0x0293 }
            int r0 = r0 + r6
            short r0 = (short) r0     // Catch:{ all -> 0x0293 }
            int r6 = setMin     // Catch:{ all -> 0x0293 }
            r6 = r6 | 265(0x109, float:3.71E-43)
            short r6 = (short) r6     // Catch:{ all -> 0x0293 }
            byte[] r18 = setMax     // Catch:{ all -> 0x0293 }
            byte r9 = r18[r11]     // Catch:{ all -> 0x0293 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x0293 }
            java.lang.String r0 = setMin(r0, r6, r9)     // Catch:{ all -> 0x0293 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0293 }
            int r6 = setMin     // Catch:{ all -> 0x0293 }
            r6 = r6 | 1565(0x61d, float:2.193E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x0293 }
            int r9 = setMin     // Catch:{ all -> 0x0293 }
            r9 = r9 | 268(0x10c, float:3.76E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x0293 }
            byte[] r18 = setMax     // Catch:{ all -> 0x0293 }
            r19 = 27
            byte r14 = r18[r19]     // Catch:{ all -> 0x0293 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0293 }
            java.lang.String r6 = setMin(r6, r9, r14)     // Catch:{ all -> 0x0293 }
            r9 = 1
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x0293 }
            r9 = 43
            short r9 = (short) r9     // Catch:{ all -> 0x0293 }
            int r5 = setMin     // Catch:{ all -> 0x0293 }
            r5 = r5 | 266(0x10a, float:3.73E-43)
            short r5 = (short) r5     // Catch:{ all -> 0x0293 }
            byte[] r19 = setMax     // Catch:{ all -> 0x0293 }
            byte r3 = r19[r11]     // Catch:{ all -> 0x0293 }
            int r3 = -r3
            byte r3 = (byte) r3     // Catch:{ all -> 0x0293 }
            java.lang.String r3 = setMin(r9, r5, r3)     // Catch:{ all -> 0x0293 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0293 }
            r14[r8] = r3     // Catch:{ all -> 0x0293 }
            java.lang.reflect.Method r0 = r0.getMethod(r6, r14)     // Catch:{ all -> 0x0293 }
            java.lang.Object r0 = r0.invoke(r12, r13)     // Catch:{ all -> 0x0293 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02bf }
            goto L_0x0153
        L_0x0293:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch:{ all -> 0x02bf }
            if (r3 == 0) goto L_0x029b
            throw r3     // Catch:{ all -> 0x02bf }
        L_0x029b:
            throw r0     // Catch:{ all -> 0x02bf }
        L_0x029c:
            o.EmbedViewMetaInfo r0 = new o.EmbedViewMetaInfo     // Catch:{ all -> 0x02bf }
            r3 = 1
            r1.getMax = r3     // Catch:{ all -> 0x02b4 }
            r1.getMax(r15)     // Catch:{ all -> 0x02b4 }
            r1.getMax(r13)     // Catch:{ all -> 0x02b4 }
            java.lang.Object r5 = r1.toIntRange     // Catch:{ all -> 0x02b4 }
            o.RVJsStatTrackService r5 = (o.RVJsStatTrackService) r5     // Catch:{ all -> 0x02b4 }
            r0.<init>(r5)     // Catch:{ all -> 0x02b4 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02b4 }
            r1.getMax(r4)     // Catch:{ all -> 0x02b4 }
            goto L_0x02ba
        L_0x02b4:
            r0 = move-exception
            goto L_0x02c1
        L_0x02b6:
            r0 = 76
            goto L_0x0123
        L_0x02ba:
            r0 = r10
        L_0x02bb:
            r9 = 11
            goto L_0x0123
        L_0x02bf:
            r0 = move-exception
            r3 = 1
        L_0x02c1:
            r4 = 768(0x300, float:1.076E-42)
            short r4 = (short) r4
            r5 = 371(0x173, float:5.2E-43)
            short r5 = (short) r5
            byte[] r6 = setMax
            byte r6 = r6[r11]
            int r6 = -r6
            byte r6 = (byte) r6
            java.lang.String r4 = setMin(r4, r5, r6)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02e9
            r4 = 6
            if (r10 < r4) goto L_0x02e9
            r4 = 7
            if (r10 > r4) goto L_0x02e9
        L_0x02e1:
            r3 = 44
        L_0x02e3:
            r4 = 105(0x69, float:1.47E-43)
            r5 = 76
            goto L_0x0452
        L_0x02e9:
            r4 = 3615(0xe1f, float:5.066E-42)
            short r4 = (short) r4
            r5 = 380(0x17c, float:5.32E-43)
            short r5 = (short) r5
            byte[] r6 = setMax
            byte r6 = r6[r11]
            int r6 = -r6
            byte r6 = (byte) r6
            java.lang.String r6 = setMin(r4, r5, r6)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0315
            r6 = 8
            if (r10 < r6) goto L_0x0315
            r6 = 9
            if (r10 > r6) goto L_0x0315
            r3 = 44
        L_0x030d:
            r4 = 105(0x69, float:1.47E-43)
            r5 = 76
        L_0x0311:
            r15 = 68
            goto L_0x0452
        L_0x0315:
            int r6 = setMin
            r6 = r6 | 351(0x15f, float:4.92E-43)
            short r6 = (short) r6
            r9 = 376(0x178, float:5.27E-43)
            short r13 = (short) r9
            byte[] r14 = setMax
            byte r14 = r14[r11]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r6 = setMin(r6, r13, r14)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x033a
            r6 = 13
            if (r10 < r6) goto L_0x033a
            r6 = 37
            if (r10 > r6) goto L_0x033c
            goto L_0x02e1
        L_0x033a:
            r6 = 37
        L_0x033c:
            r14 = 40
            if (r10 < r14) goto L_0x0350
            r14 = 44
            if (r10 > r14) goto L_0x0350
            r4 = 72
            r3 = 44
            r4 = 105(0x69, float:1.47E-43)
            r5 = 76
            r15 = 72
            goto L_0x0452
        L_0x0350:
            int r14 = setMin
            r14 = r14 | r9
            short r14 = (short) r14
            r3 = r14 & 1920(0x780, float:2.69E-42)
            short r3 = (short) r3
            byte[] r19 = setMax
            byte r6 = r19[r11]
            int r6 = -r6
            byte r6 = (byte) r6
            java.lang.String r3 = setMin(r14, r3, r6)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0375
            r3 = 39
            if (r10 < r3) goto L_0x0375
            r3 = 40
            if (r10 > r3) goto L_0x0375
            goto L_0x02e1
        L_0x0375:
            byte[] r3 = setMax
            byte r3 = r3[r11]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r3 = setMin(r4, r5, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0393
            r3 = 44
            r4 = 68
            if (r10 < r3) goto L_0x0397
            if (r10 > r4) goto L_0x0397
        L_0x0391:
            goto L_0x02e3
        L_0x0393:
            r3 = 44
            r4 = 68
        L_0x0397:
            int r5 = setMin
            r5 = r5 | r9
            short r5 = (short) r5
            r6 = r5 & 1920(0x780, float:2.69E-42)
            short r6 = (short) r6
            byte[] r14 = setMax
            byte r14 = r14[r11]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r5 = setMin(r5, r6, r14)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x03bc
            r5 = 62
            if (r10 < r5) goto L_0x03bc
            r5 = 63
            if (r10 > r5) goto L_0x03bc
            goto L_0x030d
        L_0x03bc:
            byte[] r5 = setMax
            r6 = 2117(0x845, float:2.967E-42)
            byte r6 = r5[r6]
            short r6 = (short) r6
            r14 = r6 | 353(0x161, float:4.95E-43)
            short r14 = (short) r14
            byte r5 = r5[r11]
            int r5 = -r5
            byte r5 = (byte) r5
            java.lang.String r5 = setMin(r6, r14, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x03e1
            r5 = 70
            if (r10 < r5) goto L_0x03e1
            r5 = 72
            if (r10 > r5) goto L_0x03e1
            goto L_0x0391
        L_0x03e1:
            int r5 = setMin
            r5 = r5 | 5438(0x153e, float:7.62E-42)
            short r5 = (short) r5
            r6 = 379(0x17b, float:5.31E-43)
            short r6 = (short) r6
            byte[] r14 = setMax
            byte r14 = r14[r11]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r5 = setMin(r5, r6, r14)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0409
            r5 = 76
            if (r10 < r5) goto L_0x040b
            r6 = 105(0x69, float:1.47E-43)
            if (r10 > r6) goto L_0x040b
            r4 = 105(0x69, float:1.47E-43)
            goto L_0x0311
        L_0x0409:
            r5 = 76
        L_0x040b:
            int r4 = setMin
            r4 = r4 | 351(0x15f, float:4.92E-43)
            short r4 = (short) r4
            byte[] r6 = setMax
            byte r6 = r6[r11]
            int r6 = -r6
            byte r6 = (byte) r6
            java.lang.String r4 = setMin(r4, r13, r6)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x042d
            r4 = 99
            if (r10 < r4) goto L_0x042d
            r4 = 105(0x69, float:1.47E-43)
            if (r10 > r4) goto L_0x042f
            goto L_0x0452
        L_0x042d:
            r4 = 105(0x69, float:1.47E-43)
        L_0x042f:
            int r6 = setMin
            r6 = r6 | r9
            short r6 = (short) r6
            r9 = r6 & 1920(0x780, float:2.69E-42)
            short r9 = (short) r9
            byte[] r13 = setMax
            byte r13 = r13[r11]
            int r13 = -r13
            byte r13 = (byte) r13
            java.lang.String r6 = setMin(r6, r9, r13)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x045c
            r6 = 106(0x6a, float:1.49E-43)
            if (r10 < r6) goto L_0x045c
            r6 = 110(0x6e, float:1.54E-43)
            if (r10 > r6) goto L_0x045c
        L_0x0452:
            r1.IsOverlapping = r0
            r0 = 26
            r1.getMax(r0)
            r0 = r15
            goto L_0x02bb
        L_0x045c:
            throw r0
        L_0x045d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0465
            throw r1
        L_0x0465:
            goto L_0x0467
        L_0x0466:
            throw r0
        L_0x0467:
            goto L_0x0466
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.getPaymentResult():o.TitleBarRightButtonView$1");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x014b, code lost:
        r1.getMax(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0214, code lost:
        r6 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.TitleBarRightButtonView.AnonymousClass1<java.lang.Boolean> getQrInitResult() {
        /*
            r17 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r17
            r1.<init>(r2)
            int r0 = setMin
            r3 = r0 | 589(0x24d, float:8.25E-43)
            short r3 = (short) r3
            r0 = r0 | 101(0x65, float:1.42E-43)
            short r0 = (short) r0
            r4 = 73
            byte r4 = (byte) r4
            java.lang.String r0 = setMin(r3, r0, r4)
            int r3 = setMin
            r3 = r3 | 351(0x15f, float:4.92E-43)
            short r3 = (short) r3
            r4 = r3 & 1977(0x7b9, float:2.77E-42)
            short r4 = (short) r4
            r5 = 74
            byte r5 = (byte) r5
            java.lang.String r3 = setMin(r3, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x02bb }
            r6 = 0
            r5[r6] = r3     // Catch:{ all -> 0x02bb }
            r3 = 1282(0x502, float:1.796E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x02bb }
            int r7 = setMin     // Catch:{ all -> 0x02bb }
            r7 = r7 | 266(0x10a, float:3.73E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x02bb }
            byte[] r8 = setMax     // Catch:{ all -> 0x02bb }
            r9 = 22
            byte r8 = r8[r9]     // Catch:{ all -> 0x02bb }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x02bb }
            java.lang.String r7 = setMin(r3, r7, r8)     // Catch:{ all -> 0x02bb }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x02bb }
            r8 = 2363(0x93b, float:3.311E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x02bb }
            int r10 = setMin     // Catch:{ all -> 0x02bb }
            r10 = r10 | 277(0x115, float:3.88E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x02bb }
            byte[] r11 = setMax     // Catch:{ all -> 0x02bb }
            r12 = 21
            byte r11 = r11[r12]     // Catch:{ all -> 0x02bb }
            byte r11 = (byte) r11     // Catch:{ all -> 0x02bb }
            java.lang.String r8 = setMin(r8, r10, r11)     // Catch:{ all -> 0x02bb }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x02bb }
            int r11 = setMin     // Catch:{ all -> 0x02bb }
            r11 = r11 | 266(0x10a, float:3.73E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x02bb }
            byte[] r12 = setMax     // Catch:{ all -> 0x02bb }
            byte r12 = r12[r9]     // Catch:{ all -> 0x02bb }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x02bb }
            java.lang.String r11 = setMin(r3, r11, r12)     // Catch:{ all -> 0x02bb }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x02bb }
            r10[r6] = r11     // Catch:{ all -> 0x02bb }
            java.lang.reflect.Method r7 = r7.getMethod(r8, r10)     // Catch:{ all -> 0x02bb }
            java.lang.Object r0 = r7.invoke(r0, r5)     // Catch:{ all -> 0x02bb }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x02bb }
            int r5 = r0.length
            int[] r5 = new int[r5]
            r7 = 0
        L_0x007b:
            int r8 = r0.length
            r10 = 0
            if (r7 >= r8) goto L_0x011e
            r8 = r0[r7]
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x0115 }
            r11[r6] = r8     // Catch:{ all -> 0x0115 }
            r8 = 3658(0xe4a, float:5.126E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0115 }
            int r12 = setMin     // Catch:{ all -> 0x0115 }
            r12 = r12 | 265(0x109, float:3.71E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0115 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0115 }
            byte r13 = r13[r9]     // Catch:{ all -> 0x0115 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0115 }
            java.lang.String r12 = setMin(r8, r12, r13)     // Catch:{ all -> 0x0115 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0115 }
            int r13 = setMin     // Catch:{ all -> 0x0115 }
            r13 = r13 | 602(0x25a, float:8.44E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0115 }
            int r14 = setMin     // Catch:{ all -> 0x0115 }
            r14 = r14 | 275(0x113, float:3.85E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0115 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0115 }
            r16 = 4
            byte r15 = r15[r16]     // Catch:{ all -> 0x0115 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0115 }
            java.lang.String r13 = setMin(r13, r14, r15)     // Catch:{ all -> 0x0115 }
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x0115 }
            int r15 = setMin     // Catch:{ all -> 0x0115 }
            r15 = r15 | 266(0x10a, float:3.73E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0115 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0115 }
            byte r4 = r16[r9]     // Catch:{ all -> 0x0115 }
            int r4 = -r4
            byte r4 = (byte) r4     // Catch:{ all -> 0x0115 }
            java.lang.String r4 = setMin(r3, r15, r4)     // Catch:{ all -> 0x0115 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0115 }
            r14[r6] = r4     // Catch:{ all -> 0x0115 }
            java.lang.reflect.Method r4 = r12.getMethod(r13, r14)     // Catch:{ all -> 0x0115 }
            java.lang.Object r4 = r4.invoke(r10, r11)     // Catch:{ all -> 0x0115 }
            int r11 = setMin     // Catch:{ all -> 0x010c }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010c }
            byte[] r12 = setMax     // Catch:{ all -> 0x010c }
            byte r12 = r12[r9]     // Catch:{ all -> 0x010c }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x010c }
            java.lang.String r8 = setMin(r8, r11, r12)     // Catch:{ all -> 0x010c }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x010c }
            int r11 = setMin     // Catch:{ all -> 0x010c }
            r11 = r11 | 596(0x254, float:8.35E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010c }
            int r12 = setMin     // Catch:{ all -> 0x010c }
            r12 = r12 | 274(0x112, float:3.84E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x010c }
            byte[] r13 = setMax     // Catch:{ all -> 0x010c }
            r14 = 5678(0x162e, float:7.957E-42)
            byte r13 = r13[r14]     // Catch:{ all -> 0x010c }
            byte r13 = (byte) r13     // Catch:{ all -> 0x010c }
            java.lang.String r11 = setMin(r11, r12, r13)     // Catch:{ all -> 0x010c }
            java.lang.reflect.Method r8 = r8.getMethod(r11, r10)     // Catch:{ all -> 0x010c }
            java.lang.Object r4 = r8.invoke(r4, r10)     // Catch:{ all -> 0x010c }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x010c }
            int r4 = r4.intValue()     // Catch:{ all -> 0x010c }
            r5[r7] = r4
            int r7 = r7 + 1
            r4 = 1
            goto L_0x007b
        L_0x010c:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0114
            throw r1
        L_0x0114:
            throw r0
        L_0x0115:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011d
            throw r1
        L_0x011d:
            throw r0
        L_0x011e:
            r3 = 31
            r4 = 44
            r7 = 2
        L_0x0123:
            int r8 = r6 + 1
            r11 = 40
            r0 = r5[r6]     // Catch:{ all -> 0x0217 }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x0217 }
            r6 = 19
            r12 = 15
            r13 = 18
            r14 = 10
            switch(r0) {
                case -15: goto L_0x0200;
                case -14: goto L_0x01fd;
                case -13: goto L_0x01f5;
                case -12: goto L_0x01f1;
                case -11: goto L_0x01a1;
                case -10: goto L_0x018a;
                case -9: goto L_0x0176;
                case -8: goto L_0x0173;
                case -7: goto L_0x0170;
                case -6: goto L_0x016d;
                case -5: goto L_0x015f;
                case -4: goto L_0x014f;
                case -3: goto L_0x0146;
                case -2: goto L_0x013e;
                case -1: goto L_0x013b;
                default: goto L_0x0138;
            }     // Catch:{ all -> 0x0217 }
        L_0x0138:
            r12 = 1
            goto L_0x0214
        L_0x013b:
            r6 = 46
            goto L_0x0123
        L_0x013e:
            r1.getMax(r12)     // Catch:{ all -> 0x0217 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0217 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0217 }
            throw r0     // Catch:{ all -> 0x0217 }
        L_0x0146:
            int r0 = getMin     // Catch:{ all -> 0x0217 }
            r1.getMax = r0     // Catch:{ all -> 0x0217 }
            r6 = 1
        L_0x014b:
            r1.getMax(r6)     // Catch:{ all -> 0x0217 }
            goto L_0x0138
        L_0x014f:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x0217 }
            r1.getMax(r14)     // Catch:{ all -> 0x0217 }
            r0 = 11
            r1.getMax(r0)     // Catch:{ all -> 0x0217 }
            int r0 = r1.length     // Catch:{ all -> 0x0217 }
            length = r0     // Catch:{ all -> 0x0217 }
            goto L_0x0138
        L_0x015f:
            r0 = 12
            r1.getMax(r0)     // Catch:{ all -> 0x0217 }
            int r0 = r1.length     // Catch:{ all -> 0x0217 }
            if (r0 != 0) goto L_0x0214
            r0 = 30
            r6 = 30
            goto L_0x0123
        L_0x016d:
            r6 = 52
            goto L_0x0123
        L_0x0170:
            r6 = 31
            goto L_0x0123
        L_0x0173:
            r6 = 54
            goto L_0x0123
        L_0x0176:
            r12 = 1
            r1.getMax = r12     // Catch:{ all -> 0x019e }
            r1.getMax(r14)     // Catch:{ all -> 0x0217 }
            r1.getMax(r13)     // Catch:{ all -> 0x0217 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0217 }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x0217 }
            o.getExtensionMetaInfos r0 = r0.createQrPayData()     // Catch:{ all -> 0x0217 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x0217 }
            goto L_0x014b
        L_0x018a:
            r12 = 1
            r1.getMax = r12     // Catch:{ all -> 0x019e }
            r1.getMax(r14)     // Catch:{ all -> 0x0217 }
            r1.getMax(r13)     // Catch:{ all -> 0x0217 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0217 }
            o.getExtensionMetaInfos r0 = (o.getExtensionMetaInfos) r0     // Catch:{ all -> 0x0217 }
            o.TitleBarRightButtonView$1 r0 = r0.getQrInitResult()     // Catch:{ all -> 0x0217 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x0217 }
            goto L_0x014b
        L_0x019e:
            r0 = move-exception
            goto L_0x0219
        L_0x01a1:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x0217 }
            r1.getMax(r14)     // Catch:{ all -> 0x0217 }
            r1.getMax(r13)     // Catch:{ all -> 0x0217 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0217 }
            r6 = 43
            short r6 = (short) r6
            int r12 = setMin     // Catch:{ all -> 0x01e8 }
            r12 = r12 | 266(0x10a, float:3.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x01e8 }
            byte[] r13 = setMax     // Catch:{ all -> 0x01e8 }
            byte r13 = r13[r9]     // Catch:{ all -> 0x01e8 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x01e8 }
            java.lang.String r6 = setMin(r6, r12, r13)     // Catch:{ all -> 0x01e8 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x01e8 }
            r12 = 1844(0x734, float:2.584E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x01e8 }
            int r13 = setMin     // Catch:{ all -> 0x01e8 }
            r13 = r13 | 274(0x112, float:3.84E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x01e8 }
            byte[] r14 = setMax     // Catch:{ all -> 0x01e8 }
            r15 = 2093(0x82d, float:2.933E-42)
            byte r14 = r14[r15]     // Catch:{ all -> 0x01e8 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x01e8 }
            java.lang.String r12 = setMin(r12, r13, r14)     // Catch:{ all -> 0x01e8 }
            java.lang.reflect.Method r6 = r6.getMethod(r12, r10)     // Catch:{ all -> 0x01e8 }
            java.lang.Object r0 = r6.invoke(r0, r10)     // Catch:{ all -> 0x01e8 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01e8 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x01e8 }
            r1.getMax = r0     // Catch:{ all -> 0x0217 }
            r6 = 1
            goto L_0x014b
        L_0x01e8:
            r0 = move-exception
            java.lang.Throwable r6 = r0.getCause()     // Catch:{ all -> 0x0217 }
            if (r6 == 0) goto L_0x01f0
            throw r6     // Catch:{ all -> 0x0217 }
        L_0x01f0:
            throw r0     // Catch:{ all -> 0x0217 }
        L_0x01f1:
            r6 = 44
            goto L_0x0123
        L_0x01f5:
            r1.getMax(r12)     // Catch:{ all -> 0x0217 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0217 }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x0217 }
            return r0
        L_0x01fd:
            r6 = 2
            goto L_0x0123
        L_0x0200:
            r0 = 34
            r1.getMax(r0)     // Catch:{ all -> 0x0217 }
            int r0 = r1.length     // Catch:{ all -> 0x0217 }
            r6 = 33
            r12 = 1
            if (r0 == 0) goto L_0x0123
            if (r0 == r12) goto L_0x0210
            goto L_0x0123
        L_0x0210:
            r6 = 40
            goto L_0x0123
        L_0x0214:
            r6 = r8
            goto L_0x0123
        L_0x0217:
            r0 = move-exception
            r12 = 1
        L_0x0219:
            r6 = 3642(0xe3a, float:5.104E-42)
            short r6 = (short) r6
            r13 = 382(0x17e, float:5.35E-43)
            short r13 = (short) r13
            byte[] r14 = setMax
            byte r14 = r14[r9]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r6 = setMin(r6, r13, r14)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            r13 = 26
            r14 = 51
            if (r6 == 0) goto L_0x023e
            if (r8 < r7) goto L_0x023e
            if (r8 > r3) goto L_0x023e
            r6 = 1
            goto L_0x02b1
        L_0x023e:
            int r6 = setMin
            r15 = r6 | 97
            short r15 = (short) r15
            r6 = r6 | 263(0x107, float:3.69E-43)
            short r6 = (short) r6
            byte[] r16 = setMax
            byte r3 = r16[r9]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r3 = setMin(r15, r6, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0263
            if (r8 < r13) goto L_0x0263
            r3 = 27
            if (r8 > r3) goto L_0x0263
        L_0x0260:
            r6 = 51
            goto L_0x02b1
        L_0x0263:
            r3 = 36
            if (r8 < r3) goto L_0x026e
            if (r8 > r11) goto L_0x026e
            r3 = 55
            r6 = 55
            goto L_0x02b1
        L_0x026e:
            int r3 = setMin
            r3 = r3 | 5194(0x144a, float:7.278E-42)
            short r3 = (short) r3
            r6 = 375(0x177, float:5.25E-43)
            short r6 = (short) r6
            byte[] r15 = setMax
            byte r15 = r15[r9]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r3 = setMin(r3, r6, r15)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0291
            r3 = 35
            if (r8 < r3) goto L_0x0291
            if (r8 > r11) goto L_0x0291
            goto L_0x0260
        L_0x0291:
            int r3 = setMin
            r3 = r3 | 5194(0x144a, float:7.278E-42)
            short r3 = (short) r3
            byte[] r11 = setMax
            byte r11 = r11[r9]
            int r11 = -r11
            byte r11 = (byte) r11
            java.lang.String r3 = setMin(r3, r6, r11)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x02ba
            r3 = 42
            if (r8 < r3) goto L_0x02ba
            if (r8 > r4) goto L_0x02ba
            goto L_0x0260
        L_0x02b1:
            r1.IsOverlapping = r0
            r1.getMax(r13)
            r3 = 31
            goto L_0x0123
        L_0x02ba:
            throw r0
        L_0x02bb:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02c3
            throw r1
        L_0x02c3:
            goto L_0x02c5
        L_0x02c4:
            throw r0
        L_0x02c5:
            goto L_0x02c4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.getQrInitResult():o.TitleBarRightButtonView$1");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x033a, code lost:
        if (r12 <= 47) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02fc, code lost:
        if (r12 <= 36) goto L_0x02fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.TitleBarRightButtonView.AnonymousClass1<java.lang.Boolean> init() {
        /*
            r18 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r18
            r1.<init>(r2)
            int r0 = setMin
            r0 = r0 | 1859(0x743, float:2.605E-42)
            short r0 = (short) r0
            r3 = 266(0x10a, float:3.73E-43)
            short r4 = (short) r3
            r5 = 73
            byte r5 = (byte) r5
            java.lang.String r0 = setMin(r0, r4, r5)
            int r4 = setMin
            r4 = r4 | 351(0x15f, float:4.92E-43)
            short r4 = (short) r4
            r5 = r4 & 1977(0x7b9, float:2.77E-42)
            short r5 = (short) r5
            r6 = 74
            byte r6 = (byte) r6
            java.lang.String r4 = setMin(r4, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x036f }
            r7 = 0
            r6[r7] = r4     // Catch:{ all -> 0x036f }
            r4 = 1282(0x502, float:1.796E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x036f }
            int r8 = setMin     // Catch:{ all -> 0x036f }
            r8 = r8 | r3
            short r8 = (short) r8     // Catch:{ all -> 0x036f }
            byte[] r9 = setMax     // Catch:{ all -> 0x036f }
            r10 = 22
            byte r9 = r9[r10]     // Catch:{ all -> 0x036f }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x036f }
            java.lang.String r8 = setMin(r4, r8, r9)     // Catch:{ all -> 0x036f }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x036f }
            r9 = 2363(0x93b, float:3.311E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x036f }
            int r11 = setMin     // Catch:{ all -> 0x036f }
            r11 = r11 | 277(0x115, float:3.88E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x036f }
            byte[] r12 = setMax     // Catch:{ all -> 0x036f }
            r13 = 21
            byte r12 = r12[r13]     // Catch:{ all -> 0x036f }
            byte r12 = (byte) r12     // Catch:{ all -> 0x036f }
            java.lang.String r9 = setMin(r9, r11, r12)     // Catch:{ all -> 0x036f }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x036f }
            int r12 = setMin     // Catch:{ all -> 0x036f }
            r12 = r12 | r3
            short r12 = (short) r12     // Catch:{ all -> 0x036f }
            byte[] r13 = setMax     // Catch:{ all -> 0x036f }
            byte r13 = r13[r10]     // Catch:{ all -> 0x036f }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x036f }
            java.lang.String r12 = setMin(r4, r12, r13)     // Catch:{ all -> 0x036f }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x036f }
            r11[r7] = r12     // Catch:{ all -> 0x036f }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r11)     // Catch:{ all -> 0x036f }
            java.lang.Object r0 = r8.invoke(r0, r6)     // Catch:{ all -> 0x036f }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x036f }
            int r6 = r0.length
            int[] r6 = new int[r6]
            r8 = 0
        L_0x0079:
            int r9 = r0.length
            if (r8 >= r9) goto L_0x011c
            r9 = r0[r8]
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0113 }
            r11[r7] = r9     // Catch:{ all -> 0x0113 }
            r9 = 3658(0xe4a, float:5.126E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0113 }
            int r12 = setMin     // Catch:{ all -> 0x0113 }
            r12 = r12 | 265(0x109, float:3.71E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0113 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0113 }
            byte r13 = r13[r10]     // Catch:{ all -> 0x0113 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0113 }
            java.lang.String r12 = setMin(r9, r12, r13)     // Catch:{ all -> 0x0113 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0113 }
            int r13 = setMin     // Catch:{ all -> 0x0113 }
            r13 = r13 | 602(0x25a, float:8.44E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0113 }
            int r14 = setMin     // Catch:{ all -> 0x0113 }
            r14 = r14 | 275(0x113, float:3.85E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0113 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0113 }
            r16 = 4
            byte r15 = r15[r16]     // Catch:{ all -> 0x0113 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0113 }
            java.lang.String r13 = setMin(r13, r14, r15)     // Catch:{ all -> 0x0113 }
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x0113 }
            int r15 = setMin     // Catch:{ all -> 0x0113 }
            r15 = r15 | r3
            short r15 = (short) r15     // Catch:{ all -> 0x0113 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0113 }
            byte r3 = r16[r10]     // Catch:{ all -> 0x0113 }
            int r3 = -r3
            byte r3 = (byte) r3     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = setMin(r4, r15, r3)     // Catch:{ all -> 0x0113 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0113 }
            r14[r7] = r3     // Catch:{ all -> 0x0113 }
            java.lang.reflect.Method r3 = r12.getMethod(r13, r14)     // Catch:{ all -> 0x0113 }
            r12 = 0
            java.lang.Object r3 = r3.invoke(r12, r11)     // Catch:{ all -> 0x0113 }
            int r11 = setMin     // Catch:{ all -> 0x010a }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010a }
            byte[] r13 = setMax     // Catch:{ all -> 0x010a }
            byte r13 = r13[r10]     // Catch:{ all -> 0x010a }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x010a }
            java.lang.String r9 = setMin(r9, r11, r13)     // Catch:{ all -> 0x010a }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x010a }
            int r11 = setMin     // Catch:{ all -> 0x010a }
            r11 = r11 | 596(0x254, float:8.35E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010a }
            int r13 = setMin     // Catch:{ all -> 0x010a }
            r13 = r13 | 274(0x112, float:3.84E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x010a }
            byte[] r14 = setMax     // Catch:{ all -> 0x010a }
            r15 = 5678(0x162e, float:7.957E-42)
            byte r14 = r14[r15]     // Catch:{ all -> 0x010a }
            byte r14 = (byte) r14     // Catch:{ all -> 0x010a }
            java.lang.String r11 = setMin(r11, r13, r14)     // Catch:{ all -> 0x010a }
            java.lang.reflect.Method r9 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x010a }
            java.lang.Object r3 = r9.invoke(r3, r12)     // Catch:{ all -> 0x010a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x010a }
            int r3 = r3.intValue()     // Catch:{ all -> 0x010a }
            r6[r8] = r3
            int r8 = r8 + 1
            r3 = 266(0x10a, float:3.73E-43)
            goto L_0x0079
        L_0x010a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0112
            throw r1
        L_0x0112:
            throw r0
        L_0x0113:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011b
            throw r1
        L_0x011b:
            throw r0
        L_0x011c:
            r3 = 16
            r8 = 30
            r11 = 18
        L_0x0122:
            int r12 = r7 + 1
            r13 = 11
            r14 = 2
            r0 = r6[r7]     // Catch:{ all -> 0x0228 }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x0228 }
            r7 = 12
            r15 = 15
            r4 = 19
            r9 = 10
            switch(r0) {
                case -21: goto L_0x0221;
                case -20: goto L_0x0214;
                case -19: goto L_0x0210;
                case -18: goto L_0x020c;
                case -17: goto L_0x01f1;
                case -16: goto L_0x01de;
                case -15: goto L_0x01cb;
                case -14: goto L_0x01c8;
                case -13: goto L_0x01ae;
                case -12: goto L_0x01a9;
                case -11: goto L_0x018f;
                case -10: goto L_0x0177;
                case -9: goto L_0x016f;
                case -8: goto L_0x016c;
                case -7: goto L_0x0164;
                case -6: goto L_0x0161;
                case -5: goto L_0x015e;
                case -4: goto L_0x0154;
                case -3: goto L_0x0146;
                case -2: goto L_0x013d;
                case -1: goto L_0x013a;
                default: goto L_0x0138;
            }     // Catch:{ all -> 0x0228 }
        L_0x0138:
            goto L_0x0225
        L_0x013a:
            r7 = 18
            goto L_0x0122
        L_0x013d:
            int r0 = getMin     // Catch:{ all -> 0x0228 }
            r1.getMax = r0     // Catch:{ all -> 0x0228 }
            r1.getMax(r5)     // Catch:{ all -> 0x0228 }
            goto L_0x0225
        L_0x0146:
            r1.getMax = r5     // Catch:{ all -> 0x0228 }
            r1.getMax(r9)     // Catch:{ all -> 0x0228 }
            r1.getMax(r13)     // Catch:{ all -> 0x0228 }
            int r0 = r1.length     // Catch:{ all -> 0x0228 }
            length = r0     // Catch:{ all -> 0x0228 }
            goto L_0x0225
        L_0x0154:
            r1.getMax(r7)     // Catch:{ all -> 0x0228 }
            int r0 = r1.length     // Catch:{ all -> 0x0228 }
            if (r0 != 0) goto L_0x0225
            r7 = 15
            goto L_0x0122
        L_0x015e:
            r7 = 37
            goto L_0x0122
        L_0x0161:
            r7 = 16
            goto L_0x0122
        L_0x0164:
            r1.getMax(r15)     // Catch:{ all -> 0x0228 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0228 }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x0228 }
            return r0
        L_0x016c:
            r7 = 38
            goto L_0x0122
        L_0x016f:
            r1.getMax(r15)     // Catch:{ all -> 0x0228 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0228 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0228 }
            throw r0     // Catch:{ all -> 0x0228 }
        L_0x0177:
            o.getRegisteredActionCount r0 = new o.getRegisteredActionCount     // Catch:{ all -> 0x0228 }
            r1.getMax = r5     // Catch:{ all -> 0x0228 }
            r1.getMax(r9)     // Catch:{ all -> 0x0228 }
            r1.getMax(r11)     // Catch:{ all -> 0x0228 }
            java.lang.Object r7 = r1.toIntRange     // Catch:{ all -> 0x0228 }
            o.DefaultExtensionRegistry r7 = (o.DefaultExtensionRegistry) r7     // Catch:{ all -> 0x0228 }
            r0.<init>(r7)     // Catch:{ all -> 0x0228 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x0228 }
        L_0x018a:
            r1.getMax(r4)     // Catch:{ all -> 0x0228 }
            goto L_0x0225
        L_0x018f:
            r1.getMax = r14     // Catch:{ all -> 0x0228 }
            r1.getMax(r9)     // Catch:{ all -> 0x0228 }
            r1.getMax(r11)     // Catch:{ all -> 0x0228 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0228 }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x0228 }
            r1.getMax(r11)     // Catch:{ all -> 0x0228 }
            java.lang.Object r7 = r1.toIntRange     // Catch:{ all -> 0x0228 }
            o.RedDotManager r7 = (o.RedDotManager) r7     // Catch:{ all -> 0x0228 }
            o.TitleBarRightButtonView$1 r0 = r0.doOnNext(r7)     // Catch:{ all -> 0x0228 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x0228 }
            goto L_0x018a
        L_0x01a9:
            o.setPointToExtensionRegistry r0 = o.setPointToExtensionRegistry.setMax     // Catch:{ all -> 0x0228 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x0228 }
            goto L_0x018a
        L_0x01ae:
            r1.getMax = r14     // Catch:{ all -> 0x0228 }
            r1.getMax(r9)     // Catch:{ all -> 0x0228 }
            r1.getMax(r11)     // Catch:{ all -> 0x0228 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0228 }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x0228 }
            r1.getMax(r11)     // Catch:{ all -> 0x0228 }
            java.lang.Object r7 = r1.toIntRange     // Catch:{ all -> 0x0228 }
            o.RedDotDrawable r7 = (o.RedDotDrawable) r7     // Catch:{ all -> 0x0228 }
            o.TitleBarRightButtonView$1 r0 = r0.map(r7)     // Catch:{ all -> 0x0228 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x0228 }
            goto L_0x018a
        L_0x01c8:
            r7 = 1
            goto L_0x0122
        L_0x01cb:
            r1.getMax = r5     // Catch:{ all -> 0x0228 }
            r1.getMax(r9)     // Catch:{ all -> 0x0228 }
            r1.getMax(r11)     // Catch:{ all -> 0x0228 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0228 }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x0228 }
            o.setDrawDivider r0 = r0.createAccountData()     // Catch:{ all -> 0x0228 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x0228 }
            goto L_0x018a
        L_0x01de:
            r1.getMax = r5     // Catch:{ all -> 0x0228 }
            r1.getMax(r9)     // Catch:{ all -> 0x0228 }
            r1.getMax(r11)     // Catch:{ all -> 0x0228 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0228 }
            o.setDrawDivider r0 = (o.setDrawDivider) r0     // Catch:{ all -> 0x0228 }
            o.TitleBarRightButtonView$1 r0 = r0.getOfflinePublicKey()     // Catch:{ all -> 0x0228 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x0228 }
            goto L_0x018a
        L_0x01f1:
            r1.getMax = r14     // Catch:{ all -> 0x0228 }
            r1.getMax(r9)     // Catch:{ all -> 0x0228 }
            r1.getMax(r11)     // Catch:{ all -> 0x0228 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x0228 }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x0228 }
            r1.getMax(r11)     // Catch:{ all -> 0x0228 }
            java.lang.Object r7 = r1.toIntRange     // Catch:{ all -> 0x0228 }
            o.TitleBarRightButtonView$1 r7 = (o.TitleBarRightButtonView.AnonymousClass1) r7     // Catch:{ all -> 0x0228 }
            o.TitleBarRightButtonView$1 r0 = r0.keyedRequest(r7)     // Catch:{ all -> 0x0228 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x0228 }
            goto L_0x018a
        L_0x020c:
            r7 = 24
            goto L_0x0122
        L_0x0210:
            r7 = 30
            goto L_0x0122
        L_0x0214:
            r1.getMax(r7)     // Catch:{ all -> 0x0228 }
            int r0 = r1.length     // Catch:{ all -> 0x0228 }
            if (r0 != 0) goto L_0x0225
            r0 = 46
            r7 = 46
            goto L_0x0122
        L_0x0221:
            r7 = 36
            goto L_0x0122
        L_0x0225:
            r7 = r12
            goto L_0x0122
        L_0x0228:
            r0 = move-exception
            byte[] r4 = setMax
            r7 = 2117(0x845, float:2.967E-42)
            byte r7 = r4[r7]
            short r7 = (short) r7
            r9 = r7 | 353(0x161, float:4.95E-43)
            short r9 = (short) r9
            byte r4 = r4[r10]
            int r4 = -r4
            byte r4 = (byte) r4
            java.lang.String r4 = setMin(r7, r9, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            r7 = 26
            r9 = 23
            if (r4 == 0) goto L_0x0253
            if (r12 < r5) goto L_0x0253
            if (r12 > r14) goto L_0x0253
        L_0x024d:
            r4 = 38
        L_0x024f:
            r13 = 36
            goto L_0x0365
        L_0x0253:
            int r4 = setMin
            r4 = r4 | 351(0x15f, float:4.92E-43)
            short r4 = (short) r4
            r14 = 376(0x178, float:5.27E-43)
            short r15 = (short) r14
            byte[] r17 = setMax
            byte r5 = r17[r10]
            int r5 = -r5
            byte r5 = (byte) r5
            java.lang.String r4 = setMin(r4, r15, r5)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0278
            if (r12 < r13) goto L_0x0278
            if (r12 > r3) goto L_0x0278
        L_0x0273:
            r4 = 38
            r9 = 22
            goto L_0x024f
        L_0x0278:
            int r4 = setMin
            r4 = r4 | 351(0x15f, float:4.92E-43)
            short r4 = (short) r4
            byte[] r5 = setMax
            byte r5 = r5[r10]
            int r5 = -r5
            byte r5 = (byte) r5
            java.lang.String r4 = setMin(r4, r15, r5)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            r5 = 27
            if (r4 == 0) goto L_0x0298
            if (r12 < r7) goto L_0x0298
            if (r12 > r5) goto L_0x0298
            goto L_0x024d
        L_0x0298:
            r4 = 3642(0xe3a, float:5.104E-42)
            short r4 = (short) r4
            r13 = 382(0x17e, float:5.35E-43)
            short r13 = (short) r13
            byte[] r15 = setMax
            byte r15 = r15[r10]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r4 = setMin(r4, r13, r15)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02b7
            if (r12 < r5) goto L_0x02b7
            if (r12 > r8) goto L_0x02b7
            goto L_0x024d
        L_0x02b7:
            int r4 = setMin
            r5 = r4 | 97
            short r5 = (short) r5
            r4 = r4 | 263(0x107, float:3.69E-43)
            short r4 = (short) r4
            byte[] r13 = setMax
            byte r13 = r13[r10]
            int r13 = -r13
            byte r13 = (byte) r13
            java.lang.String r4 = setMin(r5, r4, r13)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02dc
            r4 = 28
            if (r12 < r4) goto L_0x02dc
            r4 = 29
            if (r12 > r4) goto L_0x02dc
            goto L_0x0273
        L_0x02dc:
            r4 = 768(0x300, float:1.076E-42)
            short r4 = (short) r4
            r5 = 371(0x173, float:5.2E-43)
            short r5 = (short) r5
            byte[] r13 = setMax
            byte r13 = r13[r10]
            int r13 = -r13
            byte r13 = (byte) r13
            java.lang.String r13 = setMin(r4, r5, r13)
            java.lang.Class r13 = java.lang.Class.forName(r13)
            boolean r13 = r13.isInstance(r0)
            if (r13 == 0) goto L_0x0301
            r13 = 31
            if (r12 < r13) goto L_0x0301
            r13 = 36
            if (r12 > r13) goto L_0x0303
        L_0x02fe:
            r4 = 38
            goto L_0x0365
        L_0x0301:
            r13 = 36
        L_0x0303:
            byte[] r15 = setMax
            byte r15 = r15[r10]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r15 = setMin(r4, r5, r15)
            java.lang.Class r15 = java.lang.Class.forName(r15)
            boolean r15 = r15.isInstance(r0)
            if (r15 == 0) goto L_0x0320
            r15 = 32
            if (r12 < r15) goto L_0x0320
            r15 = 33
            if (r12 > r15) goto L_0x0320
            goto L_0x02fe
        L_0x0320:
            byte[] r9 = setMax
            byte r9 = r9[r10]
            int r9 = -r9
            byte r9 = (byte) r9
            java.lang.String r4 = setMin(r4, r5, r9)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x033f
            r4 = 38
            if (r12 < r4) goto L_0x0341
            r5 = 47
            if (r12 > r5) goto L_0x0341
        L_0x033c:
            r9 = 22
            goto L_0x0365
        L_0x033f:
            r4 = 38
        L_0x0341:
            int r5 = setMin
            r5 = r5 | r14
            short r5 = (short) r5
            r9 = r5 & 1920(0x780, float:2.69E-42)
            short r9 = (short) r9
            byte[] r14 = setMax
            byte r14 = r14[r10]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r5 = setMin(r5, r9, r14)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x036e
            r5 = 42
            if (r12 < r5) goto L_0x036e
            r5 = 43
            if (r12 > r5) goto L_0x036e
            goto L_0x033c
        L_0x0365:
            r1.IsOverlapping = r0
            r1.getMax(r7)
            r7 = r9
            r5 = 1
            goto L_0x0122
        L_0x036e:
            throw r0
        L_0x036f:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0377
            throw r1
        L_0x0377:
            goto L_0x0379
        L_0x0378:
            throw r0
        L_0x0379:
            goto L_0x0378
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.init():o.TitleBarRightButtonView$1");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02bb, code lost:
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0350, code lost:
        if (r11 <= 30) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03e3, code lost:
        if (r11 <= 49) goto L_0x040e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x015d, code lost:
        r1.getMax(19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r1.getMax(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.TitleBarRightButtonView.AnonymousClass1<java.lang.Boolean> initOfflinePay() {
        /*
            r20 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r20
            r1.<init>(r2)
            int r0 = setMin
            r0 = r0 | 318(0x13e, float:4.46E-43)
            short r0 = (short) r0
            r3 = r0 & 765(0x2fd, float:1.072E-42)
            short r3 = (short) r3
            r4 = 73
            byte r4 = (byte) r4
            java.lang.String r0 = setMin(r0, r3, r4)
            int r3 = setMin
            r3 = r3 | 351(0x15f, float:4.92E-43)
            short r3 = (short) r3
            r4 = r3 & 1977(0x7b9, float:2.77E-42)
            short r4 = (short) r4
            r5 = 74
            byte r5 = (byte) r5
            java.lang.String r3 = setMin(r3, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x041a }
            r6 = 0
            r5[r6] = r3     // Catch:{ all -> 0x041a }
            r3 = 1282(0x502, float:1.796E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x041a }
            int r7 = setMin     // Catch:{ all -> 0x041a }
            r7 = r7 | 266(0x10a, float:3.73E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x041a }
            byte[] r8 = setMax     // Catch:{ all -> 0x041a }
            r9 = 22
            byte r8 = r8[r9]     // Catch:{ all -> 0x041a }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x041a }
            java.lang.String r7 = setMin(r3, r7, r8)     // Catch:{ all -> 0x041a }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x041a }
            r8 = 2363(0x93b, float:3.311E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x041a }
            int r10 = setMin     // Catch:{ all -> 0x041a }
            r10 = r10 | 277(0x115, float:3.88E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x041a }
            byte[] r11 = setMax     // Catch:{ all -> 0x041a }
            r12 = 21
            byte r11 = r11[r12]     // Catch:{ all -> 0x041a }
            byte r11 = (byte) r11     // Catch:{ all -> 0x041a }
            java.lang.String r8 = setMin(r8, r10, r11)     // Catch:{ all -> 0x041a }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x041a }
            int r11 = setMin     // Catch:{ all -> 0x041a }
            r11 = r11 | 266(0x10a, float:3.73E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x041a }
            byte[] r12 = setMax     // Catch:{ all -> 0x041a }
            byte r12 = r12[r9]     // Catch:{ all -> 0x041a }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x041a }
            java.lang.String r11 = setMin(r3, r11, r12)     // Catch:{ all -> 0x041a }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x041a }
            r10[r6] = r11     // Catch:{ all -> 0x041a }
            java.lang.reflect.Method r7 = r7.getMethod(r8, r10)     // Catch:{ all -> 0x041a }
            java.lang.Object r0 = r7.invoke(r0, r5)     // Catch:{ all -> 0x041a }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x041a }
            int r5 = r0.length
            int[] r5 = new int[r5]
            r7 = 0
        L_0x007b:
            int r8 = r0.length
            r10 = 0
            if (r7 >= r8) goto L_0x011e
            r8 = r0[r7]
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x0115 }
            r11[r6] = r8     // Catch:{ all -> 0x0115 }
            r8 = 3658(0xe4a, float:5.126E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0115 }
            int r12 = setMin     // Catch:{ all -> 0x0115 }
            r12 = r12 | 265(0x109, float:3.71E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0115 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0115 }
            byte r13 = r13[r9]     // Catch:{ all -> 0x0115 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0115 }
            java.lang.String r12 = setMin(r8, r12, r13)     // Catch:{ all -> 0x0115 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0115 }
            int r13 = setMin     // Catch:{ all -> 0x0115 }
            r13 = r13 | 602(0x25a, float:8.44E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0115 }
            int r14 = setMin     // Catch:{ all -> 0x0115 }
            r14 = r14 | 275(0x113, float:3.85E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0115 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0115 }
            r16 = 4
            byte r15 = r15[r16]     // Catch:{ all -> 0x0115 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0115 }
            java.lang.String r13 = setMin(r13, r14, r15)     // Catch:{ all -> 0x0115 }
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x0115 }
            int r15 = setMin     // Catch:{ all -> 0x0115 }
            r15 = r15 | 266(0x10a, float:3.73E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0115 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0115 }
            byte r4 = r16[r9]     // Catch:{ all -> 0x0115 }
            int r4 = -r4
            byte r4 = (byte) r4     // Catch:{ all -> 0x0115 }
            java.lang.String r4 = setMin(r3, r15, r4)     // Catch:{ all -> 0x0115 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0115 }
            r14[r6] = r4     // Catch:{ all -> 0x0115 }
            java.lang.reflect.Method r4 = r12.getMethod(r13, r14)     // Catch:{ all -> 0x0115 }
            java.lang.Object r4 = r4.invoke(r10, r11)     // Catch:{ all -> 0x0115 }
            int r11 = setMin     // Catch:{ all -> 0x010c }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010c }
            byte[] r12 = setMax     // Catch:{ all -> 0x010c }
            byte r12 = r12[r9]     // Catch:{ all -> 0x010c }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x010c }
            java.lang.String r8 = setMin(r8, r11, r12)     // Catch:{ all -> 0x010c }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x010c }
            int r11 = setMin     // Catch:{ all -> 0x010c }
            r11 = r11 | 596(0x254, float:8.35E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010c }
            int r12 = setMin     // Catch:{ all -> 0x010c }
            r12 = r12 | 274(0x112, float:3.84E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x010c }
            byte[] r13 = setMax     // Catch:{ all -> 0x010c }
            r14 = 5678(0x162e, float:7.957E-42)
            byte r13 = r13[r14]     // Catch:{ all -> 0x010c }
            byte r13 = (byte) r13     // Catch:{ all -> 0x010c }
            java.lang.String r11 = setMin(r11, r12, r13)     // Catch:{ all -> 0x010c }
            java.lang.reflect.Method r8 = r8.getMethod(r11, r10)     // Catch:{ all -> 0x010c }
            java.lang.Object r4 = r8.invoke(r4, r10)     // Catch:{ all -> 0x010c }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x010c }
            int r4 = r4.intValue()     // Catch:{ all -> 0x010c }
            r5[r7] = r4
            int r7 = r7 + 1
            r4 = 1
            goto L_0x007b
        L_0x010c:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0114
            throw r1
        L_0x0114:
            throw r0
        L_0x0115:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011d
            throw r1
        L_0x011d:
            throw r0
        L_0x011e:
            r3 = 14
            r8 = 7
        L_0x0121:
            int r11 = r6 + 1
            r12 = 34
            r13 = 11
            r14 = 15
            r0 = r5[r6]     // Catch:{ all -> 0x02be }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x02be }
            r6 = 2
            r15 = 19
            r4 = 10
            r7 = 18
            switch(r0) {
                case -26: goto L_0x02b7;
                case -25: goto L_0x02b4;
                case -24: goto L_0x02a1;
                case -23: goto L_0x0293;
                case -22: goto L_0x028c;
                case -21: goto L_0x0289;
                case -20: goto L_0x0281;
                case -19: goto L_0x0266;
                case -18: goto L_0x0251;
                case -17: goto L_0x023c;
                case -16: goto L_0x0234;
                case -15: goto L_0x01e1;
                case -14: goto L_0x01ca;
                case -13: goto L_0x01c6;
                case -12: goto L_0x01c2;
                case -11: goto L_0x01b3;
                case -10: goto L_0x01a5;
                case -9: goto L_0x019b;
                case -8: goto L_0x0193;
                case -7: goto L_0x0190;
                case -6: goto L_0x0176;
                case -5: goto L_0x0161;
                case -4: goto L_0x0144;
                case -3: goto L_0x0141;
                case -2: goto L_0x013e;
                case -1: goto L_0x013c;
                default: goto L_0x0139;
            }     // Catch:{ all -> 0x02be }
        L_0x0139:
            r6 = 1
            goto L_0x02bb
        L_0x013c:
            r6 = 3
            goto L_0x0121
        L_0x013e:
            r6 = 32
            goto L_0x0121
        L_0x0141:
            r6 = 14
            goto L_0x0121
        L_0x0144:
            r1.getMax = r6     // Catch:{ all -> 0x02be }
            r1.getMax(r4)     // Catch:{ all -> 0x02be }
            r1.getMax(r7)     // Catch:{ all -> 0x02be }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02be }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x02be }
            r1.getMax(r7)     // Catch:{ all -> 0x02be }
            java.lang.Object r4 = r1.toIntRange     // Catch:{ all -> 0x02be }
            o.hasCornerMarking r4 = (o.hasCornerMarking) r4     // Catch:{ all -> 0x02be }
            o.TitleBarRightButtonView$1 r0 = r0.observeOn(r4)     // Catch:{ all -> 0x02be }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02be }
        L_0x015d:
            r1.getMax(r15)     // Catch:{ all -> 0x02be }
            goto L_0x0139
        L_0x0161:
            o.getPointToExtensionRegistry r0 = new o.getPointToExtensionRegistry     // Catch:{ all -> 0x02be }
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x02b2 }
            r1.getMax(r4)     // Catch:{ all -> 0x02be }
            r1.getMax(r7)     // Catch:{ all -> 0x02be }
            java.lang.Object r4 = r1.toIntRange     // Catch:{ all -> 0x02be }
            o.DefaultExtensionRegistry r4 = (o.DefaultExtensionRegistry) r4     // Catch:{ all -> 0x02be }
            r0.<init>(r4)     // Catch:{ all -> 0x02be }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02be }
            goto L_0x015d
        L_0x0176:
            r1.getMax = r6     // Catch:{ all -> 0x02be }
            r1.getMax(r4)     // Catch:{ all -> 0x02be }
            r1.getMax(r7)     // Catch:{ all -> 0x02be }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02be }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x02be }
            r1.getMax(r7)     // Catch:{ all -> 0x02be }
            java.lang.Object r4 = r1.toIntRange     // Catch:{ all -> 0x02be }
            o.RedDotDrawable r4 = (o.RedDotDrawable) r4     // Catch:{ all -> 0x02be }
            o.TitleBarRightButtonView$1 r0 = r0.flatMap(r4)     // Catch:{ all -> 0x02be }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02be }
            goto L_0x015d
        L_0x0190:
            r6 = 48
            goto L_0x0121
        L_0x0193:
            r1.getMax(r14)     // Catch:{ all -> 0x02be }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02be }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x02be }
            throw r0     // Catch:{ all -> 0x02be }
        L_0x019b:
            int r0 = getMin     // Catch:{ all -> 0x02be }
            r1.getMax = r0     // Catch:{ all -> 0x02be }
            r6 = 1
        L_0x01a0:
            r1.getMax(r6)     // Catch:{ all -> 0x02b2 }
            goto L_0x02bb
        L_0x01a5:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x02b2 }
            r1.getMax(r4)     // Catch:{ all -> 0x02be }
            r1.getMax(r13)     // Catch:{ all -> 0x02be }
            int r0 = r1.length     // Catch:{ all -> 0x02be }
            length = r0     // Catch:{ all -> 0x02be }
            goto L_0x0139
        L_0x01b3:
            r0 = 12
            r1.getMax(r0)     // Catch:{ all -> 0x02be }
            int r0 = r1.length     // Catch:{ all -> 0x02be }
            if (r0 != 0) goto L_0x02bb
            r0 = 29
            r6 = 29
            goto L_0x0121
        L_0x01c2:
            r6 = 47
            goto L_0x0121
        L_0x01c6:
            r6 = 39
            goto L_0x0121
        L_0x01ca:
            r1.getMax(r12)     // Catch:{ all -> 0x02be }
            int r0 = r1.length     // Catch:{ all -> 0x02be }
            if (r0 == 0) goto L_0x01db
            r4 = 1
            if (r0 == r4) goto L_0x01d5
            goto L_0x01db
        L_0x01d5:
            r0 = 67
            r6 = 67
            goto L_0x0121
        L_0x01db:
            r0 = 33
            r6 = 33
            goto L_0x0121
        L_0x01e1:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x02b2 }
            r1.getMax(r4)     // Catch:{ all -> 0x02be }
            r1.getMax(r7)     // Catch:{ all -> 0x02be }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02be }
            r4 = 43
            short r4 = (short) r4
            int r6 = setMin     // Catch:{ all -> 0x022b }
            r6 = r6 | 266(0x10a, float:3.73E-43)
            short r6 = (short) r6     // Catch:{ all -> 0x022b }
            byte[] r7 = setMax     // Catch:{ all -> 0x022b }
            byte r7 = r7[r9]     // Catch:{ all -> 0x022b }
            int r7 = -r7
            byte r7 = (byte) r7     // Catch:{ all -> 0x022b }
            java.lang.String r4 = setMin(r4, r6, r7)     // Catch:{ all -> 0x022b }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x022b }
            r6 = 1844(0x734, float:2.584E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x022b }
            int r7 = setMin     // Catch:{ all -> 0x022b }
            r7 = r7 | 274(0x112, float:3.84E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x022b }
            byte[] r15 = setMax     // Catch:{ all -> 0x022b }
            r18 = 2093(0x82d, float:2.933E-42)
            byte r15 = r15[r18]     // Catch:{ all -> 0x022b }
            byte r15 = (byte) r15     // Catch:{ all -> 0x022b }
            java.lang.String r6 = setMin(r6, r7, r15)     // Catch:{ all -> 0x022b }
            java.lang.reflect.Method r4 = r4.getMethod(r6, r10)     // Catch:{ all -> 0x022b }
            java.lang.Object r0 = r4.invoke(r0, r10)     // Catch:{ all -> 0x022b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x022b }
            int r0 = r0.intValue()     // Catch:{ all -> 0x022b }
            r1.getMax = r0     // Catch:{ all -> 0x02be }
            r4 = 1
            r1.getMax(r4)     // Catch:{ all -> 0x02be }
            goto L_0x0139
        L_0x022b:
            r0 = move-exception
            java.lang.Throwable r4 = r0.getCause()     // Catch:{ all -> 0x02be }
            if (r4 == 0) goto L_0x0233
            throw r4     // Catch:{ all -> 0x02be }
        L_0x0233:
            throw r0     // Catch:{ all -> 0x02be }
        L_0x0234:
            r1.getMax(r14)     // Catch:{ all -> 0x02be }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02be }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x02be }
            return r0
        L_0x023c:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x02b2 }
            r1.getMax(r4)     // Catch:{ all -> 0x02be }
            r1.getMax(r7)     // Catch:{ all -> 0x02be }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02be }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x02be }
            o.setDrawDivider r0 = r0.createAccountData()     // Catch:{ all -> 0x02be }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02be }
            goto L_0x015d
        L_0x0251:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x02b2 }
            r1.getMax(r4)     // Catch:{ all -> 0x02be }
            r1.getMax(r7)     // Catch:{ all -> 0x02be }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02be }
            o.setDrawDivider r0 = (o.setDrawDivider) r0     // Catch:{ all -> 0x02be }
            o.TitleBarRightButtonView$1 r0 = r0.getOfflinePublicKey()     // Catch:{ all -> 0x02be }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02be }
            goto L_0x015d
        L_0x0266:
            r1.getMax = r6     // Catch:{ all -> 0x02be }
            r1.getMax(r4)     // Catch:{ all -> 0x02be }
            r1.getMax(r7)     // Catch:{ all -> 0x02be }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x02be }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x02be }
            r1.getMax(r7)     // Catch:{ all -> 0x02be }
            java.lang.Object r4 = r1.toIntRange     // Catch:{ all -> 0x02be }
            o.TitleBarRightButtonView$1 r4 = (o.TitleBarRightButtonView.AnonymousClass1) r4     // Catch:{ all -> 0x02be }
            o.TitleBarRightButtonView$1 r0 = r0.keyedRequest(r4)     // Catch:{ all -> 0x02be }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02be }
            goto L_0x015d
        L_0x0281:
            o.hasCornerMarking r0 = o.hideProgress.length()     // Catch:{ all -> 0x02be }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x02be }
            goto L_0x015d
        L_0x0289:
            r6 = 7
            goto L_0x0121
        L_0x028c:
            int r0 = length     // Catch:{ all -> 0x02be }
            r1.getMax = r0     // Catch:{ all -> 0x02be }
            r6 = 1
            goto L_0x01a0
        L_0x0293:
            r6 = 1
            r1.getMax = r6     // Catch:{ all -> 0x02b2 }
            r1.getMax(r4)     // Catch:{ all -> 0x02b2 }
            r1.getMax(r13)     // Catch:{ all -> 0x02b2 }
            int r0 = r1.length     // Catch:{ all -> 0x02b2 }
            getMin = r0     // Catch:{ all -> 0x02b2 }
            goto L_0x02bb
        L_0x02a1:
            r6 = 1
            r0 = 68
            r1.getMax(r0)     // Catch:{ all -> 0x02b2 }
            int r0 = r1.length     // Catch:{ all -> 0x02b2 }
            if (r0 != 0) goto L_0x02ae
            r0 = 66
            goto L_0x02af
        L_0x02ae:
            r0 = r11
        L_0x02af:
            r6 = r0
            goto L_0x0121
        L_0x02b2:
            r0 = move-exception
            goto L_0x02c0
        L_0x02b4:
            r6 = 1
            goto L_0x0121
        L_0x02b7:
            r6 = 30
            goto L_0x0121
        L_0x02bb:
            r6 = r11
            goto L_0x0121
        L_0x02be:
            r0 = move-exception
            r6 = 1
        L_0x02c0:
            int r4 = setMin
            r4 = r4 | 351(0x15f, float:4.92E-43)
            short r4 = (short) r4
            r7 = 376(0x178, float:5.27E-43)
            short r15 = (short) r7
            byte[] r17 = setMax
            byte r6 = r17[r9]
            int r6 = -r6
            byte r6 = (byte) r6
            java.lang.String r4 = setMin(r4, r15, r6)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            r10 = 38
            r6 = 13
            if (r4 == 0) goto L_0x02ec
            if (r11 < r8) goto L_0x02ec
            r4 = 8
            if (r11 > r4) goto L_0x02ec
        L_0x02e6:
            r4 = 30
        L_0x02e8:
            r7 = 48
            goto L_0x040e
        L_0x02ec:
            int r4 = setMin
            r4 = r4 | r7
            short r4 = (short) r4
            r8 = r4 & 1920(0x780, float:2.69E-42)
            short r8 = (short) r8
            byte[] r19 = setMax
            byte r7 = r19[r9]
            int r7 = -r7
            byte r7 = (byte) r7
            java.lang.String r4 = setMin(r4, r8, r7)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0310
            if (r11 < r13) goto L_0x0310
            if (r11 > r6) goto L_0x0310
            r4 = 30
        L_0x030d:
            r6 = 38
            goto L_0x02e8
        L_0x0310:
            int r4 = setMin
            r4 = r4 | 351(0x15f, float:4.92E-43)
            short r4 = (short) r4
            byte[] r7 = setMax
            byte r7 = r7[r9]
            int r7 = -r7
            byte r7 = (byte) r7
            java.lang.String r4 = setMin(r4, r15, r7)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x032e
            if (r11 < r3) goto L_0x032e
            if (r11 > r14) goto L_0x032e
            goto L_0x02e6
        L_0x032e:
            int r4 = setMin
            r7 = r4 | 97
            short r7 = (short) r7
            r4 = r4 | 263(0x107, float:3.69E-43)
            short r4 = (short) r4
            byte[] r8 = setMax
            byte r8 = r8[r9]
            int r8 = -r8
            byte r8 = (byte) r8
            java.lang.String r4 = setMin(r7, r4, r8)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0353
            r4 = 24
            if (r11 < r4) goto L_0x0353
            r4 = 30
            if (r11 > r4) goto L_0x0355
            goto L_0x030d
        L_0x0353:
            r4 = 30
        L_0x0355:
            if (r11 < r12) goto L_0x035c
            if (r11 > r10) goto L_0x035c
            r6 = 46
            goto L_0x02e8
        L_0x035c:
            int r7 = setMin
            r8 = 376(0x178, float:5.27E-43)
            r7 = r7 | r8
            short r7 = (short) r7
            r8 = r7 & 1920(0x780, float:2.69E-42)
            short r8 = (short) r8
            byte[] r12 = setMax
            byte r12 = r12[r9]
            int r12 = -r12
            byte r12 = (byte) r12
            java.lang.String r7 = setMin(r7, r8, r12)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x0383
            r7 = 41
            if (r11 < r7) goto L_0x0383
            r7 = 46
            if (r11 > r7) goto L_0x0383
        L_0x0381:
            goto L_0x02e8
        L_0x0383:
            r7 = 534(0x216, float:7.48E-43)
            short r7 = (short) r7
            r8 = 379(0x17b, float:5.31E-43)
            short r8 = (short) r8
            byte[] r12 = setMax
            byte r12 = r12[r9]
            int r12 = -r12
            byte r12 = (byte) r12
            java.lang.String r12 = setMin(r7, r8, r12)
            java.lang.Class r12 = java.lang.Class.forName(r12)
            boolean r12 = r12.isInstance(r0)
            if (r12 == 0) goto L_0x03a6
            r12 = 42
            if (r11 < r12) goto L_0x03a6
            r12 = 46
            if (r11 > r12) goto L_0x03a6
            goto L_0x0381
        L_0x03a6:
            r12 = 3642(0xe3a, float:5.104E-42)
            short r12 = (short) r12
            r13 = 382(0x17e, float:5.35E-43)
            short r13 = (short) r13
            byte[] r14 = setMax
            byte r14 = r14[r9]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r12 = setMin(r12, r13, r14)
            java.lang.Class r12 = java.lang.Class.forName(r12)
            boolean r12 = r12.isInstance(r0)
            if (r12 == 0) goto L_0x03c9
            r12 = 44
            if (r11 < r12) goto L_0x03c9
            r12 = 45
            if (r11 > r12) goto L_0x03c9
            goto L_0x0381
        L_0x03c9:
            byte[] r12 = setMax
            byte r12 = r12[r9]
            int r12 = -r12
            byte r12 = (byte) r12
            java.lang.String r7 = setMin(r7, r8, r12)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x03e6
            r7 = 48
            if (r11 < r7) goto L_0x03e8
            r8 = 49
            if (r11 > r8) goto L_0x03e8
            goto L_0x040e
        L_0x03e6:
            r7 = 48
        L_0x03e8:
            int r6 = setMin
            r6 = r6 | 5194(0x144a, float:7.278E-42)
            short r6 = (short) r6
            r8 = 375(0x177, float:5.25E-43)
            short r8 = (short) r8
            byte[] r12 = setMax
            byte r12 = r12[r9]
            int r12 = -r12
            byte r12 = (byte) r12
            java.lang.String r6 = setMin(r6, r8, r12)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0419
            r6 = 62
            if (r11 < r6) goto L_0x0419
            r6 = 67
            if (r11 > r6) goto L_0x0419
            r6 = 38
        L_0x040e:
            r1.IsOverlapping = r0
            r0 = 26
            r1.getMax(r0)
            r8 = 7
            r10 = 0
            goto L_0x0121
        L_0x0419:
            throw r0
        L_0x041a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0422
            throw r1
        L_0x0422:
            goto L_0x0424
        L_0x0423:
            throw r0
        L_0x0424:
            goto L_0x0423
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.initOfflinePay():o.TitleBarRightButtonView$1");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean pause() {
        /*
            r17 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r17
            r1.<init>(r2)
            int r0 = setMin
            r3 = r0 | 2921(0xb69, float:4.093E-42)
            short r3 = (short) r3
            r0 = r0 | 95
            short r0 = (short) r0
            r4 = r0 & 361(0x169, float:5.06E-43)
            byte r4 = (byte) r4
            java.lang.String r0 = setMin(r3, r0, r4)
            int r3 = setMin
            r3 = r3 | 351(0x15f, float:4.92E-43)
            short r3 = (short) r3
            r4 = r3 & 1977(0x7b9, float:2.77E-42)
            short r4 = (short) r4
            r5 = 74
            byte r5 = (byte) r5
            java.lang.String r3 = setMin(r3, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0265 }
            r6 = 0
            r5[r6] = r3     // Catch:{ all -> 0x0265 }
            r3 = 1282(0x502, float:1.796E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x0265 }
            int r7 = setMin     // Catch:{ all -> 0x0265 }
            r7 = r7 | 266(0x10a, float:3.73E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x0265 }
            byte[] r8 = setMax     // Catch:{ all -> 0x0265 }
            r9 = 22
            byte r8 = r8[r9]     // Catch:{ all -> 0x0265 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x0265 }
            java.lang.String r7 = setMin(r3, r7, r8)     // Catch:{ all -> 0x0265 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0265 }
            r8 = 2363(0x93b, float:3.311E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0265 }
            int r10 = setMin     // Catch:{ all -> 0x0265 }
            r10 = r10 | 277(0x115, float:3.88E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0265 }
            byte[] r11 = setMax     // Catch:{ all -> 0x0265 }
            r12 = 21
            byte r11 = r11[r12]     // Catch:{ all -> 0x0265 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = setMin(r8, r10, r11)     // Catch:{ all -> 0x0265 }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x0265 }
            int r11 = setMin     // Catch:{ all -> 0x0265 }
            r11 = r11 | 266(0x10a, float:3.73E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0265 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0265 }
            byte r13 = r13[r9]     // Catch:{ all -> 0x0265 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0265 }
            java.lang.String r11 = setMin(r3, r11, r13)     // Catch:{ all -> 0x0265 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0265 }
            r10[r6] = r11     // Catch:{ all -> 0x0265 }
            java.lang.reflect.Method r7 = r7.getMethod(r8, r10)     // Catch:{ all -> 0x0265 }
            java.lang.Object r0 = r7.invoke(r0, r5)     // Catch:{ all -> 0x0265 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0265 }
            int r5 = r0.length
            int[] r5 = new int[r5]
            r7 = 0
        L_0x007b:
            int r8 = r0.length
            if (r7 >= r8) goto L_0x011f
            r8 = r0[r7]
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0116 }
            r10[r6] = r8     // Catch:{ all -> 0x0116 }
            r8 = 3658(0xe4a, float:5.126E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0116 }
            int r11 = setMin     // Catch:{ all -> 0x0116 }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0116 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0116 }
            byte r13 = r13[r9]     // Catch:{ all -> 0x0116 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0116 }
            java.lang.String r11 = setMin(r8, r11, r13)     // Catch:{ all -> 0x0116 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0116 }
            int r13 = setMin     // Catch:{ all -> 0x0116 }
            r13 = r13 | 602(0x25a, float:8.44E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0116 }
            int r14 = setMin     // Catch:{ all -> 0x0116 }
            r14 = r14 | 275(0x113, float:3.85E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0116 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0116 }
            r16 = 4
            byte r15 = r15[r16]     // Catch:{ all -> 0x0116 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0116 }
            java.lang.String r13 = setMin(r13, r14, r15)     // Catch:{ all -> 0x0116 }
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x0116 }
            int r15 = setMin     // Catch:{ all -> 0x0116 }
            r15 = r15 | 266(0x10a, float:3.73E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0116 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0116 }
            byte r12 = r16[r9]     // Catch:{ all -> 0x0116 }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x0116 }
            java.lang.String r12 = setMin(r3, r15, r12)     // Catch:{ all -> 0x0116 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0116 }
            r14[r6] = r12     // Catch:{ all -> 0x0116 }
            java.lang.reflect.Method r11 = r11.getMethod(r13, r14)     // Catch:{ all -> 0x0116 }
            r12 = 0
            java.lang.Object r10 = r11.invoke(r12, r10)     // Catch:{ all -> 0x0116 }
            int r11 = setMin     // Catch:{ all -> 0x010d }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010d }
            byte[] r13 = setMax     // Catch:{ all -> 0x010d }
            byte r13 = r13[r9]     // Catch:{ all -> 0x010d }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x010d }
            java.lang.String r8 = setMin(r8, r11, r13)     // Catch:{ all -> 0x010d }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x010d }
            int r11 = setMin     // Catch:{ all -> 0x010d }
            r11 = r11 | 596(0x254, float:8.35E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010d }
            int r13 = setMin     // Catch:{ all -> 0x010d }
            r13 = r13 | 274(0x112, float:3.84E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x010d }
            byte[] r14 = setMax     // Catch:{ all -> 0x010d }
            r15 = 5678(0x162e, float:7.957E-42)
            byte r14 = r14[r15]     // Catch:{ all -> 0x010d }
            byte r14 = (byte) r14     // Catch:{ all -> 0x010d }
            java.lang.String r11 = setMin(r11, r13, r14)     // Catch:{ all -> 0x010d }
            java.lang.reflect.Method r8 = r8.getMethod(r11, r12)     // Catch:{ all -> 0x010d }
            java.lang.Object r8 = r8.invoke(r10, r12)     // Catch:{ all -> 0x010d }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x010d }
            int r8 = r8.intValue()     // Catch:{ all -> 0x010d }
            r5[r7] = r8
            int r7 = r7 + 1
            r12 = 21
            goto L_0x007b
        L_0x010d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0115
            throw r1
        L_0x0115:
            throw r0
        L_0x0116:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011e
            throw r1
        L_0x011e:
            throw r0
        L_0x011f:
            r3 = 15
            r7 = 11
        L_0x0123:
            int r8 = r6 + 1
            r10 = 19
            r0 = r5[r6]     // Catch:{ all -> 0x01b6 }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x01b6 }
            r6 = 18
            r11 = 68
            r12 = 10
            switch(r0) {
                case -15: goto L_0x01ab;
                case -14: goto L_0x01a7;
                case -13: goto L_0x019a;
                case -12: goto L_0x0197;
                case -11: goto L_0x0184;
                case -10: goto L_0x016e;
                case -9: goto L_0x0166;
                case -8: goto L_0x0163;
                case -7: goto L_0x0161;
                case -6: goto L_0x015e;
                case -5: goto L_0x015b;
                case -4: goto L_0x0151;
                case -3: goto L_0x0144;
                case -2: goto L_0x013b;
                case -1: goto L_0x0138;
                default: goto L_0x0136;
            }     // Catch:{ all -> 0x01b6 }
        L_0x0136:
            goto L_0x01b3
        L_0x0138:
            r6 = 11
            goto L_0x0123
        L_0x013b:
            int r0 = length     // Catch:{ all -> 0x01b6 }
            r1.getMax = r0     // Catch:{ all -> 0x01b6 }
            r1.getMax(r4)     // Catch:{ all -> 0x01b6 }
            goto L_0x01b3
        L_0x0144:
            r1.getMax = r4     // Catch:{ all -> 0x01b6 }
            r1.getMax(r12)     // Catch:{ all -> 0x01b6 }
            r1.getMax(r7)     // Catch:{ all -> 0x01b6 }
            int r0 = r1.length     // Catch:{ all -> 0x01b6 }
            getMin = r0     // Catch:{ all -> 0x01b6 }
            goto L_0x01b3
        L_0x0151:
            r1.getMax(r11)     // Catch:{ all -> 0x01b6 }
            int r0 = r1.length     // Catch:{ all -> 0x01b6 }
            if (r0 != 0) goto L_0x01b3
            r6 = 10
            goto L_0x0123
        L_0x015b:
            r6 = 21
            goto L_0x0123
        L_0x015e:
            r6 = 17
            goto L_0x0123
        L_0x0161:
            r6 = 1
            goto L_0x0123
        L_0x0163:
            r6 = 57
            goto L_0x0123
        L_0x0166:
            r1.getMax(r3)     // Catch:{ all -> 0x01b6 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01b6 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01b6 }
            throw r0     // Catch:{ all -> 0x01b6 }
        L_0x016e:
            r1.getMax = r4     // Catch:{ all -> 0x01b6 }
            r1.getMax(r12)     // Catch:{ all -> 0x01b6 }
            r1.getMax(r6)     // Catch:{ all -> 0x01b6 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01b6 }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x01b6 }
            o.getExtensionMetaInfos r0 = r0.createQrPayData()     // Catch:{ all -> 0x01b6 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x01b6 }
        L_0x0180:
            r1.getMax(r10)     // Catch:{ all -> 0x01b6 }
            goto L_0x01b3
        L_0x0184:
            r1.getMax = r4     // Catch:{ all -> 0x01b6 }
            r1.getMax(r12)     // Catch:{ all -> 0x01b6 }
            r1.getMax(r6)     // Catch:{ all -> 0x01b6 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01b6 }
            o.getExtensionMetaInfos r0 = (o.getExtensionMetaInfos) r0     // Catch:{ all -> 0x01b6 }
            java.lang.Boolean r0 = r0.pause()     // Catch:{ all -> 0x01b6 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x01b6 }
            goto L_0x0180
        L_0x0197:
            r6 = 22
            goto L_0x0123
        L_0x019a:
            r1.getMax(r11)     // Catch:{ all -> 0x01b6 }
            int r0 = r1.length     // Catch:{ all -> 0x01b6 }
            if (r0 != 0) goto L_0x01b3
            r0 = 56
            r6 = 56
            goto L_0x0123
        L_0x01a7:
            r6 = 14
            goto L_0x0123
        L_0x01ab:
            r1.getMax(r3)     // Catch:{ all -> 0x01b6 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01b6 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01b6 }
            return r0
        L_0x01b3:
            r6 = r8
            goto L_0x0123
        L_0x01b6:
            r0 = move-exception
            r6 = 534(0x216, float:7.48E-43)
            short r6 = (short) r6
            r11 = 379(0x17b, float:5.31E-43)
            short r11 = (short) r11
            byte[] r12 = setMax
            byte r12 = r12[r9]
            int r12 = -r12
            byte r12 = (byte) r12
            java.lang.String r6 = setMin(r6, r11, r12)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x01d7
            if (r8 < r4) goto L_0x01d7
            if (r8 > r7) goto L_0x01d7
            goto L_0x0259
        L_0x01d7:
            r6 = 768(0x300, float:1.076E-42)
            short r6 = (short) r6
            r11 = 371(0x173, float:5.2E-43)
            short r11 = (short) r11
            byte[] r12 = setMax
            byte r12 = r12[r9]
            int r12 = -r12
            byte r12 = (byte) r12
            java.lang.String r12 = setMin(r6, r11, r12)
            java.lang.Class r12 = java.lang.Class.forName(r12)
            boolean r12 = r12.isInstance(r0)
            if (r12 == 0) goto L_0x01f7
            r12 = 5
            if (r8 < r12) goto L_0x01f7
            if (r8 > r7) goto L_0x01f7
            goto L_0x0259
        L_0x01f7:
            byte[] r12 = setMax
            byte r12 = r12[r9]
            int r12 = -r12
            byte r12 = (byte) r12
            java.lang.String r6 = setMin(r6, r11, r12)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0212
            if (r8 < r10) goto L_0x0212
            r6 = 20
            if (r8 > r6) goto L_0x0212
            goto L_0x0259
        L_0x0212:
            byte[] r6 = setMax
            r10 = 2117(0x845, float:2.967E-42)
            byte r10 = r6[r10]
            short r10 = (short) r10
            r11 = r10 | 353(0x161, float:4.95E-43)
            short r11 = (short) r11
            byte r6 = r6[r9]
            int r6 = -r6
            byte r6 = (byte) r6
            java.lang.String r6 = setMin(r10, r11, r6)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0235
            if (r8 < r9) goto L_0x0235
            r6 = 23
            if (r8 > r6) goto L_0x0235
            goto L_0x0259
        L_0x0235:
            int r6 = setMin
            r6 = r6 | 351(0x15f, float:4.92E-43)
            short r6 = (short) r6
            r10 = 376(0x178, float:5.27E-43)
            short r10 = (short) r10
            byte[] r11 = setMax
            byte r11 = r11[r9]
            int r11 = -r11
            byte r11 = (byte) r11
            java.lang.String r6 = setMin(r6, r10, r11)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x0264
            r6 = 51
            if (r8 < r6) goto L_0x0264
            r6 = 52
            if (r8 > r6) goto L_0x0264
        L_0x0259:
            r1.IsOverlapping = r0
            r0 = 26
            r1.getMax(r0)
            r6 = 15
            goto L_0x0123
        L_0x0264:
            throw r0
        L_0x0265:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x026d
            throw r1
        L_0x026d:
            goto L_0x026f
        L_0x026e:
            throw r0
        L_0x026f:
            goto L_0x026e
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.pause():java.lang.Boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0366, code lost:
        if (r12 <= 42) goto L_0x038d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0155, code lost:
        r1.getMax(19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01f4, code lost:
        r1.getMax(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02d0, code lost:
        if (r12 <= 13) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x031b, code lost:
        if (r12 <= 22) goto L_0x0265;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.TitleBarRightButtonView.AnonymousClass1<java.lang.Boolean> restart() {
        /*
            r19 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r19
            r1.<init>(r2)
            int r0 = setMin
            r3 = r0 | 4132(0x1024, float:5.79E-42)
            short r3 = (short) r3
            r0 = r0 | 88
            short r0 = (short) r0
            r4 = 73
            byte r4 = (byte) r4
            java.lang.String r0 = setMin(r3, r0, r4)
            int r3 = setMin
            r3 = r3 | 351(0x15f, float:4.92E-43)
            short r3 = (short) r3
            r4 = r3 & 1977(0x7b9, float:2.77E-42)
            short r4 = (short) r4
            r5 = 74
            byte r5 = (byte) r5
            java.lang.String r3 = setMin(r3, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0398 }
            r6 = 0
            r5[r6] = r3     // Catch:{ all -> 0x0398 }
            r3 = 1282(0x502, float:1.796E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x0398 }
            int r7 = setMin     // Catch:{ all -> 0x0398 }
            r7 = r7 | 266(0x10a, float:3.73E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x0398 }
            byte[] r8 = setMax     // Catch:{ all -> 0x0398 }
            r9 = 22
            byte r8 = r8[r9]     // Catch:{ all -> 0x0398 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x0398 }
            java.lang.String r7 = setMin(r3, r7, r8)     // Catch:{ all -> 0x0398 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0398 }
            r8 = 2363(0x93b, float:3.311E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0398 }
            int r10 = setMin     // Catch:{ all -> 0x0398 }
            r10 = r10 | 277(0x115, float:3.88E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x0398 }
            byte[] r11 = setMax     // Catch:{ all -> 0x0398 }
            r12 = 21
            byte r11 = r11[r12]     // Catch:{ all -> 0x0398 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0398 }
            java.lang.String r8 = setMin(r8, r10, r11)     // Catch:{ all -> 0x0398 }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x0398 }
            int r11 = setMin     // Catch:{ all -> 0x0398 }
            r11 = r11 | 266(0x10a, float:3.73E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0398 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0398 }
            byte r13 = r13[r9]     // Catch:{ all -> 0x0398 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0398 }
            java.lang.String r11 = setMin(r3, r11, r13)     // Catch:{ all -> 0x0398 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0398 }
            r10[r6] = r11     // Catch:{ all -> 0x0398 }
            java.lang.reflect.Method r7 = r7.getMethod(r8, r10)     // Catch:{ all -> 0x0398 }
            java.lang.Object r0 = r7.invoke(r0, r5)     // Catch:{ all -> 0x0398 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0398 }
            int r5 = r0.length
            int[] r5 = new int[r5]
            r7 = 0
        L_0x007b:
            int r8 = r0.length
            r10 = 4
            if (r7 >= r8) goto L_0x011e
            r8 = r0[r7]
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x0115 }
            r11[r6] = r8     // Catch:{ all -> 0x0115 }
            r8 = 3658(0xe4a, float:5.126E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0115 }
            int r13 = setMin     // Catch:{ all -> 0x0115 }
            r13 = r13 | 265(0x109, float:3.71E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0115 }
            byte[] r14 = setMax     // Catch:{ all -> 0x0115 }
            byte r14 = r14[r9]     // Catch:{ all -> 0x0115 }
            int r14 = -r14
            byte r14 = (byte) r14     // Catch:{ all -> 0x0115 }
            java.lang.String r13 = setMin(r8, r13, r14)     // Catch:{ all -> 0x0115 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0115 }
            int r14 = setMin     // Catch:{ all -> 0x0115 }
            r14 = r14 | 602(0x25a, float:8.44E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0115 }
            int r15 = setMin     // Catch:{ all -> 0x0115 }
            r15 = r15 | 275(0x113, float:3.85E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0115 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0115 }
            byte r10 = r16[r10]     // Catch:{ all -> 0x0115 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0115 }
            java.lang.String r10 = setMin(r14, r15, r10)     // Catch:{ all -> 0x0115 }
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x0115 }
            int r15 = setMin     // Catch:{ all -> 0x0115 }
            r15 = r15 | 266(0x10a, float:3.73E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0115 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0115 }
            byte r12 = r16[r9]     // Catch:{ all -> 0x0115 }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x0115 }
            java.lang.String r12 = setMin(r3, r15, r12)     // Catch:{ all -> 0x0115 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0115 }
            r14[r6] = r12     // Catch:{ all -> 0x0115 }
            java.lang.reflect.Method r10 = r13.getMethod(r10, r14)     // Catch:{ all -> 0x0115 }
            r12 = 0
            java.lang.Object r10 = r10.invoke(r12, r11)     // Catch:{ all -> 0x0115 }
            int r11 = setMin     // Catch:{ all -> 0x010c }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010c }
            byte[] r13 = setMax     // Catch:{ all -> 0x010c }
            byte r13 = r13[r9]     // Catch:{ all -> 0x010c }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x010c }
            java.lang.String r8 = setMin(r8, r11, r13)     // Catch:{ all -> 0x010c }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x010c }
            int r11 = setMin     // Catch:{ all -> 0x010c }
            r11 = r11 | 596(0x254, float:8.35E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010c }
            int r13 = setMin     // Catch:{ all -> 0x010c }
            r13 = r13 | 274(0x112, float:3.84E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x010c }
            byte[] r14 = setMax     // Catch:{ all -> 0x010c }
            r15 = 5678(0x162e, float:7.957E-42)
            byte r14 = r14[r15]     // Catch:{ all -> 0x010c }
            byte r14 = (byte) r14     // Catch:{ all -> 0x010c }
            java.lang.String r11 = setMin(r11, r13, r14)     // Catch:{ all -> 0x010c }
            java.lang.reflect.Method r8 = r8.getMethod(r11, r12)     // Catch:{ all -> 0x010c }
            java.lang.Object r8 = r8.invoke(r10, r12)     // Catch:{ all -> 0x010c }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x010c }
            int r8 = r8.intValue()     // Catch:{ all -> 0x010c }
            r5[r7] = r8
            int r7 = r7 + 1
            r12 = 21
            goto L_0x007b
        L_0x010c:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0114
            throw r1
        L_0x0114:
            throw r0
        L_0x0115:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011d
            throw r1
        L_0x011d:
            throw r0
        L_0x011e:
            r7 = 6
            r11 = 19
        L_0x0121:
            int r12 = r6 + 1
            r13 = 12
            r14 = 11
            r0 = r5[r6]     // Catch:{ all -> 0x023e }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x023e }
            r6 = 15
            r15 = 2
            r3 = 10
            r8 = 18
            switch(r0) {
                case -23: goto L_0x0237;
                case -22: goto L_0x0228;
                case -21: goto L_0x021b;
                case -20: goto L_0x0216;
                case -19: goto L_0x0212;
                case -18: goto L_0x0205;
                case -17: goto L_0x01f8;
                case -16: goto L_0x01f0;
                case -15: goto L_0x01e8;
                case -14: goto L_0x01e4;
                case -13: goto L_0x01dc;
                case -12: goto L_0x01d8;
                case -11: goto L_0x01d5;
                case -10: goto L_0x01d2;
                case -9: goto L_0x01cb;
                case -8: goto L_0x01b1;
                case -7: goto L_0x019e;
                case -6: goto L_0x018b;
                case -5: goto L_0x0188;
                case -4: goto L_0x016e;
                case -3: goto L_0x015a;
                case -2: goto L_0x013c;
                case -1: goto L_0x0139;
                default: goto L_0x0137;
            }     // Catch:{ all -> 0x023e }
        L_0x0137:
            goto L_0x023b
        L_0x0139:
            r6 = 14
            goto L_0x0121
        L_0x013c:
            r1.getMax = r15     // Catch:{ all -> 0x023e }
            r1.getMax(r3)     // Catch:{ all -> 0x023e }
            r1.getMax(r8)     // Catch:{ all -> 0x023e }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x023e }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x023e }
            r1.getMax(r8)     // Catch:{ all -> 0x023e }
            java.lang.Object r3 = r1.toIntRange     // Catch:{ all -> 0x023e }
            o.hasCornerMarking r3 = (o.hasCornerMarking) r3     // Catch:{ all -> 0x023e }
            o.TitleBarRightButtonView$1 r0 = r0.observeOn(r3)     // Catch:{ all -> 0x023e }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x023e }
        L_0x0155:
            r1.getMax(r11)     // Catch:{ all -> 0x023e }
            goto L_0x023b
        L_0x015a:
            o.getScope r0 = new o.getScope     // Catch:{ all -> 0x023e }
            r1.getMax = r4     // Catch:{ all -> 0x023e }
            r1.getMax(r3)     // Catch:{ all -> 0x023e }
            r1.getMax(r8)     // Catch:{ all -> 0x023e }
            java.lang.Object r3 = r1.toIntRange     // Catch:{ all -> 0x023e }
            o.DefaultExtensionRegistry r3 = (o.DefaultExtensionRegistry) r3     // Catch:{ all -> 0x023e }
            r0.<init>(r3)     // Catch:{ all -> 0x023e }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x023e }
            goto L_0x0155
        L_0x016e:
            r1.getMax = r15     // Catch:{ all -> 0x023e }
            r1.getMax(r3)     // Catch:{ all -> 0x023e }
            r1.getMax(r8)     // Catch:{ all -> 0x023e }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x023e }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x023e }
            r1.getMax(r8)     // Catch:{ all -> 0x023e }
            java.lang.Object r3 = r1.toIntRange     // Catch:{ all -> 0x023e }
            o.RedDotDrawable r3 = (o.RedDotDrawable) r3     // Catch:{ all -> 0x023e }
            o.TitleBarRightButtonView$1 r0 = r0.flatMap(r3)     // Catch:{ all -> 0x023e }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x023e }
            goto L_0x0155
        L_0x0188:
            r6 = 41
            goto L_0x0121
        L_0x018b:
            r1.getMax = r4     // Catch:{ all -> 0x023e }
            r1.getMax(r3)     // Catch:{ all -> 0x023e }
            r1.getMax(r8)     // Catch:{ all -> 0x023e }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x023e }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x023e }
            o.setDrawDivider r0 = r0.createAccountData()     // Catch:{ all -> 0x023e }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x023e }
            goto L_0x0155
        L_0x019e:
            r1.getMax = r4     // Catch:{ all -> 0x023e }
            r1.getMax(r3)     // Catch:{ all -> 0x023e }
            r1.getMax(r8)     // Catch:{ all -> 0x023e }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x023e }
            o.setDrawDivider r0 = (o.setDrawDivider) r0     // Catch:{ all -> 0x023e }
            o.TitleBarRightButtonView$1 r0 = r0.getOfflinePublicKey()     // Catch:{ all -> 0x023e }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x023e }
            goto L_0x0155
        L_0x01b1:
            r1.getMax = r15     // Catch:{ all -> 0x023e }
            r1.getMax(r3)     // Catch:{ all -> 0x023e }
            r1.getMax(r8)     // Catch:{ all -> 0x023e }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x023e }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x023e }
            r1.getMax(r8)     // Catch:{ all -> 0x023e }
            java.lang.Object r3 = r1.toIntRange     // Catch:{ all -> 0x023e }
            o.TitleBarRightButtonView$1 r3 = (o.TitleBarRightButtonView.AnonymousClass1) r3     // Catch:{ all -> 0x023e }
            o.TitleBarRightButtonView$1 r0 = r0.keyedRequest(r3)     // Catch:{ all -> 0x023e }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x023e }
            goto L_0x0155
        L_0x01cb:
            o.hasCornerMarking r0 = o.hideProgress.length()     // Catch:{ all -> 0x023e }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x023e }
            goto L_0x0155
        L_0x01d2:
            r6 = 1
            goto L_0x0121
        L_0x01d5:
            r6 = 6
            goto L_0x0121
        L_0x01d8:
            r6 = 21
            goto L_0x0121
        L_0x01dc:
            r1.getMax(r6)     // Catch:{ all -> 0x023e }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x023e }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x023e }
            return r0
        L_0x01e4:
            r6 = 17
            goto L_0x0121
        L_0x01e8:
            r1.getMax(r6)     // Catch:{ all -> 0x023e }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x023e }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x023e }
            throw r0     // Catch:{ all -> 0x023e }
        L_0x01f0:
            int r0 = getMin     // Catch:{ all -> 0x023e }
            r1.getMax = r0     // Catch:{ all -> 0x023e }
        L_0x01f4:
            r1.getMax(r4)     // Catch:{ all -> 0x023e }
            goto L_0x023b
        L_0x01f8:
            r1.getMax = r4     // Catch:{ all -> 0x023e }
            r1.getMax(r3)     // Catch:{ all -> 0x023e }
            r1.getMax(r14)     // Catch:{ all -> 0x023e }
            int r0 = r1.length     // Catch:{ all -> 0x023e }
            length = r0     // Catch:{ all -> 0x023e }
            goto L_0x023b
        L_0x0205:
            r1.getMax(r13)     // Catch:{ all -> 0x023e }
            int r0 = r1.length     // Catch:{ all -> 0x023e }
            if (r0 != 0) goto L_0x023b
            r0 = 39
            r6 = 39
            goto L_0x0121
        L_0x0212:
            r6 = 13
            goto L_0x0121
        L_0x0216:
            int r0 = length     // Catch:{ all -> 0x023e }
            r1.getMax = r0     // Catch:{ all -> 0x023e }
            goto L_0x01f4
        L_0x021b:
            r1.getMax = r4     // Catch:{ all -> 0x023e }
            r1.getMax(r3)     // Catch:{ all -> 0x023e }
            r1.getMax(r14)     // Catch:{ all -> 0x023e }
            int r0 = r1.length     // Catch:{ all -> 0x023e }
            getMin = r0     // Catch:{ all -> 0x023e }
            goto L_0x023b
        L_0x0228:
            r0 = 68
            r1.getMax(r0)     // Catch:{ all -> 0x023e }
            int r0 = r1.length     // Catch:{ all -> 0x023e }
            if (r0 != 0) goto L_0x023b
            r0 = 56
            r6 = 56
            goto L_0x0121
        L_0x0237:
            r6 = 19
            goto L_0x0121
        L_0x023b:
            r6 = r12
            goto L_0x0121
        L_0x023e:
            r0 = move-exception
            int r3 = setMin
            r3 = r3 | 376(0x178, float:5.27E-43)
            short r3 = (short) r3
            r6 = r3 & 1920(0x780, float:2.69E-42)
            short r6 = (short) r6
            byte[] r8 = setMax
            byte r8 = r8[r9]
            int r8 = -r8
            byte r8 = (byte) r8
            java.lang.String r3 = setMin(r3, r6, r8)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            r6 = 20
            r8 = 40
            if (r3 == 0) goto L_0x026b
            if (r12 < r4) goto L_0x026b
            if (r12 > r7) goto L_0x026b
        L_0x0263:
            r3 = 21
        L_0x0265:
            r4 = 41
            r6 = 40
            goto L_0x038d
        L_0x026b:
            r3 = 534(0x216, float:7.48E-43)
            short r3 = (short) r3
            r15 = 379(0x17b, float:5.31E-43)
            short r15 = (short) r15
            byte[] r18 = setMax
            byte r4 = r18[r9]
            int r4 = -r4
            byte r4 = (byte) r4
            java.lang.String r3 = setMin(r3, r15, r4)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x028b
            if (r12 < r10) goto L_0x028b
            r3 = 5
            if (r12 > r3) goto L_0x028b
            goto L_0x0263
        L_0x028b:
            r3 = 3615(0xe1f, float:5.066E-42)
            short r3 = (short) r3
            r4 = 380(0x17c, float:5.32E-43)
            short r4 = (short) r4
            byte[] r15 = setMax
            byte r15 = r15[r9]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r3 = setMin(r3, r4, r15)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x02ae
            r3 = 8
            if (r12 < r3) goto L_0x02ae
            r3 = 9
            if (r12 > r3) goto L_0x02ae
            goto L_0x0263
        L_0x02ae:
            int r3 = setMin
            r3 = r3 | 5194(0x144a, float:7.278E-42)
            short r3 = (short) r3
            r4 = 375(0x177, float:5.25E-43)
            short r4 = (short) r4
            byte[] r15 = setMax
            byte r15 = r15[r9]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r3 = setMin(r3, r4, r15)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x02d8
            r3 = 9
            if (r12 < r3) goto L_0x02d8
            r3 = 13
            if (r12 > r3) goto L_0x02da
        L_0x02d2:
            r3 = 21
        L_0x02d4:
            r4 = 41
            goto L_0x038d
        L_0x02d8:
            r3 = 13
        L_0x02da:
            int r4 = setMin
            r15 = r4 | 97
            short r15 = (short) r15
            r4 = r4 | 263(0x107, float:3.69E-43)
            short r4 = (short) r4
            byte[] r17 = setMax
            byte r3 = r17[r9]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r3 = setMin(r15, r4, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x02fb
            if (r12 < r14) goto L_0x02fb
            if (r12 > r13) goto L_0x02fb
            goto L_0x02d2
        L_0x02fb:
            int r3 = setMin
            r4 = r3 | 97
            short r4 = (short) r4
            r3 = r3 | 263(0x107, float:3.69E-43)
            short r3 = (short) r3
            byte[] r13 = setMax
            byte r13 = r13[r9]
            int r13 = -r13
            byte r13 = (byte) r13
            java.lang.String r3 = setMin(r4, r3, r13)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x031f
            r3 = 21
            if (r12 < r3) goto L_0x0321
            if (r12 > r9) goto L_0x0321
            goto L_0x0265
        L_0x031f:
            r3 = 21
        L_0x0321:
            int r4 = setMin
            r4 = r4 | 376(0x178, float:5.27E-43)
            short r4 = (short) r4
            r13 = r4 & 1920(0x780, float:2.69E-42)
            short r13 = (short) r13
            byte[] r14 = setMax
            byte r14 = r14[r9]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r4 = setMin(r4, r13, r14)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0344
            r4 = 34
            if (r12 < r4) goto L_0x0344
            if (r12 > r8) goto L_0x0344
            goto L_0x02d4
        L_0x0344:
            byte[] r4 = setMax
            r8 = 2117(0x845, float:2.967E-42)
            byte r8 = r4[r8]
            short r8 = (short) r8
            r13 = r8 | 353(0x161, float:4.95E-43)
            short r13 = (short) r13
            byte r4 = r4[r9]
            int r4 = -r4
            byte r4 = (byte) r4
            java.lang.String r4 = setMin(r8, r13, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0369
            r4 = 41
            if (r12 < r4) goto L_0x036b
            r8 = 42
            if (r12 > r8) goto L_0x036b
            goto L_0x038d
        L_0x0369:
            r4 = 41
        L_0x036b:
            r8 = 3642(0xe3a, float:5.104E-42)
            short r8 = (short) r8
            r13 = 382(0x17e, float:5.35E-43)
            short r13 = (short) r13
            byte[] r14 = setMax
            byte r14 = r14[r9]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r8 = setMin(r8, r13, r14)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x0397
            r8 = 51
            if (r12 < r8) goto L_0x0397
            r8 = 57
            if (r12 > r8) goto L_0x0397
        L_0x038d:
            r1.IsOverlapping = r0
            r0 = 26
            r1.getMax(r0)
            r4 = 1
            goto L_0x0121
        L_0x0397:
            throw r0
        L_0x0398:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x03a0
            throw r1
        L_0x03a0:
            goto L_0x03a2
        L_0x03a1:
            throw r0
        L_0x03a2:
            goto L_0x03a1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.restart():o.TitleBarRightButtonView$1");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x035f, code lost:
        if (r11 <= 84) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0146, code lost:
        r1.getMax(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x018e, code lost:
        r1.getMax(19);
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0364  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.TitleBarRightButtonView.AnonymousClass1<java.lang.Boolean> setSeedExtra(java.lang.String r19) {
        /*
            r18 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r18
            r0 = r19
            r1.<init>(r2, r0)
            int r0 = setMin
            r0 = r0 | 4446(0x115e, float:6.23E-42)
            short r0 = (short) r0
            r3 = 95
            short r3 = (short) r3
            r4 = r3 & 489(0x1e9, float:6.85E-43)
            byte r4 = (byte) r4
            java.lang.String r0 = setMin(r0, r3, r4)
            int r3 = setMin
            r3 = r3 | 351(0x15f, float:4.92E-43)
            short r3 = (short) r3
            r4 = r3 & 1977(0x7b9, float:2.77E-42)
            short r4 = (short) r4
            r5 = 74
            byte r6 = (byte) r5
            java.lang.String r3 = setMin(r3, r4, r6)
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x03d7 }
            r7 = 0
            r6[r7] = r3     // Catch:{ all -> 0x03d7 }
            r3 = 1282(0x502, float:1.796E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x03d7 }
            int r8 = setMin     // Catch:{ all -> 0x03d7 }
            r8 = r8 | 266(0x10a, float:3.73E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x03d7 }
            byte[] r9 = setMax     // Catch:{ all -> 0x03d7 }
            r10 = 22
            byte r9 = r9[r10]     // Catch:{ all -> 0x03d7 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x03d7 }
            java.lang.String r8 = setMin(r3, r8, r9)     // Catch:{ all -> 0x03d7 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x03d7 }
            r9 = 2363(0x93b, float:3.311E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x03d7 }
            int r11 = setMin     // Catch:{ all -> 0x03d7 }
            r11 = r11 | 277(0x115, float:3.88E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x03d7 }
            byte[] r12 = setMax     // Catch:{ all -> 0x03d7 }
            r13 = 21
            byte r12 = r12[r13]     // Catch:{ all -> 0x03d7 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x03d7 }
            java.lang.String r9 = setMin(r9, r11, r12)     // Catch:{ all -> 0x03d7 }
            java.lang.Class[] r11 = new java.lang.Class[r4]     // Catch:{ all -> 0x03d7 }
            int r12 = setMin     // Catch:{ all -> 0x03d7 }
            r12 = r12 | 266(0x10a, float:3.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x03d7 }
            byte[] r13 = setMax     // Catch:{ all -> 0x03d7 }
            byte r13 = r13[r10]     // Catch:{ all -> 0x03d7 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x03d7 }
            java.lang.String r12 = setMin(r3, r12, r13)     // Catch:{ all -> 0x03d7 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x03d7 }
            r11[r7] = r12     // Catch:{ all -> 0x03d7 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r11)     // Catch:{ all -> 0x03d7 }
            java.lang.Object r0 = r8.invoke(r0, r6)     // Catch:{ all -> 0x03d7 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x03d7 }
            int r6 = r0.length
            int[] r6 = new int[r6]
            r8 = 0
        L_0x007d:
            int r9 = r0.length
            if (r8 >= r9) goto L_0x0121
            r9 = r0[r8]
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x0118 }
            r11[r7] = r9     // Catch:{ all -> 0x0118 }
            r9 = 3658(0xe4a, float:5.126E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0118 }
            int r12 = setMin     // Catch:{ all -> 0x0118 }
            r12 = r12 | 265(0x109, float:3.71E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0118 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0118 }
            byte r13 = r13[r10]     // Catch:{ all -> 0x0118 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0118 }
            java.lang.String r12 = setMin(r9, r12, r13)     // Catch:{ all -> 0x0118 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0118 }
            int r13 = setMin     // Catch:{ all -> 0x0118 }
            r13 = r13 | 602(0x25a, float:8.44E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0118 }
            int r14 = setMin     // Catch:{ all -> 0x0118 }
            r14 = r14 | 275(0x113, float:3.85E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0118 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0118 }
            r16 = 4
            byte r15 = r15[r16]     // Catch:{ all -> 0x0118 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0118 }
            java.lang.String r13 = setMin(r13, r14, r15)     // Catch:{ all -> 0x0118 }
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x0118 }
            int r15 = setMin     // Catch:{ all -> 0x0118 }
            r15 = r15 | 266(0x10a, float:3.73E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0118 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0118 }
            byte r5 = r16[r10]     // Catch:{ all -> 0x0118 }
            int r5 = -r5
            byte r5 = (byte) r5     // Catch:{ all -> 0x0118 }
            java.lang.String r5 = setMin(r3, r15, r5)     // Catch:{ all -> 0x0118 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0118 }
            r14[r7] = r5     // Catch:{ all -> 0x0118 }
            java.lang.reflect.Method r5 = r12.getMethod(r13, r14)     // Catch:{ all -> 0x0118 }
            r12 = 0
            java.lang.Object r5 = r5.invoke(r12, r11)     // Catch:{ all -> 0x0118 }
            int r11 = setMin     // Catch:{ all -> 0x010f }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010f }
            byte[] r13 = setMax     // Catch:{ all -> 0x010f }
            byte r13 = r13[r10]     // Catch:{ all -> 0x010f }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x010f }
            java.lang.String r9 = setMin(r9, r11, r13)     // Catch:{ all -> 0x010f }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x010f }
            int r11 = setMin     // Catch:{ all -> 0x010f }
            r11 = r11 | 596(0x254, float:8.35E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010f }
            int r13 = setMin     // Catch:{ all -> 0x010f }
            r13 = r13 | 274(0x112, float:3.84E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x010f }
            byte[] r14 = setMax     // Catch:{ all -> 0x010f }
            r15 = 5678(0x162e, float:7.957E-42)
            byte r14 = r14[r15]     // Catch:{ all -> 0x010f }
            byte r14 = (byte) r14     // Catch:{ all -> 0x010f }
            java.lang.String r11 = setMin(r11, r13, r14)     // Catch:{ all -> 0x010f }
            java.lang.reflect.Method r9 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x010f }
            java.lang.Object r5 = r9.invoke(r5, r12)     // Catch:{ all -> 0x010f }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x010f }
            int r5 = r5.intValue()     // Catch:{ all -> 0x010f }
            r6[r8] = r5
            int r8 = r8 + 1
            r5 = 74
            goto L_0x007d
        L_0x010f:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0117
            throw r1
        L_0x0117:
            throw r0
        L_0x0118:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0120
            throw r1
        L_0x0120:
            throw r0
        L_0x0121:
            r3 = 39
            r5 = 67
            r8 = 65
        L_0x0127:
            int r11 = r7 + 1
            r12 = 2
            r0 = r6[r7]     // Catch:{ all -> 0x026e }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x026e }
            r7 = 68
            r13 = 15
            r14 = 19
            r15 = 10
            r9 = 18
            switch(r0) {
                case -27: goto L_0x0267;
                case -26: goto L_0x025f;
                case -25: goto L_0x0244;
                case -24: goto L_0x0230;
                case -23: goto L_0x021c;
                case -22: goto L_0x0218;
                case -21: goto L_0x0214;
                case -20: goto L_0x0205;
                case -19: goto L_0x01f6;
                case -18: goto L_0x01f0;
                case -17: goto L_0x01ed;
                case -16: goto L_0x01e5;
                case -15: goto L_0x01e1;
                case -14: goto L_0x01c7;
                case -13: goto L_0x01c3;
                case -12: goto L_0x01bf;
                case -11: goto L_0x01b2;
                case -10: goto L_0x01ae;
                case -9: goto L_0x0193;
                case -8: goto L_0x0175;
                case -7: goto L_0x016d;
                case -6: goto L_0x016a;
                case -5: goto L_0x0167;
                case -4: goto L_0x015b;
                case -3: goto L_0x014b;
                case -2: goto L_0x0142;
                case -1: goto L_0x013f;
                default: goto L_0x013d;
            }     // Catch:{ all -> 0x026e }
        L_0x013d:
            goto L_0x026b
        L_0x013f:
            r7 = 69
            goto L_0x0127
        L_0x0142:
            int r0 = length     // Catch:{ all -> 0x026e }
            r1.getMax = r0     // Catch:{ all -> 0x026e }
        L_0x0146:
            r1.getMax(r4)     // Catch:{ all -> 0x026e }
            goto L_0x026b
        L_0x014b:
            r1.getMax = r4     // Catch:{ all -> 0x026e }
            r1.getMax(r15)     // Catch:{ all -> 0x026e }
            r0 = 11
            r1.getMax(r0)     // Catch:{ all -> 0x026e }
            int r0 = r1.length     // Catch:{ all -> 0x026e }
            getMin = r0     // Catch:{ all -> 0x026e }
            goto L_0x026b
        L_0x015b:
            r1.getMax(r7)     // Catch:{ all -> 0x026e }
            int r0 = r1.length     // Catch:{ all -> 0x026e }
            if (r0 != 0) goto L_0x026b
            r0 = 30
            r7 = 30
            goto L_0x0127
        L_0x0167:
            r7 = 31
            goto L_0x0127
        L_0x016a:
            r7 = 86
            goto L_0x0127
        L_0x016d:
            r1.getMax(r13)     // Catch:{ all -> 0x026e }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x026e }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x026e }
            throw r0     // Catch:{ all -> 0x026e }
        L_0x0175:
            r1.getMax = r12     // Catch:{ all -> 0x026e }
            r1.getMax(r15)     // Catch:{ all -> 0x026e }
            r1.getMax(r9)     // Catch:{ all -> 0x026e }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x026e }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x026e }
            r1.getMax(r9)     // Catch:{ all -> 0x026e }
            java.lang.Object r7 = r1.toIntRange     // Catch:{ all -> 0x026e }
            o.hasCornerMarking r7 = (o.hasCornerMarking) r7     // Catch:{ all -> 0x026e }
            o.TitleBarRightButtonView$1 r0 = r0.observeOn(r7)     // Catch:{ all -> 0x026e }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x026e }
        L_0x018e:
            r1.getMax(r14)     // Catch:{ all -> 0x026e }
            goto L_0x026b
        L_0x0193:
            o.serialize r0 = new o.serialize     // Catch:{ all -> 0x026e }
            r1.getMax = r12     // Catch:{ all -> 0x026e }
            r1.getMax(r15)     // Catch:{ all -> 0x026e }
            r1.getMax(r9)     // Catch:{ all -> 0x026e }
            java.lang.Object r7 = r1.toIntRange     // Catch:{ all -> 0x026e }
            o.DefaultExtensionRegistry r7 = (o.DefaultExtensionRegistry) r7     // Catch:{ all -> 0x026e }
            r1.getMax(r9)     // Catch:{ all -> 0x026e }
            java.lang.Object r9 = r1.toIntRange     // Catch:{ all -> 0x026e }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x026e }
            r0.<init>(r7, r9)     // Catch:{ all -> 0x026e }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x026e }
            goto L_0x018e
        L_0x01ae:
            r7 = 39
            goto L_0x0127
        L_0x01b2:
            r1.getMax(r7)     // Catch:{ all -> 0x026e }
            int r0 = r1.length     // Catch:{ all -> 0x026e }
            if (r0 != 0) goto L_0x026b
            r0 = 64
            r7 = 64
            goto L_0x0127
        L_0x01bf:
            r7 = 73
            goto L_0x0127
        L_0x01c3:
            r7 = 65
            goto L_0x0127
        L_0x01c7:
            r1.getMax = r12     // Catch:{ all -> 0x026e }
            r1.getMax(r15)     // Catch:{ all -> 0x026e }
            r1.getMax(r9)     // Catch:{ all -> 0x026e }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x026e }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x026e }
            r1.getMax(r9)     // Catch:{ all -> 0x026e }
            java.lang.Object r7 = r1.toIntRange     // Catch:{ all -> 0x026e }
            o.RedDotDrawable r7 = (o.RedDotDrawable) r7     // Catch:{ all -> 0x026e }
            o.TitleBarRightButtonView$1 r0 = r0.flatMap(r7)     // Catch:{ all -> 0x026e }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x026e }
            goto L_0x018e
        L_0x01e1:
            r7 = 74
            goto L_0x0127
        L_0x01e5:
            r1.getMax(r13)     // Catch:{ all -> 0x026e }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x026e }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x026e }
            return r0
        L_0x01ed:
            r7 = 1
            goto L_0x0127
        L_0x01f0:
            int r0 = getMin     // Catch:{ all -> 0x026e }
            r1.getMax = r0     // Catch:{ all -> 0x026e }
            goto L_0x0146
        L_0x01f6:
            r1.getMax = r4     // Catch:{ all -> 0x026e }
            r1.getMax(r15)     // Catch:{ all -> 0x026e }
            r0 = 11
            r1.getMax(r0)     // Catch:{ all -> 0x026e }
            int r0 = r1.length     // Catch:{ all -> 0x026e }
            length = r0     // Catch:{ all -> 0x026e }
            goto L_0x026b
        L_0x0205:
            r0 = 12
            r1.getMax(r0)     // Catch:{ all -> 0x026e }
            int r0 = r1.length     // Catch:{ all -> 0x026e }
            if (r0 != 0) goto L_0x026b
            r0 = 83
            r7 = 83
            goto L_0x0127
        L_0x0214:
            r7 = 84
            goto L_0x0127
        L_0x0218:
            r7 = 67
            goto L_0x0127
        L_0x021c:
            r1.getMax = r4     // Catch:{ all -> 0x026e }
            r1.getMax(r15)     // Catch:{ all -> 0x026e }
            r1.getMax(r9)     // Catch:{ all -> 0x026e }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x026e }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x026e }
            o.setDrawDivider r0 = r0.createAccountData()     // Catch:{ all -> 0x026e }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x026e }
            goto L_0x018e
        L_0x0230:
            r1.getMax = r4     // Catch:{ all -> 0x026e }
            r1.getMax(r15)     // Catch:{ all -> 0x026e }
            r1.getMax(r9)     // Catch:{ all -> 0x026e }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x026e }
            o.setDrawDivider r0 = (o.setDrawDivider) r0     // Catch:{ all -> 0x026e }
            o.TitleBarRightButtonView$1 r0 = r0.getOfflinePublicKey()     // Catch:{ all -> 0x026e }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x026e }
            goto L_0x018e
        L_0x0244:
            r1.getMax = r12     // Catch:{ all -> 0x026e }
            r1.getMax(r15)     // Catch:{ all -> 0x026e }
            r1.getMax(r9)     // Catch:{ all -> 0x026e }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x026e }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x026e }
            r1.getMax(r9)     // Catch:{ all -> 0x026e }
            java.lang.Object r7 = r1.toIntRange     // Catch:{ all -> 0x026e }
            o.TitleBarRightButtonView$1 r7 = (o.TitleBarRightButtonView.AnonymousClass1) r7     // Catch:{ all -> 0x026e }
            o.TitleBarRightButtonView$1 r0 = r0.keyedRequest(r7)     // Catch:{ all -> 0x026e }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x026e }
            goto L_0x018e
        L_0x025f:
            o.hasCornerMarking r0 = o.hideProgress.length()     // Catch:{ all -> 0x026e }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x026e }
            goto L_0x018e
        L_0x0267:
            r7 = 33
            goto L_0x0127
        L_0x026b:
            r7 = r11
            goto L_0x0127
        L_0x026e:
            r0 = move-exception
            r7 = 3615(0xe1f, float:5.066E-42)
            short r7 = (short) r7
            r9 = 380(0x17c, float:5.32E-43)
            short r9 = (short) r9
            byte[] r13 = setMax
            byte r13 = r13[r10]
            int r13 = -r13
            byte r13 = (byte) r13
            java.lang.String r13 = setMin(r7, r9, r13)
            java.lang.Class r13 = java.lang.Class.forName(r13)
            boolean r13 = r13.isInstance(r0)
            r14 = 26
            if (r13 == 0) goto L_0x0297
            if (r11 < r4) goto L_0x0297
            if (r11 > r12) goto L_0x0297
        L_0x028f:
            r4 = 84
            r7 = 85
            r14 = 74
            goto L_0x03ca
        L_0x0297:
            int r12 = setMin
            r12 = r12 | 5438(0x153e, float:7.62E-42)
            short r12 = (short) r12
            r13 = 379(0x17b, float:5.31E-43)
            short r13 = (short) r13
            byte[] r17 = setMax
            byte r4 = r17[r10]
            int r4 = -r4
            byte r4 = (byte) r4
            java.lang.String r4 = setMin(r12, r13, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02ba
            r4 = 25
            if (r11 < r4) goto L_0x02ba
            if (r11 > r14) goto L_0x02ba
            goto L_0x028f
        L_0x02ba:
            byte[] r4 = setMax
            r12 = 2117(0x845, float:2.967E-42)
            byte r15 = r4[r12]
            short r15 = (short) r15
            r14 = r15 | 353(0x161, float:4.95E-43)
            short r14 = (short) r14
            byte r4 = r4[r10]
            int r4 = -r4
            byte r4 = (byte) r4
            java.lang.String r4 = setMin(r15, r14, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02db
            if (r11 < r3) goto L_0x02db
            if (r11 > r8) goto L_0x02db
            goto L_0x028f
        L_0x02db:
            r4 = 534(0x216, float:7.48E-43)
            short r4 = (short) r4
            byte[] r14 = setMax
            byte r14 = r14[r10]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r4 = setMin(r4, r13, r14)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02fb
            r4 = 59
            if (r11 < r4) goto L_0x02fb
            r4 = 60
            if (r11 > r4) goto L_0x02fb
            goto L_0x028f
        L_0x02fb:
            byte[] r4 = setMax
            byte r12 = r4[r12]
            short r12 = (short) r12
            r14 = r12 | 353(0x161, float:4.95E-43)
            short r14 = (short) r14
            byte r4 = r4[r10]
            int r4 = -r4
            byte r4 = (byte) r4
            java.lang.String r4 = setMin(r12, r14, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x031b
            if (r11 < r8) goto L_0x031b
            if (r11 > r5) goto L_0x031b
            goto L_0x028f
        L_0x031b:
            r4 = 768(0x300, float:1.076E-42)
            short r4 = (short) r4
            r12 = 371(0x173, float:5.2E-43)
            short r12 = (short) r12
            byte[] r14 = setMax
            byte r14 = r14[r10]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r14 = setMin(r4, r12, r14)
            java.lang.Class r14 = java.lang.Class.forName(r14)
            boolean r14 = r14.isInstance(r0)
            if (r14 == 0) goto L_0x0343
            r14 = 74
            if (r11 < r14) goto L_0x0345
            r15 = 84
            if (r11 > r15) goto L_0x0345
            r4 = 84
        L_0x033f:
            r7 = 85
            goto L_0x03ca
        L_0x0343:
            r14 = 74
        L_0x0345:
            byte[] r15 = setMax
            byte r15 = r15[r10]
            int r15 = -r15
            byte r15 = (byte) r15
            java.lang.String r4 = setMin(r4, r12, r15)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0364
            r4 = 78
            if (r11 < r4) goto L_0x0364
            r4 = 84
            if (r11 > r4) goto L_0x0366
        L_0x0361:
            r7 = 32
            goto L_0x03ca
        L_0x0364:
            r4 = 84
        L_0x0366:
            r12 = 3642(0xe3a, float:5.104E-42)
            short r12 = (short) r12
            r15 = 382(0x17e, float:5.35E-43)
            short r15 = (short) r15
            byte[] r16 = setMax
            byte r3 = r16[r10]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r3 = setMin(r12, r15, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0389
            r3 = 88
            if (r11 < r3) goto L_0x0389
            r3 = 89
            if (r11 > r3) goto L_0x0389
        L_0x0388:
            goto L_0x033f
        L_0x0389:
            int r3 = setMin
            r3 = r3 | 5438(0x153e, float:7.62E-42)
            short r3 = (short) r3
            byte[] r12 = setMax
            byte r12 = r12[r10]
            int r12 = -r12
            byte r12 = (byte) r12
            java.lang.String r3 = setMin(r3, r13, r12)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x03ab
            r3 = 89
            if (r11 < r3) goto L_0x03ab
            r3 = 90
            if (r11 > r3) goto L_0x03ab
            goto L_0x0388
        L_0x03ab:
            byte[] r3 = setMax
            byte r3 = r3[r10]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r3 = setMin(r7, r9, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x03d6
            r3 = 91
            if (r11 < r3) goto L_0x03d6
            r3 = 93
            if (r11 > r3) goto L_0x03d6
            r3 = 32
            goto L_0x0361
        L_0x03ca:
            r1.IsOverlapping = r0
            r0 = 26
            r1.getMax(r0)
            r3 = 39
            r4 = 1
            goto L_0x0127
        L_0x03d6:
            throw r0
        L_0x03d7:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x03df
            throw r1
        L_0x03df:
            goto L_0x03e1
        L_0x03e0:
            throw r0
        L_0x03e1:
            goto L_0x03e0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.setSeedExtra(java.lang.String):o.TitleBarRightButtonView$1");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x036e, code lost:
        if (r15 <= 70) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03b5, code lost:
        if (r15 <= 72) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x014a, code lost:
        r1.getMax(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x018a, code lost:
        r1.getMax(19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02fa, code lost:
        if (r15 <= 40) goto L_0x02ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.TitleBarRightButtonView.AnonymousClass1<java.lang.Boolean> start() {
        /*
            r20 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r20
            r1.<init>(r2)
            r0 = 4890(0x131a, float:6.852E-42)
            short r0 = (short) r0
            r3 = 93
            short r4 = (short) r3
            r5 = r4 & 491(0x1eb, float:6.88E-43)
            byte r5 = (byte) r5
            java.lang.String r0 = setMin(r0, r4, r5)
            int r4 = setMin
            r4 = r4 | 351(0x15f, float:4.92E-43)
            short r4 = (short) r4
            r5 = r4 & 1977(0x7b9, float:2.77E-42)
            short r5 = (short) r5
            r6 = 74
            byte r6 = (byte) r6
            java.lang.String r4 = setMin(r4, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x03e9 }
            r7 = 0
            r6[r7] = r4     // Catch:{ all -> 0x03e9 }
            r4 = 1282(0x502, float:1.796E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x03e9 }
            int r8 = setMin     // Catch:{ all -> 0x03e9 }
            r8 = r8 | 266(0x10a, float:3.73E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x03e9 }
            byte[] r9 = setMax     // Catch:{ all -> 0x03e9 }
            r10 = 22
            byte r9 = r9[r10]     // Catch:{ all -> 0x03e9 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x03e9 }
            java.lang.String r8 = setMin(r4, r8, r9)     // Catch:{ all -> 0x03e9 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x03e9 }
            r9 = 2363(0x93b, float:3.311E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x03e9 }
            int r11 = setMin     // Catch:{ all -> 0x03e9 }
            r11 = r11 | 277(0x115, float:3.88E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x03e9 }
            byte[] r12 = setMax     // Catch:{ all -> 0x03e9 }
            r13 = 21
            byte r12 = r12[r13]     // Catch:{ all -> 0x03e9 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x03e9 }
            java.lang.String r9 = setMin(r9, r11, r12)     // Catch:{ all -> 0x03e9 }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x03e9 }
            int r12 = setMin     // Catch:{ all -> 0x03e9 }
            r12 = r12 | 266(0x10a, float:3.73E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x03e9 }
            byte[] r13 = setMax     // Catch:{ all -> 0x03e9 }
            byte r13 = r13[r10]     // Catch:{ all -> 0x03e9 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x03e9 }
            java.lang.String r12 = setMin(r4, r12, r13)     // Catch:{ all -> 0x03e9 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x03e9 }
            r11[r7] = r12     // Catch:{ all -> 0x03e9 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r11)     // Catch:{ all -> 0x03e9 }
            java.lang.Object r0 = r8.invoke(r0, r6)     // Catch:{ all -> 0x03e9 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x03e9 }
            int r6 = r0.length
            int[] r6 = new int[r6]
            r8 = 0
        L_0x0079:
            int r9 = r0.length
            if (r8 >= r9) goto L_0x011d
            r9 = r0[r8]
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0114 }
            r11[r7] = r9     // Catch:{ all -> 0x0114 }
            r9 = 3658(0xe4a, float:5.126E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0114 }
            int r12 = setMin     // Catch:{ all -> 0x0114 }
            r12 = r12 | 265(0x109, float:3.71E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0114 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0114 }
            byte r13 = r13[r10]     // Catch:{ all -> 0x0114 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0114 }
            java.lang.String r12 = setMin(r9, r12, r13)     // Catch:{ all -> 0x0114 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0114 }
            int r13 = setMin     // Catch:{ all -> 0x0114 }
            r13 = r13 | 602(0x25a, float:8.44E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0114 }
            int r14 = setMin     // Catch:{ all -> 0x0114 }
            r14 = r14 | 275(0x113, float:3.85E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0114 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0114 }
            r16 = 4
            byte r15 = r15[r16]     // Catch:{ all -> 0x0114 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0114 }
            java.lang.String r13 = setMin(r13, r14, r15)     // Catch:{ all -> 0x0114 }
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x0114 }
            int r15 = setMin     // Catch:{ all -> 0x0114 }
            r15 = r15 | 266(0x10a, float:3.73E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0114 }
            byte[] r16 = setMax     // Catch:{ all -> 0x0114 }
            byte r3 = r16[r10]     // Catch:{ all -> 0x0114 }
            int r3 = -r3
            byte r3 = (byte) r3     // Catch:{ all -> 0x0114 }
            java.lang.String r3 = setMin(r4, r15, r3)     // Catch:{ all -> 0x0114 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0114 }
            r14[r7] = r3     // Catch:{ all -> 0x0114 }
            java.lang.reflect.Method r3 = r12.getMethod(r13, r14)     // Catch:{ all -> 0x0114 }
            r12 = 0
            java.lang.Object r3 = r3.invoke(r12, r11)     // Catch:{ all -> 0x0114 }
            int r11 = setMin     // Catch:{ all -> 0x010b }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010b }
            byte[] r13 = setMax     // Catch:{ all -> 0x010b }
            byte r13 = r13[r10]     // Catch:{ all -> 0x010b }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x010b }
            java.lang.String r9 = setMin(r9, r11, r13)     // Catch:{ all -> 0x010b }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x010b }
            int r11 = setMin     // Catch:{ all -> 0x010b }
            r11 = r11 | 596(0x254, float:8.35E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010b }
            int r13 = setMin     // Catch:{ all -> 0x010b }
            r13 = r13 | 274(0x112, float:3.84E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x010b }
            byte[] r14 = setMax     // Catch:{ all -> 0x010b }
            r15 = 5678(0x162e, float:7.957E-42)
            byte r14 = r14[r15]     // Catch:{ all -> 0x010b }
            byte r14 = (byte) r14     // Catch:{ all -> 0x010b }
            java.lang.String r11 = setMin(r11, r13, r14)     // Catch:{ all -> 0x010b }
            java.lang.reflect.Method r9 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x010b }
            java.lang.Object r3 = r9.invoke(r3, r12)     // Catch:{ all -> 0x010b }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x010b }
            int r3 = r3.intValue()     // Catch:{ all -> 0x010b }
            r6[r8] = r3
            int r8 = r8 + 1
            r3 = 93
            goto L_0x0079
        L_0x010b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0113
            throw r1
        L_0x0113:
            throw r0
        L_0x0114:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011c
            throw r1
        L_0x011c:
            throw r0
        L_0x011d:
            r3 = 30
            r12 = 29
            r14 = 2
        L_0x0122:
            int r15 = r7 + 1
            r4 = 68
            r0 = r6[r7]     // Catch:{ all -> 0x025f }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x025f }
            r7 = 12
            r8 = 15
            r9 = 19
            r13 = 10
            r11 = 18
            switch(r0) {
                case -27: goto L_0x0258;
                case -26: goto L_0x0250;
                case -25: goto L_0x024c;
                case -24: goto L_0x023f;
                case -23: goto L_0x023b;
                case -22: goto L_0x0220;
                case -21: goto L_0x020c;
                case -20: goto L_0x01f8;
                case -19: goto L_0x01f4;
                case -18: goto L_0x01f0;
                case -17: goto L_0x01e3;
                case -16: goto L_0x01d3;
                case -15: goto L_0x01cd;
                case -14: goto L_0x01c9;
                case -13: goto L_0x01b5;
                case -12: goto L_0x019b;
                case -11: goto L_0x0194;
                case -10: goto L_0x0191;
                case -9: goto L_0x018f;
                case -8: goto L_0x0171;
                case -7: goto L_0x016e;
                case -6: goto L_0x016b;
                case -5: goto L_0x015f;
                case -4: goto L_0x014f;
                case -3: goto L_0x0146;
                case -2: goto L_0x013e;
                case -1: goto L_0x013b;
                default: goto L_0x0139;
            }     // Catch:{ all -> 0x025f }
        L_0x0139:
            goto L_0x025c
        L_0x013b:
            r7 = 95
            goto L_0x0122
        L_0x013e:
            r1.getMax(r8)     // Catch:{ all -> 0x025f }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x025f }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x025f }
            throw r0     // Catch:{ all -> 0x025f }
        L_0x0146:
            int r0 = getMin     // Catch:{ all -> 0x025f }
            r1.getMax = r0     // Catch:{ all -> 0x025f }
        L_0x014a:
            r1.getMax(r5)     // Catch:{ all -> 0x025f }
            goto L_0x025c
        L_0x014f:
            r1.getMax = r5     // Catch:{ all -> 0x025f }
            r1.getMax(r13)     // Catch:{ all -> 0x025f }
            r0 = 11
            r1.getMax(r0)     // Catch:{ all -> 0x025f }
            int r0 = r1.length     // Catch:{ all -> 0x025f }
            length = r0     // Catch:{ all -> 0x025f }
            goto L_0x025c
        L_0x015f:
            r1.getMax(r7)     // Catch:{ all -> 0x025f }
            int r0 = r1.length     // Catch:{ all -> 0x025f }
            if (r0 != 0) goto L_0x025c
            r0 = 28
            r7 = 28
            goto L_0x0122
        L_0x016b:
            r7 = 29
            goto L_0x0122
        L_0x016e:
            r7 = 93
            goto L_0x0122
        L_0x0171:
            r1.getMax = r14     // Catch:{ all -> 0x025f }
            r1.getMax(r13)     // Catch:{ all -> 0x025f }
            r1.getMax(r11)     // Catch:{ all -> 0x025f }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x025f }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x025f }
            r1.getMax(r11)     // Catch:{ all -> 0x025f }
            java.lang.Object r7 = r1.toIntRange     // Catch:{ all -> 0x025f }
            o.RedDotDrawable r7 = (o.RedDotDrawable) r7     // Catch:{ all -> 0x025f }
            o.TitleBarRightButtonView$1 r0 = r0.flatMap(r7)     // Catch:{ all -> 0x025f }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x025f }
        L_0x018a:
            r1.getMax(r9)     // Catch:{ all -> 0x025f }
            goto L_0x025c
        L_0x018f:
            r7 = 2
            goto L_0x0122
        L_0x0191:
            r7 = 30
            goto L_0x0122
        L_0x0194:
            o.hasCornerMarking r0 = o.hideProgress.length()     // Catch:{ all -> 0x025f }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x025f }
            goto L_0x018a
        L_0x019b:
            r1.getMax = r14     // Catch:{ all -> 0x025f }
            r1.getMax(r13)     // Catch:{ all -> 0x025f }
            r1.getMax(r11)     // Catch:{ all -> 0x025f }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x025f }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x025f }
            r1.getMax(r11)     // Catch:{ all -> 0x025f }
            java.lang.Object r7 = r1.toIntRange     // Catch:{ all -> 0x025f }
            o.hasCornerMarking r7 = (o.hasCornerMarking) r7     // Catch:{ all -> 0x025f }
            o.TitleBarRightButtonView$1 r0 = r0.observeOn(r7)     // Catch:{ all -> 0x025f }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x025f }
            goto L_0x018a
        L_0x01b5:
            o.getExtensionClass r0 = new o.getExtensionClass     // Catch:{ all -> 0x025f }
            r1.getMax = r5     // Catch:{ all -> 0x025f }
            r1.getMax(r13)     // Catch:{ all -> 0x025f }
            r1.getMax(r11)     // Catch:{ all -> 0x025f }
            java.lang.Object r7 = r1.toIntRange     // Catch:{ all -> 0x025f }
            o.DefaultExtensionRegistry r7 = (o.DefaultExtensionRegistry) r7     // Catch:{ all -> 0x025f }
            r0.<init>(r7)     // Catch:{ all -> 0x025f }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x025f }
            goto L_0x018a
        L_0x01c9:
            r7 = 71
            goto L_0x0122
        L_0x01cd:
            int r0 = length     // Catch:{ all -> 0x025f }
            r1.getMax = r0     // Catch:{ all -> 0x025f }
            goto L_0x014a
        L_0x01d3:
            r1.getMax = r5     // Catch:{ all -> 0x025f }
            r1.getMax(r13)     // Catch:{ all -> 0x025f }
            r0 = 11
            r1.getMax(r0)     // Catch:{ all -> 0x025f }
            int r0 = r1.length     // Catch:{ all -> 0x025f }
            getMin = r0     // Catch:{ all -> 0x025f }
            goto L_0x025c
        L_0x01e3:
            r1.getMax(r4)     // Catch:{ all -> 0x025f }
            int r0 = r1.length     // Catch:{ all -> 0x025f }
            if (r0 != 0) goto L_0x025c
            r0 = 63
            r7 = 63
            goto L_0x0122
        L_0x01f0:
            r7 = 70
            goto L_0x0122
        L_0x01f4:
            r7 = 64
            goto L_0x0122
        L_0x01f8:
            r1.getMax = r5     // Catch:{ all -> 0x025f }
            r1.getMax(r13)     // Catch:{ all -> 0x025f }
            r1.getMax(r11)     // Catch:{ all -> 0x025f }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x025f }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x025f }
            o.setDrawDivider r0 = r0.createAccountData()     // Catch:{ all -> 0x025f }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x025f }
            goto L_0x018a
        L_0x020c:
            r1.getMax = r5     // Catch:{ all -> 0x025f }
            r1.getMax(r13)     // Catch:{ all -> 0x025f }
            r1.getMax(r11)     // Catch:{ all -> 0x025f }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x025f }
            o.setDrawDivider r0 = (o.setDrawDivider) r0     // Catch:{ all -> 0x025f }
            o.TitleBarRightButtonView$1 r0 = r0.getOfflinePublicKey()     // Catch:{ all -> 0x025f }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x025f }
            goto L_0x018a
        L_0x0220:
            r1.getMax = r14     // Catch:{ all -> 0x025f }
            r1.getMax(r13)     // Catch:{ all -> 0x025f }
            r1.getMax(r11)     // Catch:{ all -> 0x025f }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x025f }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x025f }
            r1.getMax(r11)     // Catch:{ all -> 0x025f }
            java.lang.Object r7 = r1.toIntRange     // Catch:{ all -> 0x025f }
            o.TitleBarRightButtonView$1 r7 = (o.TitleBarRightButtonView.AnonymousClass1) r7     // Catch:{ all -> 0x025f }
            o.TitleBarRightButtonView$1 r0 = r0.keyedRequest(r7)     // Catch:{ all -> 0x025f }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x025f }
            goto L_0x018a
        L_0x023b:
            r7 = 33
            goto L_0x0122
        L_0x023f:
            r1.getMax(r7)     // Catch:{ all -> 0x025f }
            int r0 = r1.length     // Catch:{ all -> 0x025f }
            if (r0 != 0) goto L_0x025c
            r0 = 91
            r7 = 91
            goto L_0x0122
        L_0x024c:
            r7 = 32
            goto L_0x0122
        L_0x0250:
            r1.getMax(r8)     // Catch:{ all -> 0x025f }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x025f }
            o.TitleBarRightButtonView$1 r0 = (o.TitleBarRightButtonView.AnonymousClass1) r0     // Catch:{ all -> 0x025f }
            return r0
        L_0x0258:
            r7 = 40
            goto L_0x0122
        L_0x025c:
            r7 = r15
            goto L_0x0122
        L_0x025f:
            r0 = move-exception
            byte[] r7 = setMax
            r8 = 2117(0x845, float:2.967E-42)
            byte r8 = r7[r8]
            short r8 = (short) r8
            r9 = r8 | 353(0x161, float:4.95E-43)
            short r9 = (short) r9
            byte r7 = r7[r10]
            int r7 = -r7
            byte r7 = (byte) r7
            java.lang.String r7 = setMin(r8, r9, r7)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            r8 = 92
            if (r7 == 0) goto L_0x028c
            if (r15 < r14) goto L_0x028c
            if (r15 > r12) goto L_0x028c
        L_0x0282:
            r3 = 70
            r4 = 71
            r5 = 64
        L_0x0288:
            r7 = 92
            goto L_0x03dc
        L_0x028c:
            r7 = 534(0x216, float:7.48E-43)
            short r7 = (short) r7
            r9 = 379(0x17b, float:5.31E-43)
            short r9 = (short) r9
            byte[] r11 = setMax
            byte r11 = r11[r10]
            int r11 = -r11
            byte r11 = (byte) r11
            java.lang.String r7 = setMin(r7, r9, r11)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x02b5
            r7 = 23
            if (r15 < r7) goto L_0x02b5
            if (r15 > r12) goto L_0x02b5
        L_0x02ac:
            r3 = 70
            r4 = 71
            r5 = 64
        L_0x02b2:
            r7 = 1
            goto L_0x03dc
        L_0x02b5:
            int r7 = setMin
            r7 = r7 | 5194(0x144a, float:7.278E-42)
            short r7 = (short) r7
            r11 = 375(0x177, float:5.25E-43)
            short r11 = (short) r11
            byte[] r13 = setMax
            byte r13 = r13[r10]
            int r13 = -r13
            byte r13 = (byte) r13
            java.lang.String r7 = setMin(r7, r11, r13)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x02d8
            if (r15 < r3) goto L_0x02d8
            r7 = 31
            if (r15 > r7) goto L_0x02d8
            goto L_0x0282
        L_0x02d8:
            int r7 = setMin
            r7 = r7 | 351(0x15f, float:4.92E-43)
            short r7 = (short) r7
            r13 = 376(0x178, float:5.27E-43)
            short r13 = (short) r13
            byte[] r19 = setMax
            byte r3 = r19[r10]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r3 = setMin(r7, r13, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x02fd
            r3 = 33
            if (r15 < r3) goto L_0x02ff
            r7 = 40
            if (r15 > r7) goto L_0x02ff
            goto L_0x02ac
        L_0x02fd:
            r3 = 33
        L_0x02ff:
            int r7 = setMin
            r7 = r7 | 351(0x15f, float:4.92E-43)
            short r7 = (short) r7
            byte[] r18 = setMax
            byte r3 = r18[r10]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r3 = setMin(r7, r13, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0321
            r3 = 34
            if (r15 < r3) goto L_0x0321
            r3 = 35
            if (r15 > r3) goto L_0x0321
            goto L_0x02ac
        L_0x0321:
            int r3 = setMin
            r3 = r3 | 376(0x178, float:5.27E-43)
            short r3 = (short) r3
            r7 = r3 & 1920(0x780, float:2.69E-42)
            short r7 = (short) r7
            byte[] r18 = setMax
            byte r5 = r18[r10]
            int r5 = -r5
            byte r5 = (byte) r5
            java.lang.String r3 = setMin(r3, r7, r5)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x034b
            r3 = 40
            r5 = 64
            if (r15 < r3) goto L_0x034f
            if (r15 > r5) goto L_0x034f
            r3 = 70
            r4 = 71
            goto L_0x0288
        L_0x034b:
            r3 = 40
            r5 = 64
        L_0x034f:
            int r7 = setMin
            r7 = r7 | 5194(0x144a, float:7.278E-42)
            short r7 = (short) r7
            byte[] r17 = setMax
            byte r3 = r17[r10]
            int r3 = -r3
            byte r3 = (byte) r3
            java.lang.String r3 = setMin(r7, r11, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0374
            r3 = 66
            if (r15 < r3) goto L_0x0374
            r3 = 70
            if (r15 > r3) goto L_0x0376
        L_0x0370:
            r4 = 71
            goto L_0x02b2
        L_0x0374:
            r3 = 70
        L_0x0376:
            int r7 = setMin
            r7 = r7 | 351(0x15f, float:4.92E-43)
            short r7 = (short) r7
            byte[] r11 = setMax
            byte r11 = r11[r10]
            int r11 = -r11
            byte r11 = (byte) r11
            java.lang.String r7 = setMin(r7, r13, r11)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x0396
            r7 = 67
            if (r15 < r7) goto L_0x0396
            if (r15 > r4) goto L_0x0396
            goto L_0x0370
        L_0x0396:
            int r4 = setMin
            r4 = r4 | 5438(0x153e, float:7.62E-42)
            short r4 = (short) r4
            byte[] r7 = setMax
            byte r7 = r7[r10]
            int r7 = -r7
            byte r7 = (byte) r7
            java.lang.String r4 = setMin(r4, r9, r7)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x03b9
            r4 = 71
            if (r15 < r4) goto L_0x03bb
            r7 = 72
            if (r15 > r7) goto L_0x03bb
        L_0x03b7:
            goto L_0x0288
        L_0x03b9:
            r4 = 71
        L_0x03bb:
            r7 = 3642(0xe3a, float:5.104E-42)
            short r7 = (short) r7
            r9 = 382(0x17e, float:5.35E-43)
            short r9 = (short) r9
            byte[] r11 = setMax
            byte r11 = r11[r10]
            int r11 = -r11
            byte r11 = (byte) r11
            java.lang.String r7 = setMin(r7, r9, r11)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x03e8
            r7 = 87
            if (r15 < r7) goto L_0x03e8
            if (r15 > r8) goto L_0x03e8
            goto L_0x03b7
        L_0x03dc:
            r1.IsOverlapping = r0
            r0 = 26
            r1.getMax(r0)
            r3 = 30
            r5 = 1
            goto L_0x0122
        L_0x03e8:
            throw r0
        L_0x03e9:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x03f1
            throw r1
        L_0x03f1:
            goto L_0x03f3
        L_0x03f2:
            throw r0
        L_0x03f3:
            goto L_0x03f2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.start():o.TitleBarRightButtonView$1");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x014e, code lost:
        r1.getMax(19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0175, code lost:
        r1.getMax(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x029e, code lost:
        if (r12 <= 57) goto L_0x023c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean stop() {
        /*
            r17 = this;
            o.PointToExtensionRegistry r1 = new o.PointToExtensionRegistry
            r2 = r17
            r1.<init>(r2)
            int r0 = setMin
            r0 = r0 | 1139(0x473, float:1.596E-42)
            short r0 = (short) r0
            r3 = r0 & 990(0x3de, float:1.387E-42)
            short r3 = (short) r3
            r4 = 73
            byte r4 = (byte) r4
            java.lang.String r0 = setMin(r0, r3, r4)
            int r3 = setMin
            r3 = r3 | 351(0x15f, float:4.92E-43)
            short r3 = (short) r3
            r4 = r3 & 1977(0x7b9, float:2.77E-42)
            short r4 = (short) r4
            r5 = 74
            byte r5 = (byte) r5
            java.lang.String r3 = setMin(r3, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x02cf }
            r6 = 0
            r5[r6] = r3     // Catch:{ all -> 0x02cf }
            r3 = 1282(0x502, float:1.796E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x02cf }
            int r7 = setMin     // Catch:{ all -> 0x02cf }
            r7 = r7 | 266(0x10a, float:3.73E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x02cf }
            byte[] r8 = setMax     // Catch:{ all -> 0x02cf }
            r9 = 22
            byte r8 = r8[r9]     // Catch:{ all -> 0x02cf }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x02cf }
            java.lang.String r7 = setMin(r3, r7, r8)     // Catch:{ all -> 0x02cf }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x02cf }
            r8 = 2363(0x93b, float:3.311E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x02cf }
            int r10 = setMin     // Catch:{ all -> 0x02cf }
            r10 = r10 | 277(0x115, float:3.88E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x02cf }
            byte[] r11 = setMax     // Catch:{ all -> 0x02cf }
            r12 = 21
            byte r11 = r11[r12]     // Catch:{ all -> 0x02cf }
            byte r11 = (byte) r11     // Catch:{ all -> 0x02cf }
            java.lang.String r8 = setMin(r8, r10, r11)     // Catch:{ all -> 0x02cf }
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x02cf }
            int r11 = setMin     // Catch:{ all -> 0x02cf }
            r11 = r11 | 266(0x10a, float:3.73E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x02cf }
            byte[] r12 = setMax     // Catch:{ all -> 0x02cf }
            byte r12 = r12[r9]     // Catch:{ all -> 0x02cf }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x02cf }
            java.lang.String r11 = setMin(r3, r11, r12)     // Catch:{ all -> 0x02cf }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x02cf }
            r10[r6] = r11     // Catch:{ all -> 0x02cf }
            java.lang.reflect.Method r7 = r7.getMethod(r8, r10)     // Catch:{ all -> 0x02cf }
            java.lang.Object r0 = r7.invoke(r0, r5)     // Catch:{ all -> 0x02cf }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x02cf }
            int r5 = r0.length
            int[] r5 = new int[r5]
            r7 = 0
        L_0x007b:
            int r8 = r0.length
            r10 = 4
            if (r7 >= r8) goto L_0x011c
            r8 = r0[r7]
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x0113 }
            r11[r6] = r8     // Catch:{ all -> 0x0113 }
            r8 = 3658(0xe4a, float:5.126E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0113 }
            int r12 = setMin     // Catch:{ all -> 0x0113 }
            r12 = r12 | 265(0x109, float:3.71E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0113 }
            byte[] r13 = setMax     // Catch:{ all -> 0x0113 }
            byte r13 = r13[r9]     // Catch:{ all -> 0x0113 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0113 }
            java.lang.String r12 = setMin(r8, r12, r13)     // Catch:{ all -> 0x0113 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0113 }
            int r13 = setMin     // Catch:{ all -> 0x0113 }
            r13 = r13 | 602(0x25a, float:8.44E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0113 }
            int r14 = setMin     // Catch:{ all -> 0x0113 }
            r14 = r14 | 275(0x113, float:3.85E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0113 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0113 }
            byte r10 = r15[r10]     // Catch:{ all -> 0x0113 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0113 }
            java.lang.String r10 = setMin(r13, r14, r10)     // Catch:{ all -> 0x0113 }
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch:{ all -> 0x0113 }
            int r14 = setMin     // Catch:{ all -> 0x0113 }
            r14 = r14 | 266(0x10a, float:3.73E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0113 }
            byte[] r15 = setMax     // Catch:{ all -> 0x0113 }
            byte r15 = r15[r9]     // Catch:{ all -> 0x0113 }
            int r15 = -r15
            byte r15 = (byte) r15     // Catch:{ all -> 0x0113 }
            java.lang.String r14 = setMin(r3, r14, r15)     // Catch:{ all -> 0x0113 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0113 }
            r13[r6] = r14     // Catch:{ all -> 0x0113 }
            java.lang.reflect.Method r10 = r12.getMethod(r10, r13)     // Catch:{ all -> 0x0113 }
            r12 = 0
            java.lang.Object r10 = r10.invoke(r12, r11)     // Catch:{ all -> 0x0113 }
            int r11 = setMin     // Catch:{ all -> 0x010a }
            r11 = r11 | 265(0x109, float:3.71E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010a }
            byte[] r13 = setMax     // Catch:{ all -> 0x010a }
            byte r13 = r13[r9]     // Catch:{ all -> 0x010a }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x010a }
            java.lang.String r8 = setMin(r8, r11, r13)     // Catch:{ all -> 0x010a }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x010a }
            int r11 = setMin     // Catch:{ all -> 0x010a }
            r11 = r11 | 596(0x254, float:8.35E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x010a }
            int r13 = setMin     // Catch:{ all -> 0x010a }
            r13 = r13 | 274(0x112, float:3.84E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x010a }
            byte[] r14 = setMax     // Catch:{ all -> 0x010a }
            r15 = 5678(0x162e, float:7.957E-42)
            byte r14 = r14[r15]     // Catch:{ all -> 0x010a }
            byte r14 = (byte) r14     // Catch:{ all -> 0x010a }
            java.lang.String r11 = setMin(r11, r13, r14)     // Catch:{ all -> 0x010a }
            java.lang.reflect.Method r8 = r8.getMethod(r11, r12)     // Catch:{ all -> 0x010a }
            java.lang.Object r8 = r8.invoke(r10, r12)     // Catch:{ all -> 0x010a }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x010a }
            int r8 = r8.intValue()     // Catch:{ all -> 0x010a }
            r5[r7] = r8
            int r7 = r7 + 1
            goto L_0x007b
        L_0x010a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0112
            throw r1
        L_0x0112:
            throw r0
        L_0x0113:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011b
            throw r1
        L_0x011b:
            throw r0
        L_0x011c:
            r3 = 43
            r8 = 8
            r11 = 36
        L_0x0122:
            int r12 = r6 + 1
            r0 = r5[r6]     // Catch:{ all -> 0x01e7 }
            int r0 = r1.getMax(r0)     // Catch:{ all -> 0x01e7 }
            r6 = 19
            r13 = 18
            r14 = 11
            r15 = 15
            r7 = 10
            switch(r0) {
                case -19: goto L_0x01e0;
                case -18: goto L_0x01dc;
                case -17: goto L_0x01cd;
                case -16: goto L_0x01c0;
                case -15: goto L_0x01bb;
                case -14: goto L_0x01b7;
                case -13: goto L_0x01b3;
                case -12: goto L_0x01ab;
                case -11: goto L_0x019b;
                case -10: goto L_0x0198;
                case -9: goto L_0x0195;
                case -8: goto L_0x0187;
                case -7: goto L_0x017a;
                case -6: goto L_0x0171;
                case -5: goto L_0x0169;
                case -4: goto L_0x0166;
                case -3: goto L_0x0153;
                case -2: goto L_0x013c;
                case -1: goto L_0x0139;
                default: goto L_0x0137;
            }     // Catch:{ all -> 0x01e7 }
        L_0x0137:
            goto L_0x01e4
        L_0x0139:
            r6 = 43
            goto L_0x0122
        L_0x013c:
            r1.getMax = r4     // Catch:{ all -> 0x01e7 }
            r1.getMax(r7)     // Catch:{ all -> 0x01e7 }
            r1.getMax(r13)     // Catch:{ all -> 0x01e7 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01e7 }
            o.DefaultExtensionRegistry r0 = (o.DefaultExtensionRegistry) r0     // Catch:{ all -> 0x01e7 }
            o.getExtensionMetaInfos r0 = r0.createQrPayData()     // Catch:{ all -> 0x01e7 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x01e7 }
        L_0x014e:
            r1.getMax(r6)     // Catch:{ all -> 0x01e7 }
            goto L_0x01e4
        L_0x0153:
            r1.getMax = r4     // Catch:{ all -> 0x01e7 }
            r1.getMax(r7)     // Catch:{ all -> 0x01e7 }
            r1.getMax(r13)     // Catch:{ all -> 0x01e7 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01e7 }
            o.getExtensionMetaInfos r0 = (o.getExtensionMetaInfos) r0     // Catch:{ all -> 0x01e7 }
            java.lang.Boolean r0 = r0.stop()     // Catch:{ all -> 0x01e7 }
            r1.IsOverlapping = r0     // Catch:{ all -> 0x01e7 }
            goto L_0x014e
        L_0x0166:
            r6 = 48
            goto L_0x0122
        L_0x0169:
            r1.getMax(r15)     // Catch:{ all -> 0x01e7 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01e7 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01e7 }
            throw r0     // Catch:{ all -> 0x01e7 }
        L_0x0171:
            int r0 = length     // Catch:{ all -> 0x01e7 }
            r1.getMax = r0     // Catch:{ all -> 0x01e7 }
        L_0x0175:
            r1.getMax(r4)     // Catch:{ all -> 0x01e7 }
            goto L_0x01e4
        L_0x017a:
            r1.getMax = r4     // Catch:{ all -> 0x01e7 }
            r1.getMax(r7)     // Catch:{ all -> 0x01e7 }
            r1.getMax(r14)     // Catch:{ all -> 0x01e7 }
            int r0 = r1.length     // Catch:{ all -> 0x01e7 }
            getMin = r0     // Catch:{ all -> 0x01e7 }
            goto L_0x01e4
        L_0x0187:
            r0 = 68
            r1.getMax(r0)     // Catch:{ all -> 0x01e7 }
            int r0 = r1.length     // Catch:{ all -> 0x01e7 }
            if (r0 != 0) goto L_0x01e4
            r0 = 35
            r6 = 35
            goto L_0x0122
        L_0x0195:
            r6 = 58
            goto L_0x0122
        L_0x0198:
            r6 = 60
            goto L_0x0122
        L_0x019b:
            r0 = 34
            r1.getMax(r0)     // Catch:{ all -> 0x01e7 }
            int r0 = r1.length     // Catch:{ all -> 0x01e7 }
            r6 = 39
            if (r0 == 0) goto L_0x01a8
            goto L_0x0122
        L_0x01a8:
            r6 = 1
            goto L_0x0122
        L_0x01ab:
            r1.getMax(r15)     // Catch:{ all -> 0x01e7 }
            java.lang.Object r0 = r1.toIntRange     // Catch:{ all -> 0x01e7 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01e7 }
            return r0
        L_0x01b3:
            r6 = 8
            goto L_0x0122
        L_0x01b7:
            r6 = 37
            goto L_0x0122
        L_0x01bb:
            int r0 = getMin     // Catch:{ all -> 0x01e7 }
            r1.getMax = r0     // Catch:{ all -> 0x01e7 }
            goto L_0x0175
        L_0x01c0:
            r1.getMax = r4     // Catch:{ all -> 0x01e7 }
            r1.getMax(r7)     // Catch:{ all -> 0x01e7 }
            r1.getMax(r14)     // Catch:{ all -> 0x01e7 }
            int r0 = r1.length     // Catch:{ all -> 0x01e7 }
            length = r0     // Catch:{ all -> 0x01e7 }
            goto L_0x01e4
        L_0x01cd:
            r0 = 12
            r1.getMax(r0)     // Catch:{ all -> 0x01e7 }
            int r0 = r1.length     // Catch:{ all -> 0x01e7 }
            if (r0 != 0) goto L_0x01e4
            r0 = 56
            r6 = 56
            goto L_0x0122
        L_0x01dc:
            r6 = 47
            goto L_0x0122
        L_0x01e0:
            r6 = 36
            goto L_0x0122
        L_0x01e4:
            r6 = r12
            goto L_0x0122
        L_0x01e7:
            r0 = move-exception
            r6 = 57
            r7 = 7
            r13 = 62
            if (r12 < r10) goto L_0x01f5
            if (r12 > r7) goto L_0x01f5
            r4 = 48
            goto L_0x02c4
        L_0x01f5:
            int r14 = setMin
            r15 = 376(0x178, float:5.27E-43)
            r14 = r14 | r15
            short r14 = (short) r14
            r4 = r14 & 1920(0x780, float:2.69E-42)
            short r4 = (short) r4
            byte[] r16 = setMax
            byte r7 = r16[r9]
            int r7 = -r7
            byte r7 = (byte) r7
            java.lang.String r4 = setMin(r14, r4, r7)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x021c
            r4 = 3
            if (r12 < r4) goto L_0x021c
            if (r12 > r10) goto L_0x021c
            r4 = 48
        L_0x0219:
            r6 = 7
            goto L_0x02c4
        L_0x021c:
            r4 = 3615(0xe1f, float:5.066E-42)
            short r4 = (short) r4
            r7 = 380(0x17c, float:5.32E-43)
            short r7 = (short) r7
            byte[] r14 = setMax
            byte r14 = r14[r9]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r14 = setMin(r4, r7, r14)
            java.lang.Class r14 = java.lang.Class.forName(r14)
            boolean r14 = r14.isInstance(r0)
            if (r14 == 0) goto L_0x0240
            if (r12 < r8) goto L_0x0240
            if (r12 > r11) goto L_0x0240
        L_0x023a:
            r4 = 48
        L_0x023c:
            r6 = 62
            goto L_0x02c4
        L_0x0240:
            byte[] r14 = setMax
            byte r14 = r14[r9]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r4 = setMin(r4, r7, r14)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x025d
            r4 = 31
            if (r12 < r4) goto L_0x025d
            r4 = 32
            if (r12 > r4) goto L_0x025d
            goto L_0x023a
        L_0x025d:
            int r4 = setMin
            r4 = r4 | 351(0x15f, float:4.92E-43)
            short r4 = (short) r4
            short r7 = (short) r15
            byte[] r14 = setMax
            byte r14 = r14[r9]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r4 = setMin(r4, r7, r14)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x027e
            r4 = 41
            if (r12 < r4) goto L_0x027e
            if (r12 > r3) goto L_0x027e
            goto L_0x023a
        L_0x027e:
            byte[] r4 = setMax
            r14 = 2117(0x845, float:2.967E-42)
            byte r14 = r4[r14]
            short r14 = (short) r14
            r15 = r14 | 353(0x161, float:4.95E-43)
            short r15 = (short) r15
            byte r4 = r4[r9]
            int r4 = -r4
            byte r4 = (byte) r4
            java.lang.String r4 = setMin(r14, r15, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02a1
            r4 = 48
            if (r12 < r4) goto L_0x02a3
            if (r12 > r6) goto L_0x02a3
            goto L_0x023c
        L_0x02a1:
            r4 = 48
        L_0x02a3:
            int r13 = setMin
            r13 = r13 | 351(0x15f, float:4.92E-43)
            short r13 = (short) r13
            byte[] r14 = setMax
            byte r14 = r14[r9]
            int r14 = -r14
            byte r14 = (byte) r14
            java.lang.String r7 = setMin(r13, r7, r14)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x02ce
            r7 = 52
            if (r12 < r7) goto L_0x02ce
            if (r12 > r6) goto L_0x02ce
            goto L_0x0219
        L_0x02c4:
            r1.IsOverlapping = r0
            r0 = 26
            r1.getMax(r0)
            r4 = 1
            goto L_0x0122
        L_0x02ce:
            throw r0
        L_0x02cf:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02d7
            throw r1
        L_0x02d7:
            goto L_0x02d9
        L_0x02d8:
            throw r0
        L_0x02d9:
            goto L_0x02d8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultExtensionRegistry.stop():java.lang.Boolean");
    }

    @Inject
    public DefaultExtensionRegistry(b.AnonymousClass3 r1, BackKeyDownPoint backKeyDownPoint, getBundleName getbundlename, access$2300 access_2300, DialogLayout dialogLayout, RVJsStatTrackService rVJsStatTrackService, getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r1, backKeyDownPoint, getapplaunchparams);
        try {
            this.qrPayEntityDataFactory = getbundlename;
            try {
                this.securityEntityDataFactory = access_2300;
                try {
                    this.paymentModelMapper = rVJsStatTrackService;
                } catch (NullPointerException e) {
                    throw e;
                }
            } catch (NullPointerException e2) {
                e = e2;
                throw e;
            }
        } catch (UnsupportedOperationException e3) {
            e = e3;
            throw e;
        }
    }
}
