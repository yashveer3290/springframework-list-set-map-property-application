package com.sunglowsys.domain;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {
    private Long id;
    private String name;
    private List<String> mobile;
    private Set<String> email;
    private Map<String,String> subject;
    private Properties adminEmails;

    public Customer() {}

    public Customer(Long id, String name, List<String> mobile, Set<String> email, Map<String, String> subject, Properties adminEmails) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.subject = subject;
        this.adminEmails = adminEmails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMobile() {
        return mobile;
    }

    public void setMobile(List<String> mobile) {
        this.mobile = mobile;
    }

    public Set<String> getEmail() {
        return email;
    }

    public void setEmail(Set<String> email) {
        this.email = email;
    }

    public Map<String, String> getSubject() {
        return subject;
    }

    public void setSubject(Map<String, String> subject) {
        this.subject = subject;
    }

    public Properties getAdminEmails() {
        return adminEmails;
    }

    public void setAdminEmails(Properties adminEmails) {
        this.adminEmails = adminEmails;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile=" + mobile +
                ", email=" + email +
                ", subject=" + subject +
                ", adminEmails=" + adminEmails +
                '}';
    }
}
