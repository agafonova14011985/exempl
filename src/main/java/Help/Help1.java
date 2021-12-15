package Help;
import java.io.IOException;
import java.util.Scanner;
public class Help1 {

    public static void main(String[] args) throws IOException {
        stringHelp();
    }
   public static void stringHelp() throws IOException {
       char ch, ignore;
       for (; ; ) {
           do {
               System.out.println("Справка о управляющих инструкциях Java:");
               System.out.println("1 - if");
               System.out.println("2 - switch");
               System.out.println("3 - for");
               System.out.println("4 - while");
               System.out.println("5 - do-while");
               System.out.println("6 - break");
               System.out.println("7 - continue");
               System.out.println("Для выхода нажмите >> g");
               System.out.printf("Введи число >>");
               ch = (char) System.in.read();

               do {
                   ignore = (char) System.in.read();
               }
               while (ignore != '\n');
           } while
           (ch < '1' | ch > '7' & ch != 'g');
           if ( ch == 'g') break;
           System.out.println("\n");
           switch (ch) {
               case '1':
                   System.out.println("Инструкция if:\n " +
                           "if (условие) инструкция;\n " +
                           "else инструкция");
                   break;
               case '2':
                   System.out.println("Инструкция switch:\n" +
                           "switch (выражение) \n" +
                           "{\n" +
                           "case 'константа':\n" +
                           "последовательность инструкций;\n" +
                           "break; \n}");
                   break;
               case '3':
                   System.out.println("Инструкция цикла for:\n" +
                           "for(инициализация; условие; интерация)\n" +
                           "инструкция;");
                   break;
               case '4':
                   System.out.println("Инструкция цикла while:\n" +
                           "while(условие)\n" +
                           "инструкция;");
                   break;
               case '5':
                   System.out.println("Инструкция цикла do-while:\n" +
                           "do {\n" +
                           "инструкция;\n" +
                           "} while (условие);");
                   break;
               case '6':
                   System.out.println("Инструкция break:\n" +
                           "break; \n или\n" +
                           " break и метка;");
                   break;
               case '7':
                   System.out.println("Инструкция continue:\n" +
                           "continue;\n" +
                           "или\n" +
                           "continue и метка;");

                   break;
           }
           System.out.println("\nМожете еще раз воспользоваться справкой");
       }
   }
    }



