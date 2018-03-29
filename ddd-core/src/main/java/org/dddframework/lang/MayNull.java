package org.dddframework.lang;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * A common DDD annotation to declare annotated elements can be {@code null} under
 * some situation.
 *
 * <p>Should be used at parameter, return value, and field value. Methods override should
 * repeat parent {@code MayNull} annotation unless they behave differently.</p>
 *
 * @author Bhuwan Prasad Upadhyay
 * @since 1.0.0
 */
@Target({METHOD, PACKAGE, FIELD})
@Retention(RUNTIME)
@Documented
public @interface MayNull {

}
