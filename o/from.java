package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.Guideline;
import id.dana.lib.gcontainer.app.bridge.subapp.CloseSubAppEvent;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.ResultReceiver;
import o.to;
import org.xmlpull.v1.XmlPullParserException;

public class from {
    /* access modifiers changed from: private */
    public static final int[] getMin = {0, 4, 8};
    private static SparseIntArray isInside;
    public boolean getMax = true;
    private HashMap<String, ConstraintAttribute> length = new HashMap<>();
    public HashMap<Integer, length> setMax = new HashMap<>();
    public boolean setMin;

    private static String setMax(int i) {
        switch (i) {
            case 1:
                return TtmlNode.LEFT;
            case 2:
                return TtmlNode.RIGHT;
            case 3:
                return CloseSubAppEvent.TOP;
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return TtmlNode.END;
            default:
                return "undefined";
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        isInside = sparseIntArray;
        sparseIntArray.append(to.length.ITrustedWebActivityService$Stub, 25);
        isInside.append(to.length.ITrustedWebActivityService$Default, 26);
        isInside.append(to.length.cancelAll, 29);
        isInside.append(to.length.cancel, 30);
        isInside.append(to.length.RemoteActionCompatParcelizer, 36);
        isInside.append(to.length.read, 35);
        isInside.append(to.length.receiveFile, 4);
        isInside.append(to.length.ICustomTabsService$Stub$Proxy, 3);
        isInside.append(to.length.ICustomTabsService$Default, 1);
        isInside.append(to.length.MediaMetadataCompat$BitmapKey, 6);
        isInside.append(to.length.MediaMetadataCompat$TextKey, 7);
        isInside.append(to.length.areNotificationsEnabled, 17);
        isInside.append(to.length.ITrustedWebActivityService, 18);
        isInside.append(to.length.ITrustedWebActivityCallback$Default, 19);
        isInside.append(to.length.valueOf, 27);
        isInside.append(to.length.INotificationSideChannel$Stub, 32);
        isInside.append(to.length.INotificationSideChannel$Stub$Proxy, 33);
        isInside.append(to.length.ITrustedWebActivityCallback$Stub, 10);
        isInside.append(to.length.IPostMessageService$Stub$Proxy, 9);
        isInside.append(to.length.MediaMetadataCompat$RatingKey, 13);
        isInside.append(to.length.RatingCompat$StarStyle, 16);
        isInside.append(to.length.RatingCompat$Style, 14);
        isInside.append(to.length.MediaMetadataCompat$LongKey, 11);
        isInside.append(to.length.RatingCompat, 15);
        isInside.append(to.length.MediaMetadataCompat, 12);
        isInside.append(to.length.MediaBrowserCompat$ItemReceiver, 40);
        isInside.append(to.length.ITrustedWebActivityService$Stub$Proxy, 39);
        isInside.append(to.length.getSmallIconId, 41);
        isInside.append(to.length.IconCompatParcelizer, 42);
        isInside.append(to.length.getActiveNotifications, 20);
        isInside.append(to.length.write, 37);
        isInside.append(to.length.IPostMessageService$Default, 5);
        isInside.append(to.length.notify, 82);
        isInside.append(to.length.MediaBrowserCompat$CustomActionResultReceiver, 82);
        isInside.append(to.length.INotificationSideChannel, 82);
        isInside.append(to.length.ICustomTabsService$Stub, 82);
        isInside.append(to.length.IPostMessageService, 82);
        isInside.append(to.length.create, 24);
        isInside.append(to.length.onPostMessage, 28);
        isInside.append(to.length.ICustomTabsCallback$Stub$Proxy, 31);
        isInside.append(to.length.getInterfaceDescriptor, 8);
        isInside.append(to.length.b, 34);
        isInside.append(to.length.onMessageChannelReady, 2);
        isInside.append(to.length.onNavigationEvent, 23);
        isInside.append(to.length.getCause, 21);
        isInside.append(to.length.ICustomTabsCallback, 22);
        isInside.append(to.length.extraCallback, 43);
        isInside.append(to.length.extraCommand, 44);
        isInside.append(to.length.setDefaultImpl, 45);
        isInside.append(to.length.getDefaultImpl, 46);
        isInside.append(to.length.ICustomTabsCallback$Default, 60);
        isInside.append(to.length.asBinder, 47);
        isInside.append(to.length.ICustomTabsCallback$Stub, 48);
        isInside.append(to.length.extraCallbackWithResult, 49);
        isInside.append(to.length.onRelationshipValidationResult, 50);
        isInside.append(to.length.onTransact, 51);
        isInside.append(to.length.asInterface, 52);
        isInside.append(to.length.ICustomTabsService, 53);
        isInside.append(to.length.MediaDescriptionCompat, 54);
        isInside.append(to.length.ITrustedWebActivityCallback$Stub$Proxy, 55);
        isInside.append(to.length.MediaBrowserCompat$MediaItem, 56);
        isInside.append(to.length.notifyNotificationWithChannel, 57);
        isInside.append(to.length.MediaBrowserCompat$SearchResultReceiver, 58);
        isInside.append(to.length.getSmallIconBitmap, 59);
        isInside.append(to.length.IPostMessageService$Stub, 61);
        isInside.append(to.length.ITrustedWebActivityCallback, 62);
        isInside.append(to.length.onExtraCallback, 63);
        isInside.append(to.length.mayLaunchUrl, 64);
        isInside.append(to.length.onQueueChanged, 65);
        isInside.append(to.length.requestPostMessageChannelWithExtras, 66);
        isInside.append(to.length.onPlaybackStateChanged, 67);
        isInside.append(to.length.IMediaControllerCallback, 79);
        isInside.append(to.length.Grayscale$Algorithm, 38);
        isInside.append(to.length.onEvent, 68);
        isInside.append(to.length.MediaBrowserCompat$MediaItem$Flags, 69);
        isInside.append(to.length.cancelNotification, 70);
        isInside.append(to.length.postMessage, 71);
        isInside.append(to.length.newSession, 72);
        isInside.append(to.length.warmup, 73);
        isInside.append(to.length.updateVisuals, 74);
        isInside.append(to.length.newSessionWithExtras, 75);
        isInside.append(to.length.onMetadataChanged, 76);
        isInside.append(to.length.INotificationSideChannel$Default, 77);
        isInside.append(to.length.onQueueTitleChanged, 78);
        isInside.append(to.length.validateRelationship, 80);
        isInside.append(to.length.requestPostMessageChannel, 81);
    }

    public final void getMax(from from) {
        for (Integer next : from.setMax.keySet()) {
            int intValue = next.intValue();
            length length2 = from.setMax.get(next);
            if (!this.setMax.containsKey(Integer.valueOf(intValue))) {
                this.setMax.put(Integer.valueOf(intValue), new length());
            }
            length length3 = this.setMax.get(Integer.valueOf(intValue));
            if (!length3.setMin.length) {
                length3.setMin.setMax(length2.setMin);
            }
            if (!length3.length.setMax) {
                length3.length.setMax(length2.length);
            }
            if (!length3.setMax.setMin) {
                length3.setMax.getMax(length2.setMax);
            }
            if (!length3.getMax.getMin) {
                length3.getMax.setMin(length2.getMax);
            }
            for (String next2 : length2.toFloatRange.keySet()) {
                if (!length3.toFloatRange.containsKey(next2)) {
                    length3.toFloatRange.put(next2, length2.toFloatRange.get(next2));
                }
            }
        }
    }

    public final void getMin(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!this.getMax || id2 != -1) {
                if (!this.setMax.containsKey(Integer.valueOf(id2))) {
                    this.setMax.put(Integer.valueOf(id2), new length());
                }
                length length2 = this.setMax.get(Integer.valueOf(id2));
                if (!length2.setMin.length) {
                    length2.getMax(id2, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        length2.setMin.ITrustedWebActivityCallback = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            length2.setMin.ITrustedWebActivityCallback$Default = barrier.allowsGoneWidget();
                            length2.setMin.ICustomTabsService$Stub = barrier.getType();
                            length2.setMin.ICustomTabsService$Stub$Proxy = barrier.getMargin();
                        }
                    }
                    length2.setMin.length = true;
                }
                if (!length2.length.setMax) {
                    length2.length.length = childAt.getVisibility();
                    length2.length.getMax = childAt.getAlpha();
                    length2.length.setMax = true;
                }
                if (Build.VERSION.SDK_INT >= 17 && !length2.setMax.setMin) {
                    length2.setMax.setMin = true;
                    length2.setMax.getMin = childAt.getRotation();
                    length2.setMax.length = childAt.getRotationX();
                    length2.setMax.setMax = childAt.getRotationY();
                    length2.setMax.getMax = childAt.getScaleX();
                    length2.setMax.toIntRange = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        length2.setMax.isInside = pivotX;
                        length2.setMax.IsOverlapping = pivotY;
                    }
                    length2.setMax.equals = childAt.getTranslationX();
                    length2.setMax.toFloatRange = childAt.getTranslationY();
                    if (Build.VERSION.SDK_INT >= 21) {
                        length2.setMax.values = childAt.getTranslationZ();
                        if (length2.setMax.hashCode) {
                            length2.setMax.FastBitmap$CoordinateSystem = childAt.getElevation();
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public static class getMin {
        private static SparseIntArray ITrustedWebActivityCallback$Stub$Proxy;
        public int FastBitmap$CoordinateSystem = -1;
        public int Grayscale$Algorithm = -1;
        public int ICustomTabsCallback = -1;
        public int ICustomTabsCallback$Default = -1;
        public int ICustomTabsCallback$Stub = -1;
        public int ICustomTabsCallback$Stub$Proxy = -1;
        public int ICustomTabsService = -1;
        public float ICustomTabsService$Default = 1.0f;
        public int ICustomTabsService$Stub = -1;
        public int ICustomTabsService$Stub$Proxy = 0;
        public float IPostMessageService = 1.0f;
        public boolean IPostMessageService$Default = false;
        public String IPostMessageService$Stub;
        public int IPostMessageService$Stub$Proxy = -1;
        public int[] ITrustedWebActivityCallback;
        public boolean ITrustedWebActivityCallback$Default = true;
        public boolean ITrustedWebActivityCallback$Stub = false;
        public int IsOverlapping = -1;
        public int Mean$Arithmetic = -1;
        public int asBinder = -1;
        public int asInterface = -1;
        public int b = 0;
        public float create = 0.5f;
        public int equals = -1;
        public int extraCallback = -1;
        public float extraCallbackWithResult = 0.0f;
        public int extraCommand = -1;
        public float getCause = 0.5f;
        public int getDefaultImpl = -1;
        public int getInterfaceDescriptor = -1;
        public int getMax;
        public int getMin = -1;
        public int hashCode = -1;
        public int invoke = -1;
        public int invokeSuspend = -1;
        public int isInside = -1;
        public boolean length = false;
        public int mayLaunchUrl = 0;
        public float newSession = -1.0f;
        public float newSessionWithExtras = -1.0f;
        public String onExtraCallback;
        public int onMessageChannelReady = -1;
        public String onNavigationEvent = null;
        public int onPostMessage = -1;
        public int onRelationshipValidationResult = -1;
        public int onTransact = -1;
        public int postMessage = 0;
        public int receiveFile = -1;
        public int requestPostMessageChannel = -1;
        public int requestPostMessageChannelWithExtras = -1;
        public int setDefaultImpl = -1;
        public boolean setMax = false;
        public int setMin;
        public int toDoubleRange = -1;
        public float toFloatRange = -1.0f;
        public int toIntRange = -1;
        public int toString = -1;
        public int updateVisuals = -1;
        public int validateRelationship = 0;
        public int valueOf = -1;
        public int values = -1;
        public int warmup = 0;

        public final void setMax(getMin getmin) {
            this.setMax = getmin.setMax;
            this.setMin = getmin.setMin;
            this.length = getmin.length;
            this.getMax = getmin.getMax;
            this.getMin = getmin.getMin;
            this.isInside = getmin.isInside;
            this.toFloatRange = getmin.toFloatRange;
            this.toIntRange = getmin.toIntRange;
            this.IsOverlapping = getmin.IsOverlapping;
            this.equals = getmin.equals;
            this.FastBitmap$CoordinateSystem = getmin.FastBitmap$CoordinateSystem;
            this.hashCode = getmin.hashCode;
            this.toDoubleRange = getmin.toDoubleRange;
            this.values = getmin.values;
            this.toString = getmin.toString;
            this.Mean$Arithmetic = getmin.Mean$Arithmetic;
            this.Grayscale$Algorithm = getmin.Grayscale$Algorithm;
            this.invokeSuspend = getmin.invokeSuspend;
            this.invoke = getmin.invoke;
            this.valueOf = getmin.valueOf;
            this.getCause = getmin.getCause;
            this.create = getmin.create;
            this.onNavigationEvent = getmin.onNavigationEvent;
            this.ICustomTabsCallback = getmin.ICustomTabsCallback;
            this.b = getmin.b;
            this.extraCallbackWithResult = getmin.extraCallbackWithResult;
            this.onRelationshipValidationResult = getmin.onRelationshipValidationResult;
            this.extraCallback = getmin.extraCallback;
            this.onPostMessage = getmin.onPostMessage;
            this.onMessageChannelReady = getmin.onMessageChannelReady;
            this.ICustomTabsCallback$Default = getmin.ICustomTabsCallback$Default;
            this.ICustomTabsCallback$Stub = getmin.ICustomTabsCallback$Stub;
            this.asBinder = getmin.asBinder;
            this.asInterface = getmin.asInterface;
            this.onTransact = getmin.onTransact;
            this.getDefaultImpl = getmin.getDefaultImpl;
            this.ICustomTabsService = getmin.ICustomTabsService;
            this.getInterfaceDescriptor = getmin.getInterfaceDescriptor;
            this.ICustomTabsCallback$Stub$Proxy = getmin.ICustomTabsCallback$Stub$Proxy;
            this.setDefaultImpl = getmin.setDefaultImpl;
            this.extraCommand = getmin.extraCommand;
            this.newSession = getmin.newSession;
            this.newSessionWithExtras = getmin.newSessionWithExtras;
            this.mayLaunchUrl = getmin.mayLaunchUrl;
            this.warmup = getmin.warmup;
            this.postMessage = getmin.postMessage;
            this.validateRelationship = getmin.validateRelationship;
            this.updateVisuals = getmin.updateVisuals;
            this.requestPostMessageChannelWithExtras = getmin.requestPostMessageChannelWithExtras;
            this.requestPostMessageChannel = getmin.requestPostMessageChannel;
            this.receiveFile = getmin.receiveFile;
            this.IPostMessageService = getmin.IPostMessageService;
            this.ICustomTabsService$Default = getmin.ICustomTabsService$Default;
            this.ICustomTabsService$Stub = getmin.ICustomTabsService$Stub;
            this.ICustomTabsService$Stub$Proxy = getmin.ICustomTabsService$Stub$Proxy;
            this.IPostMessageService$Stub$Proxy = getmin.IPostMessageService$Stub$Proxy;
            this.IPostMessageService$Stub = getmin.IPostMessageService$Stub;
            int[] iArr = getmin.ITrustedWebActivityCallback;
            if (iArr != null) {
                this.ITrustedWebActivityCallback = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.ITrustedWebActivityCallback = null;
            }
            this.onExtraCallback = getmin.onExtraCallback;
            this.IPostMessageService$Default = getmin.IPostMessageService$Default;
            this.ITrustedWebActivityCallback$Stub = getmin.ITrustedWebActivityCallback$Stub;
            this.ITrustedWebActivityCallback$Default = getmin.ITrustedWebActivityCallback$Default;
        }

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            ITrustedWebActivityCallback$Stub$Proxy = sparseIntArray;
            sparseIntArray.append(to.length.setRecycleOnMeasureEnabled, 24);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setSingleChoiceItems, 25);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.attachBaseContext, 28);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.show, 29);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.getMenuInflater, 35);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setSupportActionBar, 34);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setPositiveButton, 4);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setNegativeButtonIcon, 3);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setPositiveButtonIcon, 1);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.onMenuItemSelected, 6);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.onStart, 7);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setCursor, 17);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setItems, 18);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setMultiChoiceItems, 19);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.WorkerThread, 26);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.initDelegate, 31);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setTheme, 32);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setOnCancelListener, 10);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setOnDismissListener, 9);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.onTitleChanged, 13);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.supportInvalidateOptionsMenu, 16);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.supportRequestWindowFeature, 14);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.onPostResume, 11);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.invalidateOptionsMenu, 15);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.onDestroy, 12);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.findViewById, 38);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setView, 37);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setOnItemSelectedListener, 39);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.getSupportActionBar, 40);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setOnKeyListener, 20);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.onPostCreate, 36);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setNeutralButtonIcon, 5);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setInverseBackgroundForced, 76);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.onConfigurationChanged, 76);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.AppCompatActivity, 76);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setIconAttribute, 76);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setTitle, 76);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.Experimental$Level, 23);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.AlertController$RecycleListView, 27);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.ActionBar$DisplayOptions, 30);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.ActionBar$NavigationMode, 8);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.XmlRes, 33);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.ActionBar$LayoutParams, 2);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.UseExperimental, 22);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.Experimental, 21);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setNegativeButton, 61);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setNeutralButton, 62);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setCancelable, 63);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.onStop, 69);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setAdapter, 70);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setIcon, 71);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setCustomTitle, 72);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setMessage, 73);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.getContext, 74);
            ITrustedWebActivityCallback$Stub$Proxy.append(to.length.setHasDecor, 75);
        }

        /* access modifiers changed from: package-private */
        public final void setMin(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, to.length.VisibleForTesting);
            this.length = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = ITrustedWebActivityCallback$Stub$Proxy.get(index);
                if (i2 == 80) {
                    this.IPostMessageService$Default = obtainStyledAttributes.getBoolean(index, this.IPostMessageService$Default);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.Mean$Arithmetic = from.length(obtainStyledAttributes, index, this.Mean$Arithmetic);
                            break;
                        case 2:
                            this.asBinder = obtainStyledAttributes.getDimensionPixelSize(index, this.asBinder);
                            break;
                        case 3:
                            this.toString = from.length(obtainStyledAttributes, index, this.toString);
                            break;
                        case 4:
                            this.values = from.length(obtainStyledAttributes, index, this.values);
                            break;
                        case 5:
                            this.onNavigationEvent = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.onRelationshipValidationResult = obtainStyledAttributes.getDimensionPixelOffset(index, this.onRelationshipValidationResult);
                            break;
                        case 7:
                            this.extraCallback = obtainStyledAttributes.getDimensionPixelOffset(index, this.extraCallback);
                            break;
                        case 8:
                            if (Build.VERSION.SDK_INT < 17) {
                                break;
                            } else {
                                this.asInterface = obtainStyledAttributes.getDimensionPixelSize(index, this.asInterface);
                                break;
                            }
                        case 9:
                            this.valueOf = from.length(obtainStyledAttributes, index, this.valueOf);
                            break;
                        case 10:
                            this.invoke = from.length(obtainStyledAttributes, index, this.invoke);
                            break;
                        case 11:
                            this.ICustomTabsCallback$Stub$Proxy = obtainStyledAttributes.getDimensionPixelSize(index, this.ICustomTabsCallback$Stub$Proxy);
                            break;
                        case 12:
                            this.setDefaultImpl = obtainStyledAttributes.getDimensionPixelSize(index, this.setDefaultImpl);
                            break;
                        case 13:
                            this.getDefaultImpl = obtainStyledAttributes.getDimensionPixelSize(index, this.getDefaultImpl);
                            break;
                        case 14:
                            this.getInterfaceDescriptor = obtainStyledAttributes.getDimensionPixelSize(index, this.getInterfaceDescriptor);
                            break;
                        case 15:
                            this.extraCommand = obtainStyledAttributes.getDimensionPixelSize(index, this.extraCommand);
                            break;
                        case 16:
                            this.ICustomTabsService = obtainStyledAttributes.getDimensionPixelSize(index, this.ICustomTabsService);
                            break;
                        case 17:
                            this.getMin = obtainStyledAttributes.getDimensionPixelOffset(index, this.getMin);
                            break;
                        case 18:
                            this.isInside = obtainStyledAttributes.getDimensionPixelOffset(index, this.isInside);
                            break;
                        case 19:
                            this.toFloatRange = obtainStyledAttributes.getFloat(index, this.toFloatRange);
                            break;
                        case 20:
                            this.getCause = obtainStyledAttributes.getFloat(index, this.getCause);
                            break;
                        case 21:
                            this.getMax = obtainStyledAttributes.getLayoutDimension(index, this.getMax);
                            break;
                        case 22:
                            this.setMin = obtainStyledAttributes.getLayoutDimension(index, this.setMin);
                            break;
                        case 23:
                            this.onMessageChannelReady = obtainStyledAttributes.getDimensionPixelSize(index, this.onMessageChannelReady);
                            break;
                        case 24:
                            this.toIntRange = from.length(obtainStyledAttributes, index, this.toIntRange);
                            break;
                        case 25:
                            this.IsOverlapping = from.length(obtainStyledAttributes, index, this.IsOverlapping);
                            break;
                        case 26:
                            this.onPostMessage = obtainStyledAttributes.getInt(index, this.onPostMessage);
                            break;
                        case 27:
                            this.ICustomTabsCallback$Default = obtainStyledAttributes.getDimensionPixelSize(index, this.ICustomTabsCallback$Default);
                            break;
                        case 28:
                            this.equals = from.length(obtainStyledAttributes, index, this.equals);
                            break;
                        case 29:
                            this.FastBitmap$CoordinateSystem = from.length(obtainStyledAttributes, index, this.FastBitmap$CoordinateSystem);
                            break;
                        case 30:
                            if (Build.VERSION.SDK_INT < 17) {
                                break;
                            } else {
                                this.onTransact = obtainStyledAttributes.getDimensionPixelSize(index, this.onTransact);
                                break;
                            }
                        case 31:
                            this.Grayscale$Algorithm = from.length(obtainStyledAttributes, index, this.Grayscale$Algorithm);
                            break;
                        case 32:
                            this.invokeSuspend = from.length(obtainStyledAttributes, index, this.invokeSuspend);
                            break;
                        case 33:
                            this.ICustomTabsCallback$Stub = obtainStyledAttributes.getDimensionPixelSize(index, this.ICustomTabsCallback$Stub);
                            break;
                        case 34:
                            this.toDoubleRange = from.length(obtainStyledAttributes, index, this.toDoubleRange);
                            break;
                        case 35:
                            this.hashCode = from.length(obtainStyledAttributes, index, this.hashCode);
                            break;
                        case 36:
                            this.create = obtainStyledAttributes.getFloat(index, this.create);
                            break;
                        case 37:
                            this.newSessionWithExtras = obtainStyledAttributes.getFloat(index, this.newSessionWithExtras);
                            break;
                        case 38:
                            this.newSession = obtainStyledAttributes.getFloat(index, this.newSession);
                            break;
                        case 39:
                            this.mayLaunchUrl = obtainStyledAttributes.getInt(index, this.mayLaunchUrl);
                            break;
                        case 40:
                            this.warmup = obtainStyledAttributes.getInt(index, this.warmup);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.postMessage = obtainStyledAttributes.getInt(index, this.postMessage);
                                    break;
                                case 55:
                                    this.validateRelationship = obtainStyledAttributes.getInt(index, this.validateRelationship);
                                    break;
                                case 56:
                                    this.updateVisuals = obtainStyledAttributes.getDimensionPixelSize(index, this.updateVisuals);
                                    break;
                                case 57:
                                    this.requestPostMessageChannelWithExtras = obtainStyledAttributes.getDimensionPixelSize(index, this.requestPostMessageChannelWithExtras);
                                    break;
                                case 58:
                                    this.requestPostMessageChannel = obtainStyledAttributes.getDimensionPixelSize(index, this.requestPostMessageChannel);
                                    break;
                                case 59:
                                    this.receiveFile = obtainStyledAttributes.getDimensionPixelSize(index, this.receiveFile);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.ICustomTabsCallback = from.length(obtainStyledAttributes, index, this.ICustomTabsCallback);
                                            break;
                                        case 62:
                                            this.b = obtainStyledAttributes.getDimensionPixelSize(index, this.b);
                                            break;
                                        case 63:
                                            this.extraCallbackWithResult = obtainStyledAttributes.getFloat(index, this.extraCallbackWithResult);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.IPostMessageService = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.ICustomTabsService$Default = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    break;
                                                case 72:
                                                    this.ICustomTabsService$Stub = obtainStyledAttributes.getInt(index, this.ICustomTabsService$Stub);
                                                    break;
                                                case 73:
                                                    this.ICustomTabsService$Stub$Proxy = obtainStyledAttributes.getDimensionPixelSize(index, this.ICustomTabsService$Stub$Proxy);
                                                    break;
                                                case 74:
                                                    this.onExtraCallback = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.ITrustedWebActivityCallback$Default = obtainStyledAttributes.getBoolean(index, this.ITrustedWebActivityCallback$Default);
                                                    break;
                                                case 76:
                                                    ITrustedWebActivityCallback$Stub$Proxy.get(index);
                                                    break;
                                                case 77:
                                                    this.IPostMessageService$Stub = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    ITrustedWebActivityCallback$Stub$Proxy.get(index);
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.ITrustedWebActivityCallback$Stub = obtainStyledAttributes.getBoolean(index, this.ITrustedWebActivityCallback$Stub);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class getMax {
        private static SparseIntArray toDoubleRange;
        public float FastBitmap$CoordinateSystem = 0.0f;
        public float IsOverlapping = Float.NaN;
        public float equals = 0.0f;
        public float getMax = 1.0f;
        public float getMin = 0.0f;
        public boolean hashCode = false;
        public float isInside = Float.NaN;
        public float length = 0.0f;
        public float setMax = 0.0f;
        public boolean setMin = false;
        public float toFloatRange = 0.0f;
        public float toIntRange = 1.0f;
        public float values = 0.0f;

        public final void getMax(getMax getmax) {
            this.setMin = getmax.setMin;
            this.getMin = getmax.getMin;
            this.length = getmax.length;
            this.setMax = getmax.setMax;
            this.getMax = getmax.getMax;
            this.toIntRange = getmax.toIntRange;
            this.isInside = getmax.isInside;
            this.IsOverlapping = getmax.IsOverlapping;
            this.equals = getmax.equals;
            this.toFloatRange = getmax.toFloatRange;
            this.values = getmax.values;
            this.hashCode = getmax.hashCode;
            this.FastBitmap$CoordinateSystem = getmax.FastBitmap$CoordinateSystem;
        }

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            toDoubleRange = sparseIntArray;
            sparseIntArray.append(to.length.isAutoMirrored, 1);
            toDoubleRange.append(to.length.setTintMode, 2);
            toDoubleRange.append(to.length.setAutoMirrored, 3);
            toDoubleRange.append(to.length.getPadding, 4);
            toDoubleRange.append(to.length.onLevelChange, 5);
            toDoubleRange.append(to.length.getIntrinsicWidth, 6);
            toDoubleRange.append(to.length.unscheduleDrawable, 7);
            toDoubleRange.append(to.length.invalidateDrawable, 8);
            toDoubleRange.append(to.length.scheduleDrawable, 9);
            toDoubleRange.append(to.length.setTint, 10);
            toDoubleRange.append(to.length.setTintList, 11);
        }

        /* access modifiers changed from: package-private */
        public final void setMax(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, to.length.getTransparentRegion);
            this.setMin = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (toDoubleRange.get(index)) {
                    case 1:
                        this.getMin = obtainStyledAttributes.getFloat(index, this.getMin);
                        break;
                    case 2:
                        this.length = obtainStyledAttributes.getFloat(index, this.length);
                        break;
                    case 3:
                        this.setMax = obtainStyledAttributes.getFloat(index, this.setMax);
                        break;
                    case 4:
                        this.getMax = obtainStyledAttributes.getFloat(index, this.getMax);
                        break;
                    case 5:
                        this.toIntRange = obtainStyledAttributes.getFloat(index, this.toIntRange);
                        break;
                    case 6:
                        this.isInside = obtainStyledAttributes.getDimension(index, this.isInside);
                        break;
                    case 7:
                        this.IsOverlapping = obtainStyledAttributes.getDimension(index, this.IsOverlapping);
                        break;
                    case 8:
                        this.equals = obtainStyledAttributes.getDimension(index, this.equals);
                        break;
                    case 9:
                        this.toFloatRange = obtainStyledAttributes.getDimension(index, this.toFloatRange);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.values = obtainStyledAttributes.getDimension(index, this.values);
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.hashCode = true;
                            this.FastBitmap$CoordinateSystem = obtainStyledAttributes.getDimension(index, this.FastBitmap$CoordinateSystem);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class setMin {
        public float getMax = 1.0f;
        public int getMin = 0;
        public int length = 0;
        public boolean setMax = false;
        public float setMin = Float.NaN;

        public final void setMax(setMin setmin) {
            this.setMax = setmin.setMax;
            this.length = setmin.length;
            this.getMax = setmin.getMax;
            this.setMin = setmin.setMin;
            this.getMin = setmin.getMin;
        }

        /* access modifiers changed from: package-private */
        public final void setMin(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, to.length.setDither);
            this.setMax = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == to.length.getChangingConfigurations) {
                    this.getMax = obtainStyledAttributes.getFloat(index, this.getMax);
                } else if (index == to.length.draw) {
                    this.length = obtainStyledAttributes.getInt(index, this.length);
                    this.length = from.getMin[this.length];
                } else if (index == to.length.onBoundsChange) {
                    this.getMin = obtainStyledAttributes.getInt(index, this.getMin);
                } else if (index == to.length.setChangingConfigurations) {
                    this.setMin = obtainStyledAttributes.getFloat(index, this.setMin);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class setMax {
        private static SparseIntArray equals;
        public float IsOverlapping = Float.NaN;
        public int getMax = -1;
        public boolean getMin = false;
        public float isInside = Float.NaN;
        public int length = -1;
        public int setMax = 0;
        public String setMin = null;

        public final void setMin(setMax setmax) {
            this.getMin = setmax.getMin;
            this.length = setmax.length;
            this.setMin = setmax.setMin;
            this.getMax = setmax.getMax;
            this.setMax = setmax.setMax;
            this.IsOverlapping = setmax.IsOverlapping;
            this.isInside = setmax.isInside;
        }

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            equals = sparseIntArray;
            sparseIntArray.append(to.length.onPanelClosed, 1);
            equals.append(to.length.onMenuOpened, 2);
            equals.append(to.length.getDelegate, 3);
            equals.append(to.length.getDrawerToggleDelegate, 4);
            equals.append(to.length.supportShouldUpRecreateTask, 5);
            equals.append(to.length.onSupportContentChanged, 6);
        }

        /* access modifiers changed from: package-private */
        public final void setMax(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, to.length.supportNavigateUpTo);
            this.getMin = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (equals.get(index)) {
                    case 1:
                        this.IsOverlapping = obtainStyledAttributes.getFloat(index, this.IsOverlapping);
                        break;
                    case 2:
                        this.getMax = obtainStyledAttributes.getInt(index, this.getMax);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.setMin = ResultReceiver.MyResultReceiver.length[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.setMin = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.setMax = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.length = from.length(obtainStyledAttributes, index, this.length);
                        break;
                    case 6:
                        this.isInside = obtainStyledAttributes.getFloat(index, this.isInside);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class length {
        public final setMax getMax = new setMax();
        int getMin;
        public final setMin length = new setMin();
        public final getMax setMax = new getMax();
        public final getMin setMin = new getMin();
        public HashMap<String, ConstraintAttribute> toFloatRange = new HashMap<>();

        /* access modifiers changed from: private */
        public void length(int i, Constraints.LayoutParams layoutParams) {
            getMax(i, layoutParams);
            this.length.getMax = layoutParams.getSmallIconBitmap;
            this.setMax.getMin = layoutParams.notify;
            this.setMax.length = layoutParams.ITrustedWebActivityService$Default;
            this.setMax.setMax = layoutParams.ITrustedWebActivityService$Stub;
            this.setMax.getMax = layoutParams.INotificationSideChannel;
            this.setMax.toIntRange = layoutParams.ITrustedWebActivityService$Stub$Proxy;
            this.setMax.isInside = layoutParams.INotificationSideChannel$Default;
            this.setMax.IsOverlapping = layoutParams.INotificationSideChannel$Stub$Proxy;
            this.setMax.equals = layoutParams.cancelAll;
            this.setMax.toFloatRange = layoutParams.INotificationSideChannel$Stub;
            this.setMax.values = layoutParams.cancel;
            this.setMax.FastBitmap$CoordinateSystem = layoutParams.notifyNotificationWithChannel;
            this.setMax.hashCode = layoutParams.getActiveNotifications;
        }

        /* access modifiers changed from: private */
        public void getMax(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.getMin = i;
            this.setMin.toIntRange = layoutParams.getMin;
            this.setMin.IsOverlapping = layoutParams.setMin;
            this.setMin.equals = layoutParams.toIntRange;
            this.setMin.FastBitmap$CoordinateSystem = layoutParams.isInside;
            this.setMin.hashCode = layoutParams.toFloatRange;
            this.setMin.toDoubleRange = layoutParams.IsOverlapping;
            this.setMin.values = layoutParams.equals;
            this.setMin.toString = layoutParams.toDoubleRange;
            this.setMin.Mean$Arithmetic = layoutParams.toString;
            this.setMin.Grayscale$Algorithm = layoutParams.invokeSuspend;
            this.setMin.invokeSuspend = layoutParams.Grayscale$Algorithm;
            this.setMin.invoke = layoutParams.valueOf;
            this.setMin.valueOf = layoutParams.Mean$Arithmetic;
            this.setMin.getCause = layoutParams.extraCallback;
            this.setMin.create = layoutParams.onMessageChannelReady;
            this.setMin.onNavigationEvent = layoutParams.extraCallbackWithResult;
            this.setMin.ICustomTabsCallback = layoutParams.values;
            this.setMin.b = layoutParams.FastBitmap$CoordinateSystem;
            this.setMin.extraCallbackWithResult = layoutParams.hashCode;
            this.setMin.onRelationshipValidationResult = layoutParams.warmup;
            this.setMin.extraCallback = layoutParams.newSessionWithExtras;
            this.setMin.onPostMessage = layoutParams.extraCommand;
            this.setMin.toFloatRange = layoutParams.setMax;
            this.setMin.getMin = layoutParams.getMax;
            this.setMin.isInside = layoutParams.length;
            this.setMin.setMin = layoutParams.width;
            this.setMin.getMax = layoutParams.height;
            this.setMin.onMessageChannelReady = layoutParams.leftMargin;
            this.setMin.ICustomTabsCallback$Default = layoutParams.rightMargin;
            this.setMin.ICustomTabsCallback$Stub = layoutParams.topMargin;
            this.setMin.asBinder = layoutParams.bottomMargin;
            this.setMin.newSession = layoutParams.ICustomTabsCallback$Stub;
            this.setMin.newSessionWithExtras = layoutParams.ICustomTabsCallback$Default;
            this.setMin.warmup = layoutParams.onTransact;
            this.setMin.mayLaunchUrl = layoutParams.asInterface;
            this.setMin.IPostMessageService$Default = layoutParams.updateVisuals;
            this.setMin.ITrustedWebActivityCallback$Stub = layoutParams.validateRelationship;
            this.setMin.postMessage = layoutParams.asBinder;
            this.setMin.validateRelationship = layoutParams.ICustomTabsCallback$Stub$Proxy;
            this.setMin.updateVisuals = layoutParams.getInterfaceDescriptor;
            this.setMin.requestPostMessageChannelWithExtras = layoutParams.setDefaultImpl;
            this.setMin.requestPostMessageChannel = layoutParams.ICustomTabsService;
            this.setMin.receiveFile = layoutParams.getDefaultImpl;
            this.setMin.IPostMessageService = layoutParams.mayLaunchUrl;
            this.setMin.ICustomTabsService$Default = layoutParams.newSession;
            this.setMin.IPostMessageService$Stub = layoutParams.requestPostMessageChannel;
            this.setMin.ICustomTabsService = layoutParams.create;
            this.setMin.ICustomTabsCallback$Stub$Proxy = layoutParams.onNavigationEvent;
            this.setMin.getDefaultImpl = layoutParams.invoke;
            this.setMin.getInterfaceDescriptor = layoutParams.ICustomTabsCallback;
            this.setMin.extraCommand = layoutParams.b;
            this.setMin.setDefaultImpl = layoutParams.getCause;
            if (Build.VERSION.SDK_INT >= 17) {
                this.setMin.asInterface = layoutParams.getMarginEnd();
                this.setMin.onTransact = layoutParams.getMarginStart();
            }
        }

        public final void setMin(ConstraintLayout.LayoutParams layoutParams) {
            layoutParams.getMin = this.setMin.toIntRange;
            layoutParams.setMin = this.setMin.IsOverlapping;
            layoutParams.toIntRange = this.setMin.equals;
            layoutParams.isInside = this.setMin.FastBitmap$CoordinateSystem;
            layoutParams.toFloatRange = this.setMin.hashCode;
            layoutParams.IsOverlapping = this.setMin.toDoubleRange;
            layoutParams.equals = this.setMin.values;
            layoutParams.toDoubleRange = this.setMin.toString;
            layoutParams.toString = this.setMin.Mean$Arithmetic;
            layoutParams.invokeSuspend = this.setMin.Grayscale$Algorithm;
            layoutParams.Grayscale$Algorithm = this.setMin.invokeSuspend;
            layoutParams.valueOf = this.setMin.invoke;
            layoutParams.Mean$Arithmetic = this.setMin.valueOf;
            layoutParams.leftMargin = this.setMin.onMessageChannelReady;
            layoutParams.rightMargin = this.setMin.ICustomTabsCallback$Default;
            layoutParams.topMargin = this.setMin.ICustomTabsCallback$Stub;
            layoutParams.bottomMargin = this.setMin.asBinder;
            layoutParams.b = this.setMin.extraCommand;
            layoutParams.getCause = this.setMin.setDefaultImpl;
            layoutParams.create = this.setMin.ICustomTabsService;
            layoutParams.onNavigationEvent = this.setMin.ICustomTabsCallback$Stub$Proxy;
            layoutParams.extraCallback = this.setMin.getCause;
            layoutParams.onMessageChannelReady = this.setMin.create;
            layoutParams.values = this.setMin.ICustomTabsCallback;
            layoutParams.FastBitmap$CoordinateSystem = this.setMin.b;
            layoutParams.hashCode = this.setMin.extraCallbackWithResult;
            layoutParams.extraCallbackWithResult = this.setMin.onNavigationEvent;
            layoutParams.warmup = this.setMin.onRelationshipValidationResult;
            layoutParams.newSessionWithExtras = this.setMin.extraCallback;
            layoutParams.ICustomTabsCallback$Stub = this.setMin.newSession;
            layoutParams.ICustomTabsCallback$Default = this.setMin.newSessionWithExtras;
            layoutParams.onTransact = this.setMin.warmup;
            layoutParams.asInterface = this.setMin.mayLaunchUrl;
            layoutParams.updateVisuals = this.setMin.IPostMessageService$Default;
            layoutParams.validateRelationship = this.setMin.ITrustedWebActivityCallback$Stub;
            layoutParams.asBinder = this.setMin.postMessage;
            layoutParams.ICustomTabsCallback$Stub$Proxy = this.setMin.validateRelationship;
            layoutParams.getInterfaceDescriptor = this.setMin.updateVisuals;
            layoutParams.setDefaultImpl = this.setMin.requestPostMessageChannelWithExtras;
            layoutParams.ICustomTabsService = this.setMin.requestPostMessageChannel;
            layoutParams.getDefaultImpl = this.setMin.receiveFile;
            layoutParams.mayLaunchUrl = this.setMin.IPostMessageService;
            layoutParams.newSession = this.setMin.ICustomTabsService$Default;
            layoutParams.extraCommand = this.setMin.onPostMessage;
            layoutParams.setMax = this.setMin.toFloatRange;
            layoutParams.getMax = this.setMin.getMin;
            layoutParams.length = this.setMin.isInside;
            layoutParams.width = this.setMin.setMin;
            layoutParams.height = this.setMin.getMax;
            if (this.setMin.IPostMessageService$Stub != null) {
                layoutParams.requestPostMessageChannel = this.setMin.IPostMessageService$Stub;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(this.setMin.onTransact);
                layoutParams.setMarginEnd(this.setMin.asInterface);
            }
            layoutParams.setMax();
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            length length2 = new length();
            length2.setMin.setMax(this.setMin);
            length2.getMax.setMin(this.getMax);
            length2.length.setMax(this.length);
            length2.setMax.getMax(this.setMax);
            length2.getMin = this.getMin;
            return length2;
        }

        public static /* synthetic */ void getMax(length length2, ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            length2.length(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                length2.setMin.IPostMessageService$Stub$Proxy = 1;
                Barrier barrier = (Barrier) constraintHelper;
                length2.setMin.ICustomTabsService$Stub = barrier.getType();
                length2.setMin.ITrustedWebActivityCallback = barrier.getReferencedIds();
                length2.setMin.ICustomTabsService$Stub$Proxy = barrier.getMargin();
            }
        }
    }

    public final void getMin(Context context, int i) {
        setMax((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public final void setMax(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.setMax.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!this.getMax || id2 != -1) {
                if (!this.setMax.containsKey(Integer.valueOf(id2))) {
                    this.setMax.put(Integer.valueOf(id2), new length());
                }
                length length2 = this.setMax.get(Integer.valueOf(id2));
                length2.toFloatRange = ConstraintAttribute.setMin(this.length, childAt);
                length2.getMax(id2, layoutParams);
                length2.length.length = childAt.getVisibility();
                if (Build.VERSION.SDK_INT >= 17) {
                    length2.length.getMax = childAt.getAlpha();
                    length2.setMax.getMin = childAt.getRotation();
                    length2.setMax.length = childAt.getRotationX();
                    length2.setMax.setMax = childAt.getRotationY();
                    length2.setMax.getMax = childAt.getScaleX();
                    length2.setMax.toIntRange = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        length2.setMax.isInside = pivotX;
                        length2.setMax.IsOverlapping = pivotY;
                    }
                    length2.setMax.equals = childAt.getTranslationX();
                    length2.setMax.toFloatRange = childAt.getTranslationY();
                    if (Build.VERSION.SDK_INT >= 21) {
                        length2.setMax.values = childAt.getTranslationZ();
                        if (length2.setMax.hashCode) {
                            length2.setMax.FastBitmap$CoordinateSystem = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    length2.setMin.ITrustedWebActivityCallback$Default = barrier.allowsGoneWidget();
                    length2.setMin.ITrustedWebActivityCallback = barrier.getReferencedIds();
                    length2.setMin.ICustomTabsService$Stub = barrier.getType();
                    length2.setMin.ICustomTabsService$Stub$Proxy = barrier.getMargin();
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void setMin(ConstraintLayout constraintLayout) {
        getMax(constraintLayout);
        constraintLayout.setConstraintSet((from) null);
        constraintLayout.requestLayout();
    }

    public final void length(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id2 = childAt.getId();
            if (!this.setMax.containsKey(Integer.valueOf(id2))) {
                addContentView.setMax(childAt);
            } else if (this.getMax && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.setMax.containsKey(Integer.valueOf(id2))) {
                ConstraintAttribute.setMin(childAt, this.setMax.get(Integer.valueOf(id2)).toFloatRange);
            }
        }
    }

    public final void length(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        int id2 = constraintHelper.getId();
        if (this.setMax.containsKey(Integer.valueOf(id2))) {
            length length2 = this.setMax.get(Integer.valueOf(id2));
            if (constraintWidget instanceof AnyThread) {
                constraintHelper.loadParameters(length2, (AnyThread) constraintWidget, layoutParams, sparseArray);
            }
        }
    }

    public final void length(int i, ConstraintLayout.LayoutParams layoutParams) {
        if (this.setMax.containsKey(Integer.valueOf(i))) {
            this.setMax.get(Integer.valueOf(i)).setMin(layoutParams);
        }
    }

    public final void getMax(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.setMax.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id2 = childAt.getId();
            if (!this.setMax.containsKey(Integer.valueOf(id2))) {
                addContentView.setMax(childAt);
            } else if (this.getMax && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id2 != -1 && this.setMax.containsKey(Integer.valueOf(id2))) {
                hashSet.remove(Integer.valueOf(id2));
                length length2 = this.setMax.get(Integer.valueOf(id2));
                if (childAt instanceof Barrier) {
                    length2.setMin.IPostMessageService$Stub$Proxy = 1;
                }
                if (length2.setMin.IPostMessageService$Stub$Proxy != -1 && length2.setMin.IPostMessageService$Stub$Proxy == 1) {
                    Barrier barrier = (Barrier) childAt;
                    barrier.setId(id2);
                    barrier.setType(length2.setMin.ICustomTabsService$Stub);
                    barrier.setMargin(length2.setMin.ICustomTabsService$Stub$Proxy);
                    barrier.setAllowsGoneWidget(length2.setMin.ITrustedWebActivityCallback$Default);
                    if (length2.setMin.ITrustedWebActivityCallback != null) {
                        barrier.setReferencedIds(length2.setMin.ITrustedWebActivityCallback);
                    } else if (length2.setMin.onExtraCallback != null) {
                        length2.setMin.ITrustedWebActivityCallback = setMin((View) barrier, length2.setMin.onExtraCallback);
                        barrier.setReferencedIds(length2.setMin.ITrustedWebActivityCallback);
                    }
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.setMax();
                length2.setMin(layoutParams);
                ConstraintAttribute.setMin(childAt, length2.toFloatRange);
                childAt.setLayoutParams(layoutParams);
                if (length2.length.getMin == 0) {
                    childAt.setVisibility(length2.length.length);
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    childAt.setAlpha(length2.length.getMax);
                    childAt.setRotation(length2.setMax.getMin);
                    childAt.setRotationX(length2.setMax.length);
                    childAt.setRotationY(length2.setMax.setMax);
                    childAt.setScaleX(length2.setMax.getMax);
                    childAt.setScaleY(length2.setMax.toIntRange);
                    if (!Float.isNaN(length2.setMax.isInside)) {
                        childAt.setPivotX(length2.setMax.isInside);
                    }
                    if (!Float.isNaN(length2.setMax.IsOverlapping)) {
                        childAt.setPivotY(length2.setMax.IsOverlapping);
                    }
                    childAt.setTranslationX(length2.setMax.equals);
                    childAt.setTranslationY(length2.setMax.toFloatRange);
                    if (Build.VERSION.SDK_INT >= 21) {
                        childAt.setTranslationZ(length2.setMax.values);
                        if (length2.setMax.hashCode) {
                            childAt.setElevation(length2.setMax.FastBitmap$CoordinateSystem);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            length length3 = this.setMax.get(num);
            if (length3.setMin.IPostMessageService$Stub$Proxy != -1 && length3.setMin.IPostMessageService$Stub$Proxy == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                if (length3.setMin.ITrustedWebActivityCallback != null) {
                    barrier2.setReferencedIds(length3.setMin.ITrustedWebActivityCallback);
                } else if (length3.setMin.onExtraCallback != null) {
                    length3.setMin.ITrustedWebActivityCallback = setMin((View) barrier2, length3.setMin.onExtraCallback);
                    barrier2.setReferencedIds(length3.setMin.ITrustedWebActivityCallback);
                }
                barrier2.setType(length3.setMin.ICustomTabsService$Stub);
                barrier2.setMargin(length3.setMin.ICustomTabsService$Stub$Proxy);
                ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.validateParams();
                length3.setMin(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (length3.setMin.setMax) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                length3.setMin(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    public final void length(int i, int i2, int i3, int i4, int i5) {
        if (!this.setMax.containsKey(Integer.valueOf(i))) {
            this.setMax.put(Integer.valueOf(i), new length());
        }
        length length2 = this.setMax.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    length2.setMin.toIntRange = i3;
                    length2.setMin.IsOverlapping = -1;
                } else if (i4 == 2) {
                    length2.setMin.IsOverlapping = i3;
                    length2.setMin.toIntRange = -1;
                } else {
                    StringBuilder sb = new StringBuilder("Left to ");
                    sb.append(setMax(i4));
                    sb.append(" undefined");
                    throw new IllegalArgumentException(sb.toString());
                }
                length2.setMin.onMessageChannelReady = i5;
                return;
            case 2:
                if (i4 == 1) {
                    length2.setMin.equals = i3;
                    length2.setMin.FastBitmap$CoordinateSystem = -1;
                } else if (i4 == 2) {
                    length2.setMin.FastBitmap$CoordinateSystem = i3;
                    length2.setMin.equals = -1;
                } else {
                    StringBuilder sb2 = new StringBuilder("right to ");
                    sb2.append(setMax(i4));
                    sb2.append(" undefined");
                    throw new IllegalArgumentException(sb2.toString());
                }
                length2.setMin.ICustomTabsCallback$Default = i5;
                return;
            case 3:
                if (i4 == 3) {
                    length2.setMin.hashCode = i3;
                    length2.setMin.toDoubleRange = -1;
                    length2.setMin.Mean$Arithmetic = -1;
                } else if (i4 == 4) {
                    length2.setMin.toDoubleRange = i3;
                    length2.setMin.hashCode = -1;
                    length2.setMin.Mean$Arithmetic = -1;
                } else {
                    StringBuilder sb3 = new StringBuilder("right to ");
                    sb3.append(setMax(i4));
                    sb3.append(" undefined");
                    throw new IllegalArgumentException(sb3.toString());
                }
                length2.setMin.ICustomTabsCallback$Stub = i5;
                return;
            case 4:
                if (i4 == 4) {
                    length2.setMin.toString = i3;
                    length2.setMin.values = -1;
                    length2.setMin.Mean$Arithmetic = -1;
                } else if (i4 == 3) {
                    length2.setMin.values = i3;
                    length2.setMin.toString = -1;
                    length2.setMin.Mean$Arithmetic = -1;
                } else {
                    StringBuilder sb4 = new StringBuilder("right to ");
                    sb4.append(setMax(i4));
                    sb4.append(" undefined");
                    throw new IllegalArgumentException(sb4.toString());
                }
                length2.setMin.asBinder = i5;
                return;
            case 5:
                if (i4 == 5) {
                    length2.setMin.Mean$Arithmetic = i3;
                    length2.setMin.toString = -1;
                    length2.setMin.values = -1;
                    length2.setMin.hashCode = -1;
                    length2.setMin.toDoubleRange = -1;
                    return;
                }
                StringBuilder sb5 = new StringBuilder("right to ");
                sb5.append(setMax(i4));
                sb5.append(" undefined");
                throw new IllegalArgumentException(sb5.toString());
            case 6:
                if (i4 == 6) {
                    length2.setMin.invokeSuspend = i3;
                    length2.setMin.Grayscale$Algorithm = -1;
                } else if (i4 == 7) {
                    length2.setMin.Grayscale$Algorithm = i3;
                    length2.setMin.invokeSuspend = -1;
                } else {
                    StringBuilder sb6 = new StringBuilder("right to ");
                    sb6.append(setMax(i4));
                    sb6.append(" undefined");
                    throw new IllegalArgumentException(sb6.toString());
                }
                length2.setMin.onTransact = i5;
                return;
            case 7:
                if (i4 == 7) {
                    length2.setMin.valueOf = i3;
                    length2.setMin.invoke = -1;
                } else if (i4 == 6) {
                    length2.setMin.invoke = i3;
                    length2.setMin.valueOf = -1;
                } else {
                    StringBuilder sb7 = new StringBuilder("right to ");
                    sb7.append(setMax(i4));
                    sb7.append(" undefined");
                    throw new IllegalArgumentException(sb7.toString());
                }
                length2.setMin.asInterface = i5;
                return;
            default:
                StringBuilder sb8 = new StringBuilder();
                sb8.append(setMax(i2));
                sb8.append(" to ");
                sb8.append(setMax(i4));
                sb8.append(" unknown");
                throw new IllegalArgumentException(sb8.toString());
        }
    }

    public final void length(int i, int i2, int i3) {
        if (!this.setMax.containsKey(Integer.valueOf(i))) {
            this.setMax.put(Integer.valueOf(i), new length());
        }
        length length2 = this.setMax.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i3 == 1) {
                    length2.setMin.toIntRange = 0;
                    length2.setMin.IsOverlapping = -1;
                    return;
                } else if (i3 == 2) {
                    length2.setMin.IsOverlapping = 0;
                    length2.setMin.toIntRange = -1;
                    return;
                } else {
                    StringBuilder sb = new StringBuilder("left to ");
                    sb.append(setMax(i3));
                    sb.append(" undefined");
                    throw new IllegalArgumentException(sb.toString());
                }
            case 2:
                if (i3 == 1) {
                    length2.setMin.equals = 0;
                    length2.setMin.FastBitmap$CoordinateSystem = -1;
                    return;
                } else if (i3 == 2) {
                    length2.setMin.FastBitmap$CoordinateSystem = 0;
                    length2.setMin.equals = -1;
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder("right to ");
                    sb2.append(setMax(i3));
                    sb2.append(" undefined");
                    throw new IllegalArgumentException(sb2.toString());
                }
            case 3:
                if (i3 == 3) {
                    length2.setMin.hashCode = 0;
                    length2.setMin.toDoubleRange = -1;
                    length2.setMin.Mean$Arithmetic = -1;
                    return;
                } else if (i3 == 4) {
                    length2.setMin.toDoubleRange = 0;
                    length2.setMin.hashCode = -1;
                    length2.setMin.Mean$Arithmetic = -1;
                    return;
                } else {
                    StringBuilder sb3 = new StringBuilder("right to ");
                    sb3.append(setMax(i3));
                    sb3.append(" undefined");
                    throw new IllegalArgumentException(sb3.toString());
                }
            case 4:
                if (i3 == 4) {
                    length2.setMin.toString = 0;
                    length2.setMin.values = -1;
                    length2.setMin.Mean$Arithmetic = -1;
                    return;
                } else if (i3 == 3) {
                    length2.setMin.values = 0;
                    length2.setMin.toString = -1;
                    length2.setMin.Mean$Arithmetic = -1;
                    return;
                } else {
                    StringBuilder sb4 = new StringBuilder("right to ");
                    sb4.append(setMax(i3));
                    sb4.append(" undefined");
                    throw new IllegalArgumentException(sb4.toString());
                }
            case 5:
                if (i3 == 5) {
                    length2.setMin.Mean$Arithmetic = 0;
                    length2.setMin.toString = -1;
                    length2.setMin.values = -1;
                    length2.setMin.hashCode = -1;
                    length2.setMin.toDoubleRange = -1;
                    return;
                }
                StringBuilder sb5 = new StringBuilder("right to ");
                sb5.append(setMax(i3));
                sb5.append(" undefined");
                throw new IllegalArgumentException(sb5.toString());
            case 6:
                if (i3 == 6) {
                    length2.setMin.invokeSuspend = 0;
                    length2.setMin.Grayscale$Algorithm = -1;
                    return;
                } else if (i3 == 7) {
                    length2.setMin.Grayscale$Algorithm = 0;
                    length2.setMin.invokeSuspend = -1;
                    return;
                } else {
                    StringBuilder sb6 = new StringBuilder("right to ");
                    sb6.append(setMax(i3));
                    sb6.append(" undefined");
                    throw new IllegalArgumentException(sb6.toString());
                }
            case 7:
                if (i3 == 7) {
                    length2.setMin.valueOf = 0;
                    length2.setMin.invoke = -1;
                    return;
                } else if (i3 == 6) {
                    length2.setMin.invoke = 0;
                    length2.setMin.valueOf = -1;
                    return;
                } else {
                    StringBuilder sb7 = new StringBuilder("right to ");
                    sb7.append(setMax(i3));
                    sb7.append(" undefined");
                    throw new IllegalArgumentException(sb7.toString());
                }
            default:
                StringBuilder sb8 = new StringBuilder();
                sb8.append(setMax(i2));
                sb8.append(" to ");
                sb8.append(setMax(i3));
                sb8.append(" unknown");
                throw new IllegalArgumentException(sb8.toString());
        }
    }

    public final void setMax(int i, int i2) {
        if (this.setMax.containsKey(Integer.valueOf(i))) {
            length length2 = this.setMax.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    length2.setMin.IsOverlapping = -1;
                    length2.setMin.toIntRange = -1;
                    length2.setMin.onMessageChannelReady = -1;
                    length2.setMin.getDefaultImpl = -1;
                    return;
                case 2:
                    length2.setMin.FastBitmap$CoordinateSystem = -1;
                    length2.setMin.equals = -1;
                    length2.setMin.ICustomTabsCallback$Default = -1;
                    length2.setMin.getInterfaceDescriptor = -1;
                    return;
                case 3:
                    length2.setMin.toDoubleRange = -1;
                    length2.setMin.hashCode = -1;
                    length2.setMin.ICustomTabsCallback$Stub = -1;
                    length2.setMin.ICustomTabsService = -1;
                    return;
                case 4:
                    length2.setMin.values = -1;
                    length2.setMin.toString = -1;
                    length2.setMin.asBinder = -1;
                    length2.setMin.ICustomTabsCallback$Stub$Proxy = -1;
                    return;
                case 5:
                    length2.setMin.Mean$Arithmetic = -1;
                    return;
                case 6:
                    length2.setMin.Grayscale$Algorithm = -1;
                    length2.setMin.invokeSuspend = -1;
                    length2.setMin.onTransact = -1;
                    length2.setMin.extraCommand = -1;
                    return;
                case 7:
                    length2.setMin.invoke = -1;
                    length2.setMin.valueOf = -1;
                    length2.setMin.asInterface = -1;
                    length2.setMin.setDefaultImpl = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public final length length(int i) {
        if (!this.setMax.containsKey(Integer.valueOf(i))) {
            this.setMax.put(Integer.valueOf(i), new length());
        }
        return this.setMax.get(Integer.valueOf(i));
    }

    public final void getMax(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    length length2 = new length();
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, to.length.invoke);
                    setMin(length2, obtainStyledAttributes);
                    obtainStyledAttributes.recycle();
                    if (name.equalsIgnoreCase("Guideline")) {
                        length2.setMin.setMax = true;
                    }
                    this.setMax.put(Integer.valueOf(length2.getMin), length2);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0193, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x0199
            if (r0 == 0) goto L_0x0190
            java.lang.String r4 = "Constraint"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L_0x0036
            if (r0 == r5) goto L_0x0015
            goto L_0x0193
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r3.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            if (r3 == 0) goto L_0x0022
            return
        L_0x0022:
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            if (r0 == 0) goto L_0x0193
            java.util.HashMap<java.lang.Integer, o.from$length> r0 = r9.setMax     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            int r3 = r2.getMin     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r0.put(r3, r2)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r2 = r1
            goto L_0x0193
        L_0x0036:
            java.lang.String r0 = r11.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r7 = -1
            int r8 = r0.hashCode()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            switch(r8) {
                case -2025855158: goto L_0x0086;
                case -1984451626: goto L_0x007c;
                case -1269513683: goto L_0x0073;
                case -1238332596: goto L_0x0069;
                case -71750448: goto L_0x005f;
                case 1331510167: goto L_0x0055;
                case 1791837707: goto L_0x004b;
                case 1803088381: goto L_0x0043;
                default: goto L_0x0042;
            }     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
        L_0x0042:
            goto L_0x0090
        L_0x0043:
            boolean r0 = r0.equals(r4)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            if (r0 == 0) goto L_0x0090
            r5 = 0
            goto L_0x0091
        L_0x004b:
            java.lang.String r4 = "CustomAttribute"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            if (r0 == 0) goto L_0x0090
            r5 = 7
            goto L_0x0091
        L_0x0055:
            java.lang.String r4 = "Barrier"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            if (r0 == 0) goto L_0x0090
            r5 = 2
            goto L_0x0091
        L_0x005f:
            java.lang.String r4 = "Guideline"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            if (r0 == 0) goto L_0x0090
            r5 = 1
            goto L_0x0091
        L_0x0069:
            java.lang.String r4 = "Transform"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            if (r0 == 0) goto L_0x0090
            r5 = 4
            goto L_0x0091
        L_0x0073:
            java.lang.String r4 = "PropertySet"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            if (r0 == 0) goto L_0x0090
            goto L_0x0091
        L_0x007c:
            java.lang.String r4 = "Motion"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            if (r0 == 0) goto L_0x0090
            r5 = 6
            goto L_0x0091
        L_0x0086:
            java.lang.String r4 = "Layout"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            if (r0 == 0) goto L_0x0090
            r5 = 5
            goto L_0x0091
        L_0x0090:
            r5 = -1
        L_0x0091:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r5) {
                case 0: goto L_0x017a;
                case 1: goto L_0x015c;
                case 2: goto L_0x0142;
                case 3: goto L_0x0120;
                case 4: goto L_0x00fd;
                case 5: goto L_0x00da;
                case 6: goto L_0x00b7;
                case 7: goto L_0x0098;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x0193
        L_0x0098:
            if (r2 == 0) goto L_0x00a1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r2.toFloatRange     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            androidx.constraintlayout.widget.ConstraintAttribute.length(r10, r11, r0)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            goto L_0x0193
        L_0x00a1:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r1.<init>(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            int r11 = r11.getLineNumber()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r1.append(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            java.lang.String r11 = r1.toString()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r10.<init>(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            throw r10     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
        L_0x00b7:
            if (r2 == 0) goto L_0x00c4
            o.from$setMax r0 = r2.getMax     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r0.setMax(r10, r3)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            goto L_0x0193
        L_0x00c4:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r1.<init>(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            int r11 = r11.getLineNumber()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r1.append(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            java.lang.String r11 = r1.toString()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r10.<init>(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            throw r10     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
        L_0x00da:
            if (r2 == 0) goto L_0x00e7
            o.from$getMin r0 = r2.setMin     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r0.setMin(r10, r3)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            goto L_0x0193
        L_0x00e7:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r1.<init>(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            int r11 = r11.getLineNumber()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r1.append(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            java.lang.String r11 = r1.toString()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r10.<init>(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            throw r10     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
        L_0x00fd:
            if (r2 == 0) goto L_0x010a
            o.from$getMax r0 = r2.setMax     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r0.setMax(r10, r3)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            goto L_0x0193
        L_0x010a:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r1.<init>(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            int r11 = r11.getLineNumber()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r1.append(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            java.lang.String r11 = r1.toString()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r10.<init>(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            throw r10     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
        L_0x0120:
            if (r2 == 0) goto L_0x012c
            o.from$setMin r0 = r2.length     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r0.setMin(r10, r3)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            goto L_0x0193
        L_0x012c:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r1.<init>(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            int r11 = r11.getLineNumber()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r1.append(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            java.lang.String r11 = r1.toString()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r10.<init>(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            throw r10     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
        L_0x0142:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            o.from$length r2 = new o.from$length     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r2.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            int[] r4 = o.to.length.invoke     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r0, r4)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            setMin((o.from.length) r2, (android.content.res.TypedArray) r0)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r0.recycle()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            o.from$getMin r0 = r2.setMin     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r0.IPostMessageService$Stub$Proxy = r3     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            goto L_0x0193
        L_0x015c:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            o.from$length r2 = new o.from$length     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r2.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            int[] r4 = o.to.length.invoke     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r0, r4)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            setMin((o.from.length) r2, (android.content.res.TypedArray) r0)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r0.recycle()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            o.from$getMin r0 = r2.setMin     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r0.setMax = r3     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            o.from$getMin r0 = r2.setMin     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r0.length = r3     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            goto L_0x0193
        L_0x017a:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            o.from$length r2 = new o.from$length     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r2.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            int[] r3 = o.to.length.invoke     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r0, r3)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            setMin((o.from.length) r2, (android.content.res.TypedArray) r0)     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            r0.recycle()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            goto L_0x0193
        L_0x0190:
            r11.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
        L_0x0193:
            int r0 = r11.next()     // Catch:{ IOException | XmlPullParserException -> 0x0199 }
            goto L_0x0006
        L_0x0199:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.from.setMax(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    private static void setMin(length length2, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (!(index == to.length.Grayscale$Algorithm || to.length.ICustomTabsCallback$Stub$Proxy == index || to.length.getInterfaceDescriptor == index)) {
                length2.getMax.getMin = true;
                length2.setMin.length = true;
                length2.length.setMax = true;
                length2.setMax.setMin = true;
            }
            switch (isInside.get(index)) {
                case 1:
                    getMin getmin = length2.setMin;
                    int resourceId = typedArray.getResourceId(index, length2.setMin.Mean$Arithmetic);
                    if (resourceId == -1) {
                        resourceId = typedArray.getInt(index, -1);
                    }
                    getmin.Mean$Arithmetic = resourceId;
                    break;
                case 2:
                    length2.setMin.asBinder = typedArray.getDimensionPixelSize(index, length2.setMin.asBinder);
                    break;
                case 3:
                    getMin getmin2 = length2.setMin;
                    int resourceId2 = typedArray.getResourceId(index, length2.setMin.toString);
                    if (resourceId2 == -1) {
                        resourceId2 = typedArray.getInt(index, -1);
                    }
                    getmin2.toString = resourceId2;
                    break;
                case 4:
                    getMin getmin3 = length2.setMin;
                    int resourceId3 = typedArray.getResourceId(index, length2.setMin.values);
                    if (resourceId3 == -1) {
                        resourceId3 = typedArray.getInt(index, -1);
                    }
                    getmin3.values = resourceId3;
                    break;
                case 5:
                    length2.setMin.onNavigationEvent = typedArray.getString(index);
                    break;
                case 6:
                    length2.setMin.onRelationshipValidationResult = typedArray.getDimensionPixelOffset(index, length2.setMin.onRelationshipValidationResult);
                    break;
                case 7:
                    length2.setMin.extraCallback = typedArray.getDimensionPixelOffset(index, length2.setMin.extraCallback);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        length2.setMin.asInterface = typedArray.getDimensionPixelSize(index, length2.setMin.asInterface);
                        break;
                    }
                case 9:
                    getMin getmin4 = length2.setMin;
                    int resourceId4 = typedArray.getResourceId(index, length2.setMin.valueOf);
                    if (resourceId4 == -1) {
                        resourceId4 = typedArray.getInt(index, -1);
                    }
                    getmin4.valueOf = resourceId4;
                    break;
                case 10:
                    getMin getmin5 = length2.setMin;
                    int resourceId5 = typedArray.getResourceId(index, length2.setMin.invoke);
                    if (resourceId5 == -1) {
                        resourceId5 = typedArray.getInt(index, -1);
                    }
                    getmin5.invoke = resourceId5;
                    break;
                case 11:
                    length2.setMin.ICustomTabsCallback$Stub$Proxy = typedArray.getDimensionPixelSize(index, length2.setMin.ICustomTabsCallback$Stub$Proxy);
                    break;
                case 12:
                    length2.setMin.setDefaultImpl = typedArray.getDimensionPixelSize(index, length2.setMin.setDefaultImpl);
                    break;
                case 13:
                    length2.setMin.getDefaultImpl = typedArray.getDimensionPixelSize(index, length2.setMin.getDefaultImpl);
                    break;
                case 14:
                    length2.setMin.getInterfaceDescriptor = typedArray.getDimensionPixelSize(index, length2.setMin.getInterfaceDescriptor);
                    break;
                case 15:
                    length2.setMin.extraCommand = typedArray.getDimensionPixelSize(index, length2.setMin.extraCommand);
                    break;
                case 16:
                    length2.setMin.ICustomTabsService = typedArray.getDimensionPixelSize(index, length2.setMin.ICustomTabsService);
                    break;
                case 17:
                    length2.setMin.getMin = typedArray.getDimensionPixelOffset(index, length2.setMin.getMin);
                    break;
                case 18:
                    length2.setMin.isInside = typedArray.getDimensionPixelOffset(index, length2.setMin.isInside);
                    break;
                case 19:
                    length2.setMin.toFloatRange = typedArray.getFloat(index, length2.setMin.toFloatRange);
                    break;
                case 20:
                    length2.setMin.getCause = typedArray.getFloat(index, length2.setMin.getCause);
                    break;
                case 21:
                    length2.setMin.getMax = typedArray.getLayoutDimension(index, length2.setMin.getMax);
                    break;
                case 22:
                    length2.length.length = typedArray.getInt(index, length2.length.length);
                    length2.length.length = getMin[length2.length.length];
                    break;
                case 23:
                    length2.setMin.setMin = typedArray.getLayoutDimension(index, length2.setMin.setMin);
                    break;
                case 24:
                    length2.setMin.onMessageChannelReady = typedArray.getDimensionPixelSize(index, length2.setMin.onMessageChannelReady);
                    break;
                case 25:
                    getMin getmin6 = length2.setMin;
                    int resourceId6 = typedArray.getResourceId(index, length2.setMin.toIntRange);
                    if (resourceId6 == -1) {
                        resourceId6 = typedArray.getInt(index, -1);
                    }
                    getmin6.toIntRange = resourceId6;
                    break;
                case 26:
                    getMin getmin7 = length2.setMin;
                    int resourceId7 = typedArray.getResourceId(index, length2.setMin.IsOverlapping);
                    if (resourceId7 == -1) {
                        resourceId7 = typedArray.getInt(index, -1);
                    }
                    getmin7.IsOverlapping = resourceId7;
                    break;
                case 27:
                    length2.setMin.onPostMessage = typedArray.getInt(index, length2.setMin.onPostMessage);
                    break;
                case 28:
                    length2.setMin.ICustomTabsCallback$Default = typedArray.getDimensionPixelSize(index, length2.setMin.ICustomTabsCallback$Default);
                    break;
                case 29:
                    getMin getmin8 = length2.setMin;
                    int resourceId8 = typedArray.getResourceId(index, length2.setMin.equals);
                    if (resourceId8 == -1) {
                        resourceId8 = typedArray.getInt(index, -1);
                    }
                    getmin8.equals = resourceId8;
                    break;
                case 30:
                    getMin getmin9 = length2.setMin;
                    int resourceId9 = typedArray.getResourceId(index, length2.setMin.FastBitmap$CoordinateSystem);
                    if (resourceId9 == -1) {
                        resourceId9 = typedArray.getInt(index, -1);
                    }
                    getmin9.FastBitmap$CoordinateSystem = resourceId9;
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        length2.setMin.onTransact = typedArray.getDimensionPixelSize(index, length2.setMin.onTransact);
                        break;
                    }
                case 32:
                    getMin getmin10 = length2.setMin;
                    int resourceId10 = typedArray.getResourceId(index, length2.setMin.Grayscale$Algorithm);
                    if (resourceId10 == -1) {
                        resourceId10 = typedArray.getInt(index, -1);
                    }
                    getmin10.Grayscale$Algorithm = resourceId10;
                    break;
                case 33:
                    getMin getmin11 = length2.setMin;
                    int resourceId11 = typedArray.getResourceId(index, length2.setMin.invokeSuspend);
                    if (resourceId11 == -1) {
                        resourceId11 = typedArray.getInt(index, -1);
                    }
                    getmin11.invokeSuspend = resourceId11;
                    break;
                case 34:
                    length2.setMin.ICustomTabsCallback$Stub = typedArray.getDimensionPixelSize(index, length2.setMin.ICustomTabsCallback$Stub);
                    break;
                case 35:
                    getMin getmin12 = length2.setMin;
                    int resourceId12 = typedArray.getResourceId(index, length2.setMin.toDoubleRange);
                    if (resourceId12 == -1) {
                        resourceId12 = typedArray.getInt(index, -1);
                    }
                    getmin12.toDoubleRange = resourceId12;
                    break;
                case 36:
                    getMin getmin13 = length2.setMin;
                    int resourceId13 = typedArray.getResourceId(index, length2.setMin.hashCode);
                    if (resourceId13 == -1) {
                        resourceId13 = typedArray.getInt(index, -1);
                    }
                    getmin13.hashCode = resourceId13;
                    break;
                case 37:
                    length2.setMin.create = typedArray.getFloat(index, length2.setMin.create);
                    break;
                case 38:
                    length2.getMin = typedArray.getResourceId(index, length2.getMin);
                    break;
                case 39:
                    length2.setMin.newSessionWithExtras = typedArray.getFloat(index, length2.setMin.newSessionWithExtras);
                    break;
                case 40:
                    length2.setMin.newSession = typedArray.getFloat(index, length2.setMin.newSession);
                    break;
                case 41:
                    length2.setMin.mayLaunchUrl = typedArray.getInt(index, length2.setMin.mayLaunchUrl);
                    break;
                case 42:
                    length2.setMin.warmup = typedArray.getInt(index, length2.setMin.warmup);
                    break;
                case 43:
                    length2.length.getMax = typedArray.getFloat(index, length2.length.getMax);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        length2.setMax.hashCode = true;
                        length2.setMax.FastBitmap$CoordinateSystem = typedArray.getDimension(index, length2.setMax.FastBitmap$CoordinateSystem);
                        break;
                    }
                case 45:
                    length2.setMax.length = typedArray.getFloat(index, length2.setMax.length);
                    break;
                case 46:
                    length2.setMax.setMax = typedArray.getFloat(index, length2.setMax.setMax);
                    break;
                case 47:
                    length2.setMax.getMax = typedArray.getFloat(index, length2.setMax.getMax);
                    break;
                case 48:
                    length2.setMax.toIntRange = typedArray.getFloat(index, length2.setMax.toIntRange);
                    break;
                case 49:
                    length2.setMax.isInside = typedArray.getDimension(index, length2.setMax.isInside);
                    break;
                case 50:
                    length2.setMax.IsOverlapping = typedArray.getDimension(index, length2.setMax.IsOverlapping);
                    break;
                case 51:
                    length2.setMax.equals = typedArray.getDimension(index, length2.setMax.equals);
                    break;
                case 52:
                    length2.setMax.toFloatRange = typedArray.getDimension(index, length2.setMax.toFloatRange);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        length2.setMax.values = typedArray.getDimension(index, length2.setMax.values);
                        break;
                    }
                case 54:
                    length2.setMin.postMessage = typedArray.getInt(index, length2.setMin.postMessage);
                    break;
                case 55:
                    length2.setMin.validateRelationship = typedArray.getInt(index, length2.setMin.validateRelationship);
                    break;
                case 56:
                    length2.setMin.updateVisuals = typedArray.getDimensionPixelSize(index, length2.setMin.updateVisuals);
                    break;
                case 57:
                    length2.setMin.requestPostMessageChannelWithExtras = typedArray.getDimensionPixelSize(index, length2.setMin.requestPostMessageChannelWithExtras);
                    break;
                case 58:
                    length2.setMin.requestPostMessageChannel = typedArray.getDimensionPixelSize(index, length2.setMin.requestPostMessageChannel);
                    break;
                case 59:
                    length2.setMin.receiveFile = typedArray.getDimensionPixelSize(index, length2.setMin.receiveFile);
                    break;
                case 60:
                    length2.setMax.getMin = typedArray.getFloat(index, length2.setMax.getMin);
                    break;
                case 61:
                    getMin getmin14 = length2.setMin;
                    int resourceId14 = typedArray.getResourceId(index, length2.setMin.ICustomTabsCallback);
                    if (resourceId14 == -1) {
                        resourceId14 = typedArray.getInt(index, -1);
                    }
                    getmin14.ICustomTabsCallback = resourceId14;
                    break;
                case 62:
                    length2.setMin.b = typedArray.getDimensionPixelSize(index, length2.setMin.b);
                    break;
                case 63:
                    length2.setMin.extraCallbackWithResult = typedArray.getFloat(index, length2.setMin.extraCallbackWithResult);
                    break;
                case 64:
                    setMax setmax = length2.getMax;
                    int resourceId15 = typedArray.getResourceId(index, length2.getMax.length);
                    if (resourceId15 == -1) {
                        resourceId15 = typedArray.getInt(index, -1);
                    }
                    setmax.length = resourceId15;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        length2.getMax.setMin = ResultReceiver.MyResultReceiver.length[typedArray.getInteger(index, 0)];
                        break;
                    } else {
                        length2.getMax.setMin = typedArray.getString(index);
                        break;
                    }
                case 66:
                    length2.getMax.setMax = typedArray.getInt(index, 0);
                    break;
                case 67:
                    length2.getMax.IsOverlapping = typedArray.getFloat(index, length2.getMax.IsOverlapping);
                    break;
                case 68:
                    length2.length.setMin = typedArray.getFloat(index, length2.length.setMin);
                    break;
                case 69:
                    length2.setMin.IPostMessageService = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    length2.setMin.ICustomTabsService$Default = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    length2.setMin.ICustomTabsService$Stub = typedArray.getInt(index, length2.setMin.ICustomTabsService$Stub);
                    break;
                case 73:
                    length2.setMin.ICustomTabsService$Stub$Proxy = typedArray.getDimensionPixelSize(index, length2.setMin.ICustomTabsService$Stub$Proxy);
                    break;
                case 74:
                    length2.setMin.onExtraCallback = typedArray.getString(index);
                    break;
                case 75:
                    length2.setMin.ITrustedWebActivityCallback$Default = typedArray.getBoolean(index, length2.setMin.ITrustedWebActivityCallback$Default);
                    break;
                case 76:
                    length2.getMax.getMax = typedArray.getInt(index, length2.getMax.getMax);
                    break;
                case 77:
                    length2.setMin.IPostMessageService$Stub = typedArray.getString(index);
                    break;
                case 78:
                    length2.length.getMin = typedArray.getInt(index, length2.length.getMin);
                    break;
                case 79:
                    length2.getMax.isInside = typedArray.getFloat(index, length2.getMax.isInside);
                    break;
                case 80:
                    length2.setMin.IPostMessageService$Default = typedArray.getBoolean(index, length2.setMin.IPostMessageService$Default);
                    break;
                case 81:
                    length2.setMin.ITrustedWebActivityCallback$Stub = typedArray.getBoolean(index, length2.setMin.ITrustedWebActivityCallback$Stub);
                    break;
                case 82:
                    isInside.get(index);
                    break;
                default:
                    isInside.get(index);
                    break;
            }
        }
    }

    private static int[] setMin(View view, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = to.getMin.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    static /* synthetic */ int length(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }
}
