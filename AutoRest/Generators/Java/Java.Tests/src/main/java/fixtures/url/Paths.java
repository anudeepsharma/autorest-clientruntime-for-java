/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.url;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.url.models.UriColor;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * An instance of this class provides access to all the operations defined
 * in Paths.
 */
public interface Paths {
    /**
     * The interface defining all the services for Paths to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PathsService {
        @GET("/paths/bool/true/{boolPath}")
        Call<ResponseBody> getBooleanTrue(@Path("boolPath") boolean boolPath);

        @GET("/paths/bool/false/{boolPath}")
        Call<ResponseBody> getBooleanFalse(@Path("boolPath") boolean boolPath);

        @GET("/paths/int/1000000/{intPath}")
        Call<ResponseBody> getIntOneMillion(@Path("intPath") int intPath);

        @GET("/paths/int/-1000000/{intPath}")
        Call<ResponseBody> getIntNegativeOneMillion(@Path("intPath") int intPath);

        @GET("/paths/long/10000000000/{longPath}")
        Call<ResponseBody> getTenBillion(@Path("longPath") long longPath);

        @GET("/paths/long/-10000000000/{longPath}")
        Call<ResponseBody> getNegativeTenBillion(@Path("longPath") long longPath);

        @GET("/paths/float/1.034E+20/{floatPath}")
        Call<ResponseBody> floatScientificPositive(@Path("floatPath") double floatPath);

        @GET("/paths/float/-1.034E-20/{floatPath}")
        Call<ResponseBody> floatScientificNegative(@Path("floatPath") double floatPath);

        @GET("/paths/double/9999999.999/{doublePath}")
        Call<ResponseBody> doubleDecimalPositive(@Path("doublePath") double doublePath);

        @GET("/paths/double/-9999999.999/{doublePath}")
        Call<ResponseBody> doubleDecimalNegative(@Path("doublePath") double doublePath);

        @GET("/paths/string/unicode/{stringPath}")
        Call<ResponseBody> stringUnicode(@Path("stringPath") String stringPath);

        @GET("/paths/string/begin%21%2A%27%28%29%3B%3A%40%20%26%3D%2B%24%2C%2F%3F%23%5B%5Dend/{stringPath}")
        Call<ResponseBody> stringUrlEncoded(@Path("stringPath") String stringPath);

        @GET("/paths/string/empty/{stringPath}")
        Call<ResponseBody> stringEmpty(@Path("stringPath") String stringPath);

        @GET("/paths/string/null/{stringPath}")
        Call<ResponseBody> stringNull(@Path("stringPath") String stringPath);

        @GET("/paths/enum/green%20color/{enumPath}")
        Call<ResponseBody> enumValid(@Path("enumPath") String enumPath);

        @GET("/paths/string/null/{enumPath}")
        Call<ResponseBody> enumNull(@Path("enumPath") String enumPath);

        @GET("/paths/byte/multibyte/{bytePath}")
        Call<ResponseBody> byteMultiByte(@Path("bytePath") String bytePath);

        @GET("/paths/byte/empty/{bytePath}")
        Call<ResponseBody> byteEmpty(@Path("bytePath") String bytePath);

        @GET("/paths/byte/null/{bytePath}")
        Call<ResponseBody> byteNull(@Path("bytePath") String bytePath);

        @GET("/paths/date/2012-01-01/{datePath}")
        Call<ResponseBody> dateValid(@Path("datePath") String datePath);

        @GET("/paths/date/null/{datePath}")
        Call<ResponseBody> dateNull(@Path("datePath") String datePath);

        @GET("/paths/datetime/2012-01-01T01%3A01%3A01Z/{dateTimePath}")
        Call<ResponseBody> dateTimeValid(@Path("dateTimePath") String dateTimePath);

        @GET("/paths/datetime/null/{dateTimePath}")
        Call<ResponseBody> dateTimeNull(@Path("dateTimePath") String dateTimePath);

    }
    /**
     * Get true Boolean value on path
     *
     * @param boolPath true boolean value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> getBooleanTrue(boolean boolPath) throws ServiceException;

    /**
     * Get true Boolean value on path
     *
     * @param boolPath true boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBooleanTrueAsync(boolean boolPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get false Boolean value on path
     *
     * @param boolPath false boolean value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> getBooleanFalse(boolean boolPath) throws ServiceException;

    /**
     * Get false Boolean value on path
     *
     * @param boolPath false boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBooleanFalseAsync(boolean boolPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '1000000' integer value
     *
     * @param intPath '1000000' integer value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> getIntOneMillion(int intPath) throws ServiceException;

    /**
     * Get '1000000' integer value
     *
     * @param intPath '1000000' integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getIntOneMillionAsync(int intPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-1000000' integer value
     *
     * @param intPath '-1000000' integer value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> getIntNegativeOneMillion(int intPath) throws ServiceException;

    /**
     * Get '-1000000' integer value
     *
     * @param intPath '-1000000' integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getIntNegativeOneMillionAsync(int intPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '10000000000' 64 bit integer value
     *
     * @param longPath '10000000000' 64 bit integer value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> getTenBillion(long longPath) throws ServiceException;

    /**
     * Get '10000000000' 64 bit integer value
     *
     * @param longPath '10000000000' 64 bit integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getTenBillionAsync(long longPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-10000000000' 64 bit integer value
     *
     * @param longPath '-10000000000' 64 bit integer value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> getNegativeTenBillion(long longPath) throws ServiceException;

    /**
     * Get '-10000000000' 64 bit integer value
     *
     * @param longPath '-10000000000' 64 bit integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNegativeTenBillionAsync(long longPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '1.034E+20' numeric value
     *
     * @param floatPath '1.034E+20'numeric value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> floatScientificPositive(double floatPath) throws ServiceException;

    /**
     * Get '1.034E+20' numeric value
     *
     * @param floatPath '1.034E+20'numeric value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> floatScientificPositiveAsync(double floatPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-1.034E-20' numeric value
     *
     * @param floatPath '-1.034E-20'numeric value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> floatScientificNegative(double floatPath) throws ServiceException;

    /**
     * Get '-1.034E-20' numeric value
     *
     * @param floatPath '-1.034E-20'numeric value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> floatScientificNegativeAsync(double floatPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '9999999.999' numeric value
     *
     * @param doublePath '9999999.999'numeric value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> doubleDecimalPositive(double doublePath) throws ServiceException;

    /**
     * Get '9999999.999' numeric value
     *
     * @param doublePath '9999999.999'numeric value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> doubleDecimalPositiveAsync(double doublePath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-9999999.999' numeric value
     *
     * @param doublePath '-9999999.999'numeric value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> doubleDecimalNegative(double doublePath) throws ServiceException;

    /**
     * Get '-9999999.999' numeric value
     *
     * @param doublePath '-9999999.999'numeric value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> doubleDecimalNegativeAsync(double doublePath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value
     *
     * @param stringPath '啊齄丂狛狜隣郎隣兀﨩'multi-byte string value. Possible values for this parameter include: '啊齄丂狛狜隣郎隣兀﨩'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> stringUnicode(String stringPath) throws ServiceException;

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value
     *
     * @param stringPath '啊齄丂狛狜隣郎隣兀﨩'multi-byte string value. Possible values for this parameter include: '啊齄丂狛狜隣郎隣兀﨩'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> stringUnicodeAsync(String stringPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end
     *
     * @param stringPath 'begin!*'();:@ &amp;=+$,/?#[]end' url encoded string value. Possible values for this parameter include: 'begin!*'();:@ &amp;=+$,/?#[]end'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> stringUrlEncoded(String stringPath) throws ServiceException;

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end
     *
     * @param stringPath 'begin!*'();:@ &amp;=+$,/?#[]end' url encoded string value. Possible values for this parameter include: 'begin!*'();:@ &amp;=+$,/?#[]end'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> stringUrlEncodedAsync(String stringPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get ''
     *
     * @param stringPath '' string value. Possible values for this parameter include: ''
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> stringEmpty(String stringPath) throws ServiceException;

    /**
     * Get ''
     *
     * @param stringPath '' string value. Possible values for this parameter include: ''
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> stringEmptyAsync(String stringPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null (should throw)
     *
     * @param stringPath null string value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> stringNull(String stringPath) throws ServiceException;

    /**
     * Get null (should throw)
     *
     * @param stringPath null string value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> stringNullAsync(String stringPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get using uri with 'green color' in path parameter
     *
     * @param enumPath send the value green. Possible values for this parameter include: 'red color', 'green color', 'blue color'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> enumValid(UriColor enumPath) throws ServiceException;

    /**
     * Get using uri with 'green color' in path parameter
     *
     * @param enumPath send the value green. Possible values for this parameter include: 'red color', 'green color', 'blue color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> enumValidAsync(UriColor enumPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null (should throw on the client before the request is sent on wire)
     *
     * @param enumPath send null should throw. Possible values for this parameter include: 'red color', 'green color', 'blue color'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> enumNull(UriColor enumPath) throws ServiceException;

    /**
     * Get null (should throw on the client before the request is sent on wire)
     *
     * @param enumPath send null should throw. Possible values for this parameter include: 'red color', 'green color', 'blue color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> enumNullAsync(UriColor enumPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> byteMultiByte(byte[] bytePath) throws ServiceException;

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> byteMultiByteAsync(byte[] bytePath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '' as byte array
     *
     * @param bytePath '' as byte array
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> byteEmpty(byte[] bytePath) throws ServiceException;

    /**
     * Get '' as byte array
     *
     * @param bytePath '' as byte array
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> byteEmptyAsync(byte[] bytePath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null as byte array (should throw)
     *
     * @param bytePath null as byte array (should throw)
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> byteNull(byte[] bytePath) throws ServiceException;

    /**
     * Get null as byte array (should throw)
     *
     * @param bytePath null as byte array (should throw)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> byteNullAsync(byte[] bytePath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '2012-01-01' as date
     *
     * @param datePath '2012-01-01' as date
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> dateValid(LocalDate datePath) throws ServiceException;

    /**
     * Get '2012-01-01' as date
     *
     * @param datePath '2012-01-01' as date
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> dateValidAsync(LocalDate datePath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation
     *
     * @param datePath null as date (should throw)
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> dateNull(LocalDate datePath) throws ServiceException;

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation
     *
     * @param datePath null as date (should throw)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> dateNullAsync(LocalDate datePath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '2012-01-01T01:01:01Z' as date-time
     *
     * @param dateTimePath '2012-01-01T01:01:01Z' as date-time
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> dateTimeValid(DateTime dateTimePath) throws ServiceException;

    /**
     * Get '2012-01-01T01:01:01Z' as date-time
     *
     * @param dateTimePath '2012-01-01T01:01:01Z' as date-time
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> dateTimeValidAsync(DateTime dateTimePath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time
     *
     * @param dateTimePath null as date-time
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> dateTimeNull(DateTime dateTimePath) throws ServiceException;

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time
     *
     * @param dateTimePath null as date-time
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> dateTimeNullAsync(DateTime dateTimePath, final ServiceCallback<Void> serviceCallback);

}
