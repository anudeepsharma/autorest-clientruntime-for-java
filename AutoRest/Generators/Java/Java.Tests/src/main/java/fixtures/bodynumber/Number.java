/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodynumber;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.math.BigDecimal;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.PUT;

/**
 * An instance of this class provides access to all the operations defined
 * in Number.
 */
public interface Number {
    /**
     * The interface defining all the services for Number to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NumberService {
        @GET("/number/null")
        Call<ResponseBody> getNull();

        @GET("/number/invalidfloat")
        Call<ResponseBody> getInvalidFloat();

        @GET("/number/invaliddouble")
        Call<ResponseBody> getInvalidDouble();

        @GET("/number/invaliddecimal")
        Call<ResponseBody> getInvalidDecimal();

        @PUT("/number/big/float/3.402823e+20")
        Call<ResponseBody> putBigFloat(@Body double numberBody);

        @GET("/number/big/float/3.402823e+20")
        Call<ResponseBody> getBigFloat();

        @PUT("/number/big/double/2.5976931e+101")
        Call<ResponseBody> putBigDouble(@Body double numberBody);

        @GET("/number/big/double/2.5976931e+101")
        Call<ResponseBody> getBigDouble();

        @PUT("/number/big/double/99999999.99")
        Call<ResponseBody> putBigDoublePositiveDecimal(@Body double numberBody);

        @GET("/number/big/double/99999999.99")
        Call<ResponseBody> getBigDoublePositiveDecimal();

        @PUT("/number/big/double/-99999999.99")
        Call<ResponseBody> putBigDoubleNegativeDecimal(@Body double numberBody);

        @GET("/number/big/double/-99999999.99")
        Call<ResponseBody> getBigDoubleNegativeDecimal();

        @PUT("/number/big/decimal/2.5976931e+101")
        Call<ResponseBody> putBigDecimal(@Body BigDecimal numberBody);

        @GET("/number/big/decimal/2.5976931e+101")
        Call<ResponseBody> getBigDecimal();

        @PUT("/number/big/decimal/99999999.99")
        Call<ResponseBody> putBigDecimalPositiveDecimal(@Body BigDecimal numberBody);

        @GET("/number/big/decimal/99999999.99")
        Call<ResponseBody> getBigDecimalPositiveDecimal();

        @PUT("/number/big/decimal/-99999999.99")
        Call<ResponseBody> putBigDecimalNegativeDecimal(@Body BigDecimal numberBody);

        @GET("/number/big/decimal/-99999999.99")
        Call<ResponseBody> getBigDecimalNegativeDecimal();

        @PUT("/number/small/float/3.402823e-20")
        Call<ResponseBody> putSmallFloat(@Body double numberBody);

        @GET("/number/small/float/3.402823e-20")
        Call<ResponseBody> getSmallFloat();

        @PUT("/number/small/double/2.5976931e-101")
        Call<ResponseBody> putSmallDouble(@Body double numberBody);

        @GET("/number/small/double/2.5976931e-101")
        Call<ResponseBody> getSmallDouble();

        @PUT("/number/small/decimal/2.5976931e-101")
        Call<ResponseBody> putSmallDecimal(@Body BigDecimal numberBody);

        @GET("/number/small/decimal/2.5976931e-101")
        Call<ResponseBody> getSmallDecimal();

    }
    /**
     * Get null Number value
     *
     * @return the Double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Double> getNull() throws ServiceException;

    /**
     * Get null Number value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNullAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get invalid float Number value
     *
     * @return the Double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Double> getInvalidFloat() throws ServiceException;

    /**
     * Get invalid float Number value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getInvalidFloatAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get invalid double Number value
     *
     * @return the Double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Double> getInvalidDouble() throws ServiceException;

    /**
     * Get invalid double Number value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getInvalidDoubleAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get invalid decimal Number value
     *
     * @return the BigDecimal object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<BigDecimal> getInvalidDecimal() throws ServiceException;

    /**
     * Get invalid decimal Number value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getInvalidDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

    /**
     * Put big float value 3.402823e+20
     *
     * @param numberBody the double value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> putBigFloat(double numberBody) throws ServiceException;

    /**
     * Put big float value 3.402823e+20
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putBigFloatAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big float value 3.402823e+20
     *
     * @return the Double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Double> getBigFloat() throws ServiceException;

    /**
     * Get big float value 3.402823e+20
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBigFloatAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Put big double value 2.5976931e+101
     *
     * @param numberBody the double value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> putBigDouble(double numberBody) throws ServiceException;

    /**
     * Put big double value 2.5976931e+101
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putBigDoubleAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big double value 2.5976931e+101
     *
     * @return the Double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Double> getBigDouble() throws ServiceException;

    /**
     * Get big double value 2.5976931e+101
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBigDoubleAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Put big double value 99999999.99
     *
     * @param numberBody the double value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> putBigDoublePositiveDecimal(double numberBody) throws ServiceException;

    /**
     * Put big double value 99999999.99
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putBigDoublePositiveDecimalAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big double value 99999999.99
     *
     * @return the Double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Double> getBigDoublePositiveDecimal() throws ServiceException;

    /**
     * Get big double value 99999999.99
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBigDoublePositiveDecimalAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Put big double value -99999999.99
     *
     * @param numberBody the double value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> putBigDoubleNegativeDecimal(double numberBody) throws ServiceException;

    /**
     * Put big double value -99999999.99
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putBigDoubleNegativeDecimalAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big double value -99999999.99
     *
     * @return the Double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Double> getBigDoubleNegativeDecimal() throws ServiceException;

    /**
     * Get big double value -99999999.99
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBigDoubleNegativeDecimalAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Put big decimal value 2.5976931e+101
     *
     * @param numberBody the BigDecimal value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> putBigDecimal(BigDecimal numberBody) throws ServiceException;

    /**
     * Put big decimal value 2.5976931e+101
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putBigDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big decimal value 2.5976931e+101
     *
     * @return the BigDecimal object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<BigDecimal> getBigDecimal() throws ServiceException;

    /**
     * Get big decimal value 2.5976931e+101
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBigDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

    /**
     * Put big decimal value 99999999.99
     *
     * @param numberBody the BigDecimal value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> putBigDecimalPositiveDecimal(BigDecimal numberBody) throws ServiceException;

    /**
     * Put big decimal value 99999999.99
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putBigDecimalPositiveDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big decimal value 99999999.99
     *
     * @return the BigDecimal object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<BigDecimal> getBigDecimalPositiveDecimal() throws ServiceException;

    /**
     * Get big decimal value 99999999.99
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBigDecimalPositiveDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

    /**
     * Put big decimal value -99999999.99
     *
     * @param numberBody the BigDecimal value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> putBigDecimalNegativeDecimal(BigDecimal numberBody) throws ServiceException;

    /**
     * Put big decimal value -99999999.99
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putBigDecimalNegativeDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big decimal value -99999999.99
     *
     * @return the BigDecimal object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<BigDecimal> getBigDecimalNegativeDecimal() throws ServiceException;

    /**
     * Get big decimal value -99999999.99
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getBigDecimalNegativeDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

    /**
     * Put small float value 3.402823e-20
     *
     * @param numberBody the double value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> putSmallFloat(double numberBody) throws ServiceException;

    /**
     * Put small float value 3.402823e-20
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putSmallFloatAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big double value 3.402823e-20
     *
     * @return the Double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Double> getSmallFloat() throws ServiceException;

    /**
     * Get big double value 3.402823e-20
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getSmallFloatAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Put small double value 2.5976931e-101
     *
     * @param numberBody the double value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> putSmallDouble(double numberBody) throws ServiceException;

    /**
     * Put small double value 2.5976931e-101
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putSmallDoubleAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get big double value 2.5976931e-101
     *
     * @return the Double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Double> getSmallDouble() throws ServiceException;

    /**
     * Get big double value 2.5976931e-101
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getSmallDoubleAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Put small decimal value 2.5976931e-101
     *
     * @param numberBody the BigDecimal value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> putSmallDecimal(BigDecimal numberBody) throws ServiceException;

    /**
     * Put small decimal value 2.5976931e-101
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putSmallDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get small decimal value 2.5976931e-101
     *
     * @return the BigDecimal object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<BigDecimal> getSmallDecimal() throws ServiceException;

    /**
     * Get small decimal value 2.5976931e-101
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getSmallDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

}
