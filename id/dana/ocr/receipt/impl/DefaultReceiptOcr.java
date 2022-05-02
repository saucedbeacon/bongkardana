package id.dana.ocr.receipt.impl;

import android.graphics.Bitmap;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import com.google.firebase.ml.vision.text.FirebaseVisionText;
import com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer;
import com.google.gson.Gson;
import id.dana.data.socialshare.ShareAppKey;
import id.dana.ocr.receipt.ReceiptOcr;
import id.dana.ocr.receipt.exception.RuleUnspecifiedException;
import id.dana.ocr.receipt.model.ReceiptInfo;
import id.dana.ocr.receipt.parser.AmountParser;
import id.dana.ocr.receipt.parser.BillNumberCandidateParser;
import id.dana.ocr.receipt.parser.BillNumberParser;
import id.dana.ocr.receipt.parser.DateParser;
import id.dana.ocr.receipt.parser.NameParser;
import id.dana.ocr.receipt.parser.TimeParser;
import id.dana.ocr.receipt.rule.Rule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J&\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018H\u0002J \u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010#\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010$\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u001e\u0010%\u001a\u00020&2\u0006\u0010!\u001a\u00020\"2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lid/dana/ocr/receipt/impl/DefaultReceiptOcr;", "Lid/dana/ocr/receipt/ReceiptOcr;", "textRecognizer", "Lcom/google/firebase/ml/vision/text/FirebaseVisionTextRecognizer;", "(Lcom/google/firebase/ml/vision/text/FirebaseVisionTextRecognizer;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "<set-?>", "Lid/dana/ocr/receipt/rule/Rule;", "rule", "getRule", "()Lid/dana/ocr/receipt/rule/Rule;", "applyRule", "jsonStrRule", "", "parse", "", "receiptBmp", "Landroid/graphics/Bitmap;", "merchantAliases", "", "callback", "Lid/dana/ocr/receipt/ReceiptOcr$Callback;", "parseMerchantName", "receiptBuilder", "Lid/dana/ocr/receipt/model/ReceiptInfo$Builder;", "line", "Lcom/google/firebase/ml/vision/text/FirebaseVisionText$Line;", "parseNominal", "visionText", "Lcom/google/firebase/ml/vision/text/FirebaseVisionText;", "parseReceiptTime", "parserReceiptDate", "processText", "Lid/dana/ocr/receipt/model/ReceiptInfo;", "library_release"}, k = 1, mv = {1, 1, 16})
public final class DefaultReceiptOcr implements ReceiptOcr {
    static final /* synthetic */ KProperty[] length = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DefaultReceiptOcr.class), "gson", "getGson()Lcom/google/gson/Gson;"))};
    private final Lazy getMax = LazyKt.lazy(getMax.INSTANCE);
    private final FirebaseVisionTextRecognizer getMin;
    @NotNull
    private Rule setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "visionText", "Lcom/google/firebase/ml/vision/text/FirebaseVisionText;", "kotlin.jvm.PlatformType", "onSuccess"}, k = 3, mv = {1, 1, 16})
    static final class length<TResult> implements OnSuccessListener<FirebaseVisionText> {
        final /* synthetic */ ReceiptOcr.Callback getMin;
        final /* synthetic */ List setMax;
        final /* synthetic */ DefaultReceiptOcr setMin;

        length(DefaultReceiptOcr defaultReceiptOcr, ReceiptOcr.Callback callback, List list) {
            this.setMin = defaultReceiptOcr;
            this.getMin = callback;
            this.setMax = list;
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            FirebaseVisionText firebaseVisionText = (FirebaseVisionText) obj;
            ReceiptOcr.Callback callback = this.getMin;
            DefaultReceiptOcr defaultReceiptOcr = this.setMin;
            Intrinsics.checkExpressionValueIsNotNull(firebaseVisionText, "visionText");
            callback.onSuccess(DefaultReceiptOcr.setMax(defaultReceiptOcr, firebaseVisionText, this.setMax));
        }
    }

    public DefaultReceiptOcr(@NotNull FirebaseVisionTextRecognizer firebaseVisionTextRecognizer) {
        Intrinsics.checkParameterIsNotNull(firebaseVisionTextRecognizer, "textRecognizer");
        this.getMin = firebaseVisionTextRecognizer;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class getMax extends Lambda implements Function0<Gson> {
        public static final getMax INSTANCE = new getMax();

        getMax() {
            super(0);
        }

        @NotNull
        public final Gson invoke() {
            return new Gson();
        }
    }

    public final void length(@NotNull Bitmap bitmap, @NotNull List<String> list, @NotNull ReceiptOcr.Callback callback) {
        Intrinsics.checkParameterIsNotNull(bitmap, "receiptBmp");
        Intrinsics.checkParameterIsNotNull(list, "merchantAliases");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        if (this.setMax == null) {
            callback.onFailure(new RuleUnspecifiedException());
        } else {
            this.getMin.processImage(FirebaseVisionImage.fromBitmap(bitmap)).addOnSuccessListener(new length(this, callback, list)).addOnFailureListener(new getMin(callback));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "onFailure"}, k = 3, mv = {1, 1, 16})
    static final class getMin implements OnFailureListener {
        final /* synthetic */ ReceiptOcr.Callback setMax;

        getMin(ReceiptOcr.Callback callback) {
            this.setMax = callback;
        }

        public final void onFailure(@NotNull Exception exc) {
            Intrinsics.checkParameterIsNotNull(exc, "it");
            this.setMax.onFailure(exc);
        }
    }

    @NotNull
    public final ReceiptOcr setMax(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "jsonStrRule");
        try {
            Object fromJson = ((Gson) this.getMax.getValue()).fromJson(str, Rule.class);
            Intrinsics.checkExpressionValueIsNotNull(fromJson, "gson.fromJson(jsonStrRule, Rule::class.java)");
            this.setMax = (Rule) fromJson;
        } catch (Exception unused) {
        }
        return this;
    }

    public static final /* synthetic */ ReceiptInfo setMax(DefaultReceiptOcr defaultReceiptOcr, FirebaseVisionText firebaseVisionText, List list) {
        Object obj;
        String str;
        String str2;
        String str3;
        String str4;
        ReceiptInfo.Companion companion = ReceiptInfo.IsOverlapping;
        ReceiptInfo.Builder min = ReceiptInfo.Companion.getMin();
        min.toFloatRange = firebaseVisionText.getText();
        List arrayList = new ArrayList();
        List<FirebaseVisionText.TextBlock> textBlocks = firebaseVisionText.getTextBlocks();
        Intrinsics.checkExpressionValueIsNotNull(textBlocks, "visionText.textBlocks");
        for (FirebaseVisionText.TextBlock textBlock : textBlocks) {
            Intrinsics.checkExpressionValueIsNotNull(textBlock, "textBlock");
            List<FirebaseVisionText.Line> lines = textBlock.getLines();
            Intrinsics.checkExpressionValueIsNotNull(lines, "textBlock.lines");
            for (FirebaseVisionText.Line line : lines) {
                Intrinsics.checkExpressionValueIsNotNull(line, ShareAppKey.LINE);
                if (min.length == null) {
                    NameParser nameParser = NameParser.getMax;
                    String min2 = NameParser.getMin(line, list);
                    if (min2 != null) {
                        min.length = min2;
                    }
                }
                if (min.setMax == null) {
                    DateParser dateParser = DateParser.length;
                    Rule rule = defaultReceiptOcr.setMax;
                    if (rule == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rule");
                    }
                    Intrinsics.checkParameterIsNotNull(line, ShareAppKey.LINE);
                    Intrinsics.checkParameterIsNotNull(rule, "rule");
                    String min3 = DateParser.getMin(line, rule, "ID");
                    if (min3 == null) {
                        min3 = DateParser.getMin(line, rule, "EN");
                    }
                    if (min3 != null) {
                        min.setMax = min3;
                    }
                }
                if (min.setMin == null) {
                    TimeParser timeParser = TimeParser.getMax;
                    Rule rule2 = defaultReceiptOcr.setMax;
                    if (rule2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rule");
                    }
                    String min4 = TimeParser.setMin(line, rule2);
                    if (min4 != null) {
                        min.setMin = min4;
                    }
                }
                BillNumberParser billNumberParser = BillNumberParser.getMax;
                Rule rule3 = defaultReceiptOcr.setMax;
                if (rule3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rule");
                }
                List<FirebaseVisionText.TextBlock> textBlocks2 = firebaseVisionText.getTextBlocks();
                Intrinsics.checkExpressionValueIsNotNull(textBlocks2, "visionText.textBlocks");
                String min5 = BillNumberParser.getMin(line, rule3, textBlocks2);
                if (min5 != null) {
                    min.getMax = min5;
                }
                BillNumberCandidateParser billNumberCandidateParser = BillNumberCandidateParser.getMax;
                String max = BillNumberCandidateParser.setMax(line);
                if (max != null) {
                    arrayList.add(max);
                }
                AmountParser amountParser = AmountParser.length;
                Rule rule4 = defaultReceiptOcr.setMax;
                if (rule4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rule");
                }
                List<FirebaseVisionText.TextBlock> textBlocks3 = firebaseVisionText.getTextBlocks();
                Intrinsics.checkExpressionValueIsNotNull(textBlocks3, "visionText.textBlocks");
                String length2 = AmountParser.length(line, rule4, textBlocks3);
                if (length2 != null) {
                    String str5 = min.getMin;
                    if (str5 == null) {
                        min.getMin = length2;
                    } else if (Integer.parseInt(str5) < Integer.parseInt(length2)) {
                        min.getMin = length2;
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        String str6 = null;
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                int length3 = ((String) obj).length();
                do {
                    Object next = it.next();
                    int length4 = ((String) next).length();
                    if (length3 < length4) {
                        obj = next;
                        length3 = length4;
                    }
                } while (it.hasNext());
            }
        }
        String str7 = (String) obj;
        if (min.getMax == null && str7 != null) {
            min.getMax = str7;
        }
        String str8 = min.length;
        String str9 = str8 == null ? "" : str8;
        String str10 = min.getMax;
        if (str10 == null) {
            str = "";
        } else {
            str = str10;
        }
        CharSequence charSequence = min.setMax;
        boolean z = false;
        if (!(charSequence == null || charSequence.length() == 0)) {
            CharSequence charSequence2 = min.setMin;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z = true;
            }
            if (z) {
                str6 = min.setMax;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(min.setMax);
                sb.append(' ');
                sb.append(min.setMin);
                str6 = sb.toString();
            }
        }
        if (str6 == null) {
            str2 = "";
        } else {
            str2 = str6;
        }
        String str11 = min.getMin;
        if (str11 == null) {
            str3 = "";
        } else {
            str3 = str11;
        }
        String str12 = min.toFloatRange;
        if (str12 == null) {
            str4 = "";
        } else {
            str4 = str12;
        }
        return new ReceiptInfo(str9, str, str2, str3, str4);
    }
}
