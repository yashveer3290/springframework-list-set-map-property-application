package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("customer.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer.getId());
        System.out.println(customer.getName());
        System.out.println(customer.getMobile());
        System.out.println(customer.getEmail());
        System.out.println(customer.getSubject());
        System.out.println(customer.getAdminEmails());
        System.out.println(customer);

    }
}
