package passwordcheck;

public class PassCheck extends Exception {
    String Password;
    String username;
    boolean pas;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public PassCheck(String username) {

        setUsername(username);
    }

    public PassCheck(String password, String username) {
        setPassword(password);
        setUsername(username);
        this.pas = false;
    }

    public String username() {
        if (getUsername().length() < 3) {
            return "Username should consist of at least 3 characters.";
        } else {
            return null;
        }
    }

    public String contain_username() {
        Boolean contain_us = getPassword().contains(getUsername());
        if (contain_us) {
            return "Password should not contain the username.";
        } else {
            return null;
        }
    }

    public String password_lehght() {
        if (getPassword().length() < 8) {
            return "Password should consist of at least 8 characters.";
        } else {
            return null;
        }
    }

    public String check_capital_letter() {


        boolean capital = false;
        for (int i = 0; i < getPassword().length(); i++) {
            char c = getPassword().charAt(i);
            if (c >= 65 && c <= 90) {
                capital = true;
            }
        }
        if (capital)
            return null;
        else
            return "Password should consist of at least 1 capital letter.";
    }

    public String check_small_letter() {
        boolean small = false;
        for (int i = 0; i < getPassword().length(); i++) {
            char c = getPassword().charAt(i);
            if (c >= 97 && c <= 122) {

                small = true;
            }
        }
        if (small)
            return null;
        else
            return "Password should consist of small letter.";
    }

    public String check_digits() {
        int count = 0;
        for (int i = 0; i < getPassword().length(); i++) {
            int chr = getPassword().charAt(i);
            if (chr >= 48 && chr <= 57) {
                count++;
            }
        }
        if (count < 2) {
            return "Password should consist of at least 2 digits.";
        }
        return null;
    }

    public String check_special_character() {

        boolean small = false;
        for (int i = 0; i < getPassword().length(); i++) {
            char c = getPassword().charAt(i);
            if (c >= 33 && c <= 47) {
                small = true;
            } else if (c >= 58 && c <= 64) {
                small = true;
            } else if (c >= 91 && c <= 96) {
                small = true;
            } else if (c >= 123 && c <= 126) {
                small = true;
            }
        }
        if (small)
            return null;
        else
            return "Password should consist of at least 1 special character.";
    }

    @Override
    public String toString() {
        String str = null;
//        if (username() != null) {
//            return username();
//        } else
        if (contain_username() != null) {
            str = contain_username();
        } else if (password_lehght() != null) {
            str = password_lehght();
        } else if (check_capital_letter() != null) {
            str = check_capital_letter();
        } else if (check_small_letter() != null) {
            str = check_small_letter();
        } else if (check_digits() != null) {
            str = check_digits();
        } else if (check_special_character() != null) {
            str = check_special_character();
        }
        if (str != null) {
            return "Invalid Password!!! \n" + str;
        } else {
            this.pas = true;
            return null;
        }
    }
}
