public class Book{
String title;
String author;
int publicationyear;
public Book(String title,String author){
this.title=title;
this.author=author;
this.publicationyear=0;
}
public Book(String title,String author,int publicationyear){
this.title=title;
this.author=author;
this.publicationyear=publicationyear;
}
public Book(String title){
this.title=title;
this.author="unknown";
this.publicationyear=0;
}
public void displayBookinfo(){
System.out.println("title:"+title);
System.out.println("author:"+author);
System.out.println("publicationyear:"+publicationyear);
}
public static void main(String[] args){
Book book1=new Book("the great gatsby","f.scott fitzgerald");
book1.displayBookinfo();
Book book2=new Book("1984","geroge orwell",1949);
book2.displayBookinfo();
Book book3=new Book("to kill a mocking bird");
book3.displayBookinfo();
}
}