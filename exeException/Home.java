public class Home{

	public static void main(String[] args){
   	 try{
		divisao(2,0);
    	}catch(Exception e){
		throw new Exception("Divisao invalida");
   	}
   }

public static float divisao(int n1,int n2){
return n1/n2;
}
}

