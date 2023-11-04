

package com.sap.openapi.ct.api;

import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;
import com.sap.cloud.sdk.services.openapi.core.AbstractOpenApiService;
import com.sap.cloud.sdk.services.openapi.apiclient.ApiClient;

import com.sap.openapi.ct.model.AsyncResponseError ; //NOPMD
import com.sap.openapi.ct.model.AsyncResponseOk ; //NOPMD
import com.sap.openapi.ct.model.ContractTermsAction ; //NOPMD
import com.sap.openapi.ct.model.Error ; //NOPMD

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.common.annotations.Beta;

import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestinationProperties;

/**
* Contract Terms Management API in version 1.0.0.
*
* This Contract Terms Management allows a client application to : - create a contract term in the specified contract workspace and a contract request for the corresponding compliance contract in the specified buyer realm. The API creates the Contract Terms Document in the specified contract workspace and then, calls the Compliance Contract Request API using the Contract Terms Document ID  and the buyer realm name as input. If the Compliance Contract Request Object is successfully created, then the API returns the ACC Contract Request ID to the client; otherwise, it sends an error message to the client. - retrieve details including contract term ID, contract request ID and contract ID for the specified contract workspace ID. The response contains the contract terms document details like title, owner, status etc and the compliance contract request details like Contract Request ID (CRID), Contract ID (CID), etc. associated with the contract workspace. - synchronize the contract line item information of a contract workspace with the linked compliance contract by specifying the IDs of the contract workspace and the compliance contract. If the request is successful, the API initiates an asynchronous job and returns the job ID for reference.
*/

public class SynchronizeContractLineItemsWithContractTermsApi extends AbstractOpenApiService {
    /**
    * Instantiates this API class to invoke operations on the Contract Terms Management API.
    *
    * @param httpDestination The destination that API should be used with
    */
    public SynchronizeContractLineItemsWithContractTermsApi( @Nonnull final HttpDestinationProperties httpDestination )
    {
        super(httpDestination);
    }

    /**
    * Instantiates this API class to invoke operations on the Contract Terms Management API based on a given {@link ApiClient}.
    *
    * @param apiClient
    *            ApiClient to invoke the API on
    */
    @Beta
    public SynchronizeContractLineItemsWithContractTermsApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

        /**
    * <p>Synchronize contract line item information with the compliance contract</p>
     *<p>Synchronize the contract line item information of a contract workspace with the linked compliance contract by specifying the IDs of the contract workspace and the compliance contract. If the request is successful, the API initiates an asynchronous job and returns the job ID for reference.</p>
     * <p><b>200</b> - Success.
     * <p><b>412</b> - The request could not be completed because of an existing dependency.
     * <p><b>400</b> - Bad Request. One or more parameters specified in the request are incorrect.
     * <p><b>401</b> - Unauthorized request. The required feature is not enabled on your site.
     * <p><b>403</b> - Forbidden. User does not have the required permissions to access the content.
     * <p><b>404</b> - Contract workspace not found.
* @param contractId
        The ID of the contract workspace whose line item information you want to sync.
* @param contractTermId
        The ID of the compliance contract linked with the specified contract workspace
* @param user
        User ID of the user on whose behalf the API call is invoked.
* @param passwordAdapter
        Password adapter used for authenticating the user on whose behalf the API call is invoked.
* @param realm
        Name of the SAP Ariba Contract site to which the API query is sent.
* @param body
        Request body containing the attributes to be passed with the API call. The only supported attribute is \&quot;action\&quot;, whose value must be \&quot;SyncLineItemsToTerms\\\&quot;.
* @return AsyncResponseOk
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public AsyncResponseOk syncLineItemsToTerms( @Nonnull final String contractId,  @Nonnull final String contractTermId,  @Nonnull final String user,  @Nonnull final String passwordAdapter,  @Nonnull final String realm,  @Nonnull final ContractTermsAction body) throws OpenApiRequestException {
        final Object localVarPostBody = body;
        
        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new OpenApiRequestException("Missing the required parameter 'contractId' when calling syncLineItemsToTerms");
        }
        
        // verify the required parameter 'contractTermId' is set
        if (contractTermId == null) {
            throw new OpenApiRequestException("Missing the required parameter 'contractTermId' when calling syncLineItemsToTerms");
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new OpenApiRequestException("Missing the required parameter 'user' when calling syncLineItemsToTerms");
        }
        
        // verify the required parameter 'passwordAdapter' is set
        if (passwordAdapter == null) {
            throw new OpenApiRequestException("Missing the required parameter 'passwordAdapter' when calling syncLineItemsToTerms");
        }
        
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new OpenApiRequestException("Missing the required parameter 'realm' when calling syncLineItemsToTerms");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new OpenApiRequestException("Missing the required parameter 'body' when calling syncLineItemsToTerms");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("contractId", contractId);
        localVarPathParams.put("contractTermId", contractTermId);
        final String localVarPath = UriComponentsBuilder.fromPath("/contractWorkspaces/{contractId}/contractTerms/{contractTermId}/state").buildAndExpand(localVarPathParams).toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "user", user));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "passwordAdapter", passwordAdapter));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "realm", realm));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] {  };

        final ParameterizedTypeReference<AsyncResponseOk> localVarReturnType = new ParameterizedTypeReference<AsyncResponseOk>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
