package com.arrivnow.usermanagement.usermanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.arrivnow.usermanagement.usermanagement.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>,JpaSpecificationExecutor<User>  {

	@EntityGraph(attributePaths = "authorities")
	Optional<User> findOneByLogin(String login);

	@EntityGraph(attributePaths = "authorities")
	List<User> findByEmailIgnoreCase(String email);
	
	@EntityGraph(attributePaths = "authorities")
	Optional<User> findOneByEmailIgnoreCase(String email);

	User findOneByActivationKey(String key);

	Optional<User> findOneByResetKey(String key);

	@EntityGraph(attributePaths = "authorities")
    Optional<User> findOneWithAuthoritiesByLogin(String login);

    @EntityGraph(attributePaths = "authorities")
    Optional<User> findOneWithAuthoritiesByEmailIgnoreCase(String email);
    
    @EntityGraph(attributePaths = "authorities")
    Optional<User> findOneWithAuthoritiesByMobile(Long mobile);

    @EntityGraph(attributePaths = "authorities")
	List<User> findByEmailOrMobile(String email, Long mobile);

}