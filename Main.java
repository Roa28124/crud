import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void pausar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine();
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<persona> lista = new ArrayList<>();
        int rep=1;
        System.out.println("Presione Enter para iniciar");
     while (rep==1){

         int respuesta=0;
         try {
             scanner.nextLine();
             System.out.print("Bienvenido al sistema, porfavor elija una opcion \n################# \n1-Guardar persona \n2-Mostrar todos \n3-Borrar persona  \n4-Actualizar persona \n5-salir \n ");
             respuesta = scanner.nextInt();
         } catch (InputMismatchException e) {
             scanner.nextLine();
             System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
         }


         switch (respuesta){

            case 1:
                scanner.nextLine();
                String nombre=null;
                while (nombre==null){
                System.out.println("Ingrese su nombre:");
                nombre = scanner.toString();
                try {
                    nombre =validacion.validarLetras(scanner.nextLine());
                } catch (IllegalArgumentException e){
                    System.out.println("El nombre debe contener solo letras");
                    nombre=null;

                } catch (Exception e){
                    System.out.println("Error no controlado, seleccione una opcion nuevamente");

                }
                }
                String apellido=null;
                while (apellido==null) {
                    System.out.println("Ingrese su apellido:");
                     apellido = scanner.toString();

                    try {
                        apellido = validacion.validarLetras(scanner.nextLine());
                    } catch (IllegalArgumentException e) {
                        System.out.println("El apellido debe contener solo letras");
                        apellido=null;


                    } catch (Exception e) {
                        System.out.println("Error no controlado, seleccione una opcion nuevamente");
                        break;


                    }
                }
                float nota=0f;
                while (nota <= 0) {

                    System.out.print("Ingrese la nota: ");

                    try {
                        nota = validacion.validarNota(scanner.nextFloat());
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    } catch (InputMismatchException e) {
                        scanner.nextLine();
                        System.out.println("Solo se pueden ingresar numeros y el decimal debe ser expresado con la coma (,))");
                        nota=0f;
                    } catch (Exception e) {
                        System.out.println("Error no controlado");
                        System.out.println(e.getMessage());
                    }
                }


                lista.add(new persona(nombre,nota,apellido));
                rep=1;
                break;
            case  2:
                if (lista.isEmpty()){
                    System.out.println("No hay nadie agregado");

                }else {
                    for (persona x : lista) {
                        System.out.println(x);
                    }
                    pausar();
                }
                rep=1;
                break;
            case 3:
                if (lista.isEmpty()){
                    System.out.println("No hay nadie agregado");
                    pausar();

                }
                for (persona x : lista) {
                    System.out.println(x);
                }
                scanner.nextLine();
                String nombre2=null;
                while (nombre2==null) {
                    System.out.println("Ingrese el nombre :");
                    nombre2 = scanner.toString();
                    try {
                        nombre2 = validacion.validarLetras(scanner.nextLine());
                    } catch (IllegalArgumentException e) {
                        System.out.println("El nombre debe contener solo letras");
                        nombre2=null;
                    } catch (Exception e) {
                        System.out.println("Error no controlado, seleccione una opcion nuevamente");
                        break;


                    }
                }
                for(int i = 0; i < lista.size(); i++){
                    if (lista.get(i).Nombre.equalsIgnoreCase(nombre2)){
                        lista.remove(i);
                        System.out.println("La persona " + nombre2 + " ha sido eliminada.");
                        pausar();

                    }else {
                        System.out.println("No existe esa persona");
                        pausar();

                    }

                }
                rep=1;
                break;
            case 4:
                if (lista.isEmpty()){
                    System.out.println("No hay nadie agregado");
                    pausar();

                }else {
                    for (persona x : lista) {
                        System.out.println(x);
                    }
                    pausar();

                }
                scanner.nextLine();
                String nombres=null;
                while (nombres==null) {
                    System.out.println("Ingrese el nombre de la persona que desea cambiar: ");
                    nombres = scanner.toString();

                    try {
                        nombres = validacion.validarLetras(scanner.nextLine());
                    } catch (IllegalArgumentException e) {
                        System.out.println("El nombre debe contener solo letras");
                        nombres=null;


                    } catch (Exception e) {
                        System.out.println("Error no controlado, seleccione una opcion nuevamente");
                        break;


                    }
                }
                for (int i= 0; i<lista.size();i++){
                    persona persona=lista.get(i);
                    if (lista.get(i).Nombre.equalsIgnoreCase(nombres)){

                       int t=1;
                       while (t==1) {
                           System.out.println("que desea actualizar \n1-Nombre\n2.Apellido \n3.Nota\n4.Todas\n5.Cancelar ");
                           int r=scanner.nextInt();
                           switch (r) {
                               case 1:

                                   String nombre_nuevo=null;
                                   while (nombre_nuevo==null) {
                                       scanner.nextLine();
                                       System.out.println("Ingrese el nuevo Nombre de " + persona.Nombre);
                                       nombre_nuevo = scanner.toString();
                                       try {
                                           nombre_nuevo = validacion.validarLetras(scanner.nextLine());
                                       } catch (IllegalArgumentException e) {
                                           System.out.println("El nombre debe contener solo letras");
                                           nombre_nuevo=null;

                                       } catch (Exception e) {
                                           System.out.println("Error no controlado, seleccione una opcion nuevamente");
                                           break;
                                       }
                                   }
                                   persona.Nombre = nombre_nuevo;
                                   t=2;
                                   break;

                               case 2:

                                   String apellido_nuevo=null;
                                   while (apellido_nuevo==null) {
                                       scanner.nextLine();
                                       System.out.println("Ingrese el apellido que remplazara a " + persona.Apellido);
                                       apellido_nuevo = scanner.toString();
                                       try {
                                           apellido_nuevo = validacion.validarLetras(scanner.next());
                                       } catch (IllegalArgumentException e) {
                                           System.out.println("El apellido debe contener solo letras");
                                           apellido_nuevo=null;

                                       } catch (Exception e) {
                                           System.out.println("Error no controlado, seleccione una opcion nuevamente");
                                           break;


                                       }
                                   }
                                   persona.Apellido = apellido_nuevo;
                                   t=2;
                                   break;
                               case 3:
                                   scanner.nextLine();
                                   float nota_nueva=0f;
                                   while (nota_nueva<=0) {


                                       System.out.println("Ingrese la nota que remplazara la actual correspondiente a un " + persona.nota);
                                       try {
                                           nota_nueva = validacion.validarNota(scanner.nextFloat());
                                       } catch (IllegalArgumentException e){
                                           System.out.println(e.getMessage());
                                       } catch (InputMismatchException e) {
                                           scanner.nextLine();
                                           System.out.println("Solo se pueden ingresar numeros y el decimal debe ser expresado con la coma (,))");
                                           nota_nueva=0f;
                                       } catch (Exception e) {
                                           System.out.println("Error no controlado");
                                           System.out.println(e.getMessage());
                                       }
                                       persona.nota = nota_nueva;
                                   }
                                   t=2;
                                   break;
                               case 4:

                                   String nombre_nuev=null;
                                   while (nombre_nuev==null) {
                                       scanner.nextLine();
                                       System.out.println("Ingrese el nuevo Nombre de " + persona.Nombre);
                                       nombre_nuev = scanner.toString();
                                       try {
                                           nombre_nuev = validacion.validarLetras(scanner.next());
                                       } catch (IllegalArgumentException e) {
                                           System.out.println("El nombre debe contener solo letras");
                                           nombre_nuev=null;

                                       } catch (Exception e) {
                                           System.out.println("Error no controlado, seleccione una opcion nuevamente");
                                           break;
                                       }
                                   }
                                   persona.Nombre = nombre_nuev;


                                   scanner.nextLine();
                                   String apellido_nuev=null;
                                   while (apellido_nuev==null) {

                                       System.out.println("Ingrese el apellido que remplazara a " + persona.Apellido);
                                       apellido_nuev = scanner.toString();
                                       try {
                                           apellido_nuev = validacion.validarLetras(scanner.next());
                                       } catch (IllegalArgumentException e) {
                                           System.out.println("El apellido debe contener solo letras");
                                           apellido_nuev=null;

                                       } catch (Exception e) {
                                           System.out.println("Error no controlado, seleccione una opcion nuevamente");
                                           break;


                                       }
                                   }
                                   persona.Apellido = apellido_nuev;
                                   System.out.println("Ingrese la nueva nota:");
                                   scanner.nextLine();
                                   float nota_nuev=0f;
                                   while (nota_nuev<=0) {


                                       System.out.println("Ingrese la nota que remplazara la actual correspondiente a un " + persona.nota);
                                       try {
                                            nota_nuev= validacion.validarNota(scanner.nextFloat());
                                       } catch (IllegalArgumentException e){
                                           System.out.println(e.getMessage());
                                       } catch (InputMismatchException e) {
                                           scanner.nextLine();
                                           System.out.println("Solo se pueden ingresar numeros y el decimal debe ser expresado con la coma (,))");
                                           nota_nuev=0f;
                                       } catch (Exception e) {
                                           System.out.println("Error no controlado");
                                           System.out.println(e.getMessage());
                                       }
                                       persona.nota = nota_nuev;
                                   }


                               case 5:
                                   System.out.println("Vuelva pronto :)");
                                   t=2;
                                   break;
                               default:
                                   System.out.println("Opcion invalida intente nuevamente ");
                           }
                       }
                    }

                }


                break;
            case  5:
                scanner.nextLine();
                System.out.println("Vuelva pronto :)");
                rep=2;

                break;
            default:
                System.out.println("La opcion ingresada no es valida, intente nuevamente");
                rep=1;
              break;



        }


     }

    }
}