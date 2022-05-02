package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import o.ITrustedWebActivityCallback;
import o.IconCompatParcelizer;
import o.onEvent;

public final class MediaBrowserCompat$MediaItem extends ContextWrapper {
    private Resources.Theme getMax;
    private Configuration getMin;
    public int length;
    private Resources setMax;
    private LayoutInflater setMin;

    public MediaBrowserCompat$MediaItem() {
        super((Context) null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final class Flags extends IconCompatParcelizer implements onEvent.length {
        private onEvent IsOverlapping;
        private boolean equals;
        private Context getMax;
        private IconCompatParcelizer.getMin getMin;
        private ActionBarContextView length;
        private WeakReference<View> setMin;
        private boolean toFloatRange;

        public Flags(Context context, ActionBarContextView actionBarContextView, IconCompatParcelizer.getMin getmin, boolean z) {
            this.getMax = context;
            this.length = actionBarContextView;
            this.getMin = getmin;
            onEvent defaultShowAsAction = new onEvent(actionBarContextView.getContext()).setDefaultShowAsAction(1);
            this.IsOverlapping = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
            this.equals = z;
        }

        public final void getMin(CharSequence charSequence) {
            this.length.setTitle(charSequence);
        }

        public final void setMin(CharSequence charSequence) {
            this.length.setSubtitle(charSequence);
        }

        public final void setMin(int i) {
            this.length.setTitle(this.getMax.getString(i));
        }

        public final void getMax(int i) {
            this.length.setSubtitle(this.getMax.getString(i));
        }

        public final void getMax(boolean z) {
            super.getMax(z);
            this.length.setTitleOptional(z);
        }

        public final boolean isInside() {
            return this.length.isTitleOptional();
        }

        public final void setMin(View view) {
            this.length.setCustomView(view);
            this.setMin = view != null ? new WeakReference<>(view) : null;
        }

        public final void length() {
            this.getMin.getMin((IconCompatParcelizer) this, (Menu) this.IsOverlapping);
        }

        public final void getMin() {
            if (!this.toFloatRange) {
                this.toFloatRange = true;
                this.length.sendAccessibilityEvent(32);
                this.getMin.setMax(this);
            }
        }

        public final Menu getMax() {
            return this.IsOverlapping;
        }

        public final CharSequence toIntRange() {
            return this.length.getTitle();
        }

        public final CharSequence equals() {
            return this.length.getSubtitle();
        }

        public final View IsOverlapping() {
            WeakReference<View> weakReference = this.setMin;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public final MenuInflater setMax() {
            return new MediaDescriptionCompat(this.length.getContext());
        }

        public final boolean onMenuItemSelected(@NonNull onEvent onevent, @NonNull MenuItem menuItem) {
            return this.getMin.getMin((IconCompatParcelizer) this, menuItem);
        }

        public final void onMenuModeChange(@NonNull onEvent onevent) {
            this.getMin.getMin((IconCompatParcelizer) this, (Menu) this.IsOverlapping);
            this.length.showOverflowMenu();
        }
    }

    public MediaBrowserCompat$MediaItem(Context context, @StyleRes int i) {
        super(context);
        this.length = i;
    }

    public MediaBrowserCompat$MediaItem(Context context, Resources.Theme theme) {
        super(context);
        this.getMax = theme;
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void getMin(Configuration configuration) {
        if (this.setMax != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.getMin == null) {
            this.getMin = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public final void setTheme(int i) {
        if (this.length != i) {
            this.length = i;
            length();
        }
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.getMax;
        if (theme != null) {
            return theme;
        }
        if (this.length == 0) {
            this.length = ITrustedWebActivityCallback.Stub.isInside.setMax;
        }
        length();
        return this.getMax;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.setMin == null) {
            this.setMin = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.setMin;
    }

    private void length() {
        if (this.getMax == null) {
            this.getMax = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.getMax.setTo(theme);
            }
        }
        this.getMax.applyStyle(this.length, true);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources getResources() {
        if (this.setMax == null) {
            if (this.getMin == null) {
                this.setMax = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.setMax = createConfigurationContext(this.getMin).getResources();
            } else {
                Resources resources = super.getResources();
                Configuration configuration = new Configuration(resources.getConfiguration());
                configuration.updateFrom(this.getMin);
                this.setMax = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration);
            }
        }
        return this.setMax;
    }
}
