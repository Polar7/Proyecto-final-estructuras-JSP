package sos.sisho.myFirstServlet.user.domain;

public class User {

    private final String user;
    private final String password;

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public boolean isUserValid() {
        if(this.user != null && this.password != null) {
            return this.user.equals("duoJ") && this.password.equals("sistemas");
        }
        return false;
    }
}
