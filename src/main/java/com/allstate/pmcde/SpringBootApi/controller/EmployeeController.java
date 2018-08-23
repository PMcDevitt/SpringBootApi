package com.allstate.pmcde.SpringBootApi.controller;

import com.allstate.pmcde.SpringBootApi.model.Employee;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    List<Employee> employeesList = new ArrayList<Employee>();

    @RequestMapping(value = "/v1/Employees", method = RequestMethod.GET)
    public List<Employee> getEmployees(){
        employeesList.add(new Employee(1, "Paddy", "McDevitt", "mcd@mail.com"));
        employeesList.add(new Employee(2, "Pat", "McDevitt", "pmcd@mail.com"));
        return employeesList;
    }
    @RequestMapping(value = "/v1/Employees/{id}", method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable Integer id){
        return employeesList.get(id - 1);
    }
}
