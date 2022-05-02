package id.dana.requestmoney.bank;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.contract.deeplink.generation.GenerateDeepLinkModule;
import id.dana.data.account.repository.AccountEntityRepository;
import id.dana.di.modules.RequestMoneyQrModule;
import id.dana.di.modules.UserBankModule;
import id.dana.di.modules.UserBankQrModule;
import id.dana.requestmoney.BaseRequestMoneyQrCardFragment;
import id.dana.requestmoney.RequestMoneyActivity;
import id.dana.requestmoney.model.UserBankModel;
import id.dana.richview.QRView;
import id.dana.richview.socialshare.SocialShareView;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.GriverCaptureActivity;
import o.InputBridgeExtension;
import o.PrepareException;
import o.access$2800;
import o.access$2900;
import o.dispatchOnCancelled;
import o.getProgressViewStartOffset;
import o.getTransitionProperties;
import o.isBaselineAligned;
import o.layoutChildWithAnchor;
import o.loadOriginalImage;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onDownloadFinish;
import o.parseBehavior;
import o.publishImageAction;
import o.resetInternal;
import o.setH5MenuList;
import o.stopIgnoring;
import o.updateCornerMarking;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\f\u0018\u0000 C2\u00020\u0001:\u0001CB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020\u001fH\u0014J\b\u0010)\u001a\u00020\u001fH\u0014J\b\u0010*\u001a\u00020\u001fH\u0016J\b\u0010+\u001a\u00020\u001fH\u0002J\b\u0010,\u001a\u00020\u001fH\u0016J\b\u0010-\u001a\u00020\u001fH\u0002J\b\u0010.\u001a\u00020\u001fH\u0016J\b\u0010/\u001a\u00020\u001fH\u0002J\u0010\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u000205H\u0002J\f\u00106\u001a\u00020\u001f*\u000207H\u0002J\u0014\u00108\u001a\u00020\u001f*\u0002072\u0006\u00101\u001a\u000202H\u0002J\f\u00109\u001a\u00020\u001f*\u00020:H\u0002J\u0014\u0010;\u001a\u00020\u001f*\u00020<2\u0006\u0010=\u001a\u000205H\u0002J\f\u0010>\u001a\u00020\u001f*\u00020\u0011H\u0002J\f\u0010?\u001a\u00020\u001f*\u00020@H\u0002J\u0014\u0010A\u001a\u00020\u001f*\u0002072\u0006\u0010B\u001a\u000205H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006D"}, d2 = {"Lid/dana/requestmoney/bank/RequestMoneyBankQrCardFragment;", "Lid/dana/requestmoney/BaseRequestMoneyQrCardFragment;", "()V", "countDownTimer", "Landroid/os/CountDownTimer;", "deleteDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getDeleteDialog", "()Lcom/afollestad/materialdialogs/MaterialDialog;", "deleteDialog$delegate", "Lkotlin/Lazy;", "requestListener", "id/dana/requestmoney/bank/RequestMoneyBankQrCardFragment$requestListener$2$1", "getRequestListener", "()Lid/dana/requestmoney/bank/RequestMoneyBankQrCardFragment$requestListener$2$1;", "requestListener$delegate", "userBankModel", "Lid/dana/requestmoney/model/UserBankModel;", "userBankPresenter", "Lid/dana/requestmoney/bank/UserBankContract$Presenter;", "getUserBankPresenter", "()Lid/dana/requestmoney/bank/UserBankContract$Presenter;", "setUserBankPresenter", "(Lid/dana/requestmoney/bank/UserBankContract$Presenter;)V", "userBankQrPresenter", "Lid/dana/requestmoney/bank/UserBankQrContract$Presenter;", "getUserBankQrPresenter", "()Lid/dana/requestmoney/bank/UserBankQrContract$Presenter;", "setUserBankQrPresenter", "(Lid/dana/requestmoney/bank/UserBankQrContract$Presenter;)V", "cancelCountDownTimer", "", "getGenerateDeepLinkModule", "Lid/dana/contract/deeplink/generation/GenerateDeepLinkModule;", "getRequestMoneyModule", "Lid/dana/di/modules/RequestMoneyQrModule;", "getUserBankModule", "Lid/dana/di/modules/UserBankModule;", "getUserBankQrModule", "Lid/dana/di/modules/UserBankQrModule;", "init", "initComponent", "initData", "initViews", "onDestroyView", "onQrExpired", "reloadQr", "showDeleteDialog", "startCountdownTimer", "qrUserBankModel", "Lid/dana/requestmoney/model/QrUserBankModel;", "updateQrDeeplink", "deepLink", "", "displayQrExpired", "Landroid/widget/TextView;", "displayQrExpiryTime", "initDeleteButton", "Landroid/view/View;", "loadBankLogo", "Landroid/widget/ImageView;", "logoUrl", "loadQr", "prepareBundle", "Landroid/os/Bundle;", "setLogoTitle", "text", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RequestMoneyBankQrCardFragment extends BaseRequestMoneyQrCardFragment {
    @NotNull
    public static final getMax setMin = new getMax((byte) 0);
    private CountDownTimer equals;
    private final Lazy isInside = LazyKt.lazy(new toFloatRange(this));
    private final Lazy setMax = LazyKt.lazy(new length(this));
    /* access modifiers changed from: private */
    public UserBankModel toFloatRange;
    private HashMap toIntRange;
    @Inject
    public publishImageAction.setMin userBankPresenter;
    @Inject
    public GriverCaptureActivity.length userBankQrPresenter;

    public final void invoke() {
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View setMin(int i) {
        if (this.toIntRange == null) {
            this.toIntRange = new HashMap();
        }
        View view = (View) this.toIntRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toIntRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<isBaselineAligned> {
        final /* synthetic */ RequestMoneyBankQrCardFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(RequestMoneyBankQrCardFragment requestMoneyBankQrCardFragment) {
            super(0);
            this.this$0 = requestMoneyBankQrCardFragment;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "id/dana/requestmoney/bank/RequestMoneyBankQrCardFragment$deleteDialog$2$1$2"}, k = 3, mv = {1, 4, 2})
        static final class getMin extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ length this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMin(length length) {
                super(1);
                this.this$0 = length;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                UserBankModel length = this.this$0.this$0.toFloatRange;
                if (length != null) {
                    publishImageAction.setMin setmin = this.this$0.this$0.userBankPresenter;
                    if (setmin == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userBankPresenter");
                    }
                    setmin.setMin(length);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "id/dana/requestmoney/bank/RequestMoneyBankQrCardFragment$deleteDialog$2$1$1"}, k = 3, mv = {1, 4, 2})
        /* renamed from: id.dana.requestmoney.bank.RequestMoneyBankQrCardFragment$length$length  reason: collision with other inner class name */
        static final class C0047length extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ length this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0047length(length length) {
                super(1);
                this.this$0 = length;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                isBaselineAligned IsOverlapping = RequestMoneyBankQrCardFragment.IsOverlapping(this.this$0.this$0);
                if (IsOverlapping != null) {
                    IsOverlapping.dismiss();
                }
            }
        }

        @Nullable
        public final isBaselineAligned invoke() {
            Context context = this.this$0.getContext();
            if (context == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(context, "it");
            getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(context);
            getmax.toFloatRange = this.this$0.getString(R.string.request_money_delete_dialog_title);
            getProgressViewStartOffset.getMax getmax2 = getmax;
            getmax2.isInside = this.this$0.getString(R.string.request_money_delete_dialog_message);
            String string = this.this$0.getString(R.string.option_no);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.option_no)");
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
            if (string != null) {
                String upperCase = string.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                getProgressViewStartOffset.getMax max = getmax2.getMax(upperCase, new C0047length(this));
                String string2 = this.this$0.getString(R.string.option_yes);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.option_yes)");
                Locale locale2 = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale2, "Locale.ROOT");
                if (string2 != null) {
                    String upperCase2 = string2.toUpperCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
                    getProgressViewStartOffset.getMax min = max.setMin(upperCase2, new getMin(this));
                    min.toIntRange = 0;
                    return new getProgressViewStartOffset(min.invoke, min.length, min, min.equals, (byte) 0).getMin();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "id/dana/requestmoney/bank/RequestMoneyBankQrCardFragment$requestListener$2$1", "invoke", "()Lid/dana/requestmoney/bank/RequestMoneyBankQrCardFragment$requestListener$2$1;"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function0<AnonymousClass4> {
        final /* synthetic */ RequestMoneyBankQrCardFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(RequestMoneyBankQrCardFragment requestMoneyBankQrCardFragment) {
            super(0);
            this.this$0 = requestMoneyBankQrCardFragment;
        }

        @NotNull
        public final AnonymousClass4 invoke() {
            return new parseBehavior<Drawable>(this) {
                final /* synthetic */ toFloatRange setMin;

                {
                    this.setMin = r1;
                }

                public final /* synthetic */ boolean onResourceReady(Object obj, Object obj2, layoutChildWithAnchor layoutchildwithanchor, DataSource dataSource, boolean z) {
                    return setMax();
                }

                public final boolean onLoadFailed(@Nullable GlideException glideException, @Nullable Object obj, @Nullable layoutChildWithAnchor<Drawable> layoutchildwithanchor, boolean z) {
                    String str;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) this.setMin.this$0.setMin(resetInternal.setMax.drawDividersVertical);
                    if (appCompatTextView == null) {
                        return false;
                    }
                    TextView textView = appCompatTextView;
                    UserBankModel length = this.setMin.this$0.toFloatRange;
                    if (length != null) {
                        str = length.equals;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    RequestMoneyBankQrCardFragment.getMax(textView, str);
                    return false;
                }

                private boolean setMax() {
                    AppCompatTextView appCompatTextView = (AppCompatTextView) this.setMin.this$0.setMin(resetInternal.setMax.drawDividersVertical);
                    if (appCompatTextView == null) {
                        return false;
                    }
                    View view = appCompatTextView;
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    view.setVisibility(8);
                    return false;
                }
            };
        }
    }

    public final void setMax() {
        String str;
        Bundle arguments = getArguments();
        if (arguments != null) {
            UserBankModel userBankModel = (UserBankModel) arguments.getParcelable("extra_user_bank_model");
            if (userBankModel != null) {
                TextView textView = (TextView) setMin(resetInternal.setMax.getVirtualChildAt);
                if (textView != null) {
                    String str2 = userBankModel.getMin;
                    Object[] objArr = new Object[1];
                    if (str2.length() >= 4) {
                        str2 = str2.substring(str2.length() - 4);
                    }
                    objArr[0] = str2;
                    textView.setText(String.format("•••• %s", objArr));
                }
                TextView textView2 = (TextView) setMin(resetInternal.setMax.getWeightSum);
                if (textView2 != null) {
                    textView2.setText(userBankModel.getMax);
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) setMin(resetInternal.setMax.onWindowStartingSupportActionMode);
                if (appCompatImageView != null) {
                    ImageView imageView = appCompatImageView;
                    if (!StringsKt.isBlank(userBankModel.setMin)) {
                        Object[] objArr2 = new Object[1];
                        String str3 = userBankModel.setMin;
                        Locale locale = Locale.ROOT;
                        Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
                        if (str3 != null) {
                            String lowerCase = str3.toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            objArr2[0] = lowerCase;
                            str = String.format("https://a.m.dana.id/resource/imgs/skywalker/banklogos/%s.png", Arrays.copyOf(objArr2, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(this, *args)");
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        str = "";
                    }
                    ((updateCornerMarking) Glide.getMax(imageView.getContext())).setMax(str).setMax((int) R.drawable.ic_other_bank).setMin((int) R.drawable.ic_other_bank).setMax((toFloatRange.AnonymousClass4) this.isInside.getValue()).length(imageView);
                }
                QRView qRView = (QRView) setMin(resetInternal.setMax.setShowingForActionMode);
                if (qRView != null) {
                    qRView.displayUserAvatar(userBankModel.getMin());
                }
                Unit unit = Unit.INSTANCE;
            } else {
                userBankModel = null;
            }
            this.toFloatRange = userBankModel;
        }
        super.setMax();
        FloatingActionButton floatingActionButton = (FloatingActionButton) setMin(resetInternal.setMax.invokeSuspend);
        if (floatingActionButton != null) {
            View view = floatingActionButton;
            view.setVisibility(0);
            view.setOnClickListener(new toIntRange(this));
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) setMin(resetInternal.setMax.ICustomTabsCallback$Default);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new isInside(this));
        }
        getMax(new access$2900(10000, 20000000));
    }

    public final void FastBitmap$CoordinateSystem() {
        UserBankModel userBankModel = this.toFloatRange;
        if (userBankModel != null) {
            Grayscale$Algorithm();
            GriverCaptureActivity.length length2 = this.userBankQrPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userBankQrPresenter");
            }
            length2.length(userBankModel, getMax(), equals());
        }
    }

    public final void values() {
        UserBankModel userBankModel = this.toFloatRange;
        if (userBankModel != null) {
            Grayscale$Algorithm();
            GriverCaptureActivity.length length2 = this.userBankQrPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userBankQrPresenter");
            }
            length2.length(userBankModel, getMax(), equals());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements View.OnClickListener {
        final /* synthetic */ RequestMoneyBankQrCardFragment getMin;

        isInside(RequestMoneyBankQrCardFragment requestMoneyBankQrCardFragment) {
            this.getMin = requestMoneyBankQrCardFragment;
        }

        public final void onClick(View view) {
            this.getMin.values();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"id/dana/requestmoney/bank/RequestMoneyBankQrCardFragment$getUserBankQrModule$1", "Lid/dana/requestmoney/bank/UserBankQrContract$View;", "onGetBankQr", "", "qrUserBankModel", "Lid/dana/requestmoney/model/QrUserBankModel;", "onGetBankQrFail", "generalError", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping implements GriverCaptureActivity.setMin {
        final /* synthetic */ RequestMoneyBankQrCardFragment length;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        IsOverlapping(RequestMoneyBankQrCardFragment requestMoneyBankQrCardFragment) {
            this.length = requestMoneyBankQrCardFragment;
        }

        public final void getMin(@NotNull access$2800 access_2800) {
            Intrinsics.checkNotNullParameter(access_2800, "qrUserBankModel");
            RequestMoneyBankQrCardFragment.getMin(this.length);
            TextView textView = (TextView) this.length.setMin(resetInternal.setMax.setVerticalGravity);
            if (textView != null) {
                RequestMoneyBankQrCardFragment.setMax(this.length, textView, access_2800);
            }
            this.length.getMin(access_2800.length);
            QRView qRView = (QRView) this.length.setMin(resetInternal.setMax.setShowingForActionMode);
            if (qRView != null) {
                UserBankModel length2 = this.length.toFloatRange;
                String min = length2 != null ? length2.getMin() : null;
                if (min == null) {
                    min = "";
                }
                qRView.displayUserAvatar(min);
            }
            this.length.getMax(false);
            RequestMoneyBankQrCardFragment.getMax(this.length, access_2800);
            this.length.setMax(access_2800.length);
        }

        public final void getMin(@NotNull String str) {
            int length2 = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length2);
            if (length2 != max) {
                onCanceled oncanceled = new onCanceled(length2, max, 1);
                onCancelLoad.setMax(1804109005, oncanceled);
                onCancelLoad.getMin(1804109005, oncanceled);
            }
            Intrinsics.checkNotNullParameter(str, "generalError");
            this.length.Mean$Arithmetic();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"id/dana/requestmoney/bank/RequestMoneyBankQrCardFragment$startCountdownTimer$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toString extends CountDownTimer {
        final /* synthetic */ RequestMoneyBankQrCardFragment getMin;
        final /* synthetic */ access$2800 setMax;

        public final void onTick(long j) {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toString(RequestMoneyBankQrCardFragment requestMoneyBankQrCardFragment, access$2800 access_2800, long j, long j2) {
            super(j, j2);
            this.getMin = requestMoneyBankQrCardFragment;
            this.setMax = access_2800;
        }

        public final void onFinish() {
            RequestMoneyBankQrCardFragment.setMax(this.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, d2 = {"id/dana/requestmoney/bank/RequestMoneyBankQrCardFragment$getRequestMoneyModule$1", "Lid/dana/requestmoney/RequestMoneyQrContract$View;", "onDeeplinkActive", "", "active", "", "onFinishGetHomeInfo", "homeInfo", "Lid/dana/model/HomeInfo;", "avatarUrl", "", "onFinishGetRequestMoneyInfo", "requestMoneyInfo", "Lid/dana/requestmoney/model/RequestMoneyInfoModel;", "onGetTransferQrFail", "message", "onGetTransferQrSuccess", "qrCode", "onQrisActive", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements loadOriginalImage.setMin {
        final /* synthetic */ RequestMoneyBankQrCardFragment setMax;

        public final void getMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
        }

        public final void getMax(boolean z) {
        }

        public final void length(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "qrCode");
        }

        public final void setMax(@NotNull InputBridgeExtension inputBridgeExtension, @NotNull String str) {
            Intrinsics.checkNotNullParameter(inputBridgeExtension, "homeInfo");
            Intrinsics.checkNotNullParameter(str, AccountEntityRepository.UpdateType.AVATAR);
        }

        public final void setMin(@NotNull access$2900 access_2900) {
            Intrinsics.checkNotNullParameter(access_2900, "requestMoneyInfo");
        }

        setMax(RequestMoneyBankQrCardFragment requestMoneyBankQrCardFragment) {
            this.setMax = requestMoneyBankQrCardFragment;
        }

        public final void setMax(boolean z) {
            this.setMax.length(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"id/dana/requestmoney/bank/RequestMoneyBankQrCardFragment$getGenerateDeepLinkModule$1", "Lid/dana/contract/deeplink/generation/GenerateDeepLinkContract$ProfileView;", "dismissProgress", "", "onError", "errorMessage", "", "onProfileQrDeepLinkGenerated", "deepLink", "retryDeepLinkWithProfileQrUrl", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements getTransitionProperties.setMax {
        final /* synthetic */ RequestMoneyBankQrCardFragment length;

        public final void dismissProgress() {
        }

        public final void getMin() {
        }

        public final void onError(@NotNull String str) {
            int length2 = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length2);
            if (length2 != max) {
                onCanceled oncanceled = new onCanceled(length2, max, 1);
                onCancelLoad.setMax(772778899, oncanceled);
                onCancelLoad.getMin(772778899, oncanceled);
            }
            Intrinsics.checkNotNullParameter(str, "errorMessage");
        }

        public final void showProgress() {
        }

        setMin(RequestMoneyBankQrCardFragment requestMoneyBankQrCardFragment) {
            this.length = requestMoneyBankQrCardFragment;
        }

        public final void setMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "deepLink");
            RequestMoneyBankQrCardFragment.setMin(this.length, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"id/dana/requestmoney/bank/RequestMoneyBankQrCardFragment$getGenerateDeepLinkModule$2", "Lid/dana/contract/deeplink/generation/GenerateDeepLinkContract$TransferView;", "dismissProgress", "", "onError", "errorMessage", "", "onTransferQrDeepLinkGenerated", "deepLink", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements getTransitionProperties.IsOverlapping {
        final /* synthetic */ RequestMoneyBankQrCardFragment setMin;

        public final void dismissProgress() {
        }

        public final void onError(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "errorMessage");
        }

        public final void showProgress() {
        }

        getMin(RequestMoneyBankQrCardFragment requestMoneyBankQrCardFragment) {
            this.setMin = requestMoneyBankQrCardFragment;
        }

        public final void setMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "deepLink");
            RequestMoneyBankQrCardFragment.setMin(this.setMin, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"id/dana/requestmoney/bank/RequestMoneyBankQrCardFragment$getUserBankModule$1", "Lid/dana/requestmoney/bank/UserBankContract$View;", "onDeleteUserBank", "", "success", "", "userBankModel", "Lid/dana/requestmoney/model/UserBankModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals extends publishImageAction.length {
        final /* synthetic */ RequestMoneyBankQrCardFragment setMax;

        equals(RequestMoneyBankQrCardFragment requestMoneyBankQrCardFragment) {
            this.setMax = requestMoneyBankQrCardFragment;
        }

        public final void setMax(boolean z, @NotNull UserBankModel userBankModel) {
            Intrinsics.checkNotNullParameter(userBankModel, "userBankModel");
            if (z) {
                BaseActivity baseActivity = this.setMax.getMax;
                if (!(baseActivity instanceof RequestMoneyActivity)) {
                    baseActivity = null;
                }
                RequestMoneyActivity requestMoneyActivity = (RequestMoneyActivity) baseActivity;
                if (requestMoneyActivity != null) {
                    requestMoneyActivity.onBankDeleted(userBankModel);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnClickListener {
        final /* synthetic */ RequestMoneyBankQrCardFragment length;

        toIntRange(RequestMoneyBankQrCardFragment requestMoneyBankQrCardFragment) {
            this.length = requestMoneyBankQrCardFragment;
        }

        public final void onClick(View view) {
            RequestMoneyBankQrCardFragment.equals(this.length);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/requestmoney/bank/RequestMoneyBankQrCardFragment$Companion;", "", "()V", "EXTRA_USER_BANK_MODEL", "", "MAXIMUM_AMOUNT", "", "MINIMUM_AMOUNT", "createInstance", "Lid/dana/requestmoney/bank/RequestMoneyBankQrCardFragment;", "userBankModel", "Lid/dana/requestmoney/model/UserBankModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public final void onDestroyView() {
        if (this.equals != null) {
            CountDownTimer countDownTimer = this.equals;
            if (countDownTimer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
            }
            countDownTimer.cancel();
        }
        super.onDestroyView();
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final void toDoubleRange() {
        PrepareException.AnonymousClass1 r2;
        onDownloadFinish.setMax setmax = new onDownloadFinish.setMax((byte) 0);
        if (this.getMax != null) {
            r2 = this.getMax.getApplicationComponent();
        } else {
            r2 = null;
        }
        if (r2 != null) {
            setmax.length = r2;
            setmax.getMin = new RequestMoneyQrModule(new setMax(this));
            setmax.setMax = new GenerateDeepLinkModule(new setMin(this), new getMin(this));
            setmax.getMax = new UserBankModule(new equals(this));
            setmax.setMin = new UserBankQrModule(new IsOverlapping(this));
            stopIgnoring.setMin(setmax.getMin, RequestMoneyQrModule.class);
            stopIgnoring.setMin(setmax.setMax, GenerateDeepLinkModule.class);
            stopIgnoring.setMin(setmax.getMax, UserBankModule.class);
            stopIgnoring.setMin(setmax.setMin, UserBankQrModule.class);
            stopIgnoring.setMin(setmax.length, PrepareException.AnonymousClass1.class);
            new onDownloadFinish(setmax.getMin, setmax.setMax, setmax.getMax, setmax.setMin, setmax.length, (byte) 0).setMax(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[3];
            loadOriginalImage.setMax setmax2 = this.requestMoneyQrPresenter;
            if (setmax2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requestMoneyQrPresenter");
            }
            getminArr[0] = setmax2;
            getTransitionProperties.getMax getmax = this.transferDeepLinkPresenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("transferDeepLinkPresenter");
            }
            getminArr[1] = getmax;
            publishImageAction.setMin setmin = this.userBankPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userBankPresenter");
            }
            getminArr[2] = setmin;
            getMin(getminArr);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void getMin(RequestMoneyBankQrCardFragment requestMoneyBankQrCardFragment) {
        QRView qRView = (QRView) requestMoneyBankQrCardFragment.setMin(resetInternal.setMax.setShowingForActionMode);
        if (qRView != null) {
            qRView.hideSkeleton();
        }
        SocialShareView socialShareView = (SocialShareView) requestMoneyBankQrCardFragment.setMin(resetInternal.setMax.getLastBaselineToBottomHeight);
        if (socialShareView != null) {
            socialShareView.setEnableShareButton(true);
        }
    }

    public static final /* synthetic */ void setMax(RequestMoneyBankQrCardFragment requestMoneyBankQrCardFragment, TextView textView, access$2800 access_2800) {
        textView.setVisibility(0);
        Locale locale = Locale.getDefault();
        String format = new SimpleDateFormat("dd MMM yyyy HH:mm", locale).format(new Date(access_2800.getMax));
        Intrinsics.checkNotNullExpressionValue(format, "DateTimeUtil.getDateTime…e(), expireDateTimestamp)");
        String string = requestMoneyBankQrCardFragment.getString(R.string.request_money_expiry_refresh_time);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.reque…oney_expiry_refresh_time)");
        String format2 = String.format(string, Arrays.copyOf(new Object[]{format}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(this, *args)");
        Intrinsics.checkNotNullParameter(format2, "$this$bold");
        Intrinsics.checkNotNullParameter(format, "targetText");
        SpannableStringBuilder min = setH5MenuList.getMin(format2, format);
        Intrinsics.checkNotNullExpressionValue(min, "TextUtil.boldText(result…nnable, this, targetText)");
        textView.setText(min);
    }

    public static final /* synthetic */ void getMax(RequestMoneyBankQrCardFragment requestMoneyBankQrCardFragment, access$2800 access_2800) {
        if (requestMoneyBankQrCardFragment.equals != null) {
            CountDownTimer countDownTimer = requestMoneyBankQrCardFragment.equals;
            if (countDownTimer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
            }
            countDownTimer.cancel();
        }
        CountDownTimer tostring = new toString(requestMoneyBankQrCardFragment, access_2800, TimeUnit.SECONDS.toMillis(access_2800.setMin), TimeUnit.SECONDS.toMillis(1));
        requestMoneyBankQrCardFragment.equals = tostring;
        if (tostring == null) {
            Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
        }
        tostring.start();
    }

    public static final /* synthetic */ void setMax(RequestMoneyBankQrCardFragment requestMoneyBankQrCardFragment) {
        TextView textView = (TextView) requestMoneyBankQrCardFragment.setMin(resetInternal.setMax.setVerticalGravity);
        if (textView != null) {
            textView.setText(requestMoneyBankQrCardFragment.getString(R.string.request_money_expiry_expired));
        }
        requestMoneyBankQrCardFragment.Mean$Arithmetic();
        requestMoneyBankQrCardFragment.getMax(true);
        requestMoneyBankQrCardFragment.setMax(false);
        SocialShareView socialShareView = (SocialShareView) requestMoneyBankQrCardFragment.setMin(resetInternal.setMax.getLastBaselineToBottomHeight);
        if (socialShareView != null) {
            socialShareView.setEnableShareButton(false);
        }
    }

    public static final /* synthetic */ void setMin(RequestMoneyBankQrCardFragment requestMoneyBankQrCardFragment, String str) {
        requestMoneyBankQrCardFragment.getMin(str);
        SocialShareView socialShareView = (SocialShareView) requestMoneyBankQrCardFragment.setMin(resetInternal.setMax.getLastBaselineToBottomHeight);
        if (socialShareView != null) {
            socialShareView.setSharingMessage(requestMoneyBankQrCardFragment.getString(R.string.share_request_money_link), str);
        }
    }

    public static final /* synthetic */ void equals(RequestMoneyBankQrCardFragment requestMoneyBankQrCardFragment) {
        isBaselineAligned isbaselinealigned = (isBaselineAligned) requestMoneyBankQrCardFragment.setMax.getValue();
        if (isbaselinealigned != null) {
            isbaselinealigned.show();
        }
    }

    public static final /* synthetic */ isBaselineAligned IsOverlapping(RequestMoneyBankQrCardFragment requestMoneyBankQrCardFragment) {
        return (isBaselineAligned) requestMoneyBankQrCardFragment.setMax.getValue();
    }

    public static final /* synthetic */ void getMax(TextView textView, String str) {
        textView.setVisibility(0);
        textView.setText(str);
    }
}
