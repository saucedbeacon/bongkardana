package id.dana.home;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.di.modules.KycAmlEddModule;
import id.dana.home.model.EddAnswerInfoDTOModel;
import id.dana.home.model.EddInfoModel;
import id.dana.home.model.EddQuestionInfoDTOModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.CornerMarkingDataProvider;
import o.GriverManifest;
import o.GriverRVEnvironmentServiceImpl;
import o.GriverShouldLoadUrlExtension;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.JSAPIMonitorExtension;
import o.NebulaAuthDialogProxy;
import o.PrepareException;
import o.SnapshotSaveExtension;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.resetInternal;
import o.setCancelText;
import o.setPublishStatus;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0014J\b\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u001cH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0016J\b\u0010#\u001a\u00020\u001cH\u0016J\b\u0010$\u001a\u00020\u001cH\u0002J\b\u0010%\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020\u001cH\u0002J\b\u0010'\u001a\u00020\u001cH\u0002J\b\u0010(\u001a\u00020\u001cH\u0002J\b\u0010)\u001a\u00020\u001cH\u0016J\u0018\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0004H\u0002J\b\u0010-\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0018\u0010\u0019¨\u0006/"}, d2 = {"Lid/dana/home/KycAmlEddActivity;", "Lid/dana/base/BaseActivity;", "()V", "amlOrderId", "", "danaLoadingDialog", "Lid/dana/dialog/DanaLoadingDialog;", "getDanaLoadingDialog", "()Lid/dana/dialog/DanaLoadingDialog;", "danaLoadingDialog$delegate", "Lkotlin/Lazy;", "eddQuestionInfoDTOBaseModels", "Ljava/util/ArrayList;", "Lid/dana/home/model/EddQuestionInfoDTOModel;", "Lkotlin/collections/ArrayList;", "kycAdapterModels", "kycAmlEddPresenter", "Lid/dana/kycamledd/KycAmlEddPresenter;", "getKycAmlEddPresenter", "()Lid/dana/kycamledd/KycAmlEddPresenter;", "setKycAmlEddPresenter", "(Lid/dana/kycamledd/KycAmlEddPresenter;)V", "kycEmlAddAdapter", "Lid/dana/home/KycEmlAddAdapter;", "getKycEmlAddAdapter", "()Lid/dana/home/KycEmlAddAdapter;", "kycEmlAddAdapter$delegate", "checkButtonAvailability", "", "hashMapSize", "", "configToolbar", "dismissLoading", "extractIntent", "getLayout", "init", "initAdapterHeader", "initInjector", "initItems", "initRecylerView", "initVerifyButtonListener", "onBackPressed", "onRadioButtonSelectedListener", "questionId", "answerId", "showLoading", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class KycAmlEddActivity extends BaseActivity {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    /* access modifiers changed from: private */
    public static final int IsOverlapping = CornerMarkingDataProvider.AnonymousClass2.setMax();
    @NotNull
    public static final String KYC_AML_EDD_INTENT = "kyc_aml_edd_intent";
    private final ArrayList<EddQuestionInfoDTOModel> getMax = new ArrayList<>();
    private final ArrayList<EddQuestionInfoDTOModel> getMin = new ArrayList<>();
    private final Lazy isInside = LazyKt.lazy(new length(this));
    @Inject
    public JSAPIMonitorExtension kycAmlEddPresenter;
    /* access modifiers changed from: private */
    public String setMax;
    private final Lazy toFloatRange = LazyKt.lazy(new setMax(this));
    private HashMap toIntRange;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-1065137841, oncanceled);
            onCancelLoad.getMin(-1065137841, oncanceled);
        }
        if (this.toIntRange == null) {
            this.toIntRange = new HashMap();
        }
        View view = (View) this.toIntRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toIntRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void configToolbar() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(861677127, oncanceled);
            onCancelLoad.getMin(861677127, oncanceled);
        }
    }

    public final int getLayout() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0) {
            return R.layout.activity_kyc_aml_edd;
        }
        onCanceled oncanceled = new onCanceled(0, length2, 4);
        onCancelLoad.setMax(-141229645, oncanceled);
        onCancelLoad.getMin(-141229645, oncanceled);
        return R.layout.activity_kyc_aml_edd;
    }

    public final void onBackPressed() {
    }

    public static final /* synthetic */ void access$checkButtonAvailability(KycAmlEddActivity kycAmlEddActivity, int i) {
        Button button;
        int min;
        int length2;
        Context baseContext = kycAmlEddActivity.getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-158070982, oncanceled);
            onCancelLoad.getMin(-158070982, oncanceled);
        }
        Context baseContext2 = kycAmlEddActivity.getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.setMin(context, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-158070982, oncanceled2);
            onCancelLoad.getMin(-158070982, oncanceled2);
        }
        if (i >= kycAmlEddActivity.getMax.size() && (button = (Button) kycAmlEddActivity._$_findCachedViewById(resetInternal.setMax.MediaMetadataCompat$BitmapKey)) != null) {
            button.setEnabled(true);
        }
    }

    public static final /* synthetic */ void access$dismissLoading(KycAmlEddActivity kycAmlEddActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1477772322, oncanceled);
            onCancelLoad.getMin(-1477772322, oncanceled);
        }
        ((setPublishStatus) kycAmlEddActivity.toFloatRange.getValue()).getMax();
    }

    public static final /* synthetic */ String access$getAmlOrderId$p(KycAmlEddActivity kycAmlEddActivity) {
        String str = kycAmlEddActivity.setMax;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("amlOrderId");
        }
        return str;
    }

    public static final /* synthetic */ void access$onRadioButtonSelectedListener(KycAmlEddActivity kycAmlEddActivity, String str, String str2) {
        int length2;
        int min;
        Context baseContext = kycAmlEddActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1619788681, oncanceled);
            onCancelLoad.getMin(-1619788681, oncanceled);
        }
        JSAPIMonitorExtension jSAPIMonitorExtension = kycAmlEddActivity.kycAmlEddPresenter;
        if (jSAPIMonitorExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kycAmlEddPresenter");
        }
        Intrinsics.checkNotNullParameter(str, "questionId");
        Intrinsics.checkNotNullParameter(str2, "answerId");
        jSAPIMonitorExtension.length.put(str, str2);
        JSAPIMonitorExtension jSAPIMonitorExtension2 = kycAmlEddActivity.kycAmlEddPresenter;
        if (jSAPIMonitorExtension2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kycAmlEddPresenter");
        }
        jSAPIMonitorExtension2.setMin.getMax(jSAPIMonitorExtension2.length.size());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/dialog/DanaLoadingDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<setPublishStatus> {
        final /* synthetic */ KycAmlEddActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(KycAmlEddActivity kycAmlEddActivity) {
            super(0);
            this.this$0 = kycAmlEddActivity;
        }

        @NotNull
        public final setPublishStatus invoke() {
            return new setPublishStatus(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/home/KycEmlAddAdapter;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<GriverManifest.AnonymousClass39> {
        final /* synthetic */ KycAmlEddActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(KycAmlEddActivity kycAmlEddActivity) {
            super(0);
            this.this$0 = kycAmlEddActivity;
        }

        @NotNull
        public final GriverManifest.AnonymousClass39 invoke() {
            return new IMultiInstanceInvalidationCallback.Stub<Ignore<EddQuestionInfoDTOModel>, EddQuestionInfoDTOModel>(new Function2<String, String, Unit>(this) {
                final /* synthetic */ length this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((String) obj, (String) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull String str, @NotNull String str2) {
                    Intrinsics.checkNotNullParameter(str, "questionId");
                    Intrinsics.checkNotNullParameter(str2, "answerId");
                    KycAmlEddActivity.access$onRadioButtonSelectedListener(this.this$0.this$0, str, str2);
                }
            }) {
                @NotNull
                public static final getMax length = new getMax((byte) 0);
                private final Function2<String, String, Unit> setMax;

                public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
                    Ignore ignore;
                    Intrinsics.checkNotNullParameter(viewGroup, "parent");
                    if (i == 0) {
                        ignore = new Ignore<EddQuestionInfoDTOModel>(viewGroup) {
                            @NotNull
                            private final ViewGroup getMin;

                            public final /* synthetic */ void setMax(Object obj) {
                                Intrinsics.checkNotNullParameter((EddQuestionInfoDTOModel) obj, "data");
                            }

                            {
                                Intrinsics.checkNotNullParameter(r3, "parent");
                                this.getMin = r3;
                            }
                        };
                    } else {
                        ignore = new Ignore<EddQuestionInfoDTOModel>(viewGroup, this.setMax) {
                            /* access modifiers changed from: private */
                            public final Function2<String, String, Unit> getMax;
                            @NotNull
                            private final ViewGroup getMin;

                            public final /* synthetic */ void setMax(Object obj) {
                                EddQuestionInfoDTOModel eddQuestionInfoDTOModel = (EddQuestionInfoDTOModel) obj;
                                Intrinsics.checkNotNullParameter(eddQuestionInfoDTOModel, "data");
                                View view = this.itemView;
                                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                                TextView textView = (TextView) view.findViewById(resetInternal.setMax.ensureLogoView);
                                if (textView != null) {
                                    String str = eddQuestionInfoDTOModel.setMin;
                                    String str2 = eddQuestionInfoDTOModel.getMin;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str);
                                    sb.append(". ");
                                    sb.append(str2);
                                    textView.setText(sb.toString());
                                }
                                for (EddAnswerInfoDTOModel eddAnswerInfoDTOModel : eddQuestionInfoDTOModel.setMax) {
                                    AppCompatRadioButton appCompatRadioButton = new AppCompatRadioButton(this.length);
                                    appCompatRadioButton.setText(eddAnswerInfoDTOModel.getMin);
                                    appCompatRadioButton.setTag(eddAnswerInfoDTOModel.getMax);
                                    appCompatRadioButton.setTypeface(OptIn.length(this.length, R.font.f33532131296263));
                                    appCompatRadioButton.setTextColor(IntRange.setMax(this.length, R.color.f20392131099953));
                                    appCompatRadioButton.setTextSize(2, 14.0f);
                                    appCompatRadioButton.setSupportButtonTintList(new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{IntRange.setMax(this.length, R.color.f20372131099949), IntRange.setMax(this.length, R.color.f18632131099744)}));
                                    View view2 = this.itemView;
                                    Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                                    RadioGroup radioGroup = (RadioGroup) view2.findViewById(resetInternal.setMax.measureChildForCells);
                                    if (radioGroup != null) {
                                        radioGroup.addView(appCompatRadioButton);
                                    }
                                }
                                View view3 = this.itemView;
                                Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                                ((RadioGroup) view3.findViewById(resetInternal.setMax.measureChildForCells)).setOnCheckedChangeListener(new setMax(this, eddQuestionInfoDTOModel));
                            }

                            {
                                Intrinsics.checkNotNullParameter(r3, "parent");
                                Intrinsics.checkNotNullParameter(r4, "onRadioButtonSelectedListener");
                                this.getMin = r3;
                                this.getMax = r4;
                            }

                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/RadioGroup;", "kotlin.jvm.PlatformType", "id", "", "onCheckedChanged"}, k = 3, mv = {1, 4, 2})
                            /* renamed from: o.GriverManifest$37$setMax */
                            static final class setMax implements RadioGroup.OnCheckedChangeListener {
                                final /* synthetic */ EddQuestionInfoDTOModel getMax;
                                final /* synthetic */ AnonymousClass37 setMin;

                                setMax(AnonymousClass37 r1, EddQuestionInfoDTOModel eddQuestionInfoDTOModel) {
                                    this.setMin = r1;
                                    this.getMax = eddQuestionInfoDTOModel;
                                }

                                public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                                    Function2 max = this.setMin.getMax;
                                    String str = this.getMax.setMin;
                                    View findViewById = this.setMin.itemView.findViewById(i);
                                    Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById<AppCompatRadioButton>(id)");
                                    max.invoke(str, ((AppCompatRadioButton) findViewById).getTag().toString());
                                }
                            }
                        };
                    }
                    return ignore;
                }

                {
                    Intrinsics.checkNotNullParameter(r2, "onRadioButtonSelectedListener");
                    this.setMax = r2;
                }

                public final int getItemViewType(int i) {
                    return ((EddQuestionInfoDTOModel) setMin(i)).length;
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/home/KycEmlAddAdapter$Companion;", "", "()V", "KYC_AML_EDD_HEADER", "", "KYC_AML_EDD_ITEM", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                /* renamed from: o.GriverManifest$39$getMax */
                public static final class getMax {
                    private getMax() {
                    }

                    public /* synthetic */ getMax(byte b) {
                        this();
                    }
                }
            };
        }
    }

    @NotNull
    public final JSAPIMonitorExtension getKycAmlEddPresenter() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1906161155, oncanceled);
            onCancelLoad.getMin(1906161155, oncanceled);
        }
        JSAPIMonitorExtension jSAPIMonitorExtension = this.kycAmlEddPresenter;
        if (jSAPIMonitorExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kycAmlEddPresenter");
        }
        return jSAPIMonitorExtension;
    }

    public final void setKycAmlEddPresenter(@NotNull JSAPIMonitorExtension jSAPIMonitorExtension) {
        Intrinsics.checkNotNullParameter(jSAPIMonitorExtension, "<set-?>");
        this.kycAmlEddPresenter = jSAPIMonitorExtension;
    }

    public final void init() {
        int max;
        int length2;
        int min;
        int length3;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(2117079640, oncanceled);
            onCancelLoad.getMin(2117079640, oncanceled);
        }
        SnapshotSaveExtension.length length4 = new SnapshotSaveExtension.length((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            length4.length = applicationComponent;
            length4.setMax = new KycAmlEddModule(new getMax(this));
            stopIgnoring.setMin(length4.setMax, KycAmlEddModule.class);
            stopIgnoring.setMin(length4.length, PrepareException.AnonymousClass1.class);
            new SnapshotSaveExtension(length4.setMax, length4.length, (byte) 0).setMax(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            JSAPIMonitorExtension jSAPIMonitorExtension = this.kycAmlEddPresenter;
            if (jSAPIMonitorExtension == null) {
                Intrinsics.throwUninitializedPropertyAccessException("kycAmlEddPresenter");
            }
            getminArr[0] = jSAPIMonitorExtension;
            registerPresenter(getminArr);
            EddInfoModel eddInfoModel = (EddInfoModel) getIntent().getParcelableExtra(KYC_AML_EDD_INTENT);
            if (eddInfoModel != null) {
                this.getMax.addAll(eddInfoModel.setMin);
                this.setMax = eddInfoModel.getMin;
            }
            setTitle(getString(R.string.kyc_aml_edd_activity_toolbar));
            Button button = (Button) _$_findCachedViewById(resetInternal.setMax.MediaMetadataCompat$BitmapKey);
            if (button != null) {
                button.setOnClickListener(new setMin(this));
            }
            int max2 = dispatchOnCancelled.getMax(0);
            if (max2 != 0) {
                onCanceled oncanceled2 = new onCanceled(0, max2, 16);
                onCancelLoad.setMax(-173272322, oncanceled2);
                onCancelLoad.getMin(-173272322, oncanceled2);
            }
            Context baseContext2 = getBaseContext();
            Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
            if (!(applicationContext2 == null || (length2 = applicationContext2.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext2, length2)))) {
                onCanceled oncanceled3 = new onCanceled(length2, min, 32);
                onCancelLoad.setMax(200574816, oncanceled3);
                onCancelLoad.getMin(200574816, oncanceled3);
            }
            this.getMin.add(new EddQuestionInfoDTOModel((String) null, (String) null, (List) null, 0, 7));
            this.getMin.addAll(this.getMax);
            Context baseContext3 = getBaseContext();
            if (baseContext3 != null) {
                context = baseContext3.getApplicationContext();
            }
            if (!(context == null || 1991159321 == (max = dispatchOnCancelled.getMax(context, 1991159321)))) {
                onCanceled oncanceled4 = new onCanceled(1991159321, max, 512);
                onCancelLoad.setMax(1991159321, oncanceled4);
                onCancelLoad.getMin(1991159321, oncanceled4);
            }
            ((GriverManifest.AnonymousClass39) this.isInside.getValue()).getMin(this.getMin);
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportCompoundDrawablesTintMode);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                recyclerView.setAdapter((GriverManifest.AnonymousClass39) this.isInside.getValue());
                return;
            }
            return;
        }
        throw null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016¨\u0006\u0011"}, d2 = {"id/dana/home/KycAmlEddActivity$initInjector$1", "Lid/dana/kycamledd/KycAmlEddContract$View;", "dismissProgress", "", "onCheckAmlRequired", "kycAmlEddEnabled", "", "eddConsultModel", "Lid/dana/home/model/EddConsultModel;", "onError", "errorMessage", "", "onGetHashMapSize", "hashMapSize", "", "onSubmitKycAmlEdd", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements GriverShouldLoadUrlExtension.AnonymousClass1.getMax {
        final /* synthetic */ KycAmlEddActivity length;

        public final void setMax(boolean z, @NotNull GriverManifest.AnonymousClass6 r2) {
            Intrinsics.checkNotNullParameter(r2, "eddConsultModel");
        }

        getMax(KycAmlEddActivity kycAmlEddActivity) {
            this.length = kycAmlEddActivity;
        }

        public final void setMax() {
            this.length.finish();
        }

        public final void getMax(int i) {
            KycAmlEddActivity.access$checkButtonAvailability(this.length, i);
        }

        public final void showProgress() {
            KycAmlEddActivity.access$showLoading(this.length);
        }

        public final void dismissProgress() {
            KycAmlEddActivity.access$dismissLoading(this.length);
        }

        public final void onError(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "errorMessage");
            KycAmlEddActivity.access$dismissLoading(this.length);
            KycAmlEddActivity kycAmlEddActivity = this.length;
            setCancelText.length(kycAmlEddActivity, R.drawable.ic_close_red, R.drawable.bg_rounded_toast_failed, kycAmlEddActivity.getString(R.string.kyc_aml_edd_activity_snackbar_text), 48, 60, false, (String) null, 384);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ KycAmlEddActivity setMin;

        setMin(KycAmlEddActivity kycAmlEddActivity) {
            this.setMin = kycAmlEddActivity;
        }

        public final void onClick(View view) {
            JSAPIMonitorExtension kycAmlEddPresenter = this.setMin.getKycAmlEddPresenter();
            String access$getAmlOrderId$p = KycAmlEddActivity.access$getAmlOrderId$p(this.setMin);
            Intrinsics.checkNotNullParameter(access$getAmlOrderId$p, "amlOrderId");
            kycAmlEddPresenter.setMin.showProgress();
            kycAmlEddPresenter.getMin.execute(new JSAPIMonitorExtension.length(kycAmlEddPresenter), new GriverRVEnvironmentServiceImpl.getMin(NebulaAuthDialogProxy.AnonymousClass3.setMax(kycAmlEddPresenter.getMin(access$getAmlOrderId$p))));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/home/KycAmlEddActivity$Companion;", "", "()V", "KYC_AML_EDD_ACTIVITY_REQUEST_CODE", "", "getKYC_AML_EDD_ACTIVITY_REQUEST_CODE", "()I", "KYC_AML_EDD_INTENT", "", "TOAST_WIDTH", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }

        public static int setMax() {
            return KycAmlEddActivity.IsOverlapping;
        }
    }

    public static final /* synthetic */ void access$showLoading(KycAmlEddActivity kycAmlEddActivity) {
        setPublishStatus setpublishstatus = (setPublishStatus) kycAmlEddActivity.toFloatRange.getValue();
        if (!setpublishstatus.length.isShowing()) {
            setpublishstatus.length.show();
            setpublishstatus.getMax.startRefresh();
        }
    }
}
