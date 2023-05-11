package org.example;

import java.util.Objects;

public class User {

    private String email;
    private String login;


    private static String symbol = "@";
    private static String symbol1 = ".";

    public User() {
    }

    public User(String email) {
        this.email = email;
    }
    public User(String email, String login) {
        validateParameters(email, login);
        this.email = email;
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        validateEmail(email);
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        validateLogin(login);
        this.login = login;
    }



    public void validateLogin(String login) {
      if (login == null) {
          throw new IllegalArgumentException("Incorrect Login");
      }
    }

    public void validateEmail(String email) {
        if (email == null || !email.contains(symbol) || !email.contains(symbol1))  {
            throw new IllegalArgumentException("Incorrect Email");
        }
    }

    public void validateParameters (String login, String email) {
        validateLogin(login);
        validateEmail(email);
        if (login.equals(email)) {
            throw new IllegalArgumentException("Email cannot be the same as login");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email) && Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, login);
    }
}
