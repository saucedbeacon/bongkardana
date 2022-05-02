package o;

import android.content.Context;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import java.util.List;
import o.Pool;
import o.TitleBarRightButtonView;

public final class getBoolean extends setRepeatCount<putBoolean> implements readStringArray2 {
    public getBoolean(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
    }

    public final Class<putBoolean> getFacadeClass() {
        return putBoolean.class;
    }

    public final TitleBarRightButtonView.AnonymousClass1<freeAll> queryActiveMissions(int i, int i2) {
        putFloat putfloat = new putFloat();
        putfloat.envInfo = generateMobileEnvInfo();
        putfloat.pageSize = i;
        putfloat.pageNumber = i2;
        return wrapper(new ByteOrderValues(putfloat));
    }

    public final TitleBarRightButtonView.AnonymousClass1<getLong> getMissionDetail(String str, boolean z) {
        putLong putlong = new putLong(UserInfoManager.instance().getUserId(), str, z);
        putlong.envInfo = generateMobileEnvInfo();
        return wrapper(new writeStringArray2(putlong));
    }

    public final TitleBarRightButtonView.AnonymousClass1<putDouble> getMissionSummaryResult(String str) {
        putInt putint = new putInt();
        putint.setUserId(str);
        return wrapper(new writeStringList2(putint));
    }

    public final TitleBarRightButtonView.AnonymousClass1<Pool.Poolable> trackUserQuest(String str, String str2, boolean z) {
        getInt getint = new getInt();
        getint.questId = str2;
        getint.missionId = str;
        getint.autoRedeem = z;
        return wrapper(new putShort(getint));
    }

    public final TitleBarRightButtonView.AnonymousClass1<RVClassLoaderFactory> redeemQuest(String str, String str2) {
        Pool pool = new Pool(str, str2, UserInfoManager.instance().getUserId());
        pool.envInfo = generateMobileEnvInfo();
        return wrapper(new getByte(pool));
    }

    public final TitleBarRightButtonView.AnonymousClass1<onInterrupt> redeemMission(String str) {
        getDouble getdouble = new getDouble(str);
        getdouble.envInfo = generateMobileEnvInfo();
        return wrapper(new getShort(getdouble));
    }

    public final TitleBarRightButtonView.AnonymousClass1<freeAll> queryMissionListByStatus(int i, int i2, List<String> list) {
        putFloat putfloat = new putFloat();
        putfloat.envInfo = generateMobileEnvInfo();
        putfloat.pageSize = i;
        putfloat.pageNumber = i2;
        return wrapper(new putByte(list, putfloat));
    }
}
