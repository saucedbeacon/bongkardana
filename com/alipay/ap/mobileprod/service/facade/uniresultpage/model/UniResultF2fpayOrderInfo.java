package com.alipay.ap.mobileprod.service.facade.uniresultpage.model;

import java.io.Serializable;
import java.util.List;

public class UniResultF2fpayOrderInfo implements Serializable {
    public String actualPayAmount;
    public String amount;
    public String buyerPhoneNo;
    public String buyerUserId;
    public String cashierUrl;
    public String extendInfo;
    public String payAmount;
    public String payAmountCurrency;
    public List<F2fPayChannelView> payChannelViewList;
    public String payMethod;
    public String paymentCode;
    public String productCode;
    public String sellerName;
    public String sellerUserId;
    public String state;
    public String stateReasonCode;
    public String stateReasonDesc;
    public String tradeAmount;
    public String tradeAmountCurrency;
    public String tradeNo;
}
