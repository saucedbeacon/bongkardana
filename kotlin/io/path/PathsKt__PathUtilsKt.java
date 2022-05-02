package kotlin.io.path;

import com.iap.ac.android.common.BuildConfig;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000²\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0001H\b\u001a*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00012\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001a\"\u00020\u0001H\b¢\u0006\u0002\u0010\u001b\u001a?\u0010\u001c\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0007¢\u0006\u0002\u0010!\u001a6\u0010\u001c\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\b¢\u0006\u0002\u0010\"\u001aK\u0010#\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0007¢\u0006\u0002\u0010%\u001aB\u0010#\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\b¢\u0006\u0002\u0010&\u001a\u001c\u0010'\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010)\u001a\u0006\u0012\u0002\b\u00030*H\u0001\u001a\r\u0010+\u001a\u00020\u0002*\u00020\u0002H\b\u001a\r\u0010,\u001a\u00020\u0001*\u00020\u0002H\b\u001a.\u0010-\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u0002000\u001a\"\u000200H\b¢\u0006\u0002\u00101\u001a\u001f\u0010-\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u000203H\b\u001a.\u00104\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\b¢\u0006\u0002\u00105\u001a.\u00106\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\b¢\u0006\u0002\u00105\u001a.\u00107\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\b¢\u0006\u0002\u00105\u001a\u0015\u00108\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\b\u001a6\u00109\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\b¢\u0006\u0002\u0010:\u001a\r\u0010;\u001a\u00020<*\u00020\u0002H\b\u001a\r\u0010=\u001a\u000203*\u00020\u0002H\b\u001a\u0015\u0010>\u001a\u00020\u0002*\u00020\u00022\u0006\u0010?\u001a\u00020\u0002H\n\u001a\u0015\u0010>\u001a\u00020\u0002*\u00020\u00022\u0006\u0010?\u001a\u00020\u0001H\n\u001a&\u0010@\u001a\u000203*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\b¢\u0006\u0002\u0010B\u001a2\u0010C\u001a\u0002HD\"\n\b\u0000\u0010D\u0018\u0001*\u00020E*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\b¢\u0006\u0002\u0010F\u001a4\u0010G\u001a\u0004\u0018\u0001HD\"\n\b\u0000\u0010D\u0018\u0001*\u00020E*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\b¢\u0006\u0002\u0010F\u001a\r\u0010H\u001a\u00020I*\u00020\u0002H\b\u001a\r\u0010J\u001a\u00020K*\u00020\u0002H\b\u001a.\u0010L\u001a\u00020<*\u00020\u00022\b\b\u0002\u0010M\u001a\u00020\u00012\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020<0OH\bø\u0001\u0000\u001a0\u0010P\u001a\u0004\u0018\u00010Q*\u00020\u00022\u0006\u0010R\u001a\u00020\u00012\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\b¢\u0006\u0002\u0010S\u001a&\u0010T\u001a\u00020U*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\b¢\u0006\u0002\u0010V\u001a(\u0010W\u001a\u0004\u0018\u00010X*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\b¢\u0006\u0002\u0010Y\u001a,\u0010Z\u001a\b\u0012\u0004\u0012\u00020\\0[*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\b¢\u0006\u0002\u0010]\u001a&\u0010^\u001a\u000203*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\b¢\u0006\u0002\u0010B\u001a\r\u0010_\u001a\u000203*\u00020\u0002H\b\u001a\r\u0010`\u001a\u000203*\u00020\u0002H\b\u001a\r\u0010a\u001a\u000203*\u00020\u0002H\b\u001a&\u0010b\u001a\u000203*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\b¢\u0006\u0002\u0010B\u001a\u0015\u0010c\u001a\u000203*\u00020\u00022\u0006\u0010?\u001a\u00020\u0002H\b\u001a\r\u0010d\u001a\u000203*\u00020\u0002H\b\u001a\r\u0010e\u001a\u000203*\u00020\u0002H\b\u001a\u001c\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00020g*\u00020\u00022\b\b\u0002\u0010M\u001a\u00020\u0001H\u0007\u001a.\u0010h\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u0002000\u001a\"\u000200H\b¢\u0006\u0002\u00101\u001a\u001f\u0010h\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u000203H\b\u001a&\u0010i\u001a\u000203*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\b¢\u0006\u0002\u0010B\u001a2\u0010j\u001a\u0002Hk\"\n\b\u0000\u0010k\u0018\u0001*\u00020l*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\b¢\u0006\u0002\u0010m\u001a<\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010Q0n*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00012\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\b¢\u0006\u0002\u0010o\u001a\r\u0010p\u001a\u00020\u0002*\u00020\u0002H\b\u001a\u0014\u0010q\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a\u0016\u0010r\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a\u0014\u0010s\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a8\u0010t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010R\u001a\u00020\u00012\b\u0010u\u001a\u0004\u0018\u00010Q2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\b¢\u0006\u0002\u0010v\u001a\u0015\u0010w\u001a\u00020\u0002*\u00020\u00022\u0006\u0010u\u001a\u00020UH\b\u001a\u0015\u0010x\u001a\u00020\u0002*\u00020\u00022\u0006\u0010u\u001a\u00020XH\b\u001a\u001b\u0010y\u001a\u00020\u0002*\u00020\u00022\f\u0010u\u001a\b\u0012\u0004\u0012\u00020\\0[H\b\u001a\r\u0010z\u001a\u00020\u0002*\u00020{H\b\u001a@\u0010|\u001a\u0002H}\"\u0004\b\u0000\u0010}*\u00020\u00022\b\b\u0002\u0010M\u001a\u00020\u00012\u0018\u0010~\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0012\u0004\u0012\u0002H}0OH\bø\u0001\u0000¢\u0006\u0003\u0010\u0001\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"\u001e\u0010\n\u001a\u00020\u0001*\u00020\u00028FX\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\"\u001e\u0010\r\u001a\u00020\u0001*\u00020\u00028FX\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00028FX\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\"\u001f\u0010\u0013\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0001"}, d2 = {"extension", "", "Ljava/nio/file/Path;", "getExtension$annotations", "(Ljava/nio/file/Path;)V", "getExtension", "(Ljava/nio/file/Path;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath$annotations", "getInvariantSeparatorsPath", "invariantSeparatorsPathString", "getInvariantSeparatorsPathString$annotations", "getInvariantSeparatorsPathString", "name", "getName$annotations", "getName", "nameWithoutExtension", "getNameWithoutExtension$annotations", "getNameWithoutExtension", "pathString", "getPathString$annotations", "getPathString", "Path", "path", "base", "subpaths", "", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", "createTempDirectory", "directory", "prefix", "attributes", "Ljava/nio/file/attribute/FileAttribute;", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createTempFile", "suffix", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "fileAttributeViewNotAvailable", "", "attributeViewClass", "Ljava/lang/Class;", "absolute", "absolutePathString", "copyTo", "target", "options", "Ljava/nio/file/CopyOption;", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;", "overwrite", "", "createDirectories", "(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createDirectory", "createFile", "createLinkPointingTo", "createSymbolicLinkPointingTo", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "deleteExisting", "", "deleteIfExists", "div", "other", "exists", "Ljava/nio/file/LinkOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "fileAttributesView", "V", "Ljava/nio/file/attribute/FileAttributeView;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileAttributeView;", "fileAttributesViewOrNull", "fileSize", "", "fileStore", "Ljava/nio/file/FileStore;", "forEachDirectoryEntry", "glob", "action", "Lkotlin/Function1;", "getAttribute", "", "attribute", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "getLastModifiedTime", "Ljava/nio/file/attribute/FileTime;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;", "getOwner", "Ljava/nio/file/attribute/UserPrincipal;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/UserPrincipal;", "getPosixFilePermissions", "", "Ljava/nio/file/attribute/PosixFilePermission;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/util/Set;", "isDirectory", "isExecutable", "isHidden", "isReadable", "isRegularFile", "isSameFileAs", "isSymbolicLink", "isWritable", "listDirectoryEntries", "", "moveTo", "notExists", "readAttributes", "A", "Ljava/nio/file/attribute/BasicFileAttributes;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;", "", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/util/Map;", "readSymbolicLink", "relativeTo", "relativeToOrNull", "relativeToOrSelf", "setAttribute", "value", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/Object;[Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;", "setLastModifiedTime", "setOwner", "setPosixFilePermissions", "toPath", "Ljava/net/URI;", "useDirectoryEntries", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/nio/file/Path;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 4, 1}, xi = 1, xs = "kotlin/io/path/PathsKt")
class PathsKt__PathUtilsKt extends PathsKt__PathReadWriteKt {
    @SinceKotlin(version = "1.4")
    @ExperimentalPathApi
    public static /* synthetic */ void getExtension$annotations(Path path) {
    }

    @Deprecated(message = "Use invariantSeparatorsPathString property instead.", replaceWith = @ReplaceWith(expression = "invariantSeparatorsPathString", imports = {}))
    @SinceKotlin(version = "1.4")
    @ExperimentalPathApi
    public static /* synthetic */ void getInvariantSeparatorsPath$annotations(Path path) {
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalPathApi
    public static /* synthetic */ void getInvariantSeparatorsPathString$annotations(Path path) {
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalPathApi
    public static /* synthetic */ void getName$annotations(Path path) {
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalPathApi
    public static /* synthetic */ void getNameWithoutExtension$annotations(Path path) {
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    public static /* synthetic */ void getPathString$annotations(Path path) {
    }

    @NotNull
    public static final String getName(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "$this$name");
        Path fileName = path.getFileName();
        String obj = fileName != null ? fileName.toString() : null;
        return obj == null ? "" : obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r3 = kotlin.text.StringsKt.substringBeforeLast$default((r3 = r3.toString()), ".", (java.lang.String) null, 2, (java.lang.Object) null);
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String getNameWithoutExtension(@org.jetbrains.annotations.NotNull java.nio.file.Path r3) {
        /*
            java.lang.String r0 = "$this$nameWithoutExtension"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.nio.file.Path r3 = r3.getFileName()
            if (r3 == 0) goto L_0x001b
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L_0x001b
            r0 = 2
            r1 = 0
            java.lang.String r2 = "."
            java.lang.String r3 = kotlin.text.StringsKt.substringBeforeLast$default((java.lang.String) r3, (java.lang.String) r2, (java.lang.String) r1, (int) r0, (java.lang.Object) r1)
            if (r3 != 0) goto L_0x001d
        L_0x001b:
            java.lang.String r3 = ""
        L_0x001d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathsKt__PathUtilsKt.getNameWithoutExtension(java.nio.file.Path):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r2 = kotlin.text.StringsKt.substringAfterLast((r2 = r2.toString()), '.', "");
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String getExtension(@org.jetbrains.annotations.NotNull java.nio.file.Path r2) {
        /*
            java.lang.String r0 = "$this$extension"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.nio.file.Path r2 = r2.getFileName()
            java.lang.String r0 = ""
            if (r2 == 0) goto L_0x001d
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L_0x001d
            r1 = 46
            java.lang.String r2 = kotlin.text.StringsKt.substringAfterLast((java.lang.String) r2, (char) r1, (java.lang.String) r0)
            if (r2 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r2
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathsKt__PathUtilsKt.getExtension(java.nio.file.Path):java.lang.String");
    }

    private static final String getPathString(Path path) {
        return path.toString();
    }

    @NotNull
    public static final String getInvariantSeparatorsPathString(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "$this$invariantSeparatorsPathString");
        FileSystem fileSystem = path.getFileSystem();
        Intrinsics.checkNotNullExpressionValue(fileSystem, "fileSystem");
        String separator = fileSystem.getSeparator();
        if (!(!Intrinsics.areEqual((Object) separator, (Object) "/"))) {
            return path.toString();
        }
        String obj = path.toString();
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        return StringsKt.replace$default(obj, separator, "/", false, 4, (Object) null);
    }

    @NotNull
    public static final String getInvariantSeparatorsPath(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "$this$invariantSeparatorsPath");
        return PathsKt.getInvariantSeparatorsPathString(path);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path absolute(Path path) {
        Path absolutePath = path.toAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "toAbsolutePath()");
        return absolutePath;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final String absolutePathString(Path path) {
        return path.toAbsolutePath().toString();
    }

    @NotNull
    @SinceKotlin(version = "1.4")
    @ExperimentalPathApi
    public static final Path relativeTo(@NotNull Path path, @NotNull Path path2) {
        Intrinsics.checkNotNullParameter(path, "$this$relativeTo");
        Intrinsics.checkNotNullParameter(path2, BuildConfig.FLAVOR);
        try {
            return PathRelativizer.INSTANCE.tryRelativeTo(path, path2);
        } catch (IllegalArgumentException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder("\nthis path: ");
            sb.append(path);
            sb.append("\nbase path: ");
            sb.append(path2);
            throw new IllegalArgumentException(Intrinsics.stringPlus(message, sb.toString()), e);
        }
    }

    @NotNull
    @SinceKotlin(version = "1.4")
    @ExperimentalPathApi
    public static final Path relativeToOrSelf(@NotNull Path path, @NotNull Path path2) {
        Intrinsics.checkNotNullParameter(path, "$this$relativeToOrSelf");
        Intrinsics.checkNotNullParameter(path2, BuildConfig.FLAVOR);
        Path relativeToOrNull = PathsKt.relativeToOrNull(path, path2);
        return relativeToOrNull == null ? path : relativeToOrNull;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    @ExperimentalPathApi
    public static final Path relativeToOrNull(@NotNull Path path, @NotNull Path path2) {
        Intrinsics.checkNotNullParameter(path, "$this$relativeToOrNull");
        Intrinsics.checkNotNullParameter(path2, BuildConfig.FLAVOR);
        try {
            return PathRelativizer.INSTANCE.tryRelativeTo(path, path2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path copyTo(Path path, Path path2, boolean z) {
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(copy, "Files.copy(this, target, *options)");
        return copy;
    }

    static /* synthetic */ Path copyTo$default(Path path, Path path2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(copy, "Files.copy(this, target, *options)");
        return copy;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path copyTo(Path path, Path path2, CopyOption... copyOptionArr) {
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(copy, "Files.copy(this, target, *options)");
        return copy;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final boolean exists(Path path, LinkOption... linkOptionArr) {
        return Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final boolean notExists(Path path, LinkOption... linkOptionArr) {
        return Files.notExists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final boolean isRegularFile(Path path, LinkOption... linkOptionArr) {
        return Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final boolean isDirectory(Path path, LinkOption... linkOptionArr) {
        return Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final boolean isSymbolicLink(Path path) {
        return Files.isSymbolicLink(path);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final boolean isExecutable(Path path) {
        return Files.isExecutable(path);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final boolean isHidden(Path path) {
        return Files.isHidden(path);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final boolean isReadable(Path path) {
        return Files.isReadable(path);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final boolean isWritable(Path path) {
        return Files.isWritable(path);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final boolean isSameFileAs(Path path, Path path2) {
        return Files.isSameFile(path, path2);
    }

    public static /* synthetic */ List listDirectoryEntries$default(Path path, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "*";
        }
        return PathsKt.listDirectoryEntries(path, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        kotlin.io.CloseableKt.closeFinally(r1, r2);
     */
    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    @kotlin.io.path.ExperimentalPathApi
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<java.nio.file.Path> listDirectoryEntries(@org.jetbrains.annotations.NotNull java.nio.file.Path r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            java.lang.String r0 = "$this$listDirectoryEntries"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "glob"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.nio.file.DirectoryStream r1 = java.nio.file.Files.newDirectoryStream(r1, r2)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r2 = r1
            java.nio.file.DirectoryStream r2 = (java.nio.file.DirectoryStream) r2     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)     // Catch:{ all -> 0x0023 }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x0023 }
            java.util.List r2 = kotlin.collections.CollectionsKt.toList(r2)     // Catch:{ all -> 0x0023 }
            r0 = 0
            kotlin.io.CloseableKt.closeFinally(r1, r0)
            return r2
        L_0x0023:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathsKt__PathUtilsKt.listDirectoryEntries(java.nio.file.Path, java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r3 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        kotlin.io.CloseableKt.closeFinally(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        throw r1;
     */
    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.io.path.ExperimentalPathApi
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <T> T useDirectoryEntries(java.nio.file.Path r3, java.lang.String r4, kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<? extends java.nio.file.Path>, ? extends T> r5) {
        /*
            java.nio.file.DirectoryStream r3 = java.nio.file.Files.newDirectoryStream(r3, r4)
            java.io.Closeable r3 = (java.io.Closeable) r3
            r4 = 0
            r0 = 1
            r1 = r3
            java.nio.file.DirectoryStream r1 = (java.nio.file.DirectoryStream) r1     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch:{ all -> 0x0031 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0031 }
            kotlin.sequences.Sequence r1 = kotlin.collections.CollectionsKt.asSequence(r1)     // Catch:{ all -> 0x0031 }
            java.lang.Object r5 = r5.invoke(r1)     // Catch:{ all -> 0x0031 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            boolean r4 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r0, r0, r4)
            if (r4 == 0) goto L_0x0028
            r4 = 0
            kotlin.io.CloseableKt.closeFinally(r3, r4)
            goto L_0x002d
        L_0x0028:
            if (r3 == 0) goto L_0x002d
            r3.close()
        L_0x002d:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return r5
        L_0x0031:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            boolean r4 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r0, r0, r4)
            if (r4 != 0) goto L_0x0043
            if (r3 == 0) goto L_0x0046
            r3.close()     // Catch:{ all -> 0x0046 }
            goto L_0x0046
        L_0x0043:
            kotlin.io.CloseableKt.closeFinally(r3, r5)
        L_0x0046:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathsKt__PathUtilsKt.useDirectoryEntries(java.nio.file.Path, java.lang.String, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r1 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        kotlin.io.CloseableKt.closeFinally(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object useDirectoryEntries$default(java.nio.file.Path r1, java.lang.String r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
        /*
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0006
            java.lang.String r2 = "*"
        L_0x0006:
            java.nio.file.DirectoryStream r1 = java.nio.file.Files.newDirectoryStream(r1, r2)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r2 = 0
            r4 = r1
            java.nio.file.DirectoryStream r4 = (java.nio.file.DirectoryStream) r4     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)     // Catch:{ all -> 0x0036 }
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ all -> 0x0036 }
            kotlin.sequences.Sequence r4 = kotlin.collections.CollectionsKt.asSequence(r4)     // Catch:{ all -> 0x0036 }
            java.lang.Object r3 = r3.invoke(r4)     // Catch:{ all -> 0x0036 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            boolean r2 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r5, r5, r2)
            if (r2 == 0) goto L_0x002d
            r2 = 0
            kotlin.io.CloseableKt.closeFinally(r1, r2)
            goto L_0x0032
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.close()
        L_0x0032:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
            return r3
        L_0x0036:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r4 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            boolean r2 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r5, r5, r2)
            if (r2 != 0) goto L_0x0048
            if (r1 == 0) goto L_0x004b
            r1.close()     // Catch:{ all -> 0x004b }
            goto L_0x004b
        L_0x0048:
            kotlin.io.CloseableKt.closeFinally(r1, r3)
        L_0x004b:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathsKt__PathUtilsKt.useDirectoryEntries$default(java.nio.file.Path, java.lang.String, kotlin.jvm.functions.Function1, int, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0) == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r3 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        kotlin.io.CloseableKt.closeFinally(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        throw r1;
     */
    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.io.path.ExperimentalPathApi
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void forEachDirectoryEntry(java.nio.file.Path r3, java.lang.String r4, kotlin.jvm.functions.Function1<? super java.nio.file.Path, kotlin.Unit> r5) {
        /*
            java.nio.file.DirectoryStream r3 = java.nio.file.Files.newDirectoryStream(r3, r4)
            java.io.Closeable r3 = (java.io.Closeable) r3
            r4 = 0
            r0 = 1
            r1 = r3
            java.nio.file.DirectoryStream r1 = (java.nio.file.DirectoryStream) r1     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch:{ all -> 0x003d }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x003d }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x003d }
        L_0x0016:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0024
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x003d }
            r5.invoke(r2)     // Catch:{ all -> 0x003d }
            goto L_0x0016
        L_0x0024:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x003d }
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            boolean r4 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r0, r0, r4)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            kotlin.io.CloseableKt.closeFinally(r3, r4)
            goto L_0x0039
        L_0x0034:
            if (r3 == 0) goto L_0x0039
            r3.close()
        L_0x0039:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return
        L_0x003d:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x003f }
        L_0x003f:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            boolean r4 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r0, r0, r4)
            if (r4 != 0) goto L_0x004f
            if (r3 == 0) goto L_0x0052
            r3.close()     // Catch:{ all -> 0x0052 }
            goto L_0x0052
        L_0x004f:
            kotlin.io.CloseableKt.closeFinally(r3, r5)
        L_0x0052:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            goto L_0x0057
        L_0x0056:
            throw r1
        L_0x0057:
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathsKt__PathUtilsKt.forEachDirectoryEntry(java.nio.file.Path, java.lang.String, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0) == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        if (r1 != null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        kotlin.io.CloseableKt.closeFinally(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void forEachDirectoryEntry$default(java.nio.file.Path r1, java.lang.String r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
        /*
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0006
            java.lang.String r2 = "*"
        L_0x0006:
            java.nio.file.DirectoryStream r1 = java.nio.file.Files.newDirectoryStream(r1, r2)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r2 = 0
            r4 = r1
            java.nio.file.DirectoryStream r4 = (java.nio.file.DirectoryStream) r4     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)     // Catch:{ all -> 0x0042 }
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ all -> 0x0042 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0042 }
        L_0x001b:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0042 }
            r3.invoke(r0)     // Catch:{ all -> 0x0042 }
            goto L_0x001b
        L_0x0029:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            boolean r2 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r5, r5, r2)
            if (r2 == 0) goto L_0x0039
            r2 = 0
            kotlin.io.CloseableKt.closeFinally(r1, r2)
            goto L_0x003e
        L_0x0039:
            if (r1 == 0) goto L_0x003e
            r1.close()
        L_0x003e:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
            return
        L_0x0042:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r4 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            boolean r2 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r5, r5, r2)
            if (r2 != 0) goto L_0x0054
            if (r1 == 0) goto L_0x0057
            r1.close()     // Catch:{ all -> 0x0057 }
            goto L_0x0057
        L_0x0054:
            kotlin.io.CloseableKt.closeFinally(r1, r3)
        L_0x0057:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
            goto L_0x005c
        L_0x005b:
            throw r4
        L_0x005c:
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathsKt__PathUtilsKt.forEachDirectoryEntry$default(java.nio.file.Path, java.lang.String, kotlin.jvm.functions.Function1, int, java.lang.Object):void");
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final long fileSize(Path path) {
        return Files.size(path);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final void deleteExisting(Path path) {
        Files.delete(path);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final boolean deleteIfExists(Path path) {
        return Files.deleteIfExists(path);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path createDirectory(Path path, FileAttribute<?>... fileAttributeArr) {
        Path createDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(createDirectory, "Files.createDirectory(this, *attributes)");
        return createDirectory;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path createDirectories(Path path, FileAttribute<?>... fileAttributeArr) {
        Path createDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(createDirectories, "Files.createDirectories(this, *attributes)");
        return createDirectories;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path moveTo(Path path, Path path2, CopyOption... copyOptionArr) {
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(move, "Files.move(this, target, *options)");
        return move;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path moveTo(Path path, Path path2, boolean z) {
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(move, "Files.move(this, target, *options)");
        return move;
    }

    static /* synthetic */ Path moveTo$default(Path path, Path path2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(move, "Files.move(this, target, *options)");
        return move;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final FileStore fileStore(Path path) {
        FileStore fileStore = Files.getFileStore(path);
        Intrinsics.checkNotNullExpressionValue(fileStore, "Files.getFileStore(this)");
        return fileStore;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Object getAttribute(Path path, String str, LinkOption... linkOptionArr) {
        return Files.getAttribute(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path setAttribute(Path path, String str, Object obj, LinkOption... linkOptionArr) {
        Path attribute = Files.setAttribute(path, str, obj, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(attribute, "Files.setAttribute(this,…tribute, value, *options)");
        return attribute;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final /* synthetic */ <V extends FileAttributeView> V fileAttributesView(Path path, LinkOption... linkOptionArr) {
        Intrinsics.reifiedOperationMarker(4, "V");
        V fileAttributeView = Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (fileAttributeView != null) {
            return fileAttributeView;
        }
        Intrinsics.reifiedOperationMarker(4, "V");
        PathsKt.fileAttributeViewNotAvailable(path, FileAttributeView.class);
        throw new KotlinNothingValueException();
    }

    @NotNull
    @PublishedApi
    public static final Void fileAttributeViewNotAvailable(@NotNull Path path, @NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(cls, "attributeViewClass");
        StringBuilder sb = new StringBuilder("The desired attribute view type ");
        sb.append(cls);
        sb.append(" is not available for the file ");
        sb.append(path);
        sb.append('.');
        throw new UnsupportedOperationException(sb.toString());
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final /* synthetic */ <A extends BasicFileAttributes> A readAttributes(Path path, LinkOption... linkOptionArr) {
        Intrinsics.reifiedOperationMarker(4, "A");
        A readAttributes = Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(readAttributes, "Files.readAttributes(thi… A::class.java, *options)");
        return readAttributes;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Map<String, Object> readAttributes(Path path, String str, LinkOption... linkOptionArr) {
        Map<String, Object> readAttributes = Files.readAttributes(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(readAttributes, "Files.readAttributes(this, attributes, *options)");
        return readAttributes;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final FileTime getLastModifiedTime(Path path, LinkOption... linkOptionArr) {
        FileTime lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(lastModifiedTime, "Files.getLastModifiedTime(this, *options)");
        return lastModifiedTime;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path setLastModifiedTime(Path path, FileTime fileTime) {
        Path lastModifiedTime = Files.setLastModifiedTime(path, fileTime);
        Intrinsics.checkNotNullExpressionValue(lastModifiedTime, "Files.setLastModifiedTime(this, value)");
        return lastModifiedTime;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final UserPrincipal getOwner(Path path, LinkOption... linkOptionArr) {
        return Files.getOwner(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path setOwner(Path path, UserPrincipal userPrincipal) {
        Path owner = Files.setOwner(path, userPrincipal);
        Intrinsics.checkNotNullExpressionValue(owner, "Files.setOwner(this, value)");
        return owner;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Set<PosixFilePermission> getPosixFilePermissions(Path path, LinkOption... linkOptionArr) {
        Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(posixFilePermissions, "Files.getPosixFilePermissions(this, *options)");
        return posixFilePermissions;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path setPosixFilePermissions(Path path, Set<? extends PosixFilePermission> set) {
        Path posixFilePermissions = Files.setPosixFilePermissions(path, set);
        Intrinsics.checkNotNullExpressionValue(posixFilePermissions, "Files.setPosixFilePermissions(this, value)");
        return posixFilePermissions;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path createLinkPointingTo(Path path, Path path2) {
        Path createLink = Files.createLink(path, path2);
        Intrinsics.checkNotNullExpressionValue(createLink, "Files.createLink(this, target)");
        return createLink;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path createSymbolicLinkPointingTo(Path path, Path path2, FileAttribute<?>... fileAttributeArr) {
        Path createSymbolicLink = Files.createSymbolicLink(path, path2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(createSymbolicLink, "Files.createSymbolicLink…his, target, *attributes)");
        return createSymbolicLink;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path readSymbolicLink(Path path) {
        Path readSymbolicLink = Files.readSymbolicLink(path);
        Intrinsics.checkNotNullExpressionValue(readSymbolicLink, "Files.readSymbolicLink(this)");
        return readSymbolicLink;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path createFile(Path path, FileAttribute<?>... fileAttributeArr) {
        Path createFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(createFile, "Files.createFile(this, *attributes)");
        return createFile;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path createTempFile(String str, String str2, FileAttribute<?>... fileAttributeArr) {
        Path createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(createTempFile, "Files.createTempFile(prefix, suffix, *attributes)");
        return createTempFile;
    }

    static /* synthetic */ Path createTempFile$default(String str, String str2, FileAttribute[] fileAttributeArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        Path createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(createTempFile, "Files.createTempFile(prefix, suffix, *attributes)");
        return createTempFile;
    }

    public static /* synthetic */ Path createTempFile$default(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return PathsKt.createTempFile(path, str, str2, fileAttributeArr);
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    @ExperimentalPathApi
    public static final Path createTempFile(@Nullable Path path, @Nullable String str, @Nullable String str2, @NotNull FileAttribute<?>... fileAttributeArr) {
        Intrinsics.checkNotNullParameter(fileAttributeArr, "attributes");
        if (path != null) {
            Path createTempFile = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            Intrinsics.checkNotNullExpressionValue(createTempFile, "Files.createTempFile(dir…fix, suffix, *attributes)");
            return createTempFile;
        }
        Path createTempFile2 = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(createTempFile2, "Files.createTempFile(prefix, suffix, *attributes)");
        return createTempFile2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path createTempDirectory(String str, FileAttribute<?>... fileAttributeArr) {
        Path createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(createTempDirectory, "Files.createTempDirectory(prefix, *attributes)");
        return createTempDirectory;
    }

    static /* synthetic */ Path createTempDirectory$default(String str, FileAttribute[] fileAttributeArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        Path createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(createTempDirectory, "Files.createTempDirectory(prefix, *attributes)");
        return createTempDirectory;
    }

    public static /* synthetic */ Path createTempDirectory$default(Path path, String str, FileAttribute[] fileAttributeArr, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return PathsKt.createTempDirectory(path, str, fileAttributeArr);
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    @ExperimentalPathApi
    public static final Path createTempDirectory(@Nullable Path path, @Nullable String str, @NotNull FileAttribute<?>... fileAttributeArr) {
        Intrinsics.checkNotNullParameter(fileAttributeArr, "attributes");
        if (path != null) {
            Path createTempDirectory = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            Intrinsics.checkNotNullExpressionValue(createTempDirectory, "Files.createTempDirector…ory, prefix, *attributes)");
            return createTempDirectory;
        }
        Path createTempDirectory2 = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        Intrinsics.checkNotNullExpressionValue(createTempDirectory2, "Files.createTempDirectory(prefix, *attributes)");
        return createTempDirectory2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path div(Path path, Path path2) {
        Intrinsics.checkNotNullParameter(path, "$this$div");
        Path resolve = path.resolve(path2);
        Intrinsics.checkNotNullExpressionValue(resolve, "this.resolve(other)");
        return resolve;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path div(Path path, String str) {
        Intrinsics.checkNotNullParameter(path, "$this$div");
        Path resolve = path.resolve(str);
        Intrinsics.checkNotNullExpressionValue(resolve, "this.resolve(other)");
        return resolve;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path Path(String str) {
        Path path = Paths.get(str, new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "Paths.get(path)");
        return path;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path Path(String str, String... strArr) {
        Path path = Paths.get(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        Intrinsics.checkNotNullExpressionValue(path, "Paths.get(base, *subpaths)");
        return path;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    private static final Path toPath(URI uri) {
        Path path = Paths.get(uri);
        Intrinsics.checkNotNullExpressionValue(path, "Paths.get(this)");
        return path;
    }
}
