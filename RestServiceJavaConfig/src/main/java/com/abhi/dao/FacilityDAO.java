package com.abhi.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class FacilityDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(FacilityDAO.class);

	public String getFacilityConfig(Long facilityId, String configName) {
		logger.debug("Line no 6 in FacilityDAO: calling database to get the data");
		return "true";
	}

}
