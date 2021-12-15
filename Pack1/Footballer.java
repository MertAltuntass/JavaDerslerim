package Pack1;

public abstract class Footballer {

    /*
    Nesne tabanlı proglamlamada sınıf hiyerarşisi oluştururken, bazen en tepede bulunan sınıf türünden nesneler,
    programcılar için anlamlı olmayabilir. Hiyerarşinin en tepesinde bulunan sınıfın kendisinden türetilecek,
    olan alt sınıflar için ortak bir arayüz INTERFACE görevi yapması istenebilir.
    Bunun için çözüm olarak oluşturulan metotlara ve sınıflara SOYUT metot ABSTRACT method  ya da,
    soyut sınıf abstract class denir. Soyut sınıflar diğer sınıflara taban olmak için kullanılırlar.
    Nesne türetmezler, önlerine ABSTRACT sözcüğü yazılarak soyutlaştırılırlar.
     */

    String name,surname,clubName,position;
    int age;

    public Footballer(String name, String surname,int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }

    abstract void show();

}
