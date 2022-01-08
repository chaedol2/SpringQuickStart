package polymorphism;

import org.springframework.stereotype.Component;

//XML에 등록하여 메타인지가 가능하도록 하는것이 이상적이다.
//@Component("apple")
public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker 객체 생성");
	}
	
	public void volumeUp() {
		System.out.println("AppleSpeaker---소리 울린다.");

	}

	public void volumeDown() {
		System.out.println("AppleSpeaker---소리 내린다.");
	}

}
