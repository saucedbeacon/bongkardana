package o;

import android.content.Context;
import java.util.List;
import javax.inject.Inject;
import o.IIpcChannel;
import o.RVParams;
import o.TitleBarRightButtonView;

public class RVEvents extends setRepeatCount<canOverride> implements ServiceBeanManagerImpl {
    @Inject
    RVEvents(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
    }

    public Class<canOverride> getFacadeClass() {
        return canOverride.class;
    }

    public TitleBarRightButtonView.AnonymousClass1<transSyncThreadNames> getCategories(int i, int i2) {
        ThreadType threadType = new ThreadType();
        threadType.envInfo = generateMobileEnvInfo();
        threadType.setPageSize(i);
        threadType.setPageNumber(i2);
        return wrapper(new IIpcChannel(threadType));
    }

    public transSyncThreadNames getCachedCategories() {
        throw new UnsupportedOperationException("Unable to get cache on network data");
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveCategories(transSyncThreadNames transsyncthreadnames) {
        throw new UnsupportedOperationException("Have yet support post data to BE");
    }

    public TitleBarRightButtonView.AnonymousClass1<ByteArrayPools> queryAllPromo(int i, int i2, String str) {
        ParamRequired paramRequired = new ParamRequired();
        paramRequired.pageSize = i;
        paramRequired.pageNumber = i2;
        paramRequired.sortBy = str;
        paramRequired.envInfo = generateMobileEnvInfo();
        return wrapper(new RVParams.ParamType(paramRequired));
    }

    public TitleBarRightButtonView.AnonymousClass1<UsePermission> queryCategorizedPromo(List<String> list, int i, int i2, String str, String str2, double d, double d2) {
        Remote remote = new Remote();
        remote.pageSize = i;
        remote.pageNumber = i2;
        remote.categories = list;
        remote.sortBy = str;
        remote.filterBy = str2;
        remote.latitude = d;
        remote.longitude = d2;
        remote.envInfo = generateMobileEnvInfo();
        return wrapper(new RVStartParams(remote));
    }

    public TitleBarRightButtonView.AnonymousClass1<Local> getPromoAds(int i, int i2, double d, double d2, int i3) {
        NativePermissionRequire nativePermissionRequire = new NativePermissionRequire(i3, i2, i);
        nativePermissionRequire.envInfo = generateMobileEnvInfo();
        nativePermissionRequire.envInfo.locationInfo.latitude = String.valueOf(d);
        nativePermissionRequire.envInfo.locationInfo.longitude = String.valueOf(d2);
        return wrapper(new IIpcChannel.Stub(nativePermissionRequire));
    }

    public TitleBarRightButtonView.AnonymousClass1<RVParams> getUserLastCoordinate(String str) {
        throw new UnsupportedOperationException();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveUserLastCoordinate(String str, RVParams rVParams) {
        throw new UnsupportedOperationException();
    }

    public TitleBarRightButtonView.AnonymousClass1<Integer> getCurrentAdsPageNumber(String str) {
        throw new UnsupportedOperationException();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveCurrentAdsPageNumber(String str, int i) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1031220838, oncanceled);
            onCancelLoad.getMin(1031220838, oncanceled);
        }
        throw new UnsupportedOperationException();
    }
}
