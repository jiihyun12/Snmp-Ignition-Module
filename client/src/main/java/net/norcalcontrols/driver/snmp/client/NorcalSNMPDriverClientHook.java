package net.norcalcontrols.driver.snmp.client;

import com.inductiveautomation.ignition.common.script.ScriptManager;
import com.inductiveautomation.ignition.common.script.hints.PropertiesFileDocProvider;
import com.inductiveautomation.vision.api.client.AbstractClientModuleHook;

public class NorcalSNMPDriverClientHook extends AbstractClientModuleHook {
    // override methods as required
	@Override
	public void initializeScriptManager(ScriptManager manager) {
		super.initializeScriptManager(manager);
		
		manager.addScriptModule(
				"system.snmp",
				new ClientScriptModule(),
				new PropertiesFileDocProvider()
		);
	}
}
