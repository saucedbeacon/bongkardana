package id.dana.sendmoney_v2.recipient.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.di.modules.AddReceiverInfoModule;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.DanaContactModule;
import id.dana.di.modules.SavedBankModule;
import id.dana.di.modules.SortingSendMoneyModule;
import id.dana.domain.usereducation.BottomSheetOnBoardingScenario;
import id.dana.richview.SearchView;
import id.dana.scanner.ScannerActivity;
import id.dana.sendmoney.bank.AddReceiverDialogFragment;
import id.dana.sendmoney.model.RecentBankModel;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.RecipientSource;
import id.dana.sendmoney.model.RecipientViewModel;
import id.dana.sendmoney.recipient.RecipientIdType;
import id.dana.sendmoney.recipient.recent.RecentRecipientModule;
import id.dana.sendmoney.recipient.recent.RecentRecipientView;
import id.dana.sendmoney_v2.constants.SortingByConst;
import id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity;
import id.dana.sendmoney_v2.recipient.activity.SearchRecipientActivity;
import id.dana.sendmoney_v2.recipient.activity.SortBankAccountBottomSheetActivity;
import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import o.Action;
import o.BindArray;
import o.DecodeWrapper;
import o.GriverProgressBar;
import o.OverScrollerCopyed;
import o.PhotoItem;
import o.PrepareException;
import o.RedDotManager;
import o.Relation;
import o.ResourcePackagePool;
import o.SystemAlarmService;
import o.canScroll;
import o.changeMenuMode;
import o.findItemIndex;
import o.getDefaultProxy;
import o.getProgressViewStartOffset;
import o.getSelectedIndex;
import o.increaseCount;
import o.isBaselineAligned;
import o.isOriginHasAppInfo;
import o.isScrollingInDirection;
import o.moveToStart;
import o.newIntent;
import o.onDelete;
import o.onSuccess;
import o.removeItemAt;
import o.resetInternal;
import o.saveInstanceState;
import o.setBundle;
import o.setExclusiveItemChecked;
import o.setMediaId;
import o.setOnWheelViewListener;
import o.setOriginText;
import o.setPhotoIndex;
import o.setStateOn;
import o.springBack;
import o.stopIgnoring;
import o.timePassed;
import o.updateContent;
import o.updateScroll;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ô\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\"\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0006¦\u0001¨\u0001¬\u0001\u0018\u0000 ô\u00012\u00020\u00012\u00020\u0002:\u0002ô\u0001B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB)\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0001\u001a\u00020MH\u0002J\u001f\u0010\u0001\u001a\u00020M2\t\b\u0002\u0010\u0001\u001a\u0002042\t\b\u0002\u0010\u0001\u001a\u000204H\u0002J\t\u0010\u0001\u001a\u00020MH\u0002J\t\u0010\u0001\u001a\u00020MH\u0002J\u0007\u0010\u0001\u001a\u00020MJ\t\u0010\u0001\u001a\u00020MH\u0002J\t\u0010\u0001\u001a\u00020MH\u0002J\t\u0010\u0001\u001a\u00020MH\u0002J\u0013\u0010\u0001\u001a\u00020+2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0012\u0010\u0001\u001a\u0002042\u0007\u0010\u0001\u001a\u00020\bH\u0002J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u000204H\u0002J\n\u0010 \u0001\u001a\u00030¡\u0001H\u0002J\t\u0010¢\u0001\u001a\u00020\bH\u0016J\n\u0010£\u0001\u001a\u00030¤\u0001H\u0002J\u0010\u0010¥\u0001\u001a\u00030¦\u0001H\u0002¢\u0006\u0003\u0010§\u0001J\u000f\u0010p\u001a\u00030¨\u0001H\u0002¢\u0006\u0003\u0010©\u0001J\t\u0010ª\u0001\u001a\u000204H\u0002J\u0010\u0010«\u0001\u001a\u00030¬\u0001H\u0002¢\u0006\u0003\u0010­\u0001J\t\u0010®\u0001\u001a\u000204H\u0002J\u0012\u0010¯\u0001\u001a\u00020M2\u0007\u0010°\u0001\u001a\u00020_H\u0002J$\u0010±\u0001\u001a\u00020M2\u0007\u0010°\u0001\u001a\u00020_2\u0007\u0010²\u0001\u001a\u0002042\u0007\u0010³\u0001\u001a\u000204H\u0002J\u0013\u0010´\u0001\u001a\u00020M2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0007\u0010µ\u0001\u001a\u00020MJ\t\u0010¶\u0001\u001a\u00020MH\u0002J\u0013\u0010·\u0001\u001a\u00020M2\b\u0010¸\u0001\u001a\u00030¹\u0001H\u0016J\u0012\u0010º\u0001\u001a\u00020+2\u0007\u0010\u0001\u001a\u00020\bH\u0002J\u0013\u0010»\u0001\u001a\u00020+2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0012\u0010¼\u0001\u001a\u00020+2\u0007\u0010\u0001\u001a\u00020\bH\u0002J\u0013\u0010½\u0001\u001a\u00020M2\b\u0010¾\u0001\u001a\u00030¿\u0001H\u0002J\t\u0010À\u0001\u001a\u00020MH\u0002J\u0012\u0010Á\u0001\u001a\u00020M2\u0007\u0010\u0001\u001a\u00020\bH\u0002J\u0012\u0010Â\u0001\u001a\u00020M2\u0007\u0010°\u0001\u001a\u00020_H\u0017J2\u0010Ã\u0001\u001a\u00020M2\u0007\u0010Ä\u0001\u001a\u00020\b2\u0010\u0010Å\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001040Æ\u00012\b\u0010Ç\u0001\u001a\u00030È\u0001¢\u0006\u0003\u0010É\u0001J\t\u0010Ê\u0001\u001a\u00020MH\u0002J\t\u0010Ë\u0001\u001a\u00020MH\u0002J\t\u0010Ì\u0001\u001a\u00020MH\u0002J\t\u0010Í\u0001\u001a\u00020MH\u0002J\u0010\u0010Î\u0001\u001a\u00020M2\u0007\u0010Ï\u0001\u001a\u000204J\t\u0010Ð\u0001\u001a\u00020MH\u0002J\t\u0010Ñ\u0001\u001a\u00020MH\u0002J\t\u0010Ò\u0001\u001a\u00020MH\u0002J\t\u0010Ó\u0001\u001a\u00020MH\u0002J\u0010\u0010Ô\u0001\u001a\u00020M2\u0007\u0010²\u0001\u001a\u00020\bJ\u0012\u0010Õ\u0001\u001a\u00020M2\u0007\u0010Ö\u0001\u001a\u000204H\u0002J\t\u0010×\u0001\u001a\u00020MH\u0016J\t\u0010Ø\u0001\u001a\u00020MH\u0002J\t\u0010Ù\u0001\u001a\u00020MH\u0002J\t\u0010Ú\u0001\u001a\u00020MH\u0002J\t\u0010Û\u0001\u001a\u00020MH\u0002J\t\u0010Ü\u0001\u001a\u00020MH\u0002J\t\u0010Ý\u0001\u001a\u00020MH\u0002J\t\u0010Þ\u0001\u001a\u00020MH\u0002J\t\u0010ß\u0001\u001a\u00020MH\u0002J\u0012\u0010\u0001\u001a\u00020M2\u0007\u0010à\u0001\u001a\u00020+H\u0002J\t\u0010á\u0001\u001a\u00020MH\u0002J\t\u0010â\u0001\u001a\u00020MH\u0002J\t\u0010ã\u0001\u001a\u00020MH\u0002J\u0012\u0010ä\u0001\u001a\u00020M2\u0007\u0010å\u0001\u001a\u00020+H\u0002J\u0012\u0010æ\u0001\u001a\u000b ç\u0001*\u0004\u0018\u00010U0UH\u0002J\u0011\u0010è\u0001\u001a\u00020M2\u0006\u0010>\u001a\u00020+H\u0002J\u0017\u0010é\u0001\u001a\u00020M2\u000e\u0010ê\u0001\u001a\t\u0012\u0004\u0012\u00020]0ë\u0001J\u001b\u0010ì\u0001\u001a\u00020M2\u0010\u0010í\u0001\u001a\u000b\u0012\u0004\u0012\u00020_\u0018\u00010ë\u0001H\u0002J\t\u0010î\u0001\u001a\u00020MH\u0002J\u000e\u0010ï\u0001\u001a\u00020+*\u00030ð\u0001H\u0002J\u0017\u0010ñ\u0001\u001a\u000b ç\u0001*\u0004\u0018\u00010U0U*\u00030ò\u0001H\u0002J\u0017\u0010ó\u0001\u001a\u000b ç\u0001*\u0004\u0018\u00010U0U*\u00030ò\u0001H\u0002R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8BX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020+@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u00020+2\u0006\u0010*\u001a\u00020+@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\u001e\u00105\u001a\u0002042\u0006\u0010*\u001a\u000204@BX\u000e¢\u0006\b\n\u0000\"\u0004\b6\u00107R\u000e\u00108\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\u00020+8BX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010.R\u001a\u0010:\u001a\u00020+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010.\"\u0004\b;\u00100R\u001e\u0010<\u001a\u00020+2\u0006\u0010*\u001a\u00020+@BX\u000e¢\u0006\b\n\u0000\"\u0004\b=\u00100R\u001e\u0010>\u001a\u00020+2\u0006\u0010*\u001a\u00020+@BX\u000e¢\u0006\b\n\u0000\"\u0004\b?\u00100R\u000e\u0010@\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010E\u001a\u00020F8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR \u0010K\u001a\b\u0012\u0004\u0012\u00020M0LX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u000e\u0010R\u001a\u00020SX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010T\u001a\u0004\u0018\u00010UX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010V\u001a\u00020W8BX\u0002¢\u0006\f\n\u0004\bZ\u0010\u0011\u001a\u0004\bX\u0010YR\u0014\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\\X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010`\u001a\u00020a8BX\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u001e\u0010d\u001a\u00020e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u000e\u0010j\u001a\u00020kX.¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020mX.¢\u0006\u0002\n\u0000R\u001c\u0010n\u001a\u0004\u0018\u00010oX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0014\u0010t\u001a\u00020u8BX\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u001e\u0010x\u001a\u00020y8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u0015\u0010~\u001a\u00020\b8BX\u0004¢\u0006\u0007\u001a\u0005\b\u0010\u0001R\u000f\u0010\u0001\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0001\u001a\u00030\u00018BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R$\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0010\u0010\u0001\u001a\u00030\u0001X.¢\u0006\u0002\n\u0000¨\u0006õ\u0001"}, d2 = {"Lid/dana/sendmoney_v2/recipient/view/RecipientView;", "Lid/dana/base/BaseRichView;", "Lid/dana/sendmoney/recipient/recent/RecentRecipientView$ItemSelectedListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "addReceiverDialogFragment", "Lid/dana/sendmoney/bank/AddReceiverDialogFragment;", "getAddReceiverDialogFragment", "()Lid/dana/sendmoney/bank/AddReceiverDialogFragment;", "addReceiverDialogFragment$delegate", "Lkotlin/Lazy;", "addReceiverInfoModule", "Lid/dana/di/modules/AddReceiverInfoModule;", "getAddReceiverInfoModule", "()Lid/dana/di/modules/AddReceiverInfoModule;", "addReceiverInfoPresenter", "Lid/dana/contract/sendmoney/AddReceiverInfoContract$Presenter;", "getAddReceiverInfoPresenter", "()Lid/dana/contract/sendmoney/AddReceiverInfoContract$Presenter;", "setAddReceiverInfoPresenter", "(Lid/dana/contract/sendmoney/AddReceiverInfoContract$Presenter;)V", "bottomSheetOnBoardingModule", "Lid/dana/di/modules/BottomSheetOnBoardingModule;", "getBottomSheetOnBoardingModule", "()Lid/dana/di/modules/BottomSheetOnBoardingModule;", "danaContactModule", "Lid/dana/di/modules/DanaContactModule;", "getDanaContactModule", "()Lid/dana/di/modules/DanaContactModule;", "danaContactPresenter", "Lid/dana/contract/contact/DanaContactContract$Presenter;", "getDanaContactPresenter", "()Lid/dana/contract/contact/DanaContactContract$Presenter;", "setDanaContactPresenter", "(Lid/dana/contract/contact/DanaContactContract$Presenter;)V", "value", "", "enableInvite", "getEnableInvite", "()Z", "setEnableInvite", "(Z)V", "enableViewSection", "getEnableViewSection", "setEnableViewSection", "", "filter", "setFilter", "(Ljava/lang/String;)V", "hasPermission", "isEmptyBankResult", "isFirstTime", "setFirstTime", "isInitialSearch", "setInitialSearch", "isSearching", "setSearching", "keyboardShown", "maxSavedBank", "maximumBankAccountDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "needToUsePhoneInputType", "onBoardingPresenter", "Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;", "getOnBoardingPresenter", "()Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;", "setOnBoardingPresenter", "(Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;)V", "onContactSyncEnabled", "Lkotlin/Function0;", "", "getOnContactSyncEnabled", "()Lkotlin/jvm/functions/Function0;", "setOnContactSyncEnabled", "(Lkotlin/jvm/functions/Function0;)V", "pagedListConfig", "Landroidx/paging/PagedList$Config;", "pagedListDisposable", "Lio/reactivex/disposables/Disposable;", "permission", "Lid/dana/utils/permission/Permission;", "getPermission", "()Lid/dana/utils/permission/Permission;", "permission$delegate", "recentBankModels", "", "Lid/dana/sendmoney/model/RecentBankModel;", "recentRecipientModels", "Lid/dana/sendmoney/model/RecentRecipientModel;", "recentRecipientModule", "Lid/dana/sendmoney/recipient/recent/RecentRecipientModule;", "getRecentRecipientModule", "()Lid/dana/sendmoney/recipient/recent/RecentRecipientModule;", "recentRecipientPresenter", "Lid/dana/sendmoney/recipient/recent/RecentRecipientContract$Presenter;", "getRecentRecipientPresenter", "()Lid/dana/sendmoney/recipient/recent/RecentRecipientContract$Presenter;", "setRecentRecipientPresenter", "(Lid/dana/sendmoney/recipient/recent/RecentRecipientContract$Presenter;)V", "recipientAdapter", "Lid/dana/sendmoney_v2/recipient/adapter/RecipientAdapter;", "recipientDataSourceFactory", "Lid/dana/sendmoney_v2/recipient/datasource/RecipientDataSourceFactory;", "recipientSelectedListener", "Lid/dana/sendmoney/view/BaseRecipientListener;", "getRecipientSelectedListener", "()Lid/dana/sendmoney/view/BaseRecipientListener;", "setRecipientSelectedListener", "(Lid/dana/sendmoney/view/BaseRecipientListener;)V", "savedBankModule", "Lid/dana/di/modules/SavedBankModule;", "getSavedBankModule", "()Lid/dana/di/modules/SavedBankModule;", "savedBankPresenter", "Lid/dana/contract/sendmoney/bank/SavedBankCardContract$Presenter;", "getSavedBankPresenter", "()Lid/dana/contract/sendmoney/bank/SavedBankCardContract$Presenter;", "setSavedBankPresenter", "(Lid/dana/contract/sendmoney/bank/SavedBankCardContract$Presenter;)V", "sectionOffset", "getSectionOffset", "()I", "showFabBackToTop", "sortingSendMoneyModule", "Lid/dana/di/modules/SortingSendMoneyModule;", "getSortingSendMoneyModule", "()Lid/dana/di/modules/SortingSendMoneyModule;", "sortingSendMoneyPresenter", "Lid/dana/contract/sendmoney/v2/SortingSendMoneyPresenter;", "getSortingSendMoneyPresenter", "()Lid/dana/contract/sendmoney/v2/SortingSendMoneyPresenter;", "setSortingSendMoneyPresenter", "(Lid/dana/contract/sendmoney/v2/SortingSendMoneyPresenter;)V", "viewState", "Lid/dana/sendmoney_v2/recipient/view/RecipientViewState;", "addNewBankClicked", "addNewBankRecipient", "bankId", "bankNumber", "addPhoneNumberClicked", "checkBottomSheetOnBoardingAvailability", "checkContactSyncState", "checkFirstTime", "checkMaxBankAccount", "checkPermission", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "getDisplayName", "position", "getInitialChar", "", "input", "getItemDecorator", "Lid/dana/common/RecyclerViewSectionDecorator;", "getLayout", "getOnScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "getRecipientMoreSelectedListener", "id/dana/sendmoney_v2/recipient/view/RecipientView$getRecipientMoreSelectedListener$1", "()Lid/dana/sendmoney_v2/recipient/view/RecipientView$getRecipientMoreSelectedListener$1;", "id/dana/sendmoney_v2/recipient/view/RecipientView$getRecipientSelectedListener$1", "()Lid/dana/sendmoney_v2/recipient/view/RecipientView$getRecipientSelectedListener$1;", "getSearchHint", "getSectionCallback", "id/dana/sendmoney_v2/recipient/view/RecipientView$getSectionCallback$1", "()Lid/dana/sendmoney_v2/recipient/view/RecipientView$getSectionCallback$1;", "getValidBankNumberFromFilter", "handleClickedLinkType", "recentRecipientModel", "handleClickedRecipientType", "recipientType", "recipientIdType", "hideSoftInputOnTouchOutsideSearchView", "initRecipientView", "initSearchView", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "isCurrentInitialCharDifferentFromPrevious", "isNeedToHideSoftInputOnTouchOutsideSearchView", "isSectionViewType", "notifyListener", "recipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "observePagedList", "onItemClick", "onItemSelected", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onSearchingCanceled", "onSearchingStart", "openScanner", "openSortBankAccountBottomSheet", "redirectDeeplink", "action", "requestPermission", "saveDisplayedPermissionRequestDialog", "scrollToTop", "sendPhoneNumberClicked", "setRecipientContactType", "setSortingSection", "sortingBy", "setup", "setupCancelButton", "setupFabBackToTop", "setupIvScan", "setupKeyboardListener", "setupNewRecipient", "setupRecyclerView", "setupSectionTitle", "showBottomSheetTransferAgentReceiver", "visible", "showMaximumBankAccountDialog", "showRequestContactPermissionDialog", "showSortSection", "showX2BSection", "isListEmpty", "subscribeToPagedList", "kotlin.jvm.PlatformType", "toggleLayoutVisibility", "updateRecentBank", "newRecentBankModels", "", "updateRecentRecipient", "newRecentRecipientModels", "updateRecipientDataSourceFactory", "isFirstItemVisible", "Landroidx/recyclerview/widget/RecyclerView;", "subscribeToKeywordChange", "Lid/dana/richview/SearchView;", "subscribeToOnClickedEvent", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RecipientView extends BaseRichView implements RecentRecipientView.getMax {
    @NotNull
    public static final setMin Companion = new setMin((byte) 0);
    private GriverProgressBar.UpdateRunnable FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public String Grayscale$Algorithm;
    private HashMap ICustomTabsCallback;
    private List<increaseCount> IsOverlapping;
    /* access modifiers changed from: private */
    public boolean Mean$Arithmetic;
    @Inject
    public SystemAlarmService.setMin addReceiverInfoPresenter;
    private final Lazy b;
    private final setExclusiveItemChecked.getMin create;
    @Inject
    public moveToStart.setMin danaContactPresenter;
    /* access modifiers changed from: private */
    public int equals;
    private final Lazy getCause;
    /* access modifiers changed from: private */
    public isBaselineAligned getMax;
    private boolean getMin;
    private boolean hashCode;
    private boolean invoke;
    /* access modifiers changed from: private */
    public boolean invokeSuspend;
    /* access modifiers changed from: private */
    public boolean isInside;
    /* access modifiers changed from: private */
    public boolean length;
    @Inject
    public getSelectedIndex.length onBoardingPresenter;
    @Inject
    public setMediaId.setMax recentRecipientPresenter;
    @Inject
    public onSuccess.length savedBankPresenter;
    @NotNull
    private Function0<Unit> setMax;
    @Nullable
    private setPhotoIndex setMin;
    @Inject
    public Action sortingSendMoneyPresenter;
    /* access modifiers changed from: private */
    public updateContent toDoubleRange;
    private boolean toFloatRange;
    private List<RecentBankModel> toIntRange;
    /* access modifiers changed from: private */
    public springBack toString;
    private boolean valueOf;
    private OverScrollerCopyed.SplineOverScroller values;

    @JvmOverloads
    public RecipientView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public RecipientView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.ICustomTabsCallback;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.ICustomTabsCallback == null) {
            this.ICustomTabsCallback = new HashMap();
        }
        View view = (View) this.ICustomTabsCallback.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.ICustomTabsCallback.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_recipient_v2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "id/dana/sendmoney_v2/recipient/view/RecipientView$showMaximumBankAccountDialog$1$1$1", "id/dana/sendmoney_v2/recipient/view/RecipientView$$special$$inlined$apply$lambda$1"}, k = 3, mv = {1, 4, 2})
    static final class ICustomTabsCallback extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ BaseActivity $this_run$inlined;
        final /* synthetic */ RecipientView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ICustomTabsCallback(BaseActivity baseActivity, RecipientView recipientView) {
            super(1);
            this.$this_run$inlined = baseActivity;
            this.this$0 = recipientView;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            isBaselineAligned access$getMaximumBankAccountDialog$p = this.this$0.getMax;
            if (access$getMaximumBankAccountDialog$p != null) {
                access$getMaximumBankAccountDialog$p.dismiss();
            }
            RecipientView.addNewBankRecipient$default(this.this$0, (String) null, (String) null, 3, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "id/dana/sendmoney_v2/recipient/view/RecipientView$showMaximumBankAccountDialog$1$1$2", "id/dana/sendmoney_v2/recipient/view/RecipientView$$special$$inlined$apply$lambda$2"}, k = 3, mv = {1, 4, 2})
    static final class b extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ BaseActivity $this_run$inlined;
        final /* synthetic */ RecipientView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(BaseActivity baseActivity, RecipientView recipientView) {
            super(1);
            this.$this_run$inlined = baseActivity;
            this.this$0 = recipientView;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            isBaselineAligned access$getMaximumBankAccountDialog$p = this.this$0.getMax;
            if (access$getMaximumBankAccountDialog$p != null) {
                access$getMaximumBankAccountDialog$p.dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Landroidx/paging/PagedList;", "Lid/dana/sendmoney/model/RecipientViewModel;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class extraCallbackWithResult<T> implements RedDotManager<setExclusiveItemChecked<RecipientViewModel>> {
        final /* synthetic */ RecipientView setMin;

        extraCallbackWithResult(RecipientView recipientView) {
            this.setMin = recipientView;
        }

        public final /* synthetic */ void accept(Object obj) {
            RecipientView.access$getRecipientAdapter$p(this.setMin).isInside = this.setMin.Grayscale$Algorithm;
            RecipientView.access$getRecipientAdapter$p(this.setMin).setMin((setExclusiveItemChecked) obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class getCause extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        getCause(RecipientView recipientView) {
            super(1, recipientView, RecipientView.class, "onItemClick", "onItemClick(I)V", 0);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            RecipientView.access$onItemClick((RecipientView) this.receiver, i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isClicked", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 2})
    static final class onMessageChannelReady<T> implements RedDotManager<Boolean> {
        final /* synthetic */ RecipientView getMin;
        final /* synthetic */ SearchView setMax;

        onMessageChannelReady(RecipientView recipientView, SearchView searchView) {
            this.getMin = recipientView;
            this.setMax = searchView;
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            Intrinsics.checkNotNullExpressionValue(bool, "isClicked");
            if (bool.booleanValue()) {
                RecipientView.access$setSearching$p(this.getMin, true);
                if (this.getMin.Mean$Arithmetic) {
                    this.setMax.setSearchViewInputType(3);
                } else {
                    this.setMax.setSearchViewInputType(144);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class onRelationshipValidationResult<T> implements RedDotManager<String> {
        final /* synthetic */ RecipientView getMax;

        onRelationshipValidationResult(RecipientView recipientView) {
            this.getMax = recipientView;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            RecipientView recipientView = this.getMax;
            Intrinsics.checkNotNullExpressionValue(str, "it");
            recipientView.getMax(str);
        }
    }

    public static final /* synthetic */ springBack access$getRecipientAdapter$p(RecipientView recipientView) {
        springBack springback = recipientView.toString;
        if (springback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recipientAdapter");
        }
        return springback;
    }

    public static final /* synthetic */ updateContent access$getViewState$p(RecipientView recipientView) {
        updateContent updatecontent = recipientView.toDoubleRange;
        if (updatecontent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewState");
        }
        return updatecontent;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecipientView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RecipientView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMax = RecipientView$FastBitmap$CoordinateSystem.INSTANCE;
        this.getMin = true;
        this.equals = 30;
        this.toIntRange = new ArrayList();
        this.IsOverlapping = new ArrayList();
        this.hashCode = true;
        this.Grayscale$Algorithm = "";
        this.getCause = LazyKt.lazy(new values(this));
        this.b = LazyKt.lazy(new setMax(this));
        setExclusiveItemChecked.getMin.length length2 = new setExclusiveItemChecked.getMin.length();
        length2.getMax = 20;
        length2.setMin = 10;
        length2.setMax = false;
        setExclusiveItemChecked.getMin max = length2.setMax();
        Intrinsics.checkNotNullExpressionValue(max, "PagedList.Config.Builder…s(false)\n        .build()");
        this.create = max;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public RecipientView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMax = RecipientView$FastBitmap$CoordinateSystem.INSTANCE;
        this.getMin = true;
        this.equals = 30;
        this.toIntRange = new ArrayList();
        this.IsOverlapping = new ArrayList();
        this.hashCode = true;
        this.Grayscale$Algorithm = "";
        this.getCause = LazyKt.lazy(new values(this));
        this.b = LazyKt.lazy(new setMax(this));
        setExclusiveItemChecked.getMin.length length2 = new setExclusiveItemChecked.getMin.length();
        length2.getMax = 20;
        length2.setMin = 10;
        length2.setMax = false;
        setExclusiveItemChecked.getMin max = length2.setMax();
        Intrinsics.checkNotNullExpressionValue(max, "PagedList.Config.Builder…s(false)\n        .build()");
        this.create = max;
    }

    @NotNull
    public final SystemAlarmService.setMin getAddReceiverInfoPresenter() {
        SystemAlarmService.setMin setmin = this.addReceiverInfoPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addReceiverInfoPresenter");
        }
        return setmin;
    }

    public final void setAddReceiverInfoPresenter(@NotNull SystemAlarmService.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.addReceiverInfoPresenter = setmin;
    }

    @NotNull
    public final moveToStart.setMin getDanaContactPresenter() {
        moveToStart.setMin setmin = this.danaContactPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaContactPresenter");
        }
        return setmin;
    }

    public final void setDanaContactPresenter(@NotNull moveToStart.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.danaContactPresenter = setmin;
    }

    @NotNull
    public final onSuccess.length getSavedBankPresenter() {
        onSuccess.length length2 = this.savedBankPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savedBankPresenter");
        }
        return length2;
    }

    public final void setSavedBankPresenter(@NotNull onSuccess.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.savedBankPresenter = length2;
    }

    @NotNull
    public final getSelectedIndex.length getOnBoardingPresenter() {
        getSelectedIndex.length length2 = this.onBoardingPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onBoardingPresenter");
        }
        return length2;
    }

    public final void setOnBoardingPresenter(@NotNull getSelectedIndex.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.onBoardingPresenter = length2;
    }

    @NotNull
    public final Action getSortingSendMoneyPresenter() {
        Action action = this.sortingSendMoneyPresenter;
        if (action == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sortingSendMoneyPresenter");
        }
        return action;
    }

    public final void setSortingSendMoneyPresenter(@NotNull Action action) {
        Intrinsics.checkNotNullParameter(action, "<set-?>");
        this.sortingSendMoneyPresenter = action;
    }

    @NotNull
    public final setMediaId.setMax getRecentRecipientPresenter() {
        setMediaId.setMax setmax = this.recentRecipientPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentRecipientPresenter");
        }
        return setmax;
    }

    public final void setRecentRecipientPresenter(@NotNull setMediaId.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        this.recentRecipientPresenter = setmax;
    }

    @Nullable
    public final setPhotoIndex getRecipientSelectedListener() {
        return this.setMin;
    }

    public final void setRecipientSelectedListener(@Nullable setPhotoIndex setphotoindex) {
        this.setMin = setphotoindex;
    }

    @NotNull
    public final Function0<Unit> getOnContactSyncEnabled() {
        return this.setMax;
    }

    public final void setOnContactSyncEnabled(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.setMax = function0;
    }

    public final boolean isFirstTime() {
        return this.getMin;
    }

    public final void setFirstTime(boolean z) {
        this.getMin = z;
    }

    public final boolean getEnableViewSection() {
        return this.hashCode;
    }

    public final void setEnableViewSection(boolean z) {
        RecyclerView recyclerView;
        this.hashCode = z;
        if (!z || (recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.AlertDialogLayout)) == null || recyclerView.getItemDecorationCount() != 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            ((RecyclerView) _$_findCachedViewById(resetInternal.setMax.AlertDialogLayout)).removeItemDecoration(new canScroll((RecyclerView) _$_findCachedViewById(resetInternal.setMax.AlertDialogLayout), context.getResources().getDimensionPixelSize(R.dimen.f32202131165970), new toIntRange(this)));
            return;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
        ((RecyclerView) _$_findCachedViewById(resetInternal.setMax.AlertDialogLayout)).addItemDecoration(new canScroll((RecyclerView) _$_findCachedViewById(resetInternal.setMax.AlertDialogLayout), context2.getResources().getDimensionPixelSize(R.dimen.f32202131165970), new toIntRange(this)));
    }

    public final boolean getEnableInvite() {
        return this.valueOf;
    }

    public final void setEnableInvite(boolean z) {
        this.valueOf = z;
        springBack springback = this.toString;
        if (springback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recipientAdapter");
        }
        springback.equals = this.valueOf;
    }

    /* access modifiers changed from: private */
    public final void getMax(String str) {
        this.Grayscale$Algorithm = str;
        if (!this.invokeSuspend && (!StringsKt.isBlank(str)) && !this.invokeSuspend) {
            this.invokeSuspend = true;
            post(new isInside(this));
        }
        if (this.invokeSuspend) {
            this.invoke = false;
            if (0 == 0) {
                this.Mean$Arithmetic = false;
            }
            updateContent updatecontent = this.toDoubleRange;
            if (updatecontent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewState");
            }
            setBundle setbundle = updatecontent.setMax;
            if (Intrinsics.areEqual((Object) setbundle, (Object) setBundle.setMin.getMin)) {
                onSuccess.length length2 = this.savedBankPresenter;
                if (length2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("savedBankPresenter");
                }
                length2.getMax(this.Grayscale$Algorithm);
                setMediaId.setMax setmax = this.recentRecipientPresenter;
                if (setmax == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recentRecipientPresenter");
                }
                setmax.setMin(this.Grayscale$Algorithm);
            } else if (Intrinsics.areEqual((Object) setbundle, (Object) setBundle.getMin.getMin)) {
                onSuccess.length length3 = this.savedBankPresenter;
                if (length3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("savedBankPresenter");
                }
                length3.getMax(this.Grayscale$Algorithm);
            } else {
                getMin();
            }
        }
    }

    private final boolean setMin() {
        return this.invokeSuspend && this.toIntRange.isEmpty();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements Runnable {
        final /* synthetic */ RecipientView setMin;

        isInside(RecipientView recipientView) {
            this.setMin = recipientView;
        }

        public final void run() {
            RecipientView recipientView = this.setMin;
            RecipientView.access$toggleLayoutVisibility(recipientView, recipientView.invokeSuspend);
            if (this.setMin.invokeSuspend) {
                RecipientView.access$onSearchingStart(this.setMin);
            } else {
                RecipientView.access$onSearchingCanceled(this.setMin);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/utils/permission/Permission;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class values extends Lambda implements Function0<setStateOn> {
        final /* synthetic */ RecipientView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        values(RecipientView recipientView) {
            super(0);
            this.this$0 = recipientView;
        }

        public final setStateOn invoke() {
            setStateOn.getMin getmin = new setStateOn.getMin((Activity) this.this$0.getBaseActivity());
            getmin.length.add("android.permission.READ_CONTACTS");
            getmin.getMax = new setStateOn.length(this) {
                final /* synthetic */ values getMax;

                {
                    this.getMax = r1;
                }

                public final void getMin(@NotNull setStateOn.setMin setmin) {
                    Intrinsics.checkNotNullParameter(setmin, "report");
                    this.getMax.this$0.length = true;
                    this.getMax.this$0.getDanaContactPresenter().setMin();
                    this.getMax.this$0.getDanaContactPresenter().length();
                    this.getMax.this$0.getMin();
                }

                public final void setMin(@NotNull setStateOn.setMin setmin) {
                    Intrinsics.checkNotNullParameter(setmin, "report");
                    this.getMax.this$0.length = false;
                    RecipientView.access$checkBottomSheetOnBoardingAvailability(this.getMax.this$0);
                    this.getMax.this$0.getMin();
                }
            };
            return new setStateOn(getmin, (byte) 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016¨\u0006\u000f"}, d2 = {"id/dana/sendmoney_v2/recipient/view/RecipientView$danaContactModule$1", "Lid/dana/contract/contact/DanaContactContract$View;", "dismissProgress", "", "onEnableContactSyncFeature", "onError", "errorMessage", "", "onGetContactSyncState", "completed", "", "onGetDanaUserContactSuccess", "phoneNumbers", "", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements moveToStart.getMin {
        final /* synthetic */ RecipientView getMax;

        public final void dismissProgress() {
        }

        public final void onGetContactSyncState(boolean z) {
        }

        public final void showProgress() {
        }

        getMin(RecipientView recipientView) {
            this.getMax = recipientView;
        }

        public final void onError(@Nullable String str) {
            this.getMax.getSavedBankPresenter().length();
        }

        public final void onGetDanaUserContactSuccess(@Nullable List<String> list) {
            springBack access$getRecipientAdapter$p = RecipientView.access$getRecipientAdapter$p(this.getMax);
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            Intrinsics.checkNotNullParameter(list, "value");
            access$getRecipientAdapter$p.getMax = list;
            access$getRecipientAdapter$p.notifyDataSetChanged();
        }

        public final void onEnableContactSyncFeature() {
            this.getMax.getOnContactSyncEnabled().invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\u000f"}, d2 = {"id/dana/sendmoney_v2/recipient/view/RecipientView$savedBankModule$1", "Lid/dana/contract/sendmoney/bank/SavedBankCardContract$View;", "onGetMaxSavedBank", "", "maxSavedBank", "", "onGetRecentBankAfterRemoveSuccess", "recentBankModels", "", "Lid/dana/sendmoney/model/RecentBankModel;", "onGetRecentBankError", "onGetRecentBankIsEmptyAfterRemove", "onGetRecentBankSuccess", "onSearchRecentBankError", "onSearchSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toString implements onSuccess.getMax {
        final /* synthetic */ RecipientView length;

        toString(RecipientView recipientView) {
            this.length = recipientView;
        }

        public final void getMax(@NotNull List<RecentBankModel> list) {
            Intrinsics.checkNotNullParameter(list, "recentBankModels");
            this.length.updateRecentBank(list);
        }

        public final void length(@NotNull List<RecentBankModel> list) {
            Intrinsics.checkNotNullParameter(list, "recentBankModels");
            this.length.updateRecentBank(list);
        }

        public final void setMax(@NotNull List<RecentBankModel> list) {
            Intrinsics.checkNotNullParameter(list, "recentBankModels");
            this.length.updateRecentBank(list);
            BaseActivity baseActivity = this.length.getBaseActivity();
            if (baseActivity != null) {
                ((BankRecipientActivity) baseActivity).showSnackbarRemoved();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity");
        }

        public final void getMin() {
            this.length.updateRecentBank(CollectionsKt.emptyList());
            BaseActivity baseActivity = this.length.getBaseActivity();
            if (baseActivity != null) {
                ((BankRecipientActivity) baseActivity).showSnackbarRemoved();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity");
        }

        public final void getMax() {
            this.length.updateRecentBank(CollectionsKt.emptyList());
        }

        public final void setMax() {
            this.length.updateRecentBank(CollectionsKt.emptyList());
        }

        public final void length(int i) {
            this.length.equals = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "cdpContents", "", "Lid/dana/domain/promotion/CdpContent;", "kotlin.jvm.PlatformType", "", "onGetVendorLogoSuccess"}, k = 3, mv = {1, 4, 2})
    static final class length implements SystemAlarmService.getMin {
        final /* synthetic */ RecipientView setMax;

        length(RecipientView recipientView) {
            this.setMax = recipientView;
        }

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        public final void setMax(List<getDefaultProxy> list) {
            AddReceiverDialogFragment access$getAddReceiverDialogFragment$p = RecipientView.access$getAddReceiverDialogFragment$p(this.setMax);
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            access$getAddReceiverDialogFragment$p.getMax = list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"id/dana/sendmoney_v2/recipient/view/RecipientView$bottomSheetOnBoardingModule$1", "Lid/dana/usereducation/BottomSheetOnBoardingContract$View;", "onGetBottomSheetOnBoardingAvailability", "", "show", "", "url", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements getSelectedIndex.setMax {
        final /* synthetic */ RecipientView setMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        public final void setMax(boolean z, @Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMax(RecipientView recipientView) {
            this.setMax = recipientView;
        }

        public final void onGetBottomSheetOnBoardingAvailability(boolean z, @Nullable String str) {
            if (!this.setMax.length && z) {
                RecipientView.access$showRequestContactPermissionDialog(this.setMax);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/sendmoney_v2/recipient/view/RecipientView$sortingSendMoneyModule$1", "Lid/dana/contract/sendmoney/v2/SortingSendMoneyContract$View;", "onGetSortingSendMoney", "", "sortedBy", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class extraCallback implements BindArray.getMin {
        final /* synthetic */ RecipientView length;

        @JvmDefault
        public final void dismissProgress() {
        }

        public final void getMax() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        public final void setMin() {
        }

        @JvmDefault
        public final void showProgress() {
        }

        extraCallback(RecipientView recipientView) {
            this.length = recipientView;
        }

        public final void setMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "sortedBy");
            RecipientView.access$setSortingSection(this.length, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"id/dana/sendmoney_v2/recipient/view/RecipientView$recentRecipientModule$1", "Lid/dana/sendmoney/recipient/recent/RecentRecipientContract$View;", "onCheckCashOutAgentFeatureSuccess", "", "enable", "", "onCheckTransferLinkFeatureSuccess", "onGetRecentRecipientError", "onGetRecentRecipientSuccess", "recentRecipientModels", "", "Lid/dana/sendmoney/model/RecentRecipientModel;", "onGetRecentTransaction", "onGetRecentTransactionError", "onMaxRecentRecipient", "maxRecentRecipient", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toDoubleRange implements setMediaId.getMin {
        final /* synthetic */ RecipientView setMax;

        public final void getMax() {
        }

        public final void getMin(@Nullable List<increaseCount> list) {
        }

        public final void setMin() {
        }

        public final void setMin(boolean z) {
        }

        toDoubleRange(RecipientView recipientView) {
            this.setMax = recipientView;
        }

        public final void getMax(@Nullable List<increaseCount> list) {
            RecipientView.access$updateRecentRecipient(this.setMax, list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"id/dana/sendmoney_v2/recipient/view/RecipientView$getSectionCallback$1", "Lid/dana/common/RecyclerViewSectionDecorator$SectionCallback;", "getSectionHeader", "", "position", "", "isSection", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange implements canScroll.setMin {
        final /* synthetic */ RecipientView setMax;

        toIntRange(RecipientView recipientView) {
            this.setMax = recipientView;
        }

        public final boolean getMax(int i) {
            return this.setMax.setMax(i) && this.setMax.getMin(i);
        }

        public final /* synthetic */ CharSequence getMin(int i) {
            String str;
            if (this.setMax.setMax(i)) {
                RecipientView recipientView = this.setMax;
                str = String.valueOf(RecipientView.setMin(recipientView.length(i)));
            } else {
                str = "";
            }
            return str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/sendmoney/bank/AddReceiverDialogFragment;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<AddReceiverDialogFragment> {
        final /* synthetic */ RecipientView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(RecipientView recipientView) {
            super(0);
            this.this$0 = recipientView;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lid/dana/sendmoney/model/RecipientModel;", "kotlin.jvm.PlatformType", "onAddedReceiverInfo", "id/dana/sendmoney_v2/recipient/view/RecipientView$addReceiverDialogFragment$2$1$1"}, k = 3, mv = {1, 4, 2})
        /* renamed from: id.dana.sendmoney_v2.recipient.view.RecipientView$setMax$setMax  reason: collision with other inner class name */
        static final class C0105setMax implements AddReceiverDialogFragment.setMax {
            final /* synthetic */ setMax length;

            C0105setMax(setMax setmax) {
                this.length = setmax;
            }

            public final void getMin(RecipientModel recipientModel) {
                setPhotoIndex recipientSelectedListener = this.length.this$0.getRecipientSelectedListener();
                if (recipientSelectedListener != null) {
                    recipientSelectedListener.onRecipientSelected(recipientModel);
                }
            }
        }

        @NotNull
        public final AddReceiverDialogFragment invoke() {
            AddReceiverDialogFragment addReceiverDialogFragment = new AddReceiverDialogFragment();
            addReceiverDialogFragment.getMin = new C0105setMax(this);
            return addReceiverDialogFragment;
        }
    }

    public final void setRecipientContactType(int i) {
        updateContent updatecontent = new updateContent(i);
        setBundle setbundle = updatecontent.setMax;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "context.contentResolver");
        this.values = setbundle.getMax(contentResolver);
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.ivScan);
        if (appCompatImageView != null) {
            View view = appCompatImageView;
            boolean max = updatecontent.getMax();
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(max ? 0 : 8);
        }
        SearchView searchView = (SearchView) _$_findCachedViewById(resetInternal.setMax.viewSearch);
        if (searchView != null) {
            searchView.setSearchHint(getContext().getString(updatecontent.setMax.length));
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.tvEnterNew);
        if (textView != null) {
            textView.setText(getContext().getString(updatecontent.setMax.getMax));
        }
        if (i == 3) {
            Group group = (Group) _$_findCachedViewById(resetInternal.setMax.UiThread);
            if (group != null) {
                View view2 = group;
                Intrinsics.checkNotNullParameter(view2, "<this>");
                view2.setVisibility(8);
            }
            TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.tvCancel);
            if (textView2 != null) {
                View view3 = textView2;
                Intrinsics.checkNotNullParameter(view3, "<this>");
                view3.setVisibility(0);
            }
        }
        Unit unit = Unit.INSTANCE;
        this.toDoubleRange = updatecontent;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/sendmoney_v2/recipient/view/RecipientView$setupCancelButton$1$1"}, k = 3, mv = {1, 4, 2})
    static final class invoke implements View.OnClickListener {
        final /* synthetic */ RecipientView setMin;

        invoke(RecipientView recipientView) {
            this.setMin = recipientView;
        }

        public final void onClick(View view) {
            if (Intrinsics.areEqual((Object) RecipientView.access$getViewState$p(this.setMin).setMax, (Object) setBundle.getMax.setMin) || Intrinsics.areEqual((Object) RecipientView.access$getViewState$p(this.setMin).setMax, (Object) setBundle.getMin.getMin)) {
                RecipientView.access$onSearchingCanceled(this.setMin);
            } else if (Intrinsics.areEqual((Object) RecipientView.access$getViewState$p(this.setMin).setMax, (Object) setBundle.setMin.getMin)) {
                this.setMin.getBaseActivity().finish();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class valueOf implements View.OnClickListener {
        final /* synthetic */ RecipientView setMin;

        valueOf(RecipientView recipientView) {
            this.setMin = recipientView;
        }

        public final void onClick(View view) {
            RecipientView.access$scrollToTop(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class invokeSuspend implements View.OnClickListener {
        final /* synthetic */ RecipientView getMin;

        invokeSuspend(RecipientView recipientView) {
            this.getMin = recipientView;
        }

        public final void onClick(View view) {
            if (Intrinsics.areEqual((Object) RecipientView.access$getViewState$p(this.getMin).setMax, (Object) setBundle.getMax.setMin)) {
                this.getMin.setMax();
            } else {
                RecipientView.access$checkMaxBankAccount(this.getMin);
            }
        }
    }

    public final boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        if (getMax(motionEvent)) {
            View findFocus = findFocus();
            if (!(findFocus instanceof EditText)) {
                findFocus = null;
            }
            EditText editText = (EditText) findFocus;
            if (editText != null) {
                Rect rect = new Rect();
                editText.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    editText.clearFocus();
                    setOnWheelViewListener.length((View) this);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private final boolean getMax(MotionEvent motionEvent) {
        if (this.isInside) {
            SearchView searchView = (SearchView) _$_findCachedViewById(resetInternal.setMax.viewSearch);
            if (!(searchView != null ? searchView.isClearImageViewRect((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) : false) || motionEvent.getAction() != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void initRecipientView() {
        updateContent updatecontent = this.toDoubleRange;
        if (updatecontent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewState");
        }
        setBundle setbundle = updatecontent.setMax;
        if (Intrinsics.areEqual((Object) setbundle, (Object) setBundle.getMax.setMin)) {
            ((setStateOn) this.getCause.getValue()).length();
            getMin();
            SearchView searchView = (SearchView) _$_findCachedViewById(resetInternal.setMax.viewSearch);
            Intrinsics.checkNotNullExpressionValue(searchView, "viewSearch");
            searchView.setContentDescription(getContext().getString(R.string.txtSearchPhoneNumber));
            Group group = (Group) _$_findCachedViewById(resetInternal.setMax.UiThread);
            Intrinsics.checkNotNullExpressionValue(group, "groupNewRecipient");
            group.setContentDescription(getContext().getString(R.string.btnInputNumber));
        } else if (Intrinsics.areEqual((Object) setbundle, (Object) setBundle.getMin.getMin)) {
            View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.addInternal);
            if (_$_findCachedViewById != null) {
                Intrinsics.checkNotNullParameter(_$_findCachedViewById, "<this>");
                _$_findCachedViewById.setVisibility(0);
            }
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.LinearLayoutCompat$OrientationMode);
            if (textView != null) {
                textView.setText(R.string.sendmoney_bank_title);
            }
            ((LinearLayout) _$_findCachedViewById(resetInternal.setMax.findItemIndex)).setOnClickListener(new onNavigationEvent(this));
            onSuccess.length length2 = this.savedBankPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("savedBankPresenter");
            }
            length2.length();
            onSuccess.length length3 = this.savedBankPresenter;
            if (length3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("savedBankPresenter");
            }
            length3.getMin();
            SearchView searchView2 = (SearchView) _$_findCachedViewById(resetInternal.setMax.viewSearch);
            Intrinsics.checkNotNullExpressionValue(searchView2, "viewSearch");
            searchView2.setContentDescription(getContext().getString(R.string.txtSearchBank));
            Group group2 = (Group) _$_findCachedViewById(resetInternal.setMax.UiThread);
            Intrinsics.checkNotNullExpressionValue(group2, "groupNewRecipient");
            group2.setContentDescription(getContext().getString(R.string.btnAddNewBank));
        } else if (Intrinsics.areEqual((Object) setbundle, (Object) setBundle.setMin.getMin)) {
            ((setStateOn) this.getCause.getValue()).length();
            getMin();
            onSuccess.length length4 = this.savedBankPresenter;
            if (length4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("savedBankPresenter");
            }
            length4.length();
            onSuccess.length length5 = this.savedBankPresenter;
            if (length5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("savedBankPresenter");
            }
            length5.getMin();
            setMediaId.setMax setmax = this.recentRecipientPresenter;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recentRecipientPresenter");
            }
            setmax.setMin("");
        }
        SearchView searchView3 = (SearchView) _$_findCachedViewById(resetInternal.setMax.viewSearch);
        if (searchView3 != null) {
            Context context = getContext();
            updateContent updatecontent2 = this.toDoubleRange;
            if (updatecontent2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewState");
            }
            String string = context.getString(updatecontent2.setMax.length);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(viewState.searchHint)");
            searchView3.setSearchHint(string);
            searchView3.addDisposable(searchView3.getOnSearchClickedEvent().subscribe(new onMessageChannelReady(this, searchView3)));
            searchView3.addDisposable(searchView3.getKeyword().debounce(500, TimeUnit.MILLISECONDS).subscribe(new onRelationshipValidationResult(this)));
        }
        SystemAlarmService.setMin setmin = this.addReceiverInfoPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addReceiverInfoPresenter");
        }
        setmin.length();
        setOnWheelViewListener.getMax(this, new RecipientView$Grayscale$Algorithm(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class onNavigationEvent implements View.OnClickListener {
        final /* synthetic */ RecipientView length;

        onNavigationEvent(RecipientView recipientView) {
            this.length = recipientView;
        }

        public final void onClick(View view) {
            RecipientView.access$openSortBankAccountBottomSheet(this.length);
        }
    }

    public final void updateRecentBank(@NotNull List<RecentBankModel> list) {
        Intrinsics.checkNotNullParameter(list, "newRecentBankModels");
        this.toIntRange.clear();
        this.toIntRange.addAll(list);
        updateContent updatecontent = this.toDoubleRange;
        if (updatecontent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewState");
        }
        if (Intrinsics.areEqual((Object) updatecontent.setMax, (Object) setBundle.getMin.getMin)) {
            if (list.isEmpty()) {
                View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.addInternal);
                if (_$_findCachedViewById != null) {
                    Intrinsics.checkNotNullParameter(_$_findCachedViewById, "<this>");
                    _$_findCachedViewById.setVisibility(8);
                }
            } else {
                View _$_findCachedViewById2 = _$_findCachedViewById(resetInternal.setMax.addInternal);
                if (_$_findCachedViewById2 != null) {
                    Intrinsics.checkNotNullParameter(_$_findCachedViewById2, "<this>");
                    _$_findCachedViewById2.setVisibility(0);
                }
                if (this.Grayscale$Algorithm.length() == 0) {
                    TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.LinearLayoutCompat$OrientationMode);
                    if (textView != null) {
                        textView.setText(R.string.sendmoney_bank_title);
                    }
                    LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.findItemIndex);
                    if (linearLayout != null) {
                        View view = linearLayout;
                        Intrinsics.checkNotNullParameter(view, "<this>");
                        view.setVisibility(0);
                    }
                } else {
                    TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.LinearLayoutCompat$OrientationMode);
                    if (textView2 != null) {
                        textView2.setText(R.string.search_result);
                    }
                    LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.findItemIndex);
                    if (linearLayout2 != null) {
                        View view2 = linearLayout2;
                        Intrinsics.checkNotNullParameter(view2, "<this>");
                        view2.setVisibility(8);
                    }
                }
            }
        }
        getMin();
        getMax();
    }

    /* access modifiers changed from: private */
    public final void getMax() {
        if (this.getMin) {
            if (this.toIntRange.isEmpty()) {
                addNewBankRecipient$default(this, (String) null, (String) null, 3, (Object) null);
            }
            this.getMin = false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/sendmoney_v2/recipient/view/RecipientView$getRecipientMoreSelectedListener$1", "Lid/dana/sendmoney_v2/recipient/view/RecipientMoreActionListener;", "onRecipientSelectedMoreAction", "", "recipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals implements setOriginText {
        final /* synthetic */ RecipientView getMin;

        equals(RecipientView recipientView) {
            this.getMin = recipientView;
        }

        public final void setMax(@NotNull RecipientModel recipientModel) {
            Intrinsics.checkNotNullParameter(recipientModel, "recipientModel");
            BaseActivity baseActivity = this.getMin.getBaseActivity();
            if (!(baseActivity instanceof BankRecipientActivity)) {
                baseActivity = null;
            }
            BankRecipientActivity bankRecipientActivity = (BankRecipientActivity) baseActivity;
            if (bankRecipientActivity != null) {
                bankRecipientActivity.openManageBankBottomSheet(recipientModel);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"id/dana/sendmoney_v2/recipient/view/RecipientView$getOnScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange extends RecyclerView.toIntRange {
        final /* synthetic */ RecipientView getMax;

        toFloatRange(RecipientView recipientView) {
            this.getMax = recipientView;
        }

        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            RecipientView recipientView = this.getMax;
            RecipientView.access$showFabBackToTop(recipientView, RecipientView.access$getRecipientAdapter$p(recipientView).getItemCount() > 2 && !RecipientView.setMax(recyclerView));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"id/dana/sendmoney_v2/recipient/view/RecipientView$getRecipientSelectedListener$1", "Lid/dana/sendmoney/view/RecipientSelectedListener;", "onRecipientSelected", "", "recipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "showBottomSheetBankRecipient", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping implements PhotoItem {
        final /* synthetic */ RecipientView length;

        IsOverlapping(RecipientView recipientView) {
            this.length = recipientView;
        }

        public final void onRecipientSelected(@NotNull RecipientModel recipientModel) {
            Intrinsics.checkNotNullParameter(recipientModel, "recipientModel");
            RecipientView.access$notifyListener(this.length, recipientModel);
        }

        public final void getMax() {
            RecipientView.addNewBankRecipient$default(this.length, (String) null, (String) null, 3, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/sendmoney_v2/recipient/view/RecipientView$showRequestContactPermissionDialog$1$1"}, k = 3, mv = {1, 4, 2})
    static final class create extends Lambda implements Function0<Unit> {
        final /* synthetic */ RecipientView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        create(RecipientView recipientView) {
            super(0);
            this.this$0 = recipientView;
        }

        public final void invoke() {
            ((setStateOn) this.this$0.getCause.getValue()).setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/sendmoney_v2/recipient/view/RecipientView$showRequestContactPermissionDialog$1$2"}, k = 3, mv = {1, 4, 2})
    static final class onPostMessage extends Lambda implements Function0<Unit> {
        final /* synthetic */ RecipientView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        onPostMessage(RecipientView recipientView) {
            super(0);
            this.this$0 = recipientView;
        }

        public final void invoke() {
            RecipientView.access$saveDisplayedPermissionRequestDialog(this.this$0);
        }
    }

    /* access modifiers changed from: private */
    public final boolean getMin(int i) {
        return setMin(length(i)) != setMin(length(i - 1));
    }

    /* access modifiers changed from: private */
    public final void getMin() {
        equals();
        GriverProgressBar.UpdateRunnable updateRunnable = this.FastBitmap$CoordinateSystem;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        GriverProgressBar.UpdateRunnable length2 = length();
        this.FastBitmap$CoordinateSystem = length2;
        addDisposable(length2);
    }

    private final GriverProgressBar.UpdateRunnable length() {
        OverScrollerCopyed.SplineOverScroller splineOverScroller = this.values;
        if (splineOverScroller == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recipientDataSourceFactory");
        }
        return new findItemIndex(splineOverScroller, this.create).length(BackpressureStrategy.LATEST).getMax(new extraCallbackWithResult(this), Functions.IsOverlapping, Functions.length, FlowableInternalHelper.RequestMax.INSTANCE);
    }

    private final void equals() {
        OverScrollerCopyed.SplineOverScroller splineOverScroller = this.values;
        if (splineOverScroller == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recipientDataSourceFactory");
        }
        if (splineOverScroller instanceof isScrollingInDirection) {
            isScrollingInDirection isscrollingindirection = (isScrollingInDirection) splineOverScroller;
            List<RecentBankModel> list = this.toIntRange;
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            isscrollingindirection.getMin = list;
            isscrollingindirection.length = setMin();
        }
        if (splineOverScroller instanceof timePassed) {
            timePassed timepassed = (timePassed) splineOverScroller;
            timepassed.getMin = this.length;
            timepassed.setMin = this.invoke;
        }
        if (splineOverScroller instanceof updateScroll) {
            updateScroll updatescroll = (updateScroll) splineOverScroller;
            updatescroll.setMin = this.length;
            List<RecentBankModel> list2 = this.toIntRange;
            Intrinsics.checkNotNullParameter(list2, "<set-?>");
            updatescroll.getMax = list2;
            List<increaseCount> list3 = this.IsOverlapping;
            Intrinsics.checkNotNullParameter(list3, "<set-?>");
            updatescroll.getMin = list3;
        }
        splineOverScroller.setMax = this.invokeSuspend;
        splineOverScroller.getMax(this.Grayscale$Algorithm);
    }

    /* access modifiers changed from: private */
    public final boolean setMax(int i) {
        springBack springback = this.toString;
        if (springback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recipientAdapter");
        }
        return springback.getItemViewType(i) == 3;
    }

    /* access modifiers changed from: private */
    public static char setMin(String str) {
        if (str.length() == 0) {
            return ' ';
        }
        return str.charAt(0);
    }

    /* access modifiers changed from: private */
    public final String length(int i) {
        setExclusiveItemChecked<T> setexclusiveitemchecked;
        String str;
        String length2;
        springBack springback = this.toString;
        if (springback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recipientAdapter");
        }
        if (i < 0) {
            i = 0;
        }
        removeItemAt<T> removeitemat = springback.setMin;
        if (removeitemat.IsOverlapping != null) {
            setexclusiveitemchecked = removeitemat.IsOverlapping;
        } else {
            setexclusiveitemchecked = removeitemat.toFloatRange;
        }
        RecipientViewModel recipientViewModel = (RecipientViewModel) setexclusiveitemchecked.get(i);
        if (recipientViewModel == null || (length2 = recipientViewModel.length()) == null) {
            str = null;
        } else {
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
            if (length2 != null) {
                str = length2.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).toUpperCase(locale)");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return str == null ? "" : str;
    }

    private final void setMin(increaseCount increasecount, String str, String str2) {
        RecipientModel.length length2 = new RecipientModel.length(str);
        length2.getMin = increasecount.setMin;
        length2.FastBitmap$CoordinateSystem = str2;
        length2.toFloatRange = increasecount.getMin();
        length2.isInside = increasecount.length();
        length2.toIntRange = increasecount.isInside;
        length2.IsOverlapping = increasecount.getMax();
        length2.Mean$Arithmetic = increasecount.equals;
        length2.equals = increasecount.length;
        length2.values = increasecount.toIntRange;
        length2.toDoubleRange = increasecount.toFloatRange;
        length2.invoke = increasecount.setMin();
        length2.setMax = RecipientSource.RECENT;
        RecipientModel length3 = length2.length();
        setPhotoIndex setphotoindex = this.setMin;
        if (setphotoindex != null) {
            setphotoindex.onRecipientSelected(length3);
        }
    }

    /* access modifiers changed from: private */
    public static boolean setMax(RecyclerView recyclerView) {
        RecyclerView.IsOverlapping layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        return linearLayoutManager != null && linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class hashCode extends FunctionReferenceImpl implements Function0<Unit> {
        hashCode(RecipientView recipientView) {
            super(0, recipientView, RecipientView.class, "checkFirstTime", "checkFirstTime()V", 0);
        }

        public final void invoke() {
            ((RecipientView) this.receiver).getMax();
        }
    }

    public final void redirectDeeplink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "action");
        if (Intrinsics.areEqual((Object) BranchLinkConstant.ActionTarget.SEND_MONEY_BANK, (Object) str)) {
            new Handler(Looper.getMainLooper()).postDelayed(new saveInstanceState(new hashCode(this)), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }
    }

    public final void checkContactSyncState() {
        moveToStart.setMin setmin = this.danaContactPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaContactPresenter");
        }
        setmin.getMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/sendmoney_v2/recipient/view/RecipientView$Companion;", "", "()V", "PAGE_SIZE", "", "PREFETCH_SIZE", "SEARCH_KEYWORD_DELAY", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public final void injectComponent(@NotNull PrepareException.AnonymousClass1 r13) {
        Intrinsics.checkNotNullParameter(r13, "applicationComponent");
        ResourcePackagePool.getMax getmax = new ResourcePackagePool.getMax((byte) 0);
        if (r13 != null) {
            getmax.IsOverlapping = r13;
            getmax.getMin = new DanaContactModule(new getMin(this));
            getmax.setMax = new SavedBankModule(new toString(this));
            getmax.length = new AddReceiverInfoModule(new length(this));
            getmax.setMin = new BottomSheetOnBoardingModule(new getMax(this));
            getmax.getMax = new SortingSendMoneyModule(new extraCallback(this));
            getmax.isInside = new RecentRecipientModule(new toDoubleRange(this));
            stopIgnoring.setMin(getmax.getMin, DanaContactModule.class);
            stopIgnoring.setMin(getmax.setMax, SavedBankModule.class);
            stopIgnoring.setMin(getmax.length, AddReceiverInfoModule.class);
            stopIgnoring.setMin(getmax.setMin, BottomSheetOnBoardingModule.class);
            stopIgnoring.setMin(getmax.getMax, SortingSendMoneyModule.class);
            stopIgnoring.setMin(getmax.isInside, RecentRecipientModule.class);
            stopIgnoring.setMin(getmax.IsOverlapping, PrepareException.AnonymousClass1.class);
            new ResourcePackagePool(getmax.getMin, getmax.setMax, getmax.length, getmax.setMin, getmax.getMax, getmax.isInside, getmax.IsOverlapping, (byte) 0).setMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[6];
            moveToStart.setMin setmin = this.danaContactPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("danaContactPresenter");
            }
            getminArr[0] = setmin;
            onSuccess.length length2 = this.savedBankPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("savedBankPresenter");
            }
            getminArr[1] = length2;
            SystemAlarmService.setMin setmin2 = this.addReceiverInfoPresenter;
            if (setmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("addReceiverInfoPresenter");
            }
            getminArr[2] = setmin2;
            getSelectedIndex.length length3 = this.onBoardingPresenter;
            if (length3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onBoardingPresenter");
            }
            getminArr[3] = length3;
            Action action = this.sortingSendMoneyPresenter;
            if (action == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sortingSendMoneyPresenter");
            }
            getminArr[4] = action;
            setMediaId.setMax setmax = this.recentRecipientPresenter;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recentRecipientPresenter");
            }
            getminArr[5] = setmax;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public final void setup() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.AlertDialogLayout);
        if (recyclerView != null) {
            changeMenuMode.setMin<RecipientViewModel> setmin = RecipientViewModel.toString;
            Intrinsics.checkNotNullExpressionValue(setmin, "RecipientViewModel.DIFF_CALLBACK");
            springBack springback = new springBack(setmin);
            springback.equals = this.valueOf;
            springback.setMax = new Relation(new getCause(this));
            springback.length = new IsOverlapping(this);
            springback.getMin = new equals(this);
            springback.isInside = this.Grayscale$Algorithm;
            Unit unit = Unit.INSTANCE;
            this.toString = springback;
            if (springback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recipientAdapter");
            }
            recyclerView.setAdapter(springback);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            if (this.hashCode && recyclerView.getItemDecorationCount() == 0) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                recyclerView.addItemDecoration(new canScroll((RecyclerView) _$_findCachedViewById(resetInternal.setMax.AlertDialogLayout), context.getResources().getDimensionPixelSize(R.dimen.f32202131165970), new toIntRange(this)));
            }
            ViewCompat.setMax((View) recyclerView, true);
            recyclerView.addOnScrollListener(new toFloatRange(this));
        }
        Group group = (Group) _$_findCachedViewById(resetInternal.setMax.UiThread);
        if (group != null) {
            View.OnClickListener invokesuspend = new invokeSuspend(this);
            Intrinsics.checkNotNullParameter(group, "$this$setAllOnClickListener");
            int[] referencedIds = group.getReferencedIds();
            Intrinsics.checkNotNullExpressionValue(referencedIds, "referencedIds");
            for (int findViewById : referencedIds) {
                group.getRootView().findViewById(findViewById).setOnClickListener(invokesuspend);
            }
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.ivScan);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new RecipientView$Mean$Arithmetic(this));
        }
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) _$_findCachedViewById(resetInternal.setMax.Nullable);
        if (extendedFloatingActionButton != null) {
            extendedFloatingActionButton.setOnClickListener(new valueOf(this));
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.tvCancel);
        if (textView != null) {
            textView.setOnClickListener(new invoke(this));
        }
        Action action = this.sortingSendMoneyPresenter;
        if (action == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sortingSendMoneyPresenter");
        }
        action.getMax();
    }

    /* access modifiers changed from: private */
    public final void setMax() {
        if (!this.invokeSuspend) {
            this.invokeSuspend = true;
            post(new isInside(this));
        }
        this.Mean$Arithmetic = true;
        SearchView searchView = (SearchView) _$_findCachedViewById(resetInternal.setMax.viewSearch);
        if (searchView != null) {
            searchView.focusEtSearchContact();
        }
    }

    public final void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        Intrinsics.checkNotNullParameter(iArr, RequestPermission.GRANT_RESULTS);
        ((setStateOn) this.getCause.getValue()).getMin(i, strArr, iArr);
    }

    @SuppressLint({"SwitchIntDef"})
    public final void onItemSelected(@NotNull increaseCount increasecount) {
        BaseActivity baseActivity;
        Intrinsics.checkNotNullParameter(increasecount, "recentRecipientModel");
        int i = increasecount.values;
        if (i == 0) {
            DecodeWrapper.getMin("Send Money");
        } else if (i == 2) {
            setMin(increasecount, "contact", "userid");
        } else if (i == 3) {
            RecipientModel.length length2 = new RecipientModel.length("link");
            length2.isInside = getContext().getString(R.string.send_as_link);
            length2.toIntRange = getContext().getString(R.string.share_send_money_link);
            String max = increasecount.getMax();
            if (max == null) {
                max = "";
            }
            length2.IsOverlapping = max;
            RecipientModel length3 = length2.length();
            setPhotoIndex setphotoindex = this.setMin;
            if (setphotoindex != null) {
                setphotoindex.onRecipientSelected(length3);
            }
        } else if (i == 4) {
            setMin(increasecount, "bank", RecipientIdType.INSTITUTION);
        } else if (i == 5 && (baseActivity = getBaseActivity()) != null) {
            ((AddReceiverDialogFragment) this.b.getValue()).show(baseActivity.getSupportFragmentManager(), "Add Receiver Info Dialog");
        }
    }

    static /* synthetic */ void addNewBankRecipient$default(RecipientView recipientView, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = isOriginHasAppInfo.isValidShowAccountNumber(recipientView.Grayscale$Algorithm) ? recipientView.Grayscale$Algorithm : "";
        }
        BaseActivity baseActivity = recipientView.getBaseActivity();
        SearchRecipientActivity searchRecipientActivity = null;
        if (!(baseActivity instanceof BankRecipientActivity)) {
            baseActivity = null;
        }
        BankRecipientActivity bankRecipientActivity = (BankRecipientActivity) baseActivity;
        if (bankRecipientActivity != null) {
            bankRecipientActivity.startAddBankAccountActivity(str, str2, recipientView.getMin);
            if (recipientView.toIntRange.isEmpty() && recipientView.getMin) {
                bankRecipientActivity.finish();
            }
        }
        BaseActivity baseActivity2 = recipientView.getBaseActivity();
        if (baseActivity2 instanceof SearchRecipientActivity) {
            searchRecipientActivity = baseActivity2;
        }
        SearchRecipientActivity searchRecipientActivity2 = searchRecipientActivity;
        if (searchRecipientActivity2 != null && recipientView.toIntRange.isEmpty() && !recipientView.getMin) {
            searchRecipientActivity2.startAddBankAccountActivity(str, str2);
        }
    }

    public static final /* synthetic */ void access$toggleLayoutVisibility(RecipientView recipientView, boolean z) {
        Group group = (Group) recipientView._$_findCachedViewById(resetInternal.setMax.UiThread);
        int i = 8;
        if (group != null) {
            View view = group;
            boolean z2 = !z;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z2 ? 0 : 8);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) recipientView._$_findCachedViewById(resetInternal.setMax.ivScan);
        if (appCompatImageView != null) {
            View view2 = appCompatImageView;
            updateContent updatecontent = recipientView.toDoubleRange;
            if (updatecontent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewState");
            }
            boolean z3 = updatecontent.getMax() && !z;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            view2.setVisibility(z3 ? 0 : 8);
        }
        TextView textView = (TextView) recipientView._$_findCachedViewById(resetInternal.setMax.tvCancel);
        if (textView != null) {
            View view3 = textView;
            Intrinsics.checkNotNullParameter(view3, "<this>");
            if (z) {
                i = 0;
            }
            view3.setVisibility(i);
        }
    }

    public static final /* synthetic */ void access$onSearchingStart(RecipientView recipientView) {
        recipientView.invoke = true;
        if (1 == 0) {
            recipientView.Mean$Arithmetic = false;
        }
    }

    public static final /* synthetic */ void access$onSearchingCanceled(RecipientView recipientView) {
        recipientView.invoke = false;
        if (0 == 0) {
            recipientView.Mean$Arithmetic = false;
        }
        SearchView searchView = (SearchView) recipientView._$_findCachedViewById(resetInternal.setMax.viewSearch);
        if (searchView != null) {
            searchView.clearKeyword();
            searchView.clearSearchFocus();
            setOnWheelViewListener.getMin((Activity) searchView.getBaseActivity());
        }
        recipientView.getMax("");
        recipientView.getMin();
        if (recipientView.invokeSuspend) {
            recipientView.invokeSuspend = false;
            recipientView.post(new isInside(recipientView));
        }
    }

    public static final /* synthetic */ AddReceiverDialogFragment access$getAddReceiverDialogFragment$p(RecipientView recipientView) {
        return (AddReceiverDialogFragment) recipientView.b.getValue();
    }

    public static final /* synthetic */ void access$showRequestContactPermissionDialog(RecipientView recipientView) {
        FragmentManager supportFragmentManager;
        BaseActivity baseActivity = recipientView.getBaseActivity();
        if (baseActivity == null || baseActivity.isActivityAvailable()) {
            BaseActivity baseActivity2 = recipientView.getBaseActivity();
            if (!(baseActivity2 == null || (supportFragmentManager = baseActivity2.getSupportFragmentManager()) == null)) {
                newIntent newintent = new newIntent(new create(recipientView), (Function0) null, new onPostMessage(recipientView), 2);
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "this");
                newintent.getMin(supportFragmentManager);
            }
            getSelectedIndex.length length2 = recipientView.onBoardingPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onBoardingPresenter");
            }
            length2.getMax(BottomSheetOnBoardingScenario.SEND_MONEY_CONTACT_REQUEST_PERMISSION);
        }
    }

    public static final /* synthetic */ void access$setSortingSection(RecipientView recipientView, String str) {
        CharSequence charSequence;
        LinearLayout linearLayout = (LinearLayout) recipientView._$_findCachedViewById(resetInternal.setMax.findItemIndex);
        if (linearLayout != null) {
            View view = linearLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
        TextView textView = (TextView) recipientView._$_findCachedViewById(resetInternal.setMax.onTextFocusChanged);
        if (textView != null) {
            if (str.length() == 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = recipientView.getResources().getString(R.string.sendmoney_sortby, new Object[]{SortingByConst.FREQUENT});
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st… SortingByConst.FREQUENT)");
                String format = String.format(string, Arrays.copyOf(new Object[0], 0));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                charSequence = format;
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String string2 = recipientView.getResources().getString(R.string.sendmoney_sortby, new Object[]{str});
                Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.st…dmoney_sortby, sortingBy)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[0], 0));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                charSequence = format2;
            }
            textView.setText(charSequence);
        }
    }

    public static final /* synthetic */ void access$updateRecentRecipient(RecipientView recipientView, List list) {
        if (list != null) {
            recipientView.IsOverlapping.clear();
            recipientView.IsOverlapping.addAll(list);
            recipientView.getMin();
        }
    }

    public static final /* synthetic */ void access$scrollToTop(RecipientView recipientView) {
        RecyclerView recyclerView = (RecyclerView) recipientView._$_findCachedViewById(resetInternal.setMax.AlertDialogLayout);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rvRecipient");
        RecyclerView.IsOverlapping layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if ((linearLayoutManager != null ? linearLayoutManager.findLastVisibleItemPosition() : 0) < 20) {
            RecyclerView recyclerView2 = (RecyclerView) recipientView._$_findCachedViewById(resetInternal.setMax.AlertDialogLayout);
            if (recyclerView2 != null) {
                recyclerView2.smoothScrollToPosition(0);
            }
        } else {
            RecyclerView recyclerView3 = (RecyclerView) recipientView._$_findCachedViewById(resetInternal.setMax.AlertDialogLayout);
            if (recyclerView3 != null) {
                recyclerView3.scrollToPosition(0);
            }
        }
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) recipientView._$_findCachedViewById(resetInternal.setMax.Nullable);
        if (extendedFloatingActionButton != null) {
            View view = extendedFloatingActionButton;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(8);
        }
    }

    public static final /* synthetic */ void access$openScanner(RecipientView recipientView) {
        Context context = recipientView.getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            Intent intent = new Intent(activity, ScannerActivity.class);
            intent.putExtra("source", "Send Money");
            activity.startActivityForResult(intent, DecodeWrapper.AnonymousClass2.length);
        }
    }

    public static final /* synthetic */ void access$checkMaxBankAccount(RecipientView recipientView) {
        if (recipientView.toIntRange.size() >= recipientView.equals) {
            BaseActivity baseActivity = recipientView.getBaseActivity();
            if (baseActivity != null) {
                BaseActivity baseActivity2 = recipientView.getBaseActivity();
                Intrinsics.checkNotNullExpressionValue(baseActivity2, "baseActivity");
                getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(baseActivity2);
                getProgressViewStartOffset.getMax getmax2 = getmax;
                getmax2.toFloatRange = baseActivity.getString(R.string.sendmoney_max_bank_dialog_title);
                getmax2.isInside = baseActivity.getString(R.string.sendmoney_max_bank_dialog_description, new Object[]{Integer.valueOf(recipientView.equals)});
                getmax2.setMax = R.drawable.ic_max_saved_bank;
                getmax.IsOverlapping();
                getmax.setMax(false);
                getmax.setMin(baseActivity.getString(R.string.sendmoney_max_bank_dialog_positive_button), new ICustomTabsCallback(baseActivity, recipientView));
                getmax.getMax(baseActivity.getString(R.string.sendmoney_max_bank_dialog_negative_button), new b(baseActivity, recipientView));
                Unit unit = Unit.INSTANCE;
                isBaselineAligned min = new getProgressViewStartOffset(getmax.invoke, getmax.length, getmax, getmax.equals, (byte) 0).getMin();
                recipientView.getMax = min;
                if (min != null) {
                    min.show();
                    return;
                }
                return;
            }
            return;
        }
        addNewBankRecipient$default(recipientView, (String) null, (String) null, 3, (Object) null);
    }

    public static final /* synthetic */ void access$openSortBankAccountBottomSheet(RecipientView recipientView) {
        Context context = recipientView.getContext();
        if (context != null) {
            Activity activity = (Activity) context;
            activity.startActivityForResult(new Intent(activity, SortBankAccountBottomSheetActivity.class), 69);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    public static final /* synthetic */ void access$onItemClick(RecipientView recipientView, int i) {
        springBack springback = recipientView.toString;
        if (springback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recipientAdapter");
        }
        int itemViewType = springback.getItemViewType(i);
        if (itemViewType == 2 || itemViewType == 3) {
            setOnWheelViewListener.length((View) recipientView);
        } else if (itemViewType == 5) {
            ((setStateOn) recipientView.getCause.getValue()).setMin();
        } else if (itemViewType != 11) {
            if (itemViewType != 17) {
                if (itemViewType == 8) {
                    setOnWheelViewListener.length((View) recipientView);
                    if (!recipientView.invokeSuspend) {
                        recipientView.invokeSuspend = true;
                        recipientView.post(new isInside(recipientView));
                        return;
                    }
                    return;
                } else if (itemViewType != 9) {
                    return;
                }
            }
            addNewBankRecipient$default(recipientView, (String) null, (String) null, 3, (Object) null);
        } else {
            recipientView.setMax();
        }
    }

    public static final /* synthetic */ void access$showFabBackToTop(RecipientView recipientView, boolean z) {
        if (recipientView.toFloatRange != z) {
            recipientView.toFloatRange = z;
            if (z) {
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) recipientView._$_findCachedViewById(resetInternal.setMax.Nullable);
                if (extendedFloatingActionButton != null) {
                    extendedFloatingActionButton.show();
                    return;
                }
                return;
            }
            ExtendedFloatingActionButton extendedFloatingActionButton2 = (ExtendedFloatingActionButton) recipientView._$_findCachedViewById(resetInternal.setMax.Nullable);
            if (extendedFloatingActionButton2 != null) {
                extendedFloatingActionButton2.hide();
            }
        }
    }

    public static final /* synthetic */ void access$notifyListener(RecipientView recipientView, RecipientModel recipientModel) {
        setPhotoIndex setphotoindex = recipientView.setMin;
        if (setphotoindex != null) {
            setphotoindex.onRecipientSelected(recipientModel);
        }
    }

    public static final /* synthetic */ void access$setSearching$p(RecipientView recipientView, boolean z) {
        if (recipientView.invokeSuspend != z) {
            recipientView.invokeSuspend = z;
            recipientView.post(new isInside(recipientView));
        }
    }

    public static final /* synthetic */ void access$saveDisplayedPermissionRequestDialog(RecipientView recipientView) {
        getSelectedIndex.length length2 = recipientView.onBoardingPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onBoardingPresenter");
        }
        length2.getMax(BottomSheetOnBoardingScenario.SEND_MONEY_CONTACT_REQUEST_PERMISSION);
    }

    public static final /* synthetic */ void access$checkBottomSheetOnBoardingAvailability(RecipientView recipientView) {
        getSelectedIndex.length length2 = recipientView.onBoardingPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onBoardingPresenter");
        }
        length2.setMin(BottomSheetOnBoardingScenario.SEND_MONEY_CONTACT_REQUEST_PERMISSION);
    }
}
