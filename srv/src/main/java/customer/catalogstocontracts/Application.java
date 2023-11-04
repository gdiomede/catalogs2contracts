package customer.catalogstocontracts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sap.openapi.cw.api.utils.ContractWorkspacesUtil;
import com.sap.openapi.cw.model.ContractWorkspace;

@SpringBootApplication
public class Application  implements CommandLineRunner {

    @Override
    public void run(String args[]) throws Exception 
    { 
        // Print statement when method is called 
        ContractWorkspace cw = ContractWorkspacesUtil.readContractWorkspaceJson("CW001.json");
		cw.getContractId();
    } 

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
