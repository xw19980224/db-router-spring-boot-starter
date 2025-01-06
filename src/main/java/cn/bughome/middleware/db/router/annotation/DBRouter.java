package cn.bughome.middleware.db.router.annotation;

import java.lang.annotation.*;

/**
 * 路由注解
 * Created by MaxWell on 2025/1/6 14:41
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouter {
    /**
     * 分库分表字段
     *
     * @return 分库分表字段
     */
    String key() default "";
}
