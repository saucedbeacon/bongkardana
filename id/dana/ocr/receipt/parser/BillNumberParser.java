package id.dana.ocr.receipt.parser;

import com.google.firebase.ml.vision.text.FirebaseVisionText;
import id.dana.data.socialshare.ShareAppKey;
import id.dana.ocr.receipt.rule.Rule;
import id.dana.ocr.receipt.util.LineUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.SequencesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\bÀ\u0002\u0018\u00002&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J \u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J,\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00032\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0016R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lid/dana/ocr/receipt/parser/BillNumberParser;", "Lid/dana/ocr/receipt/parser/Parser3;", "Lcom/google/firebase/ml/vision/text/FirebaseVisionText$Line;", "Lid/dana/ocr/receipt/rule/Rule;", "", "Lcom/google/firebase/ml/vision/text/FirebaseVisionText$TextBlock;", "Lid/dana/ocr/receipt/parser/TextBlocks;", "", "()V", "PATTERN_BILL_SHOULD_HAVE_NUMBER", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "filterOutPattern", "", "lineText", "pattern", "getBillNumberCandidate", "getBillNumberCandidateFromElement", "lineToProcess", "parse", "line", "rule", "textBlocks", "library_release"}, k = 1, mv = {1, 1, 16})
public final class BillNumberParser implements Parser3<FirebaseVisionText.Line, Rule, List<? extends FirebaseVisionText.TextBlock>, String> {
    public static final BillNumberParser getMax = new BillNumberParser();
    /* access modifiers changed from: private */
    public static final Pattern setMax = Pattern.compile("[\\d]+");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class length extends Lambda implements Function1<String, Boolean> {
        final /* synthetic */ Ref.ObjectRef $lineText;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(Ref.ObjectRef objectRef) {
            super(1);
            this.$lineText = objectRef;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((String) obj));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0077, code lost:
            if (kotlin.text.StringsKt.contains((java.lang.CharSequence) (java.lang.String) r12.$lineText.element, (java.lang.CharSequence) kotlin.text.StringsKt.replace$default(r13, "receipt", "recefpt", false, 4, (java.lang.Object) null), true) == false) goto L_0x0041;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x003e, code lost:
            if (kotlin.text.StringsKt.contains((java.lang.CharSequence) (java.lang.String) r12.$lineText.element, (java.lang.CharSequence) kotlin.text.StringsKt.replace$default(r13, id.dana.lib.drawbitmap.DrawBitmapEvent.INVOICE, "invpice", false, 4, (java.lang.Object) null), true) == false) goto L_0x0041;
         */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00ac A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00ad A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean invoke(@org.jetbrains.annotations.NotNull java.lang.String r13) {
            /*
                r12 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r13, r0)
                r0 = r13
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.String r1 = "invoice"
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r2 = 0
                r3 = 2
                r4 = 0
                boolean r1 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r0, (java.lang.CharSequence) r1, (boolean) r4, (int) r3, (java.lang.Object) r2)
                r5 = 1
                if (r1 == 0) goto L_0x0045
                kotlin.jvm.internal.Ref$ObjectRef r1 = r12.$lineText
                T r1 = r1.element
                java.lang.String r1 = (java.lang.String) r1
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = kotlin.text.StringsKt.contains((java.lang.CharSequence) r1, (java.lang.CharSequence) r0, (boolean) r5)
                if (r0 != 0) goto L_0x0043
                kotlin.jvm.internal.Ref$ObjectRef r0 = r12.$lineText
                T r0 = r0.element
                java.lang.String r0 = (java.lang.String) r0
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r9 = 0
                r10 = 4
                r11 = 0
                java.lang.String r7 = "invoice"
                java.lang.String r8 = "invpice"
                r6 = r13
                java.lang.String r13 = kotlin.text.StringsKt.replace$default((java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (boolean) r9, (int) r10, (java.lang.Object) r11)
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                boolean r13 = kotlin.text.StringsKt.contains((java.lang.CharSequence) r0, (java.lang.CharSequence) r13, (boolean) r5)
                if (r13 == 0) goto L_0x0041
                goto L_0x0043
            L_0x0041:
                r13 = 0
                goto L_0x0086
            L_0x0043:
                r13 = 1
                goto L_0x0086
            L_0x0045:
                java.lang.String r1 = "receipt"
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r1 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r0, (java.lang.CharSequence) r1, (boolean) r4, (int) r3, (java.lang.Object) r2)
                if (r1 == 0) goto L_0x007a
                kotlin.jvm.internal.Ref$ObjectRef r1 = r12.$lineText
                T r1 = r1.element
                java.lang.String r1 = (java.lang.String) r1
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = kotlin.text.StringsKt.contains((java.lang.CharSequence) r1, (java.lang.CharSequence) r0, (boolean) r5)
                if (r0 != 0) goto L_0x0043
                kotlin.jvm.internal.Ref$ObjectRef r0 = r12.$lineText
                T r0 = r0.element
                java.lang.String r0 = (java.lang.String) r0
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r9 = 0
                r10 = 4
                r11 = 0
                java.lang.String r7 = "receipt"
                java.lang.String r8 = "recefpt"
                r6 = r13
                java.lang.String r13 = kotlin.text.StringsKt.replace$default((java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (boolean) r9, (int) r10, (java.lang.Object) r11)
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                boolean r13 = kotlin.text.StringsKt.contains((java.lang.CharSequence) r0, (java.lang.CharSequence) r13, (boolean) r5)
                if (r13 == 0) goto L_0x0041
                goto L_0x0043
            L_0x007a:
                kotlin.jvm.internal.Ref$ObjectRef r13 = r12.$lineText
                T r13 = r13.element
                java.lang.String r13 = (java.lang.String) r13
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                boolean r13 = kotlin.text.StringsKt.contains((java.lang.CharSequence) r13, (java.lang.CharSequence) r0, (boolean) r5)
            L_0x0086:
                if (r13 == 0) goto L_0x00ad
                kotlin.jvm.internal.Ref$ObjectRef r13 = r12.$lineText
                T r13 = r13.element
                java.lang.String r13 = (java.lang.String) r13
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                java.lang.String r0 = "total"
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r13 = kotlin.text.StringsKt.contains((java.lang.CharSequence) r13, (java.lang.CharSequence) r0, (boolean) r5)
                if (r13 != 0) goto L_0x00ad
                kotlin.jvm.internal.Ref$ObjectRef r13 = r12.$lineText
                T r13 = r13.element
                java.lang.String r13 = (java.lang.String) r13
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                java.lang.String r0 = "pos"
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r13 = kotlin.text.StringsKt.contains((java.lang.CharSequence) r13, (java.lang.CharSequence) r0, (boolean) r5)
                if (r13 != 0) goto L_0x00ad
                return r5
            L_0x00ad:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.ocr.receipt.parser.BillNumberParser.length.invoke(java.lang.String):boolean");
        }
    }

    private BillNumberParser() {
    }

    @Nullable
    public static String getMin(@NotNull FirebaseVisionText.Line line, @NotNull Rule rule, @NotNull List<? extends FirebaseVisionText.TextBlock> list) {
        Intrinsics.checkParameterIsNotNull(line, ShareAppKey.LINE);
        Intrinsics.checkParameterIsNotNull(rule, "rule");
        Intrinsics.checkParameterIsNotNull(list, "textBlocks");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        T text = line.getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "line.text");
        objectRef.element = text;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = line;
        return (String) SequencesKt.lastOrNull(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(rule.setMin), new length(objectRef)), new getMin(objectRef, line, list, objectRef2)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "pattern", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class getMin extends Lambda implements Function1<String, String> {
        final /* synthetic */ FirebaseVisionText.Line $line;
        final /* synthetic */ Ref.ObjectRef $lineText;
        final /* synthetic */ Ref.ObjectRef $lineToProcess;
        final /* synthetic */ List $textBlocks;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(Ref.ObjectRef objectRef, FirebaseVisionText.Line line, List list, Ref.ObjectRef objectRef2) {
            super(1);
            this.$lineText = objectRef;
            this.$line = line;
            this.$textBlocks = list;
            this.$lineToProcess = objectRef2;
        }

        @Nullable
        public final String invoke(@NotNull String str) {
            Intrinsics.checkParameterIsNotNull(str, "pattern");
            BillNumberParser billNumberParser = BillNumberParser.getMax;
            if (BillNumberParser.setMax((String) this.$lineText.element, str)) {
                return null;
            }
            BillNumberParser billNumberParser2 = BillNumberParser.getMax;
            if (!BillNumberParser.setMax.matcher((String) this.$lineText.element).find()) {
                T max = LineUtils.setMax(this.$line, this.$textBlocks);
                if (max != null) {
                    BillNumberParser billNumberParser3 = BillNumberParser.getMax;
                    if (BillNumberParser.setMax.matcher(max.getText()).find()) {
                        Ref.ObjectRef objectRef = this.$lineText;
                        T text = max.getText();
                        Intrinsics.checkExpressionValueIsNotNull(text, "overlapLine.text");
                        objectRef.element = text;
                        this.$lineToProcess.element = max;
                    }
                }
                return null;
            }
            Ref.ObjectRef objectRef2 = this.$lineText;
            BillNumberParser billNumberParser4 = BillNumberParser.getMax;
            objectRef2.element = BillNumberParser.setMax((FirebaseVisionText.Line) this.$lineToProcess.element, (String) this.$lineText.element, str);
            BillNumberParser billNumberParser5 = BillNumberParser.getMax;
            return BillNumberParser.setMax((String) this.$lineText.element);
        }
    }

    /* access modifiers changed from: private */
    public static boolean setMax(String str, String str2) {
        int indexOf = StringsKt.indexOf((CharSequence) str, str2, 0, true);
        return Intrinsics.areEqual((Object) str2, (Object) "#") && indexOf > 0 && !CharsKt.isWhitespace(str.charAt(indexOf - 1));
    }

    public static final /* synthetic */ String setMax(FirebaseVisionText.Line line, String str, String str2) {
        List<FirebaseVisionText.Element> elements = line.getElements();
        Intrinsics.checkExpressionValueIsNotNull(elements, "lineToProcess.elements");
        if (!(!elements.isEmpty())) {
            return StringsKt.replace(str, str2, "", true);
        }
        List<FirebaseVisionText.Element> elements2 = line.getElements();
        Intrinsics.checkExpressionValueIsNotNull(elements2, "lineToProcess.elements");
        Iterable<FirebaseVisionText.Element> iterable = elements2;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (FirebaseVisionText.Element element : iterable) {
            Intrinsics.checkExpressionValueIsNotNull(element, "it");
            arrayList.add(element.getText());
        }
        for (Object next : (List) arrayList) {
            String str3 = (String) next;
            if (setMax.matcher(str3).find()) {
                Intrinsics.checkExpressionValueIsNotNull(next, "lineToProcess.elements\n …MBER.matcher(it).find() }");
                return str3;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final /* synthetic */ String setMax(String str) {
        Object obj;
        boolean z;
        Object obj2;
        List split$default;
        String str2;
        boolean z2;
        Object obj3;
        List split$default2;
        String str3;
        boolean z3;
        Object obj4;
        List split$default3;
        String str4;
        boolean z4;
        CharSequence charSequence = str;
        if (StringsKt.contains$default(charSequence, (CharSequence) "#:", false, 2, (Object) null)) {
            List split$default4 = StringsKt.split$default(charSequence, new String[]{"#:"}, false, 0, 6, (Object) null);
            ListIterator listIterator = split$default4.listIterator(split$default4.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj4 = null;
                    break;
                }
                obj4 = listIterator.previous();
                if (((String) obj4).length() > 0) {
                    z4 = true;
                    continue;
                } else {
                    z4 = false;
                    continue;
                }
                if (z4) {
                    break;
                }
            }
            String str5 = (String) obj4;
            if (str5 != null) {
                if (str5 != null) {
                    String obj5 = StringsKt.trim((CharSequence) str5).toString();
                    if (!(obj5 == null || (split$default3 = StringsKt.split$default((CharSequence) obj5, new String[]{" "}, false, 0, 6, (Object) null)) == null || (str4 = (String) CollectionsKt.firstOrNull(split$default3)) == null)) {
                        if (str4 != null) {
                            return StringsKt.trim((CharSequence) str4).toString();
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return null;
        } else if (StringsKt.contains$default(charSequence, (CharSequence) "#", false, 2, (Object) null)) {
            List split$default5 = StringsKt.split$default(charSequence, new String[]{"#"}, false, 0, 6, (Object) null);
            ListIterator listIterator2 = split$default5.listIterator(split$default5.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    obj3 = null;
                    break;
                }
                obj3 = listIterator2.previous();
                if (((String) obj3).length() > 0) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    break;
                }
            }
            String str6 = (String) obj3;
            if (str6 != null) {
                if (str6 != null) {
                    String obj6 = StringsKt.trim((CharSequence) str6).toString();
                    if (!(obj6 == null || (split$default2 = StringsKt.split$default((CharSequence) obj6, new String[]{" "}, false, 0, 6, (Object) null)) == null || (str3 = (String) CollectionsKt.firstOrNull(split$default2)) == null)) {
                        if (str3 != null) {
                            return StringsKt.trim((CharSequence) str3).toString();
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return null;
        } else if (StringsKt.contains$default(charSequence, (CharSequence) ":", false, 2, (Object) null)) {
            List split$default6 = StringsKt.split$default(charSequence, new String[]{":"}, false, 0, 6, (Object) null);
            ListIterator listIterator3 = split$default6.listIterator(split$default6.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator3.previous();
                if (((String) obj2).length() > 0) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            String str7 = (String) obj2;
            if (str7 != null) {
                if (str7 != null) {
                    String obj7 = StringsKt.trim((CharSequence) str7).toString();
                    if (!(obj7 == null || (split$default = StringsKt.split$default((CharSequence) obj7, new String[]{" "}, false, 0, 6, (Object) null)) == null || (str2 = (String) CollectionsKt.firstOrNull(split$default)) == null)) {
                        if (str2 != null) {
                            return StringsKt.trim((CharSequence) str2).toString();
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return null;
        } else if (str != null) {
            Iterator it = StringsKt.split$default((CharSequence) StringsKt.trim(charSequence).toString(), new String[]{" "}, false, 0, 6, (Object) null).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((String) obj).length() > 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            String str8 = (String) obj;
            if (str8 == null) {
                return null;
            }
            if (str8 != null) {
                return StringsKt.trim((CharSequence) str8).toString();
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }
}
