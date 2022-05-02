package androidx.appcompat.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import o.FontRes;
import o.IPostMessageService;
import o.ITrustedWebActivityService;
import o.IconCompatParcelizer;
import o.InspectableProperty;
import o.IntRange;
import o.dispatchPresenterUpdate;
import o.getSmallIconBitmap;
import o.initForMode;
import o.killMode;
import o.playFromMediaId;
import o.removeMenuPresenter;
import o.valueType;

public class AppCompatActivity extends FragmentActivity implements getSmallIconBitmap, InspectableProperty.EnumEntry.setMin {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AppCompatDelegate mDelegate;
    private Resources mResources;

    /* access modifiers changed from: protected */
    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(@NonNull InspectableProperty.EnumEntry enumEntry) {
    }

    @CallSuper
    public void onSupportActionModeFinished(@NonNull IconCompatParcelizer iconCompatParcelizer) {
    }

    @CallSuper
    public void onSupportActionModeStarted(@NonNull IconCompatParcelizer iconCompatParcelizer) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    @Nullable
    public IconCompatParcelizer onWindowStartingSupportActionMode(@NonNull IconCompatParcelizer.getMin getmin) {
        return null;
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    public AppCompatActivity() {
        initDelegate();
    }

    @ContentView
    public AppCompatActivity(@LayoutRes int i) {
        super(i);
        initDelegate();
    }

    private void initDelegate() {
        initForMode savedStateRegistry = getSavedStateRegistry();
        if (savedStateRegistry.setMin.length(DELEGATE_TAG, new initForMode.setMax() {
            @NonNull
            public Bundle length() {
                Bundle bundle = new Bundle();
                AppCompatActivity.this.getDelegate().length(bundle);
                return bundle;
            }
        }) == null) {
            addOnContextAvailableListener(new IPostMessageService.Stub() {
                public void length(@NonNull Context context) {
                    AppCompatDelegate delegate = AppCompatActivity.this.getDelegate();
                    delegate.toIntRange();
                    delegate.getMin(AppCompatActivity.this.getSavedStateRegistry().setMin(AppCompatActivity.DELEGATE_TAG));
                }
            });
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().getMin(context));
    }

    public void setTheme(@StyleRes int i) {
        super.setTheme(i);
        getDelegate().setMin(i);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().setMax(bundle);
    }

    @Nullable
    public ActionBar getSupportActionBar() {
        return getDelegate().setMax();
    }

    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        getDelegate().getMin(toolbar);
    }

    @NonNull
    public MenuInflater getMenuInflater() {
        return getDelegate().getMin();
    }

    public void setContentView(@LayoutRes int i) {
        initViewTreeOwners();
        getDelegate().length(i);
    }

    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().setMax(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().setMin(view, layoutParams);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().getMin(view, layoutParams);
    }

    private void initViewTreeOwners() {
        getWindow().getDecorView().setTag(dispatchPresenterUpdate.getMin.setMin, this);
        getWindow().getDecorView().setTag(removeMenuPresenter.getMin.length, this);
        getWindow().getDecorView().setTag(killMode.setMax.length, this);
    }

    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().getMin(configuration);
    }

    public void onPostResume() {
        super.onPostResume();
        getDelegate().getMax();
    }

    public void onStart() {
        super.onStart();
        getDelegate().length();
    }

    public void onStop() {
        super.onStop();
        getDelegate().setMin();
    }

    public <T extends View> T findViewById(@IdRes int i) {
        return getDelegate().setMax(i);
    }

    public final boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.getMin() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    public void onDestroy() {
        super.onDestroy();
        getDelegate().isInside();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().setMin(charSequence);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().getMin(i);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().equals();
    }

    public void invalidateOptionsMenu() {
        getDelegate().equals();
    }

    @Nullable
    public IconCompatParcelizer startSupportActionMode(@NonNull IconCompatParcelizer.getMin getmin) {
        return getDelegate().getMax(getmin);
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            InspectableProperty.EnumEntry max = InspectableProperty.EnumEntry.setMax(this);
            onCreateSupportNavigateUpTaskStack(max);
            onPrepareSupportNavigateUpTaskStack(max);
            if (!max.setMax.isEmpty()) {
                Intent[] intentArr = (Intent[]) max.setMax.toArray(new Intent[max.setMax.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                if (!IntRange.getMax(max.length, intentArr, (Bundle) null)) {
                    Intent intent = new Intent(intentArr[intentArr.length - 1]);
                    intent.addFlags(268435456);
                    max.length.startActivity(intent);
                }
                try {
                    FontRes.length(this);
                } catch (IllegalStateException unused) {
                    finish();
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
        }
        return true;
    }

    @Nullable
    public Intent getSupportParentActivityIntent() {
        return valueType.setMin(this);
    }

    public boolean supportShouldUpRecreateTask(@NonNull Intent intent) {
        return valueType.length(this, intent);
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    @Nullable
    public ITrustedWebActivityService.setMin getDrawerToggleDelegate() {
        return getDelegate().toFloatRange();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, @NonNull Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @NonNull
    public AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AppCompatDelegate.setMin((Activity) this, (getSmallIconBitmap) this);
        }
        return this.mDelegate;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.getMin(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public Resources getResources() {
        if (this.mResources == null && playFromMediaId.getMin()) {
            this.mResources = new playFromMediaId(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean performMenuItemShortcut(android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x003e
            boolean r0 = r3.isCtrlPressed()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003e
            android.view.View r0 = r0.getDecorView()
            boolean r3 = r0.dispatchKeyShortcutEvent(r3)
            if (r3 == 0) goto L_0x003e
            r3 = 1
            return r3
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatActivity.performMenuItemShortcut(android.view.KeyEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.equals()) {
            super.openOptionsMenu();
        }
    }

    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.toIntRange()) {
            super.closeOptionsMenu();
        }
    }

    public void onCreateSupportNavigateUpTaskStack(@NonNull InspectableProperty.EnumEntry enumEntry) {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = valueType.setMin(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(enumEntry.length.getPackageManager());
            }
            enumEntry.length(component);
            enumEntry.setMax.add(supportParentActivityIntent);
        }
    }

    public void supportNavigateUpTo(@NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            navigateUpTo(intent);
            return;
        }
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }
}
