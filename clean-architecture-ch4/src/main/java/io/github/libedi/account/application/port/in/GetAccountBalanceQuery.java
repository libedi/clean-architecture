package io.github.libedi.account.application.port.in;

import io.github.libedi.account.domain.AccountId;
import io.github.libedi.account.domain.Money;

/**
 * 계좌 잔고 쿼리
 * 
 * @author "Sangjun,Park"
 *
 */
public interface GetAccountBalanceQuery {

	Money getAccountBalance(AccountId accountId);
}
