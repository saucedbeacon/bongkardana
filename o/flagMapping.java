package o;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.InspectableProperty;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class flagMapping implements enumMapping {
    private final Bundle equals = new Bundle();
    private RemoteViews getMax;
    private final Context getMin;
    private int isInside;
    private final Notification.Builder length;
    private RemoteViews setMax;
    private final NotificationCompat.setMax setMin;
    private RemoteViews toFloatRange;
    private final List<Bundle> toIntRange = new ArrayList();

    public flagMapping(NotificationCompat.setMax setmax) {
        List<String> list;
        List<String> max;
        this.setMin = setmax;
        this.getMin = setmax.getMax;
        if (Build.VERSION.SDK_INT >= 26) {
            this.length = new Notification.Builder(setmax.getMax, setmax.getInterfaceDescriptor);
        } else {
            this.length = new Notification.Builder(setmax.getMax);
        }
        Notification notification = setmax.updateVisuals;
        this.length.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, setmax.isInside).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(setmax.length).setContentText(setmax.toIntRange).setContentInfo(setmax.hashCode).setContentIntent(setmax.toFloatRange).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(setmax.IsOverlapping, (notification.flags & 128) != 0).setLargeIcon(setmax.equals).setNumber(setmax.toDoubleRange).setProgress(setmax.getCause, setmax.onNavigationEvent, setmax.b);
        if (Build.VERSION.SDK_INT < 21) {
            this.length.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.length.setSubText(setmax.invoke).setUsesChronometer(setmax.toString).setPriority(setmax.values);
            Iterator<NotificationCompat.Action> it = setmax.setMax.iterator();
            while (it.hasNext()) {
                getMin(it.next());
            }
            if (setmax.ICustomTabsCallback$Stub != null) {
                this.equals.putAll(setmax.ICustomTabsCallback$Stub);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (setmax.onRelationshipValidationResult) {
                    this.equals.putBoolean("android.support.localOnly", true);
                }
                if (setmax.ICustomTabsCallback != null) {
                    this.equals.putString("android.support.groupKey", setmax.ICustomTabsCallback);
                    if (setmax.create) {
                        this.equals.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.equals.putBoolean("android.support.useSideChannel", true);
                    }
                }
                if (setmax.extraCallback != null) {
                    this.equals.putString("android.support.sortKey", setmax.extraCallback);
                }
            }
            this.getMax = setmax.asInterface;
            this.setMax = setmax.getDefaultImpl;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            this.length.setShowWhen(setmax.FastBitmap$CoordinateSystem);
        }
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21 && (max = getMax(getMin((List<InspectableProperty.FlagEntry>) setmax.setMin), setmax.postMessage)) != null && !max.isEmpty()) {
            this.equals.putStringArray("android.people", (String[]) max.toArray(new String[max.size()]));
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.length.setLocalOnly(setmax.onRelationshipValidationResult).setGroup(setmax.ICustomTabsCallback).setGroupSummary(setmax.create).setSortKey(setmax.extraCallback);
            this.isInside = setmax.newSession;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.length.setCategory(setmax.extraCallbackWithResult).setColor(setmax.asBinder).setVisibility(setmax.ICustomTabsCallback$Default).setPublicVersion(setmax.onTransact).setSound(notification.sound, notification.audioAttributes);
            if (Build.VERSION.SDK_INT < 28) {
                list = getMax(getMin((List<InspectableProperty.FlagEntry>) setmax.setMin), setmax.postMessage);
            } else {
                list = setmax.postMessage;
            }
            if (list != null && !list.isEmpty()) {
                for (String addPerson : list) {
                    this.length.addPerson(addPerson);
                }
            }
            this.toFloatRange = setmax.ICustomTabsCallback$Stub$Proxy;
            if (setmax.getMin.size() > 0) {
                Bundle bundle = setmax.setMax().getBundle("android.car.EXTENSIONS");
                bundle = bundle == null ? new Bundle() : bundle;
                Bundle bundle2 = new Bundle(bundle);
                Bundle bundle3 = new Bundle();
                for (int i = 0; i < setmax.getMin.size(); i++) {
                    bundle3.putBundle(Integer.toString(i), hasAttributeId.setMax(setmax.getMin.get(i)));
                }
                bundle.putBundle("invisible_actions", bundle3);
                bundle2.putBundle("invisible_actions", bundle3);
                setmax.setMax().putBundle("android.car.EXTENSIONS", bundle);
                this.equals.putBundle("android.car.EXTENSIONS", bundle2);
            }
        }
        if (Build.VERSION.SDK_INT >= 23 && setmax.validateRelationship != null) {
            this.length.setSmallIcon(setmax.validateRelationship);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.length.setExtras(setmax.ICustomTabsCallback$Stub).setRemoteInputHistory(setmax.invokeSuspend);
            if (setmax.asInterface != null) {
                this.length.setCustomContentView(setmax.asInterface);
            }
            if (setmax.getDefaultImpl != null) {
                this.length.setCustomBigContentView(setmax.getDefaultImpl);
            }
            if (setmax.ICustomTabsCallback$Stub$Proxy != null) {
                this.length.setCustomHeadsUpContentView(setmax.ICustomTabsCallback$Stub$Proxy);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.length.setBadgeIconType(setmax.ICustomTabsService).setSettingsText(setmax.Mean$Arithmetic).setShortcutId(setmax.setDefaultImpl).setTimeoutAfter(setmax.warmup).setGroupAlertBehavior(setmax.newSession);
            if (setmax.onPostMessage) {
                this.length.setColorized(setmax.onMessageChannelReady);
            }
            if (!TextUtils.isEmpty(setmax.getInterfaceDescriptor)) {
                this.length.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Iterator<InspectableProperty.FlagEntry> it2 = setmax.setMin.iterator();
            while (it2.hasNext()) {
                this.length.addPerson(it2.next().setMax());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.length.setAllowSystemGeneratedContextualActions(setmax.newSessionWithExtras);
            this.length.setBubbleMetadata(NotificationCompat.getMin.setMax(setmax.mayLaunchUrl));
            if (setmax.extraCommand != null) {
                this.length.setLocusId(setmax.extraCommand.setMin());
            }
        }
        if (setmax.requestPostMessageChannel) {
            if (this.setMin.create) {
                this.isInside = 2;
            } else {
                this.isInside = 1;
            }
            this.length.setVibrate((long[]) null);
            this.length.setSound((Uri) null);
            notification.defaults &= -2;
            notification.defaults &= -3;
            this.length.setDefaults(notification.defaults);
            if (Build.VERSION.SDK_INT >= 26) {
                if (TextUtils.isEmpty(this.setMin.ICustomTabsCallback)) {
                    this.length.setGroup("silent");
                }
                this.length.setGroupAlertBehavior(this.isInside);
            }
        }
    }

    @Nullable
    private static List<String> getMax(@Nullable List<String> list, @Nullable List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = new MediaSessionCompat$Token(list.size() + list2.size());
        mediaSessionCompat$Token.addAll(list);
        mediaSessionCompat$Token.addAll(list2);
        return new ArrayList(mediaSessionCompat$Token);
    }

    @Nullable
    private static List<String> getMin(@Nullable List<InspectableProperty.FlagEntry> list) {
        String str;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (InspectableProperty.FlagEntry next : list) {
            if (next.setMin != null) {
                str = next.setMin;
            } else if (next.getMax != null) {
                StringBuilder sb = new StringBuilder("name:");
                sb.append(next.getMax);
                str = sb.toString();
            } else {
                str = "";
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    public Notification.Builder setMax() {
        return this.length;
    }

    public Context length() {
        return this.getMin;
    }

    public Notification getMin() {
        Bundle length2;
        RemoteViews min;
        RemoteViews min2;
        NotificationCompat.getMax getmax = this.setMin.valueOf;
        if (getmax != null) {
            getmax.length((enumMapping) this);
        }
        RemoteViews max = getmax != null ? getmax.getMax(this) : null;
        Notification max2 = getMax();
        if (max != null) {
            max2.contentView = max;
        } else if (this.setMin.asInterface != null) {
            max2.contentView = this.setMin.asInterface;
        }
        if (!(Build.VERSION.SDK_INT < 16 || getmax == null || (min2 = getmax.setMin((enumMapping) this)) == null)) {
            max2.bigContentView = min2;
        }
        if (!(Build.VERSION.SDK_INT < 21 || getmax == null || (min = this.setMin.valueOf.getMin(this)) == null)) {
            max2.headsUpContentView = min;
        }
        if (!(Build.VERSION.SDK_INT < 16 || getmax == null || (length2 = NotificationCompat.length(max2)) == null)) {
            getmax.setMin(length2);
        }
        return max2;
    }

    private void getMin(NotificationCompat.Action action) {
        Notification.Action.Builder builder;
        Bundle bundle;
        if (Build.VERSION.SDK_INT >= 20) {
            IconCompat length2 = action.length();
            if (Build.VERSION.SDK_INT >= 23) {
                builder = new Notification.Action.Builder(length2 != null ? length2.isInside() : null, action.setMin(), action.setMax());
            } else {
                builder = new Notification.Action.Builder(length2 != null ? length2.getMax() : 0, action.setMin(), action.setMax());
            }
            if (action.isInside() != null) {
                for (RemoteInput addRemoteInput : androidx.core.app.RemoteInput.getMin(action.isInside())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (action.getMax() != null) {
                bundle = new Bundle(action.getMax());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", action.equals());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(action.equals());
            }
            bundle.putInt("android.support.action.semanticAction", action.toFloatRange());
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(action.toFloatRange());
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builder.setContextual(action.IsOverlapping());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", action.toDoubleRange());
            builder.addExtras(bundle);
            this.length.addAction(builder.build());
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.toIntRange.add(hasAttributeId.setMax(this.length, action));
        }
    }

    /* access modifiers changed from: protected */
    public Notification getMax() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.length.build();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Notification build = this.length.build();
            if (this.isInside != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.isInside != 2)) {
                    length(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.isInside == 1) {
                    length(build);
                }
            }
            return build;
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.length.setExtras(this.equals);
            Notification build2 = this.length.build();
            RemoteViews remoteViews = this.getMax;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.setMax;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.toFloatRange;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.isInside != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.isInside != 2)) {
                    length(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.isInside == 1) {
                    length(build2);
                }
            }
            return build2;
        } else if (Build.VERSION.SDK_INT >= 20) {
            this.length.setExtras(this.equals);
            Notification build3 = this.length.build();
            RemoteViews remoteViews4 = this.getMax;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.setMax;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.isInside != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.isInside != 2)) {
                    length(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.isInside == 1) {
                    length(build3);
                }
            }
            return build3;
        } else if (Build.VERSION.SDK_INT >= 19) {
            SparseArray<Bundle> length2 = hasAttributeId.length(this.toIntRange);
            if (length2 != null) {
                this.equals.putSparseParcelableArray("android.support.actionExtras", length2);
            }
            this.length.setExtras(this.equals);
            Notification build4 = this.length.build();
            RemoteViews remoteViews6 = this.getMax;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.setMax;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (Build.VERSION.SDK_INT < 16) {
            return this.length.getNotification();
        } else {
            Notification build5 = this.length.build();
            Bundle length3 = NotificationCompat.length(build5);
            Bundle bundle = new Bundle(this.equals);
            for (String str : this.equals.keySet()) {
                if (length3.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            length3.putAll(bundle);
            SparseArray<Bundle> length4 = hasAttributeId.length(this.toIntRange);
            if (length4 != null) {
                NotificationCompat.length(build5).putSparseParcelableArray("android.support.actionExtras", length4);
            }
            RemoteViews remoteViews8 = this.getMax;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.setMax;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }

    private void length(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
