package phamquocduy.Lab3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import phamquocduy.Lab3.entity.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role,Long> {
    @Query("select  r.id from Role r where r.name = ?1")
    Long getRoleIdByName(String roleName);
}
