package id.dana.tracker;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface TrackerKey {

    public @interface AccountLockProperty {
        public static final String ACTION = "Action";
        public static final String CALL_HELP = "Call Help";
        public static final String WAIT = "Wait";
    }

    public @interface AppStartProperty {
        public static final String APP_START_COLD = "Cold";
        public static final String APP_START_WARM = "Warm";
    }

    public @interface AppUpdateAction {
        public static final String APP_UPDATE_INSTALL = "Install";
        public static final String APP_UPDATE_LATER = "Later";
    }

    public @interface AppUpdateProperty {
        public static final String APP_UPDATE_ACTION = "App Update Action";
        public static final String APP_UPDATE_TYPE = "App Update Type";
        public static final String LATEST_APP_VERSION = "Latest App Version";
        public static final String VALID_APP_VERSION = "Valid App Version";
    }

    public @interface AppUpdateType {
        public static final String APP_UPDATE_FORCE = "Force";
        public static final String APP_UPDATE_OPTIONAL = "Optional";
    }

    public @interface BindingProperties {
        public static final String MERCHANT_NAME = "Merchant Name";
        public static final String MERCHANT_SITE_NAME = "Merchant Site Name";
        public static final String PURPOSE = "Purpose";
        public static final String SUCCESS = "Success";
    }

    public @interface DanaBalanceRecipientTypeProperty {
        public static final String DANA = "DANA";
        public static final String OTHER = "Other";
        public static final String PHONE = "Phone";
    }

    public @interface DefaultMixpanel {
        public static final String DISTINCT_ID = "$mixpanel_distinct_id";
        public static final String DURATION = "$duration";
    }

    public @interface Event {
        public static final String ACCESS_REQUEST_OPEN = "Access Request Open";
        public static final String ACCOUNT_BIND = "Account Bind";
        public static final String ACCOUNT_LOCK_HELP = "Account Lock Help";
        public static final String ADD_NAME_COMPLETED = "Add Name Completed";
        public static final String ADD_NAME_OPEN = "Add Name Open";
        public static final String ADD_NAME_SKIP = "Add Name Skip";
        public static final String ANNOUNCEMENT_WIDGET_OPEN = "Announcement Widget Open";
        public static final String ANNOUNCEMENT_WIDGET_SHOW = "Announcement Widget Show";
        public static final String APP_READY = "App Ready";
        public static final String APP_START = "App Start";
        public static final String APP_UPDATE = "App Update";
        public static final String AUTO_SWITCH_PAYMENT = "Auto Switch Payment";
        public static final String DANA_NEWS_OPEN = "DANA News Open";
        public static final String DANA_STATEMENT_DOWNLOAD = "DANA Statement download";
        public static final String DANA_STATEMENT_OPEN = "DANA Statement Open";
        public static final String DANA_WALLET_OPEN = "DANA Wallet Open";
        public static final String EXPLORE_PAGE_OPEN = "Explore Page Open";
        public static final String FRIENDSHIP_ACTIVITY_OPEN = "Friendship Activity Open";
        public static final String FRIENDSHIP_EMOJI_ADD = "Friendship Emoji Add";
        public static final String FRIENDSHIP_FEEDS_COMMENT_ADD = "Friendship Comment Add";
        public static final String FRIENDSHIP_FEEDS_OPEN = "Friendship Feeds Open";
        public static final String FRIENDSHIP_FEEDS_READ = "Friendship Feeds Read";
        public static final String FRIENDSHIP_FRIEND_PROFILE_OPEN = "Friendship Friend Profile Open";
        public static final String FRIENDSHIP_INTRODUCTION_OPEN = "Friendship Introduction Open";
        public static final String FRIENDSHIP_NOTIFICATION_OPEN = "Friendship Notification Open";
        public static final String FRIENDSHIP_SET_BLOCK = "Friendship Set Block";
        public static final String FRIENDSHIP_SET_MUTE = "Friendship Set Mute";
        public static final String FRIENDSHIP_SET_PRIVACY = "Friendship Set Privacy";
        public static final String GLOBAL_SEARCH_OPEN = "Global Search Open";
        public static final String GOAL_SAVINGS_CANCELLED = "Savings Goal Cancelled";
        public static final String GOAL_SAVINGS_CREATED = "Savings Goal Created";
        public static final String GOAL_SAVINGS_EDITED = "Savings Goal Edited";
        public static final String GOAL_SAVINGS_TOPUP_CREATION = "Top Up Savings Creation";
        public static final String GOAL_SAVINGS_WITHDRAW_CREATION = "Savings Goal Withdraw Creation";
        public static final String HOME_POP_UP_ACTION = "Home Pop Up Action";
        public static final String HOME_POP_UP_OPEN = "Home Pop Up Open";
        public static final String INTERSTITIAL_BANNER_DOWNLOAD_FINISH = "Interstitial Banner Download Finish";
        public static final String LINKED_ACCOUNTS_OPEN = "Linked Accounts Open";
        public static final String LINKED_ACCOUNTS_REQUEST = "Linked Accounts Request";
        public static final String LINKED_ACCOUNTS_RESULT = "Linked Accounts Result";
        public static final String LOADING_STATE = "Loading State";
        public static final String LOCATION_PERMISSION = "Location Permission";
        public static final String LOGIN = "Login";
        public static final String LOGOUT = "Logout";
        public static final String NEARBY_DETAIL_OPEN = "Nearby Detail Open";
        public static final String NEARBY_DETAIL_PAGE_SHARE_LINK = "Nearby Detail Page Share Link ";
        public static final String NEARBY_DETAIL_REVIEW_OPEN = "Nearby Detail Review Open";
        public static final String NEARBY_HOME_SHOPPING_OPEN = "Nearby Home Shopping Open";
        public static final String NEARBY_HOME_SHOPPING_ORDER = "Nearby Home Shopping Order";
        public static final String NEARBY_ME_OPEN = "Nearby Open";
        public static final String NEARBY_ME_SEARCH_FILTER = "Nearby Search Filter";
        public static final String NEARBY_ME_SEARCH_KEYWORD = "Nearby Search Keyword";
        public static final String NEARBY_REVIEW_FORM_OPEN = "Nearby Review Form Open";
        public static final String NEARBY_REVIEW_FORM_SUBMIT = "Nearby Review Form Submit";
        public static final String NEARBY_SEARCH_MAP_RESULT = "Nearby Search Map Result";
        public static final String NEARBY_SEARCH_PAGE_OPEN = "Nearby Search Page Open";
        public static final String NEARBY_SHOP_LIST_OPEN = "Nearby Shop List Open";
        public static final String NOTIFICATION_INBOX_OPEN = "Notification Inbox Open";
        public static final String NOTIFICATION_INBOX_READ = "Notification Inbox Read";
        public static final String NOTIFICATION_PUSH_READ = "Notification Push Read";
        public static final String NOTIFICATION_PUSH_RECEIVED = "Notification Push Received";
        public static final String ONBOARDING_EXIT = "Onboarding Exit";
        public static final String ONBOARDING_PHONE_NUMBER_INPUT = "Onboarding Phone Number Input";
        public static final String ONBOARDING_PHONE_NUMBER_OPEN = "Onboarding Phone Number Open";
        public static final String OTP_COMPLETED = "OTP Completed";
        public static final String OTP_INPUT = "OTP Input";
        public static final String OTP_REQUEST = "OTP Request";
        public static final String PAY_QR_OPEN = "Pay QR Open";
        public static final String PAY_QR_RESULT = "Pay QR Result";
        public static final String PIN_COMPLETED = "PIN Completed";
        public static final String PIN_FORGOT = "PIN Forgot";
        public static final String PIN_REQUEST = "PIN Request";
        public static final String POCKET_OPEN = "Pocket Open";
        public static final String POP_UP_ENABLE_LOCATION_OPEN = "Pop Up Enable Location Open";
        public static final String PROFILE_PAGE_OPEN = "Profile Page Open";
        public static final String PROMOTION_BANNER_DOWNLOAD = "Promotion Banner Download Finish";
        public static final String PROMOTION_BANNER_DOWNLOAD_FINISH = "Promotion Banner Download Finish";
        public static final String PROMOTION_BANNER_OPEN = "Promotion Banner Open";
        public static final String PROMOTION_BANNER_SLIDE_TO_PAGE = "Promotion Banner Appear";
        public static final String PROMOTION_CENTER_OPEN = "Promotion Center Open";
        public static final String PROMOTION_INTERSTITIAL_BANNER_APPEAR = "Promotion Banner Appear";
        public static final String PROMO_CODE_OPEN = "Promo Code Open";
        public static final String PROMO_CODE_RESULT = "Promo Code Result";
        public static final String PROMO_QUEST_DETAILS_OPEN = "Promo Quest Details Open";
        public static final String PROMO_QUEST_FINISH = "Promo Quest Finish";
        public static final String PROMO_QUEST_MAIN_PAGE_OPEN = "Promo Quest Main Page Open";
        public static final String PROMO_QUEST_TASK_EXECUTE = "Promo Quest Task Execute";
        public static final String PUSH_VERIFY_COMPLETED = "Push Verify Completed";
        public static final String PUSH_VERIFY_CREATE_CHALLENGE = "Push Verify Create Challenge";
        public static final String PUSH_VERIFY_NOTIFICATION_RECEIVED = "Push Verify Notification Received";
        public static final String PUSH_VERIFY_RETURN_CREATE_CHALLENGE = "Push Verify Return Create Challenge";
        public static final String PUSH_VERIFY_UPDATE_CHALLENGE = "Push Verify Update Challenge";
        public static final String REFERRAL_BANNER_CLICK = "Referral Banner Click";
        public static final String REFERRAL_ENGAGEMENT_POPUP = "Referral Engagement Pop Up";
        public static final String REFERRER_INVITE_ATTEMPT = "Referrer Invite Attempt";
        public static final String REFERRER_PAGE_OPEN = "Referrer Page Open";
        public static final String REGISTRATION_COMPLETE = "Registration Complete";
        public static final String REGISTRATION_PIN_CONFIRM = "Registration PIN Confirm";
        public static final String REGISTRATION_PIN_CREATE = "Registration PIN Create";
        public static final String REGISTRATION_PROFILE_CREATE = "Registration Profile Create";
        public static final String REGISTRATION_REFERRAL_INPUT = "Registration Referral Input";
        public static final String REQUEST_MONEY_OPEN = "Request Money Open";
        public static final String REQUEST_MONEY_QR_BANK_ACCOUNT_NUMBER_INPUT = "Request Money QR Bank Account Number Input";
        public static final String REQUEST_MONEY_QR_BANK_CREATE = "Request Money QR Bank Create";
        public static final String RESULT = "Result";
        public static final String SAVINGS_GOAL_OPEN = "Savings Goal Open";
        public static final String SCAN_QR = "Scan QR";
        public static final String SCAN_QR_HELP = "Scan QR Help";
        public static final String SEARCH_RESULT_BOTTOM_SHEET_DETAIL_OPEN = "Search Result Bottom Sheet Detail Open";
        public static final String SEARCH_RESULT_PAGE_ACTION_BUTTON = "Search Result Page Action Button";
        public static final String SEARCH_RESULT_PAGE_OPEN = "Search Result Page Open";
        public static final String SEND_MONEY_BANK_ACCOUNT_NUMBER_INPUT = "Send Money Bank Account Number Input";
        public static final String SEND_MONEY_CONFIRM = "Send Money Confirm";
        public static final String SEND_MONEY_CREATE = "Send Money Create";
        public static final String SEND_MONEY_HELP_OPEN = "Send Money Help Open";
        public static final String SEND_MONEY_OPEN = "Send Money Open";
        public static final String SEND_MONEY_SEARCH = "Send Money Search";
        public static final String SEND_MONEY_SELECT = "Send Money Select";
        public static final String SERVICE_OPEN = "Service Open";
        public static final String SPLASH = "Splash";
        public static final String TRANSACTION_HISTORY_OPEN = "Transaction History Open";
        public static final String TWILIO_PUSH_ENROLL = "Twilio Push Enroll";
        public static final String UNSAFE_IDENTIFIED_DEVICE = "Unsafe Identified Device";
    }

    public @interface GlobalSearchOpenProperties {
        public static final String KEYWORD_RESULT = "Keyword Result";
        public static final String KEYWORD_USAGE = "Keyword Usage";
        public static final String RESULT_STATUS = "Result Status";
        public static final String SOURCE = "Source";
        public static final String SUGGESTION_ORDER = "Suggestion Order";
    }

    public @interface GlobalSearchProperties {
        public static final String DISHES_NAME = "Dishes Name";
        public static final String MERCHANT_CATEGORY = "Merchant Category";
        public static final String MERCHANT_NAME = "Merchant Name";
        public static final String SECTION = "Section";
        public static final String SHOP_NAME = "Shop Name";
    }

    public @interface InviteType {
        public static final String SHARE_BUTTON = "Share Button";
        public static final String USER_CONTACT = "User Contact";
    }

    public @interface KeywordType {
        public static final String CUSTOM = "Custom";
        public static final String HISTORY = "History";
        public static final String POPULAR = "Popular";
        public static final String SUGGESTION = "Suggestion";
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

    public @interface LogoutType {
        public static final String LOGOUT_FORCE = "Force";
        public static final String LOGOUT_NORMAL = "Normal";
        public static final String SESSION_EXPIRE = "Session Expire";
    }

    public @interface MerchantManagementProperties {
        public static final String APP_NAME = "App Name";
        public static final String DATE = "Date";
        public static final String MERCHANT_NAME = "Merchant Name";
    }

    public @interface NearbyMerchantProperty {
        public static final String CAMPAIGN_ID = "Campaign Id";
        public static final String HAS_REVIEW = "Has Review";
        public static final String MCC_TYPE = "MCC Type";
        public static final String MERCHANT_NAME = "Merchant Name";
        public static final String PROMO_CODE = "Promo Code";
        public static final String SHOP_NAME = "Shop Name";
        public static final String STARS_SUBMITTED = "Stars Submitted";
        public static final String TAGS_SUBMITTED = "Tags Submitted";
    }

    public @interface NewsProperty {
        public static final String NEWS_TITLE = "News Title";
    }

    public @interface NotificationInboxProperty {
        public static final String CONTENT_TYPE = "Content Type";
        public static final String EMOJI_CONTENT_TYPE = "Emoji Content Type";
        public static final String ICON_URL = "Icon URL";
        public static final String NOTIFICATION_ID = "Notification ID";
        public static final String REDIRECT_TYPE = "Redirect Type";
        public static final String REDIRECT_VALUE = "Redirect Value";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OnboardingPhoneNumberCheckResult {
        public static final String LOGIN = "Login";
        public static final String NETWORK_ERROR = "Network Error";
        public static final String REGISTER = "Register";
    }

    public @interface OnboardingProperty {
        public static final String LAST_VIEWED_ONBOARDING_PAGE = "Last Viewed Onboarding Page";
    }

    public @interface OpenScanAction {
        public static final String RECENT_RECIPIENT = "Recent Recipient";
    }

    public @interface PeopleProperty {
        public static final String FIRST_TRANSACTION_DATE = "First Transaction Date";
        public static final String FIRST_TRANSACTION_TYPE = "First Transaction Type";
        public static final String KYC_LEVEL = "KYC Level";
        public static final String LAST_TRANSACTION_DATE = "Last Transaction Date";
        public static final String LAST_TRANSACTION_TYPE = "Last Transaction Type";
        public static final String USER_ID = "$user_id";
        public static final String USER_LOCATION_PERMISSION = "User Location Permission";
    }

    public @interface PromoQuestProperties {
        public static final String MISSION_ID = "Mission Id";
        public static final String MISSION_TITLE = "Mission Title";
    }

    public @interface PromotionProperty {
        public static final String BANNER_URL = "Banner URL";
        public static final String CATEGORY_NAME = "Category Name";
        public static final String FILE_SIZE = "File Size";
        public static final String MERCHANT_SPECIAL_SHOW = "Merchant's Special Show";
        public static final String PROMOTION_CONTENT_ID = "Promotion Content ID";
        public static final String PROMOTION_CONTENT_NAME = "Promotion Content Name";
        public static final String PROMOTION_CONTENT_TYPE = "Promotion Content Type";
        public static final String PROMOTION_EXPIRY_DATE = "Promotion Expiry Date";
        public static final String PROMOTION_LIST = "Promotion List";
        public static final String PROMOTION_SPACE_CODE = "Promotion Space Code";
        public static final String UUID = "UUID";
    }

    public @interface Property {
        public static final String ANNOUNCEMENT_SUBTITLE = "Announcement Subtitle";
        public static final String ANNOUNCEMENT_TITLE = "Announcement Title";
        public static final String ANNOUNCEMENT_TYPE = "Announcement Type";
        public static final String CHALLENGE_SID = "Challenge Sid";
        public static final String COMMENT_CONTENT_TYPE = "Comment Content Type";
        public static final String CONTEXT_CODE = "Context Code";
        public static final String CONTEXT_VALUE = "Context Value";
        public static final String DEVICE_SOURCE = "Device Source";
        public static final String DISHES = "Dishes";
        public static final String DURATION = "Duration";
        public static final String EMOJI_TYPE = "Emoji Type";
        public static final String FACTOR_SID = "Factor Sid";
        public static final String FAIL_REASON = "Fail Reason";
        public static final String FEED_CONTENT_TYPE = "Feed Content Type";
        public static final String FEED_TYPE = "Feed Type";
        public static final String GOAL_AMOUNT = "Goal Amount";
        public static final String GOAL_CATEGORY = "Goal Category";
        public static final String GOAL_NAME = "Goal Name";
        public static final String INVITE_TYPE = "Invite Type";
        public static final String IS_BLOCKED = "isBlocked";
        public static final String IS_CONFIRM = "Is Confirm";
        public static final String IS_MUTED = "isMuted";
        public static final String IS_SHARED_TO_FRIEND = "isSharedtoFriends";
        public static final String IS_SUCCESS = "Is Success";
        public static final String KYC_LEVEL = "KYC Level";
        public static final String LOGOUT_TYPE = "Logout Type";
        public static final String MEDIA_SOURCE = "Media Source";
        public static final String MERCHANT_ID = "Merchant ID";
        public static final String NEARBY = "Nearby";
        public static final String NETWORK_TYPE = "Network Type";
        public static final String NOTIFICATION_TYPE = "Notification Type";
        public static final String NUMBER_OF_ATTEMPTS = "Number of Attempts";
        public static final String NUMBER_OF_UNCOMPLETED_TASKS = "Number of uncompleted tasks";
        public static final String ONBOARDING_PHONE_NUMBER_CHECK_RESULT = "Onboarding Phone Number Check Result";
        public static final String ONBOARDING_POPUP_SCENARIO = "Pop Up Scenario";
        public static final String ONLINE = "Online";
        public static final String PAYLOAD = "Payload";
        public static final String PAYMENT_METHOD_COUNT = "Payment Method Count";
        public static final String PAY_QR_CHANNEL_NAME = "Pay QR Channel Name";
        public static final String PAY_QR_PAYMENT_METHOD = "Pay QR Payment Method";
        public static final String PROMO_QUEST_NAME = "Promo Quest Name";
        public static final String PURPOSE = "Purpose";
        public static final String QR_PAYMENT_PROCESSING_RESULT = "QR Payment Processing Result";
        public static final String QUEST_DESCRIPTION = "Quest Description";
        public static final String REFERRAL_CODE = "Referral Code";
        public static final String RESTSAURANT = "Restaurant";
        public static final String RESULT = "Result";
        public static final String SEARCH_FILTER = "Search Filter";
        public static final String SEARCH_KEYWORD = "Search Keyword";
        public static final String SEARCH_TYPE = "Search Type";
        public static final String SERVICE = "Service";
        public static final String SOURCE = "Source";
        public static final String START_TYPE = "Start Type";
        public static final String TIME = "Time";
        public static final String UNFINISHED_QUEST_EXIST = "Unfinished Quest Exist";
        public static final String USER_UPDATE_RESULT = "User Update Result";
    }

    public @interface RecipientDestinationTypeProperty {
        public static final String BANK = "BANK";
        public static final String DANA_BALANCE = "DANA Balance";
        public static final String LINK = "LINK";
    }

    public @interface RegistrationProperties {
        public static final String REFERRAL_CODE = "Referral Code";
        public static final String REFERRAL_TYPE = "Referral Type";
        public static final String REGISTRATION_DATE = "Registration Date";
    }

    public @interface ResultStatusType {
        public static final String ERROR_PAGE = "Error Page";
        public static final String NO_RESULT_PAGE = "No Result Page";
        public static final String RESULT_NO_LOCATION = "Result No Location";
        public static final String RESULT_WITH_LOCATION = "Result With Location";
    }

    public @interface ResultType {
        public static final String FAILED = "Failed";
        public static final String PENDING = "Pending";
        public static final String SUCCESS = "Success";
    }

    public @interface ScanQRProperties {
        public static final String CAMERA_LIGHT_TURNED_ON = "Camera Light Turned On";
        public static final String QR_DECODE_DURATION = "QR Decode Duration";
        public static final String QR_DECODE_RESULT = "QR Decode Result";
        public static final String QR_DECODE_RESULT_TYPE = "QR Decode Result Type";
        public static final String QR_RESULT_ACTION = "QR Result Action";
        public static final String QR_RESULT_DURATION = "QR Result Duration";
        public static final String QR_SOURCE = "QR Source";
    }

    public @interface ScanQRSourceType {
        public static final String QR_SOURCE_GALLERY = "Gallery";
        public static final String QR_SOURCE_SCAN = "Scan";
    }

    public @interface ScannerAction {
        public static final String DECODE_CODE = "Decode Code";
        public static final String DECODE_CODE_GALLERY_ERROR = "Decode Gallery OnError";
        public static final String ERROR = "Error";
        public static final String ERROR_CODE_NOT_WHITE_LIST = "Error Code NotWhitelisted";
        public static final String ERROR_NON_SPLITBILL_PAYER = "Error Non SplitBillPayer";
        public static final String ERROR_QR_BARCODE = "Error QrBarcode";
        public static final String ERROR_SCAN_IT_SELF = "Error Scan ItSelf";
        public static final String OPEN_H5_SCAN = "H5 ScanHandler";
    }

    public @interface SendMoneyProperties {
        public static final String HAS_COMMENT = "Has Comment";
        public static final String LAST_TRANSACTION = "Last Transaction";
        public static final String NUMBER_OF_FREE_TRANSFER = "Send Money Number of Free Transfer";
        public static final String P2P_RECIPIENT_TYPE = "P2P Recipient Type";
        public static final String PAID_AMOUNT = "Paid Amount";
        public static final String RECIPIENT_DESTINATION_TYPE = "Recipient Destination Type";
        public static final String RECIPIENT_SOURCE = "Recipient Source";
        public static final String RECIPIENT_USER_ID = "Recipient User ID";
        public static final String SENDER_CONTACT_COUNT = "Sender Contact Count";
        public static final String SENDER_PAYMENT_METHOD = "Sender Payment Method";
        public static final String SEND_MONEY_AMOUNT = "Send Money Amount";
        public static final String SEND_MONEY_CLAIM_LINK_EXPIRY = "Send Money Claim Link Expiry";
        public static final String SHARE_TO_FEED = "Share to Feed";
    }

    public @interface ServiceProperty {
        public static final String SERVICE_CATEGORY = "Service Category";
        public static final String SERVICE_NAME = "Service Name";
    }

    public @interface SourceType {
        public static final String BANNER = "Banner";
        public static final String CAMERA_CARD = "Camera Card";
        public static final String CLICK = "Click";
        public static final String DANA_FOOD = "DANA Food";
        public static final String DANA_NEWS = "Dana News";
        public static final String DEEPLINK = "Deeplink";
        public static final String DEEP_LINK = "Deep Link";
        public static final String EXPLORE = "Explore";
        public static final String FEED_DEEPLINK = "Feed Deeplink";
        public static final String FEED_NOTIFICATOIN_PAGE = "Feed Notification Page";
        public static final String FEED_SETTINGS = "Feed Settings";
        public static final String FEED_WIDGET = "Feed Widget";
        public static final String FORGOT_PIN = "Forgot PIN";
        public static final String FOUR_KING_KONG = "Four King Kong";
        public static final String FRIENDSHIP_FRIENDS_FEED = "Friendship Friend Feed";
        public static final String FRIENDSHIP_MY_FEED = "Friendship My Feed";
        public static final String FRIENDS_FEED = "Friends Feed";
        public static final String GLOBAL_SEARCH = "Global Search";
        public static final String HOME = "Home";
        public static final String HOME_PAY_BUTTON = "Home Pay Button";
        public static final String INBOX_ICON = "Inbox Icon";
        public static final String INBOX_PAGE = "Inbox Page";
        public static final String JS_API = "Js Api";
        public static final String LOGIN = "Login";
        public static final String MERCHANT_DETAIL = "Merchant Detail";
        public static final String ME_PAGE = "Me Page";
        public static final String NEARBY_MAPS = "Nearby Maps";
        public static final String NEARBY_ME_DETAIL = "Nearby Detail";
        public static final String NEARBY_ME_LIST = "Nearby List";
        public static final String NEARBY_SHOP_LIST = "Nearby Shop List";
        public static final String NOTIFICATION = "Notification";
        public static final String PROFILE = "Profile";
        public static final String PROFILE_PAGE = "Profile Page";
        public static final String PROMOTION = "Promotion";
        public static final String PROMO_CODE_DEEPLINK = "Promo Code Deeplink";
        public static final String PROMO_QUEST_AT_HOME = "Promo Quest At Home";
        public static final String PROMO_QUEST_DEEPLINK = "Promo Quest Deeplink";
        public static final String PUSH_NOTIFICATION = "Push Notification";
        public static final String QR_CARD = "QR Card";
        public static final String REFERRAL = "Referral";
        public static final String REFERRAL_DEEPLINK = "Referral Deeplink";
        public static final String REFERRAL_NONE = "None";
        public static final String REGISTRATION = "Registration";
        public static final String REQUEST_MONEY_TO_BANK_WITHOUT_AMOUNT = "Request Money without Amount to Bank Account";
        public static final String REQUEST_MONEY_TO_BANK_WITH_AMOUNT = "Request Money with Amount to Bank Account";
        public static final String REQUEST_MONEY_WITHOUT_AMOUNT = "Request Money without Amount";
        public static final String REQUEST_MONEY_WITH_AMOUNT = "Request Money with Amount";
        public static final String RESULT_ON_MAP = "Result on Map";
        public static final String SCAN_QR = "Scan QR";
        public static final String SEND_MONEY = "Send Money";
        public static final String SERVICES = "Services";
        public static final String SHOP_LIST = "Shop List";
        public static final String SPLITBILL = "Split Bill";
        public static final String SWIPE = "Swipe";
        public static final String SWIPE_HOME = "Swipe Home";
        public static final String SWIPE_RIGHT = "Swipe Right";
        public static final String USER_INPUT = "User Input";
    }

    public @interface SuggestionOrderType {
        public static final String ORDER_FOUR = "Order 4";
        public static final String ORDER_MORE_THAN_FOUR = "More Than 4";
        public static final String ORDER_ONE = "Order 1";
        public static final String ORDER_THREE = "Order 3";
        public static final String ORDER_TWO = "Order 2";
    }

    public @interface SuperProperties {
        public static final String ENVIRONMENT = "Environment";
        public static final String LATITUDE = "Latitude";
        public static final String LONGITUDE = "Longitude";
        public static final String MIXPANEL_LATITUDE = "$latitude";
        public static final String MIXPANEL_LONGITUDE = "$longitude";
        public static final String UTDID = "UTDID";
    }

    public @interface TransactionType {
        public static final String SEND_MONEY = "Send Money";
    }

    public @interface UninstallEventKey {
        public static final String BIZTYPE = "bizType";
        public static final String UNINSTALL_EVENT = "UNINSTALL_EVENT";
    }
}
