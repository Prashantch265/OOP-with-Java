package dipesh;

//We have a large inventory of things in our warehouse falling in the category:apperal and the slightly more in demand category:makeup along with the category:furniture and --"
class Test1 {
    public static void main(String[] args) {
        String mystring = "We have a large inventory of things in our warehouse falling in the category:apperal"
                + " and the slightly more in demand category:makeup along with the category:furniture and --";
        String searchparam = "category:";
        int index = 0;
        while (true) {
            index = mystring.indexOf(searchparam, index);
            if (index == -1)
                break;
            int startindex = index + searchparam.length();
            int endindex = mystring.indexOf(" ", startindex);
            System.out.println(mystring.substring(startindex, endindex));
            index = endindex + 1;
        }

    }
}