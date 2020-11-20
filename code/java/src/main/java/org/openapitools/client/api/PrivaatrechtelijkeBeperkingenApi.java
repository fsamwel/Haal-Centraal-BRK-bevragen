/*
 * Kadaster - BRK-Bevragen API
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie. 
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.BadRequestFoutbericht;
import org.openapitools.client.model.Foutbericht;
import org.openapitools.client.model.PrivaatrechtelijkeBeperkingHal;
import org.openapitools.client.model.PrivaatrechtelijkeBeperkingHalCollectie;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrivaatrechtelijkeBeperkingenApi {
    private ApiClient localVarApiClient;

    public PrivaatrechtelijkeBeperkingenApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PrivaatrechtelijkeBeperkingenApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getPrivaatrechtelijkeBeperking
     * @param kadastraalonroerendezaakidentificatie De unieke identificatie van een kadastraal onroerende zaak.  (required)
     * @param privaatrechtelijkebeperkingidentificatie De unieke identificatie van een privaatrechtelijke beperking.  (required)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * warning -  <br>  * Content-Crs -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getPrivaatrechtelijkeBeperkingCall(String kadastraalonroerendezaakidentificatie, String privaatrechtelijkebeperkingidentificatie, String acceptCrs, String fields, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/kadastraalonroerendezaken/{kadastraalonroerendezaakidentificatie}/privaatrechtelijkebeperkingen/{privaatrechtelijkebeperkingidentificatie}"
            .replaceAll("\\{" + "kadastraalonroerendezaakidentificatie" + "\\}", localVarApiClient.escapeString(kadastraalonroerendezaakidentificatie.toString()))
            .replaceAll("\\{" + "privaatrechtelijkebeperkingidentificatie" + "\\}", localVarApiClient.escapeString(privaatrechtelijkebeperkingidentificatie.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (acceptCrs != null) {
            localVarHeaderParams.put("Accept-Crs", localVarApiClient.parameterToString(acceptCrs));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/hal+json", "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPrivaatrechtelijkeBeperkingValidateBeforeCall(String kadastraalonroerendezaakidentificatie, String privaatrechtelijkebeperkingidentificatie, String acceptCrs, String fields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'kadastraalonroerendezaakidentificatie' is set
        if (kadastraalonroerendezaakidentificatie == null) {
            throw new ApiException("Missing the required parameter 'kadastraalonroerendezaakidentificatie' when calling getPrivaatrechtelijkeBeperking(Async)");
        }
        
        // verify the required parameter 'privaatrechtelijkebeperkingidentificatie' is set
        if (privaatrechtelijkebeperkingidentificatie == null) {
            throw new ApiException("Missing the required parameter 'privaatrechtelijkebeperkingidentificatie' when calling getPrivaatrechtelijkeBeperking(Async)");
        }
        

        okhttp3.Call localVarCall = getPrivaatrechtelijkeBeperkingCall(kadastraalonroerendezaakidentificatie, privaatrechtelijkebeperkingidentificatie, acceptCrs, fields, _callback);
        return localVarCall;

    }

    /**
     * 
     * Het raadplegen van een specifieke privaatrechtelijke beperkingen. 
     * @param kadastraalonroerendezaakidentificatie De unieke identificatie van een kadastraal onroerende zaak.  (required)
     * @param privaatrechtelijkebeperkingidentificatie De unieke identificatie van een privaatrechtelijke beperking.  (required)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @return PrivaatrechtelijkeBeperkingHal
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * warning -  <br>  * Content-Crs -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public PrivaatrechtelijkeBeperkingHal getPrivaatrechtelijkeBeperking(String kadastraalonroerendezaakidentificatie, String privaatrechtelijkebeperkingidentificatie, String acceptCrs, String fields) throws ApiException {
        ApiResponse<PrivaatrechtelijkeBeperkingHal> localVarResp = getPrivaatrechtelijkeBeperkingWithHttpInfo(kadastraalonroerendezaakidentificatie, privaatrechtelijkebeperkingidentificatie, acceptCrs, fields);
        return localVarResp.getData();
    }

    /**
     * 
     * Het raadplegen van een specifieke privaatrechtelijke beperkingen. 
     * @param kadastraalonroerendezaakidentificatie De unieke identificatie van een kadastraal onroerende zaak.  (required)
     * @param privaatrechtelijkebeperkingidentificatie De unieke identificatie van een privaatrechtelijke beperking.  (required)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @return ApiResponse&lt;PrivaatrechtelijkeBeperkingHal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * warning -  <br>  * Content-Crs -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<PrivaatrechtelijkeBeperkingHal> getPrivaatrechtelijkeBeperkingWithHttpInfo(String kadastraalonroerendezaakidentificatie, String privaatrechtelijkebeperkingidentificatie, String acceptCrs, String fields) throws ApiException {
        okhttp3.Call localVarCall = getPrivaatrechtelijkeBeperkingValidateBeforeCall(kadastraalonroerendezaakidentificatie, privaatrechtelijkebeperkingidentificatie, acceptCrs, fields, null);
        Type localVarReturnType = new TypeToken<PrivaatrechtelijkeBeperkingHal>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Het raadplegen van een specifieke privaatrechtelijke beperkingen. 
     * @param kadastraalonroerendezaakidentificatie De unieke identificatie van een kadastraal onroerende zaak.  (required)
     * @param privaatrechtelijkebeperkingidentificatie De unieke identificatie van een privaatrechtelijke beperking.  (required)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * warning -  <br>  * Content-Crs -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getPrivaatrechtelijkeBeperkingAsync(String kadastraalonroerendezaakidentificatie, String privaatrechtelijkebeperkingidentificatie, String acceptCrs, String fields, final ApiCallback<PrivaatrechtelijkeBeperkingHal> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPrivaatrechtelijkeBeperkingValidateBeforeCall(kadastraalonroerendezaakidentificatie, privaatrechtelijkebeperkingidentificatie, acceptCrs, fields, _callback);
        Type localVarReturnType = new TypeToken<PrivaatrechtelijkeBeperkingHal>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPrivaatrechtelijkeBeperkingen
     * @param kadastraalonroerendezaakidentificatie De unieke identificatie van een kadastraal onroerende zaak.  (required)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * warning -  <br>  * Content-Crs -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getPrivaatrechtelijkeBeperkingenCall(String kadastraalonroerendezaakidentificatie, String acceptCrs, String fields, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/kadastraalonroerendezaken/{kadastraalonroerendezaakidentificatie}/privaatrechtelijkebeperkingen"
            .replaceAll("\\{" + "kadastraalonroerendezaakidentificatie" + "\\}", localVarApiClient.escapeString(kadastraalonroerendezaakidentificatie.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (acceptCrs != null) {
            localVarHeaderParams.put("Accept-Crs", localVarApiClient.parameterToString(acceptCrs));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/hal+json", "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPrivaatrechtelijkeBeperkingenValidateBeforeCall(String kadastraalonroerendezaakidentificatie, String acceptCrs, String fields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'kadastraalonroerendezaakidentificatie' is set
        if (kadastraalonroerendezaakidentificatie == null) {
            throw new ApiException("Missing the required parameter 'kadastraalonroerendezaakidentificatie' when calling getPrivaatrechtelijkeBeperkingen(Async)");
        }
        

        okhttp3.Call localVarCall = getPrivaatrechtelijkeBeperkingenCall(kadastraalonroerendezaakidentificatie, acceptCrs, fields, _callback);
        return localVarCall;

    }

    /**
     * 
     * Het raadplegen van de privaatrechtelijke beperkingen op een kadastraal onroerende zaak. 
     * @param kadastraalonroerendezaakidentificatie De unieke identificatie van een kadastraal onroerende zaak.  (required)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @return PrivaatrechtelijkeBeperkingHalCollectie
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * warning -  <br>  * Content-Crs -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public PrivaatrechtelijkeBeperkingHalCollectie getPrivaatrechtelijkeBeperkingen(String kadastraalonroerendezaakidentificatie, String acceptCrs, String fields) throws ApiException {
        ApiResponse<PrivaatrechtelijkeBeperkingHalCollectie> localVarResp = getPrivaatrechtelijkeBeperkingenWithHttpInfo(kadastraalonroerendezaakidentificatie, acceptCrs, fields);
        return localVarResp.getData();
    }

    /**
     * 
     * Het raadplegen van de privaatrechtelijke beperkingen op een kadastraal onroerende zaak. 
     * @param kadastraalonroerendezaakidentificatie De unieke identificatie van een kadastraal onroerende zaak.  (required)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @return ApiResponse&lt;PrivaatrechtelijkeBeperkingHalCollectie&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * warning -  <br>  * Content-Crs -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<PrivaatrechtelijkeBeperkingHalCollectie> getPrivaatrechtelijkeBeperkingenWithHttpInfo(String kadastraalonroerendezaakidentificatie, String acceptCrs, String fields) throws ApiException {
        okhttp3.Call localVarCall = getPrivaatrechtelijkeBeperkingenValidateBeforeCall(kadastraalonroerendezaakidentificatie, acceptCrs, fields, null);
        Type localVarReturnType = new TypeToken<PrivaatrechtelijkeBeperkingHalCollectie>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Het raadplegen van de privaatrechtelijke beperkingen op een kadastraal onroerende zaak. 
     * @param kadastraalonroerendezaakidentificatie De unieke identificatie van een kadastraal onroerende zaak.  (required)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * warning -  <br>  * Content-Crs -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getPrivaatrechtelijkeBeperkingenAsync(String kadastraalonroerendezaakidentificatie, String acceptCrs, String fields, final ApiCallback<PrivaatrechtelijkeBeperkingHalCollectie> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPrivaatrechtelijkeBeperkingenValidateBeforeCall(kadastraalonroerendezaakidentificatie, acceptCrs, fields, _callback);
        Type localVarReturnType = new TypeToken<PrivaatrechtelijkeBeperkingHalCollectie>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
