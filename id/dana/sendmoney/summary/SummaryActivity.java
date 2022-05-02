package id.dana.sendmoney.summary;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.card.MaterialCardView;
import com.iap.ac.android.common.log.ACMonitor;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.component.edittextcomponent.DanaTextBoxView;
import id.dana.constants.ErrorCode;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.ExpiryModule;
import id.dana.di.modules.SendMoneyConfirmationModule;
import id.dana.di.modules.SendMoneySummaryModule;
import id.dana.model.CurrencyAmountModel;
import id.dana.model.PayMethodModel;
import id.dana.richview.CurrencyEditText;
import id.dana.richview.CurrencyTextView;
import id.dana.sendmoney.model.ConfirmationModel;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.VoucherModel;
import id.dana.sendmoney.model.WithdrawOTCModel;
import id.dana.sendmoney.recipient.RecipientType;
import id.dana.sendmoney.summary.view.SummaryView;
import id.dana.sendmoney.voucher.SummaryVoucherView;
import id.dana.sendmoney_v2.landing.view.NewShareToFeedsView;
import id.dana.sendmoney_v2.paymethod.PayMethodView;
import id.dana.social.contract.share.ShareToFeedsModule;
import id.dana.tracker.TrackerKey;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import o.APImageDownloadRsp;
import o.Blur;
import o.BlurProcess;
import o.DiagnosticsReceiver;
import o.GriverProgressBar;
import o.IntRange;
import o.NebulaLoadingView;
import o.PrepareException;
import o.WheelView;
import o.autoGenerate;
import o.convertDipToPx;
import o.convertSpToPx;
import o.cutImageKeepRatio_new;
import o.dispatchOnCancelled;
import o.evaluate;
import o.genTextSelector;
import o.getDataFieldCount;
import o.getInsetDodgeRect;
import o.getLeftSelectedIndex;
import o.getLoadOrigin;
import o.getPhoto;
import o.getTopSortedChildren;
import o.handleScrollChange;
import o.hasZero;
import o.isLineVisible;
import o.isOriginHasAppInfo;
import o.makeTakenPicturePath;
import o.observedEntities;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onDetachedFromLayoutParams;
import o.onExecuted;
import o.resetInternal;
import o.setCancelOnTouchOutside$core;
import o.setIsRecyclable;
import o.setOnWheelViewListener;
import o.setPhotoHeight;
import o.setProxy;
import o.setPublishStatus;
import o.setTopLineVisible;
import o.stopIgnoring;
import o.updateCornerMarking;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 Ü\u00012\u00020\u0001:\u0002Ü\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020zJ\u0010\u0010{\u001a\u00020|2\u0006\u0010}\u001a\u00020\u0004H\u0002J\b\u0010~\u001a\u00020|H\u0002J\b\u0010\u001a\u00020|H\u0014J\u0013\u0010\u0001\u001a\u00020|2\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002J\t\u0010\u0001\u001a\u00020|H\u0002J\t\u0010\u0001\u001a\u00020|H\u0002J\t\u0010\u0001\u001a\u00020|H\u0002J\t\u0010\u0001\u001a\u00020|H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\u0007\u0010\u0001\u001a\u00020|J\u0015\u0010\u0001\u001a\u00020\t2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\t\u0010\u0001\u001a\u00020|H\u0002J\t\u0010\u0001\u001a\u00020|H\u0002J\t\u0010\u0001\u001a\u00020\u0004H\u0002J\t\u0010\u0001\u001a\u00020\u0004H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\u000b\u0010\u0001\u001a\u0004\u0018\u00010\u0004H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\u000b\u0010\u0001\u001a\u0004\u0018\u00010\u0004H\u0002J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u0004H\u0002J\u000b\u0010\u0001\u001a\u0004\u0018\u00010\u0004H\u0002J\t\u0010\u0001\u001a\u00020|H\u0002J\t\u0010\u0001\u001a\u000200H\u0016J\t\u0010\u0001\u001a\u00020|H\u0002J&\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u0002002\u0007\u0010 \u0001\u001a\u000200H\u0002J\t\u0010¡\u0001\u001a\u00020|H\u0002J\u0011\u0010¢\u0001\u001a\u00020|2\b\u0010£\u0001\u001a\u00030¤\u0001J\u000b\u0010¥\u0001\u001a\u0004\u0018\u00010\u0004H\u0002J\t\u0010¦\u0001\u001a\u00020|H\u0002J\t\u0010§\u0001\u001a\u00020|H\u0002J\t\u0010¨\u0001\u001a\u00020|H\u0016J\t\u0010©\u0001\u001a\u00020|H\u0002J\u0013\u0010ª\u0001\u001a\u00020|2\b\u0010£\u0001\u001a\u00030¤\u0001H\u0003J\t\u0010«\u0001\u001a\u00020|H\u0002J\t\u0010¬\u0001\u001a\u00020|H\u0002J\t\u0010­\u0001\u001a\u00020|H\u0002J\t\u0010®\u0001\u001a\u00020|H\u0002J\t\u0010¯\u0001\u001a\u00020|H\u0002J\t\u0010°\u0001\u001a\u00020|H\u0002J\t\u0010±\u0001\u001a\u00020|H\u0002J\t\u0010²\u0001\u001a\u00020\tH\u0002J\t\u0010³\u0001\u001a\u00020|H\u0002J\t\u0010´\u0001\u001a\u00020|H\u0002J'\u0010µ\u0001\u001a\u00020|2\u0007\u0010¶\u0001\u001a\u0002002\u0007\u0010·\u0001\u001a\u0002002\n\u0010¸\u0001\u001a\u0005\u0018\u00010¹\u0001H\u0014J\t\u0010º\u0001\u001a\u00020|H\u0002J\t\u0010»\u0001\u001a\u00020|H\u0016J\t\u0010¼\u0001\u001a\u00020|H\u0002J\t\u0010½\u0001\u001a\u00020|H\u0002J\t\u0010¾\u0001\u001a\u00020|H\u0002J\u000f\u0010¿\u0001\u001a\u00020|2\u0006\u0010\u000e\u001a\u00020\u0004J\u000f\u0010À\u0001\u001a\u00020|2\u0006\u0010\u000e\u001a\u00020\u0004J\u0011\u0010Á\u0001\u001a\u00020|2\u0006\u0010@\u001a\u00020?H\u0002J\u0012\u0010Â\u0001\u001a\u00020|2\u0007\u0010Ã\u0001\u001a\u00020\u0004H\u0002J\u0013\u0010Ä\u0001\u001a\u00020|2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0002J\u0007\u0010Å\u0001\u001a\u00020|J\u0011\u0010Æ\u0001\u001a\u00020|2\u0006\u0010@\u001a\u00020?H\u0002J\u001a\u0010Ç\u0001\u001a\u00020|2\u0006\u0010\u000e\u001a\u00020\u00042\u0007\u0010È\u0001\u001a\u00020\u0004H\u0002J\t\u0010É\u0001\u001a\u00020|H\u0002J\t\u0010Ê\u0001\u001a\u00020|H\u0002J\t\u0010Ë\u0001\u001a\u00020|H\u0002J\t\u0010Ì\u0001\u001a\u00020|H\u0002J\t\u0010Í\u0001\u001a\u00020|H\u0002J\u0015\u0010Î\u0001\u001a\u00020|2\n\u0010Ï\u0001\u001a\u0005\u0018\u00010Ð\u0001H\u0002J\t\u0010Ñ\u0001\u001a\u00020\u0004H\u0002J\u0012\u0010Ò\u0001\u001a\u00020|2\u0007\u0010Ó\u0001\u001a\u00020\tH\u0002J\t\u0010Ô\u0001\u001a\u00020|H\u0002J\u000e\u0010Õ\u0001\u001a\u00020|*\u00030Ö\u0001H\u0002J\u000e\u0010×\u0001\u001a\u00020|*\u00030Ö\u0001H\u0002J \u0010Ø\u0001\u001a\u00020|*\u00030Ù\u00012\u0007\u0010Ú\u0001\u001a\u00020\u00042\u0007\u0010Û\u0001\u001a\u000200H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020#8BX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0010\u0010,\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u000200X\u000e¢\u0006\u0002\n\u0000R(\u0010@\u001a\u0004\u0018\u00010?2\b\u0010>\u001a\u0004\u0018\u00010?@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0010\u0010E\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010HX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010I\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\"\u0004\bJ\u0010KR\u0010\u0010L\u001a\u0004\u0018\u00010MX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010N\u001a\u00020O8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001e\u0010T\u001a\u00020U8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020[8BX\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u001e\u0010^\u001a\u00020_8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0010\u0010d\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010e\u001a\u00020f8BX\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u001e\u0010i\u001a\u00020j8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0010\u0010o\u001a\u0004\u0018\u00010pX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010q\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020tX.¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u000200X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010v\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010x\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006Ý\u0001"}, d2 = {"Lid/dana/sendmoney/summary/SummaryActivity;", "Lid/dana/base/BaseActivity;", "()V", "acceptTimeoutUnit", "", "acceptTimeoutValue", "accountName", "accountNumber", "accountRegistered", "", "addCardUrl", "additionalFee", "Lid/dana/sendmoney/Amount;", "alias", "amount", "amountToSend", "avatarUrl", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lcom/google/android/material/card/MaterialCardView;", "getBottomSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "setBottomSheetBehavior", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "confirmationModel", "Lid/dana/sendmoney/model/ConfirmationModel;", "couponId", "currency", "danaLoadingDialog", "Lid/dana/dialog/DanaLoadingDialog;", "description", "destinationCardIndexNo", "destinationPayMethod", "destinationType", "expiryModule", "Lid/dana/di/modules/ExpiryModule;", "getExpiryModule", "()Lid/dana/di/modules/ExpiryModule;", "expiryPresenter", "Lid/dana/contract/sendmoney/ExpiryContract$Presenter;", "getExpiryPresenter", "()Lid/dana/contract/sendmoney/ExpiryContract$Presenter;", "setExpiryPresenter", "(Lid/dana/contract/sendmoney/ExpiryContract$Presenter;)V", "expiryTime", "formattedMaskNumber", "freeMinAmount", "freeTransfer", "", "fundType", "id", "instLocalName", "isSendMoneySuccess", "originBalance", "originCardIndexNo", "originInstId", "originName", "originNumber", "originPayMethod", "originType", "originUrl", "originViewType", "value", "Lid/dana/model/PayMethodModel;", "payMethodModel", "getPayMethodModel", "()Lid/dana/model/PayMethodModel;", "setPayMethodModel", "(Lid/dana/model/PayMethodModel;)V", "payOption", "recipientIdType", "recipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "remarks", "setRemarks", "(Ljava/lang/String;)V", "selectedVoucher", "Lid/dana/sendmoney/model/VoucherModel;", "sendMoneyConfirmationBankPresenter", "Lid/dana/sendmoney/confirmation/SendMoneyConfirmationBankContract$Presenter;", "getSendMoneyConfirmationBankPresenter", "()Lid/dana/sendmoney/confirmation/SendMoneyConfirmationBankContract$Presenter;", "setSendMoneyConfirmationBankPresenter", "(Lid/dana/sendmoney/confirmation/SendMoneyConfirmationBankContract$Presenter;)V", "sendMoneyConfirmationPresenter", "Lid/dana/sendmoney/confirmation/SendMoneyConfirmationContract$Presenter;", "getSendMoneyConfirmationPresenter", "()Lid/dana/sendmoney/confirmation/SendMoneyConfirmationContract$Presenter;", "setSendMoneyConfirmationPresenter", "(Lid/dana/sendmoney/confirmation/SendMoneyConfirmationContract$Presenter;)V", "sendMoneySummaryModule", "Lid/dana/di/modules/SendMoneySummaryModule;", "getSendMoneySummaryModule", "()Lid/dana/di/modules/SendMoneySummaryModule;", "sendMoneySummaryPresenter", "Lid/dana/sendmoney/namecheck/SendMoneySummaryContract$Presenter;", "getSendMoneySummaryPresenter", "()Lid/dana/sendmoney/namecheck/SendMoneySummaryContract$Presenter;", "setSendMoneySummaryPresenter", "(Lid/dana/sendmoney/namecheck/SendMoneySummaryContract$Presenter;)V", "senderName", "shareToFeedsModule", "Lid/dana/social/contract/share/ShareToFeedsModule;", "getShareToFeedsModule", "()Lid/dana/social/contract/share/ShareToFeedsModule;", "shareToFeedsPresenter", "Lid/dana/social/contract/share/ShareToFeedsContract$Presenter;", "getShareToFeedsPresenter", "()Lid/dana/social/contract/share/ShareToFeedsContract$Presenter;", "setShareToFeedsPresenter", "(Lid/dana/social/contract/share/ShareToFeedsContract$Presenter;)V", "skeletonPayMethod", "Lcom/ethanhua/skeleton/SkeletonScreen;", "splitBillId", "stateAmount", "summaryViewState", "Lid/dana/sendmoney/summary/view/SummaryViewState;", "transactionCount", "transferScenario", "visibleInQuickSend", "voucherAmount", "voucherEnable", "Lid/dana/model/CurrencyAmountModel;", "checkAmountToSent", "", "formattedAmount", "collapsePayMethodView", "configToolbar", "confirmSendMoney", "confirmSendMoneyToBank", "confirmSendMoneyToContact", "confirmSendMoneyToOtc", "confirmSendToLink", "createPayeeInfo", "Lid/dana/domain/sendmoney/model/TransferParticipant;", "dismissDanaLoadingDialog", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "doWhenSendMoneyFinish", "expandPayMethod", "getCaluclatedAmountWithFeeAndVoucher", "getCenterTitle", "getConfirmBankView", "Lid/dana/sendmoney/confirmation/SendMoneyConfirmationBankContract$View;", "getConfirmationContactView", "Lid/dana/sendmoney/confirmation/SendMoneyConfirmationContract$View;", "getContactName", "getDefaultFeedSummaryCaption", "Landroid/text/Spannable;", "getDestinationNickName", "getFeedSummaryCaption", "text", "getFixedPhoneNumber", "getLastTransfer", "getLayout", "getPayerAvatarUrl", "getSpannableText", "", "start", "end", "getStateShareFeed", "getTransferInitCallback", "transferInit", "Lid/dana/domain/sendmoney/model/TransferInit;", "getUserId", "getX2XVoucherFeature", "hideShimmer", "init", "initButton", "initDataPayMethodBottomSheet", "initInjector", "initNotesChanged", "initPayMethodSticky", "initShareToFeedsView", "initStatePayMethodBottomSheet", "initSummaryView", "initValuesSendToBalance", "isNeedToShowUnregisteredUserNotes", "listenToVoucherSelection", "measureViewHeight", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAmountValidAndActionConfirmed", "onBackPressed", "prepareBundle", "removeEditTextFocus", "saveRecentBank", "setDisabledWithAmount", "setEnableButtonWithAmount", "setPaymentIconByPaymethod", "setStateCheckboxShareFeed", "state", "showChargeFeeAmount", "showDanaLoadingDialog", "showPaymentAccountImage", "showPaymentStickyAmountWarningMessage", "message", "showShimmer", "trackFirstTransaction", "trackLastTransaction", "trackSendMoneyConfirm", "trackSendMoneyCreate", "transferLink", "expiryInfoModel", "Lid/dana/sendmoney/model/ExpiryInfoModel;", "unitSymbol", "updateBottomSheetStickyHeader", "expanded", "updateBottomSheetSummaryPeekHeight", "listenToAmountChange", "Lid/dana/sendmoney/summary/view/SummaryView;", "listenToKeyboardVisibility", "setImageLogo", "Landroidx/appcompat/widget/AppCompatImageView;", "url", "placeholder", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SummaryActivity extends BaseActivity {
    @NotNull
    public static final String ASTERISK = "*";
    @NotNull
    public static final String CHECKED = "true";
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    @NotNull
    public static final String FIRST_STATE_SHARE_FEED = "firstTime";
    @NotNull
    public static final String NO_NAME_CONTACT = "-";
    public static final float PAY_METHOD_TOP_PADDING = 8.0f;
    @NotNull
    public static final String UNCHECKED = "false";
    /* access modifiers changed from: private */
    public boolean FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public APImageDownloadRsp Grayscale$Algorithm;
    /* access modifiers changed from: private */
    public String ICustomTabsCallback = "";
    /* access modifiers changed from: private */
    public String ICustomTabsCallback$Default = "";
    /* access modifiers changed from: private */
    public APImageDownloadRsp ICustomTabsCallback$Stub;
    /* access modifiers changed from: private */
    public String ICustomTabsCallback$Stub$Proxy = "";
    /* access modifiers changed from: private */
    public String ICustomTabsService = "";
    /* access modifiers changed from: private */
    public VoucherModel ICustomTabsService$Default = new VoucherModel();
    private onDetachedFromLayoutParams ICustomTabsService$Stub;
    /* access modifiers changed from: private */
    public boolean ICustomTabsService$Stub$Proxy;
    /* access modifiers changed from: private */
    public int IPostMessageService;
    /* access modifiers changed from: private */
    public ConfirmationModel IsOverlapping;
    /* access modifiers changed from: private */
    public APImageDownloadRsp Mean$Arithmetic;
    /* access modifiers changed from: private */
    public String asBinder = "";
    /* access modifiers changed from: private */
    public String asInterface = "";
    /* access modifiers changed from: private */
    public String b = "";
    /* access modifiers changed from: private */
    public String create = "";
    /* access modifiers changed from: private */
    public String equals = "";
    @Inject
    public onExecuted.getMin expiryPresenter;
    /* access modifiers changed from: private */
    public String extraCallback = "";
    /* access modifiers changed from: private */
    public String extraCallbackWithResult = "";
    /* access modifiers changed from: private */
    public String extraCommand = "";
    /* access modifiers changed from: private */
    public String getCause = "";
    /* access modifiers changed from: private */
    public String getDefaultImpl = "";
    /* access modifiers changed from: private */
    public String getInterfaceDescriptor = "";
    private setPublishStatus getMax;
    /* access modifiers changed from: private */
    public getLoadOrigin getMin;
    /* access modifiers changed from: private */
    public String hashCode = "";
    /* access modifiers changed from: private */
    public String invoke = "";
    /* access modifiers changed from: private */
    public String invokeSuspend = "";
    /* access modifiers changed from: private */
    public String isInside = "";
    /* access modifiers changed from: private */
    public String mayLaunchUrl = "";
    /* access modifiers changed from: private */
    public String newSession = "";
    /* access modifiers changed from: private */
    public int newSessionWithExtras;
    private HashMap onExtraCallback;
    /* access modifiers changed from: private */
    public String onMessageChannelReady = "";
    /* access modifiers changed from: private */
    public String onNavigationEvent = "";
    /* access modifiers changed from: private */
    public int onPostMessage;
    /* access modifiers changed from: private */
    public String onRelationshipValidationResult = "";
    /* access modifiers changed from: private */
    public boolean onTransact;
    /* access modifiers changed from: private */
    public APImageDownloadRsp postMessage;
    /* access modifiers changed from: private */
    public boolean receiveFile = true;
    /* access modifiers changed from: private */
    public String requestPostMessageChannel = "";
    /* access modifiers changed from: private */
    public String requestPostMessageChannelWithExtras = "";
    @Inject
    public cutImageKeepRatio_new.getMax sendMoneyConfirmationBankPresenter;
    @Inject
    public makeTakenPicturePath.setMax sendMoneyConfirmationPresenter;
    @Inject
    public setProxy.length sendMoneySummaryPresenter;
    /* access modifiers changed from: private */
    public String setDefaultImpl = "";
    @Nullable
    private BottomSheetBehavior<MaterialCardView> setMax;
    @Inject
    public handleScrollChange.getMin shareToFeedsPresenter;
    /* access modifiers changed from: private */
    public String toDoubleRange = "";
    @Nullable
    private PayMethodModel toFloatRange;
    /* access modifiers changed from: private */
    public RecipientModel toIntRange;
    /* access modifiers changed from: private */
    public String toString = "";
    /* access modifiers changed from: private */
    public String updateVisuals = "";
    /* access modifiers changed from: private */
    public String validateRelationship = "";
    /* access modifiers changed from: private */
    public String valueOf = "";
    /* access modifiers changed from: private */
    public String values = "";
    /* access modifiers changed from: private */
    public String warmup = "";

    public final void _$_clearFindViewByIdCache() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1601036915, oncanceled);
            onCancelLoad.getMin(1601036915, oncanceled);
        }
        HashMap hashMap = this.onExtraCallback;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.onExtraCallback == null) {
            this.onExtraCallback = new HashMap();
        }
        View view = (View) this.onExtraCallback.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.onExtraCallback.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2))) {
            return R.layout.activity_summary;
        }
        onCanceled oncanceled = new onCanceled(length2, min, 32);
        onCancelLoad.setMax(928056229, oncanceled);
        onCancelLoad.getMin(928056229, oncanceled);
        return R.layout.activity_summary;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", "after", "onTextChanged", "before", "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, k = 1, mv = {1, 4, 2}, xi = 48)
    public static final class equals implements TextWatcher {
        final /* synthetic */ SummaryActivity getMax;

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public equals(SummaryActivity summaryActivity) {
            this.getMax = summaryActivity;
        }

        public final void afterTextChanged(@Nullable Editable editable) {
            SummaryActivity summaryActivity = this.getMax;
            String obj = editable != null ? editable.toString() : null;
            if (obj == null) {
                obj = "";
            }
            SummaryActivity.access$setRemarks$p(summaryActivity, obj);
        }
    }

    public static final /* synthetic */ void access$checkAmountToSent(SummaryActivity summaryActivity, String str) {
        int length2;
        int min;
        Context baseContext = summaryActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-417814269, oncanceled);
            onCancelLoad.getMin(-417814269, oncanceled);
        }
        PayMethodModel payMethodModel = summaryActivity.toFloatRange;
        if (payMethodModel != null) {
            if (str.length() > 0) {
                setProxy.length length3 = summaryActivity.sendMoneySummaryPresenter;
                if (length3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sendMoneySummaryPresenter");
                }
                length3.getMax(new CurrencyAmountModel(str), payMethodModel, false);
            }
        }
    }

    public static final /* synthetic */ void access$collapsePayMethodView(SummaryActivity summaryActivity) {
        int max;
        Context baseContext = summaryActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 897716463 == (max = dispatchOnCancelled.getMax(applicationContext, 897716463)))) {
            onCanceled oncanceled = new onCanceled(897716463, max, 512);
            onCancelLoad.setMax(897716463, oncanceled);
            onCancelLoad.getMin(897716463, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(897716463, oncanceled2);
            onCancelLoad.getMin(897716463, oncanceled2);
        }
        BottomSheetBehavior<MaterialCardView> bottomSheetBehavior = summaryActivity.setMax;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(4);
        }
    }

    public static final /* synthetic */ String access$getCaluclatedAmountWithFeeAndVoucher(SummaryActivity summaryActivity) {
        CurrencyAmountModel currencyAmountModel;
        int length2;
        int min;
        Context baseContext = summaryActivity.getBaseContext();
        CurrencyAmountModel currencyAmountModel2 = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-218211157, oncanceled);
            onCancelLoad.getMin(-218211157, oncanceled);
        }
        setTopLineVisible settoplinevisible = setTopLineVisible.setMax;
        CurrencyAmountModel amountToSend = summaryActivity.amountToSend();
        PayMethodModel payMethodModel = summaryActivity.toFloatRange;
        if (payMethodModel != null) {
            currencyAmountModel = payMethodModel.setMin;
        } else {
            currencyAmountModel = null;
        }
        CurrencyAmountModel currencyAmountModel3 = new CurrencyAmountModel(setTopLineVisible.getMax(amountToSend, currencyAmountModel));
        setTopLineVisible settoplinevisible2 = setTopLineVisible.setMax;
        VoucherModel voucherModel = summaryActivity.ICustomTabsService$Default;
        if (voucherModel != null) {
            currencyAmountModel2 = voucherModel.setMax;
        }
        return setTopLineVisible.setMin(currencyAmountModel3, currencyAmountModel2);
    }

    public static final /* synthetic */ getLoadOrigin access$getSummaryViewState$p(SummaryActivity summaryActivity) {
        getLoadOrigin getloadorigin = summaryActivity.getMin;
        if (getloadorigin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("summaryViewState");
        }
        return getloadorigin;
    }

    public static final /* synthetic */ void access$hideShimmer(SummaryActivity summaryActivity) {
        int length2;
        Context baseContext = summaryActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-826926937, oncanceled);
            onCancelLoad.getMin(-826926937, oncanceled);
        }
        onDetachedFromLayoutParams ondetachedfromlayoutparams = summaryActivity.ICustomTabsService$Stub;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
        summaryActivity.ICustomTabsService$Stub = null;
    }

    public static final /* synthetic */ void access$setStateCheckboxShareFeed(SummaryActivity summaryActivity, String str) {
        NewShareToFeedsView newShareToFeedsView;
        NewShareToFeedsView newShareToFeedsView2;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1760160587, oncanceled);
            onCancelLoad.getMin(1760160587, oncanceled);
        }
        int hashCode2 = str.hashCode();
        if (hashCode2 != 3569038) {
            if (hashCode2 == 97196323 && str.equals("false") && (newShareToFeedsView2 = (NewShareToFeedsView) summaryActivity._$_findCachedViewById(resetInternal.setMax.getDropDownHorizontalOffset)) != null) {
                newShareToFeedsView2.disableShareToFeed();
            }
        } else if (str.equals(CHECKED) && (newShareToFeedsView = (NewShareToFeedsView) summaryActivity._$_findCachedViewById(resetInternal.setMax.getDropDownHorizontalOffset)) != null) {
            newShareToFeedsView.enableShareToFeed();
        }
    }

    public static final /* synthetic */ void access$transferLink(SummaryActivity summaryActivity, getPhoto getphoto) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1371086956, oncanceled);
            onCancelLoad.getMin(-1371086956, oncanceled);
        }
        if (getphoto != null) {
            setProxy.length length2 = summaryActivity.sendMoneySummaryPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendMoneySummaryPresenter");
            }
            RecipientModel recipientModel = summaryActivity.toIntRange;
            CurrencyAmountModel amountToSend = summaryActivity.amountToSend();
            PayMethodModel payMethodModel = summaryActivity.toFloatRange;
            String min = getphoto.setMin(summaryActivity);
            if (min == null) {
                min = "";
            }
            length2.setMin(recipientModel, amountToSend, payMethodModel, min, String.valueOf(getphoto.getMin), summaryActivity.equals, summaryActivity.ICustomTabsService$Default);
            return;
        }
        onExecuted.getMin getmin = summaryActivity.expiryPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expiryPresenter");
        }
        getmin.getMax();
    }

    @NotNull
    public final setProxy.length getSendMoneySummaryPresenter() {
        setProxy.length length2 = this.sendMoneySummaryPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendMoneySummaryPresenter");
        }
        return length2;
    }

    public final void setSendMoneySummaryPresenter(@NotNull setProxy.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.sendMoneySummaryPresenter = length2;
    }

    @NotNull
    public final makeTakenPicturePath.setMax getSendMoneyConfirmationPresenter() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1362493969 == (max = dispatchOnCancelled.getMax(applicationContext, -1362493969)))) {
            onCanceled oncanceled = new onCanceled(-1362493969, max, 512);
            onCancelLoad.setMax(-1362493969, oncanceled);
            onCancelLoad.getMin(-1362493969, oncanceled);
        }
        makeTakenPicturePath.setMax setmax = this.sendMoneyConfirmationPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendMoneyConfirmationPresenter");
        }
        return setmax;
    }

    public final void setSendMoneyConfirmationPresenter(@NotNull makeTakenPicturePath.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        this.sendMoneyConfirmationPresenter = setmax;
    }

    @NotNull
    public final cutImageKeepRatio_new.getMax getSendMoneyConfirmationBankPresenter() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -798720649 == (max = dispatchOnCancelled.getMax(applicationContext, -798720649)))) {
            onCanceled oncanceled = new onCanceled(-798720649, max, 512);
            onCancelLoad.setMax(-798720649, oncanceled);
            onCancelLoad.getMin(-798720649, oncanceled);
        }
        cutImageKeepRatio_new.getMax getmax = this.sendMoneyConfirmationBankPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendMoneyConfirmationBankPresenter");
        }
        return getmax;
    }

    public final void setSendMoneyConfirmationBankPresenter(@NotNull cutImageKeepRatio_new.getMax getmax) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1521791303 == (max = dispatchOnCancelled.getMax(applicationContext, 1521791303)))) {
            onCanceled oncanceled = new onCanceled(1521791303, max, 512);
            onCancelLoad.setMax(1521791303, oncanceled);
            onCancelLoad.getMin(1521791303, oncanceled);
        }
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.sendMoneyConfirmationBankPresenter = getmax;
    }

    @NotNull
    public final onExecuted.getMin getExpiryPresenter() {
        onExecuted.getMin getmin = this.expiryPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expiryPresenter");
        }
        return getmin;
    }

    public final void setExpiryPresenter(@NotNull onExecuted.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.expiryPresenter = getmin;
    }

    @NotNull
    public final handleScrollChange.getMin getShareToFeedsPresenter() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(854627511, oncanceled);
            onCancelLoad.getMin(854627511, oncanceled);
        }
        handleScrollChange.getMin getmin = this.shareToFeedsPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shareToFeedsPresenter");
        }
        return getmin;
    }

    public final void setShareToFeedsPresenter(@NotNull handleScrollChange.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.shareToFeedsPresenter = getmin;
    }

    @Nullable
    public final BottomSheetBehavior<MaterialCardView> getBottomSheetBehavior() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(561593528, oncanceled);
            onCancelLoad.getMin(561593528, oncanceled);
        }
        return this.setMax;
    }

    public final void setBottomSheetBehavior(@Nullable BottomSheetBehavior<MaterialCardView> bottomSheetBehavior) {
        this.setMax = bottomSheetBehavior;
    }

    @Nullable
    public final PayMethodModel getPayMethodModel() {
        return this.toFloatRange;
    }

    public final void setPayMethodModel(@Nullable PayMethodModel payMethodModel) {
        int max;
        String str;
        String str2;
        String str3;
        String str4;
        this.toFloatRange = payMethodModel;
        int i = 8;
        if (payMethodModel != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.setOnFitSystemWindowsListener);
            if (appCompatTextView != null) {
                Context context = this;
                if (payMethodModel.length()) {
                    str4 = context.getString(R.string.dana_balance);
                } else if (payMethodModel.setMin()) {
                    str4 = context.getString(R.string.add_card);
                } else {
                    str4 = context.getString(R.string.debit_card);
                }
                appCompatTextView.setText(str4);
            }
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.FitWindowsLinearLayout);
            if (appCompatTextView2 != null) {
                Context context2 = this;
                if (payMethodModel.length()) {
                    StringBuilder sb = new StringBuilder();
                    if (payMethodModel.getMax == null) {
                        str2 = "";
                    } else {
                        str2 = payMethodModel.getMax.length;
                    }
                    sb.append(str2);
                    if (payMethodModel.getMax == null) {
                        str3 = "";
                    } else {
                        str3 = payMethodModel.getMax.getMax;
                    }
                    sb.append(str3);
                    str = sb.toString();
                } else {
                    str = payMethodModel.getMax(context2);
                }
                appCompatTextView2.setText(str);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setMultiChoiceItems);
            if (appCompatImageView != null) {
                setMin(appCompatImageView, "", payMethodModel.isInside());
            }
            if (payMethodModel.setMin()) {
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setAdapter);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(0);
                }
                if (payMethodModel.IsOverlapping != null) {
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.FitWindowsLinearLayout);
                    if (appCompatTextView3 != null) {
                        appCompatTextView3.setVisibility(0);
                    }
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setAdapter);
                    if (appCompatImageView3 != null) {
                        appCompatImageView3.setVisibility(8);
                    }
                    if (payMethodModel.toIntRange()) {
                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setItems);
                        if (appCompatImageView4 != null) {
                            setMin(appCompatImageView4, "", R.drawable.ic_oneklik_v2);
                        }
                    } else {
                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setItems);
                        if (appCompatImageView5 != null) {
                            setMin(appCompatImageView5, "", R.drawable.ic_express_pay_v2);
                        }
                    }
                    AppCompatImageView appCompatImageView6 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setItems);
                    if (appCompatImageView6 != null) {
                        appCompatImageView6.setVisibility(0);
                    }
                } else {
                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.FitWindowsLinearLayout);
                    if (appCompatTextView4 != null) {
                        appCompatTextView4.setVisibility(8);
                    }
                    AppCompatImageView appCompatImageView7 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setAdapter);
                    if (appCompatImageView7 != null) {
                        setMin(appCompatImageView7, "", R.drawable.ic_card_type);
                    }
                    AppCompatImageView appCompatImageView8 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setItems);
                    if (appCompatImageView8 != null) {
                        appCompatImageView8.setVisibility(8);
                    }
                }
                getMin();
            } else if (payMethodModel.toFloatRange()) {
                AppCompatImageView appCompatImageView9 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setAdapter);
                if (appCompatImageView9 != null) {
                    appCompatImageView9.setVisibility(0);
                }
                AppCompatTextView appCompatTextView5 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.FitWindowsLinearLayout);
                if (appCompatTextView5 != null) {
                    appCompatTextView5.setVisibility(0);
                }
                AppCompatImageView appCompatImageView10 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setItems);
                if (appCompatImageView10 != null) {
                    appCompatImageView10.setVisibility(8);
                }
                AppCompatImageView appCompatImageView11 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setAdapter);
                if (appCompatImageView11 != null) {
                    setMin(appCompatImageView11, "", R.drawable.ic_express_pay_v2);
                }
                getMin();
            } else if (payMethodModel.toIntRange()) {
                AppCompatImageView appCompatImageView12 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setAdapter);
                if (appCompatImageView12 != null) {
                    appCompatImageView12.setVisibility(0);
                }
                AppCompatTextView appCompatTextView6 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.FitWindowsLinearLayout);
                if (appCompatTextView6 != null) {
                    appCompatTextView6.setVisibility(0);
                }
                AppCompatImageView appCompatImageView13 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setItems);
                if (appCompatImageView13 != null) {
                    appCompatImageView13.setVisibility(8);
                }
                AppCompatImageView appCompatImageView14 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setAdapter);
                if (appCompatImageView14 != null) {
                    setMin(appCompatImageView14, "", R.drawable.ic_oneclick_logo);
                }
                getMin();
            } else {
                AppCompatImageView appCompatImageView15 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setAdapter);
                if (appCompatImageView15 != null) {
                    appCompatImageView15.setVisibility(8);
                }
                AppCompatTextView appCompatTextView7 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.FitWindowsLinearLayout);
                if (appCompatTextView7 != null) {
                    appCompatTextView7.setVisibility(0);
                }
                AppCompatImageView appCompatImageView16 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setItems);
                if (appCompatImageView16 != null) {
                    appCompatImageView16.setVisibility(8);
                }
                getMin();
            }
            SummaryVoucherView summaryVoucherView = (SummaryVoucherView) _$_findCachedViewById(resetInternal.setMax.init);
            if (summaryVoucherView != null) {
                summaryVoucherView.setPayMethod(payMethodModel.values);
            }
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1184779430 == (max = dispatchOnCancelled.getMax(applicationContext, -1184779430)))) {
            onCanceled oncanceled = new onCanceled(-1184779430, max, 512);
            onCancelLoad.setMax(-1184779430, oncanceled);
            onCancelLoad.getMin(-1184779430, oncanceled);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.skipToQueueItem);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new setMin(this));
        }
        getMax();
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(resetInternal.setMax.setPaddingRelative);
        if (frameLayout != null) {
            View view = frameLayout;
            boolean min = setMin();
            Intrinsics.checkNotNullParameter(view, "<this>");
            if (min) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configToolbar() {
        /*
            r8 = this;
            r0 = 0
            int r1 = o.dispatchOnCancelled.getMax(r0)
            r2 = 16
            if (r1 == 0) goto L_0x0017
            o.onCanceled r3 = new o.onCanceled
            r3.<init>(r0, r1, r2)
            r1 = -1436314031(0xffffffffaa639651, float:-2.0213802E-13)
            o.onCancelLoad.setMax(r1, r3)
            o.onCancelLoad.getMin(r1, r3)
        L_0x0017:
            int r1 = o.dispatchOnCancelled.getMax(r0)
            if (r1 == 0) goto L_0x002b
            o.onCanceled r3 = new o.onCanceled
            r3.<init>(r0, r1, r2)
            r1 = -354586921(0xffffffffeadd6ed7, float:-1.3384802E26)
            o.onCancelLoad.setMax(r1, r3)
            o.onCancelLoad.getMin(r1, r3)
        L_0x002b:
            android.content.Intent r1 = r8.getIntent()
            if (r1 == 0) goto L_0x007e
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x007e
            java.lang.String r3 = "data"
            android.os.Parcelable r3 = r1.getParcelable(r3)
            id.dana.sendmoney.model.RecipientModel r3 = (id.dana.sendmoney.model.RecipientModel) r3
            if (r3 == 0) goto L_0x007e
            java.lang.String r4 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r4 = r3.isInside
            if (r4 == 0) goto L_0x0065
            java.lang.String r4 = r3.isInside
            java.lang.String r5 = "it.number"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r5 = "*"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6 = 2
            r7 = 0
            boolean r4 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r4, (java.lang.CharSequence) r5, (boolean) r0, (int) r6, (java.lang.Object) r7)
            if (r4 == 0) goto L_0x0062
            java.lang.String r4 = "profileQR"
            goto L_0x0067
        L_0x0062:
            java.lang.String r4 = r3.getCause
            goto L_0x0067
        L_0x0065:
            java.lang.String r4 = r3.getCause
        L_0x0067:
            r8.extraCallback = r4
            r8.toIntRange = r3
            java.lang.String r4 = ""
            java.lang.String r5 = "remarks"
            java.lang.String r1 = r1.getString(r5, r4)
            if (r1 != 0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r4 = r1
        L_0x0077:
            o.getLoadOrigin r1 = new o.getLoadOrigin
            r1.<init>(r3, r4)
            r8.getMin = r1
        L_0x007e:
            int r1 = o.dispatchOnCancelled.getMax(r0)
            if (r1 == 0) goto L_0x0092
            o.onCanceled r3 = new o.onCanceled
            r3.<init>(r0, r1, r2)
            r0 = -1144786149(0xffffffffbbc3f31b, float:-0.005979908)
            o.onCancelLoad.setMax(r0, r3)
            o.onCancelLoad.getMin(r0, r3)
        L_0x0092:
            o.getLoadOrigin r0 = r8.getMin
            if (r0 != 0) goto L_0x009b
            java.lang.String r1 = "summaryViewState"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x009b:
            id.dana.sendmoney.model.RecipientModel r0 = r0.length
            java.lang.String r0 = r0.onNavigationEvent
            if (r0 != 0) goto L_0x00a2
            goto L_0x00da
        L_0x00a2:
            int r1 = r0.hashCode()
            switch(r1) {
                case 110366: goto L_0x00ce;
                case 3016252: goto L_0x00c2;
                case 3321850: goto L_0x00b6;
                case 951526432: goto L_0x00aa;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            goto L_0x00da
        L_0x00aa:
            java.lang.String r1 = "contact"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00da
            r0 = 2131888853(0x7f120ad5, float:1.9412353E38)
            goto L_0x00dd
        L_0x00b6:
            java.lang.String r1 = "link"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00da
            r0 = 2131888852(0x7f120ad4, float:1.9412351E38)
            goto L_0x00dd
        L_0x00c2:
            java.lang.String r1 = "bank"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00da
            r0 = 2131888850(0x7f120ad2, float:1.9412347E38)
            goto L_0x00dd
        L_0x00ce:
            java.lang.String r1 = "otc"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00da
            r0 = 2131888851(0x7f120ad3, float:1.941235E38)
            goto L_0x00dd
        L_0x00da:
            r0 = 2131888792(0x7f120a98, float:1.941223E38)
        L_0x00dd:
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r1 = "getString(\n        when …_toolbar_title\n        })"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r8.setCenterTitle(r0)
            r0 = 2131231316(0x7f080254, float:1.807871E38)
            r8.setMenuLeftButton((int) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.summary.SummaryActivity.configToolbar():void");
    }

    public final void onBackPressed() {
        BottomSheetBehavior<MaterialCardView> bottomSheetBehavior = this.setMax;
        if (bottomSheetBehavior != null) {
            if (bottomSheetBehavior.getState() != 4) {
                bottomSheetBehavior.setState(4);
            } else {
                finish();
            }
            if (bottomSheetBehavior != null) {
                return;
            }
        }
        finish();
        Unit unit = Unit.INSTANCE;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"id/dana/sendmoney/summary/SummaryActivity$listenToKeyboardVisibility$1", "Lid/dana/utils/KeyboardHelper$KeyboardVisibilityListener;", "onKeyboardHide", "", "onKeyboardShow", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping implements setOnWheelViewListener.length {
        final /* synthetic */ SummaryActivity getMax;
        final /* synthetic */ SummaryView setMax;

        public final void length() {
        }

        IsOverlapping(SummaryActivity summaryActivity, SummaryView summaryView) {
            this.getMax = summaryActivity;
            this.setMax = summaryView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
            if (r0.isFocused() != false) goto L_0x002a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void setMax() {
            /*
                r4 = this;
                id.dana.sendmoney.summary.view.SummaryView r0 = r4.setMax
                int r1 = o.resetInternal.setMax.sendMediaButton
                android.view.View r0 = r0._$_findCachedViewById(r1)
                id.dana.richview.CurrencyEditText r0 = (id.dana.richview.CurrencyEditText) r0
                java.lang.String r1 = "cetAmount"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                boolean r0 = r0.isFocused()
                if (r0 != 0) goto L_0x002a
                id.dana.sendmoney.summary.SummaryActivity r0 = r4.getMax
                int r1 = o.resetInternal.setMax.InspectableProperty$EnumEntry
                android.view.View r0 = r0._$_findCachedViewById(r1)
                id.dana.component.edittextcomponent.DanaTextBoxView r0 = (id.dana.component.edittextcomponent.DanaTextBoxView) r0
                java.lang.String r1 = "etNotes"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                boolean r0 = r0.isFocused()
                if (r0 == 0) goto L_0x0074
            L_0x002a:
                id.dana.sendmoney.summary.SummaryActivity r0 = r4.getMax
                java.lang.String r0 = r0.requestPostMessageChannelWithExtras
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r1 = 0
                if (r0 == 0) goto L_0x003e
                int r0 = r0.length()
                if (r0 != 0) goto L_0x003c
                goto L_0x003e
            L_0x003c:
                r0 = 0
                goto L_0x003f
            L_0x003e:
                r0 = 1
            L_0x003f:
                if (r0 != 0) goto L_0x0074
                id.dana.sendmoney.summary.SummaryActivity r0 = r4.getMax
                boolean r0 = r0.ICustomTabsService$Stub$Proxy
                if (r0 == 0) goto L_0x0074
                id.dana.sendmoney.summary.view.SummaryView r0 = r4.setMax
                o.getLoadOrigin r0 = r0.getSummaryViewState()
                if (r0 == 0) goto L_0x0074
                java.lang.String r0 = r0.isInside()
                id.dana.sendmoney.summary.SummaryActivity r2 = r4.getMax
                r2.ICustomTabsService$Stub$Proxy = r1
                id.dana.sendmoney.summary.SummaryActivity r1 = r4.getMax
                int r2 = o.resetInternal.setMax.init
                android.view.View r1 = r1._$_findCachedViewById(r2)
                id.dana.sendmoney.voucher.SummaryVoucherView r1 = (id.dana.sendmoney.voucher.SummaryVoucherView) r1
                id.dana.sendmoney.summary.SummaryActivity r2 = r4.getMax
                id.dana.model.CurrencyAmountModel r2 = r2.amountToSend()
                java.lang.String r2 = r2.getMax
                java.lang.String r3 = "amountToSend().amount"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                r1.initPrePay(r2, r0)
            L_0x0074:
                id.dana.sendmoney.summary.SummaryActivity r0 = r4.getMax
                id.dana.sendmoney.summary.SummaryActivity.access$removeEditTextFocus(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.summary.SummaryActivity.IsOverlapping.setMax():void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"id/dana/sendmoney/summary/SummaryActivity$listenToVoucherSelection$1", "Lid/dana/sendmoney/voucher/SummaryVoucherView$SummaryVoucherListener;", "onGetMatchVoucherPayMethod", "", "payMethod", "", "onVoucherSelected", "voucherSelected", "Lid/dana/sendmoney/model/VoucherModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toDoubleRange implements SummaryVoucherView.length {
        final /* synthetic */ SummaryActivity getMin;

        public final void setMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "payMethod");
        }

        toDoubleRange(SummaryActivity summaryActivity) {
            this.getMin = summaryActivity;
        }

        public final void getMin(@Nullable VoucherModel voucherModel) {
            String str;
            CurrencyAmountModel currencyAmountModel;
            this.getMin.ICustomTabsService$Default = voucherModel;
            if (this.getMin.ICustomTabsService$Default != null) {
                VoucherModel access$getSelectedVoucher$p = this.getMin.ICustomTabsService$Default;
                if (access$getSelectedVoucher$p != null) {
                    currencyAmountModel = access$getSelectedVoucher$p.setMax;
                } else {
                    currencyAmountModel = null;
                }
                if (currencyAmountModel != null) {
                    str = SummaryActivity.access$getCaluclatedAmountWithFeeAndVoucher(this.getMin);
                    DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) this.getMin._$_findCachedViewById(resetInternal.setMax.asBinder);
                    if (danaButtonPrimaryView != null) {
                        danaButtonPrimaryView.setActiveButtonLeftAlignWithAmount(this.getMin.getString(R.string.sendmoney_summary_pay_button), str);
                    }
                    String cleanAll = isOriginHasAppInfo.getCleanAll(str);
                    Intrinsics.checkNotNullExpressionValue(cleanAll, "NumberUtils.getCleanAll(amount)");
                    SummaryActivity.access$checkAmountToSent(this.getMin, StringsKt.replace$default(cleanAll, "Rp", "", false, 4, (Object) null));
                }
            }
            str = this.getMin.amountToSend().setMax();
            Intrinsics.checkNotNullExpressionValue(str, "amountToSend().currencyAndAmountValue");
            DanaButtonPrimaryView danaButtonPrimaryView2 = (DanaButtonPrimaryView) this.getMin._$_findCachedViewById(resetInternal.setMax.asBinder);
            if (danaButtonPrimaryView2 != null) {
                danaButtonPrimaryView2.setActiveButtonLeftAlignWithAmount(this.getMin.getString(R.string.sendmoney_summary_pay_button), str);
            }
            String cleanAll2 = isOriginHasAppInfo.getCleanAll(str);
            Intrinsics.checkNotNullExpressionValue(cleanAll2, "NumberUtils.getCleanAll(amount)");
            SummaryActivity.access$checkAmountToSent(this.getMin, StringsKt.replace$default(cleanAll2, "Rp", "", false, 4, (Object) null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"id/dana/sendmoney/summary/SummaryActivity$initDataPayMethodBottomSheet$1$1", "Lid/dana/sendmoney_v2/paymethod/PayMethodView$PayMethodListener;", "onChangePayMethodDone", "", "payMethodModel", "Lid/dana/model/PayMethodModel;", "onFinishSelection", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside implements PayMethodView.getMin {
        final /* synthetic */ getDataFieldCount getMax;
        final /* synthetic */ SummaryActivity setMin;

        isInside(SummaryActivity summaryActivity, getDataFieldCount getdatafieldcount) {
            this.setMin = summaryActivity;
            this.getMax = getdatafieldcount;
        }

        public final void getMin(@NotNull PayMethodModel payMethodModel) {
            Intrinsics.checkNotNullParameter(payMethodModel, "payMethodModel");
            SummaryActivity.access$hideShimmer(this.setMin);
            this.setMin.length();
            RecyclerView recyclerView = (RecyclerView) this.setMin._$_findCachedViewById(resetInternal.setMax.getText);
            boolean z = false;
            if (recyclerView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.setMin._$_findCachedViewById(resetInternal.setMax.pause);
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "clStickySummary");
                recyclerView.setPadding(0, 0, 0, constraintLayout.getMeasuredHeight());
            }
            this.setMin.setPayMethodModel(payMethodModel);
            CharSequence access$getAmountToSend$p = this.setMin.requestPostMessageChannelWithExtras;
            if (access$getAmountToSend$p == null || StringsKt.isBlank(access$getAmountToSend$p)) {
                z = true;
            }
            if (!z && !this.setMin.amountToSend().getMax()) {
                SummaryActivity summaryActivity = this.setMin;
                String str = summaryActivity.amountToSend().getMax;
                Intrinsics.checkNotNullExpressionValue(str, "amountToSend().amount");
                SummaryActivity.access$checkAmountToSent(summaryActivity, str);
            }
            SummaryActivity.access$collapsePayMethodView(this.setMin);
        }

        public final void getMax() {
            DiagnosticsReceiver.getMin presenter;
            SummaryView summaryView = (SummaryView) this.setMin._$_findCachedViewById(resetInternal.setMax.AppCompatTextView);
            if (summaryView != null && (presenter = summaryView.getPresenter()) != null) {
                presenter.setMax(this.setMin.amountToSend().getMax);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b¸\u0006\f"}, d2 = {"id/dana/sendmoney/summary/SummaryActivity$initStatePayMethodBottomSheet$1$1$1", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "app_productionRelease", "id/dana/sendmoney/summary/SummaryActivity$$special$$inlined$apply$lambda$1"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange extends BottomSheetBehavior.BottomSheetCallback {
        final /* synthetic */ SummaryActivity setMax;

        toIntRange(SummaryActivity summaryActivity) {
            this.setMax = summaryActivity;
        }

        public final void onSlide(@NotNull View view, float f) {
            Intrinsics.checkNotNullParameter(view, "bottomSheet");
            View _$_findCachedViewById = this.setMax._$_findCachedViewById(resetInternal.setMax.name);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(0);
            }
            if (f >= 0.0f) {
                Resources system = Resources.getSystem();
                Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
                view.setPadding(0, (int) TypedValue.applyDimension(1, (1.0f - f) * 8.0f, system.getDisplayMetrics()), 0, 0);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
            if (r6 != 6) goto L_0x0034;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onStateChanged(@org.jetbrains.annotations.NotNull android.view.View r5, int r6) {
            /*
                r4 = this;
                java.lang.String r0 = "bottomSheet"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = 3
                if (r6 != r0) goto L_0x000a
                r1 = 0
                goto L_0x000c
            L_0x000a:
                r1 = 1090519040(0x41000000, float:8.0)
            L_0x000c:
                android.content.res.Resources r2 = android.content.res.Resources.getSystem()
                java.lang.String r3 = "Resources.getSystem()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
                r3 = 1
                float r1 = android.util.TypedValue.applyDimension(r3, r1, r2)
                int r1 = (int) r1
                r2 = 0
                if (r6 == r0) goto L_0x002f
                r0 = 4
                if (r6 == r0) goto L_0x0029
                r0 = 6
                if (r6 == r0) goto L_0x002f
                goto L_0x0034
            L_0x0029:
                id.dana.sendmoney.summary.SummaryActivity r6 = r4.setMax
                id.dana.sendmoney.summary.SummaryActivity.access$updateBottomSheetStickyHeader(r6, r2)
                goto L_0x0034
            L_0x002f:
                id.dana.sendmoney.summary.SummaryActivity r6 = r4.setMax
                id.dana.sendmoney.summary.SummaryActivity.access$updateBottomSheetStickyHeader(r6, r3)
            L_0x0034:
                r5.setPadding(r2, r1, r2, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.summary.SummaryActivity.toIntRange.onStateChanged(android.view.View, int):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"id/dana/sendmoney/summary/SummaryActivity$listenToAmountChange$1", "Lid/dana/sendmoney/summary/view/SummaryView$SummaryListener;", "onBelowFreeMinAmount", "", "onChangeInputtedAmount", "amount", "", "cleanAmount", "onRecipientIsDanaUser", "onSummaryViewMinOrMaxAmountReached", "showSummaryPage", "recipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange implements SummaryView.setMax {
        final /* synthetic */ SummaryActivity getMin;

        toFloatRange(SummaryActivity summaryActivity) {
            this.getMin = summaryActivity;
        }

        public final void length(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "amount");
            Intrinsics.checkNotNullParameter(str2, "cleanAmount");
            this.getMin.requestPostMessageChannelWithExtras = str;
            SummaryActivity.access$checkAmountToSent(this.getMin, str2);
        }

        public final void getMin() {
            String str;
            CurrencyAmountModel currencyAmountModel;
            SummaryActivity summaryActivity = this.getMin;
            PayMethodModel payMethodModel = summaryActivity.getPayMethodModel();
            if (payMethodModel == null || (currencyAmountModel = payMethodModel.setMin) == null) {
                str = null;
            } else {
                str = currencyAmountModel.getMax;
            }
            SummaryActivity.access$showChargeFeeAmount(summaryActivity, str);
            SummaryActivity summaryActivity2 = this.getMin;
            summaryActivity2.setEnableButtonWithAmount(SummaryActivity.access$getCaluclatedAmountWithFeeAndVoucher(summaryActivity2));
            this.getMin.getMin();
            RecyclerView recyclerView = (RecyclerView) this.getMin._$_findCachedViewById(resetInternal.setMax.getText);
            if (recyclerView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.getMin._$_findCachedViewById(resetInternal.setMax.pause);
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "clStickySummary");
                recyclerView.setPadding(0, 0, 0, constraintLayout.getMeasuredHeight());
            }
        }

        public final void length() {
            PayMethodModel payMethodModel = this.getMin.getPayMethodModel();
            if (payMethodModel != null) {
                if (payMethodModel.length()) {
                    LinearLayout linearLayout = (LinearLayout) this.getMin._$_findCachedViewById(resetInternal.setMax.getItem);
                    if (linearLayout != null) {
                        View view = linearLayout;
                        Intrinsics.checkNotNullParameter(view, "<this>");
                        view.setVisibility(8);
                    }
                } else {
                    SummaryView summaryView = (SummaryView) this.getMin._$_findCachedViewById(resetInternal.setMax.AppCompatTextView);
                    if (summaryView != null) {
                        SummaryView.showAmountWarningMessage$default(summaryView, (String) null, (String) null, 0, 0, 15, (Object) null);
                    }
                }
                this.getMin.getMin();
                RecyclerView recyclerView = (RecyclerView) this.getMin._$_findCachedViewById(resetInternal.setMax.getText);
                if (recyclerView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) this.getMin._$_findCachedViewById(resetInternal.setMax.pause);
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "clStickySummary");
                    recyclerView.setPadding(0, 0, 0, constraintLayout.getMeasuredHeight());
                }
            }
        }

        public final void setMax() {
            SummaryActivity.access$getSummaryViewState$p(this.getMin).length.toDoubleRange = true;
            FrameLayout frameLayout = (FrameLayout) this.getMin._$_findCachedViewById(resetInternal.setMax.setPaddingRelative);
            if (frameLayout != null) {
                View view = frameLayout;
                boolean access$isNeedToShowUnregisteredUserNotes = this.getMin.setMin();
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(access$isNeedToShowUnregisteredUserNotes ? 0 : 8);
            }
        }

        public final void getMax(@Nullable RecipientModel recipientModel) {
            if (recipientModel != null) {
                RecipientModel access$getRecipientModel$p = this.getMin.toIntRange;
                if (access$getRecipientModel$p != null) {
                    recipientModel.toString = this.getMin.getSource();
                    recipientModel.invokeSuspend = access$getRecipientModel$p.invokeSuspend;
                    recipientModel.invoke = access$getRecipientModel$p.invoke;
                    this.getMin.toIntRange = recipientModel;
                }
                this.getMin.getMax();
            }
        }
    }

    @NotNull
    public final CurrencyAmountModel amountToSend() {
        String cleanAll = isOriginHasAppInfo.getCleanAll(this.requestPostMessageChannelWithExtras);
        Intrinsics.checkNotNullExpressionValue(cleanAll, "NumberUtils.getCleanAll(amountToSend)");
        return new CurrencyAmountModel(StringsKt.replace$default(cleanAll, "Rp", "", false, 4, (Object) null), "IDR");
    }

    private final Spannable getMax(CharSequence charSequence, int i, int i2) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (length2 = dispatchOnCancelled.length(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, length2, 4);
            onCancelLoad.setMax(1534018238, oncanceled);
            onCancelLoad.getMin(1534018238, oncanceled);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(IntRange.setMax(this, R.color.f24942131100467)), i, i2, 33);
        return spannableStringBuilder;
    }

    private final Spannable setMax() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 877112830 == (max = dispatchOnCancelled.getMax(applicationContext, 877112830)))) {
            onCanceled oncanceled = new onCanceled(877112830, max, 512);
            onCancelLoad.setMax(877112830, oncanceled);
            onCancelLoad.getMin(877112830, oncanceled);
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
        if (Intrinsics.areEqual((Object) locale.getDisplayLanguage(), (Object) "Indonesia")) {
            String string = getString(R.string.send_money_feed_summary_display_caption_default);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.send_…_display_caption_default)");
            return getMax(string, 5, 18);
        }
        String string2 = getString(R.string.send_money_feed_summary_display_caption_default);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.send_…_display_caption_default)");
        return getMax(string2, 4, 14);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/sendmoney/summary/SummaryActivity$shareToFeedsModule$1", "Lid/dana/social/contract/share/ShareToFeedsContract$View;", "onSavePrevCheckedState", "", "success", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class hashCode implements handleScrollChange.setMax {
        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void getMax(boolean z) {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        hashCode() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "expiryInfoModels", "", "Lid/dana/sendmoney/model/ExpiryInfoModel;", "kotlin.jvm.PlatformType", "", "onGetExpirySuccess"}, k = 3, mv = {1, 4, 2})
    static final class length implements onExecuted.length {
        final /* synthetic */ SummaryActivity getMax;

        length(SummaryActivity summaryActivity) {
            this.getMax = summaryActivity;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: o.getPhoto} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void setMax(java.util.List<o.getPhoto> r5) {
            /*
                r4 = this;
                int r0 = r5.size()
                if (r0 <= 0) goto L_0x0038
                java.lang.String r0 = "expiryInfoModels"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
                r0 = r5
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x0012:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x002b
                java.lang.Object r1 = r0.next()
                r2 = r1
                o.getPhoto r2 = (o.getPhoto) r2
                java.lang.String r3 = "it"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                boolean r2 = r2.getMax()
                if (r2 == 0) goto L_0x0012
                goto L_0x002c
            L_0x002b:
                r1 = 0
            L_0x002c:
                o.getPhoto r1 = (o.getPhoto) r1
                if (r1 != 0) goto L_0x0045
                java.lang.Object r5 = kotlin.collections.CollectionsKt.first(r5)
                r1 = r5
                o.getPhoto r1 = (o.getPhoto) r1
                goto L_0x0045
            L_0x0038:
                o.getPhoto r1 = new o.getPhoto
                r1.<init>()
                r5 = 1
                r1.getMin = r5
                java.lang.String r5 = "Hour"
                r1.getMax(r5)
            L_0x0045:
                id.dana.sendmoney.summary.SummaryActivity r5 = r4.getMax
                id.dana.sendmoney.summary.SummaryActivity.access$transferLink(r5, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.summary.SummaryActivity.length.setMax(java.util.List):void");
        }
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 32);
            onCancelLoad.setMax(-1580976580, oncanceled);
            onCancelLoad.getMin(-1580976580, oncanceled);
        }
        super.onActivityResult(i, i2, intent);
        SummaryVoucherView summaryVoucherView = (SummaryVoucherView) _$_findCachedViewById(resetInternal.setMax.init);
        if (summaryVoucherView != null) {
            summaryVoucherView.onActivityResult(i, i2, intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016¨\u0006\u0016"}, d2 = {"id/dana/sendmoney/summary/SummaryActivity$getConfirmationContactView$1", "Lid/dana/sendmoney/confirmation/SendMoneyConfirmationContract$View;", "dismissProgress", "", "onCompleteSendDana", "cashierUrl", "", "onError", "errorMessage", "onErrorSendDana", "errorCode", "errorMsg", "onGetLastTransferInfoError", "onGetLastTransferInfoSuccess", "date", "", "onGetTimeoutInfoSuccess", "timeout", "onSendMoneySuccessFromH5", "success", "", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements makeTakenPicturePath.setMin {
        final /* synthetic */ SummaryActivity getMin;

        getMax(SummaryActivity summaryActivity) {
            this.getMin = summaryActivity;
        }

        public final /* synthetic */ void length(Long l) {
            long longValue = l.longValue();
            if (longValue > 0) {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.getMin._$_findCachedViewById(resetInternal.setMax.removeQueueItemAt);
                if (constraintLayout != null) {
                    View view = constraintLayout;
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    view.setVisibility(0);
                }
                TextView textView = (TextView) this.getMin._$_findCachedViewById(resetInternal.setMax.ScrollingTabContainerView);
                if (textView != null) {
                    String string = this.getMin.getString(R.string.sendmoney_summary_last_transfer);
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(" ");
                    String obj = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(obj);
                    Locale locale = Locale.getDefault();
                    sb2.append(new SimpleDateFormat("dd MMM yyyy", locale).format(new Date(longValue)));
                    textView.setText(sb2.toString());
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMax extends Lambda implements Function0<Unit> {
            final /* synthetic */ String $cashierUrl;
            final /* synthetic */ getMax this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMax(getMax getmax, String str) {
                super(0);
                this.this$0 = getmax;
                this.$cashierUrl = str;
            }

            public final void invoke() {
                DanaH5.startContainerFullUrl(this.$cashierUrl, new setCancelOnTouchOutside$core(this) {
                    final /* synthetic */ setMax setMax;

                    @JvmDefault
                    public final void onContainerCreated(@Nullable Bundle bundle) {
                    }

                    {
                        this.setMax = r1;
                    }

                    public final void onContainerDestroyed(@Nullable Bundle bundle) {
                        this.setMax.this$0.dismissProgress();
                        if (this.setMax.this$0.getMin.onTransact) {
                            this.setMax.this$0.getMin.backToHomepage((Bundle) null);
                        }
                    }
                });
            }
        }

        public final void setMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "cashierUrl");
            Function0 setmax = new setMax(this, str);
            Intrinsics.checkNotNullParameter(setmax, "executable");
            GriverProgressBar.UpdateRunnable subscribe = setIsRecyclable.getMax().subscribe(new getLeftSelectedIndex.getMin(setmax));
            Intrinsics.checkNotNullExpressionValue(subscribe, "RxIAPConnectBus.iapConne…s\n            }\n        }");
            this.getMin.addDisposable(subscribe);
        }

        public final void setMax(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "errorCode");
            Intrinsics.checkNotNullParameter(str2, ACMonitor.EVENT_PARAM_KEY_ERROR_MSG);
            dismissProgress();
            if (StringsKt.equals(ErrorCode.KYC_ERROR, str, true)) {
                Function0 function0 = length.INSTANCE;
                Intrinsics.checkNotNullParameter(function0, "executable");
                GriverProgressBar.UpdateRunnable subscribe = setIsRecyclable.getMax().subscribe(new getLeftSelectedIndex.getMin(function0));
                Intrinsics.checkNotNullExpressionValue(subscribe, "RxIAPConnectBus.iapConne…s\n            }\n        }");
                this.getMin.addDisposable(subscribe);
                return;
            }
            onError(str2);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class length extends Lambda implements Function0<Unit> {
            public static final length INSTANCE = new length();

            length() {
                super(0);
            }

            public final void invoke() {
                DanaH5.startContainerFullUrl("https://m.dana.id/m/kyc/landingPage?entryPoint=sendMoney");
            }
        }

        public final void setMax(boolean z) {
            this.getMin.onTransact = z;
        }

        public final void setMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
            SummaryActivity summaryActivity = this.getMin;
            CharSequence charSequence = str;
            int length2 = charSequence.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length2) {
                boolean z2 = Intrinsics.compare((int) charSequence.charAt(!z ? i : length2), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length2--;
                } else if (!z2) {
                    z = true;
                } else {
                    i++;
                }
            }
            summaryActivity.onNavigationEvent = charSequence.subSequence(i, length2 + 1).toString();
        }

        public final void setMax() {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.getMin._$_findCachedViewById(resetInternal.setMax.removeQueueItemAt);
            if (constraintLayout != null) {
                View view = constraintLayout;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(8);
            }
        }

        public final void showProgress() {
            this.getMin.showDanaLoadingDialog();
        }

        public final void dismissProgress() {
            this.getMin.dismissDanaLoadingDialog();
        }

        public final void onError(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "errorMessage");
            this.getMin.showWarningDialog(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"id/dana/sendmoney/summary/SummaryActivity$getConfirmBankView$1", "Lid/dana/sendmoney/confirmation/SendMoneyConfirmationBankContract$View;", "dismissProgress", "", "onCompleteSendDana", "url", "", "onError", "errorMessage", "onFinishSaveRecentBank", "success", "", "onSendMoneySuccessFromH5", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements cutImageKeepRatio_new.setMax {
        final /* synthetic */ SummaryActivity length;

        getMin(SummaryActivity summaryActivity) {
            this.length = summaryActivity;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/sendmoney/summary/SummaryActivity$getConfirmBankView$1$onCompleteSendDana$1", "Lid/dana/danah5/DanaH5Listener;", "onContainerDestroyed", "", "bundle", "Landroid/os/Bundle;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class setMax implements setCancelOnTouchOutside$core {
            final /* synthetic */ getMin setMax;

            @JvmDefault
            public final void onContainerCreated(@Nullable Bundle bundle) {
            }

            setMax(getMin getmin) {
                this.setMax = getmin;
            }

            public final void onContainerDestroyed(@Nullable Bundle bundle) {
                if (this.setMax.length.onTransact) {
                    this.setMax.length.backToHomepage((Bundle) null);
                }
            }
        }

        public final void setMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "url");
            DanaH5.startContainerFullUrl(str, new setMax(this));
        }

        public final void getMin(boolean z) {
            this.length.onTransact = z;
        }

        public final void showProgress() {
            this.length.showDanaLoadingDialog();
        }

        public final void dismissProgress() {
            this.length.dismissDanaLoadingDialog();
        }

        public final void onError(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "errorMessage");
            this.length.showWarningDialog(str);
        }
    }

    private final void setMin(AppCompatImageView appCompatImageView, String str, int i) {
        ((updateCornerMarking) Glide.setMin((FragmentActivity) this)).setMax(str).setMax(evaluate.setMin).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMax(i).setMin(i).length((ImageView) appCompatImageView);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ SummaryActivity setMax;

        setMin(SummaryActivity summaryActivity) {
            this.setMax = summaryActivity;
        }

        public final void onClick(View view) {
            BottomSheetBehavior<MaterialCardView> bottomSheetBehavior = this.setMax.getBottomSheetBehavior();
            if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 4) {
                SummaryActivity.access$collapsePayMethodView(this.setMax);
            } else {
                SummaryActivity.access$expandPayMethod(this.setMax);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/sendmoney/summary/SummaryActivity$onAmountValidAndActionConfirmed$1", "Lid/dana/base/SingleClickListener;", "singleClick", "", "v", "Landroid/view/View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class values extends observedEntities {
        final /* synthetic */ SummaryActivity getMin;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        values(SummaryActivity summaryActivity, autoGenerate autogenerate) {
            super(autogenerate);
            this.getMin = summaryActivity;
        }

        public final void getMin(@Nullable View view) {
            String str;
            RecipientModel access$getRecipientModel$p = this.getMin.toIntRange;
            if (access$getRecipientModel$p != null) {
                access$getRecipientModel$p.Grayscale$Algorithm = "";
            }
            RecipientModel access$getRecipientModel$p2 = this.getMin.toIntRange;
            if (access$getRecipientModel$p2 != null) {
                PayMethodModel payMethodModel = this.getMin.getPayMethodModel();
                Intrinsics.checkNotNull(payMethodModel);
                access$getRecipientModel$p2.Mean$Arithmetic = (int) payMethodModel.isInside;
            }
            RecipientModel access$getRecipientModel$p3 = this.getMin.toIntRange;
            if (access$getRecipientModel$p3 != null) {
                str = access$getRecipientModel$p3.onNavigationEvent;
            } else {
                str = null;
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 110366) {
                    if (hashCode != 3016252) {
                        if (hashCode == 951526432 && str.equals("contact")) {
                            this.getMin.getSendMoneySummaryPresenter().setMax(this.getMin.toIntRange, this.getMin.amountToSend(), this.getMin.getPayMethodModel(), this.getMin.equals, this.getMin.ICustomTabsService$Default);
                            return;
                        }
                    } else if (str.equals("bank")) {
                        this.getMin.getSendMoneySummaryPresenter().length(this.getMin.toIntRange, this.getMin.amountToSend(), this.getMin.getPayMethodModel(), this.getMin.equals, this.getMin.ICustomTabsService$Default);
                        return;
                    }
                } else if (str.equals(RecipientType.OTC)) {
                    this.getMin.getSendMoneySummaryPresenter().setMax(this.getMin.toIntRange, this.getMin.amountToSend(), this.getMin.getPayMethodModel(), this.getMin.equals, this.getMin.ICustomTabsService$Default, new WithdrawOTCModel());
                    return;
                }
            }
            SummaryActivity.access$transferLink(this.getMin, (getPhoto) null);
        }
    }

    /* access modifiers changed from: private */
    public final void getMax() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-2019871675, oncanceled);
            onCancelLoad.getMin(-2019871675, oncanceled);
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.asBinder);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new values(this, this));
        }
    }

    /* access modifiers changed from: private */
    public final boolean setMin() {
        getLoadOrigin getloadorigin = this.getMin;
        if (getloadorigin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("summaryViewState");
        }
        if (getloadorigin.setMin()) {
            getLoadOrigin getloadorigin2 = this.getMin;
            if (getloadorigin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("summaryViewState");
            }
            if (!getloadorigin2.getMin()) {
                return true;
            }
        }
        return false;
    }

    public final void setDisabledWithAmount(@NotNull String str) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-991281318, oncanceled);
            onCancelLoad.getMin(-991281318, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "amount");
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.asBinder);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setEnabled(false);
            danaButtonPrimaryView.setDisabledWithAmount(getString(R.string.sendmoney_summary_pay_button), str);
        }
    }

    public final void setEnableButtonWithAmount(@NotNull String str) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-890780129, oncanceled);
            onCancelLoad.getMin(-890780129, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "amount");
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.asBinder);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setEnabled(true);
            danaButtonPrimaryView.setActiveButtonLeftAlignWithAmount(getString(R.string.sendmoney_summary_pay_button), str);
        }
    }

    public final void showDanaLoadingDialog() {
        setPublishStatus setpublishstatus = new setPublishStatus(this);
        this.getMax = setpublishstatus;
        if (setpublishstatus != null && !setpublishstatus.length.isShowing()) {
            setpublishstatus.length.show();
            setpublishstatus.getMax.startRefresh();
        }
    }

    public final void dismissDanaLoadingDialog() {
        setPublishStatus setpublishstatus = this.getMax;
        if (setpublishstatus != null) {
            setpublishstatus.getMax();
        }
    }

    /* access modifiers changed from: private */
    public final void length() {
        MaterialCardView materialCardView = (MaterialCardView) _$_findCachedViewById(resetInternal.setMax.setVisibility);
        if (materialCardView != null) {
            materialCardView.measure(0, 0);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.pause);
        if (constraintLayout != null) {
            constraintLayout.measure(0, 0);
        }
    }

    /* access modifiers changed from: private */
    public final void getMin() {
        length();
        BottomSheetBehavior<MaterialCardView> bottomSheetBehavior = this.setMax;
        if (bottomSheetBehavior != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.pause);
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "clStickySummary");
            int measuredHeight = constraintLayout.getMeasuredHeight();
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.skipToQueueItem);
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "clPayMethodContainer");
            bottomSheetBehavior.setPeekHeight(measuredHeight + constraintLayout2.getMeasuredHeight());
        }
    }

    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        BottomSheetBehavior<MaterialCardView> bottomSheetBehavior;
        BottomSheetBehavior<MaterialCardView> bottomSheetBehavior2;
        if (motionEvent != null && motionEvent.getAction() == 0 && ((bottomSheetBehavior = this.setMax) == null || bottomSheetBehavior.getState() != 4)) {
            Rect rect = new Rect();
            ((MaterialCardView) _$_findCachedViewById(resetInternal.setMax.setVisibility)).getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && (bottomSheetBehavior2 = this.setMax) != null) {
                bottomSheetBehavior2.setState(4);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/sendmoney/summary/SummaryActivity$Companion;", "", "()V", "ASTERISK", "", "CHECKED", "DATE_FORMAT", "FIRST_STATE_SHARE_FEED", "NO_NAME_CONTACT", "PAY_METHOD_TOP_PADDING", "", "UNCHECKED", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final void init() {
        int max;
        int length2;
        setPhotoHeight.setMin setmin = new setPhotoHeight.setMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        String str = null;
        if (applicationComponent != null) {
            setmin.setMax = applicationComponent;
            Context baseContext = getBaseContext();
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
                onCanceled oncanceled = new onCanceled(0, length2, 4);
                onCancelLoad.setMax(-1908399590, oncanceled);
                onCancelLoad.getMin(-1908399590, oncanceled);
            }
            setmin.getMin = new SendMoneySummaryModule(new SummaryActivity$FastBitmap$CoordinateSystem(this));
            int max2 = dispatchOnCancelled.getMax(0);
            if (max2 != 0) {
                onCanceled oncanceled2 = new onCanceled(0, max2, 16);
                onCancelLoad.setMax(-1678458998, oncanceled2);
                onCancelLoad.getMin(-1678458998, oncanceled2);
            }
            setmin.length = new ExpiryModule(new length(this));
            int max3 = dispatchOnCancelled.getMax(0);
            if (max3 != 0) {
                onCanceled oncanceled3 = new onCanceled(0, max3, 16);
                onCancelLoad.setMax(-20211099, oncanceled3);
                onCancelLoad.getMin(-20211099, oncanceled3);
            }
            setmin.getMax = new ShareToFeedsModule(new hashCode());
            Context baseContext2 = getBaseContext();
            Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
            if (!(applicationContext2 == null || 1328091143 == (max = dispatchOnCancelled.getMax(applicationContext2, 1328091143)))) {
                onCanceled oncanceled4 = new onCanceled(1328091143, max, 512);
                onCancelLoad.setMax(1328091143, oncanceled4);
                onCancelLoad.getMin(1328091143, oncanceled4);
            }
            int max4 = dispatchOnCancelled.getMax(0);
            if (max4 != 0) {
                onCanceled oncanceled5 = new onCanceled(0, max4, 16);
                onCancelLoad.setMax(1328091143, oncanceled5);
                onCancelLoad.getMin(1328091143, oncanceled5);
            }
            setmin.setMin = new SendMoneyConfirmationModule(new getMax(this), new getMin(this));
            stopIgnoring.setMin(setmin.getMin, SendMoneySummaryModule.class);
            stopIgnoring.setMin(setmin.setMin, SendMoneyConfirmationModule.class);
            stopIgnoring.setMin(setmin.length, ExpiryModule.class);
            stopIgnoring.setMin(setmin.getMax, ShareToFeedsModule.class);
            stopIgnoring.setMin(setmin.setMax, PrepareException.AnonymousClass1.class);
            new setPhotoHeight(setmin.getMin, setmin.setMin, setmin.length, setmin.getMax, setmin.setMax, (byte) 0).getMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[5];
            setProxy.length length3 = this.sendMoneySummaryPresenter;
            if (length3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendMoneySummaryPresenter");
            }
            getminArr[0] = length3;
            makeTakenPicturePath.setMax setmax = this.sendMoneyConfirmationPresenter;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendMoneyConfirmationPresenter");
            }
            getminArr[1] = setmax;
            cutImageKeepRatio_new.getMax getmax = this.sendMoneyConfirmationBankPresenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendMoneyConfirmationBankPresenter");
            }
            getminArr[2] = getmax;
            onExecuted.getMin getmin = this.expiryPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("expiryPresenter");
            }
            getminArr[3] = getmin;
            handleScrollChange.getMin getmin2 = this.shareToFeedsPresenter;
            if (getmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shareToFeedsPresenter");
            }
            getminArr[4] = getmin2;
            registerPresenter(getminArr);
            getWindow().setSoftInputMode(32);
            SummaryView summaryView = (SummaryView) _$_findCachedViewById(resetInternal.setMax.AppCompatTextView);
            if (summaryView != null) {
                getLoadOrigin getloadorigin = this.getMin;
                if (getloadorigin == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("summaryViewState");
                }
                summaryView.setSummaryViewState(getloadorigin);
                getLoadOrigin summaryViewState = summaryView.getSummaryViewState();
                if (summaryViewState != null) {
                    summaryView.initTransfer(summaryViewState);
                }
                summaryView.setSummaryListener(new toFloatRange(this));
                int max5 = dispatchOnCancelled.getMax(0);
                if (max5 != 0) {
                    onCanceled oncanceled6 = new onCanceled(0, max5, 16);
                    onCancelLoad.setMax(-1660661536, oncanceled6);
                    onCancelLoad.getMin(-1660661536, oncanceled6);
                }
                Window window = getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "window");
                setOnWheelViewListener.getMax(window.getDecorView(), new IsOverlapping(this, summaryView));
                SummaryVoucherView summaryVoucherView = (SummaryVoucherView) _$_findCachedViewById(resetInternal.setMax.init);
                if (summaryVoucherView != null) {
                    summaryVoucherView.setSummaryVoucherListener(new toDoubleRange(this));
                }
            }
            DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.asBinder);
            if (danaButtonPrimaryView != null) {
                danaButtonPrimaryView.setEnabled(false);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.rate);
            if (constraintLayout != null) {
                View view = constraintLayout;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(8);
            }
            setProxy.length length4 = this.sendMoneySummaryPresenter;
            if (length4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendMoneySummaryPresenter");
            }
            getLoadOrigin getloadorigin2 = this.getMin;
            if (getloadorigin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("summaryViewState");
            }
            length4.setMin(getloadorigin2.setMin());
            onDetachedFromLayoutParams ondetachedfromlayoutparams = this.ICustomTabsService$Stub;
            if (ondetachedfromlayoutparams == null) {
                getInsetDodgeRect.setMax setmax2 = new getInsetDodgeRect.setMax((ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.pause));
                setmax2.getMax = R.layout.view_skeleton_pay_sticky;
                setmax2.setMax = 1500;
                setmax2.length = true;
                setmax2.setMin = IntRange.setMax(setmax2.getMin.getContext(), R.color.f24782131100433);
                setmax2.isInside = 20;
                getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax2, (byte) 0);
                getinsetdodgerect.getMin();
                this.ICustomTabsService$Stub = getinsetdodgerect;
            } else if (ondetachedfromlayoutparams != null) {
                ondetachedfromlayoutparams.getMin();
            }
            int max6 = dispatchOnCancelled.getMax(0);
            if (max6 != 0) {
                onCanceled oncanceled7 = new onCanceled(0, max6, 16);
                onCancelLoad.setMax(2105717170, oncanceled7);
                onCancelLoad.getMin(2105717170, oncanceled7);
            }
            if (((MaterialCardView) _$_findCachedViewById(resetInternal.setMax.setVisibility)) != null) {
                BottomSheetBehavior<MaterialCardView> from = BottomSheetBehavior.from((MaterialCardView) _$_findCachedViewById(resetInternal.setMax.setVisibility));
                length();
                ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.pause);
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "clStickySummary");
                int measuredHeight = constraintLayout2.getMeasuredHeight();
                ConstraintLayout constraintLayout3 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.skipToQueueItem);
                Intrinsics.checkNotNullExpressionValue(constraintLayout3, "clPayMethodContainer");
                from.setPeekHeight(measuredHeight + constraintLayout3.getMeasuredHeight());
                from.setState(4);
                from.addBottomSheetCallback(new toIntRange(this));
                Unit unit = Unit.INSTANCE;
                this.setMax = from;
            }
            RecipientModel recipientModel = this.toIntRange;
            if (recipientModel != null) {
                str = recipientModel.onNavigationEvent;
            }
            if (Intrinsics.areEqual((Object) str, (Object) "contact")) {
                setProxy.length length5 = this.sendMoneySummaryPresenter;
                if (length5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sendMoneySummaryPresenter");
                }
                length5.getMin();
                setProxy.length length6 = this.sendMoneySummaryPresenter;
                if (length6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sendMoneySummaryPresenter");
                }
                length6.getMax();
                NewShareToFeedsView newShareToFeedsView = (NewShareToFeedsView) _$_findCachedViewById(resetInternal.setMax.getDropDownHorizontalOffset);
                if (newShareToFeedsView != null) {
                    newShareToFeedsView.setDesc(setMax());
                    newShareToFeedsView.setVisibility(0);
                }
            }
            DanaTextBoxView danaTextBoxView = (DanaTextBoxView) _$_findCachedViewById(resetInternal.setMax.InspectableProperty$EnumEntry);
            if (danaTextBoxView != null) {
                danaTextBoxView.addTextChangedListener(new equals(this));
            }
            RecipientModel recipientModel2 = this.toIntRange;
            if (recipientModel2 != null) {
                String str2 = recipientModel2.onNavigationEvent;
                String str3 = "";
                if (Intrinsics.areEqual((Object) str2, (Object) "bank")) {
                    makeTakenPicturePath.setMax setmax3 = this.sendMoneyConfirmationPresenter;
                    if (setmax3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sendMoneyConfirmationPresenter");
                    }
                    String str4 = recipientModel2.onMessageChannelReady;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    setmax3.getMin(str3, str2);
                } else if (Intrinsics.areEqual((Object) str2, (Object) "contact")) {
                    makeTakenPicturePath.setMax setmax4 = this.sendMoneyConfirmationPresenter;
                    if (setmax4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sendMoneyConfirmationPresenter");
                    }
                    String str5 = recipientModel2.isInside;
                    if (str5 != null) {
                        str3 = str5;
                    }
                    setmax4.getMin(str3, str2);
                }
            }
            convertDipToPx.length length7 = new convertDipToPx.length(getApplicationContext());
            length7.getMax = TrackerKey.Event.SEND_MONEY_CREATE;
            convertDipToPx.length max7 = length7.setMax("Source", getSource());
            max7.setMin();
            genTextSelector.getMax(new convertDipToPx(max7, (byte) 0));
            return;
        }
        throw null;
    }

    public final void getTransferInitCallback(@NotNull getDataFieldCount getdatafieldcount) {
        String str;
        Intrinsics.checkNotNullParameter(getdatafieldcount, "transferInit");
        PayMethodView payMethodView = (PayMethodView) _$_findCachedViewById(resetInternal.setMax.initForMode);
        if (payMethodView != null) {
            RecipientModel recipientModel = this.toIntRange;
            if (recipientModel != null) {
                str = recipientModel.onNavigationEvent;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            payMethodView.fetchData(str, getdatafieldcount);
            payMethodView.setChangePayMethodListener(new isInside(this, getdatafieldcount));
        }
    }

    public static final /* synthetic */ void access$removeEditTextFocus(SummaryActivity summaryActivity) {
        ((DanaTextBoxView) summaryActivity._$_findCachedViewById(resetInternal.setMax.InspectableProperty$EnumEntry)).clearFocus();
        ((CurrencyEditText) summaryActivity._$_findCachedViewById(resetInternal.setMax.sendMediaButton)).clearFocus();
    }

    public static final /* synthetic */ void access$updateBottomSheetStickyHeader(SummaryActivity summaryActivity, boolean z) {
        if (z) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) summaryActivity._$_findCachedViewById(resetInternal.setMax.onStart);
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(4);
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) summaryActivity._$_findCachedViewById(resetInternal.setMax.onPostCreate);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setVisibility(0);
            }
            View _$_findCachedViewById = summaryActivity._$_findCachedViewById(resetInternal.setMax.name);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(0);
                return;
            }
            return;
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) summaryActivity._$_findCachedViewById(resetInternal.setMax.onStart);
        if (appCompatImageView3 != null) {
            appCompatImageView3.setVisibility(0);
        }
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) summaryActivity._$_findCachedViewById(resetInternal.setMax.onPostCreate);
        if (appCompatImageView4 != null) {
            appCompatImageView4.setVisibility(8);
        }
        View _$_findCachedViewById2 = summaryActivity._$_findCachedViewById(resetInternal.setMax.name);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setVisibility(4);
        }
    }

    public static final /* synthetic */ void access$showChargeFeeAmount(SummaryActivity summaryActivity, String str) {
        String str2;
        int i = 8;
        if (str != null) {
            RecipientModel recipientModel = summaryActivity.toIntRange;
            if (recipientModel != null) {
                str2 = recipientModel.onNavigationEvent;
            } else {
                str2 = null;
            }
            if (!Intrinsics.areEqual((Object) str2, (Object) "contact")) {
                CurrencyTextView currencyTextView = (CurrencyTextView) summaryActivity._$_findCachedViewById(resetInternal.setMax.LinearLayoutCompat$LayoutParams);
                if (currencyTextView != null) {
                    currencyTextView.setText(str);
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) summaryActivity._$_findCachedViewById(resetInternal.setMax.rate);
                if (constraintLayout != null) {
                    View view = constraintLayout;
                    boolean z = !Intrinsics.areEqual((Object) str, (Object) "0");
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    view.setVisibility(z ? 0 : 8);
                }
                CurrencyTextView currencyTextView2 = (CurrencyTextView) summaryActivity._$_findCachedViewById(resetInternal.setMax.LinearLayoutCompat$LayoutParams);
                if (currencyTextView2 != null) {
                    View view2 = currencyTextView2;
                    boolean z2 = !Intrinsics.areEqual((Object) str, (Object) "0");
                    Intrinsics.checkNotNullParameter(view2, "<this>");
                    view2.setVisibility(z2 ? 0 : 8);
                }
                AppCompatTextView appCompatTextView = (AppCompatTextView) summaryActivity._$_findCachedViewById(resetInternal.setMax.getDividerPadding);
                if (appCompatTextView != null) {
                    View view3 = appCompatTextView;
                    boolean areEqual = Intrinsics.areEqual((Object) str, (Object) "0");
                    Intrinsics.checkNotNullParameter(view3, "<this>");
                    if (areEqual) {
                        i = 0;
                    }
                    view3.setVisibility(i);
                    return;
                }
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) summaryActivity._$_findCachedViewById(resetInternal.setMax.rate);
        if (constraintLayout2 != null) {
            View view4 = constraintLayout2;
            Intrinsics.checkNotNullParameter(view4, "<this>");
            view4.setVisibility(8);
        }
    }

    public static final /* synthetic */ void access$setRemarks$p(SummaryActivity summaryActivity, String str) {
        Spannable spannable;
        summaryActivity.equals = str;
        NewShareToFeedsView newShareToFeedsView = (NewShareToFeedsView) summaryActivity._$_findCachedViewById(resetInternal.setMax.getDropDownHorizontalOffset);
        if (newShareToFeedsView != null) {
            if (StringsKt.isBlank(str)) {
                spannable = summaryActivity.setMax();
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = summaryActivity.getString(R.string.send_money_feed_summary_display_caption);
                Intrinsics.checkNotNullExpressionValue(string, "this.getString(R.string.…_summary_display_caption)");
                String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
                if (Intrinsics.areEqual((Object) locale.getDisplayLanguage(), (Object) "Indonesia")) {
                    spannable = summaryActivity.getMax(format, 5, 18);
                } else {
                    spannable = summaryActivity.getMax(format, 4, 14);
                }
            }
            newShareToFeedsView.setDesc(spannable);
        }
    }

    public static final /* synthetic */ void access$showPaymentStickyAmountWarningMessage(SummaryActivity summaryActivity, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (WheelView.OnWheelViewListener.getMax == null) {
                WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
            }
            String min = NebulaLoadingView.AnonymousClass1.getMin(WheelView.OnWheelViewListener.getMax, new APImageDownloadRsp(str).setMin, "Rp");
            AppCompatTextView appCompatTextView = (AppCompatTextView) summaryActivity._$_findCachedViewById(resetInternal.setMax.showSoftInputIfNecessary);
            if (appCompatTextView != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArr = new Object[2];
                PayMethodModel payMethodModel = summaryActivity.toFloatRange;
                objArr[0] = payMethodModel != null ? payMethodModel.length(summaryActivity) : null;
                objArr[1] = min;
                String format = String.format(str2, Arrays.copyOf(objArr, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                appCompatTextView.setText(format);
            }
            LinearLayout linearLayout = (LinearLayout) summaryActivity._$_findCachedViewById(resetInternal.setMax.getItem);
            if (linearLayout != null) {
                View view = linearLayout;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(0);
            }
            SummaryView summaryView = (SummaryView) summaryActivity._$_findCachedViewById(resetInternal.setMax.AppCompatTextView);
            if (summaryView != null) {
                SummaryView.showAmountWarningMessage$default(summaryView, (String) null, (String) null, 0, 0, 15, (Object) null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v4, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02b1, code lost:
        if (kotlin.text.StringsKt.contains$default(r0, "*", false, 2, (java.lang.Object) null) != false) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02fb, code lost:
        if (r0.setMax() != false) goto L_0x02ff;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void access$confirmSendMoney(id.dana.sendmoney.summary.SummaryActivity r14, java.lang.String r15) {
        /*
            r0 = 16
            java.lang.String r1 = "sendMoneyConfirmationPresenter"
            java.lang.String r2 = ""
            r3 = 0
            r4 = 1
            r5 = 0
            if (r15 != 0) goto L_0x000d
            goto L_0x01f6
        L_0x000d:
            int r6 = r15.hashCode()
            r7 = -1762235539(0xffffffff96f66b6d, float:-3.9811239E-25)
            if (r6 == r7) goto L_0x01df
            r7 = 1204868045(0x47d0d3cd, float:106919.6)
            java.lang.String r8 = "sendMoneyConfirmationBankPresenter"
            if (r6 == r7) goto L_0x00fd
            r7 = 1205173643(0x47d57d8b, float:109307.086)
            if (r6 == r7) goto L_0x0024
            goto L_0x01f6
        L_0x0024:
            java.lang.String r6 = "destination_link"
            boolean r15 = r15.equals(r6)
            if (r15 == 0) goto L_0x01f6
            int r15 = o.dispatchOnCancelled.getMax(r5)
            if (r15 == 0) goto L_0x0040
            o.onCanceled r1 = new o.onCanceled
            r1.<init>(r5, r15, r0)
            r15 = 1433940691(0x557832d3, float:1.70560733E13)
            o.onCancelLoad.setMax(r15, r1)
            o.onCancelLoad.getMin(r15, r1)
        L_0x0040:
            o.BucketInfo$length r15 = new o.BucketInfo$length
            r15.<init>()
            id.dana.model.CurrencyAmountModel r0 = r14.amountToSend()
            java.lang.String r0 = r0.getMax
            if (r0 != 0) goto L_0x004e
            r0 = r2
        L_0x004e:
            r15.getMin = r0
            java.lang.String r0 = r14.onMessageChannelReady
            r15.getMax = r0
            java.lang.String r0 = r14.ICustomTabsService
            r15.toFloatRange = r0
            java.lang.String r0 = r14.equals
            r15.isInside = r0
            java.lang.String r0 = r14.asBinder
            r15.equals = r0
            r0 = 2131887005(0x7f12039d, float:1.9408605E38)
            java.lang.String r0 = r14.getString(r0)
            java.lang.String r1 = "getString(R.string.expiry_hour)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 2131887006(0x7f12039e, float:1.9408607E38)
            java.lang.String r1 = r14.getString(r1)
            java.lang.String r6 = "getString(R.string.expiry_hours)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            r6 = 2131887003(0x7f12039b, float:1.94086E38)
            java.lang.String r6 = r14.getString(r6)
            java.lang.String r7 = "getString(R.string.expiry_day)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r7 = 2131887004(0x7f12039c, float:1.9408603E38)
            java.lang.String r7 = r14.getString(r7)
            java.lang.String r9 = "getString(R.string.expiry_days)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r9)
            java.lang.String r9 = r14.isInside
            boolean r0 = kotlin.text.StringsKt.equals(r0, r9, r4)
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = r14.isInside
            boolean r0 = kotlin.text.StringsKt.equals(r1, r0, r4)
            if (r0 == 0) goto L_0x00a1
            goto L_0x00ce
        L_0x00a1:
            java.lang.String r0 = r14.isInside
            boolean r0 = kotlin.text.StringsKt.equals(r6, r0, r4)
            if (r0 != 0) goto L_0x00cb
            java.lang.String r0 = r14.isInside
            boolean r0 = kotlin.text.StringsKt.equals(r7, r0, r4)
            if (r0 == 0) goto L_0x00b2
            goto L_0x00cb
        L_0x00b2:
            java.lang.String r0 = r14.isInside
            if (r0 == 0) goto L_0x00c6
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.Character r0 = kotlin.text.StringsKt.getOrNull(r0, r5)
            if (r0 == 0) goto L_0x00c6
            char r0 = r0.charValue()
            java.lang.String r3 = java.lang.String.valueOf(r0)
        L_0x00c6:
            if (r3 != 0) goto L_0x00c9
            goto L_0x00d0
        L_0x00c9:
            r2 = r3
            goto L_0x00d0
        L_0x00cb:
            java.lang.String r2 = "D"
            goto L_0x00d0
        L_0x00ce:
            java.lang.String r2 = "H"
        L_0x00d0:
            r15.length = r2
            java.lang.String r0 = r14.toString
            r15.setMin = r0
            java.lang.String r0 = r14.warmup
            r15.IsOverlapping = r0
            java.lang.String r0 = r14.extraCallback
            r15.toIntRange = r0
            o.BucketInfo r15 = r15.setMax()
            o.cutImageKeepRatio_new$getMax r0 = r14.sendMoneyConfirmationBankPresenter
            if (r0 != 0) goto L_0x00e9
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x00e9:
            java.lang.String r1 = r14.ICustomTabsCallback$Default
            java.lang.String r2 = r14.hashCode
            r0.setMin(r15, r1, r2)
            o.cutImageKeepRatio_new$getMax r14 = r14.sendMoneyConfirmationBankPresenter
            if (r14 != 0) goto L_0x00f7
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x00f7:
            java.lang.String r15 = "LINK"
            r14.setMax((java.lang.String) r15)
            return
        L_0x00fd:
            java.lang.String r6 = "destination_bank"
            boolean r15 = r15.equals(r6)
            if (r15 == 0) goto L_0x01f6
            o.BucketInfo$length r15 = new o.BucketInfo$length
            r15.<init>()
            o.APImageDownloadRsp r0 = r14.Mean$Arithmetic
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r15.getMin = r0
            java.lang.String r0 = r14.getCause
            r15.setMax = r0
            java.lang.String r0 = r14.onMessageChannelReady
            r15.getMax = r0
            java.lang.String r0 = r14.ICustomTabsService
            r15.toFloatRange = r0
            java.lang.String r0 = r14.create
            r15.isInside = r0
            java.lang.String r0 = r14.asBinder
            r15.equals = r0
            java.lang.String r0 = r14.isInside
            r15.length = r0
            java.lang.String r0 = r14.toString
            r15.setMin = r0
            java.lang.String r0 = r14.warmup
            r15.IsOverlapping = r0
            java.lang.String r0 = r14.extraCallback
            r15.toIntRange = r0
            o.BeaconParser$BeaconLayoutException r0 = new o.BeaconParser$BeaconLayoutException
            r0.<init>()
            java.lang.String r1 = r14.getCause
            r0.setBankAccountIndexNo(r1)
            id.dana.sendmoney.model.ConfirmationModel r1 = r14.IsOverlapping
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.String r1 = r1.setDefaultImpl
            r0.setUserId(r1)
            r15.FastBitmap$CoordinateSystem = r0
            o.BucketInfo r15 = r15.setMax()
            o.cutImageKeepRatio_new$getMax r0 = r14.sendMoneyConfirmationBankPresenter
            if (r0 != 0) goto L_0x0157
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0157:
            java.lang.String r1 = r14.ICustomTabsCallback$Default
            java.lang.String r6 = r14.hashCode
            r0.setMin(r15, r1, r6)
            android.content.Context r15 = r14.getBaseContext()
            if (r15 == 0) goto L_0x0168
            android.content.Context r3 = r15.getApplicationContext()
        L_0x0168:
            if (r3 == 0) goto L_0x0185
            java.lang.String[] r15 = r3.fileList()
            int r15 = r15.length
            int r0 = o.dispatchOnCancelled.getMin(r3, r15)
            if (r15 == r0) goto L_0x0185
            o.onCanceled r1 = new o.onCanceled
            r3 = 32
            r1.<init>(r15, r0, r3)
            r15 = -1834198676(0xffffffff92ac596c, float:-1.087677E-27)
            o.onCancelLoad.setMax(r15, r1)
            o.onCancelLoad.getMin(r15, r1)
        L_0x0185:
            id.dana.sendmoney.model.RecentBankModel r15 = new id.dana.sendmoney.model.RecentBankModel
            r15.<init>(r5)
            java.lang.String r0 = r14.valueOf
            r15.Mean$Arithmetic = r0
            java.lang.String r0 = r14.toDoubleRange
            if (r0 != 0) goto L_0x0193
            goto L_0x0194
        L_0x0193:
            r2 = r0
        L_0x0194:
            r15.equals = r2
            java.lang.String r0 = r14.toDoubleRange
            r15.setMax = r0
            java.lang.String r0 = r14.values
            r15.getMax = r0
            java.lang.String r0 = r14.invoke
            r15.Grayscale$Algorithm = r0
            java.lang.String r0 = r14.extraCallbackWithResult
            r15.getMin = r0
            java.lang.String r0 = r14.asInterface
            r15.setMax(r0)
            java.lang.String r0 = r14.b
            r15.toFloatRange = r0
            java.lang.String r0 = r14.extraCommand
            r15.IsOverlapping = r0
            java.lang.String r0 = r14.mayLaunchUrl
            r15.isInside = r0
            java.lang.String r0 = r14.getCause
            r15.length = r0
            java.lang.String r0 = r14.onRelationshipValidationResult
            r15.hashCode = r0
            int r0 = r14.IPostMessageService
            int r0 = r0 + r4
            r15.FastBitmap$CoordinateSystem = r0
            boolean r0 = r14.receiveFile
            r15.values = r0
            o.cutImageKeepRatio_new$getMax r0 = r14.sendMoneyConfirmationBankPresenter
            if (r0 != 0) goto L_0x01cf
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x01cf:
            r0.setMax((id.dana.sendmoney.model.RecentBankModel) r15)
            o.cutImageKeepRatio_new$getMax r14 = r14.sendMoneyConfirmationBankPresenter
            if (r14 != 0) goto L_0x01d9
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x01d9:
            java.lang.String r15 = "BANK_TRANSFER"
            r14.setMax((java.lang.String) r15)
            return
        L_0x01df:
            java.lang.String r6 = "destination_otc"
            boolean r15 = r15.equals(r6)
            if (r15 == 0) goto L_0x01f6
            o.makeTakenPicturePath$setMax r15 = r14.sendMoneyConfirmationPresenter
            if (r15 != 0) goto L_0x01ee
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x01ee:
            id.dana.sendmoney.model.ConfirmationModel r0 = r14.IsOverlapping
            java.lang.String r14 = r14.hashCode
            r15.getMin((id.dana.sendmoney.model.ConfirmationModel) r0, (java.lang.String) r14)
            return
        L_0x01f6:
            java.lang.String r15 = r14.toDoubleRange
            java.lang.String r6 = "*"
            java.lang.String r7 = "•"
            java.lang.String r15 = r15.replace(r7, r6)
            r14.toDoubleRange = r15
            int r15 = o.dispatchOnCancelled.getMax(r5)
            if (r15 == 0) goto L_0x0216
            o.onCanceled r7 = new o.onCanceled
            r7.<init>(r5, r15, r0)
            r15 = 648748669(0x26ab1e7d, float:1.1873772E-15)
            o.onCancelLoad.setMax(r15, r7)
            o.onCancelLoad.getMin(r15, r7)
        L_0x0216:
            o.PhotoPagerListener$V4$getMax r15 = new o.PhotoPagerListener$V4$getMax
            r15.<init>()
            o.APImageDownloadRsp r0 = r14.Mean$Arithmetic
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = o.isOriginHasAppInfo.getCleanAll(r0)
            r15.getMax = r0
            java.lang.String r0 = r14.invokeSuspend
            r15.length = r0
            java.lang.String r0 = r14.valueOf
            r15.toIntRange = r0
            android.content.Context r0 = r14.getBaseContext()
            if (r0 == 0) goto L_0x023a
            android.content.Context r0 = r0.getApplicationContext()
            goto L_0x023b
        L_0x023a:
            r0 = r3
        L_0x023b:
            if (r0 == 0) goto L_0x0252
            int r0 = o.dispatchOnCancelled.length(r0, r5)
            if (r0 == 0) goto L_0x0252
            o.onCanceled r7 = new o.onCanceled
            r8 = 4
            r7.<init>(r5, r0, r8)
            r0 = -112633226(0xfffffffff9495a76, float:-6.53429E34)
            o.onCancelLoad.setMax(r0, r7)
            o.onCancelLoad.getMin(r0, r7)
        L_0x0252:
            java.lang.String r0 = r14.toDoubleRange
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r7 = "-"
            if (r0 != 0) goto L_0x026a
            java.lang.String r0 = r14.toDoubleRange
            boolean r0 = kotlin.text.StringsKt.equals(r7, r0, r4)
            if (r0 == 0) goto L_0x0267
            goto L_0x026a
        L_0x0267:
            java.lang.String r0 = r14.toDoubleRange
            goto L_0x026c
        L_0x026a:
            java.lang.String r0 = r14.values
        L_0x026c:
            r15.IsOverlapping = r0
            java.lang.String r0 = r14.toDoubleRange
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r8 = 2
            if (r0 != 0) goto L_0x0295
            java.lang.String r0 = r14.toDoubleRange
            boolean r0 = kotlin.text.StringsKt.equals(r7, r0, r4)
            if (r0 != 0) goto L_0x0295
            java.lang.String r0 = r14.toDoubleRange
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7 = r6
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r0 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r0, (java.lang.CharSequence) r7, (boolean) r5, (int) r8, (java.lang.Object) r3)
            if (r0 == 0) goto L_0x0292
            goto L_0x0295
        L_0x0292:
            java.lang.String r0 = r14.toDoubleRange
            goto L_0x0296
        L_0x0295:
            r0 = r3
        L_0x0296:
            r15.equals = r0
            java.lang.String r0 = r14.values
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02ba
            java.lang.String r0 = r14.values
            if (r0 == 0) goto L_0x02b4
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r0 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r0, (java.lang.CharSequence) r6, (boolean) r5, (int) r8, (java.lang.Object) r3)
            if (r0 == 0) goto L_0x02b4
            goto L_0x02ba
        L_0x02b4:
            java.lang.String r0 = r14.values
            java.lang.String r3 = o.isOriginHasAppInfo.getClearPhoneNumber(r0)
        L_0x02ba:
            r15.toFloatRange = r3
            java.lang.String r0 = r14.newSession
            java.lang.String r3 = "userid"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x02c9
            java.lang.String r0 = r14.extraCallbackWithResult
            goto L_0x02ca
        L_0x02c9:
            r0 = r2
        L_0x02ca:
            r15.isInside = r0
            java.lang.String r0 = r14.asBinder
            r15.getMin = r0
            java.lang.String r0 = r14.create
            r15.setMax = r0
            r15.hashCode = r5
            java.lang.String r0 = r14.ICustomTabsService
            r15.setMin = r0
            java.lang.String r0 = r14.ICustomTabsCallback$Default
            o.PhotoPagerListener$V4$getMax r15 = r15.setMin(r0)
            java.lang.String r0 = r14.onMessageChannelReady
            r15.FastBitmap$CoordinateSystem = r0
            java.lang.String r0 = r14.extraCallback
            r15.values = r0
            java.lang.String r0 = r14.warmup
            r15.toDoubleRange = r0
            java.lang.String r0 = r14.updateVisuals
            r15.toString = r0
            id.dana.sendmoney.model.ConfirmationModel r0 = r14.IsOverlapping
            if (r0 == 0) goto L_0x02fe
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            boolean r0 = r0.setMax()
            if (r0 == 0) goto L_0x02fe
            goto L_0x02ff
        L_0x02fe:
            r4 = 0
        L_0x02ff:
            r15.valueOf = r4
            o.PhotoPagerListener$V4 r15 = r15.length()
            o.makeTakenPicturePath$setMax r0 = r14.sendMoneyConfirmationPresenter
            if (r0 != 0) goto L_0x030c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x030c:
            java.lang.String r4 = r14.ICustomTabsCallback$Default
            java.lang.String r5 = r14.hashCode
            r0.getMax(r15, r4, r5)
            o.makeTakenPicturePath$setMax r6 = r14.sendMoneyConfirmationPresenter
            if (r6 != 0) goto L_0x031a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x031a:
            java.lang.String r7 = r14.valueOf
            java.lang.String r8 = r14.toDoubleRange
            java.lang.String r9 = r14.values
            java.lang.String r15 = r14.newSession
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r15)
            if (r15 == 0) goto L_0x032a
            java.lang.String r2 = r14.extraCallbackWithResult
        L_0x032a:
            r10 = r2
            java.lang.String r11 = r14.getCause
            int r12 = r14.IPostMessageService
            boolean r13 = r14.receiveFile
            r6.setMax(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney.summary.SummaryActivity.access$confirmSendMoney(id.dana.sendmoney.summary.SummaryActivity, java.lang.String):void");
    }

    public static final /* synthetic */ void access$trackSendMoneyConfirm(SummaryActivity summaryActivity) {
        Context context = summaryActivity;
        convertDipToPx sendMoneyConfirmEvent = new hasZero(summaryActivity.IsOverlapping).getSendMoneyConfirmEvent(context);
        if (sendMoneyConfirmEvent != null) {
            List length2 = sendMoneyConfirmEvent.length != null ? sendMoneyConfirmEvent.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1984860685, oncanceled);
            onCancelLoad.getMin(-1984860685, oncanceled);
        }
        Blur.getMax min = new Blur.getMax(context).getMin(TrackerKey.PeopleProperty.LAST_TRANSACTION_TYPE, "Send Money");
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        BlurProcess.length(new Blur(min.getMin(TrackerKey.PeopleProperty.LAST_TRANSACTION_DATE, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", WheelView.OnWheelViewListener.getMax).format(new Date(new Date().getTime()))), (byte) 0).isInside());
        Blur.getMax min2 = new Blur.getMax(context).getMin(TrackerKey.PeopleProperty.FIRST_TRANSACTION_TYPE, "Send Money");
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        BlurProcess.setMin(new Blur(min2.getMin(TrackerKey.PeopleProperty.FIRST_TRANSACTION_DATE, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", WheelView.OnWheelViewListener.getMax).format(new Date(new Date().getTime()))), (byte) 0).isInside());
    }

    public static final /* synthetic */ void access$expandPayMethod(SummaryActivity summaryActivity) {
        BottomSheetBehavior<MaterialCardView> bottomSheetBehavior = summaryActivity.setMax;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(3);
        }
        setOnWheelViewListener.getMin((Activity) summaryActivity);
    }
}
