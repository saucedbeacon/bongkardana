package com.alibaba.griver.ui.titlebar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.DimensionUtil;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.h5.point.GriverOptionMenuClickPoint;
import com.alibaba.griver.base.common.adapter.ImageListener;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.utils.ImageUtils;
import com.alibaba.griver.ui.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NebulaPopMenu {
    public static final String TAG = "NebulaPopMenu";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public List<PopMenuItem> f10631a;
    private List<PopMenuItem> b;
    /* access modifiers changed from: private */
    public PopupWindow c;
    /* access modifiers changed from: private */
    public Page d;
    private boolean e;
    /* access modifiers changed from: private */
    public boolean f;
    private NebulaPopMenuItemHolder g;
    private int h;
    private int i;
    /* access modifiers changed from: private */
    public List<View> j;
    /* access modifiers changed from: private */
    public View k;
    private Context l;
    /* access modifiers changed from: private */
    public FrameLayout m;
    private ViewGroup.LayoutParams n;

    /* renamed from: o  reason: collision with root package name */
    private View f10632o;
    /* access modifiers changed from: private */
    public LinearLayout p;
    private boolean q = false;
    private View.OnClickListener r = new View.OnClickListener() {
        public void onClick(View view) {
            if (NebulaPopMenu.this.c != null && NebulaPopMenu.this.c.isShowing()) {
                NebulaPopMenu.this.c.dismiss();
            }
            Object tag = view.getTag();
            if (tag instanceof Integer) {
                PopMenuItem popMenuItem = (PopMenuItem) NebulaPopMenu.this.f10631a.get(((Integer) tag).intValue());
                popMenuItem.redDotNum = "-1";
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", (Object) popMenuItem.name);
                jSONObject.put("tag", (Object) popMenuItem.tag);
                jSONObject.put("title", (Object) popMenuItem.name);
                if (NebulaPopMenu.this.f) {
                    jSONObject.put("popMenuType", (Object) "popmenu");
                }
                ExtensionPoint.as(GriverOptionMenuClickPoint.class).node(NebulaPopMenu.this.d).create().menuClick(jSONObject);
            }
        }
    };

    public NebulaPopMenu(Context context) {
        b();
        this.e = true;
        this.f = false;
        this.l = context;
    }

    private void a() {
        if (this.m == null) {
            Context context = this.l;
            if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
                this.m = (FrameLayout) ((Activity) this.l).findViewById(16908290);
            }
        }
    }

    public void setPage(Page page) {
        this.d = page;
    }

    public void setShowPopMenu(boolean z) {
        this.f = z;
    }

    public boolean hasMenu(String str) {
        List<PopMenuItem> list = this.f10631a;
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
            for (int size = this.f10631a.size() - 1; size >= 0; size--) {
                PopMenuItem popMenuItem = this.f10631a.get(size);
                if (popMenuItem != null && str.equals(popMenuItem.tag)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setMenu(JSONArray jSONArray, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        List<PopMenuItem> list;
        List<PopMenuItem> list2;
        if (jSONArray != null) {
            if ((z || this.f) && (list2 = this.f10631a) != null) {
                list2.clear();
            }
            if (this.f && (list = this.f10631a) != null) {
                list.clear();
            }
            if (!z2 || !jSONArray.isEmpty()) {
                synchronized (this.f10631a) {
                    i2 = 0;
                    i3 = 0;
                    for (int i6 = 0; i6 < this.f10631a.size(); i6++) {
                        if (this.f10631a.get(i6).temp) {
                            i3++;
                        }
                    }
                }
                if (z2 && i3 >= 11) {
                    RVLogger.e(TAG, "reach max temp count!");
                } else if (jSONArray == null || this.f10631a.size() + jSONArray.size() < 11) {
                    int i7 = 11 - i3;
                    this.b = new ArrayList();
                    for (int i8 = 0; i8 < jSONArray.size(); i8++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i8);
                        String string = JSONUtils.getString(jSONObject, "name");
                        String string2 = JSONUtils.getString(jSONObject, "tag");
                        String string3 = JSONUtils.getString(jSONObject, "icon");
                        String string4 = JSONUtils.getString(jSONObject, "redDot");
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                            if (!a(string, string2)) {
                                if (string.length() > 8) {
                                    string = string.substring(0, 8);
                                }
                                Drawable a2 = a(string2);
                                if (this.f) {
                                    a2 = null;
                                }
                                PopMenuItem popMenuItem = new PopMenuItem(string, string2, a2, z2);
                                if (this.f && !TextUtils.isEmpty(string4)) {
                                    popMenuItem.redDotNum = string4;
                                }
                                popMenuItem.iconUrl = string3;
                                if (this.b.size() >= i7) {
                                    break;
                                } else if ("ppchatShare".equals(string2)) {
                                    popMenuItem.temp = false;
                                    this.f10631a.add(0, popMenuItem);
                                } else if ("ppchatReportAbuse".equals(string2)) {
                                    popMenuItem.temp = false;
                                    this.f10631a.add(popMenuItem);
                                } else {
                                    this.b.add(popMenuItem);
                                }
                            } else {
                                StringBuilder sb = new StringBuilder("existed tag: ");
                                sb.append(string2);
                                sb.append(" name: ");
                                sb.append(string);
                                RVLogger.w(TAG, sb.toString());
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("invalid tag: ");
                            sb2.append(string2);
                            sb2.append(" name: ");
                            sb2.append(string);
                            RVLogger.w(TAG, sb2.toString());
                        }
                    }
                    synchronized (this.f10631a) {
                        i4 = -1;
                        i5 = -1;
                        for (int i9 = 0; i9 < this.f10631a.size(); i9++) {
                            PopMenuItem popMenuItem2 = this.f10631a.get(i9);
                            if (popMenuItem2.temp) {
                                if (i4 < 0) {
                                    i4 = i9;
                                }
                            } else if (i5 < 0 && (i9 != 0 || !"ppchatShare".equals(popMenuItem2.tag))) {
                                i5 = i9;
                            }
                        }
                    }
                    if (i4 == -1) {
                        i4 = (this.f10631a.size() <= 0 || !"ppchatShare".equals(this.f10631a.get(0).tag)) ? 0 : 1;
                    }
                    if (i5 != -1) {
                        i2 = i5;
                    }
                    if (z2) {
                        this.f10631a.addAll(i4, this.b);
                    } else {
                        this.f10631a.addAll(i2, this.b);
                    }
                    d();
                } else {
                    RVLogger.e(TAG, "(oriCount + addCount) >= MAX_TEMP_COUNT!");
                }
            } else {
                RVLogger.d(TAG, "menu not set");
            }
        }
    }

    public void setMenu(JSONArray jSONArray, boolean z) {
        setMenu(jSONArray, false, z);
    }

    public void addMenu(int i2, PopMenuItem popMenuItem) {
        List<PopMenuItem> list = this.f10631a;
        if (list != null && popMenuItem != null) {
            list.add(i2, popMenuItem);
        }
    }

    public void removeMenu(String str) {
        List<PopMenuItem> list = this.f10631a;
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
            int size = this.f10631a.size() - 1;
            while (size >= 0) {
                PopMenuItem popMenuItem = this.f10631a.get(size);
                if (popMenuItem == null || !str.equals(popMenuItem.tag)) {
                    size--;
                } else {
                    this.f10631a.remove(size);
                    return;
                }
            }
        }
    }

    public void resetMenu() {
        for (int size = this.f10631a.size() - 1; size >= 0; size--) {
            if (this.f10631a.get(size).temp) {
                this.f10631a.remove(size);
            }
        }
        this.e = true;
        if (this.f10631a.size() == 0) {
            b();
        }
    }

    public void clearMenuList() {
        List<PopMenuItem> list = this.f10631a;
        if (list != null && !this.q) {
            list.clear();
            this.q = true;
        }
    }

    public void showMenu(View view) {
        a();
        c();
        PopupWindow popupWindow = this.c;
        if (popupWindow != null && popupWindow.isShowing()) {
            RVLogger.d(TAG, "menu is showing!");
        } else if (this.g.getListCount() == 0) {
            if (GriverEnv.isDebuggable()) {
                Toast.makeText(GriverEnv.getApplicationContext(), R.string.griver_ui_no_menu_to_show, 0).show();
            }
        } else if (this.e || this.c == null) {
            this.p.setVerticalScrollBarEnabled(true);
            this.p.setOnClickListener(this.r);
            if (this.f) {
                this.j = new ArrayList();
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.g.getListCount(); i3++) {
                if (i3 != 0) {
                    View view2 = new View(this.l);
                    view2.setBackgroundResource(R.drawable.griver_ui_popmenu_divider);
                    this.p.addView(view2, new ViewGroup.LayoutParams(-1, 1));
                }
                View itemView = this.g.getItemView(i3, this.p);
                itemView.setOnClickListener(this.r);
                try {
                    itemView.measure(0, 0);
                } catch (Exception unused) {
                    i2 = DimensionUtil.dip2px(this.l, 200.0f);
                }
                int measuredWidth = itemView.getMeasuredWidth();
                if (i2 <= measuredWidth) {
                    i2 = measuredWidth;
                }
                this.p.addView(itemView);
                if (this.f) {
                    this.j.add(itemView);
                }
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            this.h = ((DimensionUtil.getScreenWidth(this.l) - DimensionUtil.dip2px(this.l, 10.0f)) - i2) - iArr[0];
            this.i = 0;
            PopupWindow popupWindow2 = new PopupWindow(this.f10632o, i2, -2);
            this.c = popupWindow2;
            popupWindow2.setBackgroundDrawable(new ColorDrawable(0));
            this.c.setTouchable(true);
            this.c.setFocusable(true);
            this.c.setOutsideTouchable(true);
            this.c.setClippingEnabled(false);
            this.c.setOnDismissListener(new PopupWindow.OnDismissListener() {
                public void onDismiss() {
                    RVLogger.d(NebulaPopMenu.TAG, "popupMenu onDismiss");
                    if (NebulaPopMenu.this.f && NebulaPopMenu.this.j != null) {
                        NebulaPopMenu.this.j.clear();
                    }
                    NebulaPopMenu.this.m.removeView(NebulaPopMenu.this.k);
                    NebulaPopMenu.this.p.removeAllViews();
                }
            });
            this.m.addView(this.k, this.n);
            try {
                this.c.showAsDropDown(view, this.h, this.i);
                this.c.update();
            } catch (Throwable th) {
                RVLogger.e(TAG, th);
            }
        }
    }

    public List<PopMenuItem> getMenuItemList() {
        return this.f10631a;
    }

    private void b() {
        ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getResources((String) null);
        this.g = new NebulaPopMenuItemHolder();
        List<PopMenuItem> synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f10631a = synchronizedList;
        this.g.setList(synchronizedList);
    }

    private void c() {
        if (this.l != null && this.k == null) {
            a();
            View view = new View(this.l);
            this.k = view;
            view.setBackgroundColor(-16777216);
            this.k.setAlpha(0.4f);
            this.n = new ViewGroup.LayoutParams(-1, -1);
            LayoutInflater layoutInflater = (LayoutInflater) this.l.getSystemService("layout_inflater");
            if (layoutInflater != null) {
                View inflate = layoutInflater.inflate(R.layout.griver_ui_popmenu, this.m, false);
                this.f10632o = inflate;
                this.p = (LinearLayout) inflate.findViewById(R.id.h5_popmenu_container);
            }
        }
    }

    private void a(int i2) {
        List<View> list;
        if (this.f && (list = this.j) != null && !list.isEmpty()) {
            ((ImageView) this.j.get(i2).findViewById(R.id.h5_iv_icon)).setImageDrawable(this.f10631a.get(i2).icon);
        }
    }

    private void d() {
        for (PopMenuItem next : this.f10631a) {
            String str = next.iconUrl;
            boolean z = next.iconDownloading;
            final String str2 = next.name;
            if (!TextUtils.isEmpty(str) && !z) {
                if (str.startsWith("http://") || str.startsWith("https://")) {
                    ImageUtils.loadImage(str, new ImageListener() {
                        public void onImage(Bitmap bitmap) {
                            NebulaPopMenu.this.a(str2, (Drawable) new BitmapDrawable(bitmap));
                        }
                    });
                } else {
                    a(str2, ImageUtils.byteToDrawable(str));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(java.lang.String r5, android.graphics.drawable.Drawable r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x0035
            if (r6 != 0) goto L_0x000a
            goto L_0x0035
        L_0x000a:
            r0 = 0
            java.util.List<com.alibaba.griver.ui.titlebar.PopMenuItem> r1 = r4.f10631a     // Catch:{ all -> 0x0037 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0037 }
        L_0x0011:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x0033
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0037 }
            com.alibaba.griver.ui.titlebar.PopMenuItem r2 = (com.alibaba.griver.ui.titlebar.PopMenuItem) r2     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = r2.name     // Catch:{ all -> 0x0037 }
            boolean r3 = android.text.TextUtils.equals(r3, r5)     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x0030
            r2.icon = r6     // Catch:{ all -> 0x0037 }
            boolean r5 = r4.f     // Catch:{ all -> 0x0037 }
            if (r5 == 0) goto L_0x0033
            r4.a((int) r0)     // Catch:{ all -> 0x0037 }
            monitor-exit(r4)
            return
        L_0x0030:
            int r0 = r0 + 1
            goto L_0x0011
        L_0x0033:
            monitor-exit(r4)
            return
        L_0x0035:
            monitor-exit(r4)
            return
        L_0x0037:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x003b
        L_0x003a:
            throw r5
        L_0x003b:
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.titlebar.NebulaPopMenu.a(java.lang.String, android.graphics.drawable.Drawable):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            java.util.List<com.alibaba.griver.ui.titlebar.PopMenuItem> r0 = r3.f10631a
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0024
            java.lang.Object r1 = r0.next()
            com.alibaba.griver.ui.titlebar.PopMenuItem r1 = (com.alibaba.griver.ui.titlebar.PopMenuItem) r1
            java.lang.String r2 = r1.name
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0022
            java.lang.String r1 = r1.tag
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0006
        L_0x0022:
            r4 = 1
            return r4
        L_0x0024:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.titlebar.NebulaPopMenu.a(java.lang.String, java.lang.String):boolean");
    }

    private Drawable a(String str) {
        Resources resources = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getResources((String) null);
        if ("ppchatReportAbuse".equals(str)) {
            return resources.getDrawable(R.drawable.griver_ui_nav_complain);
        }
        if ("ppchatShare".equals(str) || "shareFriend".equals(str)) {
            return resources.getDrawable(R.drawable.griver_ui_nav_share_friend);
        }
        return resources.getDrawable(R.drawable.griver_ui_nav_default);
    }
}
