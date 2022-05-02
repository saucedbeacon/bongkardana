package com.alibaba.griver.core.ui.auth;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVAccountService;
import com.alibaba.ariver.kernel.common.storage.KVStorageProxy;
import com.alibaba.ariver.permission.service.LocalAuthPermissionManager;
import com.alibaba.ariver.permission.view.LocalPermissionDialog;
import com.alibaba.ariver.permission.view.PermissionPermitListener;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.open.GriverAboutUrlExtension;
import com.alibaba.griver.api.ui.auth.GriverLocalAuthDialogExtension;
import com.alibaba.griver.base.common.adapter.ImageListener;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.base.common.utils.ImageUtils;
import com.alibaba.griver.base.ui.widget.GriverBottomPopupDialog;
import com.alibaba.griver.core.Griver;
import com.alibaba.griver.core.R;
import com.alibaba.griver.core.jsapi.aboutinfo.AboutInfoBridgeExtension;
import com.alibaba.griver.ui.popmenu.TinyAppActionState;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class UniformLocalAuthDialogExtensionImpl implements GriverLocalAuthDialogExtension {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f10365a;

    static {
        HashMap hashMap = new HashMap();
        f10365a = hashMap;
        hashMap.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_CAMERA, "access your camera");
        f10365a.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_WRITE_PHOTOS_ALBUM, "access your album");
        f10365a.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_BLUETOOTH, "access Bluetooth");
        f10365a.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_CONTACT, "access your contact");
        f10365a.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_USERLOCATION, "access your current location");
        f10365a.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_RECORD, "access microphone");
    }

    public LocalPermissionDialog createDialog(Context context) {
        return new UniformLocalAuthDialog(context);
    }

    static class UniformLocalAuthDialog implements LocalPermissionDialog {

        /* renamed from: a  reason: collision with root package name */
        private Context f10366a;
        private String b;
        private String c;
        private String d;
        /* access modifiers changed from: private */
        public PermissionPermitListener e;
        private List<String> f;

        public UniformLocalAuthDialog(Context context) {
            this.f10366a = context;
        }

        public void setDialogContent(List<String> list, String str, String str2, String str3) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-67845120, oncanceled);
                onCancelLoad.getMin(-67845120, oncanceled);
            }
            this.f = list;
            this.b = str != null ? str.toLowerCase() : "";
            this.c = str2;
            this.d = str3;
        }

        public void setPermissionPermitListener(PermissionPermitListener permissionPermitListener) {
            this.e = permissionPermitListener;
        }

        public void show(Page page) {
            if (this.f.size() <= 1 || this.f.contains(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_WRITE_PHOTOS_ALBUM) || this.f.contains(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_CAMERA)) {
                View inflate = LayoutInflater.from(this.f10366a).inflate(R.layout.griver_core_local_auth_content, (ViewGroup) null);
                final GriverBottomPopupDialog griverBottomPopupDialog = new GriverBottomPopupDialog(this.f10366a, inflate);
                TextView textView = (TextView) inflate.findViewById(R.id.tv_name);
                textView.setOnClickListener(new ClickNameListener(page));
                final ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_icon);
                imageView.setOnClickListener(new ClickNameListener(page));
                inflate.findViewById(R.id.iv_more).setOnClickListener(new ClickNameListener(page));
                TextView textView2 = (TextView) inflate.findViewById(R.id.tv_content);
                RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.layout_not_retry);
                List<String> list = this.f;
                if (list != null && list.size() > 0) {
                    for (String b2 : this.f) {
                        if ("0".equals(b(page.getApp().getAppId(), b2))) {
                            relativeLayout.setVisibility(0);
                        }
                    }
                }
                final CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.check_box);
                textView.setText(this.c);
                List<String> list2 = this.f;
                if (list2 != null) {
                    if (list2.size() > 1) {
                        this.b = "access your album and camera";
                    } else {
                        this.b = (String) UniformLocalAuthDialogExtensionImpl.f10365a.get(this.f.get(0));
                    }
                }
                textView2.setText(this.b);
                ImageUtils.loadImage(this.d, new ImageListener() {
                    public void onImage(Bitmap bitmap) {
                        imageView.setImageBitmap(bitmap);
                    }
                });
                a((ImageView) inflate.findViewById(R.id.iv_scope), this.f);
                ((Button) inflate.findViewById(R.id.bt_refuse)).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        griverBottomPopupDialog.dismiss();
                        if (checkBox.isChecked()) {
                            UniformLocalAuthDialog.this.e.onFailed(-1, "refused", false);
                        } else {
                            UniformLocalAuthDialog.this.e.onFailed(-1, "refused", true);
                        }
                    }
                });
                ((Button) inflate.findViewById(R.id.bt_allow)).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        UniformLocalAuthDialog.this.e.onSuccess();
                        griverBottomPopupDialog.dismiss();
                    }
                });
                griverBottomPopupDialog.setCancelable(false);
                griverBottomPopupDialog.show();
                return;
            }
            GriverLogger.w("UniformLocalAuthDialogExtensionImpl", "more than one scope are requested, but not album and camera, ignore request");
            this.e.onSuccess();
        }

        private void a(ImageView imageView, List<String> list) {
            if (list != null && list.size() == 1) {
                String str = list.get(0);
                if (str != null) {
                    if (str.contains(ImagePickerEvent.CAMERA)) {
                        imageView.setImageResource(R.drawable.griver_core_scope_camera);
                        return;
                    } else if (!str.contains("album")) {
                        if (str.contains("audioRecord")) {
                            imageView.setImageResource(R.drawable.griver_core_scope_microphone);
                            return;
                        } else if (str.contains("location")) {
                            imageView.setImageResource(R.drawable.griver_core_scope_location);
                            return;
                        } else if (str.contains("contact")) {
                            imageView.setImageResource(R.drawable.griver_core_scope_contact);
                            return;
                        } else if (str.contains(TinyAppActionState.ACTION_BLUE_TOOTH)) {
                            imageView.setImageResource(R.drawable.griver_core_scope_bluetooth);
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            imageView.setImageResource(R.drawable.griver_core_scope_album);
        }

        private String a(String str, String str2) {
            String userId = ((RVAccountService) RVProxy.get(RVAccountService.class)).getUserId();
            StringBuilder sb = new StringBuilder();
            sb.append(userId);
            sb.append("_");
            sb.append(str);
            sb.append("_");
            sb.append(str2.substring(str2.indexOf(".") + 1, str2.length()));
            return sb.toString();
        }

        private String b(String str, String str2) {
            return ((KVStorageProxy) RVProxy.get(KVStorageProxy.class)).getString(str, a(str, str2));
        }

        static class ClickNameListener implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            private Page f10367a;

            public ClickNameListener(Page page) {
                this.f10367a = page;
            }

            public void onClick(View view) {
                a(this.f10367a);
            }

            private void a(Page page) {
                if (page != null) {
                    String aboutUrl = ((GriverAboutUrlExtension) RVProxy.get(GriverAboutUrlExtension.class)).getAboutUrl(page);
                    if (TextUtils.isEmpty(aboutUrl)) {
                        GriverLogger.w("UniformLocalAuthDialogExtensionImpl", "no about url integrated, do not open");
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString(AboutInfoBridgeExtension.PARAM_QUERY_APP_ID, page.getApp().getAppId());
                    bundle.putString(AboutInfoBridgeExtension.PARAM_QUERY_APP_VERSION, AppInfoUtils.getDeveloperVersion((AppModel) page.getApp().getData(AppModel.class)));
                    Griver.openUrl(GriverEnv.getApplicationContext(), aboutUrl, bundle);
                }
            }
        }
    }
}
