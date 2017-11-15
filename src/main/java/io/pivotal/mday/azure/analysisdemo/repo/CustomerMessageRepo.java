/**
 * Customer storage repo interface, one of the most magical Spring Boot things
 * 
 * @author Matt Day
 */
package io.pivotal.mday.azure.analysisdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import io.pivotal.mday.azure.analysisdemo.model.customer.CustomerMessage;

public interface CustomerMessageRepo extends JpaRepository<CustomerMessage, Long> {

}
