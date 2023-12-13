/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.cms.service;

import java.util.Map;
import org.springframework.http.ResponseEntity;

/**
 * 
 * @author via
 * 
 * @date 12 Dec 2023
 *
 */
public interface UserService {


    ResponseEntity<String> signUp(Map<String, String> requestMap);

}
