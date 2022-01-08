package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//클라이언트가 요청할 LgTV는 @Component 어노테이션으로 처리하고, 의존성 주입 역시 @Autowired로만 처리한다. 하지만 변경될 Speaker만 XML에 bean으로 등록함으로 Speaker교체용이.
@Component("tv")
public class LgTV implements TV {
	//XML설정없이 자바 소스로 하면 해석해야만 관계를 이해할 수 있으므로 불편하다.
//	@Autowired
//	@Qualifier("apple")
//	private Speaker speaker;
	
//	@Resource(name="sony")
//	private Speaker speaker;
	
	//어노테이션을 이용한 XML설정이 없을때와 있을때를 잘 섞어서 쓰는 것이 가장 이상적이다.
	@Autowired
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> LgTV 객체 생성");
	}

	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
	}
	
	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
}
