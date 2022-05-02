package com.zoloz.android.phone.zdoc.upload;

import android.content.Context;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.utils.FileUtil;
import com.alipay.mobile.security.faceauth.UserVerifyInfo;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.zoloz.toyger.upload.UploadContent;
import com.zoloz.android.phone.zdoc.module.ZdocRemoteConfig;
import java.lang.reflect.Constructor;

public class UploadManager {
    private BioAppDescription mBioAppDescription = null;
    private int mBioType;
    private String mBisToken;
    private Context mContext;
    private String mPublicKey = null;
    private int mRetryTimes = 0;
    private UploadChannel mUploadChannel;
    private UserVerifyInfo mUserVerfyInfo = null;
    private ZdocRemoteConfig mZdocRemoteConfig = null;

    public void setRetryTimes(int i) {
        this.mRetryTimes = i;
    }

    public UploadManager(Context context, BioAppDescription bioAppDescription, ZdocRemoteConfig zdocRemoteConfig) {
        this.mContext = context;
        this.mBioAppDescription = bioAppDescription;
        this.mZdocRemoteConfig = zdocRemoteConfig;
    }

    public String getmPublicKey() {
        return this.mPublicKey;
    }

    public void upload(byte[] bArr, byte[] bArr2, boolean z) {
        this.mUploadChannel.uploadPaperInfo(new UploadContent(bArr, bArr2, z), this.mBisToken, this.mPublicKey);
    }

    public String getPublicKey() {
        String str;
        String str2 = "";
        if (this.mZdocRemoteConfig.getEnv() == 0) {
            try {
                str = this.mBioAppDescription.getExtProperty().get(ZIMFacade.KEY_PUBLIC_KEY_PROD);
                if (str == null) {
                    try {
                        return new String(FileUtil.getAssetsData(this.mContext, "bid-log-key-public.key"));
                    } catch (IllegalArgumentException | IllegalStateException unused) {
                        str2 = str;
                    }
                }
            } catch (IllegalArgumentException | IllegalStateException unused2) {
                return str2;
            }
        } else {
            String str3 = this.mBioAppDescription.getExtProperty().get(ZIMFacade.KEY_PUBLIC_KEY_TEST);
            if (str3 == null) {
                try {
                    str = new String(FileUtil.getAssetsData(this.mContext, "bid-log-key-public_t.key"));
                } catch (IllegalArgumentException | IllegalStateException unused3) {
                    str2 = str3;
                    return str2;
                }
            } else {
                str = str3;
            }
        }
        return str;
    }

    public void init() {
        initUserVerifyInfo();
        this.mBisToken = this.mUserVerfyInfo.bistoken;
        this.mBioType = this.mBioAppDescription.getBioType();
        BioServiceManager currentInstance = BioServiceManager.getCurrentInstance();
        this.mPublicKey = getPublicKey();
        try {
            Constructor<?> constructor = Class.forName("com.zoloz.android.phone.zdoc.upload.UploadChannelByPB").getConstructor(new Class[]{BioServiceManager.class});
            constructor.setAccessible(true);
            this.mUploadChannel = (UploadChannel) constructor.newInstance(new Object[]{currentInstance});
        } catch (Throwable unused) {
        }
    }

    private void initUserVerifyInfo() {
        UserVerifyInfo userVerifyInfo = new UserVerifyInfo();
        this.mUserVerfyInfo = userVerifyInfo;
        String str = "";
        userVerifyInfo.apdid = this.mBioAppDescription.getExtProperty().get("APDID") != null ? this.mBioAppDescription.getExtProperty().get("APDID") : str;
        this.mUserVerfyInfo.appid = this.mBioAppDescription.getExtProperty().get("appid") != null ? this.mBioAppDescription.getExtProperty().get("appid") : str;
        this.mUserVerfyInfo.behid = this.mBioAppDescription.getTag();
        this.mUserVerfyInfo.sceid = this.mBioAppDescription.getExtProperty().get("SCENE_ID") != null ? this.mBioAppDescription.getExtProperty().get("SCENE_ID") : str;
        this.mUserVerfyInfo.bistoken = this.mBioAppDescription.getBistoken();
        this.mUserVerfyInfo.userid = this.mBioAppDescription.getExtProperty().get("userid") != null ? this.mBioAppDescription.getExtProperty().get("userid") : str;
        this.mUserVerfyInfo.vtoken = this.mBioAppDescription.getExtProperty().get("TOKEN_ID") != null ? this.mBioAppDescription.getExtProperty().get("TOKEN_ID") : str;
        UserVerifyInfo userVerifyInfo2 = this.mUserVerfyInfo;
        if (this.mBioAppDescription.getExtProperty().get(BioDetector.EXT_KEY_VERIFYID) != null) {
            str = this.mBioAppDescription.getExtProperty().get(BioDetector.EXT_KEY_VERIFYID);
        }
        userVerifyInfo2.verifyid = str;
    }

    public void uploadNineShoot(byte[] bArr, byte[] bArr2, boolean z) {
        this.mUploadChannel.uploadNineShoot(new UploadContent(bArr, bArr2, z), this.mBisToken, this.mPublicKey);
    }
}
