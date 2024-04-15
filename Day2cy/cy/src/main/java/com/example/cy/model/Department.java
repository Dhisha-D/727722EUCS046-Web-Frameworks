package com.example.cy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Department {
    @JsonProperty("department_name")
    private String deptname;
    @JsonProperty("Branch_name")
    private String branch;
    public String getDeptname() {
        return deptname;
    }
    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
}

