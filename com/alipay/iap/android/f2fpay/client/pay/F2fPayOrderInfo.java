package com.alipay.iap.android.f2fpay.client.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.ap.mobileprod.service.facade.uniresultpage.model.F2fPayChannelView;
import com.alipay.ap.mobileprod.service.facade.uniresultpage.model.UniResultF2fpayOrderInfo;
import java.io.Serializable;

public class F2fPayOrderInfo extends UniResultF2fpayOrderInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<F2fPayOrderInfo> CREATOR = new Parcelable.Creator<F2fPayOrderInfo>() {
        public final F2fPayOrderInfo createFromParcel(Parcel parcel) {
            return new F2fPayOrderInfo(parcel);
        }

        public final F2fPayOrderInfo[] newArray(int i) {
            return new F2fPayOrderInfo[i];
        }
    };

    public F2fPayOrderInfo() {
    }

    protected F2fPayOrderInfo(Parcel parcel) {
        this.tradeNo = parcel.readString();
        this.buyerPhoneNo = parcel.readString();
        this.buyerUserId = parcel.readString();
        this.paymentCode = parcel.readString();
        this.sellerUserId = parcel.readString();
        this.sellerName = parcel.readString();
        this.productCode = parcel.readString();
        this.tradeAmount = parcel.readString();
        this.tradeAmountCurrency = parcel.readString();
        this.state = parcel.readString();
        this.amount = parcel.readString();
        this.payAmount = parcel.readString();
        this.actualPayAmount = parcel.readString();
        this.payChannelViewList = parcel.readArrayList(F2fPayChannelView.class.getClassLoader());
        this.payAmountCurrency = parcel.readString();
        this.cashierUrl = parcel.readString();
        this.extendInfo = parcel.readString();
        this.payMethod = parcel.readString();
        this.stateReasonCode = parcel.readString();
        this.stateReasonDesc = parcel.readString();
    }

    public F2fPayOrderInfo(UniResultF2fpayOrderInfo uniResultF2fpayOrderInfo) {
        this.tradeNo = uniResultF2fpayOrderInfo.tradeNo;
        this.buyerPhoneNo = uniResultF2fpayOrderInfo.buyerPhoneNo;
        this.buyerUserId = uniResultF2fpayOrderInfo.buyerUserId;
        this.paymentCode = uniResultF2fpayOrderInfo.paymentCode;
        this.sellerUserId = uniResultF2fpayOrderInfo.sellerUserId;
        this.sellerName = uniResultF2fpayOrderInfo.sellerName;
        this.productCode = uniResultF2fpayOrderInfo.productCode;
        this.state = uniResultF2fpayOrderInfo.state;
        this.tradeAmount = uniResultF2fpayOrderInfo.tradeAmount;
        this.tradeAmountCurrency = uniResultF2fpayOrderInfo.tradeAmountCurrency;
        this.amount = uniResultF2fpayOrderInfo.amount;
        this.payAmount = uniResultF2fpayOrderInfo.payAmount;
        this.actualPayAmount = uniResultF2fpayOrderInfo.actualPayAmount;
        this.payChannelViewList = uniResultF2fpayOrderInfo.payChannelViewList;
        this.payAmountCurrency = uniResultF2fpayOrderInfo.payAmountCurrency;
        this.cashierUrl = uniResultF2fpayOrderInfo.cashierUrl;
        this.extendInfo = uniResultF2fpayOrderInfo.extendInfo;
        this.payMethod = uniResultF2fpayOrderInfo.payMethod;
        this.stateReasonCode = uniResultF2fpayOrderInfo.stateReasonCode;
        this.stateReasonDesc = uniResultF2fpayOrderInfo.stateReasonDesc;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tradeNo);
        parcel.writeString(this.buyerPhoneNo);
        parcel.writeString(this.buyerUserId);
        parcel.writeString(this.paymentCode);
        parcel.writeString(this.sellerUserId);
        parcel.writeString(this.sellerName);
        parcel.writeString(this.productCode);
        parcel.writeString(this.tradeAmount);
        parcel.writeString(this.tradeAmountCurrency);
        parcel.writeString(this.state);
        parcel.writeString(this.amount);
        parcel.writeString(this.payAmount);
        parcel.writeString(this.actualPayAmount);
        parcel.writeList(this.payChannelViewList);
        parcel.writeString(this.payAmountCurrency);
        parcel.writeString(this.cashierUrl);
        parcel.writeString(this.extendInfo);
        parcel.writeString(this.payMethod);
        parcel.writeString(this.stateReasonCode);
        parcel.writeString(this.stateReasonDesc);
    }
}
