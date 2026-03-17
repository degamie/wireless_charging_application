//WIP(17/3/2026)(Sarthak Mittal)#DegamieSign)#1.1
package com.spring_login_web_page.Springmvc_login_system.repository.src.main.java.com.spring_login_web_page.Springmvc_login_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.management.relation.Role;
import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    public List<Role> updateByRoleNaem(String roleName);
    public List<Role> saveByRoleName(String roleName);
    public List<Role> findByRolePassword(String rolepassword);
    public List<Role> findByRoleName(String roleName);
    public String findAllByUserId(String UserId);
    public String saveAllByUserId(String UserId);
    public String saveAllByUserPassword(String UserPassword);
   public String findAllByUserPassword(String UserPassword );
    Optional<Role> findByName(String name);
    public String saveAllByUserName(String UserName);
    Optional<Role> findByAuthority(String authority);
    public String updateAllByAuthority(String authority);
    public String saveAllByauthority(String authority);
     public String saveAllPhoneNumber(String PhoneNumber);
     public void findAllPhoneNumber(String PhoneNumber);//Finding PhoneNumber in Server
}
