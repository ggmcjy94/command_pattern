# command_pattern
커맨드패턴

**1.개요**
 
 - 커맨드 패턴은 해당 요청에 따라야하는 기능들을 캡슐화한 객체에 정리하여 실행 할 수 있게 해주는 디자인패턴이다.
 - 요청에 따르는 기능들이 다양하고 변경 및 추가 삭제가 많은 경우 요청이 발생되는 클래스를 변경하지 않고 수정할 때 매우 유용하다.

**2.사용이유**

 - 이벤트가 발생했을떄 실행될 기능이 다양하면서도 변경이 필요한 경우 유용하다.
 - 커맨드 발생 시점을 사용자가 커스터마이징해야 할떄 유용하다.
 - 여러 커맨드를 조합하여 하나의 커맨드처럼 사용할 필요가 있을떄 유용하다.
 - 커맨드 실행 취소, 재실행 등의 기능을 구현해야 할때 유용하다.

**3.장단점**

 **#장점**
 
  - 작업을 수행하는 객체와 작업을 요청하는 객체를 분리하기 때문에 SRP 원칙을 잘 지킨다.
  - 기존 코드 수정 없이 새로운 리시버와 커맨드 추가가 가능하기 때문에 OCP 원칙을 잘 지킨다.
  - 커맨드 단위의 별도의 액션 등이 가능하고 커맨드 상속 및 조합을 통해 더 정교한 커맨드를 구현할 수 있다.
 
 **#단점**
 
 - 리시버 객체의 동작이 늘어날 때 마다 커맨드 클래스가 늘어나기 때문에 클래스가 많아진다.

**4.사용라이브러리**

 - 자바: Runnable, 람다, 메소드 레퍼런스 
 - 스프링: SimpleJdbcInsert, SimpleJdbcCall
