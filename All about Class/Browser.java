public class Browser {

    String  name;
    String  version;
    boolean isPrivatemode;

    public Browser(String name, String version, boolean isPrivatemode){
        this.name=name;
        this.version=version;
        this.isPrivatemode=isPrivatemode;
    }

    public void openBrowser(){
        System.out.println("Browser: "+name);
        System.out.println("Version: "+version);
        System.out.println("Private Mode: "+ (isPrivatemode ? "Enabled":"Disabled"));
    }
    
}
