# 🚀 Monglife Core

MongLife 조직의 모든 모듈에서 공통적으로 의존하는 ```Core Library``` 프로젝트입니다. 본 라이브러리는 응답 구조, 예외 처리 클래스, 인가 객체 등을 공통화하여 마이크로서비스 간 일관성을 유지하는 데 활용됩니다. 본 라이브러리를 통해 MongLife 조직의 모든 모듈이 일관된 구조로 개발될 수 있도록 지원합니다.

## 🏗 Project Overview

### - 공통 DTO
  - ```SendNotificationDto```
    - 의존하는 서비스에서 ```Firebase Notification```을 통해 모바일 기기로 알림을 보내는 경우 ```Kafka```를 통해 요청할 때 ```Payload```로 사용됩니다.
  - ```ResponseDto```
    - 서비스에서 사용자 클라이언트로 응답을 전송하는 경우 사용되는 응답 Wrapper 클래스 입니다.
    - 모든 응답에 대해서 본 Dto를 사용하고, 제네릭을 통해 ````T result````에 데이터를 넣어 전달합니다.

### - 공통 정보 추상화 클래스
  - ```Response```
    - API 응답 정보 또는 에외 발생 정보를 추상화한 인터페이스 입니다. 
    - 의존하는 서비스에서는 ```Response```를 구현하여 사용합니다.
  - ```GlobalResponse```
    - 의존하는 서비스에서 전역으로 사용되는 API 응답 정보 또는 예외 발생 정보 Enum 클래스 입니다.
    - 전역으로 사용되는 ```HTTP Parameter/RequestBody``` ```Validation```에러와 같은 공통 정보가 포함되어 있습니다.

### - 인가 정보
  - ```RoleCode```
    - 계정에 대한 인가 정보를 담은 Enum 클래스 입니다.
    - 일반 회원과 관리자로 구분되어 있습니다.

### - 앱 분류 코드
  - ```AppCode```앱 분류 코드 enum 클래스

### - 공통 예외
  - ```ErrorException```
    - 의존하는 서비스에서 사용자 정의 예외 클래스를 정의할 때 상속 받아 사용합니다.
    - ```Response```으로 예외에 대한 정보를 확인할 수 있도록 되어 있습니다.
    - ```Map<String, Object> result```를 통해 예외에 대한 추가적인 정보를 포함할 수 있습니다. 

### - 공통 유틸 클래스
  - ```CommonUtil```
    - 의존하는 서비스에서 전역으로 사용되는 정적 메서드를 포함하는 유틸 클래스 입니다.
  - ```ReflectionUtil```
    - AOP에서 리플랙션을 사용하기 위한 정적 메서드를 담은 유틸 클래스 입니다.

### - 분산 트랜잭션 처리 이벤트
  - ```TransactionEvent```
    - ```kafka```를 활용해 마이크로 서비스 간 분산 트랜잭션 처리를 위한 이벤트 클래스 입니다.
    - 본 클래스를 통해 마이크로 서비스 간 트랜잭션 정보를 주고 받으며 데이터의 정합성을 유지합니다.

### - 인가(Passport) 정보 클래스
  - ```PassportVo```
    - ```Spring Security```의 ```UserDetails```를 생성하기 위한 정보를 담는 클래스 입니다.
  - ```PassportDataVo```
    - ````Passport````에 포함되는 데이터의 Wrapper 클래스 입니다.
  -  ```PassportDataAccountVo```
    - ````Passport````에 포함되는 계정 데이터 입니다.
-  ```PassportDataAppVersionVo```
   - ````Passport````에 포함되는 앱 버전 데이터 입니다.
