package com.spring.app.testcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.app.main.service.MainService;

public class TestController {

	@Autowired
	private MainService service;
	
	@RequestMapping(value="/test.bibo")
	public ModelAndView commom(ModelAndView mav) {
		
		/* API 입력 영역
		if(true) {
			try {
				
				String localAddr = "";
				
				List<HospitalDTO> hpdtoList = Myutil.hpApiInputer(localAddr);
				
				System.out.println("데이터 입력시작");
				int totalSize = hpdtoList.size();
				for(int i=0;i<hpdtoList.size();i++) {
					
					System.out.print("진행상황 ["+(i+1)+"/"+totalSize+"]");
					if(service.hpApiInputer(hpdtoList.get(i))==1) {
						System.out.println("...성공");
					}else {
						System.out.println("...실패");
					}
					
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(true) {
			try {
				
				String localAddr = "C:\\NCS\\Mediinfora\\Medinfora\\src\\main\\webapp\\resources\\json\\korea.json";
				
				List<KoreaAreaVO> areaList = Myutil.areaInputer(localAddr);
				
				int totalSize = areaList.size();
				
				for(int i=0;i<areaList.size();i++) {
					
					System.out.print("진행상황 ["+(i+1)+"/"+totalSize+"]");
					if(service.areaInputer(areaList.get(i))==1) {
						System.out.println("...성공");
					}else {
						System.out.println("...실패");
					}
					
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		*/
		
		mav.setViewName("redirect:index.bibo");
		
		return mav;
	}
	
}