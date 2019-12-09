package Homework_5.Employee;

import java.util.Objects;

//Ok
public class Company {
    private String name;
    private String registrationNumber;

    public Company(String name, String registrationNumber) {
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) &&
                Objects.equals(registrationNumber, company.registrationNumber);
    }

    @Override
    public String toString() {
        return "Uzņēmuma nosaukums: " + name +
                ", reģistrācijas numurs: " + registrationNumber + ".";
    }
}
