package kotlin.reflect.jvm.internal.impl.name;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;

public final class FqNameUnsafe {
    private static final Name ROOT_NAME = Name.special("<root>");
    private static final Pattern SPLIT_BY_DOTS = Pattern.compile("\\.");
    private static final Function1<String, Name> STRING_TO_NAME = new Function1<String, Name>() {
        public final Name invoke(String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-533869227, oncanceled);
                onCancelLoad.getMin(-533869227, oncanceled);
            }
            return Name.guessByFirstCharacter(str);
        }
    };
    @NotNull
    private final String fqName;
    private transient FqNameUnsafe parent;
    private transient FqName safe;
    private transient Name shortName;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    FqNameUnsafe(@NotNull String str, @NotNull FqName fqName2) {
        if (str == null) {
            $$$reportNull$$$0(0);
        }
        if (fqName2 == null) {
            $$$reportNull$$$0(1);
        }
        this.fqName = str;
        this.safe = fqName2;
    }

    public FqNameUnsafe(@NotNull String str) {
        if (str == null) {
            $$$reportNull$$$0(2);
        }
        this.fqName = str;
    }

    private FqNameUnsafe(@NotNull String str, FqNameUnsafe fqNameUnsafe, Name name) {
        if (str == null) {
            $$$reportNull$$$0(3);
        }
        this.fqName = str;
        this.parent = fqNameUnsafe;
        this.shortName = name;
    }

    private void compute() {
        int lastIndexOf = this.fqName.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.shortName = Name.guessByFirstCharacter(this.fqName.substring(lastIndexOf + 1));
            this.parent = new FqNameUnsafe(this.fqName.substring(0, lastIndexOf));
            return;
        }
        this.shortName = Name.guessByFirstCharacter(this.fqName);
        this.parent = FqName.ROOT.toUnsafe();
    }

    @NotNull
    public final String asString() {
        String str = this.fqName;
        if (str == null) {
            $$$reportNull$$$0(4);
        }
        return str;
    }

    public final boolean isSafe() {
        return this.safe != null || asString().indexOf(60) < 0;
    }

    @NotNull
    public final FqName toSafe() {
        FqName fqName2 = this.safe;
        if (fqName2 != null) {
            if (fqName2 == null) {
                $$$reportNull$$$0(5);
            }
            return fqName2;
        }
        FqName fqName3 = new FqName(this);
        this.safe = fqName3;
        if (fqName3 == null) {
            $$$reportNull$$$0(6);
        }
        return fqName3;
    }

    public final boolean isRoot() {
        return this.fqName.isEmpty();
    }

    @NotNull
    public final FqNameUnsafe parent() {
        FqNameUnsafe fqNameUnsafe = this.parent;
        if (fqNameUnsafe != null) {
            if (fqNameUnsafe == null) {
                $$$reportNull$$$0(7);
            }
            return fqNameUnsafe;
        } else if (!isRoot()) {
            compute();
            FqNameUnsafe fqNameUnsafe2 = this.parent;
            if (fqNameUnsafe2 == null) {
                $$$reportNull$$$0(8);
            }
            return fqNameUnsafe2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    @NotNull
    public final FqNameUnsafe child(@NotNull Name name) {
        String str;
        if (name == null) {
            $$$reportNull$$$0(9);
        }
        if (isRoot()) {
            str = name.asString();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.fqName);
            sb.append(".");
            sb.append(name.asString());
            str = sb.toString();
        }
        return new FqNameUnsafe(str, this, name);
    }

    @NotNull
    public final Name shortName() {
        Name name = this.shortName;
        if (name != null) {
            if (name == null) {
                $$$reportNull$$$0(10);
            }
            return name;
        } else if (!isRoot()) {
            compute();
            Name name2 = this.shortName;
            if (name2 == null) {
                $$$reportNull$$$0(11);
            }
            return name2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    @NotNull
    public final Name shortNameOrSpecial() {
        if (isRoot()) {
            Name name = ROOT_NAME;
            if (name == null) {
                $$$reportNull$$$0(12);
            }
            return name;
        }
        Name shortName2 = shortName();
        if (shortName2 == null) {
            $$$reportNull$$$0(13);
        }
        return shortName2;
    }

    @NotNull
    public final List<Name> pathSegments() {
        List<Name> emptyList = isRoot() ? Collections.emptyList() : ArraysKt.map((T[]) SPLIT_BY_DOTS.split(this.fqName), STRING_TO_NAME);
        if (emptyList == null) {
            $$$reportNull$$$0(14);
        }
        return emptyList;
    }

    public final boolean startsWith(@NotNull Name name) {
        if (name == null) {
            $$$reportNull$$$0(15);
        }
        if (isRoot()) {
            return false;
        }
        int indexOf = this.fqName.indexOf(46);
        String str = this.fqName;
        String asString = name.asString();
        if (indexOf == -1) {
            indexOf = this.fqName.length();
        }
        return str.regionMatches(0, asString, 0, indexOf);
    }

    @NotNull
    public static FqNameUnsafe topLevel(@NotNull Name name) {
        if (name == null) {
            $$$reportNull$$$0(16);
        }
        return new FqNameUnsafe(name.asString(), FqName.ROOT.toUnsafe(), name);
    }

    @NotNull
    public final String toString() {
        String asString = isRoot() ? ROOT_NAME.asString() : this.fqName;
        if (asString == null) {
            $$$reportNull$$$0(17);
        }
        return asString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqNameUnsafe) && this.fqName.equals(((FqNameUnsafe) obj).fqName);
    }

    public final int hashCode() {
        return this.fqName.hashCode();
    }
}
