package com.nguetcheu.Springboottutorial.service;

import com.nguetcheu.Springboottutorial.entity.Department;

import java.util.List;

public interface DepartmentService {

    public List<Department> fetchDepartmentList();

    public Department saveDepartment(Department department);

    public Department fetchDepartmentById(long departmentId);

    public void deleteDepartmentById(long departmentId);

    public Department updateDepartment(long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
