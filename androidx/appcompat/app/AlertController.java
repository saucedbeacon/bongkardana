package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import o.ITrustedWebActivityCallback;
import o.notifyNotificationWithChannel;

public final class AlertController {
    public int FastBitmap$CoordinateSystem;
    public CharSequence Grayscale$Algorithm;
    public Button ICustomTabsCallback;
    public ListAdapter ICustomTabsCallback$Default;
    public int ICustomTabsCallback$Stub = -1;
    public int ICustomTabsCallback$Stub$Proxy;
    public int ICustomTabsService;
    public View IsOverlapping;
    Message Mean$Arithmetic;
    public TextView asBinder;
    public View asInterface;
    Message b;
    public CharSequence create;
    public CharSequence equals;
    public Drawable extraCallback;
    public ImageView extraCallbackWithResult;
    Handler extraCommand;
    Message getCause;
    public int getDefaultImpl;
    public int getInterfaceDescriptor;
    public final Window getMax;
    public final Context getMin;
    public Button hashCode;
    public Drawable invoke;
    public Button invokeSuspend;
    public int isInside;
    public final int length;
    public boolean mayLaunchUrl;
    public int newSession;
    public int newSessionWithExtras = 0;
    public int onMessageChannelReady = 0;
    public Drawable onNavigationEvent;
    public NestedScrollView onPostMessage;
    public Drawable onRelationshipValidationResult;
    public TextView onTransact;
    public int setDefaultImpl;
    public CharSequence setMax;
    public final notifyNotificationWithChannel setMin;
    public int toDoubleRange;
    public ListView toFloatRange;
    public int toIntRange;
    public boolean toString = false;
    public CharSequence valueOf;
    public int values;
    public final View.OnClickListener warmup = new View.OnClickListener() {
        public final void onClick(View view) {
            Message message;
            if (view == AlertController.this.hashCode && AlertController.this.Mean$Arithmetic != null) {
                message = Message.obtain(AlertController.this.Mean$Arithmetic);
            } else if (view != AlertController.this.invokeSuspend || AlertController.this.getCause == null) {
                message = (view != AlertController.this.ICustomTabsCallback || AlertController.this.b == null) ? null : Message.obtain(AlertController.this.b);
            } else {
                message = Message.obtain(AlertController.this.getCause);
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController.this.extraCommand.obtainMessage(1, AlertController.this.setMin).sendToTarget();
        }
    };

    static final class setMax extends Handler {
        private WeakReference<DialogInterface> getMin;

        public setMax(DialogInterface dialogInterface) {
            this.getMin = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.getMin.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static boolean getMax(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(ITrustedWebActivityCallback.Stub.getMin.toString, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    public AlertController(Context context, notifyNotificationWithChannel notifynotificationwithchannel, Window window) {
        this.getMin = context;
        this.setMin = notifynotificationwithchannel;
        this.getMax = window;
        this.extraCommand = new setMax(notifynotificationwithchannel);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, ITrustedWebActivityCallback.Stub.toIntRange.onTransact, ITrustedWebActivityCallback.Stub.getMin.values, 0);
        this.setDefaultImpl = obtainStyledAttributes.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.ICustomTabsCallback$Default, 0);
        this.ICustomTabsService = obtainStyledAttributes.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.getDefaultImpl, 0);
        this.getInterfaceDescriptor = obtainStyledAttributes.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.ICustomTabsService, 0);
        this.ICustomTabsCallback$Stub$Proxy = obtainStyledAttributes.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.setDefaultImpl, 0);
        this.getDefaultImpl = obtainStyledAttributes.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.extraCommand, 0);
        this.newSession = obtainStyledAttributes.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.getInterfaceDescriptor, 0);
        this.mayLaunchUrl = obtainStyledAttributes.getBoolean(ITrustedWebActivityCallback.Stub.toIntRange.newSessionWithExtras, true);
        this.length = obtainStyledAttributes.getDimensionPixelSize(ITrustedWebActivityCallback.Stub.toIntRange.ICustomTabsCallback$Stub$Proxy, 0);
        obtainStyledAttributes.recycle();
        notifynotificationwithchannel.supportRequestWindowFeature(1);
    }

    public static boolean setMax(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (setMax(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public final void length(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (onClickListener != null) {
            message = this.extraCommand.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.create = charSequence;
            this.b = message;
            this.onRelationshipValidationResult = drawable;
        } else if (i == -2) {
            this.valueOf = charSequence;
            this.getCause = message;
            this.onNavigationEvent = drawable;
        } else if (i == -1) {
            this.Grayscale$Algorithm = charSequence;
            this.Mean$Arithmetic = message;
            this.invoke = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public final void setMax(int i) {
        this.extraCallback = null;
        this.onMessageChannelReady = i;
        ImageView imageView = this.extraCallbackWithResult;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.extraCallbackWithResult.setImageResource(this.onMessageChannelReady);
            return;
        }
        imageView.setVisibility(8);
    }

    public final boolean setMax(KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.onPostMessage;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    public final boolean length(KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.onPostMessage;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    @Nullable
    public static ViewGroup setMax(@Nullable View view, @Nullable View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    static void length(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    public static class RecycleListView extends ListView {
        private final int getMax;
        private final int length;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ITrustedWebActivityCallback.Stub.toIntRange.IMediaSession$Stub);
            this.length = obtainStyledAttributes.getDimensionPixelOffset(ITrustedWebActivityCallback.Stub.toIntRange.sendCustomAction, -1);
            this.getMax = obtainStyledAttributes.getDimensionPixelOffset(ITrustedWebActivityCallback.Stub.toIntRange.MediaControllerCompat$MediaControllerImplApi21$ExtraCallback, -1);
        }

        public void setHasDecor(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.getMax, getPaddingRight(), z2 ? getPaddingBottom() : this.length);
            }
        }
    }

    public static class length {
        public Drawable FastBitmap$CoordinateSystem;
        public DialogInterface.OnClickListener Grayscale$Algorithm;
        public ListAdapter ICustomTabsCallback;
        public boolean ICustomTabsCallback$Default = false;
        public boolean ICustomTabsCallback$Stub;
        public String ICustomTabsCallback$Stub$Proxy;
        public Cursor ICustomTabsService;
        public CharSequence IsOverlapping;
        public Drawable Mean$Arithmetic;
        public boolean asBinder;
        public int asInterface = -1;
        public CharSequence[] b;
        public int create;
        public CharSequence equals;
        public int extraCallback;
        public int extraCallbackWithResult;
        public DialogInterface.OnKeyListener getCause;
        public boolean getDefaultImpl;
        public DialogInterface.OnMultiChoiceClickListener getInterfaceDescriptor;
        public Drawable getMax;
        public final Context getMin;
        public DialogInterface.OnClickListener hashCode;
        public boolean invoke;
        public DialogInterface.OnCancelListener invokeSuspend;
        public Drawable isInside;
        public final LayoutInflater length;
        public AdapterView.OnItemSelectedListener mayLaunchUrl;
        public int onMessageChannelReady;
        public DialogInterface.OnClickListener onNavigationEvent;
        public View onPostMessage;
        public int onRelationshipValidationResult;
        public boolean[] onTransact;
        public String setDefaultImpl;
        public int setMax = 0;
        public int setMin = 0;
        public CharSequence toDoubleRange;
        public CharSequence toFloatRange;
        public View toIntRange;
        public CharSequence toString;
        public DialogInterface.OnDismissListener valueOf;
        public DialogInterface.OnClickListener values;
        public boolean warmup = true;

        public length(Context context) {
            this.getMin = context;
            this.invoke = true;
            this.length = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    public static class getMin extends ArrayAdapter<CharSequence> {
        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }

        public getMin(Context context, int i, CharSequence[] charSequenceArr) {
            super(context, i, 16908308, charSequenceArr);
        }
    }
}
