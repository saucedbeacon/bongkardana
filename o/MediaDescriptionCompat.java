package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o.ITrustedWebActivityCallback;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class MediaDescriptionCompat extends MenuInflater {
    static final Class<?>[] getMin;
    static final Class<?>[] setMin;
    Object equals;
    Context getMax;
    final Object[] length;
    final Object[] setMax;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            getMin = r0
            setMin = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.MediaDescriptionCompat.<clinit>():void");
    }

    public MediaDescriptionCompat(Context context) {
        super(context);
        this.getMax = context;
        Object[] objArr = {context};
        this.setMax = objArr;
        this.length = objArr;
    }

    public final void inflate(@LayoutRes int i, Menu menu) {
        if (!(menu instanceof Size)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.getMax.getResources().getLayout(i);
            getMax(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    private void getMax(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        getMin getmin = new getMin(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(String.valueOf(name)));
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            getmin.setMin = 0;
                            getmin.getMax = 0;
                            getmin.getMin = 0;
                            getmin.setMax = 0;
                            getmin.length = true;
                            getmin.toIntRange = true;
                        } else if (name2.equals("item")) {
                            if (!getmin.setMax()) {
                                if (getmin.equals == null || !getmin.equals.setMax()) {
                                    getmin.setMin();
                                } else {
                                    getmin.getMin();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        getmin.length(attributeSet);
                    } else if (name3.equals("item")) {
                        getmin.setMax(attributeSet);
                    } else if (name3.equals("menu")) {
                        getMax(xmlPullParser, attributeSet, getmin.getMin());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    static Object getMax(Object obj) {
        while (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        return obj;
    }

    static class getMax implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] getMin = {MenuItem.class};
        private Object length;
        private Method setMax;

        public getMax(Object obj, String str) {
            this.length = obj;
            Class<?> cls = obj.getClass();
            try {
                this.setMax = cls.getMethod(str, getMin);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.setMax.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.setMax.invoke(this.length, new Object[]{menuItem})).booleanValue();
                }
                this.setMax.invoke(this.length, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    class getMin {
        private int FastBitmap$CoordinateSystem;
        private char Grayscale$Algorithm;
        private int ICustomTabsCallback;
        private boolean IsOverlapping;
        private int Mean$Arithmetic;
        private ColorStateList asBinder = null;
        private boolean b;
        private int create;
        setNeutralButtonIcon equals;
        private String extraCallback;
        private CharSequence extraCallbackWithResult;
        private boolean getCause;
        int getMax;
        int getMin;
        private int hashCode;
        private int invoke;
        private char invokeSuspend;
        private Menu isInside;
        boolean length;
        private String onMessageChannelReady;
        private boolean onNavigationEvent;
        private String onPostMessage;
        private CharSequence onRelationshipValidationResult;
        private PorterDuff.Mode onTransact = null;
        int setMax;
        int setMin;
        private int toDoubleRange;
        boolean toIntRange;
        private CharSequence toString;
        private int valueOf;
        private CharSequence values;

        public getMin(Menu menu) {
            this.isInside = menu;
            this.setMin = 0;
            this.getMax = 0;
            this.getMin = 0;
            this.setMax = 0;
            this.length = true;
            this.toIntRange = true;
        }

        public final void length(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = MediaDescriptionCompat.this.getMax.obtainStyledAttributes(attributeSet, ITrustedWebActivityCallback.Stub.toIntRange.getFlags);
            this.setMin = obtainStyledAttributes.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.getPlaybackState, 0);
            this.getMax = obtainStyledAttributes.getInt(ITrustedWebActivityCallback.Stub.toIntRange.adjustVolume, 0);
            this.getMin = obtainStyledAttributes.getInt(ITrustedWebActivityCallback.Stub.toIntRange.setVolumeTo, 0);
            this.setMax = obtainStyledAttributes.getInt(ITrustedWebActivityCallback.Stub.toIntRange.getMetadata, 0);
            this.length = obtainStyledAttributes.getBoolean(ITrustedWebActivityCallback.Stub.toIntRange.getQueue, true);
            this.toIntRange = obtainStyledAttributes.getBoolean(ITrustedWebActivityCallback.Stub.toIntRange.getLaunchPendingIntent, true);
            obtainStyledAttributes.recycle();
        }

        public final void setMax(AttributeSet attributeSet) {
            prepareFromUri min = prepareFromUri.setMin(MediaDescriptionCompat.this.getMax, attributeSet, ITrustedWebActivityCallback.Stub.toIntRange.getRatingType);
            this.FastBitmap$CoordinateSystem = min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.getExtras, 0);
            this.hashCode = (min.setMin.getInt(ITrustedWebActivityCallback.Stub.toIntRange.addQueueItemAt, this.getMax) & -65536) | (min.setMin.getInt(ITrustedWebActivityCallback.Stub.toIntRange.addQueueItem, this.getMin) & 65535);
            this.values = min.setMin.getText(ITrustedWebActivityCallback.Stub.toIntRange.removeQueueItem);
            this.toString = min.setMin.getText(ITrustedWebActivityCallback.Stub.toIntRange.isShuffleModeEnabledRemoved);
            this.toDoubleRange = min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.getRepeatMode, 0);
            this.Grayscale$Algorithm = setMin(min.setMin.getString(ITrustedWebActivityCallback.Stub.toIntRange.removeQueueItemAt));
            this.Mean$Arithmetic = min.setMin.getInt(ITrustedWebActivityCallback.Stub.toIntRange.playFromSearch, 4096);
            this.invokeSuspend = setMin(min.setMin.getString(ITrustedWebActivityCallback.Stub.toIntRange.prepareFromMediaId));
            this.valueOf = min.setMin.getInt(ITrustedWebActivityCallback.Stub.toIntRange.previous, 4096);
            if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.prepareFromUri)) {
                this.invoke = min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.prepareFromUri, false) ? 1 : 0;
            } else {
                this.invoke = this.setMax;
            }
            this.getCause = min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.isCaptioningEnabled, false);
            this.b = min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.getShuffleMode, this.length);
            this.onNavigationEvent = min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.getQueueTitle, this.toIntRange);
            this.ICustomTabsCallback = min.setMin.getInt(ITrustedWebActivityCallback.Stub.toIntRange.stop, -1);
            this.onPostMessage = min.setMin.getString(ITrustedWebActivityCallback.Stub.toIntRange.prepare);
            this.create = min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.prepareFromSearch, 0);
            this.extraCallback = min.setMin.getString(ITrustedWebActivityCallback.Stub.toIntRange.playFromMediaId);
            String string = min.setMin.getString(ITrustedWebActivityCallback.Stub.toIntRange.play);
            this.onMessageChannelReady = string;
            if ((string != null) && this.create == 0 && this.extraCallback == null) {
                this.equals = (setNeutralButtonIcon) length(this.onMessageChannelReady, MediaDescriptionCompat.setMin, MediaDescriptionCompat.this.length);
            } else {
                this.equals = null;
            }
            this.extraCallbackWithResult = min.setMin.getText(ITrustedWebActivityCallback.Stub.toIntRange.playFromUri);
            this.onRelationshipValidationResult = min.setMin.getText(ITrustedWebActivityCallback.Stub.toIntRange.next);
            if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.fastForward)) {
                this.onTransact = adjustVolume.setMin(min.setMin.getInt(ITrustedWebActivityCallback.Stub.toIntRange.fastForward, -1), this.onTransact);
            } else {
                this.onTransact = null;
            }
            if (min.setMin(ITrustedWebActivityCallback.Stub.toIntRange.skipToQueueItem)) {
                this.asBinder = min.length(ITrustedWebActivityCallback.Stub.toIntRange.skipToQueueItem);
            } else {
                this.asBinder = null;
            }
            min.setMin.recycle();
            this.IsOverlapping = false;
        }

        private static char setMin(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        private void getMax(MenuItem menuItem) {
            boolean z = true;
            menuItem.setChecked(this.getCause).setVisible(this.b).setEnabled(this.onNavigationEvent).setCheckable(this.invoke > 0).setTitleCondensed(this.toString).setIcon(this.toDoubleRange);
            int i = this.ICustomTabsCallback;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.onPostMessage != null) {
                if (!MediaDescriptionCompat.this.getMax.isRestricted()) {
                    MediaDescriptionCompat mediaDescriptionCompat = MediaDescriptionCompat.this;
                    if (mediaDescriptionCompat.equals == null) {
                        Object obj = mediaDescriptionCompat.getMax;
                        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
                            obj = MediaDescriptionCompat.getMax(((ContextWrapper) obj).getBaseContext());
                        }
                        mediaDescriptionCompat.equals = obj;
                    }
                    menuItem.setOnMenuItemClickListener(new getMax(mediaDescriptionCompat.equals, this.onPostMessage));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.invoke >= 2) {
                if (menuItem instanceof RatingCompat) {
                    RatingCompat ratingCompat = (RatingCompat) menuItem;
                    ratingCompat.IsOverlapping = (ratingCompat.IsOverlapping & -5) | 4;
                } else if (menuItem instanceof onPlaybackStateChanged) {
                    onPlaybackStateChanged onplaybackstatechanged = (onPlaybackStateChanged) menuItem;
                    try {
                        if (onplaybackstatechanged.length == null) {
                            onplaybackstatechanged.length = onplaybackstatechanged.setMax.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        onplaybackstatechanged.length.invoke(onplaybackstatechanged.setMax, new Object[]{Boolean.TRUE});
                    } catch (Exception unused) {
                    }
                }
            }
            String str = this.extraCallback;
            if (str != null) {
                menuItem.setActionView((View) length(str, MediaDescriptionCompat.getMin, MediaDescriptionCompat.this.setMax));
            } else {
                z = false;
            }
            int i2 = this.create;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            setNeutralButtonIcon setneutralbuttonicon = this.equals;
            if (setneutralbuttonicon != null) {
                setItems.length(menuItem, setneutralbuttonicon);
            }
            setItems.getMin(menuItem, this.extraCallbackWithResult);
            setItems.getMax(menuItem, this.onRelationshipValidationResult);
            setItems.length(menuItem, this.Grayscale$Algorithm, this.Mean$Arithmetic);
            setItems.setMax(menuItem, this.invokeSuspend, this.valueOf);
            PorterDuff.Mode mode = this.onTransact;
            if (mode != null) {
                setItems.setMax(menuItem, mode);
            }
            ColorStateList colorStateList = this.asBinder;
            if (colorStateList != null) {
                setItems.setMin(menuItem, colorStateList);
            }
        }

        public final void setMin() {
            this.IsOverlapping = true;
            getMax(this.isInside.add(this.setMin, this.FastBitmap$CoordinateSystem, this.hashCode, this.values));
        }

        public final SubMenu getMin() {
            this.IsOverlapping = true;
            SubMenu addSubMenu = this.isInside.addSubMenu(this.setMin, this.FastBitmap$CoordinateSystem, this.hashCode, this.values);
            getMax(addSubMenu.getItem());
            return addSubMenu;
        }

        public final boolean setMax() {
            return this.IsOverlapping;
        }

        private <T> T length(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, MediaDescriptionCompat.this.getMax.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
