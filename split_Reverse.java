public class slit_Reverse {
   public static void main(String[] args) {
      String str = "the big cat jumped over the lazy dog";    
int order[]={7,0,6,1,5,2,4,3};
   String words[] = str.split(" ");  
  String reverseStr="";
     for(String word : words)
      {   string reverseWord="";
              for (int i = word.length()-1; i >= 0; i--) 
	            {  
                    reverseWord+=word.charAt(i);   
               }    
            reverseStr+= reverseWord+" ";
       }
String reverse_Words[] = reverseStr.split(" ");  
       for(int i : order){
        System.out.println(reverse_Words[i]);
}}
}
