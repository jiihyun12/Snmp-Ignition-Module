package net.norcalcontrols.driver.snmp.common;

public interface FunctionInterface {
    public String[] get(String addr, int port, String[] OIDS, String... params);
    public String[] getV3(String addr, int port, String[] OIDS, int authLevel, String user, String pass, int authProt, int privProt, String... params );
    public String[] walk(String ip, int port, String startOID, String[] params);
    public String[] walkV3(String ip, int port, String startOID, int authLevel, String user, String pass, int authProt, int privProt, String[] params);
}
