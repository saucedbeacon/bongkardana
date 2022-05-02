package id.dana.sendmoney.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import id.dana.sendmoney.confirmation.ConfirmationType;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class ConfirmationModel implements Parcelable {
    public static final Parcelable.Creator<ConfirmationModel> CREATOR = new Parcelable.Creator<ConfirmationModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ConfirmationModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ConfirmationModel(parcel, (byte) 0);
        }
    };
    public String FastBitmap$CoordinateSystem;
    public String Grayscale$Algorithm;
    public String ICustomTabsCallback;
    public int ICustomTabsCallback$Default;
    public String ICustomTabsCallback$Stub;
    public String ICustomTabsCallback$Stub$Proxy;
    public String ICustomTabsService;
    public String ICustomTabsService$Default;
    public boolean ICustomTabsService$Stub;
    public int ICustomTabsService$Stub$Proxy;
    public String IPostMessageService;
    private String IPostMessageService$Default;
    public String IsOverlapping;
    public String Mean$Arithmetic;
    public String asBinder;
    public String asInterface;
    public String b;
    public String create;
    public String equals;
    public String extraCallback;
    public String extraCallbackWithResult;
    public int extraCommand;
    public String getCause;
    public String getDefaultImpl;
    public String getInterfaceDescriptor;
    public String getMax;
    public String getMin;
    public String hashCode;
    public String invoke;
    public String invokeSuspend;
    public boolean isInside;
    public int length;
    public String mayLaunchUrl;
    public String newSession;
    public String newSessionWithExtras;
    private boolean onExtraCallback;
    public String onMessageChannelReady;
    public CardHolderModel onNavigationEvent;
    public String onPostMessage;
    public String onRelationshipValidationResult;
    public String onTransact;
    public String postMessage;
    public ShareActivityModel receiveFile;
    public String requestPostMessageChannel;
    public WithdrawOTCModel requestPostMessageChannelWithExtras;
    public String setDefaultImpl;
    public int setMax;
    public int setMin;
    public String toDoubleRange;
    public String toFloatRange;
    public String toIntRange;
    public String toString;
    public String updateVisuals;
    public String validateRelationship;
    public String valueOf;
    public String values;
    public String warmup;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ ConfirmationModel(Parcel parcel, byte b2) {
        this(parcel);
    }

    public ConfirmationModel() {
        this.isInside = true;
        this.ICustomTabsService$Stub = true;
    }

    private ConfirmationModel(Parcel parcel) {
        boolean z = true;
        this.isInside = true;
        this.ICustomTabsService$Stub = true;
        this.getMin = parcel.readString();
        this.getMax = parcel.readString();
        this.setMin = parcel.readInt();
        this.setMax = parcel.readInt();
        this.length = parcel.readInt();
        this.IsOverlapping = parcel.readString();
        this.equals = parcel.readString();
        this.isInside = parcel.readByte() != 0;
        this.values = parcel.readString();
        this.toString = parcel.readString();
        this.hashCode = parcel.readString();
        this.FastBitmap$CoordinateSystem = parcel.readString();
        this.ICustomTabsCallback$Stub$Proxy = parcel.readString();
        this.toDoubleRange = parcel.readString();
        this.valueOf = parcel.readString();
        this.Grayscale$Algorithm = parcel.readString();
        this.invoke = parcel.readString();
        this.ICustomTabsCallback = parcel.readString();
        this.create = parcel.readString();
        this.b = parcel.readString();
        this.extraCallback = parcel.readString();
        this.onRelationshipValidationResult = parcel.readString();
        this.extraCallbackWithResult = parcel.readString();
        this.asInterface = parcel.readString();
        this.onTransact = parcel.readString();
        this.ICustomTabsCallback$Stub = parcel.readString();
        this.ICustomTabsService = parcel.readString();
        this.IPostMessageService$Default = parcel.readString();
        this.setDefaultImpl = parcel.readString();
        this.onExtraCallback = parcel.readByte() != 0;
        this.Mean$Arithmetic = parcel.readString();
        this.getInterfaceDescriptor = parcel.readString();
        this.getCause = parcel.readString();
        this.toFloatRange = parcel.readString();
        this.toIntRange = parcel.readString();
        this.asBinder = parcel.readString();
        this.onPostMessage = parcel.readString();
        this.getDefaultImpl = parcel.readString();
        this.onMessageChannelReady = parcel.readString();
        this.ICustomTabsCallback$Default = parcel.readInt();
        this.invokeSuspend = parcel.readString();
        this.warmup = parcel.readString();
        this.extraCommand = parcel.readInt();
        this.mayLaunchUrl = parcel.readString();
        this.newSessionWithExtras = parcel.readString();
        this.newSession = parcel.readString();
        this.postMessage = parcel.readString();
        this.requestPostMessageChannel = parcel.readString();
        this.requestPostMessageChannelWithExtras = (WithdrawOTCModel) parcel.readParcelable(WithdrawOTCModel.class.getClassLoader());
        this.validateRelationship = parcel.readString();
        this.updateVisuals = parcel.readString();
        this.IPostMessageService = parcel.readString();
        this.receiveFile = (ShareActivityModel) parcel.readParcelable(ShareActivityModel.class.getClassLoader());
        this.ICustomTabsService$Default = parcel.readString();
        this.ICustomTabsService$Stub$Proxy = parcel.readInt();
        this.ICustomTabsService$Stub = parcel.readByte() == 1 ? false : z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.getMin);
        parcel.writeString(this.getMax);
        parcel.writeInt(this.setMin);
        parcel.writeInt(this.setMax);
        parcel.writeInt(this.length);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.equals);
        parcel.writeByte(this.isInside ? (byte) 1 : 0);
        parcel.writeString(this.values);
        parcel.writeString(this.toString);
        parcel.writeString(this.hashCode);
        parcel.writeString(this.FastBitmap$CoordinateSystem);
        parcel.writeString(this.ICustomTabsCallback$Stub$Proxy);
        parcel.writeString(this.toDoubleRange);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.Grayscale$Algorithm);
        parcel.writeString(this.invoke);
        parcel.writeString(this.ICustomTabsCallback);
        parcel.writeString(this.create);
        parcel.writeString(this.b);
        parcel.writeString(this.extraCallback);
        parcel.writeString(this.onRelationshipValidationResult);
        parcel.writeString(this.extraCallbackWithResult);
        parcel.writeString(this.asInterface);
        parcel.writeString(this.onTransact);
        parcel.writeString(this.ICustomTabsCallback$Stub);
        parcel.writeString(this.ICustomTabsService);
        parcel.writeString(this.IPostMessageService$Default);
        parcel.writeString(this.setDefaultImpl);
        parcel.writeByte(this.onExtraCallback ? (byte) 1 : 0);
        parcel.writeString(this.Mean$Arithmetic);
        parcel.writeString(this.getInterfaceDescriptor);
        parcel.writeString(this.getCause);
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.asBinder);
        parcel.writeString(this.onPostMessage);
        parcel.writeString(this.getDefaultImpl);
        parcel.writeString(this.onMessageChannelReady);
        parcel.writeInt(this.ICustomTabsCallback$Default);
        parcel.writeString(this.invokeSuspend);
        parcel.writeString(this.warmup);
        parcel.writeInt(this.extraCommand);
        parcel.writeString(this.mayLaunchUrl);
        parcel.writeString(this.newSessionWithExtras);
        parcel.writeString(this.newSession);
        parcel.writeString(this.postMessage);
        parcel.writeString(this.requestPostMessageChannel);
        parcel.writeParcelable(this.requestPostMessageChannelWithExtras, 1);
        parcel.writeString(this.validateRelationship);
        parcel.writeString(this.updateVisuals);
        parcel.writeString(this.IPostMessageService);
        parcel.writeParcelable(this.receiveFile, 1);
        parcel.writeString(this.ICustomTabsService$Default);
        parcel.writeInt(this.ICustomTabsService$Stub$Proxy);
        parcel.writeByte(this.ICustomTabsService$Stub ? (byte) 1 : 0);
    }

    public final boolean getMax() {
        return this.isInside;
    }

    public static int setMax(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final void getMin(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(545773231, oncanceled);
            onCancelLoad.getMin(545773231, oncanceled);
        }
        this.Mean$Arithmetic = str;
    }

    public final String getMin() {
        if (ConfirmationType.Destination.OTC.equals(this.invoke)) {
            return length("Hour");
        }
        StringBuilder sb = new StringBuilder();
        String str = this.toIntRange;
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            str = str2;
        }
        sb.append(str);
        sb.append(" ");
        String str3 = this.toFloatRange;
        if (!TextUtils.isEmpty(str3)) {
            str2 = str3;
        }
        sb.append(str2);
        return sb.toString();
    }

    private String length(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.toIntRange);
        sb.append(" ");
        sb.append(str);
        String obj = sb.toString();
        if (!TextUtils.isDigitsOnly(this.toIntRange) || Integer.parseInt(this.toIntRange) <= 1) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("s");
        return sb2.toString();
    }

    public final boolean setMax() {
        ShareActivityModel shareActivityModel = this.receiveFile;
        return shareActivityModel != null && shareActivityModel.length();
    }

    public final boolean length() {
        return this.ICustomTabsService$Stub;
    }

    public final boolean setMin() {
        return !TextUtils.isEmpty(this.Grayscale$Algorithm);
    }
}
