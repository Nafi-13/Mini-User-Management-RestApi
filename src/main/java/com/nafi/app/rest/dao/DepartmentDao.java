package com.nafi.app.rest.dao;

import com.nafi.app.rest.Entities.Department;
import com.nafi.app.rest.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Long> {

    @Query("select users from Department d where d.departmentId =?1")
    List<User> getUsersByDepartment(long id);
}
