/*
 * Copyright (C) 2009-2013 Typesafe Inc. <http://www.typesafe.com>
 */
package play.cache;
import play.mvc.With;

import java.lang.annotation.*;

/**
 * Mark an action to be cached on server side.
 */
@With(CachedAction.class)
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Cached {
    /**
     * The cache key to store the result in
     */
    String key();

    /**
     * The duration the action should be cached for.  Defaults to 0.
     */
    int duration() default 0;
}
