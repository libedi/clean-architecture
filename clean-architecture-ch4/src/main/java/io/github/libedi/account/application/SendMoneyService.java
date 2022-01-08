package io.github.libedi.account.application;

import org.springframework.transaction.annotation.Transactional;

import io.github.libedi.account.application.port.in.SendMoneyCommand;
import io.github.libedi.account.application.port.in.SendMoneyUseCase;
import io.github.libedi.account.application.port.out.AccountLock;
import io.github.libedi.account.application.port.out.LoadAccountPort;
import io.github.libedi.account.application.port.out.UpdateAccountStatePort;

/**
 * 송금하기 유스케이스
 * 
 * @author "Sangjun,Park"
 *
 */
@Transactional
public class SendMoneyService implements SendMoneyUseCase {

	private final LoadAccountPort loadAccountPort;
	private final AccountLock accountLock;
	private final UpdateAccountStatePort updateAccountStatePort;

	public SendMoneyService(final LoadAccountPort loadAccountPort, final AccountLock accountLock,
			final UpdateAccountStatePort updateAccountStatePort) {
		this.loadAccountPort = loadAccountPort;
		this.accountLock = accountLock;
		this.updateAccountStatePort = updateAccountStatePort;
	}

	@Override
	public boolean sendMoney(SendMoneyCommand command) {
		// TODO: 비즈니스 규칙 검증
		// TODO: 모델 상태 조작
		// TODO: 출력값 반환
		return false;
	}
	
	

}
