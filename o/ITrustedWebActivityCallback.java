package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import id.dana.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.IPostMessageService;
import o.areNotificationsEnabled;

public abstract class ITrustedWebActivityCallback<I> {

    public interface Default {
        @NonNull
        IPostMessageService.Stub.Proxy getActivityResultRegistry();
    }

    public abstract void getMin(@SuppressLint({"UnknownNullness"}) I i, @Nullable name name);

    @MainThread
    public abstract void setMax();

    public final class Stub {

        public static final class IsOverlapping {
            public static final int FastBitmap$CoordinateSystem = 2131886099;
            public static final int IsOverlapping = 2131886093;
            public static final int Mean$Arithmetic = 2131886103;
            public static final int equals = 2131886092;
            public static final int getMax = 2131886083;
            public static final int getMin = 2131886088;
            public static final int hashCode = 2131886095;
            public static final int isInside = 2131886091;
            public static final int length = 2131886086;
            public static final int setMax = 2131886089;
            public static final int setMin = 2131886087;
            public static final int toDoubleRange = 2131886097;
            public static final int toFloatRange = 2131886094;
            public static final int toIntRange = 2131886090;
            public static final int toString = 2131886098;
            public static final int values = 2131886096;
        }

        public static final class equals {
            public static final int FastBitmap$CoordinateSystem = 2131558419;
            public static final int Grayscale$Algorithm = 2131558421;
            public static final int IsOverlapping = 2131558412;
            public static final int Mean$Arithmetic = 2131558425;
            public static final int create = 2131559123;
            public static final int equals = 2131558413;
            public static final int getMax = 2131558405;
            public static final int getMin = 2131558402;
            public static final int hashCode = 2131558416;
            public static final int invoke = 2131558423;
            public static final int invokeSuspend = 2131558422;
            public static final int isInside = 2131558407;
            public static final int length = 2131558406;
            public static final int onNavigationEvent = 2131558427;
            public static final int setMax = 2131558403;
            public static final int setMin = 2131558400;
            public static final int toDoubleRange = 2131558417;
            public static final int toFloatRange = 2131558411;
            public static final int toIntRange = 2131558414;
            public static final int toString = 2131558415;
            public static final int valueOf = 2131558424;
            public static final int values = 2131558418;
        }

        public static final class getMax {
            public static final int FastBitmap$CoordinateSystem = 2131166067;
            public static final int IsOverlapping = 2131165244;
            public static final int equals = 2131165226;
            public static final int getMax = 2131165206;
            public static final int getMin = 2131165207;
            public static final int hashCode = 2131166070;
            public static final int isInside = 2131165239;
            public static final int length = 2131165225;
            public static final int setMax = 2131165193;
            public static final int setMin = 2131165194;
            public static final int toDoubleRange = 2131165245;
            public static final int toFloatRange = 2131165238;
            public static final int toIntRange = 2131165243;
            public static final int toString = 2131166071;
            public static final int values = 2131166068;
        }

        public static final class getMin {
            public static final int FastBitmap$CoordinateSystem = 2130968611;
            public static final int Grayscale$Algorithm = 2130968626;
            public static final int ICustomTabsCallback = 2130968920;
            public static final int ICustomTabsCallback$Default = 2130969474;
            public static final int ICustomTabsCallback$Stub = 2130969777;
            public static final int ICustomTabsCallback$Stub$Proxy = 2130969829;
            public static final int ICustomTabsService = 2130969835;
            public static final int IsOverlapping = 2130968589;
            public static final int Mean$Arithmetic = 2130968646;
            public static final int asBinder = 2130969739;
            public static final int asInterface = 2130969475;
            public static final int b = 2130968911;
            public static final int create = 2130968912;
            public static final int equals = 2130968587;
            public static final int extraCallback = 2130969064;
            public static final int extraCallbackWithResult = 2130969056;
            public static final int extraCommand = 2130970019;
            public static final int getCause = 2130968909;
            public static final int getDefaultImpl = 2130969902;
            public static final int getInterfaceDescriptor = 2130969781;
            public static final int getMax = 2130968581;
            public static final int getMin = 2130968582;
            public static final int hashCode = 2130968608;
            public static final int invoke = 2130968753;
            public static final int invokeSuspend = 2130968907;
            public static final int isInside = 2130968604;
            public static final int length = 2130968585;
            public static final int mayLaunchUrl = 2130970070;
            public static final int newSession = 2130970071;
            public static final int onMessageChannelReady = 2130969263;
            public static final int onNavigationEvent = 2130968910;
            public static final int onPostMessage = 2130968928;
            public static final int onRelationshipValidationResult = 2130969023;
            public static final int onTransact = 2130969686;
            public static final int setDefaultImpl = 2130969950;
            public static final int setMax = 2130968586;
            public static final int setMin = 2130968584;
            public static final int toDoubleRange = 2130968612;
            public static final int toFloatRange = 2130968588;
            public static final int toIntRange = 2130968592;
            public static final int toString = 2130968624;
            public static final int valueOf = 2130968846;
            public static final int values = 2130968625;
        }

        public static final class isInside {
            public static final int getMax = 2131951628;
            public static final int getMin = 2131952193;
            public static final int length = 2131952135;
            public static final int setMax = 2131952206;
            public static final int setMin = 2131952205;
        }

        public static final class length {
            public static final int length = 2131034112;
        }

        public static final class setMax {
            public static final int FastBitmap$CoordinateSystem = 2131230939;
            public static final int Grayscale$Algorithm = 2131230949;
            public static final int ICustomTabsCallback = 2131230973;

            /* renamed from: ICustomTabsCallback$Default */
            public static final int abc_star_half_black_48dp = 2131230986;

            /* renamed from: ICustomTabsCallback$Stub */
            public static final int abc_star_black_48dp = 2131230985;

            /* renamed from: ICustomTabsCallback$Stub$Proxy */
            public static final int abc_text_select_handle_right_mtrl = 2131230994;
            public static final int ICustomTabsService = 2131230995;
            public static final int IsOverlapping = 2131230938;
            public static final int Mean$Arithmetic = 2131230951;
            public static final int asBinder = 2131230989;
            public static final int asInterface = 2131230987;
            public static final int b = 2131230974;
            public static final int create = 2131230971;
            public static final int equals = 2131230931;
            public static final int extraCallback = 2131230981;
            public static final int extraCallbackWithResult = 2131230984;
            public static final int extraCommand = 2131230996;
            public static final int getCause = 2131230970;

            /* renamed from: getDefaultImpl */
            public static final int abc_text_select_handle_left_mtrl = 2131230992;
            public static final int getInterfaceDescriptor = 2131230991;
            public static final int getMax = 2131230924;
            public static final int getMin = 2131230926;
            public static final int hashCode = 2131230946;
            public static final int invoke = 2131230959;
            public static final int invokeSuspend = 2131230952;
            public static final int isInside = 2131230932;
            public static final int length = 2131230922;
            public static final int mayLaunchUrl = 2131230997;
            public static final int newSessionWithExtras = 2131230998;
            public static final int onMessageChannelReady = 2131230982;
            public static final int onNavigationEvent = 2131230972;
            public static final int onPostMessage = 2131230980;
            public static final int onRelationshipValidationResult = 2131230983;
            public static final int onTransact = 2131230988;

            /* renamed from: setDefaultImpl */
            public static final int abc_text_select_handle_middle_mtrl = 2131230993;
            public static final int setMax = 2131230925;
            public static final int setMin = 2131230929;
            public static final int toDoubleRange = 2131230942;
            public static final int toFloatRange = 2131230937;
            public static final int toIntRange = 2131230930;
            public static final int toString = 2131230941;
            public static final int valueOf = 2131230953;
            public static final int values = 2131230948;
            public static final int warmup = 2131230999;
        }

        public static final class setMin {
            public static final int equals = 2131099672;
            public static final int getMax = 2131099655;
            public static final int getMin = 2131099668;
            public static final int isInside = 2131099671;
            public static final int length = 2131099670;
            public static final int setMax = 2131099669;
            public static final int setMin = 2131099654;
            public static final int toFloatRange = 2131099673;
        }

        public static final class toFloatRange {
            public static final int FastBitmap$CoordinateSystem = 2131362588;
            public static final int Grayscale$Algorithm = 2131362862;
            public static final int ICustomTabsCallback = 2131364060;
            public static final int ICustomTabsCallback$Default = 2131364623;
            public static final int ICustomTabsCallback$Stub = 2131364624;
            public static final int ICustomTabsCallback$Stub$Proxy = 2131364696;
            public static final int ICustomTabsService = 2131364689;
            public static final int IsOverlapping = 2131361871;
            public static final int Mean$Arithmetic = 2131362700;
            public static final int asBinder = 2131364626;
            public static final int asInterface = 2131364627;
            public static final int b = 2131363795;
            public static final int create = 2131363173;
            public static final int equals = 2131361862;
            public static final int extraCallback = 2131364208;
            public static final int extraCallbackWithResult = 2131364609;
            public static final int extraCommand = 2131364795;
            public static final int getCause = 2131363160;
            public static final int getDefaultImpl = 2131364628;
            public static final int getInterfaceDescriptor = 2131364629;
            public static final int getMax = 2131361853;
            public static final int getMin = 2131361848;
            public static final int hashCode = 2131362619;
            public static final int invoke = 2131362703;
            public static final int invokeSuspend = 2131362620;
            public static final int isInside = 2131361860;
            public static final int length = 2131361847;
            public static final int mayLaunchUrl = 2131364796;
            public static final int newSession = 2131364837;
            public static final int newSessionWithExtras = 2131364726;
            public static final int onMessageChannelReady = 2131364610;
            public static final int onNavigationEvent = 2131363031;
            public static final int onPostMessage = 2131364622;
            public static final int onRelationshipValidationResult = 2131364611;
            public static final int onTransact = 2131364625;
            public static final int requestPostMessageChannelWithExtras = 2131364850;
            public static final int setDefaultImpl = 2131364657;
            public static final int setMax = 2131361849;
            public static final int setMin = 2131361852;
            public static final int toDoubleRange = 2131362589;
            public static final int toFloatRange = 2131361863;
            public static final int toIntRange = 2131361855;
            public static final int toString = 2131361888;
            public static final int updateVisuals = 2131364871;
            public static final int validateRelationship = 2131364839;
            public static final int valueOf = 2131362783;
            public static final int values = 2131362177;
            public static final int warmup = 2131364727;
        }

        public static final class toIntRange {
            public static final int[] ActivityResult = {16842927, 16843072, R.attr.f2962130968749, R.attr.f4472130968900, R.attr.f4482130968901, R.attr.f4972130968950, R.attr.f4982130968951, R.attr.f4992130968952, R.attr.f5002130968953, R.attr.f5012130968954, R.attr.f5022130968955, R.attr.f10322130969485, R.attr.f10332130969486, R.attr.f10972130969550, R.attr.f11292130969582, R.attr.f11922130969645, R.attr.f11932130969646, R.attr.f12872130969740, R.attr.f14782130969931, R.attr.f14802130969933, R.attr.f14812130969934, R.attr.f16012130970054, R.attr.f16062130970059, R.attr.f16072130970060, R.attr.f16082130970061, R.attr.f16092130970062, R.attr.f16102130970063, R.attr.f16112130970064, R.attr.f16122130970065, R.attr.f16142130970067};
            public static final int ActivityResultRegistry$1 = 9;
            public static final int AnimRes = 8;
            public static final int AnimatorRes = 5;
            public static final int AnyRes = 6;
            public static final int AnyThread = 14;
            public static final int ArrayRes = 10;
            public static final int AttrRes = 13;
            public static final int BinderThread = 12;
            public static final int BoolRes = 11;
            public static final int CallSuper = 18;
            public static final int CheckResult = 17;
            public static final int ChecksSdkIntAtLeast = 19;
            public static final int ColorInt = 20;
            public static final int ColorLong = 21;
            public static final int ColorRes = 25;
            public static final int[] ComponentActivity = {16843036, 16843156, 16843157, 16843158, 16843532, 16843533};
            public static final int ComponentActivity$3 = 15;
            public static final int ComponentActivity$4 = 0;
            public static final int ComponentActivity$5 = 2;
            public static final int ContentView = 27;
            public static final int DimenRes = 26;
            public static final int Dimension = 28;
            public static final int DoNotInline = 4;
            public static final int DrawableRes = 0;
            public static final int FastBitmap$CoordinateSystem = 20;
            public static final int[] FloatRange = {16842964, R.attr.f2162130968669, R.attr.f2172130968670};
            public static final int[] FontRes = {16842960, 16842994, 16842995};
            public static final int FractionRes = 1;
            public static final int Grayscale$Algorithm = 28;
            public static final int GuardedBy = 1;
            public static final int ICustomTabsCallback = 0;
            public static final int ICustomTabsCallback$Default = 0;
            public static final int ICustomTabsCallback$Stub = 0;
            public static final int ICustomTabsCallback$Stub$Proxy = 1;
            public static final int ICustomTabsService = 4;
            public static final int ICustomTabsService$Default = 2;
            public static final int ICustomTabsService$Stub = 1;
            public static final int[] ICustomTabsService$Stub$Proxy = {16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667};
            public static final int[] IMediaControllerCallback = {16843015, R.attr.f2952130968748, R.attr.f3032130968756, R.attr.f3042130968757};
            public static final int IMediaControllerCallback$Stub = 2;
            public static final int IMediaControllerCallback$Stub$Proxy = 0;
            public static final int IMediaSession = 3;
            public static final int[] IMediaSession$Stub = {R.attr.f12202130969673, R.attr.f12272130969680};
            public static final int[] IMediaSession$Stub$Proxy = {16842970, 16843039, 16843296, 16843364, R.attr.f2082130968661, R.attr.f4392130968892, R.attr.f4782130968931, R.attr.f5592130969012, R.attr.f7482130969201, R.attr.f8062130969259, R.attr.f9162130969369, R.attr.f13212130969774, R.attr.f13222130969775, R.attr.f13742130969827, R.attr.f13752130969828, R.attr.f14772130969930, R.attr.f14862130969939, R.attr.f15682130970021, R.attr.f16912130970144};
            public static final int INotificationSideChannel = 9;
            public static final int INotificationSideChannel$Default = 13;
            public static final int INotificationSideChannel$Stub = 18;
            public static final int INotificationSideChannel$Stub$Proxy = 17;
            public static final int IPostMessageService = 0;
            public static final int IPostMessageService$Default = 1;
            public static final int IPostMessageService$Stub = 4;
            public static final int IPostMessageService$Stub$Proxy = 2;
            public static final int IResultReceiver = 0;
            public static final int IResultReceiver$Default = 1;
            public static final int IResultReceiver$Stub = 3;
            public static final int IResultReceiver$Stub$Proxy = 2;
            public static final int ITrustedWebActivityCallback = 3;
            public static final int ITrustedWebActivityCallback$Default = 6;
            public static final int ITrustedWebActivityCallback$Stub = 1;
            public static final int ITrustedWebActivityCallback$Stub$Proxy = 2;
            public static final int[] ITrustedWebActivityService = {16842804, R.attr.f1962130968649, R.attr.f1972130968650, R.attr.f1982130968651, R.attr.f1992130968652, R.attr.f2002130968653, R.attr.f5932130969046, R.attr.f5942130969047, R.attr.f5952130969048, R.attr.f5962130969049, R.attr.f5982130969051, R.attr.f5992130969052, R.attr.f6002130969053, R.attr.f6012130969054, R.attr.f6862130969139, R.attr.f7272130969180, R.attr.f7362130969189, R.attr.f9112130969364, R.attr.f10122130969465, R.attr.f15422130969995, R.attr.f15732130970026};
            public static final int ITrustedWebActivityService$Default = 8;
            public static final int ITrustedWebActivityService$Stub = 12;
            public static final int ITrustedWebActivityService$Stub$Proxy = 11;
            public static final int IconCompatParcelizer = 117;
            public static final int ImmLeaksCleaner = 4;
            public static final int IntentSenderRequest = 7;
            public static final int IsOverlapping = 7;
            public static final int Mean$Arithmetic = 27;
            public static final int MediaBrowserCompat$CustomActionResultReceiver = 1;
            public static final int MediaBrowserCompat$ItemReceiver = 118;
            public static final int MediaBrowserCompat$MediaItem = 121;
            public static final int MediaBrowserCompat$MediaItem$Flags = 119;
            public static final int MediaBrowserCompat$SearchResultReceiver = 122;
            public static final int MediaControllerCompat$Callback$StubCompat = 0;
            public static final int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = 1;
            public static final int MediaControllerCompat$MediaControllerImplApi21$ExtraCallback = 1;
            public static final int MediaDescriptionCompat = 120;
            public static final int MediaMetadataCompat = 123;
            public static final int MediaMetadataCompat$BitmapKey = 125;
            public static final int MediaMetadataCompat$LongKey = 126;
            public static final int MediaMetadataCompat$RatingKey = 124;
            public static final int[] MediaMetadataCompat$TextKey = {R.attr.f1772130968630};
            public static final int MediaSessionCompat$MediaSessionImplApi21$ExtraSession = 2;
            public static final int MediaSessionCompat$MediaSessionImplBase$MediaSessionStub = 5;
            public static final int MediaSessionCompat$QueueItem = 6;
            public static final int MediaSessionCompat$ResultReceiverWrapper = 7;
            public static final int MediaSessionCompat$SessionFlags = 3;
            public static final int MediaSessionCompat$Token = 9;
            public static final int OnBackPressedDispatcher$LifecycleOnBackPressedCancellable = 3;
            public static final int ParcelableVolumeInfo = 11;
            public static final int PlaybackStateCompat = 10;
            public static final int PlaybackStateCompat$Actions = 12;
            public static final int PlaybackStateCompat$CustomAction = 13;
            public static final int PlaybackStateCompat$ErrorCode = 18;
            public static final int[] PlaybackStateCompat$MediaKeyAction = {16842930, 16843126, 16843131, 16843362, R.attr.f12872130969740};
            public static final int PlaybackStateCompat$RepeatMode = 15;
            public static final int PlaybackStateCompat$ShuffleMode = 14;
            public static final int PlaybackStateCompat$State = 16;
            public static final int RatingCompat = 0;
            public static final int RatingCompat$StarStyle = 1;
            public static final int RatingCompat$Style = 0;
            public static final int RemoteActionCompatParcelizer = 86;
            public static final int[] ResultReceiver = {16843161};
            public static final int ResultReceiver$MyResultReceiver = 1;
            public static final int access$001 = 13;
            public static final int addContentView = 6;
            public static final int addOnContextAvailableListener = 8;
            public static final int addQueueItem = 6;
            public static final int addQueueItemAt = 5;
            public static final int adjustVolume = 3;
            public static final int api = 15;
            public static final int areNotificationsEnabled = 5;
            public static final int[] asBinder = {R.attr.f6482130969101, R.attr.f8262130969279};
            public static final int asInterface = 1;
            public static final int b = 0;
            public static final int[] cancel = {16842839, 16842926, R.attr.f1262130968579, R.attr.f1272130968580, R.attr.f1282130968581, R.attr.f1292130968582, R.attr.f1302130968583, R.attr.f1312130968584, R.attr.f1322130968585, R.attr.f1332130968586, R.attr.f1342130968587, R.attr.f1352130968588, R.attr.f1362130968589, R.attr.f1382130968591, R.attr.f1392130968592, R.attr.f1412130968594, R.attr.f1422130968595, R.attr.f1432130968596, R.attr.f1442130968597, R.attr.f1452130968598, R.attr.f1462130968599, R.attr.f1472130968600, R.attr.f1482130968601, R.attr.f1492130968602, R.attr.f1502130968603, R.attr.f1512130968604, R.attr.f1522130968605, R.attr.f1532130968606, R.attr.f1542130968607, R.attr.f1552130968608, R.attr.f1562130968609, R.attr.f1572130968610, R.attr.f1582130968611, R.attr.f1592130968612, R.attr.f1652130968618, R.attr.f1702130968623, R.attr.f1712130968624, R.attr.f1722130968625, R.attr.f1732130968626, R.attr.f1932130968646, R.attr.f2632130968716, R.attr.f2902130968743, R.attr.f2912130968744, R.attr.f2922130968745, R.attr.f2932130968746, R.attr.f2942130968747, R.attr.f3002130968753, R.attr.f3012130968754, R.attr.f3932130968846, R.attr.f4022130968855, R.attr.f4542130968907, R.attr.f4552130968908, R.attr.f4562130968909, R.attr.f4572130968910, R.attr.f4582130968911, R.attr.f4592130968912, R.attr.f4602130968913, R.attr.f4672130968920, R.attr.f4682130968921, R.attr.f4752130968928, R.attr.f5122130968965, R.attr.f5682130969021, R.attr.f5692130969022, R.attr.f5702130969023, R.attr.f5782130969031, R.attr.f5822130969035, R.attr.f6032130969056, R.attr.f6042130969057, R.attr.f6092130969062, R.attr.f6102130969063, R.attr.f6112130969064, R.attr.f7772130969230, R.attr.f8102130969263, R.attr.f10152130969468, R.attr.f10162130969469, R.attr.f10172130969470, R.attr.f10182130969471, R.attr.f10212130969474, R.attr.f10222130969475, R.attr.f10232130969476, R.attr.f10242130969477, R.attr.f10252130969478, R.attr.f10262130969479, R.attr.f10272130969480, R.attr.f10282130969481, R.attr.f10292130969482, R.attr.f12322130969685, R.attr.f12332130969686, R.attr.f12342130969687, R.attr.f12862130969739, R.attr.f12882130969741, R.attr.f13242130969777, R.attr.f13282130969781, R.attr.f13292130969782, R.attr.f13302130969783, R.attr.f13762130969829, R.attr.f13822130969835, R.attr.f13832130969836, R.attr.f13842130969837, R.attr.f14482130969901, R.attr.f14492130969902, R.attr.f14972130969950, R.attr.f15532130970006, R.attr.f15552130970008, R.attr.f15562130970009, R.attr.f15572130970010, R.attr.f15592130970012, R.attr.f15602130970013, R.attr.f15612130970014, R.attr.f15622130970015, R.attr.f15652130970018, R.attr.f15662130970019, R.attr.f16172130970070, R.attr.f16182130970071, R.attr.f16192130970072, R.attr.f16202130970073, R.attr.f16872130970140, R.attr.f17082130970161, R.attr.f17092130970162, R.attr.f17102130970163, R.attr.f17112130970164, R.attr.f17122130970165, R.attr.f17132130970166, R.attr.f17142130970167, R.attr.f17152130970168, R.attr.f17162130970169, R.attr.f17172130970170};
            public static final int cancelAll = 14;
            public static final int cancelNotification = 6;
            public static final int codename = 22;
            public static final int[] create = new int[0];
            public static final int ensureViewModelStore = 1;
            public static final int equals = 12;
            public static final int extraCallback = 0;
            public static final int extraCallbackWithResult = 4;
            public static final int extraCommand = 7;
            public static final int fastForward = 19;
            public static final int[] from = {16842752, 16842970, R.attr.f12222130969675, R.attr.f12262130969679, R.attr.f15812130970034};
            public static final int fromInclusive = 0;
            public static final int getActiveNotifications = 3;
            public static final int getActivityResultRegistry = 11;
            public static final int[] getCause = {16843071};
            public static final int getDefaultImpl = 2;
            public static final int getDefaultViewModelProviderFactory = 12;
            public static final int getExtras = 2;
            public static final int[] getFlags = {16842766, 16842960, 16843156, 16843230, 16843231, 16843232};
            public static final int getInterfaceDescriptor = 3;
            public static final int getLastCustomNonConfigurationInstance = 4;
            public static final int getLaunchPendingIntent = 0;
            public static final int getLifecycle = 10;
            public static final int getMax = 1;
            public static final int getMetadata = 5;
            public static final int getMin = 0;
            public static final int[] getOnBackPressedDispatcher = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.f7272130969180, R.attr.f7362130969189, R.attr.f15422130969995, R.attr.f15732130970026};
            public static final int[] getPackageName = {16843436, 16843437};
            public static final int getPlaybackState = 1;
            public static final int getQueue = 2;
            public static final int getQueueTitle = 1;
            public static final int[] getRatingType = {16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, R.attr.f1402130968593, R.attr.f1602130968613, R.attr.f1632130968616, R.attr.f1792130968632, R.attr.f4962130968949, R.attr.f7962130969249, R.attr.f7972130969250, R.attr.f12062130969659, R.attr.f14042130969857, R.attr.f16222130970075};
            public static final int getRepeatMode = 0;
            public static final int getSavedStateRegistry = 5;
            public static final int getShuffleMode = 4;
            public static final int getSmallIconBitmap = 7;
            public static final int getSmallIconId = 4;
            public static final int getTag = 1;
            public static final int getViewModelStore = 13;
            public static final int getVolumeAttributes = 0;
            public static final int hashCode = 17;
            public static final int initViewTreeOwners = 7;
            public static final int[] invoke = {16842931};
            public static final int invokeSuspend = 26;
            public static final int isCaptioningEnabled = 3;
            public static final int isInside = 10;
            public static final int isShuffleModeEnabledRemoved = 8;
            public static final int isTransportControlEnabled = 5;
            public static final int lambda = 24;
            public static final int[] length = {R.attr.f2062130968659, R.attr.f2142130968667, R.attr.f2152130968668, R.attr.f4972130968950, R.attr.f4982130968951, R.attr.f4992130968952, R.attr.f5002130968953, R.attr.f5012130968954, R.attr.f5022130968955, R.attr.f5462130968999, R.attr.f5722130969025, R.attr.f5742130969027, R.attr.f6162130969069, R.attr.f7622130969215, R.attr.f7692130969222, R.attr.f7772130969230, R.attr.f7782130969231, R.attr.f7882130969241, R.attr.f8142130969267, R.attr.f8662130969319, R.attr.f10322130969485, R.attr.f11952130969648, R.attr.f12872130969740, R.attr.f13042130969757, R.attr.f13052130969758, R.attr.f14782130969931, R.attr.f14822130969935, R.attr.f16012130970054, R.attr.f16152130970068};
            public static final int[] mayLaunchUrl = {16843036, 16843156, 16843157, 16843158, 16843532, 16843533};
            public static final int[] newSession = {16843161, 16843849, 16843850, 16843851};
            public static final int newSessionWithExtras = 6;
            public static final int next = 22;
            public static final int notify = 10;
            public static final int notifyNotificationWithChannel = 5;
            public static final int onActivityResult = 3;
            public static final int onBackPressed = 0;
            public static final int[] onCaptioningEnabledChanged = {16843173, 16844052};
            public static final int onCreate = 0;
            public static final int[] onEvent = {16843173, 16843551, R.attr.f1782130968631};
            public static final int onExtraCallback = 0;
            public static final int[] onExtrasChanged = {16842755, 16842961};
            public static final int onMessageChannelReady = 2;
            public static final int onMetadataChanged = 2;
            public static final int[] onNavigationEvent = {R.attr.f2062130968659, R.attr.f2142130968667, R.attr.f4462130968899, R.attr.f7622130969215, R.attr.f14822130969935, R.attr.f16152130970068};
            public static final int[] onPlaybackStateChanged = {R.attr.f7282130969181, R.attr.f7292130969182, R.attr.f7302130969183, R.attr.f7312130969184, R.attr.f7322130969185, R.attr.f7332130969186, R.attr.f7342130969187};
            public static final int onPostMessage = 3;
            public static final int[] onQueueChanged = {16844082, 16844083, 16844095, 16844143, 16844144, R.attr.f7262130969179, R.attr.f7352130969188, R.attr.f7362130969189, R.attr.f7372130969190, R.attr.f16472130970100};
            public static final int[] onQueueTitleChanged = {R.attr.f1902130968643, R.attr.f1912130968644, R.attr.f2222130968675, R.attr.f4532130968906, R.attr.f5972130969050, R.attr.f7412130969194, R.attr.f14472130969900, R.attr.f15832130970036};
            public static final int onRelationshipValidationResult = 5;
            public static final int[] onRepeatModeChanged = {16842755, 16842960, 16842961};
            public static final int onRequestPermissionsResult = 4;
            public static final int onRetainCustomNonConfigurationInstance = 5;
            public static final int onRetainNonConfigurationInstance = 3;
            public static final int[] onSaveInstanceState = {16843044, 16843045, 16843074, R.attr.f14172130969870, R.attr.f14502130969903, R.attr.f14952130969948, R.attr.f14962130969949, R.attr.f14982130969951, R.attr.f15892130970042, R.attr.f15902130970043, R.attr.f15912130970044, R.attr.f16302130970083, R.attr.f16372130970090, R.attr.f16382130970091};
            public static final int onSessionDestroyed = 3;
            public static final int onSessionReady = 1;
            public static final int onShuffleModeChanged = 4;
            public static final int[] onShuffleModeChangedRemoved = {16842927, 16842948, 16843046, 16843047, 16843048, R.attr.f5742130969027, R.attr.f5792130969032, R.attr.f11282130969581, R.attr.f14122130969865};
            public static final int[] onTransact = {16842994, R.attr.f2972130968750, R.attr.f2982130968751, R.attr.f10192130969472, R.attr.f10202130969473, R.attr.f11912130969644, R.attr.f14182130969871, R.attr.f14242130969877};
            public static final int[] onVolumeInfoChanged = {16843165, 16843166, 16843169, 16843170, 16843171, 16843172, 16843265, 16843275, 16844048, 16844049, 16844050, 16844051};
            public static final int parameter = 23;
            public static final int[] pause = {16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, R.attr.f12972130969750, R.attr.f14762130969929};
            public static final int peekAvailableContext = 11;
            public static final int play = 14;
            public static final int playFromMediaId = 15;
            public static final int playFromSearch = 16;
            public static final int playFromUri = 17;
            public static final int[] postMessage = {16843033, R.attr.f14512130969904, R.attr.f15992130970052, R.attr.f16002130970053};
            public static final int postToHandler = 8;
            public static final int prepare = 12;
            public static final int prepareFromMediaId = 10;
            public static final int prepareFromSearch = 13;
            public static final int prepareFromUri = 11;
            public static final int previous = 20;
            public static final int rate = 8;
            public static final int[] rateWithExtras = {16843126, 16843465, R.attr.f12172130969670};
            public static final int read = 116;
            public static final int receiveFile = 3;
            public static final int registerCallbackListener = 7;
            public static final int registerForActivityResult = 14;
            public static final int removeOnContextAvailableListener = 9;
            public static final int removeQueueItem = 7;
            public static final int removeQueueItemAt = 9;
            public static final int reportFullyDrawn = 12;
            public static final int[] requestPostMessageChannel = {16843074, R.attr.f15952130970048, R.attr.f15962130970049, R.attr.f15972130970050};
            public static final int requestPostMessageChannelWithExtras = 3;
            public static final int rewind = 1;
            public static final int seekTo = 7;
            public static final int send = 4;
            public static final int[] sendCommand = {16842931, 16842996, 16842997, 16843137};
            public static final int sendCustomAction = 0;
            public static final int sendMediaButton = 6;
            public static final int setCaptioningEnabled = 5;
            public static final int setContentView = 2;
            public static final int setDefaultImpl = 5;
            public static final int setMax = 2;
            public static final int setMin = 3;
            public static final int setRepeatMode = 0;
            public static final int setShuffleMode = 2;
            public static final int[] setShuffleModeEnabledRemoved = {R.attr.f14622130969915};
            public static final int setVolumeTo = 4;
            public static final int skipToQueueItem = 18;
            public static final int startActivityForResult = 2;
            public static final int startIntentSenderForResult = 10;
            public static final int stop = 21;
            public static final int suggest = 16;
            public static final int to = 0;
            public static final int toDoubleRange = 14;
            public static final int toFloatRange = 13;
            public static final int toInclusive = 2;
            public static final int toIntRange = 9;
            public static final int toString = 15;
            public static final int unit = 29;
            public static final int unregisterCallbackListener = 8;
            public static final int updateVisuals = 2;
            public static final int validateRelationship = 1;
            public static final int value = 2;
            public static final int valueOf = 25;
            public static final int values = 22;
            public static final int[] warmup = {16842960, 16843161};
            public static final int write = 0;
        }

        public final class Proxy {

            public static final class getMin extends areNotificationsEnabled<Intent, ActivityResult> {
                @NonNull
                public final /* bridge */ /* synthetic */ Intent setMax(@NonNull Context context, @NonNull Object obj) {
                    return (Intent) obj;
                }

                @NonNull
                public final /* synthetic */ Object setMin(int i, @Nullable Intent intent) {
                    return new ActivityResult(i, intent);
                }
            }

            public static final class getMax extends areNotificationsEnabled<IntentSenderRequest, ActivityResult> {
                @NonNull
                public final /* synthetic */ Intent setMax(@NonNull Context context, @NonNull Object obj) {
                    return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (IntentSenderRequest) obj);
                }

                @NonNull
                public final /* synthetic */ Object setMin(int i, @Nullable Intent intent) {
                    return new ActivityResult(i, intent);
                }
            }

            public static final class setMin extends areNotificationsEnabled<String[], Map<String, Boolean>> {
                @Nullable
                public final /* synthetic */ areNotificationsEnabled.setMin length(@NonNull Context context, @Nullable Object obj) {
                    String[] strArr = (String[]) obj;
                    if (strArr == null || strArr.length == 0) {
                        return new areNotificationsEnabled.setMin(Collections.emptyMap());
                    }
                    PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat();
                    boolean z = true;
                    for (String str : strArr) {
                        boolean z2 = IntRange.length(context, str) == 0;
                        playbackStateCompat.put(str, Boolean.valueOf(z2));
                        if (!z2) {
                            z = false;
                        }
                    }
                    if (z) {
                        return new areNotificationsEnabled.setMin(playbackStateCompat);
                    }
                    return null;
                }

                @NonNull
                public final /* synthetic */ Intent setMax(@NonNull Context context, @NonNull Object obj) {
                    return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
                }

                @NonNull
                public final /* synthetic */ Object setMin(int i, @Nullable Intent intent) {
                    if (i != -1) {
                        return Collections.emptyMap();
                    }
                    if (intent == null) {
                        return Collections.emptyMap();
                    }
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra == null || stringArrayExtra == null) {
                        return Collections.emptyMap();
                    }
                    HashMap hashMap = new HashMap();
                    int length = stringArrayExtra.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        hashMap.put(stringArrayExtra[i2], Boolean.valueOf(intArrayExtra[i2] == 0));
                    }
                    return hashMap;
                }
            }

            public static final class length extends areNotificationsEnabled<Void, Uri> {
                @Nullable
                public final /* synthetic */ Object setMin(int i, @Nullable Intent intent) {
                    if (intent == null || i != -1) {
                        return null;
                    }
                    return intent.getData();
                }

                @NonNull
                public final /* synthetic */ Intent setMax(@NonNull Context context, @Nullable Object obj) {
                    return new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
                }
            }
        }
    }
}
