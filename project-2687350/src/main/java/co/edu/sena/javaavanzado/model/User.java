package co.edu.sena.javaavanzado.model;

public class User {
    private Integer user_id;
    private String user_firstname;
    private String user_lastname;
    private String user_email;
    private String user_pssword;

    public User() {
    }

    public User(String user_firstname, String user_lastname, String user_email, String user_pssword) {
        this.user_firstname = user_firstname;
        this.user_lastname = user_lastname;
        this.user_email = user_email;
        this.user_pssword = user_pssword;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_firstname='" + user_firstname + '\'' +
                ", user_lastname='" + user_lastname + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_pssword='" + user_pssword + '\'' +
                '}';
    }
}
