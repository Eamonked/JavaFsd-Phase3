package com.assignments.MVC.HibernateMvc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assignments.MVC.HibernateMvc.Model.Customer;
import com.assignments.MVC.HibernateMvc.Repository.UserRepository;

@Controller
public class DashboardController {

	@RequestMapping("/home")
	public String dashboard() {
		return "dashboard.html";
//		return "dashboard.jsp";

	}

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home() {
        return "index"; // Return the name of the JSP index page
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") Customer customer) {
        userRepository.save(customer);
        return "confirmation"; // Return the name of the JSP confirmation page
    }

    @GetMapping("/editUser/{id}")
    public String editUser(@PathVariable("id") Long id, Model model) {
        Customer user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id: " + id));

        model.addAttribute("user", user);
        return "edit"; // Return the name of the JSP edit page
    }

    @PostMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id") Long id, @ModelAttribute("user") Customer customer) {
        userRepository.save(customer);
		return "Confirmation";//JSP page for save

}
    
    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        Customer customer = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id: " + id));

        userRepository.delete(customer);
        return "confirmation"; // Return the name of the JSP confirmation page
    }

    @GetMapping("/users")
    public String getUsers(Model model) {
        List<Customer> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "users"; // Return the name of the JSP users page
    }

}
