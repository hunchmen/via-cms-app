/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.via.cms.model.User;

/**
 * 
 * @author via
 * 
 * @date 12 Dec 2023
 *
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmailId(@Param("email") String email);
}
