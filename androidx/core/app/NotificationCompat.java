package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import o.InspectableProperty;
import o.enumMapping;
import o.flag;
import o.flagMapping;
import o.fromInclusive;
import o.hasAttributeId;

public class NotificationCompat {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeIconType {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GroupAlertBehavior {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NotificationVisibility {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    public static class setMax {
        public boolean FastBitmap$CoordinateSystem;
        boolean Grayscale$Algorithm;
        public String ICustomTabsCallback;
        public int ICustomTabsCallback$Default;
        public Bundle ICustomTabsCallback$Stub;
        public RemoteViews ICustomTabsCallback$Stub$Proxy;
        public int ICustomTabsService;
        public PendingIntent IsOverlapping;
        public CharSequence Mean$Arithmetic;
        public int asBinder;
        public RemoteViews asInterface;
        public boolean b;
        public boolean create;
        public Bitmap equals;
        public String extraCallback;
        public String extraCallbackWithResult;
        public flag extraCommand;
        public int getCause;
        public RemoteViews getDefaultImpl;
        public String getInterfaceDescriptor;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Context getMax;
        public ArrayList<Action> getMin;
        public CharSequence hashCode;
        public CharSequence invoke;
        public CharSequence[] invokeSuspend;
        public RemoteViews isInside;
        public CharSequence length;
        public getMin mayLaunchUrl;
        public int newSession;
        public boolean newSessionWithExtras;
        public boolean onMessageChannelReady;
        public int onNavigationEvent;
        public boolean onPostMessage;
        public boolean onRelationshipValidationResult;
        public Notification onTransact;
        @Deprecated
        public ArrayList<String> postMessage;
        public boolean requestPostMessageChannel;
        public String setDefaultImpl;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<Action> setMax;
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<InspectableProperty.FlagEntry> setMin;
        public int toDoubleRange;
        public PendingIntent toFloatRange;
        public CharSequence toIntRange;
        public boolean toString;
        public Notification updateVisuals;
        public Icon validateRelationship;
        public getMax valueOf;
        public int values;
        public long warmup;

        public setMax(@NonNull Context context, @NonNull String str) {
            this.setMax = new ArrayList<>();
            this.setMin = new ArrayList<>();
            this.getMin = new ArrayList<>();
            this.FastBitmap$CoordinateSystem = true;
            this.onRelationshipValidationResult = false;
            this.asBinder = 0;
            this.ICustomTabsCallback$Default = 0;
            this.ICustomTabsService = 0;
            this.newSession = 0;
            Notification notification = new Notification();
            this.updateVisuals = notification;
            this.getMax = context;
            this.getInterfaceDescriptor = str;
            notification.when = System.currentTimeMillis();
            this.updateVisuals.audioStreamType = -1;
            this.values = 0;
            this.postMessage = new ArrayList<>();
            this.newSessionWithExtras = true;
        }

        @Deprecated
        public setMax(@NonNull Context context) {
            this(context, (String) null);
        }

        @NonNull
        public setMax getMin(long j) {
            this.updateVisuals.when = j;
            return this;
        }

        @NonNull
        public setMax setMax(boolean z) {
            this.FastBitmap$CoordinateSystem = z;
            return this;
        }

        @NonNull
        public setMax getMin(boolean z) {
            this.toString = z;
            return this;
        }

        @NonNull
        public setMax getMin(int i) {
            this.updateVisuals.icon = i;
            return this;
        }

        @NonNull
        public setMax setMin(@Nullable CharSequence charSequence) {
            this.length = getMax(charSequence);
            return this;
        }

        @NonNull
        public setMax getMin(@Nullable CharSequence charSequence) {
            this.toIntRange = getMax(charSequence);
            return this;
        }

        @NonNull
        public setMax setMin(int i) {
            this.toDoubleRange = i;
            return this;
        }

        @NonNull
        public setMax getMax(int i, int i2, boolean z) {
            this.getCause = i;
            this.onNavigationEvent = i2;
            this.b = z;
            return this;
        }

        @NonNull
        public setMax setMin(@Nullable PendingIntent pendingIntent) {
            this.toFloatRange = pendingIntent;
            return this;
        }

        @NonNull
        public setMax getMax(@Nullable PendingIntent pendingIntent) {
            this.updateVisuals.deleteIntent = pendingIntent;
            return this;
        }

        @NonNull
        public setMax length(@Nullable CharSequence charSequence) {
            this.updateVisuals.tickerText = getMax(charSequence);
            return this;
        }

        @NonNull
        public setMax setMin(@Nullable Bitmap bitmap) {
            this.equals = getMax(bitmap);
            return this;
        }

        @Nullable
        private Bitmap getMax(@Nullable Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.getMax.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(fromInclusive.setMax.setMin);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(fromInclusive.setMax.getMax);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double d = (double) dimensionPixelSize;
            double max = (double) Math.max(1, bitmap.getWidth());
            Double.isNaN(d);
            Double.isNaN(max);
            double d2 = d / max;
            double d3 = (double) dimensionPixelSize2;
            double max2 = (double) Math.max(1, bitmap.getHeight());
            Double.isNaN(d3);
            Double.isNaN(max2);
            double min = Math.min(d2, d3 / max2);
            double width = (double) bitmap.getWidth();
            Double.isNaN(width);
            double height = (double) bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width * min), (int) Math.ceil(height * min), true);
        }

        @NonNull
        public setMax length(@Nullable Uri uri) {
            this.updateVisuals.sound = uri;
            this.updateVisuals.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                this.updateVisuals.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        @NonNull
        public setMax length(@Nullable long[] jArr) {
            this.updateVisuals.vibrate = jArr;
            return this;
        }

        @NonNull
        public setMax getMin(@ColorInt int i, int i2, int i3) {
            this.updateVisuals.ledARGB = i;
            this.updateVisuals.ledOnMS = i2;
            this.updateVisuals.ledOffMS = i3;
            int i4 = (this.updateVisuals.ledOnMS == 0 || this.updateVisuals.ledOffMS == 0) ? 0 : 1;
            Notification notification = this.updateVisuals;
            notification.flags = i4 | (notification.flags & -2);
            return this;
        }

        @NonNull
        public setMax length(boolean z) {
            getMin(2, z);
            return this;
        }

        @NonNull
        public setMax setMin(boolean z) {
            this.onMessageChannelReady = z;
            this.onPostMessage = true;
            return this;
        }

        @NonNull
        public setMax getMax(boolean z) {
            getMin(16, z);
            return this;
        }

        @NonNull
        public setMax equals(boolean z) {
            this.onRelationshipValidationResult = z;
            return this;
        }

        @NonNull
        public setMax length(int i) {
            this.updateVisuals.defaults = i;
            if ((i & 4) != 0) {
                this.updateVisuals.flags |= 1;
            }
            return this;
        }

        private void getMin(int i, boolean z) {
            if (z) {
                Notification notification = this.updateVisuals;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.updateVisuals;
            notification2.flags = (i ^ -1) & notification2.flags;
        }

        @NonNull
        public setMax getMax(int i) {
            this.values = i;
            return this;
        }

        @NonNull
        public Bundle setMax() {
            if (this.ICustomTabsCallback$Stub == null) {
                this.ICustomTabsCallback$Stub = new Bundle();
            }
            return this.ICustomTabsCallback$Stub;
        }

        @NonNull
        public setMax length(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this.setMax.add(new Action(i, charSequence, pendingIntent));
            return this;
        }

        @NonNull
        public setMax getMin(@Nullable Action action) {
            if (action != null) {
                this.setMax.add(action);
            }
            return this;
        }

        @NonNull
        public setMax setMax(@Nullable getMax getmax) {
            if (this.valueOf != getmax) {
                this.valueOf = getmax;
                if (getmax != null) {
                    getmax.length(this);
                }
            }
            return this;
        }

        @NonNull
        public setMax setMax(@ColorInt int i) {
            this.asBinder = i;
            return this;
        }

        @NonNull
        public setMax equals(int i) {
            this.ICustomTabsCallback$Default = i;
            return this;
        }

        @NonNull
        public setMax length(@NonNull String str) {
            this.getInterfaceDescriptor = str;
            return this;
        }

        @NonNull
        public setMax toIntRange(int i) {
            this.ICustomTabsService = i;
            return this;
        }

        @NonNull
        public Notification setMin() {
            return new flagMapping(this).getMin();
        }

        @Nullable
        protected static CharSequence getMax(@Nullable CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public long length() {
            if (this.FastBitmap$CoordinateSystem) {
                return this.updateVisuals.when;
            }
            return 0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getMax() {
            return this.values;
        }

        @ColorInt
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getMin() {
            return this.asBinder;
        }
    }

    public static abstract class getMax {
        CharSequence getMax;
        boolean getMin = false;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected setMax length;
        CharSequence setMin;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getMax(enumMapping enummapping) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getMin(enumMapping enummapping) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void length(enumMapping enummapping) {
        }

        /* access modifiers changed from: protected */
        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String setMax() {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews setMin(enumMapping enummapping) {
            return null;
        }

        public void length(@Nullable setMax setmax) {
            if (this.length != setmax) {
                this.length = setmax;
                if (setmax != null) {
                    setmax.setMax(this);
                }
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void setMin(@NonNull Bundle bundle) {
            if (this.getMin) {
                bundle.putCharSequence("android.summaryText", this.getMax);
            }
            CharSequence charSequence = this.setMin;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String max = setMax();
            if (max != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", max);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:64:0x019d  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x01ad  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01bb  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01dd  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0233  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0238  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x023a  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x0244  */
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews getMax(boolean r13, int r14, boolean r15) {
            /*
                r12 = this;
                androidx.core.app.NotificationCompat$setMax r0 = r12.length
                android.content.Context r0 = r0.getMax
                android.content.res.Resources r0 = r0.getResources()
                android.widget.RemoteViews r7 = new android.widget.RemoteViews
                androidx.core.app.NotificationCompat$setMax r1 = r12.length
                android.content.Context r1 = r1.getMax
                java.lang.String r1 = r1.getPackageName()
                r7.<init>(r1, r14)
                androidx.core.app.NotificationCompat$setMax r14 = r12.length
                int r14 = r14.getMax()
                r1 = -1
                r8 = 1
                r9 = 0
                if (r14 >= r1) goto L_0x0022
                r14 = 1
                goto L_0x0023
            L_0x0022:
                r14 = 0
            L_0x0023:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                r10 = 16
                if (r2 < r10) goto L_0x0050
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 >= r3) goto L_0x0050
                java.lang.String r2 = "setBackgroundResource"
                if (r14 == 0) goto L_0x0042
                int r14 = o.fromInclusive.getMax.ICustomTabsCallback$Stub$Proxy
                int r4 = o.fromInclusive.getMin.setMin
                r7.setInt(r14, r2, r4)
                int r14 = o.fromInclusive.getMax.asBinder
                int r4 = o.fromInclusive.getMin.length
                r7.setInt(r14, r2, r4)
                goto L_0x0050
            L_0x0042:
                int r14 = o.fromInclusive.getMax.ICustomTabsCallback$Stub$Proxy
                int r4 = o.fromInclusive.getMin.setMax
                r7.setInt(r14, r2, r4)
                int r14 = o.fromInclusive.getMax.asBinder
                int r4 = o.fromInclusive.getMin.getMin
                r7.setInt(r14, r2, r4)
            L_0x0050:
                androidx.core.app.NotificationCompat$setMax r14 = r12.length
                android.graphics.Bitmap r14 = r14.equals
                r11 = 8
                if (r14 == 0) goto L_0x00b9
                int r14 = android.os.Build.VERSION.SDK_INT
                if (r14 < r10) goto L_0x006b
                int r14 = o.fromInclusive.getMax.asBinder
                r7.setViewVisibility(r14, r9)
                int r14 = o.fromInclusive.getMax.asBinder
                androidx.core.app.NotificationCompat$setMax r2 = r12.length
                android.graphics.Bitmap r2 = r2.equals
                r7.setImageViewBitmap(r14, r2)
                goto L_0x0070
            L_0x006b:
                int r14 = o.fromInclusive.getMax.asBinder
                r7.setViewVisibility(r14, r11)
            L_0x0070:
                if (r13 == 0) goto L_0x0104
                androidx.core.app.NotificationCompat$setMax r13 = r12.length
                android.app.Notification r13 = r13.updateVisuals
                int r13 = r13.icon
                if (r13 == 0) goto L_0x0104
                int r13 = o.fromInclusive.setMax.length
                int r13 = r0.getDimensionPixelSize(r13)
                int r14 = o.fromInclusive.setMax.IsOverlapping
                int r14 = r0.getDimensionPixelSize(r14)
                int r14 = r14 * 2
                int r14 = r13 - r14
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r3) goto L_0x00a4
                androidx.core.app.NotificationCompat$setMax r1 = r12.length
                android.app.Notification r1 = r1.updateVisuals
                int r1 = r1.icon
                androidx.core.app.NotificationCompat$setMax r2 = r12.length
                int r2 = r2.getMin()
                android.graphics.Bitmap r13 = r12.setMin(r1, r13, r14, r2)
                int r14 = o.fromInclusive.getMax.getInterfaceDescriptor
                r7.setImageViewBitmap(r14, r13)
                goto L_0x00b3
            L_0x00a4:
                int r13 = o.fromInclusive.getMax.getInterfaceDescriptor
                androidx.core.app.NotificationCompat$setMax r14 = r12.length
                android.app.Notification r14 = r14.updateVisuals
                int r14 = r14.icon
                android.graphics.Bitmap r14 = r12.length(r14, r1)
                r7.setImageViewBitmap(r13, r14)
            L_0x00b3:
                int r13 = o.fromInclusive.getMax.getInterfaceDescriptor
                r7.setViewVisibility(r13, r9)
                goto L_0x0104
            L_0x00b9:
                if (r13 == 0) goto L_0x0104
                androidx.core.app.NotificationCompat$setMax r13 = r12.length
                android.app.Notification r13 = r13.updateVisuals
                int r13 = r13.icon
                if (r13 == 0) goto L_0x0104
                int r13 = o.fromInclusive.getMax.asBinder
                r7.setViewVisibility(r13, r9)
                int r13 = android.os.Build.VERSION.SDK_INT
                if (r13 < r3) goto L_0x00f5
                int r13 = o.fromInclusive.setMax.setMax
                int r13 = r0.getDimensionPixelSize(r13)
                int r14 = o.fromInclusive.setMax.getMin
                int r14 = r0.getDimensionPixelSize(r14)
                int r13 = r13 - r14
                int r14 = o.fromInclusive.setMax.toFloatRange
                int r14 = r0.getDimensionPixelSize(r14)
                androidx.core.app.NotificationCompat$setMax r1 = r12.length
                android.app.Notification r1 = r1.updateVisuals
                int r1 = r1.icon
                androidx.core.app.NotificationCompat$setMax r2 = r12.length
                int r2 = r2.getMin()
                android.graphics.Bitmap r13 = r12.setMin(r1, r13, r14, r2)
                int r14 = o.fromInclusive.getMax.asBinder
                r7.setImageViewBitmap(r14, r13)
                goto L_0x0104
            L_0x00f5:
                int r13 = o.fromInclusive.getMax.asBinder
                androidx.core.app.NotificationCompat$setMax r14 = r12.length
                android.app.Notification r14 = r14.updateVisuals
                int r14 = r14.icon
                android.graphics.Bitmap r14 = r12.length(r14, r1)
                r7.setImageViewBitmap(r13, r14)
            L_0x0104:
                androidx.core.app.NotificationCompat$setMax r13 = r12.length
                java.lang.CharSequence r13 = r13.length
                if (r13 == 0) goto L_0x0113
                int r13 = o.fromInclusive.getMax.onExtraCallback
                androidx.core.app.NotificationCompat$setMax r14 = r12.length
                java.lang.CharSequence r14 = r14.length
                r7.setTextViewText(r13, r14)
            L_0x0113:
                androidx.core.app.NotificationCompat$setMax r13 = r12.length
                java.lang.CharSequence r13 = r13.toIntRange
                if (r13 == 0) goto L_0x0124
                int r13 = o.fromInclusive.getMax.ICustomTabsService$Stub
                androidx.core.app.NotificationCompat$setMax r14 = r12.length
                java.lang.CharSequence r14 = r14.toIntRange
                r7.setTextViewText(r13, r14)
                r13 = 1
                goto L_0x0125
            L_0x0124:
                r13 = 0
            L_0x0125:
                int r14 = android.os.Build.VERSION.SDK_INT
                if (r14 >= r3) goto L_0x0131
                androidx.core.app.NotificationCompat$setMax r14 = r12.length
                android.graphics.Bitmap r14 = r14.equals
                if (r14 == 0) goto L_0x0131
                r14 = 1
                goto L_0x0132
            L_0x0131:
                r14 = 0
            L_0x0132:
                androidx.core.app.NotificationCompat$setMax r1 = r12.length
                java.lang.CharSequence r1 = r1.hashCode
                if (r1 == 0) goto L_0x0149
                int r13 = o.fromInclusive.getMax.setDefaultImpl
                androidx.core.app.NotificationCompat$setMax r14 = r12.length
                java.lang.CharSequence r14 = r14.hashCode
                r7.setTextViewText(r13, r14)
                int r13 = o.fromInclusive.getMax.setDefaultImpl
                r7.setViewVisibility(r13, r9)
            L_0x0146:
                r13 = 1
                r14 = 1
                goto L_0x0184
            L_0x0149:
                androidx.core.app.NotificationCompat$setMax r1 = r12.length
                int r1 = r1.toDoubleRange
                if (r1 <= 0) goto L_0x017f
                int r13 = o.fromInclusive.setMin.getMax
                int r13 = r0.getInteger(r13)
                androidx.core.app.NotificationCompat$setMax r14 = r12.length
                int r14 = r14.toDoubleRange
                if (r14 <= r13) goto L_0x0167
                int r13 = o.fromInclusive.getMax.setDefaultImpl
                int r14 = o.fromInclusive.equals.length
                java.lang.String r14 = r0.getString(r14)
                r7.setTextViewText(r13, r14)
                goto L_0x0179
            L_0x0167:
                java.text.NumberFormat r13 = java.text.NumberFormat.getIntegerInstance()
                int r14 = o.fromInclusive.getMax.setDefaultImpl
                androidx.core.app.NotificationCompat$setMax r1 = r12.length
                int r1 = r1.toDoubleRange
                long r1 = (long) r1
                java.lang.String r13 = r13.format(r1)
                r7.setTextViewText(r14, r13)
            L_0x0179:
                int r13 = o.fromInclusive.getMax.setDefaultImpl
                r7.setViewVisibility(r13, r9)
                goto L_0x0146
            L_0x017f:
                int r1 = o.fromInclusive.getMax.setDefaultImpl
                r7.setViewVisibility(r1, r11)
            L_0x0184:
                androidx.core.app.NotificationCompat$setMax r1 = r12.length
                java.lang.CharSequence r1 = r1.invoke
                if (r1 == 0) goto L_0x01b2
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r10) goto L_0x01b2
                int r1 = o.fromInclusive.getMax.ICustomTabsService$Stub
                androidx.core.app.NotificationCompat$setMax r2 = r12.length
                java.lang.CharSequence r2 = r2.invoke
                r7.setTextViewText(r1, r2)
                androidx.core.app.NotificationCompat$setMax r1 = r12.length
                java.lang.CharSequence r1 = r1.toIntRange
                if (r1 == 0) goto L_0x01ad
                int r1 = o.fromInclusive.getMax.IPostMessageService$Default
                androidx.core.app.NotificationCompat$setMax r2 = r12.length
                java.lang.CharSequence r2 = r2.toIntRange
                r7.setTextViewText(r1, r2)
                int r1 = o.fromInclusive.getMax.IPostMessageService$Default
                r7.setViewVisibility(r1, r9)
                r1 = 1
                goto L_0x01b3
            L_0x01ad:
                int r1 = o.fromInclusive.getMax.IPostMessageService$Default
                r7.setViewVisibility(r1, r11)
            L_0x01b2:
                r1 = 0
            L_0x01b3:
                if (r1 == 0) goto L_0x01d1
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r10) goto L_0x01d1
                if (r15 == 0) goto L_0x01c7
                int r15 = o.fromInclusive.setMax.isInside
                int r15 = r0.getDimensionPixelSize(r15)
                float r15 = (float) r15
                int r0 = o.fromInclusive.getMax.ICustomTabsService$Stub
                r7.setTextViewTextSize(r0, r9, r15)
            L_0x01c7:
                int r2 = o.fromInclusive.getMax.ICustomTabsService
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r1 = r7
                r1.setViewPadding(r2, r3, r4, r5, r6)
            L_0x01d1:
                androidx.core.app.NotificationCompat$setMax r15 = r12.length
                long r0 = r15.length()
                r2 = 0
                int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r15 == 0) goto L_0x0233
                androidx.core.app.NotificationCompat$setMax r14 = r12.length
                boolean r14 = r14.toString
                if (r14 == 0) goto L_0x0220
                int r14 = android.os.Build.VERSION.SDK_INT
                if (r14 < r10) goto L_0x0220
                int r14 = o.fromInclusive.getMax.ICustomTabsCallback$Stub
                r7.setViewVisibility(r14, r9)
                int r14 = o.fromInclusive.getMax.ICustomTabsCallback$Stub
                androidx.core.app.NotificationCompat$setMax r15 = r12.length
                long r0 = r15.length()
                long r2 = android.os.SystemClock.elapsedRealtime()
                long r4 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r4
                long r0 = r0 + r2
                java.lang.String r15 = "setBase"
                r7.setLong(r14, r15, r0)
                int r14 = o.fromInclusive.getMax.ICustomTabsCallback$Stub
                java.lang.String r15 = "setStarted"
                r7.setBoolean(r14, r15, r8)
                androidx.core.app.NotificationCompat$setMax r14 = r12.length
                boolean r14 = r14.Grayscale$Algorithm
                if (r14 == 0) goto L_0x0234
                int r14 = android.os.Build.VERSION.SDK_INT
                r15 = 24
                if (r14 < r15) goto L_0x0234
                int r14 = o.fromInclusive.getMax.ICustomTabsCallback$Stub
                androidx.core.app.NotificationCompat$setMax r15 = r12.length
                boolean r15 = r15.Grayscale$Algorithm
                r7.setChronometerCountDown(r14, r15)
                goto L_0x0234
            L_0x0220:
                int r14 = o.fromInclusive.getMax.ITrustedWebActivityCallback
                r7.setViewVisibility(r14, r9)
                int r14 = o.fromInclusive.getMax.ITrustedWebActivityCallback
                androidx.core.app.NotificationCompat$setMax r15 = r12.length
                long r0 = r15.length()
                java.lang.String r15 = "setTime"
                r7.setLong(r14, r15, r0)
                goto L_0x0234
            L_0x0233:
                r8 = r14
            L_0x0234:
                int r14 = o.fromInclusive.getMax.mayLaunchUrl
                if (r8 == 0) goto L_0x023a
                r15 = 0
                goto L_0x023c
            L_0x023a:
                r15 = 8
            L_0x023c:
                r7.setViewVisibility(r14, r15)
                int r14 = o.fromInclusive.getMax.getDefaultImpl
                if (r13 == 0) goto L_0x0244
                goto L_0x0246
            L_0x0244:
                r9 = 8
            L_0x0246:
                r7.setViewVisibility(r14, r9)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.getMax.getMax(boolean, int, boolean):android.widget.RemoteViews");
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Bitmap length(int i, int i2) {
            return setMin(i, i2, 0);
        }

        private Bitmap setMin(int i, int i2, int i3) {
            return length(IconCompat.getMax(this.length.getMax, i), i2, i3);
        }

        private Bitmap length(@NonNull IconCompat iconCompat, int i, int i2) {
            Drawable min = iconCompat.setMin(this.length.getMax);
            int intrinsicWidth = i2 == 0 ? min.getIntrinsicWidth() : i2;
            if (i2 == 0) {
                i2 = min.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
            min.setBounds(0, 0, intrinsicWidth, i2);
            if (i != 0) {
                min.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            min.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap setMin(int i, int i2, int i3, int i4) {
            int i5 = fromInclusive.getMin.getMax;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap min = setMin(i5, i4, i2);
            Canvas canvas = new Canvas(min);
            Drawable mutate = this.length.getMax.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return min;
        }
    }

    public static class length extends getMax {
        private IconCompat IsOverlapping;
        private Bitmap setMax;
        private boolean toIntRange;

        /* access modifiers changed from: protected */
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String setMax() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @NonNull
        public length getMax(@Nullable CharSequence charSequence) {
            this.setMin = setMax.getMax(charSequence);
            return this;
        }

        @NonNull
        public length setMax(@Nullable CharSequence charSequence) {
            this.getMax = setMax.getMax(charSequence);
            this.getMin = true;
            return this;
        }

        @NonNull
        public length setMin(@Nullable Bitmap bitmap) {
            this.setMax = bitmap;
            return this;
        }

        @NonNull
        public length getMax(@Nullable Bitmap bitmap) {
            this.IsOverlapping = bitmap == null ? null : IconCompat.length(bitmap);
            this.toIntRange = true;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void length(enumMapping enummapping) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(enummapping.setMax()).setBigContentTitle(this.setMin).bigPicture(this.setMax);
                if (this.toIntRange) {
                    Context context = null;
                    if (this.IsOverlapping != null) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            if (enummapping instanceof flagMapping) {
                                context = ((flagMapping) enummapping).length();
                            }
                            getMax.getMin(bigPicture, this.IsOverlapping.getMax(context));
                        } else if (this.IsOverlapping.length() == 1) {
                            setMin.getMax(bigPicture, this.IsOverlapping.setMin());
                        }
                    }
                    setMin.getMax(bigPicture, (Bitmap) null);
                }
                if (this.getMin) {
                    setMin.setMin(bigPicture, this.getMax);
                }
            }
        }

        @RequiresApi(16)
        static class setMin {
            @RequiresApi(16)
            static void getMax(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            @RequiresApi(16)
            static void setMin(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        @RequiresApi(23)
        static class getMax {
            @RequiresApi(23)
            static void getMin(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }
    }

    public static class setMin extends getMax {
        private CharSequence setMax;

        /* access modifiers changed from: protected */
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String setMax() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @NonNull
        public setMin getMax(@Nullable CharSequence charSequence) {
            this.setMin = setMax.getMax(charSequence);
            return this;
        }

        @NonNull
        public setMin getMin(@Nullable CharSequence charSequence) {
            this.setMax = setMax.getMax(charSequence);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void length(enumMapping enummapping) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(enummapping.setMax()).setBigContentTitle(this.setMin).bigText(this.setMax);
                if (this.getMin) {
                    bigText.setSummaryText(this.getMax);
                }
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void setMin(@NonNull Bundle bundle) {
            super.setMin(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.setMax);
            }
        }
    }

    public static class Action {
        private final boolean FastBitmap$CoordinateSystem;
        private final RemoteInput[] IsOverlapping;
        private boolean equals;
        public CharSequence getMax;
        @Deprecated
        public int getMin;
        private final int isInside;
        boolean length;
        public PendingIntent setMax;
        final Bundle setMin;
        @Nullable
        private IconCompat toFloatRange;
        private final RemoteInput[] toIntRange;

        @Retention(RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Action(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.getMin((Resources) null, "", i) : null, charSequence, pendingIntent);
        }

        public Action(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (RemoteInput[]) null, (RemoteInput[]) null, true, 0, true, false);
        }

        Action(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle, @Nullable RemoteInput[] remoteInputArr, @Nullable RemoteInput[] remoteInputArr2, boolean z, int i, boolean z2, boolean z3) {
            this.length = true;
            this.toFloatRange = iconCompat;
            if (iconCompat != null && iconCompat.length() == 2) {
                this.getMin = iconCompat.getMax();
            }
            this.getMax = setMax.getMax(charSequence);
            this.setMax = pendingIntent;
            this.setMin = bundle == null ? new Bundle() : bundle;
            this.toIntRange = remoteInputArr;
            this.IsOverlapping = remoteInputArr2;
            this.equals = z;
            this.isInside = i;
            this.length = z2;
            this.FastBitmap$CoordinateSystem = z3;
        }

        @Deprecated
        public int getMin() {
            return this.getMin;
        }

        @Nullable
        public IconCompat length() {
            int i;
            if (this.toFloatRange == null && (i = this.getMin) != 0) {
                this.toFloatRange = IconCompat.getMin((Resources) null, "", i);
            }
            return this.toFloatRange;
        }

        @Nullable
        public CharSequence setMin() {
            return this.getMax;
        }

        @Nullable
        public PendingIntent setMax() {
            return this.setMax;
        }

        @NonNull
        public Bundle getMax() {
            return this.setMin;
        }

        public boolean equals() {
            return this.equals;
        }

        @Nullable
        public RemoteInput[] isInside() {
            return this.toIntRange;
        }

        public int toFloatRange() {
            return this.isInside;
        }

        public boolean IsOverlapping() {
            return this.FastBitmap$CoordinateSystem;
        }

        @Nullable
        public RemoteInput[] toIntRange() {
            return this.IsOverlapping;
        }

        public boolean toDoubleRange() {
            return this.length;
        }
    }

    public static final class getMin {
        private String IsOverlapping;
        private int equals;
        private PendingIntent getMax;
        private int getMin;
        @DimenRes
        private int length;
        private PendingIntent setMax;
        private IconCompat setMin;

        @SuppressLint({"InvalidNullConversion"})
        @Nullable
        public final PendingIntent setMin() {
            return this.setMax;
        }

        @Nullable
        public final String length() {
            return this.IsOverlapping;
        }

        @Nullable
        public final PendingIntent setMax() {
            return this.getMax;
        }

        @SuppressLint({"InvalidNullConversion"})
        @Nullable
        public final IconCompat getMax() {
            return this.setMin;
        }

        @Dimension(unit = 0)
        public final int getMin() {
            return this.getMin;
        }

        @DimenRes
        public final int isInside() {
            return this.length;
        }

        public final boolean IsOverlapping() {
            return (this.equals & 1) != 0;
        }

        public final boolean equals() {
            return (this.equals & 2) != 0;
        }

        @Nullable
        public static Notification.BubbleMetadata setMax(@Nullable getMin getmin) {
            if (getmin == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                return setMax.getMax(getmin);
            }
            if (Build.VERSION.SDK_INT == 29) {
                return getMax.length(getmin);
            }
            return null;
        }

        @RequiresApi(29)
        static class getMax {
            @RequiresApi(29)
            @Nullable
            static Notification.BubbleMetadata length(@Nullable getMin getmin) {
                if (getmin == null || getmin.setMin() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(getmin.getMax().isInside()).setIntent(getmin.setMin()).setDeleteIntent(getmin.setMax()).setAutoExpandBubble(getmin.IsOverlapping()).setSuppressNotification(getmin.equals());
                if (getmin.getMin() != 0) {
                    suppressNotification.setDesiredHeight(getmin.getMin());
                }
                if (getmin.isInside() != 0) {
                    suppressNotification.setDesiredHeightResId(getmin.isInside());
                }
                return suppressNotification.build();
            }
        }

        @RequiresApi(30)
        static class setMax {
            @RequiresApi(30)
            @Nullable
            static Notification.BubbleMetadata getMax(@Nullable getMin getmin) {
                Notification.BubbleMetadata.Builder builder;
                if (getmin == null) {
                    return null;
                }
                if (getmin.length() != null) {
                    builder = new Notification.BubbleMetadata.Builder(getmin.length());
                } else {
                    builder = new Notification.BubbleMetadata.Builder(getmin.setMin(), getmin.getMax().isInside());
                }
                builder.setDeleteIntent(getmin.setMax()).setAutoExpandBubble(getmin.IsOverlapping()).setSuppressNotification(getmin.equals());
                if (getmin.getMin() != 0) {
                    builder.setDesiredHeight(getmin.getMin());
                }
                if (getmin.isInside() != 0) {
                    builder.setDesiredHeightResId(getmin.isInside());
                }
                return builder.build();
            }
        }
    }

    @Nullable
    public static Bundle length(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return hasAttributeId.length(notification);
        }
        return null;
    }
}
