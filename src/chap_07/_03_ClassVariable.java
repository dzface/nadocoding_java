package chap_07;
// 클래스 변수 배워보기 (static) 전역변수라고도 함
public class _03_ClassVariable {
    public static void main(String[] args) {
        //차사고가 나면 블랙박스 사고영상과 GPS정보를
        //경찰서에 보내는 기능이 있다고 가정
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);
        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        // 특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println(" - 개발 전 -");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport); // 객체.static변수로도 사용 할수 있으나,
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : "+ BlackBox.canAutoReport); //Class명.static변수 사용이 권장 됨

        // 기능 개발 완료
        System.out.println(" - 개발 후 -");
        BlackBox.canAutoReport = true;
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : "+ BlackBox.canAutoReport); // 왜 오류 나는지 모르겠음
    }
}
