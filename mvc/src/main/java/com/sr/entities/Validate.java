package com.sr.entities;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
@Component
public class Validate implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(AssistantS.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		AssistantS asst=(AssistantS) target;
		if(asst.getName().equals(null)||asst.getName().isBlank()) {
			
			errors.rejectValue("name", "name.required");
		}
if(asst.getName().length()>15) {
			
			errors.rejectValue("name", "name.must");
		}


	}

}
