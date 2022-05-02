package o;

import com.alipay.iap.android.wallet.acl.member.MemberService;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class BaseRenderImpl {
    public static final /* synthetic */ int[] getMin;

    static {
        int[] iArr = new int[MemberService.MemberInfoFetchStrategy.values().length];
        getMin = iArr;
        iArr[MemberService.MemberInfoFetchStrategy.LOCAL_USER_ID_ONLY.ordinal()] = 1;
    }
}
