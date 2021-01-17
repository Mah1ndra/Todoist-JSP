package webapp.login;

class LoginService {
    public boolean isValidUser(String username, String password){
        if(username.equals("admin") && password.equals("admin"))
            return true;
        return false;
    }
}
