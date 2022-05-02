package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alipay.imobile.network.sslpinning.api.ISSLPinningManager;
import com.alipay.imobile.network.sslpinning.api.OnAddRemoteCertificatesListener;
import com.alipay.imobile.network.sslpinning.api.RemoteCertificateDownloadException;
import java.util.List;
import o.TitleBarRightButtonView;

class ActionEventListener$2 implements OnAddRemoteCertificatesListener {
    final /* synthetic */ int getMin;
    final /* synthetic */ List length;
    final /* synthetic */ TitleBarRightButtonView.AnonymousClass2 setMax;
    final /* synthetic */ appendExtraInfo setMin$4aafb16f;

    public ActionEventListener$2(appendExtraInfo appendextrainfo, List list, int i, TitleBarRightButtonView.AnonymousClass2 r4) {
        this.setMin$4aafb16f = appendextrainfo;
        this.length = list;
        this.getMin = i;
        this.setMax = r4;
    }

    public final void onSuccess() {
        Throwable cause;
        try {
            String str = (String) ((Class) setKeep.getMin(8 - TextUtils.indexOf("", '0'), 'E' - AndroidCharacter.getMirror('0'), (char) (-1 - ((byte) KeyEvent.getModifierMetaStateMask())))).getDeclaredMethod("access$000", (Class[]) null).invoke((Object) null, (Object[]) null);
            StringBuilder sb = new StringBuilder("download success certificatesUrl:");
            sb.append(this.length);
            updateActionSheetContent.d(str, sb.toString());
            appendExtraInfo appendextrainfo = this.setMin$4aafb16f;
            try {
                Object[] objArr = new Object[2];
                objArr[1] = true;
                objArr[0] = appendextrainfo;
                ((Boolean) ((Class) setKeep.getMin(138 - PhoneNumberUtils.toaFromString(""), 22 - (SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), (char) (ViewConfiguration.getLongPressTimeout() >> 16))).getDeclaredMethod("access$102", new Class[]{(Class) setKeep.getMin((Process.myPid() >> 22) + 9, KeyEvent.getDeadChar(0, 0) + 21, (char) (ViewConfiguration.getWindowTouchSlop() >> 8)), Boolean.TYPE}).invoke((Object) null, objArr)).booleanValue();
                try {
                    ((ISSLPinningManager) ((Class) setKeep.getMin(8 - TextUtils.indexOf("", '0', 0), 21 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) Color.argb(0, 0, 0, 0))).getDeclaredMethod("access$200", new Class[]{(Class) setKeep.getMin(View.combineMeasuredStates(0, 0) + 9, 21 - TextUtils.getOffsetAfter("", 0), (char) View.MeasureSpec.getMode(0))}).invoke((Object) null, new Object[]{this.setMin$4aafb16f})).setPinningMode(this.getMin);
                    try {
                        try {
                            ((setParam) ((Class) setKeep.getMin((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8, 20 - TextUtils.lastIndexOf("", '0'), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))).getDeclaredMethod("access$300", new Class[]{(Class) setKeep.getMin((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9, TextUtils.indexOf("", '0', 0, 0) + 22, (char) (ImageFormat.getBitsPerPixel(0) + 1))}).invoke((Object) null, new Object[]{this.setMin$4aafb16f})).setMax(((ISSLPinningManager) ((Class) setKeep.getMin(Color.red(0) + 9, 21 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1))))).getMethod("access$200", new Class[]{(Class) setKeep.getMin(View.MeasureSpec.getMode(0) + 9, ImageFormat.getBitsPerPixel(0) + 22, (char) (ViewConfiguration.getJumpTapTimeout() >> 16))}).invoke((Object) null, new Object[]{this.setMin$4aafb16f})).getCertificates());
                            try {
                                ((setParam) ((Class) setKeep.getMin(9 - View.getDefaultSize(0, 0), 20 - ExpandableListView.getPackedPositionChild(0), (char) (-1 - Process.getGidForName("")))).getMethod("access$300", new Class[]{(Class) setKeep.getMin((SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)) + 8, TextUtils.getOffsetAfter("", 0) + 21, (char) (-1 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1))))}).invoke((Object) null, new Object[]{this.setMin$4aafb16f})).length(this.getMin);
                                this.setMax.onNext(Boolean.TRUE);
                                this.setMax.onComplete();
                            } catch (Throwable th) {
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        } finally {
                            cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                        }
                    } finally {
                        Throwable cause2 = th.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                    }
                } finally {
                    Throwable cause3 = th.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                }
            } finally {
                Throwable cause4 = th.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
            }
        } finally {
            Throwable cause5 = th.getCause();
            if (cause5 != null) {
                throw cause5;
            }
        }
    }

    public final void onFailure(RemoteCertificateDownloadException remoteCertificateDownloadException) {
        this.setMax.onNext(Boolean.FALSE);
        this.setMax.onComplete();
    }
}
