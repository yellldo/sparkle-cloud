package com.sparkle.service.config;

import com.p6spy.engine.spy.appender.MessageFormattingStrategy;
import com.sparkle.util.DateUtil;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;

/**
 * ClassName : P6spySqlFormatConfigure<br>
 * Description : 自定义 p6spy sql输出格式<br>
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2021/5/14
 */
public class P6spySqlFormatConfigure implements MessageFormattingStrategy {

    /**
     * 过滤掉定时任务的 SQL
     */
    @Override
    public String formatMessage(int connectionId, String now, long elapsed, String category, String prepared, String sql, String url) {
        return StringUtils.isNotBlank(sql) ? DateUtil.formatFullTime(LocalDateTime.now(), DateUtil.FULL_TIME_SPLIT_PATTERN)
                + " | 耗时 " + elapsed + " ms | SQL 语句：" + StringUtils.LF + sql.replaceAll("[\\s]+", StringUtils.SPACE) + ";" : StringUtils.EMPTY;
    }
}
