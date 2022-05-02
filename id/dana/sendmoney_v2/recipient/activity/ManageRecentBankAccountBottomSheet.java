package id.dana.sendmoney_v2.recipient.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.component.cellcomponent.DanaCellLeftView;
import id.dana.component.edittextcomponent.DanaEditTextView;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney_v2.landing.SendMoneyActivity;
import id.dana.sendmoney_v2.landing.di.module.ManageRecentBankAccountModule;
import id.dana.sendmoney_v2.recipient.view.RecipientView;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import o.PrepareException;
import o.increaseCount;
import o.order;
import o.resetInternal;
import o.setCancelText;
import o.setProgressViewOffset;
import o.setUnit;
import o.stopIgnoring;
import o.updateBizType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001eH\u0014J\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u0015H\u0014J\b\u0010$\u001a\u00020\u0015H\u0002J\u0010\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020\u00152\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020,2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010-\u001a\u00020\u0015H\u0016J\b\u0010.\u001a\u00020\u0015H\u0014J\b\u0010/\u001a\u00020\u0015H\u0016J\b\u00100\u001a\u00020\u0015H\u0016J\b\u00101\u001a\u00020\u0015H\u0002J\b\u00102\u001a\u00020\u0015H\u0002J\b\u00103\u001a\u00020\u0015H\u0002J\u0010\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u0013H\u0002J\b\u00106\u001a\u00020\u0015H\u0002J\b\u00107\u001a\u00020\u0015H\u0016J\u0010\u00108\u001a\u00020\u00152\u0006\u00109\u001a\u00020\rH\u0002J\f\u0010:\u001a\u00020\u0015*\u00020;H\u0002J\f\u0010<\u001a\u00020\u0015*\u00020;H\u0002J\f\u0010=\u001a\u00020\u0015*\u00020>H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lid/dana/sendmoney_v2/recipient/activity/ManageRecentBankAccountBottomSheet;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "Lid/dana/sendmoney_v2/landing/contract/ManageRecentBankAccountContract$View;", "()V", "customSnackBar", "Lid/dana/component/customsnackbarcomponent/CustomSnackbar;", "presenter", "Lid/dana/sendmoney_v2/landing/contract/ManageRecentBankAccountContract$Presenter;", "getPresenter", "()Lid/dana/sendmoney_v2/landing/contract/ManageRecentBankAccountContract$Presenter;", "setPresenter", "(Lid/dana/sendmoney_v2/landing/contract/ManageRecentBankAccountContract$Presenter;)V", "recipientModelBackUp", "Lid/dana/sendmoney/model/RecipientModel;", "getRecipientModelBackUp", "()Lid/dana/sendmoney/model/RecipientModel;", "setRecipientModelBackUp", "(Lid/dana/sendmoney/model/RecipientModel;)V", "title", "", "assembleChangeAliasName", "", "closeSheetRecentManageBankAccount", "closeSheetRenameRecentBankAccount", "deleteRecentAccountBank", "getBankRecipientActivity", "Lid/dana/sendmoney_v2/recipient/activity/BankRecipientActivity;", "getBottomSheet", "Landroid/widget/FrameLayout;", "getDimAmount", "", "getLayout", "", "getSendMoneyActivity", "Lid/dana/sendmoney_v2/landing/SendMoneyActivity;", "init", "initComponent", "onCancel", "dialog", "Landroid/content/DialogInterface;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onRemoveRecentBankNameSuccess", "onShow", "onUndoRemove", "onUpdateRecentBankNameSuccess", "refreshRecentSavedBank", "refreshRecentSavedBankAfterRemove", "setupBottomSheet", "setupContentBottomSheet", "actionType", "setupSheetRenameBankAccount", "showSnackbarError", "submitRenameBankAccount", "recipientModel", "checkValidateContact", "Lid/dana/sendmoney/model/RecentRecipientModel;", "checkViewType", "setDefaultValue", "Lid/dana/component/edittextcomponent/DanaEditTextView;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ManageRecentBankAccountBottomSheet extends order implements setUnit.setMin {
    @NotNull
    public static final setMax getMax = new setMax((byte) 0);
    private HashMap IsOverlapping;
    private String equals;
    public RecipientModel getMin;
    @Inject
    public setUnit.getMin presenter;
    private setProgressViewOffset toFloatRange;

    @JvmDefault
    public final void dismissProgress() {
    }

    public final int getMin() {
        return R.layout.base_bottom_sheet_manage_bank_account;
    }

    public final float length() {
        return 0.5f;
    }

    public final View length(int i) {
        if (this.IsOverlapping == null) {
            this.IsOverlapping = new HashMap();
        }
        View view = (View) this.IsOverlapping.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.IsOverlapping.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @JvmDefault
    public final void onError(@Nullable String str) {
    }

    @JvmDefault
    public final void showProgress() {
    }

    public static final /* synthetic */ setProgressViewOffset getMax(ManageRecentBankAccountBottomSheet manageRecentBankAccountBottomSheet) {
        setProgressViewOffset setprogressviewoffset = manageRecentBankAccountBottomSheet.toFloatRange;
        if (setprogressviewoffset == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customSnackBar");
        }
        return setprogressviewoffset;
    }

    @NotNull
    public final FrameLayout getMax() {
        FrameLayout frameLayout = (FrameLayout) length(resetInternal.setMax.RequiresApi);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "flBottomSheet");
        return frameLayout;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.f78532131951924);
    }

    public final void setMax() {
        super.setMax();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
        setCancelable(true);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"id/dana/sendmoney_v2/recipient/activity/ManageRecentBankAccountBottomSheet$onCreateDialog$1", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "onBackPressed", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends BottomSheetDialog {
        final /* synthetic */ ManageRecentBankAccountBottomSheet length;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(ManageRecentBankAccountBottomSheet manageRecentBankAccountBottomSheet, Context context, int i) {
            super(context, i);
            this.length = manageRecentBankAccountBottomSheet;
        }

        public final void onBackPressed() {
            cancel();
        }
    }

    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        return new getMin(this, context, getTheme());
    }

    public final void setMin() {
        String str;
        super.setMin();
        boolean z = false;
        updateBizType.setMin setmin = new updateBizType.setMin((byte) 0);
        BaseActivity baseActivity = this.setMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        PrepareException.AnonymousClass1 applicationComponent = baseActivity.getApplicationComponent();
        String str2 = null;
        if (applicationComponent != null) {
            setmin.length = applicationComponent;
            setmin.getMax = new ManageRecentBankAccountModule(this);
            stopIgnoring.setMin(setmin.getMax, ManageRecentBankAccountModule.class);
            stopIgnoring.setMin(setmin.length, PrepareException.AnonymousClass1.class);
            new updateBizType(setmin.getMax, setmin.length, (byte) 0).setMin(this);
            setMin(setMin(getDialog()), 3);
            BottomSheetBehavior bottomSheetBehavior = this.length;
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehavior, "bottomSheetBehavior");
            bottomSheetBehavior.setHideable(false);
            String valueOf = String.valueOf(getTag());
            if (Intrinsics.areEqual((Object) valueOf, (Object) "MANAGE_SAVED_BANK")) {
                BaseActivity baseActivity2 = this.setMax;
                if (baseActivity2 != null) {
                    RecipientModel recipientSelectedMoreAction = ((BankRecipientActivity) baseActivity2).getRecipientSelectedMoreAction();
                    if (recipientSelectedMoreAction != null) {
                        TextView textView = (TextView) length(resetInternal.setMax.adjustDropDownSizeAndPosition);
                        if (textView != null) {
                            String str3 = recipientSelectedMoreAction.setMin;
                            if (str3 == null) {
                                str3 = recipientSelectedMoreAction.length();
                            }
                            textView.setText(str3);
                        }
                        TextView textView2 = (TextView) length(resetInternal.setMax.FitWindowsLinearLayout);
                        if (textView2 != null) {
                            String str4 = recipientSelectedMoreAction.isInside;
                            if (!TextUtils.isEmpty(str4)) {
                                str4 = str4.replace(" ", "");
                            }
                            Object[] objArr = new Object[1];
                            if (str4.length() >= 4) {
                                str4 = str4.substring(str4.length() - 4);
                            }
                            objArr[0] = str4;
                            textView2.setText(String.format("•••• %s", objArr));
                        }
                        TextView textView3 = (TextView) length(resetInternal.setMax.drawDividersVertical);
                        if (textView3 != null) {
                            textView3.setText(recipientSelectedMoreAction.length);
                        }
                        DanaCellLeftView danaCellLeftView = (DanaCellLeftView) length(resetInternal.setMax.unregisterCallbackListener);
                        if (danaCellLeftView != null) {
                            danaCellLeftView.setVisibility(0);
                        }
                        DanaCellLeftView danaCellLeftView2 = (DanaCellLeftView) length(resetInternal.setMax.IMediaControllerCallback$Stub);
                        if (danaCellLeftView2 != null) {
                            danaCellLeftView2.setVisibility(0);
                        }
                        DanaCellLeftView danaCellLeftView3 = (DanaCellLeftView) length(resetInternal.setMax.IMediaControllerCallback$Stub$Proxy);
                        if (danaCellLeftView3 != null) {
                            danaCellLeftView3.setVisibility(8);
                        }
                        this.getMin = recipientSelectedMoreAction;
                        ((DanaCellLeftView) length(resetInternal.setMax.IMediaControllerCallback$Stub)).setOnClickListener(new setMin(this));
                        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) length(resetInternal.setMax.ICustomTabsService);
                        if (danaButtonPrimaryView != null) {
                            danaButtonPrimaryView.setOnClickListener(new toFloatRange(this, recipientSelectedMoreAction));
                        }
                        DanaCellLeftView danaCellLeftView4 = (DanaCellLeftView) length(resetInternal.setMax.unregisterCallbackListener);
                        if (danaCellLeftView4 != null) {
                            danaCellLeftView4.setOnClickListener(new equals(this));
                        }
                        DanaEditTextView danaEditTextView = (DanaEditTextView) length(resetInternal.setMax.toInclusive);
                        if (danaEditTextView != null) {
                            danaEditTextView.setEnabled(true);
                            BaseActivity baseActivity3 = this.setMax;
                            if (baseActivity3 != null) {
                                RecipientModel recipientSelectedMoreAction2 = ((BankRecipientActivity) baseActivity3).getRecipientSelectedMoreAction();
                                if (recipientSelectedMoreAction2 != null) {
                                    str = recipientSelectedMoreAction2.setMin;
                                } else {
                                    str = null;
                                }
                                CharSequence charSequence = str;
                                if (charSequence == null || charSequence.length() == 0) {
                                    z = true;
                                }
                                if (!z) {
                                    BaseActivity baseActivity4 = this.setMax;
                                    if (baseActivity4 != null) {
                                        RecipientModel recipientSelectedMoreAction3 = ((BankRecipientActivity) baseActivity4).getRecipientSelectedMoreAction();
                                        if (recipientSelectedMoreAction3 != null) {
                                            str2 = recipientSelectedMoreAction3.setMin;
                                        }
                                        danaEditTextView.setText(str2);
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity");
                                    }
                                } else {
                                    BaseActivity baseActivity5 = this.setMax;
                                    if (baseActivity5 != null) {
                                        RecipientModel recipientSelectedMoreAction4 = ((BankRecipientActivity) baseActivity5).getRecipientSelectedMoreAction();
                                        if (recipientSelectedMoreAction4 != null) {
                                            str2 = recipientSelectedMoreAction4.length();
                                        }
                                        danaEditTextView.setText(str2);
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity");
                                    }
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity");
                            }
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity");
                }
            } else if (Intrinsics.areEqual((Object) valueOf, (Object) "MANAGE_QUICK_ACTION")) {
                BaseActivity baseActivity6 = this.setMax;
                if (baseActivity6 != null) {
                    increaseCount recipientHoldClickAction = ((SendMoneyActivity) baseActivity6).getRecipientHoldClickAction();
                    if (recipientHoldClickAction != null) {
                        if (recipientHoldClickAction.values == 2) {
                            if (Intrinsics.areEqual((Object) recipientHoldClickAction.setMin, (Object) "-") || Intrinsics.areEqual((Object) recipientHoldClickAction.length(), (Object) "-")) {
                                String str5 = recipientHoldClickAction.isInside;
                                Intrinsics.checkNotNullExpressionValue(str5, "number");
                                this.equals = str5;
                                TextView textView4 = (TextView) length(resetInternal.setMax.FitWindowsLinearLayout);
                                if (textView4 != null) {
                                    textView4.setVisibility(8);
                                }
                            } else {
                                String str6 = recipientHoldClickAction.setMin;
                                if (str6 == null) {
                                    str6 = recipientHoldClickAction.length();
                                }
                                String replaceAll = str6.replaceAll("\\*", "•");
                                Intrinsics.checkNotNullExpressionValue(replaceAll, "TextUtil.maskWithDot(titleMask, \"\\\\*\")");
                                this.equals = replaceAll;
                            }
                            TextView textView5 = (TextView) length(resetInternal.setMax.adjustDropDownSizeAndPosition);
                            if (textView5 != null) {
                                String str7 = this.equals;
                                if (str7 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("title");
                                }
                                textView5.setText(str7);
                            }
                            TextView textView6 = (TextView) length(resetInternal.setMax.FitWindowsLinearLayout);
                            if (textView6 != null) {
                                textView6.setText(recipientHoldClickAction.isInside);
                            }
                            TextView textView7 = (TextView) length(resetInternal.setMax.onWindowFocusChanged);
                            if (textView7 != null) {
                                textView7.setVisibility(8);
                            }
                            TextView textView8 = (TextView) length(resetInternal.setMax.drawDividersVertical);
                            if (textView8 != null) {
                                textView8.setVisibility(8);
                            }
                            DanaCellLeftView danaCellLeftView5 = (DanaCellLeftView) length(resetInternal.setMax.unregisterCallbackListener);
                            if (danaCellLeftView5 != null) {
                                danaCellLeftView5.setVisibility(8);
                            }
                            DanaCellLeftView danaCellLeftView6 = (DanaCellLeftView) length(resetInternal.setMax.IMediaControllerCallback$Stub);
                            if (danaCellLeftView6 != null) {
                                danaCellLeftView6.setVisibility(8);
                            }
                            DanaCellLeftView danaCellLeftView7 = (DanaCellLeftView) length(resetInternal.setMax.IMediaControllerCallback$Stub$Proxy);
                            if (danaCellLeftView7 != null) {
                                danaCellLeftView7.setVisibility(0);
                            }
                        } else if (recipientHoldClickAction.values == 4) {
                            TextView textView9 = (TextView) length(resetInternal.setMax.adjustDropDownSizeAndPosition);
                            if (textView9 != null) {
                                String str8 = recipientHoldClickAction.setMin;
                                if (str8 == null) {
                                    str8 = recipientHoldClickAction.length();
                                }
                                textView9.setText(str8);
                            }
                            TextView textView10 = (TextView) length(resetInternal.setMax.FitWindowsLinearLayout);
                            if (textView10 != null) {
                                String str9 = recipientHoldClickAction.isInside;
                                if (!TextUtils.isEmpty(str9)) {
                                    str9 = str9.replace(" ", "");
                                }
                                Object[] objArr2 = new Object[1];
                                if (str9.length() >= 4) {
                                    str9 = str9.substring(str9.length() - 4);
                                }
                                objArr2[0] = str9;
                                textView10.setText(String.format("•••• %s", objArr2));
                            }
                            TextView textView11 = (TextView) length(resetInternal.setMax.drawDividersVertical);
                            if (textView11 != null) {
                                textView11.setText(recipientHoldClickAction.length);
                            }
                            TextView textView12 = (TextView) length(resetInternal.setMax.onWindowFocusChanged);
                            if (textView12 != null) {
                                textView12.setVisibility(0);
                            }
                            TextView textView13 = (TextView) length(resetInternal.setMax.drawDividersVertical);
                            if (textView13 != null) {
                                textView13.setVisibility(0);
                            }
                            DanaCellLeftView danaCellLeftView8 = (DanaCellLeftView) length(resetInternal.setMax.unregisterCallbackListener);
                            if (danaCellLeftView8 != null) {
                                danaCellLeftView8.setVisibility(8);
                            }
                            DanaCellLeftView danaCellLeftView9 = (DanaCellLeftView) length(resetInternal.setMax.IMediaControllerCallback$Stub);
                            if (danaCellLeftView9 != null) {
                                danaCellLeftView9.setVisibility(8);
                            }
                            DanaCellLeftView danaCellLeftView10 = (DanaCellLeftView) length(resetInternal.setMax.IMediaControllerCallback$Stub$Proxy);
                            if (danaCellLeftView10 != null) {
                                danaCellLeftView10.setVisibility(0);
                            }
                        }
                        DanaCellLeftView danaCellLeftView11 = (DanaCellLeftView) length(resetInternal.setMax.IMediaControllerCallback$Stub$Proxy);
                        if (danaCellLeftView11 != null) {
                            danaCellLeftView11.setOnClickListener(new isInside(recipientHoldClickAction, this));
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney_v2.landing.SendMoneyActivity");
                }
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) length(resetInternal.setMax.AppCompatActivity);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new length(this));
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) length(resetInternal.setMax.initDelegate);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setOnClickListener(new getMax(this));
                return;
            }
            return;
        }
        throw null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ ManageRecentBankAccountBottomSheet getMax;

        setMin(ManageRecentBankAccountBottomSheet manageRecentBankAccountBottomSheet) {
            this.getMax = manageRecentBankAccountBottomSheet;
        }

        public final void onClick(View view) {
            RecipientModel recipientSelectedMoreAction = ManageRecentBankAccountBottomSheet.length(this.getMax).getRecipientSelectedMoreAction();
            if (recipientSelectedMoreAction != null) {
                setUnit.getMin getmin = this.getMax.presenter;
                if (getmin == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                getmin.getMax(recipientSelectedMoreAction);
            }
            this.getMax.dismissAllowingStateLoss();
        }
    }

    public final void equals() {
        BaseActivity baseActivity = this.setMax;
        if (baseActivity != null) {
            Window window = ((BankRecipientActivity) baseActivity).getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getBankRecipientActivity().window");
            View findViewById = window.getDecorView().findViewById(16908290);
            Intrinsics.checkNotNullExpressionValue(findViewById, "getBankRecipientActivity…yId(android.R.id.content)");
            setProgressViewOffset.setMax setmax = new setProgressViewOffset.setMax((ViewGroup) findViewById);
            setmax.getMax = getString(R.string.send_money_text_error_snackbar);
            setmax.setMax = getString(R.string.close);
            setmax.toIntRange = 0;
            setmax.getMin = R.drawable.bg_rounded_border_red_50;
            setmax.length = new toIntRange(this);
            this.toFloatRange = setmax.getMax();
            dismissAllowingStateLoss();
            setProgressViewOffset setprogressviewoffset = this.toFloatRange;
            if (setprogressviewoffset == null) {
                Intrinsics.throwUninitializedPropertyAccessException("customSnackBar");
            }
            setprogressviewoffset.show();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnClickListener {
        final /* synthetic */ ManageRecentBankAccountBottomSheet setMax;

        toIntRange(ManageRecentBankAccountBottomSheet manageRecentBankAccountBottomSheet) {
            this.setMax = manageRecentBankAccountBottomSheet;
        }

        public final void onClick(View view) {
            ManageRecentBankAccountBottomSheet.getMax(this.setMax).dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/sendmoney_v2/recipient/activity/ManageRecentBankAccountBottomSheet$setupContentBottomSheet$2$1"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements View.OnClickListener {
        final /* synthetic */ ManageRecentBankAccountBottomSheet length;
        final /* synthetic */ increaseCount setMin;

        isInside(increaseCount increasecount, ManageRecentBankAccountBottomSheet manageRecentBankAccountBottomSheet) {
            this.setMin = increasecount;
            this.length = manageRecentBankAccountBottomSheet;
        }

        public final void onClick(View view) {
            this.length.dismissAllowingStateLoss();
            ManageRecentBankAccountBottomSheet.setMin(this.length).showDialogConfirmationRemoveQuickAction(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ ManageRecentBankAccountBottomSheet setMax;

        equals(ManageRecentBankAccountBottomSheet manageRecentBankAccountBottomSheet) {
            this.setMax = manageRecentBankAccountBottomSheet;
        }

        public final void onClick(View view) {
            View length = this.setMax.length(resetInternal.setMax.loadParameters);
            Intrinsics.checkNotNullExpressionValue(length, "viewSheetManageBankAccount");
            length.setVisibility(8);
            View length2 = this.setMax.length(resetInternal.setMax.setPaddingLeft);
            Intrinsics.checkNotNullExpressionValue(length2, "viewSheetRenameBankAccount");
            length2.setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements View.OnClickListener {
        final /* synthetic */ RecipientModel getMin;
        final /* synthetic */ ManageRecentBankAccountBottomSheet setMax;

        toFloatRange(ManageRecentBankAccountBottomSheet manageRecentBankAccountBottomSheet, RecipientModel recipientModel) {
            this.setMax = manageRecentBankAccountBottomSheet;
            this.getMin = recipientModel;
        }

        public final void onClick(View view) {
            DanaEditTextView danaEditTextView = (DanaEditTextView) this.setMax.length(resetInternal.setMax.toInclusive);
            Intrinsics.checkNotNullExpressionValue(danaEditTextView, "detChangeName");
            CharSequence text = danaEditTextView.getText();
            if (!(text == null || text.length() == 0)) {
                setUnit.getMin getmin = this.setMax.presenter;
                if (getmin == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                RecipientModel recipientModel = this.getMin;
                DanaEditTextView danaEditTextView2 = (DanaEditTextView) this.setMax.length(resetInternal.setMax.toInclusive);
                Intrinsics.checkNotNullExpressionValue(danaEditTextView2, "detChangeName");
                getmin.getMin(recipientModel, String.valueOf(danaEditTextView2.getText()), false);
                return;
            }
            setUnit.getMin getmin2 = this.setMax.presenter;
            if (getmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            RecipientModel recipientModel2 = this.getMin;
            getmin2.getMin(recipientModel2, recipientModel2.length(), false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ ManageRecentBankAccountBottomSheet getMin;

        getMax(ManageRecentBankAccountBottomSheet manageRecentBankAccountBottomSheet) {
            this.getMin = manageRecentBankAccountBottomSheet;
        }

        public final void onClick(View view) {
            this.getMin.dismissAllowingStateLoss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ ManageRecentBankAccountBottomSheet length;

        length(ManageRecentBankAccountBottomSheet manageRecentBankAccountBottomSheet) {
            this.length = manageRecentBankAccountBottomSheet;
        }

        public final void onClick(View view) {
            this.length.dismissAllowingStateLoss();
        }
    }

    public final void onCancel(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, ImagePickerEvent.DIALOG);
        super.onCancel(dialogInterface);
        dismiss();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/sendmoney_v2/recipient/activity/ManageRecentBankAccountBottomSheet$Companion;", "", "()V", "DIM_AMOUNT", "", "MANAGE_QUICK_ACTION", "", "MANAGE_SAVED_BANK", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final void toFloatRange() {
        BaseActivity baseActivity = this.setMax;
        if (baseActivity != null) {
            ((RecipientView) ((BankRecipientActivity) baseActivity)._$_findCachedViewById(resetInternal.setMax.evictionCount)).getSavedBankPresenter().length();
            DanaEditTextView danaEditTextView = (DanaEditTextView) length(resetInternal.setMax.toInclusive);
            Intrinsics.checkNotNullExpressionValue(danaEditTextView, "detChangeName");
            CharSequence text = danaEditTextView.getText();
            if (!(text == null || text.length() == 0)) {
                BaseActivity baseActivity2 = this.setMax;
                if (baseActivity2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(getString(R.string.send_money_wording_toast_after_rename_recent_saved_bank));
                    sb.append(Typography.quote);
                    DanaEditTextView danaEditTextView2 = (DanaEditTextView) length(resetInternal.setMax.toInclusive);
                    Intrinsics.checkNotNullExpressionValue(danaEditTextView2, "detChangeName");
                    sb.append(danaEditTextView2.getText());
                    sb.append("\".");
                    setCancelText.length((BankRecipientActivity) baseActivity2, 0, R.drawable.bg_rounded_border_green_50, sb.toString(), 80, 20, true, (String) null, 256);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity");
                }
            } else {
                BaseActivity baseActivity3 = this.setMax;
                if (baseActivity3 != null) {
                    Activity activity = (BankRecipientActivity) baseActivity3;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(getString(R.string.send_money_wording_toast_after_rename_recent_saved_bank));
                    sb2.append(Typography.quote);
                    BaseActivity baseActivity4 = this.setMax;
                    if (baseActivity4 != null) {
                        RecipientModel recipientSelectedMoreAction = ((BankRecipientActivity) baseActivity4).getRecipientSelectedMoreAction();
                        sb2.append(recipientSelectedMoreAction != null ? recipientSelectedMoreAction.length() : null);
                        sb2.append("\".");
                        setCancelText.length(activity, 0, R.drawable.bg_rounded_border_green_50, sb2.toString(), 80, 20, true, (String) null, 256);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity");
                }
            }
            dismissAllowingStateLoss();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity");
    }

    public final void isInside() {
        BaseActivity baseActivity = this.setMax;
        if (baseActivity != null) {
            ((RecipientView) ((BankRecipientActivity) baseActivity)._$_findCachedViewById(resetInternal.setMax.evictionCount)).getSavedBankPresenter().length();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity");
    }

    public final void toIntRange() {
        BaseActivity baseActivity = this.setMax;
        if (baseActivity != null) {
            ((RecipientView) ((BankRecipientActivity) baseActivity)._$_findCachedViewById(resetInternal.setMax.evictionCount)).getSavedBankPresenter().getMax();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity");
    }

    public static final /* synthetic */ BankRecipientActivity length(ManageRecentBankAccountBottomSheet manageRecentBankAccountBottomSheet) {
        BaseActivity baseActivity = manageRecentBankAccountBottomSheet.setMax;
        if (baseActivity != null) {
            return (BankRecipientActivity) baseActivity;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity");
    }

    public static final /* synthetic */ SendMoneyActivity setMin(ManageRecentBankAccountBottomSheet manageRecentBankAccountBottomSheet) {
        BaseActivity baseActivity = manageRecentBankAccountBottomSheet.setMax;
        if (baseActivity != null) {
            return (SendMoneyActivity) baseActivity;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney_v2.landing.SendMoneyActivity");
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.IsOverlapping;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
