package com.alipay.mobile.security.zim.gw;

import android.os.Handler;
import android.util.Base64;
import com.alipay.biometrics.common.proguard.INotProguard;
import com.alipay.bis.common.service.facade.gw.zim.EntryStringString;
import com.alipay.bis.common.service.facade.gw.zim.ZimDispatchPbGwFacade;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwRequest;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwRequestPB;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponsePB;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.local.rpc.BioRPCService;
import com.alipay.mobile.security.bio.service.local.rpc.IRpcException;
import java.io.IOException;
import java.util.HashMap;
import o.isRunning;

public class PbGwService extends BaseGwService implements INotProguard {
    public PbGwService(GwListener gwListener) {
        super(gwListener, "zim-pb-upload");
        this.mHandlerThread.start();
        this.mHandler = new Handler(this.mHandlerThread.getLooper());
    }

    public void init(final ZimInitGwRequest zimInitGwRequest) {
        this.mHandler.post(new Runnable() {
            public void run() {
                ZimInitGwRequestPB zimInitGwRequestPB = new ZimInitGwRequestPB();
                zimInitGwRequestPB.zimId = zimInitGwRequest.zimId;
                zimInitGwRequestPB.metaInfo = zimInitGwRequest.metaInfo;
                final ZimInitGwResponse zimInitGwResponse = new ZimInitGwResponse();
                try {
                    PbGwService.this.convert(((ZimDispatchPbGwFacade) ((BioRPCService) BioServiceManager.getCurrentInstance().getBioService(BioRPCService.class)).getRpcProxy(ZimDispatchPbGwFacade.class)).initStandard(zimInitGwRequestPB), zimInitGwResponse);
                } catch (Throwable th) {
                    if (th instanceof IRpcException) {
                        zimInitGwResponse.retCode = 2002;
                    } else {
                        zimInitGwResponse.retCode = 1001;
                    }
                }
                if (PbGwService.this.mMainHandler != null) {
                    PbGwService.this.mMainHandler.post(new Runnable() {
                        public void run() {
                            if (PbGwService.this.mGwListener != null) {
                                PbGwService.this.mGwListener.onInit(zimInitGwResponse);
                            }
                        }
                    });
                }
            }
        });
    }

    public void convert(ZimInitGwResponsePB zimInitGwResponsePB, ZimInitGwResponse zimInitGwResponse) {
        if (zimInitGwResponsePB != null) {
            try {
                zimInitGwResponse.zimId = zimInitGwResponsePB.zimId;
                zimInitGwResponse.retCode = zimInitGwResponsePB.retCode.intValue();
                zimInitGwResponse.protocol = zimInitGwResponsePB.protocol;
                zimInitGwResponse.message = zimInitGwResponsePB.message;
                zimInitGwResponse.retCodeSub = zimInitGwResponsePB.retCodeSub;
                zimInitGwResponse.retMessageSub = zimInitGwResponsePB.retMessageSub;
                zimInitGwResponse.extParams = new HashMap();
                if (zimInitGwResponsePB.extParams != null && zimInitGwResponsePB.extParams.entries != null) {
                    for (EntryStringString next : zimInitGwResponsePB.extParams.entries) {
                        zimInitGwResponse.extParams.put(next.key, next.value);
                    }
                    return;
                }
                return;
            } catch (Throwable unused) {
            }
        }
        zimInitGwResponse.retCode = 1001;
    }

    public ZimInitGwResponse convert(String str) {
        ZimInitGwResponse zimInitGwResponse = new ZimInitGwResponse();
        try {
            convert((ZimInitGwResponsePB) new isRunning((Class<?>[]) new Class[0]).parseFrom(Base64.decode(str.getBytes(), 10), ZimInitGwResponsePB.class), zimInitGwResponse);
        } catch (IOException unused) {
            zimInitGwResponse.retCode = 1001;
        }
        return zimInitGwResponse;
    }
}
