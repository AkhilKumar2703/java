public class sb {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        name.append("check");
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            name.append(c);
        }
        System.out.println(name.toString());

        name.deleteCharAt(7);
        System.out.println(name.toString());
       System.out.println(name.charAt(7)) ;

       name.setCharAt(7, 'c');
       System.out.println(name.toString());
       System.out.println(name.charAt(7)) ;
       name.replace(0, 5, "helllo");
       System.out.println(name.toString());
       name.reverse();
       System.out.println(name.toString());
        // name.delete(0, name.length());
        // System.out.println(name.toString());

        // name.append('A');
        //  System.out.println(name.toString());



        // name.reverse();
        // System.out.println(name.toString());

    


        


        // name.delete(0, 6);
        // System.out.println(name.toString());
        

    }
}

//