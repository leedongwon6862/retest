package com.example.ms1.note.siteuser;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<SiteUser , Long> {
    Optional<SiteUser> findByloginId(String username);
}
