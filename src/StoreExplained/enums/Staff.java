package StoreExplained.enums;

public class Staff {
    private String name;
    private DESIGNATION role;
    private int strike;

    public Staff() {
    }

    public Staff(String name, DESIGNATION role, int strike) {
        this.name = name;
        this.role = role;
        this.strike = strike;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DESIGNATION getRole() {
        return role;
    }

    public void setRole(DESIGNATION role) {
        this.role = role;
    }

    public int getStrike() {
        return strike;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", role=" + role +
                ", strike=" + strike +
                '}';
    }
}
