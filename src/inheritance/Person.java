package inheritance;

class Person extends Animal{
    String name;
    int age;

//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    void learn(){
        System.out.println("공부를 합니다.");
    };
    void walk(){
        System.out.println("걷습니다.");
    };
    void eat(){
        System.out.println("밥을 먹습니다.");
    };
}