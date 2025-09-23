package org.codingwallah.em_project.controller;

import org.codingwallah.em_project.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpController {

    private List<Employee> employees = new ArrayList<>();

    // GET - fetch all employees
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employees;
    }

    // POST - add single employee
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        employees.add(employee);
        return employee;
    }

    // POST - add multiple employees at once
    @PostMapping("/employees/bulk")
    public List<Employee> addEmployees(@RequestBody List<Employee> newEmployees) {
        employees.addAll(newEmployees);
        return newEmployees;
    }

    // PUT - update employee by ID
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                e.setName(updatedEmployee.getName());
                e.setRole(updatedEmployee.getRole());
                e.setLinkedIn(updatedEmployee.getLinkedIn());
                e.setResume(updatedEmployee.getResume());
                return e;
            }
        }
        return null;
    }

    // DELETE - remove employee by ID
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                employees.remove(e);
                return "Employee deleted!";
            }
        }
        return "Employee not found!";
    }
}
