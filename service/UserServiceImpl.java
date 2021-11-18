package com.example.userservice.service;

import com.example.userservice.domain.Role;
import com.example.userservice.domain.User;
import com.example.userservice.repo.RoleRepo;
import com.example.userservice.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImpl implements UserService{
    private final UserRepo userRepo;
    private final RoleRepo roleRepo;
    @Override
    public User saveUser(User user) {
        log.info("Database e yeni kullanici{} kaydediliyor...", user.getName());
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Database e yeni rol {} kaydediliyor...", role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Eklenen rol {} su kullaniciya {}",roleName, username);
        User user = userRepo.findByUsername(username);
        Role role = roleRepo.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        log.info("DB den Cekilen kullanici {}",username);
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        log.info("DB den Cekilen butun kullanicilar");
        return userRepo.findAll();
    }
}
