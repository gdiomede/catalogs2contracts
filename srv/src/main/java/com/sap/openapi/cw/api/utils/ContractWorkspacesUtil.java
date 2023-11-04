package com.sap.openapi.cw.api.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type; 

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.sap.openapi.cw.model.ContractWorkspace;

public class ContractWorkspacesUtil {
    
    private static Type CONTRACT_WORKSPACE_TYPE = new TypeToken<List<ContractWorkspace>>() {}.getType();

    public static List<ContractWorkspace> readContractWorkspaceJson(String fileName) {
        Gson gson = new Gson();
        List<ContractWorkspace> data = new ArrayList<ContractWorkspace>();
        try (JsonReader reader = new JsonReader(new FileReader(fileName))) {
            data = gson.fromJson(reader, CONTRACT_WORKSPACE_TYPE);
        } catch (JsonIOException | JsonSyntaxException | IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
