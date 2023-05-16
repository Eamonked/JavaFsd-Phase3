package com.assignments.MVC.HibernateMvc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignments.MVC.HibernateMvc.Model.Customer;

public interface UserRepository extends JpaRepository<Customer, Long> {
    // Additional custom methods if needed
}