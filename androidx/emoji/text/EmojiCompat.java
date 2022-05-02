package androidx.emoji.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.CheckResult;
import androidx.annotation.ColorInt;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.MediaSessionCompat$Token;
import o.createCheckBox;
import o.createMultiAutoCompleteTextView;
import o.createRatingBar;
import o.createSeekBar;

@AnyThread
public class EmojiCompat {
    @GuardedBy("sInstanceLock")
    private static volatile EmojiCompat IsOverlapping;
    private static final Object setMax = new Object();
    private final int FastBitmap$CoordinateSystem;
    private final ReadWriteLock equals = new ReentrantReadWriteLock();
    final int[] getMax;
    final boolean getMin;
    private final Handler isInside;
    final IsOverlapping length;
    final boolean setMin;
    private final int toDoubleRange;
    @GuardedBy("mInitLock")
    private final Set<length> toFloatRange;
    @GuardedBy("mInitLock")
    private int toIntRange = 3;
    private final setMax toString;
    private final boolean values;

    public interface IsOverlapping {
        void setMin(@NonNull toIntRange tointrange);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface LoadState {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface LoadStrategy {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReplaceStrategy {
    }

    public static abstract class length {
        public void getMax() {
        }

        public void setMin(@Nullable Throwable th) {
        }
    }

    public static abstract class toIntRange {
        public abstract void getMin(@NonNull createMultiAutoCompleteTextView createmultiautocompletetextview);

        public abstract void setMin(@Nullable Throwable th);
    }

    private EmojiCompat(@NonNull getMin getmin) {
        this.getMin = getmin.getMax;
        this.setMin = getmin.length;
        this.getMax = getmin.setMin;
        this.values = getmin.IsOverlapping;
        this.FastBitmap$CoordinateSystem = getmin.equals;
        this.length = getmin.getMin;
        this.toDoubleRange = getmin.toIntRange;
        this.isInside = new Handler(Looper.getMainLooper());
        this.toFloatRange = new MediaSessionCompat$Token();
        if (getmin.setMax != null && !getmin.setMax.isEmpty()) {
            this.toFloatRange.addAll(getmin.setMax);
        }
        this.toString = Build.VERSION.SDK_INT < 19 ? new setMax(this) : new getMax(this);
        IsOverlapping();
    }

    public static EmojiCompat setMax(@NonNull getMin getmin) {
        if (IsOverlapping == null) {
            synchronized (setMax) {
                if (IsOverlapping == null) {
                    IsOverlapping = new EmojiCompat(getmin);
                }
            }
        }
        return IsOverlapping;
    }

    public static EmojiCompat getMax() {
        EmojiCompat emojiCompat;
        synchronized (setMax) {
            if (IsOverlapping != null) {
                emojiCompat = IsOverlapping;
            } else {
                throw new IllegalStateException("EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            }
        }
        return emojiCompat;
    }

    /* JADX INFO: finally extract failed */
    private void IsOverlapping() {
        this.equals.writeLock().lock();
        try {
            if (this.toDoubleRange == 0) {
                this.toIntRange = 0;
            }
            this.equals.writeLock().unlock();
            if (setMax() == 0) {
                this.toString.length();
            }
        } catch (Throwable th) {
            this.equals.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void getMin() {
        ArrayList arrayList = new ArrayList();
        this.equals.writeLock().lock();
        try {
            this.toIntRange = 1;
            arrayList.addAll(this.toFloatRange);
            this.toFloatRange.clear();
            this.equals.writeLock().unlock();
            this.isInside.post(new setMin((Collection<length>) arrayList, this.toIntRange));
        } catch (Throwable th) {
            this.equals.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void getMax(@Nullable Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.equals.writeLock().lock();
        try {
            this.toIntRange = 2;
            arrayList.addAll(this.toFloatRange);
            this.toFloatRange.clear();
            this.equals.writeLock().unlock();
            this.isInside.post(new setMin(arrayList, this.toIntRange, th));
        } catch (Throwable th2) {
            this.equals.writeLock().unlock();
            throw th2;
        }
    }

    public void setMin(@NonNull length length2) {
        if (length2 != null) {
            this.equals.writeLock().lock();
            try {
                if (this.toIntRange != 1) {
                    if (this.toIntRange != 2) {
                        this.toFloatRange.add(length2);
                    }
                }
                this.isInside.post(new setMin(length2, this.toIntRange));
            } finally {
                this.equals.writeLock().unlock();
            }
        } else {
            throw new NullPointerException("initCallback cannot be null");
        }
    }

    public int setMax() {
        this.equals.readLock().lock();
        try {
            return this.toIntRange;
        } finally {
            this.equals.readLock().unlock();
        }
    }

    private boolean equals() {
        return setMax() == 1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean length() {
        return this.values;
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int setMin() {
        return this.FastBitmap$CoordinateSystem;
    }

    public static boolean setMin(@NonNull Editable editable, int i, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return createCheckBox.setMin(editable, i, keyEvent);
        }
        return false;
    }

    public static boolean getMin(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            return createCheckBox.length(inputConnection, editable, i, i2, z);
        }
        return false;
    }

    @CheckResult
    public CharSequence setMax(@NonNull CharSequence charSequence) {
        return getMin(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    @CheckResult
    public CharSequence getMin(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        return setMin(charSequence, i, i2, Integer.MAX_VALUE);
    }

    @CheckResult
    public CharSequence setMin(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3) {
        return getMin(charSequence, i, i2, i3, 0);
    }

    @CheckResult
    public CharSequence getMin(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, int i4) {
        if (!equals()) {
            throw new IllegalStateException("Not initialized yet");
        } else if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        } else if (i3 >= 0) {
            if (!(i <= i2)) {
                throw new IllegalArgumentException("start should be <= than end");
            } else if (charSequence == null) {
                return charSequence;
            } else {
                if (i <= charSequence.length()) {
                    if (!(i2 <= charSequence.length())) {
                        throw new IllegalArgumentException("end should be < than charSequence length");
                    } else if (charSequence.length() == 0 || i == i2) {
                        return charSequence;
                    } else {
                        return this.toString.length(charSequence, i, i2, i3, i4 != 1 ? i4 != 2 ? this.getMin : false : true);
                    }
                } else {
                    throw new IllegalArgumentException("start should be < than charSequence length");
                }
            }
        } else {
            throw new IllegalArgumentException("maxEmojiCount cannot be negative");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void getMin(@NonNull EditorInfo editorInfo) {
        if (equals() && editorInfo != null && editorInfo.extras != null) {
            this.toString.setMax(editorInfo);
        }
    }

    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class toFloatRange {
        toFloatRange() {
        }

        public createRatingBar length(@NonNull EmojiMetadata emojiMetadata) {
            return new createSeekBar(emojiMetadata);
        }
    }

    public static abstract class getMin {
        boolean IsOverlapping;
        int equals = -16711936;
        boolean getMax;
        final IsOverlapping getMin;
        boolean length;
        Set<length> setMax;
        int[] setMin;
        int toIntRange = 0;

        public getMin(@NonNull IsOverlapping isOverlapping) {
            if (isOverlapping != null) {
                this.getMin = isOverlapping;
                return;
            }
            throw new NullPointerException("metadataLoader cannot be null.");
        }

        public getMin getMax(@NonNull length length2) {
            if (length2 != null) {
                if (this.setMax == null) {
                    this.setMax = new MediaSessionCompat$Token();
                }
                this.setMax.add(length2);
                return this;
            }
            throw new NullPointerException("initCallback cannot be null");
        }

        public getMin getMin(boolean z) {
            this.getMax = z;
            return this;
        }
    }

    static class setMin implements Runnable {
        private final int getMax;
        private final Throwable length;
        private final List<length> setMax;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        setMin(@androidx.annotation.NonNull androidx.emoji.text.EmojiCompat.length r3, int r4) {
            /*
                r2 = this;
                r0 = 1
                androidx.emoji.text.EmojiCompat$length[] r0 = new androidx.emoji.text.EmojiCompat.length[r0]
                if (r3 == 0) goto L_0x0013
                androidx.emoji.text.EmojiCompat$length r3 = (androidx.emoji.text.EmojiCompat.length) r3
                r1 = 0
                r0[r1] = r3
                java.util.List r3 = java.util.Arrays.asList(r0)
                r0 = 0
                r2.<init>(r3, r4, r0)
                return
            L_0x0013:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r4 = "initCallback cannot be null"
                r3.<init>(r4)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji.text.EmojiCompat.setMin.<init>(androidx.emoji.text.EmojiCompat$length, int):void");
        }

        setMin(@NonNull Collection<length> collection, int i) {
            this(collection, i, (Throwable) null);
        }

        setMin(@NonNull Collection<length> collection, int i, @Nullable Throwable th) {
            if (collection != null) {
                this.setMax = new ArrayList(collection);
                this.getMax = i;
                this.length = th;
                return;
            }
            throw new NullPointerException("initCallbacks cannot be null");
        }

        public void run() {
            int size = this.setMax.size();
            int i = 0;
            if (this.getMax != 1) {
                while (i < size) {
                    this.setMax.get(i).setMin(this.length);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.setMax.get(i).getMax();
                i++;
            }
        }
    }

    static class setMax {
        final EmojiCompat setMin;

        /* access modifiers changed from: package-private */
        public CharSequence length(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, boolean z) {
            return charSequence;
        }

        /* access modifiers changed from: package-private */
        public void setMax(@NonNull EditorInfo editorInfo) {
        }

        setMax(EmojiCompat emojiCompat) {
            this.setMin = emojiCompat;
        }

        /* access modifiers changed from: package-private */
        public void length() {
            this.setMin.getMin();
        }
    }

    @RequiresApi(19)
    static final class getMax extends setMax {
        private volatile createMultiAutoCompleteTextView getMin;
        private volatile createCheckBox setMax;

        getMax(EmojiCompat emojiCompat) {
            super(emojiCompat);
        }

        /* access modifiers changed from: package-private */
        public final void length() {
            try {
                this.setMin.length.setMin(new toIntRange() {
                    public void getMin(@NonNull createMultiAutoCompleteTextView createmultiautocompletetextview) {
                        getMax.this.getMin(createmultiautocompletetextview);
                    }

                    public void setMin(@Nullable Throwable th) {
                        getMax.this.setMin.getMax(th);
                    }
                });
            } catch (Throwable th) {
                this.setMin.getMax(th);
            }
        }

        /* access modifiers changed from: package-private */
        public final void getMin(@NonNull createMultiAutoCompleteTextView createmultiautocompletetextview) {
            if (createmultiautocompletetextview == null) {
                this.setMin.getMax(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.getMin = createmultiautocompletetextview;
            this.setMax = new createCheckBox(this.getMin, new toFloatRange(), this.setMin.setMin, this.setMin.getMax);
            this.setMin.getMin();
        }

        /* access modifiers changed from: package-private */
        public final CharSequence length(@NonNull CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.setMax.length(charSequence, i, i2, i3, z);
        }

        /* access modifiers changed from: package-private */
        public final void setMax(@NonNull EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.getMin.setMax());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.setMin.getMin);
        }
    }
}
