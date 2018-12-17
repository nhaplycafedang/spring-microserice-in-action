package com.thoughtmechanix.licenses.repository;

import com.thoughtmechanix.licenses.model.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // Tell spring boot that this is a JPA repository
public interface LicenseRepository extends CrudRepository<License,String>  {
	// Query methods will be parse into SELECT ... FROM 
    public List<License> findByOrganizationId(String organizationId);
    public License findByOrganizationIdAndLicenseId(String organizationId,String licenseId);
}
