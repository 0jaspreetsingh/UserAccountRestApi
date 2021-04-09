package com.account.user.Dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * User Dto
 */
public class UserDto {

    private long id;

    @NotNull
    @Size(min = 3, max = 150)
    private String name;

    @NotNull

    @Size(min = 9, max = 12)
    private String phone;

    @NotNull
    @Size(max = 200)
    private String email;

    @Size(max = 200)
    private String address;


    @NotNull
    @Size(max = 56)
    private String country;

    @NotNull
    @Size(max = 50)
    private String department;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
