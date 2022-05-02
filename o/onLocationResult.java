package o;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001e\u0010\u0005\u001a\u00020\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lid/dana/mapper/FaceAuthenticationModelMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/domain/model/rpc/response/CheckRegistrationResponse;", "Lid/dana/model/FaceAuthenticationModel;", "()V", "map", "oldItem", "Lid/dana/model/LoginAuthenticationMethod;", "response", "Lid/dana/domain/model/rpc/response/LoginAuthenticationOptionResponse;", "loginAuthenticationOptionResponses", "", "index", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onLocationResult extends setSpeed<setEncryptProxy, inputFocus4Android> {
    public final /* synthetic */ Object map(Object obj) {
        setEncryptProxy setencryptproxy = (setEncryptProxy) obj;
        if (setencryptproxy != null) {
            return new inputFocus4Android(getMin(setencryptproxy.getLoginAuthenticationOptionResponses(), setencryptproxy.getPasswordAuthMethodIndex()), getMin(setencryptproxy.getLoginAuthenticationOptionResponses(), setencryptproxy.getFaceLoginAuthMethodIndex()), setencryptproxy.getSecurityId());
        }
        return null;
    }

    @NotNull
    private static OrientationBridgeExtension getMin(@Nullable List<? extends initWithKey> list, int i) {
        if (i == -1) {
            return new OrientationBridgeExtension();
        }
        return getMax(list != null ? (initWithKey) list.get(i) : null);
    }

    @NotNull
    private static OrientationBridgeExtension getMax(@Nullable initWithKey initwithkey) {
        if (initwithkey == null) {
            return new OrientationBridgeExtension();
        }
        OrientationBridgeExtension orientationBridgeExtension = new OrientationBridgeExtension();
        orientationBridgeExtension.length = initwithkey.isRiskFlag();
        orientationBridgeExtension.getMax = initwithkey.isEnrollFlag();
        orientationBridgeExtension.setMin = initwithkey.isKycFlag();
        orientationBridgeExtension.setMax = initwithkey.getAuthenticationMethod();
        return orientationBridgeExtension;
    }
}
