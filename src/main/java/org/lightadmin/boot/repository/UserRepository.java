package org.lightadmin.boot.repository;

import org.lightadmin.boot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}