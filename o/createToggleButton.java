package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.provider.FontsContractCompat;
import androidx.emoji.text.EmojiCompat;

public class createToggleButton extends EmojiCompat.getMin {
    private static final setMax toFloatRange = new setMax();

    public static abstract class getMax {
        public abstract long getMax();
    }

    public createToggleButton(@NonNull Context context, @NonNull UseExperimental useExperimental) {
        super(new setMin(context, useExperimental, toFloatRange));
    }

    static class setMin implements EmojiCompat.IsOverlapping {
        @GuardedBy("mLock")
        private HandlerThread IsOverlapping;
        private ContentObserver equals;
        private final Context getMax;
        EmojiCompat.toIntRange getMin;
        @GuardedBy("mLock")
        @Nullable
        private getMax isInside;
        private final Object length = new Object();
        private final setMax setMax;
        private final UseExperimental setMin;
        private Runnable toFloatRange;
        @GuardedBy("mLock")
        private Handler toIntRange;

        setMin(@NonNull Context context, @NonNull UseExperimental useExperimental, @NonNull setMax setmax) {
            if (context == null) {
                throw new NullPointerException("Context cannot be null");
            } else if (useExperimental != null) {
                this.getMax = context.getApplicationContext();
                this.setMin = useExperimental;
                this.setMax = setmax;
            } else {
                throw new NullPointerException("FontRequest cannot be null");
            }
        }

        @RequiresApi(19)
        public void setMin(@NonNull final EmojiCompat.toIntRange tointrange) {
            if (tointrange != null) {
                synchronized (this.length) {
                    if (this.toIntRange == null) {
                        HandlerThread handlerThread = new HandlerThread("emojiCompat", 10);
                        this.IsOverlapping = handlerThread;
                        handlerThread.start();
                        this.toIntRange = new Handler(this.IsOverlapping.getLooper());
                    }
                    this.toIntRange.post(new Runnable() {
                        public void run() {
                            setMin.this.getMin = tointrange;
                            setMin.this.setMin();
                        }
                    });
                }
                return;
            }
            throw new NullPointerException("LoaderCallback cannot be null");
        }

        private FontsContractCompat.setMin setMax() {
            try {
                FontsContractCompat.length max = this.setMax.setMax(this.getMax, this.setMin);
                if (max.setMin() == 0) {
                    FontsContractCompat.setMin[] length2 = max.length();
                    if (length2 != null && length2.length != 0) {
                        return length2[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                StringBuilder sb = new StringBuilder("fetchFonts failed (");
                sb.append(max.setMin());
                sb.append(")");
                throw new RuntimeException(sb.toString());
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        @RequiresApi(19)
        private void length(Uri uri, long j) {
            synchronized (this.length) {
                if (this.equals == null) {
                    AnonymousClass4 r1 = new ContentObserver(this.toIntRange) {
                        public void onChange(boolean z, Uri uri) {
                            setMin.this.setMin();
                        }
                    };
                    this.equals = r1;
                    this.setMax.getMin(this.getMax, uri, r1);
                }
                if (this.toFloatRange == null) {
                    this.toFloatRange = new Runnable() {
                        public void run() {
                            setMin.this.setMin();
                        }
                    };
                }
                this.toIntRange.postDelayed(this.toFloatRange, j);
            }
        }

        private void length() {
            this.getMin = null;
            ContentObserver contentObserver = this.equals;
            if (contentObserver != null) {
                this.setMax.getMin(this.getMax, contentObserver);
                this.equals = null;
            }
            synchronized (this.length) {
                this.toIntRange.removeCallbacks(this.toFloatRange);
                if (this.IsOverlapping != null) {
                    this.IsOverlapping.quit();
                }
                this.toIntRange = null;
                this.IsOverlapping = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
            r8.getMin.setMin(r0);
            length();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        @androidx.annotation.RequiresApi(19)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void setMin() {
            /*
                r8 = this;
                androidx.emoji.text.EmojiCompat$toIntRange r0 = r8.getMin
                if (r0 != 0) goto L_0x0005
                return
            L_0x0005:
                androidx.core.provider.FontsContractCompat$setMin r0 = r8.setMax()     // Catch:{ all -> 0x0076 }
                int r1 = r0.setMin()     // Catch:{ all -> 0x0076 }
                r2 = 2
                if (r1 != r2) goto L_0x0031
                java.lang.Object r2 = r8.length     // Catch:{ all -> 0x0076 }
                monitor-enter(r2)     // Catch:{ all -> 0x0076 }
                o.createToggleButton$getMax r3 = r8.isInside     // Catch:{ all -> 0x002e }
                if (r3 == 0) goto L_0x002c
                o.createToggleButton$getMax r3 = r8.isInside     // Catch:{ all -> 0x002e }
                long r3 = r3.getMax()     // Catch:{ all -> 0x002e }
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L_0x002c
                android.net.Uri r0 = r0.setMax()     // Catch:{ all -> 0x002e }
                r8.length(r0, r3)     // Catch:{ all -> 0x002e }
                monitor-exit(r2)     // Catch:{ all -> 0x002e }
                return
            L_0x002c:
                monitor-exit(r2)     // Catch:{ all -> 0x0076 }
                goto L_0x0031
            L_0x002e:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0076 }
                throw r0     // Catch:{ all -> 0x0076 }
            L_0x0031:
                if (r1 != 0) goto L_0x005d
                o.createToggleButton$setMax r1 = r8.setMax     // Catch:{ all -> 0x0076 }
                android.content.Context r2 = r8.getMax     // Catch:{ all -> 0x0076 }
                android.graphics.Typeface r1 = r1.getMax(r2, r0)     // Catch:{ all -> 0x0076 }
                android.content.Context r2 = r8.getMax     // Catch:{ all -> 0x0076 }
                r3 = 0
                android.net.Uri r0 = r0.setMax()     // Catch:{ all -> 0x0076 }
                java.nio.ByteBuffer r0 = o.anyOf.getMax(r2, r3, r0)     // Catch:{ all -> 0x0076 }
                if (r0 == 0) goto L_0x0055
                androidx.emoji.text.EmojiCompat$toIntRange r2 = r8.getMin     // Catch:{ all -> 0x0076 }
                o.createMultiAutoCompleteTextView r0 = o.createMultiAutoCompleteTextView.getMax(r1, r0)     // Catch:{ all -> 0x0076 }
                r2.getMin(r0)     // Catch:{ all -> 0x0076 }
                r8.length()     // Catch:{ all -> 0x0076 }
                return
            L_0x0055:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0076 }
                java.lang.String r1 = "Unable to open file."
                r0.<init>(r1)     // Catch:{ all -> 0x0076 }
                throw r0     // Catch:{ all -> 0x0076 }
            L_0x005d:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0076 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0076 }
                java.lang.String r3 = "fetchFonts result is not OK. ("
                r2.<init>(r3)     // Catch:{ all -> 0x0076 }
                r2.append(r1)     // Catch:{ all -> 0x0076 }
                java.lang.String r1 = ")"
                r2.append(r1)     // Catch:{ all -> 0x0076 }
                java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0076 }
                r0.<init>(r1)     // Catch:{ all -> 0x0076 }
                throw r0     // Catch:{ all -> 0x0076 }
            L_0x0076:
                r0 = move-exception
                androidx.emoji.text.EmojiCompat$toIntRange r1 = r8.getMin
                r1.setMin(r0)
                r8.length()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.createToggleButton.setMin.setMin():void");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class setMax {
        public FontsContractCompat.length setMax(@NonNull Context context, @NonNull UseExperimental useExperimental) throws PackageManager.NameNotFoundException {
            return FontsContractCompat.setMax(context, (CancellationSignal) null, useExperimental);
        }

        public Typeface getMax(@NonNull Context context, @NonNull FontsContractCompat.setMin setmin) throws PackageManager.NameNotFoundException {
            return FontsContractCompat.getMin(context, (CancellationSignal) null, new FontsContractCompat.setMin[]{setmin});
        }

        public void getMin(@NonNull Context context, @NonNull Uri uri, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void getMin(@NonNull Context context, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }
}
