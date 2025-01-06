package cn.bughome.middleware.db.router.test;

import cn.bughome.middleware.db.router.annotation.DBRouter;

/**
 * Created by MaxWell on 2025/1/6 17:05
 */
public interface IUserDao {
    @DBRouter(key = "userId")
    void insertUser(String req);
}
