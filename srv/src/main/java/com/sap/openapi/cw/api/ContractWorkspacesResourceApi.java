

package com.sap.openapi.cw.api;

import com.sap.cloud.sdk.services.openapi.core.OpenApiRequestException;
import com.sap.cloud.sdk.services.openapi.core.OpenApiResponse;
import com.sap.cloud.sdk.services.openapi.core.AbstractOpenApiService;
import com.sap.cloud.sdk.services.openapi.apiclient.ApiClient;

import com.sap.openapi.cw.model.ContractWorkspace ; //NOPMD
import com.sap.openapi.cw.model.ContractWorkspaceAction ; //NOPMD
import com.sap.openapi.cw.model.ContractWorkspaceActionResponse ; //NOPMD
import com.sap.openapi.cw.model.ContractWorkspacesResponse ; //NOPMD
import com.sap.openapi.cw.model.Error1 ; //NOPMD
import com.sap.openapi.cw.model.Error2 ; //NOPMD
import com.sap.openapi.cw.model.Error3 ; //NOPMD
import com.sap.openapi.cw.model.Error4 ; //NOPMD
import com.sap.openapi.cw.model.Error5 ; //NOPMD
import com.sap.openapi.cw.model.Error6 ; //NOPMD

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
* Contract Workspace Modification API in version 1.0.0.
*
* This Contract Workspace API allows a client application to : -Create the Contract workspace using Ariba TemplateID -Update the Contract workspace using ContractID -Change the state of the contract workspace, identified by the ContractID, to amend or complete amendment. -Deletes the Contract workspace procurement using ContractID
*/

public class ContractWorkspacesResourceApi extends AbstractOpenApiService {
    /**
    * Instantiates this API class to invoke operations on the Contract Workspace Modification API.
    *
    * @param httpDestination The destination that API should be used with
    */
    public ContractWorkspacesResourceApi( @Nonnull final HttpDestinationProperties httpDestination )
    {
        super(httpDestination);
    }

    /**
    * Instantiates this API class to invoke operations on the Contract Workspace Modification API based on a given {@link ApiClient}.
    *
    * @param apiClient
    *            ApiClient to invoke the API on
    */
    @Beta
    public ContractWorkspacesResourceApi( @Nonnull final ApiClient apiClient )
    {
         super(apiClient);
    }

        /**
    * <p>Create a contract workspace</p>
     *<p>Create a new contract workspace in SAP Ariba Contracts. Specify the required data in the request body for creating a new contract workspace.</p>
     * <p><b>200</b> - Success
     * <p><b>201</b> - Successfully created workspace
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
* @param user
        Specify the user ID of the user on behalf of whom the SAP Ariba web service will perform the action. This is a required parameter. Example: useraa. Try it out on Sandbox with: adavis 
* @param passwordAdapter
        Specify the password adapter for authenticating the user. This is a required parameter. Example: PasswordAdapterX. Try it out on Sandbox with: PasswordAdapter1 
* @param realm
        Specify the unique identifier of the realm (site). This is a required parameter. Example: abc_site. Try it out on Sandbox with: s4All 
* @param body
        contract workspace fields for creating contract 
* @return ContractWorkspacesResponse
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public ContractWorkspacesResponse createContractWorkspace( @Nonnull final String user,  @Nonnull final String passwordAdapter,  @Nonnull final String realm,  @Nonnull final ContractWorkspace body) throws OpenApiRequestException {
        final Object localVarPostBody = body;
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new OpenApiRequestException("Missing the required parameter 'user' when calling createContractWorkspace");
        }
        
        // verify the required parameter 'passwordAdapter' is set
        if (passwordAdapter == null) {
            throw new OpenApiRequestException("Missing the required parameter 'passwordAdapter' when calling createContractWorkspace");
        }
        
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new OpenApiRequestException("Missing the required parameter 'realm' when calling createContractWorkspace");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new OpenApiRequestException("Missing the required parameter 'body' when calling createContractWorkspace");
        }
        
        final String localVarPath = UriComponentsBuilder.fromPath("/contractWorkspaces").build().toUriString();

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

        final ParameterizedTypeReference<ContractWorkspacesResponse> localVarReturnType = new ParameterizedTypeReference<ContractWorkspacesResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
    * <p>Delete a contract workspace</p>
     *<p>Delete a contract workspace in SAP Ariba Contracts.</p>
     * <p><b>204</b> - No Content.
     * <p><b>400</b> - Bad Request. One or more parameters specified in the request are incorrect.
     * <p><b>401</b> - Unauthorized user credentials.
     * <p><b>403</b> - Forbidden. User does not have the required permissions to access the content.
     * <p><b>404</b> - Contract workspace not found.
     * <p><b>500</b> - Internal Server Error.
     * <p><b>504</b> - Gateway Timeout.
* @param contractId
        The ID of the contract workspace that you want to delete. Try it out on Sandbox with: CW0001.
* @param user
        User ID of the user on whose behalf the API call is invoked. This is a required parameter. Try it out on Sandbox with: testUser.
* @param passwordAdapter
        Password adapter used for authenticating the user on whose behalf the API call is invoked. This is a required parameter.Try it out on Sandbox with: PasswordAdapter1.
* @param realm
        Name of the SAP Ariba Contract site to which the API query is sent. Try it out on Sandbox with: testrealm.
* @return An OpenApiResponse containing the status code of the HttpResponse.
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
     @Nonnull  public OpenApiResponse deleteContractWorkspace( @Nonnull final String contractId,  @Nonnull final String user,  @Nonnull final String passwordAdapter,  @Nonnull final String realm) throws OpenApiRequestException {
        final Object localVarPostBody = null;
        
        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new OpenApiRequestException("Missing the required parameter 'contractId' when calling deleteContractWorkspace");
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new OpenApiRequestException("Missing the required parameter 'user' when calling deleteContractWorkspace");
        }
        
        // verify the required parameter 'passwordAdapter' is set
        if (passwordAdapter == null) {
            throw new OpenApiRequestException("Missing the required parameter 'passwordAdapter' when calling deleteContractWorkspace");
        }
        
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new OpenApiRequestException("Missing the required parameter 'realm' when calling deleteContractWorkspace");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("contractId", contractId);
        final String localVarPath = UriComponentsBuilder.fromPath("/contractWorkspaces/{contractId}").buildAndExpand(localVarPathParams).toUriString();

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

        final ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(localVarPath, HttpMethod.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
        return new OpenApiResponse(apiClient);
    }
    /**
    * <p>Change the status of a contract workspace</p>
     *<p>This endpoint enables you to change the status of a contract workspace to amend, complete amendment, putOnHold, resume or close.</p>
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
* @param contractId
        Specify the ID of the contract workspace for which you want to change the status of the contract workspace. It is a required parameter. Try it out on Sandbox with: CW0001
* @param user
        Specify the user ID of the user on behalf of whom the SAP Ariba web service will perform the action. This is a required parameter. Example: useraa. Try it out on Sandbox with: adavis 
* @param passwordAdapter
        Specify the password adapter for authenticating the user. This is a required parameter. Example: PasswordAdapterX. Try it out on Sandbox with: PasswordAdapter1 
* @param realm
        Specify the unique identifier of the realm (site). This is a required parameter. Example: abc_site. Try it out on Sandbox with: s4All 
* @param body
        Specify the type of action. Valid values: amend, putOnHold, resume or close. Try it out on Sandbox with &#39;amend&#39; and provide the amendAttributes.
* @return ContractWorkspaceActionResponse
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public ContractWorkspaceActionResponse performActionContractWorkspace( @Nonnull final String contractId,  @Nonnull final String user,  @Nonnull final String passwordAdapter,  @Nonnull final String realm,  @Nonnull final ContractWorkspaceAction body) throws OpenApiRequestException {
        final Object localVarPostBody = body;
        
        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new OpenApiRequestException("Missing the required parameter 'contractId' when calling performActionContractWorkspace");
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new OpenApiRequestException("Missing the required parameter 'user' when calling performActionContractWorkspace");
        }
        
        // verify the required parameter 'passwordAdapter' is set
        if (passwordAdapter == null) {
            throw new OpenApiRequestException("Missing the required parameter 'passwordAdapter' when calling performActionContractWorkspace");
        }
        
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new OpenApiRequestException("Missing the required parameter 'realm' when calling performActionContractWorkspace");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new OpenApiRequestException("Missing the required parameter 'body' when calling performActionContractWorkspace");
        }
        
        // create path and map variables
        final Map<String, Object> localVarPathParams = new HashMap<String, Object>();
        localVarPathParams.put("contractId", contractId);
        final String localVarPath = UriComponentsBuilder.fromPath("/contractWorkspaces/{contractId}/state").buildAndExpand(localVarPathParams).toUriString();

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

        final ParameterizedTypeReference<ContractWorkspaceActionResponse> localVarReturnType = new ParameterizedTypeReference<ContractWorkspaceActionResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * <p>Updated an existing contract workspace</p>
     *<p>Update an existing contract workspace in SAP Ariba Contracts. You can provide the required data, including the contract ID, in the request body.</p>
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param user  (required)
        Specify the user ID of the user on behalf of whom the SAP Ariba web service will perform the action. This is a required parameter. Example: useraa. Try it out on Sandbox with: adavis 
     * @param passwordAdapter  (required)
        Specify the password adapter for authenticating the user. This is a required parameter. Example: PasswordAdapterX. Try it out on Sandbox with: PasswordAdapter1 
     * @param realm  (required)
        Specify the unique identifier of the realm (site). This is a required parameter. Example: abc_site. Try it out on Sandbox with: s4All 
     * @param body  (required)
        contract workspace fields for updating contract 
     * @param silentUpdate  (optional)
        Specify whether the contract workspace must be updated without changing the last modified date. Valid values: Yes and No. This parameter is used by the integrated systems to update the integratedSystemRef and blockPublish fields of published contract workspaces. It is an optional parameter. Try it out on Sandbox with: Yes or No
     * @return ContractWorkspacesResponse
     * @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable  public ContractWorkspacesResponse updateContractWorkspace( @Nonnull final String user,  @Nonnull final String passwordAdapter,  @Nonnull final String realm,  @Nonnull final ContractWorkspace body,  @Nullable final String silentUpdate) throws OpenApiRequestException {
        final Object localVarPostBody = body;
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new OpenApiRequestException("Missing the required parameter 'user' when calling updateContractWorkspace");
        }
        
        // verify the required parameter 'passwordAdapter' is set
        if (passwordAdapter == null) {
            throw new OpenApiRequestException("Missing the required parameter 'passwordAdapter' when calling updateContractWorkspace");
        }
        
        // verify the required parameter 'realm' is set
        if (realm == null) {
            throw new OpenApiRequestException("Missing the required parameter 'realm' when calling updateContractWorkspace");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new OpenApiRequestException("Missing the required parameter 'body' when calling updateContractWorkspace");
        }
        
        final String localVarPath = UriComponentsBuilder.fromPath("/contractWorkspaces").build().toUriString();

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "user", user));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "passwordAdapter", passwordAdapter));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "realm", realm));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "silentUpdate", silentUpdate));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        final String[] localVarAuthNames = new String[] {  };

        final ParameterizedTypeReference<ContractWorkspacesResponse> localVarReturnType = new ParameterizedTypeReference<ContractWorkspacesResponse>() {};
        return apiClient.invokeAPI(localVarPath, HttpMethod.PATCH, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
    * <p>Updated an existing contract workspace</p>
     *<p>Update an existing contract workspace in SAP Ariba Contracts. You can provide the required data, including the contract ID, in the request body.</p>
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
* @param user
        Specify the user ID of the user on behalf of whom the SAP Ariba web service will perform the action. This is a required parameter. Example: useraa. Try it out on Sandbox with: adavis 
* @param passwordAdapter
        Specify the password adapter for authenticating the user. This is a required parameter. Example: PasswordAdapterX. Try it out on Sandbox with: PasswordAdapter1 
* @param realm
        Specify the unique identifier of the realm (site). This is a required parameter. Example: abc_site. Try it out on Sandbox with: s4All 
* @param body
        contract workspace fields for updating contract 
* @return ContractWorkspacesResponse
* @throws OpenApiRequestException if an error occurs while attempting to invoke the API
     */
    @Nullable   public ContractWorkspacesResponse updateContractWorkspace( @Nonnull final String user,  @Nonnull final String passwordAdapter,  @Nonnull final String realm,  @Nonnull final ContractWorkspace body) throws OpenApiRequestException {
        return updateContractWorkspace(user, passwordAdapter, realm, body, null);
    }
}
