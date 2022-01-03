package io.github.libedi.account.application;

import io.github.libedi.account.application.port.in.SendMoneyUseCase;
import io.github.libedi.account.application.port.out.LoadAccountPort;
import io.github.libedi.account.application.port.out.UpdateAccountStatePort;

/**
 * 송금하기 유스케이스
 * 
 * @author "Sangjun,Park"
 *
 */
public class SendMoneyService implements SendMoneyUseCase {
	
	private final LoadAccountPort loadAccountPort;
	private final UpdateAccountStatePort updateAccountStatePort;
	
	public SendMoneyService(final LoadAccountPort loadAccountPort, final UpdateAccountStatePort updateAccountStatePort) {
		this.loadAccountPort = loadAccountPort;
		this.updateAccountStatePort = updateAccountStatePort;
	}
	
}
