package id.dana.data.tracker;

public interface TrackerDataKey {

    public @interface BindingProperties {
        public static final String MERCHANT_NAME = "Merchant Name";
        public static final String SUCCESS = "Success";
    }

    public @interface Event {
        public static final String CARRIER_IDENTIFICATION_COMPLETED = "Carrier Identification Completed";
        public static final String CARRIER_IDENTIFICATION_EVURL_CALLED = "Carrier Identification EVURL Called";
        public static final String CARRIER_IDENTIFICATION_EVURL_RECEIVED = "Carrier Identification EVURL Received";
        public static final String CARRIER_IDENTIFICATION_EVURL_REQUESTED = "Carrier Identification EVURL Requested";
        public static final String CARRIER_IDENTIFICATION_REQUEST = "Carrier Identification Request";
        public static final String CARRIER_IDENTIFICATION_VERIFY_RESULT = "Carrier Identification Verify Result";
        public static final String DISPLAYED_ERROR = "Displayed Error";
        public static final String GEOCODE_REVERSE = "Geocode Reverse";
        public static final String LOGIN = "Login";
        public static final String MINIPROGRAM_BINDING_SUCCESS = "Mini Program Binding Success";
        public static final String MINIPROGRAM_REQUEST_AGREEMENT = "Mini Program Request Agreement";
        public static final String MINIPROGRAM_SHOW_AGREEMENT = "Mini Program Show Agreement";
        public static final String MINIPROGRAM_TRADE_PAY = "Mini Program Trade Pay";
        public static final String NETWORK_ERROR = "Network Error";
        public static final String PLACE_AUTO_COMPLETE = "Place Auto Complete";
        public static final String PLACE_DETAIL = "Place Detail";
        public static final String TRANSACTION_COMPLETE = "Transaction Complete";
    }

    public @interface LoginProperties {
        public static final String LOGIN_CHALLENGE = "Login Challenge";
        public static final String LOGIN_TYPE = "Login Type";
    }

    public @interface LoginType {
        public static final String HOLD = "Hold";
        public static final String LOGIN_PIN = "Password";
        public static final String NORMAL = "Normal";
        public static final String OTP_SMS = "OTP SMS";
    }

    public @interface MixpanelSourceType {
        public static final String ANALYTICS_SDK = "Analytics SDK";
        public static final String MIXPANEL_DATA_TRACKER = "MixpanelDataTracker";
    }

    public @interface NetworkErrorOperationTypeProperty {
        public static final String CHECK_PHONE_NUMBER_AND_SEND_OTP = "alipayplus.mobilewallet.user.checkRegisteredUserAndSendOTP";
        public static final String GET_BOKU_URL = "alipayplus.mobilewallet.boku.getnetworkurl";
        public static final String LOGIN = "alipayplus.mobilewallet.user.login";
        public static final String NAME_CHECK = "/wallet/api/alipayplus.mobilewallet.withdraw.namecheck.json";
        public static final String SEND_OTP = "alipayplus.mobilewallet.user.security.sendOtp";
        public static final String VERIFY_OTP = "alipayplus.mobilewallet.user.security.verifyOtp";
        public static final String VERIFY_OTP_RISK = "alipayplus.mobilewallet.product.security.verify";
    }

    public @interface PeopleProperty {
        public static final String USER_ID = "$user_id";
    }

    public @interface Property {
        public static final String APP_ID = "App ID";
        public static final String DISPLAYED_MESSAGE = "Displayed Message";
        public static final String ERROR_CODE = "Error Code";
        public static final String ERROR_MESSAGE = "Error Message";
        public static final String ERROR_REASON = "Error Reason";
        public static final String GEOCODER_APP_LAYER_CALLER = "Geocoder App Layer Caller";
        public static final String GEOCODER_DOMAIN_LAYER_CALLER = "Geocoder Domain Layer Caller";
        public static final String GEOCODER_ERROR = "Geocoder Error";
        public static final String GEOCODER_IS_DATA_COMPLETED = "Geocoder Data Completed";
        public static final String GEOCODER_SOURCE = "Geocoder Source";
        public static final String GEOCODER_UUID = "Geocoder UUID";
        public static final String IS_REQUEST_NETWORK = "Is Request Network";
        public static final String IS_WIFI = "Is Wifi";
        public static final String KYC_LEVEL = "KYC Level";
        public static final String OPERATION_TYPE = "Operation Type";
        public static final String PROCESSING_STATUS = "Processing Status";
        public static final String RESPONSE_CODE = "Response Code";
        public static final String RESPONSE_MESSAGE = "Response Message";
        public static final String RESULT_STATUS = "Result Status";
        public static final String SOURCE = "Source";
        public static final String SUCCESS = "Success";
        public static final String TRANS_TYPE = "Transaction Type";
        public static final String UUID = "UUID";
    }

    public @interface Source {
        public static final String HOLD_LOGIN = "Hold login";
        public static final String LOGIN = "Login";
        public static final String REGISTRATION = "Registration";
        public static final String RELOGIN = "Relogin";
        public static final String VERIFY_PHONE_NUMBER = "Onboarding Input Phone";
    }

    public @interface SuperProperties {
        public static final String MIXPANEL_SOURCE = "Mixpanel Source";
    }
}
