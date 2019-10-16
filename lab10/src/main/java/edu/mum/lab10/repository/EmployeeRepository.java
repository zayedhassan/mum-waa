package edu.mum.lab10.repository;

import edu.mum.lab10.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    abstract public Employee findAllById(Long id);
    //abstract public Employee queryByNumber(String number);
    abstract public List<Employee> findAll();

    @Query(value = "SELECT * from Employee e where e.number=?1", nativeQuery = true)
    abstract public List<Employee> locateOneEmployeeByHisNumber(String number);
}
