package cn.bughome.middleware.db.router;

/**
 * 数据源基础配置
 * Created by MaxWell on 2025/1/6 16:36
 */
public class DBRouterBase {
    private String tbIdx;

    public String getTbIdx() {
        return DBContextHolder.getTBKey();
    }
}
