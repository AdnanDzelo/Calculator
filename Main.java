import java.util.Scanner;
public class Main {
    public  static  void main (String [] args) {

                int a,b,c;

                Scanner izracunaj = new Scanner(System.in);

                System.out.println ("Unesi prvi broj: ");
                a = izracunaj.nextInt();
                System.out.println ("Unesi drugi broj: ");
                b=izracunaj.nextInt();
                System.out.println ("Unesi operaciju \t\n1=Sabiranje\t\n2=Oduzimanje\t\n3=Mnozenje\t\n4=Deljenje ");
                c=izracunaj.nextInt();
                switch(c){
                    case 1: c=a+b;
                        System.out.println ("rezultat je: "+c);
                        break;

                    case 2: c=a-b;
                        System.out.println ("rezultat je: "+c);
                        break;

                    case 3: c=a*b;
                        System.out.println ("rezultat je: "+c);
                        break;

                    case 4: c=a/b;
                        System.out.println ("Rezultat iznosi: "+c);
                        break;
                    default :
                        System.out.println ("Uneli ste pogresan broj!");
                        break;

                }

            }


        }

