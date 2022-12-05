import java.util.Scanner;
class Solution

{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.print("\n            Таск 2\nВыберите задание от 1 до 10: "); 
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
    System.out.print("\nСоздайте функцию, которая повторяет каждый символ в строке n раз"); 
    
    Scanner in = new Scanner(System.in);
    System.out.print("\nВведите строку на английском: ");
    String text = in.nextLine();
    System.out.print("Введите число n: ");
    int n = in.nextInt();
    StringBuilder repeat = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
        for (int j = 0; j < n; j++) {
            repeat.append(text.charAt(i));
        }
    }
    System.out.println(repeat);
}

public static void two()
{
    System.out.print("\nСоздайте функцию, которая принимает массив и возвращает разницу между самыми большими и самыми маленькими числами"); 

    Scanner input = new Scanner(System.in); 
    System.out.println("\nВведите длину массива: ");
    int size = input.nextInt(); 
    int M[] = new int[size]; 
    System.out.println("Введите элементы массива:");
    for (int i = 0; i < size; i++) {
        M[i] = input.nextInt();  
    }
    System.out.print ("Введенный масив:");
    for (int i = 0; i < size; i++) {
        System.out.print (" " + M[i]); 
    }
		int mx = M[0], mn = M[0];
		for(int i=1; i<M.length; i++) {
		  if (mx < M[i]) mx = M[i];
		  if (mn > M[i]) mn = M[i];
		}
    System.out.println ("\nРазница: "+ (mx - mn));
}

public static void three()
{
    System.out.print("\nСоздайте функцию, которая принимает массив \nв качестве аргумента и возвращает true или false в \nзависимости от того, является ли среднее значение \nвсех элементов массива целым числом или нет"); 
    
    Scanner input = new Scanner(System.in); 
    System.out.println("\nВведите длину массива: ");
    int size = input.nextInt(); 
    int numbers[] = new int[size]; 
    System.out.println("Введите элементы массива:");
    for (int i = 0; i < size; i++) {
        numbers[i] = input.nextInt();  
    }
    System.out.print ("Введенный масив:");
    for (int i = 0; i < size; i++) {
        System.out.print (" " + numbers[i]); 
    }
        
		int sum = 0;
            for (int i = 0;i != numbers.length; i++){
				
                sum += numbers[i];
				
			}
            
			if(sum%numbers.length==0){
				System.out.println ("\n\nTrue");

			}
		else{
			System.out.println ("\n\nFalse");
		}
}

public static void four()
{
    System.out.print("\nСоздайте метод, который берет массив целых чисел и \nвозвращает массив, в котором каждое целое число является \nсуммой самого себя + всех предыдущих чисел в массиве"); 
    
    Scanner input = new Scanner(System.in); 
    System.out.println("\nВведите длину массива: ");
    int size = input.nextInt(); 
    int numbers[] = new int[size]; 
    System.out.println("Введите элементы массива:");
    for (int i = 0; i < size; i++) {
        numbers[i] = input.nextInt();  
    }
    System.out.print ("Введенный масив:");
    for (int i = 0; i < size; i++) {
        System.out.print (" " + numbers[i]); 
    }

		int temp[] = new int[numbers.length];
		int sum = 0;
            for (int i = 0;i != numbers.length; i++){

				temp [i]+= numbers[i]+sum;
                sum += numbers[i];
				
			}
			System.out.println ("\nИзмененный масив:");
			for (int i=0; i!=numbers.length;i++)
			System.out.println (temp[i]);
}

public static void five()
{
    System.out.print("\nСоздайте функцию, которая возвращает число десятичных знаков,\nкоторое имеет число (заданное в виде строки). Любые нули после \nдесятичной точки отсчитываются в сторону количества десятичных знаков"); 
    
    Scanner in = new Scanner(System.in);
    System.out.print("\nВведиет число с запятой: ");
    String str = in.nextLine();

        String[] words = str.split(",");
		System.out.println("Кол-во знаков: " + words[1].length());
}

public static void six()
{
    System.out.print("\nСоздайте функцию, которая при заданном числе возвращает соответствующее число Фибоначчи\n"); 
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
		int n = scanner.nextInt();
		int[] f = new int[n];
		f[0] = 1;
		f[1] = 2;
		for (int i = 2; i < n; ++i) {
    		f[i] = f[i - 1] + f[i - 2];
}
    	System.out.println("Число Фибоначчи: " + f[n-1]);
}

public static void seven()
{
    System.out.print("\nПочтовые индексы состоят из 5 последовательных цифр.\nУчитывая строку, напишите функцию, чтобы определить, \nявляется ли вход действительным почтовым индексом. \nДействительный почтовый индекс выглядит следующим образом"); 
    
    
    Scanner input = new Scanner(System.in);
    System.out.println("\n\nВведите 5-значный почтовый индекс ");
    String zipCode = input.nextLine();

    System.out.println(isValid(zipCode));
}

public static boolean isValid(String zipCode) {
    boolean yes = false;
    // Check that only digits are accepted and the length is equals to 4
    if (zipCode.matches("[0-9]+") && zipCode.length() == 5) {
        yes = true;
    }
    return yes;
}

public static void eight()
{
    System.out.print("\nПара строк образует странную пару, если оба из следующих условий истинны:\n Первая буква 1-й строки = последняя буква 2й строки.\n Последняя буква 1-й строки = первая буква 2-й строки.\n Создайте функцию, которая возвращает true, если пара строк представляет собой \n странную пару, и false в противном случае"); 
    
    Scanner input = new Scanner(System.in);
    System.out.println("\n\nВведите первую строку на английском ");
    String fistString = input.nextLine();
    System.out.println("\n\nВведите вторую строку на английском ");
    String secondString = input.nextLine();

		char[] fArray = fistString.toCharArray();  // помещаем символы строк в массив для удобства сравнения
		char[] sArray = secondString.toCharArray();

        if((fArray[0] == sArray[secondString.length() - 1]) | (sArray[0] == fArray[fistString.length() - 1])) // условия сравнения из задачи. Находим первый символ и последний через длинну строки и вычитаем 1 для нахождения последнего символа в массиве
		{
			System.out.println("\n Результат: true");
		}
		else
		{
			System.out.println("\nРезультат: false");
		}
}

public static void nine()
{
    System.out.print("\nСоздайте две функции: isPrefix(word, prefix-) и isSuffix (word, -suffix).\nisPrefix должен возвращать true, если он начинается с префиксного аргумента.\nisSuffix должен возвращать true, если он заканчивается аргументом суффикса.\nВ противном случае верните false"); 
    
    Scanner input = new Scanner(System.in);
    System.out.println("\n\nВведите строку на английском ");
    String Str = input.nextLine();
    Str.toLowerCase();

    System.out.print("\nInput a suffix or prefix: ");
    String name1 = input.nextLine();
    name1.toLowerCase();
    if(name1.startsWith("")){
        System.out.println("Пустое значение"); }

    else if (name1.endsWith("-")){
        name1 = name1.replace("-","");
        System.out.println("Prefix " + Str.startsWith(name1) );
    }
    else{
        name1 = name1.replace("-","");
        System.out.println("Suffix " + Str.endsWith(name1) );
}
}

public static void ten()
{
    System.out.print("\nКак указано в онлайн-энциклопедии целочисленных последовательностей:\nГексагональная решетка - это привычная двумерная решетка, в которой каждая точка имеет 6 соседей.\nЦентрированное шестиугольное число - это центрированное фигурное число, представляющее шестиугольник \nс точкой в центре и всеми другими точками, окружающими центральную точку в шестиугольной решетке\n\n"); 

    String resault = ""; 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
		int number = scanner.nextInt();

        if(((3 + Math.sqrt(12 * number - 3)) / 6) % 1 != 0) 
			System.out.println("Invalid");
        
		else{	
		int temp = (int)((3 + Math.sqrt(12 * number - 3)) / 6); 
        int heightOfHex = temp + temp - 1; 

        for(int i = 0; i < heightOfHex;){
            
            int repeatTimes = Math.abs(++i - temp);
            resault += " ".repeat(repeatTimes);
            resault += "o ".repeat(heightOfHex - repeatTimes);
            resault += "\n";
        }
		System.out.println(resault);
	}
}
}