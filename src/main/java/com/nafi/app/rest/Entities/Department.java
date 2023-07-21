package com.nafi.app.rest.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long departmentId;
    private String name;
    private String prequisite;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "deptId", referencedColumnName = "departmentId")
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrequisite() {
        return prequisite;
    }

    public void setPrequisite(String prequisite) {
        this.prequisite = prequisite;
    }
}
