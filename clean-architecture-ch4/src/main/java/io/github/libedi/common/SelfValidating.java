package io.github.libedi.common;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public abstract class SelfValidating<T> {
	
	private Validator validator;

	public SelfValidating() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}
	
	protected void validationSelf() {
		@SuppressWarnings("unchecked")
		Set<ConstraintViolation<T>> violations = validator.validate((T) this);
		if (!violations.isEmpty()) {
			throw new ConstraintViolationException(violations);
		}
	}

}
