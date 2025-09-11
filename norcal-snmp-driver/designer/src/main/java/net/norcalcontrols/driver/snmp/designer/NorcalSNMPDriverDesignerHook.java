package net.norcalcontrols.driver.snmp.designer;

import net.norcalcontrols.driver.snmp.client.ClientScriptModule;
import com.inductiveautomation.ignition.common.script.ScriptManager;
import com.inductiveautomation.ignition.common.script.hints.PropertiesFileDocProvider;
import com.inductiveautomation.ignition.designer.model.AbstractDesignerModuleHook;

/**
 * This is the Designer-scope module hook.  The minimal implementation contains a startup method.
 */
public class NorcalSNMPDriverDesignerHook extends AbstractDesignerModuleHook {

    @Override
    public void initializeScriptManager(ScriptManager manager) {
        super.initializeScriptManager(manager);

        manager.addScriptModule("system.snmp",
                new ClientScriptModule(),
                new PropertiesFileDocProvider());
    }
}

