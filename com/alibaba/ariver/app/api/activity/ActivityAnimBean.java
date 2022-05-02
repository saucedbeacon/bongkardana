package com.alibaba.ariver.app.api.activity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.AnimRes;

public class ActivityAnimBean implements Parcelable {
    public static final Parcelable.Creator<ActivityAnimBean> CREATOR = new Parcelable.Creator<ActivityAnimBean>() {
        public final ActivityAnimBean createFromParcel(Parcel parcel) {
            return new ActivityAnimBean(parcel);
        }

        public final ActivityAnimBean[] newArray(int i) {
            return new ActivityAnimBean[i];
        }
    };
    @AnimRes
    public int enter;
    @AnimRes
    public int enterFast;
    @AnimRes
    public int exit;
    @AnimRes
    public int exitFast;
    public boolean needPopAnim;
    public boolean needRestartAnim;
    @AnimRes
    public int popEnter;
    @AnimRes
    public int popExit;

    public int describeContents() {
        return 0;
    }

    public ActivityAnimBean() {
    }

    protected ActivityAnimBean(Parcel parcel) {
        this.enter = parcel.readInt();
        this.exit = parcel.readInt();
        boolean z = true;
        this.needRestartAnim = parcel.readByte() != 0;
        this.enterFast = parcel.readInt();
        this.exitFast = parcel.readInt();
        this.needPopAnim = parcel.readByte() == 0 ? false : z;
        this.popEnter = parcel.readInt();
        this.popExit = parcel.readInt();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ActivityAnimBean{enter=");
        sb.append(this.enter);
        sb.append(", exit=");
        sb.append(this.exit);
        sb.append(", needPopAnim=");
        sb.append(this.needPopAnim);
        sb.append(", popEnter=");
        sb.append(this.popEnter);
        sb.append(", popExit=");
        sb.append(this.popExit);
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enter);
        parcel.writeInt(this.exit);
        parcel.writeByte(this.needRestartAnim ? (byte) 1 : 0);
        parcel.writeInt(this.enterFast);
        parcel.writeInt(this.exitFast);
        parcel.writeByte(this.needPopAnim ? (byte) 1 : 0);
        parcel.writeInt(this.popEnter);
        parcel.writeInt(this.popExit);
    }
}
