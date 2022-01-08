package io.github.libedi.account.application.port.out;

import java.time.LocalDateTime;

import io.github.libedi.account.domain.Account;
import io.github.libedi.account.domain.AccountId;

/**
 * 아웃고잉 포트
 * 
 * @author "Sangjun,Park"
 *
 */
public interface LoadAccountPort {

	Account loadAccount(AccountId accountId, LocalDateTime baselineDate);

}
