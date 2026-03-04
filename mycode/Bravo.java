package mycode;
class Bravo extends Alpha{
  String name;
  coid show(){
    System.out.println("Унаследованное имя из Alpha - "+super.name);
    System.out.println("Из класса Bravo - "+name);
  }
  Bravo(String a,String b){
    super();
    super.name = a;
    name = b;
  }
}
