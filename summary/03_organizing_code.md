# 03. 코드 구성하기

- 코드 구성을 통해 아키텍처가 드러나는 방법을 설명한다.
- 패키지 구성을 통해 육각형 아키텍처를 보여준다.
- 크게 도메인 패키지 아래에 ***application***, ***domain***, ***adapter***로 구성된다.
  - `buckpal.account.application`
  - `buckpal.account.domain`
  - `buckpal.account.adapter`
- ***application***에는 서비스와 인커밍/아웃고잉 포트가 위치해 있다.
  - `buckpal.account.application.SendMoneyService`
  - `buckpal.account.application.port.in`
  - `buckpal.account.application.port.out`
- ***domain***에는 도메인 엔티티가 위치해 있다.
- ***adapter***에는 인커밍 어댑터와 아웃고잉 어댑터가 위치해 있다.
  - `buckpal.account.adapter.in.web`
  - `buckpal.account.adapter.out.persistence`
- 이러한 구성으로 인해 ***adapter***는 package-private 수준으로 둬도 된다.
- 이는 ***application***에서 ***adapter***를 접근하지 못하게 하는 장점이 있다.
- 자세한 코드 구성은 샘플 코드를 참조.
  - [3장 코드 구성하기 샘플코드](https://github.com/libedi/clean-architecture/tree/main/clean-architecture-ch3/src/main/java/io/github/libedi/account)