package com.alipay.mobile.verifyidentity.base.message;

public class RequestConstants {
    public static final String ALERT = "ALERT";
    public static final String BIC = "BIC";
    public static final String BUILD_MENU = "BUILD_MENU";
    public static final String CLOSE_PREPARE = "CLOSE_PREPARE";
    public static final String CLOSE_SUBMIT = "CLOSE_SUBMIT";
    public static int HOST_CHANNEL = 0;
    public static final String INIT = "INIT";
    public static final String KEY_APPSOURCE = "appSource";
    public static final String KEY_DATA = "data";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_ENCRYPT_PWD = "encryptPwd";
    public static final String KEY_KYC = "kyc";
    public static final String KEY_MODULE = "module";
    public static final String KEY_MULTIPLE_ANSWER = "multipleAnswer";
    public static final String KEY_PREDATA = "predata";
    public static final String KEY_PRODUCTCODE = "productCode";
    public static final String KEY_QUESTION = "question";
    public static final String KEY_QUESTION_ANSWER_VIEWS = "privacyQuestionAnswerViews";
    public static final String KEY_QUESTION_ID = "questionId";
    public static final String KEY_RENDER_DATA = "renderData";
    public static final String KEY_STATUS = "status";
    public static final int KEY_STATUS_NOT_SUPPORT = 2;
    public static final int KEY_STATUS_TO_CLOSE = 1;
    public static final int KEY_STATUS_TO_OPEN = 0;
    public static final String KEY_USER_ANSWER = "userAnswer";
    public static final String MENU = "MENU";
    public static final String OTP_SMS = "OTP_SMS";
    public static final String PASSCODE = "PASSCODE";
    public static final String PASSWORD = "PASSWORD";
    public static final String QUERY_BIO_STATUS = "QUERY_BIO_STATUS";
    public static final String REGISTER_BIO_PREPARE = "REGISTER_BIO_PREPARE";
    public static final String REGISTER_BIO_SUBMIT = "REGISTER_BIO_SUBMIT";
    public static final String SecVIActionProductManage = "prodmng";
    public static final String SecVIKeyAction = "action";
    public static final String SecVIKeyAutoSecData = "autoSecData";
    public static final String SecVIKeyBankCardNumber = "virtualCardNo";
    public static final String SecVIKeyBizId = "bizId";
    public static final String SecVIKeyFastInitExtra = "secVIKeyFastInitExtra";
    public static final String SecVIKeyProductCode = "productCode";
    public static final String SecVIKeyProductId = "productId";
    public static final String SecVIKeyProductMngId = "prodmngId";
    public static final String SecVIKeyProductType = "productType";
    public static final String SecVIKeySceneId = "sceneId";
    public static final String SecVIKeySecData = "secData";
    public static final String SecVIKeySecuritySettingsConfig = "SecVIKeySecuritySettingsConfig";
    public static final String SecVIKeyTntInstId = "tntInstId";
    public static final String SecVIKeyType = "type";
    public static final String SecVIKeyUserId = "userId";
    public static final String SecVIKeyUserInfo = "userInfo";
    public static final String SecVIKeyVerifyId = "verifyId";
    public static final String SecVIKeyVerifyType = "verifyType";
    public static final String UPDATE_PREPARE = "UPDATE_PREPARE";
    public static final String UPDATE_SUBMIT = "UPDATE_SUBMIT";
    public static final String VERIFY = "VERIFY";
    public static final String VIEW = "VIEW";
    public static final int VerifyCallAllInsert = 9000;
    public static final int VerifyCallAllStart = 9009;
    public static final int VerifyProductSet = 8000;
    public static final int VerifyProductVerify = 8008;
    public static final int VerifyTypeFastInit = 2;
    public static final int VerifyTypeFastModule = 3;
    public static final int VerifyTypeProductManage = 4;
    public static final int VerifyTypeStandard = 1;
    public static final int VerifyTypeUnknow = 0;

    public static final class CHANNEL {
        public static final int KEY_CHANNEL_MASTER = 0;
        public static final int KEY_CHANNEL_PAYTM = 1;
    }

    public static class Menu {
        public static final String CODE = "code";
        public static final String FROMTITLE = "form_title";
        public static final String HEAD_TIP = "head_title";
        public static final String METHODS = "methods";
        public static final String NAME = "name";
        public static final String TOKEN = "token";
    }

    public static class Pin {
        public static final String ACCOUNT_ENCRYPT_PUBKEY = "account_encrypt_pubkey";
        public static final String ACCOUNT_ENCRYPT_SALT = "account_encrypt_salt";
        public static final String FOOT_TIP = "foot_tip";
        public static final String FORM_BUTTON = "form_button";
        public static final String FORM_INPUT_TIP_LOW = "form_input_tip_low";
        public static final String FORM_INPUT_TIP_URL = "form_input_tip_url";
        public static final String FORM_TITLE = "form_title";
        public static final String HALF_SCREEN = "half_screen";
        public static final String HAS_OTHERS = "HAS_OTHERS";
        public static final String HEAD_TITLE = "head_title";
        public static final String INPUTCHARCOUNT = "inputCharCount";
        public static final String INPUTTYPE = "inputType";
    }
}
