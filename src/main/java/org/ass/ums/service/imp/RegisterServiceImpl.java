package org.ass.ums.service.imp;
import java.util.List;

import org.ass.ums.entity.RegisterEntity;
import org.ass.ums.repository.RegisterRepository;
import org.ass.ums.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	private RegisterRepository repository;
	@Override
	public void processUserInfo(RegisterEntity registerEntity) {
	repository.saveUser(registerEntity);
		
	}
	@Override
	public List<RegisterEntity> getAllUser() {
		return repository.findAllUsers();
		
		
				
	}
	
	
}
