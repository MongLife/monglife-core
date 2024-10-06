# Mong Life Core Module

```
몽라이프 앱에 관련된 공통 코드 및 공통 유틸을 담은 모듈
```

### 개요
- 공통 리소스 코드 
  - ```FoodCode``` : 음식/간식 리소스 코드 enum 클래스
  - ```MapCode``` : 맵 리소스 코드 enum 클래스
  - ```MongCode``` : 몽(캐릭터) 리소스 코드 enum 클래스 
- 공통 에러 코드
  - ```ErrorCode``` : 에러 코드 추상화 인터페이스 
  - ```GlobalErrorCode``` : 전역 에러 코드 값 enum 클래스
- 인가 코드
  - ```RoleCode``` : 회원에 대한 인가 코드 enum 클래스
- 공통 예외
  - ```ErrorException``` : 기본 예외 클래스 (하위 모듈은 본 클래스를 상속 받아 구체적인 예외 클래스로 정의)
- 리플랙션 유틸 클래스
  - ```REflectionUtil``` : AOP에서 활용하는 리플랙션 유틸 클래스
- Passport (인가) 클래스
  - ```PassportVo``` : 여권과 동일하게 인가를 인증 및 인가를 처리하는 클래스
  - ```PassportDataVo``` : 여권에 포함되는 데이터
  -  ```PassportDataAccountVo``` : 여권 데이터에 포함되는 회원 정보 (인증/인가 정보)