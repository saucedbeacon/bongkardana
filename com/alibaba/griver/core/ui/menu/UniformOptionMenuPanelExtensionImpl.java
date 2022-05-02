package com.alibaba.griver.core.ui.menu;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.common.menu.GRVMPMoreMenuItem;
import com.alibaba.griver.api.common.menu.GRVMPMoreMenuItemChangeListener;
import com.alibaba.griver.api.common.menu.GriverMenuItem;
import com.alibaba.griver.api.open.GriverAboutUrlExtension;
import com.alibaba.griver.api.ui.optionmenu.GriverOptionMenuPanelExtension;
import com.alibaba.griver.base.common.adapter.ImageListener;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.base.common.utils.ImageUtils;
import com.alibaba.griver.base.ui.widget.GriverBottomPopupDialog;
import com.alibaba.griver.core.Griver;
import com.alibaba.griver.core.R;
import com.alibaba.griver.core.jsapi.aboutinfo.AboutInfoBridgeExtension;
import com.alibaba.griver.ui.ant.api.OnItemClickListener;
import com.alibaba.griver.ui.reddot.RedDotManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o.dispatchMenuItemSelected;

public class UniformOptionMenuPanelExtensionImpl implements GriverOptionMenuPanelExtension {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Handler f10371a = new Handler(Looper.getMainLooper());
    private RecyclerView b;
    private RecyclerView c;
    private TextView d;
    /* access modifiers changed from: private */
    public ImageView e;
    private ImageView f;
    private TextView g;
    /* access modifiers changed from: private */
    public OptionMenuRecyclerAdapter h;
    /* access modifiers changed from: private */
    public OptionMenuRecyclerAdapter i;
    /* access modifiers changed from: private */
    public GriverBottomPopupDialog j;
    /* access modifiers changed from: private */
    public List<GriverMenuItem> k;
    /* access modifiers changed from: private */
    public List<GriverMenuItem> l;
    private List<GriverMenuItem> m;

    public void showOptionMenuPanel(Page page, List<GriverMenuItem> list) {
        if (page != null && page.getPageContext() != null) {
            this.m = list;
            a(page);
            Activity activity = page.getPageContext().getActivity();
            View inflate = LayoutInflater.from(activity).inflate(R.layout.griver_core_panel_option_menu, (ViewGroup) null);
            this.j = new GriverBottomPopupDialog(activity, inflate);
            a(page, inflate);
            d(page);
            b(page);
        }
    }

    private void a(final Page page) {
        this.k = new ArrayList();
        this.l = new ArrayList();
        for (GriverMenuItem next : this.m) {
            if (next.row == 1) {
                this.k.add(next);
                if (next instanceof GRVMPMoreMenuItem) {
                    GRVMPMoreMenuItem gRVMPMoreMenuItem = (GRVMPMoreMenuItem) next;
                    if (gRVMPMoreMenuItem.isShowBadge()) {
                        gRVMPMoreMenuItem.dataChangeListener = new GRVMPMoreMenuItemChangeListener() {
                            public void onMenuItemChange(final GRVMPMoreMenuItem gRVMPMoreMenuItem) {
                                UniformOptionMenuPanelExtensionImpl.this.f10371a.post(new Runnable() {
                                    public void run() {
                                        if (page != null && UniformOptionMenuPanelExtensionImpl.this.k.indexOf(gRVMPMoreMenuItem) != -1) {
                                            UniformOptionMenuPanelExtensionImpl.this.h.notifyItemChanged(UniformOptionMenuPanelExtensionImpl.this.k.indexOf(gRVMPMoreMenuItem));
                                            RedDotManager.getInstance().resetState(gRVMPMoreMenuItem.uniqueKey, gRVMPMoreMenuItem.showBadge);
                                        }
                                    }
                                });
                            }
                        };
                    }
                }
                Collections.sort(this.k, new Comparator<GriverMenuItem>() {
                    public int compare(GriverMenuItem griverMenuItem, GriverMenuItem griverMenuItem2) {
                        return griverMenuItem.priority.getValue() - griverMenuItem2.priority.getValue();
                    }
                });
            } else if (next.row == 2) {
                this.l.add(next);
                if (next instanceof GRVMPMoreMenuItem) {
                    GRVMPMoreMenuItem gRVMPMoreMenuItem2 = (GRVMPMoreMenuItem) next;
                    if (gRVMPMoreMenuItem2.isShowBadge()) {
                        gRVMPMoreMenuItem2.dataChangeListener = new GRVMPMoreMenuItemChangeListener() {
                            public void onMenuItemChange(final GRVMPMoreMenuItem gRVMPMoreMenuItem) {
                                UniformOptionMenuPanelExtensionImpl.this.f10371a.post(new Runnable() {
                                    public void run() {
                                        if (page != null && UniformOptionMenuPanelExtensionImpl.this.l.indexOf(gRVMPMoreMenuItem) != -1) {
                                            UniformOptionMenuPanelExtensionImpl.this.i.notifyItemChanged(UniformOptionMenuPanelExtensionImpl.this.l.indexOf(gRVMPMoreMenuItem));
                                            RedDotManager.getInstance().resetState(gRVMPMoreMenuItem.uniqueKey, gRVMPMoreMenuItem.showBadge);
                                        }
                                    }
                                });
                            }
                        };
                    }
                }
                Collections.sort(this.l, new Comparator<GriverMenuItem>() {
                    public int compare(GriverMenuItem griverMenuItem, GriverMenuItem griverMenuItem2) {
                        return griverMenuItem.priority.getValue() - griverMenuItem2.priority.getValue();
                    }
                });
            }
        }
    }

    private void b(final Page page) {
        this.h.setOnItemClickListener(new OnItemClickListener() {
            public void onClick(View view, int i) {
                UniformOptionMenuPanelExtensionImpl.this.j.dismiss();
                GriverMenuItem griverMenuItem = (GriverMenuItem) UniformOptionMenuPanelExtensionImpl.this.k.get(i);
                griverMenuItem.listener.onItemClick(page, griverMenuItem.identifier);
            }
        });
        this.i.setOnItemClickListener(new OnItemClickListener() {
            public void onClick(View view, int i) {
                UniformOptionMenuPanelExtensionImpl.this.j.dismiss();
                GriverMenuItem griverMenuItem = (GriverMenuItem) UniformOptionMenuPanelExtensionImpl.this.l.get(i);
                griverMenuItem.listener.onItemClick(page, griverMenuItem.identifier);
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                UniformOptionMenuPanelExtensionImpl.this.j.dismiss();
            }
        });
        GoToAboutClickListener goToAboutClickListener = new GoToAboutClickListener(page);
        this.d.setOnClickListener(goToAboutClickListener);
        this.e.setOnClickListener(goToAboutClickListener);
        this.f.setOnClickListener(goToAboutClickListener);
    }

    /* access modifiers changed from: private */
    public void c(Page page) {
        this.j.dismiss();
        if (page != null) {
            String aboutUrl = ((GriverAboutUrlExtension) RVProxy.get(GriverAboutUrlExtension.class)).getAboutUrl(page);
            if (TextUtils.isEmpty(aboutUrl)) {
                GriverLogger.w("CustomOptionMenuPanelExtensionImpl", "no about url integrated, do not open");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(AboutInfoBridgeExtension.PARAM_QUERY_APP_ID, page.getApp().getAppId());
            bundle.putString(AboutInfoBridgeExtension.PARAM_QUERY_APP_VERSION, AppInfoUtils.getDeveloperVersion((AppModel) page.getApp().getData(AppModel.class)));
            Griver.openUrl(GriverEnv.getApplicationContext(), aboutUrl, bundle);
        }
    }

    private void d(Page page) {
        this.h = new OptionMenuRecyclerAdapter(page.getPageContext().getActivity(), page.getApp().getAppId(), this.k);
        this.i = new OptionMenuRecyclerAdapter(page.getPageContext().getActivity(), page.getApp().getAppId(), this.l);
        this.b.setAdapter(this.h);
        this.c.setAdapter(this.i);
    }

    private void a(Page page, View view) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(page.getPageContext().getActivity());
        linearLayoutManager.setOrientation(0);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_user);
        this.b = recyclerView;
        recyclerView.setLayoutManager(linearLayoutManager);
        this.b.setItemAnimator(new dispatchMenuItemSelected());
        this.c = (RecyclerView) view.findViewById(R.id.recycler_view_app);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(page.getPageContext().getActivity());
        linearLayoutManager2.setOrientation(0);
        this.c.setLayoutManager(linearLayoutManager2);
        this.c.setItemAnimator(new dispatchMenuItemSelected());
        if (this.k.size() == 0) {
            this.b.setVisibility(8);
        }
        if (this.l.size() == 0) {
            this.c.setVisibility(8);
        }
        this.d = (TextView) view.findViewById(R.id.tv_name);
        this.e = (ImageView) view.findViewById(R.id.iv_icon);
        this.f = (ImageView) view.findViewById(R.id.iv_more);
        this.g = (TextView) view.findViewById(R.id.tv_cancel);
        AppModel appModel = (AppModel) page.getApp().getData(AppModel.class);
        ImageUtils.loadImage(appModel.getAppInfoModel().getLogo(), new ImageListener() {
            public void onImage(Bitmap bitmap) {
                UniformOptionMenuPanelExtensionImpl.this.e.setImageBitmap(bitmap);
            }
        });
        this.d.setText(appModel.getAppInfoModel().getName());
        this.j.show();
    }

    class GoToAboutClickListener implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Page> f10372a;

        public GoToAboutClickListener(Page page) {
            this.f10372a = new WeakReference<>(page);
        }

        public void onClick(View view) {
            UniformOptionMenuPanelExtensionImpl.this.c(this.f10372a.get());
        }
    }
}
