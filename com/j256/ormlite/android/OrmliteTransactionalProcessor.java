package com.j256.ormlite.android;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Completion;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

public class OrmliteTransactionalProcessor implements Processor {
    private static final Set<Class<? extends Annotation>> annotationSet;
    private ProcessingEnvironment processingEnv;

    static {
        HashSet hashSet = new HashSet();
        annotationSet = hashSet;
        hashSet.add(DatabaseTable.class);
        annotationSet.add(DatabaseField.class);
    }

    public Set<String> getSupportedOptions() {
        return Collections.emptySet();
    }

    public Set<String> getSupportedAnnotationTypes() {
        HashSet hashSet = new HashSet();
        for (Class<? extends Annotation> name : annotationSet) {
            hashSet.add(name.getName());
        }
        return hashSet;
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.RELEASE_6;
    }

    public void init(ProcessingEnvironment processingEnvironment) {
        this.processingEnv = processingEnvironment;
    }

    public Iterable<? extends Completion> getCompletions(Element element, AnnotationMirror annotationMirror, ExecutableElement executableElement, String str) {
        return Collections.emptyList();
    }

    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        for (Class next : annotationSet) {
            for (Element element : roundEnvironment.getElementsAnnotatedWith(next)) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder("-- Element ");
                sb.append(element);
                sb.append(" has annotation ");
                sb.append(next);
                printStream.println(sb.toString());
                Messager messager = this.processingEnv.getMessager();
                Diagnostic.Kind kind = Diagnostic.Kind.ERROR;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(element);
                sb2.append(" error");
                messager.printMessage(kind, sb2.toString());
            }
        }
        return true;
    }
}
