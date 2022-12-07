
class counter 
{
static int count;

	counter() 
	{

		count++;

	}

}
class C3
{



	public static void main(String[] args) 
	{


		counter count1 = new counter();

		System.out.println("The value of the counter is " + count1.count);



		counter count2 = new counter();

		System.out.println("The value of the counter is " + count2.count);



		counter count3 = new counter();

		System.out.println("The value of the counter is " + count3.count);



		counter count4 = new counter();

		System.out.println("The value of the counter is " + count4.count);


		counter count5 = new counter();

		System.out.println("The value of the counter is " + count5.count);



	}



}

