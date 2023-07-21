package com.nafi.app.rest.controller;
import com.nafi.app.rest.Entities.Department;
import com.nafi.app.rest.Entities.User;
import com.nafi.app.rest.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @GetMapping("/departments")
    public List<Department> getDepartments(){
        return departmentService.getAllDepartments();
    }

    @GetMapping("/departments/{id}")
    public Department getOneDepartment(@PathVariable long id)
    {
        return departmentService.getSingleDepartment(id);
    }

    @GetMapping("/departments/{id}/users")
    public List<User> getUsersByDepartment(@PathVariable long id)
    {
        return departmentService.getUsersByDepartment(id);
    }

    @PutMapping("/departments/{id}")
    public String updateOneUser(@PathVariable long id, @RequestBody Department department)
    {
        department.setDepartmentId(id);
        departmentService.updateDepartment(department);
        return "Department Updated";
    }

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department)
    {
        return departmentService.createNewDepartment(department);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartment(@PathVariable long id)
    {
        departmentService.deleteOneDepartment(id);
        return "Deleted :(";
    }
}
