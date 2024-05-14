package inheritance;

class Dancer extends Person { // Person 클래스로부터 상속
    String groupName;

    void dancing(){
        System.out.println("춤을 춥니다.");
    };

    void learn() {
        System.out.println("영상을 집중해서 살펴봅니다.");
    }
}
