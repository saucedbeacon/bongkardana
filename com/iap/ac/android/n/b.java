package com.iap.ac.android.n;

import com.iap.ac.android.biz.common.callback.InquireQuoteCallback;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.ForeignExchangeQuote;
import com.iap.ac.android.biz.common.model.LogResult;
import com.iap.ac.android.biz.common.model.QuoteCurrency;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.rpc.facade.MobilePaymentInquireQuoteRpcFacade;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentInquireQuoteResult;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.d.e;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ QuoteCurrency f9753a;
    public final /* synthetic */ InquireQuoteCallback b;
    public final /* synthetic */ LogResult c;
    public final /* synthetic */ long d;

    public b(QuoteCurrency quoteCurrency, InquireQuoteCallback inquireQuoteCallback, LogResult logResult, long j) {
        this.f9753a = quoteCurrency;
        this.b = inquireQuoteCallback;
        this.c = logResult;
        this.d = j;
    }

    public final void run() {
        try {
            a aVar = new a();
            QuoteCurrency quoteCurrency = this.f9753a;
            MobilePaymentInquireQuoteRequest mobilePaymentInquireQuoteRequest = new MobilePaymentInquireQuoteRequest();
            mobilePaymentInquireQuoteRequest.sellCurrency = quoteCurrency.sellCurrency;
            mobilePaymentInquireQuoteRequest.buyCurrency = quoteCurrency.buyCurrency;
            MobilePaymentInquireQuoteResult inquireQuote = ((MobilePaymentInquireQuoteRpcFacade) aVar.getFacade()).inquireQuote(mobilePaymentInquireQuoteRequest);
            if (inquireQuote != null && inquireQuote.success) {
                this.b.onResult("SUCCESS", e.a(inquireQuote));
                this.c.resultCode = "SUCCESS";
                this.c.traceId = inquireQuote.traceId;
                ACLogEvent.commonEvent("ac_inquire_quote", this.d, this.c);
            } else if (!inquireQuote.success) {
                this.b.onResult(inquireQuote.errorCode, (ForeignExchangeQuote) null);
                this.c.traceId = inquireQuote.traceId;
                this.c.resultCode = inquireQuote.errorCode;
                this.c.resultMessage = inquireQuote.errorMessage;
                ACLogEvent.commonEvent("ac_inquire_quote", this.d, this.c);
            } else {
                this.c.resultCode = ResultCode.INVALID_NETWORK;
                this.c.resultMessage = "server return null result";
                this.b.onResult(ResultCode.INVALID_NETWORK, (ForeignExchangeQuote) null);
                ACLog.e(Constants.TAG, this.c.resultMessage);
                ACLogEvent.commonEvent("ac_inquire_quote", this.d, this.c);
            }
        } catch (Throwable th) {
            LogResult logResult = this.c;
            logResult.resultCode = ResultCode.INVALID_NETWORK;
            logResult.resultMessage = "inquireQuote exception: ".concat(String.valueOf(th));
        }
    }
}
