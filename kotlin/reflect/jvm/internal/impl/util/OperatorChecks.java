package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.MemberKindCheck;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck;
import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck;
import org.jetbrains.annotations.NotNull;

public final class OperatorChecks extends AbstractModifierChecks {
    @NotNull
    public static final OperatorChecks INSTANCE = new OperatorChecks();
    @NotNull
    private static final List<Checks> checks;

    private OperatorChecks() {
    }

    @NotNull
    public final List<Checks> getChecks$descriptors() {
        return checks;
    }

    static {
        Name name = OperatorNameConventions.GET;
        Check[] checkArr = {MemberKindCheck.MemberOrExtension.INSTANCE, new ValueParameterCountCheck.AtLeast(1)};
        Name name2 = OperatorNameConventions.SET;
        Check[] checkArr2 = {MemberKindCheck.MemberOrExtension.INSTANCE, new ValueParameterCountCheck.AtLeast(2)};
        Name name3 = OperatorNameConventions.GET_VALUE;
        Check[] checkArr3 = {MemberKindCheck.MemberOrExtension.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE, new ValueParameterCountCheck.AtLeast(2), IsKPropertyCheck.INSTANCE};
        Name name4 = OperatorNameConventions.SET_VALUE;
        Check[] checkArr4 = {MemberKindCheck.MemberOrExtension.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE, new ValueParameterCountCheck.AtLeast(3), IsKPropertyCheck.INSTANCE};
        Name name5 = OperatorNameConventions.PROVIDE_DELEGATE;
        Check[] checkArr5 = {MemberKindCheck.MemberOrExtension.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE, new ValueParameterCountCheck.Equals(2), IsKPropertyCheck.INSTANCE};
        Name name6 = OperatorNameConventions.INVOKE;
        Check[] checkArr6 = {MemberKindCheck.MemberOrExtension.INSTANCE};
        Name name7 = OperatorNameConventions.CONTAINS;
        Check[] checkArr7 = {MemberKindCheck.MemberOrExtension.INSTANCE, ValueParameterCountCheck.SingleValueParameter.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE, ReturnsCheck.ReturnsBoolean.INSTANCE};
        Name name8 = OperatorNameConventions.ITERATOR;
        Check[] checkArr8 = {MemberKindCheck.MemberOrExtension.INSTANCE, ValueParameterCountCheck.NoValueParameters.INSTANCE};
        Name name9 = OperatorNameConventions.NEXT;
        Check[] checkArr9 = {MemberKindCheck.MemberOrExtension.INSTANCE, ValueParameterCountCheck.NoValueParameters.INSTANCE};
        Name name10 = OperatorNameConventions.HAS_NEXT;
        Check[] checkArr10 = {MemberKindCheck.MemberOrExtension.INSTANCE, ValueParameterCountCheck.NoValueParameters.INSTANCE, ReturnsCheck.ReturnsBoolean.INSTANCE};
        Name name11 = OperatorNameConventions.RANGE_TO;
        Check[] checkArr11 = {MemberKindCheck.MemberOrExtension.INSTANCE, ValueParameterCountCheck.SingleValueParameter.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE};
        Name name12 = OperatorNameConventions.EQUALS;
        Check[] checkArr12 = {MemberKindCheck.Member.INSTANCE};
        Name name13 = OperatorNameConventions.COMPARE_TO;
        Check[] checkArr13 = {MemberKindCheck.MemberOrExtension.INSTANCE, ReturnsCheck.ReturnsInt.INSTANCE, ValueParameterCountCheck.SingleValueParameter.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE};
        Check[] checkArr14 = {MemberKindCheck.MemberOrExtension.INSTANCE, ValueParameterCountCheck.SingleValueParameter.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE};
        Check[] checkArr15 = {MemberKindCheck.MemberOrExtension.INSTANCE, ValueParameterCountCheck.NoValueParameters.INSTANCE};
        Name[] nameArr = {OperatorNameConventions.INC, OperatorNameConventions.DEC};
        checks = CollectionsKt.listOf(new Checks(name, checkArr, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(name2, checkArr2, (Function1<? super FunctionDescriptor, String>) OperatorChecks$checks$1.INSTANCE), new Checks(name3, checkArr3, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(name4, checkArr4, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(name5, checkArr5, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(name6, checkArr6, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(name7, checkArr7, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(name8, checkArr8, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(name9, checkArr9, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(name10, checkArr10, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(name11, checkArr11, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(name12, checkArr12, (Function1<? super FunctionDescriptor, String>) OperatorChecks$checks$2.INSTANCE), new Checks(name13, checkArr13, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks((Collection) OperatorNameConventions.BINARY_OPERATION_NAMES, checkArr14, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks((Collection) OperatorNameConventions.SIMPLE_UNARY_OPERATION_NAMES, checkArr15, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks((Collection<Name>) CollectionsKt.listOf(nameArr), new Check[]{MemberKindCheck.MemberOrExtension.INSTANCE}, (Function1<? super FunctionDescriptor, String>) OperatorChecks$checks$3.INSTANCE), new Checks((Collection) OperatorNameConventions.ASSIGNMENT_OPERATIONS, new Check[]{MemberKindCheck.MemberOrExtension.INSTANCE, ReturnsCheck.ReturnsUnit.INSTANCE, ValueParameterCountCheck.SingleValueParameter.INSTANCE, NoDefaultAndVarargsCheck.INSTANCE}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.COMPONENT_REGEX, new Check[]{MemberKindCheck.MemberOrExtension.INSTANCE, ValueParameterCountCheck.NoValueParameters.INSTANCE}, (Function1) null, 4, (DefaultConstructorMarker) null));
    }
}
