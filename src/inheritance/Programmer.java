package inheritance;

class Programmer extends Person{ // Person 클래스로부터 상속. extends 키워드 사용
    String companyName;

//    public Programmer(String name, int age) {
//        super(name, age);
//    }


//    public Programmer(String name,
//                      int age,
//                      String companyName) {
//        super(name, age);
//        this.companyName = companyName;
//    }

    void coding(){
        System.out.println("코딩을 합니다.");
    };
    void learn() {
        System.out.println("책을 읽습니다.");
    }
}
