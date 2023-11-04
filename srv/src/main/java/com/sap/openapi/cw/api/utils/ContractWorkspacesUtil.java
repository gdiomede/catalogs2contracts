package com.sap.openapi.cw.api.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import com.sap.cds.services.utils.StringUtils;
import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestination;
import com.sap.openapi.cw.api.ContractWorkspacesResourceApi;
import com.sap.openapi.cw.model.ContractWorkspace;
import com.sap.openapi.cw.model.ContractWorkspacesResponse;

public class ContractWorkspacesUtil {

    private static Type CONTRACT_WORKSPACE_LIST_TYPE = new TypeToken<List<ContractWorkspace>>() {
    }.getType();
    private static Type CONTRACT_WORKSPACE_TYPE = new TypeToken<ContractWorkspace>() {
    }.getType();
    private static Logger logger = LoggerFactory.getLogger(ContractWorkspacesUtil.class);

    public static List<ContractWorkspace> readContractWorkspacesJson(String fileName) {
        logger.debug("sono in readContractWorkspacesJson");
        List<ContractWorkspace> data = new ArrayList<ContractWorkspace>();
        File file = getFileFromResources(fileName);
        if (file == null)
            return data;

        Gson gson = new Gson();

        try (JsonReader reader = new JsonReader(new FileReader(file))) {
            data = gson.fromJson(reader, CONTRACT_WORKSPACE_LIST_TYPE);
        } catch (JsonIOException | JsonSyntaxException | IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static ContractWorkspace readContractWorkspaceJson(String fileName) {
        logger.debug("sono in readContractWorkspaceJson");
        ContractWorkspace data = new ContractWorkspace();
        File file = getFileFromResources(fileName);
        if (file == null)
            return data;

        Gson gson = new Gson();

        try (JsonReader reader = new JsonReader(new FileReader(file))) {
            data = gson.fromJson(reader, CONTRACT_WORKSPACE_TYPE);
        } catch (JsonIOException | JsonSyntaxException | IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static File getFileFromResources(String fileName) {
        if (StringUtils.isEmpty(fileName))
            return null;
        Resource resource = new ClassPathResource(fileName);
        try {
            return resource.getFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ContractWorkspacesResponse createContractWorkspace(HttpDestination destination, String user,
            String passwordAdapter, String realm, ContractWorkspace cw) {
        ContractWorkspacesResourceApi service = new ContractWorkspacesResourceApi(destination);
        ContractWorkspacesResponse result = service.createContractWorkspace(user, passwordAdapter, realm, cw);
        return result;
    }

    public static HttpDestination getDestination(String dest) {
        HttpDestination destination = DestinationAccessor.getDestination(dest).asHttp();
        return destination;
    }
}
