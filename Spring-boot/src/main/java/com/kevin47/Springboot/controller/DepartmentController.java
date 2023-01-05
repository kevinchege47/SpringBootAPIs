package com.kevin47.Springboot.controller;

import com.kevin47.Springboot.entity.Department;
import com.kevin47.Springboot.service.DepartmentService;
import com.kevin47.Springboot.service.DepartmentSeviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);



    }
}
