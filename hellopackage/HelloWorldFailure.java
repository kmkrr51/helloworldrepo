package hellopackage;

public class HelloWorldFailure{


public static void main(String args[]){
	
	printHello();
	
}

public static void printHello() throws Exception{

throw new Exception("Failure in method printHello of HelloWorlFailure class");

}

}