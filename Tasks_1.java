import java.util.Scanner;
class Solution

{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.print("\n            Таск 1\nВыберите задание от 1 до 10: "); 
int x = in.nextInt();

switch (x) {
    case  (1):
    one();
            break;
    case  (2):
    two();
            break;
    case  (3):
    three();
            break;        
    case  (4):
    four();
            break;
    case  (5):
    five();
            break;
    case  (6):
    six();
            break;
    case  (7):
    seven();
        break;
    case  (8):
    eight();
            break;        
    case  (9):
    nine();
            break;
    case  (10):
    ten();
            break;
    }

}

public static void one()
{
    System.out.print("\nДва числа передаются в качестве параметров.Первый параметр, разделенный на второй параметр, будет иметь остаток, возможно, ноль. Верните это значение"); 
    
    Scanner in = new Scanner(System.in);
    System.out.print("\n\n  Input a number 1: ");
    int num1 = in.nextInt();
    System.out.print("  Input a number 2: ");
    int num2 = in.nextInt();
    System.out.println("Остаток от деления: " + (num1 % num2));
}

public static void two()
{
    System.out.print("\nНапишите функцию, которая принимает основание и высоту треугольника и возвращает его площадь"); 
    
    Scanner in = new Scanner(System.in);
        System.out.print("\nВведите основание: ");
        int num1 = in.nextInt();
		System.out.print("Введите высоту: ");
        int num2 = in.nextInt();

		System.out.println("Площадь треугольника: " + (num1 * num2)*0.5 );
}

public static void three()
{
    System.out.print("\nВы должны реализовать функцию, которая возвращает общее количество ног всех животных \nchickens = 2 legs \ncows = 4 legs \npigs = 4 legs"); 
    
    Scanner in = new Scanner(System.in);
        System.out.print("\nВведите кол-во куриц: ");
        int num1 = in.nextInt();
		num1=num1*2;
		System.out.print("Введите кол-во коров: ");
        int num2 = in.nextInt();
		num2=num2*4;
		System.out.print("Введите кол-во свиней: ");
        int num3 = in.nextInt();
		num3=num3*4;

		System.out.println("Суммарно ног: " + (num1 +num2 + num3) );
}

public static void four()
{
    System.out.print("\nСоздайте функцию, которая принимает три аргумента (prob, prize, pay) \nи возвращает true, если prob * prize > pay; в противном случае возвращает false"); 
    
    Scanner in = new Scanner(System.in);
        System.out.print("\nprob: ");
        double prob = in.nextDouble();
		
		System.out.print("prize: ");
        double prize = in.nextDouble();
		
		System.out.print("pay: ");
        double pay = in.nextDouble();
		boolean flag;

		if ((prob*prize)>pay){
			flag=true;
			System.out.println(flag );}
		else {
		flag=false;
		System.out.println( flag );}
}

public static void five()
{
    System.out.print("\nНапишите функцию, которая принимает 3 числа и возвращает, \nчто нужно сделать с a и b: они должны быть сложены, вычитаны,\nумножены или разделены, чтобы получить N. Если ни одна из операций \nне может дать N, верните 'none'.\n3 числа это N, a и b"); 
    
    Scanner in = new Scanner(System.in);
        System.out.print("\nInput n: ");
        int n = in.nextInt();
		System.out.print("Input a : ");
        int a = in.nextInt();
		System.out.print("Input b: ");
        int b = in.nextInt();
        
        double x1=a+b;
        double x2=a-b;
        double x3=a/b;
        double x4=a*b;
        
		if(x1==n){
            
			System.out.println("Сложение");
		}
		else if(x2==n){
			System.out.println("Вычитание");
		}
		else if(x3==n){
			System.out.println("Деление");
		}
		else if(x4==n){
			System.out.println("Умножение");
		}
		else{
			System.out.println("None");

		System.out.println();
}
}
public static void six()
{
    System.out.print("\nСоздайте функцию, которая возвращает значение ASCII переданного символа"); 
    
    Scanner in = new Scanner(System.in);
        System.out.print("\nInput: ");
        char c = in.next().charAt(0);

		System.out.println("Значение ASCII: "+(int)c);
}

public static void seven()
{
    System.out.print("\nНапишите функцию, которая берет последнее число из последовательного списка чисел и возвращает сумму всех чисел до него и включая его"); 
    
    Scanner in = new Scanner(System.in);
        System.out.print("\nInput a number: ");
        int n = in.nextInt();
		int sum=0;
		int count = 1;
        while (count <= n) {
			sum=sum+count;
            count++;
        }
		System.out.println("Count is: " + sum);
}

public static void eight()
{
    System.out.print("\nСоздайте функцию, которая находит максимальное значение третьего ребра треугольника, где длины сторон являются целыми числами"); 
    
    Scanner in = new Scanner(System.in);
        System.out.print("\nInput a number 1: ");
        int num1 = in.nextInt();
		System.out.print("Input a number 2: ");
        int num2 = in.nextInt();

		System.out.println((num1 + num2)-1);
}

public static void nine()
{
    System.out.print("\nСоздайте функцию, которая принимает массив чисел и возвращает сумму его кубов"); 
    
    Scanner input = new Scanner(System.in); 
    System.out.println("\nВведите длину массива: ");
    int size = input.nextInt(); 
    int array[] = new int[size]; 
    System.out.println("Введите элементы массива:");
    
    for (int i = 0; i < size; i++) {
        array[i] = input.nextInt();  
    }
    System.out.print ("Введенный масив:");
    for (int i = 0; i < size; i++) {
        System.out.print (" " + array[i]); 
    }
		int sum = 0;
            for (int i = 0; i < array.length; i++){
                sum += array[i] * array[i] * array[i];}
		System.out.println ("\nСумма кубов: "+sum);
}

public static void ten()
{
    System.out.print("\nСоздайте функцию, которая будет для данного a, b, c выполнять следующие действия:\nДобавьте A к себе B раз. \nПроверьте, делится ли результат на C"); 
    Scanner input = new Scanner(System.in);
    int numbers[] = new int[3]; 
    System.out.println("\nВведите a, b, c по очереди:");
    
    for (int i = 0; i < 3; i++) {
        numbers[i] = input.nextInt();  
    }
		int sum = 0;
		int temp = numbers[0];
            for (int i = 0;i != numbers[1]; i++){
				
                sum += temp+temp;
				temp = sum;
			}

			if(sum%numbers[2]==0){
				System.out.println ("\nРезультат делится на "+numbers[2]);

			}
		else{
			System.out.println ("\nРезультат не делится на "+numbers[2]);
}
}


}