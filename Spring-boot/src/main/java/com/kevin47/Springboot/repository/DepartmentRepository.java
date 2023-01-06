package com.kevin47.Springboot.repository;

import com.kevin47.Springboot.entity.Department;
import org.aspectj.lang.reflect.DeclareAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
public Department findByDepartmentName(String departmentName);
public Department findByDepartmentNameIgnoreCase(String departmentName);
}
