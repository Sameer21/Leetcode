
class Backspace_string{
    public static void main(String[] args) {
        
        
    }
    public String build(String t){
        StringBuilder result= new StringBuilder();

        for(char c: t.toCharArray()){
            if(c!='#'){
                result.append(c);

            }
            else if(result.length()>0){
                result.deleteCharAt(result.length()-1);
            }
        }
        return result.toString();
    }
}