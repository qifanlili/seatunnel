package org.apache.seatunnel.connectors.seatunnel.jdbc.config;

import org.apache.seatunnel.api.configuration.Option;
import org.apache.seatunnel.api.configuration.Options;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder(builderClassName = "Builder")
public class MysqlCatalogConfig implements Serializable {

    public static final Option<String> DATE_FORMAT =
            Options.key("date_format")
                    .stringType()
                    .noDefaultValue()
                    .withDescription("格式化日期字段的模板（如 yyyy-MM-dd HH:mm:ss）");
}
