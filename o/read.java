package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import o.INotificationSideChannel;
import o.RemoteActionCompatParcelizer;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class read extends INotificationSideChannel.Stub.Proxy {
    private boolean getMin;
    private getMin setMax;

    public boolean isStateful() {
        return true;
    }

    read() {
        this((getMin) null, (Resources) null);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int min = this.setMax.getMin(iArr);
        if (min < 0) {
            min = this.setMax.getMin(StateSet.WILD_CARD);
        }
        return setMax(min) || onStateChange;
    }

    public void setMin(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArray;
        int[] iArr = RemoteActionCompatParcelizer.getMax.ICustomTabsCallback;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        setVisible(typedArray.getBoolean(RemoteActionCompatParcelizer.getMax.getCause, true), true);
        setMax(typedArray);
        getMin(resources);
        typedArray.recycle();
        getMax(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    private void setMax(TypedArray typedArray) {
        getMin getmin = this.setMax;
        if (Build.VERSION.SDK_INT >= 21) {
            getmin.isInside |= typedArray.getChangingConfigurations();
        }
        getmin.values = typedArray.getBoolean(RemoteActionCompatParcelizer.getMax.onNavigationEvent, getmin.values);
        getmin.toDoubleRange = typedArray.getBoolean(RemoteActionCompatParcelizer.getMax.b, getmin.toDoubleRange);
        getmin.onPostMessage = typedArray.getInt(RemoteActionCompatParcelizer.getMax.extraCallbackWithResult, getmin.onPostMessage);
        getmin.extraCallback = typedArray.getInt(RemoteActionCompatParcelizer.getMax.onMessageChannelReady, getmin.extraCallback);
        getmin.extraCallbackWithResult = typedArray.getBoolean(RemoteActionCompatParcelizer.getMax.create, getmin.extraCallbackWithResult);
    }

    private void getMax(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArray;
        int next;
        getMin getmin = this.setMax;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next2 == 3) {
                    return;
                }
                if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                    int[] iArr = RemoteActionCompatParcelizer.getMax.extraCallback;
                    if (theme == null) {
                        typedArray = resources.obtainAttributes(attributeSet, iArr);
                    } else {
                        typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                    }
                    Drawable drawable = null;
                    int resourceId = typedArray.getResourceId(RemoteActionCompatParcelizer.getMax.onRelationshipValidationResult, -1);
                    if (resourceId > 0) {
                        drawable = getRepeatMode.setMin().getMax(context, resourceId);
                    }
                    typedArray.recycle();
                    int[] length = length(attributeSet);
                    if (drawable == null) {
                        do {
                            next = xmlPullParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(xmlPullParser.getPositionDescription());
                            sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                            throw new XmlPullParserException(sb.toString());
                        } else if (Build.VERSION.SDK_INT >= 21) {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                        } else {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                        }
                    }
                    getmin.getMin(length, drawable);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int[] length(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @NonNull
    public Drawable mutate() {
        if (!this.getMin && super.mutate() == this) {
            this.setMax.getMin();
            this.getMin = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: setMin */
    public getMin setMax() {
        return new getMin(this.setMax, this, (Resources) null);
    }

    static class getMin extends INotificationSideChannel.Stub.Proxy.setMin {
        int[][] getDefaultImpl;

        getMin(getMin getmin, read read, Resources resources) {
            super(getmin, read, resources);
            if (getmin != null) {
                this.getDefaultImpl = getmin.getDefaultImpl;
            } else {
                this.getDefaultImpl = new int[setMin()][];
            }
        }

        /* access modifiers changed from: package-private */
        public void getMin() {
            int[][] iArr = this.getDefaultImpl;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.getDefaultImpl;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.getDefaultImpl = iArr2;
        }

        /* access modifiers changed from: package-private */
        public int getMin(int[] iArr, Drawable drawable) {
            int min = setMin(drawable);
            this.getDefaultImpl[min] = iArr;
            return min;
        }

        /* access modifiers changed from: package-private */
        public int getMin(int[] iArr) {
            int[][] iArr2 = this.getDefaultImpl;
            int length = length();
            for (int i = 0; i < length; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @NonNull
        public Drawable newDrawable() {
            return new read(this, (Resources) null);
        }

        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new read(this, resources);
        }

        public void setMax(int i, int i2) {
            super.setMax(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.getDefaultImpl, 0, iArr, 0, i);
            this.getDefaultImpl = iArr;
        }
    }

    @RequiresApi(21)
    public void applyTheme(@NonNull Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    public void setMax(@NonNull INotificationSideChannel.Stub.Proxy.setMin setmin) {
        super.setMax(setmin);
        if (setmin instanceof getMin) {
            this.setMax = (getMin) setmin;
        }
    }

    read(getMin getmin, Resources resources) {
        setMax((INotificationSideChannel.Stub.Proxy.setMin) new getMin(getmin, this, resources));
        onStateChange(getState());
    }

    read(@Nullable getMin getmin) {
        if (getmin != null) {
            setMax((INotificationSideChannel.Stub.Proxy.setMin) getmin);
        }
    }
}
