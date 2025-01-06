package cn.bughome.middleware.db.router;

import cn.bughome.middleware.db.router.strategy.IDBRouterStrategy;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 数据路由切面，通过自定义注解的方式，拦截被切面的方法，进行数据库路由
 * Created by MaxWell on 2025/1/6 16:39
 */
@Aspect
public class DBRouterJoinPoint {
    private Logger logger = LoggerFactory.getLogger(DBRouterJoinPoint.class);

    private DBRouterConfig dbRouterConfig;

    private IDBRouterStrategy dbRouterStrategy;

    public DBRouterJoinPoint(DBRouterConfig dbRouterConfig, IDBRouterStrategy dbRouterStrategy) {
        this.dbRouterConfig = dbRouterConfig;
        this.dbRouterStrategy = dbRouterStrategy;
    }

    @Pointcut("@annotation(cn.bughome.middleware.db.router.annotation.DBRouter)")
    public void aopPoint() {
    }
}
