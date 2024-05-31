package ex07string;

public class E02StringMethod4 {
	public static void main(String[] args) {
		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		System.out.println("### 시나리오1 ###");
		String jumin1 = "190419-3000000";
		String jumin2 = "190419-4000000";
		
		// 결과가 왜 반대로 나올까나.. (숫자가 아니라 문자열로 했어야 했네..!!)
		System.out.println(jumin1.charAt(7)=='3' ? "남자" : "여자");
		System.out.println(jumin2.charAt(7)=='4' ? "여자" : "남자");
		
		
		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/

		System.out.println("### 시나리오2 ###");
		
		String email = "hong@daum.net";
		System.out.println(email);
		System.out.println(". 포함여부 확인 : "+ email.contains("."));
		System.out.println("@ 포함여부 확인 : "+ email.contains("@"));
		
		System.out.println(email.contains(".") && email.contains("@") ? 
				"이메일 형식 맞음" : "이메일 형식 아님");
		
		
		/*
		시나리오3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()을 
		이용해서 작성하시오.
		*/	
		// 힌트) indexOf로 -의 위치를 찾고 (-의 위치 + 1)이 성별 구분 문자.
		System.out.println("### 시나리오3 ###");
		String juminNum = "190419-3000000";
		
		System.out.println("하이픈 위치 찾기 : "+ juminNum.indexOf("-"));
		int a = juminNum.indexOf("-");
		char gender = juminNum.charAt(a+1);
		System.out.println("7번째 문자 추출 : "+ gender);
		
		// 성별 판단하기
		if(gender=='1' || gender=='3') {
			System.out.println("남자입니다.");
		} 
		else if(gender=='2' || gender=='4') 
			System.out.println("여자입니다.");
		else if(gender=='5' || gender=='6') 
			System.out.println("외국인입니다.");
		else
			System.out.println("주민번호를 잘못 입력하셨습니다.");
		

		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		System.out.println("### 시나리오4 ###");
		String fileName = "my.file.images.jpg";
		
		System.out.println(fileName.lastIndexOf("."));
		int indexNum = fileName.lastIndexOf(".") + 1;
		System.out.println("파일확장자: "+ fileName.substring(indexNum));
		
		
		

	}
}
