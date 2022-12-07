class A {

    A() {
    	System.out.println("I am a conStructor of class A");
    }

}



class B {

    B() {}
}



class C extends A {

    B b = new B();
   
    
    public void m1()
    {
    	
		System.out.println("m1");
	}

}


class C6 {


    public static void main(String[] args) {

        C  c = new C();
        c.m1();

    }


}