package com.kevin47.Springboot.service;

import com.kevin47.Springboot.entity.Department;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);
    public List<Department> fetchDepartmentList();
    public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);
}
