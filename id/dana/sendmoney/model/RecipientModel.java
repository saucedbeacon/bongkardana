package id.dana.sendmoney.model;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import id.dana.domain.sendmoney.TransferScenario;
import id.dana.sendmoney.recipient.RecipientType;
import o.PhotoSelectListener;
import o.changeMenuMode;
import o.isOriginHasAppInfo;

public class RecipientModel extends PhotoSelectListener implements Parcelable {
    public static final Parcelable.Creator<RecipientModel> CREATOR = new Parcelable.Creator<RecipientModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RecipientModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new RecipientModel(parcel);
        }
    };
    public static final changeMenuMode.setMin<RecipientModel> values = new changeMenuMode.setMin<RecipientModel>() {
        @SuppressLint({"DiffUtilEquals"})
        public final /* bridge */ /* synthetic */ boolean getMax(@NonNull Object obj, @NonNull Object obj2) {
            return getMax((RecipientModel) obj, (RecipientModel) obj2);
        }

        public final /* synthetic */ boolean setMax(@NonNull Object obj, @NonNull Object obj2) {
            return length((RecipientModel) obj, (RecipientModel) obj2);
        }

        private static boolean length(@NonNull RecipientModel recipientModel, @NonNull RecipientModel recipientModel2) {
            return recipientModel.toString().equals(recipientModel2.toString());
        }

        @SuppressLint({"DiffUtilEquals"})
        private static boolean getMax(@NonNull RecipientModel recipientModel, @NonNull RecipientModel recipientModel2) {
            return recipientModel.toString().equals(recipientModel2.toString());
        }
    };
    public String Grayscale$Algorithm;
    public String ICustomTabsCallback;
    /* access modifiers changed from: private */
    public String ICustomTabsCallback$Default;
    /* access modifiers changed from: private */
    public boolean ICustomTabsCallback$Stub;
    public int Mean$Arithmetic;
    public String b;
    public String create;
    public String extraCallback;
    public boolean extraCallbackWithResult;
    public String getCause;
    public int invoke;
    public String invokeSuspend;
    public String onMessageChannelReady;
    public String onNavigationEvent;
    public String onPostMessage;
    public String onRelationshipValidationResult;
    public String onTransact;
    public String toString;
    public String valueOf;

    public int describeContents() {
        return 0;
    }

    public RecipientModel(String str) {
        this.onNavigationEvent = str;
    }

    protected RecipientModel(Parcel parcel) {
        this.toString = parcel.readString();
        this.invokeSuspend = parcel.readString();
        this.invoke = parcel.readInt();
        this.Mean$Arithmetic = parcel.readInt();
        this.Grayscale$Algorithm = parcel.readString();
        this.onNavigationEvent = parcel.readString();
        this.getMax = parcel.readString();
        this.IsOverlapping = parcel.readString();
        this.isInside = parcel.readString();
        this.ICustomTabsCallback$Default = parcel.readString();
        this.getMin = parcel.readString();
        this.setMin = parcel.readString();
        this.length = parcel.readString();
        this.toIntRange = parcel.readString();
        this.toFloatRange = parcel.readString();
        this.b = parcel.readString();
        this.valueOf = parcel.readString();
        boolean z = true;
        this.ICustomTabsCallback$Stub = parcel.readByte() != 0;
        this.getCause = parcel.readString();
        this.ICustomTabsCallback = parcel.readString();
        this.create = parcel.readString();
        this.extraCallback = parcel.readString();
        this.onPostMessage = parcel.readString();
        this.extraCallbackWithResult = parcel.readByte() != 0;
        this.onMessageChannelReady = parcel.readString();
        this.onRelationshipValidationResult = parcel.readString();
        this.toDoubleRange = parcel.readByte() != 0;
        this.onMessageChannelReady = parcel.readString();
        this.onRelationshipValidationResult = parcel.readString();
        this.FastBitmap$CoordinateSystem = parcel.readInt();
        this.onTransact = parcel.readString();
        this.hashCode = parcel.readByte() == 0 ? false : z;
    }

    public final String getMin() {
        if ("phonenumber".equals(this.b)) {
            return isOriginHasAppInfo.getClearPhoneNumber(super.getMin());
        }
        return super.getMin();
    }

    public final String getMax() {
        if (TextUtils.isEmpty(super.getMax())) {
            return "";
        }
        return super.getMax();
    }

    public final String length() {
        if (!"bank".equals(this.onNavigationEvent)) {
            return (("contact".equals(this.onNavigationEvent) || RecipientType.OTC.equals(this.onNavigationEvent) || "recentContacts".equals(this.onNavigationEvent)) && !TextUtils.isEmpty(super.length())) ? super.length() : "-";
        }
        if (!TextUtils.isEmpty(super.length())) {
            return super.length();
        }
        if (!TextUtils.isEmpty(this.length)) {
            return this.length;
        }
        return "-";
    }

    public final String equals() {
        return super.length();
    }

    public final boolean IsOverlapping() {
        return "userid".equals(this.b);
    }

    public final boolean FastBitmap$CoordinateSystem() {
        if (!TextUtils.isEmpty(super.length())) {
            return !TextUtils.isEmpty(super.length()) && super.length().equals("-");
        }
        return true;
    }

    public final boolean values() {
        return this.ICustomTabsCallback$Stub;
    }

    public final boolean toDoubleRange() {
        return this.extraCallbackWithResult;
    }

    public final String setMin() {
        return this.onMessageChannelReady;
    }

    public final void length(String str) {
        this.onMessageChannelReady = str;
    }

    public final String toIntRange() {
        return this.onRelationshipValidationResult;
    }

    public final void setMax(String str) {
        this.onRelationshipValidationResult = str;
    }

    public final String setMax() {
        return this.onTransact;
    }

    public final void getMax(String str) {
        this.onTransact = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        parcel.writeString(this.toString);
        parcel.writeString(this.invokeSuspend);
        parcel.writeInt(this.invoke);
        parcel.writeInt(this.Mean$Arithmetic);
        parcel.writeString(this.Grayscale$Algorithm);
        parcel.writeString(this.onNavigationEvent);
        if ("phonenumber".equals(this.b)) {
            str = isOriginHasAppInfo.getClearPhoneNumber(super.getMin());
        } else {
            str = super.getMin();
        }
        parcel.writeString(str);
        parcel.writeString(super.length());
        parcel.writeString(this.isInside);
        parcel.writeString(this.ICustomTabsCallback$Default);
        if (TextUtils.isEmpty(super.getMax())) {
            str2 = "";
        } else {
            str2 = super.getMax();
        }
        parcel.writeString(str2);
        parcel.writeString(this.setMin);
        parcel.writeString(this.length);
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.b);
        parcel.writeString(this.valueOf);
        parcel.writeByte(this.ICustomTabsCallback$Stub ? (byte) 1 : 0);
        parcel.writeString(this.getCause);
        parcel.writeString(this.ICustomTabsCallback);
        parcel.writeString(this.create);
        parcel.writeString(this.extraCallback);
        parcel.writeString(this.onPostMessage);
        parcel.writeByte(this.extraCallbackWithResult ? (byte) 1 : 0);
        parcel.writeString(this.onMessageChannelReady);
        parcel.writeString(this.onRelationshipValidationResult);
        parcel.writeByte(isInside() ? (byte) 1 : 0);
        parcel.writeString(this.onMessageChannelReady);
        parcel.writeString(this.onRelationshipValidationResult);
        parcel.writeInt(this.FastBitmap$CoordinateSystem);
        parcel.writeString(this.onTransact);
        parcel.writeByte(toFloatRange() ? (byte) 1 : 0);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecipientModel)) {
            return false;
        }
        RecipientModel recipientModel = (RecipientModel) obj;
        if (recipientModel.isInside == null || this.isInside == null) {
            return false;
        }
        if ("contact".equals(this.onNavigationEvent)) {
            return isOriginHasAppInfo.getClearPhoneNumber(recipientModel.isInside).equals(isOriginHasAppInfo.getClearPhoneNumber(this.isInside));
        }
        return recipientModel.isInside.equals(this.isInside);
    }

    public static String getMax(QrTransferModel qrTransferModel) {
        if (qrTransferModel.values()) {
            return TransferScenario.PROFILE_QR;
        }
        if (qrTransferModel.FastBitmap$CoordinateSystem()) {
            return TransferScenario.REQUEST_MONEY_BANK_QR;
        }
        return qrTransferModel.toIntRange() ? TransferScenario.REQUEST_MONEY : "";
    }

    public static class length {
        public String FastBitmap$CoordinateSystem;
        public String Grayscale$Algorithm;
        public String ICustomTabsCallback;
        public String IsOverlapping;
        public String Mean$Arithmetic;
        public int b;
        public boolean create;
        public String equals;
        private int extraCallback;
        private String extraCallbackWithResult;
        public String getCause;
        public boolean getMax;
        public String getMin;
        public String hashCode;
        public String invoke;
        public boolean invokeSuspend;
        public String isInside;
        public String length;
        private String onMessageChannelReady;
        public boolean onNavigationEvent;
        private int onPostMessage;
        private String onRelationshipValidationResult;
        public String setMax;
        public String setMin;
        public String toDoubleRange;
        public String toFloatRange;
        public String toIntRange;
        public String toString;
        public String valueOf;
        public String values;

        public length(String str) {
            this.onRelationshipValidationResult = str;
        }

        public final RecipientModel length() {
            RecipientModel recipientModel = new RecipientModel(this.onRelationshipValidationResult);
            String unused = recipientModel.toString = this.setMin;
            String unused2 = recipientModel.invokeSuspend = this.setMax;
            int unused3 = recipientModel.invoke = this.extraCallback;
            int unused4 = recipientModel.Mean$Arithmetic = this.onPostMessage;
            String unused5 = recipientModel.Grayscale$Algorithm = this.onMessageChannelReady;
            recipientModel.getMax = this.toFloatRange;
            recipientModel.IsOverlapping = this.isInside;
            recipientModel.isInside = this.toIntRange;
            recipientModel.getMin = this.IsOverlapping;
            String unused6 = recipientModel.ICustomTabsCallback$Default = this.Mean$Arithmetic;
            recipientModel.setMin = this.getMin;
            recipientModel.toIntRange = this.values;
            recipientModel.toFloatRange = this.toDoubleRange;
            recipientModel.length = this.equals;
            String unused7 = recipientModel.b = this.FastBitmap$CoordinateSystem;
            String unused8 = recipientModel.valueOf = this.length;
            boolean unused9 = recipientModel.ICustomTabsCallback$Stub = this.getMax;
            String unused10 = recipientModel.getCause = this.hashCode;
            String unused11 = recipientModel.ICustomTabsCallback = this.toString;
            String unused12 = recipientModel.create = this.extraCallbackWithResult;
            String unused13 = recipientModel.extraCallback = this.valueOf;
            String unused14 = recipientModel.onPostMessage = this.Grayscale$Algorithm;
            boolean unused15 = recipientModel.extraCallbackWithResult = this.invokeSuspend;
            recipientModel.onMessageChannelReady = this.invoke;
            recipientModel.onRelationshipValidationResult = this.getCause;
            recipientModel.toDoubleRange = this.create;
            String unused16 = recipientModel.onMessageChannelReady = this.invoke;
            String unused17 = recipientModel.onRelationshipValidationResult = this.getCause;
            recipientModel.FastBitmap$CoordinateSystem = this.b;
            recipientModel.hashCode = this.onNavigationEvent;
            String unused18 = recipientModel.onTransact = this.ICustomTabsCallback;
            return recipientModel;
        }
    }
}
