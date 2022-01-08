package io.github.libedi.account.application;

import java.time.LocalDateTime;

import io.github.libedi.account.application.port.in.GetAccountBalanceQuery;
import io.github.libedi.account.application.port.out.LoadAccountPort;
import io.github.libedi.account.domain.AccountId;
import io.github.libedi.account.domain.Money;

/**
 * 계좌 잔고 쿼리 서비스
 * 
 * @author "Sangjun,Park"
 *
 */
public class GetAccountBalanceService implements GetAccountBalanceQuery {
	
	private final LoadAccountPort loadAccountPort;
	
	public GetAccountBalanceService(LoadAccountPort loadAccountPort) {
		this.loadAccountPort = loadAccountPort;
	}

	@Override
	public Money getAccountBalance(AccountId accountId) {
		return loadAccountPort.loadAccount(accountId, LocalDateTime.now())
				.calculateBalance();
	}

}
