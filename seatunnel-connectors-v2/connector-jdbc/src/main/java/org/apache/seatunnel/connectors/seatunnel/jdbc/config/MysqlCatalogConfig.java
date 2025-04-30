/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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

    public static final Option<String> TIME_FORMAT =
            Options.key("time_format")
                    .stringType()
                    .noDefaultValue()
                    .withDescription("格式化time字段的模板（如 HH:mm:ss）");
}
