package com.alipay.mobile.security.bio.workspace;

import android.content.Context;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.biometrics.common.proguard.INotProguard;
import com.alipay.bis.common.service.facade.gw.pbmodel.common.ClientConfigContentPB;
import com.alipay.mobile.security.bio.api.BioParameter;
import com.alipay.mobile.security.bio.common.statistics.RecordExtAction;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.utils.StringUtil;
import java.io.IOException;
import java.util.HashMap;
import o.isRunning;

public class PbBioParameterToBioApp extends BaseBioParameterToBioApp implements INotProguard {
    public PbBioParameterToBioApp(Context context, BioTransfer bioTransfer) {
        super(context, bioTransfer);
    }

    public BioAppDescription toBioApp(BioParameter bioParameter) {
        ClientConfigContentPB clientConfigContentPB;
        ProtocolConfig protocolConfig;
        if (bioParameter != null) {
            String protocol = bioParameter.getProtocol();
            try {
                String handleFcProtocolByPB = handleFcProtocolByPB(protocol);
                if (!StringUtil.isNullorEmpty(handleFcProtocolByPB)) {
                    try {
                        this.bioTransfer.mIDFaceParam = bioParameter;
                        this.bioTransfer.isIDFaceFlag = true;
                    } catch (Exception unused) {
                    }
                    protocol = handleFcProtocolByPB;
                }
            } catch (Exception unused2) {
            }
            BioAppDescription bioAppDescription = new BioAppDescription();
            bioAppDescription.setTag(getUniqueTag());
            bioAppDescription.setRemoteURL(bioParameter.getRemoteURL());
            bioAppDescription.setHeadImageURL(bioParameter.getHeadImageUrl());
            if (!StringUtil.isNullorEmpty(protocol)) {
                try {
                    if (this.bioTransfer.isIDFaceFlag) {
                        clientConfigContentPB = fcCardToClientConfigContentPB(protocol);
                    } else {
                        clientConfigContentPB = toClientConfigContentPB(protocol);
                    }
                    if (clientConfigContentPB != null) {
                        String str = clientConfigContentPB.androidcfg;
                        if (StringUtil.isNullorEmpty(str)) {
                            protocolConfig = new ProtocolConfig();
                        } else {
                            protocolConfig = (ProtocolConfig) JSON.parseObject(str, ProtocolConfig.class);
                        }
                        bioAppDescription.setBioType(clientConfigContentPB.type.intValue());
                        if (!str.contains("\"ui\":992")) {
                            bioAppDescription.setBioAction(clientConfigContentPB.sampleMode.intValue());
                            if (clientConfigContentPB.type.intValue() != 100 || protocolConfig == null) {
                                if (clientConfigContentPB.type.intValue() == 201 && protocolConfig != null && protocolConfig.getUi() == 991) {
                                    if (clientConfigContentPB.sampleMode.intValue() == 300) {
                                        bioAppDescription.setBioAction(991);
                                    } else if (clientConfigContentPB.sampleMode.intValue() == 301) {
                                        bioAppDescription.setBioAction(992);
                                    }
                                }
                            } else if (protocolConfig.getUi() == 0) {
                                if (protocolConfig.getNavigatepage() != null && protocolConfig.getNavigatepage().isEnable()) {
                                    if (clientConfigContentPB.sampleMode.intValue() == 302) {
                                        bioAppDescription.setBioAction(-302);
                                    } else if (clientConfigContentPB.sampleMode.intValue() == 303) {
                                        bioAppDescription.setBioAction(-303);
                                    }
                                }
                            } else if (protocolConfig.getUi() == 991) {
                                if (clientConfigContentPB.sampleMode.intValue() == 302) {
                                    bioAppDescription.setBioAction(991);
                                } else if (clientConfigContentPB.sampleMode.intValue() == 303) {
                                    bioAppDescription.setBioAction(992);
                                }
                            } else if (protocolConfig.getUi() == 1) {
                                if (clientConfigContentPB.sampleMode.intValue() == 302) {
                                    bioAppDescription.setBioAction(993);
                                } else if (clientConfigContentPB.sampleMode.intValue() == 303) {
                                    bioAppDescription.setBioAction(994);
                                }
                            }
                        }
                        bioAppDescription.setCfg(str);
                        bioAppDescription.setBistoken(clientConfigContentPB.token);
                        bioAppDescription.setFcSpecialData(this.bioTransfer.mFcSpecialData);
                        bioAppDescription.setSigned(true);
                        bioAppDescription.setAutoClose(bioParameter.isAutoClose());
                        bioAppDescription.setBundle(bioParameter.getBundle());
                        for (String next : bioParameter.getExtProperty().keySet()) {
                            bioAppDescription.addExtProperty(next, bioParameter.getExtProperty().get(next));
                        }
                    }
                } catch (JSONException | Exception | IllegalArgumentException | IllegalStateException unused3) {
                }
            }
            return bioAppDescription;
        }
        throw new BioIllegalArgumentException();
    }

    private String handleFcProtocolByPB(String str) {
        JSONObject parseObject;
        ClientConfigContentPB clientConfigContentPB = toClientConfigContentPB(str);
        if (clientConfigContentPB == null || clientConfigContentPB.type.intValue() != 200 || (parseObject = JSONObject.parseObject(clientConfigContentPB.androidcfg)) == null) {
            return "";
        }
        if (this.bioTransfer.fcStep == 0) {
            HashMap hashMap = new HashMap();
            this.bioTransfer.fcToken = clientConfigContentPB.token;
            hashMap.put("fcToken", this.bioTransfer.fcToken);
            this.bioTransfer.mRecordExtService.write(RecordExtAction.RECORD_FC_ENTRY_SDK, hashMap);
            hashMap.put("params", str);
            this.bioTransfer.mRecordExtService.write(RecordExtAction.RECORD_FC_GET_PARAM, hashMap);
            return parseIDProtocol(parseObject, true);
        } else if (this.bioTransfer.fcStep == 1) {
            return parseFaceProtocol(parseObject, true);
        } else {
            return "";
        }
    }

    private ClientConfigContentPB toClientConfigContentPB(String str) {
        byte[] decode;
        ClientConfigContentPB clientConfigContentPB;
        if (str == null || (decode = Base64.decode(str, 8)) == null) {
            return null;
        }
        try {
            clientConfigContentPB = (ClientConfigContentPB) new isRunning((Class<?>[]) new Class[0]).parseFrom(decode, ClientConfigContentPB.class);
        } catch (IOException unused) {
            clientConfigContentPB = null;
        }
        if (clientConfigContentPB == null) {
            return null;
        }
        return clientConfigContentPB;
    }

    private ClientConfigContentPB fcCardToClientConfigContentPB(String str) {
        byte[] decode;
        if (str == null || (decode = Base64.decode(str, 8)) == null) {
            return null;
        }
        try {
            return (ClientConfigContentPB) new isRunning((Class<?>[]) new Class[0]).parseFrom(decode, ClientConfigContentPB.class);
        } catch (IOException unused) {
            return null;
        }
    }
}
