package cn.bughome.middleware.db.router.annotation;

import java.lang.annotation.*;

/**
 * 路由策略，分表标记
 * Created by MaxWell on 2025/1/6 14:41
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouterStrategy {

    boolean splitTable() default false;
}
