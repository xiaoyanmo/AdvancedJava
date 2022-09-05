package org.example;

@MyClass(name = "Account", author = "PMK Lab", dateCreation = "2018-03-18", description = "Description of Account class")
public class Account {

    private String username;
    private String role;

    @MyField(name = "username", author = "PMK Lab", dateCreation = "2018-03-18")
    public String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @MyMethod(name = "getUsername", author = "PMK Lab", dateCreation = "2018-03-18", parameters = {})
    @MinLength(3)
    public String getUsername() {
        return username;
    }

    @MyRoles(RoleType.Role1)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @MyMethod(name = "display", author = "PMK Lab", dateCreation = "2018-03-18", parameters = {"fullName"})
    public String display(String fullName) {
        return "Hello " + fullName;
    }

}