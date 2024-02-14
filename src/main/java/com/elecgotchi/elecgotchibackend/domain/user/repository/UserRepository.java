package com.elecgotchi.elecgotchibackend.domain.user.repository;

import com.elecgotchi.elecgotchibackend.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
