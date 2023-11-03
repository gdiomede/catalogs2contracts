

package com.sap.openapi.ct.api;

import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;
import com.sap.cloud.sdk.services.openapi.core.AbstractOpenApiService;
import com.sap.cloud.sdk.services.openapi.apiclient.ApiClient;

import com.sap.openapi.ct.model.ContractTerms ; //NOPMD
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

public class GetContractTermsIdApi extends AbstractOpenApiService {
    /**
    * Instantiates this API class to invoke operations on the Contract Terms Management API.
    *
    * @param httpDestination The destination that API should be used with
    */
    public GetContractTermsIdApi( @Nonnull final HttpDestinationProperties httpDestination )
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
    public GetContractTermsIdApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

        /**
    * <p>Retrieve the contract terms document details and the associated compliance contract details.</p>
     *<p>This endpoint helps you retrieve the details, such as document ID, owner, status, modified dates, etc., of the contract  terms document in the contract workspace and the corresponding contract request ID and contract ID for the compliance contract.</p>
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
* @param contractId
        Contract workspace ID Eg: contractId&#x3D;Doc123456
* @param user
        User ID of the user on whose behalf the API call is invoked.
* @param passwordAdapter
        Password adapter used for authenticating the user on whose behalf the API call is invoked.
* @param realm
        Name of the SAP Ariba Contract site to which the API query is sent.
* @return ContractTerms
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public ContractTerms getContractTermsId( @Nonnull final String contractId,  @Nonnull final String user,  @Nonnull final String passwordAdapter,  @Nonnull final String realm) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new OpenApiRequestException("Missing the required parameter 'contractId' when calling getContractTermsId");
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new OpenApiRequestException("Missing the required parameter 'user' when calling getContractTermsId");
        }
        
        // verify the required parameter 'passwordAdapter' is set
        if (passwordAdapter == null) {
            throw new OpenApiRequestException("Missing the required parameter 'passwordAdapter' when calling getContractTermsId");
        }
        
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new OpenApiRequestException("Missing the required parameter 'realm' when calling getContractTermsId");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("contractId", contractId);
        final String localVarPath = UriComponentsBuilder.fromPath("/contractWorkspaces/{contractId}/contractTerms").buildAndExpand(localVarPathParams).toUriString();

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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] {  };

        final ParameterizedTypeReference<ContractTerms> localVarReturnType = new ParameterizedTypeReference<ContractTerms>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
