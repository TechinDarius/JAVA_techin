public static void main(String[] args) {
    String text = "laaabbaass";
    for (int i = 0; i < text.length(); i++) {
        //String letter = String.valueOf(text.charAt(i));
        if (i > 0 && i < text.length() - 1) {
            if (!String.valueOf(text.charAt(i)).equals(String.valueOf(text.charAt(i + 1))) && !String.valueOf(text.charAt(i)).equals(String.valueOf(text.charAt(i - 1)))) {
                System.out.println(text.charAt(i));
                break;
            }
        } else if (i == 0) {
            if (!String.valueOf(text.charAt(i)).equals(String.valueOf(text.charAt(i + 1)))) {
                System.out.println(text.charAt(i));
            }
        } else {if(!String.valueOf(text.charAt(i)).equals(String.valueOf(text.charAt(i - 1)))){
            System.out.println(text.charAt(i));
        }else {
            System.out.println("Nera tokio!");
        }}

    }

}