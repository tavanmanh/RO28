package entity.Exercise4;

import entity.Exercise1.Insert;

public class ex4 {
    public static void main(String[] args) throws Exception {
        //Ques1
        IOManager io= new IOManager();
//        String path = Insert.inputString();
//        io.readFile(path);

        //Ques2
        String name = Insert.inputString();
        String str = Insert.inputString();

        io.writeFile(name,str,true);

    }

}
