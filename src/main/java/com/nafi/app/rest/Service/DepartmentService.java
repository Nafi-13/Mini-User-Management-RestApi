package com.nafi.app.rest.Service;

import com.nafi.app.rest.Entities.Department;
import com.nafi.app.rest.Entities.User;
import com.nafi.app.rest.dao.DepartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;

    public List<Department> getAllDepartments()
    {
        return departmentDao.findAll();
    }

    public Department getSingleDepartment(long id)
    {
        return departmentDao.findById(id).get();
    }

    public Department createNewDepartment(Department department)
    {
        return departmentDao.save(department);
    }

    public void deleteOneDepartment(long id)
    {
        departmentDao.deleteById(id);
        //return "Deleted :(";
    }

    public Department updateDepartment(Department department)
    {
        return departmentDao.save(department);
    }

    public List<User> getUsersByDepartment(long id)
    {
        return departmentDao.getUsersByDepartment(id);
    }
}
