import java.util.ArrayList;

class Main{

  public static void main(String[] args){

    ArrayList<String> list = new ArrayList<>();
    list.add("hello");
    list.add("hola");
    list.add("hallo");
    list.add("que paso");
    list.add("como");

    test(list);  

    System.out.println(list); //[duo, hola, hallo, que paso, tech]

    ArrayList<String> list2 = new ArrayList<>();
    list2.add("hello");
    list2.add("como");

    test(list2);  

    System.out.println(list2); //[duo,tech]
    
   
  }



	public static void test(ArrayList<String> words){
		for(int i = 0; i < words.size(); i++){

            if(words.get(i).equals("hello")){
                words.set(i, "duo");
            }else if(words.get(i).equals("como")){
                words.set(i, "tech");
            }

		
	}
}
  
}