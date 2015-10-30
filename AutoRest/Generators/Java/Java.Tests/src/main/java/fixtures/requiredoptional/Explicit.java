/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.requiredoptional;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.requiredoptional.models.ArrayOptionalWrapper;
import fixtures.requiredoptional.models.ArrayWrapper;
import fixtures.requiredoptional.models.ClassOptionalWrapper;
import fixtures.requiredoptional.models.ClassWrapper;
import fixtures.requiredoptional.models.Error;
import fixtures.requiredoptional.models.IntOptionalWrapper;
import fixtures.requiredoptional.models.IntWrapper;
import fixtures.requiredoptional.models.Product;
import fixtures.requiredoptional.models.StringOptionalWrapper;
import fixtures.requiredoptional.models.StringWrapper;
import java.util.List;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.Header;
import retrofit.http.POST;

/**
 * An instance of this class provides access to all the operations defined
 * in Explicit.
 */
public interface Explicit {
    /**
     * The interface defining all the services for Explicit to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ExplicitService {
        @POST("/reqopt/requied/integer/parameter")
        Call<ResponseBody> postRequiredIntegerParameter(@Body int bodyParameter);

        @POST("/reqopt/optional/integer/parameter")
        Call<ResponseBody> postOptionalIntegerParameter(@Body Integer bodyParameter);

        @POST("/reqopt/requied/integer/property")
        Call<ResponseBody> postRequiredIntegerProperty(@Body IntWrapper bodyParameter);

        @POST("/reqopt/optional/integer/property")
        Call<ResponseBody> postOptionalIntegerProperty(@Body IntOptionalWrapper bodyParameter);

        @POST("/reqopt/requied/integer/header")
        Call<ResponseBody> postRequiredIntegerHeader(@Header("headerParameter") int headerParameter);

        @POST("/reqopt/optional/integer/header")
        Call<ResponseBody> postOptionalIntegerHeader(@Header("headerParameter") Integer headerParameter);

        @POST("/reqopt/requied/string/parameter")
        Call<ResponseBody> postRequiredStringParameter(@Body String bodyParameter);

        @POST("/reqopt/optional/string/parameter")
        Call<ResponseBody> postOptionalStringParameter(@Body String bodyParameter);

        @POST("/reqopt/requied/string/property")
        Call<ResponseBody> postRequiredStringProperty(@Body StringWrapper bodyParameter);

        @POST("/reqopt/optional/string/property")
        Call<ResponseBody> postOptionalStringProperty(@Body StringOptionalWrapper bodyParameter);

        @POST("/reqopt/requied/string/header")
        Call<ResponseBody> postRequiredStringHeader(@Header("headerParameter") String headerParameter);

        @POST("/reqopt/optional/string/header")
        Call<ResponseBody> postOptionalStringHeader(@Header("bodyParameter") String bodyParameter);

        @POST("/reqopt/requied/class/parameter")
        Call<ResponseBody> postRequiredClassParameter(@Body Product bodyParameter);

        @POST("/reqopt/optional/class/parameter")
        Call<ResponseBody> postOptionalClassParameter(@Body Product bodyParameter);

        @POST("/reqopt/requied/class/property")
        Call<ResponseBody> postRequiredClassProperty(@Body ClassWrapper bodyParameter);

        @POST("/reqopt/optional/class/property")
        Call<ResponseBody> postOptionalClassProperty(@Body ClassOptionalWrapper bodyParameter);

        @POST("/reqopt/requied/array/parameter")
        Call<ResponseBody> postRequiredArrayParameter(@Body List<String> bodyParameter);

        @POST("/reqopt/optional/array/parameter")
        Call<ResponseBody> postOptionalArrayParameter(@Body List<String> bodyParameter);

        @POST("/reqopt/requied/array/property")
        Call<ResponseBody> postRequiredArrayProperty(@Body ArrayWrapper bodyParameter);

        @POST("/reqopt/optional/array/property")
        Call<ResponseBody> postOptionalArrayProperty(@Body ArrayOptionalWrapper bodyParameter);

        @POST("/reqopt/requied/array/header")
        Call<ResponseBody> postRequiredArrayHeader(@Header("headerParameter") String headerParameter);

        @POST("/reqopt/optional/array/header")
        Call<ResponseBody> postOptionalArrayHeader(@Header("headerParameter") String headerParameter);

    }
    /**
     * Test explicitly required integer. Please put null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the int value
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Error> postRequiredIntegerParameter(int bodyParameter) throws ServiceException;

    /**
     * Test explicitly required integer. Please put null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postRequiredIntegerParameterAsync(int bodyParameter, final ServiceCallback<Error> serviceCallback);

    /**
     * Test explicitly optional integer. Please put null.
     *
     * @param bodyParameter the Integer value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> postOptionalIntegerParameter(Integer bodyParameter) throws ServiceException;

    /**
     * Test explicitly optional integer. Please put null.
     *
     * @param bodyParameter the Integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postOptionalIntegerParameterAsync(Integer bodyParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test explicitly required integer. Please put a valid int-wrapper with 'value' = null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the IntWrapper value
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Error> postRequiredIntegerProperty(IntWrapper bodyParameter) throws ServiceException;

    /**
     * Test explicitly required integer. Please put a valid int-wrapper with 'value' = null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the IntWrapper value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postRequiredIntegerPropertyAsync(IntWrapper bodyParameter, final ServiceCallback<Error> serviceCallback);

    /**
     * Test explicitly optional integer. Please put a valid int-wrapper with 'value' = null.
     *
     * @param bodyParameter the IntOptionalWrapper value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> postOptionalIntegerProperty(IntOptionalWrapper bodyParameter) throws ServiceException;

    /**
     * Test explicitly optional integer. Please put a valid int-wrapper with 'value' = null.
     *
     * @param bodyParameter the IntOptionalWrapper value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postOptionalIntegerPropertyAsync(IntOptionalWrapper bodyParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test explicitly required integer. Please put a header 'headerParameter' =&gt; null and the client library should throw before the request is sent.
     *
     * @param headerParameter the int value
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Error> postRequiredIntegerHeader(int headerParameter) throws ServiceException;

    /**
     * Test explicitly required integer. Please put a header 'headerParameter' =&gt; null and the client library should throw before the request is sent.
     *
     * @param headerParameter the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postRequiredIntegerHeaderAsync(int headerParameter, final ServiceCallback<Error> serviceCallback);

    /**
     * Test explicitly optional integer. Please put a header 'headerParameter' =&gt; null.
     *
     * @param headerParameter the Integer value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> postOptionalIntegerHeader(Integer headerParameter) throws ServiceException;

    /**
     * Test explicitly optional integer. Please put a header 'headerParameter' =&gt; null.
     *
     * @param headerParameter the Integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postOptionalIntegerHeaderAsync(Integer headerParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test explicitly required string. Please put null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the String value
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Error> postRequiredStringParameter(String bodyParameter) throws ServiceException;

    /**
     * Test explicitly required string. Please put null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postRequiredStringParameterAsync(String bodyParameter, final ServiceCallback<Error> serviceCallback);

    /**
     * Test explicitly optional string. Please put null.
     *
     * @param bodyParameter the String value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> postOptionalStringParameter(String bodyParameter) throws ServiceException;

    /**
     * Test explicitly optional string. Please put null.
     *
     * @param bodyParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postOptionalStringParameterAsync(String bodyParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test explicitly required string. Please put a valid string-wrapper with 'value' = null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the StringWrapper value
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Error> postRequiredStringProperty(StringWrapper bodyParameter) throws ServiceException;

    /**
     * Test explicitly required string. Please put a valid string-wrapper with 'value' = null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the StringWrapper value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postRequiredStringPropertyAsync(StringWrapper bodyParameter, final ServiceCallback<Error> serviceCallback);

    /**
     * Test explicitly optional integer. Please put a valid string-wrapper with 'value' = null.
     *
     * @param bodyParameter the StringOptionalWrapper value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> postOptionalStringProperty(StringOptionalWrapper bodyParameter) throws ServiceException;

    /**
     * Test explicitly optional integer. Please put a valid string-wrapper with 'value' = null.
     *
     * @param bodyParameter the StringOptionalWrapper value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postOptionalStringPropertyAsync(StringOptionalWrapper bodyParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test explicitly required string. Please put a header 'headerParameter' =&gt; null and the client library should throw before the request is sent.
     *
     * @param headerParameter the String value
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Error> postRequiredStringHeader(String headerParameter) throws ServiceException;

    /**
     * Test explicitly required string. Please put a header 'headerParameter' =&gt; null and the client library should throw before the request is sent.
     *
     * @param headerParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postRequiredStringHeaderAsync(String headerParameter, final ServiceCallback<Error> serviceCallback);

    /**
     * Test explicitly optional string. Please put a header 'headerParameter' =&gt; null.
     *
     * @param bodyParameter the String value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> postOptionalStringHeader(String bodyParameter) throws ServiceException;

    /**
     * Test explicitly optional string. Please put a header 'headerParameter' =&gt; null.
     *
     * @param bodyParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postOptionalStringHeaderAsync(String bodyParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test explicitly required complex object. Please put null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the Product value
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Error> postRequiredClassParameter(Product bodyParameter) throws ServiceException;

    /**
     * Test explicitly required complex object. Please put null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the Product value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postRequiredClassParameterAsync(Product bodyParameter, final ServiceCallback<Error> serviceCallback);

    /**
     * Test explicitly optional complex object. Please put null.
     *
     * @param bodyParameter the Product value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> postOptionalClassParameter(Product bodyParameter) throws ServiceException;

    /**
     * Test explicitly optional complex object. Please put null.
     *
     * @param bodyParameter the Product value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postOptionalClassParameterAsync(Product bodyParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test explicitly required complex object. Please put a valid class-wrapper with 'value' = null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the ClassWrapper value
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Error> postRequiredClassProperty(ClassWrapper bodyParameter) throws ServiceException;

    /**
     * Test explicitly required complex object. Please put a valid class-wrapper with 'value' = null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the ClassWrapper value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postRequiredClassPropertyAsync(ClassWrapper bodyParameter, final ServiceCallback<Error> serviceCallback);

    /**
     * Test explicitly optional complex object. Please put a valid class-wrapper with 'value' = null.
     *
     * @param bodyParameter the ClassOptionalWrapper value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> postOptionalClassProperty(ClassOptionalWrapper bodyParameter) throws ServiceException;

    /**
     * Test explicitly optional complex object. Please put a valid class-wrapper with 'value' = null.
     *
     * @param bodyParameter the ClassOptionalWrapper value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postOptionalClassPropertyAsync(ClassOptionalWrapper bodyParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test explicitly required array. Please put null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the List&lt;String&gt; value
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Error> postRequiredArrayParameter(List<String> bodyParameter) throws ServiceException;

    /**
     * Test explicitly required array. Please put null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postRequiredArrayParameterAsync(List<String> bodyParameter, final ServiceCallback<Error> serviceCallback);

    /**
     * Test explicitly optional array. Please put null.
     *
     * @param bodyParameter the List&lt;String&gt; value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> postOptionalArrayParameter(List<String> bodyParameter) throws ServiceException;

    /**
     * Test explicitly optional array. Please put null.
     *
     * @param bodyParameter the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postOptionalArrayParameterAsync(List<String> bodyParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test explicitly required array. Please put a valid array-wrapper with 'value' = null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the ArrayWrapper value
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Error> postRequiredArrayProperty(ArrayWrapper bodyParameter) throws ServiceException;

    /**
     * Test explicitly required array. Please put a valid array-wrapper with 'value' = null and the client library should throw before the request is sent.
     *
     * @param bodyParameter the ArrayWrapper value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postRequiredArrayPropertyAsync(ArrayWrapper bodyParameter, final ServiceCallback<Error> serviceCallback);

    /**
     * Test explicitly optional array. Please put a valid array-wrapper with 'value' = null.
     *
     * @param bodyParameter the ArrayOptionalWrapper value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> postOptionalArrayProperty(ArrayOptionalWrapper bodyParameter) throws ServiceException;

    /**
     * Test explicitly optional array. Please put a valid array-wrapper with 'value' = null.
     *
     * @param bodyParameter the ArrayOptionalWrapper value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postOptionalArrayPropertyAsync(ArrayOptionalWrapper bodyParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test explicitly required array. Please put a header 'headerParameter' =&gt; null and the client library should throw before the request is sent.
     *
     * @param headerParameter the List&lt;String&gt; value
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Error> postRequiredArrayHeader(List<String> headerParameter) throws ServiceException;

    /**
     * Test explicitly required array. Please put a header 'headerParameter' =&gt; null and the client library should throw before the request is sent.
     *
     * @param headerParameter the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postRequiredArrayHeaderAsync(List<String> headerParameter, final ServiceCallback<Error> serviceCallback);

    /**
     * Test explicitly optional integer. Please put a header 'headerParameter' =&gt; null.
     *
     * @param headerParameter the List&lt;String&gt; value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    ServiceResponse<Void> postOptionalArrayHeader(List<String> headerParameter) throws ServiceException;

    /**
     * Test explicitly optional integer. Please put a header 'headerParameter' =&gt; null.
     *
     * @param headerParameter the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postOptionalArrayHeaderAsync(List<String> headerParameter, final ServiceCallback<Void> serviceCallback);

}
