public class Main {
    public static void main(String[] args) {
            System.out.println ("HelloWorld!");
            System.out.println ("\"HelloWorld\"");  // HelloWorld в кавычках
            System.out.println ("\\HelloWorld\\"); // HelloWorld и слеш
            System.out.println ("\\\"HelloWorld\"\\"); // HelloWorld + кавычки + слеш
            System.out.println ("\"\\HelloWorld\\\""); //HelloWorld + слеш + кавычки

            byte byteName = -128;
            System.out.println (byteName + " тип переменой byte, разрядность 8 бит");

            short shortName = 32_767;
            System.out.println (shortName + " тип переменой short, разрядность 16 бит");

            int intName = - 2_147_483_648;
            System.out.println (intName + " тип переменной int, разрядность 32 бит");

            long longName = 9_223_372_036_854_775_807l;
            System.out.println (longName + " тип переменной long, разрядность 64 бит");

            float floatName = 248.564f;
            System.out.println (floatName + " тип переменной float, числа с плавающей точкой, разрядность 32 бит");

            double doubleName = 8.35;
            System.out.println (doubleName + " тип переменной double, числа с плавающей точкой, разрядность 64 бит");

            char charName = 500;
            System.out.println (charName + " символьный тип, интерпретируется с таблицей Unicod");

            boolean boolName = (true);
            System.out.println (boolName + " логический тип данных \"истина\" или \"лож\"");

            double a = 45/10;
            System.out.println( a + " результат присвоения переменной \"а\" типа \"double\" значения выражения 45/10. " +
            "Результат \"4\" т.к. числа 45 и 10 по умолчанию типа int" );

            double b = 45/10d;
            System.out.println( b + " результат присвоения переменной \"b\" типа \"double\" значения выражения 45/10d. " +
            "Результат \"4.5\" т.к. в выражении выполнено приведение числа 10 к типу \"double\"");

            ++b;
            System.out.println( b + " - результат операции инкремента переменной b" );

             --b;
            System.out.println( b + " - результат операции декремента переменной b");

            b += 2;
            System.out.println( b + " - увеличиваем переменную b на 2 c помощью операции \"сложение с присвоением\" ");

            b -= 2;
            System.out.println( b + " - уменьшаем переменную b на 2 с помощью операции \" удаление с присвоением\"");

            b *= 2;
            System.out.println( b + " - умножаем переменную b на 2 с помощью операции \"умножение с присвоением\"");

            b /= 2;
            System.out.println( b + " - делим переменную b с помощью операции \"деление с присвоением\"");

            b %= 2;
            System.out.println( b + " - делим переменную b с остатком с присвоением");

            double x, y;
            String z;
            x = 5;
            y = 7;
            z = x > y ? "x больше y" : "x меньше y";
            System.out.println( z + " - сравниваем \"х\" и \"у\" с помощью тернарного оператора");

            boolean c;
            c = b < x && b < y;
            System.out.println( c + " - сравниваем \"b\" с \"x\" и \"y\" используя операцию \"логическое И\"");
            int d = 5;
            int e = 7;
            int f = e ^ d;
            System.out.println( f + " - результат выполнения операции XOR с числами 5 и 7");

            byte h = 0b001 + 0b010;
            System.out.println( h );

            h = 0b001 ^ 0b010;
            System.out.println( h );
            byte k;
            h = 110;
            k = 105;
            System.out.println( Integer. toBinaryString ( h ) );
            System.out.println( Integer. toBinaryString ( ~h ) );
            System.out.println( Integer. toBinaryString ( h & k ) );
            if (x > y) System.out.println( "x больше y " );
            else System.out.println( "x меньше y" );
            int m , n ;
            n = 5;
            for ( m = 0 ; m <= 10 ; m = m + 1)
                    System.out.println( m + " * " + n + " = " +  m * n );



    }
}