package io.github.libedi.account.application.port.in;

/**
 * 송금하기 유스케이스
 * 
 * @author "Sangjun,Park"
 *
 */
public interface SendMoneyUseCase {

	boolean sendMoney(SendMoneyCommand command);

}
