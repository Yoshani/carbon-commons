/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.wso2.carbon.logging.service;

public final class LoggingConstants {

    public static final String AUDIT_LOGFILE = "AUDIT_LOGFILE";
    public static final String CARBON_LOGFILE = "CARBON_LOGFILE";
    public static final String NAME_SUFFIX = ".name";
    public static final String APPENDER_PREFIX = "appender.";
    public static final String URL_SUFFIX = ".url";
    public static final String TYPE_SUFFIX = ".type";
    public static final String LAYOUT_SUFFIX = ".layout";
    public static final String PATTERN_SUFFIX = ".pattern";
    public static final String FILTER_SUFFIX = ".filter";
    public static final String THRESHOLD_SUFFIX = ".threshold";
    public static final String LEVEL_SUFFIX = ".level";
    public static final String CONNECTION_TIMEOUT_SUFFIX = ".connectTimeoutMillis";
    public static final String PATTERN_LAYOUT_TYPE = "PatternLayout";
    public static final String DEFAULT_THRESHOLD_FILTER_TYPE = "ThresholdFilter";
    public static final String THRESHOLD_FILTER_LEVEL = "INFO";
    public static final String HTTP_APPENDER_TYPE = "http";
    public static final String AUDIT_LOGS_DEFAULT_LAYOUT_PATTERN
            = "TID: [%tenantId] [%d] [%X{Correlation-ID}] %5p {%c} - %mm%ex%n";

    // Default logging constants
    public static final String CARBON_LOGS_DEFAULT_LAYOUT_PATTERN = "TID: [%tenantId] [%appName] [%d] [%X{Correlation-ID}] %5p {%c} - %mm%ex%n";
    public static final String ROLLING_FILE = "RollingFile";
    public static final String DEFAULT_CARBON_LOGFILE_PATH = "${sys:carbon.home}/repository/logs/wso2carbon.log";
    public static final String DEFAULT_CARBON_LOGFILE_PATTERN = "${sys:carbon.home}/repository/logs/wso2carbon-%d{MM-dd-yyyy}-%i.log";
    public static final String POLICIES = "Policies";
    public static final String TIME_BASED_TRIGGERING_POLICY = "TimeBasedTriggeringPolicy";
    public static final int DEFAULT_INTERVAL = 1;
    public static final boolean DEFAULT_MODULATE = true;
    public static final String SIZE_BASED_TRIGGERING_POLICY = "SizeBasedTriggeringPolicy";
    public static final String DEFAULT_SIZE = "10MB";
    public static final String DEFAULT_ROLLOVER_STRATEGY = "DefaultRolloverStrategy";
    public static final int DEFAULT_MAX = 20;

    public static final String HEADERS_SUFFIX = ".headers";
    public static final String VALUE_SUFFIX = ".value";
    public static final String DEFAULT_HEADER_TYPE = "Property";
    public static final String AUTHORIZATION_HEADER = "Authorization";

    public static final String FILE_NAME_SUFFIX = ".fileName";
    public static final String FILE_PATTERN_SUFFIX = ".filePattern";
    public static final String POLICIES_SUFFIX = ".policies";
    public static final String STRATEGY_SUFFIX = ".strategy";
    public static final String TIME_SUFFIX = ".time";
    public static final String SIZE_SUFFIX = ".size";
    public static final String MAX_SUFFIX = ".max";
    public static final String INTERVAL_SUFFIX = ".interval";
    public static final String MODULATE_SUFFIX = ".modulate";

    // SSL related suffixes
    public static final String SSL_SUFFIX = ".ssl";
    public static final String LOCATION_SUFFIX = ".location";
    public static final String PASSWORD_SUFFIX = ".password";
    public static final String KEYSTORE_SUFFIX = ".keystore";
    public static final String TRUSTSTORE_SUFFIX = ".truststore";
    public static final String DEFAULT_SSL_TYPE = "SSL";
    public static final String DEFAULT_SSL_KEYSTORE_TYPE = "KeyStore";
    public static final String DEFAULT_SSL_TRUSTSTORE_TYPE = "TrustStore";
    public static final String VERIFY_HOSTNAME_SUFFIX = ".verifyHostname";
}
