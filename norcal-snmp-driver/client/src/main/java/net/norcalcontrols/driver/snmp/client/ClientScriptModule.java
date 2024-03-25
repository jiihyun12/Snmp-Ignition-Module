package net.norcalcontrols.driver.snmp.client;

import net.norcalcontrols.driver.snmp.common.AbstractScriptModule;
import net.norcalcontrols.driver.snmp.common.FunctionInterface;
import com.inductiveautomation.ignition.client.gateway_interface.ModuleRPCFactory;

public class ClientScriptModule extends AbstractScriptModule {
	private final FunctionInterface rpc;
	
	public ClientScriptModule() {
		rpc = ModuleRPCFactory.create(
			"norcalcontrol.net.driver.snmp-1.0.0",
			FunctionInterface.class
		);
	}
	
    @Override
    protected String[] getImpl(String addr, int port, String[] OIDS, String... params){
        return rpc.get(addr, port, OIDS, params);
    }
    
    @Override
    protected String[] getImplV3(String addr, int port, String[] OIDS, int authLevel, String user, String pass, int authProt, int privProt, String... params) {
    	return rpc.getV3(addr, port, OIDS, authLevel, user, pass, authProt, privProt, params);
    }
}