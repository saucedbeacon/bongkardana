package o;

import android.content.Context;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import id.dana.challenge.ChallengePinWithFaceActivity;
import id.dana.challenge.LoginFailureException;
import id.dana.di.PerActivity;
import id.dana.domain.model.rpc.response.LoginResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.registerDataSetObserver;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0004\u001a\u00020\fH\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/contract/login/HoldLoginPresenter;", "Lid/dana/contract/login/HoldLoginContract$Presenter;", "view", "Lid/dana/contract/login/HoldLoginContract$View;", "holdLogin", "Lid/dana/domain/login/interactor/HoldLogin;", "context", "Landroid/content/Context;", "splitFacade", "Lid/dana/data/toggle/SplitFacade;", "(Lid/dana/contract/login/HoldLoginContract$View;Lid/dana/domain/login/interactor/HoldLogin;Landroid/content/Context;Lid/dana/data/toggle/SplitFacade;)V", "addSplitFacadeAttribute", "", "getOAuthMerchantName", "Lkotlin/Function0;", "", "handleLoginError", "e", "", "handleLoginSuccess", "loginResponse", "Lid/dana/domain/model/rpc/response/LoginResponse;", "onDestroy", "trackDisplayedErrorLogin", "errorMessage", "exception", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class getItemPosition implements registerDataSetObserver.setMax {
    private static int equals = 0;
    public static final byte[] length;
    public static final int setMin = 154;
    private static int toIntRange = 1;
    private final UpdateAppCallback IsOverlapping;
    private final registerDataSetObserver.getMin getMax;
    private final Context getMin;
    private final GriverRVLoggerProxyImpl setMax;

    static {
        byte[] bArr = new byte[3936];
        System.arraycopy("xfìÊ\u0005ç\u0011/¾\u0007ï\u00035Öèòÿô\u0012ûò\u0003ø\u0001û÷\u0002÷øû\u0006ô÷\t÷ú÷\bõü\u0003÷ùú\u0006÷øú\u0007÷û\u0002÷øù\bõú\u0005óú\u0007õú\u0005õø\u0007óù\b÷øø\tôú\u0006ûö\u0003öþ\u0000ûõ\u0004ûô\u0005ûó\u0006ôÿ\u0001ôþ\u0002÷÷\u0002\u0000÷ý\u0000ûò\u0007ûñ\bûð\tï\u0004\u0001÷ý\u0000ûøý\u0000ûøü\u0001÷ûþ\u0000ûøû\u0002ûøú\u0003ûøù\u0004ûøø\u0005÷÷\u0001\u0001ûø÷\u0006ûð\tûó\u0006öù\u0005ûøö\u0007ôÿ\u0001ûò\u0007öö\bûøõ\bûð\tûøô\t÷÷\u0000\u0002óÿ\u0002ó\u0005÷÷ÿ\u0003÷÷þ\u0004÷üô\t÷÷\u0006û÷þ\u0000öþ\u0000û÷ý\u0001û÷ü\u0002ûøü\u0001û÷\u0002÷÷ý\u0005óÿ\u0002ó\u0005óÿ\u0002õü\u0003õþ\u0001÷÷ü\u0006õø\u0007ôû\u0005ó\u0001\u0000÷ù÷\t÷ý\u0000òù\tôû\u0005ôú\u0006ûö\u0003öþ\u0000û÷û\u0003û÷ú\u0004û÷ù\u0005öû\u0003û÷ø\u0006û÷÷\u0007÷÷û\u0007öû\u0003û÷ø\u0006÷÷ú\bïü\tû÷ö\b÷÷ù\tûø÷\u0006û÷õ\tûöÿ\u0000öù\u0005ûøõ\b÷ö\u0003\u0000ûöþ\u0001ð\u0002\u0002ûöý\u0002ûöü\u0003ûöû\u0004ûð\tïý\bûöú\u0005ûöù\u0006ûöø\u0007ð\u0002\u0002ûöý\u0002ûöü\u0003ôþ\u0002÷÷\u0002\u0000÷ý\u0000ûöû\u0004öö\bûøö\u0007ûøô\t÷ö\u0002\u0001ó\u0001\u0000ó\u0005õÿ\u0000÷ûø\u0006÷ý\u0000õú\u0005õÿ\u0000÷û÷\u0007÷úý\u0002öö\b÷ö\u0001\u0002õþ\u0001÷ý\u0000÷ö\u0000\u0003öö\b÷öÿ\u0004òú\b÷ý\u0000òù\t÷ø\u0005÷÷\u0006û÷þ\u0000öþ\u0000ûö÷\bûöö\tûõ\u0000\u0000ï\u0004\u0001÷ý\u0000ûøý\u0000÷öþ\u0005ûöþ\u0001ûøô\t÷öý\u0006ó\u0005÷û\u0002÷ü÷\u0006öö\bï\t÷ýø\u0004ï\u0002\u0003÷öü\u0007û÷þ\u0000öú\u0004÷÷\u0006ûõÿ\u0001ûõþ\u0002ûõý\u0003öú\u0004öþ\u0000÷ý\u0000ûõü\u0004÷öû\b÷ý\u0000ûøý\u0000ûõû\u0005ûõú\u0006ûõù\u0007ûõø\u0005ç\u0011/¾\u0007ï\u00035á×\u0006ûé%Öý!å Ïö\u0003\u0006í*É\u0011úñø\u0007öý\u0005ç\u0011/¾\u0007ï\u00035áÙü\u0003ú\u0002ñ\u0015Û\u000fé\u000b\u001cÉ\u0011úñø\u0007öýï\u0006îÿ\u0002\u00012Çðýö\u000bóöBçÐýö\u000bé\u0000ø\u0001öû\u0003û÷\u0002öû\u0003ûö\u0003ûõ\u0004ôþ\u0002ûô\u0005÷ý\u0000ûó\u0006ñ\u0003\u0000ûò\u0007ñ\u0002\u0001ûñ\bûð\tûøý\u0000ûøü\u0001ûøû\u0002ûøú\u0003ñ\u0001\u0002õø\u0007õþ\u0001÷ý\u0000õü\u0003ñ\u0000\u0003õÿ\u0000õþ\u0001÷ý\u0000óÿ\u0002óþ\u0003óý\u0004÷÷\u0006ûøù\u0004öú\u0004÷÷\u0006ûøø\u0005ûø÷\u0006ûøö\u0007ûøú\u0003ñÿ\u0004ñþ\u0005ñý\u0006õþ\u0001ñü\u0007ñû\bñú\t÷ý\u0000ð\u0004\u0000ôû\u0005òú\bð\u0003\u0001õö\t÷÷\u0006ûøù\u0004öþ\u0000ûøõ\bûøô\tû÷þ\u0000÷ý\u0000û÷ý\u0001ôÿ\u0001û÷ü\u0002öû\u0003û÷\u0002öû\u0003ûö\u0003ûõ\u0004ûó\u0006û÷û\u0003ð\u0002\u0002û÷ú\u0004û÷ù\u0005û÷ø\u0006û÷ù\u0005û÷÷\u0007û÷û\u0003û÷û\u0003öû\u0003ûö\u0003ð\u0002\u0002û÷ö\bû÷õ\tûöÿ\u0000ûöþ\u0001ð\u0001\u0003ûöý\u0002ûöü\u0003ûöû\u0004ð\u0000\u0004ó\u0005õÿ\u0000ó\u0001\u0000ðÿ\u0005õú\u0005òÿ\u0003òþ\u0004õü\u0003õü\u0003÷ý\u0000õÿ\u0000öö\bðþ\u0006ôú\u0006ûöú\u0005öþ\u0000ûöù\u0006ûöø\u0007ûö÷\bðý\u0007ûò\u0007ðü\bûöö\tûõ\u0000\u0000ûõÿ\u0001ûõþ\u0002ôÿ\u0001ðû\tï\u0005\u0000û÷ü\u0002ï\u0004\u0001÷ý\u0000ûõý\u0003û÷û\u0003ûøú\u0003ï\u0003\u0002ó\u0005ó\u0005ðÿ\u0005ð\bï\t÷ý\u0000õü\u0003ï\u0002\u0003÷ø\u0005÷÷\u0006ûøù\u0004öú\u0004÷÷\u0006ûõü\u0004ûõû\u0005ûõú\u0006ð\u0002\u0002û÷ú\u0004û÷ù\u0005û÷ø\u0006û÷ù\u0005ï\u0001\u0004ï\u0000\u0005û÷÷\u0007ïÿ\u0006ûõù\u0007ïþ\u0007ûõø\bûõ÷\tûô\u0001\u0000ïý\bûô\u0000\u0001ûôÿ\u0002ûôþ\u0003ð\u0002\u0002û÷ö\bïü\tûôý\u0004ûôü\u0005ûôû\u0006ûôú\u0007÷ýü\u0000ûôù\b÷ýû\u0001ûöö\t÷ýú\u0002ûõù\u0007û÷û\u0003óü\u0005÷÷\u0006÷ý\u0000û÷ý\u0001ûôø\tôÿ\u0001û÷ü\u0002ûó\u0002\u0000ûöû\u0004ï\u0001\u0004ñþ\u0005õü\u0003õþ\u0001÷ý\u0000õÿ\u0000÷ýù\u0003ï\t÷ýø\u0004÷ý÷\u0005õþ\u0001÷ý\u0000÷ýö\u0006ôû\u0005ôú\u0006ûöú\u0005öþ\u0000ûó\u0001\u0001ûó\u0000\u0002ûóÿ\u0003ûõ\u0000\u0000÷ýõ\u0007ö÷\u0007÷ý\u0000ûõÿ\u0001ð\u0002\u0002û÷ö\bû÷ù\u0005ûóþ\u0004ûóý\u0005ûóü\u0006ûøú\u0003÷ýô\bôû\u0005ó\u0001\u0000õü\u0003÷ýó\tò\u0006õû\u0004÷üý\u0000÷üü\u0001óÿ\u0002òú\b÷ý\u0000ï\u0002\u0003÷üû\u0002óý\u0004÷÷\u0006ûøù\u0004öú\u0004÷÷\u0006ûóû\u0007ûóú\bûóù\tðý\u0007ûôù\bð\u0002\u0002ûò\u0003\u0000ûò\u0002\u0001ûò\u0001\u0002ûò\u0000\u0003ðü\bûöý\u0002û÷û\u0003û÷þ\u0000÷üú\u0003ûñ\bû÷û\u0003ïþ\u0007ûõø\bûõ÷\tûô\u0001\u0000ïý\bûô\u0000\u0001÷üù\u0004ûôÿø\u0001÷õý\u0007û÷\u0002ûö\u0003öú\u0004öú\u0004÷÷\u0006÷ý\u0000ûõ\u0004ûö\u0003÷úû\u0004ûô\u0005ûó\u0006ûö\u0003ûò\u0007÷õü\bóÿ\u0002ó\u0005÷ùü\u0004÷ú÷\bõÿ\u0000ñ\u0007÷õ\u0003\u0001÷õû\t÷ô\u0005\u0000óÿ\u0002÷ô\u0004\u0001õü\u0003ó\u0000\u0001öö\bðþ\u0006ôú\u0006ûñ\böþ\u0000ûð\tûøý\u0000ûøü\u0001öö\bûøû\u0002ûøú\u0003÷ô\u0003\u0002óÿ\u0002÷ô\u0002\u0003òú\b÷úÿ\u0000÷õ\u0000\u0004ôû\u0005óý\u0004÷÷\u0006ûøù\u0004öú\u0004÷÷\u0006ûøø\u0005ûø÷\u0006ûøö\u0007öù\u0005ûøû\u0002÷úû\u0004ûô\u0005÷ô\u0001\u0004÷ô\u0000\u0005ï\u0005\u0000ûó\u0006ûøõ\bôÿ\u0001ûøô\tû÷þ\u0000÷ôÿ\u0006û÷\u0002ôÿ\u0001ôþ\u0002û÷ý\u0001÷ý\u0000ûøô\tûöø\u0001û÷\u0002÷öú\tóÿ\u0002ó\u0005ðÿ\u0005õÿ\u0000÷ýù\u0003ï\t÷õ\u0004\u0000÷øþ\u0003ñ\u0007÷õ\u0003\u0001õü\u0003÷úö\tóÿ\u0002÷õ\u0002\u0002÷õ\u0001\u0003ï\u0002\u0003÷õ\u0000\u0004÷öü\u0007ûö\u0003öú\u0004÷÷\u0006ûõ\u0004ûô\u0005ûó\u0006ûò\u0007öö\bûñ\böû\u0003ûð\tôþ\u0002÷õÿ\u0005ûøý\u0000öú\u0004÷õþ\u0006ûøü\u0001öù\u0005ûñ\böû\u0003ûð\tûøý\u0000ûò\u0007ôÿ\u0001ûøû\u0002ûøú\u0003ûò\u0005ç\u0011/¾\u0007ï\u00035á×ö\u000búþï\u0005ç\u0011/¾\u0007ï\u00035çÓ\u0007êü,Þêû+É\u0011úñø\u0007öý\u0005ç\u0011/¾\u0007ï\u00035ÜÕ\u0005ü\u0018Ý\u0002÷ö\u000bï)É\u0011úñø\u0007öýø\u0001û÷\u0002ûö\u0003ûõ\u0004ô\u0004ó\u0005ò\u0006ñ\u0007ð\bï\t÷ý\u0000÷ü\u0001÷û\u0002÷ú\u0003÷ù\u0004÷ø\u0005÷÷\u0006ûô\u0005öþ\u0000ûó\u0006ûò\u0007ûñ\böû\u0003ûð\tûøý\u0000öû\u0003ûøü\u0001ûøû\u0002öú\u0004öþ\u0000÷ý\u0000ûøú\u0003ûøù\u0004ûøø\u0005öù\u0005ûø÷\u0006ûøù\u0004öø\u0006ö÷\u0007÷ý\u0000ûøø\u0005öû\u0003ûøö\u0007ûøõ\böû\u0003ûøô\tû÷þ\u0000û÷ý\u0001öù\u0005û÷ü\u0002öö\bûø÷\u0006ûö\u0003öö\bû÷ü\u0002û÷û\u0003û÷ú\u0004öõ\tõÿ\u0000õþ\u0001õý\u0002õü\u0003õû\u0004õú\u0005õù\u0006õø\u0007õ÷\bõö\t÷÷\u0006û÷ù\u0005öú\u0004÷÷\u0006û÷ø\u0006û÷÷\u0007û÷û\u0003û÷ö\bôÿ\u0001ôþ\u0002û÷õ\t÷ý\u0000ûöÿ\u0000û÷ú\u0004ôý\u0003ôü\u0004ôû\u0005ôú\u0006û÷ù\u0005öþ\u0000ûöþ\u0001ûöý\u0002ûöü\u0003ûö\u0003ôÿ\u0001ûöÿ\u0000ûöÿ\u0000ÿñø\u0001öù\u0005û÷\u0002ûö\u0003÷üø\u0005óÿ\u0002÷û\u0002÷ü÷\u0006õø\u0007õþ\u0001÷üö\u0007ñ\u0000\u0003õÿ\u0000õþ\u0001÷ý\u0000÷üõ\b÷üô\t÷÷\u0006ûõ\u0004öú\u0004÷÷\u0006ûô\u0005ûó\u0006ûò\u0007öö\bû÷\u0002ûñ\bôÿ\u0001ôþ\u0002ûð\t÷ý\u0000ûøý\u0000ûñ\böú\u0004öú\u0004÷÷\u0006÷ý\u0000ûøü\u0001ûøû\u0002ûøú\u0003÷ûþ\u0000ûøù\u0004ð\u0002\u0002ûøø\u0005ûø÷\u0006ôÿ\u0001ûøý\u0000ûö\u0003÷ûý\u0001÷ûü\u0002ò\u0000\u0002÷ûû\u0003ôú\u0006ûõ\u0004öú\u0004÷÷\u0006ûøö\u0007ûøõ\bûøô\tûñ\bûò\u0005ç\u0011/¾\u0007ï\u00035×Ûþ\u0005÷\u0003ø\u0001û÷\u0002ûö\u0003ôø\bô÷\tó\u0001\u0000õü\u0003ó\u0000\u0001õþ\u0001÷ý\u0000óÿ\u0002óþ\u0003óý\u0004÷÷\u0006ûõ\u0004öþ\u0000ûô\u0005ûó\u0006ûò\u0007öû\u0003ûñ\bûð\tûøý\u0000ûò\u0007ôÿ\u0001ûøü\u0001û÷\u0002óü\u0005÷÷\u0006÷ý\u0000ûøûø\u0001û÷\u0002÷ûú\u0004÷ûù\u0005ó\u0005õÿ\u0000÷ûø\u0006÷ý\u0000õú\u0005õÿ\u0000÷û÷\u0007÷ûö\bõü\u0003÷ûõ\t÷úÿ\u0000÷úþ\u0001÷úý\u0002õø\u0007õþ\u0001÷ý\u0000óÿ\u0002÷úü\u0003÷ø\u0005÷÷\u0006ûö\u0003öþ\u0000ûõ\u0004ûô\u0005ûó\u0006ûò\u0007öû\u0003ûñ\bûð\tûøý\u0000ûøü\u0001öû\u0003ûñ\bð\u0002\u0002ûøû\u0002ûøú\u0003÷úû\u0004ûøû\u0002ûøù\u0004ûøø\u0005öù\u0005ûø÷\u0006ûøö\u0007ôÿ\u0001ûøõ\bð\u0002\u0002ûøô\tû÷þ\u0000ûøö\u0007û÷ý\u0001û÷ü\u0002ð\u0002\u0002û÷û\u0003û÷ú\u0004û÷ù\u0005û÷\u0002÷úú\u0005÷úù\u0006õü\u0003÷úø\u0007÷ûõ\t÷ú÷\b÷úö\t÷û÷\u0007÷ûö\bõü\u0003÷ù\u0000\u0000öö\bï\u0002\u0003÷ùÿ\u0001÷ùþ\u0002÷ý\u0000óø\tôû\u0005óý\u0004÷÷\u0006ûö\u0003öú\u0004÷÷\u0006û÷ø\u0006û÷÷\u0007û÷ö\bûó\u0006ï\u0004\u0001÷ý\u0000û÷õ\tûøö\u0007ôÿ\u0001ûøõ\böù\u0005ûöÿ\u0000û÷\u0002÷ùý\u0003÷ùü\u0004÷ùû\u0005õü\u0003õü\u0003÷ùú\u0006÷ý\u0000÷ùù\u0007õþ\u0001÷ü÷\u0006÷üô\t÷÷\u0006ûö\u0003öú\u0004÷÷\u0006ûöþ\u0001ûöý\u0002ûøü\u0001ûöü\u0003öö\bûø÷\u0006ûöû\u0004ûöú\u0005÷ùø\bôû\u0005÷ú÷\b÷û÷\u0007ôû\u0005óÿ\u0002ó\u0001\u0000÷ù÷\tð\u0003\u0001÷ø\u0001\u0000ï\u0002\u0003÷ø\u0005÷÷\u0006ûöù\u0006öú\u0004÷÷\u0006ûöø\u0007ûö÷\bûöö\tû÷\u0002÷ø\u0000\u0001ó\u0005óÿ\u0002÷øÿ\u0002÷úø\u0007÷ûõ\t÷øþ\u0003õú\u0005ñ\u0007óÿ\u0002÷øÿ\u0002õü\u0003÷ý\u0000òü\u0006÷øý\u0004ó\u0005÷üõ\bõø\u0007ñ\u0007óÿ\u0002õü\u0003ï\u0002\u0003ôû\u0005óý\u0004÷÷\u0006ûö\u0003öþ\u0000ûõ\u0000\u0000ûõÿ\u0001ûò\u0007ûöö\töö\bûöÿ\u0000ð\u0002\u0002ûõþ\u0002ð\u0002\u0002ûõý\u0003ûõü\u0004ûõû\u0005ûõú\u0006û÷\u0002÷ø\u0000\u0001ñ\u0000\u0003õü\u0003óù\bð\u0004\u0000ó\u0005÷ýù\u0003÷øü\u0005÷úü\u0003ôû\u0005óý\u0004÷÷\u0006ûö\u0003öú\u0004÷÷\u0006ûõù\u0007ûõø\bûøø\u0005ôÿ\u0001ôþ\u0002ûõ÷\t÷ý\u0000ûøõ\u0005ç\u0011/¾\u0007ï\u00035Õã÷ú\u0001üýùú\u000bý\u0011Û\u0007ï\ré\u0007öý%É\u0011úñø\u0007öý\u0011ñó\f\u0012å÷ö\u001aññó\fþí#äîü\u000eöþ\u0005ç\u0011/¾\u0007ï\u00035ÜÕ\u0004\u0007ùï(Óù\u0001\bé+É\u0011úñø\u0007öý\u0005ç\u0011/¾\u0007ï\u00035ØÙ\u0003ö\u0007ø\u0004\u001cÉ\u0011úñø\u0007öýðý\u0007þéþí\u001dÛþ\u0005÷\u0003\u0005ç\u0011/¾\u0007ï\u00035áÙü\u0003ú\u0002ñ'Ë\u0007î\u0004\u0004óö+É\u0011úñø\u0007öý\u0005ç\u0011/¾\u0007ï\u00035åÉ\u0011úñø\u0007öýø\u0001û÷\u0002÷ôþ\u0007ûö\u0003ûõ\u0004÷ôý\bõþ\u0001÷ú\u0003÷ö\u0001\u0002ôü\u0004ôû\u0005óý\u0004÷÷\u0006ûô\u0005öþ\u0000ûó\u0006ûò\u0007ûñ\bû÷\u0002ûð\tï\u0004\u0001÷ý\u0000ûøý\u0000ôÿ\u0001ûøü\u0001÷úû\u0004ûøû\u0002ûøú\u0003÷ôü\tûö\u0003öû\u0003ð\u0002\u0002ûøû\u0002ôþ\u0002ûøù\u0004÷ý\u0000ûøú\u0003û÷ø\u0001û÷\u0002ûö\u0003óü\u0005÷÷\u0006÷ý\u0000ûõ\u0004ûô\u0005öû\u0003ûó\u0006ûò\u0007ûñ\bûö\u0003ôÿ\u0001ûð\tûøý\u0000óû\u0006óú\u0007õÿ\u0000óù\bóø\tôû\u0005ôú\u0006ûøü\u0001öú\u0004÷÷\u0006ûøû\u0002ûøú\u0003û÷\u0002ûøù\u0004ò\u0002\u0000ó\u0005ò\u0001\u0001õü\u0003ò\u0000\u0002òÿ\u0003òþ\u0004òý\u0005÷ý\u0000òü\u0006òû\u0007òú\b÷ý\u0000òù\tôû\u0005ôú\u0006ûøø\u0005öþ\u0000ûø÷\u0006ûøö\u0007ûô\u0005ç\u0011/¾\u0007ï\u00035×Ûþ\u0005÷\u0003!É\bù\u0004ûï\u0005ç\u0011/¾\u0007ï\u00035Ûéô\u0001þë\u0005ç\u0011/¾\u0007ï\u00035éËü\rä\"Û\u0001ù\t\u001cÉ\u0011úñø\u0007öýíü\u0007ó\u0006".getBytes("ISO-8859-1"), 0, bArr, 0, 3936);
        length = bArr;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01ad, code lost:
        r7 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.jvm.functions.Function0<java.lang.String> getMin() {
        /*
            r18 = this;
            o.getTabIndicatorColor r1 = new o.getTabIndicatorColor
            r2 = r18
            r1.<init>(r2)
            r0 = 73
            byte r0 = (byte) r0
            r3 = 1317(0x525, float:1.846E-42)
            short r3 = (short) r3
            r4 = 94
            short r4 = (short) r4
            java.lang.String r0 = setMin(r0, r3, r4)
            r3 = 74
            byte r3 = (byte) r3
            r4 = 398(0x18e, float:5.58E-43)
            short r4 = (short) r4
            byte[] r5 = length
            r6 = 83
            byte r5 = r5[r6]
            short r5 = (short) r5
            java.lang.String r3 = setMin(r3, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0221 }
            r7 = 0
            r5[r7] = r3     // Catch:{ all -> 0x0221 }
            byte[] r3 = length     // Catch:{ all -> 0x0221 }
            r8 = 3446(0xd76, float:4.829E-42)
            byte r3 = r3[r8]     // Catch:{ all -> 0x0221 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x0221 }
            r9 = 1332(0x534, float:1.867E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0221 }
            byte[] r10 = length     // Catch:{ all -> 0x0221 }
            r11 = 689(0x2b1, float:9.65E-43)
            byte r10 = r10[r11]     // Catch:{ all -> 0x0221 }
            short r10 = (short) r10     // Catch:{ all -> 0x0221 }
            java.lang.String r3 = setMin(r3, r9, r10)     // Catch:{ all -> 0x0221 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0221 }
            byte[] r10 = length     // Catch:{ all -> 0x0221 }
            r12 = 11
            byte r10 = r10[r12]     // Catch:{ all -> 0x0221 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0221 }
            r12 = 1537(0x601, float:2.154E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0221 }
            byte[] r13 = length     // Catch:{ all -> 0x0221 }
            r14 = 86
            byte r13 = r13[r14]     // Catch:{ all -> 0x0221 }
            short r13 = (short) r13     // Catch:{ all -> 0x0221 }
            java.lang.String r10 = setMin(r10, r12, r13)     // Catch:{ all -> 0x0221 }
            java.lang.Class[] r12 = new java.lang.Class[r4]     // Catch:{ all -> 0x0221 }
            byte[] r13 = length     // Catch:{ all -> 0x0221 }
            byte r13 = r13[r8]     // Catch:{ all -> 0x0221 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0221 }
            byte[] r14 = length     // Catch:{ all -> 0x0221 }
            byte r14 = r14[r11]     // Catch:{ all -> 0x0221 }
            short r14 = (short) r14     // Catch:{ all -> 0x0221 }
            java.lang.String r13 = setMin(r13, r9, r14)     // Catch:{ all -> 0x0221 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0221 }
            r12[r7] = r13     // Catch:{ all -> 0x0221 }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r12)     // Catch:{ all -> 0x0221 }
            java.lang.Object r0 = r3.invoke(r0, r5)     // Catch:{ all -> 0x0221 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0221 }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r5 = 0
        L_0x007d:
            int r10 = r0.length
            if (r5 >= r10) goto L_0x0124
            r10 = r0[r5]
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ all -> 0x011b }
            r12[r7] = r10     // Catch:{ all -> 0x011b }
            byte[] r10 = length     // Catch:{ all -> 0x011b }
            byte r10 = r10[r8]     // Catch:{ all -> 0x011b }
            byte r10 = (byte) r10     // Catch:{ all -> 0x011b }
            r13 = r10 | 1906(0x772, float:2.671E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x011b }
            byte[] r14 = length     // Catch:{ all -> 0x011b }
            r15 = 113(0x71, float:1.58E-43)
            byte r14 = r14[r15]     // Catch:{ all -> 0x011b }
            int r14 = -r14
            short r14 = (short) r14     // Catch:{ all -> 0x011b }
            java.lang.String r10 = setMin(r10, r13, r14)     // Catch:{ all -> 0x011b }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x011b }
            byte[] r13 = length     // Catch:{ all -> 0x011b }
            byte r13 = r13[r6]     // Catch:{ all -> 0x011b }
            byte r13 = (byte) r13     // Catch:{ all -> 0x011b }
            r14 = r13 | 488(0x1e8, float:6.84E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x011b }
            byte[] r16 = length     // Catch:{ all -> 0x011b }
            r17 = 30
            byte r6 = r16[r17]     // Catch:{ all -> 0x011b }
            short r6 = (short) r6     // Catch:{ all -> 0x011b }
            java.lang.String r6 = setMin(r13, r14, r6)     // Catch:{ all -> 0x011b }
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch:{ all -> 0x011b }
            byte[] r14 = length     // Catch:{ all -> 0x011b }
            byte r14 = r14[r8]     // Catch:{ all -> 0x011b }
            byte r14 = (byte) r14     // Catch:{ all -> 0x011b }
            byte[] r16 = length     // Catch:{ all -> 0x011b }
            byte r4 = r16[r11]     // Catch:{ all -> 0x011b }
            short r4 = (short) r4     // Catch:{ all -> 0x011b }
            java.lang.String r4 = setMin(r14, r9, r4)     // Catch:{ all -> 0x011b }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x011b }
            r13[r7] = r4     // Catch:{ all -> 0x011b }
            java.lang.reflect.Method r4 = r10.getMethod(r6, r13)     // Catch:{ all -> 0x011b }
            r6 = 0
            java.lang.Object r4 = r4.invoke(r6, r12)     // Catch:{ all -> 0x011b }
            byte[] r10 = length     // Catch:{ all -> 0x0112 }
            byte r10 = r10[r8]     // Catch:{ all -> 0x0112 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0112 }
            r12 = r10 | 1906(0x772, float:2.671E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0112 }
            byte[] r13 = length     // Catch:{ all -> 0x0112 }
            byte r13 = r13[r15]     // Catch:{ all -> 0x0112 }
            int r13 = -r13
            short r13 = (short) r13     // Catch:{ all -> 0x0112 }
            java.lang.String r10 = setMin(r10, r12, r13)     // Catch:{ all -> 0x0112 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0112 }
            byte[] r12 = length     // Catch:{ all -> 0x0112 }
            r13 = 3429(0xd65, float:4.805E-42)
            byte r12 = r12[r13]     // Catch:{ all -> 0x0112 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0112 }
            r13 = 482(0x1e2, float:6.75E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0112 }
            byte[] r14 = length     // Catch:{ all -> 0x0112 }
            r15 = 9
            byte r14 = r14[r15]     // Catch:{ all -> 0x0112 }
            short r14 = (short) r14     // Catch:{ all -> 0x0112 }
            java.lang.String r12 = setMin(r12, r13, r14)     // Catch:{ all -> 0x0112 }
            java.lang.reflect.Method r10 = r10.getMethod(r12, r6)     // Catch:{ all -> 0x0112 }
            java.lang.Object r4 = r10.invoke(r4, r6)     // Catch:{ all -> 0x0112 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0112 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0112 }
            r3[r5] = r4
            int r5 = r5 + 1
            r4 = 1
            r6 = 83
            goto L_0x007d
        L_0x0112:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011a
            throw r1
        L_0x011a:
            throw r0
        L_0x011b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0123
            throw r1
        L_0x0123:
            throw r0
        L_0x0124:
            r4 = 23
            r5 = 19
            r6 = 2
        L_0x0129:
            int r9 = r7 + 1
            r10 = 21
            r0 = r3[r7]     // Catch:{ all -> 0x01b0 }
            int r0 = r1.setMin(r0)     // Catch:{ all -> 0x01b0 }
            r7 = 22
            r11 = 18
            r12 = 17
            switch(r0) {
                case -12: goto L_0x01a9;
                case -11: goto L_0x019e;
                case -10: goto L_0x019c;
                case -9: goto L_0x0189;
                case -8: goto L_0x0171;
                case -7: goto L_0x016e;
                case -6: goto L_0x016b;
                case -5: goto L_0x0161;
                case -4: goto L_0x0153;
                case -3: goto L_0x014a;
                case -2: goto L_0x0142;
                case -1: goto L_0x013f;
                default: goto L_0x013c;
            }     // Catch:{ all -> 0x01b0 }
        L_0x013c:
            r11 = 1
            goto L_0x01ad
        L_0x013f:
            r7 = 27
            goto L_0x0129
        L_0x0142:
            r1.setMin(r6)     // Catch:{ all -> 0x01b0 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x01b0 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01b0 }
            throw r0     // Catch:{ all -> 0x01b0 }
        L_0x014a:
            int r0 = equals     // Catch:{ all -> 0x01b0 }
            r1.getMax = r0     // Catch:{ all -> 0x01b0 }
            r0 = 3
            r1.setMin(r0)     // Catch:{ all -> 0x01b0 }
            goto L_0x013c
        L_0x0153:
            r7 = 1
            r1.getMax = r7     // Catch:{ all -> 0x01b0 }
            r1.setMin(r12)     // Catch:{ all -> 0x01b0 }
            r1.setMin(r11)     // Catch:{ all -> 0x01b0 }
            int r0 = r1.setMin     // Catch:{ all -> 0x01b0 }
            toIntRange = r0     // Catch:{ all -> 0x01b0 }
            goto L_0x013c
        L_0x0161:
            r1.setMin(r5)     // Catch:{ all -> 0x01b0 }
            int r0 = r1.setMin     // Catch:{ all -> 0x01b0 }
            if (r0 != 0) goto L_0x01ad
            r7 = 18
            goto L_0x0129
        L_0x016b:
            r7 = 23
            goto L_0x0129
        L_0x016e:
            r7 = 24
            goto L_0x0129
        L_0x0171:
            o.getItemPosition$setMin r0 = new o.getItemPosition$setMin     // Catch:{ all -> 0x01b0 }
            r11 = 1
            r1.getMax = r11     // Catch:{ all -> 0x01a7 }
            r1.setMin(r12)     // Catch:{ all -> 0x01b0 }
            r1.setMin(r10)     // Catch:{ all -> 0x01b0 }
            java.lang.Object r11 = r1.isInside     // Catch:{ all -> 0x01b0 }
            o.getItemPosition r11 = (o.getItemPosition) r11     // Catch:{ all -> 0x01b0 }
            r0.<init>(r11)     // Catch:{ all -> 0x01b0 }
            r1.equals = r0     // Catch:{ all -> 0x01b0 }
            r1.setMin(r7)     // Catch:{ all -> 0x01b0 }
            goto L_0x013c
        L_0x0189:
            r11 = 1
            r1.getMax = r11     // Catch:{ all -> 0x01a7 }
            r1.setMin(r12)     // Catch:{ all -> 0x01a7 }
            r1.setMin(r10)     // Catch:{ all -> 0x01a7 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x01a7 }
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0     // Catch:{ all -> 0x01a7 }
            r1.equals = r0     // Catch:{ all -> 0x01a7 }
            r1.setMin(r7)     // Catch:{ all -> 0x01a7 }
            goto L_0x01ad
        L_0x019c:
            r7 = 2
            goto L_0x0129
        L_0x019e:
            r11 = 1
            r1.setMin(r6)     // Catch:{ all -> 0x01a7 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x01a7 }
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0     // Catch:{ all -> 0x01a7 }
            return r0
        L_0x01a7:
            r0 = move-exception
            goto L_0x01b2
        L_0x01a9:
            r7 = 19
            goto L_0x0129
        L_0x01ad:
            r7 = r9
            goto L_0x0129
        L_0x01b0:
            r0 = move-exception
            r11 = 1
        L_0x01b2:
            byte[] r7 = length
            byte r12 = r7[r8]
            byte r12 = (byte) r12
            r13 = r12 | 1890(0x762, float:2.648E-42)
            short r13 = (short) r13
            r14 = 655(0x28f, float:9.18E-43)
            byte r7 = r7[r14]
            int r7 = -r7
            short r7 = (short) r7
            java.lang.String r7 = setMin(r12, r13, r7)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x01d3
            if (r9 < r6) goto L_0x01d3
            if (r9 > r5) goto L_0x01d3
            goto L_0x0215
        L_0x01d3:
            byte[] r7 = length
            byte r12 = r7[r8]
            byte r12 = (byte) r12
            r13 = r12 | 1890(0x762, float:2.648E-42)
            short r13 = (short) r13
            byte r7 = r7[r14]
            int r7 = -r7
            short r7 = (short) r7
            java.lang.String r7 = setMin(r12, r13, r7)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x01f6
            r7 = 14
            if (r9 < r7) goto L_0x01f6
            r7 = 15
            if (r9 > r7) goto L_0x01f6
            goto L_0x0215
        L_0x01f6:
            byte[] r7 = length
            byte r12 = r7[r8]
            byte r12 = (byte) r12
            r13 = r12 | 386(0x182, float:5.41E-43)
            short r13 = (short) r13
            r14 = 654(0x28e, float:9.16E-43)
            byte r7 = r7[r14]
            short r7 = (short) r7
            java.lang.String r7 = setMin(r12, r13, r7)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x0220
            if (r9 < r10) goto L_0x0220
            if (r9 > r4) goto L_0x0220
        L_0x0215:
            r7 = 26
            r1.equals = r0
            r0 = 47
            r1.setMin(r0)
            goto L_0x0129
        L_0x0220:
            throw r0
        L_0x0221:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0229
            throw r1
        L_0x0229:
            goto L_0x022b
        L_0x022a:
            throw r0
        L_0x022b:
            goto L_0x022a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getItemPosition.getMin():kotlin.jvm.functions.Function0");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r9v15 */
    /* JADX WARNING: type inference failed for: r9v20 */
    /* JADX WARNING: type inference failed for: r9v30 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02bb, code lost:
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x036e, code lost:
        r12 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03d4, code lost:
        r12 = r4;
        r0 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03d6, code lost:
        r4 = '!';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x053b, code lost:
        if (r14 <= 92) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0146, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0153, code lost:
        r1.setMin(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0170, code lost:
        r0 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0212, code lost:
        r1.setMin(22);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02a6 A[Catch:{ all -> 0x029c, all -> 0x02be }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a7 A[Catch:{ all -> 0x029c, all -> 0x02be }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x032f A[Catch:{ all -> 0x0324, all -> 0x0331 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0330 A[Catch:{ all -> 0x0324, all -> 0x0331 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x05a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void length(java.lang.String r25, java.lang.Throwable r26) {
        /*
            r24 = this;
            o.getTabIndicatorColor r1 = new o.getTabIndicatorColor
            r2 = r24
            r0 = r25
            r3 = r26
            r1.<init>(r2, r0, r3)
            r0 = 73
            byte r0 = (byte) r0
            r3 = 3909(0xf45, float:5.478E-42)
            short r3 = (short) r3
            r4 = 615(0x267, float:8.62E-43)
            short r4 = (short) r4
            java.lang.String r0 = setMin(r0, r3, r4)
            r3 = 74
            byte r3 = (byte) r3
            r4 = 398(0x18e, float:5.58E-43)
            short r4 = (short) r4
            byte[] r5 = length
            r6 = 83
            byte r5 = r5[r6]
            short r5 = (short) r5
            java.lang.String r3 = setMin(r3, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x05a3 }
            r7 = 0
            r5[r7] = r3     // Catch:{ all -> 0x05a3 }
            byte[] r3 = length     // Catch:{ all -> 0x05a3 }
            r8 = 3446(0xd76, float:4.829E-42)
            byte r3 = r3[r8]     // Catch:{ all -> 0x05a3 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x05a3 }
            r9 = 1332(0x534, float:1.867E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x05a3 }
            byte[] r10 = length     // Catch:{ all -> 0x05a3 }
            r11 = 689(0x2b1, float:9.65E-43)
            byte r10 = r10[r11]     // Catch:{ all -> 0x05a3 }
            short r10 = (short) r10     // Catch:{ all -> 0x05a3 }
            java.lang.String r3 = setMin(r3, r9, r10)     // Catch:{ all -> 0x05a3 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x05a3 }
            byte[] r10 = length     // Catch:{ all -> 0x05a3 }
            r12 = 11
            byte r10 = r10[r12]     // Catch:{ all -> 0x05a3 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x05a3 }
            r12 = 1537(0x601, float:2.154E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x05a3 }
            byte[] r13 = length     // Catch:{ all -> 0x05a3 }
            r14 = 86
            byte r13 = r13[r14]     // Catch:{ all -> 0x05a3 }
            short r13 = (short) r13     // Catch:{ all -> 0x05a3 }
            java.lang.String r10 = setMin(r10, r12, r13)     // Catch:{ all -> 0x05a3 }
            java.lang.Class[] r12 = new java.lang.Class[r4]     // Catch:{ all -> 0x05a3 }
            byte[] r13 = length     // Catch:{ all -> 0x05a3 }
            byte r13 = r13[r8]     // Catch:{ all -> 0x05a3 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x05a3 }
            byte[] r14 = length     // Catch:{ all -> 0x05a3 }
            byte r14 = r14[r11]     // Catch:{ all -> 0x05a3 }
            short r14 = (short) r14     // Catch:{ all -> 0x05a3 }
            java.lang.String r13 = setMin(r13, r9, r14)     // Catch:{ all -> 0x05a3 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x05a3 }
            r12[r7] = r13     // Catch:{ all -> 0x05a3 }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r12)     // Catch:{ all -> 0x05a3 }
            java.lang.Object r0 = r3.invoke(r0, r5)     // Catch:{ all -> 0x05a3 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x05a3 }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r5 = 0
        L_0x0081:
            int r10 = r0.length
            r12 = 0
            if (r5 >= r10) goto L_0x012a
            r10 = r0[r5]
            java.lang.Object[] r13 = new java.lang.Object[r4]     // Catch:{ all -> 0x0121 }
            r13[r7] = r10     // Catch:{ all -> 0x0121 }
            byte[] r10 = length     // Catch:{ all -> 0x0121 }
            byte r10 = r10[r8]     // Catch:{ all -> 0x0121 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0121 }
            r14 = r10 | 1906(0x772, float:2.671E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0121 }
            byte[] r15 = length     // Catch:{ all -> 0x0121 }
            r16 = 113(0x71, float:1.58E-43)
            byte r15 = r15[r16]     // Catch:{ all -> 0x0121 }
            int r15 = -r15
            short r15 = (short) r15     // Catch:{ all -> 0x0121 }
            java.lang.String r10 = setMin(r10, r14, r15)     // Catch:{ all -> 0x0121 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0121 }
            byte[] r14 = length     // Catch:{ all -> 0x0121 }
            byte r14 = r14[r6]     // Catch:{ all -> 0x0121 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0121 }
            r15 = r14 | 488(0x1e8, float:6.84E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0121 }
            byte[] r16 = length     // Catch:{ all -> 0x0121 }
            r17 = 30
            byte r6 = r16[r17]     // Catch:{ all -> 0x0121 }
            short r6 = (short) r6     // Catch:{ all -> 0x0121 }
            java.lang.String r6 = setMin(r14, r15, r6)     // Catch:{ all -> 0x0121 }
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x0121 }
            byte[] r15 = length     // Catch:{ all -> 0x0121 }
            byte r15 = r15[r8]     // Catch:{ all -> 0x0121 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0121 }
            byte[] r16 = length     // Catch:{ all -> 0x0121 }
            byte r4 = r16[r11]     // Catch:{ all -> 0x0121 }
            short r4 = (short) r4     // Catch:{ all -> 0x0121 }
            java.lang.String r4 = setMin(r15, r9, r4)     // Catch:{ all -> 0x0121 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0121 }
            r14[r7] = r4     // Catch:{ all -> 0x0121 }
            java.lang.reflect.Method r4 = r10.getMethod(r6, r14)     // Catch:{ all -> 0x0121 }
            java.lang.Object r4 = r4.invoke(r12, r13)     // Catch:{ all -> 0x0121 }
            byte[] r6 = length     // Catch:{ all -> 0x0118 }
            byte r6 = r6[r8]     // Catch:{ all -> 0x0118 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x0118 }
            r10 = r6 | 1906(0x772, float:2.671E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0118 }
            byte[] r13 = length     // Catch:{ all -> 0x0118 }
            r14 = 113(0x71, float:1.58E-43)
            byte r13 = r13[r14]     // Catch:{ all -> 0x0118 }
            int r13 = -r13
            short r13 = (short) r13     // Catch:{ all -> 0x0118 }
            java.lang.String r6 = setMin(r6, r10, r13)     // Catch:{ all -> 0x0118 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x0118 }
            byte[] r10 = length     // Catch:{ all -> 0x0118 }
            r13 = 3429(0xd65, float:4.805E-42)
            byte r10 = r10[r13]     // Catch:{ all -> 0x0118 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0118 }
            r13 = 482(0x1e2, float:6.75E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0118 }
            byte[] r14 = length     // Catch:{ all -> 0x0118 }
            r15 = 9
            byte r14 = r14[r15]     // Catch:{ all -> 0x0118 }
            short r14 = (short) r14     // Catch:{ all -> 0x0118 }
            java.lang.String r10 = setMin(r10, r13, r14)     // Catch:{ all -> 0x0118 }
            java.lang.reflect.Method r6 = r6.getMethod(r10, r12)     // Catch:{ all -> 0x0118 }
            java.lang.Object r4 = r6.invoke(r4, r12)     // Catch:{ all -> 0x0118 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0118 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0118 }
            r3[r5] = r4
            int r5 = r5 + 1
            r4 = 1
            r6 = 83
            goto L_0x0081
        L_0x0118:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0120
            throw r1
        L_0x0120:
            throw r0
        L_0x0121:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0129
            throw r1
        L_0x0129:
            throw r0
        L_0x012a:
            r4 = 33
            r0 = 0
        L_0x012d:
            int r14 = r0 + 1
            r15 = 2
            r6 = 40
            r13 = 22
            r10 = 17
            r0 = r3[r0]     // Catch:{ all -> 0x03db }
            int r0 = r1.setMin(r0)     // Catch:{ all -> 0x03db }
            r9 = 19
            r5 = 18
            r7 = 3
            r12 = 21
            switch(r0) {
                case -48: goto L_0x03cc;
                case -47: goto L_0x039a;
                case -46: goto L_0x038f;
                case -45: goto L_0x037a;
                case -44: goto L_0x0375;
                case -43: goto L_0x0370;
                case -42: goto L_0x0369;
                case -41: goto L_0x035c;
                case -40: goto L_0x0356;
                case -39: goto L_0x0350;
                case -38: goto L_0x0341;
                case -37: goto L_0x0339;
                case -36: goto L_0x02c2;
                case -35: goto L_0x02b2;
                case -34: goto L_0x02ac;
                case -33: goto L_0x025a;
                case -32: goto L_0x024a;
                case -31: goto L_0x0246;
                case -30: goto L_0x022f;
                case -29: goto L_0x021f;
                case -28: goto L_0x021c;
                case -27: goto L_0x0217;
                case -26: goto L_0x0201;
                case -25: goto L_0x01fd;
                case -24: goto L_0x01f9;
                case -23: goto L_0x01ee;
                case -22: goto L_0x01ea;
                case -21: goto L_0x01df;
                case -20: goto L_0x01d0;
                case -19: goto L_0x01cb;
                case -18: goto L_0x01c7;
                case -17: goto L_0x01c3;
                case -16: goto L_0x01bf;
                case -15: goto L_0x01bb;
                case -14: goto L_0x01b7;
                case -13: goto L_0x01ac;
                case -12: goto L_0x019c;
                case -11: goto L_0x0198;
                case -10: goto L_0x0194;
                case -9: goto L_0x018c;
                case -8: goto L_0x017c;
                case -7: goto L_0x017b;
                case -6: goto L_0x0177;
                case -5: goto L_0x0173;
                case -4: goto L_0x0165;
                case -3: goto L_0x0157;
                case -2: goto L_0x014f;
                case -1: goto L_0x014b;
                default: goto L_0x0146;
            }
        L_0x0146:
            r4 = 0
        L_0x0147:
            r20 = 0
            goto L_0x03d4
        L_0x014b:
            r0 = 167(0xa7, float:2.34E-43)
            goto L_0x03d0
        L_0x014f:
            int r0 = toIntRange     // Catch:{ all -> 0x02a8 }
            r1.getMax = r0     // Catch:{ all -> 0x02a8 }
        L_0x0153:
            r1.setMin(r7)     // Catch:{ all -> 0x02a8 }
            goto L_0x0146
        L_0x0157:
            r7 = 1
            r1.getMax = r7     // Catch:{ all -> 0x02a8 }
            r1.setMin(r10)     // Catch:{ all -> 0x02a8 }
            r1.setMin(r5)     // Catch:{ all -> 0x02a8 }
            int r0 = r1.setMin     // Catch:{ all -> 0x02a8 }
            equals = r0     // Catch:{ all -> 0x02a8 }
            goto L_0x0146
        L_0x0165:
            r1.setMin(r6)     // Catch:{ all -> 0x02a8 }
            int r0 = r1.setMin     // Catch:{ all -> 0x02a8 }
            if (r0 != 0) goto L_0x0170
            r0 = 21
            goto L_0x03d0
        L_0x0170:
            r0 = r14
            goto L_0x03d0
        L_0x0173:
            r0 = 41
            goto L_0x03d0
        L_0x0177:
            r0 = 33
            goto L_0x03d0
        L_0x017b:
            return
        L_0x017c:
            r5 = 1
            r1.setMin(r5)     // Catch:{ all -> 0x02a8 }
            int r0 = r1.setMin     // Catch:{ all -> 0x02a8 }
            if (r0 == 0) goto L_0x0188
            r0 = 44
            goto L_0x03d0
        L_0x0188:
            r0 = 22
            goto L_0x03d0
        L_0x018c:
            r1.setMin(r15)     // Catch:{ all -> 0x02a8 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x02a8 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x02a8 }
            throw r0     // Catch:{ all -> 0x02a8 }
        L_0x0194:
            r0 = 175(0xaf, float:2.45E-43)
            goto L_0x03d0
        L_0x0198:
            r0 = 83
            goto L_0x03d0
        L_0x019c:
            r5 = 1
            r1.getMax = r5     // Catch:{ all -> 0x02a8 }
            r1.setMin(r10)     // Catch:{ all -> 0x02a8 }
            r1.setMin(r12)     // Catch:{ all -> 0x02a8 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x02a8 }
            boolean r0 = r0 instanceof id.dana.data.base.NetworkException     // Catch:{ all -> 0x02a8 }
            r1.getMax = r0     // Catch:{ all -> 0x02a8 }
            goto L_0x0153
        L_0x01ac:
            r1.setMin(r6)     // Catch:{ all -> 0x02a8 }
            int r0 = r1.setMin     // Catch:{ all -> 0x02a8 }
            if (r0 != 0) goto L_0x0170
            r0 = 37
            goto L_0x03d0
        L_0x01b7:
            r0 = 98
            goto L_0x03d0
        L_0x01bb:
            r0 = 149(0x95, float:2.09E-43)
            goto L_0x03d0
        L_0x01bf:
            r0 = 95
            goto L_0x03d0
        L_0x01c3:
            r0 = 27
            goto L_0x03d0
        L_0x01c7:
            r0 = 94
            goto L_0x03d0
        L_0x01cb:
            int r0 = equals     // Catch:{ all -> 0x02a8 }
            r1.getMax = r0     // Catch:{ all -> 0x02a8 }
            goto L_0x0153
        L_0x01d0:
            r7 = 1
            r1.getMax = r7     // Catch:{ all -> 0x02a8 }
            r1.setMin(r10)     // Catch:{ all -> 0x02a8 }
            r1.setMin(r5)     // Catch:{ all -> 0x02a8 }
            int r0 = r1.setMin     // Catch:{ all -> 0x02a8 }
            toIntRange = r0     // Catch:{ all -> 0x02a8 }
            goto L_0x0146
        L_0x01df:
            r1.setMin(r9)     // Catch:{ all -> 0x02a8 }
            int r0 = r1.setMin     // Catch:{ all -> 0x02a8 }
            if (r0 != 0) goto L_0x0170
            r0 = 61
            goto L_0x03d0
        L_0x01ea:
            r0 = 32
            goto L_0x03d0
        L_0x01ee:
            r1.setMin(r6)     // Catch:{ all -> 0x02a8 }
            int r0 = r1.setMin     // Catch:{ all -> 0x02a8 }
            if (r0 != 0) goto L_0x0170
            r0 = 82
            goto L_0x03d0
        L_0x01f9:
            r0 = 42
            goto L_0x03d0
        L_0x01fd:
            r0 = 116(0x74, float:1.63E-43)
            goto L_0x03d0
        L_0x0201:
            r5 = 1
            r1.getMax = r5     // Catch:{ all -> 0x02a8 }
            r1.setMin(r10)     // Catch:{ all -> 0x02a8 }
            r1.setMin(r12)     // Catch:{ all -> 0x02a8 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x02a8 }
            o.getItemPosition r0 = (o.getItemPosition) r0     // Catch:{ all -> 0x02a8 }
            android.content.Context r0 = r0.getMin     // Catch:{ all -> 0x02a8 }
            r1.equals = r0     // Catch:{ all -> 0x02a8 }
        L_0x0212:
            r1.setMin(r13)     // Catch:{ all -> 0x02a8 }
            goto L_0x0146
        L_0x0217:
            java.lang.String r0 = "alipayplus.mobilewallet.user.login"
            r1.equals = r0     // Catch:{ all -> 0x02a8 }
            goto L_0x0212
        L_0x021c:
            r0 = 1
            goto L_0x03d0
        L_0x021f:
            r5 = 1
            r1.setMin(r5)     // Catch:{ all -> 0x02a8 }
            int r0 = r1.setMin     // Catch:{ all -> 0x02a8 }
            if (r0 == 0) goto L_0x022b
            r0 = 100
            goto L_0x03d0
        L_0x022b:
            r0 = 109(0x6d, float:1.53E-43)
            goto L_0x03d0
        L_0x022f:
            r5 = 1
            r1.setMin(r5)     // Catch:{ all -> 0x02a8 }
            int r0 = r1.setMin     // Catch:{ all -> 0x02a8 }
            r5 = 29
            if (r0 == r5) goto L_0x0242
            r5 = 60
            if (r0 == r5) goto L_0x023e
            goto L_0x0242
        L_0x023e:
            r0 = 29
            goto L_0x03d0
        L_0x0242:
            r0 = 171(0xab, float:2.4E-43)
            goto L_0x03d0
        L_0x0246:
            r0 = 174(0xae, float:2.44E-43)
            goto L_0x03d0
        L_0x024a:
            r5 = 1
            r1.getMax = r5     // Catch:{ all -> 0x02a8 }
            r1.setMin(r10)     // Catch:{ all -> 0x02a8 }
            r1.setMin(r12)     // Catch:{ all -> 0x02a8 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x02a8 }
            id.dana.data.base.NetworkException r0 = (id.dana.data.base.NetworkException) r0     // Catch:{ all -> 0x02a8 }
            r1.equals = r0     // Catch:{ all -> 0x02a8 }
            goto L_0x0212
        L_0x025a:
            r7 = 1
            r1.getMax = r7     // Catch:{ all -> 0x02a8 }
            r1.setMin(r10)     // Catch:{ all -> 0x02a8 }
            r1.setMin(r12)     // Catch:{ all -> 0x02a8 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x02a8 }
            byte[] r7 = length     // Catch:{ all -> 0x029e }
            byte r7 = r7[r8]     // Catch:{ all -> 0x029e }
            byte r7 = (byte) r7     // Catch:{ all -> 0x029e }
            r9 = 3927(0xf57, float:5.503E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x029e }
            byte[] r12 = length     // Catch:{ all -> 0x029e }
            byte r5 = r12[r5]     // Catch:{ all -> 0x029e }
            short r5 = (short) r5     // Catch:{ all -> 0x029e }
            java.lang.String r5 = setMin(r7, r9, r5)     // Catch:{ all -> 0x029e }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x029e }
            byte[] r7 = length     // Catch:{ all -> 0x029e }
            byte r7 = r7[r11]     // Catch:{ all -> 0x029e }
            byte r7 = (byte) r7     // Catch:{ all -> 0x029e }
            int r9 = setMin     // Catch:{ all -> 0x029e }
            r9 = r9 | 321(0x141, float:4.5E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x029e }
            byte[] r12 = length     // Catch:{ all -> 0x029e }
            byte r12 = r12[r4]     // Catch:{ all -> 0x029e }
            short r12 = (short) r12     // Catch:{ all -> 0x029e }
            java.lang.String r7 = setMin(r7, r9, r12)     // Catch:{ all -> 0x029e }
            r9 = 0
            java.lang.reflect.Method r5 = r5.getMethod(r7, r9)     // Catch:{ all -> 0x029c }
            java.lang.Object r0 = r5.invoke(r0, r9)     // Catch:{ all -> 0x029c }
            r1.equals = r0     // Catch:{ all -> 0x02be }
            r1.setMin(r13)     // Catch:{ all -> 0x02be }
            goto L_0x02bb
        L_0x029c:
            r0 = move-exception
            goto L_0x02a0
        L_0x029e:
            r0 = move-exception
            r9 = 0
        L_0x02a0:
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x02be }
            if (r5 == 0) goto L_0x02a7
            throw r5     // Catch:{ all -> 0x02be }
        L_0x02a7:
            throw r0     // Catch:{ all -> 0x02be }
        L_0x02a8:
            r0 = move-exception
            r4 = 0
            goto L_0x03dd
        L_0x02ac:
            r9 = 0
            r0 = 146(0x92, float:2.05E-43)
            r12 = r9
            goto L_0x03d8
        L_0x02b2:
            r9 = 0
            r0 = 2131887132(0x7f12041c, float:1.9408862E38)
            r1.getMax = r0     // Catch:{ all -> 0x02be }
            r1.setMin(r7)     // Catch:{ all -> 0x02be }
        L_0x02bb:
            r4 = r9
            goto L_0x0147
        L_0x02be:
            r0 = move-exception
            r4 = r9
            goto L_0x03dd
        L_0x02c2:
            r9 = 0
            r1.getMax = r15     // Catch:{ all -> 0x0333 }
            r1.setMin(r10)     // Catch:{ all -> 0x0333 }
            r1.setMin(r12)     // Catch:{ all -> 0x0333 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x0333 }
            r1.setMin(r5)     // Catch:{ all -> 0x0333 }
            int r5 = r1.setMin     // Catch:{ all -> 0x0333 }
            r7 = 1
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x0326 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0326 }
            r7 = 0
            r12[r7] = r5     // Catch:{ all -> 0x0326 }
            byte[] r5 = length     // Catch:{ all -> 0x0326 }
            r7 = 687(0x2af, float:9.63E-43)
            byte r5 = r5[r7]     // Catch:{ all -> 0x0326 }
            byte r5 = (byte) r5     // Catch:{ all -> 0x0326 }
            int r7 = setMin     // Catch:{ all -> 0x0326 }
            r7 = r7 | 3076(0xc04, float:4.31E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0326 }
            byte[] r21 = length     // Catch:{ all -> 0x0326 }
            r22 = 2041(0x7f9, float:2.86E-42)
            byte r4 = r21[r22]     // Catch:{ all -> 0x0326 }
            int r4 = -r4
            short r4 = (short) r4     // Catch:{ all -> 0x0326 }
            java.lang.String r4 = setMin(r5, r7, r4)     // Catch:{ all -> 0x0326 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0326 }
            byte[] r5 = length     // Catch:{ all -> 0x0326 }
            byte r5 = r5[r11]     // Catch:{ all -> 0x0326 }
            byte r5 = (byte) r5     // Catch:{ all -> 0x0326 }
            r7 = 406(0x196, float:5.69E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x0326 }
            byte[] r21 = length     // Catch:{ all -> 0x0326 }
            r22 = 37
            byte r6 = r21[r22]     // Catch:{ all -> 0x0326 }
            short r6 = (short) r6     // Catch:{ all -> 0x0326 }
            java.lang.String r5 = setMin(r5, r7, r6)     // Catch:{ all -> 0x0326 }
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ all -> 0x0326 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0326 }
            r20 = 0
            r7[r20] = r6     // Catch:{ all -> 0x0324 }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r7)     // Catch:{ all -> 0x0324 }
            java.lang.Object r0 = r4.invoke(r0, r12)     // Catch:{ all -> 0x0324 }
            r1.equals = r0     // Catch:{ all -> 0x0331 }
            r1.setMin(r13)     // Catch:{ all -> 0x0331 }
            r4 = r9
            goto L_0x03d4
        L_0x0324:
            r0 = move-exception
            goto L_0x0329
        L_0x0326:
            r0 = move-exception
            r20 = 0
        L_0x0329:
            java.lang.Throwable r4 = r0.getCause()     // Catch:{ all -> 0x0331 }
            if (r4 == 0) goto L_0x0330
            throw r4     // Catch:{ all -> 0x0331 }
        L_0x0330:
            throw r0     // Catch:{ all -> 0x0331 }
        L_0x0331:
            r0 = move-exception
            goto L_0x0336
        L_0x0333:
            r0 = move-exception
            r20 = 0
        L_0x0336:
            r4 = r9
            goto L_0x03df
        L_0x0339:
            r9 = 0
            r20 = 0
            r0 = 151(0x97, float:2.12E-43)
            r12 = r9
            goto L_0x03d6
        L_0x0341:
            r4 = 0
            r20 = 0
            r1.setMin(r9)     // Catch:{ all -> 0x03ca }
            int r0 = r1.setMin     // Catch:{ all -> 0x03ca }
            if (r0 != 0) goto L_0x034e
            r0 = 145(0x91, float:2.03E-43)
            goto L_0x036e
        L_0x034e:
            r0 = r14
            goto L_0x036e
        L_0x0350:
            r4 = 0
            r20 = 0
            r0 = 96
            goto L_0x036e
        L_0x0356:
            r4 = 0
            r20 = 0
            r0 = 46
            goto L_0x036e
        L_0x035c:
            r4 = 0
            r20 = 0
            r1.setMin(r9)     // Catch:{ all -> 0x03ca }
            int r0 = r1.setMin     // Catch:{ all -> 0x03ca }
            if (r0 != 0) goto L_0x034e
            r0 = 166(0xa6, float:2.33E-43)
            goto L_0x036e
        L_0x0369:
            r4 = 0
            r20 = 0
            r0 = 38
        L_0x036e:
            r12 = r4
            goto L_0x03d6
        L_0x0370:
            r20 = 0
            r0 = 92
            goto L_0x03d0
        L_0x0375:
            r20 = 0
            r0 = 49
            goto L_0x03d0
        L_0x037a:
            r4 = 0
            r5 = 1
            r20 = 0
            r1.setMin(r5)     // Catch:{ all -> 0x03ca }
            int r0 = r1.setMin     // Catch:{ all -> 0x03ca }
            r5 = 26
            if (r0 == r5) goto L_0x038c
            r5 = 34
            r0 = 118(0x76, float:1.65E-43)
            goto L_0x036e
        L_0x038c:
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x036e
        L_0x038f:
            r4 = 0
            r20 = 0
            java.lang.String r0 = "Hold login"
            r1.equals = r0     // Catch:{ all -> 0x03ca }
            r1.setMin(r13)     // Catch:{ all -> 0x03ca }
            goto L_0x03d4
        L_0x039a:
            r4 = 0
            r20 = 0
            r0 = 5
            r1.getMax = r0     // Catch:{ all -> 0x03ca }
            r1.setMin(r10)     // Catch:{ all -> 0x03ca }
            r1.setMin(r12)     // Catch:{ all -> 0x03ca }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x03ca }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x03ca }
            r1.setMin(r12)     // Catch:{ all -> 0x03ca }
            java.lang.Object r5 = r1.isInside     // Catch:{ all -> 0x03ca }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x03ca }
            r1.setMin(r12)     // Catch:{ all -> 0x03ca }
            java.lang.Object r6 = r1.isInside     // Catch:{ all -> 0x03ca }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x03ca }
            r1.setMin(r12)     // Catch:{ all -> 0x03ca }
            java.lang.Object r7 = r1.isInside     // Catch:{ all -> 0x03ca }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x03ca }
            r1.setMin(r12)     // Catch:{ all -> 0x03ca }
            java.lang.Object r9 = r1.isInside     // Catch:{ all -> 0x03ca }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x03ca }
            o.BlurProcess.getMin(r0, r5, r6, r7, r9)     // Catch:{ all -> 0x03ca }
            goto L_0x03d4
        L_0x03ca:
            r0 = move-exception
            goto L_0x03df
        L_0x03cc:
            r20 = 0
            r0 = 62
        L_0x03d0:
            r7 = 0
            r12 = 0
            goto L_0x012d
        L_0x03d4:
            r12 = r4
            r0 = r14
        L_0x03d6:
            r4 = 33
        L_0x03d8:
            r7 = 0
            goto L_0x012d
        L_0x03db:
            r0 = move-exception
            r4 = r12
        L_0x03dd:
            r20 = 0
        L_0x03df:
            byte[] r5 = length
            byte r5 = r5[r8]
            byte r5 = (byte) r5
            r6 = r5 | 514(0x202, float:7.2E-43)
            short r6 = (short) r6
            int r7 = setMin
            int r7 = r7 >>> r15
            short r7 = (short) r7
            java.lang.String r5 = setMin(r5, r6, r7)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            r6 = 48
            if (r5 == 0) goto L_0x040e
            r5 = 1
            if (r14 < r5) goto L_0x040f
            if (r14 > r13) goto L_0x040f
            r4 = 92
            r6 = 116(0x74, float:1.63E-43)
            r7 = 27
            r9 = 49
            r10 = 62
        L_0x040a:
            r23 = 40
            goto L_0x0595
        L_0x040e:
            r5 = 1
        L_0x040f:
            byte[] r7 = length
            byte r7 = r7[r8]
            byte r7 = (byte) r7
            r9 = r7 | 514(0x202, float:7.2E-43)
            short r9 = (short) r9
            int r12 = setMin
            int r12 = r12 >>> r15
            short r12 = (short) r12
            java.lang.String r7 = setMin(r7, r9, r12)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x043b
            if (r14 < r10) goto L_0x043b
            if (r14 > r13) goto L_0x043b
            r4 = 92
            r6 = 116(0x74, float:1.63E-43)
            r7 = 27
            r9 = 49
        L_0x0435:
            r10 = 62
        L_0x0437:
            r23 = 48
            goto L_0x0595
        L_0x043b:
            r7 = 23
            if (r14 < r7) goto L_0x0451
            r7 = 27
            if (r14 > r7) goto L_0x0453
            r6 = 104(0x68, float:1.46E-43)
            r4 = 92
            r6 = 116(0x74, float:1.63E-43)
            r9 = 49
            r10 = 62
            r23 = 104(0x68, float:1.46E-43)
            goto L_0x0595
        L_0x0451:
            r7 = 27
        L_0x0453:
            byte[] r9 = length
            byte r9 = r9[r8]
            byte r9 = (byte) r9
            r10 = r9 | 514(0x202, float:7.2E-43)
            short r10 = (short) r10
            int r12 = setMin
            int r12 = r12 >>> r15
            short r12 = (short) r12
            java.lang.String r9 = setMin(r9, r10, r12)
            java.lang.Class r9 = java.lang.Class.forName(r9)
            boolean r9 = r9.isInstance(r0)
            if (r9 == 0) goto L_0x047a
            r9 = 49
            if (r14 < r9) goto L_0x047c
            r10 = 50
            if (r14 > r10) goto L_0x047c
            r4 = 92
            r6 = 116(0x74, float:1.63E-43)
            goto L_0x0435
        L_0x047a:
            r9 = 49
        L_0x047c:
            byte[] r10 = length
            byte r12 = r10[r8]
            byte r12 = (byte) r12
            r13 = r12 | 386(0x182, float:5.41E-43)
            short r13 = (short) r13
            r19 = 654(0x28e, float:9.16E-43)
            byte r10 = r10[r19]
            short r10 = (short) r10
            java.lang.String r10 = setMin(r12, r13, r10)
            java.lang.Class r10 = java.lang.Class.forName(r10)
            boolean r10 = r10.isInstance(r0)
            if (r10 == 0) goto L_0x04a4
            r10 = 62
            if (r14 < r10) goto L_0x04a6
            r12 = 83
            if (r14 > r12) goto L_0x04a6
            r4 = 92
        L_0x04a1:
            r6 = 116(0x74, float:1.63E-43)
            goto L_0x0437
        L_0x04a4:
            r10 = 62
        L_0x04a6:
            byte[] r12 = length
            byte r13 = r12[r8]
            byte r13 = (byte) r13
            r4 = r13 | 3282(0xcd2, float:4.599E-42)
            short r4 = (short) r4
            r18 = 3917(0xf4d, float:5.489E-42)
            byte r12 = r12[r18]
            short r12 = (short) r12
            java.lang.String r4 = setMin(r13, r4, r12)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x04cf
            r4 = 78
            if (r14 < r4) goto L_0x04cf
            r4 = 83
            if (r14 > r4) goto L_0x04d1
            r4 = 92
        L_0x04cb:
            r6 = 116(0x74, float:1.63E-43)
            goto L_0x040a
        L_0x04cf:
            r4 = 83
        L_0x04d1:
            byte[] r12 = length
            byte r13 = r12[r8]
            byte r13 = (byte) r13
            r4 = r13 | 386(0x182, float:5.41E-43)
            short r4 = (short) r4
            r18 = 654(0x28e, float:9.16E-43)
            byte r12 = r12[r18]
            short r12 = (short) r12
            java.lang.String r4 = setMin(r13, r4, r12)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x04f5
            r4 = 84
            if (r14 < r4) goto L_0x04f5
            r4 = 92
            if (r14 > r4) goto L_0x04f5
        L_0x04f4:
            goto L_0x04cb
        L_0x04f5:
            byte[] r4 = length
            byte r12 = r4[r8]
            byte r12 = (byte) r12
            r13 = r12 | 1890(0x762, float:2.648E-42)
            short r13 = (short) r13
            r18 = 655(0x28f, float:9.18E-43)
            byte r4 = r4[r18]
            int r4 = -r4
            short r4 = (short) r4
            java.lang.String r4 = setMin(r12, r13, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x051a
            r4 = 85
            if (r14 < r4) goto L_0x051a
            r4 = 92
            if (r14 > r4) goto L_0x051a
        L_0x0519:
            goto L_0x04a1
        L_0x051a:
            byte[] r4 = length
            byte r12 = r4[r8]
            byte r12 = (byte) r12
            r13 = r12 | 3282(0xcd2, float:4.599E-42)
            short r13 = (short) r13
            r18 = 3917(0xf4d, float:5.489E-42)
            byte r4 = r4[r18]
            short r4 = (short) r4
            java.lang.String r4 = setMin(r12, r13, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x053e
            r4 = 88
            if (r14 < r4) goto L_0x053e
            r4 = 92
            if (r14 > r4) goto L_0x0540
            goto L_0x04f4
        L_0x053e:
            r4 = 92
        L_0x0540:
            byte[] r12 = length
            byte r12 = r12[r8]
            byte r12 = (byte) r12
            r13 = r12 | 514(0x202, float:7.2E-43)
            short r13 = (short) r13
            int r17 = setMin
            int r15 = r17 >>> 2
            short r15 = (short) r15
            java.lang.String r12 = setMin(r12, r13, r15)
            java.lang.Class r12 = java.lang.Class.forName(r12)
            boolean r12 = r12.isInstance(r0)
            if (r12 == 0) goto L_0x0564
            r12 = 101(0x65, float:1.42E-43)
            if (r14 < r12) goto L_0x0564
            r12 = 102(0x66, float:1.43E-43)
            if (r14 > r12) goto L_0x0564
            goto L_0x04f4
        L_0x0564:
            byte[] r12 = length
            byte r13 = r12[r8]
            byte r13 = (byte) r13
            r15 = r13 | 1890(0x762, float:2.648E-42)
            short r15 = (short) r15
            r17 = 655(0x28f, float:9.18E-43)
            byte r12 = r12[r17]
            int r12 = -r12
            short r12 = (short) r12
            java.lang.String r12 = setMin(r13, r15, r12)
            java.lang.Class r12 = java.lang.Class.forName(r12)
            boolean r12 = r12.isInstance(r0)
            if (r12 == 0) goto L_0x0589
            r12 = 102(0x66, float:1.43E-43)
            if (r14 < r12) goto L_0x0589
            r12 = 104(0x68, float:1.46E-43)
            if (r14 > r12) goto L_0x0589
            goto L_0x0519
        L_0x0589:
            r6 = 112(0x70, float:1.57E-43)
            if (r14 < r6) goto L_0x05a2
            r6 = 116(0x74, float:1.63E-43)
            if (r14 > r6) goto L_0x05a2
            r12 = 28
            r23 = 28
        L_0x0595:
            r1.equals = r0
            r0 = 47
            r1.setMin(r0)
            r0 = r23
            r4 = 33
            goto L_0x03d0
        L_0x05a2:
            throw r0
        L_0x05a3:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x05ab
            throw r1
        L_0x05ab:
            goto L_0x05ad
        L_0x05ac:
            throw r0
        L_0x05ad:
            goto L_0x05ac
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getItemPosition.length(java.lang.String, java.lang.Throwable):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void length(o.getItemPosition r18, id.dana.domain.model.rpc.response.LoginResponse r19) {
        /*
            o.getTabIndicatorColor r1 = new o.getTabIndicatorColor
            r0 = r18
            r2 = r19
            r1.<init>(r0, r2)
            r0 = 73
            byte r0 = (byte) r0
            r2 = 2326(0x916, float:3.26E-42)
            short r2 = (short) r2
            r3 = 252(0xfc, float:3.53E-43)
            short r3 = (short) r3
            java.lang.String r0 = setMin(r0, r2, r3)
            r2 = 74
            byte r3 = (byte) r2
            r4 = 398(0x18e, float:5.58E-43)
            short r4 = (short) r4
            byte[] r5 = length
            r6 = 83
            byte r5 = r5[r6]
            short r5 = (short) r5
            java.lang.String r3 = setMin(r3, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x02bf }
            r7 = 0
            r5[r7] = r3     // Catch:{ all -> 0x02bf }
            byte[] r3 = length     // Catch:{ all -> 0x02bf }
            r8 = 3446(0xd76, float:4.829E-42)
            byte r3 = r3[r8]     // Catch:{ all -> 0x02bf }
            byte r3 = (byte) r3     // Catch:{ all -> 0x02bf }
            r9 = 1332(0x534, float:1.867E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x02bf }
            byte[] r10 = length     // Catch:{ all -> 0x02bf }
            r11 = 689(0x2b1, float:9.65E-43)
            byte r10 = r10[r11]     // Catch:{ all -> 0x02bf }
            short r10 = (short) r10     // Catch:{ all -> 0x02bf }
            java.lang.String r3 = setMin(r3, r9, r10)     // Catch:{ all -> 0x02bf }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x02bf }
            byte[] r10 = length     // Catch:{ all -> 0x02bf }
            r12 = 11
            byte r10 = r10[r12]     // Catch:{ all -> 0x02bf }
            byte r10 = (byte) r10     // Catch:{ all -> 0x02bf }
            r12 = 1537(0x601, float:2.154E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x02bf }
            byte[] r13 = length     // Catch:{ all -> 0x02bf }
            r14 = 86
            byte r13 = r13[r14]     // Catch:{ all -> 0x02bf }
            short r13 = (short) r13     // Catch:{ all -> 0x02bf }
            java.lang.String r10 = setMin(r10, r12, r13)     // Catch:{ all -> 0x02bf }
            java.lang.Class[] r12 = new java.lang.Class[r4]     // Catch:{ all -> 0x02bf }
            byte[] r13 = length     // Catch:{ all -> 0x02bf }
            byte r13 = r13[r8]     // Catch:{ all -> 0x02bf }
            byte r13 = (byte) r13     // Catch:{ all -> 0x02bf }
            byte[] r14 = length     // Catch:{ all -> 0x02bf }
            byte r14 = r14[r11]     // Catch:{ all -> 0x02bf }
            short r14 = (short) r14     // Catch:{ all -> 0x02bf }
            java.lang.String r13 = setMin(r13, r9, r14)     // Catch:{ all -> 0x02bf }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x02bf }
            r12[r7] = r13     // Catch:{ all -> 0x02bf }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r12)     // Catch:{ all -> 0x02bf }
            java.lang.Object r0 = r3.invoke(r0, r5)     // Catch:{ all -> 0x02bf }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x02bf }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r5 = 0
        L_0x007f:
            int r10 = r0.length
            if (r5 >= r10) goto L_0x0127
            r10 = r0[r5]
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ all -> 0x011e }
            r12[r7] = r10     // Catch:{ all -> 0x011e }
            byte[] r10 = length     // Catch:{ all -> 0x011e }
            byte r10 = r10[r8]     // Catch:{ all -> 0x011e }
            byte r10 = (byte) r10     // Catch:{ all -> 0x011e }
            r13 = r10 | 1906(0x772, float:2.671E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x011e }
            byte[] r14 = length     // Catch:{ all -> 0x011e }
            r15 = 113(0x71, float:1.58E-43)
            byte r14 = r14[r15]     // Catch:{ all -> 0x011e }
            int r14 = -r14
            short r14 = (short) r14     // Catch:{ all -> 0x011e }
            java.lang.String r10 = setMin(r10, r13, r14)     // Catch:{ all -> 0x011e }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x011e }
            byte[] r13 = length     // Catch:{ all -> 0x011e }
            byte r13 = r13[r6]     // Catch:{ all -> 0x011e }
            byte r13 = (byte) r13     // Catch:{ all -> 0x011e }
            r14 = r13 | 488(0x1e8, float:6.84E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x011e }
            byte[] r16 = length     // Catch:{ all -> 0x011e }
            r17 = 30
            byte r6 = r16[r17]     // Catch:{ all -> 0x011e }
            short r6 = (short) r6     // Catch:{ all -> 0x011e }
            java.lang.String r6 = setMin(r13, r14, r6)     // Catch:{ all -> 0x011e }
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch:{ all -> 0x011e }
            byte[] r14 = length     // Catch:{ all -> 0x011e }
            byte r14 = r14[r8]     // Catch:{ all -> 0x011e }
            byte r14 = (byte) r14     // Catch:{ all -> 0x011e }
            byte[] r16 = length     // Catch:{ all -> 0x011e }
            byte r2 = r16[r11]     // Catch:{ all -> 0x011e }
            short r2 = (short) r2     // Catch:{ all -> 0x011e }
            java.lang.String r2 = setMin(r14, r9, r2)     // Catch:{ all -> 0x011e }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x011e }
            r13[r7] = r2     // Catch:{ all -> 0x011e }
            java.lang.reflect.Method r2 = r10.getMethod(r6, r13)     // Catch:{ all -> 0x011e }
            r6 = 0
            java.lang.Object r2 = r2.invoke(r6, r12)     // Catch:{ all -> 0x011e }
            byte[] r10 = length     // Catch:{ all -> 0x0115 }
            byte r10 = r10[r8]     // Catch:{ all -> 0x0115 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0115 }
            r12 = r10 | 1906(0x772, float:2.671E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0115 }
            byte[] r13 = length     // Catch:{ all -> 0x0115 }
            byte r13 = r13[r15]     // Catch:{ all -> 0x0115 }
            int r13 = -r13
            short r13 = (short) r13     // Catch:{ all -> 0x0115 }
            java.lang.String r10 = setMin(r10, r12, r13)     // Catch:{ all -> 0x0115 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0115 }
            byte[] r12 = length     // Catch:{ all -> 0x0115 }
            r13 = 3429(0xd65, float:4.805E-42)
            byte r12 = r12[r13]     // Catch:{ all -> 0x0115 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0115 }
            r13 = 482(0x1e2, float:6.75E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0115 }
            byte[] r14 = length     // Catch:{ all -> 0x0115 }
            r15 = 9
            byte r14 = r14[r15]     // Catch:{ all -> 0x0115 }
            short r14 = (short) r14     // Catch:{ all -> 0x0115 }
            java.lang.String r12 = setMin(r12, r13, r14)     // Catch:{ all -> 0x0115 }
            java.lang.reflect.Method r10 = r10.getMethod(r12, r6)     // Catch:{ all -> 0x0115 }
            java.lang.Object r2 = r10.invoke(r2, r6)     // Catch:{ all -> 0x0115 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0115 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0115 }
            r3[r5] = r2
            int r5 = r5 + 1
            r2 = 74
            r6 = 83
            goto L_0x007f
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
            r5 = 39
            r6 = 55
            r9 = 37
            r10 = 14
        L_0x012f:
            int r11 = r7 + 1
            r12 = 40
            r13 = 18
            r14 = 3
            r0 = r3[r7]     // Catch:{ all -> 0x0208 }
            int r0 = r1.setMin(r0)     // Catch:{ all -> 0x0208 }
            r7 = 2
            r15 = 21
            r2 = 17
            switch(r0) {
                case -21: goto L_0x01f3;
                case -20: goto L_0x01dd;
                case -19: goto L_0x01dc;
                case -18: goto L_0x01c5;
                case -17: goto L_0x01c1;
                case -16: goto L_0x01be;
                case -15: goto L_0x01b1;
                case -14: goto L_0x01a4;
                case -13: goto L_0x019f;
                case -12: goto L_0x019c;
                case -11: goto L_0x0199;
                case -10: goto L_0x0196;
                case -9: goto L_0x0188;
                case -8: goto L_0x017a;
                case -7: goto L_0x0171;
                case -6: goto L_0x016e;
                case -5: goto L_0x0156;
                case -4: goto L_0x0153;
                case -3: goto L_0x014b;
                case -2: goto L_0x0148;
                case -1: goto L_0x0146;
                default: goto L_0x0144;
            }     // Catch:{ all -> 0x0208 }
        L_0x0144:
            goto L_0x0205
        L_0x0146:
            r7 = 4
            goto L_0x012f
        L_0x0148:
            r7 = 63
            goto L_0x012f
        L_0x014b:
            r1.setMin(r7)     // Catch:{ all -> 0x0208 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x0208 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0208 }
            throw r0     // Catch:{ all -> 0x0208 }
        L_0x0153:
            r7 = 14
            goto L_0x012f
        L_0x0156:
            r1.getMax = r7     // Catch:{ all -> 0x0208 }
            r1.setMin(r2)     // Catch:{ all -> 0x0208 }
            r1.setMin(r15)     // Catch:{ all -> 0x0208 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x0208 }
            o.getItemPosition r0 = (o.getItemPosition) r0     // Catch:{ all -> 0x0208 }
            r1.setMin(r15)     // Catch:{ all -> 0x0208 }
            java.lang.Object r2 = r1.isInside     // Catch:{ all -> 0x0208 }
            id.dana.domain.model.rpc.response.LoginResponse r2 = (id.dana.domain.model.rpc.response.LoginResponse) r2     // Catch:{ all -> 0x0208 }
            r0.setMax((id.dana.domain.model.rpc.response.LoginResponse) r2)     // Catch:{ all -> 0x0208 }
            goto L_0x0205
        L_0x016e:
            r7 = 39
            goto L_0x012f
        L_0x0171:
            int r0 = equals     // Catch:{ all -> 0x0208 }
            r1.getMax = r0     // Catch:{ all -> 0x0208 }
        L_0x0175:
            r1.setMin(r14)     // Catch:{ all -> 0x0208 }
            goto L_0x0205
        L_0x017a:
            r1.getMax = r4     // Catch:{ all -> 0x0208 }
            r1.setMin(r2)     // Catch:{ all -> 0x0208 }
            r1.setMin(r13)     // Catch:{ all -> 0x0208 }
            int r0 = r1.setMin     // Catch:{ all -> 0x0208 }
            toIntRange = r0     // Catch:{ all -> 0x0208 }
            goto L_0x0205
        L_0x0188:
            r0 = 19
            r1.setMin(r0)     // Catch:{ all -> 0x0208 }
            int r0 = r1.setMin     // Catch:{ all -> 0x0208 }
            if (r0 != 0) goto L_0x0205
            r0 = 36
            r7 = 36
            goto L_0x012f
        L_0x0196:
            r7 = 55
            goto L_0x012f
        L_0x0199:
            r7 = 37
            goto L_0x012f
        L_0x019c:
            r7 = 66
            goto L_0x012f
        L_0x019f:
            int r0 = toIntRange     // Catch:{ all -> 0x0208 }
            r1.getMax = r0     // Catch:{ all -> 0x0208 }
            goto L_0x0175
        L_0x01a4:
            r1.getMax = r4     // Catch:{ all -> 0x0208 }
            r1.setMin(r2)     // Catch:{ all -> 0x0208 }
            r1.setMin(r13)     // Catch:{ all -> 0x0208 }
            int r0 = r1.setMin     // Catch:{ all -> 0x0208 }
            equals = r0     // Catch:{ all -> 0x0208 }
            goto L_0x0205
        L_0x01b1:
            r1.setMin(r12)     // Catch:{ all -> 0x0208 }
            int r0 = r1.setMin     // Catch:{ all -> 0x0208 }
            if (r0 != 0) goto L_0x0205
            r0 = 54
            r7 = 54
            goto L_0x012f
        L_0x01be:
            r7 = 1
            goto L_0x012f
        L_0x01c1:
            r7 = 67
            goto L_0x012f
        L_0x01c5:
            r1.setMin(r4)     // Catch:{ all -> 0x0208 }
            int r0 = r1.setMin     // Catch:{ all -> 0x0208 }
            r2 = 44
            r7 = 64
            if (r0 == r2) goto L_0x012f
            r2 = 88
            if (r0 == r2) goto L_0x01d6
            goto L_0x012f
        L_0x01d6:
            r0 = 69
            r7 = 69
            goto L_0x012f
        L_0x01dc:
            return
        L_0x01dd:
            r1.setMin(r4)     // Catch:{ all -> 0x0208 }
            int r0 = r1.setMin     // Catch:{ all -> 0x0208 }
            r2 = 57
            if (r0 == 0) goto L_0x01ef
            if (r0 == r4) goto L_0x01e9
            goto L_0x01ef
        L_0x01e9:
            r0 = 10
            r7 = 10
            goto L_0x012f
        L_0x01ef:
            r7 = 57
            goto L_0x012f
        L_0x01f3:
            r1.getMax = r4     // Catch:{ all -> 0x0208 }
            r1.setMin(r2)     // Catch:{ all -> 0x0208 }
            r1.setMin(r15)     // Catch:{ all -> 0x0208 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x0208 }
            int r0 = super.hashCode()     // Catch:{ all -> 0x0208 }
            r1.getMax = r0     // Catch:{ all -> 0x0208 }
            goto L_0x0175
        L_0x0205:
            r7 = r11
            goto L_0x012f
        L_0x0208:
            r0 = move-exception
            byte[] r2 = length
            byte r7 = r2[r8]
            byte r7 = (byte) r7
            r15 = r7 | 353(0x161, float:4.95E-43)
            short r15 = (short) r15
            byte r2 = r2[r13]
            short r2 = (short) r2
            java.lang.String r2 = setMin(r7, r15, r2)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x022e
            if (r11 < r10) goto L_0x022e
            if (r11 > r9) goto L_0x022e
        L_0x0226:
            r2 = 63
            r7 = 74
            r14 = 74
            goto L_0x02b4
        L_0x022e:
            byte[] r2 = length
            byte r7 = r2[r8]
            byte r7 = (byte) r7
            r13 = r7 | 3282(0xcd2, float:4.599E-42)
            short r13 = (short) r13
            r15 = 3917(0xf4d, float:5.489E-42)
            byte r2 = r2[r15]
            short r2 = (short) r2
            java.lang.String r2 = setMin(r7, r13, r2)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x0252
            r2 = 32
            if (r11 < r2) goto L_0x0252
            r2 = 33
            if (r11 > r2) goto L_0x0252
            goto L_0x0226
        L_0x0252:
            byte[] r2 = length
            byte r7 = r2[r8]
            byte r7 = (byte) r7
            r13 = 692(0x2b4, float:9.7E-43)
            byte r2 = r2[r13]
            short r2 = (short) r2
            short r13 = (short) r2
            java.lang.String r2 = setMin(r7, r2, r13)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x0278
            if (r11 < r5) goto L_0x0278
            if (r11 > r12) goto L_0x0278
            r2 = 9
            r2 = 63
            r7 = 74
            r14 = 9
            goto L_0x02b4
        L_0x0278:
            byte[] r2 = length
            byte r7 = r2[r8]
            byte r7 = (byte) r7
            r12 = r7 | 3248(0xcb0, float:4.551E-42)
            short r12 = (short) r12
            r13 = 3527(0xdc7, float:4.942E-42)
            byte r2 = r2[r13]
            int r2 = r2 + r4
            short r2 = (short) r2
            java.lang.String r2 = setMin(r7, r12, r2)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            boolean r2 = r2.isInstance(r0)
            if (r2 == 0) goto L_0x029b
            r2 = 49
            if (r11 < r2) goto L_0x029b
            if (r11 > r6) goto L_0x029b
            goto L_0x0226
        L_0x029b:
            r2 = 59
            if (r11 < r2) goto L_0x02aa
            r2 = 63
            if (r11 > r2) goto L_0x02ac
            r7 = 13
            r7 = 74
            r14 = 13
            goto L_0x02b4
        L_0x02aa:
            r2 = 63
        L_0x02ac:
            r7 = 70
            if (r11 < r7) goto L_0x02be
            r7 = 74
            if (r11 > r7) goto L_0x02be
        L_0x02b4:
            r1.equals = r0
            r0 = 47
            r1.setMin(r0)
            r7 = r14
            goto L_0x012f
        L_0x02be:
            throw r0
        L_0x02bf:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02c7
            throw r1
        L_0x02c7:
            goto L_0x02c9
        L_0x02c8:
            throw r0
        L_0x02c9:
            goto L_0x02c8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getItemPosition.length(o.getItemPosition, id.dana.domain.model.rpc.response.LoginResponse):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ o.registerDataSetObserver.getMin setMax(o.getItemPosition r18) {
        /*
            o.getTabIndicatorColor r1 = new o.getTabIndicatorColor
            r0 = r18
            r1.<init>(r0)
            r0 = 73
            byte r0 = (byte) r0
            r2 = 2074(0x81a, float:2.906E-42)
            short r2 = (short) r2
            int r3 = setMin
            r4 = 2
            int r3 = r3 + r4
            short r3 = (short) r3
            java.lang.String r0 = setMin(r0, r2, r3)
            r2 = 74
            byte r2 = (byte) r2
            r3 = 398(0x18e, float:5.58E-43)
            short r3 = (short) r3
            byte[] r5 = length
            r6 = 83
            byte r5 = r5[r6]
            short r5 = (short) r5
            java.lang.String r2 = setMin(r2, r3, r5)
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x0240 }
            r7 = 0
            r5[r7] = r2     // Catch:{ all -> 0x0240 }
            byte[] r2 = length     // Catch:{ all -> 0x0240 }
            r8 = 3446(0xd76, float:4.829E-42)
            byte r2 = r2[r8]     // Catch:{ all -> 0x0240 }
            byte r2 = (byte) r2     // Catch:{ all -> 0x0240 }
            r9 = 1332(0x534, float:1.867E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0240 }
            byte[] r10 = length     // Catch:{ all -> 0x0240 }
            r11 = 689(0x2b1, float:9.65E-43)
            byte r10 = r10[r11]     // Catch:{ all -> 0x0240 }
            short r10 = (short) r10     // Catch:{ all -> 0x0240 }
            java.lang.String r2 = setMin(r2, r9, r10)     // Catch:{ all -> 0x0240 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0240 }
            byte[] r10 = length     // Catch:{ all -> 0x0240 }
            r12 = 11
            byte r10 = r10[r12]     // Catch:{ all -> 0x0240 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0240 }
            r12 = 1537(0x601, float:2.154E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0240 }
            byte[] r13 = length     // Catch:{ all -> 0x0240 }
            r14 = 86
            byte r13 = r13[r14]     // Catch:{ all -> 0x0240 }
            short r13 = (short) r13     // Catch:{ all -> 0x0240 }
            java.lang.String r10 = setMin(r10, r12, r13)     // Catch:{ all -> 0x0240 }
            java.lang.Class[] r12 = new java.lang.Class[r3]     // Catch:{ all -> 0x0240 }
            byte[] r13 = length     // Catch:{ all -> 0x0240 }
            byte r13 = r13[r8]     // Catch:{ all -> 0x0240 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0240 }
            byte[] r14 = length     // Catch:{ all -> 0x0240 }
            byte r14 = r14[r11]     // Catch:{ all -> 0x0240 }
            short r14 = (short) r14     // Catch:{ all -> 0x0240 }
            java.lang.String r13 = setMin(r13, r9, r14)     // Catch:{ all -> 0x0240 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0240 }
            r12[r7] = r13     // Catch:{ all -> 0x0240 }
            java.lang.reflect.Method r2 = r2.getMethod(r10, r12)     // Catch:{ all -> 0x0240 }
            java.lang.Object r0 = r2.invoke(r0, r5)     // Catch:{ all -> 0x0240 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0240 }
            int r2 = r0.length
            int[] r2 = new int[r2]
            r5 = 0
        L_0x007f:
            int r10 = r0.length
            r12 = 30
            if (r5 >= r10) goto L_0x0125
            r10 = r0[r5]
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x011c }
            r13[r7] = r10     // Catch:{ all -> 0x011c }
            byte[] r10 = length     // Catch:{ all -> 0x011c }
            byte r10 = r10[r8]     // Catch:{ all -> 0x011c }
            byte r10 = (byte) r10     // Catch:{ all -> 0x011c }
            r14 = r10 | 1906(0x772, float:2.671E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x011c }
            byte[] r15 = length     // Catch:{ all -> 0x011c }
            r16 = 113(0x71, float:1.58E-43)
            byte r15 = r15[r16]     // Catch:{ all -> 0x011c }
            int r15 = -r15
            short r15 = (short) r15     // Catch:{ all -> 0x011c }
            java.lang.String r10 = setMin(r10, r14, r15)     // Catch:{ all -> 0x011c }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x011c }
            byte[] r14 = length     // Catch:{ all -> 0x011c }
            byte r14 = r14[r6]     // Catch:{ all -> 0x011c }
            byte r14 = (byte) r14     // Catch:{ all -> 0x011c }
            r15 = r14 | 488(0x1e8, float:6.84E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x011c }
            byte[] r17 = length     // Catch:{ all -> 0x011c }
            byte r12 = r17[r12]     // Catch:{ all -> 0x011c }
            short r12 = (short) r12     // Catch:{ all -> 0x011c }
            java.lang.String r12 = setMin(r14, r15, r12)     // Catch:{ all -> 0x011c }
            java.lang.Class[] r14 = new java.lang.Class[r3]     // Catch:{ all -> 0x011c }
            byte[] r15 = length     // Catch:{ all -> 0x011c }
            byte r15 = r15[r8]     // Catch:{ all -> 0x011c }
            byte r15 = (byte) r15     // Catch:{ all -> 0x011c }
            byte[] r17 = length     // Catch:{ all -> 0x011c }
            byte r6 = r17[r11]     // Catch:{ all -> 0x011c }
            short r6 = (short) r6     // Catch:{ all -> 0x011c }
            java.lang.String r6 = setMin(r15, r9, r6)     // Catch:{ all -> 0x011c }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x011c }
            r14[r7] = r6     // Catch:{ all -> 0x011c }
            java.lang.reflect.Method r6 = r10.getMethod(r12, r14)     // Catch:{ all -> 0x011c }
            r10 = 0
            java.lang.Object r6 = r6.invoke(r10, r13)     // Catch:{ all -> 0x011c }
            byte[] r12 = length     // Catch:{ all -> 0x0113 }
            byte r12 = r12[r8]     // Catch:{ all -> 0x0113 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0113 }
            r13 = r12 | 1906(0x772, float:2.671E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0113 }
            byte[] r14 = length     // Catch:{ all -> 0x0113 }
            byte r14 = r14[r16]     // Catch:{ all -> 0x0113 }
            int r14 = -r14
            short r14 = (short) r14     // Catch:{ all -> 0x0113 }
            java.lang.String r12 = setMin(r12, r13, r14)     // Catch:{ all -> 0x0113 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0113 }
            byte[] r13 = length     // Catch:{ all -> 0x0113 }
            r14 = 3429(0xd65, float:4.805E-42)
            byte r13 = r13[r14]     // Catch:{ all -> 0x0113 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0113 }
            r14 = 482(0x1e2, float:6.75E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0113 }
            byte[] r15 = length     // Catch:{ all -> 0x0113 }
            r16 = 9
            byte r15 = r15[r16]     // Catch:{ all -> 0x0113 }
            short r15 = (short) r15     // Catch:{ all -> 0x0113 }
            java.lang.String r13 = setMin(r13, r14, r15)     // Catch:{ all -> 0x0113 }
            java.lang.reflect.Method r12 = r12.getMethod(r13, r10)     // Catch:{ all -> 0x0113 }
            java.lang.Object r6 = r12.invoke(r6, r10)     // Catch:{ all -> 0x0113 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0113 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0113 }
            r2[r5] = r6
            int r5 = r5 + 1
            r6 = 83
            goto L_0x007f
        L_0x0113:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011b
            throw r1
        L_0x011b:
            throw r0
        L_0x011c:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0124
            throw r1
        L_0x0124:
            throw r0
        L_0x0125:
            r5 = 35
        L_0x0127:
            int r6 = r7 + 1
            r9 = 22
            r10 = 21
            r11 = 18
            r0 = r2[r7]     // Catch:{ all -> 0x01a4 }
            int r0 = r1.setMin(r0)     // Catch:{ all -> 0x01a4 }
            r7 = 17
            r13 = 40
            switch(r0) {
                case -13: goto L_0x0195;
                case -12: goto L_0x018d;
                case -11: goto L_0x018b;
                case -10: goto L_0x0188;
                case -9: goto L_0x0174;
                case -8: goto L_0x0171;
                case -7: goto L_0x0169;
                case -6: goto L_0x0166;
                case -5: goto L_0x0163;
                case -4: goto L_0x0157;
                case -3: goto L_0x014a;
                case -2: goto L_0x0141;
                case -1: goto L_0x013e;
                default: goto L_0x013c;
            }     // Catch:{ all -> 0x01a4 }
        L_0x013c:
            goto L_0x01a2
        L_0x013e:
            r7 = 35
            goto L_0x0127
        L_0x0141:
            int r0 = toIntRange     // Catch:{ all -> 0x01a4 }
            r1.getMax = r0     // Catch:{ all -> 0x01a4 }
            r0 = 3
            r1.setMin(r0)     // Catch:{ all -> 0x01a4 }
            goto L_0x01a2
        L_0x014a:
            r1.getMax = r3     // Catch:{ all -> 0x01a4 }
            r1.setMin(r7)     // Catch:{ all -> 0x01a4 }
            r1.setMin(r11)     // Catch:{ all -> 0x01a4 }
            int r0 = r1.setMin     // Catch:{ all -> 0x01a4 }
            equals = r0     // Catch:{ all -> 0x01a4 }
            goto L_0x01a2
        L_0x0157:
            r1.setMin(r13)     // Catch:{ all -> 0x01a4 }
            int r0 = r1.setMin     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x01a2
            r0 = 26
            r7 = 26
            goto L_0x0127
        L_0x0163:
            r7 = 38
            goto L_0x0127
        L_0x0166:
            r7 = 28
            goto L_0x0127
        L_0x0169:
            r1.setMin(r4)     // Catch:{ all -> 0x01a4 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x01a4 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01a4 }
            throw r0     // Catch:{ all -> 0x01a4 }
        L_0x0171:
            r7 = 46
            goto L_0x0127
        L_0x0174:
            r1.getMax = r3     // Catch:{ all -> 0x01a4 }
            r1.setMin(r7)     // Catch:{ all -> 0x01a4 }
            r1.setMin(r10)     // Catch:{ all -> 0x01a4 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x01a4 }
            o.getItemPosition r0 = (o.getItemPosition) r0     // Catch:{ all -> 0x01a4 }
            o.registerDataSetObserver$getMin r0 = r0.getMax     // Catch:{ all -> 0x01a4 }
            r1.equals = r0     // Catch:{ all -> 0x01a4 }
            r1.setMin(r9)     // Catch:{ all -> 0x01a4 }
            goto L_0x01a2
        L_0x0188:
            r7 = 44
            goto L_0x0127
        L_0x018b:
            r7 = 1
            goto L_0x0127
        L_0x018d:
            r1.setMin(r4)     // Catch:{ all -> 0x01a4 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x01a4 }
            o.registerDataSetObserver$getMin r0 = (o.registerDataSetObserver.getMin) r0     // Catch:{ all -> 0x01a4 }
            return r0
        L_0x0195:
            r1.setMin(r3)     // Catch:{ all -> 0x01a4 }
            int r0 = r1.setMin     // Catch:{ all -> 0x01a4 }
            if (r0 == 0) goto L_0x019f
            r7 = 40
            goto L_0x0127
        L_0x019f:
            r7 = 30
            goto L_0x0127
        L_0x01a2:
            r7 = r6
            goto L_0x0127
        L_0x01a4:
            r0 = move-exception
            byte[] r7 = length
            byte r13 = r7[r8]
            byte r13 = (byte) r13
            r14 = r13 | 353(0x161, float:4.95E-43)
            short r14 = (short) r14
            byte r7 = r7[r11]
            short r7 = (short) r7
            java.lang.String r7 = setMin(r13, r14, r7)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            r11 = 27
            r13 = 47
            r14 = 43
            if (r7 == 0) goto L_0x01cc
            if (r6 < r3) goto L_0x01cc
            if (r6 > r4) goto L_0x01cc
        L_0x01c8:
            r7 = 43
            goto L_0x0237
        L_0x01cc:
            byte[] r7 = length
            byte r15 = r7[r8]
            byte r15 = (byte) r15
            r3 = 1875(0x753, float:2.627E-42)
            short r3 = (short) r3
            r16 = 3527(0xdc7, float:4.942E-42)
            byte r7 = r7[r16]
            short r7 = (short) r7
            java.lang.String r3 = setMin(r15, r3, r7)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x01ee
            if (r6 < r10) goto L_0x01ee
            if (r6 > r9) goto L_0x01ee
        L_0x01eb:
            r7 = 27
            goto L_0x0237
        L_0x01ee:
            r3 = 32
            if (r6 < r3) goto L_0x01f7
            if (r6 > r5) goto L_0x01f7
            r7 = 47
            goto L_0x0237
        L_0x01f7:
            byte[] r3 = length
            byte r7 = r3[r8]
            byte r7 = (byte) r7
            r9 = 436(0x1b4, float:6.11E-43)
            short r9 = (short) r9
            r10 = 5
            byte r3 = r3[r10]
            int r3 = -r3
            short r3 = (short) r3
            java.lang.String r3 = setMin(r7, r9, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x0219
            r3 = 31
            if (r6 < r3) goto L_0x0219
            if (r6 > r5) goto L_0x0219
            goto L_0x01eb
        L_0x0219:
            byte[] r3 = length
            byte r7 = r3[r8]
            byte r7 = (byte) r7
            byte r3 = r3[r10]
            int r3 = -r3
            short r3 = (short) r3
            java.lang.String r3 = setMin(r7, r9, r3)
            java.lang.Class r3 = java.lang.Class.forName(r3)
            boolean r3 = r3.isInstance(r0)
            if (r3 == 0) goto L_0x023f
            r3 = 41
            if (r6 < r3) goto L_0x023f
            if (r6 > r14) goto L_0x023f
            goto L_0x01c8
        L_0x0237:
            r1.equals = r0
            r1.setMin(r13)
            r3 = 1
            goto L_0x0127
        L_0x023f:
            throw r0
        L_0x0240:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0248
            throw r1
        L_0x0248:
            goto L_0x024a
        L_0x0249:
            throw r0
        L_0x024a:
            goto L_0x0249
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getItemPosition.setMax(o.getItemPosition):o.registerDataSetObserver$getMin");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0355, code lost:
        r1.setMin(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0679, code lost:
        if (r10 <= 166) goto L_0x062c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x079f, code lost:
        if (r10 <= 213) goto L_0x062e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0167, code lost:
        r1.setMin(22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x018b, code lost:
        r1.setMin(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02c5, code lost:
        r1.setMin(22);
     */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x055c  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02d5 A[Catch:{ all -> 0x02ca, all -> 0x053b }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02d6 A[Catch:{ all -> 0x02ca, all -> 0x053b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setMax(id.dana.domain.model.rpc.response.LoginResponse r24) {
        /*
            r23 = this;
            o.getTabIndicatorColor r1 = new o.getTabIndicatorColor
            r2 = r23
            r0 = r24
            r1.<init>(r2, r0)
            r0 = 73
            byte r0 = (byte) r0
            r3 = 3208(0xc88, float:4.495E-42)
            short r3 = (short) r3
            r4 = 882(0x372, float:1.236E-42)
            short r4 = (short) r4
            java.lang.String r0 = setMin(r0, r3, r4)
            r3 = 74
            byte r3 = (byte) r3
            r4 = 398(0x18e, float:5.58E-43)
            short r4 = (short) r4
            byte[] r5 = length
            r6 = 83
            byte r5 = r5[r6]
            short r5 = (short) r5
            java.lang.String r3 = setMin(r3, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x07e0 }
            r7 = 0
            r5[r7] = r3     // Catch:{ all -> 0x07e0 }
            byte[] r3 = length     // Catch:{ all -> 0x07e0 }
            r8 = 3446(0xd76, float:4.829E-42)
            byte r3 = r3[r8]     // Catch:{ all -> 0x07e0 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x07e0 }
            r9 = 1332(0x534, float:1.867E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x07e0 }
            byte[] r10 = length     // Catch:{ all -> 0x07e0 }
            r11 = 689(0x2b1, float:9.65E-43)
            byte r10 = r10[r11]     // Catch:{ all -> 0x07e0 }
            short r10 = (short) r10     // Catch:{ all -> 0x07e0 }
            java.lang.String r3 = setMin(r3, r9, r10)     // Catch:{ all -> 0x07e0 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x07e0 }
            byte[] r10 = length     // Catch:{ all -> 0x07e0 }
            r12 = 11
            byte r10 = r10[r12]     // Catch:{ all -> 0x07e0 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x07e0 }
            r12 = 1537(0x601, float:2.154E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x07e0 }
            byte[] r13 = length     // Catch:{ all -> 0x07e0 }
            r14 = 86
            byte r13 = r13[r14]     // Catch:{ all -> 0x07e0 }
            short r13 = (short) r13     // Catch:{ all -> 0x07e0 }
            java.lang.String r10 = setMin(r10, r12, r13)     // Catch:{ all -> 0x07e0 }
            java.lang.Class[] r12 = new java.lang.Class[r4]     // Catch:{ all -> 0x07e0 }
            byte[] r13 = length     // Catch:{ all -> 0x07e0 }
            byte r13 = r13[r8]     // Catch:{ all -> 0x07e0 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x07e0 }
            byte[] r14 = length     // Catch:{ all -> 0x07e0 }
            byte r14 = r14[r11]     // Catch:{ all -> 0x07e0 }
            short r14 = (short) r14     // Catch:{ all -> 0x07e0 }
            java.lang.String r13 = setMin(r13, r9, r14)     // Catch:{ all -> 0x07e0 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x07e0 }
            r12[r7] = r13     // Catch:{ all -> 0x07e0 }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r12)     // Catch:{ all -> 0x07e0 }
            java.lang.Object r0 = r3.invoke(r0, r5)     // Catch:{ all -> 0x07e0 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x07e0 }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r5 = 0
        L_0x007f:
            int r10 = r0.length
            if (r5 >= r10) goto L_0x0129
            r10 = r0[r5]
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ all -> 0x0120 }
            r12[r7] = r10     // Catch:{ all -> 0x0120 }
            byte[] r10 = length     // Catch:{ all -> 0x0120 }
            byte r10 = r10[r8]     // Catch:{ all -> 0x0120 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0120 }
            r13 = r10 | 1906(0x772, float:2.671E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0120 }
            byte[] r14 = length     // Catch:{ all -> 0x0120 }
            r15 = 113(0x71, float:1.58E-43)
            byte r14 = r14[r15]     // Catch:{ all -> 0x0120 }
            int r14 = -r14
            short r14 = (short) r14     // Catch:{ all -> 0x0120 }
            java.lang.String r10 = setMin(r10, r13, r14)     // Catch:{ all -> 0x0120 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0120 }
            byte[] r13 = length     // Catch:{ all -> 0x0120 }
            byte r13 = r13[r6]     // Catch:{ all -> 0x0120 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0120 }
            r14 = r13 | 488(0x1e8, float:6.84E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0120 }
            byte[] r15 = length     // Catch:{ all -> 0x0120 }
            r16 = 30
            byte r15 = r15[r16]     // Catch:{ all -> 0x0120 }
            short r15 = (short) r15     // Catch:{ all -> 0x0120 }
            java.lang.String r13 = setMin(r13, r14, r15)     // Catch:{ all -> 0x0120 }
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x0120 }
            byte[] r15 = length     // Catch:{ all -> 0x0120 }
            byte r15 = r15[r8]     // Catch:{ all -> 0x0120 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0120 }
            byte[] r16 = length     // Catch:{ all -> 0x0120 }
            byte r6 = r16[r11]     // Catch:{ all -> 0x0120 }
            short r6 = (short) r6     // Catch:{ all -> 0x0120 }
            java.lang.String r6 = setMin(r15, r9, r6)     // Catch:{ all -> 0x0120 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x0120 }
            r14[r7] = r6     // Catch:{ all -> 0x0120 }
            java.lang.reflect.Method r6 = r10.getMethod(r13, r14)     // Catch:{ all -> 0x0120 }
            r10 = 0
            java.lang.Object r6 = r6.invoke(r10, r12)     // Catch:{ all -> 0x0120 }
            byte[] r10 = length     // Catch:{ all -> 0x0117 }
            byte r10 = r10[r8]     // Catch:{ all -> 0x0117 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0117 }
            r12 = r10 | 1906(0x772, float:2.671E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0117 }
            byte[] r13 = length     // Catch:{ all -> 0x0117 }
            r14 = 113(0x71, float:1.58E-43)
            byte r13 = r13[r14]     // Catch:{ all -> 0x0117 }
            int r13 = -r13
            short r13 = (short) r13     // Catch:{ all -> 0x0117 }
            java.lang.String r10 = setMin(r10, r12, r13)     // Catch:{ all -> 0x0117 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0117 }
            byte[] r12 = length     // Catch:{ all -> 0x0117 }
            r13 = 3429(0xd65, float:4.805E-42)
            byte r12 = r12[r13]     // Catch:{ all -> 0x0117 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0117 }
            r13 = 482(0x1e2, float:6.75E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0117 }
            byte[] r14 = length     // Catch:{ all -> 0x0117 }
            r15 = 9
            byte r14 = r14[r15]     // Catch:{ all -> 0x0117 }
            short r14 = (short) r14     // Catch:{ all -> 0x0117 }
            java.lang.String r12 = setMin(r12, r13, r14)     // Catch:{ all -> 0x0117 }
            r13 = 0
            java.lang.reflect.Method r10 = r10.getMethod(r12, r13)     // Catch:{ all -> 0x0117 }
            r12 = 0
            java.lang.Object r6 = r10.invoke(r6, r12)     // Catch:{ all -> 0x0117 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0117 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0117 }
            r3[r5] = r6
            int r5 = r5 + 1
            r6 = 83
            goto L_0x007f
        L_0x0117:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011f
            throw r1
        L_0x011f:
            throw r0
        L_0x0120:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0128
            throw r1
        L_0x0128:
            throw r0
        L_0x0129:
            r0 = 0
        L_0x012a:
            int r10 = r0 + 1
            r13 = 19
            r15 = 18
            r0 = r3[r0]     // Catch:{ all -> 0x054c }
            int r0 = r1.setMin(r0)     // Catch:{ all -> 0x054c }
            r12 = 3
            r6 = 22
            r5 = 17
            r14 = 21
            switch(r0) {
                case -73: goto L_0x0542;
                case -72: goto L_0x053d;
                case -71: goto L_0x052d;
                case -70: goto L_0x0517;
                case -69: goto L_0x0512;
                case -68: goto L_0x050d;
                case -67: goto L_0x04ff;
                case -66: goto L_0x04fa;
                case -65: goto L_0x04e0;
                case -64: goto L_0x04cc;
                case -63: goto L_0x04c6;
                case -62: goto L_0x04c0;
                case -61: goto L_0x04b1;
                case -60: goto L_0x0499;
                case -59: goto L_0x0481;
                case -58: goto L_0x047b;
                case -57: goto L_0x0475;
                case -56: goto L_0x045e;
                case -55: goto L_0x0445;
                case -54: goto L_0x043d;
                case -53: goto L_0x0428;
                case -52: goto L_0x0424;
                case -51: goto L_0x0414;
                case -50: goto L_0x040a;
                case -49: goto L_0x03f1;
                case -48: goto L_0x03e9;
                case -47: goto L_0x03e3;
                case -46: goto L_0x03df;
                case -45: goto L_0x03d9;
                case -44: goto L_0x03ca;
                case -43: goto L_0x03c4;
                case -42: goto L_0x03ae;
                case -41: goto L_0x03a8;
                case -40: goto L_0x038d;
                case -39: goto L_0x0387;
                case -38: goto L_0x0381;
                case -37: goto L_0x037b;
                case -36: goto L_0x036c;
                case -35: goto L_0x035a;
                case -34: goto L_0x034f;
                case -33: goto L_0x0337;
                case -32: goto L_0x0331;
                case -31: goto L_0x031a;
                case -30: goto L_0x0314;
                case -29: goto L_0x02f9;
                case -28: goto L_0x02e4;
                case -27: goto L_0x02de;
                case -26: goto L_0x02d7;
                case -25: goto L_0x0257;
                case -24: goto L_0x0243;
                case -23: goto L_0x023a;
                case -22: goto L_0x0239;
                case -21: goto L_0x0235;
                case -20: goto L_0x0231;
                case -19: goto L_0x022d;
                case -18: goto L_0x0222;
                case -17: goto L_0x021e;
                case -16: goto L_0x021a;
                case -15: goto L_0x020f;
                case -14: goto L_0x0201;
                case -13: goto L_0x01fc;
                case -12: goto L_0x01f8;
                case -11: goto L_0x01a2;
                case -10: goto L_0x019d;
                case -9: goto L_0x0198;
                case -8: goto L_0x0195;
                case -7: goto L_0x0192;
                case -6: goto L_0x018f;
                case -5: goto L_0x017b;
                case -4: goto L_0x016b;
                case -3: goto L_0x0157;
                case -2: goto L_0x0147;
                case -1: goto L_0x0144;
                default: goto L_0x0140;
            }     // Catch:{ all -> 0x054c }
        L_0x0140:
            r19 = 83
            goto L_0x0547
        L_0x0144:
            r0 = 119(0x77, float:1.67E-43)
            goto L_0x012a
        L_0x0147:
            r1.getMax = r4     // Catch:{ all -> 0x054c }
            r1.setMin(r5)     // Catch:{ all -> 0x054c }
            r1.setMin(r14)     // Catch:{ all -> 0x054c }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x054c }
            o.getItemPosition r0 = (o.getItemPosition) r0     // Catch:{ all -> 0x054c }
            r0.setMin()     // Catch:{ all -> 0x054c }
            goto L_0x0140
        L_0x0157:
            r1.getMax = r4     // Catch:{ all -> 0x054c }
            r1.setMin(r5)     // Catch:{ all -> 0x054c }
            r1.setMin(r14)     // Catch:{ all -> 0x054c }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x054c }
            o.getItemPosition r0 = (o.getItemPosition) r0     // Catch:{ all -> 0x054c }
            o.registerDataSetObserver$getMin r0 = r0.getMax     // Catch:{ all -> 0x054c }
            r1.equals = r0     // Catch:{ all -> 0x054c }
        L_0x0167:
            r1.setMin(r6)     // Catch:{ all -> 0x054c }
            goto L_0x0140
        L_0x016b:
            r1.getMax = r4     // Catch:{ all -> 0x054c }
            r1.setMin(r5)     // Catch:{ all -> 0x054c }
            r1.setMin(r14)     // Catch:{ all -> 0x054c }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x054c }
            o.registerDataSetObserver$getMin r0 = (o.registerDataSetObserver.getMin) r0     // Catch:{ all -> 0x054c }
            r0.getMin()     // Catch:{ all -> 0x054c }
            goto L_0x0140
        L_0x017b:
            r1.getMax = r4     // Catch:{ all -> 0x054c }
            r1.setMin(r5)     // Catch:{ all -> 0x054c }
            r1.setMin(r14)     // Catch:{ all -> 0x054c }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x054c }
            int r0 = super.hashCode()     // Catch:{ all -> 0x054c }
            r1.getMax = r0     // Catch:{ all -> 0x054c }
        L_0x018b:
            r1.setMin(r12)     // Catch:{ all -> 0x054c }
            goto L_0x0140
        L_0x018f:
            r0 = 60
            goto L_0x012a
        L_0x0192:
            r0 = 114(0x72, float:1.6E-43)
            goto L_0x012a
        L_0x0195:
            r0 = 177(0xb1, float:2.48E-43)
            goto L_0x012a
        L_0x0198:
            java.lang.String r0 = "DanaLogin"
            r1.equals = r0     // Catch:{ all -> 0x054c }
            goto L_0x0167
        L_0x019d:
            java.lang.String r0 = "[HoldLogin] login error: errorCode = "
            r1.equals = r0     // Catch:{ all -> 0x054c }
            goto L_0x0167
        L_0x01a2:
            r1.getMax = r4     // Catch:{ all -> 0x054c }
            r1.setMin(r5)     // Catch:{ all -> 0x054c }
            r1.setMin(r14)     // Catch:{ all -> 0x054c }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x054c }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x01ef }
            r5[r7] = r0     // Catch:{ all -> 0x01ef }
            byte[] r0 = length     // Catch:{ all -> 0x01ef }
            byte r0 = r0[r8]     // Catch:{ all -> 0x01ef }
            byte r0 = (byte) r0     // Catch:{ all -> 0x01ef }
            byte[] r12 = length     // Catch:{ all -> 0x01ef }
            r14 = 715(0x2cb, float:1.002E-42)
            byte r12 = r12[r14]     // Catch:{ all -> 0x01ef }
            int r12 = r12 - r4
            short r12 = (short) r12     // Catch:{ all -> 0x01ef }
            byte[] r14 = length     // Catch:{ all -> 0x01ef }
            r19 = 2041(0x7f9, float:2.86E-42)
            byte r14 = r14[r19]     // Catch:{ all -> 0x01ef }
            int r14 = -r14
            short r14 = (short) r14     // Catch:{ all -> 0x01ef }
            java.lang.String r0 = setMin(r0, r12, r14)     // Catch:{ all -> 0x01ef }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x01ef }
            java.lang.Class[] r12 = new java.lang.Class[r4]     // Catch:{ all -> 0x01ef }
            byte[] r14 = length     // Catch:{ all -> 0x01ef }
            byte r14 = r14[r8]     // Catch:{ all -> 0x01ef }
            byte r14 = (byte) r14     // Catch:{ all -> 0x01ef }
            byte[] r19 = length     // Catch:{ all -> 0x01ef }
            byte r8 = r19[r11]     // Catch:{ all -> 0x01ef }
            short r8 = (short) r8     // Catch:{ all -> 0x01ef }
            java.lang.String r8 = setMin(r14, r9, r8)     // Catch:{ all -> 0x01ef }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x01ef }
            r12[r7] = r8     // Catch:{ all -> 0x01ef }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r12)     // Catch:{ all -> 0x01ef }
            java.lang.Object r0 = r0.newInstance(r5)     // Catch:{ all -> 0x01ef }
            r1.equals = r0     // Catch:{ all -> 0x054c }
            goto L_0x0167
        L_0x01ef:
            r0 = move-exception
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x054c }
            if (r5 == 0) goto L_0x01f7
            throw r5     // Catch:{ all -> 0x054c }
        L_0x01f7:
            throw r0     // Catch:{ all -> 0x054c }
        L_0x01f8:
            r0 = 181(0xb5, float:2.54E-43)
            goto L_0x0548
        L_0x01fc:
            int r0 = equals     // Catch:{ all -> 0x054c }
            r1.getMax = r0     // Catch:{ all -> 0x054c }
            goto L_0x018b
        L_0x0201:
            r1.getMax = r4     // Catch:{ all -> 0x054c }
            r1.setMin(r5)     // Catch:{ all -> 0x054c }
            r1.setMin(r15)     // Catch:{ all -> 0x054c }
            int r0 = r1.setMin     // Catch:{ all -> 0x054c }
            toIntRange = r0     // Catch:{ all -> 0x054c }
            goto L_0x0140
        L_0x020f:
            r1.setMin(r13)     // Catch:{ all -> 0x054c }
            int r0 = r1.setMin     // Catch:{ all -> 0x054c }
            if (r0 != 0) goto L_0x0547
            r0 = 37
            goto L_0x0548
        L_0x021a:
            r0 = 243(0xf3, float:3.4E-43)
            goto L_0x0548
        L_0x021e:
            r0 = 84
            goto L_0x0548
        L_0x0222:
            r1.setMin(r13)     // Catch:{ all -> 0x054c }
            int r0 = r1.setMin     // Catch:{ all -> 0x054c }
            if (r0 != 0) goto L_0x0547
            r0 = 57
            goto L_0x0548
        L_0x022d:
            r0 = 246(0xf6, float:3.45E-43)
            goto L_0x0548
        L_0x0231:
            r0 = 238(0xee, float:3.34E-43)
            goto L_0x0548
        L_0x0235:
            r0 = 14
            goto L_0x0548
        L_0x0239:
            return
        L_0x023a:
            r5 = 2
            r1.setMin(r5)     // Catch:{ all -> 0x054c }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x054c }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x054c }
            throw r0     // Catch:{ all -> 0x054c }
        L_0x0243:
            r1.getMax = r4     // Catch:{ all -> 0x054c }
            r1.setMin(r5)     // Catch:{ all -> 0x054c }
            r1.setMin(r14)     // Catch:{ all -> 0x054c }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x054c }
            o.initWithSecurityGuard r0 = (o.initWithSecurityGuard) r0     // Catch:{ all -> 0x054c }
            java.lang.String r0 = r0.getErrorCode()     // Catch:{ all -> 0x054c }
            r1.equals = r0     // Catch:{ all -> 0x054c }
            goto L_0x0167
        L_0x0257:
            r8 = 2
            r1.getMax = r8     // Catch:{ all -> 0x054c }
            r1.setMin(r5)     // Catch:{ all -> 0x054c }
            r1.setMin(r14)     // Catch:{ all -> 0x054c }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x054c }
            r1.setMin(r14)     // Catch:{ all -> 0x054c }
            java.lang.Object r5 = r1.isInside     // Catch:{ all -> 0x054c }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x02cc }
            r8[r7] = r5     // Catch:{ all -> 0x02cc }
            byte[] r5 = length     // Catch:{ all -> 0x02cc }
            r12 = 3446(0xd76, float:4.829E-42)
            byte r5 = r5[r12]     // Catch:{ all -> 0x02cc }
            byte r5 = (byte) r5     // Catch:{ all -> 0x02cc }
            byte[] r12 = length     // Catch:{ all -> 0x02cc }
            r14 = 715(0x2cb, float:1.002E-42)
            byte r12 = r12[r14]     // Catch:{ all -> 0x02cc }
            int r12 = r12 - r4
            short r12 = (short) r12     // Catch:{ all -> 0x02cc }
            byte[] r14 = length     // Catch:{ all -> 0x02cc }
            r19 = 2041(0x7f9, float:2.86E-42)
            byte r14 = r14[r19]     // Catch:{ all -> 0x02cc }
            int r14 = -r14
            short r14 = (short) r14     // Catch:{ all -> 0x02cc }
            java.lang.String r5 = setMin(r5, r12, r14)     // Catch:{ all -> 0x02cc }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x02cc }
            byte[] r12 = length     // Catch:{ all -> 0x02cc }
            r14 = 687(0x2af, float:9.63E-43)
            byte r12 = r12[r14]     // Catch:{ all -> 0x02cc }
            byte r12 = (byte) r12     // Catch:{ all -> 0x02cc }
            byte[] r14 = length     // Catch:{ all -> 0x02cc }
            r19 = 83
            byte r14 = r14[r19]     // Catch:{ all -> 0x02ca }
            short r14 = (short) r14     // Catch:{ all -> 0x02ca }
            byte[] r21 = length     // Catch:{ all -> 0x02ca }
            r22 = 4
            byte r13 = r21[r22]     // Catch:{ all -> 0x02ca }
            short r13 = (short) r13     // Catch:{ all -> 0x02ca }
            java.lang.String r12 = setMin(r12, r14, r13)     // Catch:{ all -> 0x02ca }
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch:{ all -> 0x02ca }
            byte[] r14 = length     // Catch:{ all -> 0x02ca }
            r20 = 3446(0xd76, float:4.829E-42)
            byte r14 = r14[r20]     // Catch:{ all -> 0x02ca }
            byte r14 = (byte) r14     // Catch:{ all -> 0x02ca }
            byte[] r21 = length     // Catch:{ all -> 0x02ca }
            byte r15 = r21[r11]     // Catch:{ all -> 0x02ca }
            short r15 = (short) r15     // Catch:{ all -> 0x02ca }
            java.lang.String r14 = setMin(r14, r9, r15)     // Catch:{ all -> 0x02ca }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x02ca }
            r13[r7] = r14     // Catch:{ all -> 0x02ca }
            java.lang.reflect.Method r5 = r5.getMethod(r12, r13)     // Catch:{ all -> 0x02ca }
            java.lang.Object r0 = r5.invoke(r0, r8)     // Catch:{ all -> 0x02ca }
            r1.equals = r0     // Catch:{ all -> 0x053b }
        L_0x02c5:
            r1.setMin(r6)     // Catch:{ all -> 0x053b }
            goto L_0x0547
        L_0x02ca:
            r0 = move-exception
            goto L_0x02cf
        L_0x02cc:
            r0 = move-exception
            r19 = 83
        L_0x02cf:
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x053b }
            if (r5 == 0) goto L_0x02d6
            throw r5     // Catch:{ all -> 0x053b }
        L_0x02d6:
            throw r0     // Catch:{ all -> 0x053b }
        L_0x02d7:
            r19 = 83
            java.lang.String r0 = ", errorMessage = "
            r1.equals = r0     // Catch:{ all -> 0x053b }
            goto L_0x02c5
        L_0x02de:
            r19 = 83
            r0 = 207(0xcf, float:2.9E-43)
            goto L_0x0548
        L_0x02e4:
            r19 = 83
            r1.getMax = r4     // Catch:{ all -> 0x053b }
            r1.setMin(r5)     // Catch:{ all -> 0x053b }
            r1.setMin(r14)     // Catch:{ all -> 0x053b }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x053b }
            o.initWithSecurityGuard r0 = (o.initWithSecurityGuard) r0     // Catch:{ all -> 0x053b }
            java.lang.String r0 = r0.getErrorMessage()     // Catch:{ all -> 0x053b }
            r1.equals = r0     // Catch:{ all -> 0x053b }
            goto L_0x02c5
        L_0x02f9:
            r6 = 2
            r19 = 83
            r1.getMax = r6     // Catch:{ all -> 0x053b }
            r1.setMin(r5)     // Catch:{ all -> 0x053b }
            r1.setMin(r14)     // Catch:{ all -> 0x053b }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x053b }
            o.registerDataSetObserver$getMin r0 = (o.registerDataSetObserver.getMin) r0     // Catch:{ all -> 0x053b }
            r1.setMin(r14)     // Catch:{ all -> 0x053b }
            java.lang.Object r5 = r1.isInside     // Catch:{ all -> 0x053b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x053b }
            r0.onError(r5)     // Catch:{ all -> 0x053b }
            goto L_0x0547
        L_0x0314:
            r19 = 83
            r0 = 159(0x9f, float:2.23E-43)
            goto L_0x0548
        L_0x031a:
            r19 = 83
            r1.setMin(r4)     // Catch:{ all -> 0x053b }
            int r0 = r1.setMin     // Catch:{ all -> 0x053b }
            r5 = 84
            if (r0 == r5) goto L_0x032d
            r5 = 93
            if (r0 == r5) goto L_0x032a
            goto L_0x032d
        L_0x032a:
            r0 = 1
            goto L_0x0548
        L_0x032d:
            r0 = 62
            goto L_0x0548
        L_0x0331:
            r19 = 83
            r0 = 83
            goto L_0x012a
        L_0x0337:
            r19 = 83
            r1.setMin(r4)     // Catch:{ all -> 0x053b }
            int r0 = r1.setMin     // Catch:{ all -> 0x053b }
            r5 = 57
            if (r0 == r5) goto L_0x034b
            r5 = 75
            if (r0 == r5) goto L_0x0347
            goto L_0x034b
        L_0x0347:
            r0 = 250(0xfa, float:3.5E-43)
            goto L_0x0548
        L_0x034b:
            r0 = 151(0x97, float:2.12E-43)
            goto L_0x0548
        L_0x034f:
            r19 = 83
            int r0 = toIntRange     // Catch:{ all -> 0x053b }
            r1.getMax = r0     // Catch:{ all -> 0x053b }
        L_0x0355:
            r1.setMin(r12)     // Catch:{ all -> 0x053b }
            goto L_0x0547
        L_0x035a:
            r19 = 83
            r1.getMax = r4     // Catch:{ all -> 0x053b }
            r1.setMin(r5)     // Catch:{ all -> 0x053b }
            r5 = 18
            r1.setMin(r5)     // Catch:{ all -> 0x053b }
            int r0 = r1.setMin     // Catch:{ all -> 0x053b }
            equals = r0     // Catch:{ all -> 0x053b }
            goto L_0x0547
        L_0x036c:
            r0 = 40
            r19 = 83
            r1.setMin(r0)     // Catch:{ all -> 0x053b }
            int r0 = r1.setMin     // Catch:{ all -> 0x053b }
            if (r0 != 0) goto L_0x0547
            r0 = 107(0x6b, float:1.5E-43)
            goto L_0x0548
        L_0x037b:
            r19 = 83
            r0 = 10
            goto L_0x0548
        L_0x0381:
            r19 = 83
            r0 = 108(0x6c, float:1.51E-43)
            goto L_0x0548
        L_0x0387:
            r19 = 83
            r0 = 180(0xb4, float:2.52E-43)
            goto L_0x0548
        L_0x038d:
            r6 = 2
            r19 = 83
            r1.getMax = r6     // Catch:{ all -> 0x053b }
            r1.setMin(r5)     // Catch:{ all -> 0x053b }
            r1.setMin(r14)     // Catch:{ all -> 0x053b }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x053b }
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = (com.google.firebase.crashlytics.FirebaseCrashlytics) r0     // Catch:{ all -> 0x053b }
            r1.setMin(r14)     // Catch:{ all -> 0x053b }
            java.lang.Object r5 = r1.isInside     // Catch:{ all -> 0x053b }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x053b }
            r0.recordException(r5)     // Catch:{ all -> 0x053b }
            goto L_0x0547
        L_0x03a8:
            r19 = 83
            r0 = 173(0xad, float:2.42E-43)
            goto L_0x0548
        L_0x03ae:
            r19 = 83
            r1.setMin(r4)     // Catch:{ all -> 0x053b }
            int r0 = r1.setMin     // Catch:{ all -> 0x053b }
            if (r0 == r4) goto L_0x03c0
            r5 = 75
            if (r0 == r5) goto L_0x03bc
            goto L_0x03c0
        L_0x03bc:
            r0 = 178(0xb2, float:2.5E-43)
            goto L_0x0548
        L_0x03c0:
            r0 = 115(0x73, float:1.61E-43)
            goto L_0x0548
        L_0x03c4:
            r19 = 83
            r0 = 38
            goto L_0x0548
        L_0x03ca:
            r5 = 19
            r19 = 83
            r1.setMin(r5)     // Catch:{ all -> 0x053b }
            int r0 = r1.setMin     // Catch:{ all -> 0x053b }
            if (r0 != 0) goto L_0x0547
            r0 = 140(0x8c, float:1.96E-43)
            goto L_0x0548
        L_0x03d9:
            r19 = 83
            r0 = 236(0xec, float:3.31E-43)
            goto L_0x0548
        L_0x03df:
            r0 = 166(0xa6, float:2.33E-43)
            goto L_0x012a
        L_0x03e3:
            r19 = 83
            r0 = 158(0x9e, float:2.21E-43)
            goto L_0x0548
        L_0x03e9:
            r19 = 83
            java.lang.String r0 = "$this$logToCrashlytics"
            r1.equals = r0     // Catch:{ all -> 0x053b }
            goto L_0x02c5
        L_0x03f1:
            r6 = 2
            r19 = 83
            r1.getMax = r6     // Catch:{ all -> 0x053b }
            r1.setMin(r5)     // Catch:{ all -> 0x053b }
            r1.setMin(r14)     // Catch:{ all -> 0x053b }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x053b }
            r1.setMin(r14)     // Catch:{ all -> 0x053b }
            java.lang.Object r5 = r1.isInside     // Catch:{ all -> 0x053b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x053b }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)     // Catch:{ all -> 0x053b }
            goto L_0x0547
        L_0x040a:
            r19 = 83
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()     // Catch:{ all -> 0x053b }
            r1.equals = r0     // Catch:{ all -> 0x053b }
            goto L_0x02c5
        L_0x0414:
            r19 = 83
            r1.getMax = r4     // Catch:{ all -> 0x053b }
            r1.setMin(r5)     // Catch:{ all -> 0x053b }
            r1.setMin(r14)     // Catch:{ all -> 0x053b }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x053b }
            r1.equals = r0     // Catch:{ all -> 0x053b }
            goto L_0x02c5
        L_0x0424:
            r0 = 213(0xd5, float:2.98E-43)
            goto L_0x012a
        L_0x0428:
            r19 = 83
            r1.setMin(r4)     // Catch:{ all -> 0x053b }
            int r0 = r1.setMin     // Catch:{ all -> 0x053b }
            r5 = 15
            if (r0 == r5) goto L_0x0439
            r5 = 77
            r0 = 202(0xca, float:2.83E-43)
            goto L_0x0548
        L_0x0439:
            r0 = 112(0x70, float:1.57E-43)
            goto L_0x0548
        L_0x043d:
            r19 = 83
            java.lang.String r0 = "loginResponse.errorMessage"
            r1.equals = r0     // Catch:{ all -> 0x053b }
            goto L_0x02c5
        L_0x0445:
            r6 = 2
            r19 = 83
            r1.getMax = r6     // Catch:{ all -> 0x053b }
            r1.setMin(r5)     // Catch:{ all -> 0x053b }
            r1.setMin(r14)     // Catch:{ all -> 0x053b }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x053b }
            r1.setMin(r14)     // Catch:{ all -> 0x053b }
            java.lang.Object r5 = r1.isInside     // Catch:{ all -> 0x053b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x053b }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)     // Catch:{ all -> 0x053b }
            goto L_0x0547
        L_0x045e:
            r19 = 83
            id.dana.challenge.LoginFailureException r0 = new id.dana.challenge.LoginFailureException     // Catch:{ all -> 0x053b }
            r1.getMax = r4     // Catch:{ all -> 0x053b }
            r1.setMin(r5)     // Catch:{ all -> 0x053b }
            r1.setMin(r14)     // Catch:{ all -> 0x053b }
            java.lang.Object r5 = r1.isInside     // Catch:{ all -> 0x053b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x053b }
            r0.<init>((java.lang.String) r5)     // Catch:{ all -> 0x053b }
            r1.equals = r0     // Catch:{ all -> 0x053b }
            goto L_0x02c5
        L_0x0475:
            r19 = 83
            r0 = 123(0x7b, float:1.72E-43)
            goto L_0x0548
        L_0x047b:
            r19 = 83
            r0 = 86
            goto L_0x0548
        L_0x0481:
            r19 = 83
            r1.setMin(r4)     // Catch:{ all -> 0x053b }
            int r0 = r1.setMin     // Catch:{ all -> 0x053b }
            r5 = 59
            if (r0 == r5) goto L_0x0495
            r5 = 69
            if (r0 == r5) goto L_0x0491
            goto L_0x0495
        L_0x0491:
            r0 = 141(0x8d, float:1.98E-43)
            goto L_0x0548
        L_0x0495:
            r0 = 69
            goto L_0x0548
        L_0x0499:
            r19 = 83
            r1.setMin(r4)     // Catch:{ all -> 0x053b }
            int r0 = r1.setMin     // Catch:{ all -> 0x053b }
            r5 = 18
            if (r0 == r5) goto L_0x04ad
            r5 = 93
            if (r0 == r5) goto L_0x04a9
            goto L_0x04ad
        L_0x04a9:
            r0 = 77
            goto L_0x0548
        L_0x04ad:
            r0 = 18
            goto L_0x0548
        L_0x04b1:
            r0 = 40
            r19 = 83
            r1.setMin(r0)     // Catch:{ all -> 0x053b }
            int r0 = r1.setMin     // Catch:{ all -> 0x053b }
            if (r0 != 0) goto L_0x0547
            r0 = 201(0xc9, float:2.82E-43)
            goto L_0x0548
        L_0x04c0:
            r19 = 83
            r0 = 247(0xf7, float:3.46E-43)
            goto L_0x0548
        L_0x04c6:
            r19 = 83
            r0 = 12
            goto L_0x0548
        L_0x04cc:
            r19 = 83
            r1.getMax = r4     // Catch:{ all -> 0x053b }
            r1.setMin(r5)     // Catch:{ all -> 0x053b }
            r1.setMin(r14)     // Catch:{ all -> 0x053b }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x053b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x053b }
            r1.equals = r0     // Catch:{ all -> 0x053b }
            goto L_0x02c5
        L_0x04e0:
            r6 = 2
            r19 = 83
            r1.getMax = r6     // Catch:{ all -> 0x053b }
            r1.setMin(r5)     // Catch:{ all -> 0x053b }
            r1.setMin(r14)     // Catch:{ all -> 0x053b }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x053b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x053b }
            r1.setMin(r14)     // Catch:{ all -> 0x053b }
            java.lang.Object r5 = r1.isInside     // Catch:{ all -> 0x053b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x053b }
            o.setStateOff.getMax(r0, r5)     // Catch:{ all -> 0x053b }
            goto L_0x0547
        L_0x04fa:
            r19 = 83
            r0 = 87
            goto L_0x0548
        L_0x04ff:
            r5 = 19
            r19 = 83
            r1.setMin(r5)     // Catch:{ all -> 0x053b }
            int r0 = r1.setMin     // Catch:{ all -> 0x053b }
            if (r0 != 0) goto L_0x0547
            r0 = 235(0xeb, float:3.3E-43)
            goto L_0x0548
        L_0x050d:
            r19 = 83
            r0 = 149(0x95, float:2.09E-43)
            goto L_0x0548
        L_0x0512:
            r19 = 83
            r0 = 170(0xaa, float:2.38E-43)
            goto L_0x0548
        L_0x0517:
            r19 = 83
            r1.getMax = r4     // Catch:{ all -> 0x053b }
            r1.setMin(r5)     // Catch:{ all -> 0x053b }
            r1.setMin(r14)     // Catch:{ all -> 0x053b }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x053b }
            o.initWithSecurityGuard r0 = (o.initWithSecurityGuard) r0     // Catch:{ all -> 0x053b }
            boolean r0 = r0.isSuccess()     // Catch:{ all -> 0x053b }
            r1.getMax = r0     // Catch:{ all -> 0x053b }
            goto L_0x0355
        L_0x052d:
            r0 = 40
            r19 = 83
            r1.setMin(r0)     // Catch:{ all -> 0x053b }
            int r0 = r1.setMin     // Catch:{ all -> 0x053b }
            if (r0 != 0) goto L_0x0547
            r0 = 242(0xf2, float:3.39E-43)
            goto L_0x0548
        L_0x053b:
            r0 = move-exception
            goto L_0x054f
        L_0x053d:
            r19 = 83
            r0 = 168(0xa8, float:2.35E-43)
            goto L_0x0548
        L_0x0542:
            r19 = 83
            r0 = 110(0x6e, float:1.54E-43)
            goto L_0x0548
        L_0x0547:
            r0 = r10
        L_0x0548:
            r8 = 3446(0xd76, float:4.829E-42)
            goto L_0x012a
        L_0x054c:
            r0 = move-exception
            r19 = 83
        L_0x054f:
            r5 = 6
            r6 = 58
            r8 = 122(0x7a, float:1.71E-43)
            r12 = 76
            if (r10 < r5) goto L_0x0568
            r5 = 10
            if (r10 > r5) goto L_0x0568
            r5 = 172(0xac, float:2.41E-43)
            r4 = 213(0xd5, float:2.98E-43)
            r5 = 166(0xa6, float:2.33E-43)
            r6 = 172(0xac, float:2.41E-43)
        L_0x0564:
            r12 = 3446(0xd76, float:4.829E-42)
            goto L_0x07d4
        L_0x0568:
            byte[] r5 = length
            r13 = 3446(0xd76, float:4.829E-42)
            byte r14 = r5[r13]
            byte r13 = (byte) r14
            r14 = r13 | 3282(0xcd2, float:4.599E-42)
            short r14 = (short) r14
            r15 = 3917(0xf4d, float:5.489E-42)
            byte r5 = r5[r15]
            short r5 = (short) r5
            java.lang.String r5 = setMin(r13, r14, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0594
            r5 = 18
            if (r10 < r5) goto L_0x0594
            r5 = 19
            if (r10 > r5) goto L_0x0594
            r4 = 213(0xd5, float:2.98E-43)
            r5 = 166(0xa6, float:2.33E-43)
        L_0x0591:
            r6 = 122(0x7a, float:1.71E-43)
            goto L_0x0564
        L_0x0594:
            byte[] r5 = length
            r13 = 3446(0xd76, float:4.829E-42)
            byte r14 = r5[r13]
            byte r13 = (byte) r14
            r14 = r13 | 353(0x161, float:4.95E-43)
            short r14 = (short) r14
            r21 = 18
            byte r5 = r5[r21]
            short r5 = (short) r5
            java.lang.String r5 = setMin(r13, r14, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x05be
            r5 = 112(0x70, float:1.57E-43)
            if (r10 < r5) goto L_0x05be
            r5 = 114(0x72, float:1.6E-43)
            if (r10 > r5) goto L_0x05be
        L_0x05b9:
            r4 = 213(0xd5, float:2.98E-43)
            r5 = 166(0xa6, float:2.33E-43)
            goto L_0x0564
        L_0x05be:
            r5 = 116(0x74, float:1.63E-43)
            if (r10 < r5) goto L_0x05cf
            r5 = 119(0x77, float:1.67E-43)
            if (r10 > r5) goto L_0x05cf
            r5 = 249(0xf9, float:3.49E-43)
            r4 = 213(0xd5, float:2.98E-43)
            r5 = 166(0xa6, float:2.33E-43)
            r6 = 249(0xf9, float:3.49E-43)
            goto L_0x0564
        L_0x05cf:
            r5 = 146(0x92, float:2.05E-43)
            if (r10 < r5) goto L_0x05e0
            r5 = 149(0x95, float:2.09E-43)
            if (r10 > r5) goto L_0x05e0
            r5 = 68
            r4 = 213(0xd5, float:2.98E-43)
            r5 = 166(0xa6, float:2.33E-43)
            r6 = 68
            goto L_0x0564
        L_0x05e0:
            byte[] r5 = length
            r13 = 3446(0xd76, float:4.829E-42)
            byte r14 = r5[r13]
            byte r13 = (byte) r14
            r14 = r13 | 353(0x161, float:4.95E-43)
            short r14 = (short) r14
            r21 = 18
            byte r5 = r5[r21]
            short r5 = (short) r5
            java.lang.String r5 = setMin(r13, r14, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0606
            r5 = 154(0x9a, float:2.16E-43)
            if (r10 < r5) goto L_0x0606
            r5 = 158(0x9e, float:2.21E-43)
            if (r10 > r5) goto L_0x0606
            goto L_0x05b9
        L_0x0606:
            byte[] r5 = length
            r13 = 3446(0xd76, float:4.829E-42)
            byte r14 = r5[r13]
            byte r13 = (byte) r14
            r14 = r13 | 1890(0x762, float:2.648E-42)
            short r14 = (short) r14
            r21 = 655(0x28f, float:9.18E-43)
            byte r5 = r5[r21]
            int r5 = -r5
            short r5 = (short) r5
            java.lang.String r5 = setMin(r13, r14, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0632
            r5 = 160(0xa0, float:2.24E-43)
            if (r10 < r5) goto L_0x0632
            r5 = 166(0xa6, float:2.33E-43)
            if (r10 > r5) goto L_0x0632
        L_0x062c:
            r4 = 213(0xd5, float:2.98E-43)
        L_0x062e:
            r6 = 76
            goto L_0x0564
        L_0x0632:
            byte[] r5 = length
            r13 = 3446(0xd76, float:4.829E-42)
            byte r14 = r5[r13]
            byte r13 = (byte) r14
            r14 = 1875(0x753, float:2.627E-42)
            short r14 = (short) r14
            r21 = 3527(0xdc7, float:4.942E-42)
            byte r5 = r5[r21]
            short r5 = (short) r5
            java.lang.String r5 = setMin(r13, r14, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0658
            r5 = 162(0xa2, float:2.27E-43)
            if (r10 < r5) goto L_0x0658
            r5 = 166(0xa6, float:2.33E-43)
            if (r10 > r5) goto L_0x0658
        L_0x0657:
            goto L_0x062c
        L_0x0658:
            byte[] r5 = length
            r13 = 3446(0xd76, float:4.829E-42)
            byte r14 = r5[r13]
            byte r13 = (byte) r14
            r14 = r13 | 3282(0xcd2, float:4.599E-42)
            short r14 = (short) r14
            byte r5 = r5[r15]
            short r5 = (short) r5
            java.lang.String r5 = setMin(r13, r14, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x067c
            r5 = 163(0xa3, float:2.28E-43)
            if (r10 < r5) goto L_0x067c
            r5 = 166(0xa6, float:2.33E-43)
            if (r10 > r5) goto L_0x067e
            goto L_0x0657
        L_0x067c:
            r5 = 166(0xa6, float:2.33E-43)
        L_0x067e:
            byte[] r13 = length
            r14 = 3446(0xd76, float:4.829E-42)
            byte r4 = r13[r14]
            byte r4 = (byte) r4
            r14 = r4 | 1890(0x762, float:2.648E-42)
            short r14 = (short) r14
            r18 = 655(0x28f, float:9.18E-43)
            byte r13 = r13[r18]
            int r13 = -r13
            short r13 = (short) r13
            java.lang.String r4 = setMin(r4, r14, r13)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x06a5
            r4 = 181(0xb5, float:2.54E-43)
            if (r10 < r4) goto L_0x06a5
            r4 = 202(0xca, float:2.83E-43)
            if (r10 > r4) goto L_0x06a5
            goto L_0x062c
        L_0x06a5:
            byte[] r4 = length
            r13 = 3446(0xd76, float:4.829E-42)
            byte r4 = r4[r13]
            byte r4 = (byte) r4
            r13 = r4 | 514(0x202, float:7.2E-43)
            short r13 = (short) r13
            int r14 = setMin
            r18 = 2
            int r14 = r14 >>> 2
            short r14 = (short) r14
            java.lang.String r4 = setMin(r4, r13, r14)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x06d0
            r4 = 197(0xc5, float:2.76E-43)
            if (r10 < r4) goto L_0x06d0
            r4 = 202(0xca, float:2.83E-43)
            if (r10 > r4) goto L_0x06d0
        L_0x06cc:
            r4 = 213(0xd5, float:2.98E-43)
            goto L_0x0591
        L_0x06d0:
            byte[] r4 = length
            r13 = 3446(0xd76, float:4.829E-42)
            byte r14 = r4[r13]
            byte r13 = (byte) r14
            r14 = r13 | 353(0x161, float:4.95E-43)
            short r14 = (short) r14
            r18 = 18
            byte r4 = r4[r18]
            short r4 = (short) r4
            java.lang.String r4 = setMin(r13, r14, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x06f9
            r4 = 202(0xca, float:2.83E-43)
            if (r10 < r4) goto L_0x06f9
            r4 = 207(0xcf, float:2.9E-43)
            if (r10 > r4) goto L_0x06f9
            r4 = 213(0xd5, float:2.98E-43)
            goto L_0x0564
        L_0x06f9:
            r4 = 203(0xcb, float:2.84E-43)
            if (r10 < r4) goto L_0x0709
            r4 = 207(0xcf, float:2.9E-43)
            if (r10 > r4) goto L_0x0709
            r4 = 245(0xf5, float:3.43E-43)
            r4 = 213(0xd5, float:2.98E-43)
            r6 = 245(0xf5, float:3.43E-43)
            goto L_0x0564
        L_0x0709:
            byte[] r4 = length
            r13 = 3446(0xd76, float:4.829E-42)
            byte r14 = r4[r13]
            byte r13 = (byte) r14
            r14 = r13 | 353(0x161, float:4.95E-43)
            short r14 = (short) r14
            r17 = 18
            byte r4 = r4[r17]
            short r4 = (short) r4
            java.lang.String r4 = setMin(r13, r14, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x072f
            r4 = 208(0xd0, float:2.91E-43)
            if (r10 < r4) goto L_0x072f
            r4 = 209(0xd1, float:2.93E-43)
            if (r10 > r4) goto L_0x072f
            goto L_0x06cc
        L_0x072f:
            byte[] r4 = length
            r13 = 3446(0xd76, float:4.829E-42)
            byte r14 = r4[r13]
            byte r13 = (byte) r14
            r14 = 436(0x1b4, float:6.11E-43)
            short r14 = (short) r14
            r17 = 5
            byte r4 = r4[r17]
            int r4 = -r4
            short r4 = (short) r4
            java.lang.String r4 = setMin(r13, r14, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0757
            r4 = 209(0xd1, float:2.93E-43)
            if (r10 < r4) goto L_0x0757
            r4 = 210(0xd2, float:2.94E-43)
            if (r10 > r4) goto L_0x0757
            goto L_0x06cc
        L_0x0757:
            byte[] r4 = length
            r8 = 3446(0xd76, float:4.829E-42)
            byte r13 = r4[r8]
            byte r8 = (byte) r13
            r13 = r8 | 3282(0xcd2, float:4.599E-42)
            short r13 = (short) r13
            byte r4 = r4[r15]
            short r4 = (short) r4
            java.lang.String r4 = setMin(r8, r13, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x077c
            r4 = 210(0xd2, float:2.94E-43)
            if (r10 < r4) goto L_0x077c
            r4 = 213(0xd5, float:2.98E-43)
            if (r10 > r4) goto L_0x077c
        L_0x077a:
            goto L_0x062e
        L_0x077c:
            byte[] r4 = length
            r8 = 3446(0xd76, float:4.829E-42)
            byte r4 = r4[r8]
            byte r4 = (byte) r4
            r8 = r4 | 514(0x202, float:7.2E-43)
            short r8 = (short) r8
            int r13 = setMin
            r14 = 2
            int r13 = r13 >>> r14
            short r13 = (short) r13
            java.lang.String r4 = setMin(r4, r8, r13)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x07a2
            r4 = 211(0xd3, float:2.96E-43)
            if (r10 < r4) goto L_0x07a2
            r4 = 213(0xd5, float:2.98E-43)
            if (r10 > r4) goto L_0x07a4
            goto L_0x077a
        L_0x07a2:
            r4 = 213(0xd5, float:2.98E-43)
        L_0x07a4:
            byte[] r8 = length
            r12 = 3446(0xd76, float:4.829E-42)
            byte r13 = r8[r12]
            byte r13 = (byte) r13
            r14 = r13 | 353(0x161, float:4.95E-43)
            short r14 = (short) r14
            r15 = 18
            byte r8 = r8[r15]
            short r8 = (short) r8
            java.lang.String r8 = setMin(r13, r14, r8)
            java.lang.Class r8 = java.lang.Class.forName(r8)
            boolean r8 = r8.isInstance(r0)
            if (r8 == 0) goto L_0x07ca
            r8 = 253(0xfd, float:3.55E-43)
            if (r10 < r8) goto L_0x07ca
            r8 = 258(0x102, float:3.62E-43)
            if (r10 > r8) goto L_0x07ca
            goto L_0x07d4
        L_0x07ca:
            r6 = 256(0x100, float:3.59E-43)
            if (r10 < r6) goto L_0x07df
            r6 = 258(0x102, float:3.62E-43)
            if (r10 > r6) goto L_0x07df
            r6 = 75
        L_0x07d4:
            r1.equals = r0
            r0 = 47
            r1.setMin(r0)
            r0 = r6
            r4 = 1
            goto L_0x0548
        L_0x07df:
            throw r0
        L_0x07e0:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x07e8
            throw r1
        L_0x07e8:
            goto L_0x07ea
        L_0x07e9:
            throw r0
        L_0x07ea:
            goto L_0x07e9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getItemPosition.setMax(id.dana.domain.model.rpc.response.LoginResponse):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03de, code lost:
        r1.setMin(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x05a8, code lost:
        if (r10 <= 60) goto L_0x0536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x061c, code lost:
        if (r10 <= 114) goto L_0x0538;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0665, code lost:
        if (r10 <= 179) goto L_0x0676;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x018d, code lost:
        r1.setMin(22);
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0348 A[Catch:{ all -> 0x033d, all -> 0x04c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0349 A[Catch:{ all -> 0x033d, all -> 0x04c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0534  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02c8 A[Catch:{ all -> 0x02b4, all -> 0x034a }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02c9 A[Catch:{ all -> 0x02b4, all -> 0x034a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setMax(java.lang.Throwable r23) {
        /*
            r22 = this;
            o.getTabIndicatorColor r1 = new o.getTabIndicatorColor
            r2 = r22
            r0 = r23
            r1.<init>(r2, r0)
            r0 = 73
            byte r0 = (byte) r0
            r3 = 1223(0x4c7, float:1.714E-42)
            short r3 = (short) r3
            r4 = 697(0x2b9, float:9.77E-43)
            short r4 = (short) r4
            java.lang.String r0 = setMin(r0, r3, r4)
            r3 = 74
            byte r3 = (byte) r3
            r4 = 398(0x18e, float:5.58E-43)
            short r4 = (short) r4
            byte[] r5 = length
            r6 = 83
            byte r5 = r5[r6]
            short r5 = (short) r5
            java.lang.String r3 = setMin(r3, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0681 }
            r7 = 0
            r5[r7] = r3     // Catch:{ all -> 0x0681 }
            byte[] r3 = length     // Catch:{ all -> 0x0681 }
            r8 = 3446(0xd76, float:4.829E-42)
            byte r3 = r3[r8]     // Catch:{ all -> 0x0681 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x0681 }
            r9 = 1332(0x534, float:1.867E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0681 }
            byte[] r10 = length     // Catch:{ all -> 0x0681 }
            r11 = 689(0x2b1, float:9.65E-43)
            byte r10 = r10[r11]     // Catch:{ all -> 0x0681 }
            short r10 = (short) r10     // Catch:{ all -> 0x0681 }
            java.lang.String r3 = setMin(r3, r9, r10)     // Catch:{ all -> 0x0681 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0681 }
            byte[] r10 = length     // Catch:{ all -> 0x0681 }
            r12 = 11
            byte r10 = r10[r12]     // Catch:{ all -> 0x0681 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0681 }
            r12 = 1537(0x601, float:2.154E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0681 }
            byte[] r13 = length     // Catch:{ all -> 0x0681 }
            r14 = 86
            byte r13 = r13[r14]     // Catch:{ all -> 0x0681 }
            short r13 = (short) r13     // Catch:{ all -> 0x0681 }
            java.lang.String r10 = setMin(r10, r12, r13)     // Catch:{ all -> 0x0681 }
            java.lang.Class[] r12 = new java.lang.Class[r4]     // Catch:{ all -> 0x0681 }
            byte[] r13 = length     // Catch:{ all -> 0x0681 }
            byte r13 = r13[r8]     // Catch:{ all -> 0x0681 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0681 }
            byte[] r15 = length     // Catch:{ all -> 0x0681 }
            byte r15 = r15[r11]     // Catch:{ all -> 0x0681 }
            short r15 = (short) r15     // Catch:{ all -> 0x0681 }
            java.lang.String r13 = setMin(r13, r9, r15)     // Catch:{ all -> 0x0681 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0681 }
            r12[r7] = r13     // Catch:{ all -> 0x0681 }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r12)     // Catch:{ all -> 0x0681 }
            java.lang.Object r0 = r3.invoke(r0, r5)     // Catch:{ all -> 0x0681 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0681 }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r5 = 0
        L_0x007f:
            int r10 = r0.length
            r12 = 113(0x71, float:1.58E-43)
            r13 = 30
            if (r5 >= r10) goto L_0x012a
            r10 = r0[r5]
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch:{ all -> 0x0121 }
            r14[r7] = r10     // Catch:{ all -> 0x0121 }
            byte[] r10 = length     // Catch:{ all -> 0x0121 }
            byte r10 = r10[r8]     // Catch:{ all -> 0x0121 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0121 }
            r15 = r10 | 1906(0x772, float:2.671E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x0121 }
            byte[] r17 = length     // Catch:{ all -> 0x0121 }
            byte r7 = r17[r12]     // Catch:{ all -> 0x0121 }
            int r7 = -r7
            short r7 = (short) r7     // Catch:{ all -> 0x0121 }
            java.lang.String r7 = setMin(r10, r15, r7)     // Catch:{ all -> 0x0121 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0121 }
            byte[] r10 = length     // Catch:{ all -> 0x0121 }
            byte r10 = r10[r6]     // Catch:{ all -> 0x0121 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0121 }
            r15 = r10 | 488(0x1e8, float:6.84E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x0121 }
            byte[] r17 = length     // Catch:{ all -> 0x0121 }
            byte r13 = r17[r13]     // Catch:{ all -> 0x0121 }
            short r13 = (short) r13     // Catch:{ all -> 0x0121 }
            java.lang.String r10 = setMin(r10, r15, r13)     // Catch:{ all -> 0x0121 }
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch:{ all -> 0x0121 }
            byte[] r15 = length     // Catch:{ all -> 0x0121 }
            byte r15 = r15[r8]     // Catch:{ all -> 0x0121 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0121 }
            byte[] r17 = length     // Catch:{ all -> 0x0121 }
            byte r6 = r17[r11]     // Catch:{ all -> 0x0121 }
            short r6 = (short) r6     // Catch:{ all -> 0x0121 }
            java.lang.String r6 = setMin(r15, r9, r6)     // Catch:{ all -> 0x0121 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x0121 }
            r15 = 0
            r13[r15] = r6     // Catch:{ all -> 0x0121 }
            java.lang.reflect.Method r6 = r7.getMethod(r10, r13)     // Catch:{ all -> 0x0121 }
            r7 = 0
            java.lang.Object r6 = r6.invoke(r7, r14)     // Catch:{ all -> 0x0121 }
            byte[] r7 = length     // Catch:{ all -> 0x0118 }
            byte r7 = r7[r8]     // Catch:{ all -> 0x0118 }
            byte r7 = (byte) r7     // Catch:{ all -> 0x0118 }
            r10 = r7 | 1906(0x772, float:2.671E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0118 }
            byte[] r13 = length     // Catch:{ all -> 0x0118 }
            byte r12 = r13[r12]     // Catch:{ all -> 0x0118 }
            int r12 = -r12
            short r12 = (short) r12     // Catch:{ all -> 0x0118 }
            java.lang.String r7 = setMin(r7, r10, r12)     // Catch:{ all -> 0x0118 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0118 }
            byte[] r10 = length     // Catch:{ all -> 0x0118 }
            r12 = 3429(0xd65, float:4.805E-42)
            byte r10 = r10[r12]     // Catch:{ all -> 0x0118 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0118 }
            r12 = 482(0x1e2, float:6.75E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0118 }
            byte[] r13 = length     // Catch:{ all -> 0x0118 }
            r14 = 9
            byte r13 = r13[r14]     // Catch:{ all -> 0x0118 }
            short r13 = (short) r13     // Catch:{ all -> 0x0118 }
            java.lang.String r10 = setMin(r10, r12, r13)     // Catch:{ all -> 0x0118 }
            r12 = 0
            java.lang.reflect.Method r7 = r7.getMethod(r10, r12)     // Catch:{ all -> 0x0118 }
            java.lang.Object r6 = r7.invoke(r6, r12)     // Catch:{ all -> 0x0118 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0118 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0118 }
            r3[r5] = r6
            int r5 = r5 + 1
            r6 = 83
            r7 = 0
            r14 = 86
            goto L_0x007f
        L_0x0118:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0120
            throw r1
        L_0x0120:
            throw r0
        L_0x0121:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0129
            throw r1
        L_0x0129:
            throw r0
        L_0x012a:
            r0 = 0
        L_0x012b:
            int r10 = r0 + 1
            r14 = 2
            r0 = r3[r0]     // Catch:{ all -> 0x04d1 }
            int r0 = r1.setMin(r0)     // Catch:{ all -> 0x04d1 }
            r15 = 18
            r12 = 22
            r7 = 3
            r5 = 40
            r6 = 17
            r13 = 21
            switch(r0) {
                case -49: goto L_0x04ae;
                case -48: goto L_0x04a5;
                case -47: goto L_0x0495;
                case -46: goto L_0x048c;
                case -45: goto L_0x0483;
                case -44: goto L_0x0473;
                case -43: goto L_0x045d;
                case -42: goto L_0x0439;
                case -41: goto L_0x042f;
                case -40: goto L_0x041e;
                case -39: goto L_0x0414;
                case -38: goto L_0x040a;
                case -37: goto L_0x03f7;
                case -36: goto L_0x03e3;
                case -35: goto L_0x03d4;
                case -34: goto L_0x03bf;
                case -33: goto L_0x03ab;
                case -32: goto L_0x03a1;
                case -31: goto L_0x0390;
                case -30: goto L_0x0386;
                case -29: goto L_0x037c;
                case -28: goto L_0x0372;
                case -27: goto L_0x0368;
                case -26: goto L_0x0357;
                case -25: goto L_0x034f;
                case -24: goto L_0x02d1;
                case -23: goto L_0x024e;
                case -22: goto L_0x0248;
                case -21: goto L_0x0242;
                case -20: goto L_0x023e;
                case -19: goto L_0x021f;
                case -18: goto L_0x021e;
                case -17: goto L_0x0216;
                case -16: goto L_0x0212;
                case -15: goto L_0x020e;
                case -14: goto L_0x020a;
                case -13: goto L_0x01f2;
                case -12: goto L_0x01a9;
                case -11: goto L_0x01a5;
                case -10: goto L_0x01a1;
                case -9: goto L_0x0191;
                case -8: goto L_0x017d;
                case -7: goto L_0x0179;
                case -6: goto L_0x0175;
                case -5: goto L_0x0171;
                case -4: goto L_0x0163;
                case -3: goto L_0x0156;
                case -2: goto L_0x014e;
                case -1: goto L_0x014a;
                default: goto L_0x0142;
            }     // Catch:{ all -> 0x04d1 }
        L_0x0142:
            r16 = 0
            r19 = 83
            r20 = 30
            goto L_0x04c8
        L_0x014a:
            r0 = 87
            goto L_0x04cb
        L_0x014e:
            int r0 = toIntRange     // Catch:{ all -> 0x04d1 }
            r1.getMax = r0     // Catch:{ all -> 0x04d1 }
            r1.setMin(r7)     // Catch:{ all -> 0x04d1 }
            goto L_0x0142
        L_0x0156:
            r1.getMax = r4     // Catch:{ all -> 0x04d1 }
            r1.setMin(r6)     // Catch:{ all -> 0x04d1 }
            r1.setMin(r15)     // Catch:{ all -> 0x04d1 }
            int r0 = r1.setMin     // Catch:{ all -> 0x04d1 }
            equals = r0     // Catch:{ all -> 0x04d1 }
            goto L_0x0142
        L_0x0163:
            r1.setMin(r5)     // Catch:{ all -> 0x04d1 }
            int r0 = r1.setMin     // Catch:{ all -> 0x04d1 }
            if (r0 != 0) goto L_0x016e
            r0 = 28
            goto L_0x04cb
        L_0x016e:
            r0 = r10
            goto L_0x04cb
        L_0x0171:
            r0 = 86
            goto L_0x04cb
        L_0x0175:
            r0 = 30
            goto L_0x04cb
        L_0x0179:
            r0 = 49
            goto L_0x04cb
        L_0x017d:
            r1.getMax = r4     // Catch:{ all -> 0x04d1 }
            r1.setMin(r6)     // Catch:{ all -> 0x04d1 }
            r1.setMin(r13)     // Catch:{ all -> 0x04d1 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x04d1 }
            o.getItemPosition r0 = (o.getItemPosition) r0     // Catch:{ all -> 0x04d1 }
            o.registerDataSetObserver$getMin r0 = r0.getMax     // Catch:{ all -> 0x04d1 }
            r1.equals = r0     // Catch:{ all -> 0x04d1 }
        L_0x018d:
            r1.setMin(r12)     // Catch:{ all -> 0x04d1 }
            goto L_0x0142
        L_0x0191:
            r1.getMax = r4     // Catch:{ all -> 0x04d1 }
            r1.setMin(r6)     // Catch:{ all -> 0x04d1 }
            r1.setMin(r13)     // Catch:{ all -> 0x04d1 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x04d1 }
            o.registerDataSetObserver$getMin r0 = (o.registerDataSetObserver.getMin) r0     // Catch:{ all -> 0x04d1 }
            r0.getMax()     // Catch:{ all -> 0x04d1 }
            goto L_0x0142
        L_0x01a1:
            r0 = 118(0x76, float:1.65E-43)
            goto L_0x04cb
        L_0x01a5:
            r0 = 53
            goto L_0x04cb
        L_0x01a9:
            r1.getMax = r4     // Catch:{ all -> 0x04d1 }
            r1.setMin(r6)     // Catch:{ all -> 0x04d1 }
            r1.setMin(r13)     // Catch:{ all -> 0x04d1 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x04d1 }
            byte[] r5 = length     // Catch:{ all -> 0x01e9 }
            byte r5 = r5[r8]     // Catch:{ all -> 0x01e9 }
            byte r5 = (byte) r5     // Catch:{ all -> 0x01e9 }
            r6 = 3927(0xf57, float:5.503E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x01e9 }
            byte[] r7 = length     // Catch:{ all -> 0x01e9 }
            byte r7 = r7[r15]     // Catch:{ all -> 0x01e9 }
            short r7 = (short) r7     // Catch:{ all -> 0x01e9 }
            java.lang.String r5 = setMin(r5, r6, r7)     // Catch:{ all -> 0x01e9 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x01e9 }
            byte[] r6 = length     // Catch:{ all -> 0x01e9 }
            byte r6 = r6[r11]     // Catch:{ all -> 0x01e9 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x01e9 }
            int r7 = setMin     // Catch:{ all -> 0x01e9 }
            r7 = r7 | 321(0x141, float:4.5E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x01e9 }
            byte[] r13 = length     // Catch:{ all -> 0x01e9 }
            r15 = 33
            byte r13 = r13[r15]     // Catch:{ all -> 0x01e9 }
            short r13 = (short) r13     // Catch:{ all -> 0x01e9 }
            java.lang.String r6 = setMin(r6, r7, r13)     // Catch:{ all -> 0x01e9 }
            r7 = 0
            java.lang.reflect.Method r5 = r5.getMethod(r6, r7)     // Catch:{ all -> 0x01e9 }
            java.lang.Object r0 = r5.invoke(r0, r7)     // Catch:{ all -> 0x01e9 }
            r1.equals = r0     // Catch:{ all -> 0x04d1 }
            goto L_0x018d
        L_0x01e9:
            r0 = move-exception
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x04d1 }
            if (r5 == 0) goto L_0x01f1
            throw r5     // Catch:{ all -> 0x04d1 }
        L_0x01f1:
            throw r0     // Catch:{ all -> 0x04d1 }
        L_0x01f2:
            r1.getMax = r14     // Catch:{ all -> 0x04d1 }
            r1.setMin(r6)     // Catch:{ all -> 0x04d1 }
            r1.setMin(r13)     // Catch:{ all -> 0x04d1 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x04d1 }
            o.registerDataSetObserver$getMin r0 = (o.registerDataSetObserver.getMin) r0     // Catch:{ all -> 0x04d1 }
            r1.setMin(r13)     // Catch:{ all -> 0x04d1 }
            java.lang.Object r5 = r1.isInside     // Catch:{ all -> 0x04d1 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x04d1 }
            r0.onError(r5)     // Catch:{ all -> 0x04d1 }
            goto L_0x0142
        L_0x020a:
            r0 = 138(0x8a, float:1.93E-43)
            goto L_0x04cb
        L_0x020e:
            r0 = 172(0xac, float:2.41E-43)
            goto L_0x04cb
        L_0x0212:
            r0 = 114(0x72, float:1.6E-43)
            goto L_0x04cb
        L_0x0216:
            r1.setMin(r14)     // Catch:{ all -> 0x04d1 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x04d1 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x04d1 }
            throw r0     // Catch:{ all -> 0x04d1 }
        L_0x021e:
            return
        L_0x021f:
            r1.getMax = r7     // Catch:{ all -> 0x04d1 }
            r1.setMin(r6)     // Catch:{ all -> 0x04d1 }
            r1.setMin(r13)     // Catch:{ all -> 0x04d1 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x04d1 }
            o.getItemPosition r0 = (o.getItemPosition) r0     // Catch:{ all -> 0x04d1 }
            r1.setMin(r13)     // Catch:{ all -> 0x04d1 }
            java.lang.Object r5 = r1.isInside     // Catch:{ all -> 0x04d1 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x04d1 }
            r1.setMin(r13)     // Catch:{ all -> 0x04d1 }
            java.lang.Object r6 = r1.isInside     // Catch:{ all -> 0x04d1 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x04d1 }
            r0.length((java.lang.String) r5, (java.lang.Throwable) r6)     // Catch:{ all -> 0x04d1 }
            goto L_0x0142
        L_0x023e:
            r0 = 59
            goto L_0x04cb
        L_0x0242:
            java.lang.String r0 = "DanaLogin"
            r1.equals = r0     // Catch:{ all -> 0x04d1 }
            goto L_0x018d
        L_0x0248:
            java.lang.String r0 = "[HoldLogin] login error: "
            r1.equals = r0     // Catch:{ all -> 0x04d1 }
            goto L_0x018d
        L_0x024e:
            r1.getMax = r4     // Catch:{ all -> 0x02ca }
            r1.setMin(r6)     // Catch:{ all -> 0x02ca }
            r1.setMin(r13)     // Catch:{ all -> 0x02ca }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x02ca }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x02bc }
            r6 = 0
            r5[r6] = r0     // Catch:{ all -> 0x02bc }
            byte[] r0 = length     // Catch:{ all -> 0x02bc }
            byte r0 = r0[r8]     // Catch:{ all -> 0x02bc }
            byte r0 = (byte) r0     // Catch:{ all -> 0x02bc }
            byte[] r6 = length     // Catch:{ all -> 0x02bc }
            byte r6 = r6[r11]     // Catch:{ all -> 0x02bc }
            short r6 = (short) r6     // Catch:{ all -> 0x02bc }
            java.lang.String r0 = setMin(r0, r9, r6)     // Catch:{ all -> 0x02bc }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x02bc }
            byte[] r6 = length     // Catch:{ all -> 0x02bc }
            r19 = 83
            byte r6 = r6[r19]     // Catch:{ all -> 0x02b9 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x02b9 }
            r7 = r6 | 488(0x1e8, float:6.84E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x02b9 }
            byte[] r13 = length     // Catch:{ all -> 0x02b9 }
            r20 = 30
            byte r13 = r13[r20]     // Catch:{ all -> 0x02b6 }
            short r13 = (short) r13     // Catch:{ all -> 0x02b6 }
            java.lang.String r6 = setMin(r6, r7, r13)     // Catch:{ all -> 0x02b6 }
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ all -> 0x02b6 }
            byte[] r13 = length     // Catch:{ all -> 0x02b6 }
            byte r13 = r13[r8]     // Catch:{ all -> 0x02b6 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x02b6 }
            byte[] r15 = length     // Catch:{ all -> 0x02b6 }
            r21 = 2047(0x7ff, float:2.868E-42)
            byte r15 = r15[r21]     // Catch:{ all -> 0x02b6 }
            short r15 = (short) r15     // Catch:{ all -> 0x02b6 }
            byte[] r21 = length     // Catch:{ all -> 0x02b6 }
            byte r8 = r21[r11]     // Catch:{ all -> 0x02b6 }
            short r8 = (short) r8     // Catch:{ all -> 0x02b6 }
            java.lang.String r8 = setMin(r13, r15, r8)     // Catch:{ all -> 0x02b6 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x02b6 }
            r13 = 0
            r7[r13] = r8     // Catch:{ all -> 0x02b6 }
            java.lang.reflect.Method r0 = r0.getMethod(r6, r7)     // Catch:{ all -> 0x02b6 }
            r8 = 0
            java.lang.Object r0 = r0.invoke(r8, r5)     // Catch:{ all -> 0x02b4 }
            r1.equals = r0     // Catch:{ all -> 0x034a }
            r1.setMin(r12)     // Catch:{ all -> 0x034a }
            r16 = 0
            goto L_0x04c8
        L_0x02b4:
            r0 = move-exception
            goto L_0x02c2
        L_0x02b6:
            r0 = move-exception
            r8 = 0
            goto L_0x02c2
        L_0x02b9:
            r0 = move-exception
            r8 = 0
            goto L_0x02c0
        L_0x02bc:
            r0 = move-exception
            r8 = 0
            r19 = 83
        L_0x02c0:
            r20 = 30
        L_0x02c2:
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x034a }
            if (r5 == 0) goto L_0x02c9
            throw r5     // Catch:{ all -> 0x034a }
        L_0x02c9:
            throw r0     // Catch:{ all -> 0x034a }
        L_0x02ca:
            r0 = move-exception
            r19 = 83
            r20 = 30
            goto L_0x034b
        L_0x02d1:
            r8 = 0
            r19 = 83
            r20 = 30
            r1.getMax = r14     // Catch:{ all -> 0x034a }
            r1.setMin(r6)     // Catch:{ all -> 0x034a }
            r1.setMin(r13)     // Catch:{ all -> 0x034a }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x034a }
            r1.setMin(r13)     // Catch:{ all -> 0x034a }
            java.lang.Object r5 = r1.isInside     // Catch:{ all -> 0x034a }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x033f }
            r7 = 0
            r6[r7] = r5     // Catch:{ all -> 0x033f }
            byte[] r5 = length     // Catch:{ all -> 0x033f }
            r7 = 3446(0xd76, float:4.829E-42)
            byte r5 = r5[r7]     // Catch:{ all -> 0x033f }
            byte r5 = (byte) r5     // Catch:{ all -> 0x033f }
            byte[] r7 = length     // Catch:{ all -> 0x033f }
            byte r7 = r7[r11]     // Catch:{ all -> 0x033f }
            short r7 = (short) r7     // Catch:{ all -> 0x033f }
            java.lang.String r5 = setMin(r5, r9, r7)     // Catch:{ all -> 0x033f }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x033f }
            byte[] r7 = length     // Catch:{ all -> 0x033f }
            r13 = 661(0x295, float:9.26E-43)
            byte r7 = r7[r13]     // Catch:{ all -> 0x033f }
            int r7 = -r7
            byte r7 = (byte) r7     // Catch:{ all -> 0x033f }
            r13 = r7 | 392(0x188, float:5.5E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x033f }
            byte[] r15 = length     // Catch:{ all -> 0x033f }
            r16 = 4
            byte r15 = r15[r16]     // Catch:{ all -> 0x033f }
            short r15 = (short) r15     // Catch:{ all -> 0x033f }
            java.lang.String r7 = setMin(r7, r13, r15)     // Catch:{ all -> 0x033f }
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch:{ all -> 0x033f }
            byte[] r15 = length     // Catch:{ all -> 0x033f }
            r16 = 3446(0xd76, float:4.829E-42)
            byte r15 = r15[r16]     // Catch:{ all -> 0x033f }
            byte r15 = (byte) r15     // Catch:{ all -> 0x033f }
            byte[] r16 = length     // Catch:{ all -> 0x033f }
            byte r8 = r16[r11]     // Catch:{ all -> 0x033f }
            short r8 = (short) r8     // Catch:{ all -> 0x033f }
            java.lang.String r8 = setMin(r15, r9, r8)     // Catch:{ all -> 0x033f }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x033f }
            r16 = 0
            r13[r16] = r8     // Catch:{ all -> 0x033d }
            java.lang.reflect.Method r5 = r5.getMethod(r7, r13)     // Catch:{ all -> 0x033d }
            java.lang.Object r0 = r5.invoke(r0, r6)     // Catch:{ all -> 0x033d }
            r1.equals = r0     // Catch:{ all -> 0x04c6 }
            r1.setMin(r12)     // Catch:{ all -> 0x04c6 }
            goto L_0x04c8
        L_0x033d:
            r0 = move-exception
            goto L_0x0342
        L_0x033f:
            r0 = move-exception
            r16 = 0
        L_0x0342:
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x04c6 }
            if (r5 == 0) goto L_0x0349
            throw r5     // Catch:{ all -> 0x04c6 }
        L_0x0349:
            throw r0     // Catch:{ all -> 0x04c6 }
        L_0x034a:
            r0 = move-exception
        L_0x034b:
            r16 = 0
            goto L_0x04d8
        L_0x034f:
            r19 = 83
            r20 = 30
            r0 = 179(0xb3, float:2.51E-43)
            goto L_0x04cb
        L_0x0357:
            r16 = 0
            r19 = 83
            r20 = 30
            r1.setMin(r5)     // Catch:{ all -> 0x04c6 }
            int r0 = r1.setMin     // Catch:{ all -> 0x04c6 }
            if (r0 != 0) goto L_0x04c8
            r0 = 85
            goto L_0x04c9
        L_0x0368:
            r16 = 0
            r19 = 83
            r20 = 30
            r0 = 170(0xaa, float:2.38E-43)
            goto L_0x04c9
        L_0x0372:
            r16 = 0
            r19 = 83
            r20 = 30
            r0 = 93
            goto L_0x04c9
        L_0x037c:
            r16 = 0
            r19 = 83
            r20 = 30
            r0 = 95
            goto L_0x04c9
        L_0x0386:
            r16 = 0
            r19 = 83
            r20 = 30
            r0 = 117(0x75, float:1.64E-43)
            goto L_0x04c9
        L_0x0390:
            r16 = 0
            r19 = 83
            r20 = 30
            r1.setMin(r5)     // Catch:{ all -> 0x04c6 }
            int r0 = r1.setMin     // Catch:{ all -> 0x04c6 }
            if (r0 != 0) goto L_0x04c8
            r0 = 113(0x71, float:1.58E-43)
            goto L_0x04c9
        L_0x03a1:
            r16 = 0
            r19 = 83
            r20 = 30
            r0 = 34
            goto L_0x04c9
        L_0x03ab:
            r16 = 0
            r19 = 83
            r20 = 30
            r1.setMin(r4)     // Catch:{ all -> 0x04c6 }
            int r0 = r1.setMin     // Catch:{ all -> 0x04c6 }
            if (r0 == 0) goto L_0x03bc
            r0 = 35
            goto L_0x04c9
        L_0x03bc:
            r0 = 1
            goto L_0x04c9
        L_0x03bf:
            r16 = 0
            r19 = 83
            r20 = 30
            r1.setMin(r4)     // Catch:{ all -> 0x04c6 }
            int r0 = r1.setMin     // Catch:{ all -> 0x04c6 }
            if (r0 == 0) goto L_0x03d0
            r0 = 198(0xc6, float:2.77E-43)
            goto L_0x04c9
        L_0x03d0:
            r0 = 47
            goto L_0x04c9
        L_0x03d4:
            r16 = 0
            r19 = 83
            r20 = 30
            int r0 = equals     // Catch:{ all -> 0x04c6 }
            r1.getMax = r0     // Catch:{ all -> 0x04c6 }
        L_0x03de:
            r1.setMin(r7)     // Catch:{ all -> 0x04c6 }
            goto L_0x04c8
        L_0x03e3:
            r16 = 0
            r19 = 83
            r20 = 30
            r1.getMax = r4     // Catch:{ all -> 0x04c6 }
            r1.setMin(r6)     // Catch:{ all -> 0x04c6 }
            r1.setMin(r15)     // Catch:{ all -> 0x04c6 }
            int r0 = r1.setMin     // Catch:{ all -> 0x04c6 }
            toIntRange = r0     // Catch:{ all -> 0x04c6 }
            goto L_0x04c8
        L_0x03f7:
            r16 = 0
            r19 = 83
            r20 = 30
            r0 = 19
            r1.setMin(r0)     // Catch:{ all -> 0x04c6 }
            int r0 = r1.setMin     // Catch:{ all -> 0x04c6 }
            if (r0 != 0) goto L_0x04c8
            r0 = 137(0x89, float:1.92E-43)
            goto L_0x04c9
        L_0x040a:
            r16 = 0
            r19 = 83
            r20 = 30
            r0 = 169(0xa9, float:2.37E-43)
            goto L_0x04c9
        L_0x0414:
            r16 = 0
            r19 = 83
            r20 = 30
            r0 = 91
            goto L_0x04c9
        L_0x041e:
            r16 = 0
            r19 = 83
            r20 = 30
            r1.setMin(r5)     // Catch:{ all -> 0x04c6 }
            int r0 = r1.setMin     // Catch:{ all -> 0x04c6 }
            if (r0 != 0) goto L_0x04c8
            r0 = 168(0xa8, float:2.35E-43)
            goto L_0x04c9
        L_0x042f:
            r16 = 0
            r19 = 83
            r20 = 30
            r0 = 29
            goto L_0x04c9
        L_0x0439:
            r16 = 0
            r19 = 83
            r20 = 30
            r1.getMax = r7     // Catch:{ all -> 0x04c6 }
            r1.setMin(r6)     // Catch:{ all -> 0x04c6 }
            r1.setMin(r13)     // Catch:{ all -> 0x04c6 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x04c6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x04c6 }
            r1.setMin(r13)     // Catch:{ all -> 0x04c6 }
            java.lang.Object r5 = r1.isInside     // Catch:{ all -> 0x04c6 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x04c6 }
            r1.setMin(r13)     // Catch:{ all -> 0x04c6 }
            java.lang.Object r6 = r1.isInside     // Catch:{ all -> 0x04c6 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x04c6 }
            o.setStateOff.length(r0, r5, r6)     // Catch:{ all -> 0x04c6 }
            goto L_0x04c8
        L_0x045d:
            r16 = 0
            r19 = 83
            r20 = 30
            r1.getMax = r4     // Catch:{ all -> 0x04c6 }
            r1.setMin(r6)     // Catch:{ all -> 0x04c6 }
            r1.setMin(r13)     // Catch:{ all -> 0x04c6 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x04c6 }
            boolean r0 = r0 instanceof id.dana.data.login.source.network.HoldLoginException     // Catch:{ all -> 0x04c6 }
            r1.getMax = r0     // Catch:{ all -> 0x04c6 }
            goto L_0x03de
        L_0x0473:
            r16 = 0
            r19 = 83
            r20 = 30
            r1.setMin(r5)     // Catch:{ all -> 0x04c6 }
            int r0 = r1.setMin     // Catch:{ all -> 0x04c6 }
            if (r0 != 0) goto L_0x04c8
            r0 = 178(0xb2, float:2.5E-43)
            goto L_0x04c9
        L_0x0483:
            r16 = 0
            r19 = 83
            r20 = 30
            r0 = 44
            goto L_0x04c9
        L_0x048c:
            r16 = 0
            r19 = 83
            r20 = 30
            r0 = 115(0x73, float:1.61E-43)
            goto L_0x04c9
        L_0x0495:
            r16 = 0
            r19 = 83
            r20 = 30
            r1.setMin(r5)     // Catch:{ all -> 0x04c6 }
            int r0 = r1.setMin     // Catch:{ all -> 0x04c6 }
            if (r0 != 0) goto L_0x04c8
            r0 = 197(0xc5, float:2.76E-43)
            goto L_0x04c9
        L_0x04a5:
            r16 = 0
            r19 = 83
            r20 = 30
            r0 = 43
            goto L_0x04c9
        L_0x04ae:
            r16 = 0
            r19 = 83
            r20 = 30
            r1.getMax = r4     // Catch:{ all -> 0x04c6 }
            r1.setMin(r6)     // Catch:{ all -> 0x04c6 }
            r1.setMin(r13)     // Catch:{ all -> 0x04c6 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x04c6 }
            int r0 = super.hashCode()     // Catch:{ all -> 0x04c6 }
            r1.getMax = r0     // Catch:{ all -> 0x04c6 }
            goto L_0x03de
        L_0x04c6:
            r0 = move-exception
            goto L_0x04d8
        L_0x04c8:
            r0 = r10
        L_0x04c9:
            r8 = 3446(0xd76, float:4.829E-42)
        L_0x04cb:
            r12 = 113(0x71, float:1.58E-43)
            r13 = 30
            goto L_0x012b
        L_0x04d1:
            r0 = move-exception
            r16 = 0
            r19 = 83
            r20 = 30
        L_0x04d8:
            byte[] r5 = length
            r6 = 3446(0xd76, float:4.829E-42)
            byte r7 = r5[r6]
            byte r6 = (byte) r7
            r7 = 466(0x1d2, float:6.53E-43)
            short r7 = (short) r7
            r8 = 3527(0xdc7, float:4.942E-42)
            byte r5 = r5[r8]
            int r5 = r5 + r4
            short r5 = (short) r5
            java.lang.String r5 = setMin(r6, r7, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            r6 = 90
            r12 = 52
            if (r5 == 0) goto L_0x050e
            r5 = 53
            if (r10 < r5) goto L_0x050e
            r5 = 54
            if (r10 > r5) goto L_0x050e
        L_0x0502:
            r5 = 59
        L_0x0504:
            r6 = 114(0x72, float:1.6E-43)
            r7 = 179(0xb3, float:2.51E-43)
            r12 = 90
        L_0x050a:
            r14 = 3446(0xd76, float:4.829E-42)
            goto L_0x0676
        L_0x050e:
            byte[] r5 = length
            r13 = 3446(0xd76, float:4.829E-42)
            byte r15 = r5[r13]
            byte r13 = (byte) r15
            r15 = 436(0x1b4, float:6.11E-43)
            short r15 = (short) r15
            r18 = 5
            byte r5 = r5[r18]
            int r5 = -r5
            short r5 = (short) r5
            java.lang.String r5 = setMin(r13, r15, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x053b
            r5 = 54
            if (r10 < r5) goto L_0x053b
            r5 = 55
            if (r10 > r5) goto L_0x053b
            r5 = 59
        L_0x0536:
            r6 = 114(0x72, float:1.6E-43)
        L_0x0538:
            r7 = 179(0xb3, float:2.51E-43)
            goto L_0x050a
        L_0x053b:
            byte[] r5 = length
            r13 = 3446(0xd76, float:4.829E-42)
            byte r5 = r5[r13]
            byte r5 = (byte) r5
            r13 = r5 | 514(0x202, float:7.2E-43)
            short r13 = (short) r13
            int r15 = setMin
            int r14 = r15 >>> 2
            short r14 = (short) r14
            java.lang.String r5 = setMin(r5, r13, r14)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0561
            r5 = 56
            if (r10 < r5) goto L_0x0561
            r5 = 59
            if (r10 > r5) goto L_0x0561
        L_0x0560:
            goto L_0x0536
        L_0x0561:
            byte[] r5 = length
            r13 = 3446(0xd76, float:4.829E-42)
            byte r14 = r5[r13]
            byte r13 = (byte) r14
            r14 = r13 | 3248(0xcb0, float:4.551E-42)
            short r14 = (short) r14
            byte r5 = r5[r8]
            int r5 = r5 + r4
            short r5 = (short) r5
            java.lang.String r5 = setMin(r13, r14, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0587
            r5 = 57
            if (r10 < r5) goto L_0x0587
            r5 = 58
            if (r10 > r5) goto L_0x0587
            goto L_0x0502
        L_0x0587:
            byte[] r5 = length
            r13 = 3446(0xd76, float:4.829E-42)
            byte r14 = r5[r13]
            byte r13 = (byte) r14
            r14 = 692(0x2b4, float:9.7E-43)
            byte r5 = r5[r14]
            short r5 = (short) r5
            short r14 = (short) r5
            java.lang.String r5 = setMin(r13, r5, r14)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x05ab
            r5 = 59
            if (r10 < r5) goto L_0x05ad
            r13 = 60
            if (r10 > r13) goto L_0x05ad
            goto L_0x0560
        L_0x05ab:
            r5 = 59
        L_0x05ad:
            byte[] r13 = length
            r14 = 3446(0xd76, float:4.829E-42)
            byte r15 = r13[r14]
            byte r14 = (byte) r15
            r15 = 692(0x2b4, float:9.7E-43)
            byte r13 = r13[r15]
            short r13 = (short) r13
            short r15 = (short) r13
            java.lang.String r13 = setMin(r14, r13, r15)
            java.lang.Class r13 = java.lang.Class.forName(r13)
            boolean r13 = r13.isInstance(r0)
            if (r13 == 0) goto L_0x05d2
            r13 = 80
            if (r10 < r13) goto L_0x05d2
            r13 = 81
            if (r10 > r13) goto L_0x05d2
            goto L_0x0504
        L_0x05d2:
            byte[] r6 = length
            r13 = 3446(0xd76, float:4.829E-42)
            byte r14 = r6[r13]
            byte r13 = (byte) r14
            r14 = r13 | 386(0x182, float:5.41E-43)
            short r14 = (short) r14
            r15 = 654(0x28e, float:9.16E-43)
            byte r6 = r6[r15]
            short r6 = (short) r6
            java.lang.String r6 = setMin(r13, r14, r6)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x05f9
            r6 = 95
            if (r10 < r6) goto L_0x05f9
            r6 = 114(0x72, float:1.6E-43)
            if (r10 > r6) goto L_0x05f9
        L_0x05f7:
            goto L_0x0538
        L_0x05f9:
            byte[] r6 = length
            r13 = 3446(0xd76, float:4.829E-42)
            byte r14 = r6[r13]
            byte r13 = (byte) r14
            r14 = r13 | 3282(0xcd2, float:4.599E-42)
            short r14 = (short) r14
            r15 = 3917(0xf4d, float:5.489E-42)
            byte r6 = r6[r15]
            short r6 = (short) r6
            java.lang.String r6 = setMin(r13, r14, r6)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x061f
            r6 = 108(0x6c, float:1.51E-43)
            if (r10 < r6) goto L_0x061f
            r6 = 114(0x72, float:1.6E-43)
            if (r10 > r6) goto L_0x0621
            goto L_0x05f7
        L_0x061f:
            r6 = 114(0x72, float:1.6E-43)
        L_0x0621:
            byte[] r13 = length
            r14 = 3446(0xd76, float:4.829E-42)
            byte r15 = r13[r14]
            byte r14 = (byte) r15
            r15 = r14 | 3248(0xcb0, float:4.551E-42)
            short r15 = (short) r15
            byte r13 = r13[r8]
            int r13 = r13 + r4
            short r13 = (short) r13
            java.lang.String r13 = setMin(r14, r15, r13)
            java.lang.Class r13 = java.lang.Class.forName(r13)
            boolean r13 = r13.isInstance(r0)
            if (r13 == 0) goto L_0x0646
            r13 = 173(0xad, float:2.42E-43)
            if (r10 < r13) goto L_0x0646
            r13 = 179(0xb3, float:2.51E-43)
            if (r10 > r13) goto L_0x0646
            goto L_0x05f7
        L_0x0646:
            byte[] r13 = length
            r14 = 3446(0xd76, float:4.829E-42)
            byte r15 = r13[r14]
            byte r15 = (byte) r15
            byte r8 = r13[r8]
            int r8 = r8 + r4
            short r8 = (short) r8
            java.lang.String r7 = setMin(r15, r7, r8)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            boolean r7 = r7.isInstance(r0)
            if (r7 == 0) goto L_0x0668
            r7 = 175(0xaf, float:2.45E-43)
            if (r10 < r7) goto L_0x0668
            r7 = 179(0xb3, float:2.51E-43)
            if (r10 > r7) goto L_0x066a
            goto L_0x0676
        L_0x0668:
            r7 = 179(0xb3, float:2.51E-43)
        L_0x066a:
            r8 = 199(0xc7, float:2.79E-43)
            if (r10 < r8) goto L_0x0680
            r8 = 203(0xcb, float:2.84E-43)
            if (r10 > r8) goto L_0x0680
            r8 = 46
            r12 = 46
        L_0x0676:
            r1.equals = r0
            r0 = 47
            r1.setMin(r0)
            r0 = r12
            goto L_0x04c9
        L_0x0680:
            throw r0
        L_0x0681:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0689
            throw r1
        L_0x0689:
            goto L_0x068b
        L_0x068a:
            throw r0
        L_0x068b:
            goto L_0x068a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getItemPosition.setMax(java.lang.Throwable):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(short r6, short r7, short r8) {
        /*
            int r8 = r8 + 1
            int r7 = 3931 - r7
            byte[] r0 = length
            int r6 = 118 - r6
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0014
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            goto L_0x002a
        L_0x0014:
            r3 = 0
        L_0x0015:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L_0x0020
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0020:
            int r3 = r3 + 1
            byte r4 = r0[r7]
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L_0x002a:
            int r8 = -r8
            int r6 = r6 + r8
            int r7 = r7 + 1
            int r6 = r6 + -4
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getItemPosition.setMin(short, short, short):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x014c, code lost:
        r1.setMin(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01a3, code lost:
        r1.setMin(22);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setMin() {
        /*
            r19 = this;
            o.getTabIndicatorColor r1 = new o.getTabIndicatorColor
            r2 = r19
            r1.<init>(r2)
            r0 = 73
            byte r0 = (byte) r0
            r3 = r0 | 1460(0x5b4, float:2.046E-42)
            short r3 = (short) r3
            r4 = r3 & 715(0x2cb, float:1.002E-42)
            short r4 = (short) r4
            java.lang.String r0 = setMin(r0, r3, r4)
            r3 = 74
            byte r3 = (byte) r3
            r4 = 398(0x18e, float:5.58E-43)
            short r4 = (short) r4
            byte[] r5 = length
            r6 = 83
            byte r5 = r5[r6]
            short r5 = (short) r5
            java.lang.String r3 = setMin(r3, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x02ea }
            r7 = 0
            r5[r7] = r3     // Catch:{ all -> 0x02ea }
            byte[] r3 = length     // Catch:{ all -> 0x02ea }
            r8 = 3446(0xd76, float:4.829E-42)
            byte r3 = r3[r8]     // Catch:{ all -> 0x02ea }
            byte r3 = (byte) r3     // Catch:{ all -> 0x02ea }
            r9 = 1332(0x534, float:1.867E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x02ea }
            byte[] r10 = length     // Catch:{ all -> 0x02ea }
            r11 = 689(0x2b1, float:9.65E-43)
            byte r10 = r10[r11]     // Catch:{ all -> 0x02ea }
            short r10 = (short) r10     // Catch:{ all -> 0x02ea }
            java.lang.String r3 = setMin(r3, r9, r10)     // Catch:{ all -> 0x02ea }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x02ea }
            byte[] r10 = length     // Catch:{ all -> 0x02ea }
            r12 = 11
            byte r10 = r10[r12]     // Catch:{ all -> 0x02ea }
            byte r10 = (byte) r10     // Catch:{ all -> 0x02ea }
            r12 = 1537(0x601, float:2.154E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x02ea }
            byte[] r13 = length     // Catch:{ all -> 0x02ea }
            r14 = 86
            byte r13 = r13[r14]     // Catch:{ all -> 0x02ea }
            short r13 = (short) r13     // Catch:{ all -> 0x02ea }
            java.lang.String r10 = setMin(r10, r12, r13)     // Catch:{ all -> 0x02ea }
            java.lang.Class[] r12 = new java.lang.Class[r4]     // Catch:{ all -> 0x02ea }
            byte[] r13 = length     // Catch:{ all -> 0x02ea }
            byte r13 = r13[r8]     // Catch:{ all -> 0x02ea }
            byte r13 = (byte) r13     // Catch:{ all -> 0x02ea }
            byte[] r14 = length     // Catch:{ all -> 0x02ea }
            byte r14 = r14[r11]     // Catch:{ all -> 0x02ea }
            short r14 = (short) r14     // Catch:{ all -> 0x02ea }
            java.lang.String r13 = setMin(r13, r9, r14)     // Catch:{ all -> 0x02ea }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x02ea }
            r12[r7] = r13     // Catch:{ all -> 0x02ea }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r12)     // Catch:{ all -> 0x02ea }
            java.lang.Object r0 = r3.invoke(r0, r5)     // Catch:{ all -> 0x02ea }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x02ea }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r5 = 0
        L_0x007d:
            int r10 = r0.length
            if (r5 >= r10) goto L_0x0125
            r10 = r0[r5]
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ all -> 0x011c }
            r12[r7] = r10     // Catch:{ all -> 0x011c }
            byte[] r10 = length     // Catch:{ all -> 0x011c }
            byte r10 = r10[r8]     // Catch:{ all -> 0x011c }
            byte r10 = (byte) r10     // Catch:{ all -> 0x011c }
            r13 = r10 | 1906(0x772, float:2.671E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x011c }
            byte[] r14 = length     // Catch:{ all -> 0x011c }
            r15 = 113(0x71, float:1.58E-43)
            byte r14 = r14[r15]     // Catch:{ all -> 0x011c }
            int r14 = -r14
            short r14 = (short) r14     // Catch:{ all -> 0x011c }
            java.lang.String r10 = setMin(r10, r13, r14)     // Catch:{ all -> 0x011c }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x011c }
            byte[] r13 = length     // Catch:{ all -> 0x011c }
            byte r13 = r13[r6]     // Catch:{ all -> 0x011c }
            byte r13 = (byte) r13     // Catch:{ all -> 0x011c }
            r14 = r13 | 488(0x1e8, float:6.84E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x011c }
            byte[] r15 = length     // Catch:{ all -> 0x011c }
            r16 = 30
            byte r15 = r15[r16]     // Catch:{ all -> 0x011c }
            short r15 = (short) r15     // Catch:{ all -> 0x011c }
            java.lang.String r13 = setMin(r13, r14, r15)     // Catch:{ all -> 0x011c }
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x011c }
            byte[] r15 = length     // Catch:{ all -> 0x011c }
            byte r15 = r15[r8]     // Catch:{ all -> 0x011c }
            byte r15 = (byte) r15     // Catch:{ all -> 0x011c }
            byte[] r16 = length     // Catch:{ all -> 0x011c }
            byte r6 = r16[r11]     // Catch:{ all -> 0x011c }
            short r6 = (short) r6     // Catch:{ all -> 0x011c }
            java.lang.String r6 = setMin(r15, r9, r6)     // Catch:{ all -> 0x011c }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x011c }
            r14[r7] = r6     // Catch:{ all -> 0x011c }
            java.lang.reflect.Method r6 = r10.getMethod(r13, r14)     // Catch:{ all -> 0x011c }
            r10 = 0
            java.lang.Object r6 = r6.invoke(r10, r12)     // Catch:{ all -> 0x011c }
            byte[] r12 = length     // Catch:{ all -> 0x0113 }
            byte r12 = r12[r8]     // Catch:{ all -> 0x0113 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0113 }
            r13 = r12 | 1906(0x772, float:2.671E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0113 }
            byte[] r14 = length     // Catch:{ all -> 0x0113 }
            r15 = 113(0x71, float:1.58E-43)
            byte r14 = r14[r15]     // Catch:{ all -> 0x0113 }
            int r14 = -r14
            short r14 = (short) r14     // Catch:{ all -> 0x0113 }
            java.lang.String r12 = setMin(r12, r13, r14)     // Catch:{ all -> 0x0113 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0113 }
            byte[] r13 = length     // Catch:{ all -> 0x0113 }
            r14 = 3429(0xd65, float:4.805E-42)
            byte r13 = r13[r14]     // Catch:{ all -> 0x0113 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0113 }
            r14 = 482(0x1e2, float:6.75E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0113 }
            byte[] r15 = length     // Catch:{ all -> 0x0113 }
            r16 = 9
            byte r15 = r15[r16]     // Catch:{ all -> 0x0113 }
            short r15 = (short) r15     // Catch:{ all -> 0x0113 }
            java.lang.String r13 = setMin(r13, r14, r15)     // Catch:{ all -> 0x0113 }
            java.lang.reflect.Method r12 = r12.getMethod(r13, r10)     // Catch:{ all -> 0x0113 }
            java.lang.Object r6 = r12.invoke(r6, r10)     // Catch:{ all -> 0x0113 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0113 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0113 }
            r3[r5] = r6
            int r5 = r5 + 1
            r6 = 83
            goto L_0x007d
        L_0x0113:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011b
            throw r1
        L_0x011b:
            throw r0
        L_0x011c:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0124
            throw r1
        L_0x0124:
            throw r0
        L_0x0125:
            r5 = 39
            r9 = 3
        L_0x0128:
            int r10 = r7 + 1
            r11 = 18
            r12 = 45
            r13 = 40
            r0 = r3[r7]     // Catch:{ all -> 0x01dc }
            int r0 = r1.setMin(r0)     // Catch:{ all -> 0x01dc }
            r7 = 22
            r14 = 2
            r15 = 21
            r6 = 17
            switch(r0) {
                case -19: goto L_0x01d6;
                case -18: goto L_0x01d2;
                case -17: goto L_0x01c5;
                case -16: goto L_0x01c1;
                case -15: goto L_0x01ac;
                case -14: goto L_0x01a7;
                case -13: goto L_0x019f;
                case -12: goto L_0x018d;
                case -11: goto L_0x018b;
                case -10: goto L_0x018a;
                case -9: goto L_0x0179;
                case -8: goto L_0x0171;
                case -7: goto L_0x016e;
                case -6: goto L_0x016b;
                case -5: goto L_0x015f;
                case -4: goto L_0x0151;
                case -3: goto L_0x0148;
                case -2: goto L_0x0145;
                case -1: goto L_0x0142;
                default: goto L_0x0140;
            }     // Catch:{ all -> 0x01dc }
        L_0x0140:
            goto L_0x01d9
        L_0x0142:
            r7 = 33
            goto L_0x0128
        L_0x0145:
            r7 = 38
            goto L_0x0128
        L_0x0148:
            int r0 = toIntRange     // Catch:{ all -> 0x01dc }
            r1.getMax = r0     // Catch:{ all -> 0x01dc }
        L_0x014c:
            r1.setMin(r9)     // Catch:{ all -> 0x01dc }
            goto L_0x01d9
        L_0x0151:
            r1.getMax = r4     // Catch:{ all -> 0x01dc }
            r1.setMin(r6)     // Catch:{ all -> 0x01dc }
            r1.setMin(r11)     // Catch:{ all -> 0x01dc }
            int r0 = r1.setMin     // Catch:{ all -> 0x01dc }
            equals = r0     // Catch:{ all -> 0x01dc }
            goto L_0x01d9
        L_0x015f:
            r1.setMin(r13)     // Catch:{ all -> 0x01dc }
            int r0 = r1.setMin     // Catch:{ all -> 0x01dc }
            if (r0 != 0) goto L_0x01d9
            r0 = 23
            r7 = 23
            goto L_0x0128
        L_0x016b:
            r7 = 60
            goto L_0x0128
        L_0x016e:
            r7 = 39
            goto L_0x0128
        L_0x0171:
            r1.setMin(r14)     // Catch:{ all -> 0x01dc }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x01dc }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01dc }
            throw r0     // Catch:{ all -> 0x01dc }
        L_0x0179:
            r1.getMax = r4     // Catch:{ all -> 0x01dc }
            r1.setMin(r6)     // Catch:{ all -> 0x01dc }
            r1.setMin(r15)     // Catch:{ all -> 0x01dc }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x01dc }
            int r0 = super.hashCode()     // Catch:{ all -> 0x01dc }
            r1.getMax = r0     // Catch:{ all -> 0x01dc }
            goto L_0x014c
        L_0x018a:
            return
        L_0x018b:
            r7 = 3
            goto L_0x0128
        L_0x018d:
            r1.setMin(r4)     // Catch:{ all -> 0x01dc }
            int r0 = r1.setMin     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x019c
            if (r0 == r4) goto L_0x0197
            goto L_0x019c
        L_0x0197:
            r0 = 27
            r7 = 27
            goto L_0x0128
        L_0x019c:
            r7 = 45
            goto L_0x0128
        L_0x019f:
            java.lang.String r0 = "Password,OTP SMS"
            r1.equals = r0     // Catch:{ all -> 0x01dc }
        L_0x01a3:
            r1.setMin(r7)     // Catch:{ all -> 0x01dc }
            goto L_0x01d9
        L_0x01a7:
            java.lang.String r0 = "login_challenge_type"
            r1.equals = r0     // Catch:{ all -> 0x01dc }
            goto L_0x01a3
        L_0x01ac:
            r1.getMax = r14     // Catch:{ all -> 0x01dc }
            r1.setMin(r6)     // Catch:{ all -> 0x01dc }
            r1.setMin(r15)     // Catch:{ all -> 0x01dc }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x01dc }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01dc }
            r1.setMin(r15)     // Catch:{ all -> 0x01dc }
            java.lang.Object r6 = r1.isInside     // Catch:{ all -> 0x01dc }
            o.UpdateAppCallback.getMin(r0, r6)     // Catch:{ all -> 0x01dc }
            goto L_0x01d9
        L_0x01c1:
            r7 = 47
            goto L_0x0128
        L_0x01c5:
            r1.setMin(r13)     // Catch:{ all -> 0x01dc }
            int r0 = r1.setMin     // Catch:{ all -> 0x01dc }
            if (r0 != 0) goto L_0x01d9
            r0 = 58
            r7 = 58
            goto L_0x0128
        L_0x01d2:
            r7 = 24
            goto L_0x0128
        L_0x01d6:
            r7 = 1
            goto L_0x0128
        L_0x01d9:
            r7 = r10
            goto L_0x0128
        L_0x01dc:
            r0 = move-exception
            byte[] r6 = length
            byte r7 = r6[r8]
            byte r7 = (byte) r7
            r14 = r7 | 386(0x182, float:5.41E-43)
            short r14 = (short) r14
            r15 = 654(0x28e, float:9.16E-43)
            byte r6 = r6[r15]
            short r6 = (short) r6
            java.lang.String r6 = setMin(r7, r14, r6)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            r14 = 32
            if (r6 == 0) goto L_0x0203
            if (r10 < r9) goto L_0x0203
            r6 = 4
            if (r10 > r6) goto L_0x0203
        L_0x01ff:
            r7 = 32
            goto L_0x02df
        L_0x0203:
            byte[] r6 = length
            byte r4 = r6[r8]
            byte r4 = (byte) r4
            r7 = 1875(0x753, float:2.627E-42)
            short r7 = (short) r7
            r17 = 3527(0xdc7, float:4.942E-42)
            byte r6 = r6[r17]
            short r6 = (short) r6
            java.lang.String r4 = setMin(r4, r7, r6)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0228
            if (r10 < r11) goto L_0x0228
            r4 = 19
            if (r10 > r4) goto L_0x0228
        L_0x0224:
            r7 = 26
            goto L_0x02df
        L_0x0228:
            r4 = 28
            if (r10 < r4) goto L_0x0234
            if (r10 > r14) goto L_0x0234
            r4 = 59
            r7 = 59
            goto L_0x02df
        L_0x0234:
            byte[] r4 = length
            byte r6 = r4[r8]
            byte r6 = (byte) r6
            r11 = r6 | 3282(0xcd2, float:4.599E-42)
            short r11 = (short) r11
            r18 = 3917(0xf4d, float:5.489E-42)
            byte r4 = r4[r18]
            short r4 = (short) r4
            java.lang.String r4 = setMin(r6, r11, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0254
            if (r10 < r5) goto L_0x0254
            if (r10 > r13) goto L_0x0254
            goto L_0x01ff
        L_0x0254:
            byte[] r4 = length
            byte r6 = r4[r8]
            byte r6 = (byte) r6
            byte r4 = r4[r17]
            short r4 = (short) r4
            java.lang.String r4 = setMin(r6, r7, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0273
            r4 = 41
            if (r10 < r4) goto L_0x0273
            r4 = 42
            if (r10 > r4) goto L_0x0273
            goto L_0x0224
        L_0x0273:
            byte[] r4 = length
            byte r6 = r4[r8]
            byte r6 = (byte) r6
            r7 = r6 | 386(0x182, float:5.41E-43)
            short r7 = (short) r7
            byte r4 = r4[r15]
            short r4 = (short) r4
            java.lang.String r4 = setMin(r6, r7, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x0293
            r4 = 43
            if (r10 < r4) goto L_0x0293
            if (r10 > r12) goto L_0x0293
            goto L_0x0224
        L_0x0293:
            byte[] r4 = length
            byte r6 = r4[r8]
            byte r6 = (byte) r6
            r7 = r6 | 1890(0x762, float:2.648E-42)
            short r7 = (short) r7
            r11 = 655(0x28f, float:9.18E-43)
            byte r4 = r4[r11]
            int r4 = -r4
            short r4 = (short) r4
            java.lang.String r4 = setMin(r6, r7, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02b9
            r4 = 47
            if (r10 < r4) goto L_0x02b9
            r4 = 48
            if (r10 > r4) goto L_0x02b9
            goto L_0x01ff
        L_0x02b9:
            byte[] r4 = length
            byte r6 = r4[r8]
            byte r6 = (byte) r6
            r7 = r6 | 1890(0x762, float:2.648E-42)
            short r7 = (short) r7
            r11 = 655(0x28f, float:9.18E-43)
            byte r4 = r4[r11]
            int r4 = -r4
            short r4 = (short) r4
            java.lang.String r4 = setMin(r6, r7, r4)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02e9
            r4 = 53
            if (r10 < r4) goto L_0x02e9
            r4 = 59
            if (r10 > r4) goto L_0x02e9
            goto L_0x0224
        L_0x02df:
            r1.equals = r0
            r4 = 47
            r1.setMin(r4)
            r4 = 1
            goto L_0x0128
        L_0x02e9:
            throw r0
        L_0x02ea:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02f2
            throw r1
        L_0x02f2:
            goto L_0x02f4
        L_0x02f3:
            throw r0
        L_0x02f4:
            goto L_0x02f3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getItemPosition.setMin():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void setMin(o.getItemPosition r17, java.lang.Throwable r18) {
        /*
            o.getTabIndicatorColor r1 = new o.getTabIndicatorColor
            r0 = r17
            r2 = r18
            r1.<init>(r0, r2)
            r0 = 73
            byte r0 = (byte) r0
            r2 = r0 | 274(0x112, float:3.84E-43)
            short r2 = (short) r2
            r3 = 124(0x7c, float:1.74E-43)
            short r3 = (short) r3
            java.lang.String r0 = setMin(r0, r2, r3)
            r2 = 74
            byte r2 = (byte) r2
            r3 = 398(0x18e, float:5.58E-43)
            short r3 = (short) r3
            byte[] r4 = length
            r5 = 83
            byte r4 = r4[r5]
            short r4 = (short) r4
            java.lang.String r2 = setMin(r2, r3, r4)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x020e }
            r6 = 0
            r4[r6] = r2     // Catch:{ all -> 0x020e }
            byte[] r2 = length     // Catch:{ all -> 0x020e }
            r7 = 3446(0xd76, float:4.829E-42)
            byte r2 = r2[r7]     // Catch:{ all -> 0x020e }
            byte r2 = (byte) r2     // Catch:{ all -> 0x020e }
            r8 = 1332(0x534, float:1.867E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x020e }
            byte[] r9 = length     // Catch:{ all -> 0x020e }
            r10 = 689(0x2b1, float:9.65E-43)
            byte r9 = r9[r10]     // Catch:{ all -> 0x020e }
            short r9 = (short) r9     // Catch:{ all -> 0x020e }
            java.lang.String r2 = setMin(r2, r8, r9)     // Catch:{ all -> 0x020e }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x020e }
            byte[] r9 = length     // Catch:{ all -> 0x020e }
            r11 = 11
            byte r9 = r9[r11]     // Catch:{ all -> 0x020e }
            byte r9 = (byte) r9     // Catch:{ all -> 0x020e }
            r11 = 1537(0x601, float:2.154E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x020e }
            byte[] r12 = length     // Catch:{ all -> 0x020e }
            r13 = 86
            byte r12 = r12[r13]     // Catch:{ all -> 0x020e }
            short r12 = (short) r12     // Catch:{ all -> 0x020e }
            java.lang.String r9 = setMin(r9, r11, r12)     // Catch:{ all -> 0x020e }
            java.lang.Class[] r11 = new java.lang.Class[r3]     // Catch:{ all -> 0x020e }
            byte[] r12 = length     // Catch:{ all -> 0x020e }
            byte r12 = r12[r7]     // Catch:{ all -> 0x020e }
            byte r12 = (byte) r12     // Catch:{ all -> 0x020e }
            byte[] r13 = length     // Catch:{ all -> 0x020e }
            byte r13 = r13[r10]     // Catch:{ all -> 0x020e }
            short r13 = (short) r13     // Catch:{ all -> 0x020e }
            java.lang.String r12 = setMin(r12, r8, r13)     // Catch:{ all -> 0x020e }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x020e }
            r11[r6] = r12     // Catch:{ all -> 0x020e }
            java.lang.reflect.Method r2 = r2.getMethod(r9, r11)     // Catch:{ all -> 0x020e }
            java.lang.Object r0 = r2.invoke(r0, r4)     // Catch:{ all -> 0x020e }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x020e }
            int r2 = r0.length
            int[] r2 = new int[r2]
            r4 = 0
        L_0x007f:
            int r9 = r0.length
            r11 = 30
            if (r4 >= r9) goto L_0x0125
            r9 = r0[r4]
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ all -> 0x011c }
            r12[r6] = r9     // Catch:{ all -> 0x011c }
            byte[] r9 = length     // Catch:{ all -> 0x011c }
            byte r9 = r9[r7]     // Catch:{ all -> 0x011c }
            byte r9 = (byte) r9     // Catch:{ all -> 0x011c }
            r13 = r9 | 1906(0x772, float:2.671E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x011c }
            byte[] r14 = length     // Catch:{ all -> 0x011c }
            r15 = 113(0x71, float:1.58E-43)
            byte r14 = r14[r15]     // Catch:{ all -> 0x011c }
            int r14 = -r14
            short r14 = (short) r14     // Catch:{ all -> 0x011c }
            java.lang.String r9 = setMin(r9, r13, r14)     // Catch:{ all -> 0x011c }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x011c }
            byte[] r13 = length     // Catch:{ all -> 0x011c }
            byte r13 = r13[r5]     // Catch:{ all -> 0x011c }
            byte r13 = (byte) r13     // Catch:{ all -> 0x011c }
            r14 = r13 | 488(0x1e8, float:6.84E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x011c }
            byte[] r16 = length     // Catch:{ all -> 0x011c }
            byte r11 = r16[r11]     // Catch:{ all -> 0x011c }
            short r11 = (short) r11     // Catch:{ all -> 0x011c }
            java.lang.String r11 = setMin(r13, r14, r11)     // Catch:{ all -> 0x011c }
            java.lang.Class[] r13 = new java.lang.Class[r3]     // Catch:{ all -> 0x011c }
            byte[] r14 = length     // Catch:{ all -> 0x011c }
            byte r14 = r14[r7]     // Catch:{ all -> 0x011c }
            byte r14 = (byte) r14     // Catch:{ all -> 0x011c }
            byte[] r16 = length     // Catch:{ all -> 0x011c }
            byte r5 = r16[r10]     // Catch:{ all -> 0x011c }
            short r5 = (short) r5     // Catch:{ all -> 0x011c }
            java.lang.String r5 = setMin(r14, r8, r5)     // Catch:{ all -> 0x011c }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x011c }
            r13[r6] = r5     // Catch:{ all -> 0x011c }
            java.lang.reflect.Method r5 = r9.getMethod(r11, r13)     // Catch:{ all -> 0x011c }
            r9 = 0
            java.lang.Object r5 = r5.invoke(r9, r12)     // Catch:{ all -> 0x011c }
            byte[] r11 = length     // Catch:{ all -> 0x0113 }
            byte r11 = r11[r7]     // Catch:{ all -> 0x0113 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0113 }
            r12 = r11 | 1906(0x772, float:2.671E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0113 }
            byte[] r13 = length     // Catch:{ all -> 0x0113 }
            byte r13 = r13[r15]     // Catch:{ all -> 0x0113 }
            int r13 = -r13
            short r13 = (short) r13     // Catch:{ all -> 0x0113 }
            java.lang.String r11 = setMin(r11, r12, r13)     // Catch:{ all -> 0x0113 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0113 }
            byte[] r12 = length     // Catch:{ all -> 0x0113 }
            r13 = 3429(0xd65, float:4.805E-42)
            byte r12 = r12[r13]     // Catch:{ all -> 0x0113 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0113 }
            r13 = 482(0x1e2, float:6.75E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0113 }
            byte[] r14 = length     // Catch:{ all -> 0x0113 }
            r15 = 9
            byte r14 = r14[r15]     // Catch:{ all -> 0x0113 }
            short r14 = (short) r14     // Catch:{ all -> 0x0113 }
            java.lang.String r12 = setMin(r12, r13, r14)     // Catch:{ all -> 0x0113 }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r9)     // Catch:{ all -> 0x0113 }
            java.lang.Object r5 = r11.invoke(r5, r9)     // Catch:{ all -> 0x0113 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0113 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0113 }
            r2[r4] = r5
            int r4 = r4 + 1
            r5 = 83
            goto L_0x007f
        L_0x0113:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011b
            throw r1
        L_0x011b:
            throw r0
        L_0x011c:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0124
            throw r1
        L_0x0124:
            throw r0
        L_0x0125:
            r4 = 19
            r5 = 4
            r8 = 2
        L_0x0129:
            int r9 = r6 + 1
            r10 = 18
            r0 = r2[r6]     // Catch:{ all -> 0x01b5 }
            int r0 = r1.setMin(r0)     // Catch:{ all -> 0x01b5 }
            r6 = 3
            r12 = 21
            r13 = 17
            switch(r0) {
                case -14: goto L_0x01a1;
                case -13: goto L_0x019e;
                case -12: goto L_0x0187;
                case -11: goto L_0x0186;
                case -10: goto L_0x0184;
                case -9: goto L_0x016f;
                case -8: goto L_0x016d;
                case -7: goto L_0x016a;
                case -6: goto L_0x0160;
                case -5: goto L_0x0153;
                case -4: goto L_0x014b;
                case -3: goto L_0x0148;
                case -2: goto L_0x0140;
                case -1: goto L_0x013d;
                default: goto L_0x013b;
            }     // Catch:{ all -> 0x01b5 }
        L_0x013b:
            goto L_0x01b2
        L_0x013d:
            r6 = 20
            goto L_0x0129
        L_0x0140:
            r1.setMin(r8)     // Catch:{ all -> 0x01b5 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x01b5 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01b5 }
            throw r0     // Catch:{ all -> 0x01b5 }
        L_0x0148:
            r6 = 19
            goto L_0x0129
        L_0x014b:
            int r0 = equals     // Catch:{ all -> 0x01b5 }
            r1.getMax = r0     // Catch:{ all -> 0x01b5 }
        L_0x014f:
            r1.setMin(r6)     // Catch:{ all -> 0x01b5 }
            goto L_0x01b2
        L_0x0153:
            r1.getMax = r3     // Catch:{ all -> 0x01b5 }
            r1.setMin(r13)     // Catch:{ all -> 0x01b5 }
            r1.setMin(r10)     // Catch:{ all -> 0x01b5 }
            int r0 = r1.setMin     // Catch:{ all -> 0x01b5 }
            toIntRange = r0     // Catch:{ all -> 0x01b5 }
            goto L_0x01b2
        L_0x0160:
            r1.setMin(r4)     // Catch:{ all -> 0x01b5 }
            int r0 = r1.setMin     // Catch:{ all -> 0x01b5 }
            if (r0 != 0) goto L_0x01b2
            r6 = 17
            goto L_0x0129
        L_0x016a:
            r6 = 28
            goto L_0x0129
        L_0x016d:
            r6 = 2
            goto L_0x0129
        L_0x016f:
            r1.setMin(r3)     // Catch:{ all -> 0x01b5 }
            int r0 = r1.setMin     // Catch:{ all -> 0x01b5 }
            r6 = 6
            r9 = 25
            if (r0 == r6) goto L_0x0181
            r6 = 45
            if (r0 == r6) goto L_0x017e
            goto L_0x0181
        L_0x017e:
            r6 = 30
            goto L_0x0129
        L_0x0181:
            r6 = 25
            goto L_0x0129
        L_0x0184:
            r6 = 4
            goto L_0x0129
        L_0x0186:
            return
        L_0x0187:
            r1.getMax = r8     // Catch:{ all -> 0x01b5 }
            r1.setMin(r13)     // Catch:{ all -> 0x01b5 }
            r1.setMin(r12)     // Catch:{ all -> 0x01b5 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x01b5 }
            o.getItemPosition r0 = (o.getItemPosition) r0     // Catch:{ all -> 0x01b5 }
            r1.setMin(r12)     // Catch:{ all -> 0x01b5 }
            java.lang.Object r6 = r1.isInside     // Catch:{ all -> 0x01b5 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x01b5 }
            r0.setMax((java.lang.Throwable) r6)     // Catch:{ all -> 0x01b5 }
            goto L_0x01b2
        L_0x019e:
            r6 = 23
            goto L_0x0129
        L_0x01a1:
            r1.getMax = r3     // Catch:{ all -> 0x01b5 }
            r1.setMin(r13)     // Catch:{ all -> 0x01b5 }
            r1.setMin(r12)     // Catch:{ all -> 0x01b5 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x01b5 }
            int r0 = super.hashCode()     // Catch:{ all -> 0x01b5 }
            r1.getMax = r0     // Catch:{ all -> 0x01b5 }
            goto L_0x014f
        L_0x01b2:
            r6 = r9
            goto L_0x0129
        L_0x01b5:
            r0 = move-exception
            byte[] r6 = length
            byte r12 = r6[r7]
            byte r12 = (byte) r12
            r13 = 1875(0x753, float:2.627E-42)
            short r13 = (short) r13
            r14 = 3527(0xdc7, float:4.942E-42)
            byte r6 = r6[r14]
            short r6 = (short) r6
            java.lang.String r6 = setMin(r12, r13, r6)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            r12 = 37
            if (r6 == 0) goto L_0x01db
            if (r9 < r5) goto L_0x01db
            r6 = 5
            if (r9 > r6) goto L_0x01db
            r6 = 18
            goto L_0x0204
        L_0x01db:
            byte[] r6 = length
            byte r13 = r6[r7]
            byte r13 = (byte) r13
            r14 = 692(0x2b4, float:9.7E-43)
            byte r6 = r6[r14]
            short r6 = (short) r6
            short r14 = (short) r6
            java.lang.String r6 = setMin(r13, r6, r14)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x01fc
            r6 = 13
            if (r9 < r6) goto L_0x01fc
            if (r9 > r10) goto L_0x01fc
            r6 = 1
            goto L_0x0204
        L_0x01fc:
            r6 = 33
            if (r9 < r6) goto L_0x020d
            if (r9 > r12) goto L_0x020d
            r6 = 37
        L_0x0204:
            r1.equals = r0
            r0 = 47
            r1.setMin(r0)
            goto L_0x0129
        L_0x020d:
            throw r0
        L_0x020e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0216
            throw r1
        L_0x0216:
            goto L_0x0218
        L_0x0217:
            throw r0
        L_0x0218:
            goto L_0x0217
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getItemPosition.setMin(o.getItemPosition, java.lang.Throwable):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0167, code lost:
        r1.setMin(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x019c, code lost:
        r1.setMin(22);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void length() {
        /*
            r20 = this;
            o.getTabIndicatorColor r1 = new o.getTabIndicatorColor
            r2 = r20
            r1.<init>(r2)
            r0 = 73
            byte r0 = (byte) r0
            r3 = 1846(0x736, float:2.587E-42)
            short r3 = (short) r3
            r4 = 309(0x135, float:4.33E-43)
            short r4 = (short) r4
            java.lang.String r0 = setMin(r0, r3, r4)
            r3 = 74
            byte r4 = (byte) r3
            r5 = 398(0x18e, float:5.58E-43)
            short r5 = (short) r5
            byte[] r6 = length
            r7 = 83
            byte r6 = r6[r7]
            short r6 = (short) r6
            java.lang.String r4 = setMin(r4, r5, r6)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0440 }
            r8 = 0
            r6[r8] = r4     // Catch:{ all -> 0x0440 }
            byte[] r4 = length     // Catch:{ all -> 0x0440 }
            r9 = 3446(0xd76, float:4.829E-42)
            byte r4 = r4[r9]     // Catch:{ all -> 0x0440 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x0440 }
            r10 = 1332(0x534, float:1.867E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0440 }
            byte[] r11 = length     // Catch:{ all -> 0x0440 }
            r12 = 689(0x2b1, float:9.65E-43)
            byte r11 = r11[r12]     // Catch:{ all -> 0x0440 }
            short r11 = (short) r11     // Catch:{ all -> 0x0440 }
            java.lang.String r4 = setMin(r4, r10, r11)     // Catch:{ all -> 0x0440 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0440 }
            byte[] r11 = length     // Catch:{ all -> 0x0440 }
            r13 = 11
            byte r11 = r11[r13]     // Catch:{ all -> 0x0440 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0440 }
            r13 = 1537(0x601, float:2.154E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0440 }
            byte[] r14 = length     // Catch:{ all -> 0x0440 }
            r15 = 86
            byte r14 = r14[r15]     // Catch:{ all -> 0x0440 }
            short r14 = (short) r14     // Catch:{ all -> 0x0440 }
            java.lang.String r11 = setMin(r11, r13, r14)     // Catch:{ all -> 0x0440 }
            java.lang.Class[] r13 = new java.lang.Class[r5]     // Catch:{ all -> 0x0440 }
            byte[] r14 = length     // Catch:{ all -> 0x0440 }
            byte r14 = r14[r9]     // Catch:{ all -> 0x0440 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0440 }
            byte[] r16 = length     // Catch:{ all -> 0x0440 }
            byte r3 = r16[r12]     // Catch:{ all -> 0x0440 }
            short r3 = (short) r3     // Catch:{ all -> 0x0440 }
            java.lang.String r3 = setMin(r14, r10, r3)     // Catch:{ all -> 0x0440 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0440 }
            r13[r8] = r3     // Catch:{ all -> 0x0440 }
            java.lang.reflect.Method r3 = r4.getMethod(r11, r13)     // Catch:{ all -> 0x0440 }
            java.lang.Object r0 = r3.invoke(r0, r6)     // Catch:{ all -> 0x0440 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0440 }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r4 = 0
        L_0x007d:
            int r6 = r0.length
            if (r4 >= r6) goto L_0x0127
            r6 = r0[r4]
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x011e }
            r11[r8] = r6     // Catch:{ all -> 0x011e }
            byte[] r6 = length     // Catch:{ all -> 0x011e }
            byte r6 = r6[r9]     // Catch:{ all -> 0x011e }
            byte r6 = (byte) r6     // Catch:{ all -> 0x011e }
            r13 = r6 | 1906(0x772, float:2.671E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x011e }
            byte[] r14 = length     // Catch:{ all -> 0x011e }
            r16 = 113(0x71, float:1.58E-43)
            byte r14 = r14[r16]     // Catch:{ all -> 0x011e }
            int r14 = -r14
            short r14 = (short) r14     // Catch:{ all -> 0x011e }
            java.lang.String r6 = setMin(r6, r13, r14)     // Catch:{ all -> 0x011e }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x011e }
            byte[] r13 = length     // Catch:{ all -> 0x011e }
            byte r13 = r13[r7]     // Catch:{ all -> 0x011e }
            byte r13 = (byte) r13     // Catch:{ all -> 0x011e }
            r14 = r13 | 488(0x1e8, float:6.84E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x011e }
            byte[] r16 = length     // Catch:{ all -> 0x011e }
            r17 = 30
            byte r7 = r16[r17]     // Catch:{ all -> 0x011e }
            short r7 = (short) r7     // Catch:{ all -> 0x011e }
            java.lang.String r7 = setMin(r13, r14, r7)     // Catch:{ all -> 0x011e }
            java.lang.Class[] r13 = new java.lang.Class[r5]     // Catch:{ all -> 0x011e }
            byte[] r14 = length     // Catch:{ all -> 0x011e }
            byte r14 = r14[r9]     // Catch:{ all -> 0x011e }
            byte r14 = (byte) r14     // Catch:{ all -> 0x011e }
            byte[] r16 = length     // Catch:{ all -> 0x011e }
            byte r15 = r16[r12]     // Catch:{ all -> 0x011e }
            short r15 = (short) r15     // Catch:{ all -> 0x011e }
            java.lang.String r14 = setMin(r14, r10, r15)     // Catch:{ all -> 0x011e }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x011e }
            r13[r8] = r14     // Catch:{ all -> 0x011e }
            java.lang.reflect.Method r6 = r6.getMethod(r7, r13)     // Catch:{ all -> 0x011e }
            r7 = 0
            java.lang.Object r6 = r6.invoke(r7, r11)     // Catch:{ all -> 0x011e }
            byte[] r11 = length     // Catch:{ all -> 0x0115 }
            byte r11 = r11[r9]     // Catch:{ all -> 0x0115 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0115 }
            r13 = r11 | 1906(0x772, float:2.671E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0115 }
            byte[] r14 = length     // Catch:{ all -> 0x0115 }
            r15 = 113(0x71, float:1.58E-43)
            byte r14 = r14[r15]     // Catch:{ all -> 0x0115 }
            int r14 = -r14
            short r14 = (short) r14     // Catch:{ all -> 0x0115 }
            java.lang.String r11 = setMin(r11, r13, r14)     // Catch:{ all -> 0x0115 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0115 }
            byte[] r13 = length     // Catch:{ all -> 0x0115 }
            r14 = 3429(0xd65, float:4.805E-42)
            byte r13 = r13[r14]     // Catch:{ all -> 0x0115 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0115 }
            r14 = 482(0x1e2, float:6.75E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0115 }
            byte[] r15 = length     // Catch:{ all -> 0x0115 }
            r16 = 9
            byte r15 = r15[r16]     // Catch:{ all -> 0x0115 }
            short r15 = (short) r15     // Catch:{ all -> 0x0115 }
            java.lang.String r13 = setMin(r13, r14, r15)     // Catch:{ all -> 0x0115 }
            java.lang.reflect.Method r11 = r11.getMethod(r13, r7)     // Catch:{ all -> 0x0115 }
            java.lang.Object r6 = r11.invoke(r6, r7)     // Catch:{ all -> 0x0115 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0115 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0115 }
            r3[r4] = r6
            int r4 = r4 + 1
            r7 = 83
            r15 = 86
            goto L_0x007d
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
            r4 = 41
            r7 = 28
            r10 = 3
            r11 = 22
        L_0x012e:
            int r12 = r8 + 1
            r14 = 18
            r15 = 2
            r6 = 17
            r0 = r3[r8]     // Catch:{ all -> 0x02a4 }
            int r0 = r1.setMin(r0)     // Catch:{ all -> 0x02a4 }
            r8 = 40
            r13 = 21
            switch(r0) {
                case -33: goto L_0x029d;
                case -32: goto L_0x0299;
                case -31: goto L_0x028c;
                case -30: goto L_0x028b;
                case -29: goto L_0x0279;
                case -28: goto L_0x0268;
                case -27: goto L_0x0264;
                case -26: goto L_0x0259;
                case -25: goto L_0x024c;
                case -24: goto L_0x0246;
                case -23: goto L_0x0242;
                case -22: goto L_0x023e;
                case -21: goto L_0x023a;
                case -20: goto L_0x0225;
                case -19: goto L_0x0211;
                case -18: goto L_0x0202;
                case -17: goto L_0x01ee;
                case -16: goto L_0x01eb;
                case -15: goto L_0x01e8;
                case -14: goto L_0x01cb;
                case -13: goto L_0x01c7;
                case -12: goto L_0x01c3;
                case -11: goto L_0x01b2;
                case -10: goto L_0x01a1;
                case -9: goto L_0x018c;
                case -8: goto L_0x0189;
                case -7: goto L_0x0186;
                case -6: goto L_0x017a;
                case -5: goto L_0x016c;
                case -4: goto L_0x0163;
                case -3: goto L_0x015b;
                case -2: goto L_0x0147;
                case -1: goto L_0x0144;
                default: goto L_0x0142;
            }     // Catch:{ all -> 0x02a4 }
        L_0x0142:
            goto L_0x02a1
        L_0x0144:
            r8 = 28
            goto L_0x012e
        L_0x0147:
            r1.setMin(r5)     // Catch:{ all -> 0x02a4 }
            int r0 = r1.setMin     // Catch:{ all -> 0x02a4 }
            if (r0 == 0) goto L_0x0156
            if (r0 == r5) goto L_0x0151
            goto L_0x0156
        L_0x0151:
            r0 = 92
            r8 = 92
            goto L_0x012e
        L_0x0156:
            r0 = 76
            r8 = 76
            goto L_0x012e
        L_0x015b:
            r1.setMin(r15)     // Catch:{ all -> 0x02a4 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x02a4 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x02a4 }
            throw r0     // Catch:{ all -> 0x02a4 }
        L_0x0163:
            int r0 = equals     // Catch:{ all -> 0x02a4 }
            r1.getMax = r0     // Catch:{ all -> 0x02a4 }
        L_0x0167:
            r1.setMin(r10)     // Catch:{ all -> 0x02a4 }
            goto L_0x02a1
        L_0x016c:
            r1.getMax = r5     // Catch:{ all -> 0x02a4 }
            r1.setMin(r6)     // Catch:{ all -> 0x02a4 }
            r1.setMin(r14)     // Catch:{ all -> 0x02a4 }
            int r0 = r1.setMin     // Catch:{ all -> 0x02a4 }
            toIntRange = r0     // Catch:{ all -> 0x02a4 }
            goto L_0x02a1
        L_0x017a:
            r0 = 19
            r1.setMin(r0)     // Catch:{ all -> 0x02a4 }
            int r0 = r1.setMin     // Catch:{ all -> 0x02a4 }
            if (r0 != 0) goto L_0x02a1
            r8 = 21
            goto L_0x012e
        L_0x0186:
            r8 = 34
            goto L_0x012e
        L_0x0189:
            r8 = 50
            goto L_0x012e
        L_0x018c:
            r1.getMax = r5     // Catch:{ all -> 0x02a4 }
            r1.setMin(r6)     // Catch:{ all -> 0x02a4 }
            r1.setMin(r13)     // Catch:{ all -> 0x02a4 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x02a4 }
            o.getItemPosition r0 = (o.getItemPosition) r0     // Catch:{ all -> 0x02a4 }
            o.registerDataSetObserver$getMin r0 = r0.getMax     // Catch:{ all -> 0x02a4 }
            r1.equals = r0     // Catch:{ all -> 0x02a4 }
        L_0x019c:
            r1.setMin(r11)     // Catch:{ all -> 0x02a4 }
            goto L_0x02a1
        L_0x01a1:
            r1.getMax = r5     // Catch:{ all -> 0x02a4 }
            r1.setMin(r6)     // Catch:{ all -> 0x02a4 }
            r1.setMin(r13)     // Catch:{ all -> 0x02a4 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x02a4 }
            o.registerDataSetObserver$getMin r0 = (o.registerDataSetObserver.getMin) r0     // Catch:{ all -> 0x02a4 }
            r0.showProgress()     // Catch:{ all -> 0x02a4 }
            goto L_0x02a1
        L_0x01b2:
            r1.getMax = r5     // Catch:{ all -> 0x02a4 }
            r1.setMin(r6)     // Catch:{ all -> 0x02a4 }
            r1.setMin(r13)     // Catch:{ all -> 0x02a4 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x02a4 }
            o.getItemPosition r0 = (o.getItemPosition) r0     // Catch:{ all -> 0x02a4 }
            o.GriverRVLoggerProxyImpl r0 = r0.setMax     // Catch:{ all -> 0x02a4 }
            r1.equals = r0     // Catch:{ all -> 0x02a4 }
            goto L_0x019c
        L_0x01c3:
            r8 = 41
            goto L_0x012e
        L_0x01c7:
            r8 = 56
            goto L_0x012e
        L_0x01cb:
            r1.getMax = r10     // Catch:{ all -> 0x02a4 }
            r1.setMin(r6)     // Catch:{ all -> 0x02a4 }
            r1.setMin(r13)     // Catch:{ all -> 0x02a4 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x02a4 }
            o.parseFailed r0 = (o.parseFailed) r0     // Catch:{ all -> 0x02a4 }
            r1.setMin(r13)     // Catch:{ all -> 0x02a4 }
            java.lang.Object r8 = r1.isInside     // Catch:{ all -> 0x02a4 }
            o.setGlobalUserData r8 = (o.setGlobalUserData) r8     // Catch:{ all -> 0x02a4 }
            r1.setMin(r13)     // Catch:{ all -> 0x02a4 }
            java.lang.Object r13 = r1.isInside     // Catch:{ all -> 0x02a4 }
            r0.execute(r8, r13)     // Catch:{ all -> 0x02a4 }
            goto L_0x02a1
        L_0x01e8:
            r8 = 3
            goto L_0x012e
        L_0x01eb:
            r8 = 1
            goto L_0x012e
        L_0x01ee:
            o.getItemPosition$getMax r0 = new o.getItemPosition$getMax     // Catch:{ all -> 0x02a4 }
            r1.getMax = r5     // Catch:{ all -> 0x02a4 }
            r1.setMin(r6)     // Catch:{ all -> 0x02a4 }
            r1.setMin(r13)     // Catch:{ all -> 0x02a4 }
            java.lang.Object r8 = r1.isInside     // Catch:{ all -> 0x02a4 }
            o.getItemPosition r8 = (o.getItemPosition) r8     // Catch:{ all -> 0x02a4 }
            r0.<init>(r8)     // Catch:{ all -> 0x02a4 }
            r1.equals = r0     // Catch:{ all -> 0x02a4 }
            goto L_0x019c
        L_0x0202:
            r1.getMax = r5     // Catch:{ all -> 0x02a4 }
            r1.setMin(r6)     // Catch:{ all -> 0x02a4 }
            r1.setMin(r13)     // Catch:{ all -> 0x02a4 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x02a4 }
            o.setGlobalUserData r0 = (o.setGlobalUserData) r0     // Catch:{ all -> 0x02a4 }
            r1.equals = r0     // Catch:{ all -> 0x02a4 }
            goto L_0x019c
        L_0x0211:
            r1.getMax = r5     // Catch:{ all -> 0x02a4 }
            r1.setMin(r6)     // Catch:{ all -> 0x02a4 }
            r1.setMin(r13)     // Catch:{ all -> 0x02a4 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x02a4 }
            o.getItemPosition r0 = (o.getItemPosition) r0     // Catch:{ all -> 0x02a4 }
            kotlin.jvm.functions.Function0 r0 = r0.getMin()     // Catch:{ all -> 0x02a4 }
            r1.equals = r0     // Catch:{ all -> 0x02a4 }
            goto L_0x019c
        L_0x0225:
            o.GriverRVLoggerProxyImpl$setMax r0 = new o.GriverRVLoggerProxyImpl$setMax     // Catch:{ all -> 0x02a4 }
            r1.getMax = r5     // Catch:{ all -> 0x02a4 }
            r1.setMin(r6)     // Catch:{ all -> 0x02a4 }
            r1.setMin(r13)     // Catch:{ all -> 0x02a4 }
            java.lang.Object r8 = r1.isInside     // Catch:{ all -> 0x02a4 }
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8     // Catch:{ all -> 0x02a4 }
            r0.<init>(r8)     // Catch:{ all -> 0x02a4 }
            r1.equals = r0     // Catch:{ all -> 0x02a4 }
            goto L_0x019c
        L_0x023a:
            r8 = 81
            goto L_0x012e
        L_0x023e:
            r8 = 75
            goto L_0x012e
        L_0x0242:
            r8 = 22
            goto L_0x012e
        L_0x0246:
            int r0 = toIntRange     // Catch:{ all -> 0x02a4 }
            r1.getMax = r0     // Catch:{ all -> 0x02a4 }
            goto L_0x0167
        L_0x024c:
            r1.getMax = r5     // Catch:{ all -> 0x02a4 }
            r1.setMin(r6)     // Catch:{ all -> 0x02a4 }
            r1.setMin(r14)     // Catch:{ all -> 0x02a4 }
            int r0 = r1.setMin     // Catch:{ all -> 0x02a4 }
            equals = r0     // Catch:{ all -> 0x02a4 }
            goto L_0x02a1
        L_0x0259:
            r1.setMin(r8)     // Catch:{ all -> 0x02a4 }
            int r0 = r1.setMin     // Catch:{ all -> 0x02a4 }
            if (r0 != 0) goto L_0x02a1
            r8 = 74
            goto L_0x012e
        L_0x0264:
            r8 = 55
            goto L_0x012e
        L_0x0268:
            r1.setMin(r5)     // Catch:{ all -> 0x02a4 }
            int r0 = r1.setMin     // Catch:{ all -> 0x02a4 }
            if (r0 == 0) goto L_0x0273
            r8 = 36
            goto L_0x012e
        L_0x0273:
            r0 = 32
            r8 = 32
            goto L_0x012e
        L_0x0279:
            r1.getMax = r5     // Catch:{ all -> 0x02a4 }
            r1.setMin(r6)     // Catch:{ all -> 0x02a4 }
            r1.setMin(r13)     // Catch:{ all -> 0x02a4 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x02a4 }
            int r0 = super.hashCode()     // Catch:{ all -> 0x02a4 }
            r1.getMax = r0     // Catch:{ all -> 0x02a4 }
            goto L_0x0167
        L_0x028b:
            return
        L_0x028c:
            r1.setMin(r8)     // Catch:{ all -> 0x02a4 }
            int r0 = r1.setMin     // Catch:{ all -> 0x02a4 }
            if (r0 != 0) goto L_0x02a1
            r0 = 90
            r8 = 90
            goto L_0x012e
        L_0x0299:
            r8 = 53
            goto L_0x012e
        L_0x029d:
            r8 = 48
            goto L_0x012e
        L_0x02a1:
            r8 = r12
            goto L_0x012e
        L_0x02a4:
            r0 = move-exception
            byte[] r8 = length
            byte r8 = r8[r9]
            byte r8 = (byte) r8
            r13 = r8 | 514(0x202, float:7.2E-43)
            short r13 = (short) r13
            int r18 = setMin
            int r5 = r18 >>> 2
            short r5 = (short) r5
            java.lang.String r5 = setMin(r8, r13, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            r13 = 52
            if (r5 == 0) goto L_0x02cf
            if (r12 < r10) goto L_0x02cf
            if (r12 > r11) goto L_0x02cf
        L_0x02c6:
            r5 = 81
            r6 = 86
            r8 = 52
        L_0x02cc:
            r10 = 1
            goto L_0x0434
        L_0x02cf:
            byte[] r5 = length
            byte r8 = r5[r9]
            byte r8 = (byte) r8
            r19 = 692(0x2b4, float:9.7E-43)
            byte r5 = r5[r19]
            short r5 = (short) r5
            short r10 = (short) r5
            java.lang.String r5 = setMin(r8, r5, r10)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x02ed
            if (r12 < r6) goto L_0x02ed
            if (r12 > r14) goto L_0x02ed
            goto L_0x02c6
        L_0x02ed:
            byte[] r5 = length
            byte r6 = r5[r9]
            byte r6 = (byte) r6
            r8 = 436(0x1b4, float:6.11E-43)
            short r8 = (short) r8
            r10 = 5
            byte r5 = r5[r10]
            int r5 = -r5
            short r5 = (short) r5
            java.lang.String r5 = setMin(r6, r8, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0315
            r5 = 23
            if (r12 < r5) goto L_0x0315
            if (r12 > r7) goto L_0x0315
        L_0x030e:
            r5 = 81
            r6 = 86
            r8 = 94
            goto L_0x02cc
        L_0x0315:
            byte[] r5 = length
            byte r5 = r5[r9]
            byte r5 = (byte) r5
            r6 = r5 | 514(0x202, float:7.2E-43)
            short r6 = (short) r6
            int r8 = setMin
            int r8 = r8 >>> r15
            short r8 = (short) r8
            java.lang.String r5 = setMin(r5, r6, r8)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0336
            r5 = 24
            if (r12 < r5) goto L_0x0336
            if (r12 > r7) goto L_0x0336
        L_0x0335:
            goto L_0x030e
        L_0x0336:
            byte[] r5 = length
            byte r6 = r5[r9]
            byte r6 = (byte) r6
            r8 = r6 | 1890(0x762, float:2.648E-42)
            short r8 = (short) r8
            r10 = 655(0x28f, float:9.18E-43)
            byte r5 = r5[r10]
            int r5 = -r5
            short r5 = (short) r5
            java.lang.String r5 = setMin(r6, r8, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x035a
            r5 = 26
            if (r12 < r5) goto L_0x035a
            if (r12 > r7) goto L_0x035a
            goto L_0x02c6
        L_0x035a:
            byte[] r5 = length
            byte r6 = r5[r9]
            byte r6 = (byte) r6
            r8 = r6 | 3282(0xcd2, float:4.599E-42)
            short r8 = (short) r8
            r10 = 3917(0xf4d, float:5.489E-42)
            byte r5 = r5[r10]
            short r5 = (short) r5
            java.lang.String r5 = setMin(r6, r8, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x037e
            r5 = 32
            if (r12 < r5) goto L_0x037e
            r5 = 33
            if (r12 > r5) goto L_0x037e
            goto L_0x0335
        L_0x037e:
            r5 = 37
            if (r12 < r5) goto L_0x038b
            if (r12 > r4) goto L_0x038b
            r5 = 81
            r6 = 86
            r8 = 2
            goto L_0x02cc
        L_0x038b:
            byte[] r5 = length
            byte r6 = r5[r9]
            byte r6 = (byte) r6
            r8 = r6 | 1890(0x762, float:2.648E-42)
            short r8 = (short) r8
            r10 = 655(0x28f, float:9.18E-43)
            byte r5 = r5[r10]
            int r5 = -r5
            short r5 = (short) r5
            java.lang.String r5 = setMin(r6, r8, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x03af
            r5 = 36
            if (r12 < r5) goto L_0x03af
            if (r12 > r4) goto L_0x03af
            goto L_0x02c6
        L_0x03af:
            byte[] r5 = length
            byte r6 = r5[r9]
            byte r6 = (byte) r6
            r8 = r6 | 3282(0xcd2, float:4.599E-42)
            short r8 = (short) r8
            r10 = 3917(0xf4d, float:5.489E-42)
            byte r5 = r5[r10]
            short r5 = (short) r5
            java.lang.String r5 = setMin(r6, r8, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x03d4
            r5 = 43
            if (r12 < r5) goto L_0x03d4
            r5 = 44
            if (r12 > r5) goto L_0x03d4
            goto L_0x02c6
        L_0x03d4:
            r5 = 77
            if (r12 < r5) goto L_0x03e6
            r5 = 81
            if (r12 > r5) goto L_0x03e6
            r5 = 91
            r5 = 81
            r6 = 86
            r8 = 91
            goto L_0x02cc
        L_0x03e6:
            byte[] r5 = length
            byte r6 = r5[r9]
            byte r6 = (byte) r6
            r8 = r6 | 3248(0xcb0, float:4.551E-42)
            short r8 = (short) r8
            r10 = 3527(0xdc7, float:4.942E-42)
            byte r5 = r5[r10]
            r10 = 1
            int r5 = r5 + r10
            short r5 = (short) r5
            java.lang.String r5 = setMin(r6, r8, r5)
            java.lang.Class r5 = java.lang.Class.forName(r5)
            boolean r5 = r5.isInstance(r0)
            if (r5 == 0) goto L_0x0410
            r5 = 81
            if (r12 < r5) goto L_0x0412
            r6 = 91
            if (r12 > r6) goto L_0x0412
            r6 = 86
        L_0x040d:
            r8 = 52
            goto L_0x0434
        L_0x0410:
            r5 = 81
        L_0x0412:
            byte[] r6 = length
            byte r8 = r6[r9]
            byte r8 = (byte) r8
            r15 = r8 | 353(0x161, float:4.95E-43)
            short r15 = (short) r15
            byte r6 = r6[r14]
            short r6 = (short) r6
            java.lang.String r6 = setMin(r8, r15, r6)
            java.lang.Class r6 = java.lang.Class.forName(r6)
            boolean r6 = r6.isInstance(r0)
            if (r6 == 0) goto L_0x043f
            r6 = 86
            if (r12 < r6) goto L_0x043f
            r8 = 87
            if (r12 > r8) goto L_0x043f
            goto L_0x040d
        L_0x0434:
            r1.equals = r0
            r0 = 47
            r1.setMin(r0)
            r5 = 1
            r10 = 3
            goto L_0x012e
        L_0x043f:
            throw r0
        L_0x0440:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0448
            throw r1
        L_0x0448:
            goto L_0x044a
        L_0x0449:
            throw r0
        L_0x044a:
            goto L_0x0449
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getItemPosition.length():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0183, code lost:
        r1.setMin(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d0, code lost:
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0219, code lost:
        if (r9 <= 11) goto L_0x02aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax() {
        /*
            r19 = this;
            o.getTabIndicatorColor r1 = new o.getTabIndicatorColor
            r2 = r19
            r1.<init>(r2)
            r0 = 73
            byte r0 = (byte) r0
            r3 = r0 | 150(0x96, float:2.1E-43)
            short r3 = (short) r3
            r4 = r3 & 958(0x3be, float:1.342E-42)
            short r4 = (short) r4
            java.lang.String r0 = setMin(r0, r3, r4)
            r3 = 74
            byte r3 = (byte) r3
            r4 = 398(0x18e, float:5.58E-43)
            short r4 = (short) r4
            byte[] r5 = length
            r6 = 83
            byte r5 = r5[r6]
            short r5 = (short) r5
            java.lang.String r3 = setMin(r3, r4, r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x02b7 }
            r7 = 0
            r5[r7] = r3     // Catch:{ all -> 0x02b7 }
            byte[] r3 = length     // Catch:{ all -> 0x02b7 }
            r8 = 3446(0xd76, float:4.829E-42)
            byte r3 = r3[r8]     // Catch:{ all -> 0x02b7 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x02b7 }
            r9 = 1332(0x534, float:1.867E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x02b7 }
            byte[] r10 = length     // Catch:{ all -> 0x02b7 }
            r11 = 689(0x2b1, float:9.65E-43)
            byte r10 = r10[r11]     // Catch:{ all -> 0x02b7 }
            short r10 = (short) r10     // Catch:{ all -> 0x02b7 }
            java.lang.String r3 = setMin(r3, r9, r10)     // Catch:{ all -> 0x02b7 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x02b7 }
            byte[] r10 = length     // Catch:{ all -> 0x02b7 }
            r12 = 11
            byte r10 = r10[r12]     // Catch:{ all -> 0x02b7 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x02b7 }
            r13 = 1537(0x601, float:2.154E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x02b7 }
            byte[] r14 = length     // Catch:{ all -> 0x02b7 }
            r15 = 86
            byte r14 = r14[r15]     // Catch:{ all -> 0x02b7 }
            short r14 = (short) r14     // Catch:{ all -> 0x02b7 }
            java.lang.String r10 = setMin(r10, r13, r14)     // Catch:{ all -> 0x02b7 }
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch:{ all -> 0x02b7 }
            byte[] r14 = length     // Catch:{ all -> 0x02b7 }
            byte r14 = r14[r8]     // Catch:{ all -> 0x02b7 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x02b7 }
            byte[] r15 = length     // Catch:{ all -> 0x02b7 }
            byte r15 = r15[r11]     // Catch:{ all -> 0x02b7 }
            short r15 = (short) r15     // Catch:{ all -> 0x02b7 }
            java.lang.String r14 = setMin(r14, r9, r15)     // Catch:{ all -> 0x02b7 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x02b7 }
            r13[r7] = r14     // Catch:{ all -> 0x02b7 }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r13)     // Catch:{ all -> 0x02b7 }
            java.lang.Object r0 = r3.invoke(r0, r5)     // Catch:{ all -> 0x02b7 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x02b7 }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r5 = 0
        L_0x007d:
            int r10 = r0.length
            r13 = 9
            if (r5 >= r10) goto L_0x0126
            r10 = r0[r5]
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch:{ all -> 0x011d }
            r14[r7] = r10     // Catch:{ all -> 0x011d }
            byte[] r10 = length     // Catch:{ all -> 0x011d }
            byte r10 = r10[r8]     // Catch:{ all -> 0x011d }
            byte r10 = (byte) r10     // Catch:{ all -> 0x011d }
            r15 = r10 | 1906(0x772, float:2.671E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x011d }
            byte[] r16 = length     // Catch:{ all -> 0x011d }
            r17 = 113(0x71, float:1.58E-43)
            byte r12 = r16[r17]     // Catch:{ all -> 0x011d }
            int r12 = -r12
            short r12 = (short) r12     // Catch:{ all -> 0x011d }
            java.lang.String r10 = setMin(r10, r15, r12)     // Catch:{ all -> 0x011d }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x011d }
            byte[] r12 = length     // Catch:{ all -> 0x011d }
            byte r12 = r12[r6]     // Catch:{ all -> 0x011d }
            byte r12 = (byte) r12     // Catch:{ all -> 0x011d }
            r15 = r12 | 488(0x1e8, float:6.84E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x011d }
            byte[] r16 = length     // Catch:{ all -> 0x011d }
            r18 = 30
            byte r6 = r16[r18]     // Catch:{ all -> 0x011d }
            short r6 = (short) r6     // Catch:{ all -> 0x011d }
            java.lang.String r6 = setMin(r12, r15, r6)     // Catch:{ all -> 0x011d }
            java.lang.Class[] r12 = new java.lang.Class[r4]     // Catch:{ all -> 0x011d }
            byte[] r15 = length     // Catch:{ all -> 0x011d }
            byte r15 = r15[r8]     // Catch:{ all -> 0x011d }
            byte r15 = (byte) r15     // Catch:{ all -> 0x011d }
            byte[] r16 = length     // Catch:{ all -> 0x011d }
            byte r4 = r16[r11]     // Catch:{ all -> 0x011d }
            short r4 = (short) r4     // Catch:{ all -> 0x011d }
            java.lang.String r4 = setMin(r15, r9, r4)     // Catch:{ all -> 0x011d }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x011d }
            r12[r7] = r4     // Catch:{ all -> 0x011d }
            java.lang.reflect.Method r4 = r10.getMethod(r6, r12)     // Catch:{ all -> 0x011d }
            r6 = 0
            java.lang.Object r4 = r4.invoke(r6, r14)     // Catch:{ all -> 0x011d }
            byte[] r10 = length     // Catch:{ all -> 0x0114 }
            byte r10 = r10[r8]     // Catch:{ all -> 0x0114 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0114 }
            r12 = r10 | 1906(0x772, float:2.671E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0114 }
            byte[] r14 = length     // Catch:{ all -> 0x0114 }
            byte r14 = r14[r17]     // Catch:{ all -> 0x0114 }
            int r14 = -r14
            short r14 = (short) r14     // Catch:{ all -> 0x0114 }
            java.lang.String r10 = setMin(r10, r12, r14)     // Catch:{ all -> 0x0114 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0114 }
            byte[] r12 = length     // Catch:{ all -> 0x0114 }
            r14 = 3429(0xd65, float:4.805E-42)
            byte r12 = r12[r14]     // Catch:{ all -> 0x0114 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0114 }
            r14 = 482(0x1e2, float:6.75E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x0114 }
            byte[] r15 = length     // Catch:{ all -> 0x0114 }
            byte r13 = r15[r13]     // Catch:{ all -> 0x0114 }
            short r13 = (short) r13     // Catch:{ all -> 0x0114 }
            java.lang.String r12 = setMin(r12, r14, r13)     // Catch:{ all -> 0x0114 }
            java.lang.reflect.Method r10 = r10.getMethod(r12, r6)     // Catch:{ all -> 0x0114 }
            java.lang.Object r4 = r10.invoke(r4, r6)     // Catch:{ all -> 0x0114 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0114 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0114 }
            r3[r5] = r4
            int r5 = r5 + 1
            r4 = 1
            r6 = 83
            r12 = 11
            goto L_0x007d
        L_0x0114:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x011c
            throw r1
        L_0x011c:
            throw r0
        L_0x011d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0125
            throw r1
        L_0x0125:
            throw r0
        L_0x0126:
            r4 = 29
            r5 = 15
            r6 = 3
        L_0x012b:
            int r9 = r7 + 1
            r10 = 2
            r0 = r3[r7]     // Catch:{ all -> 0x01d3 }
            int r0 = r1.setMin(r0)     // Catch:{ all -> 0x01d3 }
            r7 = 21
            r11 = 18
            r12 = 17
            switch(r0) {
                case -17: goto L_0x01cb;
                case -16: goto L_0x01b8;
                case -15: goto L_0x01aa;
                case -14: goto L_0x01a5;
                case -13: goto L_0x01a3;
                case -12: goto L_0x0195;
                case -11: goto L_0x0187;
                case -10: goto L_0x017f;
                case -9: goto L_0x017e;
                case -8: goto L_0x017b;
                case -7: goto L_0x016a;
                case -6: goto L_0x0153;
                case -5: goto L_0x0150;
                case -4: goto L_0x014d;
                case -3: goto L_0x0145;
                case -2: goto L_0x0142;
                case -1: goto L_0x0140;
                default: goto L_0x013d;
            }     // Catch:{ all -> 0x01d3 }
        L_0x013d:
            r7 = 1
            goto L_0x01d0
        L_0x0140:
            r7 = 3
            goto L_0x012b
        L_0x0142:
            r7 = 13
            goto L_0x012b
        L_0x0145:
            r1.setMin(r10)     // Catch:{ all -> 0x01d3 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x01d3 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01d3 }
            throw r0     // Catch:{ all -> 0x01d3 }
        L_0x014d:
            r7 = 29
            goto L_0x012b
        L_0x0150:
            r7 = 8
            goto L_0x012b
        L_0x0153:
            r11 = 1
            r1.getMax = r11     // Catch:{ all -> 0x01d3 }
            r1.setMin(r12)     // Catch:{ all -> 0x01d3 }
            r1.setMin(r7)     // Catch:{ all -> 0x01d3 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x01d3 }
            o.getItemPosition r0 = (o.getItemPosition) r0     // Catch:{ all -> 0x01d3 }
            o.GriverRVLoggerProxyImpl r0 = r0.setMax     // Catch:{ all -> 0x01d3 }
            r1.equals = r0     // Catch:{ all -> 0x01d3 }
            r0 = 22
            r1.setMin(r0)     // Catch:{ all -> 0x01d3 }
            goto L_0x013d
        L_0x016a:
            r11 = 1
            r1.getMax = r11     // Catch:{ all -> 0x01d3 }
            r1.setMin(r12)     // Catch:{ all -> 0x01d3 }
            r1.setMin(r7)     // Catch:{ all -> 0x01d3 }
            java.lang.Object r0 = r1.isInside     // Catch:{ all -> 0x01d3 }
            o.parseFailed r0 = (o.parseFailed) r0     // Catch:{ all -> 0x01d3 }
            r0.dispose()     // Catch:{ all -> 0x01d3 }
            goto L_0x013d
        L_0x017b:
            r7 = 15
            goto L_0x012b
        L_0x017e:
            return
        L_0x017f:
            int r0 = toIntRange     // Catch:{ all -> 0x01d3 }
            r1.getMax = r0     // Catch:{ all -> 0x01d3 }
        L_0x0183:
            r1.setMin(r6)     // Catch:{ all -> 0x01d3 }
            goto L_0x013d
        L_0x0187:
            r7 = 1
            r1.getMax = r7     // Catch:{ all -> 0x01c9 }
            r1.setMin(r12)     // Catch:{ all -> 0x01d3 }
            r1.setMin(r11)     // Catch:{ all -> 0x01d3 }
            int r0 = r1.setMin     // Catch:{ all -> 0x01d3 }
            equals = r0     // Catch:{ all -> 0x01d3 }
            goto L_0x013d
        L_0x0195:
            r0 = 40
            r1.setMin(r0)     // Catch:{ all -> 0x01d3 }
            int r0 = r1.setMin     // Catch:{ all -> 0x01d3 }
            if (r0 != 0) goto L_0x01d0
            r0 = 28
            r7 = 28
            goto L_0x012b
        L_0x01a3:
            r7 = 1
            goto L_0x012b
        L_0x01a5:
            int r0 = equals     // Catch:{ all -> 0x01d3 }
            r1.getMax = r0     // Catch:{ all -> 0x01d3 }
            goto L_0x0183
        L_0x01aa:
            r7 = 1
            r1.getMax = r7     // Catch:{ all -> 0x01c9 }
            r1.setMin(r12)     // Catch:{ all -> 0x01c9 }
            r1.setMin(r11)     // Catch:{ all -> 0x01c9 }
            int r0 = r1.setMin     // Catch:{ all -> 0x01c9 }
            toIntRange = r0     // Catch:{ all -> 0x01c9 }
            goto L_0x01d0
        L_0x01b8:
            r7 = 1
            r0 = 19
            r1.setMin(r0)     // Catch:{ all -> 0x01c9 }
            int r0 = r1.setMin     // Catch:{ all -> 0x01c9 }
            if (r0 != 0) goto L_0x01c5
            r0 = 50
            goto L_0x01c6
        L_0x01c5:
            r0 = r9
        L_0x01c6:
            r7 = r0
            goto L_0x012b
        L_0x01c9:
            r0 = move-exception
            goto L_0x01d5
        L_0x01cb:
            r7 = 1
            r0 = 7
            r7 = 7
            goto L_0x012b
        L_0x01d0:
            r7 = r9
            goto L_0x012b
        L_0x01d3:
            r0 = move-exception
            r7 = 1
        L_0x01d5:
            byte[] r11 = length
            byte r11 = r11[r8]
            byte r11 = (byte) r11
            r12 = r11 | 514(0x202, float:7.2E-43)
            short r12 = (short) r12
            int r14 = setMin
            int r14 = r14 >>> r10
            short r14 = (short) r14
            java.lang.String r11 = setMin(r11, r12, r14)
            java.lang.Class r11 = java.lang.Class.forName(r11)
            boolean r11 = r11.isInstance(r0)
            r12 = 10
            if (r11 == 0) goto L_0x01f9
            if (r9 < r13) goto L_0x01f9
            if (r9 > r12) goto L_0x01f9
            r11 = 11
            goto L_0x02aa
        L_0x01f9:
            byte[] r11 = length
            byte r14 = r11[r8]
            byte r14 = (byte) r14
            r15 = 436(0x1b4, float:6.11E-43)
            short r15 = (short) r15
            r16 = 5
            byte r11 = r11[r16]
            int r11 = -r11
            short r11 = (short) r11
            java.lang.String r11 = setMin(r14, r15, r11)
            java.lang.Class r11 = java.lang.Class.forName(r11)
            boolean r11 = r11.isInstance(r0)
            if (r11 == 0) goto L_0x021d
            if (r9 < r12) goto L_0x021d
            r11 = 11
            if (r9 > r11) goto L_0x021f
            goto L_0x02aa
        L_0x021d:
            r11 = 11
        L_0x021f:
            byte[] r12 = length
            byte r14 = r12[r8]
            byte r14 = (byte) r14
            r15 = r14 | 1890(0x762, float:2.648E-42)
            short r15 = (short) r15
            r16 = 655(0x28f, float:9.18E-43)
            byte r12 = r12[r16]
            int r12 = -r12
            short r12 = (short) r12
            java.lang.String r12 = setMin(r14, r15, r12)
            java.lang.Class r12 = java.lang.Class.forName(r12)
            boolean r12 = r12.isInstance(r0)
            if (r12 == 0) goto L_0x0242
            if (r9 < r5) goto L_0x0242
            r12 = 16
            if (r9 > r12) goto L_0x0242
            goto L_0x02aa
        L_0x0242:
            byte[] r12 = length
            byte r14 = r12[r8]
            byte r14 = (byte) r14
            r15 = r14 | 3282(0xcd2, float:4.599E-42)
            short r15 = (short) r15
            r16 = 3917(0xf4d, float:5.489E-42)
            byte r12 = r12[r16]
            short r12 = (short) r12
            java.lang.String r12 = setMin(r14, r15, r12)
            java.lang.Class r12 = java.lang.Class.forName(r12)
            boolean r12 = r12.isInstance(r0)
            if (r12 == 0) goto L_0x0266
            r12 = 23
            if (r9 < r12) goto L_0x0266
            r12 = 24
            if (r9 > r12) goto L_0x0266
            goto L_0x02aa
        L_0x0266:
            byte[] r12 = length
            byte r12 = r12[r8]
            byte r12 = (byte) r12
            r14 = r12 | 514(0x202, float:7.2E-43)
            short r14 = (short) r14
            int r15 = setMin
            int r15 = r15 >>> r10
            short r15 = (short) r15
            java.lang.String r12 = setMin(r12, r14, r15)
            java.lang.Class r12 = java.lang.Class.forName(r12)
            boolean r12 = r12.isInstance(r0)
            r14 = 51
            if (r12 == 0) goto L_0x028b
            if (r9 < r4) goto L_0x028b
            if (r9 > r14) goto L_0x028b
            r9 = 12
            r10 = 12
            goto L_0x02aa
        L_0x028b:
            byte[] r12 = length
            byte r15 = r12[r8]
            byte r15 = (byte) r15
            r4 = r15 | 3282(0xcd2, float:4.599E-42)
            short r4 = (short) r4
            byte r12 = r12[r16]
            short r12 = (short) r12
            java.lang.String r4 = setMin(r15, r4, r12)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            boolean r4 = r4.isInstance(r0)
            if (r4 == 0) goto L_0x02b6
            r4 = 46
            if (r9 < r4) goto L_0x02b6
            if (r9 > r14) goto L_0x02b6
        L_0x02aa:
            r1.equals = r0
            r0 = 47
            r1.setMin(r0)
            r7 = r10
            r4 = 29
            goto L_0x012b
        L_0x02b6:
            throw r0
        L_0x02b7:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02bf
            throw r1
        L_0x02bf:
            goto L_0x02c1
        L_0x02c0:
            throw r0
        L_0x02c1:
            goto L_0x02c0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getItemPosition.setMax():void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @javax.inject.Inject
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public getItemPosition(@org.jetbrains.annotations.NotNull o.registerDataSetObserver.getMin r5, @org.jetbrains.annotations.NotNull o.GriverRVLoggerProxyImpl r6, @org.jetbrains.annotations.NotNull android.content.Context r7, @org.jetbrains.annotations.NotNull o.UpdateAppCallback r8) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0040 }
            java.lang.String r0 = "holdLogin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)     // Catch:{ ClassCastException -> 0x0042 }
            int r0 = equals     // Catch:{  }
            r1 = 49
            r2 = r0 & -50
            r3 = r0 ^ -1
            r3 = r3 & r1
            r2 = r2 | r3
            r0 = r0 & r1
            int r0 = r0 << 1
            int r2 = r2 + r0
            int r0 = r2 % 128
            toIntRange = r0     // Catch:{ IllegalArgumentException -> 0x003c }
            int r2 = r2 % 2
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)     // Catch:{ NullPointerException -> 0x0038 }
            java.lang.String r0 = "splitFacade"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)     // Catch:{ UnsupportedOperationException -> 0x0036 }
            r4.<init>()
            r4.getMax = r5
            r4.setMax = r6
            r4.getMin = r7
            r4.IsOverlapping = r8
            return
        L_0x0036:
            r5 = move-exception
            goto L_0x0043
        L_0x0038:
            r5 = move-exception
            goto L_0x003b
        L_0x003a:
            r5 = move-exception
        L_0x003b:
            throw r5
        L_0x003c:
            r5 = move-exception
            goto L_0x0043
        L_0x003e:
            r5 = move-exception
            goto L_0x0043
        L_0x0040:
            r5 = move-exception
            goto L_0x0043
        L_0x0042:
            r5 = move-exception
        L_0x0043:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getItemPosition.<init>(o.registerDataSetObserver$getMin, o.GriverRVLoggerProxyImpl, android.content.Context, o.UpdateAppCallback):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/login/HoldLoginPresenter$holdLogin$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/model/rpc/response/LoginResponse;", "onError", "", "e", "", "onNext", "loginResponse", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends GriverAppVirtualHostProxy<LoginResponse> {
        final /* synthetic */ getItemPosition getMin;

        getMax(getItemPosition getitemposition) {
            this.getMin = getitemposition;
        }

        public final /* synthetic */ void onNext(Object obj) {
            LoginResponse loginResponse = (LoginResponse) obj;
            Intrinsics.checkNotNullParameter(loginResponse, ChallengePinWithFaceActivity.LOGIN_RESPONSE);
            getItemPosition.setMax(this.getMin).dismissProgress();
            getItemPosition.length(this.getMin, loginResponse);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            getItemPosition.setMax(this.getMin).dismissProgress();
            getItemPosition.setMin(this.getMin, th);
            LoginFailureException loginFailureException = new LoginFailureException(th);
            Intrinsics.checkNotNullParameter(loginFailureException, "$this$logToCrashlytics");
            try {
                FirebaseCrashlytics.getInstance().recordException(loginFailureException);
            } catch (Exception unused) {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<String> {
        final /* synthetic */ getItemPosition this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(getItemPosition getitemposition) {
            super(0);
            this.this$0 = getitemposition;
        }

        @NotNull
        public final String invoke() {
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
            ScreenBrightnessBridgeExtension.Grayscale$Algorithm();
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
            return ScreenBrightnessBridgeExtension.Grayscale$Algorithm();
        }
    }
}
