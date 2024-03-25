package net.norcalcontrols.driver.snmp.common;

public interface FunctionInterface {
    public String[] get(String addr, int port, String[] OIDS, String... params);
    public String[] getV3(String addr, int port, String[] OIDS, int authLevel, String user, String pass, String... params );
}
