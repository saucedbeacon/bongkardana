package com.alipay.mobile.security.bio.service.impl;

import com.alipay.bis.common.service.facade.gw.pbmodel.upload.BisUploadGwRequest;
import com.alipay.bis.common.service.facade.gw.zim.EntryStringString;
import com.alipay.bis.common.service.facade.gw.zim.MapStringString;
import com.alipay.bis.common.service.facade.gw.zim.ZimDispatchPbGwFacade;
import com.alipay.bis.common.service.facade.gw.zim.ZimValidateGwResponsePB;
import com.alipay.bis.common.service.facade.gw.zim.ZimValidatePbGwRequestPB;
import com.alipay.mobile.security.bio.constants.CodeConstants;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.service.local.rpc.BioRPCService;
import com.alipay.mobile.security.bio.service.local.rpc.IRpcException;
import com.alipay.mobile.security.bio.service.msgchannel.pb.BioUploadServiceCoreMessageChannel;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.security.zim.gw.BioUploadServiceCoreZhub;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.printConnMonitorLog;

public class BioUploadServiceCoreZhubPb extends BioUploadServiceCoreZhub<BisUploadGwRequest> {
    private BioUploadServiceCoreMessageChannel mBioUploadServiceCoreMessageChannel;

    public void setExtParams(String str, Map<String, Object> map) {
        super.setExtParams(str, map);
        ZimMessageChannel zimMessageChannel = (ZimMessageChannel) map.get(ZIMFacade.KEY_ZIM_MSG_CHANNEL);
        if (zimMessageChannel != null) {
            this.mBioUploadServiceCoreMessageChannel = new BioUploadServiceCoreMessageChannel(str, zimMessageChannel);
        }
    }

    public BioUploadResult doUpload(BisUploadGwRequest bisUploadGwRequest, boolean z) {
        BioUploadServiceCoreMessageChannel bioUploadServiceCoreMessageChannel;
        if (z && (bioUploadServiceCoreMessageChannel = this.mBioUploadServiceCoreMessageChannel) != null) {
            return bioUploadServiceCoreMessageChannel.doUpload(bisUploadGwRequest);
        }
        BioUploadResult bioUploadResult = new BioUploadResult();
        try {
            ZimDispatchPbGwFacade zimDispatchPbGwFacade = (ZimDispatchPbGwFacade) ((BioRPCService) this.mBioServiceManager.getBioService(BioRPCService.class)).getRpcProxy(ZimDispatchPbGwFacade.class);
            ZimValidatePbGwRequestPB zimValidatePbGwRequestPB = new ZimValidatePbGwRequestPB();
            zimValidatePbGwRequestPB.zimId = this.mZimId;
            zimValidatePbGwRequestPB.zimData = printConnMonitorLog.of(bisUploadGwRequest.toByteArray());
            if (this.mParams != null && !this.mParams.isEmpty()) {
                zimValidatePbGwRequestPB.bizData = new MapStringString();
                zimValidatePbGwRequestPB.bizData.entries = new ArrayList();
                Object obj = this.mParams.get(ZIMFacade.KEY_CERT_NAME);
                if (obj != null && (obj instanceof String)) {
                    EntryStringString entryStringString = new EntryStringString();
                    entryStringString.key = ZIMFacade.KEY_CERT_NAME;
                    entryStringString.value = (String) obj;
                    zimValidatePbGwRequestPB.bizData.entries.add(entryStringString);
                }
                Object obj2 = this.mParams.get(ZIMFacade.KEY_CERT_NO);
                if (obj2 != null && (obj2 instanceof String)) {
                    EntryStringString entryStringString2 = new EntryStringString();
                    entryStringString2.key = ZIMFacade.KEY_CERT_NO;
                    entryStringString2.value = (String) obj2;
                    zimValidatePbGwRequestPB.bizData.entries.add(entryStringString2);
                }
            }
            ZimValidateGwResponsePB validateStandard = zimDispatchPbGwFacade.validateStandard(zimValidatePbGwRequestPB);
            if (validateStandard == null) {
                bioUploadResult.validationRetCode = 1001;
                bioUploadResult.productRetCode = 3002;
                bioUploadResult.subCode = CodeConstants.SERVER_PARAM_ERROR;
                bioUploadResult.subMsg = CodeConstants.getMessage(CodeConstants.SERVER_PARAM_ERROR);
            } else {
                bioUploadResult.productRetCode = validateStandard.productRetCode.intValue();
                bioUploadResult.validationRetCode = validateStandard.validationRetCode.intValue();
                bioUploadResult.hasNext = validateStandard.hasNext.booleanValue();
                bioUploadResult.nextProtocol = validateStandard.nextProtocol;
                bioUploadResult.subCode = validateStandard.retCodeSub;
                bioUploadResult.subMsg = validateStandard.retMessageSub;
                if (!(validateStandard.extParams == null || validateStandard.extParams.entries == null || validateStandard.extParams.entries.isEmpty())) {
                    List<EntryStringString> list = validateStandard.extParams.entries;
                    bioUploadResult.extParams = new HashMap(list.size());
                    for (EntryStringString next : list) {
                        bioUploadResult.extParams.put(next.key, next.value);
                    }
                }
            }
        } catch (Exception e) {
            if (e instanceof IRpcException) {
                int code = ((IRpcException) e).getCode();
                if (code == 4001 || code == 5 || code == 16 || code == 2) {
                    bioUploadResult.validationRetCode = 3001;
                    bioUploadResult.productRetCode = 3002;
                    bioUploadResult.subCode = CodeConstants.NETWORK_ERROR;
                    bioUploadResult.subMsg = CodeConstants.getMessage(CodeConstants.NETWORK_ERROR);
                } else {
                    bioUploadResult.validationRetCode = 1001;
                    bioUploadResult.productRetCode = 3002;
                    bioUploadResult.subCode = CodeConstants.SERVER_PARAM_ERROR;
                    bioUploadResult.subMsg = CodeConstants.getMessage(CodeConstants.SERVER_PARAM_ERROR);
                }
            } else {
                bioUploadResult.validationRetCode = 1001;
                bioUploadResult.productRetCode = 3002;
                bioUploadResult.subCode = CodeConstants.SERVER_PARAM_ERROR;
                bioUploadResult.subMsg = CodeConstants.getMessage(CodeConstants.SERVER_PARAM_ERROR);
            }
        }
        return bioUploadResult;
    }
}
