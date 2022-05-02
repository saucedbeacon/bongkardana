package io.branch.referral;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.alibaba.ariver.kernel.RVParams;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.sendmoney.summary.SummaryActivity;
import io.branch.referral.Branch;
import io.branch.referral.Defines;
import io.branch.referral.InstallListener;
import io.branch.referral.ServerRequest;
import io.branch.referral.network.BranchRemoteInterface;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.TinyBlurMenu;
import o.TinyMenuBgDrawable;
import o.TinyMenuPopupWindow;
import o.getMenuName;
import o.getMessageCount;
import o.getMid;
import o.getViewTypeCount;
import o.interceptClickEventForCornerMarking;
import o.setBlurMenu;
import o.setDataProvider;
import o.setFavorite;
import o.setMenuPanel;
import o.startRecentTinyApp;
import o.startTinyAppAndCloseCurrent;
import o.syncCornerMarkingDataToUI;
import o.transfer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Branch implements transfer.setMax, TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.length, InstallListener.getMin {
    private static boolean FastBitmap$CoordinateSystem = false;
    private static CUSTOM_REFERRABLE_SETTINGS ICustomTabsCallback$Default = CUSTOM_REFERRABLE_SETTINGS.USE_DEFAULT;
    private static final String[] asBinder = {"extra_launch_uri", "branch_intent"};
    private static int asInterface = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
    private static boolean create = false;
    private static boolean getDefaultImpl = true;
    static boolean getMax = false;
    static boolean length = true;
    private static boolean onNavigationEvent = false;
    private static String onTransact = "app.link";
    public static Branch setMin = null;
    /* access modifiers changed from: private */
    public static boolean toDoubleRange = false;
    private static long valueOf = 1500;
    private static boolean values;
    private final getMid Grayscale$Algorithm;
    /* access modifiers changed from: private */
    public boolean ICustomTabsCallback;
    private boolean ICustomTabsCallback$Stub = false;
    private boolean ICustomTabsCallback$Stub$Proxy = false;
    /* access modifiers changed from: private */
    public CountDownLatch ICustomTabsService = null;
    public WeakReference<Activity> IsOverlapping;
    /* access modifiers changed from: private */
    public BranchRemoteInterface Mean$Arithmetic;
    /* access modifiers changed from: private */
    public int b;
    final Object equals;
    private WeakReference<getMax> extraCallback;
    /* access modifiers changed from: private */
    public INTENT_STATE extraCallbackWithResult = INTENT_STATE.PENDING;
    /* access modifiers changed from: private */
    public Map<TinyMenuBgDrawable, String> getCause;
    /* access modifiers changed from: private */
    public CountDownLatch getInterfaceDescriptor = null;
    public Context getMin;
    private JSONObject hashCode;
    private Semaphore invoke;
    /* access modifiers changed from: private */
    public final TinyMenuPopupWindow.AnonymousClass7.AnonymousClass1.AnonymousClass1 invokeSuspend;
    public boolean isInside = false;
    private final setDataProvider newSession;
    /* access modifiers changed from: private */
    public ShareLinkManager onMessageChannelReady;
    /* access modifiers changed from: private */
    public SESSION_STATE onPostMessage = SESSION_STATE.UNINITIALISED;
    /* access modifiers changed from: private */
    public boolean onRelationshipValidationResult = false;
    /* access modifiers changed from: private */
    public boolean setDefaultImpl = false;
    public startTinyAppAndCloseCurrent setMax;
    public boolean toFloatRange = false;
    public final ConcurrentHashMap<String, String> toIntRange;
    private boolean toString = false;

    enum CUSTOM_REFERRABLE_SETTINGS {
        USE_DEFAULT,
        REFERRABLE,
        NON_REFERRABLE
    }

    enum INTENT_STATE {
        PENDING,
        READY
    }

    public interface IsOverlapping {
    }

    enum SESSION_STATE {
        INITIALISED,
        INITIALISING,
        UNINITIALISED
    }

    public interface equals {
        void setMax(boolean z, TinyBlurMenu.AnonymousClass8 r2);
    }

    public interface getMax {
        void getMax(JSONObject jSONObject, TinyBlurMenu.AnonymousClass8 r2);
    }

    public interface getMin {
        void getMin(String str, TinyBlurMenu.AnonymousClass8 r2);
    }

    public interface setMax {
    }

    public interface toFloatRange {
        boolean length();
    }

    public static class toIntRange {
        String getMax;
        Drawable getMin;
        Drawable setMax;
        String setMin;
    }

    private Branch(@NonNull Context context) {
        this.setMax = startTinyAppAndCloseCurrent.length(context);
        this.newSession = new setDataProvider(context);
        this.Mean$Arithmetic = new syncCornerMarkingDataToUI(context);
        this.Grayscale$Algorithm = getMid.setMin(context);
        this.invokeSuspend = TinyMenuPopupWindow.AnonymousClass7.AnonymousClass1.AnonymousClass1.setMin(context);
        this.invoke = new Semaphore(1);
        this.equals = new Object();
        this.b = 0;
        this.ICustomTabsCallback = true;
        this.getCause = new HashMap();
        this.toIntRange = new ConcurrentHashMap<>();
        if (!this.newSession.getMin()) {
            this.ICustomTabsCallback$Stub = this.Grayscale$Algorithm.length.getMin(context, this);
        }
        if (Build.VERSION.SDK_INT >= 15) {
            this.onRelationshipValidationResult = true;
            this.extraCallbackWithResult = INTENT_STATE.PENDING;
            return;
        }
        this.onRelationshipValidationResult = false;
        this.extraCallbackWithResult = INTENT_STATE.READY;
    }

    public final boolean getMax() {
        return this.newSession.getMin();
    }

    @TargetApi(14)
    public static Branch setMin() {
        if (setMin == null) {
            startTinyAppAndCloseCurrent.toFloatRange("Branch instance is not created yet. Make sure you have initialised Branch. [Consider Calling getInstance(Context ctx) if you still have issue.]");
        } else if (create && !onNavigationEvent) {
            startTinyAppAndCloseCurrent.toFloatRange("Branch instance is not properly initialised. Make sure your Application class is extending BranchApp class. If you are not extending BranchApp class make sure you are initialising Branch in your Applications onCreate()");
        }
        return setMin;
    }

    private static Branch setMax(@NonNull Context context, boolean z, String str) {
        boolean z2;
        if (setMin == null) {
            setMin = new Branch(context.getApplicationContext());
            boolean min = getMenuName.setMin(context);
            if (z) {
                min = false;
            }
            getMenuName.setMax(min);
            String str2 = null;
            if (TextUtils.isEmpty((CharSequence) null)) {
                str = getMenuName.getMin(context);
            }
            if (TextUtils.isEmpty(str)) {
                try {
                    Resources resources = context.getResources();
                    str2 = resources.getString(resources.getIdentifier("io.branch.apiKey", "string", context.getPackageName()));
                } catch (Exception unused) {
                }
                if (!TextUtils.isEmpty(str2)) {
                    z2 = setMin.setMax.getMax(str2);
                } else {
                    startTinyAppAndCloseCurrent.toFloatRange("Warning: Please enter your branch_key in your project's Manifest file!");
                    z2 = setMin.setMax.getMax("bnc_no_value");
                }
            } else {
                z2 = setMin.setMax.getMax(str);
            }
            if (z2) {
                setMin.getCause.clear();
                setMin.invokeSuspend.getMin();
            }
            setMin.getMin = context.getApplicationContext();
            if (context instanceof Application) {
                create = true;
                Application application = (Application) context;
                try {
                    length length2 = new length(setMin, (byte) 0);
                    application.unregisterActivityLifecycleCallbacks(length2);
                    application.registerActivityLifecycleCallbacks(length2);
                    onNavigationEvent = true;
                } catch (NoClassDefFoundError | NoSuchMethodError unused2) {
                    onNavigationEvent = false;
                    create = false;
                    startTinyAppAndCloseCurrent.toFloatRange(new Object("", -108) {
                        public int getMin = -113;
                        public String setMin = "";

                        {
                            String str;
                            StringBuilder sb = new StringBuilder();
                            sb.append(r4);
                            if (r5 == -113) {
                                this.getMin = -113;
                                str = " Branch API Error: poor network connectivity. Please try again later.";
                            } else if (r5 == -114) {
                                this.getMin = -114;
                                str = " Branch API Error: Please enter your branch_key in your project's manifest file first.";
                            } else if (r5 == -104) {
                                this.getMin = -104;
                                str = " Did you forget to call init? Make sure you init the session before making Branch calls.";
                            } else if (r5 == -101) {
                                this.getMin = -101;
                                str = " Unable to initialize Branch. Check network connectivity or that your branch key is valid.";
                            } else if (r5 == -102) {
                                this.getMin = -102;
                                str = " Please add 'android.permission.INTERNET' in your applications manifest file.";
                            } else if (r5 == -105) {
                                this.getMin = BranchLinkConstant.DeepLinkErrorCode.SAME_ALIAS;
                                str = " Unable to create a URL with that alias. If you want to reuse the alias, make sure to submit the same properties for all arguments and that the user is the same owner.";
                            } else if (r5 == -106) {
                                this.getMin = -106;
                                str = " That Branch referral code is already in use.";
                            } else if (r5 == -107) {
                                this.getMin = -107;
                                str = " Unable to redeem rewards. Please make sure you have credits available to redeem.";
                            } else if (r5 == -108) {
                                this.getMin = -108;
                                str = "BranchApp class can be used only with API level 14 or above. Please make sure your minimum API level supported is 14. If you wish to use API level below 14 consider calling getInstance(Context) instead.";
                            } else if (r5 == -109) {
                                this.getMin = -109;
                                str = "Branch instance is not created. Make  sure your Application class is an instance of BranchLikedApp.";
                            } else if (r5 == -110) {
                                this.getMin = -110;
                                str = " Unable create share options. Couldn't find applications on device to share the link.";
                            } else if (r5 == -111) {
                                this.getMin = -111;
                                str = " Request to Branch server timed out. Please check your internet connectivity";
                            } else if (r5 == -117) {
                                this.getMin = -117;
                                str = " Tracking is disabled. Requested operation cannot be completed when tracking is disabled";
                            } else if (r5 >= 500 || r5 == -112) {
                                this.getMin = -112;
                                str = " Unable to reach the Branch servers, please try again shortly.";
                            } else if (r5 == 409 || r5 == -115) {
                                this.getMin = -115;
                                str = " A resource with this identifier already exists.";
                            } else if (r5 >= 400 || r5 == -116) {
                                this.getMin = -116;
                                str = " The request was invalid.";
                            } else {
                                this.getMin = -113;
                                str = " Check network connectivity and that you properly initialized.";
                            }
                            sb.append(str);
                            this.setMin = sb.toString();
                        }

                        public String toString() {
                            return this.setMin;
                        }
                    }.setMin);
                }
            }
        }
        return setMin;
    }

    public static Branch setMin(@NonNull Context context) {
        return setMax(context, true, (String) null);
    }

    public static Branch length(@NonNull Context context) {
        return setMax(context, false, (String) null);
    }

    @TargetApi(14)
    public static Branch getMin(@NonNull Context context) {
        create = true;
        ICustomTabsCallback$Default = CUSTOM_REFERRABLE_SETTINGS.USE_DEFAULT;
        setMax(context, true ^ getMenuName.setMin(context), (String) null);
        Branch branch = setMin;
        if (branch != null) {
            String length2 = setBlurMenu.length();
            if (!TextUtils.isEmpty(length2)) {
                new Thread(new Runnable(length2, branch, context) {
                    final /* synthetic */ Context getMax;
                    final /* synthetic */ Branch setMax;
                    final /* synthetic */ String setMin;

                    {
                        this.setMin = r1;
                        this.setMax = r2;
                        this.getMax = r3;
                    }

                    public final void run() {
                        try {
                            StringBuilder sb = new StringBuilder();
                            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(this.setMin)));
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb.append(readLine);
                            }
                            bufferedReader.close();
                            JSONObject jSONObject = new JSONObject(sb.toString().trim());
                            if (!TextUtils.isEmpty(jSONObject.toString())) {
                                setBlurMenu.setMin(jSONObject, this.setMax, this.getMax);
                                return;
                            }
                            throw new FileNotFoundException();
                        } catch (FileNotFoundException | IOException | JSONException unused) {
                        }
                    }
                }).start();
            }
        }
        return setMin;
    }

    public static boolean setMax() {
        return FastBitmap$CoordinateSystem;
    }

    public final Branch length(@NonNull String str, @NonNull String str2) {
        startTinyAppAndCloseCurrent starttinyappandclosecurrent = this.setMax;
        if (str != null) {
            try {
                starttinyappandclosecurrent.equals.putOpt(str, str2);
            } catch (JSONException unused) {
            }
        }
        return this;
    }

    public final boolean getMax(getMax getmax) {
        return setMax(getmax, (Activity) null);
    }

    private boolean setMax(getMax getmax, Activity activity) {
        if (ICustomTabsCallback$Default == CUSTOM_REFERRABLE_SETTINGS.USE_DEFAULT) {
            length(getmax, activity, true);
        } else {
            length(getmax, activity, ICustomTabsCallback$Default == CUSTOM_REFERRABLE_SETTINGS.REFERRABLE);
        }
        return true;
    }

    private boolean setMax(getMax getmax, Uri uri, Activity activity) {
        length(uri, activity);
        return setMax(getmax, activity);
    }

    private void length(getMax getmax, Activity activity, boolean z) {
        if (activity != null) {
            this.IsOverlapping = new WeakReference<>(activity);
        }
        if (getmax != null) {
            this.extraCallback = new WeakReference<>(getmax);
        }
        if (!valueOf() || !Mean$Arithmetic() || this.onPostMessage != SESSION_STATE.INITIALISED) {
            if (this.toFloatRange && setMin(getmax)) {
                this.toIntRange.put(Defines.Jsonkey.InstantDeepLinkSession.getKey(), SummaryActivity.CHECKED);
                this.toFloatRange = false;
                invoke();
            }
            if (z) {
                startTinyAppAndCloseCurrent.getMin("bnc_is_referrable", 1);
            } else {
                startTinyAppAndCloseCurrent.getMin("bnc_is_referrable", 0);
            }
            if (this.onPostMessage != SESSION_STATE.INITIALISING) {
                this.onPostMessage = SESSION_STATE.INITIALISING;
                length(getmax);
            } else if (getmax != null) {
                this.invokeSuspend.setMin(getmax);
            }
        } else {
            setMin(getmax);
            this.toFloatRange = false;
        }
    }

    private boolean setMin(getMax getmax) {
        if (getmax != null) {
            if (!create) {
                getmax.getMax(new JSONObject(), (TinyBlurMenu.AnonymousClass8) null);
            } else if (!this.isInside) {
                getmax.getMax(getMax(setMax(startTinyAppAndCloseCurrent.setMin("bnc_session_params"))), (TinyBlurMenu.AnonymousClass8) null);
                this.isInside = true;
            } else {
                getmax.getMax(new JSONObject(), (TinyBlurMenu.AnonymousClass8) null);
            }
        }
        return this.isInside;
    }

    private boolean length(Uri uri, Activity activity) {
        String str;
        String str2;
        if (!getDefaultImpl && !((this.extraCallbackWithResult != INTENT_STATE.READY && !this.setDefaultImpl) || activity == null || activity.getIntent() == null || this.onPostMessage == SESSION_STATE.INITIALISED || getMin(activity.getIntent()))) {
            Intent intent = activity.getIntent();
            if (intent.getData() == null || (!this.setDefaultImpl && getMax(activity))) {
                if (!startTinyAppAndCloseCurrent.setMin("bnc_install_params").equals("bnc_no_value")) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(Defines.Jsonkey.Clicked_Branch_Link.getKey(), false);
                    jSONObject.put(Defines.Jsonkey.IsFirstSession.getKey(), false);
                    startTinyAppAndCloseCurrent.length("bnc_session_params", jSONObject.toString());
                    this.toFloatRange = true;
                }
            } else if (!TextUtils.isEmpty(intent.getStringExtra(Defines.Jsonkey.BranchData.getKey()))) {
                try {
                    JSONObject jSONObject2 = new JSONObject(intent.getStringExtra(Defines.Jsonkey.BranchData.getKey()));
                    jSONObject2.put(Defines.Jsonkey.Clicked_Branch_Link.getKey(), true);
                    startTinyAppAndCloseCurrent.length("bnc_session_params", jSONObject2.toString());
                    this.toFloatRange = true;
                } catch (JSONException unused) {
                }
                intent.removeExtra(Defines.Jsonkey.BranchData.getKey());
                activity.setIntent(intent);
            } else if (uri.getQueryParameterNames() != null && Boolean.valueOf(uri.getQueryParameter(Defines.Jsonkey.Instant.getKey())).booleanValue()) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    for (String next : uri.getQueryParameterNames()) {
                        jSONObject3.put(next, uri.getQueryParameter(next));
                    }
                    jSONObject3.put(Defines.Jsonkey.Clicked_Branch_Link.getKey(), true);
                    startTinyAppAndCloseCurrent.length("bnc_session_params", jSONObject3.toString());
                    this.toFloatRange = true;
                } catch (JSONException unused2) {
                }
            }
        }
        if (toDoubleRange) {
            this.extraCallbackWithResult = INTENT_STATE.READY;
        }
        if (this.extraCallbackWithResult == INTENT_STATE.READY) {
            if (uri != null) {
                try {
                    if (!getMax(activity)) {
                        Context context = this.getMin;
                        if (interceptClickEventForCornerMarking.getMin == null) {
                            interceptClickEventForCornerMarking.getMin = new interceptClickEventForCornerMarking(context);
                        }
                        String min = interceptClickEventForCornerMarking.getMin.setMin(uri.toString());
                        startTinyAppAndCloseCurrent.length("bnc_external_intent_uri", min);
                        if (!(min == null || !min.equals(uri.toString()) || activity == null || activity.getIntent() == null || activity.getIntent().getExtras() == null)) {
                            Bundle extras = activity.getIntent().getExtras();
                            Set keySet = extras.keySet();
                            if (keySet.size() > 0) {
                                JSONObject jSONObject4 = new JSONObject();
                                for (String str3 : asBinder) {
                                    if (keySet.contains(str3)) {
                                        jSONObject4.put(str3, extras.get(str3));
                                    }
                                }
                                if (jSONObject4.length() > 0) {
                                    startTinyAppAndCloseCurrent.length("bnc_external_intent_extra", jSONObject4.toString());
                                }
                            }
                        }
                    }
                } catch (Exception unused3) {
                }
            }
            String str4 = null;
            if (activity != null) {
                try {
                    if (!(activity.getIntent() == null || activity.getIntent().getExtras() == null || getMax(activity))) {
                        Object obj = activity.getIntent().getExtras().get(Defines.Jsonkey.AndroidPushNotificationKey.getKey());
                        if (obj instanceof String) {
                            str2 = (String) obj;
                        } else {
                            str2 = obj instanceof Uri ? ((Uri) obj).toString() : null;
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            startTinyAppAndCloseCurrent.length("bnc_push_identifier", str2);
                            Intent intent2 = activity.getIntent();
                            intent2.putExtra(Defines.Jsonkey.BranchLinkUsed.getKey(), true);
                            activity.setIntent(intent2);
                            return false;
                        }
                    }
                } catch (Exception unused4) {
                }
            }
            if (uri != null && uri.isHierarchical() && activity != null && !setMax(activity)) {
                try {
                    if (uri.getQueryParameter(Defines.Jsonkey.LinkClickID.getKey()) != null) {
                        startTinyAppAndCloseCurrent.length("bnc_link_click_identifier", uri.getQueryParameter(Defines.Jsonkey.LinkClickID.getKey()));
                        StringBuilder sb = new StringBuilder("link_click_id=");
                        sb.append(uri.getQueryParameter(Defines.Jsonkey.LinkClickID.getKey()));
                        String obj2 = sb.toString();
                        if (activity.getIntent() != null) {
                            str4 = activity.getIntent().getDataString();
                        }
                        if (uri.getQuery().length() == obj2.length()) {
                            str = "\\?".concat(String.valueOf(obj2));
                        } else {
                            if (str4 != null) {
                                if (str4.length() - obj2.length() == str4.indexOf(obj2)) {
                                    str = "&".concat(String.valueOf(obj2));
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(obj2);
                            sb2.append("&");
                            str = sb2.toString();
                        }
                        if (str4 != null) {
                            activity.getIntent().setData(Uri.parse(str4.replaceFirst(str, "")));
                            activity.getIntent().putExtra(Defines.Jsonkey.BranchLinkUsed.getKey(), true);
                        } else {
                            startTinyAppAndCloseCurrent.toFloatRange("Warning: URI for the launcher activity is null. Please make sure that intent data is not set to null before calling Branch#InitSession ");
                        }
                        return true;
                    }
                    String scheme = uri.getScheme();
                    Intent intent3 = activity.getIntent();
                    if (!(scheme == null || intent3 == null || ((!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase("https")) || uri.getHost() == null || uri.getHost().length() <= 0 || getMax(activity)))) {
                        Context context2 = this.getMin;
                        if (interceptClickEventForCornerMarking.getMin == null) {
                            interceptClickEventForCornerMarking.getMin = new interceptClickEventForCornerMarking(context2);
                        }
                        if (uri.toString().equalsIgnoreCase(interceptClickEventForCornerMarking.getMin.setMin(uri.toString()))) {
                            startTinyAppAndCloseCurrent.length("bnc_app_link", uri.toString());
                        }
                        intent3.putExtra(Defines.Jsonkey.BranchLinkUsed.getKey(), true);
                        activity.setIntent(intent3);
                    }
                } catch (Exception unused5) {
                }
            }
        }
        return false;
    }

    private static boolean getMax(Activity activity) {
        return (activity == null || activity.getIntent() == null || !activity.getIntent().getBooleanExtra(Defines.Jsonkey.BranchLinkUsed.getKey(), false)) ? false : true;
    }

    private static boolean setMax(Activity activity) {
        return (activity == null || activity.getIntent() == null || (activity.getIntent().getFlags() & 1048576) == 0) ? false : true;
    }

    public final void getMin() {
        this.ICustomTabsCallback$Stub = false;
        this.invokeSuspend.length(ServerRequest.PROCESS_WAIT_LOCK.GAID_FETCH_WAIT_LOCK);
        if (this.ICustomTabsCallback$Stub$Proxy) {
            invokeSuspend();
            this.ICustomTabsCallback$Stub$Proxy = false;
            return;
        }
        toDoubleRange();
    }

    public final void IsOverlapping() {
        this.invokeSuspend.length(ServerRequest.PROCESS_WAIT_LOCK.INSTALL_REFERRER_FETCH_WAIT_LOCK);
        toDoubleRange();
    }

    public final JSONObject getMax(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (this.hashCode != null) {
                    if (this.hashCode.length() > 0) {
                        startTinyAppAndCloseCurrent.toFloatRange("You're currently in deep link debug mode. Please comment out 'setDeepLinkDebugMode' to receive the deep link parameters from a real Branch link");
                    }
                    Iterator<String> keys = this.hashCode.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, this.hashCode.get(next));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public final String length(startRecentTinyApp startrecenttinyapp) {
        if (!startrecenttinyapp.equals && !startrecenttinyapp.getMin(this.getMin)) {
            if (this.getCause.containsKey(startrecenttinyapp.toIntRange)) {
                String str = this.getCause.get(startrecenttinyapp.toIntRange);
                if (startrecenttinyapp.IsOverlapping != null) {
                    startrecenttinyapp.IsOverlapping.getMin(str, (TinyBlurMenu.AnonymousClass8) null);
                }
                startrecenttinyapp.Grayscale$Algorithm();
                return str;
            } else if (!startrecenttinyapp.Mean$Arithmetic()) {
                return setMin(startrecenttinyapp);
            } else {
                setMin((ServerRequest) startrecenttinyapp);
            }
        }
        return null;
    }

    private String setMin(startRecentTinyApp startrecenttinyapp) {
        getViewTypeCount getviewtypecount;
        JSONObject jSONObject;
        if (this.newSession.getMin()) {
            return startrecenttinyapp.invokeSuspend();
        }
        String str = null;
        if (this.onPostMessage == SESSION_STATE.INITIALISED) {
            try {
                getviewtypecount = (getViewTypeCount) new isInside(this, (byte) 0).execute(new ServerRequest[]{startrecenttinyapp}).get((long) (startTinyAppAndCloseCurrent.length("bnc_timeout", 5500) + 2000), TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                getviewtypecount = null;
            }
            if (startrecenttinyapp.invoke()) {
                str = startrecenttinyapp.invokeSuspend();
            }
            if (getviewtypecount != null && getviewtypecount.setMax == 200) {
                try {
                    if (getviewtypecount.setMin instanceof JSONObject) {
                        jSONObject = (JSONObject) getviewtypecount.setMin;
                    } else {
                        jSONObject = new JSONObject();
                    }
                    str = jSONObject.getString("url");
                    if (startrecenttinyapp.toIntRange != null) {
                        this.getCause.put(startrecenttinyapp.toIntRange, str);
                    }
                } catch (JSONException unused2) {
                }
            }
            return str;
        }
        startTinyAppAndCloseCurrent.toFloatRange("Warning: User session has not been initialized");
        return null;
    }

    public static JSONObject setMax(String str) {
        if (str.equals("bnc_no_value")) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            try {
                return new JSONObject(new String(TinyBlurMenu.AnonymousClass9.setMax(str.getBytes())));
            } catch (JSONException unused2) {
                return new JSONObject();
            }
        }
    }

    /* access modifiers changed from: private */
    public void toDoubleRange() {
        try {
            this.invoke.acquire();
            if (this.b != 0 || this.invokeSuspend.length() <= 0) {
                this.invoke.release();
                return;
            }
            this.b = 1;
            ServerRequest max = this.invokeSuspend.setMax();
            this.invoke.release();
            if (max == null) {
                this.invokeSuspend.length((ServerRequest) null);
            } else if (max.toFloatRange()) {
                this.b = 0;
            } else if (!(max instanceof TinyMenuPopupWindow.AnonymousClass7.AnonymousClass1) && !valueOf()) {
                startTinyAppAndCloseCurrent.toFloatRange("Branch Error: User session has not been initialized!");
                this.b = 0;
                getMax(this.invokeSuspend.length() - 1, -101);
            } else if (!setMax(max) || values()) {
                new setMin(max).getMin(new Void[0]);
            } else {
                this.b = 0;
                getMax(this.invokeSuspend.length() - 1, -101);
            }
        } catch (Exception unused) {
        }
    }

    private static boolean setMax(ServerRequest serverRequest) {
        if (!(serverRequest instanceof TinyMenuPopupWindow.AnonymousClass4) && !(serverRequest instanceof startRecentTinyApp)) {
            return true;
        }
        return false;
    }

    private static boolean values() {
        return Mean$Arithmetic() && Grayscale$Algorithm();
    }

    /* access modifiers changed from: private */
    public void getMax(int i, int i2) {
        ServerRequest serverRequest;
        if (i >= this.invokeSuspend.length()) {
            TinyMenuPopupWindow.AnonymousClass7.AnonymousClass1.AnonymousClass1 r2 = this.invokeSuspend;
            serverRequest = r2.setMax(r2.length() - 1);
        } else {
            serverRequest = this.invokeSuspend.setMax(i);
        }
        if (serverRequest != null) {
            serverRequest.setMin(i2, "");
        }
    }

    private void setMax(ServerRequest serverRequest, getMax getmax) {
        int i = 0;
        if (this.invokeSuspend.isInside()) {
            if (getmax != null) {
                this.invokeSuspend.setMin(getmax);
            }
            TinyMenuPopupWindow.AnonymousClass7.AnonymousClass1.AnonymousClass1 r9 = this.invokeSuspend;
            int i2 = this.b;
            synchronized (TinyMenuPopupWindow.AnonymousClass7.AnonymousClass1.AnonymousClass1.getMin) {
                Iterator<ServerRequest> it = r9.getMax.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ServerRequest next = it.next();
                    if (next == null || (!(next instanceof TinyMenuPopupWindow.AnonymousClass7.AnonymousClass1) && !(next instanceof TinyMenuPopupWindow.CornerMarkingUIController))) {
                    }
                }
                it.remove();
            }
            if (i2 != 0) {
                i = 1;
            }
            r9.getMax(serverRequest, i);
        } else if (this.b == 0) {
            this.invokeSuspend.getMax(serverRequest, 0);
        } else {
            this.invokeSuspend.getMax(serverRequest, 1);
        }
        toDoubleRange();
    }

    private void length(getMax getmax, ServerRequest.PROCESS_WAIT_LOCK process_wait_lock) {
        ServerRequest.PROCESS_WAIT_LOCK process_wait_lock2;
        ServerRequest.PROCESS_WAIT_LOCK process_wait_lock3;
        ServerRequest max = setMax(getmax);
        if (process_wait_lock != null) {
            max.setMax.add(process_wait_lock);
        }
        if (this.ICustomTabsCallback$Stub && (process_wait_lock3 = ServerRequest.PROCESS_WAIT_LOCK.GAID_FETCH_WAIT_LOCK) != null) {
            max.setMax.add(process_wait_lock3);
        }
        if (!(this.extraCallbackWithResult == INTENT_STATE.READY || create() || (process_wait_lock2 = ServerRequest.PROCESS_WAIT_LOCK.INTENT_PENDING_WAIT_LOCK) == null)) {
            max.setMax.add(process_wait_lock2);
        }
        if (length && (max instanceof TinyMenuPopupWindow.AnonymousClass7.AnonymousClass1) && !InstallListener.unReportedReferrerAvailable) {
            ServerRequest.PROCESS_WAIT_LOCK process_wait_lock4 = ServerRequest.PROCESS_WAIT_LOCK.INSTALL_REFERRER_FETCH_WAIT_LOCK;
            if (process_wait_lock4 != null) {
                max.setMax.add(process_wait_lock4);
            }
            new InstallListener().captureInstallReferrer(this.getMin, valueOf, this);
        }
        setMax(max, getmax);
    }

    private ServerRequest setMax(getMax getmax) {
        if (valueOf()) {
            return new TinyMenuPopupWindow.CornerMarkingUIController(this.getMin, getmax);
        }
        return new TinyMenuPopupWindow.AnonymousClass7.AnonymousClass1(this.getMin, getmax, InstallListener.getInstallationID());
    }

    private void invokeSuspend() {
        if (!this.newSession.getMin()) {
            WeakReference<Activity> weakReference = this.IsOverlapping;
            Context context = null;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity != null) {
                context = activity.getApplicationContext();
            }
            Context context2 = context;
            if (context2 != null) {
                this.invokeSuspend.equals();
                setMenuPanel.setMin().getMax(context2, onTransact, this.Grayscale$Algorithm, this.setMax, new setMenuPanel.getMax() {
                    public final void setMin() {
                        Branch.this.invokeSuspend.length(ServerRequest.PROCESS_WAIT_LOCK.STRONG_MATCH_PENDING_WAIT_LOCK);
                        Branch.this.toDoubleRange();
                    }
                });
            }
        }
    }

    public final void setMin(ServerRequest serverRequest) {
        if (!this.newSession.getMin() || serverRequest.FastBitmap$CoordinateSystem()) {
            if (this.onPostMessage != SESSION_STATE.INITIALISED && !(serverRequest instanceof TinyMenuPopupWindow.AnonymousClass4)) {
                if (serverRequest instanceof TinyMenuPopupWindow.AnonymousClass3) {
                    serverRequest.setMin(-101, "");
                    startTinyAppAndCloseCurrent.toFloatRange("Branch is not initialized, cannot logout");
                    return;
                } else if (serverRequest instanceof TinyMenuPopupWindow.AnonymousClass8) {
                    startTinyAppAndCloseCurrent.toFloatRange("Branch is not initialized, cannot close session");
                    return;
                } else {
                    WeakReference<Activity> weakReference = this.IsOverlapping;
                    Activity activity = weakReference != null ? weakReference.get() : null;
                    boolean z = true;
                    if (ICustomTabsCallback$Default == CUSTOM_REFERRABLE_SETTINGS.USE_DEFAULT) {
                        length((getMax) null, activity, true);
                    } else {
                        if (ICustomTabsCallback$Default != CUSTOM_REFERRABLE_SETTINGS.REFERRABLE) {
                            z = false;
                        }
                        length((getMax) null, activity, z);
                    }
                }
            }
            if (!(serverRequest instanceof TinyMenuPopupWindow.AnonymousClass7)) {
                this.invokeSuspend.getMax(serverRequest);
                serverRequest.getMin = System.currentTimeMillis();
            }
            toDoubleRange();
            return;
        }
        serverRequest.values();
    }

    @TargetApi(14)
    class length implements Application.ActivityLifecycleCallbacks {
        private int setMin;

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        private length() {
            this.setMin = 0;
        }

        /* synthetic */ length(Branch branch, byte b) {
            this();
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Branch branch = Branch.this;
            INTENT_STATE unused = branch.extraCallbackWithResult = branch.onRelationshipValidationResult ? INTENT_STATE.PENDING : INTENT_STATE.READY;
            boolean unused2 = Branch.this.setDefaultImpl = true;
            if (transfer.setMax == null) {
                transfer.setMax = new transfer();
            }
            if (transfer.setMax.setMax(activity.getApplicationContext())) {
                if (transfer.setMax == null) {
                    transfer.setMax = new transfer();
                }
                transfer.setMax.getMin((Context) activity);
            }
        }

        public final void onActivityStarted(Activity activity) {
            Branch branch = Branch.this;
            INTENT_STATE unused = branch.extraCallbackWithResult = branch.onRelationshipValidationResult ? INTENT_STATE.PENDING : INTENT_STATE.READY;
            if (Branch.this.onPostMessage == SESSION_STATE.INITIALISED) {
                try {
                    if (TinyBlurMenu.AnonymousClass5.getMax == null) {
                        TinyBlurMenu.AnonymousClass5.getMax = new Object() {
                            public static AnonymousClass5 getMax;
                            private final AnonymousClass7 FastBitmap$CoordinateSystem = new Object() {
                                MessageDigest getMin;

                                {
                                    try {
                                        this.getMin = MessageDigest.getInstance("SHA-256");
                                    } catch (NoSuchAlgorithmException unused) {
                                    }
                                }
                            };
                            AnonymousClass4 IsOverlapping;
                            public final Map<String, WeakReference<ViewTreeObserver>> equals = new HashMap();
                            public Handler getMin = new Handler();
                            public ArrayList<String> isInside = new ArrayList<>();
                            String length;
                            public WeakReference<Activity> setMax;
                            public JSONObject setMin;
                            public ViewTreeObserver.OnScrollChangedListener toDoubleRange = new ViewTreeObserver.OnScrollChangedListener() {
                                public final void onScrollChanged() {
                                    AnonymousClass5.this.getMin.removeCallbacks(AnonymousClass5.this.values);
                                    if (AnonymousClass5.this.toFloatRange > AnonymousClass5.this.toIntRange) {
                                        AnonymousClass5.this.getMin.postDelayed(AnonymousClass5.this.values, 1500);
                                    }
                                }
                            };
                            int toFloatRange = 15;
                            int toIntRange;
                            public Runnable toString = new Runnable() {
                                /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                                /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0146 */
                                /* JADX WARNING: Removed duplicated region for block: B:35:0x0114 A[Catch:{ Exception -> 0x0180 }] */
                                /* JADX WARNING: Removed duplicated region for block: B:49:0x016c A[ADDED_TO_REGION, Catch:{ Exception -> 0x0180 }] */
                                /* JADX WARNING: Removed duplicated region for block: B:61:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public final void run() {
                                    /*
                                        r9 = this;
                                        o.TinyBlurMenu$5 r0 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        int r1 = r0.toIntRange     // Catch:{ Exception -> 0x0180 }
                                        r2 = 1
                                        int r1 = r1 + r2
                                        r0.toIntRange = r1     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$5 r0 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$4 r0 = r0.IsOverlapping     // Catch:{ Exception -> 0x0180 }
                                        boolean r0 = r0.getMin()     // Catch:{ Exception -> 0x0180 }
                                        if (r0 == 0) goto L_0x0180
                                        o.TinyBlurMenu$5 r0 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        java.lang.ref.WeakReference<android.app.Activity> r0 = r0.setMax     // Catch:{ Exception -> 0x0180 }
                                        if (r0 == 0) goto L_0x0180
                                        o.TinyBlurMenu$5 r0 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        java.lang.ref.WeakReference<android.app.Activity> r0 = r0.setMax     // Catch:{ Exception -> 0x0180 }
                                        java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0180 }
                                        if (r0 == 0) goto L_0x0180
                                        o.TinyBlurMenu$5 r0 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        java.lang.ref.WeakReference<android.app.Activity> r0 = r0.setMax     // Catch:{ Exception -> 0x0180 }
                                        java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0180 }
                                        android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$5 r1 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0180 }
                                        r3.<init>()     // Catch:{ Exception -> 0x0180 }
                                        r1.setMin = r3     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$5 r1 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        org.json.JSONObject r1 = r1.setMin     // Catch:{ Exception -> 0x0180 }
                                        java.lang.String r3 = "ts"
                                        long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0180 }
                                        r1.put(r3, r4)     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$5 r1 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        java.lang.String r1 = r1.length     // Catch:{ Exception -> 0x0180 }
                                        boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0180 }
                                        if (r1 != 0) goto L_0x0059
                                        o.TinyBlurMenu$5 r1 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        org.json.JSONObject r1 = r1.setMin     // Catch:{ Exception -> 0x0180 }
                                        java.lang.String r3 = "rl"
                                        o.TinyBlurMenu$5 r4 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        java.lang.String r4 = r4.length     // Catch:{ Exception -> 0x0180 }
                                        r1.put(r3, r4)     // Catch:{ Exception -> 0x0180 }
                                    L_0x0059:
                                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0180 }
                                        java.lang.String r3 = "/"
                                        r1.<init>(r3)     // Catch:{ Exception -> 0x0180 }
                                        java.lang.Class r3 = r0.getClass()     // Catch:{ Exception -> 0x0180 }
                                        java.lang.String r3 = r3.getSimpleName()     // Catch:{ Exception -> 0x0180 }
                                        r1.append(r3)     // Catch:{ Exception -> 0x0180 }
                                        java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$5 r3 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        org.json.JSONObject r3 = r3.setMin     // Catch:{ Exception -> 0x0180 }
                                        java.lang.String r4 = "v"
                                        r3.put(r4, r1)     // Catch:{ Exception -> 0x0180 }
                                        r3 = 16908290(0x1020002, float:2.3877235E-38)
                                        android.view.View r3 = r0.findViewById(r3)     // Catch:{ Exception -> 0x0180 }
                                        android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch:{ Exception -> 0x0180 }
                                        if (r3 == 0) goto L_0x0180
                                        o.TinyBlurMenu$5 r4 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$4 r4 = r4.IsOverlapping     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$4$setMin r4 = r4.setMax(r0)     // Catch:{ Exception -> 0x0180 }
                                        if (r4 == 0) goto L_0x0090
                                        r4.setMax()     // Catch:{ Exception -> 0x0180 }
                                    L_0x0090:
                                        r5 = 0
                                        r6 = 0
                                        if (r4 == 0) goto L_0x00ab
                                        boolean r5 = r4.setMax()     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$5 r7 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        org.json.JSONObject r7 = r7.setMin     // Catch:{ Exception -> 0x0180 }
                                        java.lang.String r8 = "h"
                                        if (r5 != 0) goto L_0x00a1
                                        goto L_0x00a2
                                    L_0x00a1:
                                        r2 = 0
                                    L_0x00a2:
                                        r7.put(r8, r2)     // Catch:{ Exception -> 0x0180 }
                                        org.json.JSONArray r2 = r4.setMin()     // Catch:{ Exception -> 0x0180 }
                                        r8 = r5
                                        goto L_0x00ad
                                    L_0x00ab:
                                        r2 = r5
                                        r8 = 0
                                    L_0x00ad:
                                        java.lang.String r4 = "ck"
                                        if (r2 == 0) goto L_0x00d9
                                        int r5 = r2.length()     // Catch:{ Exception -> 0x0180 }
                                        if (r5 <= 0) goto L_0x00d9
                                        org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x0180 }
                                        r6.<init>()     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$5 r3 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        org.json.JSONObject r3 = r3.setMin     // Catch:{ Exception -> 0x0180 }
                                        r3.put(r4, r6)     // Catch:{ Exception -> 0x0180 }
                                        org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x0180 }
                                        r5.<init>()     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$5 r3 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        org.json.JSONObject r3 = r3.setMin     // Catch:{ Exception -> 0x0180 }
                                        java.lang.String r4 = "cd"
                                        r3.put(r4, r5)     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$5 r3 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        r4 = r2
                                        r7 = r0
                                        o.TinyBlurMenu.AnonymousClass5.getMax(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0180 }
                                        goto L_0x00f8
                                    L_0x00d9:
                                        o.TinyBlurMenu$5 r5 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        java.util.ArrayList<java.lang.String> r5 = r5.isInside     // Catch:{ Exception -> 0x0180 }
                                        boolean r5 = r5.contains(r1)     // Catch:{ Exception -> 0x0180 }
                                        if (r5 != 0) goto L_0x00f8
                                        org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x0180 }
                                        r5.<init>()     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$5 r6 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        org.json.JSONObject r6 = r6.setMin     // Catch:{ Exception -> 0x0180 }
                                        r6.put(r4, r5)     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$5 r4 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        android.content.res.Resources r6 = r0.getResources()     // Catch:{ Exception -> 0x0180 }
                                        r4.getMin(r3, r5, r6)     // Catch:{ Exception -> 0x0180 }
                                    L_0x00f8:
                                        o.TinyBlurMenu$5 r3 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        java.util.ArrayList<java.lang.String> r3 = r3.isInside     // Catch:{ Exception -> 0x0180 }
                                        r3.add(r1)     // Catch:{ Exception -> 0x0180 }
                                        o.startTinyAppAndCloseCurrent.length((android.content.Context) r0)     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$5 r1 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        org.json.JSONObject r1 = r1.setMin     // Catch:{ Exception -> 0x0180 }
                                        java.lang.String r3 = "bnc_session_id"
                                        java.lang.String r3 = o.startTinyAppAndCloseCurrent.setMin((java.lang.String) r3)     // Catch:{ Exception -> 0x0180 }
                                        java.lang.String r4 = "bnc_no_value"
                                        boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x0180 }
                                        if (r4 != 0) goto L_0x0146
                                        org.json.JSONObject r4 = o.startTinyAppAndCloseCurrent.toFloatRange     // Catch:{ Exception -> 0x0180 }
                                        if (r4 != 0) goto L_0x011e
                                        org.json.JSONObject r4 = o.startTinyAppAndCloseCurrent.equals()     // Catch:{ Exception -> 0x0180 }
                                        o.startTinyAppAndCloseCurrent.toFloatRange = r4     // Catch:{ Exception -> 0x0180 }
                                    L_0x011e:
                                        org.json.JSONObject r4 = o.startTinyAppAndCloseCurrent.toFloatRange     // Catch:{ JSONException -> 0x0146 }
                                        boolean r4 = r4.has(r3)     // Catch:{ JSONException -> 0x0146 }
                                        if (r4 == 0) goto L_0x012d
                                        org.json.JSONObject r4 = o.startTinyAppAndCloseCurrent.toFloatRange     // Catch:{ JSONException -> 0x0146 }
                                        org.json.JSONArray r3 = r4.getJSONArray(r3)     // Catch:{ JSONException -> 0x0146 }
                                        goto L_0x0138
                                    L_0x012d:
                                        org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0146 }
                                        r4.<init>()     // Catch:{ JSONException -> 0x0146 }
                                        org.json.JSONObject r5 = o.startTinyAppAndCloseCurrent.toFloatRange     // Catch:{ JSONException -> 0x0146 }
                                        r5.put(r3, r4)     // Catch:{ JSONException -> 0x0146 }
                                        r3 = r4
                                    L_0x0138:
                                        r3.put(r1)     // Catch:{ JSONException -> 0x0146 }
                                        java.lang.String r1 = "bnc_branch_analytical_data"
                                        org.json.JSONObject r3 = o.startTinyAppAndCloseCurrent.toFloatRange     // Catch:{ JSONException -> 0x0146 }
                                        java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0146 }
                                        o.startTinyAppAndCloseCurrent.length((java.lang.String) r1, (java.lang.String) r3)     // Catch:{ JSONException -> 0x0146 }
                                    L_0x0146:
                                        o.TinyBlurMenu$5 r1 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$4 r1 = r1.IsOverlapping     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$4$setMin r1 = r1.setMax(r0)     // Catch:{ Exception -> 0x0180 }
                                        int r1 = r1.getMax     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$5 r3 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$5 r4 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$4 r4 = r4.IsOverlapping     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$4$setMin r0 = r4.setMax(r0)     // Catch:{ Exception -> 0x0180 }
                                        int r0 = r0.length     // Catch:{ Exception -> 0x0180 }
                                        r3.toFloatRange = r0     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$5 r0 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        int r0 = r0.toIntRange     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$5 r3 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        int r3 = r3.toFloatRange     // Catch:{ Exception -> 0x0180 }
                                        if (r0 >= r3) goto L_0x0180
                                        r0 = 500(0x1f4, float:7.0E-43)
                                        if (r1 < r0) goto L_0x0180
                                        if (r2 == 0) goto L_0x0180
                                        int r0 = r2.length()     // Catch:{ Exception -> 0x0180 }
                                        if (r0 <= 0) goto L_0x0180
                                        o.TinyBlurMenu$5 r0 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        android.os.Handler r0 = r0.getMin     // Catch:{ Exception -> 0x0180 }
                                        o.TinyBlurMenu$5 r2 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                        java.lang.Runnable r2 = r2.toString     // Catch:{ Exception -> 0x0180 }
                                        long r3 = (long) r1     // Catch:{ Exception -> 0x0180 }
                                        r0.postDelayed(r2, r3)     // Catch:{ Exception -> 0x0180 }
                                    L_0x0180:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: o.TinyBlurMenu.AnonymousClass5.AnonymousClass5.run():void");
                                }
                            };
                            Runnable values = new Runnable() {
                                public final void run() {
                                    AnonymousClass5.this.toString.run();
                                }
                            };

                            private void getMin(Activity activity) {
                                this.toIntRange = 0;
                                if (this.isInside.size() < this.IsOverlapping.getMin) {
                                    this.getMin.removeCallbacks(this.toString);
                                    this.setMax = new WeakReference<>(activity);
                                    this.getMin.postDelayed(this.toString, 1000);
                                }
                            }

                            /* access modifiers changed from: private */
                            public void getMin(ViewGroup viewGroup, JSONArray jSONArray, Resources resources) {
                                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                                    View childAt = viewGroup.getChildAt(i);
                                    if (childAt.getVisibility() == 0) {
                                        if ((childAt instanceof AbsListView) || childAt.getClass().getSimpleName().equals("RecyclerView")) {
                                            ViewGroup viewGroup2 = (ViewGroup) childAt;
                                            JSONObject jSONObject = new JSONObject();
                                            if (viewGroup2 != null && viewGroup2.getChildCount() >= 0) {
                                                int i2 = 1;
                                                if (viewGroup2.getChildCount() <= 1) {
                                                    i2 = 0;
                                                }
                                                View childAt2 = viewGroup2.getChildAt(i2);
                                                if (childAt2 != null) {
                                                    JSONArray jSONArray2 = new JSONArray();
                                                    try {
                                                        jSONObject.put(length((View) viewGroup2, resources), jSONArray2);
                                                    } catch (JSONException unused) {
                                                    }
                                                    if (childAt2 instanceof ViewGroup) {
                                                        getMin((ViewGroup) childAt2, jSONArray2, resources);
                                                    } else if (childAt2 instanceof TextView) {
                                                        jSONArray2.put(length(childAt2, resources));
                                                    }
                                                    if (jSONObject.length() > 0) {
                                                        jSONArray.put("$".concat(String.valueOf(jSONObject)));
                                                    }
                                                }
                                            }
                                        } else if (childAt instanceof ViewGroup) {
                                            getMin((ViewGroup) childAt, jSONArray, resources);
                                        } else if (childAt instanceof TextView) {
                                            jSONArray.put(length(childAt, resources));
                                        }
                                    }
                                }
                            }

                            private static String length(View view, Resources resources) {
                                try {
                                    return resources.getResourceEntryName(view.getId());
                                } catch (Exception unused) {
                                    return String.valueOf(view.getId());
                                }
                            }

                            private String setMax(View view, boolean z) {
                                TextView textView = (TextView) view;
                                if (textView.getText() == null) {
                                    return null;
                                }
                                int i = 0;
                                String substring = textView.getText().toString().substring(0, Math.min(textView.getText().toString().length(), this.IsOverlapping.setMax));
                                if (z) {
                                    return substring;
                                }
                                AnonymousClass7 r6 = this.FastBitmap$CoordinateSystem;
                                if (substring != null) {
                                    i = substring.length();
                                }
                                int max = dispatchOnCancelled.setMax(i);
                                if (i != max) {
                                    onCanceled oncanceled = new onCanceled(i, max, 1);
                                    onCancelLoad.setMax(-304577768, oncanceled);
                                    onCancelLoad.getMin(-304577768, oncanceled);
                                }
                                if (r6.getMin == null) {
                                    return "";
                                }
                                r6.getMin.reset();
                                r6.getMin.update(substring.getBytes());
                                return new String(r6.getMin.digest());
                            }

                            public final JSONObject getMax(Context context) {
                                JSONObject jSONObject;
                                String str;
                                startTinyAppAndCloseCurrent.length(context);
                                JSONObject equals2 = startTinyAppAndCloseCurrent.equals();
                                if (equals2.length() <= 0 || equals2.toString().length() >= this.IsOverlapping.IsOverlapping) {
                                    jSONObject = null;
                                } else {
                                    jSONObject = new JSONObject();
                                    try {
                                        if (AnonymousClass4.getMax == null) {
                                            AnonymousClass4.getMax = new Object(context) {
                                                public static AnonymousClass4 getMax;
                                                public int IsOverlapping = 0;
                                                public JSONArray equals;
                                                public int getMin = 1;
                                                public boolean isInside = false;
                                                public String length;
                                                public int setMax = 0;
                                                public JSONObject setMin;
                                                private final String toFloatRange = "BNC_CD_MANIFEST";
                                                public SharedPreferences toIntRange;

                                                {
                                                    SharedPreferences sharedPreferences = r6.getSharedPreferences("bnc_content_discovery_manifest_storage", 0);
                                                    this.toIntRange = sharedPreferences;
                                                    String string = sharedPreferences.getString("BNC_CD_MANIFEST", (String) null);
                                                    if (string != null) {
                                                        try {
                                                            JSONObject jSONObject = new JSONObject(string);
                                                            this.setMin = jSONObject;
                                                            if (jSONObject.has("mv")) {
                                                                this.length = this.setMin.getString("mv");
                                                            }
                                                            if (this.setMin.has("m")) {
                                                                this.equals = this.setMin.getJSONArray("m");
                                                            }
                                                        } catch (JSONException unused) {
                                                            this.setMin = new JSONObject();
                                                        }
                                                    } else {
                                                        this.setMin = new JSONObject();
                                                    }
                                                }

                                                /* access modifiers changed from: package-private */
                                                public final setMin setMax(Activity activity) {
                                                    if (this.equals != null) {
                                                        StringBuilder sb = new StringBuilder("/");
                                                        sb.append(activity.getClass().getSimpleName());
                                                        String obj = sb.toString();
                                                        int i = 0;
                                                        while (i < this.equals.length()) {
                                                            try {
                                                                JSONObject jSONObject = this.equals.getJSONObject(i);
                                                                if (jSONObject.has("p") && jSONObject.getString("p").equals(obj)) {
                                                                    return new setMin(jSONObject);
                                                                }
                                                                i++;
                                                            } catch (JSONException unused) {
                                                            }
                                                        }
                                                    }
                                                    return null;
                                                }

                                                /* access modifiers changed from: package-private */
                                                public final boolean getMin() {
                                                    return this.isInside;
                                                }

                                                /* renamed from: o.TinyBlurMenu$4$setMin */
                                                class setMin {
                                                    int getMax;
                                                    final JSONObject getMin;
                                                    int length = 15;
                                                    private boolean setMin;

                                                    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|(4:2|3|(1:5)(1:6)|7)|8|9|(1:11)|12|(2:14|16)(1:18)) */
                                                    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
                                                        return;
                                                     */
                                                    /* JADX WARNING: Failed to process nested try/catch */
                                                    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0022 */
                                                    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028 A[Catch:{ JSONException -> 0x003a }] */
                                                    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034 A[Catch:{ JSONException -> 0x003a }] */
                                                    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
                                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                                    setMin(org.json.JSONObject r5) {
                                                        /*
                                                            r3 = this;
                                                            java.lang.String r0 = "mdr"
                                                            java.lang.String r1 = "dri"
                                                            o.TinyBlurMenu.AnonymousClass4.this = r4
                                                            r3.<init>()
                                                            r3.getMin = r5
                                                            r4 = 15
                                                            r3.length = r4
                                                            java.lang.String r4 = "h"
                                                            boolean r2 = r5.has(r4)
                                                            if (r2 == 0) goto L_0x0022
                                                            boolean r4 = r5.getBoolean(r4)     // Catch:{ JSONException -> 0x0022 }
                                                            if (r4 != 0) goto L_0x001f
                                                            r4 = 1
                                                            goto L_0x0020
                                                        L_0x001f:
                                                            r4 = 0
                                                        L_0x0020:
                                                            r3.setMin = r4     // Catch:{ JSONException -> 0x0022 }
                                                        L_0x0022:
                                                            boolean r4 = r5.has(r1)     // Catch:{ JSONException -> 0x003a }
                                                            if (r4 == 0) goto L_0x002e
                                                            int r4 = r5.getInt(r1)     // Catch:{ JSONException -> 0x003a }
                                                            r3.getMax = r4     // Catch:{ JSONException -> 0x003a }
                                                        L_0x002e:
                                                            boolean r4 = r5.has(r0)     // Catch:{ JSONException -> 0x003a }
                                                            if (r4 == 0) goto L_0x003a
                                                            int r4 = r5.getInt(r0)     // Catch:{ JSONException -> 0x003a }
                                                            r3.length = r4     // Catch:{ JSONException -> 0x003a }
                                                        L_0x003a:
                                                            return
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: o.TinyBlurMenu.AnonymousClass4.setMin.<init>(o.TinyBlurMenu$4, org.json.JSONObject):void");
                                                    }

                                                    /* access modifiers changed from: package-private */
                                                    public final JSONArray setMin() {
                                                        if (this.getMin.has("ck")) {
                                                            try {
                                                                return this.getMin.getJSONArray("ck");
                                                            } catch (JSONException unused) {
                                                            }
                                                        }
                                                        return null;
                                                    }

                                                    /* access modifiers changed from: package-private */
                                                    public final boolean setMax() {
                                                        return this.setMin;
                                                    }

                                                    /* access modifiers changed from: package-private */
                                                    public final boolean getMax() {
                                                        JSONArray min = setMin();
                                                        return min != null && min.length() == 0;
                                                    }
                                                }
                                            };
                                        }
                                        AnonymousClass4 r4 = AnonymousClass4.getMax;
                                        if (TextUtils.isEmpty(r4.length)) {
                                            str = "-1";
                                        } else {
                                            str = r4.length;
                                        }
                                        jSONObject.put("mv", str).put("e", equals2);
                                        if (context != null) {
                                            jSONObject.put("p", context.getPackageName());
                                            jSONObject.put("p", context.getPackageName());
                                        }
                                    } catch (JSONException unused) {
                                    }
                                }
                                startTinyAppAndCloseCurrent.length(context);
                                startTinyAppAndCloseCurrent.toFloatRange = null;
                                startTinyAppAndCloseCurrent.length("bnc_branch_analytical_data", "");
                                return jSONObject;
                            }

                            public final void length(Activity activity, String str) {
                                if (AnonymousClass4.getMax == null) {
                                    AnonymousClass4.getMax = new Object(activity) {
                                        public static AnonymousClass4 getMax;
                                        public int IsOverlapping = 0;
                                        public JSONArray equals;
                                        public int getMin = 1;
                                        public boolean isInside = false;
                                        public String length;
                                        public int setMax = 0;
                                        public JSONObject setMin;
                                        private final String toFloatRange = "BNC_CD_MANIFEST";
                                        public SharedPreferences toIntRange;

                                        {
                                            SharedPreferences sharedPreferences = r6.getSharedPreferences("bnc_content_discovery_manifest_storage", 0);
                                            this.toIntRange = sharedPreferences;
                                            String string = sharedPreferences.getString("BNC_CD_MANIFEST", (String) null);
                                            if (string != null) {
                                                try {
                                                    JSONObject jSONObject = new JSONObject(string);
                                                    this.setMin = jSONObject;
                                                    if (jSONObject.has("mv")) {
                                                        this.length = this.setMin.getString("mv");
                                                    }
                                                    if (this.setMin.has("m")) {
                                                        this.equals = this.setMin.getJSONArray("m");
                                                    }
                                                } catch (JSONException unused) {
                                                    this.setMin = new JSONObject();
                                                }
                                            } else {
                                                this.setMin = new JSONObject();
                                            }
                                        }

                                        /* access modifiers changed from: package-private */
                                        public final setMin setMax(Activity activity) {
                                            if (this.equals != null) {
                                                StringBuilder sb = new StringBuilder("/");
                                                sb.append(activity.getClass().getSimpleName());
                                                String obj = sb.toString();
                                                int i = 0;
                                                while (i < this.equals.length()) {
                                                    try {
                                                        JSONObject jSONObject = this.equals.getJSONObject(i);
                                                        if (jSONObject.has("p") && jSONObject.getString("p").equals(obj)) {
                                                            return new setMin(jSONObject);
                                                        }
                                                        i++;
                                                    } catch (JSONException unused) {
                                                    }
                                                }
                                            }
                                            return null;
                                        }

                                        /* access modifiers changed from: package-private */
                                        public final boolean getMin() {
                                            return this.isInside;
                                        }

                                        /* renamed from: o.TinyBlurMenu$4$setMin */
                                        class setMin {
                                            int getMax;
                                            final JSONObject getMin;
                                            int length = 15;
                                            private boolean setMin;

                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            setMin(org.json.JSONObject r5) {
                                                /*
                                                    r3 = this;
                                                    java.lang.String r0 = "mdr"
                                                    java.lang.String r1 = "dri"
                                                    o.TinyBlurMenu.AnonymousClass4.this = r4
                                                    r3.<init>()
                                                    r3.getMin = r5
                                                    r4 = 15
                                                    r3.length = r4
                                                    java.lang.String r4 = "h"
                                                    boolean r2 = r5.has(r4)
                                                    if (r2 == 0) goto L_0x0022
                                                    boolean r4 = r5.getBoolean(r4)     // Catch:{ JSONException -> 0x0022 }
                                                    if (r4 != 0) goto L_0x001f
                                                    r4 = 1
                                                    goto L_0x0020
                                                L_0x001f:
                                                    r4 = 0
                                                L_0x0020:
                                                    r3.setMin = r4     // Catch:{ JSONException -> 0x0022 }
                                                L_0x0022:
                                                    boolean r4 = r5.has(r1)     // Catch:{ JSONException -> 0x003a }
                                                    if (r4 == 0) goto L_0x002e
                                                    int r4 = r5.getInt(r1)     // Catch:{ JSONException -> 0x003a }
                                                    r3.getMax = r4     // Catch:{ JSONException -> 0x003a }
                                                L_0x002e:
                                                    boolean r4 = r5.has(r0)     // Catch:{ JSONException -> 0x003a }
                                                    if (r4 == 0) goto L_0x003a
                                                    int r4 = r5.getInt(r0)     // Catch:{ JSONException -> 0x003a }
                                                    r3.length = r4     // Catch:{ JSONException -> 0x003a }
                                                L_0x003a:
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: o.TinyBlurMenu.AnonymousClass4.setMin.<init>(o.TinyBlurMenu$4, org.json.JSONObject):void");
                                            }

                                            /* access modifiers changed from: package-private */
                                            public final JSONArray setMin() {
                                                if (this.getMin.has("ck")) {
                                                    try {
                                                        return this.getMin.getJSONArray("ck");
                                                    } catch (JSONException unused) {
                                                    }
                                                }
                                                return null;
                                            }

                                            /* access modifiers changed from: package-private */
                                            public final boolean setMax() {
                                                return this.setMin;
                                            }

                                            /* access modifiers changed from: package-private */
                                            public final boolean getMax() {
                                                JSONArray min = setMin();
                                                return min != null && min.length() == 0;
                                            }
                                        }
                                    };
                                }
                                AnonymousClass4 r0 = AnonymousClass4.getMax;
                                this.IsOverlapping = r0;
                                this.length = str;
                                AnonymousClass4.setMin max = r0.setMax(activity);
                                if (max != null) {
                                    if (!max.getMax()) {
                                        getMin(activity);
                                    }
                                } else if (!TextUtils.isEmpty(this.length)) {
                                    getMin(activity);
                                }
                            }

                            static /* synthetic */ void getMax(AnonymousClass5 r20, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, Activity activity, boolean z) {
                                String str;
                                int i;
                                JSONArray jSONArray4;
                                Activity activity2;
                                JSONArray jSONArray5;
                                JSONArray jSONArray6;
                                int i2;
                                int i3;
                                AnonymousClass5 r0 = r20;
                                JSONArray jSONArray7 = jSONArray;
                                JSONArray jSONArray8 = jSONArray2;
                                JSONArray jSONArray9 = jSONArray3;
                                Activity activity3 = activity;
                                boolean z2 = z;
                                String str2 = "$";
                                int i4 = 0;
                                while (i4 < jSONArray.length()) {
                                    try {
                                        String string = jSONArray7.getString(i4);
                                        if (string.startsWith(str2)) {
                                            JSONObject jSONObject = new JSONObject();
                                            jSONArray9.put(string);
                                            jSONArray8.put(jSONObject);
                                            String replace = string.replace(str2, "");
                                            try {
                                                JSONObject jSONObject2 = new JSONObject(replace);
                                                if (jSONObject2.length() > 0) {
                                                    String next = jSONObject2.keys().next();
                                                    str = str2;
                                                    try {
                                                        int identifier = activity.getResources().getIdentifier(next, "id", activity.getPackageName());
                                                        View findViewById = activity.getCurrentFocus() != null ? activity.getCurrentFocus().findViewById(identifier) : null;
                                                        if (findViewById == null) {
                                                            findViewById = activity3.findViewById(identifier);
                                                        }
                                                        if (findViewById != null && (findViewById instanceof ViewGroup)) {
                                                            ViewGroup viewGroup = (ViewGroup) findViewById;
                                                            JSONArray jSONArray10 = jSONObject2.getJSONArray(next);
                                                            int length2 = jSONArray10.length();
                                                            int[] iArr = new int[length2];
                                                            int i5 = 0;
                                                            while (i5 < jSONArray10.length()) {
                                                                i2 = i4;
                                                                try {
                                                                    iArr[i5] = activity.getResources().getIdentifier(jSONArray10.getString(i5), "id", activity.getPackageName());
                                                                    i5++;
                                                                    JSONArray jSONArray11 = jSONArray;
                                                                    i4 = i2;
                                                                } catch (JSONException unused) {
                                                                }
                                                            }
                                                            i2 = i4;
                                                            int firstVisiblePosition = viewGroup instanceof AbsListView ? ((AbsListView) viewGroup).getFirstVisiblePosition() : 0;
                                                            int i6 = 0;
                                                            while (i6 < viewGroup.getChildCount()) {
                                                                if (viewGroup.getChildAt(i6) != null) {
                                                                    JSONObject jSONObject3 = new JSONObject();
                                                                    StringBuilder sb = new StringBuilder("");
                                                                    sb.append(i6 + firstVisiblePosition);
                                                                    jSONObject.put(sb.toString(), jSONObject3);
                                                                    int i7 = 0;
                                                                    while (i7 < length2) {
                                                                        if (viewGroup.getChildAt(i6) != null) {
                                                                            i3 = firstVisiblePosition;
                                                                            View findViewById2 = viewGroup.getChildAt(i6).findViewById(iArr[i7]);
                                                                            if (findViewById2 instanceof TextView) {
                                                                                jSONObject3.put(jSONArray10.getString(i7), r0.setMax(findViewById2, z2));
                                                                            }
                                                                        } else {
                                                                            i3 = firstVisiblePosition;
                                                                        }
                                                                        i7++;
                                                                        firstVisiblePosition = i3;
                                                                    }
                                                                }
                                                                i6++;
                                                                firstVisiblePosition = firstVisiblePosition;
                                                            }
                                                            if ((jSONObject2.has("bnc_esw") && jSONObject2.getBoolean("bnc_esw")) && !r0.equals.containsKey(replace)) {
                                                                viewGroup.getViewTreeObserver().addOnScrollChangedListener(r0.toDoubleRange);
                                                                r0.equals.put(replace, new WeakReference(viewGroup.getViewTreeObserver()));
                                                            }
                                                            jSONArray5 = jSONArray;
                                                            jSONArray4 = jSONArray2;
                                                            jSONArray6 = jSONArray3;
                                                            activity2 = activity;
                                                            i = i2;
                                                        }
                                                    } catch (JSONException unused2) {
                                                    }
                                                } else {
                                                    str = str2;
                                                }
                                            } catch (JSONException unused3) {
                                                str = str2;
                                            }
                                            i2 = i4;
                                            jSONArray5 = jSONArray;
                                            jSONArray4 = jSONArray2;
                                            jSONArray6 = jSONArray3;
                                            activity2 = activity;
                                            i = i2;
                                        } else {
                                            str = str2;
                                            jSONArray5 = jSONArray;
                                            i = i4;
                                            activity2 = activity;
                                            View findViewById3 = activity2.findViewById(activity.getResources().getIdentifier(jSONArray5.getString(i), "id", activity.getPackageName()));
                                            if (findViewById3 instanceof TextView) {
                                                jSONArray4 = jSONArray2;
                                                jSONArray4.put(r0.setMax(findViewById3, z2));
                                                jSONArray6 = jSONArray3;
                                                jSONArray6.put(string);
                                            } else {
                                                jSONArray4 = jSONArray2;
                                                jSONArray6 = jSONArray3;
                                            }
                                        }
                                        i4 = i + 1;
                                        str2 = str;
                                        Activity activity4 = activity2;
                                        jSONArray9 = jSONArray6;
                                        jSONArray7 = jSONArray5;
                                        jSONArray8 = jSONArray4;
                                        activity3 = activity4;
                                    } catch (JSONException unused4) {
                                        return;
                                    }
                                }
                            }
                        };
                    }
                    TinyBlurMenu.AnonymousClass5 r0 = TinyBlurMenu.AnonymousClass5.getMax;
                    String min = startTinyAppAndCloseCurrent.setMin("bnc_external_intent_uri");
                    if (min.equals("bnc_no_value")) {
                        min = null;
                    }
                    r0.length(activity, min);
                } catch (Exception unused2) {
                }
            }
            if (this.setMin <= 0) {
                if (Branch.this.onPostMessage == SESSION_STATE.INITIALISED) {
                    SESSION_STATE unused3 = Branch.this.onPostMessage = SESSION_STATE.UNINITIALISED;
                }
                Branch.setMin(Branch.this, activity);
            } else if (Branch.getMin(activity.getIntent())) {
                SESSION_STATE unused4 = Branch.this.onPostMessage = SESSION_STATE.UNINITIALISED;
                Branch.setMin(Branch.this, activity);
            }
            this.setMin++;
            boolean unused5 = Branch.this.setDefaultImpl = false;
        }

        public final void onActivityResumed(Activity activity) {
            if (Branch.getMin(activity.getIntent())) {
                SESSION_STATE unused = Branch.this.onPostMessage = SESSION_STATE.UNINITIALISED;
                Branch.setMin(Branch.this, activity);
            }
            Branch.this.IsOverlapping = new WeakReference<>(activity);
            if (Branch.this.onRelationshipValidationResult && !Branch.toDoubleRange) {
                INTENT_STATE unused2 = Branch.this.extraCallbackWithResult = INTENT_STATE.READY;
                Branch.getMin(Branch.this, activity, (activity.getIntent() == null || Branch.this.onPostMessage == SESSION_STATE.INITIALISED) ? false : true);
            }
        }

        public final void onActivityPaused(Activity activity) {
            if (Branch.this.onMessageChannelReady != null) {
                ShareLinkManager floatRange = Branch.this.onMessageChannelReady;
                if (floatRange.getMin != null && floatRange.getMin.isShowing()) {
                    floatRange.getMin.cancel();
                }
            }
        }

        public final void onActivityDestroyed(Activity activity) {
            if (Branch.this.IsOverlapping != null && Branch.this.IsOverlapping.get() == activity) {
                Branch.this.IsOverlapping.clear();
            }
            if (transfer.setMax == null) {
                transfer.setMax = new transfer();
            }
            transfer transfer = transfer.setMax;
            if (transfer.getMax != null && transfer.getMax.equalsIgnoreCase(activity.getClass().getName())) {
                transfer.getMin = false;
            }
        }

        public final void onActivityStopped(Activity activity) {
            if (TinyBlurMenu.AnonymousClass5.getMax == null) {
                TinyBlurMenu.AnonymousClass5.getMax = new Object() {
                    public static AnonymousClass5 getMax;
                    private final AnonymousClass7 FastBitmap$CoordinateSystem = new Object() {
                        MessageDigest getMin;

                        {
                            try {
                                this.getMin = MessageDigest.getInstance("SHA-256");
                            } catch (NoSuchAlgorithmException unused) {
                            }
                        }
                    };
                    AnonymousClass4 IsOverlapping;
                    public final Map<String, WeakReference<ViewTreeObserver>> equals = new HashMap();
                    public Handler getMin = new Handler();
                    public ArrayList<String> isInside = new ArrayList<>();
                    String length;
                    public WeakReference<Activity> setMax;
                    public JSONObject setMin;
                    public ViewTreeObserver.OnScrollChangedListener toDoubleRange = new ViewTreeObserver.OnScrollChangedListener() {
                        public final void onScrollChanged() {
                            AnonymousClass5.this.getMin.removeCallbacks(AnonymousClass5.this.values);
                            if (AnonymousClass5.this.toFloatRange > AnonymousClass5.this.toIntRange) {
                                AnonymousClass5.this.getMin.postDelayed(AnonymousClass5.this.values, 1500);
                            }
                        }
                    };
                    int toFloatRange = 15;
                    int toIntRange;
                    public Runnable toString = new Runnable() {
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void run() {
                            /*
                                r9 = this;
                                o.TinyBlurMenu$5 r0 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                int r1 = r0.toIntRange     // Catch:{ Exception -> 0x0180 }
                                r2 = 1
                                int r1 = r1 + r2
                                r0.toIntRange = r1     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$5 r0 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$4 r0 = r0.IsOverlapping     // Catch:{ Exception -> 0x0180 }
                                boolean r0 = r0.getMin()     // Catch:{ Exception -> 0x0180 }
                                if (r0 == 0) goto L_0x0180
                                o.TinyBlurMenu$5 r0 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                java.lang.ref.WeakReference<android.app.Activity> r0 = r0.setMax     // Catch:{ Exception -> 0x0180 }
                                if (r0 == 0) goto L_0x0180
                                o.TinyBlurMenu$5 r0 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                java.lang.ref.WeakReference<android.app.Activity> r0 = r0.setMax     // Catch:{ Exception -> 0x0180 }
                                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0180 }
                                if (r0 == 0) goto L_0x0180
                                o.TinyBlurMenu$5 r0 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                java.lang.ref.WeakReference<android.app.Activity> r0 = r0.setMax     // Catch:{ Exception -> 0x0180 }
                                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0180 }
                                android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$5 r1 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0180 }
                                r3.<init>()     // Catch:{ Exception -> 0x0180 }
                                r1.setMin = r3     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$5 r1 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                org.json.JSONObject r1 = r1.setMin     // Catch:{ Exception -> 0x0180 }
                                java.lang.String r3 = "ts"
                                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0180 }
                                r1.put(r3, r4)     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$5 r1 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                java.lang.String r1 = r1.length     // Catch:{ Exception -> 0x0180 }
                                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0180 }
                                if (r1 != 0) goto L_0x0059
                                o.TinyBlurMenu$5 r1 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                org.json.JSONObject r1 = r1.setMin     // Catch:{ Exception -> 0x0180 }
                                java.lang.String r3 = "rl"
                                o.TinyBlurMenu$5 r4 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                java.lang.String r4 = r4.length     // Catch:{ Exception -> 0x0180 }
                                r1.put(r3, r4)     // Catch:{ Exception -> 0x0180 }
                            L_0x0059:
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0180 }
                                java.lang.String r3 = "/"
                                r1.<init>(r3)     // Catch:{ Exception -> 0x0180 }
                                java.lang.Class r3 = r0.getClass()     // Catch:{ Exception -> 0x0180 }
                                java.lang.String r3 = r3.getSimpleName()     // Catch:{ Exception -> 0x0180 }
                                r1.append(r3)     // Catch:{ Exception -> 0x0180 }
                                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$5 r3 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                org.json.JSONObject r3 = r3.setMin     // Catch:{ Exception -> 0x0180 }
                                java.lang.String r4 = "v"
                                r3.put(r4, r1)     // Catch:{ Exception -> 0x0180 }
                                r3 = 16908290(0x1020002, float:2.3877235E-38)
                                android.view.View r3 = r0.findViewById(r3)     // Catch:{ Exception -> 0x0180 }
                                android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch:{ Exception -> 0x0180 }
                                if (r3 == 0) goto L_0x0180
                                o.TinyBlurMenu$5 r4 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$4 r4 = r4.IsOverlapping     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$4$setMin r4 = r4.setMax(r0)     // Catch:{ Exception -> 0x0180 }
                                if (r4 == 0) goto L_0x0090
                                r4.setMax()     // Catch:{ Exception -> 0x0180 }
                            L_0x0090:
                                r5 = 0
                                r6 = 0
                                if (r4 == 0) goto L_0x00ab
                                boolean r5 = r4.setMax()     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$5 r7 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                org.json.JSONObject r7 = r7.setMin     // Catch:{ Exception -> 0x0180 }
                                java.lang.String r8 = "h"
                                if (r5 != 0) goto L_0x00a1
                                goto L_0x00a2
                            L_0x00a1:
                                r2 = 0
                            L_0x00a2:
                                r7.put(r8, r2)     // Catch:{ Exception -> 0x0180 }
                                org.json.JSONArray r2 = r4.setMin()     // Catch:{ Exception -> 0x0180 }
                                r8 = r5
                                goto L_0x00ad
                            L_0x00ab:
                                r2 = r5
                                r8 = 0
                            L_0x00ad:
                                java.lang.String r4 = "ck"
                                if (r2 == 0) goto L_0x00d9
                                int r5 = r2.length()     // Catch:{ Exception -> 0x0180 }
                                if (r5 <= 0) goto L_0x00d9
                                org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x0180 }
                                r6.<init>()     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$5 r3 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                org.json.JSONObject r3 = r3.setMin     // Catch:{ Exception -> 0x0180 }
                                r3.put(r4, r6)     // Catch:{ Exception -> 0x0180 }
                                org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x0180 }
                                r5.<init>()     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$5 r3 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                org.json.JSONObject r3 = r3.setMin     // Catch:{ Exception -> 0x0180 }
                                java.lang.String r4 = "cd"
                                r3.put(r4, r5)     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$5 r3 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                r4 = r2
                                r7 = r0
                                o.TinyBlurMenu.AnonymousClass5.getMax(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0180 }
                                goto L_0x00f8
                            L_0x00d9:
                                o.TinyBlurMenu$5 r5 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                java.util.ArrayList<java.lang.String> r5 = r5.isInside     // Catch:{ Exception -> 0x0180 }
                                boolean r5 = r5.contains(r1)     // Catch:{ Exception -> 0x0180 }
                                if (r5 != 0) goto L_0x00f8
                                org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x0180 }
                                r5.<init>()     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$5 r6 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                org.json.JSONObject r6 = r6.setMin     // Catch:{ Exception -> 0x0180 }
                                r6.put(r4, r5)     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$5 r4 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                android.content.res.Resources r6 = r0.getResources()     // Catch:{ Exception -> 0x0180 }
                                r4.getMin(r3, r5, r6)     // Catch:{ Exception -> 0x0180 }
                            L_0x00f8:
                                o.TinyBlurMenu$5 r3 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                java.util.ArrayList<java.lang.String> r3 = r3.isInside     // Catch:{ Exception -> 0x0180 }
                                r3.add(r1)     // Catch:{ Exception -> 0x0180 }
                                o.startTinyAppAndCloseCurrent.length((android.content.Context) r0)     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$5 r1 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                org.json.JSONObject r1 = r1.setMin     // Catch:{ Exception -> 0x0180 }
                                java.lang.String r3 = "bnc_session_id"
                                java.lang.String r3 = o.startTinyAppAndCloseCurrent.setMin((java.lang.String) r3)     // Catch:{ Exception -> 0x0180 }
                                java.lang.String r4 = "bnc_no_value"
                                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x0180 }
                                if (r4 != 0) goto L_0x0146
                                org.json.JSONObject r4 = o.startTinyAppAndCloseCurrent.toFloatRange     // Catch:{ Exception -> 0x0180 }
                                if (r4 != 0) goto L_0x011e
                                org.json.JSONObject r4 = o.startTinyAppAndCloseCurrent.equals()     // Catch:{ Exception -> 0x0180 }
                                o.startTinyAppAndCloseCurrent.toFloatRange = r4     // Catch:{ Exception -> 0x0180 }
                            L_0x011e:
                                org.json.JSONObject r4 = o.startTinyAppAndCloseCurrent.toFloatRange     // Catch:{ JSONException -> 0x0146 }
                                boolean r4 = r4.has(r3)     // Catch:{ JSONException -> 0x0146 }
                                if (r4 == 0) goto L_0x012d
                                org.json.JSONObject r4 = o.startTinyAppAndCloseCurrent.toFloatRange     // Catch:{ JSONException -> 0x0146 }
                                org.json.JSONArray r3 = r4.getJSONArray(r3)     // Catch:{ JSONException -> 0x0146 }
                                goto L_0x0138
                            L_0x012d:
                                org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0146 }
                                r4.<init>()     // Catch:{ JSONException -> 0x0146 }
                                org.json.JSONObject r5 = o.startTinyAppAndCloseCurrent.toFloatRange     // Catch:{ JSONException -> 0x0146 }
                                r5.put(r3, r4)     // Catch:{ JSONException -> 0x0146 }
                                r3 = r4
                            L_0x0138:
                                r3.put(r1)     // Catch:{ JSONException -> 0x0146 }
                                java.lang.String r1 = "bnc_branch_analytical_data"
                                org.json.JSONObject r3 = o.startTinyAppAndCloseCurrent.toFloatRange     // Catch:{ JSONException -> 0x0146 }
                                java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0146 }
                                o.startTinyAppAndCloseCurrent.length((java.lang.String) r1, (java.lang.String) r3)     // Catch:{ JSONException -> 0x0146 }
                            L_0x0146:
                                o.TinyBlurMenu$5 r1 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$4 r1 = r1.IsOverlapping     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$4$setMin r1 = r1.setMax(r0)     // Catch:{ Exception -> 0x0180 }
                                int r1 = r1.getMax     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$5 r3 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$5 r4 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$4 r4 = r4.IsOverlapping     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$4$setMin r0 = r4.setMax(r0)     // Catch:{ Exception -> 0x0180 }
                                int r0 = r0.length     // Catch:{ Exception -> 0x0180 }
                                r3.toFloatRange = r0     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$5 r0 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                int r0 = r0.toIntRange     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$5 r3 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                int r3 = r3.toFloatRange     // Catch:{ Exception -> 0x0180 }
                                if (r0 >= r3) goto L_0x0180
                                r0 = 500(0x1f4, float:7.0E-43)
                                if (r1 < r0) goto L_0x0180
                                if (r2 == 0) goto L_0x0180
                                int r0 = r2.length()     // Catch:{ Exception -> 0x0180 }
                                if (r0 <= 0) goto L_0x0180
                                o.TinyBlurMenu$5 r0 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                android.os.Handler r0 = r0.getMin     // Catch:{ Exception -> 0x0180 }
                                o.TinyBlurMenu$5 r2 = o.TinyBlurMenu.AnonymousClass5.this     // Catch:{ Exception -> 0x0180 }
                                java.lang.Runnable r2 = r2.toString     // Catch:{ Exception -> 0x0180 }
                                long r3 = (long) r1     // Catch:{ Exception -> 0x0180 }
                                r0.postDelayed(r2, r3)     // Catch:{ Exception -> 0x0180 }
                            L_0x0180:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: o.TinyBlurMenu.AnonymousClass5.AnonymousClass5.run():void");
                        }
                    };
                    Runnable values = new Runnable() {
                        public final void run() {
                            AnonymousClass5.this.toString.run();
                        }
                    };

                    private void getMin(Activity activity) {
                        this.toIntRange = 0;
                        if (this.isInside.size() < this.IsOverlapping.getMin) {
                            this.getMin.removeCallbacks(this.toString);
                            this.setMax = new WeakReference<>(activity);
                            this.getMin.postDelayed(this.toString, 1000);
                        }
                    }

                    /* access modifiers changed from: private */
                    public void getMin(ViewGroup viewGroup, JSONArray jSONArray, Resources resources) {
                        for (int i = 0; i < viewGroup.getChildCount(); i++) {
                            View childAt = viewGroup.getChildAt(i);
                            if (childAt.getVisibility() == 0) {
                                if ((childAt instanceof AbsListView) || childAt.getClass().getSimpleName().equals("RecyclerView")) {
                                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                                    JSONObject jSONObject = new JSONObject();
                                    if (viewGroup2 != null && viewGroup2.getChildCount() >= 0) {
                                        int i2 = 1;
                                        if (viewGroup2.getChildCount() <= 1) {
                                            i2 = 0;
                                        }
                                        View childAt2 = viewGroup2.getChildAt(i2);
                                        if (childAt2 != null) {
                                            JSONArray jSONArray2 = new JSONArray();
                                            try {
                                                jSONObject.put(length((View) viewGroup2, resources), jSONArray2);
                                            } catch (JSONException unused) {
                                            }
                                            if (childAt2 instanceof ViewGroup) {
                                                getMin((ViewGroup) childAt2, jSONArray2, resources);
                                            } else if (childAt2 instanceof TextView) {
                                                jSONArray2.put(length(childAt2, resources));
                                            }
                                            if (jSONObject.length() > 0) {
                                                jSONArray.put("$".concat(String.valueOf(jSONObject)));
                                            }
                                        }
                                    }
                                } else if (childAt instanceof ViewGroup) {
                                    getMin((ViewGroup) childAt, jSONArray, resources);
                                } else if (childAt instanceof TextView) {
                                    jSONArray.put(length(childAt, resources));
                                }
                            }
                        }
                    }

                    private static String length(View view, Resources resources) {
                        try {
                            return resources.getResourceEntryName(view.getId());
                        } catch (Exception unused) {
                            return String.valueOf(view.getId());
                        }
                    }

                    private String setMax(View view, boolean z) {
                        TextView textView = (TextView) view;
                        if (textView.getText() == null) {
                            return null;
                        }
                        int i = 0;
                        String substring = textView.getText().toString().substring(0, Math.min(textView.getText().toString().length(), this.IsOverlapping.setMax));
                        if (z) {
                            return substring;
                        }
                        AnonymousClass7 r6 = this.FastBitmap$CoordinateSystem;
                        if (substring != null) {
                            i = substring.length();
                        }
                        int max = dispatchOnCancelled.setMax(i);
                        if (i != max) {
                            onCanceled oncanceled = new onCanceled(i, max, 1);
                            onCancelLoad.setMax(-304577768, oncanceled);
                            onCancelLoad.getMin(-304577768, oncanceled);
                        }
                        if (r6.getMin == null) {
                            return "";
                        }
                        r6.getMin.reset();
                        r6.getMin.update(substring.getBytes());
                        return new String(r6.getMin.digest());
                    }

                    public final JSONObject getMax(Context context) {
                        JSONObject jSONObject;
                        String str;
                        startTinyAppAndCloseCurrent.length(context);
                        JSONObject equals2 = startTinyAppAndCloseCurrent.equals();
                        if (equals2.length() <= 0 || equals2.toString().length() >= this.IsOverlapping.IsOverlapping) {
                            jSONObject = null;
                        } else {
                            jSONObject = new JSONObject();
                            try {
                                if (AnonymousClass4.getMax == null) {
                                    AnonymousClass4.getMax = new Object(context) {
                                        public static AnonymousClass4 getMax;
                                        public int IsOverlapping = 0;
                                        public JSONArray equals;
                                        public int getMin = 1;
                                        public boolean isInside = false;
                                        public String length;
                                        public int setMax = 0;
                                        public JSONObject setMin;
                                        private final String toFloatRange = "BNC_CD_MANIFEST";
                                        public SharedPreferences toIntRange;

                                        {
                                            SharedPreferences sharedPreferences = r6.getSharedPreferences("bnc_content_discovery_manifest_storage", 0);
                                            this.toIntRange = sharedPreferences;
                                            String string = sharedPreferences.getString("BNC_CD_MANIFEST", (String) null);
                                            if (string != null) {
                                                try {
                                                    JSONObject jSONObject = new JSONObject(string);
                                                    this.setMin = jSONObject;
                                                    if (jSONObject.has("mv")) {
                                                        this.length = this.setMin.getString("mv");
                                                    }
                                                    if (this.setMin.has("m")) {
                                                        this.equals = this.setMin.getJSONArray("m");
                                                    }
                                                } catch (JSONException unused) {
                                                    this.setMin = new JSONObject();
                                                }
                                            } else {
                                                this.setMin = new JSONObject();
                                            }
                                        }

                                        /* access modifiers changed from: package-private */
                                        public final setMin setMax(Activity activity) {
                                            if (this.equals != null) {
                                                StringBuilder sb = new StringBuilder("/");
                                                sb.append(activity.getClass().getSimpleName());
                                                String obj = sb.toString();
                                                int i = 0;
                                                while (i < this.equals.length()) {
                                                    try {
                                                        JSONObject jSONObject = this.equals.getJSONObject(i);
                                                        if (jSONObject.has("p") && jSONObject.getString("p").equals(obj)) {
                                                            return new setMin(jSONObject);
                                                        }
                                                        i++;
                                                    } catch (JSONException unused) {
                                                    }
                                                }
                                            }
                                            return null;
                                        }

                                        /* access modifiers changed from: package-private */
                                        public final boolean getMin() {
                                            return this.isInside;
                                        }

                                        /* renamed from: o.TinyBlurMenu$4$setMin */
                                        class setMin {
                                            int getMax;
                                            final JSONObject getMin;
                                            int length = 15;
                                            private boolean setMin;

                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            setMin(org.json.JSONObject r5) {
                                                /*
                                                    r3 = this;
                                                    java.lang.String r0 = "mdr"
                                                    java.lang.String r1 = "dri"
                                                    o.TinyBlurMenu.AnonymousClass4.this = r4
                                                    r3.<init>()
                                                    r3.getMin = r5
                                                    r4 = 15
                                                    r3.length = r4
                                                    java.lang.String r4 = "h"
                                                    boolean r2 = r5.has(r4)
                                                    if (r2 == 0) goto L_0x0022
                                                    boolean r4 = r5.getBoolean(r4)     // Catch:{ JSONException -> 0x0022 }
                                                    if (r4 != 0) goto L_0x001f
                                                    r4 = 1
                                                    goto L_0x0020
                                                L_0x001f:
                                                    r4 = 0
                                                L_0x0020:
                                                    r3.setMin = r4     // Catch:{ JSONException -> 0x0022 }
                                                L_0x0022:
                                                    boolean r4 = r5.has(r1)     // Catch:{ JSONException -> 0x003a }
                                                    if (r4 == 0) goto L_0x002e
                                                    int r4 = r5.getInt(r1)     // Catch:{ JSONException -> 0x003a }
                                                    r3.getMax = r4     // Catch:{ JSONException -> 0x003a }
                                                L_0x002e:
                                                    boolean r4 = r5.has(r0)     // Catch:{ JSONException -> 0x003a }
                                                    if (r4 == 0) goto L_0x003a
                                                    int r4 = r5.getInt(r0)     // Catch:{ JSONException -> 0x003a }
                                                    r3.length = r4     // Catch:{ JSONException -> 0x003a }
                                                L_0x003a:
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: o.TinyBlurMenu.AnonymousClass4.setMin.<init>(o.TinyBlurMenu$4, org.json.JSONObject):void");
                                            }

                                            /* access modifiers changed from: package-private */
                                            public final JSONArray setMin() {
                                                if (this.getMin.has("ck")) {
                                                    try {
                                                        return this.getMin.getJSONArray("ck");
                                                    } catch (JSONException unused) {
                                                    }
                                                }
                                                return null;
                                            }

                                            /* access modifiers changed from: package-private */
                                            public final boolean setMax() {
                                                return this.setMin;
                                            }

                                            /* access modifiers changed from: package-private */
                                            public final boolean getMax() {
                                                JSONArray min = setMin();
                                                return min != null && min.length() == 0;
                                            }
                                        }
                                    };
                                }
                                AnonymousClass4 r4 = AnonymousClass4.getMax;
                                if (TextUtils.isEmpty(r4.length)) {
                                    str = "-1";
                                } else {
                                    str = r4.length;
                                }
                                jSONObject.put("mv", str).put("e", equals2);
                                if (context != null) {
                                    jSONObject.put("p", context.getPackageName());
                                    jSONObject.put("p", context.getPackageName());
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        startTinyAppAndCloseCurrent.length(context);
                        startTinyAppAndCloseCurrent.toFloatRange = null;
                        startTinyAppAndCloseCurrent.length("bnc_branch_analytical_data", "");
                        return jSONObject;
                    }

                    public final void length(Activity activity, String str) {
                        if (AnonymousClass4.getMax == null) {
                            AnonymousClass4.getMax = new Object(activity) {
                                public static AnonymousClass4 getMax;
                                public int IsOverlapping = 0;
                                public JSONArray equals;
                                public int getMin = 1;
                                public boolean isInside = false;
                                public String length;
                                public int setMax = 0;
                                public JSONObject setMin;
                                private final String toFloatRange = "BNC_CD_MANIFEST";
                                public SharedPreferences toIntRange;

                                {
                                    SharedPreferences sharedPreferences = r6.getSharedPreferences("bnc_content_discovery_manifest_storage", 0);
                                    this.toIntRange = sharedPreferences;
                                    String string = sharedPreferences.getString("BNC_CD_MANIFEST", (String) null);
                                    if (string != null) {
                                        try {
                                            JSONObject jSONObject = new JSONObject(string);
                                            this.setMin = jSONObject;
                                            if (jSONObject.has("mv")) {
                                                this.length = this.setMin.getString("mv");
                                            }
                                            if (this.setMin.has("m")) {
                                                this.equals = this.setMin.getJSONArray("m");
                                            }
                                        } catch (JSONException unused) {
                                            this.setMin = new JSONObject();
                                        }
                                    } else {
                                        this.setMin = new JSONObject();
                                    }
                                }

                                /* access modifiers changed from: package-private */
                                public final setMin setMax(Activity activity) {
                                    if (this.equals != null) {
                                        StringBuilder sb = new StringBuilder("/");
                                        sb.append(activity.getClass().getSimpleName());
                                        String obj = sb.toString();
                                        int i = 0;
                                        while (i < this.equals.length()) {
                                            try {
                                                JSONObject jSONObject = this.equals.getJSONObject(i);
                                                if (jSONObject.has("p") && jSONObject.getString("p").equals(obj)) {
                                                    return new setMin(jSONObject);
                                                }
                                                i++;
                                            } catch (JSONException unused) {
                                            }
                                        }
                                    }
                                    return null;
                                }

                                /* access modifiers changed from: package-private */
                                public final boolean getMin() {
                                    return this.isInside;
                                }

                                /* renamed from: o.TinyBlurMenu$4$setMin */
                                class setMin {
                                    int getMax;
                                    final JSONObject getMin;
                                    int length = 15;
                                    private boolean setMin;

                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    setMin(org.json.JSONObject r5) {
                                        /*
                                            r3 = this;
                                            java.lang.String r0 = "mdr"
                                            java.lang.String r1 = "dri"
                                            o.TinyBlurMenu.AnonymousClass4.this = r4
                                            r3.<init>()
                                            r3.getMin = r5
                                            r4 = 15
                                            r3.length = r4
                                            java.lang.String r4 = "h"
                                            boolean r2 = r5.has(r4)
                                            if (r2 == 0) goto L_0x0022
                                            boolean r4 = r5.getBoolean(r4)     // Catch:{ JSONException -> 0x0022 }
                                            if (r4 != 0) goto L_0x001f
                                            r4 = 1
                                            goto L_0x0020
                                        L_0x001f:
                                            r4 = 0
                                        L_0x0020:
                                            r3.setMin = r4     // Catch:{ JSONException -> 0x0022 }
                                        L_0x0022:
                                            boolean r4 = r5.has(r1)     // Catch:{ JSONException -> 0x003a }
                                            if (r4 == 0) goto L_0x002e
                                            int r4 = r5.getInt(r1)     // Catch:{ JSONException -> 0x003a }
                                            r3.getMax = r4     // Catch:{ JSONException -> 0x003a }
                                        L_0x002e:
                                            boolean r4 = r5.has(r0)     // Catch:{ JSONException -> 0x003a }
                                            if (r4 == 0) goto L_0x003a
                                            int r4 = r5.getInt(r0)     // Catch:{ JSONException -> 0x003a }
                                            r3.length = r4     // Catch:{ JSONException -> 0x003a }
                                        L_0x003a:
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: o.TinyBlurMenu.AnonymousClass4.setMin.<init>(o.TinyBlurMenu$4, org.json.JSONObject):void");
                                    }

                                    /* access modifiers changed from: package-private */
                                    public final JSONArray setMin() {
                                        if (this.getMin.has("ck")) {
                                            try {
                                                return this.getMin.getJSONArray("ck");
                                            } catch (JSONException unused) {
                                            }
                                        }
                                        return null;
                                    }

                                    /* access modifiers changed from: package-private */
                                    public final boolean setMax() {
                                        return this.setMin;
                                    }

                                    /* access modifiers changed from: package-private */
                                    public final boolean getMax() {
                                        JSONArray min = setMin();
                                        return min != null && min.length() == 0;
                                    }
                                }
                            };
                        }
                        AnonymousClass4 r0 = AnonymousClass4.getMax;
                        this.IsOverlapping = r0;
                        this.length = str;
                        AnonymousClass4.setMin max = r0.setMax(activity);
                        if (max != null) {
                            if (!max.getMax()) {
                                getMin(activity);
                            }
                        } else if (!TextUtils.isEmpty(this.length)) {
                            getMin(activity);
                        }
                    }

                    static /* synthetic */ void getMax(AnonymousClass5 r20, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, Activity activity, boolean z) {
                        String str;
                        int i;
                        JSONArray jSONArray4;
                        Activity activity2;
                        JSONArray jSONArray5;
                        JSONArray jSONArray6;
                        int i2;
                        int i3;
                        AnonymousClass5 r0 = r20;
                        JSONArray jSONArray7 = jSONArray;
                        JSONArray jSONArray8 = jSONArray2;
                        JSONArray jSONArray9 = jSONArray3;
                        Activity activity3 = activity;
                        boolean z2 = z;
                        String str2 = "$";
                        int i4 = 0;
                        while (i4 < jSONArray.length()) {
                            try {
                                String string = jSONArray7.getString(i4);
                                if (string.startsWith(str2)) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONArray9.put(string);
                                    jSONArray8.put(jSONObject);
                                    String replace = string.replace(str2, "");
                                    try {
                                        JSONObject jSONObject2 = new JSONObject(replace);
                                        if (jSONObject2.length() > 0) {
                                            String next = jSONObject2.keys().next();
                                            str = str2;
                                            try {
                                                int identifier = activity.getResources().getIdentifier(next, "id", activity.getPackageName());
                                                View findViewById = activity.getCurrentFocus() != null ? activity.getCurrentFocus().findViewById(identifier) : null;
                                                if (findViewById == null) {
                                                    findViewById = activity3.findViewById(identifier);
                                                }
                                                if (findViewById != null && (findViewById instanceof ViewGroup)) {
                                                    ViewGroup viewGroup = (ViewGroup) findViewById;
                                                    JSONArray jSONArray10 = jSONObject2.getJSONArray(next);
                                                    int length2 = jSONArray10.length();
                                                    int[] iArr = new int[length2];
                                                    int i5 = 0;
                                                    while (i5 < jSONArray10.length()) {
                                                        i2 = i4;
                                                        try {
                                                            iArr[i5] = activity.getResources().getIdentifier(jSONArray10.getString(i5), "id", activity.getPackageName());
                                                            i5++;
                                                            JSONArray jSONArray11 = jSONArray;
                                                            i4 = i2;
                                                        } catch (JSONException unused) {
                                                        }
                                                    }
                                                    i2 = i4;
                                                    int firstVisiblePosition = viewGroup instanceof AbsListView ? ((AbsListView) viewGroup).getFirstVisiblePosition() : 0;
                                                    int i6 = 0;
                                                    while (i6 < viewGroup.getChildCount()) {
                                                        if (viewGroup.getChildAt(i6) != null) {
                                                            JSONObject jSONObject3 = new JSONObject();
                                                            StringBuilder sb = new StringBuilder("");
                                                            sb.append(i6 + firstVisiblePosition);
                                                            jSONObject.put(sb.toString(), jSONObject3);
                                                            int i7 = 0;
                                                            while (i7 < length2) {
                                                                if (viewGroup.getChildAt(i6) != null) {
                                                                    i3 = firstVisiblePosition;
                                                                    View findViewById2 = viewGroup.getChildAt(i6).findViewById(iArr[i7]);
                                                                    if (findViewById2 instanceof TextView) {
                                                                        jSONObject3.put(jSONArray10.getString(i7), r0.setMax(findViewById2, z2));
                                                                    }
                                                                } else {
                                                                    i3 = firstVisiblePosition;
                                                                }
                                                                i7++;
                                                                firstVisiblePosition = i3;
                                                            }
                                                        }
                                                        i6++;
                                                        firstVisiblePosition = firstVisiblePosition;
                                                    }
                                                    if ((jSONObject2.has("bnc_esw") && jSONObject2.getBoolean("bnc_esw")) && !r0.equals.containsKey(replace)) {
                                                        viewGroup.getViewTreeObserver().addOnScrollChangedListener(r0.toDoubleRange);
                                                        r0.equals.put(replace, new WeakReference(viewGroup.getViewTreeObserver()));
                                                    }
                                                    jSONArray5 = jSONArray;
                                                    jSONArray4 = jSONArray2;
                                                    jSONArray6 = jSONArray3;
                                                    activity2 = activity;
                                                    i = i2;
                                                }
                                            } catch (JSONException unused2) {
                                            }
                                        } else {
                                            str = str2;
                                        }
                                    } catch (JSONException unused3) {
                                        str = str2;
                                    }
                                    i2 = i4;
                                    jSONArray5 = jSONArray;
                                    jSONArray4 = jSONArray2;
                                    jSONArray6 = jSONArray3;
                                    activity2 = activity;
                                    i = i2;
                                } else {
                                    str = str2;
                                    jSONArray5 = jSONArray;
                                    i = i4;
                                    activity2 = activity;
                                    View findViewById3 = activity2.findViewById(activity.getResources().getIdentifier(jSONArray5.getString(i), "id", activity.getPackageName()));
                                    if (findViewById3 instanceof TextView) {
                                        jSONArray4 = jSONArray2;
                                        jSONArray4.put(r0.setMax(findViewById3, z2));
                                        jSONArray6 = jSONArray3;
                                        jSONArray6.put(string);
                                    } else {
                                        jSONArray4 = jSONArray2;
                                        jSONArray6 = jSONArray3;
                                    }
                                }
                                i4 = i + 1;
                                str2 = str;
                                Activity activity4 = activity2;
                                jSONArray9 = jSONArray6;
                                jSONArray7 = jSONArray5;
                                jSONArray8 = jSONArray4;
                                activity3 = activity4;
                            } catch (JSONException unused4) {
                                return;
                            }
                        }
                    }
                };
            }
            TinyBlurMenu.AnonymousClass5 r0 = TinyBlurMenu.AnonymousClass5.getMax;
            if (!(r0.setMax == null || r0.setMax.get() == null || !r0.setMax.get().getClass().getName().equals(activity.getClass().getName()))) {
                r0.getMin.removeCallbacks(r0.toString);
                r0.setMax = null;
            }
            try {
                if (r0.setMin != null) {
                    r0.setMin.put(RVParams.TITLE_COLOR, System.currentTimeMillis());
                }
            } catch (JSONException unused) {
            }
            for (WeakReference<ViewTreeObserver> weakReference : r0.equals.values()) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnScrollChangedListener(r0.toDoubleRange);
                }
            }
            r0.equals.clear();
            int i = this.setMin - 1;
            this.setMin = i;
            if (i <= 0) {
                Branch.this.toFloatRange = false;
                Branch.this.length();
            }
        }
    }

    /* access modifiers changed from: private */
    public static boolean getMin(Intent intent) {
        if (intent != null) {
            try {
                if (intent.getBooleanExtra(Defines.Jsonkey.ForceNewBranchSession.getKey(), false)) {
                    try {
                        intent.putExtra(Defines.Jsonkey.ForceNewBranchSession.getKey(), false);
                        return true;
                    } catch (Throwable unused) {
                        return true;
                    }
                } else if (intent.getStringExtra(Defines.Jsonkey.AndroidPushNotificationKey.getKey()) == null || intent.getBooleanExtra(Defines.Jsonkey.BranchLinkUsed.getKey(), false)) {
                    return false;
                } else {
                    return true;
                }
            } catch (Throwable unused2) {
            }
        }
        return false;
    }

    class isInside extends AsyncTask<ServerRequest, Void, getViewTypeCount> {
        private isInside() {
        }

        /* synthetic */ isInside(Branch branch, byte b) {
            this();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            BranchRemoteInterface IsOverlapping = Branch.this.Mean$Arithmetic;
            JSONObject jSONObject = ((ServerRequest[]) objArr)[0].getMax;
            StringBuilder sb = new StringBuilder();
            startTinyAppAndCloseCurrent unused = Branch.this.setMax;
            sb.append(startTinyAppAndCloseCurrent.setMin());
            sb.append("v1/url");
            String obj = sb.toString();
            String path = Defines.RequestPath.GetURL.getPath();
            startTinyAppAndCloseCurrent unused2 = Branch.this.setMax;
            if (startTinyAppAndCloseCurrent.getMax == null) {
                startTinyAppAndCloseCurrent.getMax = startTinyAppAndCloseCurrent.setMin("bnc_branch_key");
            }
            return IsOverlapping.setMax(jSONObject, obj, path, startTinyAppAndCloseCurrent.getMax);
        }
    }

    class setMin extends setFavorite<Void, Void, getViewTypeCount> {
        ServerRequest getMax;

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            getViewTypeCount getviewtypecount = (getViewTypeCount) obj;
            super.onPostExecute(getviewtypecount);
            if (getviewtypecount != null) {
                try {
                    int i = getviewtypecount.setMax;
                    boolean unused = Branch.this.ICustomTabsCallback = true;
                    if (getviewtypecount.setMax == -117) {
                        this.getMax.values();
                        Branch.this.invokeSuspend.length(this.getMax);
                    } else {
                        int i2 = 0;
                        if (i != 200) {
                            if (this.getMax instanceof TinyMenuPopupWindow.AnonymousClass4) {
                                SESSION_STATE unused2 = Branch.this.onPostMessage = SESSION_STATE.UNINITIALISED;
                            }
                            if (i != 400) {
                                if (i != 409) {
                                    boolean unused3 = Branch.this.ICustomTabsCallback = false;
                                    ArrayList arrayList = new ArrayList();
                                    while (i2 < Branch.this.invokeSuspend.length()) {
                                        arrayList.add(Branch.this.invokeSuspend.setMax(i2));
                                        i2++;
                                    }
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        ServerRequest serverRequest = (ServerRequest) it.next();
                                        if (serverRequest == null || !serverRequest.setMax()) {
                                            Branch.this.invokeSuspend.length(serverRequest);
                                        }
                                    }
                                    int unused4 = Branch.this.b = 0;
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        ServerRequest serverRequest2 = (ServerRequest) it2.next();
                                        if (serverRequest2 != null) {
                                            serverRequest2.setMin(i, getviewtypecount.length());
                                            if (serverRequest2.setMax()) {
                                                serverRequest2.getMin();
                                            }
                                        }
                                    }
                                }
                            }
                            Branch.this.invokeSuspend.length(this.getMax);
                            if (this.getMax instanceof startRecentTinyApp) {
                                startRecentTinyApp startrecenttinyapp = (startRecentTinyApp) this.getMax;
                                if (startrecenttinyapp.IsOverlapping != null) {
                                    startrecenttinyapp.IsOverlapping.getMin((String) null, new Object("Trouble creating a URL.", BranchLinkConstant.DeepLinkErrorCode.SAME_ALIAS) {
                                        public int getMin = -113;
                                        public String setMin = "";

                                        {
                                            String str;
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(r4);
                                            if (r5 == -113) {
                                                this.getMin = -113;
                                                str = " Branch API Error: poor network connectivity. Please try again later.";
                                            } else if (r5 == -114) {
                                                this.getMin = -114;
                                                str = " Branch API Error: Please enter your branch_key in your project's manifest file first.";
                                            } else if (r5 == -104) {
                                                this.getMin = -104;
                                                str = " Did you forget to call init? Make sure you init the session before making Branch calls.";
                                            } else if (r5 == -101) {
                                                this.getMin = -101;
                                                str = " Unable to initialize Branch. Check network connectivity or that your branch key is valid.";
                                            } else if (r5 == -102) {
                                                this.getMin = -102;
                                                str = " Please add 'android.permission.INTERNET' in your applications manifest file.";
                                            } else if (r5 == -105) {
                                                this.getMin = BranchLinkConstant.DeepLinkErrorCode.SAME_ALIAS;
                                                str = " Unable to create a URL with that alias. If you want to reuse the alias, make sure to submit the same properties for all arguments and that the user is the same owner.";
                                            } else if (r5 == -106) {
                                                this.getMin = -106;
                                                str = " That Branch referral code is already in use.";
                                            } else if (r5 == -107) {
                                                this.getMin = -107;
                                                str = " Unable to redeem rewards. Please make sure you have credits available to redeem.";
                                            } else if (r5 == -108) {
                                                this.getMin = -108;
                                                str = "BranchApp class can be used only with API level 14 or above. Please make sure your minimum API level supported is 14. If you wish to use API level below 14 consider calling getInstance(Context) instead.";
                                            } else if (r5 == -109) {
                                                this.getMin = -109;
                                                str = "Branch instance is not created. Make  sure your Application class is an instance of BranchLikedApp.";
                                            } else if (r5 == -110) {
                                                this.getMin = -110;
                                                str = " Unable create share options. Couldn't find applications on device to share the link.";
                                            } else if (r5 == -111) {
                                                this.getMin = -111;
                                                str = " Request to Branch server timed out. Please check your internet connectivity";
                                            } else if (r5 == -117) {
                                                this.getMin = -117;
                                                str = " Tracking is disabled. Requested operation cannot be completed when tracking is disabled";
                                            } else if (r5 >= 500 || r5 == -112) {
                                                this.getMin = -112;
                                                str = " Unable to reach the Branch servers, please try again shortly.";
                                            } else if (r5 == 409 || r5 == -115) {
                                                this.getMin = -115;
                                                str = " A resource with this identifier already exists.";
                                            } else if (r5 >= 400 || r5 == -116) {
                                                this.getMin = -116;
                                                str = " The request was invalid.";
                                            } else {
                                                this.getMin = -113;
                                                str = " Check network connectivity and that you properly initialized.";
                                            }
                                            sb.append(str);
                                            this.setMin = sb.toString();
                                        }

                                        public String toString() {
                                            return this.setMin;
                                        }
                                    });
                                }
                            } else {
                                startTinyAppAndCloseCurrent.FastBitmap$CoordinateSystem("Branch API Error: Conflicting resource error code from API");
                                Branch.this.getMax(0, i);
                            }
                        } else {
                            boolean unused5 = Branch.this.ICustomTabsCallback = true;
                            if (this.getMax instanceof startRecentTinyApp) {
                                if (getviewtypecount.setMin instanceof JSONObject) {
                                    jSONObject2 = (JSONObject) getviewtypecount.setMin;
                                } else {
                                    jSONObject2 = new JSONObject();
                                }
                                if (jSONObject2 != null) {
                                    if (getviewtypecount.setMin instanceof JSONObject) {
                                        jSONObject3 = (JSONObject) getviewtypecount.setMin;
                                    } else {
                                        jSONObject3 = new JSONObject();
                                    }
                                    Branch.this.getCause.put(((startRecentTinyApp) this.getMax).toIntRange, jSONObject3.getString("url"));
                                }
                            } else if (this.getMax instanceof TinyMenuPopupWindow.AnonymousClass3) {
                                Branch.this.getCause.clear();
                                Branch.this.invokeSuspend.getMin();
                            }
                            Branch.this.invokeSuspend.setMin();
                            if (!(this.getMax instanceof TinyMenuPopupWindow.AnonymousClass4)) {
                                if (!(this.getMax instanceof TinyMenuPopupWindow.AnonymousClass6)) {
                                    this.getMax.setMin(getviewtypecount, Branch.setMin);
                                }
                            }
                            if (getviewtypecount.setMin instanceof JSONObject) {
                                jSONObject = (JSONObject) getviewtypecount.setMin;
                            } else {
                                jSONObject = new JSONObject();
                            }
                            if (jSONObject != null) {
                                if (!Branch.this.getMax()) {
                                    if (jSONObject.has(Defines.Jsonkey.SessionID.getKey())) {
                                        startTinyAppAndCloseCurrent unused6 = Branch.this.setMax;
                                        startTinyAppAndCloseCurrent.length("bnc_session_id", jSONObject.getString(Defines.Jsonkey.SessionID.getKey()));
                                        i2 = 1;
                                    }
                                    if (jSONObject.has(Defines.Jsonkey.IdentityID.getKey())) {
                                        String string = jSONObject.getString(Defines.Jsonkey.IdentityID.getKey());
                                        startTinyAppAndCloseCurrent unused7 = Branch.this.setMax;
                                        if (!startTinyAppAndCloseCurrent.setMin("bnc_identity_id").equals(string)) {
                                            Branch.this.getCause.clear();
                                            startTinyAppAndCloseCurrent unused8 = Branch.this.setMax;
                                            startTinyAppAndCloseCurrent.length("bnc_identity_id", jSONObject.getString(Defines.Jsonkey.IdentityID.getKey()));
                                            i2 = 1;
                                        }
                                    }
                                    if (jSONObject.has(Defines.Jsonkey.DeviceFingerprintID.getKey())) {
                                        startTinyAppAndCloseCurrent unused9 = Branch.this.setMax;
                                        startTinyAppAndCloseCurrent.length("bnc_device_fingerprint_id", jSONObject.getString(Defines.Jsonkey.DeviceFingerprintID.getKey()));
                                        i2 = 1;
                                    }
                                }
                                if (i2 != 0) {
                                    Branch.FastBitmap$CoordinateSystem(Branch.this);
                                }
                                if (this.getMax instanceof TinyMenuPopupWindow.AnonymousClass4) {
                                    SESSION_STATE unused10 = Branch.this.onPostMessage = SESSION_STATE.INITIALISED;
                                    this.getMax.setMin(getviewtypecount, Branch.setMin);
                                    if (!Branch.this.isInside && !((TinyMenuPopupWindow.AnonymousClass4) this.getMax).getMin(getviewtypecount)) {
                                        Branch.this.invoke();
                                    }
                                    if (((TinyMenuPopupWindow.AnonymousClass4) this.getMax).invokeSuspend()) {
                                        Branch.this.isInside = true;
                                    }
                                    if (Branch.this.ICustomTabsService != null) {
                                        Branch.this.ICustomTabsService.countDown();
                                    }
                                    if (Branch.this.getInterfaceDescriptor != null) {
                                        Branch.this.getInterfaceDescriptor.countDown();
                                    }
                                } else {
                                    this.getMax.setMin(getviewtypecount, Branch.setMin);
                                }
                            }
                        }
                    }
                    int unused11 = Branch.this.b = 0;
                    if (Branch.this.ICustomTabsCallback && Branch.this.onPostMessage != SESSION_STATE.UNINITIALISED) {
                        Branch.this.toDoubleRange();
                    }
                } catch (JSONException unused12) {
                }
            }
        }

        public setMin(ServerRequest serverRequest) {
            this.getMax = serverRequest;
        }

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            super.onPreExecute();
            this.getMax.equals();
            this.getMax.isInside();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            Branch branch = Branch.this;
            StringBuilder sb = new StringBuilder();
            sb.append(this.getMax.length);
            sb.append("-");
            sb.append(Defines.Jsonkey.Queue_Wait_Time.getKey());
            String obj = sb.toString();
            ServerRequest serverRequest = this.getMax;
            long j = 0;
            if (serverRequest.getMin > 0) {
                j = System.currentTimeMillis() - serverRequest.getMin;
            }
            branch.toIntRange.put(obj, String.valueOf(j));
            ServerRequest serverRequest2 = this.getMax;
            if (serverRequest2 instanceof TinyMenuPopupWindow.AnonymousClass4) {
                TinyMenuPopupWindow.AnonymousClass4 r0 = (TinyMenuPopupWindow.AnonymousClass4) serverRequest2;
                String string = startTinyAppAndCloseCurrent.setMin.setMax.getString("bnc_link_click_identifier", "bnc_no_value");
                if (!string.equals("bnc_no_value")) {
                    try {
                        r0.getMax.put(Defines.Jsonkey.LinkIdentifier.getKey(), string);
                        r0.getMax.put(Defines.Jsonkey.FaceBookAppLinkChecked.getKey(), startTinyAppAndCloseCurrent.getMax());
                    } catch (JSONException unused) {
                    }
                }
                String min = startTinyAppAndCloseCurrent.setMin("bnc_google_search_install_identifier");
                if (!min.equals("bnc_no_value")) {
                    try {
                        r0.getMax.put(Defines.Jsonkey.GoogleSearchInstallReferrer.getKey(), min);
                    } catch (JSONException unused2) {
                    }
                }
                String min2 = startTinyAppAndCloseCurrent.setMin("bnc_google_play_install_referrer_extras");
                if (!min2.equals("bnc_no_value")) {
                    try {
                        r0.getMax.put(Defines.Jsonkey.GooglePlayInstallReferrer.getKey(), min2);
                    } catch (JSONException unused3) {
                    }
                }
                if (startTinyAppAndCloseCurrent.getMin()) {
                    try {
                        r0.getMax.put(Defines.Jsonkey.AndroidAppLinkURL.getKey(), startTinyAppAndCloseCurrent.setMin.setMax.getString("bnc_app_link", "bnc_no_value"));
                        r0.getMax.put(Defines.Jsonkey.IsFullAppConv.getKey(), true);
                    } catch (JSONException unused4) {
                    }
                }
            }
            if (serverRequest2.toDoubleRange() == ServerRequest.BRANCH_API_VERSION.V2 && (optJSONObject2 = serverRequest2.getMax.optJSONObject(Defines.Jsonkey.UserData.getKey())) != null) {
                try {
                    optJSONObject2.put(Defines.Jsonkey.DeveloperIdentity.getKey(), startTinyAppAndCloseCurrent.setMin.setMax.getString("bnc_identity", "bnc_no_value"));
                    optJSONObject2.put(Defines.Jsonkey.DeviceFingerprintID.getKey(), startTinyAppAndCloseCurrent.setMin.setMax.getString("bnc_device_fingerprint_id", "bnc_no_value"));
                } catch (JSONException unused5) {
                }
            }
            if (!getMenuName.length()) {
                ServerRequest.BRANCH_API_VERSION doubleRange = serverRequest2.toDoubleRange();
                int i = getMid.getMin().length.getMax;
                String str = getMid.getMin().length.length;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        if (!(doubleRange == ServerRequest.BRANCH_API_VERSION.V2 || doubleRange == ServerRequest.BRANCH_API_VERSION.V1_CPID)) {
                            if (doubleRange != ServerRequest.BRANCH_API_VERSION.V1_LATD) {
                                serverRequest2.getMax.put(Defines.Jsonkey.GoogleAdvertisingID.getKey(), str);
                                serverRequest2.getMax.put(Defines.Jsonkey.LATVal.getKey(), i);
                            }
                        }
                        JSONObject optJSONObject3 = serverRequest2.getMax.optJSONObject(Defines.Jsonkey.UserData.getKey());
                        if (optJSONObject3 != null) {
                            optJSONObject3.put(Defines.Jsonkey.AAID.getKey(), str);
                            optJSONObject3.put(Defines.Jsonkey.LimitedAdTracking.getKey(), i);
                            optJSONObject3.remove(Defines.Jsonkey.UnidentifiedDevice.getKey());
                        }
                    } catch (JSONException unused6) {
                    }
                } else if (doubleRange == ServerRequest.BRANCH_API_VERSION.V2 || doubleRange == ServerRequest.BRANCH_API_VERSION.V1_CPID) {
                    if ((doubleRange == ServerRequest.BRANCH_API_VERSION.V2 || doubleRange == ServerRequest.BRANCH_API_VERSION.V1_CPID || doubleRange == ServerRequest.BRANCH_API_VERSION.V1_LATD) && (optJSONObject = serverRequest2.getMax.optJSONObject(Defines.Jsonkey.UserData.getKey())) != null && !optJSONObject.has(Defines.Jsonkey.AndroidID.getKey())) {
                        optJSONObject.put(Defines.Jsonkey.UnidentifiedDevice.getKey(), true);
                    }
                }
            }
            if (Branch.this.getMax() && !this.getMax.FastBitmap$CoordinateSystem()) {
                return new getViewTypeCount(this.getMax.length, -117);
            }
            if (this.getMax.setMin()) {
                BranchRemoteInterface IsOverlapping = Branch.this.Mean$Arithmetic;
                String intRange = this.getMax.toIntRange();
                JSONObject jSONObject = this.getMax.getMax;
                String str2 = this.getMax.length;
                startTinyAppAndCloseCurrent unused7 = Branch.this.setMax;
                if (startTinyAppAndCloseCurrent.getMax == null) {
                    startTinyAppAndCloseCurrent.getMax = startTinyAppAndCloseCurrent.setMin("bnc_branch_key");
                }
                return IsOverlapping.setMin(intRange, jSONObject, str2, startTinyAppAndCloseCurrent.getMax);
            }
            BranchRemoteInterface IsOverlapping2 = Branch.this.Mean$Arithmetic;
            JSONObject min3 = this.getMax.setMin((ConcurrentHashMap<String, String>) Branch.this.toIntRange);
            String intRange2 = this.getMax.toIntRange();
            String str3 = this.getMax.length;
            startTinyAppAndCloseCurrent unused8 = Branch.this.setMax;
            if (startTinyAppAndCloseCurrent.getMax == null) {
                startTinyAppAndCloseCurrent.getMax = startTinyAppAndCloseCurrent.setMin("bnc_branch_key");
            }
            return IsOverlapping2.setMax(min3, intRange2, str3, startTinyAppAndCloseCurrent.getMax);
        }
    }

    private static boolean setMin(JSONObject jSONObject, ActivityInfo activityInfo) {
        if (activityInfo.metaData.getString("io.branch.sdk.auto_link_keys") != null) {
            for (String has : activityInfo.metaData.getString("io.branch.sdk.auto_link_keys").split(",")) {
                if (jSONObject.has(has)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean getMax(JSONObject jSONObject, ActivityInfo activityInfo) {
        String str = null;
        try {
            if (jSONObject.has(Defines.Jsonkey.AndroidDeepLinkPath.getKey())) {
                str = jSONObject.getString(Defines.Jsonkey.AndroidDeepLinkPath.getKey());
            } else if (jSONObject.has(Defines.Jsonkey.DeepLinkPath.getKey())) {
                str = jSONObject.getString(Defines.Jsonkey.DeepLinkPath.getKey());
            }
        } catch (JSONException unused) {
        }
        if (!(activityInfo.metaData.getString("io.branch.sdk.auto_link_path") == null || str == null)) {
            for (String trim : activityInfo.metaData.getString("io.branch.sdk.auto_link_path").split(",")) {
                if (getMax(trim.trim(), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean getMax(String str, String str2) {
        String[] split = str.split("\\?")[0].split("/");
        String[] split2 = str2.split("\\?")[0].split("/");
        if (split.length != split2.length) {
            return false;
        }
        int i = 0;
        while (i < split.length && i < split2.length) {
            String str3 = split[i];
            if (!str3.equals(split2[i]) && !str3.contains("*")) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean equals() {
        return values;
    }

    public static void toFloatRange() {
        startTinyAppAndCloseCurrent.setMin(true);
    }

    public static void toIntRange() {
        startTinyAppAndCloseCurrent.setMin(false);
    }

    private static boolean create() {
        return getMax;
    }

    public final void setMin(String str) {
        if (TinyMenuPopupWindow.AnonymousClass4.getMin(str)) {
            invoke();
        }
    }

    public final void length(String str) {
        if (TinyMenuPopupWindow.AnonymousClass4.getMin(str)) {
            invoke();
        }
    }

    public final void getMax(String str) {
        if (TinyMenuPopupWindow.AnonymousClass4.getMin(str)) {
            invoke();
        }
    }

    /* access modifiers changed from: package-private */
    public final void length() {
        if (this.onPostMessage != SESSION_STATE.UNINITIALISED) {
            if (!this.ICustomTabsCallback) {
                ServerRequest max = this.invokeSuspend.setMax();
                if ((max != null && (max instanceof TinyMenuPopupWindow.AnonymousClass7.AnonymousClass1)) || (max instanceof TinyMenuPopupWindow.CornerMarkingUIController)) {
                    this.invokeSuspend.setMin();
                }
            } else if (!this.invokeSuspend.getMax()) {
                setMin((ServerRequest) new TinyMenuPopupWindow.AnonymousClass8(this.getMin));
            }
            this.onPostMessage = SESSION_STATE.UNINITIALISED;
        }
        startTinyAppAndCloseCurrent.length("bnc_external_intent_uri", (String) null);
        setDataProvider setdataprovider = this.newSession;
        startTinyAppAndCloseCurrent.length(this.getMin);
        setdataprovider.getMin = startTinyAppAndCloseCurrent.isInside("bnc_tracking_state");
    }

    private static boolean Mean$Arithmetic() {
        return !startTinyAppAndCloseCurrent.setMin("bnc_session_id").equals("bnc_no_value");
    }

    private static boolean Grayscale$Algorithm() {
        return !startTinyAppAndCloseCurrent.setMin("bnc_device_fingerprint_id").equals("bnc_no_value");
    }

    private static boolean valueOf() {
        return !startTinyAppAndCloseCurrent.setMin("bnc_identity_id").equals("bnc_no_value");
    }

    private void length(getMax getmax) {
        if (startTinyAppAndCloseCurrent.getMax == null) {
            startTinyAppAndCloseCurrent.getMax = startTinyAppAndCloseCurrent.setMin("bnc_branch_key");
        }
        if (startTinyAppAndCloseCurrent.getMax != null) {
            if (startTinyAppAndCloseCurrent.getMax == null) {
                startTinyAppAndCloseCurrent.getMax = startTinyAppAndCloseCurrent.setMin("bnc_branch_key");
            }
            if (!startTinyAppAndCloseCurrent.getMax.equalsIgnoreCase("bnc_no_value")) {
                if (startTinyAppAndCloseCurrent.getMax == null) {
                    startTinyAppAndCloseCurrent.getMax = startTinyAppAndCloseCurrent.setMin("bnc_branch_key");
                }
                if (startTinyAppAndCloseCurrent.getMax != null) {
                    if (startTinyAppAndCloseCurrent.getMax == null) {
                        startTinyAppAndCloseCurrent.getMax = startTinyAppAndCloseCurrent.setMin("bnc_branch_key");
                    }
                    if (startTinyAppAndCloseCurrent.getMax.startsWith("key_test_")) {
                        startTinyAppAndCloseCurrent.toFloatRange("Warning: You are using your test app's Branch Key. Remember to change it to live Branch Key during deployment.");
                    }
                }
                String min = startTinyAppAndCloseCurrent.setMin("bnc_external_intent_uri");
                if (min.equals("bnc_no_value")) {
                    min = null;
                }
                if (min != null || !this.toString) {
                    length(getmax, (ServerRequest.PROCESS_WAIT_LOCK) null);
                    return;
                } else if (getMessageCount.setMax(this.getMin, new getMessageCount.getMin() {
                    public final void getMin(String str) {
                        startTinyAppAndCloseCurrent unused = Branch.this.setMax;
                        startTinyAppAndCloseCurrent.getMax("bnc_triggered_by_fb_app_link", Boolean.TRUE);
                        if (str != null) {
                            String queryParameter = Uri.parse(str).getQueryParameter(Defines.Jsonkey.LinkClickID.getKey());
                            if (!TextUtils.isEmpty(queryParameter)) {
                                startTinyAppAndCloseCurrent unused2 = Branch.this.setMax;
                                startTinyAppAndCloseCurrent.length("bnc_link_click_identifier", queryParameter);
                            }
                        }
                        Branch.this.invokeSuspend.length(ServerRequest.PROCESS_WAIT_LOCK.FB_APP_LINK_WAIT_LOCK);
                        Branch.this.toDoubleRange();
                    }
                }).booleanValue()) {
                    length(getmax, ServerRequest.PROCESS_WAIT_LOCK.FB_APP_LINK_WAIT_LOCK);
                    return;
                } else {
                    length(getmax, (ServerRequest.PROCESS_WAIT_LOCK) null);
                    return;
                }
            }
        }
        this.onPostMessage = SESSION_STATE.UNINITIALISED;
        if (getmax != null) {
            getmax.getMax((JSONObject) null, new Object("Trouble initializing Branch.", -114) {
                public int getMin = -113;
                public String setMin = "";

                {
                    String str;
                    StringBuilder sb = new StringBuilder();
                    sb.append(r4);
                    if (r5 == -113) {
                        this.getMin = -113;
                        str = " Branch API Error: poor network connectivity. Please try again later.";
                    } else if (r5 == -114) {
                        this.getMin = -114;
                        str = " Branch API Error: Please enter your branch_key in your project's manifest file first.";
                    } else if (r5 == -104) {
                        this.getMin = -104;
                        str = " Did you forget to call init? Make sure you init the session before making Branch calls.";
                    } else if (r5 == -101) {
                        this.getMin = -101;
                        str = " Unable to initialize Branch. Check network connectivity or that your branch key is valid.";
                    } else if (r5 == -102) {
                        this.getMin = -102;
                        str = " Please add 'android.permission.INTERNET' in your applications manifest file.";
                    } else if (r5 == -105) {
                        this.getMin = BranchLinkConstant.DeepLinkErrorCode.SAME_ALIAS;
                        str = " Unable to create a URL with that alias. If you want to reuse the alias, make sure to submit the same properties for all arguments and that the user is the same owner.";
                    } else if (r5 == -106) {
                        this.getMin = -106;
                        str = " That Branch referral code is already in use.";
                    } else if (r5 == -107) {
                        this.getMin = -107;
                        str = " Unable to redeem rewards. Please make sure you have credits available to redeem.";
                    } else if (r5 == -108) {
                        this.getMin = -108;
                        str = "BranchApp class can be used only with API level 14 or above. Please make sure your minimum API level supported is 14. If you wish to use API level below 14 consider calling getInstance(Context) instead.";
                    } else if (r5 == -109) {
                        this.getMin = -109;
                        str = "Branch instance is not created. Make  sure your Application class is an instance of BranchLikedApp.";
                    } else if (r5 == -110) {
                        this.getMin = -110;
                        str = " Unable create share options. Couldn't find applications on device to share the link.";
                    } else if (r5 == -111) {
                        this.getMin = -111;
                        str = " Request to Branch server timed out. Please check your internet connectivity";
                    } else if (r5 == -117) {
                        this.getMin = -117;
                        str = " Tracking is disabled. Requested operation cannot be completed when tracking is disabled";
                    } else if (r5 >= 500 || r5 == -112) {
                        this.getMin = -112;
                        str = " Unable to reach the Branch servers, please try again shortly.";
                    } else if (r5 == 409 || r5 == -115) {
                        this.getMin = -115;
                        str = " A resource with this identifier already exists.";
                    } else if (r5 >= 400 || r5 == -116) {
                        this.getMin = -116;
                        str = " The request was invalid.";
                    } else {
                        this.getMin = -113;
                        str = " Check network connectivity and that you properly initialized.";
                    }
                    sb.append(str);
                    this.setMin = sb.toString();
                }

                public String toString() {
                    return this.setMin;
                }
            });
        }
        startTinyAppAndCloseCurrent.toFloatRange("Warning: Please enter your branch_key in your project's res/values/strings.xml!");
    }

    /* access modifiers changed from: private */
    public void invoke() {
        ActivityInfo activityInfo;
        JSONObject max = getMax(setMax(startTinyAppAndCloseCurrent.setMin("bnc_session_params")));
        String str = null;
        try {
            if (!max.has(Defines.Jsonkey.Clicked_Branch_Link.getKey())) {
                return;
            }
            if (max.getBoolean(Defines.Jsonkey.Clicked_Branch_Link.getKey())) {
                if (max.length() > 0) {
                    ApplicationInfo applicationInfo = this.getMin.getPackageManager().getApplicationInfo(this.getMin.getPackageName(), 128);
                    int i = 0;
                    if (applicationInfo.metaData == null || !applicationInfo.metaData.getBoolean("io.branch.sdk.auto_link_disable", false)) {
                        ActivityInfo[] activityInfoArr = this.getMin.getPackageManager().getPackageInfo(this.getMin.getPackageName(), TsExtractor.TS_STREAM_TYPE_AC3).activities;
                        if (activityInfoArr != null) {
                            int length2 = activityInfoArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length2) {
                                    break;
                                }
                                activityInfo = activityInfoArr[i2];
                                if (activityInfo == null || activityInfo.metaData == null || ((activityInfo.metaData.getString("io.branch.sdk.auto_link_keys") == null && activityInfo.metaData.getString("io.branch.sdk.auto_link_path") == null) || (!setMin(max, activityInfo) && !getMax(max, activityInfo)))) {
                                    i2++;
                                }
                            }
                            str = activityInfo.name;
                            i = activityInfo.metaData.getInt("io.branch.sdk.auto_link_request_code", 1501);
                        }
                        if (str != null && this.IsOverlapping != null) {
                            Activity activity = this.IsOverlapping.get();
                            if (activity != null) {
                                Intent intent = new Intent(activity, Class.forName(str));
                                intent.putExtra("io.branch.sdk.auto_linked", SummaryActivity.CHECKED);
                                intent.putExtra(Defines.Jsonkey.ReferringData.getKey(), max.toString());
                                Iterator<String> keys = max.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    intent.putExtra(next, max.getString(next));
                                }
                                activity.startActivityForResult(intent, i);
                                return;
                            }
                            startTinyAppAndCloseCurrent.toFloatRange("No activity reference to launch deep linked activity");
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            startTinyAppAndCloseCurrent.toFloatRange("Warning: Please make sure Activity names set for auto deep link are correct!");
        } catch (ClassNotFoundException unused2) {
            startTinyAppAndCloseCurrent.toFloatRange("Warning: Please make sure Activity names set for auto deep link are correct! Error while looking for activity ".concat(String.valueOf((Object) null)));
        } catch (Exception unused3) {
        }
    }

    static /* synthetic */ void setMin(Branch branch, Activity activity) {
        getMax getmax = null;
        Uri data = activity.getIntent() != null ? activity.getIntent().getData() : null;
        WeakReference<getMax> weakReference = branch.extraCallback;
        if (weakReference != null) {
            getmax = weakReference.get();
        }
        branch.isInside = false;
        branch.setMax(getmax, data, activity);
    }

    static /* synthetic */ void getMin(Branch branch, Activity activity, boolean z) {
        branch.invokeSuspend.length(ServerRequest.PROCESS_WAIT_LOCK.INTENT_PENDING_WAIT_LOCK);
        if (z) {
            branch.length(activity.getIntent().getData(), activity);
            if (!branch.getMax() && onTransact != null) {
                if (startTinyAppAndCloseCurrent.getMax == null) {
                    startTinyAppAndCloseCurrent.getMax = startTinyAppAndCloseCurrent.setMin("bnc_branch_key");
                }
                if (startTinyAppAndCloseCurrent.getMax != null) {
                    if (startTinyAppAndCloseCurrent.getMax == null) {
                        startTinyAppAndCloseCurrent.getMax = startTinyAppAndCloseCurrent.setMin("bnc_branch_key");
                    }
                    if (!startTinyAppAndCloseCurrent.getMax.equalsIgnoreCase("bnc_no_value")) {
                        if (branch.ICustomTabsCallback$Stub) {
                            branch.ICustomTabsCallback$Stub$Proxy = true;
                            return;
                        } else {
                            branch.invokeSuspend();
                            return;
                        }
                    }
                }
            }
            branch.toDoubleRange();
            return;
        }
        branch.toDoubleRange();
    }

    static /* synthetic */ void FastBitmap$CoordinateSystem(Branch branch) {
        JSONObject jSONObject;
        int i = 0;
        while (i < branch.invokeSuspend.length()) {
            try {
                ServerRequest max = branch.invokeSuspend.setMax(i);
                if (!(max == null || (jSONObject = max.getMax) == null)) {
                    if (jSONObject.has(Defines.Jsonkey.SessionID.getKey())) {
                        max.getMax.put(Defines.Jsonkey.SessionID.getKey(), startTinyAppAndCloseCurrent.setMin("bnc_session_id"));
                    }
                    if (jSONObject.has(Defines.Jsonkey.IdentityID.getKey())) {
                        max.getMax.put(Defines.Jsonkey.IdentityID.getKey(), startTinyAppAndCloseCurrent.setMin("bnc_identity_id"));
                    }
                    if (jSONObject.has(Defines.Jsonkey.DeviceFingerprintID.getKey())) {
                        max.getMax.put(Defines.Jsonkey.DeviceFingerprintID.getKey(), startTinyAppAndCloseCurrent.setMin("bnc_device_fingerprint_id"));
                    }
                }
                i++;
            } catch (JSONException unused) {
                return;
            }
        }
    }
}
