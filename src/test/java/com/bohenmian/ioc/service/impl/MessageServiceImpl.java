package com.bohenmian.ioc.service.impl;

import com.bohenmian.ioc.service.MessageService;

public class MessageServiceImpl implements MessageService {

	@Override
	public String getMessage() {
		return "Hello World";
	}

}
