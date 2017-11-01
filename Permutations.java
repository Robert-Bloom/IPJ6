

public class Permutations {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String alph = "abcdefghijklmnopqrstuvwxyz";
        String head = "";
        String tail = alph.substring(0, n);
        printPermutation(head,tail);
    }


        public static void printPermutation(String head, String tail){


           if (tail.length() ==0) {
            System.out.println(head + " ");
        }
            else{
                for(int i =0; i < tail.length(); i++){
                    char c = tail.charAt(i);
                    String newHead = head + c;
                    StringBuffer newTail = new StringBuffer(tail);
                    newTail = newTail.deleteCharAt(i);
//                      String newTail = tail.substring(i+1,tail.length());

//                    System.out.println(newHead+newTail);

                    printPermutation(newHead,newTail.toString());
//                    printPermutation(newHead,newTail);
                }

            }
        }

    }




