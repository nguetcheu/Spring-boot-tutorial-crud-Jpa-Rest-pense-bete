package com.nguetcheu.Springboottutorial.Controller;

import com.nguetcheu.Springboottutorial.entity.Department;
import com.nguetcheu.Springboottutorial.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    private DepartmentService departmentService;

    DepartmentController(DepartmentService theDepartmentService){
        this.departmentService = theDepartmentService;
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "department successful delete";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") long departmentId,
                                       @RequestBody Department department) {
        return departmentService.updateDepartment(departmentId, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }
}
