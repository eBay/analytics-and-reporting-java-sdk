// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.analyticsandreporting.generated.analytics.traffic_report;

import com.ebay.analyticsandreporting.generated.analytics.models.Error;
import com.ebay.analyticsandreporting.generated.analytics.models.Report;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /traffic_report
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TrafficReportRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link TrafficReportRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TrafficReportRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/traffic_report?dimension={dimension}&filter={filter}&metric={metric}{&sort*}", pathParameters);
    }
    /**
     * Instantiates a new {@link TrafficReportRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TrafficReportRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/traffic_report?dimension={dimension}&filter={filter}&metric={metric}{&sort*}", rawUrl);
    }
    /**
     * This method returns a report that details the user traffic received by a seller&apos;s listings. &lt;br&gt;&lt;br&gt;A traffic report gives sellers the ability to review how often their listings appeared on eBay, how many times their listings are viewed, and how many purchases were made. The report also returns the report&apos;s start and end dates, and the date the information was last updated.  &lt;br&gt;&lt;br&gt;For more information, see &lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html&quot; target=&quot;_blank&quot;&gt;Traffic report details&lt;/a&gt;
     * @return a {@link Report}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Report get() {
        return get(null);
    }
    /**
     * This method returns a report that details the user traffic received by a seller&apos;s listings. &lt;br&gt;&lt;br&gt;A traffic report gives sellers the ability to review how often their listings appeared on eBay, how many times their listings are viewed, and how many purchases were made. The report also returns the report&apos;s start and end dates, and the date the information was last updated.  &lt;br&gt;&lt;br&gt;For more information, see &lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html&quot; target=&quot;_blank&quot;&gt;Traffic report details&lt;/a&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Report}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Report get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Report::createFromDiscriminatorValue);
    }
    /**
     * This method returns a report that details the user traffic received by a seller&apos;s listings. &lt;br&gt;&lt;br&gt;A traffic report gives sellers the ability to review how often their listings appeared on eBay, how many times their listings are viewed, and how many purchases were made. The report also returns the report&apos;s start and end dates, and the date the information was last updated.  &lt;br&gt;&lt;br&gt;For more information, see &lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html&quot; target=&quot;_blank&quot;&gt;Traffic report details&lt;/a&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method returns a report that details the user traffic received by a seller&apos;s listings. &lt;br&gt;&lt;br&gt;A traffic report gives sellers the ability to review how often their listings appeared on eBay, how many times their listings are viewed, and how many purchases were made. The report also returns the report&apos;s start and end dates, and the date the information was last updated.  &lt;br&gt;&lt;br&gt;For more information, see &lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html&quot; target=&quot;_blank&quot;&gt;Traffic report details&lt;/a&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link TrafficReportRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TrafficReportRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TrafficReportRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method returns a report that details the user traffic received by a seller&apos;s listings. &lt;br&gt;&lt;br&gt;A traffic report gives sellers the ability to review how often their listings appeared on eBay, how many times their listings are viewed, and how many purchases were made. The report also returns the report&apos;s start and end dates, and the date the information was last updated.  &lt;br&gt;&lt;br&gt;For more information, see &lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html&quot; target=&quot;_blank&quot;&gt;Traffic report details&lt;/a&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter specifies the &lt;i&gt;dimension&lt;/i&gt;, or &quot;attribute,&quot; that is applied to the report &lt;b&gt;metric&lt;/b&gt;.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt; &lt;code&gt;DAY&lt;/code&gt; or &lt;code&gt;LISTING&lt;/code&gt;  &lt;br&gt;&lt;br&gt;&lt;b&gt;Examples&lt;/b&gt; &lt;ul&gt;&lt;li&gt;If you specify &lt;code&gt;dimension=DAY&lt;/code&gt; and &lt;code&gt;metric=CLICK_THROUGH_RATE&lt;/code&gt;, the traffic report contains the number of times an item displayed on a search results page and the buyer clicked through to the View Item page for each day in the date range, as in: &lt;br&gt;&lt;code&gt;12-06-17: 32, 12-07-17: 54, ...&lt;/code&gt;&lt;/li&gt; &lt;li&gt;If you specify &lt;code&gt;dimension=LISTING&lt;/code&gt; and &lt;code&gt;metric=LISTING_IMPRESSION_STORE&lt;/code&gt;, the traffic report contains the number of times that listing appeared on the seller&apos;s store during the specified date range. &lt;br&gt;&lt;br&gt;For example, &lt;code&gt;LISTING_IMPRESSION_STORE: 157&lt;/code&gt; means the item appeared 157 times in the store during the date range.&lt;/li&gt;&lt;li&gt;If you specify &lt;code&gt;dimension=LISTING&lt;/code&gt; without specifying any &lt;b&gt;listing_ids&lt;/b&gt; in the parameter filter, the traffic report returned in the response contains a maximum of 200 listings.&lt;/li&gt;&lt;/ul&gt; &lt;!-- Dimension - Enables user to specify input to slice the data that the user is interested in - For example specify listing and days as dimensions to get traffic report for all the sellers listings grouped by listing and days. Refer to DimensionEnum) --&gt;
         */
        @jakarta.annotation.Nullable
        public String dimension;
        /**
         * This query parameter refines the information returned in the traffic report. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; URL encode all the values you supply in the &lt;b&gt;filter&lt;/b&gt; parameter. See &lt;b&gt;URL encoding query parameter values&lt;/b&gt; as described in &lt;a href=&quot;/api-docs/static/rest-request-components.html#parameters&quot; target=&quot;_blank&quot;&gt;URL parameters&lt;/a&gt;.&lt;/span&gt;&lt;/p&gt;Configure the following properties of the &lt;b&gt;filter&lt;/b&gt; parameter to tune the traffic report to your needs: &lt;ul&gt; &lt;li&gt;&lt;b&gt;date_range&lt;/b&gt; &lt;br&gt;Limits the report to the specified range of dates. This value can be formatted in one of two ways depending on the user&apos;s time zone.&lt;ul&gt;&lt;li&gt;&lt;b&gt;For America/Los_Angeles time zone&lt;/b&gt;, input the date range using &lt;code&gt;YYMMDD&lt;/code&gt; format. As this is the default time zone used for timestamps in the report, the time zone does not need to be specified. Enclose the earliest date and end date for the report in brackets (&quot;&lt;code&gt;[ ]&lt;/code&gt;&quot;), as follows:&lt;br&gt;&lt;br&gt;&lt;code&gt;[YYYYMMDD..YYYYMMDD]&lt;/code&gt;&lt;br&gt;&lt;br&gt;For example:&lt;br&gt;&lt;pre&gt;[20240101..20240131]&lt;/pre&gt;&lt;/li&gt;&lt;li&gt;&lt;b&gt;For all other time zones&lt;/b&gt;, input the date range using &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; format, and specify the time zone using a UTC offset. A time zone offset is a positive or negative value that represents the number of hours a time zone is from UTC (see &lt;a href=&quot;https://www.utctime.net/utc-time-zone-converter&quot; target=&quot;_blank&quot;&gt;UTC Time Zone Converter&lt;/a&gt; for offset values for your time zone). Enclose the earliest date and end date for the report in brackets (&quot;&lt;code&gt;[ ]&lt;/code&gt;&quot;), as follows:&lt;br&gt;&lt;br&gt;&lt;code&gt;[yyyy-MM-dd&apos;T&apos;HH:mm:ss.SSS+|-hh:mm..yyyy-MM-dd&apos;T&apos;HH:mm:ss.SSS+|-hh:mm]&lt;/code&gt;&lt;br&gt;&lt;br&gt;For example:&lt;br&gt;&lt;pre&gt;[2024-01-01T02:00:00.000-05:00..2024-01-31T02:00:00.000-05:00]&lt;/pre&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; All time values entered in this format will be dropped, and will be replaced with &lt;code&gt;00:00:00.000&lt;/code&gt; for &lt;b&gt;startDate&lt;/b&gt; and &lt;code&gt;23:59:59.000&lt;/code&gt; for &lt;b&gt;endDate&lt;/b&gt; in the response body.&lt;/span&gt;&lt;/li&gt;&lt;/ul&gt;The maximum range between the start and end dates is 90 days, and the earliest start date you can specify is two years prior to the current date, which is defined as 730 days (365 &amp;#42; 2), not accounting for Leap Year.&lt;br&gt;&lt;br&gt;&lt;a name=&quot;lastUDate&quot;&gt;&lt;/a&gt;The last date for which traffic data exists is a value called &lt;b&gt;lastUpdatedDate&lt;/b&gt;. eBay returns an error if you specify a date range greater than 90 days, or the start date is after the lastUpdatedDate. If the specified end date is beyond the lastUpdatedDate, eBay returns data up to the lastUpdatedDate.&lt;br&gt;&lt;br&gt;&lt;b&gt;Required:&lt;/b&gt; Always&lt;/li&gt; &lt;li&gt;&lt;b&gt;listing_ids&lt;/b&gt; &lt;br&gt;This filter limits the results to only the supplied list of &lt;b&gt;listingId&lt;/b&gt; values. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If you specify &lt;code&gt;dimension=LISTING&lt;/code&gt; without specifying any listing_ids in this parameter, the traffic report returned in the response contains a maximum of 200 listings.&lt;/span&gt;&lt;br&gt;You can specify to 200 different &lt;b&gt;listingId&lt;/b&gt; values. Enclose the list of IDs with curly braces (&quot;&lt;code&gt;{ }&lt;/code&gt;&quot;), and separate multiple values with a pipe character (&quot;&lt;code&gt;|&lt;/code&gt;&quot;).  &lt;br&gt;&lt;br&gt;This filter only returns data for listings that have been either active or sold in last 90 days, and any unsold listings in the last 30 days. All listings must be the seller&apos;s and they  must be listed on the marketplace specified by the &lt;b&gt;marketplace_ids&lt;/b&gt; filter argument.&lt;/li&gt; &lt;li&gt;&lt;b&gt;marketplace_ids&lt;/b&gt; &lt;br&gt;This filter limits the report to seller data related to only the specified marketplace ID (currently the filter allows only a single marketplace ID). Enclose the marketplace ID in curly braces (&quot;&lt;code&gt;{ }&lt;/code&gt;&quot;).  &lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt; &lt;ul class=&quot;compact&quot;&gt;&lt;li&gt;&lt;code&gt;EBAY_AU&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_DE&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;EBAY_ES&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;EBAY_FR&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_GB&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_IT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;EBAY_US&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_MOTORS_US&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; &lt;br&gt;&lt;em&gt;Required if&lt;/em&gt; you set the &lt;b&gt;dimension&lt;/b&gt; parameter to &lt;code&gt;DAY&lt;/code&gt;.&lt;/li&gt;&lt;/ul&gt; &lt;br&gt;&lt;b&gt;Example filter parameter&lt;/b&gt; &lt;br&gt;The following example shows how to configure the &lt;b&gt;filter&lt;/b&gt; parameter with the &lt;b&gt;marketplace_ids&lt;/b&gt; and &lt;b&gt;date_range&lt;/b&gt; filters: &lt;p&gt;&lt;code&gt;filter=marketplace_ids:{EBAY_US},date_range:[20170601..20170828]&lt;/code&gt;&lt;br&gt;&lt;br&gt;Encoding this portion of the query parameter sample yields: &lt;p&gt;&lt;code&gt;filter=marketplace_ids:%7BEBAY_US%7D,date_range:%5B20230601..20230828%5D&lt;/code&gt; &lt;/p&gt;&lt;!-- **Filter results based on the specified filter parameters- window_days (WindowDaysEnum), date_range, marketplace_id (MarketplaceIdEnum - Only EBAY_US, EBAY_MOTORS_US, EBAY_GB, EBAY_AU, EBAY_DE are supported), listing_ids, traffic_source (Takes a list. Supported values: ORGANIC, PROMOTED_LISTINGS). Valid filters come from QueryParamEnum --&gt;
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * &lt;a name=&quot;metrics&quot;&gt;&lt;/a&gt;This query parameter specifies the metrics you want covered in the report. &lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; Unlike names for parameters and enumerated values, metric values are not case sensitive.&lt;/span&gt;&lt;/p&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;    &lt;li&gt;&lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html#click_through_rate&quot; target=&quot;_blank&quot;&gt;CLICK_THROUGH_RATE&lt;/a&gt;&lt;/li&gt;    &lt;li&gt;&lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html#listing_impression_search_results_page&quot; target=&quot;_blank&quot;&gt;LISTING_IMPRESSION_SEARCH_RESULTS_PAGE&lt;/a&gt; &lt;/li&gt;    &lt;li&gt;&lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html#listing_impression_store&quot; target=&quot;_blank&quot;&gt;LISTING_IMPRESSION_STORE&lt;/a&gt;&lt;/li&gt;    &lt;li&gt;&lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html#listing_impression_total&quot; target=&quot;_blank&quot;&gt;LISTING_IMPRESSION_TOTAL&lt;/a&gt;&lt;/li&gt;    &lt;li&gt;&lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html#listing_views_source_direct&quot; target=&quot;_blank&quot;&gt;LISTING_VIEWS_SOURCE_DIRECT&lt;/a&gt;&lt;/li&gt;    &lt;li&gt;&lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html#listing_views_source_off_ebay&quot; target=&quot;_blank&quot;&gt;LISTING_VIEWS_SOURCE_OFF_EBAY&lt;/a&gt;&lt;/li&gt;    &lt;li&gt;&lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html#listing_views_source_other_ebay&quot; target=&quot;_blank&quot;&gt;LISTING_VIEWS_SOURCE_OTHER_EBAY&lt;/a&gt;&lt;/li&gt;    &lt;li&gt;&lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html#listing_views_source_search_results_page&quot; target=&quot;_blank&quot;&gt;LISTING_VIEWS_SOURCE_SEARCH_RESULTS_PAGE&lt;/a&gt;&lt;/li&gt;    &lt;li&gt;&lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html#listing_views_source_store&quot; target=&quot;_blank&quot;&gt;LISTING_VIEWS_SOURCE_STORE&lt;/a&gt;&lt;/li&gt;    &lt;li&gt;&lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html#listing_views_total&quot; target=&quot;_blank&quot;&gt;LISTING_VIEWS_TOTAL&lt;/a&gt;&lt;/li&gt;    &lt;li&gt;&lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html#sales_conversion_rate&quot; target=&quot;_blank&quot;&gt;SALES_CONVERSION_RATE&lt;/a&gt;&lt;/li&gt;    &lt;li&gt;&lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html#total_impression_total&quot; target=&quot;_blank&quot;&gt;TOTAL_IMPRESSION_TOTAL&lt;/a&gt;&lt;/li&gt;    &lt;li&gt;&lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html#transaction&quot; target=&quot;_blank&quot;&gt;TRANSACTION&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;Specify a comma-separated list of the metrics to include them in the report. See &lt;a href=&quot;/api-docs/sell/static/performance/traffic-report.html#metric-parameters&quot; target=&quot;_blank&quot;&gt;Using different metric parameters&lt;/a&gt; for more information including detailed metric descriptions and localized names.&lt;!-- Metric - Lets the user specify the list of fields that they would like to see in the report. Allowed values: CLICK_THROUGH_RATE, LISTING_IMPRESSION_SEARCH_RESULTS_PAGE, LISTING_IMPRESSION_STORE, LISTING_IMPRESSION_TOTAL, LISTING_VIEWS_SOURCE_DIRECT, LISTING_VIEWS_SOURCE_OFF_EBAY, LISTING_VIEWS_SOURCE_OTHER_EBAY, LISTING_VIEWS_SOURCE_SEARCH_RESULTS_PAGE, LISTING_VIEWS_SOURCE_STORE, LISTING_VIEWS_TOTAL, SALES_CONVERSION_RATE (DataMetricEnum), TOTAL_IMPRESSION_TOTAL, TRANSACTION --&gt;
         */
        @jakarta.annotation.Nullable
        public String metric;
        /**
         * This query parameter sorts the report on the specified metric.  &lt;br&gt;&lt;br&gt;You can only specify a single metric in the sort parameter and the specified metric must be included in the configuration of the report&apos;s &lt;b&gt;metric&lt;/b&gt; parameter.  &lt;br&gt;&lt;br&gt;Sorting is helpful when you want to review how a specific metric is performing, such as the CLICK_THROUGH_RATE.  &lt;br&gt;&lt;br&gt;Most reports can be sorted in ascending or descending order. Precede the value of a descending-order request with a minus sign (&quot;&lt;code&gt;-&lt;/code&gt;&quot;), for example: &lt;code&gt;sort=-CLICK_THROUGH_RATE&lt;/code&gt;.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; There are a couple of constraints on sorting the report by different metrics:&lt;ul&gt;&lt;li&gt;Sorting on the &lt;code&gt;SALES_CONVERSION_RATE&lt;/code&gt; metric is not supported&lt;/li&gt;&lt;li&gt;The &lt;code&gt;TRANSACTION&lt;/code&gt; metric can only be sorted in the descending order (sorting in the ascending order is not supported).&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt; &lt;!-- Sort order for a collection of resources: Specify the metric value to be sorted. Allowed values are from DataMetricEnum --&gt; 
         */
        @jakarta.annotation.Nullable
        public String sort;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("dimension", dimension);
            allQueryParams.put("filter", filter);
            allQueryParams.put("metric", metric);
            allQueryParams.put("sort", sort);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
