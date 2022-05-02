package o;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.GriverOpenAuthExtension;
import o.ShareRecyclerAdapter;

final class RVCommonAbilityProxy implements Function1 {
    public static final RVCommonAbilityProxy length = new RVCommonAbilityProxy();

    public final Object invoke(Object obj) {
        return Unit.INSTANCE;
    }

    public final class Performance implements getBindingAdapter<OpenSettingItem> {
        public static void setMin(OpenSettingItem openSettingItem, StartRMData startRMData, collect collect) {
            openSettingItem.isInside = startRMData;
            openSettingItem.equals = collect;
        }

        public static void setMax(OpenSettingItem openSettingItem, GVErrorView gVErrorView, GriverParseFailedPoint griverParseFailedPoint, GriverOpenAuthExtension.RevokeCallback revokeCallback, createSplashView createsplashview, defaultToolbarMenus defaulttoolbarmenus, GriverCreateDialogParam griverCreateDialogParam, OptionMenu optionMenu) {
            openSettingItem.setMin = gVErrorView;
            openSettingItem.getMax = griverParseFailedPoint;
            openSettingItem.getMin = revokeCallback;
            openSettingItem.length = createsplashview;
            openSettingItem.toIntRange = defaulttoolbarmenus;
            openSettingItem.IsOverlapping = griverCreateDialogParam;
            openSettingItem.setMax = optionMenu;
        }

        public static void getMin(OpenSettingItem openSettingItem, setBlockNetworkImage setblocknetworkimage, setDefaultFixedFontSize setdefaultfixedfontsize, pageDown pagedown) {
            openSettingItem.toFloatRange = setblocknetworkimage;
            openSettingItem.toDoubleRange = setdefaultfixedfontsize;
            openSettingItem.values = pagedown;
        }

        public static void setMin(OpenSettingItem openSettingItem, BetterBleServiceImpl betterBleServiceImpl, BleDevice bleDevice, createBleDevice createbledevice) {
            openSettingItem.toString = betterBleServiceImpl;
            openSettingItem.FastBitmap$CoordinateSystem = bleDevice;
            openSettingItem.hashCode = createbledevice;
        }

        public static void getMin(OpenSettingItem openSettingItem, GriverMonitor griverMonitor) {
            openSettingItem.Mean$Arithmetic = griverMonitor;
        }

        public static void setMin(OpenSettingItem openSettingItem, getPerformanceTracker getperformancetracker, Context context, sendData senddata, ShareRecyclerAdapter.ShareViewHolder shareViewHolder) {
            openSettingItem.valueOf = getperformancetracker;
            openSettingItem.Grayscale$Algorithm = context;
            openSettingItem.invokeSuspend = senddata;
            openSettingItem.invoke = shareViewHolder;
        }
    }
}
