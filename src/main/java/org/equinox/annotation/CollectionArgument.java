package org.equinox.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface CollectionArgument {
    int minSize() default 0;
    int maxSize() default Integer.MAX_VALUE - 1;
}