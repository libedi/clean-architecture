package io.github.libedi.account.application.port.in;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import io.github.libedi.account.domain.AccountId;
import io.github.libedi.account.domain.Money;
import io.github.libedi.common.SelfValidating;

/**
 * 유스케이스 입력 커맨드
 * 
 * @author "Sangjun,Park"
 *
 */
public class SendMoneyCommand extends SelfValidating<SendMoneyCommand> {
	
	@NotNull
	private final AccountId sourceAccountId;
	@NotNull
	private final AccountId targetAccountId;
	@NotNull
	private final Money money;
	
	public SendMoneyCommand(AccountId sourceAccountId, AccountId targetAccountId, Money money) {
		/* 1. 생성자 내에서 입력 유효성 검증을 하는 방법 */
		this.sourceAccountId = Objects.requireNonNull(sourceAccountId);
		this.targetAccountId = Objects.requireNonNull(targetAccountId);
		this.money = Objects.requireNonNull(money);
		
		/* 2. Bean Validation API를 통해 검증하는 방법 */
		this.validationSelf();
		
		/* Custom한 유효성 검증 방법: 1,2번 해당되지 않는 경우 직접 구현 */
		requireGreaterThan(money, 0);
		
	}

	private void requireGreaterThan(Money money, int limit) {
		if (money.isGreaterThan(Money.of(limit)) == false) {
			throw new IllegalArgumentException("Money must be greater than " + limit);
		}
	}

}
