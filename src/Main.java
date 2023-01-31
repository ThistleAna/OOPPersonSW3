public class Main {
    public static void main(String[] args) {
        System.out.println("===== LIST OF THE PERSON LIVING IN ENGLAND 2023 =====");
        // create person 1
        Person p1 = new Person("Ada Lovelace", 25, 156, 45.8);
        // p1.setName("Ada Lovelace"); without method constructor, you fill the name like this
        System.out.println("The first person detail : " + p1.getName() + " " + p1.getAge() + " " + p1.getHeight() + " " + p1.getWeight());
        // PERSON 1 GETTING OLDER
        p1.growOlder();
        System.out.println("One year later : " + p1.getName() + " " + p1.getAge() + " " + p1.getHeight() + " " + p1.getWeight() );

        // person 2 = Bob
        Person p2 = new Person("Joseph Chamberlain",83,182,75.7);
        System.out.println("The second person detail : " + p2.getName() + " " + p2.getAge() + " " + p2.getHeight() + " " + p2.getWeight());

        // person 3 = Jake
        Person p3 = new Person("Jake", 31, 160, 70.5);
        System.out.println("The third person detail : " + p3.getName() + " " + p3.getAge() + " " + p3.getHeight() + " " + p3.getWeight());


        // person 4 : Bence
        Person  p4 = new Person( "Bence", 33 , 176, 95);
        System.out.println("The fourth  person detail: " + p4.getName()+ " " + p4.getAge()+ " "+ p4.getHeight() + " "+p4.getWeight());

        // person 5: Cristine
        Person p5 = new Person("Cristine",30,165,60);
        System.out.println("The fifth person is: " + p5.getName()+  " " + p5.getAge()+ " " + p5.getHeight()+ " "+ p5.getWeight());

        Person p6 = new Person("Laura", 26, 165, 55.5);
        System.out.println("Person 6 details: " + p6.getName() + " - age " + p6.getAge() + ", height " + p6.getHeight() + ", weight " + p6.getWeight());


    }
}
