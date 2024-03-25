package net.norcalcontrols.driver.snmp.gateway;

import net.norcalcontrols.driver.snmp.common.AbstractScriptModule;
import net.norcalcontrols.driver.snmp.common.NorcalSNMPDriverModule;

public class GatewayScriptModule extends AbstractScriptModule {

    @Override
    protected String[] getImpl(String addr, int port, String[] OIDS, String... params) {
        return NorcalSNMPDriverModule.snmpGet(addr, port, OIDS, params);
    }
    
    @Override
    protected String[] getImplV3(String addr, int port, String[] OIDS, int authLevel, String user, String pass, String... params) {
    	return NorcalSNMPDriverModule.snmpGetV3(addr, port, OIDS, authLevel, user, pass, params);
    }

}