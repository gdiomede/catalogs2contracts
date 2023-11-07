package customer.catalogstocontracts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestination;
import com.sap.openapi.cw.api.utils.ContractWorkspacesUtil;
import com.sap.openapi.cw.model.ContractWorkspace;

@SpringBootApplication
public class Application  implements CommandLineRunner {

    @Override
    public void run(String args[]) throws Exception 
    { 
        // Print statement when method is called 
        ContractWorkspace cw = ContractWorkspacesUtil.readContractWorkspaceJson("CW001.json");
        HttpDestination destination = ContractWorkspacesUtil.getDestination("CW-API");
        ContractWorkspacesUtil.createContractWorkspace(destination, "I078573", "PasswordAdapter1", "ITESPOC-T", cw);

    } 

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
