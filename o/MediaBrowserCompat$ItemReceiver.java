package o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import o.IconCompatParcelizer;
import o.PlaybackStateCompat;
import o.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class MediaBrowserCompat$ItemReceiver extends ActionMode {
    final IconCompatParcelizer length;
    final Context setMin;

    public MediaBrowserCompat$ItemReceiver(Context context, IconCompatParcelizer iconCompatParcelizer) {
        this.setMin = context;
        this.length = iconCompatParcelizer;
    }

    public final Object getTag() {
        return this.length.setMax;
    }

    public final void setTag(Object obj) {
        this.length.setMax = obj;
    }

    public final void setTitle(CharSequence charSequence) {
        this.length.getMin(charSequence);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.length.setMin(charSequence);
    }

    public final void invalidate() {
        this.length.length();
    }

    public final void finish() {
        this.length.getMin();
    }

    public final Menu getMenu() {
        return new onVolumeInfoChanged(this.setMin, (Size) this.length.getMax());
    }

    public final CharSequence getTitle() {
        return this.length.toIntRange();
    }

    public final void setTitle(int i) {
        this.length.setMin(i);
    }

    public final CharSequence getSubtitle() {
        return this.length.equals();
    }

    public final void setSubtitle(int i) {
        this.length.getMax(i);
    }

    public final View getCustomView() {
        return this.length.IsOverlapping();
    }

    public final void setCustomView(View view) {
        this.length.setMin(view);
    }

    public final MenuInflater getMenuInflater() {
        return this.length.setMax();
    }

    public final boolean getTitleOptionalHint() {
        return this.length.toFloatRange();
    }

    public final void setTitleOptionalHint(boolean z) {
        this.length.getMax(z);
    }

    public final boolean isTitleOptional() {
        return this.length.isInside();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class getMax implements IconCompatParcelizer.getMin {
        final ActionMode.Callback getMax;
        final Context getMin;
        final ArrayList<MediaBrowserCompat$ItemReceiver> length = new ArrayList<>();
        final PlaybackStateCompat.RepeatMode<Menu, Menu> setMin = new PlaybackStateCompat.RepeatMode<>();

        public getMax(Context context, ActionMode.Callback callback) {
            this.getMin = context;
            this.getMax = callback;
        }

        public final boolean setMax(IconCompatParcelizer iconCompatParcelizer, Menu menu) {
            return this.getMax.onCreateActionMode(setMin(iconCompatParcelizer), getMax(menu));
        }

        public final boolean getMin(IconCompatParcelizer iconCompatParcelizer, Menu menu) {
            return this.getMax.onPrepareActionMode(setMin(iconCompatParcelizer), getMax(menu));
        }

        public final boolean getMin(IconCompatParcelizer iconCompatParcelizer, MenuItem menuItem) {
            return this.getMax.onActionItemClicked(setMin(iconCompatParcelizer), new onPlaybackStateChanged(this.getMin, (RestrictTo.Scope) menuItem));
        }

        public final void setMax(IconCompatParcelizer iconCompatParcelizer) {
            this.getMax.onDestroyActionMode(setMin(iconCompatParcelizer));
        }

        private Menu getMax(Menu menu) {
            Menu menu2 = this.setMin.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            onVolumeInfoChanged onvolumeinfochanged = new onVolumeInfoChanged(this.getMin, (Size) menu);
            this.setMin.put(menu, onvolumeinfochanged);
            return onvolumeinfochanged;
        }

        public final ActionMode setMin(IconCompatParcelizer iconCompatParcelizer) {
            int size = this.length.size();
            for (int i = 0; i < size; i++) {
                MediaBrowserCompat$ItemReceiver mediaBrowserCompat$ItemReceiver = this.length.get(i);
                if (mediaBrowserCompat$ItemReceiver != null && mediaBrowserCompat$ItemReceiver.length == iconCompatParcelizer) {
                    return mediaBrowserCompat$ItemReceiver;
                }
            }
            MediaBrowserCompat$ItemReceiver mediaBrowserCompat$ItemReceiver2 = new MediaBrowserCompat$ItemReceiver(this.getMin, iconCompatParcelizer);
            this.length.add(mediaBrowserCompat$ItemReceiver2);
            return mediaBrowserCompat$ItemReceiver2;
        }
    }
}
