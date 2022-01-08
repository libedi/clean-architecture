package io.github.libedi.account.adapter.in.web;

import io.github.libedi.account.application.port.in.SendMoneyUseCase;

/**
 * 인커밍 웹 어댑터
 * 
 * @author "Sangjun,Park"
 *
 */
class AccountController {
	
	/*
	 * 인커밍 포트
	 */
	private final SendMoneyUseCase sendMoneyUseCase;

	AccountController(final SendMoneyUseCase sendMoneyUseCase) {
		this.sendMoneyUseCase = sendMoneyUseCase;
	}

}
