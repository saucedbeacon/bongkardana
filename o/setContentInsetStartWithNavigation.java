package o;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.anggrayudi.storage.file.CreateMode;
import com.anggrayudi.storage.file.DocumentFileType;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.promocenter.model.PromoActionType;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.setContentInsetsRelative;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aV\u0010\u0018\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u0002H\u001a\u0012\u0002\b\u0003\u0012\u0002\b\u00030 2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00190\"H\u0002\u001aC\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020&2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00190\"H\b\u001a<\u0010'\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020&H\u0002\u001a(\u0010,\u001a\u00020-2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020&H\u0002\u001a(\u0010/\u001a\u0002002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u000203H\u0002\u001a\u001c\u00104\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u0001H\u0007\u001a\u0012\u00106\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a$\u00107\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\f2\u0006\u00109\u001a\u00020\fH\u0007\u001a(\u0010:\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u00012\b\b\u0002\u00108\u001a\u00020\fH\u0007\u001aD\u0010<\u001a\u00020\u0019*\u00020\u00022\u0006\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020?2\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020&H\u0002\u001a0\u0010D\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u00022\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010\u001f\u001a\u00020&H\u0007\u001a8\u0010D\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u00012\b\u0010G\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001f\u001a\u00020&H\u0002\u001a$\u0010D\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020&H\u0007\u001a,\u0010D\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020%2\u0006\u0010C\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020&H\u0002\u001a0\u0010D\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020H2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010\u001f\u001a\u00020&H\u0007\u001a0\u0010D\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020\u00012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010\u001f\u001a\u00020&H\u0007\u001a.\u0010J\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020F2\u0006\u0010\u001f\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020+H\u0007\u001a<\u0010K\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020F2\u0006\u0010\u001f\u001a\u00020&2\u0006\u0010L\u001a\u00020M2\u0006\u0010C\u001a\u00020\f2\u0006\u0010*\u001a\u00020+H\u0002\u001a.\u0010N\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020F2\u0006\u0010\u001f\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020+H\u0007\u001a:\u0010O\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u00022\b\b\u0002\u0010P\u001a\u00020\f2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001f\u001a\u000203H\u0007\u001aB\u0010O\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u00022\b\b\u0002\u0010P\u001a\u00020\f2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00012\u0006\u0010R\u001a\u00020\f2\u0006\u0010\u001f\u001a\u000203H\u0002\u001a4\u0010S\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00020T2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u00022\b\b\u0002\u0010P\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020UH\u0007\u001a<\u0010S\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00020T2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u00022\b\b\u0002\u0010P\u001a\u00020\f2\u0006\u0010R\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020UH\u0002\u001a(\u0010V\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010W\u001a\u00020\u00012\b\b\u0002\u0010*\u001a\u00020+H\u0007\u001a\u0012\u0010X\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u001e\u0010Y\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010Z\u001a\u00020\fH\u0007\u001a0\u0010[\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001f\u001a\u00020&H\u0002\u001a0\u0010[\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u00022\b\u0010Q\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001f\u001a\u000203H\u0002\u001a>\u0010[\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020]\u0018\u00010\\*\b\u0012\u0004\u0012\u00020\u00020T2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020UH\u0002\u001a\u0014\u0010^\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010W\u001a\u00020\u0001\u001a-\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00020T*\u00020\u00022\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00010a2\b\b\u0002\u0010b\u001a\u00020c¢\u0006\u0002\u0010d\u001a\u0014\u0010e\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010W\u001a\u00020\u0001\u001a\u001e\u0010f\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010Z\u001a\u00020\fH\u0007\u001a\u0012\u0010g\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0012\u0010h\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u001a\u0010i\u001a\n j*\u0004\u0018\u00010\u00010\u0001*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u001c\u0010k\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020lH\u0007\u001a\u0012\u0010m\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a \u0010n\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u00108\u001a\u00020\fH\u0007\u001a\u0012\u0010o\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0012\u0010p\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0012\u0010q\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0012\u0010r\u001a\u00020s*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u001c\u0010t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010u\u001a\u00020\u0001H\u0002\u001a2\u0010/\u001a\n\u0012\u0004\u0012\u00020v\u0018\u00010T*\b\u0012\u0004\u0012\u00020\u00020T2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020UH\u0002\u001a\u001a\u0010w\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010x\u001a\u00020\u0002\u001a\u0012\u0010y\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0012\u0010z\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0012\u0010{\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u001a\u0010|\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010}\u001a\u00020\u0002\u001a\u0012\u0010~\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0014\u0010\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0007\u001a\u0013\u0010\u0001\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0013\u0010\u0001\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0013\u0010\u0001\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0013\u0010\u0001\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a5\u0010\u0001\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010W\u001a\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010*\u001a\u00020+H\u0007\u001a)\u0010\u0001\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010W\u001a\u00020\u00012\b\b\u0002\u0010*\u001a\u00020+H\u0007\u001a\"\u0010\u0001\u001a\u00020\f*\u00020\u00022\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010aH\u0002¢\u0006\u0003\u0010\u0001\u001a1\u0010\u0001\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u00022\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010\u001f\u001a\u00020&H\u0007\u001a9\u0010\u0001\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u00012\b\u0010G\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001f\u001a\u00020&H\u0002\u001a%\u0010\u0001\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020&H\u0007\u001a1\u0010\u0001\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020H2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010\u001f\u001a\u00020&H\u0007\u001a1\u0010\u0001\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020\u00012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010\u001f\u001a\u00020&H\u0007\u001a/\u0010\u0001\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020F2\u0006\u0010\u001f\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020+H\u0007\u001a/\u0010\u0001\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020F2\u0006\u0010\u001f\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020+H\u0007\u001a;\u0010\u0001\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u00022\b\b\u0002\u0010P\u001a\u00020\f2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001f\u001a\u000203H\u0007\u001a5\u0010\u0001\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00020T2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u00022\b\b\u0002\u0010P\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020UH\u0007\u001a\u001f\u0010\u0001\u001a\u00030\u0001*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0007\u0010\u0001\u001a\u00020\u0001H\u0007\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010#*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0007\u001a\"\u0010\u0001\u001a\u0004\u0018\u00010$*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\t\b\u0002\u0010\u0001\u001a\u00020\fH\u0007\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010W\u001a\u00020\u0001H\u0007\u001a)\u0010\u0001\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010W\u001a\u00020\u0001H\u0007\u001a\u0015\u0010\u0001\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001aY\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020T*\u00020\u00022\t\b\u0002\u0010\u0001\u001a\u00020\f2\b\b\u0002\u0010b\u001a\u00020c2\u0011\b\u0002\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010a2\b\b\u0002\u0010W\u001a\u00020\u00012\f\b\u0002\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0007¢\u0006\u0003\u0010\u0001\u001a\u001d\u0010\u0001\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\fH\u0007\u001a\u0015\u0010 \u0001\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001f\u001a\u00020&H\u0002\u001a\u001f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\fH\u0007\u001a\u0014\u0010¢\u0001\u001a\u00030£\u0001*\b0¤\u0001j\u0003`¥\u0001H\u0000\u001a\u0014\u0010¦\u0001\u001a\u00030§\u0001*\b0¤\u0001j\u0003`¥\u0001H\u0002\u001a\u0015\u0010¨\u0001\u001a\u0004\u0018\u00010%*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0014\u0010©\u0001\u001a\u00030ª\u0001*\b0¤\u0001j\u0003`¥\u0001H\u0002\u001a\u0015\u0010«\u0001\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0015\u0010¬\u0001\u001a\u0004\u0018\u00010H*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0015\u0010­\u0001\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0017\u0010®\u0001\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0007\u001aC\u0010¯\u0001\u001a\u0004\u0018\u00010?*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0007\u0010°\u0001\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00012\u0006\u0010P\u001a\u00020\f2\b\u0010Q\u001a\u0004\u0018\u00010\u00012\u0007\u0010±\u0001\u001a\u000200H\u0002\u001a\u001b\u0010²\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020T*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0002\u001a\u0013\u0010³\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020T*\u00020\u0002H\u0002\u001a\u0013\u0010´\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020T*\u00020\u0002H\u0002\u001a\u0013\u0010µ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020T*\u00020\u0002H\u0002\u001a!\u0010¶\u0001\u001a\u00020\u0019*\u00020\u00022\b\u0010·\u0001\u001a\u00030¸\u00012\b\u0010¹\u0001\u001a\u00030º\u0001H\u0002\u001aO\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020T*\u00020\u00022\u0006\u0010b\u001a\u00020c2\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010a2\u0007\u0010¼\u0001\u001a\u00020\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\b\u0010¹\u0001\u001a\u00030º\u0001H\u0002¢\u0006\u0003\u0010½\u0001\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\"\u0015\u0010\u000b\u001a\u00020\f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r\"\u0015\u0010\u000e\u001a\u00020\f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\r\"\u0015\u0010\u000f\u001a\u00020\f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\"\u0015\u0010\u0010\u001a\u00020\f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\r\"\u0015\u0010\u0011\u001a\u00020\f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0004\"\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0004\"\u0015\u0010\u0016\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0004¨\u0006¾\u0001"}, d2 = {"baseName", "", "Landroidx/documentfile/provider/DocumentFile;", "getBaseName", "(Landroidx/documentfile/provider/DocumentFile;)Ljava/lang/String;", "extension", "getExtension", "fullName", "getFullName", "id", "getId", "isDownloadsDocument", "", "(Landroidx/documentfile/provider/DocumentFile;)Z", "isExternalStorageDocument", "isMediaDocument", "isRawFile", "isTreeDocumentFile", "mimeType", "getMimeType", "mimeTypeByFileName", "getMimeTypeByFileName", "rootId", "getRootId", "createFileStreams", "", "Enum", "context", "Landroid/content/Context;", "sourceFile", "targetFile", "callback", "Lcom/anggrayudi/storage/callback/BaseFileCallback;", "onStreamsReady", "Lkotlin/Function2;", "Ljava/io/InputStream;", "Ljava/io/OutputStream;", "Lcom/anggrayudi/storage/media/MediaFile;", "Lcom/anggrayudi/storage/callback/FileCallback;", "createTargetFile", "targetFolder", "newFilenameInTargetPath", "mode", "Lcom/anggrayudi/storage/file/CreateMode;", "handleFileConflict", "Lcom/anggrayudi/storage/callback/FileCallback$ConflictResolution;", "targetFileName", "handleParentFolderConflict", "Lcom/anggrayudi/storage/callback/FolderCallback$ConflictResolution;", "targetParentFolder", "targetFolderParentName", "Lcom/anggrayudi/storage/callback/FolderCallback;", "autoIncrementFileName", "filename", "canModify", "checkRequirements", "requiresWriteAccess", "considerRawFile", "child", "path", "copyFileStream", "inputStream", "outputStream", "", "watchProgress", "reportInterval", "", "deleteSourceFileWhenComplete", "copyFileTo", "fileDescription", "Lcom/anggrayudi/storage/media/FileDescription;", "newMimeTypeInTargetPath", "Ljava/io/File;", "targetFolderAbsolutePath", "copyFileToDownloadMedia", "copyFileToMedia", "publicDirectory", "Lcom/anggrayudi/storage/file/PublicDirectory;", "copyFileToPictureMedia", "copyFolderTo", "skipEmptyFiles", "newFolderNameInTargetPath", "deleteSourceWhenComplete", "copyTo", "", "Lcom/anggrayudi/storage/callback/MultipleFileCallback;", "createBinaryFile", "name", "deleteEmptyFolders", "deleteRecursively", "childrenOnly", "doesMeetCopyRequirements", "Lkotlin/Pair;", "", "findFileLiterally", "findFiles", "names", "", "documentType", "Lcom/anggrayudi/storage/file/DocumentFileType;", "(Landroidx/documentfile/provider/DocumentFile;[Ljava/lang/String;Lcom/anggrayudi/storage/file/DocumentFileType;)Ljava/util/List;", "findFolder", "forceDelete", "getAbsolutePath", "getBasePath", "getFormattedSize", "kotlin.jvm.PlatformType", "getProperties", "Lcom/anggrayudi/storage/file/FileProperties$CalculationCallback;", "getRelativePath", "getRootDocumentFile", "getRootPath", "getSimplePath", "getStorageId", "getStorageType", "Lcom/anggrayudi/storage/file/StorageType;", "getSubPath", "otherFolderAbsolutePath", "Lcom/anggrayudi/storage/callback/MultipleFileCallback$ParentConflict;", "hasParent", "parent", "inDataStorage", "inInternalStorage", "inPrimaryStorage", "inSameMountPointWith", "file", "inSdCardStorage", "isEmpty", "isExternalStorageManager", "isReadOnly", "isRootUriPermissionGranted", "isWritable", "makeFile", "makeFolder", "matchesMimeTypes", "filterMimeTypes", "(Landroidx/documentfile/provider/DocumentFile;[Ljava/lang/String;)Z", "moveFileTo", "moveFileToDownloadMedia", "moveFileToPictureMedia", "moveFolderTo", "moveTo", "openFileIntent", "Landroid/content/Intent;", "authority", "openInputStream", "openOutputStream", "append", "quickFindRawFile", "quickFindTreeFile", "resolver", "Landroid/content/ContentResolver;", "recreateFile", "search", "recursive", "mimeTypes", "regex", "Lkotlin/text/Regex;", "(Landroidx/documentfile/provider/DocumentFile;ZLcom/anggrayudi/storage/file/DocumentFileType;[Ljava/lang/String;Ljava/lang/String;Lkotlin/text/Regex;)Ljava/util/List;", "shouldWritable", "simpleCheckSourceFile", "takeIfWritable", "toFileCallbackErrorCode", "Lcom/anggrayudi/storage/callback/FileCallback$ErrorCode;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "toFolderCallbackErrorCode", "Lcom/anggrayudi/storage/callback/FolderCallback$ErrorCode;", "toMediaFile", "toMultipleFileCallbackErrorCode", "Lcom/anggrayudi/storage/callback/MultipleFileCallback$ErrorCode;", "toRawDocumentFile", "toRawFile", "toTreeDocumentFile", "toWritableDownloadsDocumentFile", "tryMoveFolderByRenamingPath", "writableTargetParentFolder", "conflictResolution", "walkFileTree", "walkFileTreeAndDeleteEmptyFolders", "walkFileTreeAndSkipEmptyFiles", "walkFileTreeForDeletion", "walkFileTreeForInfo", "properties", "Lcom/anggrayudi/storage/file/FileProperties;", "thread", "Ljava/lang/Thread;", "walkFileTreeForSearch", "nameFilter", "(Landroidx/documentfile/provider/DocumentFile;Lcom/anggrayudi/storage/file/DocumentFileType;[Ljava/lang/String;Ljava/lang/String;Lkotlin/text/Regex;Ljava/lang/Thread;)Ljava/util/List;", "storage_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
@JvmName(name = "DocumentFileUtils")
public final class setContentInsetStartWithNavigation {
    @NotNull
    private static String setMin(@NotNull superDispatchKeyEvent superdispatchkeyevent, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(superdispatchkeyevent, "<this>");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Uri min = superdispatchkeyevent.setMin();
        Intrinsics.checkNotNullExpressionValue(min, "uri");
        Intrinsics.checkNotNullParameter(min, "<this>");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        String path = min.getPath();
        if (path == null) {
            path = "";
        }
        if (getContentInsetRight.length(min)) {
            return getContentInsetEndWithActions.length(new File(path), context);
        }
        if (getContentInsetRight.getMax(min)) {
            return StringsKt.substringAfterLast$default(StringsKt.substringBefore(path, ':', ""), '/', (String) null, 2, (Object) null);
        }
        if (getContentInsetRight.getMin(min)) {
            return PromoActionType.PRIMARY;
        }
        return "";
    }

    private static boolean getMin(@NotNull superDispatchKeyEvent superdispatchkeyevent) {
        Intrinsics.checkNotNullParameter(superdispatchkeyevent, "<this>");
        Uri min = superdispatchkeyevent.setMin();
        Intrinsics.checkNotNullExpressionValue(min, "uri");
        return getContentInsetRight.setMax(min);
    }

    private static boolean length(@NotNull superDispatchKeyEvent superdispatchkeyevent) {
        Intrinsics.checkNotNullParameter(superdispatchkeyevent, "<this>");
        Uri min = superdispatchkeyevent.setMin();
        Intrinsics.checkNotNullExpressionValue(min, "uri");
        return getContentInsetRight.getMax(min);
    }

    public static final boolean getMax(@NotNull superDispatchKeyEvent superdispatchkeyevent) {
        Intrinsics.checkNotNullParameter(superdispatchkeyevent, "<this>");
        Uri min = superdispatchkeyevent.setMin();
        Intrinsics.checkNotNullExpressionValue(min, "uri");
        return getContentInsetRight.getMin(min);
    }

    private static boolean getMin(@NotNull superDispatchKeyEvent superdispatchkeyevent, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(superdispatchkeyevent, "<this>");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        if (getMin(superdispatchkeyevent) && Intrinsics.areEqual((Object) setMin(superdispatchkeyevent, context), (Object) PromoActionType.PRIMARY)) {
            return true;
        }
        if (setMin(superdispatchkeyevent)) {
            String path = superdispatchkeyevent.setMin().getPath();
            if (path == null) {
                path = "";
            }
            setContentInsetsRelative.setMax setmax = setContentInsetsRelative.length;
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getExternalStorageDirectory().absolutePath");
            if (StringsKt.startsWith$default(path, absolutePath, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    private static boolean setMin(@NotNull superDispatchKeyEvent superdispatchkeyevent) {
        Intrinsics.checkNotNullParameter(superdispatchkeyevent, "<this>");
        Uri min = superdispatchkeyevent.setMin();
        Intrinsics.checkNotNullExpressionValue(min, "uri");
        return getContentInsetRight.length(min);
    }

    @Nullable
    private static File length(@NotNull superDispatchKeyEvent superdispatchkeyevent, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(superdispatchkeyevent, "<this>");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        if (setMin(superdispatchkeyevent)) {
            String path = superdispatchkeyevent.setMin().getPath();
            if (path == null) {
                return null;
            }
            return new File(path);
        } else if (getMin(superdispatchkeyevent, context)) {
            StringBuilder sb = new StringBuilder();
            setContentInsetsRelative.setMax setmax = setContentInsetsRelative.length;
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getExternalStorageDirectory().absolutePath");
            sb.append(absolutePath);
            sb.append('/');
            sb.append(toIntRange(superdispatchkeyevent, context));
            return new File(sb.toString());
        } else {
            if (!(setMin(superdispatchkeyevent, context).length() > 0)) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder("/storage/");
            sb2.append(setMin(superdispatchkeyevent, context));
            sb2.append('/');
            sb2.append(toIntRange(superdispatchkeyevent, context));
            return new File(sb2.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.JvmOverloads
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final o.superDispatchKeyEvent getMax(@org.jetbrains.annotations.NotNull o.superDispatchKeyEvent r6, @org.jetbrains.annotations.NotNull android.content.Context r7, @org.jetbrains.annotations.NotNull java.lang.String r8, boolean r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.lang.String r2 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            r2 = r8
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L_0x001a
            r2 = 1
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            if (r2 == 0) goto L_0x001e
            return r6
        L_0x001e:
            boolean r2 = r6.setMax()
            r3 = 0
            if (r2 == 0) goto L_0x008e
            boolean r2 = setMin(r6)
            if (r2 == 0) goto L_0x0050
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r2 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            java.io.File r2 = new java.io.File
            android.net.Uri r6 = r6.setMin()
            java.lang.String r6 = r6.getPath()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r2.<init>(r6, r8)
            o.superDispatchKeyEvent r6 = o.superDispatchKeyEvent.setMin(r2)
            boolean r8 = r6.IsOverlapping()
            if (r8 == 0) goto L_0x004e
            goto L_0x007f
        L_0x004e:
            r6 = r3
            goto L_0x007f
        L_0x0050:
            android.content.ContentResolver r2 = r7.getContentResolver()
            o.getContentInsetLeft r4 = o.getContentInsetLeft.setMin
            java.util.List r8 = o.getContentInsetLeft.getMax(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x0060:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r8.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "resolver"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            o.superDispatchKeyEvent r6 = setMax(r6, r7, r2, r4)
            if (r6 != 0) goto L_0x0078
            return r3
        L_0x0078:
            boolean r4 = r6.IsOverlapping()
            if (r4 != 0) goto L_0x0060
            return r3
        L_0x007f:
            if (r6 == 0) goto L_0x008e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            boolean r7 = getMax(r6, r7, r9)
            if (r7 == 0) goto L_0x008e
            return r6
        L_0x008e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentInsetStartWithNavigation.getMax(o.superDispatchKeyEvent, android.content.Context, java.lang.String, boolean):o.superDispatchKeyEvent");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0098, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a1, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a5, code lost:
        throw r13;
     */
    @org.jetbrains.annotations.Nullable
    @android.annotation.SuppressLint({"NewApi"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.superDispatchKeyEvent setMax(@org.jetbrains.annotations.NotNull o.superDispatchKeyEvent r12, @org.jetbrains.annotations.NotNull android.content.Context r13, @org.jetbrains.annotations.NotNull android.content.ContentResolver r14, @org.jetbrains.annotations.NotNull java.lang.String r15) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            java.lang.String r1 = "resolver"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            java.lang.String r1 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            r1 = 0
            android.net.Uri r2 = r12.setMin()     // Catch:{ Exception -> 0x00a6 }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)     // Catch:{ Exception -> 0x00a6 }
            android.net.Uri r0 = r12.setMin()     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r0 = android.provider.DocumentsContract.getDocumentId(r0)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r3 = "getDocumentId(uri)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch:{ Exception -> 0x00a6 }
            android.net.Uri r5 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r2, r0)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r0 = "document_id"
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x00a6 }
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r14
            android.database.Cursor r0 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00a6 }
            if (r0 == 0) goto L_0x00a6
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch:{ Exception -> 0x00a6 }
            r2 = r0
            android.database.Cursor r2 = (android.database.Cursor) r2     // Catch:{ all -> 0x009f }
            java.lang.String r3 = "_display_name"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ all -> 0x009f }
        L_0x0048:
            boolean r4 = r2.moveToNext()     // Catch:{ all -> 0x009f }
            if (r4 == 0) goto L_0x0099
            android.net.Uri r4 = r12.setMin()     // Catch:{ Exception -> 0x0048 }
            r10 = 0
            java.lang.String r5 = r2.getString(r10)     // Catch:{ Exception -> 0x0048 }
            android.net.Uri r11 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r4, r5)     // Catch:{ Exception -> 0x0048 }
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r14
            r5 = r11
            r6 = r3
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0048 }
            if (r4 == 0) goto L_0x0048
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch:{ Exception -> 0x0048 }
            r5 = r4
            android.database.Cursor r5 = (android.database.Cursor) r5     // Catch:{ all -> 0x0092 }
            boolean r6 = r5.moveToFirst()     // Catch:{ all -> 0x0092 }
            if (r6 == 0) goto L_0x008c
            java.lang.String r5 = r5.getString(r10)     // Catch:{ all -> 0x0092 }
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r5)     // Catch:{ all -> 0x0092 }
            if (r5 == 0) goto L_0x008c
            java.lang.String r5 = "documentUri"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r5)     // Catch:{ all -> 0x0092 }
            o.superDispatchKeyEvent r5 = o.getContentInsetEnd.getMin(r13, r11)     // Catch:{ all -> 0x0092 }
            kotlin.io.CloseableKt.closeFinally(r4, r1)     // Catch:{ Exception -> 0x0048 }
            kotlin.io.CloseableKt.closeFinally(r0, r1)     // Catch:{ Exception -> 0x00a6 }
            return r5
        L_0x008c:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0092 }
            kotlin.io.CloseableKt.closeFinally(r4, r1)     // Catch:{ Exception -> 0x0048 }
            goto L_0x0048
        L_0x0092:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r6 = move-exception
            kotlin.io.CloseableKt.closeFinally(r4, r5)     // Catch:{ Exception -> 0x0048 }
            throw r6     // Catch:{ Exception -> 0x0048 }
        L_0x0099:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x009f }
            kotlin.io.CloseableKt.closeFinally(r0, r1)     // Catch:{ Exception -> 0x00a6 }
            goto L_0x00a6
        L_0x009f:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r13 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r12)     // Catch:{ Exception -> 0x00a6 }
            throw r13     // Catch:{ Exception -> 0x00a6 }
        L_0x00a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentInsetStartWithNavigation.setMax(o.superDispatchKeyEvent, android.content.Context, android.content.ContentResolver, java.lang.String):o.superDispatchKeyEvent");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    private static boolean getMax(@NotNull superDispatchKeyEvent superdispatchkeyevent, @NotNull Context context, boolean z) {
        Intrinsics.checkNotNullParameter(superdispatchkeyevent, "<this>");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        return (z && getMax(superdispatchkeyevent, context)) || !z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a5, code lost:
        r13 = r0.length.getPath();
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String toIntRange(@org.jetbrains.annotations.NotNull o.superDispatchKeyEvent r13, @org.jetbrains.annotations.NotNull android.content.Context r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            android.net.Uri r1 = r13.setMin()
            java.lang.String r1 = r1.getPath()
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0017
            r1 = r2
        L_0x0017:
            java.lang.String r3 = setMin(r13, r14)
            boolean r4 = setMin(r13)
            if (r4 == 0) goto L_0x002b
            java.io.File r13 = new java.io.File
            r13.<init>(r1)
            java.lang.String r13 = o.getContentInsetEndWithActions.setMin((java.io.File) r13, (android.content.Context) r14)
            return r13
        L_0x002b:
            boolean r4 = length(r13)
            r5 = 47
            r6 = 1
            r7 = 0
            r8 = 0
            if (r4 == 0) goto L_0x0074
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "/document/"
            r9.<init>(r10)
            r9.append(r3)
            r11 = 58
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r12 = 2
            boolean r4 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r4, (java.lang.CharSequence) r9, (boolean) r8, (int) r12, (java.lang.Object) r7)
            if (r4 == 0) goto L_0x0074
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r10)
            r13.append(r3)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            java.lang.String r13 = kotlin.text.StringsKt.substringAfterLast((java.lang.String) r1, (java.lang.String) r13, (java.lang.String) r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            char[] r14 = new char[r6]
            r14[r8] = r5
            java.lang.String r13 = kotlin.text.StringsKt.trim((java.lang.String) r13, (char[]) r14)
            return r13
        L_0x0074:
            boolean r3 = getMax(r13)
            if (r3 == 0) goto L_0x0157
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 >= r4) goto L_0x00db
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            kotlin.text.Regex r4 = new kotlin.text.Regex
            java.lang.String r9 = "/document/\\d+"
            r4.<init>((java.lang.String) r9)
            boolean r3 = r4.matches(r3)
            if (r3 == 0) goto L_0x00db
            o.setContentInsetEndWithActions r0 = new o.setContentInsetEndWithActions
            android.net.Uri r13 = r13.setMin()
            java.lang.String r1 = "uri"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r1)
            r0.<init>((android.content.Context) r14, (android.net.Uri) r13)
            boolean r13 = r0.setMax()
            if (r13 == 0) goto L_0x00b3
            android.net.Uri r13 = r0.length
            java.lang.String r13 = r13.getPath()
            if (r13 == 0) goto L_0x00b3
            java.io.File r14 = new java.io.File
            r14.<init>(r13)
            goto L_0x00b4
        L_0x00b3:
            r14 = r7
        L_0x00b4:
            if (r14 != 0) goto L_0x00b7
            goto L_0x00bb
        L_0x00b7:
            java.lang.String r7 = r14.getName()
        L_0x00bb:
            if (r7 != 0) goto L_0x00c3
            java.lang.String r13 = "_display_name"
            java.lang.String r7 = r0.setMin(r13)
        L_0x00c3:
            if (r7 != 0) goto L_0x00c6
            return r2
        L_0x00c6:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = android.os.Environment.DIRECTORY_DOWNLOADS
            r13.append(r14)
            r13.append(r5)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            return r13
        L_0x00db:
            int r14 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r14 < r3) goto L_0x0138
            r14 = r1
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            kotlin.text.Regex r3 = new kotlin.text.Regex
            java.lang.String r4 = "(.*?)/ms[f,d]:\\d+(.*?)"
            r3.<init>((java.lang.String) r4)
            boolean r14 = r3.matches(r14)
            if (r14 == 0) goto L_0x0138
            boolean r14 = getMin(r13)
            if (r14 == 0) goto L_0x0137
            java.lang.String[] r14 = new java.lang.String[r6]
            java.lang.String r0 = r13.getMin()
            if (r0 != 0) goto L_0x0100
            r0 = r2
        L_0x0100:
            r14[r8] = r0
            java.util.List r14 = kotlin.collections.CollectionsKt.mutableListOf(r14)
        L_0x0106:
            o.superDispatchKeyEvent r0 = r13.length()
            if (r0 != 0) goto L_0x010e
            r0 = r7
            goto L_0x010f
        L_0x010e:
            r13 = r0
        L_0x010f:
            if (r0 == 0) goto L_0x011c
            java.lang.String r0 = r13.getMin()
            if (r0 != 0) goto L_0x0118
            r0 = r2
        L_0x0118:
            r14.add(r0)
            goto L_0x0106
        L_0x011c:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.List r13 = kotlin.collections.CollectionsKt.reversed(r14)
            r0 = r13
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r13 = "/"
            r1 = r13
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 62
            r8 = 0
            java.lang.String r13 = kotlin.collections.CollectionsKt.joinToString$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r13
        L_0x0137:
            return r2
        L_0x0138:
            o.setContentInsetsRelative$setMax r13 = o.setContentInsetsRelative.length
            java.io.File r13 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r13 = r13.getAbsolutePath()
            java.lang.String r14 = "getExternalStorageDirectory().absolutePath"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r14)
            java.lang.String r13 = kotlin.text.StringsKt.substringAfterLast((java.lang.String) r1, (java.lang.String) r13, (java.lang.String) r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            char[] r14 = new char[r6]
            r14[r8] = r5
            java.lang.String r13 = kotlin.text.StringsKt.trim((java.lang.String) r13, (char[]) r14)
            return r13
        L_0x0157:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentInsetStartWithNavigation.toIntRange(o.superDispatchKeyEvent, android.content.Context):java.lang.String");
    }

    public static final boolean getMax(@NotNull superDispatchKeyEvent superdispatchkeyevent, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(superdispatchkeyevent, "<this>");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        if (!setMin(superdispatchkeyevent)) {
            return superdispatchkeyevent.isInside();
        }
        String path = superdispatchkeyevent.setMin().getPath();
        Intrinsics.checkNotNull(path);
        return getContentInsetEndWithActions.setMax(new File(path), context);
    }

    @WorkerThread
    @Nullable
    @JvmOverloads
    public static final superDispatchKeyEvent setMin(@NotNull superDispatchKeyEvent superdispatchkeyevent, @NotNull Context context, @NotNull String str, @Nullable String str2, @NotNull CreateMode createMode) {
        superDispatchKeyEvent superdispatchkeyevent2;
        superDispatchKeyEvent min;
        superDispatchKeyEvent superdispatchkeyevent3 = superdispatchkeyevent;
        Context context2 = context;
        String str3 = str2;
        CreateMode createMode2 = createMode;
        Intrinsics.checkNotNullParameter(superdispatchkeyevent3, "<this>");
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(createMode2, "mode");
        if (!superdispatchkeyevent.setMax() || !getMax(superdispatchkeyevent, context)) {
            return null;
        }
        getContentInsetLeft getcontentinsetleft = getContentInsetLeft.setMin;
        String max = getContentInsetLeft.setMax(str);
        Intrinsics.checkNotNullParameter(max, "<this>");
        boolean z = true;
        String trim = StringsKt.trim(max, '/');
        String str4 = "";
        String substringBeforeLast = StringsKt.substringBeforeLast(trim, '/', str4);
        if (substringBeforeLast.length() == 0) {
            superdispatchkeyevent2 = superdispatchkeyevent3;
        } else {
            superdispatchkeyevent2 = getMax(superdispatchkeyevent3, context2, substringBeforeLast, createMode2);
            if (superdispatchkeyevent2 == null) {
                return null;
            }
        }
        String substringAfterLast$default = StringsKt.substringAfterLast$default(trim, '/', (String) null, 2, (Object) null);
        String substringAfterLast = StringsKt.substringAfterLast(trim, '.', str4);
        if (!(substringAfterLast.length() > 0) || (str3 != null && !Intrinsics.areEqual((Object) str3, (Object) "*/*") && !Intrinsics.areEqual((Object) str3, (Object) "application/octet-stream"))) {
            substringAfterLast = getCurrentContentInsetStart.getMin(str3, trim);
        }
        String removeSuffix = StringsKt.removeSuffix(substringAfterLast$default, (CharSequence) Intrinsics.stringPlus(".", substringAfterLast));
        StringBuilder sb = new StringBuilder();
        sb.append(removeSuffix);
        sb.append('.');
        sb.append(substringAfterLast);
        String trimEnd = StringsKt.trimEnd(sb.toString(), '.');
        if (!(createMode2 == CreateMode.CREATE_NEW || (min = getMax(superdispatchkeyevent2, context2, trimEnd, false)) == null)) {
            if (createMode2 == CreateMode.REPLACE) {
                Intrinsics.checkNotNullParameter(min, "<this>");
                Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
                if (min.toIntRange() && (setMin(min) || length(min))) {
                    String min2 = min.getMin();
                    if (min2 != null) {
                        str4 = min2;
                    }
                    superDispatchKeyEvent length = min.length();
                    if (length == null || !getMax(length, context2)) {
                        z = false;
                    }
                    if (z) {
                        String max2 = min.getMax();
                        boolean unused = setMin(min, context2, false);
                        setMin(length, context2, str4, max2, CreateMode.CREATE_NEW);
                    }
                }
            } else {
                min.toFloatRange();
            }
        }
        if (setMin(superdispatchkeyevent)) {
            File length2 = length(superdispatchkeyevent, context);
            File max3 = length2 == null ? null : getContentInsetEndWithActions.getMax(length2, context2, trim, str3, createMode2);
            if (max3 == null) {
                return null;
            }
            return superDispatchKeyEvent.setMin(max3);
        }
        String min3 = getCurrentContentInsetStart.setMin(substringAfterLast);
        if (Intrinsics.areEqual((Object) min3, (Object) "*/*")) {
            min3 = "application/octet-stream";
        }
        if (Build.VERSION.SDK_INT <= 28) {
            return superdispatchkeyevent2.getMax(min3, trimEnd);
        }
        superDispatchKeyEvent max4 = superdispatchkeyevent2.getMax(min3, removeSuffix);
        if (max4 == null) {
            return null;
        }
        if (Intrinsics.areEqual((Object) min3, (Object) "application/octet-stream") && !Intrinsics.areEqual((Object) max4.getMin(), (Object) trimEnd)) {
            max4.setMax(trimEnd);
        }
        return max4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ba, code lost:
        if (r6.isDirectory() != false) goto L_0x00be;
     */
    @androidx.annotation.WorkerThread
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.JvmOverloads
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.superDispatchKeyEvent getMax(@org.jetbrains.annotations.NotNull o.superDispatchKeyEvent r19, @org.jetbrains.annotations.NotNull android.content.Context r20, @org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.NotNull com.anggrayudi.storage.file.CreateMode r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.String r3 = "<this>"
            r4 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.lang.String r5 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            java.lang.String r6 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)
            java.lang.String r7 = "mode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            boolean r8 = r19.setMax()
            r9 = 0
            if (r8 == 0) goto L_0x0163
            boolean r8 = getMax(r19, r20)
            if (r8 != 0) goto L_0x002b
            goto L_0x0163
        L_0x002b:
            boolean r8 = setMin(r19)
            r10 = 1
            if (r8 == 0) goto L_0x00c6
            java.io.File r4 = length(r19, r20)
            if (r4 == 0) goto L_0x00bd
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto L_0x00bd
            boolean r0 = o.getContentInsetEndWithActions.setMax((java.io.File) r4, (android.content.Context) r0)
            if (r0 != 0) goto L_0x0051
            goto L_0x00bd
        L_0x0051:
            o.getContentInsetLeft r0 = o.getContentInsetLeft.setMin
            o.getContentInsetLeft r0 = o.getContentInsetLeft.setMin
            java.lang.String r0 = o.getContentInsetLeft.setMax(r21)
            java.util.List r0 = o.getContentInsetLeft.getMax(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList(r0)
            java.lang.Object r1 = kotlin.collections.CollectionsKt.removeFirstOrNull(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00bd
            com.anggrayudi.storage.file.CreateMode r5 = com.anggrayudi.storage.file.CreateMode.CREATE_NEW
            if (r2 != r5) goto L_0x0073
            java.lang.String r1 = o.getContentInsetEndWithActions.setMin((java.io.File) r4, (java.lang.String) r1)
        L_0x0073:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.lang.String r5 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            java.io.File r6 = new java.io.File
            r6.<init>(r4, r1)
            com.anggrayudi.storage.file.CreateMode r1 = com.anggrayudi.storage.file.CreateMode.REPLACE
            if (r2 != r1) goto L_0x0087
            o.getContentInsetEndWithActions.setMax((java.io.File) r6, (boolean) r10)
        L_0x0087:
            r6.mkdir()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0091
            goto L_0x00b6
        L_0x0091:
            r10 = r0
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.String r0 = "/"
            r11 = r0
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 62
            r18 = 0
            java.lang.String r0 = kotlin.collections.CollectionsKt.joinToString$default(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            java.io.File r1 = new java.io.File
            r1.<init>(r6, r0)
            r1.mkdirs()
            r6 = r1
        L_0x00b6:
            boolean r0 = r6.isDirectory()
            if (r0 == 0) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r6 = r9
        L_0x00be:
            if (r6 != 0) goto L_0x00c1
            return r9
        L_0x00c1:
            o.superDispatchKeyEvent r0 = o.superDispatchKeyEvent.setMin(r6)
            return r0
        L_0x00c6:
            o.getContentInsetLeft r3 = o.getContentInsetLeft.setMin
            o.getContentInsetLeft r3 = o.getContentInsetLeft.setMin
            java.lang.String r1 = o.getContentInsetLeft.setMax(r21)
            java.util.List r1 = o.getContentInsetLeft.getMax(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = kotlin.collections.CollectionsKt.toMutableList(r1)
            java.lang.Object r3 = kotlin.collections.CollectionsKt.removeFirstOrNull(r1)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x00e1
            return r9
        L_0x00e1:
            boolean r5 = getMax(r19)
            if (r5 == 0) goto L_0x00f4
            boolean r5 = getMin(r19)
            if (r5 == 0) goto L_0x00f4
            o.superDispatchKeyEvent r4 = setMax((o.superDispatchKeyEvent) r19, (android.content.Context) r20)
            if (r4 != 0) goto L_0x00f4
            return r9
        L_0x00f4:
            o.superDispatchKeyEvent r5 = getMax((o.superDispatchKeyEvent) r4, (android.content.Context) r0, (java.lang.String) r3, false)
            if (r5 == 0) goto L_0x0122
            com.anggrayudi.storage.file.CreateMode r6 = com.anggrayudi.storage.file.CreateMode.CREATE_NEW
            if (r2 != r6) goto L_0x00ff
            goto L_0x0122
        L_0x00ff:
            com.anggrayudi.storage.file.CreateMode r6 = com.anggrayudi.storage.file.CreateMode.REPLACE
            if (r2 != r6) goto L_0x0114
            setMin(r5, r0, r10)
            boolean r2 = r5.setMax()
            if (r2 == 0) goto L_0x010d
            goto L_0x0129
        L_0x010d:
            o.superDispatchKeyEvent r5 = r4.getMin(r3)
            if (r5 != 0) goto L_0x0129
            return r9
        L_0x0114:
            boolean r2 = r5.setMax()
            if (r2 == 0) goto L_0x0121
            boolean r2 = r5.IsOverlapping()
            if (r2 == 0) goto L_0x0121
            goto L_0x0129
        L_0x0121:
            return r9
        L_0x0122:
            o.superDispatchKeyEvent r5 = r4.getMin(r3)
            if (r5 != 0) goto L_0x0129
            return r9
        L_0x0129:
            android.content.ContentResolver r2 = r20.getContentResolver()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0133:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0162
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "resolver"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)     // Catch:{ Exception -> 0x0161 }
            o.superDispatchKeyEvent r4 = setMax(r5, r0, r2, r3)     // Catch:{ Exception -> 0x0161 }
            if (r4 != 0) goto L_0x0153
            o.superDispatchKeyEvent r3 = r5.getMin(r3)     // Catch:{ Exception -> 0x0161 }
            if (r3 != 0) goto L_0x0151
            return r9
        L_0x0151:
            r5 = r3
            goto L_0x0133
        L_0x0153:
            boolean r3 = r4.setMax()     // Catch:{ Exception -> 0x0161 }
            if (r3 == 0) goto L_0x0161
            boolean r3 = r4.IsOverlapping()     // Catch:{ Exception -> 0x0161 }
            if (r3 == 0) goto L_0x0161
            r5 = r4
            goto L_0x0133
        L_0x0161:
            return r9
        L_0x0162:
            return r5
        L_0x0163:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentInsetStartWithNavigation.getMax(o.superDispatchKeyEvent, android.content.Context, java.lang.String, com.anggrayudi.storage.file.CreateMode):o.superDispatchKeyEvent");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        if (new kotlin.text.Regex("/tree/downloads/document/ms[f,d]:\\d+").matches(r1) == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c2, code lost:
        if (new kotlin.text.Regex("/document/\\d+").matches(r8) != false) goto L_0x00c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ca A[RETURN] */
    @androidx.annotation.WorkerThread
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final o.superDispatchKeyEvent setMax(@org.jetbrains.annotations.NotNull o.superDispatchKeyEvent r11, @org.jetbrains.annotations.NotNull android.content.Context r12) {
        /*
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            boolean r1 = getMax(r11)
            r6 = 0
            if (r1 == 0) goto L_0x00cb
            android.net.Uri r1 = r11.setMin()
            java.lang.String r1 = r1.getPath()
            java.lang.String r7 = ""
            if (r1 != 0) goto L_0x001f
            r8 = r7
            goto L_0x0020
        L_0x001f:
            r8 = r1
        L_0x0020:
            android.net.Uri r1 = r11.setMin()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "content://com.android.providers.downloads.documents/tree/downloads/document/downloads"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x0038
            boolean r1 = getMax(r11, r12)
            if (r1 == 0) goto L_0x0037
            return r11
        L_0x0037:
            return r6
        L_0x0038:
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "/tree/downloads/document/raw:"
            r3 = 29
            r4 = 0
            r9 = 2
            if (r1 < r3) goto L_0x0075
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r2, r4, r9, r6)
            java.lang.String r10 = "/document/raw:"
            if (r1 != 0) goto L_0x0050
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r10, r4, r9, r6)
            if (r1 == 0) goto L_0x0075
        L_0x0050:
            com.anggrayudi.storage.file.PublicDirectory r1 = com.anggrayudi.storage.file.PublicDirectory.DOWNLOADS
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 12
            r0 = r12
            o.superDispatchKeyEvent r0 = o.getContentInsetLeft.getMax(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x005f
            return r6
        L_0x005f:
            java.lang.String r1 = kotlin.text.StringsKt.substringAfterLast$default((java.lang.String) r8, (java.lang.String) r10, (java.lang.String) r6, (int) r9, (java.lang.Object) r6)
            java.lang.String r2 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.lang.String r3 = "/"
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r2)
            java.lang.String r1 = kotlin.text.StringsKt.substringAfter((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r7)
            r2 = 1
            o.superDispatchKeyEvent r0 = getMax((o.superDispatchKeyEvent) r0, (android.content.Context) r12, (java.lang.String) r1, (boolean) r2)
            return r0
        L_0x0075:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r3) goto L_0x00a3
            r1 = r8
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            kotlin.text.Regex r5 = new kotlin.text.Regex
            java.lang.String r7 = "/document/ms[f,d]:\\d+"
            r5.<init>((java.lang.String) r7)
            boolean r5 = r5.matches(r1)
            if (r5 != 0) goto L_0x00c4
            kotlin.text.Regex r5 = new kotlin.text.Regex
            java.lang.String r7 = "/tree/ms[f,d]:\\d+(.*?)"
            r5.<init>((java.lang.String) r7)
            boolean r5 = r5.matches(r1)
            if (r5 != 0) goto L_0x00c4
            kotlin.text.Regex r5 = new kotlin.text.Regex
            java.lang.String r7 = "/tree/downloads/document/ms[f,d]:\\d+"
            r5.<init>((java.lang.String) r7)
            boolean r1 = r5.matches(r1)
            if (r1 != 0) goto L_0x00c4
        L_0x00a3:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 >= r3) goto L_0x00cb
            java.lang.String r1 = "/tree/raw:"
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r1, r4, r9, r6)
            if (r1 != 0) goto L_0x00c4
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r2, r4, r9, r6)
            if (r1 != 0) goto L_0x00c4
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            kotlin.text.Regex r1 = new kotlin.text.Regex
            java.lang.String r2 = "/document/\\d+"
            r1.<init>((java.lang.String) r2)
            boolean r1 = r1.matches(r8)
            if (r1 == 0) goto L_0x00cb
        L_0x00c4:
            boolean r1 = getMax(r11, r12)
            if (r1 == 0) goto L_0x00cb
            return r11
        L_0x00cb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentInsetStartWithNavigation.setMax(o.superDispatchKeyEvent, android.content.Context):o.superDispatchKeyEvent");
    }

    public static /* synthetic */ List length(superDispatchKeyEvent superdispatchkeyevent, String[] strArr, Regex regex) {
        boolean z;
        DocumentFileType documentFileType = DocumentFileType.ANY;
        Intrinsics.checkNotNullParameter(superdispatchkeyevent, "<this>");
        Intrinsics.checkNotNullParameter(documentFileType, "documentType");
        Intrinsics.checkNotNullParameter("", "name");
        if (!superdispatchkeyevent.setMax() || !superdispatchkeyevent.IsOverlapping()) {
            return CollectionsKt.emptyList();
        }
        Thread currentThread = Thread.currentThread();
        int i = 0;
        while (true) {
            if (i > 0) {
                z = false;
                break;
            } else if (Intrinsics.areEqual((Object) strArr[0], (Object) "*/*")) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            Intrinsics.checkNotNullExpressionValue(currentThread, "thread");
            return getMax(superdispatchkeyevent, documentFileType, new String[0], "", regex, currentThread);
        }
        DocumentFileType documentFileType2 = DocumentFileType.FILE;
        Intrinsics.checkNotNullExpressionValue(currentThread, "thread");
        return getMax(superdispatchkeyevent, documentFileType2, strArr, "", regex, currentThread);
    }

    private static final boolean setMax(superDispatchKeyEvent superdispatchkeyevent, String[] strArr) {
        String str;
        if (!(strArr.length == 0)) {
            Intrinsics.checkNotNullParameter(superdispatchkeyevent, "<this>");
            String str2 = null;
            if (superdispatchkeyevent.setMax()) {
                str = null;
            } else {
                String min = superdispatchkeyevent.getMin();
                if (min == null) {
                    min = "";
                }
                str = getCurrentContentInsetStart.setMin(StringsKt.substringAfterLast(min, '.', ""));
                if (Intrinsics.areEqual((Object) str, (Object) "*/*")) {
                    str = superdispatchkeyevent.getMax();
                }
            }
            if (str != null) {
                String[] split = str.split("/");
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String str3 = strArr[i];
                    if (open.setMax(split, str3.split("/"))) {
                        str2 = str3;
                        break;
                    }
                    i++;
                }
            }
            CharSequence charSequence = str2;
            return !(charSequence == null || charSequence.length() == 0);
        }
    }

    private static final List<superDispatchKeyEvent> getMax(superDispatchKeyEvent superdispatchkeyevent, DocumentFileType documentFileType, String[] strArr, String str, Regex regex, Thread thread) {
        DocumentFileType documentFileType2 = documentFileType;
        String str2 = str;
        Regex regex2 = regex;
        List<superDispatchKeyEvent> arrayList = new ArrayList<>();
        superDispatchKeyEvent[] FastBitmap$CoordinateSystem = superdispatchkeyevent.FastBitmap$CoordinateSystem();
        Intrinsics.checkNotNullExpressionValue(FastBitmap$CoordinateSystem, "listFiles()");
        int length = FastBitmap$CoordinateSystem.length;
        int i = 0;
        while (i < length) {
            superDispatchKeyEvent superdispatchkeyevent2 = FastBitmap$CoordinateSystem[i];
            int i2 = i + 1;
            if (thread.isInterrupted()) {
                break;
            }
            if (superdispatchkeyevent.IsOverlapping()) {
                String str3 = "";
                boolean z = true;
                if (!superdispatchkeyevent2.toFloatRange()) {
                    String[] strArr2 = strArr;
                    if (documentFileType2 != DocumentFileType.FILE) {
                        String min = superdispatchkeyevent2.getMin();
                        if (min != null) {
                            str3 = min;
                        }
                        if (str2.length() != 0) {
                            z = false;
                        }
                        if ((z || Intrinsics.areEqual((Object) str3, (Object) str2)) && (regex2 == null || regex2.matches(str3))) {
                            Intrinsics.checkNotNullExpressionValue(superdispatchkeyevent2, "file");
                            arrayList.add(superdispatchkeyevent2);
                        }
                    }
                    Intrinsics.checkNotNullExpressionValue(superdispatchkeyevent2, "file");
                    arrayList.addAll(getMax(superdispatchkeyevent2, documentFileType, strArr, str, regex, thread));
                } else if (documentFileType2 != DocumentFileType.FOLDER) {
                    String min2 = superdispatchkeyevent2.getMin();
                    if (min2 != null) {
                        str3 = min2;
                    }
                    if (str2.length() != 0) {
                        z = false;
                    }
                    if ((z || Intrinsics.areEqual((Object) str3, (Object) str2)) && (regex2 == null || regex2.matches(str3))) {
                        Intrinsics.checkNotNullExpressionValue(superdispatchkeyevent2, "file");
                        if (setMax(superdispatchkeyevent2, strArr)) {
                            arrayList.add(superdispatchkeyevent2);
                        }
                    }
                }
                i = i2;
            }
            String[] strArr3 = strArr;
            i = i2;
        }
        return arrayList;
    }

    @WorkerThread
    @JvmOverloads
    private static boolean setMax(@NotNull superDispatchKeyEvent superdispatchkeyevent, @NotNull Context context, boolean z) {
        List<superDispatchKeyEvent> list;
        Intrinsics.checkNotNullParameter(superdispatchkeyevent, "<this>");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        if (superdispatchkeyevent.setMax() && superdispatchkeyevent.IsOverlapping()) {
            if (getMax(superdispatchkeyevent)) {
                superDispatchKeyEvent max = setMax(superdispatchkeyevent, context);
                if (max == null) {
                    return false;
                }
                list = setMax(max);
            } else {
                list = setMax(superdispatchkeyevent);
            }
            int size = list.size();
            int size2 = list.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i = size2 - 1;
                    if (list.get(size2).equals()) {
                        size--;
                    }
                    if (i < 0) {
                        break;
                    }
                    size2 = i;
                }
            }
            if (size != 0 || (!z && !superdispatchkeyevent.equals() && superdispatchkeyevent.toIntRange())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    @WorkerThread
    @JvmOverloads
    public static boolean setMin(@NotNull superDispatchKeyEvent superdispatchkeyevent, @NotNull Context context, boolean z) {
        Intrinsics.checkNotNullParameter(superdispatchkeyevent, "<this>");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        if (superdispatchkeyevent.setMax()) {
            return setMax(superdispatchkeyevent, context, z);
        }
        return superdispatchkeyevent.equals() || !superdispatchkeyevent.toIntRange();
    }

    private static final List<superDispatchKeyEvent> setMax(superDispatchKeyEvent superdispatchkeyevent) {
        List<superDispatchKeyEvent> arrayList = new ArrayList<>();
        superDispatchKeyEvent[] FastBitmap$CoordinateSystem = superdispatchkeyevent.FastBitmap$CoordinateSystem();
        Intrinsics.checkNotNullExpressionValue(FastBitmap$CoordinateSystem, "listFiles()");
        for (Object obj : (Object[]) FastBitmap$CoordinateSystem) {
            superDispatchKeyEvent superdispatchkeyevent2 = (superDispatchKeyEvent) obj;
            if (!superdispatchkeyevent2.equals()) {
                Intrinsics.checkNotNullExpressionValue(superdispatchkeyevent2, "it");
                arrayList.add(superdispatchkeyevent2);
            }
            if (superdispatchkeyevent2.setMax()) {
                Intrinsics.checkNotNullExpressionValue(superdispatchkeyevent2, "it");
                arrayList.addAll(setMax(superdispatchkeyevent2));
            }
        }
        return arrayList;
    }
}
