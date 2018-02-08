package com.tqdev.crudapi.controller;

import org.springframework.http.ResponseEntity;

import com.tqdev.crudapi.service.ErrorCode;
import com.tqdev.crudapi.service.record.ErrorDocument;

public class BaseController {

	protected ResponseEntity<?> error(ErrorCode error, String argument) {
		return new ResponseEntity<>(new ErrorDocument(error, argument), error.getStatus());
	}
}