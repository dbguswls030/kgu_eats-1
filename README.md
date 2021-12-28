# kgu_eats

### 기능 요구사항 목록

[로그인 기능]
- 사용자는 로그인을 해야만 본 어플을 사용할 수 있다.
- 사용자는 학교 학생이어야만 한다. (추후 학교 측과 논의 예정)
  
[캠퍼스 선택 기능]
- 캠퍼스는 수원캠퍼스/서울캠퍼스가 존재한다.
- 캠퍼스는 수원캠퍼스로 임시 고정한다. (추후 확장 예정)

[매장 선택 기능]
- 매장은 감성코어/경기드림타워/교직원식당 등이 있다.
- 매장은 감성코어/경기드림타워로 임시 고정한다. (추후 확장 예정)

[식권 발급 기능]
- 사용자는 매장에 따라 별도의 식권을 결제하여 사용해야 한다.
  - 식권은 한번에 하나씩 결제할 수 있다.
  - 식권은 결제일이 지나더라도 사용할 수 있다.

- 사용자는 식권 결제 후, QR 코드를 발급받아 매장에서 사용할 수 있다.
  - QR 코드 발급 이전, 사용할 식권의 개수를 선택해야 한다.
  - 식권 사용 이후, 사용한 식권의 개수만큼 보유하고 있는 식권의 개수가 차감된다.

- 식권 발급 기능은 식당에 따라 방식이 구분된다.
  - 감성코어는 메뉴별로 식권이 별도 적용된다.
    - 해당 메뉴의 식권은 오직 해당 메뉴에서만 사용 가능하다.
  - 경기드림타워는 끼니별로 식권이 별도 적용된다.

---
### 모바일 UI 데모
- ios : https://pr.to/AJR6K5/
- Android :  https://pr.to/SB0C2J/

---
### DB 구조 설계
- https://dbdiagram.io/d/610be5a72ecb310fc3bf126f

---

### 확장 고려 중인 기능 목록
[리뷰 기능]
- 사용자는 다른 사람이 남긴 리뷰를 확인할 수 있다.
- 리뷰는 매장 리뷰와 메뉴 리뷰로 나눠진다.
- 리뷰는 사진(선택사항), 내용, 별점으로 이뤄져 있다.
- 사용자는 식권 사용 후, 해당 매장 혹은 메뉴에 리뷰를 작성할 수 있다.
  [캘린더 기능]
- 사용자는 특정 식당의 주간 메뉴판을 확인할 수 있다.
  [비회원 기능]
- 학생 또는 교직원이 아니더라도 식권 발급을 이용할 수 있다.
- 비회원 사용자는 타인의 리뷰를 볼 수 있으나, 리뷰를 작성할 수 없다.
  [메뉴 선택 결제 기능] -> (매장 업체와의 연계 필요)
- 사용자는 식권이 발급되지 않는 매장(E-스퀘어)의 경우, 아래의 절차대로 매장을 이용할 수 있다.
- 사용자는 원하는 음식과 수량을 선택하여 결제를 진행할 수 있다.
- 결제 이뤄지면 번호표를 발급받는다.
- 매장에서 음식 준비가 완료되면, 사용자에게 [푸쉬 알림]으로 주문 완료 메시지가 전송된다.
