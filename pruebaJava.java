class Main {
    public static void main(String[] args) {
  
      int a,b;
      String op;
   do{   
      a = Integer.parseInt(System.console().readLine("ingrese el primer numero: "));
  
      b = Integer.parseInt(System.console().readLine("ingrese el segundo numero: "));
  
      System.out.println("¿Que operacion desea realizar?: ");
      System.out.println("\n\n\t[+] Suma\n\t[-] Resta\n\t[*] Multiplicacion\n\t[/] Division\n\t[s]salir\n");
      op = System.console().readLine("opcion: ");

      calculadora2 calcu = new calculadora2(a,b);
      
      switch(op){
      
        case "+":{
           System.out.println(calcu.suma());
          break;
        } 
        case "-":{
           System.out.println(calcu.resta());
          break;
        } 
        case "*":{
           System.out.println(calcu.multi());
          break;
        } 
          case "/":{
           System.out.println(calcu.divi());
          break;
        } 
        case "s":{

          break;
        }
        default:
          System.out.println("\n\ningrese una opcion valida");

        break;
      }
   }while(op == "+" && op == "-" && op == "*" && op == "/");
       System.out.println("Gracias por utilizar el programa :)");
      //
    }
  }
  class calculadora2{
  
    int num_1,num_2;
  
    public calculadora2(int A,int B){
  
      this.num_1 = A;
      this.num_2 = B;
  
      
    }
    public int resta(){
  
      int A = this.num_1 - this.num_2;
      
      return A;
  
      
    }
    public int multi(){
  
      int A = this.num_1 * this.num_2;
  
      return A;
    }
  
     public float divi(){
  
      int A = this.num_1 / this.num_2;
  
  
       return A;
     }
  
     public int suma(){
  
      int A = this.num_1 + this.num_2;
  
       return A;
     }
    
  }
  