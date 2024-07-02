package com.spring.app.hpsearch.model;

import java.util.List;
import java.util.Map;

import com.spring.app.main.domain.HospitalDTO;

public interface HpsearchDAO {

	List<HospitalDTO> getHospitalList(Map<String, String> paraMap);

}
