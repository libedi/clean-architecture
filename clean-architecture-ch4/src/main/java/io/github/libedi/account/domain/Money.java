package io.github.libedi.account.domain;

import java.math.BigInteger;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Money {
	
	public static final Money ZERO = Money.of(0L);
	
	private final BigInteger amount;
	
	public static Money of(long amount) {
		return new Money(BigInteger.valueOf(amount));
	}

	public static Money add(Money a, Money b) {
		return new Money(a.amount.add(b.amount));
	}

	public Money negate() {
		return new Money(amount.negate());
	}

	public boolean isPositive() {
		return this.amount.compareTo(BigInteger.ZERO) > 0;
	}
	
	public boolean isGreaterThan(Money money) {
		return this.amount.compareTo(money.amount) > 0;
	}

}
