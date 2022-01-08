package io.github.libedi.account.adapter.out.persistence;

import java.time.LocalDateTime;

import io.github.libedi.account.application.port.out.LoadAccountPort;
import io.github.libedi.account.application.port.out.UpdateAccountStatePort;
import io.github.libedi.account.domain.Account;
import io.github.libedi.account.domain.AccountId;

/**
 * 아웃고잉 영속성 어댑터
 * 
 * @author "Sangjun,Park"
 *
 */
class AccountPersistenceAdapter implements LoadAccountPort, UpdateAccountStatePort {
	
	/*
	 * 영속성 어댑터를 위한 repository
	 */
	private final SpringDataAccountJpaRepository springDataAccountJpaRepository;

	AccountPersistenceAdapter(final SpringDataAccountJpaRepository springDataAccountJpaRepository) {
		this.springDataAccountJpaRepository = springDataAccountJpaRepository;
	}

	@Override
	public Account loadAccount(AccountId accountId, LocalDateTime baselineDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
