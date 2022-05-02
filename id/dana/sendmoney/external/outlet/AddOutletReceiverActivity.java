package id.dana.sendmoney.external.outlet;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.DatePicker;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.di.modules.AddOutletReceiverModule;
import id.dana.richview.CurrencyTextView;
import id.dana.richview.CustomEditText;
import id.dana.richview.LogoListView;
import id.dana.sendmoney.TransactionType;
import id.dana.sendmoney.calculator.CalculatorActivity;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.RecipientSource;
import id.dana.sendmoney.recipient.RecipientType;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.ConfirmPopup;
import o.ImageInfoBridgeExtension;
import o.PrepareException;
import o.RVPluginResourceManager;
import o.RedDotDrawable;
import o.RedDotManager;
import o.TitleBarRightButtonView;
import o.WheelView;
import o.dispatchOnCancelled;
import o.getDefaultProxy;
import o.isOriginHasAppInfo;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onLoadChildren;
import o.resetInternal;
import o.saveActionViewStates;
import o.setOnWheelViewListener;
import o.setShow;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 32\u00020\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016H\u0002J\b\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0002J\b\u0010\u001a\u001a\u00020\nH\u0002J\"\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0012\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0016H\u0002J\b\u0010%\u001a\u00020\nH\u0002J\u0010\u0010&\u001a\n \u0017*\u0004\u0018\u00010'0'H\u0002J\u0010\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\rH\u0002J\u001c\u0010-\u001a\u00020\n*\u00020.2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020'H\u0002J\f\u00101\u001a\u00020\n*\u000202H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u00064"}, d2 = {"Lid/dana/sendmoney/external/outlet/AddOutletReceiverActivity;", "Lid/dana/base/BaseActivity;", "()V", "addOutletReceiverPresenter", "Lid/dana/sendmoney/external/outlet/AddOutletReceiverContract$Presenter;", "getAddOutletReceiverPresenter", "()Lid/dana/sendmoney/external/outlet/AddOutletReceiverContract$Presenter;", "setAddOutletReceiverPresenter", "(Lid/dana/sendmoney/external/outlet/AddOutletReceiverContract$Presenter;)V", "configToolbar", "", "getDateOfBirthValidatorOberver", "Lio/reactivex/Observable;", "", "getLayout", "", "getNameValidatorOberver", "getOutletLogos", "getPhoneNumberValidatorOberver", "getReceiverInfoValidatorObserver", "Lio/reactivex/disposables/Disposable;", "getRecipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "kotlin.jvm.PlatformType", "init", "initInjector", "initViews", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClickLeftMenuButton", "view", "Landroid/view/View;", "openCalculatorPage", "recipientModel", "openContactPicker", "parseDate", "", "setPhoneNumber", "contactsData", "Landroid/net/Uri;", "setSubmitButtonEnabled", "isEnable", "setEnable", "Lid/dana/component/buttoncomponent/DanaButtonPrimaryView;", "enabled", "text", "showDatePicker", "Lid/dana/richview/CustomEditText;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AddOutletReceiverActivity extends BaseActivity {
    @NotNull
    public static final setMin Companion = new setMin((byte) 0);
    @Inject
    public ImageInfoBridgeExtension.AnonymousClass1.setMin addOutletReceiverPresenter;
    private HashMap getMin;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || 1936809671 == (max = dispatchOnCancelled.getMax(applicationContext, 1936809671))) {
            return R.layout.activity_add_outlet_receiver;
        }
        onCanceled oncanceled = new onCanceled(1936809671, max, 512);
        onCancelLoad.setMax(1936809671, oncanceled);
        onCancelLoad.getMin(1936809671, oncanceled);
        return R.layout.activity_add_outlet_receiver;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "name", "", "apply", "(Ljava/lang/CharSequence;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<CharSequence, Boolean> {
        public static final getMax length = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence == null) {
                return null;
            }
            return Boolean.valueOf(charSequence.length() > 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "phoneNumber", "", "apply", "(Ljava/lang/CharSequence;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<CharSequence, Boolean> {
        public static final getMin setMax = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence == null) {
                return null;
            }
            return Boolean.valueOf(charSequence.length() > 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "phoneNumberValid", "nameValid", "dateOfBirthValid", "apply", "(ZZZ)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class length<T1, T2, T3, R> implements setShow<Boolean, Boolean, Boolean, Boolean> {
        public static final length setMax = new length();

        length() {
        }

        public final /* synthetic */ Object getMin(Object obj, Object obj2, Object obj3) {
            return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue() && ((Boolean) obj3).booleanValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "date", "", "apply", "(Ljava/lang/CharSequence;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<CharSequence, Boolean> {
        public static final setMax setMin = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence == null) {
                return null;
            }
            return Boolean.valueOf(charSequence.length() > 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "receiverInfoValid", "", "accept"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<T> implements RedDotManager<Boolean> {
        final /* synthetic */ AddOutletReceiverActivity getMin;

        toIntRange(AddOutletReceiverActivity addOutletReceiverActivity) {
            this.getMin = addOutletReceiverActivity;
        }

        public final /* synthetic */ void accept(Object obj) {
            AddOutletReceiverActivity.access$setSubmitButtonEnabled(this.getMin, ((Boolean) obj).booleanValue());
        }
    }

    @NotNull
    public final ImageInfoBridgeExtension.AnonymousClass1.setMin getAddOutletReceiverPresenter() {
        ImageInfoBridgeExtension.AnonymousClass1.setMin setmin = this.addOutletReceiverPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addOutletReceiverPresenter");
        }
        return setmin;
    }

    public final void setAddOutletReceiverPresenter(@NotNull ImageInfoBridgeExtension.AnonymousClass1.setMin setmin) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-2143914847, oncanceled);
            onCancelLoad.getMin(-2143914847, oncanceled);
        }
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.addOutletReceiverPresenter = setmin;
    }

    public final void configToolbar() {
        setCenterTitle(getString(R.string.sendmoney_external_outletaddreceiver_toolbar_title));
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"id/dana/sendmoney/external/outlet/AddOutletReceiverActivity$initInjector$1", "Lid/dana/sendmoney/external/outlet/AddOutletReceiverContract$View;", "onGetOutletLogos", "", "cdpContents", "", "Lid/dana/domain/promotion/CdpContent;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals implements ImageInfoBridgeExtension.AnonymousClass1.getMin {
        final /* synthetic */ AddOutletReceiverActivity setMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        equals(AddOutletReceiverActivity addOutletReceiverActivity) {
            this.setMax = addOutletReceiverActivity;
        }

        public final void getMax(@NotNull List<? extends getDefaultProxy> list) {
            Intrinsics.checkNotNullParameter(list, "cdpContents");
            ((LogoListView) this.setMax._$_findCachedViewById(resetInternal.setMax.getHeaderView)).setLogo(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements View.OnClickListener {
        final /* synthetic */ AddOutletReceiverActivity length;

        toFloatRange(AddOutletReceiverActivity addOutletReceiverActivity) {
            this.length = addOutletReceiverActivity;
        }

        public final void onClick(View view) {
            this.length.startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.CommonDataKinds.Phone.CONTENT_URI), 200);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements View.OnClickListener {
        final /* synthetic */ AddOutletReceiverActivity getMax;

        isInside(AddOutletReceiverActivity addOutletReceiverActivity) {
            this.getMax = addOutletReceiverActivity;
        }

        public final void onClick(View view) {
            CustomEditText customEditText = (CustomEditText) this.getMax._$_findCachedViewById(resetInternal.setMax.registerCallbackListener);
            if (customEditText != null) {
                AddOutletReceiverActivity.access$showDatePicker(this.getMax, customEditText);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnClickListener {
        final /* synthetic */ AddOutletReceiverActivity getMax;

        IsOverlapping(AddOutletReceiverActivity addOutletReceiverActivity) {
            this.getMax = addOutletReceiverActivity;
        }

        public final void onClick(View view) {
            AddOutletReceiverActivity addOutletReceiverActivity = this.getMax;
            RecipientModel access$getRecipientModel = AddOutletReceiverActivity.access$getRecipientModel(addOutletReceiverActivity);
            Intrinsics.checkNotNullExpressionValue(access$getRecipientModel, "getRecipientModel()");
            AddOutletReceiverActivity.access$openCalculatorPage(addOutletReceiverActivity, access$getRecipientModel);
        }
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Uri data;
        CustomEditText customEditText;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-1851089698, oncanceled);
            onCancelLoad.getMin(-1851089698, oncanceled);
        }
        super.onActivityResult(i, i2, intent);
        if (i == 200 && i2 == -1 && intent != null && (data = intent.getData()) != null) {
            Intrinsics.checkNotNullExpressionValue(data, "phoneNumber");
            Cursor max = new saveActionViewStates(this, data).loadInBackground();
            if (max != null && max.moveToFirst() && (customEditText = (CustomEditText) _$_findCachedViewById(resetInternal.setMax.isTransportControlEnabled)) != null) {
                customEditText.setText(isOriginHasAppInfo.getIndoPhoneNumber(max.getString(max.getColumnIndex("data1"))));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/DatePicker;", "year", "", "month", "dayOfMonth", "onDateSet"}, k = 3, mv = {1, 4, 2})
    static final class hashCode implements DatePickerDialog.OnDateSetListener {
        final /* synthetic */ CustomEditText getMin;

        hashCode(CustomEditText customEditText) {
            this.getMin = customEditText;
        }

        public final void onDateSet(@Nullable DatePicker datePicker, int i, int i2, int i3) {
            CustomEditText customEditText = this.getMin;
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            sb.append("-");
            sb.append(i2 + 1);
            sb.append("-");
            sb.append(i);
            customEditText.setText(sb.toString());
        }
    }

    public final void onClickLeftMenuButton(@Nullable View view) {
        onBackPressed();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/sendmoney/external/outlet/AddOutletReceiverActivity$Companion;", "", "()V", "CONVERT_DATE_FORMAT", "", "DATE_FORMAT", "INDEX_TO_MONTH_INCREMENTAL", "", "PICK_CONTACT", "startActivity", "", "activity", "Landroid/app/Activity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }

        public static void getMin(@Nullable Activity activity) {
            if (activity != null) {
                activity.startActivity(new Intent(activity, AddOutletReceiverActivity.class));
            }
        }
    }

    public final void init() {
        RVPluginResourceManager.getMax getmax = new RVPluginResourceManager.getMax((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            getmax.setMin = applicationComponent;
            getmax.getMax = new AddOutletReceiverModule(new equals(this));
            stopIgnoring.setMin(getmax.getMax, AddOutletReceiverModule.class);
            stopIgnoring.setMin(getmax.setMin, PrepareException.AnonymousClass1.class);
            new RVPluginResourceManager(getmax.getMax, getmax.setMin, (byte) 0).getMax(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            ImageInfoBridgeExtension.AnonymousClass1.setMin setmin = this.addOutletReceiverPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("addOutletReceiverPresenter");
            }
            getminArr[0] = setmin;
            registerPresenter(getminArr);
            int max = dispatchOnCancelled.getMax(0);
            if (max != 0) {
                onCanceled oncanceled = new onCanceled(0, max, 16);
                onCancelLoad.setMax(-766644877, oncanceled);
                onCancelLoad.getMin(-766644877, oncanceled);
            }
            ImageInfoBridgeExtension.AnonymousClass1.setMin setmin2 = this.addOutletReceiverPresenter;
            if (setmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("addOutletReceiverPresenter");
            }
            setmin2.getMin();
            CustomEditText customEditText = (CustomEditText) _$_findCachedViewById(resetInternal.setMax.isTransportControlEnabled);
            if (customEditText != null) {
                customEditText.setOnIconClickListener(new toFloatRange(this));
            }
            CustomEditText customEditText2 = (CustomEditText) _$_findCachedViewById(resetInternal.setMax.registerCallbackListener);
            if (customEditText2 != null) {
                customEditText2.setOnEtCustomEditTextClicked(new isInside(this));
            }
            DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.values);
            if (danaButtonPrimaryView != null) {
                danaButtonPrimaryView.setOnClickListener(new IsOverlapping(this));
            }
            CustomEditText customEditText3 = (CustomEditText) _$_findCachedViewById(resetInternal.setMax.isTransportControlEnabled);
            Intrinsics.checkNotNullExpressionValue(customEditText3, "cetReceiverPhoneNumber");
            CustomEditText customEditText4 = (CustomEditText) _$_findCachedViewById(resetInternal.setMax.sendCommand);
            Intrinsics.checkNotNullExpressionValue(customEditText4, "cetReceiverName");
            CustomEditText customEditText5 = (CustomEditText) _$_findCachedViewById(resetInternal.setMax.registerCallbackListener);
            Intrinsics.checkNotNullExpressionValue(customEditText5, "cetReceiverDateOfBirth");
            addDisposable(TitleBarRightButtonView.AnonymousClass1.combineLatest(onLoadChildren.textChanges(customEditText3.getEtCustomEditText()).map(getMin.setMax), onLoadChildren.textChanges(customEditText4.getEtCustomEditText()).map(getMax.length), onLoadChildren.textChanges(customEditText5.getEtCustomEditText()).map(setMax.setMin), length.setMax).subscribe(new toIntRange(this)));
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$showDatePicker(AddOutletReceiverActivity addOutletReceiverActivity, CustomEditText customEditText) {
        ConfirmPopup.AnonymousClass1.length(addOutletReceiverActivity, new hashCode(customEditText)).show();
        setOnWheelViewListener.length((View) customEditText);
    }

    public static final /* synthetic */ void access$openCalculatorPage(AddOutletReceiverActivity addOutletReceiverActivity, RecipientModel recipientModel) {
        Intent intentClassWithTracking = addOutletReceiverActivity.getIntentClassWithTracking(CalculatorActivity.class);
        intentClassWithTracking.putExtra("data", recipientModel);
        intentClassWithTracking.putExtra("transferScenario", TransactionType.SEND_MONEY_TO_CASHIER);
        addOutletReceiverActivity.startActivity(intentClassWithTracking);
    }

    public static final /* synthetic */ RecipientModel access$getRecipientModel(AddOutletReceiverActivity addOutletReceiverActivity) {
        RecipientModel.length length2 = new RecipientModel.length(RecipientType.OTC);
        length2.toString = TransactionType.SEND_MONEY_TO_CASHIER;
        CustomEditText customEditText = (CustomEditText) addOutletReceiverActivity._$_findCachedViewById(resetInternal.setMax.sendCommand);
        String str = null;
        length2.isInside = customEditText != null ? customEditText.getText() : null;
        CustomEditText customEditText2 = (CustomEditText) addOutletReceiverActivity._$_findCachedViewById(resetInternal.setMax.isTransportControlEnabled);
        length2.toIntRange = customEditText2 != null ? customEditText2.getText() : null;
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        Locale locale = WheelView.OnWheelViewListener.getMax;
        CustomEditText customEditText3 = (CustomEditText) addOutletReceiverActivity._$_findCachedViewById(resetInternal.setMax.registerCallbackListener);
        if (customEditText3 != null) {
            str = customEditText3.getText();
        }
        length2.valueOf = ConfirmPopup.AnonymousClass1.getMax("dd-MM-yyyy", "yyyy-MM-dd", locale, str);
        length2.setMin = addOutletReceiverActivity.getSource();
        CustomEditText customEditText4 = (CustomEditText) addOutletReceiverActivity._$_findCachedViewById(resetInternal.setMax.isTransportControlEnabled);
        Intrinsics.checkNotNullExpressionValue(customEditText4, "cetReceiverPhoneNumber");
        length2.setMax = customEditText4.isManualInput() ? RecipientSource.MANUAL_INPUT : RecipientSource.ALL_CONTACTS;
        return length2.length();
    }

    public static final /* synthetic */ void access$setSubmitButtonEnabled(AddOutletReceiverActivity addOutletReceiverActivity, boolean z) {
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) addOutletReceiverActivity._$_findCachedViewById(resetInternal.setMax.values);
        if (danaButtonPrimaryView != null) {
            String string = addOutletReceiverActivity.getResources().getString(R.string.submit);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.submit)");
            danaButtonPrimaryView.setClickable(z);
            danaButtonPrimaryView.setEnabled(z);
            danaButtonPrimaryView.setDanaButtonView(z ? 1 : 0, string, (String) null, (Drawable) null);
        }
    }
}
