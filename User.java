public class User {

    private String fullname;
    private String username;
    private String pass;
    private Rol rol;


public User(String userName, String password, String fullName){
        this.fullname = fullName;
        this.username = userName;
        this.pass = password;
        this.rol = Rol.SINROL;
}    


public String getFullname() {
    return fullname;
  }
  

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }
  

  public String getUsername() {
    return username;
  }
  
  
  public void setUsername(String username) {
    this.username = username;
  }

  
public String getPass() {
    return pass;
  }
  
  
  public void setPass(String pass) {
    this.pass = pass;
  }

  public Rol getRol() {
    return rol;
  }
  
  
  public void setRol(Rol rol) {
    if(rol != Rol.ADMIN){
        this.rol = rol;
    }
  }


}