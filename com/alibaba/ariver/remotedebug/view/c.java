package com.alibaba.ariver.remotedebug.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.dialog.CreateDialogParam;
import com.alibaba.ariver.app.api.point.dialog.DialogPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.R;
import com.alibaba.ariver.remotedebug.core.RemoteDebugController;
import com.alibaba.ariver.remotedebug.core.state.a;
import com.alibaba.ariver.remotedebug.extension.RemoteDebugStatePoint;

public class c implements ActionEventListener {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10149a = c.class.getSimpleName();
    private a b = a.STATE_NON_REMOTE_DEBUG;
    /* access modifiers changed from: private */
    public Activity c;
    /* access modifiers changed from: private */
    public b d;
    /* access modifiers changed from: private */
    public a e;
    /* access modifiers changed from: private */
    public boolean f = false;
    private RemoteDebugController.RemoteDebugExitClickListener g;
    private App h;
    /* access modifiers changed from: private */
    public Dialog i;

    public c(App app, RemoteDebugController.RemoteDebugExitClickListener remoteDebugExitClickListener) {
        this.h = app;
        this.g = remoteDebugExitClickListener;
    }

    public void a(Activity activity) {
        if (activity != null) {
            this.c = activity;
            return;
        }
        throw new NullPointerException("activity cannot be null!");
    }

    public void a(a aVar) {
        String str = f10149a;
        StringBuilder sb = new StringBuilder("notifyStateChanged...state:");
        sb.append(aVar);
        sb.append(", old state: ");
        sb.append(this.b);
        RVLogger.d(str, sb.toString());
        if (this.b != aVar) {
            this.b = aVar;
            switch (AnonymousClass2.f10152a[aVar.ordinal()]) {
                case 1:
                    a();
                    return;
                case 2:
                    b();
                    return;
                case 3:
                    c();
                    return;
                case 4:
                    h();
                    return;
                case 5:
                    d();
                    return;
                case 6:
                    e();
                    return;
                case 7:
                    f();
                    return;
                case 8:
                    g();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.alibaba.ariver.remotedebug.view.c$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10152a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.alibaba.ariver.remotedebug.core.state.a[] r0 = com.alibaba.ariver.remotedebug.core.state.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10152a = r0
                com.alibaba.ariver.remotedebug.core.state.a r1 = com.alibaba.ariver.remotedebug.core.state.a.STATE_CONNECTING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10152a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alibaba.ariver.remotedebug.core.state.a r1 = com.alibaba.ariver.remotedebug.core.state.a.STATE_CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10152a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alibaba.ariver.remotedebug.core.state.a r1 = com.alibaba.ariver.remotedebug.core.state.a.STATE_CONNECT_FAILED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10152a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.alibaba.ariver.remotedebug.core.state.a r1 = com.alibaba.ariver.remotedebug.core.state.a.STATE_NETWORK_UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10152a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.alibaba.ariver.remotedebug.core.state.a r1 = com.alibaba.ariver.remotedebug.core.state.a.STATE_REMOTE_DISCONNECTED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f10152a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.alibaba.ariver.remotedebug.core.state.a r1 = com.alibaba.ariver.remotedebug.core.state.a.STATE_HIT_BREAKPOINT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f10152a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.alibaba.ariver.remotedebug.core.state.a r1 = com.alibaba.ariver.remotedebug.core.state.a.STATE_RELEASE_BREAKPOINT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f10152a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.alibaba.ariver.remotedebug.core.state.a r1 = com.alibaba.ariver.remotedebug.core.state.a.STATE_EXITED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.remotedebug.view.c.AnonymousClass2.<clinit>():void");
        }
    }

    private void a() {
        if (this.b != a.STATE_CONNECTING) {
            RVLogger.d(f10149a, "remoteDebugConnecting...state error");
        } else {
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    if (c.this.e == null) {
                        a unused = c.this.e = new a(c.this.c);
                        c.this.e.setActionEventListener(c.this);
                    }
                    c.this.e.a();
                }
            });
        }
    }

    private void b() {
        if (this.b != a.STATE_CONNECTED) {
            RVLogger.d(f10149a, "remoteDebugConnected...state error");
        } else {
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    if (c.this.e == null) {
                        a unused = c.this.e = new a(c.this.c);
                        c.this.e.setActionEventListener(c.this);
                    }
                    c.this.e.b();
                }
            });
        }
    }

    private void c() {
        if (this.b != a.STATE_CONNECT_FAILED) {
            RVLogger.d(f10149a, "remoteDebugConnectFailed...state error");
        } else {
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    if (c.this.d == null) {
                        b unused = c.this.d = new b(c.this.c);
                        c.this.d.setActionEventListener(c.this);
                    }
                    c.this.d.setStateText(c.this.c.getString(R.string.tiny_remote_debug_connect_interrupt));
                    c.this.d.setVisibility(0);
                    if (c.this.e == null) {
                        a unused2 = c.this.e = new a(c.this.c);
                        c.this.e.setActionEventListener(c.this);
                    }
                    c.this.e.c();
                }
            });
        }
    }

    private void d() {
        if (this.b != a.STATE_REMOTE_DISCONNECTED) {
            RVLogger.d(f10149a, "remoteDisconnected...state error");
        } else if (!ExtensionPoint.as(RemoteDebugStatePoint.class).create().onDisconnected(this.h)) {
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    boolean unused = c.this.f = true;
                    if (c.this.d == null) {
                        b unused2 = c.this.d = new b(c.this.c);
                        c.this.d.setActionEventListener(c.this);
                    }
                    c.this.d.setStateText(c.this.c.getResources().getString(R.string.tiny_remote_debug_connect_interrupt));
                    c.this.d.setVisibility(0);
                }
            });
        }
    }

    private void e() {
        if (this.b != a.STATE_HIT_BREAKPOINT) {
            RVLogger.d(f10149a, "hitBreakpoint...state error");
        } else {
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    if (c.this.d == null) {
                        b unused = c.this.d = new b(c.this.c);
                        c.this.d.setActionEventListener(c.this);
                    }
                    c.this.d.setStateText(c.this.c.getResources().getString(R.string.tiny_remote_debug_hit_break_point));
                    c.this.d.setVisibility(0);
                }
            });
        }
    }

    private void f() {
        if (this.b != a.STATE_RELEASE_BREAKPOINT) {
            RVLogger.d(f10149a, "releaseBreakpoint...state error");
        } else {
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    if (c.this.d != null) {
                        c.this.d.setVisibility(8);
                    }
                }
            });
        }
    }

    private void g() {
        if (this.b != a.STATE_EXITED) {
            RVLogger.d(f10149a, "exitDebugMode...state error");
            return;
        }
        RemoteDebugController.RemoteDebugExitClickListener remoteDebugExitClickListener = this.g;
        if (remoteDebugExitClickListener != null) {
            remoteDebugExitClickListener.onRemoteDebugExitClick();
        }
    }

    private void h() {
        if (this.b != a.STATE_NETWORK_UNAVAILABLE) {
            RVLogger.d(f10149a, "handleNetworkUnavailable...state error");
        } else {
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    if (c.this.d == null) {
                        b unused = c.this.d = new b(c.this.c);
                        c.this.d.setActionEventListener(c.this);
                    }
                    c.this.d.setStateText(c.this.c.getResources().getString(R.string.tiny_remote_debug_no_network));
                    c.this.d.setVisibility(0);
                }
            });
        }
    }

    public void exitRemoteDebug() {
        if (this.f) {
            a(a.STATE_EXITED);
        } else {
            i();
        }
    }

    private void i() {
        Dialog dialog = this.i;
        if (dialog != null) {
            dialog.show();
            return;
        }
        Resources resources = this.c.getResources();
        CreateDialogParam createDialogParam = new CreateDialogParam(resources.getString(R.string.tiny_remote_debug_exit_dialog_title), (String) null, resources.getString(R.string.tiny_remote_debug_exit_confirm), resources.getString(R.string.tiny_remote_debug_exit_cancel), (String) null);
        createDialogParam.cancelable = false;
        createDialogParam.negativeListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (c.this.i != null) {
                    c.this.i.dismiss();
                }
            }
        };
        createDialogParam.positiveListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (c.this.i != null) {
                    c.this.a(a.STATE_EXITED);
                }
            }
        };
        Dialog createDialog = ExtensionPoint.as(DialogPoint.class).node(this.h).create().createDialog(this.c, createDialogParam);
        this.i = createDialog;
        createDialog.show();
    }
}
