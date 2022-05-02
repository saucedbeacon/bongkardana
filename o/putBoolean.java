package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import o.Pool;

public interface putBoolean {
    @OperationType("alipayplus.mobilewallet.promogames.user.queryMissionDetail")
    @SignCheck
    getLong queryMissionDetail(putLong putlong);

    @OperationType("alipayplus.mobilewallet.promogames.user.queryMissionList")
    @SignCheck
    freeAll queryMissionList(putFloat putfloat);

    @OperationType("alipayplus.mobilewallet.promogames.user.queryMissionListByStatus")
    @SignCheck
    freeAll queryMissionListByStatus(getFloat getfloat);

    @OperationType("alipayplus.mobilewallet.promogames.user.queryMissionSummary")
    @SignCheck
    putDouble queryMissionSummary(putInt putint);

    @OperationType("alipayplus.mobilewallet.promogames.user.redeemMission")
    @SignCheck
    onInterrupt redeemMission(getDouble getdouble);

    @OperationType("alipayplus.mobilewallet.promogames.user.redeemQuest")
    @SignCheck
    RVClassLoaderFactory redeemQuest(Pool pool);

    @OperationType("alipayplus.mobilewallet.promogames.user.updateQuest")
    @SignCheck
    Pool.Poolable updateQuest(getInt getint);
}
