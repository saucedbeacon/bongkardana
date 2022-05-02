package id.dana.openbankaccount;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.danah5.DanaH5;
import id.dana.data.constant.UrlTag;
import id.dana.di.modules.OpenBankAccountModule;
import id.dana.openbankaccount.constant.BankAccountProcessState;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BaseStoragePackage;
import o.ChooseFileActivityResultExtensionImpl;
import o.ChooseFileBridgeExtension;
import o.FileBridgeExtension;
import o.PrepareException;
import o.deleteFile;
import o.isShowMenu;
import o.onDelete;
import o.onPageScrolled;
import o.resetInternal;
import o.sendUserDenyCallback;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u001a\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u0012\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u001cH\u0002J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0003J\b\u0010%\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020\u001cH\u0002J\b\u0010'\u001a\u00020\u001cH\u0002J\b\u0010(\u001a\u00020\u001cH\u0016J\b\u0010)\u001a\u00020\u001cH\u0002J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u0007H\u0002J\b\u0010,\u001a\u00020\u001cH\u0002J\u0016\u0010-\u001a\u00020\u001c2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0003J\b\u00101\u001a\u00020\u001cH\u0002J\b\u00102\u001a\u00020\u001cH\u0002J\u0010\u00103\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\fH\u0003J\b\u00104\u001a\u00020\u001cH\u0002J\u0010\u00105\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u00106\u001a\u00020\u001cH\u0002J\b\u00107\u001a\u00020\u001cH\u0002J\b\u00108\u001a\u00020\u001cH\u0002J\b\u00109\u001a\u00020\u001cH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lid/dana/openbankaccount/OpenBankAccountView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "applicationStatus", "", "bannerUrl", "confirmUrl", "instId", "listBankUrl", "openBankAccountEnable", "", "presenter", "Lid/dana/contract/openbankaccount/OpenBankAccountContract$Presenter;", "getPresenter", "()Lid/dana/contract/openbankaccount/OpenBankAccountContract$Presenter;", "setPresenter", "(Lid/dana/contract/openbankaccount/OpenBankAccountContract$Presenter;)V", "verifyUrl", "getLayout", "hideBankAccountItem", "", "hideOpenBankAccount", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "loadBanner", "mapBankAccountList", "bankAccounts", "Lid/dana/openbankaccount/model/BankAccountsModel;", "openBankListPage", "openConfirmPage", "openVerifyPage", "setup", "showAcknowledgeState", "showAllBankAccount", "bankListSize", "showApproveState", "showBankAccount", "bankAccountList", "", "Lid/dana/openbankaccount/model/BankAccountInfo;", "showBankAccountItem", "showButtonState", "showLogo", "showOpenBankAccount", "showProcessState", "showRejectState", "showSubmitState", "showTextState", "showVerifyState", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OpenBankAccountView extends BaseRichView {
    /* access modifiers changed from: private */
    public String IsOverlapping;
    /* access modifiers changed from: private */
    public String equals;
    /* access modifiers changed from: private */
    public boolean getMax;
    /* access modifiers changed from: private */
    public String getMin;
    private String length;
    @Inject
    public onPageScrolled.setMax presenter;
    /* access modifiers changed from: private */
    public String setMax;
    /* access modifiers changed from: private */
    public String setMin;
    private HashMap toFloatRange;

    @JvmOverloads
    public OpenBankAccountView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public OpenBankAccountView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toFloatRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.toFloatRange == null) {
            this.toFloatRange = new HashMap();
        }
        View view = (View) this.toFloatRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toFloatRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_open_bank_account_entry_point;
    }

    public static final /* synthetic */ String access$getConfirmUrl$p(OpenBankAccountView openBankAccountView) {
        String str = openBankAccountView.equals;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmUrl");
        }
        return str;
    }

    public static final /* synthetic */ String access$getListBankUrl$p(OpenBankAccountView openBankAccountView) {
        String str = openBankAccountView.setMin;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listBankUrl");
        }
        return str;
    }

    public static final /* synthetic */ String access$getVerifyUrl$p(OpenBankAccountView openBankAccountView) {
        String str = openBankAccountView.IsOverlapping;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("verifyUrl");
        }
        return str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OpenBankAccountView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OpenBankAccountView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMax = "";
        this.getMin = "";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public OpenBankAccountView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMax = "";
        this.getMin = "";
    }

    @NotNull
    public final onPageScrolled.setMax getPresenter() {
        onPageScrolled.setMax setmax = this.presenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return setmax;
    }

    public final void setPresenter(@NotNull onPageScrolled.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        this.presenter = setmax;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ OpenBankAccountView setMin;

        getMin(OpenBankAccountView openBankAccountView) {
            this.setMin = openBankAccountView;
        }

        public final void onClick(View view) {
            OpenBankAccountView.access$openBankListPage(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ OpenBankAccountView length;

        setMin(OpenBankAccountView openBankAccountView) {
            this.length = openBankAccountView;
        }

        public final void onClick(View view) {
            String access$getApplicationStatus$p = this.length.setMax;
            if (Intrinsics.areEqual((Object) access$getApplicationStatus$p, (Object) BankAccountProcessState.ACKNOWLEDGE.toString())) {
                OpenBankAccountView.access$openVerifyPage(this.length);
            } else if (Intrinsics.areEqual((Object) access$getApplicationStatus$p, (Object) BankAccountProcessState.CONFIRM.toString())) {
                OpenBankAccountView.access$openConfirmPage(this.length);
            } else {
                OpenBankAccountView.access$openBankListPage(this.length);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"id/dana/openbankaccount/OpenBankAccountView$injectComponent$1", "Lid/dana/contract/openbankaccount/OpenBankAccountContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onGetBankInfoListSuccess", "bankAccounts", "Lid/dana/openbankaccount/model/BankAccountsModel;", "onGetConfigBankAccount", "configBankAccountModel", "Lid/dana/openbankaccount/model/ConfigBankAccountModel;", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements onPageScrolled.setMin {
        final /* synthetic */ OpenBankAccountView getMax;

        public final void dismissProgress() {
        }

        public final void showProgress() {
        }

        getMax(OpenBankAccountView openBankAccountView) {
            this.getMax = openBankAccountView;
        }

        public final void getMax(@NotNull sendUserDenyCallback senduserdenycallback) {
            Intrinsics.checkNotNullParameter(senduserdenycallback, "configBankAccountModel");
            this.getMax.getMax = senduserdenycallback.length();
            this.getMax.getMin = senduserdenycallback.setMax;
            this.getMax.setMin = senduserdenycallback.setMin;
            this.getMax.IsOverlapping = senduserdenycallback.getMax;
            this.getMax.equals = senduserdenycallback.length;
            OpenBankAccountView.access$loadBanner(this.getMax);
            this.getMax.getPresenter().getMax();
        }

        public final void setMax(@NotNull ChooseFileBridgeExtension chooseFileBridgeExtension) {
            Intrinsics.checkNotNullParameter(chooseFileBridgeExtension, "bankAccounts");
            OpenBankAccountView.access$mapBankAccountList(this.getMax, chooseFileBridgeExtension);
        }

        public final void onError(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "errorMessage");
            OpenBankAccountView.access$hideBankAccountItem(this.getMax);
        }
    }

    @SuppressLint({"DefaultLocale"})
    private final void getMin(List<ChooseFileActivityResultExtensionImpl> list) {
        TextView textView;
        for (ChooseFileActivityResultExtensionImpl chooseFileActivityResultExtensionImpl : list) {
            this.length = chooseFileActivityResultExtensionImpl.setMin;
            this.setMax = chooseFileActivityResultExtensionImpl.getMax;
            String str = this.length;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException(UrlTag.INSTID);
            }
            if (str != null) {
                String upperCase = str.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
                FileBridgeExtension min = deleteFile.setMin(upperCase);
                Intrinsics.checkNotNullExpressionValue(min, "PayCardViewItemFactory.c…ate(instId.toUpperCase())");
                ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.closeOptionsMenu);
                if (imageView != null) {
                    imageView.setImageResource(min.getMin);
                }
                TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.getSwitchPadding);
                if (textView2 != null) {
                    textView2.setText(chooseFileActivityResultExtensionImpl.getMin);
                }
                String str2 = this.setMax;
                if (Intrinsics.areEqual((Object) str2, (Object) BankAccountProcessState.ACKNOWLEDGE.toString())) {
                    Button button = (Button) _$_findCachedViewById(resetInternal.setMax.IPostMessageService$Stub$Proxy);
                    if (button != null) {
                        button.setText(getContext().getString(R.string.bank_account_verify));
                    }
                    setMin();
                } else if (Intrinsics.areEqual((Object) str2, (Object) BankAccountProcessState.VERIFY.toString())) {
                    TextView textView3 = (TextView) _$_findCachedViewById(resetInternal.setMax.setSwitchMinWidth);
                    if (textView3 != null) {
                        textView3.setText(getContext().getString(R.string.bank_account_verifying));
                    }
                    setMax();
                } else if (Intrinsics.areEqual((Object) str2, (Object) BankAccountProcessState.REJECT.toString())) {
                    TextView textView4 = (TextView) _$_findCachedViewById(resetInternal.setMax.setSwitchMinWidth);
                    if (textView4 != null) {
                        textView4.setText(getContext().getString(R.string.bank_account_registration_failed));
                    }
                    if (Build.VERSION.SDK_INT >= 23 && (textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setSwitchMinWidth)) != null) {
                        textView.setTextColor(getContext().getColorStateList(R.color.f18262131099692));
                    }
                    setMax();
                } else if (Intrinsics.areEqual((Object) str2, (Object) BankAccountProcessState.APPROVE.toString())) {
                    Button button2 = (Button) _$_findCachedViewById(resetInternal.setMax.IPostMessageService$Stub$Proxy);
                    if (button2 != null) {
                        button2.setText(getContext().getString(R.string.bank_account_confirm));
                    }
                    setMin();
                } else if (Intrinsics.areEqual((Object) str2, (Object) BankAccountProcessState.SUBMIT.toString())) {
                    TextView textView5 = (TextView) _$_findCachedViewById(resetInternal.setMax.setSwitchMinWidth);
                    if (textView5 != null) {
                        textView5.setText(getContext().getString(R.string.bank_account_submit));
                    }
                    setMax();
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.IMediaSession$Stub);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
    }

    private final void setMin() {
        Button button = (Button) _$_findCachedViewById(resetInternal.setMax.IPostMessageService$Stub$Proxy);
        if (button != null) {
            button.setVisibility(0);
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setSwitchMinWidth);
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private final void setMax() {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setSwitchMinWidth);
        if (textView != null) {
            textView.setVisibility(0);
        }
        Button button = (Button) _$_findCachedViewById(resetInternal.setMax.IPostMessageService$Stub$Proxy);
        if (button != null) {
            button.setVisibility(8);
        }
    }

    public final void setup() {
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.addContentView);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.setHotspotBounds);
        if (imageView != null) {
            imageView.setOnClickListener(new getMin(this));
        }
        Button button = (Button) _$_findCachedViewById(resetInternal.setMax.IPostMessageService$Stub$Proxy);
        if (button != null) {
            button.setOnClickListener(new setMin(this));
        }
        onPageScrolled.setMax setmax = this.presenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        setmax.setMin();
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r4) {
        BaseStoragePackage.AnonymousClass1.getMax getmax = new BaseStoragePackage.AnonymousClass1.getMax((byte) 0);
        if (r4 != null) {
            getmax.length = r4;
            getmax.getMax = new OpenBankAccountModule(new getMax(this));
            stopIgnoring.setMin(getmax.getMax, OpenBankAccountModule.class);
            stopIgnoring.setMin(getmax.length, PrepareException.AnonymousClass1.class);
            new BaseStoragePackage.AnonymousClass1(getmax.getMax, getmax.length, (byte) 0).length(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            onPageScrolled.setMax setmax = this.presenter;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getminArr[0] = setmax;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$openBankListPage(OpenBankAccountView openBankAccountView) {
        String str = openBankAccountView.setMin;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listBankUrl");
        }
        if (str.length() > 0) {
            String str2 = openBankAccountView.setMin;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("listBankUrl");
            }
            String min = isShowMenu.setMin(str2);
            Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(listBankUrl)");
            DanaH5.startContainerFullUrl(min);
        }
    }

    public static final /* synthetic */ void access$openVerifyPage(OpenBankAccountView openBankAccountView) {
        String str = openBankAccountView.IsOverlapping;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("verifyUrl");
        }
        boolean z = true;
        if (str.length() > 0) {
            String str2 = openBankAccountView.length;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(UrlTag.INSTID);
            }
            if (str2.length() <= 0) {
                z = false;
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                String str3 = openBankAccountView.IsOverlapping;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("verifyUrl");
                }
                sb.append(str3);
                sb.append("?instId=");
                String str4 = openBankAccountView.length;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(UrlTag.INSTID);
                }
                sb.append(str4);
                String min = isShowMenu.setMin(sb.toString());
                Intrinsics.checkNotNullExpressionValue(min, "url");
                DanaH5.startContainerFullUrl(min);
            }
        }
    }

    public static final /* synthetic */ void access$openConfirmPage(OpenBankAccountView openBankAccountView) {
        String str = openBankAccountView.equals;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmUrl");
        }
        boolean z = true;
        if (str.length() > 0) {
            String str2 = openBankAccountView.length;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(UrlTag.INSTID);
            }
            if (str2.length() <= 0) {
                z = false;
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                String str3 = openBankAccountView.equals;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("confirmUrl");
                }
                sb.append(str3);
                sb.append("?instId=");
                String str4 = openBankAccountView.length;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(UrlTag.INSTID);
                }
                sb.append(str4);
                String min = isShowMenu.setMin(sb.toString());
                Intrinsics.checkNotNullExpressionValue(min, "url");
                DanaH5.startContainerFullUrl(min);
            }
        }
    }

    public static final /* synthetic */ void access$loadBanner(OpenBankAccountView openBankAccountView) {
        if (openBankAccountView.getMax) {
            if (openBankAccountView.getMin.length() > 0) {
                Glide.setMin((View) openBankAccountView).getMax(isShowMenu.setMin(openBankAccountView.getMin)).length((ImageView) openBankAccountView._$_findCachedViewById(resetInternal.setMax.setHotspotBounds));
                ConstraintLayout constraintLayout = (ConstraintLayout) openBankAccountView._$_findCachedViewById(resetInternal.setMax.addContentView);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        if ((r4.length() == 0) != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void access$mapBankAccountList(id.dana.openbankaccount.OpenBankAccountView r6, o.ChooseFileBridgeExtension r7) {
        /*
            java.util.List<o.ChooseFileActivityResultExtensionImpl> r7 = r7.setMin
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.List r7 = kotlin.collections.CollectionsKt.toMutableList(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r7 = r7.iterator()
        L_0x0015:
            boolean r1 = r7.hasNext()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0065
            java.lang.Object r1 = r7.next()
            r4 = r1
            o.ChooseFileActivityResultExtensionImpl r4 = (o.ChooseFileActivityResultExtensionImpl) r4
            java.lang.String r4 = r4.getMax
            if (r4 == 0) goto L_0x005d
            java.lang.String r4 = r4.toUpperCase()
            java.lang.String r5 = "(this as java.lang.String).toUpperCase()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            id.dana.openbankaccount.constant.BankAccountProcessState r5 = id.dana.openbankaccount.constant.BankAccountProcessState.INIT
            java.lang.String r5 = r5.toString()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 != 0) goto L_0x0056
            id.dana.openbankaccount.constant.BankAccountProcessState r5 = id.dana.openbankaccount.constant.BankAccountProcessState.CONFIRM
            java.lang.String r5 = r5.toString()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 != 0) goto L_0x0056
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0053
            r4 = 1
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            if (r4 == 0) goto L_0x0057
        L_0x0056:
            r2 = 1
        L_0x0057:
            if (r2 != 0) goto L_0x0015
            r0.add(r1)
            goto L_0x0015
        L_0x005d:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type java.lang.String"
            r6.<init>(r7)
            throw r6
        L_0x0065:
            java.util.List r0 = (java.util.List) r0
            int r7 = r0.size()
            if (r7 != r3) goto L_0x0071
            r6.getMin(r0)
            return
        L_0x0071:
            if (r7 <= r3) goto L_0x00e4
            int r0 = o.resetInternal.setMax.closeOptionsMenu
            android.view.View r0 = r6._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x0083
            r1 = 2131231751(0x7f080407, float:1.8079592E38)
            r0.setImageResource(r1)
        L_0x0083:
            int r0 = o.resetInternal.setMax.IPostMessageService$Stub$Proxy
            android.view.View r0 = r6._$_findCachedViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            if (r0 == 0) goto L_0x009d
            android.content.Context r1 = r6.getContext()
            r4 = 2131889356(0x7f120ccc, float:1.9413373E38)
            java.lang.String r1 = r1.getString(r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x009d:
            int r0 = o.resetInternal.setMax.getSwitchPadding
            android.view.View r0 = r6._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x00d3
            kotlin.jvm.internal.StringCompanionObject r1 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            android.content.Context r1 = r6.getContext()
            r4 = 2131886265(0x7f1200b9, float:1.9407104E38)
            java.lang.String r1 = r1.getString(r4)
            java.lang.String r4 = "context\n            .get….bank_account_on_process)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4[r2] = r7
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r4, r3)
            java.lang.String r7 = java.lang.String.format(r1, r7)
            java.lang.String r1 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r0.setText(r7)
        L_0x00d3:
            r6.setMin()
            int r7 = o.resetInternal.setMax.IMediaSession$Stub
            android.view.View r6 = r6._$_findCachedViewById(r7)
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            if (r6 == 0) goto L_0x00e3
            r6.setVisibility(r2)
        L_0x00e3:
            return
        L_0x00e4:
            int r7 = o.resetInternal.setMax.IMediaSession$Stub
            android.view.View r6 = r6._$_findCachedViewById(r7)
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            if (r6 == 0) goto L_0x00f3
            r7 = 8
            r6.setVisibility(r7)
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.openbankaccount.OpenBankAccountView.access$mapBankAccountList(id.dana.openbankaccount.OpenBankAccountView, o.ChooseFileBridgeExtension):void");
    }

    public static final /* synthetic */ void access$hideBankAccountItem(OpenBankAccountView openBankAccountView) {
        ConstraintLayout constraintLayout = (ConstraintLayout) openBankAccountView._$_findCachedViewById(resetInternal.setMax.IMediaSession$Stub);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
    }
}
