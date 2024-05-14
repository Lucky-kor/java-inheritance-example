package inheritance;

class Singer extends Person { // Person 클래스로부터 상속
    String bandName;

    void singing(){
        System.out.println("노래합니다.");
    };
    void playGuitar(){
        System.out.println("기타를 칩니다.");
    };
    void learn() {
        System.out.println("소리를 내면서 기억합니다.");
    }
}
