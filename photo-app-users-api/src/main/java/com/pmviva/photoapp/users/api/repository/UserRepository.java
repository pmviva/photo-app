package com.pmviva.photoapp.users.api.repository;

import com.pmviva.photoapp.users.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Long, User> {
}
