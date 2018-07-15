package com.abhi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.abhi.dao.FacilityDAO;

@Service("facilityService")
public class FacilityServiceImpl implements FacilityService {
	
	@Autowired
	FacilityDAO facilityDao;
	
	private static final Logger logger = LoggerFactory.getLogger(FacilityServiceImpl.class);

	@Override
	@Cacheable(value = "FACILITY_CONFIG_CACHE")
	public String getFacilityConfig(Long facilityId, String configName) {
		logger.debug("Line no 20 in FacilityServiceImpl: calling DAO to get the data");
		return facilityDao.getFacilityConfig(facilityId, configName);
	}

}
