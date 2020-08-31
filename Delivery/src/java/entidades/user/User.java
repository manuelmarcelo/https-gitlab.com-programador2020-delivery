package entidades.user;

public abstract class User {
    private String user;
    private String pass;
    private String name;
    


    public User(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }
    
    
    
    //Polimorfismo: login con distintos servicios
    void register() {
        System.out.println("Registro general");
    }        
    
    void login(){
        System.out.println("Login general");
    }
    
    void logout(){
        System.out.println("Logout general");
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
