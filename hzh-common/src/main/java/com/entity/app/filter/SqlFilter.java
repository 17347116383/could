package com.entity.app.filter;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Author: ZUHUA.HUANG
 * @Description: ${description}
 * @Date: 2020/
 * @Version: 1.0
 * @Description: TODO()
 */
public class SqlFilter {
    private static final Logger log = LoggerFactory.getLogger(SqlFilter.class);

    public SqlFilter() {
    }

    public static String sqlInject(String str) {
        if (StringUtils.isBlank(str)) {
            return null;
        } else {
            str = StringUtils.replace(str, "'", "");
            str = StringUtils.replace(str, "\"", "");
            str = StringUtils.replace(str, ";", "");
            str = StringUtils.replace(str, "\\", "");
            str = str.toLowerCase();
            String[] keywords = new String[]{"master", "truncate", "insert", "select", "delete", "update", "declare", "alert", "drop"};
            String[] var2 = keywords;
            int var3 = keywords.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                String keyword = var2[var4];
                if (str.indexOf(keyword) != -1) {
                    log.error("存在Sql攻击危险");
                    throw new RuntimeException("请求异常,包含非法字符");
                }
            }

            return str;
        }
    }
}
