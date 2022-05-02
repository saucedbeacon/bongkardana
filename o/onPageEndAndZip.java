package o;

import id.dana.ocr.model.SnapReceiptBroadcastData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import o.DeviceTokenClient;
import o.RDSClient;
import o.getWebSocketContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020X2\u00020\u00172\u00030\u00012\u00030Å\u0001:\u0006Ô\u0001Õ\u0001Ö\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ\u0019\u0010!\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b!\u0010\"J\u001f\u0010!\u001a\u00020\u00112\u000e\u0010 \u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H\u0016¢\u0006\u0004\b!\u0010%J\u0017\u0010&\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\r¢\u0006\u0004\b&\u0010\"J\u0019\u0010)\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010\"J\u000f\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b2\u0010\"J!\u00105\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b5\u00106J)\u0010;\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u0002072\u0006\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b=\u0010>J(\u0010C\u001a\u00020@2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010/2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\rH\b¢\u0006\u0004\bA\u0010BJ#\u0010D\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u0004\u0018\u0001082\u0006\u0010\u0014\u001a\u000203H\u0002¢\u0006\u0004\bF\u0010GJ\u0011\u0010H\u001a\u00060#j\u0002`$¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\u00060#j\u0002`$H\u0016¢\u0006\u0004\bJ\u0010IJ\u0011\u0010M\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bN\u0010OJ'\u0010P\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u0002072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u000203H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\rH\u0014¢\u0006\u0004\bU\u0010\"J\u0017\u0010W\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\rH\u0010¢\u0006\u0004\bV\u0010+J\u0019\u0010\\\u001a\u00020\u00112\b\u0010Y\u001a\u0004\u0018\u00010XH\u0000¢\u0006\u0004\bZ\u0010[JF\u0010e\u001a\u00020d2\u0006\u0010]\u001a\u00020\u00012\u0006\u0010^\u001a\u00020\u00012'\u0010c\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110_j\u0002`b¢\u0006\u0004\be\u0010fJ6\u0010e\u001a\u00020d2'\u0010c\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110_j\u0002`b¢\u0006\u0004\be\u0010gJ\u0013\u0010h\u001a\u00020\u0011H@ø\u0001\u0000¢\u0006\u0004\bh\u0010\u001dJ\u000f\u0010i\u001a\u00020\u0001H\u0002¢\u0006\u0004\bi\u0010jJ\u0013\u0010k\u001a\u00020\u0011H@ø\u0001\u0000¢\u0006\u0004\bk\u0010\u001dJ&\u0010n\u001a\u00020m2\u0014\u0010l\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110_H\b¢\u0006\u0004\bn\u0010oJ\u001b\u0010p\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bp\u0010-J\u0019\u0010r\u001a\u00020\u00012\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bq\u0010(J\u001b\u0010t\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bs\u0010-J@\u0010u\u001a\u00020\t2'\u0010c\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110_j\u0002`b2\u0006\u0010]\u001a\u00020\u0001H\u0002¢\u0006\u0004\bu\u0010vJ\u000f\u0010x\u001a\u00020/H\u0010¢\u0006\u0004\bw\u00101J\u001f\u0010y\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\by\u0010zJ.\u0010|\u001a\u00020\u0011\"\n\b\u0000\u0010{\u0018\u0001*\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\rH\b¢\u0006\u0004\b|\u0010zJ\u0019\u0010]\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b]\u0010+J\u0019\u0010}\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b}\u0010\u0016J\u0010\u0010\u0001\u001a\u00020\u0011H\u0010¢\u0006\u0004\b~\u0010J\u001a\u0010\u0001\u001a\u00020\u00112\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u00112\u0007\u0010\u0014\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0006\b\u0001\u0010\u0001JI\u0010\u0001\u001a\u00020\u0011\"\u0005\b\u0000\u0010\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010l\u001a\u0019\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050_ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001JX\u0010\u0001\u001a\u00020\u0011\"\u0004\b\u0000\u0010{\"\u0005\b\u0001\u0010\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u00012$\u0010l\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0006\b\u0001\u0010\u0001JX\u0010\u0001\u001a\u00020\u0011\"\u0004\b\u0000\u0010{\"\u0005\b\u0001\u0010\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u00012$\u0010l\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0001\u001a\u00020\u0001¢\u0006\u0005\b\u0001\u0010jJ\u001d\u0010\u0001\u001a\u00030\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020/2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020/H\u0007¢\u0006\u0005\b\u0001\u00101J\u0011\u0010\u0001\u001a\u00020/H\u0016¢\u0006\u0005\b\u0001\u00101J$\u0010 \u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J\"\u0010¢\u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J(\u0010¤\u0001\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J&\u0010¦\u0001\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u0002032\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001J-\u0010¨\u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002072\u0006\u0010\u0018\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0010¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0019\u0010«\u0001\u001a\u0004\u0018\u000108*\u00030ª\u0001H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001f\u0010­\u0001\u001a\u00020\u0011*\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0005\b­\u0001\u0010zJ&\u0010®\u0001\u001a\u00060#j\u0002`$*\u00020\r2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010/H\u0004¢\u0006\u0006\b®\u0001\u0010¯\u0001R\u001d\u0010³\u0001\u001a\t\u0012\u0004\u0012\u00020X0°\u00018F@\u0006¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u001a\u0010µ\u0001\u001a\u0004\u0018\u00010\r8D@\u0004X\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010OR\u0018\u0010·\u0001\u001a\u00020\u00018D@\u0004X\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010jR\u0018\u0010¹\u0001\u001a\u00020\u00018P@\u0010X\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010jR\u0018\u0010º\u0001\u001a\u00020\u00018V@\u0016X\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010jR\u0015\u0010»\u0001\u001a\u00020\u00018F@\u0006¢\u0006\u0007\u001a\u0005\b»\u0001\u0010jR\u0015\u0010¼\u0001\u001a\u00020\u00018F@\u0006¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010jR\u0015\u0010½\u0001\u001a\u00020\u00018F@\u0006¢\u0006\u0007\u001a\u0005\b½\u0001\u0010jR\u0018\u0010¾\u0001\u001a\u00020\u00018T@\u0014X\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010jR\u001b\u0010Â\u0001\u001a\u0007\u0012\u0002\b\u00030¿\u00018F@\u0006¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Ä\u0001\u001a\u00020\u00018P@\u0010X\u0004¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010jR\u0017\u0010È\u0001\u001a\u00030Å\u00018F@\u0006¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001R.\u0010Î\u0001\u001a\u0004\u0018\u00010\u00192\t\u0010É\u0001\u001a\u0004\u0018\u00010\u00198@@@X\u000e¢\u0006\u0010\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058@@\u0000X\u0004¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010LR \u0010Ñ\u0001\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u00058B@\u0002X\u0004¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010>R\u001d\u0010Ò\u0001\u001a\u00020\u0001*\u0002038B@\u0002X\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006×\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "", "active", "<init>", "(Z)V", "", "expect", "Lkotlinx/coroutines/NodeList;", "list", "Lkotlinx/coroutines/JobNode;", "node", "addLastAtomic", "(Ljava/lang/Object;Lkotlinx/coroutines/NodeList;Lkotlinx/coroutines/JobNode;)Z", "", "rootCause", "", "exceptions", "", "addSuppressedExceptions", "(Ljava/lang/Throwable;Ljava/util/List;)V", "state", "afterCompletion", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/ChildJob;", "child", "Lkotlinx/coroutines/ChildHandle;", "attachChild", "(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;", "awaitInternal$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitInternal", "awaitSuspend", "cause", "cancel", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelCoroutine", "cancelImpl$kotlinx_coroutines_core", "(Ljava/lang/Object;)Z", "cancelImpl", "cancelInternal", "(Ljava/lang/Throwable;)V", "cancelMakeCompleting", "(Ljava/lang/Object;)Ljava/lang/Object;", "cancelParent", "", "cancellationExceptionMessage", "()Ljava/lang/String;", "childCancelled", "Lkotlinx/coroutines/Incomplete;", "update", "completeStateFinalization", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)V", "Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/ChildHandleNode;", "lastChild", "proposedUpdate", "continueCompleting", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "createCauseException", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "message", "Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException$kotlinx_coroutines_core", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException", "finalizeFinishingState", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/lang/Object;)Ljava/lang/Object;", "firstChild", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/ChildHandleNode;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "getChildJobCancellationCause", "getCompletedInternal$kotlinx_coroutines_core", "()Ljava/lang/Object;", "getCompletedInternal", "getCompletionExceptionOrNull", "()Ljava/lang/Throwable;", "getFinalRootCause", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/util/List;)Ljava/lang/Throwable;", "getOrPromoteCancellingList", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/NodeList;", "exception", "handleJobException", "handleOnCompletionException$kotlinx_coroutines_core", "handleOnCompletionException", "Lkotlinx/coroutines/Job;", "parent", "initParentJobInternal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/Job;)V", "initParentJobInternal", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "join", "joinInternal", "()Z", "joinSuspend", "block", "", "loopOnState", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "makeCancelling", "makeCompleting$kotlinx_coroutines_core", "makeCompleting", "makeCompletingOnce$kotlinx_coroutines_core", "makeCompletingOnce", "makeNode", "(Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/JobNode;", "nameString$kotlinx_coroutines_core", "nameString", "notifyCancelling", "(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V", "T", "notifyHandlers", "onCompletionInternal", "onStartInternal$kotlinx_coroutines_core", "()V", "onStartInternal", "Lkotlinx/coroutines/ParentJob;", "parentJob", "parentCancelled", "(Lkotlinx/coroutines/ParentJob;)V", "Lkotlinx/coroutines/Empty;", "promoteEmptyToNodeList", "(Lkotlinx/coroutines/Empty;)V", "promoteSingleToNodeList", "(Lkotlinx/coroutines/JobNode;)V", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/coroutines/Continuation;", "registerSelectClause0", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "registerSelectClause1Internal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "registerSelectClause1Internal", "removeNode$kotlinx_coroutines_core", "removeNode", "selectAwaitCompletion$kotlinx_coroutines_core", "selectAwaitCompletion", "start", "", "startInternal", "(Ljava/lang/Object;)I", "stateString", "(Ljava/lang/Object;)Ljava/lang/String;", "toDebugString", "toString", "tryFinalizeSimpleState", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Z", "tryMakeCancelling", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Throwable;)Z", "tryMakeCompleting", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "tryMakeCompletingSlowPath", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Ljava/lang/Object;", "tryWaitForChild", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "nextChild", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/ChildHandleNode;", "notifyCompletion", "toCancellationException", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "getCompletionCause", "completionCause", "getCompletionCauseHandled", "completionCauseHandled", "getHandlesException$kotlinx_coroutines_core", "handlesException", "isActive", "isCancelled", "isCompleted", "isCompletedExceptionally", "isScopedCoroutine", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "getOnCancelComplete$kotlinx_coroutines_core", "onCancelComplete", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "onJoin", "value", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "parentHandle", "getState$kotlinx_coroutines_core", "getExceptionOrNull", "exceptionOrNull", "isCancelling", "(Lkotlinx/coroutines/Incomplete;)Z", "AwaitContinuation", "ChildCompletion", "Finishing", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
public class onPageEndAndZip implements getAA13, enableLog {
    static final /* synthetic */ AtomicReferenceFieldUpdater getMin = AtomicReferenceFieldUpdater.newUpdater(onPageEndAndZip.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    volatile /* synthetic */ Object _state;

    /* access modifiers changed from: protected */
    public boolean equals() {
        return false;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public String isInside() {
        return "Job was cancelled";
    }

    public void length() {
    }

    /* access modifiers changed from: protected */
    public void length(@Nullable Object obj) {
    }

    /* access modifiers changed from: protected */
    public boolean length(@NotNull Throwable th) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void setMax(@Nullable Object obj) {
    }

    public boolean w_() {
        return false;
    }

    public boolean x_() {
        return true;
    }

    public onPageEndAndZip(boolean z) {
        this._state = z ? onPage.isInside : onPage.IsOverlapping;
        this._parentHandle = null;
    }

    @NotNull
    public final CoroutineContext.Key<?> getKey() {
        return DictionaryKeys.getMax;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends getWebSocketContext.length {
        final /* synthetic */ Object getMin;
        final /* synthetic */ onPageEndAndZip length;
        final /* synthetic */ getWebSocketContext setMax;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMin(getWebSocketContext getwebsocketcontext, getWebSocketContext getwebsocketcontext2, onPageEndAndZip onpageendandzip, Object obj) {
            super(getwebsocketcontext2);
            this.setMax = getwebsocketcontext;
            this.length = onpageendandzip;
            this.getMin = obj;
        }

        public final /* synthetic */ Object setMin() {
            Object obj;
            onPageEndAndZip onpageendandzip = this.length;
            while (true) {
                obj = onpageendandzip._state;
                if (!(obj instanceof WebSocketContext)) {
                    break;
                }
                ((WebSocketContext) obj).setMax(onpageendandzip);
            }
            if (obj == this.getMin) {
                return null;
            }
            return cancelTimeoutScheduleFuture.setMax();
        }
    }

    @Nullable
    public final zipAndEncryptData Mean$Arithmetic() {
        return (zipAndEncryptData) this._parentHandle;
    }

    public final void getMax(@Nullable DictionaryKeys dictionaryKeys) {
        if (getApdidToken.setMax()) {
            if (!(((zipAndEncryptData) this._parentHandle) == null)) {
                throw new AssertionError();
            }
        }
        if (dictionaryKeys == null) {
            this._parentHandle = AbstractWrappedByteChannel.getMax;
            return;
        }
        dictionaryKeys.toDoubleRange();
        zipAndEncryptData max = dictionaryKeys.getMax(this);
        this._parentHandle = max;
        if (invokeSuspend()) {
            max.y_();
            this._parentHandle = AbstractWrappedByteChannel.getMax;
        }
    }

    private final Object setMax(getMax getmax, Object obj) {
        ArrayList arrayList;
        Throwable max;
        Object obj2;
        boolean z = false;
        if (getApdidToken.setMax()) {
            while (true) {
                obj2 = this._state;
                if (!(obj2 instanceof WebSocketContext)) {
                    break;
                }
                ((WebSocketContext) obj2).setMax(this);
            }
            if (!(obj2 == getmax)) {
                throw new AssertionError();
            }
        }
        if (getApdidToken.setMax() && !(!getmax.setMin())) {
            throw new AssertionError();
        } else if (!getApdidToken.setMax() || getmax.setMax()) {
            Throwable th = null;
            APExpansion aPExpansion = (APExpansion) (!(obj instanceof APExpansion) ? null : obj);
            if (aPExpansion != null) {
                th = aPExpansion.setMax;
            }
            synchronized (getmax) {
                getmax.getMin();
                Object obj3 = getmax._exceptionsHolder;
                if (obj3 == null) {
                    arrayList = new ArrayList(4);
                } else if (obj3 instanceof Throwable) {
                    ArrayList arrayList2 = new ArrayList(4);
                    arrayList2.add(obj3);
                    arrayList = arrayList2;
                } else if (obj3 instanceof ArrayList) {
                    arrayList = (ArrayList) obj3;
                } else {
                    throw new IllegalStateException("State is ".concat(String.valueOf(obj3)).toString());
                }
                Throwable th2 = (Throwable) getmax._rootCause;
                if (th2 != null) {
                    arrayList.add(0, th2);
                }
                if (th != null && (!Intrinsics.areEqual((Object) th, (Object) th2))) {
                    arrayList.add(th);
                }
                getmax._exceptionsHolder = onPage.length;
                List list = arrayList;
                max = getMax(getmax, (List<? extends Throwable>) list);
                if (max != null) {
                    getMin(max, (List<? extends Throwable>) list);
                }
            }
            if (!(max == null || max == th)) {
                obj = new APExpansion(max);
            }
            if (max != null) {
                if (equals(max) || length(max)) {
                    z = true;
                }
                if (z) {
                    if (obj != null) {
                        ((APExpansion) obj).getMin();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    }
                }
            }
            length(obj);
            boolean compareAndSet = getMin.compareAndSet(this, getmax, onPage.length(obj));
            if (!getApdidToken.setMax() || compareAndSet) {
                getMin((DeviceDataReportService) getmax, obj);
                return obj;
            }
            throw new AssertionError();
        } else {
            throw new AssertionError();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Throwable getMax(o.onPageEndAndZip.getMax r6, java.util.List<? extends java.lang.Throwable> r7) {
        /*
            r5 = this;
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x001d
            boolean r6 = r6.getMin()
            if (r6 == 0) goto L_0x001c
            kotlinx.coroutines.JobCancellationException r6 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r7 = r5.isInside()
            r0 = r5
            o.DictionaryKeys r0 = (o.DictionaryKeys) r0
            r6.<init>(r7, r1, r0)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            return r6
        L_0x001c:
            return r1
        L_0x001d:
            r6 = r7
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r0 = r6.iterator()
        L_0x0024:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto L_0x0038
            java.lang.Object r2 = r0.next()
            r4 = r2
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r4 = r4 instanceof java.util.concurrent.CancellationException
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x0024
            goto L_0x0039
        L_0x0038:
            r2 = r1
        L_0x0039:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L_0x003e
            return r2
        L_0x003e:
            r0 = 0
            java.lang.Object r7 = r7.get(r0)
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            boolean r2 = r7 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r2 == 0) goto L_0x006b
            java.util.Iterator r6 = r6.iterator()
        L_0x004d:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0066
            java.lang.Object r2 = r6.next()
            r4 = r2
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == r7) goto L_0x0062
            boolean r4 = r4 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r4 == 0) goto L_0x0062
            r4 = 1
            goto L_0x0063
        L_0x0062:
            r4 = 0
        L_0x0063:
            if (r4 == 0) goto L_0x004d
            r1 = r2
        L_0x0066:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x006b
            return r1
        L_0x006b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onPageEndAndZip.getMax(o.onPageEndAndZip$getMax, java.util.List):java.lang.Throwable");
    }

    private static void getMin(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Throwable min = !getApdidToken.length() ? th : WebSocketCallbackAdapter.setMin(th);
            for (Throwable th2 : list) {
                if (getApdidToken.length()) {
                    th2 = WebSocketCallbackAdapter.setMin(th2);
                }
                if (th2 != th && th2 != min && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    ExceptionsKt.addSuppressed(th, th2);
                }
            }
        }
    }

    private final boolean length(DeviceDataReportService deviceDataReportService, Object obj) {
        if (getApdidToken.setMax()) {
            if (!((deviceDataReportService instanceof intiToken) || (deviceDataReportService instanceof onControlClick))) {
                throw new AssertionError();
            }
        }
        if (getApdidToken.setMax() && !(!(obj instanceof APExpansion))) {
            throw new AssertionError();
        } else if (!getMin.compareAndSet(this, deviceDataReportService, onPage.length(obj))) {
            return false;
        } else {
            length(obj);
            getMin(deviceDataReportService, obj);
            return true;
        }
    }

    private final boolean equals(Throwable th) {
        if (equals()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        zipAndEncryptData zipandencryptdata = (zipAndEncryptData) this._parentHandle;
        if (zipandencryptdata == null || zipandencryptdata == AbstractWrappedByteChannel.getMax) {
            return z;
        }
        if (zipandencryptdata.getMin(th) || z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    @NotNull
    public CancellationException getMax(@NotNull Throwable th, @Nullable String str) {
        CancellationException cancellationException = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (cancellationException != null) {
            return cancellationException;
        }
        if (str == null) {
            str = isInside();
        }
        return new JobCancellationException(str, th, this);
    }

    private final boolean getMin(Object obj, RDSClient.AnonymousClass1 r4, onControlClick oncontrolclick) {
        int min;
        getWebSocketContext getwebsocketcontext = r4;
        getWebSocketContext getwebsocketcontext2 = oncontrolclick;
        getWebSocketContext.length getmin = new getMin(getwebsocketcontext2, getwebsocketcontext2, this, obj);
        do {
            getWebSocketContext values = getwebsocketcontext.values();
            if (values == null) {
                values = getWebSocketContext.setMin((getWebSocketContext) getwebsocketcontext._prev);
            }
            min = values.setMin(getwebsocketcontext2, getwebsocketcontext, getmin);
            if (min == 1) {
                return true;
            }
        } while (min != 2);
        return false;
    }

    public void setMax(@NotNull Throwable th) {
        getMax((Object) th);
    }

    public final void getMax(@NotNull enableLog enablelog) {
        getMax((Object) enablelog);
    }

    public boolean setMin(@NotNull Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!getMax((Object) th) || !x_()) {
            return false;
        }
        return true;
    }

    public final boolean getMin(@Nullable Throwable th) {
        return getMax((Object) th);
    }

    public final boolean getMax(@Nullable Object obj) {
        Object min = onPage.setMax;
        if (w_()) {
            while (true) {
                Object obj2 = this._state;
                if (obj2 instanceof WebSocketContext) {
                    ((WebSocketContext) obj2).setMax(this);
                } else if (!(obj2 instanceof DeviceDataReportService) || ((obj2 instanceof getMax) && ((getMax) obj2).setMax())) {
                    min = onPage.setMax;
                } else {
                    min = getMin(obj2, (Object) new APExpansion(getMin(obj)));
                    if (min != onPage.getMin) {
                        break;
                    }
                }
            }
            if (min == onPage.getMax) {
                return true;
            }
        }
        if (min == onPage.setMax) {
            min = IsOverlapping(obj);
        }
        if (min == onPage.setMax || min == onPage.getMax) {
            return true;
        }
        if (min == onPage.setMin) {
            return false;
        }
        setMax(min);
        return true;
    }

    private final Throwable getMin(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof Throwable;
        } else {
            z = true;
        }
        if (z) {
            if (obj != null) {
                return (Throwable) obj;
            }
            return new JobCancellationException(isInside(), (Throwable) null, this);
        } else if (obj != null) {
            return ((enableLog) obj).Grayscale$Algorithm();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    private final RDSClient.AnonymousClass1 setMax(DeviceDataReportService deviceDataReportService) {
        RDSClient.AnonymousClass1 max = deviceDataReportService.getMax();
        if (max != null) {
            return max;
        }
        if (deviceDataReportService instanceof intiToken) {
            return new DeviceDataReportService() {
                @NotNull
                public final AnonymousClass1 getMax() {
                    return this;
                }

                public final boolean length() {
                    return true;
                }

                @NotNull
                public final String setMax(@NotNull String str) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("List{");
                    sb.append(str);
                    sb.append("}[");
                    onFragment onfragment = this;
                    Object floatRange = onfragment.toFloatRange();
                    if (floatRange != null) {
                        boolean z = true;
                        for (getWebSocketContext getwebsocketcontext = (getWebSocketContext) floatRange; !Intrinsics.areEqual((Object) getwebsocketcontext, (Object) onfragment); getwebsocketcontext = getwebsocketcontext.isInside()) {
                            if (getwebsocketcontext instanceof onControlClick) {
                                onControlClick oncontrolclick = (onControlClick) getwebsocketcontext;
                                if (z) {
                                    z = false;
                                } else {
                                    sb.append(", ");
                                }
                                sb.append(oncontrolclick);
                            }
                        }
                        sb.append("]");
                        String obj = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(obj, "StringBuilder().apply(builderAction).toString()");
                        return obj;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                }

                @NotNull
                public final String toString() {
                    return getApdidToken.getMax() ? setMax("Active") : super.toString();
                }
            };
        }
        if (deviceDataReportService instanceof onControlClick) {
            onControlClick oncontrolclick = (onControlClick) deviceDataReportService;
            oncontrolclick.getMax(new DeviceDataReportService() {
                @NotNull
                public final AnonymousClass1 getMax() {
                    return this;
                }

                public final boolean length() {
                    return true;
                }

                @NotNull
                public final String setMax(@NotNull String str) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("List{");
                    sb.append(str);
                    sb.append("}[");
                    onFragment onfragment = this;
                    Object floatRange = onfragment.toFloatRange();
                    if (floatRange != null) {
                        boolean z = true;
                        for (getWebSocketContext getwebsocketcontext = (getWebSocketContext) floatRange; !Intrinsics.areEqual((Object) getwebsocketcontext, (Object) onfragment); getwebsocketcontext = getwebsocketcontext.isInside()) {
                            if (getwebsocketcontext instanceof onControlClick) {
                                onControlClick oncontrolclick = (onControlClick) getwebsocketcontext;
                                if (z) {
                                    z = false;
                                } else {
                                    sb.append(", ");
                                }
                                sb.append(oncontrolclick);
                            }
                        }
                        sb.append("]");
                        String obj = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(obj, "StringBuilder().apply(builderAction).toString()");
                        return obj;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                }

                @NotNull
                public final String toString() {
                    return getApdidToken.getMax() ? setMax("Active") : super.toString();
                }
            });
            while (true) {
                Object obj = oncontrolclick._next;
                if (!(obj instanceof WebSocketContext)) {
                    getMin.compareAndSet(this, oncontrolclick, cancelTimeoutScheduleFuture.setMax(obj));
                    return null;
                }
                ((WebSocketContext) obj).setMax(oncontrolclick);
            }
        } else {
            throw new IllegalStateException("State should have list: ".concat(String.valueOf(deviceDataReportService)).toString());
        }
    }

    private final boolean setMax(DeviceDataReportService deviceDataReportService, Throwable th) {
        if (getApdidToken.setMax() && !(!(deviceDataReportService instanceof getMax))) {
            throw new AssertionError();
        } else if (!getApdidToken.setMax() || deviceDataReportService.length()) {
            RDSClient.AnonymousClass1 max = setMax(deviceDataReportService);
            if (max == null) {
                return false;
            }
            if (!getMin.compareAndSet(this, deviceDataReportService, new getMax(max, th))) {
                return false;
            }
            length(max, th);
            return true;
        } else {
            throw new AssertionError();
        }
    }

    private final Object getMin(Object obj, Object obj2) {
        if (!(obj instanceof DeviceDataReportService)) {
            return onPage.setMax;
        }
        if ((!(obj instanceof intiToken) && !(obj instanceof onControlClick)) || (obj instanceof getAD104) || (obj2 instanceof APExpansion)) {
            return getMax((DeviceDataReportService) obj, obj2);
        }
        if (length((DeviceDataReportService) obj, obj2)) {
            return obj2;
        }
        return onPage.getMin;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0072, code lost:
        if (r5 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0074, code lost:
        length(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0079, code lost:
        if ((r7 instanceof o.getAD104) != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x007b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x007d, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x007e, code lost:
        r0 = (o.getAD104) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0080, code lost:
        if (r0 != null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0082, code lost:
        r7 = r7.getMax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0086, code lost:
        if (r7 == null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0088, code lost:
        r2 = setMax((o.getWebSocketContext) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x008f, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0090, code lost:
        if (r2 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0096, code lost:
        if (setMax(r1, r2, r8) == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x009a, code lost:
        return o.onPage.getMax;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x009f, code lost:
        return setMax(r1, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object getMax(o.DeviceDataReportService r7, java.lang.Object r8) {
        /*
            r6 = this;
            o.RDSClient$1 r0 = r6.setMax((o.DeviceDataReportService) r7)
            if (r0 != 0) goto L_0x000b
            o.closeBlocking r7 = o.onPage.getMin
            return r7
        L_0x000b:
            boolean r1 = r7 instanceof o.onPageEndAndZip.getMax
            r2 = 0
            if (r1 != 0) goto L_0x0012
            r1 = r2
            goto L_0x0013
        L_0x0012:
            r1 = r7
        L_0x0013:
            o.onPageEndAndZip$getMax r1 = (o.onPageEndAndZip.getMax) r1
            if (r1 != 0) goto L_0x001c
            o.onPageEndAndZip$getMax r1 = new o.onPageEndAndZip$getMax
            r1.<init>(r0, r2)
        L_0x001c:
            monitor-enter(r1)
            boolean r3 = r1.setMax()     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x0029
            o.closeBlocking r7 = o.onPage.setMax     // Catch:{ all -> 0x00a0 }
            monitor-exit(r1)
            return r7
        L_0x0029:
            r3 = 1
            r1._isCompleting = r3     // Catch:{ all -> 0x00a0 }
            if (r1 == r7) goto L_0x003c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = getMin     // Catch:{ all -> 0x00a0 }
            boolean r4 = r4.compareAndSet(r6, r7, r1)     // Catch:{ all -> 0x00a0 }
            if (r4 != 0) goto L_0x003c
            o.closeBlocking r7 = o.onPage.getMin     // Catch:{ all -> 0x00a0 }
            monitor-exit(r1)
            return r7
        L_0x003c:
            boolean r4 = o.getApdidToken.setMax()     // Catch:{ all -> 0x00a0 }
            if (r4 == 0) goto L_0x0052
            boolean r4 = r1.setMin()     // Catch:{ all -> 0x00a0 }
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x004a
            goto L_0x0052
        L_0x004a:
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch:{ all -> 0x00a0 }
            r7.<init>()     // Catch:{ all -> 0x00a0 }
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch:{ all -> 0x00a0 }
            throw r7     // Catch:{ all -> 0x00a0 }
        L_0x0052:
            boolean r4 = r1.getMin()     // Catch:{ all -> 0x00a0 }
            boolean r5 = r8 instanceof o.APExpansion     // Catch:{ all -> 0x00a0 }
            if (r5 != 0) goto L_0x005c
            r5 = r2
            goto L_0x005d
        L_0x005c:
            r5 = r8
        L_0x005d:
            o.APExpansion r5 = (o.APExpansion) r5     // Catch:{ all -> 0x00a0 }
            if (r5 == 0) goto L_0x0066
            java.lang.Throwable r5 = r5.setMax     // Catch:{ all -> 0x00a0 }
            r1.setMin(r5)     // Catch:{ all -> 0x00a0 }
        L_0x0066:
            java.lang.Object r5 = r1._rootCause     // Catch:{ all -> 0x00a0 }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x00a0 }
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r5 = r2
        L_0x006f:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00a0 }
            monitor-exit(r1)
            if (r5 == 0) goto L_0x0077
            r6.length((o.RDSClient.AnonymousClass1) r0, (java.lang.Throwable) r5)
        L_0x0077:
            boolean r0 = r7 instanceof o.getAD104
            if (r0 != 0) goto L_0x007d
            r0 = r2
            goto L_0x007e
        L_0x007d:
            r0 = r7
        L_0x007e:
            o.getAD104 r0 = (o.getAD104) r0
            if (r0 != 0) goto L_0x008f
            o.RDSClient$1 r7 = r7.getMax()
            if (r7 == 0) goto L_0x0090
            o.getWebSocketContext r7 = (o.getWebSocketContext) r7
            o.getAD104 r2 = setMax((o.getWebSocketContext) r7)
            goto L_0x0090
        L_0x008f:
            r2 = r0
        L_0x0090:
            if (r2 == 0) goto L_0x009b
            boolean r7 = r6.setMax(r1, r2, r8)
            if (r7 == 0) goto L_0x009b
            o.closeBlocking r7 = o.onPage.getMax
            return r7
        L_0x009b:
            java.lang.Object r7 = r6.setMax((o.onPageEndAndZip.getMax) r1, (java.lang.Object) r8)
            return r7
        L_0x00a0:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onPageEndAndZip.getMax(o.DeviceDataReportService, java.lang.Object):java.lang.Object");
    }

    private final boolean setMax(getMax getmax, getAD104 getad104, Object obj) {
        while (getad104.setMax.getMax(false, false, new setMax(this, getmax, getad104, obj)) == AbstractWrappedByteChannel.getMax) {
            getad104 = setMax((getWebSocketContext) getad104);
            if (getad104 == null) {
                return false;
            }
        }
        return true;
    }

    private static getAD104 setMax(getWebSocketContext getwebsocketcontext) {
        while (getwebsocketcontext.z_()) {
            getWebSocketContext values = getwebsocketcontext.values();
            getwebsocketcontext = values == null ? getWebSocketContext.setMin((getWebSocketContext) getwebsocketcontext._prev) : values;
        }
        while (true) {
            Object obj = getwebsocketcontext._next;
            if (!(obj instanceof WebSocketContext)) {
                getwebsocketcontext = cancelTimeoutScheduleFuture.setMax(obj);
                if (getwebsocketcontext.z_()) {
                    continue;
                } else if (getwebsocketcontext instanceof getAD104) {
                    return (getAD104) getwebsocketcontext;
                } else {
                    if (getwebsocketcontext instanceof RDSClient.AnonymousClass1) {
                        return null;
                    }
                }
            } else {
                ((WebSocketContext) obj).setMax(getwebsocketcontext);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lkotlinx/coroutines/ChildJob;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {952, 954}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class length extends RestrictedSuspendLambda implements Function2<SequenceScope<? super getAA13>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ onPageEndAndZip this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(onPageEndAndZip onpageendandzip, Continuation continuation) {
            super(2, continuation);
            this.this$0 = onpageendandzip;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            length length = new length(this.this$0, continuation);
            length.L$0 = obj;
            return length;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((length) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002d
                if (r1 == r3) goto L_0x0028
                if (r1 != r2) goto L_0x0020
                java.lang.Object r1 = r8.L$2
                o.getWebSocketContext r1 = (o.getWebSocketContext) r1
                java.lang.Object r4 = r8.L$1
                o.onFragment r4 = (o.onFragment) r4
                java.lang.Object r5 = r8.L$0
                kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
                kotlin.ResultKt.throwOnFailure(r9)
                r9 = r8
                goto L_0x0089
            L_0x0020:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x0028:
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x009c
            L_0x002d:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object r9 = r8.L$0
                kotlin.sequences.SequenceScope r9 = (kotlin.sequences.SequenceScope) r9
                o.onPageEndAndZip r1 = r8.this$0
            L_0x0036:
                java.lang.Object r4 = r1._state
                boolean r5 = r4 instanceof o.WebSocketContext
                if (r5 != 0) goto L_0x009f
                boolean r1 = r4 instanceof o.getAD104
                if (r1 == 0) goto L_0x004d
                o.getAD104 r4 = (o.getAD104) r4
                o.getAA13 r1 = r4.setMax
                r8.label = r3
                java.lang.Object r9 = r9.yield(r1, r8)
                if (r9 != r0) goto L_0x009c
                return r0
            L_0x004d:
                boolean r1 = r4 instanceof o.DeviceDataReportService
                if (r1 == 0) goto L_0x009c
                o.DeviceDataReportService r4 = (o.DeviceDataReportService) r4
                o.RDSClient$1 r1 = r4.getMax()
                if (r1 == 0) goto L_0x009c
                o.onFragment r1 = (o.onFragment) r1
            L_0x005b:
                java.lang.Object r4 = r1._next
                boolean r5 = r4 instanceof o.WebSocketContext
                if (r5 != 0) goto L_0x0096
                if (r4 == 0) goto L_0x008e
                o.getWebSocketContext r4 = (o.getWebSocketContext) r4
                r5 = r9
                r9 = r8
                r7 = r4
                r4 = r1
                r1 = r7
            L_0x006a:
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)
                r6 = r6 ^ r3
                if (r6 == 0) goto L_0x009c
                boolean r6 = r1 instanceof o.getAD104
                if (r6 == 0) goto L_0x0089
                r6 = r1
                o.getAD104 r6 = (o.getAD104) r6
                o.getAA13 r6 = r6.setMax
                r9.L$0 = r5
                r9.L$1 = r4
                r9.L$2 = r1
                r9.label = r2
                java.lang.Object r6 = r5.yield(r6, r9)
                if (r6 != r0) goto L_0x0089
                return r0
            L_0x0089:
                o.getWebSocketContext r1 = r1.isInside()
                goto L_0x006a
            L_0x008e:
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
                r9.<init>(r0)
                throw r9
            L_0x0096:
                o.WebSocketContext r4 = (o.WebSocketContext) r4
                r4.setMax(r1)
                goto L_0x005b
            L_0x009c:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            L_0x009f:
                o.WebSocketContext r4 = (o.WebSocketContext) r4
                r4.setMax(r1)
                goto L_0x0036
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onPageEndAndZip.length.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @NotNull
    public final Sequence<DictionaryKeys> values() {
        return SequencesKt.sequence(new length(this, (Continuation) null));
    }

    @NotNull
    public final zipAndEncryptData getMax(@NotNull getAA13 getaa13) {
        DeviceTokenClient.AnonymousClass1 max = getMax(true, true, new getAD104(getaa13));
        if (max != null) {
            return (zipAndEncryptData) max;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }

    public void a_(@NotNull Throwable th) {
        throw th;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(IsOverlapping());
        sb2.append('{');
        sb2.append(toIntRange(valueOf()));
        sb2.append('}');
        sb.append(sb2.toString());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    private static String toIntRange(Object obj) {
        if (obj instanceof getMax) {
            getMax getmax = (getMax) obj;
            if (getmax.getMin()) {
                return "Cancelling";
            }
            if (getmax.setMax()) {
                return "Completing";
            }
            return "Active";
        } else if (!(obj instanceof DeviceDataReportService)) {
            return obj instanceof APExpansion ? "Cancelled" : SnapReceiptBroadcastData.Status.Completed;
        } else {
            if (((DeviceDataReportService) obj).length()) {
                return "Active";
            }
            return "New";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00060\u0018j\u0002`,2\u00020-B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\rj\b\u0012\u0004\u0012\u00020\u0005`\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188B@BX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00038V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b!\u0010 R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00038F@FX\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010 \"\u0004\b\"\u0010#R\u0013\u0010$\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b$\u0010 R\u001c\u0010\u0002\u001a\u00020\u00018\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0002\u0010%\u001a\u0004\b&\u0010'R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00058F@FX\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\f¨\u0006+"}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/NodeList;", "list", "", "isCompleting", "", "rootCause", "<init>", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "exception", "", "addExceptionLocked", "(Ljava/lang/Throwable;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "allocateList", "()Ljava/util/ArrayList;", "proposedException", "", "sealLocked", "(Ljava/lang/Throwable;)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "", "value", "getExceptionsHolder", "()Ljava/lang/Object;", "setExceptionsHolder", "(Ljava/lang/Object;)V", "exceptionsHolder", "isActive", "()Z", "isCancelling", "setCompleting", "(Z)V", "isSealed", "Lkotlinx/coroutines/NodeList;", "getList", "()Lkotlinx/coroutines/NodeList;", "getRootCause", "()Ljava/lang/Throwable;", "setRootCause", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;"}, k = 1, mv = {1, 4, 2})
    static final class getMax implements DeviceDataReportService {
        volatile /* synthetic */ Object _exceptionsHolder;
        volatile /* synthetic */ int _isCompleting = 0;
        volatile /* synthetic */ Object _rootCause;
        @NotNull
        final RDSClient.AnonymousClass1 setMax;

        @NotNull
        public final RDSClient.AnonymousClass1 getMax() {
            return this.setMax;
        }

        public getMax(@NotNull RDSClient.AnonymousClass1 r1, @Nullable Throwable th) {
            this.setMax = r1;
            this._rootCause = th;
            this._exceptionsHolder = null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        public final boolean setMax() {
            return this._isCompleting;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Finishing[cancelling=");
            sb.append(getMin());
            sb.append(", completing=");
            sb.append(setMax());
            sb.append(", rootCause=");
            sb.append((Throwable) this._rootCause);
            sb.append(", exceptions=");
            sb.append(this._exceptionsHolder);
            sb.append(", list=");
            sb.append(this.setMax);
            sb.append(']');
            return sb.toString();
        }

        public final boolean setMin() {
            return this._exceptionsHolder == onPage.length;
        }

        public final boolean getMin() {
            return ((Throwable) this._rootCause) != null;
        }

        public final boolean length() {
            return ((Throwable) this._rootCause) == null;
        }

        public final void setMin(@NotNull Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList arrayList = new ArrayList(4);
                        arrayList.add(obj);
                        arrayList.add(th);
                        Unit unit = Unit.INSTANCE;
                        this._exceptionsHolder = arrayList;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException("State is ".concat(String.valueOf(obj)).toString());
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "parent", "Lkotlinx/coroutines/JobSupport;", "state", "Lkotlinx/coroutines/JobSupport$Finishing;", "child", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    static final class setMax extends onControlClick {
        private final getMax getMax;
        private final getAD104 getMin;
        private final Object setMax;
        private final onPageEndAndZip setMin;

        public setMax(@NotNull onPageEndAndZip onpageendandzip, @NotNull getMax getmax, @NotNull getAD104 getad104, @Nullable Object obj) {
            this.setMin = onpageendandzip;
            this.getMax = getmax;
            this.getMin = getad104;
            this.setMax = obj;
        }

        public final void setMin(@Nullable Throwable th) {
            onPageEndAndZip.setMin(this.setMin, this.getMax, this.getMin, this.setMax);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onPageEndAndZip.setMin(this.setMin, this.getMax, this.getMin, this.setMax);
            return Unit.INSTANCE;
        }
    }

    @Nullable
    public final Object valueOf() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof WebSocketContext)) {
                return obj;
            }
            ((WebSocketContext) obj).setMax(this);
        }
    }

    private final void length(RDSClient.AnonymousClass1 r8, Throwable th) {
        Object obj;
        onFragment onfragment = r8;
        while (true) {
            obj = onfragment._next;
            if (!(obj instanceof WebSocketContext)) {
                break;
            }
            ((WebSocketContext) obj).setMax(onfragment);
        }
        if (obj != null) {
            Throwable th2 = null;
            for (getWebSocketContext getwebsocketcontext = (getWebSocketContext) obj; !Intrinsics.areEqual((Object) getwebsocketcontext, (Object) onfragment); getwebsocketcontext = getwebsocketcontext.isInside()) {
                if (getwebsocketcontext instanceof getHeader) {
                    onControlClick oncontrolclick = (onControlClick) getwebsocketcontext;
                    try {
                        oncontrolclick.setMin(th);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            ExceptionsKt.addSuppressed(th2, th3);
                            if (th2 != null) {
                            }
                        }
                        StringBuilder sb = new StringBuilder("Exception in completion handler ");
                        sb.append(oncontrolclick);
                        sb.append(" for ");
                        sb.append(this);
                        th2 = new CompletionHandlerException(sb.toString(), th3);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
            if (th2 != null) {
                a_(th2);
            }
            equals(th);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    private final void getMax(RDSClient.AnonymousClass1 r8, Throwable th) {
        Object obj;
        onFragment onfragment = r8;
        while (true) {
            obj = onfragment._next;
            if (!(obj instanceof WebSocketContext)) {
                break;
            }
            ((WebSocketContext) obj).setMax(onfragment);
        }
        if (obj != null) {
            Throwable th2 = null;
            for (getWebSocketContext getwebsocketcontext = (getWebSocketContext) obj; !Intrinsics.areEqual((Object) getwebsocketcontext, (Object) onfragment); getwebsocketcontext = getwebsocketcontext.isInside()) {
                if (getwebsocketcontext instanceof onControlClick) {
                    onControlClick oncontrolclick = (onControlClick) getwebsocketcontext;
                    try {
                        oncontrolclick.setMin(th);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            ExceptionsKt.addSuppressed(th2, th3);
                            if (th2 != null) {
                            }
                        }
                        StringBuilder sb = new StringBuilder("Exception in completion handler ");
                        sb.append(oncontrolclick);
                        sb.append(" for ");
                        sb.append(this);
                        th2 = new CompletionHandlerException(sb.toString(), th3);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
            if (th2 != null) {
                a_(th2);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    public void getMin(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(isInside(), (Throwable) null, this);
        }
        setMax((Throwable) cancellationException);
    }

    public boolean B_() {
        Object obj;
        while (true) {
            obj = this._state;
            if (!(obj instanceof WebSocketContext)) {
                break;
            }
            ((WebSocketContext) obj).setMax(this);
        }
        return (obj instanceof DeviceDataReportService) && ((DeviceDataReportService) obj).length();
    }

    public final boolean invokeSuspend() {
        Object obj;
        while (true) {
            obj = this._state;
            if (!(obj instanceof WebSocketContext)) {
                break;
            }
            ((WebSocketContext) obj).setMax(this);
        }
        return !(obj instanceof DeviceDataReportService);
    }

    public final boolean toIntRange() {
        Object obj;
        while (true) {
            obj = this._state;
            if (!(obj instanceof WebSocketContext)) {
                break;
            }
            ((WebSocketContext) obj).setMax(this);
        }
        if (!(obj instanceof APExpansion)) {
            return (obj instanceof getMax) && ((getMax) obj).getMin();
        }
        return true;
    }

    private final void getMin(DeviceDataReportService deviceDataReportService, Object obj) {
        zipAndEncryptData zipandencryptdata = (zipAndEncryptData) this._parentHandle;
        if (zipandencryptdata != null) {
            zipandencryptdata.y_();
            this._parentHandle = AbstractWrappedByteChannel.getMax;
        }
        Throwable th = null;
        if (!(obj instanceof APExpansion)) {
            obj = null;
        }
        APExpansion aPExpansion = (APExpansion) obj;
        if (aPExpansion != null) {
            th = aPExpansion.setMax;
        }
        if (deviceDataReportService instanceof onControlClick) {
            try {
                ((onControlClick) deviceDataReportService).setMin(th);
            } catch (Throwable th2) {
                StringBuilder sb = new StringBuilder("Exception in completion handler ");
                sb.append(deviceDataReportService);
                sb.append(" for ");
                sb.append(this);
                a_((Throwable) new CompletionHandlerException(sb.toString(), th2));
            }
        } else {
            RDSClient.AnonymousClass1 max = deviceDataReportService.getMax();
            if (max != null) {
                getMax(max, th);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean toDoubleRange() {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r0 = r6._state
            boolean r1 = r0 instanceof o.WebSocketContext
            if (r1 != 0) goto L_0x0046
            boolean r1 = r0 instanceof o.intiToken
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0027
            r1 = r0
            o.intiToken r1 = (o.intiToken) r1
            boolean r1 = r1.length()
            if (r1 != 0) goto L_0x003e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = getMin
            o.intiToken r5 = o.onPage.isInside
            boolean r0 = r1.compareAndSet(r6, r0, r5)
            if (r0 != 0) goto L_0x0023
            goto L_0x003f
        L_0x0023:
            r6.length()
            goto L_0x003c
        L_0x0027:
            boolean r1 = r0 instanceof o.logCollect
            if (r1 == 0) goto L_0x003e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = getMin
            r5 = r0
            o.logCollect r5 = (o.logCollect) r5
            o.RDSClient$1 r5 = r5.setMax
            boolean r0 = r1.compareAndSet(r6, r0, r5)
            if (r0 != 0) goto L_0x0039
            goto L_0x003f
        L_0x0039:
            r6.length()
        L_0x003c:
            r2 = 1
            goto L_0x003f
        L_0x003e:
            r2 = 0
        L_0x003f:
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0044
            goto L_0x0000
        L_0x0044:
            return r4
        L_0x0045:
            return r3
        L_0x0046:
            o.WebSocketContext r0 = (o.WebSocketContext) r0
            r0.setMax(r6)
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onPageEndAndZip.toDoubleRange():boolean");
    }

    @NotNull
    public final CancellationException C_() {
        Object obj;
        while (true) {
            obj = this._state;
            if (!(obj instanceof WebSocketContext)) {
                break;
            }
            ((WebSocketContext) obj).setMax(this);
        }
        if (obj instanceof getMax) {
            Throwable th = (Throwable) ((getMax) obj)._rootCause;
            if (th != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(getClass().getSimpleName());
                sb.append(" is cancelling");
                CancellationException max = getMax(th, sb.toString());
                if (max != null) {
                    return max;
                }
            }
            throw new IllegalStateException("Job is still new or active: ".concat(String.valueOf(this)).toString());
        } else if (obj instanceof DeviceDataReportService) {
            throw new IllegalStateException("Job is still new or active: ".concat(String.valueOf(this)).toString());
        } else if (obj instanceof APExpansion) {
            return getMax(((APExpansion) obj).setMax, (String) null);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" has completed normally");
            return new JobCancellationException(sb2.toString(), (Throwable) null, this);
        }
    }

    /* JADX WARNING: type inference failed for: r4v11, types: [o.logCollect] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.DeviceTokenClient.AnonymousClass1 getMax(boolean r8, boolean r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r10) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x0018
            boolean r1 = r10 instanceof o.getHeader
            if (r1 != 0) goto L_0x0009
            r1 = r0
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            o.getHeader r1 = (o.getHeader) r1
            if (r1 != 0) goto L_0x0015
            o.reportStaticData r1 = new o.reportStaticData
            r1.<init>(r10)
            o.getHeader r1 = (o.getHeader) r1
        L_0x0015:
            o.onControlClick r1 = (o.onControlClick) r1
            goto L_0x003f
        L_0x0018:
            boolean r1 = r10 instanceof o.onControlClick
            if (r1 != 0) goto L_0x001e
            r1 = r0
            goto L_0x001f
        L_0x001e:
            r1 = r10
        L_0x001f:
            o.onControlClick r1 = (o.onControlClick) r1
            if (r1 == 0) goto L_0x0038
            boolean r2 = o.getApdidToken.setMax()
            if (r2 == 0) goto L_0x003f
            boolean r2 = r1 instanceof o.getHeader
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0030
            goto L_0x003f
        L_0x0030:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        L_0x0038:
            o.h$a r1 = new o.h$a
            r1.<init>(r10)
            o.onControlClick r1 = (o.onControlClick) r1
        L_0x003f:
            r2 = r7
            o.onPageEndAndZip r2 = (o.onPageEndAndZip) r2
            r1.length = r2
        L_0x0044:
            java.lang.Object r2 = r7.valueOf()
            boolean r3 = r2 instanceof o.intiToken
            if (r3 == 0) goto L_0x007c
            r3 = r2
            o.intiToken r3 = (o.intiToken) r3
            boolean r4 = r3.length()
            if (r4 == 0) goto L_0x0060
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = getMin
            boolean r2 = r3.compareAndSet(r7, r2, r1)
            if (r2 == 0) goto L_0x0044
            o.DeviceTokenClient$1 r1 = (o.DeviceTokenClient.AnonymousClass1) r1
            return r1
        L_0x0060:
            o.RDSClient$1 r2 = new o.RDSClient$1
            r2.<init>()
            boolean r4 = r3.length()
            if (r4 == 0) goto L_0x006e
            o.DeviceDataReportService r2 = (o.DeviceDataReportService) r2
            goto L_0x0076
        L_0x006e:
            o.logCollect r4 = new o.logCollect
            r4.<init>(r2)
            r2 = r4
            o.DeviceDataReportService r2 = (o.DeviceDataReportService) r2
        L_0x0076:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = getMin
            r4.compareAndSet(r7, r3, r2)
            goto L_0x0044
        L_0x007c:
            boolean r3 = r2 instanceof o.DeviceDataReportService
            if (r3 == 0) goto L_0x00f5
            r3 = r2
            o.DeviceDataReportService r3 = (o.DeviceDataReportService) r3
            o.RDSClient$1 r3 = r3.getMax()
            if (r3 != 0) goto L_0x00a9
            if (r2 == 0) goto L_0x00a1
            o.onControlClick r2 = (o.onControlClick) r2
            o.RDSClient$1 r3 = new o.RDSClient$1
            r3.<init>()
            o.getWebSocketContext r3 = (o.getWebSocketContext) r3
            r2.getMax(r3)
            o.getWebSocketContext r3 = r2.isInside()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = getMin
            r4.compareAndSet(r7, r2, r3)
            goto L_0x0044
        L_0x00a1:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            r8.<init>(r9)
            throw r8
        L_0x00a9:
            o.AbstractWrappedByteChannel r4 = o.AbstractWrappedByteChannel.getMax
            o.DeviceTokenClient$1 r4 = (o.DeviceTokenClient.AnonymousClass1) r4
            if (r8 == 0) goto L_0x00e3
            boolean r5 = r2 instanceof o.onPageEndAndZip.getMax
            if (r5 == 0) goto L_0x00e3
            monitor-enter(r2)
            r5 = r2
            o.onPageEndAndZip$getMax r5 = (o.onPageEndAndZip.getMax) r5     // Catch:{ all -> 0x00e0 }
            java.lang.Object r5 = r5._rootCause     // Catch:{ all -> 0x00e0 }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x00e0 }
            if (r5 == 0) goto L_0x00ca
            boolean r6 = r10 instanceof o.getAD104     // Catch:{ all -> 0x00e0 }
            if (r6 == 0) goto L_0x00dc
            r6 = r2
            o.onPageEndAndZip$getMax r6 = (o.onPageEndAndZip.getMax) r6     // Catch:{ all -> 0x00e0 }
            boolean r6 = r6.setMax()     // Catch:{ all -> 0x00e0 }
            if (r6 != 0) goto L_0x00dc
        L_0x00ca:
            boolean r4 = r7.getMin(r2, r3, r1)     // Catch:{ all -> 0x00e0 }
            if (r4 != 0) goto L_0x00d3
            monitor-exit(r2)
            goto L_0x0044
        L_0x00d3:
            if (r5 != 0) goto L_0x00d9
            o.DeviceTokenClient$1 r1 = (o.DeviceTokenClient.AnonymousClass1) r1     // Catch:{ all -> 0x00e0 }
            monitor-exit(r2)
            return r1
        L_0x00d9:
            r4 = r1
            o.DeviceTokenClient$1 r4 = (o.DeviceTokenClient.AnonymousClass1) r4     // Catch:{ all -> 0x00e0 }
        L_0x00dc:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00e0 }
            monitor-exit(r2)
            goto L_0x00e4
        L_0x00e0:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x00e3:
            r5 = r0
        L_0x00e4:
            if (r5 == 0) goto L_0x00ec
            if (r9 == 0) goto L_0x00eb
            r10.invoke(r5)
        L_0x00eb:
            return r4
        L_0x00ec:
            boolean r2 = r7.getMin(r2, r3, r1)
            if (r2 == 0) goto L_0x0044
            o.DeviceTokenClient$1 r1 = (o.DeviceTokenClient.AnonymousClass1) r1
            return r1
        L_0x00f5:
            if (r9 == 0) goto L_0x0105
            boolean r8 = r2 instanceof o.APExpansion
            if (r8 != 0) goto L_0x00fc
            r2 = r0
        L_0x00fc:
            o.APExpansion r2 = (o.APExpansion) r2
            if (r2 == 0) goto L_0x0102
            java.lang.Throwable r0 = r2.setMax
        L_0x0102:
            r10.invoke(r0)
        L_0x0105:
            o.AbstractWrappedByteChannel r8 = o.AbstractWrappedByteChannel.getMax
            o.DeviceTokenClient$1 r8 = (o.DeviceTokenClient.AnonymousClass1) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onPageEndAndZip.getMax(boolean, boolean, kotlin.jvm.functions.Function1):o.DeviceTokenClient$1");
    }

    @NotNull
    public final CancellationException Grayscale$Algorithm() {
        Object obj;
        Throwable th;
        while (true) {
            obj = this._state;
            if (!(obj instanceof WebSocketContext)) {
                break;
            }
            ((WebSocketContext) obj).setMax(this);
        }
        CancellationException cancellationException = null;
        if (obj instanceof getMax) {
            th = (Throwable) ((getMax) obj)._rootCause;
        } else if (obj instanceof APExpansion) {
            th = ((APExpansion) obj).setMax;
        } else if (!(obj instanceof DeviceDataReportService)) {
            th = null;
        } else {
            throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(obj)).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        StringBuilder sb = new StringBuilder("Parent job is ");
        sb.append(toIntRange(obj));
        return new JobCancellationException(sb.toString(), th, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0042, code lost:
        length(((o.onPageEndAndZip.getMax) r2).setMax, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        return o.onPage.setMin();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object IsOverlapping(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r5._state
            boolean r3 = r2 instanceof o.WebSocketContext
            if (r3 != 0) goto L_0x00a0
            boolean r3 = r2 instanceof o.onPageEndAndZip.getMax
            if (r3 == 0) goto L_0x0051
            monitor-enter(r2)
            r3 = r2
            o.onPageEndAndZip$getMax r3 = (o.onPageEndAndZip.getMax) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r3.setMin()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x001c
            o.closeBlocking r6 = o.onPage.setMin     // Catch:{ all -> 0x004e }
            monitor-exit(r2)
            return r6
        L_0x001c:
            r3 = r2
            o.onPageEndAndZip$getMax r3 = (o.onPageEndAndZip.getMax) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r3.getMin()     // Catch:{ all -> 0x004e }
            if (r6 != 0) goto L_0x0027
            if (r3 != 0) goto L_0x0033
        L_0x0027:
            if (r1 != 0) goto L_0x002d
            java.lang.Throwable r1 = r5.getMin((java.lang.Object) r6)     // Catch:{ all -> 0x004e }
        L_0x002d:
            r6 = r2
            o.onPageEndAndZip$getMax r6 = (o.onPageEndAndZip.getMax) r6     // Catch:{ all -> 0x004e }
            r6.setMin(r1)     // Catch:{ all -> 0x004e }
        L_0x0033:
            r6 = r2
            o.onPageEndAndZip$getMax r6 = (o.onPageEndAndZip.getMax) r6     // Catch:{ all -> 0x004e }
            java.lang.Object r6 = r6._rootCause     // Catch:{ all -> 0x004e }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x004e }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003f
            r0 = r6
        L_0x003f:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0049
            o.onPageEndAndZip$getMax r2 = (o.onPageEndAndZip.getMax) r2
            o.RDSClient$1 r6 = r2.setMax
            r5.length((o.RDSClient.AnonymousClass1) r6, (java.lang.Throwable) r0)
        L_0x0049:
            o.closeBlocking r6 = o.onPage.setMax
            return r6
        L_0x004e:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        L_0x0051:
            boolean r3 = r2 instanceof o.DeviceDataReportService
            if (r3 == 0) goto L_0x009b
            if (r1 != 0) goto L_0x005b
            java.lang.Throwable r1 = r5.getMin((java.lang.Object) r6)
        L_0x005b:
            r3 = r2
            o.DeviceDataReportService r3 = (o.DeviceDataReportService) r3
            boolean r4 = r3.length()
            if (r4 == 0) goto L_0x006f
            boolean r2 = r5.setMax((o.DeviceDataReportService) r3, (java.lang.Throwable) r1)
            if (r2 == 0) goto L_0x0002
            o.closeBlocking r6 = o.onPage.setMax
            return r6
        L_0x006f:
            o.APExpansion r3 = new o.APExpansion
            r3.<init>(r1)
            java.lang.Object r3 = r5.getMin((java.lang.Object) r2, (java.lang.Object) r3)
            o.closeBlocking r4 = o.onPage.setMax
            if (r3 == r4) goto L_0x0085
            o.closeBlocking r2 = o.onPage.getMin
            if (r3 == r2) goto L_0x0002
            return r3
        L_0x0085:
            java.lang.String r6 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Cannot happen in "
            java.lang.String r6 = r0.concat(r6)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x009b:
            o.closeBlocking r6 = o.onPage.setMin
            return r6
        L_0x00a0:
            o.WebSocketContext r2 = (o.WebSocketContext) r2
            r2.setMax(r5)
            goto L_0x0002
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onPageEndAndZip.IsOverlapping(java.lang.Object):java.lang.Object");
    }

    @Nullable
    public final Object a_(@Nullable Object obj) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof WebSocketContext)) {
                Object min = getMin(obj2, obj);
                if (min == onPage.setMax) {
                    StringBuilder sb = new StringBuilder("Job ");
                    sb.append(this);
                    sb.append(" is already complete or completing, but is being completed with ");
                    sb.append(obj);
                    String obj3 = sb.toString();
                    Throwable th = null;
                    if (!(obj instanceof APExpansion)) {
                        obj = null;
                    }
                    APExpansion aPExpansion = (APExpansion) obj;
                    if (aPExpansion != null) {
                        th = aPExpansion.setMax;
                    }
                    throw new IllegalStateException(obj3, th);
                } else if (min != onPage.getMin) {
                    return min;
                }
            } else {
                ((WebSocketContext) obj2).setMax(this);
            }
        }
    }

    @NotNull
    public String IsOverlapping() {
        return getClass().getSimpleName();
    }

    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return CoroutineContext.Element.DefaultImpls.fold(this, r, function2);
    }

    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    public static final /* synthetic */ void setMin(onPageEndAndZip onpageendandzip, getMax getmax, getAD104 getad104, Object obj) {
        Object obj2;
        if (getApdidToken.setMax()) {
            while (true) {
                obj2 = onpageendandzip._state;
                if (!(obj2 instanceof WebSocketContext)) {
                    break;
                }
                ((WebSocketContext) obj2).setMax(onpageendandzip);
            }
            if (!(obj2 == getmax)) {
                throw new AssertionError();
            }
        }
        getAD104 max = setMax((getWebSocketContext) getad104);
        if (max == null || !onpageendandzip.setMax(getmax, max, obj)) {
            onpageendandzip.setMax(onpageendandzip.setMax(getmax, obj));
        }
    }
}
