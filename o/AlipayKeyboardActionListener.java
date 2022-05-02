package o;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DialogFragment;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import o.AlipayKeyboard;

public final class AlipayKeyboardActionListener {
    public static final String KEY_EVENT_TYPE_ON_CLOSE = "de.greenrobot.eventbus.errordialog.event_type_on_close";
    public static final String KEY_FINISH_AFTER_DIALOG = "de.greenrobot.eventbus.errordialog.finish_after_dialog";
    public static final String KEY_ICON_ID = "de.greenrobot.eventbus.errordialog.icon_id";
    public static final String KEY_MESSAGE = "de.greenrobot.eventbus.errordialog.message";
    public static final String KEY_TITLE = "de.greenrobot.eventbus.errordialog.title";
    protected static final String TAG_ERROR_DIALOG = "de.greenrobot.eventbus.error_dialog";
    protected static final String TAG_ERROR_DIALOG_MANAGER = "de.greenrobot.eventbus.error_dialog_manager";
    public static initializeIdcardKeyboard<?> factory;

    public static class getMin extends Fragment {
        protected Bundle argumentsForErrorDialog;
        private onInput eventBus;
        private Object executionScope;
        protected boolean finishAfterDialog;
        private boolean skipRegisterOnNextResume;

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            onInput eventBus2 = AlipayKeyboardActionListener.factory.config.getEventBus();
            this.eventBus = eventBus2;
            eventBus2.register(this);
            this.skipRegisterOnNextResume = true;
        }

        public void onResume() {
            super.onResume();
            if (this.skipRegisterOnNextResume) {
                this.skipRegisterOnNextResume = false;
                return;
            }
            onInput eventBus2 = AlipayKeyboardActionListener.factory.config.getEventBus();
            this.eventBus = eventBus2;
            eventBus2.register(this);
        }

        public void onPause() {
            this.eventBus.unregister(this);
            super.onPause();
        }

        public void onEventMainThread(AlipayKeyboard.AliKeyboardAction aliKeyboardAction) {
            if (AlipayKeyboardActionListener.isInExecutionScope(this.executionScope, aliKeyboardAction)) {
                AlipayKeyboardActionListener.checkLogException(aliKeyboardAction);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.setMax();
                setFilterBitmap setfilterbitmap = (setFilterBitmap) fragmentManager.findFragmentByTag(AlipayKeyboardActionListener.TAG_ERROR_DIALOG);
                if (setfilterbitmap != null) {
                    setfilterbitmap.dismiss();
                }
                setFilterBitmap setfilterbitmap2 = (setFilterBitmap) AlipayKeyboardActionListener.factory.prepareErrorFragment(aliKeyboardAction, this.finishAfterDialog, this.argumentsForErrorDialog);
                if (setfilterbitmap2 != null) {
                    setfilterbitmap2.show(fragmentManager, AlipayKeyboardActionListener.TAG_ERROR_DIALOG);
                }
            }
        }

        public static void attachTo(Activity activity, Object obj, boolean z, Bundle bundle) {
            FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            getMin getmin = (getMin) supportFragmentManager.findFragmentByTag(AlipayKeyboardActionListener.TAG_ERROR_DIALOG_MANAGER);
            if (getmin == null) {
                getmin = new getMin();
                setColorFilter setcolorfilter = new setColorFilter(supportFragmentManager);
                setcolorfilter.length(0, getmin, AlipayKeyboardActionListener.TAG_ERROR_DIALOG_MANAGER, 1);
                setcolorfilter.setMin();
                supportFragmentManager.setMax();
            }
            getmin.finishAfterDialog = z;
            getmin.argumentsForErrorDialog = bundle;
            getmin.executionScope = obj;
        }
    }

    @TargetApi(11)
    public static class setMin extends android.app.Fragment {
        protected Bundle argumentsForErrorDialog;
        private onInput eventBus;
        private Object executionScope;
        protected boolean finishAfterDialog;

        public void onResume() {
            super.onResume();
            onInput eventBus2 = AlipayKeyboardActionListener.factory.config.getEventBus();
            this.eventBus = eventBus2;
            eventBus2.register(this);
        }

        public void onPause() {
            this.eventBus.unregister(this);
            super.onPause();
        }

        public void onEventMainThread(AlipayKeyboard.AliKeyboardAction aliKeyboardAction) {
            if (AlipayKeyboardActionListener.isInExecutionScope(this.executionScope, aliKeyboardAction)) {
                AlipayKeyboardActionListener.checkLogException(aliKeyboardAction);
                android.app.FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.executePendingTransactions();
                DialogFragment dialogFragment = (DialogFragment) fragmentManager.findFragmentByTag(AlipayKeyboardActionListener.TAG_ERROR_DIALOG);
                if (dialogFragment != null) {
                    dialogFragment.dismiss();
                }
                DialogFragment dialogFragment2 = (DialogFragment) AlipayKeyboardActionListener.factory.prepareErrorFragment(aliKeyboardAction, this.finishAfterDialog, this.argumentsForErrorDialog);
                if (dialogFragment2 != null) {
                    dialogFragment2.show(fragmentManager, AlipayKeyboardActionListener.TAG_ERROR_DIALOG);
                }
            }
        }

        public static void attachTo(Activity activity, Object obj, boolean z, Bundle bundle) {
            android.app.FragmentManager fragmentManager = activity.getFragmentManager();
            setMin setmin = (setMin) fragmentManager.findFragmentByTag(AlipayKeyboardActionListener.TAG_ERROR_DIALOG_MANAGER);
            if (setmin == null) {
                setmin = new setMin();
                fragmentManager.beginTransaction().add(setmin, AlipayKeyboardActionListener.TAG_ERROR_DIALOG_MANAGER).commit();
                fragmentManager.executePendingTransactions();
            }
            setmin.finishAfterDialog = z;
            setmin.argumentsForErrorDialog = bundle;
            setmin.executionScope = obj;
        }
    }

    public static void attachTo(Activity activity) {
        attachTo(activity, false, (Bundle) null);
    }

    public static void attachTo(Activity activity, boolean z) {
        attachTo(activity, z, (Bundle) null);
    }

    public static void attachTo(Activity activity, boolean z, Bundle bundle) {
        attachTo(activity, activity.getClass(), z, bundle);
    }

    public static void attachTo(Activity activity, Object obj, boolean z, Bundle bundle) {
        if (factory == null) {
            throw new RuntimeException("You must set the static factory field to configure error dialogs for your app.");
        } else if (isSupportActivity(activity)) {
            getMin.attachTo(activity, obj, z, bundle);
        } else {
            setMin.attachTo(activity, obj, z, bundle);
        }
    }

    private static boolean isSupportActivity(Activity activity) {
        String name;
        Class cls = activity.getClass();
        do {
            cls = cls.getSuperclass();
            if (cls != null) {
                name = cls.getName();
                if (name.equals("androidx.fragment.app.FragmentActivity")) {
                    return true;
                }
                if (name.startsWith("com.actionbarsherlock.app") && (name.endsWith(".SherlockActivity") || name.endsWith(".SherlockListActivity") || name.endsWith(".SherlockPreferenceActivity"))) {
                    throw new RuntimeException("Please use SherlockFragmentActivity. Illegal activity: ".concat(String.valueOf(name)));
                }
            } else {
                StringBuilder sb = new StringBuilder("Illegal activity type: ");
                sb.append(activity.getClass());
                throw new RuntimeException(sb.toString());
            }
        } while (!name.equals("android.app.Activity"));
        if (Build.VERSION.SDK_INT >= 11) {
            return false;
        }
        throw new RuntimeException("Illegal activity without fragment support. Either use Android 3.0+ or android.support.v4.app.FragmentActivity.");
    }

    protected static void checkLogException(AlipayKeyboard.AliKeyboardAction aliKeyboardAction) {
        if (factory.config.logExceptions && factory.config.tagForLoggingExceptions == null) {
            String str = onInput.TAG;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r1.getExecutionScope();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isInExecutionScope(java.lang.Object r0, o.AlipayKeyboard.AliKeyboardAction r1) {
        /*
            if (r1 == 0) goto L_0x0010
            java.lang.Object r1 = r1.getExecutionScope()
            if (r1 == 0) goto L_0x0010
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0010
            r0 = 0
            return r0
        L_0x0010:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AlipayKeyboardActionListener.isInExecutionScope(java.lang.Object, o.AlipayKeyboard$AliKeyboardAction):boolean");
    }
}
